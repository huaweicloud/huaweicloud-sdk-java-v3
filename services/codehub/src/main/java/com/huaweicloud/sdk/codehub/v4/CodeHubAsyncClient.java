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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeHubAsyncClient {

    protected HcClient hcClient;

    public CodeHubAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeHubAsyncClient> newBuilder() {
        ClientBuilder<CodeHubAsyncClient> clientBuilder = new ClientBuilder<>(CodeHubAsyncClient::new);
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
     * @return CompletableFuture<AssociateGroupUserGroupResponse>
     */
    public CompletableFuture<AssociateGroupUserGroupResponse> associateGroupUserGroupAsync(
        AssociateGroupUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.associateGroupUserGroup);
    }

    /**
     * 关联代码组与成员组
     *
     * 关联代码组与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGroupUserGroupRequest 请求对象
     * @return AsyncInvoker<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse>
     */
    public AsyncInvoker<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> associateGroupUserGroupAsyncInvoker(
        AssociateGroupUserGroupRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.associateGroupUserGroup, hcClient);
    }

    /**
     * 关联仓库与成员组
     *
     * 关联仓库与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRepositoryUserGroupRequest 请求对象
     * @return CompletableFuture<AssociateRepositoryUserGroupResponse>
     */
    public CompletableFuture<AssociateRepositoryUserGroupResponse> associateRepositoryUserGroupAsync(
        AssociateRepositoryUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.associateRepositoryUserGroup);
    }

    /**
     * 关联仓库与成员组
     *
     * 关联仓库与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRepositoryUserGroupRequest 请求对象
     * @return AsyncInvoker<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse>
     */
    public AsyncInvoker<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> associateRepositoryUserGroupAsyncInvoker(
        AssociateRepositoryUserGroupRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.associateRepositoryUserGroup, hcClient);
    }

    /**
     * 创建代码组
     *
     * 创建代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return CompletableFuture<CreateGroupResponse>
     */
    public CompletableFuture<CreateGroupResponse> createGroupAsync(CreateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.createGroup);
    }

    /**
     * 创建代码组
     *
     * 创建代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return AsyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public AsyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupAsyncInvoker(CreateGroupRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.createGroup, hcClient);
    }

    /**
     * 删除代码组
     *
     * 删除代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return CompletableFuture<DeleteGroupResponse>
     */
    public CompletableFuture<DeleteGroupResponse> deleteGroupAsync(DeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteGroup);
    }

    /**
     * 删除代码组
     *
     * 删除代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupAsyncInvoker(DeleteGroupRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteGroup, hcClient);
    }

    /**
     * 项目下拥有创建权限的代码组列表
     *
     * 项目下拥有创建权限的代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManageableGroupsRequest 请求对象
     * @return CompletableFuture<ListManageableGroupsResponse>
     */
    public CompletableFuture<ListManageableGroupsResponse> listManageableGroupsAsync(
        ListManageableGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listManageableGroups);
    }

    /**
     * 项目下拥有创建权限的代码组列表
     *
     * 项目下拥有创建权限的代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManageableGroupsRequest 请求对象
     * @return AsyncInvoker<ListManageableGroupsRequest, ListManageableGroupsResponse>
     */
    public AsyncInvoker<ListManageableGroupsRequest, ListManageableGroupsResponse> listManageableGroupsAsyncInvoker(
        ListManageableGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listManageableGroups, hcClient);
    }

    /**
     * 获取代码组信息
     *
     * 获取代码组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return CompletableFuture<ShowGroupResponse>
     */
    public CompletableFuture<ShowGroupResponse> showGroupAsync(ShowGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showGroup);
    }

    /**
     * 获取代码组信息
     *
     * 获取代码组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return AsyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public AsyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupAsyncInvoker(ShowGroupRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showGroup, hcClient);
    }

    /**
     * 添加仓库ip白名单
     *
     * 添加仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<AddTrustedIpAddressResponse>
     */
    public CompletableFuture<AddTrustedIpAddressResponse> addTrustedIpAddressAsync(AddTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addTrustedIpAddress);
    }

    /**
     * 添加仓库ip白名单
     *
     * 添加仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse>
     */
    public AsyncInvoker<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> addTrustedIpAddressAsyncInvoker(
        AddTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addTrustedIpAddress, hcClient);
    }

    /**
     * 删除仓库ip白名单
     *
     * 删除仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<DeleteTrustedIpAddressResponse>
     */
    public CompletableFuture<DeleteTrustedIpAddressResponse> deleteTrustedIpAddressAsync(
        DeleteTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteTrustedIpAddress);
    }

    /**
     * 删除仓库ip白名单
     *
     * 删除仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse>
     */
    public AsyncInvoker<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> deleteTrustedIpAddressAsyncInvoker(
        DeleteTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteTrustedIpAddress, hcClient);
    }

    /**
     * 获取仓库ip白名单
     *
     * 获取仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedIpAddressesRequest 请求对象
     * @return CompletableFuture<ListTrustedIpAddressesResponse>
     */
    public CompletableFuture<ListTrustedIpAddressesResponse> listTrustedIpAddressesAsync(
        ListTrustedIpAddressesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listTrustedIpAddresses);
    }

    /**
     * 获取仓库ip白名单
     *
     * 获取仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedIpAddressesRequest 请求对象
     * @return AsyncInvoker<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse>
     */
    public AsyncInvoker<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> listTrustedIpAddressesAsyncInvoker(
        ListTrustedIpAddressesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listTrustedIpAddresses, hcClient);
    }

    /**
     * 根据仓库短ID锁定仓库
     *
     * 根据仓库短ID锁定仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockRepositoryRequest 请求对象
     * @return CompletableFuture<LockRepositoryResponse>
     */
    public CompletableFuture<LockRepositoryResponse> lockRepositoryAsync(LockRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.lockRepository);
    }

    /**
     * 根据仓库短ID锁定仓库
     *
     * 根据仓库短ID锁定仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockRepositoryRequest 请求对象
     * @return AsyncInvoker<LockRepositoryRequest, LockRepositoryResponse>
     */
    public AsyncInvoker<LockRepositoryRequest, LockRepositoryResponse> lockRepositoryAsyncInvoker(
        LockRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.lockRepository, hcClient);
    }

    /**
     * 根据仓库短ID解锁仓库
     *
     * 根据仓库短ID解锁仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockRepositoryRequest 请求对象
     * @return CompletableFuture<UnlockRepositoryResponse>
     */
    public CompletableFuture<UnlockRepositoryResponse> unlockRepositoryAsync(UnlockRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.unlockRepository);
    }

    /**
     * 根据仓库短ID解锁仓库
     *
     * 根据仓库短ID解锁仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockRepositoryRequest 请求对象
     * @return AsyncInvoker<UnlockRepositoryRequest, UnlockRepositoryResponse>
     */
    public AsyncInvoker<UnlockRepositoryRequest, UnlockRepositoryResponse> unlockRepositoryAsyncInvoker(
        UnlockRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.unlockRepository, hcClient);
    }

    /**
     * 修改仓库ip白名单
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<UpdateTrustedIpAddressResponse>
     */
    public CompletableFuture<UpdateTrustedIpAddressResponse> updateTrustedIpAddressAsync(
        UpdateTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.updateTrustedIpAddress);
    }

    /**
     * 修改仓库ip白名单
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse>
     */
    public AsyncInvoker<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> updateTrustedIpAddressAsyncInvoker(
        UpdateTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.updateTrustedIpAddress, hcClient);
    }

    /**
     * 添加租户ip白名单
     *
     * 添加租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTenantTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<AddTenantTrustedIpAddressResponse>
     */
    public CompletableFuture<AddTenantTrustedIpAddressResponse> addTenantTrustedIpAddressAsync(
        AddTenantTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addTenantTrustedIpAddress);
    }

    /**
     * 添加租户ip白名单
     *
     * 添加租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTenantTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse>
     */
    public AsyncInvoker<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> addTenantTrustedIpAddressAsyncInvoker(
        AddTenantTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addTenantTrustedIpAddress, hcClient);
    }

    /**
     * 删除租户ip白名单
     *
     * 删除租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<DeleteTenantTrustedIpAddressResponse>
     */
    public CompletableFuture<DeleteTenantTrustedIpAddressResponse> deleteTenantTrustedIpAddressAsync(
        DeleteTenantTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteTenantTrustedIpAddress);
    }

    /**
     * 删除租户ip白名单
     *
     * 删除租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse>
     */
    public AsyncInvoker<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> deleteTenantTrustedIpAddressAsyncInvoker(
        DeleteTenantTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteTenantTrustedIpAddress, hcClient);
    }

    /**
     * 获取租户ip白名单
     *
     * 获取租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantTrustedIpAddressesRequest 请求对象
     * @return CompletableFuture<ListTenantTrustedIpAddressesResponse>
     */
    public CompletableFuture<ListTenantTrustedIpAddressesResponse> listTenantTrustedIpAddressesAsync(
        ListTenantTrustedIpAddressesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listTenantTrustedIpAddresses);
    }

    /**
     * 获取租户ip白名单
     *
     * 获取租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantTrustedIpAddressesRequest 请求对象
     * @return AsyncInvoker<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse>
     */
    public AsyncInvoker<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> listTenantTrustedIpAddressesAsyncInvoker(
        ListTenantTrustedIpAddressesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listTenantTrustedIpAddresses, hcClient);
    }

    /**
     * 修改租户ip白名单
     *
     * 修改租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<UpdateTenantTrustedIpAddressResponse>
     */
    public CompletableFuture<UpdateTenantTrustedIpAddressResponse> updateTenantTrustedIpAddressAsync(
        UpdateTenantTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.updateTenantTrustedIpAddress);
    }

    /**
     * 修改租户ip白名单
     *
     * 修改租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse>
     */
    public AsyncInvoker<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> updateTenantTrustedIpAddressAsyncInvoker(
        UpdateTenantTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.updateTenantTrustedIpAddress, hcClient);
    }

}
