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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AIDataLakeAsyncClient {

    protected HcClient hcClient;

    public AIDataLakeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AIDataLakeAsyncClient> newBuilder() {
        ClientBuilder<AIDataLakeAsyncClient> clientBuilder = new ClientBuilder<>(AIDataLakeAsyncClient::new);
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
     * @return CompletableFuture<CancelAuraDataframeJobResponse>
     */
    public CompletableFuture<CancelAuraDataframeJobResponse> cancelAuraDataframeJobAsync(
        CancelAuraDataframeJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.cancelAuraDataframeJob);
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
     * @return AsyncInvoker<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse>
     */
    public AsyncInvoker<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse> cancelAuraDataframeJobAsyncInvoker(
        CancelAuraDataframeJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.cancelAuraDataframeJob, hcClient);
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
     * @return CompletableFuture<CreateAuraDataframeJobResponse>
     */
    public CompletableFuture<CreateAuraDataframeJobResponse> createAuraDataframeJobAsync(
        CreateAuraDataframeJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.createAuraDataframeJob);
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
     * @return AsyncInvoker<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse>
     */
    public AsyncInvoker<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse> createAuraDataframeJobAsyncInvoker(
        CreateAuraDataframeJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.createAuraDataframeJob, hcClient);
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
     * @return CompletableFuture<ListAuraDataframeJobResponse>
     */
    public CompletableFuture<ListAuraDataframeJobResponse> listAuraDataframeJobAsync(
        ListAuraDataframeJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listAuraDataframeJob);
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
     * @return AsyncInvoker<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse>
     */
    public AsyncInvoker<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse> listAuraDataframeJobAsyncInvoker(
        ListAuraDataframeJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listAuraDataframeJob, hcClient);
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
     * @return CompletableFuture<ShowAuraDataframeJobResponse>
     */
    public CompletableFuture<ShowAuraDataframeJobResponse> showAuraDataframeJobAsync(
        ShowAuraDataframeJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showAuraDataframeJob);
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
     * @return AsyncInvoker<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse>
     */
    public AsyncInvoker<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse> showAuraDataframeJobAsyncInvoker(
        ShowAuraDataframeJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showAuraDataframeJob, hcClient);
    }

    /**
     * 取消SQL执行
     *
     * 取消SQL语句执行。 用户可通过该接口取消SQL语句执行，输入为SQL Session id、statement id，返回操作结果。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuraSqlStatementRequest 请求对象
     * @return CompletableFuture<CancelAuraSqlStatementResponse>
     */
    public CompletableFuture<CancelAuraSqlStatementResponse> cancelAuraSqlStatementAsync(
        CancelAuraSqlStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.cancelAuraSqlStatement);
    }

    /**
     * 取消SQL执行
     *
     * 取消SQL语句执行。 用户可通过该接口取消SQL语句执行，输入为SQL Session id、statement id，返回操作结果。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuraSqlStatementRequest 请求对象
     * @return AsyncInvoker<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse>
     */
    public AsyncInvoker<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse> cancelAuraSqlStatementAsyncInvoker(
        CancelAuraSqlStatementRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.cancelAuraSqlStatement, hcClient);
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
     * @return CompletableFuture<CloseAuraSqlSessionResponse>
     */
    public CompletableFuture<CloseAuraSqlSessionResponse> closeAuraSqlSessionAsync(CloseAuraSqlSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.closeAuraSqlSession);
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
     * @return AsyncInvoker<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse>
     */
    public AsyncInvoker<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse> closeAuraSqlSessionAsyncInvoker(
        CloseAuraSqlSessionRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.closeAuraSqlSession, hcClient);
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
     * @return CompletableFuture<CreateAuraSqlSessionResponse>
     */
    public CompletableFuture<CreateAuraSqlSessionResponse> createAuraSqlSessionAsync(
        CreateAuraSqlSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.createAuraSqlSession);
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
     * @return AsyncInvoker<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse>
     */
    public AsyncInvoker<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse> createAuraSqlSessionAsyncInvoker(
        CreateAuraSqlSessionRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.createAuraSqlSession, hcClient);
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
     * @return CompletableFuture<ExecuteAuraSqlStatementResponse>
     */
    public CompletableFuture<ExecuteAuraSqlStatementResponse> executeAuraSqlStatementAsync(
        ExecuteAuraSqlStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.executeAuraSqlStatement);
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
     * @return AsyncInvoker<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse>
     */
    public AsyncInvoker<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse> executeAuraSqlStatementAsyncInvoker(
        ExecuteAuraSqlStatementRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.executeAuraSqlStatement, hcClient);
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
     * @return CompletableFuture<ListAuraSessionStatementRecordsResponse>
     */
    public CompletableFuture<ListAuraSessionStatementRecordsResponse> listAuraSessionStatementRecordsAsync(
        ListAuraSessionStatementRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listAuraSessionStatementRecords);
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
     * @return AsyncInvoker<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse>
     */
    public AsyncInvoker<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse> listAuraSessionStatementRecordsAsyncInvoker(
        ListAuraSessionStatementRecordsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listAuraSessionStatementRecords, hcClient);
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
     * @return CompletableFuture<ListAuraSqlSessionsResponse>
     */
    public CompletableFuture<ListAuraSqlSessionsResponse> listAuraSqlSessionsAsync(ListAuraSqlSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listAuraSqlSessions);
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
     * @return AsyncInvoker<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse>
     */
    public AsyncInvoker<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse> listAuraSqlSessionsAsyncInvoker(
        ListAuraSqlSessionsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listAuraSqlSessions, hcClient);
    }

    /**
     * 查看SQL执行记录
     *
     * 查询SQL执行记录。 查询指定Session下的SQL执行记录。 输入workspace_id，session_id，statement_id（可选），status（可选），分页查询参数limit和marker；输出此会话下SQL执行记录。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraStatementRecordsRequest 请求对象
     * @return CompletableFuture<ListAuraStatementRecordsResponse>
     */
    public CompletableFuture<ListAuraStatementRecordsResponse> listAuraStatementRecordsAsync(
        ListAuraStatementRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listAuraStatementRecords);
    }

    /**
     * 查看SQL执行记录
     *
     * 查询SQL执行记录。 查询指定Session下的SQL执行记录。 输入workspace_id，session_id，statement_id（可选），status（可选），分页查询参数limit和marker；输出此会话下SQL执行记录。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuraStatementRecordsRequest 请求对象
     * @return AsyncInvoker<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse>
     */
    public AsyncInvoker<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse> listAuraStatementRecordsAsyncInvoker(
        ListAuraStatementRecordsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listAuraStatementRecords, hcClient);
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
     * @return CompletableFuture<ShowAuraSqlSessionResponse>
     */
    public CompletableFuture<ShowAuraSqlSessionResponse> showAuraSqlSessionAsync(ShowAuraSqlSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showAuraSqlSession);
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
     * @return AsyncInvoker<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse>
     */
    public AsyncInvoker<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse> showAuraSqlSessionAsyncInvoker(
        ShowAuraSqlSessionRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showAuraSqlSession, hcClient);
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
     * @return CompletableFuture<ShowAuraSqlStatementResultResponse>
     */
    public CompletableFuture<ShowAuraSqlStatementResultResponse> showAuraSqlStatementResultAsync(
        ShowAuraSqlStatementResultRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showAuraSqlStatementResult);
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
     * @return AsyncInvoker<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse>
     */
    public AsyncInvoker<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse> showAuraSqlStatementResultAsyncInvoker(
        ShowAuraSqlStatementResultRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showAuraSqlStatementResult, hcClient);
    }

    /**
     * 查看SQL执行算子监控记录
     *
     * 查看SQL执行算子监控记录。 用户可通过该接口查看SQL执行算子监控记录，输入为SQL Session id、statement id，返回操作结果。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraStatementOperatorMetricsRequest 请求对象
     * @return CompletableFuture<ShowAuraStatementOperatorMetricsResponse>
     */
    public CompletableFuture<ShowAuraStatementOperatorMetricsResponse> showAuraStatementOperatorMetricsAsync(
        ShowAuraStatementOperatorMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showAuraStatementOperatorMetrics);
    }

    /**
     * 查看SQL执行算子监控记录
     *
     * 查看SQL执行算子监控记录。 用户可通过该接口查看SQL执行算子监控记录，输入为SQL Session id、statement id，返回操作结果。 此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuraStatementOperatorMetricsRequest 请求对象
     * @return AsyncInvoker<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse>
     */
    public AsyncInvoker<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse> showAuraStatementOperatorMetricsAsyncInvoker(
        ShowAuraStatementOperatorMetricsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showAuraStatementOperatorMetrics, hcClient);
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
     * @return CompletableFuture<ShowAuraStatementQueryMetricsResponse>
     */
    public CompletableFuture<ShowAuraStatementQueryMetricsResponse> showAuraStatementQueryMetricsAsync(
        ShowAuraStatementQueryMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showAuraStatementQueryMetrics);
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
     * @return AsyncInvoker<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse>
     */
    public AsyncInvoker<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse> showAuraStatementQueryMetricsAsyncInvoker(
        ShowAuraStatementQueryMetricsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showAuraStatementQueryMetrics, hcClient);
    }

    /**
     * 查询Flink作业自动调优历史
     *
     * 查询Flink作业自动调优历史记录，包含每次扩缩容操作的详细信息。此接口为同步接口，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkJobAutoscalingHistoriesRequest 请求对象
     * @return CompletableFuture<ListFlinkJobAutoscalingHistoriesResponse>
     */
    public CompletableFuture<ListFlinkJobAutoscalingHistoriesResponse> listFlinkJobAutoscalingHistoriesAsync(
        ListFlinkJobAutoscalingHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listFlinkJobAutoscalingHistories);
    }

    /**
     * 查询Flink作业自动调优历史
     *
     * 查询Flink作业自动调优历史记录，包含每次扩缩容操作的详细信息。此接口为同步接口，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlinkJobAutoscalingHistoriesRequest 请求对象
     * @return AsyncInvoker<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse>
     */
    public AsyncInvoker<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse> listFlinkJobAutoscalingHistoriesAsyncInvoker(
        ListFlinkJobAutoscalingHistoriesRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listFlinkJobAutoscalingHistories, hcClient);
    }

    /**
     * 查询Flink作业自动调优配置
     *
     * 查询Flink作业当前的自动调优配置。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkJobAutoscalingPolicyRequest 请求对象
     * @return CompletableFuture<ShowFlinkJobAutoscalingPolicyResponse>
     */
    public CompletableFuture<ShowFlinkJobAutoscalingPolicyResponse> showFlinkJobAutoscalingPolicyAsync(
        ShowFlinkJobAutoscalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showFlinkJobAutoscalingPolicy);
    }

    /**
     * 查询Flink作业自动调优配置
     *
     * 查询Flink作业当前的自动调优配置。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlinkJobAutoscalingPolicyRequest 请求对象
     * @return AsyncInvoker<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse>
     */
    public AsyncInvoker<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse> showFlinkJobAutoscalingPolicyAsyncInvoker(
        ShowFlinkJobAutoscalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showFlinkJobAutoscalingPolicy, hcClient);
    }

    /**
     * 热更新Flink作业自动调优配置
     *
     * 热更新Flink作业自动调优配置。此接口为异步接口，作业运行中时配置将自动应用，无需重启作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlinkJobAutoscalingPolicyRequest 请求对象
     * @return CompletableFuture<UpdateFlinkJobAutoscalingPolicyResponse>
     */
    public CompletableFuture<UpdateFlinkJobAutoscalingPolicyResponse> updateFlinkJobAutoscalingPolicyAsync(
        UpdateFlinkJobAutoscalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.updateFlinkJobAutoscalingPolicy);
    }

    /**
     * 热更新Flink作业自动调优配置
     *
     * 热更新Flink作业自动调优配置。此接口为异步接口，作业运行中时配置将自动应用，无需重启作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlinkJobAutoscalingPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse>
     */
    public AsyncInvoker<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse> updateFlinkJobAutoscalingPolicyAsyncInvoker(
        UpdateFlinkJobAutoscalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.updateFlinkJobAutoscalingPolicy, hcClient);
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
     * @return CompletableFuture<CancelFlinkJobResponse>
     */
    public CompletableFuture<CancelFlinkJobResponse> cancelFlinkJobAsync(CancelFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.cancelFlinkJob);
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
     * @return AsyncInvoker<CancelFlinkJobRequest, CancelFlinkJobResponse>
     */
    public AsyncInvoker<CancelFlinkJobRequest, CancelFlinkJobResponse> cancelFlinkJobAsyncInvoker(
        CancelFlinkJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.cancelFlinkJob, hcClient);
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
     * @return CompletableFuture<ListFlinkJobEventsResponse>
     */
    public CompletableFuture<ListFlinkJobEventsResponse> listFlinkJobEventsAsync(ListFlinkJobEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listFlinkJobEvents);
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
     * @return AsyncInvoker<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse>
     */
    public AsyncInvoker<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse> listFlinkJobEventsAsyncInvoker(
        ListFlinkJobEventsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listFlinkJobEvents, hcClient);
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
     * @return CompletableFuture<ListFlinkJobsResponse>
     */
    public CompletableFuture<ListFlinkJobsResponse> listFlinkJobsAsync(ListFlinkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listFlinkJobs);
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
     * @return AsyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse>
     */
    public AsyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobsAsyncInvoker(
        ListFlinkJobsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listFlinkJobs, hcClient);
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
     * @return CompletableFuture<RunFlinkJobResponse>
     */
    public CompletableFuture<RunFlinkJobResponse> runFlinkJobAsync(RunFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.runFlinkJob);
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
     * @return AsyncInvoker<RunFlinkJobRequest, RunFlinkJobResponse>
     */
    public AsyncInvoker<RunFlinkJobRequest, RunFlinkJobResponse> runFlinkJobAsyncInvoker(RunFlinkJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.runFlinkJob, hcClient);
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
     * @return CompletableFuture<ShowFlinkJobResponse>
     */
    public CompletableFuture<ShowFlinkJobResponse> showFlinkJobAsync(ShowFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showFlinkJob);
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
     * @return AsyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse>
     */
    public AsyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJobAsyncInvoker(
        ShowFlinkJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showFlinkJob, hcClient);
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
     * @return CompletableFuture<ShowFlinkJobStateResponse>
     */
    public CompletableFuture<ShowFlinkJobStateResponse> showFlinkJobStateAsync(ShowFlinkJobStateRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showFlinkJobState);
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
     * @return AsyncInvoker<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse>
     */
    public AsyncInvoker<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse> showFlinkJobStateAsyncInvoker(
        ShowFlinkJobStateRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showFlinkJobState, hcClient);
    }

    /**
     * 创建Flink作业Savepoint
     *
     * 为运行中的Flink作业触发Savepoint，用于保存作业当前状态。此接口为异步接口，响应仅表示快照创建请求已接收，快照实际生成状态可通过[查询Flink作业Savepoint列表](ListFlinkSavepoint.xml)接口查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlinkSavepointRequest 请求对象
     * @return CompletableFuture<CreateFlinkSavepointResponse>
     */
    public CompletableFuture<CreateFlinkSavepointResponse> createFlinkSavepointAsync(
        CreateFlinkSavepointRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.createFlinkSavepoint);
    }

    /**
     * 创建Flink作业Savepoint
     *
     * 为运行中的Flink作业触发Savepoint，用于保存作业当前状态。此接口为异步接口，响应仅表示快照创建请求已接收，快照实际生成状态可通过[查询Flink作业Savepoint列表](ListFlinkSavepoint.xml)接口查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlinkSavepointRequest 请求对象
     * @return AsyncInvoker<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse>
     */
    public AsyncInvoker<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse> createFlinkSavepointAsyncInvoker(
        CreateFlinkSavepointRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.createFlinkSavepoint, hcClient);
    }

    /**
     * 删除Flink作业Savepoint
     *
     * 删除指定Savepoint的元数据记录，不影响OBS中的实际Savepoint数据。该接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlinkSavepointRequest 请求对象
     * @return CompletableFuture<DeleteFlinkSavepointResponse>
     */
    public CompletableFuture<DeleteFlinkSavepointResponse> deleteFlinkSavepointAsync(
        DeleteFlinkSavepointRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.deleteFlinkSavepoint);
    }

    /**
     * 删除Flink作业Savepoint
     *
     * 删除指定Savepoint的元数据记录，不影响OBS中的实际Savepoint数据。该接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlinkSavepointRequest 请求对象
     * @return AsyncInvoker<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse>
     */
    public AsyncInvoker<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse> deleteFlinkSavepointAsyncInvoker(
        DeleteFlinkSavepointRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.deleteFlinkSavepoint, hcClient);
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
     * @return CompletableFuture<ListFlinkSavepointResponse>
     */
    public CompletableFuture<ListFlinkSavepointResponse> listFlinkSavepointAsync(ListFlinkSavepointRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listFlinkSavepoint);
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
     * @return AsyncInvoker<ListFlinkSavepointRequest, ListFlinkSavepointResponse>
     */
    public AsyncInvoker<ListFlinkSavepointRequest, ListFlinkSavepointResponse> listFlinkSavepointAsyncInvoker(
        ListFlinkSavepointRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listFlinkSavepoint, hcClient);
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
     * @return CompletableFuture<ShowFlinkSavepointResponse>
     */
    public CompletableFuture<ShowFlinkSavepointResponse> showFlinkSavepointAsync(ShowFlinkSavepointRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showFlinkSavepoint);
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
     * @return AsyncInvoker<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse>
     */
    public AsyncInvoker<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse> showFlinkSavepointAsyncInvoker(
        ShowFlinkSavepointRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showFlinkSavepoint, hcClient);
    }

    /**
     * 创建Ray联邦端点
     *
     * 创建Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationRequest 请求对象
     * @return CompletableFuture<CreateFederationResponse>
     */
    public CompletableFuture<CreateFederationResponse> createFederationAsync(CreateFederationRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.createFederation);
    }

    /**
     * 创建Ray联邦端点
     *
     * 创建Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationRequest 请求对象
     * @return AsyncInvoker<CreateFederationRequest, CreateFederationResponse>
     */
    public AsyncInvoker<CreateFederationRequest, CreateFederationResponse> createFederationAsyncInvoker(
        CreateFederationRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.createFederation, hcClient);
    }

    /**
     * 删除Ray联邦端点
     *
     * 删除Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFederationRequest 请求对象
     * @return CompletableFuture<DeleteFederationResponse>
     */
    public CompletableFuture<DeleteFederationResponse> deleteFederationAsync(DeleteFederationRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.deleteFederation);
    }

    /**
     * 删除Ray联邦端点
     *
     * 删除Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFederationRequest 请求对象
     * @return AsyncInvoker<DeleteFederationRequest, DeleteFederationResponse>
     */
    public AsyncInvoker<DeleteFederationRequest, DeleteFederationResponse> deleteFederationAsyncInvoker(
        DeleteFederationRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.deleteFederation, hcClient);
    }

    /**
     * 查询Ray联邦端点列表
     *
     * 查询工作空间下的Ray联邦端点列表。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFederationsRequest 请求对象
     * @return CompletableFuture<ListFederationsResponse>
     */
    public CompletableFuture<ListFederationsResponse> listFederationsAsync(ListFederationsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listFederations);
    }

    /**
     * 查询Ray联邦端点列表
     *
     * 查询工作空间下的Ray联邦端点列表。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFederationsRequest 请求对象
     * @return AsyncInvoker<ListFederationsRequest, ListFederationsResponse>
     */
    public AsyncInvoker<ListFederationsRequest, ListFederationsResponse> listFederationsAsyncInvoker(
        ListFederationsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listFederations, hcClient);
    }

    /**
     * 查询Ray联邦端点详情
     *
     * 查询Ray联邦端点详情。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFederationRequest 请求对象
     * @return CompletableFuture<ShowFederationResponse>
     */
    public CompletableFuture<ShowFederationResponse> showFederationAsync(ShowFederationRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showFederation);
    }

    /**
     * 查询Ray联邦端点详情
     *
     * 查询Ray联邦端点详情。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFederationRequest 请求对象
     * @return AsyncInvoker<ShowFederationRequest, ShowFederationResponse>
     */
    public AsyncInvoker<ShowFederationRequest, ShowFederationResponse> showFederationAsyncInvoker(
        ShowFederationRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showFederation, hcClient);
    }

    /**
     * 更新Ray联邦端点
     *
     * 更新Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFederationRequest 请求对象
     * @return CompletableFuture<UpdateFederationResponse>
     */
    public CompletableFuture<UpdateFederationResponse> updateFederationAsync(UpdateFederationRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.updateFederation);
    }

    /**
     * 更新Ray联邦端点
     *
     * 更新Ray联邦端点。此接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFederationRequest 请求对象
     * @return AsyncInvoker<UpdateFederationRequest, UpdateFederationResponse>
     */
    public AsyncInvoker<UpdateFederationRequest, UpdateFederationResponse> updateFederationAsyncInvoker(
        UpdateFederationRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.updateFederation, hcClient);
    }

    /**
     * 取消作业运行
     *
     * 取消作业运行。主要使用于取消运行Ray Job场景。本接口为异步接口，当前取消作业运行请求下发成功后会返回job_id，此时取消作业运行并没有立即完成，需要通过调用[查看Ray作业详情](ShowRayJob.xml)查询Job状态，当Job状态为CANCELED时代表取消作业运行成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRayJobRequest 请求对象
     * @return CompletableFuture<CancelRayJobResponse>
     */
    public CompletableFuture<CancelRayJobResponse> cancelRayJobAsync(CancelRayJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.cancelRayJob);
    }

    /**
     * 取消作业运行
     *
     * 取消作业运行。主要使用于取消运行Ray Job场景。本接口为异步接口，当前取消作业运行请求下发成功后会返回job_id，此时取消作业运行并没有立即完成，需要通过调用[查看Ray作业详情](ShowRayJob.xml)查询Job状态，当Job状态为CANCELED时代表取消作业运行成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRayJobRequest 请求对象
     * @return AsyncInvoker<CancelRayJobRequest, CancelRayJobResponse>
     */
    public AsyncInvoker<CancelRayJobRequest, CancelRayJobResponse> cancelRayJobAsyncInvoker(
        CancelRayJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.cancelRayJob, hcClient);
    }

    /**
     * 查询Ray作业列表
     *
     * 列举所有Ray作业。列举工作空间下的作业，分页返回。本接口为同步接口，当前列举所有Ray作业请求下发后会返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRayJobsRequest 请求对象
     * @return CompletableFuture<ListRayJobsResponse>
     */
    public CompletableFuture<ListRayJobsResponse> listRayJobsAsync(ListRayJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listRayJobs);
    }

    /**
     * 查询Ray作业列表
     *
     * 列举所有Ray作业。列举工作空间下的作业，分页返回。本接口为同步接口，当前列举所有Ray作业请求下发后会返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRayJobsRequest 请求对象
     * @return AsyncInvoker<ListRayJobsRequest, ListRayJobsResponse>
     */
    public AsyncInvoker<ListRayJobsRequest, ListRayJobsResponse> listRayJobsAsyncInvoker(ListRayJobsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listRayJobs, hcClient);
    }

    /**
     * 运行作业
     *
     * 运行Ray作业。本接口为异步接口，当前运行作业请求下发成功后会返回job_id，此时运行作业并没有立即完成，需要通过调用[查看Ray作业详情](ShowRayJob.xml)查询Job状态，当Job状态为SUCCEEDED时代表运行作业成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRayJobRequest 请求对象
     * @return CompletableFuture<RunRayJobResponse>
     */
    public CompletableFuture<RunRayJobResponse> runRayJobAsync(RunRayJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.runRayJob);
    }

    /**
     * 运行作业
     *
     * 运行Ray作业。本接口为异步接口，当前运行作业请求下发成功后会返回job_id，此时运行作业并没有立即完成，需要通过调用[查看Ray作业详情](ShowRayJob.xml)查询Job状态，当Job状态为SUCCEEDED时代表运行作业成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRayJobRequest 请求对象
     * @return AsyncInvoker<RunRayJobRequest, RunRayJobResponse>
     */
    public AsyncInvoker<RunRayJobRequest, RunRayJobResponse> runRayJobAsyncInvoker(RunRayJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.runRayJob, hcClient);
    }

    /**
     * 查看Ray作业详情
     *
     * 查看Ray作业详情。本接口为同步接口，当前查看Ray作业详情请求下发成功后会返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRayJobRequest 请求对象
     * @return CompletableFuture<ShowRayJobResponse>
     */
    public CompletableFuture<ShowRayJobResponse> showRayJobAsync(ShowRayJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showRayJob);
    }

    /**
     * 查看Ray作业详情
     *
     * 查看Ray作业详情。本接口为同步接口，当前查看Ray作业详情请求下发成功后会返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRayJobRequest 请求对象
     * @return AsyncInvoker<ShowRayJobRequest, ShowRayJobResponse>
     */
    public AsyncInvoker<ShowRayJobRequest, ShowRayJobResponse> showRayJobAsyncInvoker(ShowRayJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showRayJob, hcClient);
    }

    /**
     * 关闭交互式会话
     *
     * 关闭一个已存在的交互式会话，将会话状态设置为成功。本接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseRaySessionRequest 请求对象
     * @return CompletableFuture<CloseRaySessionResponse>
     */
    public CompletableFuture<CloseRaySessionResponse> closeRaySessionAsync(CloseRaySessionRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.closeRaySession);
    }

    /**
     * 关闭交互式会话
     *
     * 关闭一个已存在的交互式会话，将会话状态设置为成功。本接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseRaySessionRequest 请求对象
     * @return AsyncInvoker<CloseRaySessionRequest, CloseRaySessionResponse>
     */
    public AsyncInvoker<CloseRaySessionRequest, CloseRaySessionResponse> closeRaySessionAsyncInvoker(
        CloseRaySessionRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.closeRaySession, hcClient);
    }

    /**
     * 创建交互式会话
     *
     * 创建一个交互式会话。本接口为同步接口，用于Notebook等交互式工具连接Ray集群。联邦用户认证场景下，会返回含联邦用户身份对应的凭据名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRaySessionRequest 请求对象
     * @return CompletableFuture<CreateRaySessionResponse>
     */
    public CompletableFuture<CreateRaySessionResponse> createRaySessionAsync(CreateRaySessionRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.createRaySession);
    }

    /**
     * 创建交互式会话
     *
     * 创建一个交互式会话。本接口为同步接口，用于Notebook等交互式工具连接Ray集群。联邦用户认证场景下，会返回含联邦用户身份对应的凭据名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRaySessionRequest 请求对象
     * @return AsyncInvoker<CreateRaySessionRequest, CreateRaySessionResponse>
     */
    public AsyncInvoker<CreateRaySessionRequest, CreateRaySessionResponse> createRaySessionAsyncInvoker(
        CreateRaySessionRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.createRaySession, hcClient);
    }

    /**
     * 取消Spark作业执行
     *
     * 取消正在执行的Spark作业，此接口为同步接口。调用成功后，作业将被终止执行，直接返回取消结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSparkJobRequest 请求对象
     * @return CompletableFuture<CancelSparkJobResponse>
     */
    public CompletableFuture<CancelSparkJobResponse> cancelSparkJobAsync(CancelSparkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.cancelSparkJob);
    }

    /**
     * 取消Spark作业执行
     *
     * 取消正在执行的Spark作业，此接口为同步接口。调用成功后，作业将被终止执行，直接返回取消结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSparkJobRequest 请求对象
     * @return AsyncInvoker<CancelSparkJobRequest, CancelSparkJobResponse>
     */
    public AsyncInvoker<CancelSparkJobRequest, CancelSparkJobResponse> cancelSparkJobAsyncInvoker(
        CancelSparkJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.cancelSparkJob, hcClient);
    }

    /**
     * 查询Spark作业列表
     *
     * 查询工作空间下Spark作业列表，此接口为同步接口。支持按作业ID、作业名称、作业状态、作业类型、创建时间等条件过滤查询，支持分页查询，调用成功后直接返回作业列表数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSparkJobsRequest 请求对象
     * @return CompletableFuture<ListSparkJobsResponse>
     */
    public CompletableFuture<ListSparkJobsResponse> listSparkJobsAsync(ListSparkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listSparkJobs);
    }

    /**
     * 查询Spark作业列表
     *
     * 查询工作空间下Spark作业列表，此接口为同步接口。支持按作业ID、作业名称、作业状态、作业类型、创建时间等条件过滤查询，支持分页查询，调用成功后直接返回作业列表数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSparkJobsRequest 请求对象
     * @return AsyncInvoker<ListSparkJobsRequest, ListSparkJobsResponse>
     */
    public AsyncInvoker<ListSparkJobsRequest, ListSparkJobsResponse> listSparkJobsAsyncInvoker(
        ListSparkJobsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listSparkJobs, hcClient);
    }

    /**
     * 启动Spark作业
     *
     * 启动Spark作业，此接口为异步接口。支持Spark Jar作业、Python作业和SQL Script作业。调用该接口后，作业将提交到队列等待执行，返回作业ID后需通过查询作业状态接口确认作业是否成功启动。查询作业状态请参见[查询Spark作业的状态](ShowSparkJobState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSparkJobRequest 请求对象
     * @return CompletableFuture<RunSparkJobResponse>
     */
    public CompletableFuture<RunSparkJobResponse> runSparkJobAsync(RunSparkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.runSparkJob);
    }

    /**
     * 启动Spark作业
     *
     * 启动Spark作业，此接口为异步接口。支持Spark Jar作业、Python作业和SQL Script作业。调用该接口后，作业将提交到队列等待执行，返回作业ID后需通过查询作业状态接口确认作业是否成功启动。查询作业状态请参见[查询Spark作业的状态](ShowSparkJobState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSparkJobRequest 请求对象
     * @return AsyncInvoker<RunSparkJobRequest, RunSparkJobResponse>
     */
    public AsyncInvoker<RunSparkJobRequest, RunSparkJobResponse> runSparkJobAsyncInvoker(RunSparkJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.runSparkJob, hcClient);
    }

    /**
     * 查看Spark作业详情
     *
     * 查看指定Spark作业的详细信息，此接口为同步接口。包括作业ID、作业名称、作业状态、作业配置、资源配置、镜像配置等完整信息，调用成功后直接返回作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkJobRequest 请求对象
     * @return CompletableFuture<ShowSparkJobResponse>
     */
    public CompletableFuture<ShowSparkJobResponse> showSparkJobAsync(ShowSparkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showSparkJob);
    }

    /**
     * 查看Spark作业详情
     *
     * 查看指定Spark作业的详细信息，此接口为同步接口。包括作业ID、作业名称、作业状态、作业配置、资源配置、镜像配置等完整信息，调用成功后直接返回作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkJobRequest 请求对象
     * @return AsyncInvoker<ShowSparkJobRequest, ShowSparkJobResponse>
     */
    public AsyncInvoker<ShowSparkJobRequest, ShowSparkJobResponse> showSparkJobAsyncInvoker(
        ShowSparkJobRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showSparkJob, hcClient);
    }

    /**
     * 查询Spark作业的状态
     *
     * 查询Spark作业的状态，此接口为同步接口。可通过作业ID查询Spark作业的当前执行状态，包括排队中、运行中、已成功、已失败等状态，调用后立即返回作业当前状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkJobStateRequest 请求对象
     * @return CompletableFuture<ShowSparkJobStateResponse>
     */
    public CompletableFuture<ShowSparkJobStateResponse> showSparkJobStateAsync(ShowSparkJobStateRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showSparkJobState);
    }

    /**
     * 查询Spark作业的状态
     *
     * 查询Spark作业的状态，此接口为同步接口。可通过作业ID查询Spark作业的当前执行状态，包括排队中、运行中、已成功、已失败等状态，调用后立即返回作业当前状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkJobStateRequest 请求对象
     * @return AsyncInvoker<ShowSparkJobStateRequest, ShowSparkJobStateResponse>
     */
    public AsyncInvoker<ShowSparkJobStateRequest, ShowSparkJobStateResponse> showSparkJobStateAsyncInvoker(
        ShowSparkJobStateRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showSparkJobState, hcClient);
    }

    /**
     * 查询Spark异步操作状态
     *
     * 查询Spark异步操作的执行状态，用于获取异步操作（如重启集群等）的当前状态和执行结果。该接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkOperatorStateRequest 请求对象
     * @return CompletableFuture<ShowSparkOperatorStateResponse>
     */
    public CompletableFuture<ShowSparkOperatorStateResponse> showSparkOperatorStateAsync(
        ShowSparkOperatorStateRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showSparkOperatorState);
    }

    /**
     * 查询Spark异步操作状态
     *
     * 查询Spark异步操作的执行状态，用于获取异步操作（如重启集群等）的当前状态和执行结果。该接口为同步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkOperatorStateRequest 请求对象
     * @return AsyncInvoker<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse>
     */
    public AsyncInvoker<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse> showSparkOperatorStateAsyncInvoker(
        ShowSparkOperatorStateRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showSparkOperatorState, hcClient);
    }

    /**
     * 取消SparkSql作业执行
     *
     * 取消正在运行或排队中的SparkSql作业，此接口为同步接口。只能取消处于QUEUED或RUNNING状态的作业，调用成功后直接返回取消结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSparkSqlRequest 请求对象
     * @return CompletableFuture<CancelSparkSqlResponse>
     */
    public CompletableFuture<CancelSparkSqlResponse> cancelSparkSqlAsync(CancelSparkSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.cancelSparkSql);
    }

    /**
     * 取消SparkSql作业执行
     *
     * 取消正在运行或排队中的SparkSql作业，此接口为同步接口。只能取消处于QUEUED或RUNNING状态的作业，调用成功后直接返回取消结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSparkSqlRequest 请求对象
     * @return AsyncInvoker<CancelSparkSqlRequest, CancelSparkSqlResponse>
     */
    public AsyncInvoker<CancelSparkSqlRequest, CancelSparkSqlResponse> cancelSparkSqlAsyncInvoker(
        CancelSparkSqlRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.cancelSparkSql, hcClient);
    }

    /**
     * 查询SparkSql作业列表
     *
     * 查询工作空间下SparkSql作业列表，此接口为同步接口。支持按作业状态、创建时间、SQL片段等条件进行过滤查询，调用成功后直接返回作业列表数据。可通过[查看SparkSql作业详情](ShowSparkSql.xml)接口查看作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSparkSqlsRequest 请求对象
     * @return CompletableFuture<ListSparkSqlsResponse>
     */
    public CompletableFuture<ListSparkSqlsResponse> listSparkSqlsAsync(ListSparkSqlsRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.listSparkSqls);
    }

    /**
     * 查询SparkSql作业列表
     *
     * 查询工作空间下SparkSql作业列表，此接口为同步接口。支持按作业状态、创建时间、SQL片段等条件进行过滤查询，调用成功后直接返回作业列表数据。可通过[查看SparkSql作业详情](ShowSparkSql.xml)接口查看作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSparkSqlsRequest 请求对象
     * @return AsyncInvoker<ListSparkSqlsRequest, ListSparkSqlsResponse>
     */
    public AsyncInvoker<ListSparkSqlsRequest, ListSparkSqlsResponse> listSparkSqlsAsyncInvoker(
        ListSparkSqlsRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.listSparkSqls, hcClient);
    }

    /**
     * 预览SparkSql作业查询结果
     *
     * 预览SparkSql作业的查询结果，此接口为同步接口。仅适用于执行成功的DQL类型作业，可查看作业返回的数据内容，调用成功后直接返回查询结果数据。可通过[查看SparkSql作业详情](ShowSparkSql.xml)接口查看作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PreviewSparkSqlResultRequest 请求对象
     * @return CompletableFuture<PreviewSparkSqlResultResponse>
     */
    public CompletableFuture<PreviewSparkSqlResultResponse> previewSparkSqlResultAsync(
        PreviewSparkSqlResultRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.previewSparkSqlResult);
    }

    /**
     * 预览SparkSql作业查询结果
     *
     * 预览SparkSql作业的查询结果，此接口为同步接口。仅适用于执行成功的DQL类型作业，可查看作业返回的数据内容，调用成功后直接返回查询结果数据。可通过[查看SparkSql作业详情](ShowSparkSql.xml)接口查看作业详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PreviewSparkSqlResultRequest 请求对象
     * @return AsyncInvoker<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse>
     */
    public AsyncInvoker<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse> previewSparkSqlResultAsyncInvoker(
        PreviewSparkSqlResultRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.previewSparkSqlResult, hcClient);
    }

    /**
     * 重启SparkSql集群
     *
     * 重启SparkSql集群，该接口为异步接口，接口调用成功后会返回操作ID（operation_id），您可以通过查询Spark异步操作状态接口查询操作执行结果，详情请参见[查询Spark异步操作状态](ShowSparkOperatorState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartSparkSqlClusterRequest 请求对象
     * @return CompletableFuture<RestartSparkSqlClusterResponse>
     */
    public CompletableFuture<RestartSparkSqlClusterResponse> restartSparkSqlClusterAsync(
        RestartSparkSqlClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.restartSparkSqlCluster);
    }

    /**
     * 重启SparkSql集群
     *
     * 重启SparkSql集群，该接口为异步接口，接口调用成功后会返回操作ID（operation_id），您可以通过查询Spark异步操作状态接口查询操作执行结果，详情请参见[查询Spark异步操作状态](ShowSparkOperatorState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartSparkSqlClusterRequest 请求对象
     * @return AsyncInvoker<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse>
     */
    public AsyncInvoker<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse> restartSparkSqlClusterAsyncInvoker(
        RestartSparkSqlClusterRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.restartSparkSqlCluster, hcClient);
    }

    /**
     * 执行SparkSql作业
     *
     * 执行SparkSql作业，此接口为异步接口。接口调用成功后会返回作业ID（statement_id）,您可以通过查询作业状态接口查询作业执行结果，详情请参见[查询SparkSql作业的状态](ShowSparkSqlState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSparkSqlRequest 请求对象
     * @return CompletableFuture<RunSparkSqlResponse>
     */
    public CompletableFuture<RunSparkSqlResponse> runSparkSqlAsync(RunSparkSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.runSparkSql);
    }

    /**
     * 执行SparkSql作业
     *
     * 执行SparkSql作业，此接口为异步接口。接口调用成功后会返回作业ID（statement_id）,您可以通过查询作业状态接口查询作业执行结果，详情请参见[查询SparkSql作业的状态](ShowSparkSqlState.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSparkSqlRequest 请求对象
     * @return AsyncInvoker<RunSparkSqlRequest, RunSparkSqlResponse>
     */
    public AsyncInvoker<RunSparkSqlRequest, RunSparkSqlResponse> runSparkSqlAsyncInvoker(RunSparkSqlRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.runSparkSql, hcClient);
    }

    /**
     * 查看SparkSql作业详情
     *
     * 查看SparkSql作业的详细信息，此接口为同步接口。包括作业状态、SQL内容、执行参数等，调用成功后直接返回作业详细信息。可通过[执行SparkSql作业](RunSparkSql.xml)接口创建作业，通过[查询SparkSql作业列表](ListSparkSqls.xml)接口查询作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkSqlRequest 请求对象
     * @return CompletableFuture<ShowSparkSqlResponse>
     */
    public CompletableFuture<ShowSparkSqlResponse> showSparkSqlAsync(ShowSparkSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showSparkSql);
    }

    /**
     * 查看SparkSql作业详情
     *
     * 查看SparkSql作业的详细信息，此接口为同步接口。包括作业状态、SQL内容、执行参数等，调用成功后直接返回作业详细信息。可通过[执行SparkSql作业](RunSparkSql.xml)接口创建作业，通过[查询SparkSql作业列表](ListSparkSqls.xml)接口查询作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkSqlRequest 请求对象
     * @return AsyncInvoker<ShowSparkSqlRequest, ShowSparkSqlResponse>
     */
    public AsyncInvoker<ShowSparkSqlRequest, ShowSparkSqlResponse> showSparkSqlAsyncInvoker(
        ShowSparkSqlRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showSparkSql, hcClient);
    }

    /**
     * 查询SparkSql作业的状态
     *
     * 查询SparkSql作业的状态，此接口为同步接口。可通过查询SparkSql作业列表接口获取statement_id，调用成功后直接返回作业当前状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkSqlStateRequest 请求对象
     * @return CompletableFuture<ShowSparkSqlStateResponse>
     */
    public CompletableFuture<ShowSparkSqlStateResponse> showSparkSqlStateAsync(ShowSparkSqlStateRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeMeta.showSparkSqlState);
    }

    /**
     * 查询SparkSql作业的状态
     *
     * 查询SparkSql作业的状态，此接口为同步接口。可通过查询SparkSql作业列表接口获取statement_id，调用成功后直接返回作业当前状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSparkSqlStateRequest 请求对象
     * @return AsyncInvoker<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse>
     */
    public AsyncInvoker<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse> showSparkSqlStateAsyncInvoker(
        ShowSparkSqlStateRequest request) {
        return new AsyncInvoker<>(request, AIDataLakeMeta.showSparkSqlState, hcClient);
    }

}
