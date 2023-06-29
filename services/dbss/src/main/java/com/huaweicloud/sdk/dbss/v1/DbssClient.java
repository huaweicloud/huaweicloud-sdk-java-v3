package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dbss.v1.model.*;

public class DbssClient {

    protected HcClient hcClient;

    public DbssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DbssClient> newBuilder() {
        return new ClientBuilder<>(DbssClient::new);
    }

    /**
     * 添加RDS免agent数据库
     *
     * 添加RDS免agent数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRdsNoAgentDatabaseRequest 请求对象
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
     * @param AddRdsNoAgentDatabaseRequest 请求对象
     * @return SyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse>
     */
    public SyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabaseInvoker(
        AddRdsNoAgentDatabaseRequest request) {
        return new SyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse>(request,
            DbssMeta.addRdsNoAgentDatabase, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddResourceTagRequest 请求对象
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
     * @param BatchAddResourceTagRequest 请求对象
     * @return SyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse>
     */
    public SyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse> batchAddResourceTagInvoker(
        BatchAddResourceTagRequest request) {
        return new SyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse>(request,
            DbssMeta.batchAddResourceTag, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceTagRequest 请求对象
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
     * @param BatchDeleteResourceTagRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagInvoker(
        BatchDeleteResourceTagRequest request) {
        return new SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>(request,
            DbssMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountResourceInstanceByTagRequest 请求对象
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
     * @param CountResourceInstanceByTagRequest 请求对象
     * @return SyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse>
     */
    public SyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> countResourceInstanceByTagInvoker(
        CountResourceInstanceByTagRequest request) {
        return new SyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse>(request,
            DbssMeta.countResourceInstanceByTag, hcClient);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstancesPeriodOrderRequest 请求对象
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
     * @param CreateInstancesPeriodOrderRequest 请求对象
     * @return SyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse>
     */
    public SyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> createInstancesPeriodOrderInvoker(
        CreateInstancesPeriodOrderRequest request) {
        return new SyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse>(request,
            DbssMeta.createInstancesPeriodOrder, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditDatabasesRequest 请求对象
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
     * @param ListAuditDatabasesRequest 请求对象
     * @return SyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse>
     */
    public SyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse> listAuditDatabasesInvoker(
        ListAuditDatabasesRequest request) {
        return new SyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse>(request,
            DbssMeta.listAuditDatabases, hcClient);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditInstanceJobsRequest 请求对象
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
     * @param ListAuditInstanceJobsRequest 请求对象
     * @return SyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse>
     */
    public SyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> listAuditInstanceJobsInvoker(
        ListAuditInstanceJobsRequest request) {
        return new SyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse>(request,
            DbssMeta.listAuditInstanceJobs, hcClient);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditInstancesRequest 请求对象
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
     * @param ListAuditInstancesRequest 请求对象
     * @return SyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse>
     */
    public SyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse> listAuditInstancesInvoker(
        ListAuditInstancesRequest request) {
        return new SyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse>(request,
            DbssMeta.listAuditInstances, hcClient);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditOperateLogsRequest 请求对象
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
     * @param ListAuditOperateLogsRequest 请求对象
     * @return SyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse>
     */
    public SyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> listAuditOperateLogsInvoker(
        ListAuditOperateLogsRequest request) {
        return new SyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse>(request,
            DbssMeta.listAuditOperateLogs, hcClient);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditRuleRisksRequest 请求对象
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
     * @param ListAuditRuleRisksRequest 请求对象
     * @return SyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse>
     */
    public SyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> listAuditRuleRisksInvoker(
        ListAuditRuleRisksRequest request) {
        return new SyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse>(request,
            DbssMeta.listAuditRuleRisks, hcClient);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditRuleScopesRequest 请求对象
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
     * @param ListAuditRuleScopesRequest 请求对象
     * @return SyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse>
     */
    public SyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> listAuditRuleScopesInvoker(
        ListAuditRuleScopesRequest request) {
        return new SyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse>(request,
            DbssMeta.listAuditRuleScopes, hcClient);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditSensitiveMasksRequest 请求对象
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
     * @param ListAuditSensitiveMasksRequest 请求对象
     * @return SyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse>
     */
    public SyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> listAuditSensitiveMasksInvoker(
        ListAuditSensitiveMasksRequest request) {
        return new SyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse>(request,
            DbssMeta.listAuditSensitiveMasks, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZoneInfosRequest 请求对象
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
     * @param ListAvailabilityZoneInfosRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse>
     */
    public SyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfosInvoker(
        ListAvailabilityZoneInfosRequest request) {
        return new SyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse>(request,
            DbssMeta.listAvailabilityZoneInfos, hcClient);
    }

    /**
     * 查询ecs服务器规格信息
     *
     * 查询ecs服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcsSpecificationRequest 请求对象
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
     * @param ListEcsSpecificationRequest 请求对象
     * @return SyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse>
     */
    public SyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse> listEcsSpecificationInvoker(
        ListEcsSpecificationRequest request) {
        return new SyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse>(request,
            DbssMeta.listEcsSpecification, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectResourceTagsRequest 请求对象
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
     * @param ListProjectResourceTagsRequest 请求对象
     * @return SyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse>
     */
    public SyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> listProjectResourceTagsInvoker(
        ListProjectResourceTagsRequest request) {
        return new SyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse>(request,
            DbssMeta.listProjectResourceTags, hcClient);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstanceByTagRequest 请求对象
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
     * @param ListResourceInstanceByTagRequest 请求对象
     * @return SyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse>
     */
    public SyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> listResourceInstanceByTagInvoker(
        ListResourceInstanceByTagRequest request) {
        return new SyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse>(request,
            DbssMeta.listResourceInstanceByTag, hcClient);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlInjectionRulesRequest 请求对象
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
     * @param ListSqlInjectionRulesRequest 请求对象
     * @return SyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse>
     */
    public SyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> listSqlInjectionRulesInvoker(
        ListSqlInjectionRulesRequest request) {
        return new SyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse>(request,
            DbssMeta.listSqlInjectionRules, hcClient);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditQuotaRequest 请求对象
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
     * @param ShowAuditQuotaRequest 请求对象
     * @return SyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse>
     */
    public SyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse> showAuditQuotaInvoker(
        ShowAuditQuotaRequest request) {
        return new SyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse>(request, DbssMeta.showAuditQuota,
            hcClient);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditRuleRiskRequest 请求对象
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
     * @param ShowAuditRuleRiskRequest 请求对象
     * @return SyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse>
     */
    public SyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> showAuditRuleRiskInvoker(
        ShowAuditRuleRiskRequest request) {
        return new SyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse>(request, DbssMeta.showAuditRuleRisk,
            hcClient);
    }

    /**
     * 开启关闭Agent
     *
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchAgentRequest 请求对象
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
     * @param SwitchAgentRequest 请求对象
     * @return SyncInvoker<SwitchAgentRequest, SwitchAgentResponse>
     */
    public SyncInvoker<SwitchAgentRequest, SwitchAgentResponse> switchAgentInvoker(SwitchAgentRequest request) {
        return new SyncInvoker<SwitchAgentRequest, SwitchAgentResponse>(request, DbssMeta.switchAgent, hcClient);
    }

    /**
     * 开启关闭风险规则
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchRiskRuleRequest 请求对象
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
     * @param SwitchRiskRuleRequest 请求对象
     * @return SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>
     */
    public SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRuleInvoker(
        SwitchRiskRuleRequest request) {
        return new SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>(request, DbssMeta.switchRiskRule,
            hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuditSecurityGroupRequest 请求对象
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
     * @param UpdateAuditSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse>
     */
    public SyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> updateAuditSecurityGroupInvoker(
        UpdateAuditSecurityGroupRequest request) {
        return new SyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse>(request,
            DbssMeta.updateAuditSecurityGroup, hcClient);
    }

}
