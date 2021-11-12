package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.lts.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class LtsAsyncClient {

    protected HcClient hcClient;

    public LtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LtsAsyncClient> newBuilder() {
        return new ClientBuilder<>(LtsAsyncClient::new);
    }

    /** 创建关键词告警规则 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     *
     * @param CreateKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<CreateKeywordsAlarmRuleResponse> */
    public CompletableFuture<CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRuleAsync(
        CreateKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createKeywordsAlarmRule);
    }

    /** 创建关键词告警规则 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     *
     * @param CreateKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> */
    public AsyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRuleAsyncInvoker(
        CreateKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse>(request,
            LtsMeta.createKeywordsAlarmRule, hcClient);
    }

    /** 日志转储 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return CompletableFuture<CreateLogDumpObsResponse> */
    public CompletableFuture<CreateLogDumpObsResponse> createLogDumpObsAsync(CreateLogDumpObsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogDumpObs);
    }

    /** 日志转储 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> */
    public AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObsAsyncInvoker(
        CreateLogDumpObsRequest request) {
        return new AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>(request, LtsMeta.createLogDumpObs,
            hcClient);
    }

    /** 创建日志组 该接口用于创建一个日志组
     *
     * @param CreateLogGroupRequest 请求对象
     * @return CompletableFuture<CreateLogGroupResponse> */
    public CompletableFuture<CreateLogGroupResponse> createLogGroupAsync(CreateLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogGroup);
    }

    /** 创建日志组 该接口用于创建一个日志组
     *
     * @param CreateLogGroupRequest 请求对象
     * @return AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> */
    public AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroupAsyncInvoker(
        CreateLogGroupRequest request) {
        return new AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>(request, LtsMeta.createLogGroup,
            hcClient);
    }

    /** 创建日志流 该接口用于创建某个指定日志组下的日志流
     *
     * @param CreateLogStreamRequest 请求对象
     * @return CompletableFuture<CreateLogStreamResponse> */
    public CompletableFuture<CreateLogStreamResponse> createLogStreamAsync(CreateLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogStream);
    }

    /** 创建日志流 该接口用于创建某个指定日志组下的日志流
     *
     * @param CreateLogStreamRequest 请求对象
     * @return AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> */
    public AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> createLogStreamAsyncInvoker(
        CreateLogStreamRequest request) {
        return new AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>(request, LtsMeta.createLogStream,
            hcClient);
    }

    /** 创建结构化配置 该接口用于创建指定日志流下的结构化配置。
     *
     * @param CreateStructTemplateRequest 请求对象
     * @return CompletableFuture<CreateStructTemplateResponse> */
    public CompletableFuture<CreateStructTemplateResponse> createStructTemplateAsync(
        CreateStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createStructTemplate);
    }

    /** 创建结构化配置 该接口用于创建指定日志流下的结构化配置。
     *
     * @param CreateStructTemplateRequest 请求对象
     * @return AsyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse> */
    public AsyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse> createStructTemplateAsyncInvoker(
        CreateStructTemplateRequest request) {
        return new AsyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse>(request,
            LtsMeta.createStructTemplate, hcClient);
    }

    /** 删除活动告警 该接口用于删除活动告警
     *
     * @param DeleteActiveAlarmsRequest 请求对象
     * @return CompletableFuture<DeleteActiveAlarmsResponse> */
    public CompletableFuture<DeleteActiveAlarmsResponse> deleteActiveAlarmsAsync(DeleteActiveAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteActiveAlarms);
    }

    /** 删除活动告警 该接口用于删除活动告警
     *
     * @param DeleteActiveAlarmsRequest 请求对象
     * @return AsyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> */
    public AsyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> deleteActiveAlarmsAsyncInvoker(
        DeleteActiveAlarmsRequest request) {
        return new AsyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse>(request,
            LtsMeta.deleteActiveAlarms, hcClient);
    }

    /** 删除关键词告警规则 该接口用于删除关键词告警。
     *
     * @param DeleteKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteKeywordsAlarmRuleResponse> */
    public CompletableFuture<DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRuleAsync(
        DeleteKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteKeywordsAlarmRule);
    }

    /** 删除关键词告警规则 该接口用于删除关键词告警。
     *
     * @param DeleteKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> */
    public AsyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRuleAsyncInvoker(
        DeleteKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse>(request,
            LtsMeta.deleteKeywordsAlarmRule, hcClient);
    }

    /** 删除日志组 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return CompletableFuture<DeleteLogGroupResponse> */
    public CompletableFuture<DeleteLogGroupResponse> deleteLogGroupAsync(DeleteLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteLogGroup);
    }

    /** 删除日志组 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> */
    public AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroupAsyncInvoker(
        DeleteLogGroupRequest request) {
        return new AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>(request, LtsMeta.deleteLogGroup,
            hcClient);
    }

    /** 删除日志流 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return CompletableFuture<DeleteLogStreamResponse> */
    public CompletableFuture<DeleteLogStreamResponse> deleteLogStreamAsync(DeleteLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteLogStream);
    }

    /** 删除日志流 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> */
    public AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStreamAsyncInvoker(
        DeleteLogStreamRequest request) {
        return new AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>(request, LtsMeta.deleteLogStream,
            hcClient);
    }

    /** 删除结构化配置 该接口用于删除指定日志流下的结构化配置。
     *
     * @param DeleteStructTemplateRequest 请求对象
     * @return CompletableFuture<DeleteStructTemplateResponse> */
    public CompletableFuture<DeleteStructTemplateResponse> deleteStructTemplateAsync(
        DeleteStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteStructTemplate);
    }

    /** 删除结构化配置 该接口用于删除指定日志流下的结构化配置。
     *
     * @param DeleteStructTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse> */
    public AsyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse> deleteStructTemplateAsyncInvoker(
        DeleteStructTemplateRequest request) {
        return new AsyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse>(request,
            LtsMeta.deleteStructTemplate, hcClient);
    }

    /** 关闭超额采集开关 该接口用于将超额采集日志功能关闭。
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return CompletableFuture<DisableLogCollectionResponse> */
    public CompletableFuture<DisableLogCollectionResponse> disableLogCollectionAsync(
        DisableLogCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.disableLogCollection);
    }

    /** 关闭超额采集开关 该接口用于将超额采集日志功能关闭。
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> */
    public AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollectionAsyncInvoker(
        DisableLogCollectionRequest request) {
        return new AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>(request,
            LtsMeta.disableLogCollection, hcClient);
    }

    /** 打开超额采集开关 该接口用于将超额采集日志功能打开。
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return CompletableFuture<EnableLogCollectionResponse> */
    public CompletableFuture<EnableLogCollectionResponse> enableLogCollectionAsync(EnableLogCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.enableLogCollection);
    }

    /** 打开超额采集开关 该接口用于将超额采集日志功能打开。
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> */
    public AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollectionAsyncInvoker(
        EnableLogCollectionRequest request) {
        return new AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>(request,
            LtsMeta.enableLogCollection, hcClient);
    }

    /** 查询活动或历史告警列表 该接口用于查询告警列表
     *
     * @param ListActiveOrHistoryAlarmsRequest 请求对象
     * @return CompletableFuture<ListActiveOrHistoryAlarmsResponse> */
    public CompletableFuture<ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarmsAsync(
        ListActiveOrHistoryAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listActiveOrHistoryAlarms);
    }

    /** 查询活动或历史告警列表 该接口用于查询告警列表
     *
     * @param ListActiveOrHistoryAlarmsRequest 请求对象
     * @return AsyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> */
    public AsyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarmsAsyncInvoker(
        ListActiveOrHistoryAlarmsRequest request) {
        return new AsyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse>(request,
            LtsMeta.listActiveOrHistoryAlarms, hcClient);
    }

    /** 查询日志流图表 该接口用于查询日志流图表
     *
     * @param ListChartsRequest 请求对象
     * @return CompletableFuture<ListChartsResponse> */
    public CompletableFuture<ListChartsResponse> listChartsAsync(ListChartsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listCharts);
    }

    /** 查询日志流图表 该接口用于查询日志流图表
     *
     * @param ListChartsRequest 请求对象
     * @return AsyncInvoker<ListChartsRequest, ListChartsResponse> */
    public AsyncInvoker<ListChartsRequest, ListChartsResponse> listChartsAsyncInvoker(ListChartsRequest request) {
        return new AsyncInvoker<ListChartsRequest, ListChartsResponse>(request, LtsMeta.listCharts, hcClient);
    }

    /** 查询关键词告警规则 该接口用于查询关键词告警。
     *
     * @param ListKeywordsAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListKeywordsAlarmRulesResponse> */
    public CompletableFuture<ListKeywordsAlarmRulesResponse> listKeywordsAlarmRulesAsync(
        ListKeywordsAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listKeywordsAlarmRules);
    }

    /** 查询关键词告警规则 该接口用于查询关键词告警。
     *
     * @param ListKeywordsAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> */
    public AsyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> listKeywordsAlarmRulesAsyncInvoker(
        ListKeywordsAlarmRulesRequest request) {
        return new AsyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse>(request,
            LtsMeta.listKeywordsAlarmRules, hcClient);
    }

    /** 查询账号下所有日志组 该接口用于查询账号下所有日志组。
     *
     * @param ListLogGroupsRequest 请求对象
     * @return CompletableFuture<ListLogGroupsResponse> */
    public CompletableFuture<ListLogGroupsResponse> listLogGroupsAsync(ListLogGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogGroups);
    }

    /** 查询账号下所有日志组 该接口用于查询账号下所有日志组。
     *
     * @param ListLogGroupsRequest 请求对象
     * @return AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> */
    public AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroupsAsyncInvoker(
        ListLogGroupsRequest request) {
        return new AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>(request, LtsMeta.listLogGroups, hcClient);
    }

    /** 查询指定日志组下的所有日志流 该接口用于查询指定日志组下的所有日志流信息。
     *
     * @param ListLogStreamRequest 请求对象
     * @return CompletableFuture<ListLogStreamResponse> */
    public CompletableFuture<ListLogStreamResponse> listLogStreamAsync(ListLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogStream);
    }

    /** 查询指定日志组下的所有日志流 该接口用于查询指定日志组下的所有日志流信息。
     *
     * @param ListLogStreamRequest 请求对象
     * @return AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse> */
    public AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse> listLogStreamAsyncInvoker(
        ListLogStreamRequest request) {
        return new AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse>(request, LtsMeta.listLogStream, hcClient);
    }

    /** 查询日志 该接口用于查询指定日志流下的日志内容。
     *
     * @param ListLogsRequest 请求对象
     * @return CompletableFuture<ListLogsResponse> */
    public CompletableFuture<ListLogsResponse> listLogsAsync(ListLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogs);
    }

    /** 查询日志 该接口用于查询指定日志流下的日志内容。
     *
     * @param ListLogsRequest 请求对象
     * @return AsyncInvoker<ListLogsRequest, ListLogsResponse> */
    public AsyncInvoker<ListLogsRequest, ListLogsResponse> listLogsAsyncInvoker(ListLogsRequest request) {
        return new AsyncInvoker<ListLogsRequest, ListLogsResponse>(request, LtsMeta.listLogs, hcClient);
    }

    /** 查询SMN主题 该接口用于查询SMN主题
     *
     * @param ListNotificationTopicsRequest 请求对象
     * @return CompletableFuture<ListNotificationTopicsResponse> */
    public CompletableFuture<ListNotificationTopicsResponse> listNotificationTopicsAsync(
        ListNotificationTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listNotificationTopics);
    }

    /** 查询SMN主题 该接口用于查询SMN主题
     *
     * @param ListNotificationTopicsRequest 请求对象
     * @return AsyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse> */
    public AsyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse> listNotificationTopicsAsyncInvoker(
        ListNotificationTopicsRequest request) {
        return new AsyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse>(request,
            LtsMeta.listNotificationTopics, hcClient);
    }

    /** 查询结构化日志 该接口用于查询指定日志流下的结构化日志内容。
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return CompletableFuture<ListQueryStructuredLogsResponse> */
    public CompletableFuture<ListQueryStructuredLogsResponse> listQueryStructuredLogsAsync(
        ListQueryStructuredLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listQueryStructuredLogs);
    }

    /** 查询结构化日志 该接口用于查询指定日志流下的结构化日志内容。
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return AsyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> */
    public AsyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogsAsyncInvoker(
        ListQueryStructuredLogsRequest request) {
        return new AsyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>(request,
            LtsMeta.listQueryStructuredLogs, hcClient);
    }

    /** 查询结构化日志（新版） 该接口用于查询指定日志流下的结构化日志内容（新版）。
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return CompletableFuture<ListStructuredLogsWithTimeRangeResponse> */
    public CompletableFuture<ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeAsync(
        ListStructuredLogsWithTimeRangeRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listStructuredLogsWithTimeRange);
    }

    /** 查询结构化日志（新版） 该接口用于查询指定日志流下的结构化日志内容（新版）。
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return AsyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> */
    public AsyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeAsyncInvoker(
        ListStructuredLogsWithTimeRangeRequest request) {
        return new AsyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>(
            request, LtsMeta.listStructuredLogsWithTimeRange, hcClient);
    }

    /** 查询结构化配置 该接口用于查询指定日志流下的结构化配置内容。
     *
     * @param ShowStructTemplateRequest 请求对象
     * @return CompletableFuture<ShowStructTemplateResponse> */
    public CompletableFuture<ShowStructTemplateResponse> showStructTemplateAsync(ShowStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showStructTemplate);
    }

    /** 查询结构化配置 该接口用于查询指定日志流下的结构化配置内容。
     *
     * @param ShowStructTemplateRequest 请求对象
     * @return AsyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse> */
    public AsyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse> showStructTemplateAsyncInvoker(
        ShowStructTemplateRequest request) {
        return new AsyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse>(request,
            LtsMeta.showStructTemplate, hcClient);
    }

    /** 修改关键词告警规则 该接口用于修改关键词告警。
     *
     * @param UpdateKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<UpdateKeywordsAlarmRuleResponse> */
    public CompletableFuture<UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRuleAsync(
        UpdateKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateKeywordsAlarmRule);
    }

    /** 修改关键词告警规则 该接口用于修改关键词告警。
     *
     * @param UpdateKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> */
    public AsyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRuleAsyncInvoker(
        UpdateKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse>(request,
            LtsMeta.updateKeywordsAlarmRule, hcClient);
    }

    /** 修改日志组 该接口用于修改指定日志组下的日志存储时长。
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return CompletableFuture<UpdateLogGroupResponse> */
    public CompletableFuture<UpdateLogGroupResponse> updateLogGroupAsync(UpdateLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogGroup);
    }

    /** 修改日志组 该接口用于修改指定日志组下的日志存储时长。
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> */
    public AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroupAsyncInvoker(
        UpdateLogGroupRequest request) {
        return new AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>(request, LtsMeta.updateLogGroup,
            hcClient);
    }

    /** 修改结构化配置 该接口用于修改指定日志流下的结构化配置。
     *
     * @param UpdateStructTemplateRequest 请求对象
     * @return CompletableFuture<UpdateStructTemplateResponse> */
    public CompletableFuture<UpdateStructTemplateResponse> updateStructTemplateAsync(
        UpdateStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateStructTemplate);
    }

    /** 修改结构化配置 该接口用于修改指定日志流下的结构化配置。
     *
     * @param UpdateStructTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse> */
    public AsyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse> updateStructTemplateAsyncInvoker(
        UpdateStructTemplateRequest request) {
        return new AsyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse>(request,
            LtsMeta.updateStructTemplate, hcClient);
    }

    /** 创建日志接入lts规则 该接口用于创建aom日志接入lts规则
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return CompletableFuture<CreateAomMappingRulesResponse> */
    public CompletableFuture<CreateAomMappingRulesResponse> createAomMappingRulesAsync(
        CreateAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createAomMappingRules);
    }

    /** 创建日志接入lts规则 该接口用于创建aom日志接入lts规则
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> */
    public AsyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> createAomMappingRulesAsyncInvoker(
        CreateAomMappingRulesRequest request) {
        return new AsyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse>(request,
            LtsMeta.createAomMappingRules, hcClient);
    }

    /** 删除接入规则 该接口用于删除lts接入规则。
     *
     * @param DeleteAomMappingRulesRequest 请求对象
     * @return CompletableFuture<DeleteAomMappingRulesResponse> */
    public CompletableFuture<DeleteAomMappingRulesResponse> deleteAomMappingRulesAsync(
        DeleteAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteAomMappingRules);
    }

    /** 删除接入规则 该接口用于删除lts接入规则。
     *
     * @param DeleteAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> */
    public AsyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> deleteAomMappingRulesAsyncInvoker(
        DeleteAomMappingRulesRequest request) {
        return new AsyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse>(request,
            LtsMeta.deleteAomMappingRules, hcClient);
    }

    /** 查询接入规则 该接口用于查询单个aom日志接入lts
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return CompletableFuture<ShowAomMappingRuleResponse> */
    public CompletableFuture<ShowAomMappingRuleResponse> showAomMappingRuleAsync(ShowAomMappingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showAomMappingRule);
    }

    /** 查询接入规则 该接口用于查询单个aom日志接入lts
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return AsyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> */
    public AsyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRuleAsyncInvoker(
        ShowAomMappingRuleRequest request) {
        return new AsyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse>(request,
            LtsMeta.showAomMappingRule, hcClient);
    }

    /** 查询接入规则 该接口用于查询aom日志所有接入lts规则
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return CompletableFuture<ShowAomMappingRulesResponse> */
    public CompletableFuture<ShowAomMappingRulesResponse> showAomMappingRulesAsync(ShowAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showAomMappingRules);
    }

    /** 查询接入规则 该接口用于查询aom日志所有接入lts规则
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> */
    public AsyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> showAomMappingRulesAsyncInvoker(
        ShowAomMappingRulesRequest request) {
        return new AsyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse>(request,
            LtsMeta.showAomMappingRules, hcClient);
    }

    /** 修改接入规则 该接口用于修改接入规则
     *
     * @param UpdateAomMappingRulesRequest 请求对象
     * @return CompletableFuture<UpdateAomMappingRulesResponse> */
    public CompletableFuture<UpdateAomMappingRulesResponse> updateAomMappingRulesAsync(
        UpdateAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateAomMappingRules);
    }

    /** 修改接入规则 该接口用于修改接入规则
     *
     * @param UpdateAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> */
    public AsyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> updateAomMappingRulesAsyncInvoker(
        UpdateAomMappingRulesRequest request) {
        return new AsyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse>(request,
            LtsMeta.updateAomMappingRules, hcClient);
    }

    /** 创建SQL告警规则 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     *
     * @param CreateSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<CreateSqlAlarmRuleResponse> */
    public CompletableFuture<CreateSqlAlarmRuleResponse> createSqlAlarmRuleAsync(CreateSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createSqlAlarmRule);
    }

    /** 创建SQL告警规则 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     *
     * @param CreateSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> */
    public AsyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> createSqlAlarmRuleAsyncInvoker(
        CreateSqlAlarmRuleRequest request) {
        return new AsyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse>(request,
            LtsMeta.createSqlAlarmRule, hcClient);
    }

    /** 删除SQL告警规则 该接口用于删除SQL告警
     *
     * @param DeleteSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteSqlAlarmRuleResponse> */
    public CompletableFuture<DeleteSqlAlarmRuleResponse> deleteSqlAlarmRuleAsync(DeleteSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteSqlAlarmRule);
    }

    /** 删除SQL告警规则 该接口用于删除SQL告警
     *
     * @param DeleteSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> */
    public AsyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> deleteSqlAlarmRuleAsyncInvoker(
        DeleteSqlAlarmRuleRequest request) {
        return new AsyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse>(request,
            LtsMeta.deleteSqlAlarmRule, hcClient);
    }

    /** 查询SQL告警规则 该接口用于查询SQL告警
     *
     * @param ListSqlAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListSqlAlarmRulesResponse> */
    public CompletableFuture<ListSqlAlarmRulesResponse> listSqlAlarmRulesAsync(ListSqlAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listSqlAlarmRules);
    }

    /** 查询SQL告警规则 该接口用于查询SQL告警
     *
     * @param ListSqlAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> */
    public AsyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> listSqlAlarmRulesAsyncInvoker(
        ListSqlAlarmRulesRequest request) {
        return new AsyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse>(request, LtsMeta.listSqlAlarmRules,
            hcClient);
    }

    /** 修改SQL告警规则 该接口用于修改SQL告警
     *
     * @param UpdateSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<UpdateSqlAlarmRuleResponse> */
    public CompletableFuture<UpdateSqlAlarmRuleResponse> updateSqlAlarmRuleAsync(UpdateSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateSqlAlarmRule);
    }

    /** 修改SQL告警规则 该接口用于修改SQL告警
     *
     * @param UpdateSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> */
    public AsyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> updateSqlAlarmRuleAsyncInvoker(
        UpdateSqlAlarmRuleRequest request) {
        return new AsyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse>(request,
            LtsMeta.updateSqlAlarmRule, hcClient);
    }

}
