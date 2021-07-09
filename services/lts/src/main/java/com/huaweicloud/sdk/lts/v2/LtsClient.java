package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.lts.v2.model.*;

public class LtsClient {
    protected HcClient hcClient;

    public LtsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LtsClient> newBuilder() {
        return new ClientBuilder<>(LtsClient::new);
    }


    /**
     * 日志转储
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return CreateLogDumpObsResponse
     */
    public CreateLogDumpObsResponse createLogDumpObs(CreateLogDumpObsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogDumpObs);
    }

    /**
     * 日志转储
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>
     */
    public SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObsInvoker(CreateLogDumpObsRequest request) {
        return new SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>(request, LtsMeta.createLogDumpObs, hcClient);
    }

    /**
     * 创建日志组
     * 该接口用于创建一个日志组
     *
     * @param CreateLogGroupRequest 请求对象
     * @return CreateLogGroupResponse
     */
    public CreateLogGroupResponse createLogGroup(CreateLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogGroup);
    }

    /**
     * 创建日志组
     * 该接口用于创建一个日志组
     *
     * @param CreateLogGroupRequest 请求对象
     * @return SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>
     */
    public SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroupInvoker(CreateLogGroupRequest request) {
        return new SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>(request, LtsMeta.createLogGroup, hcClient);
    }

    /**
     * 创建日志流
     * 该接口用于创建某个指定日志组下的日志流
     *
     * @param CreateLogStreamRequest 请求对象
     * @return CreateLogStreamResponse
     */
    public CreateLogStreamResponse createLogStream(CreateLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogStream);
    }

    /**
     * 创建日志流
     * 该接口用于创建某个指定日志组下的日志流
     *
     * @param CreateLogStreamRequest 请求对象
     * @return SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>
     */
    public SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> createLogStreamInvoker(CreateLogStreamRequest request) {
        return new SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>(request, LtsMeta.createLogStream, hcClient);
    }

    /**
     * 删除日志组
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return DeleteLogGroupResponse
     */
    public DeleteLogGroupResponse deleteLogGroup(DeleteLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteLogGroup);
    }

    /**
     * 删除日志组
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>
     */
    public SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroupInvoker(DeleteLogGroupRequest request) {
        return new SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>(request, LtsMeta.deleteLogGroup, hcClient);
    }

    /**
     * 删除日志流
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return DeleteLogStreamResponse
     */
    public DeleteLogStreamResponse deleteLogStream(DeleteLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteLogStream);
    }

    /**
     * 删除日志流
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>
     */
    public SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStreamInvoker(DeleteLogStreamRequest request) {
        return new SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>(request, LtsMeta.deleteLogStream, hcClient);
    }

    /**
     * 关闭超额采集开关
     * 该接口用于将超额采集日志功能关闭。
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return DisableLogCollectionResponse
     */
    public DisableLogCollectionResponse disableLogCollection(DisableLogCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.disableLogCollection);
    }

    /**
     * 关闭超额采集开关
     * 该接口用于将超额采集日志功能关闭。
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>
     */
    public SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollectionInvoker(DisableLogCollectionRequest request) {
        return new SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>(request, LtsMeta.disableLogCollection, hcClient);
    }

    /**
     * 打开超额采集开关
     * 该接口用于将超额采集日志功能打开。
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return EnableLogCollectionResponse
     */
    public EnableLogCollectionResponse enableLogCollection(EnableLogCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.enableLogCollection);
    }

    /**
     * 打开超额采集开关
     * 该接口用于将超额采集日志功能打开。
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>
     */
    public SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollectionInvoker(EnableLogCollectionRequest request) {
        return new SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>(request, LtsMeta.enableLogCollection, hcClient);
    }

    /**
     * 查询账号下所有日志组
     * 该接口用于查询账号下所有日志组。
     *
     * @param ListLogGroupsRequest 请求对象
     * @return ListLogGroupsResponse
     */
    public ListLogGroupsResponse listLogGroups(ListLogGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogGroups);
    }

    /**
     * 查询账号下所有日志组
     * 该接口用于查询账号下所有日志组。
     *
     * @param ListLogGroupsRequest 请求对象
     * @return SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>
     */
    public SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroupsInvoker(ListLogGroupsRequest request) {
        return new SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>(request, LtsMeta.listLogGroups, hcClient);
    }

    /**
     * 查询指定日志组下的所有日志流
     * 该接口用于查询指定日志组下的所有日志流信息。
     *
     * @param ListLogStreamRequest 请求对象
     * @return ListLogStreamResponse
     */
    public ListLogStreamResponse listLogStream(ListLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogStream);
    }

    /**
     * 查询指定日志组下的所有日志流
     * 该接口用于查询指定日志组下的所有日志流信息。
     *
     * @param ListLogStreamRequest 请求对象
     * @return SyncInvoker<ListLogStreamRequest, ListLogStreamResponse>
     */
    public SyncInvoker<ListLogStreamRequest, ListLogStreamResponse> listLogStreamInvoker(ListLogStreamRequest request) {
        return new SyncInvoker<ListLogStreamRequest, ListLogStreamResponse>(request, LtsMeta.listLogStream, hcClient);
    }

    /**
     * 查询日志
     * 该接口用于查询指定日志流下的日志内容。
     *
     * @param ListLogsRequest 请求对象
     * @return ListLogsResponse
     */
    public ListLogsResponse listLogs(ListLogsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogs);
    }

    /**
     * 查询日志
     * 该接口用于查询指定日志流下的日志内容。
     *
     * @param ListLogsRequest 请求对象
     * @return SyncInvoker<ListLogsRequest, ListLogsResponse>
     */
    public SyncInvoker<ListLogsRequest, ListLogsResponse> listLogsInvoker(ListLogsRequest request) {
        return new SyncInvoker<ListLogsRequest, ListLogsResponse>(request, LtsMeta.listLogs, hcClient);
    }

    /**
     * 查询结构化日志
     * 该接口用于查询指定日志流下的结构化日志内容。
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return ListQueryStructuredLogsResponse
     */
    public ListQueryStructuredLogsResponse listQueryStructuredLogs(ListQueryStructuredLogsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listQueryStructuredLogs);
    }

    /**
     * 查询结构化日志
     * 该接口用于查询指定日志流下的结构化日志内容。
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>
     */
    public SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogsInvoker(ListQueryStructuredLogsRequest request) {
        return new SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>(request, LtsMeta.listQueryStructuredLogs, hcClient);
    }

    /**
     * 查询结构化日志（新版）
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return ListStructuredLogsWithTimeRangeResponse
     */
    public ListStructuredLogsWithTimeRangeResponse listStructuredLogsWithTimeRange(ListStructuredLogsWithTimeRangeRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listStructuredLogsWithTimeRange);
    }

    /**
     * 查询结构化日志（新版）
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>
     */
    public SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeInvoker(ListStructuredLogsWithTimeRangeRequest request) {
        return new SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>(request, LtsMeta.listStructuredLogsWithTimeRange, hcClient);
    }

    /**
     * 修改日志组
     * 该接口用于修改指定日志组下的日志存储时长。
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return UpdateLogGroupResponse
     */
    public UpdateLogGroupResponse updateLogGroup(UpdateLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateLogGroup);
    }

    /**
     * 修改日志组
     * 该接口用于修改指定日志组下的日志存储时长。
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>
     */
    public SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroupInvoker(UpdateLogGroupRequest request) {
        return new SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>(request, LtsMeta.updateLogGroup, hcClient);
    }

}