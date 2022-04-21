package com.huaweicloud.sdk.clouddeploy.v2;

import com.huaweicloud.sdk.clouddeploy.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CloudDeployMeta {

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
            FieldExistence.NULL_IGNORE,
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
            FieldExistence.NULL_IGNORE,
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
