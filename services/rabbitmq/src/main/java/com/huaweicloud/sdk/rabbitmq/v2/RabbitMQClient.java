package com.huaweicloud.sdk.rabbitmq.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.rabbitmq.v2.model.ListUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListUserResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListVhostsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListVhostsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeEngineInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeEngineInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeInstanceResponse;
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
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProjectTagsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProjectTagsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqTagsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqTagsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdatePluginsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdatePluginsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateUserResponse;

public class RabbitMQClient {

    protected HcClient hcClient;

    public RabbitMQClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RabbitMQClient> newBuilder() {
        ClientBuilder<RabbitMQClient> clientBuilder = new ClientBuilder<>(RabbitMQClient::new);
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
     * @param request BatchCreateOrDeleteRabbitMqTagRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse> batchCreateOrDeleteRabbitMqTagInvoker(
        BatchCreateOrDeleteRabbitMqTagRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.batchCreateOrDeleteRabbitMqTag, hcClient);
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
     * @return BatchRestartOrDeleteInstancesResponse
     */
    public BatchRestartOrDeleteInstancesResponse batchRestartOrDeleteInstances(
        BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.batchRestartOrDeleteInstances);
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
     * @return SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>
     */
    public SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesInvoker(
        BatchRestartOrDeleteInstancesRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.batchRestartOrDeleteInstances, hcClient);
    }

    /**
     * 创建实例(按需)
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
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
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceInvoker(
        CreatePostPaidInstanceRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.createPostPaidInstance, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需[和包周期](tag:hws,hws_eu,hws_hk,ctc,cmcc)计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,sbc)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceByEngineRequest 请求对象
     * @return CreatePostPaidInstanceByEngineResponse
     */
    public CreatePostPaidInstanceByEngineResponse createPostPaidInstanceByEngine(
        CreatePostPaidInstanceByEngineRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createPostPaidInstanceByEngine);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需[和包周期](tag:hws,hws_eu,hws_hk,ctc,cmcc)计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,cmcc,sbc)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceByEngineRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse> createPostPaidInstanceByEngineInvoker(
        CreatePostPaidInstanceByEngineRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.createPostPaidInstanceByEngine, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.createUser, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteBackgroundTask);
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
        return new SyncInvoker<>(request, RabbitMQMeta.deleteBackgroundTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteInstance);
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
        return new SyncInvoker<>(request, RabbitMQMeta.deleteInstance, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.deleteUser, hcClient);
    }

    /**
     * 开启RabbitMQ实例域名访问能力
     *
     * 开启RabbitMQ实例域名访问功能后，客户端可以通过域名连接RabbitMQ实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return EnableDnsResponse
     */
    public EnableDnsResponse enableDns(EnableDnsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.enableDns);
    }

    /**
     * 开启RabbitMQ实例域名访问能力
     *
     * 开启RabbitMQ实例域名访问功能后，客户端可以通过域名连接RabbitMQ实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return SyncInvoker<EnableDnsRequest, EnableDnsResponse>
     */
    public SyncInvoker<EnableDnsRequest, EnableDnsResponse> enableDnsInvoker(EnableDnsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.enableDns, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listAvailableZones);
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
        return new SyncInvoker<>(request, RabbitMQMeta.listAvailableZones, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listBackgroundTasks);
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
        return new SyncInvoker<>(request, RabbitMQMeta.listBackgroundTasks, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listEngineProducts);
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
        return new SyncInvoker<>(request, RabbitMQMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
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
     * @param request ListInstancesDetailsRequest 请求对象
     * @return SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>
     */
    public SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetailsInvoker(
        ListInstancesDetailsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.listInstancesDetails, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
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
     * @param request ListPluginsRequest 请求对象
     * @return SyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public SyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsInvoker(ListPluginsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.listPlugins, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 在创建实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
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
     * @param request ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.listProducts, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return ListUserResponse
     */
    public ListUserResponse listUser(ListUserRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listUser);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return SyncInvoker<ListUserRequest, ListUserResponse>
     */
    public SyncInvoker<ListUserRequest, ListUserResponse> listUserInvoker(ListUserRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.listUser, hcClient);
    }

    /**
     * 重置密码
     *
     * 重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
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
     * @param request ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.resetPassword, hcClient);
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
     * @param request ResizeEngineInstanceRequest 请求对象
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
     * @param request ResizeEngineInstanceRequest 请求对象
     * @return SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse>
     */
    public SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstanceInvoker(
        ResizeEngineInstanceRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.resizeEngineInstance, hcClient);
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
     * @param request ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.resizeInstance, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showBackgroundTask);
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
        return new SyncInvoker<>(request, RabbitMQMeta.showBackgroundTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showCesHierarchy);
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
        return new SyncInvoker<>(request, RabbitMQMeta.showCesHierarchy, hcClient);
    }

    /**
     * 查询新规格可扩容规格列表
     *
     * 查询新规格实例可扩容列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
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
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoInvoker(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.showEngineInstanceExtendProductInfo, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showInstance);
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
        return new SyncInvoker<>(request, RabbitMQMeta.showInstance, hcClient);
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
     * @param request ShowInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoInvoker(
        ShowInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.showInstanceExtendProductInfo, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showMaintainWindows);
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
        return new SyncInvoker<>(request, RabbitMQMeta.showMaintainWindows, hcClient);
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
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showQuotas);
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
        return new SyncInvoker<>(request, RabbitMQMeta.showQuotas, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRabbitMqProjectTagsRequest 请求对象
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
     * @param request ShowRabbitMqProjectTagsRequest 请求对象
     * @return SyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse>
     */
    public SyncInvoker<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse> showRabbitMqProjectTagsInvoker(
        ShowRabbitMqProjectTagsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.showRabbitMqProjectTags, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRabbitMqTagsRequest 请求对象
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
     * @param request ShowRabbitMqTagsRequest 请求对象
     * @return SyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse>
     */
    public SyncInvoker<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse> showRabbitMqTagsInvoker(
        ShowRabbitMqTagsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.showRabbitMqTags, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
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
     * @param request UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.updateInstance, hcClient);
    }

    /**
     * 开启或关闭插件
     *
     * 开启或关闭插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePluginsRequest 请求对象
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
     * @param request UpdatePluginsRequest 请求对象
     * @return SyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse>
     */
    public SyncInvoker<UpdatePluginsRequest, UpdatePluginsResponse> updatePluginsInvoker(UpdatePluginsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.updatePlugins, hcClient);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.updateUser);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数（仅AMQP版本支持）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.updateUser, hcClient);
    }

    /**
     * 添加绑定
     *
     * 添加绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindingRequest 请求对象
     * @return CreateBindingResponse
     */
    public CreateBindingResponse createBinding(CreateBindingRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createBinding);
    }

    /**
     * 添加绑定
     *
     * 添加绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindingRequest 请求对象
     * @return SyncInvoker<CreateBindingRequest, CreateBindingResponse>
     */
    public SyncInvoker<CreateBindingRequest, CreateBindingResponse> createBindingInvoker(CreateBindingRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.createBinding, hcClient);
    }

    /**
     * 删除绑定
     *
     * 删除绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBindingRequest 请求对象
     * @return DeleteBindingResponse
     */
    public DeleteBindingResponse deleteBinding(DeleteBindingRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteBinding);
    }

    /**
     * 删除绑定
     *
     * 删除绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBindingRequest 请求对象
     * @return SyncInvoker<DeleteBindingRequest, DeleteBindingResponse>
     */
    public SyncInvoker<DeleteBindingRequest, DeleteBindingResponse> deleteBindingInvoker(DeleteBindingRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.deleteBinding, hcClient);
    }

    /**
     * 查询Exchange绑定信息列表
     *
     * 查询Exchange绑定信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindingsRequest 请求对象
     * @return ListBindingsResponse
     */
    public ListBindingsResponse listBindings(ListBindingsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listBindings);
    }

    /**
     * 查询Exchange绑定信息列表
     *
     * 查询Exchange绑定信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindingsRequest 请求对象
     * @return SyncInvoker<ListBindingsRequest, ListBindingsResponse>
     */
    public SyncInvoker<ListBindingsRequest, ListBindingsResponse> listBindingsInvoker(ListBindingsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.listBindings, hcClient);
    }

    /**
     * 批量删除指定Exchange
     *
     * 批量删除指定Exchange。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteExchangesRequest 请求对象
     * @return BatchDeleteExchangesResponse
     */
    public BatchDeleteExchangesResponse batchDeleteExchanges(BatchDeleteExchangesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.batchDeleteExchanges);
    }

    /**
     * 批量删除指定Exchange
     *
     * 批量删除指定Exchange。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteExchangesRequest 请求对象
     * @return SyncInvoker<BatchDeleteExchangesRequest, BatchDeleteExchangesResponse>
     */
    public SyncInvoker<BatchDeleteExchangesRequest, BatchDeleteExchangesResponse> batchDeleteExchangesInvoker(
        BatchDeleteExchangesRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.batchDeleteExchanges, hcClient);
    }

    /**
     * 创建Exchange
     *
     * 创建Exchange。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExchangeRequest 请求对象
     * @return CreateExchangeResponse
     */
    public CreateExchangeResponse createExchange(CreateExchangeRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createExchange);
    }

    /**
     * 创建Exchange
     *
     * 创建Exchange。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExchangeRequest 请求对象
     * @return SyncInvoker<CreateExchangeRequest, CreateExchangeResponse>
     */
    public SyncInvoker<CreateExchangeRequest, CreateExchangeResponse> createExchangeInvoker(
        CreateExchangeRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.createExchange, hcClient);
    }

    /**
     * 查询Exchange列表
     *
     * 查询Exchange列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExchangesRequest 请求对象
     * @return ListExchangesResponse
     */
    public ListExchangesResponse listExchanges(ListExchangesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listExchanges);
    }

    /**
     * 查询Exchange列表
     *
     * 查询Exchange列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExchangesRequest 请求对象
     * @return SyncInvoker<ListExchangesRequest, ListExchangesResponse>
     */
    public SyncInvoker<ListExchangesRequest, ListExchangesResponse> listExchangesInvoker(ListExchangesRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.listExchanges, hcClient);
    }

    /**
     * 批量删除指定Queue
     *
     * 批量删除指定Queue。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteQueuesRequest 请求对象
     * @return BatchDeleteQueuesResponse
     */
    public BatchDeleteQueuesResponse batchDeleteQueues(BatchDeleteQueuesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.batchDeleteQueues);
    }

    /**
     * 批量删除指定Queue
     *
     * 批量删除指定Queue。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteQueuesRequest 请求对象
     * @return SyncInvoker<BatchDeleteQueuesRequest, BatchDeleteQueuesResponse>
     */
    public SyncInvoker<BatchDeleteQueuesRequest, BatchDeleteQueuesResponse> batchDeleteQueuesInvoker(
        BatchDeleteQueuesRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.batchDeleteQueues, hcClient);
    }

    /**
     * 创建Queue
     *
     * 创建Queue。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQueueRequest 请求对象
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueue(CreateQueueRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createQueue);
    }

    /**
     * 创建Queue
     *
     * 创建Queue。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQueueRequest 请求对象
     * @return SyncInvoker<CreateQueueRequest, CreateQueueResponse>
     */
    public SyncInvoker<CreateQueueRequest, CreateQueueResponse> createQueueInvoker(CreateQueueRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.createQueue, hcClient);
    }

    /**
     * 清空Queue消息
     *
     * 清空Queue消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueInfoRequest 请求对象
     * @return DeleteQueueInfoResponse
     */
    public DeleteQueueInfoResponse deleteQueueInfo(DeleteQueueInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.deleteQueueInfo);
    }

    /**
     * 清空Queue消息
     *
     * 清空Queue消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueInfoRequest 请求对象
     * @return SyncInvoker<DeleteQueueInfoRequest, DeleteQueueInfoResponse>
     */
    public SyncInvoker<DeleteQueueInfoRequest, DeleteQueueInfoResponse> deleteQueueInfoInvoker(
        DeleteQueueInfoRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.deleteQueueInfo, hcClient);
    }

    /**
     * 查询所属Vhost下Queue的列表
     *
     * 查询所属Vhost下Queue的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueuesRequest 请求对象
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueues(ListQueuesRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listQueues);
    }

    /**
     * 查询所属Vhost下Queue的列表
     *
     * 查询所属Vhost下Queue的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueuesRequest 请求对象
     * @return SyncInvoker<ListQueuesRequest, ListQueuesResponse>
     */
    public SyncInvoker<ListQueuesRequest, ListQueuesResponse> listQueuesInvoker(ListQueuesRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.listQueues, hcClient);
    }

    /**
     * 查询指定Queue详情
     *
     * 查询指定Queue详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueueDetailsRequest 请求对象
     * @return ShowQueueDetailsResponse
     */
    public ShowQueueDetailsResponse showQueueDetails(ShowQueueDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.showQueueDetails);
    }

    /**
     * 查询指定Queue详情
     *
     * 查询指定Queue详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueueDetailsRequest 请求对象
     * @return SyncInvoker<ShowQueueDetailsRequest, ShowQueueDetailsResponse>
     */
    public SyncInvoker<ShowQueueDetailsRequest, ShowQueueDetailsResponse> showQueueDetailsInvoker(
        ShowQueueDetailsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.showQueueDetails, hcClient);
    }

    /**
     * 批量删除指定Vhost
     *
     * 批量删除指定Vhost。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVhostsRequest 请求对象
     * @return BatchDeleteVhostsResponse
     */
    public BatchDeleteVhostsResponse batchDeleteVhosts(BatchDeleteVhostsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.batchDeleteVhosts);
    }

    /**
     * 批量删除指定Vhost
     *
     * 批量删除指定Vhost。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVhostsRequest 请求对象
     * @return SyncInvoker<BatchDeleteVhostsRequest, BatchDeleteVhostsResponse>
     */
    public SyncInvoker<BatchDeleteVhostsRequest, BatchDeleteVhostsResponse> batchDeleteVhostsInvoker(
        BatchDeleteVhostsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.batchDeleteVhosts, hcClient);
    }

    /**
     * 创建Vhost
     *
     * 创建Vhost。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVhostRequest 请求对象
     * @return CreateVhostResponse
     */
    public CreateVhostResponse createVhost(CreateVhostRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.createVhost);
    }

    /**
     * 创建Vhost
     *
     * 创建Vhost。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVhostRequest 请求对象
     * @return SyncInvoker<CreateVhostRequest, CreateVhostResponse>
     */
    public SyncInvoker<CreateVhostRequest, CreateVhostResponse> createVhostInvoker(CreateVhostRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.createVhost, hcClient);
    }

    /**
     * 查询Vhost列表
     *
     * 查询Vhost列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVhostsRequest 请求对象
     * @return ListVhostsResponse
     */
    public ListVhostsResponse listVhosts(ListVhostsRequest request) {
        return hcClient.syncInvokeHttp(request, RabbitMQMeta.listVhosts);
    }

    /**
     * 查询Vhost列表
     *
     * 查询Vhost列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVhostsRequest 请求对象
     * @return SyncInvoker<ListVhostsRequest, ListVhostsResponse>
     */
    public SyncInvoker<ListVhostsRequest, ListVhostsResponse> listVhostsInvoker(ListVhostsRequest request) {
        return new SyncInvoker<>(request, RabbitMQMeta.listVhosts, hcClient);
    }

}
