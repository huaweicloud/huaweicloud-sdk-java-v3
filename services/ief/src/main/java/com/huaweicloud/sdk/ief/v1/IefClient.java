package com.huaweicloud.sdk.ief.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ief.v1.model.BatchAddDeleteTagsRequest;
import com.huaweicloud.sdk.ief.v1.model.BatchAddDeleteTagsResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateAppVersionsRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateAppVersionsResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateConfigMapRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateConfigMapResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateDeploymentsRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateDeploymentsResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateDeviceTemplateRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateDeviceTemplateResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeGroupCertRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeGroupCertResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeGroupRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeGroupResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeNodeCertsRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeNodeCertsResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeNodeRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeNodeResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateNodeEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateNodeEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateProductRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateProductResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateRuleRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateRuleResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateSecretRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateSecretResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateSystemEventRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateSystemEventResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateTagRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateTagResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteAppVersionRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteAppVersionResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteConfigMapRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteConfigMapResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeploymentRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeploymentResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeviceTemplateRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeviceTemplateResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeGroupCertRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeGroupCertResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeGroupRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeGroupResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeNodeCertsRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeNodeCertsResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeNodeRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeNodeResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEndPointRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEndPointResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteNodeEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteNodeEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.DeletePodRequest;
import com.huaweicloud.sdk.ief.v1.model.DeletePodResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteProductRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteProductResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteRuleRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteRuleResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteSecretRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteSecretResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteSystemEventRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteSystemEventResponse;
import com.huaweicloud.sdk.ief.v1.model.EnableDisableEdgeNodesRequest;
import com.huaweicloud.sdk.ief.v1.model.EnableDisableEdgeNodesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListAppVersionsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListAppVersionsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListAppsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListAppsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.ListBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.ListConfigMapsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListConfigMapsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListDeploymentsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListDeploymentsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListDeviceTemplatesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListDeviceTemplatesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListDevicesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListDevicesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeGroupCertsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeGroupCertsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeGroupsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeGroupsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeNodeCertsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeNodeCertsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeNodesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeNodesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEncryptdataNodesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEncryptdataNodesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListNodeEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.ListNodeEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.ListPodsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListPodsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListProductsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListProductsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListResourceByTagsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListResourceByTagsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListRuleErrorsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListRuleErrorsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListRulesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListRulesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListSecretsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListSecretsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListServicesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListServicesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListSystemEventsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListSystemEventsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListTagsByResourceTypeRequest;
import com.huaweicloud.sdk.ief.v1.model.ListTagsByResourceTypeResponse;
import com.huaweicloud.sdk.ief.v1.model.ListTagsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListTagsResponse;
import com.huaweicloud.sdk.ief.v1.model.RestartDeploymentsPodRequest;
import com.huaweicloud.sdk.ief.v1.model.RestartDeploymentsPodResponse;
import com.huaweicloud.sdk.ief.v1.model.RestoreBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.RestoreBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.RetryBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.RetryBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowAppDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowAppDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowAppVersionDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowAppVersionDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowConfigMapRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowConfigMapResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowDeploymentRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowDeploymentResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceTemplateRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceTemplateResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceTwinRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceTwinResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeGroupCertDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeGroupCertDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeGroupDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeGroupDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeNodeDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeNodeDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEndPointDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEndPointDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowProductDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowProductDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowRuleDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowRuleDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowSecretRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowSecretResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowServiceDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowServiceDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowSystemEventDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowSystemEventDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.StartRuleRequest;
import com.huaweicloud.sdk.ief.v1.model.StartRuleResponse;
import com.huaweicloud.sdk.ief.v1.model.StartSystemEventRequest;
import com.huaweicloud.sdk.ief.v1.model.StartSystemEventResponse;
import com.huaweicloud.sdk.ief.v1.model.StopBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.StopBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.StopRuleRequest;
import com.huaweicloud.sdk.ief.v1.model.StopRuleResponse;
import com.huaweicloud.sdk.ief.v1.model.StopSystemEventRequest;
import com.huaweicloud.sdk.ief.v1.model.StopSystemEventResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppVersionRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppVersionResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateConfigMapRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateConfigMapResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeploymentRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeploymentResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceTemplateByIdRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceTemplateByIdResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceTwinRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceTwinResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeGroupNodeBindingRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeGroupNodeBindingResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeGroupRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeGroupResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateNodeByDeviceIdRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateNodeByDeviceIdResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateSecretRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateSecretResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateServiceRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateServiceResponse;
import com.huaweicloud.sdk.ief.v1.model.UpgradeEdgeNodeRequest;
import com.huaweicloud.sdk.ief.v1.model.UpgradeEdgeNodeResponse;

public class IefClient {

    protected HcClient hcClient;

    public IefClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IefClient> newBuilder() {
        ClientBuilder<IefClient> clientBuilder = new ClientBuilder<>(IefClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加删除资源标签
     *
     * 为指定实例批量添加或删除标签。
     * 一个资源上最多有20个标签。
     * 
     * 说明：
     * - 此接口为幂等接口，创建时如果请求体中存在重复key则报错。
     * - 创建时不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。
     * - 删除时不对标签字符集范围做校验，如果删除的标签不存在，默认处理成功。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDeleteTagsRequest 请求对象
     * @return BatchAddDeleteTagsResponse
     */
    public BatchAddDeleteTagsResponse batchAddDeleteTags(BatchAddDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.batchAddDeleteTags);
    }

    /**
     * 批量添加删除资源标签
     *
     * 为指定实例批量添加或删除标签。
     * 一个资源上最多有20个标签。
     * 
     * 说明：
     * - 此接口为幂等接口，创建时如果请求体中存在重复key则报错。
     * - 创建时不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。
     * - 删除时不对标签字符集范围做校验，如果删除的标签不存在，默认处理成功。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse>
     */
    public SyncInvoker<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> batchAddDeleteTagsInvoker(
        BatchAddDeleteTagsRequest request) {
        return new SyncInvoker<>(request, IefMeta.batchAddDeleteTags, hcClient);
    }

    /**
     * 创建应用模板
     *
     * 该API用于创建一个应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createApp);
    }

    /**
     * 创建应用模板
     *
     * 该API用于创建一个应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<>(request, IefMeta.createApp, hcClient);
    }

    /**
     * 创建应用模板版本
     *
     * 创建一个应用模板版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppVersionsRequest 请求对象
     * @return CreateAppVersionsResponse
     */
    public CreateAppVersionsResponse createAppVersions(CreateAppVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createAppVersions);
    }

    /**
     * 创建应用模板版本
     *
     * 创建一个应用模板版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppVersionsRequest 请求对象
     * @return SyncInvoker<CreateAppVersionsRequest, CreateAppVersionsResponse>
     */
    public SyncInvoker<CreateAppVersionsRequest, CreateAppVersionsResponse> createAppVersionsInvoker(
        CreateAppVersionsRequest request) {
        return new SyncInvoker<>(request, IefMeta.createAppVersions, hcClient);
    }

    /**
     * 创建批量处理任务
     *
     * 创建批量处理作业。该API用于创建批量处理作业，当前支持：批量节点升级、批量应用部署、批量应用升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchJobRequest 请求对象
     * @return CreateBatchJobResponse
     */
    public CreateBatchJobResponse createBatchJob(CreateBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createBatchJob);
    }

    /**
     * 创建批量处理任务
     *
     * 创建批量处理作业。该API用于创建批量处理作业，当前支持：批量节点升级、批量应用部署、批量应用升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchJobRequest 请求对象
     * @return SyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>
     */
    public SyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJobInvoker(
        CreateBatchJobRequest request) {
        return new SyncInvoker<>(request, IefMeta.createBatchJob, hcClient);
    }

    /**
     * 创建配置项
     *
     * 创建配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigMapRequest 请求对象
     * @return CreateConfigMapResponse
     */
    public CreateConfigMapResponse createConfigMap(CreateConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createConfigMap);
    }

    /**
     * 创建配置项
     *
     * 创建配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigMapRequest 请求对象
     * @return SyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse>
     */
    public SyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse> createConfigMapInvoker(
        CreateConfigMapRequest request) {
        return new SyncInvoker<>(request, IefMeta.createConfigMap, hcClient);
    }

    /**
     * 创建部署
     *
     * 创建部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentsRequest 请求对象
     * @return CreateDeploymentsResponse
     */
    public CreateDeploymentsResponse createDeployments(CreateDeploymentsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createDeployments);
    }

    /**
     * 创建部署
     *
     * 创建部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentsRequest 请求对象
     * @return SyncInvoker<CreateDeploymentsRequest, CreateDeploymentsResponse>
     */
    public SyncInvoker<CreateDeploymentsRequest, CreateDeploymentsResponse> createDeploymentsInvoker(
        CreateDeploymentsRequest request) {
        return new SyncInvoker<>(request, IefMeta.createDeployments, hcClient);
    }

    /**
     * 注册终端设备
     *
     * 注册终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceRequest 请求对象
     * @return CreateDeviceResponse
     */
    public CreateDeviceResponse createDevice(CreateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createDevice);
    }

    /**
     * 注册终端设备
     *
     * 注册终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceRequest 请求对象
     * @return SyncInvoker<CreateDeviceRequest, CreateDeviceResponse>
     */
    public SyncInvoker<CreateDeviceRequest, CreateDeviceResponse> createDeviceInvoker(CreateDeviceRequest request) {
        return new SyncInvoker<>(request, IefMeta.createDevice, hcClient);
    }

    /**
     * 创建终端设备模板
     *
     * 创建一个终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceTemplateRequest 请求对象
     * @return CreateDeviceTemplateResponse
     */
    public CreateDeviceTemplateResponse createDeviceTemplate(CreateDeviceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createDeviceTemplate);
    }

    /**
     * 创建终端设备模板
     *
     * 创建一个终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceTemplateRequest 请求对象
     * @return SyncInvoker<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse>
     */
    public SyncInvoker<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> createDeviceTemplateInvoker(
        CreateDeviceTemplateRequest request) {
        return new SyncInvoker<>(request, IefMeta.createDeviceTemplate, hcClient);
    }

    /**
     * 边缘节点组管理
     *
     * 创建边缘节点组。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeGroupRequest 请求对象
     * @return CreateEdgeGroupResponse
     */
    public CreateEdgeGroupResponse createEdgeGroup(CreateEdgeGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEdgeGroup);
    }

    /**
     * 边缘节点组管理
     *
     * 创建边缘节点组。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeGroupRequest 请求对象
     * @return SyncInvoker<CreateEdgeGroupRequest, CreateEdgeGroupResponse>
     */
    public SyncInvoker<CreateEdgeGroupRequest, CreateEdgeGroupResponse> createEdgeGroupInvoker(
        CreateEdgeGroupRequest request) {
        return new SyncInvoker<>(request, IefMeta.createEdgeGroup, hcClient);
    }

    /**
     * 创建边缘节点组证书
     *
     * 创建边缘节点组证书。边缘节点组证书.tar.gz文件仅在调用该API时提供压缩包下载，请及时下载证书文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeGroupCertRequest 请求对象
     * @return CreateEdgeGroupCertResponse
     */
    public CreateEdgeGroupCertResponse createEdgeGroupCert(CreateEdgeGroupCertRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEdgeGroupCert);
    }

    /**
     * 创建边缘节点组证书
     *
     * 创建边缘节点组证书。边缘节点组证书.tar.gz文件仅在调用该API时提供压缩包下载，请及时下载证书文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeGroupCertRequest 请求对象
     * @return SyncInvoker<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse>
     */
    public SyncInvoker<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse> createEdgeGroupCertInvoker(
        CreateEdgeGroupCertRequest request) {
        return new SyncInvoker<>(request, IefMeta.createEdgeGroupCert, hcClient);
    }

    /**
     * 注册边缘节点
     *
     * 该API用于注册一个边缘节点。接口调用成功后，您可以将响应消息体中node.package字段使用base64解码成tar.gz文件，并在控制台下载边缘核心软件，然后纳管边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeNodeRequest 请求对象
     * @return CreateEdgeNodeResponse
     */
    public CreateEdgeNodeResponse createEdgeNode(CreateEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEdgeNode);
    }

    /**
     * 注册边缘节点
     *
     * 该API用于注册一个边缘节点。接口调用成功后，您可以将响应消息体中node.package字段使用base64解码成tar.gz文件，并在控制台下载边缘核心软件，然后纳管边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeNodeRequest 请求对象
     * @return SyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>
     */
    public SyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNodeInvoker(
        CreateEdgeNodeRequest request) {
        return new SyncInvoker<>(request, IefMeta.createEdgeNode, hcClient);
    }

    /**
     * 创建节点证书
     *
     * 创建边缘节点上的应用证书和设备证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeNodeCertsRequest 请求对象
     * @return CreateEdgeNodeCertsResponse
     */
    public CreateEdgeNodeCertsResponse createEdgeNodeCerts(CreateEdgeNodeCertsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEdgeNodeCerts);
    }

    /**
     * 创建节点证书
     *
     * 创建边缘节点上的应用证书和设备证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeNodeCertsRequest 请求对象
     * @return SyncInvoker<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse>
     */
    public SyncInvoker<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> createEdgeNodeCertsInvoker(
        CreateEdgeNodeCertsRequest request) {
        return new SyncInvoker<>(request, IefMeta.createEdgeNodeCerts, hcClient);
    }

    /**
     * 新增加密数据
     *
     * 新增加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEncryptdatasRequest 请求对象
     * @return CreateEncryptdatasResponse
     */
    public CreateEncryptdatasResponse createEncryptdatas(CreateEncryptdatasRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEncryptdatas);
    }

    /**
     * 新增加密数据
     *
     * 新增加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEncryptdatasRequest 请求对象
     * @return SyncInvoker<CreateEncryptdatasRequest, CreateEncryptdatasResponse>
     */
    public SyncInvoker<CreateEncryptdatasRequest, CreateEncryptdatasResponse> createEncryptdatasInvoker(
        CreateEncryptdatasRequest request) {
        return new SyncInvoker<>(request, IefMeta.createEncryptdatas, hcClient);
    }

    /**
     * 创建端点
     *
     * 创建一个端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEndpoint);
    }

    /**
     * 创建端点
     *
     * 创建一个端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<>(request, IefMeta.createEndpoint, hcClient);
    }

    /**
     * 加密数据绑定边缘节点
     *
     * 加密数据绑定边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNodeEncryptdatasRequest 请求对象
     * @return CreateNodeEncryptdatasResponse
     */
    public CreateNodeEncryptdatasResponse createNodeEncryptdatas(CreateNodeEncryptdatasRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createNodeEncryptdatas);
    }

    /**
     * 加密数据绑定边缘节点
     *
     * 加密数据绑定边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNodeEncryptdatasRequest 请求对象
     * @return SyncInvoker<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse>
     */
    public SyncInvoker<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse> createNodeEncryptdatasInvoker(
        CreateNodeEncryptdatasRequest request) {
        return new SyncInvoker<>(request, IefMeta.createNodeEncryptdatas, hcClient);
    }

    /**
     * 创建批量节点注册作业
     *
     * 创建批量节点注册作业。接口调用成功后，您可以将响应消息体中product.package字段使用base64解码成tar.gz产品证书文件，并在控制台下载边缘注册软件edge-register和edge-installer，使用该产品证书批量纳管边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createProduct);
    }

    /**
     * 创建批量节点注册作业
     *
     * 创建批量节点注册作业。接口调用成功后，您可以将响应消息体中product.package字段使用base64解码成tar.gz产品证书文件，并在控制台下载边缘注册软件edge-register和edge-installer，使用该产品证书批量纳管边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return SyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public SyncInvoker<CreateProductRequest, CreateProductResponse> createProductInvoker(CreateProductRequest request) {
        return new SyncInvoker<>(request, IefMeta.createProduct, hcClient);
    }

    /**
     * 创建规则
     *
     * 创建一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createRule);
    }

    /**
     * 创建规则
     *
     * 创建一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return SyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public SyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleInvoker(CreateRuleRequest request) {
        return new SyncInvoker<>(request, IefMeta.createRule, hcClient);
    }

    /**
     * 创建密钥
     *
     * 创建密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createSecret);
    }

    /**
     * 创建密钥
     *
     * 创建密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return SyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public SyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretInvoker(CreateSecretRequest request) {
        return new SyncInvoker<>(request, IefMeta.createSecret, hcClient);
    }

    /**
     * 创建服务
     *
     * 创建一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createService);
    }

    /**
     * 创建服务
     *
     * 创建一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return SyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public SyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceInvoker(CreateServiceRequest request) {
        return new SyncInvoker<>(request, IefMeta.createService, hcClient);
    }

    /**
     * 创建系统订阅
     *
     * 创建系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSystemEventRequest 请求对象
     * @return CreateSystemEventResponse
     */
    public CreateSystemEventResponse createSystemEvent(CreateSystemEventRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createSystemEvent);
    }

    /**
     * 创建系统订阅
     *
     * 创建系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSystemEventRequest 请求对象
     * @return SyncInvoker<CreateSystemEventRequest, CreateSystemEventResponse>
     */
    public SyncInvoker<CreateSystemEventRequest, CreateSystemEventResponse> createSystemEventInvoker(
        CreateSystemEventRequest request) {
        return new SyncInvoker<>(request, IefMeta.createSystemEvent, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 为资源添加标签。
     * 一个资源上最多有20个标签。
     * 此接口为幂等接口，创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createTag);
    }

    /**
     * 添加资源标签
     *
     * 为资源添加标签。
     * 一个资源上最多有20个标签。
     * 此接口为幂等接口，创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, IefMeta.createTag, hcClient);
    }

    /**
     * 删除应用模板
     *
     * 删除应用模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteApp);
    }

    /**
     * 删除应用模板
     *
     * 删除应用模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteApp, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppVersionRequest 请求对象
     * @return DeleteAppVersionResponse
     */
    public DeleteAppVersionResponse deleteAppVersion(DeleteAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteAppVersion);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppVersionRequest 请求对象
     * @return SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>
     */
    public SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersionInvoker(
        DeleteAppVersionRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteAppVersion, hcClient);
    }

    /**
     * 删除批量处理作业
     *
     * 删除批量处理作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchJobRequest 请求对象
     * @return DeleteBatchJobResponse
     */
    public DeleteBatchJobResponse deleteBatchJob(DeleteBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteBatchJob);
    }

    /**
     * 删除批量处理作业
     *
     * 删除批量处理作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchJobRequest 请求对象
     * @return SyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse>
     */
    public SyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse> deleteBatchJobInvoker(
        DeleteBatchJobRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteBatchJob, hcClient);
    }

    /**
     * 删除配置项
     *
     * 删除配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigMapRequest 请求对象
     * @return DeleteConfigMapResponse
     */
    public DeleteConfigMapResponse deleteConfigMap(DeleteConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteConfigMap);
    }

    /**
     * 删除配置项
     *
     * 删除配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigMapRequest 请求对象
     * @return SyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse>
     */
    public SyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse> deleteConfigMapInvoker(
        DeleteConfigMapRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteConfigMap, hcClient);
    }

    /**
     * 删除部署
     *
     * 删除应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentRequest 请求对象
     * @return DeleteDeploymentResponse
     */
    public DeleteDeploymentResponse deleteDeployment(DeleteDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteDeployment);
    }

    /**
     * 删除部署
     *
     * 删除应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>
     */
    public SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeploymentInvoker(
        DeleteDeploymentRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteDeployment, hcClient);
    }

    /**
     * 删除终端设备
     *
     * 该API用于删除终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceRequest 请求对象
     * @return DeleteDeviceResponse
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteDevice);
    }

    /**
     * 删除终端设备
     *
     * 该API用于删除终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceRequest 请求对象
     * @return SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceInvoker(DeleteDeviceRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteDevice, hcClient);
    }

    /**
     * 删除终端设备模板
     *
     * 删除终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceTemplateRequest 请求对象
     * @return DeleteDeviceTemplateResponse
     */
    public DeleteDeviceTemplateResponse deleteDeviceTemplate(DeleteDeviceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteDeviceTemplate);
    }

    /**
     * 删除终端设备模板
     *
     * 删除终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceTemplateRequest 请求对象
     * @return SyncInvoker<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse>
     */
    public SyncInvoker<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> deleteDeviceTemplateInvoker(
        DeleteDeviceTemplateRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteDeviceTemplate, hcClient);
    }

    /**
     * 删除边缘节点组
     *
     * 删除边缘节点组。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeGroupRequest 请求对象
     * @return DeleteEdgeGroupResponse
     */
    public DeleteEdgeGroupResponse deleteEdgeGroup(DeleteEdgeGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEdgeGroup);
    }

    /**
     * 删除边缘节点组
     *
     * 删除边缘节点组。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeGroupRequest 请求对象
     * @return SyncInvoker<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse>
     */
    public SyncInvoker<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse> deleteEdgeGroupInvoker(
        DeleteEdgeGroupRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteEdgeGroup, hcClient);
    }

    /**
     * 删除边缘节点组证书
     *
     * 删除边缘节点组证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeGroupCertRequest 请求对象
     * @return DeleteEdgeGroupCertResponse
     */
    public DeleteEdgeGroupCertResponse deleteEdgeGroupCert(DeleteEdgeGroupCertRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEdgeGroupCert);
    }

    /**
     * 删除边缘节点组证书
     *
     * 删除边缘节点组证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeGroupCertRequest 请求对象
     * @return SyncInvoker<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse>
     */
    public SyncInvoker<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse> deleteEdgeGroupCertInvoker(
        DeleteEdgeGroupCertRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteEdgeGroupCert, hcClient);
    }

    /**
     * 删除边缘节点
     *
     * 删除边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeNodeRequest 请求对象
     * @return DeleteEdgeNodeResponse
     */
    public DeleteEdgeNodeResponse deleteEdgeNode(DeleteEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEdgeNode);
    }

    /**
     * 删除边缘节点
     *
     * 删除边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeNodeRequest 请求对象
     * @return SyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>
     */
    public SyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNodeInvoker(
        DeleteEdgeNodeRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteEdgeNode, hcClient);
    }

    /**
     * 删除节点证书
     *
     * 删除边缘节点上的证书（目前只支持删除应用证书和设备证书）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeNodeCertsRequest 请求对象
     * @return DeleteEdgeNodeCertsResponse
     */
    public DeleteEdgeNodeCertsResponse deleteEdgeNodeCerts(DeleteEdgeNodeCertsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEdgeNodeCerts);
    }

    /**
     * 删除节点证书
     *
     * 删除边缘节点上的证书（目前只支持删除应用证书和设备证书）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeNodeCertsRequest 请求对象
     * @return SyncInvoker<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse>
     */
    public SyncInvoker<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> deleteEdgeNodeCertsInvoker(
        DeleteEdgeNodeCertsRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteEdgeNodeCerts, hcClient);
    }

    /**
     * 删除加密数据
     *
     * 删除加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEncryptdatasRequest 请求对象
     * @return DeleteEncryptdatasResponse
     */
    public DeleteEncryptdatasResponse deleteEncryptdatas(DeleteEncryptdatasRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEncryptdatas);
    }

    /**
     * 删除加密数据
     *
     * 删除加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEncryptdatasRequest 请求对象
     * @return SyncInvoker<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse>
     */
    public SyncInvoker<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse> deleteEncryptdatasInvoker(
        DeleteEncryptdatasRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteEncryptdatas, hcClient);
    }

    /**
     * 删除一个端点
     *
     * 删除一个端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndPointRequest 请求对象
     * @return DeleteEndPointResponse
     */
    public DeleteEndPointResponse deleteEndPoint(DeleteEndPointRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEndPoint);
    }

    /**
     * 删除一个端点
     *
     * 删除一个端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndPointRequest 请求对象
     * @return SyncInvoker<DeleteEndPointRequest, DeleteEndPointResponse>
     */
    public SyncInvoker<DeleteEndPointRequest, DeleteEndPointResponse> deleteEndPointInvoker(
        DeleteEndPointRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteEndPoint, hcClient);
    }

    /**
     * 解绑边缘节点的加密数据
     *
     * 解绑边缘节点的加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodeEncryptdatasRequest 请求对象
     * @return DeleteNodeEncryptdatasResponse
     */
    public DeleteNodeEncryptdatasResponse deleteNodeEncryptdatas(DeleteNodeEncryptdatasRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteNodeEncryptdatas);
    }

    /**
     * 解绑边缘节点的加密数据
     *
     * 解绑边缘节点的加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodeEncryptdatasRequest 请求对象
     * @return SyncInvoker<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse>
     */
    public SyncInvoker<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse> deleteNodeEncryptdatasInvoker(
        DeleteNodeEncryptdatasRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteNodeEncryptdatas, hcClient);
    }

    /**
     * 删除容器应用实例
     *
     * 删除部署下的应用实例。应用实例在删除后会自动重新拉起。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePodRequest 请求对象
     * @return DeletePodResponse
     */
    public DeletePodResponse deletePod(DeletePodRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deletePod);
    }

    /**
     * 删除容器应用实例
     *
     * 删除部署下的应用实例。应用实例在删除后会自动重新拉起。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePodRequest 请求对象
     * @return SyncInvoker<DeletePodRequest, DeletePodResponse>
     */
    public SyncInvoker<DeletePodRequest, DeletePodResponse> deletePodInvoker(DeletePodRequest request) {
        return new SyncInvoker<>(request, IefMeta.deletePod, hcClient);
    }

    /**
     * 删除批量节点注册作业
     *
     * 删除批量节点注册作业。接口调用成功后，与该批量注册任务关联的批量注册凭证将会失效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteProduct);
    }

    /**
     * 删除批量节点注册作业
     *
     * 删除批量节点注册作业。接口调用成功后，与该批量注册任务关联的批量注册凭证将会失效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return SyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public SyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductInvoker(DeleteProductRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteProduct, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。删除时不对标签字符集做校验，调用前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return DeleteResourceTagResponse
     */
    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteResourceTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。删除时不对标签字符集做校验，调用前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteResourceTag, hcClient);
    }

    /**
     * 删除规则
     *
     * 删除一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteRule);
    }

    /**
     * 删除规则
     *
     * 删除一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteRule, hcClient);
    }

    /**
     * 删除密钥
     *
     * 删除密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretRequest 请求对象
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteSecret);
    }

    /**
     * 删除密钥
     *
     * 删除密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretRequest 请求对象
     * @return SyncInvoker<DeleteSecretRequest, DeleteSecretResponse>
     */
    public SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretInvoker(DeleteSecretRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteSecret, hcClient);
    }

    /**
     * 删除服务
     *
     * 删除一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteService);
    }

    /**
     * 删除服务
     *
     * 删除一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceInvoker(DeleteServiceRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteService, hcClient);
    }

    /**
     * 删除系统订阅列表
     *
     * 删除系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSystemEventRequest 请求对象
     * @return DeleteSystemEventResponse
     */
    public DeleteSystemEventResponse deleteSystemEvent(DeleteSystemEventRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteSystemEvent);
    }

    /**
     * 删除系统订阅列表
     *
     * 删除系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSystemEventRequest 请求对象
     * @return SyncInvoker<DeleteSystemEventRequest, DeleteSystemEventResponse>
     */
    public SyncInvoker<DeleteSystemEventRequest, DeleteSystemEventResponse> deleteSystemEventInvoker(
        DeleteSystemEventRequest request) {
        return new SyncInvoker<>(request, IefMeta.deleteSystemEvent, hcClient);
    }

    /**
     * 启用停用边缘节点
     *
     * 启用停用边缘节点。被停用的边缘节点将无法连接到云端服务，可用该URI启用边缘节点恢复连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDisableEdgeNodesRequest 请求对象
     * @return EnableDisableEdgeNodesResponse
     */
    public EnableDisableEdgeNodesResponse enableDisableEdgeNodes(EnableDisableEdgeNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.enableDisableEdgeNodes);
    }

    /**
     * 启用停用边缘节点
     *
     * 启用停用边缘节点。被停用的边缘节点将无法连接到云端服务，可用该URI启用边缘节点恢复连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDisableEdgeNodesRequest 请求对象
     * @return SyncInvoker<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse>
     */
    public SyncInvoker<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> enableDisableEdgeNodesInvoker(
        EnableDisableEdgeNodesRequest request) {
        return new SyncInvoker<>(request, IefMeta.enableDisableEdgeNodes, hcClient);
    }

    /**
     * 查询应用模板版本列表
     *
     * 查询应用模板版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppVersionsRequest 请求对象
     * @return ListAppVersionsResponse
     */
    public ListAppVersionsResponse listAppVersions(ListAppVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listAppVersions);
    }

    /**
     * 查询应用模板版本列表
     *
     * 查询应用模板版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppVersionsRequest 请求对象
     * @return SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>
     */
    public SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersionsInvoker(
        ListAppVersionsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listAppVersions, hcClient);
    }

    /**
     * 查询应用模板列表
     *
     * 查询应用模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listApps);
    }

    /**
     * 查询应用模板列表
     *
     * 查询应用模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listApps, hcClient);
    }

    /**
     * 查询批量处理作业列表
     *
     * 查询批量处理作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchJobRequest 请求对象
     * @return ListBatchJobResponse
     */
    public ListBatchJobResponse listBatchJob(ListBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listBatchJob);
    }

    /**
     * 查询批量处理作业列表
     *
     * 查询批量处理作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchJobRequest 请求对象
     * @return SyncInvoker<ListBatchJobRequest, ListBatchJobResponse>
     */
    public SyncInvoker<ListBatchJobRequest, ListBatchJobResponse> listBatchJobInvoker(ListBatchJobRequest request) {
        return new SyncInvoker<>(request, IefMeta.listBatchJob, hcClient);
    }

    /**
     * 查询配置项列表
     *
     * 查询配置项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigMapsRequest 请求对象
     * @return ListConfigMapsResponse
     */
    public ListConfigMapsResponse listConfigMaps(ListConfigMapsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listConfigMaps);
    }

    /**
     * 查询配置项列表
     *
     * 查询配置项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigMapsRequest 请求对象
     * @return SyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse>
     */
    public SyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse> listConfigMapsInvoker(
        ListConfigMapsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listConfigMaps, hcClient);
    }

    /**
     * 查询部署列表
     *
     * 查询部署列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeploymentsRequest 请求对象
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listDeployments);
    }

    /**
     * 查询部署列表
     *
     * 查询部署列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeploymentsRequest 请求对象
     * @return SyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>
     */
    public SyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse> listDeploymentsInvoker(
        ListDeploymentsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listDeployments, hcClient);
    }

    /**
     * 查询终端设备模板列表
     *
     * 查询终端设备模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceTemplatesRequest 请求对象
     * @return ListDeviceTemplatesResponse
     */
    public ListDeviceTemplatesResponse listDeviceTemplates(ListDeviceTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listDeviceTemplates);
    }

    /**
     * 查询终端设备模板列表
     *
     * 查询终端设备模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceTemplatesRequest 请求对象
     * @return SyncInvoker<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse>
     */
    public SyncInvoker<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> listDeviceTemplatesInvoker(
        ListDeviceTemplatesRequest request) {
        return new SyncInvoker<>(request, IefMeta.listDeviceTemplates, hcClient);
    }

    /**
     * 查询终端设备列表
     *
     * 该API用于查询终端设备列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listDevices);
    }

    /**
     * 查询终端设备列表
     *
     * 该API用于查询终端设备列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<>(request, IefMeta.listDevices, hcClient);
    }

    /**
     * 查询边缘节点组证书列表
     *
     * 查询边缘节点组证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeGroupCertsRequest 请求对象
     * @return ListEdgeGroupCertsResponse
     */
    public ListEdgeGroupCertsResponse listEdgeGroupCerts(ListEdgeGroupCertsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEdgeGroupCerts);
    }

    /**
     * 查询边缘节点组证书列表
     *
     * 查询边缘节点组证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeGroupCertsRequest 请求对象
     * @return SyncInvoker<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse>
     */
    public SyncInvoker<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse> listEdgeGroupCertsInvoker(
        ListEdgeGroupCertsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listEdgeGroupCerts, hcClient);
    }

    /**
     * 查询边缘节点组列表
     *
     * 查询边缘节点组列表。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeGroupsRequest 请求对象
     * @return ListEdgeGroupsResponse
     */
    public ListEdgeGroupsResponse listEdgeGroups(ListEdgeGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEdgeGroups);
    }

    /**
     * 查询边缘节点组列表
     *
     * 查询边缘节点组列表。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeGroupsRequest 请求对象
     * @return SyncInvoker<ListEdgeGroupsRequest, ListEdgeGroupsResponse>
     */
    public SyncInvoker<ListEdgeGroupsRequest, ListEdgeGroupsResponse> listEdgeGroupsInvoker(
        ListEdgeGroupsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listEdgeGroups, hcClient);
    }

    /**
     * 查询节点证书
     *
     * 查询边缘节点上的应用证书和设备证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeNodeCertsRequest 请求对象
     * @return ListEdgeNodeCertsResponse
     */
    public ListEdgeNodeCertsResponse listEdgeNodeCerts(ListEdgeNodeCertsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEdgeNodeCerts);
    }

    /**
     * 查询节点证书
     *
     * 查询边缘节点上的应用证书和设备证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeNodeCertsRequest 请求对象
     * @return SyncInvoker<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse>
     */
    public SyncInvoker<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> listEdgeNodeCertsInvoker(
        ListEdgeNodeCertsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listEdgeNodeCerts, hcClient);
    }

    /**
     * 查询边缘节点列表
     *
     * 该API用于查询边缘节点。
     * - 如果不携带任何检索参数，将返回该租户的所有边缘节点信息。
     * - app_name和tags不支持复合查询，如果同时存在则返回tags查询结果，可以同时携带多个其他检索参数，可同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeNodesRequest 请求对象
     * @return ListEdgeNodesResponse
     */
    public ListEdgeNodesResponse listEdgeNodes(ListEdgeNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEdgeNodes);
    }

    /**
     * 查询边缘节点列表
     *
     * 该API用于查询边缘节点。
     * - 如果不携带任何检索参数，将返回该租户的所有边缘节点信息。
     * - app_name和tags不支持复合查询，如果同时存在则返回tags查询结果，可以同时携带多个其他检索参数，可同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeNodesRequest 请求对象
     * @return SyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>
     */
    public SyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodesInvoker(ListEdgeNodesRequest request) {
        return new SyncInvoker<>(request, IefMeta.listEdgeNodes, hcClient);
    }

    /**
     * 获取加密数据绑定的边缘节点
     *
     * 获取加密数据绑定的边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEncryptdataNodesRequest 请求对象
     * @return ListEncryptdataNodesResponse
     */
    public ListEncryptdataNodesResponse listEncryptdataNodes(ListEncryptdataNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEncryptdataNodes);
    }

    /**
     * 获取加密数据绑定的边缘节点
     *
     * 获取加密数据绑定的边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEncryptdataNodesRequest 请求对象
     * @return SyncInvoker<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse>
     */
    public SyncInvoker<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse> listEncryptdataNodesInvoker(
        ListEncryptdataNodesRequest request) {
        return new SyncInvoker<>(request, IefMeta.listEncryptdataNodes, hcClient);
    }

    /**
     * 获取加密数据列表
     *
     * 获取加密数据列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEncryptdatasRequest 请求对象
     * @return ListEncryptdatasResponse
     */
    public ListEncryptdatasResponse listEncryptdatas(ListEncryptdatasRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEncryptdatas);
    }

    /**
     * 获取加密数据列表
     *
     * 获取加密数据列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEncryptdatasRequest 请求对象
     * @return SyncInvoker<ListEncryptdatasRequest, ListEncryptdatasResponse>
     */
    public SyncInvoker<ListEncryptdatasRequest, ListEncryptdatasResponse> listEncryptdatasInvoker(
        ListEncryptdatasRequest request) {
        return new SyncInvoker<>(request, IefMeta.listEncryptdatas, hcClient);
    }

    /**
     * 查询端点列表
     *
     * 获取所有的端点详情。
     * 如果不携带任何检索参数，将返回该租户的所有端点信息和系统中所有的共享端点。
     * 如果同时指定is_shared&#x3D;true和其他参数，同样还会对name、type进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEndpoints);
    }

    /**
     * 查询端点列表
     *
     * 获取所有的端点详情。
     * 如果不携带任何检索参数，将返回该租户的所有端点信息和系统中所有的共享端点。
     * 如果同时指定is_shared&#x3D;true和其他参数，同样还会对name、type进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listEndpoints, hcClient);
    }

    /**
     * 获取边缘节点绑定的加密数据
     *
     * 获取边缘节点绑定的加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeEncryptdatasRequest 请求对象
     * @return ListNodeEncryptdatasResponse
     */
    public ListNodeEncryptdatasResponse listNodeEncryptdatas(ListNodeEncryptdatasRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listNodeEncryptdatas);
    }

    /**
     * 获取边缘节点绑定的加密数据
     *
     * 获取边缘节点绑定的加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeEncryptdatasRequest 请求对象
     * @return SyncInvoker<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse>
     */
    public SyncInvoker<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse> listNodeEncryptdatasInvoker(
        ListNodeEncryptdatasRequest request) {
        return new SyncInvoker<>(request, IefMeta.listNodeEncryptdatas, hcClient);
    }

    /**
     * 查询应用实例列表
     *
     * 查询应用实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPodsRequest 请求对象
     * @return ListPodsResponse
     */
    public ListPodsResponse listPods(ListPodsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listPods);
    }

    /**
     * 查询应用实例列表
     *
     * 查询应用实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPodsRequest 请求对象
     * @return SyncInvoker<ListPodsRequest, ListPodsResponse>
     */
    public SyncInvoker<ListPodsRequest, ListPodsResponse> listPodsInvoker(ListPodsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listPods, hcClient);
    }

    /**
     * 查询批量节点注册作业列表
     *
     * 查询批量节点注册作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listProducts);
    }

    /**
     * 查询批量节点注册作业列表
     *
     * 查询批量节点注册作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listProducts, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceByTagsRequest 请求对象
     * @return ListResourceByTagsResponse
     */
    public ListResourceByTagsResponse listResourceByTags(ListResourceByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listResourceByTags);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceByTagsRequest 请求对象
     * @return SyncInvoker<ListResourceByTagsRequest, ListResourceByTagsResponse>
     */
    public SyncInvoker<ListResourceByTagsRequest, ListResourceByTagsResponse> listResourceByTagsInvoker(
        ListResourceByTagsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listResourceByTags, hcClient);
    }

    /**
     * 查询规则错误列表
     *
     * 查询特定规则下的所有错误列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleErrorsRequest 请求对象
     * @return ListRuleErrorsResponse
     */
    public ListRuleErrorsResponse listRuleErrors(ListRuleErrorsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listRuleErrors);
    }

    /**
     * 查询规则错误列表
     *
     * 查询特定规则下的所有错误列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleErrorsRequest 请求对象
     * @return SyncInvoker<ListRuleErrorsRequest, ListRuleErrorsResponse>
     */
    public SyncInvoker<ListRuleErrorsRequest, ListRuleErrorsResponse> listRuleErrorsInvoker(
        ListRuleErrorsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listRuleErrors, hcClient);
    }

    /**
     * 查询规则列表
     *
     * 查询到所有的规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesRequest 请求对象
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listRules);
    }

    /**
     * 查询规则列表
     *
     * 查询到所有的规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesRequest 请求对象
     * @return SyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public SyncInvoker<ListRulesRequest, ListRulesResponse> listRulesInvoker(ListRulesRequest request) {
        return new SyncInvoker<>(request, IefMeta.listRules, hcClient);
    }

    /**
     * 查询密钥列表
     *
     * 查询密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretsRequest 请求对象
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listSecrets);
    }

    /**
     * 查询密钥列表
     *
     * 查询密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretsRequest 请求对象
     * @return SyncInvoker<ListSecretsRequest, ListSecretsResponse>
     */
    public SyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsInvoker(ListSecretsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listSecrets, hcClient);
    }

    /**
     * 查询服务列表
     *
     * 获取所有的服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesRequest 请求对象
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listServices);
    }

    /**
     * 查询服务列表
     *
     * 获取所有的服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesRequest 请求对象
     * @return SyncInvoker<ListServicesRequest, ListServicesResponse>
     */
    public SyncInvoker<ListServicesRequest, ListServicesResponse> listServicesInvoker(ListServicesRequest request) {
        return new SyncInvoker<>(request, IefMeta.listServices, hcClient);
    }

    /**
     * 查询系统订阅列表
     *
     * 查询系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemEventsRequest 请求对象
     * @return ListSystemEventsResponse
     */
    public ListSystemEventsResponse listSystemEvents(ListSystemEventsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listSystemEvents);
    }

    /**
     * 查询系统订阅列表
     *
     * 查询系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemEventsRequest 请求对象
     * @return SyncInvoker<ListSystemEventsRequest, ListSystemEventsResponse>
     */
    public SyncInvoker<ListSystemEventsRequest, ListSystemEventsResponse> listSystemEventsInvoker(
        ListSystemEventsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listSystemEvents, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, IefMeta.listTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsByResourceTypeRequest 请求对象
     * @return ListTagsByResourceTypeResponse
     */
    public ListTagsByResourceTypeResponse listTagsByResourceType(ListTagsByResourceTypeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listTagsByResourceType);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsByResourceTypeRequest 请求对象
     * @return SyncInvoker<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse>
     */
    public SyncInvoker<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> listTagsByResourceTypeInvoker(
        ListTagsByResourceTypeRequest request) {
        return new SyncInvoker<>(request, IefMeta.listTagsByResourceType, hcClient);
    }

    /**
     * 容器应用实例重启
     *
     * 重启部署下的应用实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartDeploymentsPodRequest 请求对象
     * @return RestartDeploymentsPodResponse
     */
    public RestartDeploymentsPodResponse restartDeploymentsPod(RestartDeploymentsPodRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.restartDeploymentsPod);
    }

    /**
     * 容器应用实例重启
     *
     * 重启部署下的应用实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartDeploymentsPodRequest 请求对象
     * @return SyncInvoker<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse>
     */
    public SyncInvoker<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse> restartDeploymentsPodInvoker(
        RestartDeploymentsPodRequest request) {
        return new SyncInvoker<>(request, IefMeta.restartDeploymentsPod, hcClient);
    }

    /**
     * 继续批量处理作业
     *
     * 继续执行批量处理作业。该API只对停止的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreBatchJobRequest 请求对象
     * @return RestoreBatchJobResponse
     */
    public RestoreBatchJobResponse restoreBatchJob(RestoreBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.restoreBatchJob);
    }

    /**
     * 继续批量处理作业
     *
     * 继续执行批量处理作业。该API只对停止的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreBatchJobRequest 请求对象
     * @return SyncInvoker<RestoreBatchJobRequest, RestoreBatchJobResponse>
     */
    public SyncInvoker<RestoreBatchJobRequest, RestoreBatchJobResponse> restoreBatchJobInvoker(
        RestoreBatchJobRequest request) {
        return new SyncInvoker<>(request, IefMeta.restoreBatchJob, hcClient);
    }

    /**
     * 重试批量处理作业
     *
     * 重试批量处理作业。该API仅对执行状态失败的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryBatchJobRequest 请求对象
     * @return RetryBatchJobResponse
     */
    public RetryBatchJobResponse retryBatchJob(RetryBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.retryBatchJob);
    }

    /**
     * 重试批量处理作业
     *
     * 重试批量处理作业。该API仅对执行状态失败的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryBatchJobRequest 请求对象
     * @return SyncInvoker<RetryBatchJobRequest, RetryBatchJobResponse>
     */
    public SyncInvoker<RetryBatchJobRequest, RetryBatchJobResponse> retryBatchJobInvoker(RetryBatchJobRequest request) {
        return new SyncInvoker<>(request, IefMeta.retryBatchJob, hcClient);
    }

    /**
     * 查询应用模板详情
     *
     * 查询应用模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailRequest 请求对象
     * @return ShowAppDetailResponse
     */
    public ShowAppDetailResponse showAppDetail(ShowAppDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showAppDetail);
    }

    /**
     * 查询应用模板详情
     *
     * 查询应用模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailRequest 请求对象
     * @return SyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse>
     */
    public SyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse> showAppDetailInvoker(ShowAppDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showAppDetail, hcClient);
    }

    /**
     * 查询应用模板版本详情
     *
     * 查询应用模板版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppVersionDetailRequest 请求对象
     * @return ShowAppVersionDetailResponse
     */
    public ShowAppVersionDetailResponse showAppVersionDetail(ShowAppVersionDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showAppVersionDetail);
    }

    /**
     * 查询应用模板版本详情
     *
     * 查询应用模板版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppVersionDetailRequest 请求对象
     * @return SyncInvoker<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse>
     */
    public SyncInvoker<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> showAppVersionDetailInvoker(
        ShowAppVersionDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showAppVersionDetail, hcClient);
    }

    /**
     * 查询批量处理作业详情
     *
     * 查询批量处理作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchJobRequest 请求对象
     * @return ShowBatchJobResponse
     */
    public ShowBatchJobResponse showBatchJob(ShowBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showBatchJob);
    }

    /**
     * 查询批量处理作业详情
     *
     * 查询批量处理作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchJobRequest 请求对象
     * @return SyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse>
     */
    public SyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse> showBatchJobInvoker(ShowBatchJobRequest request) {
        return new SyncInvoker<>(request, IefMeta.showBatchJob, hcClient);
    }

    /**
     * 查询配置项详情
     *
     * 查询一个配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigMapRequest 请求对象
     * @return ShowConfigMapResponse
     */
    public ShowConfigMapResponse showConfigMap(ShowConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showConfigMap);
    }

    /**
     * 查询配置项详情
     *
     * 查询一个配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigMapRequest 请求对象
     * @return SyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse>
     */
    public SyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse> showConfigMapInvoker(ShowConfigMapRequest request) {
        return new SyncInvoker<>(request, IefMeta.showConfigMap, hcClient);
    }

    /**
     * 查询应用部署
     *
     * 查询应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentRequest 请求对象
     * @return ShowDeploymentResponse
     */
    public ShowDeploymentResponse showDeployment(ShowDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showDeployment);
    }

    /**
     * 查询应用部署
     *
     * 查询应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentRequest 请求对象
     * @return SyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse>
     */
    public SyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse> showDeploymentInvoker(
        ShowDeploymentRequest request) {
        return new SyncInvoker<>(request, IefMeta.showDeployment, hcClient);
    }

    /**
     * 查询终端设备详情
     *
     * 该API用于查询终端设备详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceRequest 请求对象
     * @return ShowDeviceResponse
     */
    public ShowDeviceResponse showDevice(ShowDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showDevice);
    }

    /**
     * 查询终端设备详情
     *
     * 该API用于查询终端设备详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceRequest 请求对象
     * @return SyncInvoker<ShowDeviceRequest, ShowDeviceResponse>
     */
    public SyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceInvoker(ShowDeviceRequest request) {
        return new SyncInvoker<>(request, IefMeta.showDevice, hcClient);
    }

    /**
     * 查询终端设备模板
     *
     * 查询一个终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTemplateRequest 请求对象
     * @return ShowDeviceTemplateResponse
     */
    public ShowDeviceTemplateResponse showDeviceTemplate(ShowDeviceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showDeviceTemplate);
    }

    /**
     * 查询终端设备模板
     *
     * 查询一个终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTemplateRequest 请求对象
     * @return SyncInvoker<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse>
     */
    public SyncInvoker<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> showDeviceTemplateInvoker(
        ShowDeviceTemplateRequest request) {
        return new SyncInvoker<>(request, IefMeta.showDeviceTemplate, hcClient);
    }

    /**
     * 查询终端设备孪生
     *
     * 该API用于查询终端设备孪生。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTwinRequest 请求对象
     * @return ShowDeviceTwinResponse
     */
    public ShowDeviceTwinResponse showDeviceTwin(ShowDeviceTwinRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showDeviceTwin);
    }

    /**
     * 查询终端设备孪生
     *
     * 该API用于查询终端设备孪生。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTwinRequest 请求对象
     * @return SyncInvoker<ShowDeviceTwinRequest, ShowDeviceTwinResponse>
     */
    public SyncInvoker<ShowDeviceTwinRequest, ShowDeviceTwinResponse> showDeviceTwinInvoker(
        ShowDeviceTwinRequest request) {
        return new SyncInvoker<>(request, IefMeta.showDeviceTwin, hcClient);
    }

    /**
     * 查询边缘节点组证书详情
     *
     * 查询边缘节点组证书详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeGroupCertDetailRequest 请求对象
     * @return ShowEdgeGroupCertDetailResponse
     */
    public ShowEdgeGroupCertDetailResponse showEdgeGroupCertDetail(ShowEdgeGroupCertDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showEdgeGroupCertDetail);
    }

    /**
     * 查询边缘节点组证书详情
     *
     * 查询边缘节点组证书详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeGroupCertDetailRequest 请求对象
     * @return SyncInvoker<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse>
     */
    public SyncInvoker<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse> showEdgeGroupCertDetailInvoker(
        ShowEdgeGroupCertDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showEdgeGroupCertDetail, hcClient);
    }

    /**
     * 查询边缘节点组详情
     *
     * 查询边缘节点组详情。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeGroupDetailRequest 请求对象
     * @return ShowEdgeGroupDetailResponse
     */
    public ShowEdgeGroupDetailResponse showEdgeGroupDetail(ShowEdgeGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showEdgeGroupDetail);
    }

    /**
     * 查询边缘节点组详情
     *
     * 查询边缘节点组详情。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse>
     */
    public SyncInvoker<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse> showEdgeGroupDetailInvoker(
        ShowEdgeGroupDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showEdgeGroupDetail, hcClient);
    }

    /**
     * 查询边缘节点详情
     *
     * 查询边缘节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeNodeDetailRequest 请求对象
     * @return ShowEdgeNodeDetailResponse
     */
    public ShowEdgeNodeDetailResponse showEdgeNodeDetail(ShowEdgeNodeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showEdgeNodeDetail);
    }

    /**
     * 查询边缘节点详情
     *
     * 查询边缘节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeNodeDetailRequest 请求对象
     * @return SyncInvoker<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse>
     */
    public SyncInvoker<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> showEdgeNodeDetailInvoker(
        ShowEdgeNodeDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showEdgeNodeDetail, hcClient);
    }

    /**
     * 查询加密数据详情
     *
     * 查询加密数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEncryptdatasRequest 请求对象
     * @return ShowEncryptdatasResponse
     */
    public ShowEncryptdatasResponse showEncryptdatas(ShowEncryptdatasRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showEncryptdatas);
    }

    /**
     * 查询加密数据详情
     *
     * 查询加密数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEncryptdatasRequest 请求对象
     * @return SyncInvoker<ShowEncryptdatasRequest, ShowEncryptdatasResponse>
     */
    public SyncInvoker<ShowEncryptdatasRequest, ShowEncryptdatasResponse> showEncryptdatasInvoker(
        ShowEncryptdatasRequest request) {
        return new SyncInvoker<>(request, IefMeta.showEncryptdatas, hcClient);
    }

    /**
     * 查询端点详情
     *
     * 查询一个端点的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndPointDetailRequest 请求对象
     * @return ShowEndPointDetailResponse
     */
    public ShowEndPointDetailResponse showEndPointDetail(ShowEndPointDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showEndPointDetail);
    }

    /**
     * 查询端点详情
     *
     * 查询一个端点的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndPointDetailRequest 请求对象
     * @return SyncInvoker<ShowEndPointDetailRequest, ShowEndPointDetailResponse>
     */
    public SyncInvoker<ShowEndPointDetailRequest, ShowEndPointDetailResponse> showEndPointDetailInvoker(
        ShowEndPointDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showEndPointDetail, hcClient);
    }

    /**
     * 查询批量节点注册作业详情
     *
     * 查询批量节点注册作业详情。该接口无法查询产品证书文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductDetailRequest 请求对象
     * @return ShowProductDetailResponse
     */
    public ShowProductDetailResponse showProductDetail(ShowProductDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showProductDetail);
    }

    /**
     * 查询批量节点注册作业详情
     *
     * 查询批量节点注册作业详情。该接口无法查询产品证书文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductDetailRequest 请求对象
     * @return SyncInvoker<ShowProductDetailRequest, ShowProductDetailResponse>
     */
    public SyncInvoker<ShowProductDetailRequest, ShowProductDetailResponse> showProductDetailInvoker(
        ShowProductDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showProductDetail, hcClient);
    }

    /**
     * 查询IEF服务下的资源配额
     *
     * 查询IEF服务下的资源配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showQuota);
    }

    /**
     * 查询IEF服务下的资源配额
     *
     * 查询IEF服务下的资源配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<>(request, IefMeta.showQuota, hcClient);
    }

    /**
     * 查询规则详情
     *
     * 获取一条规则的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleDetailRequest 请求对象
     * @return ShowRuleDetailResponse
     */
    public ShowRuleDetailResponse showRuleDetail(ShowRuleDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showRuleDetail);
    }

    /**
     * 查询规则详情
     *
     * 获取一条规则的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleDetailRequest 请求对象
     * @return SyncInvoker<ShowRuleDetailRequest, ShowRuleDetailResponse>
     */
    public SyncInvoker<ShowRuleDetailRequest, ShowRuleDetailResponse> showRuleDetailInvoker(
        ShowRuleDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showRuleDetail, hcClient);
    }

    /**
     * 查询密钥详情
     *
     * 查询一个密钥详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretRequest 请求对象
     * @return ShowSecretResponse
     */
    public ShowSecretResponse showSecret(ShowSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showSecret);
    }

    /**
     * 查询密钥详情
     *
     * 查询一个密钥详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretRequest 请求对象
     * @return SyncInvoker<ShowSecretRequest, ShowSecretResponse>
     */
    public SyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretInvoker(ShowSecretRequest request) {
        return new SyncInvoker<>(request, IefMeta.showSecret, hcClient);
    }

    /**
     * 查询服务详情
     *
     * 查询一个服务的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceDetailRequest 请求对象
     * @return ShowServiceDetailResponse
     */
    public ShowServiceDetailResponse showServiceDetail(ShowServiceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showServiceDetail);
    }

    /**
     * 查询服务详情
     *
     * 查询一个服务的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceDetailRequest 请求对象
     * @return SyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse>
     */
    public SyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse> showServiceDetailInvoker(
        ShowServiceDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showServiceDetail, hcClient);
    }

    /**
     * 查询系统订阅列表
     *
     * 查询系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemEventDetailRequest 请求对象
     * @return ShowSystemEventDetailResponse
     */
    public ShowSystemEventDetailResponse showSystemEventDetail(ShowSystemEventDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showSystemEventDetail);
    }

    /**
     * 查询系统订阅列表
     *
     * 查询系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemEventDetailRequest 请求对象
     * @return SyncInvoker<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse>
     */
    public SyncInvoker<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse> showSystemEventDetailInvoker(
        ShowSystemEventDetailRequest request) {
        return new SyncInvoker<>(request, IefMeta.showSystemEventDetail, hcClient);
    }

    /**
     * 启用规则
     *
     * 启用一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartRuleRequest 请求对象
     * @return StartRuleResponse
     */
    public StartRuleResponse startRule(StartRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.startRule);
    }

    /**
     * 启用规则
     *
     * 启用一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartRuleRequest 请求对象
     * @return SyncInvoker<StartRuleRequest, StartRuleResponse>
     */
    public SyncInvoker<StartRuleRequest, StartRuleResponse> startRuleInvoker(StartRuleRequest request) {
        return new SyncInvoker<>(request, IefMeta.startRule, hcClient);
    }

    /**
     * 启用系统订阅
     *
     * 启用系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSystemEventRequest 请求对象
     * @return StartSystemEventResponse
     */
    public StartSystemEventResponse startSystemEvent(StartSystemEventRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.startSystemEvent);
    }

    /**
     * 启用系统订阅
     *
     * 启用系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSystemEventRequest 请求对象
     * @return SyncInvoker<StartSystemEventRequest, StartSystemEventResponse>
     */
    public SyncInvoker<StartSystemEventRequest, StartSystemEventResponse> startSystemEventInvoker(
        StartSystemEventRequest request) {
        return new SyncInvoker<>(request, IefMeta.startSystemEvent, hcClient);
    }

    /**
     * 停止批量处理作业
     *
     * 停止批量处理作业。该API仅对运行中的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBatchJobRequest 请求对象
     * @return StopBatchJobResponse
     */
    public StopBatchJobResponse stopBatchJob(StopBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.stopBatchJob);
    }

    /**
     * 停止批量处理作业
     *
     * 停止批量处理作业。该API仅对运行中的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBatchJobRequest 请求对象
     * @return SyncInvoker<StopBatchJobRequest, StopBatchJobResponse>
     */
    public SyncInvoker<StopBatchJobRequest, StopBatchJobResponse> stopBatchJobInvoker(StopBatchJobRequest request) {
        return new SyncInvoker<>(request, IefMeta.stopBatchJob, hcClient);
    }

    /**
     * 停用规则
     *
     * 停用一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopRuleRequest 请求对象
     * @return StopRuleResponse
     */
    public StopRuleResponse stopRule(StopRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.stopRule);
    }

    /**
     * 停用规则
     *
     * 停用一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopRuleRequest 请求对象
     * @return SyncInvoker<StopRuleRequest, StopRuleResponse>
     */
    public SyncInvoker<StopRuleRequest, StopRuleResponse> stopRuleInvoker(StopRuleRequest request) {
        return new SyncInvoker<>(request, IefMeta.stopRule, hcClient);
    }

    /**
     * 停用系统订阅
     *
     * 停用系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSystemEventRequest 请求对象
     * @return StopSystemEventResponse
     */
    public StopSystemEventResponse stopSystemEvent(StopSystemEventRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.stopSystemEvent);
    }

    /**
     * 停用系统订阅
     *
     * 停用系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSystemEventRequest 请求对象
     * @return SyncInvoker<StopSystemEventRequest, StopSystemEventResponse>
     */
    public SyncInvoker<StopSystemEventRequest, StopSystemEventResponse> stopSystemEventInvoker(
        StopSystemEventRequest request) {
        return new SyncInvoker<>(request, IefMeta.stopSystemEvent, hcClient);
    }

    /**
     * 更新应用模板
     *
     * 更新一个应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateApp);
    }

    /**
     * 更新应用模板
     *
     * 更新一个应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateApp, hcClient);
    }

    /**
     * 更新应用模板版本
     *
     * 更新一个应用模板版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppVersionRequest 请求对象
     * @return UpdateAppVersionResponse
     */
    public UpdateAppVersionResponse updateAppVersion(UpdateAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateAppVersion);
    }

    /**
     * 更新应用模板版本
     *
     * 更新一个应用模板版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppVersionRequest 请求对象
     * @return SyncInvoker<UpdateAppVersionRequest, UpdateAppVersionResponse>
     */
    public SyncInvoker<UpdateAppVersionRequest, UpdateAppVersionResponse> updateAppVersionInvoker(
        UpdateAppVersionRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateAppVersion, hcClient);
    }

    /**
     * 更新配置项
     *
     * 更新一个配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigMapRequest 请求对象
     * @return UpdateConfigMapResponse
     */
    public UpdateConfigMapResponse updateConfigMap(UpdateConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateConfigMap);
    }

    /**
     * 更新配置项
     *
     * 更新一个配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigMapRequest 请求对象
     * @return SyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse>
     */
    public SyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse> updateConfigMapInvoker(
        UpdateConfigMapRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateConfigMap, hcClient);
    }

    /**
     * 更新应用部署
     *
     * 修改应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentRequest 请求对象
     * @return UpdateDeploymentResponse
     */
    public UpdateDeploymentResponse updateDeployment(UpdateDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateDeployment);
    }

    /**
     * 更新应用部署
     *
     * 修改应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse>
     */
    public SyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse> updateDeploymentInvoker(
        UpdateDeploymentRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateDeployment, hcClient);
    }

    /**
     * 更新终端设备
     *
     * 更新一个终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateDevice);
    }

    /**
     * 更新终端设备
     *
     * 更新一个终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateDevice, hcClient);
    }

    /**
     * 更新终端设备模板
     *
     * 更新一个终端设备模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceTemplateByIdRequest 请求对象
     * @return UpdateDeviceTemplateByIdResponse
     */
    public UpdateDeviceTemplateByIdResponse updateDeviceTemplateById(UpdateDeviceTemplateByIdRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateDeviceTemplateById);
    }

    /**
     * 更新终端设备模板
     *
     * 更新一个终端设备模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceTemplateByIdRequest 请求对象
     * @return SyncInvoker<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse>
     */
    public SyncInvoker<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> updateDeviceTemplateByIdInvoker(
        UpdateDeviceTemplateByIdRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateDeviceTemplateById, hcClient);
    }

    /**
     * 更新终端设备孪生
     *
     * 该API用于更新终端设备孪生。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceTwinRequest 请求对象
     * @return UpdateDeviceTwinResponse
     */
    public UpdateDeviceTwinResponse updateDeviceTwin(UpdateDeviceTwinRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateDeviceTwin);
    }

    /**
     * 更新终端设备孪生
     *
     * 该API用于更新终端设备孪生。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceTwinRequest 请求对象
     * @return SyncInvoker<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse>
     */
    public SyncInvoker<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> updateDeviceTwinInvoker(
        UpdateDeviceTwinRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateDeviceTwin, hcClient);
    }

    /**
     * 更新边缘节点组
     *
     * 更新边缘节点组描述。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeGroupRequest 请求对象
     * @return UpdateEdgeGroupResponse
     */
    public UpdateEdgeGroupResponse updateEdgeGroup(UpdateEdgeGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateEdgeGroup);
    }

    /**
     * 更新边缘节点组
     *
     * 更新边缘节点组描述。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeGroupRequest 请求对象
     * @return SyncInvoker<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse>
     */
    public SyncInvoker<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse> updateEdgeGroupInvoker(
        UpdateEdgeGroupRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateEdgeGroup, hcClient);
    }

    /**
     * 绑定或解绑边缘节点
     *
     * 边缘节点组绑定或解绑边缘节点。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeGroupNodeBindingRequest 请求对象
     * @return UpdateEdgeGroupNodeBindingResponse
     */
    public UpdateEdgeGroupNodeBindingResponse updateEdgeGroupNodeBinding(UpdateEdgeGroupNodeBindingRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateEdgeGroupNodeBinding);
    }

    /**
     * 绑定或解绑边缘节点
     *
     * 边缘节点组绑定或解绑边缘节点。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeGroupNodeBindingRequest 请求对象
     * @return SyncInvoker<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse>
     */
    public SyncInvoker<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse> updateEdgeGroupNodeBindingInvoker(
        UpdateEdgeGroupNodeBindingRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateEdgeGroupNodeBinding, hcClient);
    }

    /**
     * 更新边缘节点
     *
     * 该API用于更新边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeNodeRequest 请求对象
     * @return UpdateEdgeNodeResponse
     */
    public UpdateEdgeNodeResponse updateEdgeNode(UpdateEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateEdgeNode);
    }

    /**
     * 更新边缘节点
     *
     * 该API用于更新边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeNodeRequest 请求对象
     * @return SyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse>
     */
    public SyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> updateEdgeNodeInvoker(
        UpdateEdgeNodeRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateEdgeNode, hcClient);
    }

    /**
     * 更新边缘节点的终端设备
     *
     * 添加或删除边缘节点的终端设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeNodeDeviceRequest 请求对象
     * @return UpdateEdgeNodeDeviceResponse
     */
    public UpdateEdgeNodeDeviceResponse updateEdgeNodeDevice(UpdateEdgeNodeDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateEdgeNodeDevice);
    }

    /**
     * 更新边缘节点的终端设备
     *
     * 添加或删除边缘节点的终端设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeNodeDeviceRequest 请求对象
     * @return SyncInvoker<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse>
     */
    public SyncInvoker<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> updateEdgeNodeDeviceInvoker(
        UpdateEdgeNodeDeviceRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateEdgeNodeDevice, hcClient);
    }

    /**
     * 更新加密数据
     *
     * 更新加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEncryptdatasRequest 请求对象
     * @return UpdateEncryptdatasResponse
     */
    public UpdateEncryptdatasResponse updateEncryptdatas(UpdateEncryptdatasRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateEncryptdatas);
    }

    /**
     * 更新加密数据
     *
     * 更新加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEncryptdatasRequest 请求对象
     * @return SyncInvoker<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse>
     */
    public SyncInvoker<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse> updateEncryptdatasInvoker(
        UpdateEncryptdatasRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateEncryptdatas, hcClient);
    }

    /**
     * 更新终端设备的边缘节点
     *
     * 该API用于更新终端设备的边缘节点。功能与更新边缘节点的终端设备相同，推荐使用更新边缘节点的终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNodeByDeviceIdRequest 请求对象
     * @return UpdateNodeByDeviceIdResponse
     */
    public UpdateNodeByDeviceIdResponse updateNodeByDeviceId(UpdateNodeByDeviceIdRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateNodeByDeviceId);
    }

    /**
     * 更新终端设备的边缘节点
     *
     * 该API用于更新终端设备的边缘节点。功能与更新边缘节点的终端设备相同，推荐使用更新边缘节点的终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNodeByDeviceIdRequest 请求对象
     * @return SyncInvoker<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse>
     */
    public SyncInvoker<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> updateNodeByDeviceIdInvoker(
        UpdateNodeByDeviceIdRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateNodeByDeviceId, hcClient);
    }

    /**
     * 更新密钥
     *
     * 更新一个密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecretRequest 请求对象
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateSecret);
    }

    /**
     * 更新密钥
     *
     * 更新一个密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecretRequest 请求对象
     * @return SyncInvoker<UpdateSecretRequest, UpdateSecretResponse>
     */
    public SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretInvoker(UpdateSecretRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateSecret, hcClient);
    }

    /**
     * 更新服务
     *
     * 更新一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateService);
    }

    /**
     * 更新服务
     *
     * 更新一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceInvoker(UpdateServiceRequest request) {
        return new SyncInvoker<>(request, IefMeta.updateService, hcClient);
    }

    /**
     * 升级边缘节点
     *
     * 该API用于升级边缘节点。边缘节点将自动升级到最新的可用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEdgeNodeRequest 请求对象
     * @return UpgradeEdgeNodeResponse
     */
    public UpgradeEdgeNodeResponse upgradeEdgeNode(UpgradeEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.upgradeEdgeNode);
    }

    /**
     * 升级边缘节点
     *
     * 该API用于升级边缘节点。边缘节点将自动升级到最新的可用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEdgeNodeRequest 请求对象
     * @return SyncInvoker<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse>
     */
    public SyncInvoker<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse> upgradeEdgeNodeInvoker(
        UpgradeEdgeNodeRequest request) {
        return new SyncInvoker<>(request, IefMeta.upgradeEdgeNode, hcClient);
    }

}
