package com.huaweicloud.sdk.pangulargemodels.v1;

import com.huaweicloud.sdk.core.exception.SdkException;

import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import reactor.netty.http.client.HttpClient;

import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLException;

public class SseUtils {
    public static WebClient getWebClient(String endpoint) throws NoSuchAlgorithmException, KeyManagementException {
        if (StringUtils.isEmpty(endpoint)) {
            return WebClient.create();
        }
        if (endpoint.contains("https")) {
            HttpClient secure = HttpClient.create().secure(t -> {
                try {
                    t.sslContext(
                        SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build());
                } catch (SSLException e) {
                    throw new SdkException("Create webclient failed.", e);
                }
            });
            return WebClient.builder()
                .baseUrl(endpoint)
                .clientConnector(new ReactorClientHttpConnector(secure))
                .build();
        }
        return WebClient.create(endpoint);
    }
}