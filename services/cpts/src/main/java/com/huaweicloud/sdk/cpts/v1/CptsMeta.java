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
        genForbatchUpdateTaskStatus();

    private static HttpRequestDef<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse> genForbatchUpdateTaskStatus() {
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
            f -> f.withMarshaller(BatchUpdateTaskStatusRequest::getTestSuitId, (req, v) -> {
                req.setTestSuitId(v);
            }));
        builder.<BatchUpdateTaskStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateTaskStatusRequestBody.class),
            f -> f.withMarshaller(BatchUpdateTaskStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaseRequest, CreateCaseResponse> createCase = genForcreateCase();

    private static HttpRequestDef<CreateCaseRequest, CreateCaseResponse> genForcreateCase() {
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
            f -> f.withMarshaller(CreateCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDirectoryRequest, CreateDirectoryResponse> createDirectory =
        genForcreateDirectory();

    private static HttpRequestDef<CreateDirectoryRequest, CreateDirectoryResponse> genForcreateDirectory() {
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
            f -> f.withMarshaller(CreateDirectoryRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<CreateDirectoryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDirectoryRequestBody.class),
            f -> f.withMarshaller(CreateDirectoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNewCaseRequest, CreateNewCaseResponse> createNewCase =
        genForcreateNewCase();

    private static HttpRequestDef<CreateNewCaseRequest, CreateNewCaseResponse> genForcreateNewCase() {
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
            f -> f.withMarshaller(CreateNewCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNewTaskRequest, CreateNewTaskResponse> createNewTask =
        genForcreateNewTask();

    private static HttpRequestDef<CreateNewTaskRequest, CreateNewTaskResponse> genForcreateNewTask() {
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
            f -> f.withMarshaller(CreateNewTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
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
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTempRequest, CreateTempResponse> createTemp = genForcreateTemp();

    private static HttpRequestDef<CreateTempRequest, CreateTempResponse> genForcreateTemp() {
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
            f -> f.withMarshaller(CreateTempRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVariableRequest, CreateVariableResponse> createVariable =
        genForcreateVariable();

    private static HttpRequestDef<CreateVariableRequest, CreateVariableResponse> genForcreateVariable() {
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
            f -> f.withMarshaller(CreateVariableRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<List<CreateVariableRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateVariableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(CreateVariableRequestBody.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugCaseRequest, DebugCaseResponse> debugCase = genFordebugCase();

    private static HttpRequestDef<DebugCaseRequest, DebugCaseResponse> genFordebugCase() {
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
            f -> f.withMarshaller(DebugCaseRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DebugCaseRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Integer>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DebugCaseRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<DebugCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DebugCaseRequestBody.class),
            f -> f.withMarshaller(DebugCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCaseRequest, DeleteCaseResponse> deleteCase = genFordeleteCase();

    private static HttpRequestDef<DeleteCaseRequest, DeleteCaseResponse> genFordeleteCase() {
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
            f -> f.withMarshaller(DeleteCaseRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectory =
        genFordeleteDirectory();

    private static HttpRequestDef<DeleteDirectoryRequest, DeleteDirectoryResponse> genFordeleteDirectory() {
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
            f -> f.withMarshaller(DeleteDirectoryRequest::getDirectoryId, (req, v) -> {
                req.setDirectoryId(v);
            }));
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDirectoryRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNewCaseRequest, DeleteNewCaseResponse> deleteNewCase =
        genFordeleteNewCase();

    private static HttpRequestDef<DeleteNewCaseRequest, DeleteNewCaseResponse> genFordeleteNewCase() {
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
            f -> f.withMarshaller(DeleteNewCaseRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNewTaskRequest, DeleteNewTaskResponse> deleteNewTask =
        genFordeleteNewTask();

    private static HttpRequestDef<DeleteNewTaskRequest, DeleteNewTaskResponse> genFordeleteNewTask() {
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
            f -> f.withMarshaller(DeleteNewTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genFordeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genFordeleteTask() {
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
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTempRequest, DeleteTempResponse> deleteTemp = genFordeleteTemp();

    private static HttpRequestDef<DeleteTempRequest, DeleteTempResponse> genFordeleteTemp() {
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
            f -> f.withMarshaller(DeleteTempRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVariableRequest, DeleteVariableResponse> deleteVariable =
        genFordeleteVariable();

    private static HttpRequestDef<DeleteVariableRequest, DeleteVariableResponse> genFordeleteVariable() {
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
            f -> f.withMarshaller(DeleteVariableRequest::getVariableId, (req, v) -> {
                req.setVariableId(v);
            }));
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteVariableRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTestCaseRequest, ListProjectTestCaseResponse> listProjectTestCase =
        genForlistProjectTestCase();

    private static HttpRequestDef<ListProjectTestCaseRequest, ListProjectTestCaseResponse> genForlistProjectTestCase() {
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
            f -> f.withMarshaller(ListProjectTestCaseRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskCasesRequest, ListTaskCasesResponse> listTaskCases =
        genForlistTaskCases();

    private static HttpRequestDef<ListTaskCasesRequest, ListTaskCasesResponse> genForlistTaskCases() {
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
            f -> f.withMarshaller(ListTaskCasesRequest::getTestSuitId, (req, v) -> {
                req.setTestSuitId(v);
            }));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskCasesRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVariablesRequest, ListVariablesResponse> listVariables =
        genForlistVariables();

    private static HttpRequestDef<ListVariablesRequest, ListVariablesResponse> genForlistVariables() {
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
            f -> f.withMarshaller(ListVariablesRequest::getVariableType, (req, v) -> {
                req.setVariableType(v);
            }));
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVariablesRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentConfigRequest, ShowAgentConfigResponse> showAgentConfig =
        genForshowAgentConfig();

    private static HttpRequestDef<ShowAgentConfigRequest, ShowAgentConfigResponse> genForshowAgentConfig() {
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
            f -> f.withMarshaller(ShowAgentConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseRequest, ShowCaseResponse> showCase = genForshowCase();

    private static HttpRequestDef<ShowCaseRequest, ShowCaseResponse> genForshowCase() {
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
            f -> f.withMarshaller(ShowCaseRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> showHistoryRunInfo =
        genForshowHistoryRunInfo();

    private static HttpRequestDef<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> genForshowHistoryRunInfo() {
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
            f -> f.withMarshaller(ShowHistoryRunInfoRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse> showMergeCaseDetail =
        genForshowMergeCaseDetail();

    private static HttpRequestDef<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse> genForshowMergeCaseDetail() {
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
            f -> f.withMarshaller(ShowMergeCaseDetailRequest::getTaskRunId, (req, v) -> {
                req.setTaskRunId(v);
            }));
        builder.<Integer>withRequestField("case_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeCaseDetailRequest::getCaseRunId, (req, v) -> {
                req.setCaseRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse> showMergeReportLogsOutline =
        genForshowMergeReportLogsOutline();

    private static HttpRequestDef<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse> genForshowMergeReportLogsOutline() {
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
            f -> f.withMarshaller(ShowMergeReportLogsOutlineRequest::getTaskRunId, (req, v) -> {
                req.setTaskRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse> showMergeTaskCase =
        genForshowMergeTaskCase();

    private static HttpRequestDef<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse> genForshowMergeTaskCase() {
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
            f -> f.withMarshaller(ShowMergeTaskCaseRequest::getTaskRunId, (req, v) -> {
                req.setTaskRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportRequest, ShowReportResponse> showReport = genForshowReport();

    private static HttpRequestDef<ShowReportRequest, ShowReportResponse> genForshowReport() {
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
            f -> f.withMarshaller(ShowReportRequest::getTaskRunId, (req, v) -> {
                req.setTaskRunId(v);
            }));
        builder.<Integer>withRequestField("case_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportRequest::getCaseRunId, (req, v) -> {
                req.setCaseRunId(v);
            }));
        builder.<Integer>withRequestField("brokens_limit_count",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportRequest::getBrokensLimitCount, (req, v) -> {
                req.setBrokensLimitCount(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForshowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForshowTask() {
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
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse> showTaskCaseAwChart =
        genForshowTaskCaseAwChart();

    private static HttpRequestDef<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse> genForshowTaskCaseAwChart() {
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
            f -> f.withMarshaller(ShowTaskCaseAwChartRequest::getTaskRunId, (req, v) -> {
                req.setTaskRunId(v);
            }));
        builder.<Integer>withRequestField("case_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskCaseAwChartRequest::getCaseRunId, (req, v) -> {
                req.setCaseRunId(v);
            }));
        builder.<String>withRequestField("detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskCaseAwChartRequest::getDetailId, (req, v) -> {
                req.setDetailId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskSetRequest, ShowTaskSetResponse> showTaskSet = genForshowTaskSet();

    private static HttpRequestDef<ShowTaskSetRequest, ShowTaskSetResponse> genForshowTaskSet() {
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
            f -> f.withMarshaller(ShowTaskSetRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskSetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskSetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTempRequest, ShowTempResponse> showTemp = genForshowTemp();

    private static HttpRequestDef<ShowTempRequest, ShowTempResponse> genForshowTemp() {
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
            f -> f.withMarshaller(ShowTempRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTempSetRequest, ShowTempSetResponse> showTempSet = genForshowTempSet();

    private static HttpRequestDef<ShowTempSetRequest, ShowTempSetResponse> genForshowTempSet() {
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
            f -> f.withMarshaller(ShowTempSetRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTempSetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTempSetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse> updateAgentHealthStatus =
        genForupdateAgentHealthStatus();

    private static HttpRequestDef<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse> genForupdateAgentHealthStatus() {
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
            f -> f.withMarshaller(UpdateAgentHealthStatusRequest::getAgentId, (req, v) -> {
                req.setAgentId(v);
            }));
        builder.<UpdateAgentHealthStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAgentHealthStatusRequestBody.class),
            f -> f.withMarshaller(UpdateAgentHealthStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCaseRequest, UpdateCaseResponse> updateCase = genForupdateCase();

    private static HttpRequestDef<UpdateCaseRequest, UpdateCaseResponse> genForupdateCase() {
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
            f -> f.withMarshaller(UpdateCaseRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<String>withRequestField("target",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCaseRequest::getTarget, (req, v) -> {
                req.setTarget(v);
            }));
        builder.<CaseInfoDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CaseInfoDetail.class),
            f -> f.withMarshaller(UpdateCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectory =
        genForupdateDirectory();

    private static HttpRequestDef<UpdateDirectoryRequest, UpdateDirectoryResponse> genForupdateDirectory() {
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
            f -> f.withMarshaller(UpdateDirectoryRequest::getDirectoryId, (req, v) -> {
                req.setDirectoryId(v);
            }));
        builder.<Integer>withRequestField("test_suite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateDirectoryRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<UpdateDirectoryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDirectoryRequestBody.class),
            f -> f.withMarshaller(UpdateDirectoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNewCaseRequest, UpdateNewCaseResponse> updateNewCase =
        genForupdateNewCase();

    private static HttpRequestDef<UpdateNewCaseRequest, UpdateNewCaseResponse> genForupdateNewCase() {
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
            f -> f.withMarshaller(UpdateNewCaseRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<CaseInfoDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CaseInfoDetail.class),
            f -> f.withMarshaller(UpdateNewCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForupdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForupdateTask() {
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
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTaskRequestBody.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse> updateTaskRelatedTestCase =
        genForupdateTaskRelatedTestCase();

    private static HttpRequestDef<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse> genForupdateTaskRelatedTestCase() {
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
            f -> f.withMarshaller(UpdateTaskRelatedTestCaseRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateNewTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNewTaskRequestBody.class),
            f -> f.withMarshaller(UpdateTaskRelatedTestCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatus =
        genForupdateTaskStatus();

    private static HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> genForupdateTaskStatus() {
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
            f -> f.withMarshaller(UpdateTaskStatusRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateTaskStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTaskStatusRequestBody.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTempRequest, UpdateTempResponse> updateTemp = genForupdateTemp();

    private static HttpRequestDef<UpdateTempRequest, UpdateTempResponse> genForupdateTemp() {
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
            f -> f.withMarshaller(UpdateTempRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<UpdateTempRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTempRequestBody.class),
            f -> f.withMarshaller(UpdateTempRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVariableRequest, UpdateVariableResponse> updateVariable =
        genForupdateVariable();

    private static HttpRequestDef<UpdateVariableRequest, UpdateVariableResponse> genForupdateVariable() {
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
            f -> f.withMarshaller(UpdateVariableRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<List<UpdateVariableRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateVariableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(UpdateVariableRequestBody.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRequest, CreateProjectResponse> createProject =
        genForcreateProject();

    private static HttpRequestDef<CreateProjectRequest, CreateProjectResponse> genForcreateProject() {
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
            f -> f.withMarshaller(CreateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> deleteProject =
        genFordeleteProject();

    private static HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> genFordeleteProject() {
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
            f -> f.withMarshaller(DeleteProjectRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectSetsRequest, ListProjectSetsResponse> listProjectSets =
        genForlistProjectSets();

    private static HttpRequestDef<ListProjectSetsRequest, ListProjectSetsResponse> genForlistProjectSets() {
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
            f -> f.withMarshaller(ListProjectSetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectSetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProcessRequest, ShowProcessResponse> showProcess = genForshowProcess();

    private static HttpRequestDef<ShowProcessRequest, ShowProcessResponse> genForshowProcess() {
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

    public static final HttpRequestDef<ShowProjectRequest, ShowProjectResponse> showProject = genForshowProject();

    private static HttpRequestDef<ShowProjectRequest, ShowProjectResponse> genForshowProject() {
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
            f -> f.withMarshaller(ShowProjectRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> updateProject =
        genForupdateProject();

    private static HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> genForupdateProject() {
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
            f -> f.withMarshaller(UpdateProjectRequest::getTestSuiteId, (req, v) -> {
                req.setTestSuiteId(v);
            }));
        builder.<UpdateProjectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectRequestBody.class),
            f -> f.withMarshaller(UpdateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
