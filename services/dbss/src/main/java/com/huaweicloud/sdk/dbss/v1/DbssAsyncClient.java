package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class DbssAsyncClient {

    protected HcClient hcClient;

    public DbssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DbssAsyncClient> newBuilder() {
        ClientBuilder<DbssAsyncClient> clientBuilder = new ClientBuilder<>(DbssAsyncClient::new);
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
     * @return CompletableFuture<AddRdsNoAgentDatabaseResponse>
     */
    public CompletableFuture<AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabaseAsync(
        AddRdsNoAgentDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.addRdsNoAgentDatabase);
    }

    /**
     * 添加RDS免agent数据库
     *
     * 添加RDS免agent数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsNoAgentDatabaseRequest 请求对象
     * @return AsyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse>
     */
    public AsyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabaseAsyncInvoker(
        AddRdsNoAgentDatabaseRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.addRdsNoAgentDatabase, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourceTagRequest 请求对象
     * @return CompletableFuture<BatchAddResourceTagResponse>
     */
    public CompletableFuture<BatchAddResourceTagResponse> batchAddResourceTagAsync(BatchAddResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.batchAddResourceTag);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourceTagRequest 请求对象
     * @return AsyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse>
     */
    public AsyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse> batchAddResourceTagAsyncInvoker(
        BatchAddResourceTagRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.batchAddResourceTag, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return CompletableFuture<BatchDeleteResourceTagResponse>
     */
    public CompletableFuture<BatchDeleteResourceTagResponse> batchDeleteResourceTagAsync(
        BatchDeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.batchDeleteResourceTag);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagAsyncInvoker(
        BatchDeleteResourceTagRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceByTagRequest 请求对象
     * @return CompletableFuture<CountResourceInstanceByTagResponse>
     */
    public CompletableFuture<CountResourceInstanceByTagResponse> countResourceInstanceByTagAsync(
        CountResourceInstanceByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countResourceInstanceByTag);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceByTagRequest 请求对象
     * @return AsyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse>
     */
    public AsyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> countResourceInstanceByTagAsyncInvoker(
        CountResourceInstanceByTagRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countResourceInstanceByTag, hcClient);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderRequest 请求对象
     * @return CompletableFuture<CreateInstancesPeriodOrderResponse>
     */
    public CompletableFuture<CreateInstancesPeriodOrderResponse> createInstancesPeriodOrderAsync(
        CreateInstancesPeriodOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createInstancesPeriodOrder);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderRequest 请求对象
     * @return AsyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse>
     */
    public AsyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> createInstancesPeriodOrderAsyncInvoker(
        CreateInstancesPeriodOrderRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createInstancesPeriodOrder, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesRequest 请求对象
     * @return CompletableFuture<ListAuditDatabasesResponse>
     */
    public CompletableFuture<ListAuditDatabasesResponse> listAuditDatabasesAsync(ListAuditDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesRequest 请求对象
     * @return AsyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse>
     */
    public AsyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse> listAuditDatabasesAsyncInvoker(
        ListAuditDatabasesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditDatabases, hcClient);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsRequest 请求对象
     * @return CompletableFuture<ListAuditInstanceJobsResponse>
     */
    public CompletableFuture<ListAuditInstanceJobsResponse> listAuditInstanceJobsAsync(
        ListAuditInstanceJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditInstanceJobs);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsRequest 请求对象
     * @return AsyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse>
     */
    public AsyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> listAuditInstanceJobsAsyncInvoker(
        ListAuditInstanceJobsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditInstanceJobs, hcClient);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesRequest 请求对象
     * @return CompletableFuture<ListAuditInstancesResponse>
     */
    public CompletableFuture<ListAuditInstancesResponse> listAuditInstancesAsync(ListAuditInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditInstances);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesRequest 请求对象
     * @return AsyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse>
     */
    public AsyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse> listAuditInstancesAsyncInvoker(
        ListAuditInstancesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditInstances, hcClient);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsRequest 请求对象
     * @return CompletableFuture<ListAuditOperateLogsResponse>
     */
    public CompletableFuture<ListAuditOperateLogsResponse> listAuditOperateLogsAsync(
        ListAuditOperateLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditOperateLogs);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsRequest 请求对象
     * @return AsyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse>
     */
    public AsyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> listAuditOperateLogsAsyncInvoker(
        ListAuditOperateLogsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditOperateLogs, hcClient);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksRequest 请求对象
     * @return CompletableFuture<ListAuditRuleRisksResponse>
     */
    public CompletableFuture<ListAuditRuleRisksResponse> listAuditRuleRisksAsync(ListAuditRuleRisksRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditRuleRisks);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksRequest 请求对象
     * @return AsyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse>
     */
    public AsyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> listAuditRuleRisksAsyncInvoker(
        ListAuditRuleRisksRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditRuleRisks, hcClient);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesRequest 请求对象
     * @return CompletableFuture<ListAuditRuleScopesResponse>
     */
    public CompletableFuture<ListAuditRuleScopesResponse> listAuditRuleScopesAsync(ListAuditRuleScopesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditRuleScopes);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesRequest 请求对象
     * @return AsyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse>
     */
    public AsyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> listAuditRuleScopesAsyncInvoker(
        ListAuditRuleScopesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditRuleScopes, hcClient);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksRequest 请求对象
     * @return CompletableFuture<ListAuditSensitiveMasksResponse>
     */
    public CompletableFuture<ListAuditSensitiveMasksResponse> listAuditSensitiveMasksAsync(
        ListAuditSensitiveMasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditSensitiveMasks);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksRequest 请求对象
     * @return AsyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse>
     */
    public AsyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> listAuditSensitiveMasksAsyncInvoker(
        ListAuditSensitiveMasksRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditSensitiveMasks, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZoneInfosResponse>
     */
    public CompletableFuture<ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfosAsync(
        ListAvailabilityZoneInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAvailabilityZoneInfos);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse>
     */
    public AsyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfosAsyncInvoker(
        ListAvailabilityZoneInfosRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAvailabilityZoneInfos, hcClient);
    }

    /**
     * 查询ecs服务器规格信息
     *
     * 查询ecs服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationRequest 请求对象
     * @return CompletableFuture<ListEcsSpecificationResponse>
     */
    public CompletableFuture<ListEcsSpecificationResponse> listEcsSpecificationAsync(
        ListEcsSpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listEcsSpecification);
    }

    /**
     * 查询ecs服务器规格信息
     *
     * 查询ecs服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationRequest 请求对象
     * @return AsyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse>
     */
    public AsyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse> listEcsSpecificationAsyncInvoker(
        ListEcsSpecificationRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listEcsSpecification, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectResourceTagsRequest 请求对象
     * @return CompletableFuture<ListProjectResourceTagsResponse>
     */
    public CompletableFuture<ListProjectResourceTagsResponse> listProjectResourceTagsAsync(
        ListProjectResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listProjectResourceTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse>
     */
    public AsyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> listProjectResourceTagsAsyncInvoker(
        ListProjectResourceTagsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listProjectResourceTags, hcClient);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceByTagRequest 请求对象
     * @return CompletableFuture<ListResourceInstanceByTagResponse>
     */
    public CompletableFuture<ListResourceInstanceByTagResponse> listResourceInstanceByTagAsync(
        ListResourceInstanceByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listResourceInstanceByTag);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceByTagRequest 请求对象
     * @return AsyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse>
     */
    public AsyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> listResourceInstanceByTagAsyncInvoker(
        ListResourceInstanceByTagRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listResourceInstanceByTag, hcClient);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesRequest 请求对象
     * @return CompletableFuture<ListSqlInjectionRulesResponse>
     */
    public CompletableFuture<ListSqlInjectionRulesResponse> listSqlInjectionRulesAsync(
        ListSqlInjectionRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listSqlInjectionRules);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesRequest 请求对象
     * @return AsyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse>
     */
    public AsyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> listSqlInjectionRulesAsyncInvoker(
        ListSqlInjectionRulesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listSqlInjectionRules, hcClient);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaRequest 请求对象
     * @return CompletableFuture<ShowAuditQuotaResponse>
     */
    public CompletableFuture<ShowAuditQuotaResponse> showAuditQuotaAsync(ShowAuditQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditQuota);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaRequest 请求对象
     * @return AsyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse>
     */
    public AsyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse> showAuditQuotaAsyncInvoker(
        ShowAuditQuotaRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditQuota, hcClient);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskRequest 请求对象
     * @return CompletableFuture<ShowAuditRuleRiskResponse>
     */
    public CompletableFuture<ShowAuditRuleRiskResponse> showAuditRuleRiskAsync(ShowAuditRuleRiskRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditRuleRisk);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskRequest 请求对象
     * @return AsyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse>
     */
    public AsyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> showAuditRuleRiskAsyncInvoker(
        ShowAuditRuleRiskRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditRuleRisk, hcClient);
    }

    /**
     * 开启关闭Agent
     *
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentRequest 请求对象
     * @return CompletableFuture<SwitchAgentResponse>
     */
    public CompletableFuture<SwitchAgentResponse> switchAgentAsync(SwitchAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchAgent);
    }

    /**
     * 开启关闭Agent
     *
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentRequest 请求对象
     * @return AsyncInvoker<SwitchAgentRequest, SwitchAgentResponse>
     */
    public AsyncInvoker<SwitchAgentRequest, SwitchAgentResponse> switchAgentAsyncInvoker(SwitchAgentRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.switchAgent, hcClient);
    }

    /**
     * 开启关闭风险规则
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleRequest 请求对象
     * @return CompletableFuture<SwitchRiskRuleResponse>
     */
    public CompletableFuture<SwitchRiskRuleResponse> switchRiskRuleAsync(SwitchRiskRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchRiskRule);
    }

    /**
     * 开启关闭风险规则
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleRequest 请求对象
     * @return AsyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>
     */
    public AsyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRuleAsyncInvoker(
        SwitchRiskRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.switchRiskRule, hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateAuditSecurityGroupResponse>
     */
    public CompletableFuture<UpdateAuditSecurityGroupResponse> updateAuditSecurityGroupAsync(
        UpdateAuditSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditSecurityGroup);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> updateAuditSecurityGroupAsyncInvoker(
        UpdateAuditSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditSecurityGroup, hcClient);
    }

}
