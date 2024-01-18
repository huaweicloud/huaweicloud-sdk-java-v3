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

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
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
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplate =
        genForCreateDeployTaskByTemplate();

    private static HttpRequestDef<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> genForCreateDeployTaskByTemplate() {
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
            f -> f.withMarshaller(CreateDeployTaskByTemplateRequest::getBody,
                CreateDeployTaskByTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genForDeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genForDeleteApplication() {
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
            f -> f.withMarshaller(DeleteApplicationRequest::getAppId, DeleteApplicationRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTask =
        genForDeleteDeployTask();

    private static HttpRequestDef<DeleteDeployTaskRequest, DeleteDeployTaskResponse> genForDeleteDeployTask() {
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
            f -> f.withMarshaller(DeleteDeployTaskRequest::getTaskId, DeleteDeployTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllAppRequest, ListAllAppResponse> listAllApp = genForListAllApp();

    private static HttpRequestDef<ListAllAppRequest, ListAllAppResponse> genForListAllApp() {
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
            f -> f.withMarshaller(ListAllAppRequest::getBody, ListAllAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDate =
        genForListDeployTaskHistoryByDate();

    private static HttpRequestDef<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> genForListDeployTaskHistoryByDate() {
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
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getProjectId,
                ListDeployTaskHistoryByDateRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getId,
                ListDeployTaskHistoryByDateRequest::setId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getPage,
                ListDeployTaskHistoryByDateRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getSize,
                ListDeployTaskHistoryByDateRequest::setSize));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getStartDate,
                ListDeployTaskHistoryByDateRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeployTaskHistoryByDateRequest::getEndDate,
                ListDeployTaskHistoryByDateRequest::setEndDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasks =
        genForListDeployTasks();

    private static HttpRequestDef<ListDeployTasksRequest, ListDeployTasksResponse> genForListDeployTasks() {
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
            f -> f.withMarshaller(ListDeployTasksRequest::getProjectId, ListDeployTasksRequest::setProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeployTasksRequest::getPage, ListDeployTasksRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeployTasksRequest::getSize, ListDeployTasksRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> showAppDetailById =
        genForShowAppDetailById();

    private static HttpRequestDef<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> genForShowAppDetailById() {
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
            f -> f.withMarshaller(ShowAppDetailByIdRequest::getAppId, ShowAppDetailByIdRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetail =
        genForShowDeployTaskDetail();

    private static HttpRequestDef<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> genForShowDeployTaskDetail() {
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
            f -> f.withMarshaller(ShowDeployTaskDetailRequest::getTaskId, ShowDeployTaskDetailRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExecutionParamsRequest, ShowExecutionParamsResponse> showExecutionParams =
        genForShowExecutionParams();

    private static HttpRequestDef<ShowExecutionParamsRequest, ShowExecutionParamsResponse> genForShowExecutionParams() {
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
            f -> f.withMarshaller(ShowExecutionParamsRequest::getTaskId, ShowExecutionParamsRequest::setTaskId));
        builder.<String>withRequestField("record_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionParamsRequest::getRecordId, ShowExecutionParamsRequest::setRecordId));

        // response
        builder.<List<ConfigInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowExecutionParamsResponse::getBody, ShowExecutionParamsResponse::setBody)
                .withInnerContainerType(ConfigInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTask =
        genForStartDeployTask();

    private static HttpRequestDef<StartDeployTaskRequest, StartDeployTaskResponse> genForStartDeployTask() {
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
            f -> f.withMarshaller(StartDeployTaskRequest::getTaskId, StartDeployTaskRequest::setTaskId));
        builder.<EnvExecutionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvExecutionBody.class),
            f -> f.withMarshaller(StartDeployTaskRequest::getBody, StartDeployTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironment =
        genForCreateEnvironment();

    private static HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> genForCreateEnvironment() {
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
            f -> f.withMarshaller(CreateEnvironmentRequest::getApplicationId,
                CreateEnvironmentRequest::setApplicationId));
        builder.<EnvironmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvironmentRequestBody.class),
            f -> f.withMarshaller(CreateEnvironmentRequest::getBody, CreateEnvironmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironment =
        genForDeleteEnvironment();

    private static HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> genForDeleteEnvironment() {
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
            f -> f.withMarshaller(DeleteEnvironmentRequest::getApplicationId,
                DeleteEnvironmentRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getEnvironmentId,
                DeleteEnvironmentRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> deleteHostFromEnvironment =
        genForDeleteHostFromEnvironment();

    private static HttpRequestDef<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> genForDeleteHostFromEnvironment() {
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
            f -> f.withMarshaller(DeleteHostFromEnvironmentRequest::getApplicationId,
                DeleteHostFromEnvironmentRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostFromEnvironmentRequest::getEnvironmentId,
                DeleteHostFromEnvironmentRequest::setEnvironmentId));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostFromEnvironmentRequest::getHostId,
                DeleteHostFromEnvironmentRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> importHostToEnvironment =
        genForImportHostToEnvironment();

    private static HttpRequestDef<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> genForImportHostToEnvironment() {
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
            f -> f.withMarshaller(ImportHostToEnvironmentRequest::getApplicationId,
                ImportHostToEnvironmentRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportHostToEnvironmentRequest::getEnvironmentId,
                ImportHostToEnvironmentRequest::setEnvironmentId));
        builder.<ImportHostToEnvironmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportHostToEnvironmentRequestBody.class),
            f -> f.withMarshaller(ImportHostToEnvironmentRequest::getBody, ImportHostToEnvironmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironments =
        genForListEnvironments();

    private static HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> genForListEnvironments() {
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
            f -> f.withMarshaller(ListEnvironmentsRequest::getApplicationId,
                ListEnvironmentsRequest::setApplicationId));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getProjectId, ListEnvironmentsRequest::setProjectId));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getPageIndex, ListEnvironmentsRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getPageSize, ListEnvironmentsRequest::setPageSize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getName, ListEnvironmentsRequest::setName));
        builder.<ListEnvironmentsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEnvironmentsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getSortKey, ListEnvironmentsRequest::setSortKey));
        builder.<ListEnvironmentsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEnvironmentsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getSortDir, ListEnvironmentsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetail =
        genForShowEnvironmentDetail();

    private static HttpRequestDef<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> genForShowEnvironmentDetail() {
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
            f -> f.withMarshaller(ShowEnvironmentDetailRequest::getApplicationId,
                ShowEnvironmentDetailRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentDetailRequest::getEnvironmentId,
                ShowEnvironmentDetailRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHost =
        genForCreateDeploymentHost();

    private static HttpRequestDef<CreateDeploymentHostRequest, CreateDeploymentHostResponse> genForCreateDeploymentHost() {
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
            f -> f.withMarshaller(CreateDeploymentHostRequest::getGroupId, CreateDeploymentHostRequest::setGroupId));
        builder.<DeploymentHost>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentHost.class),
            f -> f.withMarshaller(CreateDeploymentHostRequest::getBody, CreateDeploymentHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostRequest, CreateHostResponse> createHost = genForCreateHost();

    private static HttpRequestDef<CreateHostRequest, CreateHostResponse> genForCreateHost() {
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
            f -> f.withMarshaller(CreateHostRequest::getGroupId, CreateHostRequest::setGroupId));
        builder.<CreateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostRequestBody.class),
            f -> f.withMarshaller(CreateHostRequest::getBody, CreateHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHost =
        genForDeleteDeploymentHost();

    private static HttpRequestDef<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> genForDeleteDeploymentHost() {
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
            f -> f.withMarshaller(DeleteDeploymentHostRequest::getGroupId, DeleteDeploymentHostRequest::setGroupId));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentHostRequest::getHostId, DeleteDeploymentHostRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostsRequest, ListHostsResponse> listHosts = genForListHosts();

    private static HttpRequestDef<ListHostsRequest, ListHostsResponse> genForListHosts() {
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
            f -> f.withMarshaller(ListHostsRequest::getGroupId, ListHostsRequest::setGroupId));
        builder.<Boolean>withRequestField("as_proxy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostsRequest::getAsProxy, ListHostsRequest::setAsProxy));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostsRequest::getOffset, ListHostsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostsRequest::getLimit, ListHostsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getName, ListHostsRequest::setName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getSortKey, ListHostsRequest::setSortKey));
        builder.<ListHostsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListHostsRequest::getSortDir, ListHostsRequest::setSortDir));
        builder.<Boolean>withRequestField("with_auth",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostsRequest::getWithAuth, ListHostsRequest::setWithAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNewHostsRequest, ListNewHostsResponse> listNewHosts = genForListNewHosts();

    private static HttpRequestDef<ListNewHostsRequest, ListNewHostsResponse> genForListNewHosts() {
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
            f -> f.withMarshaller(ListNewHostsRequest::getGroupId, ListNewHostsRequest::setGroupId));
        builder.<String>withRequestField("key_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewHostsRequest::getKeyField, ListNewHostsRequest::setKeyField));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewHostsRequest::getEnvironmentId, ListNewHostsRequest::setEnvironmentId));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNewHostsRequest::getPageIndex, ListNewHostsRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNewHostsRequest::getPageSize, ListNewHostsRequest::setPageSize));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewHostsRequest::getSortKey, ListNewHostsRequest::setSortKey));
        builder.<ListNewHostsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNewHostsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListNewHostsRequest::getSortDir, ListNewHostsRequest::setSortDir));
        builder.<Boolean>withRequestField("as_proxy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListNewHostsRequest::getAsProxy, ListNewHostsRequest::setAsProxy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetail =
        genForShowDeploymentHostDetail();

    private static HttpRequestDef<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> genForShowDeploymentHostDetail() {
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
            f -> f.withMarshaller(ShowDeploymentHostDetailRequest::getGroupId,
                ShowDeploymentHostDetailRequest::setGroupId));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentHostDetailRequest::getHostId,
                ShowDeploymentHostDetailRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostDetailRequest, ShowHostDetailResponse> showHostDetail =
        genForShowHostDetail();

    private static HttpRequestDef<ShowHostDetailRequest, ShowHostDetailResponse> genForShowHostDetail() {
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
            f -> f.withMarshaller(ShowHostDetailRequest::getGroupId, ShowHostDetailRequest::setGroupId));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostDetailRequest::getHostId, ShowHostDetailRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHost =
        genForUpdateDeploymentHost();

    private static HttpRequestDef<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> genForUpdateDeploymentHost() {
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
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getGroupId, UpdateDeploymentHostRequest::setGroupId));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getHostId, UpdateDeploymentHostRequest::setHostId));
        builder.<DeploymentHostRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentHostRequest.class),
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getBody, UpdateDeploymentHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroup =
        genForCreateDeploymentGroup();

    private static HttpRequestDef<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> genForCreateDeploymentGroup() {
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
            f -> f.withMarshaller(CreateDeploymentGroupRequest::getBody, CreateDeploymentGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostClusterRequest, CreateHostClusterResponse> createHostCluster =
        genForCreateHostCluster();

    private static HttpRequestDef<CreateHostClusterRequest, CreateHostClusterResponse> genForCreateHostCluster() {
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
            f -> f.withMarshaller(CreateHostClusterRequest::getBody, CreateHostClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroup =
        genForDeleteDeploymentGroup();

    private static HttpRequestDef<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> genForDeleteDeploymentGroup() {
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
            f -> f.withMarshaller(DeleteDeploymentGroupRequest::getGroupId, DeleteDeploymentGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostClustersRequest, ListHostClustersResponse> listHostClusters =
        genForListHostClusters();

    private static HttpRequestDef<ListHostClustersRequest, ListHostClustersResponse> genForListHostClusters() {
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
            f -> f.withMarshaller(ListHostClustersRequest::getProjectId, ListHostClustersRequest::setProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostClustersRequest::getName, ListHostClustersRequest::setName));
        builder.<ListHostClustersRequest.OsEnum>withRequestField("os",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostClustersRequest.OsEnum.class),
            f -> f.withMarshaller(ListHostClustersRequest::getOs, ListHostClustersRequest::setOs));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostClustersRequest::getPageIndex, ListHostClustersRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostClustersRequest::getPageSize, ListHostClustersRequest::setPageSize));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostClustersRequest::getSortField, ListHostClustersRequest::setSortField));
        builder.<ListHostClustersRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostClustersRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListHostClustersRequest::getSortType, ListHostClustersRequest::setSortType));
        builder.<Integer>withRequestField("is_proxy_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostClustersRequest::getIsProxyMode, ListHostClustersRequest::setIsProxyMode));
        builder.<String>withRequestField("slave_cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostClustersRequest::getSlaveClusterId,
                ListHostClustersRequest::setSlaveClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroups =
        genForListHostGroups();

    private static HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> genForListHostGroups() {
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
            f -> f.withMarshaller(ListHostGroupsRequest::getProjectId, ListHostGroupsRequest::setProjectId));
        builder.<String>withRequestField("region_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getRegionName, ListHostGroupsRequest::setRegionName));
        builder.<ListHostGroupsRequest.OsEnum>withRequestField("os",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostGroupsRequest.OsEnum.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getOs, ListHostGroupsRequest::setOs));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getOffset, ListHostGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getLimit, ListHostGroupsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getName, ListHostGroupsRequest::setName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getSortKey, ListHostGroupsRequest::setSortKey));
        builder.<ListHostGroupsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostGroupsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getSortDir, ListHostGroupsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetail =
        genForShowDeploymentGroupDetail();

    private static HttpRequestDef<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> genForShowDeploymentGroupDetail() {
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
            f -> f.withMarshaller(ShowDeploymentGroupDetailRequest::getGroupId,
                ShowDeploymentGroupDetailRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> showHostClusterDetail =
        genForShowHostClusterDetail();

    private static HttpRequestDef<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> genForShowHostClusterDetail() {
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
            f -> f.withMarshaller(ShowHostClusterDetailRequest::getGroupId, ShowHostClusterDetailRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroup =
        genForUpdateDeploymentGroup();

    private static HttpRequestDef<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> genForUpdateDeploymentGroup() {
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
            f -> f.withMarshaller(UpdateDeploymentGroupRequest::getGroupId, UpdateDeploymentGroupRequest::setGroupId));
        builder.<DeploymentGroupUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentGroupUpdateRequest.class),
            f -> f.withMarshaller(UpdateDeploymentGroupRequest::getBody, UpdateDeploymentGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRate =
        genForListTaskSuccessRate();

    private static HttpRequestDef<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> genForListTaskSuccessRate() {
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
            f -> f.withMarshaller(ListTaskSuccessRateRequest::getProjectId, ListTaskSuccessRateRequest::setProjectId));
        builder.<TasksSuccessRateQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TasksSuccessRateQuery.class),
            f -> f.withMarshaller(ListTaskSuccessRateRequest::getBody, ListTaskSuccessRateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRate =
        genForShowProjectSuccessRate();

    private static HttpRequestDef<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> genForShowProjectSuccessRate() {
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
            f -> f.withMarshaller(ShowProjectSuccessRateRequest::getProjectId,
                ShowProjectSuccessRateRequest::setProjectId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectSuccessRateRequest::getStartDate,
                ShowProjectSuccessRateRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectSuccessRateRequest::getEndDate,
                ShowProjectSuccessRateRequest::setEndDate));

        // response

        return builder.build();
    }

}
