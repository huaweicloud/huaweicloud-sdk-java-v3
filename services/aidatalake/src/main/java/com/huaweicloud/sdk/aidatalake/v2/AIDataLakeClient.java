package com.huaweicloud.sdk.aidatalake.v2;

import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseRaySessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseRaySessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRaySessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRaySessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ExecuteAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ExecuteAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSessionStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSessionStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSqlSessionsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSqlSessionsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFederationsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFederationsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobAutoscalingHistoriesRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobAutoscalingHistoriesResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobEventsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobEventsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListRayJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListRayJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkSqlsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkSqlsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.PreviewSparkSqlResultRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.PreviewSparkSqlResultResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RestartSparkSqlClusterRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RestartSparkSqlClusterResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlStatementResultRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlStatementResultResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementOperatorMetricsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementOperatorMetricsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementQueryMetricsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementQueryMetricsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobAutoscalingPolicyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobAutoscalingPolicyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkOperatorStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkOperatorStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFlinkJobAutoscalingPolicyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFlinkJobAutoscalingPolicyResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AIDataLakeClient {

    protected HcClient hcClient;

    public AIDataLakeClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AIDataLakeClient> newBuilder() {
        ClientBuilder<AIDataLakeClient> clientBuilder = new ClientBuilder<>(AIDataLakeClient::new);
        return clientBuilder;
    }

    /**
     * 取消Aura Dataframe Job
     *
     * 取消正在运行中的Dataframe Job。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuraDataframeJobRequest 请求对象
     * @return CancelAuraDataframeJobResponse
     */
    public CancelAuraDataframeJobResponse cancelAuraDataframeJob(CancelAuraDataframeJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.cancelAuraDataframeJob);
    }

    /**
     * 取消Aura Dataframe Job
     *
     * 取消正在运行中的Dataframe Job。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuraDataframeJobRequest 请求对象
     * @return SyncInvoker<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse>
     */
    public SyncInvoker<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse> cancelAuraDataframeJobInvoker(
        CancelAuraDataframeJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.cancelAuraDataframeJob, hcClient);
    }

    /**
     * 创建Aura Dataframe Job
     *
     * 创建Dataframe Job。
     * 用户通过此接口在指定端点创建Dataframe Job。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuraDataframeJobRequest 请求对象
     * @return CreateAuraDataframeJobResponse
     */
    public CreateAuraDataframeJobResponse createAuraDataframeJob(CreateAuraDataframeJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.createAuraDataframeJob);
    }

    /**
     * 创建Aura Dataframe Job
     *
     * 创建Dataframe Job。
     * 用户通过此接口在指定端点创建Dataframe Job。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuraDataframeJobRequest 请求对象
     * @return SyncInvoker<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse>
     */
    public SyncInvoker<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse> createAuraDataframeJobInvoker(
        CreateAuraDataframeJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.createAuraDataframeJob, hcClient);
    }

    /**
     * 查看Aura Dataframe Job列表
     *
     * 查询Aura Dataframe Job列表。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraDataframeJobRequest 请求对象
     * @return ListAuraDataframeJobResponse
     */
    public ListAuraDataframeJobResponse listAuraDataframeJob(ListAuraDataframeJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listAuraDataframeJob);
    }

    /**
     * 查看Aura Dataframe Job列表
     *
     * 查询Aura Dataframe Job列表。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraDataframeJobRequest 请求对象
     * @return SyncInvoker<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse>
     */
    public SyncInvoker<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse> listAuraDataframeJobInvoker(
        ListAuraDataframeJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.listAuraDataframeJob, hcClient);
    }

    /**
     * 查看Aura Dataframe Job详情
     *
     * 查询Aura Dataframe Job信息。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraDataframeJobRequest 请求对象
     * @return ShowAuraDataframeJobResponse
     */
    public ShowAuraDataframeJobResponse showAuraDataframeJob(ShowAuraDataframeJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showAuraDataframeJob);
    }

    /**
     * 查看Aura Dataframe Job详情
     *
     * 查询Aura Dataframe Job信息。
     * 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraDataframeJobRequest 请求对象
     * @return SyncInvoker<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse>
     */
    public SyncInvoker<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse> showAuraDataframeJobInvoker(
        ShowAuraDataframeJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.showAuraDataframeJob, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.cancelAuraSqlStatement);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.cancelAuraSqlStatement, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.closeAuraSqlSession);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.closeAuraSqlSession, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.createAuraSqlSession);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.createAuraSqlSession, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.executeAuraSqlStatement);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.executeAuraSqlStatement, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listAuraSessionStatementRecords);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.listAuraSessionStatementRecords, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listAuraSqlSessions);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.listAuraSqlSessions, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listAuraStatementRecords);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.listAuraStatementRecords, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showAuraSqlSession);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showAuraSqlSession, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showAuraSqlStatementResult);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showAuraSqlStatementResult, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showAuraStatementOperatorMetrics);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showAuraStatementOperatorMetrics, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showAuraStatementQueryMetrics);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showAuraStatementQueryMetrics, hcClient);
    }

    /**
     * 查询Flink作业自动调优历史
     *
     * 查询Flink作业自动调优历史记录，包含每次扩缩容操作的详细信息。此接口为同步接口，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkJobAutoscalingHistoriesRequest 请求对象
     * @return ListFlinkJobAutoscalingHistoriesResponse
     */
    public ListFlinkJobAutoscalingHistoriesResponse listFlinkJobAutoscalingHistories(
        ListFlinkJobAutoscalingHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listFlinkJobAutoscalingHistories);
    }

    /**
     * 查询Flink作业自动调优历史
     *
     * 查询Flink作业自动调优历史记录，包含每次扩缩容操作的详细信息。此接口为同步接口，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkJobAutoscalingHistoriesRequest 请求对象
     * @return SyncInvoker<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse>
     */
    public SyncInvoker<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse> listFlinkJobAutoscalingHistoriesInvoker(
        ListFlinkJobAutoscalingHistoriesRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.listFlinkJobAutoscalingHistories, hcClient);
    }

    /**
     * 查询Flink作业自动调优配置
     *
     * 查询Flink作业当前的自动调优配置。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkJobAutoscalingPolicyRequest 请求对象
     * @return ShowFlinkJobAutoscalingPolicyResponse
     */
    public ShowFlinkJobAutoscalingPolicyResponse showFlinkJobAutoscalingPolicy(
        ShowFlinkJobAutoscalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showFlinkJobAutoscalingPolicy);
    }

    /**
     * 查询Flink作业自动调优配置
     *
     * 查询Flink作业当前的自动调优配置。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkJobAutoscalingPolicyRequest 请求对象
     * @return SyncInvoker<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse>
     */
    public SyncInvoker<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse> showFlinkJobAutoscalingPolicyInvoker(
        ShowFlinkJobAutoscalingPolicyRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.showFlinkJobAutoscalingPolicy, hcClient);
    }

    /**
     * 热更新Flink作业自动调优配置
     *
     * 热更新Flink作业自动调优配置。此接口为异步接口，作业运行中时配置将自动应用，无需重启作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlinkJobAutoscalingPolicyRequest 请求对象
     * @return UpdateFlinkJobAutoscalingPolicyResponse
     */
    public UpdateFlinkJobAutoscalingPolicyResponse updateFlinkJobAutoscalingPolicy(
        UpdateFlinkJobAutoscalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.updateFlinkJobAutoscalingPolicy);
    }

    /**
     * 热更新Flink作业自动调优配置
     *
     * 热更新Flink作业自动调优配置。此接口为异步接口，作业运行中时配置将自动应用，无需重启作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlinkJobAutoscalingPolicyRequest 请求对象
     * @return SyncInvoker<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse>
     */
    public SyncInvoker<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse> updateFlinkJobAutoscalingPolicyInvoker(
        UpdateFlinkJobAutoscalingPolicyRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.updateFlinkJobAutoscalingPolicy, hcClient);
    }

    /**
     * 取消Flink作业执行
     *
     * 取消Flink作业。此接口为异步接口，响应仅表示取消请求已接收，作业实际停止状态可通过[查询Flink作业状态](ShowFlinkJobState.xml)接口查询。
     * 支持多种停止策略：
     * - NONE：立即停止不保存状态。
     * - STOP_WITH_SAVEPOINT：停止前创建快照。
     * - STOP_WITH_DRAIN：Drain模式停止，触发窗口计算后再创建快照停止。
     * - FORCE_CANCEL：强制取消，仅当作业已处于CANCELLING状态时可再次触发取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelFlinkJobRequest 请求对象
     * @return CancelFlinkJobResponse
     */
    public CancelFlinkJobResponse cancelFlinkJob(CancelFlinkJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.cancelFlinkJob);
    }

    /**
     * 取消Flink作业执行
     *
     * 取消Flink作业。此接口为异步接口，响应仅表示取消请求已接收，作业实际停止状态可通过[查询Flink作业状态](ShowFlinkJobState.xml)接口查询。
     * 支持多种停止策略：
     * - NONE：立即停止不保存状态。
     * - STOP_WITH_SAVEPOINT：停止前创建快照。
     * - STOP_WITH_DRAIN：Drain模式停止，触发窗口计算后再创建快照停止。
     * - FORCE_CANCEL：强制取消，仅当作业已处于CANCELLING状态时可再次触发取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelFlinkJobRequest 请求对象
     * @return SyncInvoker<CancelFlinkJobRequest, CancelFlinkJobResponse>
     */
    public SyncInvoker<CancelFlinkJobRequest, CancelFlinkJobResponse> cancelFlinkJobInvoker(
        CancelFlinkJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.cancelFlinkJob, hcClient);
    }

    /**
     * 查询Flink作业事件详情列表
     *
     * 查询Flink作业的运行事件列表。此接口为同步接口，响应中包含作业运行期间产生的事件详情，可用于问题定位和运行状态追踪。
     * 可通过[查看Flink作业详情](ShowFlinkJob.xml)接口获取作业完整信息，或通过[查询Flink作业状态](ShowFlinkJobState.xml)接口获取作业当前运行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkJobEventsRequest 请求对象
     * @return ListFlinkJobEventsResponse
     */
    public ListFlinkJobEventsResponse listFlinkJobEvents(ListFlinkJobEventsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listFlinkJobEvents);
    }

    /**
     * 查询Flink作业事件详情列表
     *
     * 查询Flink作业的运行事件列表。此接口为同步接口，响应中包含作业运行期间产生的事件详情，可用于问题定位和运行状态追踪。
     * 可通过[查看Flink作业详情](ShowFlinkJob.xml)接口获取作业完整信息，或通过[查询Flink作业状态](ShowFlinkJobState.xml)接口获取作业当前运行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkJobEventsRequest 请求对象
     * @return SyncInvoker<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse>
     */
    public SyncInvoker<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse> listFlinkJobEventsInvoker(
        ListFlinkJobEventsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.listFlinkJobEvents, hcClient);
    }

    /**
     * 查询Flink作业列表
     *
     * 查询工作空间下Flink作业列表。此接口为同步接口，响应中包含作业的概要信息，支持分页查询和多条件筛选。
     * 可通过[查看Flink作业详情](ShowFlinkJob.xml)接口获取指定作业的完整信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkJobsRequest 请求对象
     * @return ListFlinkJobsResponse
     */
    public ListFlinkJobsResponse listFlinkJobs(ListFlinkJobsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listFlinkJobs);
    }

    /**
     * 查询Flink作业列表
     *
     * 查询工作空间下Flink作业列表。此接口为同步接口，响应中包含作业的概要信息，支持分页查询和多条件筛选。
     * 可通过[查看Flink作业详情](ShowFlinkJob.xml)接口获取指定作业的完整信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkJobsRequest 请求对象
     * @return SyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse>
     */
    public SyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobsInvoker(ListFlinkJobsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.listFlinkJobs, hcClient);
    }

    /**
     * 创建Flink作业
     *
     * 创建并启动Flink作业实例。此接口为异步接口，响应仅表示作业创建请求已接收，作业实际运行状态可通过[查询Flink作业状态](ShowFlinkJobState.xml)接口查询。
     * 支持多种作业类型：
     * - FLINK_SQL_JOB：Flink SQL作业，通过SQL脚本定义数据处理逻辑。
     * - FLINK_JAR_JOB：Flink JAR作业，通过自定义JAR包定义数据处理逻辑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFlinkJobRequest 请求对象
     * @return RunFlinkJobResponse
     */
    public RunFlinkJobResponse runFlinkJob(RunFlinkJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.runFlinkJob);
    }

    /**
     * 创建Flink作业
     *
     * 创建并启动Flink作业实例。此接口为异步接口，响应仅表示作业创建请求已接收，作业实际运行状态可通过[查询Flink作业状态](ShowFlinkJobState.xml)接口查询。
     * 支持多种作业类型：
     * - FLINK_SQL_JOB：Flink SQL作业，通过SQL脚本定义数据处理逻辑。
     * - FLINK_JAR_JOB：Flink JAR作业，通过自定义JAR包定义数据处理逻辑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFlinkJobRequest 请求对象
     * @return SyncInvoker<RunFlinkJobRequest, RunFlinkJobResponse>
     */
    public SyncInvoker<RunFlinkJobRequest, RunFlinkJobResponse> runFlinkJobInvoker(RunFlinkJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.runFlinkJob, hcClient);
    }

    /**
     * 查看Flink作业详情
     *
     * 获取Flink作业实例的详细信息。此接口为同步接口，响应中包含作业的完整配置和运行状态信息。
     * 可通过[查询Flink作业事件详情列表](ListFlinkJobEvents.xml)接口获取作业运行事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkJobRequest 请求对象
     * @return ShowFlinkJobResponse
     */
    public ShowFlinkJobResponse showFlinkJob(ShowFlinkJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showFlinkJob);
    }

    /**
     * 查看Flink作业详情
     *
     * 获取Flink作业实例的详细信息。此接口为同步接口，响应中包含作业的完整配置和运行状态信息。
     * 可通过[查询Flink作业事件详情列表](ListFlinkJobEvents.xml)接口获取作业运行事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkJobRequest 请求对象
     * @return SyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse>
     */
    public SyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJobInvoker(ShowFlinkJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.showFlinkJob, hcClient);
    }

    /**
     * 查询Flink作业状态
     *
     * 查询Flink作业的运行状态。此接口为同步接口，响应中包含作业当前状态。
     * 可通过[查看Flink作业详情](ShowFlinkJob.xml)接口获取作业完整信息，或通过[查询Flink作业事件详情列表](ListFlinkJobEvents.xml)接口获取作业运行事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkJobStateRequest 请求对象
     * @return ShowFlinkJobStateResponse
     */
    public ShowFlinkJobStateResponse showFlinkJobState(ShowFlinkJobStateRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showFlinkJobState);
    }

    /**
     * 查询Flink作业状态
     *
     * 查询Flink作业的运行状态。此接口为同步接口，响应中包含作业当前状态。
     * 可通过[查看Flink作业详情](ShowFlinkJob.xml)接口获取作业完整信息，或通过[查询Flink作业事件详情列表](ListFlinkJobEvents.xml)接口获取作业运行事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkJobStateRequest 请求对象
     * @return SyncInvoker<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse>
     */
    public SyncInvoker<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse> showFlinkJobStateInvoker(
        ShowFlinkJobStateRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.showFlinkJobState, hcClient);
    }

    /**
     * 创建Flink作业Savepoint
     *
     * 为运行中的Flink作业触发Savepoint，用于保存作业当前状态。此接口为异步接口，响应仅表示快照创建请求已接收，快照实际生成状态可通过[查询Flink作业Savepoint列表](ListFlinkSavepoint.xml)接口查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlinkSavepointRequest 请求对象
     * @return CreateFlinkSavepointResponse
     */
    public CreateFlinkSavepointResponse createFlinkSavepoint(CreateFlinkSavepointRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.createFlinkSavepoint);
    }

    /**
     * 创建Flink作业Savepoint
     *
     * 为运行中的Flink作业触发Savepoint，用于保存作业当前状态。此接口为异步接口，响应仅表示快照创建请求已接收，快照实际生成状态可通过[查询Flink作业Savepoint列表](ListFlinkSavepoint.xml)接口查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlinkSavepointRequest 请求对象
     * @return SyncInvoker<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse>
     */
    public SyncInvoker<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse> createFlinkSavepointInvoker(
        CreateFlinkSavepointRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.createFlinkSavepoint, hcClient);
    }

    /**
     * 删除Flink作业Savepoint
     *
     * 删除指定Savepoint的元数据记录，不影响OBS中的实际Savepoint数据。该接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlinkSavepointRequest 请求对象
     * @return DeleteFlinkSavepointResponse
     */
    public DeleteFlinkSavepointResponse deleteFlinkSavepoint(DeleteFlinkSavepointRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.deleteFlinkSavepoint);
    }

    /**
     * 删除Flink作业Savepoint
     *
     * 删除指定Savepoint的元数据记录，不影响OBS中的实际Savepoint数据。该接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlinkSavepointRequest 请求对象
     * @return SyncInvoker<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse>
     */
    public SyncInvoker<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse> deleteFlinkSavepointInvoker(
        DeleteFlinkSavepointRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.deleteFlinkSavepoint, hcClient);
    }

    /**
     * 查询Flink作业Savepoint列表
     *
     * 查询指定Flink作业的Savepoint记录，返回分页列表。此接口为同步接口，响应中包含Savepoint的详细信息。
     * 可通过[查询Flink作业Savepoint详情](ShowFlinkSavepoint.xml)接口获取指定Savepoint的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkSavepointRequest 请求对象
     * @return ListFlinkSavepointResponse
     */
    public ListFlinkSavepointResponse listFlinkSavepoint(ListFlinkSavepointRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listFlinkSavepoint);
    }

    /**
     * 查询Flink作业Savepoint列表
     *
     * 查询指定Flink作业的Savepoint记录，返回分页列表。此接口为同步接口，响应中包含Savepoint的详细信息。
     * 可通过[查询Flink作业Savepoint详情](ShowFlinkSavepoint.xml)接口获取指定Savepoint的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkSavepointRequest 请求对象
     * @return SyncInvoker<ListFlinkSavepointRequest, ListFlinkSavepointResponse>
     */
    public SyncInvoker<ListFlinkSavepointRequest, ListFlinkSavepointResponse> listFlinkSavepointInvoker(
        ListFlinkSavepointRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.listFlinkSavepoint, hcClient);
    }

    /**
     * 查询Flink作业Savepoint详情
     *
     * 获取指定Savepoint的详细信息。此接口为同步接口，响应中包含Savepoint的完整状态和配置信息。
     * 可通过[查询Flink作业Savepoint列表](ListFlinkSavepoint.xml)接口获取Savepoint列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkSavepointRequest 请求对象
     * @return ShowFlinkSavepointResponse
     */
    public ShowFlinkSavepointResponse showFlinkSavepoint(ShowFlinkSavepointRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showFlinkSavepoint);
    }

    /**
     * 查询Flink作业Savepoint详情
     *
     * 获取指定Savepoint的详细信息。此接口为同步接口，响应中包含Savepoint的完整状态和配置信息。
     * 可通过[查询Flink作业Savepoint列表](ListFlinkSavepoint.xml)接口获取Savepoint列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkSavepointRequest 请求对象
     * @return SyncInvoker<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse>
     */
    public SyncInvoker<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse> showFlinkSavepointInvoker(
        ShowFlinkSavepointRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.showFlinkSavepoint, hcClient);
    }

    /**
     * 创建Ray联邦端点
     *
     * 创建Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationRequest 请求对象
     * @return CreateFederationResponse
     */
    public CreateFederationResponse createFederation(CreateFederationRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.createFederation);
    }

    /**
     * 创建Ray联邦端点
     *
     * 创建Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationRequest 请求对象
     * @return SyncInvoker<CreateFederationRequest, CreateFederationResponse>
     */
    public SyncInvoker<CreateFederationRequest, CreateFederationResponse> createFederationInvoker(
        CreateFederationRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.createFederation, hcClient);
    }

    /**
     * 删除Ray联邦端点
     *
     * 删除Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFederationRequest 请求对象
     * @return DeleteFederationResponse
     */
    public DeleteFederationResponse deleteFederation(DeleteFederationRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.deleteFederation);
    }

    /**
     * 删除Ray联邦端点
     *
     * 删除Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFederationRequest 请求对象
     * @return SyncInvoker<DeleteFederationRequest, DeleteFederationResponse>
     */
    public SyncInvoker<DeleteFederationRequest, DeleteFederationResponse> deleteFederationInvoker(
        DeleteFederationRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.deleteFederation, hcClient);
    }

    /**
     * 查询Ray联邦端点列表
     *
     * 查询工作空间下的Ray联邦端点列表。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFederationsRequest 请求对象
     * @return ListFederationsResponse
     */
    public ListFederationsResponse listFederations(ListFederationsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listFederations);
    }

    /**
     * 查询Ray联邦端点列表
     *
     * 查询工作空间下的Ray联邦端点列表。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFederationsRequest 请求对象
     * @return SyncInvoker<ListFederationsRequest, ListFederationsResponse>
     */
    public SyncInvoker<ListFederationsRequest, ListFederationsResponse> listFederationsInvoker(
        ListFederationsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.listFederations, hcClient);
    }

    /**
     * 查询Ray联邦端点详情
     *
     * 查询Ray联邦端点详情。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFederationRequest 请求对象
     * @return ShowFederationResponse
     */
    public ShowFederationResponse showFederation(ShowFederationRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showFederation);
    }

    /**
     * 查询Ray联邦端点详情
     *
     * 查询Ray联邦端点详情。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFederationRequest 请求对象
     * @return SyncInvoker<ShowFederationRequest, ShowFederationResponse>
     */
    public SyncInvoker<ShowFederationRequest, ShowFederationResponse> showFederationInvoker(
        ShowFederationRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.showFederation, hcClient);
    }

    /**
     * 更新Ray联邦端点
     *
     * 更新Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFederationRequest 请求对象
     * @return UpdateFederationResponse
     */
    public UpdateFederationResponse updateFederation(UpdateFederationRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.updateFederation);
    }

    /**
     * 更新Ray联邦端点
     *
     * 更新Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFederationRequest 请求对象
     * @return SyncInvoker<UpdateFederationRequest, UpdateFederationResponse>
     */
    public SyncInvoker<UpdateFederationRequest, UpdateFederationResponse> updateFederationInvoker(
        UpdateFederationRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.updateFederation, hcClient);
    }

    /**
     * 取消作业运行
     *
     * 取消作业运行。主要使用于取消运行Ray Job场景。本接口为异步接口，当前取消作业运行请求下发成功后会返回job_id，此时取消作业运行并没有立即完成，需要通过调用[查看Ray作业详情](ShowRayJob.xml)查询Job状态，当Job状态为CANCELED时代表取消作业运行成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRayJobRequest 请求对象
     * @return CancelRayJobResponse
     */
    public CancelRayJobResponse cancelRayJob(CancelRayJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.cancelRayJob);
    }

    /**
     * 取消作业运行
     *
     * 取消作业运行。主要使用于取消运行Ray Job场景。本接口为异步接口，当前取消作业运行请求下发成功后会返回job_id，此时取消作业运行并没有立即完成，需要通过调用[查看Ray作业详情](ShowRayJob.xml)查询Job状态，当Job状态为CANCELED时代表取消作业运行成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRayJobRequest 请求对象
     * @return SyncInvoker<CancelRayJobRequest, CancelRayJobResponse>
     */
    public SyncInvoker<CancelRayJobRequest, CancelRayJobResponse> cancelRayJobInvoker(CancelRayJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.cancelRayJob, hcClient);
    }

    /**
     * 查询Ray作业列表
     *
     * 列举所有Ray作业。列举工作空间下的作业，分页返回。本接口为同步接口，当前列举所有Ray作业请求下发后会返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRayJobsRequest 请求对象
     * @return ListRayJobsResponse
     */
    public ListRayJobsResponse listRayJobs(ListRayJobsRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listRayJobs);
    }

    /**
     * 查询Ray作业列表
     *
     * 列举所有Ray作业。列举工作空间下的作业，分页返回。本接口为同步接口，当前列举所有Ray作业请求下发后会返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRayJobsRequest 请求对象
     * @return SyncInvoker<ListRayJobsRequest, ListRayJobsResponse>
     */
    public SyncInvoker<ListRayJobsRequest, ListRayJobsResponse> listRayJobsInvoker(ListRayJobsRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.listRayJobs, hcClient);
    }

    /**
     * 运行作业
     *
     * 运行Ray作业。本接口为异步接口，当前运行作业请求下发成功后会返回job_id，此时运行作业并没有立即完成，需要通过调用[查看Ray作业详情](ShowRayJob.xml)查询Job状态，当Job状态为SUCCEEDED时代表运行作业成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRayJobRequest 请求对象
     * @return RunRayJobResponse
     */
    public RunRayJobResponse runRayJob(RunRayJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.runRayJob);
    }

    /**
     * 运行作业
     *
     * 运行Ray作业。本接口为异步接口，当前运行作业请求下发成功后会返回job_id，此时运行作业并没有立即完成，需要通过调用[查看Ray作业详情](ShowRayJob.xml)查询Job状态，当Job状态为SUCCEEDED时代表运行作业成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRayJobRequest 请求对象
     * @return SyncInvoker<RunRayJobRequest, RunRayJobResponse>
     */
    public SyncInvoker<RunRayJobRequest, RunRayJobResponse> runRayJobInvoker(RunRayJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.runRayJob, hcClient);
    }

    /**
     * 查看Ray作业详情
     *
     * 查看Ray作业详情。本接口为同步接口，当前查看Ray作业详情请求下发成功后会返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRayJobRequest 请求对象
     * @return ShowRayJobResponse
     */
    public ShowRayJobResponse showRayJob(ShowRayJobRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showRayJob);
    }

    /**
     * 查看Ray作业详情
     *
     * 查看Ray作业详情。本接口为同步接口，当前查看Ray作业详情请求下发成功后会返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRayJobRequest 请求对象
     * @return SyncInvoker<ShowRayJobRequest, ShowRayJobResponse>
     */
    public SyncInvoker<ShowRayJobRequest, ShowRayJobResponse> showRayJobInvoker(ShowRayJobRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.showRayJob, hcClient);
    }

    /**
     * 关闭交互式会话
     *
     * 关闭一个已存在的交互式会话，将会话状态设置为成功。本接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseRaySessionRequest 请求对象
     * @return CloseRaySessionResponse
     */
    public CloseRaySessionResponse closeRaySession(CloseRaySessionRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.closeRaySession);
    }

    /**
     * 关闭交互式会话
     *
     * 关闭一个已存在的交互式会话，将会话状态设置为成功。本接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseRaySessionRequest 请求对象
     * @return SyncInvoker<CloseRaySessionRequest, CloseRaySessionResponse>
     */
    public SyncInvoker<CloseRaySessionRequest, CloseRaySessionResponse> closeRaySessionInvoker(
        CloseRaySessionRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.closeRaySession, hcClient);
    }

    /**
     * 创建交互式会话
     *
     * 创建一个交互式会话。本接口为同步接口，用于Notebook等交互式工具连接Ray集群。联邦用户认证场景下，会返回含联邦用户身份对应的凭据名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRaySessionRequest 请求对象
     * @return CreateRaySessionResponse
     */
    public CreateRaySessionResponse createRaySession(CreateRaySessionRequest request) {
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.createRaySession);
    }

    /**
     * 创建交互式会话
     *
     * 创建一个交互式会话。本接口为同步接口，用于Notebook等交互式工具连接Ray集群。联邦用户认证场景下，会返回含联邦用户身份对应的凭据名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRaySessionRequest 请求对象
     * @return SyncInvoker<CreateRaySessionRequest, CreateRaySessionResponse>
     */
    public SyncInvoker<CreateRaySessionRequest, CreateRaySessionResponse> createRaySessionInvoker(
        CreateRaySessionRequest request) {
        return new SyncInvoker<>(request, AIDataLakeMeta.createRaySession, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.cancelSparkJob);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.cancelSparkJob, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listSparkJobs);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.listSparkJobs, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.runSparkJob);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.runSparkJob, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showSparkJob);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showSparkJob, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showSparkJobState);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showSparkJobState, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showSparkOperatorState);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showSparkOperatorState, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.cancelSparkSql);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.cancelSparkSql, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.listSparkSqls);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.listSparkSqls, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.previewSparkSqlResult);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.previewSparkSqlResult, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.restartSparkSqlCluster);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.restartSparkSqlCluster, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.runSparkSql);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.runSparkSql, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showSparkSql);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showSparkSql, hcClient);
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
        return hcClient.syncInvokeHttp(request, AIDataLakeMeta.showSparkSqlState);
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
        return new SyncInvoker<>(request, AIDataLakeMeta.showSparkSqlState, hcClient);
    }

}
