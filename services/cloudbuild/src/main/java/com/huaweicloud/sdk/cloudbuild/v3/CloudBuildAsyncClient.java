package com.huaweicloud.sdk.cloudbuild.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 新建构建任务
     * 新建构建任务,可传自定义参数。
     *
     * @param CreateJobRequest 请求对象
     * @return CompletableFuture<CreateJobResponse>
     */
    public CompletableFuture<CreateJobResponse> createJobAsync(CreateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.createJob);
    }

    /**
     * 新建构建任务
     * 新建构建任务,可传自定义参数。
     *
     * @param CreateJobRequest 请求对象
     * @return AsyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public AsyncInvoker<CreateJobRequest, CreateJobResponse> createJobAsyncInvoker(CreateJobRequest request) {
        return new AsyncInvoker<CreateJobRequest, CreateJobResponse>(request, CloudBuildMeta.createJob, hcClient);
    }

    /**
     * KeyStore文件下载
     * 下载指定租户下的KeyStore文件
     *
     * @param DownloadKeystoreRequest 请求对象
     * @return CompletableFuture<DownloadKeystoreResponse>
     */
    public CompletableFuture<DownloadKeystoreResponse> downloadKeystoreAsync(DownloadKeystoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.downloadKeystore);
    }

    /**
     * KeyStore文件下载
     * 下载指定租户下的KeyStore文件
     *
     * @param DownloadKeystoreRequest 请求对象
     * @return AsyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse>
     */
    public AsyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystoreAsyncInvoker(DownloadKeystoreRequest request) {
        return new AsyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse>(request, CloudBuildMeta.downloadKeystore, hcClient);
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
     * 执行构建任务
     * 执行构建任务,可传自定义参数。
     *
     * @param RunJobRequest 请求对象
     * @return AsyncInvoker<RunJobRequest, RunJobResponse>
     */
    public AsyncInvoker<RunJobRequest, RunJobResponse> runJobAsyncInvoker(RunJobRequest request) {
        return new AsyncInvoker<RunJobRequest, RunJobResponse>(request, CloudBuildMeta.runJob, hcClient);
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
     * 查看项目下用户的构建任务列表
     * 查看项目下用户的构建任务列表
     *
     * @param ShowJobListByProjectIdRequest 请求对象
     * @return AsyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse>
     */
    public AsyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectIdAsyncInvoker(ShowJobListByProjectIdRequest request) {
        return new AsyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse>(request, CloudBuildMeta.showJobListByProjectId, hcClient);
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

    /**
     * 查看任务运行状态
     * 查看任务运行状态
     *
     * @param ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(ShowJobStatusRequest request) {
        return new AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, CloudBuildMeta.showJobStatus, hcClient);
    }

    /**
     * 查看构建任务的构建历史列表
     * 查看构建任务的构建历史列表
     *
     * @param ShowListHistoryRequest 请求对象
     * @return CompletableFuture<ShowListHistoryResponse>
     */
    public CompletableFuture<ShowListHistoryResponse> showListHistoryAsync(ShowListHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.showListHistory);
    }

    /**
     * 查看构建任务的构建历史列表
     * 查看构建任务的构建历史列表
     *
     * @param ShowListHistoryRequest 请求对象
     * @return AsyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse>
     */
    public AsyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse> showListHistoryAsyncInvoker(ShowListHistoryRequest request) {
        return new AsyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse>(request, CloudBuildMeta.showListHistory, hcClient);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * @param ShowListPeriodHistoryRequest 请求对象
     * @return CompletableFuture<ShowListPeriodHistoryResponse>
     */
    public CompletableFuture<ShowListPeriodHistoryResponse> showListPeriodHistoryAsync(ShowListPeriodHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudBuildMeta.showListPeriodHistory);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * @param ShowListPeriodHistoryRequest 请求对象
     * @return AsyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse>
     */
    public AsyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistoryAsyncInvoker(ShowListPeriodHistoryRequest request) {
        return new AsyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse>(request, CloudBuildMeta.showListPeriodHistory, hcClient);
    }

}