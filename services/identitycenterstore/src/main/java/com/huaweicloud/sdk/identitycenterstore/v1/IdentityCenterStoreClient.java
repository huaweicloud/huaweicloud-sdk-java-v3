package com.huaweicloud.sdk.identitycenterstore.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class IdentityCenterStoreClient {

    protected HcClient hcClient;

    public IdentityCenterStoreClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterStoreClient> newBuilder() {
        ClientBuilder<IdentityCenterStoreClient> clientBuilder = new ClientBuilder<>(IdentityCenterStoreClient::new);
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
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.createGroup);
    }

    /**
     * 创建用户组
     *
     * 在指定的身份源中创建一个IAM身份中心用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return SyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public SyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupInvoker(CreateGroupRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.createGroup, hcClient);
    }

    /**
     * 删除用户组
     *
     * 根据用户组ID，删除对应的IAM身份中心用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteGroup);
    }

    /**
     * 删除用户组
     *
     * 根据用户组ID，删除对应的IAM身份中心用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public SyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupInvoker(DeleteGroupRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteGroup, hcClient);
    }

    /**
     * 查询用户组详情
     *
     * 根据用户组ID，查询IAM身份中心用户组的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupRequest 请求对象
     * @return DescribeGroupResponse
     */
    public DescribeGroupResponse describeGroup(DescribeGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.describeGroup);
    }

    /**
     * 查询用户组详情
     *
     * 根据用户组ID，查询IAM身份中心用户组的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupRequest 请求对象
     * @return SyncInvoker<DescribeGroupRequest, DescribeGroupResponse>
     */
    public SyncInvoker<DescribeGroupRequest, DescribeGroupResponse> describeGroupInvoker(DescribeGroupRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.describeGroup, hcClient);
    }

    /**
     * 批量查询指定用户组详情
     *
     * 批量查询指定用户组详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupsRequest 请求对象
     * @return DescribeGroupsResponse
     */
    public DescribeGroupsResponse describeGroups(DescribeGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.describeGroups);
    }

    /**
     * 批量查询指定用户组详情
     *
     * 批量查询指定用户组详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupsRequest 请求对象
     * @return SyncInvoker<DescribeGroupsRequest, DescribeGroupsResponse>
     */
    public SyncInvoker<DescribeGroupsRequest, DescribeGroupsResponse> describeGroupsInvoker(
        DescribeGroupsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.describeGroups, hcClient);
    }

    /**
     * 查询用户组ID
     *
     * 根据显示名或外部身份源ID，以精确匹配的方式查询用户组ID。显示名和外部身份源ID两种查询方式二选一，不支持同时传入。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupIdRequest 请求对象
     * @return GetGroupIdResponse
     */
    public GetGroupIdResponse getGroupId(GetGroupIdRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.getGroupId);
    }

    /**
     * 查询用户组ID
     *
     * 根据显示名或外部身份源ID，以精确匹配的方式查询用户组ID。显示名和外部身份源ID两种查询方式二选一，不支持同时传入。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupIdRequest 请求对象
     * @return SyncInvoker<GetGroupIdRequest, GetGroupIdResponse>
     */
    public SyncInvoker<GetGroupIdRequest, GetGroupIdResponse> getGroupIdInvoker(GetGroupIdRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.getGroupId, hcClient);
    }

    /**
     * 列出用户组
     *
     * 查询指定身份源下的IAM身份中心用户组列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listGroups);
    }

    /**
     * 列出用户组
     *
     * 查询指定身份源下的IAM身份中心用户组列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return SyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public SyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsInvoker(ListGroupsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listGroups, hcClient);
    }

    /**
     * 更新用户组
     *
     * 根据用户组ID，更新对应IAM身份中心用户组的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupRequest 请求对象
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.updateGroup);
    }

    /**
     * 更新用户组
     *
     * 根据用户组ID，更新对应IAM身份中心用户组的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupRequest 请求对象
     * @return SyncInvoker<UpdateGroupRequest, UpdateGroupResponse>
     */
    public SyncInvoker<UpdateGroupRequest, UpdateGroupResponse> updateGroupInvoker(UpdateGroupRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.updateGroup, hcClient);
    }

    /**
     * 绑定用户和组
     *
     * 将用户添加到用户组中，用户和用户组必须在同一身份源下。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMembershipRequest 请求对象
     * @return CreateGroupMembershipResponse
     */
    public CreateGroupMembershipResponse createGroupMembership(CreateGroupMembershipRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.createGroupMembership);
    }

    /**
     * 绑定用户和组
     *
     * 将用户添加到用户组中，用户和用户组必须在同一身份源下。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMembershipRequest 请求对象
     * @return SyncInvoker<CreateGroupMembershipRequest, CreateGroupMembershipResponse>
     */
    public SyncInvoker<CreateGroupMembershipRequest, CreateGroupMembershipResponse> createGroupMembershipInvoker(
        CreateGroupMembershipRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.createGroupMembership, hcClient);
    }

    /**
     * 解绑用户和组
     *
     * 根据关联关系ID解绑用户和用户组，也就是将用户移出用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMembershipRequest 请求对象
     * @return DeleteGroupMembershipResponse
     */
    public DeleteGroupMembershipResponse deleteGroupMembership(DeleteGroupMembershipRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteGroupMembership);
    }

    /**
     * 解绑用户和组
     *
     * 根据关联关系ID解绑用户和用户组，也就是将用户移出用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMembershipRequest 请求对象
     * @return SyncInvoker<DeleteGroupMembershipRequest, DeleteGroupMembershipResponse>
     */
    public SyncInvoker<DeleteGroupMembershipRequest, DeleteGroupMembershipResponse> deleteGroupMembershipInvoker(
        DeleteGroupMembershipRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteGroupMembership, hcClient);
    }

    /**
     * 查询绑定关系详情
     *
     * 根据关联关系ID，查询此关联关系的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupMembershipRequest 请求对象
     * @return DescribeGroupMembershipResponse
     */
    public DescribeGroupMembershipResponse describeGroupMembership(DescribeGroupMembershipRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.describeGroupMembership);
    }

    /**
     * 查询绑定关系详情
     *
     * 根据关联关系ID，查询此关联关系的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeGroupMembershipRequest 请求对象
     * @return SyncInvoker<DescribeGroupMembershipRequest, DescribeGroupMembershipResponse>
     */
    public SyncInvoker<DescribeGroupMembershipRequest, DescribeGroupMembershipResponse> describeGroupMembershipInvoker(
        DescribeGroupMembershipRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.describeGroupMembership, hcClient);
    }

    /**
     * 查询绑定关系ID
     *
     * 根据用户ID和用户组ID，查询对应的关联关系ID。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupMembershipIdRequest 请求对象
     * @return GetGroupMembershipIdResponse
     */
    public GetGroupMembershipIdResponse getGroupMembershipId(GetGroupMembershipIdRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.getGroupMembershipId);
    }

    /**
     * 查询绑定关系ID
     *
     * 根据用户ID和用户组ID，查询对应的关联关系ID。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupMembershipIdRequest 请求对象
     * @return SyncInvoker<GetGroupMembershipIdRequest, GetGroupMembershipIdResponse>
     */
    public SyncInvoker<GetGroupMembershipIdRequest, GetGroupMembershipIdResponse> getGroupMembershipIdInvoker(
        GetGroupMembershipIdRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.getGroupMembershipId, hcClient);
    }

    /**
     * 查询用户是否是用户组成员
     *
     * 根据用户ID和用户组ID列表，查询用户是否为用户组的成员。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request IsMemberInGroupsRequest 请求对象
     * @return IsMemberInGroupsResponse
     */
    public IsMemberInGroupsResponse isMemberInGroups(IsMemberInGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.isMemberInGroups);
    }

    /**
     * 查询用户是否是用户组成员
     *
     * 根据用户ID和用户组ID列表，查询用户是否为用户组的成员。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request IsMemberInGroupsRequest 请求对象
     * @return SyncInvoker<IsMemberInGroupsRequest, IsMemberInGroupsResponse>
     */
    public SyncInvoker<IsMemberInGroupsRequest, IsMemberInGroupsResponse> isMemberInGroupsInvoker(
        IsMemberInGroupsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.isMemberInGroups, hcClient);
    }

    /**
     * 列出组中的用户
     *
     * 根据用户组ID，列出用户组中的用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembershipsRequest 请求对象
     * @return ListGroupMembershipsResponse
     */
    public ListGroupMembershipsResponse listGroupMemberships(ListGroupMembershipsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listGroupMemberships);
    }

    /**
     * 列出组中的用户
     *
     * 根据用户组ID，列出用户组中的用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembershipsRequest 请求对象
     * @return SyncInvoker<ListGroupMembershipsRequest, ListGroupMembershipsResponse>
     */
    public SyncInvoker<ListGroupMembershipsRequest, ListGroupMembershipsResponse> listGroupMembershipsInvoker(
        ListGroupMembershipsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listGroupMemberships, hcClient);
    }

    /**
     * 列出用户加入的组
     *
     * 根据用户ID，列出用户加入的用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembershipsForMemberRequest 请求对象
     * @return ListGroupMembershipsForMemberResponse
     */
    public ListGroupMembershipsForMemberResponse listGroupMembershipsForMember(
        ListGroupMembershipsForMemberRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listGroupMembershipsForMember);
    }

    /**
     * 列出用户加入的组
     *
     * 根据用户ID，列出用户加入的用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembershipsForMemberRequest 请求对象
     * @return SyncInvoker<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResponse>
     */
    public SyncInvoker<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResponse> listGroupMembershipsForMemberInvoker(
        ListGroupMembershipsForMemberRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listGroupMembershipsForMember, hcClient);
    }

    /**
     * 创建外部身份提供商配置
     *
     * 创建外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return CreateExternalIdPConfigurationForDirectoryResponse
     */
    public CreateExternalIdPConfigurationForDirectoryResponse createExternalIdPConfigurationForDirectory(
        CreateExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.createExternalIdPConfigurationForDirectory);
    }

    /**
     * 创建外部身份提供商配置
     *
     * 创建外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return SyncInvoker<CreateExternalIdPConfigurationForDirectoryRequest, CreateExternalIdPConfigurationForDirectoryResponse>
     */
    public SyncInvoker<CreateExternalIdPConfigurationForDirectoryRequest, CreateExternalIdPConfigurationForDirectoryResponse> createExternalIdPConfigurationForDirectoryInvoker(
        CreateExternalIdPConfigurationForDirectoryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.createExternalIdPConfigurationForDirectory, hcClient);
    }

    /**
     * 删除外部身份提供商证书
     *
     * 删除外部身份提供商证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalIdPCertificateRequest 请求对象
     * @return DeleteExternalIdPCertificateResponse
     */
    public DeleteExternalIdPCertificateResponse deleteExternalIdPCertificate(
        DeleteExternalIdPCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteExternalIdPCertificate);
    }

    /**
     * 删除外部身份提供商证书
     *
     * 删除外部身份提供商证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalIdPCertificateRequest 请求对象
     * @return SyncInvoker<DeleteExternalIdPCertificateRequest, DeleteExternalIdPCertificateResponse>
     */
    public SyncInvoker<DeleteExternalIdPCertificateRequest, DeleteExternalIdPCertificateResponse> deleteExternalIdPCertificateInvoker(
        DeleteExternalIdPCertificateRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteExternalIdPCertificate, hcClient);
    }

    /**
     * 删除外部身份提供商配置
     *
     * 删除外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return DeleteExternalIdPConfigurationForDirectoryResponse
     */
    public DeleteExternalIdPConfigurationForDirectoryResponse deleteExternalIdPConfigurationForDirectory(
        DeleteExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteExternalIdPConfigurationForDirectory);
    }

    /**
     * 删除外部身份提供商配置
     *
     * 删除外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return SyncInvoker<DeleteExternalIdPConfigurationForDirectoryRequest, DeleteExternalIdPConfigurationForDirectoryResponse>
     */
    public SyncInvoker<DeleteExternalIdPConfigurationForDirectoryRequest, DeleteExternalIdPConfigurationForDirectoryResponse> deleteExternalIdPConfigurationForDirectoryInvoker(
        DeleteExternalIdPConfigurationForDirectoryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteExternalIdPConfigurationForDirectory, hcClient);
    }

    /**
     * 停用外部身份提供商
     *
     * 停用外部身份提供商。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return DisableExternalIdPConfigurationForDirectoryResponse
     */
    public DisableExternalIdPConfigurationForDirectoryResponse disableExternalIdPConfigurationForDirectory(
        DisableExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.disableExternalIdPConfigurationForDirectory);
    }

    /**
     * 停用外部身份提供商
     *
     * 停用外部身份提供商。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return SyncInvoker<DisableExternalIdPConfigurationForDirectoryRequest, DisableExternalIdPConfigurationForDirectoryResponse>
     */
    public SyncInvoker<DisableExternalIdPConfigurationForDirectoryRequest, DisableExternalIdPConfigurationForDirectoryResponse> disableExternalIdPConfigurationForDirectoryInvoker(
        DisableExternalIdPConfigurationForDirectoryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.disableExternalIdPConfigurationForDirectory,
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
     * @return EnableExternalIdPConfigurationForDirectoryResponse
     */
    public EnableExternalIdPConfigurationForDirectoryResponse enableExternalIdPConfigurationForDirectory(
        EnableExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.enableExternalIdPConfigurationForDirectory);
    }

    /**
     * 启用外部身份提供商
     *
     * 启用外部身份提供商。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return SyncInvoker<EnableExternalIdPConfigurationForDirectoryRequest, EnableExternalIdPConfigurationForDirectoryResponse>
     */
    public SyncInvoker<EnableExternalIdPConfigurationForDirectoryRequest, EnableExternalIdPConfigurationForDirectoryResponse> enableExternalIdPConfigurationForDirectoryInvoker(
        EnableExternalIdPConfigurationForDirectoryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.enableExternalIdPConfigurationForDirectory, hcClient);
    }

    /**
     * 导入外部身份提供商证书
     *
     * 导入外部身份提供商证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportExternalIdPCertificateRequest 请求对象
     * @return ImportExternalIdPCertificateResponse
     */
    public ImportExternalIdPCertificateResponse importExternalIdPCertificate(
        ImportExternalIdPCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.importExternalIdPCertificate);
    }

    /**
     * 导入外部身份提供商证书
     *
     * 导入外部身份提供商证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportExternalIdPCertificateRequest 请求对象
     * @return SyncInvoker<ImportExternalIdPCertificateRequest, ImportExternalIdPCertificateResponse>
     */
    public SyncInvoker<ImportExternalIdPCertificateRequest, ImportExternalIdPCertificateResponse> importExternalIdPCertificateInvoker(
        ImportExternalIdPCertificateRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.importExternalIdPCertificate, hcClient);
    }

    /**
     * 列出外部身份提供商证书
     *
     * 查询外部身份提供商证书列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalIdPCertificatesRequest 请求对象
     * @return ListExternalIdPCertificatesResponse
     */
    public ListExternalIdPCertificatesResponse listExternalIdPCertificates(ListExternalIdPCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listExternalIdPCertificates);
    }

    /**
     * 列出外部身份提供商证书
     *
     * 查询外部身份提供商证书列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalIdPCertificatesRequest 请求对象
     * @return SyncInvoker<ListExternalIdPCertificatesRequest, ListExternalIdPCertificatesResponse>
     */
    public SyncInvoker<ListExternalIdPCertificatesRequest, ListExternalIdPCertificatesResponse> listExternalIdPCertificatesInvoker(
        ListExternalIdPCertificatesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listExternalIdPCertificates, hcClient);
    }

    /**
     * 查询外部身份提供商配置
     *
     * 查询外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalIdPConfigurationsForDirectoryRequest 请求对象
     * @return ListExternalIdPConfigurationsForDirectoryResponse
     */
    public ListExternalIdPConfigurationsForDirectoryResponse listExternalIdPConfigurationsForDirectory(
        ListExternalIdPConfigurationsForDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listExternalIdPConfigurationsForDirectory);
    }

    /**
     * 查询外部身份提供商配置
     *
     * 查询外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalIdPConfigurationsForDirectoryRequest 请求对象
     * @return SyncInvoker<ListExternalIdPConfigurationsForDirectoryRequest, ListExternalIdPConfigurationsForDirectoryResponse>
     */
    public SyncInvoker<ListExternalIdPConfigurationsForDirectoryRequest, ListExternalIdPConfigurationsForDirectoryResponse> listExternalIdPConfigurationsForDirectoryInvoker(
        ListExternalIdPConfigurationsForDirectoryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listExternalIdPConfigurationsForDirectory, hcClient);
    }

    /**
     * 更新外部身份提供商配置
     *
     * 更新外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return UpdateExternalIdPConfigurationForDirectoryResponse
     */
    public UpdateExternalIdPConfigurationForDirectoryResponse updateExternalIdPConfigurationForDirectory(
        UpdateExternalIdPConfigurationForDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.updateExternalIdPConfigurationForDirectory);
    }

    /**
     * 更新外部身份提供商配置
     *
     * 更新外部身份提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExternalIdPConfigurationForDirectoryRequest 请求对象
     * @return SyncInvoker<UpdateExternalIdPConfigurationForDirectoryRequest, UpdateExternalIdPConfigurationForDirectoryResponse>
     */
    public SyncInvoker<UpdateExternalIdPConfigurationForDirectoryRequest, UpdateExternalIdPConfigurationForDirectoryResponse> updateExternalIdPConfigurationForDirectoryInvoker(
        UpdateExternalIdPConfigurationForDirectoryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.updateExternalIdPConfigurationForDirectory, hcClient);
    }

    /**
     * 查询自定义密码策略
     *
     * 查询自定义密码策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePasswordPolicyRequest 请求对象
     * @return DescribePasswordPolicyResponse
     */
    public DescribePasswordPolicyResponse describePasswordPolicy(DescribePasswordPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.describePasswordPolicy);
    }

    /**
     * 查询自定义密码策略
     *
     * 查询自定义密码策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePasswordPolicyRequest 请求对象
     * @return SyncInvoker<DescribePasswordPolicyRequest, DescribePasswordPolicyResponse>
     */
    public SyncInvoker<DescribePasswordPolicyRequest, DescribePasswordPolicyResponse> describePasswordPolicyInvoker(
        DescribePasswordPolicyRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.describePasswordPolicy, hcClient);
    }

    /**
     * 更新自定义密码策略
     *
     * 更新自定义密码策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordPolicyRequest 请求对象
     * @return UpdatePasswordPolicyResponse
     */
    public UpdatePasswordPolicyResponse updatePasswordPolicy(UpdatePasswordPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.updatePasswordPolicy);
    }

    /**
     * 更新自定义密码策略
     *
     * 更新自定义密码策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordPolicyRequest 请求对象
     * @return SyncInvoker<UpdatePasswordPolicyRequest, UpdatePasswordPolicyResponse>
     */
    public SyncInvoker<UpdatePasswordPolicyRequest, UpdatePasswordPolicyResponse> updatePasswordPolicyInvoker(
        UpdatePasswordPolicyRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.updatePasswordPolicy, hcClient);
    }

    /**
     * 创建服务提供商证书
     *
     * 创建服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpCertificateRequest 请求对象
     * @return CreateSpCertificateResponse
     */
    public CreateSpCertificateResponse createSpCertificate(CreateSpCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.createSpCertificate);
    }

    /**
     * 创建服务提供商证书
     *
     * 创建服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpCertificateRequest 请求对象
     * @return SyncInvoker<CreateSpCertificateRequest, CreateSpCertificateResponse>
     */
    public SyncInvoker<CreateSpCertificateRequest, CreateSpCertificateResponse> createSpCertificateInvoker(
        CreateSpCertificateRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.createSpCertificate, hcClient);
    }

    /**
     * 删除服务提供商证书
     *
     * 删除服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSpCertificateRequest 请求对象
     * @return DeleteSpCertificateResponse
     */
    public DeleteSpCertificateResponse deleteSpCertificate(DeleteSpCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteSpCertificate);
    }

    /**
     * 删除服务提供商证书
     *
     * 删除服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSpCertificateRequest 请求对象
     * @return SyncInvoker<DeleteSpCertificateRequest, DeleteSpCertificateResponse>
     */
    public SyncInvoker<DeleteSpCertificateRequest, DeleteSpCertificateResponse> deleteSpCertificateInvoker(
        DeleteSpCertificateRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteSpCertificate, hcClient);
    }

    /**
     * 查询服务提供商配置
     *
     * 查询服务提供商配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetSpConfigurationForDirectoryRequest 请求对象
     * @return GetSpConfigurationForDirectoryResponse
     */
    public GetSpConfigurationForDirectoryResponse getSpConfigurationForDirectory(
        GetSpConfigurationForDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.getSpConfigurationForDirectory);
    }

    /**
     * 查询服务提供商配置
     *
     * 查询服务提供商配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetSpConfigurationForDirectoryRequest 请求对象
     * @return SyncInvoker<GetSpConfigurationForDirectoryRequest, GetSpConfigurationForDirectoryResponse>
     */
    public SyncInvoker<GetSpConfigurationForDirectoryRequest, GetSpConfigurationForDirectoryResponse> getSpConfigurationForDirectoryInvoker(
        GetSpConfigurationForDirectoryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.getSpConfigurationForDirectory, hcClient);
    }

    /**
     * 列出服务提供商证书
     *
     * 查询服务提供商SAML协议签名证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpCertificatesRequest 请求对象
     * @return ListSpCertificatesResponse
     */
    public ListSpCertificatesResponse listSpCertificates(ListSpCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listSpCertificates);
    }

    /**
     * 列出服务提供商证书
     *
     * 查询服务提供商SAML协议签名证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpCertificatesRequest 请求对象
     * @return SyncInvoker<ListSpCertificatesRequest, ListSpCertificatesResponse>
     */
    public SyncInvoker<ListSpCertificatesRequest, ListSpCertificatesResponse> listSpCertificatesInvoker(
        ListSpCertificatesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listSpCertificates, hcClient);
    }

    /**
     * 激活服务提供商证书
     *
     * 激活服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSpActiveCertificateRequest 请求对象
     * @return UpdateSpActiveCertificateResponse
     */
    public UpdateSpActiveCertificateResponse updateSpActiveCertificate(UpdateSpActiveCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.updateSpActiveCertificate);
    }

    /**
     * 激活服务提供商证书
     *
     * 激活服务提供商SAML协议签名证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSpActiveCertificateRequest 请求对象
     * @return SyncInvoker<UpdateSpActiveCertificateRequest, UpdateSpActiveCertificateResponse>
     */
    public SyncInvoker<UpdateSpActiveCertificateRequest, UpdateSpActiveCertificateResponse> updateSpActiveCertificateInvoker(
        UpdateSpActiveCertificateRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.updateSpActiveCertificate, hcClient);
    }

    /**
     * 查询身份源配额信息
     *
     * 查询身份源配额信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetIdentityStoreSummaryRequest 请求对象
     * @return GetIdentityStoreSummaryResponse
     */
    public GetIdentityStoreSummaryResponse getIdentityStoreSummary(GetIdentityStoreSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.getIdentityStoreSummary);
    }

    /**
     * 查询身份源配额信息
     *
     * 查询身份源配额信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetIdentityStoreSummaryRequest 请求对象
     * @return SyncInvoker<GetIdentityStoreSummaryRequest, GetIdentityStoreSummaryResponse>
     */
    public SyncInvoker<GetIdentityStoreSummaryRequest, GetIdentityStoreSummaryResponse> getIdentityStoreSummaryInvoker(
        GetIdentityStoreSummaryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.getIdentityStoreSummary, hcClient);
    }

    /**
     * 创建访问令牌
     *
     * 创建访问令牌。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBearerTokenRequest 请求对象
     * @return CreateBearerTokenResponse
     */
    public CreateBearerTokenResponse createBearerToken(CreateBearerTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.createBearerToken);
    }

    /**
     * 创建访问令牌
     *
     * 创建访问令牌。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBearerTokenRequest 请求对象
     * @return SyncInvoker<CreateBearerTokenRequest, CreateBearerTokenResponse>
     */
    public SyncInvoker<CreateBearerTokenRequest, CreateBearerTokenResponse> createBearerTokenInvoker(
        CreateBearerTokenRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.createBearerToken, hcClient);
    }

    /**
     * 启用自动预置
     *
     * 启用自动预置，开启SCIM协议自动同步功能。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProvisioningTenantRequest 请求对象
     * @return CreateProvisioningTenantResponse
     */
    public CreateProvisioningTenantResponse createProvisioningTenant(CreateProvisioningTenantRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.createProvisioningTenant);
    }

    /**
     * 启用自动预置
     *
     * 启用自动预置，开启SCIM协议自动同步功能。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProvisioningTenantRequest 请求对象
     * @return SyncInvoker<CreateProvisioningTenantRequest, CreateProvisioningTenantResponse>
     */
    public SyncInvoker<CreateProvisioningTenantRequest, CreateProvisioningTenantResponse> createProvisioningTenantInvoker(
        CreateProvisioningTenantRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.createProvisioningTenant, hcClient);
    }

    /**
     * 删除访问令牌
     *
     * 删除访问令牌。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBearerTokenRequest 请求对象
     * @return DeleteBearerTokenResponse
     */
    public DeleteBearerTokenResponse deleteBearerToken(DeleteBearerTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteBearerToken);
    }

    /**
     * 删除访问令牌
     *
     * 删除访问令牌。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBearerTokenRequest 请求对象
     * @return SyncInvoker<DeleteBearerTokenRequest, DeleteBearerTokenResponse>
     */
    public SyncInvoker<DeleteBearerTokenRequest, DeleteBearerTokenResponse> deleteBearerTokenInvoker(
        DeleteBearerTokenRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteBearerToken, hcClient);
    }

    /**
     * 删除自动预置
     *
     * 删除自动预置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProvisioningTenantRequest 请求对象
     * @return DeleteProvisioningTenantResponse
     */
    public DeleteProvisioningTenantResponse deleteProvisioningTenant(DeleteProvisioningTenantRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteProvisioningTenant);
    }

    /**
     * 删除自动预置
     *
     * 删除自动预置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProvisioningTenantRequest 请求对象
     * @return SyncInvoker<DeleteProvisioningTenantRequest, DeleteProvisioningTenantResponse>
     */
    public SyncInvoker<DeleteProvisioningTenantRequest, DeleteProvisioningTenantResponse> deleteProvisioningTenantInvoker(
        DeleteProvisioningTenantRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteProvisioningTenant, hcClient);
    }

    /**
     * 列出访问令牌
     *
     * 查询访问令牌列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBearerTokensRequest 请求对象
     * @return ListBearerTokensResponse
     */
    public ListBearerTokensResponse listBearerTokens(ListBearerTokensRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listBearerTokens);
    }

    /**
     * 列出访问令牌
     *
     * 查询访问令牌列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBearerTokensRequest 请求对象
     * @return SyncInvoker<ListBearerTokensRequest, ListBearerTokensResponse>
     */
    public SyncInvoker<ListBearerTokensRequest, ListBearerTokensResponse> listBearerTokensInvoker(
        ListBearerTokensRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listBearerTokens, hcClient);
    }

    /**
     * 查询自动预置信息
     *
     * 查询是否开启自动预置，返回具体SCIM自动预配配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvisioningTenantsRequest 请求对象
     * @return ListProvisioningTenantsResponse
     */
    public ListProvisioningTenantsResponse listProvisioningTenants(ListProvisioningTenantsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listProvisioningTenants);
    }

    /**
     * 查询自动预置信息
     *
     * 查询是否开启自动预置，返回具体SCIM自动预配配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvisioningTenantsRequest 请求对象
     * @return SyncInvoker<ListProvisioningTenantsRequest, ListProvisioningTenantsResponse>
     */
    public SyncInvoker<ListProvisioningTenantsRequest, ListProvisioningTenantsResponse> listProvisioningTenantsInvoker(
        ListProvisioningTenantsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listProvisioningTenants, hcClient);
    }

    /**
     * 批量删除用户登录会话
     *
     * 批量删除用户登录会话。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSessionsRequest 请求对象
     * @return BatchDeleteSessionsResponse
     */
    public BatchDeleteSessionsResponse batchDeleteSessions(BatchDeleteSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.batchDeleteSessions);
    }

    /**
     * 批量删除用户登录会话
     *
     * 批量删除用户登录会话。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSessionsRequest 请求对象
     * @return SyncInvoker<BatchDeleteSessionsRequest, BatchDeleteSessionsResponse>
     */
    public SyncInvoker<BatchDeleteSessionsRequest, BatchDeleteSessionsResponse> batchDeleteSessionsInvoker(
        BatchDeleteSessionsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.batchDeleteSessions, hcClient);
    }

    /**
     * 列出用户MFA设备
     *
     * 查询指定用户的MFA设备列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListMfaDevicesForUserRequest 请求对象
     * @return BatchListMfaDevicesForUserResponse
     */
    public BatchListMfaDevicesForUserResponse batchListMfaDevicesForUser(BatchListMfaDevicesForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.batchListMfaDevicesForUser);
    }

    /**
     * 列出用户MFA设备
     *
     * 查询指定用户的MFA设备列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListMfaDevicesForUserRequest 请求对象
     * @return SyncInvoker<BatchListMfaDevicesForUserRequest, BatchListMfaDevicesForUserResponse>
     */
    public SyncInvoker<BatchListMfaDevicesForUserRequest, BatchListMfaDevicesForUserResponse> batchListMfaDevicesForUserInvoker(
        BatchListMfaDevicesForUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.batchListMfaDevicesForUser, hcClient);
    }

    /**
     * 创建用户
     *
     * 在指定的身份源中创建一个IAM身份中心用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 在指定的身份源中创建一个IAM身份中心用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.createUser, hcClient);
    }

    /**
     * 删除用户MFA设备
     *
     * 删除用户绑定的MFA设备。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMfaDeviceForUserRequest 请求对象
     * @return DeleteMfaDeviceForUserResponse
     */
    public DeleteMfaDeviceForUserResponse deleteMfaDeviceForUser(DeleteMfaDeviceForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteMfaDeviceForUser);
    }

    /**
     * 删除用户MFA设备
     *
     * 删除用户绑定的MFA设备。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMfaDeviceForUserRequest 请求对象
     * @return SyncInvoker<DeleteMfaDeviceForUserRequest, DeleteMfaDeviceForUserResponse>
     */
    public SyncInvoker<DeleteMfaDeviceForUserRequest, DeleteMfaDeviceForUserResponse> deleteMfaDeviceForUserInvoker(
        DeleteMfaDeviceForUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteMfaDeviceForUser, hcClient);
    }

    /**
     * 删除用户
     *
     * 根据用户ID，删除对应的IAM身份中心用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 根据用户ID，删除对应的IAM身份中心用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.deleteUser, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 根据用户ID，查询对应IAM身份中心用户的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeUserRequest 请求对象
     * @return DescribeUserResponse
     */
    public DescribeUserResponse describeUser(DescribeUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.describeUser);
    }

    /**
     * 查询用户详情
     *
     * 根据用户ID，查询对应IAM身份中心用户的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeUserRequest 请求对象
     * @return SyncInvoker<DescribeUserRequest, DescribeUserResponse>
     */
    public SyncInvoker<DescribeUserRequest, DescribeUserResponse> describeUserInvoker(DescribeUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.describeUser, hcClient);
    }

    /**
     * 批量查询指定用户详情
     *
     * 批量查询指定用户详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeUsersRequest 请求对象
     * @return DescribeUsersResponse
     */
    public DescribeUsersResponse describeUsers(DescribeUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.describeUsers);
    }

    /**
     * 批量查询指定用户详情
     *
     * 批量查询指定用户详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeUsersRequest 请求对象
     * @return SyncInvoker<DescribeUsersRequest, DescribeUsersResponse>
     */
    public SyncInvoker<DescribeUsersRequest, DescribeUsersResponse> describeUsersInvoker(DescribeUsersRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.describeUsers, hcClient);
    }

    /**
     * 禁用用户
     *
     * 禁用IAM身份中心的用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableUserRequest 请求对象
     * @return DisableUserResponse
     */
    public DisableUserResponse disableUser(DisableUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.disableUser);
    }

    /**
     * 禁用用户
     *
     * 禁用IAM身份中心的用户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableUserRequest 请求对象
     * @return SyncInvoker<DisableUserRequest, DisableUserResponse>
     */
    public SyncInvoker<DisableUserRequest, DisableUserResponse> disableUserInvoker(DisableUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.disableUser, hcClient);
    }

    /**
     * 启用用户
     *
     * 启用IAM身份中心的用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableUserRequest 请求对象
     * @return EnableUserResponse
     */
    public EnableUserResponse enableUser(EnableUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.enableUser);
    }

    /**
     * 启用用户
     *
     * 启用IAM身份中心的用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableUserRequest 请求对象
     * @return SyncInvoker<EnableUserRequest, EnableUserResponse>
     */
    public SyncInvoker<EnableUserRequest, EnableUserResponse> enableUserInvoker(EnableUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.enableUser, hcClient);
    }

    /**
     * 查询用户ID
     *
     * 根据用户名或外部身份源ID，以精确匹配的方式查询用户ID。用户名和外部身份源ID两种查询方式二选一，不支持同时传入。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetUserIdRequest 请求对象
     * @return GetUserIdResponse
     */
    public GetUserIdResponse getUserId(GetUserIdRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.getUserId);
    }

    /**
     * 查询用户ID
     *
     * 根据用户名或外部身份源ID，以精确匹配的方式查询用户ID。用户名和外部身份源ID两种查询方式二选一，不支持同时传入。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetUserIdRequest 请求对象
     * @return SyncInvoker<GetUserIdRequest, GetUserIdResponse>
     */
    public SyncInvoker<GetUserIdRequest, GetUserIdResponse> getUserIdInvoker(GetUserIdRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.getUserId, hcClient);
    }

    /**
     * 列出用户登录会话
     *
     * 查询指定用户的登录会话信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return ListSessionsResponse
     */
    public ListSessionsResponse listSessions(ListSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listSessions);
    }

    /**
     * 列出用户登录会话
     *
     * 查询指定用户的登录会话信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return SyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public SyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsInvoker(ListSessionsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listSessions, hcClient);
    }

    /**
     * 列出用户
     *
     * 查询指定身份源下的IAM身份中心用户列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listUsers);
    }

    /**
     * 列出用户
     *
     * 查询指定身份源下的IAM身份中心用户列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.listUsers, hcClient);
    }

    /**
     * 注册MFA设备
     *
     * 为用户发起注册MFA设备，返回一个MFA注册地址。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterMfaDeviceForUserRequest 请求对象
     * @return RegisterMfaDeviceForUserResponse
     */
    public RegisterMfaDeviceForUserResponse registerMfaDeviceForUser(RegisterMfaDeviceForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.registerMfaDeviceForUser);
    }

    /**
     * 注册MFA设备
     *
     * 为用户发起注册MFA设备，返回一个MFA注册地址。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterMfaDeviceForUserRequest 请求对象
     * @return SyncInvoker<RegisterMfaDeviceForUserRequest, RegisterMfaDeviceForUserResponse>
     */
    public SyncInvoker<RegisterMfaDeviceForUserRequest, RegisterMfaDeviceForUserResponse> registerMfaDeviceForUserInvoker(
        RegisterMfaDeviceForUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.registerMfaDeviceForUser, hcClient);
    }

    /**
     * 通过电子邮件发送密码重置链接或生成用户的一次性密码
     *
     * 通过电子邮件发送密码重置链接或生成用户的一次性密码。。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdModeRequest 请求对象
     * @return ResetPwdModeResponse
     */
    public ResetPwdModeResponse resetPwdMode(ResetPwdModeRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.resetPwdMode);
    }

    /**
     * 通过电子邮件发送密码重置链接或生成用户的一次性密码
     *
     * 通过电子邮件发送密码重置链接或生成用户的一次性密码。。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdModeRequest 请求对象
     * @return SyncInvoker<ResetPwdModeRequest, ResetPwdModeResponse>
     */
    public SyncInvoker<ResetPwdModeRequest, ResetPwdModeResponse> resetPwdModeInvoker(ResetPwdModeRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.resetPwdMode, hcClient);
    }

    /**
     * 更新MFA设备显示名称
     *
     * 更新MFA设备显示名称。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMfaDeviceForUserRequest 请求对象
     * @return UpdateMfaDeviceForUserResponse
     */
    public UpdateMfaDeviceForUserResponse updateMfaDeviceForUser(UpdateMfaDeviceForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.updateMfaDeviceForUser);
    }

    /**
     * 更新MFA设备显示名称
     *
     * 更新MFA设备显示名称。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMfaDeviceForUserRequest 请求对象
     * @return SyncInvoker<UpdateMfaDeviceForUserRequest, UpdateMfaDeviceForUserResponse>
     */
    public SyncInvoker<UpdateMfaDeviceForUserRequest, UpdateMfaDeviceForUserResponse> updateMfaDeviceForUserInvoker(
        UpdateMfaDeviceForUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.updateMfaDeviceForUser, hcClient);
    }

    /**
     * 更新用户
     *
     * 根据用户ID，更新对应IAM身份中心用户的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.updateUser);
    }

    /**
     * 更新用户
     *
     * 根据用户ID，更新对应IAM身份中心用户的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.updateUser, hcClient);
    }

    /**
     * 验证用户邮箱
     *
     * 验证用户邮箱。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyEmailRequest 请求对象
     * @return VerifyEmailResponse
     */
    public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.verifyEmail);
    }

    /**
     * 验证用户邮箱
     *
     * 验证用户邮箱。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyEmailRequest 请求对象
     * @return SyncInvoker<VerifyEmailRequest, VerifyEmailResponse>
     */
    public SyncInvoker<VerifyEmailRequest, VerifyEmailResponse> verifyEmailInvoker(VerifyEmailRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.verifyEmail, hcClient);
    }

}
