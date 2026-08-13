package com.huaweicloud.sdk.rc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rc.v1.model.AddResourcesToGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.AddResourcesToGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.CollectAllResourcesSummaryRequest;
import com.huaweicloud.sdk.rc.v1.model.CollectAllResourcesSummaryResponse;
import com.huaweicloud.sdk.rc.v1.model.CountAllResourcesRequest;
import com.huaweicloud.sdk.rc.v1.model.CountAllResourcesResponse;
import com.huaweicloud.sdk.rc.v1.model.CreateResourceGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.CreateResourceGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.DeleteResourceGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.DeleteResourceGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.ListAllProvidersRequest;
import com.huaweicloud.sdk.rc.v1.model.ListAllProvidersResponse;
import com.huaweicloud.sdk.rc.v1.model.ListAllResourcesRequest;
import com.huaweicloud.sdk.rc.v1.model.ListAllResourcesResponse;
import com.huaweicloud.sdk.rc.v1.model.ListAllTagsRequest;
import com.huaweicloud.sdk.rc.v1.model.ListAllTagsResponse;
import com.huaweicloud.sdk.rc.v1.model.ListResourceGroupsRequest;
import com.huaweicloud.sdk.rc.v1.model.ListResourceGroupsResponse;
import com.huaweicloud.sdk.rc.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.rc.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.rc.v1.model.RemoveResourceFromGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.RemoveResourceFromGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceByIdRequest;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceByIdResponse;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceDetailRequest;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceDetailResponse;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceRelationsRequest;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceRelationsResponse;
import com.huaweicloud.sdk.rc.v1.model.UpdateResourceGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.UpdateResourceGroupResponse;

import java.util.concurrent.CompletableFuture;

public class RcAsyncClient {

    protected HcClient hcClient;

    public RcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RcAsyncClient> newBuilder() {
        ClientBuilder<RcAsyncClient> clientBuilder = new ClientBuilder<>(RcAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 将资源添加到资源组
     *
     * 将一个或多个资源添加到资源组，需要当前用户有resourcecenter:group:addResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddResourcesToGroupRequest 请求对象
     * @return CompletableFuture<AddResourcesToGroupResponse>
     */
    public CompletableFuture<AddResourcesToGroupResponse> addResourcesToGroupAsync(AddResourcesToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.addResourcesToGroup);
    }

    /**
     * 将资源添加到资源组
     *
     * 将一个或多个资源添加到资源组，需要当前用户有resourcecenter:group:addResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddResourcesToGroupRequest 请求对象
     * @return AsyncInvoker<AddResourcesToGroupRequest, AddResourcesToGroupResponse>
     */
    public AsyncInvoker<AddResourcesToGroupRequest, AddResourcesToGroupResponse> addResourcesToGroupAsyncInvoker(
        AddResourcesToGroupRequest request) {
        return new AsyncInvoker<>(request, RcMeta.addResourcesToGroup, hcClient);
    }

    /**
     * 创建资源分组
     *
     * 创建一个资源分组，需要当前用户有resourcecenter:group:create权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return CompletableFuture<CreateResourceGroupResponse>
     */
    public CompletableFuture<CreateResourceGroupResponse> createResourceGroupAsync(CreateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.createResourceGroup);
    }

    /**
     * 创建资源分组
     *
     * 创建一个资源分组，需要当前用户有resourcecenter:group:create权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>
     */
    public AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupAsyncInvoker(
        CreateResourceGroupRequest request) {
        return new AsyncInvoker<>(request, RcMeta.createResourceGroup, hcClient);
    }

    /**
     * 删除一个资源分组
     *
     * 删除一个资源分组，需要当前用户有resourcecenter:group:delete权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceGroupRequest 请求对象
     * @return CompletableFuture<DeleteResourceGroupResponse>
     */
    public CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroupAsync(DeleteResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.deleteResourceGroup);
    }

    /**
     * 删除一个资源分组
     *
     * 删除一个资源分组，需要当前用户有resourcecenter:group:delete权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceGroupRequest 请求对象
     * @return AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse>
     */
    public AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroupAsyncInvoker(
        DeleteResourceGroupRequest request) {
        return new AsyncInvoker<>(request, RcMeta.deleteResourceGroup, hcClient);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表，需要当前用户有resourcecenter:group:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsRequest 请求对象
     * @return CompletableFuture<ListResourceGroupsResponse>
     */
    public CompletableFuture<ListResourceGroupsResponse> listResourceGroupsAsync(ListResourceGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.listResourceGroups);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表，需要当前用户有resourcecenter:group:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsRequest 请求对象
     * @return AsyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse>
     */
    public AsyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse> listResourceGroupsAsyncInvoker(
        ListResourceGroupsRequest request) {
        return new AsyncInvoker<>(request, RcMeta.listResourceGroups, hcClient);
    }

    /**
     * 从资源组中移除资源
     *
     * 从资源组中移除一个资源，需要当前用户有resourcecenter:group:removeResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveResourceFromGroupRequest 请求对象
     * @return CompletableFuture<RemoveResourceFromGroupResponse>
     */
    public CompletableFuture<RemoveResourceFromGroupResponse> removeResourceFromGroupAsync(
        RemoveResourceFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.removeResourceFromGroup);
    }

    /**
     * 从资源组中移除资源
     *
     * 从资源组中移除一个资源，需要当前用户有resourcecenter:group:removeResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveResourceFromGroupRequest 请求对象
     * @return AsyncInvoker<RemoveResourceFromGroupRequest, RemoveResourceFromGroupResponse>
     */
    public AsyncInvoker<RemoveResourceFromGroupRequest, RemoveResourceFromGroupResponse> removeResourceFromGroupAsyncInvoker(
        RemoveResourceFromGroupRequest request) {
        return new AsyncInvoker<>(request, RcMeta.removeResourceFromGroup, hcClient);
    }

    /**
     * 查询一个资源分组
     *
     * 查询一个资源分组，需要当前用户有resourcecenter:group:get权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return CompletableFuture<ShowResourceGroupResponse>
     */
    public CompletableFuture<ShowResourceGroupResponse> showResourceGroupAsync(ShowResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.showResourceGroup);
    }

    /**
     * 查询一个资源分组
     *
     * 查询一个资源分组，需要当前用户有resourcecenter:group:get权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>
     */
    public AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupAsyncInvoker(
        ShowResourceGroupRequest request) {
        return new AsyncInvoker<>(request, RcMeta.showResourceGroup, hcClient);
    }

    /**
     * 修改一个资源分组
     *
     * 修改一个资源分组，需要当前用户有resourcecenter:group:update权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return CompletableFuture<UpdateResourceGroupResponse>
     */
    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroupAsync(UpdateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.updateResourceGroup);
    }

    /**
     * 修改一个资源分组
     *
     * 修改一个资源分组，需要当前用户有resourcecenter:group:update权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>
     */
    public AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupAsyncInvoker(
        UpdateResourceGroupRequest request) {
        return new AsyncInvoker<>(request, RcMeta.updateResourceGroup, hcClient);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，需要当前用户有resourcecenter::listResourceRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return CompletableFuture<ShowResourceRelationsResponse>
     */
    public CompletableFuture<ShowResourceRelationsResponse> showResourceRelationsAsync(
        ShowResourceRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.showResourceRelations);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，需要当前用户有resourcecenter::listResourceRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return AsyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>
     */
    public AsyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelationsAsyncInvoker(
        ShowResourceRelationsRequest request) {
        return new AsyncInvoker<>(request, RcMeta.showResourceRelations, hcClient);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览，需要当前用户有rc::listResourceSummary权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAllResourcesSummaryRequest 请求对象
     * @return CompletableFuture<CollectAllResourcesSummaryResponse>
     */
    public CompletableFuture<CollectAllResourcesSummaryResponse> collectAllResourcesSummaryAsync(
        CollectAllResourcesSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.collectAllResourcesSummary);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览，需要当前用户有rc::listResourceSummary权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAllResourcesSummaryRequest 请求对象
     * @return AsyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse>
     */
    public AsyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> collectAllResourcesSummaryAsyncInvoker(
        CollectAllResourcesSummaryRequest request) {
        return new AsyncInvoker<>(request, RcMeta.collectAllResourcesSummary, hcClient);
    }

    /**
     * 查询资源数量
     *
     * 查询资源数量，需要当前用户有resourcecenter::getResourceCount权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllResourcesRequest 请求对象
     * @return CompletableFuture<CountAllResourcesResponse>
     */
    public CompletableFuture<CountAllResourcesResponse> countAllResourcesAsync(CountAllResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.countAllResources);
    }

    /**
     * 查询资源数量
     *
     * 查询资源数量，需要当前用户有resourcecenter::getResourceCount权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllResourcesRequest 请求对象
     * @return AsyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse>
     */
    public AsyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse> countAllResourcesAsyncInvoker(
        CountAllResourcesRequest request) {
        return new AsyncInvoker<>(request, RcMeta.countAllResources, hcClient);
    }

    /**
     * 列举所有已对接的云服务
     *
     * 查询所有已对接RC的云服务、资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllProvidersRequest 请求对象
     * @return CompletableFuture<ListAllProvidersResponse>
     */
    public CompletableFuture<ListAllProvidersResponse> listAllProvidersAsync(ListAllProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.listAllProviders);
    }

    /**
     * 列举所有已对接的云服务
     *
     * 查询所有已对接RC的云服务、资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllProvidersRequest 请求对象
     * @return AsyncInvoker<ListAllProvidersRequest, ListAllProvidersResponse>
     */
    public AsyncInvoker<ListAllProvidersRequest, ListAllProvidersResponse> listAllProvidersAsyncInvoker(
        ListAllProvidersRequest request) {
        return new AsyncInvoker<>(request, RcMeta.listAllProviders, hcClient);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有resourcecenter::listResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllResourcesRequest 请求对象
     * @return CompletableFuture<ListAllResourcesResponse>
     */
    public CompletableFuture<ListAllResourcesResponse> listAllResourcesAsync(ListAllResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.listAllResources);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有resourcecenter::listResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllResourcesRequest 请求对象
     * @return AsyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>
     */
    public AsyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse> listAllResourcesAsyncInvoker(
        ListAllResourcesRequest request) {
        return new AsyncInvoker<>(request, RcMeta.listAllResources, hcClient);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签，需要当前用户有resourcecenter::listResourceTag权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return CompletableFuture<ListAllTagsResponse>
     */
    public CompletableFuture<ListAllTagsResponse> listAllTagsAsync(ListAllTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.listAllTags);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签，需要当前用户有resourcecenter::listResourceTag权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return AsyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public AsyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsAsyncInvoker(ListAllTagsRequest request) {
        return new AsyncInvoker<>(request, RcMeta.listAllTags, hcClient);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有resourcecenter::listResourceByType权限。比如查询云服务器，对应的RC资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.listResources);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有resourcecenter::listResourceByType权限。比如查询云服务器，对应的RC资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<>(request, RcMeta.listResources, hcClient);
    }

    /**
     * 查询指定类型的单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有resourcecenter::getResourceByType权限。比如查询云服务器，对应的RC资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
     * @return CompletableFuture<ShowResourceByIdResponse>
     */
    public CompletableFuture<ShowResourceByIdResponse> showResourceByIdAsync(ShowResourceByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.showResourceById);
    }

    /**
     * 查询指定类型的单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有resourcecenter::getResourceByType权限。比如查询云服务器，对应的RC资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
     * @return AsyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>
     */
    public AsyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceByIdAsyncInvoker(
        ShowResourceByIdRequest request) {
        return new AsyncInvoker<>(request, RcMeta.showResourceById, hcClient);
    }

    /**
     * 查询单个资源
     *
     * 查询当前帐号下的单个资源，需要当前用户有resourcecenter::getResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return CompletableFuture<ShowResourceDetailResponse>
     */
    public CompletableFuture<ShowResourceDetailResponse> showResourceDetailAsync(ShowResourceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RcMeta.showResourceDetail);
    }

    /**
     * 查询单个资源
     *
     * 查询当前帐号下的单个资源，需要当前用户有resourcecenter::getResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return AsyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse>
     */
    public AsyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetailAsyncInvoker(
        ShowResourceDetailRequest request) {
        return new AsyncInvoker<>(request, RcMeta.showResourceDetail, hcClient);
    }

}
