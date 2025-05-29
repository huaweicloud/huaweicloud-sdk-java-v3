package com.huaweicloud.sdk.codeartsbuild.v3;

import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadLogByRecordIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadLogByRecordIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadRealTimeLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadRealTimeLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadTaskLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadTaskLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.EnableBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.EnableBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordByJobIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordByJobIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListOfficialTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListOfficialTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListProjectJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListProjectJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecyclingJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecyclingJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildParamsListRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildParamsListResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordBuildScriptRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordBuildScriptResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFullStagesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFullStagesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowImageTemplateListRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowImageTemplateListResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildSuccessRatioRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildSuccessRatioResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildTimeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildTimeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobConfigDiffRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobConfigDiffResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobConfigRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobConfigResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobListByProjectIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobListByProjectIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobRolePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobRolePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSystemParametersRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSystemParametersResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowLastHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowLastHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListPeriodHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListPeriodHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowOutputInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowOutputInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowProjectPermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowProjectPermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordDetailRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordDetailResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowReportSummaryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowReportSummaryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRunningStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRunningStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowYamlTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowYamlTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeResponse;
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
     * 创建构建任务
     *
     * 创建构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBuildJobRequest 请求对象
     * @return CompletableFuture<CreateBuildJobResponse>
     */
    public CompletableFuture<CreateBuildJobResponse> createBuildJobAsync(CreateBuildJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.createBuildJob);
    }

    /**
     * 创建构建任务
     *
     * 创建构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBuildJobRequest 请求对象
     * @return AsyncInvoker<CreateBuildJobRequest, CreateBuildJobResponse>
     */
    public AsyncInvoker<CreateBuildJobRequest, CreateBuildJobResponse> createBuildJobAsyncInvoker(
        CreateBuildJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.createBuildJob, hcClient);
    }

    /**
     * 创建构建模板
     *
     * 创建构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplatesRequest 请求对象
     * @return CompletableFuture<CreateTemplatesResponse>
     */
    public CompletableFuture<CreateTemplatesResponse> createTemplatesAsync(CreateTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.createTemplates);
    }

    /**
     * 创建构建模板
     *
     * 创建构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplatesRequest 请求对象
     * @return AsyncInvoker<CreateTemplatesRequest, CreateTemplatesResponse>
     */
    public AsyncInvoker<CreateTemplatesRequest, CreateTemplatesResponse> createTemplatesAsyncInvoker(
        CreateTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.createTemplates, hcClient);
    }

    /**
     * 删除构建任务
     *
     * 删除构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBuildJobRequest 请求对象
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
     * @param request DeleteBuildJobRequest 请求对象
     * @return AsyncInvoker<DeleteBuildJobRequest, DeleteBuildJobResponse>
     */
    public AsyncInvoker<DeleteBuildJobRequest, DeleteBuildJobResponse> deleteBuildJobAsyncInvoker(
        DeleteBuildJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.deleteBuildJob, hcClient);
    }

    /**
     * 删除构建模板
     *
     * 删除构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplatesRequest 请求对象
     * @return CompletableFuture<DeleteTemplatesResponse>
     */
    public CompletableFuture<DeleteTemplatesResponse> deleteTemplatesAsync(DeleteTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.deleteTemplates);
    }

    /**
     * 删除构建模板
     *
     * 删除构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplatesRequest 请求对象
     * @return AsyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse>
     */
    public AsyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplatesAsyncInvoker(
        DeleteTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.deleteTemplates, hcClient);
    }

    /**
     * 禁用构建任务
     *
     * 禁用构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableBuildJobRequest 请求对象
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
     * @param request DisableBuildJobRequest 请求对象
     * @return AsyncInvoker<DisableBuildJobRequest, DisableBuildJobResponse>
     */
    public AsyncInvoker<DisableBuildJobRequest, DisableBuildJobResponse> disableBuildJobAsyncInvoker(
        DisableBuildJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.disableBuildJob, hcClient);
    }

    /**
     * 取消通知
     *
     * 取消通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableNoticeRequest 请求对象
     * @return CompletableFuture<DisableNoticeResponse>
     */
    public CompletableFuture<DisableNoticeResponse> disableNoticeAsync(DisableNoticeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.disableNotice);
    }

    /**
     * 取消通知
     *
     * 取消通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableNoticeRequest 请求对象
     * @return AsyncInvoker<DisableNoticeRequest, DisableNoticeResponse>
     */
    public AsyncInvoker<DisableNoticeRequest, DisableNoticeResponse> disableNoticeAsyncInvoker(
        DisableNoticeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.disableNotice, hcClient);
    }

    /**
     * 下载全量构建日志
     *
     * 下载全量构建日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBuildLogRequest 请求对象
     * @return CompletableFuture<DownloadBuildLogResponse>
     */
    public CompletableFuture<DownloadBuildLogResponse> downloadBuildLogAsync(DownloadBuildLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.downloadBuildLog);
    }

    /**
     * 下载全量构建日志
     *
     * 下载全量构建日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBuildLogRequest 请求对象
     * @return AsyncInvoker<DownloadBuildLogRequest, DownloadBuildLogResponse>
     */
    public AsyncInvoker<DownloadBuildLogRequest, DownloadBuildLogResponse> downloadBuildLogAsyncInvoker(
        DownloadBuildLogRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.downloadBuildLog, hcClient);
    }

    /**
     * KeyStore文件下载
     *
     * 下载指定租户下的KeyStore文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKeystoreRequest 请求对象
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
     * @param request DownloadKeystoreRequest 请求对象
     * @return AsyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse>
     */
    public AsyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystoreAsyncInvoker(
        DownloadKeystoreRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.downloadKeystore, hcClient);
    }

    /**
     * 下载构建实时日志
     *
     * 下载构建实时日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadRealTimeLogRequest 请求对象
     * @return CompletableFuture<DownloadRealTimeLogResponse>
     */
    public CompletableFuture<DownloadRealTimeLogResponse> downloadRealTimeLogAsync(DownloadRealTimeLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.downloadRealTimeLog);
    }

    /**
     * 下载构建实时日志
     *
     * 下载构建实时日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadRealTimeLogRequest 请求对象
     * @return AsyncInvoker<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse>
     */
    public AsyncInvoker<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse> downloadRealTimeLogAsyncInvoker(
        DownloadRealTimeLogRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.downloadRealTimeLog, hcClient);
    }

    /**
     * 下载构建步骤日志
     *
     * 下载构建步骤日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadTaskLogRequest 请求对象
     * @return CompletableFuture<DownloadTaskLogResponse>
     */
    public CompletableFuture<DownloadTaskLogResponse> downloadTaskLogAsync(DownloadTaskLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.downloadTaskLog);
    }

    /**
     * 下载构建步骤日志
     *
     * 下载构建步骤日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadTaskLogRequest 请求对象
     * @return AsyncInvoker<DownloadTaskLogRequest, DownloadTaskLogResponse>
     */
    public AsyncInvoker<DownloadTaskLogRequest, DownloadTaskLogResponse> downloadTaskLogAsyncInvoker(
        DownloadTaskLogRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.downloadTaskLog, hcClient);
    }

    /**
     * 恢复构建任务
     *
     * 恢复构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableBuildJobRequest 请求对象
     * @return CompletableFuture<EnableBuildJobResponse>
     */
    public CompletableFuture<EnableBuildJobResponse> enableBuildJobAsync(EnableBuildJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.enableBuildJob);
    }

    /**
     * 恢复构建任务
     *
     * 恢复构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableBuildJobRequest 请求对象
     * @return AsyncInvoker<EnableBuildJobRequest, EnableBuildJobResponse>
     */
    public AsyncInvoker<EnableBuildJobRequest, EnableBuildJobResponse> enableBuildJobAsyncInvoker(
        EnableBuildJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.enableBuildJob, hcClient);
    }

    /**
     * 获取任务构建记录列表
     *
     * 获取任务构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildInfoRecordRequest 请求对象
     * @return CompletableFuture<ListBuildInfoRecordResponse>
     */
    public CompletableFuture<ListBuildInfoRecordResponse> listBuildInfoRecordAsync(ListBuildInfoRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listBuildInfoRecord);
    }

    /**
     * 获取任务构建记录列表
     *
     * 获取任务构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildInfoRecordRequest 请求对象
     * @return AsyncInvoker<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse>
     */
    public AsyncInvoker<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse> listBuildInfoRecordAsyncInvoker(
        ListBuildInfoRecordRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listBuildInfoRecord, hcClient);
    }

    /**
     * 获取任务构建记录列表v1
     *
     * 获取任务构建记录列表v1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildInfoRecordByJobIdRequest 请求对象
     * @return CompletableFuture<ListBuildInfoRecordByJobIdResponse>
     */
    public CompletableFuture<ListBuildInfoRecordByJobIdResponse> listBuildInfoRecordByJobIdAsync(
        ListBuildInfoRecordByJobIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listBuildInfoRecordByJobId);
    }

    /**
     * 获取任务构建记录列表v1
     *
     * 获取任务构建记录列表v1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildInfoRecordByJobIdRequest 请求对象
     * @return AsyncInvoker<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse>
     */
    public AsyncInvoker<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse> listBuildInfoRecordByJobIdAsyncInvoker(
        ListBuildInfoRecordByJobIdRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listBuildInfoRecordByJobId, hcClient);
    }

    /**
     * 获取构建任务详情
     *
     * 获取构建任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobConfigRequest 请求对象
     * @return CompletableFuture<ListJobConfigResponse>
     */
    public CompletableFuture<ListJobConfigResponse> listJobConfigAsync(ListJobConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listJobConfig);
    }

    /**
     * 获取构建任务详情
     *
     * 获取构建任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobConfigRequest 请求对象
     * @return AsyncInvoker<ListJobConfigRequest, ListJobConfigResponse>
     */
    public AsyncInvoker<ListJobConfigRequest, ListJobConfigResponse> listJobConfigAsyncInvoker(
        ListJobConfigRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listJobConfig, hcClient);
    }

    /**
     * 查询通知
     *
     * 查询通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeRequest 请求对象
     * @return CompletableFuture<ListNoticeResponse>
     */
    public CompletableFuture<ListNoticeResponse> listNoticeAsync(ListNoticeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listNotice);
    }

    /**
     * 查询通知
     *
     * 查询通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeRequest 请求对象
     * @return AsyncInvoker<ListNoticeRequest, ListNoticeResponse>
     */
    public AsyncInvoker<ListNoticeRequest, ListNoticeResponse> listNoticeAsyncInvoker(ListNoticeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listNotice, hcClient);
    }

    /**
     * 查询官方模版
     *
     * 查询官方模版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOfficialTemplateRequest 请求对象
     * @return CompletableFuture<ListOfficialTemplateResponse>
     */
    public CompletableFuture<ListOfficialTemplateResponse> listOfficialTemplateAsync(
        ListOfficialTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listOfficialTemplate);
    }

    /**
     * 查询官方模版
     *
     * 查询官方模版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOfficialTemplateRequest 请求对象
     * @return AsyncInvoker<ListOfficialTemplateRequest, ListOfficialTemplateResponse>
     */
    public AsyncInvoker<ListOfficialTemplateRequest, ListOfficialTemplateResponse> listOfficialTemplateAsyncInvoker(
        ListOfficialTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listOfficialTemplate, hcClient);
    }

    /**
     * 查询项目任务列表
     *
     * 查询项目任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectJobsRequest 请求对象
     * @return CompletableFuture<ListProjectJobsResponse>
     */
    public CompletableFuture<ListProjectJobsResponse> listProjectJobsAsync(ListProjectJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listProjectJobs);
    }

    /**
     * 查询项目任务列表
     *
     * 查询项目任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectJobsRequest 请求对象
     * @return AsyncInvoker<ListProjectJobsRequest, ListProjectJobsResponse>
     */
    public AsyncInvoker<ListProjectJobsRequest, ListProjectJobsResponse> listProjectJobsAsyncInvoker(
        ListProjectJobsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listProjectJobs, hcClient);
    }

    /**
     * 查看回收站中删除的构建任务列表
     *
     * 查看回收站中删除的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecyclingJobRequest 请求对象
     * @return CompletableFuture<ListRecyclingJobResponse>
     */
    public CompletableFuture<ListRecyclingJobResponse> listRecyclingJobAsync(ListRecyclingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listRecyclingJob);
    }

    /**
     * 查看回收站中删除的构建任务列表
     *
     * 查看回收站中删除的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecyclingJobRequest 请求对象
     * @return AsyncInvoker<ListRecyclingJobRequest, ListRecyclingJobResponse>
     */
    public AsyncInvoker<ListRecyclingJobRequest, ListRecyclingJobResponse> listRecyclingJobAsyncInvoker(
        ListRecyclingJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listRecyclingJob, hcClient);
    }

    /**
     * 查询构建模板
     *
     * 查询构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listTemplates);
    }

    /**
     * 查询构建模板
     *
     * 查询构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listTemplates, hcClient);
    }

    /**
     * 执行构建任务
     *
     * 执行构建任务,可传自定义参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunJobRequest 请求对象
     * @return CompletableFuture<RunJobResponse>
     */
    public CompletableFuture<RunJobResponse> runJobAsync(RunJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.runJob);
    }

    /**
     * 执行构建任务
     *
     * 执行构建任务,可传自定义参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunJobRequest 请求对象
     * @return AsyncInvoker<RunJobRequest, RunJobResponse>
     */
    public AsyncInvoker<RunJobRequest, RunJobResponse> runJobAsyncInvoker(RunJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.runJob, hcClient);
    }

    /**
     * 编辑页获取参数类型的接口
     *
     * 编辑页获取参数类型的接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildParamsListRequest 请求对象
     * @return CompletableFuture<ShowBuildParamsListResponse>
     */
    public CompletableFuture<ShowBuildParamsListResponse> showBuildParamsListAsync(ShowBuildParamsListRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showBuildParamsList);
    }

    /**
     * 编辑页获取参数类型的接口
     *
     * 编辑页获取参数类型的接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildParamsListRequest 请求对象
     * @return AsyncInvoker<ShowBuildParamsListRequest, ShowBuildParamsListResponse>
     */
    public AsyncInvoker<ShowBuildParamsListRequest, ShowBuildParamsListResponse> showBuildParamsListAsyncInvoker(
        ShowBuildParamsListRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showBuildParamsList, hcClient);
    }

    /**
     * 查询指定构建记录详情
     *
     * 查询指定构建记录详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordRequest 请求对象
     * @return CompletableFuture<ShowBuildRecordResponse>
     */
    public CompletableFuture<ShowBuildRecordResponse> showBuildRecordAsync(ShowBuildRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showBuildRecord);
    }

    /**
     * 查询指定构建记录详情
     *
     * 查询指定构建记录详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordRequest 请求对象
     * @return AsyncInvoker<ShowBuildRecordRequest, ShowBuildRecordResponse>
     */
    public AsyncInvoker<ShowBuildRecordRequest, ShowBuildRecordResponse> showBuildRecordAsyncInvoker(
        ShowBuildRecordRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showBuildRecord, hcClient);
    }

    /**
     * 获取构建记录的构建脚本
     *
     * 获取构建记录的构建脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordBuildScriptRequest 请求对象
     * @return CompletableFuture<ShowBuildRecordBuildScriptResponse>
     */
    public CompletableFuture<ShowBuildRecordBuildScriptResponse> showBuildRecordBuildScriptAsync(
        ShowBuildRecordBuildScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showBuildRecordBuildScript);
    }

    /**
     * 获取构建记录的构建脚本
     *
     * 获取构建记录的构建脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordBuildScriptRequest 请求对象
     * @return AsyncInvoker<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse>
     */
    public AsyncInvoker<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse> showBuildRecordBuildScriptAsyncInvoker(
        ShowBuildRecordBuildScriptRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showBuildRecordBuildScript, hcClient);
    }

    /**
     * 获取任务各阶段信息
     *
     * 获取任务各阶段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordFullStagesRequest 请求对象
     * @return CompletableFuture<ShowBuildRecordFullStagesResponse>
     */
    public CompletableFuture<ShowBuildRecordFullStagesResponse> showBuildRecordFullStagesAsync(
        ShowBuildRecordFullStagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showBuildRecordFullStages);
    }

    /**
     * 获取任务各阶段信息
     *
     * 获取任务各阶段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordFullStagesRequest 请求对象
     * @return AsyncInvoker<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse>
     */
    public AsyncInvoker<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse> showBuildRecordFullStagesAsyncInvoker(
        ShowBuildRecordFullStagesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showBuildRecordFullStages, hcClient);
    }

    /**
     * 获取构建历史详情信息接口
     *
     * 获取构建历史详情信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryDetailsRequest 请求对象
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
     * @param request ShowHistoryDetailsRequest 请求对象
     * @return AsyncInvoker<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse>
     */
    public AsyncInvoker<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> showHistoryDetailsAsyncInvoker(
        ShowHistoryDetailsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showHistoryDetails, hcClient);
    }

    /**
     * 获取镜像模板列表
     *
     * 获取镜像模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageTemplateListRequest 请求对象
     * @return CompletableFuture<ShowImageTemplateListResponse>
     */
    public CompletableFuture<ShowImageTemplateListResponse> showImageTemplateListAsync(
        ShowImageTemplateListRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showImageTemplateList);
    }

    /**
     * 获取镜像模板列表
     *
     * 获取镜像模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageTemplateListRequest 请求对象
     * @return AsyncInvoker<ShowImageTemplateListRequest, ShowImageTemplateListResponse>
     */
    public AsyncInvoker<ShowImageTemplateListRequest, ShowImageTemplateListResponse> showImageTemplateListAsyncInvoker(
        ShowImageTemplateListRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showImageTemplateList, hcClient);
    }

    /**
     * 查询构建成功率
     *
     * 查询构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildSuccessRatioRequest 请求对象
     * @return CompletableFuture<ShowJobBuildSuccessRatioResponse>
     */
    public CompletableFuture<ShowJobBuildSuccessRatioResponse> showJobBuildSuccessRatioAsync(
        ShowJobBuildSuccessRatioRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobBuildSuccessRatio);
    }

    /**
     * 查询构建成功率
     *
     * 查询构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildSuccessRatioRequest 请求对象
     * @return AsyncInvoker<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse>
     */
    public AsyncInvoker<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse> showJobBuildSuccessRatioAsyncInvoker(
        ShowJobBuildSuccessRatioRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobBuildSuccessRatio, hcClient);
    }

    /**
     * 洞察构建时长
     *
     * 洞察构建时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildTimeRequest 请求对象
     * @return CompletableFuture<ShowJobBuildTimeResponse>
     */
    public CompletableFuture<ShowJobBuildTimeResponse> showJobBuildTimeAsync(ShowJobBuildTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobBuildTime);
    }

    /**
     * 洞察构建时长
     *
     * 洞察构建时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildTimeRequest 请求对象
     * @return AsyncInvoker<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse>
     */
    public AsyncInvoker<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse> showJobBuildTimeAsyncInvoker(
        ShowJobBuildTimeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobBuildTime, hcClient);
    }

    /**
     * 获取构建任务详情
     *
     * 获取构建任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigRequest 请求对象
     * @return CompletableFuture<ShowJobConfigResponse>
     */
    public CompletableFuture<ShowJobConfigResponse> showJobConfigAsync(ShowJobConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobConfig);
    }

    /**
     * 获取构建任务详情
     *
     * 获取构建任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigRequest 请求对象
     * @return AsyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse>
     */
    public AsyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfigAsyncInvoker(
        ShowJobConfigRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobConfig, hcClient);
    }

    /**
     * 获取构建任务配置的对比差异
     *
     * 获取构建任务配置的对比差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigDiffRequest 请求对象
     * @return CompletableFuture<ShowJobConfigDiffResponse>
     */
    public CompletableFuture<ShowJobConfigDiffResponse> showJobConfigDiffAsync(ShowJobConfigDiffRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobConfigDiff);
    }

    /**
     * 获取构建任务配置的对比差异
     *
     * 获取构建任务配置的对比差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigDiffRequest 请求对象
     * @return AsyncInvoker<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse>
     */
    public AsyncInvoker<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse> showJobConfigDiffAsyncInvoker(
        ShowJobConfigDiffRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobConfigDiff, hcClient);
    }

    /**
     * 查看构建任务构建信息
     *
     * 查看构建任务构建信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return CompletableFuture<ShowJobInfoResponse>
     */
    public CompletableFuture<ShowJobInfoResponse> showJobInfoAsync(ShowJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobInfo);
    }

    /**
     * 查看构建任务构建信息
     *
     * 查看构建任务构建信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse>
     */
    public AsyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfoAsyncInvoker(ShowJobInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobInfo, hcClient);
    }

    /**
     * 查看项目下用户的构建任务列表
     *
     * 查看项目下用户的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobListByProjectIdRequest 请求对象
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
     * @param request ShowJobListByProjectIdRequest 请求对象
     * @return AsyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse>
     */
    public AsyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectIdAsyncInvoker(
        ShowJobListByProjectIdRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobListByProjectId, hcClient);
    }

    /**
     * 获取构建任务的角色权限矩阵信息
     *
     * 获取构建任务的角色权限矩阵信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRolePermissionRequest 请求对象
     * @return CompletableFuture<ShowJobRolePermissionResponse>
     */
    public CompletableFuture<ShowJobRolePermissionResponse> showJobRolePermissionAsync(
        ShowJobRolePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobRolePermission);
    }

    /**
     * 获取构建任务的角色权限矩阵信息
     *
     * 获取构建任务的角色权限矩阵信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRolePermissionRequest 请求对象
     * @return AsyncInvoker<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse>
     */
    public AsyncInvoker<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse> showJobRolePermissionAsyncInvoker(
        ShowJobRolePermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobRolePermission, hcClient);
    }

    /**
     * 查看任务运行状态
     *
     * 查看任务运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
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
     * @param request ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(
        ShowJobStatusRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobStatus, hcClient);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建成功率
     *
     * 根据开始时间和结束时间查看构建任务的构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobSuccessRatioRequest 请求对象
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
     * @param request ShowJobSuccessRatioRequest 请求对象
     * @return AsyncInvoker<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse>
     */
    public AsyncInvoker<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> showJobSuccessRatioAsyncInvoker(
        ShowJobSuccessRatioRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobSuccessRatio, hcClient);
    }

    /**
     * 查看系统预定义参数
     *
     * 查看系统预定义参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobSystemParametersRequest 请求对象
     * @return CompletableFuture<ShowJobSystemParametersResponse>
     */
    public CompletableFuture<ShowJobSystemParametersResponse> showJobSystemParametersAsync(
        ShowJobSystemParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobSystemParameters);
    }

    /**
     * 查看系统预定义参数
     *
     * 查看系统预定义参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobSystemParametersRequest 请求对象
     * @return AsyncInvoker<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse>
     */
    public AsyncInvoker<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse> showJobSystemParametersAsyncInvoker(
        ShowJobSystemParametersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobSystemParameters, hcClient);
    }

    /**
     * 查询指定代码仓库最近一次成功的构建历史
     *
     * 查询指定代码仓库最近一次成功的构建历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLastHistoryRequest 请求对象
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
     * @param request ShowLastHistoryRequest 请求对象
     * @return AsyncInvoker<ShowLastHistoryRequest, ShowLastHistoryResponse>
     */
    public AsyncInvoker<ShowLastHistoryRequest, ShowLastHistoryResponse> showLastHistoryAsyncInvoker(
        ShowLastHistoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showLastHistory, hcClient);
    }

    /**
     * 查看构建任务的构建历史列表
     *
     * 查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListHistoryRequest 请求对象
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
     * @param request ShowListHistoryRequest 请求对象
     * @return AsyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse>
     */
    public AsyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse> showListHistoryAsyncInvoker(
        ShowListHistoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showListHistory, hcClient);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListPeriodHistoryRequest 请求对象
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
     * @param request ShowListPeriodHistoryRequest 请求对象
     * @return AsyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse>
     */
    public AsyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistoryAsyncInvoker(
        ShowListPeriodHistoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showListPeriodHistory, hcClient);
    }

    /**
     * 获取构建产物详情信息
     *
     * 获取构建产物详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOutputInfoRequest 请求对象
     * @return CompletableFuture<ShowOutputInfoResponse>
     */
    public CompletableFuture<ShowOutputInfoResponse> showOutputInfoAsync(ShowOutputInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showOutputInfo);
    }

    /**
     * 获取构建产物详情信息
     *
     * 获取构建产物详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOutputInfoRequest 请求对象
     * @return AsyncInvoker<ShowOutputInfoRequest, ShowOutputInfoResponse>
     */
    public AsyncInvoker<ShowOutputInfoRequest, ShowOutputInfoResponse> showOutputInfoAsyncInvoker(
        ShowOutputInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showOutputInfo, hcClient);
    }

    /**
     * 获取用户权限
     *
     * 获取用户权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectPermissionRequest 请求对象
     * @return CompletableFuture<ShowProjectPermissionResponse>
     */
    public CompletableFuture<ShowProjectPermissionResponse> showProjectPermissionAsync(
        ShowProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showProjectPermission);
    }

    /**
     * 获取用户权限
     *
     * 获取用户权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectPermissionRequest 请求对象
     * @return AsyncInvoker<ShowProjectPermissionRequest, ShowProjectPermissionResponse>
     */
    public AsyncInvoker<ShowProjectPermissionRequest, ShowProjectPermissionResponse> showProjectPermissionAsyncInvoker(
        ShowProjectPermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showProjectPermission, hcClient);
    }

    /**
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordDetailRequest 请求对象
     * @return CompletableFuture<ShowRecordDetailResponse>
     */
    public CompletableFuture<ShowRecordDetailResponse> showRecordDetailAsync(ShowRecordDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showRecordDetail);
    }

    /**
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordDetailRequest 请求对象
     * @return AsyncInvoker<ShowRecordDetailRequest, ShowRecordDetailResponse>
     */
    public AsyncInvoker<ShowRecordDetailRequest, ShowRecordDetailResponse> showRecordDetailAsyncInvoker(
        ShowRecordDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showRecordDetail, hcClient);
    }

    /**
     * 获取覆盖率接口
     *
     * 获取覆盖率接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSummaryRequest 请求对象
     * @return CompletableFuture<ShowReportSummaryResponse>
     */
    public CompletableFuture<ShowReportSummaryResponse> showReportSummaryAsync(ShowReportSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showReportSummary);
    }

    /**
     * 获取覆盖率接口
     *
     * 获取覆盖率接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSummaryRequest 请求对象
     * @return AsyncInvoker<ShowReportSummaryRequest, ShowReportSummaryResponse>
     */
    public AsyncInvoker<ShowReportSummaryRequest, ShowReportSummaryResponse> showReportSummaryAsyncInvoker(
        ShowReportSummaryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showReportSummary, hcClient);
    }

    /**
     * 查看任务是否在构建
     *
     * 查看任务是否在构建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRunningStatusRequest 请求对象
     * @return CompletableFuture<ShowRunningStatusResponse>
     */
    public CompletableFuture<ShowRunningStatusResponse> showRunningStatusAsync(ShowRunningStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showRunningStatus);
    }

    /**
     * 查看任务是否在构建
     *
     * 查看任务是否在构建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRunningStatusRequest 请求对象
     * @return AsyncInvoker<ShowRunningStatusRequest, ShowRunningStatusResponse>
     */
    public AsyncInvoker<ShowRunningStatusRequest, ShowRunningStatusResponse> showRunningStatusAsyncInvoker(
        ShowRunningStatusRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showRunningStatus, hcClient);
    }

    /**
     * 获取代码化构建默认模板
     *
     * 获取代码化构建默认模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowYamlTemplateRequest 请求对象
     * @return CompletableFuture<ShowYamlTemplateResponse>
     */
    public CompletableFuture<ShowYamlTemplateResponse> showYamlTemplateAsync(ShowYamlTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showYamlTemplate);
    }

    /**
     * 获取代码化构建默认模板
     *
     * 获取代码化构建默认模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowYamlTemplateRequest 请求对象
     * @return AsyncInvoker<ShowYamlTemplateRequest, ShowYamlTemplateResponse>
     */
    public AsyncInvoker<ShowYamlTemplateRequest, ShowYamlTemplateResponse> showYamlTemplateAsyncInvoker(
        ShowYamlTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showYamlTemplate, hcClient);
    }

    /**
     * 停止构建任务
     *
     * 停止构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBuildJobRequest 请求对象
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
     * @param request StopBuildJobRequest 请求对象
     * @return AsyncInvoker<StopBuildJobRequest, StopBuildJobResponse>
     */
    public AsyncInvoker<StopBuildJobRequest, StopBuildJobResponse> stopBuildJobAsyncInvoker(
        StopBuildJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.stopBuildJob, hcClient);
    }

    /**
     * 更新构建任务
     *
     * 更新构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBuildJobRequest 请求对象
     * @return CompletableFuture<UpdateBuildJobResponse>
     */
    public CompletableFuture<UpdateBuildJobResponse> updateBuildJobAsync(UpdateBuildJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.updateBuildJob);
    }

    /**
     * 更新构建任务
     *
     * 更新构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBuildJobRequest 请求对象
     * @return AsyncInvoker<UpdateBuildJobRequest, UpdateBuildJobResponse>
     */
    public AsyncInvoker<UpdateBuildJobRequest, UpdateBuildJobResponse> updateBuildJobAsyncInvoker(
        UpdateBuildJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.updateBuildJob, hcClient);
    }

    /**
     * 更新通知
     *
     * 更新通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoticeRequest 请求对象
     * @return CompletableFuture<UpdateNoticeResponse>
     */
    public CompletableFuture<UpdateNoticeResponse> updateNoticeAsync(UpdateNoticeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.updateNotice);
    }

    /**
     * 更新通知
     *
     * 更新通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoticeRequest 请求对象
     * @return AsyncInvoker<UpdateNoticeRequest, UpdateNoticeResponse>
     */
    public AsyncInvoker<UpdateNoticeRequest, UpdateNoticeResponse> updateNoticeAsyncInvoker(
        UpdateNoticeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.updateNotice, hcClient);
    }

    /**
     * 下载构建日志(待下线)
     *
     * 下载构建日志(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadLogByRecordIdRequest 请求对象
     * @return CompletableFuture<DownloadLogByRecordIdResponse>
     */
    public CompletableFuture<DownloadLogByRecordIdResponse> downloadLogByRecordIdAsync(
        DownloadLogByRecordIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.downloadLogByRecordId);
    }

    /**
     * 下载构建日志(待下线)
     *
     * 下载构建日志(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadLogByRecordIdRequest 请求对象
     * @return AsyncInvoker<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse>
     */
    public AsyncInvoker<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> downloadLogByRecordIdAsyncInvoker(
        DownloadLogByRecordIdRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.downloadLogByRecordId, hcClient);
    }

    /**
     * 获取构建记录的有向无环图(待下线)
     *
     * 获取构建记录的有向无环图(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowGraphRequest 请求对象
     * @return CompletableFuture<ShowFlowGraphResponse>
     */
    public CompletableFuture<ShowFlowGraphResponse> showFlowGraphAsync(ShowFlowGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showFlowGraph);
    }

    /**
     * 获取构建记录的有向无环图(待下线)
     *
     * 获取构建记录的有向无环图(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowGraphRequest 请求对象
     * @return AsyncInvoker<ShowFlowGraphRequest, ShowFlowGraphResponse>
     */
    public AsyncInvoker<ShowFlowGraphRequest, ShowFlowGraphResponse> showFlowGraphAsyncInvoker(
        ShowFlowGraphRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showFlowGraph, hcClient);
    }

    /**
     * 获取构建记录信息(待下线)
     *
     * 获取构建记录信息(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordInfoRequest 请求对象
     * @return CompletableFuture<ShowRecordInfoResponse>
     */
    public CompletableFuture<ShowRecordInfoResponse> showRecordInfoAsync(ShowRecordInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showRecordInfo);
    }

    /**
     * 获取构建记录信息(待下线)
     *
     * 获取构建记录信息(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordInfoRequest 请求对象
     * @return AsyncInvoker<ShowRecordInfoRequest, ShowRecordInfoResponse>
     */
    public AsyncInvoker<ShowRecordInfoRequest, ShowRecordInfoResponse> showRecordInfoAsyncInvoker(
        ShowRecordInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showRecordInfo, hcClient);
    }

    /**
     * 停止构建任务(待下线)
     *
     * 停止构建任务(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return CompletableFuture<StopJobResponse>
     */
    public CompletableFuture<StopJobResponse> stopJobAsync(StopJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.stopJob);
    }

    /**
     * 停止构建任务(待下线)
     *
     * 停止构建任务(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return AsyncInvoker<StopJobRequest, StopJobResponse>
     */
    public AsyncInvoker<StopJobRequest, StopJobResponse> stopJobAsyncInvoker(StopJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.stopJob, hcClient);
    }

}
