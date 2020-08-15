package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.live.v1.model.*;

public class LiveAPIAsyncClient {
    protected HcClient hcClient;

    public LiveAPIAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveAPIAsyncClient> newBuilder() {
        return new ClientBuilder<>(LiveAPIAsyncClient::new);
    }


    public CompletableFuture<CreateRecordConfigResponse> createRecordConfigAsync(CreateRecordConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.createRecordConfig);
    }

    public CompletableFuture<CreateStreamForbiddenResponse> createStreamForbiddenAsync(CreateStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.createStreamForbidden);
    }

    public CompletableFuture<CreateTranscodingsTemplateResponse> createTranscodingsTemplateAsync(CreateTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.createTranscodingsTemplate);
    }

    public CompletableFuture<DeleteRecordConfigResponse> deleteRecordConfigAsync(DeleteRecordConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.deleteRecordConfig);
    }

    public CompletableFuture<DeleteStreamForbiddenResponse> deleteStreamForbiddenAsync(DeleteStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.deleteStreamForbidden);
    }

    public CompletableFuture<DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplateAsync(DeleteTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.deleteTranscodingsTemplate);
    }

    public CompletableFuture<ListRecordConfigsResponse> listRecordConfigsAsync(ListRecordConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listRecordConfigs);
    }

    public CompletableFuture<ListStreamForbiddenResponse> listStreamForbiddenAsync(ListStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listStreamForbidden);
    }

    public CompletableFuture<ShowBandwidthResponse> showBandwidthAsync(ShowBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.showBandwidth);
    }

    public CompletableFuture<ShowOnlineUsersResponse> showOnlineUsersAsync(ShowOnlineUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.showOnlineUsers);
    }

    public CompletableFuture<ShowTrafficResponse> showTrafficAsync(ShowTrafficRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.showTraffic);
    }

    public CompletableFuture<ShowTranscodingsTemplateResponse> showTranscodingsTemplateAsync(ShowTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.showTranscodingsTemplate);
    }

    public CompletableFuture<UpdateStreamForbiddenResponse> updateStreamForbiddenAsync(UpdateStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.updateStreamForbidden);
    }

    public CompletableFuture<UpdateTranscodingsTemplateResponse> updateTranscodingsTemplateAsync(UpdateTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.updateTranscodingsTemplate);
    }

}