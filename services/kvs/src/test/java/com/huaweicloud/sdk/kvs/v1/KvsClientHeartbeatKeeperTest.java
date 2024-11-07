package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfig;
import com.huaweicloud.sdk.kvs.v1.model.CheckHealthResponse;
import com.huaweicloud.sdk.kvs.v1.model.Endpoint;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.FileReader;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*", "javax.net.ssl.*", "javax.crypto.*"})
public class KvsClientHeartbeatKeeperTest {
    private final ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap = new ConcurrentHashMap<>();

    private final ConcurrentHashMap<Integer, ManagedKvsClient> kvsAsyncClientMap = new ConcurrentHashMap<>();

    private KvsSdkConfig sdkConfig;

    private KvsSdkConfig sdkAsyncConfig;

    @Mock
    private KvsClient mockKvsClient;

    @Mock
    private KvsAsyncClient mockKvsAsyncClient;

    @Before
    public void setUp() throws Exception {
        PropertiesConfiguration config = new PropertiesConfiguration();
        config.setListDelimiterHandler(new DefaultListDelimiterHandler(','));
        String relativelyPath = System.getProperty("user.dir");
        config.read(new FileReader(relativelyPath + "/src/test/resources/config/kvs-sdk.properties"));
        sdkConfig = new KvsSdkConfig(config);

        List<Endpoint> endpointList = sdkConfig.loadEndPointList();
        for (Endpoint endpoint : endpointList) {
            ManagedKvsClient newKvsClient = PowerMockito.spy(new ManagedKvsClient(endpoint, sdkConfig));
            PowerMockito.when(newKvsClient.getKvsClient()).thenReturn(mockKvsClient);
            kvsClientMap.put(kvsClientMap.size() + 1, newKvsClient);
        }

        sdkAsyncConfig = new KvsSdkConfig(config, true);

        List<Endpoint> endpointList2 = sdkAsyncConfig.loadEndPointList();
        for (Endpoint endpoint : endpointList2) {
            ManagedKvsClient newKvsClient = PowerMockito.spy(new ManagedKvsClient(endpoint, sdkAsyncConfig));
            PowerMockito.when(newKvsClient.getKvsAsyncClient()).thenReturn(mockKvsAsyncClient);
            kvsAsyncClientMap.put(kvsAsyncClientMap.size() + 1, newKvsClient);
        }
    }

    @Test
    public void heartbeatKeeperAllSuccessTest() throws InterruptedException {
        PowerMockito.when(mockKvsClient.checkHealth(Mockito.any()))
            .thenReturn(new CheckHealthResponse());

        KvsClientHeartbeatKeeper heartbeatKeeper = new KvsClientHeartbeatKeeper(kvsClientMap,
            sdkConfig.getHeartbeatInterval(), sdkConfig.getHeartbeatThreadPoolSize());
        Thread.sleep(2000);

        kvsClientMap.forEach((sortNum, managedKvsClient) -> {
            Assert.assertEquals(true, managedKvsClient.isUsable());
        });
    }

    @Test
    public void heartbeatKeeperAsyncAllSuccessTest() throws InterruptedException {
        PowerMockito.when(mockKvsAsyncClient.checkHealthAsync(Mockito.any()))
            .thenReturn(new CompletableFuture<CheckHealthResponse>());

        KvsClientHeartbeatKeeper heartbeatKeeper = new KvsClientHeartbeatKeeper(kvsAsyncClientMap,
            sdkConfig.getHeartbeatInterval(), sdkConfig.getHeartbeatThreadPoolSize());
        Thread.sleep(2000);

        kvsAsyncClientMap.forEach((sortNum, managedKvsClient) -> {
            Assert.assertEquals(true, managedKvsClient.isUsable());
        });
    }

    @Test
    public void heartbeatKeeperAllFailedTest() throws InterruptedException {
        PowerMockito.when(mockKvsClient.checkHealth(Mockito.any()))
            .thenThrow(new ConnectionException("mock host unreachable exception"));

        KvsClientHeartbeatKeeper heartbeatKeeper = new KvsClientHeartbeatKeeper(kvsClientMap,
            sdkConfig.getHeartbeatInterval(), sdkConfig.getHeartbeatThreadPoolSize());
        Thread.sleep(2000);

        kvsClientMap.forEach((sortNum, managedKvsClient) -> {
            Assert.assertEquals(false, managedKvsClient.isUsable());
        });
    }

    @Test
    public void heartbeatKeeperAsyncAllFailedTest() throws InterruptedException {
        PowerMockito.when(mockKvsAsyncClient.checkHealthAsync(Mockito.any()))
            .thenThrow(new ConnectionException("mock host unreachable exception"));

        KvsClientHeartbeatKeeper heartbeatKeeper = new KvsClientHeartbeatKeeper(kvsAsyncClientMap,
            sdkAsyncConfig.getHeartbeatInterval(), sdkAsyncConfig.getHeartbeatThreadPoolSize());
        Thread.sleep(2000);

        kvsAsyncClientMap.forEach((sortNum, managedKvsClient) -> {
            Assert.assertEquals(false, managedKvsClient.isUsable());
        });
    }
}
