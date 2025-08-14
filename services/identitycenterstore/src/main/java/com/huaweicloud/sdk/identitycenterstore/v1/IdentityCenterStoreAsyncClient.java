package com.huaweicloud.sdk.identitycenterstore.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchDeleteSessionsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchDeleteSessionsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchListMfaDevicesForUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchListMfaDevicesForUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateBearerTokenRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateBearerTokenResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateProvisioningTenantRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateProvisioningTenantResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateSpCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateSpCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteBearerTokenRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteBearerTokenResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteExternalIdPCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteExternalIdPCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteMfaDeviceForUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteMfaDeviceForUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteProvisioningTenantRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteProvisioningTenantResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteSpCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteSpCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribePasswordPolicyRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribePasswordPolicyResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUsersRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUsersResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DisableExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DisableExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DisableUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DisableUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.EnableExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.EnableExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.EnableUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.EnableUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetIdentityStoreSummaryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetIdentityStoreSummaryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetSpConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetSpConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ImportExternalIdPCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ImportExternalIdPCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListBearerTokensRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListBearerTokensResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListExternalIdPCertificatesRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListExternalIdPCertificatesResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListExternalIdPConfigurationsForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListExternalIdPConfigurationsForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsForMemberRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsForMemberResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListProvisioningTenantsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListProvisioningTenantsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListSessionsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListSessionsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListSpCertificatesRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListSpCertificatesResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.RegisterMfaDeviceForUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.RegisterMfaDeviceForUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ResetPwdModeRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ResetPwdModeResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateMfaDeviceForUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateMfaDeviceForUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdatePasswordPolicyRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdatePasswordPolicyResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateSpActiveCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateSpActiveCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.VerifyEmailRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.VerifyEmailResponse;

import java.util.concurrent.CompletableFuture;

public class IdentityCenterStoreAsyncClient {

    protected HcClient hcClient;

    public IdentityCenterStoreAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterStoreAsyncClient> newBuilder() {
        ClientBuilder<IdentityCenterStoreAsyncClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterStoreAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建用户组
     *
     * 在指定的身份源中创建一个IAM身份中心用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return CompletableFuture<CreateGroupResponse>
     */
    public CompletableFuture<CreateGroupResponse> createGroupAsync(CreateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.createGroup);
    }

    /**
     * 创建用户组
     *
     * 在指定的身份源中创建一个IAM身份中心用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return AsyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public AsyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupAsyncInvoker(CreateGroupRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.createGroup, hcClient);
    }

    /**
     * 删除用户组
     *
     * 根据用户组ID，删除对应的IAM身份中心用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return CompletableFuture<DeleteGroupResponse>
     */
    public CompletableFuture<DeleteGroupResponse> deleteGroupAsync(DeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteGroup);
    }

    /**
     * 删除用户组
     *
     * 根据用户组ID，删除对应的IAM身份中心用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupAsyncInvoker(DeleteGroupRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteGroup, hcClient);
    }

    /**
     * 查询用户组详情
     *
     * 根据用户组ID，查询IAM身份中心用户组的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupRequest 请求对象
     * @return CompletableFuture<DescribeGroupResponse>
     */
    public CompletableFuture<DescribeGroupResponse> describeGroupAsync(DescribeGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.describeGroup);
    }

    /**
     * 查询用户组详情
     *
     * 根据用户组ID，查询IAM身份中心用户组的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupRequest 请求对象
     * @return AsyncInvoker<DescribeGroupRequest, DescribeGroupResponse>
     */
    public AsyncInvoker<DescribeGroupRequest, DescribeGroupResponse> describeGroupAsyncInvoker(
        DescribeGroupRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.describeGroup, hcClient);
    }

    /**
     * 批量查询指定用户组详情
     *
     * 批量查询指定用户组详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupsRequest 请求对象
     * @return CompletableFuture<DescribeGroupsResponse>
     */
    public CompletableFuture<DescribeGroupsResponse> describeGroupsAsync(DescribeGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.describeGroups);
    }

    /**
     * 批量查询指定用户组详情
     *
     * 批量查询指定用户组详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupsRequest 请求对象
     * @return AsyncInvoker<DescribeGroupsRequest, DescribeGroupsResponse>
     */
    public AsyncInvoker<DescribeGroupsRequest, DescribeGroupsResponse> describeGroupsAsyncInvoker(
        DescribeGroupsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.describeGroups, hcClient);
    }

    /**
     * 查询用户组ID
     *
     * 根据显示名或外部身份源ID，以精确匹配的方式查询用户组ID。显示名和外部身份源ID两种查询方式二选一，不支持同时传入。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupIdRequest 请求对象
     * @return CompletableFuture<GetGroupIdResponse>
     */
    public CompletableFuture<GetGroupIdResponse> getGroupIdAsync(GetGroupIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.getGroupId);
    }

    /**
     * 查询用户组ID
     *
     * 根据显示名或外部身份源ID，以精确匹配的方式查询用户组ID。显示名和外部身份源ID两种查询方式二选一，不支持同时传入。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupIdRequest 请求对象
     * @return AsyncInvoker<GetGroupIdRequest, GetGroupIdResponse>
     */
    public AsyncInvoker<GetGroupIdRequest, GetGroupIdResponse> getGroupIdAsyncInvoker(GetGroupIdRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.getGroupId, hcClient);
    }

    /**
     * 列出用户组
     *
     * 查询指定身份源下的IAM身份中心用户组列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return CompletableFuture<ListGroupsResponse>
     */
    public CompletableFuture<ListGroupsResponse> listGroupsAsync(ListGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listGroups);
    }

    /**
     * 列出用户组
     *
     * 查询指定身份源下的IAM身份中心用户组列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return AsyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public AsyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsAsyncInvoker(ListGroupsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listGroups, hcClient);
    }

    /**
     * 更新用户组
     *
     * 根据用户组ID，更新对应IAM身份中心用户组的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupRequest 请求对象
     * @return CompletableFuture<UpdateGroupResponse>
     */
    public CompletableFuture<UpdateGroupResponse> updateGroupAsync(UpdateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.updateGroup);
    }

    /**
     * 更新用户组
     *
     * 根据用户组ID，更新对应IAM身份中心用户组的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupRequest 请求对象
     * @return AsyncInvoker<UpdateGroupRequest, UpdateGroupResponse>
     */
    public AsyncInvoker<UpdateGroupRequest, UpdateGroupResponse> updateGroupAsyncInvoker(UpdateGroupRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.updateGroup, hcClient);
    }

    /**
     * 绑定用户和组
     *
     * 将用户添加到用户组中，用户和用户组必须在同一身份源下。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMembershipRequest 请求对象
     * @return CompletableFuture<CreateGroupMembershipResponse>
     */
    public CompletableFuture<CreateGroupMembershipResponse> createGroupMembershipAsync(
        CreateGroupMembershipRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.createGroupMembership);
    }

    /**
     * 绑定用户和组
     *
     * 将用户添加到用户组中，用户和用户组必须在同一身份源下。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMembershipRequest 请求对象
     * @return AsyncInvoker<CreateGroupMembershipRequest, CreateGroupMembershipResponse>
     */
    public AsyncInvoker<CreateGroupMembershipRequest, CreateGroupMembershipResponse> createGroupMembershipAsyncInvoker(
        CreateGroupMembershipRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.createGroupMembership, hcClient);
    }

    /**
     * 解绑用户和组
     *
     * 根据关联关系ID解绑用户和用户组，也就是将用户移出用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMembershipRequest 请求对象
     * @return CompletableFuture<DeleteGroupMembershipResponse>
     */
    public CompletableFuture<DeleteGroupMembershipResponse> deleteGroupMembershipAsync(
        DeleteGroupMembershipRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteGroupMembership);
    }

    /**
     * 解绑用户和组
     *
     * 根据关联关系ID解绑用户和用户组，也就是将用户移出用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMembershipRequest 请求对象
     * @return AsyncInvoker<DeleteGroupMembershipRequest, DeleteGroupMembershipResponse>
     */
    public AsyncInvoker<DeleteGroupMembershipRequest, DeleteGroupMembershipResponse> deleteGroupMembershipAsyncInvoker(
        DeleteGroupMembershipRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteGroupMembership, hcClient);
    }

    /**
     * 查询绑定关系详情
     *
     * 根据关联关系ID，查询此关联关系的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupMembershipRequest 请求对象
     * @return CompletableFuture<DescribeGroupMembershipResponse>
     */
    public CompletableFuture<DescribeGroupMembershipResponse> describeGroupMembershipAsync(
        DescribeGroupMembershipRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.describeGroupMembership);
    }

    /**
     * 查询绑定关系详情
     *
     * 根据关联关系ID，查询此关联关系的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupMembershipRequest 请求对象
     * @return AsyncInvoker<DescribeGroupMembershipRequest, DescribeGroupMembershipResponse>
     */
    public AsyncInvoker<DescribeGroupMembershipRequest, DescribeGroupMembershipResponse> describeGroupMembershipAsyncInvoker(
        DescribeGroupMembershipRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.describeGroupMembership, hcClient);
    }

    /**
     * 查询绑定关系ID
     *
     * 根据用户ID和用户组ID，查询对应的关联关系ID。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupMembershipIdRequest 请求对象
     * @return CompletableFuture<GetGroupMembershipIdResponse>
     */
    public CompletableFuture<GetGroupMembershipIdResponse> getGroupMembershipIdAsync(
        GetGroupMembershipIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.getGroupMembershipId);
    }

    /**
     * 查询绑定关系ID
     *
     * 根据用户ID和用户组ID，查询对应的关联关系ID。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupMembershipIdRequest 请求对象
     * @return AsyncInvoker<GetGroupMembershipIdRequest, GetGroupMembershipIdResponse>
     */
    public AsyncInvoker<GetGroupMembershipIdRequest, GetGroupMembershipIdResponse> getGroupMembershipIdAsyncInvoker(
        GetGroupMembershipIdRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.getGroupMembershipId, hcClient);
    }

    /**
     * 查询用户是否是用户组成员
     *
     * 根据用户ID和用户组ID列表，查询用户是否为用户组的成员。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request IsMemberInGroupsRequest 请求对象
     * @return CompletableFuture<IsMemberInGroupsResponse>
     */
    public CompletableFuture<IsMemberInGroupsResponse> isMemberInGroupsAsync(IsMemberInGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.isMemberInGroups);
    }

    /**
     * 查询用户是否是用户组成员
     *
     * 根据用户ID和用户组ID列表，查询用户是否为用户组的成员。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request IsMemberInGroupsRequest 请求对象
     * @return AsyncInvoker<IsMemberInGroupsRequest, IsMemberInGroupsResponse>
     */
    public AsyncInvoker<IsMemberInGroupsRequest, IsMemberInGroupsResponse> isMemberInGroupsAsyncInvoker(
        IsMemberInGroupsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.isMemberInGroups, hcClient);
    }

    /**
     * 列出组中的用户
     *
     * 根据用户组ID，列出用户组中的用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembershipsRequest 请求对象
     * @return CompletableFuture<ListGroupMembershipsResponse>
     */
    public CompletableFuture<ListGroupMembershipsResponse> listGroupMembershipsAsync(
        ListGroupMembershipsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listGroupMemberships);
    }

    /**
     * 列出组中的用户
     *
     * 根据用户组ID，列出用户组中的用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembershipsRequest 请求对象
     * @return AsyncInvoker<ListGroupMembershipsRequest, ListGroupMembershipsResponse>
     */
    public AsyncInvoker<ListGroupMembershipsRequest, ListGroupMembershipsResponse> listGroupMembershipsAsyncInvoker(
        ListGroupMembershipsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listGroupMemberships, hcClient);
    }

    /**
     * 列出用户加入的组
     *
     * 根据用户ID，列出用户加入的用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembershipsForMemberRequest 请求对象
     * @return CompletableFuture<ListGroupMembershipsForMemberResponse>
     */
    public CompletableFuture<ListGroupMembershipsForMemberResponse> listGroupMembershipsForMemberAsync(
        ListGroupMembershipsForMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listGroupMembershipsForMember);
    }

    /**
     * 列出用户加入的组
     *
     * 根据用户ID，列出用户加入的用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembershipsForMemberRequest 请求对象
     * @return AsyncInvoker<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResponse>
     */
    public AsyncInvoker<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResponse> listGroupMembershipsForMemberAsyncInvoker(
        ListGroupMembershipsForMemberRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listGroupMembershipsForMember, hcClient);
    }

    /**
     * 创建外部身份提供商配置
     *
     * 创建外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return CompletableFuture<CreateExternalIdPConfigurationForDirectoryResponse>
     */
    public CompletableFuture<CreateExternalIdPConfigurationForDirectoryResponse> createExternalIdPConfigurationForDirectoryAsync(
        CreateExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.createExternalIdPConfigurationForDirectory);
    }

    /**
     * 创建外部身份提供商配置
     *
     * 创建外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return AsyncInvoker<CreateExternalIdPConfigurationForDirectoryRequest, CreateExternalIdPConfigurationForDirectoryResponse>
     */
    public AsyncInvoker<CreateExternalIdPConfigurationForDirectoryRequest, CreateExternalIdPConfigurationForDirectoryResponse> createExternalIdPConfigurationForDirectoryAsyncInvoker(
        CreateExternalIdPConfigurationForDirectoryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.createExternalIdPConfigurationForDirectory,
            hcClient);
    }

    /**
     * 删除外部身份提供商证书
     *
     * 删除外部身份提供商证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalIdPCertificateRequest 请求对象
     * @return CompletableFuture<DeleteExternalIdPCertificateResponse>
     */
    public CompletableFuture<DeleteExternalIdPCertificateResponse> deleteExternalIdPCertificateAsync(
        DeleteExternalIdPCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteExternalIdPCertificate);
    }

    /**
     * 删除外部身份提供商证书
     *
     * 删除外部身份提供商证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalIdPCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteExternalIdPCertificateRequest, DeleteExternalIdPCertificateResponse>
     */
    public AsyncInvoker<DeleteExternalIdPCertificateRequest, DeleteExternalIdPCertificateResponse> deleteExternalIdPCertificateAsyncInvoker(
        DeleteExternalIdPCertificateRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteExternalIdPCertificate, hcClient);
    }

    /**
     * 删除外部身份提供商配置
     *
     * 删除外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return CompletableFuture<DeleteExternalIdPConfigurationForDirectoryResponse>
     */
    public CompletableFuture<DeleteExternalIdPConfigurationForDirectoryResponse> deleteExternalIdPConfigurationForDirectoryAsync(
        DeleteExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteExternalIdPConfigurationForDirectory);
    }

    /**
     * 删除外部身份提供商配置
     *
     * 删除外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return AsyncInvoker<DeleteExternalIdPConfigurationForDirectoryRequest, DeleteExternalIdPConfigurationForDirectoryResponse>
     */
    public AsyncInvoker<DeleteExternalIdPConfigurationForDirectoryRequest, DeleteExternalIdPConfigurationForDirectoryResponse> deleteExternalIdPConfigurationForDirectoryAsyncInvoker(
        DeleteExternalIdPConfigurationForDirectoryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteExternalIdPConfigurationForDirectory,
            hcClient);
    }

    /**
     * 停用外部身份提供商
     *
     * 停用外部身份提供商。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return CompletableFuture<DisableExternalIdPConfigurationForDirectoryResponse>
     */
    public CompletableFuture<DisableExternalIdPConfigurationForDirectoryResponse> disableExternalIdPConfigurationForDirectoryAsync(
        DisableExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.disableExternalIdPConfigurationForDirectory);
    }

    /**
     * 停用外部身份提供商
     *
     * 停用外部身份提供商。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return AsyncInvoker<DisableExternalIdPConfigurationForDirectoryRequest, DisableExternalIdPConfigurationForDirectoryResponse>
     */
    public AsyncInvoker<DisableExternalIdPConfigurationForDirectoryRequest, DisableExternalIdPConfigurationForDirectoryResponse> disableExternalIdPConfigurationForDirectoryAsyncInvoker(
        DisableExternalIdPConfigurationForDirectoryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.disableExternalIdPConfigurationForDirectory,
            hcClient);
    }

    /**
     * 启用外部身份提供商
     *
     * 启用外部身份提供商。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return CompletableFuture<EnableExternalIdPConfigurationForDirectoryResponse>
     */
    public CompletableFuture<EnableExternalIdPConfigurationForDirectoryResponse> enableExternalIdPConfigurationForDirectoryAsync(
        EnableExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.enableExternalIdPConfigurationForDirectory);
    }

    /**
     * 启用外部身份提供商
     *
     * 启用外部身份提供商。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return AsyncInvoker<EnableExternalIdPConfigurationForDirectoryRequest, EnableExternalIdPConfigurationForDirectoryResponse>
     */
    public AsyncInvoker<EnableExternalIdPConfigurationForDirectoryRequest, EnableExternalIdPConfigurationForDirectoryResponse> enableExternalIdPConfigurationForDirectoryAsyncInvoker(
        EnableExternalIdPConfigurationForDirectoryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.enableExternalIdPConfigurationForDirectory,
            hcClient);
    }

    /**
     * 导入外部身份提供商证书
     *
     * 导入外部身份提供商证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportExternalIdPCertificateRequest 请求对象
     * @return CompletableFuture<ImportExternalIdPCertificateResponse>
     */
    public CompletableFuture<ImportExternalIdPCertificateResponse> importExternalIdPCertificateAsync(
        ImportExternalIdPCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.importExternalIdPCertificate);
    }

    /**
     * 导入外部身份提供商证书
     *
     * 导入外部身份提供商证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportExternalIdPCertificateRequest 请求对象
     * @return AsyncInvoker<ImportExternalIdPCertificateRequest, ImportExternalIdPCertificateResponse>
     */
    public AsyncInvoker<ImportExternalIdPCertificateRequest, ImportExternalIdPCertificateResponse> importExternalIdPCertificateAsyncInvoker(
        ImportExternalIdPCertificateRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.importExternalIdPCertificate, hcClient);
    }

    /**
     * 列出外部身份提供商证书
     *
     * 查询外部身份提供商证书列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalIdPCertificatesRequest 请求对象
     * @return CompletableFuture<ListExternalIdPCertificatesResponse>
     */
    public CompletableFuture<ListExternalIdPCertificatesResponse> listExternalIdPCertificatesAsync(
        ListExternalIdPCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listExternalIdPCertificates);
    }

    /**
     * 列出外部身份提供商证书
     *
     * 查询外部身份提供商证书列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalIdPCertificatesRequest 请求对象
     * @return AsyncInvoker<ListExternalIdPCertificatesRequest, ListExternalIdPCertificatesResponse>
     */
    public AsyncInvoker<ListExternalIdPCertificatesRequest, ListExternalIdPCertificatesResponse> listExternalIdPCertificatesAsyncInvoker(
        ListExternalIdPCertificatesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listExternalIdPCertificates, hcClient);
    }

    /**
     * 查询外部身份提供商配置
     *
     * 查询外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalIdPConfigurationsForDirectoryRequest 请求对象
     * @return CompletableFuture<ListExternalIdPConfigurationsForDirectoryResponse>
     */
    public CompletableFuture<ListExternalIdPConfigurationsForDirectoryResponse> listExternalIdPConfigurationsForDirectoryAsync(
        ListExternalIdPConfigurationsForDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listExternalIdPConfigurationsForDirectory);
    }

    /**
     * 查询外部身份提供商配置
     *
     * 查询外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalIdPConfigurationsForDirectoryRequest 请求对象
     * @return AsyncInvoker<ListExternalIdPConfigurationsForDirectoryRequest, ListExternalIdPConfigurationsForDirectoryResponse>
     */
    public AsyncInvoker<ListExternalIdPConfigurationsForDirectoryRequest, ListExternalIdPConfigurationsForDirectoryResponse> listExternalIdPConfigurationsForDirectoryAsyncInvoker(
        ListExternalIdPConfigurationsForDirectoryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listExternalIdPConfigurationsForDirectory, hcClient);
    }

    /**
     * 更新外部身份提供商配置
     *
     * 更新外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return CompletableFuture<UpdateExternalIdPConfigurationForDirectoryResponse>
     */
    public CompletableFuture<UpdateExternalIdPConfigurationForDirectoryResponse> updateExternalIdPConfigurationForDirectoryAsync(
        UpdateExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.updateExternalIdPConfigurationForDirectory);
    }

    /**
     * 更新外部身份提供商配置
     *
     * 更新外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return AsyncInvoker<UpdateExternalIdPConfigurationForDirectoryRequest, UpdateExternalIdPConfigurationForDirectoryResponse>
     */
    public AsyncInvoker<UpdateExternalIdPConfigurationForDirectoryRequest, UpdateExternalIdPConfigurationForDirectoryResponse> updateExternalIdPConfigurationForDirectoryAsyncInvoker(
        UpdateExternalIdPConfigurationForDirectoryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.updateExternalIdPConfigurationForDirectory,
            hcClient);
    }

    /**
     * 查询自定义密码策略
     *
     * 查询自定义密码策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePasswordPolicyRequest 请求对象
     * @return CompletableFuture<DescribePasswordPolicyResponse>
     */
    public CompletableFuture<DescribePasswordPolicyResponse> describePasswordPolicyAsync(
        DescribePasswordPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.describePasswordPolicy);
    }

    /**
     * 查询自定义密码策略
     *
     * 查询自定义密码策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePasswordPolicyRequest 请求对象
     * @return AsyncInvoker<DescribePasswordPolicyRequest, DescribePasswordPolicyResponse>
     */
    public AsyncInvoker<DescribePasswordPolicyRequest, DescribePasswordPolicyResponse> describePasswordPolicyAsyncInvoker(
        DescribePasswordPolicyRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.describePasswordPolicy, hcClient);
    }

    /**
     * 更新自定义密码策略
     *
     * 更新自定义密码策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordPolicyRequest 请求对象
     * @return CompletableFuture<UpdatePasswordPolicyResponse>
     */
    public CompletableFuture<UpdatePasswordPolicyResponse> updatePasswordPolicyAsync(
        UpdatePasswordPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.updatePasswordPolicy);
    }

    /**
     * 更新自定义密码策略
     *
     * 更新自定义密码策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordPolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePasswordPolicyRequest, UpdatePasswordPolicyResponse>
     */
    public AsyncInvoker<UpdatePasswordPolicyRequest, UpdatePasswordPolicyResponse> updatePasswordPolicyAsyncInvoker(
        UpdatePasswordPolicyRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.updatePasswordPolicy, hcClient);
    }

    /**
     * 创建服务提供商证书
     *
     * 创建服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpCertificateRequest 请求对象
     * @return CompletableFuture<CreateSpCertificateResponse>
     */
    public CompletableFuture<CreateSpCertificateResponse> createSpCertificateAsync(CreateSpCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.createSpCertificate);
    }

    /**
     * 创建服务提供商证书
     *
     * 创建服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpCertificateRequest 请求对象
     * @return AsyncInvoker<CreateSpCertificateRequest, CreateSpCertificateResponse>
     */
    public AsyncInvoker<CreateSpCertificateRequest, CreateSpCertificateResponse> createSpCertificateAsyncInvoker(
        CreateSpCertificateRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.createSpCertificate, hcClient);
    }

    /**
     * 删除服务提供商证书
     *
     * 删除服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSpCertificateRequest 请求对象
     * @return CompletableFuture<DeleteSpCertificateResponse>
     */
    public CompletableFuture<DeleteSpCertificateResponse> deleteSpCertificateAsync(DeleteSpCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteSpCertificate);
    }

    /**
     * 删除服务提供商证书
     *
     * 删除服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSpCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteSpCertificateRequest, DeleteSpCertificateResponse>
     */
    public AsyncInvoker<DeleteSpCertificateRequest, DeleteSpCertificateResponse> deleteSpCertificateAsyncInvoker(
        DeleteSpCertificateRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteSpCertificate, hcClient);
    }

    /**
     * 查询服务提供商配置
     *
     * 查询服务提供商配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetSpConfigurationForDirectoryRequest 请求对象
     * @return CompletableFuture<GetSpConfigurationForDirectoryResponse>
     */
    public CompletableFuture<GetSpConfigurationForDirectoryResponse> getSpConfigurationForDirectoryAsync(
        GetSpConfigurationForDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.getSpConfigurationForDirectory);
    }

    /**
     * 查询服务提供商配置
     *
     * 查询服务提供商配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetSpConfigurationForDirectoryRequest 请求对象
     * @return AsyncInvoker<GetSpConfigurationForDirectoryRequest, GetSpConfigurationForDirectoryResponse>
     */
    public AsyncInvoker<GetSpConfigurationForDirectoryRequest, GetSpConfigurationForDirectoryResponse> getSpConfigurationForDirectoryAsyncInvoker(
        GetSpConfigurationForDirectoryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.getSpConfigurationForDirectory, hcClient);
    }

    /**
     * 列出服务提供商证书
     *
     * 查询服务提供商SAML协议签名证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpCertificatesRequest 请求对象
     * @return CompletableFuture<ListSpCertificatesResponse>
     */
    public CompletableFuture<ListSpCertificatesResponse> listSpCertificatesAsync(ListSpCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listSpCertificates);
    }

    /**
     * 列出服务提供商证书
     *
     * 查询服务提供商SAML协议签名证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpCertificatesRequest 请求对象
     * @return AsyncInvoker<ListSpCertificatesRequest, ListSpCertificatesResponse>
     */
    public AsyncInvoker<ListSpCertificatesRequest, ListSpCertificatesResponse> listSpCertificatesAsyncInvoker(
        ListSpCertificatesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listSpCertificates, hcClient);
    }

    /**
     * 激活服务提供商证书
     *
     * 激活服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSpActiveCertificateRequest 请求对象
     * @return CompletableFuture<UpdateSpActiveCertificateResponse>
     */
    public CompletableFuture<UpdateSpActiveCertificateResponse> updateSpActiveCertificateAsync(
        UpdateSpActiveCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.updateSpActiveCertificate);
    }

    /**
     * 激活服务提供商证书
     *
     * 激活服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSpActiveCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateSpActiveCertificateRequest, UpdateSpActiveCertificateResponse>
     */
    public AsyncInvoker<UpdateSpActiveCertificateRequest, UpdateSpActiveCertificateResponse> updateSpActiveCertificateAsyncInvoker(
        UpdateSpActiveCertificateRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.updateSpActiveCertificate, hcClient);
    }

    /**
     * 查询身份源配额信息
     *
     * 查询身份源配额信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetIdentityStoreSummaryRequest 请求对象
     * @return CompletableFuture<GetIdentityStoreSummaryResponse>
     */
    public CompletableFuture<GetIdentityStoreSummaryResponse> getIdentityStoreSummaryAsync(
        GetIdentityStoreSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.getIdentityStoreSummary);
    }

    /**
     * 查询身份源配额信息
     *
     * 查询身份源配额信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetIdentityStoreSummaryRequest 请求对象
     * @return AsyncInvoker<GetIdentityStoreSummaryRequest, GetIdentityStoreSummaryResponse>
     */
    public AsyncInvoker<GetIdentityStoreSummaryRequest, GetIdentityStoreSummaryResponse> getIdentityStoreSummaryAsyncInvoker(
        GetIdentityStoreSummaryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.getIdentityStoreSummary, hcClient);
    }

    /**
     * 创建访问令牌
     *
     * 创建访问令牌。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBearerTokenRequest 请求对象
     * @return CompletableFuture<CreateBearerTokenResponse>
     */
    public CompletableFuture<CreateBearerTokenResponse> createBearerTokenAsync(CreateBearerTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.createBearerToken);
    }

    /**
     * 创建访问令牌
     *
     * 创建访问令牌。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBearerTokenRequest 请求对象
     * @return AsyncInvoker<CreateBearerTokenRequest, CreateBearerTokenResponse>
     */
    public AsyncInvoker<CreateBearerTokenRequest, CreateBearerTokenResponse> createBearerTokenAsyncInvoker(
        CreateBearerTokenRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.createBearerToken, hcClient);
    }

    /**
     * 启用自动预置
     *
     * 启用自动预置，开启SCIM协议自动同步功能。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProvisioningTenantRequest 请求对象
     * @return CompletableFuture<CreateProvisioningTenantResponse>
     */
    public CompletableFuture<CreateProvisioningTenantResponse> createProvisioningTenantAsync(
        CreateProvisioningTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.createProvisioningTenant);
    }

    /**
     * 启用自动预置
     *
     * 启用自动预置，开启SCIM协议自动同步功能。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProvisioningTenantRequest 请求对象
     * @return AsyncInvoker<CreateProvisioningTenantRequest, CreateProvisioningTenantResponse>
     */
    public AsyncInvoker<CreateProvisioningTenantRequest, CreateProvisioningTenantResponse> createProvisioningTenantAsyncInvoker(
        CreateProvisioningTenantRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.createProvisioningTenant, hcClient);
    }

    /**
     * 删除访问令牌
     *
     * 删除访问令牌。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBearerTokenRequest 请求对象
     * @return CompletableFuture<DeleteBearerTokenResponse>
     */
    public CompletableFuture<DeleteBearerTokenResponse> deleteBearerTokenAsync(DeleteBearerTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteBearerToken);
    }

    /**
     * 删除访问令牌
     *
     * 删除访问令牌。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBearerTokenRequest 请求对象
     * @return AsyncInvoker<DeleteBearerTokenRequest, DeleteBearerTokenResponse>
     */
    public AsyncInvoker<DeleteBearerTokenRequest, DeleteBearerTokenResponse> deleteBearerTokenAsyncInvoker(
        DeleteBearerTokenRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteBearerToken, hcClient);
    }

    /**
     * 删除自动预置
     *
     * 删除自动预置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProvisioningTenantRequest 请求对象
     * @return CompletableFuture<DeleteProvisioningTenantResponse>
     */
    public CompletableFuture<DeleteProvisioningTenantResponse> deleteProvisioningTenantAsync(
        DeleteProvisioningTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteProvisioningTenant);
    }

    /**
     * 删除自动预置
     *
     * 删除自动预置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProvisioningTenantRequest 请求对象
     * @return AsyncInvoker<DeleteProvisioningTenantRequest, DeleteProvisioningTenantResponse>
     */
    public AsyncInvoker<DeleteProvisioningTenantRequest, DeleteProvisioningTenantResponse> deleteProvisioningTenantAsyncInvoker(
        DeleteProvisioningTenantRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteProvisioningTenant, hcClient);
    }

    /**
     * 列出访问令牌
     *
     * 查询访问令牌列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBearerTokensRequest 请求对象
     * @return CompletableFuture<ListBearerTokensResponse>
     */
    public CompletableFuture<ListBearerTokensResponse> listBearerTokensAsync(ListBearerTokensRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listBearerTokens);
    }

    /**
     * 列出访问令牌
     *
     * 查询访问令牌列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBearerTokensRequest 请求对象
     * @return AsyncInvoker<ListBearerTokensRequest, ListBearerTokensResponse>
     */
    public AsyncInvoker<ListBearerTokensRequest, ListBearerTokensResponse> listBearerTokensAsyncInvoker(
        ListBearerTokensRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listBearerTokens, hcClient);
    }

    /**
     * 查询自动预置信息
     *
     * 查询是否开启自动预置，返回具体SCIM自动预配配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvisioningTenantsRequest 请求对象
     * @return CompletableFuture<ListProvisioningTenantsResponse>
     */
    public CompletableFuture<ListProvisioningTenantsResponse> listProvisioningTenantsAsync(
        ListProvisioningTenantsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listProvisioningTenants);
    }

    /**
     * 查询自动预置信息
     *
     * 查询是否开启自动预置，返回具体SCIM自动预配配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvisioningTenantsRequest 请求对象
     * @return AsyncInvoker<ListProvisioningTenantsRequest, ListProvisioningTenantsResponse>
     */
    public AsyncInvoker<ListProvisioningTenantsRequest, ListProvisioningTenantsResponse> listProvisioningTenantsAsyncInvoker(
        ListProvisioningTenantsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listProvisioningTenants, hcClient);
    }

    /**
     * 批量删除用户登录会话
     *
     * 批量删除用户登录会话。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSessionsRequest 请求对象
     * @return CompletableFuture<BatchDeleteSessionsResponse>
     */
    public CompletableFuture<BatchDeleteSessionsResponse> batchDeleteSessionsAsync(BatchDeleteSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.batchDeleteSessions);
    }

    /**
     * 批量删除用户登录会话
     *
     * 批量删除用户登录会话。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSessionsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSessionsRequest, BatchDeleteSessionsResponse>
     */
    public AsyncInvoker<BatchDeleteSessionsRequest, BatchDeleteSessionsResponse> batchDeleteSessionsAsyncInvoker(
        BatchDeleteSessionsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.batchDeleteSessions, hcClient);
    }

    /**
     * 列出用户MFA设备
     *
     * 查询指定用户的MFA设备列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListMfaDevicesForUserRequest 请求对象
     * @return CompletableFuture<BatchListMfaDevicesForUserResponse>
     */
    public CompletableFuture<BatchListMfaDevicesForUserResponse> batchListMfaDevicesForUserAsync(
        BatchListMfaDevicesForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.batchListMfaDevicesForUser);
    }

    /**
     * 列出用户MFA设备
     *
     * 查询指定用户的MFA设备列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListMfaDevicesForUserRequest 请求对象
     * @return AsyncInvoker<BatchListMfaDevicesForUserRequest, BatchListMfaDevicesForUserResponse>
     */
    public AsyncInvoker<BatchListMfaDevicesForUserRequest, BatchListMfaDevicesForUserResponse> batchListMfaDevicesForUserAsyncInvoker(
        BatchListMfaDevicesForUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.batchListMfaDevicesForUser, hcClient);
    }

    /**
     * 创建用户
     *
     * 在指定的身份源中创建一个IAM身份中心用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CompletableFuture<CreateUserResponse>
     */
    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 在指定的身份源中创建一个IAM身份中心用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.createUser, hcClient);
    }

    /**
     * 删除用户MFA设备
     *
     * 删除用户绑定的MFA设备。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMfaDeviceForUserRequest 请求对象
     * @return CompletableFuture<DeleteMfaDeviceForUserResponse>
     */
    public CompletableFuture<DeleteMfaDeviceForUserResponse> deleteMfaDeviceForUserAsync(
        DeleteMfaDeviceForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteMfaDeviceForUser);
    }

    /**
     * 删除用户MFA设备
     *
     * 删除用户绑定的MFA设备。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMfaDeviceForUserRequest 请求对象
     * @return AsyncInvoker<DeleteMfaDeviceForUserRequest, DeleteMfaDeviceForUserResponse>
     */
    public AsyncInvoker<DeleteMfaDeviceForUserRequest, DeleteMfaDeviceForUserResponse> deleteMfaDeviceForUserAsyncInvoker(
        DeleteMfaDeviceForUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteMfaDeviceForUser, hcClient);
    }

    /**
     * 删除用户
     *
     * 根据用户ID，删除对应的IAM身份中心用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 根据用户ID，删除对应的IAM身份中心用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.deleteUser, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 根据用户ID，查询对应IAM身份中心用户的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeUserRequest 请求对象
     * @return CompletableFuture<DescribeUserResponse>
     */
    public CompletableFuture<DescribeUserResponse> describeUserAsync(DescribeUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.describeUser);
    }

    /**
     * 查询用户详情
     *
     * 根据用户ID，查询对应IAM身份中心用户的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeUserRequest 请求对象
     * @return AsyncInvoker<DescribeUserRequest, DescribeUserResponse>
     */
    public AsyncInvoker<DescribeUserRequest, DescribeUserResponse> describeUserAsyncInvoker(
        DescribeUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.describeUser, hcClient);
    }

    /**
     * 批量查询指定用户详情
     *
     * 批量查询指定用户详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeUsersRequest 请求对象
     * @return CompletableFuture<DescribeUsersResponse>
     */
    public CompletableFuture<DescribeUsersResponse> describeUsersAsync(DescribeUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.describeUsers);
    }

    /**
     * 批量查询指定用户详情
     *
     * 批量查询指定用户详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeUsersRequest 请求对象
     * @return AsyncInvoker<DescribeUsersRequest, DescribeUsersResponse>
     */
    public AsyncInvoker<DescribeUsersRequest, DescribeUsersResponse> describeUsersAsyncInvoker(
        DescribeUsersRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.describeUsers, hcClient);
    }

    /**
     * 禁用用户
     *
     * 禁用IAM身份中心的用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableUserRequest 请求对象
     * @return CompletableFuture<DisableUserResponse>
     */
    public CompletableFuture<DisableUserResponse> disableUserAsync(DisableUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.disableUser);
    }

    /**
     * 禁用用户
     *
     * 禁用IAM身份中心的用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableUserRequest 请求对象
     * @return AsyncInvoker<DisableUserRequest, DisableUserResponse>
     */
    public AsyncInvoker<DisableUserRequest, DisableUserResponse> disableUserAsyncInvoker(DisableUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.disableUser, hcClient);
    }

    /**
     * 启用用户
     *
     * 启用IAM身份中心的用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableUserRequest 请求对象
     * @return CompletableFuture<EnableUserResponse>
     */
    public CompletableFuture<EnableUserResponse> enableUserAsync(EnableUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.enableUser);
    }

    /**
     * 启用用户
     *
     * 启用IAM身份中心的用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableUserRequest 请求对象
     * @return AsyncInvoker<EnableUserRequest, EnableUserResponse>
     */
    public AsyncInvoker<EnableUserRequest, EnableUserResponse> enableUserAsyncInvoker(EnableUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.enableUser, hcClient);
    }

    /**
     * 查询用户ID
     *
     * 根据用户名或外部身份源ID，以精确匹配的方式查询用户ID。用户名和外部身份源ID两种查询方式二选一，不支持同时传入。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetUserIdRequest 请求对象
     * @return CompletableFuture<GetUserIdResponse>
     */
    public CompletableFuture<GetUserIdResponse> getUserIdAsync(GetUserIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.getUserId);
    }

    /**
     * 查询用户ID
     *
     * 根据用户名或外部身份源ID，以精确匹配的方式查询用户ID。用户名和外部身份源ID两种查询方式二选一，不支持同时传入。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetUserIdRequest 请求对象
     * @return AsyncInvoker<GetUserIdRequest, GetUserIdResponse>
     */
    public AsyncInvoker<GetUserIdRequest, GetUserIdResponse> getUserIdAsyncInvoker(GetUserIdRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.getUserId, hcClient);
    }

    /**
     * 列出用户登录会话
     *
     * 查询指定用户的登录会话信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return CompletableFuture<ListSessionsResponse>
     */
    public CompletableFuture<ListSessionsResponse> listSessionsAsync(ListSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listSessions);
    }

    /**
     * 列出用户登录会话
     *
     * 查询指定用户的登录会话信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return AsyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public AsyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsAsyncInvoker(
        ListSessionsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listSessions, hcClient);
    }

    /**
     * 列出用户
     *
     * 查询指定身份源下的IAM身份中心用户列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listUsers);
    }

    /**
     * 列出用户
     *
     * 查询指定身份源下的IAM身份中心用户列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.listUsers, hcClient);
    }

    /**
     * 注册MFA设备
     *
     * 为用户发起注册MFA设备，返回一个MFA注册地址。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterMfaDeviceForUserRequest 请求对象
     * @return CompletableFuture<RegisterMfaDeviceForUserResponse>
     */
    public CompletableFuture<RegisterMfaDeviceForUserResponse> registerMfaDeviceForUserAsync(
        RegisterMfaDeviceForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.registerMfaDeviceForUser);
    }

    /**
     * 注册MFA设备
     *
     * 为用户发起注册MFA设备，返回一个MFA注册地址。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterMfaDeviceForUserRequest 请求对象
     * @return AsyncInvoker<RegisterMfaDeviceForUserRequest, RegisterMfaDeviceForUserResponse>
     */
    public AsyncInvoker<RegisterMfaDeviceForUserRequest, RegisterMfaDeviceForUserResponse> registerMfaDeviceForUserAsyncInvoker(
        RegisterMfaDeviceForUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.registerMfaDeviceForUser, hcClient);
    }

    /**
     * 通过电子邮件发送密码重置链接或生成用户的一次性密码
     *
     * 通过电子邮件发送密码重置链接或生成用户的一次性密码。。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdModeRequest 请求对象
     * @return CompletableFuture<ResetPwdModeResponse>
     */
    public CompletableFuture<ResetPwdModeResponse> resetPwdModeAsync(ResetPwdModeRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.resetPwdMode);
    }

    /**
     * 通过电子邮件发送密码重置链接或生成用户的一次性密码
     *
     * 通过电子邮件发送密码重置链接或生成用户的一次性密码。。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdModeRequest 请求对象
     * @return AsyncInvoker<ResetPwdModeRequest, ResetPwdModeResponse>
     */
    public AsyncInvoker<ResetPwdModeRequest, ResetPwdModeResponse> resetPwdModeAsyncInvoker(
        ResetPwdModeRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.resetPwdMode, hcClient);
    }

    /**
     * 更新MFA设备显示名称
     *
     * 更新MFA设备显示名称。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMfaDeviceForUserRequest 请求对象
     * @return CompletableFuture<UpdateMfaDeviceForUserResponse>
     */
    public CompletableFuture<UpdateMfaDeviceForUserResponse> updateMfaDeviceForUserAsync(
        UpdateMfaDeviceForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.updateMfaDeviceForUser);
    }

    /**
     * 更新MFA设备显示名称
     *
     * 更新MFA设备显示名称。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMfaDeviceForUserRequest 请求对象
     * @return AsyncInvoker<UpdateMfaDeviceForUserRequest, UpdateMfaDeviceForUserResponse>
     */
    public AsyncInvoker<UpdateMfaDeviceForUserRequest, UpdateMfaDeviceForUserResponse> updateMfaDeviceForUserAsyncInvoker(
        UpdateMfaDeviceForUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.updateMfaDeviceForUser, hcClient);
    }

    /**
     * 更新用户
     *
     * 根据用户ID，更新对应IAM身份中心用户的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.updateUser);
    }

    /**
     * 更新用户
     *
     * 根据用户ID，更新对应IAM身份中心用户的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.updateUser, hcClient);
    }

    /**
     * 验证用户邮箱
     *
     * 验证用户邮箱。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyEmailRequest 请求对象
     * @return CompletableFuture<VerifyEmailResponse>
     */
    public CompletableFuture<VerifyEmailResponse> verifyEmailAsync(VerifyEmailRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.verifyEmail);
    }

    /**
     * 验证用户邮箱
     *
     * 验证用户邮箱。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyEmailRequest 请求对象
     * @return AsyncInvoker<VerifyEmailRequest, VerifyEmailResponse>
     */
    public AsyncInvoker<VerifyEmailRequest, VerifyEmailResponse> verifyEmailAsyncInvoker(VerifyEmailRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.verifyEmail, hcClient);
    }

}
