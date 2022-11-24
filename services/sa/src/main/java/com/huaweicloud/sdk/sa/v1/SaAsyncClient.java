package com.huaweicloud.sdk.sa.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sa.v1.model.*;

import java.util.concurrent.CompletableFuture;

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
     *
     * SA提供心跳接口，集成产品定时（每五分钟）发送心跳报文到态势感知，用来确认集成产品与态势感知之间的通路是否健康。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckProductHealthyRequest 请求对象
     * @return CompletableFuture<CheckProductHealthyResponse>
     */
    public CompletableFuture<CheckProductHealthyResponse> checkProductHealthyAsync(CheckProductHealthyRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.checkProductHealthy);
    }

    /**
     * 检查心跳健康
     *
     * SA提供心跳接口，集成产品定时（每五分钟）发送心跳报文到态势感知，用来确认集成产品与态势感知之间的通路是否健康。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckProductHealthyRequest 请求对象
     * @return AsyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse>
     */
    public AsyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse> checkProductHealthyAsyncInvoker(
        CheckProductHealthyRequest request) {
        return new AsyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse>(request,
            SaMeta.checkProductHealthy, hcClient);
    }

    /**
     * 上报安全产品数据
     *
     * 批量数据上报，每批次最多不超过50条。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportEventsRequest 请求对象
     * @return CompletableFuture<ImportEventsResponse>
     */
    public CompletableFuture<ImportEventsResponse> importEventsAsync(ImportEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.importEvents);
    }

    /**
     * 上报安全产品数据
     *
     * 批量数据上报，每批次最多不超过50条。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportEventsRequest 请求对象
     * @return AsyncInvoker<ImportEventsRequest, ImportEventsResponse>
     */
    public AsyncInvoker<ImportEventsRequest, ImportEventsResponse> importEventsAsyncInvoker(
        ImportEventsRequest request) {
        return new AsyncInvoker<ImportEventsRequest, ImportEventsResponse>(request, SaMeta.importEvents, hcClient);
    }

}
