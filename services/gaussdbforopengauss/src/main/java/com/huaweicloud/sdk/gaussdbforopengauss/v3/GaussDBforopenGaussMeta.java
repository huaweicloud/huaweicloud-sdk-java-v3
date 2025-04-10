package com.huaweicloud.sdk.gaussdbforopengauss.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddTagsRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbRolePrivilegesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbRolePrivilegesRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbRolePrivilegesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ApplyConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchShowUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchShowUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BindEIPRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CancelScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CancelScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConfirmRestoredDataRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConfirmRestoredDataResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConstructReq;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateConfigurationTemplateRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateConfigurationTemplateRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateConfigurationTemplateResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateCrossCloudConstructDisasterRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateCrossCloudConstructDisasterResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseInstanceRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseSchemasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseSchemasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbRoleRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbRoleRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbRoleResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateGaussDbInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateGaussDbInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateLimitTaskRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateManualBackupRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateRestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateRestoreInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateScheduleTaskRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSlowLogDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSlowLogDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DbUserPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseSchemaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseSchemaRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseSchemaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceTagRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceTagResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteJobRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteJobResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DisasterFailoverReqBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DisasterRecoverStartSimulationRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DisasterRecoverStartXlogKeepRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DisasterRecoverStopSimulationRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DisasterRecoverStopXlogKeepRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DownloadBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DownloadBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterDataCacheEndRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterDataCacheEndResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterDataCacheStartRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterDataCacheStartResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterEndSimulationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterEndSimulationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterRecoveryFailoverRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterRecoveryFailoverResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterRestoreRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterRestoreResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterStartSimulationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterStartSimulationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterSwitchoverRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterSwitchoverResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudReleaseDisasterRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudReleaseDisasterResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBUpgradeInstancesVersionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenDatabaseForCreation;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussDatabaseSchemaReq;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussGrantRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussUserForCreation;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListApplicableInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListApplicableInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAppliedHistoriesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAppliedHistoriesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAvailableFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAvailableFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBindedEipsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBindedEipsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListCnInfosBeforeReduceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListCnInfosBeforeReduceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListComponentInfosRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListComponentInfosResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsDiffRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsDiffResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseRolesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseRolesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabasesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabasesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbBackupsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbBackupsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDisasterRecoveryRecordRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDisasterRecoveryRecordResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEpsQuotasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEpsQuotasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFeaturesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFeaturesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListGaussDbDatastoresRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListGaussDbDatastoresResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHistoryOperationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHistoryOperationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceEngineDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceEngineDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceErrorLogsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceErrorLogsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKernelPluginsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKernelPluginsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListNodeLimitSqlModelRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListNodeLimitSqlModelResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParameterGroupTemplatesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParameterGroupTemplatesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPredefinedTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPredefinedTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestoreTimesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestoreTimesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListStorageTypesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListStorageTypesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSupportKernelPluginsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSupportKernelPluginsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopIoTrafficsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopIoTrafficsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussInstanceActionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussInstanceRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussModifyInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussResizeRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussUpgradeRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpengaussRestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ParamGroupCopyRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ParamGroupDiffRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.PluginExtensions;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.PwdResetRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RecyclePolicyRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ReleaseDisasterReq;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetDrConfigRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetDrConfigRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetDrConfigResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetPwdResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstanceFlavorRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstanceFlavorResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreDisasterReq;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SearchAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SearchAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetDbUserPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetDbUserPwdResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetKernelPluginLicenseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetKernelPluginLicenseRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetKernelPluginLicenseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetNewBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetNewBackupPolicyRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetNewBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBatchUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBatchUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterInstanceMonitorRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterInstanceMonitorResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterRelationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterRelationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowDeploymentFormRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowDeploymentFormResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowErrorLogSwitchStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowErrorLogSwitchStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceDiskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceDiskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceSnapshotRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceSnapshotResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowParameterGroupDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowParameterGroupDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowProjectQuotasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowProjectQuotasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowLogDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowLogDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSourceInstanceDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSourceInstanceDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSslCertDownloadLinkRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSslCertDownloadLinkResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMySQLCompatibilityRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMysqlCompatibilityRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMysqlCompatibilityResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchoverReq;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SyncLimitDataRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SyncLimitDataResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMySQLCompatibilityRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMysqlCompatibilityRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMysqlCompatibilityResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateNameRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstanceVersionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstanceVersionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstancesRequestBody;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstancesVersionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstancesVersionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateParaGroupNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateParaGroupNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateWeakPasswordRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateWeakPasswordResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.WeakPasswordRequestBody;

import java.util.List;

@SuppressWarnings("unchecked")
public class GaussDBforopenGaussMeta {

    public static final HttpRequestDef<AddInstanceTagsRequest, AddInstanceTagsResponse> addInstanceTags =
        genForAddInstanceTags();

    private static HttpRequestDef<AddInstanceTagsRequest, AddInstanceTagsResponse> genForAddInstanceTags() {
        // basic
        HttpRequestDef.Builder<AddInstanceTagsRequest, AddInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddInstanceTagsRequest.class, AddInstanceTagsResponse.class)
                .withName("AddInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddInstanceTagsRequest::getInstanceId, AddInstanceTagsRequest::setInstanceId));
        builder.<AddInstanceTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddInstanceTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(AddInstanceTagsRequest::getXLanguage, AddInstanceTagsRequest::setXLanguage));
        builder.<AddTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTagsRequestBody.class),
            f -> f.withMarshaller(AddInstanceTagsRequest::getBody, AddInstanceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> allowDbPrivileges =
        genForAllowDbPrivileges();

    private static HttpRequestDef<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> genForAllowDbPrivileges() {
        // basic
        HttpRequestDef.Builder<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AllowDbPrivilegesRequest.class, AllowDbPrivilegesResponse.class)
                .withName("AllowDbPrivileges")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-privilege")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbPrivilegesRequest::getInstanceId, AllowDbPrivilegesRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbPrivilegesRequest::getXLanguage, AllowDbPrivilegesRequest::setXLanguage));
        builder.<GaussDBforOpenGaussGrantRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBforOpenGaussGrantRequest.class),
            f -> f.withMarshaller(AllowDbPrivilegesRequest::getBody, AllowDbPrivilegesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowDbRolePrivilegesRequest, AllowDbRolePrivilegesResponse> allowDbRolePrivileges =
        genForAllowDbRolePrivileges();

    private static HttpRequestDef<AllowDbRolePrivilegesRequest, AllowDbRolePrivilegesResponse> genForAllowDbRolePrivileges() {
        // basic
        HttpRequestDef.Builder<AllowDbRolePrivilegesRequest, AllowDbRolePrivilegesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AllowDbRolePrivilegesRequest.class, AllowDbRolePrivilegesResponse.class)
            .withName("AllowDbRolePrivileges")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/db-privilege")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbRolePrivilegesRequest::getInstanceId,
                AllowDbRolePrivilegesRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbRolePrivilegesRequest::getXLanguage,
                AllowDbRolePrivilegesRequest::setXLanguage));
        builder.<AllowDbRolePrivilegesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AllowDbRolePrivilegesRequestBody.class),
            f -> f.withMarshaller(AllowDbRolePrivilegesRequest::getBody, AllowDbRolePrivilegesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForAttachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForAttachEip() {
        // basic
        HttpRequestDef.Builder<AttachEipRequest, AttachEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachEipRequest.class, AttachEipResponse.class)
                .withName("AttachEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/public-ip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachEipRequest::getInstanceId, AttachEipRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachEipRequest::getNodeId, AttachEipRequest::setNodeId));
        builder.<AttachEipRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AttachEipRequest.XLanguageEnum.class),
            f -> f.withMarshaller(AttachEipRequest::getXLanguage, AttachEipRequest::setXLanguage));
        builder.<BindEIPRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindEIPRequestBody.class),
            f -> f.withMarshaller(AttachEipRequest::getBody, AttachEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowUpgradeCandidateVersionsRequest, BatchShowUpgradeCandidateVersionsResponse> batchShowUpgradeCandidateVersions =
        genForBatchShowUpgradeCandidateVersions();

    private static HttpRequestDef<BatchShowUpgradeCandidateVersionsRequest, BatchShowUpgradeCandidateVersionsResponse> genForBatchShowUpgradeCandidateVersions() {
        // basic
        HttpRequestDef.Builder<BatchShowUpgradeCandidateVersionsRequest, BatchShowUpgradeCandidateVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchShowUpgradeCandidateVersionsRequest.class,
                    BatchShowUpgradeCandidateVersionsResponse.class)
                .withName("BatchShowUpgradeCandidateVersions")
                .withUri("/v3.1/{project_id}/instances/db-upgrade/candidate-versions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchShowUpgradeCandidateVersionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowUpgradeCandidateVersionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchShowUpgradeCandidateVersionsRequest::getXLanguage,
                BatchShowUpgradeCandidateVersionsRequest::setXLanguage));
        builder.<UpgradeInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeInstancesRequestBody.class),
            f -> f.withMarshaller(BatchShowUpgradeCandidateVersionsRequest::getBody,
                BatchShowUpgradeCandidateVersionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelScheduleTaskRequest, CancelScheduleTaskResponse> cancelScheduleTask =
        genForCancelScheduleTask();

    private static HttpRequestDef<CancelScheduleTaskRequest, CancelScheduleTaskResponse> genForCancelScheduleTask() {
        // basic
        HttpRequestDef.Builder<CancelScheduleTaskRequest, CancelScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CancelScheduleTaskRequest.class, CancelScheduleTaskResponse.class)
                .withName("CancelScheduleTask")
                .withUri("/v3/{project_id}/instances/schedule-task/{task_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScheduleTaskRequest::getTaskId, CancelScheduleTaskRequest::setTaskId));
        builder.<CancelScheduleTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CancelScheduleTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CancelScheduleTaskRequest::getXLanguage, CancelScheduleTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse> confirmRestoredData =
        genForConfirmRestoredData();

    private static HttpRequestDef<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse> genForConfirmRestoredData() {
        // basic
        HttpRequestDef.Builder<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmRestoredDataRequest.class, ConfirmRestoredDataResponse.class)
                .withName("ConfirmRestoredData")
                .withUri("/v3/{project_id}/instances/{instance_id}/confirm-restore-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmRestoredDataRequest::getInstanceId,
                ConfirmRestoredDataRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmRestoredDataRequest::getXLanguage, ConfirmRestoredDataRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> copyConfiguration =
        genForCopyConfiguration();

    private static HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> genForCopyConfiguration() {
        // basic
        HttpRequestDef.Builder<CopyConfigurationRequest, CopyConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyConfigurationRequest.class, CopyConfigurationResponse.class)
                .withName("CopyConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getConfigId, CopyConfigurationRequest::setConfigId));
        builder.<CopyConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CopyConfigurationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getXLanguage, CopyConfigurationRequest::setXLanguage));
        builder.<ParamGroupCopyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParamGroupCopyRequestBody.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getBody, CopyConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> createConfigurationTemplate =
        genForCreateConfigurationTemplate();

    private static HttpRequestDef<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> genForCreateConfigurationTemplate() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateConfigurationTemplateRequest.class,
                    CreateConfigurationTemplateResponse.class)
                .withName("CreateConfigurationTemplate")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateConfigurationTemplateRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateConfigurationTemplateRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateConfigurationTemplateRequest::getXLanguage,
                CreateConfigurationTemplateRequest::setXLanguage));
        builder.<CreateConfigurationTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationTemplateRequestBody.class),
            f -> f.withMarshaller(CreateConfigurationTemplateRequest::getBody,
                CreateConfigurationTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCrossCloudConstructDisasterRequest, CreateCrossCloudConstructDisasterResponse> createCrossCloudConstructDisaster =
        genForCreateCrossCloudConstructDisaster();

    private static HttpRequestDef<CreateCrossCloudConstructDisasterRequest, CreateCrossCloudConstructDisasterResponse> genForCreateCrossCloudConstructDisaster() {
        // basic
        HttpRequestDef.Builder<CreateCrossCloudConstructDisasterRequest, CreateCrossCloudConstructDisasterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCrossCloudConstructDisasterRequest.class,
                    CreateCrossCloudConstructDisasterResponse.class)
                .withName("CreateCrossCloudConstructDisaster")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/construct")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCrossCloudConstructDisasterRequest::getInstanceId,
                CreateCrossCloudConstructDisasterRequest::setInstanceId));
        builder.<CreateCrossCloudConstructDisasterRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateCrossCloudConstructDisasterRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateCrossCloudConstructDisasterRequest::getXLanguage,
                CreateCrossCloudConstructDisasterRequest::setXLanguage));
        builder.<ConstructReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConstructReq.class),
            f -> f.withMarshaller(CreateCrossCloudConstructDisasterRequest::getBody,
                CreateCrossCloudConstructDisasterRequest::setBody));

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
                .withUri("/v3/{project_id}/instances/{instance_id}/database")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getInstanceId, CreateDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getXLanguage, CreateDatabaseRequest::setXLanguage));
        builder.<GaussDBforOpenDatabaseForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBforOpenDatabaseForCreation.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, CreateDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseInstanceRequest, CreateDatabaseInstanceResponse> createDatabaseInstance =
        genForCreateDatabaseInstance();

    private static HttpRequestDef<CreateDatabaseInstanceRequest, CreateDatabaseInstanceResponse> genForCreateDatabaseInstance() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseInstanceRequest, CreateDatabaseInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDatabaseInstanceRequest.class, CreateDatabaseInstanceResponse.class)
            .withName("CreateDatabaseInstance")
            .withUri("/v3.2/{project_id}/instances")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseInstanceRequest::getXLanguage,
                CreateDatabaseInstanceRequest::setXLanguage));
        builder.<CreateDatabaseInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseInstanceRequestBody.class),
            f -> f.withMarshaller(CreateDatabaseInstanceRequest::getBody, CreateDatabaseInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> createDatabaseSchemas =
        genForCreateDatabaseSchemas();

    private static HttpRequestDef<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> genForCreateDatabaseSchemas() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDatabaseSchemasRequest.class, CreateDatabaseSchemasResponse.class)
            .withName("CreateDatabaseSchemas")
            .withUri("/v3/{project_id}/instances/{instance_id}/schema")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseSchemasRequest::getInstanceId,
                CreateDatabaseSchemasRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseSchemasRequest::getXLanguage,
                CreateDatabaseSchemasRequest::setXLanguage));
        builder.<GaussDBforOpenGaussDatabaseSchemaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBforOpenGaussDatabaseSchemaReq.class),
            f -> f.withMarshaller(CreateDatabaseSchemasRequest::getBody, CreateDatabaseSchemasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbInstanceRequest, CreateDbInstanceResponse> createDbInstance =
        genForCreateDbInstance();

    private static HttpRequestDef<CreateDbInstanceRequest, CreateDbInstanceResponse> genForCreateDbInstance() {
        // basic
        HttpRequestDef.Builder<CreateDbInstanceRequest, CreateDbInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDbInstanceRequest.class, CreateDbInstanceResponse.class)
                .withName("CreateDbInstance")
                .withUri("/v3.1/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbInstanceRequest::getXLanguage, CreateDbInstanceRequest::setXLanguage));
        builder.<OpenGaussInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussInstanceRequestBody.class),
            f -> f.withMarshaller(CreateDbInstanceRequest::getBody, CreateDbInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbRoleRequest, CreateDbRoleResponse> createDbRole = genForCreateDbRole();

    private static HttpRequestDef<CreateDbRoleRequest, CreateDbRoleResponse> genForCreateDbRole() {
        // basic
        HttpRequestDef.Builder<CreateDbRoleRequest, CreateDbRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDbRoleRequest.class, CreateDbRoleResponse.class)
                .withName("CreateDbRole")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/db-role")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbRoleRequest::getInstanceId, CreateDbRoleRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbRoleRequest::getXLanguage, CreateDbRoleRequest::setXLanguage));
        builder.<CreateDbRoleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDbRoleRequestBody.class),
            f -> f.withMarshaller(CreateDbRoleRequest::getBody, CreateDbRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> createDbUser = genForCreateDbUser();

    private static HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> genForCreateDbUser() {
        // basic
        HttpRequestDef.Builder<CreateDbUserRequest, CreateDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDbUserRequest.class, CreateDbUserResponse.class)
                .withName("CreateDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbUserRequest::getInstanceId, CreateDbUserRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbUserRequest::getXLanguage, CreateDbUserRequest::setXLanguage));
        builder.<GaussDBforOpenGaussUserForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBforOpenGaussUserForCreation.class),
            f -> f.withMarshaller(CreateDbUserRequest::getBody, CreateDbUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse> createGaussDbInstance =
        genForCreateGaussDbInstance();

    private static HttpRequestDef<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse> genForCreateGaussDbInstance() {
        // basic
        HttpRequestDef.Builder<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGaussDbInstanceRequest.class, CreateGaussDbInstanceResponse.class)
            .withName("CreateGaussDbInstance")
            .withUri("/v5/{project_id}/instances")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussDbInstanceRequest::getXLanguage,
                CreateGaussDbInstanceRequest::setXLanguage));
        builder.<String>withRequestField("Subscription-Agency",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussDbInstanceRequest::getSubscriptionAgency,
                CreateGaussDbInstanceRequest::setSubscriptionAgency));
        builder.<OpenGaussInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussInstanceRequestBody.class),
            f -> f.withMarshaller(CreateGaussDbInstanceRequest::getBody, CreateGaussDbInstanceRequest::setBody));

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
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getXLanguage, CreateInstanceRequest::setXLanguage));
        builder.<OpenGaussInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussInstanceRequest.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackup =
        genForCreateManualBackup();

    private static HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> genForCreateManualBackup() {
        // basic
        HttpRequestDef.Builder<CreateManualBackupRequest, CreateManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateManualBackupRequest.class, CreateManualBackupResponse.class)
                .withName("CreateManualBackup")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateManualBackupRequest::getXLanguage, CreateManualBackupRequest::setXLanguage));
        builder.<CreateManualBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManualBackupRequestBody.class),
            f -> f.withMarshaller(CreateManualBackupRequest::getBody, CreateManualBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstance =
        genForCreateRestoreInstance();

    private static HttpRequestDef<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> genForCreateRestoreInstance() {
        // basic
        HttpRequestDef.Builder<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRestoreInstanceRequest.class, CreateRestoreInstanceResponse.class)
            .withName("CreateRestoreInstance")
            .withUri("/v3/{project_id}/instances")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateRestoreInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRestoreInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getXLanguage,
                CreateRestoreInstanceRequest::setXLanguage));
        builder.<OpengaussRestoreInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpengaussRestoreInstanceRequest.class),
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getBody, CreateRestoreInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScheduleTaskRequest, CreateScheduleTaskResponse> createScheduleTask =
        genForCreateScheduleTask();

    private static HttpRequestDef<CreateScheduleTaskRequest, CreateScheduleTaskResponse> genForCreateScheduleTask() {
        // basic
        HttpRequestDef.Builder<CreateScheduleTaskRequest, CreateScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScheduleTaskRequest.class, CreateScheduleTaskResponse.class)
                .withName("CreateScheduleTask")
                .withUri("/v3/{project_id}/instances/db-upgrade/schedule-task")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateScheduleTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateScheduleTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateScheduleTaskRequest::getXLanguage, CreateScheduleTaskRequest::setXLanguage));
        builder.<CreateScheduleTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScheduleTaskRequestBody.class),
            f -> f.withMarshaller(CreateScheduleTaskRequest::getBody, CreateScheduleTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse> createSlowLogDownload =
        genForCreateSlowLogDownload();

    private static HttpRequestDef<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse> genForCreateSlowLogDownload() {
        // basic
        HttpRequestDef.Builder<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSlowLogDownloadRequest.class, CreateSlowLogDownloadResponse.class)
            .withName("CreateSlowLogDownload")
            .withUri("/v3/{project_id}/instances/{instance_id}/slow-log/download")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSlowLogDownloadRequest::getInstanceId,
                CreateSlowLogDownloadRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSlowLogDownloadRequest::getXLanguage,
                CreateSlowLogDownloadRequest::setXLanguage));

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
        builder.<DeleteConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteConfigurationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteConfigurationRequest::getXLanguage, DeleteConfigurationRequest::setXLanguage));

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
                .withUri("/v3/{project_id}/instances/{instance_id}/database")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getInstanceId, DeleteDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDatabaseName, DeleteDatabaseRequest::setDatabaseName));
        builder.<DeleteDatabaseRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteDatabaseRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getXLanguage, DeleteDatabaseRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseSchemaRequest, DeleteDatabaseSchemaResponse> deleteDatabaseSchema =
        genForDeleteDatabaseSchema();

    private static HttpRequestDef<DeleteDatabaseSchemaRequest, DeleteDatabaseSchemaResponse> genForDeleteDatabaseSchema() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseSchemaRequest, DeleteDatabaseSchemaResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDatabaseSchemaRequest.class, DeleteDatabaseSchemaResponse.class)
            .withName("DeleteDatabaseSchema")
            .withUri("/v3/{project_id}/instances/{instance_id}/schema")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseSchemaRequest::getInstanceId,
                DeleteDatabaseSchemaRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseSchemaRequest::getXLanguage,
                DeleteDatabaseSchemaRequest::setXLanguage));
        builder.<DeleteDatabaseSchemaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabaseSchemaRequestBody.class),
            f -> f.withMarshaller(DeleteDatabaseSchemaRequest::getBody, DeleteDatabaseSchemaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getXLanguage, DeleteInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceTagRequest, DeleteInstanceTagResponse> deleteInstanceTag =
        genForDeleteInstanceTag();

    private static HttpRequestDef<DeleteInstanceTagRequest, DeleteInstanceTagResponse> genForDeleteInstanceTag() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceTagRequest, DeleteInstanceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceTagRequest.class, DeleteInstanceTagResponse.class)
                .withName("DeleteInstanceTag")
                .withUri("/v3/{project_id}/instances/{instance_id}/tag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceTagRequest::getInstanceId, DeleteInstanceTagRequest::setInstanceId));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceTagRequest::getKey, DeleteInstanceTagRequest::setKey));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceTagRequest::getXLanguage, DeleteInstanceTagRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genForDeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genForDeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withName("DeleteJob")
                .withUri("/v3/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobId, DeleteJobRequest::setJobId));
        builder.<DeleteJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteJobRequest::getXLanguage, DeleteJobRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackup =
        genForDeleteManualBackup();

    private static HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> genForDeleteManualBackup() {
        // basic
        HttpRequestDef.Builder<DeleteManualBackupRequest, DeleteManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteManualBackupRequest.class, DeleteManualBackupResponse.class)
                .withName("DeleteManualBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManualBackupRequest::getBackupId, DeleteManualBackupRequest::setBackupId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManualBackupRequest::getXLanguage, DeleteManualBackupRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> deleteScheduleTask =
        genForDeleteScheduleTask();

    private static HttpRequestDef<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> genForDeleteScheduleTask() {
        // basic
        HttpRequestDef.Builder<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScheduleTaskRequest.class, DeleteScheduleTaskResponse.class)
                .withName("DeleteScheduleTask")
                .withUri("/v3/{project_id}/instances/schedule-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleTaskRequest::getTaskId, DeleteScheduleTaskRequest::setTaskId));
        builder.<DeleteScheduleTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteScheduleTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteScheduleTaskRequest::getXLanguage, DeleteScheduleTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBackupRequest, DownloadBackupResponse> downloadBackup =
        genForDownloadBackup();

    private static HttpRequestDef<DownloadBackupRequest, DownloadBackupResponse> genForDownloadBackup() {
        // basic
        HttpRequestDef.Builder<DownloadBackupRequest, DownloadBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadBackupRequest.class, DownloadBackupResponse.class)
                .withName("DownloadBackup")
                .withUri("/v3/{project_id}/backup-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBackupRequest::getBackupId, DownloadBackupRequest::setBackupId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBackupRequest::getXLanguage, DownloadBackupRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCrossCloudDisasterDataCacheEndRequest, ExecuteCrossCloudDisasterDataCacheEndResponse> executeCrossCloudDisasterDataCacheEnd =
        genForExecuteCrossCloudDisasterDataCacheEnd();

    private static HttpRequestDef<ExecuteCrossCloudDisasterDataCacheEndRequest, ExecuteCrossCloudDisasterDataCacheEndResponse> genForExecuteCrossCloudDisasterDataCacheEnd() {
        // basic
        HttpRequestDef.Builder<ExecuteCrossCloudDisasterDataCacheEndRequest, ExecuteCrossCloudDisasterDataCacheEndResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCrossCloudDisasterDataCacheEndRequest.class,
                    ExecuteCrossCloudDisasterDataCacheEndResponse.class)
                .withName("ExecuteCrossCloudDisasterDataCacheEnd")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/keep-log-stop")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterDataCacheEndRequest::getInstanceId,
                ExecuteCrossCloudDisasterDataCacheEndRequest::setInstanceId));
        builder.<ExecuteCrossCloudDisasterDataCacheEndRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCrossCloudDisasterDataCacheEndRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterDataCacheEndRequest::getXLanguage,
                ExecuteCrossCloudDisasterDataCacheEndRequest::setXLanguage));
        builder.<DisasterRecoverStopXlogKeepRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisasterRecoverStopXlogKeepRequestBody.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterDataCacheEndRequest::getBody,
                ExecuteCrossCloudDisasterDataCacheEndRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCrossCloudDisasterDataCacheStartRequest, ExecuteCrossCloudDisasterDataCacheStartResponse> executeCrossCloudDisasterDataCacheStart =
        genForExecuteCrossCloudDisasterDataCacheStart();

    private static HttpRequestDef<ExecuteCrossCloudDisasterDataCacheStartRequest, ExecuteCrossCloudDisasterDataCacheStartResponse> genForExecuteCrossCloudDisasterDataCacheStart() {
        // basic
        HttpRequestDef.Builder<ExecuteCrossCloudDisasterDataCacheStartRequest, ExecuteCrossCloudDisasterDataCacheStartResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCrossCloudDisasterDataCacheStartRequest.class,
                    ExecuteCrossCloudDisasterDataCacheStartResponse.class)
                .withName("ExecuteCrossCloudDisasterDataCacheStart")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/keep-log-start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterDataCacheStartRequest::getInstanceId,
                ExecuteCrossCloudDisasterDataCacheStartRequest::setInstanceId));
        builder.<ExecuteCrossCloudDisasterDataCacheStartRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCrossCloudDisasterDataCacheStartRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterDataCacheStartRequest::getXLanguage,
                ExecuteCrossCloudDisasterDataCacheStartRequest::setXLanguage));
        builder.<DisasterRecoverStartXlogKeepRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisasterRecoverStartXlogKeepRequestBody.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterDataCacheStartRequest::getBody,
                ExecuteCrossCloudDisasterDataCacheStartRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCrossCloudDisasterEndSimulationRequest, ExecuteCrossCloudDisasterEndSimulationResponse> executeCrossCloudDisasterEndSimulation =
        genForExecuteCrossCloudDisasterEndSimulation();

    private static HttpRequestDef<ExecuteCrossCloudDisasterEndSimulationRequest, ExecuteCrossCloudDisasterEndSimulationResponse> genForExecuteCrossCloudDisasterEndSimulation() {
        // basic
        HttpRequestDef.Builder<ExecuteCrossCloudDisasterEndSimulationRequest, ExecuteCrossCloudDisasterEndSimulationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCrossCloudDisasterEndSimulationRequest.class,
                    ExecuteCrossCloudDisasterEndSimulationResponse.class)
                .withName("ExecuteCrossCloudDisasterEndSimulation")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/simulation-stop")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterEndSimulationRequest::getInstanceId,
                ExecuteCrossCloudDisasterEndSimulationRequest::setInstanceId));
        builder.<ExecuteCrossCloudDisasterEndSimulationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCrossCloudDisasterEndSimulationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterEndSimulationRequest::getXLanguage,
                ExecuteCrossCloudDisasterEndSimulationRequest::setXLanguage));
        builder.<DisasterRecoverStopSimulationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisasterRecoverStopSimulationRequestBody.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterEndSimulationRequest::getBody,
                ExecuteCrossCloudDisasterEndSimulationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCrossCloudDisasterRecoveryFailoverRequest, ExecuteCrossCloudDisasterRecoveryFailoverResponse> executeCrossCloudDisasterRecoveryFailover =
        genForExecuteCrossCloudDisasterRecoveryFailover();

    private static HttpRequestDef<ExecuteCrossCloudDisasterRecoveryFailoverRequest, ExecuteCrossCloudDisasterRecoveryFailoverResponse> genForExecuteCrossCloudDisasterRecoveryFailover() {
        // basic
        HttpRequestDef.Builder<ExecuteCrossCloudDisasterRecoveryFailoverRequest, ExecuteCrossCloudDisasterRecoveryFailoverResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCrossCloudDisasterRecoveryFailoverRequest.class,
                    ExecuteCrossCloudDisasterRecoveryFailoverResponse.class)
                .withName("ExecuteCrossCloudDisasterRecoveryFailover")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/failover")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterRecoveryFailoverRequest::getInstanceId,
                ExecuteCrossCloudDisasterRecoveryFailoverRequest::setInstanceId));
        builder.<ExecuteCrossCloudDisasterRecoveryFailoverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCrossCloudDisasterRecoveryFailoverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterRecoveryFailoverRequest::getXLanguage,
                ExecuteCrossCloudDisasterRecoveryFailoverRequest::setXLanguage));
        builder.<DisasterFailoverReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisasterFailoverReqBody.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterRecoveryFailoverRequest::getBody,
                ExecuteCrossCloudDisasterRecoveryFailoverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCrossCloudDisasterRestoreRequest, ExecuteCrossCloudDisasterRestoreResponse> executeCrossCloudDisasterRestore =
        genForExecuteCrossCloudDisasterRestore();

    private static HttpRequestDef<ExecuteCrossCloudDisasterRestoreRequest, ExecuteCrossCloudDisasterRestoreResponse> genForExecuteCrossCloudDisasterRestore() {
        // basic
        HttpRequestDef.Builder<ExecuteCrossCloudDisasterRestoreRequest, ExecuteCrossCloudDisasterRestoreResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCrossCloudDisasterRestoreRequest.class,
                    ExecuteCrossCloudDisasterRestoreResponse.class)
                .withName("ExecuteCrossCloudDisasterRestore")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterRestoreRequest::getInstanceId,
                ExecuteCrossCloudDisasterRestoreRequest::setInstanceId));
        builder.<ExecuteCrossCloudDisasterRestoreRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCrossCloudDisasterRestoreRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterRestoreRequest::getXLanguage,
                ExecuteCrossCloudDisasterRestoreRequest::setXLanguage));
        builder.<RestoreDisasterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreDisasterReq.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterRestoreRequest::getBody,
                ExecuteCrossCloudDisasterRestoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCrossCloudDisasterStartSimulationRequest, ExecuteCrossCloudDisasterStartSimulationResponse> executeCrossCloudDisasterStartSimulation =
        genForExecuteCrossCloudDisasterStartSimulation();

    private static HttpRequestDef<ExecuteCrossCloudDisasterStartSimulationRequest, ExecuteCrossCloudDisasterStartSimulationResponse> genForExecuteCrossCloudDisasterStartSimulation() {
        // basic
        HttpRequestDef.Builder<ExecuteCrossCloudDisasterStartSimulationRequest, ExecuteCrossCloudDisasterStartSimulationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCrossCloudDisasterStartSimulationRequest.class,
                    ExecuteCrossCloudDisasterStartSimulationResponse.class)
                .withName("ExecuteCrossCloudDisasterStartSimulation")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/simulation-start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterStartSimulationRequest::getInstanceId,
                ExecuteCrossCloudDisasterStartSimulationRequest::setInstanceId));
        builder.<ExecuteCrossCloudDisasterStartSimulationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCrossCloudDisasterStartSimulationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterStartSimulationRequest::getXLanguage,
                ExecuteCrossCloudDisasterStartSimulationRequest::setXLanguage));
        builder.<DisasterRecoverStartSimulationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisasterRecoverStartSimulationRequestBody.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterStartSimulationRequest::getBody,
                ExecuteCrossCloudDisasterStartSimulationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCrossCloudDisasterSwitchoverRequest, ExecuteCrossCloudDisasterSwitchoverResponse> executeCrossCloudDisasterSwitchover =
        genForExecuteCrossCloudDisasterSwitchover();

    private static HttpRequestDef<ExecuteCrossCloudDisasterSwitchoverRequest, ExecuteCrossCloudDisasterSwitchoverResponse> genForExecuteCrossCloudDisasterSwitchover() {
        // basic
        HttpRequestDef.Builder<ExecuteCrossCloudDisasterSwitchoverRequest, ExecuteCrossCloudDisasterSwitchoverResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCrossCloudDisasterSwitchoverRequest.class,
                    ExecuteCrossCloudDisasterSwitchoverResponse.class)
                .withName("ExecuteCrossCloudDisasterSwitchover")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/switchover")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterSwitchoverRequest::getInstanceId,
                ExecuteCrossCloudDisasterSwitchoverRequest::setInstanceId));
        builder.<ExecuteCrossCloudDisasterSwitchoverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCrossCloudDisasterSwitchoverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterSwitchoverRequest::getXLanguage,
                ExecuteCrossCloudDisasterSwitchoverRequest::setXLanguage));
        builder.<SwitchoverReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchoverReq.class),
            f -> f.withMarshaller(ExecuteCrossCloudDisasterSwitchoverRequest::getBody,
                ExecuteCrossCloudDisasterSwitchoverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCrossCloudReleaseDisasterRequest, ExecuteCrossCloudReleaseDisasterResponse> executeCrossCloudReleaseDisaster =
        genForExecuteCrossCloudReleaseDisaster();

    private static HttpRequestDef<ExecuteCrossCloudReleaseDisasterRequest, ExecuteCrossCloudReleaseDisasterResponse> genForExecuteCrossCloudReleaseDisaster() {
        // basic
        HttpRequestDef.Builder<ExecuteCrossCloudReleaseDisasterRequest, ExecuteCrossCloudReleaseDisasterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCrossCloudReleaseDisasterRequest.class,
                    ExecuteCrossCloudReleaseDisasterResponse.class)
                .withName("ExecuteCrossCloudReleaseDisaster")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/release")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCrossCloudReleaseDisasterRequest::getInstanceId,
                ExecuteCrossCloudReleaseDisasterRequest::setInstanceId));
        builder.<ExecuteCrossCloudReleaseDisasterRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCrossCloudReleaseDisasterRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteCrossCloudReleaseDisasterRequest::getXLanguage,
                ExecuteCrossCloudReleaseDisasterRequest::setXLanguage));
        builder.<ReleaseDisasterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ReleaseDisasterReq.class),
            f -> f.withMarshaller(ExecuteCrossCloudReleaseDisasterRequest::getBody,
                ExecuteCrossCloudReleaseDisasterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallKernelPluginRequest, InstallKernelPluginResponse> installKernelPlugin =
        genForInstallKernelPlugin();

    private static HttpRequestDef<InstallKernelPluginRequest, InstallKernelPluginResponse> genForInstallKernelPlugin() {
        // basic
        HttpRequestDef.Builder<InstallKernelPluginRequest, InstallKernelPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InstallKernelPluginRequest.class, InstallKernelPluginResponse.class)
                .withName("InstallKernelPlugin")
                .withUri("/v3/{project_id}/instances/{instance_id}/kernel-plugin")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InstallKernelPluginRequest::getInstanceId,
                InstallKernelPluginRequest::setInstanceId));
        builder.<InstallKernelPluginRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstallKernelPluginRequest.XLanguageEnum.class),
            f -> f.withMarshaller(InstallKernelPluginRequest::getXLanguage, InstallKernelPluginRequest::setXLanguage));
        builder.<InstallKernelPluginRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstallKernelPluginRequestBody.class),
            f -> f.withMarshaller(InstallKernelPluginRequest::getBody, InstallKernelPluginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicableInstancesRequest, ListApplicableInstancesResponse> listApplicableInstances =
        genForListApplicableInstances();

    private static HttpRequestDef<ListApplicableInstancesRequest, ListApplicableInstancesResponse> genForListApplicableInstances() {
        // basic
        HttpRequestDef.Builder<ListApplicableInstancesRequest, ListApplicableInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApplicableInstancesRequest.class, ListApplicableInstancesResponse.class)
            .withName("ListApplicableInstances")
            .withUri("/v3/{project_id}/configurations/{config_id}/applicable-instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicableInstancesRequest::getConfigId,
                ListApplicableInstancesRequest::setConfigId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicableInstancesRequest::getOffset,
                ListApplicableInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicableInstancesRequest::getLimit, ListApplicableInstancesRequest::setLimit));
        builder.<ListApplicableInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApplicableInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListApplicableInstancesRequest::getXLanguage,
                ListApplicableInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> listAppliedHistories =
        genForListAppliedHistories();

    private static HttpRequestDef<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> genForListAppliedHistories() {
        // basic
        HttpRequestDef.Builder<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppliedHistoriesRequest.class, ListAppliedHistoriesResponse.class)
            .withName("ListAppliedHistories")
            .withUri("/v3/{project_id}/configurations/{config_id}/applied-histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppliedHistoriesRequest::getConfigId, ListAppliedHistoriesRequest::setConfigId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppliedHistoriesRequest::getOffset, ListAppliedHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppliedHistoriesRequest::getLimit, ListAppliedHistoriesRequest::setLimit));
        builder.<ListAppliedHistoriesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAppliedHistoriesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAppliedHistoriesRequest::getXLanguage,
                ListAppliedHistoriesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> listAvailableFlavors =
        genForListAvailableFlavors();

    private static HttpRequestDef<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> genForListAvailableFlavors() {
        // basic
        HttpRequestDef.Builder<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailableFlavorsRequest.class, ListAvailableFlavorsResponse.class)
            .withName("ListAvailableFlavors")
            .withUri("/v3/{project_id}/instances/{instance_id}/available-flavors")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableFlavorsRequest::getInstanceId,
                ListAvailableFlavorsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableFlavorsRequest::getOffset, ListAvailableFlavorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableFlavorsRequest::getLimit, ListAvailableFlavorsRequest::setLimit));
        builder.<ListAvailableFlavorsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAvailableFlavorsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAvailableFlavorsRequest::getXLanguage,
                ListAvailableFlavorsRequest::setXLanguage));

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
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getInstanceId, ListBackupsRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupId, ListBackupsRequest::setBackupId));
        builder.<ListBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupType, ListBackupsRequest::setBackupType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getOffset, ListBackupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getLimit, ListBackupsRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBeginTime, ListBackupsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getEndTime, ListBackupsRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getXLanguage, ListBackupsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupsDetailsRequest, ListBackupsDetailsResponse> listBackupsDetails =
        genForListBackupsDetails();

    private static HttpRequestDef<ListBackupsDetailsRequest, ListBackupsDetailsResponse> genForListBackupsDetails() {
        // basic
        HttpRequestDef.Builder<ListBackupsDetailsRequest, ListBackupsDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupsDetailsRequest.class, ListBackupsDetailsResponse.class)
                .withName("ListBackupsDetails")
                .withUri("/v3.2/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsDetailsRequest::getInstanceId, ListBackupsDetailsRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsDetailsRequest::getBackupId, ListBackupsDetailsRequest::setBackupId));
        builder.<ListBackupsDetailsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsDetailsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListBackupsDetailsRequest::getBackupType, ListBackupsDetailsRequest::setBackupType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsDetailsRequest::getOffset, ListBackupsDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsDetailsRequest::getLimit, ListBackupsDetailsRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsDetailsRequest::getBeginTime, ListBackupsDetailsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsDetailsRequest::getEndTime, ListBackupsDetailsRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsDetailsRequest::getXLanguage, ListBackupsDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBindedEipsRequest, ListBindedEipsResponse> listBindedEips =
        genForListBindedEips();

    private static HttpRequestDef<ListBindedEipsRequest, ListBindedEipsResponse> genForListBindedEips() {
        // basic
        HttpRequestDef.Builder<ListBindedEipsRequest, ListBindedEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBindedEipsRequest.class, ListBindedEipsResponse.class)
                .withName("ListBindedEips")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBindedEipsRequest::getInstanceId, ListBindedEipsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBindedEipsRequest::getOffset, ListBindedEipsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBindedEipsRequest::getLimit, ListBindedEipsRequest::setLimit));
        builder.<ListBindedEipsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBindedEipsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListBindedEipsRequest::getXLanguage, ListBindedEipsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse> listCnInfosBeforeReduce =
        genForListCnInfosBeforeReduce();

    private static HttpRequestDef<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse> genForListCnInfosBeforeReduce() {
        // basic
        HttpRequestDef.Builder<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCnInfosBeforeReduceRequest.class, ListCnInfosBeforeReduceResponse.class)
            .withName("ListCnInfosBeforeReduce")
            .withUri("/v3/{project_id}/instances/{instance_id}/coordinators")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCnInfosBeforeReduceRequest::getInstanceId,
                ListCnInfosBeforeReduceRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCnInfosBeforeReduceRequest::getXLanguage,
                ListCnInfosBeforeReduceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentInfosRequest, ListComponentInfosResponse> listComponentInfos =
        genForListComponentInfos();

    private static HttpRequestDef<ListComponentInfosRequest, ListComponentInfosResponse> genForListComponentInfos() {
        // basic
        HttpRequestDef.Builder<ListComponentInfosRequest, ListComponentInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListComponentInfosRequest.class, ListComponentInfosResponse.class)
                .withName("ListComponentInfos")
                .withUri("/v3/{project_id}/instances/{instance_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getInstanceId, ListComponentInfosRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getOffset, ListComponentInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getLimit, ListComponentInfosRequest::setLimit));
        builder.<ListComponentInfosRequest.ComponentTypeEnum>withRequestField("component_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListComponentInfosRequest.ComponentTypeEnum.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getComponentType,
                ListComponentInfosRequest::setComponentType));
        builder.<String>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getAvailabilityZoneId,
                ListComponentInfosRequest::setAvailabilityZoneId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getXLanguage, ListComponentInfosRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations =
        genForListConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForListConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getOffset, ListConfigurationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getLimit, ListConfigurationsRequest::setLimit));
        builder.<ListConfigurationsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConfigurationsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getXLanguage, ListConfigurationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> listConfigurationsDiff =
        genForListConfigurationsDiff();

    private static HttpRequestDef<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> genForListConfigurationsDiff() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListConfigurationsDiffRequest.class, ListConfigurationsDiffResponse.class)
            .withName("ListConfigurationsDiff")
            .withUri("/v3/{project_id}/configurations/comparison")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListConfigurationsDiffRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConfigurationsDiffRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListConfigurationsDiffRequest::getXLanguage,
                ListConfigurationsDiffRequest::setXLanguage));
        builder.<ParamGroupDiffRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParamGroupDiffRequestBody.class),
            f -> f.withMarshaller(ListConfigurationsDiffRequest::getBody, ListConfigurationsDiffRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseInstancesRequest, ListDatabaseInstancesResponse> listDatabaseInstances =
        genForListDatabaseInstances();

    private static HttpRequestDef<ListDatabaseInstancesRequest, ListDatabaseInstancesResponse> genForListDatabaseInstances() {
        // basic
        HttpRequestDef.Builder<ListDatabaseInstancesRequest, ListDatabaseInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDatabaseInstancesRequest.class, ListDatabaseInstancesResponse.class)
            .withName("ListDatabaseInstances")
            .withUri("/v3.3/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getId, ListDatabaseInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getName, ListDatabaseInstancesRequest::setName));
        builder.<ListDatabaseInstancesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDatabaseInstancesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getType, ListDatabaseInstancesRequest::setType));
        builder.<ListDatabaseInstancesRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDatabaseInstancesRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getDatastoreType,
                ListDatabaseInstancesRequest::setDatastoreType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getVpcId, ListDatabaseInstancesRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getSubnetId,
                ListDatabaseInstancesRequest::setSubnetId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getOffset, ListDatabaseInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getLimit, ListDatabaseInstancesRequest::setLimit));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getTags, ListDatabaseInstancesRequest::setTags));
        builder.<ListDatabaseInstancesRequest.ChargeModeEnum>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDatabaseInstancesRequest.ChargeModeEnum.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getChargeMode,
                ListDatabaseInstancesRequest::setChargeMode));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseInstancesRequest::getXLanguage,
                ListDatabaseInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRoles =
        genForListDatabaseRoles();

    private static HttpRequestDef<ListDatabaseRolesRequest, ListDatabaseRolesResponse> genForListDatabaseRoles() {
        // basic
        HttpRequestDef.Builder<ListDatabaseRolesRequest, ListDatabaseRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseRolesRequest.class, ListDatabaseRolesResponse.class)
                .withName("ListDatabaseRoles")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/db-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getInstanceId, ListDatabaseRolesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getOffset, ListDatabaseRolesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getLimit, ListDatabaseRolesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getXLanguage, ListDatabaseRolesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> listDatabaseSchemas =
        genForListDatabaseSchemas();

    private static HttpRequestDef<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> genForListDatabaseSchemas() {
        // basic
        HttpRequestDef.Builder<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseSchemasRequest.class, ListDatabaseSchemasResponse.class)
                .withName("ListDatabaseSchemas")
                .withUri("/v3/{project_id}/instances/{instance_id}/schemas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getInstanceId,
                ListDatabaseSchemasRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getDbName, ListDatabaseSchemasRequest::setDbName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getOffset, ListDatabaseSchemasRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getLimit, ListDatabaseSchemasRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getXLanguage, ListDatabaseSchemasRequest::setXLanguage));

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
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
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
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getXLanguage, ListDatabasesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> listDatastores =
        genForListDatastores();

    private static HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> genForListDatastores() {
        // basic
        HttpRequestDef.Builder<ListDatastoresRequest, ListDatastoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatastoresRequest.class, ListDatastoresResponse.class)
                .withName("ListDatastores")
                .withUri("/v3/{project_id}/datastore/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatastoresRequest::getXLanguage, ListDatastoresRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoresDetailsRequest, ListDatastoresDetailsResponse> listDatastoresDetails =
        genForListDatastoresDetails();

    private static HttpRequestDef<ListDatastoresDetailsRequest, ListDatastoresDetailsResponse> genForListDatastoresDetails() {
        // basic
        HttpRequestDef.Builder<ListDatastoresDetailsRequest, ListDatastoresDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDatastoresDetailsRequest.class, ListDatastoresDetailsResponse.class)
            .withName("ListDatastoresDetails")
            .withUri("/v3.1/{project_id}/datastores")
            .withContentType("application/json");

        // requests
        builder.<ListDatastoresDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDatastoresDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListDatastoresDetailsRequest::getXLanguage,
                ListDatastoresDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbBackupsRequest, ListDbBackupsResponse> listDbBackups =
        genForListDbBackups();

    private static HttpRequestDef<ListDbBackupsRequest, ListDbBackupsResponse> genForListDbBackups() {
        // basic
        HttpRequestDef.Builder<ListDbBackupsRequest, ListDbBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbBackupsRequest.class, ListDbBackupsResponse.class)
                .withName("ListDbBackups")
                .withUri("/v3.1/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getInstanceId, ListDbBackupsRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getBackupId, ListDbBackupsRequest::setBackupId));
        builder.<ListDbBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDbBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getBackupType, ListDbBackupsRequest::setBackupType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getOffset, ListDbBackupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getLimit, ListDbBackupsRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getBeginTime, ListDbBackupsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getEndTime, ListDbBackupsRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getXLanguage, ListDbBackupsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbFlavorsRequest, ListDbFlavorsResponse> listDbFlavors =
        genForListDbFlavors();

    private static HttpRequestDef<ListDbFlavorsRequest, ListDbFlavorsResponse> genForListDbFlavors() {
        // basic
        HttpRequestDef.Builder<ListDbFlavorsRequest, ListDbFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbFlavorsRequest.class, ListDbFlavorsResponse.class)
                .withName("ListDbFlavors")
                .withUri("/v3.1/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getVersion, ListDbFlavorsRequest::setVersion));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getSpecCode, ListDbFlavorsRequest::setSpecCode));
        builder.<String>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getHaMode, ListDbFlavorsRequest::setHaMode));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getLimit, ListDbFlavorsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getOffset, ListDbFlavorsRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getXLanguage, ListDbFlavorsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> listDbUsers = genForListDbUsers();

    private static HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> genForListDbUsers() {
        // basic
        HttpRequestDef.Builder<ListDbUsersRequest, ListDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbUsersRequest.class, ListDbUsersResponse.class)
                .withName("ListDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, ListDbUsersRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getOffset, ListDbUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, ListDbUsersRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getXLanguage, ListDbUsersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDisasterRecoveryRecordRequest, ListDisasterRecoveryRecordResponse> listDisasterRecoveryRecord =
        genForListDisasterRecoveryRecord();

    private static HttpRequestDef<ListDisasterRecoveryRecordRequest, ListDisasterRecoveryRecordResponse> genForListDisasterRecoveryRecord() {
        // basic
        HttpRequestDef.Builder<ListDisasterRecoveryRecordRequest, ListDisasterRecoveryRecordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDisasterRecoveryRecordRequest.class,
                    ListDisasterRecoveryRecordResponse.class)
                .withName("ListDisasterRecoveryRecord")
                .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDisasterRecoveryRecordRequest::getInstanceId,
                ListDisasterRecoveryRecordRequest::setInstanceId));
        builder.<String>withRequestField("entity_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDisasterRecoveryRecordRequest::getEntityId,
                ListDisasterRecoveryRecordRequest::setEntityId));
        builder.<ListDisasterRecoveryRecordRequest.EntityTypeEnum>withRequestField("entity_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDisasterRecoveryRecordRequest.EntityTypeEnum.class),
            f -> f.withMarshaller(ListDisasterRecoveryRecordRequest::getEntityType,
                ListDisasterRecoveryRecordRequest::setEntityType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDisasterRecoveryRecordRequest::getLimit,
                ListDisasterRecoveryRecordRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDisasterRecoveryRecordRequest::getOffset,
                ListDisasterRecoveryRecordRequest::setOffset));
        builder.<ListDisasterRecoveryRecordRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDisasterRecoveryRecordRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListDisasterRecoveryRecordRequest::getXLanguage,
                ListDisasterRecoveryRecordRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotas =
        genForListEpsQuotas();

    private static HttpRequestDef<ListEpsQuotasRequest, ListEpsQuotasResponse> genForListEpsQuotas() {
        // basic
        HttpRequestDef.Builder<ListEpsQuotasRequest, ListEpsQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEpsQuotasRequest.class, ListEpsQuotasResponse.class)
                .withName("ListEpsQuotas")
                .withUri("/v3/{project_id}/enterprise-projects/quotas")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getOffset, ListEpsQuotasRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getLimit, ListEpsQuotasRequest::setLimit));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getEnterpriseProjectId,
                ListEpsQuotasRequest::setEnterpriseProjectId));
        builder.<ListEpsQuotasRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEpsQuotasRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getXLanguage, ListEpsQuotasRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeaturesRequest, ListFeaturesResponse> listFeatures = genForListFeatures();

    private static HttpRequestDef<ListFeaturesRequest, ListFeaturesResponse> genForListFeatures() {
        // basic
        HttpRequestDef.Builder<ListFeaturesRequest, ListFeaturesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeaturesRequest.class, ListFeaturesResponse.class)
                .withName("ListFeatures")
                .withUri("/v3/{project_id}/instances/{instance_id}/advance-features")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeaturesRequest::getInstanceId, ListFeaturesRequest::setInstanceId));
        builder.<ListFeaturesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFeaturesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListFeaturesRequest::getXLanguage, ListFeaturesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v3/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getVersion, ListFlavorsRequest::setVersion));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSpecCode, ListFlavorsRequest::setSpecCode));
        builder.<String>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getHaMode, ListFlavorsRequest::setHaMode));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, ListFlavorsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getOffset, ListFlavorsRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getXLanguage, ListFlavorsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsDetailsRequest, ListFlavorsDetailsResponse> listFlavorsDetails =
        genForListFlavorsDetails();

    private static HttpRequestDef<ListFlavorsDetailsRequest, ListFlavorsDetailsResponse> genForListFlavorsDetails() {
        // basic
        HttpRequestDef.Builder<ListFlavorsDetailsRequest, ListFlavorsDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsDetailsRequest.class, ListFlavorsDetailsResponse.class)
                .withName("ListFlavorsDetails")
                .withUri("/v3.2/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsDetailsRequest::getVersion, ListFlavorsDetailsRequest::setVersion));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsDetailsRequest::getSpecCode, ListFlavorsDetailsRequest::setSpecCode));
        builder.<String>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsDetailsRequest::getHaMode, ListFlavorsDetailsRequest::setHaMode));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsDetailsRequest::getLimit, ListFlavorsDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsDetailsRequest::getOffset, ListFlavorsDetailsRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsDetailsRequest::getXLanguage, ListFlavorsDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> listGaussDbDatastores =
        genForListGaussDbDatastores();

    private static HttpRequestDef<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> genForListGaussDbDatastores() {
        // basic
        HttpRequestDef.Builder<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGaussDbDatastoresRequest.class, ListGaussDbDatastoresResponse.class)
            .withName("ListGaussDbDatastores")
            .withUri("/v3/{project_id}/datastores")
            .withContentType("application/json");

        // requests
        builder.<ListGaussDbDatastoresRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGaussDbDatastoresRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListGaussDbDatastoresRequest::getXLanguage,
                ListGaussDbDatastoresRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOperationsRequest, ListHistoryOperationsResponse> listHistoryOperations =
        genForListHistoryOperations();

    private static HttpRequestDef<ListHistoryOperationsRequest, ListHistoryOperationsResponse> genForListHistoryOperations() {
        // basic
        HttpRequestDef.Builder<ListHistoryOperationsRequest, ListHistoryOperationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListHistoryOperationsRequest.class, ListHistoryOperationsResponse.class)
            .withName("ListHistoryOperations")
            .withUri("/v3/{project_id}/configurations/{config_id}/histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperationsRequest::getConfigId,
                ListHistoryOperationsRequest::setConfigId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperationsRequest::getOffset, ListHistoryOperationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperationsRequest::getLimit, ListHistoryOperationsRequest::setLimit));
        builder.<ListHistoryOperationsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHistoryOperationsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListHistoryOperationsRequest::getXLanguage,
                ListHistoryOperationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceDetailsRequest, ListInstanceDetailsResponse> listInstanceDetails =
        genForListInstanceDetails();

    private static HttpRequestDef<ListInstanceDetailsRequest, ListInstanceDetailsResponse> genForListInstanceDetails() {
        // basic
        HttpRequestDef.Builder<ListInstanceDetailsRequest, ListInstanceDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceDetailsRequest.class, ListInstanceDetailsResponse.class)
                .withName("ListInstanceDetails")
                .withUri("/v3.2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getId, ListInstanceDetailsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getName, ListInstanceDetailsRequest::setName));
        builder.<ListInstanceDetailsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceDetailsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getType, ListInstanceDetailsRequest::setType));
        builder.<ListInstanceDetailsRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceDetailsRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getDatastoreType,
                ListInstanceDetailsRequest::setDatastoreType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getVpcId, ListInstanceDetailsRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getSubnetId, ListInstanceDetailsRequest::setSubnetId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getOffset, ListInstanceDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getLimit, ListInstanceDetailsRequest::setLimit));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getTags, ListInstanceDetailsRequest::setTags));
        builder.<ListInstanceDetailsRequest.ChargeModeEnum>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceDetailsRequest.ChargeModeEnum.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getChargeMode,
                ListInstanceDetailsRequest::setChargeMode));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceDetailsRequest::getXLanguage, ListInstanceDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceEngineDetailRequest, ListInstanceEngineDetailResponse> listInstanceEngineDetail =
        genForListInstanceEngineDetail();

    private static HttpRequestDef<ListInstanceEngineDetailRequest, ListInstanceEngineDetailResponse> genForListInstanceEngineDetail() {
        // basic
        HttpRequestDef.Builder<ListInstanceEngineDetailRequest, ListInstanceEngineDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListInstanceEngineDetailRequest.class, ListInstanceEngineDetailResponse.class)
                .withName("ListInstanceEngineDetail")
                .withUri("/v3/{project_id}/datastore/instances")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceEngineDetailRequest::getOffset,
                ListInstanceEngineDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceEngineDetailRequest::getLimit,
                ListInstanceEngineDetailRequest::setLimit));
        builder.<ListInstanceEngineDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceEngineDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceEngineDetailRequest::getXLanguage,
                ListInstanceEngineDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse> listInstanceErrorLogs =
        genForListInstanceErrorLogs();

    private static HttpRequestDef<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse> genForListInstanceErrorLogs() {
        // basic
        HttpRequestDef.Builder<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceErrorLogsRequest.class, ListInstanceErrorLogsResponse.class)
            .withName("ListInstanceErrorLogs")
            .withUri("/v3/{project_id}/instances/{instance_id}/error-log")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceErrorLogsRequest::getInstanceId,
                ListInstanceErrorLogsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceErrorLogsRequest::getOffset, ListInstanceErrorLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceErrorLogsRequest::getLimit, ListInstanceErrorLogsRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceErrorLogsRequest::getStartTime,
                ListInstanceErrorLogsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceErrorLogsRequest::getEndTime, ListInstanceErrorLogsRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceErrorLogsRequest::getXLanguage,
                ListInstanceErrorLogsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForListInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForListInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, ListInstanceTagsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, ListInstanceTagsRequest::setXLanguage));

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
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getId, ListInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<ListInstancesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getType, ListInstancesRequest::setType));
        builder.<ListInstancesRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, ListInstancesRequest::setDatastoreType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, ListInstancesRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, ListInstancesRequest::setSubnetId));
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
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInstancesRequest::getTags, ListInstancesRequest::setTags));
        builder.<ListInstancesRequest.ChargeModeEnum>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.ChargeModeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getChargeMode, ListInstancesRequest::setChargeMode));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getXLanguage, ListInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetails =
        genForListInstancesDetails();

    private static HttpRequestDef<ListInstancesDetailsRequest, ListInstancesDetailsResponse> genForListInstancesDetails() {
        // basic
        HttpRequestDef.Builder<ListInstancesDetailsRequest, ListInstancesDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstancesDetailsRequest.class, ListInstancesDetailsResponse.class)
            .withName("ListInstancesDetails")
            .withUri("/v3.1/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getId, ListInstancesDetailsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getName, ListInstancesDetailsRequest::setName));
        builder.<ListInstancesDetailsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getType, ListInstancesDetailsRequest::setType));
        builder.<ListInstancesDetailsRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getDatastoreType,
                ListInstancesDetailsRequest::setDatastoreType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getVpcId, ListInstancesDetailsRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getSubnetId, ListInstancesDetailsRequest::setSubnetId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getOffset, ListInstancesDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getLimit, ListInstancesDetailsRequest::setLimit));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getTags, ListInstancesDetailsRequest::setTags));
        builder.<ListInstancesDetailsRequest.ChargeModeEnum>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.ChargeModeEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getChargeMode,
                ListInstancesDetailsRequest::setChargeMode));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getXLanguage,
                ListInstancesDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKernelPluginsRequest, ListKernelPluginsResponse> listKernelPlugins =
        genForListKernelPlugins();

    private static HttpRequestDef<ListKernelPluginsRequest, ListKernelPluginsResponse> genForListKernelPlugins() {
        // basic
        HttpRequestDef.Builder<ListKernelPluginsRequest, ListKernelPluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKernelPluginsRequest.class, ListKernelPluginsResponse.class)
                .withName("ListKernelPlugins")
                .withUri("/v3/{project_id}/instances/{instance_id}/kernel-plugins")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKernelPluginsRequest::getInstanceId, ListKernelPluginsRequest::setInstanceId));
        builder.<ListKernelPluginsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListKernelPluginsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListKernelPluginsRequest::getXLanguage, ListKernelPluginsRequest::setXLanguage));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListKernelPluginsResponse::getBody, ListKernelPluginsResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> listParamGroupTemplates =
        genForListParamGroupTemplates();

    private static HttpRequestDef<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> genForListParamGroupTemplates() {
        // basic
        HttpRequestDef.Builder<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListParamGroupTemplatesRequest.class, ListParamGroupTemplatesResponse.class)
            .withName("ListParamGroupTemplates")
            .withUri("/v3.1/{project_id}/configurations")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListParamGroupTemplatesRequest::getOffset,
                ListParamGroupTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListParamGroupTemplatesRequest::getLimit, ListParamGroupTemplatesRequest::setLimit));
        builder.<ListParamGroupTemplatesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListParamGroupTemplatesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListParamGroupTemplatesRequest::getXLanguage,
                ListParamGroupTemplatesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListParameterGroupTemplatesRequest, ListParameterGroupTemplatesResponse> listParameterGroupTemplates =
        genForListParameterGroupTemplates();

    private static HttpRequestDef<ListParameterGroupTemplatesRequest, ListParameterGroupTemplatesResponse> genForListParameterGroupTemplates() {
        // basic
        HttpRequestDef.Builder<ListParameterGroupTemplatesRequest, ListParameterGroupTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListParameterGroupTemplatesRequest.class,
                    ListParameterGroupTemplatesResponse.class)
                .withName("ListParameterGroupTemplates")
                .withUri("/v3.2/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListParameterGroupTemplatesRequest::getOffset,
                ListParameterGroupTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListParameterGroupTemplatesRequest::getLimit,
                ListParameterGroupTemplatesRequest::setLimit));
        builder.<ListParameterGroupTemplatesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListParameterGroupTemplatesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListParameterGroupTemplatesRequest::getXLanguage,
                ListParameterGroupTemplatesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginExtensionsRequest, ListPluginExtensionsResponse> listPluginExtensions =
        genForListPluginExtensions();

    private static HttpRequestDef<ListPluginExtensionsRequest, ListPluginExtensionsResponse> genForListPluginExtensions() {
        // basic
        HttpRequestDef.Builder<ListPluginExtensionsRequest, ListPluginExtensionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPluginExtensionsRequest.class, ListPluginExtensionsResponse.class)
            .withName("ListPluginExtensions")
            .withUri("/v3/{project_id}/instances/{instance_id}/plugin-extensions")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginExtensionsRequest::getInstanceId,
                ListPluginExtensionsRequest::setInstanceId));
        builder.<ListPluginExtensionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPluginExtensionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListPluginExtensionsRequest::getXLanguage,
                ListPluginExtensionsRequest::setXLanguage));
        builder.<ListPluginExtensionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListPluginExtensionsRequestBody.class),
            f -> f.withMarshaller(ListPluginExtensionsRequest::getBody, ListPluginExtensionsRequest::setBody));

        // response
        builder.<List<PluginExtensions>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPluginExtensionsResponse::getBody, ListPluginExtensionsResponse::setBody)
                .withInnerContainerType(PluginExtensions.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPredefinedTagsRequest, ListPredefinedTagsResponse> listPredefinedTags =
        genForListPredefinedTags();

    private static HttpRequestDef<ListPredefinedTagsRequest, ListPredefinedTagsResponse> genForListPredefinedTags() {
        // basic
        HttpRequestDef.Builder<ListPredefinedTagsRequest, ListPredefinedTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPredefinedTagsRequest.class, ListPredefinedTagsResponse.class)
                .withName("ListPredefinedTags")
                .withUri("/v3/{project_id}/predefined-tags")
                .withContentType("application/json");

        // requests
        builder.<ListPredefinedTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPredefinedTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListPredefinedTagsRequest::getXLanguage, ListPredefinedTagsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, ListProjectTagsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstances =
        genForListRecycleInstances();

    private static HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> genForListRecycleInstances() {
        // basic
        HttpRequestDef.Builder<ListRecycleInstancesRequest, ListRecycleInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRecycleInstancesRequest.class, ListRecycleInstancesResponse.class)
            .withName("ListRecycleInstances")
            .withUri("/v3/{project_id}/recycle-instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getInstanceName,
                ListRecycleInstancesRequest::setInstanceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getOffset, ListRecycleInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getLimit, ListRecycleInstancesRequest::setLimit));
        builder.<ListRecycleInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRecycleInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getXLanguage,
                ListRecycleInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecycleInstancesDetailsRequest, ListRecycleInstancesDetailsResponse> listRecycleInstancesDetails =
        genForListRecycleInstancesDetails();

    private static HttpRequestDef<ListRecycleInstancesDetailsRequest, ListRecycleInstancesDetailsResponse> genForListRecycleInstancesDetails() {
        // basic
        HttpRequestDef.Builder<ListRecycleInstancesDetailsRequest, ListRecycleInstancesDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRecycleInstancesDetailsRequest.class,
                    ListRecycleInstancesDetailsResponse.class)
                .withName("ListRecycleInstancesDetails")
                .withUri("/v3.1/{project_id}/recycle-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleInstancesDetailsRequest::getInstanceName,
                ListRecycleInstancesDetailsRequest::setInstanceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesDetailsRequest::getOffset,
                ListRecycleInstancesDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesDetailsRequest::getLimit,
                ListRecycleInstancesDetailsRequest::setLimit));
        builder.<ListRecycleInstancesDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRecycleInstancesDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListRecycleInstancesDetailsRequest::getXLanguage,
                ListRecycleInstancesDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestorableInstancesRequest, ListRestorableInstancesResponse> listRestorableInstances =
        genForListRestorableInstances();

    private static HttpRequestDef<ListRestorableInstancesRequest, ListRestorableInstancesResponse> genForListRestorableInstances() {
        // basic
        HttpRequestDef.Builder<ListRestorableInstancesRequest, ListRestorableInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRestorableInstancesRequest.class, ListRestorableInstancesResponse.class)
            .withName("ListRestorableInstances")
            .withUri("/v3/{project_id}/restorable-instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getSourceInstanceId,
                ListRestorableInstancesRequest::setSourceInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getBackupId,
                ListRestorableInstancesRequest::setBackupId));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getRestoreTime,
                ListRestorableInstancesRequest::setRestoreTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getOffset,
                ListRestorableInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getLimit, ListRestorableInstancesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getXLanguage,
                ListRestorableInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestorableInstancesDetailsRequest, ListRestorableInstancesDetailsResponse> listRestorableInstancesDetails =
        genForListRestorableInstancesDetails();

    private static HttpRequestDef<ListRestorableInstancesDetailsRequest, ListRestorableInstancesDetailsResponse> genForListRestorableInstancesDetails() {
        // basic
        HttpRequestDef.Builder<ListRestorableInstancesDetailsRequest, ListRestorableInstancesDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRestorableInstancesDetailsRequest.class,
                    ListRestorableInstancesDetailsResponse.class)
                .withName("ListRestorableInstancesDetails")
                .withUri("/v3.1/{project_id}/restorable-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesDetailsRequest::getSourceInstanceId,
                ListRestorableInstancesDetailsRequest::setSourceInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesDetailsRequest::getBackupId,
                ListRestorableInstancesDetailsRequest::setBackupId));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesDetailsRequest::getRestoreTime,
                ListRestorableInstancesDetailsRequest::setRestoreTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestorableInstancesDetailsRequest::getOffset,
                ListRestorableInstancesDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestorableInstancesDetailsRequest::getLimit,
                ListRestorableInstancesDetailsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesDetailsRequest::getXLanguage,
                ListRestorableInstancesDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimes =
        genForListRestoreTimes();

    private static HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> genForListRestoreTimes() {
        // basic
        HttpRequestDef.Builder<ListRestoreTimesRequest, ListRestoreTimesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreTimesRequest.class, ListRestoreTimesResponse.class)
                .withName("ListRestoreTimes")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore-time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getInstanceId, ListRestoreTimesRequest::setInstanceId));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getDate, ListRestoreTimesRequest::setDate));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getXLanguage, ListRestoreTimesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduleTaskRequest, ListScheduleTaskResponse> listScheduleTask =
        genForListScheduleTask();

    private static HttpRequestDef<ListScheduleTaskRequest, ListScheduleTaskResponse> genForListScheduleTask() {
        // basic
        HttpRequestDef.Builder<ListScheduleTaskRequest, ListScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduleTaskRequest.class, ListScheduleTaskResponse.class)
                .withName("ListScheduleTask")
                .withUri("/v3/{project_id}/instances/schedule-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleTaskRequest::getInstanceId, ListScheduleTaskRequest::setInstanceId));
        builder.<ListScheduleTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduleTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListScheduleTaskRequest::getStatus, ListScheduleTaskRequest::setStatus));
        builder.<ListScheduleTaskRequest.NameEnum>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduleTaskRequest.NameEnum.class),
            f -> f.withMarshaller(ListScheduleTaskRequest::getName, ListScheduleTaskRequest::setName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleTaskRequest::getStartTime, ListScheduleTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleTaskRequest::getEndTime, ListScheduleTaskRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduleTaskRequest::getOffset, ListScheduleTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduleTaskRequest::getLimit, ListScheduleTaskRequest::setLimit));
        builder.<ListScheduleTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduleTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListScheduleTaskRequest::getXLanguage, ListScheduleTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypes =
        genForListStorageTypes();

    private static HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> genForListStorageTypes() {
        // basic
        HttpRequestDef.Builder<ListStorageTypesRequest, ListStorageTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStorageTypesRequest.class, ListStorageTypesResponse.class)
                .withName("ListStorageTypes")
                .withUri("/v3/{project_id}/storage-type")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getVersion, ListStorageTypesRequest::setVersion));
        builder.<ListStorageTypesRequest.HaModeEnum>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStorageTypesRequest.HaModeEnum.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getHaMode, ListStorageTypesRequest::setHaMode));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getXLanguage, ListStorageTypesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse> listSupportKernelPlugins =
        genForListSupportKernelPlugins();

    private static HttpRequestDef<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse> genForListSupportKernelPlugins() {
        // basic
        HttpRequestDef.Builder<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListSupportKernelPluginsRequest.class, ListSupportKernelPluginsResponse.class)
                .withName("ListSupportKernelPlugins")
                .withUri("/v3/{project_id}/instances/kernel-plugins")
                .withContentType("application/json");

        // requests
        builder.<ListSupportKernelPluginsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSupportKernelPluginsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSupportKernelPluginsRequest::getXLanguage,
                ListSupportKernelPluginsRequest::setXLanguage));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportKernelPluginsResponse::getBody, ListSupportKernelPluginsResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v3/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<ListTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getStatus, ListTasksRequest::setStatus));
        builder.<ListTasksRequest.NameEnum>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.NameEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getName, ListTasksRequest::setName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getStartTime, ListTasksRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getEndTime, ListTasksRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, ListTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, ListTasksRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getXLanguage, ListTasksRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopIoTrafficsRequest, ListTopIoTrafficsResponse> listTopIoTraffics =
        genForListTopIoTraffics();

    private static HttpRequestDef<ListTopIoTrafficsRequest, ListTopIoTrafficsResponse> genForListTopIoTraffics() {
        // basic
        HttpRequestDef.Builder<ListTopIoTrafficsRequest, ListTopIoTrafficsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopIoTrafficsRequest.class, ListTopIoTrafficsResponse.class)
                .withName("ListTopIoTraffics")
                .withUri("/v3/{project_id}/instances/{instance_id}/top-io-traffics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopIoTrafficsRequest::getInstanceId, ListTopIoTrafficsRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopIoTrafficsRequest::getNodeId, ListTopIoTrafficsRequest::setNodeId));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopIoTrafficsRequest::getComponentId, ListTopIoTrafficsRequest::setComponentId));
        builder.<Integer>withRequestField("top_io_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopIoTrafficsRequest::getTopIoNum, ListTopIoTrafficsRequest::setTopIoNum));
        builder.<ListTopIoTrafficsRequest.SortConditionEnum>withRequestField("sort_condition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTopIoTrafficsRequest.SortConditionEnum.class),
            f -> f.withMarshaller(ListTopIoTrafficsRequest::getSortCondition,
                ListTopIoTrafficsRequest::setSortCondition));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopIoTrafficsRequest::getXLanguage, ListTopIoTrafficsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> modifyEpsQuota =
        genForModifyEpsQuota();

    private static HttpRequestDef<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> genForModifyEpsQuota() {
        // basic
        HttpRequestDef.Builder<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyEpsQuotaRequest.class, ModifyEpsQuotaResponse.class)
                .withName("ModifyEpsQuota")
                .withUri("/v3/{project_id}/enterprise-projects/quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ModifyEpsQuotaRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyEpsQuotaRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ModifyEpsQuotaRequest::getXLanguage, ModifyEpsQuotaRequest::setXLanguage));
        builder.<ModifyEpsQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyEpsQuotaRequestBody.class),
            f -> f.withMarshaller(ModifyEpsQuotaRequest::getBody, ModifyEpsQuotaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetConfigurationRequest, ResetConfigurationResponse> resetConfiguration =
        genForResetConfiguration();

    private static HttpRequestDef<ResetConfigurationRequest, ResetConfigurationResponse> genForResetConfiguration() {
        // basic
        HttpRequestDef.Builder<ResetConfigurationRequest, ResetConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetConfigurationRequest.class, ResetConfigurationResponse.class)
                .withName("ResetConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConfigurationRequest::getConfigId, ResetConfigurationRequest::setConfigId));
        builder.<ResetConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetConfigurationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ResetConfigurationRequest::getXLanguage, ResetConfigurationRequest::setXLanguage));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetConfigurationResponse::getBody, ResetConfigurationResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ResetDrConfigRequest, ResetDrConfigResponse> resetDrConfig =
        genForResetDrConfig();

    private static HttpRequestDef<ResetDrConfigRequest, ResetDrConfigResponse> genForResetDrConfig() {
        // basic
        HttpRequestDef.Builder<ResetDrConfigRequest, ResetDrConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetDrConfigRequest.class, ResetDrConfigResponse.class)
                .withName("ResetDrConfig")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/reset-dr-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDrConfigRequest::getInstanceId, ResetDrConfigRequest::setInstanceId));
        builder.<ResetDrConfigRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetDrConfigRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ResetDrConfigRequest::getXLanguage, ResetDrConfigRequest::setXLanguage));
        builder.<ResetDrConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetDrConfigRequestBody.class),
            f -> f.withMarshaller(ResetDrConfigRequest::getBody, ResetDrConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdRequest, ResetPwdResponse> resetPwd = genForResetPwd();

    private static HttpRequestDef<ResetPwdRequest, ResetPwdResponse> genForResetPwd() {
        // basic
        HttpRequestDef.Builder<ResetPwdRequest, ResetPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPwdRequest.class, ResetPwdResponse.class)
                .withName("ResetPwd")
                .withUri("/v3/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdRequest::getInstanceId, ResetPwdRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdRequest::getXLanguage, ResetPwdRequest::setXLanguage));
        builder.<PwdResetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PwdResetRequest.class),
            f -> f.withMarshaller(ResetPwdRequest::getBody, ResetPwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> resizeInstanceFlavor =
        genForResizeInstanceFlavor();

    private static HttpRequestDef<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> genForResizeInstanceFlavor() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ResizeInstanceFlavorRequest.class, ResizeInstanceFlavorResponse.class)
            .withName("ResizeInstanceFlavor")
            .withUri("/v3/{project_id}/instance/{instance_id}/flavor")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceFlavorRequest::getInstanceId,
                ResizeInstanceFlavorRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceFlavorRequest::getXLanguage,
                ResizeInstanceFlavorRequest::setXLanguage));
        builder.<OpenGaussResizeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussResizeRequest.class),
            f -> f.withMarshaller(ResizeInstanceFlavorRequest::getBody, ResizeInstanceFlavorRequest::setBody));

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
                .withUri("/v3/{project_id}/instances/{instance_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartInstanceRequest::getInstanceId, RestartInstanceRequest::setInstanceId));
        builder.<RestartInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestartInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(RestartInstanceRequest::getXLanguage, RestartInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstance =
        genForRestoreInstance();

    private static HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> genForRestoreInstance() {
        // basic
        HttpRequestDef.Builder<RestoreInstanceRequest, RestoreInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreInstanceRequest.class, RestoreInstanceResponse.class)
                .withName("RestoreInstance")
                .withUri("/v3/{project_id}/instances/recovery")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreInstanceRequest::getXLanguage, RestoreInstanceRequest::setXLanguage));
        builder.<RestoreInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreInstanceRequestBody.class),
            f -> f.withMarshaller(RestoreInstanceRequest::getBody, RestoreInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse> resumePluginExtensions =
        genForResumePluginExtensions();

    private static HttpRequestDef<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse> genForResumePluginExtensions() {
        // basic
        HttpRequestDef.Builder<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResumePluginExtensionsRequest.class, ResumePluginExtensionsResponse.class)
            .withName("ResumePluginExtensions")
            .withUri("/v3/{project_id}/instances/{instance_id}/config-plugin-extensions")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumePluginExtensionsRequest::getInstanceId,
                ResumePluginExtensionsRequest::setInstanceId));
        builder.<ResumePluginExtensionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResumePluginExtensionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ResumePluginExtensionsRequest::getXLanguage,
                ResumePluginExtensionsRequest::setXLanguage));
        builder.<ResumePluginExtensionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResumePluginExtensionsRequestBody.class),
            f -> f.withMarshaller(ResumePluginExtensionsRequest::getBody, ResumePluginExtensionsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResumePluginExtensionsResponse::getBody, ResumePluginExtensionsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<RunInstanceActionRequest, RunInstanceActionResponse> runInstanceAction =
        genForRunInstanceAction();

    private static HttpRequestDef<RunInstanceActionRequest, RunInstanceActionResponse> genForRunInstanceAction() {
        // basic
        HttpRequestDef.Builder<RunInstanceActionRequest, RunInstanceActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunInstanceActionRequest.class, RunInstanceActionResponse.class)
                .withName("RunInstanceAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunInstanceActionRequest::getInstanceId, RunInstanceActionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunInstanceActionRequest::getXLanguage, RunInstanceActionRequest::setXLanguage));
        builder.<OpenGaussInstanceActionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussInstanceActionRequest.class),
            f -> f.withMarshaller(RunInstanceActionRequest::getBody, RunInstanceActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse> searchAutoEnlargePolicy =
        genForSearchAutoEnlargePolicy();

    private static HttpRequestDef<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse> genForSearchAutoEnlargePolicy() {
        // basic
        HttpRequestDef.Builder<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchAutoEnlargePolicyRequest.class, SearchAutoEnlargePolicyResponse.class)
            .withName("SearchAutoEnlargePolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/auto-enlarge-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAutoEnlargePolicyRequest::getInstanceId,
                SearchAutoEnlargePolicyRequest::setInstanceId));
        builder.<SearchAutoEnlargePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchAutoEnlargePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SearchAutoEnlargePolicyRequest::getXLanguage,
                SearchAutoEnlargePolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy =
        genForSetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForSetBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetBackupPolicyRequest, SetBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBackupPolicyRequest.class, SetBackupPolicyResponse.class)
                .withName("SetBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, SetBackupPolicyRequest::setInstanceId));
        builder.<SetBackupPolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getXLanguage, SetBackupPolicyRequest::setXLanguage));
        builder.<SetBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, SetBackupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwd = genForSetDbUserPwd();

    private static HttpRequestDef<SetDbUserPwdRequest, SetDbUserPwdResponse> genForSetDbUserPwd() {
        // basic
        HttpRequestDef.Builder<SetDbUserPwdRequest, SetDbUserPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetDbUserPwdRequest.class, SetDbUserPwdResponse.class)
                .withName("SetDbUserPwd")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getInstanceId, SetDbUserPwdRequest::setInstanceId));
        builder.<SetDbUserPwdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetDbUserPwdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getXLanguage, SetDbUserPwdRequest::setXLanguage));
        builder.<DbUserPwdRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbUserPwdRequest.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getBody, SetDbUserPwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse> setKernelPluginLicense =
        genForSetKernelPluginLicense();

    private static HttpRequestDef<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse> genForSetKernelPluginLicense() {
        // basic
        HttpRequestDef.Builder<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetKernelPluginLicenseRequest.class, SetKernelPluginLicenseResponse.class)
            .withName("SetKernelPluginLicense")
            .withUri("/v3/{project_id}/instances/{instance_id}/kernel-plugin-license")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetKernelPluginLicenseRequest::getInstanceId,
                SetKernelPluginLicenseRequest::setInstanceId));
        builder.<SetKernelPluginLicenseRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetKernelPluginLicenseRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetKernelPluginLicenseRequest::getXLanguage,
                SetKernelPluginLicenseRequest::setXLanguage));
        builder.<SetKernelPluginLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetKernelPluginLicenseRequestBody.class),
            f -> f.withMarshaller(SetKernelPluginLicenseRequest::getBody, SetKernelPluginLicenseRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetKernelPluginLicenseResponse::getBody, SetKernelPluginLicenseResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse> setNewBackupPolicy =
        genForSetNewBackupPolicy();

    private static HttpRequestDef<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse> genForSetNewBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetNewBackupPolicyRequest.class, SetNewBackupPolicyResponse.class)
                .withName("SetNewBackupPolicy")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetNewBackupPolicyRequest::getInstanceId, SetNewBackupPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetNewBackupPolicyRequest::getXLanguage, SetNewBackupPolicyRequest::setXLanguage));
        builder.<SetNewBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetNewBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetNewBackupPolicyRequest::getBody, SetNewBackupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicy =
        genForSetRecyclePolicy();

    private static HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> genForSetRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<SetRecyclePolicyRequest, SetRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRecyclePolicyRequest.class, SetRecyclePolicyResponse.class)
                .withName("SetRecyclePolicy")
                .withUri("/v3/{project_id}/recycle-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RecyclePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecyclePolicyRequestBody.class),
            f -> f.withMarshaller(SetRecyclePolicyRequest::getBody, SetRecyclePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy =
        genForShowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForShowBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyRequest, ShowBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPolicyRequest.class, ShowBackupPolicyResponse.class)
                .withName("ShowBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, ShowBackupPolicyRequest::setInstanceId));
        builder.<ShowBackupPolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowBackupPolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getXLanguage, ShowBackupPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBalanceStatusRequest, ShowBalanceStatusResponse> showBalanceStatus =
        genForShowBalanceStatus();

    private static HttpRequestDef<ShowBalanceStatusRequest, ShowBalanceStatusResponse> genForShowBalanceStatus() {
        // basic
        HttpRequestDef.Builder<ShowBalanceStatusRequest, ShowBalanceStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBalanceStatusRequest.class, ShowBalanceStatusResponse.class)
                .withName("ShowBalanceStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/balance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBalanceStatusRequest::getInstanceId, ShowBalanceStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBalanceStatusRequest::getXLanguage, ShowBalanceStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse> showBatchUpgradeCandidateVersions =
        genForShowBatchUpgradeCandidateVersions();

    private static HttpRequestDef<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse> genForShowBatchUpgradeCandidateVersions() {
        // basic
        HttpRequestDef.Builder<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchUpgradeCandidateVersionsRequest.class,
                    ShowBatchUpgradeCandidateVersionsResponse.class)
                .withName("ShowBatchUpgradeCandidateVersions")
                .withUri("/v3/{project_id}/instances/db-upgrade/candidate-versions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ShowBatchUpgradeCandidateVersionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowBatchUpgradeCandidateVersionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowBatchUpgradeCandidateVersionsRequest::getXLanguage,
                ShowBatchUpgradeCandidateVersionsRequest::setXLanguage));
        builder.<UpgradeInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeInstancesRequestBody.class),
            f -> f.withMarshaller(ShowBatchUpgradeCandidateVersionsRequest::getBody,
                ShowBatchUpgradeCandidateVersionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetail =
        genForShowConfigurationDetail();

    private static HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> genForShowConfigurationDetail() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConfigurationDetailRequest.class, ShowConfigurationDetailResponse.class)
            .withName("ShowConfigurationDetail")
            .withUri("/v3/{project_id}/configurations/{config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationDetailRequest::getConfigId,
                ShowConfigurationDetailRequest::setConfigId));
        builder.<ShowConfigurationDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowConfigurationDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowConfigurationDetailRequest::getXLanguage,
                ShowConfigurationDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCrossCloudDisasterInstanceMonitorRequest, ShowCrossCloudDisasterInstanceMonitorResponse> showCrossCloudDisasterInstanceMonitor =
        genForShowCrossCloudDisasterInstanceMonitor();

    private static HttpRequestDef<ShowCrossCloudDisasterInstanceMonitorRequest, ShowCrossCloudDisasterInstanceMonitorResponse> genForShowCrossCloudDisasterInstanceMonitor() {
        // basic
        HttpRequestDef.Builder<ShowCrossCloudDisasterInstanceMonitorRequest, ShowCrossCloudDisasterInstanceMonitorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCrossCloudDisasterInstanceMonitorRequest.class,
                    ShowCrossCloudDisasterInstanceMonitorResponse.class)
                .withName("ShowCrossCloudDisasterInstanceMonitor")
                .withUri("/v3.5/{project_id}/instances/{instance_id}/disaster-recovery/monitor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterInstanceMonitorRequest::getInstanceId,
                ShowCrossCloudDisasterInstanceMonitorRequest::setInstanceId));
        builder.<ShowCrossCloudDisasterInstanceMonitorRequest.DisasterTypeEnum>withRequestField("disaster_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCrossCloudDisasterInstanceMonitorRequest.DisasterTypeEnum.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterInstanceMonitorRequest::getDisasterType,
                ShowCrossCloudDisasterInstanceMonitorRequest::setDisasterType));
        builder.<ShowCrossCloudDisasterInstanceMonitorRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCrossCloudDisasterInstanceMonitorRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterInstanceMonitorRequest::getXLanguage,
                ShowCrossCloudDisasterInstanceMonitorRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCrossCloudDisasterRelationsRequest, ShowCrossCloudDisasterRelationsResponse> showCrossCloudDisasterRelations =
        genForShowCrossCloudDisasterRelations();

    private static HttpRequestDef<ShowCrossCloudDisasterRelationsRequest, ShowCrossCloudDisasterRelationsResponse> genForShowCrossCloudDisasterRelations() {
        // basic
        HttpRequestDef.Builder<ShowCrossCloudDisasterRelationsRequest, ShowCrossCloudDisasterRelationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCrossCloudDisasterRelationsRequest.class,
                    ShowCrossCloudDisasterRelationsResponse.class)
                .withName("ShowCrossCloudDisasterRelations")
                .withUri("/v3.5/{project_id}/disaster-recovery/relations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterRelationsRequest::getLimit,
                ShowCrossCloudDisasterRelationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterRelationsRequest::getOffset,
                ShowCrossCloudDisasterRelationsRequest::setOffset));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterRelationsRequest::getInstanceName,
                ShowCrossCloudDisasterRelationsRequest::setInstanceName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterRelationsRequest::getInstanceId,
                ShowCrossCloudDisasterRelationsRequest::setInstanceId));
        builder.<ShowCrossCloudDisasterRelationsRequest.DrRoleEnum>withRequestField("dr_role",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCrossCloudDisasterRelationsRequest.DrRoleEnum.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterRelationsRequest::getDrRole,
                ShowCrossCloudDisasterRelationsRequest::setDrRole));
        builder.<ShowCrossCloudDisasterRelationsRequest.DrTypeEnum>withRequestField("dr_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCrossCloudDisasterRelationsRequest.DrTypeEnum.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterRelationsRequest::getDrType,
                ShowCrossCloudDisasterRelationsRequest::setDrType));
        builder.<ShowCrossCloudDisasterRelationsRequest.DrStatusEnum>withRequestField("dr_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCrossCloudDisasterRelationsRequest.DrStatusEnum.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterRelationsRequest::getDrStatus,
                ShowCrossCloudDisasterRelationsRequest::setDrStatus));
        builder.<ShowCrossCloudDisasterRelationsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCrossCloudDisasterRelationsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowCrossCloudDisasterRelationsRequest::getXLanguage,
                ShowCrossCloudDisasterRelationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentFormRequest, ShowDeploymentFormResponse> showDeploymentForm =
        genForShowDeploymentForm();

    private static HttpRequestDef<ShowDeploymentFormRequest, ShowDeploymentFormResponse> genForShowDeploymentForm() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentFormRequest, ShowDeploymentFormResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeploymentFormRequest.class, ShowDeploymentFormResponse.class)
                .withName("ShowDeploymentForm")
                .withUri("/v3/{project_id}/deployment-form")
                .withContentType("application/json");

        // requests
        builder.<ShowDeploymentFormRequest.SolutionEnum>withRequestField("solution",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDeploymentFormRequest.SolutionEnum.class),
            f -> f.withMarshaller(ShowDeploymentFormRequest::getSolution, ShowDeploymentFormRequest::setSolution));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentFormRequest::getInstanceId, ShowDeploymentFormRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentFormRequest::getXLanguage, ShowDeploymentFormRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse> showErrorLogSwitchStatus =
        genForShowErrorLogSwitchStatus();

    private static HttpRequestDef<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse> genForShowErrorLogSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowErrorLogSwitchStatusRequest.class, ShowErrorLogSwitchStatusResponse.class)
                .withName("ShowErrorLogSwitchStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/error-log/switch/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogSwitchStatusRequest::getInstanceId,
                ShowErrorLogSwitchStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogSwitchStatusRequest::getXLanguage,
                ShowErrorLogSwitchStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration =
        genForShowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForShowInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceConfigurationRequest.class,
                    ShowInstanceConfigurationResponse.class)
                .withName("ShowInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId,
                ShowInstanceConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getXLanguage,
                ShowInstanceConfigurationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceDiskRequest, ShowInstanceDiskResponse> showInstanceDisk =
        genForShowInstanceDisk();

    private static HttpRequestDef<ShowInstanceDiskRequest, ShowInstanceDiskResponse> genForShowInstanceDisk() {
        // basic
        HttpRequestDef.Builder<ShowInstanceDiskRequest, ShowInstanceDiskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceDiskRequest.class, ShowInstanceDiskResponse.class)
                .withName("ShowInstanceDisk")
                .withUri("/v3/{project_id}/instances/{instance_id}/volume-usage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDiskRequest::getInstanceId, ShowInstanceDiskRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDiskRequest::getXLanguage, ShowInstanceDiskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> showInstanceParamGroup =
        genForShowInstanceParamGroup();

    private static HttpRequestDef<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> genForShowInstanceParamGroup() {
        // basic
        HttpRequestDef.Builder<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceParamGroupRequest.class, ShowInstanceParamGroupResponse.class)
            .withName("ShowInstanceParamGroup")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/configurations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceParamGroupRequest::getInstanceId,
                ShowInstanceParamGroupRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceParamGroupRequest::getXLanguage,
                ShowInstanceParamGroupRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceParamGroupDetailRequest, ShowInstanceParamGroupDetailResponse> showInstanceParamGroupDetail =
        genForShowInstanceParamGroupDetail();

    private static HttpRequestDef<ShowInstanceParamGroupDetailRequest, ShowInstanceParamGroupDetailResponse> genForShowInstanceParamGroupDetail() {
        // basic
        HttpRequestDef.Builder<ShowInstanceParamGroupDetailRequest, ShowInstanceParamGroupDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceParamGroupDetailRequest.class,
                    ShowInstanceParamGroupDetailResponse.class)
                .withName("ShowInstanceParamGroupDetail")
                .withUri("/v3.2/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceParamGroupDetailRequest::getInstanceId,
                ShowInstanceParamGroupDetailRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceParamGroupDetailRequest::getXLanguage,
                ShowInstanceParamGroupDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> showInstanceSnapshot =
        genForShowInstanceSnapshot();

    private static HttpRequestDef<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> genForShowInstanceSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceSnapshotRequest.class, ShowInstanceSnapshotResponse.class)
            .withName("ShowInstanceSnapshot")
            .withUri("/v3/{project_id}/instance-snapshot")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSnapshotRequest::getInstanceId,
                ShowInstanceSnapshotRequest::setInstanceId));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSnapshotRequest::getRestoreTime,
                ShowInstanceSnapshotRequest::setRestoreTime));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSnapshotRequest::getBackupId, ShowInstanceSnapshotRequest::setBackupId));
        builder.<ShowInstanceSnapshotRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowInstanceSnapshotRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowInstanceSnapshotRequest::getXLanguage,
                ShowInstanceSnapshotRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForShowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForShowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getId, ShowJobDetailRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowParameterGroupDetailRequest, ShowParameterGroupDetailResponse> showParameterGroupDetail =
        genForShowParameterGroupDetail();

    private static HttpRequestDef<ShowParameterGroupDetailRequest, ShowParameterGroupDetailResponse> genForShowParameterGroupDetail() {
        // basic
        HttpRequestDef.Builder<ShowParameterGroupDetailRequest, ShowParameterGroupDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowParameterGroupDetailRequest.class, ShowParameterGroupDetailResponse.class)
                .withName("ShowParameterGroupDetail")
                .withUri("/v3.1/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowParameterGroupDetailRequest::getConfigId,
                ShowParameterGroupDetailRequest::setConfigId));
        builder.<ShowParameterGroupDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowParameterGroupDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowParameterGroupDetailRequest::getXLanguage,
                ShowParameterGroupDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectQuotasRequest, ShowProjectQuotasResponse> showProjectQuotas =
        genForShowProjectQuotas();

    private static HttpRequestDef<ShowProjectQuotasRequest, ShowProjectQuotasResponse> genForShowProjectQuotas() {
        // basic
        HttpRequestDef.Builder<ShowProjectQuotasRequest, ShowProjectQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectQuotasRequest.class, ShowProjectQuotasResponse.class)
                .withName("ShowProjectQuotas")
                .withUri("/v3/{project_id}/project-quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowProjectQuotasRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowProjectQuotasRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowProjectQuotasRequest::getType, ShowProjectQuotasRequest::setType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectQuotasRequest::getXLanguage, ShowProjectQuotasRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicy =
        genForShowRecyclePolicy();

    private static HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> genForShowRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecyclePolicyRequest.class, ShowRecyclePolicyResponse.class)
                .withName("ShowRecyclePolicy")
                .withUri("/v3/{project_id}/recycle-policy")
                .withContentType("application/json");

        // requests
        builder.<ShowRecyclePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRecyclePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowRecyclePolicyRequest::getXLanguage, ShowRecyclePolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse> showSlowLogDownload =
        genForShowSlowLogDownload();

    private static HttpRequestDef<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse> genForShowSlowLogDownload() {
        // basic
        HttpRequestDef.Builder<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSlowLogDownloadRequest.class, ShowSlowLogDownloadResponse.class)
                .withName("ShowSlowLogDownload")
                .withUri("/v3/{project_id}/instances/{instance_id}/slow-log/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowLogDownloadRequest::getInstanceId,
                ShowSlowLogDownloadRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowLogDownloadRequest::getXLanguage, ShowSlowLogDownloadRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSourceInstanceDetailRequest, ShowSourceInstanceDetailResponse> showSourceInstanceDetail =
        genForShowSourceInstanceDetail();

    private static HttpRequestDef<ShowSourceInstanceDetailRequest, ShowSourceInstanceDetailResponse> genForShowSourceInstanceDetail() {
        // basic
        HttpRequestDef.Builder<ShowSourceInstanceDetailRequest, ShowSourceInstanceDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowSourceInstanceDetailRequest.class, ShowSourceInstanceDetailResponse.class)
                .withName("ShowSourceInstanceDetail")
                .withUri("/v3.1/{project_id}/instance-snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSourceInstanceDetailRequest::getInstanceId,
                ShowSourceInstanceDetailRequest::setInstanceId));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSourceInstanceDetailRequest::getRestoreTime,
                ShowSourceInstanceDetailRequest::setRestoreTime));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSourceInstanceDetailRequest::getBackupId,
                ShowSourceInstanceDetailRequest::setBackupId));
        builder.<ShowSourceInstanceDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSourceInstanceDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSourceInstanceDetailRequest::getXLanguage,
                ShowSourceInstanceDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> showSslCertDownloadLink =
        genForShowSslCertDownloadLink();

    private static HttpRequestDef<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> genForShowSslCertDownloadLink() {
        // basic
        HttpRequestDef.Builder<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSslCertDownloadLinkRequest.class, ShowSslCertDownloadLinkResponse.class)
            .withName("ShowSslCertDownloadLink")
            .withUri("/v3/{project_id}/instances/{instance_id}/ssl-cert/download-link")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSslCertDownloadLinkRequest::getInstanceId,
                ShowSslCertDownloadLinkRequest::setInstanceId));
        builder.<ShowSslCertDownloadLinkRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSslCertDownloadLinkRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSslCertDownloadLinkRequest::getXLanguage,
                ShowSslCertDownloadLinkRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse> showUpgradeCandidateVersions =
        genForShowUpgradeCandidateVersions();

    private static HttpRequestDef<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse> genForShowUpgradeCandidateVersions() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowUpgradeCandidateVersionsRequest.class,
                    ShowUpgradeCandidateVersionsResponse.class)
                .withName("ShowUpgradeCandidateVersions")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade/candidate-versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeCandidateVersionsRequest::getInstanceId,
                ShowUpgradeCandidateVersionsRequest::setInstanceId));
        builder.<ShowUpgradeCandidateVersionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowUpgradeCandidateVersionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowUpgradeCandidateVersionsRequest::getXLanguage,
                ShowUpgradeCandidateVersionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeCandidateVersionsDetailsRequest, ShowUpgradeCandidateVersionsDetailsResponse> showUpgradeCandidateVersionsDetails =
        genForShowUpgradeCandidateVersionsDetails();

    private static HttpRequestDef<ShowUpgradeCandidateVersionsDetailsRequest, ShowUpgradeCandidateVersionsDetailsResponse> genForShowUpgradeCandidateVersionsDetails() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeCandidateVersionsDetailsRequest, ShowUpgradeCandidateVersionsDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowUpgradeCandidateVersionsDetailsRequest.class,
                    ShowUpgradeCandidateVersionsDetailsResponse.class)
                .withName("ShowUpgradeCandidateVersionsDetails")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/db-upgrade/candidate-versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeCandidateVersionsDetailsRequest::getInstanceId,
                ShowUpgradeCandidateVersionsDetailsRequest::setInstanceId));
        builder.<ShowUpgradeCandidateVersionsDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowUpgradeCandidateVersionsDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowUpgradeCandidateVersionsDetailsRequest::getXLanguage,
                ShowUpgradeCandidateVersionsDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRequest, StartInstanceResponse> startInstance =
        genForStartInstance();

    private static HttpRequestDef<StartInstanceRequest, StartInstanceResponse> genForStartInstance() {
        // basic
        HttpRequestDef.Builder<StartInstanceRequest, StartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartInstanceRequest.class, StartInstanceResponse.class)
                .withName("StartInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-startup")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInstanceRequest::getInstanceId, StartInstanceRequest::setInstanceId));
        builder.<StartInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartInstanceRequest::getXLanguage, StartInstanceRequest::setXLanguage));
        builder.<StartInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartInstanceRequestBody.class),
            f -> f.withMarshaller(StartInstanceRequest::getBody, StartInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse> startMysqlCompatibility =
        genForStartMysqlCompatibility();

    private static HttpRequestDef<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse> genForStartMysqlCompatibility() {
        // basic
        HttpRequestDef.Builder<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartMysqlCompatibilityRequest.class, StartMysqlCompatibilityResponse.class)
            .withName("StartMysqlCompatibility")
            .withUri("/v3/{project_id}/instances/{instance_id}/mysql-compatibility")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartMysqlCompatibilityRequest::getInstanceId,
                StartMysqlCompatibilityRequest::setInstanceId));
        builder.<StartMysqlCompatibilityRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartMysqlCompatibilityRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartMysqlCompatibilityRequest::getXLanguage,
                StartMysqlCompatibilityRequest::setXLanguage));
        builder.<StartMySQLCompatibilityRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartMySQLCompatibilityRequestBody.class),
            f -> f.withMarshaller(StartMysqlCompatibilityRequest::getBody, StartMysqlCompatibilityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBackupRequest, StopBackupResponse> stopBackup = genForStopBackup();

    private static HttpRequestDef<StopBackupRequest, StopBackupResponse> genForStopBackup() {
        // basic
        HttpRequestDef.Builder<StopBackupRequest, StopBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopBackupRequest.class, StopBackupResponse.class)
                .withName("StopBackup")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBackupRequest::getInstanceId, StopBackupRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBackupRequest::getXLanguage, StopBackupRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForStopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForStopInstance() {
        // basic
        HttpRequestDef.Builder<StopInstanceRequest, StopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopInstanceRequest.class, StopInstanceResponse.class)
                .withName("StopInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-stop")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInstanceRequest::getInstanceId, StopInstanceRequest::setInstanceId));
        builder.<StopInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StopInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StopInstanceRequest::getXLanguage, StopInstanceRequest::setXLanguage));
        builder.<StopInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopInstanceRequestBody.class),
            f -> f.withMarshaller(StopInstanceRequest::getBody, StopInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfiguration =
        genForSwitchConfiguration();

    private static HttpRequestDef<SwitchConfigurationRequest, SwitchConfigurationResponse> genForSwitchConfiguration() {
        // basic
        HttpRequestDef.Builder<SwitchConfigurationRequest, SwitchConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchConfigurationRequest.class, SwitchConfigurationResponse.class)
                .withName("SwitchConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchConfigurationRequest::getConfigId, SwitchConfigurationRequest::setConfigId));
        builder.<SwitchConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchConfigurationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SwitchConfigurationRequest::getXLanguage, SwitchConfigurationRequest::setXLanguage));
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(SwitchConfigurationRequest::getBody, SwitchConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchShardRequest, SwitchShardResponse> switchShard = genForSwitchShard();

    private static HttpRequestDef<SwitchShardRequest, SwitchShardResponse> genForSwitchShard() {
        // basic
        HttpRequestDef.Builder<SwitchShardRequest, SwitchShardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchShardRequest.class, SwitchShardResponse.class)
                .withName("SwitchShard")
                .withUri("/v3/{project_id}/instances/{instance_id}/switch-shard")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchShardRequest::getInstanceId, SwitchShardRequest::setInstanceId));
        builder.<SwitchShardRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchShardRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SwitchShardRequest::getXLanguage, SwitchShardRequest::setXLanguage));
        builder.<SwitchShardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchShardRequestBody.class),
            f -> f.withMarshaller(SwitchShardRequest::getBody, SwitchShardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFeaturesRequest, UpdateFeaturesResponse> updateFeatures =
        genForUpdateFeatures();

    private static HttpRequestDef<UpdateFeaturesRequest, UpdateFeaturesResponse> genForUpdateFeatures() {
        // basic
        HttpRequestDef.Builder<UpdateFeaturesRequest, UpdateFeaturesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFeaturesRequest.class, UpdateFeaturesResponse.class)
                .withName("UpdateFeatures")
                .withUri("/v3/{project_id}/instances/{instance_id}/advance-features")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFeaturesRequest::getInstanceId, UpdateFeaturesRequest::setInstanceId));
        builder.<UpdateFeaturesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateFeaturesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateFeaturesRequest::getXLanguage, UpdateFeaturesRequest::setXLanguage));
        builder.<UpdateFeaturesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFeaturesRequestBody.class),
            f -> f.withMarshaller(UpdateFeaturesRequest::getBody, UpdateFeaturesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration =
        genForUpdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForUpdateInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConfigurationRequest.class,
                    UpdateInstanceConfigurationResponse.class)
                .withName("UpdateInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId,
                UpdateInstanceConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getXLanguage,
                UpdateInstanceConfigurationRequest::setXLanguage));
        builder.<OpenGaussModifyInstanceConfigurationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussModifyInstanceConfigurationRequest.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody,
                UpdateInstanceConfigurationRequest::setBody));

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
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, UpdateInstanceNameRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getXLanguage, UpdateInstanceNameRequest::setXLanguage));
        builder.<UpdateNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNameRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, UpdateInstanceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse> updateMysqlCompatibility =
        genForUpdateMysqlCompatibility();

    private static HttpRequestDef<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse> genForUpdateMysqlCompatibility() {
        // basic
        HttpRequestDef.Builder<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateMysqlCompatibilityRequest.class, UpdateMysqlCompatibilityResponse.class)
                .withName("UpdateMysqlCompatibility")
                .withUri("/v3/{project_id}/instances/{instance_id}/mysql-compatibility")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMysqlCompatibilityRequest::getInstanceId,
                UpdateMysqlCompatibilityRequest::setInstanceId));
        builder.<UpdateMysqlCompatibilityRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateMysqlCompatibilityRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateMysqlCompatibilityRequest::getXLanguage,
                UpdateMysqlCompatibilityRequest::setXLanguage));
        builder.<UpdateMySQLCompatibilityRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMySQLCompatibilityRequestBody.class),
            f -> f.withMarshaller(UpdateMysqlCompatibilityRequest::getBody, UpdateMysqlCompatibilityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse> upgradeInstanceVersion =
        genForUpgradeInstanceVersion();

    private static HttpRequestDef<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse> genForUpgradeInstanceVersion() {
        // basic
        HttpRequestDef.Builder<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpgradeInstanceVersionRequest.class, UpgradeInstanceVersionResponse.class)
            .withName("UpgradeInstanceVersion")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/db-upgrade")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeInstanceVersionRequest::getInstanceId,
                UpgradeInstanceVersionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeInstanceVersionRequest::getXLanguage,
                UpgradeInstanceVersionRequest::setXLanguage));
        builder.<OpenGaussUpgradeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussUpgradeRequest.class),
            f -> f.withMarshaller(UpgradeInstanceVersionRequest::getBody, UpgradeInstanceVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse> upgradeInstancesVersion =
        genForUpgradeInstancesVersion();

    private static HttpRequestDef<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse> genForUpgradeInstancesVersion() {
        // basic
        HttpRequestDef.Builder<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpgradeInstancesVersionRequest.class, UpgradeInstancesVersionResponse.class)
            .withName("UpgradeInstancesVersion")
            .withUri("/v3/{project_id}/instances/db-upgrade")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeInstancesVersionRequest::getXLanguage,
                UpgradeInstancesVersionRequest::setXLanguage));
        builder.<GaussDBUpgradeInstancesVersionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBUpgradeInstancesVersionRequest.class),
            f -> f.withMarshaller(UpgradeInstancesVersionRequest::getBody, UpgradeInstancesVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> validateParaGroupName =
        genForValidateParaGroupName();

    private static HttpRequestDef<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> genForValidateParaGroupName() {
        // basic
        HttpRequestDef.Builder<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ValidateParaGroupNameRequest.class, ValidateParaGroupNameResponse.class)
            .withName("ValidateParaGroupName")
            .withUri("/v3/{project_id}/configurations/name-validation")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateParaGroupNameRequest::getName, ValidateParaGroupNameRequest::setName));
        builder.<ValidateParaGroupNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ValidateParaGroupNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ValidateParaGroupNameRequest::getXLanguage,
                ValidateParaGroupNameRequest::setXLanguage));

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
        builder.<ValidateWeakPasswordRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ValidateWeakPasswordRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ValidateWeakPasswordRequest::getXLanguage,
                ValidateWeakPasswordRequest::setXLanguage));
        builder.<WeakPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WeakPasswordRequestBody.class),
            f -> f.withMarshaller(ValidateWeakPasswordRequest::getBody, ValidateWeakPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLimitTaskRequest, CreateLimitTaskResponse> createLimitTask =
        genForCreateLimitTask();

    private static HttpRequestDef<CreateLimitTaskRequest, CreateLimitTaskResponse> genForCreateLimitTask() {
        // basic
        HttpRequestDef.Builder<CreateLimitTaskRequest, CreateLimitTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLimitTaskRequest.class, CreateLimitTaskResponse.class)
                .withName("CreateLimitTask")
                .withUri("/v3/{project_id}/instances/{instance_id}/limit-task")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLimitTaskRequest::getInstanceId, CreateLimitTaskRequest::setInstanceId));
        builder.<CreateLimitTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLimitTaskRequestBody.class),
            f -> f.withMarshaller(CreateLimitTaskRequest::getBody, CreateLimitTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLimitTaskRequest, DeleteLimitTaskResponse> deleteLimitTask =
        genForDeleteLimitTask();

    private static HttpRequestDef<DeleteLimitTaskRequest, DeleteLimitTaskResponse> genForDeleteLimitTask() {
        // basic
        HttpRequestDef.Builder<DeleteLimitTaskRequest, DeleteLimitTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLimitTaskRequest.class, DeleteLimitTaskResponse.class)
                .withName("DeleteLimitTask")
                .withUri("/v3/{project_id}/instances/{instance_id}/limit-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLimitTaskRequest::getTaskId, DeleteLimitTaskRequest::setTaskId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLimitTaskRequest::getInstanceId, DeleteLimitTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLimitTaskRequest, ListLimitTaskResponse> listLimitTask =
        genForListLimitTask();

    private static HttpRequestDef<ListLimitTaskRequest, ListLimitTaskResponse> genForListLimitTask() {
        // basic
        HttpRequestDef.Builder<ListLimitTaskRequest, ListLimitTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLimitTaskRequest.class, ListLimitTaskResponse.class)
                .withName("ListLimitTask")
                .withUri("/v3/{project_id}/instances/{instance_id}/limit-task-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getInstanceId, ListLimitTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getTaskScope, ListLimitTaskRequest::setTaskScope));
        builder.<String>withRequestField("limit_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getLimitType, ListLimitTaskRequest::setLimitType));
        builder.<String>withRequestField("limit_type_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getLimitTypeValue, ListLimitTaskRequest::setLimitTypeValue));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getTaskName, ListLimitTaskRequest::setTaskName));
        builder.<String>withRequestField("sql_model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getSqlModel, ListLimitTaskRequest::setSqlModel));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getRuleName, ListLimitTaskRequest::setRuleName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getStartTime, ListLimitTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getEndTime, ListLimitTaskRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getOffset, ListLimitTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLimitTaskRequest::getLimit, ListLimitTaskRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse> listNodeLimitSqlModel =
        genForListNodeLimitSqlModel();

    private static HttpRequestDef<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse> genForListNodeLimitSqlModel() {
        // basic
        HttpRequestDef.Builder<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNodeLimitSqlModelRequest.class, ListNodeLimitSqlModelResponse.class)
            .withName("ListNodeLimitSqlModel")
            .withUri("/v3/{project_id}/instances/{instance_id}/list-node-limit-sql-model")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodeLimitSqlModelRequest::getInstanceId,
                ListNodeLimitSqlModelRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodeLimitSqlModelRequest::getNodeId, ListNodeLimitSqlModelRequest::setNodeId));
        builder.<String>withRequestField("sql_model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodeLimitSqlModelRequest::getSqlModel,
                ListNodeLimitSqlModelRequest::setSqlModel));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodeLimitSqlModelRequest::getOffset, ListNodeLimitSqlModelRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodeLimitSqlModelRequest::getLimit, ListNodeLimitSqlModelRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLimitTaskRequest, ShowLimitTaskResponse> showLimitTask =
        genForShowLimitTask();

    private static HttpRequestDef<ShowLimitTaskRequest, ShowLimitTaskResponse> genForShowLimitTask() {
        // basic
        HttpRequestDef.Builder<ShowLimitTaskRequest, ShowLimitTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLimitTaskRequest.class, ShowLimitTaskResponse.class)
                .withName("ShowLimitTask")
                .withUri("/v3/{project_id}/instances/{instance_id}/limit-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLimitTaskRequest::getTaskId, ShowLimitTaskRequest::setTaskId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLimitTaskRequest::getInstanceId, ShowLimitTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncLimitDataRequest, SyncLimitDataResponse> syncLimitData =
        genForSyncLimitData();

    private static HttpRequestDef<SyncLimitDataRequest, SyncLimitDataResponse> genForSyncLimitData() {
        // basic
        HttpRequestDef.Builder<SyncLimitDataRequest, SyncLimitDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncLimitDataRequest.class, SyncLimitDataResponse.class)
                .withName("SyncLimitData")
                .withUri("/v3/{project_id}/instances/{instance_id}/sync-limit-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncLimitDataRequest::getInstanceId, SyncLimitDataRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLimitTaskRequest, UpdateLimitTaskResponse> updateLimitTask =
        genForUpdateLimitTask();

    private static HttpRequestDef<UpdateLimitTaskRequest, UpdateLimitTaskResponse> genForUpdateLimitTask() {
        // basic
        HttpRequestDef.Builder<UpdateLimitTaskRequest, UpdateLimitTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLimitTaskRequest.class, UpdateLimitTaskResponse.class)
                .withName("UpdateLimitTask")
                .withUri("/v3/{project_id}/instances/{instance_id}/limit-task/{task_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLimitTaskRequest::getTaskId, UpdateLimitTaskRequest::setTaskId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLimitTaskRequest::getInstanceId, UpdateLimitTaskRequest::setInstanceId));
        builder.<UpdateLimitTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLimitTaskRequestBody.class),
            f -> f.withMarshaller(UpdateLimitTaskRequest::getBody, UpdateLimitTaskRequest::setBody));

        // response

        return builder.build();
    }

}
