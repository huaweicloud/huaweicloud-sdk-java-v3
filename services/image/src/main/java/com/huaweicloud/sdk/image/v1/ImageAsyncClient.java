package com.huaweicloud.sdk.image.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.image.v1.model.*;

public class ImageAsyncClient {
    protected HcClient hcClient;

    public ImageAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageAsyncClient> newBuilder() {
        return new ClientBuilder<>(ImageAsyncClient::new);
    }


    public CompletableFuture<RunCelebrityRecognitionResponse> runCelebrityRecognitionAsync(RunCelebrityRecognitionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runCelebrityRecognition);
    }

    public CompletableFuture<RunImageTaggingResponse> runImageTaggingAsync(RunImageTaggingRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageTagging);
    }

}