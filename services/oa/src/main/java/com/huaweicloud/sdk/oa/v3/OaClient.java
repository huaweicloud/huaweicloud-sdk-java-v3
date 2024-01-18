package com.huaweicloud.sdk.oa.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemListRequest;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemListResponse;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemResultRequest;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemResultResponse;
import com.huaweicloud.sdk.oa.v3.model.StartItemCheckRequest;
import com.huaweicloud.sdk.oa.v3.model.StartItemCheckResponse;

public class OaClient {

    protected HcClient hcClient;

    public OaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OaClient> newBuilder() {
        ClientBuilder<OaClient> clientBuilder = new ClientBuilder<>(OaClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 获取可用性检查项列表
     *
     * 获取可用性检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckItemListRequest 请求对象
     * @return ShowCheckItemListResponse
     */
    public ShowCheckItemListResponse showCheckItemList(ShowCheckItemListRequest request) {
        return hcClient.syncInvokeHttp(request, OaMeta.showCheckItemList);
    }

    /**
     * 获取可用性检查项列表
     *
     * 获取可用性检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckItemListRequest 请求对象
     * @return SyncInvoker<ShowCheckItemListRequest, ShowCheckItemListResponse>
     */
    public SyncInvoker<ShowCheckItemListRequest, ShowCheckItemListResponse> showCheckItemListInvoker(
        ShowCheckItemListRequest request) {
        return new SyncInvoker<>(request, OaMeta.showCheckItemList, hcClient);
    }

    /**
     * 获取可用性检查项详情
     *
     * 获取可用性检查项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckItemResultRequest 请求对象
     * @return ShowCheckItemResultResponse
     */
    public ShowCheckItemResultResponse showCheckItemResult(ShowCheckItemResultRequest request) {
        return hcClient.syncInvokeHttp(request, OaMeta.showCheckItemResult);
    }

    /**
     * 获取可用性检查项详情
     *
     * 获取可用性检查项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckItemResultRequest 请求对象
     * @return SyncInvoker<ShowCheckItemResultRequest, ShowCheckItemResultResponse>
     */
    public SyncInvoker<ShowCheckItemResultRequest, ShowCheckItemResultResponse> showCheckItemResultInvoker(
        ShowCheckItemResultRequest request) {
        return new SyncInvoker<>(request, OaMeta.showCheckItemResult, hcClient);
    }

    /**
     * 启动单检查项检查
     *
     * 启动单检查项检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartItemCheckRequest 请求对象
     * @return StartItemCheckResponse
     */
    public StartItemCheckResponse startItemCheck(StartItemCheckRequest request) {
        return hcClient.syncInvokeHttp(request, OaMeta.startItemCheck);
    }

    /**
     * 启动单检查项检查
     *
     * 启动单检查项检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartItemCheckRequest 请求对象
     * @return SyncInvoker<StartItemCheckRequest, StartItemCheckResponse>
     */
    public SyncInvoker<StartItemCheckRequest, StartItemCheckResponse> startItemCheckInvoker(
        StartItemCheckRequest request) {
        return new SyncInvoker<>(request, OaMeta.startItemCheck, hcClient);
    }

}
