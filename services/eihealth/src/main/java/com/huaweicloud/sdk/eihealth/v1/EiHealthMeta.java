package com.huaweicloud.sdk.eihealth.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eihealth.v1.model.AdmetRequest;
import com.huaweicloud.sdk.eihealth.v1.model.AppReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchCancelJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchCancelJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteLabelReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteMemberReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteMemberRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteMemberResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteMemberRsp;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteNoticeReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteNoticeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteNoticeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteTagReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteTagRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteTagResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDownloadResourceStatDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDownloadResourceStatDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchOperateJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchOperateJobRsp;
import com.huaweicloud.sdk.eihealth.v1.model.BatchQueryStatReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchRetryJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchRetryJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNodeLabelReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNodeLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNodeLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNoticeReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNoticeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNoticeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CancelDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CancelDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CancelDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CancelDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CancelJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CancelJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ChangePasswordReq;
import com.huaweicloud.sdk.eihealth.v1.model.ChangePasswordRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ChangePasswordResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CheckDrugLigandDifferenceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CheckDrugLigandDifferenceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CheckEmailConnectionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CheckEmailConnectionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CheckLigandDifferenceReq;
import com.huaweicloud.sdk.eihealth.v1.model.CheckTokenVerificationRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CheckTokenVerificationResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CleanNextflowCacheRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CleanNextflowCacheResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CloneDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.CodeVerifyReq;
import com.huaweicloud.sdk.eihealth.v1.model.CopyDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CopyDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CpiTaskData;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAutJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateBackupReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateBackupRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateBackupResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingResourceReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCustomPropsTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCustomPropsTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseResourceReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDockJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDockingJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDockingJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandInteraction2dSvgReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandInteraction2dSvgRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandInteraction2dSvgResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandPreviewTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandPreviewTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandSdfRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandSdfResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandSimilarityGraphTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandSimilarityGraphTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandSvgRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugLigandSvgResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFepJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFepJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFepJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenerationTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenerationTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelPageReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelPageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelPageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLigandPreviewTaskReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLigandSdfReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLigandSimilarityGraphTaskReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLigandSvgReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowJobRequestBody;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowWorkflowRequestBody;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptimizationTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptimizationTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptmJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptmJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptmJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePerformanceResourceReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePerformanceResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePerformanceResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateProjectReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateScaleOutPolicyReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTemplateReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CustomPropsTaskData;
import com.huaweicloud.sdk.eihealth.v1.model.DataPolicyReq;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAssetVersionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAssetVersionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteBackupRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteBackupResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteComputingResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteComputingResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDatabaseResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDatabaseResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugLigandPreviewTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugLigandPreviewTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugLigandSimilarityGraphTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugLigandSimilarityGraphTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteLabelPageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteLabelPageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteMemberRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteMemberResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteMessageEmailConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteMessageEmailConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteNextflowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteNextflowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteNextflowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteNextflowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeletePerformanceResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeletePerformanceResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteStarRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteStarResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteStudyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteStudyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTagRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTagResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTagRsp;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataJobLogRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataJobLogResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataTraceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataTraceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DrugFile;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteAssetActionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteAssetActionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GenerationTaskData;
import com.huaweicloud.sdk.eihealth.v1.model.ImportAppRsp;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDatabaseDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportTemplateReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportTemplateResultRsp;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.InstallNextflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.InstallNextflowRequestBody;
import com.huaweicloud.sdk.eihealth.v1.model.InstallNextflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.JobDto;
import com.huaweicloud.sdk.eihealth.v1.model.ListAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListArchiveConfigsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListArchiveConfigsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListAssetRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListAssetResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListBackupRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListBackupResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListBucketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListBucketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListCheckpointRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListCheckpointResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterAllNodeLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterAllNodeLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListComputingResourceFlavorsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListComputingResourceFlavorsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListComputingResourcesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListComputingResourcesResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDatabaseResourceFlavorRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDatabaseResourceFlavorResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDatabaseResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDatabaseResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListGlobalWorkflowStatisticRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListGlobalWorkflowStatisticResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListIamGroupUsersRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListIamGroupUsersResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListIamGroupsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListIamGroupsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListIamUsersRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListIamUsersResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListImageTagRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListImageTagResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListInstanceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListInstanceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListLabelPageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListLabelPageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListMessageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListMessageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListMessageStatisticsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListMessageStatisticsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListMfaRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListMfaResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNextflowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNextflowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNextflowTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNextflowTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNextflowVersionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNextflowVersionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNextflowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNextflowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNodeLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNodeLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNotebookToolRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNotebookToolResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNoticeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNoticeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListObsBucketObjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListObsBucketObjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListObsBucketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListObsBucketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListPerformanceResourceStatRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPerformanceResourceStatResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListPerformanceResourcesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPerformanceResourcesResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListPresetLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPresetLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListPropertyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPropertyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListQuotaRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListQuotaResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListStarRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListStarResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListStorageResourcesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListStorageResourcesResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListStudyJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListStudyJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListStudyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListStudyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListVendorRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListVendorResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListWorkflowStatisticRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListWorkflowStatisticResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ManageAssetReq;
import com.huaweicloud.sdk.eihealth.v1.model.NotebookActionReq;
import com.huaweicloud.sdk.eihealth.v1.model.OptimizationTaskData;
import com.huaweicloud.sdk.eihealth.v1.model.ParseDrugReceptorInfoRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ParseDrugReceptorInfoResponse;
import com.huaweicloud.sdk.eihealth.v1.model.PublishAppReq;
import com.huaweicloud.sdk.eihealth.v1.model.PublishAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.PublishAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.PublishAssetReq;
import com.huaweicloud.sdk.eihealth.v1.model.PublishDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.PublishDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.PublishDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.PublishImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.PublishImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.PublishWorkflowReq;
import com.huaweicloud.sdk.eihealth.v1.model.PublishWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.PublishWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDatabaseReq;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDatabaseResultRsp;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteInstanceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteInstanceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RebootNodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RebootNodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ReceptorDrugFile;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeDrugReceptorPocketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeDrugReceptorPocketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeReceptorPocketReq;
import com.huaweicloud.sdk.eihealth.v1.model.ResetPasswordReq;
import com.huaweicloud.sdk.eihealth.v1.model.RestoreBackupReq;
import com.huaweicloud.sdk.eihealth.v1.model.RestoreBackupRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RestoreBackupResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryNextflowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryNextflowJobRequestBody;
import com.huaweicloud.sdk.eihealth.v1.model.RetryNextflowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RowDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugLigandToSmilesConversionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugLigandToSmilesConversionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugReceptorPreprocessRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugReceptorPreprocessResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunReceptorPreprocessReq;
import com.huaweicloud.sdk.eihealth.v1.model.SearchTaskData;
import com.huaweicloud.sdk.eihealth.v1.model.SendCodeReq;
import com.huaweicloud.sdk.eihealth.v1.model.SetMessageClearRuleReq;
import com.huaweicloud.sdk.eihealth.v1.model.SetMessageEmailConfigReq;
import com.huaweicloud.sdk.eihealth.v1.model.SetMessageReceiveConfigReq;
import com.huaweicloud.sdk.eihealth.v1.model.Show3dStructureContentRequest;
import com.huaweicloud.sdk.eihealth.v1.model.Show3dStructureContentResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAdmetPropertiesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAdmetPropertiesResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAssetVersionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAssetVersionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowBackupPathRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowBackupPathResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowBmsDevicesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowBmsDevicesResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowBucketStorageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowBucketStorageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowCpiTaskResultRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowCpiTaskResultResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowCustomPropsTaskResultRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowCustomPropsTaskResultResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDataPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDataPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDockerLoginRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDockerLoginResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDockingJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDockingJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDrugLigandPreviewTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDrugLigandPreviewTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDrugLigandSimilarityGraphTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDrugLigandSimilarityGraphTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowEnvRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowEnvResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowEvsQuotaRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowEvsQuotaResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowExtremumInfoRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowExtremumInfoResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowFepJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowFepJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowGenerationTaskResultRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowGenerationTaskResultResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobEventRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobEventResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobLogRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobLogResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowLeftQuotaRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowLeftQuotaResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMessageClearRuleRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMessageClearRuleResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMessageEmailConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMessageEmailConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMessageReceiveConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMessageReceiveConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowJobLogRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowJobLogResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowJobReportsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowJobReportsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowTaskDetailRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowTaskDetailResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowTaskLogRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowTaskLogResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNextflowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNotebookTokenRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNotebookTokenResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowOptimizationTaskResultRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowOptimizationTaskResultResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowOptmJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowOptmJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowOverviewRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowOverviewResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowProjectTraceDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowProjectTraceDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowProjectTraceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowProjectTraceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowProjectTrackerRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowProjectTrackerResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowResourceMetricDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowResourceMetricDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowScaleInPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowScaleInPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowScheduleRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowScheduleResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowSearchTaskResultRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowSearchTaskResultResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowSynthesisJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowSynthesisJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowSynthesisTaskResultRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowSynthesisTaskResultResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskEventsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskEventsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskInstanceEventsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskInstanceEventsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskInstanceMetricDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskInstanceMetricDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskInstancePodRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskInstancePodResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskInstancesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTaskInstancesResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowUserSettingRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowUserSettingResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowVendorRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowVendorResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StartAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StartAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StartNodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StartNodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StartScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StartScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StopAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StopAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StopNextflowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StopNextflowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StopNodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StopNodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StopOrStartNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StopOrStartNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StopScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StopScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppReq;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageReq;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowReq;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SynthesisTaskData;
import com.huaweicloud.sdk.eihealth.v1.model.TerminateJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectReq;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.TryEmailConnectionReq;
import com.huaweicloud.sdk.eihealth.v1.model.UninstallNextflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UninstallNextflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateArchiveConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateArchiveConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAssetReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAssetVersionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAssetVersionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPathPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPathPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPolicyReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateImageReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateInitPasswordRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateInitPasswordResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobConfigReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageClearRuleRequestBodyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageClearRuleRequestBodyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageEmailConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageEmailConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageReceiveConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageReceiveConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNextflowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNextflowWorkflowRequestBody;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNextflowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectTrackerRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectTrackerResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleInPolicyReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleInPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleInPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleOutPolicyReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScheduleReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScheduleRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScheduleResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateStarRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateStarResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateTrackerReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserByDomainReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserByDomainRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserByDomainResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserRoleReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserRoleRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserRoleResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserSettingReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserSettingRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserSettingResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateVendorRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateVendorRequestBody;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateVendorResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UploadDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UploadDataRequestBody;
import com.huaweicloud.sdk.eihealth.v1.model.UploadDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UploadTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UploadTemplateRequestBody;
import com.huaweicloud.sdk.eihealth.v1.model.UploadTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UserIdRsp;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.WorkflowDto;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class EiHealthMeta {

    public static final HttpRequestDef<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> showAdmetProperties =
        genForshowAdmetProperties();

    private static HttpRequestDef<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> genForshowAdmetProperties() {
        // basic
        HttpRequestDef.Builder<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowAdmetPropertiesRequest.class, ShowAdmetPropertiesResponse.class)
                .withName("ShowAdmetProperties")
                .withUri("/v1/{project_id}/admet")
                .withContentType("application/json");

        // requests
        builder.<AdmetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdmetRequest.class),
            f -> f.withMarshaller(ShowAdmetPropertiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<Map<String, Object>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ShowAdmetPropertiesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Object.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateCpiTaskRequest, CreateCpiTaskResponse> createCpiTask =
        genForcreateCpiTask();

    private static HttpRequestDef<CreateCpiTaskRequest, CreateCpiTaskResponse> genForcreateCpiTask() {
        // basic
        HttpRequestDef.Builder<CreateCpiTaskRequest, CreateCpiTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCpiTaskRequest.class, CreateCpiTaskResponse.class)
                .withName("CreateCpiTask")
                .withUri("/v1/{project_id}/task/cpi")
                .withContentType("application/json");

        // requests
        builder.<CpiTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CpiTaskData.class),
            f -> f.withMarshaller(CreateCpiTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCpiTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> showCpiTaskResult =
        genForshowCpiTaskResult();

    private static HttpRequestDef<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> genForshowCpiTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCpiTaskResultRequest.class, ShowCpiTaskResultResponse.class)
                .withName("ShowCpiTaskResult")
                .withUri("/v1/{project_id}/task/cpi/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCpiTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomPropsTaskRequest, CreateCustomPropsTaskResponse> createCustomPropsTask =
        genForcreateCustomPropsTask();

    private static HttpRequestDef<CreateCustomPropsTaskRequest, CreateCustomPropsTaskResponse> genForcreateCustomPropsTask() {
        // basic
        HttpRequestDef.Builder<CreateCustomPropsTaskRequest, CreateCustomPropsTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCustomPropsTaskRequest.class, CreateCustomPropsTaskResponse.class)
            .withName("CreateCustomPropsTask")
            .withUri("/v1/{project_id}/custom-props")
            .withContentType("application/json");

        // requests
        builder.<CustomPropsTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomPropsTaskData.class),
            f -> f.withMarshaller(CreateCustomPropsTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCustomPropsTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomPropsTaskResultRequest, ShowCustomPropsTaskResultResponse> showCustomPropsTaskResult =
        genForshowCustomPropsTaskResult();

    private static HttpRequestDef<ShowCustomPropsTaskResultRequest, ShowCustomPropsTaskResultResponse> genForshowCustomPropsTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowCustomPropsTaskResultRequest, ShowCustomPropsTaskResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCustomPropsTaskResultRequest.class,
                    ShowCustomPropsTaskResultResponse.class)
                .withName("ShowCustomPropsTaskResult")
                .withUri("/v1/{project_id}/custom-props/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomPropsTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGenerationTaskRequest, CreateGenerationTaskResponse> createGenerationTask =
        genForcreateGenerationTask();

    private static HttpRequestDef<CreateGenerationTaskRequest, CreateGenerationTaskResponse> genForcreateGenerationTask() {
        // basic
        HttpRequestDef.Builder<CreateGenerationTaskRequest, CreateGenerationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGenerationTaskRequest.class, CreateGenerationTaskResponse.class)
            .withName("CreateGenerationTask")
            .withUri("/v1/{project_id}/task/generation")
            .withContentType("application/json");

        // requests
        builder.<GenerationTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerationTaskData.class),
            f -> f.withMarshaller(CreateGenerationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateGenerationTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> showGenerationTaskResult =
        genForshowGenerationTaskResult();

    private static HttpRequestDef<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> genForshowGenerationTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowGenerationTaskResultRequest.class, ShowGenerationTaskResultResponse.class)
                .withName("ShowGenerationTaskResult")
                .withUri("/v1/{project_id}/task/generation/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGenerationTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchImportAppRequest, BatchImportAppResponse> batchImportApp =
        genForbatchImportApp();

    private static HttpRequestDef<BatchImportAppRequest, BatchImportAppResponse> genForbatchImportApp() {
        // basic
        HttpRequestDef.Builder<BatchImportAppRequest, BatchImportAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchImportAppRequest.class, BatchImportAppResponse.class)
                .withName("BatchImportApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/batch-import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchImportAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchImportAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchImportAppReq.class),
            f -> f.withMarshaller(BatchImportAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ImportAppRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchImportAppResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ImportAppRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<AppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppReq.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genFordeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genFordeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppRequest, ListAppResponse> listApp = genForlistApp();

    private static HttpRequestDef<ListAppRequest, ListAppResponse> genForlistApp() {
        // basic
        HttpRequestDef.Builder<ListAppRequest, ListAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppRequest.class, ListAppResponse.class)
                .withName("ListApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAppRequest, PublishAppResponse> publishApp = genForpublishApp();

    private static HttpRequestDef<PublishAppRequest, PublishAppResponse> genForpublishApp() {
        // basic
        HttpRequestDef.Builder<PublishAppRequest, PublishAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAppRequest.class, PublishAppResponse.class)
                .withName("PublishApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/{app_id}/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<PublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAppReq.class),
            f -> f.withMarshaller(PublishAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForshowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForshowApp() {
        // basic
        HttpRequestDef.Builder<ShowAppRequest, ShowAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppRequest.class, ShowAppResponse.class)
                .withName("ShowApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeAppRequest, SubscribeAppResponse> subscribeApp = genForsubscribeApp();

    private static HttpRequestDef<SubscribeAppRequest, SubscribeAppResponse> genForsubscribeApp() {
        // basic
        HttpRequestDef.Builder<SubscribeAppRequest, SubscribeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeAppRequest.class, SubscribeAppResponse.class)
                .withName("SubscribeApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<SubscribeAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeAppReq.class),
            f -> f.withMarshaller(SubscribeAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForupdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForupdateApp() {
        // basic
        HttpRequestDef.Builder<UpdateAppRequest, UpdateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppRequest.class, UpdateAppResponse.class)
                .withName("UpdateApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<AppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppReq.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetVersionRequest, DeleteAssetVersionResponse> deleteAssetVersion =
        genFordeleteAssetVersion();

    private static HttpRequestDef<DeleteAssetVersionRequest, DeleteAssetVersionResponse> genFordeleteAssetVersion() {
        // basic
        HttpRequestDef.Builder<DeleteAssetVersionRequest, DeleteAssetVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetVersionRequest.class, DeleteAssetVersionResponse.class)
                .withName("DeleteAssetVersion")
                .withUri("/v1/{project_id}/assets/{asset_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetVersionRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteAssetActionRequest, ExecuteAssetActionResponse> executeAssetAction =
        genForexecuteAssetAction();

    private static HttpRequestDef<ExecuteAssetActionRequest, ExecuteAssetActionResponse> genForexecuteAssetAction() {
        // basic
        HttpRequestDef.Builder<ExecuteAssetActionRequest, ExecuteAssetActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteAssetActionRequest.class, ExecuteAssetActionResponse.class)
                .withName("ExecuteAssetAction")
                .withUri("/v1/{project_id}/assets/{asset_id}/versions/{version}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteAssetActionRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteAssetActionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<ManageAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ManageAssetReq.class),
            f -> f.withMarshaller(ExecuteAssetActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetRequest, ListAssetResponse> listAsset = genForlistAsset();

    private static HttpRequestDef<ListAssetRequest, ListAssetResponse> genForlistAsset() {
        // basic
        HttpRequestDef.Builder<ListAssetRequest, ListAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetRequest.class, ListAssetResponse.class)
                .withName("ListAsset")
                .withUri("/v1/{project_id}/assets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getCategories, (req, v) -> {
                req.setCategories(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getLabels, (req, v) -> {
                req.setLabels(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("publishers",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getPublishers, (req, v) -> {
                req.setPublishers(v);
            }));
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getScope, (req, v) -> {
                req.setScope(v);
            }));
        builder.<String>withRequestField("vendor_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getVendorIds, (req, v) -> {
                req.setVendorIds(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPropertyRequest, ListPropertyResponse> listProperty = genForlistProperty();

    private static HttpRequestDef<ListPropertyRequest, ListPropertyResponse> genForlistProperty() {
        // basic
        HttpRequestDef.Builder<ListPropertyRequest, ListPropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPropertyRequest.class, ListPropertyResponse.class)
                .withName("ListProperty")
                .withUri("/v1/{project_id}/assets/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("property",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertyRequest::getProperty, (req, v) -> {
                req.setProperty(v);
            }));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropertyResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetRequest, ShowAssetResponse> showAsset = genForshowAsset();

    private static HttpRequestDef<ShowAssetRequest, ShowAssetResponse> genForshowAsset() {
        // basic
        HttpRequestDef.Builder<ShowAssetRequest, ShowAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetRequest.class, ShowAssetResponse.class)
                .withName("ShowAsset")
                .withUri("/v1/{project_id}/assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetVersionRequest, ShowAssetVersionResponse> showAssetVersion =
        genForshowAssetVersion();

    private static HttpRequestDef<ShowAssetVersionRequest, ShowAssetVersionResponse> genForshowAssetVersion() {
        // basic
        HttpRequestDef.Builder<ShowAssetVersionRequest, ShowAssetVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetVersionRequest.class, ShowAssetVersionResponse.class)
                .withName("ShowAssetVersion")
                .withUri("/v1/{project_id}/assets/{asset_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetVersionRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetVersionRequest, UpdateAssetVersionResponse> updateAssetVersion =
        genForupdateAssetVersion();

    private static HttpRequestDef<UpdateAssetVersionRequest, UpdateAssetVersionResponse> genForupdateAssetVersion() {
        // basic
        HttpRequestDef.Builder<UpdateAssetVersionRequest, UpdateAssetVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetVersionRequest.class, UpdateAssetVersionResponse.class)
                .withName("UpdateAssetVersion")
                .withUri("/v1/{project_id}/assets/{asset_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetVersionRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<UpdateAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAssetReq.class),
            f -> f.withMarshaller(UpdateAssetVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoJobRequest, CreateAutoJobResponse> createAutoJob =
        genForcreateAutoJob();

    private static HttpRequestDef<CreateAutoJobRequest, CreateAutoJobResponse> genForcreateAutoJob() {
        // basic
        HttpRequestDef.Builder<CreateAutoJobRequest, CreateAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAutoJobRequest.class, CreateAutoJobResponse.class)
                .withName("CreateAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateAutJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAutJobReq.class),
            f -> f.withMarshaller(CreateAutoJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoJobRequest, DeleteAutoJobResponse> deleteAutoJob =
        genFordeleteAutoJob();

    private static HttpRequestDef<DeleteAutoJobRequest, DeleteAutoJobResponse> genFordeleteAutoJob() {
        // basic
        HttpRequestDef.Builder<DeleteAutoJobRequest, DeleteAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAutoJobRequest.class, DeleteAutoJobResponse.class)
                .withName("DeleteAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoJobRequest, ListAutoJobResponse> listAutoJob = genForlistAutoJob();

    private static HttpRequestDef<ListAutoJobRequest, ListAutoJobResponse> genForlistAutoJob() {
        // basic
        HttpRequestDef.Builder<ListAutoJobRequest, ListAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAutoJobRequest.class, ListAutoJobResponse.class)
                .withName("ListAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoJobRequest, ShowAutoJobResponse> showAutoJob = genForshowAutoJob();

    private static HttpRequestDef<ShowAutoJobRequest, ShowAutoJobResponse> genForshowAutoJob() {
        // basic
        HttpRequestDef.Builder<ShowAutoJobRequest, ShowAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAutoJobRequest.class, ShowAutoJobResponse.class)
                .withName("ShowAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAutoJobRequest, StartAutoJobResponse> startAutoJob = genForstartAutoJob();

    private static HttpRequestDef<StartAutoJobRequest, StartAutoJobResponse> genForstartAutoJob() {
        // basic
        HttpRequestDef.Builder<StartAutoJobRequest, StartAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartAutoJobRequest.class, StartAutoJobResponse.class)
                .withName("StartAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopAutoJobRequest, StopAutoJobResponse> stopAutoJob = genForstopAutoJob();

    private static HttpRequestDef<StopAutoJobRequest, StopAutoJobResponse> genForstopAutoJob() {
        // basic
        HttpRequestDef.Builder<StopAutoJobRequest, StopAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopAutoJobRequest.class, StopAutoJobResponse.class)
                .withName("StopAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoJobRequest, UpdateAutoJobResponse> updateAutoJob =
        genForupdateAutoJob();

    private static HttpRequestDef<UpdateAutoJobRequest, UpdateAutoJobResponse> genForupdateAutoJob() {
        // basic
        HttpRequestDef.Builder<UpdateAutoJobRequest, UpdateAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAutoJobRequest.class, UpdateAutoJobResponse.class)
                .withName("UpdateAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));
        builder.<CreateAutJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAutJobReq.class),
            f -> f.withMarshaller(UpdateAutoJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScaleOutPolicyRequest, CreateScaleOutPolicyResponse> createScaleOutPolicy =
        genForcreateScaleOutPolicy();

    private static HttpRequestDef<CreateScaleOutPolicyRequest, CreateScaleOutPolicyResponse> genForcreateScaleOutPolicy() {
        // basic
        HttpRequestDef.Builder<CreateScaleOutPolicyRequest, CreateScaleOutPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateScaleOutPolicyRequest.class, CreateScaleOutPolicyResponse.class)
            .withName("CreateScaleOutPolicy")
            .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies")
            .withContentType("application/json");

        // requests
        builder.<CreateScaleOutPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateScaleOutPolicyReq.class),
            f -> f.withMarshaller(CreateScaleOutPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScaleOutPolicyRequest, DeleteScaleOutPolicyResponse> deleteScaleOutPolicy =
        genFordeleteScaleOutPolicy();

    private static HttpRequestDef<DeleteScaleOutPolicyRequest, DeleteScaleOutPolicyResponse> genFordeleteScaleOutPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteScaleOutPolicyRequest, DeleteScaleOutPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteScaleOutPolicyRequest.class, DeleteScaleOutPolicyResponse.class)
            .withName("DeleteScaleOutPolicy")
            .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScaleOutPolicyRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScaleOutPolicyRequest, ListScaleOutPolicyResponse> listScaleOutPolicy =
        genForlistScaleOutPolicy();

    private static HttpRequestDef<ListScaleOutPolicyRequest, ListScaleOutPolicyResponse> genForlistScaleOutPolicy() {
        // basic
        HttpRequestDef.Builder<ListScaleOutPolicyRequest, ListScaleOutPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScaleOutPolicyRequest.class, ListScaleOutPolicyResponse.class)
                .withName("ListScaleOutPolicy")
                .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScaleInPolicyRequest, ShowScaleInPolicyResponse> showScaleInPolicy =
        genForshowScaleInPolicy();

    private static HttpRequestDef<ShowScaleInPolicyRequest, ShowScaleInPolicyResponse> genForshowScaleInPolicy() {
        // basic
        HttpRequestDef.Builder<ShowScaleInPolicyRequest, ShowScaleInPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScaleInPolicyRequest.class, ShowScaleInPolicyResponse.class)
                .withName("ShowScaleInPolicy")
                .withUri("/v1/{project_id}/system/autoscaler/scale-in-policy")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScaleOutPolicyRequest, ShowScaleOutPolicyResponse> showScaleOutPolicy =
        genForshowScaleOutPolicy();

    private static HttpRequestDef<ShowScaleOutPolicyRequest, ShowScaleOutPolicyResponse> genForshowScaleOutPolicy() {
        // basic
        HttpRequestDef.Builder<ShowScaleOutPolicyRequest, ShowScaleOutPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScaleOutPolicyRequest.class, ShowScaleOutPolicyResponse.class)
                .withName("ShowScaleOutPolicy")
                .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScaleOutPolicyRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartScaleOutPolicyRequest, StartScaleOutPolicyResponse> startScaleOutPolicy =
        genForstartScaleOutPolicy();

    private static HttpRequestDef<StartScaleOutPolicyRequest, StartScaleOutPolicyResponse> genForstartScaleOutPolicy() {
        // basic
        HttpRequestDef.Builder<StartScaleOutPolicyRequest, StartScaleOutPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartScaleOutPolicyRequest.class, StartScaleOutPolicyResponse.class)
                .withName("StartScaleOutPolicy")
                .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies/{id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartScaleOutPolicyRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopScaleOutPolicyRequest, StopScaleOutPolicyResponse> stopScaleOutPolicy =
        genForstopScaleOutPolicy();

    private static HttpRequestDef<StopScaleOutPolicyRequest, StopScaleOutPolicyResponse> genForstopScaleOutPolicy() {
        // basic
        HttpRequestDef.Builder<StopScaleOutPolicyRequest, StopScaleOutPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopScaleOutPolicyRequest.class, StopScaleOutPolicyResponse.class)
                .withName("StopScaleOutPolicy")
                .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies/{id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopScaleOutPolicyRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScaleInPolicyRequest, UpdateScaleInPolicyResponse> updateScaleInPolicy =
        genForupdateScaleInPolicy();

    private static HttpRequestDef<UpdateScaleInPolicyRequest, UpdateScaleInPolicyResponse> genForupdateScaleInPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateScaleInPolicyRequest, UpdateScaleInPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScaleInPolicyRequest.class, UpdateScaleInPolicyResponse.class)
                .withName("UpdateScaleInPolicy")
                .withUri("/v1/{project_id}/system/autoscaler/scale-in-policy")
                .withContentType("application/json");

        // requests
        builder.<UpdateScaleInPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateScaleInPolicyReq.class),
            f -> f.withMarshaller(UpdateScaleInPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScaleOutPolicyRequest, UpdateScaleOutPolicyResponse> updateScaleOutPolicy =
        genForupdateScaleOutPolicy();

    private static HttpRequestDef<UpdateScaleOutPolicyRequest, UpdateScaleOutPolicyResponse> genForupdateScaleOutPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateScaleOutPolicyRequest, UpdateScaleOutPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateScaleOutPolicyRequest.class, UpdateScaleOutPolicyResponse.class)
            .withName("UpdateScaleOutPolicy")
            .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScaleOutPolicyRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateScaleOutPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateScaleOutPolicyReq.class),
            f -> f.withMarshaller(UpdateScaleOutPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResource =
        genForcreateComputingResource();

    private static HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> genForcreateComputingResource() {
        // basic
        HttpRequestDef.Builder<CreateComputingResourceRequest, CreateComputingResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateComputingResourceRequest.class, CreateComputingResourceResponse.class)
            .withName("CreateComputingResource")
            .withUri("/v1/{project_id}/system/computing-resources")
            .withContentType("application/json");

        // requests
        builder.<CreateComputingResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateComputingResourceReq.class),
            f -> f.withMarshaller(CreateComputingResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResource =
        genFordeleteComputingResource();

    private static HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> genFordeleteComputingResource() {
        // basic
        HttpRequestDef.Builder<DeleteComputingResourceRequest, DeleteComputingResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteComputingResourceRequest.class, DeleteComputingResourceResponse.class)
            .withName("DeleteComputingResource")
            .withUri("/v1/{project_id}/system/computing-resources/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComputingResourceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> listComputingResourceFlavors =
        genForlistComputingResourceFlavors();

    private static HttpRequestDef<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> genForlistComputingResourceFlavors() {
        // basic
        HttpRequestDef.Builder<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListComputingResourceFlavorsRequest.class,
                    ListComputingResourceFlavorsResponse.class)
                .withName("ListComputingResourceFlavors")
                .withUri("/v1/{project_id}/system/computing-resources/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComputingResourceFlavorsRequest::getAvailabilityZoneId, (req, v) -> {
                req.setAvailabilityZoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResources =
        genForlistComputingResources();

    private static HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> genForlistComputingResources() {
        // basic
        HttpRequestDef.Builder<ListComputingResourcesRequest, ListComputingResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComputingResourcesRequest.class, ListComputingResourcesResponse.class)
            .withName("ListComputingResources")
            .withUri("/v1/{project_id}/system/computing-resources")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootNodeRequest, RebootNodeResponse> rebootNode = genForrebootNode();

    private static HttpRequestDef<RebootNodeRequest, RebootNodeResponse> genForrebootNode() {
        // basic
        HttpRequestDef.Builder<RebootNodeRequest, RebootNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebootNodeRequest.class, RebootNodeResponse.class)
                .withName("RebootNode")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/reboot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootNodeRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(RebootNodeRequest::getForce, (req, v) -> {
                req.setForce(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBmsDevicesRequest, ShowBmsDevicesResponse> showBmsDevices =
        genForshowBmsDevices();

    private static HttpRequestDef<ShowBmsDevicesRequest, ShowBmsDevicesResponse> genForshowBmsDevices() {
        // basic
        HttpRequestDef.Builder<ShowBmsDevicesRequest, ShowBmsDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBmsDevicesRequest.class, ShowBmsDevicesResponse.class)
                .withName("ShowBmsDevices")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBmsDevicesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEvsQuotaRequest, ShowEvsQuotaResponse> showEvsQuota = genForshowEvsQuota();

    private static HttpRequestDef<ShowEvsQuotaRequest, ShowEvsQuotaResponse> genForshowEvsQuota() {
        // basic
        HttpRequestDef.Builder<ShowEvsQuotaRequest, ShowEvsQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEvsQuotaRequest.class, ShowEvsQuotaResponse.class)
                .withName("ShowEvsQuota")
                .withUri("/v1/{project_id}/system/computing-resources/evs-quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLeftQuotaRequest, ShowLeftQuotaResponse> showLeftQuota =
        genForshowLeftQuota();

    private static HttpRequestDef<ShowLeftQuotaRequest, ShowLeftQuotaResponse> genForshowLeftQuota() {
        // basic
        HttpRequestDef.Builder<ShowLeftQuotaRequest, ShowLeftQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLeftQuotaRequest.class, ShowLeftQuotaResponse.class)
                .withName("ShowLeftQuota")
                .withUri("/v1/{project_id}/system/computing-resources/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScheduleRequest, ShowScheduleResponse> showSchedule = genForshowSchedule();

    private static HttpRequestDef<ShowScheduleRequest, ShowScheduleResponse> genForshowSchedule() {
        // basic
        HttpRequestDef.Builder<ShowScheduleRequest, ShowScheduleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScheduleRequest.class, ShowScheduleResponse.class)
                .withName("ShowSchedule")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/schedule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScheduleRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNodeRequest, StartNodeResponse> startNode = genForstartNode();

    private static HttpRequestDef<StartNodeRequest, StartNodeResponse> genForstartNode() {
        // basic
        HttpRequestDef.Builder<StartNodeRequest, StartNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartNodeRequest.class, StartNodeResponse.class)
                .withName("StartNode")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNodeRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopNodeRequest, StopNodeResponse> stopNode = genForstopNode();

    private static HttpRequestDef<StopNodeRequest, StopNodeResponse> genForstopNode() {
        // basic
        HttpRequestDef.Builder<StopNodeRequest, StopNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopNodeRequest.class, StopNodeResponse.class)
                .withName("StopNode")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopNodeRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StopNodeRequest::getForce, (req, v) -> {
                req.setForce(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScheduleRequest, UpdateScheduleResponse> updateSchedule =
        genForupdateSchedule();

    private static HttpRequestDef<UpdateScheduleRequest, UpdateScheduleResponse> genForupdateSchedule() {
        // basic
        HttpRequestDef.Builder<UpdateScheduleRequest, UpdateScheduleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScheduleRequest.class, UpdateScheduleResponse.class)
                .withName("UpdateSchedule")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/schedule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduleRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateScheduleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScheduleReq.class),
            f -> f.withMarshaller(UpdateScheduleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackupRequest, CreateBackupResponse> createBackup = genForcreateBackup();

    private static HttpRequestDef<CreateBackupRequest, CreateBackupResponse> genForcreateBackup() {
        // basic
        HttpRequestDef.Builder<CreateBackupRequest, CreateBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBackupRequest.class, CreateBackupResponse.class)
                .withName("CreateBackup")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBackupRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBackupReq.class),
            f -> f.withMarshaller(CreateBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genFordeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genFordeleteBackup() {
        // basic
        HttpRequestDef.Builder<DeleteBackupRequest, DeleteBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupRequest.class, DeleteBackupResponse.class)
                .withName("DeleteBackup")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupRequest, ListBackupResponse> listBackup = genForlistBackup();

    private static HttpRequestDef<ListBackupRequest, ListBackupResponse> genForlistBackup() {
        // basic
        HttpRequestDef.Builder<ListBackupRequest, ListBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupRequest.class, ListBackupResponse.class)
                .withName("ListBackup")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> restoreBackup =
        genForrestoreBackup();

    private static HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> genForrestoreBackup() {
        // basic
        HttpRequestDef.Builder<RestoreBackupRequest, RestoreBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreBackupRequest.class, RestoreBackupResponse.class)
                .withName("RestoreBackup")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups/{backup_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBackupRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<RestoreBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreBackupReq.class),
            f -> f.withMarshaller(RestoreBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPathRequest, ShowBackupPathResponse> showBackupPath =
        genForshowBackupPath();

    private static HttpRequestDef<ShowBackupPathRequest, ShowBackupPathResponse> genForshowBackupPath() {
        // basic
        HttpRequestDef.Builder<ShowBackupPathRequest, ShowBackupPathResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPathRequest.class, ShowBackupPathResponse.class)
                .withName("ShowBackupPath")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups/{backup_id}/paths")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPathRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPathRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDataRequest, BatchDeleteDataResponse> batchDeleteData =
        genForbatchDeleteData();

    private static HttpRequestDef<BatchDeleteDataRequest, BatchDeleteDataResponse> genForbatchDeleteData() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDataRequest, BatchDeleteDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteDataRequest.class, BatchDeleteDataResponse.class)
                .withName("BatchDeleteData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchDeleteDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDataReq.class),
            f -> f.withMarshaller(BatchDeleteDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyDataRequest, CopyDataResponse> copyData = genForcopyData();

    private static HttpRequestDef<CopyDataRequest, CopyDataResponse> genForcopyData() {
        // basic
        HttpRequestDef.Builder<CopyDataRequest, CopyDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyDataRequest.class, CopyDataResponse.class)
                .withName("CopyData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/clone")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CloneDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloneDataReq.class),
            f -> f.withMarshaller(CopyDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataRequest, CreateDataResponse> createData = genForcreateData();

    private static HttpRequestDef<CreateDataRequest, CreateDataResponse> genForcreateData() {
        // basic
        HttpRequestDef.Builder<CreateDataRequest, CreateDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataRequest.class, CreateDataResponse.class)
                .withName("CreateData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataReq.class),
            f -> f.withMarshaller(CreateDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDataRequest, ImportDataResponse> importData = genForimportData();

    private static HttpRequestDef<ImportDataRequest, ImportDataResponse> genForimportData() {
        // basic
        HttpRequestDef.Builder<ImportDataRequest, ImportDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportDataRequest.class, ImportDataResponse.class)
                .withName("ImportData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportDataReq.class),
            f -> f.withMarshaller(ImportDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportNetworkDataRequest, ImportNetworkDataResponse> importNetworkData =
        genForimportNetworkData();

    private static HttpRequestDef<ImportNetworkDataRequest, ImportNetworkDataResponse> genForimportNetworkData() {
        // basic
        HttpRequestDef.Builder<ImportNetworkDataRequest, ImportNetworkDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportNetworkDataRequest.class, ImportNetworkDataResponse.class)
                .withName("ImportNetworkData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/import-from-network")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportNetworkDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportNetworkDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportNetworkDataReq.class),
            f -> f.withMarshaller(ImportNetworkDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBucketRequest, ListBucketResponse> listBucket = genForlistBucket();

    private static HttpRequestDef<ListBucketRequest, ListBucketResponse> genForlistBucket() {
        // basic
        HttpRequestDef.Builder<ListBucketRequest, ListBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBucketRequest.class, ListBucketResponse.class)
                .withName("ListBucket")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/buckets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBucketRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataRequest, ListDataResponse> listData = genForlistData();

    private static HttpRequestDef<ListDataRequest, ListDataResponse> genForlistData() {
        // basic
        HttpRequestDef.Builder<ListDataRequest, ListDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataRequest.class, ListDataResponse.class)
                .withName("ListData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishDataRequest, PublishDataResponse> publishData = genForpublishData();

    private static HttpRequestDef<PublishDataRequest, PublishDataResponse> genForpublishData() {
        // basic
        HttpRequestDef.Builder<PublishDataRequest, PublishDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishDataRequest.class, PublishDataResponse.class)
                .withName("PublishData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<PublishDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishDataReq.class),
            f -> f.withMarshaller(PublishDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<QuoteDataRequest, QuoteDataResponse> quoteData = genForquoteData();

    private static HttpRequestDef<QuoteDataRequest, QuoteDataResponse> genForquoteData() {
        // basic
        HttpRequestDef.Builder<QuoteDataRequest, QuoteDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, QuoteDataRequest.class, QuoteDataResponse.class)
                .withName("QuoteData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/quote")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(QuoteDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<QuoteDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuoteDataReq.class),
            f -> f.withMarshaller(QuoteDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketStorageRequest, ShowBucketStorageResponse> showBucketStorage =
        genForshowBucketStorage();

    private static HttpRequestDef<ShowBucketStorageRequest, ShowBucketStorageResponse> genForshowBucketStorage() {
        // basic
        HttpRequestDef.Builder<ShowBucketStorageRequest, ShowBucketStorageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBucketStorageRequest.class, ShowBucketStorageResponse.class)
                .withName("ShowBucketStorage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/bucket-storage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBucketStorageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataRequest, ShowDataResponse> showData = genForshowData();

    private static HttpRequestDef<ShowDataRequest, ShowDataResponse> genForshowData() {
        // basic
        HttpRequestDef.Builder<ShowDataRequest, ShowDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataRequest.class, ShowDataResponse.class)
                .withName("ShowData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<Boolean>withRequestField("X-Need-Content",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDataRequest::getXNeedContent, (req, v) -> {
                req.setXNeedContent(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataPolicyRequest, ShowDataPolicyResponse> showDataPolicy =
        genForshowDataPolicy();

    private static HttpRequestDef<ShowDataPolicyRequest, ShowDataPolicyResponse> genForshowDataPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDataPolicyRequest, ShowDataPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataPolicyRequest.class, ShowDataPolicyResponse.class)
                .withName("ShowDataPolicy")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataPolicyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeDataRequest, SubscribeDataResponse> subscribeData =
        genForsubscribeData();

    private static HttpRequestDef<SubscribeDataRequest, SubscribeDataResponse> genForsubscribeData() {
        // basic
        HttpRequestDef.Builder<SubscribeDataRequest, SubscribeDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeDataRequest.class, SubscribeDataResponse.class)
                .withName("SubscribeData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<SubscribeDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeDataReq.class),
            f -> f.withMarshaller(SubscribeDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> updateDataPathPolicy =
        genForupdateDataPathPolicy();

    private static HttpRequestDef<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> genForupdateDataPathPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDataPathPolicyRequest.class, UpdateDataPathPolicyResponse.class)
            .withName("UpdateDataPathPolicy")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/{path}/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<DataPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataPolicyReq.class),
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataPolicyRequest, UpdateDataPolicyResponse> updateDataPolicy =
        genForupdateDataPolicy();

    private static HttpRequestDef<UpdateDataPolicyRequest, UpdateDataPolicyResponse> genForupdateDataPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDataPolicyRequest, UpdateDataPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataPolicyRequest.class, UpdateDataPolicyResponse.class)
                .withName("UpdateDataPolicy")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataPolicyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<UpdateDataPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDataPolicyReq.class),
            f -> f.withMarshaller(UpdateDataPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadDataRequest, UploadDataResponse> uploadData = genForuploadData();

    private static HttpRequestDef<UploadDataRequest, UploadDataResponse> genForuploadData() {
        // basic
        HttpRequestDef.Builder<UploadDataRequest, UploadDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadDataRequest.class, UploadDataResponse.class)
                .withName("UploadData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("target_folder",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getTargetFolder, (req, v) -> {
                req.setTargetFolder(v);
            }));
        builder.<Integer>withRequestField("part_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UploadDataRequest::getPartNumber, (req, v) -> {
                req.setPartNumber(v);
            }));
        builder.<Integer>withRequestField("total_part",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UploadDataRequest::getTotalPart, (req, v) -> {
                req.setTotalPart(v);
            }));
        builder.<String>withRequestField("multipart_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getMultipartId, (req, v) -> {
                req.setMultipartId(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<String>withRequestField("md5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getMd5, (req, v) -> {
                req.setMd5(v);
            }));
        builder.<UploadDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadDataRequestBody.class),
            f -> f.withMarshaller(UploadDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelDataJobRequest, CancelDataJobResponse> cancelDataJob =
        genForcancelDataJob();

    private static HttpRequestDef<CancelDataJobRequest, CancelDataJobResponse> genForcancelDataJob() {
        // basic
        HttpRequestDef.Builder<CancelDataJobRequest, CancelDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelDataJobRequest.class, CancelDataJobResponse.class)
                .withName("CancelDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDataJobRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataJobRequest, DeleteDataJobResponse> deleteDataJob =
        genFordeleteDataJob();

    private static HttpRequestDef<DeleteDataJobRequest, DeleteDataJobResponse> genFordeleteDataJob() {
        // basic
        HttpRequestDef.Builder<DeleteDataJobRequest, DeleteDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDataJobRequest.class, DeleteDataJobResponse.class)
                .withName("DeleteDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataJobRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDataJobLogRequest, DownloadDataJobLogResponse> downloadDataJobLog =
        genFordownloadDataJobLog();

    private static HttpRequestDef<DownloadDataJobLogRequest, DownloadDataJobLogResponse> genFordownloadDataJobLog() {
        // basic
        HttpRequestDef.Builder<DownloadDataJobLogRequest, DownloadDataJobLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadDataJobLogRequest.class, DownloadDataJobLogResponse.class)
                .withName("DownloadDataJobLog")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataJobLogRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataJobLogRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCheckpointRequest, ListCheckpointResponse> listCheckpoint =
        genForlistCheckpoint();

    private static HttpRequestDef<ListCheckpointRequest, ListCheckpointResponse> genForlistCheckpoint() {
        // basic
        HttpRequestDef.Builder<ListCheckpointRequest, ListCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCheckpointRequest.class, ListCheckpointResponse.class)
                .withName("ListCheckpoint")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}/checkpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCheckpointRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCheckpointRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataJobRequest, ListDataJobResponse> listDataJob = genForlistDataJob();

    private static HttpRequestDef<ListDataJobRequest, ListDataJobResponse> genForlistDataJob() {
        // basic
        HttpRequestDef.Builder<ListDataJobRequest, ListDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataJobRequest.class, ListDataJobResponse.class)
                .withName("ListDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getCreator, (req, v) -> {
                req.setCreator(v);
            }));
        builder.<Long>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFromTime, (req, v) -> {
                req.setFromTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getToTime, (req, v) -> {
                req.setToTime(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Long>withRequestField("finish_from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFinishFromTime, (req, v) -> {
                req.setFinishFromTime(v);
            }));
        builder.<Long>withRequestField("finish_to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFinishToTime, (req, v) -> {
                req.setFinishToTime(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryDataJobRequest, RetryDataJobResponse> retryDataJob = genForretryDataJob();

    private static HttpRequestDef<RetryDataJobRequest, RetryDataJobResponse> genForretryDataJob() {
        // basic
        HttpRequestDef.Builder<RetryDataJobRequest, RetryDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryDataJobRequest.class, RetryDataJobResponse.class)
                .withName("RetryDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryDataJobRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataJobRequest, ShowDataJobResponse> showDataJob = genForshowDataJob();

    private static HttpRequestDef<ShowDataJobRequest, ShowDataJobResponse> genForshowDataJob() {
        // basic
        HttpRequestDef.Builder<ShowDataJobRequest, ShowDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataJobRequest.class, ShowDataJobResponse.class)
                .withName("ShowDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataJobRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseDataRequest, CreateDatabaseDataResponse> createDatabaseData =
        genForcreateDatabaseData();

    private static HttpRequestDef<CreateDatabaseDataRequest, CreateDatabaseDataResponse> genForcreateDatabaseData() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseDataRequest, CreateDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseDataRequest.class, CreateDatabaseDataResponse.class)
                .withName("CreateDatabaseData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data/insert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<RowDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RowDataReq.class),
            f -> f.withMarshaller(CreateDatabaseDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseReq.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> deleteDatabaseData =
        genFordeleteDatabaseData();

    private static HttpRequestDef<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> genFordeleteDatabaseData() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseDataRequest.class, DeleteDatabaseDataResponse.class)
                .withName("DeleteDatabaseData")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data/{row_num}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<Long>withRequestField("row_num",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getRowNum, (req, v) -> {
                req.setRowNum(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDatabaseDataRequest, ImportDatabaseDataResponse> importDatabaseData =
        genForimportDatabaseData();

    private static HttpRequestDef<ImportDatabaseDataRequest, ImportDatabaseDataResponse> genForimportDatabaseData() {
        // basic
        HttpRequestDef.Builder<ImportDatabaseDataRequest, ImportDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportDatabaseDataRequest.class, ImportDatabaseDataResponse.class)
                .withName("ImportDatabaseData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<ImportDatabaseDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportDatabaseDataReq.class),
            f -> f.withMarshaller(ImportDatabaseDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseDataRequest, ListDatabaseDataResponse> listDatabaseData =
        genForlistDatabaseData();

    private static HttpRequestDef<ListDatabaseDataRequest, ListDatabaseDataResponse> genForlistDatabaseData() {
        // basic
        HttpRequestDef.Builder<ListDatabaseDataRequest, ListDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseDataRequest.class, ListDatabaseDataResponse.class)
                .withName("ListDatabaseData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getQuery, (req, v) -> {
                req.setQuery(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForlistInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForlistInstance() {
        // basic
        HttpRequestDef.Builder<ListInstanceRequest, ListInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceRequest.class, ListInstanceResponse.class)
                .withName("ListInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<QuoteInstanceRequest, QuoteInstanceResponse> quoteInstance =
        genForquoteInstance();

    private static HttpRequestDef<QuoteInstanceRequest, QuoteInstanceResponse> genForquoteInstance() {
        // basic
        HttpRequestDef.Builder<QuoteInstanceRequest, QuoteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, QuoteInstanceRequest.class, QuoteInstanceResponse.class)
                .withName("QuoteInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/batch-quote")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(QuoteInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<QuoteDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuoteDatabaseReq.class),
            f -> f.withMarshaller(QuoteInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<QuoteDatabaseResultRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(QuoteInstanceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(QuoteDatabaseResultRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> updateDatabaseData =
        genForupdateDatabaseData();

    private static HttpRequestDef<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> genForupdateDatabaseData() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDatabaseDataRequest.class, UpdateDatabaseDataResponse.class)
                .withName("UpdateDatabaseData")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data/{row_num}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<Long>withRequestField("row_num",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getRowNum, (req, v) -> {
                req.setRowNum(v);
            }));
        builder.<RowDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RowDataReq.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> createDatabaseResource =
        genForcreateDatabaseResource();

    private static HttpRequestDef<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> genForcreateDatabaseResource() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDatabaseResourceRequest.class, CreateDatabaseResourceResponse.class)
            .withName("CreateDatabaseResource")
            .withUri("/v1/{project_id}/system/database-resources")
            .withContentType("application/json");

        // requests
        builder.<CreateDatabaseResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDatabaseResourceReq.class),
            f -> f.withMarshaller(CreateDatabaseResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> deleteDatabaseResource =
        genFordeleteDatabaseResource();

    private static HttpRequestDef<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> genFordeleteDatabaseResource() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDatabaseResourceRequest.class, DeleteDatabaseResourceResponse.class)
            .withName("DeleteDatabaseResource")
            .withUri("/v1/{project_id}/system/database-resources/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseResourceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseResourceRequest, ListDatabaseResourceResponse> listDatabaseResource =
        genForlistDatabaseResource();

    private static HttpRequestDef<ListDatabaseResourceRequest, ListDatabaseResourceResponse> genForlistDatabaseResource() {
        // basic
        HttpRequestDef.Builder<ListDatabaseResourceRequest, ListDatabaseResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDatabaseResourceRequest.class, ListDatabaseResourceResponse.class)
            .withName("ListDatabaseResource")
            .withUri("/v1/{project_id}/system/database-resources")
            .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-Resource-Mappings",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatabaseResourceResponse::getXResourceMappings,
                ListDatabaseResourceResponse::setXResourceMappings));
        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> listDatabaseResourceFlavor =
        genForlistDatabaseResourceFlavor();

    private static HttpRequestDef<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> genForlistDatabaseResourceFlavor() {
        // basic
        HttpRequestDef.Builder<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDatabaseResourceFlavorRequest.class,
                    ListDatabaseResourceFlavorResponse.class)
                .withName("ListDatabaseResourceFlavor")
                .withUri("/v1/{project_id}/system/database-resources/flavors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDockingJobRequest, CreateDockingJobResponse> createDockingJob =
        genForcreateDockingJob();

    private static HttpRequestDef<CreateDockingJobRequest, CreateDockingJobResponse> genForcreateDockingJob() {
        // basic
        HttpRequestDef.Builder<CreateDockingJobRequest, CreateDockingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDockingJobRequest.class, CreateDockingJobResponse.class)
                .withName("CreateDockingJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/docking")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDockingJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateDockJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDockJobReq.class),
            f -> f.withMarshaller(CreateDockingJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDockingJobRequest, ShowDockingJobResponse> showDockingJob =
        genForshowDockingJob();

    private static HttpRequestDef<ShowDockingJobRequest, ShowDockingJobResponse> genForshowDockingJob() {
        // basic
        HttpRequestDef.Builder<ShowDockingJobRequest, ShowDockingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDockingJobRequest.class, ShowDockingJobResponse.class)
                .withName("ShowDockingJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/docking/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDockingJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDockingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse> checkDrugLigandDifference =
        genForcheckDrugLigandDifference();

    private static HttpRequestDef<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse> genForcheckDrugLigandDifference() {
        // basic
        HttpRequestDef.Builder<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CheckDrugLigandDifferenceRequest.class,
                    CheckDrugLigandDifferenceResponse.class)
                .withName("CheckDrugLigandDifference")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/diff3d")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDrugLigandDifferenceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CheckLigandDifferenceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckLigandDifferenceReq.class),
            f -> f.withMarshaller(CheckDrugLigandDifferenceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse> createDrugLigandInteraction2dSvg =
        genForcreateDrugLigandInteraction2dSvg();

    private static HttpRequestDef<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse> genForcreateDrugLigandInteraction2dSvg() {
        // basic
        HttpRequestDef.Builder<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDrugLigandInteraction2dSvgRequest.class,
                    CreateDrugLigandInteraction2dSvgResponse.class)
                .withName("CreateDrugLigandInteraction2dSvg")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/interaction2d")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDrugLigandInteraction2dSvgRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateDrugLigandInteraction2dSvgReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDrugLigandInteraction2dSvgReq.class),
            f -> f.withMarshaller(CreateDrugLigandInteraction2dSvgRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse> createDrugLigandPreviewTask =
        genForcreateDrugLigandPreviewTask();

    private static HttpRequestDef<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse> genForcreateDrugLigandPreviewTask() {
        // basic
        HttpRequestDef.Builder<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDrugLigandPreviewTaskRequest.class,
                    CreateDrugLigandPreviewTaskResponse.class)
                .withName("CreateDrugLigandPreviewTask")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/preview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDrugLigandPreviewTaskRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateLigandPreviewTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLigandPreviewTaskReq.class),
            f -> f.withMarshaller(CreateDrugLigandPreviewTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse> createDrugLigandSdf =
        genForcreateDrugLigandSdf();

    private static HttpRequestDef<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse> genForcreateDrugLigandSdf() {
        // basic
        HttpRequestDef.Builder<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDrugLigandSdfRequest.class, CreateDrugLigandSdfResponse.class)
                .withName("CreateDrugLigandSdf")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/sdf")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDrugLigandSdfRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateLigandSdfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLigandSdfReq.class),
            f -> f.withMarshaller(CreateDrugLigandSdfRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDrugLigandSdfResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse> createDrugLigandSimilarityGraphTask =
        genForcreateDrugLigandSimilarityGraphTask();

    private static HttpRequestDef<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse> genForcreateDrugLigandSimilarityGraphTask() {
        // basic
        HttpRequestDef.Builder<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDrugLigandSimilarityGraphTaskRequest.class,
                    CreateDrugLigandSimilarityGraphTaskResponse.class)
                .withName("CreateDrugLigandSimilarityGraphTask")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/similarity-graph")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDrugLigandSimilarityGraphTaskRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateLigandSimilarityGraphTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLigandSimilarityGraphTaskReq.class),
            f -> f.withMarshaller(CreateDrugLigandSimilarityGraphTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse> createDrugLigandSvg =
        genForcreateDrugLigandSvg();

    private static HttpRequestDef<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse> genForcreateDrugLigandSvg() {
        // basic
        HttpRequestDef.Builder<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDrugLigandSvgRequest.class, CreateDrugLigandSvgResponse.class)
                .withName("CreateDrugLigandSvg")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/svg")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDrugLigandSvgRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateLigandSvgReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLigandSvgReq.class),
            f -> f.withMarshaller(CreateDrugLigandSvgRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDrugLigandSvgResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse> deleteDrugLigandPreviewTask =
        genFordeleteDrugLigandPreviewTask();

    private static HttpRequestDef<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse> genFordeleteDrugLigandPreviewTask() {
        // basic
        HttpRequestDef.Builder<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDrugLigandPreviewTaskRequest.class,
                    DeleteDrugLigandPreviewTaskResponse.class)
                .withName("DeleteDrugLigandPreviewTask")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/preview/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugLigandPreviewTaskRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugLigandPreviewTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse> deleteDrugLigandSimilarityGraphTask =
        genFordeleteDrugLigandSimilarityGraphTask();

    private static HttpRequestDef<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse> genFordeleteDrugLigandSimilarityGraphTask() {
        // basic
        HttpRequestDef.Builder<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDrugLigandSimilarityGraphTaskRequest.class,
                    DeleteDrugLigandSimilarityGraphTaskResponse.class)
                .withName("DeleteDrugLigandSimilarityGraphTask")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/similarity-graph/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugLigandSimilarityGraphTaskRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugLigandSimilarityGraphTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse> parseDrugReceptorInfo =
        genForparseDrugReceptorInfo();

    private static HttpRequestDef<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse> genForparseDrugReceptorInfo() {
        // basic
        HttpRequestDef.Builder<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ParseDrugReceptorInfoRequest.class, ParseDrugReceptorInfoResponse.class)
            .withName("ParseDrugReceptorInfo")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/receptor/info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ParseDrugReceptorInfoRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ReceptorDrugFile>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReceptorDrugFile.class),
            f -> f.withMarshaller(ParseDrugReceptorInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse> recognizeDrugReceptorPocket =
        genForrecognizeDrugReceptorPocket();

    private static HttpRequestDef<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse> genForrecognizeDrugReceptorPocket() {
        // basic
        HttpRequestDef.Builder<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeDrugReceptorPocketRequest.class,
                    RecognizeDrugReceptorPocketResponse.class)
                .withName("RecognizeDrugReceptorPocket")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/receptor/pocket")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeDrugReceptorPocketRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<RecognizeReceptorPocketReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecognizeReceptorPocketReq.class),
            f -> f.withMarshaller(RecognizeDrugReceptorPocketRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse> runDrugLigandToSmilesConversion =
        genForrunDrugLigandToSmilesConversion();

    private static HttpRequestDef<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse> genForrunDrugLigandToSmilesConversion() {
        // basic
        HttpRequestDef.Builder<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunDrugLigandToSmilesConversionRequest.class,
                    RunDrugLigandToSmilesConversionResponse.class)
                .withName("RunDrugLigandToSmilesConversion")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/smiles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunDrugLigandToSmilesConversionRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<DrugFile>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DrugFile.class),
            f -> f.withMarshaller(RunDrugLigandToSmilesConversionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse> runDrugReceptorPreprocess =
        genForrunDrugReceptorPreprocess();

    private static HttpRequestDef<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse> genForrunDrugReceptorPreprocess() {
        // basic
        HttpRequestDef.Builder<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunDrugReceptorPreprocessRequest.class,
                    RunDrugReceptorPreprocessResponse.class)
                .withName("RunDrugReceptorPreprocess")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/receptor/preprocess")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunDrugReceptorPreprocessRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<RunReceptorPreprocessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunReceptorPreprocessReq.class),
            f -> f.withMarshaller(RunDrugReceptorPreprocessRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RunDrugReceptorPreprocessResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse> showDrugLigandPreviewTask =
        genForshowDrugLigandPreviewTask();

    private static HttpRequestDef<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse> genForshowDrugLigandPreviewTask() {
        // basic
        HttpRequestDef.Builder<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDrugLigandPreviewTaskRequest.class,
                    ShowDrugLigandPreviewTaskResponse.class)
                .withName("ShowDrugLigandPreviewTask")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/preview/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrugLigandPreviewTaskRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrugLigandPreviewTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse> showDrugLigandSimilarityGraphTask =
        genForshowDrugLigandSimilarityGraphTask();

    private static HttpRequestDef<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse> genForshowDrugLigandSimilarityGraphTask() {
        // basic
        HttpRequestDef.Builder<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDrugLigandSimilarityGraphTaskRequest.class,
                    ShowDrugLigandSimilarityGraphTaskResponse.class)
                .withName("ShowDrugLigandSimilarityGraphTask")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/ligand/similarity-graph/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrugLigandSimilarityGraphTaskRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrugLigandSimilarityGraphTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelDrugJobRequest, CancelDrugJobResponse> cancelDrugJob =
        genForcancelDrugJob();

    private static HttpRequestDef<CancelDrugJobRequest, CancelDrugJobResponse> genForcancelDrugJob() {
        // basic
        HttpRequestDef.Builder<CancelDrugJobRequest, CancelDrugJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelDrugJobRequest.class, CancelDrugJobResponse.class)
                .withName("CancelDrugJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDrugJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDrugJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDrugJobRequest, DeleteDrugJobResponse> deleteDrugJob =
        genFordeleteDrugJob();

    private static HttpRequestDef<DeleteDrugJobRequest, DeleteDrugJobResponse> genFordeleteDrugJob() {
        // basic
        HttpRequestDef.Builder<DeleteDrugJobRequest, DeleteDrugJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDrugJobRequest.class, DeleteDrugJobResponse.class)
                .withName("DeleteDrugJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDrugJobRequest, ListDrugJobResponse> listDrugJob = genForlistDrugJob();

    private static HttpRequestDef<ListDrugJobRequest, ListDrugJobResponse> genForlistDrugJob() {
        // basic
        HttpRequestDef.Builder<ListDrugJobRequest, ListDrugJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDrugJobRequest.class, ListDrugJobResponse.class)
                .withName("ListDrugJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugJobRequest::getLabels, (req, v) -> {
                req.setLabels(v);
            }));
        builder.<List<String>>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugJobRequest::getStatusList, (req, v) -> {
                req.setStatusList(v);
            }));
        builder.<List<String>>withRequestField("type_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugJobRequest::getTypeList, (req, v) -> {
                req.setTypeList(v);
            }));
        builder.<Long>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugJobRequest::getCreateStartTime, (req, v) -> {
                req.setCreateStartTime(v);
            }));
        builder.<Long>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugJobRequest::getCreateEndTime, (req, v) -> {
                req.setCreateEndTime(v);
            }));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugJobRequest::getFinishStartTime, (req, v) -> {
                req.setFinishStartTime(v);
            }));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugJobRequest::getFinishEndTime, (req, v) -> {
                req.setFinishEndTime(v);
            }));
        builder.<String>withRequestField("total_time_range",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getTotalTimeRange, (req, v) -> {
                req.setTotalTimeRange(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFepJobRequest, CreateFepJobResponse> createFepJob = genForcreateFepJob();

    private static HttpRequestDef<CreateFepJobRequest, CreateFepJobResponse> genForcreateFepJob() {
        // basic
        HttpRequestDef.Builder<CreateFepJobRequest, CreateFepJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFepJobRequest.class, CreateFepJobResponse.class)
                .withName("CreateFepJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/fep")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFepJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateFepJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFepJobReq.class),
            f -> f.withMarshaller(CreateFepJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFepJobRequest, ShowFepJobResponse> showFepJob = genForshowFepJob();

    private static HttpRequestDef<ShowFepJobRequest, ShowFepJobResponse> genForshowFepJob() {
        // basic
        HttpRequestDef.Builder<ShowFepJobRequest, ShowFepJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFepJobRequest.class, ShowFepJobResponse.class)
                .withName("ShowFepJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/fep/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFepJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFepJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagRequest, BatchDeleteTagResponse> batchDeleteTag =
        genForbatchDeleteTag();

    private static HttpRequestDef<BatchDeleteTagRequest, BatchDeleteTagResponse> genForbatchDeleteTag() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagRequest, BatchDeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagRequest.class, BatchDeleteTagResponse.class)
                .withName("BatchDeleteTag")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}/tags/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<BatchDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagReq.class),
            f -> f.withMarshaller(BatchDeleteTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<DeleteTagRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(DeleteTagRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageRequest, CreateImageResponse> createImage = genForcreateImage();

    private static HttpRequestDef<CreateImageRequest, CreateImageResponse> genForcreateImage() {
        // basic
        HttpRequestDef.Builder<CreateImageRequest, CreateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageRequest.class, CreateImageResponse.class)
                .withName("CreateImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageReq.class),
            f -> f.withMarshaller(CreateImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageRequest, DeleteImageResponse> deleteImage = genFordeleteImage();

    private static HttpRequestDef<DeleteImageRequest, DeleteImageResponse> genFordeleteImage() {
        // basic
        HttpRequestDef.Builder<DeleteImageRequest, DeleteImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageRequest.class, DeleteImageResponse.class)
                .withName("DeleteImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}/tags/{tag}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportImageRequest, ImportImageResponse> importImage = genForimportImage();

    private static HttpRequestDef<ImportImageRequest, ImportImageResponse> genForimportImage() {
        // basic
        HttpRequestDef.Builder<ImportImageRequest, ImportImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportImageRequest.class, ImportImageResponse.class)
                .withName("ImportImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportImageReq.class),
            f -> f.withMarshaller(ImportImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageRequest, ListImageResponse> listImage = genForlistImage();

    private static HttpRequestDef<ListImageRequest, ListImageResponse> genForlistImage() {
        // basic
        HttpRequestDef.Builder<ListImageRequest, ListImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageRequest.class, ListImageResponse.class)
                .withName("ListImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("show_empty",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListImageRequest::getShowEmpty, (req, v) -> {
                req.setShowEmpty(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageTagRequest, ListImageTagResponse> listImageTag = genForlistImageTag();

    private static HttpRequestDef<ListImageTagRequest, ListImageTagResponse> genForlistImageTag() {
        // basic
        HttpRequestDef.Builder<ListImageTagRequest, ListImageTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageTagRequest.class, ListImageTagResponse.class)
                .withName("ListImageTag")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageTagRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageTagRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishImageRequest, PublishImageResponse> publishImage = genForpublishImage();

    private static HttpRequestDef<PublishImageRequest, PublishImageResponse> genForpublishImage() {
        // basic
        HttpRequestDef.Builder<PublishImageRequest, PublishImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishImageRequest.class, PublishImageResponse.class)
                .withName("PublishImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<PublishAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetReq.class),
            f -> f.withMarshaller(PublishImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDockerLoginRequest, ShowDockerLoginResponse> showDockerLogin =
        genForshowDockerLogin();

    private static HttpRequestDef<ShowDockerLoginRequest, ShowDockerLoginResponse> genForshowDockerLogin() {
        // basic
        HttpRequestDef.Builder<ShowDockerLoginRequest, ShowDockerLoginResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDockerLoginRequest.class, ShowDockerLoginResponse.class)
                .withName("ShowDockerLogin")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/docker-login-cmd")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDockerLoginRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeImageRequest, SubscribeImageResponse> subscribeImage =
        genForsubscribeImage();

    private static HttpRequestDef<SubscribeImageRequest, SubscribeImageResponse> genForsubscribeImage() {
        // basic
        HttpRequestDef.Builder<SubscribeImageRequest, SubscribeImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeImageRequest.class, SubscribeImageResponse.class)
                .withName("SubscribeImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<SubscribeImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeImageReq.class),
            f -> f.withMarshaller(SubscribeImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateImageRequest, UpdateImageResponse> updateImage = genForupdateImage();

    private static HttpRequestDef<UpdateImageRequest, UpdateImageResponse> genForupdateImage() {
        // basic
        HttpRequestDef.Builder<UpdateImageRequest, UpdateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateImageRequest.class, UpdateImageResponse.class)
                .withName("UpdateImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<UpdateImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateImageReq.class),
            f -> f.withMarshaller(UpdateImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfig =
        genForshowJobConfig();

    private static HttpRequestDef<ShowJobConfigRequest, ShowJobConfigResponse> genForshowJobConfig() {
        // basic
        HttpRequestDef.Builder<ShowJobConfigRequest, ShowJobConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobConfigRequest.class, ShowJobConfigResponse.class)
                .withName("ShowJobConfig")
                .withUri("/v1/{project_id}/system/job-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobConfigRequest, UpdateJobConfigResponse> updateJobConfig =
        genForupdateJobConfig();

    private static HttpRequestDef<UpdateJobConfigRequest, UpdateJobConfigResponse> genForupdateJobConfig() {
        // basic
        HttpRequestDef.Builder<UpdateJobConfigRequest, UpdateJobConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobConfigRequest.class, UpdateJobConfigResponse.class)
                .withName("UpdateJobConfig")
                .withUri("/v1/{project_id}/system/job-config")
                .withContentType("application/json");

        // requests
        builder.<UpdateJobConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateJobConfigReq.class),
            f -> f.withMarshaller(UpdateJobConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCancelJobRequest, BatchCancelJobResponse> batchCancelJob =
        genForbatchCancelJob();

    private static HttpRequestDef<BatchCancelJobRequest, BatchCancelJobResponse> genForbatchCancelJob() {
        // basic
        HttpRequestDef.Builder<BatchCancelJobRequest, BatchCancelJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCancelJobRequest.class, BatchCancelJobResponse.class)
                .withName("BatchCancelJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/batch-terminate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCancelJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Boolean>withRequestField("X-Force",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(BatchCancelJobRequest::getXForce, (req, v) -> {
                req.setXForce(v);
            }));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchCancelJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchCancelJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteJobRequest, BatchDeleteJobResponse> batchDeleteJob =
        genForbatchDeleteJob();

    private static HttpRequestDef<BatchDeleteJobRequest, BatchDeleteJobResponse> genForbatchDeleteJob() {
        // basic
        HttpRequestDef.Builder<BatchDeleteJobRequest, BatchDeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteJobRequest.class, BatchDeleteJobResponse.class)
                .withName("BatchDeleteJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchDeleteJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchRetryJobRequest, BatchRetryJobResponse> batchRetryJob =
        genForbatchRetryJob();

    private static HttpRequestDef<BatchRetryJobRequest, BatchRetryJobResponse> genForbatchRetryJob() {
        // basic
        HttpRequestDef.Builder<BatchRetryJobRequest, BatchRetryJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRetryJobRequest.class, BatchRetryJobResponse.class)
                .withName("BatchRetryJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/batch-retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRetryJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchRetryJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchRetryJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<CancelJobRequest, CancelJobResponse> cancelJob = genForcancelJob();

    private static HttpRequestDef<CancelJobRequest, CancelJobResponse> genForcancelJob() {
        // basic
        HttpRequestDef.Builder<CancelJobRequest, CancelJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelJobRequest.class, CancelJobResponse.class)
                .withName("CancelJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/terminate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<TerminateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TerminateJobReq.class),
            f -> f.withMarshaller(CancelJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genFordeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genFordeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withName("DeleteJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> executeJob = genForexecuteJob();

    private static HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> genForexecuteJob() {
        // basic
        HttpRequestDef.Builder<ExecuteJobRequest, ExecuteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteJobRequest.class, ExecuteJobResponse.class)
                .withName("ExecuteJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<JobDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobDto.class),
            f -> f.withMarshaller(ExecuteJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobRequest, ListJobResponse> listJob = genForlistJob();

    private static HttpRequestDef<ListJobRequest, ListJobResponse> genForlistJob() {
        // basic
        HttpRequestDef.Builder<ListJobRequest, ListJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobRequest.class, ListJobResponse.class)
                .withName("ListJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobRequest::getLabels, (req, v) -> {
                req.setLabels(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getToolName, (req, v) -> {
                req.setToolName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getFinishStartTime, (req, v) -> {
                req.setFinishStartTime(v);
            }));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getFinishEndTime, (req, v) -> {
                req.setFinishEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryJobRequest, RetryJobResponse> retryJob = genForretryJob();

    private static HttpRequestDef<RetryJobRequest, RetryJobResponse> genForretryJob() {
        // basic
        HttpRequestDef.Builder<RetryJobRequest, RetryJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryJobRequest.class, RetryJobResponse.class)
                .withName("RetryJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Addition-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getXAdditionInfo, (req, v) -> {
                req.setXAdditionInfo(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobEventRequest, ShowJobEventResponse> showJobEvent = genForshowJobEvent();

    private static HttpRequestDef<ShowJobEventRequest, ShowJobEventResponse> genForshowJobEvent() {
        // basic
        HttpRequestDef.Builder<ShowJobEventRequest, ShowJobEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobEventRequest.class, ShowJobEventResponse.class)
                .withName("ShowJobEvent")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobEventRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobEventRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobEventRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobLogRequest, ShowJobLogResponse> showJobLog = genForshowJobLog();

    private static HttpRequestDef<ShowJobLogRequest, ShowJobLogResponse> genForshowJobLog() {
        // basic
        HttpRequestDef.Builder<ShowJobLogRequest, ShowJobLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobLogRequest.class, ShowJobLogResponse.class)
                .withName("ShowJobLog")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskEventsRequest, ShowTaskEventsResponse> showTaskEvents =
        genForshowTaskEvents();

    private static HttpRequestDef<ShowTaskEventsRequest, ShowTaskEventsResponse> genForshowTaskEvents() {
        // basic
        HttpRequestDef.Builder<ShowTaskEventsRequest, ShowTaskEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskEventsRequest.class, ShowTaskEventsResponse.class)
                .withName("ShowTaskEvents")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> showTaskInstanceEvents =
        genForshowTaskInstanceEvents();

    private static HttpRequestDef<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> genForshowTaskInstanceEvents() {
        // basic
        HttpRequestDef.Builder<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskInstanceEventsRequest.class, ShowTaskInstanceEventsResponse.class)
            .withName("ShowTaskInstanceEvents")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/instances/{instance_name}/events")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> showTaskInstanceMetricData =
        genForshowTaskInstanceMetricData();

    private static HttpRequestDef<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> genForshowTaskInstanceMetricData() {
        // basic
        HttpRequestDef.Builder<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTaskInstanceMetricDataRequest.class,
                    ShowTaskInstanceMetricDataResponse.class)
                .withName("ShowTaskInstanceMetricData")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/instances/{instance_name}/metric-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));
        builder.<Long>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getFromTime, (req, v) -> {
                req.setFromTime(v);
            }));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getToTime, (req, v) -> {
                req.setToTime(v);
            }));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            }));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getMetricName, (req, v) -> {
                req.setMetricName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> showTaskInstancePod =
        genForshowTaskInstancePod();

    private static HttpRequestDef<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> genForshowTaskInstancePod() {
        // basic
        HttpRequestDef.Builder<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskInstancePodRequest.class, ShowTaskInstancePodResponse.class)
            .withName("ShowTaskInstancePod")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/instances/{instance_name}/pod")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstancesRequest, ShowTaskInstancesResponse> showTaskInstances =
        genForshowTaskInstances();

    private static HttpRequestDef<ShowTaskInstancesRequest, ShowTaskInstancesResponse> genForshowTaskInstances() {
        // basic
        HttpRequestDef.Builder<ShowTaskInstancesRequest, ShowTaskInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskInstancesRequest.class, ShowTaskInstancesResponse.class)
            .withName("ShowTaskInstances")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForupdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForupdateJob() {
        // basic
        HttpRequestDef.Builder<UpdateJobRequest, UpdateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobRequest.class, UpdateJobResponse.class)
                .withName("UpdateJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateJobReq.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLabelRequest, BatchDeleteLabelResponse> batchDeleteLabel =
        genForbatchDeleteLabel();

    private static HttpRequestDef<BatchDeleteLabelRequest, BatchDeleteLabelResponse> genForbatchDeleteLabel() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLabelRequest, BatchDeleteLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteLabelRequest.class, BatchDeleteLabelResponse.class)
                .withName("BatchDeleteLabel")
                .withUri("/v1/{project_id}/system/labels/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteLabelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteLabelReq.class),
            f -> f.withMarshaller(BatchDeleteLabelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelRequest, CreateLabelResponse> createLabel = genForcreateLabel();

    private static HttpRequestDef<CreateLabelRequest, CreateLabelResponse> genForcreateLabel() {
        // basic
        HttpRequestDef.Builder<CreateLabelRequest, CreateLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLabelRequest.class, CreateLabelResponse.class)
                .withName("CreateLabel")
                .withUri("/v1/{project_id}/system/labels")
                .withContentType("application/json");

        // requests
        builder.<CreateLabelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLabelReq.class),
            f -> f.withMarshaller(CreateLabelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelRequest, DeleteLabelResponse> deleteLabel = genFordeleteLabel();

    private static HttpRequestDef<DeleteLabelRequest, DeleteLabelResponse> genFordeleteLabel() {
        // basic
        HttpRequestDef.Builder<DeleteLabelRequest, DeleteLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLabelRequest.class, DeleteLabelResponse.class)
                .withName("DeleteLabel")
                .withUri("/v1/{project_id}/system/labels/{label_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("label_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelRequest::getLabelId, (req, v) -> {
                req.setLabelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelRequest, ListLabelResponse> listLabel = genForlistLabel();

    private static HttpRequestDef<ListLabelRequest, ListLabelResponse> genForlistLabel() {
        // basic
        HttpRequestDef.Builder<ListLabelRequest, ListLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLabelRequest.class, ListLabelResponse.class)
                .withName("ListLabel")
                .withUri("/v1/{project_id}/system/labels")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelPageRequest, CreateLabelPageResponse> createLabelPage =
        genForcreateLabelPage();

    private static HttpRequestDef<CreateLabelPageRequest, CreateLabelPageResponse> genForcreateLabelPage() {
        // basic
        HttpRequestDef.Builder<CreateLabelPageRequest, CreateLabelPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLabelPageRequest.class, CreateLabelPageResponse.class)
                .withName("CreateLabelPage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/label-pages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLabelPageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateLabelPageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLabelPageReq.class),
            f -> f.withMarshaller(CreateLabelPageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelPageRequest, DeleteLabelPageResponse> deleteLabelPage =
        genFordeleteLabelPage();

    private static HttpRequestDef<DeleteLabelPageRequest, DeleteLabelPageResponse> genFordeleteLabelPage() {
        // basic
        HttpRequestDef.Builder<DeleteLabelPageRequest, DeleteLabelPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLabelPageRequest.class, DeleteLabelPageResponse.class)
                .withName("DeleteLabelPage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/label-pages/{label_page_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelPageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("label_page_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelPageRequest::getLabelPageId, (req, v) -> {
                req.setLabelPageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelPageRequest, ListLabelPageResponse> listLabelPage =
        genForlistLabelPage();

    private static HttpRequestDef<ListLabelPageRequest, ListLabelPageResponse> genForlistLabelPage() {
        // basic
        HttpRequestDef.Builder<ListLabelPageRequest, ListLabelPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLabelPageRequest.class, ListLabelPageResponse.class)
                .withName("ListLabelPage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/label-pages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelPageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> batchDeleteNotice =
        genForbatchDeleteNotice();

    private static HttpRequestDef<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> genForbatchDeleteNotice() {
        // basic
        HttpRequestDef.Builder<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteNoticeRequest.class, BatchDeleteNoticeResponse.class)
                .withName("BatchDeleteNotice")
                .withUri("/v1/{project_id}/notices/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteNoticeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteNoticeReq.class),
            f -> f.withMarshaller(BatchDeleteNoticeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> batchUpdateNotice =
        genForbatchUpdateNotice();

    private static HttpRequestDef<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> genForbatchUpdateNotice() {
        // basic
        HttpRequestDef.Builder<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateNoticeRequest.class, BatchUpdateNoticeResponse.class)
                .withName("BatchUpdateNotice")
                .withUri("/v1/{project_id}/notices/batch-update")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateNoticeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateNoticeReq.class),
            f -> f.withMarshaller(BatchUpdateNoticeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckEmailConnectionRequest, CheckEmailConnectionResponse> checkEmailConnection =
        genForcheckEmailConnection();

    private static HttpRequestDef<CheckEmailConnectionRequest, CheckEmailConnectionResponse> genForcheckEmailConnection() {
        // basic
        HttpRequestDef.Builder<CheckEmailConnectionRequest, CheckEmailConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckEmailConnectionRequest.class, CheckEmailConnectionResponse.class)
            .withName("CheckEmailConnection")
            .withUri("/v1/{project_id}/messages/email-connection-test")
            .withContentType("application/json");

        // requests
        builder.<TryEmailConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TryEmailConnectionReq.class),
            f -> f.withMarshaller(CheckEmailConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> deleteMessageEmailConfig =
        genFordeleteMessageEmailConfig();

    private static HttpRequestDef<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> genFordeleteMessageEmailConfig() {
        // basic
        HttpRequestDef.Builder<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteMessageEmailConfigRequest.class,
                    DeleteMessageEmailConfigResponse.class)
                .withName("DeleteMessageEmailConfig")
                .withUri("/v1/{project_id}/messages/email-server-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageRequest, ListMessageResponse> listMessage = genForlistMessage();

    private static HttpRequestDef<ListMessageRequest, ListMessageResponse> genForlistMessage() {
        // basic
        HttpRequestDef.Builder<ListMessageRequest, ListMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessageRequest.class, ListMessageResponse.class)
                .withName("ListMessage")
                .withUri("/v1/{project_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getEihealthProjectName, (req, v) -> {
                req.setEihealthProjectName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("message_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getMessageType, (req, v) -> {
                req.setMessageType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("operator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getOperator, (req, v) -> {
                req.setOperator(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageStatisticsRequest, ListMessageStatisticsResponse> listMessageStatistics =
        genForlistMessageStatistics();

    private static HttpRequestDef<ListMessageStatisticsRequest, ListMessageStatisticsResponse> genForlistMessageStatistics() {
        // basic
        HttpRequestDef.Builder<ListMessageStatisticsRequest, ListMessageStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMessageStatisticsRequest.class, ListMessageStatisticsResponse.class)
            .withName("ListMessageStatistics")
            .withUri("/v1/{project_id}/messages/statistics")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeRequest, ListNoticeResponse> listNotice = genForlistNotice();

    private static HttpRequestDef<ListNoticeRequest, ListNoticeResponse> genForlistNotice() {
        // basic
        HttpRequestDef.Builder<ListNoticeRequest, ListNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticeRequest.class, ListNoticeResponse.class)
                .withName("ListNotice")
                .withUri("/v1/{project_id}/notices")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_read",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListNoticeRequest::getIsRead, (req, v) -> {
                req.setIsRead(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticeRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticeRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> showMessageClearRule =
        genForshowMessageClearRule();

    private static HttpRequestDef<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> genForshowMessageClearRule() {
        // basic
        HttpRequestDef.Builder<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMessageClearRuleRequest.class, ShowMessageClearRuleResponse.class)
            .withName("ShowMessageClearRule")
            .withUri("/v1/{project_id}/messages/rules")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> showMessageEmailConfig =
        genForshowMessageEmailConfig();

    private static HttpRequestDef<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> genForshowMessageEmailConfig() {
        // basic
        HttpRequestDef.Builder<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMessageEmailConfigRequest.class, ShowMessageEmailConfigResponse.class)
            .withName("ShowMessageEmailConfig")
            .withUri("/v1/{project_id}/messages/email-server-config")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> showMessageReceiveConfig =
        genForshowMessageReceiveConfig();

    private static HttpRequestDef<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> genForshowMessageReceiveConfig() {
        // basic
        HttpRequestDef.Builder<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowMessageReceiveConfigRequest.class, ShowMessageReceiveConfigResponse.class)
                .withName("ShowMessageReceiveConfig")
                .withUri("/v1/{project_id}/messages/email-client-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageClearRuleRequestBodyRequest, UpdateMessageClearRuleRequestBodyResponse> updateMessageClearRuleRequestBody =
        genForupdateMessageClearRuleRequestBody();

    private static HttpRequestDef<UpdateMessageClearRuleRequestBodyRequest, UpdateMessageClearRuleRequestBodyResponse> genForupdateMessageClearRuleRequestBody() {
        // basic
        HttpRequestDef.Builder<UpdateMessageClearRuleRequestBodyRequest, UpdateMessageClearRuleRequestBodyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMessageClearRuleRequestBodyRequest.class,
                    UpdateMessageClearRuleRequestBodyResponse.class)
                .withName("UpdateMessageClearRuleRequestBody")
                .withUri("/v1/{project_id}/messages/rules")
                .withContentType("application/json");

        // requests
        builder.<SetMessageClearRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetMessageClearRuleReq.class),
            f -> f.withMarshaller(UpdateMessageClearRuleRequestBodyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> updateMessageEmailConfig =
        genForupdateMessageEmailConfig();

    private static HttpRequestDef<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> genForupdateMessageEmailConfig() {
        // basic
        HttpRequestDef.Builder<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateMessageEmailConfigRequest.class, UpdateMessageEmailConfigResponse.class)
                .withName("UpdateMessageEmailConfig")
                .withUri("/v1/{project_id}/messages/email-server-config")
                .withContentType("application/json");

        // requests
        builder.<SetMessageEmailConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetMessageEmailConfigReq.class),
            f -> f.withMarshaller(UpdateMessageEmailConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> updateMessageReceiveConfig =
        genForupdateMessageReceiveConfig();

    private static HttpRequestDef<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> genForupdateMessageReceiveConfig() {
        // basic
        HttpRequestDef.Builder<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMessageReceiveConfigRequest.class,
                    UpdateMessageReceiveConfigResponse.class)
                .withName("UpdateMessageReceiveConfig")
                .withUri("/v1/{project_id}/messages/email-client-config")
                .withContentType("application/json");

        // requests
        builder.<SetMessageReceiveConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetMessageReceiveConfigReq.class),
            f -> f.withMarshaller(UpdateMessageReceiveConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CleanNextflowCacheRequest, CleanNextflowCacheResponse> cleanNextflowCache =
        genForcleanNextflowCache();

    private static HttpRequestDef<CleanNextflowCacheRequest, CleanNextflowCacheResponse> genForcleanNextflowCache() {
        // basic
        HttpRequestDef.Builder<CleanNextflowCacheRequest, CleanNextflowCacheResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CleanNextflowCacheRequest.class, CleanNextflowCacheResponse.class)
                .withName("CleanNextflowCache")
                .withUri("/v1/{project_id}/nextflow/clean-cache")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallNextflowRequest, InstallNextflowResponse> installNextflow =
        genForinstallNextflow();

    private static HttpRequestDef<InstallNextflowRequest, InstallNextflowResponse> genForinstallNextflow() {
        // basic
        HttpRequestDef.Builder<InstallNextflowRequest, InstallNextflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InstallNextflowRequest.class, InstallNextflowResponse.class)
                .withName("InstallNextflow")
                .withUri("/v1/{project_id}/nextflow/engines")
                .withContentType("multipart/form-data");

        // requests
        builder.<InstallNextflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstallNextflowRequestBody.class),
            f -> f.withMarshaller(InstallNextflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNextflowVersionRequest, ListNextflowVersionResponse> listNextflowVersion =
        genForlistNextflowVersion();

    private static HttpRequestDef<ListNextflowVersionRequest, ListNextflowVersionResponse> genForlistNextflowVersion() {
        // basic
        HttpRequestDef.Builder<ListNextflowVersionRequest, ListNextflowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNextflowVersionRequest.class, ListNextflowVersionResponse.class)
                .withName("ListNextflowVersion")
                .withUri("/v1/{project_id}/nextflow/versions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowRequest, ShowNextflowResponse> showNextflow = genForshowNextflow();

    private static HttpRequestDef<ShowNextflowRequest, ShowNextflowResponse> genForshowNextflow() {
        // basic
        HttpRequestDef.Builder<ShowNextflowRequest, ShowNextflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNextflowRequest.class, ShowNextflowResponse.class)
                .withName("ShowNextflow")
                .withUri("/v1/{project_id}/nextflow/engines/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UninstallNextflowRequest, UninstallNextflowResponse> uninstallNextflow =
        genForuninstallNextflow();

    private static HttpRequestDef<UninstallNextflowRequest, UninstallNextflowResponse> genForuninstallNextflow() {
        // basic
        HttpRequestDef.Builder<UninstallNextflowRequest, UninstallNextflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, UninstallNextflowRequest.class, UninstallNextflowResponse.class)
                .withName("UninstallNextflow")
                .withUri("/v1/{project_id}/nextflow/engines/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UninstallNextflowRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNextflowJobRequest, CreateNextflowJobResponse> createNextflowJob =
        genForcreateNextflowJob();

    private static HttpRequestDef<CreateNextflowJobRequest, CreateNextflowJobResponse> genForcreateNextflowJob() {
        // basic
        HttpRequestDef.Builder<CreateNextflowJobRequest, CreateNextflowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNextflowJobRequest.class, CreateNextflowJobResponse.class)
                .withName("CreateNextflowJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNextflowJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateNextflowJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNextflowJobRequestBody.class),
            f -> f.withMarshaller(CreateNextflowJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNextflowJobRequest, DeleteNextflowJobResponse> deleteNextflowJob =
        genFordeleteNextflowJob();

    private static HttpRequestDef<DeleteNextflowJobRequest, DeleteNextflowJobResponse> genFordeleteNextflowJob() {
        // basic
        HttpRequestDef.Builder<DeleteNextflowJobRequest, DeleteNextflowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNextflowJobRequest.class, DeleteNextflowJobResponse.class)
                .withName("DeleteNextflowJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNextflowJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNextflowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNextflowJobRequest, ListNextflowJobResponse> listNextflowJob =
        genForlistNextflowJob();

    private static HttpRequestDef<ListNextflowJobRequest, ListNextflowJobResponse> genForlistNextflowJob() {
        // basic
        HttpRequestDef.Builder<ListNextflowJobRequest, ListNextflowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNextflowJobRequest.class, ListNextflowJobResponse.class)
                .withName("ListNextflowJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getLabels, (req, v) -> {
                req.setLabels(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("workflow_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getWorkflowName, (req, v) -> {
                req.setWorkflowName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<Long>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getCreateStartTime, (req, v) -> {
                req.setCreateStartTime(v);
            }));
        builder.<Long>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getCreateEndTime, (req, v) -> {
                req.setCreateEndTime(v);
            }));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getFinishStartTime, (req, v) -> {
                req.setFinishStartTime(v);
            }));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getFinishEndTime, (req, v) -> {
                req.setFinishEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryNextflowJobRequest, RetryNextflowJobResponse> retryNextflowJob =
        genForretryNextflowJob();

    private static HttpRequestDef<RetryNextflowJobRequest, RetryNextflowJobResponse> genForretryNextflowJob() {
        // basic
        HttpRequestDef.Builder<RetryNextflowJobRequest, RetryNextflowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryNextflowJobRequest.class, RetryNextflowJobResponse.class)
                .withName("RetryNextflowJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}/retry")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryNextflowJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryNextflowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<RetryNextflowJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RetryNextflowJobRequestBody.class),
            f -> f.withMarshaller(RetryNextflowJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowJobRequest, ShowNextflowJobResponse> showNextflowJob =
        genForshowNextflowJob();

    private static HttpRequestDef<ShowNextflowJobRequest, ShowNextflowJobResponse> genForshowNextflowJob() {
        // basic
        HttpRequestDef.Builder<ShowNextflowJobRequest, ShowNextflowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNextflowJobRequest.class, ShowNextflowJobResponse.class)
                .withName("ShowNextflowJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowJobLogRequest, ShowNextflowJobLogResponse> showNextflowJobLog =
        genForshowNextflowJobLog();

    private static HttpRequestDef<ShowNextflowJobLogRequest, ShowNextflowJobLogResponse> genForshowNextflowJobLog() {
        // basic
        HttpRequestDef.Builder<ShowNextflowJobLogRequest, ShowNextflowJobLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNextflowJobLogRequest.class, ShowNextflowJobLogResponse.class)
                .withName("ShowNextflowJobLog")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobLogRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobLogRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowJobReportsRequest, ShowNextflowJobReportsResponse> showNextflowJobReports =
        genForshowNextflowJobReports();

    private static HttpRequestDef<ShowNextflowJobReportsRequest, ShowNextflowJobReportsResponse> genForshowNextflowJobReports() {
        // basic
        HttpRequestDef.Builder<ShowNextflowJobReportsRequest, ShowNextflowJobReportsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNextflowJobReportsRequest.class, ShowNextflowJobReportsResponse.class)
            .withName("ShowNextflowJobReports")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}/reports")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobReportsRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobReportsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopNextflowJobRequest, StopNextflowJobResponse> stopNextflowJob =
        genForstopNextflowJob();

    private static HttpRequestDef<StopNextflowJobRequest, StopNextflowJobResponse> genForstopNextflowJob() {
        // basic
        HttpRequestDef.Builder<StopNextflowJobRequest, StopNextflowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopNextflowJobRequest.class, StopNextflowJobResponse.class)
                .withName("StopNextflowJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopNextflowJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopNextflowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNextflowTaskRequest, ListNextflowTaskResponse> listNextflowTask =
        genForlistNextflowTask();

    private static HttpRequestDef<ListNextflowTaskRequest, ListNextflowTaskResponse> genForlistNextflowTask() {
        // basic
        HttpRequestDef.Builder<ListNextflowTaskRequest, ListNextflowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNextflowTaskRequest.class, ListNextflowTaskResponse.class)
                .withName("ListNextflowTask")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowTaskRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowTaskRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowTaskRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowTaskDetailRequest, ShowNextflowTaskDetailResponse> showNextflowTaskDetail =
        genForshowNextflowTaskDetail();

    private static HttpRequestDef<ShowNextflowTaskDetailRequest, ShowNextflowTaskDetailResponse> genForshowNextflowTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowNextflowTaskDetailRequest, ShowNextflowTaskDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNextflowTaskDetailRequest.class, ShowNextflowTaskDetailResponse.class)
            .withName("ShowNextflowTaskDetail")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskDetailRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowTaskLogRequest, ShowNextflowTaskLogResponse> showNextflowTaskLog =
        genForshowNextflowTaskLog();

    private static HttpRequestDef<ShowNextflowTaskLogRequest, ShowNextflowTaskLogResponse> genForshowNextflowTaskLog() {
        // basic
        HttpRequestDef.Builder<ShowNextflowTaskLogRequest, ShowNextflowTaskLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNextflowTaskLogRequest.class, ShowNextflowTaskLogResponse.class)
            .withName("ShowNextflowTaskLog")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/jobs/{job_id}/tasks/{task_id}/logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskLogRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskLogRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskLogRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNextflowWorkflowRequest, CreateNextflowWorkflowResponse> createNextflowWorkflow =
        genForcreateNextflowWorkflow();

    private static HttpRequestDef<CreateNextflowWorkflowRequest, CreateNextflowWorkflowResponse> genForcreateNextflowWorkflow() {
        // basic
        HttpRequestDef.Builder<CreateNextflowWorkflowRequest, CreateNextflowWorkflowResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateNextflowWorkflowRequest.class, CreateNextflowWorkflowResponse.class)
            .withName("CreateNextflowWorkflow")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/workflows")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNextflowWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateNextflowWorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNextflowWorkflowRequestBody.class),
            f -> f.withMarshaller(CreateNextflowWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNextflowWorkflowRequest, DeleteNextflowWorkflowResponse> deleteNextflowWorkflow =
        genFordeleteNextflowWorkflow();

    private static HttpRequestDef<DeleteNextflowWorkflowRequest, DeleteNextflowWorkflowResponse> genFordeleteNextflowWorkflow() {
        // basic
        HttpRequestDef.Builder<DeleteNextflowWorkflowRequest, DeleteNextflowWorkflowResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNextflowWorkflowRequest.class, DeleteNextflowWorkflowResponse.class)
            .withName("DeleteNextflowWorkflow")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/workflows/{workflow_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNextflowWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNextflowWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNextflowWorkflowRequest, ListNextflowWorkflowResponse> listNextflowWorkflow =
        genForlistNextflowWorkflow();

    private static HttpRequestDef<ListNextflowWorkflowRequest, ListNextflowWorkflowResponse> genForlistNextflowWorkflow() {
        // basic
        HttpRequestDef.Builder<ListNextflowWorkflowRequest, ListNextflowWorkflowResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNextflowWorkflowRequest.class, ListNextflowWorkflowResponse.class)
            .withName("ListNextflowWorkflow")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/workflows")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowWorkflowRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowWorkflowRequest, ShowNextflowWorkflowResponse> showNextflowWorkflow =
        genForshowNextflowWorkflow();

    private static HttpRequestDef<ShowNextflowWorkflowRequest, ShowNextflowWorkflowResponse> genForshowNextflowWorkflow() {
        // basic
        HttpRequestDef.Builder<ShowNextflowWorkflowRequest, ShowNextflowWorkflowResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNextflowWorkflowRequest.class, ShowNextflowWorkflowResponse.class)
            .withName("ShowNextflowWorkflow")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/workflows/{workflow_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNextflowWorkflowRequest, UpdateNextflowWorkflowResponse> updateNextflowWorkflow =
        genForupdateNextflowWorkflow();

    private static HttpRequestDef<UpdateNextflowWorkflowRequest, UpdateNextflowWorkflowResponse> genForupdateNextflowWorkflow() {
        // basic
        HttpRequestDef.Builder<UpdateNextflowWorkflowRequest, UpdateNextflowWorkflowResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNextflowWorkflowRequest.class, UpdateNextflowWorkflowResponse.class)
            .withName("UpdateNextflowWorkflow")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/nextflow/workflows/{workflow_id}")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNextflowWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNextflowWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<UpdateNextflowWorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateNextflowWorkflowRequestBody.class),
            f -> f.withMarshaller(UpdateNextflowWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> batchUpdateNodeLabel =
        genForbatchUpdateNodeLabel();

    private static HttpRequestDef<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> genForbatchUpdateNodeLabel() {
        // basic
        HttpRequestDef.Builder<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateNodeLabelRequest.class, BatchUpdateNodeLabelResponse.class)
            .withName("BatchUpdateNodeLabel")
            .withUri("/v1/{project_id}/system/nodes/{server_id}/labels")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateNodeLabelRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<BatchUpdateNodeLabelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateNodeLabelReq.class),
            f -> f.withMarshaller(BatchUpdateNodeLabelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> listClusterAllNodeLabel =
        genForlistClusterAllNodeLabel();

    private static HttpRequestDef<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> genForlistClusterAllNodeLabel() {
        // basic
        HttpRequestDef.Builder<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterAllNodeLabelRequest.class, ListClusterAllNodeLabelResponse.class)
            .withName("ListClusterAllNodeLabel")
            .withUri("/v1/{project_id}/system/cluster/labels")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeLabelRequest, ListNodeLabelResponse> listNodeLabel =
        genForlistNodeLabel();

    private static HttpRequestDef<ListNodeLabelRequest, ListNodeLabelResponse> genForlistNodeLabel() {
        // basic
        HttpRequestDef.Builder<ListNodeLabelRequest, ListNodeLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodeLabelRequest.class, ListNodeLabelResponse.class)
                .withName("ListNodeLabel")
                .withUri("/v1/{project_id}/system/nodes/{server_id}/labels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodeLabelRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPresetLabelRequest, ListPresetLabelResponse> listPresetLabel =
        genForlistPresetLabel();

    private static HttpRequestDef<ListPresetLabelRequest, ListPresetLabelResponse> genForlistPresetLabel() {
        // basic
        HttpRequestDef.Builder<ListPresetLabelRequest, ListPresetLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPresetLabelRequest.class, ListPresetLabelResponse.class)
                .withName("ListPresetLabel")
                .withUri("/v1/{project_id}/system/preset-labels")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotebookRequest, CreateNotebookResponse> createNotebook =
        genForcreateNotebook();

    private static HttpRequestDef<CreateNotebookRequest, CreateNotebookResponse> genForcreateNotebook() {
        // basic
        HttpRequestDef.Builder<CreateNotebookRequest, CreateNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNotebookRequest.class, CreateNotebookResponse.class)
                .withName("CreateNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateNotebookReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotebookReq.class),
            f -> f.withMarshaller(CreateNotebookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotebookRequest, DeleteNotebookResponse> deleteNotebook =
        genFordeleteNotebook();

    private static HttpRequestDef<DeleteNotebookRequest, DeleteNotebookResponse> genFordeleteNotebook() {
        // basic
        HttpRequestDef.Builder<DeleteNotebookRequest, DeleteNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNotebookRequest.class, DeleteNotebookResponse.class)
                .withName("DeleteNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotebookRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotebookRequest, ListNotebookResponse> listNotebook = genForlistNotebook();

    private static HttpRequestDef<ListNotebookRequest, ListNotebookResponse> genForlistNotebook() {
        // basic
        HttpRequestDef.Builder<ListNotebookRequest, ListNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotebookRequest.class, ListNotebookResponse.class)
                .withName("ListNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotebookRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotebookRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotebookToolRequest, ListNotebookToolResponse> listNotebookTool =
        genForlistNotebookTool();

    private static HttpRequestDef<ListNotebookToolRequest, ListNotebookToolResponse> genForlistNotebookTool() {
        // basic
        HttpRequestDef.Builder<ListNotebookToolRequest, ListNotebookToolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotebookToolRequest.class, ListNotebookToolResponse.class)
                .withName("ListNotebookTool")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/tools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookToolRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotebookRequest, ShowNotebookResponse> showNotebook = genForshowNotebook();

    private static HttpRequestDef<ShowNotebookRequest, ShowNotebookResponse> genForshowNotebook() {
        // basic
        HttpRequestDef.Builder<ShowNotebookRequest, ShowNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNotebookRequest.class, ShowNotebookResponse.class)
                .withName("ShowNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotebookTokenRequest, ShowNotebookTokenResponse> showNotebookToken =
        genForshowNotebookToken();

    private static HttpRequestDef<ShowNotebookTokenRequest, ShowNotebookTokenResponse> genForshowNotebookToken() {
        // basic
        HttpRequestDef.Builder<ShowNotebookTokenRequest, ShowNotebookTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNotebookTokenRequest.class, ShowNotebookTokenResponse.class)
                .withName("ShowNotebookToken")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}/token")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookTokenRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookTokenRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopOrStartNotebookRequest, StopOrStartNotebookResponse> stopOrStartNotebook =
        genForstopOrStartNotebook();

    private static HttpRequestDef<StopOrStartNotebookRequest, StopOrStartNotebookResponse> genForstopOrStartNotebook() {
        // basic
        HttpRequestDef.Builder<StopOrStartNotebookRequest, StopOrStartNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopOrStartNotebookRequest.class, StopOrStartNotebookResponse.class)
                .withName("StopOrStartNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopOrStartNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopOrStartNotebookRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));
        builder.<NotebookActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NotebookActionReq.class),
            f -> f.withMarshaller(StopOrStartNotebookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotebookRequest, UpdateNotebookResponse> updateNotebook =
        genForupdateNotebook();

    private static HttpRequestDef<UpdateNotebookRequest, UpdateNotebookResponse> genForupdateNotebook() {
        // basic
        HttpRequestDef.Builder<UpdateNotebookRequest, UpdateNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNotebookRequest.class, UpdateNotebookResponse.class)
                .withName("UpdateNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));
        builder.<UpdateNotebookReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotebookReq.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDataRequest, DownloadDataResponse> downloadData = genFordownloadData();

    private static HttpRequestDef<DownloadDataRequest, DownloadDataResponse> genFordownloadData() {
        // basic
        HttpRequestDef.Builder<DownloadDataRequest, DownloadDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadDataRequest.class, DownloadDataResponse.class)
                .withName("DownloadData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<DownloadDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadDataReq.class),
            f -> f.withMarshaller(DownloadDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketRequest, ListObsBucketResponse> listObsBucket =
        genForlistObsBucket();

    private static HttpRequestDef<ListObsBucketRequest, ListObsBucketResponse> genForlistObsBucket() {
        // basic
        HttpRequestDef.Builder<ListObsBucketRequest, ListObsBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObsBucketRequest.class, ListObsBucketResponse.class)
                .withName("ListObsBucket")
                .withUri("/v1/{project_id}/customer-buckets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketObjectRequest, ListObsBucketObjectResponse> listObsBucketObject =
        genForlistObsBucketObject();

    private static HttpRequestDef<ListObsBucketObjectRequest, ListObsBucketObjectResponse> genForlistObsBucketObject() {
        // basic
        HttpRequestDef.Builder<ListObsBucketObjectRequest, ListObsBucketObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObsBucketObjectRequest.class, ListObsBucketObjectResponse.class)
                .withName("ListObsBucketObject")
                .withUri("/v1/{project_id}/customer-buckets/{bucket_name}/objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOptmJobRequest, CreateOptmJobResponse> createOptmJob =
        genForcreateOptmJob();

    private static HttpRequestDef<CreateOptmJobRequest, CreateOptmJobResponse> genForcreateOptmJob() {
        // basic
        HttpRequestDef.Builder<CreateOptmJobRequest, CreateOptmJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOptmJobRequest.class, CreateOptmJobResponse.class)
                .withName("CreateOptmJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/optimization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOptmJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateOptmJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOptmJobReq.class),
            f -> f.withMarshaller(CreateOptmJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOptmJobRequest, ShowOptmJobResponse> showOptmJob = genForshowOptmJob();

    private static HttpRequestDef<ShowOptmJobRequest, ShowOptmJobResponse> genForshowOptmJob() {
        // basic
        HttpRequestDef.Builder<ShowOptmJobRequest, ShowOptmJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOptmJobRequest.class, ShowOptmJobResponse.class)
                .withName("ShowOptmJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/optimization/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOptmJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOptmJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> showOverview = genForshowOverview();

    private static HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> genForshowOverview() {
        // basic
        HttpRequestDef.Builder<ShowOverviewRequest, ShowOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOverviewRequest.class, ShowOverviewResponse.class)
                .withName("ShowOverview")
                .withUri("/v1/{project_id}/system/overview")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> createPerformanceResource =
        genForcreatePerformanceResource();

    private static HttpRequestDef<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> genForcreatePerformanceResource() {
        // basic
        HttpRequestDef.Builder<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePerformanceResourceRequest.class,
                    CreatePerformanceResourceResponse.class)
                .withName("CreatePerformanceResource")
                .withUri("/v1/{project_id}/system/performance-resources")
                .withContentType("application/json");

        // requests
        builder.<CreatePerformanceResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePerformanceResourceReq.class),
            f -> f.withMarshaller(CreatePerformanceResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> deletePerformanceResource =
        genFordeletePerformanceResource();

    private static HttpRequestDef<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> genFordeletePerformanceResource() {
        // basic
        HttpRequestDef.Builder<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeletePerformanceResourceRequest.class,
                    DeletePerformanceResourceResponse.class)
                .withName("DeletePerformanceResource")
                .withUri("/v1/{project_id}/system/performance-resources/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePerformanceResourceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> listPerformanceResources =
        genForlistPerformanceResources();

    private static HttpRequestDef<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> genForlistPerformanceResources() {
        // basic
        HttpRequestDef.Builder<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListPerformanceResourcesRequest.class, ListPerformanceResourcesResponse.class)
                .withName("ListPerformanceResources")
                .withUri("/v1/{project_id}/system/performance-resources")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> updatePerformanceResource =
        genForupdatePerformanceResource();

    private static HttpRequestDef<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> genForupdatePerformanceResource() {
        // basic
        HttpRequestDef.Builder<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePerformanceResourceRequest.class,
                    UpdatePerformanceResourceResponse.class)
                .withName("UpdatePerformanceResource")
                .withUri("/v1/{project_id}/system/performance-resources/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePerformanceResourceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdatePerformanceResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePerformanceResourceReq.class),
            f -> f.withMarshaller(UpdatePerformanceResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMemberRequest, BatchDeleteMemberResponse> batchDeleteMember =
        genForbatchDeleteMember();

    private static HttpRequestDef<BatchDeleteMemberRequest, BatchDeleteMemberResponse> genForbatchDeleteMember() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMemberRequest, BatchDeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteMemberRequest.class, BatchDeleteMemberResponse.class)
                .withName("BatchDeleteMember")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/members/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteMemberRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchDeleteMemberReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteMemberReq.class),
            f -> f.withMarshaller(BatchDeleteMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<BatchDeleteMemberRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteMemberResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BatchDeleteMemberRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRequest, CreateProjectResponse> createProject =
        genForcreateProject();

    private static HttpRequestDef<CreateProjectRequest, CreateProjectResponse> genForcreateProject() {
        // basic
        HttpRequestDef.Builder<CreateProjectRequest, CreateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectRequest.class, CreateProjectResponse.class)
                .withName("CreateProject")
                .withUri("/v1/{project_id}/eihealth-projects")
                .withContentType("application/json");

        // requests
        builder.<CreateProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectReq.class),
            f -> f.withMarshaller(CreateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genFordeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genFordeleteMember() {
        // basic
        HttpRequestDef.Builder<DeleteMemberRequest, DeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberRequest.class, DeleteMemberResponse.class)
                .withName("DeleteMember")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/members/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> deleteProject =
        genFordeleteProject();

    private static HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> genFordeleteProject() {
        // basic
        HttpRequestDef.Builder<DeleteProjectRequest, DeleteProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProjectRequest.class, DeleteProjectResponse.class)
                .withName("DeleteProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProjectRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Boolean>withRequestField("X-Delete-Now",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteProjectRequest::getXDeleteNow, (req, v) -> {
                req.setXDeleteNow(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectRequest, ListProjectResponse> listProject = genForlistProject();

    private static HttpRequestDef<ListProjectRequest, ListProjectResponse> genForlistProject() {
        // basic
        HttpRequestDef.Builder<ListProjectRequest, ListProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectRequest.class, ListProjectResponse.class)
                .withName("ListProject")
                .withUri("/v1/{project_id}/eihealth-projects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectRequest, ShowProjectResponse> showProject = genForshowProject();

    private static HttpRequestDef<ShowProjectRequest, ShowProjectResponse> genForshowProject() {
        // basic
        HttpRequestDef.Builder<ShowProjectRequest, ShowProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectRequest.class, ShowProjectResponse.class)
                .withName("ShowProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("X-Bucket-Name",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectRequest::getXBucketName, (req, v) -> {
                req.setXBucketName(v);
            }));
        builder.<String>withRequestField("X-Namespace-Name",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectRequest::getXNamespaceName, (req, v) -> {
                req.setXNamespaceName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TransferProjectRequest, TransferProjectResponse> transferProject =
        genFortransferProject();

    private static HttpRequestDef<TransferProjectRequest, TransferProjectResponse> genFortransferProject() {
        // basic
        HttpRequestDef.Builder<TransferProjectRequest, TransferProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TransferProjectRequest.class, TransferProjectResponse.class)
                .withName("TransferProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/transfer")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TransferProjectRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<TransferProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferProjectReq.class),
            f -> f.withMarshaller(TransferProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForupdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForupdateMember() {
        // basic
        HttpRequestDef.Builder<UpdateMemberRequest, UpdateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberRequest.class, UpdateMemberResponse.class)
                .withName("UpdateMember")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/members/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateMemberReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMemberReq.class),
            f -> f.withMarshaller(UpdateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> updateProject =
        genForupdateProject();

    private static HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> genForupdateProject() {
        // basic
        HttpRequestDef.Builder<UpdateProjectRequest, UpdateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectRequest.class, UpdateProjectResponse.class)
                .withName("UpdateProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<UpdateProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectReq.class),
            f -> f.withMarshaller(UpdateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDataTraceRequest, DownloadDataTraceResponse> downloadDataTrace =
        genFordownloadDataTrace();

    private static HttpRequestDef<DownloadDataTraceRequest, DownloadDataTraceResponse> genFordownloadDataTrace() {
        // basic
        HttpRequestDef.Builder<DownloadDataTraceRequest, DownloadDataTraceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadDataTraceRequest.class, DownloadDataTraceResponse.class)
                .withName("DownloadDataTrace")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-traces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataTraceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataTraceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTraceRequest, ShowProjectTraceResponse> showProjectTrace =
        genForshowProjectTrace();

    private static HttpRequestDef<ShowProjectTraceRequest, ShowProjectTraceResponse> genForshowProjectTrace() {
        // basic
        HttpRequestDef.Builder<ShowProjectTraceRequest, ShowProjectTraceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectTraceRequest.class, ShowProjectTraceResponse.class)
                .withName("ShowProjectTrace")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/project-traces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> showProjectTraceData =
        genForshowProjectTraceData();

    private static HttpRequestDef<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> genForshowProjectTraceData() {
        // basic
        HttpRequestDef.Builder<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectTraceDataRequest.class, ShowProjectTraceDataResponse.class)
            .withName("ShowProjectTraceData")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/project-traces/{path}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceDataRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTrackerRequest, ShowProjectTrackerResponse> showProjectTracker =
        genForshowProjectTracker();

    private static HttpRequestDef<ShowProjectTrackerRequest, ShowProjectTrackerResponse> genForshowProjectTracker() {
        // basic
        HttpRequestDef.Builder<ShowProjectTrackerRequest, ShowProjectTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectTrackerRequest.class, ShowProjectTrackerResponse.class)
                .withName("ShowProjectTracker")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/project-tracker")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTrackerRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> updateProjectTracker =
        genForupdateProjectTracker();

    private static HttpRequestDef<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> genForupdateProjectTracker() {
        // basic
        HttpRequestDef.Builder<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProjectTrackerRequest.class, UpdateProjectTrackerResponse.class)
            .withName("UpdateProjectTracker")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/project-tracker")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectTrackerRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<UpdateTrackerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrackerReq.class),
            f -> f.withMarshaller(UpdateProjectTrackerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> batchDownloadResourceStatData =
        genForbatchDownloadResourceStatData();

    private static HttpRequestDef<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> genForbatchDownloadResourceStatData() {
        // basic
        HttpRequestDef.Builder<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDownloadResourceStatDataRequest.class,
                    BatchDownloadResourceStatDataResponse.class)
                .withName("BatchDownloadResourceStatData")
                .withUri("/v1/{project_id}/metric-data/batch-stat-metric-data")
                .withContentType("application/json");

        // requests
        builder.<BatchQueryStatReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryStatReq.class),
            f -> f.withMarshaller(BatchDownloadResourceStatDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> showResourceMetricData =
        genForshowResourceMetricData();

    private static HttpRequestDef<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> genForshowResourceMetricData() {
        // basic
        HttpRequestDef.Builder<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourceMetricDataRequest.class, ShowResourceMetricDataResponse.class)
            .withName("ShowResourceMetricData")
            .withUri("/v1/{project_id}/metric-data")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getFromTime, (req, v) -> {
                req.setFromTime(v);
            }));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getToTime, (req, v) -> {
                req.setToTime(v);
            }));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            }));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getMetricName, (req, v) -> {
                req.setMetricName(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStarRequest, DeleteStarResponse> deleteStar = genFordeleteStar();

    private static HttpRequestDef<DeleteStarRequest, DeleteStarResponse> genFordeleteStar() {
        // basic
        HttpRequestDef.Builder<DeleteStarRequest, DeleteStarResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStarRequest.class, DeleteStarResponse.class)
                .withName("DeleteStar")
                .withUri("/v1/{project_id}/assets/{asset_id}/stars")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStarRequest, ListStarResponse> listStar = genForlistStar();

    private static HttpRequestDef<ListStarRequest, ListStarResponse> genForlistStar() {
        // basic
        HttpRequestDef.Builder<ListStarRequest, ListStarResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStarRequest.class, ListStarResponse.class)
                .withName("ListStar")
                .withUri("/v1/{project_id}/assets/stars")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStarRequest, UpdateStarResponse> updateStar = genForupdateStar();

    private static HttpRequestDef<UpdateStarRequest, UpdateStarResponse> genForupdateStar() {
        // basic
        HttpRequestDef.Builder<UpdateStarRequest, UpdateStarResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStarRequest.class, UpdateStarResponse.class)
                .withName("UpdateStar")
                .withUri("/v1/{project_id}/assets/{asset_id}/stars")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStarRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> listGlobalWorkflowStatistic =
        genForlistGlobalWorkflowStatistic();

    private static HttpRequestDef<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> genForlistGlobalWorkflowStatistic() {
        // basic
        HttpRequestDef.Builder<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGlobalWorkflowStatisticRequest.class,
                    ListGlobalWorkflowStatisticResponse.class)
                .withName("ListGlobalWorkflowStatistic")
                .withUri("/v1/{project_id}/eihealth-projects/workflow-statistics")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> listPerformanceResourceStat =
        genForlistPerformanceResourceStat();

    private static HttpRequestDef<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> genForlistPerformanceResourceStat() {
        // basic
        HttpRequestDef.Builder<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPerformanceResourceStatRequest.class,
                    ListPerformanceResourceStatResponse.class)
                .withName("ListPerformanceResourceStat")
                .withUri("/v1/{project_id}/eihealth-projects/performance-resources-statistics")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPerformanceResourceStatRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPerformanceResourceStatRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> listWorkflowStatistic =
        genForlistWorkflowStatistic();

    private static HttpRequestDef<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> genForlistWorkflowStatistic() {
        // basic
        HttpRequestDef.Builder<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkflowStatisticRequest.class, ListWorkflowStatisticResponse.class)
            .withName("ListWorkflowStatistic")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowStatisticRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageResourcesRequest, ListStorageResourcesResponse> listStorageResources =
        genForlistStorageResources();

    private static HttpRequestDef<ListStorageResourcesRequest, ListStorageResourcesResponse> genForlistStorageResources() {
        // basic
        HttpRequestDef.Builder<ListStorageResourcesRequest, ListStorageResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListStorageResourcesRequest.class, ListStorageResourcesResponse.class)
            .withName("ListStorageResources")
            .withUri("/v1/{project_id}/system/storage-resources")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStudyRequest, CreateStudyResponse> createStudy = genForcreateStudy();

    private static HttpRequestDef<CreateStudyRequest, CreateStudyResponse> genForcreateStudy() {
        // basic
        HttpRequestDef.Builder<CreateStudyRequest, CreateStudyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStudyRequest.class, CreateStudyResponse.class)
                .withName("CreateStudy")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStudyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateStudyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStudyReq.class),
            f -> f.withMarshaller(CreateStudyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStudyJobRequest, CreateStudyJobResponse> createStudyJob =
        genForcreateStudyJob();

    private static HttpRequestDef<CreateStudyJobRequest, CreateStudyJobResponse> genForcreateStudyJob() {
        // basic
        HttpRequestDef.Builder<CreateStudyJobRequest, CreateStudyJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStudyJobRequest.class, CreateStudyJobResponse.class)
                .withName("CreateStudyJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStudyJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStudyJobRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));
        builder.<CreateStudyJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStudyJobReq.class),
            f -> f.withMarshaller(CreateStudyJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStudyRequest, DeleteStudyResponse> deleteStudy = genFordeleteStudy();

    private static HttpRequestDef<DeleteStudyRequest, DeleteStudyResponse> genFordeleteStudy() {
        // basic
        HttpRequestDef.Builder<DeleteStudyRequest, DeleteStudyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStudyRequest.class, DeleteStudyResponse.class)
                .withName("DeleteStudy")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStudyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStudyRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStudyRequest, ListStudyResponse> listStudy = genForlistStudy();

    private static HttpRequestDef<ListStudyRequest, ListStudyResponse> genForlistStudy() {
        // basic
        HttpRequestDef.Builder<ListStudyRequest, ListStudyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStudyRequest.class, ListStudyResponse.class)
                .withName("ListStudy")
                .withUri("/v1/{project_id}/studies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStudyJobRequest, ListStudyJobResponse> listStudyJob = genForlistStudyJob();

    private static HttpRequestDef<ListStudyJobRequest, ListStudyJobResponse> genForlistStudyJob() {
        // basic
        HttpRequestDef.Builder<ListStudyJobRequest, ListStudyJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStudyJobRequest.class, ListStudyJobResponse.class)
                .withName("ListStudyJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStudyJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStudyJobRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<Show3dStructureContentRequest, Show3dStructureContentResponse> show3dStructureContent =
        genForshow3dStructureContent();

    private static HttpRequestDef<Show3dStructureContentRequest, Show3dStructureContentResponse> genForshow3dStructureContent() {
        // basic
        HttpRequestDef.Builder<Show3dStructureContentRequest, Show3dStructureContentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, Show3dStructureContentRequest.class, Show3dStructureContentResponse.class)
            .withName("Show3dStructureContent")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}/jobs/{job_id}/3d-structure")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("ligand",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getLigand, (req, v) -> {
                req.setLigand(v);
            }));
        builder.<String>withRequestField("receptor",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getReceptor, (req, v) -> {
                req.setReceptor(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtremumInfoRequest, ShowExtremumInfoResponse> showExtremumInfo =
        genForshowExtremumInfo();

    private static HttpRequestDef<ShowExtremumInfoRequest, ShowExtremumInfoResponse> genForshowExtremumInfo() {
        // basic
        HttpRequestDef.Builder<ShowExtremumInfoRequest, ShowExtremumInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowExtremumInfoRequest.class, ShowExtremumInfoResponse.class)
            .withName("ShowExtremumInfo")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}/jobs/{job_id}/extremum")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtremumInfoRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtremumInfoRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtremumInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSynthesisJobRequest, CreateSynthesisJobResponse> createSynthesisJob =
        genForcreateSynthesisJob();

    private static HttpRequestDef<CreateSynthesisJobRequest, CreateSynthesisJobResponse> genForcreateSynthesisJob() {
        // basic
        HttpRequestDef.Builder<CreateSynthesisJobRequest, CreateSynthesisJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSynthesisJobRequest.class, CreateSynthesisJobResponse.class)
                .withName("CreateSynthesisJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/synthesis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSynthesisJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateSynthesisJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSynthesisJobReq.class),
            f -> f.withMarshaller(CreateSynthesisJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSynthesisJobRequest, ShowSynthesisJobResponse> showSynthesisJob =
        genForshowSynthesisJob();

    private static HttpRequestDef<ShowSynthesisJobRequest, ShowSynthesisJobResponse> genForshowSynthesisJob() {
        // basic
        HttpRequestDef.Builder<ShowSynthesisJobRequest, ShowSynthesisJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSynthesisJobRequest.class, ShowSynthesisJobResponse.class)
                .withName("ShowSynthesisJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/synthesis/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSynthesisJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSynthesisJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArchiveConfigsRequest, ListArchiveConfigsResponse> listArchiveConfigs =
        genForlistArchiveConfigs();

    private static HttpRequestDef<ListArchiveConfigsRequest, ListArchiveConfigsResponse> genForlistArchiveConfigs() {
        // basic
        HttpRequestDef.Builder<ListArchiveConfigsRequest, ListArchiveConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListArchiveConfigsRequest.class, ListArchiveConfigsResponse.class)
                .withName("ListArchiveConfigs")
                .withUri("/v1/{project_id}/system/archive-configs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvRequest, ShowEnvResponse> showEnv = genForshowEnv();

    private static HttpRequestDef<ShowEnvRequest, ShowEnvResponse> genForshowEnv() {
        // basic
        HttpRequestDef.Builder<ShowEnvRequest, ShowEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnvRequest.class, ShowEnvResponse.class)
                .withName("ShowEnv")
                .withUri("/v1/{project_id}/system/configs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVendorRequest, ShowVendorResponse> showVendor = genForshowVendor();

    private static HttpRequestDef<ShowVendorRequest, ShowVendorResponse> genForshowVendor() {
        // basic
        HttpRequestDef.Builder<ShowVendorRequest, ShowVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVendorRequest.class, ShowVendorResponse.class)
                .withName("ShowVendor")
                .withUri("/v1/{project_id}/system/vendor-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> updateArchiveConfig =
        genForupdateArchiveConfig();

    private static HttpRequestDef<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> genForupdateArchiveConfig() {
        // basic
        HttpRequestDef.Builder<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateArchiveConfigRequest.class, UpdateArchiveConfigResponse.class)
                .withName("UpdateArchiveConfig")
                .withUri("/v1/{project_id}/system/archive-configs/{region_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateArchiveConfigRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVendorRequest, UpdateVendorResponse> updateVendor = genForupdateVendor();

    private static HttpRequestDef<UpdateVendorRequest, UpdateVendorResponse> genForupdateVendor() {
        // basic
        HttpRequestDef.Builder<UpdateVendorRequest, UpdateVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVendorRequest.class, UpdateVendorResponse.class)
                .withName("UpdateVendor")
                .withUri("/v1/{project_id}/system/vendor-config")
                .withContentType("multipart/form-data");

        // requests
        builder.<UpdateVendorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVendorRequestBody.class),
            f -> f.withMarshaller(UpdateVendorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaRequest, ListQuotaResponse> listQuota = genForlistQuota();

    private static HttpRequestDef<ListQuotaRequest, ListQuotaResponse> genForlistQuota() {
        // basic
        HttpRequestDef.Builder<ListQuotaRequest, ListQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaRequest.class, ListQuotaResponse.class)
                .withName("ListQuota")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForcreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForcreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateReq.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportTemplateRequest, ImportTemplateResponse> importTemplate =
        genForimportTemplate();

    private static HttpRequestDef<ImportTemplateRequest, ImportTemplateResponse> genForimportTemplate() {
        // basic
        HttpRequestDef.Builder<ImportTemplateRequest, ImportTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportTemplateRequest.class, ImportTemplateResponse.class)
                .withName("ImportTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/batch-import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportTemplateReq.class),
            f -> f.withMarshaller(ImportTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ImportTemplateResultRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ImportTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ImportTemplateResultRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateRequest, ListTemplateResponse> listTemplate = genForlistTemplate();

    private static HttpRequestDef<ListTemplateRequest, ListTemplateResponse> genForlistTemplate() {
        // basic
        HttpRequestDef.Builder<ListTemplateRequest, ListTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateRequest.class, ListTemplateResponse.class)
                .withName("ListTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForshowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForshowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadTemplateRequest, UploadTemplateResponse> uploadTemplate =
        genForuploadTemplate();

    private static HttpRequestDef<UploadTemplateRequest, UploadTemplateResponse> genForuploadTemplate() {
        // basic
        HttpRequestDef.Builder<UploadTemplateRequest, UploadTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadTemplateRequest.class, UploadTemplateResponse.class)
                .withName("UploadTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<UploadTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadTemplateRequestBody.class),
            f -> f.withMarshaller(UploadTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePasswordRequest, ChangePasswordResponse> changePassword =
        genForchangePassword();

    private static HttpRequestDef<ChangePasswordRequest, ChangePasswordResponse> genForchangePassword() {
        // basic
        HttpRequestDef.Builder<ChangePasswordRequest, ChangePasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangePasswordRequest.class, ChangePasswordResponse.class)
                .withName("ChangePassword")
                .withUri("/v1/{project_id}/users/{user_id}/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePasswordRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<ChangePasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordReq.class),
            f -> f.withMarshaller(ChangePasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTokenVerificationRequest, CheckTokenVerificationResponse> checkTokenVerification =
        genForcheckTokenVerification();

    private static HttpRequestDef<CheckTokenVerificationRequest, CheckTokenVerificationResponse> genForcheckTokenVerification() {
        // basic
        HttpRequestDef.Builder<CheckTokenVerificationRequest, CheckTokenVerificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckTokenVerificationRequest.class, CheckTokenVerificationResponse.class)
            .withName("CheckTokenVerification")
            .withUri("/v1/{project_id}/users/token-verification")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCodeRequest, CreateCodeResponse> createCode = genForcreateCode();

    private static HttpRequestDef<CreateCodeRequest, CreateCodeResponse> genForcreateCode() {
        // basic
        HttpRequestDef.Builder<CreateCodeRequest, CreateCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCodeRequest.class, CreateCodeResponse.class)
                .withName("CreateCode")
                .withUri("/v1/{project_id}/users/{user_id}/verification-code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCodeRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<SendCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendCodeReq.class),
            f -> f.withMarshaller(CreateCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForcreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForcreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withName("CreateUser")
                .withUri("/v1/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<CreateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserReq.class),
            f -> f.withMarshaller(CreateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genFordeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genFordeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v1/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportUserRequest, ImportUserResponse> importUser = genForimportUser();

    private static HttpRequestDef<ImportUserRequest, ImportUserResponse> genForimportUser() {
        // basic
        HttpRequestDef.Builder<ImportUserRequest, ImportUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportUserRequest.class, ImportUserResponse.class)
                .withName("ImportUser")
                .withUri("/v1/{project_id}/users/import")
                .withContentType("application/json");

        // requests
        builder.<ImportUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportUserReq.class),
            f -> f.withMarshaller(ImportUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<UserIdRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ImportUserResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(UserIdRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMfaRequest, ListMfaResponse> listMfa = genForlistMfa();

    private static HttpRequestDef<ListMfaRequest, ListMfaResponse> genForlistMfa() {
        // basic
        HttpRequestDef.Builder<ListMfaRequest, ListMfaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMfaRequest.class, ListMfaResponse.class)
                .withName("ListMfa")
                .withUri("/v1/{project_id}/users/{user_id}/mfa/methods")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMfaRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserRequest, ListUserResponse> listUser = genForlistUser();

    private static HttpRequestDef<ListUserRequest, ListUserResponse> genForlistUser() {
        // basic
        HttpRequestDef.Builder<ListUserRequest, ListUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserRequest.class, ListUserResponse.class)
                .withName("ListUser")
                .withUri("/v1/{project_id}/users")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRequest, ShowUserResponse> showUser = genForshowUser();

    private static HttpRequestDef<ShowUserRequest, ShowUserResponse> genForshowUser() {
        // basic
        HttpRequestDef.Builder<ShowUserRequest, ShowUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserRequest.class, ShowUserResponse.class)
                .withName("ShowUser")
                .withUri("/v1/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserSettingRequest, ShowUserSettingResponse> showUserSetting =
        genForshowUserSetting();

    private static HttpRequestDef<ShowUserSettingRequest, ShowUserSettingResponse> genForshowUserSetting() {
        // basic
        HttpRequestDef.Builder<ShowUserSettingRequest, ShowUserSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserSettingRequest.class, ShowUserSettingResponse.class)
                .withName("ShowUserSetting")
                .withUri("/v1/{project_id}/users/{user_id}/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserSettingRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInitPasswordRequest, UpdateInitPasswordResponse> updateInitPassword =
        genForupdateInitPassword();

    private static HttpRequestDef<UpdateInitPasswordRequest, UpdateInitPasswordResponse> genForupdateInitPassword() {
        // basic
        HttpRequestDef.Builder<UpdateInitPasswordRequest, UpdateInitPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInitPasswordRequest.class, UpdateInitPasswordResponse.class)
                .withName("UpdateInitPassword")
                .withUri("/v1/{project_id}/users/{user_id}/init-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInitPasswordRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<ResetPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordReq.class),
            f -> f.withMarshaller(UpdateInitPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForupdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForupdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v1/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserReq.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserByDomainRequest, UpdateUserByDomainResponse> updateUserByDomain =
        genForupdateUserByDomain();

    private static HttpRequestDef<UpdateUserByDomainRequest, UpdateUserByDomainResponse> genForupdateUserByDomain() {
        // basic
        HttpRequestDef.Builder<UpdateUserByDomainRequest, UpdateUserByDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserByDomainRequest.class, UpdateUserByDomainResponse.class)
                .withName("UpdateUserByDomain")
                .withUri("/v1/{project_id}/users/{user_id}/domain-change-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserByDomainRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserByDomainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserByDomainReq.class),
            f -> f.withMarshaller(UpdateUserByDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRoleRequest, UpdateUserRoleResponse> updateUserRole =
        genForupdateUserRole();

    private static HttpRequestDef<UpdateUserRoleRequest, UpdateUserRoleResponse> genForupdateUserRole() {
        // basic
        HttpRequestDef.Builder<UpdateUserRoleRequest, UpdateUserRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRoleRequest.class, UpdateUserRoleResponse.class)
                .withName("UpdateUserRole")
                .withUri("/v1/{project_id}/users/{user_id}/role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRoleRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserRoleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserRoleReq.class),
            f -> f.withMarshaller(UpdateUserRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserSettingRequest, UpdateUserSettingResponse> updateUserSetting =
        genForupdateUserSetting();

    private static HttpRequestDef<UpdateUserSettingRequest, UpdateUserSettingResponse> genForupdateUserSetting() {
        // basic
        HttpRequestDef.Builder<UpdateUserSettingRequest, UpdateUserSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserSettingRequest.class, UpdateUserSettingResponse.class)
                .withName("UpdateUserSetting")
                .withUri("/v1/{project_id}/users/{user_id}/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserSettingRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserSettingReq.class),
            f -> f.withMarshaller(UpdateUserSettingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateCodeRequest, ValidateCodeResponse> validateCode = genForvalidateCode();

    private static HttpRequestDef<ValidateCodeRequest, ValidateCodeResponse> genForvalidateCode() {
        // basic
        HttpRequestDef.Builder<ValidateCodeRequest, ValidateCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateCodeRequest.class, ValidateCodeResponse.class)
                .withName("ValidateCode")
                .withUri("/v1/{project_id}/users/{user_id}/code-verify")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateCodeRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<CodeVerifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeVerifyReq.class),
            f -> f.withMarshaller(ValidateCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVendorRequest, ListVendorResponse> listVendor = genForlistVendor();

    private static HttpRequestDef<ListVendorRequest, ListVendorResponse> genForlistVendor() {
        // basic
        HttpRequestDef.Builder<ListVendorRequest, ListVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVendorRequest.class, ListVendorResponse.class)
                .withName("ListVendor")
                .withUri("/v1/{project_id}/vendors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflow =
        genForcreateWorkflow();

    private static HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> genForcreateWorkflow() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowRequest, CreateWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkflowRequest.class, CreateWorkflowResponse.class)
                .withName("CreateWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<WorkflowDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowDto.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflow =
        genFordeleteWorkflow();

    private static HttpRequestDef<DeleteWorkflowRequest, DeleteWorkflowResponse> genFordeleteWorkflow() {
        // basic
        HttpRequestDef.Builder<DeleteWorkflowRequest, DeleteWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkflowRequest.class, DeleteWorkflowResponse.class)
                .withName("DeleteWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportWorkflowRequest, ImportWorkflowResponse> importWorkflow =
        genForimportWorkflow();

    private static HttpRequestDef<ImportWorkflowRequest, ImportWorkflowResponse> genForimportWorkflow() {
        // basic
        HttpRequestDef.Builder<ImportWorkflowRequest, ImportWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportWorkflowRequest.class, ImportWorkflowResponse.class)
                .withName("ImportWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportWorkflowReq.class),
            f -> f.withMarshaller(ImportWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> listWorkflow = genForlistWorkflow();

    private static HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> genForlistWorkflow() {
        // basic
        HttpRequestDef.Builder<ListWorkflowRequest, ListWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowRequest.class, ListWorkflowResponse.class)
                .withName("ListWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishWorkflowRequest, PublishWorkflowResponse> publishWorkflow =
        genForpublishWorkflow();

    private static HttpRequestDef<PublishWorkflowRequest, PublishWorkflowResponse> genForpublishWorkflow() {
        // basic
        HttpRequestDef.Builder<PublishWorkflowRequest, PublishWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishWorkflowRequest.class, PublishWorkflowResponse.class)
                .withName("PublishWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/{workflow_id}/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<PublishWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishWorkflowReq.class),
            f -> f.withMarshaller(PublishWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflow = genForshowWorkflow();

    private static HttpRequestDef<ShowWorkflowRequest, ShowWorkflowResponse> genForshowWorkflow() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowRequest, ShowWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkflowRequest.class, ShowWorkflowResponse.class)
                .withName("ShowWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<Boolean>withRequestField("Show-Param-Detail",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getShowParamDetail, (req, v) -> {
                req.setShowParamDetail(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeWorkflowRequest, SubscribeWorkflowResponse> subscribeWorkflow =
        genForsubscribeWorkflow();

    private static HttpRequestDef<SubscribeWorkflowRequest, SubscribeWorkflowResponse> genForsubscribeWorkflow() {
        // basic
        HttpRequestDef.Builder<SubscribeWorkflowRequest, SubscribeWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeWorkflowRequest.class, SubscribeWorkflowResponse.class)
                .withName("SubscribeWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<SubscribeWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeWorkflowReq.class),
            f -> f.withMarshaller(SubscribeWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflow =
        genForupdateWorkflow();

    private static HttpRequestDef<UpdateWorkflowRequest, UpdateWorkflowResponse> genForupdateWorkflow() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowRequest, UpdateWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkflowRequest.class, UpdateWorkflowResponse.class)
                .withName("UpdateWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<WorkflowDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowDto.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIamGroupUsersRequest, ListIamGroupUsersResponse> listIamGroupUsers =
        genForlistIamGroupUsers();

    private static HttpRequestDef<ListIamGroupUsersRequest, ListIamGroupUsersResponse> genForlistIamGroupUsers() {
        // basic
        HttpRequestDef.Builder<ListIamGroupUsersRequest, ListIamGroupUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIamGroupUsersRequest.class, ListIamGroupUsersResponse.class)
                .withName("ListIamGroupUsers")
                .withUri("/v1/{project_id}/iam/groups/{group_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIamGroupUsersRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIamGroupsRequest, ListIamGroupsResponse> listIamGroups =
        genForlistIamGroups();

    private static HttpRequestDef<ListIamGroupsRequest, ListIamGroupsResponse> genForlistIamGroups() {
        // basic
        HttpRequestDef.Builder<ListIamGroupsRequest, ListIamGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIamGroupsRequest.class, ListIamGroupsResponse.class)
                .withName("ListIamGroups")
                .withUri("/v1/{project_id}/iam/groups")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIamUsersRequest, ListIamUsersResponse> listIamUsers = genForlistIamUsers();

    private static HttpRequestDef<ListIamUsersRequest, ListIamUsersResponse> genForlistIamUsers() {
        // basic
        HttpRequestDef.Builder<ListIamUsersRequest, ListIamUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIamUsersRequest.class, ListIamUsersResponse.class)
                .withName("ListIamUsers")
                .withUri("/v1/{project_id}/iam/users")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> createOptimizationTask =
        genForcreateOptimizationTask();

    private static HttpRequestDef<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> genForcreateOptimizationTask() {
        // basic
        HttpRequestDef.Builder<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateOptimizationTaskRequest.class, CreateOptimizationTaskResponse.class)
            .withName("CreateOptimizationTask")
            .withUri("/v1/{project_id}/task/optimization")
            .withContentType("application/json");

        // requests
        builder.<OptimizationTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OptimizationTaskData.class),
            f -> f.withMarshaller(CreateOptimizationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateOptimizationTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> showOptimizationTaskResult =
        genForshowOptimizationTaskResult();

    private static HttpRequestDef<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> genForshowOptimizationTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowOptimizationTaskResultRequest.class,
                    ShowOptimizationTaskResultResponse.class)
                .withName("ShowOptimizationTaskResult")
                .withUri("/v1/{project_id}/task/optimization/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOptimizationTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSearchTaskRequest, CreateSearchTaskResponse> createSearchTask =
        genForcreateSearchTask();

    private static HttpRequestDef<CreateSearchTaskRequest, CreateSearchTaskResponse> genForcreateSearchTask() {
        // basic
        HttpRequestDef.Builder<CreateSearchTaskRequest, CreateSearchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSearchTaskRequest.class, CreateSearchTaskResponse.class)
                .withName("CreateSearchTask")
                .withUri("/v1/{project_id}/task/search")
                .withContentType("application/json");

        // requests
        builder.<SearchTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchTaskData.class),
            f -> f.withMarshaller(CreateSearchTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSearchTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> showSearchTaskResult =
        genForshowSearchTaskResult();

    private static HttpRequestDef<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> genForshowSearchTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSearchTaskResultRequest.class, ShowSearchTaskResultResponse.class)
            .withName("ShowSearchTaskResult")
            .withUri("/v1/{project_id}/task/search/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSearchTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSynthesisTaskRequest, CreateSynthesisTaskResponse> createSynthesisTask =
        genForcreateSynthesisTask();

    private static HttpRequestDef<CreateSynthesisTaskRequest, CreateSynthesisTaskResponse> genForcreateSynthesisTask() {
        // basic
        HttpRequestDef.Builder<CreateSynthesisTaskRequest, CreateSynthesisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSynthesisTaskRequest.class, CreateSynthesisTaskResponse.class)
                .withName("CreateSynthesisTask")
                .withUri("/v1/{project_id}/task/synthesis")
                .withContentType("application/json");

        // requests
        builder.<SynthesisTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SynthesisTaskData.class),
            f -> f.withMarshaller(CreateSynthesisTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSynthesisTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowSynthesisTaskResultRequest, ShowSynthesisTaskResultResponse> showSynthesisTaskResult =
        genForshowSynthesisTaskResult();

    private static HttpRequestDef<ShowSynthesisTaskResultRequest, ShowSynthesisTaskResultResponse> genForshowSynthesisTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowSynthesisTaskResultRequest, ShowSynthesisTaskResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSynthesisTaskResultRequest.class, ShowSynthesisTaskResultResponse.class)
            .withName("ShowSynthesisTaskResult")
            .withUri("/v1/{project_id}/task/synthesis/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSynthesisTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

}
