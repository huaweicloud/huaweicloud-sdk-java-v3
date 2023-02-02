package com.huaweicloud.sdk.kafka.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.kafka.v2.model.*;

public class KafkaClient {

    protected HcClient hcClient;

    public KafkaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KafkaClient> newBuilder() {
        return new ClientBuilder<>(KafkaClient::new);
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteKafkaTagRequest 请求对象
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
     * @param BatchCreateOrDeleteKafkaTagRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> batchCreateOrDeleteKafkaTagInvoker(
        BatchCreateOrDeleteKafkaTagRequest request) {
        return new SyncInvoker<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse>(request,
            KafkaMeta.batchCreateOrDeleteKafkaTag, hcClient);
    }

    /**
     * Kafka实例批量删除Topic
     *
     * 该接口用于向Kafka实例批量删除Topic。批量删除多个消费组时，部分删除成功，部分失败，此时接口返回删除成功，并在返回中显示删除失败的消费组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteInstanceTopicRequest 请求对象
     * @return BatchDeleteInstanceTopicResponse
     */
    public BatchDeleteInstanceTopicResponse batchDeleteInstanceTopic(BatchDeleteInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchDeleteInstanceTopic);
    }

    /**
     * Kafka实例批量删除Topic
     *
     * 该接口用于向Kafka实例批量删除Topic。批量删除多个消费组时，部分删除成功，部分失败，此时接口返回删除成功，并在返回中显示删除失败的消费组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteInstanceTopicRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse>
     */
    public SyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopicInvoker(
        BatchDeleteInstanceTopicRequest request) {
        return new SyncInvoker<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse>(request,
            KafkaMeta.batchDeleteInstanceTopic, hcClient);
    }

    /**
     * 批量删除用户
     *
     * 批量删除Kafka实例的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteInstanceUsersRequest 请求对象
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
     * @param BatchDeleteInstanceUsersRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse>
     */
    public SyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> batchDeleteInstanceUsersInvoker(
        BatchDeleteInstanceUsersRequest request) {
        return new SyncInvoker<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse>(request,
            KafkaMeta.batchDeleteInstanceUsers, hcClient);
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
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>
     */
    public SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesInvoker(
        BatchRestartOrDeleteInstancesRequest request) {
        return new SyncInvoker<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse>(request,
            KafkaMeta.batchRestartOrDeleteInstances, hcClient);
    }

    /**
     * 创建实例的转储节点
     *
     * 创建实例的转储节点。
     * 
     * **当前通过调用API，只支持按需实例创建转储节点。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectorRequest 请求对象
     * @return CreateConnectorResponse
     */
    public CreateConnectorResponse createConnector(CreateConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createConnector);
    }

    /**
     * 创建实例的转储节点
     *
     * 创建实例的转储节点。
     * 
     * **当前通过调用API，只支持按需实例创建转储节点。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectorRequest 请求对象
     * @return SyncInvoker<CreateConnectorRequest, CreateConnectorResponse>
     */
    public SyncInvoker<CreateConnectorRequest, CreateConnectorResponse> createConnectorInvoker(
        CreateConnectorRequest request) {
        return new SyncInvoker<CreateConnectorRequest, CreateConnectorResponse>(request, KafkaMeta.createConnector,
            hcClient);
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
     * @param CreateInstanceByEngineRequest 请求对象
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
     * @param CreateInstanceByEngineRequest 请求对象
     * @return SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>
     */
    public SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngineInvoker(
        CreateInstanceByEngineRequest request) {
        return new SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>(request,
            KafkaMeta.createInstanceByEngine, hcClient);
    }

    /**
     * Kafka实例创建Topic
     *
     * 该接口用于向Kafka实例创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceTopicRequest 请求对象
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
     * @param CreateInstanceTopicRequest 请求对象
     * @return SyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse>
     */
    public SyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse> createInstanceTopicInvoker(
        CreateInstanceTopicRequest request) {
        return new SyncInvoker<CreateInstanceTopicRequest, CreateInstanceTopicResponse>(request,
            KafkaMeta.createInstanceTopic, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceUserRequest 请求对象
     * @return CreateInstanceUserResponse
     */
    public CreateInstanceUserResponse createInstanceUser(CreateInstanceUserRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createInstanceUser);
    }

    /**
     * 创建用户
     *
     * 创建Kafka实例的用户，用户可连接开启SASL的Kafka实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceUserRequest 请求对象
     * @return SyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse>
     */
    public SyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse> createInstanceUserInvoker(
        CreateInstanceUserRequest request) {
        return new SyncInvoker<CreateInstanceUserRequest, CreateInstanceUserResponse>(request,
            KafkaMeta.createInstanceUser, hcClient);
    }

    /**
     * 新增Kafka实例指定Topic分区
     *
     * 新增Kafka实例指定Topic分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePartitionRequest 请求对象
     * @return CreatePartitionResponse
     */
    public CreatePartitionResponse createPartition(CreatePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createPartition);
    }

    /**
     * 新增Kafka实例指定Topic分区
     *
     * 新增Kafka实例指定Topic分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePartitionRequest 请求对象
     * @return SyncInvoker<CreatePartitionRequest, CreatePartitionResponse>
     */
    public SyncInvoker<CreatePartitionRequest, CreatePartitionResponse> createPartitionInvoker(
        CreatePartitionRequest request) {
        return new SyncInvoker<CreatePartitionRequest, CreatePartitionResponse>(request, KafkaMeta.createPartition,
            hcClient);
    }

    /**
     * 创建实例
     *
     * [创建按需计费类型的Kafka实例。](tag:hc,hk,hws,hws_hk,ctc,sbc,hk_sbc,cmcc,hws_eu)[创建kafka实例。](tag:otc,ocb,hws_ocb)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return CreatePostPaidInstanceResponse
     */
    public CreatePostPaidInstanceResponse createPostPaidInstance(CreatePostPaidInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createPostPaidInstance);
    }

    /**
     * 创建实例
     *
     * [创建按需计费类型的Kafka实例。](tag:hc,hk,hws,hws_hk,ctc,sbc,hk_sbc,cmcc,hws_eu)[创建kafka实例。](tag:otc,ocb,hws_ocb)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceInvoker(
        CreatePostPaidInstanceRequest request) {
        return new SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>(request,
            KafkaMeta.createPostPaidInstance, hcClient);
    }

    /**
     * Kafka实例开始分区重平衡任务
     *
     * 该接口用于向Kafka实例提交分区重平衡任务，若成功则返回重平衡任务的job id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReassignmentTaskRequest 请求对象
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
     * @param CreateReassignmentTaskRequest 请求对象
     * @return SyncInvoker<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse>
     */
    public SyncInvoker<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse> createReassignmentTaskInvoker(
        CreateReassignmentTaskRequest request) {
        return new SyncInvoker<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse>(request,
            KafkaMeta.createReassignmentTask, hcClient);
    }

    /**
     * 创建转储任务
     *
     * 创建转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSinkTaskRequest 请求对象
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
     * @param CreateSinkTaskRequest 请求对象
     * @return SyncInvoker<CreateSinkTaskRequest, CreateSinkTaskResponse>
     */
    public SyncInvoker<CreateSinkTaskRequest, CreateSinkTaskResponse> createSinkTaskInvoker(
        CreateSinkTaskRequest request) {
        return new SyncInvoker<CreateSinkTaskRequest, CreateSinkTaskResponse>(request, KafkaMeta.createSinkTask,
            hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteBackgroundTask);
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
            KafkaMeta.deleteBackgroundTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteInstance);
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
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, KafkaMeta.deleteInstance,
            hcClient);
    }

    /**
     * 删除单个转储任务
     *
     * 删除单个转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSinkTaskRequest 请求对象
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
     * @param DeleteSinkTaskRequest 请求对象
     * @return SyncInvoker<DeleteSinkTaskRequest, DeleteSinkTaskResponse>
     */
    public SyncInvoker<DeleteSinkTaskRequest, DeleteSinkTaskResponse> deleteSinkTaskInvoker(
        DeleteSinkTaskRequest request) {
        return new SyncInvoker<DeleteSinkTaskRequest, DeleteSinkTaskResponse>(request, KafkaMeta.deleteSinkTask,
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.listAvailableZones);
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
            KafkaMeta.listAvailableZones, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.listBackgroundTasks);
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
            KafkaMeta.listBackgroundTasks, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.listEngineProducts);
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
            KafkaMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询所有消费组
     *
     * 查询所有消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceConsumerGroupsRequest 请求对象
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
     * @param ListInstanceConsumerGroupsRequest 请求对象
     * @return SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>
     */
    public SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsInvoker(
        ListInstanceConsumerGroupsRequest request) {
        return new SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>(request,
            KafkaMeta.listInstanceConsumerGroups, hcClient);
    }

    /**
     * Kafka实例查询Topic
     *
     * 该接口用于查询指定Kafka实例的Topic详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTopicsRequest 请求对象
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
     * @param ListInstanceTopicsRequest 请求对象
     * @return SyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse>
     */
    public SyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse> listInstanceTopicsInvoker(
        ListInstanceTopicsRequest request) {
        return new SyncInvoker<ListInstanceTopicsRequest, ListInstanceTopicsResponse>(request,
            KafkaMeta.listInstanceTopics, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
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
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, KafkaMeta.listInstances, hcClient);
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
     * [例如，响应消息中bandwidth字段为1200MB的记录，unavailable_zones字段包含cn-east-2b、cn-east-2a和cn-east-2d，表示在华东-上海2的可用区1、可用区2、可用区3都没有该资源。](tag:hc,hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
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
     * [例如，响应消息中bandwidth字段为1200MB的记录，unavailable_zones字段包含cn-east-2b、cn-east-2a和cn-east-2d，表示在华东-上海2的可用区1、可用区2、可用区3都没有该资源。](tag:hc,hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<ListProductsRequest, ListProductsResponse>(request, KafkaMeta.listProducts, hcClient);
    }

    /**
     * 查询转储任务列表
     *
     * 查询转储任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSinkTasksRequest 请求对象
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
     * @param ListSinkTasksRequest 请求对象
     * @return SyncInvoker<ListSinkTasksRequest, ListSinkTasksResponse>
     */
    public SyncInvoker<ListSinkTasksRequest, ListSinkTasksResponse> listSinkTasksInvoker(ListSinkTasksRequest request) {
        return new SyncInvoker<ListSinkTasksRequest, ListSinkTasksResponse>(request, KafkaMeta.listSinkTasks, hcClient);
    }

    /**
     * 重置Manager密码
     *
     * 重置Manager密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetManagerPasswordRequest 请求对象
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
     * @param ResetManagerPasswordRequest 请求对象
     * @return SyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse>
     */
    public SyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse> resetManagerPasswordInvoker(
        ResetManagerPasswordRequest request) {
        return new SyncInvoker<ResetManagerPasswordRequest, ResetManagerPasswordResponse>(request,
            KafkaMeta.resetManagerPassword, hcClient);
    }

    /**
     * 重置消费组消费进度到指定位置
     *
     * Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。
     * 
     * &gt; 停止待重置消费组客户端，然后等待一段时间（即ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间，默认为1000毫秒）后，服务端才认为此消费组客户端已下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetMessageOffsetRequest 请求对象
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
     * &gt; 停止待重置消费组客户端，然后等待一段时间（即ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间，默认为1000毫秒）后，服务端才认为此消费组客户端已下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetMessageOffsetRequest 请求对象
     * @return SyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse>
     */
    public SyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse> resetMessageOffsetInvoker(
        ResetMessageOffsetRequest request) {
        return new SyncInvoker<ResetMessageOffsetRequest, ResetMessageOffsetResponse>(request,
            KafkaMeta.resetMessageOffset, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetPassword);
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
        return new SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, KafkaMeta.resetPassword, hcClient);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetUserPasswrodRequest 请求对象
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
     * @param ResetUserPasswrodRequest 请求对象
     * @return SyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse>
     */
    public SyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse> resetUserPasswrodInvoker(
        ResetUserPasswrodRequest request) {
        return new SyncInvoker<ResetUserPasswrodRequest, ResetUserPasswrodResponse>(request,
            KafkaMeta.resetUserPasswrod, hcClient);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeEngineInstanceRequest 请求对象
     * @return ResizeEngineInstanceResponse
     */
    public ResizeEngineInstanceResponse resizeEngineInstance(ResizeEngineInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resizeEngineInstance);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeEngineInstanceRequest 请求对象
     * @return SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse>
     */
    public SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstanceInvoker(
        ResizeEngineInstanceRequest request) {
        return new SyncInvoker<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse>(request,
            KafkaMeta.resizeEngineInstance, hcClient);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例规格变更。](tag:hc,hk,hws,hws_hk,ctc,sbc,hk_sbc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resizeInstance);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。[当前通过调用API，只支持按需实例进行实例规格变更。](tag:hc,hk,hws,hws_hk,ctc,sbc,hk_sbc,cmcc,hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, KafkaMeta.resizeInstance,
            hcClient);
    }

    /**
     * 重启Manager
     *
     * 重启Manager。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartManagerRequest 请求对象
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
     * @param RestartManagerRequest 请求对象
     * @return SyncInvoker<RestartManagerRequest, RestartManagerResponse>
     */
    public SyncInvoker<RestartManagerRequest, RestartManagerResponse> restartManagerInvoker(
        RestartManagerRequest request) {
        return new SyncInvoker<RestartManagerRequest, RestartManagerResponse>(request, KafkaMeta.restartManager,
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showBackgroundTask);
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
            KafkaMeta.showBackgroundTask, hcClient);
    }

    /**
     * 查询实例在CES的监控层级关系
     *
     * 查询实例在CES的监控层级关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCesHierarchyRequest 请求对象
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
     * @param ShowCesHierarchyRequest 请求对象
     * @return SyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse>
     */
    public SyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchyInvoker(
        ShowCesHierarchyRequest request) {
        return new SyncInvoker<ShowCesHierarchyRequest, ShowCesHierarchyResponse>(request, KafkaMeta.showCesHierarchy,
            hcClient);
    }

    /**
     * 查询Kafka集群元数据信息
     *
     * 查询Kafka集群元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterRequest 请求对象
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
     * @param ShowClusterRequest 请求对象
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, KafkaMeta.showCluster, hcClient);
    }

    /**
     * 查询Kafka实例的协调器信息
     *
     * 查询Kafka实例的协调器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCoordinatorsRequest 请求对象
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
     * @param ShowCoordinatorsRequest 请求对象
     * @return SyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse>
     */
    public SyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse> showCoordinatorsInvoker(
        ShowCoordinatorsRequest request) {
        return new SyncInvoker<ShowCoordinatorsRequest, ShowCoordinatorsResponse>(request, KafkaMeta.showCoordinators,
            hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineInstanceExtendProductInfoRequest 请求对象
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
     * @param ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoInvoker(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>(
            request, KafkaMeta.showEngineInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询消费组信息
     *
     * 查询消费组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGroupsRequest 请求对象
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
     * @param ShowGroupsRequest 请求对象
     * @return SyncInvoker<ShowGroupsRequest, ShowGroupsResponse>
     */
    public SyncInvoker<ShowGroupsRequest, ShowGroupsResponse> showGroupsInvoker(ShowGroupsRequest request) {
        return new SyncInvoker<ShowGroupsRequest, ShowGroupsResponse>(request, KafkaMeta.showGroups, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstance);
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
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, KafkaMeta.showInstance, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
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
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoInvoker(
        ShowInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse>(request,
            KafkaMeta.showInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceMessagesRequest 请求对象
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
     * @param ShowInstanceMessagesRequest 请求对象
     * @return SyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse>
     */
    public SyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> showInstanceMessagesInvoker(
        ShowInstanceMessagesRequest request) {
        return new SyncInvoker<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse>(request,
            KafkaMeta.showInstanceMessages, hcClient);
    }

    /**
     * 查询Kafka实例Topic详细信息(单个实例调用不要超过1s一次)
     *
     * 查询Kafka实例Topic详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceTopicDetailRequest 请求对象
     * @return ShowInstanceTopicDetailResponse
     */
    public ShowInstanceTopicDetailResponse showInstanceTopicDetail(ShowInstanceTopicDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceTopicDetail);
    }

    /**
     * 查询Kafka实例Topic详细信息(单个实例调用不要超过1s一次)
     *
     * 查询Kafka实例Topic详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceTopicDetailRequest 请求对象
     * @return SyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse>
     */
    public SyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> showInstanceTopicDetailInvoker(
        ShowInstanceTopicDetailRequest request) {
        return new SyncInvoker<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse>(request,
            KafkaMeta.showInstanceTopicDetail, hcClient);
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
     * @param ShowInstanceUsersRequest 请求对象
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
     * @param ShowInstanceUsersRequest 请求对象
     * @return SyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse>
     */
    public SyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse> showInstanceUsersInvoker(
        ShowInstanceUsersRequest request) {
        return new SyncInvoker<ShowInstanceUsersRequest, ShowInstanceUsersResponse>(request,
            KafkaMeta.showInstanceUsers, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowKafkaProjectTagsRequest 请求对象
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
     * @param ShowKafkaProjectTagsRequest 请求对象
     * @return SyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse>
     */
    public SyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> showKafkaProjectTagsInvoker(
        ShowKafkaProjectTagsRequest request) {
        return new SyncInvoker<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse>(request,
            KafkaMeta.showKafkaProjectTags, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowKafkaTagsRequest 请求对象
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
     * @param ShowKafkaTagsRequest 请求对象
     * @return SyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse>
     */
    public SyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse> showKafkaTagsInvoker(ShowKafkaTagsRequest request) {
        return new SyncInvoker<ShowKafkaTagsRequest, ShowKafkaTagsResponse>(request, KafkaMeta.showKafkaTags, hcClient);
    }

    /**
     * 查询topic的磁盘存储情况
     *
     * 查询topic在Broker上磁盘占用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowKafkaTopicPartitionDiskusageRequest 请求对象
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
     * @param ShowKafkaTopicPartitionDiskusageRequest 请求对象
     * @return SyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse>
     */
    public SyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> showKafkaTopicPartitionDiskusageInvoker(
        ShowKafkaTopicPartitionDiskusageRequest request) {
        return new SyncInvoker<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse>(
            request, KafkaMeta.showKafkaTopicPartitionDiskusage, hcClient);
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
        return hcClient.syncInvokeHttp(request, KafkaMeta.showMaintainWindows);
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
            KafkaMeta.showMaintainWindows, hcClient);
    }

    /**
     * 查询分区指定时间段的消息
     *
     * 查询分区指定时间段的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessagesRequest 请求对象
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
     * @param ShowMessagesRequest 请求对象
     * @return SyncInvoker<ShowMessagesRequest, ShowMessagesResponse>
     */
    public SyncInvoker<ShowMessagesRequest, ShowMessagesResponse> showMessagesInvoker(ShowMessagesRequest request) {
        return new SyncInvoker<ShowMessagesRequest, ShowMessagesResponse>(request, KafkaMeta.showMessages, hcClient);
    }

    /**
     * 查询分区最早消息的位置
     *
     * 查询分区最早消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionBeginningMessageRequest 请求对象
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
     * @param ShowPartitionBeginningMessageRequest 请求对象
     * @return SyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse>
     */
    public SyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> showPartitionBeginningMessageInvoker(
        ShowPartitionBeginningMessageRequest request) {
        return new SyncInvoker<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse>(request,
            KafkaMeta.showPartitionBeginningMessage, hcClient);
    }

    /**
     * 查询分区最新消息的位置
     *
     * 查询分区最新消息的位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionEndMessageRequest 请求对象
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
     * @param ShowPartitionEndMessageRequest 请求对象
     * @return SyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse>
     */
    public SyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> showPartitionEndMessageInvoker(
        ShowPartitionEndMessageRequest request) {
        return new SyncInvoker<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse>(request,
            KafkaMeta.showPartitionEndMessage, hcClient);
    }

    /**
     * 查询分区指定偏移量的消息
     *
     * 查询分区指定偏移量的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionMessageRequest 请求对象
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
     * @param ShowPartitionMessageRequest 请求对象
     * @return SyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse>
     */
    public SyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse> showPartitionMessageInvoker(
        ShowPartitionMessageRequest request) {
        return new SyncInvoker<ShowPartitionMessageRequest, ShowPartitionMessageResponse>(request,
            KafkaMeta.showPartitionMessage, hcClient);
    }

    /**
     * 查询单个转储任务
     *
     * 查询单个转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSinkTaskDetailRequest 请求对象
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
     * @param ShowSinkTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse>
     */
    public SyncInvoker<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> showSinkTaskDetailInvoker(
        ShowSinkTaskDetailRequest request) {
        return new SyncInvoker<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse>(request,
            KafkaMeta.showSinkTaskDetail, hcClient);
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
     * @param ShowTopicAccessPolicyRequest 请求对象
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
     * @param ShowTopicAccessPolicyRequest 请求对象
     * @return SyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse>
     */
    public SyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> showTopicAccessPolicyInvoker(
        ShowTopicAccessPolicyRequest request) {
        return new SyncInvoker<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse>(request,
            KafkaMeta.showTopicAccessPolicy, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
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
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, KafkaMeta.updateInstance,
            hcClient);
    }

    /**
     * 开启或关闭实例自动创建topic功能
     *
     * 开启或关闭实例自动创建topic功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceAutoCreateTopicRequest 请求对象
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
     * @param UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return SyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse>
     */
    public SyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopicInvoker(
        UpdateInstanceAutoCreateTopicRequest request) {
        return new SyncInvoker<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse>(request,
            KafkaMeta.updateInstanceAutoCreateTopic, hcClient);
    }

    /**
     * 修改实例跨VPC访问的内网IP
     *
     * 修改实例跨VPC访问的内网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceCrossVpcIpRequest 请求对象
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
     * @param UpdateInstanceCrossVpcIpRequest 请求对象
     * @return SyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse>
     */
    public SyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIpInvoker(
        UpdateInstanceCrossVpcIpRequest request) {
        return new SyncInvoker<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse>(request,
            KafkaMeta.updateInstanceCrossVpcIp, hcClient);
    }

    /**
     * 修改Kafka实例Topic
     *
     * 修改Kafka实例Topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceTopicRequest 请求对象
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
     * @param UpdateInstanceTopicRequest 请求对象
     * @return SyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse>
     */
    public SyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> updateInstanceTopicInvoker(
        UpdateInstanceTopicRequest request) {
        return new SyncInvoker<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse>(request,
            KafkaMeta.updateInstanceTopic, hcClient);
    }

    /**
     * 修改转储任务的配额
     *
     * 修改转储任务的配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSinkTaskQuotaRequest 请求对象
     * @return UpdateSinkTaskQuotaResponse
     */
    public UpdateSinkTaskQuotaResponse updateSinkTaskQuota(UpdateSinkTaskQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateSinkTaskQuota);
    }

    /**
     * 修改转储任务的配额
     *
     * 修改转储任务的配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSinkTaskQuotaRequest 请求对象
     * @return SyncInvoker<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse>
     */
    public SyncInvoker<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> updateSinkTaskQuotaInvoker(
        UpdateSinkTaskQuotaRequest request) {
        return new SyncInvoker<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse>(request,
            KafkaMeta.updateSinkTaskQuota, hcClient);
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
     * @param UpdateTopicAccessPolicyRequest 请求对象
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
     * @param UpdateTopicAccessPolicyRequest 请求对象
     * @return SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>
     */
    public SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyInvoker(
        UpdateTopicAccessPolicyRequest request) {
        return new SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>(request,
            KafkaMeta.updateTopicAccessPolicy, hcClient);
    }

    /**
     * 修改Kafka实例Topic分区的副本
     *
     * 修改Kafka实例Topic分区的副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTopicReplicaRequest 请求对象
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
     * @param UpdateTopicReplicaRequest 请求对象
     * @return SyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse>
     */
    public SyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> updateTopicReplicaInvoker(
        UpdateTopicReplicaRequest request) {
        return new SyncInvoker<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse>(request,
            KafkaMeta.updateTopicReplica, hcClient);
    }

}
