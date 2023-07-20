package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.dws.v2.model.CheckClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckDisasterNameRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckDisasterNameResponse;
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
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.DisassociateEipRequest;
import com.huaweicloud.sdk.dws.v2.model.DisassociateEipResponse;
import com.huaweicloud.sdk.dws.v2.model.DisassociateElbRequest;
import com.huaweicloud.sdk.dws.v2.model.DisassociateElbResponse;
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
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorDataRequest;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorDataResponse;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListNodeTypesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListNodeTypesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.dws.v2.model.ListQuotasResponse;
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
import com.huaweicloud.sdk.dws.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.PauseDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.PauseDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreDisasterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreDisasterResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseAuthorityRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseAuthorityResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseUserRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseUserResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterDetailRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterDetailResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterProgressRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterProgressResponse;
import com.huaweicloud.sdk.dws.v2.model.ShrinkClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ShrinkClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.StartDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.StartDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchFailoverDisasterRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchFailoverDisasterResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchOverClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchOverClusterResponse;
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
import com.huaweicloud.sdk.dws.v2.model.UpdateMaintenanceWindowRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateMaintenanceWindowResponse;

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
     * 添加工作负载队列
     *
     * 添加工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddWorkloadQueueRequest 请求对象
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
     * @param AddWorkloadQueueRequest 请求对象
     * @return AsyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse>
     */
    public AsyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse> addWorkloadQueueAsyncInvoker(
        AddWorkloadQueueRequest request) {
        return new AsyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse>(request, DwsMeta.addWorkloadQueue,
            hcClient);
    }

    /**
     * 集群绑定EIP
     *
     * 集群绑定Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateEipRequest 请求对象
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
     * @param AssociateEipRequest 请求对象
     * @return AsyncInvoker<AssociateEipRequest, AssociateEipResponse>
     */
    public AsyncInvoker<AssociateEipRequest, AssociateEipResponse> associateEipAsyncInvoker(
        AssociateEipRequest request) {
        return new AsyncInvoker<AssociateEipRequest, AssociateEipResponse>(request, DwsMeta.associateEip, hcClient);
    }

    /**
     * 集群绑定ELB
     *
     * 集群绑定Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateElbRequest 请求对象
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
     * @param AssociateElbRequest 请求对象
     * @return AsyncInvoker<AssociateElbRequest, AssociateElbResponse>
     */
    public AsyncInvoker<AssociateElbRequest, AssociateElbResponse> associateElbAsyncInvoker(
        AssociateElbRequest request) {
        return new AsyncInvoker<AssociateElbRequest, AssociateElbResponse>(request, DwsMeta.associateElb, hcClient);
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
     * @param BatchCreateClusterCnRequest 请求对象
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
     * @param BatchCreateClusterCnRequest 请求对象
     * @return AsyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse>
     */
    public AsyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> batchCreateClusterCnAsyncInvoker(
        BatchCreateClusterCnRequest request) {
        return new AsyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse>(request,
            DwsMeta.batchCreateClusterCn, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 为指定集群批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourceTagRequest 请求对象
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
     * @param BatchCreateResourceTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse>
     */
    public AsyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> batchCreateResourceTagAsyncInvoker(
        BatchCreateResourceTagRequest request) {
        return new AsyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse>(request,
            DwsMeta.batchCreateResourceTag, hcClient);
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
     * @param BatchDeleteClusterCnRequest 请求对象
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
     * @param BatchDeleteClusterCnRequest 请求对象
     * @return AsyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse>
     */
    public AsyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> batchDeleteClusterCnAsyncInvoker(
        BatchDeleteClusterCnRequest request) {
        return new AsyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse>(request,
            DwsMeta.batchDeleteClusterCn, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 为指定集群批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceTagRequest 请求对象
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
     * @param BatchDeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagAsyncInvoker(
        BatchDeleteResourceTagRequest request) {
        return new AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>(request,
            DwsMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 解除只读
     *
     * 当集群进入只读状态时，无法进行数据库相关操作，用户可以在管理控制台解除集群的只读状态。触发只读状态可能是由于磁盘使用率过高，因此需要对集群数据进行清理或扩容。
     * - 解除只读支持1.7.2及以上版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelReadonlyClusterRequest 请求对象
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
     * @param CancelReadonlyClusterRequest 请求对象
     * @return AsyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse>
     */
    public AsyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> cancelReadonlyClusterAsyncInvoker(
        CancelReadonlyClusterRequest request) {
        return new AsyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse>(request,
            DwsMeta.cancelReadonlyCluster, hcClient);
    }

    /**
     * 创建集群前检查
     *
     * 创建集群前预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckClusterRequest 请求对象
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
     * @param CheckClusterRequest 请求对象
     * @return AsyncInvoker<CheckClusterRequest, CheckClusterResponse>
     */
    public AsyncInvoker<CheckClusterRequest, CheckClusterResponse> checkClusterAsyncInvoker(
        CheckClusterRequest request) {
        return new AsyncInvoker<CheckClusterRequest, CheckClusterResponse>(request, DwsMeta.checkCluster, hcClient);
    }

    /**
     * 检查容灾名称
     *
     * 检查容灾名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDisasterNameRequest 请求对象
     * @return CompletableFuture<CheckDisasterNameResponse>
     */
    public CompletableFuture<CheckDisasterNameResponse> checkDisasterNameAsync(CheckDisasterNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.checkDisasterName);
    }

    /**
     * 检查容灾名称
     *
     * 检查容灾名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDisasterNameRequest 请求对象
     * @return AsyncInvoker<CheckDisasterNameRequest, CheckDisasterNameResponse>
     */
    public AsyncInvoker<CheckDisasterNameRequest, CheckDisasterNameResponse> checkDisasterNameAsyncInvoker(
        CheckDisasterNameRequest request) {
        return new AsyncInvoker<CheckDisasterNameRequest, CheckDisasterNameResponse>(request, DwsMeta.checkDisasterName,
            hcClient);
    }

    /**
     * 复制快照
     *
     * 该接口用于复制一个自动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopySnapshotRequest 请求对象
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
     * @param CopySnapshotRequest 请求对象
     * @return AsyncInvoker<CopySnapshotRequest, CopySnapshotResponse>
     */
    public AsyncInvoker<CopySnapshotRequest, CopySnapshotResponse> copySnapshotAsyncInvoker(
        CopySnapshotRequest request) {
        return new AsyncInvoker<CopySnapshotRequest, CopySnapshotResponse>(request, DwsMeta.copySnapshot, hcClient);
    }

    /**
     * 创建告警订阅
     *
     * 创建告警订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlarmSubRequest 请求对象
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
     * @param CreateAlarmSubRequest 请求对象
     * @return AsyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse>
     */
    public AsyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse> createAlarmSubAsyncInvoker(
        CreateAlarmSubRequest request) {
        return new AsyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse>(request, DwsMeta.createAlarmSub,
            hcClient);
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
     * @param CreateClusterRequest 请求对象
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
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, DwsMeta.createCluster, hcClient);
    }

    /**
     * 申请域名
     *
     * 为指定集群申请域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterDnsRequest 请求对象
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
     * @param CreateClusterDnsRequest 请求对象
     * @return AsyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse>
     */
    public AsyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse> createClusterDnsAsyncInvoker(
        CreateClusterDnsRequest request) {
        return new AsyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse>(request, DwsMeta.createClusterDns,
            hcClient);
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
     * @param CreateClusterV2Request 请求对象
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
     * @param CreateClusterV2Request 请求对象
     * @return AsyncInvoker<CreateClusterV2Request, CreateClusterV2Response>
     */
    public AsyncInvoker<CreateClusterV2Request, CreateClusterV2Response> createClusterV2AsyncInvoker(
        CreateClusterV2Request request) {
        return new AsyncInvoker<CreateClusterV2Request, CreateClusterV2Response>(request, DwsMeta.createClusterV2,
            hcClient);
    }

    /**
     * 设置资源管理
     *
     * 设置资源管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterWorkloadRequest 请求对象
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
     * @param CreateClusterWorkloadRequest 请求对象
     * @return AsyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse>
     */
    public AsyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> createClusterWorkloadAsyncInvoker(
        CreateClusterWorkloadRequest request) {
        return new AsyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse>(request,
            DwsMeta.createClusterWorkload, hcClient);
    }

    /**
     * 创建数据源
     *
     * 该接口用于创建一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataSourceRequest 请求对象
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
     * @param CreateDataSourceRequest 请求对象
     * @return AsyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse>
     */
    public AsyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse> createDataSourceAsyncInvoker(
        CreateDataSourceRequest request) {
        return new AsyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse>(request, DwsMeta.createDataSource,
            hcClient);
    }

    /**
     * 创建容灾
     *
     * 创建容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<CreateDisasterRecoveryResponse>
     */
    public CompletableFuture<CreateDisasterRecoveryResponse> createDisasterRecoveryAsync(
        CreateDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createDisasterRecovery);
    }

    /**
     * 创建容灾
     *
     * 创建容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>
     */
    public AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecoveryAsyncInvoker(
        CreateDisasterRecoveryRequest request) {
        return new AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>(request,
            DwsMeta.createDisasterRecovery, hcClient);
    }

    /**
     * 创建订阅事件
     *
     * 添加订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSubRequest 请求对象
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
     * @param CreateEventSubRequest 请求对象
     * @return AsyncInvoker<CreateEventSubRequest, CreateEventSubResponse>
     */
    public AsyncInvoker<CreateEventSubRequest, CreateEventSubResponse> createEventSubAsyncInvoker(
        CreateEventSubRequest request) {
        return new AsyncInvoker<CreateEventSubRequest, CreateEventSubResponse>(request, DwsMeta.createEventSub,
            hcClient);
    }

    /**
     * 创建快照
     *
     * 该接口用于为指定集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotRequest 请求对象
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
     * @param CreateSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(
        CreateSnapshotRequest request) {
        return new AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, DwsMeta.createSnapshot,
            hcClient);
    }

    /**
     * 添加快照策略
     *
     * 该接口用于设置快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotPolicyRequest 请求对象
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
     * @param CreateSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse>
     */
    public AsyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> createSnapshotPolicyAsyncInvoker(
        CreateSnapshotPolicyRequest request) {
        return new AsyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse>(request,
            DwsMeta.createSnapshotPolicy, hcClient);
    }

    /**
     * 添加工作负载计划
     *
     * 添加工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkloadPlanRequest 请求对象
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
     * @param CreateWorkloadPlanRequest 请求对象
     * @return AsyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse>
     */
    public AsyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> createWorkloadPlanAsyncInvoker(
        CreateWorkloadPlanRequest request) {
        return new AsyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse>(request,
            DwsMeta.createWorkloadPlan, hcClient);
    }

    /**
     * 删除告警订阅
     *
     * 删除订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlarmSubRequest 请求对象
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
     * @param DeleteAlarmSubRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse>
     */
    public AsyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse> deleteAlarmSubAsyncInvoker(
        DeleteAlarmSubRequest request) {
        return new AsyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse>(request, DwsMeta.deleteAlarmSub,
            hcClient);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
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
     * @param DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, DwsMeta.deleteCluster, hcClient);
    }

    /**
     * 删除集群域名
     *
     * 删除指定集群域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterDnsRequest 请求对象
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
     * @param DeleteClusterDnsRequest 请求对象
     * @return AsyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse>
     */
    public AsyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse> deleteClusterDnsAsyncInvoker(
        DeleteClusterDnsRequest request) {
        return new AsyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse>(request, DwsMeta.deleteClusterDns,
            hcClient);
    }

    /**
     * 删除数据源
     *
     * 该接口用于删除一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataSourceRequest 请求对象
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
     * @param DeleteDataSourceRequest 请求对象
     * @return AsyncInvoker<DeleteDataSourceRequest, DeleteDataSourceResponse>
     */
    public AsyncInvoker<DeleteDataSourceRequest, DeleteDataSourceResponse> deleteDataSourceAsyncInvoker(
        DeleteDataSourceRequest request) {
        return new AsyncInvoker<DeleteDataSourceRequest, DeleteDataSourceResponse>(request, DwsMeta.deleteDataSource,
            hcClient);
    }

    /**
     * 删除容灾
     *
     * 删除容灾。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<DeleteDisasterRecoveryResponse>
     */
    public CompletableFuture<DeleteDisasterRecoveryResponse> deleteDisasterRecoveryAsync(
        DeleteDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteDisasterRecovery);
    }

    /**
     * 删除容灾
     *
     * 删除容灾。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>
     */
    public AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecoveryAsyncInvoker(
        DeleteDisasterRecoveryRequest request) {
        return new AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>(request,
            DwsMeta.deleteDisasterRecovery, hcClient);
    }

    /**
     * 删除订阅事件
     *
     * 删除订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSubRequest 请求对象
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
     * @param DeleteEventSubRequest 请求对象
     * @return AsyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse>
     */
    public AsyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse> deleteEventSubAsyncInvoker(
        DeleteEventSubRequest request) {
        return new AsyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse>(request, DwsMeta.deleteEventSub,
            hcClient);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除一个指定手动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotRequest 请求对象
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
     * @param DeleteSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(
        DeleteSnapshotRequest request) {
        return new AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, DwsMeta.deleteSnapshot,
            hcClient);
    }

    /**
     * 删除快照策略
     *
     * 该接口用于删除一个快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotPolicyRequest 请求对象
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
     * @param DeleteSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse>
     */
    public AsyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> deleteSnapshotPolicyAsyncInvoker(
        DeleteSnapshotPolicyRequest request) {
        return new AsyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse>(request,
            DwsMeta.deleteSnapshotPolicy, hcClient);
    }

    /**
     * 删除工作负载队列
     *
     * 该接口用于删除工作负载队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkloadQueueRequest 请求对象
     * @return CompletableFuture<DeleteWorkloadQueueResponse>
     */
    public CompletableFuture<DeleteWorkloadQueueResponse> deleteWorkloadQueueAsync(DeleteWorkloadQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteWorkloadQueue);
    }

    /**
     * 删除工作负载队列
     *
     * 该接口用于删除工作负载队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkloadQueueRequest 请求对象
     * @return AsyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse>
     */
    public AsyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> deleteWorkloadQueueAsyncInvoker(
        DeleteWorkloadQueueRequest request) {
        return new AsyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse>(request,
            DwsMeta.deleteWorkloadQueue, hcClient);
    }

    /**
     * 集群解绑EIP
     *
     * 集群解绑Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateEipRequest 请求对象
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
     * @param DisassociateEipRequest 请求对象
     * @return AsyncInvoker<DisassociateEipRequest, DisassociateEipResponse>
     */
    public AsyncInvoker<DisassociateEipRequest, DisassociateEipResponse> disassociateEipAsyncInvoker(
        DisassociateEipRequest request) {
        return new AsyncInvoker<DisassociateEipRequest, DisassociateEipResponse>(request, DwsMeta.disassociateEip,
            hcClient);
    }

    /**
     * 集群解绑ELB
     *
     * 集群解绑Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateElbRequest 请求对象
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
     * @param DisassociateElbRequest 请求对象
     * @return AsyncInvoker<DisassociateElbRequest, DisassociateElbResponse>
     */
    public AsyncInvoker<DisassociateElbRequest, DisassociateElbResponse> disassociateElbAsyncInvoker(
        DisassociateElbRequest request) {
        return new AsyncInvoker<DisassociateElbRequest, DisassociateElbResponse>(request, DwsMeta.disassociateElb,
            hcClient);
    }

    /**
     * 下发重分布
     *
     * 下发重分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteRedistributionClusterRequest 请求对象
     * @return CompletableFuture<ExecuteRedistributionClusterResponse>
     */
    public CompletableFuture<ExecuteRedistributionClusterResponse> executeRedistributionClusterAsync(
        ExecuteRedistributionClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.executeRedistributionCluster);
    }

    /**
     * 下发重分布
     *
     * 下发重分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteRedistributionClusterRequest 请求对象
     * @return AsyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse>
     */
    public AsyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> executeRedistributionClusterAsyncInvoker(
        ExecuteRedistributionClusterRequest request) {
        return new AsyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse>(request,
            DwsMeta.executeRedistributionCluster, hcClient);
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
     * @param ExpandInstanceStorageRequest 请求对象
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
     * @param ExpandInstanceStorageRequest 请求对象
     * @return AsyncInvoker<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse>
     */
    public AsyncInvoker<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> expandInstanceStorageAsyncInvoker(
        ExpandInstanceStorageRequest request) {
        return new AsyncInvoker<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse>(request,
            DwsMeta.expandInstanceStorage, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmConfigsRequest 请求对象
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
     * @param ListAlarmConfigsRequest 请求对象
     * @return AsyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse>
     */
    public AsyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse> listAlarmConfigsAsyncInvoker(
        ListAlarmConfigsRequest request) {
        return new AsyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse>(request, DwsMeta.listAlarmConfigs,
            hcClient);
    }

    /**
     * 查询告警详情列表
     *
     * 查询告警详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmDetailRequest 请求对象
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
     * @param ListAlarmDetailRequest 请求对象
     * @return AsyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse>
     */
    public AsyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse> listAlarmDetailAsyncInvoker(
        ListAlarmDetailRequest request) {
        return new AsyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse>(request, DwsMeta.listAlarmDetail,
            hcClient);
    }

    /**
     * 查询告警统计列表
     *
     * 查询告警统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmStatisticRequest 请求对象
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
     * @param ListAlarmStatisticRequest 请求对象
     * @return AsyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse>
     */
    public AsyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse> listAlarmStatisticAsyncInvoker(
        ListAlarmStatisticRequest request) {
        return new AsyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse>(request,
            DwsMeta.listAlarmStatistic, hcClient);
    }

    /**
     * 查询告警订阅列表
     *
     * 查询订阅告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmSubsRequest 请求对象
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
     * @param ListAlarmSubsRequest 请求对象
     * @return AsyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse>
     */
    public AsyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse> listAlarmSubsAsyncInvoker(
        ListAlarmSubsRequest request) {
        return new AsyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse>(request, DwsMeta.listAlarmSubs, hcClient);
    }

    /**
     * 查询日志记录
     *
     * 查询审计日志记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditLogRequest 请求对象
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
     * @param ListAuditLogRequest 请求对象
     * @return AsyncInvoker<ListAuditLogRequest, ListAuditLogResponse>
     */
    public AsyncInvoker<ListAuditLogRequest, ListAuditLogResponse> listAuditLogAsyncInvoker(
        ListAuditLogRequest request) {
        return new AsyncInvoker<ListAuditLogRequest, ListAuditLogResponse>(request, DwsMeta.listAuditLog, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
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
     * @param ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            DwsMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询可用容灾集群列表
     *
     * 查询可用容灾集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableDisasterClustersRequest 请求对象
     * @return CompletableFuture<ListAvailableDisasterClustersResponse>
     */
    public CompletableFuture<ListAvailableDisasterClustersResponse> listAvailableDisasterClustersAsync(
        ListAvailableDisasterClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listAvailableDisasterClusters);
    }

    /**
     * 查询可用容灾集群列表
     *
     * 查询可用容灾集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableDisasterClustersRequest 请求对象
     * @return AsyncInvoker<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse>
     */
    public AsyncInvoker<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> listAvailableDisasterClustersAsyncInvoker(
        ListAvailableDisasterClustersRequest request) {
        return new AsyncInvoker<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse>(request,
            DwsMeta.listAvailableDisasterClusters, hcClient);
    }

    /**
     * 查询集群CN节点
     *
     * 查询集群的CN节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterCnRequest 请求对象
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
     * @param ListClusterCnRequest 请求对象
     * @return AsyncInvoker<ListClusterCnRequest, ListClusterCnResponse>
     */
    public AsyncInvoker<ListClusterCnRequest, ListClusterCnResponse> listClusterCnAsyncInvoker(
        ListClusterCnRequest request) {
        return new AsyncInvoker<ListClusterCnRequest, ListClusterCnResponse>(request, DwsMeta.listClusterCn, hcClient);
    }

    /**
     * 查询集群参数组
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterConfigurationsRequest 请求对象
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
     * @param ListClusterConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse>
     */
    public AsyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> listClusterConfigurationsAsyncInvoker(
        ListClusterConfigurationsRequest request) {
        return new AsyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse>(request,
            DwsMeta.listClusterConfigurations, hcClient);
    }

    /**
     * 查询集群参数配置
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterConfigurationsParameterRequest 请求对象
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
     * @param ListClusterConfigurationsParameterRequest 请求对象
     * @return AsyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse>
     */
    public AsyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> listClusterConfigurationsParameterAsyncInvoker(
        ListClusterConfigurationsParameterRequest request) {
        return new AsyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse>(
            request, DwsMeta.listClusterConfigurationsParameter, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterDetailsRequest 请求对象
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
     * @param ListClusterDetailsRequest 请求对象
     * @return AsyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>
     */
    public AsyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetailsAsyncInvoker(
        ListClusterDetailsRequest request) {
        return new AsyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>(request,
            DwsMeta.listClusterDetails, hcClient);
    }

    /**
     * 查询合适的缩容数
     *
     * 查询合适的缩容数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterScaleInNumbersRequest 请求对象
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
     * @param ListClusterScaleInNumbersRequest 请求对象
     * @return AsyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse>
     */
    public AsyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> listClusterScaleInNumbersAsyncInvoker(
        ListClusterScaleInNumbersRequest request) {
        return new AsyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse>(request,
            DwsMeta.listClusterScaleInNumbers, hcClient);
    }

    /**
     * 查询集群快照列表
     *
     * 该接口用于查询集群快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterSnapshotsRequest 请求对象
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
     * @param ListClusterSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse>
     */
    public AsyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> listClusterSnapshotsAsyncInvoker(
        ListClusterSnapshotsRequest request) {
        return new AsyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse>(request,
            DwsMeta.listClusterSnapshots, hcClient);
    }

    /**
     * 查询集群标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterTagsRequest 请求对象
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
     * @param ListClusterTagsRequest 请求对象
     * @return AsyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>
     */
    public AsyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTagsAsyncInvoker(
        ListClusterTagsRequest request) {
        return new AsyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>(request, DwsMeta.listClusterTags,
            hcClient);
    }

    /**
     * 查询资源管理
     *
     * 查询资管管理开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterWorkloadRequest 请求对象
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
     * @param ListClusterWorkloadRequest 请求对象
     * @return AsyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse>
     */
    public AsyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse> listClusterWorkloadAsyncInvoker(
        ListClusterWorkloadRequest request) {
        return new AsyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse>(request,
            DwsMeta.listClusterWorkload, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
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
     * @param ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<ListClustersRequest, ListClustersResponse>(request, DwsMeta.listClusters, hcClient);
    }

    /**
     * 查询数据源
     *
     * 该接口用于查询数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataSourceRequest 请求对象
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
     * @param ListDataSourceRequest 请求对象
     * @return AsyncInvoker<ListDataSourceRequest, ListDataSourceResponse>
     */
    public AsyncInvoker<ListDataSourceRequest, ListDataSourceResponse> listDataSourceAsyncInvoker(
        ListDataSourceRequest request) {
        return new AsyncInvoker<ListDataSourceRequest, ListDataSourceResponse>(request, DwsMeta.listDataSource,
            hcClient);
    }

    /**
     * 查询所有数据库用户/角色
     *
     * 查询所有数据库用户/角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
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
     * @param ListDatabaseUsersRequest 请求对象
     * @return AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersAsyncInvoker(
        ListDatabaseUsersRequest request) {
        return new AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>(request, DwsMeta.listDatabaseUsers,
            hcClient);
    }

    /**
     * 查询容灾列表
     *
     * 查询容灾列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDisasterRecoverRequest 请求对象
     * @return CompletableFuture<ListDisasterRecoverResponse>
     */
    public CompletableFuture<ListDisasterRecoverResponse> listDisasterRecoverAsync(ListDisasterRecoverRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listDisasterRecover);
    }

    /**
     * 查询容灾列表
     *
     * 查询容灾列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDisasterRecoverRequest 请求对象
     * @return AsyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse>
     */
    public AsyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse> listDisasterRecoverAsyncInvoker(
        ListDisasterRecoverRequest request) {
        return new AsyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse>(request,
            DwsMeta.listDisasterRecover, hcClient);
    }

    /**
     * 查询专属分布式存储池列表
     *
     * 获取专属分布式存储池列表，只包括用户开通的SSD专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDssPoolsRequest 请求对象
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
     * @param ListDssPoolsRequest 请求对象
     * @return AsyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse>
     */
    public AsyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse> listDssPoolsAsyncInvoker(
        ListDssPoolsRequest request) {
        return new AsyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse>(request, DwsMeta.listDssPools, hcClient);
    }

    /**
     * 获取集群可绑定的ELB列表
     *
     * 查询集群可以关联的Elb列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElbsRequest 请求对象
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
     * @param ListElbsRequest 请求对象
     * @return AsyncInvoker<ListElbsRequest, ListElbsResponse>
     */
    public AsyncInvoker<ListElbsRequest, ListElbsResponse> listElbsAsyncInvoker(ListElbsRequest request) {
        return new AsyncInvoker<ListElbsRequest, ListElbsResponse>(request, DwsMeta.listElbs, hcClient);
    }

    /**
     * 查询事件配置
     *
     * 查询事件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSpecsRequest 请求对象
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
     * @param ListEventSpecsRequest 请求对象
     * @return AsyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse>
     */
    public AsyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse> listEventSpecsAsyncInvoker(
        ListEventSpecsRequest request) {
        return new AsyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse>(request, DwsMeta.listEventSpecs,
            hcClient);
    }

    /**
     * 查询订阅事件
     *
     * 查询订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSubsRequest 请求对象
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
     * @param ListEventSubsRequest 请求对象
     * @return AsyncInvoker<ListEventSubsRequest, ListEventSubsResponse>
     */
    public AsyncInvoker<ListEventSubsRequest, ListEventSubsResponse> listEventSubsAsyncInvoker(
        ListEventSubsRequest request) {
        return new AsyncInvoker<ListEventSubsRequest, ListEventSubsResponse>(request, DwsMeta.listEventSubs, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
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
     * @param ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<ListEventsRequest, ListEventsResponse>(request, DwsMeta.listEvents, hcClient);
    }

    /**
     * openApi查询磁盘信息
     *
     * openApi查询磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostDiskRequest 请求对象
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
     * @param ListHostDiskRequest 请求对象
     * @return AsyncInvoker<ListHostDiskRequest, ListHostDiskResponse>
     */
    public AsyncInvoker<ListHostDiskRequest, ListHostDiskResponse> listHostDiskAsyncInvoker(
        ListHostDiskRequest request) {
        return new AsyncInvoker<ListHostDiskRequest, ListHostDiskResponse>(request, DwsMeta.listHostDisk, hcClient);
    }

    /**
     * openapi获取网卡状态
     *
     * openapi获取网卡状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostNetRequest 请求对象
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
     * @param ListHostNetRequest 请求对象
     * @return AsyncInvoker<ListHostNetRequest, ListHostNetResponse>
     */
    public AsyncInvoker<ListHostNetRequest, ListHostNetResponse> listHostNetAsyncInvoker(ListHostNetRequest request) {
        return new AsyncInvoker<ListHostNetRequest, ListHostNetResponse>(request, DwsMeta.listHostNet, hcClient);
    }

    /**
     * openApi查询主机概览
     *
     * openApi查询主机概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostOverviewRequest 请求对象
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
     * @param ListHostOverviewRequest 请求对象
     * @return AsyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse>
     */
    public AsyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse> listHostOverviewAsyncInvoker(
        ListHostOverviewRequest request) {
        return new AsyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse>(request, DwsMeta.listHostOverview,
            hcClient);
    }

    /**
     * 查询job进度
     *
     * 查询job进度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobDetailsRequest 请求对象
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
     * @param ListJobDetailsRequest 请求对象
     * @return AsyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse>
     */
    public AsyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse> listJobDetailsAsyncInvoker(
        ListJobDetailsRequest request) {
        return new AsyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse>(request, DwsMeta.listJobDetails,
            hcClient);
    }

    /**
     * openApi查询历史监控数据
     *
     * openApi查询历史监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitorIndicatorDataRequest 请求对象
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
     * @param ListMonitorIndicatorDataRequest 请求对象
     * @return AsyncInvoker<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse>
     */
    public AsyncInvoker<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> listMonitorIndicatorDataAsyncInvoker(
        ListMonitorIndicatorDataRequest request) {
        return new AsyncInvoker<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse>(request,
            DwsMeta.listMonitorIndicatorData, hcClient);
    }

    /**
     * openApi查询性能监控指标
     *
     * openApi查询性能监控指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitorIndicatorsRequest 请求对象
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
     * @param ListMonitorIndicatorsRequest 请求对象
     * @return AsyncInvoker<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse>
     */
    public AsyncInvoker<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> listMonitorIndicatorsAsyncInvoker(
        ListMonitorIndicatorsRequest request) {
        return new AsyncInvoker<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse>(request,
            DwsMeta.listMonitorIndicators, hcClient);
    }

    /**
     * 查询节点类型
     *
     * 该接口用于查询所有GaussDB(DWS)服务支持的节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodeTypesRequest 请求对象
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
     * @param ListNodeTypesRequest 请求对象
     * @return AsyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>
     */
    public AsyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypesAsyncInvoker(
        ListNodeTypesRequest request) {
        return new AsyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>(request, DwsMeta.listNodeTypes, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDB(DWS)服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
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
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, DwsMeta.listQuotas, hcClient);
    }

    /**
     * 查询快照详情
     *
     * 该接口用于使用快照ID查询快照详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotDetailsRequest 请求对象
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
     * @param ListSnapshotDetailsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>
     */
    public AsyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetailsAsyncInvoker(
        ListSnapshotDetailsRequest request) {
        return new AsyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>(request,
            DwsMeta.listSnapshotDetails, hcClient);
    }

    /**
     * 查询快照策略
     *
     * 查询快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotPolicyRequest 请求对象
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
     * @param ListSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse>
     */
    public AsyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> listSnapshotPolicyAsyncInvoker(
        ListSnapshotPolicyRequest request) {
        return new AsyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse>(request,
            DwsMeta.listSnapshotPolicy, hcClient);
    }

    /**
     * 快照统计信息
     *
     * 快照统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotStatisticsRequest 请求对象
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
     * @param ListSnapshotStatisticsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse>
     */
    public AsyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> listSnapshotStatisticsAsyncInvoker(
        ListSnapshotStatisticsRequest request) {
        return new AsyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse>(request,
            DwsMeta.listSnapshotStatistics, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotsRequest 请求对象
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
     * @param ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, DwsMeta.listSnapshots, hcClient);
    }

    /**
     * 查询资源统计信息列表
     *
     * 查询当前可用资源数量，其中包括“可用集群和总集群（个）”、“可用节点和总节点（个）”、“总容量（GB）”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
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
     * @param ListStatisticsRequest 请求对象
     * @return AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsAsyncInvoker(
        ListStatisticsRequest request) {
        return new AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request, DwsMeta.listStatistics,
            hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
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
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, DwsMeta.listTags, hcClient);
    }

    /**
     * 查询工作负载队列
     *
     * 查询工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkloadQueueRequest 请求对象
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
     * @param ListWorkloadQueueRequest 请求对象
     * @return AsyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse>
     */
    public AsyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse> listWorkloadQueueAsyncInvoker(
        ListWorkloadQueueRequest request) {
        return new AsyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse>(request, DwsMeta.listWorkloadQueue,
            hcClient);
    }

    /**
     * 停止容灾
     *
     * 停止容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<PauseDisasterRecoveryResponse>
     */
    public CompletableFuture<PauseDisasterRecoveryResponse> pauseDisasterRecoveryAsync(
        PauseDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.pauseDisasterRecovery);
    }

    /**
     * 停止容灾
     *
     * 停止容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse>
     */
    public AsyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> pauseDisasterRecoveryAsyncInvoker(
        PauseDisasterRecoveryRequest request) {
        return new AsyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse>(request,
            DwsMeta.pauseDisasterRecovery, hcClient);
    }

    /**
     * 重置密码
     *
     * 此接口用于重置集群管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
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
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, DwsMeta.resetPassword, hcClient);
    }

    /**
     * 扩容集群调整集群大小
     *
     * 此接口用于扩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
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
     * @param ResizeClusterRequest 请求对象
     * @return AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse>
     */
    public AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterAsyncInvoker(
        ResizeClusterRequest request) {
        return new AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse>(request, DwsMeta.resizeCluster, hcClient);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
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
     * @param RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(
        RestartClusterRequest request) {
        return new AsyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, DwsMeta.restartCluster,
            hcClient);
    }

    /**
     * 恢复集群
     *
     * 该接口用于使用快照恢复集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreClusterRequest 请求对象
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
     * @param RestoreClusterRequest 请求对象
     * @return AsyncInvoker<RestoreClusterRequest, RestoreClusterResponse>
     */
    public AsyncInvoker<RestoreClusterRequest, RestoreClusterResponse> restoreClusterAsyncInvoker(
        RestoreClusterRequest request) {
        return new AsyncInvoker<RestoreClusterRequest, RestoreClusterResponse>(request, DwsMeta.restoreCluster,
            hcClient);
    }

    /**
     * 恢复容灾
     *
     * 恢复容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreDisasterRequest 请求对象
     * @return CompletableFuture<RestoreDisasterResponse>
     */
    public CompletableFuture<RestoreDisasterResponse> restoreDisasterAsync(RestoreDisasterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restoreDisaster);
    }

    /**
     * 恢复容灾
     *
     * 恢复容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreDisasterRequest 请求对象
     * @return AsyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse>
     */
    public AsyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse> restoreDisasterAsyncInvoker(
        RestoreDisasterRequest request) {
        return new AsyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse>(request, DwsMeta.restoreDisaster,
            hcClient);
    }

    /**
     * 查询数据库对象权限
     *
     * 查询数据库对象权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseAuthorityRequest 请求对象
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
     * @param ShowDatabaseAuthorityRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse>
     */
    public AsyncInvoker<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> showDatabaseAuthorityAsyncInvoker(
        ShowDatabaseAuthorityRequest request) {
        return new AsyncInvoker<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse>(request,
            DwsMeta.showDatabaseAuthority, hcClient);
    }

    /**
     * 查询指定用户信息
     *
     * 查询指定用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseUserRequest 请求对象
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
     * @param ShowDatabaseUserRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseUserRequest, ShowDatabaseUserResponse>
     */
    public AsyncInvoker<ShowDatabaseUserRequest, ShowDatabaseUserResponse> showDatabaseUserAsyncInvoker(
        ShowDatabaseUserRequest request) {
        return new AsyncInvoker<ShowDatabaseUserRequest, ShowDatabaseUserResponse>(request, DwsMeta.showDatabaseUser,
            hcClient);
    }

    /**
     * 查询容灾详情
     *
     * 查询容灾详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDisasterDetailRequest 请求对象
     * @return CompletableFuture<ShowDisasterDetailResponse>
     */
    public CompletableFuture<ShowDisasterDetailResponse> showDisasterDetailAsync(ShowDisasterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showDisasterDetail);
    }

    /**
     * 查询容灾详情
     *
     * 查询容灾详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDisasterDetailRequest 请求对象
     * @return AsyncInvoker<ShowDisasterDetailRequest, ShowDisasterDetailResponse>
     */
    public AsyncInvoker<ShowDisasterDetailRequest, ShowDisasterDetailResponse> showDisasterDetailAsyncInvoker(
        ShowDisasterDetailRequest request) {
        return new AsyncInvoker<ShowDisasterDetailRequest, ShowDisasterDetailResponse>(request,
            DwsMeta.showDisasterDetail, hcClient);
    }

    /**
     * 容灾-查询容灾进度详情
     *
     * 容灾-查询容灾进度详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDisasterProgressRequest 请求对象
     * @return CompletableFuture<ShowDisasterProgressResponse>
     */
    public CompletableFuture<ShowDisasterProgressResponse> showDisasterProgressAsync(
        ShowDisasterProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.showDisasterProgress);
    }

    /**
     * 容灾-查询容灾进度详情
     *
     * 容灾-查询容灾进度详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDisasterProgressRequest 请求对象
     * @return AsyncInvoker<ShowDisasterProgressRequest, ShowDisasterProgressResponse>
     */
    public AsyncInvoker<ShowDisasterProgressRequest, ShowDisasterProgressResponse> showDisasterProgressAsyncInvoker(
        ShowDisasterProgressRequest request) {
        return new AsyncInvoker<ShowDisasterProgressRequest, ShowDisasterProgressResponse>(request,
            DwsMeta.showDisasterProgress, hcClient);
    }

    /**
     * 集群缩容
     *
     * 该接口用于缩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkClusterRequest 请求对象
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
     * @param ShrinkClusterRequest 请求对象
     * @return AsyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>
     */
    public AsyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse> shrinkClusterAsyncInvoker(
        ShrinkClusterRequest request) {
        return new AsyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>(request, DwsMeta.shrinkCluster, hcClient);
    }

    /**
     * 启动容灾
     *
     * 启动容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<StartDisasterRecoveryResponse>
     */
    public CompletableFuture<StartDisasterRecoveryResponse> startDisasterRecoveryAsync(
        StartDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.startDisasterRecovery);
    }

    /**
     * 启动容灾
     *
     * 启动容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse>
     */
    public AsyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> startDisasterRecoveryAsyncInvoker(
        StartDisasterRecoveryRequest request) {
        return new AsyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse>(request,
            DwsMeta.startDisasterRecovery, hcClient);
    }

    /**
     * 容灾异常切换
     *
     * 容灾-异常切换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchFailoverDisasterRequest 请求对象
     * @return CompletableFuture<SwitchFailoverDisasterResponse>
     */
    public CompletableFuture<SwitchFailoverDisasterResponse> switchFailoverDisasterAsync(
        SwitchFailoverDisasterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.switchFailoverDisaster);
    }

    /**
     * 容灾异常切换
     *
     * 容灾-异常切换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchFailoverDisasterRequest 请求对象
     * @return AsyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse>
     */
    public AsyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> switchFailoverDisasterAsyncInvoker(
        SwitchFailoverDisasterRequest request) {
        return new AsyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse>(request,
            DwsMeta.switchFailoverDisaster, hcClient);
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
     * @param SwitchOverClusterRequest 请求对象
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
     * @param SwitchOverClusterRequest 请求对象
     * @return AsyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse>
     */
    public AsyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse> switchOverClusterAsyncInvoker(
        SwitchOverClusterRequest request) {
        return new AsyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse>(request, DwsMeta.switchOverCluster,
            hcClient);
    }

    /**
     * 灾备切换
     *
     * 容灾-灾备切换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchoverDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<SwitchoverDisasterRecoveryResponse>
     */
    public CompletableFuture<SwitchoverDisasterRecoveryResponse> switchoverDisasterRecoveryAsync(
        SwitchoverDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.switchoverDisasterRecovery);
    }

    /**
     * 灾备切换
     *
     * 容灾-灾备切换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchoverDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse>
     */
    public AsyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> switchoverDisasterRecoveryAsyncInvoker(
        SwitchoverDisasterRecoveryRequest request) {
        return new AsyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse>(request,
            DwsMeta.switchoverDisasterRecovery, hcClient);
    }

    /**
     * 同步IAM用户到数据库
     *
     * 同步IAM用户到数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncIamUsersRequest 请求对象
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
     * @param SyncIamUsersRequest 请求对象
     * @return AsyncInvoker<SyncIamUsersRequest, SyncIamUsersResponse>
     */
    public AsyncInvoker<SyncIamUsersRequest, SyncIamUsersResponse> syncIamUsersAsyncInvoker(
        SyncIamUsersRequest request) {
        return new AsyncInvoker<SyncIamUsersRequest, SyncIamUsersResponse>(request, DwsMeta.syncIamUsers, hcClient);
    }

    /**
     * 更新告警订阅
     *
     * 更新订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmSubRequest 请求对象
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
     * @param UpdateAlarmSubRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse>
     */
    public AsyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse> updateAlarmSubAsyncInvoker(
        UpdateAlarmSubRequest request) {
        return new AsyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse>(request, DwsMeta.updateAlarmSub,
            hcClient);
    }

    /**
     * 修改集群域名
     *
     * 为指定集群修改域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterDnsRequest 请求对象
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
     * @param UpdateClusterDnsRequest 请求对象
     * @return AsyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse>
     */
    public AsyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse> updateClusterDnsAsyncInvoker(
        UpdateClusterDnsRequest request) {
        return new AsyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse>(request, DwsMeta.updateClusterDns,
            hcClient);
    }

    /**
     * 修改集群参数配置
     *
     * 修改集群使用的参数配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
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
     * @param UpdateConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(
        UpdateConfigurationRequest request) {
        return new AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            DwsMeta.updateConfiguration, hcClient);
    }

    /**
     * 更新数据源
     *
     * 该接口用于更新一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataSourceRequest 请求对象
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
     * @param UpdateDataSourceRequest 请求对象
     * @return AsyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>
     */
    public AsyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSourceAsyncInvoker(
        UpdateDataSourceRequest request) {
        return new AsyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>(request, DwsMeta.updateDataSource,
            hcClient);
    }

    /**
     * 修改数据库对象权限
     *
     * 修改数据库对象权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseAuthorityRequest 请求对象
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
     * @param UpdateDatabaseAuthorityRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse>
     */
    public AsyncInvoker<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> updateDatabaseAuthorityAsyncInvoker(
        UpdateDatabaseAuthorityRequest request) {
        return new AsyncInvoker<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse>(request,
            DwsMeta.updateDatabaseAuthority, hcClient);
    }

    /**
     * 修改指定用户信息
     *
     * 修改指定用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseUserInfoRequest 请求对象
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
     * @param UpdateDatabaseUserInfoRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse>
     */
    public AsyncInvoker<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> updateDatabaseUserInfoAsyncInvoker(
        UpdateDatabaseUserInfoRequest request) {
        return new AsyncInvoker<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse>(request,
            DwsMeta.updateDatabaseUserInfo, hcClient);
    }

    /**
     * 更新容灾配置
     *
     * 更新容灾配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDisasterInfoRequest 请求对象
     * @return CompletableFuture<UpdateDisasterInfoResponse>
     */
    public CompletableFuture<UpdateDisasterInfoResponse> updateDisasterInfoAsync(UpdateDisasterInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.updateDisasterInfo);
    }

    /**
     * 更新容灾配置
     *
     * 更新容灾配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDisasterInfoRequest 请求对象
     * @return AsyncInvoker<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse>
     */
    public AsyncInvoker<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> updateDisasterInfoAsyncInvoker(
        UpdateDisasterInfoRequest request) {
        return new AsyncInvoker<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse>(request,
            DwsMeta.updateDisasterInfo, hcClient);
    }

    /**
     * 更新订阅事件
     *
     * 更新订阅事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSubRequest 请求对象
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
     * @param UpdateEventSubRequest 请求对象
     * @return AsyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse>
     */
    public AsyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse> updateEventSubAsyncInvoker(
        UpdateEventSubRequest request) {
        return new AsyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse>(request, DwsMeta.updateEventSub,
            hcClient);
    }

    /**
     * 修改运维时间窗
     *
     * 您可以根据业务需求，设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMaintenanceWindowRequest 请求对象
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
     * @param UpdateMaintenanceWindowRequest 请求对象
     * @return AsyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>
     */
    public AsyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> updateMaintenanceWindowAsyncInvoker(
        UpdateMaintenanceWindowRequest request) {
        return new AsyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>(request,
            DwsMeta.updateMaintenanceWindow, hcClient);
    }

}
