package com.huaweicloud.sdk.kafka.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class KafkaClient {

    protected HcClient hcClient;

    public KafkaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KafkaClient> newBuilder() {
        ClientBuilder<KafkaClient> clientBuilder = new ClientBuilder<>(KafkaClient::new);
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
     * @return BatchCreateOrDeleteKafkaTagResponse
     */
    public BatchCreateOrDeleteKafkaTagResponse batchCreateOrDeleteKafkaTag(BatchCreateOrDeleteKafkaTagRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchCreateOrDeleteKafkaTag);
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteKafkaTagRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> batchCreateOrDeleteKafkaTagInvoker(
        BatchCreateOrDeleteKafkaTagRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.batchCreateOrDeleteKafkaTag, hcClient);
    }

    /**
     * Kafka实例批量删除消费组
     *
     * 该接口用于向Kafka实例批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGroupRequest 请求对象
     * @return BatchDeleteGroupResponse
     */
    public BatchDeleteGroupResponse batchDeleteGroup(BatchDeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchDeleteGroup);
    }

    /**
     * Kafka实例批量删除消费组
     *
     * 该接口用于向Kafka实例批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGroupRequest 请求对象
     * @return SyncInvoker<BatchDeleteGroupRequest, BatchDeleteGroupResponse>
     */
    public SyncInvoker<BatchDeleteGroupRequest, BatchDeleteGroupResponse> batchDeleteGroupInvoker(
        BatchDeleteGroupRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.batchDeleteGroup, hcClient);
    }

    /**
     * Kafka实例批量删除Topic
     *
     * 该接口用于向Kafka实例批量删除Topic。批量删除多个Topic时，部分删除成功，部分失败，此时接口返回删除成功，并在返回中显示删除失败的Topic信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceTopicRequest 请求对象
     * @return BatchDeleteInstanceTopicResponse
     */
    public BatchDeleteInstanceTopicResponse batchDeleteInstanceTopic(BatchDeleteInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchDeleteInstanceTopic);
    }

    /**
     * Kafka实例批量删除Topic
     *
     * 该接口用于向Kafka实例批量删除Topic。批量删除多个Topic时，部分删除成功，部分失败，此时接口返回删除成功，并在返回中显示删除失败的Topic信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceTopicRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse>
     */
    public SyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopicInvoker(
        BatchDeleteInstanceTopicRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.batchDeleteInstanceTopic, hcClient);
    }

    /**
     * 批量删除用户
     *
     * 批量删除Kafka实例的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceUsersRequest 请求对象
     * @return BatchDeleteInstanceUsersResponse
     */
    public BatchDeleteInstanceUsersResponse batchDeleteInstanceUsers(BatchDeleteInstanceUsersRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchDeleteInstanceUsers);
    }

    /**
     * 批量删除用户
     *
     * 批量删除Kafka实例的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceUsersRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse>
     */
    public SyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> batchDeleteInstanceUsersInvoker(
        BatchDeleteInstanceUsersRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.batchDeleteInstanceUsers, hcClient);
    }

    /**
     * 批量删除消息积压诊断报告
     *
     * 批量删除消息积压诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMessageDiagnosisReportsRequest 请求对象
     * @return BatchDeleteMessageDiagnosisReportsResponse
     */
    public BatchDeleteMessageDiagnosisReportsResponse batchDeleteMessageDiagnosisReports(
        BatchDeleteMessageDiagnosisReportsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchDeleteMessageDiagnosisReports);
    }

    /**
     * 批量删除消息积压诊断报告
     *
     * 批量删除消息积压诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMessageDiagnosisReportsRequest 请求对象
     * @return SyncInvoker<BatchDeleteMessageDiagnosisReportsRequest, BatchDeleteMessageDiagnosisReportsResponse>
     */
    public SyncInvoker<BatchDeleteMessageDiagnosisReportsRequest, BatchDeleteMessageDiagnosisReportsResponse> batchDeleteMessageDiagnosisReportsInvoker(
        BatchDeleteMessageDiagnosisReportsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.batchDeleteMessageDiagnosisReports, hcClient);
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
     * @return BatchRestartOrDeleteInstancesResponse
     */
    public BatchRestartOrDeleteInstancesResponse batchRestartOrDeleteInstances(
        BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchRestartOrDeleteInstances);
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
     * @return SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>
     */
    public SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesInvoker(
        BatchRestartOrDeleteInstancesRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.batchRestartOrDeleteInstances, hcClient);
    }

    /**
     * 关闭Kafka Manager
     *
     * 关闭Kafka Manager，相应的原来开放出的management相关接口也将不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseKafkaManagerRequest 请求对象
     * @return CloseKafkaManagerResponse
     */
    public CloseKafkaManagerResponse closeKafkaManager(CloseKafkaManagerRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.closeKafkaManager);
    }

    /**
     * 关闭Kafka Manager
     *
     * 关闭Kafka Manager，相应的原来开放出的management相关接口也将不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseKafkaManagerRequest 请求对象
     * @return SyncInvoker<CloseKafkaManagerRequest, CloseKafkaManagerResponse>
     */
    public SyncInvoker<CloseKafkaManagerRequest, CloseKafkaManagerResponse> closeKafkaManagerInvoker(
        CloseKafkaManagerRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.closeKafkaManager, hcClient);
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
     * @return CreateInstanceByEngineResponse
     */
    public CreateInstanceByEngineResponse createInstanceByEngine(CreateInstanceByEngineRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createInstanceByEngine);
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
     * @return SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>
     */
    public SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngineInvoker(
        CreateInstanceByEngineRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createInstanceByEngine, hcClient);
    }

    /**
     * Kafka实例创建Topic
     *
     * 该接口用于向Kafka实例创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceTopicRequest 请求对象
     * @return CreateInstanceTopicResponse
     */
    public CreateInstanceTopicResponse createInstanceTopic(CreateInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createInstanceTopic);
    }

    /**
     * Kafka实例创建Topic
     *
     * 该接口用于向Kafka实例创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceTopicRequest 请求对象
     * @return SyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse>
     */
    public SyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse> createInstanceTopicInvoker(
        CreateInstanceTopicRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createInstanceTopic, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。 [ 2023年7月15日前创建的Kafka实例，一个实例最多创建20个用户。2023年7月15日及以后创建的Kafka实例，一个实例最多创建500个用户。](tag:hws,hws_hk) [一个实例最多创建500个用户。](tag:fcs,ax,hcs)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceUserRequest 请求对象
     * @return CreateInstanceUserResponse
     */
    public CreateInstanceUserResponse createInstanceUser(CreateInstanceUserRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createInstanceUser);
    }

    /**
     * 创建用户
     *
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。 [ 2023年7月15日前创建的Kafka实例，一个实例最多创建20个用户。2023年7月15日及以后创建的Kafka实例，一个实例最多创建500个用户。](tag:hws,hws_hk) [一个实例最多创建500个用户。](tag:fcs,ax,hcs)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceUserRequest 请求对象
     * @return SyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse>
     */
    public SyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse> createInstanceUserInvoker(
        CreateInstanceUserRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createInstanceUser, hcClient);
    }

    /**
     * 创建消费组
     *
     * 实例创建消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaConsumerGroupRequest 请求对象
     * @return CreateKafkaConsumerGroupResponse
     */
    public CreateKafkaConsumerGroupResponse createKafkaConsumerGroup(CreateKafkaConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createKafkaConsumerGroup);
    }

    /**
     * 创建消费组
     *
     * 实例创建消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaConsumerGroupRequest 请求对象
     * @return SyncInvoker<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse>
     */
    public SyncInvoker<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse> createKafkaConsumerGroupInvoker(
        CreateKafkaConsumerGroupRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createKafkaConsumerGroup, hcClient);
    }

    /**
     * Kafka实例开始分区平衡任务
     *
     * 该接口用于向Kafka实例提交分区平衡任务，若成功则返回分区平衡任务的job id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaReassignmentTaskRequest 请求对象
     * @return CreateKafkaReassignmentTaskResponse
     */
    public CreateKafkaReassignmentTaskResponse createKafkaReassignmentTask(CreateKafkaReassignmentTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createKafkaReassignmentTask);
    }

    /**
     * Kafka实例开始分区平衡任务
     *
     * 该接口用于向Kafka实例提交分区平衡任务，若成功则返回分区平衡任务的job id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaReassignmentTaskRequest 请求对象
     * @return SyncInvoker<CreateKafkaReassignmentTaskRequest, CreateKafkaReassignmentTaskResponse>
     */
    public SyncInvoker<CreateKafkaReassignmentTaskRequest, CreateKafkaReassignmentTaskResponse> createKafkaReassignmentTaskInvoker(
        CreateKafkaReassignmentTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createKafkaReassignmentTask, hcClient);
    }

    /**
     * 开启Kafka实例重平衡日志功能
     *
     * 开启Kafka实例重平衡日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaRebalanceLogTaskRequest 请求对象
     * @return CreateKafkaRebalanceLogTaskResponse
     */
    public CreateKafkaRebalanceLogTaskResponse createKafkaRebalanceLogTask(CreateKafkaRebalanceLogTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createKafkaRebalanceLogTask);
    }

    /**
     * 开启Kafka实例重平衡日志功能
     *
     * 开启Kafka实例重平衡日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaRebalanceLogTaskRequest 请求对象
     * @return SyncInvoker<CreateKafkaRebalanceLogTaskRequest, CreateKafkaRebalanceLogTaskResponse>
     */
    public SyncInvoker<CreateKafkaRebalanceLogTaskRequest, CreateKafkaRebalanceLogTaskResponse> createKafkaRebalanceLogTaskInvoker(
        CreateKafkaRebalanceLogTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createKafkaRebalanceLogTask, hcClient);
    }

    /**
     * 创建Topic流控配置
     *
     * 该接口用于向Kafka实例提交创建Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaTopicQuotaRequest 请求对象
     * @return CreateKafkaTopicQuotaResponse
     */
    public CreateKafkaTopicQuotaResponse createKafkaTopicQuota(CreateKafkaTopicQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createKafkaTopicQuota);
    }

    /**
     * 创建Topic流控配置
     *
     * 该接口用于向Kafka实例提交创建Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaTopicQuotaRequest 请求对象
     * @return SyncInvoker<CreateKafkaTopicQuotaRequest, CreateKafkaTopicQuotaResponse>
     */
    public SyncInvoker<CreateKafkaTopicQuotaRequest, CreateKafkaTopicQuotaResponse> createKafkaTopicQuotaInvoker(
        CreateKafkaTopicQuotaRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createKafkaTopicQuota, hcClient);
    }

    /**
     * 创建用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交创建用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaUserClientQuotaTaskRequest 请求对象
     * @return CreateKafkaUserClientQuotaTaskResponse
     */
    public CreateKafkaUserClientQuotaTaskResponse createKafkaUserClientQuotaTask(
        CreateKafkaUserClientQuotaTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createKafkaUserClientQuotaTask);
    }

    /**
     * 创建用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交创建用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKafkaUserClientQuotaTaskRequest 请求对象
     * @return SyncInvoker<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse>
     */
    public SyncInvoker<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse> createKafkaUserClientQuotaTaskInvoker(
        CreateKafkaUserClientQuotaTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createKafkaUserClientQuotaTask, hcClient);
    }

    /**
     * 创建消息积压诊断任务
     *
     * 创建消息积压诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageDiagnosisTaskRequest 请求对象
     * @return CreateMessageDiagnosisTaskResponse
     */
    public CreateMessageDiagnosisTaskResponse createMessageDiagnosisTask(CreateMessageDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createMessageDiagnosisTask);
    }

    /**
     * 创建消息积压诊断任务
     *
     * 创建消息积压诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<CreateMessageDiagnosisTaskRequest, CreateMessageDiagnosisTaskResponse>
     */
    public SyncInvoker<CreateMessageDiagnosisTaskRequest, CreateMessageDiagnosisTaskResponse> createMessageDiagnosisTaskInvoker(
        CreateMessageDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createMessageDiagnosisTask, hcClient);
    }

    /**
     * 新增Kafka实例指定Topic分区
     *
     * 新增Kafka实例指定Topic分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePartitionRequest 请求对象
     * @return CreatePartitionResponse
     */
    public CreatePartitionResponse createPartition(CreatePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createPartition);
    }

    /**
     * 新增Kafka实例指定Topic分区
     *
     * 新增Kafka实例指定Topic分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePartitionRequest 请求对象
     * @return SyncInvoker<CreatePartitionRequest, CreatePartitionResponse>
     */
    public SyncInvoker<CreatePartitionRequest, CreatePartitionResponse> createPartitionInvoker(
        CreatePartitionRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createPartition, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建按需计费类型的Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return CreatePostPaidInstanceResponse
     */
    public CreatePostPaidInstanceResponse createPostPaidInstance(CreatePostPaidInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createPostPaidInstance);
    }

    /**
     * 创建实例
     *
     * 创建按需计费类型的Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceInvoker(
        CreatePostPaidInstanceRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createPostPaidInstance, hcClient);
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
     * @return CreatePostPaidKafkaInstanceResponse
     */
    public CreatePostPaidKafkaInstanceResponse createPostPaidKafkaInstance(CreatePostPaidKafkaInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createPostPaidKafkaInstance);
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
     * @return SyncInvoker<CreatePostPaidKafkaInstanceRequest, CreatePostPaidKafkaInstanceResponse>
     */
    public SyncInvoker<CreatePostPaidKafkaInstanceRequest, CreatePostPaidKafkaInstanceResponse> createPostPaidKafkaInstanceInvoker(
        CreatePostPaidKafkaInstanceRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createPostPaidKafkaInstance, hcClient);
    }

    /**
     * Kafka实例开始分区平衡任务
     *
     * 该接口用于向Kafka实例提交分区平衡任务或计算分区平衡预估时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReassignmentTaskRequest 请求对象
     * @return CreateReassignmentTaskResponse
     */
    public CreateReassignmentTaskResponse createReassignmentTask(CreateReassignmentTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createReassignmentTask);
    }

    /**
     * Kafka实例开始分区平衡任务
     *
     * 该接口用于向Kafka实例提交分区平衡任务或计算分区平衡预估时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReassignmentTaskRequest 请求对象
     * @return SyncInvoker<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse>
     */
    public SyncInvoker<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse> createReassignmentTaskInvoker(
        CreateReassignmentTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createReassignmentTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteBackgroundTask);
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
        return new SyncInvoker<>(request, KafkaMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除消费组在指定Topic的消费位点
     *
     * 删除消费组在指定Topic的消费位点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupOffsetsRequest 请求对象
     * @return DeleteConsumerGroupOffsetsResponse
     */
    public DeleteConsumerGroupOffsetsResponse deleteConsumerGroupOffsets(DeleteConsumerGroupOffsetsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteConsumerGroupOffsets);
    }

    /**
     * 删除消费组在指定Topic的消费位点
     *
     * 删除消费组在指定Topic的消费位点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupOffsetsRequest 请求对象
     * @return SyncInvoker<DeleteConsumerGroupOffsetsRequest, DeleteConsumerGroupOffsetsResponse>
     */
    public SyncInvoker<DeleteConsumerGroupOffsetsRequest, DeleteConsumerGroupOffsetsResponse> deleteConsumerGroupOffsetsInvoker(
        DeleteConsumerGroupOffsetsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteConsumerGroupOffsets, hcClient);
    }

    /**
     * kafka实例删除指定消费组
     *
     * kafka实例删除指定消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteGroup);
    }

    /**
     * kafka实例删除指定消费组
     *
     * kafka实例删除指定消费组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public SyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupInvoker(DeleteGroupRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteGroup, hcClient);
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
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteInstance);
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
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteInstance, hcClient);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceConsumerGroupRequest 请求对象
     * @return DeleteInstanceConsumerGroupResponse
     */
    public DeleteInstanceConsumerGroupResponse deleteInstanceConsumerGroup(DeleteInstanceConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteInstanceConsumerGroup);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceConsumerGroupRequest 请求对象
     * @return SyncInvoker<DeleteInstanceConsumerGroupRequest, DeleteInstanceConsumerGroupResponse>
     */
    public SyncInvoker<DeleteInstanceConsumerGroupRequest, DeleteInstanceConsumerGroupResponse> deleteInstanceConsumerGroupInvoker(
        DeleteInstanceConsumerGroupRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteInstanceConsumerGroup, hcClient);
    }

    /**
     * Kafka删除消息
     *
     * Kafka删除消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaMessageRequest 请求对象
     * @return DeleteKafkaMessageResponse
     */
    public DeleteKafkaMessageResponse deleteKafkaMessage(DeleteKafkaMessageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteKafkaMessage);
    }

    /**
     * Kafka删除消息
     *
     * Kafka删除消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaMessageRequest 请求对象
     * @return SyncInvoker<DeleteKafkaMessageRequest, DeleteKafkaMessageResponse>
     */
    public SyncInvoker<DeleteKafkaMessageRequest, DeleteKafkaMessageResponse> deleteKafkaMessageInvoker(
        DeleteKafkaMessageRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteKafkaMessage, hcClient);
    }

    /**
     * 删除Kafka消息
     *
     * 删除Kafka消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaTopicMessagesRequest 请求对象
     * @return DeleteKafkaTopicMessagesResponse
     */
    public DeleteKafkaTopicMessagesResponse deleteKafkaTopicMessages(DeleteKafkaTopicMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteKafkaTopicMessages);
    }

    /**
     * 删除Kafka消息
     *
     * 删除Kafka消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaTopicMessagesRequest 请求对象
     * @return SyncInvoker<DeleteKafkaTopicMessagesRequest, DeleteKafkaTopicMessagesResponse>
     */
    public SyncInvoker<DeleteKafkaTopicMessagesRequest, DeleteKafkaTopicMessagesResponse> deleteKafkaTopicMessagesInvoker(
        DeleteKafkaTopicMessagesRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteKafkaTopicMessages, hcClient);
    }

    /**
     * 删除Topic流控配置
     *
     * 该接口用于向Kafka实例提交删除Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaTopicQuotaRequest 请求对象
     * @return DeleteKafkaTopicQuotaResponse
     */
    public DeleteKafkaTopicQuotaResponse deleteKafkaTopicQuota(DeleteKafkaTopicQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteKafkaTopicQuota);
    }

    /**
     * 删除Topic流控配置
     *
     * 该接口用于向Kafka实例提交删除Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaTopicQuotaRequest 请求对象
     * @return SyncInvoker<DeleteKafkaTopicQuotaRequest, DeleteKafkaTopicQuotaResponse>
     */
    public SyncInvoker<DeleteKafkaTopicQuotaRequest, DeleteKafkaTopicQuotaResponse> deleteKafkaTopicQuotaInvoker(
        DeleteKafkaTopicQuotaRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteKafkaTopicQuota, hcClient);
    }

    /**
     * 删除用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交删除用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaUserClientQuotaTaskRequest 请求对象
     * @return DeleteKafkaUserClientQuotaTaskResponse
     */
    public DeleteKafkaUserClientQuotaTaskResponse deleteKafkaUserClientQuotaTask(
        DeleteKafkaUserClientQuotaTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteKafkaUserClientQuotaTask);
    }

    /**
     * 删除用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交删除用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKafkaUserClientQuotaTaskRequest 请求对象
     * @return SyncInvoker<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse>
     */
    public SyncInvoker<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse> deleteKafkaUserClientQuotaTaskInvoker(
        DeleteKafkaUserClientQuotaTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteKafkaUserClientQuotaTask, hcClient);
    }

    /**
     * 删除指定的定时任务
     *
     * 删除指定的定时任务。仅当定时任务处于执行成功或已取消状态时，方可执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteScheduledTask);
    }

    /**
     * 删除指定的定时任务
     *
     * 删除指定的定时任务。仅当定时任务处于执行成功或已取消状态时，方可执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return SyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
     */
    public SyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTaskInvoker(
        DeleteScheduledTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteScheduledTask, hcClient);
    }

    /**
     * 开启Kafka实例域名访问能力
     *
     * 开启Kafka实例域名访问后，客户端可以通过域名连接Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return EnableDnsResponse
     */
    public EnableDnsResponse enableDns(EnableDnsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.enableDns);
    }

    /**
     * 开启Kafka实例域名访问能力
     *
     * 开启Kafka实例域名访问后，客户端可以通过域名连接Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return SyncInvoker<EnableDnsRequest, EnableDnsResponse>
     */
    public SyncInvoker<EnableDnsRequest, EnableDnsResponse> enableDnsInvoker(EnableDnsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.enableDns, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.listAvailableZones);
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
        return new SyncInvoker<>(request, KafkaMeta.listAvailableZones, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.listBackgroundTasks);
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
        return new SyncInvoker<>(request, KafkaMeta.listBackgroundTasks, hcClient);
    }

    /**
     * 查询特性开关列表
     *
     * 获取特性开关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigFeaturesRequest 请求对象
     * @return ListConfigFeaturesResponse
     */
    public ListConfigFeaturesResponse listConfigFeatures(ListConfigFeaturesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listConfigFeatures);
    }

    /**
     * 查询特性开关列表
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
        return new SyncInvoker<>(request, KafkaMeta.listConfigFeatures, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 查询产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return ListEngineProductsResponse
     */
    public ListEngineProductsResponse listEngineProducts(ListEngineProductsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listEngineProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 查询产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse>
     */
    public SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProductsInvoker(
        ListEngineProductsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupRequest 请求对象
     * @return ListInstanceConsumerGroupResponse
     */
    public ListInstanceConsumerGroupResponse listInstanceConsumerGroup(ListInstanceConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroup);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupRequest 请求对象
     * @return SyncInvoker<ListInstanceConsumerGroupRequest, ListInstanceConsumerGroupResponse>
     */
    public SyncInvoker<ListInstanceConsumerGroupRequest, ListInstanceConsumerGroupResponse> listInstanceConsumerGroupInvoker(
        ListInstanceConsumerGroupRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroup, hcClient);
    }

    /**
     * 查询指定消费组的消费成员
     *
     * 查询指定消费组的消费成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupMembersRequest 请求对象
     * @return ListInstanceConsumerGroupMembersResponse
     */
    public ListInstanceConsumerGroupMembersResponse listInstanceConsumerGroupMembers(
        ListInstanceConsumerGroupMembersRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroupMembers);
    }

    /**
     * 查询指定消费组的消费成员
     *
     * 查询指定消费组的消费成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupMembersRequest 请求对象
     * @return SyncInvoker<ListInstanceConsumerGroupMembersRequest, ListInstanceConsumerGroupMembersResponse>
     */
    public SyncInvoker<ListInstanceConsumerGroupMembersRequest, ListInstanceConsumerGroupMembersResponse> listInstanceConsumerGroupMembersInvoker(
        ListInstanceConsumerGroupMembersRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroupMembers, hcClient);
    }

    /**
     * 查询消费组消息位点
     *
     * 查询消费组消息位点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupMessageOffsetRequest 请求对象
     * @return ListInstanceConsumerGroupMessageOffsetResponse
     */
    public ListInstanceConsumerGroupMessageOffsetResponse listInstanceConsumerGroupMessageOffset(
        ListInstanceConsumerGroupMessageOffsetRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroupMessageOffset);
    }

    /**
     * 查询消费组消息位点
     *
     * 查询消费组消息位点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupMessageOffsetRequest 请求对象
     * @return SyncInvoker<ListInstanceConsumerGroupMessageOffsetRequest, ListInstanceConsumerGroupMessageOffsetResponse>
     */
    public SyncInvoker<ListInstanceConsumerGroupMessageOffsetRequest, ListInstanceConsumerGroupMessageOffsetResponse> listInstanceConsumerGroupMessageOffsetInvoker(
        ListInstanceConsumerGroupMessageOffsetRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroupMessageOffset, hcClient);
    }

    /**
     * 查询指定消费组的Topic
     *
     * 查询指定消费组的Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupTopicsRequest 请求对象
     * @return ListInstanceConsumerGroupTopicsResponse
     */
    public ListInstanceConsumerGroupTopicsResponse listInstanceConsumerGroupTopics(
        ListInstanceConsumerGroupTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroupTopics);
    }

    /**
     * 查询指定消费组的Topic
     *
     * 查询指定消费组的Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupTopicsRequest 请求对象
     * @return SyncInvoker<ListInstanceConsumerGroupTopicsRequest, ListInstanceConsumerGroupTopicsResponse>
     */
    public SyncInvoker<ListInstanceConsumerGroupTopicsRequest, ListInstanceConsumerGroupTopicsResponse> listInstanceConsumerGroupTopicsInvoker(
        ListInstanceConsumerGroupTopicsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroupTopics, hcClient);
    }

    /**
     * 查询所有消费组
     *
     * 查询所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return ListInstanceConsumerGroupsResponse
     */
    public ListInstanceConsumerGroupsResponse listInstanceConsumerGroups(ListInstanceConsumerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstanceConsumerGroups);
    }

    /**
     * 查询所有消费组
     *
     * 查询所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>
     */
    public SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsInvoker(
        ListInstanceConsumerGroupsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listInstanceConsumerGroups, hcClient);
    }

    /**
     * Kafka实例查询Topic
     *
     * 该接口用于查询指定Kafka实例的Topic详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopicsRequest 请求对象
     * @return ListInstanceTopicsResponse
     */
    public ListInstanceTopicsResponse listInstanceTopics(ListInstanceTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstanceTopics);
    }

    /**
     * Kafka实例查询Topic
     *
     * 该接口用于查询指定Kafka实例的Topic详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopicsRequest 请求对象
     * @return SyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse>
     */
    public SyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse> listInstanceTopicsInvoker(
        ListInstanceTopicsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listInstanceTopics, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstances);
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
        return new SyncInvoker<>(request, KafkaMeta.listInstances, hcClient);
    }

    /**
     * 查询消息积压诊断报告列表
     *
     * 查询消息积压诊断报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageDiagnosisReportsRequest 请求对象
     * @return ListMessageDiagnosisReportsResponse
     */
    public ListMessageDiagnosisReportsResponse listMessageDiagnosisReports(ListMessageDiagnosisReportsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listMessageDiagnosisReports);
    }

    /**
     * 查询消息积压诊断报告列表
     *
     * 查询消息积压诊断报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageDiagnosisReportsRequest 请求对象
     * @return SyncInvoker<ListMessageDiagnosisReportsRequest, ListMessageDiagnosisReportsResponse>
     */
    public SyncInvoker<ListMessageDiagnosisReportsRequest, ListMessageDiagnosisReportsResponse> listMessageDiagnosisReportsInvoker(
        ListMessageDiagnosisReportsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listMessageDiagnosisReports, hcClient);
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
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listProducts);
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
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listProducts, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.listScheduledTasks);
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
        return new SyncInvoker<>(request, KafkaMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询Topic的分区列表
     *
     * 查询Topic的分区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicPartitionsRequest 请求对象
     * @return ListTopicPartitionsResponse
     */
    public ListTopicPartitionsResponse listTopicPartitions(ListTopicPartitionsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listTopicPartitions);
    }

    /**
     * 查询Topic的分区列表
     *
     * 查询Topic的分区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicPartitionsRequest 请求对象
     * @return SyncInvoker<ListTopicPartitionsRequest, ListTopicPartitionsResponse>
     */
    public SyncInvoker<ListTopicPartitionsRequest, ListTopicPartitionsResponse> listTopicPartitionsInvoker(
        ListTopicPartitionsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listTopicPartitions, hcClient);
    }

    /**
     * 查询Topic的当前生产者列表
     *
     * 查询Topic的当前生产者列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicProducersRequest 请求对象
     * @return ListTopicProducersResponse
     */
    public ListTopicProducersResponse listTopicProducers(ListTopicProducersRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listTopicProducers);
    }

    /**
     * 查询Topic的当前生产者列表
     *
     * 查询Topic的当前生产者列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicProducersRequest 请求对象
     * @return SyncInvoker<ListTopicProducersRequest, ListTopicProducersResponse>
     */
    public SyncInvoker<ListTopicProducersRequest, ListTopicProducersResponse> listTopicProducersInvoker(
        ListTopicProducersRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listTopicProducers, hcClient);
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
     * @return ListUserPoliciesResponse
     */
    public ListUserPoliciesResponse listUserPolicies(ListUserPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listUserPolicies);
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
     * @return SyncInvoker<ListUserPoliciesRequest, ListUserPoliciesResponse>
     */
    public SyncInvoker<ListUserPoliciesRequest, ListUserPoliciesResponse> listUserPoliciesInvoker(
        ListUserPoliciesRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listUserPolicies, hcClient);
    }

    /**
     * 修改实例配置
     *
     * 修改实例配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceConfigsRequest 请求对象
     * @return ModifyInstanceConfigsResponse
     */
    public ModifyInstanceConfigsResponse modifyInstanceConfigs(ModifyInstanceConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.modifyInstanceConfigs);
    }

    /**
     * 修改实例配置
     *
     * 修改实例配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceConfigsRequest 请求对象
     * @return SyncInvoker<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse>
     */
    public SyncInvoker<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse> modifyInstanceConfigsInvoker(
        ModifyInstanceConfigsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.modifyInstanceConfigs, hcClient);
    }

    /**
     * 开启或者关闭Kafka实例公网访问功能
     *
     * 开启或者关闭Kafka实例公网访问功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyKafkaPublicIpAccessSwitchRequest 请求对象
     * @return ModifyKafkaPublicIpAccessSwitchResponse
     */
    public ModifyKafkaPublicIpAccessSwitchResponse modifyKafkaPublicIpAccessSwitch(
        ModifyKafkaPublicIpAccessSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.modifyKafkaPublicIpAccessSwitch);
    }

    /**
     * 开启或者关闭Kafka实例公网访问功能
     *
     * 开启或者关闭Kafka实例公网访问功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyKafkaPublicIpAccessSwitchRequest 请求对象
     * @return SyncInvoker<ModifyKafkaPublicIpAccessSwitchRequest, ModifyKafkaPublicIpAccessSwitchResponse>
     */
    public SyncInvoker<ModifyKafkaPublicIpAccessSwitchRequest, ModifyKafkaPublicIpAccessSwitchResponse> modifyKafkaPublicIpAccessSwitchInvoker(
        ModifyKafkaPublicIpAccessSwitchRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.modifyKafkaPublicIpAccessSwitch, hcClient);
    }

    /**
     * 修改Topic流控配置
     *
     * 该接口用于向Kafka实例提交修改Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyKafkaTopicQuotaRequest 请求对象
     * @return ModifyKafkaTopicQuotaResponse
     */
    public ModifyKafkaTopicQuotaResponse modifyKafkaTopicQuota(ModifyKafkaTopicQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.modifyKafkaTopicQuota);
    }

    /**
     * 修改Topic流控配置
     *
     * 该接口用于向Kafka实例提交修改Topic级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyKafkaTopicQuotaRequest 请求对象
     * @return SyncInvoker<ModifyKafkaTopicQuotaRequest, ModifyKafkaTopicQuotaResponse>
     */
    public SyncInvoker<ModifyKafkaTopicQuotaRequest, ModifyKafkaTopicQuotaResponse> modifyKafkaTopicQuotaInvoker(
        ModifyKafkaTopicQuotaRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.modifyKafkaTopicQuota, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.modifyRecyclePolicy);
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
        return new SyncInvoker<>(request, KafkaMeta.modifyRecyclePolicy, hcClient);
    }

    /**
     * 重置Manager密码
     *
     * 重置Manager密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetManagerPasswordRequest 请求对象
     * @return ResetManagerPasswordResponse
     */
    public ResetManagerPasswordResponse resetManagerPassword(ResetManagerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetManagerPassword);
    }

    /**
     * 重置Manager密码
     *
     * 重置Manager密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetManagerPasswordRequest 请求对象
     * @return SyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse>
     */
    public SyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse> resetManagerPasswordInvoker(
        ResetManagerPasswordRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resetManagerPassword, hcClient);
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
     * @return ResetMessageOffsetResponse
     */
    public ResetMessageOffsetResponse resetMessageOffset(ResetMessageOffsetRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetMessageOffset);
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
     * @return SyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse>
     */
    public SyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse> resetMessageOffsetInvoker(
        ResetMessageOffsetRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resetMessageOffset, hcClient);
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
     * @return ResetMessageOffsetWithEngineResponse
     */
    public ResetMessageOffsetWithEngineResponse resetMessageOffsetWithEngine(
        ResetMessageOffsetWithEngineRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetMessageOffsetWithEngine);
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
     * @return SyncInvoker<ResetMessageOffsetWithEngineRequest, ResetMessageOffsetWithEngineResponse>
     */
    public SyncInvoker<ResetMessageOffsetWithEngineRequest, ResetMessageOffsetWithEngineResponse> resetMessageOffsetWithEngineInvoker(
        ResetMessageOffsetWithEngineRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resetMessageOffsetWithEngine, hcClient);
    }

    /**
     * 重置密码
     *
     * 重置密码（只针对开通SSL的实例）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 重置密码（只针对开通SSL的实例）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resetPassword, hcClient);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswrodRequest 请求对象
     * @return ResetUserPasswrodResponse
     */
    public ResetUserPasswrodResponse resetUserPasswrod(ResetUserPasswrodRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetUserPasswrod);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswrodRequest 请求对象
     * @return SyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse>
     */
    public SyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse> resetUserPasswrodInvoker(
        ResetUserPasswrodRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resetUserPasswrod, hcClient);
    }

    /**
     * 实例扩容
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineInstanceRequest 请求对象
     * @return ResizeEngineInstanceResponse
     */
    public ResizeEngineInstanceResponse resizeEngineInstance(ResizeEngineInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resizeEngineInstance);
    }

    /**
     * 实例扩容
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineInstanceRequest 请求对象
     * @return SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse>
     */
    public SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstanceInvoker(
        ResizeEngineInstanceRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resizeEngineInstance, hcClient);
    }

    /**
     * 实例扩容
     *
     * 实例扩容。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resizeInstance);
    }

    /**
     * 实例扩容
     *
     * 实例扩容。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resizeInstance, hcClient);
    }

    /**
     * 实例扩容
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeKafkaInstanceRequest 请求对象
     * @return ResizeKafkaInstanceResponse
     */
    public ResizeKafkaInstanceResponse resizeKafkaInstance(ResizeKafkaInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resizeKafkaInstance);
    }

    /**
     * 实例扩容
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例扩容。](tag:hws,hws_hk,ctc,cmcc,hws_eu,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeKafkaInstanceRequest 请求对象
     * @return SyncInvoker<ResizeKafkaInstanceRequest, ResizeKafkaInstanceResponse>
     */
    public SyncInvoker<ResizeKafkaInstanceRequest, ResizeKafkaInstanceResponse> resizeKafkaInstanceInvoker(
        ResizeKafkaInstanceRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resizeKafkaInstance, hcClient);
    }

    /**
     * 重启Manager
     *
     * 重启Manager。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartManagerRequest 请求对象
     * @return RestartManagerResponse
     */
    public RestartManagerResponse restartManager(RestartManagerRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.restartManager);
    }

    /**
     * 重启Manager
     *
     * 重启Manager。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartManagerRequest 请求对象
     * @return SyncInvoker<RestartManagerRequest, RestartManagerResponse>
     */
    public SyncInvoker<RestartManagerRequest, RestartManagerResponse> restartManagerInvoker(
        RestartManagerRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.restartManager, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.restoreRecycleInstance);
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
        return new SyncInvoker<>(request, KafkaMeta.restoreRecycleInstance, hcClient);
    }

    /**
     * Kafka生产消息
     *
     * 在控制台发送指定消息到Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendKafkaMessageRequest 请求对象
     * @return SendKafkaMessageResponse
     */
    public SendKafkaMessageResponse sendKafkaMessage(SendKafkaMessageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.sendKafkaMessage);
    }

    /**
     * Kafka生产消息
     *
     * 在控制台发送指定消息到Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendKafkaMessageRequest 请求对象
     * @return SyncInvoker<SendKafkaMessageRequest, SendKafkaMessageResponse>
     */
    public SyncInvoker<SendKafkaMessageRequest, SendKafkaMessageResponse> sendKafkaMessageInvoker(
        SendKafkaMessageRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.sendKafkaMessage, hcClient);
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
     * @return SetUserPoliciesResponse
     */
    public SetUserPoliciesResponse setUserPolicies(SetUserPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.setUserPolicies);
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
     * @return SyncInvoker<SetUserPoliciesRequest, SetUserPoliciesResponse>
     */
    public SyncInvoker<SetUserPoliciesRequest, SetUserPoliciesResponse> setUserPoliciesInvoker(
        SetUserPoliciesRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.setUserPolicies, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showBackgroundTask);
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
        return new SyncInvoker<>(request, KafkaMeta.showBackgroundTask, hcClient);
    }

    /**
     * 查询后台任务中的指定实例的变更进度
     *
     * 查询后台任务中的指定实例的变更进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return ShowBackgroundTaskProgressResponse
     */
    public ShowBackgroundTaskProgressResponse showBackgroundTaskProgress(ShowBackgroundTaskProgressRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showBackgroundTaskProgress);
    }

    /**
     * 查询后台任务中的指定实例的变更进度
     *
     * 查询后台任务中的指定实例的变更进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return SyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse>
     */
    public SyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressInvoker(
        ShowBackgroundTaskProgressRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showBackgroundTaskProgress, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showCesHierarchy);
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
        return new SyncInvoker<>(request, KafkaMeta.showCesHierarchy, hcClient);
    }

    /**
     * 查询Kafka集群元数据信息
     *
     * 查询Kafka集群元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return ShowClusterResponse
     */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showCluster);
    }

    /**
     * 查询Kafka集群元数据信息
     *
     * 查询Kafka集群元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showCluster, hcClient);
    }

    /**
     * 查询Kafka实例的协调器信息
     *
     * 查询Kafka实例的协调器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCoordinatorsRequest 请求对象
     * @return ShowCoordinatorsResponse
     */
    public ShowCoordinatorsResponse showCoordinators(ShowCoordinatorsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showCoordinators);
    }

    /**
     * 查询Kafka实例的协调器信息
     *
     * 查询Kafka实例的协调器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCoordinatorsRequest 请求对象
     * @return SyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse>
     */
    public SyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse> showCoordinatorsInvoker(
        ShowCoordinatorsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showCoordinators, hcClient);
    }

    /**
     * 消息积压诊断预检查
     *
     * 消息积压诊断预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisPreCheckRequest 请求对象
     * @return ShowDiagnosisPreCheckResponse
     */
    public ShowDiagnosisPreCheckResponse showDiagnosisPreCheck(ShowDiagnosisPreCheckRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showDiagnosisPreCheck);
    }

    /**
     * 消息积压诊断预检查
     *
     * 消息积压诊断预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisPreCheckRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisPreCheckRequest, ShowDiagnosisPreCheckResponse>
     */
    public SyncInvoker<ShowDiagnosisPreCheckRequest, ShowDiagnosisPreCheckResponse> showDiagnosisPreCheckInvoker(
        ShowDiagnosisPreCheckRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showDiagnosisPreCheck, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showEngineInstanceExtendProductInfo);
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
        return new SyncInvoker<>(request, KafkaMeta.showEngineInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询指定消费组信息
     *
     * 查询指定消费组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return ShowGroupResponse
     */
    public ShowGroupResponse showGroup(ShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showGroup);
    }

    /**
     * 查询指定消费组信息
     *
     * 查询指定消费组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return SyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public SyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupInvoker(ShowGroupRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showGroup, hcClient);
    }

    /**
     * 查询消费组信息
     *
     * 查询消费组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsRequest 请求对象
     * @return ShowGroupsResponse
     */
    public ShowGroupsResponse showGroups(ShowGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showGroups);
    }

    /**
     * 查询消费组信息
     *
     * 查询消费组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsRequest 请求对象
     * @return SyncInvoker<ShowGroupsRequest, ShowGroupsResponse>
     */
    public SyncInvoker<ShowGroupsRequest, ShowGroupsResponse> showGroupsInvoker(ShowGroupsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showGroups, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstance);
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
        return new SyncInvoker<>(request, KafkaMeta.showInstance, hcClient);
    }

    /**
     * 获取实例配置
     *
     * 获取实例配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigsRequest 请求对象
     * @return ShowInstanceConfigsResponse
     */
    public ShowInstanceConfigsResponse showInstanceConfigs(ShowInstanceConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceConfigs);
    }

    /**
     * 获取实例配置
     *
     * 获取实例配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigsRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse>
     */
    public SyncInvoker<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse> showInstanceConfigsInvoker(
        ShowInstanceConfigsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showInstanceConfigs, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceExtendProductInfoRequest 请求对象
     * @return ShowInstanceExtendProductInfoResponse
     */
    public ShowInstanceExtendProductInfoResponse showInstanceExtendProductInfo(
        ShowInstanceExtendProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceExtendProductInfo);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoInvoker(
        ShowInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showInstanceExtendProductInfo, hcClient);
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
     * @return ShowInstanceMessagesResponse
     */
    public ShowInstanceMessagesResponse showInstanceMessages(ShowInstanceMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceMessages);
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
     * @return SyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse>
     */
    public SyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> showInstanceMessagesInvoker(
        ShowInstanceMessagesRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showInstanceMessages, hcClient);
    }

    /**
     * 查询Kafka实例Topic详细信息
     *
     * 查询Kafka实例Topic详细信息。(单个实例调用不要超过1s一次)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTopicDetailRequest 请求对象
     * @return ShowInstanceTopicDetailResponse
     */
    public ShowInstanceTopicDetailResponse showInstanceTopicDetail(ShowInstanceTopicDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceTopicDetail);
    }

    /**
     * 查询Kafka实例Topic详细信息
     *
     * 查询Kafka实例Topic详细信息。(单个实例调用不要超过1s一次)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTopicDetailRequest 请求对象
     * @return SyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse>
     */
    public SyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> showInstanceTopicDetailInvoker(
        ShowInstanceTopicDetailRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showInstanceTopicDetail, hcClient);
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
     * @return ShowInstanceUsersResponse
     */
    public ShowInstanceUsersResponse showInstanceUsers(ShowInstanceUsersRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceUsers);
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
     * @return SyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse>
     */
    public SyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse> showInstanceUsersInvoker(
        ShowInstanceUsersRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showInstanceUsers, hcClient);
    }

    /**
     * 查询Kafka集群信息
     *
     * 查询Kafka集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaClusterRequest 请求对象
     * @return ShowKafkaClusterResponse
     */
    public ShowKafkaClusterResponse showKafkaCluster(ShowKafkaClusterRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaCluster);
    }

    /**
     * 查询Kafka集群信息
     *
     * 查询Kafka集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaClusterRequest 请求对象
     * @return SyncInvoker<ShowKafkaClusterRequest, ShowKafkaClusterResponse>
     */
    public SyncInvoker<ShowKafkaClusterRequest, ShowKafkaClusterResponse> showKafkaClusterInvoker(
        ShowKafkaClusterRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaCluster, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaInstanceExtendProductInfoRequest 请求对象
     * @return ShowKafkaInstanceExtendProductInfoResponse
     */
    public ShowKafkaInstanceExtendProductInfoResponse showKafkaInstanceExtendProductInfo(
        ShowKafkaInstanceExtendProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaInstanceExtendProductInfo);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowKafkaInstanceExtendProductInfoRequest, ShowKafkaInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowKafkaInstanceExtendProductInfoRequest, ShowKafkaInstanceExtendProductInfoResponse> showKafkaInstanceExtendProductInfoInvoker(
        ShowKafkaInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询Kafka产品规格核数
     *
     * 查询Kafka产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaProductCoresRequest 请求对象
     * @return ShowKafkaProductCoresResponse
     */
    public ShowKafkaProductCoresResponse showKafkaProductCores(ShowKafkaProductCoresRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaProductCores);
    }

    /**
     * 查询Kafka产品规格核数
     *
     * 查询Kafka产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaProductCoresRequest 请求对象
     * @return SyncInvoker<ShowKafkaProductCoresRequest, ShowKafkaProductCoresResponse>
     */
    public SyncInvoker<ShowKafkaProductCoresRequest, ShowKafkaProductCoresResponse> showKafkaProductCoresInvoker(
        ShowKafkaProductCoresRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaProductCores, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaProjectTagsRequest 请求对象
     * @return ShowKafkaProjectTagsResponse
     */
    public ShowKafkaProjectTagsResponse showKafkaProjectTags(ShowKafkaProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaProjectTagsRequest 请求对象
     * @return SyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse>
     */
    public SyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> showKafkaProjectTagsInvoker(
        ShowKafkaProjectTagsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaProjectTags, hcClient);
    }

    /**
     * 查询Kafka实例重平衡日志详情
     *
     * 查询Kafka实例重平衡日志详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaRebalanceLogRequest 请求对象
     * @return ShowKafkaRebalanceLogResponse
     */
    public ShowKafkaRebalanceLogResponse showKafkaRebalanceLog(ShowKafkaRebalanceLogRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaRebalanceLog);
    }

    /**
     * 查询Kafka实例重平衡日志详情
     *
     * 查询Kafka实例重平衡日志详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaRebalanceLogRequest 请求对象
     * @return SyncInvoker<ShowKafkaRebalanceLogRequest, ShowKafkaRebalanceLogResponse>
     */
    public SyncInvoker<ShowKafkaRebalanceLogRequest, ShowKafkaRebalanceLogResponse> showKafkaRebalanceLogInvoker(
        ShowKafkaRebalanceLogRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaRebalanceLog, hcClient);
    }

    /**
     * 获取Kafka实例扩容前置检查信息
     *
     * 获取Kafka实例扩容前置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaScalePreCheckInfoRequest 请求对象
     * @return ShowKafkaScalePreCheckInfoResponse
     */
    public ShowKafkaScalePreCheckInfoResponse showKafkaScalePreCheckInfo(ShowKafkaScalePreCheckInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaScalePreCheckInfo);
    }

    /**
     * 获取Kafka实例扩容前置检查信息
     *
     * 获取Kafka实例扩容前置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaScalePreCheckInfoRequest 请求对象
     * @return SyncInvoker<ShowKafkaScalePreCheckInfoRequest, ShowKafkaScalePreCheckInfoResponse>
     */
    public SyncInvoker<ShowKafkaScalePreCheckInfoRequest, ShowKafkaScalePreCheckInfoResponse> showKafkaScalePreCheckInfoInvoker(
        ShowKafkaScalePreCheckInfoRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaScalePreCheckInfo, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTagsRequest 请求对象
     * @return ShowKafkaTagsResponse
     */
    public ShowKafkaTagsResponse showKafkaTags(ShowKafkaTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTagsRequest 请求对象
     * @return SyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse>
     */
    public SyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse> showKafkaTagsInvoker(ShowKafkaTagsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaTags, hcClient);
    }

    /**
     * 获取Kafka Topic详细信息
     *
     * 获取Kafka Topic详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicDetailRequest 请求对象
     * @return ShowKafkaTopicDetailResponse
     */
    public ShowKafkaTopicDetailResponse showKafkaTopicDetail(ShowKafkaTopicDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaTopicDetail);
    }

    /**
     * 获取Kafka Topic详细信息
     *
     * 获取Kafka Topic详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicDetailRequest 请求对象
     * @return SyncInvoker<ShowKafkaTopicDetailRequest, ShowKafkaTopicDetailResponse>
     */
    public SyncInvoker<ShowKafkaTopicDetailRequest, ShowKafkaTopicDetailResponse> showKafkaTopicDetailInvoker(
        ShowKafkaTopicDetailRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaTopicDetail, hcClient);
    }

    /**
     * 查询Topic的磁盘存储情况
     *
     * 查询Topic在Broker上磁盘占用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicPartitionDiskusageRequest 请求对象
     * @return ShowKafkaTopicPartitionDiskusageResponse
     */
    public ShowKafkaTopicPartitionDiskusageResponse showKafkaTopicPartitionDiskusage(
        ShowKafkaTopicPartitionDiskusageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaTopicPartitionDiskusage);
    }

    /**
     * 查询Topic的磁盘存储情况
     *
     * 查询Topic在Broker上磁盘占用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicPartitionDiskusageRequest 请求对象
     * @return SyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse>
     */
    public SyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> showKafkaTopicPartitionDiskusageInvoker(
        ShowKafkaTopicPartitionDiskusageRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaTopicPartitionDiskusage, hcClient);
    }

    /**
     * 查询Topic流控配置
     *
     * 该接口用于查询Topic级别的流控任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicQuotaRequest 请求对象
     * @return ShowKafkaTopicQuotaResponse
     */
    public ShowKafkaTopicQuotaResponse showKafkaTopicQuota(ShowKafkaTopicQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaTopicQuota);
    }

    /**
     * 查询Topic流控配置
     *
     * 该接口用于查询Topic级别的流控任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaTopicQuotaRequest 请求对象
     * @return SyncInvoker<ShowKafkaTopicQuotaRequest, ShowKafkaTopicQuotaResponse>
     */
    public SyncInvoker<ShowKafkaTopicQuotaRequest, ShowKafkaTopicQuotaResponse> showKafkaTopicQuotaInvoker(
        ShowKafkaTopicQuotaRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaTopicQuota, hcClient);
    }

    /**
     * 查询用户/客户端流控配置
     *
     * 该接口用于向Kafka实例查询流控的配置，若成功则返回流控配置的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaUserClientQuotaRequest 请求对象
     * @return ShowKafkaUserClientQuotaResponse
     */
    public ShowKafkaUserClientQuotaResponse showKafkaUserClientQuota(ShowKafkaUserClientQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showKafkaUserClientQuota);
    }

    /**
     * 查询用户/客户端流控配置
     *
     * 该接口用于向Kafka实例查询流控的配置，若成功则返回流控配置的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKafkaUserClientQuotaRequest 请求对象
     * @return SyncInvoker<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse>
     */
    public SyncInvoker<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse> showKafkaUserClientQuotaInvoker(
        ShowKafkaUserClientQuotaRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showKafkaUserClientQuota, hcClient);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMaintainWindowsRequest 请求对象
     * @return ShowMaintainWindowsResponse
     */
    public ShowMaintainWindowsResponse showMaintainWindows(ShowMaintainWindowsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showMaintainWindows);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMaintainWindowsRequest 请求对象
     * @return SyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse>
     */
    public SyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindowsInvoker(
        ShowMaintainWindowsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showMaintainWindows, hcClient);
    }

    /**
     * 查询诊断报告详情
     *
     * 查询诊断报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageDiagnosisReportRequest 请求对象
     * @return ShowMessageDiagnosisReportResponse
     */
    public ShowMessageDiagnosisReportResponse showMessageDiagnosisReport(ShowMessageDiagnosisReportRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showMessageDiagnosisReport);
    }

    /**
     * 查询诊断报告详情
     *
     * 查询诊断报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageDiagnosisReportRequest 请求对象
     * @return SyncInvoker<ShowMessageDiagnosisReportRequest, ShowMessageDiagnosisReportResponse>
     */
    public SyncInvoker<ShowMessageDiagnosisReportRequest, ShowMessageDiagnosisReportResponse> showMessageDiagnosisReportInvoker(
        ShowMessageDiagnosisReportRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showMessageDiagnosisReport, hcClient);
    }

    /**
     * 查询分区指定时间段的消息
     *
     * 查询分区指定时间段的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessagesRequest 请求对象
     * @return ShowMessagesResponse
     */
    public ShowMessagesResponse showMessages(ShowMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showMessages);
    }

    /**
     * 查询分区指定时间段的消息
     *
     * 查询分区指定时间段的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessagesRequest 请求对象
     * @return SyncInvoker<ShowMessagesRequest, ShowMessagesResponse>
     */
    public SyncInvoker<ShowMessagesRequest, ShowMessagesResponse> showMessagesInvoker(ShowMessagesRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showMessages, hcClient);
    }

    /**
     * 查询分区最早消息的位置
     *
     * 查询分区最早消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionBeginningMessageRequest 请求对象
     * @return ShowPartitionBeginningMessageResponse
     */
    public ShowPartitionBeginningMessageResponse showPartitionBeginningMessage(
        ShowPartitionBeginningMessageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showPartitionBeginningMessage);
    }

    /**
     * 查询分区最早消息的位置
     *
     * 查询分区最早消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionBeginningMessageRequest 请求对象
     * @return SyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse>
     */
    public SyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> showPartitionBeginningMessageInvoker(
        ShowPartitionBeginningMessageRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showPartitionBeginningMessage, hcClient);
    }

    /**
     * 查询分区最新消息的位置
     *
     * 查询分区最新消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionEndMessageRequest 请求对象
     * @return ShowPartitionEndMessageResponse
     */
    public ShowPartitionEndMessageResponse showPartitionEndMessage(ShowPartitionEndMessageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showPartitionEndMessage);
    }

    /**
     * 查询分区最新消息的位置
     *
     * 查询分区最新消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionEndMessageRequest 请求对象
     * @return SyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse>
     */
    public SyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> showPartitionEndMessageInvoker(
        ShowPartitionEndMessageRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showPartitionEndMessage, hcClient);
    }

    /**
     * 查询分区指定偏移量的消息
     *
     * 查询分区指定偏移量的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionMessageRequest 请求对象
     * @return ShowPartitionMessageResponse
     */
    public ShowPartitionMessageResponse showPartitionMessage(ShowPartitionMessageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showPartitionMessage);
    }

    /**
     * 查询分区指定偏移量的消息
     *
     * 查询分区指定偏移量的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartitionMessageRequest 请求对象
     * @return SyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse>
     */
    public SyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse> showPartitionMessageInvoker(
        ShowPartitionMessageRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showPartitionMessage, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showQuotas);
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
        return new SyncInvoker<>(request, KafkaMeta.showQuotas, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showRecycleInstances);
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
        return new SyncInvoker<>(request, KafkaMeta.showRecycleInstances, hcClient);
    }

    /**
     * 查询旧规格升级新规格映射
     *
     * 查询旧规格实例可升级的新规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecConvertProductRequest 请求对象
     * @return ShowSpecConvertProductResponse
     */
    public ShowSpecConvertProductResponse showSpecConvertProduct(ShowSpecConvertProductRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showSpecConvertProduct);
    }

    /**
     * 查询旧规格升级新规格映射
     *
     * 查询旧规格实例可升级的新规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecConvertProductRequest 请求对象
     * @return SyncInvoker<ShowSpecConvertProductRequest, ShowSpecConvertProductResponse>
     */
    public SyncInvoker<ShowSpecConvertProductRequest, ShowSpecConvertProductResponse> showSpecConvertProductInvoker(
        ShowSpecConvertProductRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showSpecConvertProduct, hcClient);
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
     * @return ShowTopicAccessPolicyResponse
     */
    public ShowTopicAccessPolicyResponse showTopicAccessPolicy(ShowTopicAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showTopicAccessPolicy);
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
     * @return SyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse>
     */
    public SyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> showTopicAccessPolicyInvoker(
        ShowTopicAccessPolicyRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showTopicAccessPolicy, hcClient);
    }

    /**
     * 查询Kafka实例版本信息
     *
     * 查询Kafka实例版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeInstanceVersionRequest 请求对象
     * @return ShowUpgradeInstanceVersionResponse
     */
    public ShowUpgradeInstanceVersionResponse showUpgradeInstanceVersion(ShowUpgradeInstanceVersionRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showUpgradeInstanceVersion);
    }

    /**
     * 查询Kafka实例版本信息
     *
     * 查询Kafka实例版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeInstanceVersionRequest 请求对象
     * @return SyncInvoker<ShowUpgradeInstanceVersionRequest, ShowUpgradeInstanceVersionResponse>
     */
    public SyncInvoker<ShowUpgradeInstanceVersionRequest, ShowUpgradeInstanceVersionResponse> showUpgradeInstanceVersionInvoker(
        ShowUpgradeInstanceVersionRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showUpgradeInstanceVersion, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showVolumeExpandConfig);
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
        return new SyncInvoker<>(request, KafkaMeta.showVolumeExpandConfig, hcClient);
    }

    /**
     * 关闭Kafka实例重平衡日志功能
     *
     * 关闭Kafka实例重平衡日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopKafkaRebalanceLogTaskRequest 请求对象
     * @return StopKafkaRebalanceLogTaskResponse
     */
    public StopKafkaRebalanceLogTaskResponse stopKafkaRebalanceLogTask(StopKafkaRebalanceLogTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.stopKafkaRebalanceLogTask);
    }

    /**
     * 关闭Kafka实例重平衡日志功能
     *
     * 关闭Kafka实例重平衡日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopKafkaRebalanceLogTaskRequest 请求对象
     * @return SyncInvoker<StopKafkaRebalanceLogTaskRequest, StopKafkaRebalanceLogTaskResponse>
     */
    public SyncInvoker<StopKafkaRebalanceLogTaskRequest, StopKafkaRebalanceLogTaskResponse> stopKafkaRebalanceLogTaskInvoker(
        StopKafkaRebalanceLogTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.stopKafkaRebalanceLogTask, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateInstance, hcClient);
    }

    /**
     * 开启或关闭实例自动创建Topic功能
     *
     * 开启或关闭实例自动创建Topic功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return UpdateInstanceAutoCreateTopicResponse
     */
    public UpdateInstanceAutoCreateTopicResponse updateInstanceAutoCreateTopic(
        UpdateInstanceAutoCreateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstanceAutoCreateTopic);
    }

    /**
     * 开启或关闭实例自动创建Topic功能
     *
     * 开启或关闭实例自动创建Topic功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return SyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse>
     */
    public SyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopicInvoker(
        UpdateInstanceAutoCreateTopicRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateInstanceAutoCreateTopic, hcClient);
    }

    /**
     * 修改指定消费组
     *
     * 修改指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConsumerGroupRequest 请求对象
     * @return UpdateInstanceConsumerGroupResponse
     */
    public UpdateInstanceConsumerGroupResponse updateInstanceConsumerGroup(UpdateInstanceConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstanceConsumerGroup);
    }

    /**
     * 修改指定消费组
     *
     * 修改指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConsumerGroupRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse>
     */
    public SyncInvoker<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse> updateInstanceConsumerGroupInvoker(
        UpdateInstanceConsumerGroupRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateInstanceConsumerGroup, hcClient);
    }

    /**
     * 修改实例跨VPC访问的内网IP
     *
     * 修改实例跨VPC访问的内网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceCrossVpcIpRequest 请求对象
     * @return UpdateInstanceCrossVpcIpResponse
     */
    public UpdateInstanceCrossVpcIpResponse updateInstanceCrossVpcIp(UpdateInstanceCrossVpcIpRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstanceCrossVpcIp);
    }

    /**
     * 修改实例跨VPC访问的内网IP
     *
     * 修改实例跨VPC访问的内网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceCrossVpcIpRequest 请求对象
     * @return SyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse>
     */
    public SyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIpInvoker(
        UpdateInstanceCrossVpcIpRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateInstanceCrossVpcIp, hcClient);
    }

    /**
     * 修改所有消费组
     *
     * 修改所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return UpdateInstanceGroupResponse
     */
    public UpdateInstanceGroupResponse updateInstanceGroup(UpdateInstanceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstanceGroup);
    }

    /**
     * 修改所有消费组
     *
     * 修改所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return SyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse>
     */
    public SyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse> updateInstanceGroupInvoker(
        UpdateInstanceGroupRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateInstanceGroup, hcClient);
    }

    /**
     * 修改Kafka实例Topic
     *
     * 修改Kafka实例Topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceTopicRequest 请求对象
     * @return UpdateInstanceTopicResponse
     */
    public UpdateInstanceTopicResponse updateInstanceTopic(UpdateInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstanceTopic);
    }

    /**
     * 修改Kafka实例Topic
     *
     * 修改Kafka实例Topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceTopicRequest 请求对象
     * @return SyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse>
     */
    public SyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> updateInstanceTopicInvoker(
        UpdateInstanceTopicRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateInstanceTopic, hcClient);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceUserRequest 请求对象
     * @return UpdateInstanceUserResponse
     */
    public UpdateInstanceUserResponse updateInstanceUser(UpdateInstanceUserRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstanceUser);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceUserRequest 请求对象
     * @return SyncInvoker<UpdateInstanceUserRequest, UpdateInstanceUserResponse>
     */
    public SyncInvoker<UpdateInstanceUserRequest, UpdateInstanceUserResponse> updateInstanceUserInvoker(
        UpdateInstanceUserRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateInstanceUser, hcClient);
    }

    /**
     * 修改Kafka的接入方式
     *
     * 修改Kafka的内网或者公网接入方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKafkaPortProtocolRequest 请求对象
     * @return UpdateKafkaPortProtocolResponse
     */
    public UpdateKafkaPortProtocolResponse updateKafkaPortProtocol(UpdateKafkaPortProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateKafkaPortProtocol);
    }

    /**
     * 修改Kafka的接入方式
     *
     * 修改Kafka的内网或者公网接入方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKafkaPortProtocolRequest 请求对象
     * @return SyncInvoker<UpdateKafkaPortProtocolRequest, UpdateKafkaPortProtocolResponse>
     */
    public SyncInvoker<UpdateKafkaPortProtocolRequest, UpdateKafkaPortProtocolResponse> updateKafkaPortProtocolInvoker(
        UpdateKafkaPortProtocolRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateKafkaPortProtocol, hcClient);
    }

    /**
     * 修改用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交修改用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKafkaUserClientQuotaTaskRequest 请求对象
     * @return UpdateKafkaUserClientQuotaTaskResponse
     */
    public UpdateKafkaUserClientQuotaTaskResponse updateKafkaUserClientQuotaTask(
        UpdateKafkaUserClientQuotaTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateKafkaUserClientQuotaTask);
    }

    /**
     * 修改用户/客户端流控配置
     *
     * 该接口用于向Kafka实例提交修改用户、客户端级别的流控任务，若成功则返回流控任务的job_id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKafkaUserClientQuotaTaskRequest 请求对象
     * @return SyncInvoker<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse>
     */
    public SyncInvoker<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse> updateKafkaUserClientQuotaTaskInvoker(
        UpdateKafkaUserClientQuotaTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateKafkaUserClientQuotaTask, hcClient);
    }

    /**
     * 修改指定的定时任务
     *
     * 修改指定的定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return UpdateScheduledTaskResponse
     */
    public UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateScheduledTask);
    }

    /**
     * 修改指定的定时任务
     *
     * 修改指定的定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return SyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
     */
    public SyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTaskInvoker(
        UpdateScheduledTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateScheduledTask, hcClient);
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
     * @return UpdateTopicAccessPolicyResponse
     */
    public UpdateTopicAccessPolicyResponse updateTopicAccessPolicy(UpdateTopicAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateTopicAccessPolicy);
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
     * @return SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>
     */
    public SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyInvoker(
        UpdateTopicAccessPolicyRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateTopicAccessPolicy, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateVolumeExpansionConfig);
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
        return new SyncInvoker<>(request, KafkaMeta.updateVolumeExpansionConfig, hcClient);
    }

    /**
     * 实例升级
     *
     * 实例内核升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceRequest 请求对象
     * @return UpgradeInstanceResponse
     */
    public UpgradeInstanceResponse upgradeInstance(UpgradeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.upgradeInstance);
    }

    /**
     * 实例升级
     *
     * 实例内核升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceRequest 请求对象
     * @return SyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse>
     */
    public SyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse> upgradeInstanceInvoker(
        UpgradeInstanceRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.upgradeInstance, hcClient);
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
     * @return CreateConnectorResponse
     */
    public CreateConnectorResponse createConnector(CreateConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createConnector);
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
     * @return SyncInvoker<CreateConnectorRequest, CreateConnectorResponse>
     */
    public SyncInvoker<CreateConnectorRequest, CreateConnectorResponse> createConnectorInvoker(
        CreateConnectorRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createConnector, hcClient);
    }

    /**
     * 创建Smart Connect任务
     *
     * 创建Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectorTaskRequest 请求对象
     * @return CreateConnectorTaskResponse
     */
    public CreateConnectorTaskResponse createConnectorTask(CreateConnectorTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createConnectorTask);
    }

    /**
     * 创建Smart Connect任务
     *
     * 创建Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectorTaskRequest 请求对象
     * @return SyncInvoker<CreateConnectorTaskRequest, CreateConnectorTaskResponse>
     */
    public SyncInvoker<CreateConnectorTaskRequest, CreateConnectorTaskResponse> createConnectorTaskInvoker(
        CreateConnectorTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createConnectorTask, hcClient);
    }

    /**
     * 关闭Smart Connect（按需实例）
     *
     * 介绍按需实例如何关闭Smart Connect。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorRequest 请求对象
     * @return DeleteConnectorResponse
     */
    public DeleteConnectorResponse deleteConnector(DeleteConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteConnector);
    }

    /**
     * 关闭Smart Connect（按需实例）
     *
     * 介绍按需实例如何关闭Smart Connect。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorRequest 请求对象
     * @return SyncInvoker<DeleteConnectorRequest, DeleteConnectorResponse>
     */
    public SyncInvoker<DeleteConnectorRequest, DeleteConnectorResponse> deleteConnectorInvoker(
        DeleteConnectorRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteConnector, hcClient);
    }

    /**
     * 删除Smart Connect任务
     *
     * 删除Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorTaskRequest 请求对象
     * @return DeleteConnectorTaskResponse
     */
    public DeleteConnectorTaskResponse deleteConnectorTask(DeleteConnectorTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteConnectorTask);
    }

    /**
     * 删除Smart Connect任务
     *
     * 删除Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorTaskRequest 请求对象
     * @return SyncInvoker<DeleteConnectorTaskRequest, DeleteConnectorTaskResponse>
     */
    public SyncInvoker<DeleteConnectorTaskRequest, DeleteConnectorTaskResponse> deleteConnectorTaskInvoker(
        DeleteConnectorTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteConnectorTask, hcClient);
    }

    /**
     * 查询Smart Connect任务列表
     *
     * 查询Smart Connect任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectorTasksRequest 请求对象
     * @return ListConnectorTasksResponse
     */
    public ListConnectorTasksResponse listConnectorTasks(ListConnectorTasksRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listConnectorTasks);
    }

    /**
     * 查询Smart Connect任务列表
     *
     * 查询Smart Connect任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectorTasksRequest 请求对象
     * @return SyncInvoker<ListConnectorTasksRequest, ListConnectorTasksResponse>
     */
    public SyncInvoker<ListConnectorTasksRequest, ListConnectorTasksResponse> listConnectorTasksInvoker(
        ListConnectorTasksRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listConnectorTasks, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return ListObsBucketsResponse
     */
    public ListObsBucketsResponse listObsBuckets(ListObsBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listObsBuckets);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsInvoker(
        ListObsBucketsRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listObsBuckets, hcClient);
    }

    /**
     * 修改Smart Connect任务配置
     *
     * 修改Smart Connect任务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyConnectorTaskRequest 请求对象
     * @return ModifyConnectorTaskResponse
     */
    public ModifyConnectorTaskResponse modifyConnectorTask(ModifyConnectorTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.modifyConnectorTask);
    }

    /**
     * 修改Smart Connect任务配置
     *
     * 修改Smart Connect任务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyConnectorTaskRequest 请求对象
     * @return SyncInvoker<ModifyConnectorTaskRequest, ModifyConnectorTaskResponse>
     */
    public SyncInvoker<ModifyConnectorTaskRequest, ModifyConnectorTaskResponse> modifyConnectorTaskInvoker(
        ModifyConnectorTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.modifyConnectorTask, hcClient);
    }

    /**
     * 暂停Smart Connect任务
     *
     * 暂停Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseConnectorTaskRequest 请求对象
     * @return PauseConnectorTaskResponse
     */
    public PauseConnectorTaskResponse pauseConnectorTask(PauseConnectorTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.pauseConnectorTask);
    }

    /**
     * 暂停Smart Connect任务
     *
     * 暂停Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseConnectorTaskRequest 请求对象
     * @return SyncInvoker<PauseConnectorTaskRequest, PauseConnectorTaskResponse>
     */
    public SyncInvoker<PauseConnectorTaskRequest, PauseConnectorTaskResponse> pauseConnectorTaskInvoker(
        PauseConnectorTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.pauseConnectorTask, hcClient);
    }

    /**
     * 启动未启动的Smart Connect任务/重启已暂停或者运行中的Smart Connect任务
     *
     * 用于**启动未启动的Smart Connect任务**以及**重启已暂停或者运行中的Smart Connect任务**。注意，重启Smart Connect任务将重置同步进度，并重新开始同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartConnectorTaskRequest 请求对象
     * @return RestartConnectorTaskResponse
     */
    public RestartConnectorTaskResponse restartConnectorTask(RestartConnectorTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.restartConnectorTask);
    }

    /**
     * 启动未启动的Smart Connect任务/重启已暂停或者运行中的Smart Connect任务
     *
     * 用于**启动未启动的Smart Connect任务**以及**重启已暂停或者运行中的Smart Connect任务**。注意，重启Smart Connect任务将重置同步进度，并重新开始同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartConnectorTaskRequest 请求对象
     * @return SyncInvoker<RestartConnectorTaskRequest, RestartConnectorTaskResponse>
     */
    public SyncInvoker<RestartConnectorTaskRequest, RestartConnectorTaskResponse> restartConnectorTaskInvoker(
        RestartConnectorTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.restartConnectorTask, hcClient);
    }

    /**
     * 启动未启动的Smart Connect任务/重启Smart Connect任务
     *
     * 启动未启动的Smart Connect任务/重启Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartSmartConnectorTaskRequest 请求对象
     * @return RestartSmartConnectorTaskResponse
     */
    public RestartSmartConnectorTaskResponse restartSmartConnectorTask(RestartSmartConnectorTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.restartSmartConnectorTask);
    }

    /**
     * 启动未启动的Smart Connect任务/重启Smart Connect任务
     *
     * 启动未启动的Smart Connect任务/重启Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartSmartConnectorTaskRequest 请求对象
     * @return SyncInvoker<RestartSmartConnectorTaskRequest, RestartSmartConnectorTaskResponse>
     */
    public SyncInvoker<RestartSmartConnectorTaskRequest, RestartSmartConnectorTaskResponse> restartSmartConnectorTaskInvoker(
        RestartSmartConnectorTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.restartSmartConnectorTask, hcClient);
    }

    /**
     * 启动已暂停的Smart Connect任务
     *
     * 启动已暂停的Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeConnectorTaskRequest 请求对象
     * @return ResumeConnectorTaskResponse
     */
    public ResumeConnectorTaskResponse resumeConnectorTask(ResumeConnectorTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resumeConnectorTask);
    }

    /**
     * 启动已暂停的Smart Connect任务
     *
     * 启动已暂停的Smart Connect任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeConnectorTaskRequest 请求对象
     * @return SyncInvoker<ResumeConnectorTaskRequest, ResumeConnectorTaskResponse>
     */
    public SyncInvoker<ResumeConnectorTaskRequest, ResumeConnectorTaskResponse> resumeConnectorTaskInvoker(
        ResumeConnectorTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.resumeConnectorTask, hcClient);
    }

    /**
     * 查询开启Smart Connect功能所需资源信息
     *
     * 查询开启Smart Connect功能所需要使用的资源的情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorResourceInfoRequest 请求对象
     * @return ShowConnectorResourceInfoResponse
     */
    public ShowConnectorResourceInfoResponse showConnectorResourceInfo(ShowConnectorResourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showConnectorResourceInfo);
    }

    /**
     * 查询开启Smart Connect功能所需资源信息
     *
     * 查询开启Smart Connect功能所需要使用的资源的情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorResourceInfoRequest 请求对象
     * @return SyncInvoker<ShowConnectorResourceInfoRequest, ShowConnectorResourceInfoResponse>
     */
    public SyncInvoker<ShowConnectorResourceInfoRequest, ShowConnectorResourceInfoResponse> showConnectorResourceInfoInvoker(
        ShowConnectorResourceInfoRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showConnectorResourceInfo, hcClient);
    }

    /**
     * 查询Smart Connect任务详情
     *
     * 查询Smart Connect任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorTaskRequest 请求对象
     * @return ShowConnectorTaskResponse
     */
    public ShowConnectorTaskResponse showConnectorTask(ShowConnectorTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showConnectorTask);
    }

    /**
     * 查询Smart Connect任务详情
     *
     * 查询Smart Connect任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorTaskRequest 请求对象
     * @return SyncInvoker<ShowConnectorTaskRequest, ShowConnectorTaskResponse>
     */
    public SyncInvoker<ShowConnectorTaskRequest, ShowConnectorTaskResponse> showConnectorTaskInvoker(
        ShowConnectorTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showConnectorTask, hcClient);
    }

    /**
     * 校验Connector连通性
     *
     * 校验Connector连通性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConnectorConnectivityRequest 请求对象
     * @return ValidateConnectorConnectivityResponse
     */
    public ValidateConnectorConnectivityResponse validateConnectorConnectivity(
        ValidateConnectorConnectivityRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.validateConnectorConnectivity);
    }

    /**
     * 校验Connector连通性
     *
     * 校验Connector连通性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConnectorConnectivityRequest 请求对象
     * @return SyncInvoker<ValidateConnectorConnectivityRequest, ValidateConnectorConnectivityResponse>
     */
    public SyncInvoker<ValidateConnectorConnectivityRequest, ValidateConnectorConnectivityResponse> validateConnectorConnectivityInvoker(
        ValidateConnectorConnectivityRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.validateConnectorConnectivity, hcClient);
    }

}
