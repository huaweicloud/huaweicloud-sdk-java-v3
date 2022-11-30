package com.huaweicloud.sdk.iotedge.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iotedge.v2.model.*;

public class IoTEdgeClient {
    protected HcClient hcClient;

    public IoTEdgeClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTEdgeClient> newBuilder() {
        return new ClientBuilder<>(IoTEdgeClient::new);
    }


    /**
     * 创建边缘节点
     *
     * 创建边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeNodeRequest 请求对象
     * @return CreateEdgeNodeResponse
     */
    public CreateEdgeNodeResponse createEdgeNode(CreateEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createEdgeNode);
    }

    /**
     * 创建边缘节点
     *
     * 创建边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeNodeRequest 请求对象
     * @return SyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>
     */
    public SyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNodeInvoker(CreateEdgeNodeRequest request) {
        return new SyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>(request, IoTEdgeMeta.createEdgeNode, hcClient);
    }

    /**
     * 生成边缘节点安装命令
     *
     * 生成边缘节点安装命令，命令有效时间30分钟，超过后需要重新生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstallCmdRequest 请求对象
     * @return CreateInstallCmdResponse
     */
    public CreateInstallCmdResponse createInstallCmd(CreateInstallCmdRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createInstallCmd);
    }

    /**
     * 生成边缘节点安装命令
     *
     * 生成边缘节点安装命令，命令有效时间30分钟，超过后需要重新生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstallCmdRequest 请求对象
     * @return SyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse>
     */
    public SyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse> createInstallCmdInvoker(CreateInstallCmdRequest request) {
        return new SyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse>(request, IoTEdgeMeta.createInstallCmd, hcClient);
    }

    /**
     * 删除边缘节点
     *
     * 删除指定边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeNodeRequest 请求对象
     * @return DeleteEdgeNodeResponse
     */
    public DeleteEdgeNodeResponse deleteEdgeNode(DeleteEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteEdgeNode);
    }

    /**
     * 删除边缘节点
     *
     * 删除指定边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeNodeRequest 请求对象
     * @return SyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>
     */
    public SyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNodeInvoker(DeleteEdgeNodeRequest request) {
        return new SyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>(request, IoTEdgeMeta.deleteEdgeNode, hcClient);
    }

    /**
     * 查询边缘节点列表
     *
     * 查询边缘节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeNodesRequest 请求对象
     * @return ListEdgeNodesResponse
     */
    public ListEdgeNodesResponse listEdgeNodes(ListEdgeNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listEdgeNodes);
    }

    /**
     * 查询边缘节点列表
     *
     * 查询边缘节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeNodesRequest 请求对象
     * @return SyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>
     */
    public SyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodesInvoker(ListEdgeNodesRequest request) {
        return new SyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>(request, IoTEdgeMeta.listEdgeNodes, hcClient);
    }

    /**
     * 查询边缘节点详情
     *
     * 查询边缘节点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeNodeRequest 请求对象
     * @return ShowEdgeNodeResponse
     */
    public ShowEdgeNodeResponse showEdgeNode(ShowEdgeNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showEdgeNode);
    }

    /**
     * 查询边缘节点详情
     *
     * 查询边缘节点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeNodeRequest 请求对象
     * @return SyncInvoker<ShowEdgeNodeRequest, ShowEdgeNodeResponse>
     */
    public SyncInvoker<ShowEdgeNodeRequest, ShowEdgeNodeResponse> showEdgeNodeInvoker(ShowEdgeNodeRequest request) {
        return new SyncInvoker<ShowEdgeNodeRequest, ShowEdgeNodeResponse>(request, IoTEdgeMeta.showEdgeNode, hcClient);
    }

    /**
     * 添加设备
     *
     * 添加设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeviceRequest 请求对象
     * @return AddDeviceResponse
     */
    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.addDevice);
    }

    /**
     * 添加设备
     *
     * 添加设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeviceRequest 请求对象
     * @return SyncInvoker<AddDeviceRequest, AddDeviceResponse>
     */
    public SyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceInvoker(AddDeviceRequest request) {
        return new SyncInvoker<AddDeviceRequest, AddDeviceResponse>(request, IoTEdgeMeta.addDevice, hcClient);
    }

    /**
     * 删除设备
     *
     * 删除设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceRequest 请求对象
     * @return DeleteDeviceResponse
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteDevice);
    }

    /**
     * 删除设备
     *
     * 删除设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceRequest 请求对象
     * @return SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceInvoker(DeleteDeviceRequest request) {
        return new SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, IoTEdgeMeta.deleteDevice, hcClient);
    }

    /**
     * 查询设备列表
     *
     * 查询设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listDevices);
    }

    /**
     * 查询设备列表
     *
     * 查询设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, IoTEdgeMeta.listDevices, hcClient);
    }

    /**
     * 获取协议配置
     *
     * 获取协议配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductConfigRequest 请求对象
     * @return ShowProductConfigResponse
     */
    public ShowProductConfigResponse showProductConfig(ShowProductConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showProductConfig);
    }

    /**
     * 获取协议配置
     *
     * 获取协议配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductConfigRequest 请求对象
     * @return SyncInvoker<ShowProductConfigRequest, ShowProductConfigResponse>
     */
    public SyncInvoker<ShowProductConfigRequest, ShowProductConfigResponse> showProductConfigInvoker(ShowProductConfigRequest request) {
        return new SyncInvoker<ShowProductConfigRequest, ShowProductConfigResponse>(request, IoTEdgeMeta.showProductConfig, hcClient);
    }

    /**
     * 修改设备
     *
     * 修改设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateDevice);
    }

    /**
     * 修改设备
     *
     * 修改设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, IoTEdgeMeta.updateDevice, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListEdgeAppsRequest 请求对象
     * @return BatchListEdgeAppsResponse
     */
    public BatchListEdgeAppsResponse batchListEdgeApps(BatchListEdgeAppsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.batchListEdgeApps);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListEdgeAppsRequest 请求对象
     * @return SyncInvoker<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse>
     */
    public SyncInvoker<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse> batchListEdgeAppsInvoker(BatchListEdgeAppsRequest request) {
        return new SyncInvoker<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse>(request, IoTEdgeMeta.batchListEdgeApps, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeAppRequest 请求对象
     * @return CreateEdgeAppResponse
     */
    public CreateEdgeAppResponse createEdgeApp(CreateEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createEdgeApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeAppRequest 请求对象
     * @return SyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>
     */
    public SyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeAppInvoker(CreateEdgeAppRequest request) {
        return new SyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>(request, IoTEdgeMeta.createEdgeApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeAppRequest 请求对象
     * @return DeleteEdgeAppResponse
     */
    public DeleteEdgeAppResponse deleteEdgeApp(DeleteEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteEdgeApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeAppRequest 请求对象
     * @return SyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>
     */
    public SyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeAppInvoker(DeleteEdgeAppRequest request) {
        return new SyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>(request, IoTEdgeMeta.deleteEdgeApp, hcClient);
    }

    /**
     * 查询应用
     *
     * 查询应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeAppRequest 请求对象
     * @return ShowEdgeAppResponse
     */
    public ShowEdgeAppResponse showEdgeApp(ShowEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showEdgeApp);
    }

    /**
     * 查询应用
     *
     * 查询应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeAppRequest 请求对象
     * @return SyncInvoker<ShowEdgeAppRequest, ShowEdgeAppResponse>
     */
    public SyncInvoker<ShowEdgeAppRequest, ShowEdgeAppResponse> showEdgeAppInvoker(ShowEdgeAppRequest request) {
        return new SyncInvoker<ShowEdgeAppRequest, ShowEdgeAppResponse>(request, IoTEdgeMeta.showEdgeApp, hcClient);
    }

    /**
     * 查询应用版本列表
     *
     * 查询应用版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListEdgeAppVersionsRequest 请求对象
     * @return BatchListEdgeAppVersionsResponse
     */
    public BatchListEdgeAppVersionsResponse batchListEdgeAppVersions(BatchListEdgeAppVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.batchListEdgeAppVersions);
    }

    /**
     * 查询应用版本列表
     *
     * 查询应用版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListEdgeAppVersionsRequest 请求对象
     * @return SyncInvoker<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse>
     */
    public SyncInvoker<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> batchListEdgeAppVersionsInvoker(BatchListEdgeAppVersionsRequest request) {
        return new SyncInvoker<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse>(request, IoTEdgeMeta.batchListEdgeAppVersions, hcClient);
    }

    /**
     * 创建应用版本
     *
     * 创建应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeApplicationVersionRequest 请求对象
     * @return CreateEdgeApplicationVersionResponse
     */
    public CreateEdgeApplicationVersionResponse createEdgeApplicationVersion(CreateEdgeApplicationVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createEdgeApplicationVersion);
    }

    /**
     * 创建应用版本
     *
     * 创建应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeApplicationVersionRequest 请求对象
     * @return SyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>
     */
    public SyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersionInvoker(CreateEdgeApplicationVersionRequest request) {
        return new SyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>(request, IoTEdgeMeta.createEdgeApplicationVersion, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeApplicationVersionRequest 请求对象
     * @return DeleteEdgeApplicationVersionResponse
     */
    public DeleteEdgeApplicationVersionResponse deleteEdgeApplicationVersion(DeleteEdgeApplicationVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteEdgeApplicationVersion);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeApplicationVersionRequest 请求对象
     * @return SyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>
     */
    public SyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersionInvoker(DeleteEdgeApplicationVersionRequest request) {
        return new SyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>(request, IoTEdgeMeta.deleteEdgeApplicationVersion, hcClient);
    }

    /**
     * 查询应用版本详情
     *
     * 查询应用版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeApplicationVersionRequest 请求对象
     * @return ShowEdgeApplicationVersionResponse
     */
    public ShowEdgeApplicationVersionResponse showEdgeApplicationVersion(ShowEdgeApplicationVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showEdgeApplicationVersion);
    }

    /**
     * 查询应用版本详情
     *
     * 查询应用版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeApplicationVersionRequest 请求对象
     * @return SyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>
     */
    public SyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersionInvoker(ShowEdgeApplicationVersionRequest request) {
        return new SyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>(request, IoTEdgeMeta.showEdgeApplicationVersion, hcClient);
    }

    /**
     * 修改应用版本
     *
     * 修改应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionRequest 请求对象
     * @return UpdateEdgeApplicationVersionResponse
     */
    public UpdateEdgeApplicationVersionResponse updateEdgeApplicationVersion(UpdateEdgeApplicationVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateEdgeApplicationVersion);
    }

    /**
     * 修改应用版本
     *
     * 修改应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionRequest 请求对象
     * @return SyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>
     */
    public SyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersionInvoker(UpdateEdgeApplicationVersionRequest request) {
        return new SyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>(request, IoTEdgeMeta.updateEdgeApplicationVersion, hcClient);
    }

    /**
     * 更新应用版本状态
     *
     * 更新应用版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return UpdateEdgeApplicationVersionStateResponse
     */
    public UpdateEdgeApplicationVersionStateResponse updateEdgeApplicationVersionState(UpdateEdgeApplicationVersionStateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateEdgeApplicationVersionState);
    }

    /**
     * 更新应用版本状态
     *
     * 更新应用版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return SyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>
     */
    public SyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionStateInvoker(UpdateEdgeApplicationVersionStateRequest request) {
        return new SyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>(request, IoTEdgeMeta.updateEdgeApplicationVersionState, hcClient);
    }

    /**
     * 在指定节点上创建外部实体
     *
     * 用户通过在指定边缘节点上设置外部实体的接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExternalEntityRequest 请求对象
     * @return CreateExternalEntityResponse
     */
    public CreateExternalEntityResponse createExternalEntity(CreateExternalEntityRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createExternalEntity);
    }

    /**
     * 在指定节点上创建外部实体
     *
     * 用户通过在指定边缘节点上设置外部实体的接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExternalEntityRequest 请求对象
     * @return SyncInvoker<CreateExternalEntityRequest, CreateExternalEntityResponse>
     */
    public SyncInvoker<CreateExternalEntityRequest, CreateExternalEntityResponse> createExternalEntityInvoker(CreateExternalEntityRequest request) {
        return new SyncInvoker<CreateExternalEntityRequest, CreateExternalEntityResponse>(request, IoTEdgeMeta.createExternalEntity, hcClient);
    }

    /**
     * 删除指定节点下外部实体
     *
     * 删除节点下外部实体
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteExternalEntityRequest 请求对象
     * @return DeleteExternalEntityResponse
     */
    public DeleteExternalEntityResponse deleteExternalEntity(DeleteExternalEntityRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteExternalEntity);
    }

    /**
     * 删除指定节点下外部实体
     *
     * 删除节点下外部实体
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteExternalEntityRequest 请求对象
     * @return SyncInvoker<DeleteExternalEntityRequest, DeleteExternalEntityResponse>
     */
    public SyncInvoker<DeleteExternalEntityRequest, DeleteExternalEntityResponse> deleteExternalEntityInvoker(DeleteExternalEntityRequest request) {
        return new SyncInvoker<DeleteExternalEntityRequest, DeleteExternalEntityResponse>(request, IoTEdgeMeta.deleteExternalEntity, hcClient);
    }

    /**
     * 查询指定边缘节点下的外部实体
     *
     * 用户在指定边缘节点上查询外部实体列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExternalEntityRequest 请求对象
     * @return ListExternalEntityResponse
     */
    public ListExternalEntityResponse listExternalEntity(ListExternalEntityRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listExternalEntity);
    }

    /**
     * 查询指定边缘节点下的外部实体
     *
     * 用户在指定边缘节点上查询外部实体列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExternalEntityRequest 请求对象
     * @return SyncInvoker<ListExternalEntityRequest, ListExternalEntityResponse>
     */
    public SyncInvoker<ListExternalEntityRequest, ListExternalEntityResponse> listExternalEntityInvoker(ListExternalEntityRequest request) {
        return new SyncInvoker<ListExternalEntityRequest, ListExternalEntityResponse>(request, IoTEdgeMeta.listExternalEntity, hcClient);
    }

    /**
     * 修改节点下指定的外部实体信息
     *
     * 用户通过在指定边缘节点上修改指定外部实体的接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateExternalEntityRequest 请求对象
     * @return UpdateExternalEntityResponse
     */
    public UpdateExternalEntityResponse updateExternalEntity(UpdateExternalEntityRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateExternalEntity);
    }

    /**
     * 修改节点下指定的外部实体信息
     *
     * 用户通过在指定边缘节点上修改指定外部实体的接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateExternalEntityRequest 请求对象
     * @return SyncInvoker<UpdateExternalEntityRequest, UpdateExternalEntityResponse>
     */
    public SyncInvoker<UpdateExternalEntityRequest, UpdateExternalEntityResponse> updateExternalEntityInvoker(UpdateExternalEntityRequest request) {
        return new SyncInvoker<UpdateExternalEntityRequest, UpdateExternalEntityResponse>(request, IoTEdgeMeta.updateExternalEntity, hcClient);
    }

    /**
     * 查询边缘模块列表
     *
     * 用户通过Console接口查询指定边缘节点上边缘模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListModulesRequest 请求对象
     * @return BatchListModulesResponse
     */
    public BatchListModulesResponse batchListModules(BatchListModulesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.batchListModules);
    }

    /**
     * 查询边缘模块列表
     *
     * 用户通过Console接口查询指定边缘节点上边缘模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListModulesRequest 请求对象
     * @return SyncInvoker<BatchListModulesRequest, BatchListModulesResponse>
     */
    public SyncInvoker<BatchListModulesRequest, BatchListModulesResponse> batchListModulesInvoker(BatchListModulesRequest request) {
        return new SyncInvoker<BatchListModulesRequest, BatchListModulesResponse>(request, IoTEdgeMeta.batchListModules, hcClient);
    }

    /**
     * 创建边缘模块
     *
     * 用户通过Console接口在指定边缘节点上创建边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateModuleRequest 请求对象
     * @return CreateModuleResponse
     */
    public CreateModuleResponse createModule(CreateModuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createModule);
    }

    /**
     * 创建边缘模块
     *
     * 用户通过Console接口在指定边缘节点上创建边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateModuleRequest 请求对象
     * @return SyncInvoker<CreateModuleRequest, CreateModuleResponse>
     */
    public SyncInvoker<CreateModuleRequest, CreateModuleResponse> createModuleInvoker(CreateModuleRequest request) {
        return new SyncInvoker<CreateModuleRequest, CreateModuleResponse>(request, IoTEdgeMeta.createModule, hcClient);
    }

    /**
     * 删除边缘模块
     *
     * 用户通过过Console接口在指定边缘节点上删除边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteModuleRequest 请求对象
     * @return DeleteModuleResponse
     */
    public DeleteModuleResponse deleteModule(DeleteModuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteModule);
    }

    /**
     * 删除边缘模块
     *
     * 用户通过过Console接口在指定边缘节点上删除边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteModuleRequest 请求对象
     * @return SyncInvoker<DeleteModuleRequest, DeleteModuleResponse>
     */
    public SyncInvoker<DeleteModuleRequest, DeleteModuleResponse> deleteModuleInvoker(DeleteModuleRequest request) {
        return new SyncInvoker<DeleteModuleRequest, DeleteModuleResponse>(request, IoTEdgeMeta.deleteModule, hcClient);
    }

    /**
     * 查询边缘模块
     *
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowModuleRequest 请求对象
     * @return ShowModuleResponse
     */
    public ShowModuleResponse showModule(ShowModuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showModule);
    }

    /**
     * 查询边缘模块
     *
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowModuleRequest 请求对象
     * @return SyncInvoker<ShowModuleRequest, ShowModuleResponse>
     */
    public SyncInvoker<ShowModuleRequest, ShowModuleResponse> showModuleInvoker(ShowModuleRequest request) {
        return new SyncInvoker<ShowModuleRequest, ShowModuleResponse>(request, IoTEdgeMeta.showModule, hcClient);
    }

    /**
     * 修改边缘模块
     *
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateModuleRequest 请求对象
     * @return UpdateModuleResponse
     */
    public UpdateModuleResponse updateModule(UpdateModuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateModule);
    }

    /**
     * 修改边缘模块
     *
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateModuleRequest 请求对象
     * @return SyncInvoker<UpdateModuleRequest, UpdateModuleResponse>
     */
    public SyncInvoker<UpdateModuleRequest, UpdateModuleResponse> updateModuleInvoker(UpdateModuleRequest request) {
        return new SyncInvoker<UpdateModuleRequest, UpdateModuleResponse>(request, IoTEdgeMeta.updateModule, hcClient);
    }

    /**
     * 查询边缘路由列表
     *
     * 用户在指定边缘节点上查询边缘路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutesRequest 请求对象
     * @return ListRoutesResponse
     */
    public ListRoutesResponse listRoutes(ListRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listRoutes);
    }

    /**
     * 查询边缘路由列表
     *
     * 用户在指定边缘节点上查询边缘路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutesRequest 请求对象
     * @return SyncInvoker<ListRoutesRequest, ListRoutesResponse>
     */
    public SyncInvoker<ListRoutesRequest, ListRoutesResponse> listRoutesInvoker(ListRoutesRequest request) {
        return new SyncInvoker<ListRoutesRequest, ListRoutesResponse>(request, IoTEdgeMeta.listRoutes, hcClient);
    }

    /**
     * 设置边缘路由
     *
     * 用户通过在指定边缘节点上设置边缘路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutesRequest 请求对象
     * @return UpdateRoutesResponse
     */
    public UpdateRoutesResponse updateRoutes(UpdateRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateRoutes);
    }

    /**
     * 设置边缘路由
     *
     * 用户通过在指定边缘节点上设置边缘路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutesRequest 请求对象
     * @return SyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>
     */
    public SyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutesInvoker(UpdateRoutesRequest request) {
        return new SyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>(request, IoTEdgeMeta.updateRoutes, hcClient);
    }

    /**
     * 批量确认南向3rdIA配置项
     *
     * 南向3rdIA对下发的配置项进行批量确认
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchConfirmConfigsNewRequest 请求对象
     * @return BatchConfirmConfigsNewResponse
     */
    public BatchConfirmConfigsNewResponse batchConfirmConfigsNew(BatchConfirmConfigsNewRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.batchConfirmConfigsNew);
    }

    /**
     * 批量确认南向3rdIA配置项
     *
     * 南向3rdIA对下发的配置项进行批量确认
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchConfirmConfigsNewRequest 请求对象
     * @return SyncInvoker<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse>
     */
    public SyncInvoker<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> batchConfirmConfigsNewInvoker(BatchConfirmConfigsNewRequest request) {
        return new SyncInvoker<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse>(request, IoTEdgeMeta.batchConfirmConfigsNew, hcClient);
    }

    /**
     * 批量导入南向3rdIA配置项
     *
     * 批量导入南向3rdIA配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportConfigsRequest 请求对象
     * @return BatchImportConfigsResponse
     */
    public BatchImportConfigsResponse batchImportConfigs(BatchImportConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.batchImportConfigs);
    }

    /**
     * 批量导入南向3rdIA配置项
     *
     * 批量导入南向3rdIA配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportConfigsRequest 请求对象
     * @return SyncInvoker<BatchImportConfigsRequest, BatchImportConfigsResponse>
     */
    public SyncInvoker<BatchImportConfigsRequest, BatchImportConfigsResponse> batchImportConfigsInvoker(BatchImportConfigsRequest request) {
        return new SyncInvoker<BatchImportConfigsRequest, BatchImportConfigsResponse>(request, IoTEdgeMeta.batchImportConfigs, hcClient);
    }

    /**
     * 删除南向3rdIA配置项
     *
     * 删除南向3rdIA配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIaConfigRequest 请求对象
     * @return DeleteIaConfigResponse
     */
    public DeleteIaConfigResponse deleteIaConfig(DeleteIaConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteIaConfig);
    }

    /**
     * 删除南向3rdIA配置项
     *
     * 删除南向3rdIA配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIaConfigRequest 请求对象
     * @return SyncInvoker<DeleteIaConfigRequest, DeleteIaConfigResponse>
     */
    public SyncInvoker<DeleteIaConfigRequest, DeleteIaConfigResponse> deleteIaConfigInvoker(DeleteIaConfigRequest request) {
        return new SyncInvoker<DeleteIaConfigRequest, DeleteIaConfigResponse>(request, IoTEdgeMeta.deleteIaConfig, hcClient);
    }

    /**
     * 查询南向3rdIA配置项列表
     *
     * 查询南向3rdIA配置项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIaConfigsRequest 请求对象
     * @return ListIaConfigsResponse
     */
    public ListIaConfigsResponse listIaConfigs(ListIaConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listIaConfigs);
    }

    /**
     * 查询南向3rdIA配置项列表
     *
     * 查询南向3rdIA配置项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIaConfigsRequest 请求对象
     * @return SyncInvoker<ListIaConfigsRequest, ListIaConfigsResponse>
     */
    public SyncInvoker<ListIaConfigsRequest, ListIaConfigsResponse> listIaConfigsInvoker(ListIaConfigsRequest request) {
        return new SyncInvoker<ListIaConfigsRequest, ListIaConfigsResponse>(request, IoTEdgeMeta.listIaConfigs, hcClient);
    }

    /**
     * 查询南向3rdIA配置项详情
     *
     * 查询南向3rdIA配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIaConfigRequest 请求对象
     * @return ShowIaConfigResponse
     */
    public ShowIaConfigResponse showIaConfig(ShowIaConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showIaConfig);
    }

    /**
     * 查询南向3rdIA配置项详情
     *
     * 查询南向3rdIA配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIaConfigRequest 请求对象
     * @return SyncInvoker<ShowIaConfigRequest, ShowIaConfigResponse>
     */
    public SyncInvoker<ShowIaConfigRequest, ShowIaConfigResponse> showIaConfigInvoker(ShowIaConfigRequest request) {
        return new SyncInvoker<ShowIaConfigRequest, ShowIaConfigResponse>(request, IoTEdgeMeta.showIaConfig, hcClient);
    }

    /**
     * 创建&amp;更新南向3rdIA配置项信息
     *
     * 创建&amp;更新南向3rdIA配置项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIaConfigRequest 请求对象
     * @return UpdateIaConfigResponse
     */
    public UpdateIaConfigResponse updateIaConfig(UpdateIaConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateIaConfig);
    }

    /**
     * 创建&amp;更新南向3rdIA配置项信息
     *
     * 创建&amp;更新南向3rdIA配置项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIaConfigRequest 请求对象
     * @return SyncInvoker<UpdateIaConfigRequest, UpdateIaConfigResponse>
     */
    public SyncInvoker<UpdateIaConfigRequest, UpdateIaConfigResponse> updateIaConfigInvoker(UpdateIaConfigRequest request) {
        return new SyncInvoker<UpdateIaConfigRequest, UpdateIaConfigResponse>(request, IoTEdgeMeta.updateIaConfig, hcClient);
    }

    /**
     * 授权北向NA信息到边缘节点
     *
     * 批量授权北向NA信息到边缘节点。
     * 已授权的边缘节点上的南向IA应用，可以通过部署在边缘节点上的api网关访问北向NA提供的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAssociateNaToNodesRequest 请求对象
     * @return BatchAssociateNaToNodesResponse
     */
    public BatchAssociateNaToNodesResponse batchAssociateNaToNodes(BatchAssociateNaToNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.batchAssociateNaToNodes);
    }

    /**
     * 授权北向NA信息到边缘节点
     *
     * 批量授权北向NA信息到边缘节点。
     * 已授权的边缘节点上的南向IA应用，可以通过部署在边缘节点上的api网关访问北向NA提供的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAssociateNaToNodesRequest 请求对象
     * @return SyncInvoker<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse>
     */
    public SyncInvoker<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> batchAssociateNaToNodesInvoker(BatchAssociateNaToNodesRequest request) {
        return new SyncInvoker<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse>(request, IoTEdgeMeta.batchAssociateNaToNodes, hcClient);
    }

    /**
     * 删除北向NA信息
     *
     * 删除北向NA信息，如果有边缘节点已分配该NA信息，会通知到该边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNaRequest 请求对象
     * @return DeleteNaResponse
     */
    public DeleteNaResponse deleteNa(DeleteNaRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteNa);
    }

    /**
     * 删除北向NA信息
     *
     * 删除北向NA信息，如果有边缘节点已分配该NA信息，会通知到该边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNaRequest 请求对象
     * @return SyncInvoker<DeleteNaRequest, DeleteNaResponse>
     */
    public SyncInvoker<DeleteNaRequest, DeleteNaResponse> deleteNaInvoker(DeleteNaRequest request) {
        return new SyncInvoker<DeleteNaRequest, DeleteNaResponse>(request, IoTEdgeMeta.deleteNa, hcClient);
    }

    /**
     * 查询该北向NA信息的已分配节点
     *
     * 查询该北向NA信息的已分配节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNaAuthorizedNodesRequest 请求对象
     * @return ListNaAuthorizedNodesResponse
     */
    public ListNaAuthorizedNodesResponse listNaAuthorizedNodes(ListNaAuthorizedNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listNaAuthorizedNodes);
    }

    /**
     * 查询该北向NA信息的已分配节点
     *
     * 查询该北向NA信息的已分配节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNaAuthorizedNodesRequest 请求对象
     * @return SyncInvoker<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse>
     */
    public SyncInvoker<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> listNaAuthorizedNodesInvoker(ListNaAuthorizedNodesRequest request) {
        return new SyncInvoker<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse>(request, IoTEdgeMeta.listNaAuthorizedNodes, hcClient);
    }

    /**
     * 查询北向NA信息列表
     *
     * 查询北向NA信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNasRequest 请求对象
     * @return ListNasResponse
     */
    public ListNasResponse listNas(ListNasRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listNas);
    }

    /**
     * 查询北向NA信息列表
     *
     * 查询北向NA信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNasRequest 请求对象
     * @return SyncInvoker<ListNasRequest, ListNasResponse>
     */
    public SyncInvoker<ListNasRequest, ListNasResponse> listNasInvoker(ListNasRequest request) {
        return new SyncInvoker<ListNasRequest, ListNasResponse>(request, IoTEdgeMeta.listNas, hcClient);
    }

    /**
     * 查询北向NA信息详情
     *
     * 查询北向NA信息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNaRequest 请求对象
     * @return ShowNaResponse
     */
    public ShowNaResponse showNa(ShowNaRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showNa);
    }

    /**
     * 查询北向NA信息详情
     *
     * 查询北向NA信息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNaRequest 请求对象
     * @return SyncInvoker<ShowNaRequest, ShowNaResponse>
     */
    public SyncInvoker<ShowNaRequest, ShowNaResponse> showNaInvoker(ShowNaRequest request) {
        return new SyncInvoker<ShowNaRequest, ShowNaResponse>(request, IoTEdgeMeta.showNa, hcClient);
    }

    /**
     * 创建&amp;更新北向NA信息
     *
     * 创建&amp;更新北向NA信息，当更新北向NA信息时，会通知到已分配该北向NA的所有边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNaRequest 请求对象
     * @return UpdateNaResponse
     */
    public UpdateNaResponse updateNa(UpdateNaRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateNa);
    }

    /**
     * 创建&amp;更新北向NA信息
     *
     * 创建&amp;更新北向NA信息，当更新北向NA信息时，会通知到已分配该北向NA的所有边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNaRequest 请求对象
     * @return SyncInvoker<UpdateNaRequest, UpdateNaResponse>
     */
    public SyncInvoker<UpdateNaRequest, UpdateNaResponse> updateNaInvoker(UpdateNaRequest request) {
        return new SyncInvoker<UpdateNaRequest, UpdateNaResponse>(request, IoTEdgeMeta.updateNa, hcClient);
    }

}