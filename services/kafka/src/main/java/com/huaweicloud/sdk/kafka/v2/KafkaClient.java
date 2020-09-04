package com.huaweicloud.sdk.kafka.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * 批量添加或删除实例标签。
     *
     * @param BatchCreateOrDeleteInstanceTagRequest 请求对象
     * @return BatchCreateOrDeleteInstanceTagResponse
    */
    public BatchCreateOrDeleteInstanceTagResponse batchCreateOrDeleteInstanceTag(BatchCreateOrDeleteInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchCreateOrDeleteInstanceTag);
    }

    /**
     * Kafka实例批量删除Topic
     * 该接口用于向Kafka实例批量删除Topic。
     *
     * @param BatchDeleteInstanceTopicRequest 请求对象
     * @return BatchDeleteInstanceTopicResponse
    */
    public BatchDeleteInstanceTopicResponse batchDeleteInstanceTopic(BatchDeleteInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchDeleteInstanceTopic);
    }

    /**
     * 批量重启或删除实例
     * 批量重启或删除实例。  在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。  实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     *
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return BatchRestartOrDeleteInstancesResponse
    */
    public BatchRestartOrDeleteInstancesResponse batchRestartOrDeleteInstances(BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.batchRestartOrDeleteInstances);
    }

    /**
     * 创建实例的转储节点
     * 创建实例的转储节点。
     *
     * @param CreateConnectorRequest 请求对象
     * @return CreateConnectorResponse
    */
    public CreateConnectorResponse createConnector(CreateConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createConnector);
    }

    /**
     * Kafka实例创建Topic
     * 该接口用于向Kafka实例创建Topic。
     *
     * @param CreateInstanceTopicRequest 请求对象
     * @return CreateInstanceTopicResponse
    */
    public CreateInstanceTopicResponse createInstanceTopic(CreateInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createInstanceTopic);
    }

    /**
     * 新增Kafka实例指定Topic分区
     * 新增Kafka实例指定Topic分区。
     *
     * @param CreatePartitionRequest 请求对象
     * @return CreatePartitionResponse
    */
    public CreatePartitionResponse createPartition(CreatePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createPartition);
    }

    /**
     * 创建实例（按需）
     * 创建实例，该接口创建的实例为按需计费的方式。
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return CreatePostPaidInstanceResponse
    */
    public CreatePostPaidInstanceResponse createPostPaidInstance(CreatePostPaidInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createPostPaidInstance);
    }

    /**
     * 创建转储任务
     * 创建转储任务。
     *
     * @param CreateSinkTaskRequest 请求对象
     * @return CreateSinkTaskResponse
    */
    public CreateSinkTaskResponse createSinkTask(CreateSinkTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.createSinkTask);
    }

    /**
     * 删除后台任务管理中的指定记录
     * 删除后台任务管理中的指定记录。
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return DeleteBackgroundTaskResponse
    */
    public DeleteBackgroundTaskResponse deleteBackgroundTask(DeleteBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteBackgroundTask);
    }

    /**
     * 删除指定的实例
     * 删除指定的实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
    */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteInstance);
    }

    /**
     * 删除单个转储任务
     * 删除单个转储任务。
     *
     * @param DeleteSinkTaskRequest 请求对象
     * @return DeleteSinkTaskResponse
    */
    public DeleteSinkTaskResponse deleteSinkTask(DeleteSinkTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.deleteSinkTask);
    }

    /**
     * 查询可用区信息
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
    */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listAvailableZones);
    }

    /**
     * 查询实例的后台任务列表
     * 查询实例的后台任务列表。
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return ListBackgroundTasksResponse
    */
    public ListBackgroundTasksResponse listBackgroundTasks(ListBackgroundTasksRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listBackgroundTasks);
    }

    /**
     * Kafka实例查询Topic
     * 该接口用于查询指定Kafka实例的Topic详情。
     *
     * @param ListInstanceTopicsRequest 请求对象
     * @return ListInstanceTopicsResponse
    */
    public ListInstanceTopicsResponse listInstanceTopics(ListInstanceTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstanceTopics);
    }

    /**
     * 查询所有实例列表
     * 查询租户的实例列表，支持按照条件查询。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
    */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listInstances);
    }

    /**
     * 查询产品规格列表
     * 在创建kafka实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。  例如，要订购按需计费、基准带宽为100MB的kafka实例，可从接口响应消息中，查找Hourly的消息体，然后找到bandwidth为100MB的记录对应的product_id，该product_id的值即是创建上述kafka实例时需要配置的产品ID。  同时，unavailable_zones字段表示资源不足的可用区列表，如果为空，则表示所有可用区都有资源，如果不为空，则表示字段值的可用区没有资源。所以必须确保您购买的资源所在的可用区有资源，不在该字段列表内。  例如，响应消息中bandwidth字段为1200MB的记录，unavailable_zones字段包含cn-east-2b、cn-east-2a和cn-east-2d，表示在华东-上海2的可用区1、可用区2、可用区3都没有该资源。
     *
     * @param ListProductsRequest 请求对象
     * @return ListProductsResponse
    */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listProducts);
    }

    /**
     * 查询转储任务列表
     * 查询转储任务列表。
     *
     * @param ListSinkTasksRequest 请求对象
     * @return ListSinkTasksResponse
    */
    public ListSinkTasksResponse listSinkTasks(ListSinkTasksRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.listSinkTasks);
    }

    /**
     * 重置Manager密码
     * 重置Manager密码。
     *
     * @param ResetManagerPasswordRequest 请求对象
     * @return ResetManagerPasswordResponse
    */
    public ResetManagerPasswordResponse resetManagerPassword(ResetManagerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetManagerPassword);
    }

    /**
     * 重置消费组消费进度到指定位置
     * Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。  &gt; 在停止被重置消费组客户端后，需要经过ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间（默认10000毫秒），服务端才认为消费组客户端真正下线。
     *
     * @param ResetMessageOffsetRequest 请求对象
     * @return ResetMessageOffsetResponse
    */
    public ResetMessageOffsetResponse resetMessageOffset(ResetMessageOffsetRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetMessageOffset);
    }

    /**
     * 重置密码
     * 重置密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
    */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resetPassword);
    }

    /**
     * 实例规格变更
     * 实例规格变更。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
    */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.resizeInstance);
    }

    /**
     * 查询后台任务管理中的指定记录
     * 查询后台任务管理中的指定记录。
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return ShowBackgroundTaskResponse
    */
    public ShowBackgroundTaskResponse showBackgroundTask(ShowBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showBackgroundTask);
    }

    /**
     * 查询实例在CES的监控层级关系
     * 查询实例在CES的监控层级关系。
     *
     * @param ShowCesHierarchyRequest 请求对象
     * @return ShowCesHierarchyResponse
    */
    public ShowCesHierarchyResponse showCesHierarchy(ShowCesHierarchyRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showCesHierarchy);
    }

    /**
     * 查询Kafka集群元数据信息
     * 查询Kafka集群元数据信息。
     *
     * @param ShowClusterRequest 请求对象
     * @return ShowClusterResponse
    */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showCluster);
    }

    /**
     * 查询Kafka实例的协调器信息
     * 查询Kafka实例的协调器信息。
     *
     * @param ShowCoordinatorsRequest 请求对象
     * @return ShowCoordinatorsResponse
    */
    public ShowCoordinatorsResponse showCoordinators(ShowCoordinatorsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showCoordinators);
    }

    /**
     * 查询消费组信息
     * 查询消费组信息。
     *
     * @param ShowGroupsRequest 请求对象
     * @return ShowGroupsResponse
    */
    public ShowGroupsResponse showGroups(ShowGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showGroups);
    }

    /**
     * 查询指定实例
     * 查询指定实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
    */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstance);
    }

    /**
     * 查询实例的扩容规格列表
     * 查询实例的扩容规格列表。
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return ShowInstanceExtendProductInfoResponse
    */
    public ShowInstanceExtendProductInfoResponse showInstanceExtendProductInfo(ShowInstanceExtendProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceExtendProductInfo);
    }

    /**
     * 查询实例标签
     * 查询实例标签。
     *
     * @param ShowInstanceTagsRequest 请求对象
     * @return ShowInstanceTagsResponse
    */
    public ShowInstanceTagsResponse showInstanceTags(ShowInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceTags);
    }

    /**
     * 查询Kafka实例Topic详细信息
     * 查询Kafka实例Topic详细信息。
     *
     * @param ShowInstanceTopicDetailRequest 请求对象
     * @return ShowInstanceTopicDetailResponse
    */
    public ShowInstanceTopicDetailResponse showInstanceTopicDetail(ShowInstanceTopicDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showInstanceTopicDetail);
    }

    /**
     * 查询维护时间窗时间段
     * 查询维护时间窗开始时间和结束时间。
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return ShowMaintainWindowsResponse
    */
    public ShowMaintainWindowsResponse showMaintainWindows(ShowMaintainWindowsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showMaintainWindows);
    }

    /**
     * 查询分区指定时间段的消息
     * 查询分区指定时间段的消息。
     *
     * @param ShowMessagesRequest 请求对象
     * @return ShowMessagesResponse
    */
    public ShowMessagesResponse showMessages(ShowMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showMessages);
    }

    /**
     * 查询分区最新消息的位置
     * 查询分区最新消息的位置。
     *
     * @param ShowPartitionBeginningMessageRequest 请求对象
     * @return ShowPartitionBeginningMessageResponse
    */
    public ShowPartitionBeginningMessageResponse showPartitionBeginningMessage(ShowPartitionBeginningMessageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showPartitionBeginningMessage);
    }

    /**
     * 查询分区最早消息的位置
     * 查询分区最早消息的位置。
     *
     * @param ShowPartitionEndMessageRequest 请求对象
     * @return ShowPartitionEndMessageResponse
    */
    public ShowPartitionEndMessageResponse showPartitionEndMessage(ShowPartitionEndMessageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showPartitionEndMessage);
    }

    /**
     * 查询分区指定偏移量的消息
     * 查询分区指定偏移量的消息。
     *
     * @param ShowPartitionMessageRequest 请求对象
     * @return ShowPartitionMessageResponse
    */
    public ShowPartitionMessageResponse showPartitionMessage(ShowPartitionMessageRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showPartitionMessage);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ShowProjectTagsRequest 请求对象
     * @return ShowProjectTagsResponse
    */
    public ShowProjectTagsResponse showProjectTags(ShowProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showProjectTags);
    }

    /**
     * 查询单个转储任务
     * 查询单个转储任务。
     *
     * @param ShowSinkTaskDetailRequest 请求对象
     * @return ShowSinkTaskDetailResponse
    */
    public ShowSinkTaskDetailResponse showSinkTaskDetail(ShowSinkTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.showSinkTaskDetail);
    }

    /**
     * 修改实例信息
     * 修改实例的名称和描述信息。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
    */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstance);
    }

    /**
     * 开启或关闭实例自动创建topic功能
     * 开启或关闭实例自动创建topic功能。
     *
     * @param UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return UpdateInstanceAutoCreateTopicResponse
    */
    public UpdateInstanceAutoCreateTopicResponse updateInstanceAutoCreateTopic(UpdateInstanceAutoCreateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstanceAutoCreateTopic);
    }

    /**
     * 修改实例跨VPC访问的内网IP
     * 修改实例跨VPC访问的内网IP。
     *
     * @param UpdateInstanceCrossVPCIPRequest 请求对象
     * @return UpdateInstanceCrossVPCIPResponse
    */
    public UpdateInstanceCrossVPCIPResponse updateInstanceCrossVPCIP(UpdateInstanceCrossVPCIPRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstanceCrossVPCIP);
    }

    /**
     * 修改Kafka实例Topic
     * 修改Kafka实例Topic
     *
     * @param UpdateInstaneTopicRequest 请求对象
     * @return UpdateInstaneTopicResponse
    */
    public UpdateInstaneTopicResponse updateInstaneTopic(UpdateInstaneTopicRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateInstaneTopic);
    }

    /**
     * 修改转储任务的配额
     * 修改转储任务的配额。
     *
     * @param UpdateSinkTaskQuotaRequest 请求对象
     * @return UpdateSinkTaskQuotaResponse
    */
    public UpdateSinkTaskQuotaResponse updateSinkTaskQuota(UpdateSinkTaskQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateSinkTaskQuota);
    }

    /**
     * 修改Kafka实例Topic分区的副本
     * 修改Kafka实例Topic分区的副本。
     *
     * @param UpdateTopicReplicaRequest 请求对象
     * @return UpdateTopicReplicaResponse
    */
    public UpdateTopicReplicaResponse updateTopicReplica(UpdateTopicReplicaRequest request) {
        return hcClient.syncInvokeHttp(request, KafkaMeta.updateTopicReplica);
    }

}