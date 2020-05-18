package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.auth.AKSKSigner;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

/**
 * Test the validation of signature with AK/SK
 */
public class TestAKSKSigner {

    @Test
    public void testAKSKSigner() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.withAk("QTWAOYTTINDUT2QVKYUC").withSk("MFyfvK41ba2giqM7Uio6PznpdUKGpownRZlmVmHc");

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        HttpRequest httpRequest = requestBuilder.withEndpoint("https://service.region.example.com")
            .withMethod(HttpMethod.GET)
            .withContentType("application/json")
            .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpcs")
            .addHeader("X-Sdk-Date", "20191115T033655Z")
            .addQueryParam("limit", Arrays.asList(2))
            .addQueryParam("marker", Arrays.asList("13551d6b-755d-4757-b956-536f674975c0")).build();
        System.out.println(httpRequest.getUrl().toString());

        Map<String, String> header = AKSKSigner.sign(httpRequest, credentials);

        header.forEach((key, value) -> System.out.println(key + ":" + value));

        Assert.assertEquals(header.get("Authorization"), "SDK-HMAC-SHA256 "
            + "Access=QTWAOYTTINDUT2QVKYUC, "
            + "SignedHeaders=host;x-sdk-date, "
            + "Signature=9972c77f43d1a1710bc50fbfcd914c60e24428a2c9769967e794b05bc24e6181");
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }

}
