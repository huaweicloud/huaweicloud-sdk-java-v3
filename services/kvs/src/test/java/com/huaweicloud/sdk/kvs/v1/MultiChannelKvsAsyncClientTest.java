package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfig;
import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfigManager;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.CheckHealthResponse;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.DescribeTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.DescribeTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.Endpoint;
import com.huaweicloud.sdk.kvs.v1.model.GetKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.GetKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ListStoreRequest;
import com.huaweicloud.sdk.kvs.v1.model.ListStoreResponse;
import com.huaweicloud.sdk.kvs.v1.model.ListTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.ListTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.ScanKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.ScanKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ScanSkeyKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.ScanSkeyKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.UpdateKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.UpdateKvResponse;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Ignore
@RunWith(PowerMockRunner.class)
@PrepareForTest({KvsSdkConfigManager.class, ManagedKvsClient.class})
@PowerMockIgnore({"javax.management.*", "javax.net.ssl.*", "javax.crypto.*"})
public class MultiChannelKvsAsyncClientTest {
    MultiChannelKvsAsyncClient multiChannelKvsAsyncClient;

    String configFilePath;

    FileBasedConfigurationBuilder<PropertiesConfiguration> builder;

    PropertiesConfiguration config;

    @Mock
    private KvsAsyncClient mockKvsClient1;

    private Integer clientInvokeCount1 = 0;

    @Mock
    private KvsAsyncClient mockKvsClient2;

    private Integer clientInvokeCount2 = 0;

    @Mock
    private KvsAsyncClient mockKvsClient3;

    private Integer clientInvokeCount3 = 0;

    @Mock
    private CompletableFuture<CheckHealthResponse> mockFuture;

    @Before
    public void setUp() throws Exception {
        this.configFilePath = System.getProperty("user.dir") + "/src/test/resources/config/kvs-sdk.properties";
        Configurations configs = new Configurations();
        this.builder = configs.propertiesBuilder(configFilePath);
        this.config = builder.getConfiguration();
        KvsSdkConfig sdkConfig = new KvsSdkConfig(config, true);

        Endpoint endpoint1 = new Endpoint().withName("endpoint1").withWeight(1);
        Endpoint endpoint2 = new Endpoint().withName("endpoint2").withWeight(3);
        Endpoint endpoint3 = new Endpoint().withName("endpoint3").withWeight(2);

        ManagedKvsClient mockManagedKvsClient1 = PowerMockito.spy(new ManagedKvsClient(endpoint1, sdkConfig));
        ManagedKvsClient mockManagedKvsClient2 = PowerMockito.spy(new ManagedKvsClient(endpoint2, sdkConfig));
        ManagedKvsClient mockManagedKvsClient3 = PowerMockito.spy(new ManagedKvsClient(endpoint3, sdkConfig));

        PowerMockito.whenNew(ManagedKvsClient.class).withAnyArguments().thenAnswer(invocation -> {
            Endpoint endpoint = invocation.getArgument(0);
            if (endpoint.getName().equals(endpoint1.getName())) {
                return mockManagedKvsClient1;
            }
            if (endpoint.getName().equals(endpoint2.getName())) {
                return mockManagedKvsClient2;
            }
            return mockManagedKvsClient3;
        });

        this.multiChannelKvsAsyncClient = new MultiChannelKvsAsyncClient(configFilePath);

        CompletableFuture<CreateTableResponse> future = new CompletableFuture<>();
        PowerMockito.when(mockManagedKvsClient1.getKvsAsyncClient()).thenReturn(mockKvsClient1);
        PowerMockito.when(mockKvsClient1.createTableAsync(Mockito.any())).thenAnswer(invocation -> {
            clientInvokeCount1++;
            return future;
        });

        PowerMockito.when(mockManagedKvsClient2.getKvsAsyncClient()).thenReturn(mockKvsClient2);
        PowerMockito.when(mockKvsClient2.createTableAsync(Mockito.any())).thenAnswer(invocation -> {
            clientInvokeCount2++;
            return future;
        });

        PowerMockito.when(mockManagedKvsClient3.getKvsAsyncClient()).thenReturn(mockKvsClient3);
        PowerMockito.when(mockKvsClient3.createTableAsync(Mockito.any())).thenAnswer(invocation -> {
            clientInvokeCount3++;
            return future;
        });
    }

    @Test
    public void allApiTest() throws InterruptedException, ExecutionException {
        PowerMockito.when(mockKvsClient1.checkHealthAsync(Mockito.any()))
            .thenReturn(mockFuture);
        PowerMockito.when(mockFuture.get())
            .thenReturn(null);
        PowerMockito.when(mockKvsClient2.checkHealthAsync(Mockito.any()))
            .thenThrow(new ConnectionException("mock socket timeout"));
        PowerMockito.when(mockKvsClient3.checkHealthAsync(Mockito.any()))
            .thenThrow(new ConnectionException("mock socket timeout"));
        Thread.sleep(3000);

        CompletableFuture<CreateTableResponse> future1 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.createTableAsync(Mockito.any())).thenReturn(future1);
        CreateTableRequest request1 = new CreateTableRequest();
        Assert.assertEquals(future1, multiChannelKvsAsyncClient.createTableAsync(request1));

        CompletableFuture<DescribeTableResponse> future2 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.describeTableAsync(Mockito.any())).thenReturn(future2);
        DescribeTableRequest request2 = new DescribeTableRequest();
        Assert.assertEquals(future2, multiChannelKvsAsyncClient.describeTableAsync(request2));

        CompletableFuture<ListStoreResponse> future3 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.listStoreAsync(Mockito.any())).thenReturn(future3);
        ListStoreRequest request3 = new ListStoreRequest();
        Assert.assertEquals(future3, multiChannelKvsAsyncClient.listStoreAsync(request3));

        CompletableFuture<ListTableResponse> future4 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.listTableAsync(Mockito.any())).thenReturn(future4);
        ListTableRequest request4 = new ListTableRequest();
        Assert.assertEquals(future4, multiChannelKvsAsyncClient.listTableAsync(request4));

        CompletableFuture<BatchWriteKvResponse> future5 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.batchWriteKvAsync(Mockito.any())).thenReturn(future5);
        BatchWriteKvRequest request5 = new BatchWriteKvRequest();
        Assert.assertEquals(future5, multiChannelKvsAsyncClient.batchWriteKvAsync(request5));

        CompletableFuture<DeleteKvResponse> future6 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.deleteKvAsync(Mockito.any())).thenReturn(future6);
        DeleteKvRequest request6 = new DeleteKvRequest();
        Assert.assertEquals(future6, multiChannelKvsAsyncClient.deleteKvAsync(request6));

        CompletableFuture<GetKvResponse> future7 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.getKvAsync(Mockito.any())).thenReturn(future7);
        GetKvRequest request7 = new GetKvRequest();
        Assert.assertEquals(future7, multiChannelKvsAsyncClient.getKvAsync(request7));

        CompletableFuture<ScanKvResponse> future8 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.scanKvAsync(Mockito.any())).thenReturn(future8);
        ScanKvRequest request8 = new ScanKvRequest();
        Assert.assertEquals(future8, multiChannelKvsAsyncClient.scanKvAsync(request8));

        CompletableFuture<ScanSkeyKvResponse> future9 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.scanSkeyKvAsync(Mockito.any())).thenReturn(future9);
        ScanSkeyKvRequest request9 = new ScanSkeyKvRequest();
        Assert.assertEquals(future9, multiChannelKvsAsyncClient.scanSkeyKvAsync(request9));

        CompletableFuture<ScanSkeyKvResponse> future10 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.scanSkeyKvAsync(Mockito.any())).thenReturn(future10);
        ScanSkeyKvRequest request10 = new ScanSkeyKvRequest();
        Assert.assertEquals(future10, multiChannelKvsAsyncClient.scanSkeyKvAsync(request10));

        CompletableFuture<UpdateKvResponse> response11 = new CompletableFuture<>();
        PowerMockito.when(mockKvsClient1.updateKvAsync(Mockito.any())).thenReturn(response11);
        UpdateKvRequest request11 = new UpdateKvRequest();
        Assert.assertEquals(response11, multiChannelKvsAsyncClient.updateKvAsync(request11));
    }

    @After
    public void cleanUp() throws ConfigurationException {
        String endpointNames = "endpoint1,endpoint2,endpoint3";
        String endpointWeights = "1,3,2";
        String ak = "testAk";
        String sk = "testSk";
        String stsToken = "testStsToken";

        config.setProperty("kvs.sdk.endpoints.name", endpointNames);
        config.setProperty("kvs.sdk.endpoints.weight", endpointWeights);
        config.setProperty("kvs.sdk.ak", ak);
        config.setProperty("kvs.sdk.sk", sk);
        config.setProperty("kvs.sdk.stsToken", stsToken);
        builder.save();
    }
}
