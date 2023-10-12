package com.huaweicloud.sdk.codeartsdeploy.v2;

import com.huaweicloud.sdk.codeartsdeploy.v2.model.ConfigInfo;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeployTaskByTemplateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeployTaskByTemplateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeploymentGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeploymentGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeploymentHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostClusterRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostClusterRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostClusterResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeployTaskRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeployTaskResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeploymentGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeploymentGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeploymentHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostFromEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostFromEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentGroup;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentGroupUpdateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentHost;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.EnvExecutionBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.EnvironmentRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTaskHistoryByDateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTaskHistoryByDateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTasksRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTasksResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostClustersRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostClustersResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListNewHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListNewHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListTaskSuccessRateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListTaskSuccessRateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowAppDetailByIdRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowAppDetailByIdResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeployTaskDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeployTaskDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeploymentGroupDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeploymentGroupDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeploymentHostDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeploymentHostDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowEnvironmentDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowEnvironmentDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowExecutionParamsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowExecutionParamsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostClusterDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostClusterDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowProjectSuccessRateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowProjectSuccessRateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.StartDeployTaskRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.StartDeployTaskResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.TasksSuccessRateQuery;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.TemplateTaskRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentHostResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeArtsDeployMeta {

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v1/applications")
                .withContentType("application/json");

        // requests
        builder.<CreateAppRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppRequestBody.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplate =
        genForcreateDeployTaskByTemplate();

    private static HttpRequestDef<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> genForcreateDeployTaskByTemplate() {
        // basic
        HttpRequestDef.Builder<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDeployTaskByTemplateRequest.class,
                    CreateDeployTaskByTemplateResponse.class)
                .withName("CreateDeployTaskByTemplate")
                .withUri("/v2/tasks/template-task")
                .withContentType("application/json");

        // requests
        builder.<TemplateTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateTaskRequestBody.class),
            f -> f.withMarshaller(CreateDeployTaskByTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genFordeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genFordeleteApplication() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationRequest, DeleteApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApplicationRequest.class, DeleteApplicationResponse.class)
                .withName("DeleteApplication")
                .withUri("/v1/applications/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTask =
        genFordeleteDeployTask();

    private static HttpRequestDef<DeleteDeployTaskRequest, DeleteDeployTaskResponse> genFordeleteDeployTask() {
        // basic
        HttpRequestDef.Builder<DeleteDeployTaskRequest, DeleteDeployTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeployTaskRequest.class, DeleteDeployTaskResponse.class)
                .withName("DeleteDeployTask")
                .withUri("/v2/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeployTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllAppRequest, ListAllAppResponse> listAllApp = genForlistAllApp();

    private static HttpRequestDef<ListAllAppRequest, ListAllAppResponse> genForlistAllApp() {
        // basic
        HttpRequestDef.Builder<ListAllAppRequest, ListAllAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAllAppRequest.class, ListAllAppResponse.class)
                .withName("ListAllApp")
                .withUri("/v1/applications/list")
                .withContentType("application/json");

        // requests
        builder.<ListAllAppRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAllAppRequestBody.class),
            f -> f.withMarshaller(ListAllAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDate =
        genForlistDeployTaskHistoryByDate();

    private static HttpRequestDef<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> genForlistDeployTaskHistoryByDate() {
        // basic
        HttpRequestDef.Builder<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDeployTaskHistoryByDateRequest.class,
                    ListDeployTaskHistoryByDateResponse.class)
                .withName("ListDeployTaskHistoryByDate")
                .withUri("/v2/{project_id}/task/{id}/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasks =
        genForlistDeployTasks();

    private static HttpRequestDef<ListDeployTasksRequest, ListDeployTasksResponse> genForlistDeployTasks() {
        // basic
        HttpRequestDef.Builder<ListDeployTasksRequest, ListDeployTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeployTasksRequest.class, ListDeployTasksResponse.class)
                .withName("ListDeployTasks")
                .withUri("/v2/{project_id}/tasks/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeployTasksRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeployTasksRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeployTasksRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> showAppDetailById =
        genForshowAppDetailById();

    private static HttpRequestDef<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> genForshowAppDetailById() {
        // basic
        HttpRequestDef.Builder<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppDetailByIdRequest.class, ShowAppDetailByIdResponse.class)
                .withName("ShowAppDetailById")
                .withUri("/v1/applications/{app_id}/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppDetailByIdRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetail =
        genForshowDeployTaskDetail();

    private static HttpRequestDef<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> genForshowDeployTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDeployTaskDetailRequest.class, ShowDeployTaskDetailResponse.class)
            .withName("ShowDeployTaskDetail")
            .withUri("/v2/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeployTaskDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExecutionParamsRequest, ShowExecutionParamsResponse> showExecutionParams =
        genForshowExecutionParams();

    private static HttpRequestDef<ShowExecutionParamsRequest, ShowExecutionParamsResponse> genForshowExecutionParams() {
        // basic
        HttpRequestDef.Builder<ShowExecutionParamsRequest, ShowExecutionParamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowExecutionParamsRequest.class, ShowExecutionParamsResponse.class)
                .withName("ShowExecutionParams")
                .withUri("/v2/history/tasks/{task_id}/params")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionParamsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("record_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionParamsRequest::getRecordId, (req, v) -> {
                req.setRecordId(v);
            }));

        // response
        builder.<List<ConfigInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowExecutionParamsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ConfigInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTask =
        genForstartDeployTask();

    private static HttpRequestDef<StartDeployTaskRequest, StartDeployTaskResponse> genForstartDeployTask() {
        // basic
        HttpRequestDef.Builder<StartDeployTaskRequest, StartDeployTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartDeployTaskRequest.class, StartDeployTaskResponse.class)
                .withName("StartDeployTask")
                .withUri("/v2/tasks/{task_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartDeployTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<EnvExecutionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvExecutionBody.class),
            f -> f.withMarshaller(StartDeployTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironment =
        genForcreateEnvironment();

    private static HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> genForcreateEnvironment() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentRequest, CreateEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentRequest.class, CreateEnvironmentResponse.class)
                .withName("CreateEnvironment")
                .withUri("/v1/applications/{application_id}/environments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEnvironmentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<EnvironmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvironmentRequestBody.class),
            f -> f.withMarshaller(CreateEnvironmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironment =
        genFordeleteEnvironment();

    private static HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> genFordeleteEnvironment() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentRequest, DeleteEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvironmentRequest.class, DeleteEnvironmentResponse.class)
                .withName("DeleteEnvironment")
                .withUri("/v1/applications/{application_id}/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> deleteHostFromEnvironment =
        genFordeleteHostFromEnvironment();

    private static HttpRequestDef<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> genFordeleteHostFromEnvironment() {
        // basic
        HttpRequestDef.Builder<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteHostFromEnvironmentRequest.class,
                    DeleteHostFromEnvironmentResponse.class)
                .withName("DeleteHostFromEnvironment")
                .withUri("/v1/applications/{application_id}/environments/{environment_id}/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostFromEnvironmentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostFromEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostFromEnvironmentRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> importHostToEnvironment =
        genForimportHostToEnvironment();

    private static HttpRequestDef<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> genForimportHostToEnvironment() {
        // basic
        HttpRequestDef.Builder<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ImportHostToEnvironmentRequest.class, ImportHostToEnvironmentResponse.class)
            .withName("ImportHostToEnvironment")
            .withUri("/v1/applications/{application_id}/environments/{environment_id}/hosts/import")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportHostToEnvironmentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportHostToEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<ImportHostToEnvironmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportHostToEnvironmentRequestBody.class),
            f -> f.withMarshaller(ImportHostToEnvironmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironments =
        genForlistEnvironments();

    private static HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> genForlistEnvironments() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsRequest, ListEnvironmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsRequest.class, ListEnvironmentsResponse.class)
                .withName("ListEnvironments")
                .withUri("/v1/applications/{application_id}/environments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListEnvironmentsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEnvironmentsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListEnvironmentsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEnvironmentsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetail =
        genForshowEnvironmentDetail();

    private static HttpRequestDef<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> genForshowEnvironmentDetail() {
        // basic
        HttpRequestDef.Builder<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnvironmentDetailRequest.class, ShowEnvironmentDetailResponse.class)
            .withName("ShowEnvironmentDetail")
            .withUri("/v1/applications/{application_id}/environments/{environment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentDetailRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentDetailRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHost =
        genForcreateDeploymentHost();

    private static HttpRequestDef<CreateDeploymentHostRequest, CreateDeploymentHostResponse> genForcreateDeploymentHost() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentHostRequest, CreateDeploymentHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDeploymentHostRequest.class, CreateDeploymentHostResponse.class)
            .withName("CreateDeploymentHost")
            .withUri("/v2/host-groups/{group_id}/hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeploymentHostRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<DeploymentHost>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentHost.class),
            f -> f.withMarshaller(CreateDeploymentHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostRequest, CreateHostResponse> createHost = genForcreateHost();

    private static HttpRequestDef<CreateHostRequest, CreateHostResponse> genForcreateHost() {
        // basic
        HttpRequestDef.Builder<CreateHostRequest, CreateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHostRequest.class, CreateHostResponse.class)
                .withName("CreateHost")
                .withUri("/v1/resources/host-groups/{group_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHostRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<CreateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostRequestBody.class),
            f -> f.withMarshaller(CreateHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHost =
        genFordeleteDeploymentHost();

    private static HttpRequestDef<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> genFordeleteDeploymentHost() {
        // basic
        HttpRequestDef.Builder<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDeploymentHostRequest.class, DeleteDeploymentHostResponse.class)
            .withName("DeleteDeploymentHost")
            .withUri("/v2/host-groups/{group_id}/hosts/{host_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentHostRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostsRequest, ListHostsResponse> listHosts = genForlistHosts();

    private static HttpRequestDef<ListHostsRequest, ListHostsResponse> genForlistHosts() {
        // basic
        HttpRequestDef.Builder<ListHostsRequest, ListHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostsRequest.class, ListHostsResponse.class)
                .withName("ListHosts")
                .withUri("/v2/host-groups/{group_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Boolean>withRequestField("as_proxy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostsRequest::getAsProxy, (req, v) -> {
                req.setAsProxy(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListHostsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListHostsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Boolean>withRequestField("with_auth",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostsRequest::getWithAuth, (req, v) -> {
                req.setWithAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNewHostsRequest, ListNewHostsResponse> listNewHosts = genForlistNewHosts();

    private static HttpRequestDef<ListNewHostsRequest, ListNewHostsResponse> genForlistNewHosts() {
        // basic
        HttpRequestDef.Builder<ListNewHostsRequest, ListNewHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNewHostsRequest.class, ListNewHostsResponse.class)
                .withName("ListNewHosts")
                .withUri("/v1/resources/host-groups/{group_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewHostsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("key_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewHostsRequest::getKeyField, (req, v) -> {
                req.setKeyField(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewHostsRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNewHostsRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNewHostsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewHostsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListNewHostsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNewHostsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListNewHostsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Boolean>withRequestField("as_proxy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListNewHostsRequest::getAsProxy, (req, v) -> {
                req.setAsProxy(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetail =
        genForshowDeploymentHostDetail();

    private static HttpRequestDef<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> genForshowDeploymentHostDetail() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDeploymentHostDetailRequest.class, ShowDeploymentHostDetailResponse.class)
                .withName("ShowDeploymentHostDetail")
                .withUri("/v2/host-groups/{group_id}/hosts/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentHostDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentHostDetailRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostDetailRequest, ShowHostDetailResponse> showHostDetail =
        genForshowHostDetail();

    private static HttpRequestDef<ShowHostDetailRequest, ShowHostDetailResponse> genForshowHostDetail() {
        // basic
        HttpRequestDef.Builder<ShowHostDetailRequest, ShowHostDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHostDetailRequest.class, ShowHostDetailResponse.class)
                .withName("ShowHostDetail")
                .withUri("/v1/resources/host-groups/{group_id}/hosts/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostDetailRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHost =
        genForupdateDeploymentHost();

    private static HttpRequestDef<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> genForupdateDeploymentHost() {
        // basic
        HttpRequestDef.Builder<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDeploymentHostRequest.class, UpdateDeploymentHostResponse.class)
            .withName("UpdateDeploymentHost")
            .withUri("/v2/host-groups/{group_id}/hosts/{host_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<DeploymentHostRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentHostRequest.class),
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroup =
        genForcreateDeploymentGroup();

    private static HttpRequestDef<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> genForcreateDeploymentGroup() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDeploymentGroupRequest.class, CreateDeploymentGroupResponse.class)
            .withName("CreateDeploymentGroup")
            .withUri("/v2/host-groups")
            .withContentType("application/json");

        // requests
        builder.<DeploymentGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentGroup.class),
            f -> f.withMarshaller(CreateDeploymentGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostClusterRequest, CreateHostClusterResponse> createHostCluster =
        genForcreateHostCluster();

    private static HttpRequestDef<CreateHostClusterRequest, CreateHostClusterResponse> genForcreateHostCluster() {
        // basic
        HttpRequestDef.Builder<CreateHostClusterRequest, CreateHostClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHostClusterRequest.class, CreateHostClusterResponse.class)
                .withName("CreateHostCluster")
                .withUri("/v1/resources/host-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateHostClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostClusterRequestBody.class),
            f -> f.withMarshaller(CreateHostClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroup =
        genFordeleteDeploymentGroup();

    private static HttpRequestDef<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> genFordeleteDeploymentGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDeploymentGroupRequest.class, DeleteDeploymentGroupResponse.class)
            .withName("DeleteDeploymentGroup")
            .withUri("/v2/host-groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostClustersRequest, ListHostClustersResponse> listHostClusters =
        genForlistHostClusters();

    private static HttpRequestDef<ListHostClustersRequest, ListHostClustersResponse> genForlistHostClusters() {
        // basic
        HttpRequestDef.Builder<ListHostClustersRequest, ListHostClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostClustersRequest.class, ListHostClustersResponse.class)
                .withName("ListHostClusters")
                .withUri("/v1/resources/host-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostClustersRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostClustersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListHostClustersRequest.OsEnum>withRequestField("os",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostClustersRequest.OsEnum.class),
            f -> f.withMarshaller(ListHostClustersRequest::getOs, (req, v) -> {
                req.setOs(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostClustersRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostClustersRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostClustersRequest::getSortField, (req, v) -> {
                req.setSortField(v);
            }));
        builder.<ListHostClustersRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostClustersRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListHostClustersRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            }));
        builder.<Integer>withRequestField("is_proxy_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostClustersRequest::getIsProxyMode, (req, v) -> {
                req.setIsProxyMode(v);
            }));
        builder.<String>withRequestField("slave_cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostClustersRequest::getSlaveClusterId, (req, v) -> {
                req.setSlaveClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroups =
        genForlistHostGroups();

    private static HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> genForlistHostGroups() {
        // basic
        HttpRequestDef.Builder<ListHostGroupsRequest, ListHostGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostGroupsRequest.class, ListHostGroupsResponse.class)
                .withName("ListHostGroups")
                .withUri("/v2/host-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("region_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getRegionName, (req, v) -> {
                req.setRegionName(v);
            }));
        builder.<ListHostGroupsRequest.OsEnum>withRequestField("os",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostGroupsRequest.OsEnum.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getOs, (req, v) -> {
                req.setOs(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListHostGroupsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostGroupsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetail =
        genForshowDeploymentGroupDetail();

    private static HttpRequestDef<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> genForshowDeploymentGroupDetail() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDeploymentGroupDetailRequest.class,
                    ShowDeploymentGroupDetailResponse.class)
                .withName("ShowDeploymentGroupDetail")
                .withUri("/v2/host-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentGroupDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> showHostClusterDetail =
        genForshowHostClusterDetail();

    private static HttpRequestDef<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> genForshowHostClusterDetail() {
        // basic
        HttpRequestDef.Builder<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHostClusterDetailRequest.class, ShowHostClusterDetailResponse.class)
            .withName("ShowHostClusterDetail")
            .withUri("/v1/resources/host-groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostClusterDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroup =
        genForupdateDeploymentGroup();

    private static HttpRequestDef<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> genForupdateDeploymentGroup() {
        // basic
        HttpRequestDef.Builder<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDeploymentGroupRequest.class, UpdateDeploymentGroupResponse.class)
            .withName("UpdateDeploymentGroup")
            .withUri("/v2/host-groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<DeploymentGroupUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentGroupUpdateRequest.class),
            f -> f.withMarshaller(UpdateDeploymentGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRate =
        genForlistTaskSuccessRate();

    private static HttpRequestDef<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> genForlistTaskSuccessRate() {
        // basic
        HttpRequestDef.Builder<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTaskSuccessRateRequest.class, ListTaskSuccessRateResponse.class)
                .withName("ListTaskSuccessRate")
                .withUri("/v2/{project_id}/tasks/metrics/success-rate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskSuccessRateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<TasksSuccessRateQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TasksSuccessRateQuery.class),
            f -> f.withMarshaller(ListTaskSuccessRateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRate =
        genForshowProjectSuccessRate();

    private static HttpRequestDef<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> genForshowProjectSuccessRate() {
        // basic
        HttpRequestDef.Builder<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectSuccessRateRequest.class, ShowProjectSuccessRateResponse.class)
            .withName("ShowProjectSuccessRate")
            .withUri("/v2/{project_id}/metrics/success-rate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectSuccessRateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectSuccessRateRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectSuccessRateRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));

        // response

        return builder.build();
    }

}
