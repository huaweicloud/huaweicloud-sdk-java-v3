package com.huaweicloud.sdk.clouddeploy.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.clouddeploy.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CloudDeployMeta {

    public static final HttpRequestDef<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplate = genForcreateDeployTaskByTemplate();

    private static HttpRequestDef<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> genForcreateDeployTaskByTemplate() {
        // basic
        HttpRequestDef.Builder<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeployTaskByTemplateRequest.class, CreateDeployTaskByTemplateResponse.class)
                .withName("CreateDeployTaskByTemplate")
                .withUri("/v2/tasks/template-task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TemplateTaskRequestBody.class,
            f -> f.withMarshaller(CreateDeployTaskByTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTask = genFordeleteDeployTask();

    private static HttpRequestDef<DeleteDeployTaskRequest, DeleteDeployTaskResponse> genFordeleteDeployTask() {
        // basic
        HttpRequestDef.Builder<DeleteDeployTaskRequest, DeleteDeployTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeployTaskRequest.class, DeleteDeployTaskResponse.class)
                .withName("DeleteDeployTask")
                .withUri("/v2/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeployTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetail = genForshowDeployTaskDetail();

    private static HttpRequestDef<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> genForshowDeployTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeployTaskDetailRequest.class, ShowDeployTaskDetailResponse.class)
                .withName("ShowDeployTaskDetail")
                .withUri("/v2/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeployTaskDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTask = genForstartDeployTask();

    private static HttpRequestDef<StartDeployTaskRequest, StartDeployTaskResponse> genForstartDeployTask() {
        // basic
        HttpRequestDef.Builder<StartDeployTaskRequest, StartDeployTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartDeployTaskRequest.class, StartDeployTaskResponse.class)
                .withName("StartDeployTask")
                .withUri("/v2/tasks/{task_id}/start")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartDeployTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnvExecutionBody.class,
            f -> f.withMarshaller(StartDeployTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHost = genForcreateDeploymentHost();

    private static HttpRequestDef<CreateDeploymentHostRequest, CreateDeploymentHostResponse> genForcreateDeploymentHost() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentHostRequest, CreateDeploymentHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeploymentHostRequest.class, CreateDeploymentHostResponse.class)
                .withName("CreateDeploymentHost")
                .withUri("/v2/host-groups/{group_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDeploymentHostRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeploymentHost.class,
            f -> f.withMarshaller(CreateDeploymentHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHost = genFordeleteDeploymentHost();

    private static HttpRequestDef<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> genFordeleteDeploymentHost() {
        // basic
        HttpRequestDef.Builder<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeploymentHostRequest.class, DeleteDeploymentHostResponse.class)
                .withName("DeleteDeploymentHost")
                .withUri("/v2/host-groups/{group_id}/hosts/{host_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeploymentHostRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeploymentHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            })
        );

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
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("as_proxy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListHostsRequest::getAsProxy, (req, v) -> {
                req.setAsProxy(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHostsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHostsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListHostsRequest.SortDirEnum.class,
            f -> f.withMarshaller(ListHostsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );
        builder.withRequestField("with_auth",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListHostsRequest::getWithAuth, (req, v) -> {
                req.setWithAuth(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetail = genForshowDeploymentHostDetail();

    private static HttpRequestDef<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> genForshowDeploymentHostDetail() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeploymentHostDetailRequest.class, ShowDeploymentHostDetailResponse.class)
                .withName("ShowDeploymentHostDetail")
                .withUri("/v2/host-groups/{group_id}/hosts/{host_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeploymentHostDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeploymentHostDetailRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHost = genForupdateDeploymentHost();

    private static HttpRequestDef<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> genForupdateDeploymentHost() {
        // basic
        HttpRequestDef.Builder<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeploymentHostRequest.class, UpdateDeploymentHostResponse.class)
                .withName("UpdateDeploymentHost")
                .withUri("/v2/host-groups/{group_id}/hosts/{host_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeploymentHostRequest.class,
            f -> f.withMarshaller(UpdateDeploymentHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroup = genForcreateDeploymentGroup();

    private static HttpRequestDef<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> genForcreateDeploymentGroup() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeploymentGroupRequest.class, CreateDeploymentGroupResponse.class)
                .withName("CreateDeploymentGroup")
                .withUri("/v2/host-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeploymentGroup.class,
            f -> f.withMarshaller(CreateDeploymentGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroup = genFordeleteDeploymentGroup();

    private static HttpRequestDef<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> genFordeleteDeploymentGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeploymentGroupRequest.class, DeleteDeploymentGroupResponse.class)
                .withName("DeleteDeploymentGroup")
                .withUri("/v2/host-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeploymentGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroups = genForlistHostGroups();

    private static HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> genForlistHostGroups() {
        // basic
        HttpRequestDef.Builder<ListHostGroupsRequest, ListHostGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostGroupsRequest.class, ListHostGroupsResponse.class)
                .withName("ListHostGroups")
                .withUri("/v2/host-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostGroupsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("region_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListHostGroupsRequest::getRegionName, (req, v) -> {
                req.setRegionName(v);
            })
        );
        builder.withRequestField("os",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListHostGroupsRequest.OsEnum.class,
            f -> f.withMarshaller(ListHostGroupsRequest::getOs, (req, v) -> {
                req.setOs(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHostGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHostGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostGroupsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListHostGroupsRequest.SortDirEnum.class,
            f -> f.withMarshaller(ListHostGroupsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetail = genForshowDeploymentGroupDetail();

    private static HttpRequestDef<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> genForshowDeploymentGroupDetail() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeploymentGroupDetailRequest.class, ShowDeploymentGroupDetailResponse.class)
                .withName("ShowDeploymentGroupDetail")
                .withUri("/v2/host-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeploymentGroupDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroup = genForupdateDeploymentGroup();

    private static HttpRequestDef<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> genForupdateDeploymentGroup() {
        // basic
        HttpRequestDef.Builder<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeploymentGroupRequest.class, UpdateDeploymentGroupResponse.class)
                .withName("UpdateDeploymentGroup")
                .withUri("/v2/host-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeploymentGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeploymentGroupUpdateRequest.class,
            f -> f.withMarshaller(UpdateDeploymentGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
