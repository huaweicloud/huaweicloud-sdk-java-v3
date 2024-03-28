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
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateMessageDiagnosisTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateMessageDiagnosisTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListConnectorTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListConnectorTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListMessageDiagnosisReportsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListMessageDiagnosisReportsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.RestartConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResumeConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResumeConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCoordinatorsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCoordinatorsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowDiagnosisPreCheckRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowDiagnosisPreCheckResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowEngineInstanceExtendProductInfoResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaProjectTagsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaProjectTagsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTagsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTagsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicPartitionDiskusageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicPartitionDiskusageResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.ShowTopicAccessPolicyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowTopicAccessPolicyResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceAutoCreateTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceAutoCreateTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceConsumerGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceConsumerGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVpcIpRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVpcIpResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceUserRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceUserResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicReplicaRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicReplicaResponse;

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
     * [该接口支持创建按需和包周期两种计费方式的实例。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,dt)
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
     * [该接口支持创建按需和包周期两种计费方式的实例。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,dt)
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
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。 [ 2023年7月15日前创建的Kafka实例，一个实例最多创建20个用户。2023年7月15日及以后创建的Kafka实例，一个实例最多创建500个用户。](tag:hws,hws_hk)
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
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。 [ 2023年7月15日前创建的Kafka实例，一个实例最多创建20个用户。2023年7月15日及以后创建的Kafka实例，一个实例最多创建500个用户。](tag:hws,hws_hk)
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
     * Kafka实例开始分区重平衡任务
     *
     * 该接口用于向Kafka实例提交分区重平衡任务或计算重平衡预估时间。
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
     * Kafka实例开始分区重平衡任务
     *
     * 该接口用于向Kafka实例提交分区重平衡任务或计算重平衡预估时间。
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
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteInstance);
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
        return new AsyncInvoker<>(request, KafkaMeta.deleteInstance, hcClient);
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
     * 查询Topic的当前生产者列表
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
     * 查询Topic的当前生产者列表
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
     * Kafka生产消息
     *
     * 在控制台发送指定消息到Kafka实例
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
     * 在控制台发送指定消息到Kafka实例
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
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
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
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
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
     * 查询topic的磁盘存储情况
     *
     * 查询topic在Broker上磁盘占用情况。
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
     * 查询topic的磁盘存储情况
     *
     * 查询topic在Broker上磁盘占用情况。
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
     * 开启或关闭实例自动创建topic功能
     *
     * 开启或关闭实例自动创建topic功能。
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
     * 开启或关闭实例自动创建topic功能
     *
     * 开启或关闭实例自动创建topic功能。
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
     * 编辑消费组
     *
     * 编辑消费组
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
     * 编辑消费组
     *
     * 编辑消费组
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
     * 修改Kafka实例Topic分区的副本
     *
     * 修改Kafka实例Topic分区的副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicReplicaRequest 请求对象
     * @return CompletableFuture<UpdateTopicReplicaResponse>
     */
    public CompletableFuture<UpdateTopicReplicaResponse> updateTopicReplicaAsync(UpdateTopicReplicaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateTopicReplica);
    }

    /**
     * 修改Kafka实例Topic分区的副本
     *
     * 修改Kafka实例Topic分区的副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicReplicaRequest 请求对象
     * @return AsyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse>
     */
    public AsyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> updateTopicReplicaAsyncInvoker(
        UpdateTopicReplicaRequest request) {
        return new AsyncInvoker<>(request, KafkaMeta.updateTopicReplica, hcClient);
    }

    /**
     * 开启Smart Connect（按需实例）
     *
     * 开启Smart Connect，提交创建Smart Connect节点任务。
     * 
     * **当前通过调用API，只支持按需实例创建Smart Connect节点。**
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
     * **当前通过调用API，只支持按需实例创建Smart Connect节点。**
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
     * 删除Smart Connector任务
     *
     * 删除Smart Connector任务。
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
     * 删除Smart Connector任务
     *
     * 删除Smart Connector任务。
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
     * 查询Smart Connector任务详情
     *
     * 查询Smart Connector任务详情。
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
     * 查询Smart Connector任务详情
     *
     * 查询Smart Connector任务详情。
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

}
