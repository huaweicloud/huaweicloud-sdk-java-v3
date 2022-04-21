package com.huaweicloud.sdk.sa.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sa.v1.model.*;

public class SaClient {

    protected HcClient hcClient;

    public SaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SaClient> newBuilder() {
        return new ClientBuilder<>(SaClient::new);
    }

    /**
     * 检查心跳健康
     *
     * SA提供心跳接口，集成产品定时（例如：每五分钟）发送心跳报文到SA，用来确认集成产品与SA之间的通路是否健康。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckProductHealthyRequest 请求对象
     * @return CheckProductHealthyResponse
     */
    public CheckProductHealthyResponse checkProductHealthy(CheckProductHealthyRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.checkProductHealthy);
    }

    /**
     * 检查心跳健康
     *
     * SA提供心跳接口，集成产品定时（例如：每五分钟）发送心跳报文到SA，用来确认集成产品与SA之间的通路是否健康。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckProductHealthyRequest 请求对象
     * @return SyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse>
     */
    public SyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse> checkProductHealthyInvoker(
        CheckProductHealthyRequest request) {
        return new SyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse>(request,
            SaMeta.checkProductHealthy, hcClient);
    }

    /**
     * 上报安全产品数据(V2)
     *
     * 批量数据上报，每批次最多不超过50条。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportEventsRequest 请求对象
     * @return ImportEventsResponse
     */
    public ImportEventsResponse importEvents(ImportEventsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.importEvents);
    }

    /**
     * 上报安全产品数据(V2)
     *
     * 批量数据上报，每批次最多不超过50条。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportEventsRequest 请求对象
     * @return SyncInvoker<ImportEventsRequest, ImportEventsResponse>
     */
    public SyncInvoker<ImportEventsRequest, ImportEventsResponse> importEventsInvoker(ImportEventsRequest request) {
        return new SyncInvoker<ImportEventsRequest, ImportEventsResponse>(request, SaMeta.importEvents, hcClient);
    }

}
