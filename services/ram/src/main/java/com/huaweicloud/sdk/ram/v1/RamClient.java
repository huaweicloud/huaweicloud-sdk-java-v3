package com.huaweicloud.sdk.ram.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ram.v1.model.*;

public class RamClient {

    protected HcClient hcClient;

    public RamClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RamClient> newBuilder() {
        return new ClientBuilder<>(RamClient::new, "GlobalCredentials");
    }

    /**
     * 绑定或替换共享资源权限
     *
     * 为资源共享实例中包含的资源类型绑定或替换共享资源权限。 对于资源共享实例中的每一种资源类型，您可以设置唯一权限。仅当资源共享实例中当前没有该资源类型的资源时，您才能绑定新的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateResourceSharePermissionRequest 请求对象
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
     * @param AssociateResourceSharePermissionRequest 请求对象
     * @return SyncInvoker<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse>
     */
    public SyncInvoker<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse> associateResourceSharePermissionInvoker(
        AssociateResourceSharePermissionRequest request) {
        return new SyncInvoker<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse>(
            request, RamMeta.associateResourceSharePermission, hcClient);
    }

    /**
     * 移除共享资源权限
     *
     * 移除资源共享实例绑定的共享资源权限。权限更改立即生效。只有当目前资源共享实例中没有绑定相关资源类型时，您才能从资源共享实例中移除共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateResourceSharePermissionRequest 请求对象
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
     * @param DisassociateResourceSharePermissionRequest 请求对象
     * @return SyncInvoker<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse>
     */
    public SyncInvoker<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse> disassociateResourceSharePermissionInvoker(
        DisassociateResourceSharePermissionRequest request) {
        return new SyncInvoker<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse>(
            request, RamMeta.disassociateResourceSharePermission, hcClient);
    }

    /**
     * 检索绑定的共享资源权限
     *
     * 检索资源共享实例关联的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceSharePermissionsRequest 请求对象
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
     * @param ListResourceSharePermissionsRequest 请求对象
     * @return SyncInvoker<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse>
     */
    public SyncInvoker<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse> listResourceSharePermissionsInvoker(
        ListResourceSharePermissionsRequest request) {
        return new SyncInvoker<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse>(request,
            RamMeta.listResourceSharePermissions, hcClient);
    }

    /**
     * 关闭与组织共享
     *
     * 关闭与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableOrganizationShareRequest 请求对象
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
     * @param DisableOrganizationShareRequest 请求对象
     * @return SyncInvoker<DisableOrganizationShareRequest, DisableOrganizationShareResponse>
     */
    public SyncInvoker<DisableOrganizationShareRequest, DisableOrganizationShareResponse> disableOrganizationShareInvoker(
        DisableOrganizationShareRequest request) {
        return new SyncInvoker<DisableOrganizationShareRequest, DisableOrganizationShareResponse>(request,
            RamMeta.disableOrganizationShare, hcClient);
    }

    /**
     * 启用与组织共享
     *
     * 启用与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableOrganizationShareRequest 请求对象
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
     * @param EnableOrganizationShareRequest 请求对象
     * @return SyncInvoker<EnableOrganizationShareRequest, EnableOrganizationShareResponse>
     */
    public SyncInvoker<EnableOrganizationShareRequest, EnableOrganizationShareResponse> enableOrganizationShareInvoker(
        EnableOrganizationShareRequest request) {
        return new SyncInvoker<EnableOrganizationShareRequest, EnableOrganizationShareResponse>(request,
            RamMeta.enableOrganizationShare, hcClient);
    }

    /**
     * 检索是否启用与组织共享
     *
     * 检索是否启用与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationShareRequest 请求对象
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
     * @param ShowOrganizationShareRequest 请求对象
     * @return SyncInvoker<ShowOrganizationShareRequest, ShowOrganizationShareResponse>
     */
    public SyncInvoker<ShowOrganizationShareRequest, ShowOrganizationShareResponse> showOrganizationShareInvoker(
        ShowOrganizationShareRequest request) {
        return new SyncInvoker<ShowOrganizationShareRequest, ShowOrganizationShareResponse>(request,
            RamMeta.showOrganizationShare, hcClient);
    }

    /**
     * 检索共享资源权限列表
     *
     * 检索指定资源类型的共享资源权限列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionsRequest 请求对象
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
     * @param ListPermissionsRequest 请求对象
     * @return SyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public SyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsInvoker(
        ListPermissionsRequest request) {
        return new SyncInvoker<ListPermissionsRequest, ListPermissionsResponse>(request, RamMeta.listPermissions,
            hcClient);
    }

    /**
     * 检索资源共享权限内容
     *
     * 检索指定资源类型的共享资源权限内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPermissionRequest 请求对象
     * @return ShowPermissionResponse
     */
    public ShowPermissionResponse showPermission(ShowPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.showPermission);
    }

    /**
     * 检索资源共享权限内容
     *
     * 检索指定资源类型的共享资源权限内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPermissionRequest 请求对象
     * @return SyncInvoker<ShowPermissionRequest, ShowPermissionResponse>
     */
    public SyncInvoker<ShowPermissionRequest, ShowPermissionResponse> showPermissionInvoker(
        ShowPermissionRequest request) {
        return new SyncInvoker<ShowPermissionRequest, ShowPermissionResponse>(request, RamMeta.showPermission,
            hcClient);
    }

    /**
     * 检索去重的共享的角色
     *
     * 检索您正在共享资源的不同角色或被共享资源给您的不同角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDistinctPrincipalsRequest 请求对象
     * @return SearchDistinctPrincipalsResponse
     */
    public SearchDistinctPrincipalsResponse searchDistinctPrincipals(SearchDistinctPrincipalsRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchDistinctPrincipals);
    }

    /**
     * 检索去重的共享的角色
     *
     * 检索您正在共享资源的不同角色或被共享资源给您的不同角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDistinctPrincipalsRequest 请求对象
     * @return SyncInvoker<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse>
     */
    public SyncInvoker<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse> searchDistinctPrincipalsInvoker(
        SearchDistinctPrincipalsRequest request) {
        return new SyncInvoker<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse>(request,
            RamMeta.searchDistinctPrincipals, hcClient);
    }

    /**
     * 检索资源使用者
     *
     * 检索共享资源的使用者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchSharedPrincipalsRequest 请求对象
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
     * @param SearchSharedPrincipalsRequest 请求对象
     * @return SyncInvoker<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse>
     */
    public SyncInvoker<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> searchSharedPrincipalsInvoker(
        SearchSharedPrincipalsRequest request) {
        return new SyncInvoker<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse>(request,
            RamMeta.searchSharedPrincipals, hcClient);
    }

    /**
     * 检索去重的共享的资源
     *
     * 检索您添加到资源共享或被共享给您的不同资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDistinctSharedResourcesRequest 请求对象
     * @return SearchDistinctSharedResourcesResponse
     */
    public SearchDistinctSharedResourcesResponse searchDistinctSharedResources(
        SearchDistinctSharedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.searchDistinctSharedResources);
    }

    /**
     * 检索去重的共享的资源
     *
     * 检索您添加到资源共享或被共享给您的不同资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDistinctSharedResourcesRequest 请求对象
     * @return SyncInvoker<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse>
     */
    public SyncInvoker<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse> searchDistinctSharedResourcesInvoker(
        SearchDistinctSharedResourcesRequest request) {
        return new SyncInvoker<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse>(request,
            RamMeta.searchDistinctSharedResources, hcClient);
    }

    /**
     * 检索共享的资源
     *
     * 检索您共享的或共享给您的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchSharedResourcesRequest 请求对象
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
     * @param SearchSharedResourcesRequest 请求对象
     * @return SyncInvoker<SearchSharedResourcesRequest, SearchSharedResourcesResponse>
     */
    public SyncInvoker<SearchSharedResourcesRequest, SearchSharedResourcesResponse> searchSharedResourcesInvoker(
        SearchSharedResourcesRequest request) {
        return new SyncInvoker<SearchSharedResourcesRequest, SearchSharedResourcesResponse>(request,
            RamMeta.searchSharedResources, hcClient);
    }

    /**
     * 创建资源共享实例
     *
     * 创建一个资源共享实例。您可以指定需要共享的资源列表，资源使用者列表，以及授予资源使用者的权限列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceShareRequest 请求对象
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
     * @param CreateResourceShareRequest 请求对象
     * @return SyncInvoker<CreateResourceShareRequest, CreateResourceShareResponse>
     */
    public SyncInvoker<CreateResourceShareRequest, CreateResourceShareResponse> createResourceShareInvoker(
        CreateResourceShareRequest request) {
        return new SyncInvoker<CreateResourceShareRequest, CreateResourceShareResponse>(request,
            RamMeta.createResourceShare, hcClient);
    }

    /**
     * 删除资源共享实例
     *
     * 删除指定的资源共享实例。此操作不会删除实体资源，仅停止向其他帐号共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceShareRequest 请求对象
     * @return DeleteResourceShareResponse
     */
    public DeleteResourceShareResponse deleteResourceShare(DeleteResourceShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.deleteResourceShare);
    }

    /**
     * 删除资源共享实例
     *
     * 删除指定的资源共享实例。此操作不会删除实体资源，仅停止向其他帐号共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceShareRequest 请求对象
     * @return SyncInvoker<DeleteResourceShareRequest, DeleteResourceShareResponse>
     */
    public SyncInvoker<DeleteResourceShareRequest, DeleteResourceShareResponse> deleteResourceShareInvoker(
        DeleteResourceShareRequest request) {
        return new SyncInvoker<DeleteResourceShareRequest, DeleteResourceShareResponse>(request,
            RamMeta.deleteResourceShare, hcClient);
    }

    /**
     * 检索资源共享实例
     *
     * 检索您创建的或者共享给您的资源共享实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchResourceSharesRequest 请求对象
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
     * @param SearchResourceSharesRequest 请求对象
     * @return SyncInvoker<SearchResourceSharesRequest, SearchResourceSharesResponse>
     */
    public SyncInvoker<SearchResourceSharesRequest, SearchResourceSharesResponse> searchResourceSharesInvoker(
        SearchResourceSharesRequest request) {
        return new SyncInvoker<SearchResourceSharesRequest, SearchResourceSharesResponse>(request,
            RamMeta.searchResourceShares, hcClient);
    }

    /**
     * 更新资源共享实例
     *
     * 修改资源共享实例的特定属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceShareRequest 请求对象
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
     * @param UpdateResourceShareRequest 请求对象
     * @return SyncInvoker<UpdateResourceShareRequest, UpdateResourceShareResponse>
     */
    public SyncInvoker<UpdateResourceShareRequest, UpdateResourceShareResponse> updateResourceShareInvoker(
        UpdateResourceShareRequest request) {
        return new SyncInvoker<UpdateResourceShareRequest, UpdateResourceShareResponse>(request,
            RamMeta.updateResourceShare, hcClient);
    }

    /**
     * 绑定资源使用者和共享资源
     *
     * 向资源共享实例绑定指定的资源使用者列表或共享资源列表。对于新增的共享资源，有权访问此资源共享实例的资源使用者获得该共享资源的访问权限。对于新增的资源使用者，获得对此资源共享实例中共享资源的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateResourceShareRequest 请求对象
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
     * @param AssociateResourceShareRequest 请求对象
     * @return SyncInvoker<AssociateResourceShareRequest, AssociateResourceShareResponse>
     */
    public SyncInvoker<AssociateResourceShareRequest, AssociateResourceShareResponse> associateResourceShareInvoker(
        AssociateResourceShareRequest request) {
        return new SyncInvoker<AssociateResourceShareRequest, AssociateResourceShareResponse>(request,
            RamMeta.associateResourceShare, hcClient);
    }

    /**
     * 移除资源使用者和共享资源
     *
     * 将指定的资源使用者或共享资源从指定的资源共享实例中移除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateResourceShareRequest 请求对象
     * @return DisassociateResourceShareResponse
     */
    public DisassociateResourceShareResponse disassociateResourceShare(DisassociateResourceShareRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.disassociateResourceShare);
    }

    /**
     * 移除资源使用者和共享资源
     *
     * 将指定的资源使用者或共享资源从指定的资源共享实例中移除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateResourceShareRequest 请求对象
     * @return SyncInvoker<DisassociateResourceShareRequest, DisassociateResourceShareResponse>
     */
    public SyncInvoker<DisassociateResourceShareRequest, DisassociateResourceShareResponse> disassociateResourceShareInvoker(
        DisassociateResourceShareRequest request) {
        return new SyncInvoker<DisassociateResourceShareRequest, DisassociateResourceShareResponse>(request,
            RamMeta.disassociateResourceShare, hcClient);
    }

    /**
     * 检索绑定的资源使用者和共享资源
     *
     * 检索您拥有的资源共享实例中绑定的共享资源和资源使用者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchResourceShareAssociationsRequest 请求对象
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
     * @param SearchResourceShareAssociationsRequest 请求对象
     * @return SyncInvoker<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse>
     */
    public SyncInvoker<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse> searchResourceShareAssociationsInvoker(
        SearchResourceShareAssociationsRequest request) {
        return new SyncInvoker<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse>(request,
            RamMeta.searchResourceShareAssociations, hcClient);
    }

    /**
     * 接受共享邀请
     *
     * 接受来自其他帐号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptResourceShareInvitationRequest 请求对象
     * @return AcceptResourceShareInvitationResponse
     */
    public AcceptResourceShareInvitationResponse acceptResourceShareInvitation(
        AcceptResourceShareInvitationRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.acceptResourceShareInvitation);
    }

    /**
     * 接受共享邀请
     *
     * 接受来自其他帐号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptResourceShareInvitationRequest 请求对象
     * @return SyncInvoker<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse>
     */
    public SyncInvoker<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse> acceptResourceShareInvitationInvoker(
        AcceptResourceShareInvitationRequest request) {
        return new SyncInvoker<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse>(request,
            RamMeta.acceptResourceShareInvitation, hcClient);
    }

    /**
     * 拒绝共享邀请
     *
     * 拒绝来自其他帐号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectResourceShareInvitationRequest 请求对象
     * @return RejectResourceShareInvitationResponse
     */
    public RejectResourceShareInvitationResponse rejectResourceShareInvitation(
        RejectResourceShareInvitationRequest request) {
        return hcClient.syncInvokeHttp(request, RamMeta.rejectResourceShareInvitation);
    }

    /**
     * 拒绝共享邀请
     *
     * 拒绝来自其他帐号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectResourceShareInvitationRequest 请求对象
     * @return SyncInvoker<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse>
     */
    public SyncInvoker<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse> rejectResourceShareInvitationInvoker(
        RejectResourceShareInvitationRequest request) {
        return new SyncInvoker<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse>(request,
            RamMeta.rejectResourceShareInvitation, hcClient);
    }

    /**
     * 检索共享邀请
     *
     * 通过条件检索资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchResourceShareInvitationRequest 请求对象
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
     * @param SearchResourceShareInvitationRequest 请求对象
     * @return SyncInvoker<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse>
     */
    public SyncInvoker<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse> searchResourceShareInvitationInvoker(
        SearchResourceShareInvitationRequest request) {
        return new SyncInvoker<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse>(request,
            RamMeta.searchResourceShareInvitation, hcClient);
    }

}
