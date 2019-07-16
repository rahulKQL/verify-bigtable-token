package com.google.check.bigtable.token;

import com.google.cloud.bigtable.beam.CloudBigtableIO;
import com.google.cloud.bigtable.beam.CloudBigtableScanConfiguration;
import com.google.cloud.bigtable.config.Logger;
import com.google.cloud.bigtable.hbase.BigtableConfiguration;
import com.google.cloud.bigtable.hbase.BigtableOptionsFactory;
import java.io.IOException;
import org.apache.beam.runners.dataflow.DataflowRunner;
import org.apache.beam.runners.dataflow.options.DataflowPipelineOptions;
import org.apache.beam.runners.direct.DirectRunner;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.Read;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.metrics.Counter;
import org.apache.beam.sdk.metrics.Metrics;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Count;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.filter.FirstKeyOnlyFilter;
import org.apache.hadoop.hbase.shaded.org.mortbay.log.Log;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BigtableDataFlowTest {

  private static final Logger LOG = new Logger(BigtableDataFlowTest.class);

  private static final String stagingLoc = "gs://grass-clump-479/rahul-bigtable-test";

  static final String projectId = "grass-clump-479";
  static final String instanceId = "endurance";
  static final String tableName = "BeamCloudBigtableIOIntegrationTest";

  // Converts a Long to a String so that it can be written to a file.
  static DoFn<Long, String> stringifier =
      new DoFn<Long, String>() {
        private static final long serialVersionUID = 1L;

        private Counter rowCounter = Metrics.counter(BigtableDataFlowTest.class, "count_row");

        @ProcessElement
        public void processElement(DoFn<Long, String>.ProcessContext context) throws Exception {
          LOG.info("out:  " + context.element());
          context.output(context.element().toString());
        }
      };

  @Test
  public void testBigtableAuth() throws IOException {
    Configuration config = BigtableConfiguration.configure(projectId, instanceId);
    try (Connection conn = BigtableConfiguration.connect(config);
        Admin admin = conn.getAdmin()) {
      if (admin.tableExists(TableName.valueOf(tableName))) {
        LOG.info("You have bigtable access");
      }
    }
  }

  @Test
  public void testBigtableDirectRunner() {
    PipelineOptions options = createOptions();
    options.setRunner(DirectRunner.class);
    dataflowForBigtable(options);
  }

  @Test
  public void testBigtableDataFlowRunner() {
    PipelineOptions options = createOptions();
    options.setRunner(DataflowRunner.class);
    dataflowForBigtable(options);
  }

  private void dataflowForBigtable(PipelineOptions options) {
    LOG.info("Started Creating Pipeline to with " + options.getRunner());
    options.setJobName("testReadFromBigtable-" + System.currentTimeMillis());
    LOG.info("Started readFromBigtable test with jobName as: %s", options.getJobName());

    Scan scan = new Scan();
    scan.setFilter(new FirstKeyOnlyFilter());

    CloudBigtableScanConfiguration config =
        new CloudBigtableScanConfiguration.Builder()
            .withProjectId(projectId)
            .withInstanceId(instanceId)
            .withTableId(tableName)
            .withScan(scan)
            .withConfiguration(
                BigtableOptionsFactory.BIGTABLE_HOST_KEY, "batch-bigtable.googleapis.com")
            .withConfiguration(
                BigtableOptionsFactory.BIGTABLE_ADMIN_HOST_KEY, "bigtableadmin.googleapis.com")
            .build();

    Pipeline pipeLine = Pipeline.create(options);

    pipeLine
        .apply("Read from BT", Read.from(CloudBigtableIO.read(config)))
        .apply("Count", Count.<Result>globally())
        .apply("Cast to String", ParDo.of(stringifier))
        .apply("Write to File", TextIO.write().to("bigtable-count-"))
        .getPipeline()
        .run()
        .waitUntilFinish();

    Log.info("finished");
  }

  private DataflowPipelineOptions createOptions() {
    DataflowPipelineOptions options = PipelineOptionsFactory.as(DataflowPipelineOptions.class);
    options.setProject(projectId);
    options.setStagingLocation(stagingLoc + "/stage");
    options.setTempLocation(stagingLoc + "/temp");
    return options;
  }
}
