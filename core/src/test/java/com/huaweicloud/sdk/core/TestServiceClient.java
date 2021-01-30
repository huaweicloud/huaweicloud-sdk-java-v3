package com.huaweicloud.sdk.core;

/**
 * TestServiceClient 为基础类，被 TestRegionEndpoint 和 TestRegionWithoutId 用例使用
 */
public class TestServiceClient {
    protected HcClient hcClient;

    public TestServiceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TestServiceClient> newBuilder() {
        return new ClientBuilder<>(TestServiceClient::new, "GlobalCredentials,BasicCredentials");
    }
}
