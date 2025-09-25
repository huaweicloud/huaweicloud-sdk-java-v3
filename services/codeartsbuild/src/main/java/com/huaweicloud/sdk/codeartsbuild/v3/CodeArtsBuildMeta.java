package com.huaweicloud.sdk.codeartsbuild.v3;

import com.huaweicloud.sdk.codeartsbuild.v3.model.AddFavouriteCustomTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddFavouriteCustomTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddFavouriteOfficialTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddFavouriteOfficialTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddFavouriteTaskRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddFavouriteTaskResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddKeystorePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddKeystorePermissionRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.AddKeystorePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ApplyProjectPermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ApplyProjectPermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.BatchDeleteBuildJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.BatchDeleteBuildJobsRequestBody;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckWebhookUrlRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckWebhookUrlResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ClearRecyclingJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ClearRecyclingJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CopyBuildJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CopyJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CopyJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CountdownRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateJobGroupRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateJobGroupResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateNewJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateNewJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesRequestBody;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableTheJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableTheJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DomainsStatusesRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildFullLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildFullLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildRealTimeLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildRealTimeLogResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.JobGroupRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.JobsRequestBody;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecommendOfficialTemplateRequestBody;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.MoveJobGroupRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ProjectPermissionRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RemoverFavouriteCustomTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RemoverFavouriteCustomTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RemoverFavouriteOfficialTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RemoverFavouriteOfficialTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RemoverFavouriteTaskRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RemoverFavouriteTaskResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RestoreRecyclingJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RestoreRecyclingJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RolePermissionsRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SaveTemplateUsedInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SaveTemplateUsedInfoRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SaveTemplateUsedInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SetKeepTimeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SetKeepTimeRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SetKeepTimeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowActionIInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowActionIInfoResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopTheJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopTheJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SwitchedPacketRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.SwitchedPacketResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateJobGroupRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateJobGroupResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystorePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystorePermissionRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystorePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystoreRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewNoticeNewRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNewNoticeNewResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UploadKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UploadKeystoreRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UploadKeystoreResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeArtsBuildMeta {

    public static final HttpRequestDef<BatchDeleteBuildJobsRequest, BatchDeleteBuildJobsResponse> batchDeleteBuildJobs =
        genForBatchDeleteBuildJobs();

    private static HttpRequestDef<BatchDeleteBuildJobsRequest, BatchDeleteBuildJobsResponse> genForBatchDeleteBuildJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteBuildJobsRequest, BatchDeleteBuildJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteBuildJobsRequest.class, BatchDeleteBuildJobsResponse.class)
            .withName("BatchDeleteBuildJobs")
            .withUri("/v1/job/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteBuildJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBuildJobsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteBuildJobsRequest::getBody, BatchDeleteBuildJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBuildJobRequest, CreateBuildJobResponse> createBuildJob =
        genForCreateBuildJob();

    private static HttpRequestDef<CreateBuildJobRequest, CreateBuildJobResponse> genForCreateBuildJob() {
        // basic
        HttpRequestDef.Builder<CreateBuildJobRequest, CreateBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBuildJobRequest.class, CreateBuildJobResponse.class)
                .withName("CreateBuildJob")
                .withUri("/v3/jobs/create")
                .withContentType("application/json");

        // requests
        builder.<CreateBuildJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBuildJobRequestBody.class),
            f -> f.withMarshaller(CreateBuildJobRequest::getBody, CreateBuildJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplatesRequest, CreateTemplatesResponse> createTemplates =
        genForCreateTemplates();

    private static HttpRequestDef<CreateTemplatesRequest, CreateTemplatesResponse> genForCreateTemplates() {
        // basic
        HttpRequestDef.Builder<CreateTemplatesRequest, CreateTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplatesRequest.class, CreateTemplatesResponse.class)
                .withName("CreateTemplates")
                .withUri("/v3/templates/create")
                .withContentType("application/json");

        // requests
        builder.<CreateTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplatesRequestBody.class),
            f -> f.withMarshaller(CreateTemplatesRequest::getBody, CreateTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBuildJobRequest, DeleteBuildJobResponse> deleteBuildJob =
        genForDeleteBuildJob();

    private static HttpRequestDef<DeleteBuildJobRequest, DeleteBuildJobResponse> genForDeleteBuildJob() {
        // basic
        HttpRequestDef.Builder<DeleteBuildJobRequest, DeleteBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteBuildJobRequest.class, DeleteBuildJobResponse.class)
                .withName("DeleteBuildJob")
                .withUri("/v3/jobs/{job_id}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBuildJobRequest::getJobId, DeleteBuildJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplates =
        genForDeleteTemplates();

    private static HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> genForDeleteTemplates() {
        // basic
        HttpRequestDef.Builder<DeleteTemplatesRequest, DeleteTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplatesRequest.class, DeleteTemplatesResponse.class)
                .withName("DeleteTemplates")
                .withUri("/v3/templates/{uuid}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplatesRequest::getUuid, DeleteTemplatesRequest::setUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableBuildJobRequest, DisableBuildJobResponse> disableBuildJob =
        genForDisableBuildJob();

    private static HttpRequestDef<DisableBuildJobRequest, DisableBuildJobResponse> genForDisableBuildJob() {
        // basic
        HttpRequestDef.Builder<DisableBuildJobRequest, DisableBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableBuildJobRequest.class, DisableBuildJobResponse.class)
                .withName("DisableBuildJob")
                .withUri("/v3/jobs/{job_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableBuildJobRequest::getJobId, DisableBuildJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableNoticeRequest, DisableNoticeResponse> disableNotice =
        genForDisableNotice();

    private static HttpRequestDef<DisableNoticeRequest, DisableNoticeResponse> genForDisableNotice() {
        // basic
        HttpRequestDef.Builder<DisableNoticeRequest, DisableNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableNoticeRequest.class, DisableNoticeResponse.class)
                .withName("DisableNotice")
                .withUri("/v3/jobs/notice/{job_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableNoticeRequest::getJobId, DisableNoticeRequest::setJobId));
        builder.<String>withRequestField("notice_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableNoticeRequest::getNoticeType, DisableNoticeRequest::setNoticeType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBuildLogRequest, DownloadBuildLogResponse> downloadBuildLog =
        genForDownloadBuildLog();

    private static HttpRequestDef<DownloadBuildLogRequest, DownloadBuildLogResponse> genForDownloadBuildLog() {
        // basic
        HttpRequestDef.Builder<DownloadBuildLogRequest, DownloadBuildLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadBuildLogRequest.class, DownloadBuildLogResponse.class)
                .withName("DownloadBuildLog")
                .withUri("/v4/{record_id}/download-log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildLogRequest::getRecordId, DownloadBuildLogRequest::setRecordId));
        builder.<String>withRequestField("log_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildLogRequest::getLogLevel, DownloadBuildLogRequest::setLogLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystore =
        genForDownloadKeystore();

    private static HttpRequestDef<DownloadKeystoreRequest, DownloadKeystoreResponse> genForDownloadKeystore() {
        // basic
        HttpRequestDef.Builder<DownloadKeystoreRequest, DownloadKeystoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadKeystoreRequest.class, DownloadKeystoreResponse.class)
                .withName("DownloadKeystore")
                .withUri("/v3/keystore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreRequest::getFileName, DownloadKeystoreRequest::setFileName));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreRequest::getDomainId, DownloadKeystoreRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse> downloadRealTimeLog =
        genForDownloadRealTimeLog();

    private static HttpRequestDef<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse> genForDownloadRealTimeLog() {
        // basic
        HttpRequestDef.Builder<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadRealTimeLogRequest.class, DownloadRealTimeLogResponse.class)
                .withName("DownloadRealTimeLog")
                .withUri("/v3/jobs/{job_id}/{build_no}/real-time-log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRealTimeLogRequest::getJobId, DownloadRealTimeLogRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadRealTimeLogRequest::getBuildNo, DownloadRealTimeLogRequest::setBuildNo));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadRealTimeLogRequest::getOffset, DownloadRealTimeLogRequest::setOffset));
        builder.<Integer>withRequestField("length",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadRealTimeLogRequest::getLength, DownloadRealTimeLogRequest::setLength));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadTaskLogRequest, DownloadTaskLogResponse> downloadTaskLog =
        genForDownloadTaskLog();

    private static HttpRequestDef<DownloadTaskLogRequest, DownloadTaskLogResponse> genForDownloadTaskLog() {
        // basic
        HttpRequestDef.Builder<DownloadTaskLogRequest, DownloadTaskLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadTaskLogRequest.class, DownloadTaskLogResponse.class)
                .withName("DownloadTaskLog")
                .withUri("/v4/{record_id}/task-log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskLogRequest::getRecordId, DownloadTaskLogRequest::setRecordId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskLogRequest::getTaskName, DownloadTaskLogRequest::setTaskName));
        builder.<String>withRequestField("log_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskLogRequest::getLogLevel, DownloadTaskLogRequest::setLogLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableBuildJobRequest, EnableBuildJobResponse> enableBuildJob =
        genForEnableBuildJob();

    private static HttpRequestDef<EnableBuildJobRequest, EnableBuildJobResponse> genForEnableBuildJob() {
        // basic
        HttpRequestDef.Builder<EnableBuildJobRequest, EnableBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableBuildJobRequest.class, EnableBuildJobResponse.class)
                .withName("EnableBuildJob")
                .withUri("/v3/jobs/{job_id}/recover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableBuildJobRequest::getJobId, EnableBuildJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse> listBuildInfoRecord =
        genForListBuildInfoRecord();

    private static HttpRequestDef<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse> genForListBuildInfoRecord() {
        // basic
        HttpRequestDef.Builder<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBuildInfoRecordRequest.class, ListBuildInfoRecordResponse.class)
                .withName("ListBuildInfoRecord")
                .withUri("/v3/jobs/{job_id}/build-info-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getJobId, ListBuildInfoRecordRequest::setJobId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getStartTime, ListBuildInfoRecordRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getEndTime, ListBuildInfoRecordRequest::setEndTime));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getPageIndex, ListBuildInfoRecordRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getPageSize, ListBuildInfoRecordRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobConfigRequest, ListJobConfigResponse> listJobConfig =
        genForListJobConfig();

    private static HttpRequestDef<ListJobConfigRequest, ListJobConfigResponse> genForListJobConfig() {
        // basic
        HttpRequestDef.Builder<ListJobConfigRequest, ListJobConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobConfigRequest.class, ListJobConfigResponse.class)
                .withName("ListJobConfig")
                .withUri("/v3/jobs/{job_id}/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobConfigRequest::getJobId, ListJobConfigRequest::setJobId));
        builder.<String>withRequestField("get_all_params",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobConfigRequest::getGetAllParams, ListJobConfigRequest::setGetAllParams));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeRequest, ListNoticeResponse> listNotice = genForListNotice();

    private static HttpRequestDef<ListNoticeRequest, ListNoticeResponse> genForListNotice() {
        // basic
        HttpRequestDef.Builder<ListNoticeRequest, ListNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticeRequest.class, ListNoticeResponse.class)
                .withName("ListNotice")
                .withUri("/v3/jobs/notice/{job_id}/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticeRequest::getJobId, ListNoticeRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v3/templates/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getName, ListTemplatesRequest::setName));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getPage, ListTemplatesRequest::setPage));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getPageSize, ListTemplatesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunJobRequest, RunJobResponse> runJob = genForRunJob();

    private static HttpRequestDef<RunJobRequest, RunJobResponse> genForRunJob() {
        // basic
        HttpRequestDef.Builder<RunJobRequest, RunJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunJobRequest.class, RunJobResponse.class)
                .withName("RunJob")
                .withUri("/v3/jobs/build")
                .withContentType("application/json");

        // requests
        builder.<RunJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunJobRequestBody.class),
            f -> f.withMarshaller(RunJobRequest::getBody, RunJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> showHistoryDetails =
        genForShowHistoryDetails();

    private static HttpRequestDef<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> genForShowHistoryDetails() {
        // basic
        HttpRequestDef.Builder<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHistoryDetailsRequest.class, ShowHistoryDetailsResponse.class)
                .withName("ShowHistoryDetails")
                .withUri("/v3/jobs/{job_id}/{build_number}/history-details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryDetailsRequest::getJobId, ShowHistoryDetailsRequest::setJobId));
        builder.<Integer>withRequestField("build_number",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryDetailsRequest::getBuildNumber,
                ShowHistoryDetailsRequest::setBuildNumber));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectId =
        genForShowJobListByProjectId();

    private static HttpRequestDef<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> genForShowJobListByProjectId() {
        // basic
        HttpRequestDef.Builder<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobListByProjectIdRequest.class, ShowJobListByProjectIdResponse.class)
            .withName("ShowJobListByProjectId")
            .withUri("/v3/{project_id}/jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getProjectId,
                ShowJobListByProjectIdRequest::setProjectId));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getPageIndex,
                ShowJobListByProjectIdRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getPageSize,
                ShowJobListByProjectIdRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForShowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForShowJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStatusRequest, ShowJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatusRequest.class, ShowJobStatusResponse.class)
                .withName("ShowJobStatus")
                .withUri("/v3/jobs/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getJobId, ShowJobStatusRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> showJobSuccessRatio =
        genForShowJobSuccessRatio();

    private static HttpRequestDef<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> genForShowJobSuccessRatio() {
        // basic
        HttpRequestDef.Builder<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobSuccessRatioRequest.class, ShowJobSuccessRatioResponse.class)
                .withName("ShowJobSuccessRatio")
                .withUri("/v3/jobs/{job_id}/success-ratio")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getJobId, ShowJobSuccessRatioRequest::setJobId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getStartTime, ShowJobSuccessRatioRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getEndTime, ShowJobSuccessRatioRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLastHistoryRequest, ShowLastHistoryResponse> showLastHistory =
        genForShowLastHistory();

    private static HttpRequestDef<ShowLastHistoryRequest, ShowLastHistoryResponse> genForShowLastHistory() {
        // basic
        HttpRequestDef.Builder<ShowLastHistoryRequest, ShowLastHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLastHistoryRequest.class, ShowLastHistoryResponse.class)
                .withName("ShowLastHistory")
                .withUri("/v3/jobs/{project_id}/last-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLastHistoryRequest::getProjectId, ShowLastHistoryRequest::setProjectId));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLastHistoryRequest::getRepositoryName,
                ShowLastHistoryRequest::setRepositoryName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListHistoryRequest, ShowListHistoryResponse> showListHistory =
        genForShowListHistory();

    private static HttpRequestDef<ShowListHistoryRequest, ShowListHistoryResponse> genForShowListHistory() {
        // basic
        HttpRequestDef.Builder<ShowListHistoryRequest, ShowListHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListHistoryRequest.class, ShowListHistoryResponse.class)
                .withName("ShowListHistory")
                .withUri("/v3/jobs/{job_id}/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getJobId, ShowListHistoryRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getOffset, ShowListHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getLimit, ShowListHistoryRequest::setLimit));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getInterval, ShowListHistoryRequest::setInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistory =
        genForShowListPeriodHistory();

    private static HttpRequestDef<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> genForShowListPeriodHistory() {
        // basic
        HttpRequestDef.Builder<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowListPeriodHistoryRequest.class, ShowListPeriodHistoryResponse.class)
            .withName("ShowListPeriodHistory")
            .withUri("/v3/jobs/{job_id}/period-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getJobId, ShowListPeriodHistoryRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getOffset, ShowListPeriodHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getLimit, ShowListPeriodHistoryRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getStartTime,
                ShowListPeriodHistoryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getEndTime, ShowListPeriodHistoryRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOutputInfoRequest, ShowOutputInfoResponse> showOutputInfo =
        genForShowOutputInfo();

    private static HttpRequestDef<ShowOutputInfoRequest, ShowOutputInfoResponse> genForShowOutputInfo() {
        // basic
        HttpRequestDef.Builder<ShowOutputInfoRequest, ShowOutputInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOutputInfoRequest.class, ShowOutputInfoResponse.class)
                .withName("ShowOutputInfo")
                .withUri("/v3/jobs/{job_id}/{build_no}/output-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOutputInfoRequest::getJobId, ShowOutputInfoRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOutputInfoRequest::getBuildNo, ShowOutputInfoRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordDetailRequest, ShowRecordDetailResponse> showRecordDetail =
        genForShowRecordDetail();

    private static HttpRequestDef<ShowRecordDetailRequest, ShowRecordDetailResponse> genForShowRecordDetail() {
        // basic
        HttpRequestDef.Builder<ShowRecordDetailRequest, ShowRecordDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordDetailRequest.class, ShowRecordDetailResponse.class)
                .withName("ShowRecordDetail")
                .withUri("/v4/jobs/{job_id}/{build_no}/record-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordDetailRequest::getJobId, ShowRecordDetailRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordDetailRequest::getBuildNo, ShowRecordDetailRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBuildJobRequest, StopBuildJobResponse> stopBuildJob = genForStopBuildJob();

    private static HttpRequestDef<StopBuildJobRequest, StopBuildJobResponse> genForStopBuildJob() {
        // basic
        HttpRequestDef.Builder<StopBuildJobRequest, StopBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopBuildJobRequest.class, StopBuildJobResponse.class)
                .withName("StopBuildJob")
                .withUri("/v3/jobs/{job_id}/{build_no}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBuildJobRequest::getJobId, StopBuildJobRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StopBuildJobRequest::getBuildNo, StopBuildJobRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBuildJobRequest, UpdateBuildJobResponse> updateBuildJob =
        genForUpdateBuildJob();

    private static HttpRequestDef<UpdateBuildJobRequest, UpdateBuildJobResponse> genForUpdateBuildJob() {
        // basic
        HttpRequestDef.Builder<UpdateBuildJobRequest, UpdateBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateBuildJobRequest.class, UpdateBuildJobResponse.class)
                .withName("UpdateBuildJob")
                .withUri("/v3/jobs/update")
                .withContentType("application/json");

        // requests
        builder.<UpdateBuildJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBuildJobRequestBody.class),
            f -> f.withMarshaller(UpdateBuildJobRequest::getBody, UpdateBuildJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNoticeRequest, UpdateNoticeResponse> updateNotice = genForUpdateNotice();

    private static HttpRequestDef<UpdateNoticeRequest, UpdateNoticeResponse> genForUpdateNotice() {
        // basic
        HttpRequestDef.Builder<UpdateNoticeRequest, UpdateNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateNoticeRequest.class, UpdateNoticeResponse.class)
                .withName("UpdateNotice")
                .withUri("/v3/jobs/notice/{job_id}/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNoticeRequest::getJobId, UpdateNoticeRequest::setJobId));
        builder.<UpdateNoticeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNoticeRequestBody.class),
            f -> f.withMarshaller(UpdateNoticeRequest::getBody, UpdateNoticeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse> listRelatedProjectInfo =
        genForListRelatedProjectInfo();

    private static HttpRequestDef<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse> genForListRelatedProjectInfo() {
        // basic
        HttpRequestDef.Builder<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRelatedProjectInfoRequest.class, ListRelatedProjectInfoResponse.class)
            .withName("ListRelatedProjectInfo")
            .withUri("/v1/domain/project/related-page")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelatedProjectInfoRequest::getPageSize,
                ListRelatedProjectInfoRequest::setPageSize));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelatedProjectInfoRequest::getPageNo, ListRelatedProjectInfoRequest::setPageNo));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelatedProjectInfoRequest::getSearch, ListRelatedProjectInfoRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableInnerSpecRequest, ShowAvailableInnerSpecResponse> showAvailableInnerSpec =
        genForShowAvailableInnerSpec();

    private static HttpRequestDef<ShowAvailableInnerSpecRequest, ShowAvailableInnerSpecResponse> genForShowAvailableInnerSpec() {
        // basic
        HttpRequestDef.Builder<ShowAvailableInnerSpecRequest, ShowAvailableInnerSpecResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAvailableInnerSpecRequest.class, ShowAvailableInnerSpecResponse.class)
            .withName("ShowAvailableInnerSpec")
            .withUri("/v2/resource/spec")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvailableInnerSpecRequest::getProjectId,
                ShowAvailableInnerSpecRequest::setProjectId));
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvailableInnerSpecRequest::getArch, ShowAvailableInnerSpecRequest::setArch));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAvailableInnerSpecResponse::getBody, ShowAvailableInnerSpecResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainStatusRequest, ShowDomainStatusResponse> showDomainStatus =
        genForShowDomainStatus();

    private static HttpRequestDef<ShowDomainStatusRequest, ShowDomainStatusResponse> genForShowDomainStatus() {
        // basic
        HttpRequestDef.Builder<ShowDomainStatusRequest, ShowDomainStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainStatusRequest.class, ShowDomainStatusResponse.class)
                .withName("ShowDomainStatus")
                .withUri("/v1/domain/status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPackageSpecCountDownRequest, ShowPackageSpecCountDownResponse> showPackageSpecCountDown =
        genForShowPackageSpecCountDown();

    private static HttpRequestDef<ShowPackageSpecCountDownRequest, ShowPackageSpecCountDownResponse> genForShowPackageSpecCountDown() {
        // basic
        HttpRequestDef.Builder<ShowPackageSpecCountDownRequest, ShowPackageSpecCountDownResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowPackageSpecCountDownRequest.class, ShowPackageSpecCountDownResponse.class)
                .withName("ShowPackageSpecCountDown")
                .withUri("/v2/resource/countdown")
                .withContentType("application/json");

        // requests
        builder.<CountdownRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CountdownRequestBody.class),
            f -> f.withMarshaller(ShowPackageSpecCountDownRequest::getBody, ShowPackageSpecCountDownRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectPermissionRequest, ShowProjectPermissionResponse> showProjectPermission =
        genForShowProjectPermission();

    private static HttpRequestDef<ShowProjectPermissionRequest, ShowProjectPermissionResponse> genForShowProjectPermission() {
        // basic
        HttpRequestDef.Builder<ShowProjectPermissionRequest, ShowProjectPermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectPermissionRequest.class, ShowProjectPermissionResponse.class)
            .withName("ShowProjectPermission")
            .withUri("/v1/domain/user-permission")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectPermissionRequest::getProjectId,
                ShowProjectPermissionRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRelatedProjectRequest, ShowRelatedProjectResponse> showRelatedProject =
        genForShowRelatedProject();

    private static HttpRequestDef<ShowRelatedProjectRequest, ShowRelatedProjectResponse> genForShowRelatedProject() {
        // basic
        HttpRequestDef.Builder<ShowRelatedProjectRequest, ShowRelatedProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRelatedProjectRequest.class, ShowRelatedProjectResponse.class)
                .withName("ShowRelatedProject")
                .withUri("/v1/domain/project/related")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSummaryBuildJobInfoRequest, ShowSummaryBuildJobInfoResponse> showSummaryBuildJobInfo =
        genForShowSummaryBuildJobInfo();

    private static HttpRequestDef<ShowSummaryBuildJobInfoRequest, ShowSummaryBuildJobInfoResponse> genForShowSummaryBuildJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowSummaryBuildJobInfoRequest, ShowSummaryBuildJobInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSummaryBuildJobInfoRequest.class, ShowSummaryBuildJobInfoResponse.class)
            .withName("ShowSummaryBuildJobInfo")
            .withUri("/v1/domain/job-summary")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserChargeTypeRequest, ShowUserChargeTypeResponse> showUserChargeType =
        genForShowUserChargeType();

    private static HttpRequestDef<ShowUserChargeTypeRequest, ShowUserChargeTypeResponse> genForShowUserChargeType() {
        // basic
        HttpRequestDef.Builder<ShowUserChargeTypeRequest, ShowUserChargeTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserChargeTypeRequest.class, ShowUserChargeTypeResponse.class)
                .withName("ShowUserChargeType")
                .withUri("/v1/domain/charge-type")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserOverPackageQuotaRequest, ShowUserOverPackageQuotaResponse> showUserOverPackageQuota =
        genForShowUserOverPackageQuota();

    private static HttpRequestDef<ShowUserOverPackageQuotaRequest, ShowUserOverPackageQuotaResponse> genForShowUserOverPackageQuota() {
        // basic
        HttpRequestDef.Builder<ShowUserOverPackageQuotaRequest, ShowUserOverPackageQuotaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowUserOverPackageQuotaRequest.class, ShowUserOverPackageQuotaResponse.class)
                .withName("ShowUserOverPackageQuota")
                .withUri("/v1/domain/package/quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserOverPackageQuotaRequest::getProjectId,
                ShowUserOverPackageQuotaRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobGroupRequest, CreateJobGroupResponse> createJobGroup =
        genForCreateJobGroup();

    private static HttpRequestDef<CreateJobGroupRequest, CreateJobGroupResponse> genForCreateJobGroup() {
        // basic
        HttpRequestDef.Builder<CreateJobGroupRequest, CreateJobGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateJobGroupRequest.class, CreateJobGroupResponse.class)
                .withName("CreateJobGroup")
                .withUri("/v1/job/{project_id}/group/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateJobGroupRequest::getProjectId, CreateJobGroupRequest::setProjectId));
        builder.<JobGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobGroupRequestBody.class),
            f -> f.withMarshaller(CreateJobGroupRequest::getBody, CreateJobGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> deleteGroup = genForDeleteGroup();

    private static HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> genForDeleteGroup() {
        // basic
        HttpRequestDef.Builder<DeleteGroupRequest, DeleteGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGroupRequest.class, DeleteGroupResponse.class)
                .withName("DeleteGroup")
                .withUri("/v1/job/{project_id}/group/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getProjectId, DeleteGroupRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getId, DeleteGroupRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupTreeRequest, ListGroupTreeResponse> listGroupTree =
        genForListGroupTree();

    private static HttpRequestDef<ListGroupTreeRequest, ListGroupTreeResponse> genForListGroupTree() {
        // basic
        HttpRequestDef.Builder<ListGroupTreeRequest, ListGroupTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupTreeRequest.class, ListGroupTreeResponse.class)
                .withName("ListGroupTree")
                .withUri("/v1/job/{project_id}/group/tree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupTreeRequest::getProjectId, ListGroupTreeRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MoveGroupRequest, MoveGroupResponse> moveGroup = genForMoveGroup();

    private static HttpRequestDef<MoveGroupRequest, MoveGroupResponse> genForMoveGroup() {
        // basic
        HttpRequestDef.Builder<MoveGroupRequest, MoveGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MoveGroupRequest.class, MoveGroupResponse.class)
                .withName("MoveGroup")
                .withUri("/v1/job/{project_id}/group/move")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveGroupRequest::getProjectId, MoveGroupRequest::setProjectId));
        builder.<MoveJobGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MoveJobGroupRequestBody.class),
            f -> f.withMarshaller(MoveGroupRequest::getBody, MoveGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchedPacketRequest, SwitchedPacketResponse> switchedPacket =
        genForSwitchedPacket();

    private static HttpRequestDef<SwitchedPacketRequest, SwitchedPacketResponse> genForSwitchedPacket() {
        // basic
        HttpRequestDef.Builder<SwitchedPacketRequest, SwitchedPacketResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchedPacketRequest.class, SwitchedPacketResponse.class)
                .withName("SwitchedPacket")
                .withUri("/v1/job/{project_id}/group/swap")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchedPacketRequest::getProjectId, SwitchedPacketRequest::setProjectId));
        builder.<String>withRequestField("source_group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchedPacketRequest::getSourceGroupId, SwitchedPacketRequest::setSourceGroupId));
        builder.<String>withRequestField("target_group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchedPacketRequest::getTargetGroupId, SwitchedPacketRequest::setTargetGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobGroupRequest, UpdateJobGroupResponse> updateJobGroup =
        genForUpdateJobGroup();

    private static HttpRequestDef<UpdateJobGroupRequest, UpdateJobGroupResponse> genForUpdateJobGroup() {
        // basic
        HttpRequestDef.Builder<UpdateJobGroupRequest, UpdateJobGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobGroupRequest.class, UpdateJobGroupResponse.class)
                .withName("UpdateJobGroup")
                .withUri("/v1/job/{project_id}/group/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobGroupRequest::getProjectId, UpdateJobGroupRequest::setProjectId));
        builder.<JobGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobGroupRequestBody.class),
            f -> f.withMarshaller(UpdateJobGroupRequest::getBody, UpdateJobGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse> showDockerfileTemplate =
        genForShowDockerfileTemplate();

    private static HttpRequestDef<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse> genForShowDockerfileTemplate() {
        // basic
        HttpRequestDef.Builder<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDockerfileTemplateRequest.class, ShowDockerfileTemplateResponse.class)
            .withName("ShowDockerfileTemplate")
            .withUri("/v1/image/dockerfile-template")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDockerfileTemplateRequest::getImageId,
                ShowDockerfileTemplateRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageTemplateListRequest, ShowImageTemplateListResponse> showImageTemplateList =
        genForShowImageTemplateList();

    private static HttpRequestDef<ShowImageTemplateListRequest, ShowImageTemplateListResponse> genForShowImageTemplateList() {
        // basic
        HttpRequestDef.Builder<ShowImageTemplateListRequest, ShowImageTemplateListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowImageTemplateListRequest.class, ShowImageTemplateListResponse.class)
            .withName("ShowImageTemplateList")
            .withUri("/v1/image/templates")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFavouriteTaskRequest, AddFavouriteTaskResponse> addFavouriteTask =
        genForAddFavouriteTask();

    private static HttpRequestDef<AddFavouriteTaskRequest, AddFavouriteTaskResponse> genForAddFavouriteTask() {
        // basic
        HttpRequestDef.Builder<AddFavouriteTaskRequest, AddFavouriteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFavouriteTaskRequest.class, AddFavouriteTaskResponse.class)
                .withName("AddFavouriteTask")
                .withUri("/v1/job/{job_id}/follow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFavouriteTaskRequest::getJobId, AddFavouriteTaskRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyProjectPermissionRequest, ApplyProjectPermissionResponse> applyProjectPermission =
        genForApplyProjectPermission();

    private static HttpRequestDef<ApplyProjectPermissionRequest, ApplyProjectPermissionResponse> genForApplyProjectPermission() {
        // basic
        HttpRequestDef.Builder<ApplyProjectPermissionRequest, ApplyProjectPermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ApplyProjectPermissionRequest.class, ApplyProjectPermissionResponse.class)
            .withName("ApplyProjectPermission")
            .withUri("/v1/job/project/permission")
            .withContentType("application/json");

        // requests
        builder.<ProjectPermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProjectPermissionRequestBody.class),
            f -> f.withMarshaller(ApplyProjectPermissionRequest::getBody, ApplyProjectPermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateJobRolePermissionRequest, BatchUpdateJobRolePermissionResponse> batchUpdateJobRolePermission =
        genForBatchUpdateJobRolePermission();

    private static HttpRequestDef<BatchUpdateJobRolePermissionRequest, BatchUpdateJobRolePermissionResponse> genForBatchUpdateJobRolePermission() {
        // basic
        HttpRequestDef.Builder<BatchUpdateJobRolePermissionRequest, BatchUpdateJobRolePermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUpdateJobRolePermissionRequest.class,
                    BatchUpdateJobRolePermissionResponse.class)
                .withName("BatchUpdateJobRolePermission")
                .withUri("/v1/job/permissions/batch")
                .withContentType("application/json");

        // requests
        builder.<RolePermissionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RolePermissionsRequestBody.class),
            f -> f.withMarshaller(BatchUpdateJobRolePermissionRequest::getBody,
                BatchUpdateJobRolePermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckJobCountIsTopLimitRequest, CheckJobCountIsTopLimitResponse> checkJobCountIsTopLimit =
        genForCheckJobCountIsTopLimit();

    private static HttpRequestDef<CheckJobCountIsTopLimitRequest, CheckJobCountIsTopLimitResponse> genForCheckJobCountIsTopLimit() {
        // basic
        HttpRequestDef.Builder<CheckJobCountIsTopLimitRequest, CheckJobCountIsTopLimitResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckJobCountIsTopLimitRequest.class, CheckJobCountIsTopLimitResponse.class)
            .withName("CheckJobCountIsTopLimit")
            .withUri("/v1/job/check/count")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckJobInternalRequest, CheckJobInternalResponse> checkJobInternal =
        genForCheckJobInternal();

    private static HttpRequestDef<CheckJobInternalRequest, CheckJobInternalResponse> genForCheckJobInternal() {
        // basic
        HttpRequestDef.Builder<CheckJobInternalRequest, CheckJobInternalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckJobInternalRequest.class, CheckJobInternalResponse.class)
                .withName("CheckJobInternal")
                .withUri("/v1/job/permission/internal")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse> checkJobNameIsExists =
        genForCheckJobNameIsExists();

    private static HttpRequestDef<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse> genForCheckJobNameIsExists() {
        // basic
        HttpRequestDef.Builder<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckJobNameIsExistsRequest.class, CheckJobNameIsExistsResponse.class)
            .withName("CheckJobNameIsExists")
            .withUri("/v1/job/check/exist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckJobNameIsExistsRequest::getProjectId,
                CheckJobNameIsExistsRequest::setProjectId));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckJobNameIsExistsRequest::getJobName, CheckJobNameIsExistsRequest::setJobName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckWebhookUrlRequest, CheckWebhookUrlResponse> checkWebhookUrl =
        genForCheckWebhookUrl();

    private static HttpRequestDef<CheckWebhookUrlRequest, CheckWebhookUrlResponse> genForCheckWebhookUrl() {
        // basic
        HttpRequestDef.Builder<CheckWebhookUrlRequest, CheckWebhookUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckWebhookUrlRequest.class, CheckWebhookUrlResponse.class)
                .withName("CheckWebhookUrl")
                .withUri("/v1/job/check/webhook-url")
                .withContentType("application/json");

        // requests
        builder.<CheckWebhookUrlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckWebhookUrlRequestBody.class),
            f -> f.withMarshaller(CheckWebhookUrlRequest::getBody, CheckWebhookUrlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ClearRecyclingJobsRequest, ClearRecyclingJobsResponse> clearRecyclingJobs =
        genForClearRecyclingJobs();

    private static HttpRequestDef<ClearRecyclingJobsRequest, ClearRecyclingJobsResponse> genForClearRecyclingJobs() {
        // basic
        HttpRequestDef.Builder<ClearRecyclingJobsRequest, ClearRecyclingJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, ClearRecyclingJobsRequest.class, ClearRecyclingJobsResponse.class)
                .withName("ClearRecyclingJobs")
                .withUri("/v1/job/recycling-empty")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyJobRequest, CopyJobResponse> copyJob = genForCopyJob();

    private static HttpRequestDef<CopyJobRequest, CopyJobResponse> genForCopyJob() {
        // basic
        HttpRequestDef.Builder<CopyJobRequest, CopyJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyJobRequest.class, CopyJobResponse.class)
                .withName("CopyJob")
                .withUri("/v1/job/copy")
                .withContentType("application/json");

        // requests
        builder.<CopyBuildJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyBuildJobRequestBody.class),
            f -> f.withMarshaller(CopyJobRequest::getBody, CopyJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNewJobRequest, CreateNewJobResponse> createNewJob = genForCreateNewJob();

    private static HttpRequestDef<CreateNewJobRequest, CreateNewJobResponse> genForCreateNewJob() {
        // basic
        HttpRequestDef.Builder<CreateNewJobRequest, CreateNewJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNewJobRequest.class, CreateNewJobResponse.class)
                .withName("CreateNewJob")
                .withUri("/v1/job/create")
                .withContentType("application/json");

        // requests
        builder.<CreateBuildJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBuildJobRequestBody.class),
            f -> f.withMarshaller(CreateNewJobRequest::getBody, CreateNewJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecyclingJobsRequest, DeleteRecyclingJobsResponse> deleteRecyclingJobs =
        genForDeleteRecyclingJobs();

    private static HttpRequestDef<DeleteRecyclingJobsRequest, DeleteRecyclingJobsResponse> genForDeleteRecyclingJobs() {
        // basic
        HttpRequestDef.Builder<DeleteRecyclingJobsRequest, DeleteRecyclingJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteRecyclingJobsRequest.class, DeleteRecyclingJobsResponse.class)
            .withName("DeleteRecyclingJobs")
            .withUri("/v1/job/recycling-deletion")
            .withContentType("application/json");

        // requests
        builder.<JobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobsRequestBody.class),
            f -> f.withMarshaller(DeleteRecyclingJobsRequest::getBody, DeleteRecyclingJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTheJobRequest, DeleteTheJobResponse> deleteTheJob = genForDeleteTheJob();

    private static HttpRequestDef<DeleteTheJobRequest, DeleteTheJobResponse> genForDeleteTheJob() {
        // basic
        HttpRequestDef.Builder<DeleteTheJobRequest, DeleteTheJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTheJobRequest.class, DeleteTheJobResponse.class)
                .withName("DeleteTheJob")
                .withUri("/v1/job/{job_id}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTheJobRequest::getJobId, DeleteTheJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableTheJobRequest, DisableTheJobResponse> disableTheJob =
        genForDisableTheJob();

    private static HttpRequestDef<DisableTheJobRequest, DisableTheJobResponse> genForDisableTheJob() {
        // basic
        HttpRequestDef.Builder<DisableTheJobRequest, DisableTheJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableTheJobRequest.class, DisableTheJobResponse.class)
                .withName("DisableTheJob")
                .withUri("/v1/job/{job_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableTheJobRequest::getJobId, DisableTheJobRequest::setJobId));
        builder.<DisableTheJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisableTheJobRequestBody.class),
            f -> f.withMarshaller(DisableTheJobRequest::getBody, DisableTheJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> executeJob = genForExecuteJob();

    private static HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> genForExecuteJob() {
        // basic
        HttpRequestDef.Builder<ExecuteJobRequest, ExecuteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteJobRequest.class, ExecuteJobResponse.class)
                .withName("ExecuteJob")
                .withUri("/v1/job/execute")
                .withContentType("application/json");

        // requests
        builder.<RunJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunJobRequestBody.class),
            f -> f.withMarshaller(ExecuteJobRequest::getBody, ExecuteJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBuildParameterRequest, ListBuildParameterResponse> listBuildParameter =
        genForListBuildParameter();

    private static HttpRequestDef<ListBuildParameterRequest, ListBuildParameterResponse> genForListBuildParameter() {
        // basic
        HttpRequestDef.Builder<ListBuildParameterRequest, ListBuildParameterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBuildParameterRequest.class, ListBuildParameterResponse.class)
                .withName("ListBuildParameter")
                .withUri("/v1/job/{job_id}/{build_no}/history-parameters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildParameterRequest::getJobId, ListBuildParameterRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildParameterRequest::getBuildNo, ListBuildParameterRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndPointsRequest, ListEndPointsResponse> listEndPoints =
        genForListEndPoints();

    private static HttpRequestDef<ListEndPointsRequest, ListEndPointsResponse> genForListEndPoints() {
        // basic
        HttpRequestDef.Builder<ListEndPointsRequest, ListEndPointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndPointsRequest.class, ListEndPointsResponse.class)
                .withName("ListEndPoints")
                .withUri("/v1/job/{project_id}/nexus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndPointsRequest::getProjectId, ListEndPointsRequest::setProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndPointsRequest::getLimit, ListEndPointsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndPointsRequest::getOffset, ListEndPointsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobRequest, ListJobResponse> listJob = genForListJob();

    private static HttpRequestDef<ListJobRequest, ListJobResponse> genForListJob() {
        // basic
        HttpRequestDef.Builder<ListJobRequest, ListJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobRequest.class, ListJobResponse.class)
                .withName("ListJob")
                .withUri("/v1/job/list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRequest::getPageIndex, ListJobRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRequest::getPageSize, ListJobRequest::setPageSize));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSearch, ListJobRequest::setSearch));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSortField, ListJobRequest::setSortField));
        builder.<String>withRequestField("sort_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSortOrder, ListJobRequest::setSortOrder));
        builder.<String>withRequestField("creator_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getCreatorId, ListJobRequest::setCreatorId));
        builder.<String>withRequestField("build_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getBuildStatus, ListJobRequest::setBuildStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectJobsRequest, ListProjectJobsResponse> listProjectJobs =
        genForListProjectJobs();

    private static HttpRequestDef<ListProjectJobsRequest, ListProjectJobsResponse> genForListProjectJobs() {
        // basic
        HttpRequestDef.Builder<ListProjectJobsRequest, ListProjectJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectJobsRequest.class, ListProjectJobsResponse.class)
                .withName("ListProjectJobs")
                .withUri("/v1/job/{project_id}/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getProjectId, ListProjectJobsRequest::setProjectId));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getPageIndex, ListProjectJobsRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getPageSize, ListProjectJobsRequest::setPageSize));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getSearch, ListProjectJobsRequest::setSearch));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getSortField, ListProjectJobsRequest::setSortField));
        builder.<String>withRequestField("sort_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getSortOrder, ListProjectJobsRequest::setSortOrder));
        builder.<String>withRequestField("creator_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getCreatorId, ListProjectJobsRequest::setCreatorId));
        builder.<String>withRequestField("build_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getBuildStatus, ListProjectJobsRequest::setBuildStatus));
        builder.<Boolean>withRequestField("by_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getByGroup, ListProjectJobsRequest::setByGroup));
        builder.<String>withRequestField("group_path_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getGroupPathId, ListProjectJobsRequest::setGroupPathId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecyclingJobRequest, ListRecyclingJobResponse> listRecyclingJob =
        genForListRecyclingJob();

    private static HttpRequestDef<ListRecyclingJobRequest, ListRecyclingJobResponse> genForListRecyclingJob() {
        // basic
        HttpRequestDef.Builder<ListRecyclingJobRequest, ListRecyclingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecyclingJobRequest.class, ListRecyclingJobResponse.class)
                .withName("ListRecyclingJob")
                .withUri("/v1/job/recycling-jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecyclingJobRequest::getPageSize, ListRecyclingJobRequest::setPageSize));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecyclingJobRequest::getPageNo, ListRecyclingJobRequest::setPageNo));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecyclingJobRequest::getSearch, ListRecyclingJobRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpdateJobHistoryRequest, ListUpdateJobHistoryResponse> listUpdateJobHistory =
        genForListUpdateJobHistory();

    private static HttpRequestDef<ListUpdateJobHistoryRequest, ListUpdateJobHistoryResponse> genForListUpdateJobHistory() {
        // basic
        HttpRequestDef.Builder<ListUpdateJobHistoryRequest, ListUpdateJobHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpdateJobHistoryRequest.class, ListUpdateJobHistoryResponse.class)
            .withName("ListUpdateJobHistory")
            .withUri("/v1/job/{job_id}/history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpdateJobHistoryRequest::getJobId, ListUpdateJobHistoryRequest::setJobId));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdateJobHistoryRequest::getPageNo, ListUpdateJobHistoryRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdateJobHistoryRequest::getPageSize, ListUpdateJobHistoryRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoverFavouriteTaskRequest, RemoverFavouriteTaskResponse> removerFavouriteTask =
        genForRemoverFavouriteTask();

    private static HttpRequestDef<RemoverFavouriteTaskRequest, RemoverFavouriteTaskResponse> genForRemoverFavouriteTask() {
        // basic
        HttpRequestDef.Builder<RemoverFavouriteTaskRequest, RemoverFavouriteTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RemoverFavouriteTaskRequest.class, RemoverFavouriteTaskResponse.class)
            .withName("RemoverFavouriteTask")
            .withUri("/v1/job/{job_id}/unfollow")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoverFavouriteTaskRequest::getJobId, RemoverFavouriteTaskRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreRecyclingJobsRequest, RestoreRecyclingJobsResponse> restoreRecyclingJobs =
        genForRestoreRecyclingJobs();

    private static HttpRequestDef<RestoreRecyclingJobsRequest, RestoreRecyclingJobsResponse> genForRestoreRecyclingJobs() {
        // basic
        HttpRequestDef.Builder<RestoreRecyclingJobsRequest, RestoreRecyclingJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestoreRecyclingJobsRequest.class, RestoreRecyclingJobsResponse.class)
            .withName("RestoreRecyclingJobs")
            .withUri("/v1/job/recycling-restoration")
            .withContentType("application/json");

        // requests
        builder.<JobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobsRequestBody.class),
            f -> f.withMarshaller(RestoreRecyclingJobsRequest::getBody, RestoreRecyclingJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetKeepTimeRequest, SetKeepTimeResponse> setKeepTime = genForSetKeepTime();

    private static HttpRequestDef<SetKeepTimeRequest, SetKeepTimeResponse> genForSetKeepTime() {
        // basic
        HttpRequestDef.Builder<SetKeepTimeRequest, SetKeepTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetKeepTimeRequest.class, SetKeepTimeResponse.class)
                .withName("SetKeepTime")
                .withUri("/v1/job/keep-time")
                .withContentType("application/json");

        // requests
        builder.<SetKeepTimeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetKeepTimeRequestBody.class),
            f -> f.withMarshaller(SetKeepTimeRequest::getBody, SetKeepTimeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildDetailsRequest, ShowBuildDetailsResponse> showBuildDetails =
        genForShowBuildDetails();

    private static HttpRequestDef<ShowBuildDetailsRequest, ShowBuildDetailsResponse> genForShowBuildDetails() {
        // basic
        HttpRequestDef.Builder<ShowBuildDetailsRequest, ShowBuildDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBuildDetailsRequest.class, ShowBuildDetailsResponse.class)
                .withName("ShowBuildDetails")
                .withUri("/v1/job/{job_id}/{build_no}/build-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildDetailsRequest::getJobId, ShowBuildDetailsRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBuildDetailsRequest::getBuildNo, ShowBuildDetailsRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildParamsListRequest, ShowBuildParamsListResponse> showBuildParamsList =
        genForShowBuildParamsList();

    private static HttpRequestDef<ShowBuildParamsListRequest, ShowBuildParamsListResponse> genForShowBuildParamsList() {
        // basic
        HttpRequestDef.Builder<ShowBuildParamsListRequest, ShowBuildParamsListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBuildParamsListRequest.class, ShowBuildParamsListResponse.class)
                .withName("ShowBuildParamsList")
                .withUri("/v1/job/build-params")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCopyNameRequest, ShowCopyNameResponse> showCopyName = genForShowCopyName();

    private static HttpRequestDef<ShowCopyNameRequest, ShowCopyNameResponse> genForShowCopyName() {
        // basic
        HttpRequestDef.Builder<ShowCopyNameRequest, ShowCopyNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCopyNameRequest.class, ShowCopyNameResponse.class)
                .withName("ShowCopyName")
                .withUri("/v1/job/{job_id}/copy-name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCopyNameRequest::getJobId, ShowCopyNameRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse> showDefaultBuildParameters =
        genForShowDefaultBuildParameters();

    private static HttpRequestDef<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse> genForShowDefaultBuildParameters() {
        // basic
        HttpRequestDef.Builder<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDefaultBuildParametersRequest.class,
                    ShowDefaultBuildParametersResponse.class)
                .withName("ShowDefaultBuildParameters")
                .withUri("/v1/job/default-parameters")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDefaultProjectPermissionRequest, ShowDefaultProjectPermissionResponse> showDefaultProjectPermission =
        genForShowDefaultProjectPermission();

    private static HttpRequestDef<ShowDefaultProjectPermissionRequest, ShowDefaultProjectPermissionResponse> genForShowDefaultProjectPermission() {
        // basic
        HttpRequestDef.Builder<ShowDefaultProjectPermissionRequest, ShowDefaultProjectPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDefaultProjectPermissionRequest.class,
                    ShowDefaultProjectPermissionResponse.class)
                .withName("ShowDefaultProjectPermission")
                .withUri("/v1/job/project/default-permission")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDefaultProjectPermissionRequest::getProjectId,
                ShowDefaultProjectPermissionRequest::setProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDefaultProjectPermissionRequest::getJobId,
                ShowDefaultProjectPermissionRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDisableRequest, ShowDisableResponse> showDisable = genForShowDisable();

    private static HttpRequestDef<ShowDisableRequest, ShowDisableResponse> genForShowDisable() {
        // basic
        HttpRequestDef.Builder<ShowDisableRequest, ShowDisableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDisableRequest.class, ShowDisableResponse.class)
                .withName("ShowDisable")
                .withUri("/v1/job/{job_id}/check/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDisableRequest::getJobId, ShowDisableRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainsStatusesRequest, ShowDomainsStatusesResponse> showDomainsStatuses =
        genForShowDomainsStatuses();

    private static HttpRequestDef<ShowDomainsStatusesRequest, ShowDomainsStatusesResponse> genForShowDomainsStatuses() {
        // basic
        HttpRequestDef.Builder<ShowDomainsStatusesRequest, ShowDomainsStatusesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDomainsStatusesRequest.class, ShowDomainsStatusesResponse.class)
                .withName("ShowDomainsStatuses")
                .withUri("/v1/domain/domains-statuses")
                .withContentType("application/json");

        // requests
        builder.<DomainsStatusesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainsStatusesRequestBody.class),
            f -> f.withMarshaller(ShowDomainsStatusesRequest::getBody, ShowDomainsStatusesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfig =
        genForShowJobConfig();

    private static HttpRequestDef<ShowJobConfigRequest, ShowJobConfigResponse> genForShowJobConfig() {
        // basic
        HttpRequestDef.Builder<ShowJobConfigRequest, ShowJobConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobConfigRequest.class, ShowJobConfigResponse.class)
                .withName("ShowJobConfig")
                .withUri("/v1/job/{job_id}/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigRequest::getJobId, ShowJobConfigRequest::setJobId));
        builder.<String>withRequestField("get_all_params",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigRequest::getGetAllParams, ShowJobConfigRequest::setGetAllParams));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse> showJobConfigDiff =
        genForShowJobConfigDiff();

    private static HttpRequestDef<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse> genForShowJobConfigDiff() {
        // basic
        HttpRequestDef.Builder<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobConfigDiffRequest.class, ShowJobConfigDiffResponse.class)
                .withName("ShowJobConfigDiff")
                .withUri("/v1/job/{job_id}/diff")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigDiffRequest::getJobId, ShowJobConfigDiffRequest::setJobId));
        builder.<String>withRequestField("revisedl_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigDiffRequest::getRevisedlNo, ShowJobConfigDiffRequest::setRevisedlNo));
        builder.<String>withRequestField("original_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigDiffRequest::getOriginalNo, ShowJobConfigDiffRequest::setOriginalNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfo = genForShowJobInfo();

    private static HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> genForShowJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowJobInfoRequest, ShowJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInfoRequest.class, ShowJobInfoResponse.class)
                .withName("ShowJobInfo")
                .withUri("/v1/job/{job_id}/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getJobId, ShowJobInfoRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse> showJobNoticeConfigInfo =
        genForShowJobNoticeConfigInfo();

    private static HttpRequestDef<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse> genForShowJobNoticeConfigInfo() {
        // basic
        HttpRequestDef.Builder<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobNoticeConfigInfoRequest.class, ShowJobNoticeConfigInfoResponse.class)
            .withName("ShowJobNoticeConfigInfo")
            .withUri("/v1/job/{job_id}/notice")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobNoticeConfigInfoRequest::getJobId, ShowJobNoticeConfigInfoRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobPipelineInfoRequest, ShowJobPipelineInfoResponse> showJobPipelineInfo =
        genForShowJobPipelineInfo();

    private static HttpRequestDef<ShowJobPipelineInfoRequest, ShowJobPipelineInfoResponse> genForShowJobPipelineInfo() {
        // basic
        HttpRequestDef.Builder<ShowJobPipelineInfoRequest, ShowJobPipelineInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobPipelineInfoRequest.class, ShowJobPipelineInfoResponse.class)
                .withName("ShowJobPipelineInfo")
                .withUri("/v1/job/{job_id}/pipeline-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobPipelineInfoRequest::getJobId, ShowJobPipelineInfoRequest::setJobId));
        builder.<String>withRequestField("all",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobPipelineInfoRequest::getAll, ShowJobPipelineInfoRequest::setAll));
        builder.<String>withRequestField("check_param_used",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobPipelineInfoRequest::getCheckParamUsed,
                ShowJobPipelineInfoRequest::setCheckParamUsed));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse> showJobRolePermission =
        genForShowJobRolePermission();

    private static HttpRequestDef<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse> genForShowJobRolePermission() {
        // basic
        HttpRequestDef.Builder<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobRolePermissionRequest.class, ShowJobRolePermissionResponse.class)
            .withName("ShowJobRolePermission")
            .withUri("/v1/job/permission/role")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRolePermissionRequest::getJobId, ShowJobRolePermissionRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStepStatusRequest, ShowJobStepStatusResponse> showJobStepStatus =
        genForShowJobStepStatus();

    private static HttpRequestDef<ShowJobStepStatusRequest, ShowJobStepStatusResponse> genForShowJobStepStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStepStatusRequest, ShowJobStepStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStepStatusRequest.class, ShowJobStepStatusResponse.class)
                .withName("ShowJobStepStatus")
                .withUri("/v1/job/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStepStatusRequest::getJobId, ShowJobStepStatusRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobStepStatusRequest::getBuildNo, ShowJobStepStatusRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse> showJobSystemParameters =
        genForShowJobSystemParameters();

    private static HttpRequestDef<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse> genForShowJobSystemParameters() {
        // basic
        HttpRequestDef.Builder<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobSystemParametersRequest.class, ShowJobSystemParametersResponse.class)
            .withName("ShowJobSystemParameters")
            .withUri("/v1/job/system-parameters")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectJobPermissionRequest, ShowProjectJobPermissionResponse> showProjectJobPermission =
        genForShowProjectJobPermission();

    private static HttpRequestDef<ShowProjectJobPermissionRequest, ShowProjectJobPermissionResponse> genForShowProjectJobPermission() {
        // basic
        HttpRequestDef.Builder<ShowProjectJobPermissionRequest, ShowProjectJobPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowProjectJobPermissionRequest.class, ShowProjectJobPermissionResponse.class)
                .withName("ShowProjectJobPermission")
                .withUri("/v1/job/permission")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectJobPermissionRequest::getProjectId,
                ShowProjectJobPermissionRequest::setProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectJobPermissionRequest::getJobId,
                ShowProjectJobPermissionRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRunningStatusRequest, ShowRunningStatusResponse> showRunningStatus =
        genForShowRunningStatus();

    private static HttpRequestDef<ShowRunningStatusRequest, ShowRunningStatusResponse> genForShowRunningStatus() {
        // basic
        HttpRequestDef.Builder<ShowRunningStatusRequest, ShowRunningStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRunningStatusRequest.class, ShowRunningStatusResponse.class)
                .withName("ShowRunningStatus")
                .withUri("/v1/job/{job_id}/running-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRunningStatusRequest::getJobId, ShowRunningStatusRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTheJobRequest, StopTheJobResponse> stopTheJob = genForStopTheJob();

    private static HttpRequestDef<StopTheJobRequest, StopTheJobResponse> genForStopTheJob() {
        // basic
        HttpRequestDef.Builder<StopTheJobRequest, StopTheJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTheJobRequest.class, StopTheJobResponse.class)
                .withName("StopTheJob")
                .withUri("/v1/job/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopTheJobRequest::getJobId, StopTheJobRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StopTheJobRequest::getBuildNo, StopTheJobRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNewJobRequest, UpdateNewJobResponse> updateNewJob = genForUpdateNewJob();

    private static HttpRequestDef<UpdateNewJobRequest, UpdateNewJobResponse> genForUpdateNewJob() {
        // basic
        HttpRequestDef.Builder<UpdateNewJobRequest, UpdateNewJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateNewJobRequest.class, UpdateNewJobResponse.class)
                .withName("UpdateNewJob")
                .withUri("/v1/job/update")
                .withContentType("application/json");

        // requests
        builder.<UpdateBuildJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBuildJobRequestBody.class),
            f -> f.withMarshaller(UpdateNewJobRequest::getBody, UpdateNewJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNewNoticeNewRequest, UpdateNewNoticeNewResponse> updateNewNoticeNew =
        genForUpdateNewNoticeNew();

    private static HttpRequestDef<UpdateNewNoticeNewRequest, UpdateNewNoticeNewResponse> genForUpdateNewNoticeNew() {
        // basic
        HttpRequestDef.Builder<UpdateNewNoticeNewRequest, UpdateNewNoticeNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNewNoticeNewRequest.class, UpdateNewNoticeNewResponse.class)
                .withName("UpdateNewNoticeNew")
                .withUri("/v1/job/{job_id}/notice")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewNoticeNewRequest::getJobId, UpdateNewNoticeNewRequest::setJobId));
        builder.<UpdateNoticeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNoticeRequestBody.class),
            f -> f.withMarshaller(UpdateNewNoticeNewRequest::getBody, UpdateNewNoticeNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddKeystorePermissionRequest, AddKeystorePermissionResponse> addKeystorePermission =
        genForAddKeystorePermission();

    private static HttpRequestDef<AddKeystorePermissionRequest, AddKeystorePermissionResponse> genForAddKeystorePermission() {
        // basic
        HttpRequestDef.Builder<AddKeystorePermissionRequest, AddKeystorePermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddKeystorePermissionRequest.class, AddKeystorePermissionResponse.class)
            .withName("AddKeystorePermission")
            .withUri("/v2/keystore/permission/add")
            .withContentType("application/json");

        // requests
        builder.<AddKeystorePermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddKeystorePermissionRequestBody.class),
            f -> f.withMarshaller(AddKeystorePermissionRequest::getBody, AddKeystorePermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeystoreRequest, DeleteKeystoreResponse> deleteKeystore =
        genForDeleteKeystore();

    private static HttpRequestDef<DeleteKeystoreRequest, DeleteKeystoreResponse> genForDeleteKeystore() {
        // basic
        HttpRequestDef.Builder<DeleteKeystoreRequest, DeleteKeystoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteKeystoreRequest.class, DeleteKeystoreResponse.class)
                .withName("DeleteKeystore")
                .withUri("/v2/keystore/{keystore_id}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keystore_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeystoreRequest::getKeystoreId, DeleteKeystoreRequest::setKeystoreId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeystorePermissionRequest, DeleteKeystorePermissionResponse> deleteKeystorePermission =
        genForDeleteKeystorePermission();

    private static HttpRequestDef<DeleteKeystorePermissionRequest, DeleteKeystorePermissionResponse> genForDeleteKeystorePermission() {
        // basic
        HttpRequestDef.Builder<DeleteKeystorePermissionRequest, DeleteKeystorePermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteKeystorePermissionRequest.class,
                    DeleteKeystorePermissionResponse.class)
                .withName("DeleteKeystorePermission")
                .withUri("/v2/keystore/permission/{permission_id}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeystorePermissionRequest::getPermissionId,
                DeleteKeystorePermissionRequest::setPermissionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse> downloadKeystoreByName =
        genForDownloadKeystoreByName();

    private static HttpRequestDef<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse> genForDownloadKeystoreByName() {
        // basic
        HttpRequestDef.Builder<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadKeystoreByNameRequest.class, DownloadKeystoreByNameResponse.class)
            .withName("DownloadKeystoreByName")
            .withUri("/v2/keystore/download")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreByNameRequest::getName, DownloadKeystoreByNameRequest::setName));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreByNameRequest::getDomainId,
                DownloadKeystoreByNameRequest::setDomainId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreByNameRequest::getId, DownloadKeystoreByNameRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeystoreRequest, ListKeystoreResponse> listKeystore = genForListKeystore();

    private static HttpRequestDef<ListKeystoreRequest, ListKeystoreResponse> genForListKeystore() {
        // basic
        HttpRequestDef.Builder<ListKeystoreRequest, ListKeystoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeystoreRequest.class, ListKeystoreResponse.class)
                .withName("ListKeystore")
                .withUri("/v2/keystore/name")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeystoreSearchRequest, ListKeystoreSearchResponse> listKeystoreSearch =
        genForListKeystoreSearch();

    private static HttpRequestDef<ListKeystoreSearchRequest, ListKeystoreSearchResponse> genForListKeystoreSearch() {
        // basic
        HttpRequestDef.Builder<ListKeystoreSearchRequest, ListKeystoreSearchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeystoreSearchRequest.class, ListKeystoreSearchResponse.class)
                .withName("ListKeystoreSearch")
                .withUri("/v2/keystore/list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKeystoreSearchRequest::getPageSize, ListKeystoreSearchRequest::setPageSize));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKeystoreSearchRequest::getPage, ListKeystoreSearchRequest::setPage));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeystoreSearchRequest::getSearch, ListKeystoreSearchRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse> showKeystorePermission =
        genForShowKeystorePermission();

    private static HttpRequestDef<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse> genForShowKeystorePermission() {
        // basic
        HttpRequestDef.Builder<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowKeystorePermissionRequest.class, ShowKeystorePermissionResponse.class)
            .withName("ShowKeystorePermission")
            .withUri("/v2/keystore/permission/{keystore_id}/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keystore_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKeystorePermissionRequest::getKeystoreId,
                ShowKeystorePermissionRequest::setKeystoreId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowKeystorePermissionRequest::getPageSize,
                ShowKeystorePermissionRequest::setPageSize));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKeystorePermissionRequest::getPage, ShowKeystorePermissionRequest::setPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeystoreRequest, UpdateKeystoreResponse> updateKeystore =
        genForUpdateKeystore();

    private static HttpRequestDef<UpdateKeystoreRequest, UpdateKeystoreResponse> genForUpdateKeystore() {
        // basic
        HttpRequestDef.Builder<UpdateKeystoreRequest, UpdateKeystoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateKeystoreRequest.class, UpdateKeystoreResponse.class)
                .withName("UpdateKeystore")
                .withUri("/v2/keystore/update/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKeystoreRequest::getId, UpdateKeystoreRequest::setId));
        builder.<UpdateKeystoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeystoreRequestBody.class),
            f -> f.withMarshaller(UpdateKeystoreRequest::getBody, UpdateKeystoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeystorePermissionRequest, UpdateKeystorePermissionResponse> updateKeystorePermission =
        genForUpdateKeystorePermission();

    private static HttpRequestDef<UpdateKeystorePermissionRequest, UpdateKeystorePermissionResponse> genForUpdateKeystorePermission() {
        // basic
        HttpRequestDef.Builder<UpdateKeystorePermissionRequest, UpdateKeystorePermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdateKeystorePermissionRequest.class, UpdateKeystorePermissionResponse.class)
                .withName("UpdateKeystorePermission")
                .withUri("/v2/keystore/permission/edit")
                .withContentType("application/json");

        // requests
        builder.<UpdateKeystorePermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeystorePermissionRequestBody.class),
            f -> f.withMarshaller(UpdateKeystorePermissionRequest::getBody, UpdateKeystorePermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadKeystoreRequest, UploadKeystoreResponse> uploadKeystore =
        genForUploadKeystore();

    private static HttpRequestDef<UploadKeystoreRequest, UploadKeystoreResponse> genForUploadKeystore() {
        // basic
        HttpRequestDef.Builder<UploadKeystoreRequest, UploadKeystoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadKeystoreRequest.class, UploadKeystoreResponse.class)
                .withName("UploadKeystore")
                .withUri("/v2/keystore/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadKeystoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadKeystoreRequestBody.class),
            f -> f.withMarshaller(UploadKeystoreRequest::getBody, UploadKeystoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBuildFullLogRequest, DownloadBuildFullLogResponse> downloadBuildFullLog =
        genForDownloadBuildFullLog();

    private static HttpRequestDef<DownloadBuildFullLogRequest, DownloadBuildFullLogResponse> genForDownloadBuildFullLog() {
        // basic
        HttpRequestDef.Builder<DownloadBuildFullLogRequest, DownloadBuildFullLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadBuildFullLogRequest.class, DownloadBuildFullLogResponse.class)
            .withName("DownloadBuildFullLog")
            .withUri("/v1/log/{record_id}/download-log")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildFullLogRequest::getRecordId, DownloadBuildFullLogRequest::setRecordId));
        builder.<String>withRequestField("log_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildFullLogRequest::getLogLevel, DownloadBuildFullLogRequest::setLogLevel));
        builder.<Boolean>withRequestField("compress",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DownloadBuildFullLogRequest::getCompress, DownloadBuildFullLogRequest::setCompress));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBuildRealTimeLogRequest, DownloadBuildRealTimeLogResponse> downloadBuildRealTimeLog =
        genForDownloadBuildRealTimeLog();

    private static HttpRequestDef<DownloadBuildRealTimeLogRequest, DownloadBuildRealTimeLogResponse> genForDownloadBuildRealTimeLog() {
        // basic
        HttpRequestDef.Builder<DownloadBuildRealTimeLogRequest, DownloadBuildRealTimeLogResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, DownloadBuildRealTimeLogRequest.class, DownloadBuildRealTimeLogResponse.class)
                .withName("DownloadBuildRealTimeLog")
                .withUri("/v1/log/{job_id}/{build_no}/real-time-log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildRealTimeLogRequest::getJobId,
                DownloadBuildRealTimeLogRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadBuildRealTimeLogRequest::getBuildNo,
                DownloadBuildRealTimeLogRequest::setBuildNo));
        builder.<Integer>withRequestField("start_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadBuildRealTimeLogRequest::getStartOffset,
                DownloadBuildRealTimeLogRequest::setStartOffset));
        builder.<Integer>withRequestField("end_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadBuildRealTimeLogRequest::getEndOffset,
                DownloadBuildRealTimeLogRequest::setEndOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildRealTimeLogRequest::getSort, DownloadBuildRealTimeLogRequest::setSort));
        builder.<String>withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildRealTimeLogRequest::getSize, DownloadBuildRealTimeLogRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowActionIInfoRequest, ShowActionIInfoResponse> showActionIInfo =
        genForShowActionIInfo();

    private static HttpRequestDef<ShowActionIInfoRequest, ShowActionIInfoResponse> genForShowActionIInfo() {
        // basic
        HttpRequestDef.Builder<ShowActionIInfoRequest, ShowActionIInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowActionIInfoRequest.class, ShowActionIInfoResponse.class)
                .withName("ShowActionIInfo")
                .withUri("/v1/log/stage/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActionIInfoRequest::getJobId, ShowActionIInfoRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowActionIInfoRequest::getBuildNo, ShowActionIInfoRequest::setBuildNo));
        builder.<Integer>withRequestField("start_offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowActionIInfoRequest::getStartOffset, ShowActionIInfoRequest::setStartOffset));
        builder.<Integer>withRequestField("end_offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowActionIInfoRequest::getEndOffset, ShowActionIInfoRequest::setEndOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActionIInfoRequest::getSort, ShowActionIInfoRequest::setSort));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> downloadLogByRecordId =
        genForDownloadLogByRecordId();

    private static HttpRequestDef<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> genForDownloadLogByRecordId() {
        // basic
        HttpRequestDef.Builder<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadLogByRecordIdRequest.class, DownloadLogByRecordIdResponse.class)
            .withName("DownloadLogByRecordId")
            .withUri("/v3/{record_id}/download-log")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadLogByRecordIdRequest::getRecordId,
                DownloadLogByRecordIdRequest::setRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowGraphRequest, ShowFlowGraphResponse> showFlowGraph =
        genForShowFlowGraph();

    private static HttpRequestDef<ShowFlowGraphRequest, ShowFlowGraphResponse> genForShowFlowGraph() {
        // basic
        HttpRequestDef.Builder<ShowFlowGraphRequest, ShowFlowGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlowGraphRequest.class, ShowFlowGraphResponse.class)
                .withName("ShowFlowGraph")
                .withUri("/v3/{build_flow_record_id}/flow-graph")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("build_flow_record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlowGraphRequest::getBuildFlowRecordId,
                ShowFlowGraphRequest::setBuildFlowRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordInfoRequest, ShowRecordInfoResponse> showRecordInfo =
        genForShowRecordInfo();

    private static HttpRequestDef<ShowRecordInfoRequest, ShowRecordInfoResponse> genForShowRecordInfo() {
        // basic
        HttpRequestDef.Builder<ShowRecordInfoRequest, ShowRecordInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordInfoRequest.class, ShowRecordInfoResponse.class)
                .withName("ShowRecordInfo")
                .withUri("/v3/jobs/{job_id}/{build_no}/record-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordInfoRequest::getJobId, ShowRecordInfoRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordInfoRequest::getBuildNo, ShowRecordInfoRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForStopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForStopJob() {
        // basic
        HttpRequestDef.Builder<StopJobRequest, StopJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopJobRequest.class, StopJobResponse.class)
                .withName("StopJob")
                .withUri("/v3/jobs/stop")
                .withContentType("application/json");

        // requests
        builder.<StopJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopJobRequestBody.class),
            f -> f.withMarshaller(StopJobRequest::getBody, StopJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBriefRecordRequest, ListBriefRecordResponse> listBriefRecord =
        genForListBriefRecord();

    private static HttpRequestDef<ListBriefRecordRequest, ListBriefRecordResponse> genForListBriefRecord() {
        // basic
        HttpRequestDef.Builder<ListBriefRecordRequest, ListBriefRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBriefRecordRequest.class, ListBriefRecordResponse.class)
                .withName("ListBriefRecord")
                .withUri("/v1/record/brief")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBriefRecordRequest::getLimit, ListBriefRecordRequest::setLimit));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBriefRecordRequest::getBody, ListBriefRecordRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse> listBuildInfoRecordByJobId =
        genForListBuildInfoRecordByJobId();

    private static HttpRequestDef<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse> genForListBuildInfoRecordByJobId() {
        // basic
        HttpRequestDef.Builder<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBuildInfoRecordByJobIdRequest.class,
                    ListBuildInfoRecordByJobIdResponse.class)
                .withName("ListBuildInfoRecordByJobId")
                .withUri("/v1/record/{job_id}/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getJobId,
                ListBuildInfoRecordByJobIdRequest::setJobId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getStartTime,
                ListBuildInfoRecordByJobIdRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getEndTime,
                ListBuildInfoRecordByJobIdRequest::setEndTime));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getPageIndex,
                ListBuildInfoRecordByJobIdRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getPageSize,
                ListBuildInfoRecordByJobIdRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordsRequest, ListRecordsResponse> listRecords = genForListRecords();

    private static HttpRequestDef<ListRecordsRequest, ListRecordsResponse> genForListRecords() {
        // basic
        HttpRequestDef.Builder<ListRecordsRequest, ListRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordsRequest.class, ListRecordsResponse.class)
                .withName("ListRecords")
                .withUri("/v1/record/{build_project_id}/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("build_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordsRequest::getBuildProjectId, ListRecordsRequest::setBuildProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordsRequest::getPage, ListRecordsRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordsRequest::getLimit, ListRecordsRequest::setLimit));
        builder.<List<String>>withRequestField("triggers",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecordsRequest::getTriggers, ListRecordsRequest::setTriggers));
        builder.<List<String>>withRequestField("branches",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecordsRequest::getBranches, ListRecordsRequest::setBranches));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecordsRequest::getTags, ListRecordsRequest::setTags));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordsRequest::getFromDate, ListRecordsRequest::setFromDate));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordsRequest::getToDate, ListRecordsRequest::setToDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse> showBuildInfoRecord =
        genForShowBuildInfoRecord();

    private static HttpRequestDef<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse> genForShowBuildInfoRecord() {
        // basic
        HttpRequestDef.Builder<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBuildInfoRecordRequest.class, ShowBuildInfoRecordResponse.class)
                .withName("ShowBuildInfoRecord")
                .withUri("/v1/record/{job_id}/{build_no}/build-info-record")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildInfoRecordRequest::getJobId, ShowBuildInfoRecordRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBuildInfoRecordRequest::getBuildNo, ShowBuildInfoRecordRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildRecordRequest, ShowBuildRecordResponse> showBuildRecord =
        genForShowBuildRecord();

    private static HttpRequestDef<ShowBuildRecordRequest, ShowBuildRecordResponse> genForShowBuildRecord() {
        // basic
        HttpRequestDef.Builder<ShowBuildRecordRequest, ShowBuildRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBuildRecordRequest.class, ShowBuildRecordResponse.class)
                .withName("ShowBuildRecord")
                .withUri("/v1/record/{record_id}/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildRecordRequest::getRecordId, ShowBuildRecordRequest::setRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse> showBuildRecordBuildScript =
        genForShowBuildRecordBuildScript();

    private static HttpRequestDef<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse> genForShowBuildRecordBuildScript() {
        // basic
        HttpRequestDef.Builder<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBuildRecordBuildScriptRequest.class,
                    ShowBuildRecordBuildScriptResponse.class)
                .withName("ShowBuildRecordBuildScript")
                .withUri("/v1/record/{record_id}/build-script")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildRecordBuildScriptRequest::getRecordId,
                ShowBuildRecordBuildScriptRequest::setRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildRecordFlowGraphRequest, ShowBuildRecordFlowGraphResponse> showBuildRecordFlowGraph =
        genForShowBuildRecordFlowGraph();

    private static HttpRequestDef<ShowBuildRecordFlowGraphRequest, ShowBuildRecordFlowGraphResponse> genForShowBuildRecordFlowGraph() {
        // basic
        HttpRequestDef.Builder<ShowBuildRecordFlowGraphRequest, ShowBuildRecordFlowGraphResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowBuildRecordFlowGraphRequest.class, ShowBuildRecordFlowGraphResponse.class)
                .withName("ShowBuildRecordFlowGraph")
                .withUri("/v1/record/{build_flow_record_id}/flow-graph")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("build_flow_record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildRecordFlowGraphRequest::getBuildFlowRecordId,
                ShowBuildRecordFlowGraphRequest::setBuildFlowRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse> showBuildRecordFullStages =
        genForShowBuildRecordFullStages();

    private static HttpRequestDef<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse> genForShowBuildRecordFullStages() {
        // basic
        HttpRequestDef.Builder<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBuildRecordFullStagesRequest.class,
                    ShowBuildRecordFullStagesResponse.class)
                .withName("ShowBuildRecordFullStages")
                .withUri("/v1/record/{record_id}/full-stages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildRecordFullStagesRequest::getRecordId,
                ShowBuildRecordFullStagesRequest::setRecordId));
        builder.<Boolean>withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowBuildRecordFullStagesRequest::getCascade,
                ShowBuildRecordFullStagesRequest::setCascade));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobBuildRecordDetailRequest, ShowJobBuildRecordDetailResponse> showJobBuildRecordDetail =
        genForShowJobBuildRecordDetail();

    private static HttpRequestDef<ShowJobBuildRecordDetailRequest, ShowJobBuildRecordDetailResponse> genForShowJobBuildRecordDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobBuildRecordDetailRequest, ShowJobBuildRecordDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowJobBuildRecordDetailRequest.class, ShowJobBuildRecordDetailResponse.class)
                .withName("ShowJobBuildRecordDetail")
                .withUri("/v1/record/{job_id}/{build_no}/record-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildRecordDetailRequest::getJobId,
                ShowJobBuildRecordDetailRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobBuildRecordDetailRequest::getBuildNo,
                ShowJobBuildRecordDetailRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobTotalRequest, ShowJobTotalResponse> showJobTotal = genForShowJobTotal();

    private static HttpRequestDef<ShowJobTotalRequest, ShowJobTotalResponse> genForShowJobTotal() {
        // basic
        HttpRequestDef.Builder<ShowJobTotalRequest, ShowJobTotalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobTotalRequest.class, ShowJobTotalResponse.class)
                .withName("ShowJobTotal")
                .withUri("/v1/record/{build_project_id}/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("build_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobTotalRequest::getBuildProjectId, ShowJobTotalRequest::setBuildProjectId));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobTotalRequest::getFromDate, ShowJobTotalRequest::setFromDate));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobTotalRequest::getToDate, ShowJobTotalRequest::setToDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadJunitCoverageZipRequest, DownloadJunitCoverageZipResponse> downloadJunitCoverageZip =
        genForDownloadJunitCoverageZip();

    private static HttpRequestDef<DownloadJunitCoverageZipRequest, DownloadJunitCoverageZipResponse> genForDownloadJunitCoverageZip() {
        // basic
        HttpRequestDef.Builder<DownloadJunitCoverageZipRequest, DownloadJunitCoverageZipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, DownloadJunitCoverageZipRequest.class, DownloadJunitCoverageZipResponse.class)
                .withName("DownloadJunitCoverageZip")
                .withUri("/v1/report/junit/coverage/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadJunitCoverageZipRequest::getJobId,
                DownloadJunitCoverageZipRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadJunitCoverageZipRequest::getBuildNo,
                DownloadJunitCoverageZipRequest::setBuildNo));
        builder.<String>withRequestField("root_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadJunitCoverageZipRequest::getRootId,
                DownloadJunitCoverageZipRequest::setRootId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJunitCoverageSummaryRequest, ListJunitCoverageSummaryResponse> listJunitCoverageSummary =
        genForListJunitCoverageSummary();

    private static HttpRequestDef<ListJunitCoverageSummaryRequest, ListJunitCoverageSummaryResponse> genForListJunitCoverageSummary() {
        // basic
        HttpRequestDef.Builder<ListJunitCoverageSummaryRequest, ListJunitCoverageSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListJunitCoverageSummaryRequest.class, ListJunitCoverageSummaryResponse.class)
                .withName("ListJunitCoverageSummary")
                .withUri("/v1/report/junit/coverage/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJunitCoverageSummaryRequest::getJobId,
                ListJunitCoverageSummaryRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJunitCoverageSummaryRequest::getBuildNo,
                ListJunitCoverageSummaryRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepoBranchRequest, ListRepoBranchResponse> listRepoBranch =
        genForListRepoBranch();

    private static HttpRequestDef<ListRepoBranchRequest, ListRepoBranchResponse> genForListRepoBranch() {
        // basic
        HttpRequestDef.Builder<ListRepoBranchRequest, ListRepoBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepoBranchRequest.class, ListRepoBranchResponse.class)
                .withName("ListRepoBranch")
                .withUri("/v1/report/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoBranchRequest::getJobId, ListRepoBranchRequest::setJobId));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoBranchRequest::getRepositoryName, ListRepoBranchRequest::setRepositoryName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryRequest, ListRepositoryResponse> listRepository =
        genForListRepository();

    private static HttpRequestDef<ListRepositoryRequest, ListRepositoryResponse> genForListRepository() {
        // basic
        HttpRequestDef.Builder<ListRepositoryRequest, ListRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepositoryRequest.class, ListRepositoryResponse.class)
                .withName("ListRepository")
                .withUri("/v1/report/{job_id}/repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryRequest::getJobId, ListRepositoryRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse> showJobBuildSuccessRatio =
        genForShowJobBuildSuccessRatio();

    private static HttpRequestDef<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse> genForShowJobBuildSuccessRatio() {
        // basic
        HttpRequestDef.Builder<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowJobBuildSuccessRatioRequest.class, ShowJobBuildSuccessRatioResponse.class)
                .withName("ShowJobBuildSuccessRatio")
                .withUri("/v1/report/ratio")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildSuccessRatioRequest::getJobId,
                ShowJobBuildSuccessRatioRequest::setJobId));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildSuccessRatioRequest::getRepositoryName,
                ShowJobBuildSuccessRatioRequest::setRepositoryName));
        builder.<String>withRequestField("branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildSuccessRatioRequest::getBranch,
                ShowJobBuildSuccessRatioRequest::setBranch));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobBuildSuccessRatioRequest::getInterval,
                ShowJobBuildSuccessRatioRequest::setInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse> showJobBuildTime =
        genForShowJobBuildTime();

    private static HttpRequestDef<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse> genForShowJobBuildTime() {
        // basic
        HttpRequestDef.Builder<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobBuildTimeRequest.class, ShowJobBuildTimeResponse.class)
                .withName("ShowJobBuildTime")
                .withUri("/v1/report/time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildTimeRequest::getJobId, ShowJobBuildTimeRequest::setJobId));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildTimeRequest::getRepositoryName,
                ShowJobBuildTimeRequest::setRepositoryName));
        builder.<String>withRequestField("branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildTimeRequest::getBranch, ShowJobBuildTimeRequest::setBranch));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobBuildTimeRequest::getInterval, ShowJobBuildTimeRequest::setInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportSummaryRequest, ShowReportSummaryResponse> showReportSummary =
        genForShowReportSummary();

    private static HttpRequestDef<ShowReportSummaryRequest, ShowReportSummaryResponse> genForShowReportSummary() {
        // basic
        HttpRequestDef.Builder<ShowReportSummaryRequest, ShowReportSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReportSummaryRequest.class, ShowReportSummaryResponse.class)
                .withName("ShowReportSummary")
                .withUri("/v1/report/{job_id}/summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportSummaryRequest::getJobId, ShowReportSummaryRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportSummaryRequest::getBuildNo, ShowReportSummaryRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFavouriteCustomTemplateRequest, AddFavouriteCustomTemplateResponse> addFavouriteCustomTemplate =
        genForAddFavouriteCustomTemplate();

    private static HttpRequestDef<AddFavouriteCustomTemplateRequest, AddFavouriteCustomTemplateResponse> genForAddFavouriteCustomTemplate() {
        // basic
        HttpRequestDef.Builder<AddFavouriteCustomTemplateRequest, AddFavouriteCustomTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddFavouriteCustomTemplateRequest.class,
                    AddFavouriteCustomTemplateResponse.class)
                .withName("AddFavouriteCustomTemplate")
                .withUri("/v1/template/custom/{uuid}/follow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFavouriteCustomTemplateRequest::getUuid,
                AddFavouriteCustomTemplateRequest::setUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFavouriteOfficialTemplateRequest, AddFavouriteOfficialTemplateResponse> addFavouriteOfficialTemplate =
        genForAddFavouriteOfficialTemplate();

    private static HttpRequestDef<AddFavouriteOfficialTemplateRequest, AddFavouriteOfficialTemplateResponse> genForAddFavouriteOfficialTemplate() {
        // basic
        HttpRequestDef.Builder<AddFavouriteOfficialTemplateRequest, AddFavouriteOfficialTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddFavouriteOfficialTemplateRequest.class,
                    AddFavouriteOfficialTemplateResponse.class)
                .withName("AddFavouriteOfficialTemplate")
                .withUri("/v1/template/official/{uuid}/follow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFavouriteOfficialTemplateRequest::getUuid,
                AddFavouriteOfficialTemplateRequest::setUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForCreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForCreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v1/template/create")
                .withContentType("application/json");

        // requests
        builder.<CreateTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplatesRequestBody.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, CreateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genForDeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genForDeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/template/{uuid}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getUuid, DeleteTemplateRequest::setUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomTemplateRequest, ListCustomTemplateResponse> listCustomTemplate =
        genForListCustomTemplate();

    private static HttpRequestDef<ListCustomTemplateRequest, ListCustomTemplateResponse> genForListCustomTemplate() {
        // basic
        HttpRequestDef.Builder<ListCustomTemplateRequest, ListCustomTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomTemplateRequest.class, ListCustomTemplateResponse.class)
                .withName("ListCustomTemplate")
                .withUri("/v1/template/custom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomTemplateRequest::getName, ListCustomTemplateRequest::setName));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomTemplateRequest::getFilter, ListCustomTemplateRequest::setFilter));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomTemplateRequest::getPage, ListCustomTemplateRequest::setPage));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomTemplateRequest::getPageSize, ListCustomTemplateRequest::setPageSize));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomTemplateRequest::getTags, ListCustomTemplateRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOfficialTemplateRequest, ListOfficialTemplateResponse> listOfficialTemplate =
        genForListOfficialTemplate();

    private static HttpRequestDef<ListOfficialTemplateRequest, ListOfficialTemplateResponse> genForListOfficialTemplate() {
        // basic
        HttpRequestDef.Builder<ListOfficialTemplateRequest, ListOfficialTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOfficialTemplateRequest.class, ListOfficialTemplateResponse.class)
            .withName("ListOfficialTemplate")
            .withUri("/v1/template/officialtemplates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOfficialTemplateRequest::getName, ListOfficialTemplateRequest::setName));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOfficialTemplateRequest::getPage, ListOfficialTemplateRequest::setPage));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOfficialTemplateRequest::getPageSize, ListOfficialTemplateRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecommendOfficialTemplateRequest, ListRecommendOfficialTemplateResponse> listRecommendOfficialTemplate =
        genForListRecommendOfficialTemplate();

    private static HttpRequestDef<ListRecommendOfficialTemplateRequest, ListRecommendOfficialTemplateResponse> genForListRecommendOfficialTemplate() {
        // basic
        HttpRequestDef.Builder<ListRecommendOfficialTemplateRequest, ListRecommendOfficialTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListRecommendOfficialTemplateRequest.class,
                    ListRecommendOfficialTemplateResponse.class)
                .withName("ListRecommendOfficialTemplate")
                .withUri("/v1/template/recommend")
                .withContentType("application/json");

        // requests
        builder.<ListRecommendOfficialTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRecommendOfficialTemplateRequestBody.class),
            f -> f.withMarshaller(ListRecommendOfficialTemplateRequest::getBody,
                ListRecommendOfficialTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoverFavouriteCustomTemplateRequest, RemoverFavouriteCustomTemplateResponse> removerFavouriteCustomTemplate =
        genForRemoverFavouriteCustomTemplate();

    private static HttpRequestDef<RemoverFavouriteCustomTemplateRequest, RemoverFavouriteCustomTemplateResponse> genForRemoverFavouriteCustomTemplate() {
        // basic
        HttpRequestDef.Builder<RemoverFavouriteCustomTemplateRequest, RemoverFavouriteCustomTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RemoverFavouriteCustomTemplateRequest.class,
                    RemoverFavouriteCustomTemplateResponse.class)
                .withName("RemoverFavouriteCustomTemplate")
                .withUri("/v1/template/custom/{uuid}/unfollow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoverFavouriteCustomTemplateRequest::getUuid,
                RemoverFavouriteCustomTemplateRequest::setUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoverFavouriteOfficialTemplateRequest, RemoverFavouriteOfficialTemplateResponse> removerFavouriteOfficialTemplate =
        genForRemoverFavouriteOfficialTemplate();

    private static HttpRequestDef<RemoverFavouriteOfficialTemplateRequest, RemoverFavouriteOfficialTemplateResponse> genForRemoverFavouriteOfficialTemplate() {
        // basic
        HttpRequestDef.Builder<RemoverFavouriteOfficialTemplateRequest, RemoverFavouriteOfficialTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RemoverFavouriteOfficialTemplateRequest.class,
                    RemoverFavouriteOfficialTemplateResponse.class)
                .withName("RemoverFavouriteOfficialTemplate")
                .withUri("/v1/template/official/{uuid}/unfollow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoverFavouriteOfficialTemplateRequest::getUuid,
                RemoverFavouriteOfficialTemplateRequest::setUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveTemplateUsedInfoRequest, SaveTemplateUsedInfoResponse> saveTemplateUsedInfo =
        genForSaveTemplateUsedInfo();

    private static HttpRequestDef<SaveTemplateUsedInfoRequest, SaveTemplateUsedInfoResponse> genForSaveTemplateUsedInfo() {
        // basic
        HttpRequestDef.Builder<SaveTemplateUsedInfoRequest, SaveTemplateUsedInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SaveTemplateUsedInfoRequest.class, SaveTemplateUsedInfoResponse.class)
            .withName("SaveTemplateUsedInfo")
            .withUri("/v1/template/used-info")
            .withContentType("application/json");

        // requests
        builder.<SaveTemplateUsedInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveTemplateUsedInfoRequestBody.class),
            f -> f.withMarshaller(SaveTemplateUsedInfoRequest::getBody, SaveTemplateUsedInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForShowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForShowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v1/template/{uuid}/custom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getUuid, ShowTemplateRequest::setUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowYamlTemplateRequest, ShowYamlTemplateResponse> showYamlTemplate =
        genForShowYamlTemplate();

    private static HttpRequestDef<ShowYamlTemplateRequest, ShowYamlTemplateResponse> genForShowYamlTemplate() {
        // basic
        HttpRequestDef.Builder<ShowYamlTemplateRequest, ShowYamlTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowYamlTemplateRequest.class, ShowYamlTemplateResponse.class)
                .withName("ShowYamlTemplate")
                .withUri("/v1/template/{job_id}/default-template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowYamlTemplateRequest::getJobId, ShowYamlTemplateRequest::setJobId));
        builder.<String>withRequestField("default_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowYamlTemplateRequest::getDefaultHost, ShowYamlTemplateRequest::setDefaultHost));

        // response

        return builder.build();
    }

}
