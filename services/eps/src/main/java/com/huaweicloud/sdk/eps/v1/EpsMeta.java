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

    public static final HttpRequestDef<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> createEnterpriseProject = genForcreateEnterpriseProject();

    private static HttpRequestDef<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> genForcreateEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnterpriseProjectRequest.class, CreateEnterpriseProjectResponse.class)
                .withName("CreateEnterpriseProject")
                .withUri("/v1.0/enterprise-projects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnterpriseProject.class,
            f -> f.withMarshaller(CreateEnterpriseProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> disableEnterpriseProject = genFordisableEnterpriseProject();

    private static HttpRequestDef<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> genFordisableEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableEnterpriseProjectRequest.class, DisableEnterpriseProjectResponse.class)
                .withName("DisableEnterpriseProject")
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisableEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DisableAction.class,
            f -> f.withMarshaller(DisableEnterpriseProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> enableEnterpriseProject = genForenableEnterpriseProject();

    private static HttpRequestDef<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> genForenableEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableEnterpriseProjectRequest.class, EnableEnterpriseProjectResponse.class)
                .withName("EnableEnterpriseProject")
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(EnableEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnableAction.class,
            f -> f.withMarshaller(EnableEnterpriseProjectRequest::getBody, (req, v) -> {
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
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> listEnterpriseProject = genForlistEnterpriseProject();

    private static HttpRequestDef<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> genForlistEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnterpriseProjectRequest.class, ListEnterpriseProjectResponse.class)
                .withName("ListEnterpriseProject")
                .withUri("/v1.0/enterprise-projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListEnterpriseProjectRequest.SortDirEnum.class,
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );
        builder.withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListEnterpriseProjectRequest.SortKeyEnum.class,
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getStatus, (req, v) -> {
                req.setStatus(v);
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
                .withName("MigrateResource")
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

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion = genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProject = genForshowEnterpriseProject();

    private static HttpRequestDef<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> genForshowEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnterpriseProjectRequest.class, ShowEnterpriseProjectResponse.class)
                .withName("ShowEnterpriseProject")
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> showEnterpriseProjectQuota = genForshowEnterpriseProjectQuota();

    private static HttpRequestDef<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> genForshowEnterpriseProjectQuota() {
        // basic
        HttpRequestDef.Builder<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnterpriseProjectQuotaRequest.class, ShowEnterpriseProjectQuotaResponse.class)
                .withName("ShowEnterpriseProjectQuota")
                .withUri("/v1.0/enterprise-projects/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> showResourceBindEnterpriseProject = genForshowResourceBindEnterpriseProject();

    private static HttpRequestDef<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> genForshowResourceBindEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowResourceBindEnterpriseProjectRequest.class, ShowResourceBindEnterpriseProjectResponse.class)
                .withName("ShowResourceBindEnterpriseProject")
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/resources/filter")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowResourceBindEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResqEpResouce.class,
            f -> f.withMarshaller(ShowResourceBindEnterpriseProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> updateEnterpriseProject = genForupdateEnterpriseProject();

    private static HttpRequestDef<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> genForupdateEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnterpriseProjectRequest.class, UpdateEnterpriseProjectResponse.class)
                .withName("UpdateEnterpriseProject")
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnterpriseProject.class,
            f -> f.withMarshaller(UpdateEnterpriseProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
