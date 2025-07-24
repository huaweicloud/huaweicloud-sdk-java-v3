package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSummaryInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSummaryInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListRdsDatabasesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListRdsDatabasesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesResponse;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskResponse;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupResponse;

public class DbssClient {

    protected HcClient hcClient;

    public DbssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DbssClient> newBuilder() {
        ClientBuilder<DbssClient> clientBuilder = new ClientBuilder<>(DbssClient::new);
        return clientBuilder;
    }

    /**
     * 添加自建数据库
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseRequest 请求对象
     * @return AddAuditDatabaseResponse
     */
    public AddAuditDatabaseResponse addAuditDatabase(AddAuditDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addAuditDatabase);
    }

    /**
     * 添加自建数据库
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseRequest 请求对象
     * @return SyncInvoker<AddAuditDatabaseRequest, AddAuditDatabaseResponse>
     */
    public SyncInvoker<AddAuditDatabaseRequest, AddAuditDatabaseResponse> addAuditDatabaseInvoker(
        AddAuditDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addAuditDatabase, hcClient);
    }

    /**
     * 添加RDS数据库
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseRequest 请求对象
     * @return AddRdsDatabaseResponse
     */
    public AddRdsDatabaseResponse addRdsDatabase(AddRdsDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addRdsDatabase);
    }

    /**
     * 添加RDS数据库
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseRequest 请求对象
     * @return SyncInvoker<AddRdsDatabaseRequest, AddRdsDatabaseResponse>
     */
    public SyncInvoker<AddRdsDatabaseRequest, AddRdsDatabaseResponse> addRdsDatabaseInvoker(
        AddRdsDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addRdsDatabase, hcClient);
    }

    /**
     * 添加RDS数据库(V1待下线)
     *
     * 添加RDS数据库。V1版本已不再维护，待下线。
     * 请使用V2版本接口（/v2/{project_id}/{instance_id}/audit/databases/rds）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsNoAgentDatabaseRequest 请求对象
     * @return AddRdsNoAgentDatabaseResponse
     */
    public AddRdsNoAgentDatabaseResponse addRdsNoAgentDatabase(AddRdsNoAgentDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addRdsNoAgentDatabase);
    }

    /**
     * 添加RDS数据库(V1待下线)
     *
     * 添加RDS数据库。V1版本已不再维护，待下线。
     * 请使用V2版本接口（/v2/{project_id}/{instance_id}/audit/databases/rds）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsNoAgentDatabaseRequest 请求对象
     * @return SyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse>
     */
    public SyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabaseInvoker(
        AddRdsNoAgentDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addRdsNoAgentDatabase, hcClient);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderRequest 请求对象
     * @return CreateInstancesPeriodOrderResponse
     */
    public CreateInstancesPeriodOrderResponse createInstancesPeriodOrder(CreateInstancesPeriodOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createInstancesPeriodOrder);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderRequest 请求对象
     * @return SyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse>
     */
    public SyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> createInstancesPeriodOrderInvoker(
        CreateInstancesPeriodOrderRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createInstancesPeriodOrder, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseRequest 请求对象
     * @return DeleteAuditDatabaseResponse
     */
    public DeleteAuditDatabaseResponse deleteAuditDatabase(DeleteAuditDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse>
     */
    public SyncInvoker<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> deleteAuditDatabaseInvoker(
        DeleteAuditDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditDatabase, hcClient);
    }

    /**
     * 删除审计实例
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteInstances);
    }

    /**
     * 删除审计实例
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>
     */
    public SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstancesInvoker(
        DeleteInstancesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteInstances, hcClient);
    }

    /**
     * 获取实例告警配置
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoRequest 请求对象
     * @return ListAlarmTopicConfigInfoResponse
     */
    public ListAlarmTopicConfigInfoResponse listAlarmTopicConfigInfo(ListAlarmTopicConfigInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAlarmTopicConfigInfo);
    }

    /**
     * 获取实例告警配置
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoRequest 请求对象
     * @return SyncInvoker<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse>
     */
    public SyncInvoker<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> listAlarmTopicConfigInfoInvoker(
        ListAlarmTopicConfigInfoRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAlarmTopicConfigInfo, hcClient);
    }

    /**
     * 查询审计告警信息
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogRequest 请求对象
     * @return ListAuditAlarmLogResponse
     */
    public ListAuditAlarmLogResponse listAuditAlarmLog(ListAuditAlarmLogRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditAlarmLog);
    }

    /**
     * 查询审计告警信息
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogRequest 请求对象
     * @return SyncInvoker<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse>
     */
    public SyncInvoker<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> listAuditAlarmLogInvoker(
        ListAuditAlarmLogRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditAlarmLog, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesRequest 请求对象
     * @return ListAuditDatabasesResponse
     */
    public ListAuditDatabasesResponse listAuditDatabases(ListAuditDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesRequest 请求对象
     * @return SyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse>
     */
    public SyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse> listAuditDatabasesInvoker(
        ListAuditDatabasesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditDatabases, hcClient);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsRequest 请求对象
     * @return ListAuditInstanceJobsResponse
     */
    public ListAuditInstanceJobsResponse listAuditInstanceJobs(ListAuditInstanceJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditInstanceJobs);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsRequest 请求对象
     * @return SyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse>
     */
    public SyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> listAuditInstanceJobsInvoker(
        ListAuditInstanceJobsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditInstanceJobs, hcClient);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesRequest 请求对象
     * @return ListAuditInstancesResponse
     */
    public ListAuditInstancesResponse listAuditInstances(ListAuditInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditInstances);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesRequest 请求对象
     * @return SyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse>
     */
    public SyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse> listAuditInstancesInvoker(
        ListAuditInstancesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditInstances, hcClient);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsRequest 请求对象
     * @return ListAuditOperateLogsResponse
     */
    public ListAuditOperateLogsResponse listAuditOperateLogs(ListAuditOperateLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditOperateLogs);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsRequest 请求对象
     * @return SyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse>
     */
    public SyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> listAuditOperateLogsInvoker(
        ListAuditOperateLogsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditOperateLogs, hcClient);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksRequest 请求对象
     * @return ListAuditRuleRisksResponse
     */
    public ListAuditRuleRisksResponse listAuditRuleRisks(ListAuditRuleRisksRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditRuleRisks);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksRequest 请求对象
     * @return SyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse>
     */
    public SyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> listAuditRuleRisksInvoker(
        ListAuditRuleRisksRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditRuleRisks, hcClient);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesRequest 请求对象
     * @return ListAuditRuleScopesResponse
     */
    public ListAuditRuleScopesResponse listAuditRuleScopes(ListAuditRuleScopesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditRuleScopes);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesRequest 请求对象
     * @return SyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse>
     */
    public SyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> listAuditRuleScopesInvoker(
        ListAuditRuleScopesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditRuleScopes, hcClient);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksRequest 请求对象
     * @return ListAuditSensitiveMasksResponse
     */
    public ListAuditSensitiveMasksResponse listAuditSensitiveMasks(ListAuditSensitiveMasksRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditSensitiveMasks);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksRequest 请求对象
     * @return SyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse>
     */
    public SyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> listAuditSensitiveMasksInvoker(
        ListAuditSensitiveMasksRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditSensitiveMasks, hcClient);
    }

    /**
     * 查询审计SQL语句
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsRequest 请求对象
     * @return ListAuditSqlsResponse
     */
    public ListAuditSqlsResponse listAuditSqls(ListAuditSqlsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditSqls);
    }

    /**
     * 查询审计SQL语句
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsRequest 请求对象
     * @return SyncInvoker<ListAuditSqlsRequest, ListAuditSqlsResponse>
     */
    public SyncInvoker<ListAuditSqlsRequest, ListAuditSqlsResponse> listAuditSqlsInvoker(ListAuditSqlsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditSqls, hcClient);
    }

    /**
     * 查询审计汇总信息
     *
     * 查询审计汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSummaryInfosRequest 请求对象
     * @return ListAuditSummaryInfosResponse
     */
    public ListAuditSummaryInfosResponse listAuditSummaryInfos(ListAuditSummaryInfosRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditSummaryInfos);
    }

    /**
     * 查询审计汇总信息
     *
     * 查询审计汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSummaryInfosRequest 请求对象
     * @return SyncInvoker<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse>
     */
    public SyncInvoker<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> listAuditSummaryInfosInvoker(
        ListAuditSummaryInfosRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditSummaryInfos, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosRequest 请求对象
     * @return ListAvailabilityZoneInfosResponse
     */
    public ListAvailabilityZoneInfosResponse listAvailabilityZoneInfos(ListAvailabilityZoneInfosRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAvailabilityZoneInfos);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse>
     */
    public SyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfosInvoker(
        ListAvailabilityZoneInfosRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAvailabilityZoneInfos, hcClient);
    }

    /**
     * 查询ECS服务器规格信息
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationRequest 请求对象
     * @return ListEcsSpecificationResponse
     */
    public ListEcsSpecificationResponse listEcsSpecification(ListEcsSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listEcsSpecification);
    }

    /**
     * 查询ECS服务器规格信息
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationRequest 请求对象
     * @return SyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse>
     */
    public SyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse> listEcsSpecificationInvoker(
        ListEcsSpecificationRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listEcsSpecification, hcClient);
    }

    /**
     * 查询RDS数据库列表
     *
     * 查询RDS数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdsDatabasesRequest 请求对象
     * @return ListRdsDatabasesResponse
     */
    public ListRdsDatabasesResponse listRdsDatabases(ListRdsDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listRdsDatabases);
    }

    /**
     * 查询RDS数据库列表
     *
     * 查询RDS数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdsDatabasesRequest 请求对象
     * @return SyncInvoker<ListRdsDatabasesRequest, ListRdsDatabasesResponse>
     */
    public SyncInvoker<ListRdsDatabasesRequest, ListRdsDatabasesResponse> listRdsDatabasesInvoker(
        ListRdsDatabasesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listRdsDatabases, hcClient);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesRequest 请求对象
     * @return ListSqlInjectionRulesResponse
     */
    public ListSqlInjectionRulesResponse listSqlInjectionRules(ListSqlInjectionRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listSqlInjectionRules);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesRequest 请求对象
     * @return SyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse>
     */
    public SyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> listSqlInjectionRulesInvoker(
        ListSqlInjectionRulesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listSqlInjectionRules, hcClient);
    }

    /**
     * 重启审计实例
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceRequest 请求对象
     * @return RebootAuditInstanceResponse
     */
    public RebootAuditInstanceResponse rebootAuditInstance(RebootAuditInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.rebootAuditInstance);
    }

    /**
     * 重启审计实例
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceRequest 请求对象
     * @return SyncInvoker<RebootAuditInstanceRequest, RebootAuditInstanceResponse>
     */
    public SyncInvoker<RebootAuditInstanceRequest, RebootAuditInstanceResponse> rebootAuditInstanceInvoker(
        RebootAuditInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.rebootAuditInstance, hcClient);
    }

    /**
     * 设置实例告警配置
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoRequest 请求对象
     * @return SetAlarmTopicConfigInfoResponse
     */
    public SetAlarmTopicConfigInfoResponse setAlarmTopicConfigInfo(SetAlarmTopicConfigInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAlarmTopicConfigInfo);
    }

    /**
     * 设置实例告警配置
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoRequest 请求对象
     * @return SyncInvoker<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse>
     */
    public SyncInvoker<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> setAlarmTopicConfigInfoInvoker(
        SetAlarmTopicConfigInfoRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAlarmTopicConfigInfo, hcClient);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaRequest 请求对象
     * @return ShowAuditQuotaResponse
     */
    public ShowAuditQuotaResponse showAuditQuota(ShowAuditQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditQuota);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaRequest 请求对象
     * @return SyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse>
     */
    public SyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse> showAuditQuotaInvoker(
        ShowAuditQuotaRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditQuota, hcClient);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskRequest 请求对象
     * @return ShowAuditRuleRiskResponse
     */
    public ShowAuditRuleRiskResponse showAuditRuleRisk(ShowAuditRuleRiskRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditRuleRisk);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskRequest 请求对象
     * @return SyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse>
     */
    public SyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> showAuditRuleRiskInvoker(
        ShowAuditRuleRiskRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditRuleRisk, hcClient);
    }

    /**
     * 开启审计实例
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceRequest 请求对象
     * @return StartAuditInstanceResponse
     */
    public StartAuditInstanceResponse startAuditInstance(StartAuditInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.startAuditInstance);
    }

    /**
     * 开启审计实例
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceRequest 请求对象
     * @return SyncInvoker<StartAuditInstanceRequest, StartAuditInstanceResponse>
     */
    public SyncInvoker<StartAuditInstanceRequest, StartAuditInstanceResponse> startAuditInstanceInvoker(
        StartAuditInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.startAuditInstance, hcClient);
    }

    /**
     * 关闭审计实例
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceRequest 请求对象
     * @return StopAuditInstanceResponse
     */
    public StopAuditInstanceResponse stopAuditInstance(StopAuditInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.stopAuditInstance);
    }

    /**
     * 关闭审计实例
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceRequest 请求对象
     * @return SyncInvoker<StopAuditInstanceRequest, StopAuditInstanceResponse>
     */
    public SyncInvoker<StopAuditInstanceRequest, StopAuditInstanceResponse> stopAuditInstanceInvoker(
        StopAuditInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.stopAuditInstance, hcClient);
    }

    /**
     * 开启关闭数据库
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseRequest 请求对象
     * @return SwitchAuditDatabaseResponse
     */
    public SwitchAuditDatabaseResponse switchAuditDatabase(SwitchAuditDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchAuditDatabase);
    }

    /**
     * 开启关闭数据库
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseRequest 请求对象
     * @return SyncInvoker<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse>
     */
    public SyncInvoker<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> switchAuditDatabaseInvoker(
        SwitchAuditDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchAuditDatabase, hcClient);
    }

    /**
     * 开启关闭风险规则
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleRequest 请求对象
     * @return SwitchRiskRuleResponse
     */
    public SwitchRiskRuleResponse switchRiskRule(SwitchRiskRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchRiskRule);
    }

    /**
     * 开启关闭风险规则
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleRequest 请求对象
     * @return SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>
     */
    public SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRuleInvoker(
        SwitchRiskRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchRiskRule, hcClient);
    }

    /**
     * 更新审计实例信息
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceRequest 请求对象
     * @return UpdateAuditInstanceResponse
     */
    public UpdateAuditInstanceResponse updateAuditInstance(UpdateAuditInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditInstance);
    }

    /**
     * 更新审计实例信息
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceRequest 请求对象
     * @return SyncInvoker<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse>
     */
    public SyncInvoker<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> updateAuditInstanceInvoker(
        UpdateAuditInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditInstance, hcClient);
    }

    /**
     * 修改实例安全组
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupRequest 请求对象
     * @return UpdateAuditSecurityGroupResponse
     */
    public UpdateAuditSecurityGroupResponse updateAuditSecurityGroup(UpdateAuditSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditSecurityGroup);
    }

    /**
     * 修改实例安全组
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse>
     */
    public SyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> updateAuditSecurityGroupInvoker(
        UpdateAuditSecurityGroupRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditSecurityGroup, hcClient);
    }

    /**
     * 添加审计数据库Agent
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentRequest 请求对象
     * @return AddAuditAgentResponse
     */
    public AddAuditAgentResponse addAuditAgent(AddAuditAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addAuditAgent);
    }

    /**
     * 添加审计数据库Agent
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentRequest 请求对象
     * @return SyncInvoker<AddAuditAgentRequest, AddAuditAgentResponse>
     */
    public SyncInvoker<AddAuditAgentRequest, AddAuditAgentResponse> addAuditAgentInvoker(AddAuditAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addAuditAgent, hcClient);
    }

    /**
     * 删除数据库Agent
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentRequest 请求对象
     * @return DeleteAuditAgentResponse
     */
    public DeleteAuditAgentResponse deleteAuditAgent(DeleteAuditAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditAgent);
    }

    /**
     * 删除数据库Agent
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentRequest 请求对象
     * @return SyncInvoker<DeleteAuditAgentRequest, DeleteAuditAgentResponse>
     */
    public SyncInvoker<DeleteAuditAgentRequest, DeleteAuditAgentResponse> deleteAuditAgentInvoker(
        DeleteAuditAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditAgent, hcClient);
    }

    /**
     * 下载审计Agent
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentRequest 请求对象
     * @return DownloadAuditAgentResponse
     */
    public DownloadAuditAgentResponse downloadAuditAgent(DownloadAuditAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.downloadAuditAgent);
    }

    /**
     * 下载审计Agent
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentRequest 请求对象
     * @return SyncInvoker<DownloadAuditAgentRequest, DownloadAuditAgentResponse>
     */
    public SyncInvoker<DownloadAuditAgentRequest, DownloadAuditAgentResponse> downloadAuditAgentInvoker(
        DownloadAuditAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.downloadAuditAgent, hcClient);
    }

    /**
     * 查询数据库Agent列表
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentRequest 请求对象
     * @return ListAuditAgentResponse
     */
    public ListAuditAgentResponse listAuditAgent(ListAuditAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditAgent);
    }

    /**
     * 查询数据库Agent列表
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentRequest 请求对象
     * @return SyncInvoker<ListAuditAgentRequest, ListAuditAgentResponse>
     */
    public SyncInvoker<ListAuditAgentRequest, ListAuditAgentResponse> listAuditAgentInvoker(
        ListAuditAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditAgent, hcClient);
    }

    /**
     * 开启关闭Agent
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentRequest 请求对象
     * @return SwitchAgentResponse
     */
    public SwitchAgentResponse switchAgent(SwitchAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchAgent);
    }

    /**
     * 开启关闭Agent
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentRequest 请求对象
     * @return SyncInvoker<SwitchAgentRequest, SwitchAgentResponse>
     */
    public SyncInvoker<SwitchAgentRequest, SwitchAgentResponse> switchAgentInvoker(SwitchAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchAgent, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourceTagRequest 请求对象
     * @return BatchAddResourceTagResponse
     */
    public BatchAddResourceTagResponse batchAddResourceTag(BatchAddResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.batchAddResourceTag);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourceTagRequest 请求对象
     * @return SyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse>
     */
    public SyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse> batchAddResourceTagInvoker(
        BatchAddResourceTagRequest request) {
        return new SyncInvoker<>(request, DbssMeta.batchAddResourceTag, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return BatchDeleteResourceTagResponse
     */
    public BatchDeleteResourceTagResponse batchDeleteResourceTag(BatchDeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.batchDeleteResourceTag);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagInvoker(
        BatchDeleteResourceTagRequest request) {
        return new SyncInvoker<>(request, DbssMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceByTagRequest 请求对象
     * @return CountResourceInstanceByTagResponse
     */
    public CountResourceInstanceByTagResponse countResourceInstanceByTag(CountResourceInstanceByTagRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countResourceInstanceByTag);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceByTagRequest 请求对象
     * @return SyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse>
     */
    public SyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> countResourceInstanceByTagInvoker(
        CountResourceInstanceByTagRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countResourceInstanceByTag, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectResourceTagsRequest 请求对象
     * @return ListProjectResourceTagsResponse
     */
    public ListProjectResourceTagsResponse listProjectResourceTags(ListProjectResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listProjectResourceTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectResourceTagsRequest 请求对象
     * @return SyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse>
     */
    public SyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> listProjectResourceTagsInvoker(
        ListProjectResourceTagsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listProjectResourceTags, hcClient);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceByTagRequest 请求对象
     * @return ListResourceInstanceByTagResponse
     */
    public ListResourceInstanceByTagResponse listResourceInstanceByTag(ListResourceInstanceByTagRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listResourceInstanceByTag);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceByTagRequest 请求对象
     * @return SyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse>
     */
    public SyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> listResourceInstanceByTagInvoker(
        ListResourceInstanceByTagRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listResourceInstanceByTag, hcClient);
    }

}
