package com.huaweicloud.sdk.codeartsdeploy.v2;

import com.huaweicloud.sdk.codeartsdeploy.v2.model.AppBatchDeleteRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchDeleteAppRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchDeleteAppResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchDeleteHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchDeleteHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdateApplicationPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdateApplicationPermissionsRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdateApplicationPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdatePermissionLevelRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdatePermissionLevelRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdatePermissionLevelResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckCanCreateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckCanCreateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckIsDuplicateAppNameRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckIsDuplicateAppNameResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckWhetherHostGroupCanBeCreatedRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckWhetherHostGroupCanBeCreatedResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ConfigInfo;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CopyApplicationRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CopyApplicationResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CopyHostsToTargetRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CopyHostsToTargetResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppGroupsRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppGroupsResponse;
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
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteAppGroupsResponse;
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
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostClusterRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostClusterResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostFromEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostFromEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentGroup;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentGroupUpdateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentHost;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentHostListEntity;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentHostRequestExternal;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeploymentHostsCopyRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DevUcClusterPermission;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DevUcEnvironmentPermission;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.EnvExecutionBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.EnvironmentPermissionV2Body;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.EnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.EnvironmentRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.HostClusterRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAppGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListApplicationPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListApplicationPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAssociateEnvironmentsInfosRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAssociateEnvironmentsInfosResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTaskHistoryByDateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTaskHistoryByDateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTasksRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTasksResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostClustersRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostClustersResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupBaseInfosRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupBaseInfosResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListNewHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListNewHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListTaskSuccessRateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListTaskSuccessRateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppGroupsRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppToGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppToGroupRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppToGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.PermissionUpdateV2Body;
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
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppDisableStatusRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppDisableStatusRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppDisableStatusResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppGroupsRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppInfoRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppInfoRequestBody;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppInfoResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateEnvironmentPermissionRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateEnvironmentPermissionResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostClusterRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostClusterResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostGroupPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostGroupPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostInfoRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostInfoResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeArtsDeployMeta {

    public static final HttpRequestDef<CreateAppGroupsRequest, CreateAppGroupsResponse> createAppGroups =
        genForCreateAppGroups();

    private static HttpRequestDef<CreateAppGroupsRequest, CreateAppGroupsResponse> genForCreateAppGroups() {
        // basic
        HttpRequestDef.Builder<CreateAppGroupsRequest, CreateAppGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppGroupsRequest.class, CreateAppGroupsResponse.class)
                .withName("CreateAppGroups")
                .withUri("/v1/projects/{project_id}/applications/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppGroupsRequest::getProjectId, CreateAppGroupsRequest::setProjectId));
        builder.<CreateAppGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppGroupsRequestBody.class),
            f -> f.withMarshaller(CreateAppGroupsRequest::getBody, CreateAppGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppGroupsRequest, DeleteAppGroupsResponse> deleteAppGroups =
        genForDeleteAppGroups();

    private static HttpRequestDef<DeleteAppGroupsRequest, DeleteAppGroupsResponse> genForDeleteAppGroups() {
        // basic
        HttpRequestDef.Builder<DeleteAppGroupsRequest, DeleteAppGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppGroupsRequest.class, DeleteAppGroupsResponse.class)
                .withName("DeleteAppGroups")
                .withUri("/v1/projects/{project_id}/applications/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppGroupsRequest::getProjectId, DeleteAppGroupsRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppGroupsRequest::getGroupId, DeleteAppGroupsRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppGroupsRequest, ListAppGroupsResponse> listAppGroups =
        genForListAppGroups();

    private static HttpRequestDef<ListAppGroupsRequest, ListAppGroupsResponse> genForListAppGroups() {
        // basic
        HttpRequestDef.Builder<ListAppGroupsRequest, ListAppGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppGroupsRequest.class, ListAppGroupsResponse.class)
                .withName("ListAppGroups")
                .withUri("/v1/projects/{project_id}/applications/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupsRequest::getProjectId, ListAppGroupsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MoveAppGroupsRequest, MoveAppGroupsResponse> moveAppGroups =
        genForMoveAppGroups();

    private static HttpRequestDef<MoveAppGroupsRequest, MoveAppGroupsResponse> genForMoveAppGroups() {
        // basic
        HttpRequestDef.Builder<MoveAppGroupsRequest, MoveAppGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MoveAppGroupsRequest.class, MoveAppGroupsResponse.class)
                .withName("MoveAppGroups")
                .withUri("/v1/projects/{project_id}/applications/groups/swap")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveAppGroupsRequest::getProjectId, MoveAppGroupsRequest::setProjectId));
        builder.<MoveAppGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MoveAppGroupsRequestBody.class),
            f -> f.withMarshaller(MoveAppGroupsRequest::getBody, MoveAppGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MoveAppToGroupRequest, MoveAppToGroupResponse> moveAppToGroup =
        genForMoveAppToGroup();

    private static HttpRequestDef<MoveAppToGroupRequest, MoveAppToGroupResponse> genForMoveAppToGroup() {
        // basic
        HttpRequestDef.Builder<MoveAppToGroupRequest, MoveAppToGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MoveAppToGroupRequest.class, MoveAppToGroupResponse.class)
                .withName("MoveAppToGroup")
                .withUri("/v1/projects/{project_id}/applications/groups/move")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveAppToGroupRequest::getProjectId, MoveAppToGroupRequest::setProjectId));
        builder.<MoveAppToGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MoveAppToGroupRequestBody.class),
            f -> f.withMarshaller(MoveAppToGroupRequest::getBody, MoveAppToGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppGroupsRequest, UpdateAppGroupsResponse> updateAppGroups =
        genForUpdateAppGroups();

    private static HttpRequestDef<UpdateAppGroupsRequest, UpdateAppGroupsResponse> genForUpdateAppGroups() {
        // basic
        HttpRequestDef.Builder<UpdateAppGroupsRequest, UpdateAppGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppGroupsRequest.class, UpdateAppGroupsResponse.class)
                .withName("UpdateAppGroups")
                .withUri("/v1/projects/{project_id}/applications/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppGroupsRequest::getProjectId, UpdateAppGroupsRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppGroupsRequest::getGroupId, UpdateAppGroupsRequest::setGroupId));
        builder.<UpdateAppGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppGroupsRequestBody.class),
            f -> f.withMarshaller(UpdateAppGroupsRequest::getBody, UpdateAppGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateApplicationPermissionsRequest, BatchUpdateApplicationPermissionsResponse> batchUpdateApplicationPermissions =
        genForBatchUpdateApplicationPermissions();

    private static HttpRequestDef<BatchUpdateApplicationPermissionsRequest, BatchUpdateApplicationPermissionsResponse> genForBatchUpdateApplicationPermissions() {
        // basic
        HttpRequestDef.Builder<BatchUpdateApplicationPermissionsRequest, BatchUpdateApplicationPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateApplicationPermissionsRequest.class,
                    BatchUpdateApplicationPermissionsResponse.class)
                .withName("BatchUpdateApplicationPermissions")
                .withUri("/v3/applications/permissions")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateApplicationPermissionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateApplicationPermissionsRequestBody.class),
            f -> f.withMarshaller(BatchUpdateApplicationPermissionsRequest::getBody,
                BatchUpdateApplicationPermissionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdatePermissionLevelRequest, BatchUpdatePermissionLevelResponse> batchUpdatePermissionLevel =
        genForBatchUpdatePermissionLevel();

    private static HttpRequestDef<BatchUpdatePermissionLevelRequest, BatchUpdatePermissionLevelResponse> genForBatchUpdatePermissionLevel() {
        // basic
        HttpRequestDef.Builder<BatchUpdatePermissionLevelRequest, BatchUpdatePermissionLevelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdatePermissionLevelRequest.class,
                    BatchUpdatePermissionLevelResponse.class)
                .withName("BatchUpdatePermissionLevel")
                .withUri("/v3/applications/permission-level")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdatePermissionLevelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdatePermissionLevelRequestBody.class),
            f -> f.withMarshaller(BatchUpdatePermissionLevelRequest::getBody,
                BatchUpdatePermissionLevelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckCanCreateRequest, CheckCanCreateResponse> checkCanCreate =
        genForCheckCanCreate();

    private static HttpRequestDef<CheckCanCreateRequest, CheckCanCreateResponse> genForCheckCanCreate() {
        // basic
        HttpRequestDef.Builder<CheckCanCreateRequest, CheckCanCreateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckCanCreateRequest.class, CheckCanCreateResponse.class)
                .withName("CheckCanCreate")
                .withUri("/v1/applications/creatable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCanCreateRequest::getProjectId, CheckCanCreateRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationPermissionsRequest, ListApplicationPermissionsResponse> listApplicationPermissions =
        genForListApplicationPermissions();

    private static HttpRequestDef<ListApplicationPermissionsRequest, ListApplicationPermissionsResponse> genForListApplicationPermissions() {
        // basic
        HttpRequestDef.Builder<ListApplicationPermissionsRequest, ListApplicationPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApplicationPermissionsRequest.class,
                    ListApplicationPermissionsResponse.class)
                .withName("ListApplicationPermissions")
                .withUri("/v3/applications/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationPermissionsRequest::getAppId,
                ListApplicationPermissionsRequest::setAppId));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationPermissionsRequest::getProjectId,
                ListApplicationPermissionsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppRequest, BatchDeleteAppResponse> batchDeleteApp =
        genForBatchDeleteApp();

    private static HttpRequestDef<BatchDeleteAppRequest, BatchDeleteAppResponse> genForBatchDeleteApp() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAppRequest, BatchDeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteAppRequest.class, BatchDeleteAppResponse.class)
                .withName("BatchDeleteApp")
                .withUri("/v2/applications/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<AppBatchDeleteRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppBatchDeleteRequest.class),
            f -> f.withMarshaller(BatchDeleteAppRequest::getBody, BatchDeleteAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckIsDuplicateAppNameRequest, CheckIsDuplicateAppNameResponse> checkIsDuplicateAppName =
        genForCheckIsDuplicateAppName();

    private static HttpRequestDef<CheckIsDuplicateAppNameRequest, CheckIsDuplicateAppNameResponse> genForCheckIsDuplicateAppName() {
        // basic
        HttpRequestDef.Builder<CheckIsDuplicateAppNameRequest, CheckIsDuplicateAppNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckIsDuplicateAppNameRequest.class, CheckIsDuplicateAppNameResponse.class)
            .withName("CheckIsDuplicateAppName")
            .withUri("/v1/applications/exist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckIsDuplicateAppNameRequest::getName, CheckIsDuplicateAppNameRequest::setName));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckIsDuplicateAppNameRequest::getProjectId,
                CheckIsDuplicateAppNameRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyApplicationRequest, CopyApplicationResponse> copyApplication =
        genForCopyApplication();

    private static HttpRequestDef<CopyApplicationRequest, CopyApplicationResponse> genForCopyApplication() {
        // basic
        HttpRequestDef.Builder<CopyApplicationRequest, CopyApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyApplicationRequest.class, CopyApplicationResponse.class)
                .withName("CopyApplication")
                .withUri("/v1/applications/{app_id}/duplicate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyApplicationRequest::getAppId, CopyApplicationRequest::setAppId));

        // response

        return builder.build();
    }

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

    public static final HttpRequestDef<UpdateAppDisableStatusRequest, UpdateAppDisableStatusResponse> updateAppDisableStatus =
        genForUpdateAppDisableStatus();

    private static HttpRequestDef<UpdateAppDisableStatusRequest, UpdateAppDisableStatusResponse> genForUpdateAppDisableStatus() {
        // basic
        HttpRequestDef.Builder<UpdateAppDisableStatusRequest, UpdateAppDisableStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAppDisableStatusRequest.class, UpdateAppDisableStatusResponse.class)
            .withName("UpdateAppDisableStatus")
            .withUri("/v1/applications/{app_id}/disable")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppDisableStatusRequest::getAppId, UpdateAppDisableStatusRequest::setAppId));
        builder.<UpdateAppDisableStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppDisableStatusRequestBody.class),
            f -> f.withMarshaller(UpdateAppDisableStatusRequest::getBody, UpdateAppDisableStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppInfoRequest, UpdateAppInfoResponse> updateAppInfo =
        genForUpdateAppInfo();

    private static HttpRequestDef<UpdateAppInfoRequest, UpdateAppInfoResponse> genForUpdateAppInfo() {
        // basic
        HttpRequestDef.Builder<UpdateAppInfoRequest, UpdateAppInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppInfoRequest.class, UpdateAppInfoResponse.class)
                .withName("UpdateAppInfo")
                .withUri("/v1/applications")
                .withContentType("application/json");

        // requests
        builder.<UpdateAppInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppInfoRequestBody.class),
            f -> f.withMarshaller(UpdateAppInfoRequest::getBody, UpdateAppInfoRequest::setBody));

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

    public static final HttpRequestDef<ListEnvironmentHostsRequest, ListEnvironmentHostsResponse> listEnvironmentHosts =
        genForListEnvironmentHosts();

    private static HttpRequestDef<ListEnvironmentHostsRequest, ListEnvironmentHostsResponse> genForListEnvironmentHosts() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentHostsRequest, ListEnvironmentHostsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEnvironmentHostsRequest.class, ListEnvironmentHostsResponse.class)
            .withName("ListEnvironmentHosts")
            .withUri("/v1/applications/{application_id}/environments/{environment_id}/hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentHostsRequest::getApplicationId,
                ListEnvironmentHostsRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentHostsRequest::getEnvironmentId,
                ListEnvironmentHostsRequest::setEnvironmentId));
        builder.<String>withRequestField("key_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentHostsRequest::getKeyField, ListEnvironmentHostsRequest::setKeyField));
        builder.<Boolean>withRequestField("as_proxy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEnvironmentHostsRequest::getAsProxy, ListEnvironmentHostsRequest::setAsProxy));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentHostsRequest::getPageIndex,
                ListEnvironmentHostsRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentHostsRequest::getPageSize, ListEnvironmentHostsRequest::setPageSize));

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

    public static final HttpRequestDef<UpdateEnvironmentRequest, UpdateEnvironmentResponse> updateEnvironment =
        genForUpdateEnvironment();

    private static HttpRequestDef<UpdateEnvironmentRequest, UpdateEnvironmentResponse> genForUpdateEnvironment() {
        // basic
        HttpRequestDef.Builder<UpdateEnvironmentRequest, UpdateEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnvironmentRequest.class, UpdateEnvironmentResponse.class)
                .withName("UpdateEnvironment")
                .withUri("/v1/applications/{application_id}/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentRequest::getApplicationId,
                UpdateEnvironmentRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentRequest::getEnvironmentId,
                UpdateEnvironmentRequest::setEnvironmentId));
        builder.<EnvironmentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvironmentRequest.class),
            f -> f.withMarshaller(UpdateEnvironmentRequest::getBody, UpdateEnvironmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentPermissionsRequest, ListEnvironmentPermissionsResponse> listEnvironmentPermissions =
        genForListEnvironmentPermissions();

    private static HttpRequestDef<ListEnvironmentPermissionsRequest, ListEnvironmentPermissionsResponse> genForListEnvironmentPermissions() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentPermissionsRequest, ListEnvironmentPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEnvironmentPermissionsRequest.class,
                    ListEnvironmentPermissionsResponse.class)
                .withName("ListEnvironmentPermissions")
                .withUri("/v2/applications/{application_id}/environments/{environment_id}/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentPermissionsRequest::getApplicationId,
                ListEnvironmentPermissionsRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentPermissionsRequest::getEnvironmentId,
                ListEnvironmentPermissionsRequest::setEnvironmentId));

        // response
        builder.<List<DevUcEnvironmentPermission>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListEnvironmentPermissionsResponse::getBody,
                    ListEnvironmentPermissionsResponse::setBody)
                .withInnerContainerType(DevUcEnvironmentPermission.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvironmentPermissionRequest, UpdateEnvironmentPermissionResponse> updateEnvironmentPermission =
        genForUpdateEnvironmentPermission();

    private static HttpRequestDef<UpdateEnvironmentPermissionRequest, UpdateEnvironmentPermissionResponse> genForUpdateEnvironmentPermission() {
        // basic
        HttpRequestDef.Builder<UpdateEnvironmentPermissionRequest, UpdateEnvironmentPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEnvironmentPermissionRequest.class,
                    UpdateEnvironmentPermissionResponse.class)
                .withName("UpdateEnvironmentPermission")
                .withUri("/v2/applications/{application_id}/environments/{environment_id}/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentPermissionRequest::getApplicationId,
                UpdateEnvironmentPermissionRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentPermissionRequest::getEnvironmentId,
                UpdateEnvironmentPermissionRequest::setEnvironmentId));
        builder.<EnvironmentPermissionV2Body>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvironmentPermissionV2Body.class),
            f -> f.withMarshaller(UpdateEnvironmentPermissionRequest::getBody,
                UpdateEnvironmentPermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteHostsRequest, BatchDeleteHostsResponse> batchDeleteHosts =
        genForBatchDeleteHosts();

    private static HttpRequestDef<BatchDeleteHostsRequest, BatchDeleteHostsResponse> genForBatchDeleteHosts() {
        // basic
        HttpRequestDef.Builder<BatchDeleteHostsRequest, BatchDeleteHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteHostsRequest.class, BatchDeleteHostsResponse.class)
                .withName("BatchDeleteHosts")
                .withUri("/v1/resources/host-groups/{group_id}/hosts/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteHostsRequest::getGroupId, BatchDeleteHostsRequest::setGroupId));
        builder.<DeploymentHostListEntity>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentHostListEntity.class),
            f -> f.withMarshaller(BatchDeleteHostsRequest::getBody, BatchDeleteHostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyHostsToTargetRequest, CopyHostsToTargetResponse> copyHostsToTarget =
        genForCopyHostsToTarget();

    private static HttpRequestDef<CopyHostsToTargetRequest, CopyHostsToTargetResponse> genForCopyHostsToTarget() {
        // basic
        HttpRequestDef.Builder<CopyHostsToTargetRequest, CopyHostsToTargetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyHostsToTargetRequest.class, CopyHostsToTargetResponse.class)
                .withName("CopyHostsToTarget")
                .withUri("/v1/resources/host-groups/{group_id}/hosts/replication")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyHostsToTargetRequest::getGroupId, CopyHostsToTargetRequest::setGroupId));
        builder.<DeploymentHostsCopyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentHostsCopyRequest.class),
            f -> f.withMarshaller(CopyHostsToTargetRequest::getBody, CopyHostsToTargetRequest::setBody));

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

    public static final HttpRequestDef<DeleteHostRequest, DeleteHostResponse> deleteHost = genForDeleteHost();

    private static HttpRequestDef<DeleteHostRequest, DeleteHostResponse> genForDeleteHost() {
        // basic
        HttpRequestDef.Builder<DeleteHostRequest, DeleteHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostRequest.class, DeleteHostResponse.class)
                .withName("DeleteHost")
                .withUri("/v1/resources/host-groups/{group_id}/hosts/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getGroupId, DeleteHostRequest::setGroupId));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getHostId, DeleteHostRequest::setHostId));

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

    public static final HttpRequestDef<UpdateHostInfoRequest, UpdateHostInfoResponse> updateHostInfo =
        genForUpdateHostInfo();

    private static HttpRequestDef<UpdateHostInfoRequest, UpdateHostInfoResponse> genForUpdateHostInfo() {
        // basic
        HttpRequestDef.Builder<UpdateHostInfoRequest, UpdateHostInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHostInfoRequest.class, UpdateHostInfoResponse.class)
                .withName("UpdateHostInfo")
                .withUri("/v1/resources/host-groups/{group_id}/hosts/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostInfoRequest::getGroupId, UpdateHostInfoRequest::setGroupId));
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostInfoRequest::getHostId, UpdateHostInfoRequest::setHostId));
        builder.<DeploymentHostRequestExternal>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentHostRequestExternal.class),
            f -> f.withMarshaller(UpdateHostInfoRequest::getBody, UpdateHostInfoRequest::setBody));

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

    public static final HttpRequestDef<DeleteHostClusterRequest, DeleteHostClusterResponse> deleteHostCluster =
        genForDeleteHostCluster();

    private static HttpRequestDef<DeleteHostClusterRequest, DeleteHostClusterResponse> genForDeleteHostCluster() {
        // basic
        HttpRequestDef.Builder<DeleteHostClusterRequest, DeleteHostClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostClusterRequest.class, DeleteHostClusterResponse.class)
                .withName("DeleteHostCluster")
                .withUri("/v1/resources/host-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostClusterRequest::getGroupId, DeleteHostClusterRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociateEnvironmentsInfosRequest, ListAssociateEnvironmentsInfosResponse> listAssociateEnvironmentsInfos =
        genForListAssociateEnvironmentsInfos();

    private static HttpRequestDef<ListAssociateEnvironmentsInfosRequest, ListAssociateEnvironmentsInfosResponse> genForListAssociateEnvironmentsInfos() {
        // basic
        HttpRequestDef.Builder<ListAssociateEnvironmentsInfosRequest, ListAssociateEnvironmentsInfosResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAssociateEnvironmentsInfosRequest.class,
                    ListAssociateEnvironmentsInfosResponse.class)
                .withName("ListAssociateEnvironmentsInfos")
                .withUri("/v1/resources/host-groups/{group_id}/environments/infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociateEnvironmentsInfosRequest::getGroupId,
                ListAssociateEnvironmentsInfosRequest::setGroupId));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociateEnvironmentsInfosRequest::getPageIndex,
                ListAssociateEnvironmentsInfosRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociateEnvironmentsInfosRequest::getPageSize,
                ListAssociateEnvironmentsInfosRequest::setPageSize));

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

    public static final HttpRequestDef<ListHostGroupBaseInfosRequest, ListHostGroupBaseInfosResponse> listHostGroupBaseInfos =
        genForListHostGroupBaseInfos();

    private static HttpRequestDef<ListHostGroupBaseInfosRequest, ListHostGroupBaseInfosResponse> genForListHostGroupBaseInfos() {
        // basic
        HttpRequestDef.Builder<ListHostGroupBaseInfosRequest, ListHostGroupBaseInfosResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListHostGroupBaseInfosRequest.class, ListHostGroupBaseInfosResponse.class)
            .withName("ListHostGroupBaseInfos")
            .withUri("/v1/applications/{application_id}/host-groups/base/infos")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupBaseInfosRequest::getApplicationId,
                ListHostGroupBaseInfosRequest::setApplicationId));
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupBaseInfosRequest::getProjectUuid,
                ListHostGroupBaseInfosRequest::setProjectUuid));
        builder.<ListHostGroupBaseInfosRequest.OsEnum>withRequestField("os",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostGroupBaseInfosRequest.OsEnum.class),
            f -> f.withMarshaller(ListHostGroupBaseInfosRequest::getOs, ListHostGroupBaseInfosRequest::setOs));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupBaseInfosRequest::getPageIndex,
                ListHostGroupBaseInfosRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupBaseInfosRequest::getPageSize,
                ListHostGroupBaseInfosRequest::setPageSize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupBaseInfosRequest::getName, ListHostGroupBaseInfosRequest::setName));

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

    public static final HttpRequestDef<UpdateHostClusterRequest, UpdateHostClusterResponse> updateHostCluster =
        genForUpdateHostCluster();

    private static HttpRequestDef<UpdateHostClusterRequest, UpdateHostClusterResponse> genForUpdateHostCluster() {
        // basic
        HttpRequestDef.Builder<UpdateHostClusterRequest, UpdateHostClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHostClusterRequest.class, UpdateHostClusterResponse.class)
                .withName("UpdateHostCluster")
                .withUri("/v1/resources/host-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostClusterRequest::getGroupId, UpdateHostClusterRequest::setGroupId));
        builder.<HostClusterRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HostClusterRequest.class),
            f -> f.withMarshaller(UpdateHostClusterRequest::getBody, UpdateHostClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckWhetherHostGroupCanBeCreatedRequest, CheckWhetherHostGroupCanBeCreatedResponse> checkWhetherHostGroupCanBeCreated =
        genForCheckWhetherHostGroupCanBeCreated();

    private static HttpRequestDef<CheckWhetherHostGroupCanBeCreatedRequest, CheckWhetherHostGroupCanBeCreatedResponse> genForCheckWhetherHostGroupCanBeCreated() {
        // basic
        HttpRequestDef.Builder<CheckWhetherHostGroupCanBeCreatedRequest, CheckWhetherHostGroupCanBeCreatedResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CheckWhetherHostGroupCanBeCreatedRequest.class,
                    CheckWhetherHostGroupCanBeCreatedResponse.class)
                .withName("CheckWhetherHostGroupCanBeCreated")
                .withUri("/v1/host-groups/creatable/{project_id}/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckWhetherHostGroupCanBeCreatedRequest::getProjectId,
                CheckWhetherHostGroupCanBeCreatedRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupPermissionsRequest, ListHostGroupPermissionsResponse> listHostGroupPermissions =
        genForListHostGroupPermissions();

    private static HttpRequestDef<ListHostGroupPermissionsRequest, ListHostGroupPermissionsResponse> genForListHostGroupPermissions() {
        // basic
        HttpRequestDef.Builder<ListHostGroupPermissionsRequest, ListHostGroupPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListHostGroupPermissionsRequest.class, ListHostGroupPermissionsResponse.class)
                .withName("ListHostGroupPermissions")
                .withUri("/v2/host-groups/{group_id}/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupPermissionsRequest::getGroupId,
                ListHostGroupPermissionsRequest::setGroupId));

        // response
        builder.<List<DevUcClusterPermission>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostGroupPermissionsResponse::getBody, ListHostGroupPermissionsResponse::setBody)
                .withInnerContainerType(DevUcClusterPermission.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostGroupPermissionsRequest, UpdateHostGroupPermissionsResponse> updateHostGroupPermissions =
        genForUpdateHostGroupPermissions();

    private static HttpRequestDef<UpdateHostGroupPermissionsRequest, UpdateHostGroupPermissionsResponse> genForUpdateHostGroupPermissions() {
        // basic
        HttpRequestDef.Builder<UpdateHostGroupPermissionsRequest, UpdateHostGroupPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHostGroupPermissionsRequest.class,
                    UpdateHostGroupPermissionsResponse.class)
                .withName("UpdateHostGroupPermissions")
                .withUri("/v2/host-groups/{group_id}/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostGroupPermissionsRequest::getGroupId,
                UpdateHostGroupPermissionsRequest::setGroupId));
        builder.<PermissionUpdateV2Body>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PermissionUpdateV2Body.class),
            f -> f.withMarshaller(UpdateHostGroupPermissionsRequest::getBody,
                UpdateHostGroupPermissionsRequest::setBody));

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
