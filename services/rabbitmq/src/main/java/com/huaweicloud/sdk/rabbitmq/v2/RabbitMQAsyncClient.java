package com.huaweicloud.sdk.rabbitmq.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.rabbitmq.v2.model.*;

public class RabbitMQAsyncClient {
    protected HcClient hcClient;

    public RabbitMQAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RabbitMQAsyncClient> newBuilder() {
        return new ClientBuilder<>(RabbitMQAsyncClient::new);
    }


    /**
     * 批量添加或删除实例标签
     * 批量添加或删除实例标签。
     *
     * @param BatchCreateOrDeleteInstanceTagRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteInstanceTagResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteInstanceTagResponse> batchCreateOrDeleteInstanceTagAsync(BatchCreateOrDeleteInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchCreateOrDeleteInstanceTag);
    }

    /**
     * 批量重启或删除实例
     * 批量重启或删除实例。  在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。  实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     *
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return CompletableFuture<BatchRestartOrDeleteInstancesResponse>
     */
    public CompletableFuture<BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsync(BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchRestartOrDeleteInstances);
    }

    /**
     * 创建实例(按需)
     * 创建实例，该接口创建的实例为按需计费的方式。
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return CompletableFuture<CreatePostPaidInstanceResponse>
     */
    public CompletableFuture<CreatePostPaidInstanceResponse> createPostPaidInstanceAsync(CreatePostPaidInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createPostPaidInstance);
    }

    /**
     * 删除后台任务管理中的指定记录
     * 删除后台任务管理中的指定记录。
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return CompletableFuture<DeleteBackgroundTaskResponse>
     */
    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteBackgroundTask);
    }

    /**
     * 删除指定的实例
     * 删除指定的实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteInstance);
    }

    /**
     * 查询可用区信息
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return CompletableFuture<ListAvailableZonesResponse>
     */
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listAvailableZones);
    }

    /**
     * 查询实例的后台任务列表
     * 查询实例的后台任务列表。
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return CompletableFuture<ListBackgroundTasksResponse>
     */
    public CompletableFuture<ListBackgroundTasksResponse> listBackgroundTasksAsync(ListBackgroundTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listBackgroundTasks);
    }

    /**
     * 查询所有实例列表
     * 查询租户的实例列表，支持按照条件查询。
     *
     * @param ListInstancesDetailsRequest 请求对象
     * @return CompletableFuture<ListInstancesDetailsResponse>
     */
    public CompletableFuture<ListInstancesDetailsResponse> listInstancesDetailsAsync(ListInstancesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listInstancesDetails);
    }

    /**
     * 查询插件列表
     * 查询插件列表。
     *
     * @param ListPluginsRequest 请求对象
     * @return CompletableFuture<ListPluginsResponse>
     */
    public CompletableFuture<ListPluginsResponse> listPluginsAsync(ListPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listPlugins);
    }

    /**
     * 查询产品规格列表
     * 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listProducts);
    }

    /**
     * 重置密码
     * 重置密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resetPassword);
    }

    /**
     * 实例规格变更
     * 实例规格变更。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resizeInstance);
    }

    /**
     * 查询后台任务管理中的指定记录
     * 查询后台任务管理中的指定记录。
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return CompletableFuture<ShowBackgroundTaskResponse>
     */
    public CompletableFuture<ShowBackgroundTaskResponse> showBackgroundTaskAsync(ShowBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showBackgroundTask);
    }

    /**
     * 查询指定实例成功
     * 查询指定实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstance);
    }

    /**
     * 查询可扩容规格列表
     * 查询可扩容规格列表。  RabbtiMQ只支持只增加节点数的扩容方式。
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceExtendProductInfoResponse>
     */
    public CompletableFuture<ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsync(ShowInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstanceExtendProductInfo);
    }

    /**
     * 查询实例标签
     * 查询实例标签。
     *
     * @param ShowInstanceTagsRequest 请求对象
     * @return CompletableFuture<ShowInstanceTagsResponse>
     */
    public CompletableFuture<ShowInstanceTagsResponse> showInstanceTagsAsync(ShowInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstanceTags);
    }

    /**
     * 查询维护时间窗时间段
     * 查询维护时间窗开始时间和结束时间。
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return CompletableFuture<ShowMaintainWindowsResponse>
     */
    public CompletableFuture<ShowMaintainWindowsResponse> showMaintainWindowsAsync(ShowMaintainWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showMaintainWindows);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ShowProjectTagsRequest 请求对象
     * @return CompletableFuture<ShowProjectTagsResponse>
     */
    public CompletableFuture<ShowProjectTagsResponse> showProjectTagsAsync(ShowProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showProjectTags);
    }

    /**
     * 修改实例信息
     * 修改实例的名称和描述信息。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updateInstance);
    }

    /**
     * 开启或关闭插件
     * 开启或关闭插件。
     *
     * @param UpdatePluginsRequest 请求对象
     * @return CompletableFuture<UpdatePluginsResponse>
     */
    public CompletableFuture<UpdatePluginsResponse> updatePluginsAsync(UpdatePluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updatePlugins);
    }

}