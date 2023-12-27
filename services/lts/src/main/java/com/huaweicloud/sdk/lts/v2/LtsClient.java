package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.lts.v2.model.CreateAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateAgencyAccessRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAgencyAccessResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateDashBoardRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateDashBoardResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateDashboardGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateDashboardGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateHostGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateHostGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateKeywordsAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateKeywordsAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateLogDumpObsRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateLogDumpObsResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateLogGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateLogGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamIndexRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamIndexResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateSearchCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateSearchCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateSqlAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateSqlAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateStructConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateStructConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateTagsRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateTagsResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateTransferRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateTransferResponse;
import com.huaweicloud.sdk.lts.v2.model.CreatefavoriteRequest;
import com.huaweicloud.sdk.lts.v2.model.CreatefavoriteResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteActiveAlarmsRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteActiveAlarmsResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteDashboardRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteDashboardResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteHostGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteHostGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteKeywordsAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteKeywordsAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteLogGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteLogGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteLogStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteLogStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteSearchCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteSearchCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteSqlAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteSqlAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteTransferRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteTransferResponse;
import com.huaweicloud.sdk.lts.v2.model.DeletefavoriteRequest;
import com.huaweicloud.sdk.lts.v2.model.DeletefavoriteResponse;
import com.huaweicloud.sdk.lts.v2.model.DisableLogCollectionRequest;
import com.huaweicloud.sdk.lts.v2.model.DisableLogCollectionResponse;
import com.huaweicloud.sdk.lts.v2.model.EnableLogCollectionRequest;
import com.huaweicloud.sdk.lts.v2.model.EnableLogCollectionResponse;
import com.huaweicloud.sdk.lts.v2.model.ListAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.ListAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.ListActiveOrHistoryAlarmsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListActiveOrHistoryAlarmsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListBreifStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ListBreifStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.ListChartsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListChartsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.ListCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.ListHistorySqlRequest;
import com.huaweicloud.sdk.lts.v2.model.ListHistorySqlResponse;
import com.huaweicloud.sdk.lts.v2.model.ListHostGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.ListHostGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.ListHostRequest;
import com.huaweicloud.sdk.lts.v2.model.ListHostResponse;
import com.huaweicloud.sdk.lts.v2.model.ListKeywordsAlarmRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.ListKeywordsAlarmRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogGroupsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogGroupsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogHistogramRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogHistogramResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogStreamsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogStreamsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTemplatesRequest;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTemplatesResponse;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTopicsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTopicsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListQueryAllSearchCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.ListQueryAllSearchCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.ListQueryStructuredLogsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListQueryStructuredLogsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListSqlAlarmRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.ListSqlAlarmRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.ListStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ListStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.ListStructuredLogsWithTimeRangeRequest;
import com.huaweicloud.sdk.lts.v2.model.ListStructuredLogsWithTimeRangeResponse;
import com.huaweicloud.sdk.lts.v2.model.ListTimeLineTrafficStatisticsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListTimeLineTrafficStatisticsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListTopnTrafficStatisticsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListTopnTrafficStatisticsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListTransfersRequest;
import com.huaweicloud.sdk.lts.v2.model.ListTransfersResponse;
import com.huaweicloud.sdk.lts.v2.model.RegisterDmsKafkaInstanceRequest;
import com.huaweicloud.sdk.lts.v2.model.RegisterDmsKafkaInstanceResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowAdminConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowAdminConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowAomMappingRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowAomMappingRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowLogConvergeConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowLogConvergeConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowMemberGroupAndStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowMemberGroupAndStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateAlarmRuleStatusRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateAlarmRuleStatusResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateHostGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateHostGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateKeywordsAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateKeywordsAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogConvergeConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogConvergeConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateSqlAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateSqlAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateStructConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateStructConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateSwitchRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateSwitchResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateTransferRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateTransferResponse;

public class LtsClient {

    protected HcClient hcClient;

    public LtsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LtsClient> newBuilder() {
        ClientBuilder<LtsClient> clientBuilder = new ClientBuilder<>(LtsClient::new);
        return clientBuilder;
    }

    /**
     * 创建日志接入
     *
     * 创建日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessConfigRequest 请求对象
     * @return CreateAccessConfigResponse
     */
    public CreateAccessConfigResponse createAccessConfig(CreateAccessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createAccessConfig);
    }

    /**
     * 创建日志接入
     *
     * 创建日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessConfigRequest 请求对象
     * @return SyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse>
     */
    public SyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse> createAccessConfigInvoker(
        CreateAccessConfigRequest request) {
        return new SyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse>(request,
            LtsMeta.createAccessConfig, hcClient);
    }

    /**
     * 新建跨账号日志接入
     *
     * 新建跨账号日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyAccessRequest 请求对象
     * @return CreateAgencyAccessResponse
     */
    public CreateAgencyAccessResponse createAgencyAccess(CreateAgencyAccessRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createAgencyAccess);
    }

    /**
     * 新建跨账号日志接入
     *
     * 新建跨账号日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyAccessRequest 请求对象
     * @return SyncInvoker<CreateAgencyAccessRequest, CreateAgencyAccessResponse>
     */
    public SyncInvoker<CreateAgencyAccessRequest, CreateAgencyAccessResponse> createAgencyAccessInvoker(
        CreateAgencyAccessRequest request) {
        return new SyncInvoker<CreateAgencyAccessRequest, CreateAgencyAccessResponse>(request,
            LtsMeta.createAgencyAccess, hcClient);
    }

    /**
     * 创建仪表盘
     *
     * 创建仪表盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDashBoardRequest 请求对象
     * @return CreateDashBoardResponse
     */
    public CreateDashBoardResponse createDashBoard(CreateDashBoardRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createDashBoard);
    }

    /**
     * 创建仪表盘
     *
     * 创建仪表盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDashBoardRequest 请求对象
     * @return SyncInvoker<CreateDashBoardRequest, CreateDashBoardResponse>
     */
    public SyncInvoker<CreateDashBoardRequest, CreateDashBoardResponse> createDashBoardInvoker(
        CreateDashBoardRequest request) {
        return new SyncInvoker<CreateDashBoardRequest, CreateDashBoardResponse>(request, LtsMeta.createDashBoard,
            hcClient);
    }

    /**
     * 创建仪表盘分组
     *
     * 创建仪表盘分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDashboardGroupRequest 请求对象
     * @return CreateDashboardGroupResponse
     */
    public CreateDashboardGroupResponse createDashboardGroup(CreateDashboardGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createDashboardGroup);
    }

    /**
     * 创建仪表盘分组
     *
     * 创建仪表盘分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDashboardGroupRequest 请求对象
     * @return SyncInvoker<CreateDashboardGroupRequest, CreateDashboardGroupResponse>
     */
    public SyncInvoker<CreateDashboardGroupRequest, CreateDashboardGroupResponse> createDashboardGroupInvoker(
        CreateDashboardGroupRequest request) {
        return new SyncInvoker<CreateDashboardGroupRequest, CreateDashboardGroupResponse>(request,
            LtsMeta.createDashboardGroup, hcClient);
    }

    /**
     * 创建主机组
     *
     * 创建主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHostGroupRequest 请求对象
     * @return CreateHostGroupResponse
     */
    public CreateHostGroupResponse createHostGroup(CreateHostGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createHostGroup);
    }

    /**
     * 创建主机组
     *
     * 创建主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHostGroupRequest 请求对象
     * @return SyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse>
     */
    public SyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse> createHostGroupInvoker(
        CreateHostGroupRequest request) {
        return new SyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse>(request, LtsMeta.createHostGroup,
            hcClient);
    }

    /**
     * 创建关键词告警规则
     *
     * 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKeywordsAlarmRuleRequest 请求对象
     * @return CreateKeywordsAlarmRuleResponse
     */
    public CreateKeywordsAlarmRuleResponse createKeywordsAlarmRule(CreateKeywordsAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createKeywordsAlarmRule);
    }

    /**
     * 创建关键词告警规则
     *
     * 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKeywordsAlarmRuleRequest 请求对象
     * @return SyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse>
     */
    public SyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRuleInvoker(
        CreateKeywordsAlarmRuleRequest request) {
        return new SyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse>(request,
            LtsMeta.createKeywordsAlarmRule, hcClient);
    }

    /**
     * 创建日志转储（旧版）
     *
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return CreateLogDumpObsResponse
     */
    public CreateLogDumpObsResponse createLogDumpObs(CreateLogDumpObsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogDumpObs);
    }

    /**
     * 创建日志转储（旧版）
     *
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>
     */
    public SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObsInvoker(
        CreateLogDumpObsRequest request) {
        return new SyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>(request, LtsMeta.createLogDumpObs,
            hcClient);
    }

    /**
     * 创建日志组
     *
     * 该接口用于创建一个日志组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogGroupRequest 请求对象
     * @return CreateLogGroupResponse
     */
    public CreateLogGroupResponse createLogGroup(CreateLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogGroup);
    }

    /**
     * 创建日志组
     *
     * 该接口用于创建一个日志组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogGroupRequest 请求对象
     * @return SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>
     */
    public SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroupInvoker(
        CreateLogGroupRequest request) {
        return new SyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>(request, LtsMeta.createLogGroup,
            hcClient);
    }

    /**
     * 创建日志流
     *
     * 该接口用于创建某个指定日志组下的日志流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogStreamRequest 请求对象
     * @return CreateLogStreamResponse
     */
    public CreateLogStreamResponse createLogStream(CreateLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogStream);
    }

    /**
     * 创建日志流
     *
     * 该接口用于创建某个指定日志组下的日志流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogStreamRequest 请求对象
     * @return SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>
     */
    public SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> createLogStreamInvoker(
        CreateLogStreamRequest request) {
        return new SyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>(request, LtsMeta.createLogStream,
            hcClient);
    }

    /**
     * 向指定流创建索引
     *
     * 向指定流创建索引
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogStreamIndexRequest 请求对象
     * @return CreateLogStreamIndexResponse
     */
    public CreateLogStreamIndexResponse createLogStreamIndex(CreateLogStreamIndexRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createLogStreamIndex);
    }

    /**
     * 向指定流创建索引
     *
     * 向指定流创建索引
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogStreamIndexRequest 请求对象
     * @return SyncInvoker<CreateLogStreamIndexRequest, CreateLogStreamIndexResponse>
     */
    public SyncInvoker<CreateLogStreamIndexRequest, CreateLogStreamIndexResponse> createLogStreamIndexInvoker(
        CreateLogStreamIndexRequest request) {
        return new SyncInvoker<CreateLogStreamIndexRequest, CreateLogStreamIndexResponse>(request,
            LtsMeta.createLogStreamIndex, hcClient);
    }

    /**
     * 创建消息模板
     *
     * 该接口用于创建通知模板，目前每个帐户最多可以创建共100个通知模板，创建后名称不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotificationTemplateRequest 请求对象
     * @return CreateNotificationTemplateResponse
     */
    public CreateNotificationTemplateResponse createNotificationTemplate(CreateNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createNotificationTemplate);
    }

    /**
     * 创建消息模板
     *
     * 该接口用于创建通知模板，目前每个帐户最多可以创建共100个通知模板，创建后名称不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotificationTemplateRequest 请求对象
     * @return SyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse>
     */
    public SyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> createNotificationTemplateInvoker(
        CreateNotificationTemplateRequest request) {
        return new SyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse>(request,
            LtsMeta.createNotificationTemplate, hcClient);
    }

    /**
     * 添加快速查询
     *
     * 添加快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSearchCriteriasRequest 请求对象
     * @return CreateSearchCriteriasResponse
     */
    public CreateSearchCriteriasResponse createSearchCriterias(CreateSearchCriteriasRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createSearchCriterias);
    }

    /**
     * 添加快速查询
     *
     * 添加快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSearchCriteriasRequest 请求对象
     * @return SyncInvoker<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse>
     */
    public SyncInvoker<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse> createSearchCriteriasInvoker(
        CreateSearchCriteriasRequest request) {
        return new SyncInvoker<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse>(request,
            LtsMeta.createSearchCriterias, hcClient);
    }

    /**
     * 通过结构化模板创建结构化配置（新）
     *
     * 该接口通过结构化模板创建结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStructConfigRequest 请求对象
     * @return CreateStructConfigResponse
     */
    public CreateStructConfigResponse createStructConfig(CreateStructConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createStructConfig);
    }

    /**
     * 通过结构化模板创建结构化配置（新）
     *
     * 该接口通过结构化模板创建结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStructConfigRequest 请求对象
     * @return SyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse>
     */
    public SyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse> createStructConfigInvoker(
        CreateStructConfigRequest request) {
        return new SyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse>(request,
            LtsMeta.createStructConfig, hcClient);
    }

    /**
     * 创建结构化配置
     *
     * 该接口用于创建指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStructTemplateRequest 请求对象
     * @return CreateStructTemplateResponse
     */
    public CreateStructTemplateResponse createStructTemplate(CreateStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createStructTemplate);
    }

    /**
     * 创建结构化配置
     *
     * 该接口用于创建指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStructTemplateRequest 请求对象
     * @return SyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse>
     */
    public SyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse> createStructTemplateInvoker(
        CreateStructTemplateRequest request) {
        return new SyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse>(request,
            LtsMeta.createStructTemplate, hcClient);
    }

    /**
     * 
     *
     * 添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagsRequest 请求对象
     * @return CreateTagsResponse
     */
    public CreateTagsResponse createTags(CreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createTags);
    }

    /**
     * 
     *
     * 添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagsRequest 请求对象
     * @return SyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public SyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsInvoker(CreateTagsRequest request) {
        return new SyncInvoker<CreateTagsRequest, CreateTagsResponse>(request, LtsMeta.createTags, hcClient);
    }

    /**
     * 创建日志转储（新版）
     *
     * 该接口用于创建OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransferRequest 请求对象
     * @return CreateTransferResponse
     */
    public CreateTransferResponse createTransfer(CreateTransferRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createTransfer);
    }

    /**
     * 创建日志转储（新版）
     *
     * 该接口用于创建OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransferRequest 请求对象
     * @return SyncInvoker<CreateTransferRequest, CreateTransferResponse>
     */
    public SyncInvoker<CreateTransferRequest, CreateTransferResponse> createTransferInvoker(
        CreateTransferRequest request) {
        return new SyncInvoker<CreateTransferRequest, CreateTransferResponse>(request, LtsMeta.createTransfer,
            hcClient);
    }

    /**
     * 创建日志收藏
     *
     * 创建日志收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatefavoriteRequest 请求对象
     * @return CreatefavoriteResponse
     */
    public CreatefavoriteResponse createfavorite(CreatefavoriteRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createfavorite);
    }

    /**
     * 创建日志收藏
     *
     * 创建日志收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatefavoriteRequest 请求对象
     * @return SyncInvoker<CreatefavoriteRequest, CreatefavoriteResponse>
     */
    public SyncInvoker<CreatefavoriteRequest, CreatefavoriteResponse> createfavoriteInvoker(
        CreatefavoriteRequest request) {
        return new SyncInvoker<CreatefavoriteRequest, CreatefavoriteResponse>(request, LtsMeta.createfavorite,
            hcClient);
    }

    /**
     * 删除日志接入
     *
     * 删除日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAccessConfigRequest 请求对象
     * @return DeleteAccessConfigResponse
     */
    public DeleteAccessConfigResponse deleteAccessConfig(DeleteAccessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteAccessConfig);
    }

    /**
     * 删除日志接入
     *
     * 删除日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAccessConfigRequest 请求对象
     * @return SyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse>
     */
    public SyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse> deleteAccessConfigInvoker(
        DeleteAccessConfigRequest request) {
        return new SyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse>(request,
            LtsMeta.deleteAccessConfig, hcClient);
    }

    /**
     * 删除活动告警
     *
     * 该接口用于删除活动告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteActiveAlarmsRequest 请求对象
     * @return DeleteActiveAlarmsResponse
     */
    public DeleteActiveAlarmsResponse deleteActiveAlarms(DeleteActiveAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteActiveAlarms);
    }

    /**
     * 删除活动告警
     *
     * 该接口用于删除活动告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteActiveAlarmsRequest 请求对象
     * @return SyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse>
     */
    public SyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> deleteActiveAlarmsInvoker(
        DeleteActiveAlarmsRequest request) {
        return new SyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse>(request,
            LtsMeta.deleteActiveAlarms, hcClient);
    }

    /**
     * 删除仪表盘
     *
     * 删除仪表盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDashboardRequest 请求对象
     * @return DeleteDashboardResponse
     */
    public DeleteDashboardResponse deleteDashboard(DeleteDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteDashboard);
    }

    /**
     * 删除仪表盘
     *
     * 删除仪表盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDashboardRequest 请求对象
     * @return SyncInvoker<DeleteDashboardRequest, DeleteDashboardResponse>
     */
    public SyncInvoker<DeleteDashboardRequest, DeleteDashboardResponse> deleteDashboardInvoker(
        DeleteDashboardRequest request) {
        return new SyncInvoker<DeleteDashboardRequest, DeleteDashboardResponse>(request, LtsMeta.deleteDashboard,
            hcClient);
    }

    /**
     * 删除主机组
     *
     * 删除主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostGroupRequest 请求对象
     * @return DeleteHostGroupResponse
     */
    public DeleteHostGroupResponse deleteHostGroup(DeleteHostGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteHostGroup);
    }

    /**
     * 删除主机组
     *
     * 删除主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostGroupRequest 请求对象
     * @return SyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse>
     */
    public SyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse> deleteHostGroupInvoker(
        DeleteHostGroupRequest request) {
        return new SyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse>(request, LtsMeta.deleteHostGroup,
            hcClient);
    }

    /**
     * 删除关键词告警规则
     *
     * 该接口用于删除关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKeywordsAlarmRuleRequest 请求对象
     * @return DeleteKeywordsAlarmRuleResponse
     */
    public DeleteKeywordsAlarmRuleResponse deleteKeywordsAlarmRule(DeleteKeywordsAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteKeywordsAlarmRule);
    }

    /**
     * 删除关键词告警规则
     *
     * 该接口用于删除关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKeywordsAlarmRuleRequest 请求对象
     * @return SyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse>
     */
    public SyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRuleInvoker(
        DeleteKeywordsAlarmRuleRequest request) {
        return new SyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse>(request,
            LtsMeta.deleteKeywordsAlarmRule, hcClient);
    }

    /**
     * 删除日志组
     *
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return DeleteLogGroupResponse
     */
    public DeleteLogGroupResponse deleteLogGroup(DeleteLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteLogGroup);
    }

    /**
     * 删除日志组
     *
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>
     */
    public SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroupInvoker(
        DeleteLogGroupRequest request) {
        return new SyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>(request, LtsMeta.deleteLogGroup,
            hcClient);
    }

    /**
     * 删除日志流
     *
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return DeleteLogStreamResponse
     */
    public DeleteLogStreamResponse deleteLogStream(DeleteLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteLogStream);
    }

    /**
     * 删除日志流
     *
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>
     */
    public SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStreamInvoker(
        DeleteLogStreamRequest request) {
        return new SyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>(request, LtsMeta.deleteLogStream,
            hcClient);
    }

    /**
     * 删除消息模板
     *
     * 该接口用于删除通知模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotificationTemplateRequest 请求对象
     * @return DeleteNotificationTemplateResponse
     */
    public DeleteNotificationTemplateResponse deleteNotificationTemplate(DeleteNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteNotificationTemplate);
    }

    /**
     * 删除消息模板
     *
     * 该接口用于删除通知模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotificationTemplateRequest 请求对象
     * @return SyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse>
     */
    public SyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> deleteNotificationTemplateInvoker(
        DeleteNotificationTemplateRequest request) {
        return new SyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse>(request,
            LtsMeta.deleteNotificationTemplate, hcClient);
    }

    /**
     * 删除快速查询
     *
     * 删除快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSearchCriteriasRequest 请求对象
     * @return DeleteSearchCriteriasResponse
     */
    public DeleteSearchCriteriasResponse deleteSearchCriterias(DeleteSearchCriteriasRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteSearchCriterias);
    }

    /**
     * 删除快速查询
     *
     * 删除快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSearchCriteriasRequest 请求对象
     * @return SyncInvoker<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse>
     */
    public SyncInvoker<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse> deleteSearchCriteriasInvoker(
        DeleteSearchCriteriasRequest request) {
        return new SyncInvoker<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse>(request,
            LtsMeta.deleteSearchCriterias, hcClient);
    }

    /**
     * 删除结构化配置
     *
     * 该接口用于删除指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStructTemplateRequest 请求对象
     * @return DeleteStructTemplateResponse
     */
    public DeleteStructTemplateResponse deleteStructTemplate(DeleteStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteStructTemplate);
    }

    /**
     * 删除结构化配置
     *
     * 该接口用于删除指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStructTemplateRequest 请求对象
     * @return SyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse>
     */
    public SyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse> deleteStructTemplateInvoker(
        DeleteStructTemplateRequest request) {
        return new SyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse>(request,
            LtsMeta.deleteStructTemplate, hcClient);
    }

    /**
     * 删除日志转储
     *
     * 该接口用于删除OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransferRequest 请求对象
     * @return DeleteTransferResponse
     */
    public DeleteTransferResponse deleteTransfer(DeleteTransferRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteTransfer);
    }

    /**
     * 删除日志转储
     *
     * 该接口用于删除OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransferRequest 请求对象
     * @return SyncInvoker<DeleteTransferRequest, DeleteTransferResponse>
     */
    public SyncInvoker<DeleteTransferRequest, DeleteTransferResponse> deleteTransferInvoker(
        DeleteTransferRequest request) {
        return new SyncInvoker<DeleteTransferRequest, DeleteTransferResponse>(request, LtsMeta.deleteTransfer,
            hcClient);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletefavoriteRequest 请求对象
     * @return DeletefavoriteResponse
     */
    public DeletefavoriteResponse deletefavorite(DeletefavoriteRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deletefavorite);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletefavoriteRequest 请求对象
     * @return SyncInvoker<DeletefavoriteRequest, DeletefavoriteResponse>
     */
    public SyncInvoker<DeletefavoriteRequest, DeletefavoriteResponse> deletefavoriteInvoker(
        DeletefavoriteRequest request) {
        return new SyncInvoker<DeletefavoriteRequest, DeletefavoriteResponse>(request, LtsMeta.deletefavorite,
            hcClient);
    }

    /**
     * 关闭超额采集开关
     *
     * 该接口用于将超额采集日志功能关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return DisableLogCollectionResponse
     */
    public DisableLogCollectionResponse disableLogCollection(DisableLogCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.disableLogCollection);
    }

    /**
     * 关闭超额采集开关
     *
     * 该接口用于将超额采集日志功能关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>
     */
    public SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollectionInvoker(
        DisableLogCollectionRequest request) {
        return new SyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>(request,
            LtsMeta.disableLogCollection, hcClient);
    }

    /**
     * 打开超额采集开关
     *
     * 该接口用于将超额采集日志功能打开。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return EnableLogCollectionResponse
     */
    public EnableLogCollectionResponse enableLogCollection(EnableLogCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.enableLogCollection);
    }

    /**
     * 打开超额采集开关
     *
     * 该接口用于将超额采集日志功能打开。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>
     */
    public SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollectionInvoker(
        EnableLogCollectionRequest request) {
        return new SyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>(request,
            LtsMeta.enableLogCollection, hcClient);
    }

    /**
     * 查询日志接入
     *
     * 查询日志接入列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessConfigRequest 请求对象
     * @return ListAccessConfigResponse
     */
    public ListAccessConfigResponse listAccessConfig(ListAccessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listAccessConfig);
    }

    /**
     * 查询日志接入
     *
     * 查询日志接入列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessConfigRequest 请求对象
     * @return SyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse>
     */
    public SyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse> listAccessConfigInvoker(
        ListAccessConfigRequest request) {
        return new SyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse>(request, LtsMeta.listAccessConfig,
            hcClient);
    }

    /**
     * 查询活动或历史告警列表
     *
     * 该接口用于查询告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActiveOrHistoryAlarmsRequest 请求对象
     * @return ListActiveOrHistoryAlarmsResponse
     */
    public ListActiveOrHistoryAlarmsResponse listActiveOrHistoryAlarms(ListActiveOrHistoryAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listActiveOrHistoryAlarms);
    }

    /**
     * 查询活动或历史告警列表
     *
     * 该接口用于查询告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActiveOrHistoryAlarmsRequest 请求对象
     * @return SyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse>
     */
    public SyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarmsInvoker(
        ListActiveOrHistoryAlarmsRequest request) {
        return new SyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse>(request,
            LtsMeta.listActiveOrHistoryAlarms, hcClient);
    }

    /**
     * 查询结构化模板简略列表
     *
     * 该接口用于查询结构化模板简略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBreifStructTemplateRequest 请求对象
     * @return ListBreifStructTemplateResponse
     */
    public ListBreifStructTemplateResponse listBreifStructTemplate(ListBreifStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listBreifStructTemplate);
    }

    /**
     * 查询结构化模板简略列表
     *
     * 该接口用于查询结构化模板简略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBreifStructTemplateRequest 请求对象
     * @return SyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse>
     */
    public SyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> listBreifStructTemplateInvoker(
        ListBreifStructTemplateRequest request) {
        return new SyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse>(request,
            LtsMeta.listBreifStructTemplate, hcClient);
    }

    /**
     * 查询日志流图表
     *
     * 该接口用于查询日志流图表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChartsRequest 请求对象
     * @return ListChartsResponse
     */
    public ListChartsResponse listCharts(ListChartsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listCharts);
    }

    /**
     * 查询日志流图表
     *
     * 该接口用于查询日志流图表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChartsRequest 请求对象
     * @return SyncInvoker<ListChartsRequest, ListChartsResponse>
     */
    public SyncInvoker<ListChartsRequest, ListChartsResponse> listChartsInvoker(ListChartsRequest request) {
        return new SyncInvoker<ListChartsRequest, ListChartsResponse>(request, LtsMeta.listCharts, hcClient);
    }

    /**
     * 获取快速查询
     *
     * 获取快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCriteriasRequest 请求对象
     * @return ListCriteriasResponse
     */
    public ListCriteriasResponse listCriterias(ListCriteriasRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listCriterias);
    }

    /**
     * 获取快速查询
     *
     * 获取快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCriteriasRequest 请求对象
     * @return SyncInvoker<ListCriteriasRequest, ListCriteriasResponse>
     */
    public SyncInvoker<ListCriteriasRequest, ListCriteriasResponse> listCriteriasInvoker(ListCriteriasRequest request) {
        return new SyncInvoker<ListCriteriasRequest, ListCriteriasResponse>(request, LtsMeta.listCriterias, hcClient);
    }

    /**
     * 查询用户历史sql
     *
     * 查询用户历史sql
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistorySqlRequest 请求对象
     * @return ListHistorySqlResponse
     */
    public ListHistorySqlResponse listHistorySql(ListHistorySqlRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listHistorySql);
    }

    /**
     * 查询用户历史sql
     *
     * 查询用户历史sql
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistorySqlRequest 请求对象
     * @return SyncInvoker<ListHistorySqlRequest, ListHistorySqlResponse>
     */
    public SyncInvoker<ListHistorySqlRequest, ListHistorySqlResponse> listHistorySqlInvoker(
        ListHistorySqlRequest request) {
        return new SyncInvoker<ListHistorySqlRequest, ListHistorySqlResponse>(request, LtsMeta.listHistorySql,
            hcClient);
    }

    /**
     * 查询主机信息
     *
     * 查询主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return ListHostResponse
     */
    public ListHostResponse listHost(ListHostRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listHost);
    }

    /**
     * 查询主机信息
     *
     * 查询主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return SyncInvoker<ListHostRequest, ListHostResponse>
     */
    public SyncInvoker<ListHostRequest, ListHostResponse> listHostInvoker(ListHostRequest request) {
        return new SyncInvoker<ListHostRequest, ListHostResponse>(request, LtsMeta.listHost, hcClient);
    }

    /**
     * 查询主机组
     *
     * 查询主机组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupRequest 请求对象
     * @return ListHostGroupResponse
     */
    public ListHostGroupResponse listHostGroup(ListHostGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listHostGroup);
    }

    /**
     * 查询主机组
     *
     * 查询主机组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupRequest 请求对象
     * @return SyncInvoker<ListHostGroupRequest, ListHostGroupResponse>
     */
    public SyncInvoker<ListHostGroupRequest, ListHostGroupResponse> listHostGroupInvoker(ListHostGroupRequest request) {
        return new SyncInvoker<ListHostGroupRequest, ListHostGroupResponse>(request, LtsMeta.listHostGroup, hcClient);
    }

    /**
     * 查询关键词告警规则
     *
     * 该接口用于查询关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeywordsAlarmRulesRequest 请求对象
     * @return ListKeywordsAlarmRulesResponse
     */
    public ListKeywordsAlarmRulesResponse listKeywordsAlarmRules(ListKeywordsAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listKeywordsAlarmRules);
    }

    /**
     * 查询关键词告警规则
     *
     * 该接口用于查询关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeywordsAlarmRulesRequest 请求对象
     * @return SyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse>
     */
    public SyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> listKeywordsAlarmRulesInvoker(
        ListKeywordsAlarmRulesRequest request) {
        return new SyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse>(request,
            LtsMeta.listKeywordsAlarmRules, hcClient);
    }

    /**
     * 查询账号下所有日志组
     *
     * 该接口用于查询账号下所有日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogGroupsRequest 请求对象
     * @return ListLogGroupsResponse
     */
    public ListLogGroupsResponse listLogGroups(ListLogGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogGroups);
    }

    /**
     * 查询账号下所有日志组
     *
     * 该接口用于查询账号下所有日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogGroupsRequest 请求对象
     * @return SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>
     */
    public SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroupsInvoker(ListLogGroupsRequest request) {
        return new SyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>(request, LtsMeta.listLogGroups, hcClient);
    }

    /**
     * 查询日志直方图
     *
     * 查询关键词搜索条数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogHistogramRequest 请求对象
     * @return ListLogHistogramResponse
     */
    public ListLogHistogramResponse listLogHistogram(ListLogHistogramRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogHistogram);
    }

    /**
     * 查询日志直方图
     *
     * 查询关键词搜索条数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogHistogramRequest 请求对象
     * @return SyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse>
     */
    public SyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse> listLogHistogramInvoker(
        ListLogHistogramRequest request) {
        return new SyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse>(request, LtsMeta.listLogHistogram,
            hcClient);
    }

    /**
     * 查询指定日志组下的所有日志流
     *
     * 该接口用于查询指定日志组下的所有日志流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogStreamRequest 请求对象
     * @return ListLogStreamResponse
     */
    public ListLogStreamResponse listLogStream(ListLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogStream);
    }

    /**
     * 查询指定日志组下的所有日志流
     *
     * 该接口用于查询指定日志组下的所有日志流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogStreamRequest 请求对象
     * @return SyncInvoker<ListLogStreamRequest, ListLogStreamResponse>
     */
    public SyncInvoker<ListLogStreamRequest, ListLogStreamResponse> listLogStreamInvoker(ListLogStreamRequest request) {
        return new SyncInvoker<ListLogStreamRequest, ListLogStreamResponse>(request, LtsMeta.listLogStream, hcClient);
    }

    /**
     * 查询日志流信息
     *
     * 该接口用于查询LTS日志流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogStreamsRequest 请求对象
     * @return ListLogStreamsResponse
     */
    public ListLogStreamsResponse listLogStreams(ListLogStreamsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogStreams);
    }

    /**
     * 查询日志流信息
     *
     * 该接口用于查询LTS日志流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogStreamsRequest 请求对象
     * @return SyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse>
     */
    public SyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse> listLogStreamsInvoker(
        ListLogStreamsRequest request) {
        return new SyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse>(request, LtsMeta.listLogStreams,
            hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询指定日志流下的日志内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogsRequest 请求对象
     * @return ListLogsResponse
     */
    public ListLogsResponse listLogs(ListLogsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listLogs);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询指定日志流下的日志内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogsRequest 请求对象
     * @return SyncInvoker<ListLogsRequest, ListLogsResponse>
     */
    public SyncInvoker<ListLogsRequest, ListLogsResponse> listLogsInvoker(ListLogsRequest request) {
        return new SyncInvoker<ListLogsRequest, ListLogsResponse>(request, LtsMeta.listLogs, hcClient);
    }

    /**
     * 预览消息模板邮件格式
     *
     * 该接口用于预览通知模板邮件格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationTemplateRequest 请求对象
     * @return ListNotificationTemplateResponse
     */
    public ListNotificationTemplateResponse listNotificationTemplate(ListNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listNotificationTemplate);
    }

    /**
     * 预览消息模板邮件格式
     *
     * 该接口用于预览通知模板邮件格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationTemplateRequest 请求对象
     * @return SyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse>
     */
    public SyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse> listNotificationTemplateInvoker(
        ListNotificationTemplateRequest request) {
        return new SyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse>(request,
            LtsMeta.listNotificationTemplate, hcClient);
    }

    /**
     * 查询消息模板
     *
     * 该接口用于查询通知模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationTemplatesRequest 请求对象
     * @return ListNotificationTemplatesResponse
     */
    public ListNotificationTemplatesResponse listNotificationTemplates(ListNotificationTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listNotificationTemplates);
    }

    /**
     * 查询消息模板
     *
     * 该接口用于查询通知模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationTemplatesRequest 请求对象
     * @return SyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse>
     */
    public SyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> listNotificationTemplatesInvoker(
        ListNotificationTemplatesRequest request) {
        return new SyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse>(request,
            LtsMeta.listNotificationTemplates, hcClient);
    }

    /**
     * 查询SMN主题
     *
     * 该接口用于查询SMN主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationTopicsRequest 请求对象
     * @return ListNotificationTopicsResponse
     */
    public ListNotificationTopicsResponse listNotificationTopics(ListNotificationTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listNotificationTopics);
    }

    /**
     * 查询SMN主题
     *
     * 该接口用于查询SMN主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationTopicsRequest 请求对象
     * @return SyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse>
     */
    public SyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse> listNotificationTopicsInvoker(
        ListNotificationTopicsRequest request) {
        return new SyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse>(request,
            LtsMeta.listNotificationTopics, hcClient);
    }

    /**
     * 查询日志组下所有快速查询
     *
     * 查询日志组下所有快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueryAllSearchCriteriasRequest 请求对象
     * @return ListQueryAllSearchCriteriasResponse
     */
    public ListQueryAllSearchCriteriasResponse listQueryAllSearchCriterias(ListQueryAllSearchCriteriasRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listQueryAllSearchCriterias);
    }

    /**
     * 查询日志组下所有快速查询
     *
     * 查询日志组下所有快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueryAllSearchCriteriasRequest 请求对象
     * @return SyncInvoker<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse>
     */
    public SyncInvoker<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse> listQueryAllSearchCriteriasInvoker(
        ListQueryAllSearchCriteriasRequest request) {
        return new SyncInvoker<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse>(request,
            LtsMeta.listQueryAllSearchCriterias, hcClient);
    }

    /**
     * 查询结构化日志
     *
     * 该接口用于查询指定日志流下的结构化日志内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return ListQueryStructuredLogsResponse
     */
    public ListQueryStructuredLogsResponse listQueryStructuredLogs(ListQueryStructuredLogsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listQueryStructuredLogs);
    }

    /**
     * 查询结构化日志
     *
     * 该接口用于查询指定日志流下的结构化日志内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>
     */
    public SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogsInvoker(
        ListQueryStructuredLogsRequest request) {
        return new SyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>(request,
            LtsMeta.listQueryStructuredLogs, hcClient);
    }

    /**
     * 查询结构化模板
     *
     * 该接口用于查询结构化模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStructTemplateRequest 请求对象
     * @return ListStructTemplateResponse
     */
    public ListStructTemplateResponse listStructTemplate(ListStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listStructTemplate);
    }

    /**
     * 查询结构化模板
     *
     * 该接口用于查询结构化模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStructTemplateRequest 请求对象
     * @return SyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse>
     */
    public SyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse> listStructTemplateInvoker(
        ListStructTemplateRequest request) {
        return new SyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse>(request,
            LtsMeta.listStructTemplate, hcClient);
    }

    /**
     * 查询结构化日志（新版）
     *
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return ListStructuredLogsWithTimeRangeResponse
     */
    public ListStructuredLogsWithTimeRangeResponse listStructuredLogsWithTimeRange(
        ListStructuredLogsWithTimeRangeRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listStructuredLogsWithTimeRange);
    }

    /**
     * 查询结构化日志（新版）
     *
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>
     */
    public SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeInvoker(
        ListStructuredLogsWithTimeRangeRequest request) {
        return new SyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>(request,
            LtsMeta.listStructuredLogsWithTimeRange, hcClient);
    }

    /**
     * 按时间段统计查询资源
     *
     * 按时间段统计查询资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTimeLineTrafficStatisticsRequest 请求对象
     * @return ListTimeLineTrafficStatisticsResponse
     */
    public ListTimeLineTrafficStatisticsResponse listTimeLineTrafficStatistics(
        ListTimeLineTrafficStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listTimeLineTrafficStatistics);
    }

    /**
     * 按时间段统计查询资源
     *
     * 按时间段统计查询资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTimeLineTrafficStatisticsRequest 请求对象
     * @return SyncInvoker<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse>
     */
    public SyncInvoker<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse> listTimeLineTrafficStatisticsInvoker(
        ListTimeLineTrafficStatisticsRequest request) {
        return new SyncInvoker<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse>(request,
            LtsMeta.listTimeLineTrafficStatistics, hcClient);
    }

    /**
     * 统计top n的日志组或日志流流量
     *
     * 统计top n的日志组或日志流流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTopnTrafficStatisticsRequest 请求对象
     * @return ListTopnTrafficStatisticsResponse
     */
    public ListTopnTrafficStatisticsResponse listTopnTrafficStatistics(ListTopnTrafficStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listTopnTrafficStatistics);
    }

    /**
     * 统计top n的日志组或日志流流量
     *
     * 统计top n的日志组或日志流流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTopnTrafficStatisticsRequest 请求对象
     * @return SyncInvoker<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse>
     */
    public SyncInvoker<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse> listTopnTrafficStatisticsInvoker(
        ListTopnTrafficStatisticsRequest request) {
        return new SyncInvoker<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse>(request,
            LtsMeta.listTopnTrafficStatistics, hcClient);
    }

    /**
     * 查询日志转储
     *
     * 该接口用于查询OBS转储，DIS转储，DMS转储配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransfersRequest 请求对象
     * @return ListTransfersResponse
     */
    public ListTransfersResponse listTransfers(ListTransfersRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listTransfers);
    }

    /**
     * 查询日志转储
     *
     * 该接口用于查询OBS转储，DIS转储，DMS转储配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransfersRequest 请求对象
     * @return SyncInvoker<ListTransfersRequest, ListTransfersResponse>
     */
    public SyncInvoker<ListTransfersRequest, ListTransfersResponse> listTransfersInvoker(ListTransfersRequest request) {
        return new SyncInvoker<ListTransfersRequest, ListTransfersResponse>(request, LtsMeta.listTransfers, hcClient);
    }

    /**
     * 注册DMS kafka实例
     *
     * 该接口用于注册DMS kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterDmsKafkaInstanceRequest 请求对象
     * @return RegisterDmsKafkaInstanceResponse
     */
    public RegisterDmsKafkaInstanceResponse registerDmsKafkaInstance(RegisterDmsKafkaInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.registerDmsKafkaInstance);
    }

    /**
     * 注册DMS kafka实例
     *
     * 该接口用于注册DMS kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterDmsKafkaInstanceRequest 请求对象
     * @return SyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse>
     */
    public SyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> registerDmsKafkaInstanceInvoker(
        RegisterDmsKafkaInstanceRequest request) {
        return new SyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse>(request,
            LtsMeta.registerDmsKafkaInstance, hcClient);
    }

    /**
     * 获取日志汇聚开关
     *
     * 只能由管理员或者委托管理员调用    获取日志汇聚开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAdminConfigRequest 请求对象
     * @return ShowAdminConfigResponse
     */
    public ShowAdminConfigResponse showAdminConfig(ShowAdminConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showAdminConfig);
    }

    /**
     * 获取日志汇聚开关
     *
     * 只能由管理员或者委托管理员调用    获取日志汇聚开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAdminConfigRequest 请求对象
     * @return SyncInvoker<ShowAdminConfigRequest, ShowAdminConfigResponse>
     */
    public SyncInvoker<ShowAdminConfigRequest, ShowAdminConfigResponse> showAdminConfigInvoker(
        ShowAdminConfigRequest request) {
        return new SyncInvoker<ShowAdminConfigRequest, ShowAdminConfigResponse>(request, LtsMeta.showAdminConfig,
            hcClient);
    }

    /**
     * 获取组织成员汇聚配置
     *
     * 只能由组织管理员或者委托管理员调用    获取组织成员汇聚配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogConvergeConfigRequest 请求对象
     * @return ShowLogConvergeConfigResponse
     */
    public ShowLogConvergeConfigResponse showLogConvergeConfig(ShowLogConvergeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showLogConvergeConfig);
    }

    /**
     * 获取组织成员汇聚配置
     *
     * 只能由组织管理员或者委托管理员调用    获取组织成员汇聚配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogConvergeConfigRequest 请求对象
     * @return SyncInvoker<ShowLogConvergeConfigRequest, ShowLogConvergeConfigResponse>
     */
    public SyncInvoker<ShowLogConvergeConfigRequest, ShowLogConvergeConfigResponse> showLogConvergeConfigInvoker(
        ShowLogConvergeConfigRequest request) {
        return new SyncInvoker<ShowLogConvergeConfigRequest, ShowLogConvergeConfigResponse>(request,
            LtsMeta.showLogConvergeConfig, hcClient);
    }

    /**
     * 获取组织成员日志组日志流
     *
     * 只能由管理员或者委托管理员调用，获取组织成员日志组日志流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberGroupAndStreamRequest 请求对象
     * @return ShowMemberGroupAndStreamResponse
     */
    public ShowMemberGroupAndStreamResponse showMemberGroupAndStream(ShowMemberGroupAndStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showMemberGroupAndStream);
    }

    /**
     * 获取组织成员日志组日志流
     *
     * 只能由管理员或者委托管理员调用，获取组织成员日志组日志流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberGroupAndStreamRequest 请求对象
     * @return SyncInvoker<ShowMemberGroupAndStreamRequest, ShowMemberGroupAndStreamResponse>
     */
    public SyncInvoker<ShowMemberGroupAndStreamRequest, ShowMemberGroupAndStreamResponse> showMemberGroupAndStreamInvoker(
        ShowMemberGroupAndStreamRequest request) {
        return new SyncInvoker<ShowMemberGroupAndStreamRequest, ShowMemberGroupAndStreamResponse>(request,
            LtsMeta.showMemberGroupAndStream, hcClient);
    }

    /**
     * 查询单个消息模板
     *
     * 该接口用于查询单个通知模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotificationTemplateRequest 请求对象
     * @return ShowNotificationTemplateResponse
     */
    public ShowNotificationTemplateResponse showNotificationTemplate(ShowNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showNotificationTemplate);
    }

    /**
     * 查询单个消息模板
     *
     * 该接口用于查询单个通知模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotificationTemplateRequest 请求对象
     * @return SyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse>
     */
    public SyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> showNotificationTemplateInvoker(
        ShowNotificationTemplateRequest request) {
        return new SyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse>(request,
            LtsMeta.showNotificationTemplate, hcClient);
    }

    /**
     * 查询结构化配置
     *
     * 该接口用于查询指定日志流下的结构化配置内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStructTemplateRequest 请求对象
     * @return ShowStructTemplateResponse
     */
    public ShowStructTemplateResponse showStructTemplate(ShowStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showStructTemplate);
    }

    /**
     * 查询结构化配置
     *
     * 该接口用于查询指定日志流下的结构化配置内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStructTemplateRequest 请求对象
     * @return SyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse>
     */
    public SyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse> showStructTemplateInvoker(
        ShowStructTemplateRequest request) {
        return new SyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse>(request,
            LtsMeta.showStructTemplate, hcClient);
    }

    /**
     * 修改日志接入
     *
     * 修改日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessConfigRequest 请求对象
     * @return UpdateAccessConfigResponse
     */
    public UpdateAccessConfigResponse updateAccessConfig(UpdateAccessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateAccessConfig);
    }

    /**
     * 修改日志接入
     *
     * 修改日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessConfigRequest 请求对象
     * @return SyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse>
     */
    public SyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse> updateAccessConfigInvoker(
        UpdateAccessConfigRequest request) {
        return new SyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse>(request,
            LtsMeta.updateAccessConfig, hcClient);
    }

    /**
     * 修改主机组
     *
     * 修改主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHostGroupRequest 请求对象
     * @return UpdateHostGroupResponse
     */
    public UpdateHostGroupResponse updateHostGroup(UpdateHostGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateHostGroup);
    }

    /**
     * 修改主机组
     *
     * 修改主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHostGroupRequest 请求对象
     * @return SyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse>
     */
    public SyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse> updateHostGroupInvoker(
        UpdateHostGroupRequest request) {
        return new SyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse>(request, LtsMeta.updateHostGroup,
            hcClient);
    }

    /**
     * 修改关键词告警规则
     *
     * 该接口用于修改关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeywordsAlarmRuleRequest 请求对象
     * @return UpdateKeywordsAlarmRuleResponse
     */
    public UpdateKeywordsAlarmRuleResponse updateKeywordsAlarmRule(UpdateKeywordsAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateKeywordsAlarmRule);
    }

    /**
     * 修改关键词告警规则
     *
     * 该接口用于修改关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeywordsAlarmRuleRequest 请求对象
     * @return SyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse>
     */
    public SyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRuleInvoker(
        UpdateKeywordsAlarmRuleRequest request) {
        return new SyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse>(request,
            LtsMeta.updateKeywordsAlarmRule, hcClient);
    }

    /**
     * 更新汇聚配置
     *
     * 只能由管理员或者委托管理员 ,更新汇聚配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogConvergeConfigRequest 请求对象
     * @return UpdateLogConvergeConfigResponse
     */
    public UpdateLogConvergeConfigResponse updateLogConvergeConfig(UpdateLogConvergeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateLogConvergeConfig);
    }

    /**
     * 更新汇聚配置
     *
     * 只能由管理员或者委托管理员 ,更新汇聚配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogConvergeConfigRequest 请求对象
     * @return SyncInvoker<UpdateLogConvergeConfigRequest, UpdateLogConvergeConfigResponse>
     */
    public SyncInvoker<UpdateLogConvergeConfigRequest, UpdateLogConvergeConfigResponse> updateLogConvergeConfigInvoker(
        UpdateLogConvergeConfigRequest request) {
        return new SyncInvoker<UpdateLogConvergeConfigRequest, UpdateLogConvergeConfigResponse>(request,
            LtsMeta.updateLogConvergeConfig, hcClient);
    }

    /**
     * 修改日志组
     *
     * 该接口用于修改指定日志组下的日志存储时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return UpdateLogGroupResponse
     */
    public UpdateLogGroupResponse updateLogGroup(UpdateLogGroupRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateLogGroup);
    }

    /**
     * 修改日志组
     *
     * 该接口用于修改指定日志组下的日志存储时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>
     */
    public SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroupInvoker(
        UpdateLogGroupRequest request) {
        return new SyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>(request, LtsMeta.updateLogGroup,
            hcClient);
    }

    /**
     * 修改日志流
     *
     * 该接口用于修改指定日志流下的日志存储时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogStreamRequest 请求对象
     * @return UpdateLogStreamResponse
     */
    public UpdateLogStreamResponse updateLogStream(UpdateLogStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateLogStream);
    }

    /**
     * 修改日志流
     *
     * 该接口用于修改指定日志流下的日志存储时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogStreamRequest 请求对象
     * @return SyncInvoker<UpdateLogStreamRequest, UpdateLogStreamResponse>
     */
    public SyncInvoker<UpdateLogStreamRequest, UpdateLogStreamResponse> updateLogStreamInvoker(
        UpdateLogStreamRequest request) {
        return new SyncInvoker<UpdateLogStreamRequest, UpdateLogStreamResponse>(request, LtsMeta.updateLogStream,
            hcClient);
    }

    /**
     * 修改消息模板
     *
     * 该接口用于修改通知模板,根据名称进行修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotificationTemplateRequest 请求对象
     * @return UpdateNotificationTemplateResponse
     */
    public UpdateNotificationTemplateResponse updateNotificationTemplate(UpdateNotificationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateNotificationTemplate);
    }

    /**
     * 修改消息模板
     *
     * 该接口用于修改通知模板,根据名称进行修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotificationTemplateRequest 请求对象
     * @return SyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse>
     */
    public SyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> updateNotificationTemplateInvoker(
        UpdateNotificationTemplateRequest request) {
        return new SyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse>(request,
            LtsMeta.updateNotificationTemplate, hcClient);
    }

    /**
     * 通过结构化模板修改结构化配置（新）
     *
     * 该接口通过结构化模板修改结构化配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStructConfigRequest 请求对象
     * @return UpdateStructConfigResponse
     */
    public UpdateStructConfigResponse updateStructConfig(UpdateStructConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateStructConfig);
    }

    /**
     * 通过结构化模板修改结构化配置（新）
     *
     * 该接口通过结构化模板修改结构化配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStructConfigRequest 请求对象
     * @return SyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse>
     */
    public SyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse> updateStructConfigInvoker(
        UpdateStructConfigRequest request) {
        return new SyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse>(request,
            LtsMeta.updateStructConfig, hcClient);
    }

    /**
     * 修改结构化配置
     *
     * 该接口用于修改指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStructTemplateRequest 请求对象
     * @return UpdateStructTemplateResponse
     */
    public UpdateStructTemplateResponse updateStructTemplate(UpdateStructTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateStructTemplate);
    }

    /**
     * 修改结构化配置
     *
     * 该接口用于修改指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStructTemplateRequest 请求对象
     * @return SyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse>
     */
    public SyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse> updateStructTemplateInvoker(
        UpdateStructTemplateRequest request) {
        return new SyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse>(request,
            LtsMeta.updateStructTemplate, hcClient);
    }

    /**
     * 修改日志汇聚开关
     *
     * 只能由管理员或者委托管理员调用     修改日志汇聚开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSwitchRequest 请求对象
     * @return UpdateSwitchResponse
     */
    public UpdateSwitchResponse updateSwitch(UpdateSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateSwitch);
    }

    /**
     * 修改日志汇聚开关
     *
     * 只能由管理员或者委托管理员调用     修改日志汇聚开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSwitchRequest 请求对象
     * @return SyncInvoker<UpdateSwitchRequest, UpdateSwitchResponse>
     */
    public SyncInvoker<UpdateSwitchRequest, UpdateSwitchResponse> updateSwitchInvoker(UpdateSwitchRequest request) {
        return new SyncInvoker<UpdateSwitchRequest, UpdateSwitchResponse>(request, LtsMeta.updateSwitch, hcClient);
    }

    /**
     * 更新日志转储
     *
     * 该接口用于更新OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTransferRequest 请求对象
     * @return UpdateTransferResponse
     */
    public UpdateTransferResponse updateTransfer(UpdateTransferRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateTransfer);
    }

    /**
     * 更新日志转储
     *
     * 该接口用于更新OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTransferRequest 请求对象
     * @return SyncInvoker<UpdateTransferRequest, UpdateTransferResponse>
     */
    public SyncInvoker<UpdateTransferRequest, UpdateTransferResponse> updateTransferInvoker(
        UpdateTransferRequest request) {
        return new SyncInvoker<UpdateTransferRequest, UpdateTransferResponse>(request, LtsMeta.updateTransfer,
            hcClient);
    }

    /**
     * 创建接入规则
     *
     * 该接口用于创建aom日志接入lts规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return CreateAomMappingRulesResponse
     */
    public CreateAomMappingRulesResponse createAomMappingRules(CreateAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createAomMappingRules);
    }

    /**
     * 创建接入规则
     *
     * 该接口用于创建aom日志接入lts规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return SyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse>
     */
    public SyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> createAomMappingRulesInvoker(
        CreateAomMappingRulesRequest request) {
        return new SyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse>(request,
            LtsMeta.createAomMappingRules, hcClient);
    }

    /**
     * 删除接入规则
     *
     * 该接口用于删除lts接入规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAomMappingRulesRequest 请求对象
     * @return DeleteAomMappingRulesResponse
     */
    public DeleteAomMappingRulesResponse deleteAomMappingRules(DeleteAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteAomMappingRules);
    }

    /**
     * 删除接入规则
     *
     * 该接口用于删除lts接入规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAomMappingRulesRequest 请求对象
     * @return SyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse>
     */
    public SyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> deleteAomMappingRulesInvoker(
        DeleteAomMappingRulesRequest request) {
        return new SyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse>(request,
            LtsMeta.deleteAomMappingRules, hcClient);
    }

    /**
     * 查询单个接入规则
     *
     * 该接口用于查询单个aom日志接入lts
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return ShowAomMappingRuleResponse
     */
    public ShowAomMappingRuleResponse showAomMappingRule(ShowAomMappingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showAomMappingRule);
    }

    /**
     * 查询单个接入规则
     *
     * 该接口用于查询单个aom日志接入lts
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse>
     */
    public SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRuleInvoker(
        ShowAomMappingRuleRequest request) {
        return new SyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse>(request,
            LtsMeta.showAomMappingRule, hcClient);
    }

    /**
     * 查询所有接入规则
     *
     * 该接口用于查询aom日志所有接入lts规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return ShowAomMappingRulesResponse
     */
    public ShowAomMappingRulesResponse showAomMappingRules(ShowAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.showAomMappingRules);
    }

    /**
     * 查询所有接入规则
     *
     * 该接口用于查询aom日志所有接入lts规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return SyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse>
     */
    public SyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> showAomMappingRulesInvoker(
        ShowAomMappingRulesRequest request) {
        return new SyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse>(request,
            LtsMeta.showAomMappingRules, hcClient);
    }

    /**
     * 修改接入规则
     *
     * 该接口用于修改接入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAomMappingRulesRequest 请求对象
     * @return UpdateAomMappingRulesResponse
     */
    public UpdateAomMappingRulesResponse updateAomMappingRules(UpdateAomMappingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateAomMappingRules);
    }

    /**
     * 修改接入规则
     *
     * 该接口用于修改接入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAomMappingRulesRequest 请求对象
     * @return SyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse>
     */
    public SyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> updateAomMappingRulesInvoker(
        UpdateAomMappingRulesRequest request) {
        return new SyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse>(request,
            LtsMeta.updateAomMappingRules, hcClient);
    }

    /**
     * 创建SQL告警规则
     *
     * 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlAlarmRuleRequest 请求对象
     * @return CreateSqlAlarmRuleResponse
     */
    public CreateSqlAlarmRuleResponse createSqlAlarmRule(CreateSqlAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.createSqlAlarmRule);
    }

    /**
     * 创建SQL告警规则
     *
     * 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlAlarmRuleRequest 请求对象
     * @return SyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse>
     */
    public SyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> createSqlAlarmRuleInvoker(
        CreateSqlAlarmRuleRequest request) {
        return new SyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse>(request,
            LtsMeta.createSqlAlarmRule, hcClient);
    }

    /**
     * 删除SQL告警规则
     *
     * 该接口用于删除SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlAlarmRuleRequest 请求对象
     * @return DeleteSqlAlarmRuleResponse
     */
    public DeleteSqlAlarmRuleResponse deleteSqlAlarmRule(DeleteSqlAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.deleteSqlAlarmRule);
    }

    /**
     * 删除SQL告警规则
     *
     * 该接口用于删除SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlAlarmRuleRequest 请求对象
     * @return SyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse>
     */
    public SyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> deleteSqlAlarmRuleInvoker(
        DeleteSqlAlarmRuleRequest request) {
        return new SyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse>(request,
            LtsMeta.deleteSqlAlarmRule, hcClient);
    }

    /**
     * 查询SQL告警规则
     *
     * 该接口用于查询SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlAlarmRulesRequest 请求对象
     * @return ListSqlAlarmRulesResponse
     */
    public ListSqlAlarmRulesResponse listSqlAlarmRules(ListSqlAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.listSqlAlarmRules);
    }

    /**
     * 查询SQL告警规则
     *
     * 该接口用于查询SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlAlarmRulesRequest 请求对象
     * @return SyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse>
     */
    public SyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> listSqlAlarmRulesInvoker(
        ListSqlAlarmRulesRequest request) {
        return new SyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse>(request, LtsMeta.listSqlAlarmRules,
            hcClient);
    }

    /**
     * 切换告警规则状态
     *
     * 改变告警规则状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmRuleStatusRequest 请求对象
     * @return UpdateAlarmRuleStatusResponse
     */
    public UpdateAlarmRuleStatusResponse updateAlarmRuleStatus(UpdateAlarmRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateAlarmRuleStatus);
    }

    /**
     * 切换告警规则状态
     *
     * 改变告警规则状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmRuleStatusRequest 请求对象
     * @return SyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse>
     */
    public SyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> updateAlarmRuleStatusInvoker(
        UpdateAlarmRuleStatusRequest request) {
        return new SyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse>(request,
            LtsMeta.updateAlarmRuleStatus, hcClient);
    }

    /**
     * 修改SQL告警规则
     *
     * 该接口用于修改SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlAlarmRuleRequest 请求对象
     * @return UpdateSqlAlarmRuleResponse
     */
    public UpdateSqlAlarmRuleResponse updateSqlAlarmRule(UpdateSqlAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LtsMeta.updateSqlAlarmRule);
    }

    /**
     * 修改SQL告警规则
     *
     * 该接口用于修改SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlAlarmRuleRequest 请求对象
     * @return SyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse>
     */
    public SyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> updateSqlAlarmRuleInvoker(
        UpdateSqlAlarmRuleRequest request) {
        return new SyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse>(request,
            LtsMeta.updateSqlAlarmRule, hcClient);
    }

}
