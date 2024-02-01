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
import com.huaweicloud.sdk.kafka.v2.model.BatchRestartOrDeleteInstancesRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchRestartOrDeleteInstancesResponse;
import com.huaweicloud.sdk.kafka.v2.model.CloseKafkaManagerRequest;
import com.huaweicloud.sdk.kafka.v2.model.CloseKafkaManagerResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateDeleteConnectorOrderRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateDeleteConnectorOrderResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateSinkTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateSinkTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteSinkTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteSinkTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListSinkTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListSinkTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerResponse;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCoordinatorsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCoordinatorsResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.ShowMessagesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowMessagesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionBeginningMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionBeginningMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionEndMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionEndMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowSinkTaskDetailRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowSinkTaskDetailResponse;
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
     * Kafka实例批量删除Group
     *
     * 该接口用于向Kafka实例批量删除Group。
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
     * Kafka实例批量删除Group
     *
     * 该接口用于向Kafka实例批量删除Group。
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
     * 创建实例的Smart Connect节点
     *
     * 创建Smart Connect节点。
     * 
     * **当前通过调用API，只支持按需实例创建Smart Connect节点。**
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
     * 创建实例的Smart Connect节点
     *
     * 创建Smart Connect节点。
     * 
     * **当前通过调用API，只支持按需实例创建Smart Connect节点。**
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
     * 创建关闭实例转储节点的订单
     *
     * 创建删除实例转储节点的订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeleteConnectorOrderRequest 请求对象
     * @return CreateDeleteConnectorOrderResponse
     */
    public CreateDeleteConnectorOrderResponse createDeleteConnectorOrder(CreateDeleteConnectorOrderRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createDeleteConnectorOrder);
    }

    /**
     * 创建关闭实例转储节点的订单
     *
     * 创建删除实例转储节点的订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeleteConnectorOrderRequest 请求对象
     * @return SyncInvoker<CreateDeleteConnectorOrderRequest, CreateDeleteConnectorOrderResponse>
     */
    public SyncInvoker<CreateDeleteConnectorOrderRequest, CreateDeleteConnectorOrderResponse> createDeleteConnectorOrderInvoker(
        CreateDeleteConnectorOrderRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createDeleteConnectorOrder, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例。
     * 
     * 该接口支持创建按需和包周期两种计费方式的实例。
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
     * 该接口支持创建按需和包周期两种计费方式的实例。
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
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。 [ 2023年7月15日前创建的Kafka实例，一个实例最多创建20个用户。2023年7月15日及以后创建的Kafka实例，一个实例最多创建500个用户。](tag:hws,hws_hk)
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
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。 [ 2023年7月15日前创建的Kafka实例，一个实例最多创建20个用户。2023年7月15日及以后创建的Kafka实例，一个实例最多创建500个用户。](tag:hws,hws_hk)
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
     * Kafka实例开始分区重平衡任务
     *
     * 该接口用于向Kafka实例提交分区重平衡任务，若成功则返回重平衡任务的job id。
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
     * Kafka实例开始分区重平衡任务
     *
     * 该接口用于向Kafka实例提交分区重平衡任务，若成功则返回重平衡任务的job id。
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
     * 创建转储任务
     *
     * 创建转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSinkTaskRequest 请求对象
     * @return CreateSinkTaskResponse
     */
    public CreateSinkTaskResponse createSinkTask(CreateSinkTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createSinkTask);
    }

    /**
     * 创建转储任务
     *
     * 创建转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSinkTaskRequest 请求对象
     * @return SyncInvoker<CreateSinkTaskRequest, CreateSinkTaskResponse>
     */
    public SyncInvoker<CreateSinkTaskRequest, CreateSinkTaskResponse> createSinkTaskInvoker(
        CreateSinkTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.createSinkTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteInstance);
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
        return new SyncInvoker<>(request, KafkaMeta.deleteInstance, hcClient);
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
     * 删除单个转储任务
     *
     * 删除单个转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSinkTaskRequest 请求对象
     * @return DeleteSinkTaskResponse
     */
    public DeleteSinkTaskResponse deleteSinkTask(DeleteSinkTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteSinkTask);
    }

    /**
     * 删除单个转储任务
     *
     * 删除单个转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSinkTaskRequest 请求对象
     * @return SyncInvoker<DeleteSinkTaskRequest, DeleteSinkTaskResponse>
     */
    public SyncInvoker<DeleteSinkTaskRequest, DeleteSinkTaskResponse> deleteSinkTaskInvoker(
        DeleteSinkTaskRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.deleteSinkTask, hcClient);
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
     * 查询转储任务列表
     *
     * 查询转储任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSinkTasksRequest 请求对象
     * @return ListSinkTasksResponse
     */
    public ListSinkTasksResponse listSinkTasks(ListSinkTasksRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listSinkTasks);
    }

    /**
     * 查询转储任务列表
     *
     * 查询转储任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSinkTasksRequest 请求对象
     * @return SyncInvoker<ListSinkTasksRequest, ListSinkTasksResponse>
     */
    public SyncInvoker<ListSinkTasksRequest, ListSinkTasksResponse> listSinkTasksInvoker(ListSinkTasksRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.listSinkTasks, hcClient);
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
     * 查询Topic的当前生产者列表
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
     * 查询Topic的当前生产者列表
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
     * Kafka生产消息
     *
     * 在控制台发送指定消息到Kafka实例
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
     * 在控制台发送指定消息到Kafka实例
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
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
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
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
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
     * 查询topic的磁盘存储情况
     *
     * 查询topic在Broker上磁盘占用情况。
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
     * 查询topic的磁盘存储情况
     *
     * 查询topic在Broker上磁盘占用情况。
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
     * 查询单个转储任务
     *
     * 查询单个转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSinkTaskDetailRequest 请求对象
     * @return ShowSinkTaskDetailResponse
     */
    public ShowSinkTaskDetailResponse showSinkTaskDetail(ShowSinkTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showSinkTaskDetail);
    }

    /**
     * 查询单个转储任务
     *
     * 查询单个转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSinkTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse>
     */
    public SyncInvoker<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> showSinkTaskDetailInvoker(
        ShowSinkTaskDetailRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.showSinkTaskDetail, hcClient);
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
     * 开启或关闭实例自动创建topic功能
     *
     * 开启或关闭实例自动创建topic功能。
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
     * 开启或关闭实例自动创建topic功能
     *
     * 开启或关闭实例自动创建topic功能。
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
     * 编辑消费组
     *
     * 编辑消费组
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
     * 编辑消费组
     *
     * 编辑消费组
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
     * 修改Kafka实例Topic分区的副本
     *
     * 修改Kafka实例Topic分区的副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicReplicaRequest 请求对象
     * @return UpdateTopicReplicaResponse
     */
    public UpdateTopicReplicaResponse updateTopicReplica(UpdateTopicReplicaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateTopicReplica);
    }

    /**
     * 修改Kafka实例Topic分区的副本
     *
     * 修改Kafka实例Topic分区的副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicReplicaRequest 请求对象
     * @return SyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse>
     */
    public SyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> updateTopicReplicaInvoker(
        UpdateTopicReplicaRequest request) {
        return new SyncInvoker<>(request, KafkaMeta.updateTopicReplica, hcClient);
    }

}
