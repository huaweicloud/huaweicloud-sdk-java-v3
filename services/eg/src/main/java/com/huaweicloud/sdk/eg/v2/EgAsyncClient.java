package com.huaweicloud.sdk.eg.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eg.v2.model.PutEventsRequest;
import com.huaweicloud.sdk.eg.v2.model.PutEventsResponse;
import com.huaweicloud.sdk.eg.v2.model.PutOfficialEventsRequest;
import com.huaweicloud.sdk.eg.v2.model.PutOfficialEventsResponse;

import java.util.concurrent.CompletableFuture;

public class EgAsyncClient {

    protected HcClient hcClient;

    public EgAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EgAsyncClient> newBuilder() {
        ClientBuilder<EgAsyncClient> clientBuilder = new ClientBuilder<>(EgAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 用户自定义事件集成入口
     *
     * 用户自定义事件集成入口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutEventsRequest 请求对象
     * @return CompletableFuture<PutEventsResponse>
     */
    public CompletableFuture<PutEventsResponse> putEventsAsync(PutEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.putEvents);
    }

    /**
     * 用户自定义事件集成入口
     *
     * 用户自定义事件集成入口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutEventsRequest 请求对象
     * @return AsyncInvoker<PutEventsRequest, PutEventsResponse>
     */
    public AsyncInvoker<PutEventsRequest, PutEventsResponse> putEventsAsyncInvoker(PutEventsRequest request) {
        return new AsyncInvoker<PutEventsRequest, PutEventsResponse>(request, EgMeta.putEvents, hcClient);
    }

    /**
     * 发布官方事件到事件通道
     *
     * 发布官方事件到事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutOfficialEventsRequest 请求对象
     * @return CompletableFuture<PutOfficialEventsResponse>
     */
    public CompletableFuture<PutOfficialEventsResponse> putOfficialEventsAsync(PutOfficialEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.putOfficialEvents);
    }

    /**
     * 发布官方事件到事件通道
     *
     * 发布官方事件到事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutOfficialEventsRequest 请求对象
     * @return AsyncInvoker<PutOfficialEventsRequest, PutOfficialEventsResponse>
     */
    public AsyncInvoker<PutOfficialEventsRequest, PutOfficialEventsResponse> putOfficialEventsAsyncInvoker(
        PutOfficialEventsRequest request) {
        return new AsyncInvoker<PutOfficialEventsRequest, PutOfficialEventsResponse>(request, EgMeta.putOfficialEvents,
            hcClient);
    }

}
