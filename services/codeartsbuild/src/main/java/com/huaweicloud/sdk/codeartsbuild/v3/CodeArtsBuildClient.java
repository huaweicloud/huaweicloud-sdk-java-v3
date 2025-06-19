package com.huaweicloud.sdk.codeartsbuild.v3;

import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobCountIsTopLimitRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobCountIsTopLimitResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobNameIsExistsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobNameIsExistsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckWebhookUrlRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckWebhookUrlResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ClearRecyclingJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ClearRecyclingJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CopyJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CopyJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteKeystorePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteKeystorePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteRecyclingJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteRecyclingJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTheJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTheJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableTheJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableTheJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadJunitCoverageZipRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadJunitCoverageZipResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreByNameRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreByNameResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ExecuteJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ExecuteJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBriefRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBriefRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordByJobIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordByJobIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildParameterRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildParameterResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListCustomTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListCustomTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJunitCoverageSummaryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJunitCoverageSummaryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListKeystoreSearchRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListKeystoreSearchResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListOfficialTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListOfficialTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListProjectJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListProjectJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecommendOfficialTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecommendOfficialTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecordsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecordsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecyclingJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecyclingJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRelatedProjectInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRelatedProjectInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRepoBranchRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRepoBranchResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRepositoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRepositoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListUpdateJobHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListUpdateJobHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RestoreRecyclingJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RestoreRecyclingJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SetKeepTimeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SetKeepTimeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildInfoRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildInfoRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildParamsListRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildParamsListResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordBuildScriptRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordBuildScriptResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFlowGraphRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFlowGraphResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFullStagesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFullStagesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowCopyNameRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowCopyNameResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDefaultBuildParametersRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDefaultBuildParametersResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDefaultProjectPermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDefaultProjectPermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDisableRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDisableResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDockerfileTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDockerfileTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowImageTemplateListRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowImageTemplateListResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildRecordDetailRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildRecordDetailResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobNoticeConfigInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobNoticeConfigInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobRolePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobRolePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStepStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStepStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSystemParametersRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSystemParametersResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobTotalRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobTotalResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowKeystorePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowKeystorePermissionResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRelatedProjectRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRelatedProjectResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowReportSummaryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowReportSummaryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRunningStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRunningStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowSummaryBuildJobInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowSummaryBuildJobInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowUserOverPackageQuotaRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowUserOverPackageQuotaResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowYamlTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowYamlTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewJobResponse;
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
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelatedProjectInfoRequest 请求对象
     * @return ListRelatedProjectInfoResponse
     */
    public ListRelatedProjectInfoResponse listRelatedProjectInfo(ListRelatedProjectInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listRelatedProjectInfo);
    }

    /**
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelatedProjectInfoRequest 请求对象
     * @return SyncInvoker<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse>
     */
    public SyncInvoker<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse> listRelatedProjectInfoInvoker(
        ListRelatedProjectInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listRelatedProjectInfo, hcClient);
    }

    /**
     * 获取用户权限
     *
     * 获取用户权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectPermissionRequest 请求对象
     * @return ShowProjectPermissionResponse
     */
    public ShowProjectPermissionResponse showProjectPermission(ShowProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showProjectPermission);
    }

    /**
     * 获取用户权限
     *
     * 获取用户权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectPermissionRequest 请求对象
     * @return SyncInvoker<ShowProjectPermissionRequest, ShowProjectPermissionResponse>
     */
    public SyncInvoker<ShowProjectPermissionRequest, ShowProjectPermissionResponse> showProjectPermissionInvoker(
        ShowProjectPermissionRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showProjectPermission, hcClient);
    }

    /**
     * 获取当前用户的项目信息列表
     *
     * 获取当前用户的项目信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelatedProjectRequest 请求对象
     * @return ShowRelatedProjectResponse
     */
    public ShowRelatedProjectResponse showRelatedProject(ShowRelatedProjectRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showRelatedProject);
    }

    /**
     * 获取当前用户的项目信息列表
     *
     * 获取当前用户的项目信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelatedProjectRequest 请求对象
     * @return SyncInvoker<ShowRelatedProjectRequest, ShowRelatedProjectResponse>
     */
    public SyncInvoker<ShowRelatedProjectRequest, ShowRelatedProjectResponse> showRelatedProjectInvoker(
        ShowRelatedProjectRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showRelatedProject, hcClient);
    }

    /**
     * 获取租户任务总数和成功率接口
     *
     * 获取租户任务总数和成功率接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSummaryBuildJobInfoRequest 请求对象
     * @return ShowSummaryBuildJobInfoResponse
     */
    public ShowSummaryBuildJobInfoResponse showSummaryBuildJobInfo(ShowSummaryBuildJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showSummaryBuildJobInfo);
    }

    /**
     * 获取租户任务总数和成功率接口
     *
     * 获取租户任务总数和成功率接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSummaryBuildJobInfoRequest 请求对象
     * @return SyncInvoker<ShowSummaryBuildJobInfoRequest, ShowSummaryBuildJobInfoResponse>
     */
    public SyncInvoker<ShowSummaryBuildJobInfoRequest, ShowSummaryBuildJobInfoResponse> showSummaryBuildJobInfoInvoker(
        ShowSummaryBuildJobInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showSummaryBuildJobInfo, hcClient);
    }

    /**
     * 当前用户所在项目所属租户的包周期每月时长是否超额
     *
     * 当前用户所在项目所属租户的包周期每月时长是否超额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserOverPackageQuotaRequest 请求对象
     * @return ShowUserOverPackageQuotaResponse
     */
    public ShowUserOverPackageQuotaResponse showUserOverPackageQuota(ShowUserOverPackageQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showUserOverPackageQuota);
    }

    /**
     * 当前用户所在项目所属租户的包周期每月时长是否超额
     *
     * 当前用户所在项目所属租户的包周期每月时长是否超额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserOverPackageQuotaRequest 请求对象
     * @return SyncInvoker<ShowUserOverPackageQuotaRequest, ShowUserOverPackageQuotaResponse>
     */
    public SyncInvoker<ShowUserOverPackageQuotaRequest, ShowUserOverPackageQuotaResponse> showUserOverPackageQuotaInvoker(
        ShowUserOverPackageQuotaRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showUserOverPackageQuota, hcClient);
    }

    /**
     * 获取dockerfileTemplate
     *
     * 获取dockerfileTemplate
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockerfileTemplateRequest 请求对象
     * @return ShowDockerfileTemplateResponse
     */
    public ShowDockerfileTemplateResponse showDockerfileTemplate(ShowDockerfileTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showDockerfileTemplate);
    }

    /**
     * 获取dockerfileTemplate
     *
     * 获取dockerfileTemplate
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockerfileTemplateRequest 请求对象
     * @return SyncInvoker<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse>
     */
    public SyncInvoker<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse> showDockerfileTemplateInvoker(
        ShowDockerfileTemplateRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showDockerfileTemplate, hcClient);
    }

    /**
     * 获取镜像模板列表
     *
     * 获取镜像模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageTemplateListRequest 请求对象
     * @return ShowImageTemplateListResponse
     */
    public ShowImageTemplateListResponse showImageTemplateList(ShowImageTemplateListRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showImageTemplateList);
    }

    /**
     * 获取镜像模板列表
     *
     * 获取镜像模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageTemplateListRequest 请求对象
     * @return SyncInvoker<ShowImageTemplateListRequest, ShowImageTemplateListResponse>
     */
    public SyncInvoker<ShowImageTemplateListRequest, ShowImageTemplateListResponse> showImageTemplateListInvoker(
        ShowImageTemplateListRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showImageTemplateList, hcClient);
    }

    /**
     * 检查任务数量是否上限
     *
     * 检查任务数量是否上限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobCountIsTopLimitRequest 请求对象
     * @return CheckJobCountIsTopLimitResponse
     */
    public CheckJobCountIsTopLimitResponse checkJobCountIsTopLimit(CheckJobCountIsTopLimitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.checkJobCountIsTopLimit);
    }

    /**
     * 检查任务数量是否上限
     *
     * 检查任务数量是否上限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobCountIsTopLimitRequest 请求对象
     * @return SyncInvoker<CheckJobCountIsTopLimitRequest, CheckJobCountIsTopLimitResponse>
     */
    public SyncInvoker<CheckJobCountIsTopLimitRequest, CheckJobCountIsTopLimitResponse> checkJobCountIsTopLimitInvoker(
        CheckJobCountIsTopLimitRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.checkJobCountIsTopLimit, hcClient);
    }

    /**
     * 查看项目下任务名是否存在
     *
     * 查看项目下任务名是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobNameIsExistsRequest 请求对象
     * @return CheckJobNameIsExistsResponse
     */
    public CheckJobNameIsExistsResponse checkJobNameIsExists(CheckJobNameIsExistsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.checkJobNameIsExists);
    }

    /**
     * 查看项目下任务名是否存在
     *
     * 查看项目下任务名是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobNameIsExistsRequest 请求对象
     * @return SyncInvoker<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse>
     */
    public SyncInvoker<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse> checkJobNameIsExistsInvoker(
        CheckJobNameIsExistsRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.checkJobNameIsExists, hcClient);
    }

    /**
     * 检查webhook地址参数
     *
     * 检查webhook地址参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWebhookUrlRequest 请求对象
     * @return CheckWebhookUrlResponse
     */
    public CheckWebhookUrlResponse checkWebhookUrl(CheckWebhookUrlRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.checkWebhookUrl);
    }

    /**
     * 检查webhook地址参数
     *
     * 检查webhook地址参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWebhookUrlRequest 请求对象
     * @return SyncInvoker<CheckWebhookUrlRequest, CheckWebhookUrlResponse>
     */
    public SyncInvoker<CheckWebhookUrlRequest, CheckWebhookUrlResponse> checkWebhookUrlInvoker(
        CheckWebhookUrlRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.checkWebhookUrl, hcClient);
    }

    /**
     * 清空回收站中的任务
     *
     * 清空回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearRecyclingJobsRequest 请求对象
     * @return ClearRecyclingJobsResponse
     */
    public ClearRecyclingJobsResponse clearRecyclingJobs(ClearRecyclingJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.clearRecyclingJobs);
    }

    /**
     * 清空回收站中的任务
     *
     * 清空回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearRecyclingJobsRequest 请求对象
     * @return SyncInvoker<ClearRecyclingJobsRequest, ClearRecyclingJobsResponse>
     */
    public SyncInvoker<ClearRecyclingJobsRequest, ClearRecyclingJobsResponse> clearRecyclingJobsInvoker(
        ClearRecyclingJobsRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.clearRecyclingJobs, hcClient);
    }

    /**
     * 复制构建任务
     *
     * 复制构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyJobRequest 请求对象
     * @return CopyJobResponse
     */
    public CopyJobResponse copyJob(CopyJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.copyJob);
    }

    /**
     * 复制构建任务
     *
     * 复制构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyJobRequest 请求对象
     * @return SyncInvoker<CopyJobRequest, CopyJobResponse>
     */
    public SyncInvoker<CopyJobRequest, CopyJobResponse> copyJobInvoker(CopyJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.copyJob, hcClient);
    }

    /**
     * 删除回收站中的任务
     *
     * 删除回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecyclingJobsRequest 请求对象
     * @return DeleteRecyclingJobsResponse
     */
    public DeleteRecyclingJobsResponse deleteRecyclingJobs(DeleteRecyclingJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.deleteRecyclingJobs);
    }

    /**
     * 删除回收站中的任务
     *
     * 删除回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecyclingJobsRequest 请求对象
     * @return SyncInvoker<DeleteRecyclingJobsRequest, DeleteRecyclingJobsResponse>
     */
    public SyncInvoker<DeleteRecyclingJobsRequest, DeleteRecyclingJobsResponse> deleteRecyclingJobsInvoker(
        DeleteRecyclingJobsRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.deleteRecyclingJobs, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTheJobRequest 请求对象
     * @return DeleteTheJobResponse
     */
    public DeleteTheJobResponse deleteTheJob(DeleteTheJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.deleteTheJob);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTheJobRequest 请求对象
     * @return SyncInvoker<DeleteTheJobRequest, DeleteTheJobResponse>
     */
    public SyncInvoker<DeleteTheJobRequest, DeleteTheJobResponse> deleteTheJobInvoker(DeleteTheJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.deleteTheJob, hcClient);
    }

    /**
     * 禁用任务
     *
     * 禁用任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableTheJobRequest 请求对象
     * @return DisableTheJobResponse
     */
    public DisableTheJobResponse disableTheJob(DisableTheJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.disableTheJob);
    }

    /**
     * 禁用任务
     *
     * 禁用任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableTheJobRequest 请求对象
     * @return SyncInvoker<DisableTheJobRequest, DisableTheJobResponse>
     */
    public SyncInvoker<DisableTheJobRequest, DisableTheJobResponse> disableTheJobInvoker(DisableTheJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.disableTheJob, hcClient);
    }

    /**
     * 执行构建
     *
     * 执行构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return ExecuteJobResponse
     */
    public ExecuteJobResponse executeJob(ExecuteJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.executeJob);
    }

    /**
     * 执行构建
     *
     * 执行构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return SyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public SyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobInvoker(ExecuteJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.executeJob, hcClient);
    }

    /**
     * 详情页获取构建参数
     *
     * 详情页获取构建参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildParameterRequest 请求对象
     * @return ListBuildParameterResponse
     */
    public ListBuildParameterResponse listBuildParameter(ListBuildParameterRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listBuildParameter);
    }

    /**
     * 详情页获取构建参数
     *
     * 详情页获取构建参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildParameterRequest 请求对象
     * @return SyncInvoker<ListBuildParameterRequest, ListBuildParameterResponse>
     */
    public SyncInvoker<ListBuildParameterRequest, ListBuildParameterResponse> listBuildParameterInvoker(
        ListBuildParameterRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listBuildParameter, hcClient);
    }

    /**
     * 查看用户全部的构建任务列表
     *
     * 查看用户全部的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return ListJobResponse
     */
    public ListJobResponse listJob(ListJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listJob);
    }

    /**
     * 查看用户全部的构建任务列表
     *
     * 查看用户全部的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return SyncInvoker<ListJobRequest, ListJobResponse>
     */
    public SyncInvoker<ListJobRequest, ListJobResponse> listJobInvoker(ListJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listJob, hcClient);
    }

    /**
     * 查询项目任务列表
     *
     * 查询项目任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectJobsRequest 请求对象
     * @return ListProjectJobsResponse
     */
    public ListProjectJobsResponse listProjectJobs(ListProjectJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listProjectJobs);
    }

    /**
     * 查询项目任务列表
     *
     * 查询项目任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectJobsRequest 请求对象
     * @return SyncInvoker<ListProjectJobsRequest, ListProjectJobsResponse>
     */
    public SyncInvoker<ListProjectJobsRequest, ListProjectJobsResponse> listProjectJobsInvoker(
        ListProjectJobsRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listProjectJobs, hcClient);
    }

    /**
     * 查看回收站中删除的构建任务列表
     *
     * 查看回收站中删除的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecyclingJobRequest 请求对象
     * @return ListRecyclingJobResponse
     */
    public ListRecyclingJobResponse listRecyclingJob(ListRecyclingJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listRecyclingJob);
    }

    /**
     * 查看回收站中删除的构建任务列表
     *
     * 查看回收站中删除的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecyclingJobRequest 请求对象
     * @return SyncInvoker<ListRecyclingJobRequest, ListRecyclingJobResponse>
     */
    public SyncInvoker<ListRecyclingJobRequest, ListRecyclingJobResponse> listRecyclingJobInvoker(
        ListRecyclingJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listRecyclingJob, hcClient);
    }

    /**
     * 获取修改历史
     *
     * 获取修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdateJobHistoryRequest 请求对象
     * @return ListUpdateJobHistoryResponse
     */
    public ListUpdateJobHistoryResponse listUpdateJobHistory(ListUpdateJobHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listUpdateJobHistory);
    }

    /**
     * 获取修改历史
     *
     * 获取修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdateJobHistoryRequest 请求对象
     * @return SyncInvoker<ListUpdateJobHistoryRequest, ListUpdateJobHistoryResponse>
     */
    public SyncInvoker<ListUpdateJobHistoryRequest, ListUpdateJobHistoryResponse> listUpdateJobHistoryInvoker(
        ListUpdateJobHistoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listUpdateJobHistory, hcClient);
    }

    /**
     * 恢复回收站中的任务
     *
     * 恢复回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRecyclingJobsRequest 请求对象
     * @return RestoreRecyclingJobsResponse
     */
    public RestoreRecyclingJobsResponse restoreRecyclingJobs(RestoreRecyclingJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.restoreRecyclingJobs);
    }

    /**
     * 恢复回收站中的任务
     *
     * 恢复回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRecyclingJobsRequest 请求对象
     * @return SyncInvoker<RestoreRecyclingJobsRequest, RestoreRecyclingJobsResponse>
     */
    public SyncInvoker<RestoreRecyclingJobsRequest, RestoreRecyclingJobsResponse> restoreRecyclingJobsInvoker(
        RestoreRecyclingJobsRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.restoreRecyclingJobs, hcClient);
    }

    /**
     * 设置回收站中的任务保留时间
     *
     * 设置回收站中的任务保留时间,该接口需要租户账号才能访问，租户子账号无权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKeepTimeRequest 请求对象
     * @return SetKeepTimeResponse
     */
    public SetKeepTimeResponse setKeepTime(SetKeepTimeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.setKeepTime);
    }

    /**
     * 设置回收站中的任务保留时间
     *
     * 设置回收站中的任务保留时间,该接口需要租户账号才能访问，租户子账号无权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKeepTimeRequest 请求对象
     * @return SyncInvoker<SetKeepTimeRequest, SetKeepTimeResponse>
     */
    public SyncInvoker<SetKeepTimeRequest, SetKeepTimeResponse> setKeepTimeInvoker(SetKeepTimeRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.setKeepTime, hcClient);
    }

    /**
     * 编辑页获取参数类型的接口
     *
     * 编辑页获取参数类型的接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildParamsListRequest 请求对象
     * @return ShowBuildParamsListResponse
     */
    public ShowBuildParamsListResponse showBuildParamsList(ShowBuildParamsListRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showBuildParamsList);
    }

    /**
     * 编辑页获取参数类型的接口
     *
     * 编辑页获取参数类型的接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildParamsListRequest 请求对象
     * @return SyncInvoker<ShowBuildParamsListRequest, ShowBuildParamsListResponse>
     */
    public SyncInvoker<ShowBuildParamsListRequest, ShowBuildParamsListResponse> showBuildParamsListInvoker(
        ShowBuildParamsListRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showBuildParamsList, hcClient);
    }

    /**
     * 复制任务名
     *
     * 复制任务名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCopyNameRequest 请求对象
     * @return ShowCopyNameResponse
     */
    public ShowCopyNameResponse showCopyName(ShowCopyNameRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showCopyName);
    }

    /**
     * 复制任务名
     *
     * 复制任务名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCopyNameRequest 请求对象
     * @return SyncInvoker<ShowCopyNameRequest, ShowCopyNameResponse>
     */
    public SyncInvoker<ShowCopyNameRequest, ShowCopyNameResponse> showCopyNameInvoker(ShowCopyNameRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showCopyName, hcClient);
    }

    /**
     * 获取编译构建默认参数
     *
     * 获取编译构建默认参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultBuildParametersRequest 请求对象
     * @return ShowDefaultBuildParametersResponse
     */
    public ShowDefaultBuildParametersResponse showDefaultBuildParameters(ShowDefaultBuildParametersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showDefaultBuildParameters);
    }

    /**
     * 获取编译构建默认参数
     *
     * 获取编译构建默认参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultBuildParametersRequest 请求对象
     * @return SyncInvoker<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse>
     */
    public SyncInvoker<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse> showDefaultBuildParametersInvoker(
        ShowDefaultBuildParametersRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showDefaultBuildParameters, hcClient);
    }

    /**
     * 获取当前项目默认角色权限矩阵信息
     *
     * 获取当前项目默认角色权限矩阵信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultProjectPermissionRequest 请求对象
     * @return ShowDefaultProjectPermissionResponse
     */
    public ShowDefaultProjectPermissionResponse showDefaultProjectPermission(
        ShowDefaultProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showDefaultProjectPermission);
    }

    /**
     * 获取当前项目默认角色权限矩阵信息
     *
     * 获取当前项目默认角色权限矩阵信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultProjectPermissionRequest 请求对象
     * @return SyncInvoker<ShowDefaultProjectPermissionRequest, ShowDefaultProjectPermissionResponse>
     */
    public SyncInvoker<ShowDefaultProjectPermissionRequest, ShowDefaultProjectPermissionResponse> showDefaultProjectPermissionInvoker(
        ShowDefaultProjectPermissionRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showDefaultProjectPermission, hcClient);
    }

    /**
     * 查询任务是否已禁用
     *
     * 查询任务是否已禁用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisableRequest 请求对象
     * @return ShowDisableResponse
     */
    public ShowDisableResponse showDisable(ShowDisableRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showDisable);
    }

    /**
     * 查询任务是否已禁用
     *
     * 查询任务是否已禁用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisableRequest 请求对象
     * @return SyncInvoker<ShowDisableRequest, ShowDisableResponse>
     */
    public SyncInvoker<ShowDisableRequest, ShowDisableResponse> showDisableInvoker(ShowDisableRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showDisable, hcClient);
    }

    /**
     * 获取构建任务详情
     *
     * 获取构建任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigRequest 请求对象
     * @return ShowJobConfigResponse
     */
    public ShowJobConfigResponse showJobConfig(ShowJobConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobConfig);
    }

    /**
     * 获取构建任务详情
     *
     * 获取构建任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigRequest 请求对象
     * @return SyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse>
     */
    public SyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfigInvoker(ShowJobConfigRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobConfig, hcClient);
    }

    /**
     * 获取构建任务配置的对比差异
     *
     * 获取构建任务配置的对比差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigDiffRequest 请求对象
     * @return ShowJobConfigDiffResponse
     */
    public ShowJobConfigDiffResponse showJobConfigDiff(ShowJobConfigDiffRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobConfigDiff);
    }

    /**
     * 获取构建任务配置的对比差异
     *
     * 获取构建任务配置的对比差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigDiffRequest 请求对象
     * @return SyncInvoker<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse>
     */
    public SyncInvoker<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse> showJobConfigDiffInvoker(
        ShowJobConfigDiffRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobConfigDiff, hcClient);
    }

    /**
     * 查看构建任务构建信息
     *
     * 查看构建任务构建信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return ShowJobInfoResponse
     */
    public ShowJobInfoResponse showJobInfo(ShowJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobInfo);
    }

    /**
     * 查看构建任务构建信息
     *
     * 查看构建任务构建信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return SyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse>
     */
    public SyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfoInvoker(ShowJobInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobInfo, hcClient);
    }

    /**
     * 获取通知信息
     *
     * 获取通知信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobNoticeConfigInfoRequest 请求对象
     * @return ShowJobNoticeConfigInfoResponse
     */
    public ShowJobNoticeConfigInfoResponse showJobNoticeConfigInfo(ShowJobNoticeConfigInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobNoticeConfigInfo);
    }

    /**
     * 获取通知信息
     *
     * 获取通知信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobNoticeConfigInfoRequest 请求对象
     * @return SyncInvoker<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse>
     */
    public SyncInvoker<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse> showJobNoticeConfigInfoInvoker(
        ShowJobNoticeConfigInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobNoticeConfigInfo, hcClient);
    }

    /**
     * 获取构建任务的角色权限矩阵信息
     *
     * 获取构建任务的角色权限矩阵信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRolePermissionRequest 请求对象
     * @return ShowJobRolePermissionResponse
     */
    public ShowJobRolePermissionResponse showJobRolePermission(ShowJobRolePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobRolePermission);
    }

    /**
     * 获取构建任务的角色权限矩阵信息
     *
     * 获取构建任务的角色权限矩阵信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRolePermissionRequest 请求对象
     * @return SyncInvoker<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse>
     */
    public SyncInvoker<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse> showJobRolePermissionInvoker(
        ShowJobRolePermissionRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobRolePermission, hcClient);
    }

    /**
     * 查询任务状态
     *
     * 查询任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStepStatusRequest 请求对象
     * @return ShowJobStepStatusResponse
     */
    public ShowJobStepStatusResponse showJobStepStatus(ShowJobStepStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobStepStatus);
    }

    /**
     * 查询任务状态
     *
     * 查询任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStepStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStepStatusRequest, ShowJobStepStatusResponse>
     */
    public SyncInvoker<ShowJobStepStatusRequest, ShowJobStepStatusResponse> showJobStepStatusInvoker(
        ShowJobStepStatusRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobStepStatus, hcClient);
    }

    /**
     * 查看系统预定义参数
     *
     * 查看系统预定义参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobSystemParametersRequest 请求对象
     * @return ShowJobSystemParametersResponse
     */
    public ShowJobSystemParametersResponse showJobSystemParameters(ShowJobSystemParametersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobSystemParameters);
    }

    /**
     * 查看系统预定义参数
     *
     * 查看系统预定义参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobSystemParametersRequest 请求对象
     * @return SyncInvoker<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse>
     */
    public SyncInvoker<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse> showJobSystemParametersInvoker(
        ShowJobSystemParametersRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobSystemParameters, hcClient);
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
     * 更新构建任务
     *
     * 更新构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewJobRequest 请求对象
     * @return UpdateNewJobResponse
     */
    public UpdateNewJobResponse updateNewJob(UpdateNewJobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.updateNewJob);
    }

    /**
     * 更新构建任务
     *
     * 更新构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewJobRequest 请求对象
     * @return SyncInvoker<UpdateNewJobRequest, UpdateNewJobResponse>
     */
    public SyncInvoker<UpdateNewJobRequest, UpdateNewJobResponse> updateNewJobInvoker(UpdateNewJobRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.updateNewJob, hcClient);
    }

    /**
     * 删除文件管理文件
     *
     * 删除文件管理文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeystoreRequest 请求对象
     * @return DeleteKeystoreResponse
     */
    public DeleteKeystoreResponse deleteKeystore(DeleteKeystoreRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.deleteKeystore);
    }

    /**
     * 删除文件管理文件
     *
     * 删除文件管理文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeystoreRequest 请求对象
     * @return SyncInvoker<DeleteKeystoreRequest, DeleteKeystoreResponse>
     */
    public SyncInvoker<DeleteKeystoreRequest, DeleteKeystoreResponse> deleteKeystoreInvoker(
        DeleteKeystoreRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.deleteKeystore, hcClient);
    }

    /**
     * 文件管理删除权限
     *
     * 文件管理删除权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeystorePermissionRequest 请求对象
     * @return DeleteKeystorePermissionResponse
     */
    public DeleteKeystorePermissionResponse deleteKeystorePermission(DeleteKeystorePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.deleteKeystorePermission);
    }

    /**
     * 文件管理删除权限
     *
     * 文件管理删除权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeystorePermissionRequest 请求对象
     * @return SyncInvoker<DeleteKeystorePermissionRequest, DeleteKeystorePermissionResponse>
     */
    public SyncInvoker<DeleteKeystorePermissionRequest, DeleteKeystorePermissionResponse> deleteKeystorePermissionInvoker(
        DeleteKeystorePermissionRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.deleteKeystorePermission, hcClient);
    }

    /**
     * 文件管理文件下载
     *
     * 文件管理文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKeystoreByNameRequest 请求对象
     * @return DownloadKeystoreByNameResponse
     */
    public DownloadKeystoreByNameResponse downloadKeystoreByName(DownloadKeystoreByNameRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.downloadKeystoreByName);
    }

    /**
     * 文件管理文件下载
     *
     * 文件管理文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKeystoreByNameRequest 请求对象
     * @return SyncInvoker<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse>
     */
    public SyncInvoker<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse> downloadKeystoreByNameInvoker(
        DownloadKeystoreByNameRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.downloadKeystoreByName, hcClient);
    }

    /**
     * 查询用户可使用文件
     *
     * 查询用户可使用文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeystoreRequest 请求对象
     * @return ListKeystoreResponse
     */
    public ListKeystoreResponse listKeystore(ListKeystoreRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listKeystore);
    }

    /**
     * 查询用户可使用文件
     *
     * 查询用户可使用文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeystoreRequest 请求对象
     * @return SyncInvoker<ListKeystoreRequest, ListKeystoreResponse>
     */
    public SyncInvoker<ListKeystoreRequest, ListKeystoreResponse> listKeystoreInvoker(ListKeystoreRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listKeystore, hcClient);
    }

    /**
     * 查询租户下文件列表
     *
     * 查询租户下文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeystoreSearchRequest 请求对象
     * @return ListKeystoreSearchResponse
     */
    public ListKeystoreSearchResponse listKeystoreSearch(ListKeystoreSearchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listKeystoreSearch);
    }

    /**
     * 查询租户下文件列表
     *
     * 查询租户下文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeystoreSearchRequest 请求对象
     * @return SyncInvoker<ListKeystoreSearchRequest, ListKeystoreSearchResponse>
     */
    public SyncInvoker<ListKeystoreSearchRequest, ListKeystoreSearchResponse> listKeystoreSearchInvoker(
        ListKeystoreSearchRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listKeystoreSearch, hcClient);
    }

    /**
     * 文件管理查询权限
     *
     * 文件管理查询权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKeystorePermissionRequest 请求对象
     * @return ShowKeystorePermissionResponse
     */
    public ShowKeystorePermissionResponse showKeystorePermission(ShowKeystorePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showKeystorePermission);
    }

    /**
     * 文件管理查询权限
     *
     * 文件管理查询权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKeystorePermissionRequest 请求对象
     * @return SyncInvoker<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse>
     */
    public SyncInvoker<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse> showKeystorePermissionInvoker(
        ShowKeystorePermissionRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showKeystorePermission, hcClient);
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

    /**
     * 获取指定工程的简要构建信息
     *
     * 获取指定工程的简要构建信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBriefRecordRequest 请求对象
     * @return ListBriefRecordResponse
     */
    public ListBriefRecordResponse listBriefRecord(ListBriefRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listBriefRecord);
    }

    /**
     * 获取指定工程的简要构建信息
     *
     * 获取指定工程的简要构建信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBriefRecordRequest 请求对象
     * @return SyncInvoker<ListBriefRecordRequest, ListBriefRecordResponse>
     */
    public SyncInvoker<ListBriefRecordRequest, ListBriefRecordResponse> listBriefRecordInvoker(
        ListBriefRecordRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listBriefRecord, hcClient);
    }

    /**
     * 获取任务构建记录列表v1
     *
     * 获取任务构建记录列表v1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildInfoRecordByJobIdRequest 请求对象
     * @return ListBuildInfoRecordByJobIdResponse
     */
    public ListBuildInfoRecordByJobIdResponse listBuildInfoRecordByJobId(ListBuildInfoRecordByJobIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listBuildInfoRecordByJobId);
    }

    /**
     * 获取任务构建记录列表v1
     *
     * 获取任务构建记录列表v1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildInfoRecordByJobIdRequest 请求对象
     * @return SyncInvoker<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse>
     */
    public SyncInvoker<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse> listBuildInfoRecordByJobIdInvoker(
        ListBuildInfoRecordByJobIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listBuildInfoRecordByJobId, hcClient);
    }

    /**
     * 获取指定工程的构建记录列表
     *
     * 获取指定工程的构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordsRequest 请求对象
     * @return ListRecordsResponse
     */
    public ListRecordsResponse listRecords(ListRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listRecords);
    }

    /**
     * 获取指定工程的构建记录列表
     *
     * 获取指定工程的构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordsRequest 请求对象
     * @return SyncInvoker<ListRecordsRequest, ListRecordsResponse>
     */
    public SyncInvoker<ListRecordsRequest, ListRecordsResponse> listRecordsInvoker(ListRecordsRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listRecords, hcClient);
    }

    /**
     * 获取任务构建记录列表
     *
     * 获取任务构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildInfoRecordRequest 请求对象
     * @return ShowBuildInfoRecordResponse
     */
    public ShowBuildInfoRecordResponse showBuildInfoRecord(ShowBuildInfoRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showBuildInfoRecord);
    }

    /**
     * 获取任务构建记录列表
     *
     * 获取任务构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildInfoRecordRequest 请求对象
     * @return SyncInvoker<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse>
     */
    public SyncInvoker<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse> showBuildInfoRecordInvoker(
        ShowBuildInfoRecordRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showBuildInfoRecord, hcClient);
    }

    /**
     * 查询指定构建记录详情
     *
     * 查询指定构建记录详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordRequest 请求对象
     * @return ShowBuildRecordResponse
     */
    public ShowBuildRecordResponse showBuildRecord(ShowBuildRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showBuildRecord);
    }

    /**
     * 查询指定构建记录详情
     *
     * 查询指定构建记录详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordRequest 请求对象
     * @return SyncInvoker<ShowBuildRecordRequest, ShowBuildRecordResponse>
     */
    public SyncInvoker<ShowBuildRecordRequest, ShowBuildRecordResponse> showBuildRecordInvoker(
        ShowBuildRecordRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showBuildRecord, hcClient);
    }

    /**
     * 获取构建记录的构建脚本
     *
     * 获取构建记录的构建脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordBuildScriptRequest 请求对象
     * @return ShowBuildRecordBuildScriptResponse
     */
    public ShowBuildRecordBuildScriptResponse showBuildRecordBuildScript(ShowBuildRecordBuildScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showBuildRecordBuildScript);
    }

    /**
     * 获取构建记录的构建脚本
     *
     * 获取构建记录的构建脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordBuildScriptRequest 请求对象
     * @return SyncInvoker<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse>
     */
    public SyncInvoker<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse> showBuildRecordBuildScriptInvoker(
        ShowBuildRecordBuildScriptRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showBuildRecordBuildScript, hcClient);
    }

    /**
     * 获取构建记录的有向无环图
     *
     * 获取构建记录的有向无环图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordFlowGraphRequest 请求对象
     * @return ShowBuildRecordFlowGraphResponse
     */
    public ShowBuildRecordFlowGraphResponse showBuildRecordFlowGraph(ShowBuildRecordFlowGraphRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showBuildRecordFlowGraph);
    }

    /**
     * 获取构建记录的有向无环图
     *
     * 获取构建记录的有向无环图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordFlowGraphRequest 请求对象
     * @return SyncInvoker<ShowBuildRecordFlowGraphRequest, ShowBuildRecordFlowGraphResponse>
     */
    public SyncInvoker<ShowBuildRecordFlowGraphRequest, ShowBuildRecordFlowGraphResponse> showBuildRecordFlowGraphInvoker(
        ShowBuildRecordFlowGraphRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showBuildRecordFlowGraph, hcClient);
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
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildRecordDetailRequest 请求对象
     * @return ShowJobBuildRecordDetailResponse
     */
    public ShowJobBuildRecordDetailResponse showJobBuildRecordDetail(ShowJobBuildRecordDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobBuildRecordDetail);
    }

    /**
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildRecordDetailRequest 请求对象
     * @return SyncInvoker<ShowJobBuildRecordDetailRequest, ShowJobBuildRecordDetailResponse>
     */
    public SyncInvoker<ShowJobBuildRecordDetailRequest, ShowJobBuildRecordDetailResponse> showJobBuildRecordDetailInvoker(
        ShowJobBuildRecordDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobBuildRecordDetail, hcClient);
    }

    /**
     * 构建历史页获取构建次数
     *
     * 构建历史页获取构建次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobTotalRequest 请求对象
     * @return ShowJobTotalResponse
     */
    public ShowJobTotalResponse showJobTotal(ShowJobTotalRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobTotal);
    }

    /**
     * 构建历史页获取构建次数
     *
     * 构建历史页获取构建次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobTotalRequest 请求对象
     * @return SyncInvoker<ShowJobTotalRequest, ShowJobTotalResponse>
     */
    public SyncInvoker<ShowJobTotalRequest, ShowJobTotalResponse> showJobTotalInvoker(ShowJobTotalRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobTotal, hcClient);
    }

    /**
     * 获取单元测试覆盖率报告压缩包
     *
     * 获取单元测试覆盖率报告压缩包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadJunitCoverageZipRequest 请求对象
     * @return DownloadJunitCoverageZipResponse
     */
    public DownloadJunitCoverageZipResponse downloadJunitCoverageZip(DownloadJunitCoverageZipRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.downloadJunitCoverageZip);
    }

    /**
     * 获取单元测试覆盖率报告压缩包
     *
     * 获取单元测试覆盖率报告压缩包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadJunitCoverageZipRequest 请求对象
     * @return SyncInvoker<DownloadJunitCoverageZipRequest, DownloadJunitCoverageZipResponse>
     */
    public SyncInvoker<DownloadJunitCoverageZipRequest, DownloadJunitCoverageZipResponse> downloadJunitCoverageZipInvoker(
        DownloadJunitCoverageZipRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.downloadJunitCoverageZip, hcClient);
    }

    /**
     * 获取单元测试覆盖率报告列表
     *
     * 获取单元测试覆盖率报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJunitCoverageSummaryRequest 请求对象
     * @return ListJunitCoverageSummaryResponse
     */
    public ListJunitCoverageSummaryResponse listJunitCoverageSummary(ListJunitCoverageSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listJunitCoverageSummary);
    }

    /**
     * 获取单元测试覆盖率报告列表
     *
     * 获取单元测试覆盖率报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJunitCoverageSummaryRequest 请求对象
     * @return SyncInvoker<ListJunitCoverageSummaryRequest, ListJunitCoverageSummaryResponse>
     */
    public SyncInvoker<ListJunitCoverageSummaryRequest, ListJunitCoverageSummaryResponse> listJunitCoverageSummaryInvoker(
        ListJunitCoverageSummaryRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listJunitCoverageSummary, hcClient);
    }

    /**
     * 获取该任务所有分支信息
     *
     * 获取该任务所有分支信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoBranchRequest 请求对象
     * @return ListRepoBranchResponse
     */
    public ListRepoBranchResponse listRepoBranch(ListRepoBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listRepoBranch);
    }

    /**
     * 获取该任务所有分支信息
     *
     * 获取该任务所有分支信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoBranchRequest 请求对象
     * @return SyncInvoker<ListRepoBranchRequest, ListRepoBranchResponse>
     */
    public SyncInvoker<ListRepoBranchRequest, ListRepoBranchResponse> listRepoBranchInvoker(
        ListRepoBranchRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listRepoBranch, hcClient);
    }

    /**
     * 查看仓库
     *
     * 查看仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryRequest 请求对象
     * @return ListRepositoryResponse
     */
    public ListRepositoryResponse listRepository(ListRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listRepository);
    }

    /**
     * 查看仓库
     *
     * 查看仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryRequest 请求对象
     * @return SyncInvoker<ListRepositoryRequest, ListRepositoryResponse>
     */
    public SyncInvoker<ListRepositoryRequest, ListRepositoryResponse> listRepositoryInvoker(
        ListRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listRepository, hcClient);
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
     * 洞察构建时长
     *
     * 洞察构建时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildTimeRequest 请求对象
     * @return ShowJobBuildTimeResponse
     */
    public ShowJobBuildTimeResponse showJobBuildTime(ShowJobBuildTimeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.showJobBuildTime);
    }

    /**
     * 洞察构建时长
     *
     * 洞察构建时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildTimeRequest 请求对象
     * @return SyncInvoker<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse>
     */
    public SyncInvoker<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse> showJobBuildTimeInvoker(
        ShowJobBuildTimeRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.showJobBuildTime, hcClient);
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
     * 删除构建模板
     *
     * 删除构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.deleteTemplate);
    }

    /**
     * 删除构建模板
     *
     * 删除构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.deleteTemplate, hcClient);
    }

    /**
     * 根据条件查询特定模板
     *
     * 根据条件查询特定模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomTemplateRequest 请求对象
     * @return ListCustomTemplateResponse
     */
    public ListCustomTemplateResponse listCustomTemplate(ListCustomTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listCustomTemplate);
    }

    /**
     * 根据条件查询特定模板
     *
     * 根据条件查询特定模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomTemplateRequest 请求对象
     * @return SyncInvoker<ListCustomTemplateRequest, ListCustomTemplateResponse>
     */
    public SyncInvoker<ListCustomTemplateRequest, ListCustomTemplateResponse> listCustomTemplateInvoker(
        ListCustomTemplateRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listCustomTemplate, hcClient);
    }

    /**
     * 查询官方模版
     *
     * 查询官方模版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOfficialTemplateRequest 请求对象
     * @return ListOfficialTemplateResponse
     */
    public ListOfficialTemplateResponse listOfficialTemplate(ListOfficialTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listOfficialTemplate);
    }

    /**
     * 查询官方模版
     *
     * 查询官方模版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOfficialTemplateRequest 请求对象
     * @return SyncInvoker<ListOfficialTemplateRequest, ListOfficialTemplateResponse>
     */
    public SyncInvoker<ListOfficialTemplateRequest, ListOfficialTemplateResponse> listOfficialTemplateInvoker(
        ListOfficialTemplateRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listOfficialTemplate, hcClient);
    }

    /**
     * 获取官方推荐模板
     *
     * 获取官方推荐模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecommendOfficialTemplateRequest 请求对象
     * @return ListRecommendOfficialTemplateResponse
     */
    public ListRecommendOfficialTemplateResponse listRecommendOfficialTemplate(
        ListRecommendOfficialTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsBuildMeta.listRecommendOfficialTemplate);
    }

    /**
     * 获取官方推荐模板
     *
     * 获取官方推荐模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecommendOfficialTemplateRequest 请求对象
     * @return SyncInvoker<ListRecommendOfficialTemplateRequest, ListRecommendOfficialTemplateResponse>
     */
    public SyncInvoker<ListRecommendOfficialTemplateRequest, ListRecommendOfficialTemplateResponse> listRecommendOfficialTemplateInvoker(
        ListRecommendOfficialTemplateRequest request) {
        return new SyncInvoker<>(request, CodeArtsBuildMeta.listRecommendOfficialTemplate, hcClient);
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

}
