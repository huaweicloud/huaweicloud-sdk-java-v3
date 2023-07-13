package com.huaweicloud.sdk.rabbitmq.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteRabbitMqTagRequest 请求对象
     * @return BatchCreateOrDeleteRabbitMqTagResponse
     */
    public BatchCreateOrDeleteRabbitMqTagResponse batchCreateOrDeleteRabbitMqTag(
        BatchCreateOrDeleteRabbitMqTagRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.batchCreateOrDeleteRabbitMqTag);
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteRabbitMqTagRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse> batchCreateOrDeleteRabbitMqTagInvoker(
        BatchCreateOrDeleteRabbitMqTagRequest request) {
        return new SyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse>(request,
            RabbitMQMeta.batchCreateOrDeleteRabbitMqTag, hcClient);
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
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return BatchRestartOrDeleteInstancesResponse
     */
    public BatchRestartOrDeleteInstancesResponse batchRestartOrDeleteInstances(
        BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.batchRestartOrDeleteInstances);
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
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>
     */
    public SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesInvoker(
        BatchRestartOrDeleteInstancesRequest request) {
        return new SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>(request,
            RabbitMQMeta.batchRestartOrDeleteInstances, hcClient);
    }

    /**
     * 创建实例(按需)
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return CreatePostPaidInstanceResponse
     */
    public CreatePostPaidInstanceResponse createPostPaidInstance(CreatePostPaidInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createPostPaidInstance);
    }

    /**
     * 创建实例(按需)
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceInvoker(
        CreatePostPaidInstanceRequest request) {
        return new SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>(request,
            RabbitMQMeta.createPostPaidInstance, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例，该接口支持创建按需[和包周期](tag:hws,hws_hk,ctc,cmcc)计费方式的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidInstanceByEngineRequest 请求对象
     * @return CreatePostPaidInstanceByEngineResponse
     */
    public CreatePostPaidInstanceByEngineResponse createPostPaidInstanceByEngine(
        CreatePostPaidInstanceByEngineRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createPostPaidInstanceByEngine);
    }

    /**
     * 创建实例
     *
     * 创建实例，该接口支持创建按需[和包周期](tag:hws,hws_hk,ctc,cmcc)计费方式的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidInstanceByEngineRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse> createPostPaidInstanceByEngineInvoker(
        CreatePostPaidInstanceByEngineRequest request) {
        return new SyncInvoker<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse>(request,
            RabbitMQMeta.createPostPaidInstanceByEngine, hcClient);
    }

    /**
     * 删除后台任务管理中的指定记录
     *
     * 删除后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return DeleteBackgroundTaskResponse
     */
    public DeleteBackgroundTaskResponse deleteBackgroundTask(DeleteBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteBackgroundTask);
    }

    /**
     * 删除后台任务管理中的指定记录
     *
     * 删除后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>
     */
    public SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskInvoker(
        DeleteBackgroundTaskRequest request) {
        return new SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>(request,
            RabbitMQMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteInstance);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RabbitMQMeta.deleteInstance,
            hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesInvoker(
        ListAvailableZonesRequest request) {
        return new SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>(request,
            RabbitMQMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询实例的后台任务列表
     *
     * 查询实例的后台任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return ListBackgroundTasksResponse
     */
    public ListBackgroundTasksResponse listBackgroundTasks(ListBackgroundTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listBackgroundTasks);
    }

    /**
     * 查询实例的后台任务列表
     *
     * 查询实例的后台任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return SyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse>
     */
    public SyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasksInvoker(
        ListBackgroundTasksRequest request) {
        return new SyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse>(request,
            RabbitMQMeta.listBackgroundTasks, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 查询产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEngineProductsRequest 请求对象
     * @return ListEngineProductsResponse
     */
    public ListEngineProductsResponse listEngineProducts(ListEngineProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listEngineProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 查询产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEngineProductsRequest 请求对象
     * @return SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse>
     */
    public SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProductsInvoker(
        ListEngineProductsRequest request) {
        return new SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse>(request,
            RabbitMQMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesDetailsRequest 请求对象
     * @return ListInstancesDetailsResponse
     */
    public ListInstancesDetailsResponse listInstancesDetails(ListInstancesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listInstancesDetails);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesDetailsRequest 请求对象
     * @return SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>
     */
    public SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetailsInvoker(
        ListInstancesDetailsRequest request) {
        return new SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>(request,
            RabbitMQMeta.listInstancesDetails, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPluginsRequest 请求对象
     * @return ListPluginsResponse
     */
    public ListPluginsResponse listPlugins(ListPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPluginsRequest 请求对象
     * @return SyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public SyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsInvoker(ListPluginsRequest request) {
        return new SyncInvoker<ListPluginsRequest, ListPluginsResponse>(request, RabbitMQMeta.listPlugins, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<ListProductsRequest, ListProductsResponse>(request, RabbitMQMeta.listProducts, hcClient);
    }

    /**
     * 重置密码
     *
     * 重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, RabbitMQMeta.resetPassword,
            hcClient);
    }

    /**
     * 新规格实例的规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeEngineInstanceRequest 请求对象
     * @return ResizeEngineInstanceResponse
     */
    public ResizeEngineInstanceResponse resizeEngineInstance(ResizeEngineInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.resizeEngineInstance);
    }

    /**
     * 新规格实例的规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeEngineInstanceRequest 请求对象
     * @return SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse>
     */
    public SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstanceInvoker(
        ResizeEngineInstanceRequest request) {
        return new SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse>(request,
            RabbitMQMeta.resizeEngineInstance, hcClient);
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
     * @param ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.resizeInstance);
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
     * @param ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, RabbitMQMeta.resizeInstance,
            hcClient);
    }

    /**
     * 查询后台任务管理中的指定记录
     *
     * 查询后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return ShowBackgroundTaskResponse
     */
    public ShowBackgroundTaskResponse showBackgroundTask(ShowBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showBackgroundTask);
    }

    /**
     * 查询后台任务管理中的指定记录
     *
     * 查询后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return SyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse>
     */
    public SyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTaskInvoker(
        ShowBackgroundTaskRequest request) {
        return new SyncInvoker<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse>(request,
            RabbitMQMeta.showBackgroundTask, hcClient);
    }

    /**
     * 查询新规格可扩容规格列表
     *
     * 查询新规格实例可扩容列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return ShowEngineInstanceExtendProductInfoResponse
     */
    public ShowEngineInstanceExtendProductInfoResponse showEngineInstanceExtendProductInfo(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showEngineInstanceExtendProductInfo);
    }

    /**
     * 查询新规格可扩容规格列表
     *
     * 查询新规格实例可扩容列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoInvoker(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>(
            request, RabbitMQMeta.showEngineInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showInstance);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, RabbitMQMeta.showInstance, hcClient);
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
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return ShowInstanceExtendProductInfoResponse
     */
    public ShowInstanceExtendProductInfoResponse showInstanceExtendProductInfo(
        ShowInstanceExtendProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showInstanceExtendProductInfo);
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
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoInvoker(
        ShowInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>(request,
            RabbitMQMeta.showInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return ShowMaintainWindowsResponse
     */
    public ShowMaintainWindowsResponse showMaintainWindows(ShowMaintainWindowsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showMaintainWindows);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return SyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse>
     */
    public SyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindowsInvoker(
        ShowMaintainWindowsRequest request) {
        return new SyncInvoker<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse>(request,
            RabbitMQMeta.showMaintainWindows, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRabbitMqProjectTagsRequest 请求对象
     * @return ShowRabbitMqProjectTagsResponse
     */
    public ShowRabbitMqProjectTagsResponse showRabbitMqProjectTags(ShowRabbitMqProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showRabbitMqProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRabbitMqProjectTagsRequest 请求对象
     * @return SyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse>
     */
    public SyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse> showRabbitMqProjectTagsInvoker(
        ShowRabbitMqProjectTagsRequest request) {
        return new SyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse>(request,
            RabbitMQMeta.showRabbitMqProjectTags, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRabbitMqTagsRequest 请求对象
     * @return ShowRabbitMqTagsResponse
     */
    public ShowRabbitMqTagsResponse showRabbitMqTags(ShowRabbitMqTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showRabbitMqTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRabbitMqTagsRequest 请求对象
     * @return SyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse>
     */
    public SyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse> showRabbitMqTagsInvoker(
        ShowRabbitMqTagsRequest request) {
        return new SyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse>(request,
            RabbitMQMeta.showRabbitMqTags, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, RabbitMQMeta.updateInstance,
            hcClient);
    }

    /**
     * 开启或关闭插件
     *
     * 开启或关闭插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePluginsRequest 请求对象
     * @return UpdatePluginsResponse
     */
    public UpdatePluginsResponse updatePlugins(UpdatePluginsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.updatePlugins);
    }

    /**
     * 开启或关闭插件
     *
     * 开启或关闭插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePluginsRequest 请求对象
     * @return SyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse>
     */
    public SyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse> updatePluginsInvoker(UpdatePluginsRequest request) {
        return new SyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse>(request, RabbitMQMeta.updatePlugins,
            hcClient);
    }

}
