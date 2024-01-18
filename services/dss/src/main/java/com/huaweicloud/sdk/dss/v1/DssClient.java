package com.huaweicloud.sdk.dss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dss.v1.model.ListPoolsRequest;
import com.huaweicloud.sdk.dss.v1.model.ListPoolsResponse;
import com.huaweicloud.sdk.dss.v1.model.ListVersionRequest;
import com.huaweicloud.sdk.dss.v1.model.ListVersionResponse;
import com.huaweicloud.sdk.dss.v1.model.ShowPoolRequest;
import com.huaweicloud.sdk.dss.v1.model.ShowPoolResponse;
import com.huaweicloud.sdk.dss.v1.model.ShowVersionsRequest;
import com.huaweicloud.sdk.dss.v1.model.ShowVersionsResponse;

public class DssClient {

    protected HcClient hcClient;

    public DssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DssClient> newBuilder() {
        ClientBuilder<DssClient> clientBuilder = new ClientBuilder<>(DssClient::new);
        return clientBuilder;
    }

    /**
     * 获取专属存储详情列表
     *
     * 获取租户申请的专属分布式存储池详情列表，支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, DssMeta.listPools);
    }

    /**
     * 获取专属存储详情列表
     *
     * 获取租户申请的专属分布式存储池详情列表，支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return SyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public SyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsInvoker(ListPoolsRequest request) {
        return new SyncInvoker<>(request, DssMeta.listPools, hcClient);
    }

    /**
     * 查询版本号列表
     *
     * 获取版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionRequest 请求对象
     * @return ListVersionResponse
     */
    public ListVersionResponse listVersion(ListVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DssMeta.listVersion);
    }

    /**
     * 查询版本号列表
     *
     * 获取版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionRequest 请求对象
     * @return SyncInvoker<ListVersionRequest, ListVersionResponse>
     */
    public SyncInvoker<ListVersionRequest, ListVersionResponse> listVersionInvoker(ListVersionRequest request) {
        return new SyncInvoker<>(request, DssMeta.listVersion, hcClient);
    }

    /**
     * 获取单个专属存储池详情
     *
     * 获取单个专属存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return ShowPoolResponse
     */
    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, DssMeta.showPool);
    }

    /**
     * 获取单个专属存储池详情
     *
     * 获取单个专属存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return SyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public SyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolInvoker(ShowPoolRequest request) {
        return new SyncInvoker<>(request, DssMeta.showPool, hcClient);
    }

    /**
     * 查询指定版本号详情
     *
     * 查询指定版本号详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionsRequest 请求对象
     * @return ShowVersionsResponse
     */
    public ShowVersionsResponse showVersions(ShowVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DssMeta.showVersions);
    }

    /**
     * 查询指定版本号详情
     *
     * 查询指定版本号详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionsRequest 请求对象
     * @return SyncInvoker<ShowVersionsRequest, ShowVersionsResponse>
     */
    public SyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsInvoker(ShowVersionsRequest request) {
        return new SyncInvoker<>(request, DssMeta.showVersions, hcClient);
    }

}
