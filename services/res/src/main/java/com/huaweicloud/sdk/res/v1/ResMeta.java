package com.huaweicloud.sdk.res.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.res.v1.model.*;

@SuppressWarnings("unchecked")
public class ResMeta {

    public static final HttpRequestDef<CreateResDatasourceRequest, CreateResDatasourceResponse> createResDatasource =
        genForcreateResDatasource();

    private static HttpRequestDef<CreateResDatasourceRequest, CreateResDatasourceResponse> genForcreateResDatasource() {
        // basic
        HttpRequestDef.Builder<CreateResDatasourceRequest, CreateResDatasourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResDatasourceRequest.class, CreateResDatasourceResponse.class)
                .withName("CreateResDatasource")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/data-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResDatasourceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateResDatasourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResDatasourceRequestBody.class),
            f -> f.withMarshaller(CreateResDatasourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse> createResIntelligentScene =
        genForcreateResIntelligentScene();

    private static HttpRequestDef<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse> genForcreateResIntelligentScene() {
        // basic
        HttpRequestDef.Builder<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateResIntelligentSceneRequest.class,
                    CreateResIntelligentSceneResponse.class)
                .withName("CreateResIntelligentScene")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/intelligent-scenes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResIntelligentSceneRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateResIntelligentSceneRequestNBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResIntelligentSceneRequestNBody.class),
            f -> f.withMarshaller(CreateResIntelligentSceneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResJobRequest, CreateResJobResponse> createResJob = genForcreateResJob();

    private static HttpRequestDef<CreateResJobRequest, CreateResJobResponse> genForcreateResJob() {
        // basic
        HttpRequestDef.Builder<CreateResJobRequest, CreateResJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResJobRequest.class, CreateResJobResponse.class)
                .withName("CreateResJob")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/job-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResJobRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResJobRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateResJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResJobRequestBody.class),
            f -> f.withMarshaller(CreateResJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResJobsRequest, CreateResJobsResponse> createResJobs =
        genForcreateResJobs();

    private static HttpRequestDef<CreateResJobsRequest, CreateResJobsResponse> genForcreateResJobs() {
        // basic
        HttpRequestDef.Builder<CreateResJobsRequest, CreateResJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResJobsRequest.class, CreateResJobsResponse.class)
                .withName("CreateResJobs")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/job-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResJobsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResJobsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateResJobsReququestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResJobsReququestBody.class),
            f -> f.withMarshaller(CreateResJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse> createResOnlineInstance =
        genForcreateResOnlineInstance();

    private static HttpRequestDef<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse> genForcreateResOnlineInstance() {
        // basic
        HttpRequestDef.Builder<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateResOnlineInstanceRequest.class, CreateResOnlineInstanceResponse.class)
            .withName("CreateResOnlineInstance")
            .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/service-instance")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResOnlineInstanceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResOnlineInstanceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateResOnlineInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResOnlineInstanceRequestBody.class),
            f -> f.withMarshaller(CreateResOnlineInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResSceneRequest, CreateResSceneResponse> createResScene =
        genForcreateResScene();

    private static HttpRequestDef<CreateResSceneRequest, CreateResSceneResponse> genForcreateResScene() {
        // basic
        HttpRequestDef.Builder<CreateResSceneRequest, CreateResSceneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResSceneRequest.class, CreateResSceneResponse.class)
                .withName("CreateResScene")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/scenes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResSceneRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateResSceneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResSceneRequestBody.class),
            f -> f.withMarshaller(CreateResSceneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResWorkspaceRequest, CreateResWorkspaceResponse> createResWorkspace =
        genForcreateResWorkspace();

    private static HttpRequestDef<CreateResWorkspaceRequest, CreateResWorkspaceResponse> genForcreateResWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateResWorkspaceRequest, CreateResWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResWorkspaceRequest.class, CreateResWorkspaceResponse.class)
                .withName("CreateResWorkspace")
                .withUri("/v2.0/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<CreateResWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResWorkspaceRequestBody.class),
            f -> f.withMarshaller(CreateResWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResDatasourceRequest, DeleteResDatasourceResponse> deleteResDatasource =
        genFordeleteResDatasource();

    private static HttpRequestDef<DeleteResDatasourceRequest, DeleteResDatasourceResponse> genFordeleteResDatasource() {
        // basic
        HttpRequestDef.Builder<DeleteResDatasourceRequest, DeleteResDatasourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteResDatasourceRequest.class, DeleteResDatasourceResponse.class)
            .withName("DeleteResDatasource")
            .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/data-sources/{datasource_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResDatasourceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResDatasourceRequest::getDatasourceId, (req, v) -> {
                req.setDatasourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResJobRequest, DeleteResJobResponse> deleteResJob = genFordeleteResJob();

    private static HttpRequestDef<DeleteResJobRequest, DeleteResJobResponse> genFordeleteResJob() {
        // basic
        HttpRequestDef.Builder<DeleteResJobRequest, DeleteResJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResJobRequest.class, DeleteResJobResponse.class)
                .withName("DeleteResJob")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/job-instance/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResJobRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResJobRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse> deleteResOnlineInstance =
        genFordeleteResOnlineInstance();

    private static HttpRequestDef<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse> genFordeleteResOnlineInstance() {
        // basic
        HttpRequestDef.Builder<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteResOnlineInstanceRequest.class, DeleteResOnlineInstanceResponse.class)
            .withName("DeleteResOnlineInstance")
            .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/service-instance/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResOnlineInstanceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResOnlineInstanceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResOnlineInstanceRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResSceneRequest, DeleteResSceneResponse> deleteResScene =
        genFordeleteResScene();

    private static HttpRequestDef<DeleteResSceneRequest, DeleteResSceneResponse> genFordeleteResScene() {
        // basic
        HttpRequestDef.Builder<DeleteResSceneRequest, DeleteResSceneResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResSceneRequest.class, DeleteResSceneResponse.class)
                .withName("DeleteResScene")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/scenes/{scene_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResSceneRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("scene_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResSceneRequest::getSceneId, (req, v) -> {
                req.setSceneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse> deleteResWorkspace =
        genFordeleteResWorkspace();

    private static HttpRequestDef<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse> genFordeleteResWorkspace() {
        // basic
        HttpRequestDef.Builder<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResWorkspaceRequest.class, DeleteResWorkspaceResponse.class)
                .withName("DeleteResWorkspace")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResWorkspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResDatasourcesRequest, ListResDatasourcesResponse> listResDatasources =
        genForlistResDatasources();

    private static HttpRequestDef<ListResDatasourcesRequest, ListResDatasourcesResponse> genForlistResDatasources() {
        // basic
        HttpRequestDef.Builder<ListResDatasourcesRequest, ListResDatasourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResDatasourcesRequest.class, ListResDatasourcesResponse.class)
                .withName("ListResDatasources")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/data-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResDatasourcesRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResEnterprisesRequest, ListResEnterprisesResponse> listResEnterprises =
        genForlistResEnterprises();

    private static HttpRequestDef<ListResEnterprisesRequest, ListResEnterprisesResponse> genForlistResEnterprises() {
        // basic
        HttpRequestDef.Builder<ListResEnterprisesRequest, ListResEnterprisesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResEnterprisesRequest.class, ListResEnterprisesResponse.class)
                .withName("ListResEnterprises")
                .withUri("/v2.0/{project_id}/enterprise-projects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse> listResOnlineServiceDetails =
        genForlistResOnlineServiceDetails();

    private static HttpRequestDef<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse> genForlistResOnlineServiceDetails() {
        // basic
        HttpRequestDef.Builder<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListResOnlineServiceDetailsRequest.class,
                    ListResOnlineServiceDetailsResponse.class)
                .withName("ListResOnlineServiceDetails")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/service-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResOnlineServiceDetailsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResOnlineServiceDetailsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResOnlineServiceDetailsRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResResourceSpecRequest, ListResResourceSpecResponse> listResResourceSpec =
        genForlistResResourceSpec();

    private static HttpRequestDef<ListResResourceSpecRequest, ListResResourceSpecResponse> genForlistResResourceSpec() {
        // basic
        HttpRequestDef.Builder<ListResResourceSpecRequest, ListResResourceSpecResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResResourceSpecRequest.class, ListResResourceSpecResponse.class)
                .withName("ListResResourceSpec")
                .withUri("/v2.0/{project_id}/resource-specs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResScenesRequest, ListResScenesResponse> listResScenes =
        genForlistResScenes();

    private static HttpRequestDef<ListResScenesRequest, ListResScenesResponse> genForlistResScenes() {
        // basic
        HttpRequestDef.Builder<ListResScenesRequest, ListResScenesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResScenesRequest.class, ListResScenesResponse.class)
                .withName("ListResScenes")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/scenes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResScenesRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResScenesRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResWorkspacesRequest, ListResWorkspacesResponse> listResWorkspaces =
        genForlistResWorkspaces();

    private static HttpRequestDef<ListResWorkspacesRequest, ListResWorkspacesResponse> genForlistResWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListResWorkspacesRequest, ListResWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResWorkspacesRequest.class, ListResWorkspacesResponse.class)
                .withName("ListResWorkspaces")
                .withUri("/v2.0/{project_id}/workspaces")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResDatasourceRequest, ShowResDatasourceResponse> showResDatasource =
        genForshowResDatasource();

    private static HttpRequestDef<ShowResDatasourceRequest, ShowResDatasourceResponse> genForshowResDatasource() {
        // basic
        HttpRequestDef.Builder<ShowResDatasourceRequest, ShowResDatasourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResDatasourceRequest.class, ShowResDatasourceResponse.class)
                .withName("ShowResDatasource")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/data-sources/{datasource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResDatasourceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResDatasourceRequest::getDatasourceId, (req, v) -> {
                req.setDatasourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse> showResDatasourceWorkDetail =
        genForshowResDatasourceWorkDetail();

    private static HttpRequestDef<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse> genForshowResDatasourceWorkDetail() {
        // basic
        HttpRequestDef.Builder<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowResDatasourceWorkDetailRequest.class,
                    ShowResDatasourceWorkDetailResponse.class)
                .withName("ShowResDatasourceWorkDetail")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/data-sources/{resource_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResDatasourceWorkDetailRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResDatasourceWorkDetailRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResDatasourceWorkDetailRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResJobRequest, ShowResJobResponse> showResJob = genForshowResJob();

    private static HttpRequestDef<ShowResJobRequest, ShowResJobResponse> genForshowResJob() {
        // basic
        HttpRequestDef.Builder<ShowResJobRequest, ShowResJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResJobRequest.class, ShowResJobResponse.class)
                .withName("ShowResJob")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/job-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResJobRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResJobRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResJobRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResRecallSetRequest, ShowResRecallSetResponse> showResRecallSet =
        genForshowResRecallSet();

    private static HttpRequestDef<ShowResRecallSetRequest, ShowResRecallSetResponse> genForshowResRecallSet() {
        // basic
        HttpRequestDef.Builder<ShowResRecallSetRequest, ShowResRecallSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResRecallSetRequest.class, ShowResRecallSetResponse.class)
                .withName("ShowResRecallSet")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/result-set")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResRecallSetRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResRecallSetRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("use_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResRecallSetRequest::getUseType, (req, v) -> {
                req.setUseType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResSceneRequest, ShowResSceneResponse> showResScene = genForshowResScene();

    private static HttpRequestDef<ShowResSceneRequest, ShowResSceneResponse> genForshowResScene() {
        // basic
        HttpRequestDef.Builder<ShowResSceneRequest, ShowResSceneResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResSceneRequest.class, ShowResSceneResponse.class)
                .withName("ShowResScene")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/scenes/{scene_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResSceneRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("scene_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResSceneRequest::getSceneId, (req, v) -> {
                req.setSceneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResWrokspaceRequest, ShowResWrokspaceResponse> showResWrokspace =
        genForshowResWrokspace();

    private static HttpRequestDef<ShowResWrokspaceRequest, ShowResWrokspaceResponse> genForshowResWrokspace() {
        // basic
        HttpRequestDef.Builder<ShowResWrokspaceRequest, ShowResWrokspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResWrokspaceRequest.class, ShowResWrokspaceResponse.class)
                .withName("ShowResWrokspace")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResWrokspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartResJobRequest, StartResJobResponse> startResJob = genForstartResJob();

    private static HttpRequestDef<StartResJobRequest, StartResJobResponse> genForstartResJob() {
        // basic
        HttpRequestDef.Builder<StartResJobRequest, StartResJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartResJobRequest.class, StartResJobResponse.class)
                .withName("StartResJob")
                .withUri(
                    "/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/jobs/{job_id}/schedule-job")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResJobRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResJobRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResJobRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartResSceneJobsRequest, StartResSceneJobsResponse> startResSceneJobs =
        genForstartResSceneJobs();

    private static HttpRequestDef<StartResSceneJobsRequest, StartResSceneJobsResponse> genForstartResSceneJobs() {
        // basic
        HttpRequestDef.Builder<StartResSceneJobsRequest, StartResSceneJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartResSceneJobsRequest.class, StartResSceneJobsResponse.class)
                .withName("StartResSceneJobs")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/schedule-scene")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResSceneJobsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResSceneJobsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResSceneJobsRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResDatasourceRequest, UpdateResDatasourceResponse> updateResDatasource =
        genForupdateResDatasource();

    private static HttpRequestDef<UpdateResDatasourceRequest, UpdateResDatasourceResponse> genForupdateResDatasource() {
        // basic
        HttpRequestDef.Builder<UpdateResDatasourceRequest, UpdateResDatasourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResDatasourceRequest.class, UpdateResDatasourceResponse.class)
                .withName("UpdateResDatasource")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/data-sources/{datasource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResDatasourceRequest::getDatasourceId, (req, v) -> {
                req.setDatasourceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResDatasourceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateResDatastructRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResDatastructRequestBody.class),
            f -> f.withMarshaller(UpdateResDatasourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResDatastructRequest, UpdateResDatastructResponse> updateResDatastruct =
        genForupdateResDatastruct();

    private static HttpRequestDef<UpdateResDatastructRequest, UpdateResDatastructResponse> genForupdateResDatastruct() {
        // basic
        HttpRequestDef.Builder<UpdateResDatastructRequest, UpdateResDatastructResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResDatastructRequest.class, UpdateResDatastructResponse.class)
                .withName("UpdateResDatastruct")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/data-sources/{datasource_id}/data-struct")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResDatastructRequest::getDatasourceId, (req, v) -> {
                req.setDatasourceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResDatastructRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateResDatastructRequestBodyBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResDatastructRequestBodyBody.class),
            f -> f.withMarshaller(UpdateResDatastructRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse> updateResIntelligentScene =
        genForupdateResIntelligentScene();

    private static HttpRequestDef<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse> genForupdateResIntelligentScene() {
        // basic
        HttpRequestDef.Builder<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateResIntelligentSceneRequest.class,
                    UpdateResIntelligentSceneResponse.class)
                .withName("UpdateResIntelligentScene")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/intelligent-scenes/{scene_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scene_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResIntelligentSceneRequest::getSceneId, (req, v) -> {
                req.setSceneId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResIntelligentSceneRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateResIntelligentSceneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResIntelligentSceneRequestBody.class),
            f -> f.withMarshaller(UpdateResIntelligentSceneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResJobRequest, UpdateResJobResponse> updateResJob = genForupdateResJob();

    private static HttpRequestDef<UpdateResJobRequest, UpdateResJobResponse> genForupdateResJob() {
        // basic
        HttpRequestDef.Builder<UpdateResJobRequest, UpdateResJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResJobRequest.class, UpdateResJobResponse.class)
                .withName("UpdateResJob")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/job-instance/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResJobRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResJobRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateResJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResJobRequestBody.class),
            f -> f.withMarshaller(UpdateResJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse> updateResOnlineInstance =
        genForupdateResOnlineInstance();

    private static HttpRequestDef<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse> genForupdateResOnlineInstance() {
        // basic
        HttpRequestDef.Builder<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateResOnlineInstanceRequest.class, UpdateResOnlineInstanceResponse.class)
            .withName("UpdateResOnlineInstance")
            .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/resources/{resource_id}/service-instance/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResOnlineInstanceRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResOnlineInstanceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResOnlineInstanceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateResOnlineInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResOnlineInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateResOnlineInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResSceneRequest, UpdateResSceneResponse> updateResScene =
        genForupdateResScene();

    private static HttpRequestDef<UpdateResSceneRequest, UpdateResSceneResponse> genForupdateResScene() {
        // basic
        HttpRequestDef.Builder<UpdateResSceneRequest, UpdateResSceneResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResSceneRequest.class, UpdateResSceneResponse.class)
                .withName("UpdateResScene")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}/scenes/{scene_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scene_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResSceneRequest::getSceneId, (req, v) -> {
                req.setSceneId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResSceneRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateResSceneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResSceneRequestBody.class),
            f -> f.withMarshaller(UpdateResSceneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse> updateResWorkspace =
        genForupdateResWorkspace();

    private static HttpRequestDef<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse> genForupdateResWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResWorkspaceRequest.class, UpdateResWorkspaceResponse.class)
                .withName("UpdateResWorkspace")
                .withUri("/v2.0/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResWorkspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateResWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateResWorkspaceRequestBody.class),
            f -> f.withMarshaller(UpdateResWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
