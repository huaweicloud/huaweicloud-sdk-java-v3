package com.huaweicloud.sdk.cts.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.cts.v1.model.*;

public class CtsAsyncClient {
    protected HcClient hcClient;

    public CtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CtsAsyncClient> newBuilder() {
        return new ClientBuilder<>(CtsAsyncClient::new);
    }


    public CompletableFuture<CreateTrackerResponse> createTrackerAsync(CreateTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.createTracker);
    }

    public CompletableFuture<DeleteTrackerResponse> deleteTrackerAsync(DeleteTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.deleteTracker);
    }

    public CompletableFuture<ListTracesV2Response> listTracesV2Async(ListTracesV2Request request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listTracesV2);
    }

    public CompletableFuture<ListTrackerResponse> listTrackerAsync(ListTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listTracker);
    }

    public CompletableFuture<UpdateTrackerResponse> updateTrackerAsync(UpdateTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.updateTracker);
    }

}