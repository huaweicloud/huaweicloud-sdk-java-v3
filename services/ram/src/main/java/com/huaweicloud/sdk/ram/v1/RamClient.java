package com.huaweicloud.sdk.ram.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ram.v1.model.AcceptResourceShareInvitationRequest;
import com.huaweicloud.sdk.ram.v1.model.AcceptResourceShareInvitationResponse;
import com.huaweicloud.sdk.ram.v1.model.AssociateResourceSharePermissionRequest;
import com.huaweicloud.sdk.ram.v1.model.AssociateResourceSharePermissionResponse;
import com.huaweicloud.sdk.ram.v1.model.AssociateResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.AssociateResourceShareResponse;
import com.huaweicloud.sdk.ram.v1.model.BatchCreateResourceShareTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.BatchCreateResourceShareTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.BatchDeleteResourceShareTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.BatchDeleteResourceShareTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.CreateResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.CreateResourceShareResponse;
import com.huaweicloud.sdk.ram.v1.model.DeleteResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.DeleteResourceShareResponse;
import com.huaweicloud.sdk.ram.v1.model.DisableOrganizationShareRequest;
import com.huaweicloud.sdk.ram.v1.model.DisableOrganizationShareResponse;
import com.huaweicloud.sdk.ram.v1.model.DisassociateResourceSharePermissionRequest;
import com.huaweicloud.sdk.ram.v1.model.DisassociateResourceSharePermissionResponse;
import com.huaweicloud.sdk.ram.v1.model.DisassociateResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.DisassociateResourceShareResponse;
import com.huaweicloud.sdk.ram.v1.model.EnableOrganizationShareRequest;
import com.huaweicloud.sdk.ram.v1.model.EnableOrganizationShareResponse;
import com.huaweicloud.sdk.ram.v1.model.ListPermissionVersionsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListPermissionVersionsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListPermissionsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListPermissionsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListQuotaRequest;
import com.huaweicloud.sdk.ram.v1.model.ListQuotaResponse;
import com.huaweicloud.sdk.ram.v1.model.ListResourceSharePermissionsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListResourceSharePermissionsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListResourceShareTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListResourceShareTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListResourceSharesByTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListResourceSharesByTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListResourceTypesRequest;
import com.huaweicloud.sdk.ram.v1.model.ListResourceTypesResponse;
import com.huaweicloud.sdk.ram.v1.model.RejectResourceShareInvitationRequest;
import com.huaweicloud.sdk.ram.v1.model.RejectResourceShareInvitationResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchDistinctPrincipalsRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchDistinctPrincipalsResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchDistinctSharedResourcesRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchDistinctSharedResourcesResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareAssociationsRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareAssociationsResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareCountByTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareCountByTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareInvitationRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareInvitationResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceSharesRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceSharesResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedPrincipalsRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedPrincipalsResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedResourcesRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedResourcesResponse;
import com.huaweicloud.sdk.ram.v1.model.ShowOrganizationShareRequest;
import com.huaweicloud.sdk.ram.v1.model.ShowOrganizationShareResponse;
import com.huaweicloud.sdk.ram.v1.model.ShowPermissionRequest;
import com.huaweicloud.sdk.ram.v1.model.ShowPermissionResponse;
import com.huaweicloud.sdk.ram.v1.model.UpdateResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.UpdateResourceShareResponse;

public class RamClient {

    protected HcClient hcClient;

    public RamClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RamClient> newBuilder() {
        ClientBuilder<RamClient> clientBuilder = new ClientBuilder<>(RamClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 绑定或替换共享资源权限
     *
     * 为资源共享实例中包含的资源类型绑定或替换共享资源权限。 对于资源共享实例中的每一种资源类型，您可以设置唯一权限。仅当资源共享实例中当前没有该资源类型的资源时，您才能绑定新的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResourceSharePermissionRequest 请求对象
     * @return AssociateResourceSharePermissionResponse
     */
    public AssociateResourceSharePermissionResponse associateResourceSharePermission(
        AssociateResourceSharePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.associateResourceSharePermission);
    }

    /**
     * 绑定或替换共享资源权限
     *
     * 为资源共享实例中包含的资源类型绑定或替换共享资源权限。 对于资源共享实例中的每一种资源类型，您可以设置唯一权限。仅当资源共享实例中当前没有该资源类型的资源时，您才能绑定新的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResourceSharePermissionRequest 请求对象
     * @return SyncInvoker<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse>
     */
    public SyncInvoker<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse> associateResourceSharePermissionInvoker(
        AssociateResourceSharePermissionRequest request) {
        return new SyncInvoker<>(request, RamMeta.associateResourceSharePermission, hcClient);
    }

    /**
     * 移除共享资源权限
     *
     * 移除资源共享实例绑定的共享资源权限。权限更改立即生效。只有当目前资源共享实例中没有绑定相关资源类型时，您才能从资源共享实例中移除共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResourceSharePermissionRequest 请求对象
     * @return DisassociateResourceSharePermissionResponse
     */
    public DisassociateResourceSharePermissionResponse disassociateResourceSharePermission(
        DisassociateResourceSharePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.disassociateResourceSharePermission);
    }

    /**
     * 移除共享资源权限
     *
     * 移除资源共享实例绑定的共享资源权限。权限更改立即生效。只有当目前资源共享实例中没有绑定相关资源类型时，您才能从资源共享实例中移除共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResourceSharePermissionRequest 请求对象
     * @return SyncInvoker<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse>
     */
    public SyncInvoker<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse> disassociateResourceSharePermissionInvoker(
        DisassociateResourceSharePermissionRequest request) {
        return new SyncInvoker<>(request, RamMeta.disassociateResourceSharePermission, hcClient);
    }

    /**
     * 检索绑定的共享资源权限
     *
     * 检索资源共享实例关联的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceSharePermissionsRequest 请求对象
     * @return ListResourceSharePermissionsResponse
     */
    public ListResourceSharePermissionsResponse listResourceSharePermissions(
        ListResourceSharePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.listResourceSharePermissions);
    }

    /**
     * 检索绑定的共享资源权限
     *
     * 检索资源共享实例关联的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceSharePermissionsRequest 请求对象
     * @return SyncInvoker<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse>
     */
    public SyncInvoker<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse> listResourceSharePermissionsInvoker(
        ListResourceSharePermissionsRequest request) {
        return new SyncInvoker<>(request, RamMeta.listResourceSharePermissions, hcClient);
    }

    /**
     * 查询资源共享的配额
     *
     * 查询当前账号的资源共享配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuota(ListQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.listQuota);
    }

    /**
     * 查询资源共享的配额
     *
     * 查询当前账号的资源共享配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return SyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public SyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaInvoker(ListQuotaRequest request) {
        return new SyncInvoker<>(request, RamMeta.listQuota, hcClient);
    }

    /**
     * 检索云服务资源类型
     *
     * 查询已对接云服务的资源类型和区域等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTypesRequest 请求对象
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.listResourceTypes);
    }

    /**
     * 检索云服务资源类型
     *
     * 查询已对接云服务的资源类型和区域等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTypesRequest 请求对象
     * @return SyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse>
     */
    public SyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse> listResourceTypesInvoker(
        ListResourceTypesRequest request) {
        return new SyncInvoker<>(request, RamMeta.listResourceTypes, hcClient);
    }

    /**
     * 关闭与组织共享
     *
     * 关闭与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableOrganizationShareRequest 请求对象
     * @return DisableOrganizationShareResponse
     */
    public DisableOrganizationShareResponse disableOrganizationShare(DisableOrganizationShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.disableOrganizationShare);
    }

    /**
     * 关闭与组织共享
     *
     * 关闭与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableOrganizationShareRequest 请求对象
     * @return SyncInvoker<DisableOrganizationShareRequest, DisableOrganizationShareResponse>
     */
    public SyncInvoker<DisableOrganizationShareRequest, DisableOrganizationShareResponse> disableOrganizationShareInvoker(
        DisableOrganizationShareRequest request) {
        return new SyncInvoker<>(request, RamMeta.disableOrganizationShare, hcClient);
    }

    /**
     * 启用与组织共享
     *
     * 启用与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableOrganizationShareRequest 请求对象
     * @return EnableOrganizationShareResponse
     */
    public EnableOrganizationShareResponse enableOrganizationShare(EnableOrganizationShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.enableOrganizationShare);
    }

    /**
     * 启用与组织共享
     *
     * 启用与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableOrganizationShareRequest 请求对象
     * @return SyncInvoker<EnableOrganizationShareRequest, EnableOrganizationShareResponse>
     */
    public SyncInvoker<EnableOrganizationShareRequest, EnableOrganizationShareResponse> enableOrganizationShareInvoker(
        EnableOrganizationShareRequest request) {
        return new SyncInvoker<>(request, RamMeta.enableOrganizationShare, hcClient);
    }

    /**
     * 检索是否启用与组织共享
     *
     * 检索是否启用与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationShareRequest 请求对象
     * @return ShowOrganizationShareResponse
     */
    public ShowOrganizationShareResponse showOrganizationShare(ShowOrganizationShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.showOrganizationShare);
    }

    /**
     * 检索是否启用与组织共享
     *
     * 检索是否启用与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationShareRequest 请求对象
     * @return SyncInvoker<ShowOrganizationShareRequest, ShowOrganizationShareResponse>
     */
    public SyncInvoker<ShowOrganizationShareRequest, ShowOrganizationShareResponse> showOrganizationShareInvoker(
        ShowOrganizationShareRequest request) {
        return new SyncInvoker<>(request, RamMeta.showOrganizationShare, hcClient);
    }

    /**
     * 获取权限的所有版本
     *
     * 获取权限的所有版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionVersionsRequest 请求对象
     * @return ListPermissionVersionsResponse
     */
    public ListPermissionVersionsResponse listPermissionVersions(ListPermissionVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.listPermissionVersions);
    }

    /**
     * 获取权限的所有版本
     *
     * 获取权限的所有版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionVersionsRequest 请求对象
     * @return SyncInvoker<ListPermissionVersionsRequest, ListPermissionVersionsResponse>
     */
    public SyncInvoker<ListPermissionVersionsRequest, ListPermissionVersionsResponse> listPermissionVersionsInvoker(
        ListPermissionVersionsRequest request) {
        return new SyncInvoker<>(request, RamMeta.listPermissionVersions, hcClient);
    }

    /**
     * 检索共享资源权限列表
     *
     * 检索指定资源类型的共享资源权限列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionsRequest 请求对象
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(ListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.listPermissions);
    }

    /**
     * 检索共享资源权限列表
     *
     * 检索指定资源类型的共享资源权限列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionsRequest 请求对象
     * @return SyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public SyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsInvoker(
        ListPermissionsRequest request) {
        return new SyncInvoker<>(request, RamMeta.listPermissions, hcClient);
    }

    /**
     * 检索资源共享权限内容
     *
     * 检索指定资源类型的共享资源指定版本的权限内容，如果不指定权限版本，则返回默认版本的权限内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPermissionRequest 请求对象
     * @return ShowPermissionResponse
     */
    public ShowPermissionResponse showPermission(ShowPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.showPermission);
    }

    /**
     * 检索资源共享权限内容
     *
     * 检索指定资源类型的共享资源指定版本的权限内容，如果不指定权限版本，则返回默认版本的权限内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPermissionRequest 请求对象
     * @return SyncInvoker<ShowPermissionRequest, ShowPermissionResponse>
     */
    public SyncInvoker<ShowPermissionRequest, ShowPermissionResponse> showPermissionInvoker(
        ShowPermissionRequest request) {
        return new SyncInvoker<>(request, RamMeta.showPermission, hcClient);
    }

    /**
     * 检索资源使用者并去除其中的重复项
     *
     * 检索您正在共享资源的不同使用者或被共享资源给您的不同使用者并去除其中的重复项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDistinctPrincipalsRequest 请求对象
     * @return SearchDistinctPrincipalsResponse
     */
    public SearchDistinctPrincipalsResponse searchDistinctPrincipals(SearchDistinctPrincipalsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchDistinctPrincipals);
    }

    /**
     * 检索资源使用者并去除其中的重复项
     *
     * 检索您正在共享资源的不同使用者或被共享资源给您的不同使用者并去除其中的重复项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDistinctPrincipalsRequest 请求对象
     * @return SyncInvoker<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse>
     */
    public SyncInvoker<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse> searchDistinctPrincipalsInvoker(
        SearchDistinctPrincipalsRequest request) {
        return new SyncInvoker<>(request, RamMeta.searchDistinctPrincipals, hcClient);
    }

    /**
     * 检索资源使用者
     *
     * 检索共享资源的使用者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSharedPrincipalsRequest 请求对象
     * @return SearchSharedPrincipalsResponse
     */
    public SearchSharedPrincipalsResponse searchSharedPrincipals(SearchSharedPrincipalsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchSharedPrincipals);
    }

    /**
     * 检索资源使用者
     *
     * 检索共享资源的使用者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSharedPrincipalsRequest 请求对象
     * @return SyncInvoker<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse>
     */
    public SyncInvoker<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> searchSharedPrincipalsInvoker(
        SearchSharedPrincipalsRequest request) {
        return new SyncInvoker<>(request, RamMeta.searchSharedPrincipals, hcClient);
    }

    /**
     * 检索共享的资源并去除其中的重复项
     *
     * 检索您添加到资源共享或被共享给您的不同资源并去除其中的重复项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDistinctSharedResourcesRequest 请求对象
     * @return SearchDistinctSharedResourcesResponse
     */
    public SearchDistinctSharedResourcesResponse searchDistinctSharedResources(
        SearchDistinctSharedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchDistinctSharedResources);
    }

    /**
     * 检索共享的资源并去除其中的重复项
     *
     * 检索您添加到资源共享或被共享给您的不同资源并去除其中的重复项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDistinctSharedResourcesRequest 请求对象
     * @return SyncInvoker<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse>
     */
    public SyncInvoker<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse> searchDistinctSharedResourcesInvoker(
        SearchDistinctSharedResourcesRequest request) {
        return new SyncInvoker<>(request, RamMeta.searchDistinctSharedResources, hcClient);
    }

    /**
     * 检索共享的资源
     *
     * 检索您共享的或共享给您的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSharedResourcesRequest 请求对象
     * @return SearchSharedResourcesResponse
     */
    public SearchSharedResourcesResponse searchSharedResources(SearchSharedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchSharedResources);
    }

    /**
     * 检索共享的资源
     *
     * 检索您共享的或共享给您的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSharedResourcesRequest 请求对象
     * @return SyncInvoker<SearchSharedResourcesRequest, SearchSharedResourcesResponse>
     */
    public SyncInvoker<SearchSharedResourcesRequest, SearchSharedResourcesResponse> searchSharedResourcesInvoker(
        SearchSharedResourcesRequest request) {
        return new SyncInvoker<>(request, RamMeta.searchSharedResources, hcClient);
    }

    /**
     * 创建资源共享实例
     *
     * 创建一个资源共享实例。您可以指定需要共享的资源列表，资源使用者列表，以及授予资源使用者的权限列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceShareRequest 请求对象
     * @return CreateResourceShareResponse
     */
    public CreateResourceShareResponse createResourceShare(CreateResourceShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.createResourceShare);
    }

    /**
     * 创建资源共享实例
     *
     * 创建一个资源共享实例。您可以指定需要共享的资源列表，资源使用者列表，以及授予资源使用者的权限列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceShareRequest 请求对象
     * @return SyncInvoker<CreateResourceShareRequest, CreateResourceShareResponse>
     */
    public SyncInvoker<CreateResourceShareRequest, CreateResourceShareResponse> createResourceShareInvoker(
        CreateResourceShareRequest request) {
        return new SyncInvoker<>(request, RamMeta.createResourceShare, hcClient);
    }

    /**
     * 删除资源共享实例
     *
     * 删除指定的资源共享实例。此操作不会删除实体资源，仅停止向其他账号共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceShareRequest 请求对象
     * @return DeleteResourceShareResponse
     */
    public DeleteResourceShareResponse deleteResourceShare(DeleteResourceShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.deleteResourceShare);
    }

    /**
     * 删除资源共享实例
     *
     * 删除指定的资源共享实例。此操作不会删除实体资源，仅停止向其他账号共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceShareRequest 请求对象
     * @return SyncInvoker<DeleteResourceShareRequest, DeleteResourceShareResponse>
     */
    public SyncInvoker<DeleteResourceShareRequest, DeleteResourceShareResponse> deleteResourceShareInvoker(
        DeleteResourceShareRequest request) {
        return new SyncInvoker<>(request, RamMeta.deleteResourceShare, hcClient);
    }

    /**
     * 检索资源共享实例
     *
     * 检索您创建的或者共享给您的资源共享实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceSharesRequest 请求对象
     * @return SearchResourceSharesResponse
     */
    public SearchResourceSharesResponse searchResourceShares(SearchResourceSharesRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchResourceShares);
    }

    /**
     * 检索资源共享实例
     *
     * 检索您创建的或者共享给您的资源共享实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceSharesRequest 请求对象
     * @return SyncInvoker<SearchResourceSharesRequest, SearchResourceSharesResponse>
     */
    public SyncInvoker<SearchResourceSharesRequest, SearchResourceSharesResponse> searchResourceSharesInvoker(
        SearchResourceSharesRequest request) {
        return new SyncInvoker<>(request, RamMeta.searchResourceShares, hcClient);
    }

    /**
     * 更新资源共享实例
     *
     * 修改资源共享实例的特定属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceShareRequest 请求对象
     * @return UpdateResourceShareResponse
     */
    public UpdateResourceShareResponse updateResourceShare(UpdateResourceShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.updateResourceShare);
    }

    /**
     * 更新资源共享实例
     *
     * 修改资源共享实例的特定属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceShareRequest 请求对象
     * @return SyncInvoker<UpdateResourceShareRequest, UpdateResourceShareResponse>
     */
    public SyncInvoker<UpdateResourceShareRequest, UpdateResourceShareResponse> updateResourceShareInvoker(
        UpdateResourceShareRequest request) {
        return new SyncInvoker<>(request, RamMeta.updateResourceShare, hcClient);
    }

    /**
     * 绑定资源使用者和共享资源
     *
     * 向资源共享实例绑定指定的资源使用者列表或共享资源列表。对于新增的共享资源，有权访问此资源共享实例的资源使用者获得该共享资源的访问权限。对于新增的资源使用者，获得对此资源共享实例中共享资源的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResourceShareRequest 请求对象
     * @return AssociateResourceShareResponse
     */
    public AssociateResourceShareResponse associateResourceShare(AssociateResourceShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.associateResourceShare);
    }

    /**
     * 绑定资源使用者和共享资源
     *
     * 向资源共享实例绑定指定的资源使用者列表或共享资源列表。对于新增的共享资源，有权访问此资源共享实例的资源使用者获得该共享资源的访问权限。对于新增的资源使用者，获得对此资源共享实例中共享资源的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResourceShareRequest 请求对象
     * @return SyncInvoker<AssociateResourceShareRequest, AssociateResourceShareResponse>
     */
    public SyncInvoker<AssociateResourceShareRequest, AssociateResourceShareResponse> associateResourceShareInvoker(
        AssociateResourceShareRequest request) {
        return new SyncInvoker<>(request, RamMeta.associateResourceShare, hcClient);
    }

    /**
     * 移除资源使用者或共享资源
     *
     * 将指定的资源使用者或共享资源从指定的资源共享实例中移除。资源使用者也可以从指定的资源共享实例中主动退出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResourceShareRequest 请求对象
     * @return DisassociateResourceShareResponse
     */
    public DisassociateResourceShareResponse disassociateResourceShare(DisassociateResourceShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.disassociateResourceShare);
    }

    /**
     * 移除资源使用者或共享资源
     *
     * 将指定的资源使用者或共享资源从指定的资源共享实例中移除。资源使用者也可以从指定的资源共享实例中主动退出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResourceShareRequest 请求对象
     * @return SyncInvoker<DisassociateResourceShareRequest, DisassociateResourceShareResponse>
     */
    public SyncInvoker<DisassociateResourceShareRequest, DisassociateResourceShareResponse> disassociateResourceShareInvoker(
        DisassociateResourceShareRequest request) {
        return new SyncInvoker<>(request, RamMeta.disassociateResourceShare, hcClient);
    }

    /**
     * 检索绑定的资源使用者和共享资源
     *
     * 检索您拥有的资源共享实例中绑定的共享资源和资源使用者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceShareAssociationsRequest 请求对象
     * @return SearchResourceShareAssociationsResponse
     */
    public SearchResourceShareAssociationsResponse searchResourceShareAssociations(
        SearchResourceShareAssociationsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchResourceShareAssociations);
    }

    /**
     * 检索绑定的资源使用者和共享资源
     *
     * 检索您拥有的资源共享实例中绑定的共享资源和资源使用者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceShareAssociationsRequest 请求对象
     * @return SyncInvoker<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse>
     */
    public SyncInvoker<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse> searchResourceShareAssociationsInvoker(
        SearchResourceShareAssociationsRequest request) {
        return new SyncInvoker<>(request, RamMeta.searchResourceShareAssociations, hcClient);
    }

    /**
     * 接受共享邀请
     *
     * 接受来自其他账号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptResourceShareInvitationRequest 请求对象
     * @return AcceptResourceShareInvitationResponse
     */
    public AcceptResourceShareInvitationResponse acceptResourceShareInvitation(
        AcceptResourceShareInvitationRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.acceptResourceShareInvitation);
    }

    /**
     * 接受共享邀请
     *
     * 接受来自其他账号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptResourceShareInvitationRequest 请求对象
     * @return SyncInvoker<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse>
     */
    public SyncInvoker<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse> acceptResourceShareInvitationInvoker(
        AcceptResourceShareInvitationRequest request) {
        return new SyncInvoker<>(request, RamMeta.acceptResourceShareInvitation, hcClient);
    }

    /**
     * 拒绝共享邀请
     *
     * 拒绝来自其他账号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RejectResourceShareInvitationRequest 请求对象
     * @return RejectResourceShareInvitationResponse
     */
    public RejectResourceShareInvitationResponse rejectResourceShareInvitation(
        RejectResourceShareInvitationRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.rejectResourceShareInvitation);
    }

    /**
     * 拒绝共享邀请
     *
     * 拒绝来自其他账号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RejectResourceShareInvitationRequest 请求对象
     * @return SyncInvoker<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse>
     */
    public SyncInvoker<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse> rejectResourceShareInvitationInvoker(
        RejectResourceShareInvitationRequest request) {
        return new SyncInvoker<>(request, RamMeta.rejectResourceShareInvitation, hcClient);
    }

    /**
     * 检索共享邀请
     *
     * 通过条件检索资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceShareInvitationRequest 请求对象
     * @return SearchResourceShareInvitationResponse
     */
    public SearchResourceShareInvitationResponse searchResourceShareInvitation(
        SearchResourceShareInvitationRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchResourceShareInvitation);
    }

    /**
     * 检索共享邀请
     *
     * 通过条件检索资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceShareInvitationRequest 请求对象
     * @return SyncInvoker<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse>
     */
    public SyncInvoker<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse> searchResourceShareInvitationInvoker(
        SearchResourceShareInvitationRequest request) {
        return new SyncInvoker<>(request, RamMeta.searchResourceShareInvitation, hcClient);
    }

    /**
     * 资源共享实例增加标签
     *
     * 资源共享实例增加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceShareTagsRequest 请求对象
     * @return BatchCreateResourceShareTagsResponse
     */
    public BatchCreateResourceShareTagsResponse batchCreateResourceShareTags(
        BatchCreateResourceShareTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.batchCreateResourceShareTags);
    }

    /**
     * 资源共享实例增加标签
     *
     * 资源共享实例增加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceShareTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse>
     */
    public SyncInvoker<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse> batchCreateResourceShareTagsInvoker(
        BatchCreateResourceShareTagsRequest request) {
        return new SyncInvoker<>(request, RamMeta.batchCreateResourceShareTags, hcClient);
    }

    /**
     * 删除资源共享实例的标签
     *
     * 删除资源共享实例指定的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceShareTagsRequest 请求对象
     * @return BatchDeleteResourceShareTagsResponse
     */
    public BatchDeleteResourceShareTagsResponse batchDeleteResourceShareTags(
        BatchDeleteResourceShareTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.batchDeleteResourceShareTags);
    }

    /**
     * 删除资源共享实例的标签
     *
     * 删除资源共享实例指定的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceShareTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse>
     */
    public SyncInvoker<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse> batchDeleteResourceShareTagsInvoker(
        BatchDeleteResourceShareTagsRequest request) {
        return new SyncInvoker<>(request, RamMeta.batchDeleteResourceShareTags, hcClient);
    }

    /**
     * 查询已使用的标签列表
     *
     * 查询资源共享实例已使用标签的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceShareTagsRequest 请求对象
     * @return ListResourceShareTagsResponse
     */
    public ListResourceShareTagsResponse listResourceShareTags(ListResourceShareTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.listResourceShareTags);
    }

    /**
     * 查询已使用的标签列表
     *
     * 查询资源共享实例已使用标签的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceShareTagsRequest 请求对象
     * @return SyncInvoker<ListResourceShareTagsRequest, ListResourceShareTagsResponse>
     */
    public SyncInvoker<ListResourceShareTagsRequest, ListResourceShareTagsResponse> listResourceShareTagsInvoker(
        ListResourceShareTagsRequest request) {
        return new SyncInvoker<>(request, RamMeta.listResourceShareTags, hcClient);
    }

    /**
     * 根据标签信息查询实例列表
     *
     * 根据标签信息查询资源共享实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceSharesByTagsRequest 请求对象
     * @return ListResourceSharesByTagsResponse
     */
    public ListResourceSharesByTagsResponse listResourceSharesByTags(ListResourceSharesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.listResourceSharesByTags);
    }

    /**
     * 根据标签信息查询实例列表
     *
     * 根据标签信息查询资源共享实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceSharesByTagsRequest 请求对象
     * @return SyncInvoker<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse>
     */
    public SyncInvoker<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse> listResourceSharesByTagsInvoker(
        ListResourceSharesByTagsRequest request) {
        return new SyncInvoker<>(request, RamMeta.listResourceSharesByTags, hcClient);
    }

    /**
     * 根据标签信息查询实例数量
     *
     * 根据标签信息查询资源共享实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceShareCountByTagsRequest 请求对象
     * @return SearchResourceShareCountByTagsResponse
     */
    public SearchResourceShareCountByTagsResponse searchResourceShareCountByTags(
        SearchResourceShareCountByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchResourceShareCountByTags);
    }

    /**
     * 根据标签信息查询实例数量
     *
     * 根据标签信息查询资源共享实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceShareCountByTagsRequest 请求对象
     * @return SyncInvoker<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse>
     */
    public SyncInvoker<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse> searchResourceShareCountByTagsInvoker(
        SearchResourceShareCountByTagsRequest request) {
        return new SyncInvoker<>(request, RamMeta.searchResourceShareCountByTags, hcClient);
    }

}
