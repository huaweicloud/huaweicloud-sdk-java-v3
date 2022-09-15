package com.huaweicloud.sdk.cpts.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cpts.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class CptsMeta {

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
        builder.<UpdateCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCaseRequestBody.class),
            f -> f.withMarshaller(UpdateCaseRequest::getBody, (req, v) -> {
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
