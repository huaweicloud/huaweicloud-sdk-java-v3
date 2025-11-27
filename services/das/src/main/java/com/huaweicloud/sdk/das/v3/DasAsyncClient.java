package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.das.v3.model.AddEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.AddEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskRequest;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskResponse;
import com.huaweicloud.sdk.das.v3.model.AddInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.AddInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.AddInstanceToGroupRequest;
import com.huaweicloud.sdk.das.v3.model.AddInstanceToGroupResponse;
import com.huaweicloud.sdk.das.v3.model.BatchSendEmailRequest;
import com.huaweicloud.sdk.das.v3.model.BatchSendEmailResponse;
import com.huaweicloud.sdk.das.v3.model.BatchSubscribeReportRequest;
import com.huaweicloud.sdk.das.v3.model.BatchSubscribeReportResponse;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialForBatchInspectionRequest;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialForBatchInspectionResponse;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionRequest;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionResponse;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSnapshotsRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSnapshotsResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.CreateTuningRequest;
import com.huaweicloud.sdk.das.v3.model.CreateTuningResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.ExportFullSqlDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportFullSqlDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowQueryLogsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowQueryLogsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlStatisticsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlStatisticsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlTemplatesDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlTemplatesDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlTrendDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlTrendDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSqlStatementsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSqlStatementsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportTopRiskInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.ExportTopRiskInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTemplatesDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTemplatesDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTrendDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTrendDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageRequest;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageResponse;
import com.huaweicloud.sdk.das.v3.model.ListCloudDbaInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.ListCloudDbaInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.ListConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.das.v3.model.ListEmailRecordRequest;
import com.huaweicloud.sdk.das.v3.model.ListEmailRecordResponse;
import com.huaweicloud.sdk.das.v3.model.ListEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.ListEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.ListFullSqlTasksRequest;
import com.huaweicloud.sdk.das.v3.model.ListFullSqlTasksResponse;
import com.huaweicloud.sdk.das.v3.model.ListHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ListHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ListHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ListHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListInspectionReportRequest;
import com.huaweicloud.sdk.das.v3.model.ListInspectionReportResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceDistributionRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceDistributionResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceMultiNodesSingleMetricRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceMultiNodesSingleMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceNodesInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceNodesInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceTopSlowLogRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceTopSlowLogResponse;
import com.huaweicloud.sdk.das.v3.model.ListMetadataLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListMetadataLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListProcessesRequest;
import com.huaweicloud.sdk.das.v3.model.ListProcessesResponse;
import com.huaweicloud.sdk.das.v3.model.ListRiskItemsRequest;
import com.huaweicloud.sdk.das.v3.model.ListRiskItemsResponse;
import com.huaweicloud.sdk.das.v3.model.ListRiskTrendRequest;
import com.huaweicloud.sdk.das.v3.model.ListRiskTrendResponse;
import com.huaweicloud.sdk.das.v3.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.das.v3.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisRequest;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.ListTopSlowLogRequest;
import com.huaweicloud.sdk.das.v3.model.ListTopSlowLogResponse;
import com.huaweicloud.sdk.das.v3.model.ListTransactionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListTransactionsResponse;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountRequest;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountResponse;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountRequest;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountResponse;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialForBatchInspectionRequest;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialForBatchInspectionResponse;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricRequest;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.das.v3.model.ShowCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.ShowCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDasRecommendSqlLimitRuleRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDasRecommendSqlLimitRuleResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockListRequest;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockListResponse;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ShowHealthReportSettingsRequest;
import com.huaweicloud.sdk.das.v3.model.ShowHealthReportSettingsResponse;
import com.huaweicloud.sdk.das.v3.model.ShowHistoryTransactionExportTaskInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowHistoryTransactionExportTaskInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReportRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReportResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLatestDeadLockSnapshotRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLatestDeadLockSnapshotResponse;
import com.huaweicloud.sdk.das.v3.model.ShowMetricNamesSupportRequest;
import com.huaweicloud.sdk.das.v3.model.ShowMetricNamesSupportResponse;
import com.huaweicloud.sdk.das.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.das.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExecutionPlanRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExecutionPlanResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExplainRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExplainResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitJobInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitJobInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowTransactionSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowTransactionSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowTuningRequest;
import com.huaweicloud.sdk.das.v3.model.ShowTuningResponse;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesResponse;

import java.util.concurrent.CompletableFuture;

public class DasAsyncClient {

    protected HcClient hcClient;

    public DasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DasAsyncClient> newBuilder() {
        ClientBuilder<DasAsyncClient> clientBuilder = new ClientBuilder<>(DasAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 删除共享链接
     *
     * 删除共享链接，
     * 用于用户删除共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelShareConnectionsRequest 请求对象
     * @return CompletableFuture<CancelShareConnectionsResponse>
     */
    public CompletableFuture<CancelShareConnectionsResponse> cancelShareConnectionsAsync(
        CancelShareConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.cancelShareConnections);
    }

    /**
     * 删除共享链接
     *
     * 删除共享链接，
     * 用于用户删除共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelShareConnectionsRequest 请求对象
     * @return AsyncInvoker<CancelShareConnectionsRequest, CancelShareConnectionsResponse>
     */
    public AsyncInvoker<CancelShareConnectionsRequest, CancelShareConnectionsResponse> cancelShareConnectionsAsyncInvoker(
        CancelShareConnectionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.cancelShareConnections, hcClient);
    }

    /**
     * 创建实例连接
     *
     * 创建实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceConnectionRequest 请求对象
     * @return CompletableFuture<CreateInstanceConnectionResponse>
     */
    public CompletableFuture<CreateInstanceConnectionResponse> createInstanceConnectionAsync(
        CreateInstanceConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createInstanceConnection);
    }

    /**
     * 创建实例连接
     *
     * 创建实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceConnectionRequest 请求对象
     * @return AsyncInvoker<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse>
     */
    public AsyncInvoker<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse> createInstanceConnectionAsyncInvoker(
        CreateInstanceConnectionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createInstanceConnection, hcClient);
    }

    /**
     * 设置共享链接
     *
     * 设置共享链接，
     * 用于用户添加共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareConnectionsRequest 请求对象
     * @return CompletableFuture<CreateShareConnectionsResponse>
     */
    public CompletableFuture<CreateShareConnectionsResponse> createShareConnectionsAsync(
        CreateShareConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createShareConnections);
    }

    /**
     * 设置共享链接
     *
     * 设置共享链接，
     * 用于用户添加共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareConnectionsRequest 请求对象
     * @return AsyncInvoker<CreateShareConnectionsRequest, CreateShareConnectionsResponse>
     */
    public AsyncInvoker<CreateShareConnectionsRequest, CreateShareConnectionsResponse> createShareConnectionsAsyncInvoker(
        CreateShareConnectionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createShareConnections, hcClient);
    }

    /**
     * 查询实例连接列表
     *
     * 查询实例连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listConnections);
    }

    /**
     * 查询实例连接列表
     *
     * 查询实例连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listConnections, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showApiVersion, hcClient);
    }

    /**
     * 新增邮件模板
     *
     * 新增邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEmailTemplateRequest 请求对象
     * @return CompletableFuture<AddEmailTemplateResponse>
     */
    public CompletableFuture<AddEmailTemplateResponse> addEmailTemplateAsync(AddEmailTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addEmailTemplate);
    }

    /**
     * 新增邮件模板
     *
     * 新增邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEmailTemplateRequest 请求对象
     * @return AsyncInvoker<AddEmailTemplateRequest, AddEmailTemplateResponse>
     */
    public AsyncInvoker<AddEmailTemplateRequest, AddEmailTemplateResponse> addEmailTemplateAsyncInvoker(
        AddEmailTemplateRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addEmailTemplate, hcClient);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFullSqlTaskRequest 请求对象
     * @return CompletableFuture<AddFullSqlTaskResponse>
     */
    public CompletableFuture<AddFullSqlTaskResponse> addFullSqlTaskAsync(AddFullSqlTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addFullSqlTask);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFullSqlTaskRequest 请求对象
     * @return AsyncInvoker<AddFullSqlTaskRequest, AddFullSqlTaskResponse>
     */
    public AsyncInvoker<AddFullSqlTaskRequest, AddFullSqlTaskResponse> addFullSqlTaskAsyncInvoker(
        AddFullSqlTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addFullSqlTask, hcClient);
    }

    /**
     * 新增实例组
     *
     * 新增实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceGroupRequest 请求对象
     * @return CompletableFuture<AddInstanceGroupResponse>
     */
    public CompletableFuture<AddInstanceGroupResponse> addInstanceGroupAsync(AddInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addInstanceGroup);
    }

    /**
     * 新增实例组
     *
     * 新增实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceGroupRequest 请求对象
     * @return AsyncInvoker<AddInstanceGroupRequest, AddInstanceGroupResponse>
     */
    public AsyncInvoker<AddInstanceGroupRequest, AddInstanceGroupResponse> addInstanceGroupAsyncInvoker(
        AddInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addInstanceGroup, hcClient);
    }

    /**
     * 将实例添加到实例组
     *
     * 将实例添加到实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceToGroupRequest 请求对象
     * @return CompletableFuture<AddInstanceToGroupResponse>
     */
    public CompletableFuture<AddInstanceToGroupResponse> addInstanceToGroupAsync(AddInstanceToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addInstanceToGroup);
    }

    /**
     * 将实例添加到实例组
     *
     * 将实例添加到实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceToGroupRequest 请求对象
     * @return AsyncInvoker<AddInstanceToGroupRequest, AddInstanceToGroupResponse>
     */
    public AsyncInvoker<AddInstanceToGroupRequest, AddInstanceToGroupResponse> addInstanceToGroupAsyncInvoker(
        AddInstanceToGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addInstanceToGroup, hcClient);
    }

    /**
     * 批量发送邮件
     *
     * 批量发送邮件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendEmailRequest 请求对象
     * @return CompletableFuture<BatchSendEmailResponse>
     */
    public CompletableFuture<BatchSendEmailResponse> batchSendEmailAsync(BatchSendEmailRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.batchSendEmail);
    }

    /**
     * 批量发送邮件
     *
     * 批量发送邮件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendEmailRequest 请求对象
     * @return AsyncInvoker<BatchSendEmailRequest, BatchSendEmailResponse>
     */
    public AsyncInvoker<BatchSendEmailRequest, BatchSendEmailResponse> batchSendEmailAsyncInvoker(
        BatchSendEmailRequest request) {
        return new AsyncInvoker<>(request, DasMeta.batchSendEmail, hcClient);
    }

    /**
     * 批量订阅/取消订阅
     *
     * 批量订阅/取消订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSubscribeReportRequest 请求对象
     * @return CompletableFuture<BatchSubscribeReportResponse>
     */
    public CompletableFuture<BatchSubscribeReportResponse> batchSubscribeReportAsync(
        BatchSubscribeReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.batchSubscribeReport);
    }

    /**
     * 批量订阅/取消订阅
     *
     * 批量订阅/取消订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSubscribeReportRequest 请求对象
     * @return AsyncInvoker<BatchSubscribeReportRequest, BatchSubscribeReportResponse>
     */
    public AsyncInvoker<BatchSubscribeReportRequest, BatchSubscribeReportResponse> batchSubscribeReportAsyncInvoker(
        BatchSubscribeReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.batchSubscribeReport, hcClient);
    }

    /**
     * 设置付费模式
     *
     * 设置付费实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeChargeModeRequest 请求对象
     * @return CompletableFuture<ChangeChargeModeResponse>
     */
    public CompletableFuture<ChangeChargeModeResponse> changeChargeModeAsync(ChangeChargeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeChargeMode);
    }

    /**
     * 设置付费模式
     *
     * 设置付费实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeChargeModeRequest 请求对象
     * @return AsyncInvoker<ChangeChargeModeRequest, ChangeChargeModeResponse>
     */
    public AsyncInvoker<ChangeChargeModeRequest, ChangeChargeModeResponse> changeChargeModeAsyncInvoker(
        ChangeChargeModeRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeChargeMode, hcClient);
    }

    /**
     * 设置全量死锁开关
     *
     * 设置全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFullDeadLockSwitchRequest 请求对象
     * @return CompletableFuture<ChangeFullDeadLockSwitchResponse>
     */
    public CompletableFuture<ChangeFullDeadLockSwitchResponse> changeFullDeadLockSwitchAsync(
        ChangeFullDeadLockSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeFullDeadLockSwitch);
    }

    /**
     * 设置全量死锁开关
     *
     * 设置全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFullDeadLockSwitchRequest 请求对象
     * @return AsyncInvoker<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse>
     */
    public AsyncInvoker<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse> changeFullDeadLockSwitchAsyncInvoker(
        ChangeFullDeadLockSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeFullDeadLockSwitch, hcClient);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return CompletableFuture<ChangeSqlLimitSwitchStatusResponse>
     */
    public CompletableFuture<ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatusAsync(
        ChangeSqlLimitSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeSqlLimitSwitchStatus);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse>
     */
    public AsyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatusAsyncInvoker(
        ChangeSqlLimitSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeSqlLimitSwitchStatus, hcClient);
    }

    /**
     * 开启/关闭全量SQL、慢SQL开关
     *
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。
     * 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlSwitchRequest 请求对象
     * @return CompletableFuture<ChangeSqlSwitchResponse>
     */
    public CompletableFuture<ChangeSqlSwitchResponse> changeSqlSwitchAsync(ChangeSqlSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeSqlSwitch);
    }

    /**
     * 开启/关闭全量SQL、慢SQL开关
     *
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。
     * 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlSwitchRequest 请求对象
     * @return AsyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>
     */
    public AsyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitchAsyncInvoker(
        ChangeSqlSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeSqlSwitch, hcClient);
    }

    /**
     * 开启/关闭历史事务开关
     *
     * 开启/关闭历史事务开关，仅支持MySQL引擎，并且依赖开启全量SQL或者慢SQL功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTransactionSwitchStatusRequest 请求对象
     * @return CompletableFuture<ChangeTransactionSwitchStatusResponse>
     */
    public CompletableFuture<ChangeTransactionSwitchStatusResponse> changeTransactionSwitchStatusAsync(
        ChangeTransactionSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeTransactionSwitchStatus);
    }

    /**
     * 开启/关闭历史事务开关
     *
     * 开启/关闭历史事务开关，仅支持MySQL引擎，并且依赖开启全量SQL或者慢SQL功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTransactionSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse>
     */
    public AsyncInvoker<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse> changeTransactionSwitchStatusAsyncInvoker(
        ChangeTransactionSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeTransactionSwitchStatus, hcClient);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialRequest 请求对象
     * @return CompletableFuture<CheckCredentialResponse>
     */
    public CompletableFuture<CheckCredentialResponse> checkCredentialAsync(CheckCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.checkCredential);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialRequest 请求对象
     * @return AsyncInvoker<CheckCredentialRequest, CheckCredentialResponse>
     */
    public AsyncInvoker<CheckCredentialRequest, CheckCredentialResponse> checkCredentialAsyncInvoker(
        CheckCredentialRequest request) {
        return new AsyncInvoker<>(request, DasMeta.checkCredential, hcClient);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialForBatchInspectionRequest 请求对象
     * @return CompletableFuture<CheckCredentialForBatchInspectionResponse>
     */
    public CompletableFuture<CheckCredentialForBatchInspectionResponse> checkCredentialForBatchInspectionAsync(
        CheckCredentialForBatchInspectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.checkCredentialForBatchInspection);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialForBatchInspectionRequest 请求对象
     * @return AsyncInvoker<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse>
     */
    public AsyncInvoker<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse> checkCredentialForBatchInspectionAsyncInvoker(
        CheckCredentialForBatchInspectionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.checkCredentialForBatchInspection, hcClient);
    }

    /**
     * 创建实例健康诊断任务
     *
     * 创建实例健康诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthReportTaskRequest 请求对象
     * @return CompletableFuture<CreateHealthReportTaskResponse>
     */
    public CompletableFuture<CreateHealthReportTaskResponse> createHealthReportTaskAsync(
        CreateHealthReportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createHealthReportTask);
    }

    /**
     * 创建实例健康诊断任务
     *
     * 创建实例健康诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthReportTaskRequest 请求对象
     * @return AsyncInvoker<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse>
     */
    public AsyncInvoker<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse> createHealthReportTaskAsyncInvoker(
        CreateHealthReportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createHealthReportTask, hcClient);
    }

    /**
     * 创建导出历史事务任务
     *
     * DAS收集历史事务开关打开后，支持创建一次性导出指定时间范围内的历史事务数据任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHistoryTransactionExportTaskRequest 请求对象
     * @return CompletableFuture<CreateHistoryTransactionExportTaskResponse>
     */
    public CompletableFuture<CreateHistoryTransactionExportTaskResponse> createHistoryTransactionExportTaskAsync(
        CreateHistoryTransactionExportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createHistoryTransactionExportTask);
    }

    /**
     * 创建导出历史事务任务
     *
     * DAS收集历史事务开关打开后，支持创建一次性导出指定时间范围内的历史事务数据任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHistoryTransactionExportTaskRequest 请求对象
     * @return AsyncInvoker<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse>
     */
    public AsyncInvoker<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse> createHistoryTransactionExportTaskAsyncInvoker(
        CreateHistoryTransactionExportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createHistoryTransactionExportTask, hcClient);
    }

    /**
     * 创建快照
     *
     * 创建快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotsRequest 请求对象
     * @return CompletableFuture<CreateSnapshotsResponse>
     */
    public CompletableFuture<CreateSnapshotsResponse> createSnapshotsAsync(CreateSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createSnapshots);
    }

    /**
     * 创建快照
     *
     * 创建快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotsRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotsRequest, CreateSnapshotsResponse>
     */
    public AsyncInvoker<CreateSnapshotsRequest, CreateSnapshotsResponse> createSnapshotsAsyncInvoker(
        CreateSnapshotsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createSnapshots, hcClient);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpaceAnalysisTaskRequest 请求对象
     * @return CompletableFuture<CreateSpaceAnalysisTaskResponse>
     */
    public CompletableFuture<CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskAsync(
        CreateSpaceAnalysisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createSpaceAnalysisTask);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpaceAnalysisTaskRequest 请求对象
     * @return AsyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>
     */
    public AsyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskAsyncInvoker(
        CreateSpaceAnalysisTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createSpaceAnalysisTask, hcClient);
    }

    /**
     * 创建SQL限流规则
     *
     * 添加SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * MySQL使用限制如下：
     * 1.规则举例详细说明：例如关键字是\&quot;select~a\&quot;, 含义为：select以及a为该并发控制所包含的两个关键字，~为关键字间隔符，即若执行SQL命令包含select与a两个关键字视为命中此条并发控制规则。
     * 2.当SQL语句匹配多条限流规则时，优先生效最新添加的规则，之前的规则不再生效。
     * 3.限流规则关键字有顺序要求，只会按顺序匹配。如：a~and~b 只会匹配 xxx a&gt;1 and b&gt;2，而不会匹配 xxx b&gt;2 and a&gt;1。
     * 4.关键字可能大小写敏感，请执行 \&quot;show variables like &#39;rds_sqlfilter_case_sensitive&#39;或者到实例参数设置页面进行确认。
     * 5.部分版本只读实例不允许设置限流规则，如果要设置限流规则，请到主实例上进行添加。
     * 6.系统表不限制、不涉及数据查询的不限制、root账号在特定版本下不限制。
     * PostgreSQL使用限制如下：
     * 1.无法添加相同QUERY_ID或SQL语句的规则。
     * 2.使用SQL语句添加规则时，需要确保存在数据库表，如：select * from test，需要确保数据库中有test表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<CreateSqlLimitRulesResponse>
     */
    public CompletableFuture<CreateSqlLimitRulesResponse> createSqlLimitRulesAsync(CreateSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createSqlLimitRules);
    }

    /**
     * 创建SQL限流规则
     *
     * 添加SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * MySQL使用限制如下：
     * 1.规则举例详细说明：例如关键字是\&quot;select~a\&quot;, 含义为：select以及a为该并发控制所包含的两个关键字，~为关键字间隔符，即若执行SQL命令包含select与a两个关键字视为命中此条并发控制规则。
     * 2.当SQL语句匹配多条限流规则时，优先生效最新添加的规则，之前的规则不再生效。
     * 3.限流规则关键字有顺序要求，只会按顺序匹配。如：a~and~b 只会匹配 xxx a&gt;1 and b&gt;2，而不会匹配 xxx b&gt;2 and a&gt;1。
     * 4.关键字可能大小写敏感，请执行 \&quot;show variables like &#39;rds_sqlfilter_case_sensitive&#39;或者到实例参数设置页面进行确认。
     * 5.部分版本只读实例不允许设置限流规则，如果要设置限流规则，请到主实例上进行添加。
     * 6.系统表不限制、不涉及数据查询的不限制、root账号在特定版本下不限制。
     * PostgreSQL使用限制如下：
     * 1.无法添加相同QUERY_ID或SQL语句的规则。
     * 2.使用SQL语句添加规则时，需要确保存在数据库表，如：select * from test，需要确保数据库中有test表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse>
     */
    public AsyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> createSqlLimitRulesAsyncInvoker(
        CreateSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createSqlLimitRules, hcClient);
    }

    /**
     * 执行SQL诊断
     *
     * 执行SQL诊断，
     * 用于用户执行SQL诊断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTuningRequest 请求对象
     * @return CompletableFuture<CreateTuningResponse>
     */
    public CompletableFuture<CreateTuningResponse> createTuningAsync(CreateTuningRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createTuning);
    }

    /**
     * 执行SQL诊断
     *
     * 执行SQL诊断，
     * 用于用户执行SQL诊断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTuningRequest 请求对象
     * @return AsyncInvoker<CreateTuningRequest, CreateTuningResponse>
     */
    public AsyncInvoker<CreateTuningRequest, CreateTuningResponse> createTuningAsyncInvoker(
        CreateTuningRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createTuning, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除注册在DAS里的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除注册在DAS里的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(
        DeleteDbUserRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteDbUser, hcClient);
    }

    /**
     * 删除邮件模板
     *
     * 删除邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEmailTemplateRequest 请求对象
     * @return CompletableFuture<DeleteEmailTemplateResponse>
     */
    public CompletableFuture<DeleteEmailTemplateResponse> deleteEmailTemplateAsync(DeleteEmailTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteEmailTemplate);
    }

    /**
     * 删除邮件模板
     *
     * 删除邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEmailTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse>
     */
    public AsyncInvoker<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse> deleteEmailTemplateAsyncInvoker(
        DeleteEmailTemplateRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteEmailTemplate, hcClient);
    }

    /**
     * 删除导出历史事务任务
     *
     * DAS收集历史事务开关打开后，删除历史事务导出任务记录对应的OBS文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHistoryTransactionExportTaskRequest 请求对象
     * @return CompletableFuture<DeleteHistoryTransactionExportTaskResponse>
     */
    public CompletableFuture<DeleteHistoryTransactionExportTaskResponse> deleteHistoryTransactionExportTaskAsync(
        DeleteHistoryTransactionExportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteHistoryTransactionExportTask);
    }

    /**
     * 删除导出历史事务任务
     *
     * DAS收集历史事务开关打开后，删除历史事务导出任务记录对应的OBS文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHistoryTransactionExportTaskRequest 请求对象
     * @return AsyncInvoker<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse>
     */
    public AsyncInvoker<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse> deleteHistoryTransactionExportTaskAsyncInvoker(
        DeleteHistoryTransactionExportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteHistoryTransactionExportTask, hcClient);
    }

    /**
     * 删除实例组
     *
     * 删除实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceGroupRequest 请求对象
     * @return CompletableFuture<DeleteInstanceGroupResponse>
     */
    public CompletableFuture<DeleteInstanceGroupResponse> deleteInstanceGroupAsync(DeleteInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteInstanceGroup);
    }

    /**
     * 删除实例组
     *
     * 删除实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceGroupRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse>
     */
    public AsyncInvoker<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse> deleteInstanceGroupAsyncInvoker(
        DeleteInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteInstanceGroup, hcClient);
    }

    /**
     * 查杀会话
     *
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProcessRequest 请求对象
     * @return CompletableFuture<DeleteProcessResponse>
     */
    public CompletableFuture<DeleteProcessResponse> deleteProcessAsync(DeleteProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteProcess);
    }

    /**
     * 查杀会话
     *
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProcessRequest 请求对象
     * @return AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessAsyncInvoker(
        DeleteProcessRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL和PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<DeleteSqlLimitRulesResponse>
     */
    public CompletableFuture<DeleteSqlLimitRulesResponse> deleteSqlLimitRulesAsync(DeleteSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteSqlLimitRules);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL和PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse>
     */
    public AsyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> deleteSqlLimitRulesAsyncInvoker(
        DeleteSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteSqlLimitRules, hcClient);
    }

    /**
     * 导出全量SQL明细
     *
     * 全量SQL开关打开后，创建SQL洞察任务，支持按节点、用户名、数据库、操作类型等导出全量SQL明细数据。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlDetailsRequest 请求对象
     * @return CompletableFuture<ExportFullSqlDetailsResponse>
     */
    public CompletableFuture<ExportFullSqlDetailsResponse> exportFullSqlDetailsAsync(
        ExportFullSqlDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportFullSqlDetails);
    }

    /**
     * 导出全量SQL明细
     *
     * 全量SQL开关打开后，创建SQL洞察任务，支持按节点、用户名、数据库、操作类型等导出全量SQL明细数据。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlDetailsRequest 请求对象
     * @return AsyncInvoker<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse>
     */
    public AsyncInvoker<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse> exportFullSqlDetailsAsyncInvoker(
        ExportFullSqlDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportFullSqlDetails, hcClient);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。免费实例仅支持查看最近一小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowQueryLogsRequest 请求对象
     * @return CompletableFuture<ExportSlowQueryLogsResponse>
     */
    public CompletableFuture<ExportSlowQueryLogsResponse> exportSlowQueryLogsAsync(ExportSlowQueryLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowQueryLogs);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。免费实例仅支持查看最近一小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowQueryLogsRequest 请求对象
     * @return AsyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>
     */
    public AsyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogsAsyncInvoker(
        ExportSlowQueryLogsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSlowQueryLogs, hcClient);
    }

    /**
     * 导出慢SQL统计数据
     *
     * 慢SQL开关打开后，导出慢SQL统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlStatisticsRequest 请求对象
     * @return CompletableFuture<ExportSlowSqlStatisticsResponse>
     */
    public CompletableFuture<ExportSlowSqlStatisticsResponse> exportSlowSqlStatisticsAsync(
        ExportSlowSqlStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowSqlStatistics);
    }

    /**
     * 导出慢SQL统计数据
     *
     * 慢SQL开关打开后，导出慢SQL统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlStatisticsRequest 请求对象
     * @return AsyncInvoker<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse>
     */
    public AsyncInvoker<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse> exportSlowSqlStatisticsAsyncInvoker(
        ExportSlowSqlStatisticsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSlowSqlStatistics, hcClient);
    }

    /**
     * 导出慢SQL模板列表
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return CompletableFuture<ExportSlowSqlTemplatesDetailsResponse>
     */
    public CompletableFuture<ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetailsAsync(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowSqlTemplatesDetails);
    }

    /**
     * 导出慢SQL模板列表
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return AsyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse>
     */
    public AsyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetailsAsyncInvoker(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSlowSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出慢SQL数量趋势
     *
     * 慢SQL开关打开后，导出慢SQL数量趋势。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTrendDetailsRequest 请求对象
     * @return CompletableFuture<ExportSlowSqlTrendDetailsResponse>
     */
    public CompletableFuture<ExportSlowSqlTrendDetailsResponse> exportSlowSqlTrendDetailsAsync(
        ExportSlowSqlTrendDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowSqlTrendDetails);
    }

    /**
     * 导出慢SQL数量趋势
     *
     * 慢SQL开关打开后，导出慢SQL数量趋势。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTrendDetailsRequest 请求对象
     * @return AsyncInvoker<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse>
     */
    public AsyncInvoker<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse> exportSlowSqlTrendDetailsAsyncInvoker(
        ExportSlowSqlTrendDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSlowSqlTrendDetails, hcClient);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSqlStatementsRequest 请求对象
     * @return CompletableFuture<ExportSqlStatementsResponse>
     */
    public CompletableFuture<ExportSqlStatementsResponse> exportSqlStatementsAsync(ExportSqlStatementsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSqlStatements);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSqlStatementsRequest 请求对象
     * @return AsyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>
     */
    public AsyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatementsAsyncInvoker(
        ExportSqlStatementsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSqlStatements, hcClient);
    }

    /**
     * 导出TOP风险实例列表
     *
     * 导出TOP风险实例列表，支持查看最近24小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopRiskInstancesRequest 请求对象
     * @return CompletableFuture<ExportTopRiskInstancesResponse>
     */
    public CompletableFuture<ExportTopRiskInstancesResponse> exportTopRiskInstancesAsync(
        ExportTopRiskInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportTopRiskInstances);
    }

    /**
     * 导出TOP风险实例列表
     *
     * 导出TOP风险实例列表，支持查看最近24小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopRiskInstancesRequest 请求对象
     * @return AsyncInvoker<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse>
     */
    public AsyncInvoker<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse> exportTopRiskInstancesAsyncInvoker(
        ExportTopRiskInstancesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportTopRiskInstances, hcClient);
    }

    /**
     * 导出TopSQL模板列表
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return CompletableFuture<ExportTopSqlTemplatesDetailsResponse>
     */
    public CompletableFuture<ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetailsAsync(
        ExportTopSqlTemplatesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportTopSqlTemplatesDetails);
    }

    /**
     * 导出TopSQL模板列表
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return AsyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse>
     */
    public AsyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetailsAsyncInvoker(
        ExportTopSqlTemplatesDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportTopSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出SQL执行耗时区间数据
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTrendDetailsRequest 请求对象
     * @return CompletableFuture<ExportTopSqlTrendDetailsResponse>
     */
    public CompletableFuture<ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetailsAsync(
        ExportTopSqlTrendDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportTopSqlTrendDetails);
    }

    /**
     * 导出SQL执行耗时区间数据
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTrendDetailsRequest 请求对象
     * @return AsyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse>
     */
    public AsyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetailsAsyncInvoker(
        ExportTopSqlTrendDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportTopSqlTrendDetails, hcClient);
    }

    /**
     * 查询自增配额
     *
     * 查询自增配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoIncrementUsageRequest 请求对象
     * @return CompletableFuture<ListAutoIncrementUsageResponse>
     */
    public CompletableFuture<ListAutoIncrementUsageResponse> listAutoIncrementUsageAsync(
        ListAutoIncrementUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listAutoIncrementUsage);
    }

    /**
     * 查询自增配额
     *
     * 查询自增配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoIncrementUsageRequest 请求对象
     * @return AsyncInvoker<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse>
     */
    public AsyncInvoker<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse> listAutoIncrementUsageAsyncInvoker(
        ListAutoIncrementUsageRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listAutoIncrementUsage, hcClient);
    }

    /**
     * 获取DAS云DBA实例列表
     *
     * 获取DAS云DBA实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudDbaInstancesRequest 请求对象
     * @return CompletableFuture<ListCloudDbaInstancesResponse>
     */
    public CompletableFuture<ListCloudDbaInstancesResponse> listCloudDbaInstancesAsync(
        ListCloudDbaInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listCloudDbaInstances);
    }

    /**
     * 获取DAS云DBA实例列表
     *
     * 获取DAS云DBA实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudDbaInstancesRequest 请求对象
     * @return AsyncInvoker<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse>
     */
    public AsyncInvoker<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse> listCloudDbaInstancesAsyncInvoker(
        ListCloudDbaInstancesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listCloudDbaInstances, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询注册在DAS里的数据库用户列表，后续调用其他接口时(如查询实例会话列表接口)需要用到此接口返回的db_user_id。此接口不会返回数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询注册在DAS里的数据库用户列表，后续调用其他接口时(如查询实例会话列表接口)需要用到此接口返回的db_user_id。此接口不会返回数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询邮件推送记录
     *
     * 查询邮件推送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailRecordRequest 请求对象
     * @return CompletableFuture<ListEmailRecordResponse>
     */
    public CompletableFuture<ListEmailRecordResponse> listEmailRecordAsync(ListEmailRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listEmailRecord);
    }

    /**
     * 查询邮件推送记录
     *
     * 查询邮件推送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailRecordRequest 请求对象
     * @return AsyncInvoker<ListEmailRecordRequest, ListEmailRecordResponse>
     */
    public AsyncInvoker<ListEmailRecordRequest, ListEmailRecordResponse> listEmailRecordAsyncInvoker(
        ListEmailRecordRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listEmailRecord, hcClient);
    }

    /**
     * 查询邮件模板列表
     *
     * 查询邮件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailTemplateRequest 请求对象
     * @return CompletableFuture<ListEmailTemplateResponse>
     */
    public CompletableFuture<ListEmailTemplateResponse> listEmailTemplateAsync(ListEmailTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listEmailTemplate);
    }

    /**
     * 查询邮件模板列表
     *
     * 查询邮件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailTemplateRequest 请求对象
     * @return AsyncInvoker<ListEmailTemplateRequest, ListEmailTemplateResponse>
     */
    public AsyncInvoker<ListEmailTemplateRequest, ListEmailTemplateResponse> listEmailTemplateAsyncInvoker(
        ListEmailTemplateRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listEmailTemplate, hcClient);
    }

    /**
     * 查询SQL洞察任务列表
     *
     * 全量SQL开关打开后，查询SQL洞察任务列表。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlTasksRequest 请求对象
     * @return CompletableFuture<ListFullSqlTasksResponse>
     */
    public CompletableFuture<ListFullSqlTasksResponse> listFullSqlTasksAsync(ListFullSqlTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listFullSqlTasks);
    }

    /**
     * 查询SQL洞察任务列表
     *
     * 全量SQL开关打开后，查询SQL洞察任务列表。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlTasksRequest 请求对象
     * @return AsyncInvoker<ListFullSqlTasksRequest, ListFullSqlTasksResponse>
     */
    public AsyncInvoker<ListFullSqlTasksRequest, ListFullSqlTasksResponse> listFullSqlTasksAsyncInvoker(
        ListFullSqlTasksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listFullSqlTasks, hcClient);
    }

    /**
     * 查询实例健康诊断报告列表
     *
     * 查询实例健康诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthReportTaskRequest 请求对象
     * @return CompletableFuture<ListHealthReportTaskResponse>
     */
    public CompletableFuture<ListHealthReportTaskResponse> listHealthReportTaskAsync(
        ListHealthReportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listHealthReportTask);
    }

    /**
     * 查询实例健康诊断报告列表
     *
     * 查询实例健康诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthReportTaskRequest 请求对象
     * @return AsyncInvoker<ListHealthReportTaskRequest, ListHealthReportTaskResponse>
     */
    public AsyncInvoker<ListHealthReportTaskRequest, ListHealthReportTaskResponse> listHealthReportTaskAsyncInvoker(
        ListHealthReportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listHealthReportTask, hcClient);
    }

    /**
     * 查询历史事务导出任务列表
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryTransactionExportTaskRequest 请求对象
     * @return CompletableFuture<ListHistoryTransactionExportTaskResponse>
     */
    public CompletableFuture<ListHistoryTransactionExportTaskResponse> listHistoryTransactionExportTaskAsync(
        ListHistoryTransactionExportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listHistoryTransactionExportTask);
    }

    /**
     * 查询历史事务导出任务列表
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryTransactionExportTaskRequest 请求对象
     * @return AsyncInvoker<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse>
     */
    public AsyncInvoker<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse> listHistoryTransactionExportTaskAsyncInvoker(
        ListHistoryTransactionExportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listHistoryTransactionExportTask, hcClient);
    }

    /**
     * 查询InnoDB锁等待列表
     *
     * 查询InnoDB锁等待列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInnodbLocksRequest 请求对象
     * @return CompletableFuture<ListInnodbLocksResponse>
     */
    public CompletableFuture<ListInnodbLocksResponse> listInnodbLocksAsync(ListInnodbLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInnodbLocks);
    }

    /**
     * 查询InnoDB锁等待列表
     *
     * 查询InnoDB锁等待列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInnodbLocksRequest 请求对象
     * @return AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksAsyncInvoker(
        ListInnodbLocksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInnodbLocks, hcClient);
    }

    /**
     * 查询巡检报告列表
     *
     * 查询巡检报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionReportRequest 请求对象
     * @return CompletableFuture<ListInspectionReportResponse>
     */
    public CompletableFuture<ListInspectionReportResponse> listInspectionReportAsync(
        ListInspectionReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInspectionReport);
    }

    /**
     * 查询巡检报告列表
     *
     * 查询巡检报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionReportRequest 请求对象
     * @return AsyncInvoker<ListInspectionReportRequest, ListInspectionReportResponse>
     */
    public AsyncInvoker<ListInspectionReportRequest, ListInspectionReportResponse> listInspectionReportAsyncInvoker(
        ListInspectionReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInspectionReport, hcClient);
    }

    /**
     * 查询实例分布情况
     *
     * 查询实例分布情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDistributionRequest 请求对象
     * @return CompletableFuture<ListInstanceDistributionResponse>
     */
    public CompletableFuture<ListInstanceDistributionResponse> listInstanceDistributionAsync(
        ListInstanceDistributionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceDistribution);
    }

    /**
     * 查询实例分布情况
     *
     * 查询实例分布情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDistributionRequest 请求对象
     * @return AsyncInvoker<ListInstanceDistributionRequest, ListInstanceDistributionResponse>
     */
    public AsyncInvoker<ListInstanceDistributionRequest, ListInstanceDistributionResponse> listInstanceDistributionAsyncInvoker(
        ListInstanceDistributionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceDistribution, hcClient);
    }

    /**
     * 查询实例组列表
     *
     * 查询实例组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceGroupRequest 请求对象
     * @return CompletableFuture<ListInstanceGroupResponse>
     */
    public CompletableFuture<ListInstanceGroupResponse> listInstanceGroupAsync(ListInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceGroup);
    }

    /**
     * 查询实例组列表
     *
     * 查询实例组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceGroupRequest 请求对象
     * @return AsyncInvoker<ListInstanceGroupRequest, ListInstanceGroupResponse>
     */
    public AsyncInvoker<ListInstanceGroupRequest, ListInstanceGroupResponse> listInstanceGroupAsyncInvoker(
        ListInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceGroup, hcClient);
    }

    /**
     * 获取多节点单指标数据
     *
     * 获取多节点单指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMultiNodesSingleMetricRequest 请求对象
     * @return CompletableFuture<ListInstanceMultiNodesSingleMetricResponse>
     */
    public CompletableFuture<ListInstanceMultiNodesSingleMetricResponse> listInstanceMultiNodesSingleMetricAsync(
        ListInstanceMultiNodesSingleMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceMultiNodesSingleMetric);
    }

    /**
     * 获取多节点单指标数据
     *
     * 获取多节点单指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMultiNodesSingleMetricRequest 请求对象
     * @return AsyncInvoker<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse>
     */
    public AsyncInvoker<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse> listInstanceMultiNodesSingleMetricAsyncInvoker(
        ListInstanceMultiNodesSingleMetricRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceMultiNodesSingleMetric, hcClient);
    }

    /**
     * 获取单个实例节点信息
     *
     * 获取单个实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNodesInfoRequest 请求对象
     * @return CompletableFuture<ListInstanceNodesInfoResponse>
     */
    public CompletableFuture<ListInstanceNodesInfoResponse> listInstanceNodesInfoAsync(
        ListInstanceNodesInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceNodesInfo);
    }

    /**
     * 获取单个实例节点信息
     *
     * 获取单个实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNodesInfoRequest 请求对象
     * @return AsyncInvoker<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse>
     */
    public AsyncInvoker<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse> listInstanceNodesInfoAsyncInvoker(
        ListInstanceNodesInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceNodesInfo, hcClient);
    }

    /**
     * 查询实例的TOP慢SQL列表
     *
     * 查询实例的TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopSlowLogRequest 请求对象
     * @return CompletableFuture<ListInstanceTopSlowLogResponse>
     */
    public CompletableFuture<ListInstanceTopSlowLogResponse> listInstanceTopSlowLogAsync(
        ListInstanceTopSlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceTopSlowLog);
    }

    /**
     * 查询实例的TOP慢SQL列表
     *
     * 查询实例的TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopSlowLogRequest 请求对象
     * @return AsyncInvoker<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse>
     */
    public AsyncInvoker<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse> listInstanceTopSlowLogAsyncInvoker(
        ListInstanceTopSlowLogRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceTopSlowLog, hcClient);
    }

    /**
     * 查询元数据锁列表
     *
     * 查询元数据锁列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadataLocksRequest 请求对象
     * @return CompletableFuture<ListMetadataLocksResponse>
     */
    public CompletableFuture<ListMetadataLocksResponse> listMetadataLocksAsync(ListMetadataLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listMetadataLocks);
    }

    /**
     * 查询元数据锁列表
     *
     * 查询元数据锁列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadataLocksRequest 请求对象
     * @return AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksAsyncInvoker(
        ListMetadataLocksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listMetadataLocks, hcClient);
    }

    /**
     * 查询实例会话列表
     *
     * 支持根据数据库、用户查询实例会话列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessesRequest 请求对象
     * @return CompletableFuture<ListProcessesResponse>
     */
    public CompletableFuture<ListProcessesResponse> listProcessesAsync(ListProcessesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listProcesses);
    }

    /**
     * 查询实例会话列表
     *
     * 支持根据数据库、用户查询实例会话列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessesRequest 请求对象
     * @return AsyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public AsyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesAsyncInvoker(
        ListProcessesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 查询资源风险实例风险项
     *
     * 查询资源风险实例风险项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskItemsRequest 请求对象
     * @return CompletableFuture<ListRiskItemsResponse>
     */
    public CompletableFuture<ListRiskItemsResponse> listRiskItemsAsync(ListRiskItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listRiskItems);
    }

    /**
     * 查询资源风险实例风险项
     *
     * 查询资源风险实例风险项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskItemsRequest 请求对象
     * @return AsyncInvoker<ListRiskItemsRequest, ListRiskItemsResponse>
     */
    public AsyncInvoker<ListRiskItemsRequest, ListRiskItemsResponse> listRiskItemsAsyncInvoker(
        ListRiskItemsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listRiskItems, hcClient);
    }

    /**
     * 查询资源风险实例风险趋势
     *
     * 查询资源风险实例风险趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskTrendRequest 请求对象
     * @return CompletableFuture<ListRiskTrendResponse>
     */
    public CompletableFuture<ListRiskTrendResponse> listRiskTrendAsync(ListRiskTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listRiskTrend);
    }

    /**
     * 查询资源风险实例风险趋势
     *
     * 查询资源风险实例风险趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskTrendRequest 请求对象
     * @return AsyncInvoker<ListRiskTrendRequest, ListRiskTrendResponse>
     */
    public AsyncInvoker<ListRiskTrendRequest, ListRiskTrendResponse> listRiskTrendAsyncInvoker(
        ListRiskTrendRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listRiskTrend, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsResponse>
     */
    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSnapshots, hcClient);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。 支持MySQL、GaussDB(for MySQL)和SQLServer引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpaceAnalysisRequest 请求对象
     * @return CompletableFuture<ListSpaceAnalysisResponse>
     */
    public CompletableFuture<ListSpaceAnalysisResponse> listSpaceAnalysisAsync(ListSpaceAnalysisRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSpaceAnalysis);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。 支持MySQL、GaussDB(for MySQL)和SQLServer引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpaceAnalysisRequest 请求对象
     * @return AsyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>
     */
    public AsyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysisAsyncInvoker(
        ListSpaceAnalysisRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSpaceAnalysis, hcClient);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<ListSqlLimitRulesResponse>
     */
    public CompletableFuture<ListSqlLimitRulesResponse> listSqlLimitRulesAsync(ListSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSqlLimitRules);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse>
     */
    public AsyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> listSqlLimitRulesAsyncInvoker(
        ListSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSqlLimitRules, hcClient);
    }

    /**
     * 查询TOP慢SQL列表
     *
     * 查询TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSlowLogRequest 请求对象
     * @return CompletableFuture<ListTopSlowLogResponse>
     */
    public CompletableFuture<ListTopSlowLogResponse> listTopSlowLogAsync(ListTopSlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listTopSlowLog);
    }

    /**
     * 查询TOP慢SQL列表
     *
     * 查询TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSlowLogRequest 请求对象
     * @return AsyncInvoker<ListTopSlowLogRequest, ListTopSlowLogResponse>
     */
    public AsyncInvoker<ListTopSlowLogRequest, ListTopSlowLogResponse> listTopSlowLogAsyncInvoker(
        ListTopSlowLogRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listTopSlowLog, hcClient);
    }

    /**
     * 查询历史事务列表
     *
     * 查询历史事务列表。
     * 目前仅支持MySQL实例，仅支持查看最近7天的历史事务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransactionsRequest 请求对象
     * @return CompletableFuture<ListTransactionsResponse>
     */
    public CompletableFuture<ListTransactionsResponse> listTransactionsAsync(ListTransactionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listTransactions);
    }

    /**
     * 查询历史事务列表
     *
     * 查询历史事务列表。
     * 目前仅支持MySQL实例，仅支持查看最近7天的历史事务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransactionsRequest 请求对象
     * @return AsyncInvoker<ListTransactionsRequest, ListTransactionsResponse>
     */
    public AsyncInvoker<ListTransactionsRequest, ListTransactionsResponse> listTransactionsAsyncInvoker(
        ListTransactionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listTransactions, hcClient);
    }

    /**
     * 内置账号登录
     *
     * 内置账号登录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginBuiltInAccountRequest 请求对象
     * @return CompletableFuture<LoginBuiltInAccountResponse>
     */
    public CompletableFuture<LoginBuiltInAccountResponse> loginBuiltInAccountAsync(LoginBuiltInAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.loginBuiltInAccount);
    }

    /**
     * 内置账号登录
     *
     * 内置账号登录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginBuiltInAccountRequest 请求对象
     * @return AsyncInvoker<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse>
     */
    public AsyncInvoker<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse> loginBuiltInAccountAsyncInvoker(
        LoginBuiltInAccountRequest request) {
        return new AsyncInvoker<>(request, DasMeta.loginBuiltInAccount, hcClient);
    }

    /**
     * 内置账号登出
     *
     * 内置账号登出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffBuiltInAccountRequest 请求对象
     * @return CompletableFuture<LogoffBuiltInAccountResponse>
     */
    public CompletableFuture<LogoffBuiltInAccountResponse> logoffBuiltInAccountAsync(
        LogoffBuiltInAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.logoffBuiltInAccount);
    }

    /**
     * 内置账号登出
     *
     * 内置账号登出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffBuiltInAccountRequest 请求对象
     * @return AsyncInvoker<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse>
     */
    public AsyncInvoker<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse> logoffBuiltInAccountAsyncInvoker(
        LogoffBuiltInAccountRequest request) {
        return new AsyncInvoker<>(request, DasMeta.logoffBuiltInAccount, hcClient);
    }

    /**
     * 根据原始SQL生成SQL限流关键字
     *
     * 根据原始SQL生成SQL限流关键字，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<ParseSqlLimitRulesResponse>
     */
    public CompletableFuture<ParseSqlLimitRulesResponse> parseSqlLimitRulesAsync(ParseSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.parseSqlLimitRules);
    }

    /**
     * 根据原始SQL生成SQL限流关键字
     *
     * 根据原始SQL生成SQL限流关键字，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse>
     */
    public AsyncInvoker<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse> parseSqlLimitRulesAsyncInvoker(
        ParseSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.parseSqlLimitRules, hcClient);
    }

    /**
     * 注册数据库用户
     *
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库实例上创建数据库用户对象。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDbUserRequest 请求对象
     * @return CompletableFuture<RegisterDbUserResponse>
     */
    public CompletableFuture<RegisterDbUserResponse> registerDbUserAsync(RegisterDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.registerDbUser);
    }

    /**
     * 注册数据库用户
     *
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库实例上创建数据库用户对象。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDbUserRequest 请求对象
     * @return AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserAsyncInvoker(
        RegisterDbUserRequest request) {
        return new AsyncInvoker<>(request, DasMeta.registerDbUser, hcClient);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialRequest 请求对象
     * @return CompletableFuture<SaveCredentialResponse>
     */
    public CompletableFuture<SaveCredentialResponse> saveCredentialAsync(SaveCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.saveCredential);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialRequest 请求对象
     * @return AsyncInvoker<SaveCredentialRequest, SaveCredentialResponse>
     */
    public AsyncInvoker<SaveCredentialRequest, SaveCredentialResponse> saveCredentialAsyncInvoker(
        SaveCredentialRequest request) {
        return new AsyncInvoker<>(request, DasMeta.saveCredential, hcClient);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialForBatchInspectionRequest 请求对象
     * @return CompletableFuture<SaveCredentialForBatchInspectionResponse>
     */
    public CompletableFuture<SaveCredentialForBatchInspectionResponse> saveCredentialForBatchInspectionAsync(
        SaveCredentialForBatchInspectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.saveCredentialForBatchInspection);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialForBatchInspectionRequest 请求对象
     * @return AsyncInvoker<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse>
     */
    public AsyncInvoker<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse> saveCredentialForBatchInspectionAsyncInvoker(
        SaveCredentialForBatchInspectionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.saveCredentialForBatchInspection, hcClient);
    }

    /**
     * 设置指标阈值
     *
     * 设置指标阈值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetThresholdForMetricRequest 请求对象
     * @return CompletableFuture<SetThresholdForMetricResponse>
     */
    public CompletableFuture<SetThresholdForMetricResponse> setThresholdForMetricAsync(
        SetThresholdForMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.setThresholdForMetric);
    }

    /**
     * 设置指标阈值
     *
     * 设置指标阈值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetThresholdForMetricRequest 请求对象
     * @return AsyncInvoker<SetThresholdForMetricRequest, SetThresholdForMetricResponse>
     */
    public AsyncInvoker<SetThresholdForMetricRequest, SetThresholdForMetricResponse> setThresholdForMetricAsyncInvoker(
        SetThresholdForMetricRequest request) {
        return new AsyncInvoker<>(request, DasMeta.setThresholdForMetric, hcClient);
    }

    /**
     * 查询AK/SK
     *
     * 查询AK/SK。用于判断是否已保存AK/SK
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCredentialRequest 请求对象
     * @return CompletableFuture<ShowCredentialResponse>
     */
    public CompletableFuture<ShowCredentialResponse> showCredentialAsync(ShowCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showCredential);
    }

    /**
     * 查询AK/SK
     *
     * 查询AK/SK。用于判断是否已保存AK/SK
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCredentialRequest 请求对象
     * @return AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse>
     */
    public AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse> showCredentialAsyncInvoker(
        ShowCredentialRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showCredential, hcClient);
    }

    /**
     * 自动推荐SQL限流规则
     *
     * 根据条件（包括模板所代表的sql平均时长，条数，最大执行时长，前三者混合）自动推荐SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasRecommendSqlLimitRuleRequest 请求对象
     * @return CompletableFuture<ShowDasRecommendSqlLimitRuleResponse>
     */
    public CompletableFuture<ShowDasRecommendSqlLimitRuleResponse> showDasRecommendSqlLimitRuleAsync(
        ShowDasRecommendSqlLimitRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDasRecommendSqlLimitRule);
    }

    /**
     * 自动推荐SQL限流规则
     *
     * 根据条件（包括模板所代表的sql平均时长，条数，最大执行时长，前三者混合）自动推荐SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasRecommendSqlLimitRuleRequest 请求对象
     * @return AsyncInvoker<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse>
     */
    public AsyncInvoker<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse> showDasRecommendSqlLimitRuleAsyncInvoker(
        ShowDasRecommendSqlLimitRuleRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDasRecommendSqlLimitRule, hcClient);
    }

    /**
     * 查询数据库用户信息
     *
     * 查询注册在DAS里的数据库用户信息。此接口不能查询数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbUserRequest 请求对象
     * @return CompletableFuture<ShowDbUserResponse>
     */
    public CompletableFuture<ShowDbUserResponse> showDbUserAsync(ShowDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDbUser);
    }

    /**
     * 查询数据库用户信息
     *
     * 查询注册在DAS里的数据库用户信息。此接口不能查询数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbUserRequest 请求对象
     * @return AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserAsyncInvoker(ShowDbUserRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 获取全量死锁信息
     *
     * 获取全量死锁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockListRequest 请求对象
     * @return CompletableFuture<ShowFullDeadLockListResponse>
     */
    public CompletableFuture<ShowFullDeadLockListResponse> showFullDeadLockListAsync(
        ShowFullDeadLockListRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showFullDeadLockList);
    }

    /**
     * 获取全量死锁信息
     *
     * 获取全量死锁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockListRequest 请求对象
     * @return AsyncInvoker<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse>
     */
    public AsyncInvoker<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse> showFullDeadLockListAsyncInvoker(
        ShowFullDeadLockListRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showFullDeadLockList, hcClient);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchRequest 请求对象
     * @return CompletableFuture<ShowFullDeadLockSwitchResponse>
     */
    public CompletableFuture<ShowFullDeadLockSwitchResponse> showFullDeadLockSwitchAsync(
        ShowFullDeadLockSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showFullDeadLockSwitch);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchRequest 请求对象
     * @return AsyncInvoker<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse>
     */
    public AsyncInvoker<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse> showFullDeadLockSwitchAsyncInvoker(
        ShowFullDeadLockSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showFullDeadLockSwitch, hcClient);
    }

    /**
     * 查看实例诊断报告设置
     *
     * 查看实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthReportSettingsRequest 请求对象
     * @return CompletableFuture<ShowHealthReportSettingsResponse>
     */
    public CompletableFuture<ShowHealthReportSettingsResponse> showHealthReportSettingsAsync(
        ShowHealthReportSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showHealthReportSettings);
    }

    /**
     * 查看实例诊断报告设置
     *
     * 查看实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthReportSettingsRequest 请求对象
     * @return AsyncInvoker<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse>
     */
    public AsyncInvoker<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse> showHealthReportSettingsAsyncInvoker(
        ShowHealthReportSettingsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showHealthReportSettings, hcClient);
    }

    /**
     * 查询历史事务导出任务详情
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionExportTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowHistoryTransactionExportTaskInfoResponse>
     */
    public CompletableFuture<ShowHistoryTransactionExportTaskInfoResponse> showHistoryTransactionExportTaskInfoAsync(
        ShowHistoryTransactionExportTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showHistoryTransactionExportTaskInfo);
    }

    /**
     * 查询历史事务导出任务详情
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionExportTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse>
     */
    public AsyncInvoker<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse> showHistoryTransactionExportTaskInfoAsyncInvoker(
        ShowHistoryTransactionExportTaskInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showHistoryTransactionExportTaskInfo, hcClient);
    }

    /**
     * 获取实例健康诊断报告内容
     *
     * 获取实例健康诊断报告内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReportRequest 请求对象
     * @return CompletableFuture<ShowInstanceHealthReportResponse>
     */
    public CompletableFuture<ShowInstanceHealthReportResponse> showInstanceHealthReportAsync(
        ShowInstanceHealthReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showInstanceHealthReport);
    }

    /**
     * 获取实例健康诊断报告内容
     *
     * 获取实例健康诊断报告内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReportRequest 请求对象
     * @return AsyncInvoker<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse>
     */
    public AsyncInvoker<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse> showInstanceHealthReportAsyncInvoker(
        ShowInstanceHealthReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showInstanceHealthReport, hcClient);
    }

    /**
     * 获取死锁的快照信息
     *
     * 获取死锁的快照信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshotRequest 请求对象
     * @return CompletableFuture<ShowLatestDeadLockSnapshotResponse>
     */
    public CompletableFuture<ShowLatestDeadLockSnapshotResponse> showLatestDeadLockSnapshotAsync(
        ShowLatestDeadLockSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showLatestDeadLockSnapshot);
    }

    /**
     * 获取死锁的快照信息
     *
     * 获取死锁的快照信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse>
     */
    public AsyncInvoker<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse> showLatestDeadLockSnapshotAsyncInvoker(
        ShowLatestDeadLockSnapshotRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showLatestDeadLockSnapshot, hcClient);
    }

    /**
     * 多节点单指标支持指标信息
     *
     * 多节点单指标支持指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesSupportRequest 请求对象
     * @return CompletableFuture<ShowMetricNamesSupportResponse>
     */
    public CompletableFuture<ShowMetricNamesSupportResponse> showMetricNamesSupportAsync(
        ShowMetricNamesSupportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showMetricNamesSupport);
    }

    /**
     * 多节点单指标支持指标信息
     *
     * 多节点单指标支持指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesSupportRequest 请求对象
     * @return AsyncInvoker<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse>
     */
    public AsyncInvoker<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse> showMetricNamesSupportAsyncInvoker(
        ShowMetricNamesSupportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showMetricNamesSupport, hcClient);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showQuotas);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showQuotas, hcClient);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlExecutionPlanRequest 请求对象
     * @return CompletableFuture<ShowSqlExecutionPlanResponse>
     */
    public CompletableFuture<ShowSqlExecutionPlanResponse> showSqlExecutionPlanAsync(
        ShowSqlExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlExecutionPlan);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlExecutionPlanRequest 请求对象
     * @return AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanAsyncInvoker(
        ShowSqlExecutionPlanRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlExecutionPlan, hcClient);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 补充GET请求，处理超长SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlExplainRequest 请求对象
     * @return CompletableFuture<ShowSqlExplainResponse>
     */
    public CompletableFuture<ShowSqlExplainResponse> showSqlExplainAsync(ShowSqlExplainRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlExplain);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 补充GET请求，处理超长SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlExplainRequest 请求对象
     * @return AsyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse>
     */
    public AsyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse> showSqlExplainAsyncInvoker(
        ShowSqlExplainRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlExplain, hcClient);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitJobInfoRequest 请求对象
     * @return CompletableFuture<ShowSqlLimitJobInfoResponse>
     */
    public CompletableFuture<ShowSqlLimitJobInfoResponse> showSqlLimitJobInfoAsync(ShowSqlLimitJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlLimitJobInfo);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse>
     */
    public AsyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> showSqlLimitJobInfoAsyncInvoker(
        ShowSqlLimitJobInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlLimitJobInfo, hcClient);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowSqlLimitSwitchStatusResponse>
     */
    public CompletableFuture<ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatusAsync(
        ShowSqlLimitSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlLimitSwitchStatus);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse>
     */
    public AsyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatusAsyncInvoker(
        ShowSqlLimitSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlLimitSwitchStatus, hcClient);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowSqlSwitchStatusResponse>
     */
    public CompletableFuture<ShowSqlSwitchStatusResponse> showSqlSwitchStatusAsync(ShowSqlSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlSwitchStatus);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>
     */
    public AsyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatusAsyncInvoker(
        ShowSqlSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlSwitchStatus, hcClient);
    }

    /**
     * 查询历史事务开关
     *
     * 查询历史事务开关。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTransactionSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowTransactionSwitchStatusResponse>
     */
    public CompletableFuture<ShowTransactionSwitchStatusResponse> showTransactionSwitchStatusAsync(
        ShowTransactionSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showTransactionSwitchStatus);
    }

    /**
     * 查询历史事务开关
     *
     * 查询历史事务开关。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTransactionSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse>
     */
    public AsyncInvoker<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse> showTransactionSwitchStatusAsyncInvoker(
        ShowTransactionSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showTransactionSwitchStatus, hcClient);
    }

    /**
     * 获取诊断结果
     *
     * 获取诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningRequest 请求对象
     * @return CompletableFuture<ShowTuningResponse>
     */
    public CompletableFuture<ShowTuningResponse> showTuningAsync(ShowTuningRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showTuning);
    }

    /**
     * 获取诊断结果
     *
     * 获取诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningRequest 请求对象
     * @return AsyncInvoker<ShowTuningRequest, ShowTuningResponse>
     */
    public AsyncInvoker<ShowTuningRequest, ShowTuningResponse> showTuningAsyncInvoker(ShowTuningRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showTuning, hcClient);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstancesRequest 请求对象
     * @return CompletableFuture<SynchronizeInstancesResponse>
     */
    public CompletableFuture<SynchronizeInstancesResponse> synchronizeInstancesAsync(
        SynchronizeInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.synchronizeInstances);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstancesRequest 请求对象
     * @return AsyncInvoker<SynchronizeInstancesRequest, SynchronizeInstancesResponse>
     */
    public AsyncInvoker<SynchronizeInstancesRequest, SynchronizeInstancesResponse> synchronizeInstancesAsyncInvoker(
        SynchronizeInstancesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.synchronizeInstances, hcClient);
    }

    /**
     * 修改数据库用户
     *
     * 修改注册在DAS里的数据库用户名和密码。此接口不会修改数据库实例上的数据库用户对象的用户名和密码。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbUserRequest 请求对象
     * @return CompletableFuture<UpdateDbUserResponse>
     */
    public CompletableFuture<UpdateDbUserResponse> updateDbUserAsync(UpdateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateDbUser);
    }

    /**
     * 修改数据库用户
     *
     * 修改注册在DAS里的数据库用户名和密码。此接口不会修改数据库实例上的数据库用户对象的用户名和密码。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbUserRequest 请求对象
     * @return AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserAsyncInvoker(
        UpdateDbUserRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateDbUser, hcClient);
    }

    /**
     * 修改邮件模板
     *
     * 修改邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEmailTemplateRequest 请求对象
     * @return CompletableFuture<UpdateEmailTemplateResponse>
     */
    public CompletableFuture<UpdateEmailTemplateResponse> updateEmailTemplateAsync(UpdateEmailTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateEmailTemplate);
    }

    /**
     * 修改邮件模板
     *
     * 修改邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEmailTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse>
     */
    public AsyncInvoker<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse> updateEmailTemplateAsyncInvoker(
        UpdateEmailTemplateRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateEmailTemplate, hcClient);
    }

    /**
     * 更新实例诊断报告设置
     *
     * 更新实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthReportSettingsRequest 请求对象
     * @return CompletableFuture<UpdateHealthReportSettingsResponse>
     */
    public CompletableFuture<UpdateHealthReportSettingsResponse> updateHealthReportSettingsAsync(
        UpdateHealthReportSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateHealthReportSettings);
    }

    /**
     * 更新实例诊断报告设置
     *
     * 更新实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthReportSettingsRequest 请求对象
     * @return AsyncInvoker<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse>
     */
    public AsyncInvoker<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse> updateHealthReportSettingsAsyncInvoker(
        UpdateHealthReportSettingsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateHealthReportSettings, hcClient);
    }

    /**
     * 修改实例组
     *
     * 修改实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return CompletableFuture<UpdateInstanceGroupResponse>
     */
    public CompletableFuture<UpdateInstanceGroupResponse> updateInstanceGroupAsync(UpdateInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateInstanceGroup);
    }

    /**
     * 修改实例组
     *
     * 修改实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse>
     */
    public AsyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse> updateInstanceGroupAsyncInvoker(
        UpdateInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateInstanceGroup, hcClient);
    }

    /**
     * 修改SQL限流规则
     *
     * 修改SQL限流规则。目前仅支持PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<UpdateSqlLimitRulesResponse>
     */
    public CompletableFuture<UpdateSqlLimitRulesResponse> updateSqlLimitRulesAsync(UpdateSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateSqlLimitRules);
    }

    /**
     * 修改SQL限流规则
     *
     * 修改SQL限流规则。目前仅支持PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse>
     */
    public AsyncInvoker<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse> updateSqlLimitRulesAsyncInvoker(
        UpdateSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateSqlLimitRules, hcClient);
    }

}
