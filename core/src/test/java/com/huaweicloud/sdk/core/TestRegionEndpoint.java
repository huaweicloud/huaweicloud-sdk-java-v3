package com.huaweicloud.sdk.core;

import java.lang.reflect.Field;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.region.Region;

import static com.huaweicloud.sdk.core.TestRegion.SERVICE_ENDPOINT;
import static com.huaweicloud.sdk.core.TestRegion.TEST_ENDPOINT;
import static com.huaweicloud.sdk.core.TestRegion.TEST_ENDPOINT_WITHOUT_SCHEME;

/**
 * TestRegionWitProjectId类：测试配置了withRegion方法时，endpoint的自动回填情况，由于有override场景，需要按照字典序执行用例
 */
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class TestRegionEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(TestRegionEndpoint.class);

    private static final BasicCredentials CREDENTIALS =
            new BasicCredentials().withAk("ak").withSk("sk").withProjectId("project_id");

    @Test
    public void testEndpointWithRegion1() {
        TestServiceClient client = TestServiceClient.newBuilder()
                .withCredential(CREDENTIALS)
                .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                .withRegion(TestRegion.CN_NORTH_7)
                .build();

        try {
            Field endpoint = HcClient.class.getDeclaredField("endpoint");
            endpoint.setAccessible(true);
            Assert.assertEquals(SERVICE_ENDPOINT, endpoint.get(client.hcClient));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegion2() {
        TestServiceClient client = TestServiceClient.newBuilder()
                .withCredential(CREDENTIALS)
                .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                .withRegion(TestRegion.valueOf("cn-north-7"))
                .build();

        try {
            Field endpoint = HcClient.class.getDeclaredField("endpoint");
            endpoint.setAccessible(true);
            Assert.assertEquals(SERVICE_ENDPOINT, endpoint.get(client.hcClient));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegion3() {
        TestServiceClient client = TestServiceClient.newBuilder()
                .withCredential(CREDENTIALS)
                .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                .withRegion(new Region("cn-north-7", TEST_ENDPOINT))
                .build();
        try {
            Field endpoint = HcClient.class.getDeclaredField("endpoint");
            endpoint.setAccessible(true);
            Assert.assertEquals(TEST_ENDPOINT, endpoint.get(client.hcClient));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegionWithoutScheme() {
        TestServiceClient client = TestServiceClient.newBuilder()
                .withCredential(CREDENTIALS)
                .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                .withRegion(new Region("cn-north-7", TEST_ENDPOINT_WITHOUT_SCHEME))
                .build();
        try {
            Field endpoint = HcClient.class.getDeclaredField("endpoint");
            endpoint.setAccessible(true);
            Assert.assertEquals(TEST_ENDPOINT, endpoint.get(client.hcClient));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegionOverride1() {
        TestServiceClient client = TestServiceClient.newBuilder()
                .withCredential(CREDENTIALS)
                .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                .withRegion(TestRegion.CN_NORTH_7.withEndpointOverride(TEST_ENDPOINT))
                .build();
        try {
            Field endpoint = HcClient.class.getDeclaredField("endpoint");
            endpoint.setAccessible(true);
            Assert.assertEquals(TEST_ENDPOINT, endpoint.get(client.hcClient));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegionOverride2() {
        TestServiceClient client = TestServiceClient.newBuilder()
                .withCredential(CREDENTIALS)
                .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                .withRegion(TestRegion.valueOf("cn-north-7").withEndpointOverride(TEST_ENDPOINT))
                .build();
        try {
            Field endpoint = HcClient.class.getDeclaredField("endpoint");
            endpoint.setAccessible(true);
            Assert.assertEquals(TEST_ENDPOINT, endpoint.get(client.hcClient));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testEmptyRegionValueOf() {
        try {
            TestServiceClient.newBuilder()
                    .withCredential(CREDENTIALS)
                    .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                    .withRegion(TestRegion.valueOf(""))
                    .build();
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Unexpected empty parameter: regionId.");
        }
    }

    @Test
    public void testWrongRegionValueOf() {
        try {
            TestServiceClient.newBuilder()
                    .withCredential(CREDENTIALS)
                    .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                    .withRegion(TestRegion.valueOf("cn-north-6"))
                    .build();
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Unexpected regionId: cn-north-6");
        }
    }
}
