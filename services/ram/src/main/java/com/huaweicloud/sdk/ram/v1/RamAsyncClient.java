package com.huaweicloud.sdk.ram.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class RamAsyncClient {

    protected HcClient hcClient;

    public RamAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RamAsyncClient> newBuilder() {
        ClientBuilder<RamAsyncClient> clientBuilder = new ClientBuilder<>(RamAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 绑定或替换共享资源权限
     *
     * 为资源共享实例中包含的资源类型绑定或替换共享资源权限。 对于资源共享实例中的每一种资源类型，您可以设置唯一权限。仅当资源共享实例中当前没有该资源类型的资源时，您才能绑定新的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateResourceSharePermissionRequest 请求对象
     * @return CompletableFuture<AssociateResourceSharePermissionResponse>
     */
    public CompletableFuture<AssociateResourceSharePermissionResponse> associateResourceSharePermissionAsync(
        AssociateResourceSharePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.associateResourceSharePermission);
    }

    /**
     * 绑定或替换共享资源权限
     *
     * 为资源共享实例中包含的资源类型绑定或替换共享资源权限。 对于资源共享实例中的每一种资源类型，您可以设置唯一权限。仅当资源共享实例中当前没有该资源类型的资源时，您才能绑定新的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateResourceSharePermissionRequest 请求对象
     * @return AsyncInvoker<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse>
     */
    public AsyncInvoker<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse> associateResourceSharePermissionAsyncInvoker(
        AssociateResourceSharePermissionRequest request) {
        return new AsyncInvoker<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse>(
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
     * @return CompletableFuture<DisassociateResourceSharePermissionResponse>
     */
    public CompletableFuture<DisassociateResourceSharePermissionResponse> disassociateResourceSharePermissionAsync(
        DisassociateResourceSharePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.disassociateResourceSharePermission);
    }

    /**
     * 移除共享资源权限
     *
     * 移除资源共享实例绑定的共享资源权限。权限更改立即生效。只有当目前资源共享实例中没有绑定相关资源类型时，您才能从资源共享实例中移除共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateResourceSharePermissionRequest 请求对象
     * @return AsyncInvoker<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse>
     */
    public AsyncInvoker<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse> disassociateResourceSharePermissionAsyncInvoker(
        DisassociateResourceSharePermissionRequest request) {
        return new AsyncInvoker<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse>(
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
     * @return CompletableFuture<ListResourceSharePermissionsResponse>
     */
    public CompletableFuture<ListResourceSharePermissionsResponse> listResourceSharePermissionsAsync(
        ListResourceSharePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.listResourceSharePermissions);
    }

    /**
     * 检索绑定的共享资源权限
     *
     * 检索资源共享实例关联的共享资源权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceSharePermissionsRequest 请求对象
     * @return AsyncInvoker<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse>
     */
    public AsyncInvoker<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse> listResourceSharePermissionsAsyncInvoker(
        ListResourceSharePermissionsRequest request) {
        return new AsyncInvoker<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse>(request,
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
     * @return CompletableFuture<DisableOrganizationShareResponse>
     */
    public CompletableFuture<DisableOrganizationShareResponse> disableOrganizationShareAsync(
        DisableOrganizationShareRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.disableOrganizationShare);
    }

    /**
     * 关闭与组织共享
     *
     * 关闭与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableOrganizationShareRequest 请求对象
     * @return AsyncInvoker<DisableOrganizationShareRequest, DisableOrganizationShareResponse>
     */
    public AsyncInvoker<DisableOrganizationShareRequest, DisableOrganizationShareResponse> disableOrganizationShareAsyncInvoker(
        DisableOrganizationShareRequest request) {
        return new AsyncInvoker<DisableOrganizationShareRequest, DisableOrganizationShareResponse>(request,
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
     * @return CompletableFuture<EnableOrganizationShareResponse>
     */
    public CompletableFuture<EnableOrganizationShareResponse> enableOrganizationShareAsync(
        EnableOrganizationShareRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.enableOrganizationShare);
    }

    /**
     * 启用与组织共享
     *
     * 启用与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableOrganizationShareRequest 请求对象
     * @return AsyncInvoker<EnableOrganizationShareRequest, EnableOrganizationShareResponse>
     */
    public AsyncInvoker<EnableOrganizationShareRequest, EnableOrganizationShareResponse> enableOrganizationShareAsyncInvoker(
        EnableOrganizationShareRequest request) {
        return new AsyncInvoker<EnableOrganizationShareRequest, EnableOrganizationShareResponse>(request,
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
     * @return CompletableFuture<ShowOrganizationShareResponse>
     */
    public CompletableFuture<ShowOrganizationShareResponse> showOrganizationShareAsync(
        ShowOrganizationShareRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.showOrganizationShare);
    }

    /**
     * 检索是否启用与组织共享
     *
     * 检索是否启用与组织共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationShareRequest 请求对象
     * @return AsyncInvoker<ShowOrganizationShareRequest, ShowOrganizationShareResponse>
     */
    public AsyncInvoker<ShowOrganizationShareRequest, ShowOrganizationShareResponse> showOrganizationShareAsyncInvoker(
        ShowOrganizationShareRequest request) {
        return new AsyncInvoker<ShowOrganizationShareRequest, ShowOrganizationShareResponse>(request,
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
     * @return CompletableFuture<ListPermissionsResponse>
     */
    public CompletableFuture<ListPermissionsResponse> listPermissionsAsync(ListPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.listPermissions);
    }

    /**
     * 检索共享资源权限列表
     *
     * 检索指定资源类型的共享资源权限列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionsRequest 请求对象
     * @return AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsAsyncInvoker(
        ListPermissionsRequest request) {
        return new AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse>(request, RamMeta.listPermissions,
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
     * @return CompletableFuture<ShowPermissionResponse>
     */
    public CompletableFuture<ShowPermissionResponse> showPermissionAsync(ShowPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.showPermission);
    }

    /**
     * 检索资源共享权限内容
     *
     * 检索指定资源类型的共享资源权限内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPermissionRequest 请求对象
     * @return AsyncInvoker<ShowPermissionRequest, ShowPermissionResponse>
     */
    public AsyncInvoker<ShowPermissionRequest, ShowPermissionResponse> showPermissionAsyncInvoker(
        ShowPermissionRequest request) {
        return new AsyncInvoker<ShowPermissionRequest, ShowPermissionResponse>(request, RamMeta.showPermission,
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
     * @return CompletableFuture<SearchDistinctPrincipalsResponse>
     */
    public CompletableFuture<SearchDistinctPrincipalsResponse> searchDistinctPrincipalsAsync(
        SearchDistinctPrincipalsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.searchDistinctPrincipals);
    }

    /**
     * 检索去重的共享的角色
     *
     * 检索您正在共享资源的不同角色或被共享资源给您的不同角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDistinctPrincipalsRequest 请求对象
     * @return AsyncInvoker<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse>
     */
    public AsyncInvoker<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse> searchDistinctPrincipalsAsyncInvoker(
        SearchDistinctPrincipalsRequest request) {
        return new AsyncInvoker<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse>(request,
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
     * @return CompletableFuture<SearchSharedPrincipalsResponse>
     */
    public CompletableFuture<SearchSharedPrincipalsResponse> searchSharedPrincipalsAsync(
        SearchSharedPrincipalsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.searchSharedPrincipals);
    }

    /**
     * 检索资源使用者
     *
     * 检索共享资源的使用者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchSharedPrincipalsRequest 请求对象
     * @return AsyncInvoker<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse>
     */
    public AsyncInvoker<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> searchSharedPrincipalsAsyncInvoker(
        SearchSharedPrincipalsRequest request) {
        return new AsyncInvoker<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse>(request,
            RamMeta.searchSharedPrincipals, hcClient);
    }

    /**
     * 查询资源共享的配额
     *
     * 查询当前帐号的资源共享配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return CompletableFuture<ListQuotaResponse>
     */
    public CompletableFuture<ListQuotaResponse> listQuotaAsync(ListQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.listQuota);
    }

    /**
     * 查询资源共享的配额
     *
     * 查询当前帐号的资源共享配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return AsyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public AsyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaAsyncInvoker(ListQuotaRequest request) {
        return new AsyncInvoker<ListQuotaRequest, ListQuotaResponse>(request, RamMeta.listQuota, hcClient);
    }

    /**
     * 检索去重的共享的资源
     *
     * 检索您添加到资源共享或被共享给您的不同资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDistinctSharedResourcesRequest 请求对象
     * @return CompletableFuture<SearchDistinctSharedResourcesResponse>
     */
    public CompletableFuture<SearchDistinctSharedResourcesResponse> searchDistinctSharedResourcesAsync(
        SearchDistinctSharedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.searchDistinctSharedResources);
    }

    /**
     * 检索去重的共享的资源
     *
     * 检索您添加到资源共享或被共享给您的不同资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDistinctSharedResourcesRequest 请求对象
     * @return AsyncInvoker<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse>
     */
    public AsyncInvoker<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse> searchDistinctSharedResourcesAsyncInvoker(
        SearchDistinctSharedResourcesRequest request) {
        return new AsyncInvoker<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse>(request,
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
     * @return CompletableFuture<SearchSharedResourcesResponse>
     */
    public CompletableFuture<SearchSharedResourcesResponse> searchSharedResourcesAsync(
        SearchSharedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.searchSharedResources);
    }

    /**
     * 检索共享的资源
     *
     * 检索您共享的或共享给您的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchSharedResourcesRequest 请求对象
     * @return AsyncInvoker<SearchSharedResourcesRequest, SearchSharedResourcesResponse>
     */
    public AsyncInvoker<SearchSharedResourcesRequest, SearchSharedResourcesResponse> searchSharedResourcesAsyncInvoker(
        SearchSharedResourcesRequest request) {
        return new AsyncInvoker<SearchSharedResourcesRequest, SearchSharedResourcesResponse>(request,
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
     * @return CompletableFuture<CreateResourceShareResponse>
     */
    public CompletableFuture<CreateResourceShareResponse> createResourceShareAsync(CreateResourceShareRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.createResourceShare);
    }

    /**
     * 创建资源共享实例
     *
     * 创建一个资源共享实例。您可以指定需要共享的资源列表，资源使用者列表，以及授予资源使用者的权限列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceShareRequest 请求对象
     * @return AsyncInvoker<CreateResourceShareRequest, CreateResourceShareResponse>
     */
    public AsyncInvoker<CreateResourceShareRequest, CreateResourceShareResponse> createResourceShareAsyncInvoker(
        CreateResourceShareRequest request) {
        return new AsyncInvoker<CreateResourceShareRequest, CreateResourceShareResponse>(request,
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
     * @return CompletableFuture<DeleteResourceShareResponse>
     */
    public CompletableFuture<DeleteResourceShareResponse> deleteResourceShareAsync(DeleteResourceShareRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.deleteResourceShare);
    }

    /**
     * 删除资源共享实例
     *
     * 删除指定的资源共享实例。此操作不会删除实体资源，仅停止向其他帐号共享资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceShareRequest 请求对象
     * @return AsyncInvoker<DeleteResourceShareRequest, DeleteResourceShareResponse>
     */
    public AsyncInvoker<DeleteResourceShareRequest, DeleteResourceShareResponse> deleteResourceShareAsyncInvoker(
        DeleteResourceShareRequest request) {
        return new AsyncInvoker<DeleteResourceShareRequest, DeleteResourceShareResponse>(request,
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
     * @return CompletableFuture<SearchResourceSharesResponse>
     */
    public CompletableFuture<SearchResourceSharesResponse> searchResourceSharesAsync(
        SearchResourceSharesRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.searchResourceShares);
    }

    /**
     * 检索资源共享实例
     *
     * 检索您创建的或者共享给您的资源共享实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchResourceSharesRequest 请求对象
     * @return AsyncInvoker<SearchResourceSharesRequest, SearchResourceSharesResponse>
     */
    public AsyncInvoker<SearchResourceSharesRequest, SearchResourceSharesResponse> searchResourceSharesAsyncInvoker(
        SearchResourceSharesRequest request) {
        return new AsyncInvoker<SearchResourceSharesRequest, SearchResourceSharesResponse>(request,
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
     * @return CompletableFuture<UpdateResourceShareResponse>
     */
    public CompletableFuture<UpdateResourceShareResponse> updateResourceShareAsync(UpdateResourceShareRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.updateResourceShare);
    }

    /**
     * 更新资源共享实例
     *
     * 修改资源共享实例的特定属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceShareRequest 请求对象
     * @return AsyncInvoker<UpdateResourceShareRequest, UpdateResourceShareResponse>
     */
    public AsyncInvoker<UpdateResourceShareRequest, UpdateResourceShareResponse> updateResourceShareAsyncInvoker(
        UpdateResourceShareRequest request) {
        return new AsyncInvoker<UpdateResourceShareRequest, UpdateResourceShareResponse>(request,
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
     * @return CompletableFuture<AssociateResourceShareResponse>
     */
    public CompletableFuture<AssociateResourceShareResponse> associateResourceShareAsync(
        AssociateResourceShareRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.associateResourceShare);
    }

    /**
     * 绑定资源使用者和共享资源
     *
     * 向资源共享实例绑定指定的资源使用者列表或共享资源列表。对于新增的共享资源，有权访问此资源共享实例的资源使用者获得该共享资源的访问权限。对于新增的资源使用者，获得对此资源共享实例中共享资源的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateResourceShareRequest 请求对象
     * @return AsyncInvoker<AssociateResourceShareRequest, AssociateResourceShareResponse>
     */
    public AsyncInvoker<AssociateResourceShareRequest, AssociateResourceShareResponse> associateResourceShareAsyncInvoker(
        AssociateResourceShareRequest request) {
        return new AsyncInvoker<AssociateResourceShareRequest, AssociateResourceShareResponse>(request,
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
     * @return CompletableFuture<DisassociateResourceShareResponse>
     */
    public CompletableFuture<DisassociateResourceShareResponse> disassociateResourceShareAsync(
        DisassociateResourceShareRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.disassociateResourceShare);
    }

    /**
     * 移除资源使用者和共享资源
     *
     * 将指定的资源使用者或共享资源从指定的资源共享实例中移除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateResourceShareRequest 请求对象
     * @return AsyncInvoker<DisassociateResourceShareRequest, DisassociateResourceShareResponse>
     */
    public AsyncInvoker<DisassociateResourceShareRequest, DisassociateResourceShareResponse> disassociateResourceShareAsyncInvoker(
        DisassociateResourceShareRequest request) {
        return new AsyncInvoker<DisassociateResourceShareRequest, DisassociateResourceShareResponse>(request,
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
     * @return CompletableFuture<SearchResourceShareAssociationsResponse>
     */
    public CompletableFuture<SearchResourceShareAssociationsResponse> searchResourceShareAssociationsAsync(
        SearchResourceShareAssociationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.searchResourceShareAssociations);
    }

    /**
     * 检索绑定的资源使用者和共享资源
     *
     * 检索您拥有的资源共享实例中绑定的共享资源和资源使用者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchResourceShareAssociationsRequest 请求对象
     * @return AsyncInvoker<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse>
     */
    public AsyncInvoker<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse> searchResourceShareAssociationsAsyncInvoker(
        SearchResourceShareAssociationsRequest request) {
        return new AsyncInvoker<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse>(
            request, RamMeta.searchResourceShareAssociations, hcClient);
    }

    /**
     * 接受共享邀请
     *
     * 接受来自其他帐号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptResourceShareInvitationRequest 请求对象
     * @return CompletableFuture<AcceptResourceShareInvitationResponse>
     */
    public CompletableFuture<AcceptResourceShareInvitationResponse> acceptResourceShareInvitationAsync(
        AcceptResourceShareInvitationRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.acceptResourceShareInvitation);
    }

    /**
     * 接受共享邀请
     *
     * 接受来自其他帐号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptResourceShareInvitationRequest 请求对象
     * @return AsyncInvoker<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse>
     */
    public AsyncInvoker<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse> acceptResourceShareInvitationAsyncInvoker(
        AcceptResourceShareInvitationRequest request) {
        return new AsyncInvoker<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse>(request,
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
     * @return CompletableFuture<RejectResourceShareInvitationResponse>
     */
    public CompletableFuture<RejectResourceShareInvitationResponse> rejectResourceShareInvitationAsync(
        RejectResourceShareInvitationRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.rejectResourceShareInvitation);
    }

    /**
     * 拒绝共享邀请
     *
     * 拒绝来自其他帐号的资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectResourceShareInvitationRequest 请求对象
     * @return AsyncInvoker<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse>
     */
    public AsyncInvoker<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse> rejectResourceShareInvitationAsyncInvoker(
        RejectResourceShareInvitationRequest request) {
        return new AsyncInvoker<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse>(request,
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
     * @return CompletableFuture<SearchResourceShareInvitationResponse>
     */
    public CompletableFuture<SearchResourceShareInvitationResponse> searchResourceShareInvitationAsync(
        SearchResourceShareInvitationRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.searchResourceShareInvitation);
    }

    /**
     * 检索共享邀请
     *
     * 通过条件检索资源共享邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchResourceShareInvitationRequest 请求对象
     * @return AsyncInvoker<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse>
     */
    public AsyncInvoker<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse> searchResourceShareInvitationAsyncInvoker(
        SearchResourceShareInvitationRequest request) {
        return new AsyncInvoker<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse>(request,
            RamMeta.searchResourceShareInvitation, hcClient);
    }

    /**
     * 资源共享实例增加标签
     *
     * 资源共享实例增加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourceShareTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateResourceShareTagsResponse>
     */
    public CompletableFuture<BatchCreateResourceShareTagsResponse> batchCreateResourceShareTagsAsync(
        BatchCreateResourceShareTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.batchCreateResourceShareTags);
    }

    /**
     * 资源共享实例增加标签
     *
     * 资源共享实例增加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourceShareTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse>
     */
    public AsyncInvoker<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse> batchCreateResourceShareTagsAsyncInvoker(
        BatchCreateResourceShareTagsRequest request) {
        return new AsyncInvoker<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse>(request,
            RamMeta.batchCreateResourceShareTags, hcClient);
    }

    /**
     * 删除资源共享实例的标签
     *
     * 删除资源共享实例指定的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceShareTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteResourceShareTagsResponse>
     */
    public CompletableFuture<BatchDeleteResourceShareTagsResponse> batchDeleteResourceShareTagsAsync(
        BatchDeleteResourceShareTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.batchDeleteResourceShareTags);
    }

    /**
     * 删除资源共享实例的标签
     *
     * 删除资源共享实例指定的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceShareTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse>
     */
    public AsyncInvoker<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse> batchDeleteResourceShareTagsAsyncInvoker(
        BatchDeleteResourceShareTagsRequest request) {
        return new AsyncInvoker<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse>(request,
            RamMeta.batchDeleteResourceShareTags, hcClient);
    }

    /**
     * 查询已使用的标签列表
     *
     * 查询资源共享实例已使用标签的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceShareTagsRequest 请求对象
     * @return CompletableFuture<ListResourceShareTagsResponse>
     */
    public CompletableFuture<ListResourceShareTagsResponse> listResourceShareTagsAsync(
        ListResourceShareTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.listResourceShareTags);
    }

    /**
     * 查询已使用的标签列表
     *
     * 查询资源共享实例已使用标签的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceShareTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceShareTagsRequest, ListResourceShareTagsResponse>
     */
    public AsyncInvoker<ListResourceShareTagsRequest, ListResourceShareTagsResponse> listResourceShareTagsAsyncInvoker(
        ListResourceShareTagsRequest request) {
        return new AsyncInvoker<ListResourceShareTagsRequest, ListResourceShareTagsResponse>(request,
            RamMeta.listResourceShareTags, hcClient);
    }

    /**
     * 根据标签信息查询实例列表
     *
     * 根据标签信息查询资源共享实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceSharesByTagsRequest 请求对象
     * @return CompletableFuture<ListResourceSharesByTagsResponse>
     */
    public CompletableFuture<ListResourceSharesByTagsResponse> listResourceSharesByTagsAsync(
        ListResourceSharesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.listResourceSharesByTags);
    }

    /**
     * 根据标签信息查询实例列表
     *
     * 根据标签信息查询资源共享实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceSharesByTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse>
     */
    public AsyncInvoker<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse> listResourceSharesByTagsAsyncInvoker(
        ListResourceSharesByTagsRequest request) {
        return new AsyncInvoker<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse>(request,
            RamMeta.listResourceSharesByTags, hcClient);
    }

    /**
     * 根据标签信息查询实例数量
     *
     * 根据标签信息查询资源共享实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchResourceShareCountByTagsRequest 请求对象
     * @return CompletableFuture<SearchResourceShareCountByTagsResponse>
     */
    public CompletableFuture<SearchResourceShareCountByTagsResponse> searchResourceShareCountByTagsAsync(
        SearchResourceShareCountByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RamMeta.searchResourceShareCountByTags);
    }

    /**
     * 根据标签信息查询实例数量
     *
     * 根据标签信息查询资源共享实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchResourceShareCountByTagsRequest 请求对象
     * @return AsyncInvoker<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse>
     */
    public AsyncInvoker<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse> searchResourceShareCountByTagsAsyncInvoker(
        SearchResourceShareCountByTagsRequest request) {
        return new AsyncInvoker<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse>(request,
            RamMeta.searchResourceShareCountByTags, hcClient);
    }

}
