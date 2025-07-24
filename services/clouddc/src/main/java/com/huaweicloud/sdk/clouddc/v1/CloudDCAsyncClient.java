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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudDCAsyncClient {

    protected HcClient hcClient;

    public CloudDCAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudDCAsyncClient> newBuilder() {
        ClientBuilder<CloudDCAsyncClient> clientBuilder =
            new ClientBuilder<>(CloudDCAsyncClient::new, "BasicCredentials");
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
     * @return CompletableFuture<BatchCreateIrackTagsResponse>
     */
    public CompletableFuture<BatchCreateIrackTagsResponse> batchCreateIrackTagsAsync(
        BatchCreateIrackTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.batchCreateIrackTags);
    }

    /**
     * 批量创建机柜标签
     *
     * 批量创建机柜标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIrackTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateIrackTagsRequest, BatchCreateIrackTagsResponse>
     */
    public AsyncInvoker<BatchCreateIrackTagsRequest, BatchCreateIrackTagsResponse> batchCreateIrackTagsAsyncInvoker(
        BatchCreateIrackTagsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.batchCreateIrackTags, hcClient);
    }

    /**
     * 批量创建资源标签
     *
     * 批量创建资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateTagsResponse>
     */
    public CompletableFuture<BatchCreateTagsResponse> batchCreateTagsAsync(BatchCreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.batchCreateTags);
    }

    /**
     * 批量创建资源标签
     *
     * 批量创建资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsAsyncInvoker(
        BatchCreateTagsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.batchCreateTags, hcClient);
    }

    /**
     * 批量删除机柜标签
     *
     * 批量删除机柜标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIrackTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteIrackTagsResponse>
     */
    public CompletableFuture<BatchDeleteIrackTagsResponse> batchDeleteIrackTagsAsync(
        BatchDeleteIrackTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.batchDeleteIrackTags);
    }

    /**
     * 批量删除机柜标签
     *
     * 批量删除机柜标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIrackTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteIrackTagsRequest, BatchDeleteIrackTagsResponse>
     */
    public AsyncInvoker<BatchDeleteIrackTagsRequest, BatchDeleteIrackTagsResponse> batchDeleteIrackTagsAsyncInvoker(
        BatchDeleteIrackTagsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.batchDeleteIrackTags, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.batchDeleteTags);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.batchDeleteTags, hcClient);
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
     * @return CompletableFuture<ChangeInstancePasswordResponse>
     */
    public CompletableFuture<ChangeInstancePasswordResponse> changeInstancePasswordAsync(
        ChangeInstancePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.changeInstancePassword);
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
     * @return AsyncInvoker<ChangeInstancePasswordRequest, ChangeInstancePasswordResponse>
     */
    public AsyncInvoker<ChangeInstancePasswordRequest, ChangeInstancePasswordResponse> changeInstancePasswordAsyncInvoker(
        ChangeInstancePasswordRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.changeInstancePassword, hcClient);
    }

    /**
     * 批量修改物理服务器电源状态
     *
     * 修改物理服务器电源状态，此接口为异步接口，电源状态修改成功与否需要根据查询物理服务器信息获得
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerPowerStateRequest 请求对象
     * @return CompletableFuture<ChangeServerPowerStateResponse>
     */
    public CompletableFuture<ChangeServerPowerStateResponse> changeServerPowerStateAsync(
        ChangeServerPowerStateRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.changeServerPowerState);
    }

    /**
     * 批量修改物理服务器电源状态
     *
     * 修改物理服务器电源状态，此接口为异步接口，电源状态修改成功与否需要根据查询物理服务器信息获得
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerPowerStateRequest 请求对象
     * @return AsyncInvoker<ChangeServerPowerStateRequest, ChangeServerPowerStateResponse>
     */
    public AsyncInvoker<ChangeServerPowerStateRequest, ChangeServerPowerStateResponse> changeServerPowerStateAsyncInvoker(
        ChangeServerPowerStateRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.changeServerPowerState, hcClient);
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
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.createInstance);
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
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.createInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 指定物理服务器删除实例，此接口为异步接口，可通过 **ShowInstanceStatus** 查询实例状态，实例状态从 **shutting-down** 变为 **terminated**，表明删除实例成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 指定物理服务器删除实例，此接口为异步接口，可通过 **ShowInstanceStatus** 查询实例状态，实例状态从 **shutting-down** 变为 **terminated**，表明删除实例成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.deleteInstance, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 指定物理服务器批量删除实例，此接口为异步接口，可通过 **ShowInstanceStatus** 查询实例状态，实例状态从 **shutting-down** 变为 **terminated**，表明删除实例成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return CompletableFuture<DeleteInstancesResponse>
     */
    public CompletableFuture<DeleteInstancesResponse> deleteInstancesAsync(DeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.deleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 指定物理服务器批量删除实例，此接口为异步接口，可通过 **ShowInstanceStatus** 查询实例状态，实例状态从 **shutting-down** 变为 **terminated**，表明删除实例成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>
     */
    public AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstancesAsyncInvoker(
        DeleteInstancesRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.deleteInstances, hcClient);
    }

    /**
     * 下载日志文件
     *
     * 下载服务器日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadServerLogsRequest 请求对象
     * @return CompletableFuture<DownloadServerLogsResponse>
     */
    public CompletableFuture<DownloadServerLogsResponse> downloadServerLogsAsync(DownloadServerLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.downloadServerLogs);
    }

    /**
     * 下载日志文件
     *
     * 下载服务器日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadServerLogsRequest 请求对象
     * @return AsyncInvoker<DownloadServerLogsRequest, DownloadServerLogsResponse>
     */
    public AsyncInvoker<DownloadServerLogsRequest, DownloadServerLogsResponse> downloadServerLogsAsyncInvoker(
        DownloadServerLogsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.downloadServerLogs, hcClient);
    }

    /**
     * 导出服务器日志请求
     *
     * 创建服务器日志导出异步任务。根据ShowLogsExportStatus查询status，当status状态为completed时，调用DownloadServerLogs下载日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportServerLogsRequest 请求对象
     * @return CompletableFuture<ExportServerLogsResponse>
     */
    public CompletableFuture<ExportServerLogsResponse> exportServerLogsAsync(ExportServerLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.exportServerLogs);
    }

    /**
     * 导出服务器日志请求
     *
     * 创建服务器日志导出异步任务。根据ShowLogsExportStatus查询status，当status状态为completed时，调用DownloadServerLogs下载日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportServerLogsRequest 请求对象
     * @return AsyncInvoker<ExportServerLogsRequest, ExportServerLogsResponse>
     */
    public AsyncInvoker<ExportServerLogsRequest, ExportServerLogsResponse> exportServerLogsAsyncInvoker(
        ExportServerLogsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.exportServerLogs, hcClient);
    }

    /**
     * 服务器告警列表
     *
     * 该 API 用于查询服务器告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmsResponse>
     */
    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.listAlarms);
    }

    /**
     * 服务器告警列表
     *
     * 该 API 用于查询服务器告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>
     */
    public AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsAsyncInvoker(ListAlarmsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.listAlarms, hcClient);
    }

    /**
     * 服务器事件列表
     *
     * 该 API 用于查询服务器事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.listEvents);
    }

    /**
     * 服务器事件列表
     *
     * 该 API 用于查询服务器事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.listEvents, hcClient);
    }

    /**
     * 查询 IDC 列表
     *
     * 查询 IDC 列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIDcsRequest 请求对象
     * @return CompletableFuture<ListIDcsResponse>
     */
    public CompletableFuture<ListIDcsResponse> listIDcsAsync(ListIDcsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.listIDcs);
    }

    /**
     * 查询 IDC 列表
     *
     * 查询 IDC 列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIDcsRequest 请求对象
     * @return AsyncInvoker<ListIDcsRequest, ListIDcsResponse>
     */
    public AsyncInvoker<ListIDcsRequest, ListIDcsResponse> listIDcsAsyncInvoker(ListIDcsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.listIDcs, hcClient);
    }

    /**
     * 查询 iRack 实例列表
     *
     * 用户下单后，用户上报iRack设备列表。该 API 可以查看 iRack 实例与关联imetal数量列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIRackRequest 请求对象
     * @return CompletableFuture<ListIRackResponse>
     */
    public CompletableFuture<ListIRackResponse> listIRackAsync(ListIRackRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.listIRack);
    }

    /**
     * 查询 iRack 实例列表
     *
     * 用户下单后，用户上报iRack设备列表。该 API 可以查看 iRack 实例与关联imetal数量列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIRackRequest 请求对象
     * @return AsyncInvoker<ListIRackRequest, ListIRackResponse>
     */
    public AsyncInvoker<ListIRackRequest, ListIRackResponse> listIRackAsyncInvoker(ListIRackRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.listIRack, hcClient);
    }

    /**
     * 批量查询实例
     *
     * 批量查询实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.listInstances);
    }

    /**
     * 批量查询实例
     *
     * 批量查询实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.listInstances, hcClient);
    }

    /**
     * 批量查询物理服务器
     *
     * List imetal servers
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return CompletableFuture<ListServersResponse>
     */
    public CompletableFuture<ListServersResponse> listServersAsync(ListServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.listServers);
    }

    /**
     * 批量查询物理服务器
     *
     * List imetal servers
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return AsyncInvoker<ListServersRequest, ListServersResponse>
     */
    public AsyncInvoker<ListServersRequest, ListServersResponse> listServersAsyncInvoker(ListServersRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.listServers, hcClient);
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
     * @return CompletableFuture<ModifyInstanceIpResponse>
     */
    public CompletableFuture<ModifyInstanceIpResponse> modifyInstanceIpAsync(ModifyInstanceIpRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.modifyInstanceIp);
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
     * @return AsyncInvoker<ModifyInstanceIpRequest, ModifyInstanceIpResponse>
     */
    public AsyncInvoker<ModifyInstanceIpRequest, ModifyInstanceIpResponse> modifyInstanceIpAsyncInvoker(
        ModifyInstanceIpRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.modifyInstanceIp, hcClient);
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
     * @return CompletableFuture<ReinstallOsResponse>
     */
    public CompletableFuture<ReinstallOsResponse> reinstallOsAsync(ReinstallOsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.reinstallOs);
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
     * @return AsyncInvoker<ReinstallOsRequest, ReinstallOsResponse>
     */
    public AsyncInvoker<ReinstallOsRequest, ReinstallOsResponse> reinstallOsAsyncInvoker(ReinstallOsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.reinstallOs, hcClient);
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
     * @return CompletableFuture<RunInstancesResponse>
     */
    public CompletableFuture<RunInstancesResponse> runInstancesAsync(RunInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.runInstances);
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
     * @return AsyncInvoker<RunInstancesRequest, RunInstancesResponse>
     */
    public AsyncInvoker<RunInstancesRequest, RunInstancesResponse> runInstancesAsyncInvoker(
        RunInstancesRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.runInstances, hcClient);
    }

    /**
     * 服务器告警概览
     *
     * 该 API 用于查询服务器告警概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmSummaryRequest 请求对象
     * @return CompletableFuture<ShowAlarmSummaryResponse>
     */
    public CompletableFuture<ShowAlarmSummaryResponse> showAlarmSummaryAsync(ShowAlarmSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showAlarmSummary);
    }

    /**
     * 服务器告警概览
     *
     * 该 API 用于查询服务器告警概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmSummaryRequest 请求对象
     * @return AsyncInvoker<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse>
     */
    public AsyncInvoker<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> showAlarmSummaryAsyncInvoker(
        ShowAlarmSummaryRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showAlarmSummary, hcClient);
    }

    /**
     * 服务器告警趋势
     *
     * 该 API 用于查询服务器概览、服务器开机状态和服务器运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmTrendRequest 请求对象
     * @return CompletableFuture<ShowAlarmTrendResponse>
     */
    public CompletableFuture<ShowAlarmTrendResponse> showAlarmTrendAsync(ShowAlarmTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showAlarmTrend);
    }

    /**
     * 服务器告警趋势
     *
     * 该 API 用于查询服务器概览、服务器开机状态和服务器运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmTrendRequest 请求对象
     * @return AsyncInvoker<ShowAlarmTrendRequest, ShowAlarmTrendResponse>
     */
    public AsyncInvoker<ShowAlarmTrendRequest, ShowAlarmTrendResponse> showAlarmTrendAsyncInvoker(
        ShowAlarmTrendRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showAlarmTrend, hcClient);
    }

    /**
     * 查询事件定义
     *
     * 查询事件定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
     * @return CompletableFuture<ShowEventResponse>
     */
    public CompletableFuture<ShowEventResponse> showEventAsync(ShowEventRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showEvent);
    }

    /**
     * 查询事件定义
     *
     * 查询事件定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
     * @return AsyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public AsyncInvoker<ShowEventRequest, ShowEventResponse> showEventAsyncInvoker(ShowEventRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showEvent, hcClient);
    }

    /**
     * 查询实例状态
     *
     * 查询实例状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceStatusRequest 请求对象
     * @return CompletableFuture<ShowInstanceStatusResponse>
     */
    public CompletableFuture<ShowInstanceStatusResponse> showInstanceStatusAsync(ShowInstanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showInstanceStatus);
    }

    /**
     * 查询实例状态
     *
     * 查询实例状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceStatusRequest 请求对象
     * @return AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>
     */
    public AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatusAsyncInvoker(
        ShowInstanceStatusRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showInstanceStatus, hcClient);
    }

    /**
     * 查询日志导出状态
     *
     * 查询日志采集状态及进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsExportStatusRequest 请求对象
     * @return CompletableFuture<ShowLogsExportStatusResponse>
     */
    public CompletableFuture<ShowLogsExportStatusResponse> showLogsExportStatusAsync(
        ShowLogsExportStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showLogsExportStatus);
    }

    /**
     * 查询日志导出状态
     *
     * 查询日志采集状态及进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsExportStatusRequest 请求对象
     * @return AsyncInvoker<ShowLogsExportStatusRequest, ShowLogsExportStatusResponse>
     */
    public AsyncInvoker<ShowLogsExportStatusRequest, ShowLogsExportStatusResponse> showLogsExportStatusAsyncInvoker(
        ShowLogsExportStatusRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showLogsExportStatus, hcClient);
    }

    /**
     * 获取console地址信息
     *
     * 获取console信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteConsoleRequest 请求对象
     * @return CompletableFuture<ShowRemoteConsoleResponse>
     */
    public CompletableFuture<ShowRemoteConsoleResponse> showRemoteConsoleAsync(ShowRemoteConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showRemoteConsole);
    }

    /**
     * 获取console地址信息
     *
     * 获取console信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteConsoleRequest 请求对象
     * @return AsyncInvoker<ShowRemoteConsoleRequest, ShowRemoteConsoleResponse>
     */
    public AsyncInvoker<ShowRemoteConsoleRequest, ShowRemoteConsoleResponse> showRemoteConsoleAsyncInvoker(
        ShowRemoteConsoleRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showRemoteConsole, hcClient);
    }

    /**
     * 查询物理服务器信息
     *
     * Get imetal server by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return CompletableFuture<ShowServerResponse>
     */
    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showServer);
    }

    /**
     * 查询物理服务器信息
     *
     * Get imetal server by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return AsyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showServer, hcClient);
    }

    /**
     * 查询服务器固件详细信息
     *
     * 获取详细固件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerFirmwareAttributesRequest 请求对象
     * @return CompletableFuture<ShowServerFirmwareAttributesResponse>
     */
    public CompletableFuture<ShowServerFirmwareAttributesResponse> showServerFirmwareAttributesAsync(
        ShowServerFirmwareAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showServerFirmwareAttributes);
    }

    /**
     * 查询服务器固件详细信息
     *
     * 获取详细固件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerFirmwareAttributesRequest 请求对象
     * @return AsyncInvoker<ShowServerFirmwareAttributesRequest, ShowServerFirmwareAttributesResponse>
     */
    public AsyncInvoker<ShowServerFirmwareAttributesRequest, ShowServerFirmwareAttributesResponse> showServerFirmwareAttributesAsyncInvoker(
        ShowServerFirmwareAttributesRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showServerFirmwareAttributes, hcClient);
    }

    /**
     * 查询服务器硬件详细信息
     *
     * 获取详细硬件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerHardwareAttributesRequest 请求对象
     * @return CompletableFuture<ShowServerHardwareAttributesResponse>
     */
    public CompletableFuture<ShowServerHardwareAttributesResponse> showServerHardwareAttributesAsync(
        ShowServerHardwareAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showServerHardwareAttributes);
    }

    /**
     * 查询服务器硬件详细信息
     *
     * 获取详细硬件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerHardwareAttributesRequest 请求对象
     * @return AsyncInvoker<ShowServerHardwareAttributesRequest, ShowServerHardwareAttributesResponse>
     */
    public AsyncInvoker<ShowServerHardwareAttributesRequest, ShowServerHardwareAttributesResponse> showServerHardwareAttributesAsyncInvoker(
        ShowServerHardwareAttributesRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showServerHardwareAttributes, hcClient);
    }

    /**
     * 服务器概览
     *
     * 该 API 用于查询服务器概览、服务器开机状态和服务器运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerStatusRequest 请求对象
     * @return CompletableFuture<ShowServerStatusResponse>
     */
    public CompletableFuture<ShowServerStatusResponse> showServerStatusAsync(ShowServerStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.showServerStatus);
    }

    /**
     * 服务器概览
     *
     * 该 API 用于查询服务器概览、服务器开机状态和服务器运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerStatusRequest 请求对象
     * @return AsyncInvoker<ShowServerStatusRequest, ShowServerStatusResponse>
     */
    public AsyncInvoker<ShowServerStatusRequest, ShowServerStatusResponse> showServerStatusAsyncInvoker(
        ShowServerStatusRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.showServerStatus, hcClient);
    }

    /**
     * 修改 IDC 描述
     *
     * 修改 IDC 描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIDcsRequest 请求对象
     * @return CompletableFuture<UpdateIDcsResponse>
     */
    public CompletableFuture<UpdateIDcsResponse> updateIDcsAsync(UpdateIDcsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.updateIDcs);
    }

    /**
     * 修改 IDC 描述
     *
     * 修改 IDC 描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIDcsRequest 请求对象
     * @return AsyncInvoker<UpdateIDcsRequest, UpdateIDcsResponse>
     */
    public AsyncInvoker<UpdateIDcsRequest, UpdateIDcsResponse> updateIDcsAsyncInvoker(UpdateIDcsRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.updateIDcs, hcClient);
    }

    /**
     * 更新 iRack 实例
     *
     * 更新iRack信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIRackRequest 请求对象
     * @return CompletableFuture<UpdateIRackResponse>
     */
    public CompletableFuture<UpdateIRackResponse> updateIRackAsync(UpdateIRackRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDCMeta.updateIRack);
    }

    /**
     * 更新 iRack 实例
     *
     * 更新iRack信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIRackRequest 请求对象
     * @return AsyncInvoker<UpdateIRackRequest, UpdateIRackResponse>
     */
    public AsyncInvoker<UpdateIRackRequest, UpdateIRackResponse> updateIRackAsyncInvoker(UpdateIRackRequest request) {
        return new AsyncInvoker<>(request, CloudDCMeta.updateIRack, hcClient);
    }

}
