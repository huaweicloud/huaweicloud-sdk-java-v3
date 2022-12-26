package com.huaweicloud.sdk.core;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import org.junit.Assert;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;

public class TestUtils {
    public static WireMockRule createWireMockRule() {
        return new WireMockRule(
                WireMockConfiguration.options().dynamicPort().dynamicHttpsPort().disableRequestJournal());
    }

    public static HcClient createHcClient(Logger logger, String endpoint) {
        return new HcClient(new HttpConfig().withIgnoreSSLVerification(true)
                .withTimeout(600)
                .addHttpListener(HttpListener.forResponseListener(
                        responseListener -> logger.debug("RESPONSE: [{} {}] {} {} {} {} {}ms",
                                responseListener.exchange().getApiReference().getName(),
                                responseListener.exchange().getApiReference().getUri(), responseListener.httpMethod(),
                                responseListener.uri(), responseListener.statusCode(),
                                responseListener.body().orElse(""),
                                responseListener.exchange().getApiTimer().getDurationMs())))
                .addHttpListener(HttpListener.forRequestListener(
                        requestListener -> logger.debug("REQUEST: {} {} {}", requestListener.httpMethod(),
                                requestListener.uri(), requestListener.body().orElse("")))))
                .withCredential(new BasicCredentials().withAk("test").withSk("test").withProjectId("pp"))
                .withEndpoint(endpoint);
    }

    public static Consumer<InputStream> getDownloadConsumer(Logger logger) {
        return inputStream -> {
            byte[] bytes = new byte[512];
            int len;
            int totalLen = 0;
            try {
                while ((len = inputStream.read(bytes)) != -1) {
                    totalLen = totalLen + len;
                }
                Assert.assertEquals(totalLen, 1024 * 1024 * 5);
            } catch (IOException e) {
                logger.error("Download file error ", e);
            }
        };
    }
}
