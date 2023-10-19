package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dcs.v2.model.AclAccountModifyPasswordBody;
import com.huaweicloud.sdk.dcs.v2.model.AclAccountResetPasswordBody;
import com.huaweicloud.sdk.dcs.v2.model.AclAccountRoleModifyBody;
import com.huaweicloud.sdk.dcs.v2.model.AutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.BackupInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteBody;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchShowNodesInformationRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchShowNodesInformationResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksBody;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ChangeInstanceStatusBody;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyRequest;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyResponse;
import com.huaweicloud.sdk.dcs.v2.model.CopyInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.CopyInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateAclAccountRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateAclAccountRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateAclAccountResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateAutoExpireScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateAutoExpireScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateBigkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateBigkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateConnectivityTestRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateConnectivityTestRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateConnectivityTestResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateCustomTemplateBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateCustomTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateCustomTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateDiagnosisTaskBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateDiagnosisTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateDiagnosisTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateHotkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateHotkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateMigrationTaskBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateOnlineMigrationTaskBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateOnlineMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateOnlineMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateOrDeleteInstanceTags;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogDownloadLinkRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogDownloadLinkResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteAclAccountRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteAclAccountResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBackupFileRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBackupFileResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBigkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBigkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteConfigTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteConfigTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteHotkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteHotkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteIpFromDomainNameRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteIpFromDomainNameResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrateTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteSingleInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteSingleInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.DownloadBackupFilesReq;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteClusterSwitchoverRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteClusterSwitchoverResponse;
import com.huaweicloud.sdk.dcs.v2.model.InstanceReplicationListInfo;
import com.huaweicloud.sdk.dcs.v2.model.ListAclAccountsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListAclAccountsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListBackgroundTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListBackgroundTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListBackupFileLinksRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListBackupFileLinksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListBackupRecordsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListBackupRecordsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListBigkeyScanTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListBigkeyScanTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigHistoriesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigHistoriesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigTemplatesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigTemplatesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListDiagnosisTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListDiagnosisTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListFlavorsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListFlavorsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListGroupReplicationInfoRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListGroupReplicationInfoResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListHotKeyScanTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListHotKeyScanTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMaintenanceWindowsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMaintenanceWindowsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMonitoredObjectsOfInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMonitoredObjectsOfInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMonitoredObjectsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMonitoredObjectsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListNumberOfInstancesInDifferentStatusRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListNumberOfInstancesInDifferentStatusResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListRedislogRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListRedislogResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListRestoreRecordsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListRestoreRecordsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListSlowlogRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListSlowlogResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListStatisticsOfRunningInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListStatisticsOfRunningInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListTagsOfTenantRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListTagsOfTenantResponse;
import com.huaweicloud.sdk.dcs.v2.model.ModifyInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.ModifyInstancePasswordBody;
import com.huaweicloud.sdk.dcs.v2.model.ModifyIpWhitelistBody;
import com.huaweicloud.sdk.dcs.v2.model.ModifyRedisConfigBody;
import com.huaweicloud.sdk.dcs.v2.model.PriorityBody;
import com.huaweicloud.sdk.dcs.v2.model.ResetAclAccountPassWordRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResetAclAccountPassWordResponse;
import com.huaweicloud.sdk.dcs.v2.model.ResetInstancePasswordBody;
import com.huaweicloud.sdk.dcs.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dcs.v2.model.ResizeInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.RestartOrFlushInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.RestartOrFlushInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.RestoreInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.SetOnlineMigrationTaskBody;
import com.huaweicloud.sdk.dcs.v2.model.SetOnlineMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.SetOnlineMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowBigkeyAutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowBigkeyAutoscanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowBigkeyScanTaskDetailsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowBigkeyScanTaskDetailsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowConfigTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowConfigTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowDiagnosisTaskDetailsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowDiagnosisTaskDetailsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowHotkeyAutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowHotkeyAutoscanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowHotkeyTaskDetailsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowHotkeyTaskDetailsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowIpWhitelistRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowIpWhitelistResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowJobInfoRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowJobInfoResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowMigrationTaskStatsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowMigrationTaskStatsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowNodesInformationRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowNodesInformationResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowQuotaOfTenantRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowQuotaOfTenantResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowReplicationStatesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowReplicationStatesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowTagsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowTagsResponse;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskSyncRequest;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskSyncResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountPassWordRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountPassWordResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRemarkRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRemarkRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRemarkResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRoleRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRoleResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateBigkeyAutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateBigkeyAutoscanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigurationsRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigurationsResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateCustomTemplateBody;
import com.huaweicloud.sdk.dcs.v2.model.UpdateHotkeyAutoScanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateHotkeyAutoScanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceBandwidthRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceBandwidthResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateIpWhitelistRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateIpWhitelistResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdatePasswordRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdatePasswordResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSlavePriorityRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSlavePriorityResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DcsMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTags =
        genForbatchCreateOrDeleteTags();

    private static HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> genForbatchCreateOrDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateOrDeleteTagsRequest.class, BatchCreateOrDeleteTagsResponse.class)
            .withName("BatchCreateOrDeleteTags")
            .withUri("/v2/{project_id}/dcs/{instance_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateOrDeleteInstanceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrDeleteInstanceTags.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstances =
        genForbatchDeleteInstances();

    private static HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> genForbatchDeleteInstances() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteInstancesRequest.class, BatchDeleteInstancesResponse.class)
            .withName("BatchDeleteInstances")
            .withUri("/v2/{project_id}/instances")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<Boolean>withRequestField("all_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getAllFailure, (req, v) -> {
                req.setAllFailure(v);
            }));
        builder.<BatchDeleteBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteBody.class),
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> batchShowNodesInformation =
        genForbatchShowNodesInformation();

    private static HttpRequestDef<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> genForbatchShowNodesInformation() {
        // basic
        HttpRequestDef.Builder<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    BatchShowNodesInformationRequest.class,
                    BatchShowNodesInformationResponse.class)
                .withName("BatchShowNodesInformation")
                .withUri("/v2/{project_id}/instances-logical-nodes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowNodesInformationRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowNodesInformationRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> batchStopMigrationTasks =
        genForbatchStopMigrationTasks();

    private static HttpRequestDef<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> genForbatchStopMigrationTasks() {
        // basic
        HttpRequestDef.Builder<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchStopMigrationTasksRequest.class, BatchStopMigrationTasksResponse.class)
            .withName("BatchStopMigrationTasks")
            .withUri("/v2/{project_id}/migration-task/batch-stop")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchStopMigrationTasksBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopMigrationTasksBody.class),
            f -> f.withMarshaller(BatchStopMigrationTasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> changeMasterStandby =
        genForchangeMasterStandby();

    private static HttpRequestDef<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> genForchangeMasterStandby() {
        // basic
        HttpRequestDef.Builder<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeMasterStandbyRequest.class, ChangeMasterStandbyResponse.class)
                .withName("ChangeMasterStandby")
                .withUri("/v2/{project_id}/instances/{instance_id}/swap")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeMasterStandbyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyInstanceRequest, CopyInstanceResponse> copyInstance = genForcopyInstance();

    private static HttpRequestDef<CopyInstanceRequest, CopyInstanceResponse> genForcopyInstance() {
        // basic
        HttpRequestDef.Builder<CopyInstanceRequest, CopyInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyInstanceRequest.class, CopyInstanceResponse.class)
                .withName("CopyInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BackupInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BackupInstanceBody.class),
            f -> f.withMarshaller(CopyInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAclAccountRequest, CreateAclAccountResponse> createAclAccount =
        genForcreateAclAccount();

    private static HttpRequestDef<CreateAclAccountRequest, CreateAclAccountResponse> genForcreateAclAccount() {
        // basic
        HttpRequestDef.Builder<CreateAclAccountRequest, CreateAclAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAclAccountRequest.class, CreateAclAccountResponse.class)
                .withName("CreateAclAccount")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAclAccountRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateAclAccountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAclAccountRequestBody.class),
            f -> f.withMarshaller(CreateAclAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> createAutoExpireScanTask =
        genForcreateAutoExpireScanTask();

    private static HttpRequestDef<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> genForcreateAutoExpireScanTask() {
        // basic
        HttpRequestDef.Builder<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAutoExpireScanTaskRequest.class, CreateAutoExpireScanTaskResponse.class)
                .withName("CreateAutoExpireScanTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/scan-expire-keys-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoExpireScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> createBigkeyScanTask =
        genForcreateBigkeyScanTask();

    private static HttpRequestDef<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> genForcreateBigkeyScanTask() {
        // basic
        HttpRequestDef.Builder<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateBigkeyScanTaskRequest.class, CreateBigkeyScanTaskResponse.class)
            .withName("CreateBigkeyScanTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBigkeyScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectivityTestRequest, CreateConnectivityTestResponse> createConnectivityTest =
        genForcreateConnectivityTest();

    private static HttpRequestDef<CreateConnectivityTestRequest, CreateConnectivityTestResponse> genForcreateConnectivityTest() {
        // basic
        HttpRequestDef.Builder<CreateConnectivityTestRequest, CreateConnectivityTestResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateConnectivityTestRequest.class, CreateConnectivityTestResponse.class)
            .withName("CreateConnectivityTest")
            .withUri("/v2/{project_id}/instance/{instance_id}/connectivity-test")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectivityTestRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateConnectivityTestRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateConnectivityTestRequestBody.class),
            f -> f.withMarshaller(CreateConnectivityTestRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomTemplateRequest, CreateCustomTemplateResponse> createCustomTemplate =
        genForcreateCustomTemplate();

    private static HttpRequestDef<CreateCustomTemplateRequest, CreateCustomTemplateResponse> genForcreateCustomTemplate() {
        // basic
        HttpRequestDef.Builder<CreateCustomTemplateRequest, CreateCustomTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCustomTemplateRequest.class, CreateCustomTemplateResponse.class)
            .withName("CreateCustomTemplate")
            .withUri("/v2/{project_id}/config-templates")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateCustomTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomTemplateBody.class),
            f -> f.withMarshaller(CreateCustomTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTask =
        genForcreateDiagnosisTask();

    private static HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> genForcreateDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDiagnosisTaskRequest.class, CreateDiagnosisTaskResponse.class)
                .withName("CreateDiagnosisTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/diagnosis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateDiagnosisTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDiagnosisTaskBody.class),
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> createHotkeyScanTask =
        genForcreateHotkeyScanTask();

    private static HttpRequestDef<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> genForcreateHotkeyScanTask() {
        // basic
        HttpRequestDef.Builder<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateHotkeyScanTaskRequest.class, CreateHotkeyScanTaskResponse.class)
            .withName("CreateHotkeyScanTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotkeyScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMigrationTaskRequest, CreateMigrationTaskResponse> createMigrationTask =
        genForcreateMigrationTask();

    private static HttpRequestDef<CreateMigrationTaskRequest, CreateMigrationTaskResponse> genForcreateMigrationTask() {
        // basic
        HttpRequestDef.Builder<CreateMigrationTaskRequest, CreateMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMigrationTaskRequest.class, CreateMigrationTaskResponse.class)
                .withName("CreateMigrationTask")
                .withUri("/v2/{project_id}/migration-task")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateMigrationTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMigrationTaskBody.class),
            f -> f.withMarshaller(CreateMigrationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> createOnlineMigrationTask =
        genForcreateOnlineMigrationTask();

    private static HttpRequestDef<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> genForcreateOnlineMigrationTask() {
        // basic
        HttpRequestDef.Builder<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateOnlineMigrationTaskRequest.class,
                    CreateOnlineMigrationTaskResponse.class)
                .withName("CreateOnlineMigrationTask")
                .withUri("/v2/{project_id}/migration/instance")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateOnlineMigrationTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOnlineMigrationTaskBody.class),
            f -> f.withMarshaller(CreateOnlineMigrationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRedislogRequest, CreateRedislogResponse> createRedislog =
        genForcreateRedislog();

    private static HttpRequestDef<CreateRedislogRequest, CreateRedislogResponse> genForcreateRedislog() {
        // basic
        HttpRequestDef.Builder<CreateRedislogRequest, CreateRedislogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRedislogRequest.class, CreateRedislogResponse.class)
                .withName("CreateRedislog")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateRedislogRequest.QueryTimeEnum>withRequestField("query_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRedislogRequest.QueryTimeEnum.class),
            f -> f.withMarshaller(CreateRedislogRequest::getQueryTime, (req, v) -> {
                req.setQueryTime(v);
            }));
        builder.<String>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            }));
        builder.<String>withRequestField("replication_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogRequest::getReplicationId, (req, v) -> {
                req.setReplicationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> createRedislogDownloadLink =
        genForcreateRedislogDownloadLink();

    private static HttpRequestDef<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> genForcreateRedislogDownloadLink() {
        // basic
        HttpRequestDef.Builder<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRedislogDownloadLinkRequest.class,
                    CreateRedislogDownloadLinkResponse.class)
                .withName("CreateRedislogDownloadLink")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog/{id}/links")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogDownloadLinkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogDownloadLinkRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclAccountRequest, DeleteAclAccountResponse> deleteAclAccount =
        genFordeleteAclAccount();

    private static HttpRequestDef<DeleteAclAccountRequest, DeleteAclAccountResponse> genFordeleteAclAccount() {
        // basic
        HttpRequestDef.Builder<DeleteAclAccountRequest, DeleteAclAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAclAccountRequest.class, DeleteAclAccountResponse.class)
                .withName("DeleteAclAccount")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclAccountRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclAccountRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTask =
        genFordeleteBackgroundTask();

    private static HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> genFordeleteBackgroundTask() {
        // basic
        HttpRequestDef.Builder<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBackgroundTaskRequest.class, DeleteBackgroundTaskResponse.class)
            .withName("DeleteBackgroundTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupFileRequest, DeleteBackupFileResponse> deleteBackupFile =
        genFordeleteBackupFile();

    private static HttpRequestDef<DeleteBackupFileRequest, DeleteBackupFileResponse> genFordeleteBackupFile() {
        // basic
        HttpRequestDef.Builder<DeleteBackupFileRequest, DeleteBackupFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupFileRequest.class, DeleteBackupFileResponse.class)
                .withName("DeleteBackupFile")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupFileRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupFileRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> deleteBigkeyScanTask =
        genFordeleteBigkeyScanTask();

    private static HttpRequestDef<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> genFordeleteBigkeyScanTask() {
        // basic
        HttpRequestDef.Builder<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBigkeyScanTaskRequest.class, DeleteBigkeyScanTaskResponse.class)
            .withName("DeleteBigkeyScanTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task/{bigkey_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBigkeyScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("bigkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBigkeyScanTaskRequest::getBigkeyId, (req, v) -> {
                req.setBigkeyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse> deleteConfigTemplate =
        genFordeleteConfigTemplate();

    private static HttpRequestDef<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse> genFordeleteConfigTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConfigTemplateRequest.class, DeleteConfigTemplateResponse.class)
            .withName("DeleteConfigTemplate")
            .withUri("/v2/{project_id}/config-templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> deleteHotkeyScanTask =
        genFordeleteHotkeyScanTask();

    private static HttpRequestDef<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> genFordeleteHotkeyScanTask() {
        // basic
        HttpRequestDef.Builder<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteHotkeyScanTaskRequest.class, DeleteHotkeyScanTaskResponse.class)
            .withName("DeleteHotkeyScanTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task/{hotkey_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotkeyScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("hotkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotkeyScanTaskRequest::getHotkeyId, (req, v) -> {
                req.setHotkeyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> deleteIpFromDomainName =
        genFordeleteIpFromDomainName();

    private static HttpRequestDef<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> genFordeleteIpFromDomainName() {
        // basic
        HttpRequestDef.Builder<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteIpFromDomainNameRequest.class, DeleteIpFromDomainNameResponse.class)
            .withName("DeleteIpFromDomainName")
            .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group_id}/replications/{node_id}/remove-ip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> deleteMigrationTask =
        genFordeleteMigrationTask();

    private static HttpRequestDef<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> genFordeleteMigrationTask() {
        // basic
        HttpRequestDef.Builder<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMigrationTaskRequest.class, DeleteMigrationTaskResponse.class)
            .withName("DeleteMigrationTask")
            .withUri("/v2/{project_id}/migration-tasks/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteMigrateTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteMigrateTaskRequest.class),
            f -> f.withMarshaller(DeleteMigrationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> deleteSingleInstance =
        genFordeleteSingleInstance();

    private static HttpRequestDef<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> genFordeleteSingleInstance() {
        // basic
        HttpRequestDef.Builder<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSingleInstanceRequest.class, DeleteSingleInstanceResponse.class)
            .withName("DeleteSingleInstance")
            .withUri("/v2/{project_id}/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSingleInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse> executeClusterSwitchover =
        genForexecuteClusterSwitchover();

    private static HttpRequestDef<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse> genForexecuteClusterSwitchover() {
        // basic
        HttpRequestDef.Builder<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExecuteClusterSwitchoverRequest.class, ExecuteClusterSwitchoverResponse.class)
                .withName("ExecuteClusterSwitchover")
                .withUri(
                    "/v2/{project_id}/instance/{instance_id}/groups/{group_id}/replications/{node_id}/async-switchover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteClusterSwitchoverRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteClusterSwitchoverRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteClusterSwitchoverRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclAccountsRequest, ListAclAccountsResponse> listAclAccounts =
        genForlistAclAccounts();

    private static HttpRequestDef<ListAclAccountsRequest, ListAclAccountsResponse> genForlistAclAccounts() {
        // basic
        HttpRequestDef.Builder<ListAclAccountsRequest, ListAclAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAclAccountsRequest.class, ListAclAccountsResponse.class)
                .withName("ListAclAccounts")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclAccountsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForlistAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForlistAvailableZones() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesRequest, ListAvailableZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableZonesRequest.class, ListAvailableZonesResponse.class)
                .withName("ListAvailableZones")
                .withUri("/v2/available-zones")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackgroundTaskRequest, ListBackgroundTaskResponse> listBackgroundTask =
        genForlistBackgroundTask();

    private static HttpRequestDef<ListBackgroundTaskRequest, ListBackgroundTaskResponse> genForlistBackgroundTask() {
        // basic
        HttpRequestDef.Builder<ListBackgroundTaskRequest, ListBackgroundTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackgroundTaskRequest.class, ListBackgroundTaskResponse.class)
                .withName("ListBackgroundTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupFileLinksRequest, ListBackupFileLinksResponse> listBackupFileLinks =
        genForlistBackupFileLinks();

    private static HttpRequestDef<ListBackupFileLinksRequest, ListBackupFileLinksResponse> genForlistBackupFileLinks() {
        // basic
        HttpRequestDef.Builder<ListBackupFileLinksRequest, ListBackupFileLinksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBackupFileLinksRequest.class, ListBackupFileLinksResponse.class)
                .withName("ListBackupFileLinks")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups/{backup_id}/links")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupFileLinksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupFileLinksRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<DownloadBackupFilesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadBackupFilesReq.class),
            f -> f.withMarshaller(ListBackupFileLinksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupRecordsRequest, ListBackupRecordsResponse> listBackupRecords =
        genForlistBackupRecords();

    private static HttpRequestDef<ListBackupRecordsRequest, ListBackupRecordsResponse> genForlistBackupRecords() {
        // basic
        HttpRequestDef.Builder<ListBackupRecordsRequest, ListBackupRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupRecordsRequest.class, ListBackupRecordsResponse.class)
                .withName("ListBackupRecords")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> listBigkeyScanTasks =
        genForlistBigkeyScanTasks();

    private static HttpRequestDef<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> genForlistBigkeyScanTasks() {
        // basic
        HttpRequestDef.Builder<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBigkeyScanTasksRequest.class, ListBigkeyScanTasksResponse.class)
                .withName("ListBigkeyScanTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListBigkeyScanTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBigkeyScanTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigHistoriesRequest, ListConfigHistoriesResponse> listConfigHistories =
        genForlistConfigHistories();

    private static HttpRequestDef<ListConfigHistoriesRequest, ListConfigHistoriesResponse> genForlistConfigHistories() {
        // basic
        HttpRequestDef.Builder<ListConfigHistoriesRequest, ListConfigHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigHistoriesRequest.class, ListConfigHistoriesResponse.class)
                .withName("ListConfigHistories")
                .withUri("/v2/{project_id}/instances/{instance_id}/config-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigHistoriesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigTemplatesRequest, ListConfigTemplatesResponse> listConfigTemplates =
        genForlistConfigTemplates();

    private static HttpRequestDef<ListConfigTemplatesRequest, ListConfigTemplatesResponse> genForlistConfigTemplates() {
        // basic
        HttpRequestDef.Builder<ListConfigTemplatesRequest, ListConfigTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigTemplatesRequest.class, ListConfigTemplatesResponse.class)
                .withName("ListConfigTemplates")
                .withUri("/v2/{project_id}/config-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<ListConfigTemplatesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConfigTemplatesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("engine_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getEngineVersion, (req, v) -> {
                req.setEngineVersion(v);
            }));
        builder.<String>withRequestField("cache_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getCacheMode, (req, v) -> {
                req.setCacheMode(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations =
        genForlistConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForlistConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v2/{project_id}/instances/{instance_id}/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasks =
        genForlistDiagnosisTasks();

    private static HttpRequestDef<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> genForlistDiagnosisTasks() {
        // basic
        HttpRequestDef.Builder<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDiagnosisTasksRequest.class, ListDiagnosisTasksResponse.class)
                .withName("ListDiagnosisTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/diagnosis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v2/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            }));
        builder.<String>withRequestField("cache_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCacheMode, (req, v) -> {
                req.setCacheMode(v);
            }));
        builder.<String>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("engine_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngineVersion, (req, v) -> {
                req.setEngineVersion(v);
            }));
        builder.<ListFlavorsRequest.CpuTypeEnum>withRequestField("cpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorsRequest.CpuTypeEnum.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCpuType, (req, v) -> {
                req.setCpuType(v);
            }));
        builder.<String>withRequestField("capacity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCapacity, (req, v) -> {
                req.setCapacity(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> listGroupReplicationInfo =
        genForlistGroupReplicationInfo();

    private static HttpRequestDef<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> genForlistGroupReplicationInfo() {
        // basic
        HttpRequestDef.Builder<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListGroupReplicationInfoRequest.class, ListGroupReplicationInfoResponse.class)
                .withName("ListGroupReplicationInfo")
                .withUri("/v2/{project_id}/instance/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupReplicationInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> listHotKeyScanTasks =
        genForlistHotKeyScanTasks();

    private static HttpRequestDef<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> genForlistHotKeyScanTasks() {
        // basic
        HttpRequestDef.Builder<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHotKeyScanTasksRequest.class, ListHotKeyScanTasksResponse.class)
                .withName("ListHotKeyScanTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListHotKeyScanTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHotKeyScanTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getIncludeFailure, (req, v) -> {
                req.setIncludeFailure(v);
            }));
        builder.<String>withRequestField("include_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getIncludeDelete, (req, v) -> {
                req.setIncludeDelete(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("name_equal",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getNameEqual, (req, v) -> {
                req.setNameEqual(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> listMaintenanceWindows =
        genForlistMaintenanceWindows();

    private static HttpRequestDef<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> genForlistMaintenanceWindows() {
        // basic
        HttpRequestDef.Builder<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMaintenanceWindowsRequest.class, ListMaintenanceWindowsResponse.class)
            .withName("ListMaintenanceWindows")
            .withUri("/v2/instances/maintain-windows")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMigrationTaskRequest, ListMigrationTaskResponse> listMigrationTask =
        genForlistMigrationTask();

    private static HttpRequestDef<ListMigrationTaskRequest, ListMigrationTaskResponse> genForlistMigrationTask() {
        // basic
        HttpRequestDef.Builder<ListMigrationTaskRequest, ListMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMigrationTaskRequest.class, ListMigrationTaskResponse.class)
                .withName("ListMigrationTask")
                .withUri("/v2/{project_id}/migration-tasks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMigrationTaskRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> listMonitoredObjects =
        genForlistMonitoredObjects();

    private static HttpRequestDef<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> genForlistMonitoredObjects() {
        // basic
        HttpRequestDef.Builder<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMonitoredObjectsRequest.class, ListMonitoredObjectsResponse.class)
            .withName("ListMonitoredObjects")
            .withUri("/v2/{project_id}/dims/monitored-objects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getDimName, (req, v) -> {
                req.setDimName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstance =
        genForlistMonitoredObjectsOfInstance();

    private static HttpRequestDef<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> genForlistMonitoredObjectsOfInstance() {
        // basic
        HttpRequestDef.Builder<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMonitoredObjectsOfInstanceRequest.class,
                    ListMonitoredObjectsOfInstanceResponse.class)
                .withName("ListMonitoredObjectsOfInstance")
                .withUri("/v2/{project_id}/dims/monitored-objects/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitoredObjectsOfInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitoredObjectsOfInstanceRequest::getDimName, (req, v) -> {
                req.setDimName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatus =
        genForlistNumberOfInstancesInDifferentStatus();

    private static HttpRequestDef<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> genForlistNumberOfInstancesInDifferentStatus() {
        // basic
        HttpRequestDef.Builder<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNumberOfInstancesInDifferentStatusRequest.class,
                    ListNumberOfInstancesInDifferentStatusResponse.class)
                .withName("ListNumberOfInstancesInDifferentStatus")
                .withUri("/v2/{project_id}/instances/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNumberOfInstancesInDifferentStatusRequest::getIncludeFailure, (req, v) -> {
                req.setIncludeFailure(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRedislogRequest, ListRedislogResponse> listRedislog = genForlistRedislog();

    private static HttpRequestDef<ListRedislogRequest, ListRedislogResponse> genForlistRedislog() {
        // basic
        HttpRequestDef.Builder<ListRedislogRequest, ListRedislogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRedislogRequest.class, ListRedislogResponse.class)
                .withName("ListRedislog")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRedislogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRedislogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRedislogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRedislogRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreRecordsRequest, ListRestoreRecordsResponse> listRestoreRecords =
        genForlistRestoreRecords();

    private static HttpRequestDef<ListRestoreRecordsRequest, ListRestoreRecordsResponse> genForlistRestoreRecords() {
        // basic
        HttpRequestDef.Builder<ListRestoreRecordsRequest, ListRestoreRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreRecordsRequest.class, ListRestoreRecordsResponse.class)
                .withName("ListRestoreRecords")
                .withUri("/v2/{project_id}/instances/{instance_id}/restores")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowlogRequest, ListSlowlogResponse> listSlowlog = genForlistSlowlog();

    private static HttpRequestDef<ListSlowlogRequest, ListSlowlogResponse> genForlistSlowlog() {
        // basic
        HttpRequestDef.Builder<ListSlowlogRequest, ListSlowlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowlogRequest.class, ListSlowlogResponse.class)
                .withName("ListSlowlog")
                .withUri("/v2/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowlogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowlogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListSlowlogRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowlogRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListSlowlogRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListSlowlogRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowlogRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListSlowlogRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstances =
        genForlistStatisticsOfRunningInstances();

    private static HttpRequestDef<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> genForlistStatisticsOfRunningInstances() {
        // basic
        HttpRequestDef.Builder<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStatisticsOfRunningInstancesRequest.class,
                    ListStatisticsOfRunningInstancesResponse.class)
                .withName("ListStatisticsOfRunningInstances")
                .withUri("/v2/{project_id}/instances/statistic")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsOfTenantRequest, ListTagsOfTenantResponse> listTagsOfTenant =
        genForlistTagsOfTenant();

    private static HttpRequestDef<ListTagsOfTenantRequest, ListTagsOfTenantResponse> genForlistTagsOfTenant() {
        // basic
        HttpRequestDef.Builder<ListTagsOfTenantRequest, ListTagsOfTenantResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsOfTenantRequest.class, ListTagsOfTenantResponse.class)
                .withName("ListTagsOfTenant")
                .withUri("/v2/{project_id}/dcs/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse> resetAclAccountPassWord =
        genForresetAclAccountPassWord();

    private static HttpRequestDef<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse> genForresetAclAccountPassWord() {
        // basic
        HttpRequestDef.Builder<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ResetAclAccountPassWordRequest.class, ResetAclAccountPassWordResponse.class)
            .withName("ResetAclAccountPassWord")
            .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}/password/reset")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAclAccountPassWordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAclAccountPassWordRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<AclAccountResetPasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclAccountResetPasswordBody.class),
            f -> f.withMarshaller(ResetAclAccountPassWordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v2/{project_id}/instances/{instance_id}/password/reset")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResetInstancePasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetInstancePasswordBody.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResizeInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceBody.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> restartOrFlushInstances =
        genForrestartOrFlushInstances();

    private static HttpRequestDef<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> genForrestartOrFlushInstances() {
        // basic
        HttpRequestDef.Builder<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RestartOrFlushInstancesRequest.class, RestartOrFlushInstancesResponse.class)
            .withName("RestartOrFlushInstances")
            .withUri("/v2/{project_id}/instances/status")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeInstanceStatusBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeInstanceStatusBody.class),
            f -> f.withMarshaller(RestartOrFlushInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstance =
        genForrestoreInstance();

    private static HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> genForrestoreInstance() {
        // basic
        HttpRequestDef.Builder<RestoreInstanceRequest, RestoreInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreInstanceRequest.class, RestoreInstanceResponse.class)
                .withName("RestoreInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/restores")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RestoreInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestoreInstanceBody.class),
            f -> f.withMarshaller(RestoreInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> setOnlineMigrationTask =
        genForsetOnlineMigrationTask();

    private static HttpRequestDef<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> genForsetOnlineMigrationTask() {
        // basic
        HttpRequestDef.Builder<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetOnlineMigrationTaskRequest.class, SetOnlineMigrationTaskResponse.class)
            .withName("SetOnlineMigrationTask")
            .withUri("/v2/{project_id}/migration/{task_id}/task")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetOnlineMigrationTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<SetOnlineMigrationTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetOnlineMigrationTaskBody.class),
            f -> f.withMarshaller(SetOnlineMigrationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfig =
        genForshowBigkeyAutoscanConfig();

    private static HttpRequestDef<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> genForshowBigkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowBigkeyAutoscanConfigRequest.class, ShowBigkeyAutoscanConfigResponse.class)
                .withName("ShowBigkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey/autoscan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBigkeyAutoscanConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetails =
        genForshowBigkeyScanTaskDetails();

    private static HttpRequestDef<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> genForshowBigkeyScanTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBigkeyScanTaskDetailsRequest.class,
                    ShowBigkeyScanTaskDetailsResponse.class)
                .withName("ShowBigkeyScanTaskDetails")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task/{bigkey_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBigkeyScanTaskDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("bigkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBigkeyScanTaskDetailsRequest::getBigkeyId, (req, v) -> {
                req.setBigkeyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigTemplateRequest, ShowConfigTemplateResponse> showConfigTemplate =
        genForshowConfigTemplate();

    private static HttpRequestDef<ShowConfigTemplateRequest, ShowConfigTemplateResponse> genForshowConfigTemplate() {
        // basic
        HttpRequestDef.Builder<ShowConfigTemplateRequest, ShowConfigTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigTemplateRequest.class, ShowConfigTemplateResponse.class)
                .withName("ShowConfigTemplate")
                .withUri("/v2/{project_id}/config-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<ShowConfigTemplateRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowConfigTemplateRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowConfigTemplateRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> showDiagnosisTaskDetails =
        genForshowDiagnosisTaskDetails();

    private static HttpRequestDef<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> genForshowDiagnosisTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDiagnosisTaskDetailsRequest.class, ShowDiagnosisTaskDetailsResponse.class)
                .withName("ShowDiagnosisTaskDetails")
                .withUri("/v2/{project_id}/diagnosis/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisTaskDetailsRequest::getReportId, (req, v) -> {
                req.setReportId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfig =
        genForshowHotkeyAutoscanConfig();

    private static HttpRequestDef<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> genForshowHotkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowHotkeyAutoscanConfigRequest.class, ShowHotkeyAutoscanConfigResponse.class)
                .withName("ShowHotkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey/autoscan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotkeyAutoscanConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetails =
        genForshowHotkeyTaskDetails();

    private static HttpRequestDef<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> genForshowHotkeyTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHotkeyTaskDetailsRequest.class, ShowHotkeyTaskDetailsResponse.class)
            .withName("ShowHotkeyTaskDetails")
            .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task/{hotkey_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotkeyTaskDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("hotkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotkeyTaskDetailsRequest::getHotkeyId, (req, v) -> {
                req.setHotkeyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfo = genForshowJobInfo();

    private static HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> genForshowJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowJobInfoRequest, ShowJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInfoRequest.class, ShowJobInfoResponse.class)
                .withName("ShowJobInfo")
                .withUri("/v2/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrationTaskRequest, ShowMigrationTaskResponse> showMigrationTask =
        genForshowMigrationTask();

    private static HttpRequestDef<ShowMigrationTaskRequest, ShowMigrationTaskResponse> genForshowMigrationTask() {
        // basic
        HttpRequestDef.Builder<ShowMigrationTaskRequest, ShowMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMigrationTaskRequest.class, ShowMigrationTaskResponse.class)
                .withName("ShowMigrationTask")
                .withUri("/v2/{project_id}/migration-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMigrationTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> showMigrationTaskStats =
        genForshowMigrationTaskStats();

    private static HttpRequestDef<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> genForshowMigrationTaskStats() {
        // basic
        HttpRequestDef.Builder<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMigrationTaskStatsRequest.class, ShowMigrationTaskStatsResponse.class)
            .withName("ShowMigrationTaskStats")
            .withUri("/v2/{project_id}/migration-task/{task_id}/stats")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMigrationTaskStatsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodesInformationRequest, ShowNodesInformationResponse> showNodesInformation =
        genForshowNodesInformation();

    private static HttpRequestDef<ShowNodesInformationRequest, ShowNodesInformationResponse> genForshowNodesInformation() {
        // basic
        HttpRequestDef.Builder<ShowNodesInformationRequest, ShowNodesInformationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNodesInformationRequest.class, ShowNodesInformationResponse.class)
            .withName("ShowNodesInformation")
            .withUri("/v2/{project_id}/instances/{instance_id}/logical-nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesInformationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> showQuotaOfTenant =
        genForshowQuotaOfTenant();

    private static HttpRequestDef<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> genForshowQuotaOfTenant() {
        // basic
        HttpRequestDef.Builder<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaOfTenantRequest.class, ShowQuotaOfTenantResponse.class)
                .withName("ShowQuotaOfTenant")
                .withUri("/v2/{project_id}/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReplicationStatesRequest, ShowReplicationStatesResponse> showReplicationStates =
        genForshowReplicationStates();

    private static HttpRequestDef<ShowReplicationStatesRequest, ShowReplicationStatesResponse> genForshowReplicationStates() {
        // basic
        HttpRequestDef.Builder<ShowReplicationStatesRequest, ShowReplicationStatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowReplicationStatesRequest.class, ShowReplicationStatesResponse.class)
            .withName("ShowReplicationStates")
            .withUri("/v2/{project_id}/instance/{instance_id}/groups/{group_id}/group-nodes-state")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationStatesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationStatesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response
        builder.<List<InstanceReplicationListInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowReplicationStatesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(InstanceReplicationListInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagsRequest, ShowTagsResponse> showTags = genForshowTags();

    private static HttpRequestDef<ShowTagsRequest, ShowTagsResponse> genForshowTags() {
        // basic
        HttpRequestDef.Builder<ShowTagsRequest, ShowTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagsRequest.class, ShowTagsResponse.class)
                .withName("ShowTags")
                .withUri("/v2/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopMigrationTaskRequest, StopMigrationTaskResponse> stopMigrationTask =
        genForstopMigrationTask();

    private static HttpRequestDef<StopMigrationTaskRequest, StopMigrationTaskResponse> genForstopMigrationTask() {
        // basic
        HttpRequestDef.Builder<StopMigrationTaskRequest, StopMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopMigrationTaskRequest.class, StopMigrationTaskResponse.class)
                .withName("StopMigrationTask")
                .withUri("/v2/{project_id}/migration-task/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMigrationTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> stopMigrationTaskSync =
        genForstopMigrationTaskSync();

    private static HttpRequestDef<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> genForstopMigrationTaskSync() {
        // basic
        HttpRequestDef.Builder<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StopMigrationTaskSyncRequest.class, StopMigrationTaskSyncResponse.class)
            .withName("StopMigrationTaskSync")
            .withUri("/v2/{project_id}/migration-task/{task_id}/sync-stop")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMigrationTaskSyncRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse> updateAclAccountPassWord =
        genForupdateAclAccountPassWord();

    private static HttpRequestDef<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse> genForupdateAclAccountPassWord() {
        // basic
        HttpRequestDef.Builder<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateAclAccountPassWordRequest.class, UpdateAclAccountPassWordResponse.class)
                .withName("UpdateAclAccountPassWord")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}/password/modify")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountPassWordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountPassWordRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<AclAccountModifyPasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclAccountModifyPasswordBody.class),
            f -> f.withMarshaller(UpdateAclAccountPassWordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse> updateAclAccountRemark =
        genForupdateAclAccountRemark();

    private static HttpRequestDef<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse> genForupdateAclAccountRemark() {
        // basic
        HttpRequestDef.Builder<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAclAccountRemarkRequest.class, UpdateAclAccountRemarkResponse.class)
            .withName("UpdateAclAccountRemark")
            .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountRemarkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountRemarkRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<UpdateAclAccountRemarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAclAccountRemarkRequestBody.class),
            f -> f.withMarshaller(UpdateAclAccountRemarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclAccountRoleRequest, UpdateAclAccountRoleResponse> updateAclAccountRole =
        genForupdateAclAccountRole();

    private static HttpRequestDef<UpdateAclAccountRoleRequest, UpdateAclAccountRoleResponse> genForupdateAclAccountRole() {
        // basic
        HttpRequestDef.Builder<UpdateAclAccountRoleRequest, UpdateAclAccountRoleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAclAccountRoleRequest.class, UpdateAclAccountRoleResponse.class)
            .withName("UpdateAclAccountRole")
            .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}/role")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountRoleRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<AclAccountRoleModifyBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclAccountRoleModifyBody.class),
            f -> f.withMarshaller(UpdateAclAccountRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfig =
        genForupdateBigkeyAutoscanConfig();

    private static HttpRequestDef<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> genForupdateBigkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateBigkeyAutoscanConfigRequest.class,
                    UpdateBigkeyAutoscanConfigResponse.class)
                .withName("UpdateBigkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey/autoscan")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBigkeyAutoscanConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AutoscanConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoscanConfigRequest.class),
            f -> f.withMarshaller(UpdateBigkeyAutoscanConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse> updateConfigTemplate =
        genForupdateConfigTemplate();

    private static HttpRequestDef<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse> genForupdateConfigTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateConfigTemplateRequest.class, UpdateConfigTemplateResponse.class)
            .withName("UpdateConfigTemplate")
            .withUri("/v2/{project_id}/config-templates/{template_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<UpdateCustomTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCustomTemplateBody.class),
            f -> f.withMarshaller(UpdateConfigTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationsRequest, UpdateConfigurationsResponse> updateConfigurations =
        genForupdateConfigurations();

    private static HttpRequestDef<UpdateConfigurationsRequest, UpdateConfigurationsResponse> genForupdateConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationsRequest, UpdateConfigurationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateConfigurationsRequest.class, UpdateConfigurationsResponse.class)
            .withName("UpdateConfigurations")
            .withUri("/v2/{project_id}/instances/{instance_id}/configs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyRedisConfigBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyRedisConfigBody.class),
            f -> f.withMarshaller(UpdateConfigurationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfig =
        genForupdateHotkeyAutoScanConfig();

    private static HttpRequestDef<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> genForupdateHotkeyAutoScanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHotkeyAutoScanConfigRequest.class,
                    UpdateHotkeyAutoScanConfigResponse.class)
                .withName("UpdateHotkeyAutoScanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey/autoscan")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotkeyAutoScanConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AutoscanConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoscanConfigRequest.class),
            f -> f.withMarshaller(UpdateHotkeyAutoScanConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyInstanceBody.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse> updateInstanceBandwidth =
        genForupdateInstanceBandwidth();

    private static HttpRequestDef<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse> genForupdateInstanceBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceBandwidthRequest.class, UpdateInstanceBandwidthResponse.class)
            .withName("UpdateInstanceBandwidth")
            .withUri("/v2/{project_id}/instances/{instance_id}/bandwidth")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceBandwidthRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePasswordRequest, UpdatePasswordResponse> updatePassword =
        genForupdatePassword();

    private static HttpRequestDef<UpdatePasswordRequest, UpdatePasswordResponse> genForupdatePassword() {
        // basic
        HttpRequestDef.Builder<UpdatePasswordRequest, UpdatePasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePasswordRequest.class, UpdatePasswordResponse.class)
                .withName("UpdatePassword")
                .withUri("/v2/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyInstancePasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyInstancePasswordBody.class),
            f -> f.withMarshaller(UpdatePasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> updateSlavePriority =
        genForupdateSlavePriority();

    private static HttpRequestDef<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> genForupdateSlavePriority() {
        // basic
        HttpRequestDef.Builder<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSlavePriorityRequest.class, UpdateSlavePriorityResponse.class)
                .withName("UpdateSlavePriority")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/groups/{group_id}/replications/{node_id}/slave-priority")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<PriorityBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PriorityBody.class),
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpWhitelistRequest, ShowIpWhitelistResponse> showIpWhitelist =
        genForshowIpWhitelist();

    private static HttpRequestDef<ShowIpWhitelistRequest, ShowIpWhitelistResponse> genForshowIpWhitelist() {
        // basic
        HttpRequestDef.Builder<ShowIpWhitelistRequest, ShowIpWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpWhitelistRequest.class, ShowIpWhitelistResponse.class)
                .withName("ShowIpWhitelist")
                .withUri("/v2/{project_id}/instance/{instance_id}/whitelist")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpWhitelistRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> updateIpWhitelist =
        genForupdateIpWhitelist();

    private static HttpRequestDef<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> genForupdateIpWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpWhitelistRequest.class, UpdateIpWhitelistResponse.class)
                .withName("UpdateIpWhitelist")
                .withUri("/v2/{project_id}/instance/{instance_id}/whitelist")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpWhitelistRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyIpWhitelistBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyIpWhitelistBody.class),
            f -> f.withMarshaller(UpdateIpWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
