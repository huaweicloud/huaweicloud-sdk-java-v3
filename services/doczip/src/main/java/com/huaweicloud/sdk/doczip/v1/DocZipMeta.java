package com.huaweicloud.sdk.doczip.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.doczip.v1.model.CreateAppReq;
import com.huaweicloud.sdk.doczip.v1.model.CreateApplicationRequest;
import com.huaweicloud.sdk.doczip.v1.model.CreateApplicationResponse;
import com.huaweicloud.sdk.doczip.v1.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.doczip.v1.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.doczip.v1.model.ListApplicationDetailsRequest;
import com.huaweicloud.sdk.doczip.v1.model.ListApplicationDetailsResponse;
import com.huaweicloud.sdk.doczip.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.doczip.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.doczip.v1.model.PublishApplicationRequest;
import com.huaweicloud.sdk.doczip.v1.model.PublishApplicationResponse;
import com.huaweicloud.sdk.doczip.v1.model.ReleaseAppReq;
import com.huaweicloud.sdk.doczip.v1.model.ShowAppResourceLimitRequest;
import com.huaweicloud.sdk.doczip.v1.model.ShowAppResourceLimitResponse;
import com.huaweicloud.sdk.doczip.v1.model.ShowAppSecretKeyRequest;
import com.huaweicloud.sdk.doczip.v1.model.ShowAppSecretKeyResponse;
import com.huaweicloud.sdk.doczip.v1.model.ShowBlocksRequest;
import com.huaweicloud.sdk.doczip.v1.model.ShowBlocksResponse;
import com.huaweicloud.sdk.doczip.v1.model.UpdateAppReq;
import com.huaweicloud.sdk.doczip.v1.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.doczip.v1.model.UpdateApplicationResponse;

@SuppressWarnings("unchecked")
public class DocZipMeta {

    public static final HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> createApplication =
        genForCreateApplication();

    private static HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> genForCreateApplication() {
        // basic
        HttpRequestDef.Builder<CreateApplicationRequest, CreateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApplicationRequest.class, CreateApplicationResponse.class)
                .withName("CreateApplication")
                .withUri("/v1/tenants/application")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationRequest::getTenantId, CreateApplicationRequest::setTenantId));
        builder.<CreateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppReq.class),
            f -> f.withMarshaller(CreateApplicationRequest::getBody, CreateApplicationRequest::setBody));

        // response

        builder.<String>withResponseField("X-Trace-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateApplicationResponse::getXTraceId, CreateApplicationResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genForDeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genForDeleteApplication() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationRequest, DeleteApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApplicationRequest.class, DeleteApplicationResponse.class)
                .withName("DeleteApplication")
                .withUri("/v1/tenants/application/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getApplicationId,
                DeleteApplicationRequest::setApplicationId));
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getTenantId, DeleteApplicationRequest::setTenantId));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteApplicationResponse::getXTraceId, DeleteApplicationResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationDetailsRequest, ListApplicationDetailsResponse> listApplicationDetails =
        genForListApplicationDetails();

    private static HttpRequestDef<ListApplicationDetailsRequest, ListApplicationDetailsResponse> genForListApplicationDetails() {
        // basic
        HttpRequestDef.Builder<ListApplicationDetailsRequest, ListApplicationDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApplicationDetailsRequest.class, ListApplicationDetailsResponse.class)
            .withName("ListApplicationDetails")
            .withUri("/v1/tenants/application/detail/{application_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationDetailsRequest::getApplicationId,
                ListApplicationDetailsRequest::setApplicationId));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationDetailsRequest::getQueryType,
                ListApplicationDetailsRequest::setQueryType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationDetailsRequest::getOffset, ListApplicationDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationDetailsRequest::getLimit, ListApplicationDetailsRequest::setLimit));
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationDetailsRequest::getTenantId,
                ListApplicationDetailsRequest::setTenantId));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApplicationDetailsResponse::getXTraceId,
                ListApplicationDetailsResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> listApplications =
        genForListApplications();

    private static HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> genForListApplications() {
        // basic
        HttpRequestDef.Builder<ListApplicationsRequest, ListApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplicationsRequest.class, ListApplicationsResponse.class)
                .withName("ListApplications")
                .withUri("/v1/tenants/application/list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getOffset, ListApplicationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getLimit, ListApplicationsRequest::setLimit));
        builder.<ListApplicationsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApplicationsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListApplicationsRequest::getStatus, ListApplicationsRequest::setStatus));
        builder.<String>withRequestField("application_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getApplicationName,
                ListApplicationsRequest::setApplicationName));
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getTenantId, ListApplicationsRequest::setTenantId));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApplicationsResponse::getXTraceId, ListApplicationsResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<PublishApplicationRequest, PublishApplicationResponse> publishApplication =
        genForPublishApplication();

    private static HttpRequestDef<PublishApplicationRequest, PublishApplicationResponse> genForPublishApplication() {
        // basic
        HttpRequestDef.Builder<PublishApplicationRequest, PublishApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishApplicationRequest.class, PublishApplicationResponse.class)
                .withName("PublishApplication")
                .withUri("/v1/tenants/application/{application_id}/release")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApplicationRequest::getApplicationId,
                PublishApplicationRequest::setApplicationId));
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApplicationRequest::getTenantId, PublishApplicationRequest::setTenantId));
        builder.<ReleaseAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReleaseAppReq.class),
            f -> f.withMarshaller(PublishApplicationRequest::getBody, PublishApplicationRequest::setBody));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PublishApplicationResponse::getXTraceId, PublishApplicationResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAppResourceLimitRequest, ShowAppResourceLimitResponse> showAppResourceLimit =
        genForShowAppResourceLimit();

    private static HttpRequestDef<ShowAppResourceLimitRequest, ShowAppResourceLimitResponse> genForShowAppResourceLimit() {
        // basic
        HttpRequestDef.Builder<ShowAppResourceLimitRequest, ShowAppResourceLimitResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAppResourceLimitRequest.class, ShowAppResourceLimitResponse.class)
            .withName("ShowAppResourceLimit")
            .withUri("/v1/tenants/resource/limit")
            .withContentType("application/json");

        // requests
        builder.<ShowAppResourceLimitRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAppResourceLimitRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowAppResourceLimitRequest::getType, ShowAppResourceLimitRequest::setType));
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppResourceLimitRequest::getTenantId, ShowAppResourceLimitRequest::setTenantId));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAppResourceLimitResponse::getXTraceId,
                ShowAppResourceLimitResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAppSecretKeyRequest, ShowAppSecretKeyResponse> showAppSecretKey =
        genForShowAppSecretKey();

    private static HttpRequestDef<ShowAppSecretKeyRequest, ShowAppSecretKeyResponse> genForShowAppSecretKey() {
        // basic
        HttpRequestDef.Builder<ShowAppSecretKeyRequest, ShowAppSecretKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppSecretKeyRequest.class, ShowAppSecretKeyResponse.class)
                .withName("ShowAppSecretKey")
                .withUri("/v1/tenants/application/secret-key/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppSecretKeyRequest::getApplicationId,
                ShowAppSecretKeyRequest::setApplicationId));
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppSecretKeyRequest::getTenantId, ShowAppSecretKeyRequest::setTenantId));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAppSecretKeyResponse::getXTraceId, ShowAppSecretKeyResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowBlocksRequest, ShowBlocksResponse> showBlocks = genForShowBlocks();

    private static HttpRequestDef<ShowBlocksRequest, ShowBlocksResponse> genForShowBlocks() {
        // basic
        HttpRequestDef.Builder<ShowBlocksRequest, ShowBlocksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBlocksRequest.class, ShowBlocksResponse.class)
                .withName("ShowBlocks")
                .withUri("/v1/tenants/application/block")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBlocksRequest::getTenantId, ShowBlocksRequest::setTenantId));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBlocksResponse::getXTraceId, ShowBlocksResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> updateApplication =
        genForUpdateApplication();

    private static HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> genForUpdateApplication() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationRequest, UpdateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApplicationRequest.class, UpdateApplicationResponse.class)
                .withName("UpdateApplication")
                .withUri("/v1/tenants/application/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getApplicationId,
                UpdateApplicationRequest::setApplicationId));
        builder.<String>withRequestField("tenant_id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getTenantId, UpdateApplicationRequest::setTenantId));
        builder.<UpdateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppReq.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getBody, UpdateApplicationRequest::setBody));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateApplicationResponse::getXTraceId, UpdateApplicationResponse::setXTraceId));
        return builder.build();
    }

}
