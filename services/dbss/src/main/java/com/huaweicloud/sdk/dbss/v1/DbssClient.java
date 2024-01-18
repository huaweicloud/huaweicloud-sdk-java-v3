package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleResponse;
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
     * 添加RDS免agent数据库
     *
     * 添加RDS免agent数据库
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
     * 添加RDS免agent数据库
     *
     * 添加RDS免agent数据库
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
     * 查询ecs服务器规格信息
     *
     * 查询ecs服务器规格信息
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
     * 查询ecs服务器规格信息
     *
     * 查询ecs服务器规格信息
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
     * 开启关闭Agent
     *
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
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
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
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
     * 修改安全组
     *
     * 修改安全组
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
     * 修改安全组
     *
     * 修改安全组
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

}
