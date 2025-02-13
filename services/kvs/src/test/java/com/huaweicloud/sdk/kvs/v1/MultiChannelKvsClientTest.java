package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfig;
import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfigManager;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvResponse;
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

@Ignore
@RunWith(PowerMockRunner.class)
@PrepareForTest({KvsSdkConfigManager.class, ManagedKvsClient.class})
@PowerMockIgnore({"javax.management.*", "javax.net.ssl.*", "javax.crypto.*"})
public class MultiChannelKvsClientTest {
    MultiChannelKvsClient multiChannelKvsClient;

    String configFilePath;

    FileBasedConfigurationBuilder<PropertiesConfiguration> builder;

    PropertiesConfiguration config;

    @Mock
    private KvsClient mockKvsClient1;

    private Integer clientInvokeCount1 = 0;

    @Mock
    private KvsClient mockKvsClient2;

    private Integer clientInvokeCount2 = 0;

    @Mock
    private KvsClient mockKvsClient3;

    private Integer clientInvokeCount3 = 0;

    @Before
    public void setUp() throws Exception {
        this.configFilePath = System.getProperty("user.dir") + "/src/test/resources/config/kvs-sdk.properties";
        Configurations configs = new Configurations();
        this.builder = configs.propertiesBuilder(configFilePath);
        this.config = builder.getConfiguration();
        KvsSdkConfig sdkConfig = new KvsSdkConfig(config);

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

        this.multiChannelKvsClient = new MultiChannelKvsClient(configFilePath);

        CreateTableResponse response = new CreateTableResponse();
        PowerMockito.when(mockManagedKvsClient1.getKvsClient()).thenReturn(mockKvsClient1);
        PowerMockito.when(mockKvsClient1.createTable(Mockito.any())).thenAnswer(invocation -> {
            clientInvokeCount1++;
            return response;
        });

        PowerMockito.when(mockManagedKvsClient2.getKvsClient()).thenReturn(mockKvsClient2);
        PowerMockito.when(mockKvsClient2.createTable(Mockito.any())).thenAnswer(invocation -> {
            clientInvokeCount2++;
            return response;
        });

        PowerMockito.when(mockManagedKvsClient3.getKvsClient()).thenReturn(mockKvsClient3);
        PowerMockito.when(mockKvsClient3.createTable(Mockito.any())).thenAnswer(invocation -> {
            clientInvokeCount3++;
            return response;
        });
    }

    @Test
    public void oldClientMapCleanTest() throws ConfigurationException, InterruptedException {
        String newAk = "testAk2";
        String newSk = "testSk2";
        String newStsToken = "testStsToken2";
        String newEndpointNames = "endpoint1,endpoint2,endpoint3,endpoint4";
        String newEndpointWeights = "1,3,2,1";
        config.setProperty("kvs.sdk.ak", newAk);
        config.setProperty("kvs.sdk.sk", newSk);
        config.setProperty("kvs.sdk.stsToken", newStsToken);
        config.setProperty("kvs.sdk.endpoints.name", newEndpointNames);
        config.setProperty("kvs.sdk.endpoints.weight", newEndpointWeights);
        builder.save();

        Thread.sleep(8000);

        Assert.assertEquals(0, multiChannelKvsClient.getOldKvsClientMaps().size());
    }

    @Test
    public void threeClientsCreateTableTest() throws Exception {
        Configurations configs = new Configurations();
        this.builder = configs.propertiesBuilder(configFilePath);
        this.config = builder.getConfiguration();

        CreateTableRequest request = new CreateTableRequest();
        for (int count = 0; count < 7; count++) {
            multiChannelKvsClient.createTable(request);
        }

        Assert.assertEquals(2, clientInvokeCount1.intValue());
        Assert.assertEquals(3, clientInvokeCount2.intValue());
        Assert.assertEquals(2, clientInvokeCount3.intValue());
    }

    @Test
    public void threeClientsCreateTableTestWith1IntervalUnusable() throws Exception {
        Configurations configs = new Configurations();
        this.builder = configs.propertiesBuilder(configFilePath);
        this.config = builder.getConfiguration();

        PowerMockito.when(mockKvsClient1.checkHealth(Mockito.any()))
            .thenThrow(new ConnectionException("mock socket timeout"));

        CreateTableRequest request1 = new CreateTableRequest();
        for (int count = 0; count < 6; count++) {
            multiChannelKvsClient.createTable(request1);
        }

        Assert.assertEquals(1, clientInvokeCount1.intValue());
        Assert.assertEquals(3, clientInvokeCount2.intValue());
        Assert.assertEquals(2, clientInvokeCount3.intValue());

        Thread.sleep(3000);

        CreateTableRequest request2 = new CreateTableRequest();
        for (int count = 0; count < 6; count++) {
            multiChannelKvsClient.createTable(request2);
        }

        Assert.assertEquals(1, clientInvokeCount1.intValue());
        Assert.assertEquals(7, clientInvokeCount2.intValue());
        Assert.assertEquals(4, clientInvokeCount3.intValue());
    }

    @Test
    public void allApiTest() throws InterruptedException {
        PowerMockito.when(mockKvsClient2.checkHealth(Mockito.any()))
            .thenThrow(new ConnectionException("mock socket timeout"));
        PowerMockito.when(mockKvsClient3.checkHealth(Mockito.any()))
            .thenThrow(new ConnectionException("mock socket timeout"));
        Thread.sleep(3000);

        DescribeTableResponse response1 = new DescribeTableResponse();
        PowerMockito.when(mockKvsClient1.describeTable(Mockito.any())).thenReturn(response1);
        DescribeTableRequest request1 = new DescribeTableRequest();
        Assert.assertEquals(response1, multiChannelKvsClient.describeTable(request1));

        ListStoreResponse response2 = new ListStoreResponse();
        PowerMockito.when(mockKvsClient1.listStore(Mockito.any())).thenReturn(response2);
        ListStoreRequest request2 = new ListStoreRequest();
        Assert.assertEquals(response2, multiChannelKvsClient.listStore(request2));

        ListTableResponse response3 = new ListTableResponse();
        PowerMockito.when(mockKvsClient1.listTable(Mockito.any())).thenReturn(response3);
        ListTableRequest request3 = new ListTableRequest();
        Assert.assertEquals(response3, multiChannelKvsClient.listTable(request3));

        BatchWriteKvResponse response4 = new BatchWriteKvResponse();
        PowerMockito.when(mockKvsClient1.batchWriteKv(Mockito.any())).thenReturn(response4);
        BatchWriteKvRequest request4 = new BatchWriteKvRequest();
        Assert.assertEquals(response4, multiChannelKvsClient.batchWriteKv(request4));

        DeleteKvResponse response5 = new DeleteKvResponse();
        PowerMockito.when(mockKvsClient1.deleteKv(Mockito.any())).thenReturn(response5);
        DeleteKvRequest request5 = new DeleteKvRequest();
        Assert.assertEquals(response5, multiChannelKvsClient.deleteKv(request5));

        GetKvResponse response6 = new GetKvResponse();
        PowerMockito.when(mockKvsClient1.getKv(Mockito.any())).thenReturn(response6);
        GetKvRequest request6 = new GetKvRequest();
        Assert.assertEquals(response6, multiChannelKvsClient.getKv(request6));

        ScanKvResponse response7 = new ScanKvResponse();
        PowerMockito.when(mockKvsClient1.scanKv(Mockito.any())).thenReturn(response7);
        ScanKvRequest request7 = new ScanKvRequest();
        Assert.assertEquals(response7, multiChannelKvsClient.scanKv(request7));

        ScanSkeyKvResponse response8 = new ScanSkeyKvResponse();
        PowerMockito.when(mockKvsClient1.scanSkeyKv(Mockito.any())).thenReturn(response8);
        ScanSkeyKvRequest request8 = new ScanSkeyKvRequest();
        Assert.assertEquals(response8, multiChannelKvsClient.scanSkeyKv(request8));

        ScanSkeyKvResponse response9 = new ScanSkeyKvResponse();
        PowerMockito.when(mockKvsClient1.scanSkeyKv(Mockito.any())).thenReturn(response9);
        ScanSkeyKvRequest request9 = new ScanSkeyKvRequest();
        Assert.assertEquals(response9, multiChannelKvsClient.scanSkeyKv(request9));

        UpdateKvResponse response10 = new UpdateKvResponse();
        PowerMockito.when(mockKvsClient1.updateKv(Mockito.any())).thenReturn(response10);
        UpdateKvRequest request10 = new UpdateKvRequest();
        Assert.assertEquals(response10, multiChannelKvsClient.updateKv(request10));
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
