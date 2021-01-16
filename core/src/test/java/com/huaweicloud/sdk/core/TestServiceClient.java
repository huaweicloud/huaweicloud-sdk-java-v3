package com.huaweicloud.sdk.core;

/**
 * TestServiceClient 为基础类，被 TestRegionWithProjectId 和 TestRegionWithNoProjectId 用例使用
 */
public class TestServiceClient {
    protected HcClient hcClient;

    public TestServiceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TestServiceClient> newBuilder() {
        return new ClientBuilder<>(TestServiceClient::new);
    }
}
