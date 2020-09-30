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


    /**
     * 执行构建任务
     * 执行构建任务,可传自定义参数。
     *
     * @param RunJobRequest 请求对象
     * @return CompletableFuture<RunJobResponse>
     */
    public CompletableFuture<RunJobResponse> runJobAsync(RunJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.runJob);
    }

    /**
     * 查看项目下用户的构建任务列表
     * 查看项目下用户的构建任务列表
     *
     * @param ShowJobListByProjectIdRequest 请求对象
     * @return CompletableFuture<ShowJobListByProjectIdResponse>
     */
    public CompletableFuture<ShowJobListByProjectIdResponse> showJobListByProjectIdAsync(ShowJobListByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.showJobListByProjectId);
    }

    /**
     * 查看任务运行状态
     * 查看任务运行状态
     *
     * @param ShowJobStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStatusResponse>
     */
    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.showJobStatus);
    }

}