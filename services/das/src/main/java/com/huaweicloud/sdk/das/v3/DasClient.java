package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
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
     *
     * 查询API版本列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DasMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, DasMeta.showApiVersion,
            hcClient);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeSqlLimitSwitchStatusRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return SyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse>
     */
    public SyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatusInvoker(
        ChangeSqlLimitSwitchStatusRequest request) {
        return new SyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse>(request,
            DasMeta.changeSqlLimitSwitchStatus, hcClient);
    }

    /**
     * 开启/关闭全量SQL、慢SQL开关
     *
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。
     * 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。该功能仅支持付费实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeSqlSwitchRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeSqlSwitchRequest 请求对象
     * @return SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>
     */
    public SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitchInvoker(
        ChangeSqlSwitchRequest request) {
        return new SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>(request, DasMeta.changeSqlSwitch,
            hcClient);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSpaceAnalysisTaskRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSpaceAnalysisTaskRequest 请求对象
     * @return SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>
     */
    public SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskInvoker(
        CreateSpaceAnalysisTaskRequest request) {
        return new SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>(request,
            DasMeta.createSpaceAnalysisTask, hcClient);
    }

    /**
     * 创建SQL限流规则
     *
     * 添加SQL限流规则。目前仅支持MySQL数据库。
     * 使用限制如下：
     * 1.规则举例详细说明：例如关键字是\&quot;select~a\&quot;, 含义为：select以及a为该并发控制所包含的两个关键字，~为关键字间隔符，即若执行SQL命令包含select与a两个关键字视为命中此条并发控制规则。
     * 2.当SQL语句匹配多条限流规则时，优先生效最新添加的规则，之前的规则不再生效。
     * 3.限流规则关键字有顺序要求，只会按顺序匹配。如：a~and~b 只会匹配 xxx a&gt;1 and b&gt;2，而不会匹配 xxx b&gt;2 and a&gt;1。
     * 4.关键字可能大小写敏感，请执行 \&quot;show variables like &#39;rds_sqlfilter_case_sensitive&#39;或者到实例参数设置页面进行确认。
     * 5.部分版本只读实例不允许设置限流规则，如果要设置限流规则，请到主实例上进行添加。
     * 6.系统表不限制、不涉及数据查询的不限制、root账号在特定版本下不限制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSqlLimitRulesRequest 请求对象
     * @return CreateSqlLimitRulesResponse
     */
    public CreateSqlLimitRulesResponse createSqlLimitRules(CreateSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createSqlLimitRules);
    }

    /**
     * 创建SQL限流规则
     *
     * 添加SQL限流规则。目前仅支持MySQL数据库。
     * 使用限制如下：
     * 1.规则举例详细说明：例如关键字是\&quot;select~a\&quot;, 含义为：select以及a为该并发控制所包含的两个关键字，~为关键字间隔符，即若执行SQL命令包含select与a两个关键字视为命中此条并发控制规则。
     * 2.当SQL语句匹配多条限流规则时，优先生效最新添加的规则，之前的规则不再生效。
     * 3.限流规则关键字有顺序要求，只会按顺序匹配。如：a~and~b 只会匹配 xxx a&gt;1 and b&gt;2，而不会匹配 xxx b&gt;2 and a&gt;1。
     * 4.关键字可能大小写敏感，请执行 \&quot;show variables like &#39;rds_sqlfilter_case_sensitive&#39;或者到实例参数设置页面进行确认。
     * 5.部分版本只读实例不允许设置限流规则，如果要设置限流规则，请到主实例上进行添加。
     * 6.系统表不限制、不涉及数据查询的不限制、root账号在特定版本下不限制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse>
     */
    public SyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> createSqlLimitRulesInvoker(
        CreateSqlLimitRulesRequest request) {
        return new SyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse>(request,
            DasMeta.createSqlLimitRules, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除注册在DAS里的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, DasMeta.deleteDbUser, hcClient);
    }

    /**
     * 查杀会话
     *
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteProcessRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteProcessRequest 请求对象
     * @return SyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public SyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessInvoker(DeleteProcessRequest request) {
        return new SyncInvoker<DeleteProcessRequest, DeleteProcessResponse>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL数据库
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlLimitRulesRequest 请求对象
     * @return DeleteSqlLimitRulesResponse
     */
    public DeleteSqlLimitRulesResponse deleteSqlLimitRules(DeleteSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteSqlLimitRules);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL数据库
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse>
     */
    public SyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> deleteSqlLimitRulesInvoker(
        DeleteSqlLimitRulesRequest request) {
        return new SyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse>(request,
            DasMeta.deleteSqlLimitRules, hcClient);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportSlowQueryLogsRequest 请求对象
     * @return ExportSlowQueryLogsResponse
     */
    public ExportSlowQueryLogsResponse exportSlowQueryLogs(ExportSlowQueryLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowQueryLogs);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportSlowQueryLogsRequest 请求对象
     * @return SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>
     */
    public SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogsInvoker(
        ExportSlowQueryLogsRequest request) {
        return new SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>(request,
            DasMeta.exportSlowQueryLogs, hcClient);
    }

    /**
     * 导出慢SQL模板列表。
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。该功能仅支持付费实例。查询时间间隔最长一天。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return ExportSlowSqlTemplatesDetailsResponse
     */
    public ExportSlowSqlTemplatesDetailsResponse exportSlowSqlTemplatesDetails(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowSqlTemplatesDetails);
    }

    /**
     * 导出慢SQL模板列表。
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。该功能仅支持付费实例。查询时间间隔最长一天。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return SyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse>
     */
    public SyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetailsInvoker(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return new SyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse>(request,
            DasMeta.exportSlowSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportSqlStatementsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportSqlStatementsRequest 请求对象
     * @return SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>
     */
    public SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatementsInvoker(
        ExportSqlStatementsRequest request) {
        return new SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>(request,
            DasMeta.exportSqlStatements, hcClient);
    }

    /**
     * 导出TopSQL模板列表。
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return ExportTopSqlTemplatesDetailsResponse
     */
    public ExportTopSqlTemplatesDetailsResponse exportTopSqlTemplatesDetails(
        ExportTopSqlTemplatesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportTopSqlTemplatesDetails);
    }

    /**
     * 导出TopSQL模板列表。
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return SyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse>
     */
    public SyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetailsInvoker(
        ExportTopSqlTemplatesDetailsRequest request) {
        return new SyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse>(request,
            DasMeta.exportTopSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出SQL执行耗时区间数据。
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportTopSqlTrendDetailsRequest 请求对象
     * @return ExportTopSqlTrendDetailsResponse
     */
    public ExportTopSqlTrendDetailsResponse exportTopSqlTrendDetails(ExportTopSqlTrendDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportTopSqlTrendDetails);
    }

    /**
     * 导出SQL执行耗时区间数据。
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportTopSqlTrendDetailsRequest 请求对象
     * @return SyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse>
     */
    public SyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetailsInvoker(
        ExportTopSqlTrendDetailsRequest request) {
        return new SyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse>(request,
            DasMeta.exportTopSqlTrendDetails, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询注册在DAS里的数据库用户列表，后续调用其他接口时(如查询实例会话列表接口)需要用到此接口返回的db_user_id。此接口不会返回数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询InnoDB锁等待列表
     *
     * 查询InnoDB锁等待列表。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInnodbLocksRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksInvoker(
        ListInnodbLocksRequest request) {
        return new SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>(request, DasMeta.listInnodbLocks,
            hcClient);
    }

    /**
     * 查询元数据锁列表
     *
     * 查询元数据锁列表。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMetadataLocksRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksInvoker(
        ListMetadataLocksRequest request) {
        return new SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>(request, DasMeta.listMetadataLocks,
            hcClient);
    }

    /**
     * 查询实例会话列表
     *
     * 支持根据数据库、用户查询实例会话列表。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProcessesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProcessesRequest 请求对象
     * @return SyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public SyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesInvoker(ListProcessesRequest request) {
        return new SyncInvoker<ListProcessesRequest, ListProcessesResponse>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。支持MySQL和GaussDB(for MySQL)引擎
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSpaceAnalysisRequest 请求对象
     * @return ListSpaceAnalysisResponse
     */
    public ListSpaceAnalysisResponse listSpaceAnalysis(ListSpaceAnalysisRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSpaceAnalysis);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。支持MySQL和GaussDB(for MySQL)引擎
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSpaceAnalysisRequest 请求对象
     * @return SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>
     */
    public SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysisInvoker(
        ListSpaceAnalysisRequest request) {
        return new SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>(request, DasMeta.listSpaceAnalysis,
            hcClient);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSqlLimitRulesRequest 请求对象
     * @return ListSqlLimitRulesResponse
     */
    public ListSqlLimitRulesResponse listSqlLimitRules(ListSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSqlLimitRules);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse>
     */
    public SyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> listSqlLimitRulesInvoker(
        ListSqlLimitRulesRequest request) {
        return new SyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse>(request, DasMeta.listSqlLimitRules,
            hcClient);
    }

    /**
     * 注册数据库用户
     *
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库实例上创建数据库用户对象。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterDbUserRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterDbUserRequest 请求对象
     * @return SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserInvoker(
        RegisterDbUserRequest request) {
        return new SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>(request, DasMeta.registerDbUser,
            hcClient);
    }

    /**
     * 查询数据库用户信息
     *
     * 查询注册在DAS里的数据库用户信息。此接口不能查询数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDbUserRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDbUserRequest 请求对象
     * @return SyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public SyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserInvoker(ShowDbUserRequest request) {
        return new SyncInvoker<ShowDbUserRequest, ShowDbUserResponse>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, DasMeta.showQuotas, hcClient);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanInvoker(
        ShowSqlExecutionPlanRequest request) {
        return new SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>(request,
            DasMeta.showSqlExecutionPlan, hcClient);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 补充GET请求，处理超长SQL
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlExplainRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlExplainRequest 请求对象
     * @return SyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse>
     */
    public SyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse> showSqlExplainInvoker(
        ShowSqlExplainRequest request) {
        return new SyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse>(request, DasMeta.showSqlExplain,
            hcClient);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlLimitJobInfoRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlLimitJobInfoRequest 请求对象
     * @return SyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse>
     */
    public SyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> showSqlLimitJobInfoInvoker(
        ShowSqlLimitJobInfoRequest request) {
        return new SyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse>(request,
            DasMeta.showSqlLimitJobInfo, hcClient);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlLimitSwitchStatusRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlLimitSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse>
     */
    public SyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatusInvoker(
        ShowSqlLimitSwitchStatusRequest request) {
        return new SyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse>(request,
            DasMeta.showSqlLimitSwitchStatus, hcClient);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态。
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlSwitchStatusRequest 请求对象
     * @return ShowSqlSwitchStatusResponse
     */
    public ShowSqlSwitchStatusResponse showSqlSwitchStatus(ShowSqlSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlSwitchStatus);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态。
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSqlSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>
     */
    public SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatusInvoker(
        ShowSqlSwitchStatusRequest request) {
        return new SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>(request,
            DasMeta.showSqlSwitchStatus, hcClient);
    }

    /**
     * 修改数据库用户
     *
     * 修改注册在DAS里的数据库用户名和密码。此接口不会修改数据库实例上的数据库用户对象的用户名和密码。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDbUserRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDbUserRequest 请求对象
     * @return SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserInvoker(UpdateDbUserRequest request) {
        return new SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>(request, DasMeta.updateDbUser, hcClient);
    }

}
