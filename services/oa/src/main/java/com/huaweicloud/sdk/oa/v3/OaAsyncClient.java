package com.huaweicloud.sdk.oa.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemListRequest;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemListResponse;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemResultRequest;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemResultResponse;
import com.huaweicloud.sdk.oa.v3.model.StartItemCheckRequest;
import com.huaweicloud.sdk.oa.v3.model.StartItemCheckResponse;

import java.util.concurrent.CompletableFuture;

public class OaAsyncClient {

    protected HcClient hcClient;

    public OaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OaAsyncClient> newBuilder() {
        ClientBuilder<OaAsyncClient> clientBuilder = new ClientBuilder<>(OaAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 获取可用性检查项列表
     *
     * 获取可用性检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckItemListRequest 请求对象
     * @return CompletableFuture<ShowCheckItemListResponse>
     */
    public CompletableFuture<ShowCheckItemListResponse> showCheckItemListAsync(ShowCheckItemListRequest request) {
        return hcClient.asyncInvokeHttp(request, OaMeta.showCheckItemList);
    }

    /**
     * 获取可用性检查项列表
     *
     * 获取可用性检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckItemListRequest 请求对象
     * @return AsyncInvoker<ShowCheckItemListRequest, ShowCheckItemListResponse>
     */
    public AsyncInvoker<ShowCheckItemListRequest, ShowCheckItemListResponse> showCheckItemListAsyncInvoker(
        ShowCheckItemListRequest request) {
        return new AsyncInvoker<ShowCheckItemListRequest, ShowCheckItemListResponse>(request, OaMeta.showCheckItemList,
            hcClient);
    }

    /**
     * 获取可用性检查项详情
     *
     * 获取可用性检查项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckItemResultRequest 请求对象
     * @return CompletableFuture<ShowCheckItemResultResponse>
     */
    public CompletableFuture<ShowCheckItemResultResponse> showCheckItemResultAsync(ShowCheckItemResultRequest request) {
        return hcClient.asyncInvokeHttp(request, OaMeta.showCheckItemResult);
    }

    /**
     * 获取可用性检查项详情
     *
     * 获取可用性检查项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckItemResultRequest 请求对象
     * @return AsyncInvoker<ShowCheckItemResultRequest, ShowCheckItemResultResponse>
     */
    public AsyncInvoker<ShowCheckItemResultRequest, ShowCheckItemResultResponse> showCheckItemResultAsyncInvoker(
        ShowCheckItemResultRequest request) {
        return new AsyncInvoker<ShowCheckItemResultRequest, ShowCheckItemResultResponse>(request,
            OaMeta.showCheckItemResult, hcClient);
    }

    /**
     * 启动单检查项检查
     *
     * 启动单检查项检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartItemCheckRequest 请求对象
     * @return CompletableFuture<StartItemCheckResponse>
     */
    public CompletableFuture<StartItemCheckResponse> startItemCheckAsync(StartItemCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, OaMeta.startItemCheck);
    }

    /**
     * 启动单检查项检查
     *
     * 启动单检查项检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartItemCheckRequest 请求对象
     * @return AsyncInvoker<StartItemCheckRequest, StartItemCheckResponse>
     */
    public AsyncInvoker<StartItemCheckRequest, StartItemCheckResponse> startItemCheckAsyncInvoker(
        StartItemCheckRequest request) {
        return new AsyncInvoker<StartItemCheckRequest, StartItemCheckResponse>(request, OaMeta.startItemCheck,
            hcClient);
    }

}
