package com.huaweicloud.sdk.codeartscheck.v2;

import com.huaweicloud.sdk.codeartscheck.v2.model.CheckParametersRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckParametersResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckRecordRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckRecordResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckRulesetParametersRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckRulesetParametersResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ConfigTaskParameterBody;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateRulesetRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateRulesetResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateTaskRequestV2;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.DeleteRulesetRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.DeleteRulesetResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListRulesRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListRulesResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListRulesetsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListRulesetsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTaskParameterRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTaskParameterResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTaskRulesetRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTaskRulesetResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTemplateRulesRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTemplateRulesResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.Ruleset;
import com.huaweicloud.sdk.codeartscheck.v2.model.RunRequestV2;
import com.huaweicloud.sdk.codeartscheck.v2.model.RunTaskRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.RunTaskResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.SetDefaulTemplateRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.SetDefaulTemplateResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowProgressDetailRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowProgressDetailResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskCmetricsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskCmetricsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDefectsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDefectsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDefectsStatisticRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDefectsStatisticResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDetailRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDetailResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskListByProjectIdRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskListByProjectIdResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskPathTreeRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskPathTreeResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskSettingsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskSettingsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTasklogRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTasklogResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTasksRulesetsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTasksRulesetsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.StopTaskByIdRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.StopTaskByIdResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.TaskCheckParamters;
import com.huaweicloud.sdk.codeartscheck.v2.model.TaskRulesetInfo;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateDefectRequestBody;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateDefectStatusRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateDefectStatusResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateIgnorePathRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateIgnorePathRequestBody;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateIgnorePathResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskRulesetItem;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskRulesetRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskRulesetResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskSettingsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskSettingsRequestBody;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskSettingsResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeArtsCheckMeta {

    public static final HttpRequestDef<CheckParametersRequest, CheckParametersResponse> checkParameters =
        genForCheckParameters();

    private static HttpRequestDef<CheckParametersRequest, CheckParametersResponse> genForCheckParameters() {
        // basic
        HttpRequestDef.Builder<CheckParametersRequest, CheckParametersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckParametersRequest.class, CheckParametersResponse.class)
                .withName("CheckParameters")
                .withUri("/v2/{project_id}/tasks/{task_id}/ruleset/{ruleset_id}/check-parameters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckParametersRequest::getProjectId, CheckParametersRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckParametersRequest::getTaskId, CheckParametersRequest::setTaskId));
        builder.<String>withRequestField("ruleset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckParametersRequest::getRulesetId, CheckParametersRequest::setRulesetId));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckParametersRequest::getLanguage, CheckParametersRequest::setLanguage));

        // response
        builder.<List<TaskCheckParamters>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CheckParametersResponse::getBody, CheckParametersResponse::setBody)
                .withInnerContainerType(TaskCheckParamters.class));

        return builder.build();
    }

    public static final HttpRequestDef<CheckRecordRequest, CheckRecordResponse> checkRecord = genForCheckRecord();

    private static HttpRequestDef<CheckRecordRequest, CheckRecordResponse> genForCheckRecord() {
        // basic
        HttpRequestDef.Builder<CheckRecordRequest, CheckRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckRecordRequest.class, CheckRecordResponse.class)
                .withName("CheckRecord")
                .withUri("/v2/{project_id}/tasks/{task_id}/checkrecord")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRecordRequest::getProjectId, CheckRecordRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRecordRequest::getTaskId, CheckRecordRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckRecordRequest::getOffset, CheckRecordRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckRecordRequest::getLimit, CheckRecordRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRecordRequest::getStartTime, CheckRecordRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRecordRequest::getEndTime, CheckRecordRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckRulesetParametersRequest, CheckRulesetParametersResponse> checkRulesetParameters =
        genForCheckRulesetParameters();

    private static HttpRequestDef<CheckRulesetParametersRequest, CheckRulesetParametersResponse> genForCheckRulesetParameters() {
        // basic
        HttpRequestDef.Builder<CheckRulesetParametersRequest, CheckRulesetParametersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckRulesetParametersRequest.class, CheckRulesetParametersResponse.class)
            .withName("CheckRulesetParameters")
            .withUri("/v3/{project_id}/tasks/{task_id}/ruleset/{ruleset_id}/check-parameters")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRulesetParametersRequest::getProjectId,
                CheckRulesetParametersRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRulesetParametersRequest::getTaskId, CheckRulesetParametersRequest::setTaskId));
        builder.<String>withRequestField("ruleset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRulesetParametersRequest::getRulesetId,
                CheckRulesetParametersRequest::setRulesetId));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRulesetParametersRequest::getLanguage,
                CheckRulesetParametersRequest::setLanguage));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckRulesetParametersRequest::getOffset, CheckRulesetParametersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckRulesetParametersRequest::getLimit, CheckRulesetParametersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRulesetRequest, CreateRulesetResponse> createRuleset =
        genForCreateRuleset();

    private static HttpRequestDef<CreateRulesetRequest, CreateRulesetResponse> genForCreateRuleset() {
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
            f -> f.withMarshaller(CreateRulesetRequest::getBody, CreateRulesetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
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
            f -> f.withMarshaller(CreateTaskRequest::getProjectId, CreateTaskRequest::setProjectId));
        builder.<CreateTaskRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTaskRequestV2.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRulesetRequest, DeleteRulesetResponse> deleteRuleset =
        genForDeleteRuleset();

    private static HttpRequestDef<DeleteRulesetRequest, DeleteRulesetResponse> genForDeleteRuleset() {
        // basic
        HttpRequestDef.Builder<DeleteRulesetRequest, DeleteRulesetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRulesetRequest.class, DeleteRulesetResponse.class)
                .withName("DeleteRuleset")
                .withUri("/v2/{project_id}/ruleset/{ruleset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRulesetRequest::getProjectId, DeleteRulesetRequest::setProjectId));
        builder.<String>withRequestField("ruleset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRulesetRequest::getRulesetId, DeleteRulesetRequest::setRulesetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
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
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForListRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForListRules() {
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
            f -> f.withMarshaller(ListRulesRequest::getRuleLanguages, ListRulesRequest::setRuleLanguages));
        builder.<String>withRequestField("rule_severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getRuleSeverity, ListRulesRequest::setRuleSeverity));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getOffset, ListRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getLimit, ListRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesetsRequest, ListRulesetsResponse> listRulesets = genForListRulesets();

    private static HttpRequestDef<ListRulesetsRequest, ListRulesetsResponse> genForListRulesets() {
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
            f -> f.withMarshaller(ListRulesetsRequest::getProjectId, ListRulesetsRequest::setProjectId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesetsRequest::getCategory, ListRulesetsRequest::setCategory));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesetsRequest::getOffset, ListRulesetsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesetsRequest::getLimit, ListRulesetsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskParameterRequest, ListTaskParameterResponse> listTaskParameter =
        genForListTaskParameter();

    private static HttpRequestDef<ListTaskParameterRequest, ListTaskParameterResponse> genForListTaskParameter() {
        // basic
        HttpRequestDef.Builder<ListTaskParameterRequest, ListTaskParameterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTaskParameterRequest.class, ListTaskParameterResponse.class)
                .withName("ListTaskParameter")
                .withUri("/v2/{project_id}/tasks/{task_id}/config-parameters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskParameterRequest::getProjectId, ListTaskParameterRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskParameterRequest::getTaskId, ListTaskParameterRequest::setTaskId));
        builder.<ConfigTaskParameterBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigTaskParameterBody.class),
            f -> f.withMarshaller(ListTaskParameterRequest::getBody, ListTaskParameterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskRulesetRequest, ListTaskRulesetResponse> listTaskRuleset =
        genForListTaskRuleset();

    private static HttpRequestDef<ListTaskRulesetRequest, ListTaskRulesetResponse> genForListTaskRuleset() {
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
            f -> f.withMarshaller(ListTaskRulesetRequest::getProjectId, ListTaskRulesetRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskRulesetRequest::getTaskId, ListTaskRulesetRequest::setTaskId));

        // response
        builder.<List<TaskRulesetInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTaskRulesetResponse::getBody, ListTaskRulesetResponse::setBody)
                .withInnerContainerType(TaskRulesetInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateRulesRequest, ListTemplateRulesResponse> listTemplateRules =
        genForListTemplateRules();

    private static HttpRequestDef<ListTemplateRulesRequest, ListTemplateRulesResponse> genForListTemplateRules() {
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
            f -> f.withMarshaller(ListTemplateRulesRequest::getProjectId, ListTemplateRulesRequest::setProjectId));
        builder.<String>withRequestField("ruleset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getRulesetId, ListTemplateRulesRequest::setRulesetId));
        builder.<String>withRequestField("types",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getTypes, ListTemplateRulesRequest::setTypes));
        builder.<String>withRequestField("languages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getLanguages, ListTemplateRulesRequest::setLanguages));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getTags, ListTemplateRulesRequest::setTags));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getOffset, ListTemplateRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateRulesRequest::getLimit, ListTemplateRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTaskRequest, RunTaskResponse> runTask = genForRunTask();

    private static HttpRequestDef<RunTaskRequest, RunTaskResponse> genForRunTask() {
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
            f -> f.withMarshaller(RunTaskRequest::getTaskId, RunTaskRequest::setTaskId));
        builder.<RunRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunRequestV2.class),
            f -> f.withMarshaller(RunTaskRequest::getBody, RunTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDefaulTemplateRequest, SetDefaulTemplateResponse> setDefaulTemplate =
        genForSetDefaulTemplate();

    private static HttpRequestDef<SetDefaulTemplateRequest, SetDefaulTemplateResponse> genForSetDefaulTemplate() {
        // basic
        HttpRequestDef.Builder<SetDefaulTemplateRequest, SetDefaulTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetDefaulTemplateRequest.class, SetDefaulTemplateResponse.class)
                .withName("SetDefaulTemplate")
                .withUri("/v2/{project_id}/ruleset/{ruleset_id}/{language}/default")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDefaulTemplateRequest::getProjectId, SetDefaulTemplateRequest::setProjectId));
        builder.<String>withRequestField("ruleset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDefaulTemplateRequest::getRulesetId, SetDefaulTemplateRequest::setRulesetId));
        builder.<String>withRequestField("language",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDefaulTemplateRequest::getLanguage, SetDefaulTemplateRequest::setLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetail =
        genForShowProgressDetail();

    private static HttpRequestDef<ShowProgressDetailRequest, ShowProgressDetailResponse> genForShowProgressDetail() {
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
            f -> f.withMarshaller(ShowProgressDetailRequest::getTaskId, ShowProgressDetailRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> showTaskCmetrics =
        genForShowTaskCmetrics();

    private static HttpRequestDef<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> genForShowTaskCmetrics() {
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
            f -> f.withMarshaller(ShowTaskCmetricsRequest::getProjectId, ShowTaskCmetricsRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskCmetricsRequest::getTaskId, ShowTaskCmetricsRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefects =
        genForShowTaskDefects();

    private static HttpRequestDef<ShowTaskDefectsRequest, ShowTaskDefectsResponse> genForShowTaskDefects() {
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
            f -> f.withMarshaller(ShowTaskDefectsRequest::getTaskId, ShowTaskDefectsRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getOffset, ShowTaskDefectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getLimit, ShowTaskDefectsRequest::setLimit));
        builder.<String>withRequestField("status_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getStatusIds, ShowTaskDefectsRequest::setStatusIds));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getSeverity, ShowTaskDefectsRequest::setSeverity));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatistic =
        genForShowTaskDefectsStatistic();

    private static HttpRequestDef<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> genForShowTaskDefectsStatistic() {
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
            f -> f.withMarshaller(ShowTaskDefectsStatisticRequest::getTaskId,
                ShowTaskDefectsStatisticRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetail =
        genForShowTaskDetail();

    private static HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> genForShowTaskDetail() {
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
            f -> f.withMarshaller(ShowTaskDetailRequest::getTaskId, ShowTaskDetailRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectId =
        genForShowTaskListByProjectId();

    private static HttpRequestDef<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> genForShowTaskListByProjectId() {
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
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getProjectId,
                ShowTaskListByProjectIdRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getOffset,
                ShowTaskListByProjectIdRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getLimit, ShowTaskListByProjectIdRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskPathTreeRequest, ShowTaskPathTreeResponse> showTaskPathTree =
        genForShowTaskPathTree();

    private static HttpRequestDef<ShowTaskPathTreeRequest, ShowTaskPathTreeResponse> genForShowTaskPathTree() {
        // basic
        HttpRequestDef.Builder<ShowTaskPathTreeRequest, ShowTaskPathTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskPathTreeRequest.class, ShowTaskPathTreeResponse.class)
                .withName("ShowTaskPathTree")
                .withUri("/v2/{project_id}/tasks/{task_id}/listpathtree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskPathTreeRequest::getProjectId, ShowTaskPathTreeRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskPathTreeRequest::getTaskId, ShowTaskPathTreeRequest::setTaskId));
        builder.<String>withRequestField("current_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskPathTreeRequest::getCurrentPath, ShowTaskPathTreeRequest::setCurrentPath));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskPathTreeRequest::getOffset, ShowTaskPathTreeRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskPathTreeRequest::getLimit, ShowTaskPathTreeRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskSettingsRequest, ShowTaskSettingsResponse> showTaskSettings =
        genForShowTaskSettings();

    private static HttpRequestDef<ShowTaskSettingsRequest, ShowTaskSettingsResponse> genForShowTaskSettings() {
        // basic
        HttpRequestDef.Builder<ShowTaskSettingsRequest, ShowTaskSettingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskSettingsRequest.class, ShowTaskSettingsResponse.class)
                .withName("ShowTaskSettings")
                .withUri("/v2/{project_id}/tasks/{task_id}/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskSettingsRequest::getProjectId, ShowTaskSettingsRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskSettingsRequest::getTaskId, ShowTaskSettingsRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskSettingsRequest::getOffset, ShowTaskSettingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskSettingsRequest::getLimit, ShowTaskSettingsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTasklogRequest, ShowTasklogResponse> showTasklog = genForShowTasklog();

    private static HttpRequestDef<ShowTasklogRequest, ShowTasklogResponse> genForShowTasklog() {
        // basic
        HttpRequestDef.Builder<ShowTasklogRequest, ShowTasklogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTasklogRequest.class, ShowTasklogResponse.class)
                .withName("ShowTasklog")
                .withUri("/v2/{project_id}/tasks/{task_id}/log-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTasklogRequest::getProjectId, ShowTasklogRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTasklogRequest::getTaskId, ShowTasklogRequest::setTaskId));
        builder.<String>withRequestField("execute_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTasklogRequest::getExecuteId, ShowTasklogRequest::setExecuteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTasksRulesetsRequest, ShowTasksRulesetsResponse> showTasksRulesets =
        genForShowTasksRulesets();

    private static HttpRequestDef<ShowTasksRulesetsRequest, ShowTasksRulesetsResponse> genForShowTasksRulesets() {
        // basic
        HttpRequestDef.Builder<ShowTasksRulesetsRequest, ShowTasksRulesetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTasksRulesetsRequest.class, ShowTasksRulesetsResponse.class)
                .withName("ShowTasksRulesets")
                .withUri("/v3/{project_id}/tasks/{task_id}/rulesets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTasksRulesetsRequest::getProjectId, ShowTasksRulesetsRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTasksRulesetsRequest::getTaskId, ShowTasksRulesetsRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTasksRulesetsRequest::getOffset, ShowTasksRulesetsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTasksRulesetsRequest::getLimit, ShowTasksRulesetsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskById = genForStopTaskById();

    private static HttpRequestDef<StopTaskByIdRequest, StopTaskByIdResponse> genForStopTaskById() {
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
            f -> f.withMarshaller(StopTaskByIdRequest::getTaskId, StopTaskByIdRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatus =
        genForUpdateDefectStatus();

    private static HttpRequestDef<UpdateDefectStatusRequest, UpdateDefectStatusResponse> genForUpdateDefectStatus() {
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
            f -> f.withMarshaller(UpdateDefectStatusRequest::getTaskId, UpdateDefectStatusRequest::setTaskId));
        builder.<UpdateDefectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDefectRequestBody.class),
            f -> f.withMarshaller(UpdateDefectStatusRequest::getBody, UpdateDefectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIgnorePathRequest, UpdateIgnorePathResponse> updateIgnorePath =
        genForUpdateIgnorePath();

    private static HttpRequestDef<UpdateIgnorePathRequest, UpdateIgnorePathResponse> genForUpdateIgnorePath() {
        // basic
        HttpRequestDef.Builder<UpdateIgnorePathRequest, UpdateIgnorePathResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateIgnorePathRequest.class, UpdateIgnorePathResponse.class)
                .withName("UpdateIgnorePath")
                .withUri("/v2/{project_id}/tasks/{task_id}/config-ignorepath")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnorePathRequest::getProjectId, UpdateIgnorePathRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnorePathRequest::getTaskId, UpdateIgnorePathRequest::setTaskId));
        builder.<UpdateIgnorePathRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIgnorePathRequestBody.class),
            f -> f.withMarshaller(UpdateIgnorePathRequest::getBody, UpdateIgnorePathRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> updateTaskRuleset =
        genForUpdateTaskRuleset();

    private static HttpRequestDef<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> genForUpdateTaskRuleset() {
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
            f -> f.withMarshaller(UpdateTaskRulesetRequest::getTaskId, UpdateTaskRulesetRequest::setTaskId));
        builder.<List<UpdateTaskRulesetItem>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateTaskRulesetRequest::getBody, UpdateTaskRulesetRequest::setBody)
                .withInnerContainerType(UpdateTaskRulesetItem.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskSettingsRequest, UpdateTaskSettingsResponse> updateTaskSettings =
        genForUpdateTaskSettings();

    private static HttpRequestDef<UpdateTaskSettingsRequest, UpdateTaskSettingsResponse> genForUpdateTaskSettings() {
        // basic
        HttpRequestDef.Builder<UpdateTaskSettingsRequest, UpdateTaskSettingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTaskSettingsRequest.class, UpdateTaskSettingsResponse.class)
                .withName("UpdateTaskSettings")
                .withUri("/v2/{project_id}/tasks/{task_id}/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskSettingsRequest::getProjectId, UpdateTaskSettingsRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskSettingsRequest::getTaskId, UpdateTaskSettingsRequest::setTaskId));
        builder.<UpdateTaskSettingsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTaskSettingsRequestBody.class),
            f -> f.withMarshaller(UpdateTaskSettingsRequest::getBody, UpdateTaskSettingsRequest::setBody));

        // response

        return builder.build();
    }

}
