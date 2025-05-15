package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.AddAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.AddAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchCreateResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchCreateResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteNotificationMasksRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteNotificationMasksResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteOneClickAlarmsRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteOneClickAlarmsResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourceGroupsRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourceGroupsResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchEnableAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchEnableAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMaskTimeRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMaskTimeResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMasksRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMasksResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateOneClickAlarmPoliciesEnabledStateRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateOneClickAlarmPoliciesEnabledStateResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateOneClickAlarmsEnabledStateRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateOneClickAlarmsEnabledStateResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateDashboardWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateDashboardWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateOneClickAlarmRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateOneClickAlarmResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateOneDashboardRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateOneDashboardResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteDashboardsRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteDashboardsResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteOneWidgetRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteOneWidgetResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAgentDimensionInfoRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAgentDimensionInfoResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmHistoriesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmHistoriesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulePoliciesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulePoliciesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplateAssociationAlarmsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplateAssociationAlarmsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListCesTargetProjectTagsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListCesTargetProjectTagsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardInfosRequest;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardInfosResponse;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMaskResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMaskResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMasksRequest;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMasksResponse;
import com.huaweicloud.sdk.ces.v2.model.ListOneClickAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListOneClickAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListOneClickAlarmsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListOneClickAlarmsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsServicesResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsServicesResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowWidgetRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowWidgetResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmNotificationsRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmNotificationsResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateDashboardRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateDashboardResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateNotificationMaskRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateNotificationMaskResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateOneClickAlarmNotificationsRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateOneClickAlarmNotificationsResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupAssociationAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupAssociationAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CesClient {

    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        ClientBuilder<CesClient> clientBuilder = new ClientBuilder<>(CesClient::new);
        return clientBuilder;
    }

    /**
     * 批量增加告警规则资源
     *
     * 批量增加告警规则资源(资源分组类型的告警规则不支持)，资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAlarmRuleResourcesRequest 请求对象
     * @return AddAlarmRuleResourcesResponse
     */
    public AddAlarmRuleResourcesResponse addAlarmRuleResources(AddAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.addAlarmRuleResources);
    }

    /**
     * 批量增加告警规则资源
     *
     * 批量增加告警规则资源(资源分组类型的告警规则不支持)，资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAlarmRuleResourcesRequest 请求对象
     * @return SyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse>
     */
    public SyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> addAlarmRuleResourcesInvoker(
        AddAlarmRuleResourcesRequest request) {
        return new SyncInvoker<>(request, CesMeta.addAlarmRuleResources, hcClient);
    }

    /**
     * 自定义资源分组批量增加关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量增加关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourcesRequest 请求对象
     * @return BatchCreateResourcesResponse
     */
    public BatchCreateResourcesResponse batchCreateResources(BatchCreateResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchCreateResources);
    }

    /**
     * 自定义资源分组批量增加关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量增加关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourcesRequest 请求对象
     * @return SyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse>
     */
    public SyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse> batchCreateResourcesInvoker(
        BatchCreateResourcesRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchCreateResources, hcClient);
    }

    /**
     * 批量删除告警规则
     *
     * 批量删除告警规则V2接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlarmRulesRequest 请求对象
     * @return BatchDeleteAlarmRulesResponse
     */
    public BatchDeleteAlarmRulesResponse batchDeleteAlarmRules(BatchDeleteAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteAlarmRules);
    }

    /**
     * 批量删除告警规则
     *
     * 批量删除告警规则V2接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlarmRulesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse>
     */
    public SyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesInvoker(
        BatchDeleteAlarmRulesRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchDeleteAlarmRules, hcClient);
    }

    /**
     * 批量删除自定义告警模板
     *
     * 批量删除自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlarmTemplatesRequest 请求对象
     * @return BatchDeleteAlarmTemplatesResponse
     */
    public BatchDeleteAlarmTemplatesResponse batchDeleteAlarmTemplates(BatchDeleteAlarmTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteAlarmTemplates);
    }

    /**
     * 批量删除自定义告警模板
     *
     * 批量删除自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlarmTemplatesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse>
     */
    public SyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> batchDeleteAlarmTemplatesInvoker(
        BatchDeleteAlarmTemplatesRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchDeleteAlarmTemplates, hcClient);
    }

    /**
     * 批量删除告警通知屏蔽规则
     *
     * 批量删除告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteNotificationMasksRequest 请求对象
     * @return BatchDeleteNotificationMasksResponse
     */
    public BatchDeleteNotificationMasksResponse batchDeleteNotificationMasks(
        BatchDeleteNotificationMasksRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteNotificationMasks);
    }

    /**
     * 批量删除告警通知屏蔽规则
     *
     * 批量删除告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteNotificationMasksRequest 请求对象
     * @return SyncInvoker<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse>
     */
    public SyncInvoker<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse> batchDeleteNotificationMasksInvoker(
        BatchDeleteNotificationMasksRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchDeleteNotificationMasks, hcClient);
    }

    /**
     * 批量删除一键告警
     *
     * 批量删除一键告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOneClickAlarmsRequest 请求对象
     * @return BatchDeleteOneClickAlarmsResponse
     */
    public BatchDeleteOneClickAlarmsResponse batchDeleteOneClickAlarms(BatchDeleteOneClickAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteOneClickAlarms);
    }

    /**
     * 批量删除一键告警
     *
     * 批量删除一键告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOneClickAlarmsRequest 请求对象
     * @return SyncInvoker<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse>
     */
    public SyncInvoker<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse> batchDeleteOneClickAlarmsInvoker(
        BatchDeleteOneClickAlarmsRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchDeleteOneClickAlarms, hcClient);
    }

    /**
     * 批量删除资源分组
     *
     * 批量删除资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceGroupsRequest 请求对象
     * @return BatchDeleteResourceGroupsResponse
     */
    public BatchDeleteResourceGroupsResponse batchDeleteResourceGroups(BatchDeleteResourceGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteResourceGroups);
    }

    /**
     * 批量删除资源分组
     *
     * 批量删除资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceGroupsRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse>
     */
    public SyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> batchDeleteResourceGroupsInvoker(
        BatchDeleteResourceGroupsRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchDeleteResourceGroups, hcClient);
    }

    /**
     * 自定义资源分组批量删除关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量删除关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourcesRequest 请求对象
     * @return BatchDeleteResourcesResponse
     */
    public BatchDeleteResourcesResponse batchDeleteResources(BatchDeleteResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteResources);
    }

    /**
     * 自定义资源分组批量删除关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量删除关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourcesRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse>
     */
    public SyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> batchDeleteResourcesInvoker(
        BatchDeleteResourcesRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchDeleteResources, hcClient);
    }

    /**
     * 批量启停告警规则
     *
     * 批量启停告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAlarmRulesRequest 请求对象
     * @return BatchEnableAlarmRulesResponse
     */
    public BatchEnableAlarmRulesResponse batchEnableAlarmRules(BatchEnableAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchEnableAlarmRules);
    }

    /**
     * 批量启停告警规则
     *
     * 批量启停告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAlarmRulesRequest 请求对象
     * @return SyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse>
     */
    public SyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> batchEnableAlarmRulesInvoker(
        BatchEnableAlarmRulesRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchEnableAlarmRules, hcClient);
    }

    /**
     * 批量修改告警通知屏蔽规则的屏蔽时间
     *
     * 批量修改告警通知屏蔽规则的屏蔽时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNotificationMaskTimeRequest 请求对象
     * @return BatchUpdateNotificationMaskTimeResponse
     */
    public BatchUpdateNotificationMaskTimeResponse batchUpdateNotificationMaskTime(
        BatchUpdateNotificationMaskTimeRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchUpdateNotificationMaskTime);
    }

    /**
     * 批量修改告警通知屏蔽规则的屏蔽时间
     *
     * 批量修改告警通知屏蔽规则的屏蔽时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNotificationMaskTimeRequest 请求对象
     * @return SyncInvoker<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse>
     */
    public SyncInvoker<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse> batchUpdateNotificationMaskTimeInvoker(
        BatchUpdateNotificationMaskTimeRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchUpdateNotificationMaskTime, hcClient);
    }

    /**
     * 批量设置告警通知屏蔽规则
     *
     * 批量设置告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNotificationMasksRequest 请求对象
     * @return BatchUpdateNotificationMasksResponse
     */
    public BatchUpdateNotificationMasksResponse batchUpdateNotificationMasks(
        BatchUpdateNotificationMasksRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchUpdateNotificationMasks);
    }

    /**
     * 批量设置告警通知屏蔽规则
     *
     * 批量设置告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNotificationMasksRequest 请求对象
     * @return SyncInvoker<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse>
     */
    public SyncInvoker<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse> batchUpdateNotificationMasksInvoker(
        BatchUpdateNotificationMasksRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchUpdateNotificationMasks, hcClient);
    }

    /**
     * 批量修改一键告警关联告警规则策略的启用状态
     *
     * 批量修改一键告警关联告警规则策略的启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateOneClickAlarmPoliciesEnabledStateRequest 请求对象
     * @return BatchUpdateOneClickAlarmPoliciesEnabledStateResponse
     */
    public BatchUpdateOneClickAlarmPoliciesEnabledStateResponse batchUpdateOneClickAlarmPoliciesEnabledState(
        BatchUpdateOneClickAlarmPoliciesEnabledStateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchUpdateOneClickAlarmPoliciesEnabledState);
    }

    /**
     * 批量修改一键告警关联告警规则策略的启用状态
     *
     * 批量修改一键告警关联告警规则策略的启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateOneClickAlarmPoliciesEnabledStateRequest 请求对象
     * @return SyncInvoker<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse>
     */
    public SyncInvoker<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse> batchUpdateOneClickAlarmPoliciesEnabledStateInvoker(
        BatchUpdateOneClickAlarmPoliciesEnabledStateRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchUpdateOneClickAlarmPoliciesEnabledState, hcClient);
    }

    /**
     * 批量修改一键告警关联告警规则的启用状态
     *
     * 批量修改一键告警关联告警规则的启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateOneClickAlarmsEnabledStateRequest 请求对象
     * @return BatchUpdateOneClickAlarmsEnabledStateResponse
     */
    public BatchUpdateOneClickAlarmsEnabledStateResponse batchUpdateOneClickAlarmsEnabledState(
        BatchUpdateOneClickAlarmsEnabledStateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchUpdateOneClickAlarmsEnabledState);
    }

    /**
     * 批量修改一键告警关联告警规则的启用状态
     *
     * 批量修改一键告警关联告警规则的启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateOneClickAlarmsEnabledStateRequest 请求对象
     * @return SyncInvoker<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse>
     */
    public SyncInvoker<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse> batchUpdateOneClickAlarmsEnabledStateInvoker(
        BatchUpdateOneClickAlarmsEnabledStateRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchUpdateOneClickAlarmsEnabledState, hcClient);
    }

    /**
     * 批量更新监控视图
     *
     * 批量更新监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateWidgetsRequest 请求对象
     * @return BatchUpdateWidgetsResponse
     */
    public BatchUpdateWidgetsResponse batchUpdateWidgets(BatchUpdateWidgetsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchUpdateWidgets);
    }

    /**
     * 批量更新监控视图
     *
     * 批量更新监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateWidgetsRequest 请求对象
     * @return SyncInvoker<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse>
     */
    public SyncInvoker<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse> batchUpdateWidgetsInvoker(
        BatchUpdateWidgetsRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchUpdateWidgets, hcClient);
    }

    /**
     * 创建告警规则（推荐）
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmRulesRequest 请求对象
     * @return CreateAlarmRulesResponse
     */
    public CreateAlarmRulesResponse createAlarmRules(CreateAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarmRules);
    }

    /**
     * 创建告警规则（推荐）
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmRulesRequest 请求对象
     * @return SyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse>
     */
    public SyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse> createAlarmRulesInvoker(
        CreateAlarmRulesRequest request) {
        return new SyncInvoker<>(request, CesMeta.createAlarmRules, hcClient);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmTemplateRequest 请求对象
     * @return CreateAlarmTemplateResponse
     */
    public CreateAlarmTemplateResponse createAlarmTemplate(CreateAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarmTemplate);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmTemplateRequest 请求对象
     * @return SyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>
     */
    public SyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplateInvoker(
        CreateAlarmTemplateRequest request) {
        return new SyncInvoker<>(request, CesMeta.createAlarmTemplate, hcClient);
    }

    /**
     * 创建/复制/批量创建监控视图到指定的监控看板
     *
     * 创建/复制/批量创建监控视图到指定的监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDashboardWidgetsRequest 请求对象
     * @return CreateDashboardWidgetsResponse
     */
    public CreateDashboardWidgetsResponse createDashboardWidgets(CreateDashboardWidgetsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createDashboardWidgets);
    }

    /**
     * 创建/复制/批量创建监控视图到指定的监控看板
     *
     * 创建/复制/批量创建监控视图到指定的监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDashboardWidgetsRequest 请求对象
     * @return SyncInvoker<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse>
     */
    public SyncInvoker<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse> createDashboardWidgetsInvoker(
        CreateDashboardWidgetsRequest request) {
        return new SyncInvoker<>(request, CesMeta.createDashboardWidgets, hcClient);
    }

    /**
     * 创建一键告警
     *
     * 创建一键告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOneClickAlarmRequest 请求对象
     * @return CreateOneClickAlarmResponse
     */
    public CreateOneClickAlarmResponse createOneClickAlarm(CreateOneClickAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createOneClickAlarm);
    }

    /**
     * 创建一键告警
     *
     * 创建一键告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOneClickAlarmRequest 请求对象
     * @return SyncInvoker<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse>
     */
    public SyncInvoker<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse> createOneClickAlarmInvoker(
        CreateOneClickAlarmRequest request) {
        return new SyncInvoker<>(request, CesMeta.createOneClickAlarm, hcClient);
    }

    /**
     * 创建/复制监控看板
     *
     * 创建/复制监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOneDashboardRequest 请求对象
     * @return CreateOneDashboardResponse
     */
    public CreateOneDashboardResponse createOneDashboard(CreateOneDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createOneDashboard);
    }

    /**
     * 创建/复制监控看板
     *
     * 创建/复制监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOneDashboardRequest 请求对象
     * @return SyncInvoker<CreateOneDashboardRequest, CreateOneDashboardResponse>
     */
    public SyncInvoker<CreateOneDashboardRequest, CreateOneDashboardResponse> createOneDashboardInvoker(
        CreateOneDashboardRequest request) {
        return new SyncInvoker<>(request, CesMeta.createOneDashboard, hcClient);
    }

    /**
     * 创建资源分组（推荐）
     *
     * 创建资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createResourceGroup);
    }

    /**
     * 创建资源分组（推荐）
     *
     * 创建资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>
     */
    public SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupInvoker(
        CreateResourceGroupRequest request) {
        return new SyncInvoker<>(request, CesMeta.createResourceGroup, hcClient);
    }

    /**
     * 批量删除告警规则资源
     *
     * 批量删除告警规则资源（资源分组类型的告警规则不支持），资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRuleResourcesRequest 请求对象
     * @return DeleteAlarmRuleResourcesResponse
     */
    public DeleteAlarmRuleResourcesResponse deleteAlarmRuleResources(DeleteAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarmRuleResources);
    }

    /**
     * 批量删除告警规则资源
     *
     * 批量删除告警规则资源（资源分组类型的告警规则不支持），资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRuleResourcesRequest 请求对象
     * @return SyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse>
     */
    public SyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesInvoker(
        DeleteAlarmRuleResourcesRequest request) {
        return new SyncInvoker<>(request, CesMeta.deleteAlarmRuleResources, hcClient);
    }

    /**
     * 批量删除监控看板
     *
     * 批量删除监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDashboardsRequest 请求对象
     * @return DeleteDashboardsResponse
     */
    public DeleteDashboardsResponse deleteDashboards(DeleteDashboardsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteDashboards);
    }

    /**
     * 批量删除监控看板
     *
     * 批量删除监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDashboardsRequest 请求对象
     * @return SyncInvoker<DeleteDashboardsRequest, DeleteDashboardsResponse>
     */
    public SyncInvoker<DeleteDashboardsRequest, DeleteDashboardsResponse> deleteDashboardsInvoker(
        DeleteDashboardsRequest request) {
        return new SyncInvoker<>(request, CesMeta.deleteDashboards, hcClient);
    }

    /**
     * 删除指定监控视图
     *
     * 删除指定监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOneWidgetRequest 请求对象
     * @return DeleteOneWidgetResponse
     */
    public DeleteOneWidgetResponse deleteOneWidget(DeleteOneWidgetRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteOneWidget);
    }

    /**
     * 删除指定监控视图
     *
     * 删除指定监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOneWidgetRequest 请求对象
     * @return SyncInvoker<DeleteOneWidgetRequest, DeleteOneWidgetResponse>
     */
    public SyncInvoker<DeleteOneWidgetRequest, DeleteOneWidgetResponse> deleteOneWidgetInvoker(
        DeleteOneWidgetRequest request) {
        return new SyncInvoker<>(request, CesMeta.deleteOneWidget, hcClient);
    }

    /**
     * 查询主机监控维度指标信息
     *
     * 根据ECS/BMS资源ID查询磁盘、挂载点、进程、显卡、RAID控制器维度指标信息；维度NPU已经为原始值，不需要调用该接口进行额外查询获取指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentDimensionInfoRequest 请求对象
     * @return ListAgentDimensionInfoResponse
     */
    public ListAgentDimensionInfoResponse listAgentDimensionInfo(ListAgentDimensionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAgentDimensionInfo);
    }

    /**
     * 查询主机监控维度指标信息
     *
     * 根据ECS/BMS资源ID查询磁盘、挂载点、进程、显卡、RAID控制器维度指标信息；维度NPU已经为原始值，不需要调用该接口进行额外查询获取指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentDimensionInfoRequest 请求对象
     * @return SyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse>
     */
    public SyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> listAgentDimensionInfoInvoker(
        ListAgentDimensionInfoRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAgentDimensionInfo, hcClient);
    }

    /**
     * 查询告警记录列表
     *
     * 查询告警记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHistoriesRequest 请求对象
     * @return ListAlarmHistoriesResponse
     */
    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /**
     * 查询告警记录列表
     *
     * 查询告警记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHistoriesRequest 请求对象
     * @return SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>
     */
    public SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesInvoker(
        ListAlarmHistoriesRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAlarmHistories, hcClient);
    }

    /**
     * 查询告警规则策略列表
     *
     * 根据告警规则ID查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulePoliciesRequest 请求对象
     * @return ListAlarmRulePoliciesResponse
     */
    public ListAlarmRulePoliciesResponse listAlarmRulePolicies(ListAlarmRulePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRulePolicies);
    }

    /**
     * 查询告警规则策略列表
     *
     * 根据告警规则ID查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulePoliciesRequest 请求对象
     * @return SyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse>
     */
    public SyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> listAlarmRulePoliciesInvoker(
        ListAlarmRulePoliciesRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAlarmRulePolicies, hcClient);
    }

    /**
     * 查询告警规则资源列表
     *
     * 根据告警规则ID查询告警规则资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRuleResourcesRequest 请求对象
     * @return ListAlarmRuleResourcesResponse
     */
    public ListAlarmRuleResourcesResponse listAlarmRuleResources(ListAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRuleResources);
    }

    /**
     * 查询告警规则资源列表
     *
     * 根据告警规则ID查询告警规则资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRuleResourcesRequest 请求对象
     * @return SyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse>
     */
    public SyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> listAlarmRuleResourcesInvoker(
        ListAlarmRuleResourcesRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAlarmRuleResources, hcClient);
    }

    /**
     * 查询告警规则列表（推荐）
     *
     * 查询告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulesRequest 请求对象
     * @return ListAlarmRulesResponse
     */
    public ListAlarmRulesResponse listAlarmRules(ListAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRules);
    }

    /**
     * 查询告警规则列表（推荐）
     *
     * 查询告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulesRequest 请求对象
     * @return SyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse>
     */
    public SyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRulesInvoker(
        ListAlarmRulesRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAlarmRules, hcClient);
    }

    /**
     * 查询告警模板关联的告警规则列表
     *
     * 查询告警模板关联的告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplateAssociationAlarmsRequest 请求对象
     * @return ListAlarmTemplateAssociationAlarmsResponse
     */
    public ListAlarmTemplateAssociationAlarmsResponse listAlarmTemplateAssociationAlarms(
        ListAlarmTemplateAssociationAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmTemplateAssociationAlarms);
    }

    /**
     * 查询告警模板关联的告警规则列表
     *
     * 查询告警模板关联的告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplateAssociationAlarmsRequest 请求对象
     * @return SyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse>
     */
    public SyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> listAlarmTemplateAssociationAlarmsInvoker(
        ListAlarmTemplateAssociationAlarmsRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAlarmTemplateAssociationAlarms, hcClient);
    }

    /**
     * 查询告警模板列表
     *
     * 查询告警模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplatesRequest 请求对象
     * @return ListAlarmTemplatesResponse
     */
    public ListAlarmTemplatesResponse listAlarmTemplates(ListAlarmTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmTemplates);
    }

    /**
     * 查询告警模板列表
     *
     * 查询告警模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplatesRequest 请求对象
     * @return SyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>
     */
    public SyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplatesInvoker(
        ListAlarmTemplatesRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAlarmTemplates, hcClient);
    }

    /**
     * 查询CES指定项目指定资源类型标签列表
     *
     * 查询CES指定项目指定资源类型标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCesTargetProjectTagsRequest 请求对象
     * @return ListCesTargetProjectTagsResponse
     */
    public ListCesTargetProjectTagsResponse listCesTargetProjectTags(ListCesTargetProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listCesTargetProjectTags);
    }

    /**
     * 查询CES指定项目指定资源类型标签列表
     *
     * 查询CES指定项目指定资源类型标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCesTargetProjectTagsRequest 请求对象
     * @return SyncInvoker<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse>
     */
    public SyncInvoker<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse> listCesTargetProjectTagsInvoker(
        ListCesTargetProjectTagsRequest request) {
        return new SyncInvoker<>(request, CesMeta.listCesTargetProjectTags, hcClient);
    }

    /**
     * 查询监控看板列表
     *
     * 查询监控看板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDashboardInfosRequest 请求对象
     * @return ListDashboardInfosResponse
     */
    public ListDashboardInfosResponse listDashboardInfos(ListDashboardInfosRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listDashboardInfos);
    }

    /**
     * 查询监控看板列表
     *
     * 查询监控看板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDashboardInfosRequest 请求对象
     * @return SyncInvoker<ListDashboardInfosRequest, ListDashboardInfosResponse>
     */
    public SyncInvoker<ListDashboardInfosRequest, ListDashboardInfosResponse> listDashboardInfosInvoker(
        ListDashboardInfosRequest request) {
        return new SyncInvoker<>(request, CesMeta.listDashboardInfos, hcClient);
    }

    /**
     * 查询指定监控看板下的监控视图列表
     *
     * 查询指定监控看板下的监控视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDashboardWidgetsRequest 请求对象
     * @return ListDashboardWidgetsResponse
     */
    public ListDashboardWidgetsResponse listDashboardWidgets(ListDashboardWidgetsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listDashboardWidgets);
    }

    /**
     * 查询指定监控看板下的监控视图列表
     *
     * 查询指定监控看板下的监控视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDashboardWidgetsRequest 请求对象
     * @return SyncInvoker<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse>
     */
    public SyncInvoker<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse> listDashboardWidgetsInvoker(
        ListDashboardWidgetsRequest request) {
        return new SyncInvoker<>(request, CesMeta.listDashboardWidgets, hcClient);
    }

    /**
     * 查询告警通知屏蔽资源列表
     *
     * 查询告警通知屏蔽资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationMaskResourcesRequest 请求对象
     * @return ListNotificationMaskResourcesResponse
     */
    public ListNotificationMaskResourcesResponse listNotificationMaskResources(
        ListNotificationMaskResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listNotificationMaskResources);
    }

    /**
     * 查询告警通知屏蔽资源列表
     *
     * 查询告警通知屏蔽资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationMaskResourcesRequest 请求对象
     * @return SyncInvoker<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse>
     */
    public SyncInvoker<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse> listNotificationMaskResourcesInvoker(
        ListNotificationMaskResourcesRequest request) {
        return new SyncInvoker<>(request, CesMeta.listNotificationMaskResources, hcClient);
    }

    /**
     * 查询告警通知屏蔽列表
     *
     * 批量查询指定类型的通知屏蔽规则，目前最多支持100个通知屏蔽规则的批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationMasksRequest 请求对象
     * @return ListNotificationMasksResponse
     */
    public ListNotificationMasksResponse listNotificationMasks(ListNotificationMasksRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listNotificationMasks);
    }

    /**
     * 查询告警通知屏蔽列表
     *
     * 批量查询指定类型的通知屏蔽规则，目前最多支持100个通知屏蔽规则的批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationMasksRequest 请求对象
     * @return SyncInvoker<ListNotificationMasksRequest, ListNotificationMasksResponse>
     */
    public SyncInvoker<ListNotificationMasksRequest, ListNotificationMasksResponse> listNotificationMasksInvoker(
        ListNotificationMasksRequest request) {
        return new SyncInvoker<>(request, CesMeta.listNotificationMasks, hcClient);
    }

    /**
     * 查询一键告警关联告警规则列表
     *
     * 查询一键告警关联告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOneClickAlarmRulesRequest 请求对象
     * @return ListOneClickAlarmRulesResponse
     */
    public ListOneClickAlarmRulesResponse listOneClickAlarmRules(ListOneClickAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listOneClickAlarmRules);
    }

    /**
     * 查询一键告警关联告警规则列表
     *
     * 查询一键告警关联告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOneClickAlarmRulesRequest 请求对象
     * @return SyncInvoker<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse>
     */
    public SyncInvoker<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse> listOneClickAlarmRulesInvoker(
        ListOneClickAlarmRulesRequest request) {
        return new SyncInvoker<>(request, CesMeta.listOneClickAlarmRules, hcClient);
    }

    /**
     * 查询一键告警列表
     *
     * 查询一键告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOneClickAlarmsRequest 请求对象
     * @return ListOneClickAlarmsResponse
     */
    public ListOneClickAlarmsResponse listOneClickAlarms(ListOneClickAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listOneClickAlarms);
    }

    /**
     * 查询一键告警列表
     *
     * 查询一键告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOneClickAlarmsRequest 请求对象
     * @return SyncInvoker<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse>
     */
    public SyncInvoker<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse> listOneClickAlarmsInvoker(
        ListOneClickAlarmsRequest request) {
        return new SyncInvoker<>(request, CesMeta.listOneClickAlarms, hcClient);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsRequest 请求对象
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listResourceGroups);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsRequest 请求对象
     * @return SyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse>
     */
    public SyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse> listResourceGroupsInvoker(
        ListResourceGroupsRequest request) {
        return new SyncInvoker<>(request, CesMeta.listResourceGroups, hcClient);
    }

    /**
     * 查询资源分组下指定服务类别特定维度的资源列表
     *
     * 查询资源分组下指定服务类别特定维度的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsServicesResourcesRequest 请求对象
     * @return ListResourceGroupsServicesResourcesResponse
     */
    public ListResourceGroupsServicesResourcesResponse listResourceGroupsServicesResources(
        ListResourceGroupsServicesResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listResourceGroupsServicesResources);
    }

    /**
     * 查询资源分组下指定服务类别特定维度的资源列表
     *
     * 查询资源分组下指定服务类别特定维度的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsServicesResourcesRequest 请求对象
     * @return SyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse>
     */
    public SyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> listResourceGroupsServicesResourcesInvoker(
        ListResourceGroupsServicesResourcesRequest request) {
        return new SyncInvoker<>(request, CesMeta.listResourceGroupsServicesResources, hcClient);
    }

    /**
     * 查询告警模板详情
     *
     * 查询告警模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmTemplateRequest 请求对象
     * @return ShowAlarmTemplateResponse
     */
    public ShowAlarmTemplateResponse showAlarmTemplate(ShowAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showAlarmTemplate);
    }

    /**
     * 查询告警模板详情
     *
     * 查询告警模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmTemplateRequest 请求对象
     * @return SyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse>
     */
    public SyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> showAlarmTemplateInvoker(
        ShowAlarmTemplateRequest request) {
        return new SyncInvoker<>(request, CesMeta.showAlarmTemplate, hcClient);
    }

    /**
     * 查询指定资源分组详情
     *
     * 查询指定资源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return ShowResourceGroupResponse
     */
    public ShowResourceGroupResponse showResourceGroup(ShowResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    /**
     * 查询指定资源分组详情
     *
     * 查询指定资源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>
     */
    public SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupInvoker(
        ShowResourceGroupRequest request) {
        return new SyncInvoker<>(request, CesMeta.showResourceGroup, hcClient);
    }

    /**
     * 查询指定监控视图信息
     *
     * 查询指定监控视图信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWidgetRequest 请求对象
     * @return ShowWidgetResponse
     */
    public ShowWidgetResponse showWidget(ShowWidgetRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showWidget);
    }

    /**
     * 查询指定监控视图信息
     *
     * 查询指定监控视图信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWidgetRequest 请求对象
     * @return SyncInvoker<ShowWidgetRequest, ShowWidgetResponse>
     */
    public SyncInvoker<ShowWidgetRequest, ShowWidgetResponse> showWidgetInvoker(ShowWidgetRequest request) {
        return new SyncInvoker<>(request, CesMeta.showWidget, hcClient);
    }

    /**
     * 修改告警规则告警通知信息
     *
     * 修改告警规则告警通知信息，告警策略&amp;资源请使用对应接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmNotificationsRequest 请求对象
     * @return UpdateAlarmNotificationsResponse
     */
    public UpdateAlarmNotificationsResponse updateAlarmNotifications(UpdateAlarmNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmNotifications);
    }

    /**
     * 修改告警规则告警通知信息
     *
     * 修改告警规则告警通知信息，告警策略&amp;资源请使用对应接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmNotificationsRequest 请求对象
     * @return SyncInvoker<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse>
     */
    public SyncInvoker<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse> updateAlarmNotificationsInvoker(
        UpdateAlarmNotificationsRequest request) {
        return new SyncInvoker<>(request, CesMeta.updateAlarmNotifications, hcClient);
    }

    /**
     * 修改告警规则策略(全量修改)
     *
     * 修改告警规则策略(全量修改)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRulePoliciesRequest 请求对象
     * @return UpdateAlarmRulePoliciesResponse
     */
    public UpdateAlarmRulePoliciesResponse updateAlarmRulePolicies(UpdateAlarmRulePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmRulePolicies);
    }

    /**
     * 修改告警规则策略(全量修改)
     *
     * 修改告警规则策略(全量修改)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRulePoliciesRequest 请求对象
     * @return SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>
     */
    public SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesInvoker(
        UpdateAlarmRulePoliciesRequest request) {
        return new SyncInvoker<>(request, CesMeta.updateAlarmRulePolicies, hcClient);
    }

    /**
     * 修改自定义告警模板
     *
     * 修改自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmTemplateRequest 请求对象
     * @return UpdateAlarmTemplateResponse
     */
    public UpdateAlarmTemplateResponse updateAlarmTemplate(UpdateAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    /**
     * 修改自定义告警模板
     *
     * 修改自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmTemplateRequest 请求对象
     * @return SyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>
     */
    public SyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplateInvoker(
        UpdateAlarmTemplateRequest request) {
        return new SyncInvoker<>(request, CesMeta.updateAlarmTemplate, hcClient);
    }

    /**
     * 修改监控看板
     *
     * 修改监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDashboardRequest 请求对象
     * @return UpdateDashboardResponse
     */
    public UpdateDashboardResponse updateDashboard(UpdateDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateDashboard);
    }

    /**
     * 修改监控看板
     *
     * 修改监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDashboardRequest 请求对象
     * @return SyncInvoker<UpdateDashboardRequest, UpdateDashboardResponse>
     */
    public SyncInvoker<UpdateDashboardRequest, UpdateDashboardResponse> updateDashboardInvoker(
        UpdateDashboardRequest request) {
        return new SyncInvoker<>(request, CesMeta.updateDashboard, hcClient);
    }

    /**
     * 修改告警通知屏蔽规则
     *
     * 修改告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationMaskRequest 请求对象
     * @return UpdateNotificationMaskResponse
     */
    public UpdateNotificationMaskResponse updateNotificationMask(UpdateNotificationMaskRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateNotificationMask);
    }

    /**
     * 修改告警通知屏蔽规则
     *
     * 修改告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationMaskRequest 请求对象
     * @return SyncInvoker<UpdateNotificationMaskRequest, UpdateNotificationMaskResponse>
     */
    public SyncInvoker<UpdateNotificationMaskRequest, UpdateNotificationMaskResponse> updateNotificationMaskInvoker(
        UpdateNotificationMaskRequest request) {
        return new SyncInvoker<>(request, CesMeta.updateNotificationMask, hcClient);
    }

    /**
     * 批量修改开启状态的一键告警关联告警规则的告警通知
     *
     * 批量修改开启状态的一键告警关联告警规则的告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOneClickAlarmNotificationsRequest 请求对象
     * @return UpdateOneClickAlarmNotificationsResponse
     */
    public UpdateOneClickAlarmNotificationsResponse updateOneClickAlarmNotifications(
        UpdateOneClickAlarmNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateOneClickAlarmNotifications);
    }

    /**
     * 批量修改开启状态的一键告警关联告警规则的告警通知
     *
     * 批量修改开启状态的一键告警关联告警规则的告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOneClickAlarmNotificationsRequest 请求对象
     * @return SyncInvoker<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse>
     */
    public SyncInvoker<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse> updateOneClickAlarmNotificationsInvoker(
        UpdateOneClickAlarmNotificationsRequest request) {
        return new SyncInvoker<>(request, CesMeta.updateOneClickAlarmNotifications, hcClient);
    }

    /**
     * 修改资源分组
     *
     * 修改资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

    /**
     * 修改资源分组
     *
     * 修改资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>
     */
    public SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupInvoker(
        UpdateResourceGroupRequest request) {
        return new SyncInvoker<>(request, CesMeta.updateResourceGroup, hcClient);
    }

    /**
     * 资源分组异步关联自定义告警模板
     *
     * 提交资源分组批量关联自定义告警模板异步任务，由异步任务覆盖性创建告警规则。每个用户创建处于待执行状态的异步任务数量上限为100个，单个资源分组仅可有1个未完成的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupAssociationAlarmTemplateRequest 请求对象
     * @return UpdateResourceGroupAssociationAlarmTemplateResponse
     */
    public UpdateResourceGroupAssociationAlarmTemplateResponse updateResourceGroupAssociationAlarmTemplate(
        UpdateResourceGroupAssociationAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateResourceGroupAssociationAlarmTemplate);
    }

    /**
     * 资源分组异步关联自定义告警模板
     *
     * 提交资源分组批量关联自定义告警模板异步任务，由异步任务覆盖性创建告警规则。每个用户创建处于待执行状态的异步任务数量上限为100个，单个资源分组仅可有1个未完成的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupAssociationAlarmTemplateRequest 请求对象
     * @return SyncInvoker<UpdateResourceGroupAssociationAlarmTemplateRequest, UpdateResourceGroupAssociationAlarmTemplateResponse>
     */
    public SyncInvoker<UpdateResourceGroupAssociationAlarmTemplateRequest, UpdateResourceGroupAssociationAlarmTemplateResponse> updateResourceGroupAssociationAlarmTemplateInvoker(
        UpdateResourceGroupAssociationAlarmTemplateRequest request) {
        return new SyncInvoker<>(request, CesMeta.updateResourceGroupAssociationAlarmTemplate, hcClient);
    }

}
