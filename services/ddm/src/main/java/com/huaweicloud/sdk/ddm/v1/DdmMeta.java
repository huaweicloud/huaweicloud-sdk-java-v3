package com.huaweicloud.sdk.ddm.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ddm.v1.model.AdminUserInfoReq;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseReq;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupRequestBody;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceReq;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersReq;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.ddm.v1.model.EnlargeRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillLogicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillLogicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillPhysicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillPhysicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExpandInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExpandInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.KillProcessesOpenRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsListRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsListResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListEnginesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListEnginesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListReadWriteRatioRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListReadWriteRatioResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.ddm.v1.model.ModifyInstanceNameReq;
import com.huaweicloud.sdk.ddm.v1.model.ModifyInstanceSecurityGroupReq;
import com.huaweicloud.sdk.ddm.v1.model.ModifyReadAndWriteStrategyReq;
import com.huaweicloud.sdk.ddm.v1.model.RebuildConfigRequest;
import com.huaweicloud.sdk.ddm.v1.model.RebuildConfigResponse;
import com.huaweicloud.sdk.ddm.v1.model.ReduceRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResetAdministratorRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResetAdministratorResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResetUserPasswordReq;
import com.huaweicloud.sdk.ddm.v1.model.ResetUserPasswordRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResetUserPasswordResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResizeFlavorReq;
import com.huaweicloud.sdk.ddm.v1.model.ResizeFlavorRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResizeFlavorResponse;
import com.huaweicloud.sdk.ddm.v1.model.RestartInstanceReq;
import com.huaweicloud.sdk.ddm.v1.model.RestartInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.RestartInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceParamRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceParamResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowLogicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowLogicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowNodeRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowNodeResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowPhysicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowPhysicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowProcessesAuditLogRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowProcessesAuditLogResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShrinkInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShrinkInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateDatabaseInfoRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateDatabaseInfoResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceParamRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceParamResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateParametersReq;
import com.huaweicloud.sdk.ddm.v1.model.UpdateReadAndWriteStrategyRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateReadAndWriteStrategyResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserReq;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.ddm.v1.model.ValidateWeakPasswordRequest;
import com.huaweicloud.sdk.ddm.v1.model.ValidateWeakPasswordResponse;
import com.huaweicloud.sdk.ddm.v1.model.WeakPasswordReq;

@SuppressWarnings("unchecked")
public class DdmMeta {

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase =
        genForCreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForCreateDatabase() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseRequest, CreateDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseRequest.class, CreateDatabaseResponse.class)
                .withName("CreateDatabase")
                .withUri("/v1/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getInstanceId, CreateDatabaseRequest::setInstanceId));
        builder.<CreateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseReq.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, CreateDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupRequest, CreateGroupResponse> createGroup = genForCreateGroup();

    private static HttpRequestDef<CreateGroupRequest, CreateGroupResponse> genForCreateGroup() {
        // basic
        HttpRequestDef.Builder<CreateGroupRequest, CreateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGroupRequest.class, CreateGroupResponse.class)
                .withName("CreateGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupRequest::getInstanceId, CreateGroupRequest::setInstanceId));
        builder.<CreateGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupRequestBody.class),
            f -> f.withMarshaller(CreateGroupRequest::getBody, CreateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceReq.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUsersRequest, CreateUsersResponse> createUsers = genForCreateUsers();

    private static HttpRequestDef<CreateUsersRequest, CreateUsersResponse> genForCreateUsers() {
        // basic
        HttpRequestDef.Builder<CreateUsersRequest, CreateUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUsersRequest.class, CreateUsersResponse.class)
                .withName("CreateUsers")
                .withUri("/v1/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsersRequest::getInstanceId, CreateUsersRequest::setInstanceId));
        builder.<CreateUsersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUsersReq.class),
            f -> f.withMarshaller(CreateUsersRequest::getBody, CreateUsersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase =
        genForDeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genForDeleteDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseRequest, DeleteDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseRequest.class, DeleteDatabaseResponse.class)
                .withName("DeleteDatabase")
                .withUri("/v1/{project_id}/instances/{instance_id}/databases/{ddm_dbname}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getInstanceId, DeleteDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("ddm_dbname",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDdmDbname, DeleteDatabaseRequest::setDdmDbname));
        builder.<DeleteDatabaseRequest.DeleteRdsDataEnum>withRequestField("delete_rds_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteDatabaseRequest.DeleteRdsDataEnum.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDeleteRdsData, DeleteDatabaseRequest::setDeleteRdsData));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDatabaseResponse::getBody, DeleteDatabaseResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v1/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));
        builder.<DeleteInstanceRequest.DeleteRdsDataEnum>withRequestField("delete_rds_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteInstanceRequest.DeleteRdsDataEnum.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getDeleteRdsData, DeleteInstanceRequest::setDeleteRdsData));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genForDeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genForDeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v1/{project_id}/instances/{instance_id}/users/{username}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getInstanceId, DeleteUserRequest::setInstanceId));
        builder.<String>withRequestField("username",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUsername, DeleteUserRequest::setUsername));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteKillLogicalProcessesRequest, ExecuteKillLogicalProcessesResponse> executeKillLogicalProcesses =
        genForExecuteKillLogicalProcesses();

    private static HttpRequestDef<ExecuteKillLogicalProcessesRequest, ExecuteKillLogicalProcessesResponse> genForExecuteKillLogicalProcesses() {
        // basic
        HttpRequestDef.Builder<ExecuteKillLogicalProcessesRequest, ExecuteKillLogicalProcessesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    ExecuteKillLogicalProcessesRequest.class,
                    ExecuteKillLogicalProcessesResponse.class)
                .withName("ExecuteKillLogicalProcesses")
                .withUri("/v3/{project_id}/instances/{instance_id}/logical-processes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteKillLogicalProcessesRequest::getInstanceId,
                ExecuteKillLogicalProcessesRequest::setInstanceId));
        builder.<KillProcessesOpenRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KillProcessesOpenRequest.class),
            f -> f.withMarshaller(ExecuteKillLogicalProcessesRequest::getBody,
                ExecuteKillLogicalProcessesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteKillPhysicalProcessesRequest, ExecuteKillPhysicalProcessesResponse> executeKillPhysicalProcesses =
        genForExecuteKillPhysicalProcesses();

    private static HttpRequestDef<ExecuteKillPhysicalProcessesRequest, ExecuteKillPhysicalProcessesResponse> genForExecuteKillPhysicalProcesses() {
        // basic
        HttpRequestDef.Builder<ExecuteKillPhysicalProcessesRequest, ExecuteKillPhysicalProcessesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    ExecuteKillPhysicalProcessesRequest.class,
                    ExecuteKillPhysicalProcessesResponse.class)
                .withName("ExecuteKillPhysicalProcesses")
                .withUri("/v3/{project_id}/instances/{instance_id}/physical-processes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteKillPhysicalProcessesRequest::getInstanceId,
                ExecuteKillPhysicalProcessesRequest::setInstanceId));
        builder.<KillProcessesOpenRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KillProcessesOpenRequest.class),
            f -> f.withMarshaller(ExecuteKillPhysicalProcessesRequest::getBody,
                ExecuteKillPhysicalProcessesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse> expandInstanceNodes =
        genForExpandInstanceNodes();

    private static HttpRequestDef<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse> genForExpandInstanceNodes() {
        // basic
        HttpRequestDef.Builder<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandInstanceNodesRequest.class, ExpandInstanceNodesResponse.class)
                .withName("ExpandInstanceNodes")
                .withUri("/v2/{project_id}/instances/{instance_id}/action/enlarge")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandInstanceNodesRequest::getInstanceId,
                ExpandInstanceNodesRequest::setInstanceId));
        builder.<EnlargeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeRequest.class),
            f -> f.withMarshaller(ExpandInstanceNodesRequest::getBody, ExpandInstanceNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableRdsListRequest, ListAvailableRdsListResponse> listAvailableRdsList =
        genForListAvailableRdsList();

    private static HttpRequestDef<ListAvailableRdsListRequest, ListAvailableRdsListResponse> genForListAvailableRdsList() {
        // basic
        HttpRequestDef.Builder<ListAvailableRdsListRequest, ListAvailableRdsListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailableRdsListRequest.class, ListAvailableRdsListResponse.class)
            .withName("ListAvailableRdsList")
            .withUri("/v1/{project_id}/instances/{instance_id}/rds")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableRdsListRequest::getInstanceId,
                ListAvailableRdsListRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableRdsListRequest::getOffset, ListAvailableRdsListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableRdsListRequest::getLimit, ListAvailableRdsListRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForListDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForListDatabases() {
        // basic
        HttpRequestDef.Builder<ListDatabasesRequest, ListDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabasesRequest.class, ListDatabasesResponse.class)
                .withName("ListDatabases")
                .withUri("/v1/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getInstanceId, ListDatabasesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getOffset, ListDatabasesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, ListDatabasesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnginesRequest, ListEnginesResponse> listEngines = genForListEngines();

    private static HttpRequestDef<ListEnginesRequest, ListEnginesResponse> genForListEngines() {
        // basic
        HttpRequestDef.Builder<ListEnginesRequest, ListEnginesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnginesRequest.class, ListEnginesResponse.class)
                .withName("ListEngines")
                .withUri("/v2/{project_id}/engines")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnginesRequest::getOffset, ListEnginesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnginesRequest::getLimit, ListEnginesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v2/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngineId, ListFlavorsRequest::setEngineId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getOffset, ListFlavorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, ListFlavorsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupRequest, ListGroupResponse> listGroup = genForListGroup();

    private static HttpRequestDef<ListGroupRequest, ListGroupResponse> genForListGroup() {
        // basic
        HttpRequestDef.Builder<ListGroupRequest, ListGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupRequest.class, ListGroupResponse.class)
                .withName("ListGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupRequest::getInstanceId, ListGroupRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupRequest::getOffset, ListGroupRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupRequest::getLimit, ListGroupRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v1/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodesRequest, ListNodesResponse> listNodes = genForListNodes();

    private static HttpRequestDef<ListNodesRequest, ListNodesResponse> genForListNodes() {
        // basic
        HttpRequestDef.Builder<ListNodesRequest, ListNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodesRequest.class, ListNodesResponse.class)
                .withName("ListNodes")
                .withUri("/v1/{project_id}/instances/{instance_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodesRequest::getInstanceId, ListNodesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodesRequest::getOffset, ListNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodesRequest::getLimit, ListNodesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReadWriteRatioRequest, ListReadWriteRatioResponse> listReadWriteRatio =
        genForListReadWriteRatio();

    private static HttpRequestDef<ListReadWriteRatioRequest, ListReadWriteRatioResponse> genForListReadWriteRatio() {
        // basic
        HttpRequestDef.Builder<ListReadWriteRatioRequest, ListReadWriteRatioResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReadWriteRatioRequest.class, ListReadWriteRatioResponse.class)
                .withName("ListReadWriteRatio")
                .withUri("/v2/{project_id}/instances/{instance_id}/read-write-ratio")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReadWriteRatioRequest::getInstanceId, ListReadWriteRatioRequest::setInstanceId));
        builder.<String>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReadWriteRatioRequest::getCurPage, ListReadWriteRatioRequest::setCurPage));
        builder.<String>withRequestField("perPage",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReadWriteRatioRequest::getPerPage, ListReadWriteRatioRequest::setPerPage));
        builder.<String>withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReadWriteRatioRequest::getStartDate, ListReadWriteRatioRequest::setStartDate));
        builder.<String>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReadWriteRatioRequest::getEndDate, ListReadWriteRatioRequest::setEndDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogRequest, ListSlowLogResponse> listSlowLog = genForListSlowLog();

    private static HttpRequestDef<ListSlowLogRequest, ListSlowLogResponse> genForListSlowLog() {
        // basic
        HttpRequestDef.Builder<ListSlowLogRequest, ListSlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogRequest.class, ListSlowLogResponse.class)
                .withName("ListSlowLog")
                .withUri("/v2/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogRequest::getInstanceId, ListSlowLogRequest::setInstanceId));
        builder.<String>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogRequest::getCurPage, ListSlowLogRequest::setCurPage));
        builder.<String>withRequestField("perPage",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogRequest::getPerPage, ListSlowLogRequest::setPerPage));
        builder.<String>withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogRequest::getStartDate, ListSlowLogRequest::setStartDate));
        builder.<String>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogRequest::getEndDate, ListSlowLogRequest::setEndDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v1/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getInstanceId, ListUsersRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, ListUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, ListUsersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebuildConfigRequest, RebuildConfigResponse> rebuildConfig =
        genForRebuildConfig();

    private static HttpRequestDef<RebuildConfigRequest, RebuildConfigResponse> genForRebuildConfig() {
        // basic
        HttpRequestDef.Builder<RebuildConfigRequest, RebuildConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebuildConfigRequest.class, RebuildConfigResponse.class)
                .withName("RebuildConfig")
                .withUri("/v1/{project_id}/instances/{instance_id}/reload-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebuildConfigRequest::getInstanceId, RebuildConfigRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RebuildConfigResponse::getBody, RebuildConfigResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ResetAdministratorRequest, ResetAdministratorResponse> resetAdministrator =
        genForResetAdministrator();

    private static HttpRequestDef<ResetAdministratorRequest, ResetAdministratorResponse> genForResetAdministrator() {
        // basic
        HttpRequestDef.Builder<ResetAdministratorRequest, ResetAdministratorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetAdministratorRequest.class, ResetAdministratorResponse.class)
                .withName("ResetAdministrator")
                .withUri("/v3/{project_id}/instances/{instance_id}/admin-user")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAdministratorRequest::getInstanceId, ResetAdministratorRequest::setInstanceId));
        builder.<AdminUserInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdminUserInfoReq.class),
            f -> f.withMarshaller(ResetAdministratorRequest::getBody, ResetAdministratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPassword =
        genForResetUserPassword();

    private static HttpRequestDef<ResetUserPasswordRequest, ResetUserPasswordResponse> genForResetUserPassword() {
        // basic
        HttpRequestDef.Builder<ResetUserPasswordRequest, ResetUserPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetUserPasswordRequest.class, ResetUserPasswordResponse.class)
                .withName("ResetUserPassword")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{username}/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetUserPasswordRequest::getInstanceId, ResetUserPasswordRequest::setInstanceId));
        builder.<String>withRequestField("username",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetUserPasswordRequest::getUsername, ResetUserPasswordRequest::setUsername));
        builder.<ResetUserPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetUserPasswordReq.class),
            f -> f.withMarshaller(ResetUserPasswordRequest::getBody, ResetUserPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeFlavorRequest, ResizeFlavorResponse> resizeFlavor = genForResizeFlavor();

    private static HttpRequestDef<ResizeFlavorRequest, ResizeFlavorResponse> genForResizeFlavor() {
        // basic
        HttpRequestDef.Builder<ResizeFlavorRequest, ResizeFlavorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResizeFlavorRequest.class, ResizeFlavorResponse.class)
                .withName("ResizeFlavor")
                .withUri("/v3/{project_id}/instances/{instance_id}/flavor")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeFlavorRequest::getInstanceId, ResizeFlavorRequest::setInstanceId));
        builder.<ResizeFlavorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeFlavorReq.class),
            f -> f.withMarshaller(ResizeFlavorRequest::getBody, ResizeFlavorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> restartInstance =
        genForRestartInstance();

    private static HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> genForRestartInstance() {
        // basic
        HttpRequestDef.Builder<RestartInstanceRequest, RestartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartInstanceRequest.class, RestartInstanceResponse.class)
                .withName("RestartInstance")
                .withUri("/v1/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartInstanceRequest::getInstanceId, RestartInstanceRequest::setInstanceId));
        builder.<RestartInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartInstanceReq.class),
            f -> f.withMarshaller(RestartInstanceRequest::getBody, RestartInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseRequest, ShowDatabaseResponse> showDatabase = genForShowDatabase();

    private static HttpRequestDef<ShowDatabaseRequest, ShowDatabaseResponse> genForShowDatabase() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseRequest, ShowDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDatabaseRequest.class, ShowDatabaseResponse.class)
                .withName("ShowDatabase")
                .withUri("/v1/{project_id}/instances/{instance_id}/databases/{ddm_dbname}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseRequest::getInstanceId, ShowDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("ddm_dbname",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseRequest::getDdmDbname, ShowDatabaseRequest::setDdmDbname));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceParamRequest, ShowInstanceParamResponse> showInstanceParam =
        genForShowInstanceParam();

    private static HttpRequestDef<ShowInstanceParamRequest, ShowInstanceParamResponse> genForShowInstanceParam() {
        // basic
        HttpRequestDef.Builder<ShowInstanceParamRequest, ShowInstanceParamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceParamRequest.class, ShowInstanceParamResponse.class)
                .withName("ShowInstanceParam")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceParamRequest::getInstanceId, ShowInstanceParamRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceParamRequest::getOffset, ShowInstanceParamRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceParamRequest::getLimit, ShowInstanceParamRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceParamRequest::getXLanguage, ShowInstanceParamRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalProcessesRequest, ShowLogicalProcessesResponse> showLogicalProcesses =
        genForShowLogicalProcesses();

    private static HttpRequestDef<ShowLogicalProcessesRequest, ShowLogicalProcessesResponse> genForShowLogicalProcesses() {
        // basic
        HttpRequestDef.Builder<ShowLogicalProcessesRequest, ShowLogicalProcessesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLogicalProcessesRequest.class, ShowLogicalProcessesResponse.class)
            .withName("ShowLogicalProcesses")
            .withUri("/v3/{project_id}/instances/{instance_id}/logical-processes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalProcessesRequest::getInstanceId,
                ShowLogicalProcessesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLogicalProcessesRequest::getOffset, ShowLogicalProcessesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLogicalProcessesRequest::getLimit, ShowLogicalProcessesRequest::setLimit));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalProcessesRequest::getKeyword, ShowLogicalProcessesRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeRequest, ShowNodeResponse> showNode = genForShowNode();

    private static HttpRequestDef<ShowNodeRequest, ShowNodeResponse> genForShowNode() {
        // basic
        HttpRequestDef.Builder<ShowNodeRequest, ShowNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodeRequest.class, ShowNodeResponse.class)
                .withName("ShowNode")
                .withUri("/v1/{project_id}/instances/{instance_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeRequest::getInstanceId, ShowNodeRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeRequest::getNodeId, ShowNodeRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPhysicalProcessesRequest, ShowPhysicalProcessesResponse> showPhysicalProcesses =
        genForShowPhysicalProcesses();

    private static HttpRequestDef<ShowPhysicalProcessesRequest, ShowPhysicalProcessesResponse> genForShowPhysicalProcesses() {
        // basic
        HttpRequestDef.Builder<ShowPhysicalProcessesRequest, ShowPhysicalProcessesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPhysicalProcessesRequest.class, ShowPhysicalProcessesResponse.class)
            .withName("ShowPhysicalProcesses")
            .withUri("/v3/{project_id}/instances/{instance_id}/physical-processes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhysicalProcessesRequest::getInstanceId,
                ShowPhysicalProcessesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPhysicalProcessesRequest::getOffset, ShowPhysicalProcessesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPhysicalProcessesRequest::getLimit, ShowPhysicalProcessesRequest::setLimit));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhysicalProcessesRequest::getKeyword, ShowPhysicalProcessesRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProcessesAuditLogRequest, ShowProcessesAuditLogResponse> showProcessesAuditLog =
        genForShowProcessesAuditLog();

    private static HttpRequestDef<ShowProcessesAuditLogRequest, ShowProcessesAuditLogResponse> genForShowProcessesAuditLog() {
        // basic
        HttpRequestDef.Builder<ShowProcessesAuditLogRequest, ShowProcessesAuditLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProcessesAuditLogRequest.class, ShowProcessesAuditLogResponse.class)
            .withName("ShowProcessesAuditLog")
            .withUri("/v3/{project_id}/instances/{instance_id}/processes-audit-log")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProcessesAuditLogRequest::getInstanceId,
                ShowProcessesAuditLogRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProcessesAuditLogRequest::getOffset, ShowProcessesAuditLogRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProcessesAuditLogRequest::getLimit, ShowProcessesAuditLogRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProcessesAuditLogRequest::getStartTime,
                ShowProcessesAuditLogRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProcessesAuditLogRequest::getEndTime, ShowProcessesAuditLogRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodes =
        genForShrinkInstanceNodes();

    private static HttpRequestDef<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> genForShrinkInstanceNodes() {
        // basic
        HttpRequestDef.Builder<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShrinkInstanceNodesRequest.class, ShrinkInstanceNodesResponse.class)
                .withName("ShrinkInstanceNodes")
                .withUri("/v2/{project_id}/instances/{instance_id}/action/reduce")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkInstanceNodesRequest::getInstanceId,
                ShrinkInstanceNodesRequest::setInstanceId));
        builder.<ReduceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReduceRequest.class),
            f -> f.withMarshaller(ShrinkInstanceNodesRequest::getBody, ShrinkInstanceNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse> updateDatabaseInfo =
        genForUpdateDatabaseInfo();

    private static HttpRequestDef<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse> genForUpdateDatabaseInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateDatabaseInfoRequest.class, UpdateDatabaseInfoResponse.class)
                .withName("UpdateDatabaseInfo")
                .withUri("/v1/{project_id}/instances/{instance_id}/rds/sync")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseInfoRequest::getInstanceId, UpdateDatabaseInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceName =
        genForUpdateInstanceName();

    private static HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> genForUpdateInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceNameRequest, UpdateInstanceNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceNameRequest.class, UpdateInstanceNameResponse.class)
                .withName("UpdateInstanceName")
                .withUri("/v1/{project_id}/instances/{instance_id}/modify-name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, UpdateInstanceNameRequest::setInstanceId));
        builder.<ModifyInstanceNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyInstanceNameReq.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, UpdateInstanceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceParamRequest, UpdateInstanceParamResponse> updateInstanceParam =
        genForUpdateInstanceParam();

    private static HttpRequestDef<UpdateInstanceParamRequest, UpdateInstanceParamResponse> genForUpdateInstanceParam() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceParamRequest, UpdateInstanceParamResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceParamRequest.class, UpdateInstanceParamResponse.class)
                .withName("UpdateInstanceParam")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceParamRequest::getInstanceId,
                UpdateInstanceParamRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceParamRequest::getXLanguage, UpdateInstanceParamRequest::setXLanguage));
        builder.<UpdateParametersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateParametersReq.class),
            f -> f.withMarshaller(UpdateInstanceParamRequest::getBody, UpdateInstanceParamRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroup =
        genForUpdateInstanceSecurityGroup();

    private static HttpRequestDef<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> genForUpdateInstanceSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceSecurityGroupRequest.class,
                    UpdateInstanceSecurityGroupResponse.class)
                .withName("UpdateInstanceSecurityGroup")
                .withUri("/v1/{project_id}/instances/{instance_id}/modify-security-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceSecurityGroupRequest::getInstanceId,
                UpdateInstanceSecurityGroupRequest::setInstanceId));
        builder.<ModifyInstanceSecurityGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyInstanceSecurityGroupReq.class),
            f -> f.withMarshaller(UpdateInstanceSecurityGroupRequest::getBody,
                UpdateInstanceSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse> updateReadAndWriteStrategy =
        genForUpdateReadAndWriteStrategy();

    private static HttpRequestDef<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse> genForUpdateReadAndWriteStrategy() {
        // basic
        HttpRequestDef.Builder<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateReadAndWriteStrategyRequest.class,
                    UpdateReadAndWriteStrategyResponse.class)
                .withName("UpdateReadAndWriteStrategy")
                .withUri("/v2/{project_id}/instances/{instance_id}/action/read-write-strategy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReadAndWriteStrategyRequest::getInstanceId,
                UpdateReadAndWriteStrategyRequest::setInstanceId));
        builder.<ModifyReadAndWriteStrategyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyReadAndWriteStrategyReq.class),
            f -> f.withMarshaller(UpdateReadAndWriteStrategyRequest::getBody,
                UpdateReadAndWriteStrategyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForUpdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForUpdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v1/{project_id}/instances/{instance_id}/users/{username}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getInstanceId, UpdateUserRequest::setInstanceId));
        builder.<String>withRequestField("username",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUsername, UpdateUserRequest::setUsername));
        builder.<UpdateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserReq.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, UpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> validateWeakPassword =
        genForValidateWeakPassword();

    private static HttpRequestDef<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> genForValidateWeakPassword() {
        // basic
        HttpRequestDef.Builder<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ValidateWeakPasswordRequest.class, ValidateWeakPasswordResponse.class)
            .withName("ValidateWeakPassword")
            .withUri("/v3/{project_id}/weak-password-verification")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<WeakPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WeakPasswordReq.class),
            f -> f.withMarshaller(ValidateWeakPasswordRequest::getBody, ValidateWeakPasswordRequest::setBody));

        // response

        return builder.build();
    }

}
