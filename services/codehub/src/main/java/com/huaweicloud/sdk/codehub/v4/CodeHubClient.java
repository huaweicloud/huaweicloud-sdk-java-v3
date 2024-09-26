package com.huaweicloud.sdk.codehub.v4;

import com.huaweicloud.sdk.codehub.v4.model.AddTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.AssociateGroupUserGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.AssociateGroupUserGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.AssociateRepositoryUserGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.AssociateRepositoryUserGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListManageableGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListManageableGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTenantTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTenantTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codehub.v4.model.LockRepositoryRequest;
import com.huaweicloud.sdk.codehub.v4.model.LockRepositoryResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.UnlockRepositoryRequest;
import com.huaweicloud.sdk.codehub.v4.model.UnlockRepositoryResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTrustedIpAddressResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeHubClient {

    protected HcClient hcClient;

    public CodeHubClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeHubClient> newBuilder() {
        ClientBuilder<CodeHubClient> clientBuilder = new ClientBuilder<>(CodeHubClient::new);
        return clientBuilder;
    }

    /**
     * 关联代码组与成员组
     *
     * 关联代码组与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGroupUserGroupRequest 请求对象
     * @return AssociateGroupUserGroupResponse
     */
    public AssociateGroupUserGroupResponse associateGroupUserGroup(AssociateGroupUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.associateGroupUserGroup);
    }

    /**
     * 关联代码组与成员组
     *
     * 关联代码组与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGroupUserGroupRequest 请求对象
     * @return SyncInvoker<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse>
     */
    public SyncInvoker<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> associateGroupUserGroupInvoker(
        AssociateGroupUserGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.associateGroupUserGroup, hcClient);
    }

    /**
     * 关联仓库与成员组
     *
     * 关联仓库与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRepositoryUserGroupRequest 请求对象
     * @return AssociateRepositoryUserGroupResponse
     */
    public AssociateRepositoryUserGroupResponse associateRepositoryUserGroup(
        AssociateRepositoryUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.associateRepositoryUserGroup);
    }

    /**
     * 关联仓库与成员组
     *
     * 关联仓库与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRepositoryUserGroupRequest 请求对象
     * @return SyncInvoker<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse>
     */
    public SyncInvoker<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> associateRepositoryUserGroupInvoker(
        AssociateRepositoryUserGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.associateRepositoryUserGroup, hcClient);
    }

    /**
     * 创建代码组
     *
     * 创建代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createGroup);
    }

    /**
     * 创建代码组
     *
     * 创建代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return SyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public SyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupInvoker(CreateGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createGroup, hcClient);
    }

    /**
     * 删除代码组
     *
     * 删除代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteGroup);
    }

    /**
     * 删除代码组
     *
     * 删除代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public SyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupInvoker(DeleteGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteGroup, hcClient);
    }

    /**
     * 项目下拥有创建权限的代码组列表
     *
     * 项目下拥有创建权限的代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManageableGroupsRequest 请求对象
     * @return ListManageableGroupsResponse
     */
    public ListManageableGroupsResponse listManageableGroups(ListManageableGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listManageableGroups);
    }

    /**
     * 项目下拥有创建权限的代码组列表
     *
     * 项目下拥有创建权限的代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManageableGroupsRequest 请求对象
     * @return SyncInvoker<ListManageableGroupsRequest, ListManageableGroupsResponse>
     */
    public SyncInvoker<ListManageableGroupsRequest, ListManageableGroupsResponse> listManageableGroupsInvoker(
        ListManageableGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listManageableGroups, hcClient);
    }

    /**
     * 获取代码组信息
     *
     * 获取代码组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return ShowGroupResponse
     */
    public ShowGroupResponse showGroup(ShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroup);
    }

    /**
     * 获取代码组信息
     *
     * 获取代码组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return SyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public SyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupInvoker(ShowGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroup, hcClient);
    }

    /**
     * 添加仓库ip白名单
     *
     * 添加仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTrustedIpAddressRequest 请求对象
     * @return AddTrustedIpAddressResponse
     */
    public AddTrustedIpAddressResponse addTrustedIpAddress(AddTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addTrustedIpAddress);
    }

    /**
     * 添加仓库ip白名单
     *
     * 添加仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse>
     */
    public SyncInvoker<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> addTrustedIpAddressInvoker(
        AddTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addTrustedIpAddress, hcClient);
    }

    /**
     * 删除仓库ip白名单
     *
     * 删除仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrustedIpAddressRequest 请求对象
     * @return DeleteTrustedIpAddressResponse
     */
    public DeleteTrustedIpAddressResponse deleteTrustedIpAddress(DeleteTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteTrustedIpAddress);
    }

    /**
     * 删除仓库ip白名单
     *
     * 删除仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse>
     */
    public SyncInvoker<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> deleteTrustedIpAddressInvoker(
        DeleteTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteTrustedIpAddress, hcClient);
    }

    /**
     * 获取仓库ip白名单
     *
     * 获取仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedIpAddressesRequest 请求对象
     * @return ListTrustedIpAddressesResponse
     */
    public ListTrustedIpAddressesResponse listTrustedIpAddresses(ListTrustedIpAddressesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTrustedIpAddresses);
    }

    /**
     * 获取仓库ip白名单
     *
     * 获取仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedIpAddressesRequest 请求对象
     * @return SyncInvoker<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse>
     */
    public SyncInvoker<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> listTrustedIpAddressesInvoker(
        ListTrustedIpAddressesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listTrustedIpAddresses, hcClient);
    }

    /**
     * 根据仓库短ID锁定仓库
     *
     * 根据仓库短ID锁定仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockRepositoryRequest 请求对象
     * @return LockRepositoryResponse
     */
    public LockRepositoryResponse lockRepository(LockRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.lockRepository);
    }

    /**
     * 根据仓库短ID锁定仓库
     *
     * 根据仓库短ID锁定仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockRepositoryRequest 请求对象
     * @return SyncInvoker<LockRepositoryRequest, LockRepositoryResponse>
     */
    public SyncInvoker<LockRepositoryRequest, LockRepositoryResponse> lockRepositoryInvoker(
        LockRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.lockRepository, hcClient);
    }

    /**
     * 根据仓库短ID解锁仓库
     *
     * 根据仓库短ID解锁仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockRepositoryRequest 请求对象
     * @return UnlockRepositoryResponse
     */
    public UnlockRepositoryResponse unlockRepository(UnlockRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.unlockRepository);
    }

    /**
     * 根据仓库短ID解锁仓库
     *
     * 根据仓库短ID解锁仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockRepositoryRequest 请求对象
     * @return SyncInvoker<UnlockRepositoryRequest, UnlockRepositoryResponse>
     */
    public SyncInvoker<UnlockRepositoryRequest, UnlockRepositoryResponse> unlockRepositoryInvoker(
        UnlockRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.unlockRepository, hcClient);
    }

    /**
     * 修改仓库ip白名单
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustedIpAddressRequest 请求对象
     * @return UpdateTrustedIpAddressResponse
     */
    public UpdateTrustedIpAddressResponse updateTrustedIpAddress(UpdateTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateTrustedIpAddress);
    }

    /**
     * 修改仓库ip白名单
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse>
     */
    public SyncInvoker<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> updateTrustedIpAddressInvoker(
        UpdateTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateTrustedIpAddress, hcClient);
    }

    /**
     * 添加租户ip白名单
     *
     * 添加租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTenantTrustedIpAddressRequest 请求对象
     * @return AddTenantTrustedIpAddressResponse
     */
    public AddTenantTrustedIpAddressResponse addTenantTrustedIpAddress(AddTenantTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addTenantTrustedIpAddress);
    }

    /**
     * 添加租户ip白名单
     *
     * 添加租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTenantTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse>
     */
    public SyncInvoker<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> addTenantTrustedIpAddressInvoker(
        AddTenantTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addTenantTrustedIpAddress, hcClient);
    }

    /**
     * 删除租户ip白名单
     *
     * 删除租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantTrustedIpAddressRequest 请求对象
     * @return DeleteTenantTrustedIpAddressResponse
     */
    public DeleteTenantTrustedIpAddressResponse deleteTenantTrustedIpAddress(
        DeleteTenantTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteTenantTrustedIpAddress);
    }

    /**
     * 删除租户ip白名单
     *
     * 删除租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse>
     */
    public SyncInvoker<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> deleteTenantTrustedIpAddressInvoker(
        DeleteTenantTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteTenantTrustedIpAddress, hcClient);
    }

    /**
     * 获取租户ip白名单
     *
     * 获取租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantTrustedIpAddressesRequest 请求对象
     * @return ListTenantTrustedIpAddressesResponse
     */
    public ListTenantTrustedIpAddressesResponse listTenantTrustedIpAddresses(
        ListTenantTrustedIpAddressesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTenantTrustedIpAddresses);
    }

    /**
     * 获取租户ip白名单
     *
     * 获取租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantTrustedIpAddressesRequest 请求对象
     * @return SyncInvoker<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse>
     */
    public SyncInvoker<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> listTenantTrustedIpAddressesInvoker(
        ListTenantTrustedIpAddressesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listTenantTrustedIpAddresses, hcClient);
    }

    /**
     * 修改租户ip白名单
     *
     * 修改租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantTrustedIpAddressRequest 请求对象
     * @return UpdateTenantTrustedIpAddressResponse
     */
    public UpdateTenantTrustedIpAddressResponse updateTenantTrustedIpAddress(
        UpdateTenantTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateTenantTrustedIpAddress);
    }

    /**
     * 修改租户ip白名单
     *
     * 修改租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse>
     */
    public SyncInvoker<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> updateTenantTrustedIpAddressInvoker(
        UpdateTenantTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateTenantTrustedIpAddress, hcClient);
    }

}
