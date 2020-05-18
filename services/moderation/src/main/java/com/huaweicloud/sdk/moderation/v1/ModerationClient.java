package com.huaweicloud.sdk.moderation.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.moderation.v1.model.*;

public class ModerationClient {
    protected HcClient hcClient;

    public ModerationClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationClient> newBuilder() {
        return new ClientBuilder<>(ModerationClient::new);
    }

    public RunCheckResultResponse runCheckResult(RunCheckResultRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCheckResult);
    }

    public RunCheckTaskJobsResponse runCheckTaskJobs(RunCheckTaskJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCheckTaskJobs);
    }

    public RunImageBatchModerationResponse runImageBatchModeration(RunImageBatchModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runImageBatchModeration);
    }

    public RunImageModerationResponse runImageModeration(RunImageModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runImageModeration);
    }

    public RunTaskSumbitResponse runTaskSumbit(RunTaskSumbitRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runTaskSumbit);
    }

    public RunTextModerationResponse runTextModeration(RunTextModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runTextModeration);
    }

}