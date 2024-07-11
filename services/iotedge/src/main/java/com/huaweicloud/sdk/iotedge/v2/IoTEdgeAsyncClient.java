package com.huaweicloud.sdk.iotedge.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iotedge.v2.model.AddAppConfigsTemplatesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddAppConfigsTemplatesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AddDeviceRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddDeviceResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AddGeneralAppConfigsTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddGeneralAppConfigsTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AddGeneralOtTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddGeneralOtTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AddOtTemplatesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddOtTemplatesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchAssociateNaToNodesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchAssociateNaToNodesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchConfirmConfigsNewRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchConfirmConfigsNewResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchImportConfigsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchImportConfigsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListAppConfigsTemplatesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListAppConfigsTemplatesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcDevicesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcDevicesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcPointsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcPointsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListEdgeAppVersionsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListEdgeAppVersionsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListEdgeAppsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListEdgeAppsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListModulesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListModulesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListOtTemplatesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListOtTemplatesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDcPointRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDcPointResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeAppRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeAppResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeNodeRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeNodeResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateExternalEntityRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateExternalEntityResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateInstallCmdRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateInstallCmdResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateModuleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateModuleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateScheduleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateScheduleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteAppConfigsTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteAppConfigsTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcPointRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcPointResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDeviceRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDeviceResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeAppRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeAppResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeNodeRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeNodeResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteExternalEntityRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteExternalEntityResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteIaConfigRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteIaConfigResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteModuleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteModuleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteNaRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteNaResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteOtTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteOtTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteScheduleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteScheduleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ExecuteDeviceControlsReleaseRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ExecuteDeviceControlsReleaseResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ExecuteDeviceControlsSetRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ExecuteDeviceControlsSetResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ImportPointsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ImportPointsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.InvokeModuleMsgRequest;
import com.huaweicloud.sdk.iotedge.v2.model.InvokeModuleMsgResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListDevicesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListDevicesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListEdgeNodesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListEdgeNodesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListExternalEntityRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListExternalEntityResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListIaConfigsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListIaConfigsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListNaAuthorizedNodesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListNaAuthorizedNodesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListNasRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListNasResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListRoutesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListRoutesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.SetDeviceControlDefaultValuesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.SetDeviceControlDefaultValuesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowAppConfigsTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowAppConfigsTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowDcDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowDcDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowDcPointRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowDcPointResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeAppRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeAppResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeNodeHostsInfoRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeNodeHostsInfoResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeNodeRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeNodeResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowIaConfigRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowIaConfigResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowModuleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowModuleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowModuleShadowRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowModuleShadowResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowNaRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowNaResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowOtTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowOtTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowPointTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowPointTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowPointsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowPointsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowProductConfigRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowProductConfigResponse;
import com.huaweicloud.sdk.iotedge.v2.model.SynchronizeDcConfigsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.SynchronizeDcConfigsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcPointRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcPointResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeApplicationVersionStateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeApplicationVersionStateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeNodeRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeNodeResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateExternalEntityRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateExternalEntityResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateIaConfigRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateIaConfigResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleShadowRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleShadowResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleStateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleStateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateNaRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateNaResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateRoutesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateRoutesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateScheduleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateScheduleResponse;

import java.util.concurrent.CompletableFuture;

public class IoTEdgeAsyncClient {

    protected HcClient hcClient;

    public IoTEdgeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTEdgeAsyncClient> newBuilder() {
        ClientBuilder<IoTEdgeAsyncClient> clientBuilder = new ClientBuilder<>(IoTEdgeAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建边缘节点
     *
     * 创建边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeNodeRequest 请求对象
     * @return CompletableFuture<CreateEdgeNodeResponse>
     */
    public CompletableFuture<CreateEdgeNodeResponse> createEdgeNodeAsync(CreateEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createEdgeNode);
    }

    /**
     * 创建边缘节点
     *
     * 创建边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeNodeRequest 请求对象
     * @return AsyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse>
     */
    public AsyncInvoker<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNodeAsyncInvoker(
        CreateEdgeNodeRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createEdgeNode, hcClient);
    }

    /**
     * 生成边缘节点安装命令
     *
     * 生成边缘节点安装命令，命令有效时间30分钟，超过后需要重新生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstallCmdRequest 请求对象
     * @return CompletableFuture<CreateInstallCmdResponse>
     */
    public CompletableFuture<CreateInstallCmdResponse> createInstallCmdAsync(CreateInstallCmdRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createInstallCmd);
    }

    /**
     * 生成边缘节点安装命令
     *
     * 生成边缘节点安装命令，命令有效时间30分钟，超过后需要重新生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstallCmdRequest 请求对象
     * @return AsyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse>
     */
    public AsyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse> createInstallCmdAsyncInvoker(
        CreateInstallCmdRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createInstallCmd, hcClient);
    }

    /**
     * 删除边缘节点
     *
     * 删除指定边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeNodeRequest 请求对象
     * @return CompletableFuture<DeleteEdgeNodeResponse>
     */
    public CompletableFuture<DeleteEdgeNodeResponse> deleteEdgeNodeAsync(DeleteEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteEdgeNode);
    }

    /**
     * 删除边缘节点
     *
     * 删除指定边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeNodeRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse>
     */
    public AsyncInvoker<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNodeAsyncInvoker(
        DeleteEdgeNodeRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteEdgeNode, hcClient);
    }

    /**
     * 查询边缘节点列表
     *
     * 查询边缘节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeNodesRequest 请求对象
     * @return CompletableFuture<ListEdgeNodesResponse>
     */
    public CompletableFuture<ListEdgeNodesResponse> listEdgeNodesAsync(ListEdgeNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listEdgeNodes);
    }

    /**
     * 查询边缘节点列表
     *
     * 查询边缘节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgeNodesRequest 请求对象
     * @return AsyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse>
     */
    public AsyncInvoker<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodesAsyncInvoker(
        ListEdgeNodesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listEdgeNodes, hcClient);
    }

    /**
     * 查询边缘节点详情
     *
     * 查询边缘节点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeNodeRequest 请求对象
     * @return CompletableFuture<ShowEdgeNodeResponse>
     */
    public CompletableFuture<ShowEdgeNodeResponse> showEdgeNodeAsync(ShowEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showEdgeNode);
    }

    /**
     * 查询边缘节点详情
     *
     * 查询边缘节点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeNodeRequest 请求对象
     * @return AsyncInvoker<ShowEdgeNodeRequest, ShowEdgeNodeResponse>
     */
    public AsyncInvoker<ShowEdgeNodeRequest, ShowEdgeNodeResponse> showEdgeNodeAsyncInvoker(
        ShowEdgeNodeRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showEdgeNode, hcClient);
    }

    /**
     * 查询边缘节点下的主机详情
     *
     * 查询边缘节点下的主机详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeNodeHostsInfoRequest 请求对象
     * @return CompletableFuture<ShowEdgeNodeHostsInfoResponse>
     */
    public CompletableFuture<ShowEdgeNodeHostsInfoResponse> showEdgeNodeHostsInfoAsync(
        ShowEdgeNodeHostsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showEdgeNodeHostsInfo);
    }

    /**
     * 查询边缘节点下的主机详情
     *
     * 查询边缘节点下的主机详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeNodeHostsInfoRequest 请求对象
     * @return AsyncInvoker<ShowEdgeNodeHostsInfoRequest, ShowEdgeNodeHostsInfoResponse>
     */
    public AsyncInvoker<ShowEdgeNodeHostsInfoRequest, ShowEdgeNodeHostsInfoResponse> showEdgeNodeHostsInfoAsyncInvoker(
        ShowEdgeNodeHostsInfoRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showEdgeNodeHostsInfo, hcClient);
    }

    /**
     * 修改边缘节点
     *
     * 修改边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeNodeRequest 请求对象
     * @return CompletableFuture<UpdateEdgeNodeResponse>
     */
    public CompletableFuture<UpdateEdgeNodeResponse> updateEdgeNodeAsync(UpdateEdgeNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateEdgeNode);
    }

    /**
     * 修改边缘节点
     *
     * 修改边缘节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeNodeRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse>
     */
    public AsyncInvoker<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> updateEdgeNodeAsyncInvoker(
        UpdateEdgeNodeRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateEdgeNode, hcClient);
    }

    /**
     * 设备控制释放
     *
     * 设备控制释放
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDeviceControlsReleaseRequest 请求对象
     * @return CompletableFuture<ExecuteDeviceControlsReleaseResponse>
     */
    public CompletableFuture<ExecuteDeviceControlsReleaseResponse> executeDeviceControlsReleaseAsync(
        ExecuteDeviceControlsReleaseRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.executeDeviceControlsRelease);
    }

    /**
     * 设备控制释放
     *
     * 设备控制释放
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDeviceControlsReleaseRequest 请求对象
     * @return AsyncInvoker<ExecuteDeviceControlsReleaseRequest, ExecuteDeviceControlsReleaseResponse>
     */
    public AsyncInvoker<ExecuteDeviceControlsReleaseRequest, ExecuteDeviceControlsReleaseResponse> executeDeviceControlsReleaseAsyncInvoker(
        ExecuteDeviceControlsReleaseRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.executeDeviceControlsRelease, hcClient);
    }

    /**
     * 设备控制设置
     *
     * 设备控制设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDeviceControlsSetRequest 请求对象
     * @return CompletableFuture<ExecuteDeviceControlsSetResponse>
     */
    public CompletableFuture<ExecuteDeviceControlsSetResponse> executeDeviceControlsSetAsync(
        ExecuteDeviceControlsSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.executeDeviceControlsSet);
    }

    /**
     * 设备控制设置
     *
     * 设备控制设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDeviceControlsSetRequest 请求对象
     * @return AsyncInvoker<ExecuteDeviceControlsSetRequest, ExecuteDeviceControlsSetResponse>
     */
    public AsyncInvoker<ExecuteDeviceControlsSetRequest, ExecuteDeviceControlsSetResponse> executeDeviceControlsSetAsyncInvoker(
        ExecuteDeviceControlsSetRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.executeDeviceControlsSet, hcClient);
    }

    /**
     * 设备控制默认值
     *
     * 设备控制默认值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDeviceControlDefaultValuesRequest 请求对象
     * @return CompletableFuture<SetDeviceControlDefaultValuesResponse>
     */
    public CompletableFuture<SetDeviceControlDefaultValuesResponse> setDeviceControlDefaultValuesAsync(
        SetDeviceControlDefaultValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.setDeviceControlDefaultValues);
    }

    /**
     * 设备控制默认值
     *
     * 设备控制默认值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDeviceControlDefaultValuesRequest 请求对象
     * @return AsyncInvoker<SetDeviceControlDefaultValuesRequest, SetDeviceControlDefaultValuesResponse>
     */
    public AsyncInvoker<SetDeviceControlDefaultValuesRequest, SetDeviceControlDefaultValuesResponse> setDeviceControlDefaultValuesAsyncInvoker(
        SetDeviceControlDefaultValuesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.setDeviceControlDefaultValues, hcClient);
    }

    /**
     * 添加设备
     *
     * 添加设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceRequest 请求对象
     * @return CompletableFuture<AddDeviceResponse>
     */
    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.addDevice);
    }

    /**
     * 添加设备
     *
     * 添加设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceRequest 请求对象
     * @return AsyncInvoker<AddDeviceRequest, AddDeviceResponse>
     */
    public AsyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceAsyncInvoker(AddDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.addDevice, hcClient);
    }

    /**
     * 删除设备
     *
     * 删除设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceRequest 请求对象
     * @return CompletableFuture<DeleteDeviceResponse>
     */
    public CompletableFuture<DeleteDeviceResponse> deleteDeviceAsync(DeleteDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteDevice);
    }

    /**
     * 删除设备
     *
     * 删除设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceAsyncInvoker(
        DeleteDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteDevice, hcClient);
    }

    /**
     * 查询设备列表
     *
     * 查询设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse>
     */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listDevices);
    }

    /**
     * 查询设备列表
     *
     * 查询设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return AsyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public AsyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesAsyncInvoker(ListDevicesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listDevices, hcClient);
    }

    /**
     * 获取协议配置
     *
     * 获取协议配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductConfigRequest 请求对象
     * @return CompletableFuture<ShowProductConfigResponse>
     */
    public CompletableFuture<ShowProductConfigResponse> showProductConfigAsync(ShowProductConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showProductConfig);
    }

    /**
     * 获取协议配置
     *
     * 获取协议配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductConfigRequest 请求对象
     * @return AsyncInvoker<ShowProductConfigRequest, ShowProductConfigResponse>
     */
    public AsyncInvoker<ShowProductConfigRequest, ShowProductConfigResponse> showProductConfigAsyncInvoker(
        ShowProductConfigRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showProductConfig, hcClient);
    }

    /**
     * 修改设备
     *
     * 修改设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateDevice);
    }

    /**
     * 修改设备
     *
     * 修改设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceAsyncInvoker(
        UpdateDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateDevice, hcClient);
    }

    /**
     * 添加应用配置模板
     *
     * 添加应用配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppConfigsTemplatesRequest 请求对象
     * @return CompletableFuture<AddAppConfigsTemplatesResponse>
     */
    public CompletableFuture<AddAppConfigsTemplatesResponse> addAppConfigsTemplatesAsync(
        AddAppConfigsTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.addAppConfigsTemplates);
    }

    /**
     * 添加应用配置模板
     *
     * 添加应用配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppConfigsTemplatesRequest 请求对象
     * @return AsyncInvoker<AddAppConfigsTemplatesRequest, AddAppConfigsTemplatesResponse>
     */
    public AsyncInvoker<AddAppConfigsTemplatesRequest, AddAppConfigsTemplatesResponse> addAppConfigsTemplatesAsyncInvoker(
        AddAppConfigsTemplatesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.addAppConfigsTemplates, hcClient);
    }

    /**
     * 导入标准应用配置模板
     *
     * 导入标准应用配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGeneralAppConfigsTemplateRequest 请求对象
     * @return CompletableFuture<AddGeneralAppConfigsTemplateResponse>
     */
    public CompletableFuture<AddGeneralAppConfigsTemplateResponse> addGeneralAppConfigsTemplateAsync(
        AddGeneralAppConfigsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.addGeneralAppConfigsTemplate);
    }

    /**
     * 导入标准应用配置模板
     *
     * 导入标准应用配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGeneralAppConfigsTemplateRequest 请求对象
     * @return AsyncInvoker<AddGeneralAppConfigsTemplateRequest, AddGeneralAppConfigsTemplateResponse>
     */
    public AsyncInvoker<AddGeneralAppConfigsTemplateRequest, AddGeneralAppConfigsTemplateResponse> addGeneralAppConfigsTemplateAsyncInvoker(
        AddGeneralAppConfigsTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.addGeneralAppConfigsTemplate, hcClient);
    }

    /**
     * 查询应用配置模板列表
     *
     * 查询应用配置模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListAppConfigsTemplatesRequest 请求对象
     * @return CompletableFuture<BatchListAppConfigsTemplatesResponse>
     */
    public CompletableFuture<BatchListAppConfigsTemplatesResponse> batchListAppConfigsTemplatesAsync(
        BatchListAppConfigsTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListAppConfigsTemplates);
    }

    /**
     * 查询应用配置模板列表
     *
     * 查询应用配置模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListAppConfigsTemplatesRequest 请求对象
     * @return AsyncInvoker<BatchListAppConfigsTemplatesRequest, BatchListAppConfigsTemplatesResponse>
     */
    public AsyncInvoker<BatchListAppConfigsTemplatesRequest, BatchListAppConfigsTemplatesResponse> batchListAppConfigsTemplatesAsyncInvoker(
        BatchListAppConfigsTemplatesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchListAppConfigsTemplates, hcClient);
    }

    /**
     * 删除应用配置模板
     *
     * 删除应用配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppConfigsTemplateRequest 请求对象
     * @return CompletableFuture<DeleteAppConfigsTemplateResponse>
     */
    public CompletableFuture<DeleteAppConfigsTemplateResponse> deleteAppConfigsTemplateAsync(
        DeleteAppConfigsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteAppConfigsTemplate);
    }

    /**
     * 删除应用配置模板
     *
     * 删除应用配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppConfigsTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteAppConfigsTemplateRequest, DeleteAppConfigsTemplateResponse>
     */
    public AsyncInvoker<DeleteAppConfigsTemplateRequest, DeleteAppConfigsTemplateResponse> deleteAppConfigsTemplateAsyncInvoker(
        DeleteAppConfigsTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteAppConfigsTemplate, hcClient);
    }

    /**
     * 查询应用配置模板详情
     *
     * 查询应用配置模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppConfigsTemplateRequest 请求对象
     * @return CompletableFuture<ShowAppConfigsTemplateResponse>
     */
    public CompletableFuture<ShowAppConfigsTemplateResponse> showAppConfigsTemplateAsync(
        ShowAppConfigsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showAppConfigsTemplate);
    }

    /**
     * 查询应用配置模板详情
     *
     * 查询应用配置模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppConfigsTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAppConfigsTemplateRequest, ShowAppConfigsTemplateResponse>
     */
    public AsyncInvoker<ShowAppConfigsTemplateRequest, ShowAppConfigsTemplateResponse> showAppConfigsTemplateAsyncInvoker(
        ShowAppConfigsTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showAppConfigsTemplate, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListEdgeAppsRequest 请求对象
     * @return CompletableFuture<BatchListEdgeAppsResponse>
     */
    public CompletableFuture<BatchListEdgeAppsResponse> batchListEdgeAppsAsync(BatchListEdgeAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListEdgeApps);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListEdgeAppsRequest 请求对象
     * @return AsyncInvoker<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse>
     */
    public AsyncInvoker<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse> batchListEdgeAppsAsyncInvoker(
        BatchListEdgeAppsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchListEdgeApps, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeAppRequest 请求对象
     * @return CompletableFuture<CreateEdgeAppResponse>
     */
    public CompletableFuture<CreateEdgeAppResponse> createEdgeAppAsync(CreateEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createEdgeApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeAppRequest 请求对象
     * @return AsyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>
     */
    public AsyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeAppAsyncInvoker(
        CreateEdgeAppRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createEdgeApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeAppRequest 请求对象
     * @return CompletableFuture<DeleteEdgeAppResponse>
     */
    public CompletableFuture<DeleteEdgeAppResponse> deleteEdgeAppAsync(DeleteEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteEdgeApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeAppRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>
     */
    public AsyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeAppAsyncInvoker(
        DeleteEdgeAppRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteEdgeApp, hcClient);
    }

    /**
     * 查询应用
     *
     * 查询应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeAppRequest 请求对象
     * @return CompletableFuture<ShowEdgeAppResponse>
     */
    public CompletableFuture<ShowEdgeAppResponse> showEdgeAppAsync(ShowEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showEdgeApp);
    }

    /**
     * 查询应用
     *
     * 查询应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeAppRequest 请求对象
     * @return AsyncInvoker<ShowEdgeAppRequest, ShowEdgeAppResponse>
     */
    public AsyncInvoker<ShowEdgeAppRequest, ShowEdgeAppResponse> showEdgeAppAsyncInvoker(ShowEdgeAppRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showEdgeApp, hcClient);
    }

    /**
     * 查询应用版本列表
     *
     * 查询应用版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListEdgeAppVersionsRequest 请求对象
     * @return CompletableFuture<BatchListEdgeAppVersionsResponse>
     */
    public CompletableFuture<BatchListEdgeAppVersionsResponse> batchListEdgeAppVersionsAsync(
        BatchListEdgeAppVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListEdgeAppVersions);
    }

    /**
     * 查询应用版本列表
     *
     * 查询应用版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListEdgeAppVersionsRequest 请求对象
     * @return AsyncInvoker<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse>
     */
    public AsyncInvoker<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> batchListEdgeAppVersionsAsyncInvoker(
        BatchListEdgeAppVersionsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchListEdgeAppVersions, hcClient);
    }

    /**
     * 创建应用版本
     *
     * 创建应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<CreateEdgeApplicationVersionResponse>
     */
    public CompletableFuture<CreateEdgeApplicationVersionResponse> createEdgeApplicationVersionAsync(
        CreateEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createEdgeApplicationVersion);
    }

    /**
     * 创建应用版本
     *
     * 创建应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersionAsyncInvoker(
        CreateEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createEdgeApplicationVersion, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<DeleteEdgeApplicationVersionResponse>
     */
    public CompletableFuture<DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersionAsync(
        DeleteEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteEdgeApplicationVersion);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersionAsyncInvoker(
        DeleteEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteEdgeApplicationVersion, hcClient);
    }

    /**
     * 查询应用版本详情
     *
     * 查询应用版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<ShowEdgeApplicationVersionResponse>
     */
    public CompletableFuture<ShowEdgeApplicationVersionResponse> showEdgeApplicationVersionAsync(
        ShowEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showEdgeApplicationVersion);
    }

    /**
     * 查询应用版本详情
     *
     * 查询应用版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersionAsyncInvoker(
        ShowEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showEdgeApplicationVersion, hcClient);
    }

    /**
     * 修改应用版本
     *
     * 修改应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<UpdateEdgeApplicationVersionResponse>
     */
    public CompletableFuture<UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersionAsync(
        UpdateEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateEdgeApplicationVersion);
    }

    /**
     * 修改应用版本
     *
     * 修改应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersionAsyncInvoker(
        UpdateEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateEdgeApplicationVersion, hcClient);
    }

    /**
     * 更新应用版本状态
     *
     * 更新应用版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return CompletableFuture<UpdateEdgeApplicationVersionStateResponse>
     */
    public CompletableFuture<UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionStateAsync(
        UpdateEdgeApplicationVersionStateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateEdgeApplicationVersionState);
    }

    /**
     * 更新应用版本状态
     *
     * 更新应用版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>
     */
    public AsyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionStateAsyncInvoker(
        UpdateEdgeApplicationVersionStateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateEdgeApplicationVersionState, hcClient);
    }

    /**
     * 查询数据源配置列表
     *
     * 查询数据源配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListDcDsRequest 请求对象
     * @return CompletableFuture<BatchListDcDsResponse>
     */
    public CompletableFuture<BatchListDcDsResponse> batchListDcDsAsync(BatchListDcDsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListDcDs);
    }

    /**
     * 查询数据源配置列表
     *
     * 查询数据源配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListDcDsRequest 请求对象
     * @return AsyncInvoker<BatchListDcDsRequest, BatchListDcDsResponse>
     */
    public AsyncInvoker<BatchListDcDsRequest, BatchListDcDsResponse> batchListDcDsAsyncInvoker(
        BatchListDcDsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchListDcDs, hcClient);
    }

    /**
     * 创建数据源配置
     *
     * 用户通过Console接口在指定边缘节点上创建数据源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDsRequest 请求对象
     * @return CompletableFuture<CreateDsResponse>
     */
    public CompletableFuture<CreateDsResponse> createDsAsync(CreateDsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createDs);
    }

    /**
     * 创建数据源配置
     *
     * 用户通过Console接口在指定边缘节点上创建数据源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDsRequest 请求对象
     * @return AsyncInvoker<CreateDsRequest, CreateDsResponse>
     */
    public AsyncInvoker<CreateDsRequest, CreateDsResponse> createDsAsyncInvoker(CreateDsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createDs, hcClient);
    }

    /**
     * 删除数据源配置
     *
     * 删除数据源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDcDsRequest 请求对象
     * @return CompletableFuture<DeleteDcDsResponse>
     */
    public CompletableFuture<DeleteDcDsResponse> deleteDcDsAsync(DeleteDcDsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteDcDs);
    }

    /**
     * 删除数据源配置
     *
     * 删除数据源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDcDsRequest 请求对象
     * @return AsyncInvoker<DeleteDcDsRequest, DeleteDcDsResponse>
     */
    public AsyncInvoker<DeleteDcDsRequest, DeleteDcDsResponse> deleteDcDsAsyncInvoker(DeleteDcDsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteDcDs, hcClient);
    }

    /**
     * 查询数据源配置
     *
     * 查询数据源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDcDsRequest 请求对象
     * @return CompletableFuture<ShowDcDsResponse>
     */
    public CompletableFuture<ShowDcDsResponse> showDcDsAsync(ShowDcDsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showDcDs);
    }

    /**
     * 查询数据源配置
     *
     * 查询数据源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDcDsRequest 请求对象
     * @return AsyncInvoker<ShowDcDsRequest, ShowDcDsResponse>
     */
    public AsyncInvoker<ShowDcDsRequest, ShowDcDsResponse> showDcDsAsyncInvoker(ShowDcDsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showDcDs, hcClient);
    }

    /**
     * 下发数采配置
     *
     * 下发数采配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeDcConfigsRequest 请求对象
     * @return CompletableFuture<SynchronizeDcConfigsResponse>
     */
    public CompletableFuture<SynchronizeDcConfigsResponse> synchronizeDcConfigsAsync(
        SynchronizeDcConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.synchronizeDcConfigs);
    }

    /**
     * 下发数采配置
     *
     * 下发数采配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeDcConfigsRequest 请求对象
     * @return AsyncInvoker<SynchronizeDcConfigsRequest, SynchronizeDcConfigsResponse>
     */
    public AsyncInvoker<SynchronizeDcConfigsRequest, SynchronizeDcConfigsResponse> synchronizeDcConfigsAsyncInvoker(
        SynchronizeDcConfigsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.synchronizeDcConfigs, hcClient);
    }

    /**
     * 修改数据源配置
     *
     * 修改数据源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDcDsRequest 请求对象
     * @return CompletableFuture<UpdateDcDsResponse>
     */
    public CompletableFuture<UpdateDcDsResponse> updateDcDsAsync(UpdateDcDsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateDcDs);
    }

    /**
     * 修改数据源配置
     *
     * 修改数据源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDcDsRequest 请求对象
     * @return AsyncInvoker<UpdateDcDsRequest, UpdateDcDsResponse>
     */
    public AsyncInvoker<UpdateDcDsRequest, UpdateDcDsResponse> updateDcDsAsyncInvoker(UpdateDcDsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateDcDs, hcClient);
    }

    /**
     * 查数采连接子设备列表
     *
     * 查询数采连接下子设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListDcDevicesRequest 请求对象
     * @return CompletableFuture<BatchListDcDevicesResponse>
     */
    public CompletableFuture<BatchListDcDevicesResponse> batchListDcDevicesAsync(BatchListDcDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListDcDevices);
    }

    /**
     * 查数采连接子设备列表
     *
     * 查询数采连接下子设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListDcDevicesRequest 请求对象
     * @return AsyncInvoker<BatchListDcDevicesRequest, BatchListDcDevicesResponse>
     */
    public AsyncInvoker<BatchListDcDevicesRequest, BatchListDcDevicesResponse> batchListDcDevicesAsyncInvoker(
        BatchListDcDevicesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchListDcDevices, hcClient);
    }

    /**
     * 查询点位表配置列表
     *
     * 查询点位表配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListDcPointsRequest 请求对象
     * @return CompletableFuture<BatchListDcPointsResponse>
     */
    public CompletableFuture<BatchListDcPointsResponse> batchListDcPointsAsync(BatchListDcPointsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListDcPoints);
    }

    /**
     * 查询点位表配置列表
     *
     * 查询点位表配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListDcPointsRequest 请求对象
     * @return AsyncInvoker<BatchListDcPointsRequest, BatchListDcPointsResponse>
     */
    public AsyncInvoker<BatchListDcPointsRequest, BatchListDcPointsResponse> batchListDcPointsAsyncInvoker(
        BatchListDcPointsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchListDcPoints, hcClient);
    }

    /**
     * 创建点位表配置
     *
     * 用户通过Console接口在指定边缘节点上点位表配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDcPointRequest 请求对象
     * @return CompletableFuture<CreateDcPointResponse>
     */
    public CompletableFuture<CreateDcPointResponse> createDcPointAsync(CreateDcPointRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createDcPoint);
    }

    /**
     * 创建点位表配置
     *
     * 用户通过Console接口在指定边缘节点上点位表配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDcPointRequest 请求对象
     * @return AsyncInvoker<CreateDcPointRequest, CreateDcPointResponse>
     */
    public AsyncInvoker<CreateDcPointRequest, CreateDcPointResponse> createDcPointAsyncInvoker(
        CreateDcPointRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createDcPoint, hcClient);
    }

    /**
     * 删除点位表配置
     *
     * 删除点位表配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDcPointRequest 请求对象
     * @return CompletableFuture<DeleteDcPointResponse>
     */
    public CompletableFuture<DeleteDcPointResponse> deleteDcPointAsync(DeleteDcPointRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteDcPoint);
    }

    /**
     * 删除点位表配置
     *
     * 删除点位表配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDcPointRequest 请求对象
     * @return AsyncInvoker<DeleteDcPointRequest, DeleteDcPointResponse>
     */
    public AsyncInvoker<DeleteDcPointRequest, DeleteDcPointResponse> deleteDcPointAsyncInvoker(
        DeleteDcPointRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteDcPoint, hcClient);
    }

    /**
     * 查询点位表配置详情
     *
     * 查询点位表配置详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDcPointRequest 请求对象
     * @return CompletableFuture<ShowDcPointResponse>
     */
    public CompletableFuture<ShowDcPointResponse> showDcPointAsync(ShowDcPointRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showDcPoint);
    }

    /**
     * 查询点位表配置详情
     *
     * 查询点位表配置详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDcPointRequest 请求对象
     * @return AsyncInvoker<ShowDcPointRequest, ShowDcPointResponse>
     */
    public AsyncInvoker<ShowDcPointRequest, ShowDcPointResponse> showDcPointAsyncInvoker(ShowDcPointRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showDcPoint, hcClient);
    }

    /**
     * 修改点位表配置
     *
     * 修改点位表配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDcPointRequest 请求对象
     * @return CompletableFuture<UpdateDcPointResponse>
     */
    public CompletableFuture<UpdateDcPointResponse> updateDcPointAsync(UpdateDcPointRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateDcPoint);
    }

    /**
     * 修改点位表配置
     *
     * 修改点位表配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDcPointRequest 请求对象
     * @return AsyncInvoker<UpdateDcPointRequest, UpdateDcPointResponse>
     */
    public AsyncInvoker<UpdateDcPointRequest, UpdateDcPointResponse> updateDcPointAsyncInvoker(
        UpdateDcPointRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateDcPoint, hcClient);
    }

    /**
     * 在指定节点上创建外部实体
     *
     * 用户通过在指定边缘节点上设置外部实体的接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalEntityRequest 请求对象
     * @return CompletableFuture<CreateExternalEntityResponse>
     */
    public CompletableFuture<CreateExternalEntityResponse> createExternalEntityAsync(
        CreateExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createExternalEntity);
    }

    /**
     * 在指定节点上创建外部实体
     *
     * 用户通过在指定边缘节点上设置外部实体的接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalEntityRequest 请求对象
     * @return AsyncInvoker<CreateExternalEntityRequest, CreateExternalEntityResponse>
     */
    public AsyncInvoker<CreateExternalEntityRequest, CreateExternalEntityResponse> createExternalEntityAsyncInvoker(
        CreateExternalEntityRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createExternalEntity, hcClient);
    }

    /**
     * 删除指定节点下外部实体
     *
     * 删除节点下外部实体
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalEntityRequest 请求对象
     * @return CompletableFuture<DeleteExternalEntityResponse>
     */
    public CompletableFuture<DeleteExternalEntityResponse> deleteExternalEntityAsync(
        DeleteExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteExternalEntity);
    }

    /**
     * 删除指定节点下外部实体
     *
     * 删除节点下外部实体
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExternalEntityRequest 请求对象
     * @return AsyncInvoker<DeleteExternalEntityRequest, DeleteExternalEntityResponse>
     */
    public AsyncInvoker<DeleteExternalEntityRequest, DeleteExternalEntityResponse> deleteExternalEntityAsyncInvoker(
        DeleteExternalEntityRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteExternalEntity, hcClient);
    }

    /**
     * 查询指定边缘节点下的外部实体
     *
     * 用户在指定边缘节点上查询外部实体列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalEntityRequest 请求对象
     * @return CompletableFuture<ListExternalEntityResponse>
     */
    public CompletableFuture<ListExternalEntityResponse> listExternalEntityAsync(ListExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listExternalEntity);
    }

    /**
     * 查询指定边缘节点下的外部实体
     *
     * 用户在指定边缘节点上查询外部实体列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalEntityRequest 请求对象
     * @return AsyncInvoker<ListExternalEntityRequest, ListExternalEntityResponse>
     */
    public AsyncInvoker<ListExternalEntityRequest, ListExternalEntityResponse> listExternalEntityAsyncInvoker(
        ListExternalEntityRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listExternalEntity, hcClient);
    }

    /**
     * 修改节点下指定的外部实体信息
     *
     * 用户通过在指定边缘节点上修改指定外部实体的接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExternalEntityRequest 请求对象
     * @return CompletableFuture<UpdateExternalEntityResponse>
     */
    public CompletableFuture<UpdateExternalEntityResponse> updateExternalEntityAsync(
        UpdateExternalEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateExternalEntity);
    }

    /**
     * 修改节点下指定的外部实体信息
     *
     * 用户通过在指定边缘节点上修改指定外部实体的接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExternalEntityRequest 请求对象
     * @return AsyncInvoker<UpdateExternalEntityRequest, UpdateExternalEntityResponse>
     */
    public AsyncInvoker<UpdateExternalEntityRequest, UpdateExternalEntityResponse> updateExternalEntityAsyncInvoker(
        UpdateExternalEntityRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateExternalEntity, hcClient);
    }

    /**
     * 查询边缘模块列表
     *
     * 用户通过Console接口查询指定边缘节点上边缘模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListModulesRequest 请求对象
     * @return CompletableFuture<BatchListModulesResponse>
     */
    public CompletableFuture<BatchListModulesResponse> batchListModulesAsync(BatchListModulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListModules);
    }

    /**
     * 查询边缘模块列表
     *
     * 用户通过Console接口查询指定边缘节点上边缘模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListModulesRequest 请求对象
     * @return AsyncInvoker<BatchListModulesRequest, BatchListModulesResponse>
     */
    public AsyncInvoker<BatchListModulesRequest, BatchListModulesResponse> batchListModulesAsyncInvoker(
        BatchListModulesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchListModules, hcClient);
    }

    /**
     * 创建边缘模块
     *
     * 用户通过Console接口在指定边缘节点上创建边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModuleRequest 请求对象
     * @return CompletableFuture<CreateModuleResponse>
     */
    public CompletableFuture<CreateModuleResponse> createModuleAsync(CreateModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createModule);
    }

    /**
     * 创建边缘模块
     *
     * 用户通过Console接口在指定边缘节点上创建边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModuleRequest 请求对象
     * @return AsyncInvoker<CreateModuleRequest, CreateModuleResponse>
     */
    public AsyncInvoker<CreateModuleRequest, CreateModuleResponse> createModuleAsyncInvoker(
        CreateModuleRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createModule, hcClient);
    }

    /**
     * 删除边缘模块
     *
     * 用户通过过Console接口在指定边缘节点上删除边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModuleRequest 请求对象
     * @return CompletableFuture<DeleteModuleResponse>
     */
    public CompletableFuture<DeleteModuleResponse> deleteModuleAsync(DeleteModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteModule);
    }

    /**
     * 删除边缘模块
     *
     * 用户通过过Console接口在指定边缘节点上删除边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModuleRequest 请求对象
     * @return AsyncInvoker<DeleteModuleRequest, DeleteModuleResponse>
     */
    public AsyncInvoker<DeleteModuleRequest, DeleteModuleResponse> deleteModuleAsyncInvoker(
        DeleteModuleRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteModule, hcClient);
    }

    /**
     * 代理边缘模块消息
     *
     * iotedge通过该接口透明代理用户到模块的请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeModuleMsgRequest 请求对象
     * @return CompletableFuture<InvokeModuleMsgResponse>
     */
    public CompletableFuture<InvokeModuleMsgResponse> invokeModuleMsgAsync(InvokeModuleMsgRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.invokeModuleMsg);
    }

    /**
     * 代理边缘模块消息
     *
     * iotedge通过该接口透明代理用户到模块的请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeModuleMsgRequest 请求对象
     * @return AsyncInvoker<InvokeModuleMsgRequest, InvokeModuleMsgResponse>
     */
    public AsyncInvoker<InvokeModuleMsgRequest, InvokeModuleMsgResponse> invokeModuleMsgAsyncInvoker(
        InvokeModuleMsgRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.invokeModuleMsg, hcClient);
    }

    /**
     * 查询边缘模块
     *
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModuleRequest 请求对象
     * @return CompletableFuture<ShowModuleResponse>
     */
    public CompletableFuture<ShowModuleResponse> showModuleAsync(ShowModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showModule);
    }

    /**
     * 查询边缘模块
     *
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModuleRequest 请求对象
     * @return AsyncInvoker<ShowModuleRequest, ShowModuleResponse>
     */
    public AsyncInvoker<ShowModuleRequest, ShowModuleResponse> showModuleAsyncInvoker(ShowModuleRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showModule, hcClient);
    }

    /**
     * 修改边缘模块
     *
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleRequest 请求对象
     * @return CompletableFuture<UpdateModuleResponse>
     */
    public CompletableFuture<UpdateModuleResponse> updateModuleAsync(UpdateModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateModule);
    }

    /**
     * 修改边缘模块
     *
     * 用户通过Console接口查询指定边缘节点上指定边缘模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleRequest 请求对象
     * @return AsyncInvoker<UpdateModuleRequest, UpdateModuleResponse>
     */
    public AsyncInvoker<UpdateModuleRequest, UpdateModuleResponse> updateModuleAsyncInvoker(
        UpdateModuleRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateModule, hcClient);
    }

    /**
     * 修改边缘模块状态
     *
     * 用户通过Console接口启停数采连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleStateRequest 请求对象
     * @return CompletableFuture<UpdateModuleStateResponse>
     */
    public CompletableFuture<UpdateModuleStateResponse> updateModuleStateAsync(UpdateModuleStateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateModuleState);
    }

    /**
     * 修改边缘模块状态
     *
     * 用户通过Console接口启停数采连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleStateRequest 请求对象
     * @return AsyncInvoker<UpdateModuleStateRequest, UpdateModuleStateResponse>
     */
    public AsyncInvoker<UpdateModuleStateRequest, UpdateModuleStateResponse> updateModuleStateAsyncInvoker(
        UpdateModuleStateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateModuleState, hcClient);
    }

    /**
     * 获取模块影子
     *
     * 获取模块影子信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModuleShadowRequest 请求对象
     * @return CompletableFuture<ShowModuleShadowResponse>
     */
    public CompletableFuture<ShowModuleShadowResponse> showModuleShadowAsync(ShowModuleShadowRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showModuleShadow);
    }

    /**
     * 获取模块影子
     *
     * 获取模块影子信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModuleShadowRequest 请求对象
     * @return AsyncInvoker<ShowModuleShadowRequest, ShowModuleShadowResponse>
     */
    public AsyncInvoker<ShowModuleShadowRequest, ShowModuleShadowResponse> showModuleShadowAsyncInvoker(
        ShowModuleShadowRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showModuleShadow, hcClient);
    }

    /**
     * 更新模块影子
     *
     * 更新模块影子信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleShadowRequest 请求对象
     * @return CompletableFuture<UpdateModuleShadowResponse>
     */
    public CompletableFuture<UpdateModuleShadowResponse> updateModuleShadowAsync(UpdateModuleShadowRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateModuleShadow);
    }

    /**
     * 更新模块影子
     *
     * 更新模块影子信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleShadowRequest 请求对象
     * @return AsyncInvoker<UpdateModuleShadowRequest, UpdateModuleShadowResponse>
     */
    public AsyncInvoker<UpdateModuleShadowRequest, UpdateModuleShadowResponse> updateModuleShadowAsyncInvoker(
        UpdateModuleShadowRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateModuleShadow, hcClient);
    }

    /**
     * 查询边缘路由列表
     *
     * 用户在指定边缘节点上查询边缘路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRoutesRequest 请求对象
     * @return CompletableFuture<ListRoutesResponse>
     */
    public CompletableFuture<ListRoutesResponse> listRoutesAsync(ListRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listRoutes);
    }

    /**
     * 查询边缘路由列表
     *
     * 用户在指定边缘节点上查询边缘路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRoutesRequest 请求对象
     * @return AsyncInvoker<ListRoutesRequest, ListRoutesResponse>
     */
    public AsyncInvoker<ListRoutesRequest, ListRoutesResponse> listRoutesAsyncInvoker(ListRoutesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listRoutes, hcClient);
    }

    /**
     * 设置边缘路由
     *
     * 用户通过在指定边缘节点上设置边缘路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoutesRequest 请求对象
     * @return CompletableFuture<UpdateRoutesResponse>
     */
    public CompletableFuture<UpdateRoutesResponse> updateRoutesAsync(UpdateRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateRoutes);
    }

    /**
     * 设置边缘路由
     *
     * 用户通过在指定边缘节点上设置边缘路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoutesRequest 请求对象
     * @return AsyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>
     */
    public AsyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutesAsyncInvoker(
        UpdateRoutesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateRoutes, hcClient);
    }

    /**
     * 导入标准数采模板
     *
     * 导入标准数采模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGeneralOtTemplateRequest 请求对象
     * @return CompletableFuture<AddGeneralOtTemplateResponse>
     */
    public CompletableFuture<AddGeneralOtTemplateResponse> addGeneralOtTemplateAsync(
        AddGeneralOtTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.addGeneralOtTemplate);
    }

    /**
     * 导入标准数采模板
     *
     * 导入标准数采模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGeneralOtTemplateRequest 请求对象
     * @return AsyncInvoker<AddGeneralOtTemplateRequest, AddGeneralOtTemplateResponse>
     */
    public AsyncInvoker<AddGeneralOtTemplateRequest, AddGeneralOtTemplateResponse> addGeneralOtTemplateAsyncInvoker(
        AddGeneralOtTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.addGeneralOtTemplate, hcClient);
    }

    /**
     * 添加数采模板
     *
     * 添加数采模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOtTemplatesRequest 请求对象
     * @return CompletableFuture<AddOtTemplatesResponse>
     */
    public CompletableFuture<AddOtTemplatesResponse> addOtTemplatesAsync(AddOtTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.addOtTemplates);
    }

    /**
     * 添加数采模板
     *
     * 添加数采模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOtTemplatesRequest 请求对象
     * @return AsyncInvoker<AddOtTemplatesRequest, AddOtTemplatesResponse>
     */
    public AsyncInvoker<AddOtTemplatesRequest, AddOtTemplatesResponse> addOtTemplatesAsyncInvoker(
        AddOtTemplatesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.addOtTemplates, hcClient);
    }

    /**
     * 查询数采模板列表
     *
     * 查询数采模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListOtTemplatesRequest 请求对象
     * @return CompletableFuture<BatchListOtTemplatesResponse>
     */
    public CompletableFuture<BatchListOtTemplatesResponse> batchListOtTemplatesAsync(
        BatchListOtTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchListOtTemplates);
    }

    /**
     * 查询数采模板列表
     *
     * 查询数采模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListOtTemplatesRequest 请求对象
     * @return AsyncInvoker<BatchListOtTemplatesRequest, BatchListOtTemplatesResponse>
     */
    public AsyncInvoker<BatchListOtTemplatesRequest, BatchListOtTemplatesResponse> batchListOtTemplatesAsyncInvoker(
        BatchListOtTemplatesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchListOtTemplates, hcClient);
    }

    /**
     * 删除数采模板
     *
     * 删除数采模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOtTemplateRequest 请求对象
     * @return CompletableFuture<DeleteOtTemplateResponse>
     */
    public CompletableFuture<DeleteOtTemplateResponse> deleteOtTemplateAsync(DeleteOtTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteOtTemplate);
    }

    /**
     * 删除数采模板
     *
     * 删除数采模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOtTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteOtTemplateRequest, DeleteOtTemplateResponse>
     */
    public AsyncInvoker<DeleteOtTemplateRequest, DeleteOtTemplateResponse> deleteOtTemplateAsyncInvoker(
        DeleteOtTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteOtTemplate, hcClient);
    }

    /**
     * 查询数采模板详情
     *
     * 查询数采模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOtTemplateRequest 请求对象
     * @return CompletableFuture<ShowOtTemplateResponse>
     */
    public CompletableFuture<ShowOtTemplateResponse> showOtTemplateAsync(ShowOtTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showOtTemplate);
    }

    /**
     * 查询数采模板详情
     *
     * 查询数采模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOtTemplateRequest 请求对象
     * @return AsyncInvoker<ShowOtTemplateRequest, ShowOtTemplateResponse>
     */
    public AsyncInvoker<ShowOtTemplateRequest, ShowOtTemplateResponse> showOtTemplateAsyncInvoker(
        ShowOtTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showOtTemplate, hcClient);
    }

    /**
     * 批量导入点位表
     *
     * 用户通过Console接口在指定边缘节点上点位表配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPointsRequest 请求对象
     * @return CompletableFuture<ImportPointsResponse>
     */
    public CompletableFuture<ImportPointsResponse> importPointsAsync(ImportPointsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.importPoints);
    }

    /**
     * 批量导入点位表
     *
     * 用户通过Console接口在指定边缘节点上点位表配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPointsRequest 请求对象
     * @return AsyncInvoker<ImportPointsRequest, ImportPointsResponse>
     */
    public AsyncInvoker<ImportPointsRequest, ImportPointsResponse> importPointsAsyncInvoker(
        ImportPointsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.importPoints, hcClient);
    }

    /**
     * 查询点位表模板文件
     *
     * 查询点位表模板文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPointTemplateRequest 请求对象
     * @return CompletableFuture<ShowPointTemplateResponse>
     */
    public CompletableFuture<ShowPointTemplateResponse> showPointTemplateAsync(ShowPointTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showPointTemplate);
    }

    /**
     * 查询点位表模板文件
     *
     * 查询点位表模板文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPointTemplateRequest 请求对象
     * @return AsyncInvoker<ShowPointTemplateRequest, ShowPointTemplateResponse>
     */
    public AsyncInvoker<ShowPointTemplateRequest, ShowPointTemplateResponse> showPointTemplateAsyncInvoker(
        ShowPointTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showPointTemplate, hcClient);
    }

    /**
     * 查询点位表模板文件
     *
     * 查询点位表模板文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPointsRequest 请求对象
     * @return CompletableFuture<ShowPointsResponse>
     */
    public CompletableFuture<ShowPointsResponse> showPointsAsync(ShowPointsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showPoints);
    }

    /**
     * 查询点位表模板文件
     *
     * 查询点位表模板文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPointsRequest 请求对象
     * @return AsyncInvoker<ShowPointsRequest, ShowPointsResponse>
     */
    public AsyncInvoker<ShowPointsRequest, ShowPointsResponse> showPointsAsyncInvoker(ShowPointsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showPoints, hcClient);
    }

    /**
     * 创建调度计划
     *
     * 用户通过北向接口在指定边缘节点上创建调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleRequest 请求对象
     * @return CompletableFuture<CreateScheduleResponse>
     */
    public CompletableFuture<CreateScheduleResponse> createScheduleAsync(CreateScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createSchedule);
    }

    /**
     * 创建调度计划
     *
     * 用户通过北向接口在指定边缘节点上创建调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleRequest 请求对象
     * @return AsyncInvoker<CreateScheduleRequest, CreateScheduleResponse>
     */
    public AsyncInvoker<CreateScheduleRequest, CreateScheduleResponse> createScheduleAsyncInvoker(
        CreateScheduleRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createSchedule, hcClient);
    }

    /**
     * 删除调度计划
     *
     * 用户通过北向接口删除边缘节点上调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleRequest 请求对象
     * @return CompletableFuture<DeleteScheduleResponse>
     */
    public CompletableFuture<DeleteScheduleResponse> deleteScheduleAsync(DeleteScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteSchedule);
    }

    /**
     * 删除调度计划
     *
     * 用户通过北向接口删除边缘节点上调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleRequest 请求对象
     * @return AsyncInvoker<DeleteScheduleRequest, DeleteScheduleResponse>
     */
    public AsyncInvoker<DeleteScheduleRequest, DeleteScheduleResponse> deleteScheduleAsyncInvoker(
        DeleteScheduleRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteSchedule, hcClient);
    }

    /**
     * 更新调度计划，机机接口，全量更新字段
     *
     * 用户通过北向接口修改边缘节点上调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleRequest 请求对象
     * @return CompletableFuture<UpdateScheduleResponse>
     */
    public CompletableFuture<UpdateScheduleResponse> updateScheduleAsync(UpdateScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateSchedule);
    }

    /**
     * 更新调度计划，机机接口，全量更新字段
     *
     * 用户通过北向接口修改边缘节点上调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleRequest 请求对象
     * @return AsyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse>
     */
    public AsyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse> updateScheduleAsyncInvoker(
        UpdateScheduleRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateSchedule, hcClient);
    }

    /**
     * 批量确认南向3rdIA配置项
     *
     * 南向3rdIA对下发的配置项进行批量确认
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchConfirmConfigsNewRequest 请求对象
     * @return CompletableFuture<BatchConfirmConfigsNewResponse>
     */
    public CompletableFuture<BatchConfirmConfigsNewResponse> batchConfirmConfigsNewAsync(
        BatchConfirmConfigsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchConfirmConfigsNew);
    }

    /**
     * 批量确认南向3rdIA配置项
     *
     * 南向3rdIA对下发的配置项进行批量确认
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchConfirmConfigsNewRequest 请求对象
     * @return AsyncInvoker<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse>
     */
    public AsyncInvoker<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> batchConfirmConfigsNewAsyncInvoker(
        BatchConfirmConfigsNewRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchConfirmConfigsNew, hcClient);
    }

    /**
     * 批量导入南向3rdIA配置项
     *
     * 批量导入南向3rdIA配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportConfigsRequest 请求对象
     * @return CompletableFuture<BatchImportConfigsResponse>
     */
    public CompletableFuture<BatchImportConfigsResponse> batchImportConfigsAsync(BatchImportConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchImportConfigs);
    }

    /**
     * 批量导入南向3rdIA配置项
     *
     * 批量导入南向3rdIA配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportConfigsRequest 请求对象
     * @return AsyncInvoker<BatchImportConfigsRequest, BatchImportConfigsResponse>
     */
    public AsyncInvoker<BatchImportConfigsRequest, BatchImportConfigsResponse> batchImportConfigsAsyncInvoker(
        BatchImportConfigsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchImportConfigs, hcClient);
    }

    /**
     * 删除南向3rdIA配置项
     *
     * 删除南向3rdIA配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIaConfigRequest 请求对象
     * @return CompletableFuture<DeleteIaConfigResponse>
     */
    public CompletableFuture<DeleteIaConfigResponse> deleteIaConfigAsync(DeleteIaConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteIaConfig);
    }

    /**
     * 删除南向3rdIA配置项
     *
     * 删除南向3rdIA配置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIaConfigRequest 请求对象
     * @return AsyncInvoker<DeleteIaConfigRequest, DeleteIaConfigResponse>
     */
    public AsyncInvoker<DeleteIaConfigRequest, DeleteIaConfigResponse> deleteIaConfigAsyncInvoker(
        DeleteIaConfigRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteIaConfig, hcClient);
    }

    /**
     * 查询南向3rdIA配置项列表
     *
     * 查询南向3rdIA配置项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIaConfigsRequest 请求对象
     * @return CompletableFuture<ListIaConfigsResponse>
     */
    public CompletableFuture<ListIaConfigsResponse> listIaConfigsAsync(ListIaConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listIaConfigs);
    }

    /**
     * 查询南向3rdIA配置项列表
     *
     * 查询南向3rdIA配置项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIaConfigsRequest 请求对象
     * @return AsyncInvoker<ListIaConfigsRequest, ListIaConfigsResponse>
     */
    public AsyncInvoker<ListIaConfigsRequest, ListIaConfigsResponse> listIaConfigsAsyncInvoker(
        ListIaConfigsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listIaConfigs, hcClient);
    }

    /**
     * 查询南向3rdIA配置项详情
     *
     * 查询南向3rdIA配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIaConfigRequest 请求对象
     * @return CompletableFuture<ShowIaConfigResponse>
     */
    public CompletableFuture<ShowIaConfigResponse> showIaConfigAsync(ShowIaConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showIaConfig);
    }

    /**
     * 查询南向3rdIA配置项详情
     *
     * 查询南向3rdIA配置项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIaConfigRequest 请求对象
     * @return AsyncInvoker<ShowIaConfigRequest, ShowIaConfigResponse>
     */
    public AsyncInvoker<ShowIaConfigRequest, ShowIaConfigResponse> showIaConfigAsyncInvoker(
        ShowIaConfigRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showIaConfig, hcClient);
    }

    /**
     * 创建&amp;更新南向3rdIA配置项信息
     *
     * 创建&amp;更新南向3rdIA配置项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIaConfigRequest 请求对象
     * @return CompletableFuture<UpdateIaConfigResponse>
     */
    public CompletableFuture<UpdateIaConfigResponse> updateIaConfigAsync(UpdateIaConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateIaConfig);
    }

    /**
     * 创建&amp;更新南向3rdIA配置项信息
     *
     * 创建&amp;更新南向3rdIA配置项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIaConfigRequest 请求对象
     * @return AsyncInvoker<UpdateIaConfigRequest, UpdateIaConfigResponse>
     */
    public AsyncInvoker<UpdateIaConfigRequest, UpdateIaConfigResponse> updateIaConfigAsyncInvoker(
        UpdateIaConfigRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateIaConfig, hcClient);
    }

    /**
     * 授权北向NA信息到边缘节点
     *
     * 批量授权北向NA信息到边缘节点。
     * 已授权的边缘节点上的南向IA应用，可以通过部署在边缘节点上的api网关访问北向NA提供的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateNaToNodesRequest 请求对象
     * @return CompletableFuture<BatchAssociateNaToNodesResponse>
     */
    public CompletableFuture<BatchAssociateNaToNodesResponse> batchAssociateNaToNodesAsync(
        BatchAssociateNaToNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.batchAssociateNaToNodes);
    }

    /**
     * 授权北向NA信息到边缘节点
     *
     * 批量授权北向NA信息到边缘节点。
     * 已授权的边缘节点上的南向IA应用，可以通过部署在边缘节点上的api网关访问北向NA提供的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateNaToNodesRequest 请求对象
     * @return AsyncInvoker<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse>
     */
    public AsyncInvoker<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> batchAssociateNaToNodesAsyncInvoker(
        BatchAssociateNaToNodesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.batchAssociateNaToNodes, hcClient);
    }

    /**
     * 删除北向NA信息
     *
     * 删除北向NA信息，如果有边缘节点已分配该NA信息，会通知到该边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNaRequest 请求对象
     * @return CompletableFuture<DeleteNaResponse>
     */
    public CompletableFuture<DeleteNaResponse> deleteNaAsync(DeleteNaRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteNa);
    }

    /**
     * 删除北向NA信息
     *
     * 删除北向NA信息，如果有边缘节点已分配该NA信息，会通知到该边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNaRequest 请求对象
     * @return AsyncInvoker<DeleteNaRequest, DeleteNaResponse>
     */
    public AsyncInvoker<DeleteNaRequest, DeleteNaResponse> deleteNaAsyncInvoker(DeleteNaRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteNa, hcClient);
    }

    /**
     * 查询该北向NA信息的已分配节点
     *
     * 查询该北向NA信息的已分配节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNaAuthorizedNodesRequest 请求对象
     * @return CompletableFuture<ListNaAuthorizedNodesResponse>
     */
    public CompletableFuture<ListNaAuthorizedNodesResponse> listNaAuthorizedNodesAsync(
        ListNaAuthorizedNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listNaAuthorizedNodes);
    }

    /**
     * 查询该北向NA信息的已分配节点
     *
     * 查询该北向NA信息的已分配节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNaAuthorizedNodesRequest 请求对象
     * @return AsyncInvoker<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse>
     */
    public AsyncInvoker<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> listNaAuthorizedNodesAsyncInvoker(
        ListNaAuthorizedNodesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listNaAuthorizedNodes, hcClient);
    }

    /**
     * 查询北向NA信息列表
     *
     * 查询北向NA信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNasRequest 请求对象
     * @return CompletableFuture<ListNasResponse>
     */
    public CompletableFuture<ListNasResponse> listNasAsync(ListNasRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listNas);
    }

    /**
     * 查询北向NA信息列表
     *
     * 查询北向NA信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNasRequest 请求对象
     * @return AsyncInvoker<ListNasRequest, ListNasResponse>
     */
    public AsyncInvoker<ListNasRequest, ListNasResponse> listNasAsyncInvoker(ListNasRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listNas, hcClient);
    }

    /**
     * 查询北向NA信息详情
     *
     * 查询北向NA信息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNaRequest 请求对象
     * @return CompletableFuture<ShowNaResponse>
     */
    public CompletableFuture<ShowNaResponse> showNaAsync(ShowNaRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showNa);
    }

    /**
     * 查询北向NA信息详情
     *
     * 查询北向NA信息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNaRequest 请求对象
     * @return AsyncInvoker<ShowNaRequest, ShowNaResponse>
     */
    public AsyncInvoker<ShowNaRequest, ShowNaResponse> showNaAsyncInvoker(ShowNaRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showNa, hcClient);
    }

    /**
     * 创建&amp;更新北向NA信息
     *
     * 创建&amp;更新北向NA信息，当更新北向NA信息时，会通知到已分配该北向NA的所有边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNaRequest 请求对象
     * @return CompletableFuture<UpdateNaResponse>
     */
    public CompletableFuture<UpdateNaResponse> updateNaAsync(UpdateNaRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateNa);
    }

    /**
     * 创建&amp;更新北向NA信息
     *
     * 创建&amp;更新北向NA信息，当更新北向NA信息时，会通知到已分配该北向NA的所有边缘节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNaRequest 请求对象
     * @return AsyncInvoker<UpdateNaRequest, UpdateNaResponse>
     */
    public AsyncInvoker<UpdateNaRequest, UpdateNaResponse> updateNaAsyncInvoker(UpdateNaRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateNa, hcClient);
    }

}
