package com.huaweicloud.sdk.rocketmq.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteRocketMqMigrationTaskResponse;
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
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsResponse;
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

public class RocketMQClient {

    protected HcClient hcClient;

    public RocketMQClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RocketMQClient> newBuilder() {
        ClientBuilder<RocketMQClient> clientBuilder = new ClientBuilder<>(RocketMQClient::new);
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
     * @return BatchCreateOrDeleteRocketmqTagResponse
     */
    public BatchCreateOrDeleteRocketmqTagResponse batchCreateOrDeleteRocketmqTag(
        BatchCreateOrDeleteRocketmqTagRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchCreateOrDeleteRocketmqTag);
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteRocketmqTagRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> batchCreateOrDeleteRocketmqTagInvoker(
        BatchCreateOrDeleteRocketmqTagRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchCreateOrDeleteRocketmqTag, hcClient);
    }

    /**
     * 批量删除实例诊断报告
     *
     * 批量删除实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisRecordsRequest 请求对象
     * @return BatchDeleteDiagnosisRecordsResponse
     */
    public BatchDeleteDiagnosisRecordsResponse batchDeleteDiagnosisRecords(BatchDeleteDiagnosisRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchDeleteDiagnosisRecords);
    }

    /**
     * 批量删除实例诊断报告
     *
     * 批量删除实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisRecordsRequest 请求对象
     * @return SyncInvoker<BatchDeleteDiagnosisRecordsRequest, BatchDeleteDiagnosisRecordsResponse>
     */
    public SyncInvoker<BatchDeleteDiagnosisRecordsRequest, BatchDeleteDiagnosisRecordsResponse> batchDeleteDiagnosisRecordsInvoker(
        BatchDeleteDiagnosisRecordsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchDeleteDiagnosisRecords, hcClient);
    }

    /**
     * 批量删除实例诊断报告
     *
     * 批量删除实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisRecordsForRocketMqRequest 请求对象
     * @return BatchDeleteDiagnosisRecordsForRocketMqResponse
     */
    public BatchDeleteDiagnosisRecordsForRocketMqResponse batchDeleteDiagnosisRecordsForRocketMq(
        BatchDeleteDiagnosisRecordsForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchDeleteDiagnosisRecordsForRocketMq);
    }

    /**
     * 批量删除实例诊断报告
     *
     * 批量删除实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisRecordsForRocketMqRequest 请求对象
     * @return SyncInvoker<BatchDeleteDiagnosisRecordsForRocketMqRequest, BatchDeleteDiagnosisRecordsForRocketMqResponse>
     */
    public SyncInvoker<BatchDeleteDiagnosisRecordsForRocketMqRequest, BatchDeleteDiagnosisRecordsForRocketMqResponse> batchDeleteDiagnosisRecordsForRocketMqInvoker(
        BatchDeleteDiagnosisRecordsForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchDeleteDiagnosisRecordsForRocketMq, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。**实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return BatchDeleteInstancesResponse
     */
    public BatchDeleteInstancesResponse batchDeleteInstances(BatchDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchDeleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。**实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>
     */
    public SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstancesInvoker(
        BatchDeleteInstancesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchDeleteInstances, hcClient);
    }

    /**
     * 批量删除元数据迁移任务
     *
     * 批量删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRocketMqMigrationTaskRequest 请求对象
     * @return BatchDeleteRocketMqMigrationTaskResponse
     */
    public BatchDeleteRocketMqMigrationTaskResponse batchDeleteRocketMqMigrationTask(
        BatchDeleteRocketMqMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchDeleteRocketMqMigrationTask);
    }

    /**
     * 批量删除元数据迁移任务
     *
     * 批量删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRocketMqMigrationTaskRequest 请求对象
     * @return SyncInvoker<BatchDeleteRocketMqMigrationTaskRequest, BatchDeleteRocketMqMigrationTaskResponse>
     */
    public SyncInvoker<BatchDeleteRocketMqMigrationTaskRequest, BatchDeleteRocketMqMigrationTaskResponse> batchDeleteRocketMqMigrationTaskInvoker(
        BatchDeleteRocketMqMigrationTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchDeleteRocketMqMigrationTask, hcClient);
    }

    /**
     * 批量修改消费组
     *
     * 批量修改消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateConsumerGroupRequest 请求对象
     * @return BatchUpdateConsumerGroupResponse
     */
    public BatchUpdateConsumerGroupResponse batchUpdateConsumerGroup(BatchUpdateConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchUpdateConsumerGroup);
    }

    /**
     * 批量修改消费组
     *
     * 批量修改消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateConsumerGroupRequest 请求对象
     * @return SyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse>
     */
    public SyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> batchUpdateConsumerGroupInvoker(
        BatchUpdateConsumerGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchUpdateConsumerGroup, hcClient);
    }

    /**
     * 创建消费组或批量删除消费组
     *
     * 创建消费组或批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConsumerGroupOrBatchDeleteConsumerGroupRequest 请求对象
     * @return CreateConsumerGroupOrBatchDeleteConsumerGroupResponse
     */
    public CreateConsumerGroupOrBatchDeleteConsumerGroupResponse createConsumerGroupOrBatchDeleteConsumerGroup(
        CreateConsumerGroupOrBatchDeleteConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createConsumerGroupOrBatchDeleteConsumerGroup);
    }

    /**
     * 创建消费组或批量删除消费组
     *
     * 创建消费组或批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConsumerGroupOrBatchDeleteConsumerGroupRequest 请求对象
     * @return SyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse>
     */
    public SyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> createConsumerGroupOrBatchDeleteConsumerGroupInvoker(
        CreateConsumerGroupOrBatchDeleteConsumerGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createConsumerGroupOrBatchDeleteConsumerGroup, hcClient);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return CreateDiagnosisTaskResponse
     */
    public CreateDiagnosisTaskResponse createDiagnosisTask(CreateDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createDiagnosisTask);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>
     */
    public SyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTaskInvoker(
        CreateDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createDiagnosisTask, hcClient);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskForRocketMqRequest 请求对象
     * @return CreateDiagnosisTaskForRocketMqResponse
     */
    public CreateDiagnosisTaskForRocketMqResponse createDiagnosisTaskForRocketMq(
        CreateDiagnosisTaskForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createDiagnosisTaskForRocketMq);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskForRocketMqRequest 请求对象
     * @return SyncInvoker<CreateDiagnosisTaskForRocketMqRequest, CreateDiagnosisTaskForRocketMqResponse>
     */
    public SyncInvoker<CreateDiagnosisTaskForRocketMqRequest, CreateDiagnosisTaskForRocketMqResponse> createDiagnosisTaskForRocketMqInvoker(
        CreateDiagnosisTaskForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createDiagnosisTaskForRocketMq, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,ax)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceByEngineRequest 请求对象
     * @return CreateInstanceByEngineResponse
     */
    public CreateInstanceByEngineResponse createInstanceByEngine(CreateInstanceByEngineRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createInstanceByEngine);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,ax)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceByEngineRequest 请求对象
     * @return SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>
     */
    public SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngineInvoker(
        CreateInstanceByEngineRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createInstanceByEngine, hcClient);
    }

    /**
     * 创建实例（按需）
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return CreatePostPaidInstanceResponse
     */
    public CreatePostPaidInstanceResponse createPostPaidInstance(CreatePostPaidInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createPostPaidInstance);
    }

    /**
     * 创建实例（按需）
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceInvoker(
        CreatePostPaidInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createPostPaidInstance, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,ax)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceForRocketMqRequest 请求对象
     * @return CreatePostPaidInstanceForRocketMqResponse
     */
    public CreatePostPaidInstanceForRocketMqResponse createPostPaidInstanceForRocketMq(
        CreatePostPaidInstanceForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createPostPaidInstanceForRocketMq);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,ax)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceForRocketMqRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceForRocketMqRequest, CreatePostPaidInstanceForRocketMqResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceForRocketMqRequest, CreatePostPaidInstanceForRocketMqResponse> createPostPaidInstanceForRocketMqInvoker(
        CreatePostPaidInstanceForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createPostPaidInstanceForRocketMq, hcClient);
    }

    /**
     * 新建元数据迁移任务
     *
     * 新建元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRocketMqMigrationTaskRequest 请求对象
     * @return CreateRocketMqMigrationTaskResponse
     */
    public CreateRocketMqMigrationTaskResponse createRocketMqMigrationTask(CreateRocketMqMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createRocketMqMigrationTask);
    }

    /**
     * 新建元数据迁移任务
     *
     * 新建元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRocketMqMigrationTaskRequest 请求对象
     * @return SyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse>
     */
    public SyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> createRocketMqMigrationTaskInvoker(
        CreateRocketMqMigrationTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createRocketMqMigrationTask, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createUser, hcClient);
    }

    /**
     * 删除后台任务管理中的指定记录
     *
     * 删除后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return DeleteBackgroundTaskResponse
     */
    public DeleteBackgroundTaskResponse deleteBackgroundTask(DeleteBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteBackgroundTask);
    }

    /**
     * 删除后台任务管理中的指定记录
     *
     * 删除后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>
     */
    public SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskInvoker(
        DeleteBackgroundTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupRequest 请求对象
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteConsumerGroup);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupRequest 请求对象
     * @return SyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse>
     */
    public SyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroupInvoker(
        DeleteConsumerGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteConsumerGroup, hcClient);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteInstance);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteInstance, hcClient);
    }

    /**
     * 删除定时任务管理中的指定记录
     *
     * 删除定时任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteScheduledTask);
    }

    /**
     * 删除定时任务管理中的指定记录
     *
     * 删除定时任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return SyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
     */
    public SyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTaskInvoker(
        DeleteScheduledTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteScheduledTask, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteUser, hcClient);
    }

    /**
     * 开启RocketMQ实例域名访问能力
     *
     * 开启RocketMQ实例域名访问能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return EnableDnsResponse
     */
    public EnableDnsResponse enableDns(EnableDnsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.enableDns);
    }

    /**
     * 开启RocketMQ实例域名访问能力
     *
     * 开启RocketMQ实例域名访问能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return SyncInvoker<EnableDnsRequest, EnableDnsResponse>
     */
    public SyncInvoker<EnableDnsRequest, EnableDnsResponse> enableDnsInvoker(EnableDnsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.enableDns, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesInvoker(
        ListAvailableZonesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询实例的后台任务列表
     *
     * 查询实例的后台任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTasksRequest 请求对象
     * @return ListBackgroundTasksResponse
     */
    public ListBackgroundTasksResponse listBackgroundTasks(ListBackgroundTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listBackgroundTasks);
    }

    /**
     * 查询实例的后台任务列表
     *
     * 查询实例的后台任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTasksRequest 请求对象
     * @return SyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse>
     */
    public SyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasksInvoker(
        ListBackgroundTasksRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listBackgroundTasks, hcClient);
    }

    /**
     * 查询代理列表
     *
     * 查询代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBrokersRequest 请求对象
     * @return ListBrokersResponse
     */
    public ListBrokersResponse listBrokers(ListBrokersRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listBrokers);
    }

    /**
     * 查询代理列表
     *
     * 查询代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBrokersRequest 请求对象
     * @return SyncInvoker<ListBrokersRequest, ListBrokersResponse>
     */
    public SyncInvoker<ListBrokersRequest, ListBrokersResponse> listBrokersInvoker(ListBrokersRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listBrokers, hcClient);
    }

    /**
     * 获取特性开关列表
     *
     * 获取特性开关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigFeaturesRequest 请求对象
     * @return ListConfigFeaturesResponse
     */
    public ListConfigFeaturesResponse listConfigFeatures(ListConfigFeaturesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listConfigFeatures);
    }

    /**
     * 获取特性开关列表
     *
     * 获取特性开关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigFeaturesRequest 请求对象
     * @return SyncInvoker<ListConfigFeaturesRequest, ListConfigFeaturesResponse>
     */
    public SyncInvoker<ListConfigFeaturesRequest, ListConfigFeaturesResponse> listConfigFeaturesInvoker(
        ListConfigFeaturesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listConfigFeatures, hcClient);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyRequest 请求对象
     * @return ListConsumeGroupAccessPolicyResponse
     */
    public ListConsumeGroupAccessPolicyResponse listConsumeGroupAccessPolicy(
        ListConsumeGroupAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listConsumeGroupAccessPolicy);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyRequest 请求对象
     * @return SyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse>
     */
    public SyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> listConsumeGroupAccessPolicyInvoker(
        ListConsumeGroupAccessPolicyRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listConsumeGroupAccessPolicy, hcClient);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyForRocketMqRequest 请求对象
     * @return ListConsumeGroupAccessPolicyForRocketMqResponse
     */
    public ListConsumeGroupAccessPolicyForRocketMqResponse listConsumeGroupAccessPolicyForRocketMq(
        ListConsumeGroupAccessPolicyForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listConsumeGroupAccessPolicyForRocketMq);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyForRocketMqRequest 请求对象
     * @return SyncInvoker<ListConsumeGroupAccessPolicyForRocketMqRequest, ListConsumeGroupAccessPolicyForRocketMqResponse>
     */
    public SyncInvoker<ListConsumeGroupAccessPolicyForRocketMqRequest, ListConsumeGroupAccessPolicyForRocketMqResponse> listConsumeGroupAccessPolicyForRocketMqInvoker(
        ListConsumeGroupAccessPolicyForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listConsumeGroupAccessPolicyForRocketMq, hcClient);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsRequest 请求对象
     * @return ListDiagnosisReportsResponse
     */
    public ListDiagnosisReportsResponse listDiagnosisReports(ListDiagnosisReportsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listDiagnosisReports);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsRequest 请求对象
     * @return SyncInvoker<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse>
     */
    public SyncInvoker<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse> listDiagnosisReportsInvoker(
        ListDiagnosisReportsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listDiagnosisReports, hcClient);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsForRocketMqRequest 请求对象
     * @return ListDiagnosisReportsForRocketMqResponse
     */
    public ListDiagnosisReportsForRocketMqResponse listDiagnosisReportsForRocketMq(
        ListDiagnosisReportsForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listDiagnosisReportsForRocketMq);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsForRocketMqRequest 请求对象
     * @return SyncInvoker<ListDiagnosisReportsForRocketMqRequest, ListDiagnosisReportsForRocketMqResponse>
     */
    public SyncInvoker<ListDiagnosisReportsForRocketMqRequest, ListDiagnosisReportsForRocketMqResponse> listDiagnosisReportsForRocketMqInvoker(
        ListDiagnosisReportsForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listDiagnosisReportsForRocketMq, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 查询相应引擎的产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return ListEngineProductsResponse
     */
    public ListEngineProductsResponse listEngineProducts(ListEngineProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listEngineProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 查询相应引擎的产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse>
     */
    public SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProductsInvoker(
        ListEngineProductsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return ListInstanceConsumerGroupsResponse
     */
    public ListInstanceConsumerGroupsResponse listInstanceConsumerGroups(ListInstanceConsumerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listInstanceConsumerGroups);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>
     */
    public SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsInvoker(
        ListInstanceConsumerGroupsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listInstanceConsumerGroups, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listInstances);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listInstances, hcClient);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceRequest 请求对象
     * @return ListMessageTraceResponse
     */
    public ListMessageTraceResponse listMessageTrace(ListMessageTraceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listMessageTrace);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceRequest 请求对象
     * @return SyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse>
     */
    public SyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse> listMessageTraceInvoker(
        ListMessageTraceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listMessageTrace, hcClient);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceForRocketMqRequest 请求对象
     * @return ListMessageTraceForRocketMqResponse
     */
    public ListMessageTraceForRocketMqResponse listMessageTraceForRocketMq(ListMessageTraceForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listMessageTraceForRocketMq);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceForRocketMqRequest 请求对象
     * @return SyncInvoker<ListMessageTraceForRocketMqRequest, ListMessageTraceForRocketMqResponse>
     */
    public SyncInvoker<ListMessageTraceForRocketMqRequest, ListMessageTraceForRocketMqResponse> listMessageTraceForRocketMqInvoker(
        ListMessageTraceForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listMessageTraceForRocketMq, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessages(ListMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listMessages);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return SyncInvoker<ListMessagesRequest, ListMessagesResponse>
     */
    public SyncInvoker<ListMessagesRequest, ListMessagesResponse> listMessagesInvoker(ListMessagesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listMessages, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesForRocketMqRequest 请求对象
     * @return ListMessagesForRocketMqResponse
     */
    public ListMessagesForRocketMqResponse listMessagesForRocketMq(ListMessagesForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listMessagesForRocketMq);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesForRocketMqRequest 请求对象
     * @return SyncInvoker<ListMessagesForRocketMqRequest, ListMessagesForRocketMqResponse>
     */
    public SyncInvoker<ListMessagesForRocketMqRequest, ListMessagesForRocketMqResponse> listMessagesForRocketMqInvoker(
        ListMessagesForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listMessagesForRocketMq, hcClient);
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
     * @return ListRocketMqMigrationTaskResponse
     */
    public ListRocketMqMigrationTaskResponse listRocketMqMigrationTask(ListRocketMqMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listRocketMqMigrationTask);
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
     * @return SyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse>
     */
    public SyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> listRocketMqMigrationTaskInvoker(
        ListRocketMqMigrationTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listRocketMqMigrationTask, hcClient);
    }

    /**
     * 查询实例的定时任务列表
     *
     * 查询实例的定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listScheduledTasks);
    }

    /**
     * 查询实例的定时任务列表
     *
     * 查询实例的定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return SyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse>
     */
    public SyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse> listScheduledTasksInvoker(
        ListScheduledTasksRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询主题的授权用户列表
     *
     * 查询主题的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAccessPolicyRequest 请求对象
     * @return ListTopicAccessPolicyResponse
     */
    public ListTopicAccessPolicyResponse listTopicAccessPolicy(ListTopicAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listTopicAccessPolicy);
    }

    /**
     * 查询主题的授权用户列表
     *
     * 查询主题的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAccessPolicyRequest 请求对象
     * @return SyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse>
     */
    public SyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> listTopicAccessPolicyInvoker(
        ListTopicAccessPolicyRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listTopicAccessPolicy, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return ListUserResponse
     */
    public ListUserResponse listUser(ListUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listUser);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return SyncInvoker<ListUserRequest, ListUserResponse>
     */
    public SyncInvoker<ListUserRequest, ListUserResponse> listUserInvoker(ListUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listUser, hcClient);
    }

    /**
     * 修改实例SSL相关配置
     *
     * 修改实例SSL相关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceSslConfigRequest 请求对象
     * @return ModifyInstanceSslConfigResponse
     */
    public ModifyInstanceSslConfigResponse modifyInstanceSslConfig(ModifyInstanceSslConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.modifyInstanceSslConfig);
    }

    /**
     * 修改实例SSL相关配置
     *
     * 修改实例SSL相关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceSslConfigRequest 请求对象
     * @return SyncInvoker<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse>
     */
    public SyncInvoker<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse> modifyInstanceSslConfigInvoker(
        ModifyInstanceSslConfigRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.modifyInstanceSslConfig, hcClient);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRecyclePolicyRequest 请求对象
     * @return ModifyRecyclePolicyResponse
     */
    public ModifyRecyclePolicyResponse modifyRecyclePolicy(ModifyRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.modifyRecyclePolicy);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ModifyRecyclePolicyRequest, ModifyRecyclePolicyResponse>
     */
    public SyncInvoker<ModifyRecyclePolicyRequest, ModifyRecyclePolicyResponse> modifyRecyclePolicyInvoker(
        ModifyRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.modifyRecyclePolicy, hcClient);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetRequest 请求对象
     * @return ResetConsumeOffsetResponse
     */
    public ResetConsumeOffsetResponse resetConsumeOffset(ResetConsumeOffsetRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.resetConsumeOffset);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetRequest 请求对象
     * @return SyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse>
     */
    public SyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> resetConsumeOffsetInvoker(
        ResetConsumeOffsetRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.resetConsumeOffset, hcClient);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetForRocketMqRequest 请求对象
     * @return ResetConsumeOffsetForRocketMqResponse
     */
    public ResetConsumeOffsetForRocketMqResponse resetConsumeOffsetForRocketMq(
        ResetConsumeOffsetForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.resetConsumeOffsetForRocketMq);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetForRocketMqRequest 请求对象
     * @return SyncInvoker<ResetConsumeOffsetForRocketMqRequest, ResetConsumeOffsetForRocketMqResponse>
     */
    public SyncInvoker<ResetConsumeOffsetForRocketMqRequest, ResetConsumeOffsetForRocketMqResponse> resetConsumeOffsetForRocketMqInvoker(
        ResetConsumeOffsetForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.resetConsumeOffsetForRocketMq, hcClient);
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
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.resizeInstance);
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
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.resizeInstance, hcClient);
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
     * @return ResizeInstanceForRocketMqResponse
     */
    public ResizeInstanceForRocketMqResponse resizeInstanceForRocketMq(ResizeInstanceForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.resizeInstanceForRocketMq);
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
     * @return SyncInvoker<ResizeInstanceForRocketMqRequest, ResizeInstanceForRocketMqResponse>
     */
    public SyncInvoker<ResizeInstanceForRocketMqRequest, ResizeInstanceForRocketMqResponse> resizeInstanceForRocketMqInvoker(
        ResizeInstanceForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.resizeInstanceForRocketMq, hcClient);
    }

    /**
     * 恢复回收站实例
     *
     * 恢复回收站实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRecycleInstanceRequest 请求对象
     * @return RestoreRecycleInstanceResponse
     */
    public RestoreRecycleInstanceResponse restoreRecycleInstance(RestoreRecycleInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.restoreRecycleInstance);
    }

    /**
     * 恢复回收站实例
     *
     * 恢复回收站实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRecycleInstanceRequest 请求对象
     * @return SyncInvoker<RestoreRecycleInstanceRequest, RestoreRecycleInstanceResponse>
     */
    public SyncInvoker<RestoreRecycleInstanceRequest, RestoreRecycleInstanceResponse> restoreRecycleInstanceInvoker(
        RestoreRecycleInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.restoreRecycleInstance, hcClient);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageRequest 请求对象
     * @return SendDlqMessageResponse
     */
    public SendDlqMessageResponse sendDlqMessage(SendDlqMessageRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.sendDlqMessage);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageRequest 请求对象
     * @return SyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse>
     */
    public SyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse> sendDlqMessageInvoker(
        SendDlqMessageRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.sendDlqMessage, hcClient);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageForRocketMqRequest 请求对象
     * @return SendDlqMessageForRocketMqResponse
     */
    public SendDlqMessageForRocketMqResponse sendDlqMessageForRocketMq(SendDlqMessageForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.sendDlqMessageForRocketMq);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageForRocketMqRequest 请求对象
     * @return SyncInvoker<SendDlqMessageForRocketMqRequest, SendDlqMessageForRocketMqResponse>
     */
    public SyncInvoker<SendDlqMessageForRocketMqRequest, SendDlqMessageForRocketMqResponse> sendDlqMessageForRocketMqInvoker(
        SendDlqMessageForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.sendDlqMessageForRocketMq, hcClient);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageRequest 请求对象
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessage(SendMessageRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.sendMessage);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageRequest 请求对象
     * @return SyncInvoker<SendMessageRequest, SendMessageResponse>
     */
    public SyncInvoker<SendMessageRequest, SendMessageResponse> sendMessageInvoker(SendMessageRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.sendMessage, hcClient);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageForRocketMqRequest 请求对象
     * @return SendMessageForRocketMqResponse
     */
    public SendMessageForRocketMqResponse sendMessageForRocketMq(SendMessageForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.sendMessageForRocketMq);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageForRocketMqRequest 请求对象
     * @return SyncInvoker<SendMessageForRocketMqRequest, SendMessageForRocketMqResponse>
     */
    public SyncInvoker<SendMessageForRocketMqRequest, SendMessageForRocketMqResponse> sendMessageForRocketMqInvoker(
        SendMessageForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.sendMessageForRocketMq, hcClient);
    }

    /**
     * 查询后台任务管理中的指定记录
     *
     * 查询后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskRequest 请求对象
     * @return ShowBackgroundTaskResponse
     */
    public ShowBackgroundTaskResponse showBackgroundTask(ShowBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showBackgroundTask);
    }

    /**
     * 查询后台任务管理中的指定记录
     *
     * 查询后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskRequest 请求对象
     * @return SyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse>
     */
    public SyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTaskInvoker(
        ShowBackgroundTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showBackgroundTask, hcClient);
    }

    /**
     * 查询实例变更记录的进度
     *
     * 查询后台任务管理中的指定实例变更记录的进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return ShowBackgroundTaskProgressResponse
     */
    public ShowBackgroundTaskProgressResponse showBackgroundTaskProgress(ShowBackgroundTaskProgressRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showBackgroundTaskProgress);
    }

    /**
     * 查询实例变更记录的进度
     *
     * 查询后台任务管理中的指定实例变更记录的进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return SyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse>
     */
    public SyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressInvoker(
        ShowBackgroundTaskProgressRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showBackgroundTaskProgress, hcClient);
    }

    /**
     * 查询实例在CES的监控层级关系
     *
     * 查询实例在CES的监控层级关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCesHierarchyRequest 请求对象
     * @return ShowCesHierarchyResponse
     */
    public ShowCesHierarchyResponse showCesHierarchy(ShowCesHierarchyRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showCesHierarchy);
    }

    /**
     * 查询实例在CES的监控层级关系
     *
     * 查询实例在CES的监控层级关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCesHierarchyRequest 请求对象
     * @return SyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse>
     */
    public SyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchyInvoker(
        ShowCesHierarchyRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showCesHierarchy, hcClient);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsRequest 请求对象
     * @return ShowConsumerConnectionsResponse
     */
    public ShowConsumerConnectionsResponse showConsumerConnections(ShowConsumerConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showConsumerConnections);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsRequest 请求对象
     * @return SyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse>
     */
    public SyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> showConsumerConnectionsInvoker(
        ShowConsumerConnectionsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showConsumerConnections, hcClient);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsForRocketMqRequest 请求对象
     * @return ShowConsumerConnectionsForRocketMqResponse
     */
    public ShowConsumerConnectionsForRocketMqResponse showConsumerConnectionsForRocketMq(
        ShowConsumerConnectionsForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showConsumerConnectionsForRocketMq);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsForRocketMqRequest 请求对象
     * @return SyncInvoker<ShowConsumerConnectionsForRocketMqRequest, ShowConsumerConnectionsForRocketMqResponse>
     */
    public SyncInvoker<ShowConsumerConnectionsForRocketMqRequest, ShowConsumerConnectionsForRocketMqResponse> showConsumerConnectionsForRocketMqInvoker(
        ShowConsumerConnectionsForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showConsumerConnectionsForRocketMq, hcClient);
    }

    /**
     * 查询消费列表或详情
     *
     * 查询消费列表或详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerListOrDetailsRequest 请求对象
     * @return ShowConsumerListOrDetailsResponse
     */
    public ShowConsumerListOrDetailsResponse showConsumerListOrDetails(ShowConsumerListOrDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showConsumerListOrDetails);
    }

    /**
     * 查询消费列表或详情
     *
     * 查询消费列表或详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerListOrDetailsRequest 请求对象
     * @return SyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse>
     */
    public SyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> showConsumerListOrDetailsInvoker(
        ShowConsumerListOrDetailsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showConsumerListOrDetails, hcClient);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportRequest 请求对象
     * @return ShowDiagnosisReportResponse
     */
    public ShowDiagnosisReportResponse showDiagnosisReport(ShowDiagnosisReportRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showDiagnosisReport);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse>
     */
    public SyncInvoker<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse> showDiagnosisReportInvoker(
        ShowDiagnosisReportRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showDiagnosisReport, hcClient);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportForRocketMqRequest 请求对象
     * @return ShowDiagnosisReportForRocketMqResponse
     */
    public ShowDiagnosisReportForRocketMqResponse showDiagnosisReportForRocketMq(
        ShowDiagnosisReportForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showDiagnosisReportForRocketMq);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportForRocketMqRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisReportForRocketMqRequest, ShowDiagnosisReportForRocketMqResponse>
     */
    public SyncInvoker<ShowDiagnosisReportForRocketMqRequest, ShowDiagnosisReportForRocketMqResponse> showDiagnosisReportForRocketMqInvoker(
        ShowDiagnosisReportForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showDiagnosisReportForRocketMq, hcClient);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackRequest 请求对象
     * @return ShowDiagnosisStackResponse
     */
    public ShowDiagnosisStackResponse showDiagnosisStack(ShowDiagnosisStackRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showDiagnosisStack);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse>
     */
    public SyncInvoker<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse> showDiagnosisStackInvoker(
        ShowDiagnosisStackRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showDiagnosisStack, hcClient);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackForRocketMqRequest 请求对象
     * @return ShowDiagnosisStackForRocketMqResponse
     */
    public ShowDiagnosisStackForRocketMqResponse showDiagnosisStackForRocketMq(
        ShowDiagnosisStackForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showDiagnosisStackForRocketMq);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackForRocketMqRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisStackForRocketMqRequest, ShowDiagnosisStackForRocketMqResponse>
     */
    public SyncInvoker<ShowDiagnosisStackForRocketMqRequest, ShowDiagnosisStackForRocketMqResponse> showDiagnosisStackForRocketMqInvoker(
        ShowDiagnosisStackForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showDiagnosisStackForRocketMq, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return ShowEngineInstanceExtendProductInfoResponse
     */
    public ShowEngineInstanceExtendProductInfoResponse showEngineInstanceExtendProductInfo(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showEngineInstanceExtendProductInfo);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoInvoker(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showEngineInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoForRocketMqRequest 请求对象
     * @return ShowEngineInstanceExtendProductInfoForRocketMqResponse
     */
    public ShowEngineInstanceExtendProductInfoForRocketMqResponse showEngineInstanceExtendProductInfoForRocketMq(
        ShowEngineInstanceExtendProductInfoForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showEngineInstanceExtendProductInfoForRocketMq);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoForRocketMqRequest 请求对象
     * @return SyncInvoker<ShowEngineInstanceExtendProductInfoForRocketMqRequest, ShowEngineInstanceExtendProductInfoForRocketMqResponse>
     */
    public SyncInvoker<ShowEngineInstanceExtendProductInfoForRocketMqRequest, ShowEngineInstanceExtendProductInfoForRocketMqResponse> showEngineInstanceExtendProductInfoForRocketMqInvoker(
        ShowEngineInstanceExtendProductInfoForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showEngineInstanceExtendProductInfoForRocketMq, hcClient);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return ShowGroupResponse
     */
    public ShowGroupResponse showGroup(ShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showGroup);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return SyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public SyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupInvoker(ShowGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showGroup, hcClient);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showInstance);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showInstance, hcClient);
    }

    /**
     * 查询实例节点
     *
     * 查询实例节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesRequest 请求对象
     * @return ShowInstanceNodesResponse
     */
    public ShowInstanceNodesResponse showInstanceNodes(ShowInstanceNodesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showInstanceNodes);
    }

    /**
     * 查询实例节点
     *
     * 查询实例节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesRequest 请求对象
     * @return SyncInvoker<ShowInstanceNodesRequest, ShowInstanceNodesResponse>
     */
    public SyncInvoker<ShowInstanceNodesRequest, ShowInstanceNodesResponse> showInstanceNodesInvoker(
        ShowInstanceNodesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showInstanceNodes, hcClient);
    }

    /**
     * 查看租户配额
     *
     * 查询租户最大可以创建的实例个数和已创建的实例个数，以及每个实例最大可以创建标签的个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showQuotas);
    }

    /**
     * 查看租户配额
     *
     * 查询租户最大可以创建的实例个数和已创建的实例个数，以及每个实例最大可以创建标签的个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showQuotas, hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecycleInstancesRequest 请求对象
     * @return ShowRecycleInstancesResponse
     */
    public ShowRecycleInstancesResponse showRecycleInstances(ShowRecycleInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecycleInstancesRequest 请求对象
     * @return SyncInvoker<ShowRecycleInstancesRequest, ShowRecycleInstancesResponse>
     */
    public SyncInvoker<ShowRecycleInstancesRequest, ShowRecycleInstancesResponse> showRecycleInstancesInvoker(
        ShowRecycleInstancesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRecycleInstances, hcClient);
    }

    /**
     * 查询RocketMQ配置
     *
     * 该接口用于查询RocketMQ配置，若成功则返回配置的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqConfigsRequest 请求对象
     * @return ShowRocketMqConfigsResponse
     */
    public ShowRocketMqConfigsResponse showRocketMqConfigs(ShowRocketMqConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRocketMqConfigs);
    }

    /**
     * 查询RocketMQ配置
     *
     * 该接口用于查询RocketMQ配置，若成功则返回配置的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqConfigsRequest 请求对象
     * @return SyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse>
     */
    public SyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> showRocketMqConfigsInvoker(
        ShowRocketMqConfigsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRocketMqConfigs, hcClient);
    }

    /**
     * 查询RocketMQ产品规格核数
     *
     * 查询RocketMQ产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqProductCoresRequest 请求对象
     * @return ShowRocketMqProductCoresResponse
     */
    public ShowRocketMqProductCoresResponse showRocketMqProductCores(ShowRocketMqProductCoresRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRocketMqProductCores);
    }

    /**
     * 查询RocketMQ产品规格核数
     *
     * 查询RocketMQ产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqProductCoresRequest 请求对象
     * @return SyncInvoker<ShowRocketMqProductCoresRequest, ShowRocketMqProductCoresResponse>
     */
    public SyncInvoker<ShowRocketMqProductCoresRequest, ShowRocketMqProductCoresResponse> showRocketMqProductCoresInvoker(
        ShowRocketMqProductCoresRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRocketMqProductCores, hcClient);
    }

    /**
     * 查询RocketMQ实例扩容前置检查信息
     *
     * 获取RocketMQ实例扩容前置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqScalePreCheckInfoRequest 请求对象
     * @return ShowRocketMqScalePreCheckInfoResponse
     */
    public ShowRocketMqScalePreCheckInfoResponse showRocketMqScalePreCheckInfo(
        ShowRocketMqScalePreCheckInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRocketMqScalePreCheckInfo);
    }

    /**
     * 查询RocketMQ实例扩容前置检查信息
     *
     * 获取RocketMQ实例扩容前置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqScalePreCheckInfoRequest 请求对象
     * @return SyncInvoker<ShowRocketMqScalePreCheckInfoRequest, ShowRocketMqScalePreCheckInfoResponse>
     */
    public SyncInvoker<ShowRocketMqScalePreCheckInfoRequest, ShowRocketMqScalePreCheckInfoResponse> showRocketMqScalePreCheckInfoInvoker(
        ShowRocketMqScalePreCheckInfoRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRocketMqScalePreCheckInfo, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqProjectTagsRequest 请求对象
     * @return ShowRocketmqProjectTagsResponse
     */
    public ShowRocketmqProjectTagsResponse showRocketmqProjectTags(ShowRocketmqProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRocketmqProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqProjectTagsRequest 请求对象
     * @return SyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse>
     */
    public SyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> showRocketmqProjectTagsInvoker(
        ShowRocketmqProjectTagsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRocketmqProjectTags, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqTagsRequest 请求对象
     * @return ShowRocketmqTagsResponse
     */
    public ShowRocketmqTagsResponse showRocketmqTags(ShowRocketmqTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRocketmqTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqTagsRequest 请求对象
     * @return SyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse>
     */
    public SyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> showRocketmqTagsInvoker(
        ShowRocketmqTagsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRocketmqTags, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 查询用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return ShowUserResponse
     */
    public ShowUserResponse showUser(ShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showUser);
    }

    /**
     * 查询用户详情
     *
     * 查询用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return SyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public SyncInvoker<ShowUserRequest, ShowUserResponse> showUserInvoker(ShowUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showUser, hcClient);
    }

    /**
     * 查询磁盘自动扩容配置
     *
     * 查询磁盘自动扩容配置，包括磁盘自动扩容是否开启，以及开启后的扩容阈值、扩容步长、扩容上限信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeExpandConfigRequest 请求对象
     * @return ShowVolumeExpandConfigResponse
     */
    public ShowVolumeExpandConfigResponse showVolumeExpandConfig(ShowVolumeExpandConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showVolumeExpandConfig);
    }

    /**
     * 查询磁盘自动扩容配置
     *
     * 查询磁盘自动扩容配置，包括磁盘自动扩容是否开启，以及开启后的扩容阈值、扩容步长、扩容上限信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeExpandConfigRequest 请求对象
     * @return SyncInvoker<ShowVolumeExpandConfigRequest, ShowVolumeExpandConfigResponse>
     */
    public SyncInvoker<ShowVolumeExpandConfigRequest, ShowVolumeExpandConfigResponse> showVolumeExpandConfigInvoker(
        ShowVolumeExpandConfigRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showVolumeExpandConfig, hcClient);
    }

    /**
     * 修改消费组
     *
     * 修改指定消费组参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConsumerGroupRequest 请求对象
     * @return UpdateConsumerGroupResponse
     */
    public UpdateConsumerGroupResponse updateConsumerGroup(UpdateConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateConsumerGroup);
    }

    /**
     * 修改消费组
     *
     * 修改指定消费组参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConsumerGroupRequest 请求对象
     * @return SyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse>
     */
    public SyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> updateConsumerGroupInvoker(
        UpdateConsumerGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateConsumerGroup, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改实例相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateInstance, hcClient);
    }

    /**
     * 修改RocketMQ配置
     *
     * 该接口用于修改RocketMQ配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRocketMqConfigsRequest 请求对象
     * @return UpdateRocketMqConfigsResponse
     */
    public UpdateRocketMqConfigsResponse updateRocketMqConfigs(UpdateRocketMqConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateRocketMqConfigs);
    }

    /**
     * 修改RocketMQ配置
     *
     * 该接口用于修改RocketMQ配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRocketMqConfigsRequest 请求对象
     * @return SyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse>
     */
    public SyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> updateRocketMqConfigsInvoker(
        UpdateRocketMqConfigsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateRocketMqConfigs, hcClient);
    }

    /**
     * 修改定时任务管理中的指定记录
     *
     * 修改定时任务管理中的指定记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return UpdateScheduledTaskResponse
     */
    public UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateScheduledTask);
    }

    /**
     * 修改定时任务管理中的指定记录
     *
     * 修改定时任务管理中的指定记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return SyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
     */
    public SyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTaskInvoker(
        UpdateScheduledTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateScheduledTask, hcClient);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateUser);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateUser, hcClient);
    }

    /**
     * 修改磁盘自动扩容配置
     *
     * 该接口用于修改磁盘自动扩容配置，包含磁盘自动扩容是否开启、扩容阈值、扩容步长，以及扩容上限的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVolumeExpansionConfigRequest 请求对象
     * @return UpdateVolumeExpansionConfigResponse
     */
    public UpdateVolumeExpansionConfigResponse updateVolumeExpansionConfig(UpdateVolumeExpansionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateVolumeExpansionConfig);
    }

    /**
     * 修改磁盘自动扩容配置
     *
     * 该接口用于修改磁盘自动扩容配置，包含磁盘自动扩容是否开启、扩容阈值、扩容步长，以及扩容上限的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVolumeExpansionConfigRequest 请求对象
     * @return SyncInvoker<UpdateVolumeExpansionConfigRequest, UpdateVolumeExpansionConfigResponse>
     */
    public SyncInvoker<UpdateVolumeExpansionConfigRequest, UpdateVolumeExpansionConfigResponse> updateVolumeExpansionConfigInvoker(
        UpdateVolumeExpansionConfigRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateVolumeExpansionConfig, hcClient);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageRequest 请求对象
     * @return ValidateConsumedMessageResponse
     */
    public ValidateConsumedMessageResponse validateConsumedMessage(ValidateConsumedMessageRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.validateConsumedMessage);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageRequest 请求对象
     * @return SyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse>
     */
    public SyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> validateConsumedMessageInvoker(
        ValidateConsumedMessageRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.validateConsumedMessage, hcClient);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageForRocketMqRequest 请求对象
     * @return ValidateConsumedMessageForRocketMqResponse
     */
    public ValidateConsumedMessageForRocketMqResponse validateConsumedMessageForRocketMq(
        ValidateConsumedMessageForRocketMqRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.validateConsumedMessageForRocketMq);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageForRocketMqRequest 请求对象
     * @return SyncInvoker<ValidateConsumedMessageForRocketMqRequest, ValidateConsumedMessageForRocketMqResponse>
     */
    public SyncInvoker<ValidateConsumedMessageForRocketMqRequest, ValidateConsumedMessageForRocketMqResponse> validateConsumedMessageForRocketMqInvoker(
        ValidateConsumedMessageForRocketMqRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.validateConsumedMessageForRocketMq, hcClient);
    }

    /**
     * 创建主题或批量删除主题
     *
     * 创建主题或批量删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTopicOrBatchDeleteTopicRequest 请求对象
     * @return CreateTopicOrBatchDeleteTopicResponse
     */
    public CreateTopicOrBatchDeleteTopicResponse createTopicOrBatchDeleteTopic(
        CreateTopicOrBatchDeleteTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createTopicOrBatchDeleteTopic);
    }

    /**
     * 创建主题或批量删除主题
     *
     * 创建主题或批量删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTopicOrBatchDeleteTopicRequest 请求对象
     * @return SyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse>
     */
    public SyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> createTopicOrBatchDeleteTopicInvoker(
        CreateTopicOrBatchDeleteTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createTopicOrBatchDeleteTopic, hcClient);
    }

    /**
     * 删除指定主题
     *
     * 删除指定主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteTopic);
    }

    /**
     * 删除指定主题
     *
     * 删除指定主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return SyncInvoker<DeleteTopicRequest, DeleteTopicResponse>
     */
    public SyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicInvoker(DeleteTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteTopic, hcClient);
    }

    /**
     * 查询主题消费组列表
     *
     * 查询主题消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumerGroupOfTopicRequest 请求对象
     * @return ListConsumerGroupOfTopicResponse
     */
    public ListConsumerGroupOfTopicResponse listConsumerGroupOfTopic(ListConsumerGroupOfTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listConsumerGroupOfTopic);
    }

    /**
     * 查询主题消费组列表
     *
     * 查询主题消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumerGroupOfTopicRequest 请求对象
     * @return SyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse>
     */
    public SyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> listConsumerGroupOfTopicInvoker(
        ListConsumerGroupOfTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listConsumerGroupOfTopic, hcClient);
    }

    /**
     * 查询主题列表
     *
     * 该接口用于查询指定RocketMQ实例的Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketInstanceTopicsRequest 请求对象
     * @return ListRocketInstanceTopicsResponse
     */
    public ListRocketInstanceTopicsResponse listRocketInstanceTopics(ListRocketInstanceTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listRocketInstanceTopics);
    }

    /**
     * 查询主题列表
     *
     * 该接口用于查询指定RocketMQ实例的Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketInstanceTopicsRequest 请求对象
     * @return SyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse>
     */
    public SyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> listRocketInstanceTopicsInvoker(
        ListRocketInstanceTopicsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listRocketInstanceTopics, hcClient);
    }

    /**
     * 查询单个主题
     *
     * 查询单个主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOneTopicRequest 请求对象
     * @return ShowOneTopicResponse
     */
    public ShowOneTopicResponse showOneTopic(ShowOneTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showOneTopic);
    }

    /**
     * 查询单个主题
     *
     * 查询单个主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOneTopicRequest 请求对象
     * @return SyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse>
     */
    public SyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse> showOneTopicInvoker(ShowOneTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showOneTopic, hcClient);
    }

    /**
     * 查询主题的消息数
     *
     * 查询主题的消息数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicStatusRequest 请求对象
     * @return ShowTopicStatusResponse
     */
    public ShowTopicStatusResponse showTopicStatus(ShowTopicStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showTopicStatus);
    }

    /**
     * 查询主题的消息数
     *
     * 查询主题的消息数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicStatusRequest 请求对象
     * @return SyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse>
     */
    public SyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse> showTopicStatusInvoker(
        ShowTopicStatusRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showTopicStatus, hcClient);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return UpdateTopicResponse
     */
    public UpdateTopicResponse updateTopic(UpdateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateTopic);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return SyncInvoker<UpdateTopicRequest, UpdateTopicResponse>
     */
    public SyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicInvoker(UpdateTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateTopic, hcClient);
    }

}
