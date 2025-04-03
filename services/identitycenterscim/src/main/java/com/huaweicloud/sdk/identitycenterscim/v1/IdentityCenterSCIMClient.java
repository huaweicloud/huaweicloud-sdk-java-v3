package com.huaweicloud.sdk.identitycenterscim.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class IdentityCenterSCIMClient {

    protected HcClient hcClient;

    public IdentityCenterSCIMClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterSCIMClient> newBuilder() {
        ClientBuilder<IdentityCenterSCIMClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterSCIMClient::new, "IdentityCenterSCIMCredentials");
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
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.createGroup);
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
     * @return SyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public SyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupInvoker(CreateGroupRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.createGroup, hcClient);
    }

    /**
     * 删除用户组
     *
     * 删除现有用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.deleteGroup);
    }

    /**
     * 删除用户组
     *
     * 删除现有用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public SyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupInvoker(DeleteGroupRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.deleteGroup, hcClient);
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
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroup(GetGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.getGroup);
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
     * @return SyncInvoker<GetGroupRequest, GetGroupResponse>
     */
    public SyncInvoker<GetGroupRequest, GetGroupResponse> getGroupInvoker(GetGroupRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.getGroup, hcClient);
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
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.listGroups);
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
     * @return SyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public SyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsInvoker(ListGroupsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.listGroups, hcClient);
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
     * @return PatchGroupResponse
     */
    public PatchGroupResponse patchGroup(PatchGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.patchGroup);
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
     * @return SyncInvoker<PatchGroupRequest, PatchGroupResponse>
     */
    public SyncInvoker<PatchGroupRequest, PatchGroupResponse> patchGroupInvoker(PatchGroupRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.patchGroup, hcClient);
    }

    /**
     * 查询服务提供商配置
     *
     * 查询IAM身份中心的SCIM相关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ServiceProviderConfigRequest 请求对象
     * @return ServiceProviderConfigResponse
     */
    public ServiceProviderConfigResponse serviceProviderConfig(ServiceProviderConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.serviceProviderConfig);
    }

    /**
     * 查询服务提供商配置
     *
     * 查询IAM身份中心的SCIM相关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ServiceProviderConfigRequest 请求对象
     * @return SyncInvoker<ServiceProviderConfigRequest, ServiceProviderConfigResponse>
     */
    public SyncInvoker<ServiceProviderConfigRequest, ServiceProviderConfigResponse> serviceProviderConfigInvoker(
        ServiceProviderConfigRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.serviceProviderConfig, hcClient);
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
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.createUser);
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
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.createUser, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除现有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除现有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.deleteUser, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 查询现有用户的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetUserRequest 请求对象
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.getUser);
    }

    /**
     * 查询用户详情
     *
     * 查询现有用户的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetUserRequest 请求对象
     * @return SyncInvoker<GetUserRequest, GetUserResponse>
     */
    public SyncInvoker<GetUserRequest, GetUserResponse> getUserInvoker(GetUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.getUser, hcClient);
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
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.listUsers);
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
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.listUsers, hcClient);
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
     * @return PatchUserResponse
     */
    public PatchUserResponse patchUser(PatchUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.patchUser);
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
     * @return SyncInvoker<PatchUserRequest, PatchUserResponse>
     */
    public SyncInvoker<PatchUserRequest, PatchUserResponse> patchUserInvoker(PatchUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.patchUser, hcClient);
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
     * @return PutUserResponse
     */
    public PutUserResponse putUser(PutUserRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterSCIMMeta.putUser);
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
     * @return SyncInvoker<PutUserRequest, PutUserResponse>
     */
    public SyncInvoker<PutUserRequest, PutUserResponse> putUserInvoker(PutUserRequest request) {
        return new SyncInvoker<>(request, IdentityCenterSCIMMeta.putUser, hcClient);
    }

}
