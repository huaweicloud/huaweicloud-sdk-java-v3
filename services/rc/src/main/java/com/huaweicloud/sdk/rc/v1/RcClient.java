package com.huaweicloud.sdk.rc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class RcClient {

    protected HcClient hcClient;

    public RcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RcClient> newBuilder() {
        ClientBuilder<RcClient> clientBuilder = new ClientBuilder<>(RcClient::new, "GlobalCredentials");
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
     * @return AddResourcesToGroupResponse
     */
    public AddResourcesToGroupResponse addResourcesToGroup(AddResourcesToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.addResourcesToGroup);
    }

    /**
     * 将资源添加到资源组
     *
     * 将一个或多个资源添加到资源组，需要当前用户有resourcecenter:group:addResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddResourcesToGroupRequest 请求对象
     * @return SyncInvoker<AddResourcesToGroupRequest, AddResourcesToGroupResponse>
     */
    public SyncInvoker<AddResourcesToGroupRequest, AddResourcesToGroupResponse> addResourcesToGroupInvoker(
        AddResourcesToGroupRequest request) {
        return new SyncInvoker<>(request, RcMeta.addResourcesToGroup, hcClient);
    }

    /**
     * 创建资源分组
     *
     * 创建一个资源分组，需要当前用户有resourcecenter:group:create权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.createResourceGroup);
    }

    /**
     * 创建资源分组
     *
     * 创建一个资源分组，需要当前用户有resourcecenter:group:create权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>
     */
    public SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupInvoker(
        CreateResourceGroupRequest request) {
        return new SyncInvoker<>(request, RcMeta.createResourceGroup, hcClient);
    }

    /**
     * 删除一个资源分组
     *
     * 删除一个资源分组，需要当前用户有resourcecenter:group:delete权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceGroupRequest 请求对象
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.deleteResourceGroup);
    }

    /**
     * 删除一个资源分组
     *
     * 删除一个资源分组，需要当前用户有resourcecenter:group:delete权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceGroupRequest 请求对象
     * @return SyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse>
     */
    public SyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroupInvoker(
        DeleteResourceGroupRequest request) {
        return new SyncInvoker<>(request, RcMeta.deleteResourceGroup, hcClient);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表，需要当前用户有resourcecenter:group:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsRequest 请求对象
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.listResourceGroups);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表，需要当前用户有resourcecenter:group:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsRequest 请求对象
     * @return SyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse>
     */
    public SyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse> listResourceGroupsInvoker(
        ListResourceGroupsRequest request) {
        return new SyncInvoker<>(request, RcMeta.listResourceGroups, hcClient);
    }

    /**
     * 从资源组中移除资源
     *
     * 从资源组中移除一个资源，需要当前用户有resourcecenter:group:removeResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveResourceFromGroupRequest 请求对象
     * @return RemoveResourceFromGroupResponse
     */
    public RemoveResourceFromGroupResponse removeResourceFromGroup(RemoveResourceFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.removeResourceFromGroup);
    }

    /**
     * 从资源组中移除资源
     *
     * 从资源组中移除一个资源，需要当前用户有resourcecenter:group:removeResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveResourceFromGroupRequest 请求对象
     * @return SyncInvoker<RemoveResourceFromGroupRequest, RemoveResourceFromGroupResponse>
     */
    public SyncInvoker<RemoveResourceFromGroupRequest, RemoveResourceFromGroupResponse> removeResourceFromGroupInvoker(
        RemoveResourceFromGroupRequest request) {
        return new SyncInvoker<>(request, RcMeta.removeResourceFromGroup, hcClient);
    }

    /**
     * 查询一个资源分组
     *
     * 查询一个资源分组，需要当前用户有resourcecenter:group:get权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return ShowResourceGroupResponse
     */
    public ShowResourceGroupResponse showResourceGroup(ShowResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.showResourceGroup);
    }

    /**
     * 查询一个资源分组
     *
     * 查询一个资源分组，需要当前用户有resourcecenter:group:get权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>
     */
    public SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupInvoker(
        ShowResourceGroupRequest request) {
        return new SyncInvoker<>(request, RcMeta.showResourceGroup, hcClient);
    }

    /**
     * 修改一个资源分组
     *
     * 修改一个资源分组，需要当前用户有resourcecenter:group:update权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.updateResourceGroup);
    }

    /**
     * 修改一个资源分组
     *
     * 修改一个资源分组，需要当前用户有resourcecenter:group:update权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>
     */
    public SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupInvoker(
        UpdateResourceGroupRequest request) {
        return new SyncInvoker<>(request, RcMeta.updateResourceGroup, hcClient);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，需要当前用户有resourcecenter::listResourceRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return ShowResourceRelationsResponse
     */
    public ShowResourceRelationsResponse showResourceRelations(ShowResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.showResourceRelations);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，需要当前用户有resourcecenter::listResourceRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>
     */
    public SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelationsInvoker(
        ShowResourceRelationsRequest request) {
        return new SyncInvoker<>(request, RcMeta.showResourceRelations, hcClient);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览，需要当前用户有rc::listResourceSummary权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAllResourcesSummaryRequest 请求对象
     * @return CollectAllResourcesSummaryResponse
     */
    public CollectAllResourcesSummaryResponse collectAllResourcesSummary(CollectAllResourcesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.collectAllResourcesSummary);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览，需要当前用户有rc::listResourceSummary权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAllResourcesSummaryRequest 请求对象
     * @return SyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse>
     */
    public SyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> collectAllResourcesSummaryInvoker(
        CollectAllResourcesSummaryRequest request) {
        return new SyncInvoker<>(request, RcMeta.collectAllResourcesSummary, hcClient);
    }

    /**
     * 查询资源数量
     *
     * 查询资源数量，需要当前用户有resourcecenter::getResourceCount权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllResourcesRequest 请求对象
     * @return CountAllResourcesResponse
     */
    public CountAllResourcesResponse countAllResources(CountAllResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.countAllResources);
    }

    /**
     * 查询资源数量
     *
     * 查询资源数量，需要当前用户有resourcecenter::getResourceCount权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllResourcesRequest 请求对象
     * @return SyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse>
     */
    public SyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse> countAllResourcesInvoker(
        CountAllResourcesRequest request) {
        return new SyncInvoker<>(request, RcMeta.countAllResources, hcClient);
    }

    /**
     * 列举所有已对接的云服务
     *
     * 查询所有已对接RC的云服务、资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllProvidersRequest 请求对象
     * @return ListAllProvidersResponse
     */
    public ListAllProvidersResponse listAllProviders(ListAllProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.listAllProviders);
    }

    /**
     * 列举所有已对接的云服务
     *
     * 查询所有已对接RC的云服务、资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllProvidersRequest 请求对象
     * @return SyncInvoker<ListAllProvidersRequest, ListAllProvidersResponse>
     */
    public SyncInvoker<ListAllProvidersRequest, ListAllProvidersResponse> listAllProvidersInvoker(
        ListAllProvidersRequest request) {
        return new SyncInvoker<>(request, RcMeta.listAllProviders, hcClient);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有resourcecenter::listResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllResourcesRequest 请求对象
     * @return ListAllResourcesResponse
     */
    public ListAllResourcesResponse listAllResources(ListAllResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.listAllResources);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有resourcecenter::listResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllResourcesRequest 请求对象
     * @return SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>
     */
    public SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse> listAllResourcesInvoker(
        ListAllResourcesRequest request) {
        return new SyncInvoker<>(request, RcMeta.listAllResources, hcClient);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签，需要当前用户有resourcecenter::listResourceTag权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return ListAllTagsResponse
     */
    public ListAllTagsResponse listAllTags(ListAllTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.listAllTags);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签，需要当前用户有resourcecenter::listResourceTag权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public SyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsInvoker(ListAllTagsRequest request) {
        return new SyncInvoker<>(request, RcMeta.listAllTags, hcClient);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有resourcecenter::listResourceByType权限。比如查询云服务器，对应的RC资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.listResources);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有resourcecenter::listResourceByType权限。比如查询云服务器，对应的RC资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<>(request, RcMeta.listResources, hcClient);
    }

    /**
     * 查询指定类型的单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有resourcecenter::getResourceByType权限。比如查询云服务器，对应的RC资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
     * @return ShowResourceByIdResponse
     */
    public ShowResourceByIdResponse showResourceById(ShowResourceByIdRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.showResourceById);
    }

    /**
     * 查询指定类型的单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有resourcecenter::getResourceByType权限。比如查询云服务器，对应的RC资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
     * @return SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>
     */
    public SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceByIdInvoker(
        ShowResourceByIdRequest request) {
        return new SyncInvoker<>(request, RcMeta.showResourceById, hcClient);
    }

    /**
     * 查询单个资源
     *
     * 查询当前帐号下的单个资源，需要当前用户有resourcecenter::getResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return ShowResourceDetailResponse
     */
    public ShowResourceDetailResponse showResourceDetail(ShowResourceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RcMeta.showResourceDetail);
    }

    /**
     * 查询单个资源
     *
     * 查询当前帐号下的单个资源，需要当前用户有resourcecenter::getResource权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse>
     */
    public SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetailInvoker(
        ShowResourceDetailRequest request) {
        return new SyncInvoker<>(request, RcMeta.showResourceDetail, hcClient);
    }

}
