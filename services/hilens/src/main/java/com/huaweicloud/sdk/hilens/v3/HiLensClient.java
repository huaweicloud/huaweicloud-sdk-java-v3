package com.huaweicloud.sdk.hilens.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.hilens.v3.model.AddDeploymentNodesRequest;
import com.huaweicloud.sdk.hilens.v3.model.AddDeploymentNodesResponse;
import com.huaweicloud.sdk.hilens.v3.model.BatchCreateNodeTagsRequest;
import com.huaweicloud.sdk.hilens.v3.model.BatchCreateNodeTagsResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateConfigMapRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateConfigMapResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateOrderFormRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateOrderFormResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateResourceTagsRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateResourceTagsResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateSecretRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateSecretResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateTaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateTaskResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateWorkSpaceRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateWorkSpaceResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteConfigMapRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteConfigMapResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeletePodRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeletePodResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteSecretRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteSecretResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteTaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteTaskResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteWorkSpaceRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteWorkSpaceResponse;
import com.huaweicloud.sdk.hilens.v3.model.FreezeNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.FreezeNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListConfigMapsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListConfigMapsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListFirmwaresRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListFirmwaresResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListPlatformManagerRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListPlatformManagerResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListSecretsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListSecretsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListWorkSpacesRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListWorkSpacesResponse;
import com.huaweicloud.sdk.hilens.v3.model.SetDefaultOrderFormRequest;
import com.huaweicloud.sdk.hilens.v3.model.SetDefaultOrderFormResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowConfigMapRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowConfigMapResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentPodsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentPodsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodeActivationRecordsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodeActivationRecordsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodesRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodesResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowResourceTagsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowResourceTagsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSecretRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSecretResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillInfoRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillInfoResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillListRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillListResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillOrderInfoRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillOrderInfoResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillOrderListRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillOrderListResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowTaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowTaskResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowUpgradeProgressRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowUpgradeProgressResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowWorkSpaceRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowWorkSpaceResponse;
import com.huaweicloud.sdk.hilens.v3.model.StartAndStopDeploymentPodRequest;
import com.huaweicloud.sdk.hilens.v3.model.StartAndStopDeploymentPodResponse;
import com.huaweicloud.sdk.hilens.v3.model.StartAndStopDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.StartAndStopDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.SwitchNodeConnectionRequest;
import com.huaweicloud.sdk.hilens.v3.model.SwitchNodeConnectionResponse;
import com.huaweicloud.sdk.hilens.v3.model.UnfreezeNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.UnfreezeNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateConfigMapRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateConfigMapResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDeploymentUsingPatchRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDeploymentUsingPatchResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeCertRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeCertResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeFirmwareRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeFirmwareResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateSecretRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateSecretResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateTaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateTaskResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateWorkSpaceRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateWorkSpaceResponse;

public class HiLensClient {

    protected HcClient hcClient;

    public HiLensClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HiLensClient> newBuilder() {
        ClientBuilder<HiLensClient> clientBuilder = new ClientBuilder<>(HiLensClient::new);
        return clientBuilder;
    }

    /**
     * 批量部署
     *
     * 通过指定设备id列表或者设备标签将应用部署下发到多个设备上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeploymentNodesRequest 请求对象
     * @return AddDeploymentNodesResponse
     */
    public AddDeploymentNodesResponse addDeploymentNodes(AddDeploymentNodesRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.addDeploymentNodes);
    }

    /**
     * 批量部署
     *
     * 通过指定设备id列表或者设备标签将应用部署下发到多个设备上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeploymentNodesRequest 请求对象
     * @return SyncInvoker<AddDeploymentNodesRequest, AddDeploymentNodesResponse>
     */
    public SyncInvoker<AddDeploymentNodesRequest, AddDeploymentNodesResponse> addDeploymentNodesInvoker(
        AddDeploymentNodesRequest request) {
        return new SyncInvoker<AddDeploymentNodesRequest, AddDeploymentNodesResponse>(request,
            HiLensMeta.addDeploymentNodes, hcClient);
    }

    /**
     * 批量添加节点标签
     *
     * 专业版HiLens控制台标签管理，用户选择多个设备，批量添加多个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateNodeTagsRequest 请求对象
     * @return BatchCreateNodeTagsResponse
     */
    public BatchCreateNodeTagsResponse batchCreateNodeTags(BatchCreateNodeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.batchCreateNodeTags);
    }

    /**
     * 批量添加节点标签
     *
     * 专业版HiLens控制台标签管理，用户选择多个设备，批量添加多个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateNodeTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse>
     */
    public SyncInvoker<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse> batchCreateNodeTagsInvoker(
        BatchCreateNodeTagsRequest request) {
        return new SyncInvoker<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse>(request,
            HiLensMeta.batchCreateNodeTags, hcClient);
    }

    /**
     * 创建配置项
     *
     * 创建配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigMapRequest 请求对象
     * @return CreateConfigMapResponse
     */
    public CreateConfigMapResponse createConfigMap(CreateConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.createConfigMap);
    }

    /**
     * 创建配置项
     *
     * 创建配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigMapRequest 请求对象
     * @return SyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse>
     */
    public SyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse> createConfigMapInvoker(
        CreateConfigMapRequest request) {
        return new SyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse>(request, HiLensMeta.createConfigMap,
            hcClient);
    }

    /**
     * 创建应用部署
     *
     * 创建应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentRequest 请求对象
     * @return CreateDeploymentResponse
     */
    public CreateDeploymentResponse createDeployment(CreateDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.createDeployment);
    }

    /**
     * 创建应用部署
     *
     * 创建应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentRequest 请求对象
     * @return SyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>
     */
    public SyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse> createDeploymentInvoker(
        CreateDeploymentRequest request) {
        return new SyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>(request, HiLensMeta.createDeployment,
            hcClient);
    }

    /**
     * 注册设备
     *
     * 填写设备信息，将设备注册到HiLens专业版控制台上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeRequest 请求对象
     * @return CreateNodeResponse
     */
    public CreateNodeResponse createNode(CreateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.createNode);
    }

    /**
     * 注册设备
     *
     * 填写设备信息，将设备注册到HiLens专业版控制台上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeRequest 请求对象
     * @return SyncInvoker<CreateNodeRequest, CreateNodeResponse>
     */
    public SyncInvoker<CreateNodeRequest, CreateNodeResponse> createNodeInvoker(CreateNodeRequest request) {
        return new SyncInvoker<CreateNodeRequest, CreateNodeResponse>(request, HiLensMeta.createNode, hcClient);
    }

    /**
     * 创建免费技能订单
     *
     * 创建免费技能订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrderFormRequest 请求对象
     * @return CreateOrderFormResponse
     */
    public CreateOrderFormResponse createOrderForm(CreateOrderFormRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.createOrderForm);
    }

    /**
     * 创建免费技能订单
     *
     * 创建免费技能订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrderFormRequest 请求对象
     * @return SyncInvoker<CreateOrderFormRequest, CreateOrderFormResponse>
     */
    public SyncInvoker<CreateOrderFormRequest, CreateOrderFormResponse> createOrderFormInvoker(
        CreateOrderFormRequest request) {
        return new SyncInvoker<CreateOrderFormRequest, CreateOrderFormResponse>(request, HiLensMeta.createOrderForm,
            hcClient);
    }

    /**
     * 添加资源标签
     *
     * 专业版HiLens控制台标签管理，添加对应资源的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagsRequest 请求对象
     * @return CreateResourceTagsResponse
     */
    public CreateResourceTagsResponse createResourceTags(CreateResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.createResourceTags);
    }

    /**
     * 添加资源标签
     *
     * 专业版HiLens控制台标签管理，添加对应资源的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagsRequest 请求对象
     * @return SyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse>
     */
    public SyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse> createResourceTagsInvoker(
        CreateResourceTagsRequest request) {
        return new SyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse>(request,
            HiLensMeta.createResourceTags, hcClient);
    }

    /**
     * 创建密钥
     *
     * 创建密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretRequest 请求对象
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.createSecret);
    }

    /**
     * 创建密钥
     *
     * 创建密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretRequest 请求对象
     * @return SyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public SyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretInvoker(CreateSecretRequest request) {
        return new SyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, HiLensMeta.createSecret, hcClient);
    }

    /**
     * 创建作业
     *
     * 创建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.createTask);
    }

    /**
     * 创建作业
     *
     * 创建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, HiLensMeta.createTask, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建一个工作空间，其中工作空间名不能与已有的重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkSpaceRequest 请求对象
     * @return CreateWorkSpaceResponse
     */
    public CreateWorkSpaceResponse createWorkSpace(CreateWorkSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.createWorkSpace);
    }

    /**
     * 创建工作空间
     *
     * 创建一个工作空间，其中工作空间名不能与已有的重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkSpaceRequest 请求对象
     * @return SyncInvoker<CreateWorkSpaceRequest, CreateWorkSpaceResponse>
     */
    public SyncInvoker<CreateWorkSpaceRequest, CreateWorkSpaceResponse> createWorkSpaceInvoker(
        CreateWorkSpaceRequest request) {
        return new SyncInvoker<CreateWorkSpaceRequest, CreateWorkSpaceResponse>(request, HiLensMeta.createWorkSpace,
            hcClient);
    }

    /**
     * 删除配置项
     *
     * 根据配置项id删除某个配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigMapRequest 请求对象
     * @return DeleteConfigMapResponse
     */
    public DeleteConfigMapResponse deleteConfigMap(DeleteConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.deleteConfigMap);
    }

    /**
     * 删除配置项
     *
     * 根据配置项id删除某个配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigMapRequest 请求对象
     * @return SyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse>
     */
    public SyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse> deleteConfigMapInvoker(
        DeleteConfigMapRequest request) {
        return new SyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse>(request, HiLensMeta.deleteConfigMap,
            hcClient);
    }

    /**
     * 删除应用部署
     *
     * 删除指定应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return DeleteDeploymentResponse
     */
    public DeleteDeploymentResponse deleteDeployment(DeleteDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.deleteDeployment);
    }

    /**
     * 删除应用部署
     *
     * 删除指定应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>
     */
    public SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeploymentInvoker(
        DeleteDeploymentRequest request) {
        return new SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>(request, HiLensMeta.deleteDeployment,
            hcClient);
    }

    /**
     * 删除设备
     *
     * 删除专业版HiLens控制台上的设备，并与端侧的设备进行解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeRequest 请求对象
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.deleteNode);
    }

    /**
     * 删除设备
     *
     * 删除专业版HiLens控制台上的设备，并与端侧的设备进行解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeRequest 请求对象
     * @return SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>
     */
    public SyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeInvoker(DeleteNodeRequest request) {
        return new SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>(request, HiLensMeta.deleteNode, hcClient);
    }

    /**
     * 删除应用实例
     *
     * 删除指定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePodRequest 请求对象
     * @return DeletePodResponse
     */
    public DeletePodResponse deletePod(DeletePodRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.deletePod);
    }

    /**
     * 删除应用实例
     *
     * 删除指定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePodRequest 请求对象
     * @return SyncInvoker<DeletePodRequest, DeletePodResponse>
     */
    public SyncInvoker<DeletePodRequest, DeletePodResponse> deletePodInvoker(DeletePodRequest request) {
        return new SyncInvoker<DeletePodRequest, DeletePodResponse>(request, HiLensMeta.deletePod, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 专业版HiLens控制台标签管理，删除对应资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return DeleteResourceTagResponse
     */
    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.deleteResourceTag);
    }

    /**
     * 删除资源标签
     *
     * 专业版HiLens控制台标签管理，删除对应资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request,
            HiLensMeta.deleteResourceTag, hcClient);
    }

    /**
     * 删除密钥
     *
     * 删除密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretRequest 请求对象
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.deleteSecret);
    }

    /**
     * 删除密钥
     *
     * 删除密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretRequest 请求对象
     * @return SyncInvoker<DeleteSecretRequest, DeleteSecretResponse>
     */
    public SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretInvoker(DeleteSecretRequest request) {
        return new SyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, HiLensMeta.deleteSecret, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.deleteTask);
    }

    /**
     * 删除作业
     *
     * 删除作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, HiLensMeta.deleteTask, hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除指定ID的工作空间，如果该工作空间下仍有资源，则删除会失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkSpaceRequest 请求对象
     * @return DeleteWorkSpaceResponse
     */
    public DeleteWorkSpaceResponse deleteWorkSpace(DeleteWorkSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.deleteWorkSpace);
    }

    /**
     * 删除工作空间
     *
     * 删除指定ID的工作空间，如果该工作空间下仍有资源，则删除会失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkSpaceRequest 请求对象
     * @return SyncInvoker<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse>
     */
    public SyncInvoker<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse> deleteWorkSpaceInvoker(
        DeleteWorkSpaceRequest request) {
        return new SyncInvoker<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse>(request, HiLensMeta.deleteWorkSpace,
            hcClient);
    }

    /**
     * 将激活订单与设备解绑
     *
     * 将激活订单与设备解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeNodeRequest 请求对象
     * @return FreezeNodeResponse
     */
    public FreezeNodeResponse freezeNode(FreezeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.freezeNode);
    }

    /**
     * 将激活订单与设备解绑
     *
     * 将激活订单与设备解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeNodeRequest 请求对象
     * @return SyncInvoker<FreezeNodeRequest, FreezeNodeResponse>
     */
    public SyncInvoker<FreezeNodeRequest, FreezeNodeResponse> freezeNodeInvoker(FreezeNodeRequest request) {
        return new SyncInvoker<FreezeNodeRequest, FreezeNodeResponse>(request, HiLensMeta.freezeNode, hcClient);
    }

    /**
     * 查询配置项列表
     *
     * 获取配置项详情，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigMapsRequest 请求对象
     * @return ListConfigMapsResponse
     */
    public ListConfigMapsResponse listConfigMaps(ListConfigMapsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listConfigMaps);
    }

    /**
     * 查询配置项列表
     *
     * 获取配置项详情，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigMapsRequest 请求对象
     * @return SyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse>
     */
    public SyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse> listConfigMapsInvoker(
        ListConfigMapsRequest request) {
        return new SyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse>(request, HiLensMeta.listConfigMaps,
            hcClient);
    }

    /**
     * 查询固件列表
     *
     * 查看指定固件历史版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirmwaresRequest 请求对象
     * @return ListFirmwaresResponse
     */
    public ListFirmwaresResponse listFirmwares(ListFirmwaresRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listFirmwares);
    }

    /**
     * 查询固件列表
     *
     * 查看指定固件历史版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirmwaresRequest 请求对象
     * @return SyncInvoker<ListFirmwaresRequest, ListFirmwaresResponse>
     */
    public SyncInvoker<ListFirmwaresRequest, ListFirmwaresResponse> listFirmwaresInvoker(ListFirmwaresRequest request) {
        return new SyncInvoker<ListFirmwaresRequest, ListFirmwaresResponse>(request, HiLensMeta.listFirmwares,
            hcClient);
    }

    /**
     * 获取运行服务费订单列表
     *
     * 获取平台管理费列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlatformManagerRequest 请求对象
     * @return ListPlatformManagerResponse
     */
    public ListPlatformManagerResponse listPlatformManager(ListPlatformManagerRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listPlatformManager);
    }

    /**
     * 获取运行服务费订单列表
     *
     * 获取平台管理费列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlatformManagerRequest 请求对象
     * @return SyncInvoker<ListPlatformManagerRequest, ListPlatformManagerResponse>
     */
    public SyncInvoker<ListPlatformManagerRequest, ListPlatformManagerResponse> listPlatformManagerInvoker(
        ListPlatformManagerRequest request) {
        return new SyncInvoker<ListPlatformManagerRequest, ListPlatformManagerResponse>(request,
            HiLensMeta.listPlatformManager, hcClient);
    }

    /**
     * 查询某资源类型的标签
     *
     * 专业版HiLens控制台标签管理，查询某种资源类型的所有标签，返回标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listResourceTags);
    }

    /**
     * 查询某资源类型的标签
     *
     * 专业版HiLens控制台标签管理，查询某种资源类型的所有标签，返回标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
     * @return SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsInvoker(
        ListResourceTagsRequest request) {
        return new SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>(request, HiLensMeta.listResourceTags,
            hcClient);
    }

    /**
     * 查询密钥列表
     *
     * 专业版HiLens控制台密钥管理，根据用户请求条件筛选，查询用户创建的 密钥信息，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretsRequest 请求对象
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listSecrets);
    }

    /**
     * 查询密钥列表
     *
     * 专业版HiLens控制台密钥管理，根据用户请求条件筛选，查询用户创建的 密钥信息，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretsRequest 请求对象
     * @return SyncInvoker<ListSecretsRequest, ListSecretsResponse>
     */
    public SyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsInvoker(ListSecretsRequest request) {
        return new SyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, HiLensMeta.listSecrets, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 查询当前部署下所有作业，返回详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listTasks);
    }

    /**
     * 查询作业列表
     *
     * 查询当前部署下所有作业，返回详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<ListTasksRequest, ListTasksResponse>(request, HiLensMeta.listTasks, hcClient);
    }

    /**
     * 获取工作空间列表
     *
     * 查询用户名下的所有工作空间信息，并返回列表和总条目数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkSpacesRequest 请求对象
     * @return ListWorkSpacesResponse
     */
    public ListWorkSpacesResponse listWorkSpaces(ListWorkSpacesRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listWorkSpaces);
    }

    /**
     * 获取工作空间列表
     *
     * 查询用户名下的所有工作空间信息，并返回列表和总条目数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkSpacesRequest 请求对象
     * @return SyncInvoker<ListWorkSpacesRequest, ListWorkSpacesResponse>
     */
    public SyncInvoker<ListWorkSpacesRequest, ListWorkSpacesResponse> listWorkSpacesInvoker(
        ListWorkSpacesRequest request) {
        return new SyncInvoker<ListWorkSpacesRequest, ListWorkSpacesResponse>(request, HiLensMeta.listWorkSpaces,
            hcClient);
    }

    /**
     * 设置默认订单
     *
     * 设置默认订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDefaultOrderFormRequest 请求对象
     * @return SetDefaultOrderFormResponse
     */
    public SetDefaultOrderFormResponse setDefaultOrderForm(SetDefaultOrderFormRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.setDefaultOrderForm);
    }

    /**
     * 设置默认订单
     *
     * 设置默认订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDefaultOrderFormRequest 请求对象
     * @return SyncInvoker<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse>
     */
    public SyncInvoker<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse> setDefaultOrderFormInvoker(
        SetDefaultOrderFormRequest request) {
        return new SyncInvoker<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse>(request,
            HiLensMeta.setDefaultOrderForm, hcClient);
    }

    /**
     * 查询配置项详情
     *
     * 根据配置项id查询某个配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigMapRequest 请求对象
     * @return ShowConfigMapResponse
     */
    public ShowConfigMapResponse showConfigMap(ShowConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showConfigMap);
    }

    /**
     * 查询配置项详情
     *
     * 根据配置项id查询某个配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigMapRequest 请求对象
     * @return SyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse>
     */
    public SyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse> showConfigMapInvoker(ShowConfigMapRequest request) {
        return new SyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse>(request, HiLensMeta.showConfigMap,
            hcClient);
    }

    /**
     * 查询应用部署详情
     *
     * 获取部署的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentRequest 请求对象
     * @return ShowDeploymentResponse
     */
    public ShowDeploymentResponse showDeployment(ShowDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showDeployment);
    }

    /**
     * 查询应用部署详情
     *
     * 获取部署的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentRequest 请求对象
     * @return SyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse>
     */
    public SyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse> showDeploymentInvoker(
        ShowDeploymentRequest request) {
        return new SyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse>(request, HiLensMeta.showDeployment,
            hcClient);
    }

    /**
     * 查询应用实例列表
     *
     * 获取用户实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentPodsRequest 请求对象
     * @return ShowDeploymentPodsResponse
     */
    public ShowDeploymentPodsResponse showDeploymentPods(ShowDeploymentPodsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showDeploymentPods);
    }

    /**
     * 查询应用实例列表
     *
     * 获取用户实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentPodsRequest 请求对象
     * @return SyncInvoker<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse>
     */
    public SyncInvoker<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse> showDeploymentPodsInvoker(
        ShowDeploymentPodsRequest request) {
        return new SyncInvoker<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse>(request,
            HiLensMeta.showDeploymentPods, hcClient);
    }

    /**
     * 查询应用部署列表
     *
     * 获取部署列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentsRequest 请求对象
     * @return ShowDeploymentsResponse
     */
    public ShowDeploymentsResponse showDeployments(ShowDeploymentsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showDeployments);
    }

    /**
     * 查询应用部署列表
     *
     * 获取部署列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentsRequest 请求对象
     * @return SyncInvoker<ShowDeploymentsRequest, ShowDeploymentsResponse>
     */
    public SyncInvoker<ShowDeploymentsRequest, ShowDeploymentsResponse> showDeploymentsInvoker(
        ShowDeploymentsRequest request) {
        return new SyncInvoker<ShowDeploymentsRequest, ShowDeploymentsResponse>(request, HiLensMeta.showDeployments,
            hcClient);
    }

    /**
     * 查询设备详情
     *
     * 支持查询HiLens专业版控制台上的设备详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return ShowNodeResponse
     */
    public ShowNodeResponse showNode(ShowNodeRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showNode);
    }

    /**
     * 查询设备详情
     *
     * 支持查询HiLens专业版控制台上的设备详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return SyncInvoker<ShowNodeRequest, ShowNodeResponse>
     */
    public SyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeInvoker(ShowNodeRequest request) {
        return new SyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, HiLensMeta.showNode, hcClient);
    }

    /**
     * 获取激活记录列表
     *
     * 获取激活记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeActivationRecordsRequest 请求对象
     * @return ShowNodeActivationRecordsResponse
     */
    public ShowNodeActivationRecordsResponse showNodeActivationRecords(ShowNodeActivationRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showNodeActivationRecords);
    }

    /**
     * 获取激活记录列表
     *
     * 获取激活记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeActivationRecordsRequest 请求对象
     * @return SyncInvoker<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse>
     */
    public SyncInvoker<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse> showNodeActivationRecordsInvoker(
        ShowNodeActivationRecordsRequest request) {
        return new SyncInvoker<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse>(request,
            HiLensMeta.showNodeActivationRecords, hcClient);
    }

    /**
     * 查询设备列表
     *
     * 专业版HiLens控制台设备管理，根据用户请求条件筛选，查询用户注册的设备信息，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodesRequest 请求对象
     * @return ShowNodesResponse
     */
    public ShowNodesResponse showNodes(ShowNodesRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showNodes);
    }

    /**
     * 查询设备列表
     *
     * 专业版HiLens控制台设备管理，根据用户请求条件筛选，查询用户注册的设备信息，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodesRequest 请求对象
     * @return SyncInvoker<ShowNodesRequest, ShowNodesResponse>
     */
    public SyncInvoker<ShowNodesRequest, ShowNodesResponse> showNodesInvoker(ShowNodesRequest request) {
        return new SyncInvoker<ShowNodesRequest, ShowNodesResponse>(request, HiLensMeta.showNodes, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 专业版HiLens控制台标签管理，查询具体资源的标签，返回标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagsRequest 请求对象
     * @return ShowResourceTagsResponse
     */
    public ShowResourceTagsResponse showResourceTags(ShowResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 专业版HiLens控制台标签管理，查询具体资源的标签，返回标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagsRequest 请求对象
     * @return SyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse>
     */
    public SyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTagsInvoker(
        ShowResourceTagsRequest request) {
        return new SyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse>(request, HiLensMeta.showResourceTags,
            hcClient);
    }

    /**
     * 查询密钥详情
     *
     * 查询密钥详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretRequest 请求对象
     * @return ShowSecretResponse
     */
    public ShowSecretResponse showSecret(ShowSecretRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showSecret);
    }

    /**
     * 查询密钥详情
     *
     * 查询密钥详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretRequest 请求对象
     * @return SyncInvoker<ShowSecretRequest, ShowSecretResponse>
     */
    public SyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretInvoker(ShowSecretRequest request) {
        return new SyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, HiLensMeta.showSecret, hcClient);
    }

    /**
     * 获取技能详情
     *
     * 获取技能详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillInfoRequest 请求对象
     * @return ShowSkillInfoResponse
     */
    public ShowSkillInfoResponse showSkillInfo(ShowSkillInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showSkillInfo);
    }

    /**
     * 获取技能详情
     *
     * 获取技能详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillInfoRequest 请求对象
     * @return SyncInvoker<ShowSkillInfoRequest, ShowSkillInfoResponse>
     */
    public SyncInvoker<ShowSkillInfoRequest, ShowSkillInfoResponse> showSkillInfoInvoker(ShowSkillInfoRequest request) {
        return new SyncInvoker<ShowSkillInfoRequest, ShowSkillInfoResponse>(request, HiLensMeta.showSkillInfo,
            hcClient);
    }

    /**
     * 查询技能列表
     *
     * 获取技能列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillListRequest 请求对象
     * @return ShowSkillListResponse
     */
    public ShowSkillListResponse showSkillList(ShowSkillListRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showSkillList);
    }

    /**
     * 查询技能列表
     *
     * 获取技能列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillListRequest 请求对象
     * @return SyncInvoker<ShowSkillListRequest, ShowSkillListResponse>
     */
    public SyncInvoker<ShowSkillListRequest, ShowSkillListResponse> showSkillListInvoker(ShowSkillListRequest request) {
        return new SyncInvoker<ShowSkillListRequest, ShowSkillListResponse>(request, HiLensMeta.showSkillList,
            hcClient);
    }

    /**
     * 查询订单详情
     *
     * 获取订单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillOrderInfoRequest 请求对象
     * @return ShowSkillOrderInfoResponse
     */
    public ShowSkillOrderInfoResponse showSkillOrderInfo(ShowSkillOrderInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showSkillOrderInfo);
    }

    /**
     * 查询订单详情
     *
     * 获取订单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillOrderInfoRequest 请求对象
     * @return SyncInvoker<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse>
     */
    public SyncInvoker<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse> showSkillOrderInfoInvoker(
        ShowSkillOrderInfoRequest request) {
        return new SyncInvoker<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse>(request,
            HiLensMeta.showSkillOrderInfo, hcClient);
    }

    /**
     * 查询订单列表
     *
     * 获取订单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillOrderListRequest 请求对象
     * @return ShowSkillOrderListResponse
     */
    public ShowSkillOrderListResponse showSkillOrderList(ShowSkillOrderListRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showSkillOrderList);
    }

    /**
     * 查询订单列表
     *
     * 获取订单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillOrderListRequest 请求对象
     * @return SyncInvoker<ShowSkillOrderListRequest, ShowSkillOrderListResponse>
     */
    public SyncInvoker<ShowSkillOrderListRequest, ShowSkillOrderListResponse> showSkillOrderListInvoker(
        ShowSkillOrderListRequest request) {
        return new SyncInvoker<ShowSkillOrderListRequest, ShowSkillOrderListResponse>(request,
            HiLensMeta.showSkillOrderList, hcClient);
    }

    /**
     * 查询作业详情
     *
     * 通过作业ID查询作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showTask);
    }

    /**
     * 查询作业详情
     *
     * 通过作业ID查询作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, HiLensMeta.showTask, hcClient);
    }

    /**
     * 获取设备固件升级进度
     *
     * 获取设备固件升级进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeProgressRequest 请求对象
     * @return ShowUpgradeProgressResponse
     */
    public ShowUpgradeProgressResponse showUpgradeProgress(ShowUpgradeProgressRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showUpgradeProgress);
    }

    /**
     * 获取设备固件升级进度
     *
     * 获取设备固件升级进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeProgressRequest 请求对象
     * @return SyncInvoker<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse>
     */
    public SyncInvoker<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse> showUpgradeProgressInvoker(
        ShowUpgradeProgressRequest request) {
        return new SyncInvoker<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse>(request,
            HiLensMeta.showUpgradeProgress, hcClient);
    }

    /**
     * 获取工作空间详情
     *
     * 获取指定workspace_id的工作空间详情，包括创建时间，描述，创建者等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkSpaceRequest 请求对象
     * @return ShowWorkSpaceResponse
     */
    public ShowWorkSpaceResponse showWorkSpace(ShowWorkSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.showWorkSpace);
    }

    /**
     * 获取工作空间详情
     *
     * 获取指定workspace_id的工作空间详情，包括创建时间，描述，创建者等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkSpaceRequest 请求对象
     * @return SyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse>
     */
    public SyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpaceInvoker(ShowWorkSpaceRequest request) {
        return new SyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse>(request, HiLensMeta.showWorkSpace,
            hcClient);
    }

    /**
     * 暂停、继续部署负载
     *
     * 启动/暂停应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAndStopDeploymentRequest 请求对象
     * @return StartAndStopDeploymentResponse
     */
    public StartAndStopDeploymentResponse startAndStopDeployment(StartAndStopDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.startAndStopDeployment);
    }

    /**
     * 暂停、继续部署负载
     *
     * 启动/暂停应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAndStopDeploymentRequest 请求对象
     * @return SyncInvoker<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse>
     */
    public SyncInvoker<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse> startAndStopDeploymentInvoker(
        StartAndStopDeploymentRequest request) {
        return new SyncInvoker<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse>(request,
            HiLensMeta.startAndStopDeployment, hcClient);
    }

    /**
     * 启动/停止部署下的指定实例
     *
     * 启动/停止部署下的指定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAndStopDeploymentPodRequest 请求对象
     * @return StartAndStopDeploymentPodResponse
     */
    public StartAndStopDeploymentPodResponse startAndStopDeploymentPod(StartAndStopDeploymentPodRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.startAndStopDeploymentPod);
    }

    /**
     * 启动/停止部署下的指定实例
     *
     * 启动/停止部署下的指定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAndStopDeploymentPodRequest 请求对象
     * @return SyncInvoker<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse>
     */
    public SyncInvoker<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse> startAndStopDeploymentPodInvoker(
        StartAndStopDeploymentPodRequest request) {
        return new SyncInvoker<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse>(request,
            HiLensMeta.startAndStopDeploymentPod, hcClient);
    }

    /**
     * 启停设备
     *
     * 该API用于启用停用设备。被停用的设备将无法连接到云端服务，重新启用设备恢复连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchNodeConnectionRequest 请求对象
     * @return SwitchNodeConnectionResponse
     */
    public SwitchNodeConnectionResponse switchNodeConnection(SwitchNodeConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.switchNodeConnection);
    }

    /**
     * 启停设备
     *
     * 该API用于启用停用设备。被停用的设备将无法连接到云端服务，重新启用设备恢复连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchNodeConnectionRequest 请求对象
     * @return SyncInvoker<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse>
     */
    public SyncInvoker<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse> switchNodeConnectionInvoker(
        SwitchNodeConnectionRequest request) {
        return new SyncInvoker<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse>(request,
            HiLensMeta.switchNodeConnection, hcClient);
    }

    /**
     * 使用运行服务费激活设备
     *
     * 使用运行服务费激活设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeNodeRequest 请求对象
     * @return UnfreezeNodeResponse
     */
    public UnfreezeNodeResponse unfreezeNode(UnfreezeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.unfreezeNode);
    }

    /**
     * 使用运行服务费激活设备
     *
     * 使用运行服务费激活设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeNodeRequest 请求对象
     * @return SyncInvoker<UnfreezeNodeRequest, UnfreezeNodeResponse>
     */
    public SyncInvoker<UnfreezeNodeRequest, UnfreezeNodeResponse> unfreezeNodeInvoker(UnfreezeNodeRequest request) {
        return new SyncInvoker<UnfreezeNodeRequest, UnfreezeNodeResponse>(request, HiLensMeta.unfreezeNode, hcClient);
    }

    /**
     * 更新配置项
     *
     * 根据配置项id更新配置项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigMapRequest 请求对象
     * @return UpdateConfigMapResponse
     */
    public UpdateConfigMapResponse updateConfigMap(UpdateConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateConfigMap);
    }

    /**
     * 更新配置项
     *
     * 根据配置项id更新配置项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigMapRequest 请求对象
     * @return SyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse>
     */
    public SyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse> updateConfigMapInvoker(
        UpdateConfigMapRequest request) {
        return new SyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse>(request, HiLensMeta.updateConfigMap,
            hcClient);
    }

    /**
     * 更新应用部署
     *
     * 更新应用部署相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentRequest 请求对象
     * @return UpdateDeploymentResponse
     */
    public UpdateDeploymentResponse updateDeployment(UpdateDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateDeployment);
    }

    /**
     * 更新应用部署
     *
     * 更新应用部署相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse>
     */
    public SyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse> updateDeploymentInvoker(
        UpdateDeploymentRequest request) {
        return new SyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse>(request, HiLensMeta.updateDeployment,
            hcClient);
    }

    /**
     * 部分更新应用部署
     *
     * 更新应用部署部分信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentUsingPatchRequest 请求对象
     * @return UpdateDeploymentUsingPatchResponse
     */
    public UpdateDeploymentUsingPatchResponse updateDeploymentUsingPatch(UpdateDeploymentUsingPatchRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateDeploymentUsingPatch);
    }

    /**
     * 部分更新应用部署
     *
     * 更新应用部署部分信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentUsingPatchRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse>
     */
    public SyncInvoker<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse> updateDeploymentUsingPatchInvoker(
        UpdateDeploymentUsingPatchRequest request) {
        return new SyncInvoker<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse>(request,
            HiLensMeta.updateDeploymentUsingPatch, hcClient);
    }

    /**
     * 更新设备信息
     *
     * 更新设备日志配置，标签以及描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeRequest 请求对象
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNode(UpdateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateNode);
    }

    /**
     * 更新设备信息
     *
     * 更新设备日志配置，标签以及描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeRequest 请求对象
     * @return SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>
     */
    public SyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeInvoker(UpdateNodeRequest request) {
        return new SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>(request, HiLensMeta.updateNode, hcClient);
    }

    /**
     * 更新设备证书
     *
     * 设备出现离线或者证书过期时，可通过该接口更新证书，重新让设备连接到云端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeCertRequest 请求对象
     * @return UpdateNodeCertResponse
     */
    public UpdateNodeCertResponse updateNodeCert(UpdateNodeCertRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateNodeCert);
    }

    /**
     * 更新设备证书
     *
     * 设备出现离线或者证书过期时，可通过该接口更新证书，重新让设备连接到云端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeCertRequest 请求对象
     * @return SyncInvoker<UpdateNodeCertRequest, UpdateNodeCertResponse>
     */
    public SyncInvoker<UpdateNodeCertRequest, UpdateNodeCertResponse> updateNodeCertInvoker(
        UpdateNodeCertRequest request) {
        return new SyncInvoker<UpdateNodeCertRequest, UpdateNodeCertResponse>(request, HiLensMeta.updateNodeCert,
            hcClient);
    }

    /**
     * 升级设备固件
     *
     * 升级设备固件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeFirmwareRequest 请求对象
     * @return UpdateNodeFirmwareResponse
     */
    public UpdateNodeFirmwareResponse updateNodeFirmware(UpdateNodeFirmwareRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateNodeFirmware);
    }

    /**
     * 升级设备固件
     *
     * 升级设备固件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeFirmwareRequest 请求对象
     * @return SyncInvoker<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse>
     */
    public SyncInvoker<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse> updateNodeFirmwareInvoker(
        UpdateNodeFirmwareRequest request) {
        return new SyncInvoker<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse>(request,
            HiLensMeta.updateNodeFirmware, hcClient);
    }

    /**
     * 更新密钥
     *
     * 更新密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretRequest 请求对象
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateSecret);
    }

    /**
     * 更新密钥
     *
     * 更新密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretRequest 请求对象
     * @return SyncInvoker<UpdateSecretRequest, UpdateSecretResponse>
     */
    public SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretInvoker(UpdateSecretRequest request) {
        return new SyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, HiLensMeta.updateSecret, hcClient);
    }

    /**
     * 编辑作业
     *
     * 编辑作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateTask);
    }

    /**
     * 编辑作业
     *
     * 编辑作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, HiLensMeta.updateTask, hcClient);
    }

    /**
     * 修改工作空间
     *
     * 更改工作空间信息，暂时只能更改描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkSpaceRequest 请求对象
     * @return UpdateWorkSpaceResponse
     */
    public UpdateWorkSpaceResponse updateWorkSpace(UpdateWorkSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.updateWorkSpace);
    }

    /**
     * 修改工作空间
     *
     * 更改工作空间信息，暂时只能更改描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkSpaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse>
     */
    public SyncInvoker<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse> updateWorkSpaceInvoker(
        UpdateWorkSpaceRequest request) {
        return new SyncInvoker<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse>(request, HiLensMeta.updateWorkSpace,
            hcClient);
    }

}
