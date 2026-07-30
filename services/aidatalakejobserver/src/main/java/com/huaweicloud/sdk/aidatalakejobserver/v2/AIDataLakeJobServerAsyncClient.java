package com.huaweicloud.sdk.aidatalakejobserver.v2;

import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelAuraSqlStatementResponse;
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
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlStatementResultRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlStatementResultResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementOperatorMetricsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementOperatorMetricsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementQueryMetricsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementQueryMetricsResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AIDataLakeJobServerAsyncClient {

    protected HcClient hcClient;

    public AIDataLakeJobServerAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AIDataLakeJobServerAsyncClient> newBuilder() {
        ClientBuilder<AIDataLakeJobServerAsyncClient> clientBuilder =
            new ClientBuilder<>(AIDataLakeJobServerAsyncClient::new);
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
     * @return CompletableFuture<CancelAuraSqlStatementResponse>
     */
    public CompletableFuture<CancelAuraSqlStatementResponse> cancelAuraSqlStatementAsync(
        CancelAuraSqlStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.cancelAuraSqlStatement);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.cancelAuraSqlStatement, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.closeAuraSqlSession);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.closeAuraSqlSession, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.createAuraSqlSession);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.createAuraSqlSession, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.executeAuraSqlStatement);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.executeAuraSqlStatement, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.listAuraSessionStatementRecords);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.listAuraSessionStatementRecords, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.listAuraSqlSessions);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.listAuraSqlSessions, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.listAuraStatementRecords);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.listAuraStatementRecords, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.showAuraSqlSession);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.showAuraSqlSession, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.showAuraSqlStatementResult);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.showAuraSqlStatementResult, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.showAuraStatementOperatorMetrics);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.showAuraStatementOperatorMetrics, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AIDataLakeJobServerMeta.showAuraStatementQueryMetrics);
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
        return new AsyncInvoker<>(request, AIDataLakeJobServerMeta.showAuraStatementQueryMetrics, hcClient);
    }

}
