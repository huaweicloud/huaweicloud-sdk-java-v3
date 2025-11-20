package com.huaweicloud.sdk.ddm.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ddm.v1.model.AdminUserInfoReq;
import com.huaweicloud.sdk.ddm.v1.model.CancelMigrationRequest;
import com.huaweicloud.sdk.ddm.v1.model.CancelMigrationResponse;
import com.huaweicloud.sdk.ddm.v1.model.ChangeDatabaseVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.ChangeDatabaseVersionResponse;
import com.huaweicloud.sdk.ddm.v1.model.ChangeStrategyRequest;
import com.huaweicloud.sdk.ddm.v1.model.ChangeStrategyResponse;
import com.huaweicloud.sdk.ddm.v1.model.CheckMigrateLogicDbRequest;
import com.huaweicloud.sdk.ddm.v1.model.CheckMigrateLogicDbResponse;
import com.huaweicloud.sdk.ddm.v1.model.CheckPreliminaryResultsRequest;
import com.huaweicloud.sdk.ddm.v1.model.CheckPreliminaryResultsResponse;
import com.huaweicloud.sdk.ddm.v1.model.CleanMigrationRequest;
import com.huaweicloud.sdk.ddm.v1.model.CleanMigrationResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseReq;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmConfigurationsRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmConfigurationsResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmDatabaseRequestBody;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupRequestBody;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceReq;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersReq;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersResponse;
import com.huaweicloud.sdk.ddm.v1.model.DatabaseVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteBackupRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteBackupResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.ddm.v1.model.DownloadSchemaMetadataRequest;
import com.huaweicloud.sdk.ddm.v1.model.DownloadSchemaMetadataResponse;
import com.huaweicloud.sdk.ddm.v1.model.EnlargeRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillLogicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillLogicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillPhysicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillPhysicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExpandDdmInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExpandDdmInstanceNodesRequestBody;
import com.huaweicloud.sdk.ddm.v1.model.ExpandDdmInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExpandInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExpandInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.KillProcessesOpenRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListApiVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListApiVersionResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsForMigrateRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsForMigrateResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsListRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsListResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListBackupsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListBackupsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabaseAvailableVersionsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabaseAvailableVersionsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmConfigurationsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmConfigurationsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmEnginesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmEnginesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmFlavorsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmFlavorsResponse;
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
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.ddm.v1.model.LoadSchemaMetadataReq;
import com.huaweicloud.sdk.ddm.v1.model.MigrateLogicDbOpenReq;
import com.huaweicloud.sdk.ddm.v1.model.MigrateLogicDbRequest;
import com.huaweicloud.sdk.ddm.v1.model.MigrateLogicDbResponse;
import com.huaweicloud.sdk.ddm.v1.model.MigrateResultsRequest;
import com.huaweicloud.sdk.ddm.v1.model.MigrateResultsResponse;
import com.huaweicloud.sdk.ddm.v1.model.MigrateRouteSwitchReqVO;
import com.huaweicloud.sdk.ddm.v1.model.ModifyConfigurationRequest;
import com.huaweicloud.sdk.ddm.v1.model.ModifyConfigurationResponse;
import com.huaweicloud.sdk.ddm.v1.model.ModifyInstanceNameReq;
import com.huaweicloud.sdk.ddm.v1.model.ModifyInstanceSecurityGroupReq;
import com.huaweicloud.sdk.ddm.v1.model.ModifyReadAndWriteStrategyReq;
import com.huaweicloud.sdk.ddm.v1.model.ParaGroupUpdate;
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
import com.huaweicloud.sdk.ddm.v1.model.Restore2ExistRequest;
import com.huaweicloud.sdk.ddm.v1.model.Restore2ExistResponse;
import com.huaweicloud.sdk.ddm.v1.model.RestoreInst2ExistReq;
import com.huaweicloud.sdk.ddm.v1.model.RestoreMetaData2ExistReq;
import com.huaweicloud.sdk.ddm.v1.model.RestoreMetadataRequest;
import com.huaweicloud.sdk.ddm.v1.model.RestoreMetadataResponse;
import com.huaweicloud.sdk.ddm.v1.model.RetryMigrationRequest;
import com.huaweicloud.sdk.ddm.v1.model.RetryMigrationResponse;
import com.huaweicloud.sdk.ddm.v1.model.RollBackDatabaseVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.RollBackDatabaseVersionResponse;
import com.huaweicloud.sdk.ddm.v1.model.RollbackMigrationRequest;
import com.huaweicloud.sdk.ddm.v1.model.RollbackMigrationResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleDdmsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleDdmsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleRdsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleRdsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleTimeRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleTimeResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowBackupRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowBackupResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowConfigurationRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowConfigurationResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowDdmJobResultRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowDdmJobResultResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceDatabaseResponse;
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
import com.huaweicloud.sdk.ddm.v1.model.ShowRelatedDnsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowRelatedDnsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowRiskInfoRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowRiskInfoResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShrinkInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShrinkInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.SwitchRouteRequest;
import com.huaweicloud.sdk.ddm.v1.model.SwitchRouteResponse;
import com.huaweicloud.sdk.ddm.v1.model.SwitchSslOpenRequest;
import com.huaweicloud.sdk.ddm.v1.model.SwitchSslRequest;
import com.huaweicloud.sdk.ddm.v1.model.SwitchSslResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateDatabaseInfoRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateDatabaseInfoResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceParamRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceParamResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstancePortRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstancePortResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateParametersReq;
import com.huaweicloud.sdk.ddm.v1.model.UpdatePortRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateReadAndWriteStrategyRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateReadAndWriteStrategyResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserReq;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.ddm.v1.model.UploadSchemaMetadataRequest;
import com.huaweicloud.sdk.ddm.v1.model.UploadSchemaMetadataResponse;
import com.huaweicloud.sdk.ddm.v1.model.ValidateWeakPasswordRequest;
import com.huaweicloud.sdk.ddm.v1.model.ValidateWeakPasswordResponse;
import com.huaweicloud.sdk.ddm.v1.model.WeakPasswordReq;

@SuppressWarnings("unchecked")
public class DdmMeta {

    public static final HttpRequestDef<ChangeDatabaseVersionRequest, ChangeDatabaseVersionResponse> changeDatabaseVersion =
        genForChangeDatabaseVersion();

    private static HttpRequestDef<ChangeDatabaseVersionRequest, ChangeDatabaseVersionResponse> genForChangeDatabaseVersion() {
        // basic
        HttpRequestDef.Builder<ChangeDatabaseVersionRequest, ChangeDatabaseVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeDatabaseVersionRequest.class, ChangeDatabaseVersionResponse.class)
            .withName("ChangeDatabaseVersion")
            .withUri("/v3/{project_id}/instances/{instance_id}/database-version/change-version")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeDatabaseVersionRequest::getInstanceId,
                ChangeDatabaseVersionRequest::setInstanceId));
        builder.<DatabaseVersionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseVersionRequest.class),
            f -> f.withMarshaller(ChangeDatabaseVersionRequest::getBody, ChangeDatabaseVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDdmConfigurationsRequest, CreateDdmConfigurationsResponse> createDdmConfigurations =
        genForCreateDdmConfigurations();

    private static HttpRequestDef<CreateDdmConfigurationsRequest, CreateDdmConfigurationsResponse> genForCreateDdmConfigurations() {
        // basic
        HttpRequestDef.Builder<CreateDdmConfigurationsRequest, CreateDdmConfigurationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDdmConfigurationsRequest.class, CreateDdmConfigurationsResponse.class)
            .withName("CreateDdmConfigurations")
            .withUri("/v3/{project_id}/configurations")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateConfigurationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationRequest.class),
            f -> f.withMarshaller(CreateDdmConfigurationsRequest::getBody, CreateDdmConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration =
        genForDeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genForDeleteConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationRequest, DeleteConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConfigurationRequest.class, DeleteConfigurationResponse.class)
            .withName("DeleteConfiguration")
            .withUri("/v3/{project_id}/configurations/{config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, DeleteConfigurationRequest::setConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseAvailableVersionsRequest, ListDatabaseAvailableVersionsResponse> listDatabaseAvailableVersions =
        genForListDatabaseAvailableVersions();

    private static HttpRequestDef<ListDatabaseAvailableVersionsRequest, ListDatabaseAvailableVersionsResponse> genForListDatabaseAvailableVersions() {
        // basic
        HttpRequestDef.Builder<ListDatabaseAvailableVersionsRequest, ListDatabaseAvailableVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDatabaseAvailableVersionsRequest.class,
                    ListDatabaseAvailableVersionsResponse.class)
                .withName("ListDatabaseAvailableVersions")
                .withUri("/v3/{project_id}/instances/{instance_id}/database-version/available-versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseAvailableVersionsRequest::getInstanceId,
                ListDatabaseAvailableVersionsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDdmConfigurationsRequest, ListDdmConfigurationsResponse> listDdmConfigurations =
        genForListDdmConfigurations();

    private static HttpRequestDef<ListDdmConfigurationsRequest, ListDdmConfigurationsResponse> genForListDdmConfigurations() {
        // basic
        HttpRequestDef.Builder<ListDdmConfigurationsRequest, ListDdmConfigurationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDdmConfigurationsRequest.class, ListDdmConfigurationsResponse.class)
            .withName("ListDdmConfigurations")
            .withUri("/v3/{project_id}/configurations")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDdmConfigurationsRequest::getOffset, ListDdmConfigurationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDdmConfigurationsRequest::getLimit, ListDdmConfigurationsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyConfigurationRequest, ModifyConfigurationResponse> modifyConfiguration =
        genForModifyConfiguration();

    private static HttpRequestDef<ModifyConfigurationRequest, ModifyConfigurationResponse> genForModifyConfiguration() {
        // basic
        HttpRequestDef.Builder<ModifyConfigurationRequest, ModifyConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyConfigurationRequest.class, ModifyConfigurationResponse.class)
                .withName("ModifyConfiguration")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyConfigurationRequest::getInstanceId,
                ModifyConfigurationRequest::setInstanceId));
        builder.<ParaGroupUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParaGroupUpdate.class),
            f -> f.withMarshaller(ModifyConfigurationRequest::getBody, ModifyConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollBackDatabaseVersionRequest, RollBackDatabaseVersionResponse> rollBackDatabaseVersion =
        genForRollBackDatabaseVersion();

    private static HttpRequestDef<RollBackDatabaseVersionRequest, RollBackDatabaseVersionResponse> genForRollBackDatabaseVersion() {
        // basic
        HttpRequestDef.Builder<RollBackDatabaseVersionRequest, RollBackDatabaseVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RollBackDatabaseVersionRequest.class, RollBackDatabaseVersionResponse.class)
            .withName("RollBackDatabaseVersion")
            .withUri("/v3/{project_id}/instances/{instance_id}/database-version/rollback-version")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollBackDatabaseVersionRequest::getInstanceId,
                RollBackDatabaseVersionRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> showConfiguration =
        genForShowConfiguration();

    private static HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> genForShowConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationRequest, ShowConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigurationRequest.class, ShowConfigurationResponse.class)
                .withName("ShowConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationRequest::getConfigId, ShowConfigurationRequest::setConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRiskInfoRequest, ShowRiskInfoResponse> showRiskInfo = genForShowRiskInfo();

    private static HttpRequestDef<ShowRiskInfoRequest, ShowRiskInfoResponse> genForShowRiskInfo() {
        // basic
        HttpRequestDef.Builder<ShowRiskInfoRequest, ShowRiskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRiskInfoRequest.class, ShowRiskInfoResponse.class)
                .withName("ShowRiskInfo")
                .withUri("/v3/{project_id}/instances/{instance_id}/show-risk-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskInfoRequest::getInstanceId, ShowRiskInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForListApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForListApiVersion() {
        // basic
        HttpRequestDef.Builder<ListApiVersionRequest, ListApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionRequest.class, ListApiVersionResponse.class)
                .withName("ListApiVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelMigrationRequest, CancelMigrationResponse> cancelMigration =
        genForCancelMigration();

    private static HttpRequestDef<CancelMigrationRequest, CancelMigrationResponse> genForCancelMigration() {
        // basic
        HttpRequestDef.Builder<CancelMigrationRequest, CancelMigrationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CancelMigrationRequest.class, CancelMigrationResponse.class)
                .withName("CancelMigration")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/jobs/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMigrationRequest::getInstanceId, CancelMigrationRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMigrationRequest::getDbName, CancelMigrationRequest::setDbName));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMigrationRequest::getJobId, CancelMigrationRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeStrategyRequest, ChangeStrategyResponse> changeStrategy =
        genForChangeStrategy();

    private static HttpRequestDef<ChangeStrategyRequest, ChangeStrategyResponse> genForChangeStrategy() {
        // basic
        HttpRequestDef.Builder<ChangeStrategyRequest, ChangeStrategyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeStrategyRequest.class, ChangeStrategyResponse.class)
            .withName("ChangeStrategy")
            .withUri(
                "/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/jobs/{job_id}/route-switch-strategy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeStrategyRequest::getInstanceId, ChangeStrategyRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeStrategyRequest::getDbName, ChangeStrategyRequest::setDbName));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeStrategyRequest::getJobId, ChangeStrategyRequest::setJobId));
        builder.<MigrateRouteSwitchReqVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigrateRouteSwitchReqVO.class),
            f -> f.withMarshaller(ChangeStrategyRequest::getBody, ChangeStrategyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckMigrateLogicDbRequest, CheckMigrateLogicDbResponse> checkMigrateLogicDb =
        genForCheckMigrateLogicDb();

    private static HttpRequestDef<CheckMigrateLogicDbRequest, CheckMigrateLogicDbResponse> genForCheckMigrateLogicDb() {
        // basic
        HttpRequestDef.Builder<CheckMigrateLogicDbRequest, CheckMigrateLogicDbResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckMigrateLogicDbRequest.class, CheckMigrateLogicDbResponse.class)
                .withName("CheckMigrateLogicDb")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/precheck")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckMigrateLogicDbRequest::getInstanceId,
                CheckMigrateLogicDbRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckMigrateLogicDbRequest::getDbName, CheckMigrateLogicDbRequest::setDbName));
        builder.<MigrateLogicDbOpenReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateLogicDbOpenReq.class),
            f -> f.withMarshaller(CheckMigrateLogicDbRequest::getBody, CheckMigrateLogicDbRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckPreliminaryResultsRequest, CheckPreliminaryResultsResponse> checkPreliminaryResults =
        genForCheckPreliminaryResults();

    private static HttpRequestDef<CheckPreliminaryResultsRequest, CheckPreliminaryResultsResponse> genForCheckPreliminaryResults() {
        // basic
        HttpRequestDef.Builder<CheckPreliminaryResultsRequest, CheckPreliminaryResultsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckPreliminaryResultsRequest.class, CheckPreliminaryResultsResponse.class)
            .withName("CheckPreliminaryResults")
            .withUri("/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/precheck/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPreliminaryResultsRequest::getInstanceId,
                CheckPreliminaryResultsRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPreliminaryResultsRequest::getDbName,
                CheckPreliminaryResultsRequest::setDbName));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPreliminaryResultsRequest::getJobId, CheckPreliminaryResultsRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CleanMigrationRequest, CleanMigrationResponse> cleanMigration =
        genForCleanMigration();

    private static HttpRequestDef<CleanMigrationRequest, CleanMigrationResponse> genForCleanMigration() {
        // basic
        HttpRequestDef.Builder<CleanMigrationRequest, CleanMigrationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CleanMigrationRequest.class, CleanMigrationResponse.class)
                .withName("CleanMigration")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/jobs/{job_id}/clean")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CleanMigrationRequest::getInstanceId, CleanMigrationRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CleanMigrationRequest::getDbName, CleanMigrationRequest::setDbName));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CleanMigrationRequest::getJobId, CleanMigrationRequest::setJobId));

        // response

        return builder.build();
    }

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

    public static final HttpRequestDef<CreateDdmDatabaseRequest, CreateDdmDatabaseResponse> createDdmDatabase =
        genForCreateDdmDatabase();

    private static HttpRequestDef<CreateDdmDatabaseRequest, CreateDdmDatabaseResponse> genForCreateDdmDatabase() {
        // basic
        HttpRequestDef.Builder<CreateDdmDatabaseRequest, CreateDdmDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDdmDatabaseRequest.class, CreateDdmDatabaseResponse.class)
                .withName("CreateDdmDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDdmDatabaseRequest::getInstanceId, CreateDdmDatabaseRequest::setInstanceId));
        builder.<CreateDdmDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDdmDatabaseRequestBody.class),
            f -> f.withMarshaller(CreateDdmDatabaseRequest::getBody, CreateDdmDatabaseRequest::setBody));

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

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genForDeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genForDeleteBackup() {
        // basic
        HttpRequestDef.Builder<DeleteBackupRequest, DeleteBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupRequest.class, DeleteBackupResponse.class)
                .withName("DeleteBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, DeleteBackupRequest::setBackupId));

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

    public static final HttpRequestDef<DeleteDdmDatabaseRequest, DeleteDdmDatabaseResponse> deleteDdmDatabase =
        genForDeleteDdmDatabase();

    private static HttpRequestDef<DeleteDdmDatabaseRequest, DeleteDdmDatabaseResponse> genForDeleteDdmDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteDdmDatabaseRequest, DeleteDdmDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDdmDatabaseRequest.class, DeleteDdmDatabaseResponse.class)
                .withName("DeleteDdmDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDdmDatabaseRequest::getInstanceId, DeleteDdmDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDdmDatabaseRequest::getDatabaseName,
                DeleteDdmDatabaseRequest::setDatabaseName));
        builder.<Boolean>withRequestField("delete_dn_data",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDdmDatabaseRequest::getDeleteDnData,
                DeleteDdmDatabaseRequest::setDeleteDnData));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDdmInstanceRequest, DeleteDdmInstanceResponse> deleteDdmInstance =
        genForDeleteDdmInstance();

    private static HttpRequestDef<DeleteDdmInstanceRequest, DeleteDdmInstanceResponse> genForDeleteDdmInstance() {
        // basic
        HttpRequestDef.Builder<DeleteDdmInstanceRequest, DeleteDdmInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDdmInstanceRequest.class, DeleteDdmInstanceResponse.class)
                .withName("DeleteDdmInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDdmInstanceRequest::getInstanceId, DeleteDdmInstanceRequest::setInstanceId));
        builder.<Boolean>withRequestField("delete_dn_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDdmInstanceRequest::getDeleteDnData,
                DeleteDdmInstanceRequest::setDeleteDnData));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(DeleteDdmInstanceResponse::getBody, DeleteDdmInstanceResponse::setBody));

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

    public static final HttpRequestDef<DownloadSchemaMetadataRequest, DownloadSchemaMetadataResponse> downloadSchemaMetadata =
        genForDownloadSchemaMetadata();

    private static HttpRequestDef<DownloadSchemaMetadataRequest, DownloadSchemaMetadataResponse> genForDownloadSchemaMetadata() {
        // basic
        HttpRequestDef.Builder<DownloadSchemaMetadataRequest, DownloadSchemaMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadSchemaMetadataRequest.class, DownloadSchemaMetadataResponse.class)
            .withName("DownloadSchemaMetadata")
            .withUri("/v3/{project_id}/instances/{instance_id}/schema-metadata")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadSchemaMetadataRequest::getInstanceId,
                DownloadSchemaMetadataRequest::setInstanceId));

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

    public static final HttpRequestDef<ExpandDdmInstanceNodesRequest, ExpandDdmInstanceNodesResponse> expandDdmInstanceNodes =
        genForExpandDdmInstanceNodes();

    private static HttpRequestDef<ExpandDdmInstanceNodesRequest, ExpandDdmInstanceNodesResponse> genForExpandDdmInstanceNodes() {
        // basic
        HttpRequestDef.Builder<ExpandDdmInstanceNodesRequest, ExpandDdmInstanceNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExpandDdmInstanceNodesRequest.class, ExpandDdmInstanceNodesResponse.class)
            .withName("ExpandDdmInstanceNodes")
            .withUri("/v3/{project_id}/instances/{instance_id}/nodes")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandDdmInstanceNodesRequest::getInstanceId,
                ExpandDdmInstanceNodesRequest::setInstanceId));
        builder.<ExpandDdmInstanceNodesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandDdmInstanceNodesRequestBody.class),
            f -> f.withMarshaller(ExpandDdmInstanceNodesRequest::getBody, ExpandDdmInstanceNodesRequest::setBody));

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

    public static final HttpRequestDef<ListAvailableRdsRequest, ListAvailableRdsResponse> listAvailableRds =
        genForListAvailableRds();

    private static HttpRequestDef<ListAvailableRdsRequest, ListAvailableRdsResponse> genForListAvailableRds() {
        // basic
        HttpRequestDef.Builder<ListAvailableRdsRequest, ListAvailableRdsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableRdsRequest.class, ListAvailableRdsResponse.class)
                .withName("ListAvailableRds")
                .withUri("/v3/{project_id}/instances/{instance_id}/available-data-nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableRdsRequest::getInstanceId, ListAvailableRdsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableRdsForMigrateRequest, ListAvailableRdsForMigrateResponse> listAvailableRdsForMigrate =
        genForListAvailableRdsForMigrate();

    private static HttpRequestDef<ListAvailableRdsForMigrateRequest, ListAvailableRdsForMigrateResponse> genForListAvailableRdsForMigrate() {
        // basic
        HttpRequestDef.Builder<ListAvailableRdsForMigrateRequest, ListAvailableRdsForMigrateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAvailableRdsForMigrateRequest.class,
                    ListAvailableRdsForMigrateResponse.class)
                .withName("ListAvailableRdsForMigrate")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/available-data-nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableRdsForMigrateRequest::getInstanceId,
                ListAvailableRdsForMigrateRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableRdsForMigrateRequest::getDbName,
                ListAvailableRdsForMigrateRequest::setDbName));

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

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForListBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForListBackups() {
        // basic
        HttpRequestDef.Builder<ListBackupsRequest, ListBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupsRequest.class, ListBackupsResponse.class)
                .withName("ListBackups")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests

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

    public static final HttpRequestDef<ListDdmEnginesRequest, ListDdmEnginesResponse> listDdmEngines =
        genForListDdmEngines();

    private static HttpRequestDef<ListDdmEnginesRequest, ListDdmEnginesResponse> genForListDdmEngines() {
        // basic
        HttpRequestDef.Builder<ListDdmEnginesRequest, ListDdmEnginesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDdmEnginesRequest.class, ListDdmEnginesResponse.class)
                .withName("ListDdmEngines")
                .withUri("/v3/{project_id}/engines")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDdmEnginesRequest::getOffset, ListDdmEnginesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDdmEnginesRequest::getLimit, ListDdmEnginesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDdmFlavorsRequest, ListDdmFlavorsResponse> listDdmFlavors =
        genForListDdmFlavors();

    private static HttpRequestDef<ListDdmFlavorsRequest, ListDdmFlavorsResponse> genForListDdmFlavors() {
        // basic
        HttpRequestDef.Builder<ListDdmFlavorsRequest, ListDdmFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDdmFlavorsRequest.class, ListDdmFlavorsResponse.class)
                .withName("ListDdmFlavors")
                .withUri("/v3/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDdmFlavorsRequest::getOffset, ListDdmFlavorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDdmFlavorsRequest::getLimit, ListDdmFlavorsRequest::setLimit));
        builder.<String>withRequestField("engine_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDdmFlavorsRequest::getEngineId, ListDdmFlavorsRequest::setEngineId));
        builder.<String>withRequestField("engine_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDdmFlavorsRequest::getEngineVersion, ListDdmFlavorsRequest::setEngineVersion));
        builder.<String>withRequestField("available_zones",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDdmFlavorsRequest::getAvailableZones, ListDdmFlavorsRequest::setAvailableZones));

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

    public static final HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogs = genForListSlowLogs();

    private static HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> genForListSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListSlowLogsRequest, ListSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogsRequest.class, ListSlowLogsResponse.class)
                .withName("ListSlowLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/slow-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getInstanceId, ListSlowLogsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getOffset, ListSlowLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getLimit, ListSlowLogsRequest::setLimit));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getStartDate, ListSlowLogsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getEndDate, ListSlowLogsRequest::setEndDate));

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

    public static final HttpRequestDef<MigrateLogicDbRequest, MigrateLogicDbResponse> migrateLogicDb =
        genForMigrateLogicDb();

    private static HttpRequestDef<MigrateLogicDbRequest, MigrateLogicDbResponse> genForMigrateLogicDb() {
        // basic
        HttpRequestDef.Builder<MigrateLogicDbRequest, MigrateLogicDbResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateLogicDbRequest.class, MigrateLogicDbResponse.class)
                .withName("MigrateLogicDb")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateLogicDbRequest::getInstanceId, MigrateLogicDbRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateLogicDbRequest::getDbName, MigrateLogicDbRequest::setDbName));
        builder.<MigrateLogicDbOpenReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateLogicDbOpenReq.class),
            f -> f.withMarshaller(MigrateLogicDbRequest::getBody, MigrateLogicDbRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateResultsRequest, MigrateResultsResponse> migrateResults =
        genForMigrateResults();

    private static HttpRequestDef<MigrateResultsRequest, MigrateResultsResponse> genForMigrateResults() {
        // basic
        HttpRequestDef.Builder<MigrateResultsRequest, MigrateResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, MigrateResultsRequest.class, MigrateResultsResponse.class)
                .withName("MigrateResults")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateResultsRequest::getInstanceId, MigrateResultsRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateResultsRequest::getDbName, MigrateResultsRequest::setDbName));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateResultsRequest::getJobId, MigrateResultsRequest::setJobId));

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

    public static final HttpRequestDef<Restore2ExistRequest, Restore2ExistResponse> restore2Exist =
        genForRestore2Exist();

    private static HttpRequestDef<Restore2ExistRequest, Restore2ExistResponse> genForRestore2Exist() {
        // basic
        HttpRequestDef.Builder<Restore2ExistRequest, Restore2ExistResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, Restore2ExistRequest.class, Restore2ExistResponse.class)
                .withName("Restore2Exist")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/recovery")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Restore2ExistRequest::getInstanceId, Restore2ExistRequest::setInstanceId));
        builder.<RestoreInst2ExistReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreInst2ExistReq.class),
            f -> f.withMarshaller(Restore2ExistRequest::getBody, Restore2ExistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreMetadataRequest, RestoreMetadataResponse> restoreMetadata =
        genForRestoreMetadata();

    private static HttpRequestDef<RestoreMetadataRequest, RestoreMetadataResponse> genForRestoreMetadata() {
        // basic
        HttpRequestDef.Builder<RestoreMetadataRequest, RestoreMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreMetadataRequest.class, RestoreMetadataResponse.class)
                .withName("RestoreMetadata")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/metadata-recovery")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreMetadataRequest::getInstanceId, RestoreMetadataRequest::setInstanceId));
        builder.<RestoreMetaData2ExistReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreMetaData2ExistReq.class),
            f -> f.withMarshaller(RestoreMetadataRequest::getBody, RestoreMetadataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryMigrationRequest, RetryMigrationResponse> retryMigration =
        genForRetryMigration();

    private static HttpRequestDef<RetryMigrationRequest, RetryMigrationResponse> genForRetryMigration() {
        // basic
        HttpRequestDef.Builder<RetryMigrationRequest, RetryMigrationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RetryMigrationRequest.class, RetryMigrationResponse.class)
                .withName("RetryMigration")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/jobs/{job_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryMigrationRequest::getInstanceId, RetryMigrationRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryMigrationRequest::getDbName, RetryMigrationRequest::setDbName));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryMigrationRequest::getJobId, RetryMigrationRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackMigrationRequest, RollbackMigrationResponse> rollbackMigration =
        genForRollbackMigration();

    private static HttpRequestDef<RollbackMigrationRequest, RollbackMigrationResponse> genForRollbackMigration() {
        // basic
        HttpRequestDef.Builder<RollbackMigrationRequest, RollbackMigrationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RollbackMigrationRequest.class, RollbackMigrationResponse.class)
                .withName("RollbackMigration")
                .withUri(
                    "/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/jobs/{job_id}/rollback")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackMigrationRequest::getInstanceId, RollbackMigrationRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackMigrationRequest::getDbName, RollbackMigrationRequest::setDbName));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackMigrationRequest::getJobId, RollbackMigrationRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvalibleDdmsRequest, ShowAvalibleDdmsResponse> showAvalibleDdms =
        genForShowAvalibleDdms();

    private static HttpRequestDef<ShowAvalibleDdmsRequest, ShowAvalibleDdmsResponse> genForShowAvalibleDdms() {
        // basic
        HttpRequestDef.Builder<ShowAvalibleDdmsRequest, ShowAvalibleDdmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAvalibleDdmsRequest.class, ShowAvalibleDdmsResponse.class)
                .withName("ShowAvalibleDdms")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/restorable-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvalibleDdmsRequest::getInstanceId, ShowAvalibleDdmsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvalibleRdsRequest, ShowAvalibleRdsResponse> showAvalibleRds =
        genForShowAvalibleRds();

    private static HttpRequestDef<ShowAvalibleRdsRequest, ShowAvalibleRdsResponse> genForShowAvalibleRds() {
        // basic
        HttpRequestDef.Builder<ShowAvalibleRdsRequest, ShowAvalibleRdsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAvalibleRdsRequest.class, ShowAvalibleRdsResponse.class)
                .withName("ShowAvalibleRds")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/restorable-data-node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvalibleRdsRequest::getInstanceId, ShowAvalibleRdsRequest::setInstanceId));
        builder.<String>withRequestField("target_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvalibleRdsRequest::getTargetInstanceId,
                ShowAvalibleRdsRequest::setTargetInstanceId));
        builder.<String>withRequestField("source_dn_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvalibleRdsRequest::getSourceDnInstanceId,
                ShowAvalibleRdsRequest::setSourceDnInstanceId));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvalibleRdsRequest::getRestoreTime, ShowAvalibleRdsRequest::setRestoreTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvalibleTimeRequest, ShowAvalibleTimeResponse> showAvalibleTime =
        genForShowAvalibleTime();

    private static HttpRequestDef<ShowAvalibleTimeRequest, ShowAvalibleTimeResponse> genForShowAvalibleTime() {
        // basic
        HttpRequestDef.Builder<ShowAvalibleTimeRequest, ShowAvalibleTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAvalibleTimeRequest.class, ShowAvalibleTimeResponse.class)
                .withName("ShowAvalibleTime")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/restorable-time-interval")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvalibleTimeRequest::getInstanceId, ShowAvalibleTimeRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupRequest, ShowBackupResponse> showBackup = genForShowBackup();

    private static HttpRequestDef<ShowBackupRequest, ShowBackupResponse> genForShowBackup() {
        // basic
        HttpRequestDef.Builder<ShowBackupRequest, ShowBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupRequest.class, ShowBackupResponse.class)
                .withName("ShowBackup")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRequest::getInstanceId, ShowBackupRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRequest::getBackupId, ShowBackupRequest::setBackupId));

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

    public static final HttpRequestDef<ShowDdmJobResultRequest, ShowDdmJobResultResponse> showDdmJobResult =
        genForShowDdmJobResult();

    private static HttpRequestDef<ShowDdmJobResultRequest, ShowDdmJobResultResponse> genForShowDdmJobResult() {
        // basic
        HttpRequestDef.Builder<ShowDdmJobResultRequest, ShowDdmJobResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDdmJobResultRequest.class, ShowDdmJobResultResponse.class)
                .withName("ShowDdmJobResult")
                .withUri("/v3/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDdmJobResultRequest::getJobId, ShowDdmJobResultRequest::setJobId));

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

    public static final HttpRequestDef<ShowInstanceDatabaseRequest, ShowInstanceDatabaseResponse> showInstanceDatabase =
        genForShowInstanceDatabase();

    private static HttpRequestDef<ShowInstanceDatabaseRequest, ShowInstanceDatabaseResponse> genForShowInstanceDatabase() {
        // basic
        HttpRequestDef.Builder<ShowInstanceDatabaseRequest, ShowInstanceDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceDatabaseRequest.class, ShowInstanceDatabaseResponse.class)
            .withName("ShowInstanceDatabase")
            .withUri("/v3/{project_id}/instances/{instance_id}/databases/{database_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDatabaseRequest::getInstanceId,
                ShowInstanceDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDatabaseRequest::getDatabaseName,
                ShowInstanceDatabaseRequest::setDatabaseName));

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

    public static final HttpRequestDef<ShowRelatedDnsRequest, ShowRelatedDnsResponse> showRelatedDns =
        genForShowRelatedDns();

    private static HttpRequestDef<ShowRelatedDnsRequest, ShowRelatedDnsResponse> genForShowRelatedDns() {
        // basic
        HttpRequestDef.Builder<ShowRelatedDnsRequest, ShowRelatedDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRelatedDnsRequest.class, ShowRelatedDnsResponse.class)
                .withName("ShowRelatedDns")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/related-dn")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRelatedDnsRequest::getInstanceId, ShowRelatedDnsRequest::setInstanceId));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRelatedDnsRequest::getRestoreTime, ShowRelatedDnsRequest::setRestoreTime));

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

    public static final HttpRequestDef<SwitchRouteRequest, SwitchRouteResponse> switchRoute = genForSwitchRoute();

    private static HttpRequestDef<SwitchRouteRequest, SwitchRouteResponse> genForSwitchRoute() {
        // basic
        HttpRequestDef.Builder<SwitchRouteRequest, SwitchRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchRouteRequest.class, SwitchRouteResponse.class)
                .withName("SwitchRoute")
                .withUri(
                    "/v3/{project_id}/instances/{instance_id}/databases/{db_name}/migration/jobs/{job_id}/route-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchRouteRequest::getInstanceId, SwitchRouteRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchRouteRequest::getDbName, SwitchRouteRequest::setDbName));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchRouteRequest::getJobId, SwitchRouteRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSslRequest, SwitchSslResponse> switchSsl = genForSwitchSsl();

    private static HttpRequestDef<SwitchSslRequest, SwitchSslResponse> genForSwitchSsl() {
        // basic
        HttpRequestDef.Builder<SwitchSslRequest, SwitchSslResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchSslRequest.class, SwitchSslResponse.class)
                .withName("SwitchSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/switch-ssl")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSslRequest::getInstanceId, SwitchSslRequest::setInstanceId));
        builder.<SwitchSslOpenRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSslOpenRequest.class),
            f -> f.withMarshaller(SwitchSslRequest::getBody, SwitchSslRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(SwitchSslResponse::getBody, SwitchSslResponse::setBody));

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

    public static final HttpRequestDef<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePort =
        genForUpdateInstancePort();

    private static HttpRequestDef<UpdateInstancePortRequest, UpdateInstancePortResponse> genForUpdateInstancePort() {
        // basic
        HttpRequestDef.Builder<UpdateInstancePortRequest, UpdateInstancePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstancePortRequest.class, UpdateInstancePortResponse.class)
                .withName("UpdateInstancePort")
                .withUri("/v3/{project_id}/instances/{instance_id}/port")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstancePortRequest::getInstanceId, UpdateInstancePortRequest::setInstanceId));
        builder.<UpdatePortRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortRequest.class),
            f -> f.withMarshaller(UpdateInstancePortRequest::getBody, UpdateInstancePortRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateInstancePortResponse::getBody, UpdateInstancePortResponse::setBody));

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

    public static final HttpRequestDef<UploadSchemaMetadataRequest, UploadSchemaMetadataResponse> uploadSchemaMetadata =
        genForUploadSchemaMetadata();

    private static HttpRequestDef<UploadSchemaMetadataRequest, UploadSchemaMetadataResponse> genForUploadSchemaMetadata() {
        // basic
        HttpRequestDef.Builder<UploadSchemaMetadataRequest, UploadSchemaMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UploadSchemaMetadataRequest.class, UploadSchemaMetadataResponse.class)
            .withName("UploadSchemaMetadata")
            .withUri("/v3/{project_id}/instances/{instance_id}/schema-metadata")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadSchemaMetadataRequest::getInstanceId,
                UploadSchemaMetadataRequest::setInstanceId));
        builder.<LoadSchemaMetadataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LoadSchemaMetadataReq.class),
            f -> f.withMarshaller(UploadSchemaMetadataRequest::getBody, UploadSchemaMetadataRequest::setBody));

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
