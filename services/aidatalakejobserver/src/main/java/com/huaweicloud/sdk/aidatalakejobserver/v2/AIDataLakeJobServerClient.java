package com.huaweicloud.sdk.aidatalakejobserver.v2;

import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelSparkJobRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelSparkJobResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelSparkSqlRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelSparkSqlResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CloseAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CloseAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CreateAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CreateAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ExecuteAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ExecuteAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraSessionStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraSessionStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraSqlSessionsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraSqlSessionsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListSparkJobsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListSparkJobsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListSparkSqlsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListSparkSqlsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.PreviewSparkSqlResultRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.PreviewSparkSqlResultResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RestartSparkSqlClusterRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RestartSparkSqlClusterResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkJobRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkJobResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkSqlRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkSqlResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlStatementResultRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlStatementResultResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementOperatorMetricsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementOperatorMetricsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementQueryMetricsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementQueryMetricsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkJobRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkJobResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkJobStateRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkJobStateResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkOperatorStateRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkOperatorStateResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkSqlRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkSqlResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkSqlStateRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkSqlStateResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AIDataLakeJobServerClient {

    protected HcClient hcClient;

    public AIDataLakeJobServerClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AIDataLakeJobServerClient> newBuilder() {
        ClientBuilder<AIDataLakeJobServerClient> clientBuilder = new ClientBuilder<>(AIDataLakeJobServerClient::new);
        return clientBuilder;
    }

    /**
     * 取消SQL执行
     *
     * 取消SQL语句执行。 用户可通过该接口取消SQL语句执行，输入为SQL Session id、statement id，返回操作结果。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuraSqlStatementRequest 请求对象
     * @return CancelAuraSqlStatementResponse
     */
    public CancelAuraSqlStatementResponse cancelAuraSqlStatement(CancelAuraSqlStatementRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.cancelAuraSqlStatement);
    }

    /**
     * 取消SQL执行
     *
     * 取消SQL语句执行。 用户可通过该接口取消SQL语句执行，输入为SQL Session id、statement id，返回操作结果。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuraSqlStatementRequest 请求对象
     * @return SyncInvoker<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse>
     */
    public SyncInvoker<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse> cancelAuraSqlStatementInvoker(
        CancelAuraSqlStatementRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.cancelAuraSqlStatement, hcClient);
    }

    /**
     * 关闭Session
     *
     * 关闭SQL Session。
     * 用户可通过此接口关闭SQL Session，输入为Session id，返回操作结果。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseAuraSqlSessionRequest 请求对象
     * @return CloseAuraSqlSessionResponse
     */
    public CloseAuraSqlSessionResponse closeAuraSqlSession(CloseAuraSqlSessionRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.closeAuraSqlSession);
    }

    /**
     * 关闭Session
     *
     * 关闭SQL Session。
     * 用户可通过此接口关闭SQL Session，输入为Session id，返回操作结果。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseAuraSqlSessionRequest 请求对象
     * @return SyncInvoker<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse>
     */
    public SyncInvoker<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse> closeAuraSqlSessionInvoker(
        CloseAuraSqlSessionRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.closeAuraSqlSession, hcClient);
    }

    /**
     * 创建Session
     *
     * 创建SQL Session。
     * 用户通过此接口在指定端点创建SQL Session，通过输入端点id、LakeFormation配置，返回Session信息。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuraSqlSessionRequest 请求对象
     * @return CreateAuraSqlSessionResponse
     */
    public CreateAuraSqlSessionResponse createAuraSqlSession(CreateAuraSqlSessionRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.createAuraSqlSession);
    }

    /**
     * 创建Session
     *
     * 创建SQL Session。
     * 用户通过此接口在指定端点创建SQL Session，通过输入端点id、LakeFormation配置，返回Session信息。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuraSqlSessionRequest 请求对象
     * @return SyncInvoker<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse>
     */
    public SyncInvoker<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse> createAuraSqlSessionInvoker(
        CreateAuraSqlSessionRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.createAuraSqlSession, hcClient);
    }

    /**
     * 在指定Session中执行SQL
     *
     * 在指定的Session下执行SQL语句。
     * 用户可通过此接口执行SQL语句，输入为SQL语句、SQL Session id、绑定参数等信息，返回语句执行结果或statement id。
     * 此接口支持异步和同步两种执行模式，由入参is_sync参数决定。如果是异步执行，配套使用[查看SQL执行结果](ShowAuraV2SqlStatementResult.xml)接口查询语句结果。
     * 如果是同步执行，接口会等待一段时间接收结果，如果执行完毕会返回执行结果，如果没有执行完毕，会返回一个运行中状态，后续可以使用[查看SQL执行结果](ShowAuraV2SqlStatementResult.xml)接口查询语句结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteAuraSqlStatementRequest 请求对象
     * @return ExecuteAuraSqlStatementResponse
     */
    public ExecuteAuraSqlStatementResponse executeAuraSqlStatement(ExecuteAuraSqlStatementRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.executeAuraSqlStatement);
    }

    /**
     * 在指定Session中执行SQL
     *
     * 在指定的Session下执行SQL语句。
     * 用户可通过此接口执行SQL语句，输入为SQL语句、SQL Session id、绑定参数等信息，返回语句执行结果或statement id。
     * 此接口支持异步和同步两种执行模式，由入参is_sync参数决定。如果是异步执行，配套使用[查看SQL执行结果](ShowAuraV2SqlStatementResult.xml)接口查询语句结果。
     * 如果是同步执行，接口会等待一段时间接收结果，如果执行完毕会返回执行结果，如果没有执行完毕，会返回一个运行中状态，后续可以使用[查看SQL执行结果](ShowAuraV2SqlStatementResult.xml)接口查询语句结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteAuraSqlStatementRequest 请求对象
     * @return SyncInvoker<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse>
     */
    public SyncInvoker<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse> executeAuraSqlStatementInvoker(
        ExecuteAuraSqlStatementRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.executeAuraSqlStatement, hcClient);
    }

    /**
     * 查看指定Session下的SQL执行记录
     *
     * 查询指定Session下的SQL执行记录。
     * 输入workspace_id，session_id，statement_id（可选），status（可选），分页查询参数limit和marker；输出此会话下SQL执行记录。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraSessionStatementRecordsRequest 请求对象
     * @return ListAuraSessionStatementRecordsResponse
     */
    public ListAuraSessionStatementRecordsResponse listAuraSessionStatementRecords(
        ListAuraSessionStatementRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.listAuraSessionStatementRecords);
    }

    /**
     * 查看指定Session下的SQL执行记录
     *
     * 查询指定Session下的SQL执行记录。
     * 输入workspace_id，session_id，statement_id（可选），status（可选），分页查询参数limit和marker；输出此会话下SQL执行记录。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraSessionStatementRecordsRequest 请求对象
     * @return SyncInvoker<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse>
     */
    public SyncInvoker<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse> listAuraSessionStatementRecordsInvoker(
        ListAuraSessionStatementRecordsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.listAuraSessionStatementRecords, hcClient);
    }

    /**
     * 查看Session列表
     *
     * 查询SQL Session列表。
     * 输入workspace_id，endpoint_name（可选），status（可选），session_id（可选），start_time（可选），end_time（可选）,分页查询参数limit和marker；输出SQL会话列表，包含会话id、会话创建时间、结束时间、会话状态等信息。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraSqlSessionsRequest 请求对象
     * @return ListAuraSqlSessionsResponse
     */
    public ListAuraSqlSessionsResponse listAuraSqlSessions(ListAuraSqlSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.listAuraSqlSessions);
    }

    /**
     * 查看Session列表
     *
     * 查询SQL Session列表。
     * 输入workspace_id，endpoint_name（可选），status（可选），session_id（可选），start_time（可选），end_time（可选）,分页查询参数limit和marker；输出SQL会话列表，包含会话id、会话创建时间、结束时间、会话状态等信息。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraSqlSessionsRequest 请求对象
     * @return SyncInvoker<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse>
     */
    public SyncInvoker<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse> listAuraSqlSessionsInvoker(
        ListAuraSqlSessionsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.listAuraSqlSessions, hcClient);
    }

    /**
     * 查看SQL执行记录
     *
     * 查询SQL执行记录。 查询指定Session下的SQL执行记录。 输入workspace_id，session_id，statement_id（可选），status（可选），分页查询参数limit和marker；输出此会话下SQL执行记录。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraStatementRecordsRequest 请求对象
     * @return ListAuraStatementRecordsResponse
     */
    public ListAuraStatementRecordsResponse listAuraStatementRecords(ListAuraStatementRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.listAuraStatementRecords);
    }

    /**
     * 查看SQL执行记录
     *
     * 查询SQL执行记录。 查询指定Session下的SQL执行记录。 输入workspace_id，session_id，statement_id（可选），status（可选），分页查询参数limit和marker；输出此会话下SQL执行记录。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraStatementRecordsRequest 请求对象
     * @return SyncInvoker<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse>
     */
    public SyncInvoker<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse> listAuraStatementRecordsInvoker(
        ListAuraStatementRecordsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.listAuraStatementRecords, hcClient);
    }

    /**
     * 查看Session详情
     *
     * 查询SQL Session信息。
     * 用户可通过此接口查询SQL Session信息，输入为Session id，返回操作结果。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraSqlSessionRequest 请求对象
     * @return ShowAuraSqlSessionResponse
     */
    public ShowAuraSqlSessionResponse showAuraSqlSession(ShowAuraSqlSessionRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showAuraSqlSession);
    }

    /**
     * 查看Session详情
     *
     * 查询SQL Session信息。
     * 用户可通过此接口查询SQL Session信息，输入为Session id，返回操作结果。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraSqlSessionRequest 请求对象
     * @return SyncInvoker<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse>
     */
    public SyncInvoker<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse> showAuraSqlSessionInvoker(
        ShowAuraSqlSessionRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showAuraSqlSession, hcClient);
    }

    /**
     * 查看SQL执行结果。
     *
     * 查询SQL语句执行结果。
     * 用户可通过该接口查询SQL语句执行结果，输入为SQL Session id、statement id，返回执行结果。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraSqlStatementResultRequest 请求对象
     * @return ShowAuraSqlStatementResultResponse
     */
    public ShowAuraSqlStatementResultResponse showAuraSqlStatementResult(ShowAuraSqlStatementResultRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showAuraSqlStatementResult);
    }

    /**
     * 查看SQL执行结果。
     *
     * 查询SQL语句执行结果。
     * 用户可通过该接口查询SQL语句执行结果，输入为SQL Session id、statement id，返回执行结果。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraSqlStatementResultRequest 请求对象
     * @return SyncInvoker<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse>
     */
    public SyncInvoker<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse> showAuraSqlStatementResultInvoker(
        ShowAuraSqlStatementResultRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showAuraSqlStatementResult, hcClient);
    }

    /**
     * 查看SQL执行算子监控记录
     *
     * 查看SQL执行算子监控记录。 用户可通过该接口查看SQL执行算子监控记录，输入为SQL Session id、statement id，返回操作结果。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraStatementOperatorMetricsRequest 请求对象
     * @return ShowAuraStatementOperatorMetricsResponse
     */
    public ShowAuraStatementOperatorMetricsResponse showAuraStatementOperatorMetrics(
        ShowAuraStatementOperatorMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showAuraStatementOperatorMetrics);
    }

    /**
     * 查看SQL执行算子监控记录
     *
     * 查看SQL执行算子监控记录。 用户可通过该接口查看SQL执行算子监控记录，输入为SQL Session id、statement id，返回操作结果。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraStatementOperatorMetricsRequest 请求对象
     * @return SyncInvoker<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse>
     */
    public SyncInvoker<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse> showAuraStatementOperatorMetricsInvoker(
        ShowAuraStatementOperatorMetricsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showAuraStatementOperatorMetrics, hcClient);
    }

    /**
     * 查看语句监控详情
     *
     * 查询语句监控详情信息。
     * 输入workspace_id，session_id，statement_id，输出此会话下SQL监控数据。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraStatementQueryMetricsRequest 请求对象
     * @return ShowAuraStatementQueryMetricsResponse
     */
    public ShowAuraStatementQueryMetricsResponse showAuraStatementQueryMetrics(
        ShowAuraStatementQueryMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showAuraStatementQueryMetrics);
    }

    /**
     * 查看语句监控详情
     *
     * 查询语句监控详情信息。
     * 输入workspace_id，session_id，statement_id，输出此会话下SQL监控数据。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraStatementQueryMetricsRequest 请求对象
     * @return SyncInvoker<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse>
     */
    public SyncInvoker<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse> showAuraStatementQueryMetricsInvoker(
        ShowAuraStatementQueryMetricsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showAuraStatementQueryMetrics, hcClient);
    }

    /**
     * 取消Spark作业执行
     *
     * 取消正在执行的Spark作业，此接口为同步接口。调用成功后，作业将被终止执行，直接返回取消结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSparkJobRequest 请求对象
     * @return CancelSparkJobResponse
     */
    public CancelSparkJobResponse cancelSparkJob(CancelSparkJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.cancelSparkJob);
    }

    /**
     * 取消Spark作业执行
     *
     * 取消正在执行的Spark作业，此接口为同步接口。调用成功后，作业将被终止执行，直接返回取消结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSparkJobRequest 请求对象
     * @return SyncInvoker<CancelSparkJobRequest, CancelSparkJobResponse>
     */
    public SyncInvoker<CancelSparkJobRequest, CancelSparkJobResponse> cancelSparkJobInvoker(
        CancelSparkJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.cancelSparkJob, hcClient);
    }

    /**
     * 查询Spark作业列表
     *
     * 查询工作空间下Spark作业列表，此接口为同步接口。支持按作业ID、作业名称、作业状态、作业类型、创建时间等条件过滤查询，支持分页查询，调用成功后直接返回作业列表数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSparkJobsRequest 请求对象
     * @return ListSparkJobsResponse
     */
    public ListSparkJobsResponse listSparkJobs(ListSparkJobsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.listSparkJobs);
    }

    /**
     * 查询Spark作业列表
     *
     * 查询工作空间下Spark作业列表，此接口为同步接口。支持按作业ID、作业名称、作业状态、作业类型、创建时间等条件过滤查询，支持分页查询，调用成功后直接返回作业列表数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSparkJobsRequest 请求对象
     * @return SyncInvoker<ListSparkJobsRequest, ListSparkJobsResponse>
     */
    public SyncInvoker<ListSparkJobsRequest, ListSparkJobsResponse> listSparkJobsInvoker(ListSparkJobsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.listSparkJobs, hcClient);
    }

    /**
     * 启动Spark作业
     *
     * 启动Spark作业，此接口为异步接口。支持Spark Jar作业、Python作业和SQL Script作业。调用该接口后，作业将提交到队列等待执行，返回作业ID后需通过查询作业状态接口确认作业是否成功启动。查询作业状态请参见[查询Spark作业的状态](ShowSparkJobState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSparkJobRequest 请求对象
     * @return RunSparkJobResponse
     */
    public RunSparkJobResponse runSparkJob(RunSparkJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.runSparkJob);
    }

    /**
     * 启动Spark作业
     *
     * 启动Spark作业，此接口为异步接口。支持Spark Jar作业、Python作业和SQL Script作业。调用该接口后，作业将提交到队列等待执行，返回作业ID后需通过查询作业状态接口确认作业是否成功启动。查询作业状态请参见[查询Spark作业的状态](ShowSparkJobState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSparkJobRequest 请求对象
     * @return SyncInvoker<RunSparkJobRequest, RunSparkJobResponse>
     */
    public SyncInvoker<RunSparkJobRequest, RunSparkJobResponse> runSparkJobInvoker(RunSparkJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.runSparkJob, hcClient);
    }

    /**
     * 查看Spark作业详情
     *
     * 查看指定Spark作业的详细信息，此接口为同步接口。包括作业ID、作业名称、作业状态、作业配置、资源配置、镜像配置等完整信息，调用成功后直接返回作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkJobRequest 请求对象
     * @return ShowSparkJobResponse
     */
    public ShowSparkJobResponse showSparkJob(ShowSparkJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showSparkJob);
    }

    /**
     * 查看Spark作业详情
     *
     * 查看指定Spark作业的详细信息，此接口为同步接口。包括作业ID、作业名称、作业状态、作业配置、资源配置、镜像配置等完整信息，调用成功后直接返回作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkJobRequest 请求对象
     * @return SyncInvoker<ShowSparkJobRequest, ShowSparkJobResponse>
     */
    public SyncInvoker<ShowSparkJobRequest, ShowSparkJobResponse> showSparkJobInvoker(ShowSparkJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showSparkJob, hcClient);
    }

    /**
     * 查询Spark作业的状态
     *
     * 查询Spark作业的状态，此接口为同步接口。可通过作业ID查询Spark作业的当前执行状态，包括排队中、运行中、已成功、已失败等状态，调用后立即返回作业当前状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkJobStateRequest 请求对象
     * @return ShowSparkJobStateResponse
     */
    public ShowSparkJobStateResponse showSparkJobState(ShowSparkJobStateRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showSparkJobState);
    }

    /**
     * 查询Spark作业的状态
     *
     * 查询Spark作业的状态，此接口为同步接口。可通过作业ID查询Spark作业的当前执行状态，包括排队中、运行中、已成功、已失败等状态，调用后立即返回作业当前状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkJobStateRequest 请求对象
     * @return SyncInvoker<ShowSparkJobStateRequest, ShowSparkJobStateResponse>
     */
    public SyncInvoker<ShowSparkJobStateRequest, ShowSparkJobStateResponse> showSparkJobStateInvoker(
        ShowSparkJobStateRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showSparkJobState, hcClient);
    }

    /**
     * 查询Spark异步操作状态
     *
     * 查询Spark异步操作的执行状态，用于获取异步操作（如重启集群等）的当前状态和执行结果。该接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkOperatorStateRequest 请求对象
     * @return ShowSparkOperatorStateResponse
     */
    public ShowSparkOperatorStateResponse showSparkOperatorState(ShowSparkOperatorStateRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showSparkOperatorState);
    }

    /**
     * 查询Spark异步操作状态
     *
     * 查询Spark异步操作的执行状态，用于获取异步操作（如重启集群等）的当前状态和执行结果。该接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkOperatorStateRequest 请求对象
     * @return SyncInvoker<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse>
     */
    public SyncInvoker<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse> showSparkOperatorStateInvoker(
        ShowSparkOperatorStateRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showSparkOperatorState, hcClient);
    }

    /**
     * 取消SparkSql作业执行
     *
     * 取消正在运行或排队中的SparkSql作业，此接口为同步接口。只能取消处于QUEUED或RUNNING状态的作业，调用成功后直接返回取消结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSparkSqlRequest 请求对象
     * @return CancelSparkSqlResponse
     */
    public CancelSparkSqlResponse cancelSparkSql(CancelSparkSqlRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.cancelSparkSql);
    }

    /**
     * 取消SparkSql作业执行
     *
     * 取消正在运行或排队中的SparkSql作业，此接口为同步接口。只能取消处于QUEUED或RUNNING状态的作业，调用成功后直接返回取消结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSparkSqlRequest 请求对象
     * @return SyncInvoker<CancelSparkSqlRequest, CancelSparkSqlResponse>
     */
    public SyncInvoker<CancelSparkSqlRequest, CancelSparkSqlResponse> cancelSparkSqlInvoker(
        CancelSparkSqlRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.cancelSparkSql, hcClient);
    }

    /**
     * 查询SparkSql作业列表
     *
     * 查询工作空间下SparkSql作业列表，此接口为同步接口。支持按作业状态、创建时间、SQL片段等条件进行过滤查询，调用成功后直接返回作业列表数据。可通过[查看SparkSql作业详情](ShowSparkSql.xml)接口查看作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSparkSqlsRequest 请求对象
     * @return ListSparkSqlsResponse
     */
    public ListSparkSqlsResponse listSparkSqls(ListSparkSqlsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.listSparkSqls);
    }

    /**
     * 查询SparkSql作业列表
     *
     * 查询工作空间下SparkSql作业列表，此接口为同步接口。支持按作业状态、创建时间、SQL片段等条件进行过滤查询，调用成功后直接返回作业列表数据。可通过[查看SparkSql作业详情](ShowSparkSql.xml)接口查看作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSparkSqlsRequest 请求对象
     * @return SyncInvoker<ListSparkSqlsRequest, ListSparkSqlsResponse>
     */
    public SyncInvoker<ListSparkSqlsRequest, ListSparkSqlsResponse> listSparkSqlsInvoker(ListSparkSqlsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.listSparkSqls, hcClient);
    }

    /**
     * 预览SparkSql作业查询结果
     *
     * 预览SparkSql作业的查询结果，此接口为同步接口。仅适用于执行成功的DQL类型作业，可查看作业返回的数据内容，调用成功后直接返回查询结果数据。可通过[查看SparkSql作业详情](ShowSparkSql.xml)接口查看作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PreviewSparkSqlResultRequest 请求对象
     * @return PreviewSparkSqlResultResponse
     */
    public PreviewSparkSqlResultResponse previewSparkSqlResult(PreviewSparkSqlResultRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.previewSparkSqlResult);
    }

    /**
     * 预览SparkSql作业查询结果
     *
     * 预览SparkSql作业的查询结果，此接口为同步接口。仅适用于执行成功的DQL类型作业，可查看作业返回的数据内容，调用成功后直接返回查询结果数据。可通过[查看SparkSql作业详情](ShowSparkSql.xml)接口查看作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PreviewSparkSqlResultRequest 请求对象
     * @return SyncInvoker<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse>
     */
    public SyncInvoker<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse> previewSparkSqlResultInvoker(
        PreviewSparkSqlResultRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.previewSparkSqlResult, hcClient);
    }

    /**
     * 重启SparkSql集群
     *
     * 重启SparkSql集群，该接口为异步接口，接口调用成功后会返回操作ID（operation_id），您可以通过查询Spark异步操作状态接口查询操作执行结果，详情请参见[查询Spark异步操作状态](ShowSparkOperatorState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartSparkSqlClusterRequest 请求对象
     * @return RestartSparkSqlClusterResponse
     */
    public RestartSparkSqlClusterResponse restartSparkSqlCluster(RestartSparkSqlClusterRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.restartSparkSqlCluster);
    }

    /**
     * 重启SparkSql集群
     *
     * 重启SparkSql集群，该接口为异步接口，接口调用成功后会返回操作ID（operation_id），您可以通过查询Spark异步操作状态接口查询操作执行结果，详情请参见[查询Spark异步操作状态](ShowSparkOperatorState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartSparkSqlClusterRequest 请求对象
     * @return SyncInvoker<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse>
     */
    public SyncInvoker<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse> restartSparkSqlClusterInvoker(
        RestartSparkSqlClusterRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.restartSparkSqlCluster, hcClient);
    }

    /**
     * 执行SparkSql作业
     *
     * 执行SparkSql作业，此接口为异步接口。接口调用成功后会返回作业ID（statement_id）,您可以通过查询作业状态接口查询作业执行结果，详情请参见[查询SparkSql作业的状态](ShowSparkSqlState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSparkSqlRequest 请求对象
     * @return RunSparkSqlResponse
     */
    public RunSparkSqlResponse runSparkSql(RunSparkSqlRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.runSparkSql);
    }

    /**
     * 执行SparkSql作业
     *
     * 执行SparkSql作业，此接口为异步接口。接口调用成功后会返回作业ID（statement_id）,您可以通过查询作业状态接口查询作业执行结果，详情请参见[查询SparkSql作业的状态](ShowSparkSqlState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSparkSqlRequest 请求对象
     * @return SyncInvoker<RunSparkSqlRequest, RunSparkSqlResponse>
     */
    public SyncInvoker<RunSparkSqlRequest, RunSparkSqlResponse> runSparkSqlInvoker(RunSparkSqlRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.runSparkSql, hcClient);
    }

    /**
     * 查看SparkSql作业详情
     *
     * 查看SparkSql作业的详细信息，此接口为同步接口。包括作业状态、SQL内容、执行参数等，调用成功后直接返回作业详细信息。可通过[执行SparkSql作业](RunSparkSql.xml)接口创建作业，通过[查询SparkSql作业列表](ListSparkSqls.xml)接口查询作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkSqlRequest 请求对象
     * @return ShowSparkSqlResponse
     */
    public ShowSparkSqlResponse showSparkSql(ShowSparkSqlRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showSparkSql);
    }

    /**
     * 查看SparkSql作业详情
     *
     * 查看SparkSql作业的详细信息，此接口为同步接口。包括作业状态、SQL内容、执行参数等，调用成功后直接返回作业详细信息。可通过[执行SparkSql作业](RunSparkSql.xml)接口创建作业，通过[查询SparkSql作业列表](ListSparkSqls.xml)接口查询作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkSqlRequest 请求对象
     * @return SyncInvoker<ShowSparkSqlRequest, ShowSparkSqlResponse>
     */
    public SyncInvoker<ShowSparkSqlRequest, ShowSparkSqlResponse> showSparkSqlInvoker(ShowSparkSqlRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showSparkSql, hcClient);
    }

    /**
     * 查询SparkSql作业的状态
     *
     * 查询SparkSql作业的状态，此接口为同步接口。可通过查询SparkSql作业列表接口获取statement_id，调用成功后直接返回作业当前状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkSqlStateRequest 请求对象
     * @return ShowSparkSqlStateResponse
     */
    public ShowSparkSqlStateResponse showSparkSqlState(ShowSparkSqlStateRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeJobServerMeta.showSparkSqlState);
    }

    /**
     * 查询SparkSql作业的状态
     *
     * 查询SparkSql作业的状态，此接口为同步接口。可通过查询SparkSql作业列表接口获取statement_id，调用成功后直接返回作业当前状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkSqlStateRequest 请求对象
     * @return SyncInvoker<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse>
     */
    public SyncInvoker<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse> showSparkSqlStateInvoker(
        ShowSparkSqlStateRequest request) {
        return new SyncInvoker<>(request, AIDataLakeJobServerMeta.showSparkSqlState, hcClient);
    }

}
