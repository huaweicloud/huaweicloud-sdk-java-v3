package com.huaweicloud.sdk.moderation.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.moderation.v1.model.*;

public class ModerationAsyncClient {
    protected HcClient hcClient;

    public ModerationAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationAsyncClient> newBuilder() {
        return new ClientBuilder<>(ModerationAsyncClient::new);
    }


    public CompletableFuture<RunCheckResultResponse> runCheckResultAsync(RunCheckResultRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCheckResult);
    }

    public CompletableFuture<RunCheckTaskJobsResponse> runCheckTaskJobsAsync(RunCheckTaskJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCheckTaskJobs);
    }

    public CompletableFuture<RunImageBatchModerationResponse> runImageBatchModerationAsync(RunImageBatchModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runImageBatchModeration);
    }

    public CompletableFuture<RunImageModerationResponse> runImageModerationAsync(RunImageModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runImageModeration);
    }

    public CompletableFuture<RunTaskSumbitResponse> runTaskSumbitAsync(RunTaskSumbitRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runTaskSumbit);
    }

    public CompletableFuture<RunTextModerationResponse> runTextModerationAsync(RunTextModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runTextModeration);
    }

}