package com.huaweicloud.sdk.iamaccessanalyzer.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ApplyArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ApplyArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CheckNoNewAccessReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CheckNoNewAccessRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CheckNoNewAccessResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAccessPreviewReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAccessPreviewRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAccessPreviewResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAnalyzerReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateArchiveRuleReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateNotificationSettingReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateNotificationSettingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateNotificationSettingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateResourceConfigurationsReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateResourceConfigurationsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateResourceConfigurationsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteNotificationSettingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteNotificationSettingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteResourceConfigurationReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteResourceConfigurationsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteResourceConfigurationsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAccessPreviewFindingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAccessPreviewFindingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAccessPreviewsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAccessPreviewsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAnalyzersRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAnalyzersResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListArchiveRulesRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListArchiveRulesResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListFindingsReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListFindingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListFindingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListNotificationSettingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListNotificationSettingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListPreviewFindingsReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListResourceConfigurationsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListResourceConfigurationsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAccessPreviewRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAccessPreviewResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowFindingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowFindingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowNotificationSettingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowNotificationSettingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.StartResourceScanReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.StartResourceScanRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.StartResourceScanResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.TagResourceReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.TagResourceRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.TagResourceResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UntagResourceReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UntagResourceRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UntagResourceResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateAnalyzerReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateArchiveRuleReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateFindingsReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateFindingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateFindingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateNotificationSettingReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateNotificationSettingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateNotificationSettingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ValidatePolicyReqBody;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ValidatePolicyRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ValidatePolicyResponse;

@SuppressWarnings("unchecked")
public class IAMAccessAnalyzerMeta {

    public static final HttpRequestDef<CreateAnalyzerRequest, CreateAnalyzerResponse> createAnalyzer =
        genForCreateAnalyzer();

    private static HttpRequestDef<CreateAnalyzerRequest, CreateAnalyzerResponse> genForCreateAnalyzer() {
        // basic
        HttpRequestDef.Builder<CreateAnalyzerRequest, CreateAnalyzerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAnalyzerRequest.class, CreateAnalyzerResponse.class)
                .withName("CreateAnalyzer")
                .withUri("/v5/analyzers")
                .withContentType("application/json");

        // requests
        builder.<CreateAnalyzerReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAnalyzerReqBody.class),
            f -> f.withMarshaller(CreateAnalyzerRequest::getBody, CreateAnalyzerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnalyzerRequest, DeleteAnalyzerResponse> deleteAnalyzer =
        genForDeleteAnalyzer();

    private static HttpRequestDef<DeleteAnalyzerRequest, DeleteAnalyzerResponse> genForDeleteAnalyzer() {
        // basic
        HttpRequestDef.Builder<DeleteAnalyzerRequest, DeleteAnalyzerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAnalyzerRequest.class, DeleteAnalyzerResponse.class)
                .withName("DeleteAnalyzer")
                .withUri("/v5/analyzers/{analyzer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnalyzerRequest::getAnalyzerId, DeleteAnalyzerRequest::setAnalyzerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAnalyzersRequest, ListAnalyzersResponse> listAnalyzers =
        genForListAnalyzers();

    private static HttpRequestDef<ListAnalyzersRequest, ListAnalyzersResponse> genForListAnalyzers() {
        // basic
        HttpRequestDef.Builder<ListAnalyzersRequest, ListAnalyzersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAnalyzersRequest.class, ListAnalyzersResponse.class)
                .withName("ListAnalyzers")
                .withUri("/v5/analyzers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnalyzersRequest::getLimit, ListAnalyzersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnalyzersRequest::getMarker, ListAnalyzersRequest::setMarker));
        builder.<ListAnalyzersRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAnalyzersRequest.TypeEnum.class),
            f -> f.withMarshaller(ListAnalyzersRequest::getType, ListAnalyzersRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAnalyzerRequest, ShowAnalyzerResponse> showAnalyzer = genForShowAnalyzer();

    private static HttpRequestDef<ShowAnalyzerRequest, ShowAnalyzerResponse> genForShowAnalyzer() {
        // basic
        HttpRequestDef.Builder<ShowAnalyzerRequest, ShowAnalyzerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAnalyzerRequest.class, ShowAnalyzerResponse.class)
                .withName("ShowAnalyzer")
                .withUri("/v5/analyzers/{analyzer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalyzerRequest::getAnalyzerId, ShowAnalyzerRequest::setAnalyzerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartResourceScanRequest, StartResourceScanResponse> startResourceScan =
        genForStartResourceScan();

    private static HttpRequestDef<StartResourceScanRequest, StartResourceScanResponse> genForStartResourceScan() {
        // basic
        HttpRequestDef.Builder<StartResourceScanRequest, StartResourceScanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartResourceScanRequest.class, StartResourceScanResponse.class)
                .withName("StartResourceScan")
                .withUri("/v5/analyzers/{analyzer_id}/scan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResourceScanRequest::getAnalyzerId, StartResourceScanRequest::setAnalyzerId));
        builder.<StartResourceScanReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartResourceScanReqBody.class),
            f -> f.withMarshaller(StartResourceScanRequest::getBody, StartResourceScanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnalyzerRequest, UpdateAnalyzerResponse> updateAnalyzer =
        genForUpdateAnalyzer();

    private static HttpRequestDef<UpdateAnalyzerRequest, UpdateAnalyzerResponse> genForUpdateAnalyzer() {
        // basic
        HttpRequestDef.Builder<UpdateAnalyzerRequest, UpdateAnalyzerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAnalyzerRequest.class, UpdateAnalyzerResponse.class)
                .withName("UpdateAnalyzer")
                .withUri("/v5/analyzers/{analyzer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnalyzerRequest::getAnalyzerId, UpdateAnalyzerRequest::setAnalyzerId));
        builder.<UpdateAnalyzerReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAnalyzerReqBody.class),
            f -> f.withMarshaller(UpdateAnalyzerRequest::getBody, UpdateAnalyzerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyArchiveRuleRequest, ApplyArchiveRuleResponse> applyArchiveRule =
        genForApplyArchiveRule();

    private static HttpRequestDef<ApplyArchiveRuleRequest, ApplyArchiveRuleResponse> genForApplyArchiveRule() {
        // basic
        HttpRequestDef.Builder<ApplyArchiveRuleRequest, ApplyArchiveRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyArchiveRuleRequest.class, ApplyArchiveRuleResponse.class)
                .withName("ApplyArchiveRule")
                .withUri("/v5/analyzers/{analyzer_id}/archive-rules/{archive_rule_id}/apply")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyArchiveRuleRequest::getAnalyzerId, ApplyArchiveRuleRequest::setAnalyzerId));
        builder.<String>withRequestField("archive_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyArchiveRuleRequest::getArchiveRuleId,
                ApplyArchiveRuleRequest::setArchiveRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateArchiveRuleRequest, CreateArchiveRuleResponse> createArchiveRule =
        genForCreateArchiveRule();

    private static HttpRequestDef<CreateArchiveRuleRequest, CreateArchiveRuleResponse> genForCreateArchiveRule() {
        // basic
        HttpRequestDef.Builder<CreateArchiveRuleRequest, CreateArchiveRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateArchiveRuleRequest.class, CreateArchiveRuleResponse.class)
                .withName("CreateArchiveRule")
                .withUri("/v5/analyzers/{analyzer_id}/archive-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateArchiveRuleRequest::getAnalyzerId, CreateArchiveRuleRequest::setAnalyzerId));
        builder.<CreateArchiveRuleReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateArchiveRuleReqBody.class),
            f -> f.withMarshaller(CreateArchiveRuleRequest::getBody, CreateArchiveRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteArchiveRuleRequest, DeleteArchiveRuleResponse> deleteArchiveRule =
        genForDeleteArchiveRule();

    private static HttpRequestDef<DeleteArchiveRuleRequest, DeleteArchiveRuleResponse> genForDeleteArchiveRule() {
        // basic
        HttpRequestDef.Builder<DeleteArchiveRuleRequest, DeleteArchiveRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteArchiveRuleRequest.class, DeleteArchiveRuleResponse.class)
                .withName("DeleteArchiveRule")
                .withUri("/v5/analyzers/{analyzer_id}/archive-rules/{archive_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteArchiveRuleRequest::getAnalyzerId, DeleteArchiveRuleRequest::setAnalyzerId));
        builder.<String>withRequestField("archive_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteArchiveRuleRequest::getArchiveRuleId,
                DeleteArchiveRuleRequest::setArchiveRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArchiveRulesRequest, ListArchiveRulesResponse> listArchiveRules =
        genForListArchiveRules();

    private static HttpRequestDef<ListArchiveRulesRequest, ListArchiveRulesResponse> genForListArchiveRules() {
        // basic
        HttpRequestDef.Builder<ListArchiveRulesRequest, ListArchiveRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListArchiveRulesRequest.class, ListArchiveRulesResponse.class)
                .withName("ListArchiveRules")
                .withUri("/v5/analyzers/{analyzer_id}/archive-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArchiveRulesRequest::getAnalyzerId, ListArchiveRulesRequest::setAnalyzerId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListArchiveRulesRequest::getLimit, ListArchiveRulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArchiveRulesRequest::getMarker, ListArchiveRulesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowArchiveRuleRequest, ShowArchiveRuleResponse> showArchiveRule =
        genForShowArchiveRule();

    private static HttpRequestDef<ShowArchiveRuleRequest, ShowArchiveRuleResponse> genForShowArchiveRule() {
        // basic
        HttpRequestDef.Builder<ShowArchiveRuleRequest, ShowArchiveRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowArchiveRuleRequest.class, ShowArchiveRuleResponse.class)
                .withName("ShowArchiveRule")
                .withUri("/v5/analyzers/{analyzer_id}/archive-rules/{archive_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowArchiveRuleRequest::getAnalyzerId, ShowArchiveRuleRequest::setAnalyzerId));
        builder.<String>withRequestField("archive_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowArchiveRuleRequest::getArchiveRuleId, ShowArchiveRuleRequest::setArchiveRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateArchiveRuleRequest, UpdateArchiveRuleResponse> updateArchiveRule =
        genForUpdateArchiveRule();

    private static HttpRequestDef<UpdateArchiveRuleRequest, UpdateArchiveRuleResponse> genForUpdateArchiveRule() {
        // basic
        HttpRequestDef.Builder<UpdateArchiveRuleRequest, UpdateArchiveRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateArchiveRuleRequest.class, UpdateArchiveRuleResponse.class)
                .withName("UpdateArchiveRule")
                .withUri("/v5/analyzers/{analyzer_id}/archive-rules/{archive_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateArchiveRuleRequest::getAnalyzerId, UpdateArchiveRuleRequest::setAnalyzerId));
        builder.<String>withRequestField("archive_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateArchiveRuleRequest::getArchiveRuleId,
                UpdateArchiveRuleRequest::setArchiveRuleId));
        builder.<UpdateArchiveRuleReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateArchiveRuleReqBody.class),
            f -> f.withMarshaller(UpdateArchiveRuleRequest::getBody, UpdateArchiveRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceConfigurationsRequest, CreateResourceConfigurationsResponse> createResourceConfigurations =
        genForCreateResourceConfigurations();

    private static HttpRequestDef<CreateResourceConfigurationsRequest, CreateResourceConfigurationsResponse> genForCreateResourceConfigurations() {
        // basic
        HttpRequestDef.Builder<CreateResourceConfigurationsRequest, CreateResourceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateResourceConfigurationsRequest.class,
                    CreateResourceConfigurationsResponse.class)
                .withName("CreateResourceConfigurations")
                .withUri("/v5/analyzers/{analyzer_id}/resource-configurations/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceConfigurationsRequest::getAnalyzerId,
                CreateResourceConfigurationsRequest::setAnalyzerId));
        builder.<CreateResourceConfigurationsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceConfigurationsReqBody.class),
            f -> f.withMarshaller(CreateResourceConfigurationsRequest::getBody,
                CreateResourceConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceConfigurationsRequest, DeleteResourceConfigurationsResponse> deleteResourceConfigurations =
        genForDeleteResourceConfigurations();

    private static HttpRequestDef<DeleteResourceConfigurationsRequest, DeleteResourceConfigurationsResponse> genForDeleteResourceConfigurations() {
        // basic
        HttpRequestDef.Builder<DeleteResourceConfigurationsRequest, DeleteResourceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteResourceConfigurationsRequest.class,
                    DeleteResourceConfigurationsResponse.class)
                .withName("DeleteResourceConfigurations")
                .withUri("/v5/analyzers/{analyzer_id}/resource-configurations/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceConfigurationsRequest::getAnalyzerId,
                DeleteResourceConfigurationsRequest::setAnalyzerId));
        builder.<DeleteResourceConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceConfigurationReqBody.class),
            f -> f.withMarshaller(DeleteResourceConfigurationsRequest::getBody,
                DeleteResourceConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceConfigurationsRequest, ListResourceConfigurationsResponse> listResourceConfigurations =
        genForListResourceConfigurations();

    private static HttpRequestDef<ListResourceConfigurationsRequest, ListResourceConfigurationsResponse> genForListResourceConfigurations() {
        // basic
        HttpRequestDef.Builder<ListResourceConfigurationsRequest, ListResourceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListResourceConfigurationsRequest.class,
                    ListResourceConfigurationsResponse.class)
                .withName("ListResourceConfigurations")
                .withUri("/v5/analyzers/{analyzer_id}/resource-configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceConfigurationsRequest::getAnalyzerId,
                ListResourceConfigurationsRequest::setAnalyzerId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceConfigurationsRequest::getLimit,
                ListResourceConfigurationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceConfigurationsRequest::getMarker,
                ListResourceConfigurationsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFindingsRequest, ListFindingsResponse> listFindings = genForListFindings();

    private static HttpRequestDef<ListFindingsRequest, ListFindingsResponse> genForListFindings() {
        // basic
        HttpRequestDef.Builder<ListFindingsRequest, ListFindingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListFindingsRequest.class, ListFindingsResponse.class)
                .withName("ListFindings")
                .withUri("/v5/analyzers/{analyzer_id}/findings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFindingsRequest::getAnalyzerId, ListFindingsRequest::setAnalyzerId));
        builder.<ListFindingsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFindingsReqBody.class),
            f -> f.withMarshaller(ListFindingsRequest::getBody, ListFindingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFindingRequest, ShowFindingResponse> showFinding = genForShowFinding();

    private static HttpRequestDef<ShowFindingRequest, ShowFindingResponse> genForShowFinding() {
        // basic
        HttpRequestDef.Builder<ShowFindingRequest, ShowFindingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFindingRequest.class, ShowFindingResponse.class)
                .withName("ShowFinding")
                .withUri("/v5/analyzers/{analyzer_id}/findings/{finding_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindingRequest::getAnalyzerId, ShowFindingRequest::setAnalyzerId));
        builder.<String>withRequestField("finding_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindingRequest::getFindingId, ShowFindingRequest::setFindingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFindingsRequest, UpdateFindingsResponse> updateFindings =
        genForUpdateFindings();

    private static HttpRequestDef<UpdateFindingsRequest, UpdateFindingsResponse> genForUpdateFindings() {
        // basic
        HttpRequestDef.Builder<UpdateFindingsRequest, UpdateFindingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFindingsRequest.class, UpdateFindingsResponse.class)
                .withName("UpdateFindings")
                .withUri("/v5/analyzers/{analyzer_id}/findings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFindingsRequest::getAnalyzerId, UpdateFindingsRequest::setAnalyzerId));
        builder.<UpdateFindingsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFindingsReqBody.class),
            f -> f.withMarshaller(UpdateFindingsRequest::getBody, UpdateFindingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotificationSettingRequest, CreateNotificationSettingResponse> createNotificationSetting =
        genForCreateNotificationSetting();

    private static HttpRequestDef<CreateNotificationSettingRequest, CreateNotificationSettingResponse> genForCreateNotificationSetting() {
        // basic
        HttpRequestDef.Builder<CreateNotificationSettingRequest, CreateNotificationSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateNotificationSettingRequest.class,
                    CreateNotificationSettingResponse.class)
                .withName("CreateNotificationSetting")
                .withUri("/v5/notification-settings")
                .withContentType("application/json");

        // requests
        builder.<CreateNotificationSettingReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotificationSettingReqBody.class),
            f -> f.withMarshaller(CreateNotificationSettingRequest::getBody,
                CreateNotificationSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotificationSettingRequest, DeleteNotificationSettingResponse> deleteNotificationSetting =
        genForDeleteNotificationSetting();

    private static HttpRequestDef<DeleteNotificationSettingRequest, DeleteNotificationSettingResponse> genForDeleteNotificationSetting() {
        // basic
        HttpRequestDef.Builder<DeleteNotificationSettingRequest, DeleteNotificationSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteNotificationSettingRequest.class,
                    DeleteNotificationSettingResponse.class)
                .withName("DeleteNotificationSetting")
                .withUri("/v5/notification-settings/{notification_setting_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("notification_setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotificationSettingRequest::getNotificationSettingId,
                DeleteNotificationSettingRequest::setNotificationSettingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationSettingsRequest, ListNotificationSettingsResponse> listNotificationSettings =
        genForListNotificationSettings();

    private static HttpRequestDef<ListNotificationSettingsRequest, ListNotificationSettingsResponse> genForListNotificationSettings() {
        // basic
        HttpRequestDef.Builder<ListNotificationSettingsRequest, ListNotificationSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListNotificationSettingsRequest.class, ListNotificationSettingsResponse.class)
                .withName("ListNotificationSettings")
                .withUri("/v5/notification-settings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationSettingsRequest::getLimit,
                ListNotificationSettingsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationSettingsRequest::getMarker,
                ListNotificationSettingsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotificationSettingRequest, ShowNotificationSettingResponse> showNotificationSetting =
        genForShowNotificationSetting();

    private static HttpRequestDef<ShowNotificationSettingRequest, ShowNotificationSettingResponse> genForShowNotificationSetting() {
        // basic
        HttpRequestDef.Builder<ShowNotificationSettingRequest, ShowNotificationSettingResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNotificationSettingRequest.class, ShowNotificationSettingResponse.class)
            .withName("ShowNotificationSetting")
            .withUri("/v5/notification-settings/{notification_setting_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("notification_setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotificationSettingRequest::getNotificationSettingId,
                ShowNotificationSettingRequest::setNotificationSettingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotificationSettingRequest, UpdateNotificationSettingResponse> updateNotificationSetting =
        genForUpdateNotificationSetting();

    private static HttpRequestDef<UpdateNotificationSettingRequest, UpdateNotificationSettingResponse> genForUpdateNotificationSetting() {
        // basic
        HttpRequestDef.Builder<UpdateNotificationSettingRequest, UpdateNotificationSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateNotificationSettingRequest.class,
                    UpdateNotificationSettingResponse.class)
                .withName("UpdateNotificationSetting")
                .withUri("/v5/notification-settings/{notification_setting_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("notification_setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotificationSettingRequest::getNotificationSettingId,
                UpdateNotificationSettingRequest::setNotificationSettingId));
        builder.<UpdateNotificationSettingReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotificationSettingReqBody.class),
            f -> f.withMarshaller(UpdateNotificationSettingRequest::getBody,
                UpdateNotificationSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessPreviewRequest, CreateAccessPreviewResponse> createAccessPreview =
        genForCreateAccessPreview();

    private static HttpRequestDef<CreateAccessPreviewRequest, CreateAccessPreviewResponse> genForCreateAccessPreview() {
        // basic
        HttpRequestDef.Builder<CreateAccessPreviewRequest, CreateAccessPreviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessPreviewRequest.class, CreateAccessPreviewResponse.class)
                .withName("CreateAccessPreview")
                .withUri("/v5/analyzers/{analyzer_id}/access-previews")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessPreviewRequest::getAnalyzerId,
                CreateAccessPreviewRequest::setAnalyzerId));
        builder.<CreateAccessPreviewReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessPreviewReqBody.class),
            f -> f.withMarshaller(CreateAccessPreviewRequest::getBody, CreateAccessPreviewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPreviewFindingsRequest, ListAccessPreviewFindingsResponse> listAccessPreviewFindings =
        genForListAccessPreviewFindings();

    private static HttpRequestDef<ListAccessPreviewFindingsRequest, ListAccessPreviewFindingsResponse> genForListAccessPreviewFindings() {
        // basic
        HttpRequestDef.Builder<ListAccessPreviewFindingsRequest, ListAccessPreviewFindingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListAccessPreviewFindingsRequest.class,
                    ListAccessPreviewFindingsResponse.class)
                .withName("ListAccessPreviewFindings")
                .withUri("/v5/analyzers/{analyzer_id}/access-previews/{access_preview_id}/findings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessPreviewFindingsRequest::getAnalyzerId,
                ListAccessPreviewFindingsRequest::setAnalyzerId));
        builder.<String>withRequestField("access_preview_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessPreviewFindingsRequest::getAccessPreviewId,
                ListAccessPreviewFindingsRequest::setAccessPreviewId));
        builder.<ListPreviewFindingsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListPreviewFindingsReqBody.class),
            f -> f.withMarshaller(ListAccessPreviewFindingsRequest::getBody,
                ListAccessPreviewFindingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPreviewsRequest, ListAccessPreviewsResponse> listAccessPreviews =
        genForListAccessPreviews();

    private static HttpRequestDef<ListAccessPreviewsRequest, ListAccessPreviewsResponse> genForListAccessPreviews() {
        // basic
        HttpRequestDef.Builder<ListAccessPreviewsRequest, ListAccessPreviewsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccessPreviewsRequest.class, ListAccessPreviewsResponse.class)
                .withName("ListAccessPreviews")
                .withUri("/v5/analyzers/{analyzer_id}/access-previews")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessPreviewsRequest::getAnalyzerId, ListAccessPreviewsRequest::setAnalyzerId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPreviewsRequest::getLimit, ListAccessPreviewsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessPreviewsRequest::getMarker, ListAccessPreviewsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessPreviewRequest, ShowAccessPreviewResponse> showAccessPreview =
        genForShowAccessPreview();

    private static HttpRequestDef<ShowAccessPreviewRequest, ShowAccessPreviewResponse> genForShowAccessPreview() {
        // basic
        HttpRequestDef.Builder<ShowAccessPreviewRequest, ShowAccessPreviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessPreviewRequest.class, ShowAccessPreviewResponse.class)
                .withName("ShowAccessPreview")
                .withUri("/v5/analyzers/{analyzer_id}/access-previews/{access_preview_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("analyzer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessPreviewRequest::getAnalyzerId, ShowAccessPreviewRequest::setAnalyzerId));
        builder.<String>withRequestField("access_preview_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessPreviewRequest::getAccessPreviewId,
                ShowAccessPreviewRequest::setAccessPreviewId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagResourceRequest, TagResourceResponse> tagResource = genForTagResource();

    private static HttpRequestDef<TagResourceRequest, TagResourceResponse> genForTagResource() {
        // basic
        HttpRequestDef.Builder<TagResourceRequest, TagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagResourceRequest.class, TagResourceResponse.class)
                .withName("TagResource")
                .withUri("/v5/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<TagResourceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(TagResourceRequest::getResourceType, TagResourceRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagResourceRequest::getResourceId, TagResourceRequest::setResourceId));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(TagResourceRequest::getBody, TagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UntagResourceRequest, UntagResourceResponse> untagResource =
        genForUntagResource();

    private static HttpRequestDef<UntagResourceRequest, UntagResourceResponse> genForUntagResource() {
        // basic
        HttpRequestDef.Builder<UntagResourceRequest, UntagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UntagResourceRequest.class, UntagResourceResponse.class)
                .withName("UntagResource")
                .withUri("/v5/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<UntagResourceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagResourceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(UntagResourceRequest::getResourceType, UntagResourceRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UntagResourceRequest::getResourceId, UntagResourceRequest::setResourceId));
        builder.<UntagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagResourceReqBody.class),
            f -> f.withMarshaller(UntagResourceRequest::getBody, UntagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckNoNewAccessRequest, CheckNoNewAccessResponse> checkNoNewAccess =
        genForCheckNoNewAccess();

    private static HttpRequestDef<CheckNoNewAccessRequest, CheckNoNewAccessResponse> genForCheckNoNewAccess() {
        // basic
        HttpRequestDef.Builder<CheckNoNewAccessRequest, CheckNoNewAccessResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckNoNewAccessRequest.class, CheckNoNewAccessResponse.class)
                .withName("CheckNoNewAccess")
                .withUri("/v5/policies/check-no-new-access")
                .withContentType("application/json");

        // requests
        builder.<CheckNoNewAccessReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckNoNewAccessReqBody.class),
            f -> f.withMarshaller(CheckNoNewAccessRequest::getBody, CheckNoNewAccessRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidatePolicyRequest, ValidatePolicyResponse> validatePolicy =
        genForValidatePolicy();

    private static HttpRequestDef<ValidatePolicyRequest, ValidatePolicyResponse> genForValidatePolicy() {
        // basic
        HttpRequestDef.Builder<ValidatePolicyRequest, ValidatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidatePolicyRequest.class, ValidatePolicyResponse.class)
                .withName("ValidatePolicy")
                .withUri("/v5/policies/validate")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ValidatePolicyRequest::getLimit, ValidatePolicyRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidatePolicyRequest::getMarker, ValidatePolicyRequest::setMarker));
        builder.<ValidatePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ValidatePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ValidatePolicyRequest::getXLanguage, ValidatePolicyRequest::setXLanguage));
        builder.<ValidatePolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidatePolicyReqBody.class),
            f -> f.withMarshaller(ValidatePolicyRequest::getBody, ValidatePolicyRequest::setBody));

        // response

        return builder.build();
    }

}
