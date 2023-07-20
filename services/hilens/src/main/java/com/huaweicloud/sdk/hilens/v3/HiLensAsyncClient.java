package com.huaweicloud.sdk.hilens.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class HiLensAsyncClient {

    protected HcClient hcClient;

    public HiLensAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HiLensAsyncClient> newBuilder() {
        ClientBuilder<HiLensAsyncClient> clientBuilder = new ClientBuilder<>(HiLensAsyncClient::new);
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
     * @return CompletableFuture<AddDeploymentNodesResponse>
     */
    public CompletableFuture<AddDeploymentNodesResponse> addDeploymentNodesAsync(AddDeploymentNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.addDeploymentNodes);
    }

    /**
     * 批量部署
     *
     * 通过指定设备id列表或者设备标签将应用部署下发到多个设备上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeploymentNodesRequest 请求对象
     * @return AsyncInvoker<AddDeploymentNodesRequest, AddDeploymentNodesResponse>
     */
    public AsyncInvoker<AddDeploymentNodesRequest, AddDeploymentNodesResponse> addDeploymentNodesAsyncInvoker(
        AddDeploymentNodesRequest request) {
        return new AsyncInvoker<AddDeploymentNodesRequest, AddDeploymentNodesResponse>(request,
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
     * @return CompletableFuture<BatchCreateNodeTagsResponse>
     */
    public CompletableFuture<BatchCreateNodeTagsResponse> batchCreateNodeTagsAsync(BatchCreateNodeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.batchCreateNodeTags);
    }

    /**
     * 批量添加节点标签
     *
     * 专业版HiLens控制台标签管理，用户选择多个设备，批量添加多个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateNodeTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse>
     */
    public AsyncInvoker<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse> batchCreateNodeTagsAsyncInvoker(
        BatchCreateNodeTagsRequest request) {
        return new AsyncInvoker<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse>(request,
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
     * @return CompletableFuture<CreateConfigMapResponse>
     */
    public CompletableFuture<CreateConfigMapResponse> createConfigMapAsync(CreateConfigMapRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.createConfigMap);
    }

    /**
     * 创建配置项
     *
     * 创建配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigMapRequest 请求对象
     * @return AsyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse>
     */
    public AsyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse> createConfigMapAsyncInvoker(
        CreateConfigMapRequest request) {
        return new AsyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse>(request, HiLensMeta.createConfigMap,
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
     * @return CompletableFuture<CreateDeploymentResponse>
     */
    public CompletableFuture<CreateDeploymentResponse> createDeploymentAsync(CreateDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.createDeployment);
    }

    /**
     * 创建应用部署
     *
     * 创建应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>
     */
    public AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse> createDeploymentAsyncInvoker(
        CreateDeploymentRequest request) {
        return new AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>(request, HiLensMeta.createDeployment,
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
     * @return CompletableFuture<CreateNodeResponse>
     */
    public CompletableFuture<CreateNodeResponse> createNodeAsync(CreateNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.createNode);
    }

    /**
     * 注册设备
     *
     * 填写设备信息，将设备注册到HiLens专业版控制台上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeRequest 请求对象
     * @return AsyncInvoker<CreateNodeRequest, CreateNodeResponse>
     */
    public AsyncInvoker<CreateNodeRequest, CreateNodeResponse> createNodeAsyncInvoker(CreateNodeRequest request) {
        return new AsyncInvoker<CreateNodeRequest, CreateNodeResponse>(request, HiLensMeta.createNode, hcClient);
    }

    /**
     * 创建免费技能订单
     *
     * 创建免费技能订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrderFormRequest 请求对象
     * @return CompletableFuture<CreateOrderFormResponse>
     */
    public CompletableFuture<CreateOrderFormResponse> createOrderFormAsync(CreateOrderFormRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.createOrderForm);
    }

    /**
     * 创建免费技能订单
     *
     * 创建免费技能订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrderFormRequest 请求对象
     * @return AsyncInvoker<CreateOrderFormRequest, CreateOrderFormResponse>
     */
    public AsyncInvoker<CreateOrderFormRequest, CreateOrderFormResponse> createOrderFormAsyncInvoker(
        CreateOrderFormRequest request) {
        return new AsyncInvoker<CreateOrderFormRequest, CreateOrderFormResponse>(request, HiLensMeta.createOrderForm,
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
     * @return CompletableFuture<CreateResourceTagsResponse>
     */
    public CompletableFuture<CreateResourceTagsResponse> createResourceTagsAsync(CreateResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.createResourceTags);
    }

    /**
     * 添加资源标签
     *
     * 专业版HiLens控制台标签管理，添加对应资源的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagsRequest 请求对象
     * @return AsyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse>
     */
    public AsyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse> createResourceTagsAsyncInvoker(
        CreateResourceTagsRequest request) {
        return new AsyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse>(request,
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
     * @return CompletableFuture<CreateSecretResponse>
     */
    public CompletableFuture<CreateSecretResponse> createSecretAsync(CreateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.createSecret);
    }

    /**
     * 创建密钥
     *
     * 创建密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretRequest 请求对象
     * @return AsyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public AsyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretAsyncInvoker(
        CreateSecretRequest request) {
        return new AsyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, HiLensMeta.createSecret, hcClient);
    }

    /**
     * 创建作业
     *
     * 创建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.createTask);
    }

    /**
     * 创建作业
     *
     * 创建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, HiLensMeta.createTask, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建一个工作空间，其中工作空间名不能与已有的重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkSpaceRequest 请求对象
     * @return CompletableFuture<CreateWorkSpaceResponse>
     */
    public CompletableFuture<CreateWorkSpaceResponse> createWorkSpaceAsync(CreateWorkSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.createWorkSpace);
    }

    /**
     * 创建工作空间
     *
     * 创建一个工作空间，其中工作空间名不能与已有的重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkSpaceRequest 请求对象
     * @return AsyncInvoker<CreateWorkSpaceRequest, CreateWorkSpaceResponse>
     */
    public AsyncInvoker<CreateWorkSpaceRequest, CreateWorkSpaceResponse> createWorkSpaceAsyncInvoker(
        CreateWorkSpaceRequest request) {
        return new AsyncInvoker<CreateWorkSpaceRequest, CreateWorkSpaceResponse>(request, HiLensMeta.createWorkSpace,
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
     * @return CompletableFuture<DeleteConfigMapResponse>
     */
    public CompletableFuture<DeleteConfigMapResponse> deleteConfigMapAsync(DeleteConfigMapRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.deleteConfigMap);
    }

    /**
     * 删除配置项
     *
     * 根据配置项id删除某个配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigMapRequest 请求对象
     * @return AsyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse>
     */
    public AsyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse> deleteConfigMapAsyncInvoker(
        DeleteConfigMapRequest request) {
        return new AsyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse>(request, HiLensMeta.deleteConfigMap,
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
     * @return CompletableFuture<DeleteDeploymentResponse>
     */
    public CompletableFuture<DeleteDeploymentResponse> deleteDeploymentAsync(DeleteDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.deleteDeployment);
    }

    /**
     * 删除应用部署
     *
     * 删除指定应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>
     */
    public AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeploymentAsyncInvoker(
        DeleteDeploymentRequest request) {
        return new AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>(request, HiLensMeta.deleteDeployment,
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
     * @return CompletableFuture<DeleteNodeResponse>
     */
    public CompletableFuture<DeleteNodeResponse> deleteNodeAsync(DeleteNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.deleteNode);
    }

    /**
     * 删除设备
     *
     * 删除专业版HiLens控制台上的设备，并与端侧的设备进行解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeRequest 请求对象
     * @return AsyncInvoker<DeleteNodeRequest, DeleteNodeResponse>
     */
    public AsyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeAsyncInvoker(DeleteNodeRequest request) {
        return new AsyncInvoker<DeleteNodeRequest, DeleteNodeResponse>(request, HiLensMeta.deleteNode, hcClient);
    }

    /**
     * 删除应用实例
     *
     * 删除指定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePodRequest 请求对象
     * @return CompletableFuture<DeletePodResponse>
     */
    public CompletableFuture<DeletePodResponse> deletePodAsync(DeletePodRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.deletePod);
    }

    /**
     * 删除应用实例
     *
     * 删除指定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePodRequest 请求对象
     * @return AsyncInvoker<DeletePodRequest, DeletePodResponse>
     */
    public AsyncInvoker<DeletePodRequest, DeletePodResponse> deletePodAsyncInvoker(DeletePodRequest request) {
        return new AsyncInvoker<DeletePodRequest, DeletePodResponse>(request, HiLensMeta.deletePod, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 专业版HiLens控制台标签管理，删除对应资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return CompletableFuture<DeleteResourceTagResponse>
     */
    public CompletableFuture<DeleteResourceTagResponse> deleteResourceTagAsync(DeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.deleteResourceTag);
    }

    /**
     * 删除资源标签
     *
     * 专业版HiLens控制台标签管理，删除对应资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request,
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
     * @return CompletableFuture<DeleteSecretResponse>
     */
    public CompletableFuture<DeleteSecretResponse> deleteSecretAsync(DeleteSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.deleteSecret);
    }

    /**
     * 删除密钥
     *
     * 删除密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretRequest 请求对象
     * @return AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse>
     */
    public AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretAsyncInvoker(
        DeleteSecretRequest request) {
        return new AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, HiLensMeta.deleteSecret, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.deleteTask);
    }

    /**
     * 删除作业
     *
     * 删除作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, HiLensMeta.deleteTask, hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除指定ID的工作空间，如果该工作空间下仍有资源，则删除会失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkSpaceRequest 请求对象
     * @return CompletableFuture<DeleteWorkSpaceResponse>
     */
    public CompletableFuture<DeleteWorkSpaceResponse> deleteWorkSpaceAsync(DeleteWorkSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.deleteWorkSpace);
    }

    /**
     * 删除工作空间
     *
     * 删除指定ID的工作空间，如果该工作空间下仍有资源，则删除会失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkSpaceRequest 请求对象
     * @return AsyncInvoker<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse>
     */
    public AsyncInvoker<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse> deleteWorkSpaceAsyncInvoker(
        DeleteWorkSpaceRequest request) {
        return new AsyncInvoker<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse>(request, HiLensMeta.deleteWorkSpace,
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
     * @return CompletableFuture<FreezeNodeResponse>
     */
    public CompletableFuture<FreezeNodeResponse> freezeNodeAsync(FreezeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.freezeNode);
    }

    /**
     * 将激活订单与设备解绑
     *
     * 将激活订单与设备解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeNodeRequest 请求对象
     * @return AsyncInvoker<FreezeNodeRequest, FreezeNodeResponse>
     */
    public AsyncInvoker<FreezeNodeRequest, FreezeNodeResponse> freezeNodeAsyncInvoker(FreezeNodeRequest request) {
        return new AsyncInvoker<FreezeNodeRequest, FreezeNodeResponse>(request, HiLensMeta.freezeNode, hcClient);
    }

    /**
     * 查询配置项列表
     *
     * 获取配置项详情，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigMapsRequest 请求对象
     * @return CompletableFuture<ListConfigMapsResponse>
     */
    public CompletableFuture<ListConfigMapsResponse> listConfigMapsAsync(ListConfigMapsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listConfigMaps);
    }

    /**
     * 查询配置项列表
     *
     * 获取配置项详情，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigMapsRequest 请求对象
     * @return AsyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse>
     */
    public AsyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse> listConfigMapsAsyncInvoker(
        ListConfigMapsRequest request) {
        return new AsyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse>(request, HiLensMeta.listConfigMaps,
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
     * @return CompletableFuture<ListFirmwaresResponse>
     */
    public CompletableFuture<ListFirmwaresResponse> listFirmwaresAsync(ListFirmwaresRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listFirmwares);
    }

    /**
     * 查询固件列表
     *
     * 查看指定固件历史版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirmwaresRequest 请求对象
     * @return AsyncInvoker<ListFirmwaresRequest, ListFirmwaresResponse>
     */
    public AsyncInvoker<ListFirmwaresRequest, ListFirmwaresResponse> listFirmwaresAsyncInvoker(
        ListFirmwaresRequest request) {
        return new AsyncInvoker<ListFirmwaresRequest, ListFirmwaresResponse>(request, HiLensMeta.listFirmwares,
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
     * @return CompletableFuture<ListPlatformManagerResponse>
     */
    public CompletableFuture<ListPlatformManagerResponse> listPlatformManagerAsync(ListPlatformManagerRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listPlatformManager);
    }

    /**
     * 获取运行服务费订单列表
     *
     * 获取平台管理费列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlatformManagerRequest 请求对象
     * @return AsyncInvoker<ListPlatformManagerRequest, ListPlatformManagerResponse>
     */
    public AsyncInvoker<ListPlatformManagerRequest, ListPlatformManagerResponse> listPlatformManagerAsyncInvoker(
        ListPlatformManagerRequest request) {
        return new AsyncInvoker<ListPlatformManagerRequest, ListPlatformManagerResponse>(request,
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
     * @return CompletableFuture<ListResourceTagsResponse>
     */
    public CompletableFuture<ListResourceTagsResponse> listResourceTagsAsync(ListResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listResourceTags);
    }

    /**
     * 查询某资源类型的标签
     *
     * 专业版HiLens控制台标签管理，查询某种资源类型的所有标签，返回标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>(request, HiLensMeta.listResourceTags,
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
     * @return CompletableFuture<ListSecretsResponse>
     */
    public CompletableFuture<ListSecretsResponse> listSecretsAsync(ListSecretsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listSecrets);
    }

    /**
     * 查询密钥列表
     *
     * 专业版HiLens控制台密钥管理，根据用户请求条件筛选，查询用户创建的 密钥信息，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretsRequest 请求对象
     * @return AsyncInvoker<ListSecretsRequest, ListSecretsResponse>
     */
    public AsyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsAsyncInvoker(ListSecretsRequest request) {
        return new AsyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, HiLensMeta.listSecrets, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 查询当前部署下所有作业，返回详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listTasks);
    }

    /**
     * 查询作业列表
     *
     * 查询当前部署下所有作业，返回详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<ListTasksRequest, ListTasksResponse>(request, HiLensMeta.listTasks, hcClient);
    }

    /**
     * 获取工作空间列表
     *
     * 查询用户名下的所有工作空间信息，并返回列表和总条目数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkSpacesRequest 请求对象
     * @return CompletableFuture<ListWorkSpacesResponse>
     */
    public CompletableFuture<ListWorkSpacesResponse> listWorkSpacesAsync(ListWorkSpacesRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listWorkSpaces);
    }

    /**
     * 获取工作空间列表
     *
     * 查询用户名下的所有工作空间信息，并返回列表和总条目数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkSpacesRequest 请求对象
     * @return AsyncInvoker<ListWorkSpacesRequest, ListWorkSpacesResponse>
     */
    public AsyncInvoker<ListWorkSpacesRequest, ListWorkSpacesResponse> listWorkSpacesAsyncInvoker(
        ListWorkSpacesRequest request) {
        return new AsyncInvoker<ListWorkSpacesRequest, ListWorkSpacesResponse>(request, HiLensMeta.listWorkSpaces,
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
     * @return CompletableFuture<SetDefaultOrderFormResponse>
     */
    public CompletableFuture<SetDefaultOrderFormResponse> setDefaultOrderFormAsync(SetDefaultOrderFormRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.setDefaultOrderForm);
    }

    /**
     * 设置默认订单
     *
     * 设置默认订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDefaultOrderFormRequest 请求对象
     * @return AsyncInvoker<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse>
     */
    public AsyncInvoker<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse> setDefaultOrderFormAsyncInvoker(
        SetDefaultOrderFormRequest request) {
        return new AsyncInvoker<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse>(request,
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
     * @return CompletableFuture<ShowConfigMapResponse>
     */
    public CompletableFuture<ShowConfigMapResponse> showConfigMapAsync(ShowConfigMapRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showConfigMap);
    }

    /**
     * 查询配置项详情
     *
     * 根据配置项id查询某个配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigMapRequest 请求对象
     * @return AsyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse>
     */
    public AsyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse> showConfigMapAsyncInvoker(
        ShowConfigMapRequest request) {
        return new AsyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse>(request, HiLensMeta.showConfigMap,
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
     * @return CompletableFuture<ShowDeploymentResponse>
     */
    public CompletableFuture<ShowDeploymentResponse> showDeploymentAsync(ShowDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showDeployment);
    }

    /**
     * 查询应用部署详情
     *
     * 获取部署的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse>
     */
    public AsyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse> showDeploymentAsyncInvoker(
        ShowDeploymentRequest request) {
        return new AsyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse>(request, HiLensMeta.showDeployment,
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
     * @return CompletableFuture<ShowDeploymentPodsResponse>
     */
    public CompletableFuture<ShowDeploymentPodsResponse> showDeploymentPodsAsync(ShowDeploymentPodsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showDeploymentPods);
    }

    /**
     * 查询应用实例列表
     *
     * 获取用户实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentPodsRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse>
     */
    public AsyncInvoker<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse> showDeploymentPodsAsyncInvoker(
        ShowDeploymentPodsRequest request) {
        return new AsyncInvoker<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse>(request,
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
     * @return CompletableFuture<ShowDeploymentsResponse>
     */
    public CompletableFuture<ShowDeploymentsResponse> showDeploymentsAsync(ShowDeploymentsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showDeployments);
    }

    /**
     * 查询应用部署列表
     *
     * 获取部署列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentsRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentsRequest, ShowDeploymentsResponse>
     */
    public AsyncInvoker<ShowDeploymentsRequest, ShowDeploymentsResponse> showDeploymentsAsyncInvoker(
        ShowDeploymentsRequest request) {
        return new AsyncInvoker<ShowDeploymentsRequest, ShowDeploymentsResponse>(request, HiLensMeta.showDeployments,
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
     * @return CompletableFuture<ShowNodeResponse>
     */
    public CompletableFuture<ShowNodeResponse> showNodeAsync(ShowNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showNode);
    }

    /**
     * 查询设备详情
     *
     * 支持查询HiLens专业版控制台上的设备详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return AsyncInvoker<ShowNodeRequest, ShowNodeResponse>
     */
    public AsyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeAsyncInvoker(ShowNodeRequest request) {
        return new AsyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, HiLensMeta.showNode, hcClient);
    }

    /**
     * 获取激活记录列表
     *
     * 获取激活记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeActivationRecordsRequest 请求对象
     * @return CompletableFuture<ShowNodeActivationRecordsResponse>
     */
    public CompletableFuture<ShowNodeActivationRecordsResponse> showNodeActivationRecordsAsync(
        ShowNodeActivationRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showNodeActivationRecords);
    }

    /**
     * 获取激活记录列表
     *
     * 获取激活记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeActivationRecordsRequest 请求对象
     * @return AsyncInvoker<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse>
     */
    public AsyncInvoker<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse> showNodeActivationRecordsAsyncInvoker(
        ShowNodeActivationRecordsRequest request) {
        return new AsyncInvoker<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse>(request,
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
     * @return CompletableFuture<ShowNodesResponse>
     */
    public CompletableFuture<ShowNodesResponse> showNodesAsync(ShowNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showNodes);
    }

    /**
     * 查询设备列表
     *
     * 专业版HiLens控制台设备管理，根据用户请求条件筛选，查询用户注册的设备信息，以列表形式返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodesRequest 请求对象
     * @return AsyncInvoker<ShowNodesRequest, ShowNodesResponse>
     */
    public AsyncInvoker<ShowNodesRequest, ShowNodesResponse> showNodesAsyncInvoker(ShowNodesRequest request) {
        return new AsyncInvoker<ShowNodesRequest, ShowNodesResponse>(request, HiLensMeta.showNodes, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 专业版HiLens控制台标签管理，查询具体资源的标签，返回标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagsRequest 请求对象
     * @return CompletableFuture<ShowResourceTagsResponse>
     */
    public CompletableFuture<ShowResourceTagsResponse> showResourceTagsAsync(ShowResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 专业版HiLens控制台标签管理，查询具体资源的标签，返回标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagsRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse>
     */
    public AsyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTagsAsyncInvoker(
        ShowResourceTagsRequest request) {
        return new AsyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse>(request, HiLensMeta.showResourceTags,
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
     * @return CompletableFuture<ShowSecretResponse>
     */
    public CompletableFuture<ShowSecretResponse> showSecretAsync(ShowSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showSecret);
    }

    /**
     * 查询密钥详情
     *
     * 查询密钥详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretRequest 请求对象
     * @return AsyncInvoker<ShowSecretRequest, ShowSecretResponse>
     */
    public AsyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretAsyncInvoker(ShowSecretRequest request) {
        return new AsyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, HiLensMeta.showSecret, hcClient);
    }

    /**
     * 获取技能详情
     *
     * 获取技能详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillInfoRequest 请求对象
     * @return CompletableFuture<ShowSkillInfoResponse>
     */
    public CompletableFuture<ShowSkillInfoResponse> showSkillInfoAsync(ShowSkillInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showSkillInfo);
    }

    /**
     * 获取技能详情
     *
     * 获取技能详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillInfoRequest 请求对象
     * @return AsyncInvoker<ShowSkillInfoRequest, ShowSkillInfoResponse>
     */
    public AsyncInvoker<ShowSkillInfoRequest, ShowSkillInfoResponse> showSkillInfoAsyncInvoker(
        ShowSkillInfoRequest request) {
        return new AsyncInvoker<ShowSkillInfoRequest, ShowSkillInfoResponse>(request, HiLensMeta.showSkillInfo,
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
     * @return CompletableFuture<ShowSkillListResponse>
     */
    public CompletableFuture<ShowSkillListResponse> showSkillListAsync(ShowSkillListRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showSkillList);
    }

    /**
     * 查询技能列表
     *
     * 获取技能列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillListRequest 请求对象
     * @return AsyncInvoker<ShowSkillListRequest, ShowSkillListResponse>
     */
    public AsyncInvoker<ShowSkillListRequest, ShowSkillListResponse> showSkillListAsyncInvoker(
        ShowSkillListRequest request) {
        return new AsyncInvoker<ShowSkillListRequest, ShowSkillListResponse>(request, HiLensMeta.showSkillList,
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
     * @return CompletableFuture<ShowSkillOrderInfoResponse>
     */
    public CompletableFuture<ShowSkillOrderInfoResponse> showSkillOrderInfoAsync(ShowSkillOrderInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showSkillOrderInfo);
    }

    /**
     * 查询订单详情
     *
     * 获取订单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillOrderInfoRequest 请求对象
     * @return AsyncInvoker<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse>
     */
    public AsyncInvoker<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse> showSkillOrderInfoAsyncInvoker(
        ShowSkillOrderInfoRequest request) {
        return new AsyncInvoker<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse>(request,
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
     * @return CompletableFuture<ShowSkillOrderListResponse>
     */
    public CompletableFuture<ShowSkillOrderListResponse> showSkillOrderListAsync(ShowSkillOrderListRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showSkillOrderList);
    }

    /**
     * 查询订单列表
     *
     * 获取订单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSkillOrderListRequest 请求对象
     * @return AsyncInvoker<ShowSkillOrderListRequest, ShowSkillOrderListResponse>
     */
    public AsyncInvoker<ShowSkillOrderListRequest, ShowSkillOrderListResponse> showSkillOrderListAsyncInvoker(
        ShowSkillOrderListRequest request) {
        return new AsyncInvoker<ShowSkillOrderListRequest, ShowSkillOrderListResponse>(request,
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
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showTask);
    }

    /**
     * 查询作业详情
     *
     * 通过作业ID查询作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, HiLensMeta.showTask, hcClient);
    }

    /**
     * 获取设备固件升级进度
     *
     * 获取设备固件升级进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeProgressRequest 请求对象
     * @return CompletableFuture<ShowUpgradeProgressResponse>
     */
    public CompletableFuture<ShowUpgradeProgressResponse> showUpgradeProgressAsync(ShowUpgradeProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showUpgradeProgress);
    }

    /**
     * 获取设备固件升级进度
     *
     * 获取设备固件升级进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeProgressRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse>
     */
    public AsyncInvoker<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse> showUpgradeProgressAsyncInvoker(
        ShowUpgradeProgressRequest request) {
        return new AsyncInvoker<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse>(request,
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
     * @return CompletableFuture<ShowWorkSpaceResponse>
     */
    public CompletableFuture<ShowWorkSpaceResponse> showWorkSpaceAsync(ShowWorkSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.showWorkSpace);
    }

    /**
     * 获取工作空间详情
     *
     * 获取指定workspace_id的工作空间详情，包括创建时间，描述，创建者等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkSpaceRequest 请求对象
     * @return AsyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse>
     */
    public AsyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpaceAsyncInvoker(
        ShowWorkSpaceRequest request) {
        return new AsyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse>(request, HiLensMeta.showWorkSpace,
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
     * @return CompletableFuture<StartAndStopDeploymentResponse>
     */
    public CompletableFuture<StartAndStopDeploymentResponse> startAndStopDeploymentAsync(
        StartAndStopDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.startAndStopDeployment);
    }

    /**
     * 暂停、继续部署负载
     *
     * 启动/暂停应用部署。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAndStopDeploymentRequest 请求对象
     * @return AsyncInvoker<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse>
     */
    public AsyncInvoker<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse> startAndStopDeploymentAsyncInvoker(
        StartAndStopDeploymentRequest request) {
        return new AsyncInvoker<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse>(request,
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
     * @return CompletableFuture<StartAndStopDeploymentPodResponse>
     */
    public CompletableFuture<StartAndStopDeploymentPodResponse> startAndStopDeploymentPodAsync(
        StartAndStopDeploymentPodRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.startAndStopDeploymentPod);
    }

    /**
     * 启动/停止部署下的指定实例
     *
     * 启动/停止部署下的指定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAndStopDeploymentPodRequest 请求对象
     * @return AsyncInvoker<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse>
     */
    public AsyncInvoker<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse> startAndStopDeploymentPodAsyncInvoker(
        StartAndStopDeploymentPodRequest request) {
        return new AsyncInvoker<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse>(request,
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
     * @return CompletableFuture<SwitchNodeConnectionResponse>
     */
    public CompletableFuture<SwitchNodeConnectionResponse> switchNodeConnectionAsync(
        SwitchNodeConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.switchNodeConnection);
    }

    /**
     * 启停设备
     *
     * 该API用于启用停用设备。被停用的设备将无法连接到云端服务，重新启用设备恢复连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchNodeConnectionRequest 请求对象
     * @return AsyncInvoker<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse>
     */
    public AsyncInvoker<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse> switchNodeConnectionAsyncInvoker(
        SwitchNodeConnectionRequest request) {
        return new AsyncInvoker<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse>(request,
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
     * @return CompletableFuture<UnfreezeNodeResponse>
     */
    public CompletableFuture<UnfreezeNodeResponse> unfreezeNodeAsync(UnfreezeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.unfreezeNode);
    }

    /**
     * 使用运行服务费激活设备
     *
     * 使用运行服务费激活设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeNodeRequest 请求对象
     * @return AsyncInvoker<UnfreezeNodeRequest, UnfreezeNodeResponse>
     */
    public AsyncInvoker<UnfreezeNodeRequest, UnfreezeNodeResponse> unfreezeNodeAsyncInvoker(
        UnfreezeNodeRequest request) {
        return new AsyncInvoker<UnfreezeNodeRequest, UnfreezeNodeResponse>(request, HiLensMeta.unfreezeNode, hcClient);
    }

    /**
     * 更新配置项
     *
     * 根据配置项id更新配置项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigMapRequest 请求对象
     * @return CompletableFuture<UpdateConfigMapResponse>
     */
    public CompletableFuture<UpdateConfigMapResponse> updateConfigMapAsync(UpdateConfigMapRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateConfigMap);
    }

    /**
     * 更新配置项
     *
     * 根据配置项id更新配置项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigMapRequest 请求对象
     * @return AsyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse>
     */
    public AsyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse> updateConfigMapAsyncInvoker(
        UpdateConfigMapRequest request) {
        return new AsyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse>(request, HiLensMeta.updateConfigMap,
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
     * @return CompletableFuture<UpdateDeploymentResponse>
     */
    public CompletableFuture<UpdateDeploymentResponse> updateDeploymentAsync(UpdateDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateDeployment);
    }

    /**
     * 更新应用部署
     *
     * 更新应用部署相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse>
     */
    public AsyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse> updateDeploymentAsyncInvoker(
        UpdateDeploymentRequest request) {
        return new AsyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse>(request, HiLensMeta.updateDeployment,
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
     * @return CompletableFuture<UpdateDeploymentUsingPatchResponse>
     */
    public CompletableFuture<UpdateDeploymentUsingPatchResponse> updateDeploymentUsingPatchAsync(
        UpdateDeploymentUsingPatchRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateDeploymentUsingPatch);
    }

    /**
     * 部分更新应用部署
     *
     * 更新应用部署部分信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentUsingPatchRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse>
     */
    public AsyncInvoker<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse> updateDeploymentUsingPatchAsyncInvoker(
        UpdateDeploymentUsingPatchRequest request) {
        return new AsyncInvoker<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse>(request,
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
     * @return CompletableFuture<UpdateNodeResponse>
     */
    public CompletableFuture<UpdateNodeResponse> updateNodeAsync(UpdateNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateNode);
    }

    /**
     * 更新设备信息
     *
     * 更新设备日志配置，标签以及描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeRequest 请求对象
     * @return AsyncInvoker<UpdateNodeRequest, UpdateNodeResponse>
     */
    public AsyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeAsyncInvoker(UpdateNodeRequest request) {
        return new AsyncInvoker<UpdateNodeRequest, UpdateNodeResponse>(request, HiLensMeta.updateNode, hcClient);
    }

    /**
     * 更新设备证书
     *
     * 设备出现离线或者证书过期时，可通过该接口更新证书，重新让设备连接到云端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeCertRequest 请求对象
     * @return CompletableFuture<UpdateNodeCertResponse>
     */
    public CompletableFuture<UpdateNodeCertResponse> updateNodeCertAsync(UpdateNodeCertRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateNodeCert);
    }

    /**
     * 更新设备证书
     *
     * 设备出现离线或者证书过期时，可通过该接口更新证书，重新让设备连接到云端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeCertRequest 请求对象
     * @return AsyncInvoker<UpdateNodeCertRequest, UpdateNodeCertResponse>
     */
    public AsyncInvoker<UpdateNodeCertRequest, UpdateNodeCertResponse> updateNodeCertAsyncInvoker(
        UpdateNodeCertRequest request) {
        return new AsyncInvoker<UpdateNodeCertRequest, UpdateNodeCertResponse>(request, HiLensMeta.updateNodeCert,
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
     * @return CompletableFuture<UpdateNodeFirmwareResponse>
     */
    public CompletableFuture<UpdateNodeFirmwareResponse> updateNodeFirmwareAsync(UpdateNodeFirmwareRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateNodeFirmware);
    }

    /**
     * 升级设备固件
     *
     * 升级设备固件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeFirmwareRequest 请求对象
     * @return AsyncInvoker<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse>
     */
    public AsyncInvoker<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse> updateNodeFirmwareAsyncInvoker(
        UpdateNodeFirmwareRequest request) {
        return new AsyncInvoker<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse>(request,
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
     * @return CompletableFuture<UpdateSecretResponse>
     */
    public CompletableFuture<UpdateSecretResponse> updateSecretAsync(UpdateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateSecret);
    }

    /**
     * 更新密钥
     *
     * 更新密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretRequest 请求对象
     * @return AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse>
     */
    public AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretAsyncInvoker(
        UpdateSecretRequest request) {
        return new AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, HiLensMeta.updateSecret, hcClient);
    }

    /**
     * 编辑作业
     *
     * 编辑作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse>
     */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateTask);
    }

    /**
     * 编辑作业
     *
     * 编辑作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, HiLensMeta.updateTask, hcClient);
    }

    /**
     * 修改工作空间
     *
     * 更改工作空间信息，暂时只能更改描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkSpaceRequest 请求对象
     * @return CompletableFuture<UpdateWorkSpaceResponse>
     */
    public CompletableFuture<UpdateWorkSpaceResponse> updateWorkSpaceAsync(UpdateWorkSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.updateWorkSpace);
    }

    /**
     * 修改工作空间
     *
     * 更改工作空间信息，暂时只能更改描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkSpaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse>
     */
    public AsyncInvoker<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse> updateWorkSpaceAsyncInvoker(
        UpdateWorkSpaceRequest request) {
        return new AsyncInvoker<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse>(request, HiLensMeta.updateWorkSpace,
            hcClient);
    }

}
