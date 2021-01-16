package com.huaweicloud.sdk.cloudbuild.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * 查看构建任务的构建历史列表
     * 查看构建任务的构建历史列表
     *
     * @param ShowListHistoryRequest 请求对象
     * @return ShowListHistoryResponse
     */
    public ShowListHistoryResponse showListHistory(ShowListHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.showListHistory);
    }

}