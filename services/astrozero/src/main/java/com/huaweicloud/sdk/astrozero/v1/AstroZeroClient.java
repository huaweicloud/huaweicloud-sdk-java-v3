package com.huaweicloud.sdk.astrozero.v1;

import com.huaweicloud.sdk.astrozero.v1.model.ShowOrderStatusRequest;
import com.huaweicloud.sdk.astrozero.v1.model.ShowOrderStatusResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AstroZeroClient {

    protected HcClient hcClient;

    public AstroZeroClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AstroZeroClient> newBuilder() {
        ClientBuilder<AstroZeroClient> clientBuilder = new ClientBuilder<>(AstroZeroClient::new);
        return clientBuilder;
    }

    /**
     * 查询活动时间内租户开通情况
     *
     * 查询活动时间租户开通情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderStatusRequest 请求对象
     * @return ShowOrderStatusResponse
     */
    public ShowOrderStatusResponse showOrderStatus(ShowOrderStatusRequest request) {
        return hcClient.syncInvokeHttp(request, AstroZeroMeta.showOrderStatus);
    }

    /**
     * 查询活动时间内租户开通情况
     *
     * 查询活动时间租户开通情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderStatusRequest 请求对象
     * @return SyncInvoker<ShowOrderStatusRequest, ShowOrderStatusResponse>
     */
    public SyncInvoker<ShowOrderStatusRequest, ShowOrderStatusResponse> showOrderStatusInvoker(
        ShowOrderStatusRequest request) {
        return new SyncInvoker<>(request, AstroZeroMeta.showOrderStatus, hcClient);
    }

}
