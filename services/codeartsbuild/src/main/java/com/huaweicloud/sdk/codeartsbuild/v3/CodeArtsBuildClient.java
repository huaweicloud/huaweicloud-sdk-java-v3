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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFullStagesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFullStagesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildSuccessRatioRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildSuccessRatioResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowOutputInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowOutputInfoResponse;
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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsBuildClient {

    protected HcClient hcClient;

    public CodeArtsBuildClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsBuildClient> newBuilder() {
        ClientBuilder<CodeArtsBuildClient> clientBuilder = new ClientBuilder<>(CodeArtsBuildClient::new);
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
     * @return CreateBuildJobResponse
     */
    public CreateBuildJobResponse createBuildJob(CreateBuildJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.createBuildJob);
    }

    /**
     * 创建构建任务
     *
     * 创建构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBuildJobRequest 请求对象
     * @return SyncInvoker<CreateBuildJobRequest, CreateBuildJobResponse>
     */
    public SyncInvoker<CreateBuildJobRequest, CreateBuildJobResponse> createBuildJobInvoker(
        CreateBuildJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.createBuildJob, hcClient);
    }

    /**
     * 创建构建模板
     *
     * 创建构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplatesRequest 请求对象
     * @return CreateTemplatesResponse
     */
    public CreateTemplatesResponse createTemplates(CreateTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.createTemplates);
    }

    /**
     * 创建构建模板
     *
     * 创建构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplatesRequest 请求对象
     * @return SyncInvoker<CreateTemplatesRequest, CreateTemplatesResponse>
     */
    public SyncInvoker<CreateTemplatesRequest, CreateTemplatesResponse> createTemplatesInvoker(
        CreateTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.createTemplates, hcClient);
    }

    /**
     * 删除构建任务
     *
     * 删除构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBuildJobRequest 请求对象
     * @return DeleteBuildJobResponse
     */
    public DeleteBuildJobResponse deleteBuildJob(DeleteBuildJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.deleteBuildJob);
    }

    /**
     * 删除构建任务
     *
     * 删除构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBuildJobRequest 请求对象
     * @return SyncInvoker<DeleteBuildJobRequest, DeleteBuildJobResponse>
     */
    public SyncInvoker<DeleteBuildJobRequest, DeleteBuildJobResponse> deleteBuildJobInvoker(
        DeleteBuildJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.deleteBuildJob, hcClient);
    }

    /**
     * 删除构建模板
     *
     * 删除构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplatesRequest 请求对象
     * @return DeleteTemplatesResponse
     */
    public DeleteTemplatesResponse deleteTemplates(DeleteTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.deleteTemplates);
    }

    /**
     * 删除构建模板
     *
     * 删除构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplatesRequest 请求对象
     * @return SyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse>
     */
    public SyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplatesInvoker(
        DeleteTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.deleteTemplates, hcClient);
    }

    /**
     * 禁用构建任务
     *
     * 禁用构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableBuildJobRequest 请求对象
     * @return DisableBuildJobResponse
     */
    public DisableBuildJobResponse disableBuildJob(DisableBuildJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.disableBuildJob);
    }

    /**
     * 禁用构建任务
     *
     * 禁用构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableBuildJobRequest 请求对象
     * @return SyncInvoker<DisableBuildJobRequest, DisableBuildJobResponse>
     */
    public SyncInvoker<DisableBuildJobRequest, DisableBuildJobResponse> disableBuildJobInvoker(
        DisableBuildJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.disableBuildJob, hcClient);
    }

    /**
     * 取消通知
     *
     * 取消通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableNoticeRequest 请求对象
     * @return DisableNoticeResponse
     */
    public DisableNoticeResponse disableNotice(DisableNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.disableNotice);
    }

    /**
     * 取消通知
     *
     * 取消通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableNoticeRequest 请求对象
     * @return SyncInvoker<DisableNoticeRequest, DisableNoticeResponse>
     */
    public SyncInvoker<DisableNoticeRequest, DisableNoticeResponse> disableNoticeInvoker(DisableNoticeRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.disableNotice, hcClient);
    }

    /**
     * 下载全量构建日志
     *
     * 下载全量构建日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBuildLogRequest 请求对象
     * @return DownloadBuildLogResponse
     */
    public DownloadBuildLogResponse downloadBuildLog(DownloadBuildLogRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.downloadBuildLog);
    }

    /**
     * 下载全量构建日志
     *
     * 下载全量构建日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBuildLogRequest 请求对象
     * @return SyncInvoker<DownloadBuildLogRequest, DownloadBuildLogResponse>
     */
    public SyncInvoker<DownloadBuildLogRequest, DownloadBuildLogResponse> downloadBuildLogInvoker(
        DownloadBuildLogRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.downloadBuildLog, hcClient);
    }

    /**
     * KeyStore文件下载
     *
     * 下载指定租户下的KeyStore文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKeystoreRequest 请求对象
     * @return DownloadKeystoreResponse
     */
    public DownloadKeystoreResponse downloadKeystore(DownloadKeystoreRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.downloadKeystore);
    }

    /**
     * KeyStore文件下载
     *
     * 下载指定租户下的KeyStore文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKeystoreRequest 请求对象
     * @return SyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse>
     */
    public SyncInvoker<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystoreInvoker(
        DownloadKeystoreRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.downloadKeystore, hcClient);
    }

    /**
     * 下载构建实时日志
     *
     * 下载构建实时日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadRealTimeLogRequest 请求对象
     * @return DownloadRealTimeLogResponse
     */
    public DownloadRealTimeLogResponse downloadRealTimeLog(DownloadRealTimeLogRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.downloadRealTimeLog);
    }

    /**
     * 下载构建实时日志
     *
     * 下载构建实时日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadRealTimeLogRequest 请求对象
     * @return SyncInvoker<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse>
     */
    public SyncInvoker<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse> downloadRealTimeLogInvoker(
        DownloadRealTimeLogRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.downloadRealTimeLog, hcClient);
    }

    /**
     * 下载构建步骤日志
     *
     * 下载构建步骤日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadTaskLogRequest 请求对象
     * @return DownloadTaskLogResponse
     */
    public DownloadTaskLogResponse downloadTaskLog(DownloadTaskLogRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.downloadTaskLog);
    }

    /**
     * 下载构建步骤日志
     *
     * 下载构建步骤日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadTaskLogRequest 请求对象
     * @return SyncInvoker<DownloadTaskLogRequest, DownloadTaskLogResponse>
     */
    public SyncInvoker<DownloadTaskLogRequest, DownloadTaskLogResponse> downloadTaskLogInvoker(
        DownloadTaskLogRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.downloadTaskLog, hcClient);
    }

    /**
     * 恢复构建任务
     *
     * 恢复构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableBuildJobRequest 请求对象
     * @return EnableBuildJobResponse
     */
    public EnableBuildJobResponse enableBuildJob(EnableBuildJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.enableBuildJob);
    }

    /**
     * 恢复构建任务
     *
     * 恢复构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableBuildJobRequest 请求对象
     * @return SyncInvoker<EnableBuildJobRequest, EnableBuildJobResponse>
     */
    public SyncInvoker<EnableBuildJobRequest, EnableBuildJobResponse> enableBuildJobInvoker(
        EnableBuildJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.enableBuildJob, hcClient);
    }

    /**
     * 获取任务构建记录列表
     *
     * 获取任务构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildInfoRecordRequest 请求对象
     * @return ListBuildInfoRecordResponse
     */
    public ListBuildInfoRecordResponse listBuildInfoRecord(ListBuildInfoRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listBuildInfoRecord);
    }

    /**
     * 获取任务构建记录列表
     *
     * 获取任务构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildInfoRecordRequest 请求对象
     * @return SyncInvoker<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse>
     */
    public SyncInvoker<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse> listBuildInfoRecordInvoker(
        ListBuildInfoRecordRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listBuildInfoRecord, hcClient);
    }

    /**
     * 获取构建任务详情
     *
     * 获取构建任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobConfigRequest 请求对象
     * @return ListJobConfigResponse
     */
    public ListJobConfigResponse listJobConfig(ListJobConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listJobConfig);
    }

    /**
     * 获取构建任务详情
     *
     * 获取构建任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobConfigRequest 请求对象
     * @return SyncInvoker<ListJobConfigRequest, ListJobConfigResponse>
     */
    public SyncInvoker<ListJobConfigRequest, ListJobConfigResponse> listJobConfigInvoker(ListJobConfigRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listJobConfig, hcClient);
    }

    /**
     * 查询通知
     *
     * 查询通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeRequest 请求对象
     * @return ListNoticeResponse
     */
    public ListNoticeResponse listNotice(ListNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listNotice);
    }

    /**
     * 查询通知
     *
     * 查询通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeRequest 请求对象
     * @return SyncInvoker<ListNoticeRequest, ListNoticeResponse>
     */
    public SyncInvoker<ListNoticeRequest, ListNoticeResponse> listNoticeInvoker(ListNoticeRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listNotice, hcClient);
    }

    /**
     * 查询构建模板
     *
     * 查询构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listTemplates);
    }

    /**
     * 查询构建模板
     *
     * 查询构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listTemplates, hcClient);
    }

    /**
     * 执行构建任务
     *
     * 执行构建任务,可传自定义参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunJobRequest 请求对象
     * @return RunJobResponse
     */
    public RunJobResponse runJob(RunJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.runJob);
    }

    /**
     * 执行构建任务
     *
     * 执行构建任务,可传自定义参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunJobRequest 请求对象
     * @return SyncInvoker<RunJobRequest, RunJobResponse>
     */
    public SyncInvoker<RunJobRequest, RunJobResponse> runJobInvoker(RunJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.runJob, hcClient);
    }

    /**
     * 获取任务各阶段信息
     *
     * 获取任务各阶段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordFullStagesRequest 请求对象
     * @return ShowBuildRecordFullStagesResponse
     */
    public ShowBuildRecordFullStagesResponse showBuildRecordFullStages(ShowBuildRecordFullStagesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showBuildRecordFullStages);
    }

    /**
     * 获取任务各阶段信息
     *
     * 获取任务各阶段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordFullStagesRequest 请求对象
     * @return SyncInvoker<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse>
     */
    public SyncInvoker<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse> showBuildRecordFullStagesInvoker(
        ShowBuildRecordFullStagesRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showBuildRecordFullStages, hcClient);
    }

    /**
     * 获取构建历史详情信息接口
     *
     * 获取构建历史详情信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryDetailsRequest 请求对象
     * @return ShowHistoryDetailsResponse
     */
    public ShowHistoryDetailsResponse showHistoryDetails(ShowHistoryDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showHistoryDetails);
    }

    /**
     * 获取构建历史详情信息接口
     *
     * 获取构建历史详情信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryDetailsRequest 请求对象
     * @return SyncInvoker<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse>
     */
    public SyncInvoker<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> showHistoryDetailsInvoker(
        ShowHistoryDetailsRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showHistoryDetails, hcClient);
    }

    /**
     * 查询构建成功率
     *
     * 查询构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildSuccessRatioRequest 请求对象
     * @return ShowJobBuildSuccessRatioResponse
     */
    public ShowJobBuildSuccessRatioResponse showJobBuildSuccessRatio(ShowJobBuildSuccessRatioRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobBuildSuccessRatio);
    }

    /**
     * 查询构建成功率
     *
     * 查询构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildSuccessRatioRequest 请求对象
     * @return SyncInvoker<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse>
     */
    public SyncInvoker<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse> showJobBuildSuccessRatioInvoker(
        ShowJobBuildSuccessRatioRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobBuildSuccessRatio, hcClient);
    }

    /**
     * 查看项目下用户的构建任务列表
     *
     * 查看项目下用户的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobListByProjectIdRequest 请求对象
     * @return ShowJobListByProjectIdResponse
     */
    public ShowJobListByProjectIdResponse showJobListByProjectId(ShowJobListByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobListByProjectId);
    }

    /**
     * 查看项目下用户的构建任务列表
     *
     * 查看项目下用户的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobListByProjectIdRequest 请求对象
     * @return SyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse>
     */
    public SyncInvoker<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectIdInvoker(
        ShowJobListByProjectIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobListByProjectId, hcClient);
    }

    /**
     * 查看任务运行状态
     *
     * 查看任务运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return ShowJobStatusResponse
     */
    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobStatus);
    }

    /**
     * 查看任务运行状态
     *
     * 查看任务运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusInvoker(ShowJobStatusRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobStatus, hcClient);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建成功率
     *
     * 根据开始时间和结束时间查看构建任务的构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobSuccessRatioRequest 请求对象
     * @return ShowJobSuccessRatioResponse
     */
    public ShowJobSuccessRatioResponse showJobSuccessRatio(ShowJobSuccessRatioRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobSuccessRatio);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建成功率
     *
     * 根据开始时间和结束时间查看构建任务的构建成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobSuccessRatioRequest 请求对象
     * @return SyncInvoker<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse>
     */
    public SyncInvoker<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> showJobSuccessRatioInvoker(
        ShowJobSuccessRatioRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobSuccessRatio, hcClient);
    }

    /**
     * 查询指定代码仓库最近一次成功的构建历史
     *
     * 查询指定代码仓库最近一次成功的构建历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLastHistoryRequest 请求对象
     * @return ShowLastHistoryResponse
     */
    public ShowLastHistoryResponse showLastHistory(ShowLastHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showLastHistory);
    }

    /**
     * 查询指定代码仓库最近一次成功的构建历史
     *
     * 查询指定代码仓库最近一次成功的构建历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLastHistoryRequest 请求对象
     * @return SyncInvoker<ShowLastHistoryRequest, ShowLastHistoryResponse>
     */
    public SyncInvoker<ShowLastHistoryRequest, ShowLastHistoryResponse> showLastHistoryInvoker(
        ShowLastHistoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showLastHistory, hcClient);
    }

    /**
     * 查看构建任务的构建历史列表
     *
     * 查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListHistoryRequest 请求对象
     * @return ShowListHistoryResponse
     */
    public ShowListHistoryResponse showListHistory(ShowListHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showListHistory);
    }

    /**
     * 查看构建任务的构建历史列表
     *
     * 查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListHistoryRequest 请求对象
     * @return SyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse>
     */
    public SyncInvoker<ShowListHistoryRequest, ShowListHistoryResponse> showListHistoryInvoker(
        ShowListHistoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showListHistory, hcClient);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListPeriodHistoryRequest 请求对象
     * @return ShowListPeriodHistoryResponse
     */
    public ShowListPeriodHistoryResponse showListPeriodHistory(ShowListPeriodHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showListPeriodHistory);
    }

    /**
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     *
     * 根据开始时间和结束时间查看构建任务的构建历史列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListPeriodHistoryRequest 请求对象
     * @return SyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse>
     */
    public SyncInvoker<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistoryInvoker(
        ShowListPeriodHistoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showListPeriodHistory, hcClient);
    }

    /**
     * 获取构建产物详情信息
     *
     * 获取构建产物详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOutputInfoRequest 请求对象
     * @return ShowOutputInfoResponse
     */
    public ShowOutputInfoResponse showOutputInfo(ShowOutputInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showOutputInfo);
    }

    /**
     * 获取构建产物详情信息
     *
     * 获取构建产物详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOutputInfoRequest 请求对象
     * @return SyncInvoker<ShowOutputInfoRequest, ShowOutputInfoResponse>
     */
    public SyncInvoker<ShowOutputInfoRequest, ShowOutputInfoResponse> showOutputInfoInvoker(
        ShowOutputInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showOutputInfo, hcClient);
    }

    /**
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordDetailRequest 请求对象
     * @return ShowRecordDetailResponse
     */
    public ShowRecordDetailResponse showRecordDetail(ShowRecordDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showRecordDetail);
    }

    /**
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordDetailRequest 请求对象
     * @return SyncInvoker<ShowRecordDetailRequest, ShowRecordDetailResponse>
     */
    public SyncInvoker<ShowRecordDetailRequest, ShowRecordDetailResponse> showRecordDetailInvoker(
        ShowRecordDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showRecordDetail, hcClient);
    }

    /**
     * 获取覆盖率接口
     *
     * 获取覆盖率接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSummaryRequest 请求对象
     * @return ShowReportSummaryResponse
     */
    public ShowReportSummaryResponse showReportSummary(ShowReportSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showReportSummary);
    }

    /**
     * 获取覆盖率接口
     *
     * 获取覆盖率接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportSummaryRequest 请求对象
     * @return SyncInvoker<ShowReportSummaryRequest, ShowReportSummaryResponse>
     */
    public SyncInvoker<ShowReportSummaryRequest, ShowReportSummaryResponse> showReportSummaryInvoker(
        ShowReportSummaryRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showReportSummary, hcClient);
    }

    /**
     * 查看任务是否在构建
     *
     * 查看任务是否在构建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRunningStatusRequest 请求对象
     * @return ShowRunningStatusResponse
     */
    public ShowRunningStatusResponse showRunningStatus(ShowRunningStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showRunningStatus);
    }

    /**
     * 查看任务是否在构建
     *
     * 查看任务是否在构建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRunningStatusRequest 请求对象
     * @return SyncInvoker<ShowRunningStatusRequest, ShowRunningStatusResponse>
     */
    public SyncInvoker<ShowRunningStatusRequest, ShowRunningStatusResponse> showRunningStatusInvoker(
        ShowRunningStatusRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showRunningStatus, hcClient);
    }

    /**
     * 获取代码化构建默认模板
     *
     * 获取代码化构建默认模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowYamlTemplateRequest 请求对象
     * @return ShowYamlTemplateResponse
     */
    public ShowYamlTemplateResponse showYamlTemplate(ShowYamlTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showYamlTemplate);
    }

    /**
     * 获取代码化构建默认模板
     *
     * 获取代码化构建默认模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowYamlTemplateRequest 请求对象
     * @return SyncInvoker<ShowYamlTemplateRequest, ShowYamlTemplateResponse>
     */
    public SyncInvoker<ShowYamlTemplateRequest, ShowYamlTemplateResponse> showYamlTemplateInvoker(
        ShowYamlTemplateRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showYamlTemplate, hcClient);
    }

    /**
     * 停止构建任务
     *
     * 停止构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBuildJobRequest 请求对象
     * @return StopBuildJobResponse
     */
    public StopBuildJobResponse stopBuildJob(StopBuildJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.stopBuildJob);
    }

    /**
     * 停止构建任务
     *
     * 停止构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBuildJobRequest 请求对象
     * @return SyncInvoker<StopBuildJobRequest, StopBuildJobResponse>
     */
    public SyncInvoker<StopBuildJobRequest, StopBuildJobResponse> stopBuildJobInvoker(StopBuildJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.stopBuildJob, hcClient);
    }

    /**
     * 更新构建任务
     *
     * 更新构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBuildJobRequest 请求对象
     * @return UpdateBuildJobResponse
     */
    public UpdateBuildJobResponse updateBuildJob(UpdateBuildJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.updateBuildJob);
    }

    /**
     * 更新构建任务
     *
     * 更新构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBuildJobRequest 请求对象
     * @return SyncInvoker<UpdateBuildJobRequest, UpdateBuildJobResponse>
     */
    public SyncInvoker<UpdateBuildJobRequest, UpdateBuildJobResponse> updateBuildJobInvoker(
        UpdateBuildJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.updateBuildJob, hcClient);
    }

    /**
     * 更新通知
     *
     * 更新通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoticeRequest 请求对象
     * @return UpdateNoticeResponse
     */
    public UpdateNoticeResponse updateNotice(UpdateNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.updateNotice);
    }

    /**
     * 更新通知
     *
     * 更新通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoticeRequest 请求对象
     * @return SyncInvoker<UpdateNoticeRequest, UpdateNoticeResponse>
     */
    public SyncInvoker<UpdateNoticeRequest, UpdateNoticeResponse> updateNoticeInvoker(UpdateNoticeRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.updateNotice, hcClient);
    }

    /**
     * 下载构建日志(待下线)
     *
     * 下载构建日志(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadLogByRecordIdRequest 请求对象
     * @return DownloadLogByRecordIdResponse
     */
    public DownloadLogByRecordIdResponse downloadLogByRecordId(DownloadLogByRecordIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.downloadLogByRecordId);
    }

    /**
     * 下载构建日志(待下线)
     *
     * 下载构建日志(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadLogByRecordIdRequest 请求对象
     * @return SyncInvoker<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse>
     */
    public SyncInvoker<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> downloadLogByRecordIdInvoker(
        DownloadLogByRecordIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.downloadLogByRecordId, hcClient);
    }

    /**
     * 获取构建记录的有向无环图(待下线)
     *
     * 获取构建记录的有向无环图(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowGraphRequest 请求对象
     * @return ShowFlowGraphResponse
     */
    public ShowFlowGraphResponse showFlowGraph(ShowFlowGraphRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showFlowGraph);
    }

    /**
     * 获取构建记录的有向无环图(待下线)
     *
     * 获取构建记录的有向无环图(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowGraphRequest 请求对象
     * @return SyncInvoker<ShowFlowGraphRequest, ShowFlowGraphResponse>
     */
    public SyncInvoker<ShowFlowGraphRequest, ShowFlowGraphResponse> showFlowGraphInvoker(ShowFlowGraphRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showFlowGraph, hcClient);
    }

    /**
     * 获取构建记录信息(待下线)
     *
     * 获取构建记录信息(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordInfoRequest 请求对象
     * @return ShowRecordInfoResponse
     */
    public ShowRecordInfoResponse showRecordInfo(ShowRecordInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showRecordInfo);
    }

    /**
     * 获取构建记录信息(待下线)
     *
     * 获取构建记录信息(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordInfoRequest 请求对象
     * @return SyncInvoker<ShowRecordInfoRequest, ShowRecordInfoResponse>
     */
    public SyncInvoker<ShowRecordInfoRequest, ShowRecordInfoResponse> showRecordInfoInvoker(
        ShowRecordInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showRecordInfo, hcClient);
    }

    /**
     * 停止构建任务(待下线)
     *
     * 停止构建任务(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(StopJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.stopJob);
    }

    /**
     * 停止构建任务(待下线)
     *
     * 停止构建任务(待下线)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return SyncInvoker<StopJobRequest, StopJobResponse>
     */
    public SyncInvoker<StopJobRequest, StopJobResponse> stopJobInvoker(StopJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.stopJob, hcClient);
    }

}
