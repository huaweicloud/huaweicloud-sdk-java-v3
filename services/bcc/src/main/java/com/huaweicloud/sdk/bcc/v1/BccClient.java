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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class BccClient {

    protected HcClient hcClient;

    public BccClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BccClient> newBuilder() {
        ClientBuilder<BccClient> clientBuilder = new ClientBuilder<>(BccClient::new, "GlobalCredentials");
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
     * @return BindResourceLevelComplianceResponse
     */
    public BindResourceLevelComplianceResponse bindResourceLevelCompliance(BindResourceLevelComplianceRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.bindResourceLevelCompliance);
    }

    /**
     * 绑定资源等级合规规则
     *
     * 资源分级绑定合规规则，会导致属于改等级的资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindResourceLevelComplianceRequest 请求对象
     * @return SyncInvoker<BindResourceLevelComplianceRequest, BindResourceLevelComplianceResponse>
     */
    public SyncInvoker<BindResourceLevelComplianceRequest, BindResourceLevelComplianceResponse> bindResourceLevelComplianceInvoker(
        BindResourceLevelComplianceRequest request) {
        return new SyncInvoker<>(request, BccMeta.bindResourceLevelCompliance, hcClient);
    }

    /**
     * 指定资源等级
     *
     * 手动更改资源的等级，可能会导致资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourcesLevelRequest 请求对象
     * @return ChangeResourcesLevelResponse
     */
    public ChangeResourcesLevelResponse changeResourcesLevel(ChangeResourcesLevelRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.changeResourcesLevel);
    }

    /**
     * 指定资源等级
     *
     * 手动更改资源的等级，可能会导致资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourcesLevelRequest 请求对象
     * @return SyncInvoker<ChangeResourcesLevelRequest, ChangeResourcesLevelResponse>
     */
    public SyncInvoker<ChangeResourcesLevelRequest, ChangeResourcesLevelResponse> changeResourcesLevelInvoker(
        ChangeResourcesLevelRequest request) {
        return new SyncInvoker<>(request, BccMeta.changeResourcesLevel, hcClient);
    }

    /**
     * 新建自定义合规规则
     *
     * 新建自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComplianceRuleRequest 请求对象
     * @return CreateComplianceRuleResponse
     */
    public CreateComplianceRuleResponse createComplianceRule(CreateComplianceRuleRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.createComplianceRule);
    }

    /**
     * 新建自定义合规规则
     *
     * 新建自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComplianceRuleRequest 请求对象
     * @return SyncInvoker<CreateComplianceRuleRequest, CreateComplianceRuleResponse>
     */
    public SyncInvoker<CreateComplianceRuleRequest, CreateComplianceRuleResponse> createComplianceRuleInvoker(
        CreateComplianceRuleRequest request) {
        return new SyncInvoker<>(request, BccMeta.createComplianceRule, hcClient);
    }

    /**
     * 新建策略
     *
     * 新建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.createPolicy);
    }

    /**
     * 新建策略
     *
     * 新建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<>(request, BccMeta.createPolicy, hcClient);
    }

    /**
     * 创建报告配置
     *
     * 创建报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportSettingRequest 请求对象
     * @return CreateReportSettingResponse
     */
    public CreateReportSettingResponse createReportSetting(CreateReportSettingRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.createReportSetting);
    }

    /**
     * 创建报告配置
     *
     * 创建报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportSettingRequest 请求对象
     * @return SyncInvoker<CreateReportSettingRequest, CreateReportSettingResponse>
     */
    public SyncInvoker<CreateReportSettingRequest, CreateReportSettingResponse> createReportSettingInvoker(
        CreateReportSettingRequest request) {
        return new SyncInvoker<>(request, BccMeta.createReportSetting, hcClient);
    }

    /**
     * 新增资源分级
     *
     * 新增资源分级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourcesLevelRequest 请求对象
     * @return CreateResourcesLevelResponse
     */
    public CreateResourcesLevelResponse createResourcesLevel(CreateResourcesLevelRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.createResourcesLevel);
    }

    /**
     * 新增资源分级
     *
     * 新增资源分级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourcesLevelRequest 请求对象
     * @return SyncInvoker<CreateResourcesLevelRequest, CreateResourcesLevelResponse>
     */
    public SyncInvoker<CreateResourcesLevelRequest, CreateResourcesLevelResponse> createResourcesLevelInvoker(
        CreateResourcesLevelRequest request) {
        return new SyncInvoker<>(request, BccMeta.createResourcesLevel, hcClient);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.createTemplate);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<>(request, BccMeta.createTemplate, hcClient);
    }

    /**
     * 删除自定义合规规则
     *
     * 删除自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComplianceRuleRequest 请求对象
     * @return DeleteComplianceRuleResponse
     */
    public DeleteComplianceRuleResponse deleteComplianceRule(DeleteComplianceRuleRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.deleteComplianceRule);
    }

    /**
     * 删除自定义合规规则
     *
     * 删除自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComplianceRuleRequest 请求对象
     * @return SyncInvoker<DeleteComplianceRuleRequest, DeleteComplianceRuleResponse>
     */
    public SyncInvoker<DeleteComplianceRuleRequest, DeleteComplianceRuleResponse> deleteComplianceRuleInvoker(
        DeleteComplianceRuleRequest request) {
        return new SyncInvoker<>(request, BccMeta.deleteComplianceRule, hcClient);
    }

    /**
     * 删除指定策略
     *
     * 删除指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.deletePolicy);
    }

    /**
     * 删除指定策略
     *
     * 删除指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<>(request, BccMeta.deletePolicy, hcClient);
    }

    /**
     * 删除指定的报告
     *
     * 删除指定的报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportRequest 请求对象
     * @return DeleteReportResponse
     */
    public DeleteReportResponse deleteReport(DeleteReportRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.deleteReport);
    }

    /**
     * 删除指定的报告
     *
     * 删除指定的报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportRequest 请求对象
     * @return SyncInvoker<DeleteReportRequest, DeleteReportResponse>
     */
    public SyncInvoker<DeleteReportRequest, DeleteReportResponse> deleteReportInvoker(DeleteReportRequest request) {
        return new SyncInvoker<>(request, BccMeta.deleteReport, hcClient);
    }

    /**
     * 删除报告配置
     *
     * 删除报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportSettingRequest 请求对象
     * @return DeleteReportSettingResponse
     */
    public DeleteReportSettingResponse deleteReportSetting(DeleteReportSettingRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.deleteReportSetting);
    }

    /**
     * 删除报告配置
     *
     * 删除报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportSettingRequest 请求对象
     * @return SyncInvoker<DeleteReportSettingRequest, DeleteReportSettingResponse>
     */
    public SyncInvoker<DeleteReportSettingRequest, DeleteReportSettingResponse> deleteReportSettingInvoker(
        DeleteReportSettingRequest request) {
        return new SyncInvoker<>(request, BccMeta.deleteReportSetting, hcClient);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.deleteTemplate);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<>(request, BccMeta.deleteTemplate, hcClient);
    }

    /**
     * 用户授权开启BCC
     *
     * 用户授权开启BCC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return EnableDomainResponse
     */
    public EnableDomainResponse enableDomain(EnableDomainRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.enableDomain);
    }

    /**
     * 用户授权开启BCC
     *
     * 用户授权开启BCC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return SyncInvoker<EnableDomainRequest, EnableDomainResponse>
     */
    public SyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainInvoker(EnableDomainRequest request) {
        return new SyncInvoker<>(request, BccMeta.enableDomain, hcClient);
    }

    /**
     * 查询告警规则列表
     *
     * 查询告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRulesRequest 请求对象
     * @return ListAlarmRulesResponse
     */
    public ListAlarmRulesResponse listAlarmRules(ListAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listAlarmRules);
    }

    /**
     * 查询告警规则列表
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
        return new SyncInvoker<>(request, BccMeta.listAlarmRules, hcClient);
    }

    /**
     * 查询告警列表
     *
     * 查询告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return ListAlarmsResponse
     */
    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listAlarms);
    }

    /**
     * 查询告警列表
     *
     * 查询告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return SyncInvoker<ListAlarmsRequest, ListAlarmsResponse>
     */
    public SyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsInvoker(ListAlarmsRequest request) {
        return new SyncInvoker<>(request, BccMeta.listAlarms, hcClient);
    }

    /**
     * 列举合规规则
     *
     * 列举合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComplianceRuleRequest 请求对象
     * @return ListComplianceRuleResponse
     */
    public ListComplianceRuleResponse listComplianceRule(ListComplianceRuleRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listComplianceRule);
    }

    /**
     * 列举合规规则
     *
     * 列举合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComplianceRuleRequest 请求对象
     * @return SyncInvoker<ListComplianceRuleRequest, ListComplianceRuleResponse>
     */
    public SyncInvoker<ListComplianceRuleRequest, ListComplianceRuleResponse> listComplianceRuleInvoker(
        ListComplianceRuleRequest request) {
        return new SyncInvoker<>(request, BccMeta.listComplianceRule, hcClient);
    }

    /**
     * 查询事件数据
     *
     * 查询事件数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listEvents);
    }

    /**
     * 查询事件数据
     *
     * 查询事件数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<>(request, BccMeta.listEvents, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 查询监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return ListMetricsResponse
     */
    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listMetrics);
    }

    /**
     * 查询监控数据
     *
     * 查询监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return SyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public SyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsInvoker(ListMetricsRequest request) {
        return new SyncInvoker<>(request, BccMeta.listMetrics, hcClient);
    }

    /**
     * 列举策略
     *
     * 列举策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyRequest 请求对象
     * @return ListOrganizationPolicyResponse
     */
    public ListOrganizationPolicyResponse listOrganizationPolicy(ListOrganizationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listOrganizationPolicy);
    }

    /**
     * 列举策略
     *
     * 列举策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyRequest 请求对象
     * @return SyncInvoker<ListOrganizationPolicyRequest, ListOrganizationPolicyResponse>
     */
    public SyncInvoker<ListOrganizationPolicyRequest, ListOrganizationPolicyResponse> listOrganizationPolicyInvoker(
        ListOrganizationPolicyRequest request) {
        return new SyncInvoker<>(request, BccMeta.listOrganizationPolicy, hcClient);
    }

    /**
     * 列举策略
     *
     * 列举策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listPolicy);
    }

    /**
     * 列举策略
     *
     * 列举策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<>(request, BccMeta.listPolicy, hcClient);
    }

    /**
     * 查询报告配置列表
     *
     * 查询报告配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportSettingsRequest 请求对象
     * @return ListReportSettingsResponse
     */
    public ListReportSettingsResponse listReportSettings(ListReportSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listReportSettings);
    }

    /**
     * 查询报告配置列表
     *
     * 查询报告配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportSettingsRequest 请求对象
     * @return SyncInvoker<ListReportSettingsRequest, ListReportSettingsResponse>
     */
    public SyncInvoker<ListReportSettingsRequest, ListReportSettingsResponse> listReportSettingsInvoker(
        ListReportSettingsRequest request) {
        return new SyncInvoker<>(request, BccMeta.listReportSettings, hcClient);
    }

    /**
     * 查询报告列表
     *
     * 查询报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return ListReportsResponse
     */
    public ListReportsResponse listReports(ListReportsRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listReports);
    }

    /**
     * 查询报告列表
     *
     * 查询报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return SyncInvoker<ListReportsRequest, ListReportsResponse>
     */
    public SyncInvoker<ListReportsRequest, ListReportsResponse> listReportsInvoker(ListReportsRequest request) {
        return new SyncInvoker<>(request, BccMeta.listReports, hcClient);
    }

    /**
     * 查询副本列表
     *
     * 查询副本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceCopiesRequest 请求对象
     * @return ListResourceCopiesResponse
     */
    public ListResourceCopiesResponse listResourceCopies(ListResourceCopiesRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listResourceCopies);
    }

    /**
     * 查询副本列表
     *
     * 查询副本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceCopiesRequest 请求对象
     * @return SyncInvoker<ListResourceCopiesRequest, ListResourceCopiesResponse>
     */
    public SyncInvoker<ListResourceCopiesRequest, ListResourceCopiesResponse> listResourceCopiesInvoker(
        ListResourceCopiesRequest request) {
        return new SyncInvoker<>(request, BccMeta.listResourceCopies, hcClient);
    }

    /**
     * 查询资源列表
     *
     * 查询资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listResources);
    }

    /**
     * 查询资源列表
     *
     * 查询资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<>(request, BccMeta.listResources, hcClient);
    }

    /**
     * 列举资源分级
     *
     * 列举资源分级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesLevelRequest 请求对象
     * @return ListResourcesLevelResponse
     */
    public ListResourcesLevelResponse listResourcesLevel(ListResourcesLevelRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listResourcesLevel);
    }

    /**
     * 列举资源分级
     *
     * 列举资源分级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesLevelRequest 请求对象
     * @return SyncInvoker<ListResourcesLevelRequest, ListResourcesLevelResponse>
     */
    public SyncInvoker<ListResourcesLevelRequest, ListResourcesLevelResponse> listResourcesLevelInvoker(
        ListResourcesLevelRequest request) {
        return new SyncInvoker<>(request, BccMeta.listResourcesLevel, hcClient);
    }

    /**
     * 列举资源分级已指定的标签
     *
     * 列举资源分级已指定的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesLevelTagsRequest 请求对象
     * @return ListResourcesLevelTagsResponse
     */
    public ListResourcesLevelTagsResponse listResourcesLevelTags(ListResourcesLevelTagsRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listResourcesLevelTags);
    }

    /**
     * 列举资源分级已指定的标签
     *
     * 列举资源分级已指定的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesLevelTagsRequest 请求对象
     * @return SyncInvoker<ListResourcesLevelTagsRequest, ListResourcesLevelTagsResponse>
     */
    public SyncInvoker<ListResourcesLevelTagsRequest, ListResourcesLevelTagsResponse> listResourcesLevelTagsInvoker(
        ListResourcesLevelTagsRequest request) {
        return new SyncInvoker<>(request, BccMeta.listResourcesLevelTags, hcClient);
    }

    /**
     * 查询支持的region列表
     *
     * BCC支持的region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportedRegionRequest 请求对象
     * @return ListSupportedRegionResponse
     */
    public ListSupportedRegionResponse listSupportedRegion(ListSupportedRegionRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listSupportedRegion);
    }

    /**
     * 查询支持的region列表
     *
     * BCC支持的region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportedRegionRequest 请求对象
     * @return SyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse>
     */
    public SyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse> listSupportedRegionInvoker(
        ListSupportedRegionRequest request) {
        return new SyncInvoker<>(request, BccMeta.listSupportedRegion, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, BccMeta.listTasks, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<>(request, BccMeta.listTemplates, hcClient);
    }

    /**
     * 列举存储库
     *
     * 列举存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultRequest 请求对象
     * @return ListVaultResponse
     */
    public ListVaultResponse listVault(ListVaultRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listVault);
    }

    /**
     * 列举存储库
     *
     * 列举存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultRequest 请求对象
     * @return SyncInvoker<ListVaultRequest, ListVaultResponse>
     */
    public SyncInvoker<ListVaultRequest, ListVaultResponse> listVaultInvoker(ListVaultRequest request) {
        return new SyncInvoker<>(request, BccMeta.listVault, hcClient);
    }

    /**
     * 查询使用最高的存储库
     *
     * 查询使用最高的存储库，按使用容量或者按使用率排序返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultTopsRequest 请求对象
     * @return ListVaultTopsResponse
     */
    public ListVaultTopsResponse listVaultTops(ListVaultTopsRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.listVaultTops);
    }

    /**
     * 查询使用最高的存储库
     *
     * 查询使用最高的存储库，按使用容量或者按使用率排序返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultTopsRequest 请求对象
     * @return SyncInvoker<ListVaultTopsRequest, ListVaultTopsResponse>
     */
    public SyncInvoker<ListVaultTopsRequest, ListVaultTopsResponse> listVaultTopsInvoker(ListVaultTopsRequest request) {
        return new SyncInvoker<>(request, BccMeta.listVaultTops, hcClient);
    }

    /**
     * 修改资源分级
     *
     * 修改资源分级，修改资源等级的应用类型、应用规则、合规规则id时，可能会导致某些资源的归属等级发生变动，或资源的合规结果发生更改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyResourceLevelRequest 请求对象
     * @return ModifyResourceLevelResponse
     */
    public ModifyResourceLevelResponse modifyResourceLevel(ModifyResourceLevelRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.modifyResourceLevel);
    }

    /**
     * 修改资源分级
     *
     * 修改资源分级，修改资源等级的应用类型、应用规则、合规规则id时，可能会导致某些资源的归属等级发生变动，或资源的合规结果发生更改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyResourceLevelRequest 请求对象
     * @return SyncInvoker<ModifyResourceLevelRequest, ModifyResourceLevelResponse>
     */
    public SyncInvoker<ModifyResourceLevelRequest, ModifyResourceLevelResponse> modifyResourceLevelInvoker(
        ModifyResourceLevelRequest request) {
        return new SyncInvoker<>(request, BccMeta.modifyResourceLevel, hcClient);
    }

    /**
     * 资源变化通知
     *
     * 资源变化通知，当资源的属性变动时，可能会改变资源归属的等级，进而可能导致合规结果的变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifyResourceChangeRequest 请求对象
     * @return NotifyResourceChangeResponse
     */
    public NotifyResourceChangeResponse notifyResourceChange(NotifyResourceChangeRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.notifyResourceChange);
    }

    /**
     * 资源变化通知
     *
     * 资源变化通知，当资源的属性变动时，可能会改变资源归属的等级，进而可能导致合规结果的变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifyResourceChangeRequest 请求对象
     * @return SyncInvoker<NotifyResourceChangeRequest, NotifyResourceChangeResponse>
     */
    public SyncInvoker<NotifyResourceChangeRequest, NotifyResourceChangeResponse> notifyResourceChangeInvoker(
        NotifyResourceChangeRequest request) {
        return new SyncInvoker<>(request, BccMeta.notifyResourceChange, hcClient);
    }

    /**
     * 删除资源分级
     *
     * 删除资源分级，删除资源等级会导致归属于该等级的资源的合规结果清空
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveResourceLevelRequest 请求对象
     * @return RemoveResourceLevelResponse
     */
    public RemoveResourceLevelResponse removeResourceLevel(RemoveResourceLevelRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.removeResourceLevel);
    }

    /**
     * 删除资源分级
     *
     * 删除资源分级，删除资源等级会导致归属于该等级的资源的合规结果清空
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveResourceLevelRequest 请求对象
     * @return SyncInvoker<RemoveResourceLevelRequest, RemoveResourceLevelResponse>
     */
    public SyncInvoker<RemoveResourceLevelRequest, RemoveResourceLevelResponse> removeResourceLevelInvoker(
        RemoveResourceLevelRequest request) {
        return new SyncInvoker<>(request, BccMeta.removeResourceLevel, hcClient);
    }

    /**
     * 配置资源保护
     *
     * 配置资源保护，资源保护情况发生变动后，相关资源的合规结果可能会发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProtectionConfigurationRequest 请求对象
     * @return SetProtectionConfigurationResponse
     */
    public SetProtectionConfigurationResponse setProtectionConfiguration(SetProtectionConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.setProtectionConfiguration);
    }

    /**
     * 配置资源保护
     *
     * 配置资源保护，资源保护情况发生变动后，相关资源的合规结果可能会发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProtectionConfigurationRequest 请求对象
     * @return SyncInvoker<SetProtectionConfigurationRequest, SetProtectionConfigurationResponse>
     */
    public SyncInvoker<SetProtectionConfigurationRequest, SetProtectionConfigurationResponse> setProtectionConfigurationInvoker(
        SetProtectionConfigurationRequest request) {
        return new SyncInvoker<>(request, BccMeta.setProtectionConfiguration, hcClient);
    }

    /**
     * 查询告警统计信息
     *
     * 查询告警统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmSummaryRequest 请求对象
     * @return ShowAlarmSummaryResponse
     */
    public ShowAlarmSummaryResponse showAlarmSummary(ShowAlarmSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showAlarmSummary);
    }

    /**
     * 查询告警统计信息
     *
     * 查询告警统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmSummaryRequest 请求对象
     * @return SyncInvoker<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse>
     */
    public SyncInvoker<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> showAlarmSummaryInvoker(
        ShowAlarmSummaryRequest request) {
        return new SyncInvoker<>(request, BccMeta.showAlarmSummary, hcClient);
    }

    /**
     * 查看自定义合规规则详情
     *
     * 查看自定义合规规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceRuleRequest 请求对象
     * @return ShowComplianceRuleResponse
     */
    public ShowComplianceRuleResponse showComplianceRule(ShowComplianceRuleRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showComplianceRule);
    }

    /**
     * 查看自定义合规规则详情
     *
     * 查看自定义合规规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceRuleRequest 请求对象
     * @return SyncInvoker<ShowComplianceRuleRequest, ShowComplianceRuleResponse>
     */
    public SyncInvoker<ShowComplianceRuleRequest, ShowComplianceRuleResponse> showComplianceRuleInvoker(
        ShowComplianceRuleRequest request) {
        return new SyncInvoker<>(request, BccMeta.showComplianceRule, hcClient);
    }

    /**
     * 查询BCC开启情况
     *
     * 查询BCC开启情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return ShowDomainResponse
     */
    public ShowDomainResponse showDomain(ShowDomainRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showDomain);
    }

    /**
     * 查询BCC开启情况
     *
     * 查询BCC开启情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return SyncInvoker<ShowDomainRequest, ShowDomainResponse>
     */
    public SyncInvoker<ShowDomainRequest, ShowDomainResponse> showDomainInvoker(ShowDomainRequest request) {
        return new SyncInvoker<>(request, BccMeta.showDomain, hcClient);
    }

    /**
     * 查询指定组织策略
     *
     * 查询指定组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyRequest 请求对象
     * @return ShowOrganizationPolicyResponse
     */
    public ShowOrganizationPolicyResponse showOrganizationPolicy(ShowOrganizationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showOrganizationPolicy);
    }

    /**
     * 查询指定组织策略
     *
     * 查询指定组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyRequest 请求对象
     * @return SyncInvoker<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse>
     */
    public SyncInvoker<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse> showOrganizationPolicyInvoker(
        ShowOrganizationPolicyRequest request) {
        return new SyncInvoker<>(request, BccMeta.showOrganizationPolicy, hcClient);
    }

    /**
     * 查询指定策略
     *
     * 查询指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showPolicy);
    }

    /**
     * 查询指定策略
     *
     * 查询指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<>(request, BccMeta.showPolicy, hcClient);
    }

    /**
     * 查询报告详情
     *
     * 查询报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return ShowReportResponse
     */
    public ShowReportResponse showReport(ShowReportRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showReport);
    }

    /**
     * 查询报告详情
     *
     * 查询报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return SyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public SyncInvoker<ShowReportRequest, ShowReportResponse> showReportInvoker(ShowReportRequest request) {
        return new SyncInvoker<>(request, BccMeta.showReport, hcClient);
    }

    /**
     * 查询报告详情类数据
     *
     * 查询指定租户下的指定报告的详情类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportResourceDetailsDataRequest 请求对象
     * @return ShowReportResourceDetailsDataResponse
     */
    public ShowReportResourceDetailsDataResponse showReportResourceDetailsData(
        ShowReportResourceDetailsDataRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showReportResourceDetailsData);
    }

    /**
     * 查询报告详情类数据
     *
     * 查询指定租户下的指定报告的详情类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportResourceDetailsDataRequest 请求对象
     * @return SyncInvoker<ShowReportResourceDetailsDataRequest, ShowReportResourceDetailsDataResponse>
     */
    public SyncInvoker<ShowReportResourceDetailsDataRequest, ShowReportResourceDetailsDataResponse> showReportResourceDetailsDataInvoker(
        ShowReportResourceDetailsDataRequest request) {
        return new SyncInvoker<>(request, BccMeta.showReportResourceDetailsData, hcClient);
    }

    /**
     * 查询报告配置
     *
     * 查询报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSettingRequest 请求对象
     * @return ShowReportSettingResponse
     */
    public ShowReportSettingResponse showReportSetting(ShowReportSettingRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showReportSetting);
    }

    /**
     * 查询报告配置
     *
     * 查询报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSettingRequest 请求对象
     * @return SyncInvoker<ShowReportSettingRequest, ShowReportSettingResponse>
     */
    public SyncInvoker<ShowReportSettingRequest, ShowReportSettingResponse> showReportSettingInvoker(
        ShowReportSettingRequest request) {
        return new SyncInvoker<>(request, BccMeta.showReportSetting, hcClient);
    }

    /**
     * 查询报告摘要类数据
     *
     * 查询指定租户下的指定报告的摘要类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSummaryDataRequest 请求对象
     * @return ShowReportSummaryDataResponse
     */
    public ShowReportSummaryDataResponse showReportSummaryData(ShowReportSummaryDataRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showReportSummaryData);
    }

    /**
     * 查询报告摘要类数据
     *
     * 查询指定租户下的指定报告的摘要类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSummaryDataRequest 请求对象
     * @return SyncInvoker<ShowReportSummaryDataRequest, ShowReportSummaryDataResponse>
     */
    public SyncInvoker<ShowReportSummaryDataRequest, ShowReportSummaryDataResponse> showReportSummaryDataInvoker(
        ShowReportSummaryDataRequest request) {
        return new SyncInvoker<>(request, BccMeta.showReportSummaryData, hcClient);
    }

    /**
     * 查询报告详情类数据
     *
     * 查询指定租户下的指定报告的详情类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportTaskDetailsDataRequest 请求对象
     * @return ShowReportTaskDetailsDataResponse
     */
    public ShowReportTaskDetailsDataResponse showReportTaskDetailsData(ShowReportTaskDetailsDataRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showReportTaskDetailsData);
    }

    /**
     * 查询报告详情类数据
     *
     * 查询指定租户下的指定报告的详情类数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportTaskDetailsDataRequest 请求对象
     * @return SyncInvoker<ShowReportTaskDetailsDataRequest, ShowReportTaskDetailsDataResponse>
     */
    public SyncInvoker<ShowReportTaskDetailsDataRequest, ShowReportTaskDetailsDataResponse> showReportTaskDetailsDataInvoker(
        ShowReportTaskDetailsDataRequest request) {
        return new SyncInvoker<>(request, BccMeta.showReportTaskDetailsData, hcClient);
    }

    /**
     * 查询副本摘要
     *
     * get copies summary
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceCopiesSummaryRequest 请求对象
     * @return ShowResourceCopiesSummaryResponse
     */
    public ShowResourceCopiesSummaryResponse showResourceCopiesSummary(ShowResourceCopiesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showResourceCopiesSummary);
    }

    /**
     * 查询副本摘要
     *
     * get copies summary
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceCopiesSummaryRequest 请求对象
     * @return SyncInvoker<ShowResourceCopiesSummaryRequest, ShowResourceCopiesSummaryResponse>
     */
    public SyncInvoker<ShowResourceCopiesSummaryRequest, ShowResourceCopiesSummaryResponse> showResourceCopiesSummaryInvoker(
        ShowResourceCopiesSummaryRequest request) {
        return new SyncInvoker<>(request, BccMeta.showResourceCopiesSummary, hcClient);
    }

    /**
     * 查看资源详情
     *
     * 查看资源详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return ShowResourceDetailResponse
     */
    public ShowResourceDetailResponse showResourceDetail(ShowResourceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showResourceDetail);
    }

    /**
     * 查看资源详情
     *
     * 查看资源详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse>
     */
    public SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetailInvoker(
        ShowResourceDetailRequest request) {
        return new SyncInvoker<>(request, BccMeta.showResourceDetail, hcClient);
    }

    /**
     * 查询资源统计
     *
     * 查询资源统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcesSummaryRequest 请求对象
     * @return ShowResourcesSummaryResponse
     */
    public ShowResourcesSummaryResponse showResourcesSummary(ShowResourcesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showResourcesSummary);
    }

    /**
     * 查询资源统计
     *
     * 查询资源统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcesSummaryRequest 请求对象
     * @return SyncInvoker<ShowResourcesSummaryRequest, ShowResourcesSummaryResponse>
     */
    public SyncInvoker<ShowResourcesSummaryRequest, ShowResourcesSummaryResponse> showResourcesSummaryInvoker(
        ShowResourcesSummaryRequest request) {
        return new SyncInvoker<>(request, BccMeta.showResourcesSummary, hcClient);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showTask);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<>(request, BccMeta.showTask, hcClient);
    }

    /**
     * 查询任务统计信息
     *
     * 查询任务统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskStatusSummaryRequest 请求对象
     * @return ShowTaskStatusSummaryResponse
     */
    public ShowTaskStatusSummaryResponse showTaskStatusSummary(ShowTaskStatusSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showTaskStatusSummary);
    }

    /**
     * 查询任务统计信息
     *
     * 查询任务统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskStatusSummaryRequest 请求对象
     * @return SyncInvoker<ShowTaskStatusSummaryRequest, ShowTaskStatusSummaryResponse>
     */
    public SyncInvoker<ShowTaskStatusSummaryRequest, ShowTaskStatusSummaryResponse> showTaskStatusSummaryInvoker(
        ShowTaskStatusSummaryRequest request) {
        return new SyncInvoker<>(request, BccMeta.showTaskStatusSummary, hcClient);
    }

    /**
     * 查询任务统计信息
     *
     * 查询任务统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskTypeSummaryRequest 请求对象
     * @return ShowTaskTypeSummaryResponse
     */
    public ShowTaskTypeSummaryResponse showTaskTypeSummary(ShowTaskTypeSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showTaskTypeSummary);
    }

    /**
     * 查询任务统计信息
     *
     * 查询任务统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskTypeSummaryRequest 请求对象
     * @return SyncInvoker<ShowTaskTypeSummaryRequest, ShowTaskTypeSummaryResponse>
     */
    public SyncInvoker<ShowTaskTypeSummaryRequest, ShowTaskTypeSummaryResponse> showTaskTypeSummaryInvoker(
        ShowTaskTypeSummaryRequest request) {
        return new SyncInvoker<>(request, BccMeta.showTaskTypeSummary, hcClient);
    }

    /**
     * 查询模板
     *
     * 查询模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateRequest 请求对象
     * @return ShowTemplateResponse
     */
    public ShowTemplateResponse showTemplate(ShowTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showTemplate);
    }

    /**
     * 查询模板
     *
     * 查询模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateRequest 请求对象
     * @return SyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public SyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateInvoker(ShowTemplateRequest request) {
        return new SyncInvoker<>(request, BccMeta.showTemplate, hcClient);
    }

    /**
     * 查看指定存储库
     *
     * 查看指定存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultRequest 请求对象
     * @return ShowVaultResponse
     */
    public ShowVaultResponse showVault(ShowVaultRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showVault);
    }

    /**
     * 查看指定存储库
     *
     * 查看指定存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultRequest 请求对象
     * @return SyncInvoker<ShowVaultRequest, ShowVaultResponse>
     */
    public SyncInvoker<ShowVaultRequest, ShowVaultResponse> showVaultInvoker(ShowVaultRequest request) {
        return new SyncInvoker<>(request, BccMeta.showVault, hcClient);
    }

    /**
     * 查看租户的Vault的统计信息
     *
     * 查看租户Vault的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultSummaryRequest 请求对象
     * @return ShowVaultSummaryResponse
     */
    public ShowVaultSummaryResponse showVaultSummary(ShowVaultSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.showVaultSummary);
    }

    /**
     * 查看租户的Vault的统计信息
     *
     * 查看租户Vault的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultSummaryRequest 请求对象
     * @return SyncInvoker<ShowVaultSummaryRequest, ShowVaultSummaryResponse>
     */
    public SyncInvoker<ShowVaultSummaryRequest, ShowVaultSummaryResponse> showVaultSummaryInvoker(
        ShowVaultSummaryRequest request) {
        return new SyncInvoker<>(request, BccMeta.showVaultSummary, hcClient);
    }

    /**
     * 解绑资源等级合规规则
     *
     * 资源分级绑定合规规则，修改资源等级的合规规则，会导致属于改等级的资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindResourceLevelComplianceRequest 请求对象
     * @return UnbindResourceLevelComplianceResponse
     */
    public UnbindResourceLevelComplianceResponse unbindResourceLevelCompliance(
        UnbindResourceLevelComplianceRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.unbindResourceLevelCompliance);
    }

    /**
     * 解绑资源等级合规规则
     *
     * 资源分级绑定合规规则，修改资源等级的合规规则，会导致属于改等级的资源的合规结果发生变化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindResourceLevelComplianceRequest 请求对象
     * @return SyncInvoker<UnbindResourceLevelComplianceRequest, UnbindResourceLevelComplianceResponse>
     */
    public SyncInvoker<UnbindResourceLevelComplianceRequest, UnbindResourceLevelComplianceResponse> unbindResourceLevelComplianceInvoker(
        UnbindResourceLevelComplianceRequest request) {
        return new SyncInvoker<>(request, BccMeta.unbindResourceLevelCompliance, hcClient);
    }

    /**
     * 更新自定义合规规则
     *
     * 更新自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComplianceRuleRequest 请求对象
     * @return UpdateComplianceRuleResponse
     */
    public UpdateComplianceRuleResponse updateComplianceRule(UpdateComplianceRuleRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.updateComplianceRule);
    }

    /**
     * 更新自定义合规规则
     *
     * 更新自定义合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComplianceRuleRequest 请求对象
     * @return SyncInvoker<UpdateComplianceRuleRequest, UpdateComplianceRuleResponse>
     */
    public SyncInvoker<UpdateComplianceRuleRequest, UpdateComplianceRuleResponse> updateComplianceRuleInvoker(
        UpdateComplianceRuleRequest request) {
        return new SyncInvoker<>(request, BccMeta.updateComplianceRule, hcClient);
    }

    /**
     * 更新指定策略
     *
     * 更新指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.updatePolicy);
    }

    /**
     * 更新指定策略
     *
     * 更新指定策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<>(request, BccMeta.updatePolicy, hcClient);
    }

    /**
     * 修改报告配置
     *
     * 更新报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportSettingRequest 请求对象
     * @return UpdateReportSettingResponse
     */
    public UpdateReportSettingResponse updateReportSetting(UpdateReportSettingRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.updateReportSetting);
    }

    /**
     * 修改报告配置
     *
     * 更新报告配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportSettingRequest 请求对象
     * @return SyncInvoker<UpdateReportSettingRequest, UpdateReportSettingResponse>
     */
    public SyncInvoker<UpdateReportSettingRequest, UpdateReportSettingResponse> updateReportSettingInvoker(
        UpdateReportSettingRequest request) {
        return new SyncInvoker<>(request, BccMeta.updateReportSetting, hcClient);
    }

    /**
     * 修改模板
     *
     * 修改模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, BccMeta.updateTemplate);
    }

    /**
     * 修改模板
     *
     * 修改模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateInvoker(
        UpdateTemplateRequest request) {
        return new SyncInvoker<>(request, BccMeta.updateTemplate, hcClient);
    }

}
