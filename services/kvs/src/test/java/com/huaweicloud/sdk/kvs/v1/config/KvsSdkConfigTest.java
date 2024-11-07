package com.huaweicloud.sdk.kvs.v1.config;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.kvs.v1.model.Endpoint;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KvsSdkConfigTest {
    KvsSdkConfig sdkConfig;

    @Before
    public void setUp() throws IOException, ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration();
        config.setListDelimiterHandler(new DefaultListDelimiterHandler(','));
        String relativelyPath = System.getProperty("user.dir");
        config.read(new FileReader(relativelyPath + "/src/test/resources/config/kvs-sdk.properties"));
        sdkConfig = new KvsSdkConfig(config);
    }

    @Test
    public void getAKSKConfigTest() {
        BasicCredentials credentials = new BasicCredentials()
            .withAk(sdkConfig.getAK())
            .withSk(sdkConfig.getSK())
            .withSecurityToken(sdkConfig.getStsToken())
            .withProjectId(sdkConfig.getProjectId());

        Assert.assertEquals("testAk", credentials.getAk());
        Assert.assertEquals("testSk", credentials.getSk());
        Assert.assertEquals("testStsToken", credentials.getSecurityToken());
        Assert.assertEquals("testProjectId", credentials.getProjectId());
    }

    @Test
    public void getHttpConfigTest() {
        Assert.assertEquals("", sdkConfig.getCaCertificatePath());
        Assert.assertEquals(5, sdkConfig.getConnectionPoolSize().intValue());
        Assert.assertEquals(5, sdkConfig.getConnectionPoolKeepAliveDuration().intValue());
        Assert.assertEquals(100, sdkConfig.getDispatcherMaxRequests().intValue());
        Assert.assertEquals(100, sdkConfig.getDispatcherMaxRequestsPerHost().intValue());
        Assert.assertEquals(5, sdkConfig.getConnectionTimeout().intValue());
        Assert.assertEquals(5, sdkConfig.getReadTimeout().intValue());
        Assert.assertEquals(10, sdkConfig.getExecutorThreadPoolSize().intValue());
    }

    @Test
    public void getRegionConfigTest() {
        Assert.assertEquals(sdkConfig.getRegionId(), "cn-north-7");

        List<Endpoint> endpoints1 = new ArrayList<>();
        endpoints1.add(new Endpoint().withName("endpoint1").withWeight(1));
        endpoints1.add(new Endpoint().withName("endpoint2").withWeight(3));
        endpoints1.add(new Endpoint().withName("endpoint3").withWeight(2));

        List<Endpoint> endpoints2 = sdkConfig.loadEndPointList();
        for (int i = 0; i < endpoints2.size(); i++) {
            Assert.assertEquals(endpoints1.get(i).getName(), endpoints2.get(i).getName());
            Assert.assertEquals(endpoints1.get(i).getWeight(), endpoints2.get(i).getWeight());
        }
    }

    @Test
    public void getMultiChannelClientConfigTest() {
        Assert.assertEquals(sdkConfig.isAsyncClient(), false);
        Assert.assertEquals(1, sdkConfig.getHeartbeatInterval().intValue());
        Assert.assertEquals(3, sdkConfig.getReloadInterval().intValue());
        Assert.assertEquals(3, sdkConfig.getApiRetryCount().intValue());
    }
}
