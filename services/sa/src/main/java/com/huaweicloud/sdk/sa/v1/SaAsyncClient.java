package com.huaweicloud.sdk.sa.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sa.v1.model.*;

public class SaAsyncClient {
    protected HcClient hcClient;

    public SaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SaAsyncClient> newBuilder() {
        return new ClientBuilder<>(SaAsyncClient::new);
    }


    /**
     * 检查心跳健康
     * SA提供心跳接口，集成产品定时（例如：每五分钟）发送心跳报文到SA，用来确认集成产品与SA之间的通路是否健康。
     *
     * @param CheckProductHealthyRequest 请求对象
     * @return CompletableFuture<CheckProductHealthyResponse>
     */
    public CompletableFuture<CheckProductHealthyResponse> checkProductHealthyAsync(CheckProductHealthyRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.checkProductHealthy);
    }

    /**
     * 检查心跳健康
     * SA提供心跳接口，集成产品定时（例如：每五分钟）发送心跳报文到SA，用来确认集成产品与SA之间的通路是否健康。
     *
     * @param CheckProductHealthyRequest 请求对象
     * @return AsyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse>
     */
    public AsyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse> checkProductHealthyAsyncInvoker(CheckProductHealthyRequest request) {
        return new AsyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse>(request, SaMeta.checkProductHealthy, hcClient);
    }

    /**
     * 上报安全产品数据
     * 批量数据上报，每批次最多不超过50条。
     *
     * @param ImportEventsRequest 请求对象
     * @return CompletableFuture<ImportEventsResponse>
     */
    public CompletableFuture<ImportEventsResponse> importEventsAsync(ImportEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.importEvents);
    }

    /**
     * 上报安全产品数据
     * 批量数据上报，每批次最多不超过50条。
     *
     * @param ImportEventsRequest 请求对象
     * @return AsyncInvoker<ImportEventsRequest, ImportEventsResponse>
     */
    public AsyncInvoker<ImportEventsRequest, ImportEventsResponse> importEventsAsyncInvoker(ImportEventsRequest request) {
        return new AsyncInvoker<ImportEventsRequest, ImportEventsResponse>(request, SaMeta.importEvents, hcClient);
    }

}