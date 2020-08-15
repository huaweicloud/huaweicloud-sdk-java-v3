package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.cloudide.v2.model.*;

public class CloudideAsyncClient {
    protected HcClient hcClient;

    public CloudideAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudideAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudideAsyncClient::new);
    }


    public CompletableFuture<ListProjectTemplatesResponse> listProjectTemplatesAsync(ListProjectTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.listProjectTemplates);
    }

    public CompletableFuture<ListStacksByTagResponse> listStacksByTagAsync(ListStacksByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.listStacksByTag);
    }

    public CompletableFuture<ShowPriceResponse> showPriceAsync(ShowPriceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.showPrice);
    }

    public CompletableFuture<CheckNameResponse> checkNameAsync(CheckNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.checkName);
    }

    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.createInstance);
    }

    public CompletableFuture<CreateInstanceBy3rdResponse> createInstanceBy3rdAsync(CreateInstanceBy3rdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.createInstanceBy3rd);
    }

    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.deleteInstance);
    }

    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.listInstances);
    }

    public CompletableFuture<ListOrgInstancesResponse> listOrgInstancesAsync(ListOrgInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.listOrgInstances);
    }

    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.showInstance);
    }

    public CompletableFuture<StartInstanceResponse> startInstanceAsync(StartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.startInstance);
    }

    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.stopInstance);
    }

    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.updateInstance);
    }

}