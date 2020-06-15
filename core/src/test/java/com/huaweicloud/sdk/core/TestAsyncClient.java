package com.huaweicloud.sdk.core;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.put;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class TestAsyncClient {

    private static final Logger logger = LoggerFactory.getLogger(TestAsyncClient.class);

    HcClient hcClient;
    HttpRequestDef<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> requestDef
            = TestHttpRequestDef.buildHttpRequestDef();

    HttpRequestDef<TestHttpRequestDef.TestNoBodyRequest, TestHttpRequestDef.TestResponse> requestNoRequestBodyDef
            = TestHttpRequestDef.buildHttpRequestNoRequestBodyDef();

    @Rule
    public WireMockRule wireMockRule
            = new WireMockRule(options().httpsPort(8999).port(8998));


    @Before
    public void init() {
        hcClient = new HcClient(new HttpConfig().withIgnoreSSLVerification(true)
                .addHttpListener(HttpListener.forResponseListener(responseListener ->
                        logger.debug("REQUEST: {} {} {} {}",
                                responseListener.httpMethod(),
                                responseListener.uri(),
                                responseListener.statusCode(),
                                responseListener.body().orElse(""))))
                .addHttpListener(HttpListener.forRequestListener(requestListener ->
                        logger.debug("RESPONSE: {} {} {}",
                                requestListener.httpMethod(),
                                requestListener.uri(),
                                requestListener.body().orElse("")))))
                .withCredential(new BasicCredentials()
                        .withAk("test").withSk("test").withProjectId("pp"))
                .withEndpoint("https://127.0.0.1:8999");

        wireMockRule.stubFor(get("/v2.1/pp/servers")
                .willReturn(aResponse()
                        .withBody("[{\"ires\":\"1\",\"jres\":\"2\"},{\"ires\":\"2\",\"jres\":\"3\"}]")
                        .withStatus(200)));
        wireMockRule.stubFor(put("/v2.1/pp/servers")
                .willReturn(aResponse()
                        .withBody("[{\"ires\":\"1\",\"jres\":\"2\"},{\"ires\":\"2\",\"jres\":\"3\"}]")
                        .withStatus(200)));

        wireMockRule.start();
    }

    @After
    public void stop() {
        wireMockRule.stop();
    }

    @Test
    public void testAsyncClient() throws ExecutionException, InterruptedException {
        CompletableFuture<TestHttpRequestDef.TestResponse> future =
                callAsync(new TestHttpRequestDef.TestRequest());
        TestHttpRequestDef.TestResponse response = future.get();
        Assert.assertNotNull(response.getBody());
        TestHttpRequestDef.InnerResponse[] result = new TestHttpRequestDef.InnerResponse[]{
                new TestHttpRequestDef.InnerResponse().withIres("1").withJres("2"),
                new TestHttpRequestDef.InnerResponse().withIres("2").withJres("3")
        };
        Assert.assertArrayEquals(response.getBody().toArray(), result);
    }

    @Test
    public void testAsyncClientNoRequestBody() throws ExecutionException, InterruptedException {
        CompletableFuture<TestHttpRequestDef.TestResponse> future =
                callNoRequestBodyAsync(new TestHttpRequestDef.TestNoBodyRequest());
        TestHttpRequestDef.TestResponse response = future.get();
        Assert.assertNotNull(response.getBody());
        TestHttpRequestDef.InnerResponse[] result = new TestHttpRequestDef.InnerResponse[]{
                new TestHttpRequestDef.InnerResponse().withIres("1").withJres("2"),
                new TestHttpRequestDef.InnerResponse().withIres("2").withJres("3")
        };
        Assert.assertArrayEquals(response.getBody().toArray(), result);
    }

    public CompletableFuture<TestHttpRequestDef.TestResponse> callAsync(TestHttpRequestDef.TestRequest request) {
        return hcClient.asyncInvokeHttp(request, requestDef);
    }

    public CompletableFuture<TestHttpRequestDef.TestResponse> callNoRequestBodyAsync(
            TestHttpRequestDef.TestNoBodyRequest request) {
        return hcClient.asyncInvokeHttp(request, requestNoRequestBodyDef);
    }
}
