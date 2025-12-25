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
import com.huaweicloud.sdk.ces.v2.model.BatchListSpecifiedMetricDataRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchListSpecifiedMetricDataResponse;
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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CesAsyncClient {

    protected HcClient hcClient;

    public CesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesAsyncClient> newBuilder() {
        ClientBuilder<CesAsyncClient> clientBuilder = new ClientBuilder<>(CesAsyncClient::new);
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
     * @return CompletableFuture<AddAlarmRuleResourcesResponse>
     */
    public CompletableFuture<AddAlarmRuleResourcesResponse> addAlarmRuleResourcesAsync(
        AddAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.addAlarmRuleResources);
    }

    /**
     * 批量增加告警规则资源
     *
     * 批量增加告警规则资源(资源分组类型的告警规则不支持)，资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAlarmRuleResourcesRequest 请求对象
     * @return AsyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse>
     */
    public AsyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> addAlarmRuleResourcesAsyncInvoker(
        AddAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.addAlarmRuleResources, hcClient);
    }

    /**
     * 自定义资源分组批量增加关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量增加关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourcesRequest 请求对象
     * @return CompletableFuture<BatchCreateResourcesResponse>
     */
    public CompletableFuture<BatchCreateResourcesResponse> batchCreateResourcesAsync(
        BatchCreateResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchCreateResources);
    }

    /**
     * 自定义资源分组批量增加关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量增加关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourcesRequest 请求对象
     * @return AsyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse>
     */
    public AsyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse> batchCreateResourcesAsyncInvoker(
        BatchCreateResourcesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchCreateResources, hcClient);
    }

    /**
     * 批量删除告警规则
     *
     * 批量删除告警规则V2接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlarmRulesRequest 请求对象
     * @return CompletableFuture<BatchDeleteAlarmRulesResponse>
     */
    public CompletableFuture<BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesAsync(
        BatchDeleteAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteAlarmRules);
    }

    /**
     * 批量删除告警规则
     *
     * 批量删除告警规则V2接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlarmRulesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse>
     */
    public AsyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesAsyncInvoker(
        BatchDeleteAlarmRulesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchDeleteAlarmRules, hcClient);
    }

    /**
     * 批量删除自定义告警模板
     *
     * 批量删除自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlarmTemplatesRequest 请求对象
     * @return CompletableFuture<BatchDeleteAlarmTemplatesResponse>
     */
    public CompletableFuture<BatchDeleteAlarmTemplatesResponse> batchDeleteAlarmTemplatesAsync(
        BatchDeleteAlarmTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteAlarmTemplates);
    }

    /**
     * 批量删除自定义告警模板
     *
     * 批量删除自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlarmTemplatesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse>
     */
    public AsyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> batchDeleteAlarmTemplatesAsyncInvoker(
        BatchDeleteAlarmTemplatesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchDeleteAlarmTemplates, hcClient);
    }

    /**
     * 批量删除告警通知屏蔽规则
     *
     * 批量删除告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteNotificationMasksRequest 请求对象
     * @return CompletableFuture<BatchDeleteNotificationMasksResponse>
     */
    public CompletableFuture<BatchDeleteNotificationMasksResponse> batchDeleteNotificationMasksAsync(
        BatchDeleteNotificationMasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteNotificationMasks);
    }

    /**
     * 批量删除告警通知屏蔽规则
     *
     * 批量删除告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteNotificationMasksRequest 请求对象
     * @return AsyncInvoker<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse>
     */
    public AsyncInvoker<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse> batchDeleteNotificationMasksAsyncInvoker(
        BatchDeleteNotificationMasksRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchDeleteNotificationMasks, hcClient);
    }

    /**
     * 批量删除一键告警
     *
     * 批量删除一键告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOneClickAlarmsRequest 请求对象
     * @return CompletableFuture<BatchDeleteOneClickAlarmsResponse>
     */
    public CompletableFuture<BatchDeleteOneClickAlarmsResponse> batchDeleteOneClickAlarmsAsync(
        BatchDeleteOneClickAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteOneClickAlarms);
    }

    /**
     * 批量删除一键告警
     *
     * 批量删除一键告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOneClickAlarmsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse>
     */
    public AsyncInvoker<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse> batchDeleteOneClickAlarmsAsyncInvoker(
        BatchDeleteOneClickAlarmsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchDeleteOneClickAlarms, hcClient);
    }

    /**
     * 批量删除资源分组
     *
     * 批量删除资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceGroupsRequest 请求对象
     * @return CompletableFuture<BatchDeleteResourceGroupsResponse>
     */
    public CompletableFuture<BatchDeleteResourceGroupsResponse> batchDeleteResourceGroupsAsync(
        BatchDeleteResourceGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteResourceGroups);
    }

    /**
     * 批量删除资源分组
     *
     * 批量删除资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceGroupsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse>
     */
    public AsyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> batchDeleteResourceGroupsAsyncInvoker(
        BatchDeleteResourceGroupsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchDeleteResourceGroups, hcClient);
    }

    /**
     * 自定义资源分组批量删除关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量删除关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourcesRequest 请求对象
     * @return CompletableFuture<BatchDeleteResourcesResponse>
     */
    public CompletableFuture<BatchDeleteResourcesResponse> batchDeleteResourcesAsync(
        BatchDeleteResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteResources);
    }

    /**
     * 自定义资源分组批量删除关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量删除关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourcesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse>
     */
    public AsyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> batchDeleteResourcesAsyncInvoker(
        BatchDeleteResourcesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchDeleteResources, hcClient);
    }

    /**
     * 批量启停告警规则
     *
     * 批量启停告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAlarmRulesRequest 请求对象
     * @return CompletableFuture<BatchEnableAlarmRulesResponse>
     */
    public CompletableFuture<BatchEnableAlarmRulesResponse> batchEnableAlarmRulesAsync(
        BatchEnableAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchEnableAlarmRules);
    }

    /**
     * 批量启停告警规则
     *
     * 批量启停告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAlarmRulesRequest 请求对象
     * @return AsyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse>
     */
    public AsyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> batchEnableAlarmRulesAsyncInvoker(
        BatchEnableAlarmRulesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchEnableAlarmRules, hcClient);
    }

    /**
     * 批量查询指标数据
     *
     * 批量查询指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListSpecifiedMetricDataRequest 请求对象
     * @return CompletableFuture<BatchListSpecifiedMetricDataResponse>
     */
    public CompletableFuture<BatchListSpecifiedMetricDataResponse> batchListSpecifiedMetricDataAsync(
        BatchListSpecifiedMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchListSpecifiedMetricData);
    }

    /**
     * 批量查询指标数据
     *
     * 批量查询指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListSpecifiedMetricDataRequest 请求对象
     * @return AsyncInvoker<BatchListSpecifiedMetricDataRequest, BatchListSpecifiedMetricDataResponse>
     */
    public AsyncInvoker<BatchListSpecifiedMetricDataRequest, BatchListSpecifiedMetricDataResponse> batchListSpecifiedMetricDataAsyncInvoker(
        BatchListSpecifiedMetricDataRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchListSpecifiedMetricData, hcClient);
    }

    /**
     * 批量修改告警通知屏蔽规则的屏蔽时间
     *
     * 批量修改告警通知屏蔽规则的屏蔽时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNotificationMaskTimeRequest 请求对象
     * @return CompletableFuture<BatchUpdateNotificationMaskTimeResponse>
     */
    public CompletableFuture<BatchUpdateNotificationMaskTimeResponse> batchUpdateNotificationMaskTimeAsync(
        BatchUpdateNotificationMaskTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchUpdateNotificationMaskTime);
    }

    /**
     * 批量修改告警通知屏蔽规则的屏蔽时间
     *
     * 批量修改告警通知屏蔽规则的屏蔽时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNotificationMaskTimeRequest 请求对象
     * @return AsyncInvoker<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse>
     */
    public AsyncInvoker<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse> batchUpdateNotificationMaskTimeAsyncInvoker(
        BatchUpdateNotificationMaskTimeRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchUpdateNotificationMaskTime, hcClient);
    }

    /**
     * 批量设置告警通知屏蔽规则
     *
     * 批量设置告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNotificationMasksRequest 请求对象
     * @return CompletableFuture<BatchUpdateNotificationMasksResponse>
     */
    public CompletableFuture<BatchUpdateNotificationMasksResponse> batchUpdateNotificationMasksAsync(
        BatchUpdateNotificationMasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchUpdateNotificationMasks);
    }

    /**
     * 批量设置告警通知屏蔽规则
     *
     * 批量设置告警通知屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNotificationMasksRequest 请求对象
     * @return AsyncInvoker<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse>
     */
    public AsyncInvoker<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse> batchUpdateNotificationMasksAsyncInvoker(
        BatchUpdateNotificationMasksRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchUpdateNotificationMasks, hcClient);
    }

    /**
     * 批量修改一键告警关联告警规则策略的启用状态
     *
     * 批量修改一键告警关联告警规则策略的启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateOneClickAlarmPoliciesEnabledStateRequest 请求对象
     * @return CompletableFuture<BatchUpdateOneClickAlarmPoliciesEnabledStateResponse>
     */
    public CompletableFuture<BatchUpdateOneClickAlarmPoliciesEnabledStateResponse> batchUpdateOneClickAlarmPoliciesEnabledStateAsync(
        BatchUpdateOneClickAlarmPoliciesEnabledStateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchUpdateOneClickAlarmPoliciesEnabledState);
    }

    /**
     * 批量修改一键告警关联告警规则策略的启用状态
     *
     * 批量修改一键告警关联告警规则策略的启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateOneClickAlarmPoliciesEnabledStateRequest 请求对象
     * @return AsyncInvoker<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse>
     */
    public AsyncInvoker<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse> batchUpdateOneClickAlarmPoliciesEnabledStateAsyncInvoker(
        BatchUpdateOneClickAlarmPoliciesEnabledStateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchUpdateOneClickAlarmPoliciesEnabledState, hcClient);
    }

    /**
     * 批量修改一键告警关联告警规则的启用状态
     *
     * 批量修改一键告警关联告警规则的启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateOneClickAlarmsEnabledStateRequest 请求对象
     * @return CompletableFuture<BatchUpdateOneClickAlarmsEnabledStateResponse>
     */
    public CompletableFuture<BatchUpdateOneClickAlarmsEnabledStateResponse> batchUpdateOneClickAlarmsEnabledStateAsync(
        BatchUpdateOneClickAlarmsEnabledStateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchUpdateOneClickAlarmsEnabledState);
    }

    /**
     * 批量修改一键告警关联告警规则的启用状态
     *
     * 批量修改一键告警关联告警规则的启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateOneClickAlarmsEnabledStateRequest 请求对象
     * @return AsyncInvoker<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse>
     */
    public AsyncInvoker<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse> batchUpdateOneClickAlarmsEnabledStateAsyncInvoker(
        BatchUpdateOneClickAlarmsEnabledStateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchUpdateOneClickAlarmsEnabledState, hcClient);
    }

    /**
     * 批量更新监控视图
     *
     * 批量更新监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateWidgetsRequest 请求对象
     * @return CompletableFuture<BatchUpdateWidgetsResponse>
     */
    public CompletableFuture<BatchUpdateWidgetsResponse> batchUpdateWidgetsAsync(BatchUpdateWidgetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchUpdateWidgets);
    }

    /**
     * 批量更新监控视图
     *
     * 批量更新监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateWidgetsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse>
     */
    public AsyncInvoker<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse> batchUpdateWidgetsAsyncInvoker(
        BatchUpdateWidgetsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchUpdateWidgets, hcClient);
    }

    /**
     * 创建告警规则（推荐）
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmRulesRequest 请求对象
     * @return CompletableFuture<CreateAlarmRulesResponse>
     */
    public CompletableFuture<CreateAlarmRulesResponse> createAlarmRulesAsync(CreateAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarmRules);
    }

    /**
     * 创建告警规则（推荐）
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmRulesRequest 请求对象
     * @return AsyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse>
     */
    public AsyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse> createAlarmRulesAsyncInvoker(
        CreateAlarmRulesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createAlarmRules, hcClient);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmTemplateRequest 请求对象
     * @return CompletableFuture<CreateAlarmTemplateResponse>
     */
    public CompletableFuture<CreateAlarmTemplateResponse> createAlarmTemplateAsync(CreateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarmTemplate);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>
     */
    public AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplateAsyncInvoker(
        CreateAlarmTemplateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createAlarmTemplate, hcClient);
    }

    /**
     * 创建/复制/批量创建监控视图到指定的监控看板
     *
     * 创建/复制/批量创建监控视图到指定的监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDashboardWidgetsRequest 请求对象
     * @return CompletableFuture<CreateDashboardWidgetsResponse>
     */
    public CompletableFuture<CreateDashboardWidgetsResponse> createDashboardWidgetsAsync(
        CreateDashboardWidgetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createDashboardWidgets);
    }

    /**
     * 创建/复制/批量创建监控视图到指定的监控看板
     *
     * 创建/复制/批量创建监控视图到指定的监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDashboardWidgetsRequest 请求对象
     * @return AsyncInvoker<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse>
     */
    public AsyncInvoker<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse> createDashboardWidgetsAsyncInvoker(
        CreateDashboardWidgetsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createDashboardWidgets, hcClient);
    }

    /**
     * 创建一键告警
     *
     * 创建一键告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOneClickAlarmRequest 请求对象
     * @return CompletableFuture<CreateOneClickAlarmResponse>
     */
    public CompletableFuture<CreateOneClickAlarmResponse> createOneClickAlarmAsync(CreateOneClickAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createOneClickAlarm);
    }

    /**
     * 创建一键告警
     *
     * 创建一键告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOneClickAlarmRequest 请求对象
     * @return AsyncInvoker<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse>
     */
    public AsyncInvoker<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse> createOneClickAlarmAsyncInvoker(
        CreateOneClickAlarmRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createOneClickAlarm, hcClient);
    }

    /**
     * 创建/复制监控看板
     *
     * 创建/复制监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOneDashboardRequest 请求对象
     * @return CompletableFuture<CreateOneDashboardResponse>
     */
    public CompletableFuture<CreateOneDashboardResponse> createOneDashboardAsync(CreateOneDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createOneDashboard);
    }

    /**
     * 创建/复制监控看板
     *
     * 创建/复制监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOneDashboardRequest 请求对象
     * @return AsyncInvoker<CreateOneDashboardRequest, CreateOneDashboardResponse>
     */
    public AsyncInvoker<CreateOneDashboardRequest, CreateOneDashboardResponse> createOneDashboardAsyncInvoker(
        CreateOneDashboardRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createOneDashboard, hcClient);
    }

    /**
     * 创建资源分组（推荐）
     *
     * 创建资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return CompletableFuture<CreateResourceGroupResponse>
     */
    public CompletableFuture<CreateResourceGroupResponse> createResourceGroupAsync(CreateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createResourceGroup);
    }

    /**
     * 创建资源分组（推荐）
     *
     * 创建资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>
     */
    public AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupAsyncInvoker(
        CreateResourceGroupRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createResourceGroup, hcClient);
    }

    /**
     * 批量删除告警规则资源
     *
     * 批量删除告警规则资源（资源分组类型的告警规则不支持），资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRuleResourcesRequest 请求对象
     * @return CompletableFuture<DeleteAlarmRuleResourcesResponse>
     */
    public CompletableFuture<DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesAsync(
        DeleteAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarmRuleResources);
    }

    /**
     * 批量删除告警规则资源
     *
     * 批量删除告警规则资源（资源分组类型的告警规则不支持），资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRuleResourcesRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse>
     */
    public AsyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesAsyncInvoker(
        DeleteAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.deleteAlarmRuleResources, hcClient);
    }

    /**
     * 批量删除监控看板
     *
     * 批量删除监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDashboardsRequest 请求对象
     * @return CompletableFuture<DeleteDashboardsResponse>
     */
    public CompletableFuture<DeleteDashboardsResponse> deleteDashboardsAsync(DeleteDashboardsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteDashboards);
    }

    /**
     * 批量删除监控看板
     *
     * 批量删除监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDashboardsRequest 请求对象
     * @return AsyncInvoker<DeleteDashboardsRequest, DeleteDashboardsResponse>
     */
    public AsyncInvoker<DeleteDashboardsRequest, DeleteDashboardsResponse> deleteDashboardsAsyncInvoker(
        DeleteDashboardsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.deleteDashboards, hcClient);
    }

    /**
     * 删除指定监控视图
     *
     * 删除指定监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOneWidgetRequest 请求对象
     * @return CompletableFuture<DeleteOneWidgetResponse>
     */
    public CompletableFuture<DeleteOneWidgetResponse> deleteOneWidgetAsync(DeleteOneWidgetRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteOneWidget);
    }

    /**
     * 删除指定监控视图
     *
     * 删除指定监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOneWidgetRequest 请求对象
     * @return AsyncInvoker<DeleteOneWidgetRequest, DeleteOneWidgetResponse>
     */
    public AsyncInvoker<DeleteOneWidgetRequest, DeleteOneWidgetResponse> deleteOneWidgetAsyncInvoker(
        DeleteOneWidgetRequest request) {
        return new AsyncInvoker<>(request, CesMeta.deleteOneWidget, hcClient);
    }

    /**
     * 查询主机监控原始维度值
     *
     * 根据ECS/BMS资源ID及特殊维度值(仅支持磁盘、挂载点、进程、显卡、RAID控制器)查询该特殊维度对应的原始维度值；其他维度无需调用该接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentDimensionInfoRequest 请求对象
     * @return CompletableFuture<ListAgentDimensionInfoResponse>
     */
    public CompletableFuture<ListAgentDimensionInfoResponse> listAgentDimensionInfoAsync(
        ListAgentDimensionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAgentDimensionInfo);
    }

    /**
     * 查询主机监控原始维度值
     *
     * 根据ECS/BMS资源ID及特殊维度值(仅支持磁盘、挂载点、进程、显卡、RAID控制器)查询该特殊维度对应的原始维度值；其他维度无需调用该接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentDimensionInfoRequest 请求对象
     * @return AsyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse>
     */
    public AsyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> listAgentDimensionInfoAsyncInvoker(
        ListAgentDimensionInfoRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAgentDimensionInfo, hcClient);
    }

    /**
     * 查询告警记录列表
     *
     * 查询告警记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHistoriesRequest 请求对象
     * @return CompletableFuture<ListAlarmHistoriesResponse>
     */
    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistoriesAsync(ListAlarmHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /**
     * 查询告警记录列表
     *
     * 查询告警记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>
     */
    public AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesAsyncInvoker(
        ListAlarmHistoriesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarmHistories, hcClient);
    }

    /**
     * 查询告警规则策略列表
     *
     * 根据告警规则ID查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulePoliciesRequest 请求对象
     * @return CompletableFuture<ListAlarmRulePoliciesResponse>
     */
    public CompletableFuture<ListAlarmRulePoliciesResponse> listAlarmRulePoliciesAsync(
        ListAlarmRulePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRulePolicies);
    }

    /**
     * 查询告警规则策略列表
     *
     * 根据告警规则ID查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulePoliciesRequest 请求对象
     * @return AsyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse>
     */
    public AsyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> listAlarmRulePoliciesAsyncInvoker(
        ListAlarmRulePoliciesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarmRulePolicies, hcClient);
    }

    /**
     * 查询告警规则资源列表
     *
     * 根据告警规则ID查询告警规则资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRuleResourcesRequest 请求对象
     * @return CompletableFuture<ListAlarmRuleResourcesResponse>
     */
    public CompletableFuture<ListAlarmRuleResourcesResponse> listAlarmRuleResourcesAsync(
        ListAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRuleResources);
    }

    /**
     * 查询告警规则资源列表
     *
     * 根据告警规则ID查询告警规则资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRuleResourcesRequest 请求对象
     * @return AsyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse>
     */
    public AsyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> listAlarmRuleResourcesAsyncInvoker(
        ListAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarmRuleResources, hcClient);
    }

    /**
     * 查询告警规则列表（推荐）
     *
     * 查询告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListAlarmRulesResponse>
     */
    public CompletableFuture<ListAlarmRulesResponse> listAlarmRulesAsync(ListAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRules);
    }

    /**
     * 查询告警规则列表（推荐）
     *
     * 查询告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse>
     */
    public AsyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRulesAsyncInvoker(
        ListAlarmRulesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarmRules, hcClient);
    }

    /**
     * 查询告警模板关联的告警规则列表
     *
     * 查询告警模板关联的告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplateAssociationAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmTemplateAssociationAlarmsResponse>
     */
    public CompletableFuture<ListAlarmTemplateAssociationAlarmsResponse> listAlarmTemplateAssociationAlarmsAsync(
        ListAlarmTemplateAssociationAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmTemplateAssociationAlarms);
    }

    /**
     * 查询告警模板关联的告警规则列表
     *
     * 查询告警模板关联的告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplateAssociationAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse>
     */
    public AsyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> listAlarmTemplateAssociationAlarmsAsyncInvoker(
        ListAlarmTemplateAssociationAlarmsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarmTemplateAssociationAlarms, hcClient);
    }

    /**
     * 查询告警模板列表
     *
     * 查询告警模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplatesRequest 请求对象
     * @return CompletableFuture<ListAlarmTemplatesResponse>
     */
    public CompletableFuture<ListAlarmTemplatesResponse> listAlarmTemplatesAsync(ListAlarmTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmTemplates);
    }

    /**
     * 查询告警模板列表
     *
     * 查询告警模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>
     */
    public AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplatesAsyncInvoker(
        ListAlarmTemplatesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarmTemplates, hcClient);
    }

    /**
     * 查询CES指定项目指定资源类型标签列表
     *
     * 查询CES指定项目指定资源类型标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCesTargetProjectTagsRequest 请求对象
     * @return CompletableFuture<ListCesTargetProjectTagsResponse>
     */
    public CompletableFuture<ListCesTargetProjectTagsResponse> listCesTargetProjectTagsAsync(
        ListCesTargetProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listCesTargetProjectTags);
    }

    /**
     * 查询CES指定项目指定资源类型标签列表
     *
     * 查询CES指定项目指定资源类型标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCesTargetProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse>
     */
    public AsyncInvoker<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse> listCesTargetProjectTagsAsyncInvoker(
        ListCesTargetProjectTagsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listCesTargetProjectTags, hcClient);
    }

    /**
     * 查询监控看板列表
     *
     * 查询监控看板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDashboardInfosRequest 请求对象
     * @return CompletableFuture<ListDashboardInfosResponse>
     */
    public CompletableFuture<ListDashboardInfosResponse> listDashboardInfosAsync(ListDashboardInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listDashboardInfos);
    }

    /**
     * 查询监控看板列表
     *
     * 查询监控看板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDashboardInfosRequest 请求对象
     * @return AsyncInvoker<ListDashboardInfosRequest, ListDashboardInfosResponse>
     */
    public AsyncInvoker<ListDashboardInfosRequest, ListDashboardInfosResponse> listDashboardInfosAsyncInvoker(
        ListDashboardInfosRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listDashboardInfos, hcClient);
    }

    /**
     * 查询指定监控看板下的监控视图列表
     *
     * 查询指定监控看板下的监控视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDashboardWidgetsRequest 请求对象
     * @return CompletableFuture<ListDashboardWidgetsResponse>
     */
    public CompletableFuture<ListDashboardWidgetsResponse> listDashboardWidgetsAsync(
        ListDashboardWidgetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listDashboardWidgets);
    }

    /**
     * 查询指定监控看板下的监控视图列表
     *
     * 查询指定监控看板下的监控视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDashboardWidgetsRequest 请求对象
     * @return AsyncInvoker<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse>
     */
    public AsyncInvoker<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse> listDashboardWidgetsAsyncInvoker(
        ListDashboardWidgetsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listDashboardWidgets, hcClient);
    }

    /**
     * 查询告警通知屏蔽资源列表
     *
     * 查询告警通知屏蔽资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationMaskResourcesRequest 请求对象
     * @return CompletableFuture<ListNotificationMaskResourcesResponse>
     */
    public CompletableFuture<ListNotificationMaskResourcesResponse> listNotificationMaskResourcesAsync(
        ListNotificationMaskResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listNotificationMaskResources);
    }

    /**
     * 查询告警通知屏蔽资源列表
     *
     * 查询告警通知屏蔽资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationMaskResourcesRequest 请求对象
     * @return AsyncInvoker<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse>
     */
    public AsyncInvoker<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse> listNotificationMaskResourcesAsyncInvoker(
        ListNotificationMaskResourcesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listNotificationMaskResources, hcClient);
    }

    /**
     * 查询告警通知屏蔽列表
     *
     * 批量查询指定类型的通知屏蔽规则，目前最多支持100个通知屏蔽规则的批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationMasksRequest 请求对象
     * @return CompletableFuture<ListNotificationMasksResponse>
     */
    public CompletableFuture<ListNotificationMasksResponse> listNotificationMasksAsync(
        ListNotificationMasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listNotificationMasks);
    }

    /**
     * 查询告警通知屏蔽列表
     *
     * 批量查询指定类型的通知屏蔽规则，目前最多支持100个通知屏蔽规则的批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationMasksRequest 请求对象
     * @return AsyncInvoker<ListNotificationMasksRequest, ListNotificationMasksResponse>
     */
    public AsyncInvoker<ListNotificationMasksRequest, ListNotificationMasksResponse> listNotificationMasksAsyncInvoker(
        ListNotificationMasksRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listNotificationMasks, hcClient);
    }

    /**
     * 查询一键告警关联告警规则列表
     *
     * 查询一键告警关联告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOneClickAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListOneClickAlarmRulesResponse>
     */
    public CompletableFuture<ListOneClickAlarmRulesResponse> listOneClickAlarmRulesAsync(
        ListOneClickAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listOneClickAlarmRules);
    }

    /**
     * 查询一键告警关联告警规则列表
     *
     * 查询一键告警关联告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOneClickAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse>
     */
    public AsyncInvoker<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse> listOneClickAlarmRulesAsyncInvoker(
        ListOneClickAlarmRulesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listOneClickAlarmRules, hcClient);
    }

    /**
     * 查询一键告警列表
     *
     * 查询一键告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOneClickAlarmsRequest 请求对象
     * @return CompletableFuture<ListOneClickAlarmsResponse>
     */
    public CompletableFuture<ListOneClickAlarmsResponse> listOneClickAlarmsAsync(ListOneClickAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listOneClickAlarms);
    }

    /**
     * 查询一键告警列表
     *
     * 查询一键告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOneClickAlarmsRequest 请求对象
     * @return AsyncInvoker<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse>
     */
    public AsyncInvoker<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse> listOneClickAlarmsAsyncInvoker(
        ListOneClickAlarmsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listOneClickAlarms, hcClient);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsRequest 请求对象
     * @return CompletableFuture<ListResourceGroupsResponse>
     */
    public CompletableFuture<ListResourceGroupsResponse> listResourceGroupsAsync(ListResourceGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listResourceGroups);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsRequest 请求对象
     * @return AsyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse>
     */
    public AsyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse> listResourceGroupsAsyncInvoker(
        ListResourceGroupsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listResourceGroups, hcClient);
    }

    /**
     * 查询资源分组下指定服务类别特定维度的资源列表
     *
     * 查询资源分组下指定服务类别特定维度的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsServicesResourcesRequest 请求对象
     * @return CompletableFuture<ListResourceGroupsServicesResourcesResponse>
     */
    public CompletableFuture<ListResourceGroupsServicesResourcesResponse> listResourceGroupsServicesResourcesAsync(
        ListResourceGroupsServicesResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listResourceGroupsServicesResources);
    }

    /**
     * 查询资源分组下指定服务类别特定维度的资源列表
     *
     * 查询资源分组下指定服务类别特定维度的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupsServicesResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse>
     */
    public AsyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> listResourceGroupsServicesResourcesAsyncInvoker(
        ListResourceGroupsServicesResourcesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listResourceGroupsServicesResources, hcClient);
    }

    /**
     * 查询告警模板详情
     *
     * 查询告警模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmTemplateRequest 请求对象
     * @return CompletableFuture<ShowAlarmTemplateResponse>
     */
    public CompletableFuture<ShowAlarmTemplateResponse> showAlarmTemplateAsync(ShowAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showAlarmTemplate);
    }

    /**
     * 查询告警模板详情
     *
     * 查询告警模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse>
     */
    public AsyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> showAlarmTemplateAsyncInvoker(
        ShowAlarmTemplateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.showAlarmTemplate, hcClient);
    }

    /**
     * 查询指定资源分组详情
     *
     * 查询指定资源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return CompletableFuture<ShowResourceGroupResponse>
     */
    public CompletableFuture<ShowResourceGroupResponse> showResourceGroupAsync(ShowResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    /**
     * 查询指定资源分组详情
     *
     * 查询指定资源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>
     */
    public AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupAsyncInvoker(
        ShowResourceGroupRequest request) {
        return new AsyncInvoker<>(request, CesMeta.showResourceGroup, hcClient);
    }

    /**
     * 查询指定监控视图信息
     *
     * 查询指定监控视图信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWidgetRequest 请求对象
     * @return CompletableFuture<ShowWidgetResponse>
     */
    public CompletableFuture<ShowWidgetResponse> showWidgetAsync(ShowWidgetRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showWidget);
    }

    /**
     * 查询指定监控视图信息
     *
     * 查询指定监控视图信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWidgetRequest 请求对象
     * @return AsyncInvoker<ShowWidgetRequest, ShowWidgetResponse>
     */
    public AsyncInvoker<ShowWidgetRequest, ShowWidgetResponse> showWidgetAsyncInvoker(ShowWidgetRequest request) {
        return new AsyncInvoker<>(request, CesMeta.showWidget, hcClient);
    }

    /**
     * 修改告警规则告警通知信息
     *
     * 修改告警规则告警通知信息，告警策略&amp;资源请使用对应接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmNotificationsRequest 请求对象
     * @return CompletableFuture<UpdateAlarmNotificationsResponse>
     */
    public CompletableFuture<UpdateAlarmNotificationsResponse> updateAlarmNotificationsAsync(
        UpdateAlarmNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmNotifications);
    }

    /**
     * 修改告警规则告警通知信息
     *
     * 修改告警规则告警通知信息，告警策略&amp;资源请使用对应接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmNotificationsRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse>
     */
    public AsyncInvoker<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse> updateAlarmNotificationsAsyncInvoker(
        UpdateAlarmNotificationsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateAlarmNotifications, hcClient);
    }

    /**
     * 修改告警规则策略(全量修改)
     *
     * 修改告警规则策略(全量修改)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRulePoliciesRequest 请求对象
     * @return CompletableFuture<UpdateAlarmRulePoliciesResponse>
     */
    public CompletableFuture<UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesAsync(
        UpdateAlarmRulePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmRulePolicies);
    }

    /**
     * 修改告警规则策略(全量修改)
     *
     * 修改告警规则策略(全量修改)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRulePoliciesRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>
     */
    public AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesAsyncInvoker(
        UpdateAlarmRulePoliciesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateAlarmRulePolicies, hcClient);
    }

    /**
     * 修改自定义告警模板
     *
     * 修改自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmTemplateRequest 请求对象
     * @return CompletableFuture<UpdateAlarmTemplateResponse>
     */
    public CompletableFuture<UpdateAlarmTemplateResponse> updateAlarmTemplateAsync(UpdateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    /**
     * 修改自定义告警模板
     *
     * 修改自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>
     */
    public AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplateAsyncInvoker(
        UpdateAlarmTemplateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateAlarmTemplate, hcClient);
    }

    /**
     * 修改监控看板
     *
     * 修改监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDashboardRequest 请求对象
     * @return CompletableFuture<UpdateDashboardResponse>
     */
    public CompletableFuture<UpdateDashboardResponse> updateDashboardAsync(UpdateDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateDashboard);
    }

    /**
     * 修改监控看板
     *
     * 修改监控看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDashboardRequest 请求对象
     * @return AsyncInvoker<UpdateDashboardRequest, UpdateDashboardResponse>
     */
    public AsyncInvoker<UpdateDashboardRequest, UpdateDashboardResponse> updateDashboardAsyncInvoker(
        UpdateDashboardRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateDashboard, hcClient);
    }

    /**
     * 修改告警通知屏蔽规则
     *
     * 修改告警通知屏蔽规则。
     * 不能修改通过告警规则屏蔽的告警通知，只能修改通过资源屏蔽、策略屏蔽、事件屏蔽创建的告警屏蔽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationMaskRequest 请求对象
     * @return CompletableFuture<UpdateNotificationMaskResponse>
     */
    public CompletableFuture<UpdateNotificationMaskResponse> updateNotificationMaskAsync(
        UpdateNotificationMaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateNotificationMask);
    }

    /**
     * 修改告警通知屏蔽规则
     *
     * 修改告警通知屏蔽规则。
     * 不能修改通过告警规则屏蔽的告警通知，只能修改通过资源屏蔽、策略屏蔽、事件屏蔽创建的告警屏蔽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationMaskRequest 请求对象
     * @return AsyncInvoker<UpdateNotificationMaskRequest, UpdateNotificationMaskResponse>
     */
    public AsyncInvoker<UpdateNotificationMaskRequest, UpdateNotificationMaskResponse> updateNotificationMaskAsyncInvoker(
        UpdateNotificationMaskRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateNotificationMask, hcClient);
    }

    /**
     * 批量修改开启状态的一键告警关联告警规则的告警通知
     *
     * 批量修改开启状态的一键告警关联告警规则的告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOneClickAlarmNotificationsRequest 请求对象
     * @return CompletableFuture<UpdateOneClickAlarmNotificationsResponse>
     */
    public CompletableFuture<UpdateOneClickAlarmNotificationsResponse> updateOneClickAlarmNotificationsAsync(
        UpdateOneClickAlarmNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateOneClickAlarmNotifications);
    }

    /**
     * 批量修改开启状态的一键告警关联告警规则的告警通知
     *
     * 批量修改开启状态的一键告警关联告警规则的告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOneClickAlarmNotificationsRequest 请求对象
     * @return AsyncInvoker<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse>
     */
    public AsyncInvoker<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse> updateOneClickAlarmNotificationsAsyncInvoker(
        UpdateOneClickAlarmNotificationsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateOneClickAlarmNotifications, hcClient);
    }

    /**
     * 修改资源分组
     *
     * 修改资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return CompletableFuture<UpdateResourceGroupResponse>
     */
    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroupAsync(UpdateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

    /**
     * 修改资源分组
     *
     * 修改资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>
     */
    public AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupAsyncInvoker(
        UpdateResourceGroupRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateResourceGroup, hcClient);
    }

    /**
     * 资源分组异步关联自定义告警模板
     *
     * 提交资源分组批量关联自定义告警模板异步任务，由异步任务覆盖性创建告警规则。每个用户创建处于待执行状态的异步任务数量上限为100个，单个资源分组仅可有1个未完成的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupAssociationAlarmTemplateRequest 请求对象
     * @return CompletableFuture<UpdateResourceGroupAssociationAlarmTemplateResponse>
     */
    public CompletableFuture<UpdateResourceGroupAssociationAlarmTemplateResponse> updateResourceGroupAssociationAlarmTemplateAsync(
        UpdateResourceGroupAssociationAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateResourceGroupAssociationAlarmTemplate);
    }

    /**
     * 资源分组异步关联自定义告警模板
     *
     * 提交资源分组批量关联自定义告警模板异步任务，由异步任务覆盖性创建告警规则。每个用户创建处于待执行状态的异步任务数量上限为100个，单个资源分组仅可有1个未完成的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupAssociationAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateResourceGroupAssociationAlarmTemplateRequest, UpdateResourceGroupAssociationAlarmTemplateResponse>
     */
    public AsyncInvoker<UpdateResourceGroupAssociationAlarmTemplateRequest, UpdateResourceGroupAssociationAlarmTemplateResponse> updateResourceGroupAssociationAlarmTemplateAsyncInvoker(
        UpdateResourceGroupAssociationAlarmTemplateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateResourceGroupAssociationAlarmTemplate, hcClient);
    }

}
