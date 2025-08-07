package com.huaweicloud.sdk.eps.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eps.v1.model.CreateEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.CreateEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.DeleteEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.DeleteEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.DisableAction;
import com.huaweicloud.sdk.eps.v1.model.DisableEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.DisableEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.EnableAction;
import com.huaweicloud.sdk.eps.v1.model.EnableEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.EnableEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.EnterpriseProject;
import com.huaweicloud.sdk.eps.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.eps.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.eps.v1.model.ListEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ListEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.ListMigrationRecordRequest;
import com.huaweicloud.sdk.eps.v1.model.ListMigrationRecordResponse;
import com.huaweicloud.sdk.eps.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.eps.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.eps.v1.model.ListResourceMappingRequest;
import com.huaweicloud.sdk.eps.v1.model.ListResourceMappingResponse;
import com.huaweicloud.sdk.eps.v1.model.MigrateResource;
import com.huaweicloud.sdk.eps.v1.model.MigrateResourceRequest;
import com.huaweicloud.sdk.eps.v1.model.MigrateResourceResponse;
import com.huaweicloud.sdk.eps.v1.model.ResqEpResouce;
import com.huaweicloud.sdk.eps.v1.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowAssociatedResourcesRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowAssociatedResourcesResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectQuotaRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectQuotaResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowEpConfigsRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowEpConfigsResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowResourceBindEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowResourceBindEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.UpdateEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.UpdateEnterpriseProjectResponse;

@SuppressWarnings("unchecked")
public class EpsMeta {

    public static final HttpRequestDef<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> createEnterpriseProject =
        genForCreateEnterpriseProject();

    private static HttpRequestDef<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> genForCreateEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEnterpriseProjectRequest.class, CreateEnterpriseProjectResponse.class)
            .withName("CreateEnterpriseProject")
            .withUri("/v1.0/enterprise-projects")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<EnterpriseProject>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnterpriseProject.class),
            f -> f.withMarshaller(CreateEnterpriseProjectRequest::getBody, CreateEnterpriseProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnterpriseProjectRequest, DeleteEnterpriseProjectResponse> deleteEnterpriseProject =
        genForDeleteEnterpriseProject();

    private static HttpRequestDef<DeleteEnterpriseProjectRequest, DeleteEnterpriseProjectResponse> genForDeleteEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<DeleteEnterpriseProjectRequest, DeleteEnterpriseProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEnterpriseProjectRequest.class, DeleteEnterpriseProjectResponse.class)
            .withName("DeleteEnterpriseProject")
            .withUri("/v1.0/enterprise-projects/{enterprise_project_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnterpriseProjectRequest::getEnterpriseProjectId,
                DeleteEnterpriseProjectRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> disableEnterpriseProject =
        genForDisableEnterpriseProject();

    private static HttpRequestDef<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> genForDisableEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, DisableEnterpriseProjectRequest.class, DisableEnterpriseProjectResponse.class)
                .withName("DisableEnterpriseProject")
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableEnterpriseProjectRequest::getEnterpriseProjectId,
                DisableEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<DisableAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisableAction.class),
            f -> f.withMarshaller(DisableEnterpriseProjectRequest::getBody, DisableEnterpriseProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> enableEnterpriseProject =
        genForEnableEnterpriseProject();

    private static HttpRequestDef<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> genForEnableEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableEnterpriseProjectRequest.class, EnableEnterpriseProjectResponse.class)
            .withName("EnableEnterpriseProject")
            .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableEnterpriseProjectRequest::getEnterpriseProjectId,
                EnableEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<EnableAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnableAction.class),
            f -> f.withMarshaller(EnableEnterpriseProjectRequest::getBody, EnableEnterpriseProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
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

    public static final HttpRequestDef<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> listEnterpriseProject =
        genForListEnterpriseProject();

    private static HttpRequestDef<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> genForListEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEnterpriseProjectRequest.class, ListEnterpriseProjectResponse.class)
            .withName("ListEnterpriseProject")
            .withUri("/v1.0/enterprise-projects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getId, ListEnterpriseProjectRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getLimit, ListEnterpriseProjectRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getName, ListEnterpriseProjectRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getOffset, ListEnterpriseProjectRequest::setOffset));
        builder.<ListEnterpriseProjectRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEnterpriseProjectRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getSortDir, ListEnterpriseProjectRequest::setSortDir));
        builder.<ListEnterpriseProjectRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEnterpriseProjectRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getSortKey, ListEnterpriseProjectRequest::setSortKey));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseProjectRequest::getStatus, ListEnterpriseProjectRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMigrationRecordRequest, ListMigrationRecordResponse> listMigrationRecord =
        genForListMigrationRecord();

    private static HttpRequestDef<ListMigrationRecordRequest, ListMigrationRecordResponse> genForListMigrationRecord() {
        // basic
        HttpRequestDef.Builder<ListMigrationRecordRequest, ListMigrationRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMigrationRecordRequest.class, ListMigrationRecordResponse.class)
                .withName("ListMigrationRecord")
                .withUri("/v1.0/enterprise-projects/migrate-record/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMigrationRecordRequest::getStartTime, ListMigrationRecordRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMigrationRecordRequest::getEndTime, ListMigrationRecordRequest::setEndTime));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMigrationRecordRequest::getOffset, ListMigrationRecordRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationRecordRequest::getLimit, ListMigrationRecordRequest::setLimit));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMigrationRecordRequest::getResourceId,
                ListMigrationRecordRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProvidersRequest, ListProvidersResponse> listProviders =
        genForListProviders();

    private static HttpRequestDef<ListProvidersRequest, ListProvidersResponse> genForListProviders() {
        // basic
        HttpRequestDef.Builder<ListProvidersRequest, ListProvidersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProvidersRequest.class, ListProvidersResponse.class)
                .withName("ListProviders")
                .withUri("/v1.0/enterprise-projects/providers")
                .withContentType("application/json");

        // requests
        builder.<ListProvidersRequest.LocaleEnum>withRequestField("locale",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProvidersRequest.LocaleEnum.class),
            f -> f.withMarshaller(ListProvidersRequest::getLocale, ListProvidersRequest::setLocale));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvidersRequest::getLimit, ListProvidersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvidersRequest::getOffset, ListProvidersRequest::setOffset));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProvidersRequest::getProvider, ListProvidersRequest::setProvider));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceMappingRequest, ListResourceMappingResponse> listResourceMapping =
        genForListResourceMapping();

    private static HttpRequestDef<ListResourceMappingRequest, ListResourceMappingResponse> genForListResourceMapping() {
        // basic
        HttpRequestDef.Builder<ListResourceMappingRequest, ListResourceMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceMappingRequest.class, ListResourceMappingResponse.class)
                .withName("ListResourceMapping")
                .withUri("/v1.0/enterprise-projects/resources-mapping")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateResourceRequest, MigrateResourceResponse> migrateResource =
        genForMigrateResource();

    private static HttpRequestDef<MigrateResourceRequest, MigrateResourceResponse> genForMigrateResource() {
        // basic
        HttpRequestDef.Builder<MigrateResourceRequest, MigrateResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateResourceRequest.class, MigrateResourceResponse.class)
                .withName("MigrateResource")
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/resources-migrate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateResourceRequest::getEnterpriseProjectId,
                MigrateResourceRequest::setEnterpriseProjectId));
        builder.<MigrateResource>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateResource.class),
            f -> f.withMarshaller(MigrateResourceRequest::getBody, MigrateResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForShowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForShowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, ShowApiVersionRequest::setApiVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssociatedResourcesRequest, ShowAssociatedResourcesResponse> showAssociatedResources =
        genForShowAssociatedResources();

    private static HttpRequestDef<ShowAssociatedResourcesRequest, ShowAssociatedResourcesResponse> genForShowAssociatedResources() {
        // basic
        HttpRequestDef.Builder<ShowAssociatedResourcesRequest, ShowAssociatedResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAssociatedResourcesRequest.class, ShowAssociatedResourcesResponse.class)
            .withName("ShowAssociatedResources")
            .withUri("/v1.0/associated-resources/{resource_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedResourcesRequest::getResourceId,
                ShowAssociatedResourcesRequest::setResourceId));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedResourcesRequest::getProjectId,
                ShowAssociatedResourcesRequest::setProjectId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedResourcesRequest::getRegionId,
                ShowAssociatedResourcesRequest::setRegionId));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedResourcesRequest::getResourceType,
                ShowAssociatedResourcesRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProject =
        genForShowEnterpriseProject();

    private static HttpRequestDef<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> genForShowEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnterpriseProjectRequest.class, ShowEnterpriseProjectResponse.class)
            .withName("ShowEnterpriseProject")
            .withUri("/v1.0/enterprise-projects/{enterprise_project_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getEnterpriseProjectId,
                ShowEnterpriseProjectRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> showEnterpriseProjectQuota =
        genForShowEnterpriseProjectQuota();

    private static HttpRequestDef<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> genForShowEnterpriseProjectQuota() {
        // basic
        HttpRequestDef.Builder<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEnterpriseProjectQuotaRequest.class,
                    ShowEnterpriseProjectQuotaResponse.class)
                .withName("ShowEnterpriseProjectQuota")
                .withUri("/v1.0/enterprise-projects/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEpConfigsRequest, ShowEpConfigsResponse> showEpConfigs =
        genForShowEpConfigs();

    private static HttpRequestDef<ShowEpConfigsRequest, ShowEpConfigsResponse> genForShowEpConfigs() {
        // basic
        HttpRequestDef.Builder<ShowEpConfigsRequest, ShowEpConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEpConfigsRequest.class, ShowEpConfigsResponse.class)
                .withName("ShowEpConfigs")
                .withUri("/v1/enterprise-projects/configs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> showResourceBindEnterpriseProject =
        genForShowResourceBindEnterpriseProject();

    private static HttpRequestDef<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> genForShowResourceBindEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowResourceBindEnterpriseProjectRequest.class,
                    ShowResourceBindEnterpriseProjectResponse.class)
                .withName("ShowResourceBindEnterpriseProject")
                .withUri("/v1.0/enterprise-projects/{enterprise_project_id}/resources/filter")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceBindEnterpriseProjectRequest::getEnterpriseProjectId,
                ShowResourceBindEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<ResqEpResouce>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResqEpResouce.class),
            f -> f.withMarshaller(ShowResourceBindEnterpriseProjectRequest::getBody,
                ShowResourceBindEnterpriseProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> updateEnterpriseProject =
        genForUpdateEnterpriseProject();

    private static HttpRequestDef<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> genForUpdateEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEnterpriseProjectRequest.class, UpdateEnterpriseProjectResponse.class)
            .withName("UpdateEnterpriseProject")
            .withUri("/v1.0/enterprise-projects/{enterprise_project_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnterpriseProjectRequest::getEnterpriseProjectId,
                UpdateEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<EnterpriseProject>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnterpriseProject.class),
            f -> f.withMarshaller(UpdateEnterpriseProjectRequest::getBody, UpdateEnterpriseProjectRequest::setBody));

        // response

        return builder.build();
    }

}
