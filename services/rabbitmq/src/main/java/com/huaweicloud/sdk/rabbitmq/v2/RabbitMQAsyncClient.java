package com.huaweicloud.sdk.rabbitmq.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rabbitmq.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class RabbitMQAsyncClient {

    protected HcClient hcClient;

    public RabbitMQAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RabbitMQAsyncClient> newBuilder() {
        return new ClientBuilder<>(RabbitMQAsyncClient::new);
    }

    /** 批量添加或删除实例标签 批量添加或删除实例标签。
     *
     * @param BatchCreateOrDeleteRabbitMqTagRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteRabbitMqTagResponse> */
    public CompletableFuture<BatchCreateOrDeleteRabbitMqTagResponse> batchCreateOrDeleteRabbitMqTagAsync(
        BatchCreateOrDeleteRabbitMqTagRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchCreateOrDeleteRabbitMqTag);
    }

    /** 批量添加或删除实例标签 批量添加或删除实例标签。
     *
     * @param BatchCreateOrDeleteRabbitMqTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse> */
    public AsyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse> batchCreateOrDeleteRabbitMqTagAsyncInvoker(
        BatchCreateOrDeleteRabbitMqTagRequest request) {
        return new AsyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse>(request,
            RabbitMQMeta.batchCreateOrDeleteRabbitMqTag, hcClient);
    }

    /** 批量重启或删除实例 批量重启或删除实例。 在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。 实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     *
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return CompletableFuture<BatchRestartOrDeleteInstancesResponse> */
    public CompletableFuture<BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsync(
        BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchRestartOrDeleteInstances);
    }

    /** 批量重启或删除实例 批量重启或删除实例。 在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。 实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     *
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return AsyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> */
    public AsyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsyncInvoker(
        BatchRestartOrDeleteInstancesRequest request) {
        return new AsyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>(request,
            RabbitMQMeta.batchRestartOrDeleteInstances, hcClient);
    }

    /** 创建实例(按需) 创建实例，该接口创建的实例为按需计费的方式。
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return CompletableFuture<CreatePostPaidInstanceResponse> */
    public CompletableFuture<CreatePostPaidInstanceResponse> createPostPaidInstanceAsync(
        CreatePostPaidInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createPostPaidInstance);
    }

    /** 创建实例(按需) 创建实例，该接口创建的实例为按需计费的方式。
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> */
    public AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceAsyncInvoker(
        CreatePostPaidInstanceRequest request) {
        return new AsyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>(request,
            RabbitMQMeta.createPostPaidInstance, hcClient);
    }

    /** 删除后台任务管理中的指定记录 删除后台任务管理中的指定记录。
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return CompletableFuture<DeleteBackgroundTaskResponse> */
    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(
        DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteBackgroundTask);
    }

    /** 删除后台任务管理中的指定记录 删除后台任务管理中的指定记录。
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> */
    public AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskAsyncInvoker(
        DeleteBackgroundTaskRequest request) {
        return new AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>(request,
            RabbitMQMeta.deleteBackgroundTask, hcClient);
    }

    /** 删除指定的实例 删除指定的实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse> */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteInstance);
    }

    /** 删除指定的实例 删除指定的实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RabbitMQMeta.deleteInstance,
            hcClient);
    }

    /** 查询可用区信息 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return CompletableFuture<ListAvailableZonesResponse> */
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listAvailableZones);
    }

    /** 查询可用区信息 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> */
    public AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesAsyncInvoker(
        ListAvailableZonesRequest request) {
        return new AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>(request,
            RabbitMQMeta.listAvailableZones, hcClient);
    }

    /** 查询实例的后台任务列表 查询实例的后台任务列表。
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return CompletableFuture<ListBackgroundTasksResponse> */
    public CompletableFuture<ListBackgroundTasksResponse> listBackgroundTasksAsync(ListBackgroundTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listBackgroundTasks);
    }

    /** 查询实例的后台任务列表 查询实例的后台任务列表。
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return AsyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse> */
    public AsyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasksAsyncInvoker(
        ListBackgroundTasksRequest request) {
        return new AsyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse>(request,
            RabbitMQMeta.listBackgroundTasks, hcClient);
    }

    /** 查询所有实例列表 查询租户的实例列表，支持按照条件查询。
     *
     * @param ListInstancesDetailsRequest 请求对象
     * @return CompletableFuture<ListInstancesDetailsResponse> */
    public CompletableFuture<ListInstancesDetailsResponse> listInstancesDetailsAsync(
        ListInstancesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listInstancesDetails);
    }

    /** 查询所有实例列表 查询租户的实例列表，支持按照条件查询。
     *
     * @param ListInstancesDetailsRequest 请求对象
     * @return AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> */
    public AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetailsAsyncInvoker(
        ListInstancesDetailsRequest request) {
        return new AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>(request,
            RabbitMQMeta.listInstancesDetails, hcClient);
    }

    /** 查询插件列表 查询插件列表。
     *
     * @param ListPluginsRequest 请求对象
     * @return CompletableFuture<ListPluginsResponse> */
    public CompletableFuture<ListPluginsResponse> listPluginsAsync(ListPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listPlugins);
    }

    /** 查询插件列表 查询插件列表。
     *
     * @param ListPluginsRequest 请求对象
     * @return AsyncInvoker<ListPluginsRequest, ListPluginsResponse> */
    public AsyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsAsyncInvoker(ListPluginsRequest request) {
        return new AsyncInvoker<ListPluginsRequest, ListPluginsResponse>(request, RabbitMQMeta.listPlugins, hcClient);
    }

    /** 查询产品规格列表 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse> */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listProducts);
    }

    /** 查询产品规格列表 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     *
     * @param ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse> */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<ListProductsRequest, ListProductsResponse>(request, RabbitMQMeta.listProducts,
            hcClient);
    }

    /** 重置密码 重置密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse> */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resetPassword);
    }

    /** 重置密码 重置密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, RabbitMQMeta.resetPassword,
            hcClient);
    }

    /** 实例规格变更 实例规格变更。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse> */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resizeInstance);
    }

    /** 实例规格变更 实例规格变更。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, RabbitMQMeta.resizeInstance,
            hcClient);
    }

    /** 查询后台任务管理中的指定记录 查询后台任务管理中的指定记录。
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return CompletableFuture<ShowBackgroundTaskResponse> */
    public CompletableFuture<ShowBackgroundTaskResponse> showBackgroundTaskAsync(ShowBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showBackgroundTask);
    }

    /** 查询后台任务管理中的指定记录 查询后台任务管理中的指定记录。
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> */
    public AsyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTaskAsyncInvoker(
        ShowBackgroundTaskRequest request) {
        return new AsyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse>(request,
            RabbitMQMeta.showBackgroundTask, hcClient);
    }

    /** 查询指定实例 查询指定实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse> */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstance);
    }

    /** 查询指定实例 查询指定实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, RabbitMQMeta.showInstance,
            hcClient);
    }

    /** 查询可扩容规格列表 查询可扩容规格列表。 RabbtiMQ只支持只增加节点数的扩容方式。
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceExtendProductInfoResponse> */
    public CompletableFuture<ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsync(
        ShowInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstanceExtendProductInfo);
    }

    /** 查询可扩容规格列表 查询可扩容规格列表。 RabbtiMQ只支持只增加节点数的扩容方式。
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> */
    public AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsyncInvoker(
        ShowInstanceExtendProductInfoRequest request) {
        return new AsyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>(request,
            RabbitMQMeta.showInstanceExtendProductInfo, hcClient);
    }

    /** 查询维护时间窗时间段 查询维护时间窗开始时间和结束时间。
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return CompletableFuture<ShowMaintainWindowsResponse> */
    public CompletableFuture<ShowMaintainWindowsResponse> showMaintainWindowsAsync(ShowMaintainWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showMaintainWindows);
    }

    /** 查询维护时间窗时间段 查询维护时间窗开始时间和结束时间。
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return AsyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> */
    public AsyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindowsAsyncInvoker(
        ShowMaintainWindowsRequest request) {
        return new AsyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse>(request,
            RabbitMQMeta.showMaintainWindows, hcClient);
    }

    /** 查询项目标签 查询项目标签。
     *
     * @param ShowRabbitMqProjectTagsRequest 请求对象
     * @return CompletableFuture<ShowRabbitMqProjectTagsResponse> */
    public CompletableFuture<ShowRabbitMqProjectTagsResponse> showRabbitMqProjectTagsAsync(
        ShowRabbitMqProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showRabbitMqProjectTags);
    }

    /** 查询项目标签 查询项目标签。
     *
     * @param ShowRabbitMqProjectTagsRequest 请求对象
     * @return AsyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse> */
    public AsyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse> showRabbitMqProjectTagsAsyncInvoker(
        ShowRabbitMqProjectTagsRequest request) {
        return new AsyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse>(request,
            RabbitMQMeta.showRabbitMqProjectTags, hcClient);
    }

    /** 查询实例标签 查询实例标签。
     *
     * @param ShowRabbitMqTagsRequest 请求对象
     * @return CompletableFuture<ShowRabbitMqTagsResponse> */
    public CompletableFuture<ShowRabbitMqTagsResponse> showRabbitMqTagsAsync(ShowRabbitMqTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showRabbitMqTags);
    }

    /** 查询实例标签 查询实例标签。
     *
     * @param ShowRabbitMqTagsRequest 请求对象
     * @return AsyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse> */
    public AsyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse> showRabbitMqTagsAsyncInvoker(
        ShowRabbitMqTagsRequest request) {
        return new AsyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse>(request,
            RabbitMQMeta.showRabbitMqTags, hcClient);
    }

    /** 修改实例信息 修改实例的名称和描述信息。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse> */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updateInstance);
    }

    /** 修改实例信息 修改实例的名称和描述信息。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, RabbitMQMeta.updateInstance,
            hcClient);
    }

    /** 开启或关闭插件 开启或关闭插件。
     *
     * @param UpdatePluginsRequest 请求对象
     * @return CompletableFuture<UpdatePluginsResponse> */
    public CompletableFuture<UpdatePluginsResponse> updatePluginsAsync(UpdatePluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updatePlugins);
    }

    /** 开启或关闭插件 开启或关闭插件。
     *
     * @param UpdatePluginsRequest 请求对象
     * @return AsyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse> */
    public AsyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse> updatePluginsAsyncInvoker(
        UpdatePluginsRequest request) {
        return new AsyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse>(request, RabbitMQMeta.updatePlugins,
            hcClient);
    }

}
