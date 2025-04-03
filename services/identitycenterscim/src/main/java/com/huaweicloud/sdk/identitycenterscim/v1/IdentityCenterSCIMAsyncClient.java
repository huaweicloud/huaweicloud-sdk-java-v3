package com.huaweicloud.sdk.identitycenterscim.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.DeleteGroupRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.DeleteGroupResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.GetGroupRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.GetGroupResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.GetUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.GetUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ListGroupsRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ListGroupsResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchGroupRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchGroupResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PutUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PutUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ServiceProviderConfigRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ServiceProviderConfigResponse;

import java.util.concurrent.CompletableFuture;

public class IdentityCenterSCIMAsyncClient {

    protected HcClient hcClient;

    public IdentityCenterSCIMAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterSCIMAsyncClient> newBuilder() {
        ClientBuilder<IdentityCenterSCIMAsyncClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterSCIMAsyncClient::new, "IdentityCenterSCIMCredentials");
        return clientBuilder;
    }

    /**
     * 创建用户组
     *
     * 使用SCIM协议，同步用户组到IAM身份中心。
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - displayName、schemas为必填项
     * - 在单个请求中最多可以添加100个成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return CompletableFuture<CreateGroupResponse>
     */
    public CompletableFuture<CreateGroupResponse> createGroupAsync(CreateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.createGroup);
    }

    /**
     * 创建用户组
     *
     * 使用SCIM协议，同步用户组到IAM身份中心。
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - displayName、schemas为必填项
     * - 在单个请求中最多可以添加100个成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return AsyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public AsyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupAsyncInvoker(CreateGroupRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.createGroup, hcClient);
    }

    /**
     * 删除用户组
     *
     * 删除现有用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return CompletableFuture<DeleteGroupResponse>
     */
    public CompletableFuture<DeleteGroupResponse> deleteGroupAsync(DeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.deleteGroup);
    }

    /**
     * 删除用户组
     *
     * 删除现有用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupAsyncInvoker(DeleteGroupRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.deleteGroup, hcClient);
    }

    /**
     * 查询用户组详情
     *
     * 查询现有用户组的详情信息。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - 查询用户组详情接口和列出用户组接口返回空成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupRequest 请求对象
     * @return CompletableFuture<GetGroupResponse>
     */
    public CompletableFuture<GetGroupResponse> getGroupAsync(GetGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.getGroup);
    }

    /**
     * 查询用户组详情
     *
     * 查询现有用户组的详情信息。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - 查询用户组详情接口和列出用户组接口返回空成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetGroupRequest 请求对象
     * @return AsyncInvoker<GetGroupRequest, GetGroupResponse>
     */
    public AsyncInvoker<GetGroupRequest, GetGroupResponse> getGroupAsyncInvoker(GetGroupRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.getGroup, hcClient);
    }

    /**
     * 列出用户组
     *
     * 对现有用户组列表执行筛选查询，最多只能返回50个结果。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - 查询用户组详情接口和列出用户组接口返回空成员列表
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 目前，列出用户组接口最多只能返回50个结果
     * - 支持的筛选器组合：(displayName)、(id)。请注意，使用id作为单个过滤器虽然有效，但应避免使用，因为已经有一个查询用户组详情接口可用
     * - 过滤器中支持的比较运算符：eq
     * - 必须按如下方式指定筛选器：&lt;filterAttribute&gt; eq \&quot;&lt;filterValue&gt;\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return CompletableFuture<ListGroupsResponse>
     */
    public CompletableFuture<ListGroupsResponse> listGroupsAsync(ListGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.listGroups);
    }

    /**
     * 列出用户组
     *
     * 对现有用户组列表执行筛选查询，最多只能返回50个结果。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - 查询用户组详情接口和列出用户组接口返回空成员列表
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 目前，列出用户组接口最多只能返回50个结果
     * - 支持的筛选器组合：(displayName)、(id)。请注意，使用id作为单个过滤器虽然有效，但应避免使用，因为已经有一个查询用户组详情接口可用
     * - 过滤器中支持的比较运算符：eq
     * - 必须按如下方式指定筛选器：&lt;filterAttribute&gt; eq \&quot;&lt;filterValue&gt;\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return AsyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public AsyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsAsyncInvoker(ListGroupsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.listGroups, hcClient);
    }

    /**
     * 部分更新用户组
     *
     * 修改现有用户组的部分属性，和管理用户组中的用户。
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 请求中只允许使用displayName、 members和externalId属性
     * - 单个请求中最多允许100个成员更改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchGroupRequest 请求对象
     * @return CompletableFuture<PatchGroupResponse>
     */
    public CompletableFuture<PatchGroupResponse> patchGroupAsync(PatchGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.patchGroup);
    }

    /**
     * 部分更新用户组
     *
     * 修改现有用户组的部分属性，和管理用户组中的用户。
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 请求中只允许使用displayName、 members和externalId属性
     * - 单个请求中最多允许100个成员更改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchGroupRequest 请求对象
     * @return AsyncInvoker<PatchGroupRequest, PatchGroupResponse>
     */
    public AsyncInvoker<PatchGroupRequest, PatchGroupResponse> patchGroupAsyncInvoker(PatchGroupRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.patchGroup, hcClient);
    }

    /**
     * 查询服务提供商配置
     *
     * 查询IAM身份中心的SCIM相关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ServiceProviderConfigRequest 请求对象
     * @return CompletableFuture<ServiceProviderConfigResponse>
     */
    public CompletableFuture<ServiceProviderConfigResponse> serviceProviderConfigAsync(
        ServiceProviderConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.serviceProviderConfig);
    }

    /**
     * 查询服务提供商配置
     *
     * 查询IAM身份中心的SCIM相关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ServiceProviderConfigRequest 请求对象
     * @return AsyncInvoker<ServiceProviderConfigRequest, ServiceProviderConfigResponse>
     */
    public AsyncInvoker<ServiceProviderConfigRequest, ServiceProviderConfigResponse> serviceProviderConfigAsyncInvoker(
        ServiceProviderConfigRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.serviceProviderConfig, hcClient);
    }

    /**
     * 创建用户
     *
     * 使用SCIM协议，同步用户到IAM身份中心。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - ims、photos、x509Certificates、entitlements和password属性
     * - manager的displayName子属性
     * - emails、addresses和phoneNumbers的display子属性
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 必须填写userName、displayName、schemas属性，name属性中的familyName、givenName子属性，emails属性中的value、primary、type子属性
     * - addresses可以包含字母、重音字符、符号、数字、标点符号、空格（正常和不换行）
     * - 我们不支持多值属性中的多个值（例如emails,addresses,phoneNumbers）。只允许单个值
     * - emails属性值必须标记为primary
     * - 不能指定groups字段
     * - userName字段可以包含字母、数字和部分符号_+&#x3D;,.@-
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CompletableFuture<CreateUserResponse>
     */
    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 使用SCIM协议，同步用户到IAM身份中心。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - ims、photos、x509Certificates、entitlements和password属性
     * - manager的displayName子属性
     * - emails、addresses和phoneNumbers的display子属性
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 必须填写userName、displayName、schemas属性，name属性中的familyName、givenName子属性，emails属性中的value、primary、type子属性
     * - addresses可以包含字母、重音字符、符号、数字、标点符号、空格（正常和不换行）
     * - 我们不支持多值属性中的多个值（例如emails,addresses,phoneNumbers）。只允许单个值
     * - emails属性值必须标记为primary
     * - 不能指定groups字段
     * - userName字段可以包含字母、数字和部分符号_+&#x3D;,.@-
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.createUser, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除现有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除现有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.deleteUser, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 查询现有用户的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetUserRequest 请求对象
     * @return CompletableFuture<GetUserResponse>
     */
    public CompletableFuture<GetUserResponse> getUserAsync(GetUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.getUser);
    }

    /**
     * 查询用户详情
     *
     * 查询现有用户的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetUserRequest 请求对象
     * @return AsyncInvoker<GetUserRequest, GetUserResponse>
     */
    public AsyncInvoker<GetUserRequest, GetUserResponse> getUserAsyncInvoker(GetUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.getUser, hcClient);
    }

    /**
     * 列出用户
     *
     * 对现有用户列表执行筛选查询，最多只能返回50个结果。
     * 暂不支持
     * IAM身份中心不支持此API操作的以下方面。
     * - startIndex,attributes,excludedAttributes（虽在SCIM协议中列出）
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 目前，列出用户接口最多只能返回50个结果
     * - 支持的筛选器组合：(userName)、(id)。请注意，使用id作为单个过滤器虽然有效，但应避免使用，因为已经有一个查询用户详情接口可用
     * - 过滤器中支持的比较运算符：eq
     * - 必须按如下方式指定筛选器：&lt;filterAttribute&gt; eq \&quot;&lt;filterValue&gt;\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.listUsers);
    }

    /**
     * 列出用户
     *
     * 对现有用户列表执行筛选查询，最多只能返回50个结果。
     * 暂不支持
     * IAM身份中心不支持此API操作的以下方面。
     * - startIndex,attributes,excludedAttributes（虽在SCIM协议中列出）
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 目前，列出用户接口最多只能返回50个结果
     * - 支持的筛选器组合：(userName)、(id)。请注意，使用id作为单个过滤器虽然有效，但应避免使用，因为已经有一个查询用户详情接口可用
     * - 过滤器中支持的比较运算符：eq
     * - 必须按如下方式指定筛选器：&lt;filterAttribute&gt; eq \&quot;&lt;filterValue&gt;\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.listUsers, hcClient);
    }

    /**
     * 部分更新用户
     *
     * 修改现有用户的部分属性。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - 对userName或active属性执行多个PATCH操作
     * - ims、photos、x509Certificates、entitlements和password属性
     * - manager的displayName子属性
     * - emails、addresses和phoneNumbers的display子属性
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 支持的操作是add、replace和remove
     * - 必须指定操作
     * - remove操作需要指定属性路径
     * - add和replace操作需要指定属性的值
     * - 仅允许修改userName、active、externalId、displayName、nickName、profileUrl、title、userType、preferredLanguage、locale、timezone、name、enterprise、emails、addresses和phoneNumbers属性
     * - 过滤器中仅支持eq运算符
     * - userName或active属性不支持remove操作
     * - 我们不支持多值属性中的多个值（例如emails,addresses,phoneNumbers）。这些属性中的每一个都只允许有一个值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchUserRequest 请求对象
     * @return CompletableFuture<PatchUserResponse>
     */
    public CompletableFuture<PatchUserResponse> patchUserAsync(PatchUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.patchUser);
    }

    /**
     * 部分更新用户
     *
     * 修改现有用户的部分属性。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - 对userName或active属性执行多个PATCH操作
     * - ims、photos、x509Certificates、entitlements和password属性
     * - manager的displayName子属性
     * - emails、addresses和phoneNumbers的display子属性
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 支持的操作是add、replace和remove
     * - 必须指定操作
     * - remove操作需要指定属性路径
     * - add和replace操作需要指定属性的值
     * - 仅允许修改userName、active、externalId、displayName、nickName、profileUrl、title、userType、preferredLanguage、locale、timezone、name、enterprise、emails、addresses和phoneNumbers属性
     * - 过滤器中仅支持eq运算符
     * - userName或active属性不支持remove操作
     * - 我们不支持多值属性中的多个值（例如emails,addresses,phoneNumbers）。这些属性中的每一个都只允许有一个值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchUserRequest 请求对象
     * @return AsyncInvoker<PatchUserRequest, PatchUserResponse>
     */
    public AsyncInvoker<PatchUserRequest, PatchUserResponse> patchUserAsyncInvoker(PatchUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.patchUser, hcClient);
    }

    /**
     * 更新用户
     *
     * 更新现有用户。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - ims、photos、x509Certificates、entitlements和password属性
     * - manager的displayName子属性
     * - emails、addresses和phoneNumbers的display子属性
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 必须填写userName、displayName、schemas属性，name属性中的familyName、givenName子属性，emails属性中的value、primary、type子属性
     * - addresses可以包含字母、重音字符、符号、数字、标点符号、空格（正常和不换行）
     * - 我们不支持多值属性中的多个值（例如emails,addresses,phoneNumbers）
     * - emails属性值必须标记为primary
     * - 不能指定groups属性
     * - userName字段可以包含字母、数字和部分符号_+&#x3D;,.@-
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutUserRequest 请求对象
     * @return CompletableFuture<PutUserResponse>
     */
    public CompletableFuture<PutUserResponse> putUserAsync(PutUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterSCIMMeta.putUser);
    }

    /**
     * 更新用户
     *
     * 更新现有用户。
     * 暂不支持
     * IAM身份中心暂不支持此API操作的以下方面。
     * - ims、photos、x509Certificates、entitlements和password属性
     * - manager的displayName子属性
     * - emails、addresses和phoneNumbers的display子属性
     * 
     * 约束条件
     * IAM身份中心对此API操作具有以下约束。
     * - 必须填写userName、displayName、schemas属性，name属性中的familyName、givenName子属性，emails属性中的value、primary、type子属性
     * - addresses可以包含字母、重音字符、符号、数字、标点符号、空格（正常和不换行）
     * - 我们不支持多值属性中的多个值（例如emails,addresses,phoneNumbers）
     * - emails属性值必须标记为primary
     * - 不能指定groups属性
     * - userName字段可以包含字母、数字和部分符号_+&#x3D;,.@-
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutUserRequest 请求对象
     * @return AsyncInvoker<PutUserRequest, PutUserResponse>
     */
    public AsyncInvoker<PutUserRequest, PutUserResponse> putUserAsyncInvoker(PutUserRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterSCIMMeta.putUser, hcClient);
    }

}
