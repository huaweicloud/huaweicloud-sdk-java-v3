package com.huaweicloud.sdk.bcc.v1;

import com.huaweicloud.sdk.bcc.v1.model.BindResourceLevelComplianceRequest;
import com.huaweicloud.sdk.bcc.v1.model.BindResourceLevelComplianceResponse;
import com.huaweicloud.sdk.bcc.v1.model.ChangeResourcesLevelRequest;
import com.huaweicloud.sdk.bcc.v1.model.ChangeResourcesLevelResponse;
import com.huaweicloud.sdk.bcc.v1.model.CreateComplianceRuleRequest;
import com.huaweicloud.sdk.bcc.v1.model.CreateComplianceRuleResponse;
import com.huaweicloud.sdk.bcc.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.CreateReportSettingRequest;
import com.huaweicloud.sdk.bcc.v1.model.CreateReportSettingResponse;
import com.huaweicloud.sdk.bcc.v1.model.CreateResourcesLevelRequest;
import com.huaweicloud.sdk.bcc.v1.model.CreateResourcesLevelResponse;
import com.huaweicloud.sdk.bcc.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.bcc.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.bcc.v1.model.DeleteComplianceRuleRequest;
import com.huaweicloud.sdk.bcc.v1.model.DeleteComplianceRuleResponse;
import com.huaweicloud.sdk.bcc.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.DeleteReportRequest;
import com.huaweicloud.sdk.bcc.v1.model.DeleteReportResponse;
import com.huaweicloud.sdk.bcc.v1.model.DeleteReportSettingRequest;
import com.huaweicloud.sdk.bcc.v1.model.DeleteReportSettingResponse;
import com.huaweicloud.sdk.bcc.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.bcc.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.bcc.v1.model.EnableDomainRequest;
import com.huaweicloud.sdk.bcc.v1.model.EnableDomainResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListAlarmRulesRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListAlarmRulesResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListAlarmsRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListAlarmsResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListComplianceRuleRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListComplianceRuleResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListEventsRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListEventsResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListMetricsRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListMetricsResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListOrganizationPolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListOrganizationPolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListReportSettingsRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListReportSettingsResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListReportsRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListReportsResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListResourceCopiesRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListResourceCopiesResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListResourcesLevelRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListResourcesLevelResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListResourcesLevelTagsRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListResourcesLevelTagsResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListSupportedRegionRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListSupportedRegionResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListTasksRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListTasksResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListTemplatesRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListTemplatesResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListVaultRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListVaultResponse;
import com.huaweicloud.sdk.bcc.v1.model.ListVaultTopsRequest;
import com.huaweicloud.sdk.bcc.v1.model.ListVaultTopsResponse;
import com.huaweicloud.sdk.bcc.v1.model.ModifyResourceLevelRequest;
import com.huaweicloud.sdk.bcc.v1.model.ModifyResourceLevelResponse;
import com.huaweicloud.sdk.bcc.v1.model.NotifyResourceChangeRequest;
import com.huaweicloud.sdk.bcc.v1.model.NotifyResourceChangeResponse;
import com.huaweicloud.sdk.bcc.v1.model.RemoveResourceLevelRequest;
import com.huaweicloud.sdk.bcc.v1.model.RemoveResourceLevelResponse;
import com.huaweicloud.sdk.bcc.v1.model.SetProtectionConfigurationRequest;
import com.huaweicloud.sdk.bcc.v1.model.SetProtectionConfigurationResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowAlarmSummaryRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowAlarmSummaryResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowComplianceRuleRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowComplianceRuleResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowDomainRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowDomainResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowOrganizationPolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowOrganizationPolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportResourceDetailsDataRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportResourceDetailsDataResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportSettingRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportSettingResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportSummaryDataRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportSummaryDataResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportTaskDetailsDataRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowReportTaskDetailsDataResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowResourceCopiesSummaryRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowResourceCopiesSummaryResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowResourceDetailRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowResourceDetailResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowResourcesSummaryRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowResourcesSummaryResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowTaskRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowTaskResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowTaskStatusSummaryRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowTaskStatusSummaryResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowTaskTypeSummaryRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowTaskTypeSummaryResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowTemplateRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowTemplateResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowVaultRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowVaultResponse;
import com.huaweicloud.sdk.bcc.v1.model.ShowVaultSummaryRequest;
import com.huaweicloud.sdk.bcc.v1.model.ShowVaultSummaryResponse;
import com.huaweicloud.sdk.bcc.v1.model.UnbindResourceLevelComplianceRequest;
import com.huaweicloud.sdk.bcc.v1.model.UnbindResourceLevelComplianceResponse;
import com.huaweicloud.sdk.bcc.v1.model.UpdateComplianceRuleRequest;
import com.huaweicloud.sdk.bcc.v1.model.UpdateComplianceRuleResponse;
import com.huaweicloud.sdk.bcc.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.UpdateReportSettingRequest;
import com.huaweicloud.sdk.bcc.v1.model.UpdateReportSettingResponse;
import com.huaweicloud.sdk.bcc.v1.model.UpdateTemplateRequest;
import com.huaweicloud.sdk.bcc.v1.model.UpdateTemplateResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class BccAsyncClient {

    protected HcClient hcClient;

    public BccAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BccAsyncClient> newBuilder() {
        ClientBuilder<BccAsyncClient> clientBuilder = new ClientBuilder<>(BccAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 绑定资源等级合规规则
     *
     * 资源分级绑定合规规则，会导致属于改等级的资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindResourceLevelComplianceRequest 请求对象
     * @return CompletableFuture<BindResourceLevelComplianceResponse>
     */
    public CompletableFuture<BindResourceLevelComplianceResponse> bindResourceLevelComplianceAsync(
        BindResourceLevelComplianceRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.bindResourceLevelCompliance);
    }

    /**
     * 绑定资源等级合规规则
     *
     * 资源分级绑定合规规则，会导致属于改等级的资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindResourceLevelComplianceRequest 请求对象
     * @return AsyncInvoker<BindResourceLevelComplianceRequest, BindResourceLevelComplianceResponse>
     */
    public AsyncInvoker<BindResourceLevelComplianceRequest, BindResourceLevelComplianceResponse> bindResourceLevelComplianceAsyncInvoker(
        BindResourceLevelComplianceRequest request) {
        return new AsyncInvoker<>(request, BccMeta.bindResourceLevelCompliance, hcClient);
    }

    /**
     * 指定资源等级
     *
     * 手动更改资源的等级，可能会导致资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourcesLevelRequest 请求对象
     * @return CompletableFuture<ChangeResourcesLevelResponse>
     */
    public CompletableFuture<ChangeResourcesLevelResponse> changeResourcesLevelAsync(
        ChangeResourcesLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.changeResourcesLevel);
    }

    /**
     * 指定资源等级
     *
     * 手动更改资源的等级，可能会导致资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourcesLevelRequest 请求对象
     * @return AsyncInvoker<ChangeResourcesLevelRequest, ChangeResourcesLevelResponse>
     */
    public AsyncInvoker<ChangeResourcesLevelRequest, ChangeResourcesLevelResponse> changeResourcesLevelAsyncInvoker(
        ChangeResourcesLevelRequest request) {
        return new AsyncInvoker<>(request, BccMeta.changeResourcesLevel, hcClient);
    }

    /**
     * 新建自定义合规规则
     *
     * 新建自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComplianceRuleRequest 请求对象
     * @return CompletableFuture<CreateComplianceRuleResponse>
     */
    public CompletableFuture<CreateComplianceRuleResponse> createComplianceRuleAsync(
        CreateComplianceRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.createComplianceRule);
    }

    /**
     * 新建自定义合规规则
     *
     * 新建自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComplianceRuleRequest 请求对象
     * @return AsyncInvoker<CreateComplianceRuleRequest, CreateComplianceRuleResponse>
     */
    public AsyncInvoker<CreateComplianceRuleRequest, CreateComplianceRuleResponse> createComplianceRuleAsyncInvoker(
        CreateComplianceRuleRequest request) {
        return new AsyncInvoker<>(request, BccMeta.createComplianceRule, hcClient);
    }

    /**
     * 新建策略
     *
     * 新建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.createPolicy);
    }

    /**
     * 新建策略
     *
     * 新建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<>(request, BccMeta.createPolicy, hcClient);
    }

    /**
     * 创建报告配置
     *
     * 创建报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportSettingRequest 请求对象
     * @return CompletableFuture<CreateReportSettingResponse>
     */
    public CompletableFuture<CreateReportSettingResponse> createReportSettingAsync(CreateReportSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.createReportSetting);
    }

    /**
     * 创建报告配置
     *
     * 创建报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportSettingRequest 请求对象
     * @return AsyncInvoker<CreateReportSettingRequest, CreateReportSettingResponse>
     */
    public AsyncInvoker<CreateReportSettingRequest, CreateReportSettingResponse> createReportSettingAsyncInvoker(
        CreateReportSettingRequest request) {
        return new AsyncInvoker<>(request, BccMeta.createReportSetting, hcClient);
    }

    /**
     * 新增资源分级
     *
     * 新增资源分级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourcesLevelRequest 请求对象
     * @return CompletableFuture<CreateResourcesLevelResponse>
     */
    public CompletableFuture<CreateResourcesLevelResponse> createResourcesLevelAsync(
        CreateResourcesLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.createResourcesLevel);
    }

    /**
     * 新增资源分级
     *
     * 新增资源分级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourcesLevelRequest 请求对象
     * @return AsyncInvoker<CreateResourcesLevelRequest, CreateResourcesLevelResponse>
     */
    public AsyncInvoker<CreateResourcesLevelRequest, CreateResourcesLevelResponse> createResourcesLevelAsyncInvoker(
        CreateResourcesLevelRequest request) {
        return new AsyncInvoker<>(request, BccMeta.createResourcesLevel, hcClient);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CompletableFuture<CreateTemplateResponse>
     */
    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.createTemplate);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<>(request, BccMeta.createTemplate, hcClient);
    }

    /**
     * 删除自定义合规规则
     *
     * 删除自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComplianceRuleRequest 请求对象
     * @return CompletableFuture<DeleteComplianceRuleResponse>
     */
    public CompletableFuture<DeleteComplianceRuleResponse> deleteComplianceRuleAsync(
        DeleteComplianceRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.deleteComplianceRule);
    }

    /**
     * 删除自定义合规规则
     *
     * 删除自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComplianceRuleRequest 请求对象
     * @return AsyncInvoker<DeleteComplianceRuleRequest, DeleteComplianceRuleResponse>
     */
    public AsyncInvoker<DeleteComplianceRuleRequest, DeleteComplianceRuleResponse> deleteComplianceRuleAsyncInvoker(
        DeleteComplianceRuleRequest request) {
        return new AsyncInvoker<>(request, BccMeta.deleteComplianceRule, hcClient);
    }

    /**
     * 删除指定策略
     *
     * 删除指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.deletePolicy);
    }

    /**
     * 删除指定策略
     *
     * 删除指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<>(request, BccMeta.deletePolicy, hcClient);
    }

    /**
     * 删除指定的报告
     *
     * 删除指定的报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportRequest 请求对象
     * @return CompletableFuture<DeleteReportResponse>
     */
    public CompletableFuture<DeleteReportResponse> deleteReportAsync(DeleteReportRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.deleteReport);
    }

    /**
     * 删除指定的报告
     *
     * 删除指定的报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportRequest 请求对象
     * @return AsyncInvoker<DeleteReportRequest, DeleteReportResponse>
     */
    public AsyncInvoker<DeleteReportRequest, DeleteReportResponse> deleteReportAsyncInvoker(
        DeleteReportRequest request) {
        return new AsyncInvoker<>(request, BccMeta.deleteReport, hcClient);
    }

    /**
     * 删除报告配置
     *
     * 删除报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportSettingRequest 请求对象
     * @return CompletableFuture<DeleteReportSettingResponse>
     */
    public CompletableFuture<DeleteReportSettingResponse> deleteReportSettingAsync(DeleteReportSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.deleteReportSetting);
    }

    /**
     * 删除报告配置
     *
     * 删除报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportSettingRequest 请求对象
     * @return AsyncInvoker<DeleteReportSettingRequest, DeleteReportSettingResponse>
     */
    public AsyncInvoker<DeleteReportSettingRequest, DeleteReportSettingResponse> deleteReportSettingAsyncInvoker(
        DeleteReportSettingRequest request) {
        return new AsyncInvoker<>(request, BccMeta.deleteReportSetting, hcClient);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.deleteTemplate);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<>(request, BccMeta.deleteTemplate, hcClient);
    }

    /**
     * 用户授权开启BCC
     *
     * 用户授权开启BCC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return CompletableFuture<EnableDomainResponse>
     */
    public CompletableFuture<EnableDomainResponse> enableDomainAsync(EnableDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.enableDomain);
    }

    /**
     * 用户授权开启BCC
     *
     * 用户授权开启BCC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return AsyncInvoker<EnableDomainRequest, EnableDomainResponse>
     */
    public AsyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainAsyncInvoker(
        EnableDomainRequest request) {
        return new AsyncInvoker<>(request, BccMeta.enableDomain, hcClient);
    }

    /**
     * 查询告警规则列表
     *
     * 查询告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListAlarmRulesResponse>
     */
    public CompletableFuture<ListAlarmRulesResponse> listAlarmRulesAsync(ListAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listAlarmRules);
    }

    /**
     * 查询告警规则列表
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
        return new AsyncInvoker<>(request, BccMeta.listAlarmRules, hcClient);
    }

    /**
     * 查询告警列表
     *
     * 查询告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmsResponse>
     */
    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listAlarms);
    }

    /**
     * 查询告警列表
     *
     * 查询告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>
     */
    public AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsAsyncInvoker(ListAlarmsRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listAlarms, hcClient);
    }

    /**
     * 列举合规规则
     *
     * 列举合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComplianceRuleRequest 请求对象
     * @return CompletableFuture<ListComplianceRuleResponse>
     */
    public CompletableFuture<ListComplianceRuleResponse> listComplianceRuleAsync(ListComplianceRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listComplianceRule);
    }

    /**
     * 列举合规规则
     *
     * 列举合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComplianceRuleRequest 请求对象
     * @return AsyncInvoker<ListComplianceRuleRequest, ListComplianceRuleResponse>
     */
    public AsyncInvoker<ListComplianceRuleRequest, ListComplianceRuleResponse> listComplianceRuleAsyncInvoker(
        ListComplianceRuleRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listComplianceRule, hcClient);
    }

    /**
     * 查询事件数据
     *
     * 查询事件数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listEvents);
    }

    /**
     * 查询事件数据
     *
     * 查询事件数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listEvents, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 查询监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return CompletableFuture<ListMetricsResponse>
     */
    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listMetrics);
    }

    /**
     * 查询监控数据
     *
     * 查询监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return AsyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public AsyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsAsyncInvoker(ListMetricsRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listMetrics, hcClient);
    }

    /**
     * 列举策略
     *
     * 列举策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyRequest 请求对象
     * @return CompletableFuture<ListOrganizationPolicyResponse>
     */
    public CompletableFuture<ListOrganizationPolicyResponse> listOrganizationPolicyAsync(
        ListOrganizationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listOrganizationPolicy);
    }

    /**
     * 列举策略
     *
     * 列举策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyRequest 请求对象
     * @return AsyncInvoker<ListOrganizationPolicyRequest, ListOrganizationPolicyResponse>
     */
    public AsyncInvoker<ListOrganizationPolicyRequest, ListOrganizationPolicyResponse> listOrganizationPolicyAsyncInvoker(
        ListOrganizationPolicyRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listOrganizationPolicy, hcClient);
    }

    /**
     * 列举策略
     *
     * 列举策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return CompletableFuture<ListPolicyResponse>
     */
    public CompletableFuture<ListPolicyResponse> listPolicyAsync(ListPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listPolicy);
    }

    /**
     * 列举策略
     *
     * 列举策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return AsyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public AsyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyAsyncInvoker(ListPolicyRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listPolicy, hcClient);
    }

    /**
     * 查询报告配置列表
     *
     * 查询报告配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportSettingsRequest 请求对象
     * @return CompletableFuture<ListReportSettingsResponse>
     */
    public CompletableFuture<ListReportSettingsResponse> listReportSettingsAsync(ListReportSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listReportSettings);
    }

    /**
     * 查询报告配置列表
     *
     * 查询报告配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportSettingsRequest 请求对象
     * @return AsyncInvoker<ListReportSettingsRequest, ListReportSettingsResponse>
     */
    public AsyncInvoker<ListReportSettingsRequest, ListReportSettingsResponse> listReportSettingsAsyncInvoker(
        ListReportSettingsRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listReportSettings, hcClient);
    }

    /**
     * 查询报告列表
     *
     * 查询报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return CompletableFuture<ListReportsResponse>
     */
    public CompletableFuture<ListReportsResponse> listReportsAsync(ListReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listReports);
    }

    /**
     * 查询报告列表
     *
     * 查询报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return AsyncInvoker<ListReportsRequest, ListReportsResponse>
     */
    public AsyncInvoker<ListReportsRequest, ListReportsResponse> listReportsAsyncInvoker(ListReportsRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listReports, hcClient);
    }

    /**
     * 查询副本列表
     *
     * 查询副本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceCopiesRequest 请求对象
     * @return CompletableFuture<ListResourceCopiesResponse>
     */
    public CompletableFuture<ListResourceCopiesResponse> listResourceCopiesAsync(ListResourceCopiesRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listResourceCopies);
    }

    /**
     * 查询副本列表
     *
     * 查询副本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceCopiesRequest 请求对象
     * @return AsyncInvoker<ListResourceCopiesRequest, ListResourceCopiesResponse>
     */
    public AsyncInvoker<ListResourceCopiesRequest, ListResourceCopiesResponse> listResourceCopiesAsyncInvoker(
        ListResourceCopiesRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listResourceCopies, hcClient);
    }

    /**
     * 查询资源列表
     *
     * 查询资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listResources);
    }

    /**
     * 查询资源列表
     *
     * 查询资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listResources, hcClient);
    }

    /**
     * 列举资源分级
     *
     * 列举资源分级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesLevelRequest 请求对象
     * @return CompletableFuture<ListResourcesLevelResponse>
     */
    public CompletableFuture<ListResourcesLevelResponse> listResourcesLevelAsync(ListResourcesLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listResourcesLevel);
    }

    /**
     * 列举资源分级
     *
     * 列举资源分级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesLevelRequest 请求对象
     * @return AsyncInvoker<ListResourcesLevelRequest, ListResourcesLevelResponse>
     */
    public AsyncInvoker<ListResourcesLevelRequest, ListResourcesLevelResponse> listResourcesLevelAsyncInvoker(
        ListResourcesLevelRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listResourcesLevel, hcClient);
    }

    /**
     * 列举资源分级已指定的标签
     *
     * 列举资源分级已指定的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesLevelTagsRequest 请求对象
     * @return CompletableFuture<ListResourcesLevelTagsResponse>
     */
    public CompletableFuture<ListResourcesLevelTagsResponse> listResourcesLevelTagsAsync(
        ListResourcesLevelTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listResourcesLevelTags);
    }

    /**
     * 列举资源分级已指定的标签
     *
     * 列举资源分级已指定的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesLevelTagsRequest 请求对象
     * @return AsyncInvoker<ListResourcesLevelTagsRequest, ListResourcesLevelTagsResponse>
     */
    public AsyncInvoker<ListResourcesLevelTagsRequest, ListResourcesLevelTagsResponse> listResourcesLevelTagsAsyncInvoker(
        ListResourcesLevelTagsRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listResourcesLevelTags, hcClient);
    }

    /**
     * 查询支持的region列表
     *
     * BCC支持的region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportedRegionRequest 请求对象
     * @return CompletableFuture<ListSupportedRegionResponse>
     */
    public CompletableFuture<ListSupportedRegionResponse> listSupportedRegionAsync(ListSupportedRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listSupportedRegion);
    }

    /**
     * 查询支持的region列表
     *
     * BCC支持的region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportedRegionRequest 请求对象
     * @return AsyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse>
     */
    public AsyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse> listSupportedRegionAsyncInvoker(
        ListSupportedRegionRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listSupportedRegion, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listTasks, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listTemplates, hcClient);
    }

    /**
     * 列举存储库
     *
     * 列举存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultRequest 请求对象
     * @return CompletableFuture<ListVaultResponse>
     */
    public CompletableFuture<ListVaultResponse> listVaultAsync(ListVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listVault);
    }

    /**
     * 列举存储库
     *
     * 列举存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultRequest 请求对象
     * @return AsyncInvoker<ListVaultRequest, ListVaultResponse>
     */
    public AsyncInvoker<ListVaultRequest, ListVaultResponse> listVaultAsyncInvoker(ListVaultRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listVault, hcClient);
    }

    /**
     * 查询使用最高的存储库
     *
     * 查询使用最高的存储库，按使用容量或者按使用率排序返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultTopsRequest 请求对象
     * @return CompletableFuture<ListVaultTopsResponse>
     */
    public CompletableFuture<ListVaultTopsResponse> listVaultTopsAsync(ListVaultTopsRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.listVaultTops);
    }

    /**
     * 查询使用最高的存储库
     *
     * 查询使用最高的存储库，按使用容量或者按使用率排序返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultTopsRequest 请求对象
     * @return AsyncInvoker<ListVaultTopsRequest, ListVaultTopsResponse>
     */
    public AsyncInvoker<ListVaultTopsRequest, ListVaultTopsResponse> listVaultTopsAsyncInvoker(
        ListVaultTopsRequest request) {
        return new AsyncInvoker<>(request, BccMeta.listVaultTops, hcClient);
    }

    /**
     * 修改资源分级
     *
     * 修改资源分级，修改资源等级的应用类型、应用规则、合规规则id时，可能会导致某些资源的归属等级发生变动，或资源的合规结果发生更改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyResourceLevelRequest 请求对象
     * @return CompletableFuture<ModifyResourceLevelResponse>
     */
    public CompletableFuture<ModifyResourceLevelResponse> modifyResourceLevelAsync(ModifyResourceLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.modifyResourceLevel);
    }

    /**
     * 修改资源分级
     *
     * 修改资源分级，修改资源等级的应用类型、应用规则、合规规则id时，可能会导致某些资源的归属等级发生变动，或资源的合规结果发生更改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyResourceLevelRequest 请求对象
     * @return AsyncInvoker<ModifyResourceLevelRequest, ModifyResourceLevelResponse>
     */
    public AsyncInvoker<ModifyResourceLevelRequest, ModifyResourceLevelResponse> modifyResourceLevelAsyncInvoker(
        ModifyResourceLevelRequest request) {
        return new AsyncInvoker<>(request, BccMeta.modifyResourceLevel, hcClient);
    }

    /**
     * 资源变化通知
     *
     * 资源变化通知，当资源的属性变动时，可能会改变资源归属的等级，进而可能导致合规结果的变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifyResourceChangeRequest 请求对象
     * @return CompletableFuture<NotifyResourceChangeResponse>
     */
    public CompletableFuture<NotifyResourceChangeResponse> notifyResourceChangeAsync(
        NotifyResourceChangeRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.notifyResourceChange);
    }

    /**
     * 资源变化通知
     *
     * 资源变化通知，当资源的属性变动时，可能会改变资源归属的等级，进而可能导致合规结果的变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifyResourceChangeRequest 请求对象
     * @return AsyncInvoker<NotifyResourceChangeRequest, NotifyResourceChangeResponse>
     */
    public AsyncInvoker<NotifyResourceChangeRequest, NotifyResourceChangeResponse> notifyResourceChangeAsyncInvoker(
        NotifyResourceChangeRequest request) {
        return new AsyncInvoker<>(request, BccMeta.notifyResourceChange, hcClient);
    }

    /**
     * 删除资源分级
     *
     * 删除资源分级，删除资源等级会导致归属于该等级的资源的合规结果清空
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveResourceLevelRequest 请求对象
     * @return CompletableFuture<RemoveResourceLevelResponse>
     */
    public CompletableFuture<RemoveResourceLevelResponse> removeResourceLevelAsync(RemoveResourceLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.removeResourceLevel);
    }

    /**
     * 删除资源分级
     *
     * 删除资源分级，删除资源等级会导致归属于该等级的资源的合规结果清空
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveResourceLevelRequest 请求对象
     * @return AsyncInvoker<RemoveResourceLevelRequest, RemoveResourceLevelResponse>
     */
    public AsyncInvoker<RemoveResourceLevelRequest, RemoveResourceLevelResponse> removeResourceLevelAsyncInvoker(
        RemoveResourceLevelRequest request) {
        return new AsyncInvoker<>(request, BccMeta.removeResourceLevel, hcClient);
    }

    /**
     * 配置资源保护
     *
     * 配置资源保护，资源保护情况发生变动后，相关资源的合规结果可能会发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProtectionConfigurationRequest 请求对象
     * @return CompletableFuture<SetProtectionConfigurationResponse>
     */
    public CompletableFuture<SetProtectionConfigurationResponse> setProtectionConfigurationAsync(
        SetProtectionConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.setProtectionConfiguration);
    }

    /**
     * 配置资源保护
     *
     * 配置资源保护，资源保护情况发生变动后，相关资源的合规结果可能会发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProtectionConfigurationRequest 请求对象
     * @return AsyncInvoker<SetProtectionConfigurationRequest, SetProtectionConfigurationResponse>
     */
    public AsyncInvoker<SetProtectionConfigurationRequest, SetProtectionConfigurationResponse> setProtectionConfigurationAsyncInvoker(
        SetProtectionConfigurationRequest request) {
        return new AsyncInvoker<>(request, BccMeta.setProtectionConfiguration, hcClient);
    }

    /**
     * 查询告警统计信息
     *
     * 查询告警统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmSummaryRequest 请求对象
     * @return CompletableFuture<ShowAlarmSummaryResponse>
     */
    public CompletableFuture<ShowAlarmSummaryResponse> showAlarmSummaryAsync(ShowAlarmSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showAlarmSummary);
    }

    /**
     * 查询告警统计信息
     *
     * 查询告警统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmSummaryRequest 请求对象
     * @return AsyncInvoker<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse>
     */
    public AsyncInvoker<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> showAlarmSummaryAsyncInvoker(
        ShowAlarmSummaryRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showAlarmSummary, hcClient);
    }

    /**
     * 查看自定义合规规则详情
     *
     * 查看自定义合规规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceRuleRequest 请求对象
     * @return CompletableFuture<ShowComplianceRuleResponse>
     */
    public CompletableFuture<ShowComplianceRuleResponse> showComplianceRuleAsync(ShowComplianceRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showComplianceRule);
    }

    /**
     * 查看自定义合规规则详情
     *
     * 查看自定义合规规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceRuleRequest 请求对象
     * @return AsyncInvoker<ShowComplianceRuleRequest, ShowComplianceRuleResponse>
     */
    public AsyncInvoker<ShowComplianceRuleRequest, ShowComplianceRuleResponse> showComplianceRuleAsyncInvoker(
        ShowComplianceRuleRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showComplianceRule, hcClient);
    }

    /**
     * 查询BCC开启情况
     *
     * 查询BCC开启情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return CompletableFuture<ShowDomainResponse>
     */
    public CompletableFuture<ShowDomainResponse> showDomainAsync(ShowDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showDomain);
    }

    /**
     * 查询BCC开启情况
     *
     * 查询BCC开启情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return AsyncInvoker<ShowDomainRequest, ShowDomainResponse>
     */
    public AsyncInvoker<ShowDomainRequest, ShowDomainResponse> showDomainAsyncInvoker(ShowDomainRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showDomain, hcClient);
    }

    /**
     * 查询指定组织策略
     *
     * 查询指定组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyRequest 请求对象
     * @return CompletableFuture<ShowOrganizationPolicyResponse>
     */
    public CompletableFuture<ShowOrganizationPolicyResponse> showOrganizationPolicyAsync(
        ShowOrganizationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showOrganizationPolicy);
    }

    /**
     * 查询指定组织策略
     *
     * 查询指定组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyRequest 请求对象
     * @return AsyncInvoker<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse>
     */
    public AsyncInvoker<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse> showOrganizationPolicyAsyncInvoker(
        ShowOrganizationPolicyRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showOrganizationPolicy, hcClient);
    }

    /**
     * 查询指定策略
     *
     * 查询指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return CompletableFuture<ShowPolicyResponse>
     */
    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showPolicy);
    }

    /**
     * 查询指定策略
     *
     * 查询指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showPolicy, hcClient);
    }

    /**
     * 查询报告详情
     *
     * 查询报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return CompletableFuture<ShowReportResponse>
     */
    public CompletableFuture<ShowReportResponse> showReportAsync(ShowReportRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showReport);
    }

    /**
     * 查询报告详情
     *
     * 查询报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return AsyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public AsyncInvoker<ShowReportRequest, ShowReportResponse> showReportAsyncInvoker(ShowReportRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showReport, hcClient);
    }

    /**
     * 查询报告详情类数据
     *
     * 查询指定租户下的指定报告的详情类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportResourceDetailsDataRequest 请求对象
     * @return CompletableFuture<ShowReportResourceDetailsDataResponse>
     */
    public CompletableFuture<ShowReportResourceDetailsDataResponse> showReportResourceDetailsDataAsync(
        ShowReportResourceDetailsDataRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showReportResourceDetailsData);
    }

    /**
     * 查询报告详情类数据
     *
     * 查询指定租户下的指定报告的详情类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportResourceDetailsDataRequest 请求对象
     * @return AsyncInvoker<ShowReportResourceDetailsDataRequest, ShowReportResourceDetailsDataResponse>
     */
    public AsyncInvoker<ShowReportResourceDetailsDataRequest, ShowReportResourceDetailsDataResponse> showReportResourceDetailsDataAsyncInvoker(
        ShowReportResourceDetailsDataRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showReportResourceDetailsData, hcClient);
    }

    /**
     * 查询报告配置
     *
     * 查询报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSettingRequest 请求对象
     * @return CompletableFuture<ShowReportSettingResponse>
     */
    public CompletableFuture<ShowReportSettingResponse> showReportSettingAsync(ShowReportSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showReportSetting);
    }

    /**
     * 查询报告配置
     *
     * 查询报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSettingRequest 请求对象
     * @return AsyncInvoker<ShowReportSettingRequest, ShowReportSettingResponse>
     */
    public AsyncInvoker<ShowReportSettingRequest, ShowReportSettingResponse> showReportSettingAsyncInvoker(
        ShowReportSettingRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showReportSetting, hcClient);
    }

    /**
     * 查询报告摘要类数据
     *
     * 查询指定租户下的指定报告的摘要类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSummaryDataRequest 请求对象
     * @return CompletableFuture<ShowReportSummaryDataResponse>
     */
    public CompletableFuture<ShowReportSummaryDataResponse> showReportSummaryDataAsync(
        ShowReportSummaryDataRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showReportSummaryData);
    }

    /**
     * 查询报告摘要类数据
     *
     * 查询指定租户下的指定报告的摘要类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSummaryDataRequest 请求对象
     * @return AsyncInvoker<ShowReportSummaryDataRequest, ShowReportSummaryDataResponse>
     */
    public AsyncInvoker<ShowReportSummaryDataRequest, ShowReportSummaryDataResponse> showReportSummaryDataAsyncInvoker(
        ShowReportSummaryDataRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showReportSummaryData, hcClient);
    }

    /**
     * 查询报告详情类数据
     *
     * 查询指定租户下的指定报告的详情类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportTaskDetailsDataRequest 请求对象
     * @return CompletableFuture<ShowReportTaskDetailsDataResponse>
     */
    public CompletableFuture<ShowReportTaskDetailsDataResponse> showReportTaskDetailsDataAsync(
        ShowReportTaskDetailsDataRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showReportTaskDetailsData);
    }

    /**
     * 查询报告详情类数据
     *
     * 查询指定租户下的指定报告的详情类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportTaskDetailsDataRequest 请求对象
     * @return AsyncInvoker<ShowReportTaskDetailsDataRequest, ShowReportTaskDetailsDataResponse>
     */
    public AsyncInvoker<ShowReportTaskDetailsDataRequest, ShowReportTaskDetailsDataResponse> showReportTaskDetailsDataAsyncInvoker(
        ShowReportTaskDetailsDataRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showReportTaskDetailsData, hcClient);
    }

    /**
     * 查询副本摘要
     *
     * get copies summary
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceCopiesSummaryRequest 请求对象
     * @return CompletableFuture<ShowResourceCopiesSummaryResponse>
     */
    public CompletableFuture<ShowResourceCopiesSummaryResponse> showResourceCopiesSummaryAsync(
        ShowResourceCopiesSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showResourceCopiesSummary);
    }

    /**
     * 查询副本摘要
     *
     * get copies summary
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceCopiesSummaryRequest 请求对象
     * @return AsyncInvoker<ShowResourceCopiesSummaryRequest, ShowResourceCopiesSummaryResponse>
     */
    public AsyncInvoker<ShowResourceCopiesSummaryRequest, ShowResourceCopiesSummaryResponse> showResourceCopiesSummaryAsyncInvoker(
        ShowResourceCopiesSummaryRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showResourceCopiesSummary, hcClient);
    }

    /**
     * 查看资源详情
     *
     * 查看资源详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return CompletableFuture<ShowResourceDetailResponse>
     */
    public CompletableFuture<ShowResourceDetailResponse> showResourceDetailAsync(ShowResourceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showResourceDetail);
    }

    /**
     * 查看资源详情
     *
     * 查看资源详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return AsyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse>
     */
    public AsyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetailAsyncInvoker(
        ShowResourceDetailRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showResourceDetail, hcClient);
    }

    /**
     * 查询资源统计
     *
     * 查询资源统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcesSummaryRequest 请求对象
     * @return CompletableFuture<ShowResourcesSummaryResponse>
     */
    public CompletableFuture<ShowResourcesSummaryResponse> showResourcesSummaryAsync(
        ShowResourcesSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showResourcesSummary);
    }

    /**
     * 查询资源统计
     *
     * 查询资源统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcesSummaryRequest 请求对象
     * @return AsyncInvoker<ShowResourcesSummaryRequest, ShowResourcesSummaryResponse>
     */
    public AsyncInvoker<ShowResourcesSummaryRequest, ShowResourcesSummaryResponse> showResourcesSummaryAsyncInvoker(
        ShowResourcesSummaryRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showResourcesSummary, hcClient);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showTask);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showTask, hcClient);
    }

    /**
     * 查询任务统计信息
     *
     * 查询任务统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskStatusSummaryRequest 请求对象
     * @return CompletableFuture<ShowTaskStatusSummaryResponse>
     */
    public CompletableFuture<ShowTaskStatusSummaryResponse> showTaskStatusSummaryAsync(
        ShowTaskStatusSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showTaskStatusSummary);
    }

    /**
     * 查询任务统计信息
     *
     * 查询任务统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskStatusSummaryRequest 请求对象
     * @return AsyncInvoker<ShowTaskStatusSummaryRequest, ShowTaskStatusSummaryResponse>
     */
    public AsyncInvoker<ShowTaskStatusSummaryRequest, ShowTaskStatusSummaryResponse> showTaskStatusSummaryAsyncInvoker(
        ShowTaskStatusSummaryRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showTaskStatusSummary, hcClient);
    }

    /**
     * 查询任务统计信息
     *
     * 查询任务统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskTypeSummaryRequest 请求对象
     * @return CompletableFuture<ShowTaskTypeSummaryResponse>
     */
    public CompletableFuture<ShowTaskTypeSummaryResponse> showTaskTypeSummaryAsync(ShowTaskTypeSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showTaskTypeSummary);
    }

    /**
     * 查询任务统计信息
     *
     * 查询任务统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskTypeSummaryRequest 请求对象
     * @return AsyncInvoker<ShowTaskTypeSummaryRequest, ShowTaskTypeSummaryResponse>
     */
    public AsyncInvoker<ShowTaskTypeSummaryRequest, ShowTaskTypeSummaryResponse> showTaskTypeSummaryAsyncInvoker(
        ShowTaskTypeSummaryRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showTaskTypeSummary, hcClient);
    }

    /**
     * 查询模板
     *
     * 查询模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateRequest 请求对象
     * @return CompletableFuture<ShowTemplateResponse>
     */
    public CompletableFuture<ShowTemplateResponse> showTemplateAsync(ShowTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showTemplate);
    }

    /**
     * 查询模板
     *
     * 查询模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateRequest 请求对象
     * @return AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateAsyncInvoker(
        ShowTemplateRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showTemplate, hcClient);
    }

    /**
     * 查看指定存储库
     *
     * 查看指定存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultRequest 请求对象
     * @return CompletableFuture<ShowVaultResponse>
     */
    public CompletableFuture<ShowVaultResponse> showVaultAsync(ShowVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showVault);
    }

    /**
     * 查看指定存储库
     *
     * 查看指定存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultRequest 请求对象
     * @return AsyncInvoker<ShowVaultRequest, ShowVaultResponse>
     */
    public AsyncInvoker<ShowVaultRequest, ShowVaultResponse> showVaultAsyncInvoker(ShowVaultRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showVault, hcClient);
    }

    /**
     * 查看租户的Vault的统计信息
     *
     * 查看租户Vault的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultSummaryRequest 请求对象
     * @return CompletableFuture<ShowVaultSummaryResponse>
     */
    public CompletableFuture<ShowVaultSummaryResponse> showVaultSummaryAsync(ShowVaultSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.showVaultSummary);
    }

    /**
     * 查看租户的Vault的统计信息
     *
     * 查看租户Vault的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultSummaryRequest 请求对象
     * @return AsyncInvoker<ShowVaultSummaryRequest, ShowVaultSummaryResponse>
     */
    public AsyncInvoker<ShowVaultSummaryRequest, ShowVaultSummaryResponse> showVaultSummaryAsyncInvoker(
        ShowVaultSummaryRequest request) {
        return new AsyncInvoker<>(request, BccMeta.showVaultSummary, hcClient);
    }

    /**
     * 解绑资源等级合规规则
     *
     * 资源分级绑定合规规则，修改资源等级的合规规则，会导致属于改等级的资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindResourceLevelComplianceRequest 请求对象
     * @return CompletableFuture<UnbindResourceLevelComplianceResponse>
     */
    public CompletableFuture<UnbindResourceLevelComplianceResponse> unbindResourceLevelComplianceAsync(
        UnbindResourceLevelComplianceRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.unbindResourceLevelCompliance);
    }

    /**
     * 解绑资源等级合规规则
     *
     * 资源分级绑定合规规则，修改资源等级的合规规则，会导致属于改等级的资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindResourceLevelComplianceRequest 请求对象
     * @return AsyncInvoker<UnbindResourceLevelComplianceRequest, UnbindResourceLevelComplianceResponse>
     */
    public AsyncInvoker<UnbindResourceLevelComplianceRequest, UnbindResourceLevelComplianceResponse> unbindResourceLevelComplianceAsyncInvoker(
        UnbindResourceLevelComplianceRequest request) {
        return new AsyncInvoker<>(request, BccMeta.unbindResourceLevelCompliance, hcClient);
    }

    /**
     * 更新自定义合规规则
     *
     * 更新自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComplianceRuleRequest 请求对象
     * @return CompletableFuture<UpdateComplianceRuleResponse>
     */
    public CompletableFuture<UpdateComplianceRuleResponse> updateComplianceRuleAsync(
        UpdateComplianceRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.updateComplianceRule);
    }

    /**
     * 更新自定义合规规则
     *
     * 更新自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComplianceRuleRequest 请求对象
     * @return AsyncInvoker<UpdateComplianceRuleRequest, UpdateComplianceRuleResponse>
     */
    public AsyncInvoker<UpdateComplianceRuleRequest, UpdateComplianceRuleResponse> updateComplianceRuleAsyncInvoker(
        UpdateComplianceRuleRequest request) {
        return new AsyncInvoker<>(request, BccMeta.updateComplianceRule, hcClient);
    }

    /**
     * 更新指定策略
     *
     * 更新指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.updatePolicy);
    }

    /**
     * 更新指定策略
     *
     * 更新指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<>(request, BccMeta.updatePolicy, hcClient);
    }

    /**
     * 修改报告配置
     *
     * 更新报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportSettingRequest 请求对象
     * @return CompletableFuture<UpdateReportSettingResponse>
     */
    public CompletableFuture<UpdateReportSettingResponse> updateReportSettingAsync(UpdateReportSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.updateReportSetting);
    }

    /**
     * 修改报告配置
     *
     * 更新报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportSettingRequest 请求对象
     * @return AsyncInvoker<UpdateReportSettingRequest, UpdateReportSettingResponse>
     */
    public AsyncInvoker<UpdateReportSettingRequest, UpdateReportSettingResponse> updateReportSettingAsyncInvoker(
        UpdateReportSettingRequest request) {
        return new AsyncInvoker<>(request, BccMeta.updateReportSetting, hcClient);
    }

    /**
     * 修改模板
     *
     * 修改模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return CompletableFuture<UpdateTemplateResponse>
     */
    public CompletableFuture<UpdateTemplateResponse> updateTemplateAsync(UpdateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, BccMeta.updateTemplate);
    }

    /**
     * 修改模板
     *
     * 修改模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateAsyncInvoker(
        UpdateTemplateRequest request) {
        return new AsyncInvoker<>(request, BccMeta.updateTemplate, hcClient);
    }

}
