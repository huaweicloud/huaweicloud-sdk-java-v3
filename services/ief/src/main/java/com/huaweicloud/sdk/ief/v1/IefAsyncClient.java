package com.huaweicloud.sdk.ief.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ief.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class IefAsyncClient {

    protected HcClient hcClient;

    public IefAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IefAsyncClient> newBuilder() {
        return new ClientBuilder<>(IefAsyncClient::new);
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
     * @param BatchAddDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchAddDeleteTagsResponse>
     */
    public CompletableFuture<BatchAddDeleteTagsResponse> batchAddDeleteTagsAsync(BatchAddDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.batchAddDeleteTags);
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
     * @param BatchAddDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse>
     */
    public AsyncInvoker<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> batchAddDeleteTagsAsyncInvoker(
        BatchAddDeleteTagsRequest request) {
        return new AsyncInvoker<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse>(request,
            IefMeta.batchAddDeleteTags, hcClient);
    }

    /**
     * 创建应用模板
     *
     * 该API用于创建一个应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createApp);
    }

    /**
     * 创建应用模板
     *
     * 该API用于创建一个应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<CreateAppRequest, CreateAppResponse>(request, IefMeta.createApp, hcClient);
    }

    /**
     * 创建应用模板版本
     *
     * 创建一个应用模板版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppVersionsRequest 请求对象
     * @return CompletableFuture<CreateAppVersionsResponse>
     */
    public CompletableFuture<CreateAppVersionsResponse> createAppVersionsAsync(CreateAppVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createAppVersions);
    }

    /**
     * 创建应用模板版本
     *
     * 创建一个应用模板版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppVersionsRequest 请求对象
     * @return AsyncInvoker<CreateAppVersionsRequest, CreateAppVersionsResponse>
     */
    public AsyncInvoker<CreateAppVersionsRequest, CreateAppVersionsResponse> createAppVersionsAsyncInvoker(
        CreateAppVersionsRequest request) {
        return new AsyncInvoker<CreateAppVersionsRequest, CreateAppVersionsResponse>(request, IefMeta.createAppVersions,
            hcClient);
    }

    /**
     * 创建批量处理任务
     *
     * 创建批量处理作业。该API用于创建批量处理作业，当前支持：批量节点升级、批量应用部署、批量应用升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return CompletableFuture<CreateBatchJobResponse>
     */
    public CompletableFuture<CreateBatchJobResponse> createBatchJobAsync(CreateBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createBatchJob);
    }

    /**
     * 创建批量处理任务
     *
     * 创建批量处理作业。该API用于创建批量处理作业，当前支持：批量节点升级、批量应用部署、批量应用升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>
     */
    public AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJobAsyncInvoker(
        CreateBatchJobRequest request) {
        return new AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>(request, IefMeta.createBatchJob,
            hcClient);
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
        return hcClient.asyncInvokeHttp(request, IefMeta.createConfigMap);
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
        return new AsyncInvoker<CreateConfigMapRequest, CreateConfigMapResponse>(request, IefMeta.createConfigMap,
            hcClient);
    }

    /**
     * 创建部署
     *
     * 创建部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentsRequest 请求对象
     * @return CompletableFuture<CreateDeploymentsResponse>
     */
    public CompletableFuture<CreateDeploymentsResponse> createDeploymentsAsync(CreateDeploymentsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createDeployments);
    }

    /**
     * 创建部署
     *
     * 创建部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentsRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentsRequest, CreateDeploymentsResponse>
     */
    public AsyncInvoker<CreateDeploymentsRequest, CreateDeploymentsResponse> createDeploymentsAsyncInvoker(
        CreateDeploymentsRequest request) {
        return new AsyncInvoker<CreateDeploymentsRequest, CreateDeploymentsResponse>(request, IefMeta.createDeployments,
            hcClient);
    }

    /**
     * 注册终端设备
     *
     * 注册终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeviceRequest 请求对象
     * @return CompletableFuture<CreateDeviceResponse>
     */
    public CompletableFuture<CreateDeviceResponse> createDeviceAsync(CreateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createDevice);
    }

    /**
     * 注册终端设备
     *
     * 注册终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeviceRequest 请求对象
     * @return AsyncInvoker<CreateDeviceRequest, CreateDeviceResponse>
     */
    public AsyncInvoker<CreateDeviceRequest, CreateDeviceResponse> createDeviceAsyncInvoker(
        CreateDeviceRequest request) {
        return new AsyncInvoker<CreateDeviceRequest, CreateDeviceResponse>(request, IefMeta.createDevice, hcClient);
    }

    /**
     * 创建终端设备模板
     *
     * 创建一个终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeviceTemplateRequest 请求对象
     * @return CompletableFuture<CreateDeviceTemplateResponse>
     */
    public CompletableFuture<CreateDeviceTemplateResponse> createDeviceTemplateAsync(
        CreateDeviceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createDeviceTemplate);
    }

    /**
     * 创建终端设备模板
     *
     * 创建一个终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeviceTemplateRequest 请求对象
     * @return AsyncInvoker<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse>
     */
    public AsyncInvoker<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> createDeviceTemplateAsyncInvoker(
        CreateDeviceTemplateRequest request) {
        return new AsyncInvoker<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse>(request,
            IefMeta.createDeviceTemplate, hcClient);
    }

    /**
     * 边缘节点组管理
     *
     * 创建边缘节点组。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeGroupRequest 请求对象
     * @return CompletableFuture<CreateEdgeGroupResponse>
     */
    public CompletableFuture<CreateEdgeGroupResponse> createEdgeGroupAsync(CreateEdgeGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createEdgeGroup);
    }

    /**
     * 边缘节点组管理
     *
     * 创建边缘节点组。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeGroupRequest 请求对象
     * @return AsyncInvoker<CreateEdgeGroupRequest, CreateEdgeGroupResponse>
     */
    public AsyncInvoker<CreateEdgeGroupRequest, CreateEdgeGroupResponse> createEdgeGroupAsyncInvoker(
        CreateEdgeGroupRequest request) {
        return new AsyncInvoker<CreateEdgeGroupRequest, CreateEdgeGroupResponse>(request, IefMeta.createEdgeGroup,
            hcClient);
    }

    /**
     * 创建边缘节点组证书
     *
     * 创建边缘节点组证书。边缘节点组证书.tar.gz文件仅在调用该API时提供压缩包下载，请及时下载证书文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeGroupCertRequest 请求对象
     * @return CompletableFuture<CreateEdgeGroupCertResponse>
     */
    public CompletableFuture<CreateEdgeGroupCertResponse> createEdgeGroupCertAsync(CreateEdgeGroupCertRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createEdgeGroupCert);
    }

    /**
     * 创建边缘节点组证书
     *
     * 创建边缘节点组证书。边缘节点组证书.tar.gz文件仅在调用该API时提供压缩包下载，请及时下载证书文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeGroupCertRequest 请求对象
     * @return AsyncInvoker<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse>
     */
    public AsyncInvoker<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse> createEdgeGroupCertAsyncInvoker(
        CreateEdgeGroupCertRequest request) {
        return new AsyncInvoker<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse>(request,
            IefMeta.createEdgeGroupCert, hcClient);
    }

    /**
     * 注册边缘节点
     *
     * 该API用于注册一个边缘节点。接口调用成功后，您可以将响应消息体中node.package字段使用base64解码成tar.gz文件，并在控制台下载边缘核心软件，然后纳管边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeNodeRequest 请求对象
     * @return CompletableFuture<CreateEdgeNodeResponse>
     */
    public CompletableFuture<CreateEdgeNodeResponse> createEdgeNodeAsync(CreateEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createEdgeNode);
    }

    /**
     * 注册边缘节点
     *
     * 该API用于注册一个边缘节点。接口调用成功后，您可以将响应消息体中node.package字段使用base64解码成tar.gz文件，并在控制台下载边缘核心软件，然后纳管边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeNodeRequest 请求对象
     * @return AsyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>
     */
    public AsyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNodeAsyncInvoker(
        CreateEdgeNodeRequest request) {
        return new AsyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>(request, IefMeta.createEdgeNode,
            hcClient);
    }

    /**
     * 创建节点证书
     *
     * 创建边缘节点上的应用证书和设备证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeNodeCertsRequest 请求对象
     * @return CompletableFuture<CreateEdgeNodeCertsResponse>
     */
    public CompletableFuture<CreateEdgeNodeCertsResponse> createEdgeNodeCertsAsync(CreateEdgeNodeCertsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createEdgeNodeCerts);
    }

    /**
     * 创建节点证书
     *
     * 创建边缘节点上的应用证书和设备证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeNodeCertsRequest 请求对象
     * @return AsyncInvoker<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse>
     */
    public AsyncInvoker<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> createEdgeNodeCertsAsyncInvoker(
        CreateEdgeNodeCertsRequest request) {
        return new AsyncInvoker<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse>(request,
            IefMeta.createEdgeNodeCerts, hcClient);
    }

    /**
     * 新增加密数据
     *
     * 新增加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEncryptdatasRequest 请求对象
     * @return CompletableFuture<CreateEncryptdatasResponse>
     */
    public CompletableFuture<CreateEncryptdatasResponse> createEncryptdatasAsync(CreateEncryptdatasRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createEncryptdatas);
    }

    /**
     * 新增加密数据
     *
     * 新增加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEncryptdatasRequest 请求对象
     * @return AsyncInvoker<CreateEncryptdatasRequest, CreateEncryptdatasResponse>
     */
    public AsyncInvoker<CreateEncryptdatasRequest, CreateEncryptdatasResponse> createEncryptdatasAsyncInvoker(
        CreateEncryptdatasRequest request) {
        return new AsyncInvoker<CreateEncryptdatasRequest, CreateEncryptdatasResponse>(request,
            IefMeta.createEncryptdatas, hcClient);
    }

    /**
     * 创建端点
     *
     * 创建一个端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createEndpoint);
    }

    /**
     * 创建端点
     *
     * 创建一个端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, IefMeta.createEndpoint,
            hcClient);
    }

    /**
     * 加密数据绑定边缘节点
     *
     * 加密数据绑定边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeEncryptdatasRequest 请求对象
     * @return CompletableFuture<CreateNodeEncryptdatasResponse>
     */
    public CompletableFuture<CreateNodeEncryptdatasResponse> createNodeEncryptdatasAsync(
        CreateNodeEncryptdatasRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createNodeEncryptdatas);
    }

    /**
     * 加密数据绑定边缘节点
     *
     * 加密数据绑定边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeEncryptdatasRequest 请求对象
     * @return AsyncInvoker<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse>
     */
    public AsyncInvoker<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse> createNodeEncryptdatasAsyncInvoker(
        CreateNodeEncryptdatasRequest request) {
        return new AsyncInvoker<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse>(request,
            IefMeta.createNodeEncryptdatas, hcClient);
    }

    /**
     * 创建批量节点注册作业
     *
     * 创建批量节点注册作业。接口调用成功后，您可以将响应消息体中product.package字段使用base64解码成tar.gz产品证书文件，并在控制台下载边缘注册软件edge-register和edge-installer，使用该产品证书批量纳管边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductRequest 请求对象
     * @return CompletableFuture<CreateProductResponse>
     */
    public CompletableFuture<CreateProductResponse> createProductAsync(CreateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createProduct);
    }

    /**
     * 创建批量节点注册作业
     *
     * 创建批量节点注册作业。接口调用成功后，您可以将响应消息体中product.package字段使用base64解码成tar.gz产品证书文件，并在控制台下载边缘注册软件edge-register和edge-installer，使用该产品证书批量纳管边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductRequest 请求对象
     * @return AsyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public AsyncInvoker<CreateProductRequest, CreateProductResponse> createProductAsyncInvoker(
        CreateProductRequest request) {
        return new AsyncInvoker<CreateProductRequest, CreateProductResponse>(request, IefMeta.createProduct, hcClient);
    }

    /**
     * 创建规则
     *
     * 创建一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return CompletableFuture<CreateRuleResponse>
     */
    public CompletableFuture<CreateRuleResponse> createRuleAsync(CreateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createRule);
    }

    /**
     * 创建规则
     *
     * 创建一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return AsyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public AsyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleAsyncInvoker(CreateRuleRequest request) {
        return new AsyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, IefMeta.createRule, hcClient);
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
        return hcClient.asyncInvokeHttp(request, IefMeta.createSecret);
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
        return new AsyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, IefMeta.createSecret, hcClient);
    }

    /**
     * 创建服务
     *
     * 创建一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceRequest 请求对象
     * @return CompletableFuture<CreateServiceResponse>
     */
    public CompletableFuture<CreateServiceResponse> createServiceAsync(CreateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createService);
    }

    /**
     * 创建服务
     *
     * 创建一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceRequest 请求对象
     * @return AsyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public AsyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceAsyncInvoker(
        CreateServiceRequest request) {
        return new AsyncInvoker<CreateServiceRequest, CreateServiceResponse>(request, IefMeta.createService, hcClient);
    }

    /**
     * 创建系统订阅
     *
     * 创建系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSystemEventRequest 请求对象
     * @return CompletableFuture<CreateSystemEventResponse>
     */
    public CompletableFuture<CreateSystemEventResponse> createSystemEventAsync(CreateSystemEventRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createSystemEvent);
    }

    /**
     * 创建系统订阅
     *
     * 创建系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSystemEventRequest 请求对象
     * @return AsyncInvoker<CreateSystemEventRequest, CreateSystemEventResponse>
     */
    public AsyncInvoker<CreateSystemEventRequest, CreateSystemEventResponse> createSystemEventAsyncInvoker(
        CreateSystemEventRequest request) {
        return new AsyncInvoker<CreateSystemEventRequest, CreateSystemEventResponse>(request, IefMeta.createSystemEvent,
            hcClient);
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
     * @param CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.createTag);
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
     * @param CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<CreateTagRequest, CreateTagResponse>(request, IefMeta.createTag, hcClient);
    }

    /**
     * 删除应用模板
     *
     * 删除应用模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteApp);
    }

    /**
     * 删除应用模板
     *
     * 删除应用模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, IefMeta.deleteApp, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppVersionRequest 请求对象
     * @return CompletableFuture<DeleteAppVersionResponse>
     */
    public CompletableFuture<DeleteAppVersionResponse> deleteAppVersionAsync(DeleteAppVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteAppVersion);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppVersionRequest 请求对象
     * @return AsyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>
     */
    public AsyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersionAsyncInvoker(
        DeleteAppVersionRequest request) {
        return new AsyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>(request, IefMeta.deleteAppVersion,
            hcClient);
    }

    /**
     * 删除批量处理作业
     *
     * 删除批量处理作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBatchJobRequest 请求对象
     * @return CompletableFuture<DeleteBatchJobResponse>
     */
    public CompletableFuture<DeleteBatchJobResponse> deleteBatchJobAsync(DeleteBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteBatchJob);
    }

    /**
     * 删除批量处理作业
     *
     * 删除批量处理作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBatchJobRequest 请求对象
     * @return AsyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse>
     */
    public AsyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse> deleteBatchJobAsyncInvoker(
        DeleteBatchJobRequest request) {
        return new AsyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse>(request, IefMeta.deleteBatchJob,
            hcClient);
    }

    /**
     * 删除配置项
     *
     * 删除配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigMapRequest 请求对象
     * @return CompletableFuture<DeleteConfigMapResponse>
     */
    public CompletableFuture<DeleteConfigMapResponse> deleteConfigMapAsync(DeleteConfigMapRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteConfigMap);
    }

    /**
     * 删除配置项
     *
     * 删除配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigMapRequest 请求对象
     * @return AsyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse>
     */
    public AsyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse> deleteConfigMapAsyncInvoker(
        DeleteConfigMapRequest request) {
        return new AsyncInvoker<DeleteConfigMapRequest, DeleteConfigMapResponse>(request, IefMeta.deleteConfigMap,
            hcClient);
    }

    /**
     * 删除部署
     *
     * 删除应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentResponse>
     */
    public CompletableFuture<DeleteDeploymentResponse> deleteDeploymentAsync(DeleteDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteDeployment);
    }

    /**
     * 删除部署
     *
     * 删除应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>
     */
    public AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeploymentAsyncInvoker(
        DeleteDeploymentRequest request) {
        return new AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>(request, IefMeta.deleteDeployment,
            hcClient);
    }

    /**
     * 删除终端设备
     *
     * 该API用于删除终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceRequest 请求对象
     * @return CompletableFuture<DeleteDeviceResponse>
     */
    public CompletableFuture<DeleteDeviceResponse> deleteDeviceAsync(DeleteDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteDevice);
    }

    /**
     * 删除终端设备
     *
     * 该API用于删除终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceAsyncInvoker(
        DeleteDeviceRequest request) {
        return new AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, IefMeta.deleteDevice, hcClient);
    }

    /**
     * 删除终端设备模板
     *
     * 删除终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceTemplateRequest 请求对象
     * @return CompletableFuture<DeleteDeviceTemplateResponse>
     */
    public CompletableFuture<DeleteDeviceTemplateResponse> deleteDeviceTemplateAsync(
        DeleteDeviceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteDeviceTemplate);
    }

    /**
     * 删除终端设备模板
     *
     * 删除终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse>
     */
    public AsyncInvoker<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> deleteDeviceTemplateAsyncInvoker(
        DeleteDeviceTemplateRequest request) {
        return new AsyncInvoker<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse>(request,
            IefMeta.deleteDeviceTemplate, hcClient);
    }

    /**
     * 删除边缘节点组
     *
     * 删除边缘节点组。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeGroupRequest 请求对象
     * @return CompletableFuture<DeleteEdgeGroupResponse>
     */
    public CompletableFuture<DeleteEdgeGroupResponse> deleteEdgeGroupAsync(DeleteEdgeGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteEdgeGroup);
    }

    /**
     * 删除边缘节点组
     *
     * 删除边缘节点组。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeGroupRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse>
     */
    public AsyncInvoker<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse> deleteEdgeGroupAsyncInvoker(
        DeleteEdgeGroupRequest request) {
        return new AsyncInvoker<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse>(request, IefMeta.deleteEdgeGroup,
            hcClient);
    }

    /**
     * 删除边缘节点组证书
     *
     * 删除边缘节点组证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeGroupCertRequest 请求对象
     * @return CompletableFuture<DeleteEdgeGroupCertResponse>
     */
    public CompletableFuture<DeleteEdgeGroupCertResponse> deleteEdgeGroupCertAsync(DeleteEdgeGroupCertRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteEdgeGroupCert);
    }

    /**
     * 删除边缘节点组证书
     *
     * 删除边缘节点组证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeGroupCertRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse>
     */
    public AsyncInvoker<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse> deleteEdgeGroupCertAsyncInvoker(
        DeleteEdgeGroupCertRequest request) {
        return new AsyncInvoker<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse>(request,
            IefMeta.deleteEdgeGroupCert, hcClient);
    }

    /**
     * 删除边缘节点
     *
     * 删除边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeNodeRequest 请求对象
     * @return CompletableFuture<DeleteEdgeNodeResponse>
     */
    public CompletableFuture<DeleteEdgeNodeResponse> deleteEdgeNodeAsync(DeleteEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteEdgeNode);
    }

    /**
     * 删除边缘节点
     *
     * 删除边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeNodeRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>
     */
    public AsyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNodeAsyncInvoker(
        DeleteEdgeNodeRequest request) {
        return new AsyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>(request, IefMeta.deleteEdgeNode,
            hcClient);
    }

    /**
     * 删除节点证书
     *
     * 删除边缘节点上的证书（目前只支持删除应用证书和设备证书）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeNodeCertsRequest 请求对象
     * @return CompletableFuture<DeleteEdgeNodeCertsResponse>
     */
    public CompletableFuture<DeleteEdgeNodeCertsResponse> deleteEdgeNodeCertsAsync(DeleteEdgeNodeCertsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteEdgeNodeCerts);
    }

    /**
     * 删除节点证书
     *
     * 删除边缘节点上的证书（目前只支持删除应用证书和设备证书）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeNodeCertsRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse>
     */
    public AsyncInvoker<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> deleteEdgeNodeCertsAsyncInvoker(
        DeleteEdgeNodeCertsRequest request) {
        return new AsyncInvoker<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse>(request,
            IefMeta.deleteEdgeNodeCerts, hcClient);
    }

    /**
     * 删除加密数据
     *
     * 删除加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEncryptdatasRequest 请求对象
     * @return CompletableFuture<DeleteEncryptdatasResponse>
     */
    public CompletableFuture<DeleteEncryptdatasResponse> deleteEncryptdatasAsync(DeleteEncryptdatasRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteEncryptdatas);
    }

    /**
     * 删除加密数据
     *
     * 删除加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEncryptdatasRequest 请求对象
     * @return AsyncInvoker<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse>
     */
    public AsyncInvoker<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse> deleteEncryptdatasAsyncInvoker(
        DeleteEncryptdatasRequest request) {
        return new AsyncInvoker<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse>(request,
            IefMeta.deleteEncryptdatas, hcClient);
    }

    /**
     * 删除一个端点
     *
     * 删除一个端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndPointRequest 请求对象
     * @return CompletableFuture<DeleteEndPointResponse>
     */
    public CompletableFuture<DeleteEndPointResponse> deleteEndPointAsync(DeleteEndPointRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteEndPoint);
    }

    /**
     * 删除一个端点
     *
     * 删除一个端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndPointRequest 请求对象
     * @return AsyncInvoker<DeleteEndPointRequest, DeleteEndPointResponse>
     */
    public AsyncInvoker<DeleteEndPointRequest, DeleteEndPointResponse> deleteEndPointAsyncInvoker(
        DeleteEndPointRequest request) {
        return new AsyncInvoker<DeleteEndPointRequest, DeleteEndPointResponse>(request, IefMeta.deleteEndPoint,
            hcClient);
    }

    /**
     * 解绑边缘节点的加密数据
     *
     * 解绑边缘节点的加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeEncryptdatasRequest 请求对象
     * @return CompletableFuture<DeleteNodeEncryptdatasResponse>
     */
    public CompletableFuture<DeleteNodeEncryptdatasResponse> deleteNodeEncryptdatasAsync(
        DeleteNodeEncryptdatasRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteNodeEncryptdatas);
    }

    /**
     * 解绑边缘节点的加密数据
     *
     * 解绑边缘节点的加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeEncryptdatasRequest 请求对象
     * @return AsyncInvoker<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse>
     */
    public AsyncInvoker<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse> deleteNodeEncryptdatasAsyncInvoker(
        DeleteNodeEncryptdatasRequest request) {
        return new AsyncInvoker<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse>(request,
            IefMeta.deleteNodeEncryptdatas, hcClient);
    }

    /**
     * 删除批量节点注册作业
     *
     * 删除批量节点注册作业。接口调用成功后，与该批量注册任务关联的批量注册凭证将会失效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductRequest 请求对象
     * @return CompletableFuture<DeleteProductResponse>
     */
    public CompletableFuture<DeleteProductResponse> deleteProductAsync(DeleteProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteProduct);
    }

    /**
     * 删除批量节点注册作业
     *
     * 删除批量节点注册作业。接口调用成功后，与该批量注册任务关联的批量注册凭证将会失效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductRequest 请求对象
     * @return AsyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public AsyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductAsyncInvoker(
        DeleteProductRequest request) {
        return new AsyncInvoker<DeleteProductRequest, DeleteProductResponse>(request, IefMeta.deleteProduct, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。删除时不对标签字符集做校验，调用前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return CompletableFuture<DeleteResourceTagResponse>
     */
    public CompletableFuture<DeleteResourceTagResponse> deleteResourceTagAsync(DeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteResourceTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。删除时不对标签字符集做校验，调用前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, IefMeta.deleteResourceTag,
            hcClient);
    }

    /**
     * 删除规则
     *
     * 删除一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return CompletableFuture<DeleteRuleResponse>
     */
    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteRule);
    }

    /**
     * 删除规则
     *
     * 删除一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleAsyncInvoker(DeleteRuleRequest request) {
        return new AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, IefMeta.deleteRule, hcClient);
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
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteSecret);
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
        return new AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, IefMeta.deleteSecret, hcClient);
    }

    /**
     * 删除服务
     *
     * 删除一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceRequest 请求对象
     * @return CompletableFuture<DeleteServiceResponse>
     */
    public CompletableFuture<DeleteServiceResponse> deleteServiceAsync(DeleteServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteService);
    }

    /**
     * 删除服务
     *
     * 删除一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceRequest 请求对象
     * @return AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceAsyncInvoker(
        DeleteServiceRequest request) {
        return new AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>(request, IefMeta.deleteService, hcClient);
    }

    /**
     * 删除系统订阅列表
     *
     * 删除系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSystemEventRequest 请求对象
     * @return CompletableFuture<DeleteSystemEventResponse>
     */
    public CompletableFuture<DeleteSystemEventResponse> deleteSystemEventAsync(DeleteSystemEventRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.deleteSystemEvent);
    }

    /**
     * 删除系统订阅列表
     *
     * 删除系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSystemEventRequest 请求对象
     * @return AsyncInvoker<DeleteSystemEventRequest, DeleteSystemEventResponse>
     */
    public AsyncInvoker<DeleteSystemEventRequest, DeleteSystemEventResponse> deleteSystemEventAsyncInvoker(
        DeleteSystemEventRequest request) {
        return new AsyncInvoker<DeleteSystemEventRequest, DeleteSystemEventResponse>(request, IefMeta.deleteSystemEvent,
            hcClient);
    }

    /**
     * 启用停用边缘节点
     *
     * 启用停用边缘节点。被停用的边缘节点将无法连接到云端服务，可用该URI启用边缘节点恢复连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableDisableEdgeNodesRequest 请求对象
     * @return CompletableFuture<EnableDisableEdgeNodesResponse>
     */
    public CompletableFuture<EnableDisableEdgeNodesResponse> enableDisableEdgeNodesAsync(
        EnableDisableEdgeNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.enableDisableEdgeNodes);
    }

    /**
     * 启用停用边缘节点
     *
     * 启用停用边缘节点。被停用的边缘节点将无法连接到云端服务，可用该URI启用边缘节点恢复连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableDisableEdgeNodesRequest 请求对象
     * @return AsyncInvoker<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse>
     */
    public AsyncInvoker<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> enableDisableEdgeNodesAsyncInvoker(
        EnableDisableEdgeNodesRequest request) {
        return new AsyncInvoker<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse>(request,
            IefMeta.enableDisableEdgeNodes, hcClient);
    }

    /**
     * 查询应用模板版本列表
     *
     * 查询应用模板版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppVersionsRequest 请求对象
     * @return CompletableFuture<ListAppVersionsResponse>
     */
    public CompletableFuture<ListAppVersionsResponse> listAppVersionsAsync(ListAppVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listAppVersions);
    }

    /**
     * 查询应用模板版本列表
     *
     * 查询应用模板版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppVersionsRequest 请求对象
     * @return AsyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>
     */
    public AsyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersionsAsyncInvoker(
        ListAppVersionsRequest request) {
        return new AsyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>(request, IefMeta.listAppVersions,
            hcClient);
    }

    /**
     * 查询应用模板列表
     *
     * 查询应用模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listApps);
    }

    /**
     * 查询应用模板列表
     *
     * 查询应用模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<ListAppsRequest, ListAppsResponse>(request, IefMeta.listApps, hcClient);
    }

    /**
     * 查询批量处理作业列表
     *
     * 查询批量处理作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchJobRequest 请求对象
     * @return CompletableFuture<ListBatchJobResponse>
     */
    public CompletableFuture<ListBatchJobResponse> listBatchJobAsync(ListBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listBatchJob);
    }

    /**
     * 查询批量处理作业列表
     *
     * 查询批量处理作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchJobRequest 请求对象
     * @return AsyncInvoker<ListBatchJobRequest, ListBatchJobResponse>
     */
    public AsyncInvoker<ListBatchJobRequest, ListBatchJobResponse> listBatchJobAsyncInvoker(
        ListBatchJobRequest request) {
        return new AsyncInvoker<ListBatchJobRequest, ListBatchJobResponse>(request, IefMeta.listBatchJob, hcClient);
    }

    /**
     * 查询配置项列表
     *
     * 查询配置项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigMapsRequest 请求对象
     * @return CompletableFuture<ListConfigMapsResponse>
     */
    public CompletableFuture<ListConfigMapsResponse> listConfigMapsAsync(ListConfigMapsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listConfigMaps);
    }

    /**
     * 查询配置项列表
     *
     * 查询配置项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigMapsRequest 请求对象
     * @return AsyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse>
     */
    public AsyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse> listConfigMapsAsyncInvoker(
        ListConfigMapsRequest request) {
        return new AsyncInvoker<ListConfigMapsRequest, ListConfigMapsResponse>(request, IefMeta.listConfigMaps,
            hcClient);
    }

    /**
     * 查询部署列表
     *
     * 查询部署列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeploymentsRequest 请求对象
     * @return CompletableFuture<ListDeploymentsResponse>
     */
    public CompletableFuture<ListDeploymentsResponse> listDeploymentsAsync(ListDeploymentsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listDeployments);
    }

    /**
     * 查询部署列表
     *
     * 查询部署列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeploymentsRequest 请求对象
     * @return AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>
     */
    public AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse> listDeploymentsAsyncInvoker(
        ListDeploymentsRequest request) {
        return new AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>(request, IefMeta.listDeployments,
            hcClient);
    }

    /**
     * 查询终端设备模板列表
     *
     * 查询终端设备模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeviceTemplatesRequest 请求对象
     * @return CompletableFuture<ListDeviceTemplatesResponse>
     */
    public CompletableFuture<ListDeviceTemplatesResponse> listDeviceTemplatesAsync(ListDeviceTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listDeviceTemplates);
    }

    /**
     * 查询终端设备模板列表
     *
     * 查询终端设备模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeviceTemplatesRequest 请求对象
     * @return AsyncInvoker<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse>
     */
    public AsyncInvoker<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> listDeviceTemplatesAsyncInvoker(
        ListDeviceTemplatesRequest request) {
        return new AsyncInvoker<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse>(request,
            IefMeta.listDeviceTemplates, hcClient);
    }

    /**
     * 查询终端设备列表
     *
     * 该API用于查询终端设备列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse>
     */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listDevices);
    }

    /**
     * 查询终端设备列表
     *
     * 该API用于查询终端设备列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return AsyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public AsyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesAsyncInvoker(ListDevicesRequest request) {
        return new AsyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, IefMeta.listDevices, hcClient);
    }

    /**
     * 查询边缘节点组证书列表
     *
     * 查询边缘节点组证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeGroupCertsRequest 请求对象
     * @return CompletableFuture<ListEdgeGroupCertsResponse>
     */
    public CompletableFuture<ListEdgeGroupCertsResponse> listEdgeGroupCertsAsync(ListEdgeGroupCertsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listEdgeGroupCerts);
    }

    /**
     * 查询边缘节点组证书列表
     *
     * 查询边缘节点组证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeGroupCertsRequest 请求对象
     * @return AsyncInvoker<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse>
     */
    public AsyncInvoker<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse> listEdgeGroupCertsAsyncInvoker(
        ListEdgeGroupCertsRequest request) {
        return new AsyncInvoker<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse>(request,
            IefMeta.listEdgeGroupCerts, hcClient);
    }

    /**
     * 查询边缘节点组列表
     *
     * 查询边缘节点组列表。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeGroupsRequest 请求对象
     * @return CompletableFuture<ListEdgeGroupsResponse>
     */
    public CompletableFuture<ListEdgeGroupsResponse> listEdgeGroupsAsync(ListEdgeGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listEdgeGroups);
    }

    /**
     * 查询边缘节点组列表
     *
     * 查询边缘节点组列表。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeGroupsRequest 请求对象
     * @return AsyncInvoker<ListEdgeGroupsRequest, ListEdgeGroupsResponse>
     */
    public AsyncInvoker<ListEdgeGroupsRequest, ListEdgeGroupsResponse> listEdgeGroupsAsyncInvoker(
        ListEdgeGroupsRequest request) {
        return new AsyncInvoker<ListEdgeGroupsRequest, ListEdgeGroupsResponse>(request, IefMeta.listEdgeGroups,
            hcClient);
    }

    /**
     * 查询节点证书
     *
     * 查询边缘节点上的应用证书和设备证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeNodeCertsRequest 请求对象
     * @return CompletableFuture<ListEdgeNodeCertsResponse>
     */
    public CompletableFuture<ListEdgeNodeCertsResponse> listEdgeNodeCertsAsync(ListEdgeNodeCertsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listEdgeNodeCerts);
    }

    /**
     * 查询节点证书
     *
     * 查询边缘节点上的应用证书和设备证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeNodeCertsRequest 请求对象
     * @return AsyncInvoker<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse>
     */
    public AsyncInvoker<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> listEdgeNodeCertsAsyncInvoker(
        ListEdgeNodeCertsRequest request) {
        return new AsyncInvoker<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse>(request, IefMeta.listEdgeNodeCerts,
            hcClient);
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
     * @param ListEdgeNodesRequest 请求对象
     * @return CompletableFuture<ListEdgeNodesResponse>
     */
    public CompletableFuture<ListEdgeNodesResponse> listEdgeNodesAsync(ListEdgeNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listEdgeNodes);
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
     * @param ListEdgeNodesRequest 请求对象
     * @return AsyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>
     */
    public AsyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodesAsyncInvoker(
        ListEdgeNodesRequest request) {
        return new AsyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>(request, IefMeta.listEdgeNodes, hcClient);
    }

    /**
     * 获取加密数据绑定的边缘节点
     *
     * 获取加密数据绑定的边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncryptdataNodesRequest 请求对象
     * @return CompletableFuture<ListEncryptdataNodesResponse>
     */
    public CompletableFuture<ListEncryptdataNodesResponse> listEncryptdataNodesAsync(
        ListEncryptdataNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listEncryptdataNodes);
    }

    /**
     * 获取加密数据绑定的边缘节点
     *
     * 获取加密数据绑定的边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncryptdataNodesRequest 请求对象
     * @return AsyncInvoker<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse>
     */
    public AsyncInvoker<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse> listEncryptdataNodesAsyncInvoker(
        ListEncryptdataNodesRequest request) {
        return new AsyncInvoker<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse>(request,
            IefMeta.listEncryptdataNodes, hcClient);
    }

    /**
     * 获取加密数据列表
     *
     * 获取加密数据列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncryptdatasRequest 请求对象
     * @return CompletableFuture<ListEncryptdatasResponse>
     */
    public CompletableFuture<ListEncryptdatasResponse> listEncryptdatasAsync(ListEncryptdatasRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listEncryptdatas);
    }

    /**
     * 获取加密数据列表
     *
     * 获取加密数据列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncryptdatasRequest 请求对象
     * @return AsyncInvoker<ListEncryptdatasRequest, ListEncryptdatasResponse>
     */
    public AsyncInvoker<ListEncryptdatasRequest, ListEncryptdatasResponse> listEncryptdatasAsyncInvoker(
        ListEncryptdatasRequest request) {
        return new AsyncInvoker<ListEncryptdatasRequest, ListEncryptdatasResponse>(request, IefMeta.listEncryptdatas,
            hcClient);
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
     * @param ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listEndpoints);
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
     * @param ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>(request, IefMeta.listEndpoints, hcClient);
    }

    /**
     * 获取边缘节点绑定的加密数据
     *
     * 获取边缘节点绑定的加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodeEncryptdatasRequest 请求对象
     * @return CompletableFuture<ListNodeEncryptdatasResponse>
     */
    public CompletableFuture<ListNodeEncryptdatasResponse> listNodeEncryptdatasAsync(
        ListNodeEncryptdatasRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listNodeEncryptdatas);
    }

    /**
     * 获取边缘节点绑定的加密数据
     *
     * 获取边缘节点绑定的加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodeEncryptdatasRequest 请求对象
     * @return AsyncInvoker<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse>
     */
    public AsyncInvoker<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse> listNodeEncryptdatasAsyncInvoker(
        ListNodeEncryptdatasRequest request) {
        return new AsyncInvoker<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse>(request,
            IefMeta.listNodeEncryptdatas, hcClient);
    }

    /**
     * 查询应用实例列表
     *
     * 查询应用实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPodsRequest 请求对象
     * @return CompletableFuture<ListPodsResponse>
     */
    public CompletableFuture<ListPodsResponse> listPodsAsync(ListPodsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listPods);
    }

    /**
     * 查询应用实例列表
     *
     * 查询应用实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPodsRequest 请求对象
     * @return AsyncInvoker<ListPodsRequest, ListPodsResponse>
     */
    public AsyncInvoker<ListPodsRequest, ListPodsResponse> listPodsAsyncInvoker(ListPodsRequest request) {
        return new AsyncInvoker<ListPodsRequest, ListPodsResponse>(request, IefMeta.listPods, hcClient);
    }

    /**
     * 查询批量节点注册作业列表
     *
     * 查询批量节点注册作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listProducts);
    }

    /**
     * 查询批量节点注册作业列表
     *
     * 查询批量节点注册作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<ListProductsRequest, ListProductsResponse>(request, IefMeta.listProducts, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceByTagsRequest 请求对象
     * @return CompletableFuture<ListResourceByTagsResponse>
     */
    public CompletableFuture<ListResourceByTagsResponse> listResourceByTagsAsync(ListResourceByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listResourceByTags);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceByTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceByTagsRequest, ListResourceByTagsResponse>
     */
    public AsyncInvoker<ListResourceByTagsRequest, ListResourceByTagsResponse> listResourceByTagsAsyncInvoker(
        ListResourceByTagsRequest request) {
        return new AsyncInvoker<ListResourceByTagsRequest, ListResourceByTagsResponse>(request,
            IefMeta.listResourceByTags, hcClient);
    }

    /**
     * 查询规则错误列表
     *
     * 查询特定规则下的所有错误列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleErrorsRequest 请求对象
     * @return CompletableFuture<ListRuleErrorsResponse>
     */
    public CompletableFuture<ListRuleErrorsResponse> listRuleErrorsAsync(ListRuleErrorsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listRuleErrors);
    }

    /**
     * 查询规则错误列表
     *
     * 查询特定规则下的所有错误列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleErrorsRequest 请求对象
     * @return AsyncInvoker<ListRuleErrorsRequest, ListRuleErrorsResponse>
     */
    public AsyncInvoker<ListRuleErrorsRequest, ListRuleErrorsResponse> listRuleErrorsAsyncInvoker(
        ListRuleErrorsRequest request) {
        return new AsyncInvoker<ListRuleErrorsRequest, ListRuleErrorsResponse>(request, IefMeta.listRuleErrors,
            hcClient);
    }

    /**
     * 查询规则列表
     *
     * 查询到所有的规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesRequest 请求对象
     * @return CompletableFuture<ListRulesResponse>
     */
    public CompletableFuture<ListRulesResponse> listRulesAsync(ListRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listRules);
    }

    /**
     * 查询规则列表
     *
     * 查询到所有的规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesRequest 请求对象
     * @return AsyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public AsyncInvoker<ListRulesRequest, ListRulesResponse> listRulesAsyncInvoker(ListRulesRequest request) {
        return new AsyncInvoker<ListRulesRequest, ListRulesResponse>(request, IefMeta.listRules, hcClient);
    }

    /**
     * 查询密钥列表
     *
     * 查询密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretsRequest 请求对象
     * @return CompletableFuture<ListSecretsResponse>
     */
    public CompletableFuture<ListSecretsResponse> listSecretsAsync(ListSecretsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listSecrets);
    }

    /**
     * 查询密钥列表
     *
     * 查询密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretsRequest 请求对象
     * @return AsyncInvoker<ListSecretsRequest, ListSecretsResponse>
     */
    public AsyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsAsyncInvoker(ListSecretsRequest request) {
        return new AsyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, IefMeta.listSecrets, hcClient);
    }

    /**
     * 查询服务列表
     *
     * 获取所有的服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicesRequest 请求对象
     * @return CompletableFuture<ListServicesResponse>
     */
    public CompletableFuture<ListServicesResponse> listServicesAsync(ListServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listServices);
    }

    /**
     * 查询服务列表
     *
     * 获取所有的服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicesRequest 请求对象
     * @return AsyncInvoker<ListServicesRequest, ListServicesResponse>
     */
    public AsyncInvoker<ListServicesRequest, ListServicesResponse> listServicesAsyncInvoker(
        ListServicesRequest request) {
        return new AsyncInvoker<ListServicesRequest, ListServicesResponse>(request, IefMeta.listServices, hcClient);
    }

    /**
     * 查询系统订阅列表
     *
     * 查询系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemEventsRequest 请求对象
     * @return CompletableFuture<ListSystemEventsResponse>
     */
    public CompletableFuture<ListSystemEventsResponse> listSystemEventsAsync(ListSystemEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listSystemEvents);
    }

    /**
     * 查询系统订阅列表
     *
     * 查询系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemEventsRequest 请求对象
     * @return AsyncInvoker<ListSystemEventsRequest, ListSystemEventsResponse>
     */
    public AsyncInvoker<ListSystemEventsRequest, ListSystemEventsResponse> listSystemEventsAsyncInvoker(
        ListSystemEventsRequest request) {
        return new AsyncInvoker<ListSystemEventsRequest, ListSystemEventsResponse>(request, IefMeta.listSystemEvents,
            hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, IefMeta.listTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsByResourceTypeRequest 请求对象
     * @return CompletableFuture<ListTagsByResourceTypeResponse>
     */
    public CompletableFuture<ListTagsByResourceTypeResponse> listTagsByResourceTypeAsync(
        ListTagsByResourceTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.listTagsByResourceType);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsByResourceTypeRequest 请求对象
     * @return AsyncInvoker<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse>
     */
    public AsyncInvoker<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> listTagsByResourceTypeAsyncInvoker(
        ListTagsByResourceTypeRequest request) {
        return new AsyncInvoker<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse>(request,
            IefMeta.listTagsByResourceType, hcClient);
    }

    /**
     * 容器应用实例重启
     *
     * 重启部署下的应用实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartDeploymentsPodRequest 请求对象
     * @return CompletableFuture<RestartDeploymentsPodResponse>
     */
    public CompletableFuture<RestartDeploymentsPodResponse> restartDeploymentsPodAsync(
        RestartDeploymentsPodRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.restartDeploymentsPod);
    }

    /**
     * 容器应用实例重启
     *
     * 重启部署下的应用实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartDeploymentsPodRequest 请求对象
     * @return AsyncInvoker<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse>
     */
    public AsyncInvoker<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse> restartDeploymentsPodAsyncInvoker(
        RestartDeploymentsPodRequest request) {
        return new AsyncInvoker<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse>(request,
            IefMeta.restartDeploymentsPod, hcClient);
    }

    /**
     * 继续批量处理作业
     *
     * 继续执行批量处理作业。该API只对停止的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreBatchJobRequest 请求对象
     * @return CompletableFuture<RestoreBatchJobResponse>
     */
    public CompletableFuture<RestoreBatchJobResponse> restoreBatchJobAsync(RestoreBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.restoreBatchJob);
    }

    /**
     * 继续批量处理作业
     *
     * 继续执行批量处理作业。该API只对停止的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreBatchJobRequest 请求对象
     * @return AsyncInvoker<RestoreBatchJobRequest, RestoreBatchJobResponse>
     */
    public AsyncInvoker<RestoreBatchJobRequest, RestoreBatchJobResponse> restoreBatchJobAsyncInvoker(
        RestoreBatchJobRequest request) {
        return new AsyncInvoker<RestoreBatchJobRequest, RestoreBatchJobResponse>(request, IefMeta.restoreBatchJob,
            hcClient);
    }

    /**
     * 重试批量处理作业
     *
     * 重试批量处理作业。该API仅对执行状态失败的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryBatchJobRequest 请求对象
     * @return CompletableFuture<RetryBatchJobResponse>
     */
    public CompletableFuture<RetryBatchJobResponse> retryBatchJobAsync(RetryBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.retryBatchJob);
    }

    /**
     * 重试批量处理作业
     *
     * 重试批量处理作业。该API仅对执行状态失败的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryBatchJobRequest 请求对象
     * @return AsyncInvoker<RetryBatchJobRequest, RetryBatchJobResponse>
     */
    public AsyncInvoker<RetryBatchJobRequest, RetryBatchJobResponse> retryBatchJobAsyncInvoker(
        RetryBatchJobRequest request) {
        return new AsyncInvoker<RetryBatchJobRequest, RetryBatchJobResponse>(request, IefMeta.retryBatchJob, hcClient);
    }

    /**
     * 查询应用模板详情
     *
     * 查询应用模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppDetailRequest 请求对象
     * @return CompletableFuture<ShowAppDetailResponse>
     */
    public CompletableFuture<ShowAppDetailResponse> showAppDetailAsync(ShowAppDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showAppDetail);
    }

    /**
     * 查询应用模板详情
     *
     * 查询应用模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppDetailRequest 请求对象
     * @return AsyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse>
     */
    public AsyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse> showAppDetailAsyncInvoker(
        ShowAppDetailRequest request) {
        return new AsyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse>(request, IefMeta.showAppDetail, hcClient);
    }

    /**
     * 查询应用模板版本详情
     *
     * 查询应用模板版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppVersionDetailRequest 请求对象
     * @return CompletableFuture<ShowAppVersionDetailResponse>
     */
    public CompletableFuture<ShowAppVersionDetailResponse> showAppVersionDetailAsync(
        ShowAppVersionDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showAppVersionDetail);
    }

    /**
     * 查询应用模板版本详情
     *
     * 查询应用模板版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppVersionDetailRequest 请求对象
     * @return AsyncInvoker<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse>
     */
    public AsyncInvoker<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> showAppVersionDetailAsyncInvoker(
        ShowAppVersionDetailRequest request) {
        return new AsyncInvoker<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse>(request,
            IefMeta.showAppVersionDetail, hcClient);
    }

    /**
     * 查询批量处理作业详情
     *
     * 查询批量处理作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchJobRequest 请求对象
     * @return CompletableFuture<ShowBatchJobResponse>
     */
    public CompletableFuture<ShowBatchJobResponse> showBatchJobAsync(ShowBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showBatchJob);
    }

    /**
     * 查询批量处理作业详情
     *
     * 查询批量处理作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchJobRequest 请求对象
     * @return AsyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse>
     */
    public AsyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse> showBatchJobAsyncInvoker(
        ShowBatchJobRequest request) {
        return new AsyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse>(request, IefMeta.showBatchJob, hcClient);
    }

    /**
     * 查询配置项详情
     *
     * 查询一个配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigMapRequest 请求对象
     * @return CompletableFuture<ShowConfigMapResponse>
     */
    public CompletableFuture<ShowConfigMapResponse> showConfigMapAsync(ShowConfigMapRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showConfigMap);
    }

    /**
     * 查询配置项详情
     *
     * 查询一个配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigMapRequest 请求对象
     * @return AsyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse>
     */
    public AsyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse> showConfigMapAsyncInvoker(
        ShowConfigMapRequest request) {
        return new AsyncInvoker<ShowConfigMapRequest, ShowConfigMapResponse>(request, IefMeta.showConfigMap, hcClient);
    }

    /**
     * 查询应用部署
     *
     * 查询应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentRequest 请求对象
     * @return CompletableFuture<ShowDeploymentResponse>
     */
    public CompletableFuture<ShowDeploymentResponse> showDeploymentAsync(ShowDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showDeployment);
    }

    /**
     * 查询应用部署
     *
     * 查询应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse>
     */
    public AsyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse> showDeploymentAsyncInvoker(
        ShowDeploymentRequest request) {
        return new AsyncInvoker<ShowDeploymentRequest, ShowDeploymentResponse>(request, IefMeta.showDeployment,
            hcClient);
    }

    /**
     * 查询终端设备详情
     *
     * 该API用于查询终端设备详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceRequest 请求对象
     * @return CompletableFuture<ShowDeviceResponse>
     */
    public CompletableFuture<ShowDeviceResponse> showDeviceAsync(ShowDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showDevice);
    }

    /**
     * 查询终端设备详情
     *
     * 该API用于查询终端设备详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceRequest 请求对象
     * @return AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse>
     */
    public AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceAsyncInvoker(ShowDeviceRequest request) {
        return new AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse>(request, IefMeta.showDevice, hcClient);
    }

    /**
     * 查询终端设备模板
     *
     * 查询一个终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceTemplateRequest 请求对象
     * @return CompletableFuture<ShowDeviceTemplateResponse>
     */
    public CompletableFuture<ShowDeviceTemplateResponse> showDeviceTemplateAsync(ShowDeviceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showDeviceTemplate);
    }

    /**
     * 查询终端设备模板
     *
     * 查询一个终端设备模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceTemplateRequest 请求对象
     * @return AsyncInvoker<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse>
     */
    public AsyncInvoker<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> showDeviceTemplateAsyncInvoker(
        ShowDeviceTemplateRequest request) {
        return new AsyncInvoker<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse>(request,
            IefMeta.showDeviceTemplate, hcClient);
    }

    /**
     * 查询终端设备孪生
     *
     * 该API用于查询终端设备孪生。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceTwinRequest 请求对象
     * @return CompletableFuture<ShowDeviceTwinResponse>
     */
    public CompletableFuture<ShowDeviceTwinResponse> showDeviceTwinAsync(ShowDeviceTwinRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showDeviceTwin);
    }

    /**
     * 查询终端设备孪生
     *
     * 该API用于查询终端设备孪生。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceTwinRequest 请求对象
     * @return AsyncInvoker<ShowDeviceTwinRequest, ShowDeviceTwinResponse>
     */
    public AsyncInvoker<ShowDeviceTwinRequest, ShowDeviceTwinResponse> showDeviceTwinAsyncInvoker(
        ShowDeviceTwinRequest request) {
        return new AsyncInvoker<ShowDeviceTwinRequest, ShowDeviceTwinResponse>(request, IefMeta.showDeviceTwin,
            hcClient);
    }

    /**
     * 查询边缘节点组证书详情
     *
     * 查询边缘节点组证书详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeGroupCertDetailRequest 请求对象
     * @return CompletableFuture<ShowEdgeGroupCertDetailResponse>
     */
    public CompletableFuture<ShowEdgeGroupCertDetailResponse> showEdgeGroupCertDetailAsync(
        ShowEdgeGroupCertDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showEdgeGroupCertDetail);
    }

    /**
     * 查询边缘节点组证书详情
     *
     * 查询边缘节点组证书详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeGroupCertDetailRequest 请求对象
     * @return AsyncInvoker<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse>
     */
    public AsyncInvoker<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse> showEdgeGroupCertDetailAsyncInvoker(
        ShowEdgeGroupCertDetailRequest request) {
        return new AsyncInvoker<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse>(request,
            IefMeta.showEdgeGroupCertDetail, hcClient);
    }

    /**
     * 查询边缘节点组详情
     *
     * 查询边缘节点组详情。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowEdgeGroupDetailResponse>
     */
    public CompletableFuture<ShowEdgeGroupDetailResponse> showEdgeGroupDetailAsync(ShowEdgeGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showEdgeGroupDetail);
    }

    /**
     * 查询边缘节点组详情
     *
     * 查询边缘节点组详情。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse>
     */
    public AsyncInvoker<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse> showEdgeGroupDetailAsyncInvoker(
        ShowEdgeGroupDetailRequest request) {
        return new AsyncInvoker<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse>(request,
            IefMeta.showEdgeGroupDetail, hcClient);
    }

    /**
     * 查询边缘节点详情
     *
     * 查询边缘节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeNodeDetailRequest 请求对象
     * @return CompletableFuture<ShowEdgeNodeDetailResponse>
     */
    public CompletableFuture<ShowEdgeNodeDetailResponse> showEdgeNodeDetailAsync(ShowEdgeNodeDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showEdgeNodeDetail);
    }

    /**
     * 查询边缘节点详情
     *
     * 查询边缘节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeNodeDetailRequest 请求对象
     * @return AsyncInvoker<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse>
     */
    public AsyncInvoker<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> showEdgeNodeDetailAsyncInvoker(
        ShowEdgeNodeDetailRequest request) {
        return new AsyncInvoker<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse>(request,
            IefMeta.showEdgeNodeDetail, hcClient);
    }

    /**
     * 查询加密数据详情
     *
     * 查询加密数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEncryptdatasRequest 请求对象
     * @return CompletableFuture<ShowEncryptdatasResponse>
     */
    public CompletableFuture<ShowEncryptdatasResponse> showEncryptdatasAsync(ShowEncryptdatasRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showEncryptdatas);
    }

    /**
     * 查询加密数据详情
     *
     * 查询加密数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEncryptdatasRequest 请求对象
     * @return AsyncInvoker<ShowEncryptdatasRequest, ShowEncryptdatasResponse>
     */
    public AsyncInvoker<ShowEncryptdatasRequest, ShowEncryptdatasResponse> showEncryptdatasAsyncInvoker(
        ShowEncryptdatasRequest request) {
        return new AsyncInvoker<ShowEncryptdatasRequest, ShowEncryptdatasResponse>(request, IefMeta.showEncryptdatas,
            hcClient);
    }

    /**
     * 查询端点详情
     *
     * 查询一个端点的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEndPointDetailRequest 请求对象
     * @return CompletableFuture<ShowEndPointDetailResponse>
     */
    public CompletableFuture<ShowEndPointDetailResponse> showEndPointDetailAsync(ShowEndPointDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showEndPointDetail);
    }

    /**
     * 查询端点详情
     *
     * 查询一个端点的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEndPointDetailRequest 请求对象
     * @return AsyncInvoker<ShowEndPointDetailRequest, ShowEndPointDetailResponse>
     */
    public AsyncInvoker<ShowEndPointDetailRequest, ShowEndPointDetailResponse> showEndPointDetailAsyncInvoker(
        ShowEndPointDetailRequest request) {
        return new AsyncInvoker<ShowEndPointDetailRequest, ShowEndPointDetailResponse>(request,
            IefMeta.showEndPointDetail, hcClient);
    }

    /**
     * 查询批量节点注册作业详情
     *
     * 查询批量节点注册作业详情。该接口无法查询产品证书文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductDetailRequest 请求对象
     * @return CompletableFuture<ShowProductDetailResponse>
     */
    public CompletableFuture<ShowProductDetailResponse> showProductDetailAsync(ShowProductDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showProductDetail);
    }

    /**
     * 查询批量节点注册作业详情
     *
     * 查询批量节点注册作业详情。该接口无法查询产品证书文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductDetailRequest 请求对象
     * @return AsyncInvoker<ShowProductDetailRequest, ShowProductDetailResponse>
     */
    public AsyncInvoker<ShowProductDetailRequest, ShowProductDetailResponse> showProductDetailAsyncInvoker(
        ShowProductDetailRequest request) {
        return new AsyncInvoker<ShowProductDetailRequest, ShowProductDetailResponse>(request, IefMeta.showProductDetail,
            hcClient);
    }

    /**
     * 查询IEF服务下的资源配额
     *
     * 查询IEF服务下的资源配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showQuota);
    }

    /**
     * 查询IEF服务下的资源配额
     *
     * 查询IEF服务下的资源配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, IefMeta.showQuota, hcClient);
    }

    /**
     * 查询规则详情
     *
     * 获取一条规则的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleDetailRequest 请求对象
     * @return CompletableFuture<ShowRuleDetailResponse>
     */
    public CompletableFuture<ShowRuleDetailResponse> showRuleDetailAsync(ShowRuleDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showRuleDetail);
    }

    /**
     * 查询规则详情
     *
     * 获取一条规则的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleDetailRequest 请求对象
     * @return AsyncInvoker<ShowRuleDetailRequest, ShowRuleDetailResponse>
     */
    public AsyncInvoker<ShowRuleDetailRequest, ShowRuleDetailResponse> showRuleDetailAsyncInvoker(
        ShowRuleDetailRequest request) {
        return new AsyncInvoker<ShowRuleDetailRequest, ShowRuleDetailResponse>(request, IefMeta.showRuleDetail,
            hcClient);
    }

    /**
     * 查询密钥详情
     *
     * 查询一个密钥详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretRequest 请求对象
     * @return CompletableFuture<ShowSecretResponse>
     */
    public CompletableFuture<ShowSecretResponse> showSecretAsync(ShowSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showSecret);
    }

    /**
     * 查询密钥详情
     *
     * 查询一个密钥详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretRequest 请求对象
     * @return AsyncInvoker<ShowSecretRequest, ShowSecretResponse>
     */
    public AsyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretAsyncInvoker(ShowSecretRequest request) {
        return new AsyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, IefMeta.showSecret, hcClient);
    }

    /**
     * 查询服务详情
     *
     * 查询一个服务的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServiceDetailRequest 请求对象
     * @return CompletableFuture<ShowServiceDetailResponse>
     */
    public CompletableFuture<ShowServiceDetailResponse> showServiceDetailAsync(ShowServiceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showServiceDetail);
    }

    /**
     * 查询服务详情
     *
     * 查询一个服务的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServiceDetailRequest 请求对象
     * @return AsyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse>
     */
    public AsyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse> showServiceDetailAsyncInvoker(
        ShowServiceDetailRequest request) {
        return new AsyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse>(request, IefMeta.showServiceDetail,
            hcClient);
    }

    /**
     * 查询系统订阅列表
     *
     * 查询系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSystemEventDetailRequest 请求对象
     * @return CompletableFuture<ShowSystemEventDetailResponse>
     */
    public CompletableFuture<ShowSystemEventDetailResponse> showSystemEventDetailAsync(
        ShowSystemEventDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.showSystemEventDetail);
    }

    /**
     * 查询系统订阅列表
     *
     * 查询系统订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSystemEventDetailRequest 请求对象
     * @return AsyncInvoker<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse>
     */
    public AsyncInvoker<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse> showSystemEventDetailAsyncInvoker(
        ShowSystemEventDetailRequest request) {
        return new AsyncInvoker<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse>(request,
            IefMeta.showSystemEventDetail, hcClient);
    }

    /**
     * 启用规则
     *
     * 启用一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartRuleRequest 请求对象
     * @return CompletableFuture<StartRuleResponse>
     */
    public CompletableFuture<StartRuleResponse> startRuleAsync(StartRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.startRule);
    }

    /**
     * 启用规则
     *
     * 启用一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartRuleRequest 请求对象
     * @return AsyncInvoker<StartRuleRequest, StartRuleResponse>
     */
    public AsyncInvoker<StartRuleRequest, StartRuleResponse> startRuleAsyncInvoker(StartRuleRequest request) {
        return new AsyncInvoker<StartRuleRequest, StartRuleResponse>(request, IefMeta.startRule, hcClient);
    }

    /**
     * 启用系统订阅
     *
     * 启用系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSystemEventRequest 请求对象
     * @return CompletableFuture<StartSystemEventResponse>
     */
    public CompletableFuture<StartSystemEventResponse> startSystemEventAsync(StartSystemEventRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.startSystemEvent);
    }

    /**
     * 启用系统订阅
     *
     * 启用系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSystemEventRequest 请求对象
     * @return AsyncInvoker<StartSystemEventRequest, StartSystemEventResponse>
     */
    public AsyncInvoker<StartSystemEventRequest, StartSystemEventResponse> startSystemEventAsyncInvoker(
        StartSystemEventRequest request) {
        return new AsyncInvoker<StartSystemEventRequest, StartSystemEventResponse>(request, IefMeta.startSystemEvent,
            hcClient);
    }

    /**
     * 停止批量处理作业
     *
     * 停止批量处理作业。该API仅对运行中的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopBatchJobRequest 请求对象
     * @return CompletableFuture<StopBatchJobResponse>
     */
    public CompletableFuture<StopBatchJobResponse> stopBatchJobAsync(StopBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.stopBatchJob);
    }

    /**
     * 停止批量处理作业
     *
     * 停止批量处理作业。该API仅对运行中的批量处理作业生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopBatchJobRequest 请求对象
     * @return AsyncInvoker<StopBatchJobRequest, StopBatchJobResponse>
     */
    public AsyncInvoker<StopBatchJobRequest, StopBatchJobResponse> stopBatchJobAsyncInvoker(
        StopBatchJobRequest request) {
        return new AsyncInvoker<StopBatchJobRequest, StopBatchJobResponse>(request, IefMeta.stopBatchJob, hcClient);
    }

    /**
     * 停用规则
     *
     * 停用一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopRuleRequest 请求对象
     * @return CompletableFuture<StopRuleResponse>
     */
    public CompletableFuture<StopRuleResponse> stopRuleAsync(StopRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.stopRule);
    }

    /**
     * 停用规则
     *
     * 停用一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopRuleRequest 请求对象
     * @return AsyncInvoker<StopRuleRequest, StopRuleResponse>
     */
    public AsyncInvoker<StopRuleRequest, StopRuleResponse> stopRuleAsyncInvoker(StopRuleRequest request) {
        return new AsyncInvoker<StopRuleRequest, StopRuleResponse>(request, IefMeta.stopRule, hcClient);
    }

    /**
     * 停用系统订阅
     *
     * 停用系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSystemEventRequest 请求对象
     * @return CompletableFuture<StopSystemEventResponse>
     */
    public CompletableFuture<StopSystemEventResponse> stopSystemEventAsync(StopSystemEventRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.stopSystemEvent);
    }

    /**
     * 停用系统订阅
     *
     * 停用系统订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSystemEventRequest 请求对象
     * @return AsyncInvoker<StopSystemEventRequest, StopSystemEventResponse>
     */
    public AsyncInvoker<StopSystemEventRequest, StopSystemEventResponse> stopSystemEventAsyncInvoker(
        StopSystemEventRequest request) {
        return new AsyncInvoker<StopSystemEventRequest, StopSystemEventResponse>(request, IefMeta.stopSystemEvent,
            hcClient);
    }

    /**
     * 更新应用模板
     *
     * 更新一个应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateApp);
    }

    /**
     * 更新应用模板
     *
     * 更新一个应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, IefMeta.updateApp, hcClient);
    }

    /**
     * 更新应用模板版本
     *
     * 更新一个应用模板版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppVersionRequest 请求对象
     * @return CompletableFuture<UpdateAppVersionResponse>
     */
    public CompletableFuture<UpdateAppVersionResponse> updateAppVersionAsync(UpdateAppVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateAppVersion);
    }

    /**
     * 更新应用模板版本
     *
     * 更新一个应用模板版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppVersionRequest 请求对象
     * @return AsyncInvoker<UpdateAppVersionRequest, UpdateAppVersionResponse>
     */
    public AsyncInvoker<UpdateAppVersionRequest, UpdateAppVersionResponse> updateAppVersionAsyncInvoker(
        UpdateAppVersionRequest request) {
        return new AsyncInvoker<UpdateAppVersionRequest, UpdateAppVersionResponse>(request, IefMeta.updateAppVersion,
            hcClient);
    }

    /**
     * 更新配置项
     *
     * 更新一个配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigMapRequest 请求对象
     * @return CompletableFuture<UpdateConfigMapResponse>
     */
    public CompletableFuture<UpdateConfigMapResponse> updateConfigMapAsync(UpdateConfigMapRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateConfigMap);
    }

    /**
     * 更新配置项
     *
     * 更新一个配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigMapRequest 请求对象
     * @return AsyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse>
     */
    public AsyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse> updateConfigMapAsyncInvoker(
        UpdateConfigMapRequest request) {
        return new AsyncInvoker<UpdateConfigMapRequest, UpdateConfigMapResponse>(request, IefMeta.updateConfigMap,
            hcClient);
    }

    /**
     * 更新应用部署
     *
     * 修改应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentResponse>
     */
    public CompletableFuture<UpdateDeploymentResponse> updateDeploymentAsync(UpdateDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateDeployment);
    }

    /**
     * 更新应用部署
     *
     * 修改应用部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse>
     */
    public AsyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse> updateDeploymentAsyncInvoker(
        UpdateDeploymentRequest request) {
        return new AsyncInvoker<UpdateDeploymentRequest, UpdateDeploymentResponse>(request, IefMeta.updateDeployment,
            hcClient);
    }

    /**
     * 更新终端设备
     *
     * 更新一个终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateDevice);
    }

    /**
     * 更新终端设备
     *
     * 更新一个终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceAsyncInvoker(
        UpdateDeviceRequest request) {
        return new AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, IefMeta.updateDevice, hcClient);
    }

    /**
     * 更新终端设备模板
     *
     * 更新一个终端设备模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceTemplateByIdRequest 请求对象
     * @return CompletableFuture<UpdateDeviceTemplateByIdResponse>
     */
    public CompletableFuture<UpdateDeviceTemplateByIdResponse> updateDeviceTemplateByIdAsync(
        UpdateDeviceTemplateByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateDeviceTemplateById);
    }

    /**
     * 更新终端设备模板
     *
     * 更新一个终端设备模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceTemplateByIdRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse>
     */
    public AsyncInvoker<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> updateDeviceTemplateByIdAsyncInvoker(
        UpdateDeviceTemplateByIdRequest request) {
        return new AsyncInvoker<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse>(request,
            IefMeta.updateDeviceTemplateById, hcClient);
    }

    /**
     * 更新终端设备孪生
     *
     * 该API用于更新终端设备孪生。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceTwinRequest 请求对象
     * @return CompletableFuture<UpdateDeviceTwinResponse>
     */
    public CompletableFuture<UpdateDeviceTwinResponse> updateDeviceTwinAsync(UpdateDeviceTwinRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateDeviceTwin);
    }

    /**
     * 更新终端设备孪生
     *
     * 该API用于更新终端设备孪生。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceTwinRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse>
     */
    public AsyncInvoker<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> updateDeviceTwinAsyncInvoker(
        UpdateDeviceTwinRequest request) {
        return new AsyncInvoker<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse>(request, IefMeta.updateDeviceTwin,
            hcClient);
    }

    /**
     * 更新边缘节点组
     *
     * 更新边缘节点组描述。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeGroupRequest 请求对象
     * @return CompletableFuture<UpdateEdgeGroupResponse>
     */
    public CompletableFuture<UpdateEdgeGroupResponse> updateEdgeGroupAsync(UpdateEdgeGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateEdgeGroup);
    }

    /**
     * 更新边缘节点组
     *
     * 更新边缘节点组描述。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeGroupRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse>
     */
    public AsyncInvoker<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse> updateEdgeGroupAsyncInvoker(
        UpdateEdgeGroupRequest request) {
        return new AsyncInvoker<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse>(request, IefMeta.updateEdgeGroup,
            hcClient);
    }

    /**
     * 绑定或解绑边缘节点
     *
     * 边缘节点组绑定或解绑边缘节点。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeGroupNodeBindingRequest 请求对象
     * @return CompletableFuture<UpdateEdgeGroupNodeBindingResponse>
     */
    public CompletableFuture<UpdateEdgeGroupNodeBindingResponse> updateEdgeGroupNodeBindingAsync(
        UpdateEdgeGroupNodeBindingRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateEdgeGroupNodeBinding);
    }

    /**
     * 绑定或解绑边缘节点
     *
     * 边缘节点组绑定或解绑边缘节点。该API只能在铂金版实例中使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeGroupNodeBindingRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse>
     */
    public AsyncInvoker<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse> updateEdgeGroupNodeBindingAsyncInvoker(
        UpdateEdgeGroupNodeBindingRequest request) {
        return new AsyncInvoker<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse>(request,
            IefMeta.updateEdgeGroupNodeBinding, hcClient);
    }

    /**
     * 更新边缘节点
     *
     * 该API用于更新边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeNodeRequest 请求对象
     * @return CompletableFuture<UpdateEdgeNodeResponse>
     */
    public CompletableFuture<UpdateEdgeNodeResponse> updateEdgeNodeAsync(UpdateEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateEdgeNode);
    }

    /**
     * 更新边缘节点
     *
     * 该API用于更新边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeNodeRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse>
     */
    public AsyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> updateEdgeNodeAsyncInvoker(
        UpdateEdgeNodeRequest request) {
        return new AsyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse>(request, IefMeta.updateEdgeNode,
            hcClient);
    }

    /**
     * 更新边缘节点的终端设备
     *
     * 添加或删除边缘节点的终端设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeNodeDeviceRequest 请求对象
     * @return CompletableFuture<UpdateEdgeNodeDeviceResponse>
     */
    public CompletableFuture<UpdateEdgeNodeDeviceResponse> updateEdgeNodeDeviceAsync(
        UpdateEdgeNodeDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateEdgeNodeDevice);
    }

    /**
     * 更新边缘节点的终端设备
     *
     * 添加或删除边缘节点的终端设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeNodeDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse>
     */
    public AsyncInvoker<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> updateEdgeNodeDeviceAsyncInvoker(
        UpdateEdgeNodeDeviceRequest request) {
        return new AsyncInvoker<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse>(request,
            IefMeta.updateEdgeNodeDevice, hcClient);
    }

    /**
     * 更新加密数据
     *
     * 更新加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEncryptdatasRequest 请求对象
     * @return CompletableFuture<UpdateEncryptdatasResponse>
     */
    public CompletableFuture<UpdateEncryptdatasResponse> updateEncryptdatasAsync(UpdateEncryptdatasRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateEncryptdatas);
    }

    /**
     * 更新加密数据
     *
     * 更新加密数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEncryptdatasRequest 请求对象
     * @return AsyncInvoker<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse>
     */
    public AsyncInvoker<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse> updateEncryptdatasAsyncInvoker(
        UpdateEncryptdatasRequest request) {
        return new AsyncInvoker<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse>(request,
            IefMeta.updateEncryptdatas, hcClient);
    }

    /**
     * 更新终端设备的边缘节点
     *
     * 该API用于更新终端设备的边缘节点。功能与更新边缘节点的终端设备相同，推荐使用更新边缘节点的终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeByDeviceIdRequest 请求对象
     * @return CompletableFuture<UpdateNodeByDeviceIdResponse>
     */
    public CompletableFuture<UpdateNodeByDeviceIdResponse> updateNodeByDeviceIdAsync(
        UpdateNodeByDeviceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateNodeByDeviceId);
    }

    /**
     * 更新终端设备的边缘节点
     *
     * 该API用于更新终端设备的边缘节点。功能与更新边缘节点的终端设备相同，推荐使用更新边缘节点的终端设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeByDeviceIdRequest 请求对象
     * @return AsyncInvoker<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse>
     */
    public AsyncInvoker<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> updateNodeByDeviceIdAsyncInvoker(
        UpdateNodeByDeviceIdRequest request) {
        return new AsyncInvoker<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse>(request,
            IefMeta.updateNodeByDeviceId, hcClient);
    }

    /**
     * 更新密钥
     *
     * 更新一个密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretRequest 请求对象
     * @return CompletableFuture<UpdateSecretResponse>
     */
    public CompletableFuture<UpdateSecretResponse> updateSecretAsync(UpdateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateSecret);
    }

    /**
     * 更新密钥
     *
     * 更新一个密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretRequest 请求对象
     * @return AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse>
     */
    public AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretAsyncInvoker(
        UpdateSecretRequest request) {
        return new AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, IefMeta.updateSecret, hcClient);
    }

    /**
     * 更新服务
     *
     * 更新一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceRequest 请求对象
     * @return CompletableFuture<UpdateServiceResponse>
     */
    public CompletableFuture<UpdateServiceResponse> updateServiceAsync(UpdateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.updateService);
    }

    /**
     * 更新服务
     *
     * 更新一个服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceRequest 请求对象
     * @return AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceAsyncInvoker(
        UpdateServiceRequest request) {
        return new AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>(request, IefMeta.updateService, hcClient);
    }

    /**
     * 升级边缘节点
     *
     * 该API用于升级边缘节点。边缘节点将自动升级到最新的可用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeEdgeNodeRequest 请求对象
     * @return CompletableFuture<UpgradeEdgeNodeResponse>
     */
    public CompletableFuture<UpgradeEdgeNodeResponse> upgradeEdgeNodeAsync(UpgradeEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IefMeta.upgradeEdgeNode);
    }

    /**
     * 升级边缘节点
     *
     * 该API用于升级边缘节点。边缘节点将自动升级到最新的可用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeEdgeNodeRequest 请求对象
     * @return AsyncInvoker<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse>
     */
    public AsyncInvoker<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse> upgradeEdgeNodeAsyncInvoker(
        UpgradeEdgeNodeRequest request) {
        return new AsyncInvoker<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse>(request, IefMeta.upgradeEdgeNode,
            hcClient);
    }

}
