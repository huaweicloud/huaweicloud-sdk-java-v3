package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.CreateTuningRequest;
import com.huaweicloud.sdk.das.v3.model.CreateTuningResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesResponse;
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
import com.huaweicloud.sdk.das.v3.model.ListCloudDbaInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.ListCloudDbaInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.das.v3.model.ListHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ListHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceDistributionRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceDistributionResponse;
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
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisRequest;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.ListTopSlowLogRequest;
import com.huaweicloud.sdk.das.v3.model.ListTopSlowLogResponse;
import com.huaweicloud.sdk.das.v3.model.ListTransactionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListTransactionsResponse;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricRequest;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReportRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReportResponse;
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
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesResponse;

public class DasClient {

    protected HcClient hcClient;

    public DasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DasClient> newBuilder() {
        ClientBuilder<DasClient> clientBuilder = new ClientBuilder<>(DasClient::new);
        return clientBuilder;
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<>(request, DasMeta.showApiVersion, hcClient);
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
     * @return CancelShareConnectionsResponse
     */
    public CancelShareConnectionsResponse cancelShareConnections(CancelShareConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.cancelShareConnections);
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
     * @return SyncInvoker<CancelShareConnectionsRequest, CancelShareConnectionsResponse>
     */
    public SyncInvoker<CancelShareConnectionsRequest, CancelShareConnectionsResponse> cancelShareConnectionsInvoker(
        CancelShareConnectionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.cancelShareConnections, hcClient);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return ChangeSqlLimitSwitchStatusResponse
     */
    public ChangeSqlLimitSwitchStatusResponse changeSqlLimitSwitchStatus(ChangeSqlLimitSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeSqlLimitSwitchStatus);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return SyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse>
     */
    public SyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatusInvoker(
        ChangeSqlLimitSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeSqlLimitSwitchStatus, hcClient);
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
     * @return ChangeSqlSwitchResponse
     */
    public ChangeSqlSwitchResponse changeSqlSwitch(ChangeSqlSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeSqlSwitch);
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
     * @return SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>
     */
    public SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitchInvoker(
        ChangeSqlSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeSqlSwitch, hcClient);
    }

    /**
     * 开启/关闭历史事务开关
     *
     * 开启/关闭历史事务开关，仅支持MySQL引擎，并且依赖开启全量SQL或者慢SQL功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTransactionSwitchStatusRequest 请求对象
     * @return ChangeTransactionSwitchStatusResponse
     */
    public ChangeTransactionSwitchStatusResponse changeTransactionSwitchStatus(
        ChangeTransactionSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeTransactionSwitchStatus);
    }

    /**
     * 开启/关闭历史事务开关
     *
     * 开启/关闭历史事务开关，仅支持MySQL引擎，并且依赖开启全量SQL或者慢SQL功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTransactionSwitchStatusRequest 请求对象
     * @return SyncInvoker<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse>
     */
    public SyncInvoker<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse> changeTransactionSwitchStatusInvoker(
        ChangeTransactionSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeTransactionSwitchStatus, hcClient);
    }

    /**
     * 创建实例健康诊断任务
     *
     * 创建实例健康诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthReportTaskRequest 请求对象
     * @return CreateHealthReportTaskResponse
     */
    public CreateHealthReportTaskResponse createHealthReportTask(CreateHealthReportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createHealthReportTask);
    }

    /**
     * 创建实例健康诊断任务
     *
     * 创建实例健康诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthReportTaskRequest 请求对象
     * @return SyncInvoker<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse>
     */
    public SyncInvoker<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse> createHealthReportTaskInvoker(
        CreateHealthReportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.createHealthReportTask, hcClient);
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
     * @return CreateShareConnectionsResponse
     */
    public CreateShareConnectionsResponse createShareConnections(CreateShareConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createShareConnections);
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
     * @return SyncInvoker<CreateShareConnectionsRequest, CreateShareConnectionsResponse>
     */
    public SyncInvoker<CreateShareConnectionsRequest, CreateShareConnectionsResponse> createShareConnectionsInvoker(
        CreateShareConnectionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.createShareConnections, hcClient);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpaceAnalysisTaskRequest 请求对象
     * @return CreateSpaceAnalysisTaskResponse
     */
    public CreateSpaceAnalysisTaskResponse createSpaceAnalysisTask(CreateSpaceAnalysisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createSpaceAnalysisTask);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpaceAnalysisTaskRequest 请求对象
     * @return SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>
     */
    public SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskInvoker(
        CreateSpaceAnalysisTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.createSpaceAnalysisTask, hcClient);
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
     * @return CreateSqlLimitRulesResponse
     */
    public CreateSqlLimitRulesResponse createSqlLimitRules(CreateSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createSqlLimitRules);
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
     * @return SyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse>
     */
    public SyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> createSqlLimitRulesInvoker(
        CreateSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.createSqlLimitRules, hcClient);
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
     * @return CreateTuningResponse
     */
    public CreateTuningResponse createTuning(CreateTuningRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createTuning);
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
     * @return SyncInvoker<CreateTuningRequest, CreateTuningResponse>
     */
    public SyncInvoker<CreateTuningRequest, CreateTuningResponse> createTuningInvoker(CreateTuningRequest request) {
        return new SyncInvoker<>(request, DasMeta.createTuning, hcClient);
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
     * @return DeleteDbUserResponse
     */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteDbUser);
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
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteDbUser, hcClient);
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
     * @return DeleteProcessResponse
     */
    public DeleteProcessResponse deleteProcess(DeleteProcessRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteProcess);
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
     * @return SyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public SyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessInvoker(DeleteProcessRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL和PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRulesRequest 请求对象
     * @return DeleteSqlLimitRulesResponse
     */
    public DeleteSqlLimitRulesResponse deleteSqlLimitRules(DeleteSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteSqlLimitRules);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL和PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse>
     */
    public SyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> deleteSqlLimitRulesInvoker(
        DeleteSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteSqlLimitRules, hcClient);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。免费实例仅支持查看最近一小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowQueryLogsRequest 请求对象
     * @return ExportSlowQueryLogsResponse
     */
    public ExportSlowQueryLogsResponse exportSlowQueryLogs(ExportSlowQueryLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowQueryLogs);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。免费实例仅支持查看最近一小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowQueryLogsRequest 请求对象
     * @return SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>
     */
    public SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogsInvoker(
        ExportSlowQueryLogsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSlowQueryLogs, hcClient);
    }

    /**
     * 导出慢SQL统计数据
     *
     * 慢SQL开关打开后，导出慢SQL统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlStatisticsRequest 请求对象
     * @return ExportSlowSqlStatisticsResponse
     */
    public ExportSlowSqlStatisticsResponse exportSlowSqlStatistics(ExportSlowSqlStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowSqlStatistics);
    }

    /**
     * 导出慢SQL统计数据
     *
     * 慢SQL开关打开后，导出慢SQL统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlStatisticsRequest 请求对象
     * @return SyncInvoker<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse>
     */
    public SyncInvoker<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse> exportSlowSqlStatisticsInvoker(
        ExportSlowSqlStatisticsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSlowSqlStatistics, hcClient);
    }

    /**
     * 导出慢SQL模板列表
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return ExportSlowSqlTemplatesDetailsResponse
     */
    public ExportSlowSqlTemplatesDetailsResponse exportSlowSqlTemplatesDetails(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowSqlTemplatesDetails);
    }

    /**
     * 导出慢SQL模板列表
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return SyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse>
     */
    public SyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetailsInvoker(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSlowSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出慢SQL数量趋势
     *
     * 慢SQL开关打开后，导出慢SQL数量趋势。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTrendDetailsRequest 请求对象
     * @return ExportSlowSqlTrendDetailsResponse
     */
    public ExportSlowSqlTrendDetailsResponse exportSlowSqlTrendDetails(ExportSlowSqlTrendDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowSqlTrendDetails);
    }

    /**
     * 导出慢SQL数量趋势
     *
     * 慢SQL开关打开后，导出慢SQL数量趋势。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTrendDetailsRequest 请求对象
     * @return SyncInvoker<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse>
     */
    public SyncInvoker<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse> exportSlowSqlTrendDetailsInvoker(
        ExportSlowSqlTrendDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSlowSqlTrendDetails, hcClient);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSqlStatementsRequest 请求对象
     * @return ExportSqlStatementsResponse
     */
    public ExportSqlStatementsResponse exportSqlStatements(ExportSqlStatementsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSqlStatements);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSqlStatementsRequest 请求对象
     * @return SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>
     */
    public SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatementsInvoker(
        ExportSqlStatementsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSqlStatements, hcClient);
    }

    /**
     * 导出TOP风险实例列表
     *
     * 导出TOP风险实例列表，支持查看最近24小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopRiskInstancesRequest 请求对象
     * @return ExportTopRiskInstancesResponse
     */
    public ExportTopRiskInstancesResponse exportTopRiskInstances(ExportTopRiskInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportTopRiskInstances);
    }

    /**
     * 导出TOP风险实例列表
     *
     * 导出TOP风险实例列表，支持查看最近24小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopRiskInstancesRequest 请求对象
     * @return SyncInvoker<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse>
     */
    public SyncInvoker<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse> exportTopRiskInstancesInvoker(
        ExportTopRiskInstancesRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportTopRiskInstances, hcClient);
    }

    /**
     * 导出TopSQL模板列表
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return ExportTopSqlTemplatesDetailsResponse
     */
    public ExportTopSqlTemplatesDetailsResponse exportTopSqlTemplatesDetails(
        ExportTopSqlTemplatesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportTopSqlTemplatesDetails);
    }

    /**
     * 导出TopSQL模板列表
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return SyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse>
     */
    public SyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetailsInvoker(
        ExportTopSqlTemplatesDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportTopSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出SQL执行耗时区间数据
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTrendDetailsRequest 请求对象
     * @return ExportTopSqlTrendDetailsResponse
     */
    public ExportTopSqlTrendDetailsResponse exportTopSqlTrendDetails(ExportTopSqlTrendDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportTopSqlTrendDetails);
    }

    /**
     * 导出SQL执行耗时区间数据
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTrendDetailsRequest 请求对象
     * @return SyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse>
     */
    public SyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetailsInvoker(
        ExportTopSqlTrendDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportTopSqlTrendDetails, hcClient);
    }

    /**
     * 获取DAS云DBA实例列表
     *
     * 获取DAS云DBA实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudDbaInstancesRequest 请求对象
     * @return ListCloudDbaInstancesResponse
     */
    public ListCloudDbaInstancesResponse listCloudDbaInstances(ListCloudDbaInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listCloudDbaInstances);
    }

    /**
     * 获取DAS云DBA实例列表
     *
     * 获取DAS云DBA实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudDbaInstancesRequest 请求对象
     * @return SyncInvoker<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse>
     */
    public SyncInvoker<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse> listCloudDbaInstancesInvoker(
        ListCloudDbaInstancesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listCloudDbaInstances, hcClient);
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
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listDbUsers);
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
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询实例健康诊断报告列表
     *
     * 查询实例健康诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthReportTaskRequest 请求对象
     * @return ListHealthReportTaskResponse
     */
    public ListHealthReportTaskResponse listHealthReportTask(ListHealthReportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listHealthReportTask);
    }

    /**
     * 查询实例健康诊断报告列表
     *
     * 查询实例健康诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthReportTaskRequest 请求对象
     * @return SyncInvoker<ListHealthReportTaskRequest, ListHealthReportTaskResponse>
     */
    public SyncInvoker<ListHealthReportTaskRequest, ListHealthReportTaskResponse> listHealthReportTaskInvoker(
        ListHealthReportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.listHealthReportTask, hcClient);
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
     * @return ListInnodbLocksResponse
     */
    public ListInnodbLocksResponse listInnodbLocks(ListInnodbLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInnodbLocks);
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
     * @return SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksInvoker(
        ListInnodbLocksRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInnodbLocks, hcClient);
    }

    /**
     * 查询实例分布情况
     *
     * 查询实例分布情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDistributionRequest 请求对象
     * @return ListInstanceDistributionResponse
     */
    public ListInstanceDistributionResponse listInstanceDistribution(ListInstanceDistributionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceDistribution);
    }

    /**
     * 查询实例分布情况
     *
     * 查询实例分布情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDistributionRequest 请求对象
     * @return SyncInvoker<ListInstanceDistributionRequest, ListInstanceDistributionResponse>
     */
    public SyncInvoker<ListInstanceDistributionRequest, ListInstanceDistributionResponse> listInstanceDistributionInvoker(
        ListInstanceDistributionRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceDistribution, hcClient);
    }

    /**
     * 获取多节点单指标数据
     *
     * 获取多节点单指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMultiNodesSingleMetricRequest 请求对象
     * @return ListInstanceMultiNodesSingleMetricResponse
     */
    public ListInstanceMultiNodesSingleMetricResponse listInstanceMultiNodesSingleMetric(
        ListInstanceMultiNodesSingleMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceMultiNodesSingleMetric);
    }

    /**
     * 获取多节点单指标数据
     *
     * 获取多节点单指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMultiNodesSingleMetricRequest 请求对象
     * @return SyncInvoker<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse>
     */
    public SyncInvoker<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse> listInstanceMultiNodesSingleMetricInvoker(
        ListInstanceMultiNodesSingleMetricRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceMultiNodesSingleMetric, hcClient);
    }

    /**
     * 获取单个实例节点信息
     *
     * 获取单个实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNodesInfoRequest 请求对象
     * @return ListInstanceNodesInfoResponse
     */
    public ListInstanceNodesInfoResponse listInstanceNodesInfo(ListInstanceNodesInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceNodesInfo);
    }

    /**
     * 获取单个实例节点信息
     *
     * 获取单个实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNodesInfoRequest 请求对象
     * @return SyncInvoker<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse>
     */
    public SyncInvoker<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse> listInstanceNodesInfoInvoker(
        ListInstanceNodesInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceNodesInfo, hcClient);
    }

    /**
     * 查询实例的TOP慢SQL列表
     *
     * 查询实例的TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopSlowLogRequest 请求对象
     * @return ListInstanceTopSlowLogResponse
     */
    public ListInstanceTopSlowLogResponse listInstanceTopSlowLog(ListInstanceTopSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceTopSlowLog);
    }

    /**
     * 查询实例的TOP慢SQL列表
     *
     * 查询实例的TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopSlowLogRequest 请求对象
     * @return SyncInvoker<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse>
     */
    public SyncInvoker<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse> listInstanceTopSlowLogInvoker(
        ListInstanceTopSlowLogRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceTopSlowLog, hcClient);
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
     * @return ListMetadataLocksResponse
     */
    public ListMetadataLocksResponse listMetadataLocks(ListMetadataLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listMetadataLocks);
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
     * @return SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksInvoker(
        ListMetadataLocksRequest request) {
        return new SyncInvoker<>(request, DasMeta.listMetadataLocks, hcClient);
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
     * @return ListProcessesResponse
     */
    public ListProcessesResponse listProcesses(ListProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listProcesses);
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
     * @return SyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public SyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesInvoker(ListProcessesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 查询资源风险实例风险项
     *
     * 查询资源风险实例风险项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskItemsRequest 请求对象
     * @return ListRiskItemsResponse
     */
    public ListRiskItemsResponse listRiskItems(ListRiskItemsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listRiskItems);
    }

    /**
     * 查询资源风险实例风险项
     *
     * 查询资源风险实例风险项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskItemsRequest 请求对象
     * @return SyncInvoker<ListRiskItemsRequest, ListRiskItemsResponse>
     */
    public SyncInvoker<ListRiskItemsRequest, ListRiskItemsResponse> listRiskItemsInvoker(ListRiskItemsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listRiskItems, hcClient);
    }

    /**
     * 查询资源风险实例风险趋势
     *
     * 查询资源风险实例风险趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskTrendRequest 请求对象
     * @return ListRiskTrendResponse
     */
    public ListRiskTrendResponse listRiskTrend(ListRiskTrendRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listRiskTrend);
    }

    /**
     * 查询资源风险实例风险趋势
     *
     * 查询资源风险实例风险趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskTrendRequest 请求对象
     * @return SyncInvoker<ListRiskTrendRequest, ListRiskTrendResponse>
     */
    public SyncInvoker<ListRiskTrendRequest, ListRiskTrendResponse> listRiskTrendInvoker(ListRiskTrendRequest request) {
        return new SyncInvoker<>(request, DasMeta.listRiskTrend, hcClient);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。 支持MySQL、GaussDB(for MySQL)和SQLServer引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpaceAnalysisRequest 请求对象
     * @return ListSpaceAnalysisResponse
     */
    public ListSpaceAnalysisResponse listSpaceAnalysis(ListSpaceAnalysisRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSpaceAnalysis);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。 支持MySQL、GaussDB(for MySQL)和SQLServer引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpaceAnalysisRequest 请求对象
     * @return SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>
     */
    public SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysisInvoker(
        ListSpaceAnalysisRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSpaceAnalysis, hcClient);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRulesRequest 请求对象
     * @return ListSqlLimitRulesResponse
     */
    public ListSqlLimitRulesResponse listSqlLimitRules(ListSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSqlLimitRules);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse>
     */
    public SyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> listSqlLimitRulesInvoker(
        ListSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSqlLimitRules, hcClient);
    }

    /**
     * 查询TOP慢SQL列表
     *
     * 查询TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSlowLogRequest 请求对象
     * @return ListTopSlowLogResponse
     */
    public ListTopSlowLogResponse listTopSlowLog(ListTopSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listTopSlowLog);
    }

    /**
     * 查询TOP慢SQL列表
     *
     * 查询TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSlowLogRequest 请求对象
     * @return SyncInvoker<ListTopSlowLogRequest, ListTopSlowLogResponse>
     */
    public SyncInvoker<ListTopSlowLogRequest, ListTopSlowLogResponse> listTopSlowLogInvoker(
        ListTopSlowLogRequest request) {
        return new SyncInvoker<>(request, DasMeta.listTopSlowLog, hcClient);
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
     * @return ListTransactionsResponse
     */
    public ListTransactionsResponse listTransactions(ListTransactionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listTransactions);
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
     * @return SyncInvoker<ListTransactionsRequest, ListTransactionsResponse>
     */
    public SyncInvoker<ListTransactionsRequest, ListTransactionsResponse> listTransactionsInvoker(
        ListTransactionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listTransactions, hcClient);
    }

    /**
     * 根据原始SQL生成SQL限流关键字
     *
     * 根据原始SQL生成SQL限流关键字，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseSqlLimitRulesRequest 请求对象
     * @return ParseSqlLimitRulesResponse
     */
    public ParseSqlLimitRulesResponse parseSqlLimitRules(ParseSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.parseSqlLimitRules);
    }

    /**
     * 根据原始SQL生成SQL限流关键字
     *
     * 根据原始SQL生成SQL限流关键字，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse>
     */
    public SyncInvoker<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse> parseSqlLimitRulesInvoker(
        ParseSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.parseSqlLimitRules, hcClient);
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
     * @return RegisterDbUserResponse
     */
    public RegisterDbUserResponse registerDbUser(RegisterDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.registerDbUser);
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
     * @return SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserInvoker(
        RegisterDbUserRequest request) {
        return new SyncInvoker<>(request, DasMeta.registerDbUser, hcClient);
    }

    /**
     * 设置指标阈值
     *
     * 设置指标阈值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetThresholdForMetricRequest 请求对象
     * @return SetThresholdForMetricResponse
     */
    public SetThresholdForMetricResponse setThresholdForMetric(SetThresholdForMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.setThresholdForMetric);
    }

    /**
     * 设置指标阈值
     *
     * 设置指标阈值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetThresholdForMetricRequest 请求对象
     * @return SyncInvoker<SetThresholdForMetricRequest, SetThresholdForMetricResponse>
     */
    public SyncInvoker<SetThresholdForMetricRequest, SetThresholdForMetricResponse> setThresholdForMetricInvoker(
        SetThresholdForMetricRequest request) {
        return new SyncInvoker<>(request, DasMeta.setThresholdForMetric, hcClient);
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
     * @return ShowDbUserResponse
     */
    public ShowDbUserResponse showDbUser(ShowDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDbUser);
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
     * @return SyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public SyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserInvoker(ShowDbUserRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 获取实例健康诊断报告内容
     *
     * 获取实例健康诊断报告内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReportRequest 请求对象
     * @return ShowInstanceHealthReportResponse
     */
    public ShowInstanceHealthReportResponse showInstanceHealthReport(ShowInstanceHealthReportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showInstanceHealthReport);
    }

    /**
     * 获取实例健康诊断报告内容
     *
     * 获取实例健康诊断报告内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReportRequest 请求对象
     * @return SyncInvoker<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse>
     */
    public SyncInvoker<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse> showInstanceHealthReportInvoker(
        ShowInstanceHealthReportRequest request) {
        return new SyncInvoker<>(request, DasMeta.showInstanceHealthReport, hcClient);
    }

    /**
     * 多节点单指标支持指标信息
     *
     * 多节点单指标支持指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesSupportRequest 请求对象
     * @return ShowMetricNamesSupportResponse
     */
    public ShowMetricNamesSupportResponse showMetricNamesSupport(ShowMetricNamesSupportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showMetricNamesSupport);
    }

    /**
     * 多节点单指标支持指标信息
     *
     * 多节点单指标支持指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesSupportRequest 请求对象
     * @return SyncInvoker<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse>
     */
    public SyncInvoker<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse> showMetricNamesSupportInvoker(
        ShowMetricNamesSupportRequest request) {
        return new SyncInvoker<>(request, DasMeta.showMetricNamesSupport, hcClient);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showQuotas);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, DasMeta.showQuotas, hcClient);
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
     * @return ShowSqlExecutionPlanResponse
     */
    public ShowSqlExecutionPlanResponse showSqlExecutionPlan(ShowSqlExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlExecutionPlan);
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
     * @return SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanInvoker(
        ShowSqlExecutionPlanRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlExecutionPlan, hcClient);
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
     * @return ShowSqlExplainResponse
     */
    public ShowSqlExplainResponse showSqlExplain(ShowSqlExplainRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlExplain);
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
     * @return SyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse>
     */
    public SyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse> showSqlExplainInvoker(
        ShowSqlExplainRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlExplain, hcClient);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitJobInfoRequest 请求对象
     * @return ShowSqlLimitJobInfoResponse
     */
    public ShowSqlLimitJobInfoResponse showSqlLimitJobInfo(ShowSqlLimitJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlLimitJobInfo);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitJobInfoRequest 请求对象
     * @return SyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse>
     */
    public SyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> showSqlLimitJobInfoInvoker(
        ShowSqlLimitJobInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlLimitJobInfo, hcClient);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitSwitchStatusRequest 请求对象
     * @return ShowSqlLimitSwitchStatusResponse
     */
    public ShowSqlLimitSwitchStatusResponse showSqlLimitSwitchStatus(ShowSqlLimitSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlLimitSwitchStatus);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse>
     */
    public SyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatusInvoker(
        ShowSqlLimitSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlLimitSwitchStatus, hcClient);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlSwitchStatusRequest 请求对象
     * @return ShowSqlSwitchStatusResponse
     */
    public ShowSqlSwitchStatusResponse showSqlSwitchStatus(ShowSqlSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlSwitchStatus);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>
     */
    public SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatusInvoker(
        ShowSqlSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlSwitchStatus, hcClient);
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
     * @return ShowTransactionSwitchStatusResponse
     */
    public ShowTransactionSwitchStatusResponse showTransactionSwitchStatus(ShowTransactionSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showTransactionSwitchStatus);
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
     * @return SyncInvoker<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse>
     */
    public SyncInvoker<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse> showTransactionSwitchStatusInvoker(
        ShowTransactionSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.showTransactionSwitchStatus, hcClient);
    }

    /**
     * 获取诊断结果
     *
     * 获取诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningRequest 请求对象
     * @return ShowTuningResponse
     */
    public ShowTuningResponse showTuning(ShowTuningRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showTuning);
    }

    /**
     * 获取诊断结果
     *
     * 获取诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningRequest 请求对象
     * @return SyncInvoker<ShowTuningRequest, ShowTuningResponse>
     */
    public SyncInvoker<ShowTuningRequest, ShowTuningResponse> showTuningInvoker(ShowTuningRequest request) {
        return new SyncInvoker<>(request, DasMeta.showTuning, hcClient);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstancesRequest 请求对象
     * @return SynchronizeInstancesResponse
     */
    public SynchronizeInstancesResponse synchronizeInstances(SynchronizeInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.synchronizeInstances);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstancesRequest 请求对象
     * @return SyncInvoker<SynchronizeInstancesRequest, SynchronizeInstancesResponse>
     */
    public SyncInvoker<SynchronizeInstancesRequest, SynchronizeInstancesResponse> synchronizeInstancesInvoker(
        SynchronizeInstancesRequest request) {
        return new SyncInvoker<>(request, DasMeta.synchronizeInstances, hcClient);
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
     * @return UpdateDbUserResponse
     */
    public UpdateDbUserResponse updateDbUser(UpdateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateDbUser);
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
     * @return SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserInvoker(UpdateDbUserRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateDbUser, hcClient);
    }

    /**
     * 修改SQL限流规则
     *
     * 修改SQL限流规则。目前仅支持PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRulesRequest 请求对象
     * @return UpdateSqlLimitRulesResponse
     */
    public UpdateSqlLimitRulesResponse updateSqlLimitRules(UpdateSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateSqlLimitRules);
    }

    /**
     * 修改SQL限流规则
     *
     * 修改SQL限流规则。目前仅支持PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse>
     */
    public SyncInvoker<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse> updateSqlLimitRulesInvoker(
        UpdateSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateSqlLimitRules, hcClient);
    }

}
