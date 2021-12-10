package com.huaweicloud.sdk.codecheck.v2;

import com.huaweicloud.sdk.codecheck.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeCheckMeta {

    public static final HttpRequestDef<CreateRulesetRequest, CreateRulesetResponse> createRuleset =
        genForcreateRuleset();

    private static HttpRequestDef<CreateRulesetRequest, CreateRulesetResponse> genForcreateRuleset() {
        // basic
        HttpRequestDef.Builder<CreateRulesetRequest, CreateRulesetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRulesetRequest.class, CreateRulesetResponse.class)
                .withName("CreateRuleset")
                .withUri("/v2/ruleset")
                .withContentType("application/json");

        // requests
        builder.<Ruleset>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Ruleset.class),
            f -> f.withMarshaller(CreateRulesetRequest::getBody, (req, v) -> {
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
                .withUri("/v2/{project_id}/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateTaskRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTaskRequestV2.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v2/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForlistRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForlistRules() {
        // basic
        HttpRequestDef.Builder<ListRulesRequest, ListRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRulesRequest.class, ListRulesResponse.class)
                .withName("ListRules")
                .withUri("/v2/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_languages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getRuleLanguages, (req, v) -> {
                req.setRuleLanguages(v);
            }));
        builder.<String>withRequestField("rule_severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getRuleSeverity, (req, v) -> {
                req.setRuleSeverity(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesetsRequest, ListRulesetsResponse> listRulesets = genForlistRulesets();

    private static HttpRequestDef<ListRulesetsRequest, ListRulesetsResponse> genForlistRulesets() {
        // basic
        HttpRequestDef.Builder<ListRulesetsRequest, ListRulesetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRulesetsRequest.class, ListRulesetsResponse.class)
                .withName("ListRulesets")
                .withUri("/v2/{project_id}/rulesets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesetsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesetsRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskRulesetRequest, ListTaskRulesetResponse> listTaskRuleset =
        genForlistTaskRuleset();

    private static HttpRequestDef<ListTaskRulesetRequest, ListTaskRulesetResponse> genForlistTaskRuleset() {
        // basic
        HttpRequestDef.Builder<ListTaskRulesetRequest, ListTaskRulesetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTaskRulesetRequest.class, ListTaskRulesetResponse.class)
                .withName("ListTaskRuleset")
                .withUri("/v2/{project_id}/tasks/{task_id}/rulesets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskRulesetRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskRulesetRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<List<ListTaskRulesetRes>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTaskRulesetResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ListTaskRulesetRes.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateRulesRequest, ListTemplateRulesResponse> listTemplateRules =
        genForlistTemplateRules();

    private static HttpRequestDef<ListTemplateRulesRequest, ListTemplateRulesResponse> genForlistTemplateRules() {
        // basic
        HttpRequestDef.Builder<ListTemplateRulesRequest, ListTemplateRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateRulesRequest.class, ListTemplateRulesResponse.class)
                .withName("ListTemplateRules")
                .withUri("/v2/{project_id}/ruleset/{ruleset_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("ruleset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getRulesetId, (req, v) -> {
                req.setRulesetId(v);
            }));
        builder.<String>withRequestField("types",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getTypes, (req, v) -> {
                req.setTypes(v);
            }));
        builder.<String>withRequestField("languages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getLanguages, (req, v) -> {
                req.setLanguages(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTaskRequest, RunTaskResponse> runTask = genForrunTask();

    private static HttpRequestDef<RunTaskRequest, RunTaskResponse> genForrunTask() {
        // basic
        HttpRequestDef.Builder<RunTaskRequest, RunTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTaskRequest.class, RunTaskResponse.class)
                .withName("RunTask")
                .withUri("/v2/tasks/{task_id}/run")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<RunRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunRequestV2.class),
            f -> f.withMarshaller(RunTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetail =
        genForshowProgressDetail();

    private static HttpRequestDef<ShowProgressDetailRequest, ShowProgressDetailResponse> genForshowProgressDetail() {
        // basic
        HttpRequestDef.Builder<ShowProgressDetailRequest, ShowProgressDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgressDetailRequest.class, ShowProgressDetailResponse.class)
                .withName("ShowProgressDetail")
                .withUri("/v2/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> showTaskCmetrics =
        genForshowTaskCmetrics();

    private static HttpRequestDef<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> genForshowTaskCmetrics() {
        // basic
        HttpRequestDef.Builder<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskCmetricsRequest.class, ShowTaskCmetricsResponse.class)
                .withName("ShowTaskCmetrics")
                .withUri("/v2/{project_id}/tasks/{task_id}/metrics-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskCmetricsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskCmetricsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefects =
        genForshowTaskDefects();

    private static HttpRequestDef<ShowTaskDefectsRequest, ShowTaskDefectsResponse> genForshowTaskDefects() {
        // basic
        HttpRequestDef.Builder<ShowTaskDefectsRequest, ShowTaskDefectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDefectsRequest.class, ShowTaskDefectsResponse.class)
                .withName("ShowTaskDefects")
                .withUri("/v2/tasks/{task_id}/defects-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("status_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getStatusIds, (req, v) -> {
                req.setStatusIds(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatistic =
        genForshowTaskDefectsStatistic();

    private static HttpRequestDef<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> genForshowTaskDefectsStatistic() {
        // basic
        HttpRequestDef.Builder<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowTaskDefectsStatisticRequest.class, ShowTaskDefectsStatisticResponse.class)
                .withName("ShowTaskDefectsStatistic")
                .withUri("/v2/tasks/{task_id}/defects-statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsStatisticRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetail =
        genForshowTaskDetail();

    private static HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> genForshowTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowTaskDetailRequest, ShowTaskDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDetailRequest.class, ShowTaskDetailResponse.class)
                .withName("ShowTaskDetail")
                .withUri("/v2/tasks/{task_id}/defects-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectId =
        genForshowTaskListByProjectId();

    private static HttpRequestDef<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> genForshowTaskListByProjectId() {
        // basic
        HttpRequestDef.Builder<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskListByProjectIdRequest.class, ShowTaskListByProjectIdResponse.class)
            .withName("ShowTaskListByProjectId")
            .withUri("/v2/{project_id}/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskById = genForstopTaskById();

    private static HttpRequestDef<StopTaskByIdRequest, StopTaskByIdResponse> genForstopTaskById() {
        // basic
        HttpRequestDef.Builder<StopTaskByIdRequest, StopTaskByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskByIdRequest.class, StopTaskByIdResponse.class)
                .withName("StopTaskById")
                .withUri("/v2/tasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopTaskByIdRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatus =
        genForupdateDefectStatus();

    private static HttpRequestDef<UpdateDefectStatusRequest, UpdateDefectStatusResponse> genForupdateDefectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateDefectStatusRequest, UpdateDefectStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDefectStatusRequest.class, UpdateDefectStatusResponse.class)
                .withName("UpdateDefectStatus")
                .withUri("/v2/tasks/{task_id}/defect-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDefectStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateDefectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDefectRequestBody.class),
            f -> f.withMarshaller(UpdateDefectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> updateTaskRuleset =
        genForupdateTaskRuleset();

    private static HttpRequestDef<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> genForupdateTaskRuleset() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskRulesetRequest.class, UpdateTaskRulesetResponse.class)
                .withName("UpdateTaskRuleset")
                .withUri("/v2/tasks/{task_id}/ruleset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRulesetRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<List<UpdateTaskRulesetItem>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateTaskRulesetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(UpdateTaskRulesetItem.class));

        // response

        return builder.build();
    }

}
