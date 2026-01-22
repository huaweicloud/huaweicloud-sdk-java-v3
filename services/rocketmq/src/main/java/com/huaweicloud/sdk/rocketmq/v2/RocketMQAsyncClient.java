package com.huaweicloud.sdk.rocketmq.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisReportRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisReportResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchResetRocketMqMessageOffsetsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchResetRocketMqMessageOffsetsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConfigFeaturesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConfigFeaturesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListScheduledTasksRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListScheduledTasksResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyInstanceSslConfigRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyInstanceSslConfigResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyRecyclePolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyRecyclePolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.RestoreRecycleInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.RestoreRecycleInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowBackgroundTaskProgressRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowBackgroundTaskProgressResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceNodesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceNodesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRecycleInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRecycleInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqProductCoresRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqProductCoresResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqScalePreCheckInfoRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqScalePreCheckInfoResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUpgradeInstanceVersionRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUpgradeInstanceVersionResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowVolumeExpandConfigRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowVolumeExpandConfigResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateScheduledTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateScheduledTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateVolumeExpansionConfigRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateVolumeExpansionConfigResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageResponse;

import java.util.concurrent.CompletableFuture;

public class RocketMQAsyncClient {

    protected HcClient hcClient;

    public RocketMQAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RocketMQAsyncClient> newBuilder() {
        ClientBuilder<RocketMQAsyncClient> clientBuilder = new ClientBuilder<>(RocketMQAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteRocketmqTagRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteRocketmqTagResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteRocketmqTagResponse> batchCreateOrDeleteRocketmqTagAsync(
        BatchCreateOrDeleteRocketmqTagRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.batchCreateOrDeleteRocketmqTag);
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteRocketmqTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> batchCreateOrDeleteRocketmqTagAsyncInvoker(
        BatchCreateOrDeleteRocketmqTagRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.batchCreateOrDeleteRocketmqTag, hcClient);
    }

    /**
     * 批量删除实例诊断报告
     *
     * 批量删除实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisRecordsRequest 请求对象
     * @return CompletableFuture<BatchDeleteDiagnosisRecordsResponse>
     */
    public CompletableFuture<BatchDeleteDiagnosisRecordsResponse> batchDeleteDiagnosisRecordsAsync(
        BatchDeleteDiagnosisRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.batchDeleteDiagnosisRecords);
    }

    /**
     * 批量删除实例诊断报告
     *
     * 批量删除实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisRecordsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDiagnosisRecordsRequest, BatchDeleteDiagnosisRecordsResponse>
     */
    public AsyncInvoker<BatchDeleteDiagnosisRecordsRequest, BatchDeleteDiagnosisRecordsResponse> batchDeleteDiagnosisRecordsAsyncInvoker(
        BatchDeleteDiagnosisRecordsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.batchDeleteDiagnosisRecords, hcClient);
    }

    /**
     * 批量删除实例诊断报告
     *
     * 批量删除实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisRecordsForRocketMqRequest 请求对象
     * @return CompletableFuture<BatchDeleteDiagnosisRecordsForRocketMqResponse>
     */
    public CompletableFuture<BatchDeleteDiagnosisRecordsForRocketMqResponse> batchDeleteDiagnosisRecordsForRocketMqAsync(
        BatchDeleteDiagnosisRecordsForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.batchDeleteDiagnosisRecordsForRocketMq);
    }

    /**
     * 批量删除实例诊断报告
     *
     * 批量删除实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisRecordsForRocketMqRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDiagnosisRecordsForRocketMqRequest, BatchDeleteDiagnosisRecordsForRocketMqResponse>
     */
    public AsyncInvoker<BatchDeleteDiagnosisRecordsForRocketMqRequest, BatchDeleteDiagnosisRecordsForRocketMqResponse> batchDeleteDiagnosisRecordsForRocketMqAsyncInvoker(
        BatchDeleteDiagnosisRecordsForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.batchDeleteDiagnosisRecordsForRocketMq, hcClient);
    }

    /**
     * 批量删除实例诊断记录
     *
     * 批量删除实例诊断记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisReportRequest 请求对象
     * @return CompletableFuture<BatchDeleteDiagnosisReportResponse>
     */
    public CompletableFuture<BatchDeleteDiagnosisReportResponse> batchDeleteDiagnosisReportAsync(
        BatchDeleteDiagnosisReportRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.batchDeleteDiagnosisReport);
    }

    /**
     * 批量删除实例诊断记录
     *
     * 批量删除实例诊断记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisReportRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDiagnosisReportRequest, BatchDeleteDiagnosisReportResponse>
     */
    public AsyncInvoker<BatchDeleteDiagnosisReportRequest, BatchDeleteDiagnosisReportResponse> batchDeleteDiagnosisReportAsyncInvoker(
        BatchDeleteDiagnosisReportRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.batchDeleteDiagnosisReport, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。**实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstancesResponse>
     */
    public CompletableFuture<BatchDeleteInstancesResponse> batchDeleteInstancesAsync(
        BatchDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.batchDeleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。**实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>
     */
    public AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstancesAsyncInvoker(
        BatchDeleteInstancesRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.batchDeleteInstances, hcClient);
    }

    /**
     * 批量删除元数据迁移任务
     *
     * 批量删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRocketMqMigrationTaskRequest 请求对象
     * @return CompletableFuture<BatchDeleteRocketMqMigrationTaskResponse>
     */
    public CompletableFuture<BatchDeleteRocketMqMigrationTaskResponse> batchDeleteRocketMqMigrationTaskAsync(
        BatchDeleteRocketMqMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.batchDeleteRocketMqMigrationTask);
    }

    /**
     * 批量删除元数据迁移任务
     *
     * 批量删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRocketMqMigrationTaskRequest 请求对象
     * @return AsyncInvoker<BatchDeleteRocketMqMigrationTaskRequest, BatchDeleteRocketMqMigrationTaskResponse>
     */
    public AsyncInvoker<BatchDeleteRocketMqMigrationTaskRequest, BatchDeleteRocketMqMigrationTaskResponse> batchDeleteRocketMqMigrationTaskAsyncInvoker(
        BatchDeleteRocketMqMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.batchDeleteRocketMqMigrationTask, hcClient);
    }

    /**
     * 批量重置消费进度
     *
     * 批量重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetRocketMqMessageOffsetsRequest 请求对象
     * @return CompletableFuture<BatchResetRocketMqMessageOffsetsResponse>
     */
    public CompletableFuture<BatchResetRocketMqMessageOffsetsResponse> batchResetRocketMqMessageOffsetsAsync(
        BatchResetRocketMqMessageOffsetsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.batchResetRocketMqMessageOffsets);
    }

    /**
     * 批量重置消费进度
     *
     * 批量重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetRocketMqMessageOffsetsRequest 请求对象
     * @return AsyncInvoker<BatchResetRocketMqMessageOffsetsRequest, BatchResetRocketMqMessageOffsetsResponse>
     */
    public AsyncInvoker<BatchResetRocketMqMessageOffsetsRequest, BatchResetRocketMqMessageOffsetsResponse> batchResetRocketMqMessageOffsetsAsyncInvoker(
        BatchResetRocketMqMessageOffsetsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.batchResetRocketMqMessageOffsets, hcClient);
    }

    /**
     * 批量修改消费组
     *
     * 批量修改消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateConsumerGroupRequest 请求对象
     * @return CompletableFuture<BatchUpdateConsumerGroupResponse>
     */
    public CompletableFuture<BatchUpdateConsumerGroupResponse> batchUpdateConsumerGroupAsync(
        BatchUpdateConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.batchUpdateConsumerGroup);
    }

    /**
     * 批量修改消费组
     *
     * 批量修改消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateConsumerGroupRequest 请求对象
     * @return AsyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse>
     */
    public AsyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> batchUpdateConsumerGroupAsyncInvoker(
        BatchUpdateConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.batchUpdateConsumerGroup, hcClient);
    }

    /**
     * 创建消费组或批量删除消费组
     *
     * 创建消费组或批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConsumerGroupOrBatchDeleteConsumerGroupRequest 请求对象
     * @return CompletableFuture<CreateConsumerGroupOrBatchDeleteConsumerGroupResponse>
     */
    public CompletableFuture<CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> createConsumerGroupOrBatchDeleteConsumerGroupAsync(
        CreateConsumerGroupOrBatchDeleteConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createConsumerGroupOrBatchDeleteConsumerGroup);
    }

    /**
     * 创建消费组或批量删除消费组
     *
     * 创建消费组或批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConsumerGroupOrBatchDeleteConsumerGroupRequest 请求对象
     * @return AsyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse>
     */
    public AsyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> createConsumerGroupOrBatchDeleteConsumerGroupAsyncInvoker(
        CreateConsumerGroupOrBatchDeleteConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createConsumerGroupOrBatchDeleteConsumerGroup, hcClient);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<CreateDiagnosisTaskResponse>
     */
    public CompletableFuture<CreateDiagnosisTaskResponse> createDiagnosisTaskAsync(CreateDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createDiagnosisTask);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>
     */
    public AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTaskAsyncInvoker(
        CreateDiagnosisTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createDiagnosisTask, hcClient);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskForRocketMqRequest 请求对象
     * @return CompletableFuture<CreateDiagnosisTaskForRocketMqResponse>
     */
    public CompletableFuture<CreateDiagnosisTaskForRocketMqResponse> createDiagnosisTaskForRocketMqAsync(
        CreateDiagnosisTaskForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createDiagnosisTaskForRocketMq);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskForRocketMqRequest 请求对象
     * @return AsyncInvoker<CreateDiagnosisTaskForRocketMqRequest, CreateDiagnosisTaskForRocketMqResponse>
     */
    public AsyncInvoker<CreateDiagnosisTaskForRocketMqRequest, CreateDiagnosisTaskForRocketMqResponse> createDiagnosisTaskForRocketMqAsyncInvoker(
        CreateDiagnosisTaskForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createDiagnosisTaskForRocketMq, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,ax)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceByEngineRequest 请求对象
     * @return CompletableFuture<CreateInstanceByEngineResponse>
     */
    public CompletableFuture<CreateInstanceByEngineResponse> createInstanceByEngineAsync(
        CreateInstanceByEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createInstanceByEngine);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,ax)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceByEngineRequest 请求对象
     * @return AsyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>
     */
    public AsyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngineAsyncInvoker(
        CreateInstanceByEngineRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createInstanceByEngine, hcClient);
    }

    /**
     * 创建实例（按需）
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return CompletableFuture<CreatePostPaidInstanceResponse>
     */
    public CompletableFuture<CreatePostPaidInstanceResponse> createPostPaidInstanceAsync(
        CreatePostPaidInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createPostPaidInstance);
    }

    /**
     * 创建实例（按需）
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceAsyncInvoker(
        CreatePostPaidInstanceRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createPostPaidInstance, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,ax)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceForRocketMqRequest 请求对象
     * @return CompletableFuture<CreatePostPaidInstanceForRocketMqResponse>
     */
    public CompletableFuture<CreatePostPaidInstanceForRocketMqResponse> createPostPaidInstanceForRocketMqAsync(
        CreatePostPaidInstanceForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createPostPaidInstanceForRocketMq);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,ax)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceForRocketMqRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidInstanceForRocketMqRequest, CreatePostPaidInstanceForRocketMqResponse>
     */
    public AsyncInvoker<CreatePostPaidInstanceForRocketMqRequest, CreatePostPaidInstanceForRocketMqResponse> createPostPaidInstanceForRocketMqAsyncInvoker(
        CreatePostPaidInstanceForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createPostPaidInstanceForRocketMq, hcClient);
    }

    /**
     * 新建元数据迁移任务
     *
     * 新建元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRocketMqMigrationTaskRequest 请求对象
     * @return CompletableFuture<CreateRocketMqMigrationTaskResponse>
     */
    public CompletableFuture<CreateRocketMqMigrationTaskResponse> createRocketMqMigrationTaskAsync(
        CreateRocketMqMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createRocketMqMigrationTask);
    }

    /**
     * 新建元数据迁移任务
     *
     * 新建元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRocketMqMigrationTaskRequest 请求对象
     * @return AsyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse>
     */
    public AsyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> createRocketMqMigrationTaskAsyncInvoker(
        CreateRocketMqMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createRocketMqMigrationTask, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CompletableFuture<CreateUserResponse>
     */
    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createUser, hcClient);
    }

    /**
     * 删除后台任务管理中的指定记录
     *
     * 删除后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return CompletableFuture<DeleteBackgroundTaskResponse>
     */
    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(
        DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.deleteBackgroundTask);
    }

    /**
     * 删除后台任务管理中的指定记录
     *
     * 删除后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>
     */
    public AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskAsyncInvoker(
        DeleteBackgroundTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupRequest 请求对象
     * @return CompletableFuture<DeleteConsumerGroupResponse>
     */
    public CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroupAsync(DeleteConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.deleteConsumerGroup);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupRequest 请求对象
     * @return AsyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse>
     */
    public AsyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroupAsyncInvoker(
        DeleteConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.deleteConsumerGroup, hcClient);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.deleteInstance);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.deleteInstance, hcClient);
    }

    /**
     * 删除元数据迁移任务
     *
     * 删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRocketMqMigrationTaskRequest 请求对象
     * @return CompletableFuture<DeleteRocketMqMigrationTaskResponse>
     */
    public CompletableFuture<DeleteRocketMqMigrationTaskResponse> deleteRocketMqMigrationTaskAsync(
        DeleteRocketMqMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.deleteRocketMqMigrationTask);
    }

    /**
     * 删除元数据迁移任务
     *
     * 删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRocketMqMigrationTaskRequest 请求对象
     * @return AsyncInvoker<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse>
     */
    public AsyncInvoker<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse> deleteRocketMqMigrationTaskAsyncInvoker(
        DeleteRocketMqMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.deleteRocketMqMigrationTask, hcClient);
    }

    /**
     * 删除定时任务管理中的指定记录
     *
     * 删除定时任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return CompletableFuture<DeleteScheduledTaskResponse>
     */
    public CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTaskAsync(DeleteScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.deleteScheduledTask);
    }

    /**
     * 删除定时任务管理中的指定记录
     *
     * 删除定时任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return AsyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
     */
    public AsyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTaskAsyncInvoker(
        DeleteScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.deleteScheduledTask, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.deleteUser, hcClient);
    }

    /**
     * 开启RocketMQ实例域名访问能力
     *
     * 开启RocketMQ实例域名访问能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return CompletableFuture<EnableDnsResponse>
     */
    public CompletableFuture<EnableDnsResponse> enableDnsAsync(EnableDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.enableDns);
    }

    /**
     * 开启RocketMQ实例域名访问能力
     *
     * 开启RocketMQ实例域名访问能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return AsyncInvoker<EnableDnsRequest, EnableDnsResponse>
     */
    public AsyncInvoker<EnableDnsRequest, EnableDnsResponse> enableDnsAsyncInvoker(EnableDnsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.enableDns, hcClient);
    }

    /**
     * 导出死信消息
     *
     * 导出死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDlqMessageRequest 请求对象
     * @return CompletableFuture<ExportDlqMessageResponse>
     */
    public CompletableFuture<ExportDlqMessageResponse> exportDlqMessageAsync(ExportDlqMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.exportDlqMessage);
    }

    /**
     * 导出死信消息
     *
     * 导出死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDlqMessageRequest 请求对象
     * @return AsyncInvoker<ExportDlqMessageRequest, ExportDlqMessageResponse>
     */
    public AsyncInvoker<ExportDlqMessageRequest, ExportDlqMessageResponse> exportDlqMessageAsyncInvoker(
        ExportDlqMessageRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.exportDlqMessage, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return CompletableFuture<ListAvailableZonesResponse>
     */
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesAsyncInvoker(
        ListAvailableZonesRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询实例的后台任务列表
     *
     * 查询实例的后台任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTasksRequest 请求对象
     * @return CompletableFuture<ListBackgroundTasksResponse>
     */
    public CompletableFuture<ListBackgroundTasksResponse> listBackgroundTasksAsync(ListBackgroundTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listBackgroundTasks);
    }

    /**
     * 查询实例的后台任务列表
     *
     * 查询实例的后台任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTasksRequest 请求对象
     * @return AsyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse>
     */
    public AsyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasksAsyncInvoker(
        ListBackgroundTasksRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listBackgroundTasks, hcClient);
    }

    /**
     * 查询代理列表
     *
     * 查询代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBrokersRequest 请求对象
     * @return CompletableFuture<ListBrokersResponse>
     */
    public CompletableFuture<ListBrokersResponse> listBrokersAsync(ListBrokersRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listBrokers);
    }

    /**
     * 查询代理列表
     *
     * 查询代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBrokersRequest 请求对象
     * @return AsyncInvoker<ListBrokersRequest, ListBrokersResponse>
     */
    public AsyncInvoker<ListBrokersRequest, ListBrokersResponse> listBrokersAsyncInvoker(ListBrokersRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listBrokers, hcClient);
    }

    /**
     * 获取特性开关列表
     *
     * 获取特性开关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigFeaturesRequest 请求对象
     * @return CompletableFuture<ListConfigFeaturesResponse>
     */
    public CompletableFuture<ListConfigFeaturesResponse> listConfigFeaturesAsync(ListConfigFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listConfigFeatures);
    }

    /**
     * 获取特性开关列表
     *
     * 获取特性开关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigFeaturesRequest 请求对象
     * @return AsyncInvoker<ListConfigFeaturesRequest, ListConfigFeaturesResponse>
     */
    public AsyncInvoker<ListConfigFeaturesRequest, ListConfigFeaturesResponse> listConfigFeaturesAsyncInvoker(
        ListConfigFeaturesRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listConfigFeatures, hcClient);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyRequest 请求对象
     * @return CompletableFuture<ListConsumeGroupAccessPolicyResponse>
     */
    public CompletableFuture<ListConsumeGroupAccessPolicyResponse> listConsumeGroupAccessPolicyAsync(
        ListConsumeGroupAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listConsumeGroupAccessPolicy);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyRequest 请求对象
     * @return AsyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse>
     */
    public AsyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> listConsumeGroupAccessPolicyAsyncInvoker(
        ListConsumeGroupAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listConsumeGroupAccessPolicy, hcClient);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyForRocketMqRequest 请求对象
     * @return CompletableFuture<ListConsumeGroupAccessPolicyForRocketMqResponse>
     */
    public CompletableFuture<ListConsumeGroupAccessPolicyForRocketMqResponse> listConsumeGroupAccessPolicyForRocketMqAsync(
        ListConsumeGroupAccessPolicyForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listConsumeGroupAccessPolicyForRocketMq);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyForRocketMqRequest 请求对象
     * @return AsyncInvoker<ListConsumeGroupAccessPolicyForRocketMqRequest, ListConsumeGroupAccessPolicyForRocketMqResponse>
     */
    public AsyncInvoker<ListConsumeGroupAccessPolicyForRocketMqRequest, ListConsumeGroupAccessPolicyForRocketMqResponse> listConsumeGroupAccessPolicyForRocketMqAsyncInvoker(
        ListConsumeGroupAccessPolicyForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listConsumeGroupAccessPolicyForRocketMq, hcClient);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsRequest 请求对象
     * @return CompletableFuture<ListDiagnosisReportsResponse>
     */
    public CompletableFuture<ListDiagnosisReportsResponse> listDiagnosisReportsAsync(
        ListDiagnosisReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listDiagnosisReports);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsRequest 请求对象
     * @return AsyncInvoker<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse>
     */
    public AsyncInvoker<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse> listDiagnosisReportsAsyncInvoker(
        ListDiagnosisReportsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listDiagnosisReports, hcClient);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsForRocketMqRequest 请求对象
     * @return CompletableFuture<ListDiagnosisReportsForRocketMqResponse>
     */
    public CompletableFuture<ListDiagnosisReportsForRocketMqResponse> listDiagnosisReportsForRocketMqAsync(
        ListDiagnosisReportsForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listDiagnosisReportsForRocketMq);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsForRocketMqRequest 请求对象
     * @return AsyncInvoker<ListDiagnosisReportsForRocketMqRequest, ListDiagnosisReportsForRocketMqResponse>
     */
    public AsyncInvoker<ListDiagnosisReportsForRocketMqRequest, ListDiagnosisReportsForRocketMqResponse> listDiagnosisReportsForRocketMqAsyncInvoker(
        ListDiagnosisReportsForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listDiagnosisReportsForRocketMq, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 查询相应引擎的产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return CompletableFuture<ListEngineProductsResponse>
     */
    public CompletableFuture<ListEngineProductsResponse> listEngineProductsAsync(ListEngineProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listEngineProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 查询相应引擎的产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return AsyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse>
     */
    public AsyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProductsAsyncInvoker(
        ListEngineProductsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return CompletableFuture<ListInstanceConsumerGroupsResponse>
     */
    public CompletableFuture<ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsAsync(
        ListInstanceConsumerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listInstanceConsumerGroups);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return AsyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>
     */
    public AsyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsAsyncInvoker(
        ListInstanceConsumerGroupsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listInstanceConsumerGroups, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listInstances);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listInstances, hcClient);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceRequest 请求对象
     * @return CompletableFuture<ListMessageTraceResponse>
     */
    public CompletableFuture<ListMessageTraceResponse> listMessageTraceAsync(ListMessageTraceRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listMessageTrace);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceRequest 请求对象
     * @return AsyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse>
     */
    public AsyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse> listMessageTraceAsyncInvoker(
        ListMessageTraceRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listMessageTrace, hcClient);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceForRocketMqRequest 请求对象
     * @return CompletableFuture<ListMessageTraceForRocketMqResponse>
     */
    public CompletableFuture<ListMessageTraceForRocketMqResponse> listMessageTraceForRocketMqAsync(
        ListMessageTraceForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listMessageTraceForRocketMq);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceForRocketMqRequest 请求对象
     * @return AsyncInvoker<ListMessageTraceForRocketMqRequest, ListMessageTraceForRocketMqResponse>
     */
    public AsyncInvoker<ListMessageTraceForRocketMqRequest, ListMessageTraceForRocketMqResponse> listMessageTraceForRocketMqAsyncInvoker(
        ListMessageTraceForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listMessageTraceForRocketMq, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return CompletableFuture<ListMessagesResponse>
     */
    public CompletableFuture<ListMessagesResponse> listMessagesAsync(ListMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listMessages);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return AsyncInvoker<ListMessagesRequest, ListMessagesResponse>
     */
    public AsyncInvoker<ListMessagesRequest, ListMessagesResponse> listMessagesAsyncInvoker(
        ListMessagesRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listMessages, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesForRocketMqRequest 请求对象
     * @return CompletableFuture<ListMessagesForRocketMqResponse>
     */
    public CompletableFuture<ListMessagesForRocketMqResponse> listMessagesForRocketMqAsync(
        ListMessagesForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listMessagesForRocketMq);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesForRocketMqRequest 请求对象
     * @return AsyncInvoker<ListMessagesForRocketMqRequest, ListMessagesForRocketMqResponse>
     */
    public AsyncInvoker<ListMessagesForRocketMqRequest, ListMessagesForRocketMqResponse> listMessagesForRocketMqAsyncInvoker(
        ListMessagesForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listMessagesForRocketMq, hcClient);
    }

    /**
     * 查询实例下所有迁移任务或查询指定迁移任务信息
     *
     * 1. 查询实例下所有迁移任务
     * 2. 查询指定迁移任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketMqMigrationTaskRequest 请求对象
     * @return CompletableFuture<ListRocketMqMigrationTaskResponse>
     */
    public CompletableFuture<ListRocketMqMigrationTaskResponse> listRocketMqMigrationTaskAsync(
        ListRocketMqMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listRocketMqMigrationTask);
    }

    /**
     * 查询实例下所有迁移任务或查询指定迁移任务信息
     *
     * 1. 查询实例下所有迁移任务
     * 2. 查询指定迁移任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketMqMigrationTaskRequest 请求对象
     * @return AsyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse>
     */
    public AsyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> listRocketMqMigrationTaskAsyncInvoker(
        ListRocketMqMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listRocketMqMigrationTask, hcClient);
    }

    /**
     * 查询实例的定时任务列表
     *
     * 查询实例的定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return CompletableFuture<ListScheduledTasksResponse>
     */
    public CompletableFuture<ListScheduledTasksResponse> listScheduledTasksAsync(ListScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listScheduledTasks);
    }

    /**
     * 查询实例的定时任务列表
     *
     * 查询实例的定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return AsyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse>
     */
    public AsyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse> listScheduledTasksAsyncInvoker(
        ListScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询主题的授权用户列表
     *
     * 查询主题的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<ListTopicAccessPolicyResponse>
     */
    public CompletableFuture<ListTopicAccessPolicyResponse> listTopicAccessPolicyAsync(
        ListTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listTopicAccessPolicy);
    }

    /**
     * 查询主题的授权用户列表
     *
     * 查询主题的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAccessPolicyRequest 请求对象
     * @return AsyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse>
     */
    public AsyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> listTopicAccessPolicyAsyncInvoker(
        ListTopicAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listTopicAccessPolicy, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return CompletableFuture<ListUserResponse>
     */
    public CompletableFuture<ListUserResponse> listUserAsync(ListUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listUser);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return AsyncInvoker<ListUserRequest, ListUserResponse>
     */
    public AsyncInvoker<ListUserRequest, ListUserResponse> listUserAsyncInvoker(ListUserRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listUser, hcClient);
    }

    /**
     * 修改实例SSL相关配置
     *
     * 修改实例SSL相关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceSslConfigRequest 请求对象
     * @return CompletableFuture<ModifyInstanceSslConfigResponse>
     */
    public CompletableFuture<ModifyInstanceSslConfigResponse> modifyInstanceSslConfigAsync(
        ModifyInstanceSslConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.modifyInstanceSslConfig);
    }

    /**
     * 修改实例SSL相关配置
     *
     * 修改实例SSL相关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceSslConfigRequest 请求对象
     * @return AsyncInvoker<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse>
     */
    public AsyncInvoker<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse> modifyInstanceSslConfigAsyncInvoker(
        ModifyInstanceSslConfigRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.modifyInstanceSslConfig, hcClient);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ModifyRecyclePolicyResponse>
     */
    public CompletableFuture<ModifyRecyclePolicyResponse> modifyRecyclePolicyAsync(ModifyRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.modifyRecyclePolicy);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ModifyRecyclePolicyRequest, ModifyRecyclePolicyResponse>
     */
    public AsyncInvoker<ModifyRecyclePolicyRequest, ModifyRecyclePolicyResponse> modifyRecyclePolicyAsyncInvoker(
        ModifyRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.modifyRecyclePolicy, hcClient);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetRequest 请求对象
     * @return CompletableFuture<ResetConsumeOffsetResponse>
     */
    public CompletableFuture<ResetConsumeOffsetResponse> resetConsumeOffsetAsync(ResetConsumeOffsetRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.resetConsumeOffset);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetRequest 请求对象
     * @return AsyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse>
     */
    public AsyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> resetConsumeOffsetAsyncInvoker(
        ResetConsumeOffsetRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.resetConsumeOffset, hcClient);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetForRocketMqRequest 请求对象
     * @return CompletableFuture<ResetConsumeOffsetForRocketMqResponse>
     */
    public CompletableFuture<ResetConsumeOffsetForRocketMqResponse> resetConsumeOffsetForRocketMqAsync(
        ResetConsumeOffsetForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.resetConsumeOffsetForRocketMq);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetForRocketMqRequest 请求对象
     * @return AsyncInvoker<ResetConsumeOffsetForRocketMqRequest, ResetConsumeOffsetForRocketMqResponse>
     */
    public AsyncInvoker<ResetConsumeOffsetForRocketMqRequest, ResetConsumeOffsetForRocketMqResponse> resetConsumeOffsetForRocketMqAsyncInvoker(
        ResetConsumeOffsetForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.resetConsumeOffsetForRocketMq, hcClient);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.resizeInstance);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.resizeInstance, hcClient);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceForRocketMqRequest 请求对象
     * @return CompletableFuture<ResizeInstanceForRocketMqResponse>
     */
    public CompletableFuture<ResizeInstanceForRocketMqResponse> resizeInstanceForRocketMqAsync(
        ResizeInstanceForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.resizeInstanceForRocketMq);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceForRocketMqRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceForRocketMqRequest, ResizeInstanceForRocketMqResponse>
     */
    public AsyncInvoker<ResizeInstanceForRocketMqRequest, ResizeInstanceForRocketMqResponse> resizeInstanceForRocketMqAsyncInvoker(
        ResizeInstanceForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.resizeInstanceForRocketMq, hcClient);
    }

    /**
     * 恢复回收站实例
     *
     * 恢复回收站实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRecycleInstanceRequest 请求对象
     * @return CompletableFuture<RestoreRecycleInstanceResponse>
     */
    public CompletableFuture<RestoreRecycleInstanceResponse> restoreRecycleInstanceAsync(
        RestoreRecycleInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.restoreRecycleInstance);
    }

    /**
     * 恢复回收站实例
     *
     * 恢复回收站实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRecycleInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreRecycleInstanceRequest, RestoreRecycleInstanceResponse>
     */
    public AsyncInvoker<RestoreRecycleInstanceRequest, RestoreRecycleInstanceResponse> restoreRecycleInstanceAsyncInvoker(
        RestoreRecycleInstanceRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.restoreRecycleInstance, hcClient);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageRequest 请求对象
     * @return CompletableFuture<SendDlqMessageResponse>
     */
    public CompletableFuture<SendDlqMessageResponse> sendDlqMessageAsync(SendDlqMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.sendDlqMessage);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageRequest 请求对象
     * @return AsyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse>
     */
    public AsyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse> sendDlqMessageAsyncInvoker(
        SendDlqMessageRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.sendDlqMessage, hcClient);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageForRocketMqRequest 请求对象
     * @return CompletableFuture<SendDlqMessageForRocketMqResponse>
     */
    public CompletableFuture<SendDlqMessageForRocketMqResponse> sendDlqMessageForRocketMqAsync(
        SendDlqMessageForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.sendDlqMessageForRocketMq);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageForRocketMqRequest 请求对象
     * @return AsyncInvoker<SendDlqMessageForRocketMqRequest, SendDlqMessageForRocketMqResponse>
     */
    public AsyncInvoker<SendDlqMessageForRocketMqRequest, SendDlqMessageForRocketMqResponse> sendDlqMessageForRocketMqAsyncInvoker(
        SendDlqMessageForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.sendDlqMessageForRocketMq, hcClient);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageRequest 请求对象
     * @return CompletableFuture<SendMessageResponse>
     */
    public CompletableFuture<SendMessageResponse> sendMessageAsync(SendMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.sendMessage);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageRequest 请求对象
     * @return AsyncInvoker<SendMessageRequest, SendMessageResponse>
     */
    public AsyncInvoker<SendMessageRequest, SendMessageResponse> sendMessageAsyncInvoker(SendMessageRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.sendMessage, hcClient);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageForRocketMqRequest 请求对象
     * @return CompletableFuture<SendMessageForRocketMqResponse>
     */
    public CompletableFuture<SendMessageForRocketMqResponse> sendMessageForRocketMqAsync(
        SendMessageForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.sendMessageForRocketMq);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageForRocketMqRequest 请求对象
     * @return AsyncInvoker<SendMessageForRocketMqRequest, SendMessageForRocketMqResponse>
     */
    public AsyncInvoker<SendMessageForRocketMqRequest, SendMessageForRocketMqResponse> sendMessageForRocketMqAsyncInvoker(
        SendMessageForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.sendMessageForRocketMq, hcClient);
    }

    /**
     * 查询后台任务管理中的指定记录
     *
     * 查询后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskRequest 请求对象
     * @return CompletableFuture<ShowBackgroundTaskResponse>
     */
    public CompletableFuture<ShowBackgroundTaskResponse> showBackgroundTaskAsync(ShowBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showBackgroundTask);
    }

    /**
     * 查询后台任务管理中的指定记录
     *
     * 查询后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse>
     */
    public AsyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTaskAsyncInvoker(
        ShowBackgroundTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showBackgroundTask, hcClient);
    }

    /**
     * 查询实例变更记录的进度
     *
     * 查询后台任务管理中的指定实例变更记录的进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return CompletableFuture<ShowBackgroundTaskProgressResponse>
     */
    public CompletableFuture<ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressAsync(
        ShowBackgroundTaskProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showBackgroundTaskProgress);
    }

    /**
     * 查询实例变更记录的进度
     *
     * 查询后台任务管理中的指定实例变更记录的进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return AsyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse>
     */
    public AsyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressAsyncInvoker(
        ShowBackgroundTaskProgressRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showBackgroundTaskProgress, hcClient);
    }

    /**
     * 查询实例在CES的监控层级关系
     *
     * 查询实例在CES的监控层级关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCesHierarchyRequest 请求对象
     * @return CompletableFuture<ShowCesHierarchyResponse>
     */
    public CompletableFuture<ShowCesHierarchyResponse> showCesHierarchyAsync(ShowCesHierarchyRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showCesHierarchy);
    }

    /**
     * 查询实例在CES的监控层级关系
     *
     * 查询实例在CES的监控层级关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCesHierarchyRequest 请求对象
     * @return AsyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse>
     */
    public AsyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchyAsyncInvoker(
        ShowCesHierarchyRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showCesHierarchy, hcClient);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsRequest 请求对象
     * @return CompletableFuture<ShowConsumerConnectionsResponse>
     */
    public CompletableFuture<ShowConsumerConnectionsResponse> showConsumerConnectionsAsync(
        ShowConsumerConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showConsumerConnections);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsRequest 请求对象
     * @return AsyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse>
     */
    public AsyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> showConsumerConnectionsAsyncInvoker(
        ShowConsumerConnectionsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showConsumerConnections, hcClient);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsForRocketMqRequest 请求对象
     * @return CompletableFuture<ShowConsumerConnectionsForRocketMqResponse>
     */
    public CompletableFuture<ShowConsumerConnectionsForRocketMqResponse> showConsumerConnectionsForRocketMqAsync(
        ShowConsumerConnectionsForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showConsumerConnectionsForRocketMq);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsForRocketMqRequest 请求对象
     * @return AsyncInvoker<ShowConsumerConnectionsForRocketMqRequest, ShowConsumerConnectionsForRocketMqResponse>
     */
    public AsyncInvoker<ShowConsumerConnectionsForRocketMqRequest, ShowConsumerConnectionsForRocketMqResponse> showConsumerConnectionsForRocketMqAsyncInvoker(
        ShowConsumerConnectionsForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showConsumerConnectionsForRocketMq, hcClient);
    }

    /**
     * 查询消费列表或详情
     *
     * 查询消费列表或详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerListOrDetailsRequest 请求对象
     * @return CompletableFuture<ShowConsumerListOrDetailsResponse>
     */
    public CompletableFuture<ShowConsumerListOrDetailsResponse> showConsumerListOrDetailsAsync(
        ShowConsumerListOrDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showConsumerListOrDetails);
    }

    /**
     * 查询消费列表或详情
     *
     * 查询消费列表或详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerListOrDetailsRequest 请求对象
     * @return AsyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse>
     */
    public AsyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> showConsumerListOrDetailsAsyncInvoker(
        ShowConsumerListOrDetailsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showConsumerListOrDetails, hcClient);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisReportResponse>
     */
    public CompletableFuture<ShowDiagnosisReportResponse> showDiagnosisReportAsync(ShowDiagnosisReportRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showDiagnosisReport);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse>
     */
    public AsyncInvoker<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse> showDiagnosisReportAsyncInvoker(
        ShowDiagnosisReportRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showDiagnosisReport, hcClient);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportForRocketMqRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisReportForRocketMqResponse>
     */
    public CompletableFuture<ShowDiagnosisReportForRocketMqResponse> showDiagnosisReportForRocketMqAsync(
        ShowDiagnosisReportForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showDiagnosisReportForRocketMq);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportForRocketMqRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisReportForRocketMqRequest, ShowDiagnosisReportForRocketMqResponse>
     */
    public AsyncInvoker<ShowDiagnosisReportForRocketMqRequest, ShowDiagnosisReportForRocketMqResponse> showDiagnosisReportForRocketMqAsyncInvoker(
        ShowDiagnosisReportForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showDiagnosisReportForRocketMq, hcClient);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisStackResponse>
     */
    public CompletableFuture<ShowDiagnosisStackResponse> showDiagnosisStackAsync(ShowDiagnosisStackRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showDiagnosisStack);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse>
     */
    public AsyncInvoker<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse> showDiagnosisStackAsyncInvoker(
        ShowDiagnosisStackRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showDiagnosisStack, hcClient);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackForRocketMqRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisStackForRocketMqResponse>
     */
    public CompletableFuture<ShowDiagnosisStackForRocketMqResponse> showDiagnosisStackForRocketMqAsync(
        ShowDiagnosisStackForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showDiagnosisStackForRocketMq);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackForRocketMqRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisStackForRocketMqRequest, ShowDiagnosisStackForRocketMqResponse>
     */
    public AsyncInvoker<ShowDiagnosisStackForRocketMqRequest, ShowDiagnosisStackForRocketMqResponse> showDiagnosisStackForRocketMqAsyncInvoker(
        ShowDiagnosisStackForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showDiagnosisStackForRocketMq, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowEngineInstanceExtendProductInfoResponse>
     */
    public CompletableFuture<ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoAsync(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showEngineInstanceExtendProductInfo);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return AsyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>
     */
    public AsyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoAsyncInvoker(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showEngineInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoForRocketMqRequest 请求对象
     * @return CompletableFuture<ShowEngineInstanceExtendProductInfoForRocketMqResponse>
     */
    public CompletableFuture<ShowEngineInstanceExtendProductInfoForRocketMqResponse> showEngineInstanceExtendProductInfoForRocketMqAsync(
        ShowEngineInstanceExtendProductInfoForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showEngineInstanceExtendProductInfoForRocketMq);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoForRocketMqRequest 请求对象
     * @return AsyncInvoker<ShowEngineInstanceExtendProductInfoForRocketMqRequest, ShowEngineInstanceExtendProductInfoForRocketMqResponse>
     */
    public AsyncInvoker<ShowEngineInstanceExtendProductInfoForRocketMqRequest, ShowEngineInstanceExtendProductInfoForRocketMqResponse> showEngineInstanceExtendProductInfoForRocketMqAsyncInvoker(
        ShowEngineInstanceExtendProductInfoForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showEngineInstanceExtendProductInfoForRocketMq, hcClient);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return CompletableFuture<ShowGroupResponse>
     */
    public CompletableFuture<ShowGroupResponse> showGroupAsync(ShowGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showGroup);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return AsyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public AsyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupAsyncInvoker(ShowGroupRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showGroup, hcClient);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showInstance);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showInstance, hcClient);
    }

    /**
     * 查询实例节点
     *
     * 查询实例节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesRequest 请求对象
     * @return CompletableFuture<ShowInstanceNodesResponse>
     */
    public CompletableFuture<ShowInstanceNodesResponse> showInstanceNodesAsync(ShowInstanceNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showInstanceNodes);
    }

    /**
     * 查询实例节点
     *
     * 查询实例节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesRequest 请求对象
     * @return AsyncInvoker<ShowInstanceNodesRequest, ShowInstanceNodesResponse>
     */
    public AsyncInvoker<ShowInstanceNodesRequest, ShowInstanceNodesResponse> showInstanceNodesAsyncInvoker(
        ShowInstanceNodesRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showInstanceNodes, hcClient);
    }

    /**
     * 查看租户配额
     *
     * 查询租户最大可以创建的实例个数和已创建的实例个数，以及每个实例最大可以创建标签的个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showQuotas);
    }

    /**
     * 查看租户配额
     *
     * 查询租户最大可以创建的实例个数和已创建的实例个数，以及每个实例最大可以创建标签的个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showQuotas, hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecycleInstancesRequest 请求对象
     * @return CompletableFuture<ShowRecycleInstancesResponse>
     */
    public CompletableFuture<ShowRecycleInstancesResponse> showRecycleInstancesAsync(
        ShowRecycleInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecycleInstancesRequest 请求对象
     * @return AsyncInvoker<ShowRecycleInstancesRequest, ShowRecycleInstancesResponse>
     */
    public AsyncInvoker<ShowRecycleInstancesRequest, ShowRecycleInstancesResponse> showRecycleInstancesAsyncInvoker(
        ShowRecycleInstancesRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showRecycleInstances, hcClient);
    }

    /**
     * 查询RocketMQ配置
     *
     * 该接口用于查询RocketMQ配置，若成功则返回配置的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqConfigsRequest 请求对象
     * @return CompletableFuture<ShowRocketMqConfigsResponse>
     */
    public CompletableFuture<ShowRocketMqConfigsResponse> showRocketMqConfigsAsync(ShowRocketMqConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showRocketMqConfigs);
    }

    /**
     * 查询RocketMQ配置
     *
     * 该接口用于查询RocketMQ配置，若成功则返回配置的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqConfigsRequest 请求对象
     * @return AsyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse>
     */
    public AsyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> showRocketMqConfigsAsyncInvoker(
        ShowRocketMqConfigsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showRocketMqConfigs, hcClient);
    }

    /**
     * 查询RocketMQ产品规格核数
     *
     * 查询RocketMQ产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqProductCoresRequest 请求对象
     * @return CompletableFuture<ShowRocketMqProductCoresResponse>
     */
    public CompletableFuture<ShowRocketMqProductCoresResponse> showRocketMqProductCoresAsync(
        ShowRocketMqProductCoresRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showRocketMqProductCores);
    }

    /**
     * 查询RocketMQ产品规格核数
     *
     * 查询RocketMQ产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqProductCoresRequest 请求对象
     * @return AsyncInvoker<ShowRocketMqProductCoresRequest, ShowRocketMqProductCoresResponse>
     */
    public AsyncInvoker<ShowRocketMqProductCoresRequest, ShowRocketMqProductCoresResponse> showRocketMqProductCoresAsyncInvoker(
        ShowRocketMqProductCoresRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showRocketMqProductCores, hcClient);
    }

    /**
     * 查询RocketMQ实例扩容前置检查信息
     *
     * 获取RocketMQ实例扩容前置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqScalePreCheckInfoRequest 请求对象
     * @return CompletableFuture<ShowRocketMqScalePreCheckInfoResponse>
     */
    public CompletableFuture<ShowRocketMqScalePreCheckInfoResponse> showRocketMqScalePreCheckInfoAsync(
        ShowRocketMqScalePreCheckInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showRocketMqScalePreCheckInfo);
    }

    /**
     * 查询RocketMQ实例扩容前置检查信息
     *
     * 获取RocketMQ实例扩容前置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqScalePreCheckInfoRequest 请求对象
     * @return AsyncInvoker<ShowRocketMqScalePreCheckInfoRequest, ShowRocketMqScalePreCheckInfoResponse>
     */
    public AsyncInvoker<ShowRocketMqScalePreCheckInfoRequest, ShowRocketMqScalePreCheckInfoResponse> showRocketMqScalePreCheckInfoAsyncInvoker(
        ShowRocketMqScalePreCheckInfoRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showRocketMqScalePreCheckInfo, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqProjectTagsRequest 请求对象
     * @return CompletableFuture<ShowRocketmqProjectTagsResponse>
     */
    public CompletableFuture<ShowRocketmqProjectTagsResponse> showRocketmqProjectTagsAsync(
        ShowRocketmqProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showRocketmqProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqProjectTagsRequest 请求对象
     * @return AsyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse>
     */
    public AsyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> showRocketmqProjectTagsAsyncInvoker(
        ShowRocketmqProjectTagsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showRocketmqProjectTags, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqTagsRequest 请求对象
     * @return CompletableFuture<ShowRocketmqTagsResponse>
     */
    public CompletableFuture<ShowRocketmqTagsResponse> showRocketmqTagsAsync(ShowRocketmqTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showRocketmqTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqTagsRequest 请求对象
     * @return AsyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse>
     */
    public AsyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> showRocketmqTagsAsyncInvoker(
        ShowRocketmqTagsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showRocketmqTags, hcClient);
    }

    /**
     * 查询RocketMQ实例版本信息
     *
     * 查询RocketMQ实例版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeInstanceVersionRequest 请求对象
     * @return CompletableFuture<ShowUpgradeInstanceVersionResponse>
     */
    public CompletableFuture<ShowUpgradeInstanceVersionResponse> showUpgradeInstanceVersionAsync(
        ShowUpgradeInstanceVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showUpgradeInstanceVersion);
    }

    /**
     * 查询RocketMQ实例版本信息
     *
     * 查询RocketMQ实例版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeInstanceVersionRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeInstanceVersionRequest, ShowUpgradeInstanceVersionResponse>
     */
    public AsyncInvoker<ShowUpgradeInstanceVersionRequest, ShowUpgradeInstanceVersionResponse> showUpgradeInstanceVersionAsyncInvoker(
        ShowUpgradeInstanceVersionRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showUpgradeInstanceVersion, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 查询用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return CompletableFuture<ShowUserResponse>
     */
    public CompletableFuture<ShowUserResponse> showUserAsync(ShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showUser);
    }

    /**
     * 查询用户详情
     *
     * 查询用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return AsyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public AsyncInvoker<ShowUserRequest, ShowUserResponse> showUserAsyncInvoker(ShowUserRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showUser, hcClient);
    }

    /**
     * 查询磁盘自动扩容配置
     *
     * 查询磁盘自动扩容配置，包括磁盘自动扩容是否开启，以及开启后的扩容阈值、扩容步长、扩容上限信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeExpandConfigRequest 请求对象
     * @return CompletableFuture<ShowVolumeExpandConfigResponse>
     */
    public CompletableFuture<ShowVolumeExpandConfigResponse> showVolumeExpandConfigAsync(
        ShowVolumeExpandConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showVolumeExpandConfig);
    }

    /**
     * 查询磁盘自动扩容配置
     *
     * 查询磁盘自动扩容配置，包括磁盘自动扩容是否开启，以及开启后的扩容阈值、扩容步长、扩容上限信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeExpandConfigRequest 请求对象
     * @return AsyncInvoker<ShowVolumeExpandConfigRequest, ShowVolumeExpandConfigResponse>
     */
    public AsyncInvoker<ShowVolumeExpandConfigRequest, ShowVolumeExpandConfigResponse> showVolumeExpandConfigAsyncInvoker(
        ShowVolumeExpandConfigRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showVolumeExpandConfig, hcClient);
    }

    /**
     * 修改消费组
     *
     * 修改指定消费组参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConsumerGroupRequest 请求对象
     * @return CompletableFuture<UpdateConsumerGroupResponse>
     */
    public CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroupAsync(UpdateConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.updateConsumerGroup);
    }

    /**
     * 修改消费组
     *
     * 修改指定消费组参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConsumerGroupRequest 请求对象
     * @return AsyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse>
     */
    public AsyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> updateConsumerGroupAsyncInvoker(
        UpdateConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.updateConsumerGroup, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改实例相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.updateInstance, hcClient);
    }

    /**
     * 修改RocketMQ配置
     *
     * 该接口用于修改RocketMQ配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRocketMqConfigsRequest 请求对象
     * @return CompletableFuture<UpdateRocketMqConfigsResponse>
     */
    public CompletableFuture<UpdateRocketMqConfigsResponse> updateRocketMqConfigsAsync(
        UpdateRocketMqConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.updateRocketMqConfigs);
    }

    /**
     * 修改RocketMQ配置
     *
     * 该接口用于修改RocketMQ配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRocketMqConfigsRequest 请求对象
     * @return AsyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse>
     */
    public AsyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> updateRocketMqConfigsAsyncInvoker(
        UpdateRocketMqConfigsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.updateRocketMqConfigs, hcClient);
    }

    /**
     * 修改定时任务管理中的指定记录
     *
     * 修改定时任务管理中的指定记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return CompletableFuture<UpdateScheduledTaskResponse>
     */
    public CompletableFuture<UpdateScheduledTaskResponse> updateScheduledTaskAsync(UpdateScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.updateScheduledTask);
    }

    /**
     * 修改定时任务管理中的指定记录
     *
     * 修改定时任务管理中的指定记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return AsyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
     */
    public AsyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTaskAsyncInvoker(
        UpdateScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.updateScheduledTask, hcClient);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.updateUser);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.updateUser, hcClient);
    }

    /**
     * 修改磁盘自动扩容配置
     *
     * 该接口用于修改磁盘自动扩容配置，包含磁盘自动扩容是否开启、扩容阈值、扩容步长，以及扩容上限的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVolumeExpansionConfigRequest 请求对象
     * @return CompletableFuture<UpdateVolumeExpansionConfigResponse>
     */
    public CompletableFuture<UpdateVolumeExpansionConfigResponse> updateVolumeExpansionConfigAsync(
        UpdateVolumeExpansionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.updateVolumeExpansionConfig);
    }

    /**
     * 修改磁盘自动扩容配置
     *
     * 该接口用于修改磁盘自动扩容配置，包含磁盘自动扩容是否开启、扩容阈值、扩容步长，以及扩容上限的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVolumeExpansionConfigRequest 请求对象
     * @return AsyncInvoker<UpdateVolumeExpansionConfigRequest, UpdateVolumeExpansionConfigResponse>
     */
    public AsyncInvoker<UpdateVolumeExpansionConfigRequest, UpdateVolumeExpansionConfigResponse> updateVolumeExpansionConfigAsyncInvoker(
        UpdateVolumeExpansionConfigRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.updateVolumeExpansionConfig, hcClient);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageRequest 请求对象
     * @return CompletableFuture<ValidateConsumedMessageResponse>
     */
    public CompletableFuture<ValidateConsumedMessageResponse> validateConsumedMessageAsync(
        ValidateConsumedMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.validateConsumedMessage);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageRequest 请求对象
     * @return AsyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse>
     */
    public AsyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> validateConsumedMessageAsyncInvoker(
        ValidateConsumedMessageRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.validateConsumedMessage, hcClient);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageForRocketMqRequest 请求对象
     * @return CompletableFuture<ValidateConsumedMessageForRocketMqResponse>
     */
    public CompletableFuture<ValidateConsumedMessageForRocketMqResponse> validateConsumedMessageForRocketMqAsync(
        ValidateConsumedMessageForRocketMqRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.validateConsumedMessageForRocketMq);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageForRocketMqRequest 请求对象
     * @return AsyncInvoker<ValidateConsumedMessageForRocketMqRequest, ValidateConsumedMessageForRocketMqResponse>
     */
    public AsyncInvoker<ValidateConsumedMessageForRocketMqRequest, ValidateConsumedMessageForRocketMqResponse> validateConsumedMessageForRocketMqAsyncInvoker(
        ValidateConsumedMessageForRocketMqRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.validateConsumedMessageForRocketMq, hcClient);
    }

    /**
     * 创建主题或批量删除主题
     *
     * 创建主题或批量删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTopicOrBatchDeleteTopicRequest 请求对象
     * @return CompletableFuture<CreateTopicOrBatchDeleteTopicResponse>
     */
    public CompletableFuture<CreateTopicOrBatchDeleteTopicResponse> createTopicOrBatchDeleteTopicAsync(
        CreateTopicOrBatchDeleteTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createTopicOrBatchDeleteTopic);
    }

    /**
     * 创建主题或批量删除主题
     *
     * 创建主题或批量删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTopicOrBatchDeleteTopicRequest 请求对象
     * @return AsyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse>
     */
    public AsyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> createTopicOrBatchDeleteTopicAsyncInvoker(
        CreateTopicOrBatchDeleteTopicRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.createTopicOrBatchDeleteTopic, hcClient);
    }

    /**
     * 删除指定主题
     *
     * 删除指定主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return CompletableFuture<DeleteTopicResponse>
     */
    public CompletableFuture<DeleteTopicResponse> deleteTopicAsync(DeleteTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.deleteTopic);
    }

    /**
     * 删除指定主题
     *
     * 删除指定主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse>
     */
    public AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicAsyncInvoker(DeleteTopicRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.deleteTopic, hcClient);
    }

    /**
     * 查询主题消费组列表
     *
     * 查询主题消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumerGroupOfTopicRequest 请求对象
     * @return CompletableFuture<ListConsumerGroupOfTopicResponse>
     */
    public CompletableFuture<ListConsumerGroupOfTopicResponse> listConsumerGroupOfTopicAsync(
        ListConsumerGroupOfTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listConsumerGroupOfTopic);
    }

    /**
     * 查询主题消费组列表
     *
     * 查询主题消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumerGroupOfTopicRequest 请求对象
     * @return AsyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse>
     */
    public AsyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> listConsumerGroupOfTopicAsyncInvoker(
        ListConsumerGroupOfTopicRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listConsumerGroupOfTopic, hcClient);
    }

    /**
     * 查询主题列表
     *
     * 该接口用于查询指定RocketMQ实例的Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketInstanceTopicsRequest 请求对象
     * @return CompletableFuture<ListRocketInstanceTopicsResponse>
     */
    public CompletableFuture<ListRocketInstanceTopicsResponse> listRocketInstanceTopicsAsync(
        ListRocketInstanceTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.listRocketInstanceTopics);
    }

    /**
     * 查询主题列表
     *
     * 该接口用于查询指定RocketMQ实例的Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketInstanceTopicsRequest 请求对象
     * @return AsyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse>
     */
    public AsyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> listRocketInstanceTopicsAsyncInvoker(
        ListRocketInstanceTopicsRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.listRocketInstanceTopics, hcClient);
    }

    /**
     * 查询单个主题
     *
     * 查询单个主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOneTopicRequest 请求对象
     * @return CompletableFuture<ShowOneTopicResponse>
     */
    public CompletableFuture<ShowOneTopicResponse> showOneTopicAsync(ShowOneTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showOneTopic);
    }

    /**
     * 查询单个主题
     *
     * 查询单个主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOneTopicRequest 请求对象
     * @return AsyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse>
     */
    public AsyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse> showOneTopicAsyncInvoker(
        ShowOneTopicRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showOneTopic, hcClient);
    }

    /**
     * 查询主题的消息数
     *
     * 查询主题的消息数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicStatusRequest 请求对象
     * @return CompletableFuture<ShowTopicStatusResponse>
     */
    public CompletableFuture<ShowTopicStatusResponse> showTopicStatusAsync(ShowTopicStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.showTopicStatus);
    }

    /**
     * 查询主题的消息数
     *
     * 查询主题的消息数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicStatusRequest 请求对象
     * @return AsyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse>
     */
    public AsyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse> showTopicStatusAsyncInvoker(
        ShowTopicStatusRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.showTopicStatus, hcClient);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return CompletableFuture<UpdateTopicResponse>
     */
    public CompletableFuture<UpdateTopicResponse> updateTopicAsync(UpdateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.updateTopic);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse>
     */
    public AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicAsyncInvoker(UpdateTopicRequest request) {
        return new AsyncInvoker<>(request, RocketMQMeta.updateTopic, hcClient);
    }

}
