package com.huaweicloud.sdk.kafka.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kafka.v2.model.BatchCreateOrDeleteKafkaTagRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchCreateOrDeleteKafkaTagResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceUsersRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceUsersResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteMessageDiagnosisReportsRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteMessageDiagnosisReportsResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchRestartOrDeleteInstancesRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchRestartOrDeleteInstancesResponse;
import com.huaweicloud.sdk.kafka.v2.model.CloseKafkaManagerRequest;
import com.huaweicloud.sdk.kafka.v2.model.CloseKafkaManagerResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceByEngineRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceByEngineResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceUserRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceUserResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaConsumerGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaConsumerGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaReassignmentTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaReassignmentTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaRebalanceLogTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaRebalanceLogTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaTopicQuotaRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaTopicQuotaResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateMessageDiagnosisTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateMessageDiagnosisTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreatePartitionRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreatePartitionResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidKafkaInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidKafkaInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConsumerGroupOffsetsRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConsumerGroupOffsetsResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceConsumerGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceConsumerGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaTopicMessagesRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaTopicMessagesResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaTopicQuotaRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaTopicQuotaResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.EnableDnsRequest;
import com.huaweicloud.sdk.kafka.v2.model.EnableDnsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListConfigFeaturesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListConfigFeaturesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListConnectorTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListConnectorTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupMembersRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupMembersResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupMessageOffsetRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupMessageOffsetResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupTopicsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupTopicsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListMessageDiagnosisReportsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListMessageDiagnosisReportsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListObsBucketsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListObsBucketsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListScheduledTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListScheduledTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListUserPoliciesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListUserPoliciesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyKafkaPublicIpAccessSwitchRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyKafkaPublicIpAccessSwitchResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyKafkaTopicQuotaRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyKafkaTopicQuotaResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyRecyclePolicyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyRecyclePolicyResponse;
import com.huaweicloud.sdk.kafka.v2.model.PauseConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.PauseConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetManagerPasswordRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetManagerPasswordResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetWithEngineRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetWithEngineResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetUserPasswrodRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetUserPasswrodResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResizeEngineInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResizeEngineInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResizeKafkaInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResizeKafkaInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.RestartConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerResponse;
import com.huaweicloud.sdk.kafka.v2.model.RestartSmartConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartSmartConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.RestoreRecycleInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestoreRecycleInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResumeConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResumeConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.SetUserPoliciesRequest;
import com.huaweicloud.sdk.kafka.v2.model.SetUserPoliciesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskProgressRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskProgressResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowConnectorResourceInfoRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowConnectorResourceInfoResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCoordinatorsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCoordinatorsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowDiagnosisPreCheckRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowDiagnosisPreCheckResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowGroupsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowGroupsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceConfigsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceConfigsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceMessagesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceMessagesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceTopicDetailRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceTopicDetailResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceUsersRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceUsersResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaClusterRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaClusterResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaProductCoresRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaProductCoresResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaProjectTagsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaProjectTagsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaRebalanceLogRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaRebalanceLogResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaScalePreCheckInfoRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaScalePreCheckInfoResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTagsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTagsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicDetailRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicDetailResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicPartitionDiskusageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicPartitionDiskusageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicQuotaRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicQuotaResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaUserClientQuotaRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaUserClientQuotaResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowMaintainWindowsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowMaintainWindowsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowMessageDiagnosisReportRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowMessageDiagnosisReportResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowMessagesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowMessagesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionBeginningMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionBeginningMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionEndMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionEndMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowRecycleInstancesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowRecycleInstancesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowSpecConvertProductRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowSpecConvertProductResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowTopicAccessPolicyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowTopicAccessPolicyResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowUpgradeInstanceVersionRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowUpgradeInstanceVersionResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowVolumeExpandConfigRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowVolumeExpandConfigResponse;
import com.huaweicloud.sdk.kafka.v2.model.StopKafkaRebalanceLogTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.StopKafkaRebalanceLogTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceAutoCreateTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceAutoCreateTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceConsumerGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceConsumerGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVpcIpRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVpcIpResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceUserRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceUserResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaPortProtocolRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaPortProtocolResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateScheduledTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateScheduledTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateVolumeExpansionConfigRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateVolumeExpansionConfigResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpgradeInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpgradeInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.ValidateConnectorConnectivityRequest;
import com.huaweicloud.sdk.kafka.v2.model.ValidateConnectorConnectivityResponse;

import java.util.concurrent.CompletableFuture;

public class KafkaAsyncClient {

    protected HcClient hcClient;

    public KafkaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KafkaAsyncClient> newBuilder() {
        ClientBuilder<KafkaAsyncClient> clientBuilder = new ClientBuilder<>(KafkaAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteKafkaTagRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteKafkaTagResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteKafkaTagResponse> batchCreateOrDeleteKafkaTagAsync(
        BatchCreateOrDeleteKafkaTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchCreateOrDeleteKafkaTag);
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteKafkaTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> batchCreateOrDeleteKafkaTagAsyncInvoker(
        BatchCreateOrDeleteKafkaTagRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.batchCreateOrDeleteKafkaTag, hcClient);
    }

    /**
     * Kafka实例批量删除消费组
     *
     * 该接口用于向Kafka实例批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGroupRequest 请求对象
     * @return CompletableFuture<BatchDeleteGroupResponse>
     */
    public CompletableFuture<BatchDeleteGroupResponse> batchDeleteGroupAsync(BatchDeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchDeleteGroup);
    }

    /**
     * Kafka实例批量删除消费组
     *
     * 该接口用于向Kafka实例批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGroupRequest 请求对象
     * @return AsyncInvoker<BatchDeleteGroupRequest, BatchDeleteGroupResponse>
     */
    public AsyncInvoker<BatchDeleteGroupRequest, BatchDeleteGroupResponse> batchDeleteGroupAsyncInvoker(
        BatchDeleteGroupRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.batchDeleteGroup, hcClient);
    }

    /**
     * Kafka实例批量删除Topic
     *
     * 该接口用于向Kafka实例批量删除Topic。批量删除多个Topic时，部分删除成功，部分失败，此时接口返回删除成功，并在返回中显示删除失败的Topic信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceTopicRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstanceTopicResponse>
     */
    public CompletableFuture<BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopicAsync(
        BatchDeleteInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchDeleteInstanceTopic);
    }

    /**
     * Kafka实例批量删除Topic
     *
     * 该接口用于向Kafka实例批量删除Topic。批量删除多个Topic时，部分删除成功，部分失败，此时接口返回删除成功，并在返回中显示删除失败的Topic信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceTopicRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse>
     */
    public AsyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopicAsyncInvoker(
        BatchDeleteInstanceTopicRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.batchDeleteInstanceTopic, hcClient);
    }

    /**
     * 批量删除用户
     *
     * 批量删除Kafka实例的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceUsersRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstanceUsersResponse>
     */
    public CompletableFuture<BatchDeleteInstanceUsersResponse> batchDeleteInstanceUsersAsync(
        BatchDeleteInstanceUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchDeleteInstanceUsers);
    }

    /**
     * 批量删除用户
     *
     * 批量删除Kafka实例的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceUsersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse>
     */
    public AsyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> batchDeleteInstanceUsersAsyncInvoker(
        BatchDeleteInstanceUsersRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.batchDeleteInstanceUsers, hcClient);
    }

    /**
     * 批量删除消息积压诊断报告
     *
     * 批量删除消息积压诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMessageDiagnosisReportsRequest 请求对象
     * @return CompletableFuture<BatchDeleteMessageDiagnosisReportsResponse>
     */
    public CompletableFuture<BatchDeleteMessageDiagnosisReportsResponse> batchDeleteMessageDiagnosisReportsAsync(
        BatchDeleteMessageDiagnosisReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchDeleteMessageDiagnosisReports);
    }

    /**
     * 批量删除消息积压诊断报告
     *
     * 批量删除消息积压诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMessageDiagnosisReportsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteMessageDiagnosisReportsRequest, BatchDeleteMessageDiagnosisReportsResponse>
     */
    public AsyncInvoker<BatchDeleteMessageDiagnosisReportsRequest, BatchDeleteMessageDiagnosisReportsResponse> batchDeleteMessageDiagnosisReportsAsyncInvoker(
        BatchDeleteMessageDiagnosisReportsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.batchDeleteMessageDiagnosisReports, hcClient);
    }

    /**
     * 批量重启或删除实例
     *
     * 批量重启或删除实例。
     * 
     * 在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。
     * 
     * 实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestartOrDeleteInstancesRequest 请求对象
     * @return CompletableFuture<BatchRestartOrDeleteInstancesResponse>
     */
    public CompletableFuture<BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsync(
        BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchRestartOrDeleteInstances);
    }

    /**
     * 批量重启或删除实例
     *
     * 批量重启或删除实例。
     * 
     * 在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。
     * 
     * 实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestartOrDeleteInstancesRequest 请求对象
     * @return AsyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>
     */
    public AsyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsyncInvoker(
        BatchRestartOrDeleteInstancesRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.batchRestartOrDeleteInstances, hcClient);
    }

    /**
     * 关闭Kafka Manager
     *
     * 关闭Kafka Manager，相应的原来开放出的management相关接口也将不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseKafkaManagerRequest 请求对象
     * @return CompletableFuture<CloseKafkaManagerResponse>
     */
    public CompletableFuture<CloseKafkaManagerResponse> closeKafkaManagerAsync(CloseKafkaManagerRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.closeKafkaManager);
    }

    /**
     * 关闭Kafka Manager
     *
     * 关闭Kafka Manager，相应的原来开放出的management相关接口也将不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseKafkaManagerRequest 请求对象
     * @return AsyncInvoker<CloseKafkaManagerRequest, CloseKafkaManagerResponse>
     */
    public AsyncInvoker<CloseKafkaManagerRequest, CloseKafkaManagerResponse> closeKafkaManagerAsyncInvoker(
        CloseKafkaManagerRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.closeKafkaManager, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例。
     * 
     * [该接口支持创建按需和包周期两种计费方式的实例。](tag:hws,hws_eu,hws_hk,ctc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceByEngineRequest 请求对象
     * @return CompletableFuture<CreateInstanceByEngineResponse>
     */
    public CompletableFuture<CreateInstanceByEngineResponse> createInstanceByEngineAsync(
        CreateInstanceByEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createInstanceByEngine);
    }

    /**
     * 创建实例
     *
     * 创建实例。
     * 
     * [该接口支持创建按需和包周期两种计费方式的实例。](tag:hws,hws_eu,hws_hk,ctc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceByEngineRequest 请求对象
     * @return AsyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>
     */
    public AsyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngineAsyncInvoker(
        CreateInstanceByEngineRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createInstanceByEngine, hcClient);
    }

    /**
     * Kafka实例创建Topic
     *
     * 该接口用于向Kafka实例创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceTopicRequest 请求对象
     * @return CompletableFuture<CreateInstanceTopicResponse>
     */
    public CompletableFuture<CreateInstanceTopicResponse> createInstanceTopicAsync(CreateInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createInstanceTopic);
    }

    /**
     * Kafka实例创建Topic
     *
     * 该接口用于向Kafka实例创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceTopicRequest 请求对象
     * @return AsyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse>
     */
    public AsyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse> createInstanceTopicAsyncInvoker(
        CreateInstanceTopicRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createInstanceTopic, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。 [ 2023年7月15日前创建的Kafka实例，一个实例最多创建20个用户。2023年7月15日及以后创建的Kafka实例，一个实例最多创建500个用户。](tag:hws,hws_hk) [一个实例最多创建500个用户。](tag:fcs,ax,hcs)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceUserRequest 请求对象
     * @return CompletableFuture<CreateInstanceUserResponse>
     */
    public CompletableFuture<CreateInstanceUserResponse> createInstanceUserAsync(CreateInstanceUserRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createInstanceUser);
    }

    /**
     * 创建用户
     *
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。 [ 2023年7月15日前创建的Kafka实例，一个实例最多创建20个用户。2023年7月15日及以后创建的Kafka实例，一个实例最多创建500个用户。](tag:hws,hws_hk) [一个实例最多创建500个用户。](tag:fcs,ax,hcs)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceUserRequest 请求对象
     * @return AsyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse>
     */
    public AsyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse> createInstanceUserAsyncInvoker(
        CreateInstanceUserRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createInstanceUser, hcClient);
    }

    /**
     * 创建消费组
     *
     * 实例创建消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaConsumerGroupRequest 请求对象
     * @return CompletableFuture<CreateKafkaConsumerGroupResponse>
     */
    public CompletableFuture<CreateKafkaConsumerGroupResponse> createKafkaConsumerGroupAsync(
        CreateKafkaConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createKafkaConsumerGroup);
    }

    /**
     * 创建消费组
     *
     * 实例创建消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaConsumerGroupRequest 请求对象
     * @return AsyncInvoker<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse>
     */
    public AsyncInvoker<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse> createKafkaConsumerGroupAsyncInvoker(
        CreateKafkaConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createKafkaConsumerGroup, hcClient);
    }

    /**
     * Kafka实例开始分区平衡任务
     *
     * 该接口用于向Kafka实例提交分区平衡任务，若成功则返回分区平衡任务的job id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaReassignmentTaskRequest 请求对象
     * @return CompletableFuture<CreateKafkaReassignmentTaskResponse>
     */
    public CompletableFuture<CreateKafkaReassignmentTaskResponse> createKafkaReassignmentTaskAsync(
        CreateKafkaReassignmentTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createKafkaReassignmentTask);
    }

    /**
     * Kafka实例开始分区平衡任务
     *
     * 该接口用于向Kafka实例提交分区平衡任务，若成功则返回分区平衡任务的job id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaReassignmentTaskRequest 请求对象
     * @return AsyncInvoker<CreateKafkaReassignmentTaskRequest, CreateKafkaReassignmentTaskResponse>
     */
    public AsyncInvoker<CreateKafkaReassignmentTaskRequest, CreateKafkaReassignmentTaskResponse> createKafkaReassignmentTaskAsyncInvoker(
        CreateKafkaReassignmentTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createKafkaReassignmentTask, hcClient);
    }

    /**
     * 开启Kafka实例重平衡日志功能
     *
     * 开启Kafka实例重平衡日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaRebalanceLogTaskRequest 请求对象
     * @return CompletableFuture<CreateKafkaRebalanceLogTaskResponse>
     */
    public CompletableFuture<CreateKafkaRebalanceLogTaskResponse> createKafkaRebalanceLogTaskAsync(
        CreateKafkaRebalanceLogTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createKafkaRebalanceLogTask);
    }

    /**
     * 开启Kafka实例重平衡日志功能
     *
     * 开启Kafka实例重平衡日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaRebalanceLogTaskRequest 请求对象
     * @return AsyncInvoker<CreateKafkaRebalanceLogTaskRequest, CreateKafkaRebalanceLogTaskResponse>
     */
    public AsyncInvoker<CreateKafkaRebalanceLogTaskRequest, CreateKafkaRebalanceLogTaskResponse> createKafkaRebalanceLogTaskAsyncInvoker(
        CreateKafkaRebalanceLogTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createKafkaRebalanceLogTask, hcClient);
    }

    /**
     * 创建Topic流控配置
     *
     * 该接口用于向Kafka实例提交创建Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaTopicQuotaRequest 请求对象
     * @return CompletableFuture<CreateKafkaTopicQuotaResponse>
     */
    public CompletableFuture<CreateKafkaTopicQuotaResponse> createKafkaTopicQuotaAsync(
        CreateKafkaTopicQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createKafkaTopicQuota);
    }

    /**
     * 创建Topic流控配置
     *
     * 该接口用于向Kafka实例提交创建Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaTopicQuotaRequest 请求对象
     * @return AsyncInvoker<CreateKafkaTopicQuotaRequest, CreateKafkaTopicQuotaResponse>
     */
    public AsyncInvoker<CreateKafkaTopicQuotaRequest, CreateKafkaTopicQuotaResponse> createKafkaTopicQuotaAsyncInvoker(
        CreateKafkaTopicQuotaRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createKafkaTopicQuota, hcClient);
    }

    /**
     * 创建用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交创建用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaUserClientQuotaTaskRequest 请求对象
     * @return CompletableFuture<CreateKafkaUserClientQuotaTaskResponse>
     */
    public CompletableFuture<CreateKafkaUserClientQuotaTaskResponse> createKafkaUserClientQuotaTaskAsync(
        CreateKafkaUserClientQuotaTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createKafkaUserClientQuotaTask);
    }

    /**
     * 创建用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交创建用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaUserClientQuotaTaskRequest 请求对象
     * @return AsyncInvoker<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse>
     */
    public AsyncInvoker<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse> createKafkaUserClientQuotaTaskAsyncInvoker(
        CreateKafkaUserClientQuotaTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createKafkaUserClientQuotaTask, hcClient);
    }

    /**
     * 创建消息积压诊断任务
     *
     * 创建消息积压诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<CreateMessageDiagnosisTaskResponse>
     */
    public CompletableFuture<CreateMessageDiagnosisTaskResponse> createMessageDiagnosisTaskAsync(
        CreateMessageDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createMessageDiagnosisTask);
    }

    /**
     * 创建消息积压诊断任务
     *
     * 创建消息积压诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<CreateMessageDiagnosisTaskRequest, CreateMessageDiagnosisTaskResponse>
     */
    public AsyncInvoker<CreateMessageDiagnosisTaskRequest, CreateMessageDiagnosisTaskResponse> createMessageDiagnosisTaskAsyncInvoker(
        CreateMessageDiagnosisTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createMessageDiagnosisTask, hcClient);
    }

    /**
     * 新增Kafka实例指定Topic分区
     *
     * 新增Kafka实例指定Topic分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePartitionRequest 请求对象
     * @return CompletableFuture<CreatePartitionResponse>
     */
    public CompletableFuture<CreatePartitionResponse> createPartitionAsync(CreatePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPartition);
    }

    /**
     * 新增Kafka实例指定Topic分区
     *
     * 新增Kafka实例指定Topic分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePartitionRequest 请求对象
     * @return AsyncInvoker<CreatePartitionRequest, CreatePartitionResponse>
     */
    public AsyncInvoker<CreatePartitionRequest, CreatePartitionResponse> createPartitionAsyncInvoker(
        CreatePartitionRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createPartition, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建按需计费类型的Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return CompletableFuture<CreatePostPaidInstanceResponse>
     */
    public CompletableFuture<CreatePostPaidInstanceResponse> createPostPaidInstanceAsync(
        CreatePostPaidInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPostPaidInstance);
    }

    /**
     * 创建实例
     *
     * 创建按需计费类型的Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceAsyncInvoker(
        CreatePostPaidInstanceRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createPostPaidInstance, hcClient);
    }

    /**
     * 创建Kafka实例
     *
     * 创建实例。
     * 
     * [该接口支持创建按需和包周期两种计费方式的实例。](tag:hws,hws_eu,hws_hk,ctc,cmcc,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidKafkaInstanceRequest 请求对象
     * @return CompletableFuture<CreatePostPaidKafkaInstanceResponse>
     */
    public CompletableFuture<CreatePostPaidKafkaInstanceResponse> createPostPaidKafkaInstanceAsync(
        CreatePostPaidKafkaInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPostPaidKafkaInstance);
    }

    /**
     * 创建Kafka实例
     *
     * 创建实例。
     * 
     * [该接口支持创建按需和包周期两种计费方式的实例。](tag:hws,hws_eu,hws_hk,ctc,cmcc,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidKafkaInstanceRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidKafkaInstanceRequest, CreatePostPaidKafkaInstanceResponse>
     */
    public AsyncInvoker<CreatePostPaidKafkaInstanceRequest, CreatePostPaidKafkaInstanceResponse> createPostPaidKafkaInstanceAsyncInvoker(
        CreatePostPaidKafkaInstanceRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createPostPaidKafkaInstance, hcClient);
    }

    /**
     * Kafka实例开始分区平衡任务
     *
     * 该接口用于向Kafka实例提交分区平衡任务或计算分区平衡预估时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReassignmentTaskRequest 请求对象
     * @return CompletableFuture<CreateReassignmentTaskResponse>
     */
    public CompletableFuture<CreateReassignmentTaskResponse> createReassignmentTaskAsync(
        CreateReassignmentTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createReassignmentTask);
    }

    /**
     * Kafka实例开始分区平衡任务
     *
     * 该接口用于向Kafka实例提交分区平衡任务或计算分区平衡预估时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReassignmentTaskRequest 请求对象
     * @return AsyncInvoker<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse>
     */
    public AsyncInvoker<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse> createReassignmentTaskAsyncInvoker(
        CreateReassignmentTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createReassignmentTask, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteBackgroundTask);
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
        return new AsyncInvoker<>(request, KafkaMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除消费组在指定Topic的消费位点
     *
     * 删除消费组在指定Topic的消费位点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupOffsetsRequest 请求对象
     * @return CompletableFuture<DeleteConsumerGroupOffsetsResponse>
     */
    public CompletableFuture<DeleteConsumerGroupOffsetsResponse> deleteConsumerGroupOffsetsAsync(
        DeleteConsumerGroupOffsetsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteConsumerGroupOffsets);
    }

    /**
     * 删除消费组在指定Topic的消费位点
     *
     * 删除消费组在指定Topic的消费位点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupOffsetsRequest 请求对象
     * @return AsyncInvoker<DeleteConsumerGroupOffsetsRequest, DeleteConsumerGroupOffsetsResponse>
     */
    public AsyncInvoker<DeleteConsumerGroupOffsetsRequest, DeleteConsumerGroupOffsetsResponse> deleteConsumerGroupOffsetsAsyncInvoker(
        DeleteConsumerGroupOffsetsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteConsumerGroupOffsets, hcClient);
    }

    /**
     * kafka实例删除指定消费组
     *
     * kafka实例删除指定消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return CompletableFuture<DeleteGroupResponse>
     */
    public CompletableFuture<DeleteGroupResponse> deleteGroupAsync(DeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteGroup);
    }

    /**
     * kafka实例删除指定消费组
     *
     * kafka实例删除指定消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupAsyncInvoker(DeleteGroupRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteGroup, hcClient);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * [注意：调用本接口删除的实例将被彻底删除，不会进入回收站，且删除后不可恢复。若您需要删除的实例进入回收站，请使用[批量重启或删除实例](BatchRestartOrDeleteInstances.xml)。](tag:hws,hws_hk,cmcc,ctc,sbc,hk_sbc,tm,hk_tm,srg)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteInstance);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * [注意：调用本接口删除的实例将被彻底删除，不会进入回收站，且删除后不可恢复。若您需要删除的实例进入回收站，请使用[批量重启或删除实例](BatchRestartOrDeleteInstances.xml)。](tag:hws,hws_hk,cmcc,ctc,sbc,hk_sbc,tm,hk_tm,srg)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteInstance, hcClient);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceConsumerGroupRequest 请求对象
     * @return CompletableFuture<DeleteInstanceConsumerGroupResponse>
     */
    public CompletableFuture<DeleteInstanceConsumerGroupResponse> deleteInstanceConsumerGroupAsync(
        DeleteInstanceConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteInstanceConsumerGroup);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceConsumerGroupRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceConsumerGroupRequest, DeleteInstanceConsumerGroupResponse>
     */
    public AsyncInvoker<DeleteInstanceConsumerGroupRequest, DeleteInstanceConsumerGroupResponse> deleteInstanceConsumerGroupAsyncInvoker(
        DeleteInstanceConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteInstanceConsumerGroup, hcClient);
    }

    /**
     * Kafka删除消息
     *
     * Kafka删除消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaMessageRequest 请求对象
     * @return CompletableFuture<DeleteKafkaMessageResponse>
     */
    public CompletableFuture<DeleteKafkaMessageResponse> deleteKafkaMessageAsync(DeleteKafkaMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteKafkaMessage);
    }

    /**
     * Kafka删除消息
     *
     * Kafka删除消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaMessageRequest 请求对象
     * @return AsyncInvoker<DeleteKafkaMessageRequest, DeleteKafkaMessageResponse>
     */
    public AsyncInvoker<DeleteKafkaMessageRequest, DeleteKafkaMessageResponse> deleteKafkaMessageAsyncInvoker(
        DeleteKafkaMessageRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteKafkaMessage, hcClient);
    }

    /**
     * 删除Kafka消息
     *
     * 删除Kafka消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaTopicMessagesRequest 请求对象
     * @return CompletableFuture<DeleteKafkaTopicMessagesResponse>
     */
    public CompletableFuture<DeleteKafkaTopicMessagesResponse> deleteKafkaTopicMessagesAsync(
        DeleteKafkaTopicMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteKafkaTopicMessages);
    }

    /**
     * 删除Kafka消息
     *
     * 删除Kafka消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaTopicMessagesRequest 请求对象
     * @return AsyncInvoker<DeleteKafkaTopicMessagesRequest, DeleteKafkaTopicMessagesResponse>
     */
    public AsyncInvoker<DeleteKafkaTopicMessagesRequest, DeleteKafkaTopicMessagesResponse> deleteKafkaTopicMessagesAsyncInvoker(
        DeleteKafkaTopicMessagesRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteKafkaTopicMessages, hcClient);
    }

    /**
     * 删除Topic流控配置
     *
     * 该接口用于向Kafka实例提交删除Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaTopicQuotaRequest 请求对象
     * @return CompletableFuture<DeleteKafkaTopicQuotaResponse>
     */
    public CompletableFuture<DeleteKafkaTopicQuotaResponse> deleteKafkaTopicQuotaAsync(
        DeleteKafkaTopicQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteKafkaTopicQuota);
    }

    /**
     * 删除Topic流控配置
     *
     * 该接口用于向Kafka实例提交删除Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaTopicQuotaRequest 请求对象
     * @return AsyncInvoker<DeleteKafkaTopicQuotaRequest, DeleteKafkaTopicQuotaResponse>
     */
    public AsyncInvoker<DeleteKafkaTopicQuotaRequest, DeleteKafkaTopicQuotaResponse> deleteKafkaTopicQuotaAsyncInvoker(
        DeleteKafkaTopicQuotaRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteKafkaTopicQuota, hcClient);
    }

    /**
     * 删除用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交删除用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaUserClientQuotaTaskRequest 请求对象
     * @return CompletableFuture<DeleteKafkaUserClientQuotaTaskResponse>
     */
    public CompletableFuture<DeleteKafkaUserClientQuotaTaskResponse> deleteKafkaUserClientQuotaTaskAsync(
        DeleteKafkaUserClientQuotaTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteKafkaUserClientQuotaTask);
    }

    /**
     * 删除用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交删除用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaUserClientQuotaTaskRequest 请求对象
     * @return AsyncInvoker<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse>
     */
    public AsyncInvoker<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse> deleteKafkaUserClientQuotaTaskAsyncInvoker(
        DeleteKafkaUserClientQuotaTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteKafkaUserClientQuotaTask, hcClient);
    }

    /**
     * 删除指定的定时任务
     *
     * 删除指定的定时任务。仅当定时任务处于执行成功或已取消状态时，方可执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return CompletableFuture<DeleteScheduledTaskResponse>
     */
    public CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTaskAsync(DeleteScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteScheduledTask);
    }

    /**
     * 删除指定的定时任务
     *
     * 删除指定的定时任务。仅当定时任务处于执行成功或已取消状态时，方可执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return AsyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
     */
    public AsyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTaskAsyncInvoker(
        DeleteScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteScheduledTask, hcClient);
    }

    /**
     * 开启Kafka实例域名访问能力
     *
     * 开启Kafka实例域名访问后，客户端可以通过域名连接Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return CompletableFuture<EnableDnsResponse>
     */
    public CompletableFuture<EnableDnsResponse> enableDnsAsync(EnableDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.enableDns);
    }

    /**
     * 开启Kafka实例域名访问能力
     *
     * 开启Kafka实例域名访问后，客户端可以通过域名连接Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return AsyncInvoker<EnableDnsRequest, EnableDnsResponse>
     */
    public AsyncInvoker<EnableDnsRequest, EnableDnsResponse> enableDnsAsyncInvoker(EnableDnsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.enableDns, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listAvailableZones);
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
        return new AsyncInvoker<>(request, KafkaMeta.listAvailableZones, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listBackgroundTasks);
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
        return new AsyncInvoker<>(request, KafkaMeta.listBackgroundTasks, hcClient);
    }

    /**
     * 查询特性开关列表
     *
     * 获取特性开关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigFeaturesRequest 请求对象
     * @return CompletableFuture<ListConfigFeaturesResponse>
     */
    public CompletableFuture<ListConfigFeaturesResponse> listConfigFeaturesAsync(ListConfigFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listConfigFeatures);
    }

    /**
     * 查询特性开关列表
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
        return new AsyncInvoker<>(request, KafkaMeta.listConfigFeatures, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 查询产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return CompletableFuture<ListEngineProductsResponse>
     */
    public CompletableFuture<ListEngineProductsResponse> listEngineProductsAsync(ListEngineProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listEngineProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 查询产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return AsyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse>
     */
    public AsyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProductsAsyncInvoker(
        ListEngineProductsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupRequest 请求对象
     * @return CompletableFuture<ListInstanceConsumerGroupResponse>
     */
    public CompletableFuture<ListInstanceConsumerGroupResponse> listInstanceConsumerGroupAsync(
        ListInstanceConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroup);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupRequest 请求对象
     * @return AsyncInvoker<ListInstanceConsumerGroupRequest, ListInstanceConsumerGroupResponse>
     */
    public AsyncInvoker<ListInstanceConsumerGroupRequest, ListInstanceConsumerGroupResponse> listInstanceConsumerGroupAsyncInvoker(
        ListInstanceConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroup, hcClient);
    }

    /**
     * 查询指定消费组的消费成员
     *
     * 查询指定消费组的消费成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupMembersRequest 请求对象
     * @return CompletableFuture<ListInstanceConsumerGroupMembersResponse>
     */
    public CompletableFuture<ListInstanceConsumerGroupMembersResponse> listInstanceConsumerGroupMembersAsync(
        ListInstanceConsumerGroupMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroupMembers);
    }

    /**
     * 查询指定消费组的消费成员
     *
     * 查询指定消费组的消费成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupMembersRequest 请求对象
     * @return AsyncInvoker<ListInstanceConsumerGroupMembersRequest, ListInstanceConsumerGroupMembersResponse>
     */
    public AsyncInvoker<ListInstanceConsumerGroupMembersRequest, ListInstanceConsumerGroupMembersResponse> listInstanceConsumerGroupMembersAsyncInvoker(
        ListInstanceConsumerGroupMembersRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroupMembers, hcClient);
    }

    /**
     * 查询消费组消息位点
     *
     * 查询消费组消息位点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupMessageOffsetRequest 请求对象
     * @return CompletableFuture<ListInstanceConsumerGroupMessageOffsetResponse>
     */
    public CompletableFuture<ListInstanceConsumerGroupMessageOffsetResponse> listInstanceConsumerGroupMessageOffsetAsync(
        ListInstanceConsumerGroupMessageOffsetRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroupMessageOffset);
    }

    /**
     * 查询消费组消息位点
     *
     * 查询消费组消息位点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupMessageOffsetRequest 请求对象
     * @return AsyncInvoker<ListInstanceConsumerGroupMessageOffsetRequest, ListInstanceConsumerGroupMessageOffsetResponse>
     */
    public AsyncInvoker<ListInstanceConsumerGroupMessageOffsetRequest, ListInstanceConsumerGroupMessageOffsetResponse> listInstanceConsumerGroupMessageOffsetAsyncInvoker(
        ListInstanceConsumerGroupMessageOffsetRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroupMessageOffset, hcClient);
    }

    /**
     * 查询指定消费组的Topic
     *
     * 查询指定消费组的Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupTopicsRequest 请求对象
     * @return CompletableFuture<ListInstanceConsumerGroupTopicsResponse>
     */
    public CompletableFuture<ListInstanceConsumerGroupTopicsResponse> listInstanceConsumerGroupTopicsAsync(
        ListInstanceConsumerGroupTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroupTopics);
    }

    /**
     * 查询指定消费组的Topic
     *
     * 查询指定消费组的Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupTopicsRequest 请求对象
     * @return AsyncInvoker<ListInstanceConsumerGroupTopicsRequest, ListInstanceConsumerGroupTopicsResponse>
     */
    public AsyncInvoker<ListInstanceConsumerGroupTopicsRequest, ListInstanceConsumerGroupTopicsResponse> listInstanceConsumerGroupTopicsAsyncInvoker(
        ListInstanceConsumerGroupTopicsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroupTopics, hcClient);
    }

    /**
     * 查询所有消费组
     *
     * 查询所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return CompletableFuture<ListInstanceConsumerGroupsResponse>
     */
    public CompletableFuture<ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsAsync(
        ListInstanceConsumerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroups);
    }

    /**
     * 查询所有消费组
     *
     * 查询所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return AsyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>
     */
    public AsyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsAsyncInvoker(
        ListInstanceConsumerGroupsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroups, hcClient);
    }

    /**
     * Kafka实例查询Topic
     *
     * 该接口用于查询指定Kafka实例的Topic详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopicsRequest 请求对象
     * @return CompletableFuture<ListInstanceTopicsResponse>
     */
    public CompletableFuture<ListInstanceTopicsResponse> listInstanceTopicsAsync(ListInstanceTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceTopics);
    }

    /**
     * Kafka实例查询Topic
     *
     * 该接口用于查询指定Kafka实例的Topic详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopicsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse>
     */
    public AsyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse> listInstanceTopicsAsyncInvoker(
        ListInstanceTopicsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listInstanceTopics, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstances);
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
        return new AsyncInvoker<>(request, KafkaMeta.listInstances, hcClient);
    }

    /**
     * 查询消息积压诊断报告列表
     *
     * 查询消息积压诊断报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageDiagnosisReportsRequest 请求对象
     * @return CompletableFuture<ListMessageDiagnosisReportsResponse>
     */
    public CompletableFuture<ListMessageDiagnosisReportsResponse> listMessageDiagnosisReportsAsync(
        ListMessageDiagnosisReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listMessageDiagnosisReports);
    }

    /**
     * 查询消息积压诊断报告列表
     *
     * 查询消息积压诊断报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageDiagnosisReportsRequest 请求对象
     * @return AsyncInvoker<ListMessageDiagnosisReportsRequest, ListMessageDiagnosisReportsResponse>
     */
    public AsyncInvoker<ListMessageDiagnosisReportsRequest, ListMessageDiagnosisReportsResponse> listMessageDiagnosisReportsAsyncInvoker(
        ListMessageDiagnosisReportsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listMessageDiagnosisReports, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 在创建kafka实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 
     * 例如，要订购按需计费、基准带宽为100MB的kafka实例，可从接口响应消息中，查找Hourly的消息体，然后找到bandwidth为100MB的记录对应的product_id，该product_id的值即是创建上述kafka实例时需要配置的产品ID。
     * 
     * 同时，unavailable_zones字段表示资源不足的可用区列表，如果为空，则表示所有可用区都有资源，如果不为空，则表示字段值的可用区没有资源。所以必须确保您购买的资源所在的可用区有资源，不在该字段列表内。
     * 
     * [例如，响应消息中bandwidth字段为1200MB的记录，unavailable_zones字段包含cn-east-2b、cn-east-2a和cn-east-2d，表示在华东-上海2的可用区1、可用区2、可用区3都没有该资源。](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 在创建kafka实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 
     * 例如，要订购按需计费、基准带宽为100MB的kafka实例，可从接口响应消息中，查找Hourly的消息体，然后找到bandwidth为100MB的记录对应的product_id，该product_id的值即是创建上述kafka实例时需要配置的产品ID。
     * 
     * 同时，unavailable_zones字段表示资源不足的可用区列表，如果为空，则表示所有可用区都有资源，如果不为空，则表示字段值的可用区没有资源。所以必须确保您购买的资源所在的可用区有资源，不在该字段列表内。
     * 
     * [例如，响应消息中bandwidth字段为1200MB的记录，unavailable_zones字段包含cn-east-2b、cn-east-2a和cn-east-2d，表示在华东-上海2的可用区1、可用区2、可用区3都没有该资源。](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listProducts, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listScheduledTasks);
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
        return new AsyncInvoker<>(request, KafkaMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询Topic的分区列表
     *
     * 查询Topic的分区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicPartitionsRequest 请求对象
     * @return CompletableFuture<ListTopicPartitionsResponse>
     */
    public CompletableFuture<ListTopicPartitionsResponse> listTopicPartitionsAsync(ListTopicPartitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listTopicPartitions);
    }

    /**
     * 查询Topic的分区列表
     *
     * 查询Topic的分区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicPartitionsRequest 请求对象
     * @return AsyncInvoker<ListTopicPartitionsRequest, ListTopicPartitionsResponse>
     */
    public AsyncInvoker<ListTopicPartitionsRequest, ListTopicPartitionsResponse> listTopicPartitionsAsyncInvoker(
        ListTopicPartitionsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listTopicPartitions, hcClient);
    }

    /**
     * 查询Topic的当前生产者列表
     *
     * 查询Topic的当前生产者列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicProducersRequest 请求对象
     * @return CompletableFuture<ListTopicProducersResponse>
     */
    public CompletableFuture<ListTopicProducersResponse> listTopicProducersAsync(ListTopicProducersRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listTopicProducers);
    }

    /**
     * 查询Topic的当前生产者列表
     *
     * 查询Topic的当前生产者列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicProducersRequest 请求对象
     * @return AsyncInvoker<ListTopicProducersRequest, ListTopicProducersResponse>
     */
    public AsyncInvoker<ListTopicProducersRequest, ListTopicProducersResponse> listTopicProducersAsyncInvoker(
        ListTopicProducersRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listTopicProducers, hcClient);
    }

    /**
     * 查询用户策略
     *
     * 查询用户策略。
     * 
     * Kafka实例开启SASL功能后，才支持查询用户策略功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPoliciesRequest 请求对象
     * @return CompletableFuture<ListUserPoliciesResponse>
     */
    public CompletableFuture<ListUserPoliciesResponse> listUserPoliciesAsync(ListUserPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listUserPolicies);
    }

    /**
     * 查询用户策略
     *
     * 查询用户策略。
     * 
     * Kafka实例开启SASL功能后，才支持查询用户策略功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPoliciesRequest 请求对象
     * @return AsyncInvoker<ListUserPoliciesRequest, ListUserPoliciesResponse>
     */
    public AsyncInvoker<ListUserPoliciesRequest, ListUserPoliciesResponse> listUserPoliciesAsyncInvoker(
        ListUserPoliciesRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listUserPolicies, hcClient);
    }

    /**
     * 修改实例配置
     *
     * 修改实例配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceConfigsRequest 请求对象
     * @return CompletableFuture<ModifyInstanceConfigsResponse>
     */
    public CompletableFuture<ModifyInstanceConfigsResponse> modifyInstanceConfigsAsync(
        ModifyInstanceConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.modifyInstanceConfigs);
    }

    /**
     * 修改实例配置
     *
     * 修改实例配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceConfigsRequest 请求对象
     * @return AsyncInvoker<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse>
     */
    public AsyncInvoker<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse> modifyInstanceConfigsAsyncInvoker(
        ModifyInstanceConfigsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.modifyInstanceConfigs, hcClient);
    }

    /**
     * 开启或者关闭Kafka实例公网访问功能
     *
     * 开启或者关闭Kafka实例公网访问功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyKafkaPublicIpAccessSwitchRequest 请求对象
     * @return CompletableFuture<ModifyKafkaPublicIpAccessSwitchResponse>
     */
    public CompletableFuture<ModifyKafkaPublicIpAccessSwitchResponse> modifyKafkaPublicIpAccessSwitchAsync(
        ModifyKafkaPublicIpAccessSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.modifyKafkaPublicIpAccessSwitch);
    }

    /**
     * 开启或者关闭Kafka实例公网访问功能
     *
     * 开启或者关闭Kafka实例公网访问功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyKafkaPublicIpAccessSwitchRequest 请求对象
     * @return AsyncInvoker<ModifyKafkaPublicIpAccessSwitchRequest, ModifyKafkaPublicIpAccessSwitchResponse>
     */
    public AsyncInvoker<ModifyKafkaPublicIpAccessSwitchRequest, ModifyKafkaPublicIpAccessSwitchResponse> modifyKafkaPublicIpAccessSwitchAsyncInvoker(
        ModifyKafkaPublicIpAccessSwitchRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.modifyKafkaPublicIpAccessSwitch, hcClient);
    }

    /**
     * 修改Topic流控配置
     *
     * 该接口用于向Kafka实例提交修改Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyKafkaTopicQuotaRequest 请求对象
     * @return CompletableFuture<ModifyKafkaTopicQuotaResponse>
     */
    public CompletableFuture<ModifyKafkaTopicQuotaResponse> modifyKafkaTopicQuotaAsync(
        ModifyKafkaTopicQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.modifyKafkaTopicQuota);
    }

    /**
     * 修改Topic流控配置
     *
     * 该接口用于向Kafka实例提交修改Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyKafkaTopicQuotaRequest 请求对象
     * @return AsyncInvoker<ModifyKafkaTopicQuotaRequest, ModifyKafkaTopicQuotaResponse>
     */
    public AsyncInvoker<ModifyKafkaTopicQuotaRequest, ModifyKafkaTopicQuotaResponse> modifyKafkaTopicQuotaAsyncInvoker(
        ModifyKafkaTopicQuotaRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.modifyKafkaTopicQuota, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.modifyRecyclePolicy);
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
        return new AsyncInvoker<>(request, KafkaMeta.modifyRecyclePolicy, hcClient);
    }

    /**
     * 重置Manager密码
     *
     * 重置Manager密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetManagerPasswordRequest 请求对象
     * @return CompletableFuture<ResetManagerPasswordResponse>
     */
    public CompletableFuture<ResetManagerPasswordResponse> resetManagerPasswordAsync(
        ResetManagerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetManagerPassword);
    }

    /**
     * 重置Manager密码
     *
     * 重置Manager密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetManagerPasswordRequest 请求对象
     * @return AsyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse>
     */
    public AsyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse> resetManagerPasswordAsyncInvoker(
        ResetManagerPasswordRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resetManagerPassword, hcClient);
    }

    /**
     * 重置消费组消费进度到指定位置
     *
     * Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。
     * 
     * 停止待重置消费组客户端，然后等待一段时间（即ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间，默认为1000毫秒）后，服务端才认为此消费组客户端已下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetMessageOffsetRequest 请求对象
     * @return CompletableFuture<ResetMessageOffsetResponse>
     */
    public CompletableFuture<ResetMessageOffsetResponse> resetMessageOffsetAsync(ResetMessageOffsetRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetMessageOffset);
    }

    /**
     * 重置消费组消费进度到指定位置
     *
     * Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。
     * 
     * 停止待重置消费组客户端，然后等待一段时间（即ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间，默认为1000毫秒）后，服务端才认为此消费组客户端已下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetMessageOffsetRequest 请求对象
     * @return AsyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse>
     */
    public AsyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse> resetMessageOffsetAsyncInvoker(
        ResetMessageOffsetRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resetMessageOffset, hcClient);
    }

    /**
     * 重置消费组消费进度到指定位置
     *
     * Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。
     * 
     * 停止待重置消费组客户端，然后等待一段时间（即ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间，默认为1000毫秒）后，服务端才认为此消费组客户端已下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetMessageOffsetWithEngineRequest 请求对象
     * @return CompletableFuture<ResetMessageOffsetWithEngineResponse>
     */
    public CompletableFuture<ResetMessageOffsetWithEngineResponse> resetMessageOffsetWithEngineAsync(
        ResetMessageOffsetWithEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetMessageOffsetWithEngine);
    }

    /**
     * 重置消费组消费进度到指定位置
     *
     * Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。
     * 
     * 停止待重置消费组客户端，然后等待一段时间（即ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间，默认为1000毫秒）后，服务端才认为此消费组客户端已下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetMessageOffsetWithEngineRequest 请求对象
     * @return AsyncInvoker<ResetMessageOffsetWithEngineRequest, ResetMessageOffsetWithEngineResponse>
     */
    public AsyncInvoker<ResetMessageOffsetWithEngineRequest, ResetMessageOffsetWithEngineResponse> resetMessageOffsetWithEngineAsyncInvoker(
        ResetMessageOffsetWithEngineRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resetMessageOffsetWithEngine, hcClient);
    }

    /**
     * 重置密码
     *
     * 重置密码（只针对开通SSL的实例）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 重置密码（只针对开通SSL的实例）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resetPassword, hcClient);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswrodRequest 请求对象
     * @return CompletableFuture<ResetUserPasswrodResponse>
     */
    public CompletableFuture<ResetUserPasswrodResponse> resetUserPasswrodAsync(ResetUserPasswrodRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetUserPasswrod);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswrodRequest 请求对象
     * @return AsyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse>
     */
    public AsyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse> resetUserPasswrodAsyncInvoker(
        ResetUserPasswrodRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resetUserPasswrod, hcClient);
    }

    /**
     * 实例扩容
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineInstanceRequest 请求对象
     * @return CompletableFuture<ResizeEngineInstanceResponse>
     */
    public CompletableFuture<ResizeEngineInstanceResponse> resizeEngineInstanceAsync(
        ResizeEngineInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resizeEngineInstance);
    }

    /**
     * 实例扩容
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse>
     */
    public AsyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstanceAsyncInvoker(
        ResizeEngineInstanceRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resizeEngineInstance, hcClient);
    }

    /**
     * 实例扩容
     *
     * 实例扩容。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resizeInstance);
    }

    /**
     * 实例扩容
     *
     * 实例扩容。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resizeInstance, hcClient);
    }

    /**
     * 实例扩容
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeKafkaInstanceRequest 请求对象
     * @return CompletableFuture<ResizeKafkaInstanceResponse>
     */
    public CompletableFuture<ResizeKafkaInstanceResponse> resizeKafkaInstanceAsync(ResizeKafkaInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resizeKafkaInstance);
    }

    /**
     * 实例扩容
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeKafkaInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeKafkaInstanceRequest, ResizeKafkaInstanceResponse>
     */
    public AsyncInvoker<ResizeKafkaInstanceRequest, ResizeKafkaInstanceResponse> resizeKafkaInstanceAsyncInvoker(
        ResizeKafkaInstanceRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resizeKafkaInstance, hcClient);
    }

    /**
     * 重启Manager
     *
     * 重启Manager。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartManagerRequest 请求对象
     * @return CompletableFuture<RestartManagerResponse>
     */
    public CompletableFuture<RestartManagerResponse> restartManagerAsync(RestartManagerRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.restartManager);
    }

    /**
     * 重启Manager
     *
     * 重启Manager。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartManagerRequest 请求对象
     * @return AsyncInvoker<RestartManagerRequest, RestartManagerResponse>
     */
    public AsyncInvoker<RestartManagerRequest, RestartManagerResponse> restartManagerAsyncInvoker(
        RestartManagerRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.restartManager, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.restoreRecycleInstance);
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
        return new AsyncInvoker<>(request, KafkaMeta.restoreRecycleInstance, hcClient);
    }

    /**
     * Kafka生产消息
     *
     * 在控制台发送指定消息到Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendKafkaMessageRequest 请求对象
     * @return CompletableFuture<SendKafkaMessageResponse>
     */
    public CompletableFuture<SendKafkaMessageResponse> sendKafkaMessageAsync(SendKafkaMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.sendKafkaMessage);
    }

    /**
     * Kafka生产消息
     *
     * 在控制台发送指定消息到Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendKafkaMessageRequest 请求对象
     * @return AsyncInvoker<SendKafkaMessageRequest, SendKafkaMessageResponse>
     */
    public AsyncInvoker<SendKafkaMessageRequest, SendKafkaMessageResponse> sendKafkaMessageAsyncInvoker(
        SendKafkaMessageRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.sendKafkaMessage, hcClient);
    }

    /**
     * 创建/删除用户策略
     *
     * 创建/删除用户策略。
     * 
     * Kafka实例开启SASL功能后，才支持创建/删除用户策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserPoliciesRequest 请求对象
     * @return CompletableFuture<SetUserPoliciesResponse>
     */
    public CompletableFuture<SetUserPoliciesResponse> setUserPoliciesAsync(SetUserPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.setUserPolicies);
    }

    /**
     * 创建/删除用户策略
     *
     * 创建/删除用户策略。
     * 
     * Kafka实例开启SASL功能后，才支持创建/删除用户策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserPoliciesRequest 请求对象
     * @return AsyncInvoker<SetUserPoliciesRequest, SetUserPoliciesResponse>
     */
    public AsyncInvoker<SetUserPoliciesRequest, SetUserPoliciesResponse> setUserPoliciesAsyncInvoker(
        SetUserPoliciesRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.setUserPolicies, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showBackgroundTask);
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
        return new AsyncInvoker<>(request, KafkaMeta.showBackgroundTask, hcClient);
    }

    /**
     * 查询后台任务中的指定实例的变更进度
     *
     * 查询后台任务中的指定实例的变更进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return CompletableFuture<ShowBackgroundTaskProgressResponse>
     */
    public CompletableFuture<ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressAsync(
        ShowBackgroundTaskProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showBackgroundTaskProgress);
    }

    /**
     * 查询后台任务中的指定实例的变更进度
     *
     * 查询后台任务中的指定实例的变更进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return AsyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse>
     */
    public AsyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressAsyncInvoker(
        ShowBackgroundTaskProgressRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showBackgroundTaskProgress, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCesHierarchy);
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
        return new AsyncInvoker<>(request, KafkaMeta.showCesHierarchy, hcClient);
    }

    /**
     * 查询Kafka集群元数据信息
     *
     * 查询Kafka集群元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return CompletableFuture<ShowClusterResponse>
     */
    public CompletableFuture<ShowClusterResponse> showClusterAsync(ShowClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCluster);
    }

    /**
     * 查询Kafka集群元数据信息
     *
     * 查询Kafka集群元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return AsyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public AsyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterAsyncInvoker(ShowClusterRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showCluster, hcClient);
    }

    /**
     * 查询Kafka实例的协调器信息
     *
     * 查询Kafka实例的协调器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCoordinatorsRequest 请求对象
     * @return CompletableFuture<ShowCoordinatorsResponse>
     */
    public CompletableFuture<ShowCoordinatorsResponse> showCoordinatorsAsync(ShowCoordinatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCoordinators);
    }

    /**
     * 查询Kafka实例的协调器信息
     *
     * 查询Kafka实例的协调器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCoordinatorsRequest 请求对象
     * @return AsyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse>
     */
    public AsyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse> showCoordinatorsAsyncInvoker(
        ShowCoordinatorsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showCoordinators, hcClient);
    }

    /**
     * 消息积压诊断预检查
     *
     * 消息积压诊断预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisPreCheckRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisPreCheckResponse>
     */
    public CompletableFuture<ShowDiagnosisPreCheckResponse> showDiagnosisPreCheckAsync(
        ShowDiagnosisPreCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showDiagnosisPreCheck);
    }

    /**
     * 消息积压诊断预检查
     *
     * 消息积压诊断预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisPreCheckRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisPreCheckRequest, ShowDiagnosisPreCheckResponse>
     */
    public AsyncInvoker<ShowDiagnosisPreCheckRequest, ShowDiagnosisPreCheckResponse> showDiagnosisPreCheckAsyncInvoker(
        ShowDiagnosisPreCheckRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showDiagnosisPreCheck, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showEngineInstanceExtendProductInfo);
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
        return new AsyncInvoker<>(request, KafkaMeta.showEngineInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询指定消费组信息
     *
     * 查询指定消费组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return CompletableFuture<ShowGroupResponse>
     */
    public CompletableFuture<ShowGroupResponse> showGroupAsync(ShowGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showGroup);
    }

    /**
     * 查询指定消费组信息
     *
     * 查询指定消费组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return AsyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public AsyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupAsyncInvoker(ShowGroupRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showGroup, hcClient);
    }

    /**
     * 查询消费组信息
     *
     * 查询消费组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsRequest 请求对象
     * @return CompletableFuture<ShowGroupsResponse>
     */
    public CompletableFuture<ShowGroupsResponse> showGroupsAsync(ShowGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showGroups);
    }

    /**
     * 查询消费组信息
     *
     * 查询消费组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsRequest 请求对象
     * @return AsyncInvoker<ShowGroupsRequest, ShowGroupsResponse>
     */
    public AsyncInvoker<ShowGroupsRequest, ShowGroupsResponse> showGroupsAsyncInvoker(ShowGroupsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showGroups, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstance);
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
        return new AsyncInvoker<>(request, KafkaMeta.showInstance, hcClient);
    }

    /**
     * 获取实例配置
     *
     * 获取实例配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigsRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigsResponse>
     */
    public CompletableFuture<ShowInstanceConfigsResponse> showInstanceConfigsAsync(ShowInstanceConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceConfigs);
    }

    /**
     * 获取实例配置
     *
     * 获取实例配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigsRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse>
     */
    public AsyncInvoker<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse> showInstanceConfigsAsyncInvoker(
        ShowInstanceConfigsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showInstanceConfigs, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceExtendProductInfoResponse>
     */
    public CompletableFuture<ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsync(
        ShowInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceExtendProductInfo);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceExtendProductInfoRequest 请求对象
     * @return AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>
     */
    public AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsyncInvoker(
        ShowInstanceExtendProductInfoRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询消息
     *
     * Kafka实例支持两种消息查询方式，具体查询范围及结果如下：
     * - 按创建时间查询：若已知消息的创建时间段，可通过该方式查询，将返回消息列表及对应偏移量，但不包含消息具体内容。
     * - 按偏移量查询：若已知目标消息所属Topic的分区及具体偏移量，可通过该方式查询，将返回消息列表及完整的消息内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMessagesRequest 请求对象
     * @return CompletableFuture<ShowInstanceMessagesResponse>
     */
    public CompletableFuture<ShowInstanceMessagesResponse> showInstanceMessagesAsync(
        ShowInstanceMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceMessages);
    }

    /**
     * 查询消息
     *
     * Kafka实例支持两种消息查询方式，具体查询范围及结果如下：
     * - 按创建时间查询：若已知消息的创建时间段，可通过该方式查询，将返回消息列表及对应偏移量，但不包含消息具体内容。
     * - 按偏移量查询：若已知目标消息所属Topic的分区及具体偏移量，可通过该方式查询，将返回消息列表及完整的消息内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMessagesRequest 请求对象
     * @return AsyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse>
     */
    public AsyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> showInstanceMessagesAsyncInvoker(
        ShowInstanceMessagesRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showInstanceMessages, hcClient);
    }

    /**
     * 查询Kafka实例Topic详细信息
     *
     * 查询Kafka实例Topic详细信息。(单个实例调用不要超过1s一次)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTopicDetailRequest 请求对象
     * @return CompletableFuture<ShowInstanceTopicDetailResponse>
     */
    public CompletableFuture<ShowInstanceTopicDetailResponse> showInstanceTopicDetailAsync(
        ShowInstanceTopicDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceTopicDetail);
    }

    /**
     * 查询Kafka实例Topic详细信息
     *
     * 查询Kafka实例Topic详细信息。(单个实例调用不要超过1s一次)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTopicDetailRequest 请求对象
     * @return AsyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse>
     */
    public AsyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> showInstanceTopicDetailAsyncInvoker(
        ShowInstanceTopicDetailRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showInstanceTopicDetail, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Kafka实例开启SASL功能时，才支持多用户管理的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceUsersRequest 请求对象
     * @return CompletableFuture<ShowInstanceUsersResponse>
     */
    public CompletableFuture<ShowInstanceUsersResponse> showInstanceUsersAsync(ShowInstanceUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceUsers);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Kafka实例开启SASL功能时，才支持多用户管理的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceUsersRequest 请求对象
     * @return AsyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse>
     */
    public AsyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse> showInstanceUsersAsyncInvoker(
        ShowInstanceUsersRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showInstanceUsers, hcClient);
    }

    /**
     * 查询Kafka集群信息
     *
     * 查询Kafka集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaClusterRequest 请求对象
     * @return CompletableFuture<ShowKafkaClusterResponse>
     */
    public CompletableFuture<ShowKafkaClusterResponse> showKafkaClusterAsync(ShowKafkaClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaCluster);
    }

    /**
     * 查询Kafka集群信息
     *
     * 查询Kafka集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaClusterRequest 请求对象
     * @return AsyncInvoker<ShowKafkaClusterRequest, ShowKafkaClusterResponse>
     */
    public AsyncInvoker<ShowKafkaClusterRequest, ShowKafkaClusterResponse> showKafkaClusterAsyncInvoker(
        ShowKafkaClusterRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaCluster, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowKafkaInstanceExtendProductInfoResponse>
     */
    public CompletableFuture<ShowKafkaInstanceExtendProductInfoResponse> showKafkaInstanceExtendProductInfoAsync(
        ShowKafkaInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaInstanceExtendProductInfo);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaInstanceExtendProductInfoRequest 请求对象
     * @return AsyncInvoker<ShowKafkaInstanceExtendProductInfoRequest, ShowKafkaInstanceExtendProductInfoResponse>
     */
    public AsyncInvoker<ShowKafkaInstanceExtendProductInfoRequest, ShowKafkaInstanceExtendProductInfoResponse> showKafkaInstanceExtendProductInfoAsyncInvoker(
        ShowKafkaInstanceExtendProductInfoRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询Kafka产品规格核数
     *
     * 查询Kafka产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaProductCoresRequest 请求对象
     * @return CompletableFuture<ShowKafkaProductCoresResponse>
     */
    public CompletableFuture<ShowKafkaProductCoresResponse> showKafkaProductCoresAsync(
        ShowKafkaProductCoresRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaProductCores);
    }

    /**
     * 查询Kafka产品规格核数
     *
     * 查询Kafka产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaProductCoresRequest 请求对象
     * @return AsyncInvoker<ShowKafkaProductCoresRequest, ShowKafkaProductCoresResponse>
     */
    public AsyncInvoker<ShowKafkaProductCoresRequest, ShowKafkaProductCoresResponse> showKafkaProductCoresAsyncInvoker(
        ShowKafkaProductCoresRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaProductCores, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaProjectTagsRequest 请求对象
     * @return CompletableFuture<ShowKafkaProjectTagsResponse>
     */
    public CompletableFuture<ShowKafkaProjectTagsResponse> showKafkaProjectTagsAsync(
        ShowKafkaProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaProjectTagsRequest 请求对象
     * @return AsyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse>
     */
    public AsyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> showKafkaProjectTagsAsyncInvoker(
        ShowKafkaProjectTagsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaProjectTags, hcClient);
    }

    /**
     * 查询Kafka实例重平衡日志详情
     *
     * 查询Kafka实例重平衡日志详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaRebalanceLogRequest 请求对象
     * @return CompletableFuture<ShowKafkaRebalanceLogResponse>
     */
    public CompletableFuture<ShowKafkaRebalanceLogResponse> showKafkaRebalanceLogAsync(
        ShowKafkaRebalanceLogRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaRebalanceLog);
    }

    /**
     * 查询Kafka实例重平衡日志详情
     *
     * 查询Kafka实例重平衡日志详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaRebalanceLogRequest 请求对象
     * @return AsyncInvoker<ShowKafkaRebalanceLogRequest, ShowKafkaRebalanceLogResponse>
     */
    public AsyncInvoker<ShowKafkaRebalanceLogRequest, ShowKafkaRebalanceLogResponse> showKafkaRebalanceLogAsyncInvoker(
        ShowKafkaRebalanceLogRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaRebalanceLog, hcClient);
    }

    /**
     * 获取Kafka实例扩容前置检查信息
     *
     * 获取Kafka实例扩容前置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaScalePreCheckInfoRequest 请求对象
     * @return CompletableFuture<ShowKafkaScalePreCheckInfoResponse>
     */
    public CompletableFuture<ShowKafkaScalePreCheckInfoResponse> showKafkaScalePreCheckInfoAsync(
        ShowKafkaScalePreCheckInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaScalePreCheckInfo);
    }

    /**
     * 获取Kafka实例扩容前置检查信息
     *
     * 获取Kafka实例扩容前置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaScalePreCheckInfoRequest 请求对象
     * @return AsyncInvoker<ShowKafkaScalePreCheckInfoRequest, ShowKafkaScalePreCheckInfoResponse>
     */
    public AsyncInvoker<ShowKafkaScalePreCheckInfoRequest, ShowKafkaScalePreCheckInfoResponse> showKafkaScalePreCheckInfoAsyncInvoker(
        ShowKafkaScalePreCheckInfoRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaScalePreCheckInfo, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTagsRequest 请求对象
     * @return CompletableFuture<ShowKafkaTagsResponse>
     */
    public CompletableFuture<ShowKafkaTagsResponse> showKafkaTagsAsync(ShowKafkaTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTagsRequest 请求对象
     * @return AsyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse>
     */
    public AsyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse> showKafkaTagsAsyncInvoker(
        ShowKafkaTagsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaTags, hcClient);
    }

    /**
     * 获取Kafka Topic详细信息
     *
     * 获取Kafka Topic详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicDetailRequest 请求对象
     * @return CompletableFuture<ShowKafkaTopicDetailResponse>
     */
    public CompletableFuture<ShowKafkaTopicDetailResponse> showKafkaTopicDetailAsync(
        ShowKafkaTopicDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaTopicDetail);
    }

    /**
     * 获取Kafka Topic详细信息
     *
     * 获取Kafka Topic详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicDetailRequest 请求对象
     * @return AsyncInvoker<ShowKafkaTopicDetailRequest, ShowKafkaTopicDetailResponse>
     */
    public AsyncInvoker<ShowKafkaTopicDetailRequest, ShowKafkaTopicDetailResponse> showKafkaTopicDetailAsyncInvoker(
        ShowKafkaTopicDetailRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaTopicDetail, hcClient);
    }

    /**
     * 查询Topic的磁盘存储情况
     *
     * 查询Topic在Broker上磁盘占用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicPartitionDiskusageRequest 请求对象
     * @return CompletableFuture<ShowKafkaTopicPartitionDiskusageResponse>
     */
    public CompletableFuture<ShowKafkaTopicPartitionDiskusageResponse> showKafkaTopicPartitionDiskusageAsync(
        ShowKafkaTopicPartitionDiskusageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaTopicPartitionDiskusage);
    }

    /**
     * 查询Topic的磁盘存储情况
     *
     * 查询Topic在Broker上磁盘占用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicPartitionDiskusageRequest 请求对象
     * @return AsyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse>
     */
    public AsyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> showKafkaTopicPartitionDiskusageAsyncInvoker(
        ShowKafkaTopicPartitionDiskusageRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaTopicPartitionDiskusage, hcClient);
    }

    /**
     * 查询Topic流控配置
     *
     * 该接口用于查询Topic级别的流控任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicQuotaRequest 请求对象
     * @return CompletableFuture<ShowKafkaTopicQuotaResponse>
     */
    public CompletableFuture<ShowKafkaTopicQuotaResponse> showKafkaTopicQuotaAsync(ShowKafkaTopicQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaTopicQuota);
    }

    /**
     * 查询Topic流控配置
     *
     * 该接口用于查询Topic级别的流控任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicQuotaRequest 请求对象
     * @return AsyncInvoker<ShowKafkaTopicQuotaRequest, ShowKafkaTopicQuotaResponse>
     */
    public AsyncInvoker<ShowKafkaTopicQuotaRequest, ShowKafkaTopicQuotaResponse> showKafkaTopicQuotaAsyncInvoker(
        ShowKafkaTopicQuotaRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaTopicQuota, hcClient);
    }

    /**
     * 查询用户/客户端流控配置
     *
     * 该接口用于向Kafka实例查询流控的配置，若成功则返回流控配置的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaUserClientQuotaRequest 请求对象
     * @return CompletableFuture<ShowKafkaUserClientQuotaResponse>
     */
    public CompletableFuture<ShowKafkaUserClientQuotaResponse> showKafkaUserClientQuotaAsync(
        ShowKafkaUserClientQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaUserClientQuota);
    }

    /**
     * 查询用户/客户端流控配置
     *
     * 该接口用于向Kafka实例查询流控的配置，若成功则返回流控配置的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaUserClientQuotaRequest 请求对象
     * @return AsyncInvoker<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse>
     */
    public AsyncInvoker<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse> showKafkaUserClientQuotaAsyncInvoker(
        ShowKafkaUserClientQuotaRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showKafkaUserClientQuota, hcClient);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMaintainWindowsRequest 请求对象
     * @return CompletableFuture<ShowMaintainWindowsResponse>
     */
    public CompletableFuture<ShowMaintainWindowsResponse> showMaintainWindowsAsync(ShowMaintainWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMaintainWindows);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMaintainWindowsRequest 请求对象
     * @return AsyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse>
     */
    public AsyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindowsAsyncInvoker(
        ShowMaintainWindowsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showMaintainWindows, hcClient);
    }

    /**
     * 查询诊断报告详情
     *
     * 查询诊断报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageDiagnosisReportRequest 请求对象
     * @return CompletableFuture<ShowMessageDiagnosisReportResponse>
     */
    public CompletableFuture<ShowMessageDiagnosisReportResponse> showMessageDiagnosisReportAsync(
        ShowMessageDiagnosisReportRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMessageDiagnosisReport);
    }

    /**
     * 查询诊断报告详情
     *
     * 查询诊断报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageDiagnosisReportRequest 请求对象
     * @return AsyncInvoker<ShowMessageDiagnosisReportRequest, ShowMessageDiagnosisReportResponse>
     */
    public AsyncInvoker<ShowMessageDiagnosisReportRequest, ShowMessageDiagnosisReportResponse> showMessageDiagnosisReportAsyncInvoker(
        ShowMessageDiagnosisReportRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showMessageDiagnosisReport, hcClient);
    }

    /**
     * 查询分区指定时间段的消息
     *
     * 查询分区指定时间段的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessagesRequest 请求对象
     * @return CompletableFuture<ShowMessagesResponse>
     */
    public CompletableFuture<ShowMessagesResponse> showMessagesAsync(ShowMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMessages);
    }

    /**
     * 查询分区指定时间段的消息
     *
     * 查询分区指定时间段的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessagesRequest 请求对象
     * @return AsyncInvoker<ShowMessagesRequest, ShowMessagesResponse>
     */
    public AsyncInvoker<ShowMessagesRequest, ShowMessagesResponse> showMessagesAsyncInvoker(
        ShowMessagesRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showMessages, hcClient);
    }

    /**
     * 查询分区最早消息的位置
     *
     * 查询分区最早消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionBeginningMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionBeginningMessageResponse>
     */
    public CompletableFuture<ShowPartitionBeginningMessageResponse> showPartitionBeginningMessageAsync(
        ShowPartitionBeginningMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionBeginningMessage);
    }

    /**
     * 查询分区最早消息的位置
     *
     * 查询分区最早消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionBeginningMessageRequest 请求对象
     * @return AsyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse>
     */
    public AsyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> showPartitionBeginningMessageAsyncInvoker(
        ShowPartitionBeginningMessageRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showPartitionBeginningMessage, hcClient);
    }

    /**
     * 查询分区最新消息的位置
     *
     * 查询分区最新消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionEndMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionEndMessageResponse>
     */
    public CompletableFuture<ShowPartitionEndMessageResponse> showPartitionEndMessageAsync(
        ShowPartitionEndMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionEndMessage);
    }

    /**
     * 查询分区最新消息的位置
     *
     * 查询分区最新消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionEndMessageRequest 请求对象
     * @return AsyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse>
     */
    public AsyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> showPartitionEndMessageAsyncInvoker(
        ShowPartitionEndMessageRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showPartitionEndMessage, hcClient);
    }

    /**
     * 查询分区指定偏移量的消息
     *
     * 查询分区指定偏移量的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionMessageResponse>
     */
    public CompletableFuture<ShowPartitionMessageResponse> showPartitionMessageAsync(
        ShowPartitionMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionMessage);
    }

    /**
     * 查询分区指定偏移量的消息
     *
     * 查询分区指定偏移量的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionMessageRequest 请求对象
     * @return AsyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse>
     */
    public AsyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse> showPartitionMessageAsyncInvoker(
        ShowPartitionMessageRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showPartitionMessage, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showQuotas);
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
        return new AsyncInvoker<>(request, KafkaMeta.showQuotas, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showRecycleInstances);
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
        return new AsyncInvoker<>(request, KafkaMeta.showRecycleInstances, hcClient);
    }

    /**
     * 查询旧规格升级新规格映射
     *
     * 查询旧规格实例可升级的新规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecConvertProductRequest 请求对象
     * @return CompletableFuture<ShowSpecConvertProductResponse>
     */
    public CompletableFuture<ShowSpecConvertProductResponse> showSpecConvertProductAsync(
        ShowSpecConvertProductRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showSpecConvertProduct);
    }

    /**
     * 查询旧规格升级新规格映射
     *
     * 查询旧规格实例可升级的新规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecConvertProductRequest 请求对象
     * @return AsyncInvoker<ShowSpecConvertProductRequest, ShowSpecConvertProductResponse>
     */
    public AsyncInvoker<ShowSpecConvertProductRequest, ShowSpecConvertProductResponse> showSpecConvertProductAsyncInvoker(
        ShowSpecConvertProductRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showSpecConvertProduct, hcClient);
    }

    /**
     * 查询用户权限
     *
     * 查询用户权限。
     * 
     * Kafka实例开启SASL功能时，才支持多用户管理的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<ShowTopicAccessPolicyResponse>
     */
    public CompletableFuture<ShowTopicAccessPolicyResponse> showTopicAccessPolicyAsync(
        ShowTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showTopicAccessPolicy);
    }

    /**
     * 查询用户权限
     *
     * 查询用户权限。
     * 
     * Kafka实例开启SASL功能时，才支持多用户管理的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicAccessPolicyRequest 请求对象
     * @return AsyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse>
     */
    public AsyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> showTopicAccessPolicyAsyncInvoker(
        ShowTopicAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showTopicAccessPolicy, hcClient);
    }

    /**
     * 查询Kafka实例版本信息
     *
     * 查询Kafka实例版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeInstanceVersionRequest 请求对象
     * @return CompletableFuture<ShowUpgradeInstanceVersionResponse>
     */
    public CompletableFuture<ShowUpgradeInstanceVersionResponse> showUpgradeInstanceVersionAsync(
        ShowUpgradeInstanceVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showUpgradeInstanceVersion);
    }

    /**
     * 查询Kafka实例版本信息
     *
     * 查询Kafka实例版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeInstanceVersionRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeInstanceVersionRequest, ShowUpgradeInstanceVersionResponse>
     */
    public AsyncInvoker<ShowUpgradeInstanceVersionRequest, ShowUpgradeInstanceVersionResponse> showUpgradeInstanceVersionAsyncInvoker(
        ShowUpgradeInstanceVersionRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showUpgradeInstanceVersion, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showVolumeExpandConfig);
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
        return new AsyncInvoker<>(request, KafkaMeta.showVolumeExpandConfig, hcClient);
    }

    /**
     * 关闭Kafka实例重平衡日志功能
     *
     * 关闭Kafka实例重平衡日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopKafkaRebalanceLogTaskRequest 请求对象
     * @return CompletableFuture<StopKafkaRebalanceLogTaskResponse>
     */
    public CompletableFuture<StopKafkaRebalanceLogTaskResponse> stopKafkaRebalanceLogTaskAsync(
        StopKafkaRebalanceLogTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.stopKafkaRebalanceLogTask);
    }

    /**
     * 关闭Kafka实例重平衡日志功能
     *
     * 关闭Kafka实例重平衡日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopKafkaRebalanceLogTaskRequest 请求对象
     * @return AsyncInvoker<StopKafkaRebalanceLogTaskRequest, StopKafkaRebalanceLogTaskResponse>
     */
    public AsyncInvoker<StopKafkaRebalanceLogTaskRequest, StopKafkaRebalanceLogTaskResponse> stopKafkaRebalanceLogTaskAsyncInvoker(
        StopKafkaRebalanceLogTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.stopKafkaRebalanceLogTask, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateInstance, hcClient);
    }

    /**
     * 开启或关闭实例自动创建Topic功能
     *
     * 开启或关闭实例自动创建Topic功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return CompletableFuture<UpdateInstanceAutoCreateTopicResponse>
     */
    public CompletableFuture<UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopicAsync(
        UpdateInstanceAutoCreateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceAutoCreateTopic);
    }

    /**
     * 开启或关闭实例自动创建Topic功能
     *
     * 开启或关闭实例自动创建Topic功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse>
     */
    public AsyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopicAsyncInvoker(
        UpdateInstanceAutoCreateTopicRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateInstanceAutoCreateTopic, hcClient);
    }

    /**
     * 修改指定消费组
     *
     * 修改指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConsumerGroupRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConsumerGroupResponse>
     */
    public CompletableFuture<UpdateInstanceConsumerGroupResponse> updateInstanceConsumerGroupAsync(
        UpdateInstanceConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceConsumerGroup);
    }

    /**
     * 修改指定消费组
     *
     * 修改指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConsumerGroupRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse>
     */
    public AsyncInvoker<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse> updateInstanceConsumerGroupAsyncInvoker(
        UpdateInstanceConsumerGroupRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateInstanceConsumerGroup, hcClient);
    }

    /**
     * 修改实例跨VPC访问的内网IP
     *
     * 修改实例跨VPC访问的内网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceCrossVpcIpRequest 请求对象
     * @return CompletableFuture<UpdateInstanceCrossVpcIpResponse>
     */
    public CompletableFuture<UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIpAsync(
        UpdateInstanceCrossVpcIpRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceCrossVpcIp);
    }

    /**
     * 修改实例跨VPC访问的内网IP
     *
     * 修改实例跨VPC访问的内网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceCrossVpcIpRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse>
     */
    public AsyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIpAsyncInvoker(
        UpdateInstanceCrossVpcIpRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateInstanceCrossVpcIp, hcClient);
    }

    /**
     * 修改所有消费组
     *
     * 修改所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return CompletableFuture<UpdateInstanceGroupResponse>
     */
    public CompletableFuture<UpdateInstanceGroupResponse> updateInstanceGroupAsync(UpdateInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceGroup);
    }

    /**
     * 修改所有消费组
     *
     * 修改所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse>
     */
    public AsyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse> updateInstanceGroupAsyncInvoker(
        UpdateInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateInstanceGroup, hcClient);
    }

    /**
     * 修改Kafka实例Topic
     *
     * 修改Kafka实例Topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceTopicRequest 请求对象
     * @return CompletableFuture<UpdateInstanceTopicResponse>
     */
    public CompletableFuture<UpdateInstanceTopicResponse> updateInstanceTopicAsync(UpdateInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceTopic);
    }

    /**
     * 修改Kafka实例Topic
     *
     * 修改Kafka实例Topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceTopicRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse>
     */
    public AsyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> updateInstanceTopicAsyncInvoker(
        UpdateInstanceTopicRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateInstanceTopic, hcClient);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceUserRequest 请求对象
     * @return CompletableFuture<UpdateInstanceUserResponse>
     */
    public CompletableFuture<UpdateInstanceUserResponse> updateInstanceUserAsync(UpdateInstanceUserRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceUser);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceUserRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceUserRequest, UpdateInstanceUserResponse>
     */
    public AsyncInvoker<UpdateInstanceUserRequest, UpdateInstanceUserResponse> updateInstanceUserAsyncInvoker(
        UpdateInstanceUserRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateInstanceUser, hcClient);
    }

    /**
     * 修改Kafka的接入方式
     *
     * 修改Kafka的内网或者公网接入方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKafkaPortProtocolRequest 请求对象
     * @return CompletableFuture<UpdateKafkaPortProtocolResponse>
     */
    public CompletableFuture<UpdateKafkaPortProtocolResponse> updateKafkaPortProtocolAsync(
        UpdateKafkaPortProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateKafkaPortProtocol);
    }

    /**
     * 修改Kafka的接入方式
     *
     * 修改Kafka的内网或者公网接入方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKafkaPortProtocolRequest 请求对象
     * @return AsyncInvoker<UpdateKafkaPortProtocolRequest, UpdateKafkaPortProtocolResponse>
     */
    public AsyncInvoker<UpdateKafkaPortProtocolRequest, UpdateKafkaPortProtocolResponse> updateKafkaPortProtocolAsyncInvoker(
        UpdateKafkaPortProtocolRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateKafkaPortProtocol, hcClient);
    }

    /**
     * 修改用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交修改用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKafkaUserClientQuotaTaskRequest 请求对象
     * @return CompletableFuture<UpdateKafkaUserClientQuotaTaskResponse>
     */
    public CompletableFuture<UpdateKafkaUserClientQuotaTaskResponse> updateKafkaUserClientQuotaTaskAsync(
        UpdateKafkaUserClientQuotaTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateKafkaUserClientQuotaTask);
    }

    /**
     * 修改用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交修改用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKafkaUserClientQuotaTaskRequest 请求对象
     * @return AsyncInvoker<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse>
     */
    public AsyncInvoker<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse> updateKafkaUserClientQuotaTaskAsyncInvoker(
        UpdateKafkaUserClientQuotaTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateKafkaUserClientQuotaTask, hcClient);
    }

    /**
     * 修改指定的定时任务
     *
     * 修改指定的定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return CompletableFuture<UpdateScheduledTaskResponse>
     */
    public CompletableFuture<UpdateScheduledTaskResponse> updateScheduledTaskAsync(UpdateScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateScheduledTask);
    }

    /**
     * 修改指定的定时任务
     *
     * 修改指定的定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return AsyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
     */
    public AsyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTaskAsyncInvoker(
        UpdateScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateScheduledTask, hcClient);
    }

    /**
     * 设置用户权限
     *
     * 设置用户权限。
     * 
     * Kafka实例开启SASL功能时，才支持多用户管理的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<UpdateTopicAccessPolicyResponse>
     */
    public CompletableFuture<UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyAsync(
        UpdateTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateTopicAccessPolicy);
    }

    /**
     * 设置用户权限
     *
     * 设置用户权限。
     * 
     * Kafka实例开启SASL功能时，才支持多用户管理的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicAccessPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>
     */
    public AsyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyAsyncInvoker(
        UpdateTopicAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateTopicAccessPolicy, hcClient);
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateVolumeExpansionConfig);
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
        return new AsyncInvoker<>(request, KafkaMeta.updateVolumeExpansionConfig, hcClient);
    }

    /**
     * 实例升级
     *
     * 实例内核升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceRequest 请求对象
     * @return CompletableFuture<UpgradeInstanceResponse>
     */
    public CompletableFuture<UpgradeInstanceResponse> upgradeInstanceAsync(UpgradeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.upgradeInstance);
    }

    /**
     * 实例升级
     *
     * 实例内核升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceRequest 请求对象
     * @return AsyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse>
     */
    public AsyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse> upgradeInstanceAsyncInvoker(
        UpgradeInstanceRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.upgradeInstance, hcClient);
    }

    /**
     * 开启Smart Connect（按需实例）
     *
     * 开启Smart Connect，提交创建Smart Connect节点任务。
     * 
     * [**当前通过调用API，只支持按需实例创建Smart Connect节点。**](tag:hws,hws_hk,g42,hk_g42,ctc,cmcc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectorRequest 请求对象
     * @return CompletableFuture<CreateConnectorResponse>
     */
    public CompletableFuture<CreateConnectorResponse> createConnectorAsync(CreateConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createConnector);
    }

    /**
     * 开启Smart Connect（按需实例）
     *
     * 开启Smart Connect，提交创建Smart Connect节点任务。
     * 
     * [**当前通过调用API，只支持按需实例创建Smart Connect节点。**](tag:hws,hws_hk,g42,hk_g42,ctc,cmcc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectorRequest 请求对象
     * @return AsyncInvoker<CreateConnectorRequest, CreateConnectorResponse>
     */
    public AsyncInvoker<CreateConnectorRequest, CreateConnectorResponse> createConnectorAsyncInvoker(
        CreateConnectorRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createConnector, hcClient);
    }

    /**
     * 创建Smart Connect任务
     *
     * 创建Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectorTaskRequest 请求对象
     * @return CompletableFuture<CreateConnectorTaskResponse>
     */
    public CompletableFuture<CreateConnectorTaskResponse> createConnectorTaskAsync(CreateConnectorTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createConnectorTask);
    }

    /**
     * 创建Smart Connect任务
     *
     * 创建Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectorTaskRequest 请求对象
     * @return AsyncInvoker<CreateConnectorTaskRequest, CreateConnectorTaskResponse>
     */
    public AsyncInvoker<CreateConnectorTaskRequest, CreateConnectorTaskResponse> createConnectorTaskAsyncInvoker(
        CreateConnectorTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.createConnectorTask, hcClient);
    }

    /**
     * 关闭Smart Connect（按需实例）
     *
     * 介绍按需实例如何关闭Smart Connect。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorRequest 请求对象
     * @return CompletableFuture<DeleteConnectorResponse>
     */
    public CompletableFuture<DeleteConnectorResponse> deleteConnectorAsync(DeleteConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteConnector);
    }

    /**
     * 关闭Smart Connect（按需实例）
     *
     * 介绍按需实例如何关闭Smart Connect。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorRequest 请求对象
     * @return AsyncInvoker<DeleteConnectorRequest, DeleteConnectorResponse>
     */
    public AsyncInvoker<DeleteConnectorRequest, DeleteConnectorResponse> deleteConnectorAsyncInvoker(
        DeleteConnectorRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteConnector, hcClient);
    }

    /**
     * 删除Smart Connect任务
     *
     * 删除Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorTaskRequest 请求对象
     * @return CompletableFuture<DeleteConnectorTaskResponse>
     */
    public CompletableFuture<DeleteConnectorTaskResponse> deleteConnectorTaskAsync(DeleteConnectorTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteConnectorTask);
    }

    /**
     * 删除Smart Connect任务
     *
     * 删除Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorTaskRequest 请求对象
     * @return AsyncInvoker<DeleteConnectorTaskRequest, DeleteConnectorTaskResponse>
     */
    public AsyncInvoker<DeleteConnectorTaskRequest, DeleteConnectorTaskResponse> deleteConnectorTaskAsyncInvoker(
        DeleteConnectorTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.deleteConnectorTask, hcClient);
    }

    /**
     * 查询Smart Connect任务列表
     *
     * 查询Smart Connect任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectorTasksRequest 请求对象
     * @return CompletableFuture<ListConnectorTasksResponse>
     */
    public CompletableFuture<ListConnectorTasksResponse> listConnectorTasksAsync(ListConnectorTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listConnectorTasks);
    }

    /**
     * 查询Smart Connect任务列表
     *
     * 查询Smart Connect任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectorTasksRequest 请求对象
     * @return AsyncInvoker<ListConnectorTasksRequest, ListConnectorTasksResponse>
     */
    public AsyncInvoker<ListConnectorTasksRequest, ListConnectorTasksResponse> listConnectorTasksAsyncInvoker(
        ListConnectorTasksRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listConnectorTasks, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return CompletableFuture<ListObsBucketsResponse>
     */
    public CompletableFuture<ListObsBucketsResponse> listObsBucketsAsync(ListObsBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listObsBuckets);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsAsyncInvoker(
        ListObsBucketsRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.listObsBuckets, hcClient);
    }

    /**
     * 修改Smart Connect任务配置
     *
     * 修改Smart Connect任务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyConnectorTaskRequest 请求对象
     * @return CompletableFuture<ModifyConnectorTaskResponse>
     */
    public CompletableFuture<ModifyConnectorTaskResponse> modifyConnectorTaskAsync(ModifyConnectorTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.modifyConnectorTask);
    }

    /**
     * 修改Smart Connect任务配置
     *
     * 修改Smart Connect任务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyConnectorTaskRequest 请求对象
     * @return AsyncInvoker<ModifyConnectorTaskRequest, ModifyConnectorTaskResponse>
     */
    public AsyncInvoker<ModifyConnectorTaskRequest, ModifyConnectorTaskResponse> modifyConnectorTaskAsyncInvoker(
        ModifyConnectorTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.modifyConnectorTask, hcClient);
    }

    /**
     * 暂停Smart Connect任务
     *
     * 暂停Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseConnectorTaskRequest 请求对象
     * @return CompletableFuture<PauseConnectorTaskResponse>
     */
    public CompletableFuture<PauseConnectorTaskResponse> pauseConnectorTaskAsync(PauseConnectorTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.pauseConnectorTask);
    }

    /**
     * 暂停Smart Connect任务
     *
     * 暂停Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseConnectorTaskRequest 请求对象
     * @return AsyncInvoker<PauseConnectorTaskRequest, PauseConnectorTaskResponse>
     */
    public AsyncInvoker<PauseConnectorTaskRequest, PauseConnectorTaskResponse> pauseConnectorTaskAsyncInvoker(
        PauseConnectorTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.pauseConnectorTask, hcClient);
    }

    /**
     * 启动未启动的Smart Connect任务/重启已暂停或者运行中的Smart Connect任务
     *
     * 用于**启动未启动的Smart Connect任务**以及**重启已暂停或者运行中的Smart Connect任务**。注意，重启Smart Connect任务将重置同步进度，并重新开始同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartConnectorTaskRequest 请求对象
     * @return CompletableFuture<RestartConnectorTaskResponse>
     */
    public CompletableFuture<RestartConnectorTaskResponse> restartConnectorTaskAsync(
        RestartConnectorTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.restartConnectorTask);
    }

    /**
     * 启动未启动的Smart Connect任务/重启已暂停或者运行中的Smart Connect任务
     *
     * 用于**启动未启动的Smart Connect任务**以及**重启已暂停或者运行中的Smart Connect任务**。注意，重启Smart Connect任务将重置同步进度，并重新开始同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartConnectorTaskRequest 请求对象
     * @return AsyncInvoker<RestartConnectorTaskRequest, RestartConnectorTaskResponse>
     */
    public AsyncInvoker<RestartConnectorTaskRequest, RestartConnectorTaskResponse> restartConnectorTaskAsyncInvoker(
        RestartConnectorTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.restartConnectorTask, hcClient);
    }

    /**
     * 启动未启动的Smart Connect任务/重启Smart Connect任务
     *
     * 启动未启动的Smart Connect任务/重启Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartSmartConnectorTaskRequest 请求对象
     * @return CompletableFuture<RestartSmartConnectorTaskResponse>
     */
    public CompletableFuture<RestartSmartConnectorTaskResponse> restartSmartConnectorTaskAsync(
        RestartSmartConnectorTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.restartSmartConnectorTask);
    }

    /**
     * 启动未启动的Smart Connect任务/重启Smart Connect任务
     *
     * 启动未启动的Smart Connect任务/重启Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartSmartConnectorTaskRequest 请求对象
     * @return AsyncInvoker<RestartSmartConnectorTaskRequest, RestartSmartConnectorTaskResponse>
     */
    public AsyncInvoker<RestartSmartConnectorTaskRequest, RestartSmartConnectorTaskResponse> restartSmartConnectorTaskAsyncInvoker(
        RestartSmartConnectorTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.restartSmartConnectorTask, hcClient);
    }

    /**
     * 启动已暂停的Smart Connect任务
     *
     * 启动已暂停的Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeConnectorTaskRequest 请求对象
     * @return CompletableFuture<ResumeConnectorTaskResponse>
     */
    public CompletableFuture<ResumeConnectorTaskResponse> resumeConnectorTaskAsync(ResumeConnectorTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resumeConnectorTask);
    }

    /**
     * 启动已暂停的Smart Connect任务
     *
     * 启动已暂停的Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeConnectorTaskRequest 请求对象
     * @return AsyncInvoker<ResumeConnectorTaskRequest, ResumeConnectorTaskResponse>
     */
    public AsyncInvoker<ResumeConnectorTaskRequest, ResumeConnectorTaskResponse> resumeConnectorTaskAsyncInvoker(
        ResumeConnectorTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.resumeConnectorTask, hcClient);
    }

    /**
     * 查询开启Smart Connect功能所需资源信息
     *
     * 查询开启Smart Connect功能所需要使用的资源的情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorResourceInfoRequest 请求对象
     * @return CompletableFuture<ShowConnectorResourceInfoResponse>
     */
    public CompletableFuture<ShowConnectorResourceInfoResponse> showConnectorResourceInfoAsync(
        ShowConnectorResourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showConnectorResourceInfo);
    }

    /**
     * 查询开启Smart Connect功能所需资源信息
     *
     * 查询开启Smart Connect功能所需要使用的资源的情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorResourceInfoRequest 请求对象
     * @return AsyncInvoker<ShowConnectorResourceInfoRequest, ShowConnectorResourceInfoResponse>
     */
    public AsyncInvoker<ShowConnectorResourceInfoRequest, ShowConnectorResourceInfoResponse> showConnectorResourceInfoAsyncInvoker(
        ShowConnectorResourceInfoRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showConnectorResourceInfo, hcClient);
    }

    /**
     * 查询Smart Connect任务详情
     *
     * 查询Smart Connect任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorTaskRequest 请求对象
     * @return CompletableFuture<ShowConnectorTaskResponse>
     */
    public CompletableFuture<ShowConnectorTaskResponse> showConnectorTaskAsync(ShowConnectorTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showConnectorTask);
    }

    /**
     * 查询Smart Connect任务详情
     *
     * 查询Smart Connect任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorTaskRequest 请求对象
     * @return AsyncInvoker<ShowConnectorTaskRequest, ShowConnectorTaskResponse>
     */
    public AsyncInvoker<ShowConnectorTaskRequest, ShowConnectorTaskResponse> showConnectorTaskAsyncInvoker(
        ShowConnectorTaskRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.showConnectorTask, hcClient);
    }

    /**
     * 校验Connector连通性
     *
     * 校验Connector连通性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConnectorConnectivityRequest 请求对象
     * @return CompletableFuture<ValidateConnectorConnectivityResponse>
     */
    public CompletableFuture<ValidateConnectorConnectivityResponse> validateConnectorConnectivityAsync(
        ValidateConnectorConnectivityRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.validateConnectorConnectivity);
    }

    /**
     * 校验Connector连通性
     *
     * 校验Connector连通性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConnectorConnectivityRequest 请求对象
     * @return AsyncInvoker<ValidateConnectorConnectivityRequest, ValidateConnectorConnectivityResponse>
     */
    public AsyncInvoker<ValidateConnectorConnectivityRequest, ValidateConnectorConnectivityResponse> validateConnectorConnectivityAsyncInvoker(
        ValidateConnectorConnectivityRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.validateConnectorConnectivity, hcClient);
    }

}
