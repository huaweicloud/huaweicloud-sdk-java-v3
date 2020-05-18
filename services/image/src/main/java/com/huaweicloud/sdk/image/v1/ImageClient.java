package com.huaweicloud.sdk.image.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.image.v1.model.*;

public class ImageClient {
    protected HcClient hcClient;

    public ImageClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageClient> newBuilder() {
        return new ClientBuilder<>(ImageClient::new);
    }

    public RunCelebrityRecognitionResponse runCelebrityRecognition(RunCelebrityRecognitionRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runCelebrityRecognition);
    }

    public RunImageTaggingResponse runImageTagging(RunImageTaggingRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageTagging);
    }

}