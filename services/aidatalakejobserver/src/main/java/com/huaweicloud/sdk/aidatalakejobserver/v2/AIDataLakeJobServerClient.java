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

}
