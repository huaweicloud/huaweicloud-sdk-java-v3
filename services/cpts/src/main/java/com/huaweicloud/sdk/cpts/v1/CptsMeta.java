package com.huaweicloud.sdk.cpts.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cpts.v1.model.BatchUpdateTaskStatusRequest;
import com.huaweicloud.sdk.cpts.v1.model.BatchUpdateTaskStatusRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.BatchUpdateTaskStatusResponse;
import com.huaweicloud.sdk.cpts.v1.model.CaseInfoDetail;
import com.huaweicloud.sdk.cpts.v1.model.CreateCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateCaseRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.CreateCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateDirectoryRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateDirectoryRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.CreateDirectoryResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateNewCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateNewCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateNewTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateNewTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateProjectRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateProjectRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.CreateProjectResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateTaskRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateTempRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateTempRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.CreateTempResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateVariableRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateVariableRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.CreateVariableResponse;
import com.huaweicloud.sdk.cpts.v1.model.DebugCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.DebugCaseRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.DebugCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteDirectoryRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteDirectoryResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteNewCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteNewCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteNewTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteNewTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteProjectRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteProjectResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteTempRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteTempResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteVariableRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteVariableResponse;
import com.huaweicloud.sdk.cpts.v1.model.ListProjectSetsRequest;
import com.huaweicloud.sdk.cpts.v1.model.ListProjectSetsResponse;
import com.huaweicloud.sdk.cpts.v1.model.ListProjectTestCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.ListProjectTestCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.ListTaskCasesRequest;
import com.huaweicloud.sdk.cpts.v1.model.ListTaskCasesResponse;
import com.huaweicloud.sdk.cpts.v1.model.ListVariablesRequest;
import com.huaweicloud.sdk.cpts.v1.model.ListVariablesResponse;
import com.huaweicloud.sdk.cpts.v1.model.NewTaskInfo;
import com.huaweicloud.sdk.cpts.v1.model.ShowAgentConfigRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowAgentConfigRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.ShowAgentConfigResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowHistoryRunInfoRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowHistoryRunInfoResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeCaseDetailRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeCaseDetailResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeReportLogsOutlineRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeReportLogsOutlineResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeTaskCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeTaskCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowProcessRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowProcessResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowProjectRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowProjectResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskCaseAwChartRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskCaseAwChartResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskSetRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskSetResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTempRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTempResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTempSetRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTempSetResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateAgentHealthStatusRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateAgentHealthStatusRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.UpdateAgentHealthStatusResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateDirectoryRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateDirectoryRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.UpdateDirectoryResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateNewCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateNewCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateNewTaskRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.UpdateProjectRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateProjectRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.UpdateProjectResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskRelatedTestCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskRelatedTestCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskStatusRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskStatusRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskStatusResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTempRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTempRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTempResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateVariableRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateVariableRequestBody;
import com.huaweicloud.sdk.cpts.v1.model.UpdateVariableResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class CptsMeta {

    public static final HttpRequestDef<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse> batchUpdateTaskStatus =
        genForBatchUpdateTaskStatus();

    private static HttpRequestDef<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse> genForBatchUpdateTaskStatus() {
        // basic
        HttpRequestDef.Builder<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateTaskStatusRequest.class, BatchUpdateTaskStatusResponse.class)
            .withName("BatchUpdateTaskStatus")
            .withUri("/v1/{project_id}/test-suites/{test_suit_id}/tasks/batch-update-task-status")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchUpdateTaskStatusRequest::getTestSuitId,
                BatchUpdateTaskStatusRequest::setTestSuitId));
        builder.<BatchUpdateTaskStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateTaskStatusRequestBody.class),
            f -> f.withMarshaller(BatchUpdateTaskStatusRequest::getBody, BatchUpdateTaskStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaseRequest, CreateCaseResponse> createCase = genForCreateCase();

    private static HttpRequestDef<CreateCaseRequest, CreateCaseResponse> genForCreateCase() {
        // basic
        HttpRequestDef.Builder<CreateCaseRequest, CreateCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCaseRequest.class, CreateCaseResponse.class)
                .withName("CreateCase")
                .withUri("/v1/{project_id}/task-cases")
                .withContentType("application/json");

        // requests
        builder.<CreateCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCaseRequestBody.class),
            f -> f.withMarshaller(CreateCaseRequest::getBody, CreateCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDirectoryRequest, CreateDirectoryResponse> createDirectory =
        genForCreateDirectory();

    private static HttpRequestDef<CreateDirectoryRequest, CreateDirectoryResponse> genForCreateDirectory() {
        // basic
        HttpRequestDef.Builder<CreateDirectoryRequest, CreateDirectoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDirectoryRequest.class, CreateDirectoryResponse.class)
                .withName("CreateDirectory")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}/directory")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateDirectoryRequest::getTestSuiteId, CreateDirectoryRequest::setTestSuiteId));
        builder.<CreateDirectoryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDirectoryRequestBody.class),
            f -> f.withMarshaller(CreateDirectoryRequest::getBody, CreateDirectoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNewCaseRequest, CreateNewCaseResponse> createNewCase =
        genForCreateNewCase();

    private static HttpRequestDef<CreateNewCaseRequest, CreateNewCaseResponse> genForCreateNewCase() {
        // basic
        HttpRequestDef.Builder<CreateNewCaseRequest, CreateNewCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNewCaseRequest.class, CreateNewCaseResponse.class)
                .withName("CreateNewCase")
                .withUri("/v2/{project_id}/test-cases")
                .withContentType("application/json");

        // requests
        builder.<CaseInfoDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CaseInfoDetail.class),
            f -> f.withMarshaller(CreateNewCaseRequest::getBody, CreateNewCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNewTaskRequest, CreateNewTaskResponse> createNewTask =
        genForCreateNewTask();

    private static HttpRequestDef<CreateNewTaskRequest, CreateNewTaskResponse> genForCreateNewTask() {
        // basic
        HttpRequestDef.Builder<CreateNewTaskRequest, CreateNewTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNewTaskRequest.class, CreateNewTaskResponse.class)
                .withName("CreateNewTask")
                .withUri("/v3/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<NewTaskInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(NewTaskInfo.class),
            f -> f.withMarshaller(CreateNewTaskRequest::getBody, CreateNewTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v1/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTaskRequestBody.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTempRequest, CreateTempResponse> createTemp = genForCreateTemp();

    private static HttpRequestDef<CreateTempRequest, CreateTempResponse> genForCreateTemp() {
        // basic
        HttpRequestDef.Builder<CreateTempRequest, CreateTempResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTempRequest.class, CreateTempResponse.class)
                .withName("CreateTemp")
                .withUri("/v1/{project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateTempRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTempRequestBody.class),
            f -> f.withMarshaller(CreateTempRequest::getBody, CreateTempRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVariableRequest, CreateVariableResponse> createVariable =
        genForCreateVariable();

    private static HttpRequestDef<CreateVariableRequest, CreateVariableResponse> genForCreateVariable() {
        // basic
        HttpRequestDef.Builder<CreateVariableRequest, CreateVariableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVariableRequest.class, CreateVariableResponse.class)
                .withName("CreateVariable")
                .withUri("/v1/{project_id}/variables/{test_suite_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateVariableRequest::getTestSuiteId, CreateVariableRequest::setTestSuiteId));
        builder.<List<CreateVariableRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateVariableRequest::getBody, CreateVariableRequest::setBody)
                .withInnerContainerType(CreateVariableRequestBody.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugCaseRequest, DebugCaseResponse> debugCase = genForDebugCase();

    private static HttpRequestDef<DebugCaseRequest, DebugCaseResponse> genForDebugCase() {
        // basic
        HttpRequestDef.Builder<DebugCaseRequest, DebugCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugCaseRequest.class, DebugCaseResponse.class)
                .withName("DebugCase")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}/tasks/{task_id}/cases/{case_id}/debug")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DebugCaseRequest::getTestSuiteId, DebugCaseRequest::setTestSuiteId));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DebugCaseRequest::getTaskId, DebugCaseRequest::setTaskId));
        builder.<Integer>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DebugCaseRequest::getCaseId, DebugCaseRequest::setCaseId));
        builder.<DebugCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DebugCaseRequestBody.class),
            f -> f.withMarshaller(DebugCaseRequest::getBody, DebugCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCaseRequest, DeleteCaseResponse> deleteCase = genForDeleteCase();

    private static HttpRequestDef<DeleteCaseRequest, DeleteCaseResponse> genForDeleteCase() {
        // basic
        HttpRequestDef.Builder<DeleteCaseRequest, DeleteCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCaseRequest.class, DeleteCaseResponse.class)
                .withName("DeleteCase")
                .withUri("/v1/{project_id}/task-cases/{case_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteCaseRequest::getCaseId, DeleteCaseRequest::setCaseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectory =
        genForDeleteDirectory();

    private static HttpRequestDef<DeleteDirectoryRequest, DeleteDirectoryResponse> genForDeleteDirectory() {
        // basic
        HttpRequestDef.Builder<DeleteDirectoryRequest, DeleteDirectoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDirectoryRequest.class, DeleteDirectoryResponse.class)
                .withName("DeleteDirectory")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}/directory/{directory_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("directory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDirectoryRequest::getDirectoryId, DeleteDirectoryRequest::setDirectoryId));
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDirectoryRequest::getTestSuiteId, DeleteDirectoryRequest::setTestSuiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNewCaseRequest, DeleteNewCaseResponse> deleteNewCase =
        genForDeleteNewCase();

    private static HttpRequestDef<DeleteNewCaseRequest, DeleteNewCaseResponse> genForDeleteNewCase() {
        // basic
        HttpRequestDef.Builder<DeleteNewCaseRequest, DeleteNewCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNewCaseRequest.class, DeleteNewCaseResponse.class)
                .withName("DeleteNewCase")
                .withUri("/v2/{project_id}/test-cases/{case_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteNewCaseRequest::getCaseId, DeleteNewCaseRequest::setCaseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNewTaskRequest, DeleteNewTaskResponse> deleteNewTask =
        genForDeleteNewTask();

    private static HttpRequestDef<DeleteNewTaskRequest, DeleteNewTaskResponse> genForDeleteNewTask() {
        // basic
        HttpRequestDef.Builder<DeleteNewTaskRequest, DeleteNewTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNewTaskRequest.class, DeleteNewTaskResponse.class)
                .withName("DeleteNewTask")
                .withUri("/v3/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteNewTaskRequest::getTaskId, DeleteNewTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v1/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTempRequest, DeleteTempResponse> deleteTemp = genForDeleteTemp();

    private static HttpRequestDef<DeleteTempRequest, DeleteTempResponse> genForDeleteTemp() {
        // basic
        HttpRequestDef.Builder<DeleteTempRequest, DeleteTempResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTempRequest.class, DeleteTempResponse.class)
                .withName("DeleteTemp")
                .withUri("/v1/{project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTempRequest::getTemplateId, DeleteTempRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVariableRequest, DeleteVariableResponse> deleteVariable =
        genForDeleteVariable();

    private static HttpRequestDef<DeleteVariableRequest, DeleteVariableResponse> genForDeleteVariable() {
        // basic
        HttpRequestDef.Builder<DeleteVariableRequest, DeleteVariableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVariableRequest.class, DeleteVariableResponse.class)
                .withName("DeleteVariable")
                .withUri("/v1/{project_id}/variables")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("variable_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteVariableRequest::getVariableId, DeleteVariableRequest::setVariableId));
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteVariableRequest::getTestSuiteId, DeleteVariableRequest::setTestSuiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTestCaseRequest, ListProjectTestCaseResponse> listProjectTestCase =
        genForListProjectTestCase();

    private static HttpRequestDef<ListProjectTestCaseRequest, ListProjectTestCaseResponse> genForListProjectTestCase() {
        // basic
        HttpRequestDef.Builder<ListProjectTestCaseRequest, ListProjectTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTestCaseRequest.class, ListProjectTestCaseResponse.class)
                .withName("ListProjectTestCase")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}/directory")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTestCaseRequest::getTestSuiteId,
                ListProjectTestCaseRequest::setTestSuiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskCasesRequest, ListTaskCasesResponse> listTaskCases =
        genForListTaskCases();

    private static HttpRequestDef<ListTaskCasesRequest, ListTaskCasesResponse> genForListTaskCases() {
        // basic
        HttpRequestDef.Builder<ListTaskCasesRequest, ListTaskCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTaskCasesRequest.class, ListTaskCasesResponse.class)
                .withName("ListTaskCases")
                .withUri("/v1/{project_id}/test-suites/{test_suit_id}/tasks/{task_id}/test-cases")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskCasesRequest::getTestSuitId, ListTaskCasesRequest::setTestSuitId));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskCasesRequest::getTaskId, ListTaskCasesRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVariablesRequest, ListVariablesResponse> listVariables =
        genForListVariables();

    private static HttpRequestDef<ListVariablesRequest, ListVariablesResponse> genForListVariables() {
        // basic
        HttpRequestDef.Builder<ListVariablesRequest, ListVariablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVariablesRequest.class, ListVariablesResponse.class)
                .withName("ListVariables")
                .withUri("/v1/{project_id}/variables/{variable_type}/test-suites/{test_suite_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("variable_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVariablesRequest::getVariableType, ListVariablesRequest::setVariableType));
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVariablesRequest::getTestSuiteId, ListVariablesRequest::setTestSuiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentConfigRequest, ShowAgentConfigResponse> showAgentConfig =
        genForShowAgentConfig();

    private static HttpRequestDef<ShowAgentConfigRequest, ShowAgentConfigResponse> genForShowAgentConfig() {
        // basic
        HttpRequestDef.Builder<ShowAgentConfigRequest, ShowAgentConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowAgentConfigRequest.class, ShowAgentConfigResponse.class)
                .withName("ShowAgentConfig")
                .withUri("/v1/{project_id}/stress/agents")
                .withContentType("application/json");

        // requests
        builder.<ShowAgentConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAgentConfigRequestBody.class),
            f -> f.withMarshaller(ShowAgentConfigRequest::getBody, ShowAgentConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseRequest, ShowCaseResponse> showCase = genForShowCase();

    private static HttpRequestDef<ShowCaseRequest, ShowCaseResponse> genForShowCase() {
        // basic
        HttpRequestDef.Builder<ShowCaseRequest, ShowCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCaseRequest.class, ShowCaseResponse.class)
                .withName("ShowCase")
                .withUri("/v2/{project_id}/test-cases/{case_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCaseRequest::getCaseId, ShowCaseRequest::setCaseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> showHistoryRunInfo =
        genForShowHistoryRunInfo();

    private static HttpRequestDef<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> genForShowHistoryRunInfo() {
        // basic
        HttpRequestDef.Builder<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHistoryRunInfoRequest.class, ShowHistoryRunInfoResponse.class)
                .withName("ShowHistoryRunInfo")
                .withUri("/v1/{project_id}/tasks/history-run-list/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryRunInfoRequest::getTaskId, ShowHistoryRunInfoRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse> showMergeCaseDetail =
        genForShowMergeCaseDetail();

    private static HttpRequestDef<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse> genForShowMergeCaseDetail() {
        // basic
        HttpRequestDef.Builder<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMergeCaseDetailRequest.class, ShowMergeCaseDetailResponse.class)
                .withName("ShowMergeCaseDetail")
                .withUri("/v2/{project_id}/task-run-infos/{task_run_id}/case-run-infos/{case_run_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeCaseDetailRequest::getTaskRunId, ShowMergeCaseDetailRequest::setTaskRunId));
        builder.<Integer>withRequestField("case_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeCaseDetailRequest::getCaseRunId, ShowMergeCaseDetailRequest::setCaseRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse> showMergeReportLogsOutline =
        genForShowMergeReportLogsOutline();

    private static HttpRequestDef<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse> genForShowMergeReportLogsOutline() {
        // basic
        HttpRequestDef.Builder<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMergeReportLogsOutlineRequest.class,
                    ShowMergeReportLogsOutlineResponse.class)
                .withName("ShowMergeReportLogsOutline")
                .withUri("/v2/{project_id}/task-run-infos/{task_run_id}/reports/log-outline")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeReportLogsOutlineRequest::getTaskRunId,
                ShowMergeReportLogsOutlineRequest::setTaskRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse> showMergeTaskCase =
        genForShowMergeTaskCase();

    private static HttpRequestDef<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse> genForShowMergeTaskCase() {
        // basic
        HttpRequestDef.Builder<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMergeTaskCaseRequest.class, ShowMergeTaskCaseResponse.class)
                .withName("ShowMergeTaskCase")
                .withUri("/v2/{project_id}/task-run-infos/{task_run_id}/cases")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeTaskCaseRequest::getTaskRunId, ShowMergeTaskCaseRequest::setTaskRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportRequest, ShowReportResponse> showReport = genForShowReport();

    private static HttpRequestDef<ShowReportRequest, ShowReportResponse> genForShowReport() {
        // basic
        HttpRequestDef.Builder<ShowReportRequest, ShowReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReportRequest.class, ShowReportResponse.class)
                .withName("ShowReport")
                .withUri("/v1/{project_id}/task-run-infos/{task_run_id}/case-run-infos/{case_run_id}/reports")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportRequest::getTaskRunId, ShowReportRequest::setTaskRunId));
        builder.<Integer>withRequestField("case_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportRequest::getCaseRunId, ShowReportRequest::setCaseRunId));
        builder.<Integer>withRequestField("brokens_limit_count",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportRequest::getBrokensLimitCount, ShowReportRequest::setBrokensLimitCount));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v1/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse> showTaskCaseAwChart =
        genForShowTaskCaseAwChart();

    private static HttpRequestDef<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse> genForShowTaskCaseAwChart() {
        // basic
        HttpRequestDef.Builder<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskCaseAwChartRequest.class, ShowTaskCaseAwChartResponse.class)
            .withName("ShowTaskCaseAwChart")
            .withUri(
                "/v2/{project_id}/task-run-infos/{task_run_id}/case-run-infos/{case_run_id}/detail/{detail_id}/chart")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskCaseAwChartRequest::getTaskRunId, ShowTaskCaseAwChartRequest::setTaskRunId));
        builder.<Integer>withRequestField("case_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskCaseAwChartRequest::getCaseRunId, ShowTaskCaseAwChartRequest::setCaseRunId));
        builder.<String>withRequestField("detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskCaseAwChartRequest::getDetailId, ShowTaskCaseAwChartRequest::setDetailId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskSetRequest, ShowTaskSetResponse> showTaskSet = genForShowTaskSet();

    private static HttpRequestDef<ShowTaskSetRequest, ShowTaskSetResponse> genForShowTaskSet() {
        // basic
        HttpRequestDef.Builder<ShowTaskSetRequest, ShowTaskSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskSetRequest.class, ShowTaskSetResponse.class)
                .withName("ShowTaskSet")
                .withUri("/v1/{project_id}/all-tasks/{test_suite_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskSetRequest::getTestSuiteId, ShowTaskSetRequest::setTestSuiteId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskSetRequest::getOffset, ShowTaskSetRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskSetRequest::getLimit, ShowTaskSetRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTempRequest, ShowTempResponse> showTemp = genForShowTemp();

    private static HttpRequestDef<ShowTempRequest, ShowTempResponse> genForShowTemp() {
        // basic
        HttpRequestDef.Builder<ShowTempRequest, ShowTempResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTempRequest.class, ShowTempResponse.class)
                .withName("ShowTemp")
                .withUri("/v1/{project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTempRequest::getTemplateId, ShowTempRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTempSetRequest, ShowTempSetResponse> showTempSet = genForShowTempSet();

    private static HttpRequestDef<ShowTempSetRequest, ShowTempSetResponse> genForShowTempSet() {
        // basic
        HttpRequestDef.Builder<ShowTempSetRequest, ShowTempSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTempSetRequest.class, ShowTempSetResponse.class)
                .withName("ShowTempSet")
                .withUri("/v1/{project_id}/all-templates/{test_suite_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTempSetRequest::getTestSuiteId, ShowTempSetRequest::setTestSuiteId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTempSetRequest::getOffset, ShowTempSetRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTempSetRequest::getLimit, ShowTempSetRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse> updateAgentHealthStatus =
        genForUpdateAgentHealthStatus();

    private static HttpRequestDef<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse> genForUpdateAgentHealthStatus() {
        // basic
        HttpRequestDef.Builder<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAgentHealthStatusRequest.class, UpdateAgentHealthStatusResponse.class)
            .withName("UpdateAgentHealthStatus")
            .withUri("/v1/{project_id}/stress/agents/{agent_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateAgentHealthStatusRequest::getAgentId,
                UpdateAgentHealthStatusRequest::setAgentId));
        builder.<UpdateAgentHealthStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAgentHealthStatusRequestBody.class),
            f -> f.withMarshaller(UpdateAgentHealthStatusRequest::getBody, UpdateAgentHealthStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCaseRequest, UpdateCaseResponse> updateCase = genForUpdateCase();

    private static HttpRequestDef<UpdateCaseRequest, UpdateCaseResponse> genForUpdateCase() {
        // basic
        HttpRequestDef.Builder<UpdateCaseRequest, UpdateCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCaseRequest.class, UpdateCaseResponse.class)
                .withName("UpdateCase")
                .withUri("/v1/{project_id}/task-cases/{case_id}/target/{target}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateCaseRequest::getCaseId, UpdateCaseRequest::setCaseId));
        builder.<String>withRequestField("target",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCaseRequest::getTarget, UpdateCaseRequest::setTarget));
        builder.<CaseInfoDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CaseInfoDetail.class),
            f -> f.withMarshaller(UpdateCaseRequest::getBody, UpdateCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectory =
        genForUpdateDirectory();

    private static HttpRequestDef<UpdateDirectoryRequest, UpdateDirectoryResponse> genForUpdateDirectory() {
        // basic
        HttpRequestDef.Builder<UpdateDirectoryRequest, UpdateDirectoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDirectoryRequest.class, UpdateDirectoryResponse.class)
                .withName("UpdateDirectory")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}/directory/{directory_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("directory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateDirectoryRequest::getDirectoryId, UpdateDirectoryRequest::setDirectoryId));
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateDirectoryRequest::getTestSuiteId, UpdateDirectoryRequest::setTestSuiteId));
        builder.<UpdateDirectoryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDirectoryRequestBody.class),
            f -> f.withMarshaller(UpdateDirectoryRequest::getBody, UpdateDirectoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNewCaseRequest, UpdateNewCaseResponse> updateNewCase =
        genForUpdateNewCase();

    private static HttpRequestDef<UpdateNewCaseRequest, UpdateNewCaseResponse> genForUpdateNewCase() {
        // basic
        HttpRequestDef.Builder<UpdateNewCaseRequest, UpdateNewCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNewCaseRequest.class, UpdateNewCaseResponse.class)
                .withName("UpdateNewCase")
                .withUri("/v2/{project_id}/test-cases/{case_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateNewCaseRequest::getCaseId, UpdateNewCaseRequest::setCaseId));
        builder.<CaseInfoDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CaseInfoDetail.class),
            f -> f.withMarshaller(UpdateNewCaseRequest::getBody, UpdateNewCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForUpdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForUpdateTask() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRequest, UpdateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskRequest.class, UpdateTaskResponse.class)
                .withName("UpdateTask")
                .withUri("/v1/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, UpdateTaskRequest::setTaskId));
        builder.<UpdateTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTaskRequestBody.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, UpdateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse> updateTaskRelatedTestCase =
        genForUpdateTaskRelatedTestCase();

    private static HttpRequestDef<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse> genForUpdateTaskRelatedTestCase() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTaskRelatedTestCaseRequest.class,
                    UpdateTaskRelatedTestCaseResponse.class)
                .withName("UpdateTaskRelatedTestCase")
                .withUri("/v3/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTaskRelatedTestCaseRequest::getTaskId,
                UpdateTaskRelatedTestCaseRequest::setTaskId));
        builder.<UpdateNewTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNewTaskRequestBody.class),
            f -> f.withMarshaller(UpdateTaskRelatedTestCaseRequest::getBody,
                UpdateTaskRelatedTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatus =
        genForUpdateTaskStatus();

    private static HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> genForUpdateTaskStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTaskStatusRequest, UpdateTaskStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTaskStatusRequest.class, UpdateTaskStatusResponse.class)
                .withName("UpdateTaskStatus")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getTestSuiteId, UpdateTaskStatusRequest::setTestSuiteId));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getTaskId, UpdateTaskStatusRequest::setTaskId));
        builder.<UpdateTaskStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTaskStatusRequestBody.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getBody, UpdateTaskStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTempRequest, UpdateTempResponse> updateTemp = genForUpdateTemp();

    private static HttpRequestDef<UpdateTempRequest, UpdateTempResponse> genForUpdateTemp() {
        // basic
        HttpRequestDef.Builder<UpdateTempRequest, UpdateTempResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTempRequest.class, UpdateTempResponse.class)
                .withName("UpdateTemp")
                .withUri("/v1/{project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTempRequest::getTemplateId, UpdateTempRequest::setTemplateId));
        builder.<UpdateTempRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTempRequestBody.class),
            f -> f.withMarshaller(UpdateTempRequest::getBody, UpdateTempRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVariableRequest, UpdateVariableResponse> updateVariable =
        genForUpdateVariable();

    private static HttpRequestDef<UpdateVariableRequest, UpdateVariableResponse> genForUpdateVariable() {
        // basic
        HttpRequestDef.Builder<UpdateVariableRequest, UpdateVariableResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVariableRequest.class, UpdateVariableResponse.class)
                .withName("UpdateVariable")
                .withUri("/v1/{project_id}/variables/{test_suite_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateVariableRequest::getTestSuiteId, UpdateVariableRequest::setTestSuiteId));
        builder.<List<UpdateVariableRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateVariableRequest::getBody, UpdateVariableRequest::setBody)
                .withInnerContainerType(UpdateVariableRequestBody.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRequest, CreateProjectResponse> createProject =
        genForCreateProject();

    private static HttpRequestDef<CreateProjectRequest, CreateProjectResponse> genForCreateProject() {
        // basic
        HttpRequestDef.Builder<CreateProjectRequest, CreateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectRequest.class, CreateProjectResponse.class)
                .withName("CreateProject")
                .withUri("/v1/{project_id}/test-suites")
                .withContentType("application/json");

        // requests
        builder.<CreateProjectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectRequestBody.class),
            f -> f.withMarshaller(CreateProjectRequest::getBody, CreateProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> deleteProject =
        genForDeleteProject();

    private static HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> genForDeleteProject() {
        // basic
        HttpRequestDef.Builder<DeleteProjectRequest, DeleteProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProjectRequest.class, DeleteProjectResponse.class)
                .withName("DeleteProject")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProjectRequest::getTestSuiteId, DeleteProjectRequest::setTestSuiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectSetsRequest, ListProjectSetsResponse> listProjectSets =
        genForListProjectSets();

    private static HttpRequestDef<ListProjectSetsRequest, ListProjectSetsResponse> genForListProjectSets() {
        // basic
        HttpRequestDef.Builder<ListProjectSetsRequest, ListProjectSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectSetsRequest.class, ListProjectSetsResponse.class)
                .withName("ListProjectSets")
                .withUri("/v1/{project_id}/test-suites")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectSetsRequest::getOffset, ListProjectSetsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectSetsRequest::getLimit, ListProjectSetsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProcessRequest, ShowProcessResponse> showProcess = genForShowProcess();

    private static HttpRequestDef<ShowProcessRequest, ShowProcessResponse> genForShowProcess() {
        // basic
        HttpRequestDef.Builder<ShowProcessRequest, ShowProcessResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProcessRequest.class, ShowProcessResponse.class)
                .withName("ShowProcess")
                .withUri("/v1/{project_id}/test-suites/upload/processes")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectRequest, ShowProjectResponse> showProject = genForShowProject();

    private static HttpRequestDef<ShowProjectRequest, ShowProjectResponse> genForShowProject() {
        // basic
        HttpRequestDef.Builder<ShowProjectRequest, ShowProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectRequest.class, ShowProjectResponse.class)
                .withName("ShowProject")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectRequest::getTestSuiteId, ShowProjectRequest::setTestSuiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> updateProject =
        genForUpdateProject();

    private static HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> genForUpdateProject() {
        // basic
        HttpRequestDef.Builder<UpdateProjectRequest, UpdateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectRequest.class, UpdateProjectResponse.class)
                .withName("UpdateProject")
                .withUri("/v1/{project_id}/test-suites/{test_suite_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProjectRequest::getTestSuiteId, UpdateProjectRequest::setTestSuiteId));
        builder.<UpdateProjectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectRequestBody.class),
            f -> f.withMarshaller(UpdateProjectRequest::getBody, UpdateProjectRequest::setBody));

        // response

        return builder.build();
    }

}
