package com.huaweicloud.sdk.kafka.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.kafka.v2.model.*;

public class KafkaAsyncClient {
    protected HcClient hcClient;

    public KafkaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KafkaAsyncClient> newBuilder() {
        return new ClientBuilder<>(KafkaAsyncClient::new);
    }


    /**
     * 批量添加或删除实例标签
     * 批量添加或删除实例标签。
     *
     * @param BatchCreateOrDeleteInstanceTagRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteInstanceTagResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteInstanceTagResponse> batchCreateOrDeleteInstanceTagAsync(BatchCreateOrDeleteInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchCreateOrDeleteInstanceTag);
    }

    /**
     * Kafka实例批量删除Topic
     * 该接口用于向Kafka实例批量删除Topic。
     *
     * @param BatchDeleteInstanceTopicRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstanceTopicResponse>
     */
    public CompletableFuture<BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopicAsync(BatchDeleteInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchDeleteInstanceTopic);
    }

    /**
     * 批量重启或删除实例
     * 批量重启或删除实例。  在实例重启过程中，客户端的生产与消费消息等请求会被拒绝。  实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。
     *
     * @param BatchRestartOrDeleteInstancesRequest 请求对象
     * @return CompletableFuture<BatchRestartOrDeleteInstancesResponse>
     */
    public CompletableFuture<BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsync(BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchRestartOrDeleteInstances);
    }

    /**
     * 创建实例的转储节点
     * 创建实例的转储节点。
     *
     * @param CreateConnectorRequest 请求对象
     * @return CompletableFuture<CreateConnectorResponse>
     */
    public CompletableFuture<CreateConnectorResponse> createConnectorAsync(CreateConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createConnector);
    }

    /**
     * Kafka实例创建Topic
     * 该接口用于向Kafka实例创建Topic。
     *
     * @param CreateInstanceTopicRequest 请求对象
     * @return CompletableFuture<CreateInstanceTopicResponse>
     */
    public CompletableFuture<CreateInstanceTopicResponse> createInstanceTopicAsync(CreateInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createInstanceTopic);
    }

    /**
     * 新增Kafka实例指定Topic分区
     * 新增Kafka实例指定Topic分区。
     *
     * @param CreatePartitionRequest 请求对象
     * @return CompletableFuture<CreatePartitionResponse>
     */
    public CompletableFuture<CreatePartitionResponse> createPartitionAsync(CreatePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPartition);
    }

    /**
     * 创建实例（按需）
     * 创建实例，该接口创建的实例为按需计费的方式。
     *
     * @param CreatePostPaidInstanceRequest 请求对象
     * @return CompletableFuture<CreatePostPaidInstanceResponse>
     */
    public CompletableFuture<CreatePostPaidInstanceResponse> createPostPaidInstanceAsync(CreatePostPaidInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPostPaidInstance);
    }

    /**
     * 创建转储任务
     * 创建转储任务。
     *
     * @param CreateSinkTaskRequest 请求对象
     * @return CompletableFuture<CreateSinkTaskResponse>
     */
    public CompletableFuture<CreateSinkTaskResponse> createSinkTaskAsync(CreateSinkTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createSinkTask);
    }

    /**
     * 删除后台任务管理中的指定记录
     * 删除后台任务管理中的指定记录。
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return CompletableFuture<DeleteBackgroundTaskResponse>
     */
    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteBackgroundTask);
    }

    /**
     * 删除指定的实例
     * 删除指定的实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteInstance);
    }

    /**
     * 删除单个转储任务
     * 删除单个转储任务。
     *
     * @param DeleteSinkTaskRequest 请求对象
     * @return CompletableFuture<DeleteSinkTaskResponse>
     */
    public CompletableFuture<DeleteSinkTaskResponse> deleteSinkTaskAsync(DeleteSinkTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteSinkTask);
    }

    /**
     * 查询可用区信息
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return CompletableFuture<ListAvailableZonesResponse>
     */
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listAvailableZones);
    }

    /**
     * 查询实例的后台任务列表
     * 查询实例的后台任务列表。
     *
     * @param ListBackgroundTasksRequest 请求对象
     * @return CompletableFuture<ListBackgroundTasksResponse>
     */
    public CompletableFuture<ListBackgroundTasksResponse> listBackgroundTasksAsync(ListBackgroundTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listBackgroundTasks);
    }

    /**
     * Kafka实例查询Topic
     * 该接口用于查询指定Kafka实例的Topic详情。
     *
     * @param ListInstanceTopicsRequest 请求对象
     * @return CompletableFuture<ListInstanceTopicsResponse>
     */
    public CompletableFuture<ListInstanceTopicsResponse> listInstanceTopicsAsync(ListInstanceTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceTopics);
    }

    /**
     * 查询所有实例列表
     * 查询租户的实例列表，支持按照条件查询。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstances);
    }

    /**
     * 查询产品规格列表
     * 在创建kafka实例时，需要配置订购的产品ID（即product_id），可通过该接口查询产品规格。  例如，要订购按需计费、基准带宽为100MB的kafka实例，可从接口响应消息中，查找Hourly的消息体，然后找到bandwidth为100MB的记录对应的product_id，该product_id的值即是创建上述kafka实例时需要配置的产品ID。  同时，unavailable_zones字段表示资源不足的可用区列表，如果为空，则表示所有可用区都有资源，如果不为空，则表示字段值的可用区没有资源。所以必须确保您购买的资源所在的可用区有资源，不在该字段列表内。  例如，响应消息中bandwidth字段为1200MB的记录，unavailable_zones字段包含cn-east-2b、cn-east-2a和cn-east-2d，表示在华东-上海2的可用区1、可用区2、可用区3都没有该资源。
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listProducts);
    }

    /**
     * 查询转储任务列表
     * 查询转储任务列表。
     *
     * @param ListSinkTasksRequest 请求对象
     * @return CompletableFuture<ListSinkTasksResponse>
     */
    public CompletableFuture<ListSinkTasksResponse> listSinkTasksAsync(ListSinkTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listSinkTasks);
    }

    /**
     * 重置Manager密码
     * 重置Manager密码。
     *
     * @param ResetManagerPasswordRequest 请求对象
     * @return CompletableFuture<ResetManagerPasswordResponse>
     */
    public CompletableFuture<ResetManagerPasswordResponse> resetManagerPasswordAsync(ResetManagerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetManagerPassword);
    }

    /**
     * 重置消费组消费进度到指定位置
     * Kafka实例不支持在线重置消费进度。在执行重置消费进度之前，必须停止被重置消费组客户端。  &gt; 在停止被重置消费组客户端后，需要经过ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG配置的时间（默认10000毫秒），服务端才认为消费组客户端真正下线。
     *
     * @param ResetMessageOffsetRequest 请求对象
     * @return CompletableFuture<ResetMessageOffsetResponse>
     */
    public CompletableFuture<ResetMessageOffsetResponse> resetMessageOffsetAsync(ResetMessageOffsetRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetMessageOffset);
    }

    /**
     * 重置密码
     * 重置密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetPassword);
    }

    /**
     * 实例规格变更
     * 实例规格变更。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resizeInstance);
    }

    /**
     * 重启Manager
     * 重启Manager。
     *
     * @param RestartManagerRequest 请求对象
     * @return CompletableFuture<RestartManagerResponse>
     */
    public CompletableFuture<RestartManagerResponse> restartManagerAsync(RestartManagerRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.restartManager);
    }

    /**
     * 查询后台任务管理中的指定记录
     * 查询后台任务管理中的指定记录。
     *
     * @param ShowBackgroundTaskRequest 请求对象
     * @return CompletableFuture<ShowBackgroundTaskResponse>
     */
    public CompletableFuture<ShowBackgroundTaskResponse> showBackgroundTaskAsync(ShowBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showBackgroundTask);
    }

    /**
     * 查询实例在CES的监控层级关系
     * 查询实例在CES的监控层级关系。
     *
     * @param ShowCesHierarchyRequest 请求对象
     * @return CompletableFuture<ShowCesHierarchyResponse>
     */
    public CompletableFuture<ShowCesHierarchyResponse> showCesHierarchyAsync(ShowCesHierarchyRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCesHierarchy);
    }

    /**
     * 查询Kafka集群元数据信息
     * 查询Kafka集群元数据信息。
     *
     * @param ShowClusterRequest 请求对象
     * @return CompletableFuture<ShowClusterResponse>
     */
    public CompletableFuture<ShowClusterResponse> showClusterAsync(ShowClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCluster);
    }

    /**
     * 查询Kafka实例的协调器信息
     * 查询Kafka实例的协调器信息。
     *
     * @param ShowCoordinatorsRequest 请求对象
     * @return CompletableFuture<ShowCoordinatorsResponse>
     */
    public CompletableFuture<ShowCoordinatorsResponse> showCoordinatorsAsync(ShowCoordinatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCoordinators);
    }

    /**
     * 查询消费组信息
     * 查询消费组信息。
     *
     * @param ShowGroupsRequest 请求对象
     * @return CompletableFuture<ShowGroupsResponse>
     */
    public CompletableFuture<ShowGroupsResponse> showGroupsAsync(ShowGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showGroups);
    }

    /**
     * 查询指定实例
     * 查询指定实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstance);
    }

    /**
     * 查询实例的扩容规格列表
     * 查询实例的扩容规格列表。
     *
     * @param ShowInstanceExtendProductInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceExtendProductInfoResponse>
     */
    public CompletableFuture<ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsync(ShowInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceExtendProductInfo);
    }

    /**
     * 查询实例标签
     * 查询实例标签。
     *
     * @param ShowInstanceTagsRequest 请求对象
     * @return CompletableFuture<ShowInstanceTagsResponse>
     */
    public CompletableFuture<ShowInstanceTagsResponse> showInstanceTagsAsync(ShowInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceTags);
    }

    /**
     * 查询Kafka实例Topic详细信息
     * 查询Kafka实例Topic详细信息。
     *
     * @param ShowInstanceTopicDetailRequest 请求对象
     * @return CompletableFuture<ShowInstanceTopicDetailResponse>
     */
    public CompletableFuture<ShowInstanceTopicDetailResponse> showInstanceTopicDetailAsync(ShowInstanceTopicDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceTopicDetail);
    }

    /**
     * 查询维护时间窗时间段
     * 查询维护时间窗开始时间和结束时间。
     *
     * @param ShowMaintainWindowsRequest 请求对象
     * @return CompletableFuture<ShowMaintainWindowsResponse>
     */
    public CompletableFuture<ShowMaintainWindowsResponse> showMaintainWindowsAsync(ShowMaintainWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMaintainWindows);
    }

    /**
     * 查询分区指定时间段的消息
     * 查询分区指定时间段的消息。
     *
     * @param ShowMessagesRequest 请求对象
     * @return CompletableFuture<ShowMessagesResponse>
     */
    public CompletableFuture<ShowMessagesResponse> showMessagesAsync(ShowMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMessages);
    }

    /**
     * 查询分区最新消息的位置
     * 查询分区最新消息的位置。
     *
     * @param ShowPartitionBeginningMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionBeginningMessageResponse>
     */
    public CompletableFuture<ShowPartitionBeginningMessageResponse> showPartitionBeginningMessageAsync(ShowPartitionBeginningMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionBeginningMessage);
    }

    /**
     * 查询分区最早消息的位置
     * 查询分区最早消息的位置。
     *
     * @param ShowPartitionEndMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionEndMessageResponse>
     */
    public CompletableFuture<ShowPartitionEndMessageResponse> showPartitionEndMessageAsync(ShowPartitionEndMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionEndMessage);
    }

    /**
     * 查询分区指定偏移量的消息
     * 查询分区指定偏移量的消息。
     *
     * @param ShowPartitionMessageRequest 请求对象
     * @return CompletableFuture<ShowPartitionMessageResponse>
     */
    public CompletableFuture<ShowPartitionMessageResponse> showPartitionMessageAsync(ShowPartitionMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionMessage);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ShowProjectTagsRequest 请求对象
     * @return CompletableFuture<ShowProjectTagsResponse>
     */
    public CompletableFuture<ShowProjectTagsResponse> showProjectTagsAsync(ShowProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showProjectTags);
    }

    /**
     * 查询单个转储任务
     * 查询单个转储任务。
     *
     * @param ShowSinkTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowSinkTaskDetailResponse>
     */
    public CompletableFuture<ShowSinkTaskDetailResponse> showSinkTaskDetailAsync(ShowSinkTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showSinkTaskDetail);
    }

    /**
     * 修改实例信息
     * 修改实例的名称和描述信息。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstance);
    }

    /**
     * 开启或关闭实例自动创建topic功能
     * 开启或关闭实例自动创建topic功能。
     *
     * @param UpdateInstanceAutoCreateTopicRequest 请求对象
     * @return CompletableFuture<UpdateInstanceAutoCreateTopicResponse>
     */
    public CompletableFuture<UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopicAsync(UpdateInstanceAutoCreateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceAutoCreateTopic);
    }

    /**
     * 修改实例跨VPC访问的内网IP
     * 修改实例跨VPC访问的内网IP。
     *
     * @param UpdateInstanceCrossVPCIPRequest 请求对象
     * @return CompletableFuture<UpdateInstanceCrossVPCIPResponse>
     */
    public CompletableFuture<UpdateInstanceCrossVPCIPResponse> updateInstanceCrossVPCIPAsync(UpdateInstanceCrossVPCIPRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceCrossVPCIP);
    }

    /**
     * 修改Kafka实例Topic
     * 修改Kafka实例Topic
     *
     * @param UpdateInstanceTopicRequest 请求对象
     * @return CompletableFuture<UpdateInstanceTopicResponse>
     */
    public CompletableFuture<UpdateInstanceTopicResponse> updateInstanceTopicAsync(UpdateInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceTopic);
    }

    /**
     * 修改转储任务的配额
     * 修改转储任务的配额。
     *
     * @param UpdateSinkTaskQuotaRequest 请求对象
     * @return CompletableFuture<UpdateSinkTaskQuotaResponse>
     */
    public CompletableFuture<UpdateSinkTaskQuotaResponse> updateSinkTaskQuotaAsync(UpdateSinkTaskQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateSinkTaskQuota);
    }

    /**
     * 修改Kafka实例Topic分区的副本
     * 修改Kafka实例Topic分区的副本。
     *
     * @param UpdateTopicReplicaRequest 请求对象
     * @return CompletableFuture<UpdateTopicReplicaResponse>
     */
    public CompletableFuture<UpdateTopicReplicaResponse> updateTopicReplicaAsync(UpdateTopicReplicaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateTopicReplica);
    }

}