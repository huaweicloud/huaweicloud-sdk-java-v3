package com.huaweicloud.sdk.cloudbuild.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.cloudbuild.v3.model.*;

public class CloudBuildClient {
    protected HcClient hcClient;

    public CloudBuildClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudBuildClient> newBuilder() {
        return new ClientBuilder<>(CloudBuildClient::new);
    }


    /**
     * KeyStore文件下载
     * 下载指定租户下的KeyStore文件
     *
     * @param DownloadKeystoreRequest 请求对象
     * @return DownloadKeystoreResponse
     */
    public DownloadKeystoreResponse downloadKeystore(DownloadKeystoreRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.downloadKeystore);
    }

    /**
     * KeyStore文件下载
     * 下载指定租户下的KeyStore文件
     *
     * @param DownloadKeystoreRequest 请求对象
     * @return SyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse>
     */
    public SyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystoreInvoker(DownloadKeystoreRequest request) {
        return new SyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse>(request, CloudBuildMeta.downloadKeystore, hcClient);
    }

    /**
     * 执行构建任务
     * 执行构建任务,可传自定义参数。
     *
     * @param RunJobRequest 请求对象
     * @return RunJobResponse
     */
    public RunJobResponse runJob(RunJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.runJob);
    }

    /**
     * 执行构建任务
     * 执行构建任务,可传自定义参数。
     *
     * @param RunJobRequest 请求对象
     * @return SyncInvoker<RunJobRequest, RunJobResponse>
     */
    public SyncInvoker<RunJobRequest, RunJobResponse> runJobInvoker(RunJobRequest request) {
        return new SyncInvoker<RunJobRequest, RunJobResponse>(request, CloudBuildMeta.runJob, hcClient);
    }

    /**
     * 查看项目下用户的构建任务列表
     * 查看项目下用户的构建任务列表
     *
     * @param ShowJobListByProjectIdRequest 请求对象
     * @return ShowJobListByProjectIdResponse
     */
    public ShowJobListByProjectIdResponse showJobListByProjectId(ShowJobListByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.showJobListByProjectId);
    }

    /**
     * 查看项目下用户的构建任务列表
     * 查看项目下用户的构建任务列表
     *
     * @param ShowJobListByProjectIdRequest 请求对象
     * @return SyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse>
     */
    public SyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectIdInvoker(ShowJobListByProjectIdRequest request) {
        return new SyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse>(request, CloudBuildMeta.showJobListByProjectId, hcClient);
    }

    /**
     * 查看任务运行状态
     * 查看任务运行状态
     *
     * @param ShowJobStatusRequest 请求对象
     * @return ShowJobStatusResponse
     */
    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.showJobStatus);
    }

    /**
     * 查看任务运行状态
     * 查看任务运行状态
     *
     * @param ShowJobStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusInvoker(ShowJobStatusRequest request) {
        return new SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, CloudBuildMeta.showJobStatus, hcClient);
    }

    /**
     * 查看构建任务的构建历史列表
     * 查看构建任务的构建历史列表
     *
     * @param ShowListHistoryRequest 请求对象
     * @return ShowListHistoryResponse
     */
    public ShowListHistoryResponse showListHistory(ShowListHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.showListHistory);
    }

    /**
     * 查看构建任务的构建历史列表
     * 查看构建任务的构建历史列表
     *
     * @param ShowListHistoryRequest 请求对象
     * @return SyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse>
     */
    public SyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse> showListHistoryInvoker(ShowListHistoryRequest request) {
        return new SyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse>(request, CloudBuildMeta.showListHistory, hcClient);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * @param ShowListPeriodHistoryRequest 请求对象
     * @return ShowListPeriodHistoryResponse
     */
    public ShowListPeriodHistoryResponse showListPeriodHistory(ShowListPeriodHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.showListPeriodHistory);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * @param ShowListPeriodHistoryRequest 请求对象
     * @return SyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse>
     */
    public SyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistoryInvoker(ShowListPeriodHistoryRequest request) {
        return new SyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse>(request, CloudBuildMeta.showListPeriodHistory, hcClient);
    }

}