package com.huaweicloud.sdk.rabbitmq.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.rabbitmq.v2.model.*;

public class RabbitMQClient {
    protected HcClient hcClient;

    public RabbitMQClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RabbitMQClient> newBuilder() {
        return new ClientBuilder<>(RabbitMQClient::new);
    }


    /**
     * 批量添加或删除实例标签
     * 批量添加或删除实例标签。
     *
     * @param BatchCreateOrDeleteInstanceTagRequest 请求对象
     * @return BatchCreateOrDeleteInstanceTagResponse
    */
    public BatchCreateOrDeleteInstanceTagResponse batchCreateOrDeleteInstanceTag(BatchCreateOrDeleteInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.batchCreateOrDeleteInstanceTag);
    }

    /**
     * 批量重启或删除实例
     * 批量重启或删除实例。  在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。  实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     *
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return BatchRestartOrDeleteInstancesResponse
    */
    public BatchRestartOrDeleteInstancesResponse batchRestartOrDeleteInstances(BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.batchRestartOrDeleteInstances);
    }

    /**
     * 创建实例(按需)
     * 创建实例，该接口创建的实例为按需计费的方式。
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return CreatePostPaidInstanceResponse
    */
    public CreatePostPaidInstanceResponse createPostPaidInstance(CreatePostPaidInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createPostPaidInstance);
    }

    /**
     * 删除后台任务管理中的指定记录
     * 删除后台任务管理中的指定记录。
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return DeleteBackgroundTaskResponse
    */
    public DeleteBackgroundTaskResponse deleteBackgroundTask(DeleteBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteBackgroundTask);
    }

    /**
     * 删除指定的实例
     * 删除指定的实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
    */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteInstance);
    }

    /**
     * 查询可用区信息
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
    */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listAvailableZones);
    }

    /**
     * 查询实例的后台任务列表
     * 查询实例的后台任务列表。
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return ListBackgroundTasksResponse
    */
    public ListBackgroundTasksResponse listBackgroundTasks(ListBackgroundTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listBackgroundTasks);
    }

    /**
     * 查询所有实例列表
     * 查询租户的实例列表，支持按照条件查询。
     *
     * @param ListInstancesDetailsRequest 请求对象
     * @return ListInstancesDetailsResponse
    */
    public ListInstancesDetailsResponse listInstancesDetails(ListInstancesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listInstancesDetails);
    }

    /**
     * 查询产品规格列表
     * 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     *
     * @param ListProductsRequest 请求对象
     * @return ListProductsResponse
    */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listProducts);
    }

    /**
     * 重置密码
     * 重置密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
    */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.resetPassword);
    }

    /**
     * 实例规格变更
     * 实例规格变更。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
    */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.resizeInstance);
    }

    /**
     * 查询后台任务管理中的指定记录
     * 查询后台任务管理中的指定记录。
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return ShowBackgroundTaskResponse
    */
    public ShowBackgroundTaskResponse showBackgroundTask(ShowBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showBackgroundTask);
    }

    /**
     * 查询指定实例成功
     * 查询指定实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
    */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showInstance);
    }

    /**
     * 查询可扩容规格列表
     * 查询可扩容规格列表。  RabbtiMQ只支持只增加节点数的扩容方式。
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return ShowInstanceExtendProductInfoResponse
    */
    public ShowInstanceExtendProductInfoResponse showInstanceExtendProductInfo(ShowInstanceExtendProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showInstanceExtendProductInfo);
    }

    /**
     * 查询实例标签
     * 查询实例标签。
     *
     * @param ShowInstanceTagsRequest 请求对象
     * @return ShowInstanceTagsResponse
    */
    public ShowInstanceTagsResponse showInstanceTags(ShowInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showInstanceTags);
    }

    /**
     * 查询维护时间窗时间段
     * 查询维护时间窗开始时间和结束时间。
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return ShowMaintainWindowsResponse
    */
    public ShowMaintainWindowsResponse showMaintainWindows(ShowMaintainWindowsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showMaintainWindows);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ShowProjectTagsRequest 请求对象
     * @return ShowProjectTagsResponse
    */
    public ShowProjectTagsResponse showProjectTags(ShowProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showProjectTags);
    }

    /**
     * 修改实例信息
     * 修改实例的名称和描述信息。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
    */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.updateInstance);
    }

}