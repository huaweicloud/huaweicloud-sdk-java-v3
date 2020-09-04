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


    public CompletableFuture<BatchCreateOrDeleteInstanceTagResponse> batchCreateOrDeleteInstanceTagAsync(BatchCreateOrDeleteInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchCreateOrDeleteInstanceTag);
    }

    public CompletableFuture<BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopicAsync(BatchDeleteInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchDeleteInstanceTopic);
    }

    public CompletableFuture<BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsync(BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.batchRestartOrDeleteInstances);
    }

    public CompletableFuture<CreateConnectorResponse> createConnectorAsync(CreateConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createConnector);
    }

    public CompletableFuture<CreateInstanceTopicResponse> createInstanceTopicAsync(CreateInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createInstanceTopic);
    }

    public CompletableFuture<CreatePartitionResponse> createPartitionAsync(CreatePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPartition);
    }

    public CompletableFuture<CreatePostPaidInstanceResponse> createPostPaidInstanceAsync(CreatePostPaidInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createPostPaidInstance);
    }

    public CompletableFuture<CreateSinkTaskResponse> createSinkTaskAsync(CreateSinkTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.createSinkTask);
    }

    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteBackgroundTask);
    }

    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteInstance);
    }

    public CompletableFuture<DeleteSinkTaskResponse> deleteSinkTaskAsync(DeleteSinkTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.deleteSinkTask);
    }

    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listAvailableZones);
    }

    public CompletableFuture<ListBackgroundTasksResponse> listBackgroundTasksAsync(ListBackgroundTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listBackgroundTasks);
    }

    public CompletableFuture<ListInstanceTopicsResponse> listInstanceTopicsAsync(ListInstanceTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstanceTopics);
    }

    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listInstances);
    }

    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listProducts);
    }

    public CompletableFuture<ListSinkTasksResponse> listSinkTasksAsync(ListSinkTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.listSinkTasks);
    }

    public CompletableFuture<ResetManagerPasswordResponse> resetManagerPasswordAsync(ResetManagerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetManagerPassword);
    }

    public CompletableFuture<ResetMessageOffsetResponse> resetMessageOffsetAsync(ResetMessageOffsetRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetMessageOffset);
    }

    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resetPassword);
    }

    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.resizeInstance);
    }

    public CompletableFuture<ShowBackgroundTaskResponse> showBackgroundTaskAsync(ShowBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showBackgroundTask);
    }

    public CompletableFuture<ShowCesHierarchyResponse> showCesHierarchyAsync(ShowCesHierarchyRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCesHierarchy);
    }

    public CompletableFuture<ShowClusterResponse> showClusterAsync(ShowClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCluster);
    }

    public CompletableFuture<ShowCoordinatorsResponse> showCoordinatorsAsync(ShowCoordinatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showCoordinators);
    }

    public CompletableFuture<ShowGroupsResponse> showGroupsAsync(ShowGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showGroups);
    }

    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstance);
    }

    public CompletableFuture<ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsync(ShowInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceExtendProductInfo);
    }

    public CompletableFuture<ShowInstanceTagsResponse> showInstanceTagsAsync(ShowInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceTags);
    }

    public CompletableFuture<ShowInstanceTopicDetailResponse> showInstanceTopicDetailAsync(ShowInstanceTopicDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showInstanceTopicDetail);
    }

    public CompletableFuture<ShowMaintainWindowsResponse> showMaintainWindowsAsync(ShowMaintainWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMaintainWindows);
    }

    public CompletableFuture<ShowMessagesResponse> showMessagesAsync(ShowMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showMessages);
    }

    public CompletableFuture<ShowPartitionBeginningMessageResponse> showPartitionBeginningMessageAsync(ShowPartitionBeginningMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionBeginningMessage);
    }

    public CompletableFuture<ShowPartitionEndMessageResponse> showPartitionEndMessageAsync(ShowPartitionEndMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionEndMessage);
    }

    public CompletableFuture<ShowPartitionMessageResponse> showPartitionMessageAsync(ShowPartitionMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showPartitionMessage);
    }

    public CompletableFuture<ShowProjectTagsResponse> showProjectTagsAsync(ShowProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showProjectTags);
    }

    public CompletableFuture<ShowSinkTaskDetailResponse> showSinkTaskDetailAsync(ShowSinkTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.showSinkTaskDetail);
    }

    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstance);
    }

    public CompletableFuture<UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopicAsync(UpdateInstanceAutoCreateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceAutoCreateTopic);
    }

    public CompletableFuture<UpdateInstanceCrossVPCIPResponse> updateInstanceCrossVPCIPAsync(UpdateInstanceCrossVPCIPRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstanceCrossVPCIP);
    }

    public CompletableFuture<UpdateInstaneTopicResponse> updateInstaneTopicAsync(UpdateInstaneTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateInstaneTopic);
    }

    public CompletableFuture<UpdateSinkTaskQuotaResponse> updateSinkTaskQuotaAsync(UpdateSinkTaskQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateSinkTaskQuota);
    }

    public CompletableFuture<UpdateTopicReplicaResponse> updateTopicReplicaAsync(UpdateTopicReplicaRequest request) {
        return hcClient.asyncInvokeHttp(request, KafkaMeta.updateTopicReplica);
    }

}