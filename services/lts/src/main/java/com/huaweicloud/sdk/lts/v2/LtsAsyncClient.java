package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.lts.v2.model.ConsumerGroupHeartBeatRequest;
import com.huaweicloud.sdk.lts.v2.model.ConsumerGroupHeartBeatResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateAgencyAccessRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAgencyAccessResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateConsumerGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateConsumerGroupResponse;
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
import com.huaweicloud.sdk.lts.v2.model.DeleteConsumerGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteConsumerGroupResponse;
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
import com.huaweicloud.sdk.lts.v2.model.ListConsumerGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.ListConsumerGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.ListCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.ListCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.ListDetailsConsumerGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.ListDetailsConsumerGroupResponse;
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
import com.huaweicloud.sdk.lts.v2.model.ShowCursorByTimeRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowCursorByTimeResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowCursorTimeRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowCursorTimeResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowLogConvergeConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowLogConvergeConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowLogStreamShardsRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowLogStreamShardsResponse;
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
import com.huaweicloud.sdk.lts.v2.model.UpdateCheckPointRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateCheckPointResponse;
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

import java.util.concurrent.CompletableFuture;

public class LtsAsyncClient {

    protected HcClient hcClient;

    public LtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LtsAsyncClient> newBuilder() {
        ClientBuilder<LtsAsyncClient> clientBuilder = new ClientBuilder<>(LtsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建日志接入
     *
     * 创建日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessConfigRequest 请求对象
     * @return CompletableFuture<CreateAccessConfigResponse>
     */
    public CompletableFuture<CreateAccessConfigResponse> createAccessConfigAsync(CreateAccessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createAccessConfig);
    }

    /**
     * 创建日志接入
     *
     * 创建日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessConfigRequest 请求对象
     * @return AsyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse>
     */
    public AsyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse> createAccessConfigAsyncInvoker(
        CreateAccessConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createAccessConfig, hcClient);
    }

    /**
     * 新建跨账号日志接入
     *
     * 新建跨账号日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyAccessRequest 请求对象
     * @return CompletableFuture<CreateAgencyAccessResponse>
     */
    public CompletableFuture<CreateAgencyAccessResponse> createAgencyAccessAsync(CreateAgencyAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createAgencyAccess);
    }

    /**
     * 新建跨账号日志接入
     *
     * 新建跨账号日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyAccessRequest 请求对象
     * @return AsyncInvoker<CreateAgencyAccessRequest, CreateAgencyAccessResponse>
     */
    public AsyncInvoker<CreateAgencyAccessRequest, CreateAgencyAccessResponse> createAgencyAccessAsyncInvoker(
        CreateAgencyAccessRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createAgencyAccess, hcClient);
    }

    /**
     * 创建仪表盘
     *
     * 创建仪表盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDashBoardRequest 请求对象
     * @return CompletableFuture<CreateDashBoardResponse>
     */
    public CompletableFuture<CreateDashBoardResponse> createDashBoardAsync(CreateDashBoardRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createDashBoard);
    }

    /**
     * 创建仪表盘
     *
     * 创建仪表盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDashBoardRequest 请求对象
     * @return AsyncInvoker<CreateDashBoardRequest, CreateDashBoardResponse>
     */
    public AsyncInvoker<CreateDashBoardRequest, CreateDashBoardResponse> createDashBoardAsyncInvoker(
        CreateDashBoardRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createDashBoard, hcClient);
    }

    /**
     * 创建仪表盘分组
     *
     * 创建仪表盘分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDashboardGroupRequest 请求对象
     * @return CompletableFuture<CreateDashboardGroupResponse>
     */
    public CompletableFuture<CreateDashboardGroupResponse> createDashboardGroupAsync(
        CreateDashboardGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createDashboardGroup);
    }

    /**
     * 创建仪表盘分组
     *
     * 创建仪表盘分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDashboardGroupRequest 请求对象
     * @return AsyncInvoker<CreateDashboardGroupRequest, CreateDashboardGroupResponse>
     */
    public AsyncInvoker<CreateDashboardGroupRequest, CreateDashboardGroupResponse> createDashboardGroupAsyncInvoker(
        CreateDashboardGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createDashboardGroup, hcClient);
    }

    /**
     * 创建主机组
     *
     * 创建主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostGroupRequest 请求对象
     * @return CompletableFuture<CreateHostGroupResponse>
     */
    public CompletableFuture<CreateHostGroupResponse> createHostGroupAsync(CreateHostGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createHostGroup);
    }

    /**
     * 创建主机组
     *
     * 创建主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostGroupRequest 请求对象
     * @return AsyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse>
     */
    public AsyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse> createHostGroupAsyncInvoker(
        CreateHostGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createHostGroup, hcClient);
    }

    /**
     * 创建关键词告警规则
     *
     * 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<CreateKeywordsAlarmRuleResponse>
     */
    public CompletableFuture<CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRuleAsync(
        CreateKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createKeywordsAlarmRule);
    }

    /**
     * 创建关键词告警规则
     *
     * 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse>
     */
    public AsyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRuleAsyncInvoker(
        CreateKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createKeywordsAlarmRule, hcClient);
    }

    /**
     * 创建日志转储（旧版）
     *
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogDumpObsRequest 请求对象
     * @return CompletableFuture<CreateLogDumpObsResponse>
     */
    public CompletableFuture<CreateLogDumpObsResponse> createLogDumpObsAsync(CreateLogDumpObsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogDumpObs);
    }

    /**
     * 创建日志转储（旧版）
     *
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogDumpObsRequest 请求对象
     * @return AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>
     */
    public AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObsAsyncInvoker(
        CreateLogDumpObsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createLogDumpObs, hcClient);
    }

    /**
     * 创建日志组
     *
     * 该接口用于创建一个日志组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogGroupRequest 请求对象
     * @return CompletableFuture<CreateLogGroupResponse>
     */
    public CompletableFuture<CreateLogGroupResponse> createLogGroupAsync(CreateLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogGroup);
    }

    /**
     * 创建日志组
     *
     * 该接口用于创建一个日志组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogGroupRequest 请求对象
     * @return AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>
     */
    public AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroupAsyncInvoker(
        CreateLogGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createLogGroup, hcClient);
    }

    /**
     * 创建日志流
     *
     * 该接口用于创建某个指定日志组下的日志流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogStreamRequest 请求对象
     * @return CompletableFuture<CreateLogStreamResponse>
     */
    public CompletableFuture<CreateLogStreamResponse> createLogStreamAsync(CreateLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogStream);
    }

    /**
     * 创建日志流
     *
     * 该接口用于创建某个指定日志组下的日志流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogStreamRequest 请求对象
     * @return AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>
     */
    public AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> createLogStreamAsyncInvoker(
        CreateLogStreamRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createLogStream, hcClient);
    }

    /**
     * 向指定流创建索引
     *
     * 向指定流创建索引
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogStreamIndexRequest 请求对象
     * @return CompletableFuture<CreateLogStreamIndexResponse>
     */
    public CompletableFuture<CreateLogStreamIndexResponse> createLogStreamIndexAsync(
        CreateLogStreamIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogStreamIndex);
    }

    /**
     * 向指定流创建索引
     *
     * 向指定流创建索引
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogStreamIndexRequest 请求对象
     * @return AsyncInvoker<CreateLogStreamIndexRequest, CreateLogStreamIndexResponse>
     */
    public AsyncInvoker<CreateLogStreamIndexRequest, CreateLogStreamIndexResponse> createLogStreamIndexAsyncInvoker(
        CreateLogStreamIndexRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createLogStreamIndex, hcClient);
    }

    /**
     * 创建消息模板
     *
     * 该接口用于创建通知模板，目前每个帐户最多可以创建共100个通知模板，创建后名称不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotificationTemplateRequest 请求对象
     * @return CompletableFuture<CreateNotificationTemplateResponse>
     */
    public CompletableFuture<CreateNotificationTemplateResponse> createNotificationTemplateAsync(
        CreateNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createNotificationTemplate);
    }

    /**
     * 创建消息模板
     *
     * 该接口用于创建通知模板，目前每个帐户最多可以创建共100个通知模板，创建后名称不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse>
     */
    public AsyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> createNotificationTemplateAsyncInvoker(
        CreateNotificationTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createNotificationTemplate, hcClient);
    }

    /**
     * 添加快速查询
     *
     * 添加快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchCriteriasRequest 请求对象
     * @return CompletableFuture<CreateSearchCriteriasResponse>
     */
    public CompletableFuture<CreateSearchCriteriasResponse> createSearchCriteriasAsync(
        CreateSearchCriteriasRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createSearchCriterias);
    }

    /**
     * 添加快速查询
     *
     * 添加快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchCriteriasRequest 请求对象
     * @return AsyncInvoker<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse>
     */
    public AsyncInvoker<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse> createSearchCriteriasAsyncInvoker(
        CreateSearchCriteriasRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createSearchCriterias, hcClient);
    }

    /**
     * 通过结构化模板创建结构化配置（新）
     *
     * 该接口通过结构化模板创建结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStructConfigRequest 请求对象
     * @return CompletableFuture<CreateStructConfigResponse>
     */
    public CompletableFuture<CreateStructConfigResponse> createStructConfigAsync(CreateStructConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createStructConfig);
    }

    /**
     * 通过结构化模板创建结构化配置（新）
     *
     * 该接口通过结构化模板创建结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStructConfigRequest 请求对象
     * @return AsyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse>
     */
    public AsyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse> createStructConfigAsyncInvoker(
        CreateStructConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createStructConfig, hcClient);
    }

    /**
     * 创建结构化配置
     *
     * 该接口用于创建指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStructTemplateRequest 请求对象
     * @return CompletableFuture<CreateStructTemplateResponse>
     */
    public CompletableFuture<CreateStructTemplateResponse> createStructTemplateAsync(
        CreateStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createStructTemplate);
    }

    /**
     * 创建结构化配置
     *
     * 该接口用于创建指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStructTemplateRequest 请求对象
     * @return AsyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse>
     */
    public AsyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse> createStructTemplateAsyncInvoker(
        CreateStructTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createStructTemplate, hcClient);
    }

    /**
     * 
     *
     * 添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return CompletableFuture<CreateTagsResponse>
     */
    public CompletableFuture<CreateTagsResponse> createTagsAsync(CreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createTags);
    }

    /**
     * 
     *
     * 添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return AsyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public AsyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsAsyncInvoker(CreateTagsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createTags, hcClient);
    }

    /**
     * 创建日志转储（新版）
     *
     * 该接口用于创建OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTransferRequest 请求对象
     * @return CompletableFuture<CreateTransferResponse>
     */
    public CompletableFuture<CreateTransferResponse> createTransferAsync(CreateTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createTransfer);
    }

    /**
     * 创建日志转储（新版）
     *
     * 该接口用于创建OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTransferRequest 请求对象
     * @return AsyncInvoker<CreateTransferRequest, CreateTransferResponse>
     */
    public AsyncInvoker<CreateTransferRequest, CreateTransferResponse> createTransferAsyncInvoker(
        CreateTransferRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createTransfer, hcClient);
    }

    /**
     * 创建日志收藏
     *
     * 创建日志收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatefavoriteRequest 请求对象
     * @return CompletableFuture<CreatefavoriteResponse>
     */
    public CompletableFuture<CreatefavoriteResponse> createfavoriteAsync(CreatefavoriteRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createfavorite);
    }

    /**
     * 创建日志收藏
     *
     * 创建日志收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatefavoriteRequest 请求对象
     * @return AsyncInvoker<CreatefavoriteRequest, CreatefavoriteResponse>
     */
    public AsyncInvoker<CreatefavoriteRequest, CreatefavoriteResponse> createfavoriteAsyncInvoker(
        CreatefavoriteRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createfavorite, hcClient);
    }

    /**
     * 删除日志接入
     *
     * 删除日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessConfigRequest 请求对象
     * @return CompletableFuture<DeleteAccessConfigResponse>
     */
    public CompletableFuture<DeleteAccessConfigResponse> deleteAccessConfigAsync(DeleteAccessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteAccessConfig);
    }

    /**
     * 删除日志接入
     *
     * 删除日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessConfigRequest 请求对象
     * @return AsyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse>
     */
    public AsyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse> deleteAccessConfigAsyncInvoker(
        DeleteAccessConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteAccessConfig, hcClient);
    }

    /**
     * 删除活动告警
     *
     * 该接口用于删除活动告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteActiveAlarmsRequest 请求对象
     * @return CompletableFuture<DeleteActiveAlarmsResponse>
     */
    public CompletableFuture<DeleteActiveAlarmsResponse> deleteActiveAlarmsAsync(DeleteActiveAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteActiveAlarms);
    }

    /**
     * 删除活动告警
     *
     * 该接口用于删除活动告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteActiveAlarmsRequest 请求对象
     * @return AsyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse>
     */
    public AsyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> deleteActiveAlarmsAsyncInvoker(
        DeleteActiveAlarmsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteActiveAlarms, hcClient);
    }

    /**
     * 删除仪表盘
     *
     * 删除仪表盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDashboardRequest 请求对象
     * @return CompletableFuture<DeleteDashboardResponse>
     */
    public CompletableFuture<DeleteDashboardResponse> deleteDashboardAsync(DeleteDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteDashboard);
    }

    /**
     * 删除仪表盘
     *
     * 删除仪表盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDashboardRequest 请求对象
     * @return AsyncInvoker<DeleteDashboardRequest, DeleteDashboardResponse>
     */
    public AsyncInvoker<DeleteDashboardRequest, DeleteDashboardResponse> deleteDashboardAsyncInvoker(
        DeleteDashboardRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteDashboard, hcClient);
    }

    /**
     * 删除主机组
     *
     * 删除主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostGroupRequest 请求对象
     * @return CompletableFuture<DeleteHostGroupResponse>
     */
    public CompletableFuture<DeleteHostGroupResponse> deleteHostGroupAsync(DeleteHostGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteHostGroup);
    }

    /**
     * 删除主机组
     *
     * 删除主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostGroupRequest 请求对象
     * @return AsyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse>
     */
    public AsyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse> deleteHostGroupAsyncInvoker(
        DeleteHostGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteHostGroup, hcClient);
    }

    /**
     * 删除关键词告警规则
     *
     * 该接口用于删除关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteKeywordsAlarmRuleResponse>
     */
    public CompletableFuture<DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRuleAsync(
        DeleteKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteKeywordsAlarmRule);
    }

    /**
     * 删除关键词告警规则
     *
     * 该接口用于删除关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse>
     */
    public AsyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRuleAsyncInvoker(
        DeleteKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteKeywordsAlarmRule, hcClient);
    }

    /**
     * 删除日志组
     *
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogGroupRequest 请求对象
     * @return CompletableFuture<DeleteLogGroupResponse>
     */
    public CompletableFuture<DeleteLogGroupResponse> deleteLogGroupAsync(DeleteLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteLogGroup);
    }

    /**
     * 删除日志组
     *
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogGroupRequest 请求对象
     * @return AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>
     */
    public AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroupAsyncInvoker(
        DeleteLogGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteLogGroup, hcClient);
    }

    /**
     * 删除日志流
     *
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogStreamRequest 请求对象
     * @return CompletableFuture<DeleteLogStreamResponse>
     */
    public CompletableFuture<DeleteLogStreamResponse> deleteLogStreamAsync(DeleteLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteLogStream);
    }

    /**
     * 删除日志流
     *
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogStreamRequest 请求对象
     * @return AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>
     */
    public AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStreamAsyncInvoker(
        DeleteLogStreamRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteLogStream, hcClient);
    }

    /**
     * 删除消息模板
     *
     * 该接口用于删除通知模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotificationTemplateRequest 请求对象
     * @return CompletableFuture<DeleteNotificationTemplateResponse>
     */
    public CompletableFuture<DeleteNotificationTemplateResponse> deleteNotificationTemplateAsync(
        DeleteNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteNotificationTemplate);
    }

    /**
     * 删除消息模板
     *
     * 该接口用于删除通知模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse>
     */
    public AsyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> deleteNotificationTemplateAsyncInvoker(
        DeleteNotificationTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteNotificationTemplate, hcClient);
    }

    /**
     * 删除快速查询
     *
     * 删除快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSearchCriteriasRequest 请求对象
     * @return CompletableFuture<DeleteSearchCriteriasResponse>
     */
    public CompletableFuture<DeleteSearchCriteriasResponse> deleteSearchCriteriasAsync(
        DeleteSearchCriteriasRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteSearchCriterias);
    }

    /**
     * 删除快速查询
     *
     * 删除快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSearchCriteriasRequest 请求对象
     * @return AsyncInvoker<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse>
     */
    public AsyncInvoker<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse> deleteSearchCriteriasAsyncInvoker(
        DeleteSearchCriteriasRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteSearchCriterias, hcClient);
    }

    /**
     * 删除结构化配置
     *
     * 该接口用于删除指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStructTemplateRequest 请求对象
     * @return CompletableFuture<DeleteStructTemplateResponse>
     */
    public CompletableFuture<DeleteStructTemplateResponse> deleteStructTemplateAsync(
        DeleteStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteStructTemplate);
    }

    /**
     * 删除结构化配置
     *
     * 该接口用于删除指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStructTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse>
     */
    public AsyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse> deleteStructTemplateAsyncInvoker(
        DeleteStructTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteStructTemplate, hcClient);
    }

    /**
     * 删除日志转储
     *
     * 该接口用于删除OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTransferRequest 请求对象
     * @return CompletableFuture<DeleteTransferResponse>
     */
    public CompletableFuture<DeleteTransferResponse> deleteTransferAsync(DeleteTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteTransfer);
    }

    /**
     * 删除日志转储
     *
     * 该接口用于删除OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTransferRequest 请求对象
     * @return AsyncInvoker<DeleteTransferRequest, DeleteTransferResponse>
     */
    public AsyncInvoker<DeleteTransferRequest, DeleteTransferResponse> deleteTransferAsyncInvoker(
        DeleteTransferRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteTransfer, hcClient);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletefavoriteRequest 请求对象
     * @return CompletableFuture<DeletefavoriteResponse>
     */
    public CompletableFuture<DeletefavoriteResponse> deletefavoriteAsync(DeletefavoriteRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deletefavorite);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletefavoriteRequest 请求对象
     * @return AsyncInvoker<DeletefavoriteRequest, DeletefavoriteResponse>
     */
    public AsyncInvoker<DeletefavoriteRequest, DeletefavoriteResponse> deletefavoriteAsyncInvoker(
        DeletefavoriteRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deletefavorite, hcClient);
    }

    /**
     * 关闭超额采集开关
     *
     * 该接口用于将超额采集日志功能关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableLogCollectionRequest 请求对象
     * @return CompletableFuture<DisableLogCollectionResponse>
     */
    public CompletableFuture<DisableLogCollectionResponse> disableLogCollectionAsync(
        DisableLogCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.disableLogCollection);
    }

    /**
     * 关闭超额采集开关
     *
     * 该接口用于将超额采集日志功能关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableLogCollectionRequest 请求对象
     * @return AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>
     */
    public AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollectionAsyncInvoker(
        DisableLogCollectionRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.disableLogCollection, hcClient);
    }

    /**
     * 打开超额采集开关
     *
     * 该接口用于将超额采集日志功能打开。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLogCollectionRequest 请求对象
     * @return CompletableFuture<EnableLogCollectionResponse>
     */
    public CompletableFuture<EnableLogCollectionResponse> enableLogCollectionAsync(EnableLogCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.enableLogCollection);
    }

    /**
     * 打开超额采集开关
     *
     * 该接口用于将超额采集日志功能打开。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLogCollectionRequest 请求对象
     * @return AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>
     */
    public AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollectionAsyncInvoker(
        EnableLogCollectionRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.enableLogCollection, hcClient);
    }

    /**
     * 查询日志接入
     *
     * 查询日志接入列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessConfigRequest 请求对象
     * @return CompletableFuture<ListAccessConfigResponse>
     */
    public CompletableFuture<ListAccessConfigResponse> listAccessConfigAsync(ListAccessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listAccessConfig);
    }

    /**
     * 查询日志接入
     *
     * 查询日志接入列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessConfigRequest 请求对象
     * @return AsyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse>
     */
    public AsyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse> listAccessConfigAsyncInvoker(
        ListAccessConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listAccessConfig, hcClient);
    }

    /**
     * 查询活动或历史告警列表
     *
     * 该接口用于查询告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveOrHistoryAlarmsRequest 请求对象
     * @return CompletableFuture<ListActiveOrHistoryAlarmsResponse>
     */
    public CompletableFuture<ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarmsAsync(
        ListActiveOrHistoryAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listActiveOrHistoryAlarms);
    }

    /**
     * 查询活动或历史告警列表
     *
     * 该接口用于查询告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveOrHistoryAlarmsRequest 请求对象
     * @return AsyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse>
     */
    public AsyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarmsAsyncInvoker(
        ListActiveOrHistoryAlarmsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listActiveOrHistoryAlarms, hcClient);
    }

    /**
     * 查询结构化模板简略列表
     *
     * 该接口用于查询结构化模板简略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBreifStructTemplateRequest 请求对象
     * @return CompletableFuture<ListBreifStructTemplateResponse>
     */
    public CompletableFuture<ListBreifStructTemplateResponse> listBreifStructTemplateAsync(
        ListBreifStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listBreifStructTemplate);
    }

    /**
     * 查询结构化模板简略列表
     *
     * 该接口用于查询结构化模板简略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBreifStructTemplateRequest 请求对象
     * @return AsyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse>
     */
    public AsyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> listBreifStructTemplateAsyncInvoker(
        ListBreifStructTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listBreifStructTemplate, hcClient);
    }

    /**
     * 查询日志流图表
     *
     * 该接口用于查询日志流图表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChartsRequest 请求对象
     * @return CompletableFuture<ListChartsResponse>
     */
    public CompletableFuture<ListChartsResponse> listChartsAsync(ListChartsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listCharts);
    }

    /**
     * 查询日志流图表
     *
     * 该接口用于查询日志流图表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChartsRequest 请求对象
     * @return AsyncInvoker<ListChartsRequest, ListChartsResponse>
     */
    public AsyncInvoker<ListChartsRequest, ListChartsResponse> listChartsAsyncInvoker(ListChartsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listCharts, hcClient);
    }

    /**
     * 获取快速查询
     *
     * 获取快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCriteriasRequest 请求对象
     * @return CompletableFuture<ListCriteriasResponse>
     */
    public CompletableFuture<ListCriteriasResponse> listCriteriasAsync(ListCriteriasRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listCriterias);
    }

    /**
     * 获取快速查询
     *
     * 获取快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCriteriasRequest 请求对象
     * @return AsyncInvoker<ListCriteriasRequest, ListCriteriasResponse>
     */
    public AsyncInvoker<ListCriteriasRequest, ListCriteriasResponse> listCriteriasAsyncInvoker(
        ListCriteriasRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listCriterias, hcClient);
    }

    /**
     * 查询用户历史sql
     *
     * 查询用户历史sql
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistorySqlRequest 请求对象
     * @return CompletableFuture<ListHistorySqlResponse>
     */
    public CompletableFuture<ListHistorySqlResponse> listHistorySqlAsync(ListHistorySqlRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listHistorySql);
    }

    /**
     * 查询用户历史sql
     *
     * 查询用户历史sql
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistorySqlRequest 请求对象
     * @return AsyncInvoker<ListHistorySqlRequest, ListHistorySqlResponse>
     */
    public AsyncInvoker<ListHistorySqlRequest, ListHistorySqlResponse> listHistorySqlAsyncInvoker(
        ListHistorySqlRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listHistorySql, hcClient);
    }

    /**
     * 查询主机信息
     *
     * 查询主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRequest 请求对象
     * @return CompletableFuture<ListHostResponse>
     */
    public CompletableFuture<ListHostResponse> listHostAsync(ListHostRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listHost);
    }

    /**
     * 查询主机信息
     *
     * 查询主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRequest 请求对象
     * @return AsyncInvoker<ListHostRequest, ListHostResponse>
     */
    public AsyncInvoker<ListHostRequest, ListHostResponse> listHostAsyncInvoker(ListHostRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listHost, hcClient);
    }

    /**
     * 查询主机组
     *
     * 查询主机组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupRequest 请求对象
     * @return CompletableFuture<ListHostGroupResponse>
     */
    public CompletableFuture<ListHostGroupResponse> listHostGroupAsync(ListHostGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listHostGroup);
    }

    /**
     * 查询主机组
     *
     * 查询主机组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupRequest 请求对象
     * @return AsyncInvoker<ListHostGroupRequest, ListHostGroupResponse>
     */
    public AsyncInvoker<ListHostGroupRequest, ListHostGroupResponse> listHostGroupAsyncInvoker(
        ListHostGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listHostGroup, hcClient);
    }

    /**
     * 查询关键词告警规则
     *
     * 该接口用于查询关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeywordsAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListKeywordsAlarmRulesResponse>
     */
    public CompletableFuture<ListKeywordsAlarmRulesResponse> listKeywordsAlarmRulesAsync(
        ListKeywordsAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listKeywordsAlarmRules);
    }

    /**
     * 查询关键词告警规则
     *
     * 该接口用于查询关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeywordsAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse>
     */
    public AsyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> listKeywordsAlarmRulesAsyncInvoker(
        ListKeywordsAlarmRulesRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listKeywordsAlarmRules, hcClient);
    }

    /**
     * 查询账号下所有日志组
     *
     * 该接口用于查询账号下所有日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogGroupsRequest 请求对象
     * @return CompletableFuture<ListLogGroupsResponse>
     */
    public CompletableFuture<ListLogGroupsResponse> listLogGroupsAsync(ListLogGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogGroups);
    }

    /**
     * 查询账号下所有日志组
     *
     * 该接口用于查询账号下所有日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogGroupsRequest 请求对象
     * @return AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>
     */
    public AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroupsAsyncInvoker(
        ListLogGroupsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listLogGroups, hcClient);
    }

    /**
     * 查询日志直方图
     *
     * 查询关键词搜索条数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogHistogramRequest 请求对象
     * @return CompletableFuture<ListLogHistogramResponse>
     */
    public CompletableFuture<ListLogHistogramResponse> listLogHistogramAsync(ListLogHistogramRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogHistogram);
    }

    /**
     * 查询日志直方图
     *
     * 查询关键词搜索条数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogHistogramRequest 请求对象
     * @return AsyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse>
     */
    public AsyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse> listLogHistogramAsyncInvoker(
        ListLogHistogramRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listLogHistogram, hcClient);
    }

    /**
     * 查询指定日志组下的所有日志流
     *
     * 该接口用于查询指定日志组下的所有日志流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogStreamRequest 请求对象
     * @return CompletableFuture<ListLogStreamResponse>
     */
    public CompletableFuture<ListLogStreamResponse> listLogStreamAsync(ListLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogStream);
    }

    /**
     * 查询指定日志组下的所有日志流
     *
     * 该接口用于查询指定日志组下的所有日志流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogStreamRequest 请求对象
     * @return AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse>
     */
    public AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse> listLogStreamAsyncInvoker(
        ListLogStreamRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listLogStream, hcClient);
    }

    /**
     * 查询日志流信息
     *
     * 该接口用于查询LTS日志流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogStreamsRequest 请求对象
     * @return CompletableFuture<ListLogStreamsResponse>
     */
    public CompletableFuture<ListLogStreamsResponse> listLogStreamsAsync(ListLogStreamsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogStreams);
    }

    /**
     * 查询日志流信息
     *
     * 该接口用于查询LTS日志流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogStreamsRequest 请求对象
     * @return AsyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse>
     */
    public AsyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse> listLogStreamsAsyncInvoker(
        ListLogStreamsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listLogStreams, hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询指定日志流下的日志内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsRequest 请求对象
     * @return CompletableFuture<ListLogsResponse>
     */
    public CompletableFuture<ListLogsResponse> listLogsAsync(ListLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogs);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询指定日志流下的日志内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsRequest 请求对象
     * @return AsyncInvoker<ListLogsRequest, ListLogsResponse>
     */
    public AsyncInvoker<ListLogsRequest, ListLogsResponse> listLogsAsyncInvoker(ListLogsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listLogs, hcClient);
    }

    /**
     * 预览消息模板邮件格式
     *
     * 该接口用于预览通知模板邮件格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationTemplateRequest 请求对象
     * @return CompletableFuture<ListNotificationTemplateResponse>
     */
    public CompletableFuture<ListNotificationTemplateResponse> listNotificationTemplateAsync(
        ListNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listNotificationTemplate);
    }

    /**
     * 预览消息模板邮件格式
     *
     * 该接口用于预览通知模板邮件格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse>
     */
    public AsyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse> listNotificationTemplateAsyncInvoker(
        ListNotificationTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listNotificationTemplate, hcClient);
    }

    /**
     * 查询消息模板
     *
     * 该接口用于查询通知模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationTemplatesRequest 请求对象
     * @return CompletableFuture<ListNotificationTemplatesResponse>
     */
    public CompletableFuture<ListNotificationTemplatesResponse> listNotificationTemplatesAsync(
        ListNotificationTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listNotificationTemplates);
    }

    /**
     * 查询消息模板
     *
     * 该接口用于查询通知模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationTemplatesRequest 请求对象
     * @return AsyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse>
     */
    public AsyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> listNotificationTemplatesAsyncInvoker(
        ListNotificationTemplatesRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listNotificationTemplates, hcClient);
    }

    /**
     * 查询SMN主题
     *
     * 该接口用于查询SMN主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationTopicsRequest 请求对象
     * @return CompletableFuture<ListNotificationTopicsResponse>
     */
    public CompletableFuture<ListNotificationTopicsResponse> listNotificationTopicsAsync(
        ListNotificationTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listNotificationTopics);
    }

    /**
     * 查询SMN主题
     *
     * 该接口用于查询SMN主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationTopicsRequest 请求对象
     * @return AsyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse>
     */
    public AsyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse> listNotificationTopicsAsyncInvoker(
        ListNotificationTopicsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listNotificationTopics, hcClient);
    }

    /**
     * 查询日志组下所有快速查询
     *
     * 查询日志组下所有快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryAllSearchCriteriasRequest 请求对象
     * @return CompletableFuture<ListQueryAllSearchCriteriasResponse>
     */
    public CompletableFuture<ListQueryAllSearchCriteriasResponse> listQueryAllSearchCriteriasAsync(
        ListQueryAllSearchCriteriasRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listQueryAllSearchCriterias);
    }

    /**
     * 查询日志组下所有快速查询
     *
     * 查询日志组下所有快速查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryAllSearchCriteriasRequest 请求对象
     * @return AsyncInvoker<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse>
     */
    public AsyncInvoker<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse> listQueryAllSearchCriteriasAsyncInvoker(
        ListQueryAllSearchCriteriasRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listQueryAllSearchCriterias, hcClient);
    }

    /**
     * 查询结构化日志
     *
     * 该接口用于查询指定日志流下的结构化日志内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryStructuredLogsRequest 请求对象
     * @return CompletableFuture<ListQueryStructuredLogsResponse>
     */
    public CompletableFuture<ListQueryStructuredLogsResponse> listQueryStructuredLogsAsync(
        ListQueryStructuredLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listQueryStructuredLogs);
    }

    /**
     * 查询结构化日志
     *
     * 该接口用于查询指定日志流下的结构化日志内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryStructuredLogsRequest 请求对象
     * @return AsyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>
     */
    public AsyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogsAsyncInvoker(
        ListQueryStructuredLogsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listQueryStructuredLogs, hcClient);
    }

    /**
     * 查询结构化模板
     *
     * 该接口用于查询结构化模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStructTemplateRequest 请求对象
     * @return CompletableFuture<ListStructTemplateResponse>
     */
    public CompletableFuture<ListStructTemplateResponse> listStructTemplateAsync(ListStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listStructTemplate);
    }

    /**
     * 查询结构化模板
     *
     * 该接口用于查询结构化模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStructTemplateRequest 请求对象
     * @return AsyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse>
     */
    public AsyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse> listStructTemplateAsyncInvoker(
        ListStructTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listStructTemplate, hcClient);
    }

    /**
     * 查询结构化日志（新版）
     *
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return CompletableFuture<ListStructuredLogsWithTimeRangeResponse>
     */
    public CompletableFuture<ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeAsync(
        ListStructuredLogsWithTimeRangeRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listStructuredLogsWithTimeRange);
    }

    /**
     * 查询结构化日志（新版）
     *
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return AsyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>
     */
    public AsyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeAsyncInvoker(
        ListStructuredLogsWithTimeRangeRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listStructuredLogsWithTimeRange, hcClient);
    }

    /**
     * 按时间段统计查询资源
     *
     * 按时间段统计查询资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTimeLineTrafficStatisticsRequest 请求对象
     * @return CompletableFuture<ListTimeLineTrafficStatisticsResponse>
     */
    public CompletableFuture<ListTimeLineTrafficStatisticsResponse> listTimeLineTrafficStatisticsAsync(
        ListTimeLineTrafficStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listTimeLineTrafficStatistics);
    }

    /**
     * 按时间段统计查询资源
     *
     * 按时间段统计查询资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTimeLineTrafficStatisticsRequest 请求对象
     * @return AsyncInvoker<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse>
     */
    public AsyncInvoker<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse> listTimeLineTrafficStatisticsAsyncInvoker(
        ListTimeLineTrafficStatisticsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listTimeLineTrafficStatistics, hcClient);
    }

    /**
     * 统计top n的日志组或日志流流量
     *
     * 统计top n的日志组或日志流流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopnTrafficStatisticsRequest 请求对象
     * @return CompletableFuture<ListTopnTrafficStatisticsResponse>
     */
    public CompletableFuture<ListTopnTrafficStatisticsResponse> listTopnTrafficStatisticsAsync(
        ListTopnTrafficStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listTopnTrafficStatistics);
    }

    /**
     * 统计top n的日志组或日志流流量
     *
     * 统计top n的日志组或日志流流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopnTrafficStatisticsRequest 请求对象
     * @return AsyncInvoker<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse>
     */
    public AsyncInvoker<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse> listTopnTrafficStatisticsAsyncInvoker(
        ListTopnTrafficStatisticsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listTopnTrafficStatistics, hcClient);
    }

    /**
     * 查询日志转储
     *
     * 该接口用于查询OBS转储，DIS转储，DMS转储配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransfersRequest 请求对象
     * @return CompletableFuture<ListTransfersResponse>
     */
    public CompletableFuture<ListTransfersResponse> listTransfersAsync(ListTransfersRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listTransfers);
    }

    /**
     * 查询日志转储
     *
     * 该接口用于查询OBS转储，DIS转储，DMS转储配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransfersRequest 请求对象
     * @return AsyncInvoker<ListTransfersRequest, ListTransfersResponse>
     */
    public AsyncInvoker<ListTransfersRequest, ListTransfersResponse> listTransfersAsyncInvoker(
        ListTransfersRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listTransfers, hcClient);
    }

    /**
     * 注册DMS kafka实例
     *
     * 该接口用于注册DMS kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDmsKafkaInstanceRequest 请求对象
     * @return CompletableFuture<RegisterDmsKafkaInstanceResponse>
     */
    public CompletableFuture<RegisterDmsKafkaInstanceResponse> registerDmsKafkaInstanceAsync(
        RegisterDmsKafkaInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.registerDmsKafkaInstance);
    }

    /**
     * 注册DMS kafka实例
     *
     * 该接口用于注册DMS kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDmsKafkaInstanceRequest 请求对象
     * @return AsyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse>
     */
    public AsyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> registerDmsKafkaInstanceAsyncInvoker(
        RegisterDmsKafkaInstanceRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.registerDmsKafkaInstance, hcClient);
    }

    /**
     * 获取日志汇聚开关
     *
     * 只能由管理员或者委托管理员调用    获取日志汇聚开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdminConfigRequest 请求对象
     * @return CompletableFuture<ShowAdminConfigResponse>
     */
    public CompletableFuture<ShowAdminConfigResponse> showAdminConfigAsync(ShowAdminConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showAdminConfig);
    }

    /**
     * 获取日志汇聚开关
     *
     * 只能由管理员或者委托管理员调用    获取日志汇聚开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdminConfigRequest 请求对象
     * @return AsyncInvoker<ShowAdminConfigRequest, ShowAdminConfigResponse>
     */
    public AsyncInvoker<ShowAdminConfigRequest, ShowAdminConfigResponse> showAdminConfigAsyncInvoker(
        ShowAdminConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showAdminConfig, hcClient);
    }

    /**
     * 获取组织成员汇聚配置
     *
     * 只能由组织管理员或者委托管理员调用    获取组织成员汇聚配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogConvergeConfigRequest 请求对象
     * @return CompletableFuture<ShowLogConvergeConfigResponse>
     */
    public CompletableFuture<ShowLogConvergeConfigResponse> showLogConvergeConfigAsync(
        ShowLogConvergeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showLogConvergeConfig);
    }

    /**
     * 获取组织成员汇聚配置
     *
     * 只能由组织管理员或者委托管理员调用    获取组织成员汇聚配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogConvergeConfigRequest 请求对象
     * @return AsyncInvoker<ShowLogConvergeConfigRequest, ShowLogConvergeConfigResponse>
     */
    public AsyncInvoker<ShowLogConvergeConfigRequest, ShowLogConvergeConfigResponse> showLogConvergeConfigAsyncInvoker(
        ShowLogConvergeConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showLogConvergeConfig, hcClient);
    }

    /**
     * 获取组织成员日志组日志流
     *
     * 只能由管理员或者委托管理员调用，获取组织成员日志组日志流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberGroupAndStreamRequest 请求对象
     * @return CompletableFuture<ShowMemberGroupAndStreamResponse>
     */
    public CompletableFuture<ShowMemberGroupAndStreamResponse> showMemberGroupAndStreamAsync(
        ShowMemberGroupAndStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showMemberGroupAndStream);
    }

    /**
     * 获取组织成员日志组日志流
     *
     * 只能由管理员或者委托管理员调用，获取组织成员日志组日志流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberGroupAndStreamRequest 请求对象
     * @return AsyncInvoker<ShowMemberGroupAndStreamRequest, ShowMemberGroupAndStreamResponse>
     */
    public AsyncInvoker<ShowMemberGroupAndStreamRequest, ShowMemberGroupAndStreamResponse> showMemberGroupAndStreamAsyncInvoker(
        ShowMemberGroupAndStreamRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showMemberGroupAndStream, hcClient);
    }

    /**
     * 查询单个消息模板
     *
     * 该接口用于查询单个通知模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationTemplateRequest 请求对象
     * @return CompletableFuture<ShowNotificationTemplateResponse>
     */
    public CompletableFuture<ShowNotificationTemplateResponse> showNotificationTemplateAsync(
        ShowNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showNotificationTemplate);
    }

    /**
     * 查询单个消息模板
     *
     * 该接口用于查询单个通知模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse>
     */
    public AsyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> showNotificationTemplateAsyncInvoker(
        ShowNotificationTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showNotificationTemplate, hcClient);
    }

    /**
     * 查询结构化配置
     *
     * 该接口用于查询指定日志流下的结构化配置内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStructTemplateRequest 请求对象
     * @return CompletableFuture<ShowStructTemplateResponse>
     */
    public CompletableFuture<ShowStructTemplateResponse> showStructTemplateAsync(ShowStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showStructTemplate);
    }

    /**
     * 查询结构化配置
     *
     * 该接口用于查询指定日志流下的结构化配置内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStructTemplateRequest 请求对象
     * @return AsyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse>
     */
    public AsyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse> showStructTemplateAsyncInvoker(
        ShowStructTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showStructTemplate, hcClient);
    }

    /**
     * 修改日志接入
     *
     * 修改日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessConfigRequest 请求对象
     * @return CompletableFuture<UpdateAccessConfigResponse>
     */
    public CompletableFuture<UpdateAccessConfigResponse> updateAccessConfigAsync(UpdateAccessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateAccessConfig);
    }

    /**
     * 修改日志接入
     *
     * 修改日志接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse>
     */
    public AsyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse> updateAccessConfigAsyncInvoker(
        UpdateAccessConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateAccessConfig, hcClient);
    }

    /**
     * 修改主机组
     *
     * 修改主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostGroupRequest 请求对象
     * @return CompletableFuture<UpdateHostGroupResponse>
     */
    public CompletableFuture<UpdateHostGroupResponse> updateHostGroupAsync(UpdateHostGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateHostGroup);
    }

    /**
     * 修改主机组
     *
     * 修改主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostGroupRequest 请求对象
     * @return AsyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse>
     */
    public AsyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse> updateHostGroupAsyncInvoker(
        UpdateHostGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateHostGroup, hcClient);
    }

    /**
     * 修改关键词告警规则
     *
     * 该接口用于修改关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<UpdateKeywordsAlarmRuleResponse>
     */
    public CompletableFuture<UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRuleAsync(
        UpdateKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateKeywordsAlarmRule);
    }

    /**
     * 修改关键词告警规则
     *
     * 该接口用于修改关键词告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse>
     */
    public AsyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRuleAsyncInvoker(
        UpdateKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateKeywordsAlarmRule, hcClient);
    }

    /**
     * 更新汇聚配置
     *
     * 只能由管理员或者委托管理员 ,更新汇聚配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConvergeConfigRequest 请求对象
     * @return CompletableFuture<UpdateLogConvergeConfigResponse>
     */
    public CompletableFuture<UpdateLogConvergeConfigResponse> updateLogConvergeConfigAsync(
        UpdateLogConvergeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogConvergeConfig);
    }

    /**
     * 更新汇聚配置
     *
     * 只能由管理员或者委托管理员 ,更新汇聚配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConvergeConfigRequest 请求对象
     * @return AsyncInvoker<UpdateLogConvergeConfigRequest, UpdateLogConvergeConfigResponse>
     */
    public AsyncInvoker<UpdateLogConvergeConfigRequest, UpdateLogConvergeConfigResponse> updateLogConvergeConfigAsyncInvoker(
        UpdateLogConvergeConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateLogConvergeConfig, hcClient);
    }

    /**
     * 修改日志组
     *
     * 该接口用于修改指定日志组下的日志存储时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogGroupRequest 请求对象
     * @return CompletableFuture<UpdateLogGroupResponse>
     */
    public CompletableFuture<UpdateLogGroupResponse> updateLogGroupAsync(UpdateLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogGroup);
    }

    /**
     * 修改日志组
     *
     * 该接口用于修改指定日志组下的日志存储时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogGroupRequest 请求对象
     * @return AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>
     */
    public AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroupAsyncInvoker(
        UpdateLogGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateLogGroup, hcClient);
    }

    /**
     * 修改日志流
     *
     * 该接口用于修改指定日志流下的日志存储时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogStreamRequest 请求对象
     * @return CompletableFuture<UpdateLogStreamResponse>
     */
    public CompletableFuture<UpdateLogStreamResponse> updateLogStreamAsync(UpdateLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogStream);
    }

    /**
     * 修改日志流
     *
     * 该接口用于修改指定日志流下的日志存储时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogStreamRequest 请求对象
     * @return AsyncInvoker<UpdateLogStreamRequest, UpdateLogStreamResponse>
     */
    public AsyncInvoker<UpdateLogStreamRequest, UpdateLogStreamResponse> updateLogStreamAsyncInvoker(
        UpdateLogStreamRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateLogStream, hcClient);
    }

    /**
     * 修改消息模板
     *
     * 该接口用于修改通知模板,根据名称进行修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationTemplateRequest 请求对象
     * @return CompletableFuture<UpdateNotificationTemplateResponse>
     */
    public CompletableFuture<UpdateNotificationTemplateResponse> updateNotificationTemplateAsync(
        UpdateNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateNotificationTemplate);
    }

    /**
     * 修改消息模板
     *
     * 该接口用于修改通知模板,根据名称进行修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse>
     */
    public AsyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> updateNotificationTemplateAsyncInvoker(
        UpdateNotificationTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateNotificationTemplate, hcClient);
    }

    /**
     * 通过结构化模板修改结构化配置（新）
     *
     * 该接口通过结构化模板修改结构化配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStructConfigRequest 请求对象
     * @return CompletableFuture<UpdateStructConfigResponse>
     */
    public CompletableFuture<UpdateStructConfigResponse> updateStructConfigAsync(UpdateStructConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateStructConfig);
    }

    /**
     * 通过结构化模板修改结构化配置（新）
     *
     * 该接口通过结构化模板修改结构化配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStructConfigRequest 请求对象
     * @return AsyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse>
     */
    public AsyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse> updateStructConfigAsyncInvoker(
        UpdateStructConfigRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateStructConfig, hcClient);
    }

    /**
     * 修改结构化配置
     *
     * 该接口用于修改指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStructTemplateRequest 请求对象
     * @return CompletableFuture<UpdateStructTemplateResponse>
     */
    public CompletableFuture<UpdateStructTemplateResponse> updateStructTemplateAsync(
        UpdateStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateStructTemplate);
    }

    /**
     * 修改结构化配置
     *
     * 该接口用于修改指定日志流下的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStructTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse>
     */
    public AsyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse> updateStructTemplateAsyncInvoker(
        UpdateStructTemplateRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateStructTemplate, hcClient);
    }

    /**
     * 修改日志汇聚开关
     *
     * 只能由管理员或者委托管理员调用     修改日志汇聚开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSwitchRequest 请求对象
     * @return CompletableFuture<UpdateSwitchResponse>
     */
    public CompletableFuture<UpdateSwitchResponse> updateSwitchAsync(UpdateSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateSwitch);
    }

    /**
     * 修改日志汇聚开关
     *
     * 只能由管理员或者委托管理员调用     修改日志汇聚开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateSwitchRequest, UpdateSwitchResponse>
     */
    public AsyncInvoker<UpdateSwitchRequest, UpdateSwitchResponse> updateSwitchAsyncInvoker(
        UpdateSwitchRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateSwitch, hcClient);
    }

    /**
     * 更新日志转储
     *
     * 该接口用于更新OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTransferRequest 请求对象
     * @return CompletableFuture<UpdateTransferResponse>
     */
    public CompletableFuture<UpdateTransferResponse> updateTransferAsync(UpdateTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateTransfer);
    }

    /**
     * 更新日志转储
     *
     * 该接口用于更新OBS转储，DIS转储，DMS转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTransferRequest 请求对象
     * @return AsyncInvoker<UpdateTransferRequest, UpdateTransferResponse>
     */
    public AsyncInvoker<UpdateTransferRequest, UpdateTransferResponse> updateTransferAsyncInvoker(
        UpdateTransferRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateTransfer, hcClient);
    }

    /**
     * 创建接入规则
     *
     * 该接口用于创建aom日志接入lts规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAomMappingRulesRequest 请求对象
     * @return CompletableFuture<CreateAomMappingRulesResponse>
     */
    public CompletableFuture<CreateAomMappingRulesResponse> createAomMappingRulesAsync(
        CreateAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createAomMappingRules);
    }

    /**
     * 创建接入规则
     *
     * 该接口用于创建aom日志接入lts规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse>
     */
    public AsyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> createAomMappingRulesAsyncInvoker(
        CreateAomMappingRulesRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createAomMappingRules, hcClient);
    }

    /**
     * 删除接入规则
     *
     * 该接口用于删除lts接入规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAomMappingRulesRequest 请求对象
     * @return CompletableFuture<DeleteAomMappingRulesResponse>
     */
    public CompletableFuture<DeleteAomMappingRulesResponse> deleteAomMappingRulesAsync(
        DeleteAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteAomMappingRules);
    }

    /**
     * 删除接入规则
     *
     * 该接口用于删除lts接入规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse>
     */
    public AsyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> deleteAomMappingRulesAsyncInvoker(
        DeleteAomMappingRulesRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteAomMappingRules, hcClient);
    }

    /**
     * 查询单个接入规则
     *
     * 该接口用于查询单个aom日志接入lts
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAomMappingRuleRequest 请求对象
     * @return CompletableFuture<ShowAomMappingRuleResponse>
     */
    public CompletableFuture<ShowAomMappingRuleResponse> showAomMappingRuleAsync(ShowAomMappingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showAomMappingRule);
    }

    /**
     * 查询单个接入规则
     *
     * 该接口用于查询单个aom日志接入lts
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAomMappingRuleRequest 请求对象
     * @return AsyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse>
     */
    public AsyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRuleAsyncInvoker(
        ShowAomMappingRuleRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showAomMappingRule, hcClient);
    }

    /**
     * 查询所有接入规则
     *
     * 该接口用于查询aom日志所有接入lts规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAomMappingRulesRequest 请求对象
     * @return CompletableFuture<ShowAomMappingRulesResponse>
     */
    public CompletableFuture<ShowAomMappingRulesResponse> showAomMappingRulesAsync(ShowAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showAomMappingRules);
    }

    /**
     * 查询所有接入规则
     *
     * 该接口用于查询aom日志所有接入lts规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse>
     */
    public AsyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> showAomMappingRulesAsyncInvoker(
        ShowAomMappingRulesRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showAomMappingRules, hcClient);
    }

    /**
     * 修改接入规则
     *
     * 该接口用于修改接入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAomMappingRulesRequest 请求对象
     * @return CompletableFuture<UpdateAomMappingRulesResponse>
     */
    public CompletableFuture<UpdateAomMappingRulesResponse> updateAomMappingRulesAsync(
        UpdateAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateAomMappingRules);
    }

    /**
     * 修改接入规则
     *
     * 该接口用于修改接入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse>
     */
    public AsyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> updateAomMappingRulesAsyncInvoker(
        UpdateAomMappingRulesRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateAomMappingRules, hcClient);
    }

    /**
     * 消费者发送心跳到服务端
     *
     * 消费者发送心跳到服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConsumerGroupHeartBeatRequest 请求对象
     * @return CompletableFuture<ConsumerGroupHeartBeatResponse>
     */
    public CompletableFuture<ConsumerGroupHeartBeatResponse> consumerGroupHeartBeatAsync(
        ConsumerGroupHeartBeatRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.consumerGroupHeartBeat);
    }

    /**
     * 消费者发送心跳到服务端
     *
     * 消费者发送心跳到服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConsumerGroupHeartBeatRequest 请求对象
     * @return AsyncInvoker<ConsumerGroupHeartBeatRequest, ConsumerGroupHeartBeatResponse>
     */
    public AsyncInvoker<ConsumerGroupHeartBeatRequest, ConsumerGroupHeartBeatResponse> consumerGroupHeartBeatAsyncInvoker(
        ConsumerGroupHeartBeatRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.consumerGroupHeartBeat, hcClient);
    }

    /**
     * 创建消费组
     *
     * 创建消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConsumerGroupRequest 请求对象
     * @return CompletableFuture<CreateConsumerGroupResponse>
     */
    public CompletableFuture<CreateConsumerGroupResponse> createConsumerGroupAsync(CreateConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createConsumerGroup);
    }

    /**
     * 创建消费组
     *
     * 创建消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConsumerGroupRequest 请求对象
     * @return AsyncInvoker<CreateConsumerGroupRequest, CreateConsumerGroupResponse>
     */
    public AsyncInvoker<CreateConsumerGroupRequest, CreateConsumerGroupResponse> createConsumerGroupAsyncInvoker(
        CreateConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createConsumerGroup, hcClient);
    }

    /**
     * 删除消费组
     *
     * 删除消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupRequest 请求对象
     * @return CompletableFuture<DeleteConsumerGroupResponse>
     */
    public CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroupAsync(DeleteConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteConsumerGroup);
    }

    /**
     * 删除消费组
     *
     * 删除消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupRequest 请求对象
     * @return AsyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse>
     */
    public AsyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroupAsyncInvoker(
        DeleteConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteConsumerGroup, hcClient);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumerGroupRequest 请求对象
     * @return CompletableFuture<ListConsumerGroupResponse>
     */
    public CompletableFuture<ListConsumerGroupResponse> listConsumerGroupAsync(ListConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listConsumerGroup);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumerGroupRequest 请求对象
     * @return AsyncInvoker<ListConsumerGroupRequest, ListConsumerGroupResponse>
     */
    public AsyncInvoker<ListConsumerGroupRequest, ListConsumerGroupResponse> listConsumerGroupAsyncInvoker(
        ListConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listConsumerGroup, hcClient);
    }

    /**
     * 查询消费组详情
     *
     * 查询消费组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDetailsConsumerGroupRequest 请求对象
     * @return CompletableFuture<ListDetailsConsumerGroupResponse>
     */
    public CompletableFuture<ListDetailsConsumerGroupResponse> listDetailsConsumerGroupAsync(
        ListDetailsConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listDetailsConsumerGroup);
    }

    /**
     * 查询消费组详情
     *
     * 查询消费组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDetailsConsumerGroupRequest 请求对象
     * @return AsyncInvoker<ListDetailsConsumerGroupRequest, ListDetailsConsumerGroupResponse>
     */
    public AsyncInvoker<ListDetailsConsumerGroupRequest, ListDetailsConsumerGroupResponse> listDetailsConsumerGroupAsyncInvoker(
        ListDetailsConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listDetailsConsumerGroup, hcClient);
    }

    /**
     * 通过时间获取消费游标
     *
     * 通过时间查询cursor
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCursorByTimeRequest 请求对象
     * @return CompletableFuture<ShowCursorByTimeResponse>
     */
    public CompletableFuture<ShowCursorByTimeResponse> showCursorByTimeAsync(ShowCursorByTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showCursorByTime);
    }

    /**
     * 通过时间获取消费游标
     *
     * 通过时间查询cursor
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCursorByTimeRequest 请求对象
     * @return AsyncInvoker<ShowCursorByTimeRequest, ShowCursorByTimeResponse>
     */
    public AsyncInvoker<ShowCursorByTimeRequest, ShowCursorByTimeResponse> showCursorByTimeAsyncInvoker(
        ShowCursorByTimeRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showCursorByTime, hcClient);
    }

    /**
     * 通过消费游标获取时间
     *
     * 通过cursor查询服务端时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCursorTimeRequest 请求对象
     * @return CompletableFuture<ShowCursorTimeResponse>
     */
    public CompletableFuture<ShowCursorTimeResponse> showCursorTimeAsync(ShowCursorTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showCursorTime);
    }

    /**
     * 通过消费游标获取时间
     *
     * 通过cursor查询服务端时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCursorTimeRequest 请求对象
     * @return AsyncInvoker<ShowCursorTimeRequest, ShowCursorTimeResponse>
     */
    public AsyncInvoker<ShowCursorTimeRequest, ShowCursorTimeResponse> showCursorTimeAsyncInvoker(
        ShowCursorTimeRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showCursorTime, hcClient);
    }

    /**
     * 流消费获取Shards
     *
     * 流消费获取所有的query shards
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogStreamShardsRequest 请求对象
     * @return CompletableFuture<ShowLogStreamShardsResponse>
     */
    public CompletableFuture<ShowLogStreamShardsResponse> showLogStreamShardsAsync(ShowLogStreamShardsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showLogStreamShards);
    }

    /**
     * 流消费获取Shards
     *
     * 流消费获取所有的query shards
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogStreamShardsRequest 请求对象
     * @return AsyncInvoker<ShowLogStreamShardsRequest, ShowLogStreamShardsResponse>
     */
    public AsyncInvoker<ShowLogStreamShardsRequest, ShowLogStreamShardsResponse> showLogStreamShardsAsyncInvoker(
        ShowLogStreamShardsRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.showLogStreamShards, hcClient);
    }

    /**
     * 更新消费组位点
     *
     * 更新消费组位点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCheckPointRequest 请求对象
     * @return CompletableFuture<UpdateCheckPointResponse>
     */
    public CompletableFuture<UpdateCheckPointResponse> updateCheckPointAsync(UpdateCheckPointRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateCheckPoint);
    }

    /**
     * 更新消费组位点
     *
     * 更新消费组位点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCheckPointRequest 请求对象
     * @return AsyncInvoker<UpdateCheckPointRequest, UpdateCheckPointResponse>
     */
    public AsyncInvoker<UpdateCheckPointRequest, UpdateCheckPointResponse> updateCheckPointAsyncInvoker(
        UpdateCheckPointRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateCheckPoint, hcClient);
    }

    /**
     * 创建SQL告警规则
     *
     * 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<CreateSqlAlarmRuleResponse>
     */
    public CompletableFuture<CreateSqlAlarmRuleResponse> createSqlAlarmRuleAsync(CreateSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createSqlAlarmRule);
    }

    /**
     * 创建SQL告警规则
     *
     * 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse>
     */
    public AsyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> createSqlAlarmRuleAsyncInvoker(
        CreateSqlAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.createSqlAlarmRule, hcClient);
    }

    /**
     * 删除SQL告警规则
     *
     * 该接口用于删除SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteSqlAlarmRuleResponse>
     */
    public CompletableFuture<DeleteSqlAlarmRuleResponse> deleteSqlAlarmRuleAsync(DeleteSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteSqlAlarmRule);
    }

    /**
     * 删除SQL告警规则
     *
     * 该接口用于删除SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse>
     */
    public AsyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> deleteSqlAlarmRuleAsyncInvoker(
        DeleteSqlAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.deleteSqlAlarmRule, hcClient);
    }

    /**
     * 查询SQL告警规则
     *
     * 该接口用于查询SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListSqlAlarmRulesResponse>
     */
    public CompletableFuture<ListSqlAlarmRulesResponse> listSqlAlarmRulesAsync(ListSqlAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listSqlAlarmRules);
    }

    /**
     * 查询SQL告警规则
     *
     * 该接口用于查询SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse>
     */
    public AsyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> listSqlAlarmRulesAsyncInvoker(
        ListSqlAlarmRulesRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.listSqlAlarmRules, hcClient);
    }

    /**
     * 切换告警规则状态
     *
     * 改变告警规则状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRuleStatusRequest 请求对象
     * @return CompletableFuture<UpdateAlarmRuleStatusResponse>
     */
    public CompletableFuture<UpdateAlarmRuleStatusResponse> updateAlarmRuleStatusAsync(
        UpdateAlarmRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateAlarmRuleStatus);
    }

    /**
     * 切换告警规则状态
     *
     * 改变告警规则状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRuleStatusRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse>
     */
    public AsyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> updateAlarmRuleStatusAsyncInvoker(
        UpdateAlarmRuleStatusRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateAlarmRuleStatus, hcClient);
    }

    /**
     * 修改SQL告警规则
     *
     * 该接口用于修改SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<UpdateSqlAlarmRuleResponse>
     */
    public CompletableFuture<UpdateSqlAlarmRuleResponse> updateSqlAlarmRuleAsync(UpdateSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateSqlAlarmRule);
    }

    /**
     * 修改SQL告警规则
     *
     * 该接口用于修改SQL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse>
     */
    public AsyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> updateSqlAlarmRuleAsyncInvoker(
        UpdateSqlAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, LtsMeta.updateSqlAlarmRule, hcClient);
    }

}
