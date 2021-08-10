package com.huaweicloud.sdk.kafka.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kafka.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class KafkaAsyncClient {

    protected HcClient hcClient;

    public KafkaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KafkaAsyncClient> newBuilder() {
        return new ClientBuilder<>(KafkaAsyncClient::new);
    }

    /** 批量添加或删除实例标签 批量添加或删除实例标签。
     *
     * @param BatchCreateOrDeleteKafkaTagRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteKafkaTagResponse> */
    public CompletableFuture<BatchCreateOrDeleteKafkaTagResponse> batchCreateOrDeleteKafkaTagAsync(
        BatchCreateOrDeleteKafkaTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchCreateOrDeleteKafkaTag);
    }

    /** 批量添加或删除实例标签 批量添加或删除实例标签。
     *
     * @param BatchCreateOrDeleteKafkaTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> */
    public AsyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> batchCreateOrDeleteKafkaTagAsyncInvoker(
        BatchCreateOrDeleteKafkaTagRequest request) {
        return new AsyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse>(request,
            KafkaMeta.batchCreateOrDeleteKafkaTag, hcClient);
    }

    /** Kafka实例批量删除Topic 该接口用于向Kafka实例批量删除Topic。
     *
     * @param BatchDeleteInstanceTopicRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstanceTopicResponse> */
    public CompletableFuture<BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopicAsync(
        BatchDeleteInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchDeleteInstanceTopic);
    }

    /** Kafka实例批量删除Topic 该接口用于向Kafka实例批量删除Topic。
     *
     * @param BatchDeleteInstanceTopicRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> */
    public AsyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopicAsyncInvoker(
        BatchDeleteInstanceTopicRequest request) {
        return new AsyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse>(request,
            KafkaMeta.batchDeleteInstanceTopic, hcClient);
    }

    /** 批量删除用户 批量删除Kafka实例的用户
     *
     * @param BatchDeleteInstanceUsersRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstanceUsersResponse> */
    public CompletableFuture<BatchDeleteInstanceUsersResponse> batchDeleteInstanceUsersAsync(
        BatchDeleteInstanceUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchDeleteInstanceUsers);
    }

    /** 批量删除用户 批量删除Kafka实例的用户
     *
     * @param BatchDeleteInstanceUsersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> */
    public AsyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> batchDeleteInstanceUsersAsyncInvoker(
        BatchDeleteInstanceUsersRequest request) {
        return new AsyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse>(request,
            KafkaMeta.batchDeleteInstanceUsers, hcClient);
    }

    /** 批量重启或删除实例 批量重启或删除实例。 在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。 实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     *
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return CompletableFuture<BatchRestartOrDeleteInstancesResponse> */
    public CompletableFuture<BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsync(
        BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchRestartOrDeleteInstances);
    }

    /** 批量重启或删除实例 批量重启或删除实例。 在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。 实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     *
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return AsyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> */
    public AsyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsyncInvoker(
        BatchRestartOrDeleteInstancesRequest request) {
        return new AsyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>(request,
            KafkaMeta.batchRestartOrDeleteInstances, hcClient);
    }

    /** 创建实例的转储节点 创建实例的转储节点。
     *
     * @param CreateConnectorRequest 请求对象
     * @return CompletableFuture<CreateConnectorResponse> */
    public CompletableFuture<CreateConnectorResponse> createConnectorAsync(CreateConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createConnector);
    }

    /** 创建实例的转储节点 创建实例的转储节点。
     *
     * @param CreateConnectorRequest 请求对象
     * @return AsyncInvoker<CreateConnectorRequest, CreateConnectorResponse> */
    public AsyncInvoker<CreateConnectorRequest, CreateConnectorResponse> createConnectorAsyncInvoker(
        CreateConnectorRequest request) {
        return new AsyncInvoker<CreateConnectorRequest, CreateConnectorResponse>(request, KafkaMeta.createConnector,
            hcClient);
    }

    /** Kafka实例创建Topic 该接口用于向Kafka实例创建Topic。
     *
     * @param CreateInstanceTopicRequest 请求对象
     * @return CompletableFuture<CreateInstanceTopicResponse> */
    public CompletableFuture<CreateInstanceTopicResponse> createInstanceTopicAsync(CreateInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createInstanceTopic);
    }

    /** Kafka实例创建Topic 该接口用于向Kafka实例创建Topic。
     *
     * @param CreateInstanceTopicRequest 请求对象
     * @return AsyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse> */
    public AsyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse> createInstanceTopicAsyncInvoker(
        CreateInstanceTopicRequest request) {
        return new AsyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse>(request,
            KafkaMeta.createInstanceTopic, hcClient);
    }

    /** 创建用户 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。
     *
     * @param CreateInstanceUserRequest 请求对象
     * @return CompletableFuture<CreateInstanceUserResponse> */
    public CompletableFuture<CreateInstanceUserResponse> createInstanceUserAsync(CreateInstanceUserRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createInstanceUser);
    }

    /** 创建用户 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。
     *
     * @param CreateInstanceUserRequest 请求对象
     * @return AsyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse> */
    public AsyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse> createInstanceUserAsyncInvoker(
        CreateInstanceUserRequest request) {
        return new AsyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse>(request,
            KafkaMeta.createInstanceUser, hcClient);
    }

    /** 新增Kafka实例指定Topic分区 新增Kafka实例指定Topic分区。
     *
     * @param CreatePartitionRequest 请求对象
     * @return CompletableFuture<CreatePartitionResponse> */
    public CompletableFuture<CreatePartitionResponse> createPartitionAsync(CreatePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPartition);
    }

    /** 新增Kafka实例指定Topic分区 新增Kafka实例指定Topic分区。
     *
     * @param CreatePartitionRequest 请求对象
     * @return AsyncInvoker<CreatePartitionRequest, CreatePartitionResponse> */
    public AsyncInvoker<CreatePartitionRequest, CreatePartitionResponse> createPartitionAsyncInvoker(
        CreatePartitionRequest request) {
        return new AsyncInvoker<CreatePartitionRequest, CreatePartitionResponse>(request, KafkaMeta.createPartition,
            hcClient);
    }

    /** 创建实例（按需） 创建实例，该接口创建的实例为按需计费的方式。
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return CompletableFuture<CreatePostPaidInstanceResponse> */
    public CompletableFuture<CreatePostPaidInstanceResponse> createPostPaidInstanceAsync(
        CreatePostPaidInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPostPaidInstance);
    }

    /** 创建实例（按需） 创建实例，该接口创建的实例为按需计费的方式。
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> */
    public AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceAsyncInvoker(
        CreatePostPaidInstanceRequest request) {
        return new AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>(request,
            KafkaMeta.createPostPaidInstance, hcClient);
    }

    /** 创建转储任务 创建转储任务。
     *
     * @param CreateSinkTaskRequest 请求对象
     * @return CompletableFuture<CreateSinkTaskResponse> */
    public CompletableFuture<CreateSinkTaskResponse> createSinkTaskAsync(CreateSinkTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createSinkTask);
    }

    /** 创建转储任务 创建转储任务。
     *
     * @param CreateSinkTaskRequest 请求对象
     * @return AsyncInvoker<CreateSinkTaskRequest, CreateSinkTaskResponse> */
    public AsyncInvoker<CreateSinkTaskRequest, CreateSinkTaskResponse> createSinkTaskAsyncInvoker(
        CreateSinkTaskRequest request) {
        return new AsyncInvoker<CreateSinkTaskRequest, CreateSinkTaskResponse>(request, KafkaMeta.createSinkTask,
            hcClient);
    }

    /** 删除后台任务管理中的指定记录 删除后台任务管理中的指定记录。
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return CompletableFuture<DeleteBackgroundTaskResponse> */
    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(
        DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteBackgroundTask);
    }

    /** 删除后台任务管理中的指定记录 删除后台任务管理中的指定记录。
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> */
    public AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskAsyncInvoker(
        DeleteBackgroundTaskRequest request) {
        return new AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>(request,
            KafkaMeta.deleteBackgroundTask, hcClient);
    }

    /** 删除指定的实例 删除指定的实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse> */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteInstance);
    }

    /** 删除指定的实例 删除指定的实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, KafkaMeta.deleteInstance,
            hcClient);
    }

    /** 删除单个转储任务 删除单个转储任务。
     *
     * @param DeleteSinkTaskRequest 请求对象
     * @return CompletableFuture<DeleteSinkTaskResponse> */
    public CompletableFuture<DeleteSinkTaskResponse> deleteSinkTaskAsync(DeleteSinkTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteSinkTask);
    }

    /** 删除单个转储任务 删除单个转储任务。
     *
     * @param DeleteSinkTaskRequest 请求对象
     * @return AsyncInvoker<DeleteSinkTaskRequest, DeleteSinkTaskResponse> */
    public AsyncInvoker<DeleteSinkTaskRequest, DeleteSinkTaskResponse> deleteSinkTaskAsyncInvoker(
        DeleteSinkTaskRequest request) {
        return new AsyncInvoker<DeleteSinkTaskRequest, DeleteSinkTaskResponse>(request, KafkaMeta.deleteSinkTask,
            hcClient);
    }

    /** 查询可用区信息 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return CompletableFuture<ListAvailableZonesResponse> */
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listAvailableZones);
    }

    /** 查询可用区信息 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> */
    public AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesAsyncInvoker(
        ListAvailableZonesRequest request) {
        return new AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>(request,
            KafkaMeta.listAvailableZones, hcClient);
    }

    /** 查询实例的后台任务列表 查询实例的后台任务列表。
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return CompletableFuture<ListBackgroundTasksResponse> */
    public CompletableFuture<ListBackgroundTasksResponse> listBackgroundTasksAsync(ListBackgroundTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listBackgroundTasks);
    }

    /** 查询实例的后台任务列表 查询实例的后台任务列表。
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return AsyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse> */
    public AsyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasksAsyncInvoker(
        ListBackgroundTasksRequest request) {
        return new AsyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse>(request,
            KafkaMeta.listBackgroundTasks, hcClient);
    }

    /** Kafka实例查询Topic 该接口用于查询指定Kafka实例的Topic详情。
     *
     * @param ListInstanceTopicsRequest 请求对象
     * @return CompletableFuture<ListInstanceTopicsResponse> */
    public CompletableFuture<ListInstanceTopicsResponse> listInstanceTopicsAsync(ListInstanceTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceTopics);
    }

    /** Kafka实例查询Topic 该接口用于查询指定Kafka实例的Topic详情。
     *
     * @param ListInstanceTopicsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse> */
    public AsyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse> listInstanceTopicsAsyncInvoker(
        ListInstanceTopicsRequest request) {
        return new AsyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse>(request,
            KafkaMeta.listInstanceTopics, hcClient);
    }

    /** 查询所有实例列表 查询租户的实例列表，支持按照条件查询。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse> */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstances);
    }

    /** 查询所有实例列表 查询租户的实例列表，支持按照条件查询。
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse> */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, KafkaMeta.listInstances,
            hcClient);
    }

    /** 查询产品规格列表 在创建kafka实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 例如，要订购按需计费、基准带宽为100MB的kafka实例，可从接口响应消息中，查找Hourly的消息体，然后找到bandwidth为100MB的记录对应的product_id，该product_id的值即是创建上述kafka实例时需要配置的产品ID。
     * 同时，unavailable_zones字段表示资源不足的可用区列表，如果为空，则表示所有可用区都有资源，如果不为空，则表示字段值的可用区没有资源。所以必须确保您购买的资源所在的可用区有资源，不在该字段列表内。
     * 例如，响应消息中bandwidth字段为1200MB的记录，unavailable_zones字段包含cn-east-2b、cn-east-2a和cn-east-2d，表示在华东-上海2的可用区1、可用区2、可用区3都没有该资源。
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse> */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listProducts);
    }

    /** 查询产品规格列表 在创建kafka实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 例如，要订购按需计费、基准带宽为100MB的kafka实例，可从接口响应消息中，查找Hourly的消息体，然后找到bandwidth为100MB的记录对应的product_id，该product_id的值即是创建上述kafka实例时需要配置的产品ID。
     * 同时，unavailable_zones字段表示资源不足的可用区列表，如果为空，则表示所有可用区都有资源，如果不为空，则表示字段值的可用区没有资源。所以必须确保您购买的资源所在的可用区有资源，不在该字段列表内。
     * 例如，响应消息中bandwidth字段为1200MB的记录，unavailable_zones字段包含cn-east-2b、cn-east-2a和cn-east-2d，表示在华东-上海2的可用区1、可用区2、可用区3都没有该资源。
     *
     * @param ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse> */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<ListProductsRequest, ListProductsResponse>(request, KafkaMeta.listProducts, hcClient);
    }

    /** 查询转储任务列表 查询转储任务列表。
     *
     * @param ListSinkTasksRequest 请求对象
     * @return CompletableFuture<ListSinkTasksResponse> */
    public CompletableFuture<ListSinkTasksResponse> listSinkTasksAsync(ListSinkTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listSinkTasks);
    }

    /** 查询转储任务列表 查询转储任务列表。
     *
     * @param ListSinkTasksRequest 请求对象
     * @return AsyncInvoker<ListSinkTasksRequest, ListSinkTasksResponse> */
    public AsyncInvoker<ListSinkTasksRequest, ListSinkTasksResponse> listSinkTasksAsyncInvoker(
        ListSinkTasksRequest request) {
        return new AsyncInvoker<ListSinkTasksRequest, ListSinkTasksResponse>(request, KafkaMeta.listSinkTasks,
            hcClient);
    }

    /** 重置Manager密码 重置Manager密码。
     *
     * @param ResetManagerPasswordRequest 请求对象
     * @return CompletableFuture<ResetManagerPasswordResponse> */
    public CompletableFuture<ResetManagerPasswordResponse> resetManagerPasswordAsync(
        ResetManagerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetManagerPassword);
    }

    /** 重置Manager密码 重置Manager密码。
     *
     * @param ResetManagerPasswordRequest 请求对象
     * @return AsyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse> */
    public AsyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse> resetManagerPasswordAsyncInvoker(
        ResetManagerPasswordRequest request) {
        return new AsyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse>(request,
            KafkaMeta.resetManagerPassword, hcClient);
    }

    /** 重置消费组消费进度到指定位置 Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。 &gt;
     * 在停止被重置消费组客户端后，需要经过ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间（默认10000毫秒），服务端才认为消费组客户端真正下线。
     *
     * @param ResetMessageOffsetRequest 请求对象
     * @return CompletableFuture<ResetMessageOffsetResponse> */
    public CompletableFuture<ResetMessageOffsetResponse> resetMessageOffsetAsync(ResetMessageOffsetRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetMessageOffset);
    }

    /** 重置消费组消费进度到指定位置 Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。 &gt;
     * 在停止被重置消费组客户端后，需要经过ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间（默认10000毫秒），服务端才认为消费组客户端真正下线。
     *
     * @param ResetMessageOffsetRequest 请求对象
     * @return AsyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse> */
    public AsyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse> resetMessageOffsetAsyncInvoker(
        ResetMessageOffsetRequest request) {
        return new AsyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse>(request,
            KafkaMeta.resetMessageOffset, hcClient);
    }

    /** 重置密码 重置密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse> */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetPassword);
    }

    /** 重置密码 重置密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, KafkaMeta.resetPassword,
            hcClient);
    }

    /** 重置用户密码 重置用户密码
     *
     * @param ResetUserPasswrodRequest 请求对象
     * @return CompletableFuture<ResetUserPasswrodResponse> */
    public CompletableFuture<ResetUserPasswrodResponse> resetUserPasswrodAsync(ResetUserPasswrodRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetUserPasswrod);
    }

    /** 重置用户密码 重置用户密码
     *
     * @param ResetUserPasswrodRequest 请求对象
     * @return AsyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse> */
    public AsyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse> resetUserPasswrodAsyncInvoker(
        ResetUserPasswrodRequest request) {
        return new AsyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse>(request,
            KafkaMeta.resetUserPasswrod, hcClient);
    }

    /** 实例规格变更 实例规格变更。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse> */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resizeInstance);
    }

    /** 实例规格变更 实例规格变更。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, KafkaMeta.resizeInstance,
            hcClient);
    }

    /** 重启Manager 重启Manager。
     *
     * @param RestartManagerRequest 请求对象
     * @return CompletableFuture<RestartManagerResponse> */
    public CompletableFuture<RestartManagerResponse> restartManagerAsync(RestartManagerRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.restartManager);
    }

    /** 重启Manager 重启Manager。
     *
     * @param RestartManagerRequest 请求对象
     * @return AsyncInvoker<RestartManagerRequest, RestartManagerResponse> */
    public AsyncInvoker<RestartManagerRequest, RestartManagerResponse> restartManagerAsyncInvoker(
        RestartManagerRequest request) {
        return new AsyncInvoker<RestartManagerRequest, RestartManagerResponse>(request, KafkaMeta.restartManager,
            hcClient);
    }

    /** 查询后台任务管理中的指定记录 查询后台任务管理中的指定记录。
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return CompletableFuture<ShowBackgroundTaskResponse> */
    public CompletableFuture<ShowBackgroundTaskResponse> showBackgroundTaskAsync(ShowBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showBackgroundTask);
    }

    /** 查询后台任务管理中的指定记录 查询后台任务管理中的指定记录。
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> */
    public AsyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTaskAsyncInvoker(
        ShowBackgroundTaskRequest request) {
        return new AsyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse>(request,
            KafkaMeta.showBackgroundTask, hcClient);
    }

    /** 查询实例在CES的监控层级关系 查询实例在CES的监控层级关系。
     *
     * @param ShowCesHierarchyRequest 请求对象
     * @return CompletableFuture<ShowCesHierarchyResponse> */
    public CompletableFuture<ShowCesHierarchyResponse> showCesHierarchyAsync(ShowCesHierarchyRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCesHierarchy);
    }

    /** 查询实例在CES的监控层级关系 查询实例在CES的监控层级关系。
     *
     * @param ShowCesHierarchyRequest 请求对象
     * @return AsyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse> */
    public AsyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchyAsyncInvoker(
        ShowCesHierarchyRequest request) {
        return new AsyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse>(request, KafkaMeta.showCesHierarchy,
            hcClient);
    }

    /** 查询Kafka集群元数据信息 查询Kafka集群元数据信息。
     *
     * @param ShowClusterRequest 请求对象
     * @return CompletableFuture<ShowClusterResponse> */
    public CompletableFuture<ShowClusterResponse> showClusterAsync(ShowClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCluster);
    }

    /** 查询Kafka集群元数据信息 查询Kafka集群元数据信息。
     *
     * @param ShowClusterRequest 请求对象
     * @return AsyncInvoker<ShowClusterRequest, ShowClusterResponse> */
    public AsyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterAsyncInvoker(ShowClusterRequest request) {
        return new AsyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, KafkaMeta.showCluster, hcClient);
    }

    /** 查询Kafka实例的协调器信息 查询Kafka实例的协调器信息。
     *
     * @param ShowCoordinatorsRequest 请求对象
     * @return CompletableFuture<ShowCoordinatorsResponse> */
    public CompletableFuture<ShowCoordinatorsResponse> showCoordinatorsAsync(ShowCoordinatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCoordinators);
    }

    /** 查询Kafka实例的协调器信息 查询Kafka实例的协调器信息。
     *
     * @param ShowCoordinatorsRequest 请求对象
     * @return AsyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse> */
    public AsyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse> showCoordinatorsAsyncInvoker(
        ShowCoordinatorsRequest request) {
        return new AsyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse>(request, KafkaMeta.showCoordinators,
            hcClient);
    }

    /** 查询消费组信息 查询消费组信息。
     *
     * @param ShowGroupsRequest 请求对象
     * @return CompletableFuture<ShowGroupsResponse> */
    public CompletableFuture<ShowGroupsResponse> showGroupsAsync(ShowGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showGroups);
    }

    /** 查询消费组信息 查询消费组信息。
     *
     * @param ShowGroupsRequest 请求对象
     * @return AsyncInvoker<ShowGroupsRequest, ShowGroupsResponse> */
    public AsyncInvoker<ShowGroupsRequest, ShowGroupsResponse> showGroupsAsyncInvoker(ShowGroupsRequest request) {
        return new AsyncInvoker<ShowGroupsRequest, ShowGroupsResponse>(request, KafkaMeta.showGroups, hcClient);
    }

    /** 查询指定实例 查询指定实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse> */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstance);
    }

    /** 查询指定实例 查询指定实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, KafkaMeta.showInstance, hcClient);
    }

    /** 查询实例的扩容规格列表 查询实例的扩容规格列表。
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceExtendProductInfoResponse> */
    public CompletableFuture<ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsync(
        ShowInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceExtendProductInfo);
    }

    /** 查询实例的扩容规格列表 查询实例的扩容规格列表。
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> */
    public AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsyncInvoker(
        ShowInstanceExtendProductInfoRequest request) {
        return new AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>(request,
            KafkaMeta.showInstanceExtendProductInfo, hcClient);
    }

    /** 查询消息 查询消息的偏移量和消息内容。 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。 **注意：调用接口时message_offset和partition查询参数二选一。**
     *
     * @param ShowInstanceMessagesRequest 请求对象
     * @return CompletableFuture<ShowInstanceMessagesResponse> */
    public CompletableFuture<ShowInstanceMessagesResponse> showInstanceMessagesAsync(
        ShowInstanceMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceMessages);
    }

    /** 查询消息 查询消息的偏移量和消息内容。 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。 **注意：调用接口时message_offset和partition查询参数二选一。**
     *
     * @param ShowInstanceMessagesRequest 请求对象
     * @return AsyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> */
    public AsyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> showInstanceMessagesAsyncInvoker(
        ShowInstanceMessagesRequest request) {
        return new AsyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse>(request,
            KafkaMeta.showInstanceMessages, hcClient);
    }

    /** 查询Kafka实例Topic详细信息 查询Kafka实例Topic详细信息。
     *
     * @param ShowInstanceTopicDetailRequest 请求对象
     * @return CompletableFuture<ShowInstanceTopicDetailResponse> */
    public CompletableFuture<ShowInstanceTopicDetailResponse> showInstanceTopicDetailAsync(
        ShowInstanceTopicDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceTopicDetail);
    }

    /** 查询Kafka实例Topic详细信息 查询Kafka实例Topic详细信息。
     *
     * @param ShowInstanceTopicDetailRequest 请求对象
     * @return AsyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> */
    public AsyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> showInstanceTopicDetailAsyncInvoker(
        ShowInstanceTopicDetailRequest request) {
        return new AsyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse>(request,
            KafkaMeta.showInstanceTopicDetail, hcClient);
    }

    /** 查询用户列表 查询用户列表。 Kafka实例开启SASL功能时，才支持多用户管理的功能。
     *
     * @param ShowInstanceUsersRequest 请求对象
     * @return CompletableFuture<ShowInstanceUsersResponse> */
    public CompletableFuture<ShowInstanceUsersResponse> showInstanceUsersAsync(ShowInstanceUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceUsers);
    }

    /** 查询用户列表 查询用户列表。 Kafka实例开启SASL功能时，才支持多用户管理的功能。
     *
     * @param ShowInstanceUsersRequest 请求对象
     * @return AsyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse> */
    public AsyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse> showInstanceUsersAsyncInvoker(
        ShowInstanceUsersRequest request) {
        return new AsyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse>(request,
            KafkaMeta.showInstanceUsers, hcClient);
    }

    /** 查询项目标签 查询项目标签。
     *
     * @param ShowKafkaProjectTagsRequest 请求对象
     * @return CompletableFuture<ShowKafkaProjectTagsResponse> */
    public CompletableFuture<ShowKafkaProjectTagsResponse> showKafkaProjectTagsAsync(
        ShowKafkaProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaProjectTags);
    }

    /** 查询项目标签 查询项目标签。
     *
     * @param ShowKafkaProjectTagsRequest 请求对象
     * @return AsyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> */
    public AsyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> showKafkaProjectTagsAsyncInvoker(
        ShowKafkaProjectTagsRequest request) {
        return new AsyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse>(request,
            KafkaMeta.showKafkaProjectTags, hcClient);
    }

    /** 查询实例标签 查询实例标签。
     *
     * @param ShowKafkaTagsRequest 请求对象
     * @return CompletableFuture<ShowKafkaTagsResponse> */
    public CompletableFuture<ShowKafkaTagsResponse> showKafkaTagsAsync(ShowKafkaTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaTags);
    }

    /** 查询实例标签 查询实例标签。
     *
     * @param ShowKafkaTagsRequest 请求对象
     * @return AsyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse> */
    public AsyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse> showKafkaTagsAsyncInvoker(
        ShowKafkaTagsRequest request) {
        return new AsyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse>(request, KafkaMeta.showKafkaTags,
            hcClient);
    }

    /** 查询topic的磁盘存储情况 查询topic在Broker上磁盘占用情况。
     *
     * @param ShowKafkaTopicPartitionDiskusageRequest 请求对象
     * @return CompletableFuture<ShowKafkaTopicPartitionDiskusageResponse> */
    public CompletableFuture<ShowKafkaTopicPartitionDiskusageResponse> showKafkaTopicPartitionDiskusageAsync(
        ShowKafkaTopicPartitionDiskusageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showKafkaTopicPartitionDiskusage);
    }

    /** 查询topic的磁盘存储情况 查询topic在Broker上磁盘占用情况。
     *
     * @param ShowKafkaTopicPartitionDiskusageRequest 请求对象
     * @return AsyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> */
    public AsyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> showKafkaTopicPartitionDiskusageAsyncInvoker(
        ShowKafkaTopicPartitionDiskusageRequest request) {
        return new AsyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse>(
            request, KafkaMeta.showKafkaTopicPartitionDiskusage, hcClient);
    }

    /** 查询维护时间窗时间段 查询维护时间窗开始时间和结束时间。
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return CompletableFuture<ShowMaintainWindowsResponse> */
    public CompletableFuture<ShowMaintainWindowsResponse> showMaintainWindowsAsync(ShowMaintainWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMaintainWindows);
    }

    /** 查询维护时间窗时间段 查询维护时间窗开始时间和结束时间。
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return AsyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> */
    public AsyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindowsAsyncInvoker(
        ShowMaintainWindowsRequest request) {
        return new AsyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse>(request,
            KafkaMeta.showMaintainWindows, hcClient);
    }

    /** 查询分区指定时间段的消息 查询分区指定时间段的消息。
     *
     * @param ShowMessagesRequest 请求对象
     * @return CompletableFuture<ShowMessagesResponse> */
    public CompletableFuture<ShowMessagesResponse> showMessagesAsync(ShowMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMessages);
    }

    /** 查询分区指定时间段的消息 查询分区指定时间段的消息。
     *
     * @param ShowMessagesRequest 请求对象
     * @return AsyncInvoker<ShowMessagesRequest, ShowMessagesResponse> */
    public AsyncInvoker<ShowMessagesRequest, ShowMessagesResponse> showMessagesAsyncInvoker(
        ShowMessagesRequest request) {
        return new AsyncInvoker<ShowMessagesRequest, ShowMessagesResponse>(request, KafkaMeta.showMessages, hcClient);
    }

    /** 查询分区最早消息的位置 查询分区最早消息的位置。
     *
     * @param ShowPartitionBeginningMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionBeginningMessageResponse> */
    public CompletableFuture<ShowPartitionBeginningMessageResponse> showPartitionBeginningMessageAsync(
        ShowPartitionBeginningMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionBeginningMessage);
    }

    /** 查询分区最早消息的位置 查询分区最早消息的位置。
     *
     * @param ShowPartitionBeginningMessageRequest 请求对象
     * @return AsyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> */
    public AsyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> showPartitionBeginningMessageAsyncInvoker(
        ShowPartitionBeginningMessageRequest request) {
        return new AsyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse>(request,
            KafkaMeta.showPartitionBeginningMessage, hcClient);
    }

    /** 查询分区最新消息的位置 查询分区最新消息的位置。
     *
     * @param ShowPartitionEndMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionEndMessageResponse> */
    public CompletableFuture<ShowPartitionEndMessageResponse> showPartitionEndMessageAsync(
        ShowPartitionEndMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionEndMessage);
    }

    /** 查询分区最新消息的位置 查询分区最新消息的位置。
     *
     * @param ShowPartitionEndMessageRequest 请求对象
     * @return AsyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> */
    public AsyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> showPartitionEndMessageAsyncInvoker(
        ShowPartitionEndMessageRequest request) {
        return new AsyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse>(request,
            KafkaMeta.showPartitionEndMessage, hcClient);
    }

    /** 查询分区指定偏移量的消息 查询分区指定偏移量的消息。
     *
     * @param ShowPartitionMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionMessageResponse> */
    public CompletableFuture<ShowPartitionMessageResponse> showPartitionMessageAsync(
        ShowPartitionMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionMessage);
    }

    /** 查询分区指定偏移量的消息 查询分区指定偏移量的消息。
     *
     * @param ShowPartitionMessageRequest 请求对象
     * @return AsyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse> */
    public AsyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse> showPartitionMessageAsyncInvoker(
        ShowPartitionMessageRequest request) {
        return new AsyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse>(request,
            KafkaMeta.showPartitionMessage, hcClient);
    }

    /** 查询单个转储任务 查询单个转储任务。
     *
     * @param ShowSinkTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowSinkTaskDetailResponse> */
    public CompletableFuture<ShowSinkTaskDetailResponse> showSinkTaskDetailAsync(ShowSinkTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showSinkTaskDetail);
    }

    /** 查询单个转储任务 查询单个转储任务。
     *
     * @param ShowSinkTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> */
    public AsyncInvoker<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> showSinkTaskDetailAsyncInvoker(
        ShowSinkTaskDetailRequest request) {
        return new AsyncInvoker<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse>(request,
            KafkaMeta.showSinkTaskDetail, hcClient);
    }

    /** 查询用户权限 查询用户权限。 Kafka实例开启SASL功能时，才支持多用户管理的功能。
     *
     * @param ShowTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<ShowTopicAccessPolicyResponse> */
    public CompletableFuture<ShowTopicAccessPolicyResponse> showTopicAccessPolicyAsync(
        ShowTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showTopicAccessPolicy);
    }

    /** 查询用户权限 查询用户权限。 Kafka实例开启SASL功能时，才支持多用户管理的功能。
     *
     * @param ShowTopicAccessPolicyRequest 请求对象
     * @return AsyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> */
    public AsyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> showTopicAccessPolicyAsyncInvoker(
        ShowTopicAccessPolicyRequest request) {
        return new AsyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse>(request,
            KafkaMeta.showTopicAccessPolicy, hcClient);
    }

    /** 修改实例信息 修改实例的名称和描述信息。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse> */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstance);
    }

    /** 修改实例信息 修改实例的名称和描述信息。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, KafkaMeta.updateInstance,
            hcClient);
    }

    /** 开启或关闭实例自动创建topic功能 开启或关闭实例自动创建topic功能。
     *
     * @param UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return CompletableFuture<UpdateInstanceAutoCreateTopicResponse> */
    public CompletableFuture<UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopicAsync(
        UpdateInstanceAutoCreateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceAutoCreateTopic);
    }

    /** 开启或关闭实例自动创建topic功能 开启或关闭实例自动创建topic功能。
     *
     * @param UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> */
    public AsyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopicAsyncInvoker(
        UpdateInstanceAutoCreateTopicRequest request) {
        return new AsyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse>(request,
            KafkaMeta.updateInstanceAutoCreateTopic, hcClient);
    }

    /** 修改实例跨VPC访问的内网IP 修改实例跨VPC访问的内网IP。
     *
     * @param UpdateInstanceCrossVpcIpRequest 请求对象
     * @return CompletableFuture<UpdateInstanceCrossVpcIpResponse> */
    public CompletableFuture<UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIpAsync(
        UpdateInstanceCrossVpcIpRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceCrossVpcIp);
    }

    /** 修改实例跨VPC访问的内网IP 修改实例跨VPC访问的内网IP。
     *
     * @param UpdateInstanceCrossVpcIpRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> */
    public AsyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIpAsyncInvoker(
        UpdateInstanceCrossVpcIpRequest request) {
        return new AsyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse>(request,
            KafkaMeta.updateInstanceCrossVpcIp, hcClient);
    }

    /** 修改Kafka实例Topic 修改Kafka实例Topic
     *
     * @param UpdateInstanceTopicRequest 请求对象
     * @return CompletableFuture<UpdateInstanceTopicResponse> */
    public CompletableFuture<UpdateInstanceTopicResponse> updateInstanceTopicAsync(UpdateInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceTopic);
    }

    /** 修改Kafka实例Topic 修改Kafka实例Topic
     *
     * @param UpdateInstanceTopicRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> */
    public AsyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> updateInstanceTopicAsyncInvoker(
        UpdateInstanceTopicRequest request) {
        return new AsyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse>(request,
            KafkaMeta.updateInstanceTopic, hcClient);
    }

    /** 修改转储任务的配额 修改转储任务的配额。
     *
     * @param UpdateSinkTaskQuotaRequest 请求对象
     * @return CompletableFuture<UpdateSinkTaskQuotaResponse> */
    public CompletableFuture<UpdateSinkTaskQuotaResponse> updateSinkTaskQuotaAsync(UpdateSinkTaskQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateSinkTaskQuota);
    }

    /** 修改转储任务的配额 修改转储任务的配额。
     *
     * @param UpdateSinkTaskQuotaRequest 请求对象
     * @return AsyncInvoker<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> */
    public AsyncInvoker<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> updateSinkTaskQuotaAsyncInvoker(
        UpdateSinkTaskQuotaRequest request) {
        return new AsyncInvoker<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse>(request,
            KafkaMeta.updateSinkTaskQuota, hcClient);
    }

    /** 设置用户权限 设置用户权限。 Kafka实例开启SASL功能时，才支持多用户管理的功能。
     *
     * @param UpdateTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<UpdateTopicAccessPolicyResponse> */
    public CompletableFuture<UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyAsync(
        UpdateTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateTopicAccessPolicy);
    }

    /** 设置用户权限 设置用户权限。 Kafka实例开启SASL功能时，才支持多用户管理的功能。
     *
     * @param UpdateTopicAccessPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> */
    public AsyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyAsyncInvoker(
        UpdateTopicAccessPolicyRequest request) {
        return new AsyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>(request,
            KafkaMeta.updateTopicAccessPolicy, hcClient);
    }

    /** 修改Kafka实例Topic分区的副本 修改Kafka实例Topic分区的副本。
     *
     * @param UpdateTopicReplicaRequest 请求对象
     * @return CompletableFuture<UpdateTopicReplicaResponse> */
    public CompletableFuture<UpdateTopicReplicaResponse> updateTopicReplicaAsync(UpdateTopicReplicaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateTopicReplica);
    }

    /** 修改Kafka实例Topic分区的副本 修改Kafka实例Topic分区的副本。
     *
     * @param UpdateTopicReplicaRequest 请求对象
     * @return AsyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> */
    public AsyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> updateTopicReplicaAsyncInvoker(
        UpdateTopicReplicaRequest request) {
        return new AsyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse>(request,
            KafkaMeta.updateTopicReplica, hcClient);
    }

}
