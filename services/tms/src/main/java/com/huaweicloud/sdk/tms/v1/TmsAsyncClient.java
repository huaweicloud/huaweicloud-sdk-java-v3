package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.tms.v1.model.CreatePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.CreatePredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.DeletePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.DeletePredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.tms.v1.model.ListPredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListPredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.tms.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.tms.v1.model.ListResourceRequest;
import com.huaweicloud.sdk.tms.v1.model.ListResourceResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagKeysRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagKeysResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagValuesRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagValuesResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowTagQuotaRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowTagQuotaResponse;
import com.huaweicloud.sdk.tms.v1.model.UpdatePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.UpdatePredefineTagsResponse;

import java.util.concurrent.CompletableFuture;

public class TmsAsyncClient {

    protected HcClient hcClient;

    public TmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TmsAsyncClient> newBuilder() {
        ClientBuilder<TmsAsyncClient> clientBuilder = new ClientBuilder<>(TmsAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 创建预定义标签
     *
     * 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePredefineTagsRequest 请求对象
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
     * @param request CreatePredefineTagsRequest 请求对象
     * @return AsyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse>
     */
    public AsyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTagsAsyncInvoker(
        CreatePredefineTagsRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.createPredefineTags, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 用于给云服务的多个资源添加标签，每个资源最多可添加10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
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
     * @param request CreateResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.createResourceTag, hcClient);
    }

    /**
     * 删除预定义标签
     *
     * 用于删除预定标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePredefineTagsRequest 请求对象
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
     * @param request DeletePredefineTagsRequest 请求对象
     * @return AsyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse>
     */
    public AsyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTagsAsyncInvoker(
        DeletePredefineTagsRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.deletePredefineTags, hcClient);
    }

    /**
     * 批量移除标签
     *
     * 用于批量移除云服务多个资源的标签，每个资源最多支持移除10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
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
     * @param request DeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.deleteResourceTag, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询标签管理服务的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
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
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询预定义标签列表
     *
     * 用于查询预定义标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefineTagsRequest 请求对象
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
     * @param request ListPredefineTagsRequest 请求对象
     * @return AsyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse>
     */
    public AsyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTagsAsyncInvoker(
        ListPredefineTagsRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.listPredefineTags, hcClient);
    }

    /**
     * 查询标签管理支持的服务
     *
     * 查询标签管理支持的服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
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
     * @param request ListProvidersRequest 请求对象
     * @return AsyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public AsyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersAsyncInvoker(
        ListProvidersRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.listProviders, hcClient);
    }

    /**
     * 根据标签过滤资源
     *
     * 根据标签过滤资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceRequest 请求对象
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
     * @param request ListResourceRequest 请求对象
     * @return AsyncInvoker<ListResourceRequest, ListResourceResponse>
     */
    public AsyncInvoker<ListResourceRequest, ListResourceResponse> listResourceAsyncInvoker(
        ListResourceRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.listResource, hcClient);
    }

    /**
     * 查询标签键列表
     *
     * 查询指定区域的所有标签键.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagKeysRequest 请求对象
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
     * @param request ListTagKeysRequest 请求对象
     * @return AsyncInvoker<ListTagKeysRequest, ListTagKeysResponse>
     */
    public AsyncInvoker<ListTagKeysRequest, ListTagKeysResponse> listTagKeysAsyncInvoker(ListTagKeysRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.listTagKeys, hcClient);
    }

    /**
     * 查询标签值列表
     *
     * 查询指定区域的标签键下的所有标签值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagValuesRequest 请求对象
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
     * @param request ListTagValuesRequest 请求对象
     * @return AsyncInvoker<ListTagValuesRequest, ListTagValuesResponse>
     */
    public AsyncInvoker<ListTagValuesRequest, ListTagValuesResponse> listTagValuesAsyncInvoker(
        ListTagValuesRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.listTagValues, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询指定区域和实例类型中租户的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listTags);
    }

    /**
     * 查询标签列表
     *
     * 查询指定区域和实例类型中租户的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.listTags, hcClient);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的标签管理服务API版本号详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
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
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.showApiVersion, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询单个资源上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
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
     * @param request ShowResourceTagRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.showResourceTag, hcClient);
    }

    /**
     * 查询标签配额
     *
     * 查询标签的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagQuotaRequest 请求对象
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
     * @param request ShowTagQuotaRequest 请求对象
     * @return AsyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse>
     */
    public AsyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse> showTagQuotaAsyncInvoker(
        ShowTagQuotaRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.showTagQuota, hcClient);
    }

    /**
     * 修改预定义标签
     *
     * 修改预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePredefineTagsRequest 请求对象
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
     * @param request UpdatePredefineTagsRequest 请求对象
     * @return AsyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse>
     */
    public AsyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTagsAsyncInvoker(
        UpdatePredefineTagsRequest request) {
        return new AsyncInvoker<>(request, TmsMeta.updatePredefineTags, hcClient);
    }

}
