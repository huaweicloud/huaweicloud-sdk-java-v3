package com.huaweicloud.sdk.cdn.v2;

import com.huaweicloud.sdk.cdn.v2.model.AccountConfigModifyRequest;
import com.huaweicloud.sdk.cdn.v2.model.ApplyDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.ApplyDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.BatchUpdateRuleStatusRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchUpdateRuleStatusResponse;
import com.huaweicloud.sdk.cdn.v2.model.BatchUpdateRulesRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreatePreheatingTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreatePreheatingTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateRefreshTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateRefreshTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateRuleNewRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateRuleNewResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateRuleRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateShareCacheGroupsRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateShareCacheGroupsRequstBody;
import com.huaweicloud.sdk.cdn.v2.model.CreateShareCacheGroupsResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateTagsRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.CreateTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateTemplateRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteRuleNewRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteRuleNewResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteShareCacheGroupsRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteShareCacheGroupsResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteTagsRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.DisableDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.DisableDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.EnableDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.EnableDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.FullUpdateRulesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopRefersRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopRefersResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListRuleDetailsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListRuleDetailsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListShareCacheGroupsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListShareCacheGroupsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ModifyAccountInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ModifyAccountInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ModifyDomainConfigRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.PreheatingTaskRequest;
import com.huaweicloud.sdk.cdn.v2.model.RefreshTaskRequest;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesBody;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowAppliedTemplateRecordRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowAppliedTemplateRecordResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowCertificatesHttpsInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowCertificatesHttpsInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainDetailByNameRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainDetailByNameResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainLocationStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainLocationStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTaskDetailsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTaskDetailsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowIpInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowIpInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowLogsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowLogsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowQuotaRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowQuotaResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowUrlTaskInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowUrlTaskInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowVerifyDomainOwnerInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowVerifyDomainOwnerInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.TemplateApplyRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainMultiCertificatesRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainMultiCertificatesRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainMultiCertificatesResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateFullRuleRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateFullRuleResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdatePrivateBucketAccessBody;
import com.huaweicloud.sdk.cdn.v2.model.UpdatePrivateBucketAccessRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdatePrivateBucketAccessResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateRuleNewRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateRuleNewResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateRuleRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateShareCacheGroupsRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateShareCacheGroupsRequstBody;
import com.huaweicloud.sdk.cdn.v2.model.UpdateShareCacheGroupsResponse;
import com.huaweicloud.sdk.cdn.v2.model.VerifyDomainOwnerRequest;
import com.huaweicloud.sdk.cdn.v2.model.VerifyDomainOwnerRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.VerifyDomainOwnerResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CdnMeta {

    public static final HttpRequestDef<ApplyDomainTemplateRequest, ApplyDomainTemplateResponse> applyDomainTemplate =
        genForApplyDomainTemplate();

    private static HttpRequestDef<ApplyDomainTemplateRequest, ApplyDomainTemplateResponse> genForApplyDomainTemplate() {
        // basic
        HttpRequestDef.Builder<ApplyDomainTemplateRequest, ApplyDomainTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyDomainTemplateRequest.class, ApplyDomainTemplateResponse.class)
                .withName("ApplyDomainTemplate")
                .withUri("/v1.0/cdn/configuration/templates/{tml_id}/apply")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tml_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyDomainTemplateRequest::getTmlId, ApplyDomainTemplateRequest::setTmlId));
        builder.<TemplateApplyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TemplateApplyRequestBody.class),
            f -> f.withMarshaller(ApplyDomainTemplateRequest::getBody, ApplyDomainTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCopyDomainRequest, BatchCopyDomainResponse> batchCopyDomain =
        genForBatchCopyDomain();

    private static HttpRequestDef<BatchCopyDomainRequest, BatchCopyDomainResponse> genForBatchCopyDomain() {
        // basic
        HttpRequestDef.Builder<BatchCopyDomainRequest, BatchCopyDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCopyDomainRequest.class, BatchCopyDomainResponse.class)
                .withName("BatchCopyDomain")
                .withUri("/v1.0/cdn/configuration/domains/batch-copy")
                .withContentType("application/json");

        // requests
        builder.<BatchCopyDRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCopyDRequestBody.class),
            f -> f.withMarshaller(BatchCopyDomainRequest::getBody, BatchCopyDomainRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCopyDomainResponse::getXRequestId, BatchCopyDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForBatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForBatchDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagsRequest, BatchDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagsRequest.class, BatchDeleteTagsResponse.class)
                .withName("BatchDeleteTags")
                .withUri("/v1.0/cdn/configuration/tags/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, BatchDeleteTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteTagsResponse::getXRequestId, BatchDeleteTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateRuleStatusRequest, BatchUpdateRuleStatusResponse> batchUpdateRuleStatus =
        genForBatchUpdateRuleStatus();

    private static HttpRequestDef<BatchUpdateRuleStatusRequest, BatchUpdateRuleStatusResponse> genForBatchUpdateRuleStatus() {
        // basic
        HttpRequestDef.Builder<BatchUpdateRuleStatusRequest, BatchUpdateRuleStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateRuleStatusRequest.class, BatchUpdateRuleStatusResponse.class)
            .withName("BatchUpdateRuleStatus")
            .withUri("/v1.0/cdn/configuration/domains/{domain_name}/rules/batch-update")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateRuleStatusRequest::getDomainName,
                BatchUpdateRuleStatusRequest::setDomainName));
        builder.<BatchUpdateRulesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateRulesRequest.class),
            f -> f.withMarshaller(BatchUpdateRuleStatusRequest::getBody, BatchUpdateRuleStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForCreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForCreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v1.0/cdn/domains")
                .withContentType("application/json");

        // requests
        builder.<CreateDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDomainRequestBody.class),
            f -> f.withMarshaller(CreateDomainRequest::getBody, CreateDomainRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDomainResponse::getXRequestId, CreateDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainTemplateRequest, CreateDomainTemplateResponse> createDomainTemplate =
        genForCreateDomainTemplate();

    private static HttpRequestDef<CreateDomainTemplateRequest, CreateDomainTemplateResponse> genForCreateDomainTemplate() {
        // basic
        HttpRequestDef.Builder<CreateDomainTemplateRequest, CreateDomainTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDomainTemplateRequest.class, CreateDomainTemplateResponse.class)
            .withName("CreateDomainTemplate")
            .withUri("/v1.0/cdn/configuration/templates")
            .withContentType("application/json");

        // requests
        builder.<CreateTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateRequestBody.class),
            f -> f.withMarshaller(CreateDomainTemplateRequest::getBody, CreateDomainTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasks =
        genForCreatePreheatingTasks();

    private static HttpRequestDef<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> genForCreatePreheatingTasks() {
        // basic
        HttpRequestDef.Builder<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePreheatingTasksRequest.class, CreatePreheatingTasksResponse.class)
            .withName("CreatePreheatingTasks")
            .withUri("/v1.0/cdn/content/preheating-tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePreheatingTasksRequest::getEnterpriseProjectId,
                CreatePreheatingTasksRequest::setEnterpriseProjectId));
        builder.<PreheatingTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PreheatingTaskRequest.class),
            f -> f.withMarshaller(CreatePreheatingTasksRequest::getBody, CreatePreheatingTasksRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePreheatingTasksResponse::getXRequestId,
                CreatePreheatingTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasks =
        genForCreateRefreshTasks();

    private static HttpRequestDef<CreateRefreshTasksRequest, CreateRefreshTasksResponse> genForCreateRefreshTasks() {
        // basic
        HttpRequestDef.Builder<CreateRefreshTasksRequest, CreateRefreshTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRefreshTasksRequest.class, CreateRefreshTasksResponse.class)
                .withName("CreateRefreshTasks")
                .withUri("/v1.0/cdn/content/refresh-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRefreshTasksRequest::getEnterpriseProjectId,
                CreateRefreshTasksRequest::setEnterpriseProjectId));
        builder.<RefreshTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RefreshTaskRequest.class),
            f -> f.withMarshaller(CreateRefreshTasksRequest::getBody, CreateRefreshTasksRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRefreshTasksResponse::getXRequestId,
                CreateRefreshTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleNewRequest, CreateRuleNewResponse> createRuleNew =
        genForCreateRuleNew();

    private static HttpRequestDef<CreateRuleNewRequest, CreateRuleNewResponse> genForCreateRuleNew() {
        // basic
        HttpRequestDef.Builder<CreateRuleNewRequest, CreateRuleNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleNewRequest.class, CreateRuleNewResponse.class)
                .withName("CreateRuleNew")
                .withUri("/v1.0/cdn/configuration/domains/{domain_name}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRuleNewRequest::getDomainName, CreateRuleNewRequest::setDomainName));
        builder.<CreateRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRuleRequest.class),
            f -> f.withMarshaller(CreateRuleNewRequest::getBody, CreateRuleNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShareCacheGroupsRequest, CreateShareCacheGroupsResponse> createShareCacheGroups =
        genForCreateShareCacheGroups();

    private static HttpRequestDef<CreateShareCacheGroupsRequest, CreateShareCacheGroupsResponse> genForCreateShareCacheGroups() {
        // basic
        HttpRequestDef.Builder<CreateShareCacheGroupsRequest, CreateShareCacheGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateShareCacheGroupsRequest.class, CreateShareCacheGroupsResponse.class)
            .withName("CreateShareCacheGroups")
            .withUri("/v1.0/cdn/configuration/share-cache-groups")
            .withContentType("application/json");

        // requests
        builder.<CreateShareCacheGroupsRequstBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateShareCacheGroupsRequstBody.class),
            f -> f.withMarshaller(CreateShareCacheGroupsRequest::getBody, CreateShareCacheGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagsRequest, CreateTagsResponse> createTags = genForCreateTags();

    private static HttpRequestDef<CreateTagsRequest, CreateTagsResponse> genForCreateTags() {
        // basic
        HttpRequestDef.Builder<CreateTagsRequest, CreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagsRequest.class, CreateTagsResponse.class)
                .withName("CreateTags")
                .withUri("/v1.0/cdn/configuration/tags")
                .withContentType("application/json");

        // requests
        builder.<CreateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagsRequestBody.class),
            f -> f.withMarshaller(CreateTagsRequest::getBody, CreateTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTagsResponse::getXRequestId, CreateTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genForDeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genForDeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v1.0/cdn/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getDomainId, DeleteDomainRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getEnterpriseProjectId,
                DeleteDomainRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDomainResponse::getXRequestId, DeleteDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainTemplateRequest, DeleteDomainTemplateResponse> deleteDomainTemplate =
        genForDeleteDomainTemplate();

    private static HttpRequestDef<DeleteDomainTemplateRequest, DeleteDomainTemplateResponse> genForDeleteDomainTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteDomainTemplateRequest, DeleteDomainTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDomainTemplateRequest.class, DeleteDomainTemplateResponse.class)
            .withName("DeleteDomainTemplate")
            .withUri("/v1.0/cdn/configuration/templates/{tml_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tml_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainTemplateRequest::getTmlId, DeleteDomainTemplateRequest::setTmlId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleNewRequest, DeleteRuleNewResponse> deleteRuleNew =
        genForDeleteRuleNew();

    private static HttpRequestDef<DeleteRuleNewRequest, DeleteRuleNewResponse> genForDeleteRuleNew() {
        // basic
        HttpRequestDef.Builder<DeleteRuleNewRequest, DeleteRuleNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleNewRequest.class, DeleteRuleNewResponse.class)
                .withName("DeleteRuleNew")
                .withUri("/v1.0/cdn/configuration/domains/{domain_name}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleNewRequest::getDomainName, DeleteRuleNewRequest::setDomainName));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleNewRequest::getRuleId, DeleteRuleNewRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteShareCacheGroupsRequest, DeleteShareCacheGroupsResponse> deleteShareCacheGroups =
        genForDeleteShareCacheGroups();

    private static HttpRequestDef<DeleteShareCacheGroupsRequest, DeleteShareCacheGroupsResponse> genForDeleteShareCacheGroups() {
        // basic
        HttpRequestDef.Builder<DeleteShareCacheGroupsRequest, DeleteShareCacheGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteShareCacheGroupsRequest.class, DeleteShareCacheGroupsResponse.class)
            .withName("DeleteShareCacheGroups")
            .withUri("/v1.0/cdn/configuration/share-cache-groups/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteShareCacheGroupsRequest::getId, DeleteShareCacheGroupsRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableDomainRequest, DisableDomainResponse> disableDomain =
        genForDisableDomain();

    private static HttpRequestDef<DisableDomainRequest, DisableDomainResponse> genForDisableDomain() {
        // basic
        HttpRequestDef.Builder<DisableDomainRequest, DisableDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, DisableDomainRequest.class, DisableDomainResponse.class)
                .withName("DisableDomain")
                .withUri("/v1.0/cdn/domains/{domain_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDomainRequest::getDomainId, DisableDomainRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDomainRequest::getEnterpriseProjectId,
                DisableDomainRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisableDomainResponse::getXRequestId, DisableDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> downloadRegionCarrierExcel =
        genForDownloadRegionCarrierExcel();

    private static HttpRequestDef<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> genForDownloadRegionCarrierExcel() {
        // basic
        HttpRequestDef.Builder<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DownloadRegionCarrierExcelRequest.class,
                    DownloadRegionCarrierExcelResponse.class)
                .withName("DownloadRegionCarrierExcel")
                .withUri("/v1.0/cdn/statistics/region-carrier-excel")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getStartTime,
                DownloadRegionCarrierExcelRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getEndTime,
                DownloadRegionCarrierExcelRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getDomainName,
                DownloadRegionCarrierExcelRequest::setDomainName));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getInterval,
                DownloadRegionCarrierExcelRequest::setInterval));
        builder.<String>withRequestField("country",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getCountry,
                DownloadRegionCarrierExcelRequest::setCountry));
        builder.<String>withRequestField("excel_language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getExcelLanguage,
                DownloadRegionCarrierExcelRequest::setExcelLanguage));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getEnterpriseProjectId,
                DownloadRegionCarrierExcelRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("excel_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getExcelType,
                DownloadRegionCarrierExcelRequest::setExcelType));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getRegion,
                DownloadRegionCarrierExcelRequest::setRegion));
        builder.<String>withRequestField("carrier",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getCarrier,
                DownloadRegionCarrierExcelRequest::setCarrier));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> downloadStatisticsExcel =
        genForDownloadStatisticsExcel();

    private static HttpRequestDef<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> genForDownloadStatisticsExcel() {
        // basic
        HttpRequestDef.Builder<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadStatisticsExcelRequest.class, DownloadStatisticsExcelResponse.class)
            .withName("DownloadStatisticsExcel")
            .withUri("/v1.0/cdn/statistics/statistics-excel")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getStartTime,
                DownloadStatisticsExcelRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getEndTime,
                DownloadStatisticsExcelRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getDomainName,
                DownloadStatisticsExcelRequest::setDomainName));
        builder.<String>withRequestField("excel_language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getExcelLanguage,
                DownloadStatisticsExcelRequest::setExcelLanguage));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getServiceArea,
                DownloadStatisticsExcelRequest::setServiceArea));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getInterval,
                DownloadStatisticsExcelRequest::setInterval));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getEnterpriseProjectId,
                DownloadStatisticsExcelRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("excel_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getExcelType,
                DownloadStatisticsExcelRequest::setExcelType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDomainRequest, EnableDomainResponse> enableDomain = genForEnableDomain();

    private static HttpRequestDef<EnableDomainRequest, EnableDomainResponse> genForEnableDomain() {
        // basic
        HttpRequestDef.Builder<EnableDomainRequest, EnableDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, EnableDomainRequest.class, EnableDomainResponse.class)
                .withName("EnableDomain")
                .withUri("/v1.0/cdn/domains/{domain_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDomainRequest::getDomainId, EnableDomainRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDomainRequest::getEnterpriseProjectId,
                EnableDomainRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnableDomainResponse::getXRequestId, EnableDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListCdnDomainTopRefersRequest, ListCdnDomainTopRefersResponse> listCdnDomainTopRefers =
        genForListCdnDomainTopRefers();

    private static HttpRequestDef<ListCdnDomainTopRefersRequest, ListCdnDomainTopRefersResponse> genForListCdnDomainTopRefers() {
        // basic
        HttpRequestDef.Builder<ListCdnDomainTopRefersRequest, ListCdnDomainTopRefersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCdnDomainTopRefersRequest.class, ListCdnDomainTopRefersResponse.class)
            .withName("ListCdnDomainTopRefers")
            .withUri("/v1.0/cdn/statistics/top-refers")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCdnDomainTopRefersRequest::getStartTime,
                ListCdnDomainTopRefersRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCdnDomainTopRefersRequest::getEndTime,
                ListCdnDomainTopRefersRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCdnDomainTopRefersRequest::getDomainName,
                ListCdnDomainTopRefersRequest::setDomainName));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCdnDomainTopRefersRequest::getStatType,
                ListCdnDomainTopRefersRequest::setStatType));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCdnDomainTopRefersRequest::getServiceArea,
                ListCdnDomainTopRefersRequest::setServiceArea));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCdnDomainTopRefersRequest::getEnterpriseProjectId,
                ListCdnDomainTopRefersRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("include_ratio",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCdnDomainTopRefersRequest::getIncludeRatio,
                ListCdnDomainTopRefersRequest::setIncludeRatio));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForListDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForListDomains() {
        // basic
        HttpRequestDef.Builder<ListDomainsRequest, ListDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainsRequest.class, ListDomainsResponse.class)
                .withName("ListDomains")
                .withUri("/v1.0/cdn/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainName, ListDomainsRequest::setDomainName));
        builder.<String>withRequestField("business_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getBusinessType, ListDomainsRequest::setBusinessType));
        builder.<String>withRequestField("domain_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainStatus, ListDomainsRequest::setDomainStatus));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getServiceArea, ListDomainsRequest::setServiceArea));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getPageSize, ListDomainsRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getPageNumber, ListDomainsRequest::setPageNumber));
        builder.<Boolean>withRequestField("show_tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDomainsRequest::getShowTags, ListDomainsRequest::setShowTags));
        builder.<Boolean>withRequestField("exact_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDomainsRequest::getExactMatch, ListDomainsRequest::setExactMatch));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getEnterpriseProjectId,
                ListDomainsRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainsResponse::getXRequestId, ListDomainsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRuleDetailsRequest, ListRuleDetailsResponse> listRuleDetails =
        genForListRuleDetails();

    private static HttpRequestDef<ListRuleDetailsRequest, ListRuleDetailsResponse> genForListRuleDetails() {
        // basic
        HttpRequestDef.Builder<ListRuleDetailsRequest, ListRuleDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleDetailsRequest.class, ListRuleDetailsResponse.class)
                .withName("ListRuleDetails")
                .withUri("/v1.0/cdn/configuration/domains/{domain_name}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleDetailsRequest::getDomainName, ListRuleDetailsRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareCacheGroupsRequest, ListShareCacheGroupsResponse> listShareCacheGroups =
        genForListShareCacheGroups();

    private static HttpRequestDef<ListShareCacheGroupsRequest, ListShareCacheGroupsResponse> genForListShareCacheGroups() {
        // basic
        HttpRequestDef.Builder<ListShareCacheGroupsRequest, ListShareCacheGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListShareCacheGroupsRequest.class, ListShareCacheGroupsResponse.class)
            .withName("ListShareCacheGroups")
            .withUri("/v1.0/cdn/configuration/share-cache-groups")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareCacheGroupsRequest::getLimit, ListShareCacheGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareCacheGroupsRequest::getOffset, ListShareCacheGroupsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyAccountInfoRequest, ModifyAccountInfoResponse> modifyAccountInfo =
        genForModifyAccountInfo();

    private static HttpRequestDef<ModifyAccountInfoRequest, ModifyAccountInfoResponse> genForModifyAccountInfo() {
        // basic
        HttpRequestDef.Builder<ModifyAccountInfoRequest, ModifyAccountInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyAccountInfoRequest.class, ModifyAccountInfoResponse.class)
                .withName("ModifyAccountInfo")
                .withUri("/v1.0/cdn/configuration/account-configs")
                .withContentType("application/json");

        // requests
        builder.<AccountConfigModifyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AccountConfigModifyRequest.class),
            f -> f.withMarshaller(ModifyAccountInfoRequest::getBody, ModifyAccountInfoRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ModifyAccountInfoResponse::getXRequestId, ModifyAccountInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SetChargeModesRequest, SetChargeModesResponse> setChargeModes =
        genForSetChargeModes();

    private static HttpRequestDef<SetChargeModesRequest, SetChargeModesResponse> genForSetChargeModes() {
        // basic
        HttpRequestDef.Builder<SetChargeModesRequest, SetChargeModesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetChargeModesRequest.class, SetChargeModesResponse.class)
                .withName("SetChargeModes")
                .withUri("/v1.0/cdn/charge/charge-modes")
                .withContentType("application/json");

        // requests
        builder.<SetChargeModesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetChargeModesBody.class),
            f -> f.withMarshaller(SetChargeModesRequest::getBody, SetChargeModesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppliedTemplateRecordRequest, ShowAppliedTemplateRecordResponse> showAppliedTemplateRecord =
        genForShowAppliedTemplateRecord();

    private static HttpRequestDef<ShowAppliedTemplateRecordRequest, ShowAppliedTemplateRecordResponse> genForShowAppliedTemplateRecord() {
        // basic
        HttpRequestDef.Builder<ShowAppliedTemplateRecordRequest, ShowAppliedTemplateRecordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAppliedTemplateRecordRequest.class,
                    ShowAppliedTemplateRecordResponse.class)
                .withName("ShowAppliedTemplateRecord")
                .withUri("/v1.0/cdn/configuration/tml-apply-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tml_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppliedTemplateRecordRequest::getTmlId,
                ShowAppliedTemplateRecordRequest::setTmlId));
        builder.<String>withRequestField("tml_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppliedTemplateRecordRequest::getTmlName,
                ShowAppliedTemplateRecordRequest::setTmlName));
        builder.<String>withRequestField("operator_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppliedTemplateRecordRequest::getOperatorId,
                ShowAppliedTemplateRecordRequest::setOperatorId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppliedTemplateRecordRequest::getOffset,
                ShowAppliedTemplateRecordRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppliedTemplateRecordRequest::getLimit,
                ShowAppliedTemplateRecordRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> showBandwidthCalc =
        genForShowBandwidthCalc();

    private static HttpRequestDef<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> genForShowBandwidthCalc() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthCalcRequest.class, ShowBandwidthCalcResponse.class)
                .withName("ShowBandwidthCalc")
                .withUri("/v1.0/cdn/statistics/bandwidth-calc")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getStartTime, ShowBandwidthCalcRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getEndTime, ShowBandwidthCalcRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getDomainName, ShowBandwidthCalcRequest::setDomainName));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getServiceArea, ShowBandwidthCalcRequest::setServiceArea));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getEnterpriseProjectId,
                ShowBandwidthCalcRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("calc_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getCalcType, ShowBandwidthCalcRequest::setCalcType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfo =
        genForShowCertificatesHttpsInfo();

    private static HttpRequestDef<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> genForShowCertificatesHttpsInfo() {
        // basic
        HttpRequestDef.Builder<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCertificatesHttpsInfoRequest.class,
                    ShowCertificatesHttpsInfoResponse.class)
                .withName("ShowCertificatesHttpsInfo")
                .withUri("/v1.0/cdn/domains/https-certificate-info")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getPageSize,
                ShowCertificatesHttpsInfoRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getPageNumber,
                ShowCertificatesHttpsInfoRequest::setPageNumber));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getDomainName,
                ShowCertificatesHttpsInfoRequest::setDomainName));
        builder.<String>withRequestField("user_domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getUserDomainId,
                ShowCertificatesHttpsInfoRequest::setUserDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getEnterpriseProjectId,
                ShowCertificatesHttpsInfoRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCertificatesHttpsInfoResponse::getXRequestId,
                ShowCertificatesHttpsInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowChargeModesRequest, ShowChargeModesResponse> showChargeModes =
        genForShowChargeModes();

    private static HttpRequestDef<ShowChargeModesRequest, ShowChargeModesResponse> genForShowChargeModes() {
        // basic
        HttpRequestDef.Builder<ShowChargeModesRequest, ShowChargeModesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowChargeModesRequest.class, ShowChargeModesResponse.class)
                .withName("ShowChargeModes")
                .withUri("/v1.0/cdn/charge/charge-modes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChargeModesRequest::getProductType, ShowChargeModesRequest::setProductType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChargeModesRequest::getStatus, ShowChargeModesRequest::setStatus));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChargeModesRequest::getServiceArea, ShowChargeModesRequest::setServiceArea));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> showDomainDetailByName =
        genForShowDomainDetailByName();

    private static HttpRequestDef<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> genForShowDomainDetailByName() {
        // basic
        HttpRequestDef.Builder<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainDetailByNameRequest.class, ShowDomainDetailByNameResponse.class)
            .withName("ShowDomainDetailByName")
            .withUri("/v1.0/cdn/configuration/domains/{domain_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailByNameRequest::getDomainName,
                ShowDomainDetailByNameRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailByNameRequest::getEnterpriseProjectId,
                ShowDomainDetailByNameRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDomainDetailByNameResponse::getXRequestId,
                ShowDomainDetailByNameResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfig =
        genForShowDomainFullConfig();

    private static HttpRequestDef<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> genForShowDomainFullConfig() {
        // basic
        HttpRequestDef.Builder<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainFullConfigRequest.class, ShowDomainFullConfigResponse.class)
            .withName("ShowDomainFullConfig")
            .withUri("/v1.1/cdn/configuration/domains/{domain_name}/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainFullConfigRequest::getDomainName,
                ShowDomainFullConfigRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainFullConfigRequest::getEnterpriseProjectId,
                ShowDomainFullConfigRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("show_special_configs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainFullConfigRequest::getShowSpecialConfigs,
                ShowDomainFullConfigRequest::setShowSpecialConfigs));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDomainFullConfigResponse::getXRequestId,
                ShowDomainFullConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStats =
        genForShowDomainLocationStats();

    private static HttpRequestDef<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> genForShowDomainLocationStats() {
        // basic
        HttpRequestDef.Builder<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainLocationStatsRequest.class, ShowDomainLocationStatsResponse.class)
            .withName("ShowDomainLocationStats")
            .withUri("/v1.0/cdn/statistics/domain-location-stats")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getAction,
                ShowDomainLocationStatsRequest::setAction));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getStartTime,
                ShowDomainLocationStatsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getEndTime,
                ShowDomainLocationStatsRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getDomainName,
                ShowDomainLocationStatsRequest::setDomainName));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getStatType,
                ShowDomainLocationStatsRequest::setStatType));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getInterval,
                ShowDomainLocationStatsRequest::setInterval));
        builder.<String>withRequestField("country",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getCountry,
                ShowDomainLocationStatsRequest::setCountry));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getProvince,
                ShowDomainLocationStatsRequest::setProvince));
        builder.<String>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getIsp, ShowDomainLocationStatsRequest::setIsp));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getGroupBy,
                ShowDomainLocationStatsRequest::setGroupBy));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getEnterpriseProjectId,
                ShowDomainLocationStatsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStats =
        genForShowDomainStats();

    private static HttpRequestDef<ShowDomainStatsRequest, ShowDomainStatsResponse> genForShowDomainStats() {
        // basic
        HttpRequestDef.Builder<ShowDomainStatsRequest, ShowDomainStatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainStatsRequest.class, ShowDomainStatsResponse.class)
                .withName("ShowDomainStats")
                .withUri("/v1.0/cdn/statistics/domain-stats")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getAction, ShowDomainStatsRequest::setAction));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getStartTime, ShowDomainStatsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getEndTime, ShowDomainStatsRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getDomainName, ShowDomainStatsRequest::setDomainName));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getStatType, ShowDomainStatsRequest::setStatType));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getInterval, ShowDomainStatsRequest::setInterval));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getGroupBy, ShowDomainStatsRequest::setGroupBy));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getServiceArea, ShowDomainStatsRequest::setServiceArea));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getEnterpriseProjectId,
                ShowDomainStatsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainTemplateRequest, ShowDomainTemplateResponse> showDomainTemplate =
        genForShowDomainTemplate();

    private static HttpRequestDef<ShowDomainTemplateRequest, ShowDomainTemplateResponse> genForShowDomainTemplate() {
        // basic
        HttpRequestDef.Builder<ShowDomainTemplateRequest, ShowDomainTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainTemplateRequest.class, ShowDomainTemplateResponse.class)
                .withName("ShowDomainTemplate")
                .withUri("/v1.0/cdn/configuration/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tml_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainTemplateRequest::getTmlName, ShowDomainTemplateRequest::setTmlName));
        builder.<String>withRequestField("tml_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainTemplateRequest::getTmlId, ShowDomainTemplateRequest::setTmlId));
        builder.<Integer>withRequestField("tml_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDomainTemplateRequest::getTmlType, ShowDomainTemplateRequest::setTmlType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainTemplateRequest::getLimit, ShowDomainTemplateRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainTemplateRequest::getOffset, ShowDomainTemplateRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetails =
        genForShowHistoryTaskDetails();

    private static HttpRequestDef<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> genForShowHistoryTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHistoryTaskDetailsRequest.class, ShowHistoryTaskDetailsResponse.class)
            .withName("ShowHistoryTaskDetails")
            .withUri("/v1.0/cdn/historytasks/{history_tasks_id}/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("history_tasks_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getHistoryTasksId,
                ShowHistoryTaskDetailsRequest::setHistoryTasksId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getEnterpriseProjectId,
                ShowHistoryTaskDetailsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getPageSize,
                ShowHistoryTaskDetailsRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getPageNumber,
                ShowHistoryTaskDetailsRequest::setPageNumber));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getStatus, ShowHistoryTaskDetailsRequest::setStatus));
        builder.<String>withRequestField("url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getUrl, ShowHistoryTaskDetailsRequest::setUrl));
        builder.<Long>withRequestField("create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getCreateTime,
                ShowHistoryTaskDetailsRequest::setCreateTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHistoryTaskDetailsResponse::getXRequestId,
                ShowHistoryTaskDetailsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasks =
        genForShowHistoryTasks();

    private static HttpRequestDef<ShowHistoryTasksRequest, ShowHistoryTasksResponse> genForShowHistoryTasks() {
        // basic
        HttpRequestDef.Builder<ShowHistoryTasksRequest, ShowHistoryTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHistoryTasksRequest.class, ShowHistoryTasksResponse.class)
                .withName("ShowHistoryTasks")
                .withUri("/v1.0/cdn/historytasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getEnterpriseProjectId,
                ShowHistoryTasksRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getPageSize, ShowHistoryTasksRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getPageNumber, ShowHistoryTasksRequest::setPageNumber));
        builder.<ShowHistoryTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getStatus, ShowHistoryTasksRequest::setStatus));
        builder.<Long>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getStartDate, ShowHistoryTasksRequest::setStartDate));
        builder.<Long>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getEndDate, ShowHistoryTasksRequest::setEndDate));
        builder.<String>withRequestField("order_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getOrderField, ShowHistoryTasksRequest::setOrderField));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getOrderType, ShowHistoryTasksRequest::setOrderType));
        builder.<ShowHistoryTasksRequest.FileTypeEnum>withRequestField("file_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTasksRequest.FileTypeEnum.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getFileType, ShowHistoryTasksRequest::setFileType));
        builder.<ShowHistoryTasksRequest.TaskTypeEnum>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTasksRequest.TaskTypeEnum.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getTaskType, ShowHistoryTasksRequest::setTaskType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHistoryTasksResponse::getXRequestId, ShowHistoryTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfo = genForShowIpInfo();

    private static HttpRequestDef<ShowIpInfoRequest, ShowIpInfoResponse> genForShowIpInfo() {
        // basic
        HttpRequestDef.Builder<ShowIpInfoRequest, ShowIpInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpInfoRequest.class, ShowIpInfoResponse.class)
                .withName("ShowIpInfo")
                .withUri("/v1.0/cdn/ip-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpInfoRequest::getEnterpriseProjectId,
                ShowIpInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("ips",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpInfoRequest::getIps, ShowIpInfoRequest::setIps));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIpInfoResponse::getXRequestId, ShowIpInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLogsRequest, ShowLogsResponse> showLogs = genForShowLogs();

    private static HttpRequestDef<ShowLogsRequest, ShowLogsResponse> genForShowLogs() {
        // basic
        HttpRequestDef.Builder<ShowLogsRequest, ShowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLogsRequest.class, ShowLogsResponse.class)
                .withName("ShowLogs")
                .withUri("/v1.0/cdn/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogsRequest::getDomainName, ShowLogsRequest::setDomainName));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowLogsRequest::getStartTime, ShowLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowLogsRequest::getEndTime, ShowLogsRequest::setEndTime));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLogsRequest::getPageSize, ShowLogsRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLogsRequest::getPageNumber, ShowLogsRequest::setPageNumber));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogsRequest::getEnterpriseProjectId, ShowLogsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForShowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForShowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v1.0/cdn/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagsRequest, ShowTagsResponse> showTags = genForShowTags();

    private static HttpRequestDef<ShowTagsRequest, ShowTagsResponse> genForShowTags() {
        // basic
        HttpRequestDef.Builder<ShowTagsRequest, ShowTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagsRequest.class, ShowTagsResponse.class)
                .withName("ShowTags")
                .withUri("/v1.0/cdn/configuration/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagsRequest::getResourceId, ShowTagsRequest::setResourceId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTagsResponse::getXRequestId, ShowTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> showTopDomainNames =
        genForShowTopDomainNames();

    private static HttpRequestDef<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> genForShowTopDomainNames() {
        // basic
        HttpRequestDef.Builder<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopDomainNamesRequest.class, ShowTopDomainNamesResponse.class)
                .withName("ShowTopDomainNames")
                .withUri("/v1/cdn/statistics/top-domain-names")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getStartTime, ShowTopDomainNamesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getEndTime, ShowTopDomainNamesRequest::setEndTime));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getStatType, ShowTopDomainNamesRequest::setStatType));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getServiceArea,
                ShowTopDomainNamesRequest::setServiceArea));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getLimit, ShowTopDomainNamesRequest::setLimit));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getEnterpriseProjectId,
                ShowTopDomainNamesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrl = genForShowTopUrl();

    private static HttpRequestDef<ShowTopUrlRequest, ShowTopUrlResponse> genForShowTopUrl() {
        // basic
        HttpRequestDef.Builder<ShowTopUrlRequest, ShowTopUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopUrlRequest.class, ShowTopUrlResponse.class)
                .withName("ShowTopUrl")
                .withUri("/v1.0/cdn/statistics/top-url")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getStartTime, ShowTopUrlRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getEndTime, ShowTopUrlRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getDomainName, ShowTopUrlRequest::setDomainName));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getStatType, ShowTopUrlRequest::setStatType));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getServiceArea, ShowTopUrlRequest::setServiceArea));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getEnterpriseProjectId,
                ShowTopUrlRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> showUrlTaskInfo =
        genForShowUrlTaskInfo();

    private static HttpRequestDef<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> genForShowUrlTaskInfo() {
        // basic
        HttpRequestDef.Builder<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUrlTaskInfoRequest.class, ShowUrlTaskInfoResponse.class)
                .withName("ShowUrlTaskInfo")
                .withUri("/v1.0/cdn/contentgateway/url-tasks")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getStartTime, ShowUrlTaskInfoRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getEndTime, ShowUrlTaskInfoRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getOffset, ShowUrlTaskInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getLimit, ShowUrlTaskInfoRequest::setLimit));
        builder.<String>withRequestField("url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getUrl, ShowUrlTaskInfoRequest::setUrl));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getTaskType, ShowUrlTaskInfoRequest::setTaskType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getStatus, ShowUrlTaskInfoRequest::setStatus));
        builder.<String>withRequestField("file_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getFileType, ShowUrlTaskInfoRequest::setFileType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUrlTaskInfoResponse::getXRequestId, ShowUrlTaskInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVerifyDomainOwnerInfoRequest, ShowVerifyDomainOwnerInfoResponse> showVerifyDomainOwnerInfo =
        genForShowVerifyDomainOwnerInfo();

    private static HttpRequestDef<ShowVerifyDomainOwnerInfoRequest, ShowVerifyDomainOwnerInfoResponse> genForShowVerifyDomainOwnerInfo() {
        // basic
        HttpRequestDef.Builder<ShowVerifyDomainOwnerInfoRequest, ShowVerifyDomainOwnerInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowVerifyDomainOwnerInfoRequest.class,
                    ShowVerifyDomainOwnerInfoResponse.class)
                .withName("ShowVerifyDomainOwnerInfo")
                .withUri("/v1.0/cdn/configuration/domains/{domain_name}/domain-verifies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVerifyDomainOwnerInfoRequest::getDomainName,
                ShowVerifyDomainOwnerInfoRequest::setDomainName));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVerifyDomainOwnerInfoResponse::getXRequestId,
                ShowVerifyDomainOwnerInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfig =
        genForUpdateDomainFullConfig();

    private static HttpRequestDef<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> genForUpdateDomainFullConfig() {
        // basic
        HttpRequestDef.Builder<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainFullConfigRequest.class, UpdateDomainFullConfigResponse.class)
            .withName("UpdateDomainFullConfig")
            .withUri("/v1.1/cdn/configuration/domains/{domain_name}/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getDomainName,
                UpdateDomainFullConfigRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getEnterpriseProjectId,
                UpdateDomainFullConfigRequest::setEnterpriseProjectId));
        builder.<ModifyDomainConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyDomainConfigRequestBody.class),
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getBody, UpdateDomainFullConfigRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDomainFullConfigResponse::getXRequestId,
                UpdateDomainFullConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificates =
        genForUpdateDomainMultiCertificates();

    private static HttpRequestDef<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> genForUpdateDomainMultiCertificates() {
        // basic
        HttpRequestDef.Builder<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDomainMultiCertificatesRequest.class,
                    UpdateDomainMultiCertificatesResponse.class)
                .withName("UpdateDomainMultiCertificates")
                .withUri("/v1.0/cdn/domains/config-https-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainMultiCertificatesRequest::getEnterpriseProjectId,
                UpdateDomainMultiCertificatesRequest::setEnterpriseProjectId));
        builder.<UpdateDomainMultiCertificatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDomainMultiCertificatesRequestBody.class),
            f -> f.withMarshaller(UpdateDomainMultiCertificatesRequest::getBody,
                UpdateDomainMultiCertificatesRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDomainMultiCertificatesResponse::getXRequestId,
                UpdateDomainMultiCertificatesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainTemplateRequest, UpdateDomainTemplateResponse> updateDomainTemplate =
        genForUpdateDomainTemplate();

    private static HttpRequestDef<UpdateDomainTemplateRequest, UpdateDomainTemplateResponse> genForUpdateDomainTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateDomainTemplateRequest, UpdateDomainTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainTemplateRequest.class, UpdateDomainTemplateResponse.class)
            .withName("UpdateDomainTemplate")
            .withUri("/v1.0/cdn/configuration/templates/{tml_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tml_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainTemplateRequest::getTmlId, UpdateDomainTemplateRequest::setTmlId));
        builder.<CreateTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateDomainTemplateRequest::getBody, UpdateDomainTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFullRuleRequest, UpdateFullRuleResponse> updateFullRule =
        genForUpdateFullRule();

    private static HttpRequestDef<UpdateFullRuleRequest, UpdateFullRuleResponse> genForUpdateFullRule() {
        // basic
        HttpRequestDef.Builder<UpdateFullRuleRequest, UpdateFullRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFullRuleRequest.class, UpdateFullRuleResponse.class)
                .withName("UpdateFullRule")
                .withUri("/v1.0/cdn/configuration/domains/{domain_name}/rules/full-update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFullRuleRequest::getDomainName, UpdateFullRuleRequest::setDomainName));
        builder.<FullUpdateRulesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FullUpdateRulesRequest.class),
            f -> f.withMarshaller(UpdateFullRuleRequest::getBody, UpdateFullRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccess =
        genForUpdatePrivateBucketAccess();

    private static HttpRequestDef<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> genForUpdatePrivateBucketAccess() {
        // basic
        HttpRequestDef.Builder<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePrivateBucketAccessRequest.class,
                    UpdatePrivateBucketAccessResponse.class)
                .withName("UpdatePrivateBucketAccess")
                .withUri("/v1.0/cdn/domains/{domain_id}/private-bucket-access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateBucketAccessRequest::getDomainId,
                UpdatePrivateBucketAccessRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateBucketAccessRequest::getEnterpriseProjectId,
                UpdatePrivateBucketAccessRequest::setEnterpriseProjectId));
        builder.<UpdatePrivateBucketAccessBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePrivateBucketAccessBody.class),
            f -> f.withMarshaller(UpdatePrivateBucketAccessRequest::getBody,
                UpdatePrivateBucketAccessRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePrivateBucketAccessResponse::getXRequestId,
                UpdatePrivateBucketAccessResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleNewRequest, UpdateRuleNewResponse> updateRuleNew =
        genForUpdateRuleNew();

    private static HttpRequestDef<UpdateRuleNewRequest, UpdateRuleNewResponse> genForUpdateRuleNew() {
        // basic
        HttpRequestDef.Builder<UpdateRuleNewRequest, UpdateRuleNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleNewRequest.class, UpdateRuleNewResponse.class)
                .withName("UpdateRuleNew")
                .withUri("/v1.0/cdn/configuration/domains/{domain_name}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleNewRequest::getDomainName, UpdateRuleNewRequest::setDomainName));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleNewRequest::getRuleId, UpdateRuleNewRequest::setRuleId));
        builder.<UpdateRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleRequest.class),
            f -> f.withMarshaller(UpdateRuleNewRequest::getBody, UpdateRuleNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShareCacheGroupsRequest, UpdateShareCacheGroupsResponse> updateShareCacheGroups =
        genForUpdateShareCacheGroups();

    private static HttpRequestDef<UpdateShareCacheGroupsRequest, UpdateShareCacheGroupsResponse> genForUpdateShareCacheGroups() {
        // basic
        HttpRequestDef.Builder<UpdateShareCacheGroupsRequest, UpdateShareCacheGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateShareCacheGroupsRequest.class, UpdateShareCacheGroupsResponse.class)
            .withName("UpdateShareCacheGroups")
            .withUri("/v1.0/cdn/configuration/share-cache-groups/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateShareCacheGroupsRequest::getId, UpdateShareCacheGroupsRequest::setId));
        builder.<UpdateShareCacheGroupsRequstBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateShareCacheGroupsRequstBody.class),
            f -> f.withMarshaller(UpdateShareCacheGroupsRequest::getBody, UpdateShareCacheGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<VerifyDomainOwnerRequest, VerifyDomainOwnerResponse> verifyDomainOwner =
        genForVerifyDomainOwner();

    private static HttpRequestDef<VerifyDomainOwnerRequest, VerifyDomainOwnerResponse> genForVerifyDomainOwner() {
        // basic
        HttpRequestDef.Builder<VerifyDomainOwnerRequest, VerifyDomainOwnerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, VerifyDomainOwnerRequest.class, VerifyDomainOwnerResponse.class)
                .withName("VerifyDomainOwner")
                .withUri("/v1.0/cdn/configuration/domains/{domain_name}/verify-owner")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(VerifyDomainOwnerRequest::getDomainName, VerifyDomainOwnerRequest::setDomainName));
        builder.<VerifyDomainOwnerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(VerifyDomainOwnerRequestBody.class),
            f -> f.withMarshaller(VerifyDomainOwnerRequest::getBody, VerifyDomainOwnerRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(VerifyDomainOwnerResponse::getXRequestId, VerifyDomainOwnerResponse::setXRequestId));
        return builder.build();
    }

}
