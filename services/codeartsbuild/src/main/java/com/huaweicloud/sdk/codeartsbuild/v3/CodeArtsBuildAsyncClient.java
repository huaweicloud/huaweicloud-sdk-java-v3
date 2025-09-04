package com.huaweicloud.sdk.codeartsbuild.v3;

import com.huaweicloud.sdk.codeartsbuild.v3.model.AddFavouriteCustomTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddFavouriteCustomTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddKeystorePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddKeystorePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ApplyProjectPermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ApplyProjectPermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.BatchDeleteBuildJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.BatchDeleteBuildJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.BatchUpdateJobRolePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.BatchUpdateJobRolePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobCountIsTopLimitRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobCountIsTopLimitResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobInternalRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobInternalResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateJobGroupRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateJobGroupResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateNewJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateNewJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteGroupRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteGroupResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListEndPointsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListEndPointsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListGroupTreeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListGroupTreeResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.MoveGroupRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.MoveGroupResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RemoverFavouriteCustomTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RemoverFavouriteCustomTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RestoreRecyclingJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RestoreRecyclingJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SaveTemplateUsedInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SaveTemplateUsedInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SetKeepTimeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SetKeepTimeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowAvailableInnerSpecRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowAvailableInnerSpecResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildDetailsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildDetailsResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDomainStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDomainStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDomainsStatusesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDomainsStatusesResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobPipelineInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobPipelineInfoResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowPackageSpecCountDownRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowPackageSpecCountDownResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowProjectJobPermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowProjectJobPermissionResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowUserChargeTypeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowUserChargeTypeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowUserOverPackageQuotaRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowUserOverPackageQuotaResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowYamlTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowYamlTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopTheJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopTheJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SwitchedPacketRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SwitchedPacketResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateJobGroupRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateJobGroupResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystorePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystorePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewNoticeNewRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewNoticeNewResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UploadKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UploadKeystoreResponse;
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
     * 批量删除构建任务
     *
     * 批量删除构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBuildJobsRequest 请求对象
     * @return CompletableFuture<BatchDeleteBuildJobsResponse>
     */
    public CompletableFuture<BatchDeleteBuildJobsResponse> batchDeleteBuildJobsAsync(
        BatchDeleteBuildJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.batchDeleteBuildJobs);
    }

    /**
     * 批量删除构建任务
     *
     * 批量删除构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBuildJobsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteBuildJobsRequest, BatchDeleteBuildJobsResponse>
     */
    public AsyncInvoker<BatchDeleteBuildJobsRequest, BatchDeleteBuildJobsResponse> batchDeleteBuildJobsAsyncInvoker(
        BatchDeleteBuildJobsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.batchDeleteBuildJobs, hcClient);
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
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelatedProjectInfoRequest 请求对象
     * @return CompletableFuture<ListRelatedProjectInfoResponse>
     */
    public CompletableFuture<ListRelatedProjectInfoResponse> listRelatedProjectInfoAsync(
        ListRelatedProjectInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listRelatedProjectInfo);
    }

    /**
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelatedProjectInfoRequest 请求对象
     * @return AsyncInvoker<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse>
     */
    public AsyncInvoker<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse> listRelatedProjectInfoAsyncInvoker(
        ListRelatedProjectInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listRelatedProjectInfo, hcClient);
    }

    /**
     * 查内置执行机规格
     *
     * 查内置执行机规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableInnerSpecRequest 请求对象
     * @return CompletableFuture<ShowAvailableInnerSpecResponse>
     */
    public CompletableFuture<ShowAvailableInnerSpecResponse> showAvailableInnerSpecAsync(
        ShowAvailableInnerSpecRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showAvailableInnerSpec);
    }

    /**
     * 查内置执行机规格
     *
     * 查内置执行机规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableInnerSpecRequest 请求对象
     * @return AsyncInvoker<ShowAvailableInnerSpecRequest, ShowAvailableInnerSpecResponse>
     */
    public AsyncInvoker<ShowAvailableInnerSpecRequest, ShowAvailableInnerSpecResponse> showAvailableInnerSpecAsyncInvoker(
        ShowAvailableInnerSpecRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showAvailableInnerSpec, hcClient);
    }

    /**
     * 查询租户状态
     *
     * 查询租户状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainStatusRequest 请求对象
     * @return CompletableFuture<ShowDomainStatusResponse>
     */
    public CompletableFuture<ShowDomainStatusResponse> showDomainStatusAsync(ShowDomainStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showDomainStatus);
    }

    /**
     * 查询租户状态
     *
     * 查询租户状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainStatusRequest 请求对象
     * @return AsyncInvoker<ShowDomainStatusRequest, ShowDomainStatusResponse>
     */
    public AsyncInvoker<ShowDomainStatusRequest, ShowDomainStatusResponse> showDomainStatusAsyncInvoker(
        ShowDomainStatusRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showDomainStatus, hcClient);
    }

    /**
     * 获取套餐临期信息
     *
     * 获取套餐临期信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageSpecCountDownRequest 请求对象
     * @return CompletableFuture<ShowPackageSpecCountDownResponse>
     */
    public CompletableFuture<ShowPackageSpecCountDownResponse> showPackageSpecCountDownAsync(
        ShowPackageSpecCountDownRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showPackageSpecCountDown);
    }

    /**
     * 获取套餐临期信息
     *
     * 获取套餐临期信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageSpecCountDownRequest 请求对象
     * @return AsyncInvoker<ShowPackageSpecCountDownRequest, ShowPackageSpecCountDownResponse>
     */
    public AsyncInvoker<ShowPackageSpecCountDownRequest, ShowPackageSpecCountDownResponse> showPackageSpecCountDownAsyncInvoker(
        ShowPackageSpecCountDownRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showPackageSpecCountDown, hcClient);
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
     * 获取当前用户的项目信息列表
     *
     * 获取当前用户的项目信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelatedProjectRequest 请求对象
     * @return CompletableFuture<ShowRelatedProjectResponse>
     */
    public CompletableFuture<ShowRelatedProjectResponse> showRelatedProjectAsync(ShowRelatedProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showRelatedProject);
    }

    /**
     * 获取当前用户的项目信息列表
     *
     * 获取当前用户的项目信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelatedProjectRequest 请求对象
     * @return AsyncInvoker<ShowRelatedProjectRequest, ShowRelatedProjectResponse>
     */
    public AsyncInvoker<ShowRelatedProjectRequest, ShowRelatedProjectResponse> showRelatedProjectAsyncInvoker(
        ShowRelatedProjectRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showRelatedProject, hcClient);
    }

    /**
     * 获取租户任务总数和成功率接口
     *
     * 获取租户任务总数和成功率接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSummaryBuildJobInfoRequest 请求对象
     * @return CompletableFuture<ShowSummaryBuildJobInfoResponse>
     */
    public CompletableFuture<ShowSummaryBuildJobInfoResponse> showSummaryBuildJobInfoAsync(
        ShowSummaryBuildJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showSummaryBuildJobInfo);
    }

    /**
     * 获取租户任务总数和成功率接口
     *
     * 获取租户任务总数和成功率接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSummaryBuildJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowSummaryBuildJobInfoRequest, ShowSummaryBuildJobInfoResponse>
     */
    public AsyncInvoker<ShowSummaryBuildJobInfoRequest, ShowSummaryBuildJobInfoResponse> showSummaryBuildJobInfoAsyncInvoker(
        ShowSummaryBuildJobInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showSummaryBuildJobInfo, hcClient);
    }

    /**
     * 查询当前租户（计费）类型
     *
     * 查询当前租户（计费）类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserChargeTypeRequest 请求对象
     * @return CompletableFuture<ShowUserChargeTypeResponse>
     */
    public CompletableFuture<ShowUserChargeTypeResponse> showUserChargeTypeAsync(ShowUserChargeTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showUserChargeType);
    }

    /**
     * 查询当前租户（计费）类型
     *
     * 查询当前租户（计费）类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserChargeTypeRequest 请求对象
     * @return AsyncInvoker<ShowUserChargeTypeRequest, ShowUserChargeTypeResponse>
     */
    public AsyncInvoker<ShowUserChargeTypeRequest, ShowUserChargeTypeResponse> showUserChargeTypeAsyncInvoker(
        ShowUserChargeTypeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showUserChargeType, hcClient);
    }

    /**
     * 当前用户所在项目所属租户的包周期每月时长是否超额
     *
     * 当前用户所在项目所属租户的包周期每月时长是否超额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserOverPackageQuotaRequest 请求对象
     * @return CompletableFuture<ShowUserOverPackageQuotaResponse>
     */
    public CompletableFuture<ShowUserOverPackageQuotaResponse> showUserOverPackageQuotaAsync(
        ShowUserOverPackageQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showUserOverPackageQuota);
    }

    /**
     * 当前用户所在项目所属租户的包周期每月时长是否超额
     *
     * 当前用户所在项目所属租户的包周期每月时长是否超额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserOverPackageQuotaRequest 请求对象
     * @return AsyncInvoker<ShowUserOverPackageQuotaRequest, ShowUserOverPackageQuotaResponse>
     */
    public AsyncInvoker<ShowUserOverPackageQuotaRequest, ShowUserOverPackageQuotaResponse> showUserOverPackageQuotaAsyncInvoker(
        ShowUserOverPackageQuotaRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showUserOverPackageQuota, hcClient);
    }

    /**
     * 创建构建任务分组
     *
     * 创建构建任务分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobGroupRequest 请求对象
     * @return CompletableFuture<CreateJobGroupResponse>
     */
    public CompletableFuture<CreateJobGroupResponse> createJobGroupAsync(CreateJobGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.createJobGroup);
    }

    /**
     * 创建构建任务分组
     *
     * 创建构建任务分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobGroupRequest 请求对象
     * @return AsyncInvoker<CreateJobGroupRequest, CreateJobGroupResponse>
     */
    public AsyncInvoker<CreateJobGroupRequest, CreateJobGroupResponse> createJobGroupAsyncInvoker(
        CreateJobGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.createJobGroup, hcClient);
    }

    /**
     * 删除分组
     *
     * 删除分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return CompletableFuture<DeleteGroupResponse>
     */
    public CompletableFuture<DeleteGroupResponse> deleteGroupAsync(DeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.deleteGroup);
    }

    /**
     * 删除分组
     *
     * 删除分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupAsyncInvoker(DeleteGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.deleteGroup, hcClient);
    }

    /**
     * 查询分组树
     *
     * 查询分组树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupTreeRequest 请求对象
     * @return CompletableFuture<ListGroupTreeResponse>
     */
    public CompletableFuture<ListGroupTreeResponse> listGroupTreeAsync(ListGroupTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listGroupTree);
    }

    /**
     * 查询分组树
     *
     * 查询分组树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupTreeRequest 请求对象
     * @return AsyncInvoker<ListGroupTreeRequest, ListGroupTreeResponse>
     */
    public AsyncInvoker<ListGroupTreeRequest, ListGroupTreeResponse> listGroupTreeAsyncInvoker(
        ListGroupTreeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listGroupTree, hcClient);
    }

    /**
     * 移动构建任务至指定分组
     *
     * 移动构建任务至指定分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveGroupRequest 请求对象
     * @return CompletableFuture<MoveGroupResponse>
     */
    public CompletableFuture<MoveGroupResponse> moveGroupAsync(MoveGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.moveGroup);
    }

    /**
     * 移动构建任务至指定分组
     *
     * 移动构建任务至指定分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveGroupRequest 请求对象
     * @return AsyncInvoker<MoveGroupRequest, MoveGroupResponse>
     */
    public AsyncInvoker<MoveGroupRequest, MoveGroupResponse> moveGroupAsyncInvoker(MoveGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.moveGroup, hcClient);
    }

    /**
     * 交换分组顺序
     *
     * 交换分组顺序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchedPacketRequest 请求对象
     * @return CompletableFuture<SwitchedPacketResponse>
     */
    public CompletableFuture<SwitchedPacketResponse> switchedPacketAsync(SwitchedPacketRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.switchedPacket);
    }

    /**
     * 交换分组顺序
     *
     * 交换分组顺序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchedPacketRequest 请求对象
     * @return AsyncInvoker<SwitchedPacketRequest, SwitchedPacketResponse>
     */
    public AsyncInvoker<SwitchedPacketRequest, SwitchedPacketResponse> switchedPacketAsyncInvoker(
        SwitchedPacketRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.switchedPacket, hcClient);
    }

    /**
     * 修改分组信息
     *
     * 修改分组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobGroupRequest 请求对象
     * @return CompletableFuture<UpdateJobGroupResponse>
     */
    public CompletableFuture<UpdateJobGroupResponse> updateJobGroupAsync(UpdateJobGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.updateJobGroup);
    }

    /**
     * 修改分组信息
     *
     * 修改分组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobGroupRequest 请求对象
     * @return AsyncInvoker<UpdateJobGroupRequest, UpdateJobGroupResponse>
     */
    public AsyncInvoker<UpdateJobGroupRequest, UpdateJobGroupResponse> updateJobGroupAsyncInvoker(
        UpdateJobGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.updateJobGroup, hcClient);
    }

    /**
     * 获取dockerfileTemplate
     *
     * 获取dockerfileTemplate
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockerfileTemplateRequest 请求对象
     * @return CompletableFuture<ShowDockerfileTemplateResponse>
     */
    public CompletableFuture<ShowDockerfileTemplateResponse> showDockerfileTemplateAsync(
        ShowDockerfileTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showDockerfileTemplate);
    }

    /**
     * 获取dockerfileTemplate
     *
     * 获取dockerfileTemplate
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockerfileTemplateRequest 请求对象
     * @return AsyncInvoker<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse>
     */
    public AsyncInvoker<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse> showDockerfileTemplateAsyncInvoker(
        ShowDockerfileTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showDockerfileTemplate, hcClient);
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
     * 任务是否使用项目级权限
     *
     * 任务是否使用项目级权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyProjectPermissionRequest 请求对象
     * @return CompletableFuture<ApplyProjectPermissionResponse>
     */
    public CompletableFuture<ApplyProjectPermissionResponse> applyProjectPermissionAsync(
        ApplyProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.applyProjectPermission);
    }

    /**
     * 任务是否使用项目级权限
     *
     * 任务是否使用项目级权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyProjectPermissionRequest 请求对象
     * @return AsyncInvoker<ApplyProjectPermissionRequest, ApplyProjectPermissionResponse>
     */
    public AsyncInvoker<ApplyProjectPermissionRequest, ApplyProjectPermissionResponse> applyProjectPermissionAsyncInvoker(
        ApplyProjectPermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.applyProjectPermission, hcClient);
    }

    /**
     * 批量修改任务权限
     *
     * 批量修改任务权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateJobRolePermissionRequest 请求对象
     * @return CompletableFuture<BatchUpdateJobRolePermissionResponse>
     */
    public CompletableFuture<BatchUpdateJobRolePermissionResponse> batchUpdateJobRolePermissionAsync(
        BatchUpdateJobRolePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.batchUpdateJobRolePermission);
    }

    /**
     * 批量修改任务权限
     *
     * 批量修改任务权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateJobRolePermissionRequest 请求对象
     * @return AsyncInvoker<BatchUpdateJobRolePermissionRequest, BatchUpdateJobRolePermissionResponse>
     */
    public AsyncInvoker<BatchUpdateJobRolePermissionRequest, BatchUpdateJobRolePermissionResponse> batchUpdateJobRolePermissionAsyncInvoker(
        BatchUpdateJobRolePermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.batchUpdateJobRolePermission, hcClient);
    }

    /**
     * 检查任务数量是否上限
     *
     * 检查任务数量是否上限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobCountIsTopLimitRequest 请求对象
     * @return CompletableFuture<CheckJobCountIsTopLimitResponse>
     */
    public CompletableFuture<CheckJobCountIsTopLimitResponse> checkJobCountIsTopLimitAsync(
        CheckJobCountIsTopLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.checkJobCountIsTopLimit);
    }

    /**
     * 检查任务数量是否上限
     *
     * 检查任务数量是否上限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobCountIsTopLimitRequest 请求对象
     * @return AsyncInvoker<CheckJobCountIsTopLimitRequest, CheckJobCountIsTopLimitResponse>
     */
    public AsyncInvoker<CheckJobCountIsTopLimitRequest, CheckJobCountIsTopLimitResponse> checkJobCountIsTopLimitAsyncInvoker(
        CheckJobCountIsTopLimitRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.checkJobCountIsTopLimit, hcClient);
    }

    /**
     * 是否已开启内网安全访问
     *
     * 是否已开启内网安全访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobInternalRequest 请求对象
     * @return CompletableFuture<CheckJobInternalResponse>
     */
    public CompletableFuture<CheckJobInternalResponse> checkJobInternalAsync(CheckJobInternalRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.checkJobInternal);
    }

    /**
     * 是否已开启内网安全访问
     *
     * 是否已开启内网安全访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobInternalRequest 请求对象
     * @return AsyncInvoker<CheckJobInternalRequest, CheckJobInternalResponse>
     */
    public AsyncInvoker<CheckJobInternalRequest, CheckJobInternalResponse> checkJobInternalAsyncInvoker(
        CheckJobInternalRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.checkJobInternal, hcClient);
    }

    /**
     * 查看项目下任务名是否存在
     *
     * 查看项目下任务名是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobNameIsExistsRequest 请求对象
     * @return CompletableFuture<CheckJobNameIsExistsResponse>
     */
    public CompletableFuture<CheckJobNameIsExistsResponse> checkJobNameIsExistsAsync(
        CheckJobNameIsExistsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.checkJobNameIsExists);
    }

    /**
     * 查看项目下任务名是否存在
     *
     * 查看项目下任务名是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckJobNameIsExistsRequest 请求对象
     * @return AsyncInvoker<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse>
     */
    public AsyncInvoker<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse> checkJobNameIsExistsAsyncInvoker(
        CheckJobNameIsExistsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.checkJobNameIsExists, hcClient);
    }

    /**
     * 检查webhook地址参数
     *
     * 检查webhook地址参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWebhookUrlRequest 请求对象
     * @return CompletableFuture<CheckWebhookUrlResponse>
     */
    public CompletableFuture<CheckWebhookUrlResponse> checkWebhookUrlAsync(CheckWebhookUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.checkWebhookUrl);
    }

    /**
     * 检查webhook地址参数
     *
     * 检查webhook地址参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWebhookUrlRequest 请求对象
     * @return AsyncInvoker<CheckWebhookUrlRequest, CheckWebhookUrlResponse>
     */
    public AsyncInvoker<CheckWebhookUrlRequest, CheckWebhookUrlResponse> checkWebhookUrlAsyncInvoker(
        CheckWebhookUrlRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.checkWebhookUrl, hcClient);
    }

    /**
     * 清空回收站中的任务
     *
     * 清空回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearRecyclingJobsRequest 请求对象
     * @return CompletableFuture<ClearRecyclingJobsResponse>
     */
    public CompletableFuture<ClearRecyclingJobsResponse> clearRecyclingJobsAsync(ClearRecyclingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.clearRecyclingJobs);
    }

    /**
     * 清空回收站中的任务
     *
     * 清空回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearRecyclingJobsRequest 请求对象
     * @return AsyncInvoker<ClearRecyclingJobsRequest, ClearRecyclingJobsResponse>
     */
    public AsyncInvoker<ClearRecyclingJobsRequest, ClearRecyclingJobsResponse> clearRecyclingJobsAsyncInvoker(
        ClearRecyclingJobsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.clearRecyclingJobs, hcClient);
    }

    /**
     * 复制构建任务
     *
     * 复制构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyJobRequest 请求对象
     * @return CompletableFuture<CopyJobResponse>
     */
    public CompletableFuture<CopyJobResponse> copyJobAsync(CopyJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.copyJob);
    }

    /**
     * 复制构建任务
     *
     * 复制构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyJobRequest 请求对象
     * @return AsyncInvoker<CopyJobRequest, CopyJobResponse>
     */
    public AsyncInvoker<CopyJobRequest, CopyJobResponse> copyJobAsyncInvoker(CopyJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.copyJob, hcClient);
    }

    /**
     * 创建构建任务
     *
     * 创建构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewJobRequest 请求对象
     * @return CompletableFuture<CreateNewJobResponse>
     */
    public CompletableFuture<CreateNewJobResponse> createNewJobAsync(CreateNewJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.createNewJob);
    }

    /**
     * 创建构建任务
     *
     * 创建构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewJobRequest 请求对象
     * @return AsyncInvoker<CreateNewJobRequest, CreateNewJobResponse>
     */
    public AsyncInvoker<CreateNewJobRequest, CreateNewJobResponse> createNewJobAsyncInvoker(
        CreateNewJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.createNewJob, hcClient);
    }

    /**
     * 删除回收站中的任务
     *
     * 删除回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecyclingJobsRequest 请求对象
     * @return CompletableFuture<DeleteRecyclingJobsResponse>
     */
    public CompletableFuture<DeleteRecyclingJobsResponse> deleteRecyclingJobsAsync(DeleteRecyclingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.deleteRecyclingJobs);
    }

    /**
     * 删除回收站中的任务
     *
     * 删除回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecyclingJobsRequest 请求对象
     * @return AsyncInvoker<DeleteRecyclingJobsRequest, DeleteRecyclingJobsResponse>
     */
    public AsyncInvoker<DeleteRecyclingJobsRequest, DeleteRecyclingJobsResponse> deleteRecyclingJobsAsyncInvoker(
        DeleteRecyclingJobsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.deleteRecyclingJobs, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTheJobRequest 请求对象
     * @return CompletableFuture<DeleteTheJobResponse>
     */
    public CompletableFuture<DeleteTheJobResponse> deleteTheJobAsync(DeleteTheJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.deleteTheJob);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTheJobRequest 请求对象
     * @return AsyncInvoker<DeleteTheJobRequest, DeleteTheJobResponse>
     */
    public AsyncInvoker<DeleteTheJobRequest, DeleteTheJobResponse> deleteTheJobAsyncInvoker(
        DeleteTheJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.deleteTheJob, hcClient);
    }

    /**
     * 禁用任务
     *
     * 禁用任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableTheJobRequest 请求对象
     * @return CompletableFuture<DisableTheJobResponse>
     */
    public CompletableFuture<DisableTheJobResponse> disableTheJobAsync(DisableTheJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.disableTheJob);
    }

    /**
     * 禁用任务
     *
     * 禁用任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableTheJobRequest 请求对象
     * @return AsyncInvoker<DisableTheJobRequest, DisableTheJobResponse>
     */
    public AsyncInvoker<DisableTheJobRequest, DisableTheJobResponse> disableTheJobAsyncInvoker(
        DisableTheJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.disableTheJob, hcClient);
    }

    /**
     * 执行构建
     *
     * 执行构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return CompletableFuture<ExecuteJobResponse>
     */
    public CompletableFuture<ExecuteJobResponse> executeJobAsync(ExecuteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.executeJob);
    }

    /**
     * 执行构建
     *
     * 执行构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobAsyncInvoker(ExecuteJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.executeJob, hcClient);
    }

    /**
     * 详情页获取构建参数
     *
     * 详情页获取构建参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildParameterRequest 请求对象
     * @return CompletableFuture<ListBuildParameterResponse>
     */
    public CompletableFuture<ListBuildParameterResponse> listBuildParameterAsync(ListBuildParameterRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listBuildParameter);
    }

    /**
     * 详情页获取构建参数
     *
     * 详情页获取构建参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuildParameterRequest 请求对象
     * @return AsyncInvoker<ListBuildParameterRequest, ListBuildParameterResponse>
     */
    public AsyncInvoker<ListBuildParameterRequest, ListBuildParameterResponse> listBuildParameterAsyncInvoker(
        ListBuildParameterRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listBuildParameter, hcClient);
    }

    /**
     * 查询私有依赖仓库列表
     *
     * 查询私有依赖仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndPointsRequest 请求对象
     * @return CompletableFuture<ListEndPointsResponse>
     */
    public CompletableFuture<ListEndPointsResponse> listEndPointsAsync(ListEndPointsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listEndPoints);
    }

    /**
     * 查询私有依赖仓库列表
     *
     * 查询私有依赖仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndPointsRequest 请求对象
     * @return AsyncInvoker<ListEndPointsRequest, ListEndPointsResponse>
     */
    public AsyncInvoker<ListEndPointsRequest, ListEndPointsResponse> listEndPointsAsyncInvoker(
        ListEndPointsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listEndPoints, hcClient);
    }

    /**
     * 查看用户全部的构建任务列表
     *
     * 查看用户全部的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return CompletableFuture<ListJobResponse>
     */
    public CompletableFuture<ListJobResponse> listJobAsync(ListJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listJob);
    }

    /**
     * 查看用户全部的构建任务列表
     *
     * 查看用户全部的构建任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return AsyncInvoker<ListJobRequest, ListJobResponse>
     */
    public AsyncInvoker<ListJobRequest, ListJobResponse> listJobAsyncInvoker(ListJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listJob, hcClient);
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
     * 获取修改历史
     *
     * 获取修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdateJobHistoryRequest 请求对象
     * @return CompletableFuture<ListUpdateJobHistoryResponse>
     */
    public CompletableFuture<ListUpdateJobHistoryResponse> listUpdateJobHistoryAsync(
        ListUpdateJobHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listUpdateJobHistory);
    }

    /**
     * 获取修改历史
     *
     * 获取修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpdateJobHistoryRequest 请求对象
     * @return AsyncInvoker<ListUpdateJobHistoryRequest, ListUpdateJobHistoryResponse>
     */
    public AsyncInvoker<ListUpdateJobHistoryRequest, ListUpdateJobHistoryResponse> listUpdateJobHistoryAsyncInvoker(
        ListUpdateJobHistoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listUpdateJobHistory, hcClient);
    }

    /**
     * 恢复回收站中的任务
     *
     * 恢复回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRecyclingJobsRequest 请求对象
     * @return CompletableFuture<RestoreRecyclingJobsResponse>
     */
    public CompletableFuture<RestoreRecyclingJobsResponse> restoreRecyclingJobsAsync(
        RestoreRecyclingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.restoreRecyclingJobs);
    }

    /**
     * 恢复回收站中的任务
     *
     * 恢复回收站中的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRecyclingJobsRequest 请求对象
     * @return AsyncInvoker<RestoreRecyclingJobsRequest, RestoreRecyclingJobsResponse>
     */
    public AsyncInvoker<RestoreRecyclingJobsRequest, RestoreRecyclingJobsResponse> restoreRecyclingJobsAsyncInvoker(
        RestoreRecyclingJobsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.restoreRecyclingJobs, hcClient);
    }

    /**
     * 设置回收站中的任务保留时间
     *
     * 设置回收站中的任务保留时间,该接口需要租户账号才能访问，租户子账号无权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKeepTimeRequest 请求对象
     * @return CompletableFuture<SetKeepTimeResponse>
     */
    public CompletableFuture<SetKeepTimeResponse> setKeepTimeAsync(SetKeepTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.setKeepTime);
    }

    /**
     * 设置回收站中的任务保留时间
     *
     * 设置回收站中的任务保留时间,该接口需要租户账号才能访问，租户子账号无权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKeepTimeRequest 请求对象
     * @return AsyncInvoker<SetKeepTimeRequest, SetKeepTimeResponse>
     */
    public AsyncInvoker<SetKeepTimeRequest, SetKeepTimeResponse> setKeepTimeAsyncInvoker(SetKeepTimeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.setKeepTime, hcClient);
    }

    /**
     * 根据持续构建名称，获取任务构建状态、百分比、剩余时间
     *
     * 根据持续构建名称，获取任务构建状态、百分比、剩余时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildDetailsRequest 请求对象
     * @return CompletableFuture<ShowBuildDetailsResponse>
     */
    public CompletableFuture<ShowBuildDetailsResponse> showBuildDetailsAsync(ShowBuildDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showBuildDetails);
    }

    /**
     * 根据持续构建名称，获取任务构建状态、百分比、剩余时间
     *
     * 根据持续构建名称，获取任务构建状态、百分比、剩余时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildDetailsRequest 请求对象
     * @return AsyncInvoker<ShowBuildDetailsRequest, ShowBuildDetailsResponse>
     */
    public AsyncInvoker<ShowBuildDetailsRequest, ShowBuildDetailsResponse> showBuildDetailsAsyncInvoker(
        ShowBuildDetailsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showBuildDetails, hcClient);
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
     * 复制任务名
     *
     * 复制任务名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCopyNameRequest 请求对象
     * @return CompletableFuture<ShowCopyNameResponse>
     */
    public CompletableFuture<ShowCopyNameResponse> showCopyNameAsync(ShowCopyNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showCopyName);
    }

    /**
     * 复制任务名
     *
     * 复制任务名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCopyNameRequest 请求对象
     * @return AsyncInvoker<ShowCopyNameRequest, ShowCopyNameResponse>
     */
    public AsyncInvoker<ShowCopyNameRequest, ShowCopyNameResponse> showCopyNameAsyncInvoker(
        ShowCopyNameRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showCopyName, hcClient);
    }

    /**
     * 获取编译构建默认参数
     *
     * 获取编译构建默认参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultBuildParametersRequest 请求对象
     * @return CompletableFuture<ShowDefaultBuildParametersResponse>
     */
    public CompletableFuture<ShowDefaultBuildParametersResponse> showDefaultBuildParametersAsync(
        ShowDefaultBuildParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showDefaultBuildParameters);
    }

    /**
     * 获取编译构建默认参数
     *
     * 获取编译构建默认参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultBuildParametersRequest 请求对象
     * @return AsyncInvoker<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse>
     */
    public AsyncInvoker<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse> showDefaultBuildParametersAsyncInvoker(
        ShowDefaultBuildParametersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showDefaultBuildParameters, hcClient);
    }

    /**
     * 获取当前项目默认角色权限矩阵信息
     *
     * 获取当前项目默认角色权限矩阵信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultProjectPermissionRequest 请求对象
     * @return CompletableFuture<ShowDefaultProjectPermissionResponse>
     */
    public CompletableFuture<ShowDefaultProjectPermissionResponse> showDefaultProjectPermissionAsync(
        ShowDefaultProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showDefaultProjectPermission);
    }

    /**
     * 获取当前项目默认角色权限矩阵信息
     *
     * 获取当前项目默认角色权限矩阵信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultProjectPermissionRequest 请求对象
     * @return AsyncInvoker<ShowDefaultProjectPermissionRequest, ShowDefaultProjectPermissionResponse>
     */
    public AsyncInvoker<ShowDefaultProjectPermissionRequest, ShowDefaultProjectPermissionResponse> showDefaultProjectPermissionAsyncInvoker(
        ShowDefaultProjectPermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showDefaultProjectPermission, hcClient);
    }

    /**
     * 查询任务是否已禁用
     *
     * 查询任务是否已禁用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisableRequest 请求对象
     * @return CompletableFuture<ShowDisableResponse>
     */
    public CompletableFuture<ShowDisableResponse> showDisableAsync(ShowDisableRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showDisable);
    }

    /**
     * 查询任务是否已禁用
     *
     * 查询任务是否已禁用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisableRequest 请求对象
     * @return AsyncInvoker<ShowDisableRequest, ShowDisableResponse>
     */
    public AsyncInvoker<ShowDisableRequest, ShowDisableResponse> showDisableAsyncInvoker(ShowDisableRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showDisable, hcClient);
    }

    /**
     * 查询跨租户场景下其他租户的状态
     *
     * 查询跨租户场景下其他租户的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsStatusesRequest 请求对象
     * @return CompletableFuture<ShowDomainsStatusesResponse>
     */
    public CompletableFuture<ShowDomainsStatusesResponse> showDomainsStatusesAsync(ShowDomainsStatusesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showDomainsStatuses);
    }

    /**
     * 查询跨租户场景下其他租户的状态
     *
     * 查询跨租户场景下其他租户的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsStatusesRequest 请求对象
     * @return AsyncInvoker<ShowDomainsStatusesRequest, ShowDomainsStatusesResponse>
     */
    public AsyncInvoker<ShowDomainsStatusesRequest, ShowDomainsStatusesResponse> showDomainsStatusesAsyncInvoker(
        ShowDomainsStatusesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showDomainsStatuses, hcClient);
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
     * 获取通知信息
     *
     * 获取通知信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobNoticeConfigInfoRequest 请求对象
     * @return CompletableFuture<ShowJobNoticeConfigInfoResponse>
     */
    public CompletableFuture<ShowJobNoticeConfigInfoResponse> showJobNoticeConfigInfoAsync(
        ShowJobNoticeConfigInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobNoticeConfigInfo);
    }

    /**
     * 获取通知信息
     *
     * 获取通知信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobNoticeConfigInfoRequest 请求对象
     * @return AsyncInvoker<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse>
     */
    public AsyncInvoker<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse> showJobNoticeConfigInfoAsyncInvoker(
        ShowJobNoticeConfigInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobNoticeConfigInfo, hcClient);
    }

    /**
     * 流水线查看构建任务信息
     *
     * 流水线查看构建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobPipelineInfoRequest 请求对象
     * @return CompletableFuture<ShowJobPipelineInfoResponse>
     */
    public CompletableFuture<ShowJobPipelineInfoResponse> showJobPipelineInfoAsync(ShowJobPipelineInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobPipelineInfo);
    }

    /**
     * 流水线查看构建任务信息
     *
     * 流水线查看构建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobPipelineInfoRequest 请求对象
     * @return AsyncInvoker<ShowJobPipelineInfoRequest, ShowJobPipelineInfoResponse>
     */
    public AsyncInvoker<ShowJobPipelineInfoRequest, ShowJobPipelineInfoResponse> showJobPipelineInfoAsyncInvoker(
        ShowJobPipelineInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobPipelineInfo, hcClient);
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
     * 查询任务状态
     *
     * 查询任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStepStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStepStatusResponse>
     */
    public CompletableFuture<ShowJobStepStatusResponse> showJobStepStatusAsync(ShowJobStepStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobStepStatus);
    }

    /**
     * 查询任务状态
     *
     * 查询任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStepStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStepStatusRequest, ShowJobStepStatusResponse>
     */
    public AsyncInvoker<ShowJobStepStatusRequest, ShowJobStepStatusResponse> showJobStepStatusAsyncInvoker(
        ShowJobStepStatusRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobStepStatus, hcClient);
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
     * 获取任务权限矩阵
     *
     * 获取任务权限矩阵
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectJobPermissionRequest 请求对象
     * @return CompletableFuture<ShowProjectJobPermissionResponse>
     */
    public CompletableFuture<ShowProjectJobPermissionResponse> showProjectJobPermissionAsync(
        ShowProjectJobPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showProjectJobPermission);
    }

    /**
     * 获取任务权限矩阵
     *
     * 获取任务权限矩阵
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectJobPermissionRequest 请求对象
     * @return AsyncInvoker<ShowProjectJobPermissionRequest, ShowProjectJobPermissionResponse>
     */
    public AsyncInvoker<ShowProjectJobPermissionRequest, ShowProjectJobPermissionResponse> showProjectJobPermissionAsyncInvoker(
        ShowProjectJobPermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showProjectJobPermission, hcClient);
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
     * 停止构建任务v1
     *
     * 停止构建任务v1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTheJobRequest 请求对象
     * @return CompletableFuture<StopTheJobResponse>
     */
    public CompletableFuture<StopTheJobResponse> stopTheJobAsync(StopTheJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.stopTheJob);
    }

    /**
     * 停止构建任务v1
     *
     * 停止构建任务v1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTheJobRequest 请求对象
     * @return AsyncInvoker<StopTheJobRequest, StopTheJobResponse>
     */
    public AsyncInvoker<StopTheJobRequest, StopTheJobResponse> stopTheJobAsyncInvoker(StopTheJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.stopTheJob, hcClient);
    }

    /**
     * 更新构建任务
     *
     * 更新构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewJobRequest 请求对象
     * @return CompletableFuture<UpdateNewJobResponse>
     */
    public CompletableFuture<UpdateNewJobResponse> updateNewJobAsync(UpdateNewJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.updateNewJob);
    }

    /**
     * 更新构建任务
     *
     * 更新构建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewJobRequest 请求对象
     * @return AsyncInvoker<UpdateNewJobRequest, UpdateNewJobResponse>
     */
    public AsyncInvoker<UpdateNewJobRequest, UpdateNewJobResponse> updateNewJobAsyncInvoker(
        UpdateNewJobRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.updateNewJob, hcClient);
    }

    /**
     * 更新通知配置
     *
     * 更新通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewNoticeNewRequest 请求对象
     * @return CompletableFuture<UpdateNewNoticeNewResponse>
     */
    public CompletableFuture<UpdateNewNoticeNewResponse> updateNewNoticeNewAsync(UpdateNewNoticeNewRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.updateNewNoticeNew);
    }

    /**
     * 更新通知配置
     *
     * 更新通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewNoticeNewRequest 请求对象
     * @return AsyncInvoker<UpdateNewNoticeNewRequest, UpdateNewNoticeNewResponse>
     */
    public AsyncInvoker<UpdateNewNoticeNewRequest, UpdateNewNoticeNewResponse> updateNewNoticeNewAsyncInvoker(
        UpdateNewNoticeNewRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.updateNewNoticeNew, hcClient);
    }

    /**
     * 添加文件权限
     *
     * 添加文件权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddKeystorePermissionRequest 请求对象
     * @return CompletableFuture<AddKeystorePermissionResponse>
     */
    public CompletableFuture<AddKeystorePermissionResponse> addKeystorePermissionAsync(
        AddKeystorePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.addKeystorePermission);
    }

    /**
     * 添加文件权限
     *
     * 添加文件权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddKeystorePermissionRequest 请求对象
     * @return AsyncInvoker<AddKeystorePermissionRequest, AddKeystorePermissionResponse>
     */
    public AsyncInvoker<AddKeystorePermissionRequest, AddKeystorePermissionResponse> addKeystorePermissionAsyncInvoker(
        AddKeystorePermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.addKeystorePermission, hcClient);
    }

    /**
     * 删除文件管理文件
     *
     * 删除文件管理文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeystoreRequest 请求对象
     * @return CompletableFuture<DeleteKeystoreResponse>
     */
    public CompletableFuture<DeleteKeystoreResponse> deleteKeystoreAsync(DeleteKeystoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.deleteKeystore);
    }

    /**
     * 删除文件管理文件
     *
     * 删除文件管理文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeystoreRequest 请求对象
     * @return AsyncInvoker<DeleteKeystoreRequest, DeleteKeystoreResponse>
     */
    public AsyncInvoker<DeleteKeystoreRequest, DeleteKeystoreResponse> deleteKeystoreAsyncInvoker(
        DeleteKeystoreRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.deleteKeystore, hcClient);
    }

    /**
     * 文件管理删除权限
     *
     * 文件管理删除权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeystorePermissionRequest 请求对象
     * @return CompletableFuture<DeleteKeystorePermissionResponse>
     */
    public CompletableFuture<DeleteKeystorePermissionResponse> deleteKeystorePermissionAsync(
        DeleteKeystorePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.deleteKeystorePermission);
    }

    /**
     * 文件管理删除权限
     *
     * 文件管理删除权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeystorePermissionRequest 请求对象
     * @return AsyncInvoker<DeleteKeystorePermissionRequest, DeleteKeystorePermissionResponse>
     */
    public AsyncInvoker<DeleteKeystorePermissionRequest, DeleteKeystorePermissionResponse> deleteKeystorePermissionAsyncInvoker(
        DeleteKeystorePermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.deleteKeystorePermission, hcClient);
    }

    /**
     * 文件管理文件下载
     *
     * 文件管理文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKeystoreByNameRequest 请求对象
     * @return CompletableFuture<DownloadKeystoreByNameResponse>
     */
    public CompletableFuture<DownloadKeystoreByNameResponse> downloadKeystoreByNameAsync(
        DownloadKeystoreByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.downloadKeystoreByName);
    }

    /**
     * 文件管理文件下载
     *
     * 文件管理文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKeystoreByNameRequest 请求对象
     * @return AsyncInvoker<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse>
     */
    public AsyncInvoker<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse> downloadKeystoreByNameAsyncInvoker(
        DownloadKeystoreByNameRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.downloadKeystoreByName, hcClient);
    }

    /**
     * 查询用户可使用文件
     *
     * 查询用户可使用文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeystoreRequest 请求对象
     * @return CompletableFuture<ListKeystoreResponse>
     */
    public CompletableFuture<ListKeystoreResponse> listKeystoreAsync(ListKeystoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listKeystore);
    }

    /**
     * 查询用户可使用文件
     *
     * 查询用户可使用文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeystoreRequest 请求对象
     * @return AsyncInvoker<ListKeystoreRequest, ListKeystoreResponse>
     */
    public AsyncInvoker<ListKeystoreRequest, ListKeystoreResponse> listKeystoreAsyncInvoker(
        ListKeystoreRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listKeystore, hcClient);
    }

    /**
     * 查询租户下文件列表
     *
     * 查询租户下文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeystoreSearchRequest 请求对象
     * @return CompletableFuture<ListKeystoreSearchResponse>
     */
    public CompletableFuture<ListKeystoreSearchResponse> listKeystoreSearchAsync(ListKeystoreSearchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listKeystoreSearch);
    }

    /**
     * 查询租户下文件列表
     *
     * 查询租户下文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeystoreSearchRequest 请求对象
     * @return AsyncInvoker<ListKeystoreSearchRequest, ListKeystoreSearchResponse>
     */
    public AsyncInvoker<ListKeystoreSearchRequest, ListKeystoreSearchResponse> listKeystoreSearchAsyncInvoker(
        ListKeystoreSearchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listKeystoreSearch, hcClient);
    }

    /**
     * 文件管理查询权限
     *
     * 文件管理查询权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKeystorePermissionRequest 请求对象
     * @return CompletableFuture<ShowKeystorePermissionResponse>
     */
    public CompletableFuture<ShowKeystorePermissionResponse> showKeystorePermissionAsync(
        ShowKeystorePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showKeystorePermission);
    }

    /**
     * 文件管理查询权限
     *
     * 文件管理查询权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKeystorePermissionRequest 请求对象
     * @return AsyncInvoker<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse>
     */
    public AsyncInvoker<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse> showKeystorePermissionAsyncInvoker(
        ShowKeystorePermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showKeystorePermission, hcClient);
    }

    /**
     * 更新文件信息
     *
     * 更新文件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeystoreRequest 请求对象
     * @return CompletableFuture<UpdateKeystoreResponse>
     */
    public CompletableFuture<UpdateKeystoreResponse> updateKeystoreAsync(UpdateKeystoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.updateKeystore);
    }

    /**
     * 更新文件信息
     *
     * 更新文件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeystoreRequest 请求对象
     * @return AsyncInvoker<UpdateKeystoreRequest, UpdateKeystoreResponse>
     */
    public AsyncInvoker<UpdateKeystoreRequest, UpdateKeystoreResponse> updateKeystoreAsyncInvoker(
        UpdateKeystoreRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.updateKeystore, hcClient);
    }

    /**
     * 配置文件权限
     *
     * 配置文件权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeystorePermissionRequest 请求对象
     * @return CompletableFuture<UpdateKeystorePermissionResponse>
     */
    public CompletableFuture<UpdateKeystorePermissionResponse> updateKeystorePermissionAsync(
        UpdateKeystorePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.updateKeystorePermission);
    }

    /**
     * 配置文件权限
     *
     * 配置文件权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeystorePermissionRequest 请求对象
     * @return AsyncInvoker<UpdateKeystorePermissionRequest, UpdateKeystorePermissionResponse>
     */
    public AsyncInvoker<UpdateKeystorePermissionRequest, UpdateKeystorePermissionResponse> updateKeystorePermissionAsyncInvoker(
        UpdateKeystorePermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.updateKeystorePermission, hcClient);
    }

    /**
     * 上传文件
     *
     * 上传文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadKeystoreRequest 请求对象
     * @return CompletableFuture<UploadKeystoreResponse>
     */
    public CompletableFuture<UploadKeystoreResponse> uploadKeystoreAsync(UploadKeystoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.uploadKeystore);
    }

    /**
     * 上传文件
     *
     * 上传文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadKeystoreRequest 请求对象
     * @return AsyncInvoker<UploadKeystoreRequest, UploadKeystoreResponse>
     */
    public AsyncInvoker<UploadKeystoreRequest, UploadKeystoreResponse> uploadKeystoreAsyncInvoker(
        UploadKeystoreRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.uploadKeystore, hcClient);
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

    /**
     * 获取指定工程的简要构建信息
     *
     * 获取指定工程的简要构建信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBriefRecordRequest 请求对象
     * @return CompletableFuture<ListBriefRecordResponse>
     */
    public CompletableFuture<ListBriefRecordResponse> listBriefRecordAsync(ListBriefRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listBriefRecord);
    }

    /**
     * 获取指定工程的简要构建信息
     *
     * 获取指定工程的简要构建信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBriefRecordRequest 请求对象
     * @return AsyncInvoker<ListBriefRecordRequest, ListBriefRecordResponse>
     */
    public AsyncInvoker<ListBriefRecordRequest, ListBriefRecordResponse> listBriefRecordAsyncInvoker(
        ListBriefRecordRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listBriefRecord, hcClient);
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
     * 获取指定工程的构建记录列表
     *
     * 获取指定工程的构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordsRequest 请求对象
     * @return CompletableFuture<ListRecordsResponse>
     */
    public CompletableFuture<ListRecordsResponse> listRecordsAsync(ListRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listRecords);
    }

    /**
     * 获取指定工程的构建记录列表
     *
     * 获取指定工程的构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordsRequest 请求对象
     * @return AsyncInvoker<ListRecordsRequest, ListRecordsResponse>
     */
    public AsyncInvoker<ListRecordsRequest, ListRecordsResponse> listRecordsAsyncInvoker(ListRecordsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listRecords, hcClient);
    }

    /**
     * 获取任务构建记录列表
     *
     * 获取任务构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildInfoRecordRequest 请求对象
     * @return CompletableFuture<ShowBuildInfoRecordResponse>
     */
    public CompletableFuture<ShowBuildInfoRecordResponse> showBuildInfoRecordAsync(ShowBuildInfoRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showBuildInfoRecord);
    }

    /**
     * 获取任务构建记录列表
     *
     * 获取任务构建记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildInfoRecordRequest 请求对象
     * @return AsyncInvoker<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse>
     */
    public AsyncInvoker<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse> showBuildInfoRecordAsyncInvoker(
        ShowBuildInfoRecordRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showBuildInfoRecord, hcClient);
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
     * 获取构建记录的有向无环图
     *
     * 获取构建记录的有向无环图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordFlowGraphRequest 请求对象
     * @return CompletableFuture<ShowBuildRecordFlowGraphResponse>
     */
    public CompletableFuture<ShowBuildRecordFlowGraphResponse> showBuildRecordFlowGraphAsync(
        ShowBuildRecordFlowGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showBuildRecordFlowGraph);
    }

    /**
     * 获取构建记录的有向无环图
     *
     * 获取构建记录的有向无环图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuildRecordFlowGraphRequest 请求对象
     * @return AsyncInvoker<ShowBuildRecordFlowGraphRequest, ShowBuildRecordFlowGraphResponse>
     */
    public AsyncInvoker<ShowBuildRecordFlowGraphRequest, ShowBuildRecordFlowGraphResponse> showBuildRecordFlowGraphAsyncInvoker(
        ShowBuildRecordFlowGraphRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showBuildRecordFlowGraph, hcClient);
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
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildRecordDetailRequest 请求对象
     * @return CompletableFuture<ShowJobBuildRecordDetailResponse>
     */
    public CompletableFuture<ShowJobBuildRecordDetailResponse> showJobBuildRecordDetailAsync(
        ShowJobBuildRecordDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobBuildRecordDetail);
    }

    /**
     * 获取构建记录信息
     *
     * 获取构建记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobBuildRecordDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobBuildRecordDetailRequest, ShowJobBuildRecordDetailResponse>
     */
    public AsyncInvoker<ShowJobBuildRecordDetailRequest, ShowJobBuildRecordDetailResponse> showJobBuildRecordDetailAsyncInvoker(
        ShowJobBuildRecordDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobBuildRecordDetail, hcClient);
    }

    /**
     * 构建历史页获取构建次数
     *
     * 构建历史页获取构建次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobTotalRequest 请求对象
     * @return CompletableFuture<ShowJobTotalResponse>
     */
    public CompletableFuture<ShowJobTotalResponse> showJobTotalAsync(ShowJobTotalRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showJobTotal);
    }

    /**
     * 构建历史页获取构建次数
     *
     * 构建历史页获取构建次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobTotalRequest 请求对象
     * @return AsyncInvoker<ShowJobTotalRequest, ShowJobTotalResponse>
     */
    public AsyncInvoker<ShowJobTotalRequest, ShowJobTotalResponse> showJobTotalAsyncInvoker(
        ShowJobTotalRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showJobTotal, hcClient);
    }

    /**
     * 获取单元测试覆盖率报告压缩包
     *
     * 获取单元测试覆盖率报告压缩包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadJunitCoverageZipRequest 请求对象
     * @return CompletableFuture<DownloadJunitCoverageZipResponse>
     */
    public CompletableFuture<DownloadJunitCoverageZipResponse> downloadJunitCoverageZipAsync(
        DownloadJunitCoverageZipRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.downloadJunitCoverageZip);
    }

    /**
     * 获取单元测试覆盖率报告压缩包
     *
     * 获取单元测试覆盖率报告压缩包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadJunitCoverageZipRequest 请求对象
     * @return AsyncInvoker<DownloadJunitCoverageZipRequest, DownloadJunitCoverageZipResponse>
     */
    public AsyncInvoker<DownloadJunitCoverageZipRequest, DownloadJunitCoverageZipResponse> downloadJunitCoverageZipAsyncInvoker(
        DownloadJunitCoverageZipRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.downloadJunitCoverageZip, hcClient);
    }

    /**
     * 获取单元测试覆盖率报告列表
     *
     * 获取单元测试覆盖率报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJunitCoverageSummaryRequest 请求对象
     * @return CompletableFuture<ListJunitCoverageSummaryResponse>
     */
    public CompletableFuture<ListJunitCoverageSummaryResponse> listJunitCoverageSummaryAsync(
        ListJunitCoverageSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listJunitCoverageSummary);
    }

    /**
     * 获取单元测试覆盖率报告列表
     *
     * 获取单元测试覆盖率报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJunitCoverageSummaryRequest 请求对象
     * @return AsyncInvoker<ListJunitCoverageSummaryRequest, ListJunitCoverageSummaryResponse>
     */
    public AsyncInvoker<ListJunitCoverageSummaryRequest, ListJunitCoverageSummaryResponse> listJunitCoverageSummaryAsyncInvoker(
        ListJunitCoverageSummaryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listJunitCoverageSummary, hcClient);
    }

    /**
     * 获取该任务所有分支信息
     *
     * 获取该任务所有分支信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoBranchRequest 请求对象
     * @return CompletableFuture<ListRepoBranchResponse>
     */
    public CompletableFuture<ListRepoBranchResponse> listRepoBranchAsync(ListRepoBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listRepoBranch);
    }

    /**
     * 获取该任务所有分支信息
     *
     * 获取该任务所有分支信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoBranchRequest 请求对象
     * @return AsyncInvoker<ListRepoBranchRequest, ListRepoBranchResponse>
     */
    public AsyncInvoker<ListRepoBranchRequest, ListRepoBranchResponse> listRepoBranchAsyncInvoker(
        ListRepoBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listRepoBranch, hcClient);
    }

    /**
     * 查看仓库
     *
     * 查看仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryRequest 请求对象
     * @return CompletableFuture<ListRepositoryResponse>
     */
    public CompletableFuture<ListRepositoryResponse> listRepositoryAsync(ListRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listRepository);
    }

    /**
     * 查看仓库
     *
     * 查看仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryRequest 请求对象
     * @return AsyncInvoker<ListRepositoryRequest, ListRepositoryResponse>
     */
    public AsyncInvoker<ListRepositoryRequest, ListRepositoryResponse> listRepositoryAsyncInvoker(
        ListRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listRepository, hcClient);
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
     * 收藏自定义模板
     *
     * 收藏自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFavouriteCustomTemplateRequest 请求对象
     * @return CompletableFuture<AddFavouriteCustomTemplateResponse>
     */
    public CompletableFuture<AddFavouriteCustomTemplateResponse> addFavouriteCustomTemplateAsync(
        AddFavouriteCustomTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.addFavouriteCustomTemplate);
    }

    /**
     * 收藏自定义模板
     *
     * 收藏自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFavouriteCustomTemplateRequest 请求对象
     * @return AsyncInvoker<AddFavouriteCustomTemplateRequest, AddFavouriteCustomTemplateResponse>
     */
    public AsyncInvoker<AddFavouriteCustomTemplateRequest, AddFavouriteCustomTemplateResponse> addFavouriteCustomTemplateAsyncInvoker(
        AddFavouriteCustomTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.addFavouriteCustomTemplate, hcClient);
    }

    /**
     * 创建构建模板
     *
     * 创建构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CompletableFuture<CreateTemplateResponse>
     */
    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.createTemplate);
    }

    /**
     * 创建构建模板
     *
     * 创建构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.createTemplate, hcClient);
    }

    /**
     * 删除构建模板
     *
     * 删除构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.deleteTemplate);
    }

    /**
     * 删除构建模板
     *
     * 删除构建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.deleteTemplate, hcClient);
    }

    /**
     * 根据条件查询特定模板
     *
     * 根据条件查询特定模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomTemplateRequest 请求对象
     * @return CompletableFuture<ListCustomTemplateResponse>
     */
    public CompletableFuture<ListCustomTemplateResponse> listCustomTemplateAsync(ListCustomTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listCustomTemplate);
    }

    /**
     * 根据条件查询特定模板
     *
     * 根据条件查询特定模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomTemplateRequest 请求对象
     * @return AsyncInvoker<ListCustomTemplateRequest, ListCustomTemplateResponse>
     */
    public AsyncInvoker<ListCustomTemplateRequest, ListCustomTemplateResponse> listCustomTemplateAsyncInvoker(
        ListCustomTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listCustomTemplate, hcClient);
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
     * 获取官方推荐模板
     *
     * 获取官方推荐模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecommendOfficialTemplateRequest 请求对象
     * @return CompletableFuture<ListRecommendOfficialTemplateResponse>
     */
    public CompletableFuture<ListRecommendOfficialTemplateResponse> listRecommendOfficialTemplateAsync(
        ListRecommendOfficialTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.listRecommendOfficialTemplate);
    }

    /**
     * 获取官方推荐模板
     *
     * 获取官方推荐模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecommendOfficialTemplateRequest 请求对象
     * @return AsyncInvoker<ListRecommendOfficialTemplateRequest, ListRecommendOfficialTemplateResponse>
     */
    public AsyncInvoker<ListRecommendOfficialTemplateRequest, ListRecommendOfficialTemplateResponse> listRecommendOfficialTemplateAsyncInvoker(
        ListRecommendOfficialTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.listRecommendOfficialTemplate, hcClient);
    }

    /**
     * 取消收藏自定义模板
     *
     * 取消收藏自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoverFavouriteCustomTemplateRequest 请求对象
     * @return CompletableFuture<RemoverFavouriteCustomTemplateResponse>
     */
    public CompletableFuture<RemoverFavouriteCustomTemplateResponse> removerFavouriteCustomTemplateAsync(
        RemoverFavouriteCustomTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.removerFavouriteCustomTemplate);
    }

    /**
     * 取消收藏自定义模板
     *
     * 取消收藏自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoverFavouriteCustomTemplateRequest 请求对象
     * @return AsyncInvoker<RemoverFavouriteCustomTemplateRequest, RemoverFavouriteCustomTemplateResponse>
     */
    public AsyncInvoker<RemoverFavouriteCustomTemplateRequest, RemoverFavouriteCustomTemplateResponse> removerFavouriteCustomTemplateAsyncInvoker(
        RemoverFavouriteCustomTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.removerFavouriteCustomTemplate, hcClient);
    }

    /**
     * 保存模板使用记录
     *
     * 保存模板使用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTemplateUsedInfoRequest 请求对象
     * @return CompletableFuture<SaveTemplateUsedInfoResponse>
     */
    public CompletableFuture<SaveTemplateUsedInfoResponse> saveTemplateUsedInfoAsync(
        SaveTemplateUsedInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.saveTemplateUsedInfo);
    }

    /**
     * 保存模板使用记录
     *
     * 保存模板使用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTemplateUsedInfoRequest 请求对象
     * @return AsyncInvoker<SaveTemplateUsedInfoRequest, SaveTemplateUsedInfoResponse>
     */
    public AsyncInvoker<SaveTemplateUsedInfoRequest, SaveTemplateUsedInfoResponse> saveTemplateUsedInfoAsyncInvoker(
        SaveTemplateUsedInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.saveTemplateUsedInfo, hcClient);
    }

    /**
     * 根据模板uuid查询特定模板
     *
     * 根据模板uuid查询特定模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateRequest 请求对象
     * @return CompletableFuture<ShowTemplateResponse>
     */
    public CompletableFuture<ShowTemplateResponse> showTemplateAsync(ShowTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsBuildMeta.showTemplate);
    }

    /**
     * 根据模板uuid查询特定模板
     *
     * 根据模板uuid查询特定模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateRequest 请求对象
     * @return AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateAsyncInvoker(
        ShowTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsBuildMeta.showTemplate, hcClient);
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

}
