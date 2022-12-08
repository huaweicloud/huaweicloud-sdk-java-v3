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

    /**
     * 创建预定义标签
     *
     * 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return CompletableFuture<CreatePredefineTagsResponse>
     */
    public CompletableFuture<CreatePredefineTagsResponse> createPredefineTagsAsync(CreatePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.createPredefineTags);
    }

    /**
     * 创建预定义标签
     *
     * 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return AsyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse>
     */
    public AsyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTagsAsyncInvoker(
        CreatePredefineTagsRequest request) {
        return new AsyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse>(request,
            TmsMeta.createPredefineTags, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 用于给云服务的多个资源添加标签，每个资源最多可添加10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
     * @return CompletableFuture<CreateResourceTagResponse>
     */
    public CompletableFuture<CreateResourceTagResponse> createResourceTagAsync(CreateResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.createResourceTag);
    }

    /**
     * 批量添加标签
     *
     * 用于给云服务的多个资源添加标签，每个资源最多可添加10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, TmsMeta.createResourceTag,
            hcClient);
    }

    /**
     * 删除预定义标签
     *
     * 用于删除预定标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return CompletableFuture<DeletePredefineTagsResponse>
     */
    public CompletableFuture<DeletePredefineTagsResponse> deletePredefineTagsAsync(DeletePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.deletePredefineTags);
    }

    /**
     * 删除预定义标签
     *
     * 用于删除预定标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return AsyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse>
     */
    public AsyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTagsAsyncInvoker(
        DeletePredefineTagsRequest request) {
        return new AsyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse>(request,
            TmsMeta.deletePredefineTags, hcClient);
    }

    /**
     * 批量移除标签
     *
     * 用于批量移除云服务多个资源的标签，每个资源最多支持移除10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return CompletableFuture<DeleteResourceTagResponse>
     */
    public CompletableFuture<DeleteResourceTagResponse> deleteResourceTagAsync(DeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.deleteResourceTag);
    }

    /**
     * 批量移除标签
     *
     * 用于批量移除云服务多个资源的标签，每个资源最多支持移除10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, TmsMeta.deleteResourceTag,
            hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询标签管理服务的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询标签管理服务的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, TmsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询预定义标签列表
     *
     * 用于查询预定义标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return CompletableFuture<ListPredefineTagsResponse>
     */
    public CompletableFuture<ListPredefineTagsResponse> listPredefineTagsAsync(ListPredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listPredefineTags);
    }

    /**
     * 查询预定义标签列表
     *
     * 用于查询预定义标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return AsyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse>
     */
    public AsyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTagsAsyncInvoker(
        ListPredefineTagsRequest request) {
        return new AsyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse>(request, TmsMeta.listPredefineTags,
            hcClient);
    }

    /**
     * 查询标签管理支持的服务
     *
     * 查询标签管理支持的服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProvidersRequest 请求对象
     * @return CompletableFuture<ListProvidersResponse>
     */
    public CompletableFuture<ListProvidersResponse> listProvidersAsync(ListProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listProviders);
    }

    /**
     * 查询标签管理支持的服务
     *
     * 查询标签管理支持的服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProvidersRequest 请求对象
     * @return AsyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public AsyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersAsyncInvoker(
        ListProvidersRequest request) {
        return new AsyncInvoker<ListProvidersRequest, ListProvidersResponse>(request, TmsMeta.listProviders, hcClient);
    }

    /**
     * 根据标签过滤资源
     *
     * 根据标签过滤资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceRequest 请求对象
     * @return CompletableFuture<ListResourceResponse>
     */
    public CompletableFuture<ListResourceResponse> listResourceAsync(ListResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listResource);
    }

    /**
     * 根据标签过滤资源
     *
     * 根据标签过滤资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceRequest 请求对象
     * @return AsyncInvoker<ListResourceRequest, ListResourceResponse>
     */
    public AsyncInvoker<ListResourceRequest, ListResourceResponse> listResourceAsyncInvoker(
        ListResourceRequest request) {
        return new AsyncInvoker<ListResourceRequest, ListResourceResponse>(request, TmsMeta.listResource, hcClient);
    }

    /**
     * 查询标签键列表
     *
     * 查询指定区域的所有标签键.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagKeysRequest 请求对象
     * @return CompletableFuture<ListTagKeysResponse>
     */
    public CompletableFuture<ListTagKeysResponse> listTagKeysAsync(ListTagKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listTagKeys);
    }

    /**
     * 查询标签键列表
     *
     * 查询指定区域的所有标签键.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagKeysRequest 请求对象
     * @return AsyncInvoker<ListTagKeysRequest, ListTagKeysResponse>
     */
    public AsyncInvoker<ListTagKeysRequest, ListTagKeysResponse> listTagKeysAsyncInvoker(ListTagKeysRequest request) {
        return new AsyncInvoker<ListTagKeysRequest, ListTagKeysResponse>(request, TmsMeta.listTagKeys, hcClient);
    }

    /**
     * 查询标签值列表
     *
     * 查询指定区域的标签键下的所有标签值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagValuesRequest 请求对象
     * @return CompletableFuture<ListTagValuesResponse>
     */
    public CompletableFuture<ListTagValuesResponse> listTagValuesAsync(ListTagValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listTagValues);
    }

    /**
     * 查询标签值列表
     *
     * 查询指定区域的标签键下的所有标签值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagValuesRequest 请求对象
     * @return AsyncInvoker<ListTagValuesRequest, ListTagValuesResponse>
     */
    public AsyncInvoker<ListTagValuesRequest, ListTagValuesResponse> listTagValuesAsyncInvoker(
        ListTagValuesRequest request) {
        return new AsyncInvoker<ListTagValuesRequest, ListTagValuesResponse>(request, TmsMeta.listTagValues, hcClient);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的标签管理服务API版本号详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.showApiVersion);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的标签管理服务API版本号详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, TmsMeta.showApiVersion,
            hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询单个资源上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return CompletableFuture<ShowResourceTagResponse>
     */
    public CompletableFuture<ShowResourceTagResponse> showResourceTagAsync(ShowResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.showResourceTag);
    }

    /**
     * 查询资源标签
     *
     * 查询单个资源上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, TmsMeta.showResourceTag,
            hcClient);
    }

    /**
     * 查询标签配额
     *
     * 查询标签的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagQuotaRequest 请求对象
     * @return CompletableFuture<ShowTagQuotaResponse>
     */
    public CompletableFuture<ShowTagQuotaResponse> showTagQuotaAsync(ShowTagQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.showTagQuota);
    }

    /**
     * 查询标签配额
     *
     * 查询标签的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagQuotaRequest 请求对象
     * @return AsyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse>
     */
    public AsyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse> showTagQuotaAsyncInvoker(
        ShowTagQuotaRequest request) {
        return new AsyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse>(request, TmsMeta.showTagQuota, hcClient);
    }

    /**
     * 修改预定义标签
     *
     * 修改预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return CompletableFuture<UpdatePredefineTagsResponse>
     */
    public CompletableFuture<UpdatePredefineTagsResponse> updatePredefineTagsAsync(UpdatePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.updatePredefineTags);
    }

    /**
     * 修改预定义标签
     *
     * 修改预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return AsyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse>
     */
    public AsyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTagsAsyncInvoker(
        UpdatePredefineTagsRequest request) {
        return new AsyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse>(request,
            TmsMeta.updatePredefineTags, hcClient);
    }

}
