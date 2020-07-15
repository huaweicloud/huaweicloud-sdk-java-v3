package com.huaweicloud.sdk.eps.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eps.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class EpsMeta {

    public static final HttpRequestDef<CreateEPRequest, CreateEPResponse> createEP = genForcreateEP();

    private static HttpRequestDef<CreateEPRequest, CreateEPResponse> genForcreateEP() {
        // basic
        HttpRequestDef.Builder<CreateEPRequest, CreateEPResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEPRequest.class, CreateEPResponse.class)
                .withUri("/v1.0/enterprise-projects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnterpriseProject.class,
            f -> f.withMarshaller(CreateEPRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableEPRequest, DisableEPResponse> disableEP = genFordisableEP();

    private static HttpRequestDef<DisableEPRequest, DisableEPResponse> genFordisableEP() {
        // basic
        HttpRequestDef.Builder<DisableEPRequest, DisableEPResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableEPRequest.class, DisableEPResponse.class)
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisableEPRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DisableAction.class,
            f -> f.withMarshaller(DisableEPRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableEPRequest, EnableEPResponse> enableEP = genForenableEP();

    private static HttpRequestDef<EnableEPRequest, EnableEPResponse> genForenableEP() {
        // basic
        HttpRequestDef.Builder<EnableEPRequest, EnableEPResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableEPRequest.class, EnableEPResponse.class)
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(EnableEPRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnableAction.class,
            f -> f.withMarshaller(EnableEPRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions = genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withUri("/");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEPRequest, ListEPResponse> listEP = genForlistEP();

    private static HttpRequestDef<ListEPRequest, ListEPResponse> genForlistEP() {
        // basic
        HttpRequestDef.Builder<ListEPRequest, ListEPResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEPRequest.class, ListEPResponse.class)
                .withUri("/v1.0/enterprise-projects");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEPRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEPRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEPRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEPRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListEPRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListEPRequest.SortKeyEnum.class,
            f -> f.withMarshaller(ListEPRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListEPRequest.SortDirEnum.class,
            f -> f.withMarshaller(ListEPRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateResourceRequest, MigrateResourceResponse> migrateResource = genFormigrateResource();

    private static HttpRequestDef<MigrateResourceRequest, MigrateResourceResponse> genFormigrateResource() {
        // basic
        HttpRequestDef.Builder<MigrateResourceRequest, MigrateResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateResourceRequest.class, MigrateResourceResponse.class)
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/resources-migrate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MigrateResourceRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            MigrateResource.class,
            f -> f.withMarshaller(MigrateResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyEPRequest, ModifyEPResponse> modifyEP = genFormodifyEP();

    private static HttpRequestDef<ModifyEPRequest, ModifyEPResponse> genFormodifyEP() {
        // basic
        HttpRequestDef.Builder<ModifyEPRequest, ModifyEPResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyEPRequest.class, ModifyEPResponse.class)
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ModifyEPRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnterpriseProject.class,
            f -> f.withMarshaller(ModifyEPRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion = genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withUri("/{api_version}");

        // requests
        builder.withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEPRequest, ShowEPResponse> showEP = genForshowEP();

    private static HttpRequestDef<ShowEPRequest, ShowEPResponse> genForshowEP() {
        // basic
        HttpRequestDef.Builder<ShowEPRequest, ShowEPResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEPRequest.class, ShowEPResponse.class)
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowEPRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEPQuotaRequest, ShowEPQuotaResponse> showEPQuota = genForshowEPQuota();

    private static HttpRequestDef<ShowEPQuotaRequest, ShowEPQuotaResponse> genForshowEPQuota() {
        // basic
        HttpRequestDef.Builder<ShowEPQuotaRequest, ShowEPQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEPQuotaRequest.class, ShowEPQuotaResponse.class)
                .withUri("/v1.0/enterprise-projects/quotas");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceBindEPRequest, ShowResourceBindEPResponse> showResourceBindEP = genForshowResourceBindEP();

    private static HttpRequestDef<ShowResourceBindEPRequest, ShowResourceBindEPResponse> genForshowResourceBindEP() {
        // basic
        HttpRequestDef.Builder<ShowResourceBindEPRequest, ShowResourceBindEPResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowResourceBindEPRequest.class, ShowResourceBindEPResponse.class)
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/resources/filter")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowResourceBindEPRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResqEpResouce.class,
            f -> f.withMarshaller(ShowResourceBindEPRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
