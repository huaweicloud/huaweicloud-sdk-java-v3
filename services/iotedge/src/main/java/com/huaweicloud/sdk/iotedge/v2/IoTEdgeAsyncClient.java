package com.huaweicloud.sdk.iotedge.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iotedge.v2.model.*;

public class IoTEdgeAsyncClient {
    protected HcClient hcClient;

    public IoTEdgeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTEdgeAsyncClient> newBuilder() {
        return new ClientBuilder<>(IoTEdgeAsyncClient::new);
    }


    /**
     * 创建边缘节点
     * 创建边缘节点
     *
     * @param CreateEdgeNodeRequest 请求对象
     * @return CompletableFuture<CreateEdgeNodeResponse>
     */
    public CompletableFuture<CreateEdgeNodeResponse> createEdgeNodeAsync(CreateEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createEdgeNode);
    }

    /**
     * 创建边缘节点
     * 创建边缘节点
     *
     * @param CreateEdgeNodeRequest 请求对象
     * @return AsyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>
     */
    public AsyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNodeAsyncInvoker(CreateEdgeNodeRequest request) {
        return new AsyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>(request, IoTEdgeMeta.createEdgeNode, hcClient);
    }

    /**
     * 生成边缘节点安装命令
     * 生成边缘节点安装命令，命令有效时间30分钟，超过后需要重新生成
     *
     * @param CreateInstallCmdRequest 请求对象
     * @return CompletableFuture<CreateInstallCmdResponse>
     */
    public CompletableFuture<CreateInstallCmdResponse> createInstallCmdAsync(CreateInstallCmdRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createInstallCmd);
    }

    /**
     * 生成边缘节点安装命令
     * 生成边缘节点安装命令，命令有效时间30分钟，超过后需要重新生成
     *
     * @param CreateInstallCmdRequest 请求对象
     * @return AsyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse>
     */
    public AsyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse> createInstallCmdAsyncInvoker(CreateInstallCmdRequest request) {
        return new AsyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse>(request, IoTEdgeMeta.createInstallCmd, hcClient);
    }

    /**
     * 删除边缘节点
     * 删除指定边缘节点
     *
     * @param DeleteEdgeNodeRequest 请求对象
     * @return CompletableFuture<DeleteEdgeNodeResponse>
     */
    public CompletableFuture<DeleteEdgeNodeResponse> deleteEdgeNodeAsync(DeleteEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteEdgeNode);
    }

    /**
     * 删除边缘节点
     * 删除指定边缘节点
     *
     * @param DeleteEdgeNodeRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>
     */
    public AsyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNodeAsyncInvoker(DeleteEdgeNodeRequest request) {
        return new AsyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>(request, IoTEdgeMeta.deleteEdgeNode, hcClient);
    }

    /**
     * 查询边缘节点列表
     * 查询边缘节点列表
     *
     * @param ListEdgeNodesRequest 请求对象
     * @return CompletableFuture<ListEdgeNodesResponse>
     */
    public CompletableFuture<ListEdgeNodesResponse> listEdgeNodesAsync(ListEdgeNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listEdgeNodes);
    }

    /**
     * 查询边缘节点列表
     * 查询边缘节点列表
     *
     * @param ListEdgeNodesRequest 请求对象
     * @return AsyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>
     */
    public AsyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodesAsyncInvoker(ListEdgeNodesRequest request) {
        return new AsyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>(request, IoTEdgeMeta.listEdgeNodes, hcClient);
    }

    /**
     * 查询边缘节点详情
     * 查询边缘节点详情
     *
     * @param ShowEdgeNodeRequest 请求对象
     * @return CompletableFuture<ShowEdgeNodeResponse>
     */
    public CompletableFuture<ShowEdgeNodeResponse> showEdgeNodeAsync(ShowEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showEdgeNode);
    }

    /**
     * 查询边缘节点详情
     * 查询边缘节点详情
     *
     * @param ShowEdgeNodeRequest 请求对象
     * @return AsyncInvoker<ShowEdgeNodeRequest, ShowEdgeNodeResponse>
     */
    public AsyncInvoker<ShowEdgeNodeRequest, ShowEdgeNodeResponse> showEdgeNodeAsyncInvoker(ShowEdgeNodeRequest request) {
        return new AsyncInvoker<ShowEdgeNodeRequest, ShowEdgeNodeResponse>(request, IoTEdgeMeta.showEdgeNode, hcClient);
    }

    /**
     * 添加设备
     * 添加设备
     *
     * @param AddDeviceRequest 请求对象
     * @return CompletableFuture<AddDeviceResponse>
     */
    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.addDevice);
    }

    /**
     * 添加设备
     * 添加设备
     *
     * @param AddDeviceRequest 请求对象
     * @return AsyncInvoker<AddDeviceRequest, AddDeviceResponse>
     */
    public AsyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceAsyncInvoker(AddDeviceRequest request) {
        return new AsyncInvoker<AddDeviceRequest, AddDeviceResponse>(request, IoTEdgeMeta.addDevice, hcClient);
    }

    /**
     * 批量修改子设备协议配置
     * 批量修改产品关联的设备，传入product_id修改该产品下所有设备，传入device_id列表，根据device_id修改,两者互斥。
     *
     * @param BatchUpdateConfigsRequest 请求对象
     * @return CompletableFuture<BatchUpdateConfigsResponse>
     */
    public CompletableFuture<BatchUpdateConfigsResponse> batchUpdateConfigsAsync(BatchUpdateConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchUpdateConfigs);
    }

    /**
     * 批量修改子设备协议配置
     * 批量修改产品关联的设备，传入product_id修改该产品下所有设备，传入device_id列表，根据device_id修改,两者互斥。
     *
     * @param BatchUpdateConfigsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateConfigsRequest, BatchUpdateConfigsResponse>
     */
    public AsyncInvoker<BatchUpdateConfigsRequest, BatchUpdateConfigsResponse> batchUpdateConfigsAsyncInvoker(BatchUpdateConfigsRequest request) {
        return new AsyncInvoker<BatchUpdateConfigsRequest, BatchUpdateConfigsResponse>(request, IoTEdgeMeta.batchUpdateConfigs, hcClient);
    }

    /**
     * 生成modbus协议设备接入码
     * 生成modbus协议设备接入码
     *
     * @param CreateAccessCodeRequest 请求对象
     * @return CompletableFuture<CreateAccessCodeResponse>
     */
    public CompletableFuture<CreateAccessCodeResponse> createAccessCodeAsync(CreateAccessCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createAccessCode);
    }

    /**
     * 生成modbus协议设备接入码
     * 生成modbus协议设备接入码
     *
     * @param CreateAccessCodeRequest 请求对象
     * @return AsyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse>
     */
    public AsyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCodeAsyncInvoker(CreateAccessCodeRequest request) {
        return new AsyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse>(request, IoTEdgeMeta.createAccessCode, hcClient);
    }

    /**
     * 删除设备
     * 删除设备
     *
     * @param DeleteDeviceRequest 请求对象
     * @return CompletableFuture<DeleteDeviceResponse>
     */
    public CompletableFuture<DeleteDeviceResponse> deleteDeviceAsync(DeleteDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteDevice);
    }

    /**
     * 删除设备
     * 删除设备
     *
     * @param DeleteDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceAsyncInvoker(DeleteDeviceRequest request) {
        return new AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, IoTEdgeMeta.deleteDevice, hcClient);
    }

    /**
     * 查询设备列表
     * 查询设备列表
     *
     * @param ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse>
     */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listDevices);
    }

    /**
     * 查询设备列表
     * 查询设备列表
     *
     * @param ListDevicesRequest 请求对象
     * @return AsyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public AsyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesAsyncInvoker(ListDevicesRequest request) {
        return new AsyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, IoTEdgeMeta.listDevices, hcClient);
    }

    /**
     * 获取协议配置
     * 获取协议配置
     *
     * @param ShowProductConfigRequest 请求对象
     * @return CompletableFuture<ShowProductConfigResponse>
     */
    public CompletableFuture<ShowProductConfigResponse> showProductConfigAsync(ShowProductConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showProductConfig);
    }

    /**
     * 获取协议配置
     * 获取协议配置
     *
     * @param ShowProductConfigRequest 请求对象
     * @return AsyncInvoker<ShowProductConfigRequest, ShowProductConfigResponse>
     */
    public AsyncInvoker<ShowProductConfigRequest, ShowProductConfigResponse> showProductConfigAsyncInvoker(ShowProductConfigRequest request) {
        return new AsyncInvoker<ShowProductConfigRequest, ShowProductConfigResponse>(request, IoTEdgeMeta.showProductConfig, hcClient);
    }

    /**
     * 获取协议映射文件
     * 获取协议映射文件
     *
     * @param ShowProtocolMappingsRequest 请求对象
     * @return CompletableFuture<ShowProtocolMappingsResponse>
     */
    public CompletableFuture<ShowProtocolMappingsResponse> showProtocolMappingsAsync(ShowProtocolMappingsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showProtocolMappings);
    }

    /**
     * 获取协议映射文件
     * 获取协议映射文件
     *
     * @param ShowProtocolMappingsRequest 请求对象
     * @return AsyncInvoker<ShowProtocolMappingsRequest, ShowProtocolMappingsResponse>
     */
    public AsyncInvoker<ShowProtocolMappingsRequest, ShowProtocolMappingsResponse> showProtocolMappingsAsyncInvoker(ShowProtocolMappingsRequest request) {
        return new AsyncInvoker<ShowProtocolMappingsRequest, ShowProtocolMappingsResponse>(request, IoTEdgeMeta.showProtocolMappings, hcClient);
    }

    /**
     * 修改设备
     * 修改设备
     *
     * @param UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateDevice);
    }

    /**
     * 修改设备
     * 修改设备
     *
     * @param UpdateDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceAsyncInvoker(UpdateDeviceRequest request) {
        return new AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, IoTEdgeMeta.updateDevice, hcClient);
    }

    /**
     * 上传协议映射文件
     * 上传协议映射文件
     *
     * @param UploadProtocolMappingsRequest 请求对象
     * @return CompletableFuture<UploadProtocolMappingsResponse>
     */
    public CompletableFuture<UploadProtocolMappingsResponse> uploadProtocolMappingsAsync(UploadProtocolMappingsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.uploadProtocolMappings);
    }

    /**
     * 上传协议映射文件
     * 上传协议映射文件
     *
     * @param UploadProtocolMappingsRequest 请求对象
     * @return AsyncInvoker<UploadProtocolMappingsRequest, UploadProtocolMappingsResponse>
     */
    public AsyncInvoker<UploadProtocolMappingsRequest, UploadProtocolMappingsResponse> uploadProtocolMappingsAsyncInvoker(UploadProtocolMappingsRequest request) {
        return new AsyncInvoker<UploadProtocolMappingsRequest, UploadProtocolMappingsResponse>(request, IoTEdgeMeta.uploadProtocolMappings, hcClient);
    }

    /**
     * 查询应用列表
     * 查询应用列表
     *
     * @param BatchListEdgeAppsRequest 请求对象
     * @return CompletableFuture<BatchListEdgeAppsResponse>
     */
    public CompletableFuture<BatchListEdgeAppsResponse> batchListEdgeAppsAsync(BatchListEdgeAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListEdgeApps);
    }

    /**
     * 查询应用列表
     * 查询应用列表
     *
     * @param BatchListEdgeAppsRequest 请求对象
     * @return AsyncInvoker<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse>
     */
    public AsyncInvoker<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse> batchListEdgeAppsAsyncInvoker(BatchListEdgeAppsRequest request) {
        return new AsyncInvoker<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse>(request, IoTEdgeMeta.batchListEdgeApps, hcClient);
    }

    /**
     * 创建应用
     * 创建应用
     *
     * @param CreateEdgeAppRequest 请求对象
     * @return CompletableFuture<CreateEdgeAppResponse>
     */
    public CompletableFuture<CreateEdgeAppResponse> createEdgeAppAsync(CreateEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createEdgeApp);
    }

    /**
     * 创建应用
     * 创建应用
     *
     * @param CreateEdgeAppRequest 请求对象
     * @return AsyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>
     */
    public AsyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeAppAsyncInvoker(CreateEdgeAppRequest request) {
        return new AsyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>(request, IoTEdgeMeta.createEdgeApp, hcClient);
    }

    /**
     * 删除应用
     * 删除应用
     *
     * @param DeleteEdgeAppRequest 请求对象
     * @return CompletableFuture<DeleteEdgeAppResponse>
     */
    public CompletableFuture<DeleteEdgeAppResponse> deleteEdgeAppAsync(DeleteEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteEdgeApp);
    }

    /**
     * 删除应用
     * 删除应用
     *
     * @param DeleteEdgeAppRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>
     */
    public AsyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeAppAsyncInvoker(DeleteEdgeAppRequest request) {
        return new AsyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>(request, IoTEdgeMeta.deleteEdgeApp, hcClient);
    }

    /**
     * 查询应用
     * 查询应用
     *
     * @param ShowEdgeAppRequest 请求对象
     * @return CompletableFuture<ShowEdgeAppResponse>
     */
    public CompletableFuture<ShowEdgeAppResponse> showEdgeAppAsync(ShowEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showEdgeApp);
    }

    /**
     * 查询应用
     * 查询应用
     *
     * @param ShowEdgeAppRequest 请求对象
     * @return AsyncInvoker<ShowEdgeAppRequest, ShowEdgeAppResponse>
     */
    public AsyncInvoker<ShowEdgeAppRequest, ShowEdgeAppResponse> showEdgeAppAsyncInvoker(ShowEdgeAppRequest request) {
        return new AsyncInvoker<ShowEdgeAppRequest, ShowEdgeAppResponse>(request, IoTEdgeMeta.showEdgeApp, hcClient);
    }

    /**
     * 查询应用版本列表
     * 查询应用版本列表
     *
     * @param BatchListEdgeAppVersionsRequest 请求对象
     * @return CompletableFuture<BatchListEdgeAppVersionsResponse>
     */
    public CompletableFuture<BatchListEdgeAppVersionsResponse> batchListEdgeAppVersionsAsync(BatchListEdgeAppVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListEdgeAppVersions);
    }

    /**
     * 查询应用版本列表
     * 查询应用版本列表
     *
     * @param BatchListEdgeAppVersionsRequest 请求对象
     * @return AsyncInvoker<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse>
     */
    public AsyncInvoker<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> batchListEdgeAppVersionsAsyncInvoker(BatchListEdgeAppVersionsRequest request) {
        return new AsyncInvoker<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse>(request, IoTEdgeMeta.batchListEdgeAppVersions, hcClient);
    }

    /**
     * 创建应用版本
     * 创建应用版本
     *
     * @param CreateEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<CreateEdgeApplicationVersionResponse>
     */
    public CompletableFuture<CreateEdgeApplicationVersionResponse> createEdgeApplicationVersionAsync(CreateEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createEdgeApplicationVersion);
    }

    /**
     * 创建应用版本
     * 创建应用版本
     *
     * @param CreateEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersionAsyncInvoker(CreateEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>(request, IoTEdgeMeta.createEdgeApplicationVersion, hcClient);
    }

    /**
     * 删除应用版本
     * 删除应用版本
     *
     * @param DeleteEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<DeleteEdgeApplicationVersionResponse>
     */
    public CompletableFuture<DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersionAsync(DeleteEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteEdgeApplicationVersion);
    }

    /**
     * 删除应用版本
     * 删除应用版本
     *
     * @param DeleteEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersionAsyncInvoker(DeleteEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>(request, IoTEdgeMeta.deleteEdgeApplicationVersion, hcClient);
    }

    /**
     * 查询应用版本详情
     * 查询应用版本详情
     *
     * @param ShowEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<ShowEdgeApplicationVersionResponse>
     */
    public CompletableFuture<ShowEdgeApplicationVersionResponse> showEdgeApplicationVersionAsync(ShowEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showEdgeApplicationVersion);
    }

    /**
     * 查询应用版本详情
     * 查询应用版本详情
     *
     * @param ShowEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersionAsyncInvoker(ShowEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>(request, IoTEdgeMeta.showEdgeApplicationVersion, hcClient);
    }

    /**
     * 修改应用版本
     * 修改应用版本
     *
     * @param UpdateEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<UpdateEdgeApplicationVersionResponse>
     */
    public CompletableFuture<UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersionAsync(UpdateEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateEdgeApplicationVersion);
    }

    /**
     * 修改应用版本
     * 修改应用版本
     *
     * @param UpdateEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersionAsyncInvoker(UpdateEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>(request, IoTEdgeMeta.updateEdgeApplicationVersion, hcClient);
    }

    /**
     * 更新应用版本状态
     * 更新应用版本状态。
     *
     * @param UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return CompletableFuture<UpdateEdgeApplicationVersionStateResponse>
     */
    public CompletableFuture<UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionStateAsync(UpdateEdgeApplicationVersionStateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateEdgeApplicationVersionState);
    }

    /**
     * 更新应用版本状态
     * 更新应用版本状态。
     *
     * @param UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>
     */
    public AsyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionStateAsyncInvoker(UpdateEdgeApplicationVersionStateRequest request) {
        return new AsyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>(request, IoTEdgeMeta.updateEdgeApplicationVersionState, hcClient);
    }

    /**
     * 在指定节点上创建外部实体
     * 用户通过在指定边缘节点上设置外部实体的接入信息
     *
     * @param CreateExternalEntityRequest 请求对象
     * @return CompletableFuture<CreateExternalEntityResponse>
     */
    public CompletableFuture<CreateExternalEntityResponse> createExternalEntityAsync(CreateExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createExternalEntity);
    }

    /**
     * 在指定节点上创建外部实体
     * 用户通过在指定边缘节点上设置外部实体的接入信息
     *
     * @param CreateExternalEntityRequest 请求对象
     * @return AsyncInvoker<CreateExternalEntityRequest, CreateExternalEntityResponse>
     */
    public AsyncInvoker<CreateExternalEntityRequest, CreateExternalEntityResponse> createExternalEntityAsyncInvoker(CreateExternalEntityRequest request) {
        return new AsyncInvoker<CreateExternalEntityRequest, CreateExternalEntityResponse>(request, IoTEdgeMeta.createExternalEntity, hcClient);
    }

    /**
     * 删除指定节点下外部实体
     * 删除节点下外部实体
     *
     * @param DeleteExternalEntityRequest 请求对象
     * @return CompletableFuture<DeleteExternalEntityResponse>
     */
    public CompletableFuture<DeleteExternalEntityResponse> deleteExternalEntityAsync(DeleteExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteExternalEntity);
    }

    /**
     * 删除指定节点下外部实体
     * 删除节点下外部实体
     *
     * @param DeleteExternalEntityRequest 请求对象
     * @return AsyncInvoker<DeleteExternalEntityRequest, DeleteExternalEntityResponse>
     */
    public AsyncInvoker<DeleteExternalEntityRequest, DeleteExternalEntityResponse> deleteExternalEntityAsyncInvoker(DeleteExternalEntityRequest request) {
        return new AsyncInvoker<DeleteExternalEntityRequest, DeleteExternalEntityResponse>(request, IoTEdgeMeta.deleteExternalEntity, hcClient);
    }

    /**
     * 查询指定边缘节点下的外部实体
     * 用户在指定边缘节点上查询外部实体列表
     *
     * @param ListExternalEntityRequest 请求对象
     * @return CompletableFuture<ListExternalEntityResponse>
     */
    public CompletableFuture<ListExternalEntityResponse> listExternalEntityAsync(ListExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listExternalEntity);
    }

    /**
     * 查询指定边缘节点下的外部实体
     * 用户在指定边缘节点上查询外部实体列表
     *
     * @param ListExternalEntityRequest 请求对象
     * @return AsyncInvoker<ListExternalEntityRequest, ListExternalEntityResponse>
     */
    public AsyncInvoker<ListExternalEntityRequest, ListExternalEntityResponse> listExternalEntityAsyncInvoker(ListExternalEntityRequest request) {
        return new AsyncInvoker<ListExternalEntityRequest, ListExternalEntityResponse>(request, IoTEdgeMeta.listExternalEntity, hcClient);
    }

    /**
     * 查询指定节点下指定外部实体的详情
     * 查询指定节点下指定外部实体的详情
     *
     * @param ShowExternalEntityRequest 请求对象
     * @return CompletableFuture<ShowExternalEntityResponse>
     */
    public CompletableFuture<ShowExternalEntityResponse> showExternalEntityAsync(ShowExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showExternalEntity);
    }

    /**
     * 查询指定节点下指定外部实体的详情
     * 查询指定节点下指定外部实体的详情
     *
     * @param ShowExternalEntityRequest 请求对象
     * @return AsyncInvoker<ShowExternalEntityRequest, ShowExternalEntityResponse>
     */
    public AsyncInvoker<ShowExternalEntityRequest, ShowExternalEntityResponse> showExternalEntityAsyncInvoker(ShowExternalEntityRequest request) {
        return new AsyncInvoker<ShowExternalEntityRequest, ShowExternalEntityResponse>(request, IoTEdgeMeta.showExternalEntity, hcClient);
    }

    /**
     * 修改节点下指定的外部实体信息
     * 用户通过在指定边缘节点上修改指定外部实体的接入信息
     *
     * @param UpdateExternalEntityRequest 请求对象
     * @return CompletableFuture<UpdateExternalEntityResponse>
     */
    public CompletableFuture<UpdateExternalEntityResponse> updateExternalEntityAsync(UpdateExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateExternalEntity);
    }

    /**
     * 修改节点下指定的外部实体信息
     * 用户通过在指定边缘节点上修改指定外部实体的接入信息
     *
     * @param UpdateExternalEntityRequest 请求对象
     * @return AsyncInvoker<UpdateExternalEntityRequest, UpdateExternalEntityResponse>
     */
    public AsyncInvoker<UpdateExternalEntityRequest, UpdateExternalEntityResponse> updateExternalEntityAsyncInvoker(UpdateExternalEntityRequest request) {
        return new AsyncInvoker<UpdateExternalEntityRequest, UpdateExternalEntityResponse>(request, IoTEdgeMeta.updateExternalEntity, hcClient);
    }

    /**
     * 查询边缘模块列表
     * 用户通过Console接口查询指定边缘节点上边缘模块列表
     *
     * @param BatchListModulesRequest 请求对象
     * @return CompletableFuture<BatchListModulesResponse>
     */
    public CompletableFuture<BatchListModulesResponse> batchListModulesAsync(BatchListModulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListModules);
    }

    /**
     * 查询边缘模块列表
     * 用户通过Console接口查询指定边缘节点上边缘模块列表
     *
     * @param BatchListModulesRequest 请求对象
     * @return AsyncInvoker<BatchListModulesRequest, BatchListModulesResponse>
     */
    public AsyncInvoker<BatchListModulesRequest, BatchListModulesResponse> batchListModulesAsyncInvoker(BatchListModulesRequest request) {
        return new AsyncInvoker<BatchListModulesRequest, BatchListModulesResponse>(request, IoTEdgeMeta.batchListModules, hcClient);
    }

    /**
     * 创建边缘模块
     * 用户通过Console接口在指定边缘节点上创建边缘模块
     *
     * @param CreateModuleRequest 请求对象
     * @return CompletableFuture<CreateModuleResponse>
     */
    public CompletableFuture<CreateModuleResponse> createModuleAsync(CreateModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createModule);
    }

    /**
     * 创建边缘模块
     * 用户通过Console接口在指定边缘节点上创建边缘模块
     *
     * @param CreateModuleRequest 请求对象
     * @return AsyncInvoker<CreateModuleRequest, CreateModuleResponse>
     */
    public AsyncInvoker<CreateModuleRequest, CreateModuleResponse> createModuleAsyncInvoker(CreateModuleRequest request) {
        return new AsyncInvoker<CreateModuleRequest, CreateModuleResponse>(request, IoTEdgeMeta.createModule, hcClient);
    }

    /**
     * 删除边缘模块
     * 用户通过过Console接口在指定边缘节点上删除边缘模块
     *
     * @param DeleteModuleRequest 请求对象
     * @return CompletableFuture<DeleteModuleResponse>
     */
    public CompletableFuture<DeleteModuleResponse> deleteModuleAsync(DeleteModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteModule);
    }

    /**
     * 删除边缘模块
     * 用户通过过Console接口在指定边缘节点上删除边缘模块
     *
     * @param DeleteModuleRequest 请求对象
     * @return AsyncInvoker<DeleteModuleRequest, DeleteModuleResponse>
     */
    public AsyncInvoker<DeleteModuleRequest, DeleteModuleResponse> deleteModuleAsyncInvoker(DeleteModuleRequest request) {
        return new AsyncInvoker<DeleteModuleRequest, DeleteModuleResponse>(request, IoTEdgeMeta.deleteModule, hcClient);
    }

    /**
     * 查询边缘模块
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     *
     * @param ShowModuleRequest 请求对象
     * @return CompletableFuture<ShowModuleResponse>
     */
    public CompletableFuture<ShowModuleResponse> showModuleAsync(ShowModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showModule);
    }

    /**
     * 查询边缘模块
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     *
     * @param ShowModuleRequest 请求对象
     * @return AsyncInvoker<ShowModuleRequest, ShowModuleResponse>
     */
    public AsyncInvoker<ShowModuleRequest, ShowModuleResponse> showModuleAsyncInvoker(ShowModuleRequest request) {
        return new AsyncInvoker<ShowModuleRequest, ShowModuleResponse>(request, IoTEdgeMeta.showModule, hcClient);
    }

    /**
     * 修改边缘模块
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     *
     * @param UpdateModuleRequest 请求对象
     * @return CompletableFuture<UpdateModuleResponse>
     */
    public CompletableFuture<UpdateModuleResponse> updateModuleAsync(UpdateModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateModule);
    }

    /**
     * 修改边缘模块
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     *
     * @param UpdateModuleRequest 请求对象
     * @return AsyncInvoker<UpdateModuleRequest, UpdateModuleResponse>
     */
    public AsyncInvoker<UpdateModuleRequest, UpdateModuleResponse> updateModuleAsyncInvoker(UpdateModuleRequest request) {
        return new AsyncInvoker<UpdateModuleRequest, UpdateModuleResponse>(request, IoTEdgeMeta.updateModule, hcClient);
    }

    /**
     * 查询边缘路由列表
     * 用户在指定边缘节点上查询边缘路由列表
     *
     * @param ListRoutesRequest 请求对象
     * @return CompletableFuture<ListRoutesResponse>
     */
    public CompletableFuture<ListRoutesResponse> listRoutesAsync(ListRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listRoutes);
    }

    /**
     * 查询边缘路由列表
     * 用户在指定边缘节点上查询边缘路由列表
     *
     * @param ListRoutesRequest 请求对象
     * @return AsyncInvoker<ListRoutesRequest, ListRoutesResponse>
     */
    public AsyncInvoker<ListRoutesRequest, ListRoutesResponse> listRoutesAsyncInvoker(ListRoutesRequest request) {
        return new AsyncInvoker<ListRoutesRequest, ListRoutesResponse>(request, IoTEdgeMeta.listRoutes, hcClient);
    }

    /**
     * 设置边缘路由
     * 用户通过在指定边缘节点上设置边缘路由
     *
     * @param UpdateRoutesRequest 请求对象
     * @return CompletableFuture<UpdateRoutesResponse>
     */
    public CompletableFuture<UpdateRoutesResponse> updateRoutesAsync(UpdateRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateRoutes);
    }

    /**
     * 设置边缘路由
     * 用户通过在指定边缘节点上设置边缘路由
     *
     * @param UpdateRoutesRequest 请求对象
     * @return AsyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>
     */
    public AsyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutesAsyncInvoker(UpdateRoutesRequest request) {
        return new AsyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>(request, IoTEdgeMeta.updateRoutes, hcClient);
    }

    /**
     * 批量确认南向3rdIA配置项
     * 南向3rdIA对下发的配置项进行批量确认
     *
     * @param BatchConfirmConfigsNewRequest 请求对象
     * @return CompletableFuture<BatchConfirmConfigsNewResponse>
     */
    public CompletableFuture<BatchConfirmConfigsNewResponse> batchConfirmConfigsNewAsync(BatchConfirmConfigsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchConfirmConfigsNew);
    }

    /**
     * 批量确认南向3rdIA配置项
     * 南向3rdIA对下发的配置项进行批量确认
     *
     * @param BatchConfirmConfigsNewRequest 请求对象
     * @return AsyncInvoker<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse>
     */
    public AsyncInvoker<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> batchConfirmConfigsNewAsyncInvoker(BatchConfirmConfigsNewRequest request) {
        return new AsyncInvoker<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse>(request, IoTEdgeMeta.batchConfirmConfigsNew, hcClient);
    }

    /**
     * 批量导入南向3rdIA配置项
     * 批量导入南向3rdIA配置项
     *
     * @param BatchImportConfigsRequest 请求对象
     * @return CompletableFuture<BatchImportConfigsResponse>
     */
    public CompletableFuture<BatchImportConfigsResponse> batchImportConfigsAsync(BatchImportConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchImportConfigs);
    }

    /**
     * 批量导入南向3rdIA配置项
     * 批量导入南向3rdIA配置项
     *
     * @param BatchImportConfigsRequest 请求对象
     * @return AsyncInvoker<BatchImportConfigsRequest, BatchImportConfigsResponse>
     */
    public AsyncInvoker<BatchImportConfigsRequest, BatchImportConfigsResponse> batchImportConfigsAsyncInvoker(BatchImportConfigsRequest request) {
        return new AsyncInvoker<BatchImportConfigsRequest, BatchImportConfigsResponse>(request, IoTEdgeMeta.batchImportConfigs, hcClient);
    }

    /**
     * 删除南向3rdIA配置项
     * 删除南向3rdIA配置项
     *
     * @param DeleteIaConfigRequest 请求对象
     * @return CompletableFuture<DeleteIaConfigResponse>
     */
    public CompletableFuture<DeleteIaConfigResponse> deleteIaConfigAsync(DeleteIaConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteIaConfig);
    }

    /**
     * 删除南向3rdIA配置项
     * 删除南向3rdIA配置项
     *
     * @param DeleteIaConfigRequest 请求对象
     * @return AsyncInvoker<DeleteIaConfigRequest, DeleteIaConfigResponse>
     */
    public AsyncInvoker<DeleteIaConfigRequest, DeleteIaConfigResponse> deleteIaConfigAsyncInvoker(DeleteIaConfigRequest request) {
        return new AsyncInvoker<DeleteIaConfigRequest, DeleteIaConfigResponse>(request, IoTEdgeMeta.deleteIaConfig, hcClient);
    }

    /**
     * 查询南向3rdIA配置项列表
     * 查询南向3rdIA配置项列表
     *
     * @param ListIaConfigsRequest 请求对象
     * @return CompletableFuture<ListIaConfigsResponse>
     */
    public CompletableFuture<ListIaConfigsResponse> listIaConfigsAsync(ListIaConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listIaConfigs);
    }

    /**
     * 查询南向3rdIA配置项列表
     * 查询南向3rdIA配置项列表
     *
     * @param ListIaConfigsRequest 请求对象
     * @return AsyncInvoker<ListIaConfigsRequest, ListIaConfigsResponse>
     */
    public AsyncInvoker<ListIaConfigsRequest, ListIaConfigsResponse> listIaConfigsAsyncInvoker(ListIaConfigsRequest request) {
        return new AsyncInvoker<ListIaConfigsRequest, ListIaConfigsResponse>(request, IoTEdgeMeta.listIaConfigs, hcClient);
    }

    /**
     * 查询南向3rdIA配置项详情
     * 查询南向3rdIA配置项详情
     *
     * @param ShowIaConfigRequest 请求对象
     * @return CompletableFuture<ShowIaConfigResponse>
     */
    public CompletableFuture<ShowIaConfigResponse> showIaConfigAsync(ShowIaConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showIaConfig);
    }

    /**
     * 查询南向3rdIA配置项详情
     * 查询南向3rdIA配置项详情
     *
     * @param ShowIaConfigRequest 请求对象
     * @return AsyncInvoker<ShowIaConfigRequest, ShowIaConfigResponse>
     */
    public AsyncInvoker<ShowIaConfigRequest, ShowIaConfigResponse> showIaConfigAsyncInvoker(ShowIaConfigRequest request) {
        return new AsyncInvoker<ShowIaConfigRequest, ShowIaConfigResponse>(request, IoTEdgeMeta.showIaConfig, hcClient);
    }

    /**
     * 创建&amp;更新南向3rdIA配置项信息
     * 创建&amp;更新南向3rdIA配置项信息
     *
     * @param UpdateIaConfigRequest 请求对象
     * @return CompletableFuture<UpdateIaConfigResponse>
     */
    public CompletableFuture<UpdateIaConfigResponse> updateIaConfigAsync(UpdateIaConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateIaConfig);
    }

    /**
     * 创建&amp;更新南向3rdIA配置项信息
     * 创建&amp;更新南向3rdIA配置项信息
     *
     * @param UpdateIaConfigRequest 请求对象
     * @return AsyncInvoker<UpdateIaConfigRequest, UpdateIaConfigResponse>
     */
    public AsyncInvoker<UpdateIaConfigRequest, UpdateIaConfigResponse> updateIaConfigAsyncInvoker(UpdateIaConfigRequest request) {
        return new AsyncInvoker<UpdateIaConfigRequest, UpdateIaConfigResponse>(request, IoTEdgeMeta.updateIaConfig, hcClient);
    }

    /**
     * 授权北向NA信息到边缘节点
     * 批量授权北向NA信息到边缘节点。 已授权的边缘节点上的南向IA应用，可以通过部署在边缘节点上的api网关访问北向NA提供的接口。 
     *
     * @param BatchAssociateNaToNodesRequest 请求对象
     * @return CompletableFuture<BatchAssociateNaToNodesResponse>
     */
    public CompletableFuture<BatchAssociateNaToNodesResponse> batchAssociateNaToNodesAsync(BatchAssociateNaToNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchAssociateNaToNodes);
    }

    /**
     * 授权北向NA信息到边缘节点
     * 批量授权北向NA信息到边缘节点。 已授权的边缘节点上的南向IA应用，可以通过部署在边缘节点上的api网关访问北向NA提供的接口。 
     *
     * @param BatchAssociateNaToNodesRequest 请求对象
     * @return AsyncInvoker<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse>
     */
    public AsyncInvoker<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> batchAssociateNaToNodesAsyncInvoker(BatchAssociateNaToNodesRequest request) {
        return new AsyncInvoker<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse>(request, IoTEdgeMeta.batchAssociateNaToNodes, hcClient);
    }

    /**
     * 删除北向NA信息
     * 删除北向NA信息，如果有边缘节点已分配该NA信息，会通知到该边缘节点。 
     *
     * @param DeleteNaRequest 请求对象
     * @return CompletableFuture<DeleteNaResponse>
     */
    public CompletableFuture<DeleteNaResponse> deleteNaAsync(DeleteNaRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteNa);
    }

    /**
     * 删除北向NA信息
     * 删除北向NA信息，如果有边缘节点已分配该NA信息，会通知到该边缘节点。 
     *
     * @param DeleteNaRequest 请求对象
     * @return AsyncInvoker<DeleteNaRequest, DeleteNaResponse>
     */
    public AsyncInvoker<DeleteNaRequest, DeleteNaResponse> deleteNaAsyncInvoker(DeleteNaRequest request) {
        return new AsyncInvoker<DeleteNaRequest, DeleteNaResponse>(request, IoTEdgeMeta.deleteNa, hcClient);
    }

    /**
     * 查询该北向NA信息的已分配节点
     * 查询该北向NA信息的已分配节点
     *
     * @param ListNaAuthorizedNodesRequest 请求对象
     * @return CompletableFuture<ListNaAuthorizedNodesResponse>
     */
    public CompletableFuture<ListNaAuthorizedNodesResponse> listNaAuthorizedNodesAsync(ListNaAuthorizedNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listNaAuthorizedNodes);
    }

    /**
     * 查询该北向NA信息的已分配节点
     * 查询该北向NA信息的已分配节点
     *
     * @param ListNaAuthorizedNodesRequest 请求对象
     * @return AsyncInvoker<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse>
     */
    public AsyncInvoker<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> listNaAuthorizedNodesAsyncInvoker(ListNaAuthorizedNodesRequest request) {
        return new AsyncInvoker<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse>(request, IoTEdgeMeta.listNaAuthorizedNodes, hcClient);
    }

    /**
     * 查询北向NA信息列表
     * 查询北向NA信息列表
     *
     * @param ListNasRequest 请求对象
     * @return CompletableFuture<ListNasResponse>
     */
    public CompletableFuture<ListNasResponse> listNasAsync(ListNasRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listNas);
    }

    /**
     * 查询北向NA信息列表
     * 查询北向NA信息列表
     *
     * @param ListNasRequest 请求对象
     * @return AsyncInvoker<ListNasRequest, ListNasResponse>
     */
    public AsyncInvoker<ListNasRequest, ListNasResponse> listNasAsyncInvoker(ListNasRequest request) {
        return new AsyncInvoker<ListNasRequest, ListNasResponse>(request, IoTEdgeMeta.listNas, hcClient);
    }

    /**
     * 查询北向NA信息详情
     * 查询北向NA信息详情
     *
     * @param ShowNaRequest 请求对象
     * @return CompletableFuture<ShowNaResponse>
     */
    public CompletableFuture<ShowNaResponse> showNaAsync(ShowNaRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showNa);
    }

    /**
     * 查询北向NA信息详情
     * 查询北向NA信息详情
     *
     * @param ShowNaRequest 请求对象
     * @return AsyncInvoker<ShowNaRequest, ShowNaResponse>
     */
    public AsyncInvoker<ShowNaRequest, ShowNaResponse> showNaAsyncInvoker(ShowNaRequest request) {
        return new AsyncInvoker<ShowNaRequest, ShowNaResponse>(request, IoTEdgeMeta.showNa, hcClient);
    }

    /**
     * 创建&amp;更新北向NA信息
     * 创建&amp;更新北向NA信息，当更新北向NA信息时，会通知到已分配该北向NA的所有边缘节点。 
     *
     * @param UpdateNaRequest 请求对象
     * @return CompletableFuture<UpdateNaResponse>
     */
    public CompletableFuture<UpdateNaResponse> updateNaAsync(UpdateNaRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateNa);
    }

    /**
     * 创建&amp;更新北向NA信息
     * 创建&amp;更新北向NA信息，当更新北向NA信息时，会通知到已分配该北向NA的所有边缘节点。 
     *
     * @param UpdateNaRequest 请求对象
     * @return AsyncInvoker<UpdateNaRequest, UpdateNaResponse>
     */
    public AsyncInvoker<UpdateNaRequest, UpdateNaResponse> updateNaAsyncInvoker(UpdateNaRequest request) {
        return new AsyncInvoker<UpdateNaRequest, UpdateNaResponse>(request, IoTEdgeMeta.updateNa, hcClient);
    }

}