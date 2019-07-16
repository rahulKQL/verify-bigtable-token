# Verify Bigtable Token


## Instruction to run
This is just a sample project to run Dataflow jobs using cloud-bigtable-client.

1. To confirm your bigtable access run this
    ```sh
    mvn -Dtest=BigtableDataFlowTest#testBigtableAuth test
    ```    
2. Run bigtable dataflow job with DirectRunner (error logs for [1.11.0](./Test_run.md#directrunner-logs) & [1.11.1-SNAPSHOT](./Test_run.md#after-removing-serviceaccountjwtaccesscredentials))
    ```sh
    mvn -Dtest=BigtableDataFlowTest#testBigtableDirectRunner test
    ```
3. Run bigtable dataflow job with DataFlowRunner (logs with latest release [1.11.0](./Test_run.md#dataflowrunner-logs))
   ```sh
   mvn -Dtest=BigtableDataFlowTest#testBigtableDataFlowRunner test
   ```