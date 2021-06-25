package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.das.v3.model.*;

public class DasClient {
    protected HcClient hcClient;

    public DasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DasClient> newBuilder() {
        return new ClientBuilder<>(DasClient::new);
    }


    /**
     * 查询API版本列表
     * 查询API版本列表
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     * 查询API版本列表
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DasMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定的API版本信息
     * 查询指定的API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     * 查询指定的API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, DasMeta.showApiVersion, hcClient);
    }

    /**
     * 开启/关闭全量SQL、慢SQL开关
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。该功能仅支持付费实例。
     *
     * @param ChangeSqlSwitchRequest 请求对象
     * @return ChangeSqlSwitchResponse
     */
    public ChangeSqlSwitchResponse changeSqlSwitch(ChangeSqlSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeSqlSwitch);
    }

    /**
     * 开启/关闭全量SQL、慢SQL开关
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。该功能仅支持付费实例。
     *
     * @param ChangeSqlSwitchRequest 请求对象
     * @return SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>
     */
    public SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitchInvoker(ChangeSqlSwitchRequest request) {
        return new SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>(request, DasMeta.changeSqlSwitch, hcClient);
    }

    /**
     * 创建空间分析任务
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     *
     * @param CreateSpaceAnalysisTaskRequest 请求对象
     * @return CreateSpaceAnalysisTaskResponse
     */
    public CreateSpaceAnalysisTaskResponse createSpaceAnalysisTask(CreateSpaceAnalysisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createSpaceAnalysisTask);
    }

    /**
     * 创建空间分析任务
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     *
     * @param CreateSpaceAnalysisTaskRequest 请求对象
     * @return SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>
     */
    public SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskInvoker(CreateSpaceAnalysisTaskRequest request) {
        return new SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>(request, DasMeta.createSpaceAnalysisTask, hcClient);
    }

    /**
     * 删除数据库用户
     * 删除注册在DAS里的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return DeleteDbUserResponse
     */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     * 删除注册在DAS里的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, DasMeta.deleteDbUser, hcClient);
    }

    /**
     * 查杀会话
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。 目前仅支持MySQL实例。
     *
     * @param DeleteProcessRequest 请求对象
     * @return DeleteProcessResponse
     */
    public DeleteProcessResponse deleteProcess(DeleteProcessRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteProcess);
    }

    /**
     * 查杀会话
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。 目前仅支持MySQL实例。
     *
     * @param DeleteProcessRequest 请求对象
     * @return SyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public SyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessInvoker(DeleteProcessRequest request) {
        return new SyncInvoker<DeleteProcessRequest, DeleteProcessResponse>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 导出慢SQL数据
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     *
     * @param ExportSlowQueryLogsRequest 请求对象
     * @return ExportSlowQueryLogsResponse
     */
    public ExportSlowQueryLogsResponse exportSlowQueryLogs(ExportSlowQueryLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowQueryLogs);
    }

    /**
     * 导出慢SQL数据
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     *
     * @param ExportSlowQueryLogsRequest 请求对象
     * @return SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>
     */
    public SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogsInvoker(ExportSlowQueryLogsRequest request) {
        return new SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>(request, DasMeta.exportSlowQueryLogs, hcClient);
    }

    /**
     * 导出全量SQL
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     *
     * @param ExportSqlStatementsRequest 请求对象
     * @return ExportSqlStatementsResponse
     */
    public ExportSqlStatementsResponse exportSqlStatements(ExportSqlStatementsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSqlStatements);
    }

    /**
     * 导出全量SQL
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     *
     * @param ExportSqlStatementsRequest 请求对象
     * @return SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>
     */
    public SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatementsInvoker(ExportSqlStatementsRequest request) {
        return new SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>(request, DasMeta.exportSqlStatements, hcClient);
    }

    /**
     * 查询数据库用户列表
     * 查询注册在DAS里的数据库用户列表，后续调用其他接口时(如查询实例会话列表接口)需要用到此接口返回的db_user_id。此接口不会返回数据库实例上的数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     * 查询注册在DAS里的数据库用户列表，后续调用其他接口时(如查询实例会话列表接口)需要用到此接口返回的db_user_id。此接口不会返回数据库实例上的数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询InnoDB锁等待列表
     * 查询InnoDB锁等待列表。 目前仅支持MySQL实例。
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return ListInnodbLocksResponse
     */
    public ListInnodbLocksResponse listInnodbLocks(ListInnodbLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInnodbLocks);
    }

    /**
     * 查询InnoDB锁等待列表
     * 查询InnoDB锁等待列表。 目前仅支持MySQL实例。
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksInvoker(ListInnodbLocksRequest request) {
        return new SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>(request, DasMeta.listInnodbLocks, hcClient);
    }

    /**
     * 查询元数据锁列表
     * 查询元数据锁列表。 目前仅支持MySQL实例。
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return ListMetadataLocksResponse
     */
    public ListMetadataLocksResponse listMetadataLocks(ListMetadataLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listMetadataLocks);
    }

    /**
     * 查询元数据锁列表
     * 查询元数据锁列表。 目前仅支持MySQL实例。
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksInvoker(ListMetadataLocksRequest request) {
        return new SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>(request, DasMeta.listMetadataLocks, hcClient);
    }

    /**
     * 查询实例会话列表
     * 支持根据数据库、用户查询实例会话列表。 目前仅支持MySQL实例。
     *
     * @param ListProcessesRequest 请求对象
     * @return ListProcessesResponse
     */
    public ListProcessesResponse listProcesses(ListProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listProcesses);
    }

    /**
     * 查询实例会话列表
     * 支持根据数据库、用户查询实例会话列表。 目前仅支持MySQL实例。
     *
     * @param ListProcessesRequest 请求对象
     * @return SyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public SyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesInvoker(ListProcessesRequest request) {
        return new SyncInvoker<ListProcessesRequest, ListProcessesResponse>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 获取空间分析数据列表
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。支持MySQL和GaussDB(for MySQL)引擎
     *
     * @param ListSpaceAnalysisRequest 请求对象
     * @return ListSpaceAnalysisResponse
     */
    public ListSpaceAnalysisResponse listSpaceAnalysis(ListSpaceAnalysisRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSpaceAnalysis);
    }

    /**
     * 获取空间分析数据列表
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。支持MySQL和GaussDB(for MySQL)引擎
     *
     * @param ListSpaceAnalysisRequest 请求对象
     * @return SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>
     */
    public SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysisInvoker(ListSpaceAnalysisRequest request) {
        return new SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>(request, DasMeta.listSpaceAnalysis, hcClient);
    }

    /**
     * 注册数据库用户
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库实例上创建数据库用户对象。请确保输入的用户名和密码是已经存在并且是正确的。 目前仅支持MySQL实例。
     *
     * @param RegisterDbUserRequest 请求对象
     * @return RegisterDbUserResponse
     */
    public RegisterDbUserResponse registerDbUser(RegisterDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.registerDbUser);
    }

    /**
     * 注册数据库用户
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库实例上创建数据库用户对象。请确保输入的用户名和密码是已经存在并且是正确的。 目前仅支持MySQL实例。
     *
     * @param RegisterDbUserRequest 请求对象
     * @return SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserInvoker(RegisterDbUserRequest request) {
        return new SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>(request, DasMeta.registerDbUser, hcClient);
    }

    /**
     * 查询数据库用户信息
     * 查询注册在DAS里的数据库用户信息。此接口不能查询数据库实例上的数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param ShowDbUserRequest 请求对象
     * @return ShowDbUserResponse
     */
    public ShowDbUserResponse showDbUser(ShowDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDbUser);
    }

    /**
     * 查询数据库用户信息
     * 查询注册在DAS里的数据库用户信息。此接口不能查询数据库实例上的数据库用户对象。 目前仅支持MySQL实例。
     *
     * @param ShowDbUserRequest 请求对象
     * @return SyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public SyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserInvoker(ShowDbUserRequest request) {
        return new SyncInvoker<ShowDbUserRequest, ShowDbUserResponse>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 查询云DBA配额
     * 查询云DBA配额
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showQuotas);
    }

    /**
     * 查询云DBA配额
     * 查询云DBA配额
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, DasMeta.showQuotas, hcClient);
    }

    /**
     * 查询SQL执行计划
     * 查询SQL执行计划。 目前仅支持MySQL实例。
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return ShowSqlExecutionPlanResponse
     */
    public ShowSqlExecutionPlanResponse showSqlExecutionPlan(ShowSqlExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlExecutionPlan);
    }

    /**
     * 查询SQL执行计划
     * 查询SQL执行计划。 目前仅支持MySQL实例。
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanInvoker(ShowSqlExecutionPlanRequest request) {
        return new SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>(request, DasMeta.showSqlExecutionPlan, hcClient);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态。
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     *
     * @param ShowSqlSwitchStatusRequest 请求对象
     * @return ShowSqlSwitchStatusResponse
     */
    public ShowSqlSwitchStatusResponse showSqlSwitchStatus(ShowSqlSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlSwitchStatus);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态。
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     *
     * @param ShowSqlSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>
     */
    public SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatusInvoker(ShowSqlSwitchStatusRequest request) {
        return new SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>(request, DasMeta.showSqlSwitchStatus, hcClient);
    }

    /**
     * 修改数据库用户
     * 修改注册在DAS里的数据库用户名和密码。此接口不会修改数据库实例上的数据库用户对象的用户名和密码。请确保输入的用户名和密码是已经存在并且是正确的。 目前仅支持MySQL实例。
     *
     * @param UpdateDbUserRequest 请求对象
     * @return UpdateDbUserResponse
     */
    public UpdateDbUserResponse updateDbUser(UpdateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateDbUser);
    }

    /**
     * 修改数据库用户
     * 修改注册在DAS里的数据库用户名和密码。此接口不会修改数据库实例上的数据库用户对象的用户名和密码。请确保输入的用户名和密码是已经存在并且是正确的。 目前仅支持MySQL实例。
     *
     * @param UpdateDbUserRequest 请求对象
     * @return SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserInvoker(UpdateDbUserRequest request) {
        return new SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>(request, DasMeta.updateDbUser, hcClient);
    }

}