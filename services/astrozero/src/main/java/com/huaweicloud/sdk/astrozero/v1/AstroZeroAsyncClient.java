package com.huaweicloud.sdk.astrozero.v1;

import com.huaweicloud.sdk.astrozero.v1.model.ShowOrderStatusRequest;
import com.huaweicloud.sdk.astrozero.v1.model.ShowOrderStatusResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AstroZeroAsyncClient {

    protected HcClient hcClient;

    public AstroZeroAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AstroZeroAsyncClient> newBuilder() {
        ClientBuilder<AstroZeroAsyncClient> clientBuilder = new ClientBuilder<>(AstroZeroAsyncClient::new);
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
     * @return CompletableFuture<ShowOrderStatusResponse>
     */
    public CompletableFuture<ShowOrderStatusResponse> showOrderStatusAsync(ShowOrderStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, AstroZeroMeta.showOrderStatus);
    }

    /**
     * 查询活动时间内租户开通情况
     *
     * 查询活动时间租户开通情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderStatusRequest 请求对象
     * @return AsyncInvoker<ShowOrderStatusRequest, ShowOrderStatusResponse>
     */
    public AsyncInvoker<ShowOrderStatusRequest, ShowOrderStatusResponse> showOrderStatusAsyncInvoker(
        ShowOrderStatusRequest request) {
        return new AsyncInvoker<>(request, AstroZeroMeta.showOrderStatus, hcClient);
    }

}
