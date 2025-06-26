package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dws.v2.model.AddExceptRuleReq;
import com.huaweicloud.sdk.dws.v2.model.AddQueueUserListRequest;
import com.huaweicloud.sdk.dws.v2.model.AddQueueUserListResponse;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyRequestBody;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadPlanStageRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadPlanStageResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadRuleRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadRuleResponse;
import com.huaweicloud.sdk.dws.v2.model.AlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.AlarmSubUpdateRequest;
import com.huaweicloud.sdk.dws.v2.model.AssociateEipRequest;
import com.huaweicloud.sdk.dws.v2.model.AssociateEipResponse;
import com.huaweicloud.sdk.dws.v2.model.AssociateElbRequest;
import com.huaweicloud.sdk.dws.v2.model.AssociateElbResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateCn;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateResourceTagRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateResourceTagResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateResourceTags;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteCn;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteResourceTagRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteResourceTagResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteResourceTags;
import com.huaweicloud.sdk.dws.v2.model.CancelReadonlyClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CancelReadonlyClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.dws.v2.model.ChangeSecurityGroupRequestBody;
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
import com.huaweicloud.sdk.dws.v2.model.CheckTableRestoreRequestBody;
import com.huaweicloud.sdk.dws.v2.model.CheckTableRestoreResponse;
import com.huaweicloud.sdk.dws.v2.model.ClusterCheckRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ClusterDescriptionInfo;
import com.huaweicloud.sdk.dws.v2.model.ClusterNameReq;
import com.huaweicloud.sdk.dws.v2.model.ClusterShrinkReq;
import com.huaweicloud.sdk.dws.v2.model.ClusterTimezoneReq;
import com.huaweicloud.sdk.dws.v2.model.ConfigurationParameterValues;
import com.huaweicloud.sdk.dws.v2.model.ConvertToLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ConvertToLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CopySnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.CopySnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateAlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateAlarmSubResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterDns;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterDnsRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterDnsResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterV2Request;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterV2Response;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterWorkloadRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterWorkloadResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateDatabaseUserRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDatabaseUserResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryReq;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.CreateLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotPolicyRequestBody;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotRequestBody;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.DatabaseOmUserActionReq;
import com.huaweicloud.sdk.dws.v2.model.DatabasePermissionReq;
import com.huaweicloud.sdk.dws.v2.model.DatabaseUserInfoReq;
import com.huaweicloud.sdk.dws.v2.model.DeleteAlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteAlarmSubResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterDnsRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterDnsResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterNodesRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterNodesRequestBody;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterNodesResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterRequestBody;
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
import com.huaweicloud.sdk.dws.v2.model.DiskResp;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.EnableLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.EnableLtsLogsRequest;
import com.huaweicloud.sdk.dws.v2.model.EnableLtsLogsResponse;
import com.huaweicloud.sdk.dws.v2.model.EncryptClusterReq;
import com.huaweicloud.sdk.dws.v2.model.EncryptClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.EncryptClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.EventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.EventSubUpdateRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteDatabaseOmUserActionRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteDatabaseOmUserActionResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteFlavorChangeRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteFlavorChangeResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteRedistributionClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteRedistributionClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorage;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorageRequest;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorageResponse;
import com.huaweicloud.sdk.dws.v2.model.ExportDatabaseUsersRequest;
import com.huaweicloud.sdk.dws.v2.model.ExportDatabaseUsersResponse;
import com.huaweicloud.sdk.dws.v2.model.ExportUserAuthorityRequest;
import com.huaweicloud.sdk.dws.v2.model.ExportUserAuthorityResponse;
import com.huaweicloud.sdk.dws.v2.model.ExtDataSourceReq;
import com.huaweicloud.sdk.dws.v2.model.HostOverviewResponse;
import com.huaweicloud.sdk.dws.v2.model.IndicatorInfo;
import com.huaweicloud.sdk.dws.v2.model.LinkCopyReq;
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
import com.huaweicloud.sdk.dws.v2.model.ListQueriesRequestBody;
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
import com.huaweicloud.sdk.dws.v2.model.LogicalClusterPlanBo;
import com.huaweicloud.sdk.dws.v2.model.MaintenanceWindow;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterDns;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterNameRequest;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterNameResponse;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterTimezoneRequest;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterTimezoneResponse;
import com.huaweicloud.sdk.dws.v2.model.NetResp;
import com.huaweicloud.sdk.dws.v2.model.PauseDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.PauseDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.ReconfigureExtDataSourceActionReq;
import com.huaweicloud.sdk.dws.v2.model.RedisPriorityConf;
import com.huaweicloud.sdk.dws.v2.model.RedistributionConf;
import com.huaweicloud.sdk.dws.v2.model.RedistributionReq;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterWithExistedNodesRequest;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterWithExistedNodesRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterWithExistedNodesResponse;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestartLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestartLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreDisasterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreDisasterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreRedistributionRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreRedistributionResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreTableRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreTableRequestBody;
import com.huaweicloud.sdk.dws.v2.model.RestoreTableResponse;
import com.huaweicloud.sdk.dws.v2.model.RotateKeyRequest;
import com.huaweicloud.sdk.dws.v2.model.RotateKeyRequestBody;
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
import com.huaweicloud.sdk.dws.v2.model.ShrinkLogicalClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ShrinkLogicalClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.SpecResizeRequest;
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
import com.huaweicloud.sdk.dws.v2.model.TrendQueryDataResp;
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
import com.huaweicloud.sdk.dws.v2.model.UpdateDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterPlanBo;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateLogicalClusterRequestBody;
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
import com.huaweicloud.sdk.dws.v2.model.UserAuthorityReq;
import com.huaweicloud.sdk.dws.v2.model.V2CreateClusterReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadPlanReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadPlanStageIdReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadPlanStageReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadQueueReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.WorkloadQueueUserReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadSchemaReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadStatusReq;

import java.util.List;

@SuppressWarnings("unchecked")
public class DwsMeta {

    public static final HttpRequestDef<AddQueueUserListRequest, AddQueueUserListResponse> addQueueUserList =
        genForAddQueueUserList();

    private static HttpRequestDef<AddQueueUserListRequest, AddQueueUserListResponse> genForAddQueueUserList() {
        // basic
        HttpRequestDef.Builder<AddQueueUserListRequest, AddQueueUserListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddQueueUserListRequest.class, AddQueueUserListResponse.class)
                .withName("AddQueueUserList")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues/{queue_name}/users/batch-create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddQueueUserListRequest::getClusterId, AddQueueUserListRequest::setClusterId));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddQueueUserListRequest::getQueueName, AddQueueUserListRequest::setQueueName));
        builder.<WorkloadQueueUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkloadQueueUserReq.class),
            f -> f.withMarshaller(AddQueueUserListRequest::getBody, AddQueueUserListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse> addSnapshotCrossRegionPolicy =
        genForAddSnapshotCrossRegionPolicy();

    private static HttpRequestDef<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse> genForAddSnapshotCrossRegionPolicy() {
        // basic
        HttpRequestDef.Builder<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddSnapshotCrossRegionPolicyRequest.class,
                    AddSnapshotCrossRegionPolicyResponse.class)
                .withName("AddSnapshotCrossRegionPolicy")
                .withUri("/v1/{project_id}/snapshots/cross-region-policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AddSnapshotCrossRegionPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSnapshotCrossRegionPolicyRequestBody.class),
            f -> f.withMarshaller(AddSnapshotCrossRegionPolicyRequest::getBody,
                AddSnapshotCrossRegionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddWorkloadPlanStageRequest, AddWorkloadPlanStageResponse> addWorkloadPlanStage =
        genForAddWorkloadPlanStage();

    private static HttpRequestDef<AddWorkloadPlanStageRequest, AddWorkloadPlanStageResponse> genForAddWorkloadPlanStage() {
        // basic
        HttpRequestDef.Builder<AddWorkloadPlanStageRequest, AddWorkloadPlanStageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddWorkloadPlanStageRequest.class, AddWorkloadPlanStageResponse.class)
            .withName("AddWorkloadPlanStage")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/stages")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddWorkloadPlanStageRequest::getClusterId,
                AddWorkloadPlanStageRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddWorkloadPlanStageRequest::getPlanId, AddWorkloadPlanStageRequest::setPlanId));
        builder.<WorkloadPlanStageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkloadPlanStageReq.class),
            f -> f.withMarshaller(AddWorkloadPlanStageRequest::getBody, AddWorkloadPlanStageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddWorkloadQueueRequest, AddWorkloadQueueResponse> addWorkloadQueue =
        genForAddWorkloadQueue();

    private static HttpRequestDef<AddWorkloadQueueRequest, AddWorkloadQueueResponse> genForAddWorkloadQueue() {
        // basic
        HttpRequestDef.Builder<AddWorkloadQueueRequest, AddWorkloadQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddWorkloadQueueRequest.class, AddWorkloadQueueResponse.class)
                .withName("AddWorkloadQueue")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddWorkloadQueueRequest::getClusterId, AddWorkloadQueueRequest::setClusterId));
        builder.<WorkloadQueueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkloadQueueReq.class),
            f -> f.withMarshaller(AddWorkloadQueueRequest::getBody, AddWorkloadQueueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddWorkloadRuleRequest, AddWorkloadRuleResponse> addWorkloadRule =
        genForAddWorkloadRule();

    private static HttpRequestDef<AddWorkloadRuleRequest, AddWorkloadRuleResponse> genForAddWorkloadRule() {
        // basic
        HttpRequestDef.Builder<AddWorkloadRuleRequest, AddWorkloadRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddWorkloadRuleRequest.class, AddWorkloadRuleResponse.class)
                .withName("AddWorkloadRule")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/workload/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddWorkloadRuleRequest::getClusterId, AddWorkloadRuleRequest::setClusterId));
        builder.<AddExceptRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddExceptRuleReq.class),
            f -> f.withMarshaller(AddWorkloadRuleRequest::getBody, AddWorkloadRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateEipRequest, AssociateEipResponse> associateEip = genForAssociateEip();

    private static HttpRequestDef<AssociateEipRequest, AssociateEipResponse> genForAssociateEip() {
        // basic
        HttpRequestDef.Builder<AssociateEipRequest, AssociateEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateEipRequest.class, AssociateEipResponse.class)
                .withName("AssociateEip")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/eips/{eip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateEipRequest::getClusterId, AssociateEipRequest::setClusterId));
        builder.<String>withRequestField("eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateEipRequest::getEipId, AssociateEipRequest::setEipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateElbRequest, AssociateElbResponse> associateElb = genForAssociateElb();

    private static HttpRequestDef<AssociateElbRequest, AssociateElbResponse> genForAssociateElb() {
        // basic
        HttpRequestDef.Builder<AssociateElbRequest, AssociateElbResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateElbRequest.class, AssociateElbResponse.class)
                .withName("AssociateElb")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/elbs/{elb_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateElbRequest::getClusterId, AssociateElbRequest::setClusterId));
        builder.<String>withRequestField("elb_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateElbRequest::getElbId, AssociateElbRequest::setElbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> batchCreateClusterCn =
        genForBatchCreateClusterCn();

    private static HttpRequestDef<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> genForBatchCreateClusterCn() {
        // basic
        HttpRequestDef.Builder<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateClusterCnRequest.class, BatchCreateClusterCnResponse.class)
            .withName("BatchCreateClusterCn")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cns/batch-create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateClusterCnRequest::getClusterId,
                BatchCreateClusterCnRequest::setClusterId));
        builder.<BatchCreateCn>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateCn.class),
            f -> f.withMarshaller(BatchCreateClusterCnRequest::getBody, BatchCreateClusterCnRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> batchCreateResourceTag =
        genForBatchCreateResourceTag();

    private static HttpRequestDef<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> genForBatchCreateResourceTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateResourceTagRequest.class, BatchCreateResourceTagResponse.class)
            .withName("BatchCreateResourceTag")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/tags/batch-create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceTagRequest::getClusterId,
                BatchCreateResourceTagRequest::setClusterId));
        builder.<BatchCreateResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTags.class),
            f -> f.withMarshaller(BatchCreateResourceTagRequest::getBody, BatchCreateResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> batchDeleteClusterCn =
        genForBatchDeleteClusterCn();

    private static HttpRequestDef<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> genForBatchDeleteClusterCn() {
        // basic
        HttpRequestDef.Builder<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteClusterCnRequest.class, BatchDeleteClusterCnResponse.class)
            .withName("BatchDeleteClusterCn")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cns/batch-delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteClusterCnRequest::getClusterId,
                BatchDeleteClusterCnRequest::setClusterId));
        builder.<BatchDeleteCn>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteCn.class),
            f -> f.withMarshaller(BatchDeleteClusterCnRequest::getBody, BatchDeleteClusterCnRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTag =
        genForBatchDeleteResourceTag();

    private static HttpRequestDef<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> genForBatchDeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteResourceTagRequest.class, BatchDeleteResourceTagResponse.class)
            .withName("BatchDeleteResourceTag")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/tags/batch-delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getClusterId,
                BatchDeleteResourceTagRequest::setClusterId));
        builder.<BatchDeleteResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTags.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getBody, BatchDeleteResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> cancelReadonlyCluster =
        genForCancelReadonlyCluster();

    private static HttpRequestDef<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> genForCancelReadonlyCluster() {
        // basic
        HttpRequestDef.Builder<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelReadonlyClusterRequest.class, CancelReadonlyClusterResponse.class)
            .withName("CancelReadonlyCluster")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cancel-readonly")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelReadonlyClusterRequest::getClusterId,
                CancelReadonlyClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroup =
        genForChangeSecurityGroup();

    private static HttpRequestDef<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> genForChangeSecurityGroup() {
        // basic
        HttpRequestDef.Builder<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeSecurityGroupRequest.class, ChangeSecurityGroupResponse.class)
                .withName("ChangeSecurityGroup")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/security-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeSecurityGroupRequest::getClusterId, ChangeSecurityGroupRequest::setClusterId));
        builder.<ChangeSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSecurityGroupRequestBody.class),
            f -> f.withMarshaller(ChangeSecurityGroupRequest::getBody, ChangeSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckClusterRequest, CheckClusterResponse> checkCluster = genForCheckCluster();

    private static HttpRequestDef<CheckClusterRequest, CheckClusterResponse> genForCheckCluster() {
        // basic
        HttpRequestDef.Builder<CheckClusterRequest, CheckClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckClusterRequest.class, CheckClusterResponse.class)
                .withName("CheckCluster")
                .withUri("/v2/{project_id}/cluster-precheck")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ClusterCheckRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterCheckRequestBody.class),
            f -> f.withMarshaller(CheckClusterRequest::getBody, CheckClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckClusterShrinkRequest, CheckClusterShrinkResponse> checkClusterShrink =
        genForCheckClusterShrink();

    private static HttpRequestDef<CheckClusterShrinkRequest, CheckClusterShrinkResponse> genForCheckClusterShrink() {
        // basic
        HttpRequestDef.Builder<CheckClusterShrinkRequest, CheckClusterShrinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckClusterShrinkRequest.class, CheckClusterShrinkResponse.class)
                .withName("CheckClusterShrink")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/shrink-check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckClusterShrinkRequest::getClusterId, CheckClusterShrinkRequest::setClusterId));
        builder.<String>withRequestField("check_item",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckClusterShrinkRequest::getCheckItem, CheckClusterShrinkRequest::setCheckItem));
        builder.<Integer>withRequestField("shrink_count",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckClusterShrinkRequest::getShrinkCount,
                CheckClusterShrinkRequest::setShrinkCount));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDisasterNameRequest, CheckDisasterNameResponse> checkDisasterName =
        genForCheckDisasterName();

    private static HttpRequestDef<CheckDisasterNameRequest, CheckDisasterNameResponse> genForCheckDisasterName() {
        // basic
        HttpRequestDef.Builder<CheckDisasterNameRequest, CheckDisasterNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckDisasterNameRequest.class, CheckDisasterNameResponse.class)
                .withName("CheckDisasterName")
                .withUri("/v2/{project_id}/disaster-recovery/check-name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dr_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterNameRequest::getDrName, CheckDisasterNameRequest::setDrName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterNameRequest::getType, CheckDisasterNameRequest::setType));
        builder.<String>withRequestField("standby_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterNameRequest::getStandbyRegion,
                CheckDisasterNameRequest::setStandbyRegion));
        builder.<String>withRequestField("standby_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterNameRequest::getStandbyProjectId,
                CheckDisasterNameRequest::setStandbyProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckGrowClusterRequest, CheckGrowClusterResponse> checkGrowCluster =
        genForCheckGrowCluster();

    private static HttpRequestDef<CheckGrowClusterRequest, CheckGrowClusterResponse> genForCheckGrowCluster() {
        // basic
        HttpRequestDef.Builder<CheckGrowClusterRequest, CheckGrowClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckGrowClusterRequest.class, CheckGrowClusterResponse.class)
                .withName("CheckGrowCluster")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/grow-check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckGrowClusterRequest::getClusterId, CheckGrowClusterRequest::setClusterId));
        builder.<ResizeClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeClusterRequestBody.class),
            f -> f.withMarshaller(CheckGrowClusterRequest::getBody, CheckGrowClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTableRestoreRequest, CheckTableRestoreResponse> checkTableRestore =
        genForCheckTableRestore();

    private static HttpRequestDef<CheckTableRestoreRequest, CheckTableRestoreResponse> genForCheckTableRestore() {
        // basic
        HttpRequestDef.Builder<CheckTableRestoreRequest, CheckTableRestoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckTableRestoreRequest.class, CheckTableRestoreResponse.class)
                .withName("CheckTableRestore")
                .withUri("/v1/{project_id}/snapshots/{snapshot_id}/table-restore-check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTableRestoreRequest::getSnapshotId, CheckTableRestoreRequest::setSnapshotId));
        builder.<CheckTableRestoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckTableRestoreRequestBody.class),
            f -> f.withMarshaller(CheckTableRestoreRequest::getBody, CheckTableRestoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConvertToLogicalClusterRequest, ConvertToLogicalClusterResponse> convertToLogicalCluster =
        genForConvertToLogicalCluster();

    private static HttpRequestDef<ConvertToLogicalClusterRequest, ConvertToLogicalClusterResponse> genForConvertToLogicalCluster() {
        // basic
        HttpRequestDef.Builder<ConvertToLogicalClusterRequest, ConvertToLogicalClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ConvertToLogicalClusterRequest.class, ConvertToLogicalClusterResponse.class)
            .withName("ConvertToLogicalCluster")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/convert-to-logical-cluster/{name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConvertToLogicalClusterRequest::getClusterId,
                ConvertToLogicalClusterRequest::setClusterId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConvertToLogicalClusterRequest::getName, ConvertToLogicalClusterRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopySnapshotRequest, CopySnapshotResponse> copySnapshot = genForCopySnapshot();

    private static HttpRequestDef<CopySnapshotRequest, CopySnapshotResponse> genForCopySnapshot() {
        // basic
        HttpRequestDef.Builder<CopySnapshotRequest, CopySnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopySnapshotRequest.class, CopySnapshotResponse.class)
                .withName("CopySnapshot")
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}/linked-copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopySnapshotRequest::getSnapshotId, CopySnapshotRequest::setSnapshotId));
        builder.<LinkCopyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LinkCopyReq.class),
            f -> f.withMarshaller(CopySnapshotRequest::getBody, CopySnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmSubRequest, CreateAlarmSubResponse> createAlarmSub =
        genForCreateAlarmSub();

    private static HttpRequestDef<CreateAlarmSubRequest, CreateAlarmSubResponse> genForCreateAlarmSub() {
        // basic
        HttpRequestDef.Builder<CreateAlarmSubRequest, CreateAlarmSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmSubRequest.class, CreateAlarmSubResponse.class)
                .withName("CreateAlarmSub")
                .withUri("/v2/{project_id}/alarm-subs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AlarmSubRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmSubRequest.class),
            f -> f.withMarshaller(CreateAlarmSubRequest::getBody, CreateAlarmSubRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForCreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForCreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterRequestBody.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, CreateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterDnsRequest, CreateClusterDnsResponse> createClusterDns =
        genForCreateClusterDns();

    private static HttpRequestDef<CreateClusterDnsRequest, CreateClusterDnsResponse> genForCreateClusterDns() {
        // basic
        HttpRequestDef.Builder<CreateClusterDnsRequest, CreateClusterDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterDnsRequest.class, CreateClusterDnsResponse.class)
                .withName("CreateClusterDns")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/dns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterDnsRequest::getClusterId, CreateClusterDnsRequest::setClusterId));
        builder.<CreateClusterDns>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterDns.class),
            f -> f.withMarshaller(CreateClusterDnsRequest::getBody, CreateClusterDnsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterV2Request, CreateClusterV2Response> createClusterV2 =
        genForCreateClusterV2();

    private static HttpRequestDef<CreateClusterV2Request, CreateClusterV2Response> genForCreateClusterV2() {
        // basic
        HttpRequestDef.Builder<CreateClusterV2Request, CreateClusterV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterV2Request.class, CreateClusterV2Response.class)
                .withName("CreateClusterV2")
                .withUri("/v2/{project_id}/clusters")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<V2CreateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(V2CreateClusterReq.class),
            f -> f.withMarshaller(CreateClusterV2Request::getBody, CreateClusterV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> createClusterWorkload =
        genForCreateClusterWorkload();

    private static HttpRequestDef<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> genForCreateClusterWorkload() {
        // basic
        HttpRequestDef.Builder<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateClusterWorkloadRequest.class, CreateClusterWorkloadResponse.class)
            .withName("CreateClusterWorkload")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterWorkloadRequest::getClusterId,
                CreateClusterWorkloadRequest::setClusterId));
        builder.<WorkloadStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkloadStatusReq.class),
            f -> f.withMarshaller(CreateClusterWorkloadRequest::getBody, CreateClusterWorkloadRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataSourceRequest, CreateDataSourceResponse> createDataSource =
        genForCreateDataSource();

    private static HttpRequestDef<CreateDataSourceRequest, CreateDataSourceResponse> genForCreateDataSource() {
        // basic
        HttpRequestDef.Builder<CreateDataSourceRequest, CreateDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataSourceRequest.class, CreateDataSourceResponse.class)
                .withName("CreateDataSource")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ext-data-sources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataSourceRequest::getClusterId, CreateDataSourceRequest::setClusterId));
        builder.<ExtDataSourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtDataSourceReq.class),
            f -> f.withMarshaller(CreateDataSourceRequest::getBody, CreateDataSourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUser =
        genForCreateDatabaseUser();

    private static HttpRequestDef<CreateDatabaseUserRequest, CreateDatabaseUserResponse> genForCreateDatabaseUser() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseUserRequest, CreateDatabaseUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseUserRequest.class, CreateDatabaseUserResponse.class)
                .withName("CreateDatabaseUser")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseUserRequest::getClusterId, CreateDatabaseUserRequest::setClusterId));
        builder.<UserAuthorityReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UserAuthorityReq.class),
            f -> f.withMarshaller(CreateDatabaseUserRequest::getBody, CreateDatabaseUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecovery =
        genForCreateDisasterRecovery();

    private static HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> genForCreateDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDisasterRecoveryRequest.class, CreateDisasterRecoveryResponse.class)
            .withName("CreateDisasterRecovery")
            .withUri("/v2/{project_id}/disaster-recoveries")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDisasterRecoveryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDisasterRecoveryReq.class),
            f -> f.withMarshaller(CreateDisasterRecoveryRequest::getBody, CreateDisasterRecoveryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEventSubRequest, CreateEventSubResponse> createEventSub =
        genForCreateEventSub();

    private static HttpRequestDef<CreateEventSubRequest, CreateEventSubResponse> genForCreateEventSub() {
        // basic
        HttpRequestDef.Builder<CreateEventSubRequest, CreateEventSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventSubRequest.class, CreateEventSubResponse.class)
                .withName("CreateEventSub")
                .withUri("/v2/{project_id}/event-subs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<EventSubRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventSubRequest.class),
            f -> f.withMarshaller(CreateEventSubRequest::getBody, CreateEventSubRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogicalClusterRequest, CreateLogicalClusterResponse> createLogicalCluster =
        genForCreateLogicalCluster();

    private static HttpRequestDef<CreateLogicalClusterRequest, CreateLogicalClusterResponse> genForCreateLogicalCluster() {
        // basic
        HttpRequestDef.Builder<CreateLogicalClusterRequest, CreateLogicalClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateLogicalClusterRequest.class, CreateLogicalClusterResponse.class)
            .withName("CreateLogicalCluster")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogicalClusterRequest::getClusterId,
                CreateLogicalClusterRequest::setClusterId));
        builder.<CreateLogicalClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogicalClusterRequestBody.class),
            f -> f.withMarshaller(CreateLogicalClusterRequest::getBody, CreateLogicalClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogicalClusterPlanRequest, CreateLogicalClusterPlanResponse> createLogicalClusterPlan =
        genForCreateLogicalClusterPlan();

    private static HttpRequestDef<CreateLogicalClusterPlanRequest, CreateLogicalClusterPlanResponse> genForCreateLogicalClusterPlan() {
        // basic
        HttpRequestDef.Builder<CreateLogicalClusterPlanRequest, CreateLogicalClusterPlanResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateLogicalClusterPlanRequest.class, CreateLogicalClusterPlanResponse.class)
                .withName("CreateLogicalClusterPlan")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/logical-cluster-plans")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogicalClusterPlanRequest::getClusterId,
                CreateLogicalClusterPlanRequest::setClusterId));
        builder.<LogicalClusterPlanBo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogicalClusterPlanBo.class),
            f -> f.withMarshaller(CreateLogicalClusterPlanRequest::getBody, CreateLogicalClusterPlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot =
        genForCreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForCreateSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotRequest, CreateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotRequest.class, CreateSnapshotResponse.class)
                .withName("CreateSnapshot")
                .withUri("/v1.0/{project_id}/snapshots")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSnapshotRequestBody.class),
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, CreateSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> createSnapshotPolicy =
        genForCreateSnapshotPolicy();

    private static HttpRequestDef<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> genForCreateSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, CreateSnapshotPolicyRequest.class, CreateSnapshotPolicyResponse.class)
            .withName("CreateSnapshotPolicy")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/snapshot-policies")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSnapshotPolicyRequest::getClusterId,
                CreateSnapshotPolicyRequest::setClusterId));
        builder.<CreateSnapshotPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSnapshotPolicyRequestBody.class),
            f -> f.withMarshaller(CreateSnapshotPolicyRequest::getBody, CreateSnapshotPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> createWorkloadPlan =
        genForCreateWorkloadPlan();

    private static HttpRequestDef<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> genForCreateWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkloadPlanRequest.class, CreateWorkloadPlanResponse.class)
                .withName("CreateWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkloadPlanRequest::getClusterId, CreateWorkloadPlanRequest::setClusterId));
        builder.<WorkloadPlanReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkloadPlanReq.class),
            f -> f.withMarshaller(CreateWorkloadPlanRequest::getBody, CreateWorkloadPlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmSubRequest, DeleteAlarmSubResponse> deleteAlarmSub =
        genForDeleteAlarmSub();

    private static HttpRequestDef<DeleteAlarmSubRequest, DeleteAlarmSubResponse> genForDeleteAlarmSub() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmSubRequest, DeleteAlarmSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmSubRequest.class, DeleteAlarmSubResponse.class)
                .withName("DeleteAlarmSub")
                .withUri("/v2/{project_id}/alarm-subs/{alarm_sub_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_sub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlarmSubRequest::getAlarmSubId, DeleteAlarmSubRequest::setAlarmSubId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genForDeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genForDeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, DeleteClusterRequest::setClusterId));
        builder.<DeleteClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteClusterRequestBody.class),
            f -> f.withMarshaller(DeleteClusterRequest::getBody, DeleteClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterDnsRequest, DeleteClusterDnsResponse> deleteClusterDns =
        genForDeleteClusterDns();

    private static HttpRequestDef<DeleteClusterDnsRequest, DeleteClusterDnsResponse> genForDeleteClusterDns() {
        // basic
        HttpRequestDef.Builder<DeleteClusterDnsRequest, DeleteClusterDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterDnsRequest.class, DeleteClusterDnsResponse.class)
                .withName("DeleteClusterDns")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/dns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterDnsRequest::getClusterId, DeleteClusterDnsRequest::setClusterId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterDnsRequest::getType, DeleteClusterDnsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterNodesRequest, DeleteClusterNodesResponse> deleteClusterNodes =
        genForDeleteClusterNodes();

    private static HttpRequestDef<DeleteClusterNodesRequest, DeleteClusterNodesResponse> genForDeleteClusterNodes() {
        // basic
        HttpRequestDef.Builder<DeleteClusterNodesRequest, DeleteClusterNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteClusterNodesRequest.class, DeleteClusterNodesResponse.class)
                .withName("DeleteClusterNodes")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/nodes/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterNodesRequest::getClusterId, DeleteClusterNodesRequest::setClusterId));
        builder.<DeleteClusterNodesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteClusterNodesRequestBody.class),
            f -> f.withMarshaller(DeleteClusterNodesRequest::getBody, DeleteClusterNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataSourceRequest, DeleteDataSourceResponse> deleteDataSource =
        genForDeleteDataSource();

    private static HttpRequestDef<DeleteDataSourceRequest, DeleteDataSourceResponse> genForDeleteDataSource() {
        // basic
        HttpRequestDef.Builder<DeleteDataSourceRequest, DeleteDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDataSourceRequest.class, DeleteDataSourceResponse.class)
                .withName("DeleteDataSource")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ext-data-sources/{ext_data_source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataSourceRequest::getClusterId, DeleteDataSourceRequest::setClusterId));
        builder.<String>withRequestField("ext_data_source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataSourceRequest::getExtDataSourceId,
                DeleteDataSourceRequest::setExtDataSourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> deleteDatabaseUser =
        genForDeleteDatabaseUser();

    private static HttpRequestDef<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> genForDeleteDatabaseUser() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseUserRequest.class, DeleteDatabaseUserResponse.class)
                .withName("DeleteDatabaseUser")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseUserRequest::getClusterId, DeleteDatabaseUserRequest::setClusterId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseUserRequest::getName, DeleteDatabaseUserRequest::setName));
        builder.<Boolean>withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseUserRequest::getCascade, DeleteDatabaseUserRequest::setCascade));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecovery =
        genForDeleteDisasterRecovery();

    private static HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> genForDeleteDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDisasterRecoveryRequest.class, DeleteDisasterRecoveryResponse.class)
            .withName("DeleteDisasterRecovery")
            .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDisasterRecoveryRequest::getDisasterRecoveryId,
                DeleteDisasterRecoveryRequest::setDisasterRecoveryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDwsClusterRequest, DeleteDwsClusterResponse> deleteDwsCluster =
        genForDeleteDwsCluster();

    private static HttpRequestDef<DeleteDwsClusterRequest, DeleteDwsClusterResponse> genForDeleteDwsCluster() {
        // basic
        HttpRequestDef.Builder<DeleteDwsClusterRequest, DeleteDwsClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDwsClusterRequest.class, DeleteDwsClusterResponse.class)
                .withName("DeleteDwsCluster")
                .withUri("/v2/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDwsClusterRequest::getClusterId, DeleteDwsClusterRequest::setClusterId));
        builder.<String>withRequestField("keep_last_manual_backup",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDwsClusterRequest::getKeepLastManualBackup,
                DeleteDwsClusterRequest::setKeepLastManualBackup));
        builder.<String>withRequestField("release_eip_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDwsClusterRequest::getReleaseEipType,
                DeleteDwsClusterRequest::setReleaseEipType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventSubRequest, DeleteEventSubResponse> deleteEventSub =
        genForDeleteEventSub();

    private static HttpRequestDef<DeleteEventSubRequest, DeleteEventSubResponse> genForDeleteEventSub() {
        // basic
        HttpRequestDef.Builder<DeleteEventSubRequest, DeleteEventSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEventSubRequest.class, DeleteEventSubResponse.class)
                .withName("DeleteEventSub")
                .withUri("/v2/{project_id}/event-subs/{event_sub_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_sub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventSubRequest::getEventSubId, DeleteEventSubRequest::setEventSubId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogicalClusterRequest, DeleteLogicalClusterResponse> deleteLogicalCluster =
        genForDeleteLogicalCluster();

    private static HttpRequestDef<DeleteLogicalClusterRequest, DeleteLogicalClusterResponse> genForDeleteLogicalCluster() {
        // basic
        HttpRequestDef.Builder<DeleteLogicalClusterRequest, DeleteLogicalClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteLogicalClusterRequest.class, DeleteLogicalClusterResponse.class)
            .withName("DeleteLogicalCluster")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters/{logical_cluster_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalClusterRequest::getClusterId,
                DeleteLogicalClusterRequest::setClusterId));
        builder.<String>withRequestField("logical_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalClusterRequest::getLogicalClusterId,
                DeleteLogicalClusterRequest::setLogicalClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogicalClusterPlanRequest, DeleteLogicalClusterPlanResponse> deleteLogicalClusterPlan =
        genForDeleteLogicalClusterPlan();

    private static HttpRequestDef<DeleteLogicalClusterPlanRequest, DeleteLogicalClusterPlanResponse> genForDeleteLogicalClusterPlan() {
        // basic
        HttpRequestDef.Builder<DeleteLogicalClusterPlanRequest, DeleteLogicalClusterPlanResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteLogicalClusterPlanRequest.class,
                    DeleteLogicalClusterPlanResponse.class)
                .withName("DeleteLogicalClusterPlan")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/logical-cluster-plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalClusterPlanRequest::getClusterId,
                DeleteLogicalClusterPlanRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalClusterPlanRequest::getPlanId,
                DeleteLogicalClusterPlanRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueUserListRequest, DeleteQueueUserListResponse> deleteQueueUserList =
        genForDeleteQueueUserList();

    private static HttpRequestDef<DeleteQueueUserListRequest, DeleteQueueUserListResponse> genForDeleteQueueUserList() {
        // basic
        HttpRequestDef.Builder<DeleteQueueUserListRequest, DeleteQueueUserListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteQueueUserListRequest.class, DeleteQueueUserListResponse.class)
                .withName("DeleteQueueUserList")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues/{queue_name}/users/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueUserListRequest::getClusterId, DeleteQueueUserListRequest::setClusterId));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueUserListRequest::getQueueName, DeleteQueueUserListRequest::setQueueName));
        builder.<WorkloadQueueUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkloadQueueUserReq.class),
            f -> f.withMarshaller(DeleteQueueUserListRequest::getBody, DeleteQueueUserListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot =
        genForDeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genForDeleteSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotRequest, DeleteSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSnapshotRequest.class, DeleteSnapshotResponse.class)
                .withName("DeleteSnapshot")
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, DeleteSnapshotRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse> deleteSnapshotCrossRegionPolicy =
        genForDeleteSnapshotCrossRegionPolicy();

    private static HttpRequestDef<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse> genForDeleteSnapshotCrossRegionPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSnapshotCrossRegionPolicyRequest.class,
                    DeleteSnapshotCrossRegionPolicyResponse.class)
                .withName("DeleteSnapshotCrossRegionPolicy")
                .withUri("/v1/{project_id}/snapshots/cross-region-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotCrossRegionPolicyRequest::getClusterId,
                DeleteSnapshotCrossRegionPolicyRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> deleteSnapshotPolicy =
        genForDeleteSnapshotPolicy();

    private static HttpRequestDef<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> genForDeleteSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSnapshotPolicyRequest.class, DeleteSnapshotPolicyResponse.class)
            .withName("DeleteSnapshotPolicy")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/snapshot-policies/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotPolicyRequest::getClusterId,
                DeleteSnapshotPolicyRequest::setClusterId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotPolicyRequest::getId, DeleteSnapshotPolicyRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse> deleteWorkloadPlan =
        genForDeleteWorkloadPlan();

    private static HttpRequestDef<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse> genForDeleteWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkloadPlanRequest.class, DeleteWorkloadPlanResponse.class)
                .withName("DeleteWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadPlanRequest::getClusterId, DeleteWorkloadPlanRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadPlanRequest::getPlanId, DeleteWorkloadPlanRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkloadPlanStageRequest, DeleteWorkloadPlanStageResponse> deleteWorkloadPlanStage =
        genForDeleteWorkloadPlanStage();

    private static HttpRequestDef<DeleteWorkloadPlanStageRequest, DeleteWorkloadPlanStageResponse> genForDeleteWorkloadPlanStage() {
        // basic
        HttpRequestDef.Builder<DeleteWorkloadPlanStageRequest, DeleteWorkloadPlanStageResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWorkloadPlanStageRequest.class, DeleteWorkloadPlanStageResponse.class)
            .withName("DeleteWorkloadPlanStage")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/stages/{stage_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadPlanStageRequest::getClusterId,
                DeleteWorkloadPlanStageRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadPlanStageRequest::getPlanId,
                DeleteWorkloadPlanStageRequest::setPlanId));
        builder.<String>withRequestField("stage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadPlanStageRequest::getStageId,
                DeleteWorkloadPlanStageRequest::setStageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> deleteWorkloadQueue =
        genForDeleteWorkloadQueue();

    private static HttpRequestDef<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> genForDeleteWorkloadQueue() {
        // basic
        HttpRequestDef.Builder<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWorkloadQueueRequest.class, DeleteWorkloadQueueResponse.class)
            .withName("DeleteWorkloadQueue")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadQueueRequest::getClusterId, DeleteWorkloadQueueRequest::setClusterId));
        builder.<String>withRequestField("logical_cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadQueueRequest::getLogicalClusterName,
                DeleteWorkloadQueueRequest::setLogicalClusterName));
        builder.<String>withRequestField("workload_queue_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadQueueRequest::getWorkloadQueueName,
                DeleteWorkloadQueueRequest::setWorkloadQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkloadRuleRequest, DeleteWorkloadRuleResponse> deleteWorkloadRule =
        genForDeleteWorkloadRule();

    private static HttpRequestDef<DeleteWorkloadRuleRequest, DeleteWorkloadRuleResponse> genForDeleteWorkloadRule() {
        // basic
        HttpRequestDef.Builder<DeleteWorkloadRuleRequest, DeleteWorkloadRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkloadRuleRequest.class, DeleteWorkloadRuleResponse.class)
                .withName("DeleteWorkloadRule")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/workload/rules/{rule_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadRuleRequest::getClusterId, DeleteWorkloadRuleRequest::setClusterId));
        builder.<String>withRequestField("rule_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadRuleRequest::getRuleName, DeleteWorkloadRuleRequest::setRuleName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableLogicalClusterPlanRequest, DisableLogicalClusterPlanResponse> disableLogicalClusterPlan =
        genForDisableLogicalClusterPlan();

    private static HttpRequestDef<DisableLogicalClusterPlanRequest, DisableLogicalClusterPlanResponse> genForDisableLogicalClusterPlan() {
        // basic
        HttpRequestDef.Builder<DisableLogicalClusterPlanRequest, DisableLogicalClusterPlanResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisableLogicalClusterPlanRequest.class,
                    DisableLogicalClusterPlanResponse.class)
                .withName("DisableLogicalClusterPlan")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/logical-cluster-plans/{plan_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableLogicalClusterPlanRequest::getClusterId,
                DisableLogicalClusterPlanRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableLogicalClusterPlanRequest::getPlanId,
                DisableLogicalClusterPlanRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableLtsLogsRequest, DisableLtsLogsResponse> disableLtsLogs =
        genForDisableLtsLogs();

    private static HttpRequestDef<DisableLtsLogsRequest, DisableLtsLogsResponse> genForDisableLtsLogs() {
        // basic
        HttpRequestDef.Builder<DisableLtsLogsRequest, DisableLtsLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableLtsLogsRequest.class, DisableLtsLogsResponse.class)
                .withName("DisableLtsLogs")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/lts-logs/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableLtsLogsRequest::getClusterId, DisableLtsLogsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateEipRequest, DisassociateEipResponse> disassociateEip =
        genForDisassociateEip();

    private static HttpRequestDef<DisassociateEipRequest, DisassociateEipResponse> genForDisassociateEip() {
        // basic
        HttpRequestDef.Builder<DisassociateEipRequest, DisassociateEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateEipRequest.class, DisassociateEipResponse.class)
                .withName("DisassociateEip")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/eips/{eip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateEipRequest::getClusterId, DisassociateEipRequest::setClusterId));
        builder.<String>withRequestField("eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateEipRequest::getEipId, DisassociateEipRequest::setEipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateElbRequest, DisassociateElbResponse> disassociateElb =
        genForDisassociateElb();

    private static HttpRequestDef<DisassociateElbRequest, DisassociateElbResponse> genForDisassociateElb() {
        // basic
        HttpRequestDef.Builder<DisassociateElbRequest, DisassociateElbResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateElbRequest.class, DisassociateElbResponse.class)
                .withName("DisassociateElb")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/elbs/{elb_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateElbRequest::getClusterId, DisassociateElbRequest::setClusterId));
        builder.<String>withRequestField("elb_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateElbRequest::getElbId, DisassociateElbRequest::setElbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableLogicalClusterRequest, EnableLogicalClusterResponse> enableLogicalCluster =
        genForEnableLogicalCluster();

    private static HttpRequestDef<EnableLogicalClusterRequest, EnableLogicalClusterResponse> genForEnableLogicalCluster() {
        // basic
        HttpRequestDef.Builder<EnableLogicalClusterRequest, EnableLogicalClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, EnableLogicalClusterRequest.class, EnableLogicalClusterResponse.class)
            .withName("EnableLogicalCluster")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters/enable")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableLogicalClusterRequest::getClusterId,
                EnableLogicalClusterRequest::setClusterId));
        builder.<EnableLogicalClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnableLogicalClusterRequestBody.class),
            f -> f.withMarshaller(EnableLogicalClusterRequest::getBody, EnableLogicalClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableLogicalClusterPlanRequest, EnableLogicalClusterPlanResponse> enableLogicalClusterPlan =
        genForEnableLogicalClusterPlan();

    private static HttpRequestDef<EnableLogicalClusterPlanRequest, EnableLogicalClusterPlanResponse> genForEnableLogicalClusterPlan() {
        // basic
        HttpRequestDef.Builder<EnableLogicalClusterPlanRequest, EnableLogicalClusterPlanResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, EnableLogicalClusterPlanRequest.class, EnableLogicalClusterPlanResponse.class)
                .withName("EnableLogicalClusterPlan")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/logical-cluster-plans/{plan_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableLogicalClusterPlanRequest::getClusterId,
                EnableLogicalClusterPlanRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableLogicalClusterPlanRequest::getPlanId,
                EnableLogicalClusterPlanRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogs =
        genForEnableLtsLogs();

    private static HttpRequestDef<EnableLtsLogsRequest, EnableLtsLogsResponse> genForEnableLtsLogs() {
        // basic
        HttpRequestDef.Builder<EnableLtsLogsRequest, EnableLtsLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableLtsLogsRequest.class, EnableLtsLogsResponse.class)
                .withName("EnableLtsLogs")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/lts-logs/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableLtsLogsRequest::getClusterId, EnableLtsLogsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EncryptClusterRequest, EncryptClusterResponse> encryptCluster =
        genForEncryptCluster();

    private static HttpRequestDef<EncryptClusterRequest, EncryptClusterResponse> genForEncryptCluster() {
        // basic
        HttpRequestDef.Builder<EncryptClusterRequest, EncryptClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EncryptClusterRequest.class, EncryptClusterResponse.class)
                .withName("EncryptCluster")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/encrypt")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EncryptClusterRequest::getClusterId, EncryptClusterRequest::setClusterId));
        builder.<EncryptClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptClusterReq.class),
            f -> f.withMarshaller(EncryptClusterRequest::getBody, EncryptClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse> executeClusterUpgradeAction =
        genForExecuteClusterUpgradeAction();

    private static HttpRequestDef<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse> genForExecuteClusterUpgradeAction() {
        // basic
        HttpRequestDef.Builder<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteClusterUpgradeActionRequest.class,
                    ExecuteClusterUpgradeActionResponse.class)
                .withName("ExecuteClusterUpgradeAction")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/upgrade-management/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteClusterUpgradeActionRequest::getClusterId,
                ExecuteClusterUpgradeActionRequest::setClusterId));
        builder.<ExecuteClusterUpgradeActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteClusterUpgradeActionRequestBody.class),
            f -> f.withMarshaller(ExecuteClusterUpgradeActionRequest::getBody,
                ExecuteClusterUpgradeActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse> executeDatabaseOmUserAction =
        genForExecuteDatabaseOmUserAction();

    private static HttpRequestDef<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse> genForExecuteDatabaseOmUserAction() {
        // basic
        HttpRequestDef.Builder<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteDatabaseOmUserActionRequest.class,
                    ExecuteDatabaseOmUserActionResponse.class)
                .withName("ExecuteDatabaseOmUserAction")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/om-user/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDatabaseOmUserActionRequest::getClusterId,
                ExecuteDatabaseOmUserActionRequest::setClusterId));
        builder.<DatabaseOmUserActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseOmUserActionReq.class),
            f -> f.withMarshaller(ExecuteDatabaseOmUserActionRequest::getBody,
                ExecuteDatabaseOmUserActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteFlavorChangeRequest, ExecuteFlavorChangeResponse> executeFlavorChange =
        genForExecuteFlavorChange();

    private static HttpRequestDef<ExecuteFlavorChangeRequest, ExecuteFlavorChangeResponse> genForExecuteFlavorChange() {
        // basic
        HttpRequestDef.Builder<ExecuteFlavorChangeRequest, ExecuteFlavorChangeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteFlavorChangeRequest.class, ExecuteFlavorChangeResponse.class)
                .withName("ExecuteFlavorChange")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/flavor")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteFlavorChangeRequest::getClusterId, ExecuteFlavorChangeRequest::setClusterId));
        builder.<SpecResizeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SpecResizeRequest.class),
            f -> f.withMarshaller(ExecuteFlavorChangeRequest::getBody, ExecuteFlavorChangeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> executeRedistributionCluster =
        genForExecuteRedistributionCluster();

    private static HttpRequestDef<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> genForExecuteRedistributionCluster() {
        // basic
        HttpRequestDef.Builder<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteRedistributionClusterRequest.class,
                    ExecuteRedistributionClusterResponse.class)
                .withName("ExecuteRedistributionCluster")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteRedistributionClusterRequest::getClusterId,
                ExecuteRedistributionClusterRequest::setClusterId));
        builder.<RedistributionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedistributionReq.class),
            f -> f.withMarshaller(ExecuteRedistributionClusterRequest::getBody,
                ExecuteRedistributionClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> expandInstanceStorage =
        genForExpandInstanceStorage();

    private static HttpRequestDef<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> genForExpandInstanceStorage() {
        // basic
        HttpRequestDef.Builder<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExpandInstanceStorageRequest.class, ExpandInstanceStorageResponse.class)
            .withName("ExpandInstanceStorage")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/expand-instance-storage")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandInstanceStorageRequest::getClusterId,
                ExpandInstanceStorageRequest::setClusterId));
        builder.<ExpandInstanceStorage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandInstanceStorage.class),
            f -> f.withMarshaller(ExpandInstanceStorageRequest::getBody, ExpandInstanceStorageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDatabaseUsersRequest, ExportDatabaseUsersResponse> exportDatabaseUsers =
        genForExportDatabaseUsers();

    private static HttpRequestDef<ExportDatabaseUsersRequest, ExportDatabaseUsersResponse> genForExportDatabaseUsers() {
        // basic
        HttpRequestDef.Builder<ExportDatabaseUsersRequest, ExportDatabaseUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportDatabaseUsersRequest.class, ExportDatabaseUsersResponse.class)
                .withName("ExportDatabaseUsers")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDatabaseUsersRequest::getClusterId, ExportDatabaseUsersRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportDatabaseUsersRequest::getOffset, ExportDatabaseUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportDatabaseUsersRequest::getLimit, ExportDatabaseUsersRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDatabaseUsersRequest::getType, ExportDatabaseUsersRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserAuthorityRequest, ExportUserAuthorityResponse> exportUserAuthority =
        genForExportUserAuthority();

    private static HttpRequestDef<ExportUserAuthorityRequest, ExportUserAuthorityResponse> genForExportUserAuthority() {
        // basic
        HttpRequestDef.Builder<ExportUserAuthorityRequest, ExportUserAuthorityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportUserAuthorityRequest.class, ExportUserAuthorityResponse.class)
                .withName("ExportUserAuthority")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users/{name}/authority/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserAuthorityRequest::getClusterId, ExportUserAuthorityRequest::setClusterId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserAuthorityRequest::getName, ExportUserAuthorityRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportUserAuthorityRequest::getOffset, ExportUserAuthorityRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportUserAuthorityRequest::getLimit, ExportUserAuthorityRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmConfigsRequest, ListAlarmConfigsResponse> listAlarmConfigs =
        genForListAlarmConfigs();

    private static HttpRequestDef<ListAlarmConfigsRequest, ListAlarmConfigsResponse> genForListAlarmConfigs() {
        // basic
        HttpRequestDef.Builder<ListAlarmConfigsRequest, ListAlarmConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmConfigsRequest.class, ListAlarmConfigsResponse.class)
                .withName("ListAlarmConfigs")
                .withUri("/v2/{project_id}/alarm-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmConfigsRequest::getOffset, ListAlarmConfigsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmConfigsRequest::getLimit, ListAlarmConfigsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmDetailRequest, ListAlarmDetailResponse> listAlarmDetail =
        genForListAlarmDetail();

    private static HttpRequestDef<ListAlarmDetailRequest, ListAlarmDetailResponse> genForListAlarmDetail() {
        // basic
        HttpRequestDef.Builder<ListAlarmDetailRequest, ListAlarmDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmDetailRequest.class, ListAlarmDetailResponse.class)
                .withName("ListAlarmDetail")
                .withUri("/v2/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmDetailRequest::getTimeZone, ListAlarmDetailRequest::setTimeZone));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmDetailRequest::getOffset, ListAlarmDetailRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmDetailRequest::getLimit, ListAlarmDetailRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmStatisticRequest, ListAlarmStatisticResponse> listAlarmStatistic =
        genForListAlarmStatistic();

    private static HttpRequestDef<ListAlarmStatisticRequest, ListAlarmStatisticResponse> genForListAlarmStatistic() {
        // basic
        HttpRequestDef.Builder<ListAlarmStatisticRequest, ListAlarmStatisticResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmStatisticRequest.class, ListAlarmStatisticResponse.class)
                .withName("ListAlarmStatistic")
                .withUri("/v2/{project_id}/alarm-statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmStatisticRequest::getTimeZone, ListAlarmStatisticRequest::setTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmSubsRequest, ListAlarmSubsResponse> listAlarmSubs =
        genForListAlarmSubs();

    private static HttpRequestDef<ListAlarmSubsRequest, ListAlarmSubsResponse> genForListAlarmSubs() {
        // basic
        HttpRequestDef.Builder<ListAlarmSubsRequest, ListAlarmSubsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmSubsRequest.class, ListAlarmSubsResponse.class)
                .withName("ListAlarmSubs")
                .withUri("/v2/{project_id}/alarm-subs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmSubsRequest::getOffset, ListAlarmSubsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmSubsRequest::getLimit, ListAlarmSubsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditLogRequest, ListAuditLogResponse> listAuditLog = genForListAuditLog();

    private static HttpRequestDef<ListAuditLogRequest, ListAuditLogResponse> genForListAuditLog() {
        // basic
        HttpRequestDef.Builder<ListAuditLogRequest, ListAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditLogRequest.class, ListAuditLogResponse.class)
                .withName("ListAuditLog")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/audit-log-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogRequest::getClusterId, ListAuditLogRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForListAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForListAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
            .withName("ListAvailabilityZones")
            .withUri("/v1.0/{project_id}/availability-zones")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> listAvailableDisasterClusters =
        genForListAvailableDisasterClusters();

    private static HttpRequestDef<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> genForListAvailableDisasterClusters() {
        // basic
        HttpRequestDef.Builder<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAvailableDisasterClustersRequest.class,
                    ListAvailableDisasterClustersResponse.class)
                .withName("ListAvailableDisasterClusters")
                .withUri("/v2/{project_id}/disaster-recovery-clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("primary_cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getPrimaryClusterId,
                ListAvailableDisasterClustersRequest::setPrimaryClusterId));
        builder.<String>withRequestField("standby_az_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getStandbyAzCode,
                ListAvailableDisasterClustersRequest::setStandbyAzCode));
        builder.<String>withRequestField("primary_spec_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getPrimarySpecId,
                ListAvailableDisasterClustersRequest::setPrimarySpecId));
        builder.<String>withRequestField("primary_cluster_dn_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getPrimaryClusterDnNum,
                ListAvailableDisasterClustersRequest::setPrimaryClusterDnNum));
        builder.<String>withRequestField("standby_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getStandbyRegion,
                ListAvailableDisasterClustersRequest::setStandbyRegion));
        builder.<String>withRequestField("standby_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getStandbyProjectId,
                ListAvailableDisasterClustersRequest::setStandbyProjectId));
        builder.<String>withRequestField("dr_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getDrType,
                ListAvailableDisasterClustersRequest::setDrType));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getDatastoreType,
                ListAvailableDisasterClustersRequest::setDatastoreType));
        builder.<String>withRequestField("datastore_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getDatastoreVersion,
                ListAvailableDisasterClustersRequest::setDatastoreVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterActionsRequest, ListClusterActionsResponse> listClusterActions =
        genForListClusterActions();

    private static HttpRequestDef<ListClusterActionsRequest, ListClusterActionsResponse> genForListClusterActions() {
        // basic
        HttpRequestDef.Builder<ListClusterActionsRequest, ListClusterActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterActionsRequest.class, ListClusterActionsResponse.class)
                .withName("ListClusterActions")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/actions/{action_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterActionsRequest::getClusterId, ListClusterActionsRequest::setClusterId));
        builder.<String>withRequestField("action_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterActionsRequest::getActionName, ListClusterActionsRequest::setActionName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterCnRequest, ListClusterCnResponse> listClusterCn =
        genForListClusterCn();

    private static HttpRequestDef<ListClusterCnRequest, ListClusterCnResponse> genForListClusterCn() {
        // basic
        HttpRequestDef.Builder<ListClusterCnRequest, ListClusterCnResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterCnRequest.class, ListClusterCnResponse.class)
                .withName("ListClusterCn")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterCnRequest::getClusterId, ListClusterCnRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> listClusterConfigurations =
        genForListClusterConfigurations();

    private static HttpRequestDef<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> genForListClusterConfigurations() {
        // basic
        HttpRequestDef.Builder<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterConfigurationsRequest.class,
                    ListClusterConfigurationsResponse.class)
                .withName("ListClusterConfigurations")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterConfigurationsRequest::getClusterId,
                ListClusterConfigurationsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> listClusterConfigurationsParameter =
        genForListClusterConfigurationsParameter();

    private static HttpRequestDef<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> genForListClusterConfigurationsParameter() {
        // basic
        HttpRequestDef.Builder<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterConfigurationsParameterRequest.class,
                    ListClusterConfigurationsParameterResponse.class)
                .withName("ListClusterConfigurationsParameter")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/configurations/{configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterConfigurationsParameterRequest::getClusterId,
                ListClusterConfigurationsParameterRequest::setClusterId));
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterConfigurationsParameterRequest::getConfigurationId,
                ListClusterConfigurationsParameterRequest::setConfigurationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetails =
        genForListClusterDetails();

    private static HttpRequestDef<ListClusterDetailsRequest, ListClusterDetailsResponse> genForListClusterDetails() {
        // basic
        HttpRequestDef.Builder<ListClusterDetailsRequest, ListClusterDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterDetailsRequest.class, ListClusterDetailsResponse.class)
                .withName("ListClusterDetails")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterDetailsRequest::getClusterId, ListClusterDetailsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterEndpointsRequest, ListClusterEndpointsResponse> listClusterEndpoints =
        genForListClusterEndpoints();

    private static HttpRequestDef<ListClusterEndpointsRequest, ListClusterEndpointsResponse> genForListClusterEndpoints() {
        // basic
        HttpRequestDef.Builder<ListClusterEndpointsRequest, ListClusterEndpointsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterEndpointsRequest.class, ListClusterEndpointsResponse.class)
            .withName("ListClusterEndpoints")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/endpoints")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEndpointsRequest::getClusterId,
                ListClusterEndpointsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterNodesRequest, ListClusterNodesResponse> listClusterNodes =
        genForListClusterNodes();

    private static HttpRequestDef<ListClusterNodesRequest, ListClusterNodesResponse> genForListClusterNodes() {
        // basic
        HttpRequestDef.Builder<ListClusterNodesRequest, ListClusterNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterNodesRequest.class, ListClusterNodesResponse.class)
                .withName("ListClusterNodes")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getClusterId, ListClusterNodesRequest::setClusterId));
        builder.<List<String>>withRequestField("node_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getNodeIds, ListClusterNodesRequest::setNodeIds));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getOffset, ListClusterNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getLimit, ListClusterNodesRequest::setLimit));
        builder.<String>withRequestField("filter_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getFilterBy, ListClusterNodesRequest::setFilterBy));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getFilter, ListClusterNodesRequest::setFilter));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getOrderBy, ListClusterNodesRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getOrder, ListClusterNodesRequest::setOrder));
        builder.<String>withRequestField("deleted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterNodesRequest::getDeleted, ListClusterNodesRequest::setDeleted));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> listClusterScaleInNumbers =
        genForListClusterScaleInNumbers();

    private static HttpRequestDef<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> genForListClusterScaleInNumbers() {
        // basic
        HttpRequestDef.Builder<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterScaleInNumbersRequest.class,
                    ListClusterScaleInNumbersResponse.class)
                .withName("ListClusterScaleInNumbers")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/shrink-numbers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterScaleInNumbersRequest::getClusterId,
                ListClusterScaleInNumbersRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> listClusterSnapshots =
        genForListClusterSnapshots();

    private static HttpRequestDef<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> genForListClusterSnapshots() {
        // basic
        HttpRequestDef.Builder<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterSnapshotsRequest.class, ListClusterSnapshotsResponse.class)
            .withName("ListClusterSnapshots")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/snapshots")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getClusterId,
                ListClusterSnapshotsRequest::setClusterId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getLimit, ListClusterSnapshotsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getOffset, ListClusterSnapshotsRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getSortKey, ListClusterSnapshotsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getSortDir, ListClusterSnapshotsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTags =
        genForListClusterTags();

    private static HttpRequestDef<ListClusterTagsRequest, ListClusterTagsResponse> genForListClusterTags() {
        // basic
        HttpRequestDef.Builder<ListClusterTagsRequest, ListClusterTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterTagsRequest.class, ListClusterTagsResponse.class)
                .withName("ListClusterTags")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterTagsRequest::getClusterId, ListClusterTagsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterWorkloadRequest, ListClusterWorkloadResponse> listClusterWorkload =
        genForListClusterWorkload();

    private static HttpRequestDef<ListClusterWorkloadRequest, ListClusterWorkloadResponse> genForListClusterWorkload() {
        // basic
        HttpRequestDef.Builder<ListClusterWorkloadRequest, ListClusterWorkloadResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterWorkloadRequest.class, ListClusterWorkloadResponse.class)
                .withName("ListClusterWorkload")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterWorkloadRequest::getClusterId, ListClusterWorkloadRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForListClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForListClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getEnterpriseProjectId,
                ListClustersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse> listConfigurationsAuditRecords =
        genForListConfigurationsAuditRecords();

    private static HttpRequestDef<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse> genForListConfigurationsAuditRecords() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationsAuditRecordsRequest.class,
                    ListConfigurationsAuditRecordsResponse.class)
                .withName("ListConfigurationsAuditRecords")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/configurations/audit-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getClusterId,
                ListConfigurationsAuditRecordsRequest::setClusterId));
        builder.<Long>withRequestField("action_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getActionTime,
                ListConfigurationsAuditRecordsRequest::setActionTime));
        builder.<String>withRequestField("filter_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getFilterBy,
                ListConfigurationsAuditRecordsRequest::setFilterBy));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getFilter,
                ListConfigurationsAuditRecordsRequest::setFilter));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getLimit,
                ListConfigurationsAuditRecordsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getOffset,
                ListConfigurationsAuditRecordsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataSourceRequest, ListDataSourceResponse> listDataSource =
        genForListDataSource();

    private static HttpRequestDef<ListDataSourceRequest, ListDataSourceResponse> genForListDataSource() {
        // basic
        HttpRequestDef.Builder<ListDataSourceRequest, ListDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataSourceRequest.class, ListDataSourceResponse.class)
                .withName("ListDataSource")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ext-data-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataSourceRequest::getClusterId, ListDataSourceRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> listDatabaseObjects =
        genForListDatabaseObjects();

    private static HttpRequestDef<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> genForListDatabaseObjects() {
        // basic
        HttpRequestDef.Builder<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseObjectsRequest.class, ListDatabaseObjectsResponse.class)
                .withName("ListDatabaseObjects")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getClusterId, ListDatabaseObjectsRequest::setClusterId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getType, ListDatabaseObjectsRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getName, ListDatabaseObjectsRequest::setName));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getDatabase, ListDatabaseObjectsRequest::setDatabase));
        builder.<String>withRequestField("schema",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getSchema, ListDatabaseObjectsRequest::setSchema));
        builder.<String>withRequestField("table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getTable, ListDatabaseObjectsRequest::setTable));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getOffset, ListDatabaseObjectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getLimit, ListDatabaseObjectsRequest::setLimit));
        builder.<String>withRequestField("is_fine_grained_disaster",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getIsFineGrainedDisaster,
                ListDatabaseObjectsRequest::setIsFineGrainedDisaster));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUserAuthoritiesRequest, ListDatabaseUserAuthoritiesResponse> listDatabaseUserAuthorities =
        genForListDatabaseUserAuthorities();

    private static HttpRequestDef<ListDatabaseUserAuthoritiesRequest, ListDatabaseUserAuthoritiesResponse> genForListDatabaseUserAuthorities() {
        // basic
        HttpRequestDef.Builder<ListDatabaseUserAuthoritiesRequest, ListDatabaseUserAuthoritiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDatabaseUserAuthoritiesRequest.class,
                    ListDatabaseUserAuthoritiesResponse.class)
                .withName("ListDatabaseUserAuthorities")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users/{name}/authority")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUserAuthoritiesRequest::getClusterId,
                ListDatabaseUserAuthoritiesRequest::setClusterId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUserAuthoritiesRequest::getName,
                ListDatabaseUserAuthoritiesRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseUserAuthoritiesRequest::getOffset,
                ListDatabaseUserAuthoritiesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseUserAuthoritiesRequest::getLimit,
                ListDatabaseUserAuthoritiesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsers =
        genForListDatabaseUsers();

    private static HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> genForListDatabaseUsers() {
        // basic
        HttpRequestDef.Builder<ListDatabaseUsersRequest, ListDatabaseUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseUsersRequest.class, ListDatabaseUsersResponse.class)
                .withName("ListDatabaseUsers")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getClusterId, ListDatabaseUsersRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getOffset, ListDatabaseUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getLimit, ListDatabaseUsersRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getType, ListDatabaseUsersRequest::setType));
        builder.<String>withRequestField("user_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getUserType, ListDatabaseUsersRequest::setUserType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDisasterRecoverRequest, ListDisasterRecoverResponse> listDisasterRecover =
        genForListDisasterRecover();

    private static HttpRequestDef<ListDisasterRecoverRequest, ListDisasterRecoverResponse> genForListDisasterRecover() {
        // basic
        HttpRequestDef.Builder<ListDisasterRecoverRequest, ListDisasterRecoverResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDisasterRecoverRequest.class, ListDisasterRecoverResponse.class)
                .withName("ListDisasterRecover")
                .withUri("/v2/{project_id}/disaster-recoveries")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDssPoolsRequest, ListDssPoolsResponse> listDssPools = genForListDssPools();

    private static HttpRequestDef<ListDssPoolsRequest, ListDssPoolsResponse> genForListDssPools() {
        // basic
        HttpRequestDef.Builder<ListDssPoolsRequest, ListDssPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDssPoolsRequest.class, ListDssPoolsResponse.class)
                .withName("ListDssPools")
                .withUri("/v1.0/{project_id}/dss-pools")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElbsRequest, ListElbsResponse> listElbs = genForListElbs();

    private static HttpRequestDef<ListElbsRequest, ListElbsResponse> genForListElbs() {
        // basic
        HttpRequestDef.Builder<ListElbsRequest, ListElbsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListElbsRequest.class, ListElbsResponse.class)
                .withName("ListElbs")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/elbs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElbsRequest::getClusterId, ListElbsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventSpecsRequest, ListEventSpecsResponse> listEventSpecs =
        genForListEventSpecs();

    private static HttpRequestDef<ListEventSpecsRequest, ListEventSpecsResponse> genForListEventSpecs() {
        // basic
        HttpRequestDef.Builder<ListEventSpecsRequest, ListEventSpecsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventSpecsRequest.class, ListEventSpecsResponse.class)
                .withName("ListEventSpecs")
                .withUri("/v2/{project_id}/event-specs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("spec_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getSpecName, ListEventSpecsRequest::setSpecName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getCategory, ListEventSpecsRequest::setCategory));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getSeverity, ListEventSpecsRequest::setSeverity));
        builder.<String>withRequestField("source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getSourceType, ListEventSpecsRequest::setSourceType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getTag, ListEventSpecsRequest::setTag));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getOffset, ListEventSpecsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getLimit, ListEventSpecsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventSubsRequest, ListEventSubsResponse> listEventSubs =
        genForListEventSubs();

    private static HttpRequestDef<ListEventSubsRequest, ListEventSubsResponse> genForListEventSubs() {
        // basic
        HttpRequestDef.Builder<ListEventSubsRequest, ListEventSubsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventSubsRequest.class, ListEventSubsResponse.class)
                .withName("ListEventSubs")
                .withUri("/v2/{project_id}/event-subs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSubsRequest::getOffset, ListEventSubsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSubsRequest::getLimit, ListEventSubsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForListEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForListEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v2/{project_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getOffset, ListEventsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getLimit, ListEventsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostDiskRequest, ListHostDiskResponse> listHostDisk = genForListHostDisk();

    private static HttpRequestDef<ListHostDiskRequest, ListHostDiskResponse> genForListHostDisk() {
        // basic
        HttpRequestDef.Builder<ListHostDiskRequest, ListHostDiskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostDiskRequest.class, ListHostDiskResponse.class)
                .withName("ListHostDisk")
                .withUri("/v1.0/{project_id}/dms/disk")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostDiskRequest::getClusterId, ListHostDiskRequest::setClusterId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostDiskRequest::getInstanceId, ListHostDiskRequest::setInstanceId));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostDiskRequest::getInstanceName, ListHostDiskRequest::setInstanceName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostDiskRequest::getLimit, ListHostDiskRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostDiskRequest::getOffset, ListHostDiskRequest::setOffset));

        // response
        builder.<List<DiskResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostDiskResponse::getBody, ListHostDiskResponse::setBody)
                .withInnerContainerType(DiskResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListHostNetRequest, ListHostNetResponse> listHostNet = genForListHostNet();

    private static HttpRequestDef<ListHostNetRequest, ListHostNetResponse> genForListHostNet() {
        // basic
        HttpRequestDef.Builder<ListHostNetRequest, ListHostNetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostNetRequest.class, ListHostNetResponse.class)
                .withName("ListHostNet")
                .withUri("/v1.0/{project_id}/dms/net")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostNetRequest::getClusterId, ListHostNetRequest::setClusterId));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostNetRequest::getInstanceName, ListHostNetRequest::setInstanceName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostNetRequest::getLimit, ListHostNetRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostNetRequest::getOffset, ListHostNetRequest::setOffset));

        // response
        builder.<List<NetResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostNetResponse::getBody, ListHostNetResponse::setBody)
                .withInnerContainerType(NetResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListHostOverviewRequest, ListHostOverviewResponse> listHostOverview =
        genForListHostOverview();

    private static HttpRequestDef<ListHostOverviewRequest, ListHostOverviewResponse> genForListHostOverview() {
        // basic
        HttpRequestDef.Builder<ListHostOverviewRequest, ListHostOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostOverviewRequest.class, ListHostOverviewResponse.class)
                .withName("ListHostOverview")
                .withUri("/v1.0/{project_id}/dms/host-overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostOverviewRequest::getClusterId, ListHostOverviewRequest::setClusterId));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostOverviewRequest::getInstanceName, ListHostOverviewRequest::setInstanceName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostOverviewRequest::getLimit, ListHostOverviewRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostOverviewRequest::getOffset, ListHostOverviewRequest::setOffset));

        // response
        builder.<List<HostOverviewResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostOverviewResponse::getBody, ListHostOverviewResponse::setBody)
                .withInnerContainerType(HostOverviewResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListJobDetailsRequest, ListJobDetailsResponse> listJobDetails =
        genForListJobDetails();

    private static HttpRequestDef<ListJobDetailsRequest, ListJobDetailsResponse> genForListJobDetails() {
        // basic
        HttpRequestDef.Builder<ListJobDetailsRequest, ListJobDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobDetailsRequest.class, ListJobDetailsResponse.class)
                .withName("ListJobDetails")
                .withUri("/v1.0/{project_id}/job/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobDetailsRequest::getJobId, ListJobDetailsRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogicalClusterPlansRequest, ListLogicalClusterPlansResponse> listLogicalClusterPlans =
        genForListLogicalClusterPlans();

    private static HttpRequestDef<ListLogicalClusterPlansRequest, ListLogicalClusterPlansResponse> genForListLogicalClusterPlans() {
        // basic
        HttpRequestDef.Builder<ListLogicalClusterPlansRequest, ListLogicalClusterPlansResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLogicalClusterPlansRequest.class, ListLogicalClusterPlansResponse.class)
            .withName("ListLogicalClusterPlans")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/logical-cluster-plans")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClusterPlansRequest::getClusterId,
                ListLogicalClusterPlansRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogicalClusterRingsRequest, ListLogicalClusterRingsResponse> listLogicalClusterRings =
        genForListLogicalClusterRings();

    private static HttpRequestDef<ListLogicalClusterRingsRequest, ListLogicalClusterRingsResponse> genForListLogicalClusterRings() {
        // basic
        HttpRequestDef.Builder<ListLogicalClusterRingsRequest, ListLogicalClusterRingsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLogicalClusterRingsRequest.class, ListLogicalClusterRingsResponse.class)
            .withName("ListLogicalClusterRings")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters/rings")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClusterRingsRequest::getClusterId,
                ListLogicalClusterRingsRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogicalClusterRingsRequest::getOffset,
                ListLogicalClusterRingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogicalClusterRingsRequest::getLimit, ListLogicalClusterRingsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogicalClusterTasksRequest, ListLogicalClusterTasksResponse> listLogicalClusterTasks =
        genForListLogicalClusterTasks();

    private static HttpRequestDef<ListLogicalClusterTasksRequest, ListLogicalClusterTasksResponse> genForListLogicalClusterTasks() {
        // basic
        HttpRequestDef.Builder<ListLogicalClusterTasksRequest, ListLogicalClusterTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLogicalClusterTasksRequest.class, ListLogicalClusterTasksResponse.class)
            .withName("ListLogicalClusterTasks")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClusterTasksRequest::getClusterId,
                ListLogicalClusterTasksRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogicalClusterTasksRequest::getOffset,
                ListLogicalClusterTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogicalClusterTasksRequest::getLimit, ListLogicalClusterTasksRequest::setLimit));
        builder.<String>withRequestField("logical_cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClusterTasksRequest::getLogicalClusterName,
                ListLogicalClusterTasksRequest::setLogicalClusterName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClusterTasksRequest::getType, ListLogicalClusterTasksRequest::setType));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClusterTasksRequest::getOrderBy,
                ListLogicalClusterTasksRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClusterTasksRequest::getOrder, ListLogicalClusterTasksRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogicalClusterVolumesRequest, ListLogicalClusterVolumesResponse> listLogicalClusterVolumes =
        genForListLogicalClusterVolumes();

    private static HttpRequestDef<ListLogicalClusterVolumesRequest, ListLogicalClusterVolumesResponse> genForListLogicalClusterVolumes() {
        // basic
        HttpRequestDef.Builder<ListLogicalClusterVolumesRequest, ListLogicalClusterVolumesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLogicalClusterVolumesRequest.class,
                    ListLogicalClusterVolumesResponse.class)
                .withName("ListLogicalClusterVolumes")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters/volumes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClusterVolumesRequest::getClusterId,
                ListLogicalClusterVolumesRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogicalClusterVolumesRequest::getOffset,
                ListLogicalClusterVolumesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogicalClusterVolumesRequest::getLimit,
                ListLogicalClusterVolumesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogicalClustersRequest, ListLogicalClustersResponse> listLogicalClusters =
        genForListLogicalClusters();

    private static HttpRequestDef<ListLogicalClustersRequest, ListLogicalClustersResponse> genForListLogicalClusters() {
        // basic
        HttpRequestDef.Builder<ListLogicalClustersRequest, ListLogicalClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogicalClustersRequest.class, ListLogicalClustersResponse.class)
                .withName("ListLogicalClusters")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogicalClustersRequest::getClusterId, ListLogicalClustersRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogicalClustersRequest::getOffset, ListLogicalClustersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogicalClustersRequest::getLimit, ListLogicalClustersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsLogsRequest, ListLtsLogsResponse> listLtsLogs = genForListLtsLogs();

    private static HttpRequestDef<ListLtsLogsRequest, ListLtsLogsResponse> genForListLtsLogs() {
        // basic
        HttpRequestDef.Builder<ListLtsLogsRequest, ListLtsLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLtsLogsRequest.class, ListLtsLogsResponse.class)
                .withName("ListLtsLogs")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/lts-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsLogsRequest::getClusterId, ListLtsLogsRequest::setClusterId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLtsLogsRequest::getLimit, ListLtsLogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLtsLogsRequest::getOffset, ListLtsLogsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForListMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForListMetrics() {
        // basic
        HttpRequestDef.Builder<ListMetricsRequest, ListMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsRequest.class, ListMetricsResponse.class)
                .withName("ListMetrics")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/dms/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getClusterId, ListMetricsRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricsRequest::getOffset, ListMetricsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricsRequest::getLimit, ListMetricsRequest::setLimit));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getOrderBy, ListMetricsRequest::setOrderBy));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getSortBy, ListMetricsRequest::setSortBy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsDataRequest, ListMetricsDataResponse> listMetricsData =
        genForListMetricsData();

    private static HttpRequestDef<ListMetricsDataRequest, ListMetricsDataResponse> genForListMetricsData() {
        // basic
        HttpRequestDef.Builder<ListMetricsDataRequest, ListMetricsDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsDataRequest.class, ListMetricsDataResponse.class)
                .withName("ListMetricsData")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/dms/metrics/{metric_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsDataRequest::getClusterId, ListMetricsDataRequest::setClusterId));
        builder.<String>withRequestField("metric_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsDataRequest::getMetricName, ListMetricsDataRequest::setMetricName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricsDataRequest::getOffset, ListMetricsDataRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricsDataRequest::getLimit, ListMetricsDataRequest::setLimit));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListMetricsDataRequest::getFrom, ListMetricsDataRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListMetricsDataRequest::getTo, ListMetricsDataRequest::setTo));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsDataRequest::getOrderBy, ListMetricsDataRequest::setOrderBy));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsDataRequest::getSortBy, ListMetricsDataRequest::setSortBy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> listMonitorIndicatorData =
        genForListMonitorIndicatorData();

    private static HttpRequestDef<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> genForListMonitorIndicatorData() {
        // basic
        HttpRequestDef.Builder<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListMonitorIndicatorDataRequest.class, ListMonitorIndicatorDataResponse.class)
                .withName("ListMonitorIndicatorData")
                .withUri("/v1.0/{project_id}/dms/metric-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getFrom, ListMonitorIndicatorDataRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getTo, ListMonitorIndicatorDataRequest::setTo));
        builder.<String>withRequestField("function",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getFunction,
                ListMonitorIndicatorDataRequest::setFunction));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getPeriod,
                ListMonitorIndicatorDataRequest::setPeriod));
        builder.<String>withRequestField("indicator_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getIndicatorName,
                ListMonitorIndicatorDataRequest::setIndicatorName));
        builder.<String>withRequestField("dim0",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getDim0, ListMonitorIndicatorDataRequest::setDim0));
        builder.<String>withRequestField("dim1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getDim1, ListMonitorIndicatorDataRequest::setDim1));

        // response
        builder.<List<TrendQueryDataResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataResponse::getBody, ListMonitorIndicatorDataResponse::setBody)
                .withInnerContainerType(TrendQueryDataResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> listMonitorIndicators =
        genForListMonitorIndicators();

    private static HttpRequestDef<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> genForListMonitorIndicators() {
        // basic
        HttpRequestDef.Builder<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMonitorIndicatorsRequest.class, ListMonitorIndicatorsResponse.class)
            .withName("ListMonitorIndicators")
            .withUri("/v1.0/{project_id}/dms/metric-data/indicators")
            .withContentType("application/json");

        // requests

        // response
        builder.<List<IndicatorInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMonitorIndicatorsResponse::getBody, ListMonitorIndicatorsResponse::setBody)
                .withInnerContainerType(IndicatorInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypes =
        genForListNodeTypes();

    private static HttpRequestDef<ListNodeTypesRequest, ListNodeTypesResponse> genForListNodeTypes() {
        // basic
        HttpRequestDef.Builder<ListNodeTypesRequest, ListNodeTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodeTypesRequest.class, ListNodeTypesResponse.class)
                .withName("ListNodeTypes")
                .withUri("/v2/{project_id}/node-types")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPlanExecLogsRequest, ListPlanExecLogsResponse> listPlanExecLogs =
        genForListPlanExecLogs();

    private static HttpRequestDef<ListPlanExecLogsRequest, ListPlanExecLogsResponse> genForListPlanExecLogs() {
        // basic
        HttpRequestDef.Builder<ListPlanExecLogsRequest, ListPlanExecLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPlanExecLogsRequest.class, ListPlanExecLogsResponse.class)
                .withName("ListPlanExecLogs")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlanExecLogsRequest::getClusterId, ListPlanExecLogsRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlanExecLogsRequest::getPlanId, ListPlanExecLogsRequest::setPlanId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlanExecLogsRequest::getLimit, ListPlanExecLogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlanExecLogsRequest::getOffset, ListPlanExecLogsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueriesRequest, ListQueriesResponse> listQueries = genForListQueries();

    private static HttpRequestDef<ListQueriesRequest, ListQueriesResponse> genForListQueries() {
        // basic
        HttpRequestDef.Builder<ListQueriesRequest, ListQueriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueriesRequest.class, ListQueriesResponse.class)
                .withName("ListQueries")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/dms/queries")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueriesRequest::getClusterId, ListQueriesRequest::setClusterId));
        builder.<ListQueriesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListQueriesRequestBody.class),
            f -> f.withMarshaller(ListQueriesRequest::getBody, ListQueriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1.0/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRedistributionSchemaRequest, ListRedistributionSchemaResponse> listRedistributionSchema =
        genForListRedistributionSchema();

    private static HttpRequestDef<ListRedistributionSchemaRequest, ListRedistributionSchemaResponse> genForListRedistributionSchema() {
        // basic
        HttpRequestDef.Builder<ListRedistributionSchemaRequest, ListRedistributionSchemaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRedistributionSchemaRequest.class, ListRedistributionSchemaResponse.class)
                .withName("ListRedistributionSchema")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution/schemas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRedistributionSchemaRequest::getClusterId,
                ListRedistributionSchemaRequest::setClusterId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRedistributionSchemaRequest::getDbName,
                ListRedistributionSchemaRequest::setDbName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRedistributionSchemaRequest::getLimit,
                ListRedistributionSchemaRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRedistributionSchemaRequest::getOffset,
                ListRedistributionSchemaRequest::setOffset));
        builder.<String>withRequestField("schema_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRedistributionSchemaRequest::getSchemaName,
                ListRedistributionSchemaRequest::setSchemaName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSchemasRequest, ListSchemasResponse> listSchemas = genForListSchemas();

    private static HttpRequestDef<ListSchemasRequest, ListSchemasResponse> genForListSchemas() {
        // basic
        HttpRequestDef.Builder<ListSchemasRequest, ListSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSchemasRequest.class, ListSchemasResponse.class)
                .withName("ListSchemas")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/databases/{database_name}/schemas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getClusterId, ListSchemasRequest::setClusterId));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getDatabaseName, ListSchemasRequest::setDatabaseName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getSortKey, ListSchemasRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getSortDir, ListSchemasRequest::setSortDir));
        builder.<String>withRequestField("keywords",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getKeywords, ListSchemasRequest::setKeywords));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSchemasRequest::getLimit, ListSchemasRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSchemasRequest::getOffset, ListSchemasRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse> listSnapshotCrossRegion =
        genForListSnapshotCrossRegion();

    private static HttpRequestDef<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse> genForListSnapshotCrossRegion() {
        // basic
        HttpRequestDef.Builder<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSnapshotCrossRegionRequest.class, ListSnapshotCrossRegionResponse.class)
            .withName("ListSnapshotCrossRegion")
            .withUri("/v1/{project_id}/snapshots/cross-regions")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionRequest::getOffset,
                ListSnapshotCrossRegionRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionRequest::getLimit, ListSnapshotCrossRegionRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse> listSnapshotCrossRegionPolicy =
        genForListSnapshotCrossRegionPolicy();

    private static HttpRequestDef<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse> genForListSnapshotCrossRegionPolicy() {
        // basic
        HttpRequestDef.Builder<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSnapshotCrossRegionPolicyRequest.class,
                    ListSnapshotCrossRegionPolicyResponse.class)
                .withName("ListSnapshotCrossRegionPolicy")
                .withUri("/v1/{project_id}/snapshots/cross-region-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionPolicyRequest::getClusterId,
                ListSnapshotCrossRegionPolicyRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionPolicyRequest::getOffset,
                ListSnapshotCrossRegionPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionPolicyRequest::getLimit,
                ListSnapshotCrossRegionPolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetails =
        genForListSnapshotDetails();

    private static HttpRequestDef<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> genForListSnapshotDetails() {
        // basic
        HttpRequestDef.Builder<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotDetailsRequest.class, ListSnapshotDetailsResponse.class)
                .withName("ListSnapshotDetails")
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotDetailsRequest::getSnapshotId,
                ListSnapshotDetailsRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotFlavorInfoRequest, ListSnapshotFlavorInfoResponse> listSnapshotFlavorInfo =
        genForListSnapshotFlavorInfo();

    private static HttpRequestDef<ListSnapshotFlavorInfoRequest, ListSnapshotFlavorInfoResponse> genForListSnapshotFlavorInfo() {
        // basic
        HttpRequestDef.Builder<ListSnapshotFlavorInfoRequest, ListSnapshotFlavorInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSnapshotFlavorInfoRequest.class, ListSnapshotFlavorInfoResponse.class)
            .withName("ListSnapshotFlavorInfo")
            .withUri("/v2/{project_id}/snapshots/{snapshot_id}/flavors")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotFlavorInfoRequest::getSnapshotId,
                ListSnapshotFlavorInfoRequest::setSnapshotId));
        builder.<ListSnapshotFlavorInfoRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSnapshotFlavorInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ListSnapshotFlavorInfoRequest::getType, ListSnapshotFlavorInfoRequest::setType));
        builder.<String>withRequestField("az_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotFlavorInfoRequest::getAzCode, ListSnapshotFlavorInfoRequest::setAzCode));
        builder.<Boolean>withRequestField("fine_grained_restore",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSnapshotFlavorInfoRequest::getFineGrainedRestore,
                ListSnapshotFlavorInfoRequest::setFineGrainedRestore));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> listSnapshotPolicy =
        genForListSnapshotPolicy();

    private static HttpRequestDef<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> genForListSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotPolicyRequest.class, ListSnapshotPolicyResponse.class)
                .withName("ListSnapshotPolicy")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/snapshot-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotPolicyRequest::getClusterId, ListSnapshotPolicyRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> listSnapshotStatistics =
        genForListSnapshotStatistics();

    private static HttpRequestDef<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> genForListSnapshotStatistics() {
        // basic
        HttpRequestDef.Builder<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSnapshotStatisticsRequest.class, ListSnapshotStatisticsResponse.class)
            .withName("ListSnapshotStatistics")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/snapshots/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotStatisticsRequest::getClusterId,
                ListSnapshotStatisticsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots =
        genForListSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForListSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withName("ListSnapshots")
                .withUri("/v1.0/{project_id}/snapshots")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> listStatistics =
        genForListStatistics();

    private static HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> genForListStatistics() {
        // basic
        HttpRequestDef.Builder<ListStatisticsRequest, ListStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsRequest.class, ListStatisticsResponse.class)
                .withName("ListStatistics")
                .withUri("/v1.0/{project_id}/statistics")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSyncRecordsRequest, ListSyncRecordsResponse> listSyncRecords =
        genForListSyncRecords();

    private static HttpRequestDef<ListSyncRecordsRequest, ListSyncRecordsResponse> genForListSyncRecords() {
        // basic
        HttpRequestDef.Builder<ListSyncRecordsRequest, ListSyncRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSyncRecordsRequest.class, ListSyncRecordsResponse.class)
                .withName("ListSyncRecords")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/sync-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSyncRecordsRequest::getClusterId, ListSyncRecordsRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSyncRecordsRequest::getOffset, ListSyncRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSyncRecordsRequest::getLimit, ListSyncRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesStatisticRequest, ListTablesStatisticResponse> listTablesStatistic =
        genForListTablesStatistic();

    private static HttpRequestDef<ListTablesStatisticRequest, ListTablesStatisticResponse> genForListTablesStatistic() {
        // basic
        HttpRequestDef.Builder<ListTablesStatisticRequest, ListTablesStatisticResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTablesStatisticRequest.class, ListTablesStatisticResponse.class)
                .withName("ListTablesStatistic")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/dms/tables/statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesStatisticRequest::getClusterId, ListTablesStatisticRequest::setClusterId));
        builder.<String>withRequestField("rate_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesStatisticRequest::getRateType, ListTablesStatisticRequest::setRateType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesStatisticRequest::getOffset, ListTablesStatisticRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesStatisticRequest::getLimit, ListTablesStatisticRequest::setLimit));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesStatisticRequest::getOrderBy, ListTablesStatisticRequest::setOrderBy));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesStatisticRequest::getSortBy, ListTablesStatisticRequest::setSortBy));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesStatisticRequest::getFilter, ListTablesStatisticRequest::setFilter));
        builder.<String>withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesStatisticRequest::getValue, ListTablesStatisticRequest::setValue));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v1.0/{project_id}/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsForResourceRequest, ListTagsForResourceResponse> listTagsForResource =
        genForListTagsForResource();

    private static HttpRequestDef<ListTagsForResourceRequest, ListTagsForResourceResponse> genForListTagsForResource() {
        // basic
        HttpRequestDef.Builder<ListTagsForResourceRequest, ListTagsForResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsForResourceRequest.class, ListTagsForResourceResponse.class)
                .withName("ListTagsForResource")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/enterprise-projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getClusterId, ListTagsForResourceRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getOffset, ListTagsForResourceRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getLimit, ListTagsForResourceRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTargetFlavorsRequest, ListTargetFlavorsResponse> listTargetFlavors =
        genForListTargetFlavors();

    private static HttpRequestDef<ListTargetFlavorsRequest, ListTargetFlavorsResponse> genForListTargetFlavors() {
        // basic
        HttpRequestDef.Builder<ListTargetFlavorsRequest, ListTargetFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTargetFlavorsRequest.class, ListTargetFlavorsResponse.class)
                .withName("ListTargetFlavors")
                .withUri("/v1/{project_id}/flavors/{flavor_id}/target-flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetFlavorsRequest::getFlavorId, ListTargetFlavorsRequest::setFlavorId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetFlavorsRequest::getClusterId, ListTargetFlavorsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopoRingsRequest, ListTopoRingsResponse> listTopoRings =
        genForListTopoRings();

    private static HttpRequestDef<ListTopoRingsRequest, ListTopoRingsResponse> genForListTopoRings() {
        // basic
        HttpRequestDef.Builder<ListTopoRingsRequest, ListTopoRingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopoRingsRequest.class, ListTopoRingsResponse.class)
                .withName("ListTopoRings")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/topo/rings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopoRingsRequest::getClusterId, ListTopoRingsRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopoRingsRequest::getOffset, ListTopoRingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopoRingsRequest::getLimit, ListTopoRingsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpdatableVersionRequest, ListUpdatableVersionResponse> listUpdatableVersion =
        genForListUpdatableVersion();

    private static HttpRequestDef<ListUpdatableVersionRequest, ListUpdatableVersionResponse> genForListUpdatableVersion() {
        // basic
        HttpRequestDef.Builder<ListUpdatableVersionRequest, ListUpdatableVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpdatableVersionRequest.class, ListUpdatableVersionResponse.class)
            .withName("ListUpdatableVersion")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/upgrade-management/avail-versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpdatableVersionRequest::getClusterId,
                ListUpdatableVersionRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdatableVersionRequest::getOffset, ListUpdatableVersionRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdatableVersionRequest::getLimit, ListUpdatableVersionRequest::setLimit));
        builder.<ListUpdatableVersionRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUpdatableVersionRequest.TypeEnum.class),
            f -> f.withMarshaller(ListUpdatableVersionRequest::getType, ListUpdatableVersionRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpdateRecordRequest, ListUpdateRecordResponse> listUpdateRecord =
        genForListUpdateRecord();

    private static HttpRequestDef<ListUpdateRecordRequest, ListUpdateRecordResponse> genForListUpdateRecord() {
        // basic
        HttpRequestDef.Builder<ListUpdateRecordRequest, ListUpdateRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUpdateRecordRequest.class, ListUpdateRecordResponse.class)
                .withName("ListUpdateRecord")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/upgrade-management/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpdateRecordRequest::getClusterId, ListUpdateRecordRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdateRecordRequest::getOffset, ListUpdateRecordRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdateRecordRequest::getLimit, ListUpdateRecordRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkloadPlansRequest, ListWorkloadPlansResponse> listWorkloadPlans =
        genForListWorkloadPlans();

    private static HttpRequestDef<ListWorkloadPlansRequest, ListWorkloadPlansResponse> genForListWorkloadPlans() {
        // basic
        HttpRequestDef.Builder<ListWorkloadPlansRequest, ListWorkloadPlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkloadPlansRequest.class, ListWorkloadPlansResponse.class)
                .withName("ListWorkloadPlans")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadPlansRequest::getClusterId, ListWorkloadPlansRequest::setClusterId));
        builder.<String>withRequestField("logical_cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadPlansRequest::getLogicalClusterName,
                ListWorkloadPlansRequest::setLogicalClusterName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkloadPlansRequest::getLimit, ListWorkloadPlansRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkloadPlansRequest::getOffset, ListWorkloadPlansRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkloadQueueRequest, ListWorkloadQueueResponse> listWorkloadQueue =
        genForListWorkloadQueue();

    private static HttpRequestDef<ListWorkloadQueueRequest, ListWorkloadQueueResponse> genForListWorkloadQueue() {
        // basic
        HttpRequestDef.Builder<ListWorkloadQueueRequest, ListWorkloadQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkloadQueueRequest.class, ListWorkloadQueueResponse.class)
                .withName("ListWorkloadQueue")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadQueueRequest::getClusterId, ListWorkloadQueueRequest::setClusterId));
        builder.<String>withRequestField("logical_cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadQueueRequest::getLogicalClusterName,
                ListWorkloadQueueRequest::setLogicalClusterName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkloadQueueUsersRequest, ListWorkloadQueueUsersResponse> listWorkloadQueueUsers =
        genForListWorkloadQueueUsers();

    private static HttpRequestDef<ListWorkloadQueueUsersRequest, ListWorkloadQueueUsersResponse> genForListWorkloadQueueUsers() {
        // basic
        HttpRequestDef.Builder<ListWorkloadQueueUsersRequest, ListWorkloadQueueUsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkloadQueueUsersRequest.class, ListWorkloadQueueUsersResponse.class)
            .withName("ListWorkloadQueueUsers")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues/{queue_name}/users")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadQueueUsersRequest::getClusterId,
                ListWorkloadQueueUsersRequest::setClusterId));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadQueueUsersRequest::getQueueName,
                ListWorkloadQueueUsersRequest::setQueueName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkloadQueueUsersRequest::getLimit, ListWorkloadQueueUsersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkloadQueueUsersRequest::getOffset, ListWorkloadQueueUsersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkloadRulesRequest, ListWorkloadRulesResponse> listWorkloadRules =
        genForListWorkloadRules();

    private static HttpRequestDef<ListWorkloadRulesRequest, ListWorkloadRulesResponse> genForListWorkloadRules() {
        // basic
        HttpRequestDef.Builder<ListWorkloadRulesRequest, ListWorkloadRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkloadRulesRequest.class, ListWorkloadRulesResponse.class)
                .withName("ListWorkloadRules")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/workload/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadRulesRequest::getClusterId, ListWorkloadRulesRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkloadRulesRequest::getOffset, ListWorkloadRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkloadRulesRequest::getLimit, ListWorkloadRulesRequest::setLimit));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadRulesRequest::getRuleName, ListWorkloadRulesRequest::setRuleName));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadRulesRequest::getQueueName, ListWorkloadRulesRequest::setQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyClusterNameRequest, ModifyClusterNameResponse> modifyClusterName =
        genForModifyClusterName();

    private static HttpRequestDef<ModifyClusterNameRequest, ModifyClusterNameResponse> genForModifyClusterName() {
        // basic
        HttpRequestDef.Builder<ModifyClusterNameRequest, ModifyClusterNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyClusterNameRequest.class, ModifyClusterNameResponse.class)
                .withName("ModifyClusterName")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/cluster-name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyClusterNameRequest::getClusterId, ModifyClusterNameRequest::setClusterId));
        builder.<ClusterNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ClusterNameReq.class),
            f -> f.withMarshaller(ModifyClusterNameRequest::getBody, ModifyClusterNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyClusterTimezoneRequest, ModifyClusterTimezoneResponse> modifyClusterTimezone =
        genForModifyClusterTimezone();

    private static HttpRequestDef<ModifyClusterTimezoneRequest, ModifyClusterTimezoneResponse> genForModifyClusterTimezone() {
        // basic
        HttpRequestDef.Builder<ModifyClusterTimezoneRequest, ModifyClusterTimezoneResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ModifyClusterTimezoneRequest.class, ModifyClusterTimezoneResponse.class)
            .withName("ModifyClusterTimezone")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/timezone")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyClusterTimezoneRequest::getClusterId,
                ModifyClusterTimezoneRequest::setClusterId));
        builder.<ClusterTimezoneReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterTimezoneReq.class),
            f -> f.withMarshaller(ModifyClusterTimezoneRequest::getBody, ModifyClusterTimezoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> pauseDisasterRecovery =
        genForPauseDisasterRecovery();

    private static HttpRequestDef<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> genForPauseDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, PauseDisasterRecoveryRequest.class, PauseDisasterRecoveryResponse.class)
            .withName("PauseDisasterRecovery")
            .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/pause")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseDisasterRecoveryRequest::getDisasterRecoveryId,
                PauseDisasterRecoveryRequest::setDisasterRecoveryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForResetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForResetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/reset-password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getClusterId, ResetPasswordRequest::setClusterId));
        builder.<ResetPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordRequestBody.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, ResetPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> resizeCluster =
        genForResizeCluster();

    private static HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> genForResizeCluster() {
        // basic
        HttpRequestDef.Builder<ResizeClusterRequest, ResizeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeClusterRequest.class, ResizeClusterResponse.class)
                .withName("ResizeCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeClusterRequest::getClusterId, ResizeClusterRequest::setClusterId));
        builder.<ResizeClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResizeClusterRequestBody.class),
            f -> f.withMarshaller(ResizeClusterRequest::getBody, ResizeClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeClusterWithExistedNodesRequest, ResizeClusterWithExistedNodesResponse> resizeClusterWithExistedNodes =
        genForResizeClusterWithExistedNodes();

    private static HttpRequestDef<ResizeClusterWithExistedNodesRequest, ResizeClusterWithExistedNodesResponse> genForResizeClusterWithExistedNodes() {
        // basic
        HttpRequestDef.Builder<ResizeClusterWithExistedNodesRequest, ResizeClusterWithExistedNodesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ResizeClusterWithExistedNodesRequest.class,
                    ResizeClusterWithExistedNodesResponse.class)
                .withName("ResizeClusterWithExistedNodes")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/resize-with-existed-nodes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeClusterWithExistedNodesRequest::getClusterId,
                ResizeClusterWithExistedNodesRequest::setClusterId));
        builder.<ResizeClusterWithExistedNodesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeClusterWithExistedNodesRequestBody.class),
            f -> f.withMarshaller(ResizeClusterWithExistedNodesRequest::getBody,
                ResizeClusterWithExistedNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartClusterRequest, RestartClusterResponse> restartCluster =
        genForRestartCluster();

    private static HttpRequestDef<RestartClusterRequest, RestartClusterResponse> genForRestartCluster() {
        // basic
        HttpRequestDef.Builder<RestartClusterRequest, RestartClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartClusterRequest.class, RestartClusterResponse.class)
                .withName("RestartCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/restart")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartClusterRequest::getClusterId, RestartClusterRequest::setClusterId));
        builder.<RestartClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartClusterRequestBody.class),
            f -> f.withMarshaller(RestartClusterRequest::getBody, RestartClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartLogicalClusterRequest, RestartLogicalClusterResponse> restartLogicalCluster =
        genForRestartLogicalCluster();

    private static HttpRequestDef<RestartLogicalClusterRequest, RestartLogicalClusterResponse> genForRestartLogicalCluster() {
        // basic
        HttpRequestDef.Builder<RestartLogicalClusterRequest, RestartLogicalClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartLogicalClusterRequest.class, RestartLogicalClusterResponse.class)
            .withName("RestartLogicalCluster")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters/{logical_cluster_id}/restart")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartLogicalClusterRequest::getClusterId,
                RestartLogicalClusterRequest::setClusterId));
        builder.<String>withRequestField("logical_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartLogicalClusterRequest::getLogicalClusterId,
                RestartLogicalClusterRequest::setLogicalClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreClusterRequest, RestoreClusterResponse> restoreCluster =
        genForRestoreCluster();

    private static HttpRequestDef<RestoreClusterRequest, RestoreClusterResponse> genForRestoreCluster() {
        // basic
        HttpRequestDef.Builder<RestoreClusterRequest, RestoreClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreClusterRequest.class, RestoreClusterResponse.class)
                .withName("RestoreCluster")
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}/actions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreClusterRequest::getSnapshotId, RestoreClusterRequest::setSnapshotId));
        builder.<RestoreClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreClusterRequestBody.class),
            f -> f.withMarshaller(RestoreClusterRequest::getBody, RestoreClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreDisasterRequest, RestoreDisasterResponse> restoreDisaster =
        genForRestoreDisaster();

    private static HttpRequestDef<RestoreDisasterRequest, RestoreDisasterResponse> genForRestoreDisaster() {
        // basic
        HttpRequestDef.Builder<RestoreDisasterRequest, RestoreDisasterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreDisasterRequest.class, RestoreDisasterResponse.class)
                .withName("RestoreDisaster")
                .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/recovery")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreDisasterRequest::getDisasterRecoveryId,
                RestoreDisasterRequest::setDisasterRecoveryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreRedistributionRequest, RestoreRedistributionResponse> restoreRedistribution =
        genForRestoreRedistribution();

    private static HttpRequestDef<RestoreRedistributionRequest, RestoreRedistributionResponse> genForRestoreRedistribution() {
        // basic
        HttpRequestDef.Builder<RestoreRedistributionRequest, RestoreRedistributionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestoreRedistributionRequest.class, RestoreRedistributionResponse.class)
            .withName("RestoreRedistribution")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution/recovery")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreRedistributionRequest::getClusterId,
                RestoreRedistributionRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreTableRequest, RestoreTableResponse> restoreTable = genForRestoreTable();

    private static HttpRequestDef<RestoreTableRequest, RestoreTableResponse> genForRestoreTable() {
        // basic
        HttpRequestDef.Builder<RestoreTableRequest, RestoreTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreTableRequest.class, RestoreTableResponse.class)
                .withName("RestoreTable")
                .withUri("/v1/{project_id}/snapshots/{snapshot_id}/table-restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreTableRequest::getSnapshotId, RestoreTableRequest::setSnapshotId));
        builder.<RestoreTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreTableRequestBody.class),
            f -> f.withMarshaller(RestoreTableRequest::getBody, RestoreTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RotateKeyRequest, RotateKeyResponse> rotateKey = genForRotateKey();

    private static HttpRequestDef<RotateKeyRequest, RotateKeyResponse> genForRotateKey() {
        // basic
        HttpRequestDef.Builder<RotateKeyRequest, RotateKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RotateKeyRequest.class, RotateKeyResponse.class)
                .withName("RotateKey")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/rotate-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RotateKeyRequest::getClusterId, RotateKeyRequest::setClusterId));
        builder.<RotateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RotateKeyRequestBody.class),
            f -> f.withMarshaller(RotateKeyRequest::getBody, RotateKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse> saveClusterDescriptionInfo =
        genForSaveClusterDescriptionInfo();

    private static HttpRequestDef<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse> genForSaveClusterDescriptionInfo() {
        // basic
        HttpRequestDef.Builder<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SaveClusterDescriptionInfoRequest.class,
                    SaveClusterDescriptionInfoResponse.class)
                .withName("SaveClusterDescriptionInfo")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/description")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveClusterDescriptionInfoRequest::getClusterId,
                SaveClusterDescriptionInfoRequest::setClusterId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveClusterDescriptionInfoRequest::getNamespace,
                SaveClusterDescriptionInfoRequest::setNamespace));
        builder.<ClusterDescriptionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterDescriptionInfo.class),
            f -> f.withMarshaller(SaveClusterDescriptionInfoRequest::getBody,
                SaveClusterDescriptionInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRedistributionPriorityRequest, SetRedistributionPriorityResponse> setRedistributionPriority =
        genForSetRedistributionPriority();

    private static HttpRequestDef<SetRedistributionPriorityRequest, SetRedistributionPriorityResponse> genForSetRedistributionPriority() {
        // basic
        HttpRequestDef.Builder<SetRedistributionPriorityRequest, SetRedistributionPriorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SetRedistributionPriorityRequest.class,
                    SetRedistributionPriorityResponse.class)
                .withName("SetRedistributionPriority")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution/priority")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRedistributionPriorityRequest::getClusterId,
                SetRedistributionPriorityRequest::setClusterId));
        builder.<RedisPriorityConf>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisPriorityConf.class),
            f -> f.withMarshaller(SetRedistributionPriorityRequest::getBody,
                SetRedistributionPriorityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterEncryptInfoRequest, ShowClusterEncryptInfoResponse> showClusterEncryptInfo =
        genForShowClusterEncryptInfo();

    private static HttpRequestDef<ShowClusterEncryptInfoRequest, ShowClusterEncryptInfoResponse> genForShowClusterEncryptInfo() {
        // basic
        HttpRequestDef.Builder<ShowClusterEncryptInfoRequest, ShowClusterEncryptInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowClusterEncryptInfoRequest.class, ShowClusterEncryptInfoResponse.class)
            .withName("ShowClusterEncryptInfo")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/encrypt-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterEncryptInfoRequest::getClusterId,
                ShowClusterEncryptInfoRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterFlavorRequest, ShowClusterFlavorResponse> showClusterFlavor =
        genForShowClusterFlavor();

    private static HttpRequestDef<ShowClusterFlavorRequest, ShowClusterFlavorResponse> genForShowClusterFlavor() {
        // basic
        HttpRequestDef.Builder<ShowClusterFlavorRequest, ShowClusterFlavorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterFlavorRequest.class, ShowClusterFlavorResponse.class)
                .withName("ShowClusterFlavor")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/flavor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterFlavorRequest::getClusterId, ShowClusterFlavorRequest::setClusterId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterFlavorRequest::getNamespace, ShowClusterFlavorRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse> showClusterRedistribution =
        genForShowClusterRedistribution();

    private static HttpRequestDef<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse> genForShowClusterRedistribution() {
        // basic
        HttpRequestDef.Builder<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterRedistributionRequest.class,
                    ShowClusterRedistributionResponse.class)
                .withName("ShowClusterRedistribution")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getClusterId,
                ShowClusterRedistributionRequest::setClusterId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getLimit,
                ShowClusterRedistributionRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getOffset,
                ShowClusterRedistributionRequest::setOffset));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getDbName,
                ShowClusterRedistributionRequest::setDbName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getTableName,
                ShowClusterRedistributionRequest::setTableName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getType,
                ShowClusterRedistributionRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterStorageExpandRangeRequest, ShowClusterStorageExpandRangeResponse> showClusterStorageExpandRange =
        genForShowClusterStorageExpandRange();

    private static HttpRequestDef<ShowClusterStorageExpandRangeRequest, ShowClusterStorageExpandRangeResponse> genForShowClusterStorageExpandRange() {
        // basic
        HttpRequestDef.Builder<ShowClusterStorageExpandRangeRequest, ShowClusterStorageExpandRangeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterStorageExpandRangeRequest.class,
                    ShowClusterStorageExpandRangeResponse.class)
                .withName("ShowClusterStorageExpandRange")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/storage-expand-range")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterStorageExpandRangeRequest::getClusterId,
                ShowClusterStorageExpandRangeRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterVolumeRequest, ShowClusterVolumeResponse> showClusterVolume =
        genForShowClusterVolume();

    private static HttpRequestDef<ShowClusterVolumeRequest, ShowClusterVolumeResponse> genForShowClusterVolume() {
        // basic
        HttpRequestDef.Builder<ShowClusterVolumeRequest, ShowClusterVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterVolumeRequest.class, ShowClusterVolumeResponse.class)
                .withName("ShowClusterVolume")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/volume")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterVolumeRequest::getClusterId, ShowClusterVolumeRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClustersRequest, ShowClustersResponse> showClusters = genForShowClusters();

    private static HttpRequestDef<ShowClustersRequest, ShowClustersResponse> genForShowClusters() {
        // basic
        HttpRequestDef.Builder<ShowClustersRequest, ShowClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClustersRequest.class, ShowClustersResponse.class)
                .withName("ShowClusters")
                .withUri("/v2/{project_id}/clusters")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> showDatabaseAuthority =
        genForShowDatabaseAuthority();

    private static HttpRequestDef<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> genForShowDatabaseAuthority() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDatabaseAuthorityRequest.class, ShowDatabaseAuthorityResponse.class)
            .withName("ShowDatabaseAuthority")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/authority")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getClusterId,
                ShowDatabaseAuthorityRequest::setClusterId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getType, ShowDatabaseAuthorityRequest::setType));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getName, ShowDatabaseAuthorityRequest::setName));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getDatabase,
                ShowDatabaseAuthorityRequest::setDatabase));
        builder.<String>withRequestField("schema",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getSchema, ShowDatabaseAuthorityRequest::setSchema));
        builder.<String>withRequestField("table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getTable, ShowDatabaseAuthorityRequest::setTable));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse> showDatabaseOmUserStatus =
        genForShowDatabaseOmUserStatus();

    private static HttpRequestDef<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse> genForShowDatabaseOmUserStatus() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDatabaseOmUserStatusRequest.class, ShowDatabaseOmUserStatusResponse.class)
                .withName("ShowDatabaseOmUserStatus")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/om-user/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseOmUserStatusRequest::getClusterId,
                ShowDatabaseOmUserStatusRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseUserRequest, ShowDatabaseUserResponse> showDatabaseUser =
        genForShowDatabaseUser();

    private static HttpRequestDef<ShowDatabaseUserRequest, ShowDatabaseUserResponse> genForShowDatabaseUser() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseUserRequest, ShowDatabaseUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDatabaseUserRequest.class, ShowDatabaseUserResponse.class)
                .withName("ShowDatabaseUser")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseUserRequest::getClusterId, ShowDatabaseUserRequest::setClusterId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseUserRequest::getName, ShowDatabaseUserRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDisasterDetailRequest, ShowDisasterDetailResponse> showDisasterDetail =
        genForShowDisasterDetail();

    private static HttpRequestDef<ShowDisasterDetailRequest, ShowDisasterDetailResponse> genForShowDisasterDetail() {
        // basic
        HttpRequestDef.Builder<ShowDisasterDetailRequest, ShowDisasterDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDisasterDetailRequest.class, ShowDisasterDetailResponse.class)
                .withName("ShowDisasterDetail")
                .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDisasterDetailRequest::getDisasterRecoveryId,
                ShowDisasterDetailRequest::setDisasterRecoveryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDisasterProgressRequest, ShowDisasterProgressResponse> showDisasterProgress =
        genForShowDisasterProgress();

    private static HttpRequestDef<ShowDisasterProgressRequest, ShowDisasterProgressResponse> genForShowDisasterProgress() {
        // basic
        HttpRequestDef.Builder<ShowDisasterProgressRequest, ShowDisasterProgressResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDisasterProgressRequest.class, ShowDisasterProgressResponse.class)
            .withName("ShowDisasterProgress")
            .withUri("/v1/{project_id}/disaster-recovery/{disaster_recovery_id}/show-progress")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDisasterProgressRequest::getDisasterRecoveryId,
                ShowDisasterProgressRequest::setDisasterRecoveryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
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
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueryDetailRequest, ShowQueryDetailResponse> showQueryDetail =
        genForShowQueryDetail();

    private static HttpRequestDef<ShowQueryDetailRequest, ShowQueryDetailResponse> genForShowQueryDetail() {
        // basic
        HttpRequestDef.Builder<ShowQueryDetailRequest, ShowQueryDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueryDetailRequest.class, ShowQueryDetailResponse.class)
                .withName("ShowQueryDetail")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/dms/queries/{query_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueryDetailRequest::getClusterId, ShowQueryDetailRequest::setClusterId));
        builder.<String>withRequestField("query_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueryDetailRequest::getQueryId, ShowQueryDetailRequest::setQueryId));
        builder.<Long>withRequestField("ctime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowQueryDetailRequest::getCtime, ShowQueryDetailRequest::setCtime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceStatisticsRequest, ShowResourceStatisticsResponse> showResourceStatistics =
        genForShowResourceStatistics();

    private static HttpRequestDef<ShowResourceStatisticsRequest, ShowResourceStatisticsResponse> genForShowResourceStatistics() {
        // basic
        HttpRequestDef.Builder<ShowResourceStatisticsRequest, ShowResourceStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourceStatisticsRequest.class, ShowResourceStatisticsResponse.class)
            .withName("ShowResourceStatistics")
            .withUri("/v1/{project_id}/resource-statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceStatisticsRequest::getNamespace,
                ShowResourceStatisticsRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse> showWorkloadPlan =
        genForShowWorkloadPlan();

    private static HttpRequestDef<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse> genForShowWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkloadPlanRequest.class, ShowWorkloadPlanResponse.class)
                .withName("ShowWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadPlanRequest::getClusterId, ShowWorkloadPlanRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadPlanRequest::getPlanId, ShowWorkloadPlanRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkloadPlanStageRequest, ShowWorkloadPlanStageResponse> showWorkloadPlanStage =
        genForShowWorkloadPlanStage();

    private static HttpRequestDef<ShowWorkloadPlanStageRequest, ShowWorkloadPlanStageResponse> genForShowWorkloadPlanStage() {
        // basic
        HttpRequestDef.Builder<ShowWorkloadPlanStageRequest, ShowWorkloadPlanStageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkloadPlanStageRequest.class, ShowWorkloadPlanStageResponse.class)
            .withName("ShowWorkloadPlanStage")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/stages/{stage_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadPlanStageRequest::getClusterId,
                ShowWorkloadPlanStageRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadPlanStageRequest::getPlanId, ShowWorkloadPlanStageRequest::setPlanId));
        builder.<String>withRequestField("stage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadPlanStageRequest::getStageId, ShowWorkloadPlanStageRequest::setStageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkloadQueueRequest, ShowWorkloadQueueResponse> showWorkloadQueue =
        genForShowWorkloadQueue();

    private static HttpRequestDef<ShowWorkloadQueueRequest, ShowWorkloadQueueResponse> genForShowWorkloadQueue() {
        // basic
        HttpRequestDef.Builder<ShowWorkloadQueueRequest, ShowWorkloadQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkloadQueueRequest.class, ShowWorkloadQueueResponse.class)
                .withName("ShowWorkloadQueue")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadQueueRequest::getClusterId, ShowWorkloadQueueRequest::setClusterId));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadQueueRequest::getQueueName, ShowWorkloadQueueRequest::setQueueName));
        builder.<String>withRequestField("logical_cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadQueueRequest::getLogicalClusterName,
                ShowWorkloadQueueRequest::setLogicalClusterName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkClusterRequest, ShrinkClusterResponse> shrinkCluster =
        genForShrinkCluster();

    private static HttpRequestDef<ShrinkClusterRequest, ShrinkClusterResponse> genForShrinkCluster() {
        // basic
        HttpRequestDef.Builder<ShrinkClusterRequest, ShrinkClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShrinkClusterRequest.class, ShrinkClusterResponse.class)
                .withName("ShrinkCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cluster-shrink")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkClusterRequest::getClusterId, ShrinkClusterRequest::setClusterId));
        builder.<ClusterShrinkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterShrinkReq.class),
            f -> f.withMarshaller(ShrinkClusterRequest::getBody, ShrinkClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkLogicalClusterRequest, ShrinkLogicalClusterResponse> shrinkLogicalCluster =
        genForShrinkLogicalCluster();

    private static HttpRequestDef<ShrinkLogicalClusterRequest, ShrinkLogicalClusterResponse> genForShrinkLogicalCluster() {
        // basic
        HttpRequestDef.Builder<ShrinkLogicalClusterRequest, ShrinkLogicalClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShrinkLogicalClusterRequest.class, ShrinkLogicalClusterResponse.class)
            .withName("ShrinkLogicalCluster")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/logical-clusters/{logical_cluster_id}/shrink")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkLogicalClusterRequest::getClusterId,
                ShrinkLogicalClusterRequest::setClusterId));
        builder.<String>withRequestField("logical_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkLogicalClusterRequest::getLogicalClusterId,
                ShrinkLogicalClusterRequest::setLogicalClusterId));
        builder.<ShrinkLogicalClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkLogicalClusterRequestBody.class),
            f -> f.withMarshaller(ShrinkLogicalClusterRequest::getBody, ShrinkLogicalClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartClusterRequest, StartClusterResponse> startCluster = genForStartCluster();

    private static HttpRequestDef<StartClusterRequest, StartClusterResponse> genForStartCluster() {
        // basic
        HttpRequestDef.Builder<StartClusterRequest, StartClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartClusterRequest.class, StartClusterResponse.class)
                .withName("StartCluster")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartClusterRequest::getClusterId, StartClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> startDisasterRecovery =
        genForStartDisasterRecovery();

    private static HttpRequestDef<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> genForStartDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartDisasterRecoveryRequest.class, StartDisasterRecoveryResponse.class)
            .withName("StartDisasterRecovery")
            .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/start")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartDisasterRecoveryRequest::getDisasterRecoveryId,
                StartDisasterRecoveryRequest::setDisasterRecoveryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartWorkloadPlanRequest, StartWorkloadPlanResponse> startWorkloadPlan =
        genForStartWorkloadPlan();

    private static HttpRequestDef<StartWorkloadPlanRequest, StartWorkloadPlanResponse> genForStartWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<StartWorkloadPlanRequest, StartWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartWorkloadPlanRequest.class, StartWorkloadPlanResponse.class)
                .withName("StartWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkloadPlanRequest::getClusterId, StartWorkloadPlanRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkloadPlanRequest::getPlanId, StartWorkloadPlanRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopClusterRequest, StopClusterResponse> stopCluster = genForStopCluster();

    private static HttpRequestDef<StopClusterRequest, StopClusterResponse> genForStopCluster() {
        // basic
        HttpRequestDef.Builder<StopClusterRequest, StopClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopClusterRequest.class, StopClusterResponse.class)
                .withName("StopCluster")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopClusterRequest::getClusterId, StopClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopRedistributionRequest, StopRedistributionResponse> stopRedistribution =
        genForStopRedistribution();

    private static HttpRequestDef<StopRedistributionRequest, StopRedistributionResponse> genForStopRedistribution() {
        // basic
        HttpRequestDef.Builder<StopRedistributionRequest, StopRedistributionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopRedistributionRequest.class, StopRedistributionResponse.class)
                .withName("StopRedistribution")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution/suspend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopRedistributionRequest::getClusterId, StopRedistributionRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopWorkloadPlanRequest, StopWorkloadPlanResponse> stopWorkloadPlan =
        genForStopWorkloadPlan();

    private static HttpRequestDef<StopWorkloadPlanRequest, StopWorkloadPlanResponse> genForStopWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<StopWorkloadPlanRequest, StopWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopWorkloadPlanRequest.class, StopWorkloadPlanResponse.class)
                .withName("StopWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopWorkloadPlanRequest::getClusterId, StopWorkloadPlanRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopWorkloadPlanRequest::getPlanId, StopWorkloadPlanRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> switchFailoverDisaster =
        genForSwitchFailoverDisaster();

    private static HttpRequestDef<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> genForSwitchFailoverDisaster() {
        // basic
        HttpRequestDef.Builder<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SwitchFailoverDisasterRequest.class, SwitchFailoverDisasterResponse.class)
            .withName("SwitchFailoverDisaster")
            .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/failover")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchFailoverDisasterRequest::getDisasterRecoveryId,
                SwitchFailoverDisasterRequest::setDisasterRecoveryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchOverClusterRequest, SwitchOverClusterResponse> switchOverCluster =
        genForSwitchOverCluster();

    private static HttpRequestDef<SwitchOverClusterRequest, SwitchOverClusterResponse> genForSwitchOverCluster() {
        // basic
        HttpRequestDef.Builder<SwitchOverClusterRequest, SwitchOverClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchOverClusterRequest.class, SwitchOverClusterResponse.class)
                .withName("SwitchOverCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/switchover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchOverClusterRequest::getClusterId, SwitchOverClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchPlanStageRequest, SwitchPlanStageResponse> switchPlanStage =
        genForSwitchPlanStage();

    private static HttpRequestDef<SwitchPlanStageRequest, SwitchPlanStageResponse> genForSwitchPlanStage() {
        // basic
        HttpRequestDef.Builder<SwitchPlanStageRequest, SwitchPlanStageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchPlanStageRequest.class, SwitchPlanStageResponse.class)
                .withName("SwitchPlanStage")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/stage-switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchPlanStageRequest::getClusterId, SwitchPlanStageRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchPlanStageRequest::getPlanId, SwitchPlanStageRequest::setPlanId));
        builder.<WorkloadPlanStageIdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkloadPlanStageIdReq.class),
            f -> f.withMarshaller(SwitchPlanStageRequest::getBody, SwitchPlanStageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> switchoverDisasterRecovery =
        genForSwitchoverDisasterRecovery();

    private static HttpRequestDef<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> genForSwitchoverDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SwitchoverDisasterRecoveryRequest.class,
                    SwitchoverDisasterRecoveryResponse.class)
                .withName("SwitchoverDisasterRecovery")
                .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/switchover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchoverDisasterRecoveryRequest::getDisasterRecoveryId,
                SwitchoverDisasterRecoveryRequest::setDisasterRecoveryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncIamUsersRequest, SyncIamUsersResponse> syncIamUsers = genForSyncIamUsers();

    private static HttpRequestDef<SyncIamUsersRequest, SyncIamUsersResponse> genForSyncIamUsers() {
        // basic
        HttpRequestDef.Builder<SyncIamUsersRequest, SyncIamUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncIamUsersRequest.class, SyncIamUsersResponse.class)
                .withName("SyncIamUsers")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/sync-iam-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncIamUsersRequest::getClusterId, SyncIamUsersRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmSubRequest, UpdateAlarmSubResponse> updateAlarmSub =
        genForUpdateAlarmSub();

    private static HttpRequestDef<UpdateAlarmSubRequest, UpdateAlarmSubResponse> genForUpdateAlarmSub() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmSubRequest, UpdateAlarmSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmSubRequest.class, UpdateAlarmSubResponse.class)
                .withName("UpdateAlarmSub")
                .withUri("/v2/{project_id}/alarm-subs/{alarm_sub_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("alarm_sub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmSubRequest::getAlarmSubId, UpdateAlarmSubRequest::setAlarmSubId));
        builder.<AlarmSubUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AlarmSubUpdateRequest.class),
            f -> f.withMarshaller(UpdateAlarmSubRequest::getBody, UpdateAlarmSubRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterDnsRequest, UpdateClusterDnsResponse> updateClusterDns =
        genForUpdateClusterDns();

    private static HttpRequestDef<UpdateClusterDnsRequest, UpdateClusterDnsResponse> genForUpdateClusterDns() {
        // basic
        HttpRequestDef.Builder<UpdateClusterDnsRequest, UpdateClusterDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterDnsRequest.class, UpdateClusterDnsResponse.class)
                .withName("UpdateClusterDns")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/dns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterDnsRequest::getClusterId, UpdateClusterDnsRequest::setClusterId));
        builder.<ModifyClusterDns>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyClusterDns.class),
            f -> f.withMarshaller(UpdateClusterDnsRequest::getBody, UpdateClusterDnsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration =
        genForUpdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForUpdateConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationRequest, UpdateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigurationRequest.class, UpdateConfigurationResponse.class)
                .withName("UpdateConfiguration")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/configurations/{configuration_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getClusterId, UpdateConfigurationRequest::setClusterId));
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigurationId,
                UpdateConfigurationRequest::setConfigurationId));
        builder.<ConfigurationParameterValues>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationParameterValues.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, UpdateConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSource =
        genForUpdateDataSource();

    private static HttpRequestDef<UpdateDataSourceRequest, UpdateDataSourceResponse> genForUpdateDataSource() {
        // basic
        HttpRequestDef.Builder<UpdateDataSourceRequest, UpdateDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataSourceRequest.class, UpdateDataSourceResponse.class)
                .withName("UpdateDataSource")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ext-data-sources/{ext_data_source_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getClusterId, UpdateDataSourceRequest::setClusterId));
        builder.<String>withRequestField("ext_data_source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getExtDataSourceId,
                UpdateDataSourceRequest::setExtDataSourceId));
        builder.<ReconfigureExtDataSourceActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReconfigureExtDataSourceActionReq.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getBody, UpdateDataSourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> updateDatabaseAuthority =
        genForUpdateDatabaseAuthority();

    private static HttpRequestDef<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> genForUpdateDatabaseAuthority() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateDatabaseAuthorityRequest.class, UpdateDatabaseAuthorityResponse.class)
            .withName("UpdateDatabaseAuthority")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/authority")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseAuthorityRequest::getClusterId,
                UpdateDatabaseAuthorityRequest::setClusterId));
        builder.<DatabasePermissionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabasePermissionReq.class),
            f -> f.withMarshaller(UpdateDatabaseAuthorityRequest::getBody, UpdateDatabaseAuthorityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> updateDatabaseUserInfo =
        genForUpdateDatabaseUserInfo();

    private static HttpRequestDef<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> genForUpdateDatabaseUserInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateDatabaseUserInfoRequest.class, UpdateDatabaseUserInfoResponse.class)
            .withName("UpdateDatabaseUserInfo")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users/{name}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseUserInfoRequest::getClusterId,
                UpdateDatabaseUserInfoRequest::setClusterId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseUserInfoRequest::getName, UpdateDatabaseUserInfoRequest::setName));
        builder.<DatabaseUserInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseUserInfoReq.class),
            f -> f.withMarshaller(UpdateDatabaseUserInfoRequest::getBody, UpdateDatabaseUserInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> updateDisasterInfo =
        genForUpdateDisasterInfo();

    private static HttpRequestDef<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> genForUpdateDisasterInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDisasterInfoRequest.class, UpdateDisasterInfoResponse.class)
                .withName("UpdateDisasterInfo")
                .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDisasterInfoRequest::getDisasterRecoveryId,
                UpdateDisasterInfoRequest::setDisasterRecoveryId));
        builder.<UpdateDisasterRecoveryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDisasterRecoveryRequest.class),
            f -> f.withMarshaller(UpdateDisasterInfoRequest::getBody, UpdateDisasterInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventSubRequest, UpdateEventSubResponse> updateEventSub =
        genForUpdateEventSub();

    private static HttpRequestDef<UpdateEventSubRequest, UpdateEventSubResponse> genForUpdateEventSub() {
        // basic
        HttpRequestDef.Builder<UpdateEventSubRequest, UpdateEventSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEventSubRequest.class, UpdateEventSubResponse.class)
                .withName("UpdateEventSub")
                .withUri("/v2/{project_id}/event-subs/{event_sub_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("event_sub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventSubRequest::getEventSubId, UpdateEventSubRequest::setEventSubId));
        builder.<EventSubUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventSubUpdateRequest.class),
            f -> f.withMarshaller(UpdateEventSubRequest::getBody, UpdateEventSubRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogicalClusterRequest, UpdateLogicalClusterResponse> updateLogicalCluster =
        genForUpdateLogicalCluster();

    private static HttpRequestDef<UpdateLogicalClusterRequest, UpdateLogicalClusterResponse> genForUpdateLogicalCluster() {
        // basic
        HttpRequestDef.Builder<UpdateLogicalClusterRequest, UpdateLogicalClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateLogicalClusterRequest.class, UpdateLogicalClusterResponse.class)
            .withName("UpdateLogicalCluster")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/logical-clusters/{logical_cluster_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogicalClusterRequest::getClusterId,
                UpdateLogicalClusterRequest::setClusterId));
        builder.<String>withRequestField("logical_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogicalClusterRequest::getLogicalClusterId,
                UpdateLogicalClusterRequest::setLogicalClusterId));
        builder.<UpdateLogicalClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogicalClusterRequestBody.class),
            f -> f.withMarshaller(UpdateLogicalClusterRequest::getBody, UpdateLogicalClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogicalClusterPlanRequest, UpdateLogicalClusterPlanResponse> updateLogicalClusterPlan =
        genForUpdateLogicalClusterPlan();

    private static HttpRequestDef<UpdateLogicalClusterPlanRequest, UpdateLogicalClusterPlanResponse> genForUpdateLogicalClusterPlan() {
        // basic
        HttpRequestDef.Builder<UpdateLogicalClusterPlanRequest, UpdateLogicalClusterPlanResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateLogicalClusterPlanRequest.class, UpdateLogicalClusterPlanResponse.class)
                .withName("UpdateLogicalClusterPlan")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/logical-cluster-plans/{plan_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogicalClusterPlanRequest::getClusterId,
                UpdateLogicalClusterPlanRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogicalClusterPlanRequest::getPlanId,
                UpdateLogicalClusterPlanRequest::setPlanId));
        builder.<UpdateLogicalClusterPlanBo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogicalClusterPlanBo.class),
            f -> f.withMarshaller(UpdateLogicalClusterPlanRequest::getBody, UpdateLogicalClusterPlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> updateMaintenanceWindow =
        genForUpdateMaintenanceWindow();

    private static HttpRequestDef<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> genForUpdateMaintenanceWindow() {
        // basic
        HttpRequestDef.Builder<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMaintenanceWindowRequest.class, UpdateMaintenanceWindowResponse.class)
            .withName("UpdateMaintenanceWindow")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/maintenance-window")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMaintenanceWindowRequest::getClusterId,
                UpdateMaintenanceWindowRequest::setClusterId));
        builder.<MaintenanceWindow>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MaintenanceWindow.class),
            f -> f.withMarshaller(UpdateMaintenanceWindowRequest::getBody, UpdateMaintenanceWindowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateQueueResourcesRequest, UpdateQueueResourcesResponse> updateQueueResources =
        genForUpdateQueueResources();

    private static HttpRequestDef<UpdateQueueResourcesRequest, UpdateQueueResourcesResponse> genForUpdateQueueResources() {
        // basic
        HttpRequestDef.Builder<UpdateQueueResourcesRequest, UpdateQueueResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateQueueResourcesRequest.class, UpdateQueueResourcesResponse.class)
            .withName("UpdateQueueResources")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues/{queue_name}/resources")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateQueueResourcesRequest::getClusterId,
                UpdateQueueResourcesRequest::setClusterId));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateQueueResourcesRequest::getQueueName,
                UpdateQueueResourcesRequest::setQueueName));
        builder.<WorkloadQueueRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkloadQueueRequest.class),
            f -> f.withMarshaller(UpdateQueueResourcesRequest::getBody, UpdateQueueResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRedistributionConfigurationsRequest, UpdateRedistributionConfigurationsResponse> updateRedistributionConfigurations =
        genForUpdateRedistributionConfigurations();

    private static HttpRequestDef<UpdateRedistributionConfigurationsRequest, UpdateRedistributionConfigurationsResponse> genForUpdateRedistributionConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateRedistributionConfigurationsRequest, UpdateRedistributionConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRedistributionConfigurationsRequest.class,
                    UpdateRedistributionConfigurationsResponse.class)
                .withName("UpdateRedistributionConfigurations")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRedistributionConfigurationsRequest::getClusterId,
                UpdateRedistributionConfigurationsRequest::setClusterId));
        builder.<RedistributionConf>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedistributionConf.class),
            f -> f.withMarshaller(UpdateRedistributionConfigurationsRequest::getBody,
                UpdateRedistributionConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSchemasRequest, UpdateSchemasResponse> updateSchemas =
        genForUpdateSchemas();

    private static HttpRequestDef<UpdateSchemasRequest, UpdateSchemasResponse> genForUpdateSchemas() {
        // basic
        HttpRequestDef.Builder<UpdateSchemasRequest, UpdateSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSchemasRequest.class, UpdateSchemasResponse.class)
                .withName("UpdateSchemas")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/databases/{database_name}/schemas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSchemasRequest::getClusterId, UpdateSchemasRequest::setClusterId));
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSchemasRequest::getDatabaseName, UpdateSchemasRequest::setDatabaseName));
        builder.<WorkloadSchemaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkloadSchemaReq.class),
            f -> f.withMarshaller(UpdateSchemasRequest::getBody, UpdateSchemasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkloadPlanStageRequest, UpdateWorkloadPlanStageResponse> updateWorkloadPlanStage =
        genForUpdateWorkloadPlanStage();

    private static HttpRequestDef<UpdateWorkloadPlanStageRequest, UpdateWorkloadPlanStageResponse> genForUpdateWorkloadPlanStage() {
        // basic
        HttpRequestDef.Builder<UpdateWorkloadPlanStageRequest, UpdateWorkloadPlanStageResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWorkloadPlanStageRequest.class, UpdateWorkloadPlanStageResponse.class)
            .withName("UpdateWorkloadPlanStage")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/stages/{stage_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkloadPlanStageRequest::getClusterId,
                UpdateWorkloadPlanStageRequest::setClusterId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkloadPlanStageRequest::getPlanId,
                UpdateWorkloadPlanStageRequest::setPlanId));
        builder.<String>withRequestField("stage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkloadPlanStageRequest::getStageId,
                UpdateWorkloadPlanStageRequest::setStageId));
        builder.<WorkloadPlanStageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkloadPlanStageReq.class),
            f -> f.withMarshaller(UpdateWorkloadPlanStageRequest::getBody, UpdateWorkloadPlanStageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkloadRuleRequest, UpdateWorkloadRuleResponse> updateWorkloadRule =
        genForUpdateWorkloadRule();

    private static HttpRequestDef<UpdateWorkloadRuleRequest, UpdateWorkloadRuleResponse> genForUpdateWorkloadRule() {
        // basic
        HttpRequestDef.Builder<UpdateWorkloadRuleRequest, UpdateWorkloadRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkloadRuleRequest.class, UpdateWorkloadRuleResponse.class)
                .withName("UpdateWorkloadRule")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/workload/rules/{rule_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkloadRuleRequest::getClusterId, UpdateWorkloadRuleRequest::setClusterId));
        builder.<String>withRequestField("rule_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkloadRuleRequest::getRuleName, UpdateWorkloadRuleRequest::setRuleName));
        builder.<AddExceptRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddExceptRuleReq.class),
            f -> f.withMarshaller(UpdateWorkloadRuleRequest::getBody, UpdateWorkloadRuleRequest::setBody));

        // response

        return builder.build();
    }

}
