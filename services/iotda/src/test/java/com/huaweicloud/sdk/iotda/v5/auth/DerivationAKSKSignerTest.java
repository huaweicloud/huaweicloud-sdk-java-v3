package com.huaweicloud.sdk.iotda.v5.auth;

import com.huaweicloud.sdk.core.auth.AKSKSigner;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Map;

/**
 * @deprecated Deprecated test class.
 */
@Deprecated
public class DerivationAKSKSignerTest {

    @org.junit.Test
    public void testSign() {
        IoTDACredentials credentials = new IoTDACredentials()
            .withAk("testAK")
            .withSk("testSK")
            .withProjectId("77b6a44cba5143ab91d13ab9a8ff44fd");

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        HttpRequest httpRequest = requestBuilder.withEndpoint("https://service.region.example.com")
            .withMethod(HttpMethod.GET)
            .withContentType("application/json")
            .withPath("/v5/iotps/77b6a44cba5143ab91d13ab9a8ff44fd/certificates")
            .addHeader("X-Sdk-Date", "20191115T033655Z")
            .addQueryParam("limit", Arrays.asList("2"))
            .addQueryParam("marker", Arrays.asList("13551d6b-755d-4757-b956-536f674975c0")).build();
        System.out.println(httpRequest.getUrl().toString());

        Map<String, String> header = AKSKSigner.getInstance().sign(httpRequest, credentials);

        header.forEach((key, value) -> System.out.println(key + ":" + value));

        Assert.assertEquals("SDK-HMAC-SHA256 "
            + "Access=testAK, "
            + "SignedHeaders=host;x-sdk-date, "
            + "Signature=cf461fb1e37cf404d70208a03be7d37d1b395fea3d1ae9dc8175f6cf9cab2e31",
            header.get("Authorization"));
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }
}