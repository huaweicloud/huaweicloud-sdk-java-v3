package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.ecs.v2.model.*;

public class EcsAsyncClient {
    protected HcClient hcClient;

    public EcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcsAsyncClient> newBuilder() {
        return new ClientBuilder<>(EcsAsyncClient::new);
    }


    public CompletableFuture<AttachServerVolumeResponse> attachServerVolumeAsync(AttachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.attachServerVolume);
    }

    public CompletableFuture<BatchAddServerNicsResponse> batchAddServerNicsAsync(BatchAddServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchAddServerNics);
    }

    public CompletableFuture<BatchCreateServerTagsResponse> batchCreateServerTagsAsync(BatchCreateServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchCreateServerTags);
    }

    public CompletableFuture<BatchDeleteServerNicsResponse> batchDeleteServerNicsAsync(BatchDeleteServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerNics);
    }

    public CompletableFuture<BatchDeleteServerTagsResponse> batchDeleteServerTagsAsync(BatchDeleteServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerTags);
    }

    public CompletableFuture<BatchRebootServersResponse> batchRebootServersAsync(BatchRebootServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchRebootServers);
    }

    public CompletableFuture<BatchStartServersResponse> batchStartServersAsync(BatchStartServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStartServers);
    }

    public CompletableFuture<BatchStopServersResponse> batchStopServersAsync(BatchStopServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStopServers);
    }

    public CompletableFuture<CreatePostPaidServersResponse> createPostPaidServersAsync(CreatePostPaidServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createPostPaidServers);
    }

    public CompletableFuture<DeleteServersResponse> deleteServersAsync(DeleteServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServers);
    }

    public CompletableFuture<DetachServerVolumeResponse> detachServerVolumeAsync(DetachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.detachServerVolume);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listFlavors);
    }

    public CompletableFuture<ListServerBlockDevicesResponse> listServerBlockDevicesAsync(ListServerBlockDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    public CompletableFuture<ListServerInterfacesResponse> listServerInterfacesAsync(ListServerInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerInterfaces);
    }

    public CompletableFuture<ListServersDetailsResponse> listServersDetailsAsync(ListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServersDetails);
    }

    public CompletableFuture<NovaCreateServersResponse> novaCreateServersAsync(NovaCreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateServers);
    }

    public CompletableFuture<NovaDeleteServerResponse> novaDeleteServerAsync(NovaDeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteServer);
    }

    public CompletableFuture<NovaListServersDetailsResponse> novaListServersDetailsAsync(NovaListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServersDetails);
    }

    public CompletableFuture<NovaShowServerResponse> novaShowServerAsync(NovaShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowServer);
    }

    public CompletableFuture<ResizePostPaidServerResponse> resizePostPaidServerAsync(ResizePostPaidServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizePostPaidServer);
    }

    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServer);
    }

    public CompletableFuture<ShowServerTagsResponse> showServerTagsAsync(ShowServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerTags);
    }

    public CompletableFuture<UpdateServerResponse> updateServerAsync(UpdateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServer);
    }

    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showJob);
    }

}