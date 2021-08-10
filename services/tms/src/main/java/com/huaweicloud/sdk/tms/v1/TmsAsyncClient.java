package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.tms.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class TmsAsyncClient {

    protected HcClient hcClient;

    public TmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(TmsAsyncClient::new, "GlobalCredentials");
    }

    /** 创建预定义标签 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return CompletableFuture<CreatePredefineTagsResponse> */
    public CompletableFuture<CreatePredefineTagsResponse> createPredefineTagsAsync(CreatePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.createPredefineTags);
    }

    /** 创建预定义标签 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return AsyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse> */
    public AsyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTagsAsyncInvoker(
        CreatePredefineTagsRequest request) {
        return new AsyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse>(request,
            TmsMeta.createPredefineTags, hcClient);
    }

    /** 删除预定义标签 用于删除预定标签。
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return CompletableFuture<DeletePredefineTagsResponse> */
    public CompletableFuture<DeletePredefineTagsResponse> deletePredefineTagsAsync(DeletePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.deletePredefineTags);
    }

    /** 删除预定义标签 用于删除预定标签。
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return AsyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse> */
    public AsyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTagsAsyncInvoker(
        DeletePredefineTagsRequest request) {
        return new AsyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse>(request,
            TmsMeta.deletePredefineTags, hcClient);
    }

    /** 查询API版本列表 查询标签管理服务的API版本列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse> */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listApiVersions);
    }

    /** 查询API版本列表 查询标签管理服务的API版本列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, TmsMeta.listApiVersions,
            hcClient);
    }

    /** 查询预定义标签列表 用于查询预定义标签列表。
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return CompletableFuture<ListPredefineTagsResponse> */
    public CompletableFuture<ListPredefineTagsResponse> listPredefineTagsAsync(ListPredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listPredefineTags);
    }

    /** 查询预定义标签列表 用于查询预定义标签列表。
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return AsyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse> */
    public AsyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTagsAsyncInvoker(
        ListPredefineTagsRequest request) {
        return new AsyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse>(request, TmsMeta.listPredefineTags,
            hcClient);
    }

    /** 查询API版本号详情 查询指定的标签管理服务API版本号详情。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse> */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.showApiVersion);
    }

    /** 查询API版本号详情 查询指定的标签管理服务API版本号详情。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, TmsMeta.showApiVersion,
            hcClient);
    }

    /** 修改预定义标签 修改预定义标签。
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return CompletableFuture<UpdatePredefineTagsResponse> */
    public CompletableFuture<UpdatePredefineTagsResponse> updatePredefineTagsAsync(UpdatePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.updatePredefineTags);
    }

    /** 修改预定义标签 修改预定义标签。
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return AsyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> */
    public AsyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTagsAsyncInvoker(
        UpdatePredefineTagsRequest request) {
        return new AsyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse>(request,
            TmsMeta.updatePredefineTags, hcClient);
    }

}
