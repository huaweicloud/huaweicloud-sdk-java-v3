package com.huaweicloud.sdk.dss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dss.v1.model.ListPoolsRequest;
import com.huaweicloud.sdk.dss.v1.model.ListPoolsResponse;
import com.huaweicloud.sdk.dss.v1.model.ListVersionRequest;
import com.huaweicloud.sdk.dss.v1.model.ListVersionResponse;
import com.huaweicloud.sdk.dss.v1.model.ShowPoolRequest;
import com.huaweicloud.sdk.dss.v1.model.ShowPoolResponse;
import com.huaweicloud.sdk.dss.v1.model.ShowVersionsRequest;
import com.huaweicloud.sdk.dss.v1.model.ShowVersionsResponse;

import java.util.concurrent.CompletableFuture;

public class DssAsyncClient {

    protected HcClient hcClient;

    public DssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DssAsyncClient> newBuilder() {
        ClientBuilder<DssAsyncClient> clientBuilder = new ClientBuilder<>(DssAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 获取专属存储详情列表
     *
     * 获取租户申请的专属分布式存储池详情列表，支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoolsRequest 请求对象
     * @return CompletableFuture<ListPoolsResponse>
     */
    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, DssMeta.listPools);
    }

    /**
     * 获取专属存储详情列表
     *
     * 获取租户申请的专属分布式存储池详情列表，支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoolsRequest 请求对象
     * @return AsyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public AsyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsAsyncInvoker(ListPoolsRequest request) {
        return new AsyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, DssMeta.listPools, hcClient);
    }

    /**
     * 查询版本号列表
     *
     * 获取版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionRequest 请求对象
     * @return CompletableFuture<ListVersionResponse>
     */
    public CompletableFuture<ListVersionResponse> listVersionAsync(ListVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DssMeta.listVersion);
    }

    /**
     * 查询版本号列表
     *
     * 获取版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionRequest 请求对象
     * @return AsyncInvoker<ListVersionRequest, ListVersionResponse>
     */
    public AsyncInvoker<ListVersionRequest, ListVersionResponse> listVersionAsyncInvoker(ListVersionRequest request) {
        return new AsyncInvoker<ListVersionRequest, ListVersionResponse>(request, DssMeta.listVersion, hcClient);
    }

    /**
     * 获取单个专属存储池详情
     *
     * 获取单个专属存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPoolRequest 请求对象
     * @return CompletableFuture<ShowPoolResponse>
     */
    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, DssMeta.showPool);
    }

    /**
     * 获取单个专属存储池详情
     *
     * 获取单个专属存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPoolRequest 请求对象
     * @return AsyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public AsyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolAsyncInvoker(ShowPoolRequest request) {
        return new AsyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, DssMeta.showPool, hcClient);
    }

    /**
     * 查询指定版本号详情
     *
     * 查询指定版本号详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionsRequest 请求对象
     * @return CompletableFuture<ShowVersionsResponse>
     */
    public CompletableFuture<ShowVersionsResponse> showVersionsAsync(ShowVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DssMeta.showVersions);
    }

    /**
     * 查询指定版本号详情
     *
     * 查询指定版本号详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionsRequest 请求对象
     * @return AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse>
     */
    public AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsAsyncInvoker(
        ShowVersionsRequest request) {
        return new AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse>(request, DssMeta.showVersions, hcClient);
    }

}
