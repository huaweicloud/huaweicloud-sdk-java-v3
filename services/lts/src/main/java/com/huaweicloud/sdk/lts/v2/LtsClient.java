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

    /** 创建日志接入 创建日志接入
     *
     * @param CreateAccessConfigRequest 请求对象
     * @return CreateAccessConfigResponse */
    public CreateAccessConfigResponse createAccessConfig(CreateAccessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createAccessConfig);
    }

    /** 创建日志接入 创建日志接入
     *
     * @param CreateAccessConfigRequest 请求对象
     * @return SyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse> */
    public SyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse> createAccessConfigInvoker(
        CreateAccessConfigRequest request) {
        return new SyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse>(request,
            LtsMeta.createAccessConfig, hcClient);
    }

    /** 创建主机组 创建主机组
     *
     * @param CreateHostGroupRequest 请求对象
     * @return CreateHostGroupResponse */
    public CreateHostGroupResponse createHostGroup(CreateHostGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createHostGroup);
    }

    /** 创建主机组 创建主机组
     *
     * @param CreateHostGroupRequest 请求对象
     * @return SyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse> */
    public SyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse> createHostGroupInvoker(
        CreateHostGroupRequest request) {
        return new SyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse>(request, LtsMeta.createHostGroup,
            hcClient);
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

    /** 创建日志转储（旧版） 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return CreateLogDumpObsResponse */
    public CreateLogDumpObsResponse createLogDumpObs(CreateLogDumpObsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogDumpObs);
    }

    /** 创建日志转储（旧版） 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
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

    /** 创建消息模板 该接口用于创建通知模板，目前每个帐户最多可以创建共100个通知模板，创建后名称不可修改。
     *
     * @param CreateNotificationTemplateRequest 请求对象
     * @return CreateNotificationTemplateResponse */
    public CreateNotificationTemplateResponse createNotificationTemplate(CreateNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createNotificationTemplate);
    }

    /** 创建消息模板 该接口用于创建通知模板，目前每个帐户最多可以创建共100个通知模板，创建后名称不可修改。
     *
     * @param CreateNotificationTemplateRequest 请求对象
     * @return SyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> */
    public SyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> createNotificationTemplateInvoker(
        CreateNotificationTemplateRequest request) {
        return new SyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse>(request,
            LtsMeta.createNotificationTemplate, hcClient);
    }

    /** 通过结构化模板创建结构化配置（新） 该接口通过结构化模板创建结构化配置。
     *
     * @param CreateStructConfigRequest 请求对象
     * @return CreateStructConfigResponse */
    public CreateStructConfigResponse createStructConfig(CreateStructConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createStructConfig);
    }

    /** 通过结构化模板创建结构化配置（新） 该接口通过结构化模板创建结构化配置。
     *
     * @param CreateStructConfigRequest 请求对象
     * @return SyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse> */
    public SyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse> createStructConfigInvoker(
        CreateStructConfigRequest request) {
        return new SyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse>(request,
            LtsMeta.createStructConfig, hcClient);
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

    /** 创建日志转储（新版） 该接口用于创建OBS转储，DIS转储，DMS转储。
     *
     * @param CreateTransferRequest 请求对象
     * @return CreateTransferResponse */
    public CreateTransferResponse createTransfer(CreateTransferRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createTransfer);
    }

    /** 创建日志转储（新版） 该接口用于创建OBS转储，DIS转储，DMS转储。
     *
     * @param CreateTransferRequest 请求对象
     * @return SyncInvoker<CreateTransferRequest, CreateTransferResponse> */
    public SyncInvoker<CreateTransferRequest, CreateTransferResponse> createTransferInvoker(
        CreateTransferRequest request) {
        return new SyncInvoker<CreateTransferRequest, CreateTransferResponse>(request, LtsMeta.createTransfer,
            hcClient);
    }

    /** 删除日志接入 删除日志接入
     *
     * @param DeleteAccessConfigRequest 请求对象
     * @return DeleteAccessConfigResponse */
    public DeleteAccessConfigResponse deleteAccessConfig(DeleteAccessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteAccessConfig);
    }

    /** 删除日志接入 删除日志接入
     *
     * @param DeleteAccessConfigRequest 请求对象
     * @return SyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse> */
    public SyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse> deleteAccessConfigInvoker(
        DeleteAccessConfigRequest request) {
        return new SyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse>(request,
            LtsMeta.deleteAccessConfig, hcClient);
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

    /** 删除主机组 删除主机组
     *
     * @param DeleteHostGroupRequest 请求对象
     * @return DeleteHostGroupResponse */
    public DeleteHostGroupResponse deleteHostGroup(DeleteHostGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteHostGroup);
    }

    /** 删除主机组 删除主机组
     *
     * @param DeleteHostGroupRequest 请求对象
     * @return SyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse> */
    public SyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse> deleteHostGroupInvoker(
        DeleteHostGroupRequest request) {
        return new SyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse>(request, LtsMeta.deleteHostGroup,
            hcClient);
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

    /** 删除消息模板 该接口用于删除通知模板。
     *
     * @param DeleteNotificationTemplateRequest 请求对象
     * @return DeleteNotificationTemplateResponse */
    public DeleteNotificationTemplateResponse deleteNotificationTemplate(DeleteNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteNotificationTemplate);
    }

    /** 删除消息模板 该接口用于删除通知模板。
     *
     * @param DeleteNotificationTemplateRequest 请求对象
     * @return SyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> */
    public SyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> deleteNotificationTemplateInvoker(
        DeleteNotificationTemplateRequest request) {
        return new SyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse>(request,
            LtsMeta.deleteNotificationTemplate, hcClient);
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

    /** 删除日志转储 该接口用于删除OBS转储，DIS转储，DMS转储。
     *
     * @param DeleteTransferRequest 请求对象
     * @return DeleteTransferResponse */
    public DeleteTransferResponse deleteTransfer(DeleteTransferRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteTransfer);
    }

    /** 删除日志转储 该接口用于删除OBS转储，DIS转储，DMS转储。
     *
     * @param DeleteTransferRequest 请求对象
     * @return SyncInvoker<DeleteTransferRequest, DeleteTransferResponse> */
    public SyncInvoker<DeleteTransferRequest, DeleteTransferResponse> deleteTransferInvoker(
        DeleteTransferRequest request) {
        return new SyncInvoker<DeleteTransferRequest, DeleteTransferResponse>(request, LtsMeta.deleteTransfer,
            hcClient);
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

    /** 查询日志接入 查询日志接入列表
     *
     * @param ListAccessConfigRequest 请求对象
     * @return ListAccessConfigResponse */
    public ListAccessConfigResponse listAccessConfig(ListAccessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listAccessConfig);
    }

    /** 查询日志接入 查询日志接入列表
     *
     * @param ListAccessConfigRequest 请求对象
     * @return SyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse> */
    public SyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse> listAccessConfigInvoker(
        ListAccessConfigRequest request) {
        return new SyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse>(request, LtsMeta.listAccessConfig,
            hcClient);
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

    /** 查询结构化模板简略列表 该接口用于查询结构化模板简略列表。
     *
     * @param ListBreifStructTemplateRequest 请求对象
     * @return ListBreifStructTemplateResponse */
    public ListBreifStructTemplateResponse listBreifStructTemplate(ListBreifStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listBreifStructTemplate);
    }

    /** 查询结构化模板简略列表 该接口用于查询结构化模板简略列表。
     *
     * @param ListBreifStructTemplateRequest 请求对象
     * @return SyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> */
    public SyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> listBreifStructTemplateInvoker(
        ListBreifStructTemplateRequest request) {
        return new SyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse>(request,
            LtsMeta.listBreifStructTemplate, hcClient);
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

    /** 查询主机信息 查询主机列表
     *
     * @param ListHostRequest 请求对象
     * @return ListHostResponse */
    public ListHostResponse listHost(ListHostRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listHost);
    }

    /** 查询主机信息 查询主机列表
     *
     * @param ListHostRequest 请求对象
     * @return SyncInvoker<ListHostRequest, ListHostResponse> */
    public SyncInvoker<ListHostRequest, ListHostResponse> listHostInvoker(ListHostRequest request) {
        return new SyncInvoker<ListHostRequest, ListHostResponse>(request, LtsMeta.listHost, hcClient);
    }

    /** 查询主机组 查询主机组列表
     *
     * @param ListHostGroupRequest 请求对象
     * @return ListHostGroupResponse */
    public ListHostGroupResponse listHostGroup(ListHostGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listHostGroup);
    }

    /** 查询主机组 查询主机组列表
     *
     * @param ListHostGroupRequest 请求对象
     * @return SyncInvoker<ListHostGroupRequest, ListHostGroupResponse> */
    public SyncInvoker<ListHostGroupRequest, ListHostGroupResponse> listHostGroupInvoker(ListHostGroupRequest request) {
        return new SyncInvoker<ListHostGroupRequest, ListHostGroupResponse>(request, LtsMeta.listHostGroup, hcClient);
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

    /** 查询日志直方图 查询关键词搜索条数
     *
     * @param ListLogHistogramRequest 请求对象
     * @return ListLogHistogramResponse */
    public ListLogHistogramResponse listLogHistogram(ListLogHistogramRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogHistogram);
    }

    /** 查询日志直方图 查询关键词搜索条数
     *
     * @param ListLogHistogramRequest 请求对象
     * @return SyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse> */
    public SyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse> listLogHistogramInvoker(
        ListLogHistogramRequest request) {
        return new SyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse>(request, LtsMeta.listLogHistogram,
            hcClient);
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

    /** 查询日志流信息 该接口用于查询LTS日志流信息。
     *
     * @param ListLogStreamsRequest 请求对象
     * @return ListLogStreamsResponse */
    public ListLogStreamsResponse listLogStreams(ListLogStreamsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogStreams);
    }

    /** 查询日志流信息 该接口用于查询LTS日志流信息。
     *
     * @param ListLogStreamsRequest 请求对象
     * @return SyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse> */
    public SyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse> listLogStreamsInvoker(
        ListLogStreamsRequest request) {
        return new SyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse>(request, LtsMeta.listLogStreams,
            hcClient);
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

    /** 预览消息模板邮件格式 该接口用于预览通知模板邮件格式
     *
     * @param ListNotificationTemplateRequest 请求对象
     * @return ListNotificationTemplateResponse */
    public ListNotificationTemplateResponse listNotificationTemplate(ListNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listNotificationTemplate);
    }

    /** 预览消息模板邮件格式 该接口用于预览通知模板邮件格式
     *
     * @param ListNotificationTemplateRequest 请求对象
     * @return SyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse> */
    public SyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse> listNotificationTemplateInvoker(
        ListNotificationTemplateRequest request) {
        return new SyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse>(request,
            LtsMeta.listNotificationTemplate, hcClient);
    }

    /** 查询消息模板 该接口用于查询通知模板。
     *
     * @param ListNotificationTemplatesRequest 请求对象
     * @return ListNotificationTemplatesResponse */
    public ListNotificationTemplatesResponse listNotificationTemplates(ListNotificationTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listNotificationTemplates);
    }

    /** 查询消息模板 该接口用于查询通知模板。
     *
     * @param ListNotificationTemplatesRequest 请求对象
     * @return SyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> */
    public SyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> listNotificationTemplatesInvoker(
        ListNotificationTemplatesRequest request) {
        return new SyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse>(request,
            LtsMeta.listNotificationTemplates, hcClient);
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

    /** 查询结构化模板 该接口用于查询结构化模板。
     *
     * @param ListStructTemplateRequest 请求对象
     * @return ListStructTemplateResponse */
    public ListStructTemplateResponse listStructTemplate(ListStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listStructTemplate);
    }

    /** 查询结构化模板 该接口用于查询结构化模板。
     *
     * @param ListStructTemplateRequest 请求对象
     * @return SyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse> */
    public SyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse> listStructTemplateInvoker(
        ListStructTemplateRequest request) {
        return new SyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse>(request,
            LtsMeta.listStructTemplate, hcClient);
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

    /** 查询日志转储 该接口用于查询OBS转储，DIS转储，DMS转储配置。
     *
     * @param ListTransfersRequest 请求对象
     * @return ListTransfersResponse */
    public ListTransfersResponse listTransfers(ListTransfersRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listTransfers);
    }

    /** 查询日志转储 该接口用于查询OBS转储，DIS转储，DMS转储配置。
     *
     * @param ListTransfersRequest 请求对象
     * @return SyncInvoker<ListTransfersRequest, ListTransfersResponse> */
    public SyncInvoker<ListTransfersRequest, ListTransfersResponse> listTransfersInvoker(ListTransfersRequest request) {
        return new SyncInvoker<ListTransfersRequest, ListTransfersResponse>(request, LtsMeta.listTransfers, hcClient);
    }

    /** 注册DMS kafka实例 该接口用于注册DMS kafka实例。
     *
     * @param RegisterDmsKafkaInstanceRequest 请求对象
     * @return RegisterDmsKafkaInstanceResponse */
    public RegisterDmsKafkaInstanceResponse registerDmsKafkaInstance(RegisterDmsKafkaInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.registerDmsKafkaInstance);
    }

    /** 注册DMS kafka实例 该接口用于注册DMS kafka实例。
     *
     * @param RegisterDmsKafkaInstanceRequest 请求对象
     * @return SyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> */
    public SyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> registerDmsKafkaInstanceInvoker(
        RegisterDmsKafkaInstanceRequest request) {
        return new SyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse>(request,
            LtsMeta.registerDmsKafkaInstance, hcClient);
    }

    /** 查询单个消息模板 该接口用于查询单个通知模板
     *
     * @param ShowNotificationTemplateRequest 请求对象
     * @return ShowNotificationTemplateResponse */
    public ShowNotificationTemplateResponse showNotificationTemplate(ShowNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showNotificationTemplate);
    }

    /** 查询单个消息模板 该接口用于查询单个通知模板
     *
     * @param ShowNotificationTemplateRequest 请求对象
     * @return SyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> */
    public SyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> showNotificationTemplateInvoker(
        ShowNotificationTemplateRequest request) {
        return new SyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse>(request,
            LtsMeta.showNotificationTemplate, hcClient);
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

    /** 修改日志接入 修改日志接入
     *
     * @param UpdateAccessConfigRequest 请求对象
     * @return UpdateAccessConfigResponse */
    public UpdateAccessConfigResponse updateAccessConfig(UpdateAccessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateAccessConfig);
    }

    /** 修改日志接入 修改日志接入
     *
     * @param UpdateAccessConfigRequest 请求对象
     * @return SyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse> */
    public SyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse> updateAccessConfigInvoker(
        UpdateAccessConfigRequest request) {
        return new SyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse>(request,
            LtsMeta.updateAccessConfig, hcClient);
    }

    /** 修改主机组 修改主机组
     *
     * @param UpdateHostGroupRequest 请求对象
     * @return UpdateHostGroupResponse */
    public UpdateHostGroupResponse updateHostGroup(UpdateHostGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateHostGroup);
    }

    /** 修改主机组 修改主机组
     *
     * @param UpdateHostGroupRequest 请求对象
     * @return SyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse> */
    public SyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse> updateHostGroupInvoker(
        UpdateHostGroupRequest request) {
        return new SyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse>(request, LtsMeta.updateHostGroup,
            hcClient);
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

    /** 修改消息模板 该接口用于修改通知模板,根据名称进行修改。
     *
     * @param UpdateNotificationTemplateRequest 请求对象
     * @return UpdateNotificationTemplateResponse */
    public UpdateNotificationTemplateResponse updateNotificationTemplate(UpdateNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateNotificationTemplate);
    }

    /** 修改消息模板 该接口用于修改通知模板,根据名称进行修改。
     *
     * @param UpdateNotificationTemplateRequest 请求对象
     * @return SyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> */
    public SyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> updateNotificationTemplateInvoker(
        UpdateNotificationTemplateRequest request) {
        return new SyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse>(request,
            LtsMeta.updateNotificationTemplate, hcClient);
    }

    /** 通过结构化模板修改结构化配置（新） 该接口通过结构化模板修改结构化配置
     *
     * @param UpdateStructConfigRequest 请求对象
     * @return UpdateStructConfigResponse */
    public UpdateStructConfigResponse updateStructConfig(UpdateStructConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateStructConfig);
    }

    /** 通过结构化模板修改结构化配置（新） 该接口通过结构化模板修改结构化配置
     *
     * @param UpdateStructConfigRequest 请求对象
     * @return SyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse> */
    public SyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse> updateStructConfigInvoker(
        UpdateStructConfigRequest request) {
        return new SyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse>(request,
            LtsMeta.updateStructConfig, hcClient);
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

    /** 更新日志转储 该接口用于更新OBS转储，DIS转储，DMS转储。
     *
     * @param UpdateTransferRequest 请求对象
     * @return UpdateTransferResponse */
    public UpdateTransferResponse updateTransfer(UpdateTransferRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateTransfer);
    }

    /** 更新日志转储 该接口用于更新OBS转储，DIS转储，DMS转储。
     *
     * @param UpdateTransferRequest 请求对象
     * @return SyncInvoker<UpdateTransferRequest, UpdateTransferResponse> */
    public SyncInvoker<UpdateTransferRequest, UpdateTransferResponse> updateTransferInvoker(
        UpdateTransferRequest request) {
        return new SyncInvoker<UpdateTransferRequest, UpdateTransferResponse>(request, LtsMeta.updateTransfer,
            hcClient);
    }

    /** 创建接入规则 该接口用于创建aom日志接入lts规则
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return CreateAomMappingRulesResponse */
    public CreateAomMappingRulesResponse createAomMappingRules(CreateAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createAomMappingRules);
    }

    /** 创建接入规则 该接口用于创建aom日志接入lts规则
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

    /** 查询单个接入规则 该接口用于查询单个aom日志接入lts
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return ShowAomMappingRuleResponse */
    public ShowAomMappingRuleResponse showAomMappingRule(ShowAomMappingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showAomMappingRule);
    }

    /** 查询单个接入规则 该接口用于查询单个aom日志接入lts
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> */
    public SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRuleInvoker(
        ShowAomMappingRuleRequest request) {
        return new SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse>(request,
            LtsMeta.showAomMappingRule, hcClient);
    }

    /** 查询所有接入规则 该接口用于查询aom日志所有接入lts规则
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return ShowAomMappingRulesResponse */
    public ShowAomMappingRulesResponse showAomMappingRules(ShowAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showAomMappingRules);
    }

    /** 查询所有接入规则 该接口用于查询aom日志所有接入lts规则
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

    /** 切换告警规则状态 改变告警规则状态
     *
     * @param UpdateAlarmRuleStatusRequest 请求对象
     * @return UpdateAlarmRuleStatusResponse */
    public UpdateAlarmRuleStatusResponse updateAlarmRuleStatus(UpdateAlarmRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateAlarmRuleStatus);
    }

    /** 切换告警规则状态 改变告警规则状态
     *
     * @param UpdateAlarmRuleStatusRequest 请求对象
     * @return SyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> */
    public SyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> updateAlarmRuleStatusInvoker(
        UpdateAlarmRuleStatusRequest request) {
        return new SyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse>(request,
            LtsMeta.updateAlarmRuleStatus, hcClient);
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
