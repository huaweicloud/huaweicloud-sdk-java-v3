package com.huaweicloud.sdk.ief.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ief.v1.model.*;

public class IefClient {

    protected HcClient hcClient;

    public IefClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IefClient> newBuilder() {
        return new ClientBuilder<>(IefClient::new);
    }

    /** 批量添加删除资源标签 为指定实例批量添加或删除标签。 一个资源上最多有20个标签。 说明： - 此接口为幂等接口，创建时如果请求体中存在重复key则报错。 -
     * 创建时不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。 - 删除时不对标签字符集范围做校验，如果删除的标签不存在，默认处理成功。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchAddDeleteTagsRequest 请求对象
     * @return BatchAddDeleteTagsResponse */
    public BatchAddDeleteTagsResponse batchAddDeleteTags(BatchAddDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.batchAddDeleteTags);
    }

    /** 批量添加删除资源标签 为指定实例批量添加或删除标签。 一个资源上最多有20个标签。 说明： - 此接口为幂等接口，创建时如果请求体中存在重复key则报错。 -
     * 创建时不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。 - 删除时不对标签字符集范围做校验，如果删除的标签不存在，默认处理成功。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchAddDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> */
    public SyncInvoker<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> batchAddDeleteTagsInvoker(
        BatchAddDeleteTagsRequest request) {
        return new SyncInvoker<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse>(request,
            IefMeta.batchAddDeleteTags, hcClient);
    }

    /** 创建应用模板 该API用于创建一个应用模板。
     *
     * @param CreateAppRequest 请求对象
     * @return CreateAppResponse */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createApp);
    }

    /** 创建应用模板 该API用于创建一个应用模板。
     *
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse> */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, IefMeta.createApp, hcClient);
    }

    /** 创建应用模板版本 创建一个应用模板版本
     *
     * @param CreateAppVersionsRequest 请求对象
     * @return CreateAppVersionsResponse */
    public CreateAppVersionsResponse createAppVersions(CreateAppVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createAppVersions);
    }

    /** 创建应用模板版本 创建一个应用模板版本
     *
     * @param CreateAppVersionsRequest 请求对象
     * @return SyncInvoker<CreateAppVersionsRequest, CreateAppVersionsResponse> */
    public SyncInvoker<CreateAppVersionsRequest, CreateAppVersionsResponse> createAppVersionsInvoker(
        CreateAppVersionsRequest request) {
        return new SyncInvoker<CreateAppVersionsRequest, CreateAppVersionsResponse>(request, IefMeta.createAppVersions,
            hcClient);
    }

    /** 创建配置项 创建配置项
     *
     * @param CreateConfigMapRequest 请求对象
     * @return CreateConfigMapResponse */
    public CreateConfigMapResponse createConfigMap(CreateConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createConfigMap);
    }

    /** 创建配置项 创建配置项
     *
     * @param CreateConfigMapRequest 请求对象
     * @return SyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse> */
    public SyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse> createConfigMapInvoker(
        CreateConfigMapRequest request) {
        return new SyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse>(request, IefMeta.createConfigMap,
            hcClient);
    }

    /** 创建部署 创建部署
     *
     * @param CreateDeploymentsRequest 请求对象
     * @return CreateDeploymentsResponse */
    public CreateDeploymentsResponse createDeployments(CreateDeploymentsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createDeployments);
    }

    /** 创建部署 创建部署
     *
     * @param CreateDeploymentsRequest 请求对象
     * @return SyncInvoker<CreateDeploymentsRequest, CreateDeploymentsResponse> */
    public SyncInvoker<CreateDeploymentsRequest, CreateDeploymentsResponse> createDeploymentsInvoker(
        CreateDeploymentsRequest request) {
        return new SyncInvoker<CreateDeploymentsRequest, CreateDeploymentsResponse>(request, IefMeta.createDeployments,
            hcClient);
    }

    /** 注册终端设备 该API用于注册一个终端设备。
     *
     * @param CreateDeviceRequest 请求对象
     * @return CreateDeviceResponse */
    public CreateDeviceResponse createDevice(CreateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createDevice);
    }

    /** 注册终端设备 该API用于注册一个终端设备。
     *
     * @param CreateDeviceRequest 请求对象
     * @return SyncInvoker<CreateDeviceRequest, CreateDeviceResponse> */
    public SyncInvoker<CreateDeviceRequest, CreateDeviceResponse> createDeviceInvoker(CreateDeviceRequest request) {
        return new SyncInvoker<CreateDeviceRequest, CreateDeviceResponse>(request, IefMeta.createDevice, hcClient);
    }

    /** 创建终端设备模板 创建一个终端设备模板
     *
     * @param CreateDeviceTemplateRequest 请求对象
     * @return CreateDeviceTemplateResponse */
    public CreateDeviceTemplateResponse createDeviceTemplate(CreateDeviceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createDeviceTemplate);
    }

    /** 创建终端设备模板 创建一个终端设备模板
     *
     * @param CreateDeviceTemplateRequest 请求对象
     * @return SyncInvoker<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> */
    public SyncInvoker<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> createDeviceTemplateInvoker(
        CreateDeviceTemplateRequest request) {
        return new SyncInvoker<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse>(request,
            IefMeta.createDeviceTemplate, hcClient);
    }

    /** 注册边缘节点 该API用于注册一个边缘节点。接口调用成功后，您可以将响应消息体中node.package字段使用base64解码成tar.gz文件，并在控制台下载边缘核心软件，然后纳管边缘节点。
     *
     * @param CreateEdgeNodeRequest 请求对象
     * @return CreateEdgeNodeResponse */
    public CreateEdgeNodeResponse createEdgeNode(CreateEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEdgeNode);
    }

    /** 注册边缘节点 该API用于注册一个边缘节点。接口调用成功后，您可以将响应消息体中node.package字段使用base64解码成tar.gz文件，并在控制台下载边缘核心软件，然后纳管边缘节点。
     *
     * @param CreateEdgeNodeRequest 请求对象
     * @return SyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse> */
    public SyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNodeInvoker(
        CreateEdgeNodeRequest request) {
        return new SyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>(request, IefMeta.createEdgeNode,
            hcClient);
    }

    /** 创建节点证书 创建边缘节点上的应用证书和设备证书。
     *
     * @param CreateEdgeNodeCertsRequest 请求对象
     * @return CreateEdgeNodeCertsResponse */
    public CreateEdgeNodeCertsResponse createEdgeNodeCerts(CreateEdgeNodeCertsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEdgeNodeCerts);
    }

    /** 创建节点证书 创建边缘节点上的应用证书和设备证书。
     *
     * @param CreateEdgeNodeCertsRequest 请求对象
     * @return SyncInvoker<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> */
    public SyncInvoker<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> createEdgeNodeCertsInvoker(
        CreateEdgeNodeCertsRequest request) {
        return new SyncInvoker<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse>(request,
            IefMeta.createEdgeNodeCerts, hcClient);
    }

    /** 创建端点 创建一个端点
     *
     * @param CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createEndpoint);
    }

    /** 创建端点 创建一个端点
     *
     * @param CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, IefMeta.createEndpoint,
            hcClient);
    }

    /** 创建规则 创建一条规则
     *
     * @param CreateRuleRequest 请求对象
     * @return CreateRuleResponse */
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createRule);
    }

    /** 创建规则 创建一条规则
     *
     * @param CreateRuleRequest 请求对象
     * @return SyncInvoker<CreateRuleRequest, CreateRuleResponse> */
    public SyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleInvoker(CreateRuleRequest request) {
        return new SyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, IefMeta.createRule, hcClient);
    }

    /** 创建密钥 创建密钥
     *
     * @param CreateSecretRequest 请求对象
     * @return CreateSecretResponse */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createSecret);
    }

    /** 创建密钥 创建密钥
     *
     * @param CreateSecretRequest 请求对象
     * @return SyncInvoker<CreateSecretRequest, CreateSecretResponse> */
    public SyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretInvoker(CreateSecretRequest request) {
        return new SyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, IefMeta.createSecret, hcClient);
    }

    /** 创建服务 创建一个服务
     *
     * @param CreateServiceRequest 请求对象
     * @return CreateServiceResponse */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createService);
    }

    /** 创建服务 创建一个服务
     *
     * @param CreateServiceRequest 请求对象
     * @return SyncInvoker<CreateServiceRequest, CreateServiceResponse> */
    public SyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceInvoker(CreateServiceRequest request) {
        return new SyncInvoker<CreateServiceRequest, CreateServiceResponse>(request, IefMeta.createService, hcClient);
    }

    /** 添加资源标签 为资源添加标签。 一个资源上最多有20个标签。 此接口为幂等接口，创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateTagRequest 请求对象
     * @return CreateTagResponse */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.createTag);
    }

    /** 添加资源标签 为资源添加标签。 一个资源上最多有20个标签。 此接口为幂等接口，创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse> */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<CreateTagRequest, CreateTagResponse>(request, IefMeta.createTag, hcClient);
    }

    /** 删除应用模板 删除应用模板
     *
     * @param DeleteAppRequest 请求对象
     * @return DeleteAppResponse */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteApp);
    }

    /** 删除应用模板 删除应用模板
     *
     * @param DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse> */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, IefMeta.deleteApp, hcClient);
    }

    /** 删除应用版本 删除应用版本
     *
     * @param DeleteAppVersionRequest 请求对象
     * @return DeleteAppVersionResponse */
    public DeleteAppVersionResponse deleteAppVersion(DeleteAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteAppVersion);
    }

    /** 删除应用版本 删除应用版本
     *
     * @param DeleteAppVersionRequest 请求对象
     * @return SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse> */
    public SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersionInvoker(
        DeleteAppVersionRequest request) {
        return new SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>(request, IefMeta.deleteAppVersion,
            hcClient);
    }

    /** 删除配置项 删除配置项
     *
     * @param DeleteConfigMapRequest 请求对象
     * @return DeleteConfigMapResponse */
    public DeleteConfigMapResponse deleteConfigMap(DeleteConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteConfigMap);
    }

    /** 删除配置项 删除配置项
     *
     * @param DeleteConfigMapRequest 请求对象
     * @return SyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse> */
    public SyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse> deleteConfigMapInvoker(
        DeleteConfigMapRequest request) {
        return new SyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse>(request, IefMeta.deleteConfigMap,
            hcClient);
    }

    /** 删除部署 删除应用部署
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return DeleteDeploymentResponse */
    public DeleteDeploymentResponse deleteDeployment(DeleteDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteDeployment);
    }

    /** 删除部署 删除应用部署
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> */
    public SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeploymentInvoker(
        DeleteDeploymentRequest request) {
        return new SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>(request, IefMeta.deleteDeployment,
            hcClient);
    }

    /** 删除终端设备 该API用于删除终端设备。
     *
     * @param DeleteDeviceRequest 请求对象
     * @return DeleteDeviceResponse */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteDevice);
    }

    /** 删除终端设备 该API用于删除终端设备。
     *
     * @param DeleteDeviceRequest 请求对象
     * @return SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> */
    public SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceInvoker(DeleteDeviceRequest request) {
        return new SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, IefMeta.deleteDevice, hcClient);
    }

    /** 删除终端设备模板 删除终端设备模板
     *
     * @param DeleteDeviceTemplateRequest 请求对象
     * @return DeleteDeviceTemplateResponse */
    public DeleteDeviceTemplateResponse deleteDeviceTemplate(DeleteDeviceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteDeviceTemplate);
    }

    /** 删除终端设备模板 删除终端设备模板
     *
     * @param DeleteDeviceTemplateRequest 请求对象
     * @return SyncInvoker<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> */
    public SyncInvoker<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> deleteDeviceTemplateInvoker(
        DeleteDeviceTemplateRequest request) {
        return new SyncInvoker<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse>(request,
            IefMeta.deleteDeviceTemplate, hcClient);
    }

    /** 删除边缘节点 删除边缘节点
     *
     * @param DeleteEdgeNodeRequest 请求对象
     * @return DeleteEdgeNodeResponse */
    public DeleteEdgeNodeResponse deleteEdgeNode(DeleteEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEdgeNode);
    }

    /** 删除边缘节点 删除边缘节点
     *
     * @param DeleteEdgeNodeRequest 请求对象
     * @return SyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> */
    public SyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNodeInvoker(
        DeleteEdgeNodeRequest request) {
        return new SyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>(request, IefMeta.deleteEdgeNode,
            hcClient);
    }

    /** 删除节点证书 删除边缘节点上的证书（目前只支持删除应用证书和设备证书）
     *
     * @param DeleteEdgeNodeCertsRequest 请求对象
     * @return DeleteEdgeNodeCertsResponse */
    public DeleteEdgeNodeCertsResponse deleteEdgeNodeCerts(DeleteEdgeNodeCertsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEdgeNodeCerts);
    }

    /** 删除节点证书 删除边缘节点上的证书（目前只支持删除应用证书和设备证书）
     *
     * @param DeleteEdgeNodeCertsRequest 请求对象
     * @return SyncInvoker<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> */
    public SyncInvoker<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> deleteEdgeNodeCertsInvoker(
        DeleteEdgeNodeCertsRequest request) {
        return new SyncInvoker<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse>(request,
            IefMeta.deleteEdgeNodeCerts, hcClient);
    }

    /** 删除一个端点 删除一个端点
     *
     * @param DeleteEndPointRequest 请求对象
     * @return DeleteEndPointResponse */
    public DeleteEndPointResponse deleteEndPoint(DeleteEndPointRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteEndPoint);
    }

    /** 删除一个端点 删除一个端点
     *
     * @param DeleteEndPointRequest 请求对象
     * @return SyncInvoker<DeleteEndPointRequest, DeleteEndPointResponse> */
    public SyncInvoker<DeleteEndPointRequest, DeleteEndPointResponse> deleteEndPointInvoker(
        DeleteEndPointRequest request) {
        return new SyncInvoker<DeleteEndPointRequest, DeleteEndPointResponse>(request, IefMeta.deleteEndPoint,
            hcClient);
    }

    /** 删除资源标签 删除资源标签。删除时不对标签字符集做校验，调用前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return DeleteResourceTagResponse */
    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteResourceTag);
    }

    /** 删除资源标签 删除资源标签。删除时不对标签字符集做校验，调用前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, IefMeta.deleteResourceTag,
            hcClient);
    }

    /** 删除规则 删除一条规则
     *
     * @param DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteRule);
    }

    /** 删除规则 删除一条规则
     *
     * @param DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, IefMeta.deleteRule, hcClient);
    }

    /** 删除密钥 删除密钥
     *
     * @param DeleteSecretRequest 请求对象
     * @return DeleteSecretResponse */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteSecret);
    }

    /** 删除密钥 删除密钥
     *
     * @param DeleteSecretRequest 请求对象
     * @return SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> */
    public SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretInvoker(DeleteSecretRequest request) {
        return new SyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, IefMeta.deleteSecret, hcClient);
    }

    /** 删除服务 删除一个服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return DeleteServiceResponse */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.deleteService);
    }

    /** 删除服务 删除一个服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> */
    public SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceInvoker(DeleteServiceRequest request) {
        return new SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>(request, IefMeta.deleteService, hcClient);
    }

    /** 启用停用边缘节点 该API用于启用停用边缘节点。被停用的边缘节点将无法连接到云端服务，可用该URI启用边缘节点恢复连接。
     *
     * @param EnableDisableEdgeNodesRequest 请求对象
     * @return EnableDisableEdgeNodesResponse */
    public EnableDisableEdgeNodesResponse enableDisableEdgeNodes(EnableDisableEdgeNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.enableDisableEdgeNodes);
    }

    /** 启用停用边缘节点 该API用于启用停用边缘节点。被停用的边缘节点将无法连接到云端服务，可用该URI启用边缘节点恢复连接。
     *
     * @param EnableDisableEdgeNodesRequest 请求对象
     * @return SyncInvoker<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> */
    public SyncInvoker<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> enableDisableEdgeNodesInvoker(
        EnableDisableEdgeNodesRequest request) {
        return new SyncInvoker<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse>(request,
            IefMeta.enableDisableEdgeNodes, hcClient);
    }

    /** 查询应用模板版本列表 查询应用模板版本列表
     *
     * @param ListAppVersionsRequest 请求对象
     * @return ListAppVersionsResponse */
    public ListAppVersionsResponse listAppVersions(ListAppVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listAppVersions);
    }

    /** 查询应用模板版本列表 查询应用模板版本列表
     *
     * @param ListAppVersionsRequest 请求对象
     * @return SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse> */
    public SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersionsInvoker(
        ListAppVersionsRequest request) {
        return new SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>(request, IefMeta.listAppVersions,
            hcClient);
    }

    /** 查询应用模板列表 查询应用模板列表
     *
     * @param ListAppsRequest 请求对象
     * @return ListAppsResponse */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listApps);
    }

    /** 查询应用模板列表 查询应用模板列表
     *
     * @param ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse> */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<ListAppsRequest, ListAppsResponse>(request, IefMeta.listApps, hcClient);
    }

    /** 查询配置项列表 查询配置项列表
     *
     * @param ListConfigMapsRequest 请求对象
     * @return ListConfigMapsResponse */
    public ListConfigMapsResponse listConfigMaps(ListConfigMapsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listConfigMaps);
    }

    /** 查询配置项列表 查询配置项列表
     *
     * @param ListConfigMapsRequest 请求对象
     * @return SyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse> */
    public SyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse> listConfigMapsInvoker(
        ListConfigMapsRequest request) {
        return new SyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse>(request, IefMeta.listConfigMaps,
            hcClient);
    }

    /** 查询部署列表 查询部署列表
     *
     * @param ListDeploymentsRequest 请求对象
     * @return ListDeploymentsResponse */
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listDeployments);
    }

    /** 查询部署列表 查询部署列表
     *
     * @param ListDeploymentsRequest 请求对象
     * @return SyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse> */
    public SyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse> listDeploymentsInvoker(
        ListDeploymentsRequest request) {
        return new SyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>(request, IefMeta.listDeployments,
            hcClient);
    }

    /** 查询终端设备模板列表 查询终端设备模板列表
     *
     * @param ListDeviceTemplatesRequest 请求对象
     * @return ListDeviceTemplatesResponse */
    public ListDeviceTemplatesResponse listDeviceTemplates(ListDeviceTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listDeviceTemplates);
    }

    /** 查询终端设备模板列表 查询终端设备模板列表
     *
     * @param ListDeviceTemplatesRequest 请求对象
     * @return SyncInvoker<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> */
    public SyncInvoker<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> listDeviceTemplatesInvoker(
        ListDeviceTemplatesRequest request) {
        return new SyncInvoker<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse>(request,
            IefMeta.listDeviceTemplates, hcClient);
    }

    /** 查询终端设备列表 该API用于查询终端设备列表。
     *
     * @param ListDevicesRequest 请求对象
     * @return ListDevicesResponse */
    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listDevices);
    }

    /** 查询终端设备列表 该API用于查询终端设备列表。
     *
     * @param ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse> */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, IefMeta.listDevices, hcClient);
    }

    /** 查询节点证书 查询边缘节点上的应用证书和设备证书。
     *
     * @param ListEdgeNodeCertsRequest 请求对象
     * @return ListEdgeNodeCertsResponse */
    public ListEdgeNodeCertsResponse listEdgeNodeCerts(ListEdgeNodeCertsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEdgeNodeCerts);
    }

    /** 查询节点证书 查询边缘节点上的应用证书和设备证书。
     *
     * @param ListEdgeNodeCertsRequest 请求对象
     * @return SyncInvoker<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> */
    public SyncInvoker<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> listEdgeNodeCertsInvoker(
        ListEdgeNodeCertsRequest request) {
        return new SyncInvoker<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse>(request, IefMeta.listEdgeNodeCerts,
            hcClient);
    }

    /** 查询边缘节点列表 该API用于查询边缘节点。 - 如果不携带任何检索参数，将返回该租户的所有边缘节点信息。 -
     * app_name和tags不支持复合查询，如果同时存在则返回tags查询结果，可以同时携带多个其他检索参数，可同时生效。
     *
     * @param ListEdgeNodesRequest 请求对象
     * @return ListEdgeNodesResponse */
    public ListEdgeNodesResponse listEdgeNodes(ListEdgeNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEdgeNodes);
    }

    /** 查询边缘节点列表 该API用于查询边缘节点。 - 如果不携带任何检索参数，将返回该租户的所有边缘节点信息。 -
     * app_name和tags不支持复合查询，如果同时存在则返回tags查询结果，可以同时携带多个其他检索参数，可同时生效。
     *
     * @param ListEdgeNodesRequest 请求对象
     * @return SyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse> */
    public SyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodesInvoker(ListEdgeNodesRequest request) {
        return new SyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>(request, IefMeta.listEdgeNodes, hcClient);
    }

    /** 查询端点列表 获取所有的端点详情。 如果不携带任何检索参数，将返回该租户的所有端点信息和系统中所有的共享端点。 如果同时指定is_shared&#x3D;true和其他参数，同样还会对name、type进行过滤。
     *
     * @param ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listEndpoints);
    }

    /** 查询端点列表 获取所有的端点详情。 如果不携带任何检索参数，将返回该租户的所有端点信息和系统中所有的共享端点。 如果同时指定is_shared&#x3D;true和其他参数，同样还会对name、type进行过滤。
     *
     * @param ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>(request, IefMeta.listEndpoints, hcClient);
    }

    /** 查询应用实例列表 查询应用实例列表
     *
     * @param ListPodsRequest 请求对象
     * @return ListPodsResponse */
    public ListPodsResponse listPods(ListPodsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listPods);
    }

    /** 查询应用实例列表 查询应用实例列表
     *
     * @param ListPodsRequest 请求对象
     * @return SyncInvoker<ListPodsRequest, ListPodsResponse> */
    public SyncInvoker<ListPodsRequest, ListPodsResponse> listPodsInvoker(ListPodsRequest request) {
        return new SyncInvoker<ListPodsRequest, ListPodsResponse>(request, IefMeta.listPods, hcClient);
    }

    /** 查询资源实例 使用标签过滤实例
     *
     * @param ListResourceByTagsRequest 请求对象
     * @return ListResourceByTagsResponse */
    public ListResourceByTagsResponse listResourceByTags(ListResourceByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listResourceByTags);
    }

    /** 查询资源实例 使用标签过滤实例
     *
     * @param ListResourceByTagsRequest 请求对象
     * @return SyncInvoker<ListResourceByTagsRequest, ListResourceByTagsResponse> */
    public SyncInvoker<ListResourceByTagsRequest, ListResourceByTagsResponse> listResourceByTagsInvoker(
        ListResourceByTagsRequest request) {
        return new SyncInvoker<ListResourceByTagsRequest, ListResourceByTagsResponse>(request,
            IefMeta.listResourceByTags, hcClient);
    }

    /** 查询规则错误列表 查询特定规则下的所有错误列表
     *
     * @param ListRuleErrorsRequest 请求对象
     * @return ListRuleErrorsResponse */
    public ListRuleErrorsResponse listRuleErrors(ListRuleErrorsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listRuleErrors);
    }

    /** 查询规则错误列表 查询特定规则下的所有错误列表
     *
     * @param ListRuleErrorsRequest 请求对象
     * @return SyncInvoker<ListRuleErrorsRequest, ListRuleErrorsResponse> */
    public SyncInvoker<ListRuleErrorsRequest, ListRuleErrorsResponse> listRuleErrorsInvoker(
        ListRuleErrorsRequest request) {
        return new SyncInvoker<ListRuleErrorsRequest, ListRuleErrorsResponse>(request, IefMeta.listRuleErrors,
            hcClient);
    }

    /** 查询规则列表 查询到所有的规则
     *
     * @param ListRulesRequest 请求对象
     * @return ListRulesResponse */
    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listRules);
    }

    /** 查询规则列表 查询到所有的规则
     *
     * @param ListRulesRequest 请求对象
     * @return SyncInvoker<ListRulesRequest, ListRulesResponse> */
    public SyncInvoker<ListRulesRequest, ListRulesResponse> listRulesInvoker(ListRulesRequest request) {
        return new SyncInvoker<ListRulesRequest, ListRulesResponse>(request, IefMeta.listRules, hcClient);
    }

    /** 查询密钥列表 查询密钥列表
     *
     * @param ListSecretsRequest 请求对象
     * @return ListSecretsResponse */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listSecrets);
    }

    /** 查询密钥列表 查询密钥列表
     *
     * @param ListSecretsRequest 请求对象
     * @return SyncInvoker<ListSecretsRequest, ListSecretsResponse> */
    public SyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsInvoker(ListSecretsRequest request) {
        return new SyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, IefMeta.listSecrets, hcClient);
    }

    /** 查询服务列表 获取所有的服务详情
     *
     * @param ListServicesRequest 请求对象
     * @return ListServicesResponse */
    public ListServicesResponse listServices(ListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listServices);
    }

    /** 查询服务列表 获取所有的服务详情
     *
     * @param ListServicesRequest 请求对象
     * @return SyncInvoker<ListServicesRequest, ListServicesResponse> */
    public SyncInvoker<ListServicesRequest, ListServicesResponse> listServicesInvoker(ListServicesRequest request) {
        return new SyncInvoker<ListServicesRequest, ListServicesResponse>(request, IefMeta.listServices, hcClient);
    }

    /** 查询资源标签 查询指定实例的标签信息
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listTags);
    }

    /** 查询资源标签 查询指定实例的标签信息
     *
     * @param ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse> */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<ListTagsRequest, ListTagsResponse>(request, IefMeta.listTags, hcClient);
    }

    /** 查询项目标签 查询指定项目中实例类型的所有资源标签集合
     *
     * @param ListTagsByResourceTypeRequest 请求对象
     * @return ListTagsByResourceTypeResponse */
    public ListTagsByResourceTypeResponse listTagsByResourceType(ListTagsByResourceTypeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.listTagsByResourceType);
    }

    /** 查询项目标签 查询指定项目中实例类型的所有资源标签集合
     *
     * @param ListTagsByResourceTypeRequest 请求对象
     * @return SyncInvoker<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> */
    public SyncInvoker<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> listTagsByResourceTypeInvoker(
        ListTagsByResourceTypeRequest request) {
        return new SyncInvoker<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse>(request,
            IefMeta.listTagsByResourceType, hcClient);
    }

    /** 查询应用模板详情 查询应用模板详情。
     *
     * @param ShowAppDetailRequest 请求对象
     * @return ShowAppDetailResponse */
    public ShowAppDetailResponse showAppDetail(ShowAppDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showAppDetail);
    }

    /** 查询应用模板详情 查询应用模板详情。
     *
     * @param ShowAppDetailRequest 请求对象
     * @return SyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse> */
    public SyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse> showAppDetailInvoker(ShowAppDetailRequest request) {
        return new SyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse>(request, IefMeta.showAppDetail, hcClient);
    }

    /** 查询应用模板版本详情 查询应用模板版本详情
     *
     * @param ShowAppVersionDetailRequest 请求对象
     * @return ShowAppVersionDetailResponse */
    public ShowAppVersionDetailResponse showAppVersionDetail(ShowAppVersionDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showAppVersionDetail);
    }

    /** 查询应用模板版本详情 查询应用模板版本详情
     *
     * @param ShowAppVersionDetailRequest 请求对象
     * @return SyncInvoker<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> */
    public SyncInvoker<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> showAppVersionDetailInvoker(
        ShowAppVersionDetailRequest request) {
        return new SyncInvoker<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse>(request,
            IefMeta.showAppVersionDetail, hcClient);
    }

    /** 查询配置项详情 查询一个配置项详情
     *
     * @param ShowConfigMapRequest 请求对象
     * @return ShowConfigMapResponse */
    public ShowConfigMapResponse showConfigMap(ShowConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showConfigMap);
    }

    /** 查询配置项详情 查询一个配置项详情
     *
     * @param ShowConfigMapRequest 请求对象
     * @return SyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse> */
    public SyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse> showConfigMapInvoker(ShowConfigMapRequest request) {
        return new SyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse>(request, IefMeta.showConfigMap, hcClient);
    }

    /** 查询应用部署 查询应用部署
     *
     * @param ShowDeploymentRequest 请求对象
     * @return ShowDeploymentResponse */
    public ShowDeploymentResponse showDeployment(ShowDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showDeployment);
    }

    /** 查询应用部署 查询应用部署
     *
     * @param ShowDeploymentRequest 请求对象
     * @return SyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse> */
    public SyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse> showDeploymentInvoker(
        ShowDeploymentRequest request) {
        return new SyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse>(request, IefMeta.showDeployment,
            hcClient);
    }

    /** 查询终端设备详情 该API用于查询终端设备详情。
     *
     * @param ShowDeviceRequest 请求对象
     * @return ShowDeviceResponse */
    public ShowDeviceResponse showDevice(ShowDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showDevice);
    }

    /** 查询终端设备详情 该API用于查询终端设备详情。
     *
     * @param ShowDeviceRequest 请求对象
     * @return SyncInvoker<ShowDeviceRequest, ShowDeviceResponse> */
    public SyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceInvoker(ShowDeviceRequest request) {
        return new SyncInvoker<ShowDeviceRequest, ShowDeviceResponse>(request, IefMeta.showDevice, hcClient);
    }

    /** 查询终端设备模板 查询一个终端设备模板
     *
     * @param ShowDeviceTemplateRequest 请求对象
     * @return ShowDeviceTemplateResponse */
    public ShowDeviceTemplateResponse showDeviceTemplate(ShowDeviceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showDeviceTemplate);
    }

    /** 查询终端设备模板 查询一个终端设备模板
     *
     * @param ShowDeviceTemplateRequest 请求对象
     * @return SyncInvoker<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> */
    public SyncInvoker<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> showDeviceTemplateInvoker(
        ShowDeviceTemplateRequest request) {
        return new SyncInvoker<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse>(request,
            IefMeta.showDeviceTemplate, hcClient);
    }

    /** 查询终端设备孪生 该API用于查询终端设备孪生。
     *
     * @param ShowDeviceTwinRequest 请求对象
     * @return ShowDeviceTwinResponse */
    public ShowDeviceTwinResponse showDeviceTwin(ShowDeviceTwinRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showDeviceTwin);
    }

    /** 查询终端设备孪生 该API用于查询终端设备孪生。
     *
     * @param ShowDeviceTwinRequest 请求对象
     * @return SyncInvoker<ShowDeviceTwinRequest, ShowDeviceTwinResponse> */
    public SyncInvoker<ShowDeviceTwinRequest, ShowDeviceTwinResponse> showDeviceTwinInvoker(
        ShowDeviceTwinRequest request) {
        return new SyncInvoker<ShowDeviceTwinRequest, ShowDeviceTwinResponse>(request, IefMeta.showDeviceTwin,
            hcClient);
    }

    /** 查询边缘节点详情 该API用于查询边缘节点详情。
     *
     * @param ShowEdgeNodeDetailRequest 请求对象
     * @return ShowEdgeNodeDetailResponse */
    public ShowEdgeNodeDetailResponse showEdgeNodeDetail(ShowEdgeNodeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showEdgeNodeDetail);
    }

    /** 查询边缘节点详情 该API用于查询边缘节点详情。
     *
     * @param ShowEdgeNodeDetailRequest 请求对象
     * @return SyncInvoker<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> */
    public SyncInvoker<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> showEdgeNodeDetailInvoker(
        ShowEdgeNodeDetailRequest request) {
        return new SyncInvoker<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse>(request,
            IefMeta.showEdgeNodeDetail, hcClient);
    }

    /** 查询端点详情 查询一个端点的详情
     *
     * @param ShowEndPointDetailRequest 请求对象
     * @return ShowEndPointDetailResponse */
    public ShowEndPointDetailResponse showEndPointDetail(ShowEndPointDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showEndPointDetail);
    }

    /** 查询端点详情 查询一个端点的详情
     *
     * @param ShowEndPointDetailRequest 请求对象
     * @return SyncInvoker<ShowEndPointDetailRequest, ShowEndPointDetailResponse> */
    public SyncInvoker<ShowEndPointDetailRequest, ShowEndPointDetailResponse> showEndPointDetailInvoker(
        ShowEndPointDetailRequest request) {
        return new SyncInvoker<ShowEndPointDetailRequest, ShowEndPointDetailResponse>(request,
            IefMeta.showEndPointDetail, hcClient);
    }

    /** 查询规则详情 获取一条规则的详情
     *
     * @param ShowRuleDetailRequest 请求对象
     * @return ShowRuleDetailResponse */
    public ShowRuleDetailResponse showRuleDetail(ShowRuleDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showRuleDetail);
    }

    /** 查询规则详情 获取一条规则的详情
     *
     * @param ShowRuleDetailRequest 请求对象
     * @return SyncInvoker<ShowRuleDetailRequest, ShowRuleDetailResponse> */
    public SyncInvoker<ShowRuleDetailRequest, ShowRuleDetailResponse> showRuleDetailInvoker(
        ShowRuleDetailRequest request) {
        return new SyncInvoker<ShowRuleDetailRequest, ShowRuleDetailResponse>(request, IefMeta.showRuleDetail,
            hcClient);
    }

    /** 查询密钥详情 查询一个密钥详情
     *
     * @param ShowSecretRequest 请求对象
     * @return ShowSecretResponse */
    public ShowSecretResponse showSecret(ShowSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showSecret);
    }

    /** 查询密钥详情 查询一个密钥详情
     *
     * @param ShowSecretRequest 请求对象
     * @return SyncInvoker<ShowSecretRequest, ShowSecretResponse> */
    public SyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretInvoker(ShowSecretRequest request) {
        return new SyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, IefMeta.showSecret, hcClient);
    }

    /** 查询服务详情 查询一个服务的详情
     *
     * @param ShowServiceDetailRequest 请求对象
     * @return ShowServiceDetailResponse */
    public ShowServiceDetailResponse showServiceDetail(ShowServiceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.showServiceDetail);
    }

    /** 查询服务详情 查询一个服务的详情
     *
     * @param ShowServiceDetailRequest 请求对象
     * @return SyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse> */
    public SyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse> showServiceDetailInvoker(
        ShowServiceDetailRequest request) {
        return new SyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse>(request, IefMeta.showServiceDetail,
            hcClient);
    }

    /** 启用规则 启用一条规则
     *
     * @param StartRuleRequest 请求对象
     * @return StartRuleResponse */
    public StartRuleResponse startRule(StartRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.startRule);
    }

    /** 启用规则 启用一条规则
     *
     * @param StartRuleRequest 请求对象
     * @return SyncInvoker<StartRuleRequest, StartRuleResponse> */
    public SyncInvoker<StartRuleRequest, StartRuleResponse> startRuleInvoker(StartRuleRequest request) {
        return new SyncInvoker<StartRuleRequest, StartRuleResponse>(request, IefMeta.startRule, hcClient);
    }

    /** 停用规则 停用一条规则
     *
     * @param StopRuleRequest 请求对象
     * @return StopRuleResponse */
    public StopRuleResponse stopRule(StopRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.stopRule);
    }

    /** 停用规则 停用一条规则
     *
     * @param StopRuleRequest 请求对象
     * @return SyncInvoker<StopRuleRequest, StopRuleResponse> */
    public SyncInvoker<StopRuleRequest, StopRuleResponse> stopRuleInvoker(StopRuleRequest request) {
        return new SyncInvoker<StopRuleRequest, StopRuleResponse>(request, IefMeta.stopRule, hcClient);
    }

    /** 更新应用模板 更新一个应用模板。
     *
     * @param UpdateAppRequest 请求对象
     * @return UpdateAppResponse */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateApp);
    }

    /** 更新应用模板 更新一个应用模板。
     *
     * @param UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse> */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, IefMeta.updateApp, hcClient);
    }

    /** 更新应用模板版本 更新一个应用模板版本
     *
     * @param UpdateAppVersionRequest 请求对象
     * @return UpdateAppVersionResponse */
    public UpdateAppVersionResponse updateAppVersion(UpdateAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateAppVersion);
    }

    /** 更新应用模板版本 更新一个应用模板版本
     *
     * @param UpdateAppVersionRequest 请求对象
     * @return SyncInvoker<UpdateAppVersionRequest, UpdateAppVersionResponse> */
    public SyncInvoker<UpdateAppVersionRequest, UpdateAppVersionResponse> updateAppVersionInvoker(
        UpdateAppVersionRequest request) {
        return new SyncInvoker<UpdateAppVersionRequest, UpdateAppVersionResponse>(request, IefMeta.updateAppVersion,
            hcClient);
    }

    /** 更新配置项 更新一个配置项
     *
     * @param UpdateConfigMapRequest 请求对象
     * @return UpdateConfigMapResponse */
    public UpdateConfigMapResponse updateConfigMap(UpdateConfigMapRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateConfigMap);
    }

    /** 更新配置项 更新一个配置项
     *
     * @param UpdateConfigMapRequest 请求对象
     * @return SyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse> */
    public SyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse> updateConfigMapInvoker(
        UpdateConfigMapRequest request) {
        return new SyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse>(request, IefMeta.updateConfigMap,
            hcClient);
    }

    /** 更新应用部署 修改应用部署
     *
     * @param UpdateDeploymentRequest 请求对象
     * @return UpdateDeploymentResponse */
    public UpdateDeploymentResponse updateDeployment(UpdateDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateDeployment);
    }

    /** 更新应用部署 修改应用部署
     *
     * @param UpdateDeploymentRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse> */
    public SyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse> updateDeploymentInvoker(
        UpdateDeploymentRequest request) {
        return new SyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse>(request, IefMeta.updateDeployment,
            hcClient);
    }

    /** 更新终端设备 更新一个终端设备。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateDevice);
    }

    /** 更新终端设备 更新一个终端设备。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, IefMeta.updateDevice, hcClient);
    }

    /** 更新终端设备模板 更新一个终端设备模板。
     *
     * @param UpdateDeviceTemplateByIdRequest 请求对象
     * @return UpdateDeviceTemplateByIdResponse */
    public UpdateDeviceTemplateByIdResponse updateDeviceTemplateById(UpdateDeviceTemplateByIdRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateDeviceTemplateById);
    }

    /** 更新终端设备模板 更新一个终端设备模板。
     *
     * @param UpdateDeviceTemplateByIdRequest 请求对象
     * @return SyncInvoker<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> */
    public SyncInvoker<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> updateDeviceTemplateByIdInvoker(
        UpdateDeviceTemplateByIdRequest request) {
        return new SyncInvoker<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse>(request,
            IefMeta.updateDeviceTemplateById, hcClient);
    }

    /** 更新终端设备孪生 该API用于更新终端设备孪生。
     *
     * @param UpdateDeviceTwinRequest 请求对象
     * @return UpdateDeviceTwinResponse */
    public UpdateDeviceTwinResponse updateDeviceTwin(UpdateDeviceTwinRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateDeviceTwin);
    }

    /** 更新终端设备孪生 该API用于更新终端设备孪生。
     *
     * @param UpdateDeviceTwinRequest 请求对象
     * @return SyncInvoker<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> */
    public SyncInvoker<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> updateDeviceTwinInvoker(
        UpdateDeviceTwinRequest request) {
        return new SyncInvoker<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse>(request, IefMeta.updateDeviceTwin,
            hcClient);
    }

    /** 更新边缘节点 该API用于更新边缘节点。
     *
     * @param UpdateEdgeNodeRequest 请求对象
     * @return UpdateEdgeNodeResponse */
    public UpdateEdgeNodeResponse updateEdgeNode(UpdateEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateEdgeNode);
    }

    /** 更新边缘节点 该API用于更新边缘节点。
     *
     * @param UpdateEdgeNodeRequest 请求对象
     * @return SyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> */
    public SyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> updateEdgeNodeInvoker(
        UpdateEdgeNodeRequest request) {
        return new SyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse>(request, IefMeta.updateEdgeNode,
            hcClient);
    }

    /** 更新边缘节点的终端设备 添加或删除边缘节点的终端设备
     *
     * @param UpdateEdgeNodeDeviceRequest 请求对象
     * @return UpdateEdgeNodeDeviceResponse */
    public UpdateEdgeNodeDeviceResponse updateEdgeNodeDevice(UpdateEdgeNodeDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateEdgeNodeDevice);
    }

    /** 更新边缘节点的终端设备 添加或删除边缘节点的终端设备
     *
     * @param UpdateEdgeNodeDeviceRequest 请求对象
     * @return SyncInvoker<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> */
    public SyncInvoker<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> updateEdgeNodeDeviceInvoker(
        UpdateEdgeNodeDeviceRequest request) {
        return new SyncInvoker<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse>(request,
            IefMeta.updateEdgeNodeDevice, hcClient);
    }

    /** 更新终端设备的边缘节点 该API用于更新终端设备的边缘节点。功能与更新边缘节点的终端设备相同，推荐使用更新边缘节点的终端设备。
     *
     * @param UpdateNodeByDeviceIdRequest 请求对象
     * @return UpdateNodeByDeviceIdResponse */
    public UpdateNodeByDeviceIdResponse updateNodeByDeviceId(UpdateNodeByDeviceIdRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateNodeByDeviceId);
    }

    /** 更新终端设备的边缘节点 该API用于更新终端设备的边缘节点。功能与更新边缘节点的终端设备相同，推荐使用更新边缘节点的终端设备。
     *
     * @param UpdateNodeByDeviceIdRequest 请求对象
     * @return SyncInvoker<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> */
    public SyncInvoker<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> updateNodeByDeviceIdInvoker(
        UpdateNodeByDeviceIdRequest request) {
        return new SyncInvoker<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse>(request,
            IefMeta.updateNodeByDeviceId, hcClient);
    }

    /** 更新密钥 更新一个密钥
     *
     * @param UpdateSecretRequest 请求对象
     * @return UpdateSecretResponse */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateSecret);
    }

    /** 更新密钥 更新一个密钥
     *
     * @param UpdateSecretRequest 请求对象
     * @return SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> */
    public SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretInvoker(UpdateSecretRequest request) {
        return new SyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, IefMeta.updateSecret, hcClient);
    }

    /** 更新服务 更新一个服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return UpdateServiceResponse */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IefMeta.updateService);
    }

    /** 更新服务 更新一个服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> */
    public SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceInvoker(UpdateServiceRequest request) {
        return new SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>(request, IefMeta.updateService, hcClient);
    }

}
