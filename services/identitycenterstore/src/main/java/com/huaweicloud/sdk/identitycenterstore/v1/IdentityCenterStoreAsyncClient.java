package com.huaweicloud.sdk.identitycenterstore.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 在指定的身份源中创建一个IAM身份中心用户组。
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
     * 在指定的身份源中创建一个IAM身份中心用户组。
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
     * 根据用户组ID，删除对应的IAM身份中心用户组。
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
     * 根据用户组ID，删除对应的IAM身份中心用户组。
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
     * 根据用户组ID，查询IAM身份中心用户组的详情信息。
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
     * 根据用户组ID，查询IAM身份中心用户组的详情信息。
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
     * 查询用户组ID
     *
     * 根据显示名或外部身份源ID，以精确匹配的方式查询用户组ID。显示名和外部身份源ID两种查询方式二选一，不支持同时传入。
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
     * 根据显示名或外部身份源ID，以精确匹配的方式查询用户组ID。显示名和外部身份源ID两种查询方式二选一，不支持同时传入。
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
     * 查询指定身份源下的IAM身份中心用户组列表。
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
     * 查询指定身份源下的IAM身份中心用户组列表。
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
     * 根据用户组ID，更新对应IAM身份中心用户组的属性。
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
     * 根据用户组ID，更新对应IAM身份中心用户组的属性。
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
     * 将用户添加到用户组中，用户和用户组必须在同一身份源下。
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
     * 将用户添加到用户组中，用户和用户组必须在同一身份源下。
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
     * 根据关联关系ID解绑用户和用户组，也就是将用户移出用户组。
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
     * 根据关联关系ID解绑用户和用户组，也就是将用户移出用户组。
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
     * 根据关联关系ID，查询此关联关系的详情信息。
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
     * 根据关联关系ID，查询此关联关系的详情信息。
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
     * 根据用户ID和用户组ID，查询对应的关联关系ID。
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
     * 根据用户ID和用户组ID，查询对应的关联关系ID。
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
     * 查询用户是否为用户组成员
     *
     * 根据用户ID和用户组ID列表，查询用户是否为用户组的成员。
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
     * 查询用户是否为用户组成员
     *
     * 根据用户ID和用户组ID列表，查询用户是否为用户组的成员。
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
     * 根据用户组ID，列出用户组中的用户。
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
     * 根据用户组ID，列出用户组中的用户。
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
     * 根据用户ID，列出用户加入的用户组。
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
     * 根据用户ID，列出用户加入的用户组。
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
     * 创建用户
     *
     * 在指定的身份源中创建一个IAM身份中心用户。
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
     * 在指定的身份源中创建一个IAM身份中心用户。
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
     * 删除用户
     *
     * 根据用户ID，删除对应的IAM身份中心用户。
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
     * 根据用户ID，删除对应的IAM身份中心用户。
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
     * 根据用户ID，查询对应IAM身份中心用户的详情信息。
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
     * 根据用户ID，查询对应IAM身份中心用户的详情信息。
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
     * 查询用户ID
     *
     * 根据用户名或外部身份源ID，以精确匹配的方式查询用户ID。用户名和外部身份源ID两种查询方式二选一，不支持同时传入。
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
     * 根据用户名或外部身份源ID，以精确匹配的方式查询用户ID。用户名和外部身份源ID两种查询方式二选一，不支持同时传入。
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
     * 列出用户
     *
     * 查询指定身份源下的IAM身份中心用户列表。
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
     * 查询指定身份源下的IAM身份中心用户列表。
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
     * 更新用户
     *
     * 根据用户ID，更新对应IAM身份中心用户的属性。
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
     * 根据用户ID，更新对应IAM身份中心用户的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterStoreMeta.updateUser, hcClient);
    }

}
