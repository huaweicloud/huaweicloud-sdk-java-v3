package com.huaweicloud.sdk.bcc.v1;

import com.huaweicloud.sdk.bcc.v1.model.BackupComplianceRule;
import com.huaweicloud.sdk.bcc.v1.model.BindComplianceBody;
import com.huaweicloud.sdk.bcc.v1.model.BindResourceLevelComplianceRequest;
import com.huaweicloud.sdk.bcc.v1.model.BindResourceLevelComplianceResponse;
import com.huaweicloud.sdk.bcc.v1.model.ChangeResourcesLevelRequest;
import com.huaweicloud.sdk.bcc.v1.model.ChangeResourcesLevelResponse;
import com.huaweicloud.sdk.bcc.v1.model.ConfigureProtectionBody;
import com.huaweicloud.sdk.bcc.v1.model.CreateBccPolicyRequestBody;
import com.huaweicloud.sdk.bcc.v1.model.CreateComplianceRuleRequest;
import com.huaweicloud.sdk.bcc.v1.model.CreateComplianceRuleRequestBody;
import com.huaweicloud.sdk.bcc.v1.model.CreateComplianceRuleResponse;
import com.huaweicloud.sdk.bcc.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.CreateReportSettingRequest;
import com.huaweicloud.sdk.bcc.v1.model.CreateReportSettingResponse;
import com.huaweicloud.sdk.bcc.v1.model.CreateResourceLevelBody;
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
import com.huaweicloud.sdk.bcc.v1.model.ModifyResourceLevelBody;
import com.huaweicloud.sdk.bcc.v1.model.ModifyResourceLevelRequest;
import com.huaweicloud.sdk.bcc.v1.model.ModifyResourceLevelResponse;
import com.huaweicloud.sdk.bcc.v1.model.NotifyResourceChangeRequest;
import com.huaweicloud.sdk.bcc.v1.model.NotifyResourceChangeResponse;
import com.huaweicloud.sdk.bcc.v1.model.ProtectionConfigurationResponseItem;
import com.huaweicloud.sdk.bcc.v1.model.RemoveResourceLevelRequest;
import com.huaweicloud.sdk.bcc.v1.model.RemoveResourceLevelResponse;
import com.huaweicloud.sdk.bcc.v1.model.ReportSetting;
import com.huaweicloud.sdk.bcc.v1.model.ResourceNotifyBody;
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
import com.huaweicloud.sdk.bcc.v1.model.TagsItem;
import com.huaweicloud.sdk.bcc.v1.model.TemplateSetting;
import com.huaweicloud.sdk.bcc.v1.model.UnbindResourceLevelComplianceRequest;
import com.huaweicloud.sdk.bcc.v1.model.UnbindResourceLevelComplianceResponse;
import com.huaweicloud.sdk.bcc.v1.model.UpdateComplianceRuleRequest;
import com.huaweicloud.sdk.bcc.v1.model.UpdateComplianceRuleRequestBody;
import com.huaweicloud.sdk.bcc.v1.model.UpdateComplianceRuleResponse;
import com.huaweicloud.sdk.bcc.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.bcc.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.bcc.v1.model.UpdateReportSettingBody;
import com.huaweicloud.sdk.bcc.v1.model.UpdateReportSettingRequest;
import com.huaweicloud.sdk.bcc.v1.model.UpdateReportSettingResponse;
import com.huaweicloud.sdk.bcc.v1.model.UpdateResourceLevelBody;
import com.huaweicloud.sdk.bcc.v1.model.UpdateTemplateBody;
import com.huaweicloud.sdk.bcc.v1.model.UpdateTemplateRequest;
import com.huaweicloud.sdk.bcc.v1.model.UpdateTemplateResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class BccMeta {

    public static final HttpRequestDef<BindResourceLevelComplianceRequest, BindResourceLevelComplianceResponse> bindResourceLevelCompliance =
        genForBindResourceLevelCompliance();

    private static HttpRequestDef<BindResourceLevelComplianceRequest, BindResourceLevelComplianceResponse> genForBindResourceLevelCompliance() {
        // basic
        HttpRequestDef.Builder<BindResourceLevelComplianceRequest, BindResourceLevelComplianceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BindResourceLevelComplianceRequest.class,
                    BindResourceLevelComplianceResponse.class)
                .withName("BindResourceLevelCompliance")
                .withUri("/v1/{domain_id}/resource-levels/{level_id}/compliance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindResourceLevelComplianceRequest::getDomainId,
                BindResourceLevelComplianceRequest::setDomainId));
        builder.<String>withRequestField("level_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindResourceLevelComplianceRequest::getLevelId,
                BindResourceLevelComplianceRequest::setLevelId));
        builder.<BindComplianceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindComplianceBody.class),
            f -> f.withMarshaller(BindResourceLevelComplianceRequest::getBody,
                BindResourceLevelComplianceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeResourcesLevelRequest, ChangeResourcesLevelResponse> changeResourcesLevel =
        genForChangeResourcesLevel();

    private static HttpRequestDef<ChangeResourcesLevelRequest, ChangeResourcesLevelResponse> genForChangeResourcesLevel() {
        // basic
        HttpRequestDef.Builder<ChangeResourcesLevelRequest, ChangeResourcesLevelResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeResourcesLevelRequest.class, ChangeResourcesLevelResponse.class)
            .withName("ChangeResourcesLevel")
            .withUri("/v1/{domain_id}/resources/resource-level")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeResourcesLevelRequest::getDomainId, ChangeResourcesLevelRequest::setDomainId));
        builder.<UpdateResourceLevelBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResourceLevelBody.class),
            f -> f.withMarshaller(ChangeResourcesLevelRequest::getBody, ChangeResourcesLevelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComplianceRuleRequest, CreateComplianceRuleResponse> createComplianceRule =
        genForCreateComplianceRule();

    private static HttpRequestDef<CreateComplianceRuleRequest, CreateComplianceRuleResponse> genForCreateComplianceRule() {
        // basic
        HttpRequestDef.Builder<CreateComplianceRuleRequest, CreateComplianceRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateComplianceRuleRequest.class, CreateComplianceRuleResponse.class)
            .withName("CreateComplianceRule")
            .withUri("/v1/{domain_id}/backup/compliancerules")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComplianceRuleRequest::getDomainId, CreateComplianceRuleRequest::setDomainId));
        builder.<CreateComplianceRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateComplianceRuleRequestBody.class),
            f -> f.withMarshaller(CreateComplianceRuleRequest::getBody, CreateComplianceRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForCreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/{domain_id}/backup/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyRequest::getDomainId, CreatePolicyRequest::setDomainId));
        builder.<CreateBccPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBccPolicyRequestBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, CreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReportSettingRequest, CreateReportSettingResponse> createReportSetting =
        genForCreateReportSetting();

    private static HttpRequestDef<CreateReportSettingRequest, CreateReportSettingResponse> genForCreateReportSetting() {
        // basic
        HttpRequestDef.Builder<CreateReportSettingRequest, CreateReportSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReportSettingRequest.class, CreateReportSettingResponse.class)
                .withName("CreateReportSetting")
                .withUri("/v1/{domain_id}/report/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportSettingRequest::getDomainId, CreateReportSettingRequest::setDomainId));
        builder.<ReportSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReportSetting.class),
            f -> f.withMarshaller(CreateReportSettingRequest::getBody, CreateReportSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourcesLevelRequest, CreateResourcesLevelResponse> createResourcesLevel =
        genForCreateResourcesLevel();

    private static HttpRequestDef<CreateResourcesLevelRequest, CreateResourcesLevelResponse> genForCreateResourcesLevel() {
        // basic
        HttpRequestDef.Builder<CreateResourcesLevelRequest, CreateResourcesLevelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateResourcesLevelRequest.class, CreateResourcesLevelResponse.class)
            .withName("CreateResourcesLevel")
            .withUri("/v1/{domain_id}/resource-levels")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourcesLevelRequest::getDomainId, CreateResourcesLevelRequest::setDomainId));
        builder.<CreateResourceLevelBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceLevelBody.class),
            f -> f.withMarshaller(CreateResourcesLevelRequest::getBody, CreateResourcesLevelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForCreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForCreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v1/{domain_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTemplateRequest::getDomainId, CreateTemplateRequest::setDomainId));
        builder.<TemplateSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateSetting.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, CreateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComplianceRuleRequest, DeleteComplianceRuleResponse> deleteComplianceRule =
        genForDeleteComplianceRule();

    private static HttpRequestDef<DeleteComplianceRuleRequest, DeleteComplianceRuleResponse> genForDeleteComplianceRule() {
        // basic
        HttpRequestDef.Builder<DeleteComplianceRuleRequest, DeleteComplianceRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteComplianceRuleRequest.class, DeleteComplianceRuleResponse.class)
            .withName("DeleteComplianceRule")
            .withUri("/v1/{domain_id}/backup/compliancerules/{compliance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComplianceRuleRequest::getDomainId, DeleteComplianceRuleRequest::setDomainId));
        builder.<String>withRequestField("compliance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComplianceRuleRequest::getComplianceId,
                DeleteComplianceRuleRequest::setComplianceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/{domain_id}/backup/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getDomainId, DeletePolicyRequest::setDomainId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReportRequest, DeleteReportResponse> deleteReport = genForDeleteReport();

    private static HttpRequestDef<DeleteReportRequest, DeleteReportResponse> genForDeleteReport() {
        // basic
        HttpRequestDef.Builder<DeleteReportRequest, DeleteReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteReportRequest.class, DeleteReportResponse.class)
                .withName("DeleteReport")
                .withUri("/v1/{domain_id}/reports/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReportRequest::getDomainId, DeleteReportRequest::setDomainId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReportRequest::getReportId, DeleteReportRequest::setReportId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReportSettingRequest, DeleteReportSettingResponse> deleteReportSetting =
        genForDeleteReportSetting();

    private static HttpRequestDef<DeleteReportSettingRequest, DeleteReportSettingResponse> genForDeleteReportSetting() {
        // basic
        HttpRequestDef.Builder<DeleteReportSettingRequest, DeleteReportSettingResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteReportSettingRequest.class, DeleteReportSettingResponse.class)
            .withName("DeleteReportSetting")
            .withUri("/v1/{domain_id}/report/settings/{setting_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReportSettingRequest::getDomainId, DeleteReportSettingRequest::setDomainId));
        builder.<String>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReportSettingRequest::getSettingId, DeleteReportSettingRequest::setSettingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genForDeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genForDeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/{domain_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getDomainId, DeleteTemplateRequest::setDomainId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, DeleteTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDomainRequest, EnableDomainResponse> enableDomain = genForEnableDomain();

    private static HttpRequestDef<EnableDomainRequest, EnableDomainResponse> genForEnableDomain() {
        // basic
        HttpRequestDef.Builder<EnableDomainRequest, EnableDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableDomainRequest.class, EnableDomainResponse.class)
                .withName("EnableDomain")
                .withUri("/v1/{domain_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDomainRequest::getDomainId, EnableDomainRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRules =
        genForListAlarmRules();

    private static HttpRequestDef<ListAlarmRulesRequest, ListAlarmRulesResponse> genForListAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListAlarmRulesRequest, ListAlarmRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmRulesRequest.class, ListAlarmRulesResponse.class)
                .withName("ListAlarmRules")
                .withUri("/v1/{domain_id}/alarm-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getDomainId, ListAlarmRulesRequest::setDomainId));
        builder.<ListAlarmRulesRequest.NamespaceEnum>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmRulesRequest.NamespaceEnum.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getNamespace, ListAlarmRulesRequest::setNamespace));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getRegionId, ListAlarmRulesRequest::setRegionId));
        builder.<String>withRequestField("alarm_rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getAlarmRuleId, ListAlarmRulesRequest::setAlarmRuleId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getOffset, ListAlarmRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getLimit, ListAlarmRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> listAlarms = genForListAlarms();

    private static HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> genForListAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmsRequest, ListAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmsRequest.class, ListAlarmsResponse.class)
                .withName("ListAlarms")
                .withUri("/v1/{domain_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getDomainId, ListAlarmsRequest::setDomainId));
        builder.<ListAlarmsRequest.NamespaceEnum>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmsRequest.NamespaceEnum.class),
            f -> f.withMarshaller(ListAlarmsRequest::getNamespace, ListAlarmsRequest::setNamespace));
        builder.<ListAlarmsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAlarmsRequest::getStatus, ListAlarmsRequest::setStatus));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getRegionId, ListAlarmsRequest::setRegionId));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getResourceId, ListAlarmsRequest::setResourceId));
        builder.<String>withRequestField("alarm_rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getAlarmRuleId, ListAlarmsRequest::setAlarmRuleId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getStartTime, ListAlarmsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getEndTime, ListAlarmsRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getMarker, ListAlarmsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getLimit, ListAlarmsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComplianceRuleRequest, ListComplianceRuleResponse> listComplianceRule =
        genForListComplianceRule();

    private static HttpRequestDef<ListComplianceRuleRequest, ListComplianceRuleResponse> genForListComplianceRule() {
        // basic
        HttpRequestDef.Builder<ListComplianceRuleRequest, ListComplianceRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListComplianceRuleRequest.class, ListComplianceRuleResponse.class)
                .withName("ListComplianceRule")
                .withUri("/v1/{domain_id}/backup/compliancerules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComplianceRuleRequest::getDomainId, ListComplianceRuleRequest::setDomainId));
        builder.<Boolean>withRequestField("embedded_flag",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListComplianceRuleRequest::getEmbeddedFlag,
                ListComplianceRuleRequest::setEmbeddedFlag));

        // response
        builder.<List<BackupComplianceRule>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListComplianceRuleResponse::getBody, ListComplianceRuleResponse::setBody)
                .withInnerContainerType(BackupComplianceRule.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForListEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForListEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v1/{domain_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getDomainId, ListEventsRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getRegionId, ListEventsRequest::setRegionId));
        builder.<ListEventsRequest.EventSourceEnum>withRequestField("event_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventsRequest.EventSourceEnum.class),
            f -> f.withMarshaller(ListEventsRequest::getEventSource, ListEventsRequest::setEventSource));
        builder.<ListEventsRequest.EventLevelEnum>withRequestField("event_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventsRequest.EventLevelEnum.class),
            f -> f.withMarshaller(ListEventsRequest::getEventLevel, ListEventsRequest::setEventLevel));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getEventName, ListEventsRequest::setEventName));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getResourceId, ListEventsRequest::setResourceId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getStartTime, ListEventsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getEndTime, ListEventsRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getMarker, ListEventsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventsRequest::getLimit, ListEventsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForListMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForListMetrics() {
        // basic
        HttpRequestDef.Builder<ListMetricsRequest, ListMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsRequest.class, ListMetricsResponse.class)
                .withName("ListMetrics")
                .withUri("/v1/{domain_id}/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getDomainId, ListMetricsRequest::setDomainId));
        builder.<ListMetricsRequest.NameEnum>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMetricsRequest.NameEnum.class),
            f -> f.withMarshaller(ListMetricsRequest::getName, ListMetricsRequest::setName));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getRegionId, ListMetricsRequest::setRegionId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getStartTime, ListMetricsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getEndTime, ListMetricsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrganizationPolicyRequest, ListOrganizationPolicyResponse> listOrganizationPolicy =
        genForListOrganizationPolicy();

    private static HttpRequestDef<ListOrganizationPolicyRequest, ListOrganizationPolicyResponse> genForListOrganizationPolicy() {
        // basic
        HttpRequestDef.Builder<ListOrganizationPolicyRequest, ListOrganizationPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOrganizationPolicyRequest.class, ListOrganizationPolicyResponse.class)
            .withName("ListOrganizationPolicy")
            .withUri("/v1/{domain_id}/backup/organizationpolicies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationPolicyRequest::getDomainId,
                ListOrganizationPolicyRequest::setDomainId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrganizationPolicyRequest::getLimit, ListOrganizationPolicyRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrganizationPolicyRequest::getOffset, ListOrganizationPolicyRequest::setOffset));
        builder.<ListOrganizationPolicyRequest.OperationTypeEnum>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOrganizationPolicyRequest.OperationTypeEnum.class),
            f -> f.withMarshaller(ListOrganizationPolicyRequest::getOperationType,
                ListOrganizationPolicyRequest::setOperationType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOrganizationPolicyResponse::getXRequestId,
                ListOrganizationPolicyResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForListPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForListPolicy() {
        // basic
        HttpRequestDef.Builder<ListPolicyRequest, ListPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyRequest.class, ListPolicyResponse.class)
                .withName("ListPolicy")
                .withUri("/v1/{domain_id}/backup/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getDomainId, ListPolicyRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getRegionId, ListPolicyRequest::setRegionId));
        builder.<ListPolicyRequest.OperationTypeEnum>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPolicyRequest.OperationTypeEnum.class),
            f -> f.withMarshaller(ListPolicyRequest::getOperationType, ListPolicyRequest::setOperationType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getLimit, ListPolicyRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPolicyRequest::getOffset, ListPolicyRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReportSettingsRequest, ListReportSettingsResponse> listReportSettings =
        genForListReportSettings();

    private static HttpRequestDef<ListReportSettingsRequest, ListReportSettingsResponse> genForListReportSettings() {
        // basic
        HttpRequestDef.Builder<ListReportSettingsRequest, ListReportSettingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReportSettingsRequest.class, ListReportSettingsResponse.class)
                .withName("ListReportSettings")
                .withUri("/v1/{domain_id}/report/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportSettingsRequest::getDomainId, ListReportSettingsRequest::setDomainId));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListReportSettingsRequest::getEnabled, ListReportSettingsRequest::setEnabled));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListReportSettingsRequest::getOffset, ListReportSettingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReportSettingsRequest::getLimit, ListReportSettingsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReportsRequest, ListReportsResponse> listReports = genForListReports();

    private static HttpRequestDef<ListReportsRequest, ListReportsResponse> genForListReports() {
        // basic
        HttpRequestDef.Builder<ListReportsRequest, ListReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReportsRequest.class, ListReportsResponse.class)
                .withName("ListReports")
                .withUri("/v1/{domain_id}/reports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getDomainId, ListReportsRequest::setDomainId));
        builder.<String>withRequestField("report_setting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getReportSettingId, ListReportsRequest::setReportSettingId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getStartTime, ListReportsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getEndTime, ListReportsRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getMarker, ListReportsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReportsRequest::getLimit, ListReportsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceCopiesRequest, ListResourceCopiesResponse> listResourceCopies =
        genForListResourceCopies();

    private static HttpRequestDef<ListResourceCopiesRequest, ListResourceCopiesResponse> genForListResourceCopies() {
        // basic
        HttpRequestDef.Builder<ListResourceCopiesRequest, ListResourceCopiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceCopiesRequest.class, ListResourceCopiesResponse.class)
                .withName("ListResourceCopies")
                .withUri("/v1/{domain_id}/copies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getDomainId, ListResourceCopiesRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getRegionId, ListResourceCopiesRequest::setRegionId));
        builder.<ListResourceCopiesRequest.CopyTypeEnum>withRequestField("copy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceCopiesRequest.CopyTypeEnum.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getCopyType, ListResourceCopiesRequest::setCopyType));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getResourceType,
                ListResourceCopiesRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getResourceId, ListResourceCopiesRequest::setResourceId));
        builder.<String>withRequestField("copy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getCopyId, ListResourceCopiesRequest::setCopyId));
        builder.<String>withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getVaultId, ListResourceCopiesRequest::setVaultId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getLimit, ListResourceCopiesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getMarker, ListResourceCopiesRequest::setMarker));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getStartTime, ListResourceCopiesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceCopiesRequest::getEndTime, ListResourceCopiesRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesRequest, ListResourcesResponse> listResources =
        genForListResources();

    private static HttpRequestDef<ListResourcesRequest, ListResourcesResponse> genForListResources() {
        // basic
        HttpRequestDef.Builder<ListResourcesRequest, ListResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcesRequest.class, ListResourcesResponse.class)
                .withName("ListResources")
                .withUri("/v1/{domain_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getDomainId, ListResourcesRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getRegionId, ListResourcesRequest::setRegionId));
        builder.<ListResourcesRequest.ProviderEnum>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesRequest.ProviderEnum.class),
            f -> f.withMarshaller(ListResourcesRequest::getProvider, ListResourcesRequest::setProvider));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getId, ListResourcesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getName, ListResourcesRequest::setName));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getTags, ListResourcesRequest::setTags));
        builder.<String>withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getVaultId, ListResourcesRequest::setVaultId));
        builder.<String>withRequestField("vault_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getVaultName, ListResourcesRequest::setVaultName));
        builder.<String>withRequestField("resource_level_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getResourceLevelId, ListResourcesRequest::setResourceLevelId));
        builder.<String>withRequestField("resource_level_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getResourceLevelName,
                ListResourcesRequest::setResourceLevelName));
        builder.<ListResourcesRequest.ComplianceResultEnum>withRequestField("compliance_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesRequest.ComplianceResultEnum.class),
            f -> f.withMarshaller(ListResourcesRequest::getComplianceResult,
                ListResourcesRequest::setComplianceResult));
        builder.<ListResourcesRequest.InventoryResultEnum>withRequestField("inventory_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesRequest.InventoryResultEnum.class),
            f -> f.withMarshaller(ListResourcesRequest::getInventoryResult, ListResourcesRequest::setInventoryResult));
        builder.<ListResourcesRequest.ComplianceRuleTypeEnum>withRequestField("compliance_rule_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesRequest.ComplianceRuleTypeEnum.class),
            f -> f.withMarshaller(ListResourcesRequest::getComplianceRuleType,
                ListResourcesRequest::setComplianceRuleType));
        builder.<Boolean>withRequestField("compliance_rule_matched",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListResourcesRequest::getComplianceRuleMatched,
                ListResourcesRequest::setComplianceRuleMatched));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesRequest::getLimit, ListResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getMarker, ListResourcesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesLevelRequest, ListResourcesLevelResponse> listResourcesLevel =
        genForListResourcesLevel();

    private static HttpRequestDef<ListResourcesLevelRequest, ListResourcesLevelResponse> genForListResourcesLevel() {
        // basic
        HttpRequestDef.Builder<ListResourcesLevelRequest, ListResourcesLevelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcesLevelRequest.class, ListResourcesLevelResponse.class)
                .withName("ListResourcesLevel")
                .withUri("/v1/{domain_id}/resource-levels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesLevelRequest::getDomainId, ListResourcesLevelRequest::setDomainId));
        builder.<ListResourcesLevelRequest.ProviderEnum>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesLevelRequest.ProviderEnum.class),
            f -> f.withMarshaller(ListResourcesLevelRequest::getProvider, ListResourcesLevelRequest::setProvider));
        builder.<String>withRequestField("compliance_rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesLevelRequest::getComplianceRuleId,
                ListResourcesLevelRequest::setComplianceRuleId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesLevelRequest::getLimit, ListResourcesLevelRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListResourcesLevelRequest::getOffset, ListResourcesLevelRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesLevelTagsRequest, ListResourcesLevelTagsResponse> listResourcesLevelTags =
        genForListResourcesLevelTags();

    private static HttpRequestDef<ListResourcesLevelTagsRequest, ListResourcesLevelTagsResponse> genForListResourcesLevelTags() {
        // basic
        HttpRequestDef.Builder<ListResourcesLevelTagsRequest, ListResourcesLevelTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListResourcesLevelTagsRequest.class, ListResourcesLevelTagsResponse.class)
            .withName("ListResourcesLevelTags")
            .withUri("/v1/{domain_id}/resource-levels/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesLevelTagsRequest::getDomainId,
                ListResourcesLevelTagsRequest::setDomainId));

        // response
        builder.<List<TagsItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListResourcesLevelTagsResponse::getBody, ListResourcesLevelTagsResponse::setBody)
                .withInnerContainerType(TagsItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSupportedRegionRequest, ListSupportedRegionResponse> listSupportedRegion =
        genForListSupportedRegion();

    private static HttpRequestDef<ListSupportedRegionRequest, ListSupportedRegionResponse> genForListSupportedRegion() {
        // basic
        HttpRequestDef.Builder<ListSupportedRegionRequest, ListSupportedRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSupportedRegionRequest.class, ListSupportedRegionResponse.class)
                .withName("ListSupportedRegion")
                .withUri("/v1/bcc/regions")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportedRegionResponse::getBody, ListSupportedRegionResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v1/{domain_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getDomainId, ListTasksRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getRegionId, ListTasksRequest::setRegionId));
        builder.<ListTasksRequest.TaskStatusEnum>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.TaskStatusEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getTaskStatus, ListTasksRequest::setTaskStatus));
        builder.<ListTasksRequest.TaskTypeEnum>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.TaskTypeEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getTaskType, ListTasksRequest::setTaskType));
        builder.<ListTasksRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getResourceType, ListTasksRequest::setResourceType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getStartTime, ListTasksRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getEndTime, ListTasksRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getMarker, ListTasksRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, ListTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v1/{domain_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getDomainId, ListTemplatesRequest::setDomainId));
        builder.<ListTemplatesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTemplatesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListTemplatesRequest::getType, ListTemplatesRequest::setType));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTemplatesRequest::getOffset, ListTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getLimit, ListTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVaultRequest, ListVaultResponse> listVault = genForListVault();

    private static HttpRequestDef<ListVaultRequest, ListVaultResponse> genForListVault() {
        // basic
        HttpRequestDef.Builder<ListVaultRequest, ListVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVaultRequest.class, ListVaultResponse.class)
                .withName("ListVault")
                .withUri("/v1/{domain_id}/backup/vaults")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getDomainId, ListVaultRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getRegionId, ListVaultRequest::setRegionId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getEnterpriseProjectId, ListVaultRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("compliance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getComplianceId, ListVaultRequest::setComplianceId));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getPolicyId, ListVaultRequest::setPolicyId));
        builder.<String>withRequestField("resource_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getResourceIds, ListVaultRequest::setResourceIds));
        builder.<ListVaultRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVaultRequest.StatusEnum.class),
            f -> f.withMarshaller(ListVaultRequest::getStatus, ListVaultRequest::setStatus));
        builder.<ListVaultRequest.ObjectTypeEnum>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVaultRequest.ObjectTypeEnum.class),
            f -> f.withMarshaller(ListVaultRequest::getObjectType, ListVaultRequest::setObjectType));
        builder.<ListVaultRequest.ProtectTypeEnum>withRequestField("protect_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVaultRequest.ProtectTypeEnum.class),
            f -> f.withMarshaller(ListVaultRequest::getProtectType, ListVaultRequest::setProtectType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVaultRequest::getLimit, ListVaultRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVaultRequest::getOffset, ListVaultRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVaultTopsRequest, ListVaultTopsResponse> listVaultTops =
        genForListVaultTops();

    private static HttpRequestDef<ListVaultTopsRequest, ListVaultTopsResponse> genForListVaultTops() {
        // basic
        HttpRequestDef.Builder<ListVaultTopsRequest, ListVaultTopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVaultTopsRequest.class, ListVaultTopsResponse.class)
                .withName("ListVaultTops")
                .withUri("/v1/{domain_id}/backup/vault-tops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultTopsRequest::getDomainId, ListVaultTopsRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultTopsRequest::getRegionId, ListVaultTopsRequest::setRegionId));
        builder.<ListVaultTopsRequest.MetricNameEnum>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListVaultTopsRequest.MetricNameEnum.class),
            f -> f.withMarshaller(ListVaultTopsRequest::getMetricName, ListVaultTopsRequest::setMetricName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVaultTopsRequest::getLimit, ListVaultTopsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyResourceLevelRequest, ModifyResourceLevelResponse> modifyResourceLevel =
        genForModifyResourceLevel();

    private static HttpRequestDef<ModifyResourceLevelRequest, ModifyResourceLevelResponse> genForModifyResourceLevel() {
        // basic
        HttpRequestDef.Builder<ModifyResourceLevelRequest, ModifyResourceLevelResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyResourceLevelRequest.class, ModifyResourceLevelResponse.class)
                .withName("ModifyResourceLevel")
                .withUri("/v1/{domain_id}/resource-levels/{level_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyResourceLevelRequest::getDomainId, ModifyResourceLevelRequest::setDomainId));
        builder.<String>withRequestField("level_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyResourceLevelRequest::getLevelId, ModifyResourceLevelRequest::setLevelId));
        builder.<ModifyResourceLevelBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyResourceLevelBody.class),
            f -> f.withMarshaller(ModifyResourceLevelRequest::getBody, ModifyResourceLevelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NotifyResourceChangeRequest, NotifyResourceChangeResponse> notifyResourceChange =
        genForNotifyResourceChange();

    private static HttpRequestDef<NotifyResourceChangeRequest, NotifyResourceChangeResponse> genForNotifyResourceChange() {
        // basic
        HttpRequestDef.Builder<NotifyResourceChangeRequest, NotifyResourceChangeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, NotifyResourceChangeRequest.class, NotifyResourceChangeResponse.class)
            .withName("NotifyResourceChange")
            .withUri("/v1/{domain_id}/resources/notify")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NotifyResourceChangeRequest::getDomainId, NotifyResourceChangeRequest::setDomainId));
        builder.<ResourceNotifyBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceNotifyBody.class),
            f -> f.withMarshaller(NotifyResourceChangeRequest::getBody, NotifyResourceChangeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveResourceLevelRequest, RemoveResourceLevelResponse> removeResourceLevel =
        genForRemoveResourceLevel();

    private static HttpRequestDef<RemoveResourceLevelRequest, RemoveResourceLevelResponse> genForRemoveResourceLevel() {
        // basic
        HttpRequestDef.Builder<RemoveResourceLevelRequest, RemoveResourceLevelResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, RemoveResourceLevelRequest.class, RemoveResourceLevelResponse.class)
            .withName("RemoveResourceLevel")
            .withUri("/v1/{domain_id}/resource-levels/{level_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveResourceLevelRequest::getDomainId, RemoveResourceLevelRequest::setDomainId));
        builder.<String>withRequestField("level_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveResourceLevelRequest::getLevelId, RemoveResourceLevelRequest::setLevelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetProtectionConfigurationRequest, SetProtectionConfigurationResponse> setProtectionConfiguration =
        genForSetProtectionConfiguration();

    private static HttpRequestDef<SetProtectionConfigurationRequest, SetProtectionConfigurationResponse> genForSetProtectionConfiguration() {
        // basic
        HttpRequestDef.Builder<SetProtectionConfigurationRequest, SetProtectionConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetProtectionConfigurationRequest.class,
                    SetProtectionConfigurationResponse.class)
                .withName("SetProtectionConfiguration")
                .withUri("/v1/{domain_id}/resources-backup/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetProtectionConfigurationRequest::getDomainId,
                SetProtectionConfigurationRequest::setDomainId));
        builder.<ConfigureProtectionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConfigureProtectionBody.class),
            f -> f.withMarshaller(SetProtectionConfigurationRequest::getBody,
                SetProtectionConfigurationRequest::setBody));

        // response
        builder.<List<ProtectionConfigurationResponseItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(SetProtectionConfigurationResponse::getBody,
                    SetProtectionConfigurationResponse::setBody)
                .withInnerContainerType(ProtectionConfigurationResponseItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> showAlarmSummary =
        genForShowAlarmSummary();

    private static HttpRequestDef<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> genForShowAlarmSummary() {
        // basic
        HttpRequestDef.Builder<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmSummaryRequest.class, ShowAlarmSummaryResponse.class)
                .withName("ShowAlarmSummary")
                .withUri("/v1/{domain_id}/alarm-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmSummaryRequest::getDomainId, ShowAlarmSummaryRequest::setDomainId));
        builder.<ShowAlarmSummaryRequest.NamespaceEnum>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAlarmSummaryRequest.NamespaceEnum.class),
            f -> f.withMarshaller(ShowAlarmSummaryRequest::getNamespace, ShowAlarmSummaryRequest::setNamespace));
        builder.<ShowAlarmSummaryRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAlarmSummaryRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowAlarmSummaryRequest::getStatus, ShowAlarmSummaryRequest::setStatus));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmSummaryRequest::getRegionId, ShowAlarmSummaryRequest::setRegionId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmSummaryRequest::getStartTime, ShowAlarmSummaryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmSummaryRequest::getEndTime, ShowAlarmSummaryRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComplianceRuleRequest, ShowComplianceRuleResponse> showComplianceRule =
        genForShowComplianceRule();

    private static HttpRequestDef<ShowComplianceRuleRequest, ShowComplianceRuleResponse> genForShowComplianceRule() {
        // basic
        HttpRequestDef.Builder<ShowComplianceRuleRequest, ShowComplianceRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComplianceRuleRequest.class, ShowComplianceRuleResponse.class)
                .withName("ShowComplianceRule")
                .withUri("/v1/{domain_id}/backup/compliancerules/{compliance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceRuleRequest::getDomainId, ShowComplianceRuleRequest::setDomainId));
        builder.<String>withRequestField("compliance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceRuleRequest::getComplianceId,
                ShowComplianceRuleRequest::setComplianceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainRequest, ShowDomainResponse> showDomain = genForShowDomain();

    private static HttpRequestDef<ShowDomainRequest, ShowDomainResponse> genForShowDomain() {
        // basic
        HttpRequestDef.Builder<ShowDomainRequest, ShowDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainRequest.class, ShowDomainResponse.class)
                .withName("ShowDomain")
                .withUri("/v1/{domain_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRequest::getDomainId, ShowDomainRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse> showOrganizationPolicy =
        genForShowOrganizationPolicy();

    private static HttpRequestDef<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse> genForShowOrganizationPolicy() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOrganizationPolicyRequest.class, ShowOrganizationPolicyResponse.class)
            .withName("ShowOrganizationPolicy")
            .withUri("/v1/{domain_id}/backup/organizationpolicies/{organization_policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyRequest::getDomainId,
                ShowOrganizationPolicyRequest::setDomainId));
        builder.<String>withRequestField("organization_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyRequest::getOrganizationPolicyId,
                ShowOrganizationPolicyRequest::setOrganizationPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForShowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForShowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/{domain_id}/backup/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getDomainId, ShowPolicyRequest::setDomainId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, ShowPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportRequest, ShowReportResponse> showReport = genForShowReport();

    private static HttpRequestDef<ShowReportRequest, ShowReportResponse> genForShowReport() {
        // basic
        HttpRequestDef.Builder<ShowReportRequest, ShowReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReportRequest.class, ShowReportResponse.class)
                .withName("ShowReport")
                .withUri("/v1/{domain_id}/reports/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportRequest::getDomainId, ShowReportRequest::setDomainId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportRequest::getReportId, ShowReportRequest::setReportId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportResourceDetailsDataRequest, ShowReportResourceDetailsDataResponse> showReportResourceDetailsData =
        genForShowReportResourceDetailsData();

    private static HttpRequestDef<ShowReportResourceDetailsDataRequest, ShowReportResourceDetailsDataResponse> genForShowReportResourceDetailsData() {
        // basic
        HttpRequestDef.Builder<ShowReportResourceDetailsDataRequest, ShowReportResourceDetailsDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowReportResourceDetailsDataRequest.class,
                    ShowReportResourceDetailsDataResponse.class)
                .withName("ShowReportResourceDetailsData")
                .withUri("/v1/{domain_id}/reports/{report_id}/resource-details-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportResourceDetailsDataRequest::getDomainId,
                ShowReportResourceDetailsDataRequest::setDomainId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportResourceDetailsDataRequest::getReportId,
                ShowReportResourceDetailsDataRequest::setReportId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportResourceDetailsDataRequest::getLimit,
                ShowReportResourceDetailsDataRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportResourceDetailsDataRequest::getMarker,
                ShowReportResourceDetailsDataRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportSettingRequest, ShowReportSettingResponse> showReportSetting =
        genForShowReportSetting();

    private static HttpRequestDef<ShowReportSettingRequest, ShowReportSettingResponse> genForShowReportSetting() {
        // basic
        HttpRequestDef.Builder<ShowReportSettingRequest, ShowReportSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReportSettingRequest.class, ShowReportSettingResponse.class)
                .withName("ShowReportSetting")
                .withUri("/v1/{domain_id}/report/settings/{setting_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportSettingRequest::getDomainId, ShowReportSettingRequest::setDomainId));
        builder.<String>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportSettingRequest::getSettingId, ShowReportSettingRequest::setSettingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportSummaryDataRequest, ShowReportSummaryDataResponse> showReportSummaryData =
        genForShowReportSummaryData();

    private static HttpRequestDef<ShowReportSummaryDataRequest, ShowReportSummaryDataResponse> genForShowReportSummaryData() {
        // basic
        HttpRequestDef.Builder<ShowReportSummaryDataRequest, ShowReportSummaryDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowReportSummaryDataRequest.class, ShowReportSummaryDataResponse.class)
            .withName("ShowReportSummaryData")
            .withUri("/v1/{domain_id}/reports/{report_id}/summary-data")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportSummaryDataRequest::getDomainId,
                ShowReportSummaryDataRequest::setDomainId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportSummaryDataRequest::getReportId,
                ShowReportSummaryDataRequest::setReportId));
        builder.<ShowReportSummaryDataRequest.DataItemNameEnum>withRequestField("data_item_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowReportSummaryDataRequest.DataItemNameEnum.class),
            f -> f.withMarshaller(ShowReportSummaryDataRequest::getDataItemName,
                ShowReportSummaryDataRequest::setDataItemName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportTaskDetailsDataRequest, ShowReportTaskDetailsDataResponse> showReportTaskDetailsData =
        genForShowReportTaskDetailsData();

    private static HttpRequestDef<ShowReportTaskDetailsDataRequest, ShowReportTaskDetailsDataResponse> genForShowReportTaskDetailsData() {
        // basic
        HttpRequestDef.Builder<ShowReportTaskDetailsDataRequest, ShowReportTaskDetailsDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowReportTaskDetailsDataRequest.class,
                    ShowReportTaskDetailsDataResponse.class)
                .withName("ShowReportTaskDetailsData")
                .withUri("/v1/{domain_id}/reports/{report_id}/task-details-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportTaskDetailsDataRequest::getDomainId,
                ShowReportTaskDetailsDataRequest::setDomainId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportTaskDetailsDataRequest::getReportId,
                ShowReportTaskDetailsDataRequest::setReportId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportTaskDetailsDataRequest::getLimit,
                ShowReportTaskDetailsDataRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportTaskDetailsDataRequest::getMarker,
                ShowReportTaskDetailsDataRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceCopiesSummaryRequest, ShowResourceCopiesSummaryResponse> showResourceCopiesSummary =
        genForShowResourceCopiesSummary();

    private static HttpRequestDef<ShowResourceCopiesSummaryRequest, ShowResourceCopiesSummaryResponse> genForShowResourceCopiesSummary() {
        // basic
        HttpRequestDef.Builder<ShowResourceCopiesSummaryRequest, ShowResourceCopiesSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowResourceCopiesSummaryRequest.class,
                    ShowResourceCopiesSummaryResponse.class)
                .withName("ShowResourceCopiesSummary")
                .withUri("/v1/{domain_id}/copy-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceCopiesSummaryRequest::getDomainId,
                ShowResourceCopiesSummaryRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceCopiesSummaryRequest::getRegionId,
                ShowResourceCopiesSummaryRequest::setRegionId));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceCopiesSummaryRequest::getResourceType,
                ShowResourceCopiesSummaryRequest::setResourceType));
        builder.<String>withRequestField("copy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceCopiesSummaryRequest::getCopyType,
                ShowResourceCopiesSummaryRequest::setCopyType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceCopiesSummaryRequest::getStartTime,
                ShowResourceCopiesSummaryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceCopiesSummaryRequest::getEndTime,
                ShowResourceCopiesSummaryRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetail =
        genForShowResourceDetail();

    private static HttpRequestDef<ShowResourceDetailRequest, ShowResourceDetailResponse> genForShowResourceDetail() {
        // basic
        HttpRequestDef.Builder<ShowResourceDetailRequest, ShowResourceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceDetailRequest.class, ShowResourceDetailResponse.class)
                .withName("ShowResourceDetail")
                .withUri("/v1/{domain_id}/resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceDetailRequest::getDomainId, ShowResourceDetailRequest::setDomainId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceDetailRequest::getResourceId, ShowResourceDetailRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourcesSummaryRequest, ShowResourcesSummaryResponse> showResourcesSummary =
        genForShowResourcesSummary();

    private static HttpRequestDef<ShowResourcesSummaryRequest, ShowResourcesSummaryResponse> genForShowResourcesSummary() {
        // basic
        HttpRequestDef.Builder<ShowResourcesSummaryRequest, ShowResourcesSummaryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourcesSummaryRequest.class, ShowResourcesSummaryResponse.class)
            .withName("ShowResourcesSummary")
            .withUri("/v1/{domain_id}/resources-summary")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourcesSummaryRequest::getDomainId, ShowResourcesSummaryRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourcesSummaryRequest::getRegionId, ShowResourcesSummaryRequest::setRegionId));
        builder.<ShowResourcesSummaryRequest.ProviderEnum>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowResourcesSummaryRequest.ProviderEnum.class),
            f -> f.withMarshaller(ShowResourcesSummaryRequest::getProvider, ShowResourcesSummaryRequest::setProvider));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourcesSummaryRequest::getStartTime,
                ShowResourcesSummaryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourcesSummaryRequest::getEndTime, ShowResourcesSummaryRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v1/{domain_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getDomainId, ShowTaskRequest::setDomainId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskStatusSummaryRequest, ShowTaskStatusSummaryResponse> showTaskStatusSummary =
        genForShowTaskStatusSummary();

    private static HttpRequestDef<ShowTaskStatusSummaryRequest, ShowTaskStatusSummaryResponse> genForShowTaskStatusSummary() {
        // basic
        HttpRequestDef.Builder<ShowTaskStatusSummaryRequest, ShowTaskStatusSummaryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskStatusSummaryRequest.class, ShowTaskStatusSummaryResponse.class)
            .withName("ShowTaskStatusSummary")
            .withUri("/v1/{domain_id}/task-status-summary")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskStatusSummaryRequest::getDomainId,
                ShowTaskStatusSummaryRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskStatusSummaryRequest::getRegionId,
                ShowTaskStatusSummaryRequest::setRegionId));
        builder.<ShowTaskStatusSummaryRequest.TaskTypeEnum>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTaskStatusSummaryRequest.TaskTypeEnum.class),
            f -> f.withMarshaller(ShowTaskStatusSummaryRequest::getTaskType,
                ShowTaskStatusSummaryRequest::setTaskType));
        builder.<ShowTaskStatusSummaryRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTaskStatusSummaryRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowTaskStatusSummaryRequest::getResourceType,
                ShowTaskStatusSummaryRequest::setResourceType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskStatusSummaryRequest::getStartTime,
                ShowTaskStatusSummaryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskStatusSummaryRequest::getEndTime, ShowTaskStatusSummaryRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskTypeSummaryRequest, ShowTaskTypeSummaryResponse> showTaskTypeSummary =
        genForShowTaskTypeSummary();

    private static HttpRequestDef<ShowTaskTypeSummaryRequest, ShowTaskTypeSummaryResponse> genForShowTaskTypeSummary() {
        // basic
        HttpRequestDef.Builder<ShowTaskTypeSummaryRequest, ShowTaskTypeSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskTypeSummaryRequest.class, ShowTaskTypeSummaryResponse.class)
                .withName("ShowTaskTypeSummary")
                .withUri("/v1/{domain_id}/task-type-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskTypeSummaryRequest::getDomainId, ShowTaskTypeSummaryRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskTypeSummaryRequest::getRegionId, ShowTaskTypeSummaryRequest::setRegionId));
        builder.<ShowTaskTypeSummaryRequest.TaskStatusEnum>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTaskTypeSummaryRequest.TaskStatusEnum.class),
            f -> f.withMarshaller(ShowTaskTypeSummaryRequest::getTaskStatus,
                ShowTaskTypeSummaryRequest::setTaskStatus));
        builder.<ShowTaskTypeSummaryRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTaskTypeSummaryRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowTaskTypeSummaryRequest::getResourceType,
                ShowTaskTypeSummaryRequest::setResourceType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskTypeSummaryRequest::getStartTime, ShowTaskTypeSummaryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskTypeSummaryRequest::getEndTime, ShowTaskTypeSummaryRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForShowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForShowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v1/{domain_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getDomainId, ShowTemplateRequest::setDomainId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getTemplateId, ShowTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultRequest, ShowVaultResponse> showVault = genForShowVault();

    private static HttpRequestDef<ShowVaultRequest, ShowVaultResponse> genForShowVault() {
        // basic
        HttpRequestDef.Builder<ShowVaultRequest, ShowVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVaultRequest.class, ShowVaultResponse.class)
                .withName("ShowVault")
                .withUri("/v1/{domain_id}/backup/vaults/{vault_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultRequest::getDomainId, ShowVaultRequest::setDomainId));
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultRequest::getVaultId, ShowVaultRequest::setVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultSummaryRequest, ShowVaultSummaryResponse> showVaultSummary =
        genForShowVaultSummary();

    private static HttpRequestDef<ShowVaultSummaryRequest, ShowVaultSummaryResponse> genForShowVaultSummary() {
        // basic
        HttpRequestDef.Builder<ShowVaultSummaryRequest, ShowVaultSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVaultSummaryRequest.class, ShowVaultSummaryResponse.class)
                .withName("ShowVaultSummary")
                .withUri("/v1/{domain_id}/backup/vaults-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultSummaryRequest::getDomainId, ShowVaultSummaryRequest::setDomainId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultSummaryRequest::getRegionId, ShowVaultSummaryRequest::setRegionId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultSummaryRequest::getEnterpriseProjectId,
                ShowVaultSummaryRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultSummaryRequest::getStartTime, ShowVaultSummaryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultSummaryRequest::getEndTime, ShowVaultSummaryRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnbindResourceLevelComplianceRequest, UnbindResourceLevelComplianceResponse> unbindResourceLevelCompliance =
        genForUnbindResourceLevelCompliance();

    private static HttpRequestDef<UnbindResourceLevelComplianceRequest, UnbindResourceLevelComplianceResponse> genForUnbindResourceLevelCompliance() {
        // basic
        HttpRequestDef.Builder<UnbindResourceLevelComplianceRequest, UnbindResourceLevelComplianceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    UnbindResourceLevelComplianceRequest.class,
                    UnbindResourceLevelComplianceResponse.class)
                .withName("UnbindResourceLevelCompliance")
                .withUri("/v1/{domain_id}/resource-levels/{level_id}/compliance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindResourceLevelComplianceRequest::getDomainId,
                UnbindResourceLevelComplianceRequest::setDomainId));
        builder.<String>withRequestField("level_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindResourceLevelComplianceRequest::getLevelId,
                UnbindResourceLevelComplianceRequest::setLevelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateComplianceRuleRequest, UpdateComplianceRuleResponse> updateComplianceRule =
        genForUpdateComplianceRule();

    private static HttpRequestDef<UpdateComplianceRuleRequest, UpdateComplianceRuleResponse> genForUpdateComplianceRule() {
        // basic
        HttpRequestDef.Builder<UpdateComplianceRuleRequest, UpdateComplianceRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateComplianceRuleRequest.class, UpdateComplianceRuleResponse.class)
            .withName("UpdateComplianceRule")
            .withUri("/v1/{domain_id}/backup/compliancerules/{compliance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComplianceRuleRequest::getDomainId, UpdateComplianceRuleRequest::setDomainId));
        builder.<String>withRequestField("compliance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComplianceRuleRequest::getComplianceId,
                UpdateComplianceRuleRequest::setComplianceId));
        builder.<UpdateComplianceRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateComplianceRuleRequestBody.class),
            f -> f.withMarshaller(UpdateComplianceRuleRequest::getBody, UpdateComplianceRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForUpdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForUpdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/{domain_id}/backup/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getDomainId, UpdatePolicyRequest::setDomainId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, UpdatePolicyRequest::setPolicyId));
        builder.<CreateBccPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBccPolicyRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, UpdatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReportSettingRequest, UpdateReportSettingResponse> updateReportSetting =
        genForUpdateReportSetting();

    private static HttpRequestDef<UpdateReportSettingRequest, UpdateReportSettingResponse> genForUpdateReportSetting() {
        // basic
        HttpRequestDef.Builder<UpdateReportSettingRequest, UpdateReportSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateReportSettingRequest.class, UpdateReportSettingResponse.class)
                .withName("UpdateReportSetting")
                .withUri("/v1/{domain_id}/report/settings/{setting_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReportSettingRequest::getDomainId, UpdateReportSettingRequest::setDomainId));
        builder.<String>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReportSettingRequest::getSettingId, UpdateReportSettingRequest::setSettingId));
        builder.<UpdateReportSettingBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReportSettingBody.class),
            f -> f.withMarshaller(UpdateReportSettingRequest::getBody, UpdateReportSettingRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateReportSettingResponse::getBody, UpdateReportSettingResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate =
        genForUpdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForUpdateTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateRequest, UpdateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateRequest.class, UpdateTemplateResponse.class)
                .withName("UpdateTemplate")
                .withUri("/v1/{domain_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getDomainId, UpdateTemplateRequest::setDomainId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getTemplateId, UpdateTemplateRequest::setTemplateId));
        builder.<UpdateTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTemplateBody.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, UpdateTemplateRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTemplateResponse::getBody, UpdateTemplateResponse::setBody));

        return builder.build();
    }

}
