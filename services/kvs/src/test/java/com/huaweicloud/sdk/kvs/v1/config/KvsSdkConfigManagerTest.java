package com.huaweicloud.sdk.kvs.v1.config;

import com.huaweicloud.sdk.kvs.v1.ManagedKvsClient;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

@Ignore
public class KvsSdkConfigManagerTest {
    String configFilePath;

    FileBasedConfigurationBuilder<PropertiesConfiguration> builder;

    PropertiesConfiguration config;

    KvsSdkConfigManager configManager;

    private final ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap = new ConcurrentHashMap<>();

    private final ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ManagedKvsClient>> oldKvsClientMaps
        = new ConcurrentHashMap<>();

    @Before
    public void setUp() throws ConfigurationException {
        this.configFilePath = System.getProperty("user.dir") + "/src/test/resources/config/kvs-sdk.properties";
        this.configManager = new KvsSdkConfigManager(configFilePath, false, kvsClientMap, oldKvsClientMaps, null);
        Configurations configs = new Configurations();
        this.builder = configs.propertiesBuilder(configFilePath);
        this.config = builder.getConfiguration();
    }

    @Test
    public void reloadEndPointInsertTest() throws ConfigurationException, InterruptedException {
        String newEndpointNames = "endpoint1,endpoint2,endpoint3,endpoint4";
        String newEndpointWeights = "1,3,2,1";
        config.setProperty("kvs.sdk.endpoints.name", newEndpointNames);
        config.setProperty("kvs.sdk.endpoints.weight", newEndpointWeights);
        builder.save();

        Thread.sleep(4000);

        System.out.println("output, kvsClientMap: " + kvsClientMap);
        Assert.assertEquals(4, kvsClientMap.size());
    }

    @Test
    public void reloadEndPointRemoveTest() throws ConfigurationException, InterruptedException {
        String newEndpointNames = "endpoint1,endpoint2";
        String newEndpointWeights = "1,3";
        config.setProperty("kvs.sdk.endpoints.name", newEndpointNames);
        config.setProperty("kvs.sdk.endpoints.weight", newEndpointWeights);
        builder.save();

        Thread.sleep(4000);

        Assert.assertEquals(3, kvsClientMap.size());
    }

    @Test
    public void reloadAkskAndEndPointInsertTest() throws ConfigurationException, InterruptedException {
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

        Thread.sleep(4000);

        System.out.println("output, kvsClientMap: " + kvsClientMap);
        Assert.assertEquals(4, kvsClientMap.size());
        Assert.assertEquals(newAk, kvsClientMap.get(1).getAksk().getAk());
        Assert.assertEquals(newSk, kvsClientMap.get(1).getAksk().getSk());
        Assert.assertEquals(newStsToken, kvsClientMap.get(1).getAksk().getStsToken());
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
