package com.huaweicloud.sdk.dataartsinsight.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class DataArtsInsightClient {

    protected HcClient hcClient;

    public DataArtsInsightClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DataArtsInsightClient> newBuilder() {
        ClientBuilder<DataArtsInsightClient> clientBuilder = new ClientBuilder<>(DataArtsInsightClient::new);
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
     * @return BatchSaveAuthResponse
     */
    public BatchSaveAuthResponse batchSaveAuth(BatchSaveAuthRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsInsightMeta.batchSaveAuth);
    }

    /**
     * 批量保存、修改、删除协同授权
     *
     * 批量保存、修改、删除指定自研的协同授权规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSaveAuthRequest 请求对象
     * @return SyncInvoker<BatchSaveAuthRequest, BatchSaveAuthResponse>
     */
    public SyncInvoker<BatchSaveAuthRequest, BatchSaveAuthResponse> batchSaveAuthInvoker(BatchSaveAuthRequest request) {
        return new SyncInvoker<>(request, DataArtsInsightMeta.batchSaveAuth, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsInsightMeta.createWorkspace);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceInvoker(
        CreateWorkspaceRequest request) {
        return new SyncInvoker<>(request, DataArtsInsightMeta.createWorkspace, hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsInsightMeta.deleteWorkspace);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceInvoker(
        DeleteWorkspaceRequest request) {
        return new SyncInvoker<>(request, DataArtsInsightMeta.deleteWorkspace, hcClient);
    }

    /**
     * 获取资源属性值
     *
     * 获取资源属性值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthPropertiesRequest 请求对象
     * @return ListAuthPropertiesResponse
     */
    public ListAuthPropertiesResponse listAuthProperties(ListAuthPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsInsightMeta.listAuthProperties);
    }

    /**
     * 获取资源属性值
     *
     * 获取资源属性值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthPropertiesRequest 请求对象
     * @return SyncInvoker<ListAuthPropertiesRequest, ListAuthPropertiesResponse>
     */
    public SyncInvoker<ListAuthPropertiesRequest, ListAuthPropertiesResponse> listAuthPropertiesInvoker(
        ListAuthPropertiesRequest request) {
        return new SyncInvoker<>(request, DataArtsInsightMeta.listAuthProperties, hcClient);
    }

    /**
     * 协同授权列表
     *
     * 协同授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthedRequest 请求对象
     * @return ListAuthedResponse
     */
    public ListAuthedResponse listAuthed(ListAuthedRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsInsightMeta.listAuthed);
    }

    /**
     * 协同授权列表
     *
     * 协同授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthedRequest 请求对象
     * @return SyncInvoker<ListAuthedRequest, ListAuthedResponse>
     */
    public SyncInvoker<ListAuthedRequest, ListAuthedResponse> listAuthedInvoker(ListAuthedRequest request) {
        return new SyncInvoker<>(request, DataArtsInsightMeta.listAuthed, hcClient);
    }

    /**
     * 查询工作空间
     *
     * 查询工作空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsInsightMeta.listWorkspaces);
    }

    /**
     * 查询工作空间
     *
     * 查询工作空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<>(request, DataArtsInsightMeta.listWorkspaces, hcClient);
    }

    /**
     * 保存或修改资源属性值
     *
     * 保存或修改资源属性值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveOrUpdateAuthPropertiesRequest 请求对象
     * @return SaveOrUpdateAuthPropertiesResponse
     */
    public SaveOrUpdateAuthPropertiesResponse saveOrUpdateAuthProperties(SaveOrUpdateAuthPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsInsightMeta.saveOrUpdateAuthProperties);
    }

    /**
     * 保存或修改资源属性值
     *
     * 保存或修改资源属性值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveOrUpdateAuthPropertiesRequest 请求对象
     * @return SyncInvoker<SaveOrUpdateAuthPropertiesRequest, SaveOrUpdateAuthPropertiesResponse>
     */
    public SyncInvoker<SaveOrUpdateAuthPropertiesRequest, SaveOrUpdateAuthPropertiesResponse> saveOrUpdateAuthPropertiesInvoker(
        SaveOrUpdateAuthPropertiesRequest request) {
        return new SyncInvoker<>(request, DataArtsInsightMeta.saveOrUpdateAuthProperties, hcClient);
    }

    /**
     * 修改工作空间
     *
     * 修改工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsInsightMeta.updateWorkspace);
    }

    /**
     * 修改工作空间
     *
     * 修改工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<>(request, DataArtsInsightMeta.updateWorkspace, hcClient);
    }

}
