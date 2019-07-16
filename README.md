# Verify Bigtable Token


This is just a sample project to run Dataflow jobs using cloud-bigtable-client.

1. To confirm your bigtable access run this
    ```sh
    mvn -Dtest=BigtableDataFlowTest#testBigtableAuth test
    ```    
2. Run bigtable dataflow job with DirectRunner
    ```sh
    mvn -Dtest=BigtableDataFlowTest#testBigtableDirectRunner test
    ```
3. Run bigtable dataflow job with DirectRunner
   ```sh
   mvn -Dtest=BigtableDataFlowTest#testBigtableDataFlowRunner test
   ```