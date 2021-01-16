package com.huaweicloud.sdk.core;

import java.lang.reflect.Field;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.region.Region;

import static com.huaweicloud.sdk.core.Constants.MEDIATYPE;
import static com.huaweicloud.sdk.core.TestRegion.TEST_ENDPOINT;

/**
 * TestRegionWithoutProjectId类：测试projectId在不同调用方式下的自动回填情况
 */
public class TestRegionWithoutProjectId {
    private static final Logger logger = LoggerFactory.getLogger(TestRegionWithoutProjectId.class);

    private static final String EXPECTED = "123456789";
    private static final String IAM_ENDPOINT = "http://127.0.0.1:10086";
    private static final BasicCredentials CREDENTIALS = new BasicCredentials().withAk("ak").withSk("sk")
        .withIamEndpoint(IAM_ENDPOINT);
    private final HttpConfig config = HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true);

    @Rule
    public WireMockRule wireMockRule;

    @Before
    public void init() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

        wireMockRule
            = new WireMockRule(WireMockConfiguration.options().httpsPort(10010).port(10086).disableRequestJournal());

        wireMockRule.stubFor(WireMock.get("/v3/projects?name=cn-north-7")
            .willReturn(WireMock.aResponse()
                .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                .withBody("{\"projects\": [{\"id\": \"123456789\"}]}")
                .withStatus(200)
            )
        );

        wireMockRule.stubFor(WireMock.get("/v3/projects?name=cn-north-400")
            .willReturn(WireMock.aResponse()
                .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                .withBody("{\"error_msg\": \"Incorrect IAM authentication information: verify aksk signature fail\"}")
                .withStatus(401)
            )
        );
        wireMockRule.start();
    }

    @After
    public void stop() {
        wireMockRule.stop();
    }

    @Test
    public void testEndpointWithRegion() {
        TestServiceClient.newBuilder()
            .withCredential(CREDENTIALS)
            .withHttpConfig(config)
            .withRegion(TestRegion.CN_NORTH_7)
            .build();

        try {
            Field projectId = BasicCredentials.class.getDeclaredField("projectId");
            projectId.setAccessible(true);
            Assert.assertEquals(EXPECTED, projectId.get(CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithValueOf() {
        TestServiceClient.newBuilder()
            .withCredential(CREDENTIALS)
            .withHttpConfig(config)
            .withRegion(TestRegion.valueOf("cn-north-7"))
            .build();

        try {
            Field projectId = BasicCredentials.class.getDeclaredField("projectId");
            projectId.setAccessible(true);
            Assert.assertEquals(EXPECTED, projectId.get(CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithNewRegion() {
        TestServiceClient.newBuilder()
            .withCredential(CREDENTIALS)
            .withHttpConfig(config)
            .withRegion(new Region("cn-north-7", TEST_ENDPOINT))
            .build();
        try {
            Field projectId = BasicCredentials.class.getDeclaredField("projectId");
            projectId.setAccessible(true);
            Assert.assertEquals(EXPECTED, projectId.get(CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testWrongCredential() {
        try {
            TestServiceClient.newBuilder()
                .withCredential(CREDENTIALS)
                .withHttpConfig(config)
                .withRegion(TestRegion.CN_NORTH_400)
                .build();
        } catch (SdkException e) {
            String errMessage = "Failed to get project id, Incorrect IAM authentication information: "
                + "verify aksk signature fail";
            Assert.assertEquals(e.getMessage(), errMessage);
        }
    }

}
