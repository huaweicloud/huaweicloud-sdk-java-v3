package com.huaweicloud.sdk.rabbitmq.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchCreateOrDeleteRabbitMqTagRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchCreateOrDeleteRabbitMqTagResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteExchangesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteExchangesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteQueuesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteQueuesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteVhostsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteVhostsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchRestartOrDeleteInstancesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchRestartOrDeleteInstancesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateBindingRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateBindingResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateExchangeRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateExchangeResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreatePostPaidInstanceByEngineRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreatePostPaidInstanceByEngineResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateQueueRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateQueueResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateUserResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateVhostRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateVhostResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteBindingRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteBindingResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteQueueInfoRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteQueueInfoResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.EnableDnsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.EnableDnsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBindingsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBindingsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListConfigFeaturesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListConfigFeaturesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListExchangesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListExchangesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListInstancesDetailsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListInstancesDetailsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListPluginsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListPluginsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListQueuesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListQueuesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListScheduledTasksRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListScheduledTasksResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListUserResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListVhostsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListVhostsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ModifyRecyclePolicyRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ModifyRecyclePolicyResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeEngineInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeEngineInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.RestoreRecycleInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.RestoreRecycleInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowMaintainWindowsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowMaintainWindowsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowQueueDetailsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowQueueDetailsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProductCoresRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProductCoresResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProjectTagsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProjectTagsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqTagsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqTagsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRecycleInstancesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRecycleInstancesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowVolumeExpandConfigRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowVolumeExpandConfigResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdatePluginsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdatePluginsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateScheduledTaskRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateScheduledTaskResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateUserResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateVolumeExpansionConfigRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateVolumeExpansionConfigResponse;

import java.util.concurrent.CompletableFuture;

public class RabbitMQAsyncClient {

    protected HcClient hcClient;

    public RabbitMQAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RabbitMQAsyncClient> newBuilder() {
        ClientBuilder<RabbitMQAsyncClient> clientBuilder = new ClientBuilder<>(RabbitMQAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteRabbitMqTagRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteRabbitMqTagResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteRabbitMqTagResponse> batchCreateOrDeleteRabbitMqTagAsync(
        BatchCreateOrDeleteRabbitMqTagRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchCreateOrDeleteRabbitMqTag);
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteRabbitMqTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse> batchCreateOrDeleteRabbitMqTagAsyncInvoker(
        BatchCreateOrDeleteRabbitMqTagRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.batchCreateOrDeleteRabbitMqTag, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchRestartOrDeleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。
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
        return new AsyncInvoker<>(request, RabbitMQMeta.batchRestartOrDeleteInstances, hcClient);
    }

    /**
     * 创建实例(按需)
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createPostPaidInstance);
    }

    /**
     * 创建实例(按需)
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
        return new AsyncInvoker<>(request, RabbitMQMeta.createPostPaidInstance, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需[和包周期](tag:hws,hws_eu,hws_hk,ctc,cmcc,ax)计费方式的实例](tag:hws,hws_eu,hws_hk,ctc,g42,hk_g42,tm,hk_tm,cmcc,sbc,ax,hk_sbc)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceByEngineRequest 请求对象
     * @return CompletableFuture<CreatePostPaidInstanceByEngineResponse>
     */
    public CompletableFuture<CreatePostPaidInstanceByEngineResponse> createPostPaidInstanceByEngineAsync(
        CreatePostPaidInstanceByEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createPostPaidInstanceByEngine);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需[和包周期](tag:hws,hws_eu,hws_hk,ctc,cmcc,ax)计费方式的实例](tag:hws,hws_eu,hws_hk,ctc,g42,hk_g42,tm,hk_tm,cmcc,sbc,ax,hk_sbc)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceByEngineRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse>
     */
    public AsyncInvoker<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse> createPostPaidInstanceByEngineAsyncInvoker(
        CreatePostPaidInstanceByEngineRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.createPostPaidInstanceByEngine, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CompletableFuture<CreateUserResponse>
     */
    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.createUser, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteBackgroundTask);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除指定实例
     *
     * 删除指定实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteInstance);
    }

    /**
     * 删除指定实例
     *
     * 删除指定实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.deleteInstance, hcClient);
    }

    /**
     * 删除定时任务管理中的指定记录
     *
     * 删除定时任务管理中的指定记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return CompletableFuture<DeleteScheduledTaskResponse>
     */
    public CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTaskAsync(DeleteScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteScheduledTask);
    }

    /**
     * 删除定时任务管理中的指定记录
     *
     * 删除定时任务管理中的指定记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return AsyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
     */
    public AsyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTaskAsyncInvoker(
        DeleteScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.deleteScheduledTask, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.deleteUser, hcClient);
    }

    /**
     * 开启RabbitMQ实例域名访问能力
     *
     * 开启RabbitMQ实例域名访问功能后，客户端可以通过域名连接RabbitMQ实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return CompletableFuture<EnableDnsResponse>
     */
    public CompletableFuture<EnableDnsResponse> enableDnsAsync(EnableDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.enableDns);
    }

    /**
     * 开启RabbitMQ实例域名访问能力
     *
     * 开启RabbitMQ实例域名访问功能后，客户端可以通过域名连接RabbitMQ实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return AsyncInvoker<EnableDnsRequest, EnableDnsResponse>
     */
    public AsyncInvoker<EnableDnsRequest, EnableDnsResponse> enableDnsAsyncInvoker(EnableDnsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.enableDns, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listAvailableZones);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.listAvailableZones, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listBackgroundTasks);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.listBackgroundTasks, hcClient);
    }

    /**
     * 查询特性开关列表
     *
     * 查询特性开关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigFeaturesRequest 请求对象
     * @return CompletableFuture<ListConfigFeaturesResponse>
     */
    public CompletableFuture<ListConfigFeaturesResponse> listConfigFeaturesAsync(ListConfigFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listConfigFeatures);
    }

    /**
     * 查询特性开关列表
     *
     * 查询特性开关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigFeaturesRequest 请求对象
     * @return AsyncInvoker<ListConfigFeaturesRequest, ListConfigFeaturesResponse>
     */
    public AsyncInvoker<ListConfigFeaturesRequest, ListConfigFeaturesResponse> listConfigFeaturesAsyncInvoker(
        ListConfigFeaturesRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listConfigFeatures, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listEngineProducts);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return CompletableFuture<ListInstancesDetailsResponse>
     */
    public CompletableFuture<ListInstancesDetailsResponse> listInstancesDetailsAsync(
        ListInstancesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listInstancesDetails);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>
     */
    public AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetailsAsyncInvoker(
        ListInstancesDetailsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listInstancesDetails, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return CompletableFuture<ListPluginsResponse>
     */
    public CompletableFuture<ListPluginsResponse> listPluginsAsync(ListPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return AsyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public AsyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsAsyncInvoker(ListPluginsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listPlugins, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listProducts, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listScheduledTasks);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return CompletableFuture<ListUserResponse>
     */
    public CompletableFuture<ListUserResponse> listUserAsync(ListUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listUser);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return AsyncInvoker<ListUserRequest, ListUserResponse>
     */
    public AsyncInvoker<ListUserRequest, ListUserResponse> listUserAsyncInvoker(ListUserRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listUser, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.modifyRecyclePolicy);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.modifyRecyclePolicy, hcClient);
    }

    /**
     * 重置密码
     *
     * 重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.resetPassword, hcClient);
    }

    /**
     * 新规格实例的规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc,hws_eu,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineInstanceRequest 请求对象
     * @return CompletableFuture<ResizeEngineInstanceResponse>
     */
    public CompletableFuture<ResizeEngineInstanceResponse> resizeEngineInstanceAsync(
        ResizeEngineInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resizeEngineInstance);
    }

    /**
     * 新规格实例的规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc,hws_eu,ax)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse>
     */
    public AsyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstanceAsyncInvoker(
        ResizeEngineInstanceRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.resizeEngineInstance, hcClient);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resizeInstance);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.resizeInstance, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.restoreRecycleInstance);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.restoreRecycleInstance, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showBackgroundTask);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.showBackgroundTask, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showCesHierarchy);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.showCesHierarchy, hcClient);
    }

    /**
     * 查询新规格可扩容规格列表
     *
     * 查询新规格实例可扩容列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowEngineInstanceExtendProductInfoResponse>
     */
    public CompletableFuture<ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoAsync(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showEngineInstanceExtendProductInfo);
    }

    /**
     * 查询新规格可扩容规格列表
     *
     * 查询新规格实例可扩容列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return AsyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>
     */
    public AsyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoAsyncInvoker(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.showEngineInstanceExtendProductInfo, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstance);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.showInstance, hcClient);
    }

    /**
     * 查询可扩容规格列表
     *
     * 查询可扩容规格列表。
     * 
     * RabbtiMQ只支持只增加节点数的扩容方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceExtendProductInfoResponse>
     */
    public CompletableFuture<ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsync(
        ShowInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstanceExtendProductInfo);
    }

    /**
     * 查询可扩容规格列表
     *
     * 查询可扩容规格列表。
     * 
     * RabbtiMQ只支持只增加节点数的扩容方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceExtendProductInfoRequest 请求对象
     * @return AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>
     */
    public AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsyncInvoker(
        ShowInstanceExtendProductInfoRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.showInstanceExtendProductInfo, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showMaintainWindows);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.showMaintainWindows, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showQuotas);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.showQuotas, hcClient);
    }

    /**
     * 查询RabbitMQ产品规格核数
     *
     * 查询RabbitMQ产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRabbitMqProductCoresRequest 请求对象
     * @return CompletableFuture<ShowRabbitMqProductCoresResponse>
     */
    public CompletableFuture<ShowRabbitMqProductCoresResponse> showRabbitMqProductCoresAsync(
        ShowRabbitMqProductCoresRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showRabbitMqProductCores);
    }

    /**
     * 查询RabbitMQ产品规格核数
     *
     * 查询RabbitMQ产品规格核数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRabbitMqProductCoresRequest 请求对象
     * @return AsyncInvoker<ShowRabbitMqProductCoresRequest, ShowRabbitMqProductCoresResponse>
     */
    public AsyncInvoker<ShowRabbitMqProductCoresRequest, ShowRabbitMqProductCoresResponse> showRabbitMqProductCoresAsyncInvoker(
        ShowRabbitMqProductCoresRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.showRabbitMqProductCores, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRabbitMqProjectTagsRequest 请求对象
     * @return CompletableFuture<ShowRabbitMqProjectTagsResponse>
     */
    public CompletableFuture<ShowRabbitMqProjectTagsResponse> showRabbitMqProjectTagsAsync(
        ShowRabbitMqProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showRabbitMqProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRabbitMqProjectTagsRequest 请求对象
     * @return AsyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse>
     */
    public AsyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse> showRabbitMqProjectTagsAsyncInvoker(
        ShowRabbitMqProjectTagsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.showRabbitMqProjectTags, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRabbitMqTagsRequest 请求对象
     * @return CompletableFuture<ShowRabbitMqTagsResponse>
     */
    public CompletableFuture<ShowRabbitMqTagsResponse> showRabbitMqTagsAsync(ShowRabbitMqTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showRabbitMqTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRabbitMqTagsRequest 请求对象
     * @return AsyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse>
     */
    public AsyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse> showRabbitMqTagsAsyncInvoker(
        ShowRabbitMqTagsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.showRabbitMqTags, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showRecycleInstances);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.showRecycleInstances, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showVolumeExpandConfig);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.showVolumeExpandConfig, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.updateInstance, hcClient);
    }

    /**
     * 开启或关闭插件
     *
     * 开启或关闭插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePluginsRequest 请求对象
     * @return CompletableFuture<UpdatePluginsResponse>
     */
    public CompletableFuture<UpdatePluginsResponse> updatePluginsAsync(UpdatePluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updatePlugins);
    }

    /**
     * 开启或关闭插件
     *
     * 开启或关闭插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePluginsRequest 请求对象
     * @return AsyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse>
     */
    public AsyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse> updatePluginsAsyncInvoker(
        UpdatePluginsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.updatePlugins, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updateScheduledTask);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.updateScheduledTask, hcClient);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updateUser);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.updateUser, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updateVolumeExpansionConfig);
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
        return new AsyncInvoker<>(request, RabbitMQMeta.updateVolumeExpansionConfig, hcClient);
    }

    /**
     * 添加绑定
     *
     * 添加绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindingRequest 请求对象
     * @return CompletableFuture<CreateBindingResponse>
     */
    public CompletableFuture<CreateBindingResponse> createBindingAsync(CreateBindingRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createBinding);
    }

    /**
     * 添加绑定
     *
     * 添加绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindingRequest 请求对象
     * @return AsyncInvoker<CreateBindingRequest, CreateBindingResponse>
     */
    public AsyncInvoker<CreateBindingRequest, CreateBindingResponse> createBindingAsyncInvoker(
        CreateBindingRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.createBinding, hcClient);
    }

    /**
     * 删除绑定
     *
     * 删除绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBindingRequest 请求对象
     * @return CompletableFuture<DeleteBindingResponse>
     */
    public CompletableFuture<DeleteBindingResponse> deleteBindingAsync(DeleteBindingRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteBinding);
    }

    /**
     * 删除绑定
     *
     * 删除绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBindingRequest 请求对象
     * @return AsyncInvoker<DeleteBindingRequest, DeleteBindingResponse>
     */
    public AsyncInvoker<DeleteBindingRequest, DeleteBindingResponse> deleteBindingAsyncInvoker(
        DeleteBindingRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.deleteBinding, hcClient);
    }

    /**
     * 查询Exchange绑定信息列表
     *
     * 查询Exchange绑定信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindingsRequest 请求对象
     * @return CompletableFuture<ListBindingsResponse>
     */
    public CompletableFuture<ListBindingsResponse> listBindingsAsync(ListBindingsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listBindings);
    }

    /**
     * 查询Exchange绑定信息列表
     *
     * 查询Exchange绑定信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindingsRequest 请求对象
     * @return AsyncInvoker<ListBindingsRequest, ListBindingsResponse>
     */
    public AsyncInvoker<ListBindingsRequest, ListBindingsResponse> listBindingsAsyncInvoker(
        ListBindingsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listBindings, hcClient);
    }

    /**
     * 批量删除指定Exchange
     *
     * 批量删除指定Exchange。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteExchangesRequest 请求对象
     * @return CompletableFuture<BatchDeleteExchangesResponse>
     */
    public CompletableFuture<BatchDeleteExchangesResponse> batchDeleteExchangesAsync(
        BatchDeleteExchangesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchDeleteExchanges);
    }

    /**
     * 批量删除指定Exchange
     *
     * 批量删除指定Exchange。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteExchangesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteExchangesRequest, BatchDeleteExchangesResponse>
     */
    public AsyncInvoker<BatchDeleteExchangesRequest, BatchDeleteExchangesResponse> batchDeleteExchangesAsyncInvoker(
        BatchDeleteExchangesRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.batchDeleteExchanges, hcClient);
    }

    /**
     * 创建Exchange
     *
     * 创建Exchange。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExchangeRequest 请求对象
     * @return CompletableFuture<CreateExchangeResponse>
     */
    public CompletableFuture<CreateExchangeResponse> createExchangeAsync(CreateExchangeRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createExchange);
    }

    /**
     * 创建Exchange
     *
     * 创建Exchange。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExchangeRequest 请求对象
     * @return AsyncInvoker<CreateExchangeRequest, CreateExchangeResponse>
     */
    public AsyncInvoker<CreateExchangeRequest, CreateExchangeResponse> createExchangeAsyncInvoker(
        CreateExchangeRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.createExchange, hcClient);
    }

    /**
     * 查询Exchange列表
     *
     * 查询Exchange列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExchangesRequest 请求对象
     * @return CompletableFuture<ListExchangesResponse>
     */
    public CompletableFuture<ListExchangesResponse> listExchangesAsync(ListExchangesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listExchanges);
    }

    /**
     * 查询Exchange列表
     *
     * 查询Exchange列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExchangesRequest 请求对象
     * @return AsyncInvoker<ListExchangesRequest, ListExchangesResponse>
     */
    public AsyncInvoker<ListExchangesRequest, ListExchangesResponse> listExchangesAsyncInvoker(
        ListExchangesRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listExchanges, hcClient);
    }

    /**
     * 批量删除指定Queue
     *
     * 批量删除指定Queue。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteQueuesRequest 请求对象
     * @return CompletableFuture<BatchDeleteQueuesResponse>
     */
    public CompletableFuture<BatchDeleteQueuesResponse> batchDeleteQueuesAsync(BatchDeleteQueuesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchDeleteQueues);
    }

    /**
     * 批量删除指定Queue
     *
     * 批量删除指定Queue。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteQueuesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteQueuesRequest, BatchDeleteQueuesResponse>
     */
    public AsyncInvoker<BatchDeleteQueuesRequest, BatchDeleteQueuesResponse> batchDeleteQueuesAsyncInvoker(
        BatchDeleteQueuesRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.batchDeleteQueues, hcClient);
    }

    /**
     * 创建Queue
     *
     * 创建Queue。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQueueRequest 请求对象
     * @return CompletableFuture<CreateQueueResponse>
     */
    public CompletableFuture<CreateQueueResponse> createQueueAsync(CreateQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createQueue);
    }

    /**
     * 创建Queue
     *
     * 创建Queue。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQueueRequest 请求对象
     * @return AsyncInvoker<CreateQueueRequest, CreateQueueResponse>
     */
    public AsyncInvoker<CreateQueueRequest, CreateQueueResponse> createQueueAsyncInvoker(CreateQueueRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.createQueue, hcClient);
    }

    /**
     * 清空Queue消息
     *
     * 清空Queue消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueInfoRequest 请求对象
     * @return CompletableFuture<DeleteQueueInfoResponse>
     */
    public CompletableFuture<DeleteQueueInfoResponse> deleteQueueInfoAsync(DeleteQueueInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteQueueInfo);
    }

    /**
     * 清空Queue消息
     *
     * 清空Queue消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueInfoRequest 请求对象
     * @return AsyncInvoker<DeleteQueueInfoRequest, DeleteQueueInfoResponse>
     */
    public AsyncInvoker<DeleteQueueInfoRequest, DeleteQueueInfoResponse> deleteQueueInfoAsyncInvoker(
        DeleteQueueInfoRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.deleteQueueInfo, hcClient);
    }

    /**
     * 查询所属Vhost下Queue的列表
     *
     * 查询所属Vhost下Queue的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueuesRequest 请求对象
     * @return CompletableFuture<ListQueuesResponse>
     */
    public CompletableFuture<ListQueuesResponse> listQueuesAsync(ListQueuesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listQueues);
    }

    /**
     * 查询所属Vhost下Queue的列表
     *
     * 查询所属Vhost下Queue的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueuesRequest 请求对象
     * @return AsyncInvoker<ListQueuesRequest, ListQueuesResponse>
     */
    public AsyncInvoker<ListQueuesRequest, ListQueuesResponse> listQueuesAsyncInvoker(ListQueuesRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listQueues, hcClient);
    }

    /**
     * 查询指定Queue详情
     *
     * 查询指定Queue详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueueDetailsRequest 请求对象
     * @return CompletableFuture<ShowQueueDetailsResponse>
     */
    public CompletableFuture<ShowQueueDetailsResponse> showQueueDetailsAsync(ShowQueueDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showQueueDetails);
    }

    /**
     * 查询指定Queue详情
     *
     * 查询指定Queue详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueueDetailsRequest 请求对象
     * @return AsyncInvoker<ShowQueueDetailsRequest, ShowQueueDetailsResponse>
     */
    public AsyncInvoker<ShowQueueDetailsRequest, ShowQueueDetailsResponse> showQueueDetailsAsyncInvoker(
        ShowQueueDetailsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.showQueueDetails, hcClient);
    }

    /**
     * 批量删除指定Vhost
     *
     * 批量删除指定Vhost。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVhostsRequest 请求对象
     * @return CompletableFuture<BatchDeleteVhostsResponse>
     */
    public CompletableFuture<BatchDeleteVhostsResponse> batchDeleteVhostsAsync(BatchDeleteVhostsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchDeleteVhosts);
    }

    /**
     * 批量删除指定Vhost
     *
     * 批量删除指定Vhost。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVhostsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVhostsRequest, BatchDeleteVhostsResponse>
     */
    public AsyncInvoker<BatchDeleteVhostsRequest, BatchDeleteVhostsResponse> batchDeleteVhostsAsyncInvoker(
        BatchDeleteVhostsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.batchDeleteVhosts, hcClient);
    }

    /**
     * 创建Vhost
     *
     * 创建Vhost。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVhostRequest 请求对象
     * @return CompletableFuture<CreateVhostResponse>
     */
    public CompletableFuture<CreateVhostResponse> createVhostAsync(CreateVhostRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createVhost);
    }

    /**
     * 创建Vhost
     *
     * 创建Vhost。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVhostRequest 请求对象
     * @return AsyncInvoker<CreateVhostRequest, CreateVhostResponse>
     */
    public AsyncInvoker<CreateVhostRequest, CreateVhostResponse> createVhostAsyncInvoker(CreateVhostRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.createVhost, hcClient);
    }

    /**
     * 查询Vhost列表
     *
     * 查询Vhost列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVhostsRequest 请求对象
     * @return CompletableFuture<ListVhostsResponse>
     */
    public CompletableFuture<ListVhostsResponse> listVhostsAsync(ListVhostsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listVhosts);
    }

    /**
     * 查询Vhost列表
     *
     * 查询Vhost列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVhostsRequest 请求对象
     * @return AsyncInvoker<ListVhostsRequest, ListVhostsResponse>
     */
    public AsyncInvoker<ListVhostsRequest, ListVhostsResponse> listVhostsAsyncInvoker(ListVhostsRequest request) {
        return new AsyncInvoker<>(request, RabbitMQMeta.listVhosts, hcClient);
    }

}
