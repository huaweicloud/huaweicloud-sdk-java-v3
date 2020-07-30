package com.huaweicloud.sdk.cloudbuild.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.cloudbuild.v3.model.*;

public class CloudBuildAsyncClient {
    protected HcClient hcClient;

    public CloudBuildAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudBuildAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudBuildAsyncClient::new);
    }


    public CompletableFuture<RunJobResponse> runJobAsync(RunJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.runJob);
    }

    public CompletableFuture<ShowJobListByProjectIdResponse> showJobListByProjectIdAsync(ShowJobListByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.showJobListByProjectId);
    }

    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.showJobStatus);
    }

}