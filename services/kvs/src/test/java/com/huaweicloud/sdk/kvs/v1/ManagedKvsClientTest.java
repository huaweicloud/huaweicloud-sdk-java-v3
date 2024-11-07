package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfig;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class ManagedKvsClientTest {
    String relativelyConfigPath;

    private PropertiesConfiguration config;

    ManagedKvsClient managedKvsClient;

    ManagedKvsClient ManagedKvsAsyncClient;

    @Before
    public void setUp() throws IOException, ConfigurationException {
        this.config = new PropertiesConfiguration();
        config.setListDelimiterHandler(new DefaultListDelimiterHandler(','));
        this.relativelyConfigPath = System.getProperty("user.dir");
        config.read(new FileReader(relativelyConfigPath + "/src/test/resources/config/kvs-sdk.properties"));
    }

    @Test
    public void ManagedKvsClientInitTest() {
        config.setProperty("kvs.sdk.ca-certificate-path",
            relativelyConfigPath + "/src/test/resources/config/test-ca.pem");
        KvsSdkConfig sdkConfig = new KvsSdkConfig(config);
        managedKvsClient = new ManagedKvsClient(sdkConfig.loadEndPointList().get(0), sdkConfig);

        Assert.assertNotNull(managedKvsClient.getKvsClient());
        Assert.assertTrue(managedKvsClient.isUsable());
        Assert.assertEquals("endpoint1", managedKvsClient.getEndpointName());
        Assert.assertEquals(Integer.valueOf(1), managedKvsClient.getEndPointWeight());
    }

    @Test
    public void ManagedKvsAsyncClientInitTest() {
        KvsSdkConfig sdkConfig = new KvsSdkConfig(config, true);
        ManagedKvsAsyncClient = new ManagedKvsClient(sdkConfig.loadEndPointList().get(0), sdkConfig);

        Assert.assertNotNull(ManagedKvsAsyncClient.getKvsAsyncClient());
        Assert.assertTrue(ManagedKvsAsyncClient.isUsable());
        Assert.assertEquals("endpoint1", ManagedKvsAsyncClient.getEndpointName());
        Assert.assertEquals(Integer.valueOf(1), ManagedKvsAsyncClient.getEndPointWeight());
    }

}
