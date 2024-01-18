package com.huaweicloud.sdk.res.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.res.v1.model.CreateResDatasourceRequest;
import com.huaweicloud.sdk.res.v1.model.CreateResDatasourceRequestBody;
import com.huaweicloud.sdk.res.v1.model.CreateResDatasourceResponse;
import com.huaweicloud.sdk.res.v1.model.CreateResIntelligentSceneRequest;
import com.huaweicloud.sdk.res.v1.model.CreateResIntelligentSceneRequestNBody;
import com.huaweicloud.sdk.res.v1.model.CreateResIntelligentSceneResponse;
import com.huaweicloud.sdk.res.v1.model.CreateResJobRequest;
import com.huaweicloud.sdk.res.v1.model.CreateResJobRequestBody;
import com.huaweicloud.sdk.res.v1.model.CreateResJobResponse;
import com.huaweicloud.sdk.res.v1.model.CreateResJobsRequest;
import com.huaweicloud.sdk.res.v1.model.CreateResJobsReququestBody;
import com.huaweicloud.sdk.res.v1.model.CreateResJobsResponse;
import com.huaweicloud.sdk.res.v1.model.CreateResOnlineInstanceRequest;
import com.huaweicloud.sdk.res.v1.model.CreateResOnlineInstanceRequestBody;
import com.huaweicloud.sdk.res.v1.model.CreateResOnlineInstanceResponse;
import com.huaweicloud.sdk.res.v1.model.CreateResSceneRequest;
import com.huaweicloud.sdk.res.v1.model.CreateResSceneRequestBody;
import com.huaweicloud.sdk.res.v1.model.CreateResSceneResponse;
import com.huaweicloud.sdk.res.v1.model.CreateResWorkspaceRequest;
import com.huaweicloud.sdk.res.v1.model.CreateResWorkspaceRequestBody;
import com.huaweicloud.sdk.res.v1.model.CreateResWorkspaceResponse;
import com.huaweicloud.sdk.res.v1.model.DeleteResDatasourceRequest;
import com.huaweicloud.sdk.res.v1.model.DeleteResDatasourceResponse;
import com.huaweicloud.sdk.res.v1.model.DeleteResJobRequest;
import com.huaweicloud.sdk.res.v1.model.DeleteResJobResponse;
import com.huaweicloud.sdk.res.v1.model.DeleteResOnlineInstanceRequest;
import com.huaweicloud.sdk.res.v1.model.DeleteResOnlineInstanceResponse;
import com.huaweicloud.sdk.res.v1.model.DeleteResSceneRequest;
import com.huaweicloud.sdk.res.v1.model.DeleteResSceneResponse;
import com.huaweicloud.sdk.res.v1.model.DeleteResWorkspaceRequest;
import com.huaweicloud.sdk.res.v1.model.DeleteResWorkspaceResponse;
import com.huaweicloud.sdk.res.v1.model.ListResDatasourcesRequest;
import com.huaweicloud.sdk.res.v1.model.ListResDatasourcesResponse;
import com.huaweicloud.sdk.res.v1.model.ListResEnterprisesRequest;
import com.huaweicloud.sdk.res.v1.model.ListResEnterprisesResponse;
import com.huaweicloud.sdk.res.v1.model.ListResOnlineServiceDetailsRequest;
import com.huaweicloud.sdk.res.v1.model.ListResOnlineServiceDetailsResponse;
import com.huaweicloud.sdk.res.v1.model.ListResResourceSpecRequest;
import com.huaweicloud.sdk.res.v1.model.ListResResourceSpecResponse;
import com.huaweicloud.sdk.res.v1.model.ListResScenesRequest;
import com.huaweicloud.sdk.res.v1.model.ListResScenesResponse;
import com.huaweicloud.sdk.res.v1.model.ListResWorkspacesRequest;
import com.huaweicloud.sdk.res.v1.model.ListResWorkspacesResponse;
import com.huaweicloud.sdk.res.v1.model.ShowResDatasourceRequest;
import com.huaweicloud.sdk.res.v1.model.ShowResDatasourceResponse;
import com.huaweicloud.sdk.res.v1.model.ShowResDatasourceWorkDetailRequest;
import com.huaweicloud.sdk.res.v1.model.ShowResDatasourceWorkDetailResponse;
import com.huaweicloud.sdk.res.v1.model.ShowResJobRequest;
import com.huaweicloud.sdk.res.v1.model.ShowResJobResponse;
import com.huaweicloud.sdk.res.v1.model.ShowResRecallSetRequest;
import com.huaweicloud.sdk.res.v1.model.ShowResRecallSetResponse;
import com.huaweicloud.sdk.res.v1.model.ShowResSceneRequest;
import com.huaweicloud.sdk.res.v1.model.ShowResSceneResponse;
import com.huaweicloud.sdk.res.v1.model.ShowResWrokspaceRequest;
import com.huaweicloud.sdk.res.v1.model.ShowResWrokspaceResponse;
import com.huaweicloud.sdk.res.v1.model.StartResJobRequest;
import com.huaweicloud.sdk.res.v1.model.StartResJobResponse;
import com.huaweicloud.sdk.res.v1.model.StartResSceneJobsRequest;
import com.huaweicloud.sdk.res.v1.model.StartResSceneJobsResponse;
import com.huaweicloud.sdk.res.v1.model.UpdateResDatasourceRequest;
import com.huaweicloud.sdk.res.v1.model.UpdateResDatasourceResponse;
import com.huaweicloud.sdk.res.v1.model.UpdateResDatastructRequest;
import com.huaweicloud.sdk.res.v1.model.UpdateResDatastructRequestBody;
import com.huaweicloud.sdk.res.v1.model.UpdateResDatastructRequestBodyBody;
import com.huaweicloud.sdk.res.v1.model.UpdateResDatastructResponse;
import com.huaweicloud.sdk.res.v1.model.UpdateResIntelligentSceneRequest;
import com.huaweicloud.sdk.res.v1.model.UpdateResIntelligentSceneRequestBody;
import com.huaweicloud.sdk.res.v1.model.UpdateResIntelligentSceneResponse;
import com.huaweicloud.sdk.res.v1.model.UpdateResJobRequest;
import com.huaweicloud.sdk.res.v1.model.UpdateResJobRequestBody;
import com.huaweicloud.sdk.res.v1.model.UpdateResJobResponse;
import com.huaweicloud.sdk.res.v1.model.UpdateResOnlineInstanceRequest;
import com.huaweicloud.sdk.res.v1.model.UpdateResOnlineInstanceRequestBody;
import com.huaweicloud.sdk.res.v1.model.UpdateResOnlineInstanceResponse;
import com.huaweicloud.sdk.res.v1.model.UpdateResSceneRequest;
import com.huaweicloud.sdk.res.v1.model.UpdateResSceneRequestBody;
import com.huaweicloud.sdk.res.v1.model.UpdateResSceneResponse;
import com.huaweicloud.sdk.res.v1.model.UpdateResWorkspaceRequest;
import com.huaweicloud.sdk.res.v1.model.UpdateResWorkspaceRequestBody;
import com.huaweicloud.sdk.res.v1.model.UpdateResWorkspaceResponse;

@SuppressWarnings("unchecked")
public class ResMeta {

    public static final HttpRequestDef<CreateResDatasourceRequest, CreateResDatasourceResponse> createResDatasource =
        genForCreateResDatasource();

    private static HttpRequestDef<CreateResDatasourceRequest, CreateResDatasourceResponse> genForCreateResDatasource() {
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
            f -> f.withMarshaller(CreateResDatasourceRequest::getWorkspaceId,
                CreateResDatasourceRequest::setWorkspaceId));
        builder.<CreateResDatasourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResDatasourceRequestBody.class),
            f -> f.withMarshaller(CreateResDatasourceRequest::getBody, CreateResDatasourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse> createResIntelligentScene =
        genForCreateResIntelligentScene();

    private static HttpRequestDef<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse> genForCreateResIntelligentScene() {
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
            f -> f.withMarshaller(CreateResIntelligentSceneRequest::getWorkspaceId,
                CreateResIntelligentSceneRequest::setWorkspaceId));
        builder.<CreateResIntelligentSceneRequestNBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResIntelligentSceneRequestNBody.class),
            f -> f.withMarshaller(CreateResIntelligentSceneRequest::getBody,
                CreateResIntelligentSceneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResJobRequest, CreateResJobResponse> createResJob = genForCreateResJob();

    private static HttpRequestDef<CreateResJobRequest, CreateResJobResponse> genForCreateResJob() {
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
            f -> f.withMarshaller(CreateResJobRequest::getResourceId, CreateResJobRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResJobRequest::getWorkspaceId, CreateResJobRequest::setWorkspaceId));
        builder.<CreateResJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResJobRequestBody.class),
            f -> f.withMarshaller(CreateResJobRequest::getBody, CreateResJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResJobsRequest, CreateResJobsResponse> createResJobs =
        genForCreateResJobs();

    private static HttpRequestDef<CreateResJobsRequest, CreateResJobsResponse> genForCreateResJobs() {
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
            f -> f.withMarshaller(CreateResJobsRequest::getResourceId, CreateResJobsRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResJobsRequest::getWorkspaceId, CreateResJobsRequest::setWorkspaceId));
        builder.<CreateResJobsReququestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResJobsReququestBody.class),
            f -> f.withMarshaller(CreateResJobsRequest::getBody, CreateResJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse> createResOnlineInstance =
        genForCreateResOnlineInstance();

    private static HttpRequestDef<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse> genForCreateResOnlineInstance() {
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
            f -> f.withMarshaller(CreateResOnlineInstanceRequest::getResourceId,
                CreateResOnlineInstanceRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResOnlineInstanceRequest::getWorkspaceId,
                CreateResOnlineInstanceRequest::setWorkspaceId));
        builder.<CreateResOnlineInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResOnlineInstanceRequestBody.class),
            f -> f.withMarshaller(CreateResOnlineInstanceRequest::getBody, CreateResOnlineInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResSceneRequest, CreateResSceneResponse> createResScene =
        genForCreateResScene();

    private static HttpRequestDef<CreateResSceneRequest, CreateResSceneResponse> genForCreateResScene() {
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
            f -> f.withMarshaller(CreateResSceneRequest::getWorkspaceId, CreateResSceneRequest::setWorkspaceId));
        builder.<CreateResSceneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResSceneRequestBody.class),
            f -> f.withMarshaller(CreateResSceneRequest::getBody, CreateResSceneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResWorkspaceRequest, CreateResWorkspaceResponse> createResWorkspace =
        genForCreateResWorkspace();

    private static HttpRequestDef<CreateResWorkspaceRequest, CreateResWorkspaceResponse> genForCreateResWorkspace() {
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
            f -> f.withMarshaller(CreateResWorkspaceRequest::getBody, CreateResWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResDatasourceRequest, DeleteResDatasourceResponse> deleteResDatasource =
        genForDeleteResDatasource();

    private static HttpRequestDef<DeleteResDatasourceRequest, DeleteResDatasourceResponse> genForDeleteResDatasource() {
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
            f -> f.withMarshaller(DeleteResDatasourceRequest::getWorkspaceId,
                DeleteResDatasourceRequest::setWorkspaceId));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResDatasourceRequest::getDatasourceId,
                DeleteResDatasourceRequest::setDatasourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResJobRequest, DeleteResJobResponse> deleteResJob = genForDeleteResJob();

    private static HttpRequestDef<DeleteResJobRequest, DeleteResJobResponse> genForDeleteResJob() {
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
            f -> f.withMarshaller(DeleteResJobRequest::getWorkspaceId, DeleteResJobRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResJobRequest::getResourceId, DeleteResJobRequest::setResourceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResJobRequest::getJobId, DeleteResJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse> deleteResOnlineInstance =
        genForDeleteResOnlineInstance();

    private static HttpRequestDef<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse> genForDeleteResOnlineInstance() {
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
            f -> f.withMarshaller(DeleteResOnlineInstanceRequest::getWorkspaceId,
                DeleteResOnlineInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResOnlineInstanceRequest::getResourceId,
                DeleteResOnlineInstanceRequest::setResourceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResOnlineInstanceRequest::getJobId, DeleteResOnlineInstanceRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResSceneRequest, DeleteResSceneResponse> deleteResScene =
        genForDeleteResScene();

    private static HttpRequestDef<DeleteResSceneRequest, DeleteResSceneResponse> genForDeleteResScene() {
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
            f -> f.withMarshaller(DeleteResSceneRequest::getWorkspaceId, DeleteResSceneRequest::setWorkspaceId));
        builder.<String>withRequestField("scene_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResSceneRequest::getSceneId, DeleteResSceneRequest::setSceneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse> deleteResWorkspace =
        genForDeleteResWorkspace();

    private static HttpRequestDef<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse> genForDeleteResWorkspace() {
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
            f -> f.withMarshaller(DeleteResWorkspaceRequest::getWorkspaceId,
                DeleteResWorkspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResDatasourcesRequest, ListResDatasourcesResponse> listResDatasources =
        genForListResDatasources();

    private static HttpRequestDef<ListResDatasourcesRequest, ListResDatasourcesResponse> genForListResDatasources() {
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
            f -> f.withMarshaller(ListResDatasourcesRequest::getWorkspaceId,
                ListResDatasourcesRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResEnterprisesRequest, ListResEnterprisesResponse> listResEnterprises =
        genForListResEnterprises();

    private static HttpRequestDef<ListResEnterprisesRequest, ListResEnterprisesResponse> genForListResEnterprises() {
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
        genForListResOnlineServiceDetails();

    private static HttpRequestDef<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse> genForListResOnlineServiceDetails() {
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
            f -> f.withMarshaller(ListResOnlineServiceDetailsRequest::getWorkspaceId,
                ListResOnlineServiceDetailsRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResOnlineServiceDetailsRequest::getResourceId,
                ListResOnlineServiceDetailsRequest::setResourceId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResOnlineServiceDetailsRequest::getCategory,
                ListResOnlineServiceDetailsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResResourceSpecRequest, ListResResourceSpecResponse> listResResourceSpec =
        genForListResResourceSpec();

    private static HttpRequestDef<ListResResourceSpecRequest, ListResResourceSpecResponse> genForListResResourceSpec() {
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
        genForListResScenes();

    private static HttpRequestDef<ListResScenesRequest, ListResScenesResponse> genForListResScenes() {
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
            f -> f.withMarshaller(ListResScenesRequest::getWorkspaceId, ListResScenesRequest::setWorkspaceId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResScenesRequest::getCategory, ListResScenesRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResWorkspacesRequest, ListResWorkspacesResponse> listResWorkspaces =
        genForListResWorkspaces();

    private static HttpRequestDef<ListResWorkspacesRequest, ListResWorkspacesResponse> genForListResWorkspaces() {
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
        genForShowResDatasource();

    private static HttpRequestDef<ShowResDatasourceRequest, ShowResDatasourceResponse> genForShowResDatasource() {
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
            f -> f.withMarshaller(ShowResDatasourceRequest::getWorkspaceId, ShowResDatasourceRequest::setWorkspaceId));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResDatasourceRequest::getDatasourceId,
                ShowResDatasourceRequest::setDatasourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse> showResDatasourceWorkDetail =
        genForShowResDatasourceWorkDetail();

    private static HttpRequestDef<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse> genForShowResDatasourceWorkDetail() {
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
            f -> f.withMarshaller(ShowResDatasourceWorkDetailRequest::getWorkspaceId,
                ShowResDatasourceWorkDetailRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResDatasourceWorkDetailRequest::getResourceId,
                ShowResDatasourceWorkDetailRequest::setResourceId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResDatasourceWorkDetailRequest::getType,
                ShowResDatasourceWorkDetailRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResJobRequest, ShowResJobResponse> showResJob = genForShowResJob();

    private static HttpRequestDef<ShowResJobRequest, ShowResJobResponse> genForShowResJob() {
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
            f -> f.withMarshaller(ShowResJobRequest::getWorkspaceId, ShowResJobRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResJobRequest::getResourceId, ShowResJobRequest::setResourceId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResJobRequest::getCategory, ShowResJobRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResRecallSetRequest, ShowResRecallSetResponse> showResRecallSet =
        genForShowResRecallSet();

    private static HttpRequestDef<ShowResRecallSetRequest, ShowResRecallSetResponse> genForShowResRecallSet() {
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
            f -> f.withMarshaller(ShowResRecallSetRequest::getWorkspaceId, ShowResRecallSetRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResRecallSetRequest::getResourceId, ShowResRecallSetRequest::setResourceId));
        builder.<String>withRequestField("use_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResRecallSetRequest::getUseType, ShowResRecallSetRequest::setUseType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResSceneRequest, ShowResSceneResponse> showResScene = genForShowResScene();

    private static HttpRequestDef<ShowResSceneRequest, ShowResSceneResponse> genForShowResScene() {
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
            f -> f.withMarshaller(ShowResSceneRequest::getWorkspaceId, ShowResSceneRequest::setWorkspaceId));
        builder.<String>withRequestField("scene_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResSceneRequest::getSceneId, ShowResSceneRequest::setSceneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResWrokspaceRequest, ShowResWrokspaceResponse> showResWrokspace =
        genForShowResWrokspace();

    private static HttpRequestDef<ShowResWrokspaceRequest, ShowResWrokspaceResponse> genForShowResWrokspace() {
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
            f -> f.withMarshaller(ShowResWrokspaceRequest::getWorkspaceId, ShowResWrokspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartResJobRequest, StartResJobResponse> startResJob = genForStartResJob();

    private static HttpRequestDef<StartResJobRequest, StartResJobResponse> genForStartResJob() {
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
            f -> f.withMarshaller(StartResJobRequest::getWorkspaceId, StartResJobRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResJobRequest::getResourceId, StartResJobRequest::setResourceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResJobRequest::getJobId, StartResJobRequest::setJobId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResJobRequest::getAction, StartResJobRequest::setAction));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartResSceneJobsRequest, StartResSceneJobsResponse> startResSceneJobs =
        genForStartResSceneJobs();

    private static HttpRequestDef<StartResSceneJobsRequest, StartResSceneJobsResponse> genForStartResSceneJobs() {
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
            f -> f.withMarshaller(StartResSceneJobsRequest::getWorkspaceId, StartResSceneJobsRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResSceneJobsRequest::getResourceId, StartResSceneJobsRequest::setResourceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResSceneJobsRequest::getAction, StartResSceneJobsRequest::setAction));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResDatasourceRequest, UpdateResDatasourceResponse> updateResDatasource =
        genForUpdateResDatasource();

    private static HttpRequestDef<UpdateResDatasourceRequest, UpdateResDatasourceResponse> genForUpdateResDatasource() {
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
            f -> f.withMarshaller(UpdateResDatasourceRequest::getDatasourceId,
                UpdateResDatasourceRequest::setDatasourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResDatasourceRequest::getWorkspaceId,
                UpdateResDatasourceRequest::setWorkspaceId));
        builder.<UpdateResDatastructRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResDatastructRequestBody.class),
            f -> f.withMarshaller(UpdateResDatasourceRequest::getBody, UpdateResDatasourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResDatastructRequest, UpdateResDatastructResponse> updateResDatastruct =
        genForUpdateResDatastruct();

    private static HttpRequestDef<UpdateResDatastructRequest, UpdateResDatastructResponse> genForUpdateResDatastruct() {
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
            f -> f.withMarshaller(UpdateResDatastructRequest::getDatasourceId,
                UpdateResDatastructRequest::setDatasourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResDatastructRequest::getWorkspaceId,
                UpdateResDatastructRequest::setWorkspaceId));
        builder.<UpdateResDatastructRequestBodyBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResDatastructRequestBodyBody.class),
            f -> f.withMarshaller(UpdateResDatastructRequest::getBody, UpdateResDatastructRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse> updateResIntelligentScene =
        genForUpdateResIntelligentScene();

    private static HttpRequestDef<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse> genForUpdateResIntelligentScene() {
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
            f -> f.withMarshaller(UpdateResIntelligentSceneRequest::getSceneId,
                UpdateResIntelligentSceneRequest::setSceneId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResIntelligentSceneRequest::getWorkspaceId,
                UpdateResIntelligentSceneRequest::setWorkspaceId));
        builder.<UpdateResIntelligentSceneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResIntelligentSceneRequestBody.class),
            f -> f.withMarshaller(UpdateResIntelligentSceneRequest::getBody,
                UpdateResIntelligentSceneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResJobRequest, UpdateResJobResponse> updateResJob = genForUpdateResJob();

    private static HttpRequestDef<UpdateResJobRequest, UpdateResJobResponse> genForUpdateResJob() {
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
            f -> f.withMarshaller(UpdateResJobRequest::getJobId, UpdateResJobRequest::setJobId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResJobRequest::getResourceId, UpdateResJobRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResJobRequest::getWorkspaceId, UpdateResJobRequest::setWorkspaceId));
        builder.<UpdateResJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResJobRequestBody.class),
            f -> f.withMarshaller(UpdateResJobRequest::getBody, UpdateResJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse> updateResOnlineInstance =
        genForUpdateResOnlineInstance();

    private static HttpRequestDef<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse> genForUpdateResOnlineInstance() {
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
            f -> f.withMarshaller(UpdateResOnlineInstanceRequest::getJobId, UpdateResOnlineInstanceRequest::setJobId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResOnlineInstanceRequest::getResourceId,
                UpdateResOnlineInstanceRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResOnlineInstanceRequest::getWorkspaceId,
                UpdateResOnlineInstanceRequest::setWorkspaceId));
        builder.<UpdateResOnlineInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResOnlineInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateResOnlineInstanceRequest::getBody, UpdateResOnlineInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResSceneRequest, UpdateResSceneResponse> updateResScene =
        genForUpdateResScene();

    private static HttpRequestDef<UpdateResSceneRequest, UpdateResSceneResponse> genForUpdateResScene() {
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
            f -> f.withMarshaller(UpdateResSceneRequest::getSceneId, UpdateResSceneRequest::setSceneId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResSceneRequest::getWorkspaceId, UpdateResSceneRequest::setWorkspaceId));
        builder.<UpdateResSceneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResSceneRequestBody.class),
            f -> f.withMarshaller(UpdateResSceneRequest::getBody, UpdateResSceneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse> updateResWorkspace =
        genForUpdateResWorkspace();

    private static HttpRequestDef<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse> genForUpdateResWorkspace() {
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
            f -> f.withMarshaller(UpdateResWorkspaceRequest::getWorkspaceId,
                UpdateResWorkspaceRequest::setWorkspaceId));
        builder.<UpdateResWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateResWorkspaceRequestBody.class),
            f -> f.withMarshaller(UpdateResWorkspaceRequest::getBody, UpdateResWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

}
