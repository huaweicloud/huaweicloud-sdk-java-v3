package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dws.v2.model.AddQueueUserListRequest;
import com.huaweicloud.sdk.dws.v2.model.AddQueueUserListResponse;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadPlanStageRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadPlanStageResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadRuleRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadRuleResponse;
import com.huaweicloud.sdk.dws.v2.model.AssociateEipRequest;
import com.huaweicloud.sdk.dws.v2.model.AssociateEipResponse;
import com.huaweicloud.sdk.dws.v2.model.AssociateElbRequest;
import com.huaweicloud.sdk.dws.v2.model.AssociateElbResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateResourceTagRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateResourceTagResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteResourceTagRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteResourceTagResponse;
import com.huaweicloud.sdk.dws.v2.model.CancelReadonlyClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CancelReadonlyClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.dws.v2.model.ChangeSecurityGroupResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckClusterShrinkRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckClusterShrinkResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckDisasterNameRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckDisasterNameResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckGrowClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckGrowClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckTableRestoreRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckTableRestoreResponse;
import com.huaweicloud.sdk.dws.v2.model.ConvertToLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ConvertToLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CopySnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.CopySnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateAlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateAlarmSubResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterDnsRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterDnsResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterV2Request;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterV2Response;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterWorkloadRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterWorkloadResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateDatabaseUserRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDatabaseUserResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteAlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteAlarmSubResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterDnsRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterDnsResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterNodesRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterNodesResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDatabaseUserRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDatabaseUserResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDwsClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDwsClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteLogicalClusterPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteLogicalClusterPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteQueueUserListRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteQueueUserListResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadPlanStageRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadPlanStageResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadRuleRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadRuleResponse;
import com.huaweicloud.sdk.dws.v2.model.DisableLogicalClusterPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.DisableLogicalClusterPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.DisableLtsLogsRequest;
import com.huaweicloud.sdk.dws.v2.model.DisableLtsLogsResponse;
import com.huaweicloud.sdk.dws.v2.model.DisassociateEipRequest;
import com.huaweicloud.sdk.dws.v2.model.DisassociateEipResponse;
import com.huaweicloud.sdk.dws.v2.model.DisassociateElbRequest;
import com.huaweicloud.sdk.dws.v2.model.DisassociateElbResponse;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.EnableLtsLogsRequest;
import com.huaweicloud.sdk.dws.v2.model.EnableLtsLogsResponse;
import com.huaweicloud.sdk.dws.v2.model.EncryptClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.EncryptClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteDatabaseOmUserActionRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteDatabaseOmUserActionResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteFlavorChangeRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteFlavorChangeResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteRedistributionClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteRedistributionClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorageRequest;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorageResponse;
import com.huaweicloud.sdk.dws.v2.model.ExportDatabaseUsersRequest;
import com.huaweicloud.sdk.dws.v2.model.ExportDatabaseUsersResponse;
import com.huaweicloud.sdk.dws.v2.model.ExportUserAuthorityRequest;
import com.huaweicloud.sdk.dws.v2.model.ExportUserAuthorityResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmConfigsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmConfigsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmDetailRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmDetailResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmStatisticRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmStatisticResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmSubsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmSubsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAuditLogRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAuditLogResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAvailableDisasterClustersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAvailableDisasterClustersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterActionsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterActionsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsParameterRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsParameterResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterDetailsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterDetailsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterEndpointsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterEndpointsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterNodesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterNodesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterScaleInNumbersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterScaleInNumbersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterSnapshotsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterSnapshotsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterTagsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterTagsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterWorkloadRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterWorkloadResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClustersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClustersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListConfigurationsAuditRecordsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListConfigurationsAuditRecordsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDatabaseObjectsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDatabaseObjectsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDatabaseUserAuthoritiesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDatabaseUserAuthoritiesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDatabaseUsersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDatabaseUsersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDisasterRecoverRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDisasterRecoverResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDssPoolsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDssPoolsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListElbsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListElbsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListEventSpecsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListEventSpecsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListEventSubsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListEventSubsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListEventsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListEventsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListHostDiskRequest;
import com.huaweicloud.sdk.dws.v2.model.ListHostDiskResponse;
import com.huaweicloud.sdk.dws.v2.model.ListHostNetRequest;
import com.huaweicloud.sdk.dws.v2.model.ListHostNetResponse;
import com.huaweicloud.sdk.dws.v2.model.ListHostOverviewRequest;
import com.huaweicloud.sdk.dws.v2.model.ListHostOverviewResponse;
import com.huaweicloud.sdk.dws.v2.model.ListJobDetailsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListJobDetailsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClusterPlansRequest;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClusterPlansResponse;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClusterRingsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClusterRingsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClusterTasksRequest;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClusterTasksResponse;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClusterVolumesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClusterVolumesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClustersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListLogicalClustersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListLtsLogsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListLtsLogsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListMetricsDataRequest;
import com.huaweicloud.sdk.dws.v2.model.ListMetricsDataResponse;
import com.huaweicloud.sdk.dws.v2.model.ListMetricsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListMetricsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorDataRequest;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorDataResponse;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListNodeTypesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListNodeTypesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListPlanExecLogsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListPlanExecLogsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListQueriesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListQueriesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.dws.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.dws.v2.model.ListRedistributionSchemaRequest;
import com.huaweicloud.sdk.dws.v2.model.ListRedistributionSchemaResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSchemasRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSchemasResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotDetailsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotDetailsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotFlavorInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotFlavorInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotStatisticsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotStatisticsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListStatisticsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListStatisticsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSyncRecordsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSyncRecordsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListTablesStatisticRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTablesStatisticResponse;
import com.huaweicloud.sdk.dws.v2.model.ListTagsForResourceRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTagsForResourceResponse;
import com.huaweicloud.sdk.dws.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListTargetFlavorsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTargetFlavorsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListTopoRingsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTopoRingsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListUpdatableVersionRequest;
import com.huaweicloud.sdk.dws.v2.model.ListUpdatableVersionResponse;
import com.huaweicloud.sdk.dws.v2.model.ListUpdateRecordRequest;
import com.huaweicloud.sdk.dws.v2.model.ListUpdateRecordResponse;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadPlansRequest;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadPlansResponse;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadQueueUsersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadQueueUsersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadRulesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadRulesResponse;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterNameRequest;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterNameResponse;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterTimezoneRequest;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterTimezoneResponse;
import com.huaweicloud.sdk.dws.v2.model.PauseDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.PauseDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterWithExistedNodesRequest;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterWithExistedNodesResponse;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestartLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestartLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreDisasterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreDisasterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreRedistributionRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreRedistributionResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreTableRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreTableResponse;
import com.huaweicloud.sdk.dws.v2.model.RotateKeyRequest;
import com.huaweicloud.sdk.dws.v2.model.RotateKeyResponse;
import com.huaweicloud.sdk.dws.v2.model.SaveClusterDescriptionInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.SaveClusterDescriptionInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.SetRedistributionPriorityRequest;
import com.huaweicloud.sdk.dws.v2.model.SetRedistributionPriorityResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterEncryptInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterEncryptInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterFlavorRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterFlavorResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterRedistributionRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterRedistributionResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterStorageExpandRangeRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterStorageExpandRangeResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterVolumeRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterVolumeResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClustersRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClustersResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseAuthorityRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseAuthorityResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseOmUserStatusRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseOmUserStatusResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseUserRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseUserResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterDetailRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterDetailResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterProgressRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterProgressResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowQueryDetailRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowQueryDetailResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowResourceStatisticsRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowResourceStatisticsResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowWorkloadPlanStageRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowWorkloadPlanStageResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.ShrinkClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ShrinkClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ShrinkLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ShrinkLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.StartClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.StartClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.StartDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.StartDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.StartWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.StartWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.StopClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.StopClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.StopRedistributionRequest;
import com.huaweicloud.sdk.dws.v2.model.StopRedistributionResponse;
import com.huaweicloud.sdk.dws.v2.model.StopWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.StopWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchFailoverDisasterRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchFailoverDisasterResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchOverClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchOverClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchPlanStageRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchPlanStageResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchoverDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchoverDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.SyncIamUsersRequest;
import com.huaweicloud.sdk.dws.v2.model.SyncIamUsersResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateAlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateAlarmSubResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateClusterDnsRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateClusterDnsResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDatabaseAuthorityRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateDatabaseAuthorityResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDatabaseUserInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateDatabaseUserInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDisasterInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateDisasterInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateMaintenanceWindowRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateMaintenanceWindowResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateQueueResourcesRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateQueueResourcesResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateRedistributionConfigurationsRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateRedistributionConfigurationsResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateSchemasRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateSchemasResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateWorkloadPlanStageRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateWorkloadPlanStageResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateWorkloadRuleRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateWorkloadRuleResponse;

public class DwsClient {

    protected HcClient hcClient;

    public DwsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwsClient> newBuilder() {
        ClientBuilder<DwsClient> clientBuilder = new ClientBuilder<>(DwsClient::new);
        return clientBuilder;
    }

    /**
     * 添加资源池的绑定用户
     *
     * 添加资源池的绑定用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddQueueUserListRequest 请求对象
     * @return AddQueueUserListResponse
     */
    public AddQueueUserListResponse addQueueUserList(AddQueueUserListRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.addQueueUserList);
    }

    /**
     * 添加资源池的绑定用户
     *
     * 添加资源池的绑定用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddQueueUserListRequest 请求对象
     * @return SyncInvoker<AddQueueUserListRequest, AddQueueUserListResponse>
     */
    public SyncInvoker<AddQueueUserListRequest, AddQueueUserListResponse> addQueueUserListInvoker(
        AddQueueUserListRequest request) {
        return new SyncInvoker<>(request, DwsMeta.addQueueUserList, hcClient);
    }

    /**
     * 设置跨区域备份配置
     *
     * 该接口用于设置跨区域备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSnapshotCrossRegionPolicyRequest 请求对象
     * @return AddSnapshotCrossRegionPolicyResponse
     */
    public AddSnapshotCrossRegionPolicyResponse addSnapshotCrossRegionPolicy(
        AddSnapshotCrossRegionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.addSnapshotCrossRegionPolicy);
    }

    /**
     * 设置跨区域备份配置
     *
     * 该接口用于设置跨区域备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSnapshotCrossRegionPolicyRequest 请求对象
     * @return SyncInvoker<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse>
     */
    public SyncInvoker<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse> addSnapshotCrossRegionPolicyInvoker(
        AddSnapshotCrossRegionPolicyRequest request) {
        return new SyncInvoker<>(request, DwsMeta.addSnapshotCrossRegionPolicy, hcClient);
    }

    /**
     * 添加资源管理计划阶段
     *
     * 添加资源管理计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadPlanStageRequest 请求对象
     * @return AddWorkloadPlanStageResponse
     */
    public AddWorkloadPlanStageResponse addWorkloadPlanStage(AddWorkloadPlanStageRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.addWorkloadPlanStage);
    }

    /**
     * 添加资源管理计划阶段
     *
     * 添加资源管理计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadPlanStageRequest 请求对象
     * @return SyncInvoker<AddWorkloadPlanStageRequest, AddWorkloadPlanStageResponse>
     */
    public SyncInvoker<AddWorkloadPlanStageRequest, AddWorkloadPlanStageResponse> addWorkloadPlanStageInvoker(
        AddWorkloadPlanStageRequest request) {
        return new SyncInvoker<>(request, DwsMeta.addWorkloadPlanStage, hcClient);
    }

    /**
     * 添加资源池
     *
     * 添加资源池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadQueueRequest 请求对象
     * @return AddWorkloadQueueResponse
     */
    public AddWorkloadQueueResponse addWorkloadQueue(AddWorkloadQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.addWorkloadQueue);
    }

    /**
     * 添加资源池
     *
     * 添加资源池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadQueueRequest 请求对象
     * @return SyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse>
     */
    public SyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse> addWorkloadQueueInvoker(
        AddWorkloadQueueRequest request) {
        return new SyncInvoker<>(request, DwsMeta.addWorkloadQueue, hcClient);
    }

    /**
     * 添加异常规则
     *
     * 添加异常规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadRuleRequest 请求对象
     * @return AddWorkloadRuleResponse
     */
    public AddWorkloadRuleResponse addWorkloadRule(AddWorkloadRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.addWorkloadRule);
    }

    /**
     * 添加异常规则
     *
     * 添加异常规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadRuleRequest 请求对象
     * @return SyncInvoker<AddWorkloadRuleRequest, AddWorkloadRuleResponse>
     */
    public SyncInvoker<AddWorkloadRuleRequest, AddWorkloadRuleResponse> addWorkloadRuleInvoker(
        AddWorkloadRuleRequest request) {
        return new SyncInvoker<>(request, DwsMeta.addWorkloadRule, hcClient);
    }

    /**
     * 集群绑定EIP
     *
     * 集群绑定Eip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateEipRequest 请求对象
     * @return AssociateEipResponse
     */
    public AssociateEipResponse associateEip(AssociateEipRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.associateEip);
    }

    /**
     * 集群绑定EIP
     *
     * 集群绑定Eip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateEipRequest 请求对象
     * @return SyncInvoker<AssociateEipRequest, AssociateEipResponse>
     */
    public SyncInvoker<AssociateEipRequest, AssociateEipResponse> associateEipInvoker(AssociateEipRequest request) {
        return new SyncInvoker<>(request, DwsMeta.associateEip, hcClient);
    }

    /**
     * 集群绑定ELB
     *
     * 集群绑定Elb接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateElbRequest 请求对象
     * @return AssociateElbResponse
     */
    public AssociateElbResponse associateElb(AssociateElbRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.associateElb);
    }

    /**
     * 集群绑定ELB
     *
     * 集群绑定Elb接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateElbRequest 请求对象
     * @return SyncInvoker<AssociateElbRequest, AssociateElbResponse>
     */
    public SyncInvoker<AssociateElbRequest, AssociateElbResponse> associateElbInvoker(AssociateElbRequest request) {
        return new SyncInvoker<>(request, DwsMeta.associateElb, hcClient);
    }

    /**
     * 批量增加CN节点
     *
     * 当用户集群创建后，实际需要的CN数量会随着业务需求而发生变化，因此管理CN节点功能的实现使用户可以根据实际需求动态调整集群CN数量。
     * - 增删CN节点过程中不允许执行其他运维操作。
     * - 增删CN节点过程中需要停止业务操作，建议在业务低峰期或业务中断情况下进行操作。
     * - 增删CN节点时发生故障且回滚失败，需要用户登录后台进行处理，处理方案请参见《故障排除》中的“集群使用&gt;增删CN回滚失败”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateClusterCnRequest 请求对象
     * @return BatchCreateClusterCnResponse
     */
    public BatchCreateClusterCnResponse batchCreateClusterCn(BatchCreateClusterCnRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.batchCreateClusterCn);
    }

    /**
     * 批量增加CN节点
     *
     * 当用户集群创建后，实际需要的CN数量会随着业务需求而发生变化，因此管理CN节点功能的实现使用户可以根据实际需求动态调整集群CN数量。
     * - 增删CN节点过程中不允许执行其他运维操作。
     * - 增删CN节点过程中需要停止业务操作，建议在业务低峰期或业务中断情况下进行操作。
     * - 增删CN节点时发生故障且回滚失败，需要用户登录后台进行处理，处理方案请参见《故障排除》中的“集群使用&gt;增删CN回滚失败”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateClusterCnRequest 请求对象
     * @return SyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse>
     */
    public SyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> batchCreateClusterCnInvoker(
        BatchCreateClusterCnRequest request) {
        return new SyncInvoker<>(request, DwsMeta.batchCreateClusterCn, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 为指定集群批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagRequest 请求对象
     * @return BatchCreateResourceTagResponse
     */
    public BatchCreateResourceTagResponse batchCreateResourceTag(BatchCreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.batchCreateResourceTag);
    }

    /**
     * 批量添加标签
     *
     * 为指定集群批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagRequest 请求对象
     * @return SyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse>
     */
    public SyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> batchCreateResourceTagInvoker(
        BatchCreateResourceTagRequest request) {
        return new SyncInvoker<>(request, DwsMeta.batchCreateResourceTag, hcClient);
    }

    /**
     * 批量删除CN节点
     *
     * 当用户集群创建后，实际需要的CN数量会随着业务需求而发生变化，因此管理CN节点功能的实现使用户可以根据实际需求动态调整集群CN数量。
     * - 增删CN节点过程中不允许执行其他运维操作。
     * - 增删CN节点过程中需要停止业务操作，建议在业务低峰期或业务中断情况下进行操作。
     * - 增删CN节点时发生故障且回滚失败，需要用户登录后台进行处理，处理方案请参见《故障排除》中的“集群使用&gt;增删CN回滚失败”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteClusterCnRequest 请求对象
     * @return BatchDeleteClusterCnResponse
     */
    public BatchDeleteClusterCnResponse batchDeleteClusterCn(BatchDeleteClusterCnRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.batchDeleteClusterCn);
    }

    /**
     * 批量删除CN节点
     *
     * 当用户集群创建后，实际需要的CN数量会随着业务需求而发生变化，因此管理CN节点功能的实现使用户可以根据实际需求动态调整集群CN数量。
     * - 增删CN节点过程中不允许执行其他运维操作。
     * - 增删CN节点过程中需要停止业务操作，建议在业务低峰期或业务中断情况下进行操作。
     * - 增删CN节点时发生故障且回滚失败，需要用户登录后台进行处理，处理方案请参见《故障排除》中的“集群使用&gt;增删CN回滚失败”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteClusterCnRequest 请求对象
     * @return SyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse>
     */
    public SyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> batchDeleteClusterCnInvoker(
        BatchDeleteClusterCnRequest request) {
        return new SyncInvoker<>(request, DwsMeta.batchDeleteClusterCn, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 为指定集群批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return BatchDeleteResourceTagResponse
     */
    public BatchDeleteResourceTagResponse batchDeleteResourceTag(BatchDeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.batchDeleteResourceTag);
    }

    /**
     * 批量删除标签
     *
     * 为指定集群批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagInvoker(
        BatchDeleteResourceTagRequest request) {
        return new SyncInvoker<>(request, DwsMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 解除只读
     *
     * 当集群进入只读状态时，无法进行数据库相关操作，用户可以在管理控制台解除集群的只读状态。触发只读状态可能是由于磁盘使用率过高，因此需要对集群数据进行清理或扩容。 
     *  **约束限制**：
     *  解除只读支持1.7.2及以上版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelReadonlyClusterRequest 请求对象
     * @return CancelReadonlyClusterResponse
     */
    public CancelReadonlyClusterResponse cancelReadonlyCluster(CancelReadonlyClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.cancelReadonlyCluster);
    }

    /**
     * 解除只读
     *
     * 当集群进入只读状态时，无法进行数据库相关操作，用户可以在管理控制台解除集群的只读状态。触发只读状态可能是由于磁盘使用率过高，因此需要对集群数据进行清理或扩容。 
     *  **约束限制**：
     *  解除只读支持1.7.2及以上版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelReadonlyClusterRequest 请求对象
     * @return SyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse>
     */
    public SyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> cancelReadonlyClusterInvoker(
        CancelReadonlyClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.cancelReadonlyCluster, hcClient);
    }

    /**
     * 修改集群安全组
     *
     * 该接口用于修改集群安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return ChangeSecurityGroupResponse
     */
    public ChangeSecurityGroupResponse changeSecurityGroup(ChangeSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.changeSecurityGroup);
    }

    /**
     * 修改集群安全组
     *
     * 该接口用于修改集群安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupInvoker(
        ChangeSecurityGroupRequest request) {
        return new SyncInvoker<>(request, DwsMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 创建集群前检查
     *
     * 创建集群前预检查，提前识别子网不足、配额不足等问题，避免发起创建集群请求后创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClusterRequest 请求对象
     * @return CheckClusterResponse
     */
    public CheckClusterResponse checkCluster(CheckClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.checkCluster);
    }

    /**
     * 创建集群前检查
     *
     * 创建集群前预检查，提前识别子网不足、配额不足等问题，避免发起创建集群请求后创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClusterRequest 请求对象
     * @return SyncInvoker<CheckClusterRequest, CheckClusterResponse>
     */
    public SyncInvoker<CheckClusterRequest, CheckClusterResponse> checkClusterInvoker(CheckClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.checkCluster, hcClient);
    }

    /**
     * 集群缩容前检查
     *
     * 缩容前检查，确保缩容前、缩容后均满足正常操作要求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClusterShrinkRequest 请求对象
     * @return CheckClusterShrinkResponse
     */
    public CheckClusterShrinkResponse checkClusterShrink(CheckClusterShrinkRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.checkClusterShrink);
    }

    /**
     * 集群缩容前检查
     *
     * 缩容前检查，确保缩容前、缩容后均满足正常操作要求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClusterShrinkRequest 请求对象
     * @return SyncInvoker<CheckClusterShrinkRequest, CheckClusterShrinkResponse>
     */
    public SyncInvoker<CheckClusterShrinkRequest, CheckClusterShrinkResponse> checkClusterShrinkInvoker(
        CheckClusterShrinkRequest request) {
        return new SyncInvoker<>(request, DwsMeta.checkClusterShrink, hcClient);
    }

    /**
     * 检查容灾名称
     *
     * 该接口用于查询容灾名称是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDisasterNameRequest 请求对象
     * @return CheckDisasterNameResponse
     */
    public CheckDisasterNameResponse checkDisasterName(CheckDisasterNameRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.checkDisasterName);
    }

    /**
     * 检查容灾名称
     *
     * 该接口用于查询容灾名称是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDisasterNameRequest 请求对象
     * @return SyncInvoker<CheckDisasterNameRequest, CheckDisasterNameResponse>
     */
    public SyncInvoker<CheckDisasterNameRequest, CheckDisasterNameResponse> checkDisasterNameInvoker(
        CheckDisasterNameRequest request) {
        return new SyncInvoker<>(request, DwsMeta.checkDisasterName, hcClient);
    }

    /**
     * 集群扩容前检查
     *
     * 集群扩容前检查，提前识别子网不足、权限不足等问题导致的扩容失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckGrowClusterRequest 请求对象
     * @return CheckGrowClusterResponse
     */
    public CheckGrowClusterResponse checkGrowCluster(CheckGrowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.checkGrowCluster);
    }

    /**
     * 集群扩容前检查
     *
     * 集群扩容前检查，提前识别子网不足、权限不足等问题导致的扩容失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckGrowClusterRequest 请求对象
     * @return SyncInvoker<CheckGrowClusterRequest, CheckGrowClusterResponse>
     */
    public SyncInvoker<CheckGrowClusterRequest, CheckGrowClusterResponse> checkGrowClusterInvoker(
        CheckGrowClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.checkGrowCluster, hcClient);
    }

    /**
     * 用户恢复表名检测
     *
     * 该接口用于用户恢复表名检测。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTableRestoreRequest 请求对象
     * @return CheckTableRestoreResponse
     */
    public CheckTableRestoreResponse checkTableRestore(CheckTableRestoreRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.checkTableRestore);
    }

    /**
     * 用户恢复表名检测
     *
     * 该接口用于用户恢复表名检测。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTableRestoreRequest 请求对象
     * @return SyncInvoker<CheckTableRestoreRequest, CheckTableRestoreResponse>
     */
    public SyncInvoker<CheckTableRestoreRequest, CheckTableRestoreResponse> checkTableRestoreInvoker(
        CheckTableRestoreRequest request) {
        return new SyncInvoker<>(request, DwsMeta.checkTableRestore, hcClient);
    }

    /**
     * 物理集群转换到逻辑集群
     *
     * 物理集群转换到逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConvertToLogicalClusterRequest 请求对象
     * @return ConvertToLogicalClusterResponse
     */
    public ConvertToLogicalClusterResponse convertToLogicalCluster(ConvertToLogicalClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.convertToLogicalCluster);
    }

    /**
     * 物理集群转换到逻辑集群
     *
     * 物理集群转换到逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConvertToLogicalClusterRequest 请求对象
     * @return SyncInvoker<ConvertToLogicalClusterRequest, ConvertToLogicalClusterResponse>
     */
    public SyncInvoker<ConvertToLogicalClusterRequest, ConvertToLogicalClusterResponse> convertToLogicalClusterInvoker(
        ConvertToLogicalClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.convertToLogicalCluster, hcClient);
    }

    /**
     * 复制快照
     *
     * 该接口用于复制一个自动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopySnapshotRequest 请求对象
     * @return CopySnapshotResponse
     */
    public CopySnapshotResponse copySnapshot(CopySnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.copySnapshot);
    }

    /**
     * 复制快照
     *
     * 该接口用于复制一个自动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopySnapshotRequest 请求对象
     * @return SyncInvoker<CopySnapshotRequest, CopySnapshotResponse>
     */
    public SyncInvoker<CopySnapshotRequest, CopySnapshotResponse> copySnapshotInvoker(CopySnapshotRequest request) {
        return new SyncInvoker<>(request, DwsMeta.copySnapshot, hcClient);
    }

    /**
     * 创建告警订阅
     *
     * 创建告警订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmSubRequest 请求对象
     * @return CreateAlarmSubResponse
     */
    public CreateAlarmSubResponse createAlarmSub(CreateAlarmSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createAlarmSub);
    }

    /**
     * 创建告警订阅
     *
     * 创建告警订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmSubRequest 请求对象
     * @return SyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse>
     */
    public SyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse> createAlarmSubInvoker(
        CreateAlarmSubRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createAlarmSub, hcClient);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 集群必须要运行在VPC之内，创建集群前，您需要先创建VPC，并获取VPC和子网的id。
     * 该接口为异步接口，创建集群需要10～15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 集群必须要运行在VPC之内，创建集群前，您需要先创建VPC，并获取VPC和子网的id。
     * 该接口为异步接口，创建集群需要10～15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createCluster, hcClient);
    }

    /**
     * 申请域名
     *
     * 为指定集群申请域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterDnsRequest 请求对象
     * @return CreateClusterDnsResponse
     */
    public CreateClusterDnsResponse createClusterDns(CreateClusterDnsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createClusterDns);
    }

    /**
     * 申请域名
     *
     * 为指定集群申请域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterDnsRequest 请求对象
     * @return SyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse>
     */
    public SyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse> createClusterDnsInvoker(
        CreateClusterDnsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createClusterDns, hcClient);
    }

    /**
     * 创建集群V2
     *
     * 该接口用于创建集群。
     * 集群必须要运行在VPC之内，创建集群前，您需要先创建VPC，并获取VPC和子网的id。
     * 该接口为异步接口，创建集群需要10～15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterV2Request 请求对象
     * @return CreateClusterV2Response
     */
    public CreateClusterV2Response createClusterV2(CreateClusterV2Request request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createClusterV2);
    }

    /**
     * 创建集群V2
     *
     * 该接口用于创建集群。
     * 集群必须要运行在VPC之内，创建集群前，您需要先创建VPC，并获取VPC和子网的id。
     * 该接口为异步接口，创建集群需要10～15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterV2Request 请求对象
     * @return SyncInvoker<CreateClusterV2Request, CreateClusterV2Response>
     */
    public SyncInvoker<CreateClusterV2Request, CreateClusterV2Response> createClusterV2Invoker(
        CreateClusterV2Request request) {
        return new SyncInvoker<>(request, DwsMeta.createClusterV2, hcClient);
    }

    /**
     * 打开或关闭资源管理功能
     *
     * 打开或关闭资源管理功能，新集群默认是打开状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterWorkloadRequest 请求对象
     * @return CreateClusterWorkloadResponse
     */
    public CreateClusterWorkloadResponse createClusterWorkload(CreateClusterWorkloadRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createClusterWorkload);
    }

    /**
     * 打开或关闭资源管理功能
     *
     * 打开或关闭资源管理功能，新集群默认是打开状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterWorkloadRequest 请求对象
     * @return SyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse>
     */
    public SyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> createClusterWorkloadInvoker(
        CreateClusterWorkloadRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createClusterWorkload, hcClient);
    }

    /**
     * 创建数据源
     *
     * 该接口用于创建一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataSourceRequest 请求对象
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createDataSource);
    }

    /**
     * 创建数据源
     *
     * 该接口用于创建一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataSourceRequest 请求对象
     * @return SyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse>
     */
    public SyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse> createDataSourceInvoker(
        CreateDataSourceRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createDataSource, hcClient);
    }

    /**
     * 创建数据库用户/角色
     *
     * 创建数据库用户/角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseUserRequest 请求对象
     * @return CreateDatabaseUserResponse
     */
    public CreateDatabaseUserResponse createDatabaseUser(CreateDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createDatabaseUser);
    }

    /**
     * 创建数据库用户/角色
     *
     * 创建数据库用户/角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseUserRequest 请求对象
     * @return SyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>
     */
    public SyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUserInvoker(
        CreateDatabaseUserRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createDatabaseUser, hcClient);
    }

    /**
     * 创建容灾
     *
     * 该接口用于创建集群间容灾。
     * 集群处于可用状态或者非均衡状态才可进行创建容灾操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDisasterRecoveryRequest 请求对象
     * @return CreateDisasterRecoveryResponse
     */
    public CreateDisasterRecoveryResponse createDisasterRecovery(CreateDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createDisasterRecovery);
    }

    /**
     * 创建容灾
     *
     * 该接口用于创建集群间容灾。
     * 集群处于可用状态或者非均衡状态才可进行创建容灾操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>
     */
    public SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecoveryInvoker(
        CreateDisasterRecoveryRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createDisasterRecovery, hcClient);
    }

    /**
     * 创建订阅事件
     *
     * 添加订阅的事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSubRequest 请求对象
     * @return CreateEventSubResponse
     */
    public CreateEventSubResponse createEventSub(CreateEventSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createEventSub);
    }

    /**
     * 创建订阅事件
     *
     * 添加订阅的事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSubRequest 请求对象
     * @return SyncInvoker<CreateEventSubRequest, CreateEventSubResponse>
     */
    public SyncInvoker<CreateEventSubRequest, CreateEventSubResponse> createEventSubInvoker(
        CreateEventSubRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createEventSub, hcClient);
    }

    /**
     * 创建逻辑集群
     *
     * 创建逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogicalClusterRequest 请求对象
     * @return CreateLogicalClusterResponse
     */
    public CreateLogicalClusterResponse createLogicalCluster(CreateLogicalClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createLogicalCluster);
    }

    /**
     * 创建逻辑集群
     *
     * 创建逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogicalClusterRequest 请求对象
     * @return SyncInvoker<CreateLogicalClusterRequest, CreateLogicalClusterResponse>
     */
    public SyncInvoker<CreateLogicalClusterRequest, CreateLogicalClusterResponse> createLogicalClusterInvoker(
        CreateLogicalClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createLogicalCluster, hcClient);
    }

    /**
     * 添加逻辑集群定时增删计划
     *
     * 添加逻辑集群定时增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogicalClusterPlanRequest 请求对象
     * @return CreateLogicalClusterPlanResponse
     */
    public CreateLogicalClusterPlanResponse createLogicalClusterPlan(CreateLogicalClusterPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createLogicalClusterPlan);
    }

    /**
     * 添加逻辑集群定时增删计划
     *
     * 添加逻辑集群定时增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogicalClusterPlanRequest 请求对象
     * @return SyncInvoker<CreateLogicalClusterPlanRequest, CreateLogicalClusterPlanResponse>
     */
    public SyncInvoker<CreateLogicalClusterPlanRequest, CreateLogicalClusterPlanResponse> createLogicalClusterPlanInvoker(
        CreateLogicalClusterPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createLogicalClusterPlan, hcClient);
    }

    /**
     * 创建快照
     *
     * 该接口用于为指定集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createSnapshot);
    }

    /**
     * 创建快照
     *
     * 该接口用于为指定集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotInvoker(
        CreateSnapshotRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createSnapshot, hcClient);
    }

    /**
     * 添加快照策略
     *
     * 该接口用于设置快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotPolicyRequest 请求对象
     * @return CreateSnapshotPolicyResponse
     */
    public CreateSnapshotPolicyResponse createSnapshotPolicy(CreateSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createSnapshotPolicy);
    }

    /**
     * 添加快照策略
     *
     * 该接口用于设置快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse>
     */
    public SyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> createSnapshotPolicyInvoker(
        CreateSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createSnapshotPolicy, hcClient);
    }

    /**
     * 添加资源管理计划
     *
     * 添加资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadPlanRequest 请求对象
     * @return CreateWorkloadPlanResponse
     */
    public CreateWorkloadPlanResponse createWorkloadPlan(CreateWorkloadPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createWorkloadPlan);
    }

    /**
     * 添加资源管理计划
     *
     * 添加资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadPlanRequest 请求对象
     * @return SyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse>
     */
    public SyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> createWorkloadPlanInvoker(
        CreateWorkloadPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.createWorkloadPlan, hcClient);
    }

    /**
     * 删除告警订阅
     *
     * 删除订阅的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmSubRequest 请求对象
     * @return DeleteAlarmSubResponse
     */
    public DeleteAlarmSubResponse deleteAlarmSub(DeleteAlarmSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteAlarmSub);
    }

    /**
     * 删除告警订阅
     *
     * 删除订阅的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmSubRequest 请求对象
     * @return SyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse>
     */
    public SyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse> deleteAlarmSubInvoker(
        DeleteAlarmSubRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteAlarmSub, hcClient);
    }

    /**
     * 删除集群
     *
     * 删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteCluster, hcClient);
    }

    /**
     * 删除集群域名
     *
     * 删除指定集群域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterDnsRequest 请求对象
     * @return DeleteClusterDnsResponse
     */
    public DeleteClusterDnsResponse deleteClusterDns(DeleteClusterDnsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteClusterDns);
    }

    /**
     * 删除集群域名
     *
     * 删除指定集群域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterDnsRequest 请求对象
     * @return SyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse>
     */
    public SyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse> deleteClusterDnsInvoker(
        DeleteClusterDnsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteClusterDns, hcClient);
    }

    /**
     * 删除空闲节点
     *
     * 删除空闲节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterNodesRequest 请求对象
     * @return DeleteClusterNodesResponse
     */
    public DeleteClusterNodesResponse deleteClusterNodes(DeleteClusterNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteClusterNodes);
    }

    /**
     * 删除空闲节点
     *
     * 删除空闲节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterNodesRequest 请求对象
     * @return SyncInvoker<DeleteClusterNodesRequest, DeleteClusterNodesResponse>
     */
    public SyncInvoker<DeleteClusterNodesRequest, DeleteClusterNodesResponse> deleteClusterNodesInvoker(
        DeleteClusterNodesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteClusterNodes, hcClient);
    }

    /**
     * 删除数据源
     *
     * 该接口用于删除一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataSourceRequest 请求对象
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteDataSource);
    }

    /**
     * 删除数据源
     *
     * 该接口用于删除一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataSourceRequest 请求对象
     * @return SyncInvoker<DeleteDataSourceRequest, DeleteDataSourceResponse>
     */
    public SyncInvoker<DeleteDataSourceRequest, DeleteDataSourceResponse> deleteDataSourceInvoker(
        DeleteDataSourceRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteDataSource, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseUserRequest 请求对象
     * @return DeleteDatabaseUserResponse
     */
    public DeleteDatabaseUserResponse deleteDatabaseUser(DeleteDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteDatabaseUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseUserRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse>
     */
    public SyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> deleteDatabaseUserInvoker(
        DeleteDatabaseUserRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteDatabaseUser, hcClient);
    }

    /**
     * 删除容灾
     *
     * 该接口用于删除容灾操作。
     * 容灾状态为“创建失败”、“未启动”、“启动失败”、“已停止”、“停止失败”和“异常”时可以执行删除容灾操作。
     * 删除后，将无法进行数据同步，且不可恢复，请谨慎操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDisasterRecoveryRequest 请求对象
     * @return DeleteDisasterRecoveryResponse
     */
    public DeleteDisasterRecoveryResponse deleteDisasterRecovery(DeleteDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteDisasterRecovery);
    }

    /**
     * 删除容灾
     *
     * 该接口用于删除容灾操作。
     * 容灾状态为“创建失败”、“未启动”、“启动失败”、“已停止”、“停止失败”和“异常”时可以执行删除容灾操作。
     * 删除后，将无法进行数据同步，且不可恢复，请谨慎操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>
     */
    public SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecoveryInvoker(
        DeleteDisasterRecoveryRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteDisasterRecovery, hcClient);
    }

    /**
     * 删除集群V2
     *
     * 删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDwsClusterRequest 请求对象
     * @return DeleteDwsClusterResponse
     */
    public DeleteDwsClusterResponse deleteDwsCluster(DeleteDwsClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteDwsCluster);
    }

    /**
     * 删除集群V2
     *
     * 删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDwsClusterRequest 请求对象
     * @return SyncInvoker<DeleteDwsClusterRequest, DeleteDwsClusterResponse>
     */
    public SyncInvoker<DeleteDwsClusterRequest, DeleteDwsClusterResponse> deleteDwsClusterInvoker(
        DeleteDwsClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteDwsCluster, hcClient);
    }

    /**
     * 删除订阅事件
     *
     * 删除订阅的事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSubRequest 请求对象
     * @return DeleteEventSubResponse
     */
    public DeleteEventSubResponse deleteEventSub(DeleteEventSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteEventSub);
    }

    /**
     * 删除订阅事件
     *
     * 删除订阅的事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSubRequest 请求对象
     * @return SyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse>
     */
    public SyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse> deleteEventSubInvoker(
        DeleteEventSubRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteEventSub, hcClient);
    }

    /**
     * 删除逻辑集群
     *
     * 删除逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalClusterRequest 请求对象
     * @return DeleteLogicalClusterResponse
     */
    public DeleteLogicalClusterResponse deleteLogicalCluster(DeleteLogicalClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteLogicalCluster);
    }

    /**
     * 删除逻辑集群
     *
     * 删除逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalClusterRequest 请求对象
     * @return SyncInvoker<DeleteLogicalClusterRequest, DeleteLogicalClusterResponse>
     */
    public SyncInvoker<DeleteLogicalClusterRequest, DeleteLogicalClusterResponse> deleteLogicalClusterInvoker(
        DeleteLogicalClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteLogicalCluster, hcClient);
    }

    /**
     * 删除逻辑集群定时增删计划
     *
     * 删除逻辑集群定时增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalClusterPlanRequest 请求对象
     * @return DeleteLogicalClusterPlanResponse
     */
    public DeleteLogicalClusterPlanResponse deleteLogicalClusterPlan(DeleteLogicalClusterPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteLogicalClusterPlan);
    }

    /**
     * 删除逻辑集群定时增删计划
     *
     * 删除逻辑集群定时增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalClusterPlanRequest 请求对象
     * @return SyncInvoker<DeleteLogicalClusterPlanRequest, DeleteLogicalClusterPlanResponse>
     */
    public SyncInvoker<DeleteLogicalClusterPlanRequest, DeleteLogicalClusterPlanResponse> deleteLogicalClusterPlanInvoker(
        DeleteLogicalClusterPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteLogicalClusterPlan, hcClient);
    }

    /**
     * 删除资源池的绑定用户
     *
     * 删除资源池的绑定用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueUserListRequest 请求对象
     * @return DeleteQueueUserListResponse
     */
    public DeleteQueueUserListResponse deleteQueueUserList(DeleteQueueUserListRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteQueueUserList);
    }

    /**
     * 删除资源池的绑定用户
     *
     * 删除资源池的绑定用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueUserListRequest 请求对象
     * @return SyncInvoker<DeleteQueueUserListRequest, DeleteQueueUserListResponse>
     */
    public SyncInvoker<DeleteQueueUserListRequest, DeleteQueueUserListResponse> deleteQueueUserListInvoker(
        DeleteQueueUserListRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteQueueUserList, hcClient);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除一个指定手动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteSnapshot);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除一个指定手动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotInvoker(
        DeleteSnapshotRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteSnapshot, hcClient);
    }

    /**
     * 删除跨区域备份配置
     *
     * 该接口用于删除跨区域备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotCrossRegionPolicyRequest 请求对象
     * @return DeleteSnapshotCrossRegionPolicyResponse
     */
    public DeleteSnapshotCrossRegionPolicyResponse deleteSnapshotCrossRegionPolicy(
        DeleteSnapshotCrossRegionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteSnapshotCrossRegionPolicy);
    }

    /**
     * 删除跨区域备份配置
     *
     * 该接口用于删除跨区域备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotCrossRegionPolicyRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse>
     */
    public SyncInvoker<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse> deleteSnapshotCrossRegionPolicyInvoker(
        DeleteSnapshotCrossRegionPolicyRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteSnapshotCrossRegionPolicy, hcClient);
    }

    /**
     * 删除快照策略
     *
     * 该接口用于删除一个快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotPolicyRequest 请求对象
     * @return DeleteSnapshotPolicyResponse
     */
    public DeleteSnapshotPolicyResponse deleteSnapshotPolicy(DeleteSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteSnapshotPolicy);
    }

    /**
     * 删除快照策略
     *
     * 该接口用于删除一个快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse>
     */
    public SyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> deleteSnapshotPolicyInvoker(
        DeleteSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteSnapshotPolicy, hcClient);
    }

    /**
     * 删除资源管理计划
     *
     * 删除资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadPlanRequest 请求对象
     * @return DeleteWorkloadPlanResponse
     */
    public DeleteWorkloadPlanResponse deleteWorkloadPlan(DeleteWorkloadPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteWorkloadPlan);
    }

    /**
     * 删除资源管理计划
     *
     * 删除资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadPlanRequest 请求对象
     * @return SyncInvoker<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse>
     */
    public SyncInvoker<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse> deleteWorkloadPlanInvoker(
        DeleteWorkloadPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteWorkloadPlan, hcClient);
    }

    /**
     * 删除资源管理计划阶段
     *
     * 删除资源管理计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadPlanStageRequest 请求对象
     * @return DeleteWorkloadPlanStageResponse
     */
    public DeleteWorkloadPlanStageResponse deleteWorkloadPlanStage(DeleteWorkloadPlanStageRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteWorkloadPlanStage);
    }

    /**
     * 删除资源管理计划阶段
     *
     * 删除资源管理计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadPlanStageRequest 请求对象
     * @return SyncInvoker<DeleteWorkloadPlanStageRequest, DeleteWorkloadPlanStageResponse>
     */
    public SyncInvoker<DeleteWorkloadPlanStageRequest, DeleteWorkloadPlanStageResponse> deleteWorkloadPlanStageInvoker(
        DeleteWorkloadPlanStageRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteWorkloadPlanStage, hcClient);
    }

    /**
     * 删除资源池
     *
     * 该接口用于删除资源池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadQueueRequest 请求对象
     * @return DeleteWorkloadQueueResponse
     */
    public DeleteWorkloadQueueResponse deleteWorkloadQueue(DeleteWorkloadQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteWorkloadQueue);
    }

    /**
     * 删除资源池
     *
     * 该接口用于删除资源池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadQueueRequest 请求对象
     * @return SyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse>
     */
    public SyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> deleteWorkloadQueueInvoker(
        DeleteWorkloadQueueRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteWorkloadQueue, hcClient);
    }

    /**
     * 删除异常规则
     *
     * 删除异常规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadRuleRequest 请求对象
     * @return DeleteWorkloadRuleResponse
     */
    public DeleteWorkloadRuleResponse deleteWorkloadRule(DeleteWorkloadRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteWorkloadRule);
    }

    /**
     * 删除异常规则
     *
     * 删除异常规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadRuleRequest 请求对象
     * @return SyncInvoker<DeleteWorkloadRuleRequest, DeleteWorkloadRuleResponse>
     */
    public SyncInvoker<DeleteWorkloadRuleRequest, DeleteWorkloadRuleResponse> deleteWorkloadRuleInvoker(
        DeleteWorkloadRuleRequest request) {
        return new SyncInvoker<>(request, DwsMeta.deleteWorkloadRule, hcClient);
    }

    /**
     * 停用逻辑集群定时增删计划
     *
     * 停用逻辑集群定时增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableLogicalClusterPlanRequest 请求对象
     * @return DisableLogicalClusterPlanResponse
     */
    public DisableLogicalClusterPlanResponse disableLogicalClusterPlan(DisableLogicalClusterPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.disableLogicalClusterPlan);
    }

    /**
     * 停用逻辑集群定时增删计划
     *
     * 停用逻辑集群定时增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableLogicalClusterPlanRequest 请求对象
     * @return SyncInvoker<DisableLogicalClusterPlanRequest, DisableLogicalClusterPlanResponse>
     */
    public SyncInvoker<DisableLogicalClusterPlanRequest, DisableLogicalClusterPlanResponse> disableLogicalClusterPlanInvoker(
        DisableLogicalClusterPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.disableLogicalClusterPlan, hcClient);
    }

    /**
     * 关闭云服务日志
     *
     * 该接口用于关闭集群LTS云日志服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableLtsLogsRequest 请求对象
     * @return DisableLtsLogsResponse
     */
    public DisableLtsLogsResponse disableLtsLogs(DisableLtsLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.disableLtsLogs);
    }

    /**
     * 关闭云服务日志
     *
     * 该接口用于关闭集群LTS云日志服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableLtsLogsRequest 请求对象
     * @return SyncInvoker<DisableLtsLogsRequest, DisableLtsLogsResponse>
     */
    public SyncInvoker<DisableLtsLogsRequest, DisableLtsLogsResponse> disableLtsLogsInvoker(
        DisableLtsLogsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.disableLtsLogs, hcClient);
    }

    /**
     * 集群解绑EIP
     *
     * 集群解绑Eip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateEipRequest 请求对象
     * @return DisassociateEipResponse
     */
    public DisassociateEipResponse disassociateEip(DisassociateEipRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.disassociateEip);
    }

    /**
     * 集群解绑EIP
     *
     * 集群解绑Eip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateEipRequest 请求对象
     * @return SyncInvoker<DisassociateEipRequest, DisassociateEipResponse>
     */
    public SyncInvoker<DisassociateEipRequest, DisassociateEipResponse> disassociateEipInvoker(
        DisassociateEipRequest request) {
        return new SyncInvoker<>(request, DwsMeta.disassociateEip, hcClient);
    }

    /**
     * 集群解绑ELB
     *
     * 集群解绑Elb接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateElbRequest 请求对象
     * @return DisassociateElbResponse
     */
    public DisassociateElbResponse disassociateElb(DisassociateElbRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.disassociateElb);
    }

    /**
     * 集群解绑ELB
     *
     * 集群解绑Elb接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateElbRequest 请求对象
     * @return SyncInvoker<DisassociateElbRequest, DisassociateElbResponse>
     */
    public SyncInvoker<DisassociateElbRequest, DisassociateElbResponse> disassociateElbInvoker(
        DisassociateElbRequest request) {
        return new SyncInvoker<>(request, DwsMeta.disassociateElb, hcClient);
    }

    /**
     * 切换逻辑集群开关
     *
     * 切换逻辑集群开关，仅用于控制逻辑集群相关功能模块是否在页面展示。
     * 在集群已经是逻辑集群的场景下，修改该接口无任何作用及影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLogicalClusterRequest 请求对象
     * @return EnableLogicalClusterResponse
     */
    public EnableLogicalClusterResponse enableLogicalCluster(EnableLogicalClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.enableLogicalCluster);
    }

    /**
     * 切换逻辑集群开关
     *
     * 切换逻辑集群开关，仅用于控制逻辑集群相关功能模块是否在页面展示。
     * 在集群已经是逻辑集群的场景下，修改该接口无任何作用及影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLogicalClusterRequest 请求对象
     * @return SyncInvoker<EnableLogicalClusterRequest, EnableLogicalClusterResponse>
     */
    public SyncInvoker<EnableLogicalClusterRequest, EnableLogicalClusterResponse> enableLogicalClusterInvoker(
        EnableLogicalClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.enableLogicalCluster, hcClient);
    }

    /**
     * 启用逻辑集群定时增删计划
     *
     * 启用逻辑集群定时增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLogicalClusterPlanRequest 请求对象
     * @return EnableLogicalClusterPlanResponse
     */
    public EnableLogicalClusterPlanResponse enableLogicalClusterPlan(EnableLogicalClusterPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.enableLogicalClusterPlan);
    }

    /**
     * 启用逻辑集群定时增删计划
     *
     * 启用逻辑集群定时增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLogicalClusterPlanRequest 请求对象
     * @return SyncInvoker<EnableLogicalClusterPlanRequest, EnableLogicalClusterPlanResponse>
     */
    public SyncInvoker<EnableLogicalClusterPlanRequest, EnableLogicalClusterPlanResponse> enableLogicalClusterPlanInvoker(
        EnableLogicalClusterPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.enableLogicalClusterPlan, hcClient);
    }

    /**
     * 开启云服务日志
     *
     * 该接口用于开启集群LTS云日志服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLtsLogsRequest 请求对象
     * @return EnableLtsLogsResponse
     */
    public EnableLtsLogsResponse enableLtsLogs(EnableLtsLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.enableLtsLogs);
    }

    /**
     * 开启云服务日志
     *
     * 该接口用于开启集群LTS云日志服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLtsLogsRequest 请求对象
     * @return SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>
     */
    public SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogsInvoker(EnableLtsLogsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.enableLtsLogs, hcClient);
    }

    /**
     * 转加密集群
     *
     * 转加密集群。
     * **约束限制**：
     * 转加密集群起始支持版本：8.0.0
     * 转加密集群guestAgent起始支持版本：8.3.0.200
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EncryptClusterRequest 请求对象
     * @return EncryptClusterResponse
     */
    public EncryptClusterResponse encryptCluster(EncryptClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.encryptCluster);
    }

    /**
     * 转加密集群
     *
     * 转加密集群。
     * **约束限制**：
     * 转加密集群起始支持版本：8.0.0
     * 转加密集群guestAgent起始支持版本：8.3.0.200
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EncryptClusterRequest 请求对象
     * @return SyncInvoker<EncryptClusterRequest, EncryptClusterResponse>
     */
    public SyncInvoker<EncryptClusterRequest, EncryptClusterResponse> encryptClusterInvoker(
        EncryptClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.encryptCluster, hcClient);
    }

    /**
     * 下发集群升级相关操作
     *
     * 下发集群升级相关操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteClusterUpgradeActionRequest 请求对象
     * @return ExecuteClusterUpgradeActionResponse
     */
    public ExecuteClusterUpgradeActionResponse executeClusterUpgradeAction(ExecuteClusterUpgradeActionRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.executeClusterUpgradeAction);
    }

    /**
     * 下发集群升级相关操作
     *
     * 下发集群升级相关操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteClusterUpgradeActionRequest 请求对象
     * @return SyncInvoker<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse>
     */
    public SyncInvoker<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse> executeClusterUpgradeActionInvoker(
        ExecuteClusterUpgradeActionRequest request) {
        return new SyncInvoker<>(request, DwsMeta.executeClusterUpgradeAction, hcClient);
    }

    /**
     * 执行运维用户操作
     *
     * 进行数据库运维账户操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDatabaseOmUserActionRequest 请求对象
     * @return ExecuteDatabaseOmUserActionResponse
     */
    public ExecuteDatabaseOmUserActionResponse executeDatabaseOmUserAction(ExecuteDatabaseOmUserActionRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.executeDatabaseOmUserAction);
    }

    /**
     * 执行运维用户操作
     *
     * 进行数据库运维账户操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDatabaseOmUserActionRequest 请求对象
     * @return SyncInvoker<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse>
     */
    public SyncInvoker<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse> executeDatabaseOmUserActionInvoker(
        ExecuteDatabaseOmUserActionRequest request) {
        return new SyncInvoker<>(request, DwsMeta.executeDatabaseOmUserAction, hcClient);
    }

    /**
     * 执行规格变更
     *
     * 执行规格变更。
     * **约束限制**：
     * 包周期集群暂不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteFlavorChangeRequest 请求对象
     * @return ExecuteFlavorChangeResponse
     */
    public ExecuteFlavorChangeResponse executeFlavorChange(ExecuteFlavorChangeRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.executeFlavorChange);
    }

    /**
     * 执行规格变更
     *
     * 执行规格变更。
     * **约束限制**：
     * 包周期集群暂不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteFlavorChangeRequest 请求对象
     * @return SyncInvoker<ExecuteFlavorChangeRequest, ExecuteFlavorChangeResponse>
     */
    public SyncInvoker<ExecuteFlavorChangeRequest, ExecuteFlavorChangeResponse> executeFlavorChangeInvoker(
        ExecuteFlavorChangeRequest request) {
        return new SyncInvoker<>(request, DwsMeta.executeFlavorChange, hcClient);
    }

    /**
     * 下发重分布
     *
     * 该接口用于集群扩容后将老节点数据均匀分布到新扩节点的数据重分布操作，数据“重分布”后将大大提升业务响应速率。
     * 重分布功能DWS 2.0 8.1.1.200及以上集群版本支持。
     * 离线调度重分布模式在8.2.0及以上版本将不再支持。
     * 只有在扩容之后，集群任务信息为“待重分布”状态时才能手动使用“重分布”功能，其他时段该功能不可使用。
     * 在扩容阶段也可以选择重分布模式等高级配置，详情参见设置高级配置。
     * 重分布队列的排序依据表的relpage大小进行，为确保relpage大小正确，建议在重分布之前对需要重分布的表执行analyze操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteRedistributionClusterRequest 请求对象
     * @return ExecuteRedistributionClusterResponse
     */
    public ExecuteRedistributionClusterResponse executeRedistributionCluster(
        ExecuteRedistributionClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.executeRedistributionCluster);
    }

    /**
     * 下发重分布
     *
     * 该接口用于集群扩容后将老节点数据均匀分布到新扩节点的数据重分布操作，数据“重分布”后将大大提升业务响应速率。
     * 重分布功能DWS 2.0 8.1.1.200及以上集群版本支持。
     * 离线调度重分布模式在8.2.0及以上版本将不再支持。
     * 只有在扩容之后，集群任务信息为“待重分布”状态时才能手动使用“重分布”功能，其他时段该功能不可使用。
     * 在扩容阶段也可以选择重分布模式等高级配置，详情参见设置高级配置。
     * 重分布队列的排序依据表的relpage大小进行，为确保relpage大小正确，建议在重分布之前对需要重分布的表执行analyze操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteRedistributionClusterRequest 请求对象
     * @return SyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse>
     */
    public SyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> executeRedistributionClusterInvoker(
        ExecuteRedistributionClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.executeRedistributionCluster, hcClient);
    }

    /**
     * 磁盘扩容
     *
     * 随着客户业务的发展，磁盘空间往往最先出现资源瓶颈，在其他资源尚且充足的情况下，通过磁盘扩容可快速缓解存储资源瓶颈现象，操作过程中无需暂停业务，并且不会造成CPU、内存等资源浪费。  
     *  **约束限制**：
     * 磁盘扩容功能仅8.1.1.203及以上版本支持，并且创建集群规格需要为云数仓SSD云盘或实时数仓类型。  
     * 按需+折扣套餐包消费模式下，存储扩容后超出折扣套餐包部分将按需收费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceStorageRequest 请求对象
     * @return ExpandInstanceStorageResponse
     */
    public ExpandInstanceStorageResponse expandInstanceStorage(ExpandInstanceStorageRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.expandInstanceStorage);
    }

    /**
     * 磁盘扩容
     *
     * 随着客户业务的发展，磁盘空间往往最先出现资源瓶颈，在其他资源尚且充足的情况下，通过磁盘扩容可快速缓解存储资源瓶颈现象，操作过程中无需暂停业务，并且不会造成CPU、内存等资源浪费。  
     *  **约束限制**：
     * 磁盘扩容功能仅8.1.1.203及以上版本支持，并且创建集群规格需要为云数仓SSD云盘或实时数仓类型。  
     * 按需+折扣套餐包消费模式下，存储扩容后超出折扣套餐包部分将按需收费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceStorageRequest 请求对象
     * @return SyncInvoker<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse>
     */
    public SyncInvoker<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> expandInstanceStorageInvoker(
        ExpandInstanceStorageRequest request) {
        return new SyncInvoker<>(request, DwsMeta.expandInstanceStorage, hcClient);
    }

    /**
     * 导出数据库用户/角色
     *
     * 导出数据库用户/角色，接口返回的是输出流，xlsx文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDatabaseUsersRequest 请求对象
     * @return ExportDatabaseUsersResponse
     */
    public ExportDatabaseUsersResponse exportDatabaseUsers(ExportDatabaseUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.exportDatabaseUsers);
    }

    /**
     * 导出数据库用户/角色
     *
     * 导出数据库用户/角色，接口返回的是输出流，xlsx文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDatabaseUsersRequest 请求对象
     * @return SyncInvoker<ExportDatabaseUsersRequest, ExportDatabaseUsersResponse>
     */
    public SyncInvoker<ExportDatabaseUsersRequest, ExportDatabaseUsersResponse> exportDatabaseUsersInvoker(
        ExportDatabaseUsersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.exportDatabaseUsers, hcClient);
    }

    /**
     * 导出数据库用户/角色的权限
     *
     * 导出数据库用户/角色的权限列表，接口返回的是输出流，xlsx文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserAuthorityRequest 请求对象
     * @return ExportUserAuthorityResponse
     */
    public ExportUserAuthorityResponse exportUserAuthority(ExportUserAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.exportUserAuthority);
    }

    /**
     * 导出数据库用户/角色的权限
     *
     * 导出数据库用户/角色的权限列表，接口返回的是输出流，xlsx文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserAuthorityRequest 请求对象
     * @return SyncInvoker<ExportUserAuthorityRequest, ExportUserAuthorityResponse>
     */
    public SyncInvoker<ExportUserAuthorityRequest, ExportUserAuthorityResponse> exportUserAuthorityInvoker(
        ExportUserAuthorityRequest request) {
        return new SyncInvoker<>(request, DwsMeta.exportUserAuthority, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmConfigsRequest 请求对象
     * @return ListAlarmConfigsResponse
     */
    public ListAlarmConfigsResponse listAlarmConfigs(ListAlarmConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAlarmConfigs);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmConfigsRequest 请求对象
     * @return SyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse>
     */
    public SyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse> listAlarmConfigsInvoker(
        ListAlarmConfigsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listAlarmConfigs, hcClient);
    }

    /**
     * 查询告警详情列表
     *
     * 查询告警详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmDetailRequest 请求对象
     * @return ListAlarmDetailResponse
     */
    public ListAlarmDetailResponse listAlarmDetail(ListAlarmDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAlarmDetail);
    }

    /**
     * 查询告警详情列表
     *
     * 查询告警详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmDetailRequest 请求对象
     * @return SyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse>
     */
    public SyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse> listAlarmDetailInvoker(
        ListAlarmDetailRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listAlarmDetail, hcClient);
    }

    /**
     * 查询告警统计列表
     *
     * 查询告警统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticRequest 请求对象
     * @return ListAlarmStatisticResponse
     */
    public ListAlarmStatisticResponse listAlarmStatistic(ListAlarmStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAlarmStatistic);
    }

    /**
     * 查询告警统计列表
     *
     * 查询告警统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticRequest 请求对象
     * @return SyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse>
     */
    public SyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse> listAlarmStatisticInvoker(
        ListAlarmStatisticRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listAlarmStatistic, hcClient);
    }

    /**
     * 查询告警订阅列表
     *
     * 查询订阅告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmSubsRequest 请求对象
     * @return ListAlarmSubsResponse
     */
    public ListAlarmSubsResponse listAlarmSubs(ListAlarmSubsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAlarmSubs);
    }

    /**
     * 查询告警订阅列表
     *
     * 查询订阅告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmSubsRequest 请求对象
     * @return SyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse>
     */
    public SyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse> listAlarmSubsInvoker(ListAlarmSubsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listAlarmSubs, hcClient);
    }

    /**
     * 查询日志记录
     *
     * 查询审计日志记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogRequest 请求对象
     * @return ListAuditLogResponse
     */
    public ListAuditLogResponse listAuditLog(ListAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAuditLog);
    }

    /**
     * 查询日志记录
     *
     * 查询审计日志记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogRequest 请求对象
     * @return SyncInvoker<ListAuditLogRequest, ListAuditLogResponse>
     */
    public SyncInvoker<ListAuditLogRequest, ListAuditLogResponse> listAuditLogInvoker(ListAuditLogRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listAuditLog, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAvailabilityZones);
    }

    /**
     * 查询可用区列表
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询可用容灾集群列表
     *
     * 该接口用于查询可用的容灾集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableDisasterClustersRequest 请求对象
     * @return ListAvailableDisasterClustersResponse
     */
    public ListAvailableDisasterClustersResponse listAvailableDisasterClusters(
        ListAvailableDisasterClustersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAvailableDisasterClusters);
    }

    /**
     * 查询可用容灾集群列表
     *
     * 该接口用于查询可用的容灾集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableDisasterClustersRequest 请求对象
     * @return SyncInvoker<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse>
     */
    public SyncInvoker<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> listAvailableDisasterClustersInvoker(
        ListAvailableDisasterClustersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listAvailableDisasterClusters, hcClient);
    }

    /**
     * 查询集群任务详情
     *
     * 查询集群任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterActionsRequest 请求对象
     * @return ListClusterActionsResponse
     */
    public ListClusterActionsResponse listClusterActions(ListClusterActionsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterActions);
    }

    /**
     * 查询集群任务详情
     *
     * 查询集群任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterActionsRequest 请求对象
     * @return SyncInvoker<ListClusterActionsRequest, ListClusterActionsResponse>
     */
    public SyncInvoker<ListClusterActionsRequest, ListClusterActionsResponse> listClusterActionsInvoker(
        ListClusterActionsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterActions, hcClient);
    }

    /**
     * 查询集群CN节点
     *
     * 查询集群的CN节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterCnRequest 请求对象
     * @return ListClusterCnResponse
     */
    public ListClusterCnResponse listClusterCn(ListClusterCnRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterCn);
    }

    /**
     * 查询集群CN节点
     *
     * 查询集群的CN节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterCnRequest 请求对象
     * @return SyncInvoker<ListClusterCnRequest, ListClusterCnResponse>
     */
    public SyncInvoker<ListClusterCnRequest, ListClusterCnResponse> listClusterCnInvoker(ListClusterCnRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterCn, hcClient);
    }

    /**
     * 查询集群参数组
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterConfigurationsRequest 请求对象
     * @return ListClusterConfigurationsResponse
     */
    public ListClusterConfigurationsResponse listClusterConfigurations(ListClusterConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterConfigurations);
    }

    /**
     * 查询集群参数组
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterConfigurationsRequest 请求对象
     * @return SyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse>
     */
    public SyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> listClusterConfigurationsInvoker(
        ListClusterConfigurationsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterConfigurations, hcClient);
    }

    /**
     * 查询集群参数配置
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterConfigurationsParameterRequest 请求对象
     * @return ListClusterConfigurationsParameterResponse
     */
    public ListClusterConfigurationsParameterResponse listClusterConfigurationsParameter(
        ListClusterConfigurationsParameterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterConfigurationsParameter);
    }

    /**
     * 查询集群参数配置
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterConfigurationsParameterRequest 请求对象
     * @return SyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse>
     */
    public SyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> listClusterConfigurationsParameterInvoker(
        ListClusterConfigurationsParameterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterConfigurationsParameter, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 查询集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterDetailsRequest 请求对象
     * @return ListClusterDetailsResponse
     */
    public ListClusterDetailsResponse listClusterDetails(ListClusterDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterDetails);
    }

    /**
     * 查询集群详情
     *
     * 查询集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterDetailsRequest 请求对象
     * @return SyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>
     */
    public SyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetailsInvoker(
        ListClusterDetailsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterDetails, hcClient);
    }

    /**
     * 查询连接信息
     *
     * 查询连接信息。包括公网域名、内网域名等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEndpointsRequest 请求对象
     * @return ListClusterEndpointsResponse
     */
    public ListClusterEndpointsResponse listClusterEndpoints(ListClusterEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterEndpoints);
    }

    /**
     * 查询连接信息
     *
     * 查询连接信息。包括公网域名、内网域名等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEndpointsRequest 请求对象
     * @return SyncInvoker<ListClusterEndpointsRequest, ListClusterEndpointsResponse>
     */
    public SyncInvoker<ListClusterEndpointsRequest, ListClusterEndpointsResponse> listClusterEndpointsInvoker(
        ListClusterEndpointsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterEndpoints, hcClient);
    }

    /**
     * 查询节点列表
     *
     * 查询节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNodesRequest 请求对象
     * @return ListClusterNodesResponse
     */
    public ListClusterNodesResponse listClusterNodes(ListClusterNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterNodes);
    }

    /**
     * 查询节点列表
     *
     * 查询节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNodesRequest 请求对象
     * @return SyncInvoker<ListClusterNodesRequest, ListClusterNodesResponse>
     */
    public SyncInvoker<ListClusterNodesRequest, ListClusterNodesResponse> listClusterNodesInvoker(
        ListClusterNodesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterNodes, hcClient);
    }

    /**
     * 查询合适的缩容数
     *
     * 查询合适的缩容数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterScaleInNumbersRequest 请求对象
     * @return ListClusterScaleInNumbersResponse
     */
    public ListClusterScaleInNumbersResponse listClusterScaleInNumbers(ListClusterScaleInNumbersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterScaleInNumbers);
    }

    /**
     * 查询合适的缩容数
     *
     * 查询合适的缩容数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterScaleInNumbersRequest 请求对象
     * @return SyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse>
     */
    public SyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> listClusterScaleInNumbersInvoker(
        ListClusterScaleInNumbersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterScaleInNumbers, hcClient);
    }

    /**
     * 查询集群快照列表
     *
     * 该接口用于查询集群快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterSnapshotsRequest 请求对象
     * @return ListClusterSnapshotsResponse
     */
    public ListClusterSnapshotsResponse listClusterSnapshots(ListClusterSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterSnapshots);
    }

    /**
     * 查询集群快照列表
     *
     * 该接口用于查询集群快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterSnapshotsRequest 请求对象
     * @return SyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse>
     */
    public SyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> listClusterSnapshotsInvoker(
        ListClusterSnapshotsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterSnapshots, hcClient);
    }

    /**
     * 查询集群标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterTagsRequest 请求对象
     * @return ListClusterTagsResponse
     */
    public ListClusterTagsResponse listClusterTags(ListClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterTags);
    }

    /**
     * 查询集群标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterTagsRequest 请求对象
     * @return SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>
     */
    public SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTagsInvoker(
        ListClusterTagsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterTags, hcClient);
    }

    /**
     * 查询资源管理开关状态
     *
     * 查询资源管理开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterWorkloadRequest 请求对象
     * @return ListClusterWorkloadResponse
     */
    public ListClusterWorkloadResponse listClusterWorkload(ListClusterWorkloadRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterWorkload);
    }

    /**
     * 查询资源管理开关状态
     *
     * 查询资源管理开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterWorkloadRequest 请求对象
     * @return SyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse>
     */
    public SyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse> listClusterWorkloadInvoker(
        ListClusterWorkloadRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusterWorkload, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 查询集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusters);
    }

    /**
     * 查询集群列表
     *
     * 查询集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listClusters, hcClient);
    }

    /**
     * 查询参数修改审计记录
     *
     * 查询参数修改审计记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsAuditRecordsRequest 请求对象
     * @return ListConfigurationsAuditRecordsResponse
     */
    public ListConfigurationsAuditRecordsResponse listConfigurationsAuditRecords(
        ListConfigurationsAuditRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listConfigurationsAuditRecords);
    }

    /**
     * 查询参数修改审计记录
     *
     * 查询参数修改审计记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsAuditRecordsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse>
     */
    public SyncInvoker<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse> listConfigurationsAuditRecordsInvoker(
        ListConfigurationsAuditRecordsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listConfigurationsAuditRecords, hcClient);
    }

    /**
     * 查询数据源
     *
     * 该接口用于查询数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataSourceRequest 请求对象
     * @return ListDataSourceResponse
     */
    public ListDataSourceResponse listDataSource(ListDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDataSource);
    }

    /**
     * 查询数据源
     *
     * 该接口用于查询数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataSourceRequest 请求对象
     * @return SyncInvoker<ListDataSourceRequest, ListDataSourceResponse>
     */
    public SyncInvoker<ListDataSourceRequest, ListDataSourceResponse> listDataSourceInvoker(
        ListDataSourceRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listDataSource, hcClient);
    }

    /**
     * 查询数据库对象
     *
     * 查询数据库对象。
     * **约束限制**：
     * 集群guestAgent插件大于等于8.2.1.1开始支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseObjectsRequest 请求对象
     * @return ListDatabaseObjectsResponse
     */
    public ListDatabaseObjectsResponse listDatabaseObjects(ListDatabaseObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDatabaseObjects);
    }

    /**
     * 查询数据库对象
     *
     * 查询数据库对象。
     * **约束限制**：
     * 集群guestAgent插件大于等于8.2.1.1开始支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseObjectsRequest 请求对象
     * @return SyncInvoker<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse>
     */
    public SyncInvoker<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> listDatabaseObjectsInvoker(
        ListDatabaseObjectsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listDatabaseObjects, hcClient);
    }

    /**
     * 查询用户/角色拥有权限
     *
     * 查询用户/角色拥有权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUserAuthoritiesRequest 请求对象
     * @return ListDatabaseUserAuthoritiesResponse
     */
    public ListDatabaseUserAuthoritiesResponse listDatabaseUserAuthorities(ListDatabaseUserAuthoritiesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDatabaseUserAuthorities);
    }

    /**
     * 查询用户/角色拥有权限
     *
     * 查询用户/角色拥有权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUserAuthoritiesRequest 请求对象
     * @return SyncInvoker<ListDatabaseUserAuthoritiesRequest, ListDatabaseUserAuthoritiesResponse>
     */
    public SyncInvoker<ListDatabaseUserAuthoritiesRequest, ListDatabaseUserAuthoritiesResponse> listDatabaseUserAuthoritiesInvoker(
        ListDatabaseUserAuthoritiesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listDatabaseUserAuthorities, hcClient);
    }

    /**
     * 查询所有数据库用户/角色
     *
     * 查询所有数据库用户/角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUsersRequest 请求对象
     * @return ListDatabaseUsersResponse
     */
    public ListDatabaseUsersResponse listDatabaseUsers(ListDatabaseUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDatabaseUsers);
    }

    /**
     * 查询所有数据库用户/角色
     *
     * 查询所有数据库用户/角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUsersRequest 请求对象
     * @return SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersInvoker(
        ListDatabaseUsersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listDatabaseUsers, hcClient);
    }

    /**
     * 查询容灾列表
     *
     * 该接口用于查询容灾列表。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDisasterRecoverRequest 请求对象
     * @return ListDisasterRecoverResponse
     */
    public ListDisasterRecoverResponse listDisasterRecover(ListDisasterRecoverRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDisasterRecover);
    }

    /**
     * 查询容灾列表
     *
     * 该接口用于查询容灾列表。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDisasterRecoverRequest 请求对象
     * @return SyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse>
     */
    public SyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse> listDisasterRecoverInvoker(
        ListDisasterRecoverRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listDisasterRecover, hcClient);
    }

    /**
     * 查询专属分布式存储池列表
     *
     * 获取专属分布式存储池列表，只包括用户开通的SSD专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDssPoolsRequest 请求对象
     * @return ListDssPoolsResponse
     */
    public ListDssPoolsResponse listDssPools(ListDssPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDssPools);
    }

    /**
     * 查询专属分布式存储池列表
     *
     * 获取专属分布式存储池列表，只包括用户开通的SSD专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDssPoolsRequest 请求对象
     * @return SyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse>
     */
    public SyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse> listDssPoolsInvoker(ListDssPoolsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listDssPools, hcClient);
    }

    /**
     * 获取集群可绑定的ELB列表
     *
     * 查询集群可以关联的ELB列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbsRequest 请求对象
     * @return ListElbsResponse
     */
    public ListElbsResponse listElbs(ListElbsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listElbs);
    }

    /**
     * 获取集群可绑定的ELB列表
     *
     * 查询集群可以关联的ELB列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbsRequest 请求对象
     * @return SyncInvoker<ListElbsRequest, ListElbsResponse>
     */
    public SyncInvoker<ListElbsRequest, ListElbsResponse> listElbsInvoker(ListElbsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listElbs, hcClient);
    }

    /**
     * 查询事件配置
     *
     * 查询事件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSpecsRequest 请求对象
     * @return ListEventSpecsResponse
     */
    public ListEventSpecsResponse listEventSpecs(ListEventSpecsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listEventSpecs);
    }

    /**
     * 查询事件配置
     *
     * 查询事件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSpecsRequest 请求对象
     * @return SyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse>
     */
    public SyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse> listEventSpecsInvoker(
        ListEventSpecsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listEventSpecs, hcClient);
    }

    /**
     * 查询订阅事件
     *
     * 查询订阅的事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSubsRequest 请求对象
     * @return ListEventSubsResponse
     */
    public ListEventSubsResponse listEventSubs(ListEventSubsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listEventSubs);
    }

    /**
     * 查询订阅事件
     *
     * 查询订阅的事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSubsRequest 请求对象
     * @return SyncInvoker<ListEventSubsRequest, ListEventSubsResponse>
     */
    public SyncInvoker<ListEventSubsRequest, ListEventSubsResponse> listEventSubsInvoker(ListEventSubsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listEventSubs, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listEvents);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listEvents, hcClient);
    }

    /**
     * 查询磁盘信息
     *
     * 查询磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostDiskRequest 请求对象
     * @return ListHostDiskResponse
     */
    public ListHostDiskResponse listHostDisk(ListHostDiskRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listHostDisk);
    }

    /**
     * 查询磁盘信息
     *
     * 查询磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostDiskRequest 请求对象
     * @return SyncInvoker<ListHostDiskRequest, ListHostDiskResponse>
     */
    public SyncInvoker<ListHostDiskRequest, ListHostDiskResponse> listHostDiskInvoker(ListHostDiskRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listHostDisk, hcClient);
    }

    /**
     * 获取网卡状态
     *
     * 获取网卡状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostNetRequest 请求对象
     * @return ListHostNetResponse
     */
    public ListHostNetResponse listHostNet(ListHostNetRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listHostNet);
    }

    /**
     * 获取网卡状态
     *
     * 获取网卡状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostNetRequest 请求对象
     * @return SyncInvoker<ListHostNetRequest, ListHostNetResponse>
     */
    public SyncInvoker<ListHostNetRequest, ListHostNetResponse> listHostNetInvoker(ListHostNetRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listHostNet, hcClient);
    }

    /**
     * 查询主机概览
     *
     * 查询主机概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostOverviewRequest 请求对象
     * @return ListHostOverviewResponse
     */
    public ListHostOverviewResponse listHostOverview(ListHostOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listHostOverview);
    }

    /**
     * 查询主机概览
     *
     * 查询主机概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostOverviewRequest 请求对象
     * @return SyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse>
     */
    public SyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse> listHostOverviewInvoker(
        ListHostOverviewRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listHostOverview, hcClient);
    }

    /**
     * 查询任务进度
     *
     * 查询任务进度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobDetailsRequest 请求对象
     * @return ListJobDetailsResponse
     */
    public ListJobDetailsResponse listJobDetails(ListJobDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listJobDetails);
    }

    /**
     * 查询任务进度
     *
     * 查询任务进度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobDetailsRequest 请求对象
     * @return SyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse>
     */
    public SyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse> listJobDetailsInvoker(
        ListJobDetailsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listJobDetails, hcClient);
    }

    /**
     * 查询逻辑集群定时增删计划
     *
     * 查询逻辑集群定时增删计划。定时增删计划业务支持最多保存20条数据，接口最大返回20条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterPlansRequest 请求对象
     * @return ListLogicalClusterPlansResponse
     */
    public ListLogicalClusterPlansResponse listLogicalClusterPlans(ListLogicalClusterPlansRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listLogicalClusterPlans);
    }

    /**
     * 查询逻辑集群定时增删计划
     *
     * 查询逻辑集群定时增删计划。定时增删计划业务支持最多保存20条数据，接口最大返回20条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterPlansRequest 请求对象
     * @return SyncInvoker<ListLogicalClusterPlansRequest, ListLogicalClusterPlansResponse>
     */
    public SyncInvoker<ListLogicalClusterPlansRequest, ListLogicalClusterPlansResponse> listLogicalClusterPlansInvoker(
        ListLogicalClusterPlansRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listLogicalClusterPlans, hcClient);
    }

    /**
     * 查询逻辑集群可用环节点信息
     *
     * 查询逻辑集群可用环节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterRingsRequest 请求对象
     * @return ListLogicalClusterRingsResponse
     */
    public ListLogicalClusterRingsResponse listLogicalClusterRings(ListLogicalClusterRingsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listLogicalClusterRings);
    }

    /**
     * 查询逻辑集群可用环节点信息
     *
     * 查询逻辑集群可用环节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterRingsRequest 请求对象
     * @return SyncInvoker<ListLogicalClusterRingsRequest, ListLogicalClusterRingsResponse>
     */
    public SyncInvoker<ListLogicalClusterRingsRequest, ListLogicalClusterRingsResponse> listLogicalClusterRingsInvoker(
        ListLogicalClusterRingsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listLogicalClusterRings, hcClient);
    }

    /**
     * 查询逻辑集群任务信息
     *
     * 查询逻辑集群任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterTasksRequest 请求对象
     * @return ListLogicalClusterTasksResponse
     */
    public ListLogicalClusterTasksResponse listLogicalClusterTasks(ListLogicalClusterTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listLogicalClusterTasks);
    }

    /**
     * 查询逻辑集群任务信息
     *
     * 查询逻辑集群任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterTasksRequest 请求对象
     * @return SyncInvoker<ListLogicalClusterTasksRequest, ListLogicalClusterTasksResponse>
     */
    public SyncInvoker<ListLogicalClusterTasksRequest, ListLogicalClusterTasksResponse> listLogicalClusterTasksInvoker(
        ListLogicalClusterTasksRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listLogicalClusterTasks, hcClient);
    }

    /**
     * 查询逻辑集群磁盘信息
     *
     * 查询逻辑集群磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterVolumesRequest 请求对象
     * @return ListLogicalClusterVolumesResponse
     */
    public ListLogicalClusterVolumesResponse listLogicalClusterVolumes(ListLogicalClusterVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listLogicalClusterVolumes);
    }

    /**
     * 查询逻辑集群磁盘信息
     *
     * 查询逻辑集群磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterVolumesRequest 请求对象
     * @return SyncInvoker<ListLogicalClusterVolumesRequest, ListLogicalClusterVolumesResponse>
     */
    public SyncInvoker<ListLogicalClusterVolumesRequest, ListLogicalClusterVolumesResponse> listLogicalClusterVolumesInvoker(
        ListLogicalClusterVolumesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listLogicalClusterVolumes, hcClient);
    }

    /**
     * 查询逻辑集群列表
     *
     * 查询逻辑集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClustersRequest 请求对象
     * @return ListLogicalClustersResponse
     */
    public ListLogicalClustersResponse listLogicalClusters(ListLogicalClustersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listLogicalClusters);
    }

    /**
     * 查询逻辑集群列表
     *
     * 查询逻辑集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClustersRequest 请求对象
     * @return SyncInvoker<ListLogicalClustersRequest, ListLogicalClustersResponse>
     */
    public SyncInvoker<ListLogicalClustersRequest, ListLogicalClustersResponse> listLogicalClustersInvoker(
        ListLogicalClustersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listLogicalClusters, hcClient);
    }

    /**
     * 获取LTS日志列表
     *
     * 获取LTS日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsLogsRequest 请求对象
     * @return ListLtsLogsResponse
     */
    public ListLtsLogsResponse listLtsLogs(ListLtsLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listLtsLogs);
    }

    /**
     * 获取LTS日志列表
     *
     * 获取LTS日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsLogsRequest 请求对象
     * @return SyncInvoker<ListLtsLogsRequest, ListLtsLogsResponse>
     */
    public SyncInvoker<ListLtsLogsRequest, ListLtsLogsResponse> listLtsLogsInvoker(ListLtsLogsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listLtsLogs, hcClient);
    }

    /**
     * 查询集群使用指标列表
     *
     * 查询集群使用指标列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return ListMetricsResponse
     */
    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listMetrics);
    }

    /**
     * 查询集群使用指标列表
     *
     * 查询集群使用指标列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return SyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public SyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsInvoker(ListMetricsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listMetrics, hcClient);
    }

    /**
     * 获取指定指标相关采集数据
     *
     * 获取指定指标相关采集数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsDataRequest 请求对象
     * @return ListMetricsDataResponse
     */
    public ListMetricsDataResponse listMetricsData(ListMetricsDataRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listMetricsData);
    }

    /**
     * 获取指定指标相关采集数据
     *
     * 获取指定指标相关采集数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsDataRequest 请求对象
     * @return SyncInvoker<ListMetricsDataRequest, ListMetricsDataResponse>
     */
    public SyncInvoker<ListMetricsDataRequest, ListMetricsDataResponse> listMetricsDataInvoker(
        ListMetricsDataRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listMetricsData, hcClient);
    }

    /**
     * 查询历史监控数据
     *
     * 查询历史监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorIndicatorDataRequest 请求对象
     * @return ListMonitorIndicatorDataResponse
     */
    public ListMonitorIndicatorDataResponse listMonitorIndicatorData(ListMonitorIndicatorDataRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listMonitorIndicatorData);
    }

    /**
     * 查询历史监控数据
     *
     * 查询历史监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorIndicatorDataRequest 请求对象
     * @return SyncInvoker<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse>
     */
    public SyncInvoker<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> listMonitorIndicatorDataInvoker(
        ListMonitorIndicatorDataRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listMonitorIndicatorData, hcClient);
    }

    /**
     * 查询性能监控指标
     *
     * 查询性能监控指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorIndicatorsRequest 请求对象
     * @return ListMonitorIndicatorsResponse
     */
    public ListMonitorIndicatorsResponse listMonitorIndicators(ListMonitorIndicatorsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listMonitorIndicators);
    }

    /**
     * 查询性能监控指标
     *
     * 查询性能监控指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorIndicatorsRequest 请求对象
     * @return SyncInvoker<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse>
     */
    public SyncInvoker<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> listMonitorIndicatorsInvoker(
        ListMonitorIndicatorsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listMonitorIndicators, hcClient);
    }

    /**
     * 查询规格信息
     *
     * 该接口用于查询所有GaussDB(DWS)服务支持的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeTypesRequest 请求对象
     * @return ListNodeTypesResponse
     */
    public ListNodeTypesResponse listNodeTypes(ListNodeTypesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listNodeTypes);
    }

    /**
     * 查询规格信息
     *
     * 该接口用于查询所有GaussDB(DWS)服务支持的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeTypesRequest 请求对象
     * @return SyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>
     */
    public SyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypesInvoker(ListNodeTypesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listNodeTypes, hcClient);
    }

    /**
     * 查看计划执行日志
     *
     * 查看计划执行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlanExecLogsRequest 请求对象
     * @return ListPlanExecLogsResponse
     */
    public ListPlanExecLogsResponse listPlanExecLogs(ListPlanExecLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listPlanExecLogs);
    }

    /**
     * 查看计划执行日志
     *
     * 查看计划执行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlanExecLogsRequest 请求对象
     * @return SyncInvoker<ListPlanExecLogsRequest, ListPlanExecLogsResponse>
     */
    public SyncInvoker<ListPlanExecLogsRequest, ListPlanExecLogsResponse> listPlanExecLogsInvoker(
        ListPlanExecLogsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listPlanExecLogs, hcClient);
    }

    /**
     * 查询SQL列表
     *
     * 该接口用于查询实时SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueriesRequest 请求对象
     * @return ListQueriesResponse
     */
    public ListQueriesResponse listQueries(ListQueriesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listQueries);
    }

    /**
     * 查询SQL列表
     *
     * 该接口用于查询实时SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueriesRequest 请求对象
     * @return SyncInvoker<ListQueriesRequest, ListQueriesResponse>
     */
    public SyncInvoker<ListQueriesRequest, ListQueriesResponse> listQueriesInvoker(ListQueriesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listQueries, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDB(DWS)服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDB(DWS)服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listQuotas, hcClient);
    }

    /**
     * 获取待重分布表所属模式信息
     *
     * 获取待重分布表所属模式信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedistributionSchemaRequest 请求对象
     * @return ListRedistributionSchemaResponse
     */
    public ListRedistributionSchemaResponse listRedistributionSchema(ListRedistributionSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listRedistributionSchema);
    }

    /**
     * 获取待重分布表所属模式信息
     *
     * 获取待重分布表所属模式信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedistributionSchemaRequest 请求对象
     * @return SyncInvoker<ListRedistributionSchemaRequest, ListRedistributionSchemaResponse>
     */
    public SyncInvoker<ListRedistributionSchemaRequest, ListRedistributionSchemaResponse> listRedistributionSchemaInvoker(
        ListRedistributionSchemaRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listRedistributionSchema, hcClient);
    }

    /**
     * 查询集群模式空间信息
     *
     * 查询集群模式空间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return ListSchemasResponse
     */
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSchemas);
    }

    /**
     * 查询集群模式空间信息
     *
     * 查询集群模式空间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return SyncInvoker<ListSchemasRequest, ListSchemasResponse>
     */
    public SyncInvoker<ListSchemasRequest, ListSchemasResponse> listSchemasInvoker(ListSchemasRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSchemas, hcClient);
    }

    /**
     * 获取跨区域快照可用region
     *
     * 该接口用于获取跨区域快照可用局点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotCrossRegionRequest 请求对象
     * @return ListSnapshotCrossRegionResponse
     */
    public ListSnapshotCrossRegionResponse listSnapshotCrossRegion(ListSnapshotCrossRegionRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotCrossRegion);
    }

    /**
     * 获取跨区域快照可用region
     *
     * 该接口用于获取跨区域快照可用局点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotCrossRegionRequest 请求对象
     * @return SyncInvoker<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse>
     */
    public SyncInvoker<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse> listSnapshotCrossRegionInvoker(
        ListSnapshotCrossRegionRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSnapshotCrossRegion, hcClient);
    }

    /**
     * 查询所有跨区域快照配置
     *
     * 该接口用于查询所有跨区域快照配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotCrossRegionPolicyRequest 请求对象
     * @return ListSnapshotCrossRegionPolicyResponse
     */
    public ListSnapshotCrossRegionPolicyResponse listSnapshotCrossRegionPolicy(
        ListSnapshotCrossRegionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotCrossRegionPolicy);
    }

    /**
     * 查询所有跨区域快照配置
     *
     * 该接口用于查询所有跨区域快照配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotCrossRegionPolicyRequest 请求对象
     * @return SyncInvoker<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse>
     */
    public SyncInvoker<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse> listSnapshotCrossRegionPolicyInvoker(
        ListSnapshotCrossRegionPolicyRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSnapshotCrossRegionPolicy, hcClient);
    }

    /**
     * 查询快照详情
     *
     * 该接口用于使用快照ID查询快照详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotDetailsRequest 请求对象
     * @return ListSnapshotDetailsResponse
     */
    public ListSnapshotDetailsResponse listSnapshotDetails(ListSnapshotDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotDetails);
    }

    /**
     * 查询快照详情
     *
     * 该接口用于使用快照ID查询快照详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotDetailsRequest 请求对象
     * @return SyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>
     */
    public SyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetailsInvoker(
        ListSnapshotDetailsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSnapshotDetails, hcClient);
    }

    /**
     * 根据快照ID查询规格信息
     *
     * 根据快照ID查询规格信息。支持用来查询某个快照的规格信息，或者快照可恢复到的目标规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotFlavorInfoRequest 请求对象
     * @return ListSnapshotFlavorInfoResponse
     */
    public ListSnapshotFlavorInfoResponse listSnapshotFlavorInfo(ListSnapshotFlavorInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotFlavorInfo);
    }

    /**
     * 根据快照ID查询规格信息
     *
     * 根据快照ID查询规格信息。支持用来查询某个快照的规格信息，或者快照可恢复到的目标规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotFlavorInfoRequest 请求对象
     * @return SyncInvoker<ListSnapshotFlavorInfoRequest, ListSnapshotFlavorInfoResponse>
     */
    public SyncInvoker<ListSnapshotFlavorInfoRequest, ListSnapshotFlavorInfoResponse> listSnapshotFlavorInfoInvoker(
        ListSnapshotFlavorInfoRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSnapshotFlavorInfo, hcClient);
    }

    /**
     * 查询快照策略
     *
     * 查询快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotPolicyRequest 请求对象
     * @return ListSnapshotPolicyResponse
     */
    public ListSnapshotPolicyResponse listSnapshotPolicy(ListSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotPolicy);
    }

    /**
     * 查询快照策略
     *
     * 查询快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse>
     */
    public SyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> listSnapshotPolicyInvoker(
        ListSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSnapshotPolicy, hcClient);
    }

    /**
     * 快照统计信息
     *
     * 快照统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotStatisticsRequest 请求对象
     * @return ListSnapshotStatisticsResponse
     */
    public ListSnapshotStatisticsResponse listSnapshotStatistics(ListSnapshotStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotStatistics);
    }

    /**
     * 快照统计信息
     *
     * 快照统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotStatisticsRequest 请求对象
     * @return SyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse>
     */
    public SyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> listSnapshotStatisticsInvoker(
        ListSnapshotStatisticsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSnapshotStatistics, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSnapshots, hcClient);
    }

    /**
     * 查询资源统计信息列表
     *
     * 查询当前可用资源数量，其中包括“可用集群和总集群（个）”、“可用节点和总节点（个）”、“总容量（GB）”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsRequest 请求对象
     * @return ListStatisticsResponse
     */
    public ListStatisticsResponse listStatistics(ListStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listStatistics);
    }

    /**
     * 查询资源统计信息列表
     *
     * 查询当前可用资源数量，其中包括“可用集群和总集群（个）”、“可用节点和总节点（个）”、“总容量（GB）”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsRequest 请求对象
     * @return SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public SyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsInvoker(
        ListStatisticsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listStatistics, hcClient);
    }

    /**
     * 查询身份源同步记录
     *
     * 查询身份源同步记录。
     * **约束限制**：
     * 该功能在页面默认未开放给所有用户，当特性开启且有同步记录时查询才有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncRecordsRequest 请求对象
     * @return ListSyncRecordsResponse
     */
    public ListSyncRecordsResponse listSyncRecords(ListSyncRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSyncRecords);
    }

    /**
     * 查询身份源同步记录
     *
     * 查询身份源同步记录。
     * **约束限制**：
     * 该功能在页面默认未开放给所有用户，当特性开启且有同步记录时查询才有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncRecordsRequest 请求对象
     * @return SyncInvoker<ListSyncRecordsRequest, ListSyncRecordsResponse>
     */
    public SyncInvoker<ListSyncRecordsRequest, ListSyncRecordsResponse> listSyncRecordsInvoker(
        ListSyncRecordsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listSyncRecords, hcClient);
    }

    /**
     * 查询表倾斜或脏页率信息
     *
     * 该接口用于查询表倾斜或脏页率信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTablesStatisticRequest 请求对象
     * @return ListTablesStatisticResponse
     */
    public ListTablesStatisticResponse listTablesStatistic(ListTablesStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listTablesStatistic);
    }

    /**
     * 查询表倾斜或脏页率信息
     *
     * 该接口用于查询表倾斜或脏页率信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTablesStatisticRequest 请求对象
     * @return SyncInvoker<ListTablesStatisticRequest, ListTablesStatisticResponse>
     */
    public SyncInvoker<ListTablesStatisticRequest, ListTablesStatisticResponse> listTablesStatisticInvoker(
        ListTablesStatisticRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listTablesStatistic, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listTags, hcClient);
    }

    /**
     * 查询集群企业项目信息
     *
     * 查询指定集群的企业项目信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsForResourceRequest 请求对象
     * @return ListTagsForResourceResponse
     */
    public ListTagsForResourceResponse listTagsForResource(ListTagsForResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listTagsForResource);
    }

    /**
     * 查询集群企业项目信息
     *
     * 查询指定集群的企业项目信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsForResourceRequest 请求对象
     * @return SyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse>
     */
    public SyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse> listTagsForResourceInvoker(
        ListTagsForResourceRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listTagsForResource, hcClient);
    }

    /**
     * 查询支持变更的目标规格列表
     *
     * 查询支持变更的目标规格列表。接口返回的规格列表最多为20条。
     * **约束限制**：
     * 无cluster_id时：可查询所有支持转换的目标规格，但是由于配额等原因，部分规格可能存在售罄无法使用。
     * 存在cluster_id时：会自动关联此集群所在可用区下的配额充足的目标规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetFlavorsRequest 请求对象
     * @return ListTargetFlavorsResponse
     */
    public ListTargetFlavorsResponse listTargetFlavors(ListTargetFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listTargetFlavors);
    }

    /**
     * 查询支持变更的目标规格列表
     *
     * 查询支持变更的目标规格列表。接口返回的规格列表最多为20条。
     * **约束限制**：
     * 无cluster_id时：可查询所有支持转换的目标规格，但是由于配额等原因，部分规格可能存在售罄无法使用。
     * 存在cluster_id时：会自动关联此集群所在可用区下的配额充足的目标规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetFlavorsRequest 请求对象
     * @return SyncInvoker<ListTargetFlavorsRequest, ListTargetFlavorsResponse>
     */
    public SyncInvoker<ListTargetFlavorsRequest, ListTargetFlavorsResponse> listTargetFlavorsInvoker(
        ListTargetFlavorsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listTargetFlavors, hcClient);
    }

    /**
     * 查询集群拓扑ring环节点信息
     *
     * 查询集群拓扑ring环节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopoRingsRequest 请求对象
     * @return ListTopoRingsResponse
     */
    public ListTopoRingsResponse listTopoRings(ListTopoRingsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listTopoRings);
    }

    /**
     * 查询集群拓扑ring环节点信息
     *
     * 查询集群拓扑ring环节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopoRingsRequest 请求对象
     * @return SyncInvoker<ListTopoRingsRequest, ListTopoRingsResponse>
     */
    public SyncInvoker<ListTopoRingsRequest, ListTopoRingsResponse> listTopoRingsInvoker(ListTopoRingsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listTopoRings, hcClient);
    }

    /**
     * 获取集群可升级的目标版本
     *
     * 获取集群可升级的目标版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdatableVersionRequest 请求对象
     * @return ListUpdatableVersionResponse
     */
    public ListUpdatableVersionResponse listUpdatableVersion(ListUpdatableVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listUpdatableVersion);
    }

    /**
     * 获取集群可升级的目标版本
     *
     * 获取集群可升级的目标版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdatableVersionRequest 请求对象
     * @return SyncInvoker<ListUpdatableVersionRequest, ListUpdatableVersionResponse>
     */
    public SyncInvoker<ListUpdatableVersionRequest, ListUpdatableVersionResponse> listUpdatableVersionInvoker(
        ListUpdatableVersionRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listUpdatableVersion, hcClient);
    }

    /**
     * 获取集群升级记录
     *
     * 通过此接口获取当前集群升级记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdateRecordRequest 请求对象
     * @return ListUpdateRecordResponse
     */
    public ListUpdateRecordResponse listUpdateRecord(ListUpdateRecordRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listUpdateRecord);
    }

    /**
     * 获取集群升级记录
     *
     * 通过此接口获取当前集群升级记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdateRecordRequest 请求对象
     * @return SyncInvoker<ListUpdateRecordRequest, ListUpdateRecordResponse>
     */
    public SyncInvoker<ListUpdateRecordRequest, ListUpdateRecordResponse> listUpdateRecordInvoker(
        ListUpdateRecordRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listUpdateRecord, hcClient);
    }

    /**
     * 查询资源管理计划列表
     *
     * 查询集群中所有资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadPlansRequest 请求对象
     * @return ListWorkloadPlansResponse
     */
    public ListWorkloadPlansResponse listWorkloadPlans(ListWorkloadPlansRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listWorkloadPlans);
    }

    /**
     * 查询资源管理计划列表
     *
     * 查询集群中所有资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadPlansRequest 请求对象
     * @return SyncInvoker<ListWorkloadPlansRequest, ListWorkloadPlansResponse>
     */
    public SyncInvoker<ListWorkloadPlansRequest, ListWorkloadPlansResponse> listWorkloadPlansInvoker(
        ListWorkloadPlansRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listWorkloadPlans, hcClient);
    }

    /**
     * 查询资源池
     *
     * 查询资源池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadQueueRequest 请求对象
     * @return ListWorkloadQueueResponse
     */
    public ListWorkloadQueueResponse listWorkloadQueue(ListWorkloadQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listWorkloadQueue);
    }

    /**
     * 查询资源池
     *
     * 查询资源池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadQueueRequest 请求对象
     * @return SyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse>
     */
    public SyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse> listWorkloadQueueInvoker(
        ListWorkloadQueueRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listWorkloadQueue, hcClient);
    }

    /**
     * 获得资源池的绑定用户列表
     *
     * 获得资源池的绑定用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadQueueUsersRequest 请求对象
     * @return ListWorkloadQueueUsersResponse
     */
    public ListWorkloadQueueUsersResponse listWorkloadQueueUsers(ListWorkloadQueueUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listWorkloadQueueUsers);
    }

    /**
     * 获得资源池的绑定用户列表
     *
     * 获得资源池的绑定用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadQueueUsersRequest 请求对象
     * @return SyncInvoker<ListWorkloadQueueUsersRequest, ListWorkloadQueueUsersResponse>
     */
    public SyncInvoker<ListWorkloadQueueUsersRequest, ListWorkloadQueueUsersResponse> listWorkloadQueueUsersInvoker(
        ListWorkloadQueueUsersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listWorkloadQueueUsers, hcClient);
    }

    /**
     * 查询当前集群的异常规则列表
     *
     * 查询当前集群的异常规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadRulesRequest 请求对象
     * @return ListWorkloadRulesResponse
     */
    public ListWorkloadRulesResponse listWorkloadRules(ListWorkloadRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listWorkloadRules);
    }

    /**
     * 查询当前集群的异常规则列表
     *
     * 查询当前集群的异常规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadRulesRequest 请求对象
     * @return SyncInvoker<ListWorkloadRulesRequest, ListWorkloadRulesResponse>
     */
    public SyncInvoker<ListWorkloadRulesRequest, ListWorkloadRulesResponse> listWorkloadRulesInvoker(
        ListWorkloadRulesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.listWorkloadRules, hcClient);
    }

    /**
     * 修改集群名称
     *
     * 修改集群名称。
     * **约束限制**：
     * guestAgent插件版本8.3.1及以上才支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyClusterNameRequest 请求对象
     * @return ModifyClusterNameResponse
     */
    public ModifyClusterNameResponse modifyClusterName(ModifyClusterNameRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.modifyClusterName);
    }

    /**
     * 修改集群名称
     *
     * 修改集群名称。
     * **约束限制**：
     * guestAgent插件版本8.3.1及以上才支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyClusterNameRequest 请求对象
     * @return SyncInvoker<ModifyClusterNameRequest, ModifyClusterNameResponse>
     */
    public SyncInvoker<ModifyClusterNameRequest, ModifyClusterNameResponse> modifyClusterNameInvoker(
        ModifyClusterNameRequest request) {
        return new SyncInvoker<>(request, DwsMeta.modifyClusterName, hcClient);
    }

    /**
     * 修改集群时区
     *
     * 修改集群时区。该操作会将操作系统及数据库的时区都进行修改。
     * **约束限制**：
     * 修改时区依赖集群安装的guestAgent插件，插件版本在8.3.0.202及以上支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyClusterTimezoneRequest 请求对象
     * @return ModifyClusterTimezoneResponse
     */
    public ModifyClusterTimezoneResponse modifyClusterTimezone(ModifyClusterTimezoneRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.modifyClusterTimezone);
    }

    /**
     * 修改集群时区
     *
     * 修改集群时区。该操作会将操作系统及数据库的时区都进行修改。
     * **约束限制**：
     * 修改时区依赖集群安装的guestAgent插件，插件版本在8.3.0.202及以上支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyClusterTimezoneRequest 请求对象
     * @return SyncInvoker<ModifyClusterTimezoneRequest, ModifyClusterTimezoneResponse>
     */
    public SyncInvoker<ModifyClusterTimezoneRequest, ModifyClusterTimezoneResponse> modifyClusterTimezoneInvoker(
        ModifyClusterTimezoneRequest request) {
        return new SyncInvoker<>(request, DwsMeta.modifyClusterTimezone, hcClient);
    }

    /**
     * 停止容灾
     *
     * 该接口用于停止容灾操作。
     * 容灾状态为“运行中”和“停止失败”时可以执行停止容灾操作。
     * 停止后，将无法进行数据同步，请谨慎操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseDisasterRecoveryRequest 请求对象
     * @return PauseDisasterRecoveryResponse
     */
    public PauseDisasterRecoveryResponse pauseDisasterRecovery(PauseDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.pauseDisasterRecovery);
    }

    /**
     * 停止容灾
     *
     * 该接口用于停止容灾操作。
     * 容灾状态为“运行中”和“停止失败”时可以执行停止容灾操作。
     * 停止后，将无法进行数据同步，请谨慎操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse>
     */
    public SyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> pauseDisasterRecoveryInvoker(
        PauseDisasterRecoveryRequest request) {
        return new SyncInvoker<>(request, DwsMeta.pauseDisasterRecovery, hcClient);
    }

    /**
     * 重置密码
     *
     * 重置集群管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 重置集群管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<>(request, DwsMeta.resetPassword, hcClient);
    }

    /**
     * 扩容集群
     *
     * 扩容集群，亦可用于添加空闲节点。默认情况下：表示执行扩容操作。
     * 通过create_node_only字段用以区分当前是**扩容**、**添加空闲节点**：
     * - true：仅添加空闲节点
     * - false：表示执行扩容操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClusterRequest 请求对象
     * @return ResizeClusterResponse
     */
    public ResizeClusterResponse resizeCluster(ResizeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.resizeCluster);
    }

    /**
     * 扩容集群
     *
     * 扩容集群，亦可用于添加空闲节点。默认情况下：表示执行扩容操作。
     * 通过create_node_only字段用以区分当前是**扩容**、**添加空闲节点**：
     * - true：仅添加空闲节点
     * - false：表示执行扩容操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClusterRequest 请求对象
     * @return SyncInvoker<ResizeClusterRequest, ResizeClusterResponse>
     */
    public SyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterInvoker(ResizeClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.resizeCluster, hcClient);
    }

    /**
     * 从空闲节点扩容
     *
     * 从空闲节点扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClusterWithExistedNodesRequest 请求对象
     * @return ResizeClusterWithExistedNodesResponse
     */
    public ResizeClusterWithExistedNodesResponse resizeClusterWithExistedNodes(
        ResizeClusterWithExistedNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.resizeClusterWithExistedNodes);
    }

    /**
     * 从空闲节点扩容
     *
     * 从空闲节点扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClusterWithExistedNodesRequest 请求对象
     * @return SyncInvoker<ResizeClusterWithExistedNodesRequest, ResizeClusterWithExistedNodesResponse>
     */
    public SyncInvoker<ResizeClusterWithExistedNodesRequest, ResizeClusterWithExistedNodesResponse> resizeClusterWithExistedNodesInvoker(
        ResizeClusterWithExistedNodesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.resizeClusterWithExistedNodes, hcClient);
    }

    /**
     * 重启集群
     *
     * 重启集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return RestartClusterResponse
     */
    public RestartClusterResponse restartCluster(RestartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 重启集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return SyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public SyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterInvoker(
        RestartClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.restartCluster, hcClient);
    }

    /**
     * 重启逻辑集群
     *
     * 重启逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartLogicalClusterRequest 请求对象
     * @return RestartLogicalClusterResponse
     */
    public RestartLogicalClusterResponse restartLogicalCluster(RestartLogicalClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restartLogicalCluster);
    }

    /**
     * 重启逻辑集群
     *
     * 重启逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartLogicalClusterRequest 请求对象
     * @return SyncInvoker<RestartLogicalClusterRequest, RestartLogicalClusterResponse>
     */
    public SyncInvoker<RestartLogicalClusterRequest, RestartLogicalClusterResponse> restartLogicalClusterInvoker(
        RestartLogicalClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.restartLogicalCluster, hcClient);
    }

    /**
     * 恢复集群
     *
     * 该接口用于使用快照恢复集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreClusterRequest 请求对象
     * @return RestoreClusterResponse
     */
    public RestoreClusterResponse restoreCluster(RestoreClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restoreCluster);
    }

    /**
     * 恢复集群
     *
     * 该接口用于使用快照恢复集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreClusterRequest 请求对象
     * @return SyncInvoker<RestoreClusterRequest, RestoreClusterResponse>
     */
    public SyncInvoker<RestoreClusterRequest, RestoreClusterResponse> restoreClusterInvoker(
        RestoreClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.restoreCluster, hcClient);
    }

    /**
     * 恢复容灾
     *
     * 该接口用于主备集群进行异常切换，备集群恢复可用状态后进行的容灾恢复操作。
     * 容灾恢复仅8.1.2及以上集群版本支持。
     * 容灾恢复会删除灾备集群数据与新生产集群重新建立容灾关系。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreDisasterRequest 请求对象
     * @return RestoreDisasterResponse
     */
    public RestoreDisasterResponse restoreDisaster(RestoreDisasterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restoreDisaster);
    }

    /**
     * 恢复容灾
     *
     * 该接口用于主备集群进行异常切换，备集群恢复可用状态后进行的容灾恢复操作。
     * 容灾恢复仅8.1.2及以上集群版本支持。
     * 容灾恢复会删除灾备集群数据与新生产集群重新建立容灾关系。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreDisasterRequest 请求对象
     * @return SyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse>
     */
    public SyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse> restoreDisasterInvoker(
        RestoreDisasterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.restoreDisaster, hcClient);
    }

    /**
     * 恢复重分布
     *
     * 恢复暂停状态下的重分布操作，仅支持DWS2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRedistributionRequest 请求对象
     * @return RestoreRedistributionResponse
     */
    public RestoreRedistributionResponse restoreRedistribution(RestoreRedistributionRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restoreRedistribution);
    }

    /**
     * 恢复重分布
     *
     * 恢复暂停状态下的重分布操作，仅支持DWS2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRedistributionRequest 请求对象
     * @return SyncInvoker<RestoreRedistributionRequest, RestoreRedistributionResponse>
     */
    public SyncInvoker<RestoreRedistributionRequest, RestoreRedistributionResponse> restoreRedistributionInvoker(
        RestoreRedistributionRequest request) {
        return new SyncInvoker<>(request, DwsMeta.restoreRedistribution, hcClient);
    }

    /**
     * 恢复表
     *
     * 该接口用于恢复表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreTableRequest 请求对象
     * @return RestoreTableResponse
     */
    public RestoreTableResponse restoreTable(RestoreTableRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restoreTable);
    }

    /**
     * 恢复表
     *
     * 该接口用于恢复表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreTableRequest 请求对象
     * @return SyncInvoker<RestoreTableRequest, RestoreTableResponse>
     */
    public SyncInvoker<RestoreTableRequest, RestoreTableResponse> restoreTableInvoker(RestoreTableRequest request) {
        return new SyncInvoker<>(request, DwsMeta.restoreTable, hcClient);
    }

    /**
     * 轮转密钥
     *
     * 轮转加密集群密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RotateKeyRequest 请求对象
     * @return RotateKeyResponse
     */
    public RotateKeyResponse rotateKey(RotateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.rotateKey);
    }

    /**
     * 轮转密钥
     *
     * 轮转加密集群密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RotateKeyRequest 请求对象
     * @return SyncInvoker<RotateKeyRequest, RotateKeyResponse>
     */
    public SyncInvoker<RotateKeyRequest, RotateKeyResponse> rotateKeyInvoker(RotateKeyRequest request) {
        return new SyncInvoker<>(request, DwsMeta.rotateKey, hcClient);
    }

    /**
     * 修改集群描述信息
     *
     * 修改集群描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveClusterDescriptionInfoRequest 请求对象
     * @return SaveClusterDescriptionInfoResponse
     */
    public SaveClusterDescriptionInfoResponse saveClusterDescriptionInfo(SaveClusterDescriptionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.saveClusterDescriptionInfo);
    }

    /**
     * 修改集群描述信息
     *
     * 修改集群描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveClusterDescriptionInfoRequest 请求对象
     * @return SyncInvoker<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse>
     */
    public SyncInvoker<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse> saveClusterDescriptionInfoInvoker(
        SaveClusterDescriptionInfoRequest request) {
        return new SyncInvoker<>(request, DwsMeta.saveClusterDescriptionInfo, hcClient);
    }

    /**
     * 更新重分布表优先级
     *
     * 更新重分布表优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRedistributionPriorityRequest 请求对象
     * @return SetRedistributionPriorityResponse
     */
    public SetRedistributionPriorityResponse setRedistributionPriority(SetRedistributionPriorityRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.setRedistributionPriority);
    }

    /**
     * 更新重分布表优先级
     *
     * 更新重分布表优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRedistributionPriorityRequest 请求对象
     * @return SyncInvoker<SetRedistributionPriorityRequest, SetRedistributionPriorityResponse>
     */
    public SyncInvoker<SetRedistributionPriorityRequest, SetRedistributionPriorityResponse> setRedistributionPriorityInvoker(
        SetRedistributionPriorityRequest request) {
        return new SyncInvoker<>(request, DwsMeta.setRedistributionPriority, hcClient);
    }

    /**
     * 获取集群加密信息
     *
     * 获取集群加密信息。非加密集群不支持该功能，返回信息为空。
     * **约束限制**：
     * 转加密集群起始支持版本：8.0.0
     * 转加密集群guestAgent起始支持版本：8.3.0.200
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterEncryptInfoRequest 请求对象
     * @return ShowClusterEncryptInfoResponse
     */
    public ShowClusterEncryptInfoResponse showClusterEncryptInfo(ShowClusterEncryptInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showClusterEncryptInfo);
    }

    /**
     * 获取集群加密信息
     *
     * 获取集群加密信息。非加密集群不支持该功能，返回信息为空。
     * **约束限制**：
     * 转加密集群起始支持版本：8.0.0
     * 转加密集群guestAgent起始支持版本：8.3.0.200
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterEncryptInfoRequest 请求对象
     * @return SyncInvoker<ShowClusterEncryptInfoRequest, ShowClusterEncryptInfoResponse>
     */
    public SyncInvoker<ShowClusterEncryptInfoRequest, ShowClusterEncryptInfoResponse> showClusterEncryptInfoInvoker(
        ShowClusterEncryptInfoRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showClusterEncryptInfo, hcClient);
    }

    /**
     * 查询集群规格详情
     *
     * 查询集群使用的规格详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterFlavorRequest 请求对象
     * @return ShowClusterFlavorResponse
     */
    public ShowClusterFlavorResponse showClusterFlavor(ShowClusterFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showClusterFlavor);
    }

    /**
     * 查询集群规格详情
     *
     * 查询集群使用的规格详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterFlavorRequest 请求对象
     * @return SyncInvoker<ShowClusterFlavorRequest, ShowClusterFlavorResponse>
     */
    public SyncInvoker<ShowClusterFlavorRequest, ShowClusterFlavorResponse> showClusterFlavorInvoker(
        ShowClusterFlavorRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showClusterFlavor, hcClient);
    }

    /**
     * 查询重分布详情
     *
     * 该接口用于查看当前集群的重分布模式、重分布进度、数据表重分布详情等监控信息。
     * 查看重分布详情功能DWS 2.0 8.1.1.200及以上集群版本支持，其中数据表重分布进度详情仅DWS 2.0 8.2.1及以上集群版本支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRedistributionRequest 请求对象
     * @return ShowClusterRedistributionResponse
     */
    public ShowClusterRedistributionResponse showClusterRedistribution(ShowClusterRedistributionRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showClusterRedistribution);
    }

    /**
     * 查询重分布详情
     *
     * 该接口用于查看当前集群的重分布模式、重分布进度、数据表重分布详情等监控信息。
     * 查看重分布详情功能DWS 2.0 8.1.1.200及以上集群版本支持，其中数据表重分布进度详情仅DWS 2.0 8.2.1及以上集群版本支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRedistributionRequest 请求对象
     * @return SyncInvoker<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse>
     */
    public SyncInvoker<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse> showClusterRedistributionInvoker(
        ShowClusterRedistributionRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showClusterRedistribution, hcClient);
    }

    /**
     * 查询磁盘扩容范围
     *
     * 此接口可用于查看磁盘扩容操作时支持的扩容范围。
     * **约束限制**：
     * 磁盘扩容功能仅8.1.1.203及以上版本支持，并且创建集群规格需要为云数仓SSD云盘或实时数仓类型。
     * 按需+折扣套餐包消费模式下，存储扩容后超出折扣套餐包部分将按需收费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterStorageExpandRangeRequest 请求对象
     * @return ShowClusterStorageExpandRangeResponse
     */
    public ShowClusterStorageExpandRangeResponse showClusterStorageExpandRange(
        ShowClusterStorageExpandRangeRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showClusterStorageExpandRange);
    }

    /**
     * 查询磁盘扩容范围
     *
     * 此接口可用于查看磁盘扩容操作时支持的扩容范围。
     * **约束限制**：
     * 磁盘扩容功能仅8.1.1.203及以上版本支持，并且创建集群规格需要为云数仓SSD云盘或实时数仓类型。
     * 按需+折扣套餐包消费模式下，存储扩容后超出折扣套餐包部分将按需收费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterStorageExpandRangeRequest 请求对象
     * @return SyncInvoker<ShowClusterStorageExpandRangeRequest, ShowClusterStorageExpandRangeResponse>
     */
    public SyncInvoker<ShowClusterStorageExpandRangeRequest, ShowClusterStorageExpandRangeResponse> showClusterStorageExpandRangeInvoker(
        ShowClusterStorageExpandRangeRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showClusterStorageExpandRange, hcClient);
    }

    /**
     * 查询磁盘使用情况
     *
     * 查询租户侧节点磁盘使用情况信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterVolumeRequest 请求对象
     * @return ShowClusterVolumeResponse
     */
    public ShowClusterVolumeResponse showClusterVolume(ShowClusterVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showClusterVolume);
    }

    /**
     * 查询磁盘使用情况
     *
     * 查询租户侧节点磁盘使用情况信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterVolumeRequest 请求对象
     * @return SyncInvoker<ShowClusterVolumeRequest, ShowClusterVolumeResponse>
     */
    public SyncInvoker<ShowClusterVolumeRequest, ShowClusterVolumeResponse> showClusterVolumeInvoker(
        ShowClusterVolumeRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showClusterVolume, hcClient);
    }

    /**
     * 查询集群列表V2
     *
     * 该接口用于查询并显示集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClustersRequest 请求对象
     * @return ShowClustersResponse
     */
    public ShowClustersResponse showClusters(ShowClustersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showClusters);
    }

    /**
     * 查询集群列表V2
     *
     * 该接口用于查询并显示集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClustersRequest 请求对象
     * @return SyncInvoker<ShowClustersRequest, ShowClustersResponse>
     */
    public SyncInvoker<ShowClustersRequest, ShowClustersResponse> showClustersInvoker(ShowClustersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showClusters, hcClient);
    }

    /**
     * 查询数据库对象权限
     *
     * 查询数据库对象权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseAuthorityRequest 请求对象
     * @return ShowDatabaseAuthorityResponse
     */
    public ShowDatabaseAuthorityResponse showDatabaseAuthority(ShowDatabaseAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showDatabaseAuthority);
    }

    /**
     * 查询数据库对象权限
     *
     * 查询数据库对象权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseAuthorityRequest 请求对象
     * @return SyncInvoker<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse>
     */
    public SyncInvoker<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> showDatabaseAuthorityInvoker(
        ShowDatabaseAuthorityRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showDatabaseAuthority, hcClient);
    }

    /**
     * 获得集群运维账户状态
     *
     * 获得数据库运维账户状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseOmUserStatusRequest 请求对象
     * @return ShowDatabaseOmUserStatusResponse
     */
    public ShowDatabaseOmUserStatusResponse showDatabaseOmUserStatus(ShowDatabaseOmUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showDatabaseOmUserStatus);
    }

    /**
     * 获得集群运维账户状态
     *
     * 获得数据库运维账户状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseOmUserStatusRequest 请求对象
     * @return SyncInvoker<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse>
     */
    public SyncInvoker<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse> showDatabaseOmUserStatusInvoker(
        ShowDatabaseOmUserStatusRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showDatabaseOmUserStatus, hcClient);
    }

    /**
     * 查询指定用户信息
     *
     * 查询指定用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseUserRequest 请求对象
     * @return ShowDatabaseUserResponse
     */
    public ShowDatabaseUserResponse showDatabaseUser(ShowDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showDatabaseUser);
    }

    /**
     * 查询指定用户信息
     *
     * 查询指定用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseUserRequest 请求对象
     * @return SyncInvoker<ShowDatabaseUserRequest, ShowDatabaseUserResponse>
     */
    public SyncInvoker<ShowDatabaseUserRequest, ShowDatabaseUserResponse> showDatabaseUserInvoker(
        ShowDatabaseUserRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showDatabaseUser, hcClient);
    }

    /**
     * 查询容灾详情
     *
     * 该接口用于查询单个容灾详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterDetailRequest 请求对象
     * @return ShowDisasterDetailResponse
     */
    public ShowDisasterDetailResponse showDisasterDetail(ShowDisasterDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showDisasterDetail);
    }

    /**
     * 查询容灾详情
     *
     * 该接口用于查询单个容灾详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterDetailRequest 请求对象
     * @return SyncInvoker<ShowDisasterDetailRequest, ShowDisasterDetailResponse>
     */
    public SyncInvoker<ShowDisasterDetailRequest, ShowDisasterDetailResponse> showDisasterDetailInvoker(
        ShowDisasterDetailRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showDisasterDetail, hcClient);
    }

    /**
     * 查询容灾进度详情
     *
     * 该接口用于查询容灾进度详情信息操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterProgressRequest 请求对象
     * @return ShowDisasterProgressResponse
     */
    public ShowDisasterProgressResponse showDisasterProgress(ShowDisasterProgressRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showDisasterProgress);
    }

    /**
     * 查询容灾进度详情
     *
     * 该接口用于查询容灾进度详情信息操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterProgressRequest 请求对象
     * @return SyncInvoker<ShowDisasterProgressRequest, ShowDisasterProgressResponse>
     */
    public SyncInvoker<ShowDisasterProgressRequest, ShowDisasterProgressResponse> showDisasterProgressInvoker(
        ShowDisasterProgressRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showDisasterProgress, hcClient);
    }

    /**
     * 查询单个实例
     *
     * 查询单个实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showInstance);
    }

    /**
     * 查询单个实例
     *
     * 查询单个实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showInstance, hcClient);
    }

    /**
     * 查询SQL执行信息
     *
     * 查询SQL执行信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueryDetailRequest 请求对象
     * @return ShowQueryDetailResponse
     */
    public ShowQueryDetailResponse showQueryDetail(ShowQueryDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showQueryDetail);
    }

    /**
     * 查询SQL执行信息
     *
     * 查询SQL执行信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueryDetailRequest 请求对象
     * @return SyncInvoker<ShowQueryDetailRequest, ShowQueryDetailResponse>
     */
    public SyncInvoker<ShowQueryDetailRequest, ShowQueryDetailResponse> showQueryDetailInvoker(
        ShowQueryDetailRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showQueryDetail, hcClient);
    }

    /**
     * 查询资源统计
     *
     * 该接口用于查询资源统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceStatisticsRequest 请求对象
     * @return ShowResourceStatisticsResponse
     */
    public ShowResourceStatisticsResponse showResourceStatistics(ShowResourceStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showResourceStatistics);
    }

    /**
     * 查询资源统计
     *
     * 该接口用于查询资源统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceStatisticsRequest 请求对象
     * @return SyncInvoker<ShowResourceStatisticsRequest, ShowResourceStatisticsResponse>
     */
    public SyncInvoker<ShowResourceStatisticsRequest, ShowResourceStatisticsResponse> showResourceStatisticsInvoker(
        ShowResourceStatisticsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showResourceStatistics, hcClient);
    }

    /**
     * 查询某个资源管理计划详细信息
     *
     * 查询某个资源管理计划详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadPlanRequest 请求对象
     * @return ShowWorkloadPlanResponse
     */
    public ShowWorkloadPlanResponse showWorkloadPlan(ShowWorkloadPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showWorkloadPlan);
    }

    /**
     * 查询某个资源管理计划详细信息
     *
     * 查询某个资源管理计划详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadPlanRequest 请求对象
     * @return SyncInvoker<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse>
     */
    public SyncInvoker<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse> showWorkloadPlanInvoker(
        ShowWorkloadPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showWorkloadPlan, hcClient);
    }

    /**
     * 查询资源管理计划阶段详细信息
     *
     * 查询资源管理计划阶段详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadPlanStageRequest 请求对象
     * @return ShowWorkloadPlanStageResponse
     */
    public ShowWorkloadPlanStageResponse showWorkloadPlanStage(ShowWorkloadPlanStageRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showWorkloadPlanStage);
    }

    /**
     * 查询资源管理计划阶段详细信息
     *
     * 查询资源管理计划阶段详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadPlanStageRequest 请求对象
     * @return SyncInvoker<ShowWorkloadPlanStageRequest, ShowWorkloadPlanStageResponse>
     */
    public SyncInvoker<ShowWorkloadPlanStageRequest, ShowWorkloadPlanStageResponse> showWorkloadPlanStageInvoker(
        ShowWorkloadPlanStageRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showWorkloadPlanStage, hcClient);
    }

    /**
     * 获得资源池详细信息
     *
     * 获得资源池详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadQueueRequest 请求对象
     * @return ShowWorkloadQueueResponse
     */
    public ShowWorkloadQueueResponse showWorkloadQueue(ShowWorkloadQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.showWorkloadQueue);
    }

    /**
     * 获得资源池详细信息
     *
     * 获得资源池详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadQueueRequest 请求对象
     * @return SyncInvoker<ShowWorkloadQueueRequest, ShowWorkloadQueueResponse>
     */
    public SyncInvoker<ShowWorkloadQueueRequest, ShowWorkloadQueueResponse> showWorkloadQueueInvoker(
        ShowWorkloadQueueRequest request) {
        return new SyncInvoker<>(request, DwsMeta.showWorkloadQueue, hcClient);
    }

    /**
     * 集群缩容
     *
     * 该接口用于缩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkClusterRequest 请求对象
     * @return ShrinkClusterResponse
     */
    public ShrinkClusterResponse shrinkCluster(ShrinkClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.shrinkCluster);
    }

    /**
     * 集群缩容
     *
     * 该接口用于缩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkClusterRequest 请求对象
     * @return SyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>
     */
    public SyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse> shrinkClusterInvoker(ShrinkClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.shrinkCluster, hcClient);
    }

    /**
     * 逻辑集群缩容
     *
     * 逻辑集群缩容，支持从弹性池缩容，或是从逻辑集群中缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkLogicalClusterRequest 请求对象
     * @return ShrinkLogicalClusterResponse
     */
    public ShrinkLogicalClusterResponse shrinkLogicalCluster(ShrinkLogicalClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.shrinkLogicalCluster);
    }

    /**
     * 逻辑集群缩容
     *
     * 逻辑集群缩容，支持从弹性池缩容，或是从逻辑集群中缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkLogicalClusterRequest 请求对象
     * @return SyncInvoker<ShrinkLogicalClusterRequest, ShrinkLogicalClusterResponse>
     */
    public SyncInvoker<ShrinkLogicalClusterRequest, ShrinkLogicalClusterResponse> shrinkLogicalClusterInvoker(
        ShrinkLogicalClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.shrinkLogicalCluster, hcClient);
    }

    /**
     * 启动集群
     *
     * 启动集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartClusterRequest 请求对象
     * @return StartClusterResponse
     */
    public StartClusterResponse startCluster(StartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.startCluster);
    }

    /**
     * 启动集群
     *
     * 启动集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartClusterRequest 请求对象
     * @return SyncInvoker<StartClusterRequest, StartClusterResponse>
     */
    public SyncInvoker<StartClusterRequest, StartClusterResponse> startClusterInvoker(StartClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.startCluster, hcClient);
    }

    /**
     * 启动容灾
     *
     * 该接口用于启动容灾操作。
     * 容灾状态为“未启动”、“启动失败”和“已停止”时可以执行启动容灾操作。
     * 启动容灾后，生产集群和灾备集群将无法进行恢复、扩容、升级、重启、节点替换、更新密码等操作，此外，灾备集群将无法进行备份操作，请谨慎操作。
     * 当容灾启动后，如果灾备集群容灾正常运行且容灾处于恢复状态中，此状态的集群会计费。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDisasterRecoveryRequest 请求对象
     * @return StartDisasterRecoveryResponse
     */
    public StartDisasterRecoveryResponse startDisasterRecovery(StartDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.startDisasterRecovery);
    }

    /**
     * 启动容灾
     *
     * 该接口用于启动容灾操作。
     * 容灾状态为“未启动”、“启动失败”和“已停止”时可以执行启动容灾操作。
     * 启动容灾后，生产集群和灾备集群将无法进行恢复、扩容、升级、重启、节点替换、更新密码等操作，此外，灾备集群将无法进行备份操作，请谨慎操作。
     * 当容灾启动后，如果灾备集群容灾正常运行且容灾处于恢复状态中，此状态的集群会计费。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse>
     */
    public SyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> startDisasterRecoveryInvoker(
        StartDisasterRecoveryRequest request) {
        return new SyncInvoker<>(request, DwsMeta.startDisasterRecovery, hcClient);
    }

    /**
     * 启动资源管理计划
     *
     * 启动资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartWorkloadPlanRequest 请求对象
     * @return StartWorkloadPlanResponse
     */
    public StartWorkloadPlanResponse startWorkloadPlan(StartWorkloadPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.startWorkloadPlan);
    }

    /**
     * 启动资源管理计划
     *
     * 启动资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartWorkloadPlanRequest 请求对象
     * @return SyncInvoker<StartWorkloadPlanRequest, StartWorkloadPlanResponse>
     */
    public SyncInvoker<StartWorkloadPlanRequest, StartWorkloadPlanResponse> startWorkloadPlanInvoker(
        StartWorkloadPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.startWorkloadPlan, hcClient);
    }

    /**
     * 停止集群
     *
     * 停止集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopClusterRequest 请求对象
     * @return StopClusterResponse
     */
    public StopClusterResponse stopCluster(StopClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.stopCluster);
    }

    /**
     * 停止集群
     *
     * 停止集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopClusterRequest 请求对象
     * @return SyncInvoker<StopClusterRequest, StopClusterResponse>
     */
    public SyncInvoker<StopClusterRequest, StopClusterResponse> stopClusterInvoker(StopClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.stopCluster, hcClient);
    }

    /**
     * 暂停重分布
     *
     * 该接口用于暂停运行状态下的重分布操作，重分布暂停状态可设置重分布优先级，修改重分布并发数等操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopRedistributionRequest 请求对象
     * @return StopRedistributionResponse
     */
    public StopRedistributionResponse stopRedistribution(StopRedistributionRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.stopRedistribution);
    }

    /**
     * 暂停重分布
     *
     * 该接口用于暂停运行状态下的重分布操作，重分布暂停状态可设置重分布优先级，修改重分布并发数等操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopRedistributionRequest 请求对象
     * @return SyncInvoker<StopRedistributionRequest, StopRedistributionResponse>
     */
    public SyncInvoker<StopRedistributionRequest, StopRedistributionResponse> stopRedistributionInvoker(
        StopRedistributionRequest request) {
        return new SyncInvoker<>(request, DwsMeta.stopRedistribution, hcClient);
    }

    /**
     * 停止资源管理计划
     *
     * 停止资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopWorkloadPlanRequest 请求对象
     * @return StopWorkloadPlanResponse
     */
    public StopWorkloadPlanResponse stopWorkloadPlan(StopWorkloadPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.stopWorkloadPlan);
    }

    /**
     * 停止资源管理计划
     *
     * 停止资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopWorkloadPlanRequest 请求对象
     * @return SyncInvoker<StopWorkloadPlanRequest, StopWorkloadPlanResponse>
     */
    public SyncInvoker<StopWorkloadPlanRequest, StopWorkloadPlanResponse> stopWorkloadPlanInvoker(
        StopWorkloadPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.stopWorkloadPlan, hcClient);
    }

    /**
     * 容灾异常切换
     *
     * 该接口用于容灾异常场景下进行主备集群切换操作。
     * “异常切换”按钮用于容灾异常或者生产集群故障情况下主备切换操作。
     * 容灾异常切换仅8.1.2及以上集群版本支持。
     * 异常切换会将灾备集群升为主，若原生产集群故障后存在部分数据未同步到灾备集群，那灾备集群升主后将缺少这些数据，切换时请确认容灾最后同步时间，谨慎操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFailoverDisasterRequest 请求对象
     * @return SwitchFailoverDisasterResponse
     */
    public SwitchFailoverDisasterResponse switchFailoverDisaster(SwitchFailoverDisasterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.switchFailoverDisaster);
    }

    /**
     * 容灾异常切换
     *
     * 该接口用于容灾异常场景下进行主备集群切换操作。
     * “异常切换”按钮用于容灾异常或者生产集群故障情况下主备切换操作。
     * 容灾异常切换仅8.1.2及以上集群版本支持。
     * 异常切换会将灾备集群升为主，若原生产集群故障后存在部分数据未同步到灾备集群，那灾备集群升主后将缺少这些数据，切换时请确认容灾最后同步时间，谨慎操作。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFailoverDisasterRequest 请求对象
     * @return SyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse>
     */
    public SyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> switchFailoverDisasterInvoker(
        SwitchFailoverDisasterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.switchFailoverDisaster, hcClient);
    }

    /**
     * 主备恢复
     *
     * 当集群状态为“非均衡”时会出现某些节点主实例增多，从而负载压力较大。这种情况下集群状态是正常的，但整体性能要低于均衡状态。可进行集群主备恢复操作将集群状态切换为“可用”状态。  
     * **约束限制**：
     *  集群主备恢复仅8.1.1.202及以上版本支持。 
     *  集群主备恢复将会短暂中断业务，中断时间根据用户自身业务量所决定，建议用户在业务低峰期执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchOverClusterRequest 请求对象
     * @return SwitchOverClusterResponse
     */
    public SwitchOverClusterResponse switchOverCluster(SwitchOverClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.switchOverCluster);
    }

    /**
     * 主备恢复
     *
     * 当集群状态为“非均衡”时会出现某些节点主实例增多，从而负载压力较大。这种情况下集群状态是正常的，但整体性能要低于均衡状态。可进行集群主备恢复操作将集群状态切换为“可用”状态。  
     * **约束限制**：
     *  集群主备恢复仅8.1.1.202及以上版本支持。 
     *  集群主备恢复将会短暂中断业务，中断时间根据用户自身业务量所决定，建议用户在业务低峰期执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchOverClusterRequest 请求对象
     * @return SyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse>
     */
    public SyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse> switchOverClusterInvoker(
        SwitchOverClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.switchOverCluster, hcClient);
    }

    /**
     * 切换资源管理计划阶段
     *
     * 切换资源管理计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchPlanStageRequest 请求对象
     * @return SwitchPlanStageResponse
     */
    public SwitchPlanStageResponse switchPlanStage(SwitchPlanStageRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.switchPlanStage);
    }

    /**
     * 切换资源管理计划阶段
     *
     * 切换资源管理计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchPlanStageRequest 请求对象
     * @return SyncInvoker<SwitchPlanStageRequest, SwitchPlanStageResponse>
     */
    public SyncInvoker<SwitchPlanStageRequest, SwitchPlanStageResponse> switchPlanStageInvoker(
        SwitchPlanStageRequest request) {
        return new SyncInvoker<>(request, DwsMeta.switchPlanStage, hcClient);
    }

    /**
     * 灾备切换
     *
     * 该接口用于容灾进行灾备切换操作。
     * “灾备切换”按钮用于在容灾正常情况下主备倒换操作。
     * 容灾状态为“运行中”时可以执行灾备切换操作。
     * 灾备切换需要一定时间，在此期间，原生产集群将可不用。
     * 不同场景下进行灾备切换，RPO（Recovery Point Object，灾难发生后，系统和数据必须恢复到的时间点要求。）说明如下：
     *   生产集群在“可用”的状态下，RPO&#x3D;0。
     *   生产集群在“不可用”的状态下，无法保证RPO&#x3D;0，但数据至少可恢复到生产集群“最近容灾成功时间”。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverDisasterRecoveryRequest 请求对象
     * @return SwitchoverDisasterRecoveryResponse
     */
    public SwitchoverDisasterRecoveryResponse switchoverDisasterRecovery(SwitchoverDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.switchoverDisasterRecovery);
    }

    /**
     * 灾备切换
     *
     * 该接口用于容灾进行灾备切换操作。
     * “灾备切换”按钮用于在容灾正常情况下主备倒换操作。
     * 容灾状态为“运行中”时可以执行灾备切换操作。
     * 灾备切换需要一定时间，在此期间，原生产集群将可不用。
     * 不同场景下进行灾备切换，RPO（Recovery Point Object，灾难发生后，系统和数据必须恢复到的时间点要求。）说明如下：
     *   生产集群在“可用”的状态下，RPO&#x3D;0。
     *   生产集群在“不可用”的状态下，无法保证RPO&#x3D;0，但数据至少可恢复到生产集群“最近容灾成功时间”。
     * 仅支持DWS 2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse>
     */
    public SyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> switchoverDisasterRecoveryInvoker(
        SwitchoverDisasterRecoveryRequest request) {
        return new SyncInvoker<>(request, DwsMeta.switchoverDisasterRecovery, hcClient);
    }

    /**
     * 同步IAM用户到数据库
     *
     * 同步IAM用户到数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncIamUsersRequest 请求对象
     * @return SyncIamUsersResponse
     */
    public SyncIamUsersResponse syncIamUsers(SyncIamUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.syncIamUsers);
    }

    /**
     * 同步IAM用户到数据库
     *
     * 同步IAM用户到数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncIamUsersRequest 请求对象
     * @return SyncInvoker<SyncIamUsersRequest, SyncIamUsersResponse>
     */
    public SyncInvoker<SyncIamUsersRequest, SyncIamUsersResponse> syncIamUsersInvoker(SyncIamUsersRequest request) {
        return new SyncInvoker<>(request, DwsMeta.syncIamUsers, hcClient);
    }

    /**
     * 更新告警订阅
     *
     * 更新订阅的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmSubRequest 请求对象
     * @return UpdateAlarmSubResponse
     */
    public UpdateAlarmSubResponse updateAlarmSub(UpdateAlarmSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateAlarmSub);
    }

    /**
     * 更新告警订阅
     *
     * 更新订阅的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmSubRequest 请求对象
     * @return SyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse>
     */
    public SyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse> updateAlarmSubInvoker(
        UpdateAlarmSubRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateAlarmSub, hcClient);
    }

    /**
     * 修改集群域名
     *
     * 为指定集群修改域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterDnsRequest 请求对象
     * @return UpdateClusterDnsResponse
     */
    public UpdateClusterDnsResponse updateClusterDns(UpdateClusterDnsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateClusterDns);
    }

    /**
     * 修改集群域名
     *
     * 为指定集群修改域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterDnsRequest 请求对象
     * @return SyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse>
     */
    public SyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse> updateClusterDnsInvoker(
        UpdateClusterDnsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateClusterDns, hcClient);
    }

    /**
     * 修改集群参数配置
     *
     * 修改集群使用的参数配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return UpdateConfigurationResponse
     */
    public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateConfiguration);
    }

    /**
     * 修改集群参数配置
     *
     * 修改集群使用的参数配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationInvoker(
        UpdateConfigurationRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateConfiguration, hcClient);
    }

    /**
     * 更新数据源
     *
     * 该接口用于更新一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataSourceRequest 请求对象
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateDataSource);
    }

    /**
     * 更新数据源
     *
     * 该接口用于更新一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataSourceRequest 请求对象
     * @return SyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>
     */
    public SyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSourceInvoker(
        UpdateDataSourceRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateDataSource, hcClient);
    }

    /**
     * 修改数据库对象权限
     *
     * 修改数据库对象权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseAuthorityRequest 请求对象
     * @return UpdateDatabaseAuthorityResponse
     */
    public UpdateDatabaseAuthorityResponse updateDatabaseAuthority(UpdateDatabaseAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateDatabaseAuthority);
    }

    /**
     * 修改数据库对象权限
     *
     * 修改数据库对象权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseAuthorityRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse>
     */
    public SyncInvoker<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> updateDatabaseAuthorityInvoker(
        UpdateDatabaseAuthorityRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateDatabaseAuthority, hcClient);
    }

    /**
     * 修改指定用户信息
     *
     * 修改指定用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseUserInfoRequest 请求对象
     * @return UpdateDatabaseUserInfoResponse
     */
    public UpdateDatabaseUserInfoResponse updateDatabaseUserInfo(UpdateDatabaseUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateDatabaseUserInfo);
    }

    /**
     * 修改指定用户信息
     *
     * 修改指定用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseUserInfoRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse>
     */
    public SyncInvoker<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> updateDatabaseUserInfoInvoker(
        UpdateDatabaseUserInfoRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateDatabaseUserInfo, hcClient);
    }

    /**
     * 更新容灾配置
     *
     * 该接口用于更新容灾配置操作。
     * 容灾状态为“未启动”或“已停止”时，可以执行容灾配置修改操作。
     * 新的配置在容灾重新启动后生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDisasterInfoRequest 请求对象
     * @return UpdateDisasterInfoResponse
     */
    public UpdateDisasterInfoResponse updateDisasterInfo(UpdateDisasterInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateDisasterInfo);
    }

    /**
     * 更新容灾配置
     *
     * 该接口用于更新容灾配置操作。
     * 容灾状态为“未启动”或“已停止”时，可以执行容灾配置修改操作。
     * 新的配置在容灾重新启动后生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDisasterInfoRequest 请求对象
     * @return SyncInvoker<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse>
     */
    public SyncInvoker<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> updateDisasterInfoInvoker(
        UpdateDisasterInfoRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateDisasterInfo, hcClient);
    }

    /**
     * 更新订阅事件
     *
     * 更新订阅事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSubRequest 请求对象
     * @return UpdateEventSubResponse
     */
    public UpdateEventSubResponse updateEventSub(UpdateEventSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateEventSub);
    }

    /**
     * 更新订阅事件
     *
     * 更新订阅事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSubRequest 请求对象
     * @return SyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse>
     */
    public SyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse> updateEventSubInvoker(
        UpdateEventSubRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateEventSub, hcClient);
    }

    /**
     * 编辑逻辑集群
     *
     * 编辑修改逻辑集群。接口根据提交的请求体判断当前操作是逻辑集群缩容或者扩容。
     * 场景一：原始的逻辑集群有6个节点（两个环），提交请求时的请求体只有1个环，此时为逻辑集群缩容。
     * 场景二：原始的逻辑集群有6个节点（两个环），提交请求时的请求体中有3个环，此时为逻辑集群扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogicalClusterRequest 请求对象
     * @return UpdateLogicalClusterResponse
     */
    public UpdateLogicalClusterResponse updateLogicalCluster(UpdateLogicalClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateLogicalCluster);
    }

    /**
     * 编辑逻辑集群
     *
     * 编辑修改逻辑集群。接口根据提交的请求体判断当前操作是逻辑集群缩容或者扩容。
     * 场景一：原始的逻辑集群有6个节点（两个环），提交请求时的请求体只有1个环，此时为逻辑集群缩容。
     * 场景二：原始的逻辑集群有6个节点（两个环），提交请求时的请求体中有3个环，此时为逻辑集群扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogicalClusterRequest 请求对象
     * @return SyncInvoker<UpdateLogicalClusterRequest, UpdateLogicalClusterResponse>
     */
    public SyncInvoker<UpdateLogicalClusterRequest, UpdateLogicalClusterResponse> updateLogicalClusterInvoker(
        UpdateLogicalClusterRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateLogicalCluster, hcClient);
    }

    /**
     * 编辑逻辑集群增删计划
     *
     * 编辑逻辑集群增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogicalClusterPlanRequest 请求对象
     * @return UpdateLogicalClusterPlanResponse
     */
    public UpdateLogicalClusterPlanResponse updateLogicalClusterPlan(UpdateLogicalClusterPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateLogicalClusterPlan);
    }

    /**
     * 编辑逻辑集群增删计划
     *
     * 编辑逻辑集群增删计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogicalClusterPlanRequest 请求对象
     * @return SyncInvoker<UpdateLogicalClusterPlanRequest, UpdateLogicalClusterPlanResponse>
     */
    public SyncInvoker<UpdateLogicalClusterPlanRequest, UpdateLogicalClusterPlanResponse> updateLogicalClusterPlanInvoker(
        UpdateLogicalClusterPlanRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateLogicalClusterPlan, hcClient);
    }

    /**
     * 修改运维时间窗
     *
     * 您可以根据业务需求，设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMaintenanceWindowRequest 请求对象
     * @return UpdateMaintenanceWindowResponse
     */
    public UpdateMaintenanceWindowResponse updateMaintenanceWindow(UpdateMaintenanceWindowRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateMaintenanceWindow);
    }

    /**
     * 修改运维时间窗
     *
     * 您可以根据业务需求，设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMaintenanceWindowRequest 请求对象
     * @return SyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>
     */
    public SyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> updateMaintenanceWindowInvoker(
        UpdateMaintenanceWindowRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateMaintenanceWindow, hcClient);
    }

    /**
     * 更新资源池资源配置信息
     *
     * 更新资源池资源配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateQueueResourcesRequest 请求对象
     * @return UpdateQueueResourcesResponse
     */
    public UpdateQueueResourcesResponse updateQueueResources(UpdateQueueResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateQueueResources);
    }

    /**
     * 更新资源池资源配置信息
     *
     * 更新资源池资源配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateQueueResourcesRequest 请求对象
     * @return SyncInvoker<UpdateQueueResourcesRequest, UpdateQueueResourcesResponse>
     */
    public SyncInvoker<UpdateQueueResourcesRequest, UpdateQueueResourcesResponse> updateQueueResourcesInvoker(
        UpdateQueueResourcesRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateQueueResources, hcClient);
    }

    /**
     * 更新重分布配置
     *
     * 更新重分布配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRedistributionConfigurationsRequest 请求对象
     * @return UpdateRedistributionConfigurationsResponse
     */
    public UpdateRedistributionConfigurationsResponse updateRedistributionConfigurations(
        UpdateRedistributionConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateRedistributionConfigurations);
    }

    /**
     * 更新重分布配置
     *
     * 更新重分布配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRedistributionConfigurationsRequest 请求对象
     * @return SyncInvoker<UpdateRedistributionConfigurationsRequest, UpdateRedistributionConfigurationsResponse>
     */
    public SyncInvoker<UpdateRedistributionConfigurationsRequest, UpdateRedistributionConfigurationsResponse> updateRedistributionConfigurationsInvoker(
        UpdateRedistributionConfigurationsRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateRedistributionConfigurations, hcClient);
    }

    /**
     * 更新模式空间限额
     *
     * 更新模式空间限额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSchemasRequest 请求对象
     * @return UpdateSchemasResponse
     */
    public UpdateSchemasResponse updateSchemas(UpdateSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateSchemas);
    }

    /**
     * 更新模式空间限额
     *
     * 更新模式空间限额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSchemasRequest 请求对象
     * @return SyncInvoker<UpdateSchemasRequest, UpdateSchemasResponse>
     */
    public SyncInvoker<UpdateSchemasRequest, UpdateSchemasResponse> updateSchemasInvoker(UpdateSchemasRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateSchemas, hcClient);
    }

    /**
     * 修改资源管理计划阶段
     *
     * 修改资源管理计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkloadPlanStageRequest 请求对象
     * @return UpdateWorkloadPlanStageResponse
     */
    public UpdateWorkloadPlanStageResponse updateWorkloadPlanStage(UpdateWorkloadPlanStageRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateWorkloadPlanStage);
    }

    /**
     * 修改资源管理计划阶段
     *
     * 修改资源管理计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkloadPlanStageRequest 请求对象
     * @return SyncInvoker<UpdateWorkloadPlanStageRequest, UpdateWorkloadPlanStageResponse>
     */
    public SyncInvoker<UpdateWorkloadPlanStageRequest, UpdateWorkloadPlanStageResponse> updateWorkloadPlanStageInvoker(
        UpdateWorkloadPlanStageRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateWorkloadPlanStage, hcClient);
    }

    /**
     * 更新异常规则
     *
     * 更新异常规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkloadRuleRequest 请求对象
     * @return UpdateWorkloadRuleResponse
     */
    public UpdateWorkloadRuleResponse updateWorkloadRule(UpdateWorkloadRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateWorkloadRule);
    }

    /**
     * 更新异常规则
     *
     * 更新异常规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkloadRuleRequest 请求对象
     * @return SyncInvoker<UpdateWorkloadRuleRequest, UpdateWorkloadRuleResponse>
     */
    public SyncInvoker<UpdateWorkloadRuleRequest, UpdateWorkloadRuleResponse> updateWorkloadRuleInvoker(
        UpdateWorkloadRuleRequest request) {
        return new SyncInvoker<>(request, DwsMeta.updateWorkloadRule, hcClient);
    }

}
