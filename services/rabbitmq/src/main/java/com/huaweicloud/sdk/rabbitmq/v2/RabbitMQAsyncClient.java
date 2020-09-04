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


    public CompletableFuture<BatchCreateOrDeleteInstanceTagResponse> batchCreateOrDeleteInstanceTagAsync(BatchCreateOrDeleteInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchCreateOrDeleteInstanceTag);
    }

    public CompletableFuture<BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstancesAsync(BatchRestartOrDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.batchRestartOrDeleteInstances);
    }

    public CompletableFuture<CreatePostPaidInstanceResponse> createPostPaidInstanceAsync(CreatePostPaidInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.createPostPaidInstance);
    }

    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteBackgroundTask);
    }

    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.deleteInstance);
    }

    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listAvailableZones);
    }

    public CompletableFuture<ListBackgroundTasksResponse> listBackgroundTasksAsync(ListBackgroundTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listBackgroundTasks);
    }

    public CompletableFuture<ListInstancesDetailsResponse> listInstancesDetailsAsync(ListInstancesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listInstancesDetails);
    }

    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.listProducts);
    }

    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resetPassword);
    }

    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.resizeInstance);
    }

    public CompletableFuture<ShowBackgroundTaskResponse> showBackgroundTaskAsync(ShowBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showBackgroundTask);
    }

    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstance);
    }

    public CompletableFuture<ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfoAsync(ShowInstanceExtendProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstanceExtendProductInfo);
    }

    public CompletableFuture<ShowInstanceTagsResponse> showInstanceTagsAsync(ShowInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showInstanceTags);
    }

    public CompletableFuture<ShowMaintainWindowsResponse> showMaintainWindowsAsync(ShowMaintainWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showMaintainWindows);
    }

    public CompletableFuture<ShowProjectTagsResponse> showProjectTagsAsync(ShowProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.showProjectTags);
    }

    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RabbitMQMeta.updateInstance);
    }

}