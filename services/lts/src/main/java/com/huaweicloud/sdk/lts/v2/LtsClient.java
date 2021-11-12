package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
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

    /** 创建关键词告警规则 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     *
     * @param CreateKeywordsAlarmRuleRequest 请求对象
     * @return CreateKeywordsAlarmRuleResponse */
    public CreateKeywordsAlarmRuleResponse createKeywordsAlarmRule(CreateKeywordsAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createKeywordsAlarmRule);
    }

    /** 创建关键词告警规则 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     *
     * @param CreateKeywordsAlarmRuleRequest 请求对象
     * @return SyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> */
    public SyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRuleInvoker(
        CreateKeywordsAlarmRuleRequest request) {
        return new SyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse>(request,
            LtsMeta.createKeywordsAlarmRule, hcClient);
    }

    /** 日志转储 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return CreateLogDumpObsResponse */
    public CreateLogDumpObsResponse createLogDumpObs(CreateLogDumpObsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogDumpObs);
    }

    /** 日志转储 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> */
    public SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObsInvoker(
        CreateLogDumpObsRequest request) {
        return new SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>(request, LtsMeta.createLogDumpObs,
            hcClient);
    }

    /** 创建日志组 该接口用于创建一个日志组
     *
     * @param CreateLogGroupRequest 请求对象
     * @return CreateLogGroupResponse */
    public CreateLogGroupResponse createLogGroup(CreateLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogGroup);
    }

    /** 创建日志组 该接口用于创建一个日志组
     *
     * @param CreateLogGroupRequest 请求对象
     * @return SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> */
    public SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroupInvoker(
        CreateLogGroupRequest request) {
        return new SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>(request, LtsMeta.createLogGroup,
            hcClient);
    }

    /** 创建日志流 该接口用于创建某个指定日志组下的日志流
     *
     * @param CreateLogStreamRequest 请求对象
     * @return CreateLogStreamResponse */
    public CreateLogStreamResponse createLogStream(CreateLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogStream);
    }

    /** 创建日志流 该接口用于创建某个指定日志组下的日志流
     *
     * @param CreateLogStreamRequest 请求对象
     * @return SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> */
    public SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> createLogStreamInvoker(
        CreateLogStreamRequest request) {
        return new SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>(request, LtsMeta.createLogStream,
            hcClient);
    }

    /** 创建结构化配置 该接口用于创建指定日志流下的结构化配置。
     *
     * @param CreateStructTemplateRequest 请求对象
     * @return CreateStructTemplateResponse */
    public CreateStructTemplateResponse createStructTemplate(CreateStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createStructTemplate);
    }

    /** 创建结构化配置 该接口用于创建指定日志流下的结构化配置。
     *
     * @param CreateStructTemplateRequest 请求对象
     * @return SyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse> */
    public SyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse> createStructTemplateInvoker(
        CreateStructTemplateRequest request) {
        return new SyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse>(request,
            LtsMeta.createStructTemplate, hcClient);
    }

    /** 删除活动告警 该接口用于删除活动告警
     *
     * @param DeleteActiveAlarmsRequest 请求对象
     * @return DeleteActiveAlarmsResponse */
    public DeleteActiveAlarmsResponse deleteActiveAlarms(DeleteActiveAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteActiveAlarms);
    }

    /** 删除活动告警 该接口用于删除活动告警
     *
     * @param DeleteActiveAlarmsRequest 请求对象
     * @return SyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> */
    public SyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> deleteActiveAlarmsInvoker(
        DeleteActiveAlarmsRequest request) {
        return new SyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse>(request,
            LtsMeta.deleteActiveAlarms, hcClient);
    }

    /** 删除关键词告警规则 该接口用于删除关键词告警。
     *
     * @param DeleteKeywordsAlarmRuleRequest 请求对象
     * @return DeleteKeywordsAlarmRuleResponse */
    public DeleteKeywordsAlarmRuleResponse deleteKeywordsAlarmRule(DeleteKeywordsAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteKeywordsAlarmRule);
    }

    /** 删除关键词告警规则 该接口用于删除关键词告警。
     *
     * @param DeleteKeywordsAlarmRuleRequest 请求对象
     * @return SyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> */
    public SyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRuleInvoker(
        DeleteKeywordsAlarmRuleRequest request) {
        return new SyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse>(request,
            LtsMeta.deleteKeywordsAlarmRule, hcClient);
    }

    /** 删除日志组 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return DeleteLogGroupResponse */
    public DeleteLogGroupResponse deleteLogGroup(DeleteLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteLogGroup);
    }

    /** 删除日志组 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> */
    public SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroupInvoker(
        DeleteLogGroupRequest request) {
        return new SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>(request, LtsMeta.deleteLogGroup,
            hcClient);
    }

    /** 删除日志流 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return DeleteLogStreamResponse */
    public DeleteLogStreamResponse deleteLogStream(DeleteLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteLogStream);
    }

    /** 删除日志流 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> */
    public SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStreamInvoker(
        DeleteLogStreamRequest request) {
        return new SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>(request, LtsMeta.deleteLogStream,
            hcClient);
    }

    /** 删除结构化配置 该接口用于删除指定日志流下的结构化配置。
     *
     * @param DeleteStructTemplateRequest 请求对象
     * @return DeleteStructTemplateResponse */
    public DeleteStructTemplateResponse deleteStructTemplate(DeleteStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteStructTemplate);
    }

    /** 删除结构化配置 该接口用于删除指定日志流下的结构化配置。
     *
     * @param DeleteStructTemplateRequest 请求对象
     * @return SyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse> */
    public SyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse> deleteStructTemplateInvoker(
        DeleteStructTemplateRequest request) {
        return new SyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse>(request,
            LtsMeta.deleteStructTemplate, hcClient);
    }

    /** 关闭超额采集开关 该接口用于将超额采集日志功能关闭。
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return DisableLogCollectionResponse */
    public DisableLogCollectionResponse disableLogCollection(DisableLogCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.disableLogCollection);
    }

    /** 关闭超额采集开关 该接口用于将超额采集日志功能关闭。
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> */
    public SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollectionInvoker(
        DisableLogCollectionRequest request) {
        return new SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>(request,
            LtsMeta.disableLogCollection, hcClient);
    }

    /** 打开超额采集开关 该接口用于将超额采集日志功能打开。
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return EnableLogCollectionResponse */
    public EnableLogCollectionResponse enableLogCollection(EnableLogCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.enableLogCollection);
    }

    /** 打开超额采集开关 该接口用于将超额采集日志功能打开。
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> */
    public SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollectionInvoker(
        EnableLogCollectionRequest request) {
        return new SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>(request,
            LtsMeta.enableLogCollection, hcClient);
    }

    /** 查询活动或历史告警列表 该接口用于查询告警列表
     *
     * @param ListActiveOrHistoryAlarmsRequest 请求对象
     * @return ListActiveOrHistoryAlarmsResponse */
    public ListActiveOrHistoryAlarmsResponse listActiveOrHistoryAlarms(ListActiveOrHistoryAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listActiveOrHistoryAlarms);
    }

    /** 查询活动或历史告警列表 该接口用于查询告警列表
     *
     * @param ListActiveOrHistoryAlarmsRequest 请求对象
     * @return SyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> */
    public SyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarmsInvoker(
        ListActiveOrHistoryAlarmsRequest request) {
        return new SyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse>(request,
            LtsMeta.listActiveOrHistoryAlarms, hcClient);
    }

    /** 查询日志流图表 该接口用于查询日志流图表
     *
     * @param ListChartsRequest 请求对象
     * @return ListChartsResponse */
    public ListChartsResponse listCharts(ListChartsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listCharts);
    }

    /** 查询日志流图表 该接口用于查询日志流图表
     *
     * @param ListChartsRequest 请求对象
     * @return SyncInvoker<ListChartsRequest, ListChartsResponse> */
    public SyncInvoker<ListChartsRequest, ListChartsResponse> listChartsInvoker(ListChartsRequest request) {
        return new SyncInvoker<ListChartsRequest, ListChartsResponse>(request, LtsMeta.listCharts, hcClient);
    }

    /** 查询关键词告警规则 该接口用于查询关键词告警。
     *
     * @param ListKeywordsAlarmRulesRequest 请求对象
     * @return ListKeywordsAlarmRulesResponse */
    public ListKeywordsAlarmRulesResponse listKeywordsAlarmRules(ListKeywordsAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listKeywordsAlarmRules);
    }

    /** 查询关键词告警规则 该接口用于查询关键词告警。
     *
     * @param ListKeywordsAlarmRulesRequest 请求对象
     * @return SyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> */
    public SyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> listKeywordsAlarmRulesInvoker(
        ListKeywordsAlarmRulesRequest request) {
        return new SyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse>(request,
            LtsMeta.listKeywordsAlarmRules, hcClient);
    }

    /** 查询账号下所有日志组 该接口用于查询账号下所有日志组。
     *
     * @param ListLogGroupsRequest 请求对象
     * @return ListLogGroupsResponse */
    public ListLogGroupsResponse listLogGroups(ListLogGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogGroups);
    }

    /** 查询账号下所有日志组 该接口用于查询账号下所有日志组。
     *
     * @param ListLogGroupsRequest 请求对象
     * @return SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> */
    public SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroupsInvoker(ListLogGroupsRequest request) {
        return new SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>(request, LtsMeta.listLogGroups, hcClient);
    }

    /** 查询指定日志组下的所有日志流 该接口用于查询指定日志组下的所有日志流信息。
     *
     * @param ListLogStreamRequest 请求对象
     * @return ListLogStreamResponse */
    public ListLogStreamResponse listLogStream(ListLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogStream);
    }

    /** 查询指定日志组下的所有日志流 该接口用于查询指定日志组下的所有日志流信息。
     *
     * @param ListLogStreamRequest 请求对象
     * @return SyncInvoker<ListLogStreamRequest, ListLogStreamResponse> */
    public SyncInvoker<ListLogStreamRequest, ListLogStreamResponse> listLogStreamInvoker(ListLogStreamRequest request) {
        return new SyncInvoker<ListLogStreamRequest, ListLogStreamResponse>(request, LtsMeta.listLogStream, hcClient);
    }

    /** 查询日志 该接口用于查询指定日志流下的日志内容。
     *
     * @param ListLogsRequest 请求对象
     * @return ListLogsResponse */
    public ListLogsResponse listLogs(ListLogsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogs);
    }

    /** 查询日志 该接口用于查询指定日志流下的日志内容。
     *
     * @param ListLogsRequest 请求对象
     * @return SyncInvoker<ListLogsRequest, ListLogsResponse> */
    public SyncInvoker<ListLogsRequest, ListLogsResponse> listLogsInvoker(ListLogsRequest request) {
        return new SyncInvoker<ListLogsRequest, ListLogsResponse>(request, LtsMeta.listLogs, hcClient);
    }

    /** 查询SMN主题 该接口用于查询SMN主题
     *
     * @param ListNotificationTopicsRequest 请求对象
     * @return ListNotificationTopicsResponse */
    public ListNotificationTopicsResponse listNotificationTopics(ListNotificationTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listNotificationTopics);
    }

    /** 查询SMN主题 该接口用于查询SMN主题
     *
     * @param ListNotificationTopicsRequest 请求对象
     * @return SyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse> */
    public SyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse> listNotificationTopicsInvoker(
        ListNotificationTopicsRequest request) {
        return new SyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse>(request,
            LtsMeta.listNotificationTopics, hcClient);
    }

    /** 查询结构化日志 该接口用于查询指定日志流下的结构化日志内容。
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return ListQueryStructuredLogsResponse */
    public ListQueryStructuredLogsResponse listQueryStructuredLogs(ListQueryStructuredLogsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listQueryStructuredLogs);
    }

    /** 查询结构化日志 该接口用于查询指定日志流下的结构化日志内容。
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> */
    public SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogsInvoker(
        ListQueryStructuredLogsRequest request) {
        return new SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>(request,
            LtsMeta.listQueryStructuredLogs, hcClient);
    }

    /** 查询结构化日志（新版） 该接口用于查询指定日志流下的结构化日志内容（新版）。
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return ListStructuredLogsWithTimeRangeResponse */
    public ListStructuredLogsWithTimeRangeResponse listStructuredLogsWithTimeRange(
        ListStructuredLogsWithTimeRangeRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listStructuredLogsWithTimeRange);
    }

    /** 查询结构化日志（新版） 该接口用于查询指定日志流下的结构化日志内容（新版）。
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> */
    public SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeInvoker(
        ListStructuredLogsWithTimeRangeRequest request) {
        return new SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>(request,
            LtsMeta.listStructuredLogsWithTimeRange, hcClient);
    }

    /** 查询结构化配置 该接口用于查询指定日志流下的结构化配置内容。
     *
     * @param ShowStructTemplateRequest 请求对象
     * @return ShowStructTemplateResponse */
    public ShowStructTemplateResponse showStructTemplate(ShowStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showStructTemplate);
    }

    /** 查询结构化配置 该接口用于查询指定日志流下的结构化配置内容。
     *
     * @param ShowStructTemplateRequest 请求对象
     * @return SyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse> */
    public SyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse> showStructTemplateInvoker(
        ShowStructTemplateRequest request) {
        return new SyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse>(request,
            LtsMeta.showStructTemplate, hcClient);
    }

    /** 修改关键词告警规则 该接口用于修改关键词告警。
     *
     * @param UpdateKeywordsAlarmRuleRequest 请求对象
     * @return UpdateKeywordsAlarmRuleResponse */
    public UpdateKeywordsAlarmRuleResponse updateKeywordsAlarmRule(UpdateKeywordsAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateKeywordsAlarmRule);
    }

    /** 修改关键词告警规则 该接口用于修改关键词告警。
     *
     * @param UpdateKeywordsAlarmRuleRequest 请求对象
     * @return SyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> */
    public SyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRuleInvoker(
        UpdateKeywordsAlarmRuleRequest request) {
        return new SyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse>(request,
            LtsMeta.updateKeywordsAlarmRule, hcClient);
    }

    /** 修改日志组 该接口用于修改指定日志组下的日志存储时长。
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return UpdateLogGroupResponse */
    public UpdateLogGroupResponse updateLogGroup(UpdateLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateLogGroup);
    }

    /** 修改日志组 该接口用于修改指定日志组下的日志存储时长。
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> */
    public SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroupInvoker(
        UpdateLogGroupRequest request) {
        return new SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>(request, LtsMeta.updateLogGroup,
            hcClient);
    }

    /** 修改结构化配置 该接口用于修改指定日志流下的结构化配置。
     *
     * @param UpdateStructTemplateRequest 请求对象
     * @return UpdateStructTemplateResponse */
    public UpdateStructTemplateResponse updateStructTemplate(UpdateStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateStructTemplate);
    }

    /** 修改结构化配置 该接口用于修改指定日志流下的结构化配置。
     *
     * @param UpdateStructTemplateRequest 请求对象
     * @return SyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse> */
    public SyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse> updateStructTemplateInvoker(
        UpdateStructTemplateRequest request) {
        return new SyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse>(request,
            LtsMeta.updateStructTemplate, hcClient);
    }

    /** 创建日志接入lts规则 该接口用于创建aom日志接入lts规则
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return CreateAomMappingRulesResponse */
    public CreateAomMappingRulesResponse createAomMappingRules(CreateAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createAomMappingRules);
    }

    /** 创建日志接入lts规则 该接口用于创建aom日志接入lts规则
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return SyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> */
    public SyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> createAomMappingRulesInvoker(
        CreateAomMappingRulesRequest request) {
        return new SyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse>(request,
            LtsMeta.createAomMappingRules, hcClient);
    }

    /** 删除接入规则 该接口用于删除lts接入规则。
     *
     * @param DeleteAomMappingRulesRequest 请求对象
     * @return DeleteAomMappingRulesResponse */
    public DeleteAomMappingRulesResponse deleteAomMappingRules(DeleteAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteAomMappingRules);
    }

    /** 删除接入规则 该接口用于删除lts接入规则。
     *
     * @param DeleteAomMappingRulesRequest 请求对象
     * @return SyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> */
    public SyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> deleteAomMappingRulesInvoker(
        DeleteAomMappingRulesRequest request) {
        return new SyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse>(request,
            LtsMeta.deleteAomMappingRules, hcClient);
    }

    /** 查询接入规则 该接口用于查询单个aom日志接入lts
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return ShowAomMappingRuleResponse */
    public ShowAomMappingRuleResponse showAomMappingRule(ShowAomMappingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showAomMappingRule);
    }

    /** 查询接入规则 该接口用于查询单个aom日志接入lts
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> */
    public SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRuleInvoker(
        ShowAomMappingRuleRequest request) {
        return new SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse>(request,
            LtsMeta.showAomMappingRule, hcClient);
    }

    /** 查询接入规则 该接口用于查询aom日志所有接入lts规则
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return ShowAomMappingRulesResponse */
    public ShowAomMappingRulesResponse showAomMappingRules(ShowAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showAomMappingRules);
    }

    /** 查询接入规则 该接口用于查询aom日志所有接入lts规则
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return SyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> */
    public SyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> showAomMappingRulesInvoker(
        ShowAomMappingRulesRequest request) {
        return new SyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse>(request,
            LtsMeta.showAomMappingRules, hcClient);
    }

    /** 修改接入规则 该接口用于修改接入规则
     *
     * @param UpdateAomMappingRulesRequest 请求对象
     * @return UpdateAomMappingRulesResponse */
    public UpdateAomMappingRulesResponse updateAomMappingRules(UpdateAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateAomMappingRules);
    }

    /** 修改接入规则 该接口用于修改接入规则
     *
     * @param UpdateAomMappingRulesRequest 请求对象
     * @return SyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> */
    public SyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> updateAomMappingRulesInvoker(
        UpdateAomMappingRulesRequest request) {
        return new SyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse>(request,
            LtsMeta.updateAomMappingRules, hcClient);
    }

    /** 创建SQL告警规则 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     *
     * @param CreateSqlAlarmRuleRequest 请求对象
     * @return CreateSqlAlarmRuleResponse */
    public CreateSqlAlarmRuleResponse createSqlAlarmRule(CreateSqlAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createSqlAlarmRule);
    }

    /** 创建SQL告警规则 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     *
     * @param CreateSqlAlarmRuleRequest 请求对象
     * @return SyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> */
    public SyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> createSqlAlarmRuleInvoker(
        CreateSqlAlarmRuleRequest request) {
        return new SyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse>(request,
            LtsMeta.createSqlAlarmRule, hcClient);
    }

    /** 删除SQL告警规则 该接口用于删除SQL告警
     *
     * @param DeleteSqlAlarmRuleRequest 请求对象
     * @return DeleteSqlAlarmRuleResponse */
    public DeleteSqlAlarmRuleResponse deleteSqlAlarmRule(DeleteSqlAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteSqlAlarmRule);
    }

    /** 删除SQL告警规则 该接口用于删除SQL告警
     *
     * @param DeleteSqlAlarmRuleRequest 请求对象
     * @return SyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> */
    public SyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> deleteSqlAlarmRuleInvoker(
        DeleteSqlAlarmRuleRequest request) {
        return new SyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse>(request,
            LtsMeta.deleteSqlAlarmRule, hcClient);
    }

    /** 查询SQL告警规则 该接口用于查询SQL告警
     *
     * @param ListSqlAlarmRulesRequest 请求对象
     * @return ListSqlAlarmRulesResponse */
    public ListSqlAlarmRulesResponse listSqlAlarmRules(ListSqlAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listSqlAlarmRules);
    }

    /** 查询SQL告警规则 该接口用于查询SQL告警
     *
     * @param ListSqlAlarmRulesRequest 请求对象
     * @return SyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> */
    public SyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> listSqlAlarmRulesInvoker(
        ListSqlAlarmRulesRequest request) {
        return new SyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse>(request, LtsMeta.listSqlAlarmRules,
            hcClient);
    }

    /** 修改SQL告警规则 该接口用于修改SQL告警
     *
     * @param UpdateSqlAlarmRuleRequest 请求对象
     * @return UpdateSqlAlarmRuleResponse */
    public UpdateSqlAlarmRuleResponse updateSqlAlarmRule(UpdateSqlAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateSqlAlarmRule);
    }

    /** 修改SQL告警规则 该接口用于修改SQL告警
     *
     * @param UpdateSqlAlarmRuleRequest 请求对象
     * @return SyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> */
    public SyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> updateSqlAlarmRuleInvoker(
        UpdateSqlAlarmRuleRequest request) {
        return new SyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse>(request,
            LtsMeta.updateSqlAlarmRule, hcClient);
    }

}
