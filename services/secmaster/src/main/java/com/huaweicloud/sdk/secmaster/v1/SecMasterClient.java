package com.huaweicloud.sdk.secmaster.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.secmaster.v1.model.CheckProductHealthyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CheckProductHealthyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportEventsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportEventsResponse;

public class SecMasterClient {

    protected HcClient hcClient;

    public SecMasterClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SecMasterClient> newBuilder() {
        ClientBuilder<SecMasterClient> clientBuilder = new ClientBuilder<>(SecMasterClient::new);
        return clientBuilder;
    }

    /**
     * 检查心跳健康（仅支持华北-北京四使用）
     *
     * SA提供心跳接口，集成产品定时（每五分钟）发送心跳报文到态势感知，用来确认集成产品与态势感知之间的通路是否健康。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckProductHealthyRequest 请求对象
     * @return CheckProductHealthyResponse
     */
    public CheckProductHealthyResponse checkProductHealthy(CheckProductHealthyRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.checkProductHealthy);
    }

    /**
     * 检查心跳健康（仅支持华北-北京四使用）
     *
     * SA提供心跳接口，集成产品定时（每五分钟）发送心跳报文到态势感知，用来确认集成产品与态势感知之间的通路是否健康。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckProductHealthyRequest 请求对象
     * @return SyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse>
     */
    public SyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse> checkProductHealthyInvoker(
        CheckProductHealthyRequest request) {
        return new SyncInvoker<CheckProductHealthyRequest, CheckProductHealthyResponse>(request,
            SecMasterMeta.checkProductHealthy, hcClient);
    }

    /**
     * 上报安全产品数据（仅支持华北-北京四使用）
     *
     * 批量数据上报，每批次最多不超过50条。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportEventsRequest 请求对象
     * @return ImportEventsResponse
     */
    public ImportEventsResponse importEvents(ImportEventsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importEvents);
    }

    /**
     * 上报安全产品数据（仅支持华北-北京四使用）
     *
     * 批量数据上报，每批次最多不超过50条。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportEventsRequest 请求对象
     * @return SyncInvoker<ImportEventsRequest, ImportEventsResponse>
     */
    public SyncInvoker<ImportEventsRequest, ImportEventsResponse> importEventsInvoker(ImportEventsRequest request) {
        return new SyncInvoker<ImportEventsRequest, ImportEventsResponse>(request, SecMasterMeta.importEvents,
            hcClient);
    }

}
