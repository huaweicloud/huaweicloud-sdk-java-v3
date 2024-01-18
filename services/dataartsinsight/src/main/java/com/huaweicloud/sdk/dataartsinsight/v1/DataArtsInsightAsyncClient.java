package com.huaweicloud.sdk.dataartsinsight.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dataartsinsight.v1.model.BatchSaveAuthRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.BatchSaveAuthResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListAuthPropertiesRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListAuthPropertiesResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListAuthedRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListAuthedResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.SaveOrUpdateAuthPropertiesRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.SaveOrUpdateAuthPropertiesResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.UpdateWorkspaceResponse;

import java.util.concurrent.CompletableFuture;

public class DataArtsInsightAsyncClient {

    protected HcClient hcClient;

    public DataArtsInsightAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DataArtsInsightAsyncClient> newBuilder() {
        ClientBuilder<DataArtsInsightAsyncClient> clientBuilder = new ClientBuilder<>(DataArtsInsightAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量保存、修改、删除协同授权
     *
     * 批量保存、修改、删除指定自研的协同授权规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSaveAuthRequest 请求对象
     * @return CompletableFuture<BatchSaveAuthResponse>
     */
    public CompletableFuture<BatchSaveAuthResponse> batchSaveAuthAsync(BatchSaveAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsInsightMeta.batchSaveAuth);
    }

    /**
     * 批量保存、修改、删除协同授权
     *
     * 批量保存、修改、删除指定自研的协同授权规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSaveAuthRequest 请求对象
     * @return AsyncInvoker<BatchSaveAuthRequest, BatchSaveAuthResponse>
     */
    public AsyncInvoker<BatchSaveAuthRequest, BatchSaveAuthResponse> batchSaveAuthAsyncInvoker(
        BatchSaveAuthRequest request) {
        return new AsyncInvoker<>(request, DataArtsInsightMeta.batchSaveAuth, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CompletableFuture<CreateWorkspaceResponse>
     */
    public CompletableFuture<CreateWorkspaceResponse> createWorkspaceAsync(CreateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsInsightMeta.createWorkspace);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceAsyncInvoker(
        CreateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsInsightMeta.createWorkspace, hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return CompletableFuture<DeleteWorkspaceResponse>
     */
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsInsightMeta.deleteWorkspace);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceAsyncInvoker(
        DeleteWorkspaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsInsightMeta.deleteWorkspace, hcClient);
    }

    /**
     * 获取资源属性值
     *
     * 获取资源属性值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthPropertiesRequest 请求对象
     * @return CompletableFuture<ListAuthPropertiesResponse>
     */
    public CompletableFuture<ListAuthPropertiesResponse> listAuthPropertiesAsync(ListAuthPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsInsightMeta.listAuthProperties);
    }

    /**
     * 获取资源属性值
     *
     * 获取资源属性值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthPropertiesRequest 请求对象
     * @return AsyncInvoker<ListAuthPropertiesRequest, ListAuthPropertiesResponse>
     */
    public AsyncInvoker<ListAuthPropertiesRequest, ListAuthPropertiesResponse> listAuthPropertiesAsyncInvoker(
        ListAuthPropertiesRequest request) {
        return new AsyncInvoker<>(request, DataArtsInsightMeta.listAuthProperties, hcClient);
    }

    /**
     * 协同授权列表
     *
     * 协同授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthedRequest 请求对象
     * @return CompletableFuture<ListAuthedResponse>
     */
    public CompletableFuture<ListAuthedResponse> listAuthedAsync(ListAuthedRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsInsightMeta.listAuthed);
    }

    /**
     * 协同授权列表
     *
     * 协同授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthedRequest 请求对象
     * @return AsyncInvoker<ListAuthedRequest, ListAuthedResponse>
     */
    public AsyncInvoker<ListAuthedRequest, ListAuthedResponse> listAuthedAsyncInvoker(ListAuthedRequest request) {
        return new AsyncInvoker<>(request, DataArtsInsightMeta.listAuthed, hcClient);
    }

    /**
     * 查询工作空间
     *
     * 查询工作空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return CompletableFuture<ListWorkspacesResponse>
     */
    public CompletableFuture<ListWorkspacesResponse> listWorkspacesAsync(ListWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsInsightMeta.listWorkspaces);
    }

    /**
     * 查询工作空间
     *
     * 查询工作空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesAsyncInvoker(
        ListWorkspacesRequest request) {
        return new AsyncInvoker<>(request, DataArtsInsightMeta.listWorkspaces, hcClient);
    }

    /**
     * 保存或修改资源属性值
     *
     * 保存或修改资源属性值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveOrUpdateAuthPropertiesRequest 请求对象
     * @return CompletableFuture<SaveOrUpdateAuthPropertiesResponse>
     */
    public CompletableFuture<SaveOrUpdateAuthPropertiesResponse> saveOrUpdateAuthPropertiesAsync(
        SaveOrUpdateAuthPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsInsightMeta.saveOrUpdateAuthProperties);
    }

    /**
     * 保存或修改资源属性值
     *
     * 保存或修改资源属性值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveOrUpdateAuthPropertiesRequest 请求对象
     * @return AsyncInvoker<SaveOrUpdateAuthPropertiesRequest, SaveOrUpdateAuthPropertiesResponse>
     */
    public AsyncInvoker<SaveOrUpdateAuthPropertiesRequest, SaveOrUpdateAuthPropertiesResponse> saveOrUpdateAuthPropertiesAsyncInvoker(
        SaveOrUpdateAuthPropertiesRequest request) {
        return new AsyncInvoker<>(request, DataArtsInsightMeta.saveOrUpdateAuthProperties, hcClient);
    }

    /**
     * 修改工作空间
     *
     * 修改工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsInsightMeta.updateWorkspace);
    }

    /**
     * 修改工作空间
     *
     * 修改工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsInsightMeta.updateWorkspace, hcClient);
    }

}
