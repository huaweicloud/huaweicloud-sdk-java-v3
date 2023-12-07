package com.huaweicloud.sdk.rocketmq.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserResponse;
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
     * @param BatchCreateOrDeleteRocketmqTagRequest 请求对象
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
     * @param BatchCreateOrDeleteRocketmqTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> batchCreateOrDeleteRocketmqTagAsyncInvoker(
        BatchCreateOrDeleteRocketmqTagRequest request) {
        return new AsyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse>(request,
            RocketMQMeta.batchCreateOrDeleteRocketmqTag, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。**实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteInstancesRequest 请求对象
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
     * @param BatchDeleteInstancesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>
     */
    public AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstancesAsyncInvoker(
        BatchDeleteInstancesRequest request) {
        return new AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>(request,
            RocketMQMeta.batchDeleteInstances, hcClient);
    }

    /**
     * 批量修改消费组
     *
     * 批量修改消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateConsumerGroupRequest 请求对象
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
     * @param BatchUpdateConsumerGroupRequest 请求对象
     * @return AsyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse>
     */
    public AsyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> batchUpdateConsumerGroupAsyncInvoker(
        BatchUpdateConsumerGroupRequest request) {
        return new AsyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse>(request,
            RocketMQMeta.batchUpdateConsumerGroup, hcClient);
    }

    /**
     * 创建消费组或批量删除消费组
     *
     * 创建消费组或批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConsumerGroupOrBatchDeleteConsumerGroupRequest 请求对象
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
     * @param CreateConsumerGroupOrBatchDeleteConsumerGroupRequest 请求对象
     * @return AsyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse>
     */
    public AsyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> createConsumerGroupOrBatchDeleteConsumerGroupAsyncInvoker(
        CreateConsumerGroupOrBatchDeleteConsumerGroupRequest request) {
        return new AsyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse>(
            request, RocketMQMeta.createConsumerGroupOrBatchDeleteConsumerGroup, hcClient);
    }

    /**
     * 创建实例
     *
     * 该接口支持创建按需和包周期两种计费方式的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceByEngineRequest 请求对象
     * @return CompletableFuture<CreateInstanceByEngineResponse>
     */
    public CompletableFuture<CreateInstanceByEngineResponse> createInstanceByEngineAsync(
        CreateInstanceByEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.createInstanceByEngine);
    }

    /**
     * 创建实例
     *
     * 该接口支持创建按需和包周期两种计费方式的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceByEngineRequest 请求对象
     * @return AsyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>
     */
    public AsyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngineAsyncInvoker(
        CreateInstanceByEngineRequest request) {
        return new AsyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>(request,
            RocketMQMeta.createInstanceByEngine, hcClient);
    }

    /**
     * 创建实例（按需）
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidInstanceRequest 请求对象
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
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceAsyncInvoker(
        CreatePostPaidInstanceRequest request) {
        return new AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>(request,
            RocketMQMeta.createPostPaidInstance, hcClient);
    }

    /**
     * 新建元数据迁移任务
     *
     * 新建元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRocketMqMigrationTaskRequest 请求对象
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
     * @param CreateRocketMqMigrationTaskRequest 请求对象
     * @return AsyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse>
     */
    public AsyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> createRocketMqMigrationTaskAsyncInvoker(
        CreateRocketMqMigrationTaskRequest request) {
        return new AsyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse>(request,
            RocketMQMeta.createRocketMqMigrationTask, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserRequest 请求对象
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
     * @param CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<CreateUserRequest, CreateUserResponse>(request, RocketMQMeta.createUser, hcClient);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConsumerGroupRequest 请求对象
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
     * @param DeleteConsumerGroupRequest 请求对象
     * @return AsyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse>
     */
    public AsyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroupAsyncInvoker(
        DeleteConsumerGroupRequest request) {
        return new AsyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse>(request,
            RocketMQMeta.deleteConsumerGroup, hcClient);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
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
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RocketMQMeta.deleteInstance,
            hcClient);
    }

    /**
     * 删除元数据迁移任务
     *
     * 删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRocketMqMigrationTaskRequest 请求对象
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
     * @param DeleteRocketMqMigrationTaskRequest 请求对象
     * @return AsyncInvoker<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse>
     */
    public AsyncInvoker<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse> deleteRocketMqMigrationTaskAsyncInvoker(
        DeleteRocketMqMigrationTaskRequest request) {
        return new AsyncInvoker<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse>(request,
            RocketMQMeta.deleteRocketMqMigrationTask, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
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
     * @param DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, RocketMQMeta.deleteUser, hcClient);
    }

    /**
     * 导出死信消息
     *
     * 导出死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportDlqMessageRequest 请求对象
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
     * @param ExportDlqMessageRequest 请求对象
     * @return AsyncInvoker<ExportDlqMessageRequest, ExportDlqMessageResponse>
     */
    public AsyncInvoker<ExportDlqMessageRequest, ExportDlqMessageResponse> exportDlqMessageAsyncInvoker(
        ExportDlqMessageRequest request) {
        return new AsyncInvoker<ExportDlqMessageRequest, ExportDlqMessageResponse>(request,
            RocketMQMeta.exportDlqMessage, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
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
     * @param ListAvailableZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesAsyncInvoker(
        ListAvailableZonesRequest request) {
        return new AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>(request,
            RocketMQMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询代理列表
     *
     * 查询代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBrokersRequest 请求对象
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
     * @param ListBrokersRequest 请求对象
     * @return AsyncInvoker<ListBrokersRequest, ListBrokersResponse>
     */
    public AsyncInvoker<ListBrokersRequest, ListBrokersResponse> listBrokersAsyncInvoker(ListBrokersRequest request) {
        return new AsyncInvoker<ListBrokersRequest, ListBrokersResponse>(request, RocketMQMeta.listBrokers, hcClient);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConsumeGroupAccessPolicyRequest 请求对象
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
     * @param ListConsumeGroupAccessPolicyRequest 请求对象
     * @return AsyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse>
     */
    public AsyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> listConsumeGroupAccessPolicyAsyncInvoker(
        ListConsumeGroupAccessPolicyRequest request) {
        return new AsyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse>(request,
            RocketMQMeta.listConsumeGroupAccessPolicy, hcClient);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceConsumerGroupsRequest 请求对象
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
     * @param ListInstanceConsumerGroupsRequest 请求对象
     * @return AsyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>
     */
    public AsyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsAsyncInvoker(
        ListInstanceConsumerGroupsRequest request) {
        return new AsyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>(request,
            RocketMQMeta.listInstanceConsumerGroups, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
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
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, RocketMQMeta.listInstances,
            hcClient);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessageTraceRequest 请求对象
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
     * @param ListMessageTraceRequest 请求对象
     * @return AsyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse>
     */
    public AsyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse> listMessageTraceAsyncInvoker(
        ListMessageTraceRequest request) {
        return new AsyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse>(request,
            RocketMQMeta.listMessageTrace, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessagesRequest 请求对象
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
     * @param ListMessagesRequest 请求对象
     * @return AsyncInvoker<ListMessagesRequest, ListMessagesResponse>
     */
    public AsyncInvoker<ListMessagesRequest, ListMessagesResponse> listMessagesAsyncInvoker(
        ListMessagesRequest request) {
        return new AsyncInvoker<ListMessagesRequest, ListMessagesResponse>(request, RocketMQMeta.listMessages,
            hcClient);
    }

    /**
     * 查询实例下所有迁移任务或查询指定迁移任务信息
     *
     * 1. 查询实例下所有迁移任务
     * 2. 查询指定迁移任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRocketMqMigrationTaskRequest 请求对象
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
     * @param ListRocketMqMigrationTaskRequest 请求对象
     * @return AsyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse>
     */
    public AsyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> listRocketMqMigrationTaskAsyncInvoker(
        ListRocketMqMigrationTaskRequest request) {
        return new AsyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse>(request,
            RocketMQMeta.listRocketMqMigrationTask, hcClient);
    }

    /**
     * 查询主题的授权用户列表
     *
     * 查询主题的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTopicAccessPolicyRequest 请求对象
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
     * @param ListTopicAccessPolicyRequest 请求对象
     * @return AsyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse>
     */
    public AsyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> listTopicAccessPolicyAsyncInvoker(
        ListTopicAccessPolicyRequest request) {
        return new AsyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse>(request,
            RocketMQMeta.listTopicAccessPolicy, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRequest 请求对象
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
     * @param ListUserRequest 请求对象
     * @return AsyncInvoker<ListUserRequest, ListUserResponse>
     */
    public AsyncInvoker<ListUserRequest, ListUserResponse> listUserAsyncInvoker(ListUserRequest request) {
        return new AsyncInvoker<ListUserRequest, ListUserResponse>(request, RocketMQMeta.listUser, hcClient);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetConsumeOffsetRequest 请求对象
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
     * @param ResetConsumeOffsetRequest 请求对象
     * @return AsyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse>
     */
    public AsyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> resetConsumeOffsetAsyncInvoker(
        ResetConsumeOffsetRequest request) {
        return new AsyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse>(request,
            RocketMQMeta.resetConsumeOffset, hcClient);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
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
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, RocketMQMeta.resizeInstance,
            hcClient);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendDlqMessageRequest 请求对象
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
     * @param SendDlqMessageRequest 请求对象
     * @return AsyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse>
     */
    public AsyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse> sendDlqMessageAsyncInvoker(
        SendDlqMessageRequest request) {
        return new AsyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse>(request, RocketMQMeta.sendDlqMessage,
            hcClient);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConsumerConnectionsRequest 请求对象
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
     * @param ShowConsumerConnectionsRequest 请求对象
     * @return AsyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse>
     */
    public AsyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> showConsumerConnectionsAsyncInvoker(
        ShowConsumerConnectionsRequest request) {
        return new AsyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse>(request,
            RocketMQMeta.showConsumerConnections, hcClient);
    }

    /**
     * 查询消费列表或详情
     *
     * 查询消费列表或详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConsumerListOrDetailsRequest 请求对象
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
     * @param ShowConsumerListOrDetailsRequest 请求对象
     * @return AsyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse>
     */
    public AsyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> showConsumerListOrDetailsAsyncInvoker(
        ShowConsumerListOrDetailsRequest request) {
        return new AsyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse>(request,
            RocketMQMeta.showConsumerListOrDetails, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineInstanceExtendProductInfoRequest 请求对象
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
     * @param ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return AsyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>
     */
    public AsyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoAsyncInvoker(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return new AsyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>(
            request, RocketMQMeta.showEngineInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGroupRequest 请求对象
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
     * @param ShowGroupRequest 请求对象
     * @return AsyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public AsyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupAsyncInvoker(ShowGroupRequest request) {
        return new AsyncInvoker<ShowGroupRequest, ShowGroupResponse>(request, RocketMQMeta.showGroup, hcClient);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
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
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, RocketMQMeta.showInstance,
            hcClient);
    }

    /**
     * 查询RocketMQ配置
     *
     * 该接口用于查询RocketMQ配置，若成功则返回配置的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRocketMqConfigsRequest 请求对象
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
     * @param ShowRocketMqConfigsRequest 请求对象
     * @return AsyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse>
     */
    public AsyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> showRocketMqConfigsAsyncInvoker(
        ShowRocketMqConfigsRequest request) {
        return new AsyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse>(request,
            RocketMQMeta.showRocketMqConfigs, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRocketmqProjectTagsRequest 请求对象
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
     * @param ShowRocketmqProjectTagsRequest 请求对象
     * @return AsyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse>
     */
    public AsyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> showRocketmqProjectTagsAsyncInvoker(
        ShowRocketmqProjectTagsRequest request) {
        return new AsyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse>(request,
            RocketMQMeta.showRocketmqProjectTags, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRocketmqTagsRequest 请求对象
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
     * @param ShowRocketmqTagsRequest 请求对象
     * @return AsyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse>
     */
    public AsyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> showRocketmqTagsAsyncInvoker(
        ShowRocketmqTagsRequest request) {
        return new AsyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse>(request,
            RocketMQMeta.showRocketmqTags, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 查询用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserRequest 请求对象
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
     * @param ShowUserRequest 请求对象
     * @return AsyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public AsyncInvoker<ShowUserRequest, ShowUserResponse> showUserAsyncInvoker(ShowUserRequest request) {
        return new AsyncInvoker<ShowUserRequest, ShowUserResponse>(request, RocketMQMeta.showUser, hcClient);
    }

    /**
     * 修改消费组
     *
     * 修改指定消费组参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConsumerGroupRequest 请求对象
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
     * @param UpdateConsumerGroupRequest 请求对象
     * @return AsyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse>
     */
    public AsyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> updateConsumerGroupAsyncInvoker(
        UpdateConsumerGroupRequest request) {
        return new AsyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse>(request,
            RocketMQMeta.updateConsumerGroup, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RocketMQMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, RocketMQMeta.updateInstance,
            hcClient);
    }

    /**
     * 修改RocketMQ配置
     *
     * 该接口用于修改RocketMQ配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRocketMqConfigsRequest 请求对象
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
     * @param UpdateRocketMqConfigsRequest 请求对象
     * @return AsyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse>
     */
    public AsyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> updateRocketMqConfigsAsyncInvoker(
        UpdateRocketMqConfigsRequest request) {
        return new AsyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse>(request,
            RocketMQMeta.updateRocketMqConfigs, hcClient);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
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
     * @param UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, RocketMQMeta.updateUser, hcClient);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateConsumedMessageRequest 请求对象
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
     * @param ValidateConsumedMessageRequest 请求对象
     * @return AsyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse>
     */
    public AsyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> validateConsumedMessageAsyncInvoker(
        ValidateConsumedMessageRequest request) {
        return new AsyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse>(request,
            RocketMQMeta.validateConsumedMessage, hcClient);
    }

    /**
     * 创建主题或批量删除主题
     *
     * 创建主题或批量删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTopicOrBatchDeleteTopicRequest 请求对象
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
     * @param CreateTopicOrBatchDeleteTopicRequest 请求对象
     * @return AsyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse>
     */
    public AsyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> createTopicOrBatchDeleteTopicAsyncInvoker(
        CreateTopicOrBatchDeleteTopicRequest request) {
        return new AsyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse>(request,
            RocketMQMeta.createTopicOrBatchDeleteTopic, hcClient);
    }

    /**
     * 删除指定主题
     *
     * 删除指定主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTopicRequest 请求对象
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
     * @param DeleteTopicRequest 请求对象
     * @return AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse>
     */
    public AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicAsyncInvoker(DeleteTopicRequest request) {
        return new AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse>(request, RocketMQMeta.deleteTopic, hcClient);
    }

    /**
     * 查询主题消费组列表
     *
     * 查询主题消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConsumerGroupOfTopicRequest 请求对象
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
     * @param ListConsumerGroupOfTopicRequest 请求对象
     * @return AsyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse>
     */
    public AsyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> listConsumerGroupOfTopicAsyncInvoker(
        ListConsumerGroupOfTopicRequest request) {
        return new AsyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse>(request,
            RocketMQMeta.listConsumerGroupOfTopic, hcClient);
    }

    /**
     * 查询主题列表
     *
     * 该接口用于查询指定RocketMQ实例的Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRocketInstanceTopicsRequest 请求对象
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
     * @param ListRocketInstanceTopicsRequest 请求对象
     * @return AsyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse>
     */
    public AsyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> listRocketInstanceTopicsAsyncInvoker(
        ListRocketInstanceTopicsRequest request) {
        return new AsyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse>(request,
            RocketMQMeta.listRocketInstanceTopics, hcClient);
    }

    /**
     * 查询单个主题
     *
     * 查询单个主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOneTopicRequest 请求对象
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
     * @param ShowOneTopicRequest 请求对象
     * @return AsyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse>
     */
    public AsyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse> showOneTopicAsyncInvoker(
        ShowOneTopicRequest request) {
        return new AsyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse>(request, RocketMQMeta.showOneTopic,
            hcClient);
    }

    /**
     * 查询主题的消息数
     *
     * 查询主题的消息数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTopicStatusRequest 请求对象
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
     * @param ShowTopicStatusRequest 请求对象
     * @return AsyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse>
     */
    public AsyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse> showTopicStatusAsyncInvoker(
        ShowTopicStatusRequest request) {
        return new AsyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse>(request, RocketMQMeta.showTopicStatus,
            hcClient);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTopicRequest 请求对象
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
     * @param UpdateTopicRequest 请求对象
     * @return AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse>
     */
    public AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicAsyncInvoker(UpdateTopicRequest request) {
        return new AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse>(request, RocketMQMeta.updateTopic, hcClient);
    }

}
