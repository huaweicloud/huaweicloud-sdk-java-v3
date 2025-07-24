package com.huaweicloud.sdk.clouddc.v1;

import com.huaweicloud.sdk.clouddc.v1.model.BatchCreateIrackTagsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.BatchCreateIrackTagsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteIrackTagsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteIrackTagsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeInstancePasswordRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeInstancePasswordResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeServerPowerStateRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeServerPowerStateResponse;
import com.huaweicloud.sdk.clouddc.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.clouddc.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.clouddc.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.clouddc.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.clouddc.v1.model.DeleteInstancesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.DeleteInstancesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.DownloadServerLogsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.DownloadServerLogsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ExportServerLogsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ExportServerLogsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListAlarmsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListAlarmsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListEventsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListEventsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListIDcsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListIDcsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListIRackRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListIRackResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListServersRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListServersResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ModifyInstanceIpRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ModifyInstanceIpResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ReinstallOsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ReinstallOsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.RunInstancesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.RunInstancesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowAlarmSummaryRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowAlarmSummaryResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowAlarmTrendRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowAlarmTrendResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowEventRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowEventResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowLogsExportStatusRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowLogsExportStatusResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowRemoteConsoleRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowRemoteConsoleResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerFirmwareAttributesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerFirmwareAttributesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerHardwareAttributesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerHardwareAttributesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerStatusRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerStatusResponse;
import com.huaweicloud.sdk.clouddc.v1.model.UpdateIDcsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.UpdateIDcsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.UpdateIRackRequest;
import com.huaweicloud.sdk.clouddc.v1.model.UpdateIRackResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudDCClient {

    protected HcClient hcClient;

    public CloudDCClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudDCClient> newBuilder() {
        ClientBuilder<CloudDCClient> clientBuilder = new ClientBuilder<>(CloudDCClient::new, "BasicCredentials");
        return clientBuilder;
    }

    /**
     * 批量创建机柜标签
     *
     * 批量创建机柜标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIrackTagsRequest 请求对象
     * @return BatchCreateIrackTagsResponse
     */
    public BatchCreateIrackTagsResponse batchCreateIrackTags(BatchCreateIrackTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.batchCreateIrackTags);
    }

    /**
     * 批量创建机柜标签
     *
     * 批量创建机柜标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIrackTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateIrackTagsRequest, BatchCreateIrackTagsResponse>
     */
    public SyncInvoker<BatchCreateIrackTagsRequest, BatchCreateIrackTagsResponse> batchCreateIrackTagsInvoker(
        BatchCreateIrackTagsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.batchCreateIrackTags, hcClient);
    }

    /**
     * 批量创建资源标签
     *
     * 批量创建资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return BatchCreateTagsResponse
     */
    public BatchCreateTagsResponse batchCreateTags(BatchCreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.batchCreateTags);
    }

    /**
     * 批量创建资源标签
     *
     * 批量创建资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsInvoker(
        BatchCreateTagsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.batchCreateTags, hcClient);
    }

    /**
     * 批量删除机柜标签
     *
     * 批量删除机柜标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIrackTagsRequest 请求对象
     * @return BatchDeleteIrackTagsResponse
     */
    public BatchDeleteIrackTagsResponse batchDeleteIrackTags(BatchDeleteIrackTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.batchDeleteIrackTags);
    }

    /**
     * 批量删除机柜标签
     *
     * 批量删除机柜标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIrackTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteIrackTagsRequest, BatchDeleteIrackTagsResponse>
     */
    public SyncInvoker<BatchDeleteIrackTagsRequest, BatchDeleteIrackTagsResponse> batchDeleteIrackTagsInvoker(
        BatchDeleteIrackTagsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.batchDeleteIrackTags, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return BatchDeleteTagsResponse
     */
    public BatchDeleteTagsResponse batchDeleteTags(BatchDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.batchDeleteTags);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.batchDeleteTags, hcClient);
    }

    /**
     * 批量修改实例密码
     *
     * 修改服务器管理账号（root用户或Administrator用户）密码
     * 前提条件：Instance state为running
     * 该接口为同步接口，全部成功或者全部失败
     * 约束：
     * 无符合安全要求的密码复杂度检查，非安全密码输入后，无错误提示。
     * 服务器开机或重启后，新密码生效（调用**ChangeServerPowerState**接口重启）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstancePasswordRequest 请求对象
     * @return ChangeInstancePasswordResponse
     */
    public ChangeInstancePasswordResponse changeInstancePassword(ChangeInstancePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.changeInstancePassword);
    }

    /**
     * 批量修改实例密码
     *
     * 修改服务器管理账号（root用户或Administrator用户）密码
     * 前提条件：Instance state为running
     * 该接口为同步接口，全部成功或者全部失败
     * 约束：
     * 无符合安全要求的密码复杂度检查，非安全密码输入后，无错误提示。
     * 服务器开机或重启后，新密码生效（调用**ChangeServerPowerState**接口重启）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstancePasswordRequest 请求对象
     * @return SyncInvoker<ChangeInstancePasswordRequest, ChangeInstancePasswordResponse>
     */
    public SyncInvoker<ChangeInstancePasswordRequest, ChangeInstancePasswordResponse> changeInstancePasswordInvoker(
        ChangeInstancePasswordRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.changeInstancePassword, hcClient);
    }

    /**
     * 批量修改物理服务器电源状态
     *
     * 修改物理服务器电源状态，此接口为异步接口，电源状态修改成功与否需要根据查询物理服务器信息获得
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerPowerStateRequest 请求对象
     * @return ChangeServerPowerStateResponse
     */
    public ChangeServerPowerStateResponse changeServerPowerState(ChangeServerPowerStateRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.changeServerPowerState);
    }

    /**
     * 批量修改物理服务器电源状态
     *
     * 修改物理服务器电源状态，此接口为异步接口，电源状态修改成功与否需要根据查询物理服务器信息获得
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerPowerStateRequest 请求对象
     * @return SyncInvoker<ChangeServerPowerStateRequest, ChangeServerPowerStateResponse>
     */
    public SyncInvoker<ChangeServerPowerStateRequest, ChangeServerPowerStateResponse> changeServerPowerStateInvoker(
        ChangeServerPowerStateRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.changeServerPowerState, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例，支持指定IP等更多个性化参数创建实例。
     * 
     * 调度策略支持：
     * 1、指定服务器
     * 2、基于空闲随机调度策略
     * 
     * 支持VPC网络及AI参数面网络配置。
     * 
     * 此接口为异步接口，实例的创建和启动不是立即完成的，通过接口 **ShowInstanceStatus** 查询实例状态为 **running** 代表实例创建成功。
     * 接口约束：服务器**manage_state**为 **ready**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建实例，支持指定IP等更多个性化参数创建实例。
     * 
     * 调度策略支持：
     * 1、指定服务器
     * 2、基于空闲随机调度策略
     * 
     * 支持VPC网络及AI参数面网络配置。
     * 
     * 此接口为异步接口，实例的创建和启动不是立即完成的，通过接口 **ShowInstanceStatus** 查询实例状态为 **running** 代表实例创建成功。
     * 接口约束：服务器**manage_state**为 **ready**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.createInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 指定物理服务器删除实例，此接口为异步接口，可通过 **ShowInstanceStatus** 查询实例状态，实例状态从 **shutting-down** 变为 **terminated**，表明删除实例成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 指定物理服务器删除实例，此接口为异步接口，可通过 **ShowInstanceStatus** 查询实例状态，实例状态从 **shutting-down** 变为 **terminated**，表明删除实例成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.deleteInstance, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 指定物理服务器批量删除实例，此接口为异步接口，可通过 **ShowInstanceStatus** 查询实例状态，实例状态从 **shutting-down** 变为 **terminated**，表明删除实例成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.deleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 指定物理服务器批量删除实例，此接口为异步接口，可通过 **ShowInstanceStatus** 查询实例状态，实例状态从 **shutting-down** 变为 **terminated**，表明删除实例成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>
     */
    public SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstancesInvoker(
        DeleteInstancesRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.deleteInstances, hcClient);
    }

    /**
     * 下载日志文件
     *
     * 下载服务器日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadServerLogsRequest 请求对象
     * @return DownloadServerLogsResponse
     */
    public DownloadServerLogsResponse downloadServerLogs(DownloadServerLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.downloadServerLogs);
    }

    /**
     * 下载日志文件
     *
     * 下载服务器日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadServerLogsRequest 请求对象
     * @return SyncInvoker<DownloadServerLogsRequest, DownloadServerLogsResponse>
     */
    public SyncInvoker<DownloadServerLogsRequest, DownloadServerLogsResponse> downloadServerLogsInvoker(
        DownloadServerLogsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.downloadServerLogs, hcClient);
    }

    /**
     * 导出服务器日志请求
     *
     * 创建服务器日志导出异步任务。根据ShowLogsExportStatus查询status，当status状态为completed时，调用DownloadServerLogs下载日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportServerLogsRequest 请求对象
     * @return ExportServerLogsResponse
     */
    public ExportServerLogsResponse exportServerLogs(ExportServerLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.exportServerLogs);
    }

    /**
     * 导出服务器日志请求
     *
     * 创建服务器日志导出异步任务。根据ShowLogsExportStatus查询status，当status状态为completed时，调用DownloadServerLogs下载日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportServerLogsRequest 请求对象
     * @return SyncInvoker<ExportServerLogsRequest, ExportServerLogsResponse>
     */
    public SyncInvoker<ExportServerLogsRequest, ExportServerLogsResponse> exportServerLogsInvoker(
        ExportServerLogsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.exportServerLogs, hcClient);
    }

    /**
     * 服务器告警列表
     *
     * 该 API 用于查询服务器告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return ListAlarmsResponse
     */
    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.listAlarms);
    }

    /**
     * 服务器告警列表
     *
     * 该 API 用于查询服务器告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return SyncInvoker<ListAlarmsRequest, ListAlarmsResponse>
     */
    public SyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsInvoker(ListAlarmsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.listAlarms, hcClient);
    }

    /**
     * 服务器事件列表
     *
     * 该 API 用于查询服务器事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.listEvents);
    }

    /**
     * 服务器事件列表
     *
     * 该 API 用于查询服务器事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.listEvents, hcClient);
    }

    /**
     * 查询 IDC 列表
     *
     * 查询 IDC 列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIDcsRequest 请求对象
     * @return ListIDcsResponse
     */
    public ListIDcsResponse listIDcs(ListIDcsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.listIDcs);
    }

    /**
     * 查询 IDC 列表
     *
     * 查询 IDC 列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIDcsRequest 请求对象
     * @return SyncInvoker<ListIDcsRequest, ListIDcsResponse>
     */
    public SyncInvoker<ListIDcsRequest, ListIDcsResponse> listIDcsInvoker(ListIDcsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.listIDcs, hcClient);
    }

    /**
     * 查询 iRack 实例列表
     *
     * 用户下单后，用户上报iRack设备列表。该 API 可以查看 iRack 实例与关联imetal数量列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIRackRequest 请求对象
     * @return ListIRackResponse
     */
    public ListIRackResponse listIRack(ListIRackRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.listIRack);
    }

    /**
     * 查询 iRack 实例列表
     *
     * 用户下单后，用户上报iRack设备列表。该 API 可以查看 iRack 实例与关联imetal数量列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIRackRequest 请求对象
     * @return SyncInvoker<ListIRackRequest, ListIRackResponse>
     */
    public SyncInvoker<ListIRackRequest, ListIRackResponse> listIRackInvoker(ListIRackRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.listIRack, hcClient);
    }

    /**
     * 批量查询实例
     *
     * 批量查询实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.listInstances);
    }

    /**
     * 批量查询实例
     *
     * 批量查询实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.listInstances, hcClient);
    }

    /**
     * 批量查询物理服务器
     *
     * List imetal servers
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return ListServersResponse
     */
    public ListServersResponse listServers(ListServersRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.listServers);
    }

    /**
     * 批量查询物理服务器
     *
     * List imetal servers
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return SyncInvoker<ListServersRequest, ListServersResponse>
     */
    public SyncInvoker<ListServersRequest, ListServersResponse> listServersInvoker(ListServersRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.listServers, hcClient);
    }

    /**
     * 修改实例ip
     *
     * 用户可选择指定的 iMetal 实例，修改ip。
     * 
     * 接口约束：iMetal 实例处于就绪状态（已调测成功）或修改ip失败同时为下电状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceIpRequest 请求对象
     * @return ModifyInstanceIpResponse
     */
    public ModifyInstanceIpResponse modifyInstanceIp(ModifyInstanceIpRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.modifyInstanceIp);
    }

    /**
     * 修改实例ip
     *
     * 用户可选择指定的 iMetal 实例，修改ip。
     * 
     * 接口约束：iMetal 实例处于就绪状态（已调测成功）或修改ip失败同时为下电状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceIpRequest 请求对象
     * @return SyncInvoker<ModifyInstanceIpRequest, ModifyInstanceIpResponse>
     */
    public SyncInvoker<ModifyInstanceIpRequest, ModifyInstanceIpResponse> modifyInstanceIpInvoker(
        ModifyInstanceIpRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.modifyInstanceIp, hcClient);
    }

    /**
     * 批量重新安装OS
     *
     * 指定新OS镜像重新安装OS，此接口为异步接口，通过 **ShowInstanceStatus** 查询实例状态，当状态变为 **pending** 表明正在重装中，状态为 **running** 表明完成重装。
     * 前提条件：Instance state为running
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallOsRequest 请求对象
     * @return ReinstallOsResponse
     */
    public ReinstallOsResponse reinstallOs(ReinstallOsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.reinstallOs);
    }

    /**
     * 批量重新安装OS
     *
     * 指定新OS镜像重新安装OS，此接口为异步接口，通过 **ShowInstanceStatus** 查询实例状态，当状态变为 **pending** 表明正在重装中，状态为 **running** 表明完成重装。
     * 前提条件：Instance state为running
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallOsRequest 请求对象
     * @return SyncInvoker<ReinstallOsRequest, ReinstallOsResponse>
     */
    public SyncInvoker<ReinstallOsRequest, ReinstallOsResponse> reinstallOsInvoker(ReinstallOsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.reinstallOs, hcClient);
    }

    /**
     * 批量创建实例
     *
     * 批量创建实例，其中调度策略支持：
     * 1、指定服务器
     * 2、基于空闲随机调度策略
     * 
     * 支持VPC网络及AI参数面网络配置。
     * 
     * 此接口为异步接口，实例的创建和启动不是立即完成的，通过接口 **ShowInstanceStatus** 查询实例状态为 **running** 代表实例创建成功。
     * 接口约束：服务器**manage_state**为 **ready**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstancesRequest 请求对象
     * @return RunInstancesResponse
     */
    public RunInstancesResponse runInstances(RunInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.runInstances);
    }

    /**
     * 批量创建实例
     *
     * 批量创建实例，其中调度策略支持：
     * 1、指定服务器
     * 2、基于空闲随机调度策略
     * 
     * 支持VPC网络及AI参数面网络配置。
     * 
     * 此接口为异步接口，实例的创建和启动不是立即完成的，通过接口 **ShowInstanceStatus** 查询实例状态为 **running** 代表实例创建成功。
     * 接口约束：服务器**manage_state**为 **ready**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstancesRequest 请求对象
     * @return SyncInvoker<RunInstancesRequest, RunInstancesResponse>
     */
    public SyncInvoker<RunInstancesRequest, RunInstancesResponse> runInstancesInvoker(RunInstancesRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.runInstances, hcClient);
    }

    /**
     * 服务器告警概览
     *
     * 该 API 用于查询服务器告警概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmSummaryRequest 请求对象
     * @return ShowAlarmSummaryResponse
     */
    public ShowAlarmSummaryResponse showAlarmSummary(ShowAlarmSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showAlarmSummary);
    }

    /**
     * 服务器告警概览
     *
     * 该 API 用于查询服务器告警概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmSummaryRequest 请求对象
     * @return SyncInvoker<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse>
     */
    public SyncInvoker<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> showAlarmSummaryInvoker(
        ShowAlarmSummaryRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showAlarmSummary, hcClient);
    }

    /**
     * 服务器告警趋势
     *
     * 该 API 用于查询服务器概览、服务器开机状态和服务器运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmTrendRequest 请求对象
     * @return ShowAlarmTrendResponse
     */
    public ShowAlarmTrendResponse showAlarmTrend(ShowAlarmTrendRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showAlarmTrend);
    }

    /**
     * 服务器告警趋势
     *
     * 该 API 用于查询服务器概览、服务器开机状态和服务器运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmTrendRequest 请求对象
     * @return SyncInvoker<ShowAlarmTrendRequest, ShowAlarmTrendResponse>
     */
    public SyncInvoker<ShowAlarmTrendRequest, ShowAlarmTrendResponse> showAlarmTrendInvoker(
        ShowAlarmTrendRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showAlarmTrend, hcClient);
    }

    /**
     * 查询事件定义
     *
     * 查询事件定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
     * @return ShowEventResponse
     */
    public ShowEventResponse showEvent(ShowEventRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showEvent);
    }

    /**
     * 查询事件定义
     *
     * 查询事件定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
     * @return SyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public SyncInvoker<ShowEventRequest, ShowEventResponse> showEventInvoker(ShowEventRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showEvent, hcClient);
    }

    /**
     * 查询实例状态
     *
     * 查询实例状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceStatusRequest 请求对象
     * @return ShowInstanceStatusResponse
     */
    public ShowInstanceStatusResponse showInstanceStatus(ShowInstanceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showInstanceStatus);
    }

    /**
     * 查询实例状态
     *
     * 查询实例状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceStatusRequest 请求对象
     * @return SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>
     */
    public SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatusInvoker(
        ShowInstanceStatusRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showInstanceStatus, hcClient);
    }

    /**
     * 查询日志导出状态
     *
     * 查询日志采集状态及进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsExportStatusRequest 请求对象
     * @return ShowLogsExportStatusResponse
     */
    public ShowLogsExportStatusResponse showLogsExportStatus(ShowLogsExportStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showLogsExportStatus);
    }

    /**
     * 查询日志导出状态
     *
     * 查询日志采集状态及进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsExportStatusRequest 请求对象
     * @return SyncInvoker<ShowLogsExportStatusRequest, ShowLogsExportStatusResponse>
     */
    public SyncInvoker<ShowLogsExportStatusRequest, ShowLogsExportStatusResponse> showLogsExportStatusInvoker(
        ShowLogsExportStatusRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showLogsExportStatus, hcClient);
    }

    /**
     * 获取console地址信息
     *
     * 获取console信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteConsoleRequest 请求对象
     * @return ShowRemoteConsoleResponse
     */
    public ShowRemoteConsoleResponse showRemoteConsole(ShowRemoteConsoleRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showRemoteConsole);
    }

    /**
     * 获取console地址信息
     *
     * 获取console信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteConsoleRequest 请求对象
     * @return SyncInvoker<ShowRemoteConsoleRequest, ShowRemoteConsoleResponse>
     */
    public SyncInvoker<ShowRemoteConsoleRequest, ShowRemoteConsoleResponse> showRemoteConsoleInvoker(
        ShowRemoteConsoleRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showRemoteConsole, hcClient);
    }

    /**
     * 查询物理服务器信息
     *
     * Get imetal server by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return ShowServerResponse
     */
    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showServer);
    }

    /**
     * 查询物理服务器信息
     *
     * Get imetal server by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return SyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public SyncInvoker<ShowServerRequest, ShowServerResponse> showServerInvoker(ShowServerRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showServer, hcClient);
    }

    /**
     * 查询服务器固件详细信息
     *
     * 获取详细固件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerFirmwareAttributesRequest 请求对象
     * @return ShowServerFirmwareAttributesResponse
     */
    public ShowServerFirmwareAttributesResponse showServerFirmwareAttributes(
        ShowServerFirmwareAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showServerFirmwareAttributes);
    }

    /**
     * 查询服务器固件详细信息
     *
     * 获取详细固件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerFirmwareAttributesRequest 请求对象
     * @return SyncInvoker<ShowServerFirmwareAttributesRequest, ShowServerFirmwareAttributesResponse>
     */
    public SyncInvoker<ShowServerFirmwareAttributesRequest, ShowServerFirmwareAttributesResponse> showServerFirmwareAttributesInvoker(
        ShowServerFirmwareAttributesRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showServerFirmwareAttributes, hcClient);
    }

    /**
     * 查询服务器硬件详细信息
     *
     * 获取详细硬件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerHardwareAttributesRequest 请求对象
     * @return ShowServerHardwareAttributesResponse
     */
    public ShowServerHardwareAttributesResponse showServerHardwareAttributes(
        ShowServerHardwareAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showServerHardwareAttributes);
    }

    /**
     * 查询服务器硬件详细信息
     *
     * 获取详细硬件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerHardwareAttributesRequest 请求对象
     * @return SyncInvoker<ShowServerHardwareAttributesRequest, ShowServerHardwareAttributesResponse>
     */
    public SyncInvoker<ShowServerHardwareAttributesRequest, ShowServerHardwareAttributesResponse> showServerHardwareAttributesInvoker(
        ShowServerHardwareAttributesRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showServerHardwareAttributes, hcClient);
    }

    /**
     * 服务器概览
     *
     * 该 API 用于查询服务器概览、服务器开机状态和服务器运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerStatusRequest 请求对象
     * @return ShowServerStatusResponse
     */
    public ShowServerStatusResponse showServerStatus(ShowServerStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.showServerStatus);
    }

    /**
     * 服务器概览
     *
     * 该 API 用于查询服务器概览、服务器开机状态和服务器运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerStatusRequest 请求对象
     * @return SyncInvoker<ShowServerStatusRequest, ShowServerStatusResponse>
     */
    public SyncInvoker<ShowServerStatusRequest, ShowServerStatusResponse> showServerStatusInvoker(
        ShowServerStatusRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.showServerStatus, hcClient);
    }

    /**
     * 修改 IDC 描述
     *
     * 修改 IDC 描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIDcsRequest 请求对象
     * @return UpdateIDcsResponse
     */
    public UpdateIDcsResponse updateIDcs(UpdateIDcsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.updateIDcs);
    }

    /**
     * 修改 IDC 描述
     *
     * 修改 IDC 描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIDcsRequest 请求对象
     * @return SyncInvoker<UpdateIDcsRequest, UpdateIDcsResponse>
     */
    public SyncInvoker<UpdateIDcsRequest, UpdateIDcsResponse> updateIDcsInvoker(UpdateIDcsRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.updateIDcs, hcClient);
    }

    /**
     * 更新 iRack 实例
     *
     * 更新iRack信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIRackRequest 请求对象
     * @return UpdateIRackResponse
     */
    public UpdateIRackResponse updateIRack(UpdateIRackRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDCMeta.updateIRack);
    }

    /**
     * 更新 iRack 实例
     *
     * 更新iRack信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIRackRequest 请求对象
     * @return SyncInvoker<UpdateIRackRequest, UpdateIRackResponse>
     */
    public SyncInvoker<UpdateIRackRequest, UpdateIRackResponse> updateIRackInvoker(UpdateIRackRequest request) {
        return new SyncInvoker<>(request, CloudDCMeta.updateIRack, hcClient);
    }

}
