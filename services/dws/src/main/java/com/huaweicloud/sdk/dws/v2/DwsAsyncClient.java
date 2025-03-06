package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dws.v2.model.AddQueueUserListRequest;
import com.huaweicloud.sdk.dws.v2.model.AddQueueUserListResponse;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadPlanStageRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadPlanStageResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadQueueResponse;
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
import com.huaweicloud.sdk.dws.v2.model.CheckDisasterNameRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckDisasterNameResponse;
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
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateEventSubResponse;
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
import com.huaweicloud.sdk.dws.v2.model.DeleteDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDwsClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDwsClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteEventSubResponse;
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
import com.huaweicloud.sdk.dws.v2.model.DisableLtsLogsRequest;
import com.huaweicloud.sdk.dws.v2.model.DisableLtsLogsResponse;
import com.huaweicloud.sdk.dws.v2.model.DisassociateEipRequest;
import com.huaweicloud.sdk.dws.v2.model.DisassociateEipResponse;
import com.huaweicloud.sdk.dws.v2.model.DisassociateElbRequest;
import com.huaweicloud.sdk.dws.v2.model.DisassociateElbResponse;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.EnableLtsLogsRequest;
import com.huaweicloud.sdk.dws.v2.model.EnableLtsLogsResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteDatabaseOmUserActionRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteDatabaseOmUserActionResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteRedistributionClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteRedistributionClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorageRequest;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorageResponse;
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
import com.huaweicloud.sdk.dws.v2.model.ListClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsParameterRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsParameterResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterDetailsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterDetailsResponse;
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
import com.huaweicloud.sdk.dws.v2.model.ListSchemasRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSchemasResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotDetailsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotDetailsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotStatisticsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotStatisticsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListStatisticsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListStatisticsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListTablesStatisticRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTablesStatisticResponse;
import com.huaweicloud.sdk.dws.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTagsResponse;
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
import com.huaweicloud.sdk.dws.v2.model.SaveClusterDescriptionInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.SaveClusterDescriptionInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterFlavorRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterFlavorResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterRedistributionRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterRedistributionResponse;
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
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateMaintenanceWindowRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateMaintenanceWindowResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateQueueResourcesRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateQueueResourcesResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateSchemasRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateSchemasResponse;

import java.util.concurrent.CompletableFuture;

public class DwsAsyncClient {

    protected HcClient hcClient;

    public DwsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwsAsyncClient> newBuilder() {
        ClientBuilder<DwsAsyncClient> clientBuilder = new ClientBuilder<>(DwsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 添加工作负载队列的绑定用户
     *
     * 添加工作负载队列的绑定用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddQueueUserListRequest 请求对象
     * @return CompletableFuture<AddQueueUserListResponse>
     */
    public CompletableFuture<AddQueueUserListResponse> addQueueUserListAsync(AddQueueUserListRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.addQueueUserList);
    }

    /**
     * 添加工作负载队列的绑定用户
     *
     * 添加工作负载队列的绑定用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddQueueUserListRequest 请求对象
     * @return AsyncInvoker<AddQueueUserListRequest, AddQueueUserListResponse>
     */
    public AsyncInvoker<AddQueueUserListRequest, AddQueueUserListResponse> addQueueUserListAsyncInvoker(
        AddQueueUserListRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.addQueueUserList, hcClient);
    }

    /**
     * 设置跨区域备份配置
     *
     * 该接口用于设置跨区域备份配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSnapshotCrossRegionPolicyRequest 请求对象
     * @return CompletableFuture<AddSnapshotCrossRegionPolicyResponse>
     */
    public CompletableFuture<AddSnapshotCrossRegionPolicyResponse> addSnapshotCrossRegionPolicyAsync(
        AddSnapshotCrossRegionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.addSnapshotCrossRegionPolicy);
    }

    /**
     * 设置跨区域备份配置
     *
     * 该接口用于设置跨区域备份配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSnapshotCrossRegionPolicyRequest 请求对象
     * @return AsyncInvoker<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse>
     */
    public AsyncInvoker<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse> addSnapshotCrossRegionPolicyAsyncInvoker(
        AddSnapshotCrossRegionPolicyRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.addSnapshotCrossRegionPolicy, hcClient);
    }

    /**
     * 添加工作负载计划阶段
     *
     * 添加工作负载计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadPlanStageRequest 请求对象
     * @return CompletableFuture<AddWorkloadPlanStageResponse>
     */
    public CompletableFuture<AddWorkloadPlanStageResponse> addWorkloadPlanStageAsync(
        AddWorkloadPlanStageRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.addWorkloadPlanStage);
    }

    /**
     * 添加工作负载计划阶段
     *
     * 添加工作负载计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadPlanStageRequest 请求对象
     * @return AsyncInvoker<AddWorkloadPlanStageRequest, AddWorkloadPlanStageResponse>
     */
    public AsyncInvoker<AddWorkloadPlanStageRequest, AddWorkloadPlanStageResponse> addWorkloadPlanStageAsyncInvoker(
        AddWorkloadPlanStageRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.addWorkloadPlanStage, hcClient);
    }

    /**
     * 添加工作负载队列
     *
     * 添加工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadQueueRequest 请求对象
     * @return CompletableFuture<AddWorkloadQueueResponse>
     */
    public CompletableFuture<AddWorkloadQueueResponse> addWorkloadQueueAsync(AddWorkloadQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.addWorkloadQueue);
    }

    /**
     * 添加工作负载队列
     *
     * 添加工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkloadQueueRequest 请求对象
     * @return AsyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse>
     */
    public AsyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse> addWorkloadQueueAsyncInvoker(
        AddWorkloadQueueRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.addWorkloadQueue, hcClient);
    }

    /**
     * 集群绑定EIP
     *
     * 集群绑定Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateEipRequest 请求对象
     * @return CompletableFuture<AssociateEipResponse>
     */
    public CompletableFuture<AssociateEipResponse> associateEipAsync(AssociateEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.associateEip);
    }

    /**
     * 集群绑定EIP
     *
     * 集群绑定Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateEipRequest 请求对象
     * @return AsyncInvoker<AssociateEipRequest, AssociateEipResponse>
     */
    public AsyncInvoker<AssociateEipRequest, AssociateEipResponse> associateEipAsyncInvoker(
        AssociateEipRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.associateEip, hcClient);
    }

    /**
     * 集群绑定ELB
     *
     * 集群绑定Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateElbRequest 请求对象
     * @return CompletableFuture<AssociateElbResponse>
     */
    public CompletableFuture<AssociateElbResponse> associateElbAsync(AssociateElbRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.associateElb);
    }

    /**
     * 集群绑定ELB
     *
     * 集群绑定Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateElbRequest 请求对象
     * @return AsyncInvoker<AssociateElbRequest, AssociateElbResponse>
     */
    public AsyncInvoker<AssociateElbRequest, AssociateElbResponse> associateElbAsyncInvoker(
        AssociateElbRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.associateElb, hcClient);
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
     * @return CompletableFuture<BatchCreateClusterCnResponse>
     */
    public CompletableFuture<BatchCreateClusterCnResponse> batchCreateClusterCnAsync(
        BatchCreateClusterCnRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.batchCreateClusterCn);
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
     * @return AsyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse>
     */
    public AsyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> batchCreateClusterCnAsyncInvoker(
        BatchCreateClusterCnRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.batchCreateClusterCn, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 为指定集群批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagRequest 请求对象
     * @return CompletableFuture<BatchCreateResourceTagResponse>
     */
    public CompletableFuture<BatchCreateResourceTagResponse> batchCreateResourceTagAsync(
        BatchCreateResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.batchCreateResourceTag);
    }

    /**
     * 批量添加标签
     *
     * 为指定集群批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse>
     */
    public AsyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> batchCreateResourceTagAsyncInvoker(
        BatchCreateResourceTagRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.batchCreateResourceTag, hcClient);
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
     * @return CompletableFuture<BatchDeleteClusterCnResponse>
     */
    public CompletableFuture<BatchDeleteClusterCnResponse> batchDeleteClusterCnAsync(
        BatchDeleteClusterCnRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.batchDeleteClusterCn);
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
     * @return AsyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse>
     */
    public AsyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> batchDeleteClusterCnAsyncInvoker(
        BatchDeleteClusterCnRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.batchDeleteClusterCn, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 为指定集群批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return CompletableFuture<BatchDeleteResourceTagResponse>
     */
    public CompletableFuture<BatchDeleteResourceTagResponse> batchDeleteResourceTagAsync(
        BatchDeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.batchDeleteResourceTag);
    }

    /**
     * 批量删除标签
     *
     * 为指定集群批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagAsyncInvoker(
        BatchDeleteResourceTagRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 解除只读
     *
     * 当集群进入只读状态时，无法进行数据库相关操作，用户可以在管理控制台解除集群的只读状态。触发只读状态可能是由于磁盘使用率过高，因此需要对集群数据进行清理或扩容。
     * - 解除只读支持1.7.2及以上版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelReadonlyClusterRequest 请求对象
     * @return CompletableFuture<CancelReadonlyClusterResponse>
     */
    public CompletableFuture<CancelReadonlyClusterResponse> cancelReadonlyClusterAsync(
        CancelReadonlyClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.cancelReadonlyCluster);
    }

    /**
     * 解除只读
     *
     * 当集群进入只读状态时，无法进行数据库相关操作，用户可以在管理控制台解除集群的只读状态。触发只读状态可能是由于磁盘使用率过高，因此需要对集群数据进行清理或扩容。
     * - 解除只读支持1.7.2及以上版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelReadonlyClusterRequest 请求对象
     * @return AsyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse>
     */
    public AsyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> cancelReadonlyClusterAsyncInvoker(
        CancelReadonlyClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.cancelReadonlyCluster, hcClient);
    }

    /**
     * 修改集群安全组
     *
     * 该接口用于修改集群安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return CompletableFuture<ChangeSecurityGroupResponse>
     */
    public CompletableFuture<ChangeSecurityGroupResponse> changeSecurityGroupAsync(ChangeSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.changeSecurityGroup);
    }

    /**
     * 修改集群安全组
     *
     * 该接口用于修改集群安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupAsyncInvoker(
        ChangeSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 创建集群前检查
     *
     * 创建集群前预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClusterRequest 请求对象
     * @return CompletableFuture<CheckClusterResponse>
     */
    public CompletableFuture<CheckClusterResponse> checkClusterAsync(CheckClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.checkCluster);
    }

    /**
     * 创建集群前检查
     *
     * 创建集群前预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClusterRequest 请求对象
     * @return AsyncInvoker<CheckClusterRequest, CheckClusterResponse>
     */
    public AsyncInvoker<CheckClusterRequest, CheckClusterResponse> checkClusterAsyncInvoker(
        CheckClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.checkCluster, hcClient);
    }

    /**
     * 检查容灾名称
     *
     * 该接口用于查询容灾名称是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDisasterNameRequest 请求对象
     * @return CompletableFuture<CheckDisasterNameResponse>
     */
    public CompletableFuture<CheckDisasterNameResponse> checkDisasterNameAsync(CheckDisasterNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.checkDisasterName);
    }

    /**
     * 检查容灾名称
     *
     * 该接口用于查询容灾名称是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDisasterNameRequest 请求对象
     * @return AsyncInvoker<CheckDisasterNameRequest, CheckDisasterNameResponse>
     */
    public AsyncInvoker<CheckDisasterNameRequest, CheckDisasterNameResponse> checkDisasterNameAsyncInvoker(
        CheckDisasterNameRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.checkDisasterName, hcClient);
    }

    /**
     * 用户恢复表名检测
     *
     * 该接口用于用户恢复表名检测
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTableRestoreRequest 请求对象
     * @return CompletableFuture<CheckTableRestoreResponse>
     */
    public CompletableFuture<CheckTableRestoreResponse> checkTableRestoreAsync(CheckTableRestoreRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.checkTableRestore);
    }

    /**
     * 用户恢复表名检测
     *
     * 该接口用于用户恢复表名检测
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTableRestoreRequest 请求对象
     * @return AsyncInvoker<CheckTableRestoreRequest, CheckTableRestoreResponse>
     */
    public AsyncInvoker<CheckTableRestoreRequest, CheckTableRestoreResponse> checkTableRestoreAsyncInvoker(
        CheckTableRestoreRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.checkTableRestore, hcClient);
    }

    /**
     * 物理集群转换到逻辑集群
     *
     * 逻辑集群-物理集群转换到逻辑集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConvertToLogicalClusterRequest 请求对象
     * @return CompletableFuture<ConvertToLogicalClusterResponse>
     */
    public CompletableFuture<ConvertToLogicalClusterResponse> convertToLogicalClusterAsync(
        ConvertToLogicalClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.convertToLogicalCluster);
    }

    /**
     * 物理集群转换到逻辑集群
     *
     * 逻辑集群-物理集群转换到逻辑集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConvertToLogicalClusterRequest 请求对象
     * @return AsyncInvoker<ConvertToLogicalClusterRequest, ConvertToLogicalClusterResponse>
     */
    public AsyncInvoker<ConvertToLogicalClusterRequest, ConvertToLogicalClusterResponse> convertToLogicalClusterAsyncInvoker(
        ConvertToLogicalClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.convertToLogicalCluster, hcClient);
    }

    /**
     * 复制快照
     *
     * 该接口用于复制一个自动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopySnapshotRequest 请求对象
     * @return CompletableFuture<CopySnapshotResponse>
     */
    public CompletableFuture<CopySnapshotResponse> copySnapshotAsync(CopySnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.copySnapshot);
    }

    /**
     * 复制快照
     *
     * 该接口用于复制一个自动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopySnapshotRequest 请求对象
     * @return AsyncInvoker<CopySnapshotRequest, CopySnapshotResponse>
     */
    public AsyncInvoker<CopySnapshotRequest, CopySnapshotResponse> copySnapshotAsyncInvoker(
        CopySnapshotRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.copySnapshot, hcClient);
    }

    /**
     * 创建告警订阅
     *
     * 创建告警订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmSubRequest 请求对象
     * @return CompletableFuture<CreateAlarmSubResponse>
     */
    public CompletableFuture<CreateAlarmSubResponse> createAlarmSubAsync(CreateAlarmSubRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createAlarmSub);
    }

    /**
     * 创建告警订阅
     *
     * 创建告警订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmSubRequest 请求对象
     * @return AsyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse>
     */
    public AsyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse> createAlarmSubAsyncInvoker(
        CreateAlarmSubRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createAlarmSub, hcClient);
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
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createCluster);
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
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createCluster, hcClient);
    }

    /**
     * 申请域名
     *
     * 为指定集群申请域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterDnsRequest 请求对象
     * @return CompletableFuture<CreateClusterDnsResponse>
     */
    public CompletableFuture<CreateClusterDnsResponse> createClusterDnsAsync(CreateClusterDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createClusterDns);
    }

    /**
     * 申请域名
     *
     * 为指定集群申请域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterDnsRequest 请求对象
     * @return AsyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse>
     */
    public AsyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse> createClusterDnsAsyncInvoker(
        CreateClusterDnsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createClusterDns, hcClient);
    }

    /**
     * V2创建集群
     *
     * 该接口用于创建集群。
     * 集群必须要运行在VPC之内，创建集群前，您需要先创建VPC，并获取VPC和子网的id。
     * 该接口为异步接口，创建集群需要10～15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterV2Request 请求对象
     * @return CompletableFuture<CreateClusterV2Response>
     */
    public CompletableFuture<CreateClusterV2Response> createClusterV2Async(CreateClusterV2Request request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createClusterV2);
    }

    /**
     * V2创建集群
     *
     * 该接口用于创建集群。
     * 集群必须要运行在VPC之内，创建集群前，您需要先创建VPC，并获取VPC和子网的id。
     * 该接口为异步接口，创建集群需要10～15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterV2Request 请求对象
     * @return AsyncInvoker<CreateClusterV2Request, CreateClusterV2Response>
     */
    public AsyncInvoker<CreateClusterV2Request, CreateClusterV2Response> createClusterV2AsyncInvoker(
        CreateClusterV2Request request) {
        return new AsyncInvoker<>(request, DwsMeta.createClusterV2, hcClient);
    }

    /**
     * 设置资源管理
     *
     * 设置资源管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterWorkloadRequest 请求对象
     * @return CompletableFuture<CreateClusterWorkloadResponse>
     */
    public CompletableFuture<CreateClusterWorkloadResponse> createClusterWorkloadAsync(
        CreateClusterWorkloadRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createClusterWorkload);
    }

    /**
     * 设置资源管理
     *
     * 设置资源管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterWorkloadRequest 请求对象
     * @return AsyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse>
     */
    public AsyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> createClusterWorkloadAsyncInvoker(
        CreateClusterWorkloadRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createClusterWorkload, hcClient);
    }

    /**
     * 创建数据源
     *
     * 该接口用于创建一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataSourceRequest 请求对象
     * @return CompletableFuture<CreateDataSourceResponse>
     */
    public CompletableFuture<CreateDataSourceResponse> createDataSourceAsync(CreateDataSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createDataSource);
    }

    /**
     * 创建数据源
     *
     * 该接口用于创建一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataSourceRequest 请求对象
     * @return AsyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse>
     */
    public AsyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse> createDataSourceAsyncInvoker(
        CreateDataSourceRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createDataSource, hcClient);
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
     * @return CompletableFuture<CreateDisasterRecoveryResponse>
     */
    public CompletableFuture<CreateDisasterRecoveryResponse> createDisasterRecoveryAsync(
        CreateDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createDisasterRecovery);
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
     * @return AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>
     */
    public AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecoveryAsyncInvoker(
        CreateDisasterRecoveryRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createDisasterRecovery, hcClient);
    }

    /**
     * 创建订阅事件
     *
     * 添加订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSubRequest 请求对象
     * @return CompletableFuture<CreateEventSubResponse>
     */
    public CompletableFuture<CreateEventSubResponse> createEventSubAsync(CreateEventSubRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createEventSub);
    }

    /**
     * 创建订阅事件
     *
     * 添加订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSubRequest 请求对象
     * @return AsyncInvoker<CreateEventSubRequest, CreateEventSubResponse>
     */
    public AsyncInvoker<CreateEventSubRequest, CreateEventSubResponse> createEventSubAsyncInvoker(
        CreateEventSubRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createEventSub, hcClient);
    }

    /**
     * 创建逻辑集群
     *
     * 逻辑集群-创建逻辑集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogicalClusterRequest 请求对象
     * @return CompletableFuture<CreateLogicalClusterResponse>
     */
    public CompletableFuture<CreateLogicalClusterResponse> createLogicalClusterAsync(
        CreateLogicalClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createLogicalCluster);
    }

    /**
     * 创建逻辑集群
     *
     * 逻辑集群-创建逻辑集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogicalClusterRequest 请求对象
     * @return AsyncInvoker<CreateLogicalClusterRequest, CreateLogicalClusterResponse>
     */
    public AsyncInvoker<CreateLogicalClusterRequest, CreateLogicalClusterResponse> createLogicalClusterAsyncInvoker(
        CreateLogicalClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createLogicalCluster, hcClient);
    }

    /**
     * 创建快照
     *
     * 该接口用于为指定集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return CompletableFuture<CreateSnapshotResponse>
     */
    public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createSnapshot);
    }

    /**
     * 创建快照
     *
     * 该接口用于为指定集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(
        CreateSnapshotRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createSnapshot, hcClient);
    }

    /**
     * 添加快照策略
     *
     * 该接口用于设置快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<CreateSnapshotPolicyResponse>
     */
    public CompletableFuture<CreateSnapshotPolicyResponse> createSnapshotPolicyAsync(
        CreateSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createSnapshotPolicy);
    }

    /**
     * 添加快照策略
     *
     * 该接口用于设置快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse>
     */
    public AsyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> createSnapshotPolicyAsyncInvoker(
        CreateSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createSnapshotPolicy, hcClient);
    }

    /**
     * 添加工作负载计划
     *
     * 添加工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadPlanRequest 请求对象
     * @return CompletableFuture<CreateWorkloadPlanResponse>
     */
    public CompletableFuture<CreateWorkloadPlanResponse> createWorkloadPlanAsync(CreateWorkloadPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createWorkloadPlan);
    }

    /**
     * 添加工作负载计划
     *
     * 添加工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadPlanRequest 请求对象
     * @return AsyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse>
     */
    public AsyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> createWorkloadPlanAsyncInvoker(
        CreateWorkloadPlanRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.createWorkloadPlan, hcClient);
    }

    /**
     * 删除告警订阅
     *
     * 删除订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmSubRequest 请求对象
     * @return CompletableFuture<DeleteAlarmSubResponse>
     */
    public CompletableFuture<DeleteAlarmSubResponse> deleteAlarmSubAsync(DeleteAlarmSubRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteAlarmSub);
    }

    /**
     * 删除告警订阅
     *
     * 删除订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmSubRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse>
     */
    public AsyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse> deleteAlarmSubAsyncInvoker(
        DeleteAlarmSubRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteAlarmSub, hcClient);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteCluster, hcClient);
    }

    /**
     * 删除集群域名
     *
     * 删除指定集群域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterDnsRequest 请求对象
     * @return CompletableFuture<DeleteClusterDnsResponse>
     */
    public CompletableFuture<DeleteClusterDnsResponse> deleteClusterDnsAsync(DeleteClusterDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteClusterDns);
    }

    /**
     * 删除集群域名
     *
     * 删除指定集群域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterDnsRequest 请求对象
     * @return AsyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse>
     */
    public AsyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse> deleteClusterDnsAsyncInvoker(
        DeleteClusterDnsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteClusterDns, hcClient);
    }

    /**
     * 删除节点
     *
     * 此接口用于删除节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterNodesRequest 请求对象
     * @return CompletableFuture<DeleteClusterNodesResponse>
     */
    public CompletableFuture<DeleteClusterNodesResponse> deleteClusterNodesAsync(DeleteClusterNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteClusterNodes);
    }

    /**
     * 删除节点
     *
     * 此接口用于删除节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterNodesRequest 请求对象
     * @return AsyncInvoker<DeleteClusterNodesRequest, DeleteClusterNodesResponse>
     */
    public AsyncInvoker<DeleteClusterNodesRequest, DeleteClusterNodesResponse> deleteClusterNodesAsyncInvoker(
        DeleteClusterNodesRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteClusterNodes, hcClient);
    }

    /**
     * 删除数据源
     *
     * 该接口用于删除一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataSourceRequest 请求对象
     * @return CompletableFuture<DeleteDataSourceResponse>
     */
    public CompletableFuture<DeleteDataSourceResponse> deleteDataSourceAsync(DeleteDataSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteDataSource);
    }

    /**
     * 删除数据源
     *
     * 该接口用于删除一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataSourceRequest 请求对象
     * @return AsyncInvoker<DeleteDataSourceRequest, DeleteDataSourceResponse>
     */
    public AsyncInvoker<DeleteDataSourceRequest, DeleteDataSourceResponse> deleteDataSourceAsyncInvoker(
        DeleteDataSourceRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteDataSource, hcClient);
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
     * @return CompletableFuture<DeleteDisasterRecoveryResponse>
     */
    public CompletableFuture<DeleteDisasterRecoveryResponse> deleteDisasterRecoveryAsync(
        DeleteDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteDisasterRecovery);
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
     * @return AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>
     */
    public AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecoveryAsyncInvoker(
        DeleteDisasterRecoveryRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteDisasterRecovery, hcClient);
    }

    /**
     * 删除集群V2
     *
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDwsClusterRequest 请求对象
     * @return CompletableFuture<DeleteDwsClusterResponse>
     */
    public CompletableFuture<DeleteDwsClusterResponse> deleteDwsClusterAsync(DeleteDwsClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteDwsCluster);
    }

    /**
     * 删除集群V2
     *
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDwsClusterRequest 请求对象
     * @return AsyncInvoker<DeleteDwsClusterRequest, DeleteDwsClusterResponse>
     */
    public AsyncInvoker<DeleteDwsClusterRequest, DeleteDwsClusterResponse> deleteDwsClusterAsyncInvoker(
        DeleteDwsClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteDwsCluster, hcClient);
    }

    /**
     * 删除订阅事件
     *
     * 删除订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSubRequest 请求对象
     * @return CompletableFuture<DeleteEventSubResponse>
     */
    public CompletableFuture<DeleteEventSubResponse> deleteEventSubAsync(DeleteEventSubRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteEventSub);
    }

    /**
     * 删除订阅事件
     *
     * 删除订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSubRequest 请求对象
     * @return AsyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse>
     */
    public AsyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse> deleteEventSubAsyncInvoker(
        DeleteEventSubRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteEventSub, hcClient);
    }

    /**
     * 删除逻辑集群
     *
     * 此接口用于删除逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalClusterRequest 请求对象
     * @return CompletableFuture<DeleteLogicalClusterResponse>
     */
    public CompletableFuture<DeleteLogicalClusterResponse> deleteLogicalClusterAsync(
        DeleteLogicalClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteLogicalCluster);
    }

    /**
     * 删除逻辑集群
     *
     * 此接口用于删除逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalClusterRequest 请求对象
     * @return AsyncInvoker<DeleteLogicalClusterRequest, DeleteLogicalClusterResponse>
     */
    public AsyncInvoker<DeleteLogicalClusterRequest, DeleteLogicalClusterResponse> deleteLogicalClusterAsyncInvoker(
        DeleteLogicalClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteLogicalCluster, hcClient);
    }

    /**
     * 删除工作负载队列的绑定用户
     *
     * 删除工作负载队列的绑定用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueUserListRequest 请求对象
     * @return CompletableFuture<DeleteQueueUserListResponse>
     */
    public CompletableFuture<DeleteQueueUserListResponse> deleteQueueUserListAsync(DeleteQueueUserListRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteQueueUserList);
    }

    /**
     * 删除工作负载队列的绑定用户
     *
     * 删除工作负载队列的绑定用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueUserListRequest 请求对象
     * @return AsyncInvoker<DeleteQueueUserListRequest, DeleteQueueUserListResponse>
     */
    public AsyncInvoker<DeleteQueueUserListRequest, DeleteQueueUserListResponse> deleteQueueUserListAsyncInvoker(
        DeleteQueueUserListRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteQueueUserList, hcClient);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除一个指定手动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotResponse>
     */
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshotAsync(DeleteSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteSnapshot);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除一个指定手动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(
        DeleteSnapshotRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteSnapshot, hcClient);
    }

    /**
     * 删除跨区域备份配置
     *
     * 该接口用于删除跨区域备份配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotCrossRegionPolicyRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotCrossRegionPolicyResponse>
     */
    public CompletableFuture<DeleteSnapshotCrossRegionPolicyResponse> deleteSnapshotCrossRegionPolicyAsync(
        DeleteSnapshotCrossRegionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteSnapshotCrossRegionPolicy);
    }

    /**
     * 删除跨区域备份配置
     *
     * 该接口用于删除跨区域备份配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotCrossRegionPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse>
     */
    public AsyncInvoker<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse> deleteSnapshotCrossRegionPolicyAsyncInvoker(
        DeleteSnapshotCrossRegionPolicyRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteSnapshotCrossRegionPolicy, hcClient);
    }

    /**
     * 删除快照策略
     *
     * 该接口用于删除一个快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotPolicyResponse>
     */
    public CompletableFuture<DeleteSnapshotPolicyResponse> deleteSnapshotPolicyAsync(
        DeleteSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteSnapshotPolicy);
    }

    /**
     * 删除快照策略
     *
     * 该接口用于删除一个快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse>
     */
    public AsyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> deleteSnapshotPolicyAsyncInvoker(
        DeleteSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteSnapshotPolicy, hcClient);
    }

    /**
     * 删除工作负载计划
     *
     * 删除工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadPlanRequest 请求对象
     * @return CompletableFuture<DeleteWorkloadPlanResponse>
     */
    public CompletableFuture<DeleteWorkloadPlanResponse> deleteWorkloadPlanAsync(DeleteWorkloadPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteWorkloadPlan);
    }

    /**
     * 删除工作负载计划
     *
     * 删除工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadPlanRequest 请求对象
     * @return AsyncInvoker<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse>
     */
    public AsyncInvoker<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse> deleteWorkloadPlanAsyncInvoker(
        DeleteWorkloadPlanRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteWorkloadPlan, hcClient);
    }

    /**
     * 删除工作负载计划阶段
     *
     * 删除工作负载计划删除工作负载计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadPlanStageRequest 请求对象
     * @return CompletableFuture<DeleteWorkloadPlanStageResponse>
     */
    public CompletableFuture<DeleteWorkloadPlanStageResponse> deleteWorkloadPlanStageAsync(
        DeleteWorkloadPlanStageRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteWorkloadPlanStage);
    }

    /**
     * 删除工作负载计划阶段
     *
     * 删除工作负载计划删除工作负载计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadPlanStageRequest 请求对象
     * @return AsyncInvoker<DeleteWorkloadPlanStageRequest, DeleteWorkloadPlanStageResponse>
     */
    public AsyncInvoker<DeleteWorkloadPlanStageRequest, DeleteWorkloadPlanStageResponse> deleteWorkloadPlanStageAsyncInvoker(
        DeleteWorkloadPlanStageRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteWorkloadPlanStage, hcClient);
    }

    /**
     * 删除资源池
     *
     * 该接口用于删除资源池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadQueueRequest 请求对象
     * @return CompletableFuture<DeleteWorkloadQueueResponse>
     */
    public CompletableFuture<DeleteWorkloadQueueResponse> deleteWorkloadQueueAsync(DeleteWorkloadQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteWorkloadQueue);
    }

    /**
     * 删除资源池
     *
     * 该接口用于删除资源池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadQueueRequest 请求对象
     * @return AsyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse>
     */
    public AsyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> deleteWorkloadQueueAsyncInvoker(
        DeleteWorkloadQueueRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.deleteWorkloadQueue, hcClient);
    }

    /**
     * 关闭云服务日志
     *
     * 该接口用于关闭集群LTS云日志服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableLtsLogsRequest 请求对象
     * @return CompletableFuture<DisableLtsLogsResponse>
     */
    public CompletableFuture<DisableLtsLogsResponse> disableLtsLogsAsync(DisableLtsLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.disableLtsLogs);
    }

    /**
     * 关闭云服务日志
     *
     * 该接口用于关闭集群LTS云日志服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableLtsLogsRequest 请求对象
     * @return AsyncInvoker<DisableLtsLogsRequest, DisableLtsLogsResponse>
     */
    public AsyncInvoker<DisableLtsLogsRequest, DisableLtsLogsResponse> disableLtsLogsAsyncInvoker(
        DisableLtsLogsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.disableLtsLogs, hcClient);
    }

    /**
     * 集群解绑EIP
     *
     * 集群解绑Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateEipRequest 请求对象
     * @return CompletableFuture<DisassociateEipResponse>
     */
    public CompletableFuture<DisassociateEipResponse> disassociateEipAsync(DisassociateEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.disassociateEip);
    }

    /**
     * 集群解绑EIP
     *
     * 集群解绑Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateEipRequest 请求对象
     * @return AsyncInvoker<DisassociateEipRequest, DisassociateEipResponse>
     */
    public AsyncInvoker<DisassociateEipRequest, DisassociateEipResponse> disassociateEipAsyncInvoker(
        DisassociateEipRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.disassociateEip, hcClient);
    }

    /**
     * 集群解绑ELB
     *
     * 集群解绑Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateElbRequest 请求对象
     * @return CompletableFuture<DisassociateElbResponse>
     */
    public CompletableFuture<DisassociateElbResponse> disassociateElbAsync(DisassociateElbRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.disassociateElb);
    }

    /**
     * 集群解绑ELB
     *
     * 集群解绑Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateElbRequest 请求对象
     * @return AsyncInvoker<DisassociateElbRequest, DisassociateElbResponse>
     */
    public AsyncInvoker<DisassociateElbRequest, DisassociateElbResponse> disassociateElbAsyncInvoker(
        DisassociateElbRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.disassociateElb, hcClient);
    }

    /**
     * 切换逻辑集群开关
     *
     * 此接口用于切换逻辑集群开关，仅用于控制逻辑集群相关功能模块是否在页面展示。在集群已经是逻辑集群的场景下，修改该接口无任何作用及影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLogicalClusterRequest 请求对象
     * @return CompletableFuture<EnableLogicalClusterResponse>
     */
    public CompletableFuture<EnableLogicalClusterResponse> enableLogicalClusterAsync(
        EnableLogicalClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.enableLogicalCluster);
    }

    /**
     * 切换逻辑集群开关
     *
     * 此接口用于切换逻辑集群开关，仅用于控制逻辑集群相关功能模块是否在页面展示。在集群已经是逻辑集群的场景下，修改该接口无任何作用及影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLogicalClusterRequest 请求对象
     * @return AsyncInvoker<EnableLogicalClusterRequest, EnableLogicalClusterResponse>
     */
    public AsyncInvoker<EnableLogicalClusterRequest, EnableLogicalClusterResponse> enableLogicalClusterAsyncInvoker(
        EnableLogicalClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.enableLogicalCluster, hcClient);
    }

    /**
     * 开启云服务日志
     *
     * 该接口用于开启集群LTS云日志服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLtsLogsRequest 请求对象
     * @return CompletableFuture<EnableLtsLogsResponse>
     */
    public CompletableFuture<EnableLtsLogsResponse> enableLtsLogsAsync(EnableLtsLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.enableLtsLogs);
    }

    /**
     * 开启云服务日志
     *
     * 该接口用于开启集群LTS云日志服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLtsLogsRequest 请求对象
     * @return AsyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>
     */
    public AsyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogsAsyncInvoker(
        EnableLtsLogsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.enableLtsLogs, hcClient);
    }

    /**
     * 下发集群升级相关操作
     *
     * 下发集群升级相关操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteClusterUpgradeActionRequest 请求对象
     * @return CompletableFuture<ExecuteClusterUpgradeActionResponse>
     */
    public CompletableFuture<ExecuteClusterUpgradeActionResponse> executeClusterUpgradeActionAsync(
        ExecuteClusterUpgradeActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.executeClusterUpgradeAction);
    }

    /**
     * 下发集群升级相关操作
     *
     * 下发集群升级相关操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteClusterUpgradeActionRequest 请求对象
     * @return AsyncInvoker<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse>
     */
    public AsyncInvoker<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse> executeClusterUpgradeActionAsyncInvoker(
        ExecuteClusterUpgradeActionRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.executeClusterUpgradeAction, hcClient);
    }

    /**
     * 执行运维用户操作
     *
     * 进行数据库运维账户操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDatabaseOmUserActionRequest 请求对象
     * @return CompletableFuture<ExecuteDatabaseOmUserActionResponse>
     */
    public CompletableFuture<ExecuteDatabaseOmUserActionResponse> executeDatabaseOmUserActionAsync(
        ExecuteDatabaseOmUserActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.executeDatabaseOmUserAction);
    }

    /**
     * 执行运维用户操作
     *
     * 进行数据库运维账户操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDatabaseOmUserActionRequest 请求对象
     * @return AsyncInvoker<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse>
     */
    public AsyncInvoker<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse> executeDatabaseOmUserActionAsyncInvoker(
        ExecuteDatabaseOmUserActionRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.executeDatabaseOmUserAction, hcClient);
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
     * @return CompletableFuture<ExecuteRedistributionClusterResponse>
     */
    public CompletableFuture<ExecuteRedistributionClusterResponse> executeRedistributionClusterAsync(
        ExecuteRedistributionClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.executeRedistributionCluster);
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
     * @return AsyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse>
     */
    public AsyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> executeRedistributionClusterAsyncInvoker(
        ExecuteRedistributionClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.executeRedistributionCluster, hcClient);
    }

    /**
     * 磁盘扩容
     *
     * 随着客户业务的发展，磁盘空间往往最先出现资源瓶颈，在其他资源尚且充足的情况下，通过磁盘扩容可快速缓解存储资源瓶颈现象，操作过程中无需暂停业务，并且不会造成CPU、内存等资源浪费。
     * - 磁盘扩容功能仅8.1.1.203及以上版本支持，并且创建集群规格需要为云数仓SSD云盘或实时数仓类型。
     * - 按需+折扣套餐包消费模式下，存储扩容后超出折扣套餐包部分将按需收费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceStorageRequest 请求对象
     * @return CompletableFuture<ExpandInstanceStorageResponse>
     */
    public CompletableFuture<ExpandInstanceStorageResponse> expandInstanceStorageAsync(
        ExpandInstanceStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.expandInstanceStorage);
    }

    /**
     * 磁盘扩容
     *
     * 随着客户业务的发展，磁盘空间往往最先出现资源瓶颈，在其他资源尚且充足的情况下，通过磁盘扩容可快速缓解存储资源瓶颈现象，操作过程中无需暂停业务，并且不会造成CPU、内存等资源浪费。
     * - 磁盘扩容功能仅8.1.1.203及以上版本支持，并且创建集群规格需要为云数仓SSD云盘或实时数仓类型。
     * - 按需+折扣套餐包消费模式下，存储扩容后超出折扣套餐包部分将按需收费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceStorageRequest 请求对象
     * @return AsyncInvoker<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse>
     */
    public AsyncInvoker<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> expandInstanceStorageAsyncInvoker(
        ExpandInstanceStorageRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.expandInstanceStorage, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmConfigsRequest 请求对象
     * @return CompletableFuture<ListAlarmConfigsResponse>
     */
    public CompletableFuture<ListAlarmConfigsResponse> listAlarmConfigsAsync(ListAlarmConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listAlarmConfigs);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmConfigsRequest 请求对象
     * @return AsyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse>
     */
    public AsyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse> listAlarmConfigsAsyncInvoker(
        ListAlarmConfigsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listAlarmConfigs, hcClient);
    }

    /**
     * 查询告警详情列表
     *
     * 查询告警详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmDetailRequest 请求对象
     * @return CompletableFuture<ListAlarmDetailResponse>
     */
    public CompletableFuture<ListAlarmDetailResponse> listAlarmDetailAsync(ListAlarmDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listAlarmDetail);
    }

    /**
     * 查询告警详情列表
     *
     * 查询告警详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmDetailRequest 请求对象
     * @return AsyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse>
     */
    public AsyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse> listAlarmDetailAsyncInvoker(
        ListAlarmDetailRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listAlarmDetail, hcClient);
    }

    /**
     * 查询告警统计列表
     *
     * 查询告警统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticRequest 请求对象
     * @return CompletableFuture<ListAlarmStatisticResponse>
     */
    public CompletableFuture<ListAlarmStatisticResponse> listAlarmStatisticAsync(ListAlarmStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listAlarmStatistic);
    }

    /**
     * 查询告警统计列表
     *
     * 查询告警统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticRequest 请求对象
     * @return AsyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse>
     */
    public AsyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse> listAlarmStatisticAsyncInvoker(
        ListAlarmStatisticRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listAlarmStatistic, hcClient);
    }

    /**
     * 查询告警订阅列表
     *
     * 查询订阅告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmSubsRequest 请求对象
     * @return CompletableFuture<ListAlarmSubsResponse>
     */
    public CompletableFuture<ListAlarmSubsResponse> listAlarmSubsAsync(ListAlarmSubsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listAlarmSubs);
    }

    /**
     * 查询告警订阅列表
     *
     * 查询订阅告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmSubsRequest 请求对象
     * @return AsyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse>
     */
    public AsyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse> listAlarmSubsAsyncInvoker(
        ListAlarmSubsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listAlarmSubs, hcClient);
    }

    /**
     * 查询日志记录
     *
     * 查询审计日志记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogRequest 请求对象
     * @return CompletableFuture<ListAuditLogResponse>
     */
    public CompletableFuture<ListAuditLogResponse> listAuditLogAsync(ListAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listAuditLog);
    }

    /**
     * 查询日志记录
     *
     * 查询审计日志记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogRequest 请求对象
     * @return AsyncInvoker<ListAuditLogRequest, ListAuditLogResponse>
     */
    public AsyncInvoker<ListAuditLogRequest, ListAuditLogResponse> listAuditLogAsyncInvoker(
        ListAuditLogRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listAuditLog, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZonesResponse>
     */
    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(
        ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listAvailabilityZones);
    }

    /**
     * 查询可用区列表
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询可用容灾集群列表
     *
     * 该接口用于查询可用的容灾集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableDisasterClustersRequest 请求对象
     * @return CompletableFuture<ListAvailableDisasterClustersResponse>
     */
    public CompletableFuture<ListAvailableDisasterClustersResponse> listAvailableDisasterClustersAsync(
        ListAvailableDisasterClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listAvailableDisasterClusters);
    }

    /**
     * 查询可用容灾集群列表
     *
     * 该接口用于查询可用的容灾集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableDisasterClustersRequest 请求对象
     * @return AsyncInvoker<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse>
     */
    public AsyncInvoker<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> listAvailableDisasterClustersAsyncInvoker(
        ListAvailableDisasterClustersRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listAvailableDisasterClusters, hcClient);
    }

    /**
     * 查询集群CN节点
     *
     * 查询集群的CN节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterCnRequest 请求对象
     * @return CompletableFuture<ListClusterCnResponse>
     */
    public CompletableFuture<ListClusterCnResponse> listClusterCnAsync(ListClusterCnRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterCn);
    }

    /**
     * 查询集群CN节点
     *
     * 查询集群的CN节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterCnRequest 请求对象
     * @return AsyncInvoker<ListClusterCnRequest, ListClusterCnResponse>
     */
    public AsyncInvoker<ListClusterCnRequest, ListClusterCnResponse> listClusterCnAsyncInvoker(
        ListClusterCnRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterCn, hcClient);
    }

    /**
     * 查询集群参数组
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterConfigurationsRequest 请求对象
     * @return CompletableFuture<ListClusterConfigurationsResponse>
     */
    public CompletableFuture<ListClusterConfigurationsResponse> listClusterConfigurationsAsync(
        ListClusterConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterConfigurations);
    }

    /**
     * 查询集群参数组
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse>
     */
    public AsyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> listClusterConfigurationsAsyncInvoker(
        ListClusterConfigurationsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterConfigurations, hcClient);
    }

    /**
     * 查询集群参数配置
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterConfigurationsParameterRequest 请求对象
     * @return CompletableFuture<ListClusterConfigurationsParameterResponse>
     */
    public CompletableFuture<ListClusterConfigurationsParameterResponse> listClusterConfigurationsParameterAsync(
        ListClusterConfigurationsParameterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterConfigurationsParameter);
    }

    /**
     * 查询集群参数配置
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterConfigurationsParameterRequest 请求对象
     * @return AsyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse>
     */
    public AsyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> listClusterConfigurationsParameterAsyncInvoker(
        ListClusterConfigurationsParameterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterConfigurationsParameter, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterDetailsRequest 请求对象
     * @return CompletableFuture<ListClusterDetailsResponse>
     */
    public CompletableFuture<ListClusterDetailsResponse> listClusterDetailsAsync(ListClusterDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterDetails);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterDetailsRequest 请求对象
     * @return AsyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>
     */
    public AsyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetailsAsyncInvoker(
        ListClusterDetailsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterDetails, hcClient);
    }

    /**
     * 查询节点列表
     *
     * 查询节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNodesRequest 请求对象
     * @return CompletableFuture<ListClusterNodesResponse>
     */
    public CompletableFuture<ListClusterNodesResponse> listClusterNodesAsync(ListClusterNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterNodes);
    }

    /**
     * 查询节点列表
     *
     * 查询节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNodesRequest 请求对象
     * @return AsyncInvoker<ListClusterNodesRequest, ListClusterNodesResponse>
     */
    public AsyncInvoker<ListClusterNodesRequest, ListClusterNodesResponse> listClusterNodesAsyncInvoker(
        ListClusterNodesRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterNodes, hcClient);
    }

    /**
     * 查询合适的缩容数
     *
     * 查询合适的缩容数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterScaleInNumbersRequest 请求对象
     * @return CompletableFuture<ListClusterScaleInNumbersResponse>
     */
    public CompletableFuture<ListClusterScaleInNumbersResponse> listClusterScaleInNumbersAsync(
        ListClusterScaleInNumbersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterScaleInNumbers);
    }

    /**
     * 查询合适的缩容数
     *
     * 查询合适的缩容数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterScaleInNumbersRequest 请求对象
     * @return AsyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse>
     */
    public AsyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> listClusterScaleInNumbersAsyncInvoker(
        ListClusterScaleInNumbersRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterScaleInNumbers, hcClient);
    }

    /**
     * 查询集群快照列表
     *
     * 该接口用于查询集群快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterSnapshotsRequest 请求对象
     * @return CompletableFuture<ListClusterSnapshotsResponse>
     */
    public CompletableFuture<ListClusterSnapshotsResponse> listClusterSnapshotsAsync(
        ListClusterSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterSnapshots);
    }

    /**
     * 查询集群快照列表
     *
     * 该接口用于查询集群快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse>
     */
    public AsyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> listClusterSnapshotsAsyncInvoker(
        ListClusterSnapshotsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterSnapshots, hcClient);
    }

    /**
     * 查询集群标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterTagsRequest 请求对象
     * @return CompletableFuture<ListClusterTagsResponse>
     */
    public CompletableFuture<ListClusterTagsResponse> listClusterTagsAsync(ListClusterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterTags);
    }

    /**
     * 查询集群标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterTagsRequest 请求对象
     * @return AsyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>
     */
    public AsyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTagsAsyncInvoker(
        ListClusterTagsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterTags, hcClient);
    }

    /**
     * 查询资源管理
     *
     * 查询资管管理开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterWorkloadRequest 请求对象
     * @return CompletableFuture<ListClusterWorkloadResponse>
     */
    public CompletableFuture<ListClusterWorkloadResponse> listClusterWorkloadAsync(ListClusterWorkloadRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterWorkload);
    }

    /**
     * 查询资源管理
     *
     * 查询资管管理开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterWorkloadRequest 请求对象
     * @return AsyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse>
     */
    public AsyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse> listClusterWorkloadAsyncInvoker(
        ListClusterWorkloadRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusterWorkload, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
     * @return CompletableFuture<ListClustersResponse>
     */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusters);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listClusters, hcClient);
    }

    /**
     * 查询参数修改审计记录
     *
     * 查询参数修改审计记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsAuditRecordsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsAuditRecordsResponse>
     */
    public CompletableFuture<ListConfigurationsAuditRecordsResponse> listConfigurationsAuditRecordsAsync(
        ListConfigurationsAuditRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listConfigurationsAuditRecords);
    }

    /**
     * 查询参数修改审计记录
     *
     * 查询参数修改审计记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsAuditRecordsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse>
     */
    public AsyncInvoker<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse> listConfigurationsAuditRecordsAsyncInvoker(
        ListConfigurationsAuditRecordsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listConfigurationsAuditRecords, hcClient);
    }

    /**
     * 查询数据源
     *
     * 该接口用于查询数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataSourceRequest 请求对象
     * @return CompletableFuture<ListDataSourceResponse>
     */
    public CompletableFuture<ListDataSourceResponse> listDataSourceAsync(ListDataSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listDataSource);
    }

    /**
     * 查询数据源
     *
     * 该接口用于查询数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataSourceRequest 请求对象
     * @return AsyncInvoker<ListDataSourceRequest, ListDataSourceResponse>
     */
    public AsyncInvoker<ListDataSourceRequest, ListDataSourceResponse> listDataSourceAsyncInvoker(
        ListDataSourceRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listDataSource, hcClient);
    }

    /**
     * 查询所有数据库用户/角色
     *
     * 查询所有数据库用户/角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUsersRequest 请求对象
     * @return CompletableFuture<ListDatabaseUsersResponse>
     */
    public CompletableFuture<ListDatabaseUsersResponse> listDatabaseUsersAsync(ListDatabaseUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listDatabaseUsers);
    }

    /**
     * 查询所有数据库用户/角色
     *
     * 查询所有数据库用户/角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUsersRequest 请求对象
     * @return AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersAsyncInvoker(
        ListDatabaseUsersRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listDatabaseUsers, hcClient);
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
     * @return CompletableFuture<ListDisasterRecoverResponse>
     */
    public CompletableFuture<ListDisasterRecoverResponse> listDisasterRecoverAsync(ListDisasterRecoverRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listDisasterRecover);
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
     * @return AsyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse>
     */
    public AsyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse> listDisasterRecoverAsyncInvoker(
        ListDisasterRecoverRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listDisasterRecover, hcClient);
    }

    /**
     * 查询专属分布式存储池列表
     *
     * 获取专属分布式存储池列表，只包括用户开通的SSD专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDssPoolsRequest 请求对象
     * @return CompletableFuture<ListDssPoolsResponse>
     */
    public CompletableFuture<ListDssPoolsResponse> listDssPoolsAsync(ListDssPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listDssPools);
    }

    /**
     * 查询专属分布式存储池列表
     *
     * 获取专属分布式存储池列表，只包括用户开通的SSD专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDssPoolsRequest 请求对象
     * @return AsyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse>
     */
    public AsyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse> listDssPoolsAsyncInvoker(
        ListDssPoolsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listDssPools, hcClient);
    }

    /**
     * 获取集群可绑定的ELB列表
     *
     * 查询集群可以关联的Elb列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbsRequest 请求对象
     * @return CompletableFuture<ListElbsResponse>
     */
    public CompletableFuture<ListElbsResponse> listElbsAsync(ListElbsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listElbs);
    }

    /**
     * 获取集群可绑定的ELB列表
     *
     * 查询集群可以关联的Elb列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbsRequest 请求对象
     * @return AsyncInvoker<ListElbsRequest, ListElbsResponse>
     */
    public AsyncInvoker<ListElbsRequest, ListElbsResponse> listElbsAsyncInvoker(ListElbsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listElbs, hcClient);
    }

    /**
     * 查询事件配置
     *
     * 查询事件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSpecsRequest 请求对象
     * @return CompletableFuture<ListEventSpecsResponse>
     */
    public CompletableFuture<ListEventSpecsResponse> listEventSpecsAsync(ListEventSpecsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listEventSpecs);
    }

    /**
     * 查询事件配置
     *
     * 查询事件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSpecsRequest 请求对象
     * @return AsyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse>
     */
    public AsyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse> listEventSpecsAsyncInvoker(
        ListEventSpecsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listEventSpecs, hcClient);
    }

    /**
     * 查询订阅事件
     *
     * 查询订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSubsRequest 请求对象
     * @return CompletableFuture<ListEventSubsResponse>
     */
    public CompletableFuture<ListEventSubsResponse> listEventSubsAsync(ListEventSubsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listEventSubs);
    }

    /**
     * 查询订阅事件
     *
     * 查询订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSubsRequest 请求对象
     * @return AsyncInvoker<ListEventSubsRequest, ListEventSubsResponse>
     */
    public AsyncInvoker<ListEventSubsRequest, ListEventSubsResponse> listEventSubsAsyncInvoker(
        ListEventSubsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listEventSubs, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listEvents);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listEvents, hcClient);
    }

    /**
     * openApi查询磁盘信息
     *
     * openApi查询磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostDiskRequest 请求对象
     * @return CompletableFuture<ListHostDiskResponse>
     */
    public CompletableFuture<ListHostDiskResponse> listHostDiskAsync(ListHostDiskRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listHostDisk);
    }

    /**
     * openApi查询磁盘信息
     *
     * openApi查询磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostDiskRequest 请求对象
     * @return AsyncInvoker<ListHostDiskRequest, ListHostDiskResponse>
     */
    public AsyncInvoker<ListHostDiskRequest, ListHostDiskResponse> listHostDiskAsyncInvoker(
        ListHostDiskRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listHostDisk, hcClient);
    }

    /**
     * openapi获取网卡状态
     *
     * openapi获取网卡状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostNetRequest 请求对象
     * @return CompletableFuture<ListHostNetResponse>
     */
    public CompletableFuture<ListHostNetResponse> listHostNetAsync(ListHostNetRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listHostNet);
    }

    /**
     * openapi获取网卡状态
     *
     * openapi获取网卡状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostNetRequest 请求对象
     * @return AsyncInvoker<ListHostNetRequest, ListHostNetResponse>
     */
    public AsyncInvoker<ListHostNetRequest, ListHostNetResponse> listHostNetAsyncInvoker(ListHostNetRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listHostNet, hcClient);
    }

    /**
     * openApi查询主机概览
     *
     * openApi查询主机概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostOverviewRequest 请求对象
     * @return CompletableFuture<ListHostOverviewResponse>
     */
    public CompletableFuture<ListHostOverviewResponse> listHostOverviewAsync(ListHostOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listHostOverview);
    }

    /**
     * openApi查询主机概览
     *
     * openApi查询主机概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostOverviewRequest 请求对象
     * @return AsyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse>
     */
    public AsyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse> listHostOverviewAsyncInvoker(
        ListHostOverviewRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listHostOverview, hcClient);
    }

    /**
     * 查询job进度
     *
     * 查询job进度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobDetailsRequest 请求对象
     * @return CompletableFuture<ListJobDetailsResponse>
     */
    public CompletableFuture<ListJobDetailsResponse> listJobDetailsAsync(ListJobDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listJobDetails);
    }

    /**
     * 查询job进度
     *
     * 查询job进度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobDetailsRequest 请求对象
     * @return AsyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse>
     */
    public AsyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse> listJobDetailsAsyncInvoker(
        ListJobDetailsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listJobDetails, hcClient);
    }

    /**
     * 查询逻辑集群可用ring环节点信息
     *
     * 查询逻辑集群可用ring环节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterRingsRequest 请求对象
     * @return CompletableFuture<ListLogicalClusterRingsResponse>
     */
    public CompletableFuture<ListLogicalClusterRingsResponse> listLogicalClusterRingsAsync(
        ListLogicalClusterRingsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listLogicalClusterRings);
    }

    /**
     * 查询逻辑集群可用ring环节点信息
     *
     * 查询逻辑集群可用ring环节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterRingsRequest 请求对象
     * @return AsyncInvoker<ListLogicalClusterRingsRequest, ListLogicalClusterRingsResponse>
     */
    public AsyncInvoker<ListLogicalClusterRingsRequest, ListLogicalClusterRingsResponse> listLogicalClusterRingsAsyncInvoker(
        ListLogicalClusterRingsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listLogicalClusterRings, hcClient);
    }

    /**
     * 查询逻辑集群任务信息
     *
     * 逻辑集群-查询逻辑集群任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterTasksRequest 请求对象
     * @return CompletableFuture<ListLogicalClusterTasksResponse>
     */
    public CompletableFuture<ListLogicalClusterTasksResponse> listLogicalClusterTasksAsync(
        ListLogicalClusterTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listLogicalClusterTasks);
    }

    /**
     * 查询逻辑集群任务信息
     *
     * 逻辑集群-查询逻辑集群任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterTasksRequest 请求对象
     * @return AsyncInvoker<ListLogicalClusterTasksRequest, ListLogicalClusterTasksResponse>
     */
    public AsyncInvoker<ListLogicalClusterTasksRequest, ListLogicalClusterTasksResponse> listLogicalClusterTasksAsyncInvoker(
        ListLogicalClusterTasksRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listLogicalClusterTasks, hcClient);
    }

    /**
     * 查询逻辑集群磁盘信息
     *
     * 逻辑集群-查询逻辑集群磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterVolumesRequest 请求对象
     * @return CompletableFuture<ListLogicalClusterVolumesResponse>
     */
    public CompletableFuture<ListLogicalClusterVolumesResponse> listLogicalClusterVolumesAsync(
        ListLogicalClusterVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listLogicalClusterVolumes);
    }

    /**
     * 查询逻辑集群磁盘信息
     *
     * 逻辑集群-查询逻辑集群磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClusterVolumesRequest 请求对象
     * @return AsyncInvoker<ListLogicalClusterVolumesRequest, ListLogicalClusterVolumesResponse>
     */
    public AsyncInvoker<ListLogicalClusterVolumesRequest, ListLogicalClusterVolumesResponse> listLogicalClusterVolumesAsyncInvoker(
        ListLogicalClusterVolumesRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listLogicalClusterVolumes, hcClient);
    }

    /**
     * 查询逻辑集群列表
     *
     * 逻辑集群-查询逻辑集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClustersRequest 请求对象
     * @return CompletableFuture<ListLogicalClustersResponse>
     */
    public CompletableFuture<ListLogicalClustersResponse> listLogicalClustersAsync(ListLogicalClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listLogicalClusters);
    }

    /**
     * 查询逻辑集群列表
     *
     * 逻辑集群-查询逻辑集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogicalClustersRequest 请求对象
     * @return AsyncInvoker<ListLogicalClustersRequest, ListLogicalClustersResponse>
     */
    public AsyncInvoker<ListLogicalClustersRequest, ListLogicalClustersResponse> listLogicalClustersAsyncInvoker(
        ListLogicalClustersRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listLogicalClusters, hcClient);
    }

    /**
     * 获取LTS日志列表
     *
     * 获取LTS日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsLogsRequest 请求对象
     * @return CompletableFuture<ListLtsLogsResponse>
     */
    public CompletableFuture<ListLtsLogsResponse> listLtsLogsAsync(ListLtsLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listLtsLogs);
    }

    /**
     * 获取LTS日志列表
     *
     * 获取LTS日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsLogsRequest 请求对象
     * @return AsyncInvoker<ListLtsLogsRequest, ListLtsLogsResponse>
     */
    public AsyncInvoker<ListLtsLogsRequest, ListLtsLogsResponse> listLtsLogsAsyncInvoker(ListLtsLogsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listLtsLogs, hcClient);
    }

    /**
     * 查询集群使用指标列表
     *
     * 查询集群使用指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return CompletableFuture<ListMetricsResponse>
     */
    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listMetrics);
    }

    /**
     * 查询集群使用指标列表
     *
     * 查询集群使用指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return AsyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public AsyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsAsyncInvoker(ListMetricsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listMetrics, hcClient);
    }

    /**
     * 获取指定指标相关采集数据
     *
     * 获取指定指标相关采集数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsDataRequest 请求对象
     * @return CompletableFuture<ListMetricsDataResponse>
     */
    public CompletableFuture<ListMetricsDataResponse> listMetricsDataAsync(ListMetricsDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listMetricsData);
    }

    /**
     * 获取指定指标相关采集数据
     *
     * 获取指定指标相关采集数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsDataRequest 请求对象
     * @return AsyncInvoker<ListMetricsDataRequest, ListMetricsDataResponse>
     */
    public AsyncInvoker<ListMetricsDataRequest, ListMetricsDataResponse> listMetricsDataAsyncInvoker(
        ListMetricsDataRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listMetricsData, hcClient);
    }

    /**
     * openApi查询历史监控数据
     *
     * openApi查询历史监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorIndicatorDataRequest 请求对象
     * @return CompletableFuture<ListMonitorIndicatorDataResponse>
     */
    public CompletableFuture<ListMonitorIndicatorDataResponse> listMonitorIndicatorDataAsync(
        ListMonitorIndicatorDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listMonitorIndicatorData);
    }

    /**
     * openApi查询历史监控数据
     *
     * openApi查询历史监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorIndicatorDataRequest 请求对象
     * @return AsyncInvoker<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse>
     */
    public AsyncInvoker<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> listMonitorIndicatorDataAsyncInvoker(
        ListMonitorIndicatorDataRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listMonitorIndicatorData, hcClient);
    }

    /**
     * openApi查询性能监控指标
     *
     * openApi查询性能监控指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorIndicatorsRequest 请求对象
     * @return CompletableFuture<ListMonitorIndicatorsResponse>
     */
    public CompletableFuture<ListMonitorIndicatorsResponse> listMonitorIndicatorsAsync(
        ListMonitorIndicatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listMonitorIndicators);
    }

    /**
     * openApi查询性能监控指标
     *
     * openApi查询性能监控指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorIndicatorsRequest 请求对象
     * @return AsyncInvoker<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse>
     */
    public AsyncInvoker<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> listMonitorIndicatorsAsyncInvoker(
        ListMonitorIndicatorsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listMonitorIndicators, hcClient);
    }

    /**
     * 查询节点类型
     *
     * 该接口用于查询所有GaussDB(DWS)服务支持的节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeTypesRequest 请求对象
     * @return CompletableFuture<ListNodeTypesResponse>
     */
    public CompletableFuture<ListNodeTypesResponse> listNodeTypesAsync(ListNodeTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listNodeTypes);
    }

    /**
     * 查询节点类型
     *
     * 该接口用于查询所有GaussDB(DWS)服务支持的节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeTypesRequest 请求对象
     * @return AsyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>
     */
    public AsyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypesAsyncInvoker(
        ListNodeTypesRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listNodeTypes, hcClient);
    }

    /**
     * 查看计划执行日志
     *
     * 查看计划执行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlanExecLogsRequest 请求对象
     * @return CompletableFuture<ListPlanExecLogsResponse>
     */
    public CompletableFuture<ListPlanExecLogsResponse> listPlanExecLogsAsync(ListPlanExecLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listPlanExecLogs);
    }

    /**
     * 查看计划执行日志
     *
     * 查看计划执行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlanExecLogsRequest 请求对象
     * @return AsyncInvoker<ListPlanExecLogsRequest, ListPlanExecLogsResponse>
     */
    public AsyncInvoker<ListPlanExecLogsRequest, ListPlanExecLogsResponse> listPlanExecLogsAsyncInvoker(
        ListPlanExecLogsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listPlanExecLogs, hcClient);
    }

    /**
     * 查询SQL列表
     *
     * 该接口用于查询实时SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueriesRequest 请求对象
     * @return CompletableFuture<ListQueriesResponse>
     */
    public CompletableFuture<ListQueriesResponse> listQueriesAsync(ListQueriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listQueries);
    }

    /**
     * 查询SQL列表
     *
     * 该接口用于查询实时SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueriesRequest 请求对象
     * @return AsyncInvoker<ListQueriesRequest, ListQueriesResponse>
     */
    public AsyncInvoker<ListQueriesRequest, ListQueriesResponse> listQueriesAsyncInvoker(ListQueriesRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listQueries, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDB(DWS)服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDB(DWS)服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listQuotas, hcClient);
    }

    /**
     * 查询集群模式空间信息
     *
     * 查询集群模式空间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return CompletableFuture<ListSchemasResponse>
     */
    public CompletableFuture<ListSchemasResponse> listSchemasAsync(ListSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSchemas);
    }

    /**
     * 查询集群模式空间信息
     *
     * 查询集群模式空间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return AsyncInvoker<ListSchemasRequest, ListSchemasResponse>
     */
    public AsyncInvoker<ListSchemasRequest, ListSchemasResponse> listSchemasAsyncInvoker(ListSchemasRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listSchemas, hcClient);
    }

    /**
     * 获取跨区域快照可用region
     *
     * 该接口用于获取跨区域快照可用region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotCrossRegionRequest 请求对象
     * @return CompletableFuture<ListSnapshotCrossRegionResponse>
     */
    public CompletableFuture<ListSnapshotCrossRegionResponse> listSnapshotCrossRegionAsync(
        ListSnapshotCrossRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSnapshotCrossRegion);
    }

    /**
     * 获取跨区域快照可用region
     *
     * 该接口用于获取跨区域快照可用region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotCrossRegionRequest 请求对象
     * @return AsyncInvoker<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse>
     */
    public AsyncInvoker<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse> listSnapshotCrossRegionAsyncInvoker(
        ListSnapshotCrossRegionRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listSnapshotCrossRegion, hcClient);
    }

    /**
     * 查询所有跨区域快照配置
     *
     * 该接口用于查询所有跨区域快照配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotCrossRegionPolicyRequest 请求对象
     * @return CompletableFuture<ListSnapshotCrossRegionPolicyResponse>
     */
    public CompletableFuture<ListSnapshotCrossRegionPolicyResponse> listSnapshotCrossRegionPolicyAsync(
        ListSnapshotCrossRegionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSnapshotCrossRegionPolicy);
    }

    /**
     * 查询所有跨区域快照配置
     *
     * 该接口用于查询所有跨区域快照配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotCrossRegionPolicyRequest 请求对象
     * @return AsyncInvoker<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse>
     */
    public AsyncInvoker<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse> listSnapshotCrossRegionPolicyAsyncInvoker(
        ListSnapshotCrossRegionPolicyRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listSnapshotCrossRegionPolicy, hcClient);
    }

    /**
     * 查询快照详情
     *
     * 该接口用于使用快照ID查询快照详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotDetailsRequest 请求对象
     * @return CompletableFuture<ListSnapshotDetailsResponse>
     */
    public CompletableFuture<ListSnapshotDetailsResponse> listSnapshotDetailsAsync(ListSnapshotDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSnapshotDetails);
    }

    /**
     * 查询快照详情
     *
     * 该接口用于使用快照ID查询快照详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotDetailsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>
     */
    public AsyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetailsAsyncInvoker(
        ListSnapshotDetailsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listSnapshotDetails, hcClient);
    }

    /**
     * 查询快照策略
     *
     * 查询快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<ListSnapshotPolicyResponse>
     */
    public CompletableFuture<ListSnapshotPolicyResponse> listSnapshotPolicyAsync(ListSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSnapshotPolicy);
    }

    /**
     * 查询快照策略
     *
     * 查询快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse>
     */
    public AsyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> listSnapshotPolicyAsyncInvoker(
        ListSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listSnapshotPolicy, hcClient);
    }

    /**
     * 快照统计信息
     *
     * 快照统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotStatisticsRequest 请求对象
     * @return CompletableFuture<ListSnapshotStatisticsResponse>
     */
    public CompletableFuture<ListSnapshotStatisticsResponse> listSnapshotStatisticsAsync(
        ListSnapshotStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSnapshotStatistics);
    }

    /**
     * 快照统计信息
     *
     * 快照统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotStatisticsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse>
     */
    public AsyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> listSnapshotStatisticsAsyncInvoker(
        ListSnapshotStatisticsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listSnapshotStatistics, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsResponse>
     */
    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listSnapshots, hcClient);
    }

    /**
     * 查询资源统计信息列表
     *
     * 查询当前可用资源数量，其中包括“可用集群和总集群（个）”、“可用节点和总节点（个）”、“总容量（GB）”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsRequest 请求对象
     * @return CompletableFuture<ListStatisticsResponse>
     */
    public CompletableFuture<ListStatisticsResponse> listStatisticsAsync(ListStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listStatistics);
    }

    /**
     * 查询资源统计信息列表
     *
     * 查询当前可用资源数量，其中包括“可用集群和总集群（个）”、“可用节点和总节点（个）”、“总容量（GB）”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsRequest 请求对象
     * @return AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsAsyncInvoker(
        ListStatisticsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listStatistics, hcClient);
    }

    /**
     * 查询表倾斜或脏页率信息
     *
     * 该接口用于查询表倾斜或脏页率信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTablesStatisticRequest 请求对象
     * @return CompletableFuture<ListTablesStatisticResponse>
     */
    public CompletableFuture<ListTablesStatisticResponse> listTablesStatisticAsync(ListTablesStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listTablesStatistic);
    }

    /**
     * 查询表倾斜或脏页率信息
     *
     * 该接口用于查询表倾斜或脏页率信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTablesStatisticRequest 请求对象
     * @return AsyncInvoker<ListTablesStatisticRequest, ListTablesStatisticResponse>
     */
    public AsyncInvoker<ListTablesStatisticRequest, ListTablesStatisticResponse> listTablesStatisticAsyncInvoker(
        ListTablesStatisticRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listTablesStatistic, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listTags, hcClient);
    }

    /**
     * 查询集群拓扑ring环节点信息
     *
     * 查询集群拓扑ring环节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopoRingsRequest 请求对象
     * @return CompletableFuture<ListTopoRingsResponse>
     */
    public CompletableFuture<ListTopoRingsResponse> listTopoRingsAsync(ListTopoRingsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listTopoRings);
    }

    /**
     * 查询集群拓扑ring环节点信息
     *
     * 查询集群拓扑ring环节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopoRingsRequest 请求对象
     * @return AsyncInvoker<ListTopoRingsRequest, ListTopoRingsResponse>
     */
    public AsyncInvoker<ListTopoRingsRequest, ListTopoRingsResponse> listTopoRingsAsyncInvoker(
        ListTopoRingsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listTopoRings, hcClient);
    }

    /**
     * 获取集群可升级的目标版本
     *
     * 获取集群可升级的目标版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdatableVersionRequest 请求对象
     * @return CompletableFuture<ListUpdatableVersionResponse>
     */
    public CompletableFuture<ListUpdatableVersionResponse> listUpdatableVersionAsync(
        ListUpdatableVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listUpdatableVersion);
    }

    /**
     * 获取集群可升级的目标版本
     *
     * 获取集群可升级的目标版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdatableVersionRequest 请求对象
     * @return AsyncInvoker<ListUpdatableVersionRequest, ListUpdatableVersionResponse>
     */
    public AsyncInvoker<ListUpdatableVersionRequest, ListUpdatableVersionResponse> listUpdatableVersionAsyncInvoker(
        ListUpdatableVersionRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listUpdatableVersion, hcClient);
    }

    /**
     * 获取集群升级记录
     *
     * 通过此api获取当前集群升级记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdateRecordRequest 请求对象
     * @return CompletableFuture<ListUpdateRecordResponse>
     */
    public CompletableFuture<ListUpdateRecordResponse> listUpdateRecordAsync(ListUpdateRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listUpdateRecord);
    }

    /**
     * 获取集群升级记录
     *
     * 通过此api获取当前集群升级记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdateRecordRequest 请求对象
     * @return AsyncInvoker<ListUpdateRecordRequest, ListUpdateRecordResponse>
     */
    public AsyncInvoker<ListUpdateRecordRequest, ListUpdateRecordResponse> listUpdateRecordAsyncInvoker(
        ListUpdateRecordRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listUpdateRecord, hcClient);
    }

    /**
     * 查询资源管理计划列表
     *
     * 查询集群中所有资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadPlansRequest 请求对象
     * @return CompletableFuture<ListWorkloadPlansResponse>
     */
    public CompletableFuture<ListWorkloadPlansResponse> listWorkloadPlansAsync(ListWorkloadPlansRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listWorkloadPlans);
    }

    /**
     * 查询资源管理计划列表
     *
     * 查询集群中所有资源管理计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadPlansRequest 请求对象
     * @return AsyncInvoker<ListWorkloadPlansRequest, ListWorkloadPlansResponse>
     */
    public AsyncInvoker<ListWorkloadPlansRequest, ListWorkloadPlansResponse> listWorkloadPlansAsyncInvoker(
        ListWorkloadPlansRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listWorkloadPlans, hcClient);
    }

    /**
     * 查询工作负载队列
     *
     * 查询工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadQueueRequest 请求对象
     * @return CompletableFuture<ListWorkloadQueueResponse>
     */
    public CompletableFuture<ListWorkloadQueueResponse> listWorkloadQueueAsync(ListWorkloadQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listWorkloadQueue);
    }

    /**
     * 查询工作负载队列
     *
     * 查询工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadQueueRequest 请求对象
     * @return AsyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse>
     */
    public AsyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse> listWorkloadQueueAsyncInvoker(
        ListWorkloadQueueRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listWorkloadQueue, hcClient);
    }

    /**
     * 获得工作负载队列的绑定用户列表
     *
     * 获得工作负载队列的绑定用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadQueueUsersRequest 请求对象
     * @return CompletableFuture<ListWorkloadQueueUsersResponse>
     */
    public CompletableFuture<ListWorkloadQueueUsersResponse> listWorkloadQueueUsersAsync(
        ListWorkloadQueueUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listWorkloadQueueUsers);
    }

    /**
     * 获得工作负载队列的绑定用户列表
     *
     * 获得工作负载队列的绑定用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadQueueUsersRequest 请求对象
     * @return AsyncInvoker<ListWorkloadQueueUsersRequest, ListWorkloadQueueUsersResponse>
     */
    public AsyncInvoker<ListWorkloadQueueUsersRequest, ListWorkloadQueueUsersResponse> listWorkloadQueueUsersAsyncInvoker(
        ListWorkloadQueueUsersRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.listWorkloadQueueUsers, hcClient);
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
     * @return CompletableFuture<PauseDisasterRecoveryResponse>
     */
    public CompletableFuture<PauseDisasterRecoveryResponse> pauseDisasterRecoveryAsync(
        PauseDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.pauseDisasterRecovery);
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
     * @return AsyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse>
     */
    public AsyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> pauseDisasterRecoveryAsyncInvoker(
        PauseDisasterRecoveryRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.pauseDisasterRecovery, hcClient);
    }

    /**
     * 重置密码
     *
     * 此接口用于重置集群管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 此接口用于重置集群管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.resetPassword, hcClient);
    }

    /**
     * 扩容集群调整集群大小
     *
     * 此接口用于扩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClusterRequest 请求对象
     * @return CompletableFuture<ResizeClusterResponse>
     */
    public CompletableFuture<ResizeClusterResponse> resizeClusterAsync(ResizeClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.resizeCluster);
    }

    /**
     * 扩容集群调整集群大小
     *
     * 此接口用于扩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClusterRequest 请求对象
     * @return AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse>
     */
    public AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterAsyncInvoker(
        ResizeClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.resizeCluster, hcClient);
    }

    /**
     * 从空闲节点扩容
     *
     * 此接口用于从空闲节点扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClusterWithExistedNodesRequest 请求对象
     * @return CompletableFuture<ResizeClusterWithExistedNodesResponse>
     */
    public CompletableFuture<ResizeClusterWithExistedNodesResponse> resizeClusterWithExistedNodesAsync(
        ResizeClusterWithExistedNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.resizeClusterWithExistedNodes);
    }

    /**
     * 从空闲节点扩容
     *
     * 此接口用于从空闲节点扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClusterWithExistedNodesRequest 请求对象
     * @return AsyncInvoker<ResizeClusterWithExistedNodesRequest, ResizeClusterWithExistedNodesResponse>
     */
    public AsyncInvoker<ResizeClusterWithExistedNodesRequest, ResizeClusterWithExistedNodesResponse> resizeClusterWithExistedNodesAsyncInvoker(
        ResizeClusterWithExistedNodesRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.resizeClusterWithExistedNodes, hcClient);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return CompletableFuture<RestartClusterResponse>
     */
    public CompletableFuture<RestartClusterResponse> restartClusterAsync(RestartClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(
        RestartClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.restartCluster, hcClient);
    }

    /**
     * 重启逻辑集群
     *
     * 此接口用于重启逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartLogicalClusterRequest 请求对象
     * @return CompletableFuture<RestartLogicalClusterResponse>
     */
    public CompletableFuture<RestartLogicalClusterResponse> restartLogicalClusterAsync(
        RestartLogicalClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restartLogicalCluster);
    }

    /**
     * 重启逻辑集群
     *
     * 此接口用于重启逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartLogicalClusterRequest 请求对象
     * @return AsyncInvoker<RestartLogicalClusterRequest, RestartLogicalClusterResponse>
     */
    public AsyncInvoker<RestartLogicalClusterRequest, RestartLogicalClusterResponse> restartLogicalClusterAsyncInvoker(
        RestartLogicalClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.restartLogicalCluster, hcClient);
    }

    /**
     * 恢复集群
     *
     * 该接口用于使用快照恢复集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreClusterRequest 请求对象
     * @return CompletableFuture<RestoreClusterResponse>
     */
    public CompletableFuture<RestoreClusterResponse> restoreClusterAsync(RestoreClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restoreCluster);
    }

    /**
     * 恢复集群
     *
     * 该接口用于使用快照恢复集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreClusterRequest 请求对象
     * @return AsyncInvoker<RestoreClusterRequest, RestoreClusterResponse>
     */
    public AsyncInvoker<RestoreClusterRequest, RestoreClusterResponse> restoreClusterAsyncInvoker(
        RestoreClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.restoreCluster, hcClient);
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
     * @return CompletableFuture<RestoreDisasterResponse>
     */
    public CompletableFuture<RestoreDisasterResponse> restoreDisasterAsync(RestoreDisasterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restoreDisaster);
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
     * @return AsyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse>
     */
    public AsyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse> restoreDisasterAsyncInvoker(
        RestoreDisasterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.restoreDisaster, hcClient);
    }

    /**
     * 恢复重分布
     *
     * 此接口用于恢复暂停状态下的重分布操作,仅支持DWS2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRedistributionRequest 请求对象
     * @return CompletableFuture<RestoreRedistributionResponse>
     */
    public CompletableFuture<RestoreRedistributionResponse> restoreRedistributionAsync(
        RestoreRedistributionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restoreRedistribution);
    }

    /**
     * 恢复重分布
     *
     * 此接口用于恢复暂停状态下的重分布操作,仅支持DWS2.0集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRedistributionRequest 请求对象
     * @return AsyncInvoker<RestoreRedistributionRequest, RestoreRedistributionResponse>
     */
    public AsyncInvoker<RestoreRedistributionRequest, RestoreRedistributionResponse> restoreRedistributionAsyncInvoker(
        RestoreRedistributionRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.restoreRedistribution, hcClient);
    }

    /**
     * 恢复表
     *
     * 该接口用于恢复表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreTableRequest 请求对象
     * @return CompletableFuture<RestoreTableResponse>
     */
    public CompletableFuture<RestoreTableResponse> restoreTableAsync(RestoreTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restoreTable);
    }

    /**
     * 恢复表
     *
     * 该接口用于恢复表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreTableRequest 请求对象
     * @return AsyncInvoker<RestoreTableRequest, RestoreTableResponse>
     */
    public AsyncInvoker<RestoreTableRequest, RestoreTableResponse> restoreTableAsyncInvoker(
        RestoreTableRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.restoreTable, hcClient);
    }

    /**
     * 保存集群描述信息
     *
     * 保存集群描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveClusterDescriptionInfoRequest 请求对象
     * @return CompletableFuture<SaveClusterDescriptionInfoResponse>
     */
    public CompletableFuture<SaveClusterDescriptionInfoResponse> saveClusterDescriptionInfoAsync(
        SaveClusterDescriptionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.saveClusterDescriptionInfo);
    }

    /**
     * 保存集群描述信息
     *
     * 保存集群描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveClusterDescriptionInfoRequest 请求对象
     * @return AsyncInvoker<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse>
     */
    public AsyncInvoker<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse> saveClusterDescriptionInfoAsyncInvoker(
        SaveClusterDescriptionInfoRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.saveClusterDescriptionInfo, hcClient);
    }

    /**
     * 查询集群规格详情
     *
     * 查询集群使用的规格详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterFlavorRequest 请求对象
     * @return CompletableFuture<ShowClusterFlavorResponse>
     */
    public CompletableFuture<ShowClusterFlavorResponse> showClusterFlavorAsync(ShowClusterFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showClusterFlavor);
    }

    /**
     * 查询集群规格详情
     *
     * 查询集群使用的规格详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterFlavorRequest 请求对象
     * @return AsyncInvoker<ShowClusterFlavorRequest, ShowClusterFlavorResponse>
     */
    public AsyncInvoker<ShowClusterFlavorRequest, ShowClusterFlavorResponse> showClusterFlavorAsyncInvoker(
        ShowClusterFlavorRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showClusterFlavor, hcClient);
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
     * @return CompletableFuture<ShowClusterRedistributionResponse>
     */
    public CompletableFuture<ShowClusterRedistributionResponse> showClusterRedistributionAsync(
        ShowClusterRedistributionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showClusterRedistribution);
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
     * @return AsyncInvoker<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse>
     */
    public AsyncInvoker<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse> showClusterRedistributionAsyncInvoker(
        ShowClusterRedistributionRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showClusterRedistribution, hcClient);
    }

    /**
     * 查询集群列表V2
     *
     * 该接口用于查询并显示集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClustersRequest 请求对象
     * @return CompletableFuture<ShowClustersResponse>
     */
    public CompletableFuture<ShowClustersResponse> showClustersAsync(ShowClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showClusters);
    }

    /**
     * 查询集群列表V2
     *
     * 该接口用于查询并显示集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClustersRequest 请求对象
     * @return AsyncInvoker<ShowClustersRequest, ShowClustersResponse>
     */
    public AsyncInvoker<ShowClustersRequest, ShowClustersResponse> showClustersAsyncInvoker(
        ShowClustersRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showClusters, hcClient);
    }

    /**
     * 查询数据库对象权限
     *
     * 查询数据库对象权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseAuthorityRequest 请求对象
     * @return CompletableFuture<ShowDatabaseAuthorityResponse>
     */
    public CompletableFuture<ShowDatabaseAuthorityResponse> showDatabaseAuthorityAsync(
        ShowDatabaseAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showDatabaseAuthority);
    }

    /**
     * 查询数据库对象权限
     *
     * 查询数据库对象权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseAuthorityRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse>
     */
    public AsyncInvoker<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> showDatabaseAuthorityAsyncInvoker(
        ShowDatabaseAuthorityRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showDatabaseAuthority, hcClient);
    }

    /**
     * 获得集群运维账户状态
     *
     * 获得数据库运维账户状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseOmUserStatusRequest 请求对象
     * @return CompletableFuture<ShowDatabaseOmUserStatusResponse>
     */
    public CompletableFuture<ShowDatabaseOmUserStatusResponse> showDatabaseOmUserStatusAsync(
        ShowDatabaseOmUserStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showDatabaseOmUserStatus);
    }

    /**
     * 获得集群运维账户状态
     *
     * 获得数据库运维账户状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseOmUserStatusRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse>
     */
    public AsyncInvoker<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse> showDatabaseOmUserStatusAsyncInvoker(
        ShowDatabaseOmUserStatusRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showDatabaseOmUserStatus, hcClient);
    }

    /**
     * 查询指定用户信息
     *
     * 查询指定用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseUserRequest 请求对象
     * @return CompletableFuture<ShowDatabaseUserResponse>
     */
    public CompletableFuture<ShowDatabaseUserResponse> showDatabaseUserAsync(ShowDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showDatabaseUser);
    }

    /**
     * 查询指定用户信息
     *
     * 查询指定用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseUserRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseUserRequest, ShowDatabaseUserResponse>
     */
    public AsyncInvoker<ShowDatabaseUserRequest, ShowDatabaseUserResponse> showDatabaseUserAsyncInvoker(
        ShowDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showDatabaseUser, hcClient);
    }

    /**
     * 查询容灾详情
     *
     * 该接口用于查询单个容灾详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterDetailRequest 请求对象
     * @return CompletableFuture<ShowDisasterDetailResponse>
     */
    public CompletableFuture<ShowDisasterDetailResponse> showDisasterDetailAsync(ShowDisasterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showDisasterDetail);
    }

    /**
     * 查询容灾详情
     *
     * 该接口用于查询单个容灾详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterDetailRequest 请求对象
     * @return AsyncInvoker<ShowDisasterDetailRequest, ShowDisasterDetailResponse>
     */
    public AsyncInvoker<ShowDisasterDetailRequest, ShowDisasterDetailResponse> showDisasterDetailAsyncInvoker(
        ShowDisasterDetailRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showDisasterDetail, hcClient);
    }

    /**
     * 容灾-查询容灾进度详情
     *
     * 该接口用于查询容灾进度详情信息操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterProgressRequest 请求对象
     * @return CompletableFuture<ShowDisasterProgressResponse>
     */
    public CompletableFuture<ShowDisasterProgressResponse> showDisasterProgressAsync(
        ShowDisasterProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showDisasterProgress);
    }

    /**
     * 容灾-查询容灾进度详情
     *
     * 该接口用于查询容灾进度详情信息操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterProgressRequest 请求对象
     * @return AsyncInvoker<ShowDisasterProgressRequest, ShowDisasterProgressResponse>
     */
    public AsyncInvoker<ShowDisasterProgressRequest, ShowDisasterProgressResponse> showDisasterProgressAsyncInvoker(
        ShowDisasterProgressRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showDisasterProgress, hcClient);
    }

    /**
     * 查询单个实例
     *
     * 查询单个实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showInstance);
    }

    /**
     * 查询单个实例
     *
     * 查询单个实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showInstance, hcClient);
    }

    /**
     * 查询SQL执行信息
     *
     * 查询SQL执行信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueryDetailRequest 请求对象
     * @return CompletableFuture<ShowQueryDetailResponse>
     */
    public CompletableFuture<ShowQueryDetailResponse> showQueryDetailAsync(ShowQueryDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showQueryDetail);
    }

    /**
     * 查询SQL执行信息
     *
     * 查询SQL执行信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueryDetailRequest 请求对象
     * @return AsyncInvoker<ShowQueryDetailRequest, ShowQueryDetailResponse>
     */
    public AsyncInvoker<ShowQueryDetailRequest, ShowQueryDetailResponse> showQueryDetailAsyncInvoker(
        ShowQueryDetailRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showQueryDetail, hcClient);
    }

    /**
     * 查询资源统计
     *
     * 该接口用于查询资源统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceStatisticsRequest 请求对象
     * @return CompletableFuture<ShowResourceStatisticsResponse>
     */
    public CompletableFuture<ShowResourceStatisticsResponse> showResourceStatisticsAsync(
        ShowResourceStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showResourceStatistics);
    }

    /**
     * 查询资源统计
     *
     * 该接口用于查询资源统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowResourceStatisticsRequest, ShowResourceStatisticsResponse>
     */
    public AsyncInvoker<ShowResourceStatisticsRequest, ShowResourceStatisticsResponse> showResourceStatisticsAsyncInvoker(
        ShowResourceStatisticsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showResourceStatistics, hcClient);
    }

    /**
     * 查询某个工作负载计划详细信息
     *
     * 查询某个工作负载计划详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadPlanRequest 请求对象
     * @return CompletableFuture<ShowWorkloadPlanResponse>
     */
    public CompletableFuture<ShowWorkloadPlanResponse> showWorkloadPlanAsync(ShowWorkloadPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showWorkloadPlan);
    }

    /**
     * 查询某个工作负载计划详细信息
     *
     * 查询某个工作负载计划详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadPlanRequest 请求对象
     * @return AsyncInvoker<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse>
     */
    public AsyncInvoker<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse> showWorkloadPlanAsyncInvoker(
        ShowWorkloadPlanRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showWorkloadPlan, hcClient);
    }

    /**
     * 查询工作负载计划阶段详细信息
     *
     * 查询工作负载计划阶段详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadPlanStageRequest 请求对象
     * @return CompletableFuture<ShowWorkloadPlanStageResponse>
     */
    public CompletableFuture<ShowWorkloadPlanStageResponse> showWorkloadPlanStageAsync(
        ShowWorkloadPlanStageRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showWorkloadPlanStage);
    }

    /**
     * 查询工作负载计划阶段详细信息
     *
     * 查询工作负载计划阶段详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadPlanStageRequest 请求对象
     * @return AsyncInvoker<ShowWorkloadPlanStageRequest, ShowWorkloadPlanStageResponse>
     */
    public AsyncInvoker<ShowWorkloadPlanStageRequest, ShowWorkloadPlanStageResponse> showWorkloadPlanStageAsyncInvoker(
        ShowWorkloadPlanStageRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showWorkloadPlanStage, hcClient);
    }

    /**
     * 获得工作负载队列详细信息
     *
     * 获得工作负载队列详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadQueueRequest 请求对象
     * @return CompletableFuture<ShowWorkloadQueueResponse>
     */
    public CompletableFuture<ShowWorkloadQueueResponse> showWorkloadQueueAsync(ShowWorkloadQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showWorkloadQueue);
    }

    /**
     * 获得工作负载队列详细信息
     *
     * 获得工作负载队列详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadQueueRequest 请求对象
     * @return AsyncInvoker<ShowWorkloadQueueRequest, ShowWorkloadQueueResponse>
     */
    public AsyncInvoker<ShowWorkloadQueueRequest, ShowWorkloadQueueResponse> showWorkloadQueueAsyncInvoker(
        ShowWorkloadQueueRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.showWorkloadQueue, hcClient);
    }

    /**
     * 集群缩容
     *
     * 该接口用于缩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkClusterRequest 请求对象
     * @return CompletableFuture<ShrinkClusterResponse>
     */
    public CompletableFuture<ShrinkClusterResponse> shrinkClusterAsync(ShrinkClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.shrinkCluster);
    }

    /**
     * 集群缩容
     *
     * 该接口用于缩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkClusterRequest 请求对象
     * @return AsyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>
     */
    public AsyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse> shrinkClusterAsyncInvoker(
        ShrinkClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.shrinkCluster, hcClient);
    }

    /**
     * 启动集群
     *
     * 集群管理-启动集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartClusterRequest 请求对象
     * @return CompletableFuture<StartClusterResponse>
     */
    public CompletableFuture<StartClusterResponse> startClusterAsync(StartClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.startCluster);
    }

    /**
     * 启动集群
     *
     * 集群管理-启动集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartClusterRequest 请求对象
     * @return AsyncInvoker<StartClusterRequest, StartClusterResponse>
     */
    public AsyncInvoker<StartClusterRequest, StartClusterResponse> startClusterAsyncInvoker(
        StartClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.startCluster, hcClient);
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
     * @return CompletableFuture<StartDisasterRecoveryResponse>
     */
    public CompletableFuture<StartDisasterRecoveryResponse> startDisasterRecoveryAsync(
        StartDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.startDisasterRecovery);
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
     * @return AsyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse>
     */
    public AsyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> startDisasterRecoveryAsyncInvoker(
        StartDisasterRecoveryRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.startDisasterRecovery, hcClient);
    }

    /**
     * 启动工作负载计划
     *
     * 启动工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartWorkloadPlanRequest 请求对象
     * @return CompletableFuture<StartWorkloadPlanResponse>
     */
    public CompletableFuture<StartWorkloadPlanResponse> startWorkloadPlanAsync(StartWorkloadPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.startWorkloadPlan);
    }

    /**
     * 启动工作负载计划
     *
     * 启动工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartWorkloadPlanRequest 请求对象
     * @return AsyncInvoker<StartWorkloadPlanRequest, StartWorkloadPlanResponse>
     */
    public AsyncInvoker<StartWorkloadPlanRequest, StartWorkloadPlanResponse> startWorkloadPlanAsyncInvoker(
        StartWorkloadPlanRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.startWorkloadPlan, hcClient);
    }

    /**
     * 停止集群
     *
     * 集群管理-停止集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopClusterRequest 请求对象
     * @return CompletableFuture<StopClusterResponse>
     */
    public CompletableFuture<StopClusterResponse> stopClusterAsync(StopClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.stopCluster);
    }

    /**
     * 停止集群
     *
     * 集群管理-停止集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopClusterRequest 请求对象
     * @return AsyncInvoker<StopClusterRequest, StopClusterResponse>
     */
    public AsyncInvoker<StopClusterRequest, StopClusterResponse> stopClusterAsyncInvoker(StopClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.stopCluster, hcClient);
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
     * @return CompletableFuture<StopRedistributionResponse>
     */
    public CompletableFuture<StopRedistributionResponse> stopRedistributionAsync(StopRedistributionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.stopRedistribution);
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
     * @return AsyncInvoker<StopRedistributionRequest, StopRedistributionResponse>
     */
    public AsyncInvoker<StopRedistributionRequest, StopRedistributionResponse> stopRedistributionAsyncInvoker(
        StopRedistributionRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.stopRedistribution, hcClient);
    }

    /**
     * 停止工作负载计划
     *
     * 停止工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopWorkloadPlanRequest 请求对象
     * @return CompletableFuture<StopWorkloadPlanResponse>
     */
    public CompletableFuture<StopWorkloadPlanResponse> stopWorkloadPlanAsync(StopWorkloadPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.stopWorkloadPlan);
    }

    /**
     * 停止工作负载计划
     *
     * 停止工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopWorkloadPlanRequest 请求对象
     * @return AsyncInvoker<StopWorkloadPlanRequest, StopWorkloadPlanResponse>
     */
    public AsyncInvoker<StopWorkloadPlanRequest, StopWorkloadPlanResponse> stopWorkloadPlanAsyncInvoker(
        StopWorkloadPlanRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.stopWorkloadPlan, hcClient);
    }

    /**
     * 容灾异常切换
     *
     * 该接口用于容灾异常场景下进行主备集群切换操作。
     * “异常切换”按钮用于容灾异常或者生产集群故障情况下主备切换操作。
     * 容灾异常切换仅8.1.2及以上集群版本支持。
     * 异常切换会将灾备集群升为主，若原生产集群故障后存在部分数据未同步到灾备集群，那灾备集群升主后将缺少这些数据，切换时请确认容灾最后同步时间，谨慎操作。
     * 仅支持DWS 2.0集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFailoverDisasterRequest 请求对象
     * @return CompletableFuture<SwitchFailoverDisasterResponse>
     */
    public CompletableFuture<SwitchFailoverDisasterResponse> switchFailoverDisasterAsync(
        SwitchFailoverDisasterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.switchFailoverDisaster);
    }

    /**
     * 容灾异常切换
     *
     * 该接口用于容灾异常场景下进行主备集群切换操作。
     * “异常切换”按钮用于容灾异常或者生产集群故障情况下主备切换操作。
     * 容灾异常切换仅8.1.2及以上集群版本支持。
     * 异常切换会将灾备集群升为主，若原生产集群故障后存在部分数据未同步到灾备集群，那灾备集群升主后将缺少这些数据，切换时请确认容灾最后同步时间，谨慎操作。
     * 仅支持DWS 2.0集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFailoverDisasterRequest 请求对象
     * @return AsyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse>
     */
    public AsyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> switchFailoverDisasterAsyncInvoker(
        SwitchFailoverDisasterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.switchFailoverDisaster, hcClient);
    }

    /**
     * 主备恢复
     *
     * 当集群状态为“非均衡”时会出现某些节点主实例增多，从而负载压力较大。这种情况下集群状态是正常的，但整体性能要低于均衡状态。可进行集群主备恢复操作将集群状态切换为“可用“状态。
     * - 集群主备恢复仅8.1.1.202及以上版本支持。
     * - 集群主备恢复将会短暂中断业务，中断时间根据用户自身业务量所决定，建议用户在业务低峰期执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchOverClusterRequest 请求对象
     * @return CompletableFuture<SwitchOverClusterResponse>
     */
    public CompletableFuture<SwitchOverClusterResponse> switchOverClusterAsync(SwitchOverClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.switchOverCluster);
    }

    /**
     * 主备恢复
     *
     * 当集群状态为“非均衡”时会出现某些节点主实例增多，从而负载压力较大。这种情况下集群状态是正常的，但整体性能要低于均衡状态。可进行集群主备恢复操作将集群状态切换为“可用“状态。
     * - 集群主备恢复仅8.1.1.202及以上版本支持。
     * - 集群主备恢复将会短暂中断业务，中断时间根据用户自身业务量所决定，建议用户在业务低峰期执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchOverClusterRequest 请求对象
     * @return AsyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse>
     */
    public AsyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse> switchOverClusterAsyncInvoker(
        SwitchOverClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.switchOverCluster, hcClient);
    }

    /**
     * 切换工作负载计划阶段
     *
     * 切换工作负载计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchPlanStageRequest 请求对象
     * @return CompletableFuture<SwitchPlanStageResponse>
     */
    public CompletableFuture<SwitchPlanStageResponse> switchPlanStageAsync(SwitchPlanStageRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.switchPlanStage);
    }

    /**
     * 切换工作负载计划阶段
     *
     * 切换工作负载计划阶段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchPlanStageRequest 请求对象
     * @return AsyncInvoker<SwitchPlanStageRequest, SwitchPlanStageResponse>
     */
    public AsyncInvoker<SwitchPlanStageRequest, SwitchPlanStageResponse> switchPlanStageAsyncInvoker(
        SwitchPlanStageRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.switchPlanStage, hcClient);
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
     * @return CompletableFuture<SwitchoverDisasterRecoveryResponse>
     */
    public CompletableFuture<SwitchoverDisasterRecoveryResponse> switchoverDisasterRecoveryAsync(
        SwitchoverDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.switchoverDisasterRecovery);
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
     * @return AsyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse>
     */
    public AsyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> switchoverDisasterRecoveryAsyncInvoker(
        SwitchoverDisasterRecoveryRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.switchoverDisasterRecovery, hcClient);
    }

    /**
     * 同步IAM用户到数据库
     *
     * 同步IAM用户到数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncIamUsersRequest 请求对象
     * @return CompletableFuture<SyncIamUsersResponse>
     */
    public CompletableFuture<SyncIamUsersResponse> syncIamUsersAsync(SyncIamUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.syncIamUsers);
    }

    /**
     * 同步IAM用户到数据库
     *
     * 同步IAM用户到数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncIamUsersRequest 请求对象
     * @return AsyncInvoker<SyncIamUsersRequest, SyncIamUsersResponse>
     */
    public AsyncInvoker<SyncIamUsersRequest, SyncIamUsersResponse> syncIamUsersAsyncInvoker(
        SyncIamUsersRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.syncIamUsers, hcClient);
    }

    /**
     * 更新告警订阅
     *
     * 更新订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmSubRequest 请求对象
     * @return CompletableFuture<UpdateAlarmSubResponse>
     */
    public CompletableFuture<UpdateAlarmSubResponse> updateAlarmSubAsync(UpdateAlarmSubRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateAlarmSub);
    }

    /**
     * 更新告警订阅
     *
     * 更新订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmSubRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse>
     */
    public AsyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse> updateAlarmSubAsyncInvoker(
        UpdateAlarmSubRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateAlarmSub, hcClient);
    }

    /**
     * 修改集群域名
     *
     * 为指定集群修改域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterDnsRequest 请求对象
     * @return CompletableFuture<UpdateClusterDnsResponse>
     */
    public CompletableFuture<UpdateClusterDnsResponse> updateClusterDnsAsync(UpdateClusterDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateClusterDns);
    }

    /**
     * 修改集群域名
     *
     * 为指定集群修改域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterDnsRequest 请求对象
     * @return AsyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse>
     */
    public AsyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse> updateClusterDnsAsyncInvoker(
        UpdateClusterDnsRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateClusterDns, hcClient);
    }

    /**
     * 修改集群参数配置
     *
     * 修改集群使用的参数配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationResponse>
     */
    public CompletableFuture<UpdateConfigurationResponse> updateConfigurationAsync(UpdateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateConfiguration);
    }

    /**
     * 修改集群参数配置
     *
     * 修改集群使用的参数配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(
        UpdateConfigurationRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateConfiguration, hcClient);
    }

    /**
     * 更新数据源
     *
     * 该接口用于更新一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataSourceRequest 请求对象
     * @return CompletableFuture<UpdateDataSourceResponse>
     */
    public CompletableFuture<UpdateDataSourceResponse> updateDataSourceAsync(UpdateDataSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateDataSource);
    }

    /**
     * 更新数据源
     *
     * 该接口用于更新一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataSourceRequest 请求对象
     * @return AsyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>
     */
    public AsyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSourceAsyncInvoker(
        UpdateDataSourceRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateDataSource, hcClient);
    }

    /**
     * 修改数据库对象权限
     *
     * 修改数据库对象权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseAuthorityRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseAuthorityResponse>
     */
    public CompletableFuture<UpdateDatabaseAuthorityResponse> updateDatabaseAuthorityAsync(
        UpdateDatabaseAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateDatabaseAuthority);
    }

    /**
     * 修改数据库对象权限
     *
     * 修改数据库对象权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseAuthorityRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse>
     */
    public AsyncInvoker<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> updateDatabaseAuthorityAsyncInvoker(
        UpdateDatabaseAuthorityRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateDatabaseAuthority, hcClient);
    }

    /**
     * 修改指定用户信息
     *
     * 修改指定用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseUserInfoRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseUserInfoResponse>
     */
    public CompletableFuture<UpdateDatabaseUserInfoResponse> updateDatabaseUserInfoAsync(
        UpdateDatabaseUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateDatabaseUserInfo);
    }

    /**
     * 修改指定用户信息
     *
     * 修改指定用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseUserInfoRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse>
     */
    public AsyncInvoker<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> updateDatabaseUserInfoAsyncInvoker(
        UpdateDatabaseUserInfoRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateDatabaseUserInfo, hcClient);
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
     * @return CompletableFuture<UpdateDisasterInfoResponse>
     */
    public CompletableFuture<UpdateDisasterInfoResponse> updateDisasterInfoAsync(UpdateDisasterInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateDisasterInfo);
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
     * @return AsyncInvoker<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse>
     */
    public AsyncInvoker<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> updateDisasterInfoAsyncInvoker(
        UpdateDisasterInfoRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateDisasterInfo, hcClient);
    }

    /**
     * 更新订阅事件
     *
     * 更新订阅事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSubRequest 请求对象
     * @return CompletableFuture<UpdateEventSubResponse>
     */
    public CompletableFuture<UpdateEventSubResponse> updateEventSubAsync(UpdateEventSubRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateEventSub);
    }

    /**
     * 更新订阅事件
     *
     * 更新订阅事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSubRequest 请求对象
     * @return AsyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse>
     */
    public AsyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse> updateEventSubAsyncInvoker(
        UpdateEventSubRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateEventSub, hcClient);
    }

    /**
     * 编辑逻辑集群
     *
     * 此接口用于编辑修改逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogicalClusterRequest 请求对象
     * @return CompletableFuture<UpdateLogicalClusterResponse>
     */
    public CompletableFuture<UpdateLogicalClusterResponse> updateLogicalClusterAsync(
        UpdateLogicalClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateLogicalCluster);
    }

    /**
     * 编辑逻辑集群
     *
     * 此接口用于编辑修改逻辑集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogicalClusterRequest 请求对象
     * @return AsyncInvoker<UpdateLogicalClusterRequest, UpdateLogicalClusterResponse>
     */
    public AsyncInvoker<UpdateLogicalClusterRequest, UpdateLogicalClusterResponse> updateLogicalClusterAsyncInvoker(
        UpdateLogicalClusterRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateLogicalCluster, hcClient);
    }

    /**
     * 修改运维时间窗
     *
     * 您可以根据业务需求，设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMaintenanceWindowRequest 请求对象
     * @return CompletableFuture<UpdateMaintenanceWindowResponse>
     */
    public CompletableFuture<UpdateMaintenanceWindowResponse> updateMaintenanceWindowAsync(
        UpdateMaintenanceWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateMaintenanceWindow);
    }

    /**
     * 修改运维时间窗
     *
     * 您可以根据业务需求，设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMaintenanceWindowRequest 请求对象
     * @return AsyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>
     */
    public AsyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> updateMaintenanceWindowAsyncInvoker(
        UpdateMaintenanceWindowRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateMaintenanceWindow, hcClient);
    }

    /**
     * 更新工作负载队列资源配置信息
     *
     * 更新工作负载队列资源配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateQueueResourcesRequest 请求对象
     * @return CompletableFuture<UpdateQueueResourcesResponse>
     */
    public CompletableFuture<UpdateQueueResourcesResponse> updateQueueResourcesAsync(
        UpdateQueueResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateQueueResources);
    }

    /**
     * 更新工作负载队列资源配置信息
     *
     * 更新工作负载队列资源配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateQueueResourcesRequest 请求对象
     * @return AsyncInvoker<UpdateQueueResourcesRequest, UpdateQueueResourcesResponse>
     */
    public AsyncInvoker<UpdateQueueResourcesRequest, UpdateQueueResourcesResponse> updateQueueResourcesAsyncInvoker(
        UpdateQueueResourcesRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateQueueResources, hcClient);
    }

    /**
     * 更新模式空间限额
     *
     * 更新模式空间限额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSchemasRequest 请求对象
     * @return CompletableFuture<UpdateSchemasResponse>
     */
    public CompletableFuture<UpdateSchemasResponse> updateSchemasAsync(UpdateSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateSchemas);
    }

    /**
     * 更新模式空间限额
     *
     * 更新模式空间限额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSchemasRequest 请求对象
     * @return AsyncInvoker<UpdateSchemasRequest, UpdateSchemasResponse>
     */
    public AsyncInvoker<UpdateSchemasRequest, UpdateSchemasResponse> updateSchemasAsyncInvoker(
        UpdateSchemasRequest request) {
        return new AsyncInvoker<>(request, DwsMeta.updateSchemas, hcClient);
    }

}
