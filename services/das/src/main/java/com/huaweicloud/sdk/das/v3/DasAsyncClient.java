package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.das.v3.model.*;

public class DasAsyncClient {
    protected HcClient hcClient;

    public DasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DasAsyncClient> newBuilder() {
        return new ClientBuilder<>(DasAsyncClient::new);
    }


    /**
     * 查询API版本列表
     * 查询API版本列表
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     * 查询API版本列表
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DasMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定的API版本信息
     * 查询指定的API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     * 查询指定的API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, DasMeta.showApiVersion, hcClient);
    }

    /**
     * 开启/关闭DAS收集全量SQL、慢SQL开关
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。 该功能仅支持付费实例。
     *
     * @param ChangeSqlSwitchRequest 请求对象
     * @return CompletableFuture<ChangeSqlSwitchResponse>
     */
    public CompletableFuture<ChangeSqlSwitchResponse> changeSqlSwitchAsync(ChangeSqlSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeSqlSwitch);
    }

    /**
     * 开启/关闭DAS收集全量SQL、慢SQL开关
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。 该功能仅支持付费实例。
     *
     * @param ChangeSqlSwitchRequest 请求对象
     * @return AsyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>
     */
    public AsyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitchAsyncInvoker(ChangeSqlSwitchRequest request) {
        return new AsyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>(request, DasMeta.changeSqlSwitch, hcClient);
    }

    /**
     * 创建空间分析任务
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     *
     * @param CreateSpaceAnalysisTaskRequest 请求对象
     * @return CompletableFuture<CreateSpaceAnalysisTaskResponse>
     */
    public CompletableFuture<CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskAsync(CreateSpaceAnalysisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createSpaceAnalysisTask);
    }

    /**
     * 创建空间分析任务
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     *
     * @param CreateSpaceAnalysisTaskRequest 请求对象
     * @return AsyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>
     */
    public AsyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskAsyncInvoker(CreateSpaceAnalysisTaskRequest request) {
        return new AsyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>(request, DasMeta.createSpaceAnalysisTask, hcClient);
    }

    /**
     * 删除数据库用户
     * 删除注册的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     * 删除注册的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(DeleteDbUserRequest request) {
        return new AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, DasMeta.deleteDbUser, hcClient);
    }

    /**
     * 查杀会话
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。 目前仅支持MySQL实例。
     *
     * @param DeleteProcessRequest 请求对象
     * @return CompletableFuture<DeleteProcessResponse>
     */
    public CompletableFuture<DeleteProcessResponse> deleteProcessAsync(DeleteProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteProcess);
    }

    /**
     * 查杀会话
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。 目前仅支持MySQL实例。
     *
     * @param DeleteProcessRequest 请求对象
     * @return AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessAsyncInvoker(DeleteProcessRequest request) {
        return new AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 导出慢SQL数据
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。 该功能仅支持付费实例。
     *
     * @param ExportSlowQueryLogsRequest 请求对象
     * @return CompletableFuture<ExportSlowQueryLogsResponse>
     */
    public CompletableFuture<ExportSlowQueryLogsResponse> exportSlowQueryLogsAsync(ExportSlowQueryLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowQueryLogs);
    }

    /**
     * 导出慢SQL数据
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。 该功能仅支持付费实例。
     *
     * @param ExportSlowQueryLogsRequest 请求对象
     * @return AsyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>
     */
    public AsyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogsAsyncInvoker(ExportSlowQueryLogsRequest request) {
        return new AsyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>(request, DasMeta.exportSlowQueryLogs, hcClient);
    }

    /**
     * 全量SQL开关打开后，导出指定时间范围内的全量SQL数据，支持分页滚动获取。
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。 该功能仅支持付费实例。
     *
     * @param ExportSqlStatementsRequest 请求对象
     * @return CompletableFuture<ExportSqlStatementsResponse>
     */
    public CompletableFuture<ExportSqlStatementsResponse> exportSqlStatementsAsync(ExportSqlStatementsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSqlStatements);
    }

    /**
     * 全量SQL开关打开后，导出指定时间范围内的全量SQL数据，支持分页滚动获取。
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。 该功能仅支持付费实例。
     *
     * @param ExportSqlStatementsRequest 请求对象
     * @return AsyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>
     */
    public AsyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatementsAsyncInvoker(ExportSqlStatementsRequest request) {
        return new AsyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>(request, DasMeta.exportSqlStatements, hcClient);
    }

    /**
     * 查询数据库用户列表
     * 查询注册的数据库用户列表。 目前仅支持MySQL实例。
     *
     * @param ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     * 查询注册的数据库用户列表。 目前仅支持MySQL实例。
     *
     * @param ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询InnoDB锁等待列表
     * 查询InnoDB锁等待列表。 目前仅支持MySQL实例。
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return CompletableFuture<ListInnodbLocksResponse>
     */
    public CompletableFuture<ListInnodbLocksResponse> listInnodbLocksAsync(ListInnodbLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInnodbLocks);
    }

    /**
     * 查询InnoDB锁等待列表
     * 查询InnoDB锁等待列表。 目前仅支持MySQL实例。
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksAsyncInvoker(ListInnodbLocksRequest request) {
        return new AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>(request, DasMeta.listInnodbLocks, hcClient);
    }

    /**
     * 查询元数据锁列表
     * 查询元数据锁列表。 目前仅支持MySQL实例。
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return CompletableFuture<ListMetadataLocksResponse>
     */
    public CompletableFuture<ListMetadataLocksResponse> listMetadataLocksAsync(ListMetadataLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listMetadataLocks);
    }

    /**
     * 查询元数据锁列表
     * 查询元数据锁列表。 目前仅支持MySQL实例。
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksAsyncInvoker(ListMetadataLocksRequest request) {
        return new AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>(request, DasMeta.listMetadataLocks, hcClient);
    }

    /**
     * 查询实例会话列表
     * 支持根据数据库、用户查询实例会话列表。 目前仅支持MySQL实例。
     *
     * @param ListProcessesRequest 请求对象
     * @return CompletableFuture<ListProcessesResponse>
     */
    public CompletableFuture<ListProcessesResponse> listProcessesAsync(ListProcessesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listProcesses);
    }

    /**
     * 查询实例会话列表
     * 支持根据数据库、用户查询实例会话列表。 目前仅支持MySQL实例。
     *
     * @param ListProcessesRequest 请求对象
     * @return AsyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public AsyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesAsyncInvoker(ListProcessesRequest request) {
        return new AsyncInvoker<ListProcessesRequest, ListProcessesResponse>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 获取空间分析数据列表
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。支持MySQL和GaussDB(for MySQL)引擎
     *
     * @param ListSpaceAnalysisRequest 请求对象
     * @return CompletableFuture<ListSpaceAnalysisResponse>
     */
    public CompletableFuture<ListSpaceAnalysisResponse> listSpaceAnalysisAsync(ListSpaceAnalysisRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSpaceAnalysis);
    }

    /**
     * 获取空间分析数据列表
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。支持MySQL和GaussDB(for MySQL)引擎
     *
     * @param ListSpaceAnalysisRequest 请求对象
     * @return AsyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>
     */
    public AsyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysisAsyncInvoker(ListSpaceAnalysisRequest request) {
        return new AsyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>(request, DasMeta.listSpaceAnalysis, hcClient);
    }

    /**
     * 注册数据库用户
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库上创建数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param RegisterDbUserRequest 请求对象
     * @return CompletableFuture<RegisterDbUserResponse>
     */
    public CompletableFuture<RegisterDbUserResponse> registerDbUserAsync(RegisterDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.registerDbUser);
    }

    /**
     * 注册数据库用户
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库上创建数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param RegisterDbUserRequest 请求对象
     * @return AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserAsyncInvoker(RegisterDbUserRequest request) {
        return new AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>(request, DasMeta.registerDbUser, hcClient);
    }

    /**
     * 查询数据库用户信息
     * 查询注册的数据库用户信息。 目前仅支持MySQL实例。
     *
     * @param ShowDbUserRequest 请求对象
     * @return CompletableFuture<ShowDbUserResponse>
     */
    public CompletableFuture<ShowDbUserResponse> showDbUserAsync(ShowDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDbUser);
    }

    /**
     * 查询数据库用户信息
     * 查询注册的数据库用户信息。 目前仅支持MySQL实例。
     *
     * @param ShowDbUserRequest 请求对象
     * @return AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserAsyncInvoker(ShowDbUserRequest request) {
        return new AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 查询SQL执行计划
     * 查询SQL执行计划。 目前仅支持MySQL实例。
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return CompletableFuture<ShowSqlExecutionPlanResponse>
     */
    public CompletableFuture<ShowSqlExecutionPlanResponse> showSqlExecutionPlanAsync(ShowSqlExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlExecutionPlan);
    }

    /**
     * 查询SQL执行计划
     * 查询SQL执行计划。 目前仅支持MySQL实例。
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanAsyncInvoker(ShowSqlExecutionPlanRequest request) {
        return new AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>(request, DasMeta.showSqlExecutionPlan, hcClient);
    }

    /**
     * 查询DAS收集全量SQL和慢SQL的开关状态。
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     *
     * @param ShowSqlSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowSqlSwitchStatusResponse>
     */
    public CompletableFuture<ShowSqlSwitchStatusResponse> showSqlSwitchStatusAsync(ShowSqlSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlSwitchStatus);
    }

    /**
     * 查询DAS收集全量SQL和慢SQL的开关状态。
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     *
     * @param ShowSqlSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>
     */
    public AsyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatusAsyncInvoker(ShowSqlSwitchStatusRequest request) {
        return new AsyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>(request, DasMeta.showSqlSwitchStatus, hcClient);
    }

    /**
     * 修改数据库用户
     * 修改注册的数据库用户名和密码。 目前仅支持MySQL实例。
     *
     * @param UpdateDbUserRequest 请求对象
     * @return CompletableFuture<UpdateDbUserResponse>
     */
    public CompletableFuture<UpdateDbUserResponse> updateDbUserAsync(UpdateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateDbUser);
    }

    /**
     * 修改数据库用户
     * 修改注册的数据库用户名和密码。 目前仅支持MySQL实例。
     *
     * @param UpdateDbUserRequest 请求对象
     * @return AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserAsyncInvoker(UpdateDbUserRequest request) {
        return new AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>(request, DasMeta.updateDbUser, hcClient);
    }

}