package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.tms.v1.model.*;

public class TmsAsyncClient {
    protected HcClient hcClient;

    public TmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(TmsAsyncClient::new, "GlobalCredentials");
    }


    /**
     * 创建预定义标签
     * 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return CompletableFuture<CreatePredefineTagsResponse>
     */
    public CompletableFuture<CreatePredefineTagsResponse> createPredefineTagsAsync(CreatePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.createPredefineTags);
    }

    /**
     * 删除预定义标签
     * 用于删除预定标签。
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return CompletableFuture<DeletePredefineTagsResponse>
     */
    public CompletableFuture<DeletePredefineTagsResponse> deletePredefineTagsAsync(DeletePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.deletePredefineTags);
    }

    /**
     * 查询API版本列表
     * 查询标签管理服务的API版本列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listApiVersions);
    }

    /**
     * 查询预定义标签列表
     * 用于查询预定义标签列表。
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return CompletableFuture<ListPredefineTagsResponse>
     */
    public CompletableFuture<ListPredefineTagsResponse> listPredefineTagsAsync(ListPredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listPredefineTags);
    }

    /**
     * 查询API版本号详情
     * 查询指定的标签管理服务API版本号详情。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.showApiVersion);
    }

    /**
     * 修改预定义标签
     * 修改预定义标签。
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return CompletableFuture<UpdatePredefineTagsResponse>
     */
    public CompletableFuture<UpdatePredefineTagsResponse> updatePredefineTagsAsync(UpdatePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.updatePredefineTags);
    }

}