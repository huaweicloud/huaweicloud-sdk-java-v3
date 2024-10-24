package com.huaweicloud.sdk.identitycenterstore.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsForMemberRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsForMemberResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserResponse;

public class IdentityCenterStoreClient {

    protected HcClient hcClient;

    public IdentityCenterStoreClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterStoreClient> newBuilder() {
        ClientBuilder<IdentityCenterStoreClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterStoreClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 创建用户组
     *
     * 在指定的身份源中创建一个IAM身份中心用户组。
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
     * 在指定的身份源中创建一个IAM身份中心用户组。
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
     * 根据用户组ID，删除对应的IAM身份中心用户组。
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
     * 根据用户组ID，删除对应的IAM身份中心用户组。
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
     * 根据用户组ID，查询IAM身份中心用户组的详情信息。
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
     * 根据用户组ID，查询IAM身份中心用户组的详情信息。
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
     * 查询用户组ID
     *
     * 根据显示名或外部身份源ID，以精确匹配的方式查询用户组ID。显示名和外部身份源ID两种查询方式二选一，不支持同时传入。
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
     * 根据显示名或外部身份源ID，以精确匹配的方式查询用户组ID。显示名和外部身份源ID两种查询方式二选一，不支持同时传入。
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
     * 查询指定身份源下的IAM身份中心用户组列表。
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
     * 查询指定身份源下的IAM身份中心用户组列表。
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
     * 根据用户组ID，更新对应IAM身份中心用户组的属性。
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
     * 根据用户组ID，更新对应IAM身份中心用户组的属性。
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
     * 将用户添加到用户组中，用户和用户组必须在同一身份源下。
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
     * 将用户添加到用户组中，用户和用户组必须在同一身份源下。
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
     * 根据关联关系ID解绑用户和用户组，也就是将用户移出用户组。
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
     * 根据关联关系ID解绑用户和用户组，也就是将用户移出用户组。
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
     * 根据关联关系ID，查询此关联关系的详情信息。
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
     * 根据关联关系ID，查询此关联关系的详情信息。
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
     * 根据用户ID和用户组ID，查询对应的关联关系ID。
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
     * 根据用户ID和用户组ID，查询对应的关联关系ID。
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
     * 查询用户是否为用户组成员
     *
     * 根据用户ID和用户组ID列表，查询用户是否为用户组的成员。
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
     * 查询用户是否为用户组成员
     *
     * 根据用户ID和用户组ID列表，查询用户是否为用户组的成员。
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
     * 根据用户组ID，列出用户组中的用户。
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
     * 根据用户组ID，列出用户组中的用户。
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
     * 根据用户ID，列出用户加入的用户组。
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
     * 根据用户ID，列出用户加入的用户组。
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
     * 创建用户
     *
     * 在指定的身份源中创建一个IAM身份中心用户。
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
     * 在指定的身份源中创建一个IAM身份中心用户。
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
     * 删除用户
     *
     * 根据用户ID，删除对应的IAM身份中心用户。
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
     * 根据用户ID，删除对应的IAM身份中心用户。
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
     * 根据用户ID，查询对应IAM身份中心用户的详情信息。
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
     * 根据用户ID，查询对应IAM身份中心用户的详情信息。
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
     * 查询用户ID
     *
     * 根据用户名或外部身份源ID，以精确匹配的方式查询用户ID。用户名和外部身份源ID两种查询方式二选一，不支持同时传入。
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
     * 根据用户名或外部身份源ID，以精确匹配的方式查询用户ID。用户名和外部身份源ID两种查询方式二选一，不支持同时传入。
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
     * 列出用户
     *
     * 查询指定身份源下的IAM身份中心用户列表。
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
     * 查询指定身份源下的IAM身份中心用户列表。
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
     * 更新用户
     *
     * 根据用户ID，更新对应IAM身份中心用户的属性。
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
     * 根据用户ID，更新对应IAM身份中心用户的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterStoreMeta.updateUser, hcClient);
    }

}
