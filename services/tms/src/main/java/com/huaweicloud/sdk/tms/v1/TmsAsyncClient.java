package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.tms.v1.model.*;

public class TmsAsyncClient {
    protected HcClient hcClient;

    public TmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(TmsAsyncClient::new, "GlobalCredentials");
    }


    public CompletableFuture<CreatePredefineTagsResponse> createPredefineTagsAsync(CreatePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.createPredefineTags);
    }

    public CompletableFuture<DeletePredefineTagsResponse> deletePredefineTagsAsync(DeletePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.deletePredefineTags);
    }

    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listApiVersions);
    }

    public CompletableFuture<ListPredefineTagsResponse> listPredefineTagsAsync(ListPredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.listPredefineTags);
    }

    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.showApiVersion);
    }

    public CompletableFuture<UpdatePredefineTagsResponse> updatePredefineTagsAsync(UpdatePredefineTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, TmsMeta.updatePredefineTags);
    }

}