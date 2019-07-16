## Unauthentication issue

Logs after running the bigtable dataflow jobs, I have verified the same issue on other system beside mine.

  ### DirectRunner logs:
    Rahuls-MBP:Verify-Bigtable-Token rahul$ mvn -Dtest=BigtableDataFlowTest#testBigtableDirectRunner test
    [INFO] Scanning for projects...
    [WARNING] 
    [WARNING] Some problems were encountered while building the effective model for com.google.check.bigtable.token:Verify-Bigtable-Token:jar:1.0-SNAPSHOT
    [WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 70, column 21
    [WARNING] 
    [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
    [WARNING] 
    [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
    [WARNING] 
    [INFO] 
    [INFO] -------< com.google.check.bigtable.token:Verify-Bigtable-Token >--------
    [INFO] Building Verify-Bigtable-Token 1.0-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Verify-Bigtable-Token ---
    [WARNING] Using platform encoding (US-ASCII actually) to copy filtered resources, i.e. build is platform dependent!
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Verify-Bigtable-Token ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Verify-Bigtable-Token ---
    [WARNING] Using platform encoding (US-ASCII actually) to copy filtered resources, i.e. build is platform dependent!
    [INFO] skip non existing resourceDirectory /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/src/test/resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Verify-Bigtable-Token ---
    [INFO] Changes detected - recompiling the module!
    [WARNING] File encoding has not been set, using platform encoding US-ASCII, i.e. build is platform dependent!
    [INFO] Compiling 3 source files to /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/target/test-classes
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Verify-Bigtable-Token ---
    [INFO] Surefire report directory: /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/target/surefire-reports
    
    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running com.google.check.bigtable.token.BigtableDataFlowTest
    SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
    SLF4J: Defaulting to no-operation (NOP) logger implementation
    SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
    2019-07-16 19:49:57 INFO  BigtableDataFlowTest:89 - Started Creating Pipeline to with DirectRunner
    2019-07-16 19:49:57 INFO  BigtableDataFlowTest:89 - Started readFromBigtable test with jobName as: testReadFromBigtable-1563286797836
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Opening session for projectId grass-clump-479, instanceId endurance, on data host batch-bigtable.googleapis.com, admin host bigtableadmin.googleapis.com.
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Bigtable options: BigtableOptions{dataHost=batch-bigtable.googleapis.com, adminHost=bigtableadmin.googleapis.com, port=443, projectId=grass-clump-479, instanceId=endurance, appProfileId=, userAgent=hbase-1.2.6,HBaseBeam, credentialType=DefaultCredentials, dataChannelCount=32, retryOptions=RetryOptions{retriesEnabled=true, allowRetriesWithoutTimestamp=false, statusToRetryOn=[UNAVAILABLE, ABORTED, DEADLINE_EXCEEDED, UNAUTHENTICATED], initialBackoffMillis=5000, maxElapsedBackoffMillis=300000, backoffMultiplier=1.5, streamingBufferSize=60, readPartialRowTimeoutMillis=60000, maxScanTimeoutRetries=3}, bulkOptions=BulkOptions{asyncMutatorCount=0, useBulkApi=true, bulkMaxKeyCount=125, bulkMaxRequestSize=1048576, autoflushMs=0, maxInflightRpcs=320, maxMemory=190893260, enableBulkMutationThrottling=false, bulkMutationRpcTargetMs=100}, callOptionsConfig=CallOptionsConfig{useTimeout=false, shortRpcTimeoutMs=60000, longRpcTimeoutMs=600000}, usePlaintextNegotiation=false, useCachedDataPool=true, useBatch=true, useGCJClient=false}.
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:49:59 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:50:05 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #1, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 1.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=1)
    2019-07-16 19:50:10 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #2, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 2.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=2)
    2019-07-16 19:50:18 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #3, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 3.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=3)
    2019-07-16 19:50:29 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #4, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 4.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=4)
    2019-07-16 19:50:46 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #5, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 5.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=5)
    2019-07-16 19:51:12 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #6, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 6.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=6)
    2019-07-16 19:51:50 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #7, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 7.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=7)
    2019-07-16 19:52:47 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #8, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 8.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=8)
    2019-07-16 19:53:48 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #9, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 9.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=9)
    2019-07-16 19:54:48 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #10, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 10.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=10)
    2019-07-16 19:55:49 ERROR AbstractRetryingOperation:157 - All retries were exhausted. Failure #11, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 11.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=11)
    Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 352.15 sec <<< FAILURE!
    testBigtableDirectRunner(com.google.check.bigtable.token.BigtableDataFlowTest)  Time elapsed: 351.991 sec  <<< ERROR!
    org.apache.beam.sdk.Pipeline$PipelineExecutionException: com.google.bigtable.repackaged.io.grpc.StatusRuntimeException: UNAUTHENTICATED: Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project.
            at org.apache.beam.sdk.Pipeline.run(Pipeline.java:319)
            at org.apache.beam.sdk.Pipeline.run(Pipeline.java:299)
            at com.google.check.bigtable.token.BigtableDataFlowTest.dataflowForBigtable(BigtableDataFlowTest.java:115)
            at com.google.check.bigtable.token.BigtableDataFlowTest.testBigtableDirectRunner(BigtableDataFlowTest.java:77)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:498)
            at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
            at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
            at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
            at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
            at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
            at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
            at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
            at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
            at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
            at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
            at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
            at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
            at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
            at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:242)
            at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:137)
            at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:498)
            at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)
            at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)
            at org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)
            at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)
            at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)
    Caused by: com.google.bigtable.repackaged.io.grpc.StatusRuntimeException: UNAUTHENTICATED: Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project.
            at com.google.bigtable.repackaged.io.grpc.Status.asRuntimeException(Status.java:521)
            at com.google.bigtable.repackaged.com.google.cloud.bigtable.grpc.async.AbstractRetryingOperation.getBlockingResult(AbstractRetryingOperation.java:446)
            at com.google.bigtable.repackaged.com.google.cloud.bigtable.grpc.BigtableDataGrpcClient.sampleRowKeys(BigtableDataGrpcClient.java:330)
            at com.google.bigtable.repackaged.com.google.cloud.bigtable.grpc.BigtableDataClientWrapper.sampleRowKeys(BigtableDataClientWrapper.java:148)
            at com.google.cloud.bigtable.batch.common.CloudBigtableServiceImpl.getSampleRowKeys(CloudBigtableServiceImpl.java:31)
            at com.google.cloud.bigtable.beam.CloudBigtableIO$AbstractSource.getSampleRowKeys(CloudBigtableIO.java:284)
            at com.google.cloud.bigtable.beam.CloudBigtableIO$Source.getSampleRowKeys(CloudBigtableIO.java:410)
            at com.google.cloud.bigtable.beam.CloudBigtableIO$Source.getEstimatedSizeBytes(CloudBigtableIO.java:472)
            at org.apache.beam.runners.direct.BoundedReadEvaluatorFactory$InputProvider.getInitialInputs(BoundedReadEvaluatorFactory.java:212)
            at org.apache.beam.runners.direct.ReadEvaluatorFactory$InputProvider.getInitialInputs(ReadEvaluatorFactory.java:89)
            at org.apache.beam.runners.direct.RootProviderRegistry.getInitialInputs(RootProviderRegistry.java:76)
    
    
    Results :
    
    Tests in error: 
      testBigtableDirectRunner(com.google.check.bigtable.token.BigtableDataFlowTest): com.google.bigtable.repackaged.io.grpc.StatusRuntimeException: UNAUTHENTICATED: Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project.
    
    Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD FAILURE
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 05:55 min
    [INFO] Finished at: 2019-07-16T19:55:49+05:30
    [INFO] ------------------------------------------------------------------------
    [ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project Verify-Bigtable-Token: There are test failures.
    [ERROR] 
    [ERROR] Please refer to /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/target/surefire-reports for the individual test results.
    [ERROR] -> [Help 1]
    [ERROR] 
    [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
    [ERROR] Re-run Maven using the -X switch to enable full debug logging.
    [ERROR] 
    [ERROR] For more information about the errors and possible solutions, please read the following articles:
    [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException



  ### DataFlowRunner logs:
  
   Dataflow jobs log can be traced at [here](https://console.cloud.google.com/dataflow/jobsDetail/locations/us-central1/jobs/2019-07-16_07_02_07-17912584438165984517?project=grass-clump-479)
  

    Rahuls-MBP:Verify-Bigtable-Token rahul$ mvn -Dtest=BigtableDataFlowTest#testBigtableDataFlowRunner test
    [INFO] Scanning for projects...
    [WARNING] 
    [WARNING] Some problems were encountered while building the effective model for com.google.check.bigtable.token:Verify-Bigtable-Token:jar:1.0-SNAPSHOT
    [WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 70, column 21
    [WARNING] 
    [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
    [WARNING] 
    [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
    [WARNING] 
    [INFO] 
    [INFO] -------< com.google.check.bigtable.token:Verify-Bigtable-Token >--------
    [INFO] Building Verify-Bigtable-Token 1.0-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Verify-Bigtable-Token ---
    [WARNING] Using platform encoding (US-ASCII actually) to copy filtered resources, i.e. build is platform dependent!
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Verify-Bigtable-Token ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Verify-Bigtable-Token ---
    [WARNING] Using platform encoding (US-ASCII actually) to copy filtered resources, i.e. build is platform dependent!
    [INFO] skip non existing resourceDirectory /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/src/test/resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Verify-Bigtable-Token ---
    [INFO] Changes detected - recompiling the module!
    [WARNING] File encoding has not been set, using platform encoding US-ASCII, i.e. build is platform dependent!
    [INFO] Compiling 3 source files to /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/target/test-classes
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Verify-Bigtable-Token ---
    [INFO] Surefire report directory: /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/target/surefire-reports
    
    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running com.google.check.bigtable.token.BigtableDataFlowTest
    SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
    SLF4J: Defaulting to no-operation (NOP) logger implementation
    SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
    2019-07-16 19:26:47 INFO  BigtableDataFlowTest:89 - Started Creating Pipeline to with DataFlowRunner
    2019-07-16 19:26:47 INFO  BigtableDataFlowTest:89 - Started readFromBigtable test with jobName as: testReadFromBigtable-1563285407439
    2019-07-16 19:26:54 INFO  BigtableSession:89 - Opening session for projectId grass-clump-479, instanceId endurance, on data host batch-bigtable.googleapis.com, admin host bigtableadmin.googleapis.com.
    2019-07-16 19:26:54 INFO  BigtableSession:89 - Bigtable options: BigtableOptions{dataHost=batch-bigtable.googleapis.com, adminHost=bigtableadmin.googleapis.com, port=443, projectId=grass-clump-479, instanceId=endurance, appProfileId=, userAgent=hbase-1.2.6,HBaseBeam, credentialType=DefaultCredentials, dataChannelCount=32, retryOptions=RetryOptions{retriesEnabled=true, allowRetriesWithoutTimestamp=false, statusToRetryOn=[UNAVAILABLE, DEADLINE_EXCEEDED, ABORTED, UNAUTHENTICATED], initialBackoffMillis=5000, maxElapsedBackoffMillis=300000, backoffMultiplier=1.5, streamingBufferSize=60, readPartialRowTimeoutMillis=60000, maxScanTimeoutRetries=3}, bulkOptions=BulkOptions{asyncMutatorCount=0, useBulkApi=true, bulkMaxKeyCount=125, bulkMaxRequestSize=1048576, autoflushMs=0, maxInflightRpcs=320, maxMemory=190893260, enableBulkMutationThrottling=false, bulkMutationRpcTargetMs=100}, callOptionsConfig=CallOptionsConfig{useTimeout=false, shortRpcTimeoutMs=60000, longRpcTimeoutMs=600000}, usePlaintextNegotiation=false, useCachedDataPool=true, useBatch=true, useGCJClient=false}.
    2019-07-16 19:26:54 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:26:55 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 19:27:01 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #1, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 1.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=1)
    2019-07-16 19:27:06 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #2, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 2.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=2)
    2019-07-16 19:27:14 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #3, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 3.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=3)
    2019-07-16 19:27:25 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #4, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 4.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=4)
    2019-07-16 19:27:42 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #5, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 5.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=5)
    2019-07-16 19:28:08 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #6, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 6.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=6)
    2019-07-16 19:28:46 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #7, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 7.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=7)
    2019-07-16 19:29:43 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #8, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 8.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=8)
    2019-07-16 19:30:44 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #9, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 9.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=9)
    2019-07-16 19:31:44 WARN  AbstractRetryingOperation:130 - Retrying failed call. Failure #10, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 10.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=10)
    2019-07-16 19:32:01 ERROR AbstractRetryingOperation:157 - All retries were exhausted. Failure #11, got: Status{code=UNAUTHENTICATED, description=Request had invalid authentication credentials. Expected OAuth 2 access token, login cookie or other valid authentication credential. See https://developers.google.com/identity/sign-in/web/devconsole-project., cause=null} on channel 11.
    Trailers: Metadata(www-authenticate=Bearer realm="https://accounts.google.com/",bigtable-channel-id=11)
    Dataflow SDK version: 2.11.0
    Submitted job: 2019-07-16_07_02_07-17912584438165984517

    
  ### After removing ServiceAccountJwtAccessCredentials
   
   This test is ran on snapshot build of Cloud-bigtable-client after commenting out [ServiceAccountJwtAccessCredentials initialization](https://github.com/googleapis/cloud-bigtable-client/blob/master/bigtable-client-core-parent/bigtable-client-core/src/main/java/com/google/cloud/bigtable/config/CredentialFactory.java#L201-L203), Basically forcing OAuth2Credential instead of Jwt. It runs **successfully**.
 
    Rahuls-MBP:Verify-Bigtable-Token rahul$ mvn -Dtest=BigtableDataFlowTest#testBigtableDirectRunner test
    [INFO] Scanning for projects...
    [WARNING] 
    [WARNING] Some problems were encountered while building the effective model for com.google.check.bigtable.token:Verify-Bigtable-Token:jar:1.0-SNAPSHOT
    [WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 70, column 21
    [WARNING] 
    [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
    [WARNING] 
    [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
    [WARNING] 
    [INFO] 
    [INFO] -------< com.google.check.bigtable.token:Verify-Bigtable-Token >--------
    [INFO] Building Verify-Bigtable-Token 1.0-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Verify-Bigtable-Token ---
    [WARNING] Using platform encoding (US-ASCII actually) to copy filtered resources, i.e. build is platform dependent!
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Verify-Bigtable-Token ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Verify-Bigtable-Token ---
    [WARNING] Using platform encoding (US-ASCII actually) to copy filtered resources, i.e. build is platform dependent!
    [INFO] skip non existing resourceDirectory /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/src/test/resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Verify-Bigtable-Token ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Verify-Bigtable-Token ---
    [INFO] Surefire report directory: /Users/rahul/Documents/My_Home/GCP_Work/Verify-Bigtable-Token/target/surefire-reports
    
    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running com.google.check.bigtable.token.BigtableDataFlowTest
    SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
    SLF4J: Defaulting to no-operation (NOP) logger implementation
    SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
    2019-07-16 20:43:15 INFO  BigtableDataFlowTest:89 - Started Creating Pipeline to with class org.apache.beam.runners.direct.DirectRunner
    2019-07-16 20:43:15 INFO  BigtableDataFlowTest:89 - Started readFromBigtable test with jobName as: testReadFromBigtable-1563289995550
    2019-07-16 20:43:16 INFO  BigtableSession:89 - Opening session for projectId grass-clump-479, instanceId endurance, on data host batch-bigtable.googleapis.com, admin host bigtableadmin.googleapis.com.
    2019-07-16 20:43:16 INFO  BigtableSession:89 - Bigtable options: BigtableOptions{dataHost=batch-bigtable.googleapis.com, adminHost=bigtableadmin.googleapis.com, port=443, projectId=grass-clump-479, instanceId=endurance, appProfileId=, userAgent=hbase-1.2.6,HBaseBeam, credentialType=DefaultCredentials, dataChannelCount=32, retryOptions=RetryOptions{retriesEnabled=true, allowRetriesWithoutTimestamp=false, statusToRetryOn=[UNAVAILABLE, ABORTED, UNAUTHENTICATED, DEADLINE_EXCEEDED], initialBackoffMillis=5000, maxElapsedBackoffMillis=300000, backoffMultiplier=1.5, streamingBufferSize=60, readPartialRowTimeoutMillis=60000, maxScanTimeoutRetries=3}, bulkOptions=BulkOptions{asyncMutatorCount=0, useBulkApi=true, bulkMaxKeyCount=125, bulkMaxRequestSize=1048576, autoflushMs=0, maxInflightRpcs=320, maxMemory=190893260, enableBulkMutationThrottling=false, bulkMutationRpcTargetMs=100}, callOptionsConfig=CallOptionsConfig{useTimeout=false, shortRpcTimeoutMs=60000, longRpcTimeoutMs=600000, mutateRpcTimeoutMs=600000, readStreamRpcTimeoutMs=600000}, usePlaintextNegotiation=false, useCachedDataPool=true, useBatch=true, useGCJClient=false}.
    2019-07-16 20:43:17 INFO  OAuthCredentialsCache:89 - Refreshing the OAuth token
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:17 INFO  BigtableSession:89 - Creating new channel for batch-bigtable.googleapis.com
    2019-07-16 20:43:32 INFO  BigtableSession:89 - Opening session for projectId grass-clump-479, instanceId endurance, on data host batch-bigtable.googleapis.com, admin host bigtableadmin.googleapis.com.
    2019-07-16 20:43:32 INFO  BigtableSession:89 - Bigtable options: BigtableOptions{dataHost=batch-bigtable.googleapis.com, adminHost=bigtableadmin.googleapis.com, port=443, projectId=grass-clump-479, instanceId=endurance, appProfileId=, userAgent=hbase-1.2.6,HBaseBeam, credentialType=DefaultCredentials, dataChannelCount=32, retryOptions=RetryOptions{retriesEnabled=true, allowRetriesWithoutTimestamp=false, statusToRetryOn=[UNAVAILABLE, ABORTED, UNAUTHENTICATED, DEADLINE_EXCEEDED], initialBackoffMillis=5000, maxElapsedBackoffMillis=300000, backoffMultiplier=1.5, streamingBufferSize=60, readPartialRowTimeoutMillis=60000, maxScanTimeoutRetries=3}, bulkOptions=BulkOptions{asyncMutatorCount=0, useBulkApi=true, bulkMaxKeyCount=125, bulkMaxRequestSize=1048576, autoflushMs=0, maxInflightRpcs=320, maxMemory=190893260, enableBulkMutationThrottling=false, bulkMutationRpcTargetMs=100}, callOptionsConfig=CallOptionsConfig{useTimeout=false, shortRpcTimeoutMs=60000, longRpcTimeoutMs=600000, mutateRpcTimeoutMs=600000, readStreamRpcTimeoutMs=600000}, usePlaintextNegotiation=false, useCachedDataPool=true, useBatch=true, useGCJClient=false}.
    2019-07-16 20:43:34 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
    2019-07-16 20:43:35 INFO  BigtableDataFlowTest:89 - out:  10000
    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 21.213 sec
    
    Results :
    
    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 23.170 s
    [INFO] Finished at: 2019-07-16T20:43:36+05:30
    [INFO] ------------------------------------------------------------------------
    Rahuls-MBP:Verify-Bigtable-Token rahul$