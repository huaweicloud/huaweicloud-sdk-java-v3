package com.huaweicloud.sdk.secmaster.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.secmaster.v2.model.BaselineSearchRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CheckitemModel;
import com.huaweicloud.sdk.secmaster.v2.model.CompliancePackageModel;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAdhocQueryRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAdhocQueryRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAdhocQueryResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAnalysisScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAnalysisScriptRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAnalysisScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCodeSegmentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCodeSegmentRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCodeSegmentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCollectConfigRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCollectConfigResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCollectConfigV2RequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCustomizedCheckitemRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCustomizedCheckitemResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCustomizedCompliancePackageRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCustomizedCompliancePackageResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataTransformationRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateLayoutFieldRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateLayoutFieldRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateLayoutFieldResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateRetrieveScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateRetrieveScriptRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateRetrieveScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlRenderRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlRenderRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlRenderResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlValidationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlValidationRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlValidationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableAnalysisRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableAnalysisResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAdhocQueryRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAdhocQueryResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAnalysisScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAnalysisScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCodeSegmentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCodeSegmentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCheckitemsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCheckitemsRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCheckitemsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCompliancePackagesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCompliancePackagesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteLayoutFieldRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteLayoutFieldResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteRetrieveScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteRetrieveScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteTableRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteTableResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DisableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DisableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DisableConsumptionV2RequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.DisableDataConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DisableDataConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DisableDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DisableDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.EnableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.EnableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.EnableDataConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.EnableDataConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.EnableDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.EnableDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.LayoutFieldResponseBody;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleMetricsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleMetricsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplateMetricsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplateMetricsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplatesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplatesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRulesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRulesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAnalysisScriptsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAnalysisScriptsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListCodeSegmentsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListCodeSegmentsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListCollectConfigRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListCollectConfigResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataTransformationMetricsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataTransformationMetricsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataTransformationsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataTransformationsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDirectoriesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDirectoriesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListLayoutFieldAllRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListLayoutFieldAllResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPipesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPipesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListRetrieveScriptsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListRetrieveScriptsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableHistogramsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableHistogramsRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableHistogramsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableLogsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableLogsRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableLogsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListTablesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListTablesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.PipeSchema;
import com.huaweicloud.sdk.secmaster.v2.model.SearchBaselineRequest;
import com.huaweicloud.sdk.secmaster.v2.model.SearchBaselineResponse;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCheckitemsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCheckitemsRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCheckitemsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCompliancePackagesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCompliancePackagesRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCompliancePackagesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAdhocResultRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAdhocResultResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleTemplateRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleTemplateResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAnalysisScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAnalysisScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCheckitemDetailRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCheckitemDetailResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCodeSegmentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCodeSegmentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCompliancePackageDetailRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCompliancePackageDetailResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowDataConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowDataConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowLayoutFieldInfoRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowLayoutFieldInfoResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowMonitorStatsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowMonitorStatsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPulsarMonitorStatsBody;
import com.huaweicloud.sdk.secmaster.v2.model.ShowRetrieveScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowRetrieveScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowSubscriptionResourcesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowSubscriptionResourcesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowTableRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowTableResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.TableSchemaDto;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAnalysisScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAnalysisScriptRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAnalysisScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCheckitemRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCheckitemResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCodeSegmentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCodeSegmentRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCodeSegmentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCompliancePackageRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCompliancePackageResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateDataTransformationRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateLayoutFieldRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateLayoutFieldRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateLayoutFieldResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeSchemaRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeSchemaResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateRetrieveScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateRetrieveScriptRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateRetrieveScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableSchemaRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableSchemaResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class SecMasterMeta {

    public static final HttpRequestDef<CreateAdhocQueryRequest, CreateAdhocQueryResponse> createAdhocQuery =
        genForCreateAdhocQuery();

    private static HttpRequestDef<CreateAdhocQueryRequest, CreateAdhocQueryResponse> genForCreateAdhocQuery() {
        // basic
        HttpRequestDef.Builder<CreateAdhocQueryRequest, CreateAdhocQueryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAdhocQueryRequest.class, CreateAdhocQueryResponse.class)
                .withName("CreateAdhocQuery")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/ad-hoc-queries")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAdhocQueryRequest::getWorkspaceId, CreateAdhocQueryRequest::setWorkspaceId));
        builder.<CreateAdhocQueryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAdhocQueryRequestBody.class),
            f -> f.withMarshaller(CreateAdhocQueryRequest::getBody, CreateAdhocQueryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRule =
        genForCreateAlertRule();

    private static HttpRequestDef<CreateAlertRuleRequest, CreateAlertRuleResponse> genForCreateAlertRule() {
        // basic
        HttpRequestDef.Builder<CreateAlertRuleRequest, CreateAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlertRuleRequest.class, CreateAlertRuleResponse.class)
                .withName("CreateAlertRule")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertRuleRequest::getWorkspaceId, CreateAlertRuleRequest::setWorkspaceId));
        builder.<CreateAlertRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRuleRequestBody.class),
            f -> f.withMarshaller(CreateAlertRuleRequest::getBody, CreateAlertRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAnalysisScriptRequest, CreateAnalysisScriptResponse> createAnalysisScript =
        genForCreateAnalysisScript();

    private static HttpRequestDef<CreateAnalysisScriptRequest, CreateAnalysisScriptResponse> genForCreateAnalysisScript() {
        // basic
        HttpRequestDef.Builder<CreateAnalysisScriptRequest, CreateAnalysisScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAnalysisScriptRequest.class, CreateAnalysisScriptResponse.class)
            .withName("CreateAnalysisScript")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/analysis-scripts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnalysisScriptRequest::getWorkspaceId,
                CreateAnalysisScriptRequest::setWorkspaceId));
        builder.<CreateAnalysisScriptRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAnalysisScriptRequestBody.class),
            f -> f.withMarshaller(CreateAnalysisScriptRequest::getBody, CreateAnalysisScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCodeSegmentRequest, CreateCodeSegmentResponse> createCodeSegment =
        genForCreateCodeSegment();

    private static HttpRequestDef<CreateCodeSegmentRequest, CreateCodeSegmentResponse> genForCreateCodeSegment() {
        // basic
        HttpRequestDef.Builder<CreateCodeSegmentRequest, CreateCodeSegmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCodeSegmentRequest.class, CreateCodeSegmentResponse.class)
                .withName("CreateCodeSegment")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/code-segments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCodeSegmentRequest::getWorkspaceId, CreateCodeSegmentRequest::setWorkspaceId));
        builder.<CreateCodeSegmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCodeSegmentRequestBody.class),
            f -> f.withMarshaller(CreateCodeSegmentRequest::getBody, CreateCodeSegmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCollectConfigRequest, CreateCollectConfigResponse> createCollectConfig =
        genForCreateCollectConfig();

    private static HttpRequestDef<CreateCollectConfigRequest, CreateCollectConfigResponse> genForCreateCollectConfig() {
        // basic
        HttpRequestDef.Builder<CreateCollectConfigRequest, CreateCollectConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCollectConfigRequest.class, CreateCollectConfigResponse.class)
                .withName("CreateCollectConfig")
                .withUri("/v2/{project_id}/collector/cloudlogs/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectConfigRequest::getRegionId, CreateCollectConfigRequest::setRegionId));
        builder.<CreateCollectConfigV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCollectConfigV2RequestBody.class),
            f -> f.withMarshaller(CreateCollectConfigRequest::getBody, CreateCollectConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomizedCheckitemRequest, CreateCustomizedCheckitemResponse> createCustomizedCheckitem =
        genForCreateCustomizedCheckitem();

    private static HttpRequestDef<CreateCustomizedCheckitemRequest, CreateCustomizedCheckitemResponse> genForCreateCustomizedCheckitem() {
        // basic
        HttpRequestDef.Builder<CreateCustomizedCheckitemRequest, CreateCustomizedCheckitemResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCustomizedCheckitemRequest.class,
                    CreateCustomizedCheckitemResponse.class)
                .withName("CreateCustomizedCheckitem")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/checkitems")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomizedCheckitemRequest::getWorkspaceId,
                CreateCustomizedCheckitemRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomizedCheckitemRequest::getXLanguage,
                CreateCustomizedCheckitemRequest::setXLanguage));
        builder.<CheckitemModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckitemModel.class),
            f -> f.withMarshaller(CreateCustomizedCheckitemRequest::getBody,
                CreateCustomizedCheckitemRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomizedCompliancePackageRequest, CreateCustomizedCompliancePackageResponse> createCustomizedCompliancePackage =
        genForCreateCustomizedCompliancePackage();

    private static HttpRequestDef<CreateCustomizedCompliancePackageRequest, CreateCustomizedCompliancePackageResponse> genForCreateCustomizedCompliancePackage() {
        // basic
        HttpRequestDef.Builder<CreateCustomizedCompliancePackageRequest, CreateCustomizedCompliancePackageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCustomizedCompliancePackageRequest.class,
                    CreateCustomizedCompliancePackageResponse.class)
                .withName("CreateCustomizedCompliancePackage")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/compliance-packages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomizedCompliancePackageRequest::getWorkspaceId,
                CreateCustomizedCompliancePackageRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomizedCompliancePackageRequest::getXLanguage,
                CreateCustomizedCompliancePackageRequest::setXLanguage));
        builder.<CompliancePackageModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CompliancePackageModel.class),
            f -> f.withMarshaller(CreateCustomizedCompliancePackageRequest::getBody,
                CreateCustomizedCompliancePackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataTransformationRequest, CreateDataTransformationResponse> createDataTransformation =
        genForCreateDataTransformation();

    private static HttpRequestDef<CreateDataTransformationRequest, CreateDataTransformationResponse> genForCreateDataTransformation() {
        // basic
        HttpRequestDef.Builder<CreateDataTransformationRequest, CreateDataTransformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateDataTransformationRequest.class, CreateDataTransformationResponse.class)
                .withName("CreateDataTransformation")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/data-transformations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataTransformationRequest::getWorkspaceId,
                CreateDataTransformationRequest::setWorkspaceId));
        builder.<CreateDataTransformationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataTransformationRequestBody.class),
            f -> f.withMarshaller(CreateDataTransformationRequest::getBody, CreateDataTransformationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLayoutFieldRequest, CreateLayoutFieldResponse> createLayoutField =
        genForCreateLayoutField();

    private static HttpRequestDef<CreateLayoutFieldRequest, CreateLayoutFieldResponse> genForCreateLayoutField() {
        // basic
        HttpRequestDef.Builder<CreateLayoutFieldRequest, CreateLayoutFieldResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLayoutFieldRequest.class, CreateLayoutFieldResponse.class)
                .withName("CreateLayoutField")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/soc/layouts/fields")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLayoutFieldRequest::getWorkspaceId, CreateLayoutFieldRequest::setWorkspaceId));
        builder.<CreateLayoutFieldRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLayoutFieldRequestBody.class),
            f -> f.withMarshaller(CreateLayoutFieldRequest::getBody, CreateLayoutFieldRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLayoutFieldResponse::getXRequestId, CreateLayoutFieldResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePipeRequest, CreatePipeResponse> createPipe = genForCreatePipe();

    private static HttpRequestDef<CreatePipeRequest, CreatePipeResponse> genForCreatePipe() {
        // basic
        HttpRequestDef.Builder<CreatePipeRequest, CreatePipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePipeRequest.class, CreatePipeResponse.class)
                .withName("CreatePipe")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/pipes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipeRequest::getWorkspaceId, CreatePipeRequest::setWorkspaceId));
        builder.<CreatePipeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePipeRequestBody.class),
            f -> f.withMarshaller(CreatePipeRequest::getBody, CreatePipeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetrieveScriptRequest, CreateRetrieveScriptResponse> createRetrieveScript =
        genForCreateRetrieveScript();

    private static HttpRequestDef<CreateRetrieveScriptRequest, CreateRetrieveScriptResponse> genForCreateRetrieveScript() {
        // basic
        HttpRequestDef.Builder<CreateRetrieveScriptRequest, CreateRetrieveScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRetrieveScriptRequest.class, CreateRetrieveScriptResponse.class)
            .withName("CreateRetrieveScript")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/retrieve-scripts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRetrieveScriptRequest::getWorkspaceId,
                CreateRetrieveScriptRequest::setWorkspaceId));
        builder.<CreateRetrieveScriptRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRetrieveScriptRequestBody.class),
            f -> f.withMarshaller(CreateRetrieveScriptRequest::getBody, CreateRetrieveScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlRenderRequest, CreateSqlRenderResponse> createSqlRender =
        genForCreateSqlRender();

    private static HttpRequestDef<CreateSqlRenderRequest, CreateSqlRenderResponse> genForCreateSqlRender() {
        // basic
        HttpRequestDef.Builder<CreateSqlRenderRequest, CreateSqlRenderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlRenderRequest.class, CreateSqlRenderResponse.class)
                .withName("CreateSqlRender")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/ad-hoc-queries/sql-render")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlRenderRequest::getWorkspaceId, CreateSqlRenderRequest::setWorkspaceId));
        builder.<CreateSqlRenderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlRenderRequestBody.class),
            f -> f.withMarshaller(CreateSqlRenderRequest::getBody, CreateSqlRenderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableRequest, CreateTableResponse> createTable = genForCreateTable();

    private static HttpRequestDef<CreateTableRequest, CreateTableResponse> genForCreateTable() {
        // basic
        HttpRequestDef.Builder<CreateTableRequest, CreateTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTableRequest.class, CreateTableResponse.class)
                .withName("CreateTable")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getWorkspaceId, CreateTableRequest::setWorkspaceId));
        builder.<CreateTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTableRequestBody.class),
            f -> f.withMarshaller(CreateTableRequest::getBody, CreateTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableAnalysisRequest, CreateTableAnalysisResponse> createTableAnalysis =
        genForCreateTableAnalysis();

    private static HttpRequestDef<CreateTableAnalysisRequest, CreateTableAnalysisResponse> genForCreateTableAnalysis() {
        // basic
        HttpRequestDef.Builder<CreateTableAnalysisRequest, CreateTableAnalysisResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTableAnalysisRequest.class, CreateTableAnalysisResponse.class)
                .withName("CreateTableAnalysis")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}/analysis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableAnalysisRequest::getWorkspaceId,
                CreateTableAnalysisRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableAnalysisRequest::getTableId, CreateTableAnalysisRequest::setTableId));
        builder.<ListTableLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTableLogsRequestBody.class),
            f -> f.withMarshaller(CreateTableAnalysisRequest::getBody, CreateTableAnalysisRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAdhocQueryRequest, DeleteAdhocQueryResponse> deleteAdhocQuery =
        genForDeleteAdhocQuery();

    private static HttpRequestDef<DeleteAdhocQueryRequest, DeleteAdhocQueryResponse> genForDeleteAdhocQuery() {
        // basic
        HttpRequestDef.Builder<DeleteAdhocQueryRequest, DeleteAdhocQueryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAdhocQueryRequest.class, DeleteAdhocQueryResponse.class)
                .withName("DeleteAdhocQuery")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/ad-hoc-queries/{query_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAdhocQueryRequest::getWorkspaceId, DeleteAdhocQueryRequest::setWorkspaceId));
        builder.<String>withRequestField("query_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAdhocQueryRequest::getQueryId, DeleteAdhocQueryRequest::setQueryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRule =
        genForDeleteAlertRule();

    private static HttpRequestDef<DeleteAlertRuleRequest, DeleteAlertRuleResponse> genForDeleteAlertRule() {
        // basic
        HttpRequestDef.Builder<DeleteAlertRuleRequest, DeleteAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlertRuleRequest.class, DeleteAlertRuleResponse.class)
                .withName("DeleteAlertRule")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{alert_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlertRuleRequest::getWorkspaceId, DeleteAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlertRuleRequest::getAlertRuleId, DeleteAlertRuleRequest::setAlertRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnalysisScriptRequest, DeleteAnalysisScriptResponse> deleteAnalysisScript =
        genForDeleteAnalysisScript();

    private static HttpRequestDef<DeleteAnalysisScriptRequest, DeleteAnalysisScriptResponse> genForDeleteAnalysisScript() {
        // basic
        HttpRequestDef.Builder<DeleteAnalysisScriptRequest, DeleteAnalysisScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAnalysisScriptRequest.class, DeleteAnalysisScriptResponse.class)
            .withName("DeleteAnalysisScript")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/analysis-scripts/{analysis_script_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnalysisScriptRequest::getWorkspaceId,
                DeleteAnalysisScriptRequest::setWorkspaceId));
        builder.<String>withRequestField("analysis_script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnalysisScriptRequest::getAnalysisScriptId,
                DeleteAnalysisScriptRequest::setAnalysisScriptId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCodeSegmentRequest, DeleteCodeSegmentResponse> deleteCodeSegment =
        genForDeleteCodeSegment();

    private static HttpRequestDef<DeleteCodeSegmentRequest, DeleteCodeSegmentResponse> genForDeleteCodeSegment() {
        // basic
        HttpRequestDef.Builder<DeleteCodeSegmentRequest, DeleteCodeSegmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCodeSegmentRequest.class, DeleteCodeSegmentResponse.class)
                .withName("DeleteCodeSegment")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/code-segments/{code_segment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCodeSegmentRequest::getWorkspaceId, DeleteCodeSegmentRequest::setWorkspaceId));
        builder.<String>withRequestField("code_segment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCodeSegmentRequest::getCodeSegmentId,
                DeleteCodeSegmentRequest::setCodeSegmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomizedCheckitemsRequest, DeleteCustomizedCheckitemsResponse> deleteCustomizedCheckitems =
        genForDeleteCustomizedCheckitems();

    private static HttpRequestDef<DeleteCustomizedCheckitemsRequest, DeleteCustomizedCheckitemsResponse> genForDeleteCustomizedCheckitems() {
        // basic
        HttpRequestDef.Builder<DeleteCustomizedCheckitemsRequest, DeleteCustomizedCheckitemsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCustomizedCheckitemsRequest.class,
                    DeleteCustomizedCheckitemsResponse.class)
                .withName("DeleteCustomizedCheckitems")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/checkitems")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomizedCheckitemsRequest::getWorkspaceId,
                DeleteCustomizedCheckitemsRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomizedCheckitemsRequest::getXLanguage,
                DeleteCustomizedCheckitemsRequest::setXLanguage));
        builder.<DeleteCustomizedCheckitemsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteCustomizedCheckitemsRequestBody.class),
            f -> f.withMarshaller(DeleteCustomizedCheckitemsRequest::getBody,
                DeleteCustomizedCheckitemsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomizedCompliancePackagesRequest, DeleteCustomizedCompliancePackagesResponse> deleteCustomizedCompliancePackages =
        genForDeleteCustomizedCompliancePackages();

    private static HttpRequestDef<DeleteCustomizedCompliancePackagesRequest, DeleteCustomizedCompliancePackagesResponse> genForDeleteCustomizedCompliancePackages() {
        // basic
        HttpRequestDef.Builder<DeleteCustomizedCompliancePackagesRequest, DeleteCustomizedCompliancePackagesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCustomizedCompliancePackagesRequest.class,
                    DeleteCustomizedCompliancePackagesResponse.class)
                .withName("DeleteCustomizedCompliancePackages")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/compliance-packages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomizedCompliancePackagesRequest::getWorkspaceId,
                DeleteCustomizedCompliancePackagesRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomizedCompliancePackagesRequest::getXLanguage,
                DeleteCustomizedCompliancePackagesRequest::setXLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(DeleteCustomizedCompliancePackagesRequest::getBody,
                    DeleteCustomizedCompliancePackagesRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataTransformationRequest, DeleteDataTransformationResponse> deleteDataTransformation =
        genForDeleteDataTransformation();

    private static HttpRequestDef<DeleteDataTransformationRequest, DeleteDataTransformationResponse> genForDeleteDataTransformation() {
        // basic
        HttpRequestDef.Builder<DeleteDataTransformationRequest, DeleteDataTransformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDataTransformationRequest.class,
                    DeleteDataTransformationResponse.class)
                .withName("DeleteDataTransformation")
                .withUri(
                    "/v2/{project_id}/workspaces/{workspace_id}/siem/data-transformations/{data_transformation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataTransformationRequest::getWorkspaceId,
                DeleteDataTransformationRequest::setWorkspaceId));
        builder.<String>withRequestField("data_transformation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataTransformationRequest::getDataTransformationId,
                DeleteDataTransformationRequest::setDataTransformationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLayoutFieldRequest, DeleteLayoutFieldResponse> deleteLayoutField =
        genForDeleteLayoutField();

    private static HttpRequestDef<DeleteLayoutFieldRequest, DeleteLayoutFieldResponse> genForDeleteLayoutField() {
        // basic
        HttpRequestDef.Builder<DeleteLayoutFieldRequest, DeleteLayoutFieldResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLayoutFieldRequest.class, DeleteLayoutFieldResponse.class)
                .withName("DeleteLayoutField")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/soc/layouts/fields")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutFieldRequest::getWorkspaceId, DeleteLayoutFieldRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteLayoutFieldRequest::getBody, DeleteLayoutFieldRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLayoutFieldResponse::getXRequestId, DeleteLayoutFieldResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePipeRequest, DeletePipeResponse> deletePipe = genForDeletePipe();

    private static HttpRequestDef<DeletePipeRequest, DeletePipeResponse> genForDeletePipe() {
        // basic
        HttpRequestDef.Builder<DeletePipeRequest, DeletePipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePipeRequest.class, DeletePipeResponse.class)
                .withName("DeletePipe")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipeRequest::getWorkspaceId, DeletePipeRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipeRequest::getPipeId, DeletePipeRequest::setPipeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRetrieveScriptRequest, DeleteRetrieveScriptResponse> deleteRetrieveScript =
        genForDeleteRetrieveScript();

    private static HttpRequestDef<DeleteRetrieveScriptRequest, DeleteRetrieveScriptResponse> genForDeleteRetrieveScript() {
        // basic
        HttpRequestDef.Builder<DeleteRetrieveScriptRequest, DeleteRetrieveScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteRetrieveScriptRequest.class, DeleteRetrieveScriptResponse.class)
            .withName("DeleteRetrieveScript")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/retrieve-scripts/{retrieve_script_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRetrieveScriptRequest::getWorkspaceId,
                DeleteRetrieveScriptRequest::setWorkspaceId));
        builder.<String>withRequestField("retrieve_script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRetrieveScriptRequest::getRetrieveScriptId,
                DeleteRetrieveScriptRequest::setRetrieveScriptId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableRequest, DeleteTableResponse> deleteTable = genForDeleteTable();

    private static HttpRequestDef<DeleteTableRequest, DeleteTableResponse> genForDeleteTable() {
        // basic
        HttpRequestDef.Builder<DeleteTableRequest, DeleteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTableRequest.class, DeleteTableResponse.class)
                .withName("DeleteTable")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getWorkspaceId, DeleteTableRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getTableId, DeleteTableRequest::setTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRule =
        genForDisableAlertRule();

    private static HttpRequestDef<DisableAlertRuleRequest, DisableAlertRuleResponse> genForDisableAlertRule() {
        // basic
        HttpRequestDef.Builder<DisableAlertRuleRequest, DisableAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableAlertRuleRequest.class, DisableAlertRuleResponse.class)
                .withName("DisableAlertRule")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{alert_rule_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableAlertRuleRequest::getWorkspaceId, DisableAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableAlertRuleRequest::getAlertRuleId, DisableAlertRuleRequest::setAlertRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableDataConsumptionRequest, DisableDataConsumptionResponse> disableDataConsumption =
        genForDisableDataConsumption();

    private static HttpRequestDef<DisableDataConsumptionRequest, DisableDataConsumptionResponse> genForDisableDataConsumption() {
        // basic
        HttpRequestDef.Builder<DisableDataConsumptionRequest, DisableDataConsumptionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DisableDataConsumptionRequest.class, DisableDataConsumptionResponse.class)
            .withName("DisableDataConsumption")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}/consumption")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDataConsumptionRequest::getWorkspaceId,
                DisableDataConsumptionRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDataConsumptionRequest::getTableId,
                DisableDataConsumptionRequest::setTableId));
        builder.<DisableConsumptionV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisableConsumptionV2RequestBody.class),
            f -> f.withMarshaller(DisableDataConsumptionRequest::getBody, DisableDataConsumptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableDataTransformationRequest, DisableDataTransformationResponse> disableDataTransformation =
        genForDisableDataTransformation();

    private static HttpRequestDef<DisableDataTransformationRequest, DisableDataTransformationResponse> genForDisableDataTransformation() {
        // basic
        HttpRequestDef.Builder<DisableDataTransformationRequest, DisableDataTransformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisableDataTransformationRequest.class,
                    DisableDataTransformationResponse.class)
                .withName("DisableDataTransformation")
                .withUri(
                    "/v2/{project_id}/workspaces/{workspace_id}/siem/data-transformations/{data_transformation_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDataTransformationRequest::getWorkspaceId,
                DisableDataTransformationRequest::setWorkspaceId));
        builder.<String>withRequestField("data_transformation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDataTransformationRequest::getDataTransformationId,
                DisableDataTransformationRequest::setDataTransformationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRule =
        genForEnableAlertRule();

    private static HttpRequestDef<EnableAlertRuleRequest, EnableAlertRuleResponse> genForEnableAlertRule() {
        // basic
        HttpRequestDef.Builder<EnableAlertRuleRequest, EnableAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableAlertRuleRequest.class, EnableAlertRuleResponse.class)
                .withName("EnableAlertRule")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{alert_rule_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableAlertRuleRequest::getWorkspaceId, EnableAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableAlertRuleRequest::getAlertRuleId, EnableAlertRuleRequest::setAlertRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDataConsumptionRequest, EnableDataConsumptionResponse> enableDataConsumption =
        genForEnableDataConsumption();

    private static HttpRequestDef<EnableDataConsumptionRequest, EnableDataConsumptionResponse> genForEnableDataConsumption() {
        // basic
        HttpRequestDef.Builder<EnableDataConsumptionRequest, EnableDataConsumptionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableDataConsumptionRequest.class, EnableDataConsumptionResponse.class)
            .withName("EnableDataConsumption")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}/consumption")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDataConsumptionRequest::getWorkspaceId,
                EnableDataConsumptionRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDataConsumptionRequest::getTableId, EnableDataConsumptionRequest::setTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDataTransformationRequest, EnableDataTransformationResponse> enableDataTransformation =
        genForEnableDataTransformation();

    private static HttpRequestDef<EnableDataTransformationRequest, EnableDataTransformationResponse> genForEnableDataTransformation() {
        // basic
        HttpRequestDef.Builder<EnableDataTransformationRequest, EnableDataTransformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, EnableDataTransformationRequest.class, EnableDataTransformationResponse.class)
                .withName("EnableDataTransformation")
                .withUri(
                    "/v2/{project_id}/workspaces/{workspace_id}/siem/data-transformations/{data_transformation_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDataTransformationRequest::getWorkspaceId,
                EnableDataTransformationRequest::setWorkspaceId));
        builder.<String>withRequestField("data_transformation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDataTransformationRequest::getDataTransformationId,
                EnableDataTransformationRequest::setDataTransformationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetrics =
        genForListAlertRuleMetrics();

    private static HttpRequestDef<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> genForListAlertRuleMetrics() {
        // basic
        HttpRequestDef.Builder<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAlertRuleMetricsRequest.class, ListAlertRuleMetricsResponse.class)
            .withName("ListAlertRuleMetrics")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/metrics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleMetricsRequest::getWorkspaceId,
                ListAlertRuleMetricsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> listAlertRuleTemplateMetrics =
        genForListAlertRuleTemplateMetrics();

    private static HttpRequestDef<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> genForListAlertRuleTemplateMetrics() {
        // basic
        HttpRequestDef.Builder<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAlertRuleTemplateMetricsRequest.class,
                    ListAlertRuleTemplateMetricsResponse.class)
                .withName("ListAlertRuleTemplateMetrics")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/templates/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplateMetricsRequest::getWorkspaceId,
                ListAlertRuleTemplateMetricsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplates =
        genForListAlertRuleTemplates();

    private static HttpRequestDef<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> genForListAlertRuleTemplates() {
        // basic
        HttpRequestDef.Builder<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAlertRuleTemplatesRequest.class, ListAlertRuleTemplatesResponse.class)
            .withName("ListAlertRuleTemplates")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getWorkspaceId,
                ListAlertRuleTemplatesRequest::setWorkspaceId));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getTemplateName,
                ListAlertRuleTemplatesRequest::setTemplateName));
        builder.<ListAlertRuleTemplatesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlertRuleTemplatesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getStatus, ListAlertRuleTemplatesRequest::setStatus));
        builder.<ListAlertRuleTemplatesRequest.SeverityEnum>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlertRuleTemplatesRequest.SeverityEnum.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSeverity,
                ListAlertRuleTemplatesRequest::setSeverity));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getOffset, ListAlertRuleTemplatesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getLimit, ListAlertRuleTemplatesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSortKey,
                ListAlertRuleTemplatesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSortDir,
                ListAlertRuleTemplatesRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRules =
        genForListAlertRules();

    private static HttpRequestDef<ListAlertRulesRequest, ListAlertRulesResponse> genForListAlertRules() {
        // basic
        HttpRequestDef.Builder<ListAlertRulesRequest, ListAlertRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlertRulesRequest.class, ListAlertRulesResponse.class)
                .withName("ListAlertRules")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getWorkspaceId, ListAlertRulesRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getOffset, ListAlertRulesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getLimit, ListAlertRulesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSortKey, ListAlertRulesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSortDir, ListAlertRulesRequest::setSortDir));
        builder.<String>withRequestField("output_table_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getOutputTableId, ListAlertRulesRequest::setOutputTableId));
        builder.<String>withRequestField("alert_rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getAlertRuleName, ListAlertRulesRequest::setAlertRuleName));
        builder.<String>withRequestField("alert_rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getAlertRuleId, ListAlertRulesRequest::setAlertRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAnalysisScriptsRequest, ListAnalysisScriptsResponse> listAnalysisScripts =
        genForListAnalysisScripts();

    private static HttpRequestDef<ListAnalysisScriptsRequest, ListAnalysisScriptsResponse> genForListAnalysisScripts() {
        // basic
        HttpRequestDef.Builder<ListAnalysisScriptsRequest, ListAnalysisScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAnalysisScriptsRequest.class, ListAnalysisScriptsResponse.class)
                .withName("ListAnalysisScripts")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/analysis-scripts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnalysisScriptsRequest::getWorkspaceId,
                ListAnalysisScriptsRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAnalysisScriptsRequest::getOffset, ListAnalysisScriptsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAnalysisScriptsRequest::getLimit, ListAnalysisScriptsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnalysisScriptsRequest::getSortKey, ListAnalysisScriptsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnalysisScriptsRequest::getSortDir, ListAnalysisScriptsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCodeSegmentsRequest, ListCodeSegmentsResponse> listCodeSegments =
        genForListCodeSegments();

    private static HttpRequestDef<ListCodeSegmentsRequest, ListCodeSegmentsResponse> genForListCodeSegments() {
        // basic
        HttpRequestDef.Builder<ListCodeSegmentsRequest, ListCodeSegmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCodeSegmentsRequest.class, ListCodeSegmentsResponse.class)
                .withName("ListCodeSegments")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/code-segments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCodeSegmentsRequest::getWorkspaceId, ListCodeSegmentsRequest::setWorkspaceId));
        builder.<String>withRequestField("code_segment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCodeSegmentsRequest::getCodeSegmentId,
                ListCodeSegmentsRequest::setCodeSegmentId));
        builder.<String>withRequestField("code_segment_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCodeSegmentsRequest::getCodeSegmentName,
                ListCodeSegmentsRequest::setCodeSegmentName));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCodeSegmentsRequest::getOffset, ListCodeSegmentsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCodeSegmentsRequest::getLimit, ListCodeSegmentsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCodeSegmentsRequest::getSortKey, ListCodeSegmentsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCodeSegmentsRequest::getSortDir, ListCodeSegmentsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectConfigRequest, ListCollectConfigResponse> listCollectConfig =
        genForListCollectConfig();

    private static HttpRequestDef<ListCollectConfigRequest, ListCollectConfigResponse> genForListCollectConfig() {
        // basic
        HttpRequestDef.Builder<ListCollectConfigRequest, ListCollectConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCollectConfigRequest.class, ListCollectConfigResponse.class)
                .withName("ListCollectConfig")
                .withUri("/v2/{project_id}/collector/cloudlogs/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getRegionId, ListCollectConfigRequest::setRegionId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getOffset, ListCollectConfigRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getLimit, ListCollectConfigRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getSortKey, ListCollectConfigRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getSortDir, ListCollectConfigRequest::setSortDir));
        builder.<String>withRequestField("csvc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getCsvc, ListCollectConfigRequest::setCsvc));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getDomainId, ListCollectConfigRequest::setDomainId));
        builder.<Boolean>withRequestField("query_statistics",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getQueryStatistics,
                ListCollectConfigRequest::setQueryStatistics));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataTransformationMetricsRequest, ListDataTransformationMetricsResponse> listDataTransformationMetrics =
        genForListDataTransformationMetrics();

    private static HttpRequestDef<ListDataTransformationMetricsRequest, ListDataTransformationMetricsResponse> genForListDataTransformationMetrics() {
        // basic
        HttpRequestDef.Builder<ListDataTransformationMetricsRequest, ListDataTransformationMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDataTransformationMetricsRequest.class,
                    ListDataTransformationMetricsResponse.class)
                .withName("ListDataTransformationMetrics")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/data-transformations/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTransformationMetricsRequest::getWorkspaceId,
                ListDataTransformationMetricsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataTransformationsRequest, ListDataTransformationsResponse> listDataTransformations =
        genForListDataTransformations();

    private static HttpRequestDef<ListDataTransformationsRequest, ListDataTransformationsResponse> genForListDataTransformations() {
        // basic
        HttpRequestDef.Builder<ListDataTransformationsRequest, ListDataTransformationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDataTransformationsRequest.class, ListDataTransformationsResponse.class)
            .withName("ListDataTransformations")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/data-transformations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTransformationsRequest::getWorkspaceId,
                ListDataTransformationsRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataTransformationsRequest::getOffset,
                ListDataTransformationsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataTransformationsRequest::getLimit, ListDataTransformationsRequest::setLimit));
        builder.<String>withRequestField("output_table_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTransformationsRequest::getOutputTableId,
                ListDataTransformationsRequest::setOutputTableId));
        builder.<String>withRequestField("data_transformation_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTransformationsRequest::getDataTransformationName,
                ListDataTransformationsRequest::setDataTransformationName));
        builder.<String>withRequestField("data_transformation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTransformationsRequest::getDataTransformationId,
                ListDataTransformationsRequest::setDataTransformationId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTransformationsRequest::getSortKey,
                ListDataTransformationsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTransformationsRequest::getSortDir,
                ListDataTransformationsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectoriesRequest, ListDirectoriesResponse> listDirectories =
        genForListDirectories();

    private static HttpRequestDef<ListDirectoriesRequest, ListDirectoriesResponse> genForListDirectories() {
        // basic
        HttpRequestDef.Builder<ListDirectoriesRequest, ListDirectoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDirectoriesRequest.class, ListDirectoriesResponse.class)
                .withName("ListDirectories")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/directories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getWorkspaceId, ListDirectoriesRequest::setWorkspaceId));
        builder.<ListDirectoriesRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDirectoriesRequest.CategoryEnum.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getCategory, ListDirectoriesRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLayoutFieldAllRequest, ListLayoutFieldAllResponse> listLayoutFieldAll =
        genForListLayoutFieldAll();

    private static HttpRequestDef<ListLayoutFieldAllRequest, ListLayoutFieldAllResponse> genForListLayoutFieldAll() {
        // basic
        HttpRequestDef.Builder<ListLayoutFieldAllRequest, ListLayoutFieldAllResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLayoutFieldAllRequest.class, ListLayoutFieldAllResponse.class)
                .withName("ListLayoutFieldAll")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/soc/layouts/fields")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLayoutFieldAllRequest::getWorkspaceId,
                ListLayoutFieldAllRequest::setWorkspaceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLayoutFieldAllRequest::getName, ListLayoutFieldAllRequest::setName));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLayoutFieldAllRequest::getIsBuiltIn, ListLayoutFieldAllRequest::setIsBuiltIn));
        builder.<String>withRequestField("business_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLayoutFieldAllRequest::getBusinessCode,
                ListLayoutFieldAllRequest::setBusinessCode));
        builder.<String>withRequestField("layout_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLayoutFieldAllRequest::getLayoutId, ListLayoutFieldAllRequest::setLayoutId));

        // response
        builder.<List<LayoutFieldResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLayoutFieldAllResponse::getBody, ListLayoutFieldAllResponse::setBody)
                .withInnerContainerType(LayoutFieldResponseBody.class));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLayoutFieldAllResponse::getXRequestId,
                ListLayoutFieldAllResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPipesRequest, ListPipesResponse> listPipes = genForListPipes();

    private static HttpRequestDef<ListPipesRequest, ListPipesResponse> genForListPipes() {
        // basic
        HttpRequestDef.Builder<ListPipesRequest, ListPipesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPipesRequest.class, ListPipesResponse.class)
                .withName("ListPipes")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/pipes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getWorkspaceId, ListPipesRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPipesRequest::getOffset, ListPipesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPipesRequest::getLimit, ListPipesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getSortKey, ListPipesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getSortDir, ListPipesRequest::setSortDir));
        builder.<String>withRequestField("pipe_name_in_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getPipeNameInQuery, ListPipesRequest::setPipeNameInQuery));
        builder.<String>withRequestField("pipe_id_in_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getPipeIdInQuery, ListPipesRequest::setPipeIdInQuery));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRetrieveScriptsRequest, ListRetrieveScriptsResponse> listRetrieveScripts =
        genForListRetrieveScripts();

    private static HttpRequestDef<ListRetrieveScriptsRequest, ListRetrieveScriptsResponse> genForListRetrieveScripts() {
        // basic
        HttpRequestDef.Builder<ListRetrieveScriptsRequest, ListRetrieveScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRetrieveScriptsRequest.class, ListRetrieveScriptsResponse.class)
                .withName("ListRetrieveScripts")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/retrieve-scripts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetrieveScriptsRequest::getWorkspaceId,
                ListRetrieveScriptsRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetrieveScriptsRequest::getTableId, ListRetrieveScriptsRequest::setTableId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRetrieveScriptsRequest::getOffset, ListRetrieveScriptsRequest::setOffset));
        builder.<String>withRequestField("script_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetrieveScriptsRequest::getScriptName,
                ListRetrieveScriptsRequest::setScriptName));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRetrieveScriptsRequest::getLimit, ListRetrieveScriptsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetrieveScriptsRequest::getSortKey, ListRetrieveScriptsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetrieveScriptsRequest::getSortDir, ListRetrieveScriptsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableHistogramsRequest, ListTableHistogramsResponse> listTableHistograms =
        genForListTableHistograms();

    private static HttpRequestDef<ListTableHistogramsRequest, ListTableHistogramsResponse> genForListTableHistograms() {
        // basic
        HttpRequestDef.Builder<ListTableHistogramsRequest, ListTableHistogramsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTableHistogramsRequest.class, ListTableHistogramsResponse.class)
                .withName("ListTableHistograms")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}/histograms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableHistogramsRequest::getWorkspaceId,
                ListTableHistogramsRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableHistogramsRequest::getTableId, ListTableHistogramsRequest::setTableId));
        builder.<ListTableHistogramsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTableHistogramsRequestBody.class),
            f -> f.withMarshaller(ListTableHistogramsRequest::getBody, ListTableHistogramsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableLogsRequest, ListTableLogsResponse> listTableLogs =
        genForListTableLogs();

    private static HttpRequestDef<ListTableLogsRequest, ListTableLogsResponse> genForListTableLogs() {
        // basic
        HttpRequestDef.Builder<ListTableLogsRequest, ListTableLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTableLogsRequest.class, ListTableLogsResponse.class)
                .withName("ListTableLogs")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableLogsRequest::getWorkspaceId, ListTableLogsRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableLogsRequest::getTableId, ListTableLogsRequest::setTableId));
        builder.<ListTableLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTableLogsRequestBody.class),
            f -> f.withMarshaller(ListTableLogsRequest::getBody, ListTableLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesRequest, ListTablesResponse> listTables = genForListTables();

    private static HttpRequestDef<ListTablesRequest, ListTablesResponse> genForListTables() {
        // basic
        HttpRequestDef.Builder<ListTablesRequest, ListTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTablesRequest.class, ListTablesResponse.class)
                .withName("ListTables")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getWorkspaceId, ListTablesRequest::setWorkspaceId));
        builder.<ListTablesRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTablesRequest.CategoryEnum.class),
            f -> f.withMarshaller(ListTablesRequest::getCategory, ListTablesRequest::setCategory));
        builder.<String>withRequestField("table_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTableId, ListTablesRequest::setTableId));
        builder.<String>withRequestField("table_alias",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTableAlias, ListTablesRequest::setTableAlias));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTableName, ListTablesRequest::setTableName));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTablesRequest::getOffset, ListTablesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTablesRequest::getLimit, ListTablesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getSortKey, ListTablesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getSortDir, ListTablesRequest::setSortDir));
        builder.<Boolean>withRequestField("exists",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTablesRequest::getExists, ListTablesRequest::setExists));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchBaselineRequest, SearchBaselineResponse> searchBaseline =
        genForSearchBaseline();

    private static HttpRequestDef<SearchBaselineRequest, SearchBaselineResponse> genForSearchBaseline() {
        // basic
        HttpRequestDef.Builder<SearchBaselineRequest, SearchBaselineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchBaselineRequest.class, SearchBaselineResponse.class)
                .withName("SearchBaseline")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchBaselineRequest::getWorkspaceId, SearchBaselineRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchBaselineRequest::getXLanguage, SearchBaselineRequest::setXLanguage));
        builder.<BaselineSearchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BaselineSearchRequestBody.class),
            f -> f.withMarshaller(SearchBaselineRequest::getBody, SearchBaselineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCheckitemsRequest, SearchCheckitemsResponse> searchCheckitems =
        genForSearchCheckitems();

    private static HttpRequestDef<SearchCheckitemsRequest, SearchCheckitemsResponse> genForSearchCheckitems() {
        // basic
        HttpRequestDef.Builder<SearchCheckitemsRequest, SearchCheckitemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchCheckitemsRequest.class, SearchCheckitemsResponse.class)
                .withName("SearchCheckitems")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/checkitems/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCheckitemsRequest::getWorkspaceId, SearchCheckitemsRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCheckitemsRequest::getXLanguage, SearchCheckitemsRequest::setXLanguage));
        builder.<SearchCheckitemsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchCheckitemsRequestBody.class),
            f -> f.withMarshaller(SearchCheckitemsRequest::getBody, SearchCheckitemsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCompliancePackagesRequest, SearchCompliancePackagesResponse> searchCompliancePackages =
        genForSearchCompliancePackages();

    private static HttpRequestDef<SearchCompliancePackagesRequest, SearchCompliancePackagesResponse> genForSearchCompliancePackages() {
        // basic
        HttpRequestDef.Builder<SearchCompliancePackagesRequest, SearchCompliancePackagesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SearchCompliancePackagesRequest.class, SearchCompliancePackagesResponse.class)
                .withName("SearchCompliancePackages")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/compliance-packages/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCompliancePackagesRequest::getWorkspaceId,
                SearchCompliancePackagesRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCompliancePackagesRequest::getXLanguage,
                SearchCompliancePackagesRequest::setXLanguage));
        builder.<SearchCompliancePackagesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchCompliancePackagesRequestBody.class),
            f -> f.withMarshaller(SearchCompliancePackagesRequest::getBody, SearchCompliancePackagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAdhocResultRequest, ShowAdhocResultResponse> showAdhocResult =
        genForShowAdhocResult();

    private static HttpRequestDef<ShowAdhocResultRequest, ShowAdhocResultResponse> genForShowAdhocResult() {
        // basic
        HttpRequestDef.Builder<ShowAdhocResultRequest, ShowAdhocResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAdhocResultRequest.class, ShowAdhocResultResponse.class)
                .withName("ShowAdhocResult")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/ad-hoc-queries/{query_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAdhocResultRequest::getWorkspaceId, ShowAdhocResultRequest::setWorkspaceId));
        builder.<String>withRequestField("query_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAdhocResultRequest::getQueryId, ShowAdhocResultRequest::setQueryId));
        builder.<Integer>withRequestField("batch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAdhocResultRequest::getBatch, ShowAdhocResultRequest::setBatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRule =
        genForShowAlertRule();

    private static HttpRequestDef<ShowAlertRuleRequest, ShowAlertRuleResponse> genForShowAlertRule() {
        // basic
        HttpRequestDef.Builder<ShowAlertRuleRequest, ShowAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlertRuleRequest.class, ShowAlertRuleResponse.class)
                .withName("ShowAlertRule")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{alert_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleRequest::getWorkspaceId, ShowAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleRequest::getAlertRuleId, ShowAlertRuleRequest::setAlertRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplate =
        genForShowAlertRuleTemplate();

    private static HttpRequestDef<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> genForShowAlertRuleTemplate() {
        // basic
        HttpRequestDef.Builder<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAlertRuleTemplateRequest.class, ShowAlertRuleTemplateResponse.class)
            .withName("ShowAlertRuleTemplate")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleTemplateRequest::getWorkspaceId,
                ShowAlertRuleTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleTemplateRequest::getTemplateId,
                ShowAlertRuleTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAnalysisScriptRequest, ShowAnalysisScriptResponse> showAnalysisScript =
        genForShowAnalysisScript();

    private static HttpRequestDef<ShowAnalysisScriptRequest, ShowAnalysisScriptResponse> genForShowAnalysisScript() {
        // basic
        HttpRequestDef.Builder<ShowAnalysisScriptRequest, ShowAnalysisScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAnalysisScriptRequest.class, ShowAnalysisScriptResponse.class)
                .withName("ShowAnalysisScript")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/analysis-scripts/{analysis_script_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalysisScriptRequest::getWorkspaceId,
                ShowAnalysisScriptRequest::setWorkspaceId));
        builder.<String>withRequestField("analysis_script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalysisScriptRequest::getAnalysisScriptId,
                ShowAnalysisScriptRequest::setAnalysisScriptId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckitemDetailRequest, ShowCheckitemDetailResponse> showCheckitemDetail =
        genForShowCheckitemDetail();

    private static HttpRequestDef<ShowCheckitemDetailRequest, ShowCheckitemDetailResponse> genForShowCheckitemDetail() {
        // basic
        HttpRequestDef.Builder<ShowCheckitemDetailRequest, ShowCheckitemDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCheckitemDetailRequest.class, ShowCheckitemDetailResponse.class)
                .withName("ShowCheckitemDetail")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/checkitems/{checkitem_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckitemDetailRequest::getWorkspaceId,
                ShowCheckitemDetailRequest::setWorkspaceId));
        builder.<String>withRequestField("checkitem_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckitemDetailRequest::getCheckitemId,
                ShowCheckitemDetailRequest::setCheckitemId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckitemDetailRequest::getXLanguage, ShowCheckitemDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCodeSegmentRequest, ShowCodeSegmentResponse> showCodeSegment =
        genForShowCodeSegment();

    private static HttpRequestDef<ShowCodeSegmentRequest, ShowCodeSegmentResponse> genForShowCodeSegment() {
        // basic
        HttpRequestDef.Builder<ShowCodeSegmentRequest, ShowCodeSegmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCodeSegmentRequest.class, ShowCodeSegmentResponse.class)
                .withName("ShowCodeSegment")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/code-segments/{code_segment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCodeSegmentRequest::getWorkspaceId, ShowCodeSegmentRequest::setWorkspaceId));
        builder.<String>withRequestField("code_segment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCodeSegmentRequest::getCodeSegmentId, ShowCodeSegmentRequest::setCodeSegmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompliancePackageDetailRequest, ShowCompliancePackageDetailResponse> showCompliancePackageDetail =
        genForShowCompliancePackageDetail();

    private static HttpRequestDef<ShowCompliancePackageDetailRequest, ShowCompliancePackageDetailResponse> genForShowCompliancePackageDetail() {
        // basic
        HttpRequestDef.Builder<ShowCompliancePackageDetailRequest, ShowCompliancePackageDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCompliancePackageDetailRequest.class,
                    ShowCompliancePackageDetailResponse.class)
                .withName("ShowCompliancePackageDetail")
                .withUri(
                    "/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/compliance-packages/{compliance_packages_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("compliance_packages_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompliancePackageDetailRequest::getCompliancePackagesId,
                ShowCompliancePackageDetailRequest::setCompliancePackagesId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompliancePackageDetailRequest::getWorkspaceId,
                ShowCompliancePackageDetailRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompliancePackageDetailRequest::getXLanguage,
                ShowCompliancePackageDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataConsumptionRequest, ShowDataConsumptionResponse> showDataConsumption =
        genForShowDataConsumption();

    private static HttpRequestDef<ShowDataConsumptionRequest, ShowDataConsumptionResponse> genForShowDataConsumption() {
        // basic
        HttpRequestDef.Builder<ShowDataConsumptionRequest, ShowDataConsumptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataConsumptionRequest.class, ShowDataConsumptionResponse.class)
                .withName("ShowDataConsumption")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}/consumption")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataConsumptionRequest::getWorkspaceId,
                ShowDataConsumptionRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataConsumptionRequest::getTableId, ShowDataConsumptionRequest::setTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataTransformationRequest, ShowDataTransformationResponse> showDataTransformation =
        genForShowDataTransformation();

    private static HttpRequestDef<ShowDataTransformationRequest, ShowDataTransformationResponse> genForShowDataTransformation() {
        // basic
        HttpRequestDef.Builder<ShowDataTransformationRequest, ShowDataTransformationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDataTransformationRequest.class, ShowDataTransformationResponse.class)
            .withName("ShowDataTransformation")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/data-transformations/{data_transformation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataTransformationRequest::getWorkspaceId,
                ShowDataTransformationRequest::setWorkspaceId));
        builder.<String>withRequestField("data_transformation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataTransformationRequest::getDataTransformationId,
                ShowDataTransformationRequest::setDataTransformationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLayoutFieldInfoRequest, ShowLayoutFieldInfoResponse> showLayoutFieldInfo =
        genForShowLayoutFieldInfo();

    private static HttpRequestDef<ShowLayoutFieldInfoRequest, ShowLayoutFieldInfoResponse> genForShowLayoutFieldInfo() {
        // basic
        HttpRequestDef.Builder<ShowLayoutFieldInfoRequest, ShowLayoutFieldInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLayoutFieldInfoRequest.class, ShowLayoutFieldInfoResponse.class)
                .withName("ShowLayoutFieldInfo")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/soc/layouts/fields/{field_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutFieldInfoRequest::getWorkspaceId,
                ShowLayoutFieldInfoRequest::setWorkspaceId));
        builder.<String>withRequestField("field_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutFieldInfoRequest::getFieldId, ShowLayoutFieldInfoRequest::setFieldId));
        builder.<String>withRequestField("layout_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutFieldInfoRequest::getLayoutId, ShowLayoutFieldInfoRequest::setLayoutId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowLayoutFieldInfoResponse::getXRequestId,
                ShowLayoutFieldInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitorStatsRequest, ShowMonitorStatsResponse> showMonitorStats =
        genForShowMonitorStats();

    private static HttpRequestDef<ShowMonitorStatsRequest, ShowMonitorStatsResponse> genForShowMonitorStats() {
        // basic
        HttpRequestDef.Builder<ShowMonitorStatsRequest, ShowMonitorStatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMonitorStatsRequest.class, ShowMonitorStatsResponse.class)
                .withName("ShowMonitorStats")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMonitorStatsRequest::getWorkspaceId, ShowMonitorStatsRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMonitorStatsRequest::getTableId, ShowMonitorStatsRequest::setTableId));
        builder.<ShowPulsarMonitorStatsBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowPulsarMonitorStatsBody.class),
            f -> f.withMarshaller(ShowMonitorStatsRequest::getBody, ShowMonitorStatsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipeRequest, ShowPipeResponse> showPipe = genForShowPipe();

    private static HttpRequestDef<ShowPipeRequest, ShowPipeResponse> genForShowPipe() {
        // basic
        HttpRequestDef.Builder<ShowPipeRequest, ShowPipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPipeRequest.class, ShowPipeResponse.class)
                .withName("ShowPipe")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipeRequest::getWorkspaceId, ShowPipeRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipeRequest::getPipeId, ShowPipeRequest::setPipeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRetrieveScriptRequest, ShowRetrieveScriptResponse> showRetrieveScript =
        genForShowRetrieveScript();

    private static HttpRequestDef<ShowRetrieveScriptRequest, ShowRetrieveScriptResponse> genForShowRetrieveScript() {
        // basic
        HttpRequestDef.Builder<ShowRetrieveScriptRequest, ShowRetrieveScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRetrieveScriptRequest.class, ShowRetrieveScriptResponse.class)
                .withName("ShowRetrieveScript")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/retrieve-scripts/{retrieve_script_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRetrieveScriptRequest::getWorkspaceId,
                ShowRetrieveScriptRequest::setWorkspaceId));
        builder.<String>withRequestField("retrieve_script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRetrieveScriptRequest::getRetrieveScriptId,
                ShowRetrieveScriptRequest::setRetrieveScriptId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubscriptionResourcesRequest, ShowSubscriptionResourcesResponse> showSubscriptionResources =
        genForShowSubscriptionResources();

    private static HttpRequestDef<ShowSubscriptionResourcesRequest, ShowSubscriptionResourcesResponse> genForShowSubscriptionResources() {
        // basic
        HttpRequestDef.Builder<ShowSubscriptionResourcesRequest, ShowSubscriptionResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSubscriptionResourcesRequest.class,
                    ShowSubscriptionResourcesResponse.class)
                .withName("ShowSubscriptionResources")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/subscription/resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubscriptionResourcesRequest::getWorkspaceId,
                ShowSubscriptionResourcesRequest::setWorkspaceId));
        builder.<ShowSubscriptionResourcesRequest.SkuEnum>withRequestField("sku",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowSubscriptionResourcesRequest.SkuEnum.class),
            f -> f.withMarshaller(ShowSubscriptionResourcesRequest::getSku, ShowSubscriptionResourcesRequest::setSku));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableRequest, ShowTableResponse> showTable = genForShowTable();

    private static HttpRequestDef<ShowTableRequest, ShowTableResponse> genForShowTable() {
        // basic
        HttpRequestDef.Builder<ShowTableRequest, ShowTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTableRequest.class, ShowTableResponse.class)
                .withName("ShowTable")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getWorkspaceId, ShowTableRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getTableId, ShowTableRequest::setTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForShowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForShowVersion() {
        // basic
        HttpRequestDef.Builder<ShowVersionRequest, ShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionRequest.class, ShowVersionResponse.class)
                .withName("ShowVersion")
                .withUri("/v2/{project_id}/siem/upgradation/version")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRule =
        genForUpdateAlertRule();

    private static HttpRequestDef<UpdateAlertRuleRequest, UpdateAlertRuleResponse> genForUpdateAlertRule() {
        // basic
        HttpRequestDef.Builder<UpdateAlertRuleRequest, UpdateAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlertRuleRequest.class, UpdateAlertRuleResponse.class)
                .withName("UpdateAlertRule")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{alert_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getWorkspaceId, UpdateAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getAlertRuleId, UpdateAlertRuleRequest::setAlertRuleId));
        builder.<UpdateAlertRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlertRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getBody, UpdateAlertRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnalysisScriptRequest, UpdateAnalysisScriptResponse> updateAnalysisScript =
        genForUpdateAnalysisScript();

    private static HttpRequestDef<UpdateAnalysisScriptRequest, UpdateAnalysisScriptResponse> genForUpdateAnalysisScript() {
        // basic
        HttpRequestDef.Builder<UpdateAnalysisScriptRequest, UpdateAnalysisScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAnalysisScriptRequest.class, UpdateAnalysisScriptResponse.class)
            .withName("UpdateAnalysisScript")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/analysis-scripts/{analysis_script_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnalysisScriptRequest::getWorkspaceId,
                UpdateAnalysisScriptRequest::setWorkspaceId));
        builder.<String>withRequestField("analysis_script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnalysisScriptRequest::getAnalysisScriptId,
                UpdateAnalysisScriptRequest::setAnalysisScriptId));
        builder.<UpdateAnalysisScriptRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAnalysisScriptRequestBody.class),
            f -> f.withMarshaller(UpdateAnalysisScriptRequest::getBody, UpdateAnalysisScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCheckitemRequest, UpdateCheckitemResponse> updateCheckitem =
        genForUpdateCheckitem();

    private static HttpRequestDef<UpdateCheckitemRequest, UpdateCheckitemResponse> genForUpdateCheckitem() {
        // basic
        HttpRequestDef.Builder<UpdateCheckitemRequest, UpdateCheckitemResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCheckitemRequest.class, UpdateCheckitemResponse.class)
                .withName("UpdateCheckitem")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/checkitems/{checkitem_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCheckitemRequest::getWorkspaceId, UpdateCheckitemRequest::setWorkspaceId));
        builder.<String>withRequestField("checkitem_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCheckitemRequest::getCheckitemId, UpdateCheckitemRequest::setCheckitemId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCheckitemRequest::getXLanguage, UpdateCheckitemRequest::setXLanguage));
        builder.<CheckitemModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckitemModel.class),
            f -> f.withMarshaller(UpdateCheckitemRequest::getBody, UpdateCheckitemRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCodeSegmentRequest, UpdateCodeSegmentResponse> updateCodeSegment =
        genForUpdateCodeSegment();

    private static HttpRequestDef<UpdateCodeSegmentRequest, UpdateCodeSegmentResponse> genForUpdateCodeSegment() {
        // basic
        HttpRequestDef.Builder<UpdateCodeSegmentRequest, UpdateCodeSegmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCodeSegmentRequest.class, UpdateCodeSegmentResponse.class)
                .withName("UpdateCodeSegment")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/code-segments/{code_segment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCodeSegmentRequest::getWorkspaceId, UpdateCodeSegmentRequest::setWorkspaceId));
        builder.<String>withRequestField("code_segment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCodeSegmentRequest::getCodeSegmentId,
                UpdateCodeSegmentRequest::setCodeSegmentId));
        builder.<UpdateCodeSegmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCodeSegmentRequestBody.class),
            f -> f.withMarshaller(UpdateCodeSegmentRequest::getBody, UpdateCodeSegmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCompliancePackageRequest, UpdateCompliancePackageResponse> updateCompliancePackage =
        genForUpdateCompliancePackage();

    private static HttpRequestDef<UpdateCompliancePackageRequest, UpdateCompliancePackageResponse> genForUpdateCompliancePackage() {
        // basic
        HttpRequestDef.Builder<UpdateCompliancePackageRequest, UpdateCompliancePackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCompliancePackageRequest.class, UpdateCompliancePackageResponse.class)
            .withName("UpdateCompliancePackage")
            .withUri(
                "/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/compliance-packages/{compliance_packages_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCompliancePackageRequest::getWorkspaceId,
                UpdateCompliancePackageRequest::setWorkspaceId));
        builder.<String>withRequestField("compliance_packages_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCompliancePackageRequest::getCompliancePackagesId,
                UpdateCompliancePackageRequest::setCompliancePackagesId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCompliancePackageRequest::getXLanguage,
                UpdateCompliancePackageRequest::setXLanguage));
        builder.<CompliancePackageModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CompliancePackageModel.class),
            f -> f.withMarshaller(UpdateCompliancePackageRequest::getBody, UpdateCompliancePackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataTransformationRequest, UpdateDataTransformationResponse> updateDataTransformation =
        genForUpdateDataTransformation();

    private static HttpRequestDef<UpdateDataTransformationRequest, UpdateDataTransformationResponse> genForUpdateDataTransformation() {
        // basic
        HttpRequestDef.Builder<UpdateDataTransformationRequest, UpdateDataTransformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateDataTransformationRequest.class, UpdateDataTransformationResponse.class)
                .withName("UpdateDataTransformation")
                .withUri(
                    "/v2/{project_id}/workspaces/{workspace_id}/siem/data-transformations/{data_transformation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataTransformationRequest::getWorkspaceId,
                UpdateDataTransformationRequest::setWorkspaceId));
        builder.<String>withRequestField("data_transformation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataTransformationRequest::getDataTransformationId,
                UpdateDataTransformationRequest::setDataTransformationId));
        builder.<UpdateDataTransformationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDataTransformationRequestBody.class),
            f -> f.withMarshaller(UpdateDataTransformationRequest::getBody, UpdateDataTransformationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLayoutFieldRequest, UpdateLayoutFieldResponse> updateLayoutField =
        genForUpdateLayoutField();

    private static HttpRequestDef<UpdateLayoutFieldRequest, UpdateLayoutFieldResponse> genForUpdateLayoutField() {
        // basic
        HttpRequestDef.Builder<UpdateLayoutFieldRequest, UpdateLayoutFieldResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLayoutFieldRequest.class, UpdateLayoutFieldResponse.class)
                .withName("UpdateLayoutField")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/soc/layouts/fields/{field_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLayoutFieldRequest::getWorkspaceId, UpdateLayoutFieldRequest::setWorkspaceId));
        builder.<String>withRequestField("field_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLayoutFieldRequest::getFieldId, UpdateLayoutFieldRequest::setFieldId));
        builder.<UpdateLayoutFieldRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLayoutFieldRequestBody.class),
            f -> f.withMarshaller(UpdateLayoutFieldRequest::getBody, UpdateLayoutFieldRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLayoutFieldResponse::getXRequestId, UpdateLayoutFieldResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipeRequest, UpdatePipeResponse> updatePipe = genForUpdatePipe();

    private static HttpRequestDef<UpdatePipeRequest, UpdatePipeResponse> genForUpdatePipe() {
        // basic
        HttpRequestDef.Builder<UpdatePipeRequest, UpdatePipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePipeRequest.class, UpdatePipeResponse.class)
                .withName("UpdatePipe")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipeRequest::getWorkspaceId, UpdatePipeRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipeRequest::getPipeId, UpdatePipeRequest::setPipeId));
        builder.<UpdatePipeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePipeRequestBody.class),
            f -> f.withMarshaller(UpdatePipeRequest::getBody, UpdatePipeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipeSchemaRequest, UpdatePipeSchemaResponse> updatePipeSchema =
        genForUpdatePipeSchema();

    private static HttpRequestDef<UpdatePipeSchemaRequest, UpdatePipeSchemaResponse> genForUpdatePipeSchema() {
        // basic
        HttpRequestDef.Builder<UpdatePipeSchemaRequest, UpdatePipeSchemaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePipeSchemaRequest.class, UpdatePipeSchemaResponse.class)
                .withName("UpdatePipeSchema")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}/schema")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipeSchemaRequest::getWorkspaceId, UpdatePipeSchemaRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipeSchemaRequest::getPipeId, UpdatePipeSchemaRequest::setPipeId));
        builder.<PipeSchema>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipeSchema.class),
            f -> f.withMarshaller(UpdatePipeSchemaRequest::getBody, UpdatePipeSchemaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRetrieveScriptRequest, UpdateRetrieveScriptResponse> updateRetrieveScript =
        genForUpdateRetrieveScript();

    private static HttpRequestDef<UpdateRetrieveScriptRequest, UpdateRetrieveScriptResponse> genForUpdateRetrieveScript() {
        // basic
        HttpRequestDef.Builder<UpdateRetrieveScriptRequest, UpdateRetrieveScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRetrieveScriptRequest.class, UpdateRetrieveScriptResponse.class)
            .withName("UpdateRetrieveScript")
            .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/retrieve-scripts/{retrieve_script_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRetrieveScriptRequest::getWorkspaceId,
                UpdateRetrieveScriptRequest::setWorkspaceId));
        builder.<String>withRequestField("retrieve_script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRetrieveScriptRequest::getRetrieveScriptId,
                UpdateRetrieveScriptRequest::setRetrieveScriptId));
        builder.<UpdateRetrieveScriptRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRetrieveScriptRequestBody.class),
            f -> f.withMarshaller(UpdateRetrieveScriptRequest::getBody, UpdateRetrieveScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTableRequest, UpdateTableResponse> updateTable = genForUpdateTable();

    private static HttpRequestDef<UpdateTableRequest, UpdateTableResponse> genForUpdateTable() {
        // basic
        HttpRequestDef.Builder<UpdateTableRequest, UpdateTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTableRequest.class, UpdateTableResponse.class)
                .withName("UpdateTable")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getWorkspaceId, UpdateTableRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableRequest::getTableId, UpdateTableRequest::setTableId));
        builder.<UpdateTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTableRequestBody.class),
            f -> f.withMarshaller(UpdateTableRequest::getBody, UpdateTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTableSchemaRequest, UpdateTableSchemaResponse> updateTableSchema =
        genForUpdateTableSchema();

    private static HttpRequestDef<UpdateTableSchemaRequest, UpdateTableSchemaResponse> genForUpdateTableSchema() {
        // basic
        HttpRequestDef.Builder<UpdateTableSchemaRequest, UpdateTableSchemaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTableSchemaRequest.class, UpdateTableSchemaResponse.class)
                .withName("UpdateTableSchema")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/tables/{table_id}/schema")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableSchemaRequest::getWorkspaceId, UpdateTableSchemaRequest::setWorkspaceId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableSchemaRequest::getTableId, UpdateTableSchemaRequest::setTableId));
        builder.<TableSchemaDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableSchemaDto.class),
            f -> f.withMarshaller(UpdateTableSchemaRequest::getBody, UpdateTableSchemaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlValidationRequest, CreateSqlValidationResponse> createSqlValidation =
        genForCreateSqlValidation();

    private static HttpRequestDef<CreateSqlValidationRequest, CreateSqlValidationResponse> genForCreateSqlValidation() {
        // basic
        HttpRequestDef.Builder<CreateSqlValidationRequest, CreateSqlValidationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlValidationRequest.class, CreateSqlValidationResponse.class)
                .withName("CreateSqlValidation")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/siem/sql/validation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlValidationRequest::getWorkspaceId,
                CreateSqlValidationRequest::setWorkspaceId));
        builder.<CreateSqlValidationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlValidationRequestBody.class),
            f -> f.withMarshaller(CreateSqlValidationRequest::getBody, CreateSqlValidationRequest::setBody));

        // response

        return builder.build();
    }

}
