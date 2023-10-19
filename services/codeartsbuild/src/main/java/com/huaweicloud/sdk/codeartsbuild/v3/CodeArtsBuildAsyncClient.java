package com.huaweicloud.sdk.codeartsbuild.v3;

import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadLogByRecordIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadLogByRecordIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ResumeBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ResumeBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobListByProjectIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobListByProjectIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowLastHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowLastHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListPeriodHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListPeriodHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsBuildAsyncClient {

    protected HcClient hcClient;

    public CodeArtsBuildAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsBuildAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsBuildAsyncClient> clientBuilder = new ClientBuilder<>(CodeArtsBuildAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 删除构建任务
     *
     * 删除构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBuildJobRequest 请求对象
     * @return CompletableFuture<DeleteBuildJobResponse>
     */
    public CompletableFuture<DeleteBuildJobResponse> deleteBuildJobAsync(DeleteBuildJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.deleteBuildJob);
    }

    /**
     * 删除构建任务
     *
     * 删除构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBuildJobRequest 请求对象
     * @return AsyncInvoker<DeleteBuildJobRequest, DeleteBuildJobResponse>
     */
    public AsyncInvoker<DeleteBuildJobRequest, DeleteBuildJobResponse> deleteBuildJobAsyncInvoker(
        DeleteBuildJobRequest request) {
        return new AsyncInvoker<DeleteBuildJobRequest, DeleteBuildJobResponse>(request,
            CodeArtsBuildMeta.deleteBuildJob, hcClient);
    }

    /**
     * 禁用构建任务
     *
     * 禁用构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableBuildJobRequest 请求对象
     * @return CompletableFuture<DisableBuildJobResponse>
     */
    public CompletableFuture<DisableBuildJobResponse> disableBuildJobAsync(DisableBuildJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.disableBuildJob);
    }

    /**
     * 禁用构建任务
     *
     * 禁用构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableBuildJobRequest 请求对象
     * @return AsyncInvoker<DisableBuildJobRequest, DisableBuildJobResponse>
     */
    public AsyncInvoker<DisableBuildJobRequest, DisableBuildJobResponse> disableBuildJobAsyncInvoker(
        DisableBuildJobRequest request) {
        return new AsyncInvoker<DisableBuildJobRequest, DisableBuildJobResponse>(request,
            CodeArtsBuildMeta.disableBuildJob, hcClient);
    }

    /**
     * KeyStore文件下载
     *
     * 下载指定租户下的KeyStore文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadKeystoreRequest 请求对象
     * @return CompletableFuture<DownloadKeystoreResponse>
     */
    public CompletableFuture<DownloadKeystoreResponse> downloadKeystoreAsync(DownloadKeystoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.downloadKeystore);
    }

    /**
     * KeyStore文件下载
     *
     * 下载指定租户下的KeyStore文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadKeystoreRequest 请求对象
     * @return AsyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse>
     */
    public AsyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystoreAsyncInvoker(
        DownloadKeystoreRequest request) {
        return new AsyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse>(request,
            CodeArtsBuildMeta.downloadKeystore, hcClient);
    }

    /**
     * 下载构建日志
     *
     * 下载构建日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadLogByRecordIdRequest 请求对象
     * @return CompletableFuture<DownloadLogByRecordIdResponse>
     */
    public CompletableFuture<DownloadLogByRecordIdResponse> downloadLogByRecordIdAsync(
        DownloadLogByRecordIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.downloadLogByRecordId);
    }

    /**
     * 下载构建日志
     *
     * 下载构建日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadLogByRecordIdRequest 请求对象
     * @return AsyncInvoker<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse>
     */
    public AsyncInvoker<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> downloadLogByRecordIdAsyncInvoker(
        DownloadLogByRecordIdRequest request) {
        return new AsyncInvoker<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse>(request,
            CodeArtsBuildMeta.downloadLogByRecordId, hcClient);
    }

    /**
     * 恢复构建任务
     *
     * 恢复构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResumeBuildJobRequest 请求对象
     * @return CompletableFuture<ResumeBuildJobResponse>
     */
    public CompletableFuture<ResumeBuildJobResponse> resumeBuildJobAsync(ResumeBuildJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.resumeBuildJob);
    }

    /**
     * 恢复构建任务
     *
     * 恢复构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResumeBuildJobRequest 请求对象
     * @return AsyncInvoker<ResumeBuildJobRequest, ResumeBuildJobResponse>
     */
    public AsyncInvoker<ResumeBuildJobRequest, ResumeBuildJobResponse> resumeBuildJobAsyncInvoker(
        ResumeBuildJobRequest request) {
        return new AsyncInvoker<ResumeBuildJobRequest, ResumeBuildJobResponse>(request,
            CodeArtsBuildMeta.resumeBuildJob, hcClient);
    }

    /**
     * 执行构建任务
     *
     * 执行构建任务,可传自定义参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunJobRequest 请求对象
     * @return CompletableFuture<RunJobResponse>
     */
    public CompletableFuture<RunJobResponse> runJobAsync(RunJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.runJob);
    }

    /**
     * 执行构建任务
     *
     * 执行构建任务,可传自定义参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunJobRequest 请求对象
     * @return AsyncInvoker<RunJobRequest, RunJobResponse>
     */
    public AsyncInvoker<RunJobRequest, RunJobResponse> runJobAsyncInvoker(RunJobRequest request) {
        return new AsyncInvoker<RunJobRequest, RunJobResponse>(request, CodeArtsBuildMeta.runJob, hcClient);
    }

    /**
     * 获取构建历史详情信息接口
     *
     * 获取构建历史详情信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryDetailsRequest 请求对象
     * @return CompletableFuture<ShowHistoryDetailsResponse>
     */
    public CompletableFuture<ShowHistoryDetailsResponse> showHistoryDetailsAsync(ShowHistoryDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showHistoryDetails);
    }

    /**
     * 获取构建历史详情信息接口
     *
     * 获取构建历史详情信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryDetailsRequest 请求对象
     * @return AsyncInvoker<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse>
     */
    public AsyncInvoker<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> showHistoryDetailsAsyncInvoker(
        ShowHistoryDetailsRequest request) {
        return new AsyncInvoker<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse>(request,
            CodeArtsBuildMeta.showHistoryDetails, hcClient);
    }

    /**
     * 查看项目下用户的构建任务列表
     *
     * 查看项目下用户的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobListByProjectIdRequest 请求对象
     * @return CompletableFuture<ShowJobListByProjectIdResponse>
     */
    public CompletableFuture<ShowJobListByProjectIdResponse> showJobListByProjectIdAsync(
        ShowJobListByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobListByProjectId);
    }

    /**
     * 查看项目下用户的构建任务列表
     *
     * 查看项目下用户的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobListByProjectIdRequest 请求对象
     * @return AsyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse>
     */
    public AsyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectIdAsyncInvoker(
        ShowJobListByProjectIdRequest request) {
        return new AsyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse>(request,
            CodeArtsBuildMeta.showJobListByProjectId, hcClient);
    }

    /**
     * 查看任务运行状态
     *
     * 查看任务运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStatusResponse>
     */
    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobStatus);
    }

    /**
     * 查看任务运行状态
     *
     * 查看任务运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(
        ShowJobStatusRequest request) {
        return new AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, CodeArtsBuildMeta.showJobStatus,
            hcClient);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建成功率
     *
     * 根据开始时间和结束时间查看构建任务的构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobSuccessRatioRequest 请求对象
     * @return CompletableFuture<ShowJobSuccessRatioResponse>
     */
    public CompletableFuture<ShowJobSuccessRatioResponse> showJobSuccessRatioAsync(ShowJobSuccessRatioRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobSuccessRatio);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建成功率
     *
     * 根据开始时间和结束时间查看构建任务的构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobSuccessRatioRequest 请求对象
     * @return AsyncInvoker<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse>
     */
    public AsyncInvoker<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> showJobSuccessRatioAsyncInvoker(
        ShowJobSuccessRatioRequest request) {
        return new AsyncInvoker<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse>(request,
            CodeArtsBuildMeta.showJobSuccessRatio, hcClient);
    }

    /**
     * 查询指定代码仓库最近一次成功的构建历史
     *
     * 查询指定代码仓库最近一次成功的构建历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLastHistoryRequest 请求对象
     * @return CompletableFuture<ShowLastHistoryResponse>
     */
    public CompletableFuture<ShowLastHistoryResponse> showLastHistoryAsync(ShowLastHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showLastHistory);
    }

    /**
     * 查询指定代码仓库最近一次成功的构建历史
     *
     * 查询指定代码仓库最近一次成功的构建历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLastHistoryRequest 请求对象
     * @return AsyncInvoker<ShowLastHistoryRequest, ShowLastHistoryResponse>
     */
    public AsyncInvoker<ShowLastHistoryRequest, ShowLastHistoryResponse> showLastHistoryAsyncInvoker(
        ShowLastHistoryRequest request) {
        return new AsyncInvoker<ShowLastHistoryRequest, ShowLastHistoryResponse>(request,
            CodeArtsBuildMeta.showLastHistory, hcClient);
    }

    /**
     * 查看构建任务的构建历史列表
     *
     * 查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListHistoryRequest 请求对象
     * @return CompletableFuture<ShowListHistoryResponse>
     */
    public CompletableFuture<ShowListHistoryResponse> showListHistoryAsync(ShowListHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showListHistory);
    }

    /**
     * 查看构建任务的构建历史列表
     *
     * 查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListHistoryRequest 请求对象
     * @return AsyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse>
     */
    public AsyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse> showListHistoryAsyncInvoker(
        ShowListHistoryRequest request) {
        return new AsyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse>(request,
            CodeArtsBuildMeta.showListHistory, hcClient);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListPeriodHistoryRequest 请求对象
     * @return CompletableFuture<ShowListPeriodHistoryResponse>
     */
    public CompletableFuture<ShowListPeriodHistoryResponse> showListPeriodHistoryAsync(
        ShowListPeriodHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showListPeriodHistory);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListPeriodHistoryRequest 请求对象
     * @return AsyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse>
     */
    public AsyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistoryAsyncInvoker(
        ShowListPeriodHistoryRequest request) {
        return new AsyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse>(request,
            CodeArtsBuildMeta.showListPeriodHistory, hcClient);
    }

    /**
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordInfoRequest 请求对象
     * @return CompletableFuture<ShowRecordInfoResponse>
     */
    public CompletableFuture<ShowRecordInfoResponse> showRecordInfoAsync(ShowRecordInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showRecordInfo);
    }

    /**
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordInfoRequest 请求对象
     * @return AsyncInvoker<ShowRecordInfoRequest, ShowRecordInfoResponse>
     */
    public AsyncInvoker<ShowRecordInfoRequest, ShowRecordInfoResponse> showRecordInfoAsyncInvoker(
        ShowRecordInfoRequest request) {
        return new AsyncInvoker<ShowRecordInfoRequest, ShowRecordInfoResponse>(request,
            CodeArtsBuildMeta.showRecordInfo, hcClient);
    }

    /**
     * 停止构建任务
     *
     * 停止构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopBuildJobRequest 请求对象
     * @return CompletableFuture<StopBuildJobResponse>
     */
    public CompletableFuture<StopBuildJobResponse> stopBuildJobAsync(StopBuildJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.stopBuildJob);
    }

    /**
     * 停止构建任务
     *
     * 停止构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopBuildJobRequest 请求对象
     * @return AsyncInvoker<StopBuildJobRequest, StopBuildJobResponse>
     */
    public AsyncInvoker<StopBuildJobRequest, StopBuildJobResponse> stopBuildJobAsyncInvoker(
        StopBuildJobRequest request) {
        return new AsyncInvoker<StopBuildJobRequest, StopBuildJobResponse>(request, CodeArtsBuildMeta.stopBuildJob,
            hcClient);
    }

}
