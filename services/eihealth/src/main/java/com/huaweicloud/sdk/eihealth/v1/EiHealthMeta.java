package com.huaweicloud.sdk.eihealth.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eihealth.v1.model.AddDrugDatabaseFileReq;
import com.huaweicloud.sdk.eihealth.v1.model.AddDrugDatabaseFileRequest;
import com.huaweicloud.sdk.eihealth.v1.model.AddDrugDatabaseFileResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAutJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateBackupReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateBackupRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateBackupResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingResourceReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCustomPropsTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCustomPropsTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseReq2;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseResourceReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDockJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDockingJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDockingJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugDatabaseRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugDatabaseResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateModelReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolBatchDownloadTaskReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolBatchDownloadTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolBatchDownloadTaskResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketDetectionJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketDetectionJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketDetectionJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketMolDesignJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketMolDesignJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketMolDesignJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateProjectReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateScaleOutPolicyReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.DeleteCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteCssClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDatabaseResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDatabaseResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugDatabaseRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugDatabaseResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugLigandPreviewTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugLigandPreviewTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugLigandSimilarityGraphTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugLigandSimilarityGraphTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugModelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugModelResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.GenerateComplexCombineReq;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateComplexCombineRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateComplexCombineResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GeneratePocketFileRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GeneratePocketFileResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateSurfacePointsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateSurfacePointsResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListCssClusterResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugDatabaseRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugDatabaseResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugModelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugModelResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListNodesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNodesResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListPolicyEventsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPolicyEventsResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListScalingHistoryRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListScalingHistoryResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListTermTenantCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListTermTenantCssClusterResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ReceptorDrugFileReq;
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
import com.huaweicloud.sdk.eihealth.v1.model.RunPocketReq;
import com.huaweicloud.sdk.eihealth.v1.model.RunReceptorPreprocessReq;
import com.huaweicloud.sdk.eihealth.v1.model.RunSurfacePointsReq;
import com.huaweicloud.sdk.eihealth.v1.model.SearchTaskData;
import com.huaweicloud.sdk.eihealth.v1.model.SendCodeReq;
import com.huaweicloud.sdk.eihealth.v1.model.SetMessageClearRuleReq;
import com.huaweicloud.sdk.eihealth.v1.model.SetMessageEmailConfigReq;
import com.huaweicloud.sdk.eihealth.v1.model.SetMessageReceiveConfigReq;
import com.huaweicloud.sdk.eihealth.v1.model.Show3dStructureContentRequest;
import com.huaweicloud.sdk.eihealth.v1.model.Show3dStructureContentResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAdmetJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAdmetJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowMolBatchDownloadTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMolBatchDownloadTaskResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowPocketDetectionJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowPocketDetectionJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowPocketMolDesignJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowPocketMolDesignJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowSearchJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowSearchJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugDatabaseReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugDatabaseRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugDatabaseResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugModelReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugModelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugModelResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCssConnectionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCssConnectionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.WorkflowDto;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class EiHealthMeta {

    public static final HttpRequestDef<AddDrugDatabaseFileRequest, AddDrugDatabaseFileResponse> addDrugDatabaseFile =
        genForAddDrugDatabaseFile();

    private static HttpRequestDef<AddDrugDatabaseFileRequest, AddDrugDatabaseFileResponse> genForAddDrugDatabaseFile() {
        // basic
        HttpRequestDef.Builder<AddDrugDatabaseFileRequest, AddDrugDatabaseFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddDrugDatabaseFileRequest.class, AddDrugDatabaseFileResponse.class)
                .withName("AddDrugDatabaseFile")
                .withUri("/v1/{project_id}/drug/databases/{database_id}/data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDrugDatabaseFileRequest::getDatabaseId,
                AddDrugDatabaseFileRequest::setDatabaseId));
        builder.<AddDrugDatabaseFileReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDrugDatabaseFileReq.class),
            f -> f.withMarshaller(AddDrugDatabaseFileRequest::getBody, AddDrugDatabaseFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCancelJobRequest, BatchCancelJobResponse> batchCancelJob =
        genForBatchCancelJob();

    private static HttpRequestDef<BatchCancelJobRequest, BatchCancelJobResponse> genForBatchCancelJob() {
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
            f -> f.withMarshaller(BatchCancelJobRequest::getEihealthProjectId,
                BatchCancelJobRequest::setEihealthProjectId));
        builder.<Boolean>withRequestField("X-Force",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(BatchCancelJobRequest::getXForce, BatchCancelJobRequest::setXForce));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchCancelJobRequest::getBody, BatchCancelJobRequest::setBody));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchCancelJobResponse::getBody, BatchCancelJobResponse::setBody)
                .withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDataRequest, BatchDeleteDataResponse> batchDeleteData =
        genForBatchDeleteData();

    private static HttpRequestDef<BatchDeleteDataRequest, BatchDeleteDataResponse> genForBatchDeleteData() {
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
            f -> f.withMarshaller(BatchDeleteDataRequest::getEihealthProjectId,
                BatchDeleteDataRequest::setEihealthProjectId));
        builder.<BatchDeleteDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDataReq.class),
            f -> f.withMarshaller(BatchDeleteDataRequest::getBody, BatchDeleteDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteJobRequest, BatchDeleteJobResponse> batchDeleteJob =
        genForBatchDeleteJob();

    private static HttpRequestDef<BatchDeleteJobRequest, BatchDeleteJobResponse> genForBatchDeleteJob() {
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
            f -> f.withMarshaller(BatchDeleteJobRequest::getEihealthProjectId,
                BatchDeleteJobRequest::setEihealthProjectId));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchDeleteJobRequest::getBody, BatchDeleteJobRequest::setBody));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteJobResponse::getBody, BatchDeleteJobResponse::setBody)
                .withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLabelRequest, BatchDeleteLabelResponse> batchDeleteLabel =
        genForBatchDeleteLabel();

    private static HttpRequestDef<BatchDeleteLabelRequest, BatchDeleteLabelResponse> genForBatchDeleteLabel() {
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
            f -> f.withMarshaller(BatchDeleteLabelRequest::getBody, BatchDeleteLabelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMemberRequest, BatchDeleteMemberResponse> batchDeleteMember =
        genForBatchDeleteMember();

    private static HttpRequestDef<BatchDeleteMemberRequest, BatchDeleteMemberResponse> genForBatchDeleteMember() {
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
            f -> f.withMarshaller(BatchDeleteMemberRequest::getEihealthProjectId,
                BatchDeleteMemberRequest::setEihealthProjectId));
        builder.<BatchDeleteMemberReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteMemberReq.class),
            f -> f.withMarshaller(BatchDeleteMemberRequest::getBody, BatchDeleteMemberRequest::setBody));

        // response
        builder.<List<BatchDeleteMemberRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteMemberResponse::getBody, BatchDeleteMemberResponse::setBody)
                .withInnerContainerType(BatchDeleteMemberRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> batchDeleteNotice =
        genForBatchDeleteNotice();

    private static HttpRequestDef<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> genForBatchDeleteNotice() {
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
            f -> f.withMarshaller(BatchDeleteNoticeRequest::getBody, BatchDeleteNoticeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagRequest, BatchDeleteTagResponse> batchDeleteTag =
        genForBatchDeleteTag();

    private static HttpRequestDef<BatchDeleteTagRequest, BatchDeleteTagResponse> genForBatchDeleteTag() {
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
            f -> f.withMarshaller(BatchDeleteTagRequest::getEihealthProjectId,
                BatchDeleteTagRequest::setEihealthProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagRequest::getImageId, BatchDeleteTagRequest::setImageId));
        builder.<BatchDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagReq.class),
            f -> f.withMarshaller(BatchDeleteTagRequest::getBody, BatchDeleteTagRequest::setBody));

        // response
        builder.<List<DeleteTagRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteTagResponse::getBody, BatchDeleteTagResponse::setBody)
                .withInnerContainerType(DeleteTagRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> batchDownloadResourceStatData =
        genForBatchDownloadResourceStatData();

    private static HttpRequestDef<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> genForBatchDownloadResourceStatData() {
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
            f -> f.withMarshaller(BatchDownloadResourceStatDataRequest::getBody,
                BatchDownloadResourceStatDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchImportAppRequest, BatchImportAppResponse> batchImportApp =
        genForBatchImportApp();

    private static HttpRequestDef<BatchImportAppRequest, BatchImportAppResponse> genForBatchImportApp() {
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
            f -> f.withMarshaller(BatchImportAppRequest::getEihealthProjectId,
                BatchImportAppRequest::setEihealthProjectId));
        builder.<BatchImportAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchImportAppReq.class),
            f -> f.withMarshaller(BatchImportAppRequest::getBody, BatchImportAppRequest::setBody));

        // response
        builder.<List<ImportAppRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchImportAppResponse::getBody, BatchImportAppResponse::setBody)
                .withInnerContainerType(ImportAppRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchRetryJobRequest, BatchRetryJobResponse> batchRetryJob =
        genForBatchRetryJob();

    private static HttpRequestDef<BatchRetryJobRequest, BatchRetryJobResponse> genForBatchRetryJob() {
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
            f -> f.withMarshaller(BatchRetryJobRequest::getEihealthProjectId,
                BatchRetryJobRequest::setEihealthProjectId));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchRetryJobRequest::getBody, BatchRetryJobRequest::setBody));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchRetryJobResponse::getBody, BatchRetryJobResponse::setBody)
                .withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> batchUpdateNodeLabel =
        genForBatchUpdateNodeLabel();

    private static HttpRequestDef<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> genForBatchUpdateNodeLabel() {
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
            f -> f.withMarshaller(BatchUpdateNodeLabelRequest::getServerId, BatchUpdateNodeLabelRequest::setServerId));
        builder.<BatchUpdateNodeLabelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateNodeLabelReq.class),
            f -> f.withMarshaller(BatchUpdateNodeLabelRequest::getBody, BatchUpdateNodeLabelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> batchUpdateNotice =
        genForBatchUpdateNotice();

    private static HttpRequestDef<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> genForBatchUpdateNotice() {
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
            f -> f.withMarshaller(BatchUpdateNoticeRequest::getBody, BatchUpdateNoticeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelDataJobRequest, CancelDataJobResponse> cancelDataJob =
        genForCancelDataJob();

    private static HttpRequestDef<CancelDataJobRequest, CancelDataJobResponse> genForCancelDataJob() {
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
            f -> f.withMarshaller(CancelDataJobRequest::getDataJobId, CancelDataJobRequest::setDataJobId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDataJobRequest::getEihealthProjectId,
                CancelDataJobRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelDrugJobRequest, CancelDrugJobResponse> cancelDrugJob =
        genForCancelDrugJob();

    private static HttpRequestDef<CancelDrugJobRequest, CancelDrugJobResponse> genForCancelDrugJob() {
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
            f -> f.withMarshaller(CancelDrugJobRequest::getEihealthProjectId,
                CancelDrugJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDrugJobRequest::getJobId, CancelDrugJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelJobRequest, CancelJobResponse> cancelJob = genForCancelJob();

    private static HttpRequestDef<CancelJobRequest, CancelJobResponse> genForCancelJob() {
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
            f -> f.withMarshaller(CancelJobRequest::getEihealthProjectId, CancelJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelJobRequest::getJobId, CancelJobRequest::setJobId));
        builder.<TerminateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TerminateJobReq.class),
            f -> f.withMarshaller(CancelJobRequest::getBody, CancelJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePasswordRequest, ChangePasswordResponse> changePassword =
        genForChangePassword();

    private static HttpRequestDef<ChangePasswordRequest, ChangePasswordResponse> genForChangePassword() {
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
            f -> f.withMarshaller(ChangePasswordRequest::getUserId, ChangePasswordRequest::setUserId));
        builder.<ChangePasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordReq.class),
            f -> f.withMarshaller(ChangePasswordRequest::getBody, ChangePasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckEmailConnectionRequest, CheckEmailConnectionResponse> checkEmailConnection =
        genForCheckEmailConnection();

    private static HttpRequestDef<CheckEmailConnectionRequest, CheckEmailConnectionResponse> genForCheckEmailConnection() {
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
            f -> f.withMarshaller(CheckEmailConnectionRequest::getBody, CheckEmailConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTokenVerificationRequest, CheckTokenVerificationResponse> checkTokenVerification =
        genForCheckTokenVerification();

    private static HttpRequestDef<CheckTokenVerificationRequest, CheckTokenVerificationResponse> genForCheckTokenVerification() {
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

    public static final HttpRequestDef<CopyDataRequest, CopyDataResponse> copyData = genForCopyData();

    private static HttpRequestDef<CopyDataRequest, CopyDataResponse> genForCopyData() {
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
            f -> f.withMarshaller(CopyDataRequest::getEihealthProjectId, CopyDataRequest::setEihealthProjectId));
        builder.<CloneDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloneDataReq.class),
            f -> f.withMarshaller(CopyDataRequest::getBody, CopyDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAdmetJobRequest, CreateAdmetJobResponse> createAdmetJob =
        genForCreateAdmetJob();

    private static HttpRequestDef<CreateAdmetJobRequest, CreateAdmetJobResponse> genForCreateAdmetJob() {
        // basic
        HttpRequestDef.Builder<CreateAdmetJobRequest, CreateAdmetJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAdmetJobRequest.class, CreateAdmetJobResponse.class)
                .withName("CreateAdmetJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/admet")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAdmetJobRequest::getEihealthProjectId,
                CreateAdmetJobRequest::setEihealthProjectId));
        builder.<CreateAdmetJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAdmetJobReq.class),
            f -> f.withMarshaller(CreateAdmetJobRequest::getBody, CreateAdmetJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
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
            f -> f.withMarshaller(CreateAppRequest::getEihealthProjectId, CreateAppRequest::setEihealthProjectId));
        builder.<AppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppReq.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoJobRequest, CreateAutoJobResponse> createAutoJob =
        genForCreateAutoJob();

    private static HttpRequestDef<CreateAutoJobRequest, CreateAutoJobResponse> genForCreateAutoJob() {
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
            f -> f.withMarshaller(CreateAutoJobRequest::getEihealthProjectId,
                CreateAutoJobRequest::setEihealthProjectId));
        builder.<CreateAutJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAutJobReq.class),
            f -> f.withMarshaller(CreateAutoJobRequest::getBody, CreateAutoJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackupRequest, CreateBackupResponse> createBackup = genForCreateBackup();

    private static HttpRequestDef<CreateBackupRequest, CreateBackupResponse> genForCreateBackup() {
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
            f -> f.withMarshaller(CreateBackupRequest::getEihealthProjectId,
                CreateBackupRequest::setEihealthProjectId));
        builder.<CreateBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBackupReq.class),
            f -> f.withMarshaller(CreateBackupRequest::getBody, CreateBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterJobRequest, CreateClusterJobResponse> createClusterJob =
        genForCreateClusterJob();

    private static HttpRequestDef<CreateClusterJobRequest, CreateClusterJobResponse> genForCreateClusterJob() {
        // basic
        HttpRequestDef.Builder<CreateClusterJobRequest, CreateClusterJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterJobRequest.class, CreateClusterJobResponse.class)
                .withName("CreateClusterJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/{job_id}/cluster")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterJobRequest::getEihealthProjectId,
                CreateClusterJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterJobRequest::getJobId, CreateClusterJobRequest::setJobId));
        builder.<CreateClusterJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterJobReq.class),
            f -> f.withMarshaller(CreateClusterJobRequest::getBody, CreateClusterJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCodeRequest, CreateCodeResponse> createCode = genForCreateCode();

    private static HttpRequestDef<CreateCodeRequest, CreateCodeResponse> genForCreateCode() {
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
            f -> f.withMarshaller(CreateCodeRequest::getUserId, CreateCodeRequest::setUserId));
        builder.<SendCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendCodeReq.class),
            f -> f.withMarshaller(CreateCodeRequest::getBody, CreateCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResource =
        genForCreateComputingResource();

    private static HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> genForCreateComputingResource() {
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
            f -> f.withMarshaller(CreateComputingResourceRequest::getBody, CreateComputingResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataRequest, CreateDataResponse> createData = genForCreateData();

    private static HttpRequestDef<CreateDataRequest, CreateDataResponse> genForCreateData() {
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
            f -> f.withMarshaller(CreateDataRequest::getEihealthProjectId, CreateDataRequest::setEihealthProjectId));
        builder.<CreateDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataReq.class),
            f -> f.withMarshaller(CreateDataRequest::getBody, CreateDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseDataRequest, CreateDatabaseDataResponse> createDatabaseData =
        genForCreateDatabaseData();

    private static HttpRequestDef<CreateDatabaseDataRequest, CreateDatabaseDataResponse> genForCreateDatabaseData() {
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
            f -> f.withMarshaller(CreateDatabaseDataRequest::getEihealthProjectId,
                CreateDatabaseDataRequest::setEihealthProjectId));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseDataRequest::getDatabaseId, CreateDatabaseDataRequest::setDatabaseId));
        builder.<RowDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RowDataReq.class),
            f -> f.withMarshaller(CreateDatabaseDataRequest::getBody, CreateDatabaseDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> createDatabaseResource =
        genForCreateDatabaseResource();

    private static HttpRequestDef<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> genForCreateDatabaseResource() {
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
            f -> f.withMarshaller(CreateDatabaseResourceRequest::getBody, CreateDatabaseResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDockingJobRequest, CreateDockingJobResponse> createDockingJob =
        genForCreateDockingJob();

    private static HttpRequestDef<CreateDockingJobRequest, CreateDockingJobResponse> genForCreateDockingJob() {
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
            f -> f.withMarshaller(CreateDockingJobRequest::getEihealthProjectId,
                CreateDockingJobRequest::setEihealthProjectId));
        builder.<CreateDockJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDockJobReq.class),
            f -> f.withMarshaller(CreateDockingJobRequest::getBody, CreateDockingJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugDatabaseRequest, CreateDrugDatabaseResponse> createDrugDatabase =
        genForCreateDrugDatabase();

    private static HttpRequestDef<CreateDrugDatabaseRequest, CreateDrugDatabaseResponse> genForCreateDrugDatabase() {
        // basic
        HttpRequestDef.Builder<CreateDrugDatabaseRequest, CreateDrugDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDrugDatabaseRequest.class, CreateDrugDatabaseResponse.class)
                .withName("CreateDrugDatabase")
                .withUri("/v1/{project_id}/drug/databases")
                .withContentType("application/json");

        // requests
        builder.<CreateDatabaseReq2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseReq2.class),
            f -> f.withMarshaller(CreateDrugDatabaseRequest::getBody, CreateDrugDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugModelRequest, CreateDrugModelResponse> createDrugModel =
        genForCreateDrugModel();

    private static HttpRequestDef<CreateDrugModelRequest, CreateDrugModelResponse> genForCreateDrugModel() {
        // basic
        HttpRequestDef.Builder<CreateDrugModelRequest, CreateDrugModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDrugModelRequest.class, CreateDrugModelResponse.class)
                .withName("CreateDrugModel")
                .withUri("/v1/{project_id}/drug-models")
                .withContentType("application/json");

        // requests
        builder.<CreateModelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateModelReq.class),
            f -> f.withMarshaller(CreateDrugModelRequest::getBody, CreateDrugModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFepJobRequest, CreateFepJobResponse> createFepJob = genForCreateFepJob();

    private static HttpRequestDef<CreateFepJobRequest, CreateFepJobResponse> genForCreateFepJob() {
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
            f -> f.withMarshaller(CreateFepJobRequest::getEihealthProjectId,
                CreateFepJobRequest::setEihealthProjectId));
        builder.<CreateFepJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFepJobReq.class),
            f -> f.withMarshaller(CreateFepJobRequest::getBody, CreateFepJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageRequest, CreateImageResponse> createImage = genForCreateImage();

    private static HttpRequestDef<CreateImageRequest, CreateImageResponse> genForCreateImage() {
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
            f -> f.withMarshaller(CreateImageRequest::getEihealthProjectId, CreateImageRequest::setEihealthProjectId));
        builder.<CreateImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageReq.class),
            f -> f.withMarshaller(CreateImageRequest::getBody, CreateImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
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
            f -> f.withMarshaller(CreateInstanceRequest::getEihealthProjectId,
                CreateInstanceRequest::setEihealthProjectId));
        builder.<CreateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseReq.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelRequest, CreateLabelResponse> createLabel = genForCreateLabel();

    private static HttpRequestDef<CreateLabelRequest, CreateLabelResponse> genForCreateLabel() {
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
            f -> f.withMarshaller(CreateLabelRequest::getBody, CreateLabelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelPageRequest, CreateLabelPageResponse> createLabelPage =
        genForCreateLabelPage();

    private static HttpRequestDef<CreateLabelPageRequest, CreateLabelPageResponse> genForCreateLabelPage() {
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
            f -> f.withMarshaller(CreateLabelPageRequest::getEihealthProjectId,
                CreateLabelPageRequest::setEihealthProjectId));
        builder.<CreateLabelPageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLabelPageReq.class),
            f -> f.withMarshaller(CreateLabelPageRequest::getBody, CreateLabelPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMolBatchDownloadTaskRequest, CreateMolBatchDownloadTaskResponse> createMolBatchDownloadTask =
        genForCreateMolBatchDownloadTask();

    private static HttpRequestDef<CreateMolBatchDownloadTaskRequest, CreateMolBatchDownloadTaskResponse> genForCreateMolBatchDownloadTask() {
        // basic
        HttpRequestDef.Builder<CreateMolBatchDownloadTaskRequest, CreateMolBatchDownloadTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMolBatchDownloadTaskRequest.class,
                    CreateMolBatchDownloadTaskResponse.class)
                .withName("CreateMolBatchDownloadTask")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/toolkit/batch-download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMolBatchDownloadTaskRequest::getEihealthProjectId,
                CreateMolBatchDownloadTaskRequest::setEihealthProjectId));
        builder.<CreateMolBatchDownloadTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMolBatchDownloadTaskReq.class),
            f -> f.withMarshaller(CreateMolBatchDownloadTaskRequest::getBody,
                CreateMolBatchDownloadTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOptmJobRequest, CreateOptmJobResponse> createOptmJob =
        genForCreateOptmJob();

    private static HttpRequestDef<CreateOptmJobRequest, CreateOptmJobResponse> genForCreateOptmJob() {
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
            f -> f.withMarshaller(CreateOptmJobRequest::getEihealthProjectId,
                CreateOptmJobRequest::setEihealthProjectId));
        builder.<CreateOptmJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOptmJobReq.class),
            f -> f.withMarshaller(CreateOptmJobRequest::getBody, CreateOptmJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> createPerformanceResource =
        genForCreatePerformanceResource();

    private static HttpRequestDef<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> genForCreatePerformanceResource() {
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
            f -> f.withMarshaller(CreatePerformanceResourceRequest::getBody,
                CreatePerformanceResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePocketDetectionJobRequest, CreatePocketDetectionJobResponse> createPocketDetectionJob =
        genForCreatePocketDetectionJob();

    private static HttpRequestDef<CreatePocketDetectionJobRequest, CreatePocketDetectionJobResponse> genForCreatePocketDetectionJob() {
        // basic
        HttpRequestDef.Builder<CreatePocketDetectionJobRequest, CreatePocketDetectionJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePocketDetectionJobRequest.class, CreatePocketDetectionJobResponse.class)
                .withName("CreatePocketDetectionJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/pocket-detection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePocketDetectionJobRequest::getEihealthProjectId,
                CreatePocketDetectionJobRequest::setEihealthProjectId));
        builder.<CreatePocketDetectionJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePocketDetectionJobReq.class),
            f -> f.withMarshaller(CreatePocketDetectionJobRequest::getBody, CreatePocketDetectionJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePocketMolDesignJobRequest, CreatePocketMolDesignJobResponse> createPocketMolDesignJob =
        genForCreatePocketMolDesignJob();

    private static HttpRequestDef<CreatePocketMolDesignJobRequest, CreatePocketMolDesignJobResponse> genForCreatePocketMolDesignJob() {
        // basic
        HttpRequestDef.Builder<CreatePocketMolDesignJobRequest, CreatePocketMolDesignJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePocketMolDesignJobRequest.class, CreatePocketMolDesignJobResponse.class)
                .withName("CreatePocketMolDesignJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/pocket-mol-design")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePocketMolDesignJobRequest::getEihealthProjectId,
                CreatePocketMolDesignJobRequest::setEihealthProjectId));
        builder.<CreatePocketMolDesignJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePocketMolDesignJobReq.class),
            f -> f.withMarshaller(CreatePocketMolDesignJobRequest::getBody, CreatePocketMolDesignJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRequest, CreateProjectResponse> createProject =
        genForCreateProject();

    private static HttpRequestDef<CreateProjectRequest, CreateProjectResponse> genForCreateProject() {
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
            f -> f.withMarshaller(CreateProjectRequest::getBody, CreateProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScaleOutPolicyRequest, CreateScaleOutPolicyResponse> createScaleOutPolicy =
        genForCreateScaleOutPolicy();

    private static HttpRequestDef<CreateScaleOutPolicyRequest, CreateScaleOutPolicyResponse> genForCreateScaleOutPolicy() {
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
            f -> f.withMarshaller(CreateScaleOutPolicyRequest::getBody, CreateScaleOutPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSearchJobRequest, CreateSearchJobResponse> createSearchJob =
        genForCreateSearchJob();

    private static HttpRequestDef<CreateSearchJobRequest, CreateSearchJobResponse> genForCreateSearchJob() {
        // basic
        HttpRequestDef.Builder<CreateSearchJobRequest, CreateSearchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSearchJobRequest.class, CreateSearchJobResponse.class)
                .withName("CreateSearchJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSearchJobRequest::getEihealthProjectId,
                CreateSearchJobRequest::setEihealthProjectId));
        builder.<CreateSearchJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSearchJobReq.class),
            f -> f.withMarshaller(CreateSearchJobRequest::getBody, CreateSearchJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStudyRequest, CreateStudyResponse> createStudy = genForCreateStudy();

    private static HttpRequestDef<CreateStudyRequest, CreateStudyResponse> genForCreateStudy() {
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
            f -> f.withMarshaller(CreateStudyRequest::getEihealthProjectId, CreateStudyRequest::setEihealthProjectId));
        builder.<CreateStudyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStudyReq.class),
            f -> f.withMarshaller(CreateStudyRequest::getBody, CreateStudyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStudyJobRequest, CreateStudyJobResponse> createStudyJob =
        genForCreateStudyJob();

    private static HttpRequestDef<CreateStudyJobRequest, CreateStudyJobResponse> genForCreateStudyJob() {
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
            f -> f.withMarshaller(CreateStudyJobRequest::getEihealthProjectId,
                CreateStudyJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStudyJobRequest::getStudyId, CreateStudyJobRequest::setStudyId));
        builder.<CreateStudyJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStudyJobReq.class),
            f -> f.withMarshaller(CreateStudyJobRequest::getBody, CreateStudyJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSynthesisJobRequest, CreateSynthesisJobResponse> createSynthesisJob =
        genForCreateSynthesisJob();

    private static HttpRequestDef<CreateSynthesisJobRequest, CreateSynthesisJobResponse> genForCreateSynthesisJob() {
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
            f -> f.withMarshaller(CreateSynthesisJobRequest::getEihealthProjectId,
                CreateSynthesisJobRequest::setEihealthProjectId));
        builder.<CreateSynthesisJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSynthesisJobReq.class),
            f -> f.withMarshaller(CreateSynthesisJobRequest::getBody, CreateSynthesisJobRequest::setBody));

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
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTemplateRequest::getEihealthProjectId,
                CreateTemplateRequest::setEihealthProjectId));
        builder.<CreateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateReq.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, CreateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForCreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForCreateUser() {
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
            f -> f.withMarshaller(CreateUserRequest::getBody, CreateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflow =
        genForCreateWorkflow();

    private static HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> genForCreateWorkflow() {
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
            f -> f.withMarshaller(CreateWorkflowRequest::getEihealthProjectId,
                CreateWorkflowRequest::setEihealthProjectId));
        builder.<WorkflowDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowDto.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, CreateWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
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
            f -> f.withMarshaller(DeleteAppRequest::getAppId, DeleteAppRequest::setAppId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getEihealthProjectId, DeleteAppRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetVersionRequest, DeleteAssetVersionResponse> deleteAssetVersion =
        genForDeleteAssetVersion();

    private static HttpRequestDef<DeleteAssetVersionRequest, DeleteAssetVersionResponse> genForDeleteAssetVersion() {
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
            f -> f.withMarshaller(DeleteAssetVersionRequest::getAssetId, DeleteAssetVersionRequest::setAssetId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetVersionRequest::getVersion, DeleteAssetVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoJobRequest, DeleteAutoJobResponse> deleteAutoJob =
        genForDeleteAutoJob();

    private static HttpRequestDef<DeleteAutoJobRequest, DeleteAutoJobResponse> genForDeleteAutoJob() {
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
            f -> f.withMarshaller(DeleteAutoJobRequest::getEihealthProjectId,
                DeleteAutoJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoJobRequest::getAutoJobId, DeleteAutoJobRequest::setAutoJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genForDeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genForDeleteBackup() {
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
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, DeleteBackupRequest::setBackupId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getEihealthProjectId,
                DeleteBackupRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResource =
        genForDeleteComputingResource();

    private static HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> genForDeleteComputingResource() {
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
            f -> f.withMarshaller(DeleteComputingResourceRequest::getId, DeleteComputingResourceRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataJobRequest, DeleteDataJobResponse> deleteDataJob =
        genForDeleteDataJob();

    private static HttpRequestDef<DeleteDataJobRequest, DeleteDataJobResponse> genForDeleteDataJob() {
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
            f -> f.withMarshaller(DeleteDataJobRequest::getDataJobId, DeleteDataJobRequest::setDataJobId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataJobRequest::getEihealthProjectId,
                DeleteDataJobRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> deleteDatabaseData =
        genForDeleteDatabaseData();

    private static HttpRequestDef<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> genForDeleteDatabaseData() {
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
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getEihealthProjectId,
                DeleteDatabaseDataRequest::setEihealthProjectId));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getDatabaseId, DeleteDatabaseDataRequest::setDatabaseId));
        builder.<Long>withRequestField("row_num",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getRowNum, DeleteDatabaseDataRequest::setRowNum));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> deleteDatabaseResource =
        genForDeleteDatabaseResource();

    private static HttpRequestDef<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> genForDeleteDatabaseResource() {
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
            f -> f.withMarshaller(DeleteDatabaseResourceRequest::getId, DeleteDatabaseResourceRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDrugDatabaseRequest, DeleteDrugDatabaseResponse> deleteDrugDatabase =
        genForDeleteDrugDatabase();

    private static HttpRequestDef<DeleteDrugDatabaseRequest, DeleteDrugDatabaseResponse> genForDeleteDrugDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteDrugDatabaseRequest, DeleteDrugDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDrugDatabaseRequest.class, DeleteDrugDatabaseResponse.class)
                .withName("DeleteDrugDatabase")
                .withUri("/v1/{project_id}/drug/databases/{database_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugDatabaseRequest::getDatabaseId, DeleteDrugDatabaseRequest::setDatabaseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDrugJobRequest, DeleteDrugJobResponse> deleteDrugJob =
        genForDeleteDrugJob();

    private static HttpRequestDef<DeleteDrugJobRequest, DeleteDrugJobResponse> genForDeleteDrugJob() {
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
            f -> f.withMarshaller(DeleteDrugJobRequest::getEihealthProjectId,
                DeleteDrugJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugJobRequest::getJobId, DeleteDrugJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDrugModelRequest, DeleteDrugModelResponse> deleteDrugModel =
        genForDeleteDrugModel();

    private static HttpRequestDef<DeleteDrugModelRequest, DeleteDrugModelResponse> genForDeleteDrugModel() {
        // basic
        HttpRequestDef.Builder<DeleteDrugModelRequest, DeleteDrugModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDrugModelRequest.class, DeleteDrugModelResponse.class)
                .withName("DeleteDrugModel")
                .withUri("/v1/{project_id}/drug-models/{model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugModelRequest::getModelId, DeleteDrugModelRequest::setModelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageRequest, DeleteImageResponse> deleteImage = genForDeleteImage();

    private static HttpRequestDef<DeleteImageRequest, DeleteImageResponse> genForDeleteImage() {
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
            f -> f.withMarshaller(DeleteImageRequest::getEihealthProjectId, DeleteImageRequest::setEihealthProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getImageId, DeleteImageRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
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
            f -> f.withMarshaller(DeleteInstanceRequest::getEihealthProjectId,
                DeleteInstanceRequest::setEihealthProjectId));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getDatabaseId, DeleteInstanceRequest::setDatabaseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genForDeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genForDeleteJob() {
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
            f -> f.withMarshaller(DeleteJobRequest::getEihealthProjectId, DeleteJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobId, DeleteJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelRequest, DeleteLabelResponse> deleteLabel = genForDeleteLabel();

    private static HttpRequestDef<DeleteLabelRequest, DeleteLabelResponse> genForDeleteLabel() {
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
            f -> f.withMarshaller(DeleteLabelRequest::getLabelId, DeleteLabelRequest::setLabelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelPageRequest, DeleteLabelPageResponse> deleteLabelPage =
        genForDeleteLabelPage();

    private static HttpRequestDef<DeleteLabelPageRequest, DeleteLabelPageResponse> genForDeleteLabelPage() {
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
            f -> f.withMarshaller(DeleteLabelPageRequest::getEihealthProjectId,
                DeleteLabelPageRequest::setEihealthProjectId));
        builder.<String>withRequestField("label_page_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelPageRequest::getLabelPageId, DeleteLabelPageRequest::setLabelPageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genForDeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genForDeleteMember() {
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
            f -> f.withMarshaller(DeleteMemberRequest::getEihealthProjectId,
                DeleteMemberRequest::setEihealthProjectId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getUserId, DeleteMemberRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> deleteMessageEmailConfig =
        genForDeleteMessageEmailConfig();

    private static HttpRequestDef<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> genForDeleteMessageEmailConfig() {
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

    public static final HttpRequestDef<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> deletePerformanceResource =
        genForDeletePerformanceResource();

    private static HttpRequestDef<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> genForDeletePerformanceResource() {
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
            f -> f.withMarshaller(DeletePerformanceResourceRequest::getId, DeletePerformanceResourceRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> deleteProject =
        genForDeleteProject();

    private static HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> genForDeleteProject() {
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
            f -> f.withMarshaller(DeleteProjectRequest::getEihealthProjectId,
                DeleteProjectRequest::setEihealthProjectId));
        builder.<Boolean>withRequestField("X-Delete-Now",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteProjectRequest::getXDeleteNow, DeleteProjectRequest::setXDeleteNow));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScaleOutPolicyRequest, DeleteScaleOutPolicyResponse> deleteScaleOutPolicy =
        genForDeleteScaleOutPolicy();

    private static HttpRequestDef<DeleteScaleOutPolicyRequest, DeleteScaleOutPolicyResponse> genForDeleteScaleOutPolicy() {
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
            f -> f.withMarshaller(DeleteScaleOutPolicyRequest::getId, DeleteScaleOutPolicyRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStarRequest, DeleteStarResponse> deleteStar = genForDeleteStar();

    private static HttpRequestDef<DeleteStarRequest, DeleteStarResponse> genForDeleteStar() {
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
            f -> f.withMarshaller(DeleteStarRequest::getAssetId, DeleteStarRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStudyRequest, DeleteStudyResponse> deleteStudy = genForDeleteStudy();

    private static HttpRequestDef<DeleteStudyRequest, DeleteStudyResponse> genForDeleteStudy() {
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
            f -> f.withMarshaller(DeleteStudyRequest::getEihealthProjectId, DeleteStudyRequest::setEihealthProjectId));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStudyRequest::getStudyId, DeleteStudyRequest::setStudyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
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
            f -> f.withMarshaller(DeleteTagRequest::getEihealthProjectId, DeleteTagRequest::setEihealthProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getImageId, DeleteTagRequest::setImageId));
        builder.<String>withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getTag, DeleteTagRequest::setTag));

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
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getEihealthProjectId,
                DeleteTemplateRequest::setEihealthProjectId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, DeleteTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genForDeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genForDeleteUser() {
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
            f -> f.withMarshaller(DeleteUserRequest::getUserId, DeleteUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflow =
        genForDeleteWorkflow();

    private static HttpRequestDef<DeleteWorkflowRequest, DeleteWorkflowResponse> genForDeleteWorkflow() {
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
            f -> f.withMarshaller(DeleteWorkflowRequest::getEihealthProjectId,
                DeleteWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowRequest::getWorkflowId, DeleteWorkflowRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDataJobLogRequest, DownloadDataJobLogResponse> downloadDataJobLog =
        genForDownloadDataJobLog();

    private static HttpRequestDef<DownloadDataJobLogRequest, DownloadDataJobLogResponse> genForDownloadDataJobLog() {
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
            f -> f.withMarshaller(DownloadDataJobLogRequest::getEihealthProjectId,
                DownloadDataJobLogRequest::setEihealthProjectId));
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataJobLogRequest::getDataJobId, DownloadDataJobLogRequest::setDataJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDataTraceRequest, DownloadDataTraceResponse> downloadDataTrace =
        genForDownloadDataTrace();

    private static HttpRequestDef<DownloadDataTraceRequest, DownloadDataTraceResponse> genForDownloadDataTrace() {
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
            f -> f.withMarshaller(DownloadDataTraceRequest::getEihealthProjectId,
                DownloadDataTraceRequest::setEihealthProjectId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataTraceRequest::getXLanguage, DownloadDataTraceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteAssetActionRequest, ExecuteAssetActionResponse> executeAssetAction =
        genForExecuteAssetAction();

    private static HttpRequestDef<ExecuteAssetActionRequest, ExecuteAssetActionResponse> genForExecuteAssetAction() {
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
            f -> f.withMarshaller(ExecuteAssetActionRequest::getAssetId, ExecuteAssetActionRequest::setAssetId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteAssetActionRequest::getVersion, ExecuteAssetActionRequest::setVersion));
        builder.<ManageAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ManageAssetReq.class),
            f -> f.withMarshaller(ExecuteAssetActionRequest::getBody, ExecuteAssetActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> executeJob = genForExecuteJob();

    private static HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> genForExecuteJob() {
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
            f -> f.withMarshaller(ExecuteJobRequest::getEihealthProjectId, ExecuteJobRequest::setEihealthProjectId));
        builder.<JobDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobDto.class),
            f -> f.withMarshaller(ExecuteJobRequest::getBody, ExecuteJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GenerateComplexCombineRequest, GenerateComplexCombineResponse> generateComplexCombine =
        genForGenerateComplexCombine();

    private static HttpRequestDef<GenerateComplexCombineRequest, GenerateComplexCombineResponse> genForGenerateComplexCombine() {
        // basic
        HttpRequestDef.Builder<GenerateComplexCombineRequest, GenerateComplexCombineResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, GenerateComplexCombineRequest.class, GenerateComplexCombineResponse.class)
            .withName("GenerateComplexCombine")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/toolkit/complex-combine")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GenerateComplexCombineRequest::getEihealthProjectId,
                GenerateComplexCombineRequest::setEihealthProjectId));
        builder.<GenerateComplexCombineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerateComplexCombineReq.class),
            f -> f.withMarshaller(GenerateComplexCombineRequest::getBody, GenerateComplexCombineRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GenerateComplexCombineResponse::getBody, GenerateComplexCombineResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<GeneratePocketFileRequest, GeneratePocketFileResponse> generatePocketFile =
        genForGeneratePocketFile();

    private static HttpRequestDef<GeneratePocketFileRequest, GeneratePocketFileResponse> genForGeneratePocketFile() {
        // basic
        HttpRequestDef.Builder<GeneratePocketFileRequest, GeneratePocketFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GeneratePocketFileRequest.class, GeneratePocketFileResponse.class)
                .withName("GeneratePocketFile")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/toolkit/pocket")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GeneratePocketFileRequest::getEihealthProjectId,
                GeneratePocketFileRequest::setEihealthProjectId));
        builder.<RunPocketReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunPocketReq.class),
            f -> f.withMarshaller(GeneratePocketFileRequest::getBody, GeneratePocketFileRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GeneratePocketFileResponse::getBody, GeneratePocketFileResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<GenerateSurfacePointsRequest, GenerateSurfacePointsResponse> generateSurfacePoints =
        genForGenerateSurfacePoints();

    private static HttpRequestDef<GenerateSurfacePointsRequest, GenerateSurfacePointsResponse> genForGenerateSurfacePoints() {
        // basic
        HttpRequestDef.Builder<GenerateSurfacePointsRequest, GenerateSurfacePointsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, GenerateSurfacePointsRequest.class, GenerateSurfacePointsResponse.class)
            .withName("GenerateSurfacePoints")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/toolkit/surface-points")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GenerateSurfacePointsRequest::getEihealthProjectId,
                GenerateSurfacePointsRequest::setEihealthProjectId));
        builder.<RunSurfacePointsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunSurfacePointsReq.class),
            f -> f.withMarshaller(GenerateSurfacePointsRequest::getBody, GenerateSurfacePointsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GenerateSurfacePointsResponse::getBody, GenerateSurfacePointsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ImportDataRequest, ImportDataResponse> importData = genForImportData();

    private static HttpRequestDef<ImportDataRequest, ImportDataResponse> genForImportData() {
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
            f -> f.withMarshaller(ImportDataRequest::getEihealthProjectId, ImportDataRequest::setEihealthProjectId));
        builder.<ImportDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportDataReq.class),
            f -> f.withMarshaller(ImportDataRequest::getBody, ImportDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDatabaseDataRequest, ImportDatabaseDataResponse> importDatabaseData =
        genForImportDatabaseData();

    private static HttpRequestDef<ImportDatabaseDataRequest, ImportDatabaseDataResponse> genForImportDatabaseData() {
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
            f -> f.withMarshaller(ImportDatabaseDataRequest::getEihealthProjectId,
                ImportDatabaseDataRequest::setEihealthProjectId));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDatabaseDataRequest::getDatabaseId, ImportDatabaseDataRequest::setDatabaseId));
        builder.<ImportDatabaseDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportDatabaseDataReq.class),
            f -> f.withMarshaller(ImportDatabaseDataRequest::getBody, ImportDatabaseDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportImageRequest, ImportImageResponse> importImage = genForImportImage();

    private static HttpRequestDef<ImportImageRequest, ImportImageResponse> genForImportImage() {
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
            f -> f.withMarshaller(ImportImageRequest::getEihealthProjectId, ImportImageRequest::setEihealthProjectId));
        builder.<ImportImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportImageReq.class),
            f -> f.withMarshaller(ImportImageRequest::getBody, ImportImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportNetworkDataRequest, ImportNetworkDataResponse> importNetworkData =
        genForImportNetworkData();

    private static HttpRequestDef<ImportNetworkDataRequest, ImportNetworkDataResponse> genForImportNetworkData() {
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
            f -> f.withMarshaller(ImportNetworkDataRequest::getEihealthProjectId,
                ImportNetworkDataRequest::setEihealthProjectId));
        builder.<ImportNetworkDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportNetworkDataReq.class),
            f -> f.withMarshaller(ImportNetworkDataRequest::getBody, ImportNetworkDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportTemplateRequest, ImportTemplateResponse> importTemplate =
        genForImportTemplate();

    private static HttpRequestDef<ImportTemplateRequest, ImportTemplateResponse> genForImportTemplate() {
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
            f -> f.withMarshaller(ImportTemplateRequest::getEihealthProjectId,
                ImportTemplateRequest::setEihealthProjectId));
        builder.<ImportTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportTemplateReq.class),
            f -> f.withMarshaller(ImportTemplateRequest::getBody, ImportTemplateRequest::setBody));

        // response
        builder.<List<ImportTemplateResultRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ImportTemplateResponse::getBody, ImportTemplateResponse::setBody)
                .withInnerContainerType(ImportTemplateResultRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ImportUserRequest, ImportUserResponse> importUser = genForImportUser();

    private static HttpRequestDef<ImportUserRequest, ImportUserResponse> genForImportUser() {
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
            f -> f.withMarshaller(ImportUserRequest::getBody, ImportUserRequest::setBody));

        // response
        builder.<List<UserIdRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ImportUserResponse::getBody, ImportUserResponse::setBody)
                .withInnerContainerType(UserIdRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ImportWorkflowRequest, ImportWorkflowResponse> importWorkflow =
        genForImportWorkflow();

    private static HttpRequestDef<ImportWorkflowRequest, ImportWorkflowResponse> genForImportWorkflow() {
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
            f -> f.withMarshaller(ImportWorkflowRequest::getEihealthProjectId,
                ImportWorkflowRequest::setEihealthProjectId));
        builder.<ImportWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportWorkflowReq.class),
            f -> f.withMarshaller(ImportWorkflowRequest::getBody, ImportWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppRequest, ListAppResponse> listApp = genForListApp();

    private static HttpRequestDef<ListAppRequest, ListAppResponse> genForListApp() {
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
            f -> f.withMarshaller(ListAppRequest::getEihealthProjectId, ListAppRequest::setEihealthProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getName, ListAppRequest::setName));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getVersion, ListAppRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArchiveConfigsRequest, ListArchiveConfigsResponse> listArchiveConfigs =
        genForListArchiveConfigs();

    private static HttpRequestDef<ListArchiveConfigsRequest, ListArchiveConfigsResponse> genForListArchiveConfigs() {
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

    public static final HttpRequestDef<ListAssetRequest, ListAssetResponse> listAsset = genForListAsset();

    private static HttpRequestDef<ListAssetRequest, ListAssetResponse> genForListAsset() {
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
            f -> f.withMarshaller(ListAssetRequest::getCategories, ListAssetRequest::setCategories));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getKeyWord, ListAssetRequest::setKeyWord));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getLabels, ListAssetRequest::setLabels));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetRequest::getLimit, ListAssetRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetRequest::getOffset, ListAssetRequest::setOffset));
        builder.<String>withRequestField("publishers",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getPublishers, ListAssetRequest::setPublishers));
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getScope, ListAssetRequest::setScope));
        builder.<String>withRequestField("vendor_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getVendorIds, ListAssetRequest::setVendorIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoJobRequest, ListAutoJobResponse> listAutoJob = genForListAutoJob();

    private static HttpRequestDef<ListAutoJobRequest, ListAutoJobResponse> genForListAutoJob() {
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
            f -> f.withMarshaller(ListAutoJobRequest::getEihealthProjectId, ListAutoJobRequest::setEihealthProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoJobRequest::getLimit, ListAutoJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoJobRequest::getOffset, ListAutoJobRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getSortKey, ListAutoJobRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getSortDir, ListAutoJobRequest::setSortDir));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getXLanguage, ListAutoJobRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupRequest, ListBackupResponse> listBackup = genForListBackup();

    private static HttpRequestDef<ListBackupRequest, ListBackupResponse> genForListBackup() {
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
            f -> f.withMarshaller(ListBackupRequest::getEihealthProjectId, ListBackupRequest::setEihealthProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRequest::getLimit, ListBackupRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRequest::getOffset, ListBackupRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRequest::getSortDir, ListBackupRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRequest::getSortKey, ListBackupRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBucketRequest, ListBucketResponse> listBucket = genForListBucket();

    private static HttpRequestDef<ListBucketRequest, ListBucketResponse> genForListBucket() {
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
            f -> f.withMarshaller(ListBucketRequest::getEihealthProjectId, ListBucketRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCheckpointRequest, ListCheckpointResponse> listCheckpoint =
        genForListCheckpoint();

    private static HttpRequestDef<ListCheckpointRequest, ListCheckpointResponse> genForListCheckpoint() {
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
            f -> f.withMarshaller(ListCheckpointRequest::getDataJobId, ListCheckpointRequest::setDataJobId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCheckpointRequest::getEihealthProjectId,
                ListCheckpointRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> listClusterAllNodeLabel =
        genForListClusterAllNodeLabel();

    private static HttpRequestDef<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> genForListClusterAllNodeLabel() {
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

    public static final HttpRequestDef<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> listComputingResourceFlavors =
        genForListComputingResourceFlavors();

    private static HttpRequestDef<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> genForListComputingResourceFlavors() {
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
            f -> f.withMarshaller(ListComputingResourceFlavorsRequest::getAvailabilityZoneId,
                ListComputingResourceFlavorsRequest::setAvailabilityZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResources =
        genForListComputingResources();

    private static HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> genForListComputingResources() {
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

    public static final HttpRequestDef<ListDataRequest, ListDataResponse> listData = genForListData();

    private static HttpRequestDef<ListDataRequest, ListDataResponse> genForListData() {
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
            f -> f.withMarshaller(ListDataRequest::getEihealthProjectId, ListDataRequest::setEihealthProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataRequest::getLimit, ListDataRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataRequest::getOffset, ListDataRequest::setOffset));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getPath, ListDataRequest::setPath));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSearchKey, ListDataRequest::setSearchKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSortDir, ListDataRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSortKey, ListDataRequest::setSortKey));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getMarker, ListDataRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataJobRequest, ListDataJobResponse> listDataJob = genForListDataJob();

    private static HttpRequestDef<ListDataJobRequest, ListDataJobResponse> genForListDataJob() {
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
            f -> f.withMarshaller(ListDataJobRequest::getEihealthProjectId, ListDataJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getCreator, ListDataJobRequest::setCreator));
        builder.<Long>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFromTime, ListDataJobRequest::setFromTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataJobRequest::getLimit, ListDataJobRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getName, ListDataJobRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataJobRequest::getOffset, ListDataJobRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getStatus, ListDataJobRequest::setStatus));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getToTime, ListDataJobRequest::setToTime));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getType, ListDataJobRequest::setType));
        builder.<Long>withRequestField("finish_from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFinishFromTime, ListDataJobRequest::setFinishFromTime));
        builder.<Long>withRequestField("finish_to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFinishToTime, ListDataJobRequest::setFinishToTime));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getSortDir, ListDataJobRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getSortKey, ListDataJobRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseDataRequest, ListDatabaseDataResponse> listDatabaseData =
        genForListDatabaseData();

    private static HttpRequestDef<ListDatabaseDataRequest, ListDatabaseDataResponse> genForListDatabaseData() {
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
            f -> f.withMarshaller(ListDatabaseDataRequest::getEihealthProjectId,
                ListDatabaseDataRequest::setEihealthProjectId));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getDatabaseId, ListDatabaseDataRequest::setDatabaseId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getLimit, ListDatabaseDataRequest::setLimit));
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getQuery, ListDatabaseDataRequest::setQuery));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getOffset, ListDatabaseDataRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getSortKey, ListDatabaseDataRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getSortDir, ListDatabaseDataRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseResourceRequest, ListDatabaseResourceResponse> listDatabaseResource =
        genForListDatabaseResource();

    private static HttpRequestDef<ListDatabaseResourceRequest, ListDatabaseResourceResponse> genForListDatabaseResource() {
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
        genForListDatabaseResourceFlavor();

    private static HttpRequestDef<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> genForListDatabaseResourceFlavor() {
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

    public static final HttpRequestDef<ListDrugDatabaseRequest, ListDrugDatabaseResponse> listDrugDatabase =
        genForListDrugDatabase();

    private static HttpRequestDef<ListDrugDatabaseRequest, ListDrugDatabaseResponse> genForListDrugDatabase() {
        // basic
        HttpRequestDef.Builder<ListDrugDatabaseRequest, ListDrugDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDrugDatabaseRequest.class, ListDrugDatabaseResponse.class)
                .withName("ListDrugDatabase")
                .withUri("/v1/{project_id}/drug/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugDatabaseRequest::getSearchKey, ListDrugDatabaseRequest::setSearchKey));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugDatabaseRequest::getType, ListDrugDatabaseRequest::setType));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugDatabaseRequest::getSortKey, ListDrugDatabaseRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugDatabaseRequest::getSortDir, ListDrugDatabaseRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugDatabaseRequest::getLimit, ListDrugDatabaseRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugDatabaseRequest::getOffset, ListDrugDatabaseRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDrugJobRequest, ListDrugJobResponse> listDrugJob = genForListDrugJob();

    private static HttpRequestDef<ListDrugJobRequest, ListDrugJobResponse> genForListDrugJob() {
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
            f -> f.withMarshaller(ListDrugJobRequest::getEihealthProjectId, ListDrugJobRequest::setEihealthProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugJobRequest::getLimit, ListDrugJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugJobRequest::getOffset, ListDrugJobRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getSortDir, ListDrugJobRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getSortKey, ListDrugJobRequest::setSortKey));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getJobName, ListDrugJobRequest::setJobName));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugJobRequest::getLabels, ListDrugJobRequest::setLabels));
        builder.<List<String>>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugJobRequest::getStatusList, ListDrugJobRequest::setStatusList));
        builder.<List<String>>withRequestField("type_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugJobRequest::getTypeList, ListDrugJobRequest::setTypeList));
        builder.<Long>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugJobRequest::getCreateStartTime, ListDrugJobRequest::setCreateStartTime));
        builder.<Long>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugJobRequest::getCreateEndTime, ListDrugJobRequest::setCreateEndTime));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugJobRequest::getFinishStartTime, ListDrugJobRequest::setFinishStartTime));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugJobRequest::getFinishEndTime, ListDrugJobRequest::setFinishEndTime));
        builder.<String>withRequestField("total_time_range",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugJobRequest::getTotalTimeRange, ListDrugJobRequest::setTotalTimeRange));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDrugModelRequest, ListDrugModelResponse> listDrugModel =
        genForListDrugModel();

    private static HttpRequestDef<ListDrugModelRequest, ListDrugModelResponse> genForListDrugModel() {
        // basic
        HttpRequestDef.Builder<ListDrugModelRequest, ListDrugModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDrugModelRequest.class, ListDrugModelResponse.class)
                .withName("ListDrugModel")
                .withUri("/v1/{project_id}/drug-models")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugModelRequest::getSearchKey, ListDrugModelRequest::setSearchKey));
        builder.<List<String>>withRequestField("creator_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugModelRequest::getCreatorList, ListDrugModelRequest::setCreatorList));
        builder.<List<String>>withRequestField("type_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugModelRequest::getTypeList, ListDrugModelRequest::setTypeList));
        builder.<List<String>>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugModelRequest::getStatusList, ListDrugModelRequest::setStatusList));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugModelRequest::getSortKey, ListDrugModelRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugModelRequest::getSortDir, ListDrugModelRequest::setSortDir));
        builder.<Long>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugModelRequest::getCreateStartTime, ListDrugModelRequest::setCreateStartTime));
        builder.<Long>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugModelRequest::getCreateEndTime, ListDrugModelRequest::setCreateEndTime));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugModelRequest::getFinishStartTime, ListDrugModelRequest::setFinishStartTime));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDrugModelRequest::getFinishEndTime, ListDrugModelRequest::setFinishEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugModelRequest::getLimit, ListDrugModelRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugModelRequest::getOffset, ListDrugModelRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> listGlobalWorkflowStatistic =
        genForListGlobalWorkflowStatistic();

    private static HttpRequestDef<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> genForListGlobalWorkflowStatistic() {
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

    public static final HttpRequestDef<ListIamGroupUsersRequest, ListIamGroupUsersResponse> listIamGroupUsers =
        genForListIamGroupUsers();

    private static HttpRequestDef<ListIamGroupUsersRequest, ListIamGroupUsersResponse> genForListIamGroupUsers() {
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
            f -> f.withMarshaller(ListIamGroupUsersRequest::getGroupId, ListIamGroupUsersRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIamGroupsRequest, ListIamGroupsResponse> listIamGroups =
        genForListIamGroups();

    private static HttpRequestDef<ListIamGroupsRequest, ListIamGroupsResponse> genForListIamGroups() {
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

    public static final HttpRequestDef<ListIamUsersRequest, ListIamUsersResponse> listIamUsers = genForListIamUsers();

    private static HttpRequestDef<ListIamUsersRequest, ListIamUsersResponse> genForListIamUsers() {
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

    public static final HttpRequestDef<ListImageRequest, ListImageResponse> listImage = genForListImage();

    private static HttpRequestDef<ListImageRequest, ListImageResponse> genForListImage() {
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
            f -> f.withMarshaller(ListImageRequest::getEihealthProjectId, ListImageRequest::setEihealthProjectId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getType, ListImageRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getName, ListImageRequest::setName));
        builder.<Boolean>withRequestField("show_empty",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListImageRequest::getShowEmpty, ListImageRequest::setShowEmpty));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageTagRequest, ListImageTagResponse> listImageTag = genForListImageTag();

    private static HttpRequestDef<ListImageTagRequest, ListImageTagResponse> genForListImageTag() {
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
            f -> f.withMarshaller(ListImageTagRequest::getEihealthProjectId,
                ListImageTagRequest::setEihealthProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageTagRequest::getImageId, ListImageTagRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForListInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForListInstance() {
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
            f -> f.withMarshaller(ListInstanceRequest::getEihealthProjectId,
                ListInstanceRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobRequest, ListJobResponse> listJob = genForListJob();

    private static HttpRequestDef<ListJobRequest, ListJobResponse> genForListJob() {
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
            f -> f.withMarshaller(ListJobRequest::getEihealthProjectId, ListJobRequest::setEihealthProjectId));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getEndTime, ListJobRequest::setEndTime));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getJobName, ListJobRequest::setJobName));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobRequest::getLabels, ListJobRequest::setLabels));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRequest::getLimit, ListJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRequest::getOffset, ListJobRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSortDir, ListJobRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSortKey, ListJobRequest::setSortKey));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getStartTime, ListJobRequest::setStartTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getStatus, ListJobRequest::setStatus));
        builder.<String>withRequestField("tool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getToolName, ListJobRequest::setToolName));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getUserName, ListJobRequest::setUserName));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getFinishStartTime, ListJobRequest::setFinishStartTime));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getFinishEndTime, ListJobRequest::setFinishEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelRequest, ListLabelResponse> listLabel = genForListLabel();

    private static HttpRequestDef<ListLabelRequest, ListLabelResponse> genForListLabel() {
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

    public static final HttpRequestDef<ListLabelPageRequest, ListLabelPageResponse> listLabelPage =
        genForListLabelPage();

    private static HttpRequestDef<ListLabelPageRequest, ListLabelPageResponse> genForListLabelPage() {
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
            f -> f.withMarshaller(ListLabelPageRequest::getEihealthProjectId,
                ListLabelPageRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageRequest, ListMessageResponse> listMessage = genForListMessage();

    private static HttpRequestDef<ListMessageRequest, ListMessageResponse> genForListMessage() {
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
            f -> f.withMarshaller(ListMessageRequest::getEihealthProjectName,
                ListMessageRequest::setEihealthProjectName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getLimit, ListMessageRequest::setLimit));
        builder.<String>withRequestField("message_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getMessageType, ListMessageRequest::setMessageType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getOffset, ListMessageRequest::setOffset));
        builder.<String>withRequestField("operator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getOperator, ListMessageRequest::setOperator));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getResourceType, ListMessageRequest::setResourceType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getStatus, ListMessageRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageStatisticsRequest, ListMessageStatisticsResponse> listMessageStatistics =
        genForListMessageStatistics();

    private static HttpRequestDef<ListMessageStatisticsRequest, ListMessageStatisticsResponse> genForListMessageStatistics() {
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

    public static final HttpRequestDef<ListMfaRequest, ListMfaResponse> listMfa = genForListMfa();

    private static HttpRequestDef<ListMfaRequest, ListMfaResponse> genForListMfa() {
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
            f -> f.withMarshaller(ListMfaRequest::getUserId, ListMfaRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeLabelRequest, ListNodeLabelResponse> listNodeLabel =
        genForListNodeLabel();

    private static HttpRequestDef<ListNodeLabelRequest, ListNodeLabelResponse> genForListNodeLabel() {
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
            f -> f.withMarshaller(ListNodeLabelRequest::getServerId, ListNodeLabelRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodesRequest, ListNodesResponse> listNodes = genForListNodes();

    private static HttpRequestDef<ListNodesRequest, ListNodesResponse> genForListNodes() {
        // basic
        HttpRequestDef.Builder<ListNodesRequest, ListNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodesRequest.class, ListNodesResponse.class)
                .withName("ListNodes")
                .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies/{id}/computing-resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodesRequest::getId, ListNodesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeRequest, ListNoticeResponse> listNotice = genForListNotice();

    private static HttpRequestDef<ListNoticeRequest, ListNoticeResponse> genForListNotice() {
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
            f -> f.withMarshaller(ListNoticeRequest::getIsRead, ListNoticeRequest::setIsRead));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticeRequest::getLimit, ListNoticeRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticeRequest::getOffset, ListNoticeRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> listPerformanceResourceStat =
        genForListPerformanceResourceStat();

    private static HttpRequestDef<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> genForListPerformanceResourceStat() {
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
            f -> f.withMarshaller(ListPerformanceResourceStatRequest::getLimit,
                ListPerformanceResourceStatRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPerformanceResourceStatRequest::getOffset,
                ListPerformanceResourceStatRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> listPerformanceResources =
        genForListPerformanceResources();

    private static HttpRequestDef<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> genForListPerformanceResources() {
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

    public static final HttpRequestDef<ListPolicyEventsRequest, ListPolicyEventsResponse> listPolicyEvents =
        genForListPolicyEvents();

    private static HttpRequestDef<ListPolicyEventsRequest, ListPolicyEventsResponse> genForListPolicyEvents() {
        // basic
        HttpRequestDef.Builder<ListPolicyEventsRequest, ListPolicyEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyEventsRequest.class, ListPolicyEventsResponse.class)
                .withName("ListPolicyEvents")
                .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies/{id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyEventsRequest::getId, ListPolicyEventsRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPresetLabelRequest, ListPresetLabelResponse> listPresetLabel =
        genForListPresetLabel();

    private static HttpRequestDef<ListPresetLabelRequest, ListPresetLabelResponse> genForListPresetLabel() {
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

    public static final HttpRequestDef<ListProjectRequest, ListProjectResponse> listProject = genForListProject();

    private static HttpRequestDef<ListProjectRequest, ListProjectResponse> genForListProject() {
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

    public static final HttpRequestDef<ListPropertyRequest, ListPropertyResponse> listProperty = genForListProperty();

    private static HttpRequestDef<ListPropertyRequest, ListPropertyResponse> genForListProperty() {
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
            f -> f.withMarshaller(ListPropertyRequest::getProperty, ListPropertyRequest::setProperty));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropertyResponse::getBody, ListPropertyResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaRequest, ListQuotaResponse> listQuota = genForListQuota();

    private static HttpRequestDef<ListQuotaRequest, ListQuotaResponse> genForListQuota() {
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

    public static final HttpRequestDef<ListScaleOutPolicyRequest, ListScaleOutPolicyResponse> listScaleOutPolicy =
        genForListScaleOutPolicy();

    private static HttpRequestDef<ListScaleOutPolicyRequest, ListScaleOutPolicyResponse> genForListScaleOutPolicy() {
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

    public static final HttpRequestDef<ListScalingHistoryRequest, ListScalingHistoryResponse> listScalingHistory =
        genForListScalingHistory();

    private static HttpRequestDef<ListScalingHistoryRequest, ListScalingHistoryResponse> genForListScalingHistory() {
        // basic
        HttpRequestDef.Builder<ListScalingHistoryRequest, ListScalingHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingHistoryRequest.class, ListScalingHistoryResponse.class)
                .withName("ListScalingHistory")
                .withUri("/v1/{project_id}/system/autoscaler/scale-out-policies/{id}/histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingHistoryRequest::getId, ListScalingHistoryRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStarRequest, ListStarResponse> listStar = genForListStar();

    private static HttpRequestDef<ListStarRequest, ListStarResponse> genForListStar() {
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

    public static final HttpRequestDef<ListStorageResourcesRequest, ListStorageResourcesResponse> listStorageResources =
        genForListStorageResources();

    private static HttpRequestDef<ListStorageResourcesRequest, ListStorageResourcesResponse> genForListStorageResources() {
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

    public static final HttpRequestDef<ListStudyRequest, ListStudyResponse> listStudy = genForListStudy();

    private static HttpRequestDef<ListStudyRequest, ListStudyResponse> genForListStudy() {
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

    public static final HttpRequestDef<ListStudyJobRequest, ListStudyJobResponse> listStudyJob = genForListStudyJob();

    private static HttpRequestDef<ListStudyJobRequest, ListStudyJobResponse> genForListStudyJob() {
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
            f -> f.withMarshaller(ListStudyJobRequest::getEihealthProjectId,
                ListStudyJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStudyJobRequest::getStudyId, ListStudyJobRequest::setStudyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateRequest, ListTemplateResponse> listTemplate = genForListTemplate();

    private static HttpRequestDef<ListTemplateRequest, ListTemplateResponse> genForListTemplate() {
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
            f -> f.withMarshaller(ListTemplateRequest::getEihealthProjectId,
                ListTemplateRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserRequest, ListUserResponse> listUser = genForListUser();

    private static HttpRequestDef<ListUserRequest, ListUserResponse> genForListUser() {
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

    public static final HttpRequestDef<ListVendorRequest, ListVendorResponse> listVendor = genForListVendor();

    private static HttpRequestDef<ListVendorRequest, ListVendorResponse> genForListVendor() {
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

    public static final HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> listWorkflow = genForListWorkflow();

    private static HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> genForListWorkflow() {
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
            f -> f.withMarshaller(ListWorkflowRequest::getEihealthProjectId,
                ListWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getName, ListWorkflowRequest::setName));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getVersion, ListWorkflowRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> listWorkflowStatistic =
        genForListWorkflowStatistic();

    private static HttpRequestDef<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> genForListWorkflowStatistic() {
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
            f -> f.withMarshaller(ListWorkflowStatisticRequest::getEihealthProjectId,
                ListWorkflowStatisticRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAppRequest, PublishAppResponse> publishApp = genForPublishApp();

    private static HttpRequestDef<PublishAppRequest, PublishAppResponse> genForPublishApp() {
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
            f -> f.withMarshaller(PublishAppRequest::getEihealthProjectId, PublishAppRequest::setEihealthProjectId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppRequest::getAppId, PublishAppRequest::setAppId));
        builder.<PublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAppReq.class),
            f -> f.withMarshaller(PublishAppRequest::getBody, PublishAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishDataRequest, PublishDataResponse> publishData = genForPublishData();

    private static HttpRequestDef<PublishDataRequest, PublishDataResponse> genForPublishData() {
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
            f -> f.withMarshaller(PublishDataRequest::getEihealthProjectId, PublishDataRequest::setEihealthProjectId));
        builder.<PublishDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishDataReq.class),
            f -> f.withMarshaller(PublishDataRequest::getBody, PublishDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishImageRequest, PublishImageResponse> publishImage = genForPublishImage();

    private static HttpRequestDef<PublishImageRequest, PublishImageResponse> genForPublishImage() {
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
            f -> f.withMarshaller(PublishImageRequest::getEihealthProjectId,
                PublishImageRequest::setEihealthProjectId));
        builder.<PublishAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetReq.class),
            f -> f.withMarshaller(PublishImageRequest::getBody, PublishImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishWorkflowRequest, PublishWorkflowResponse> publishWorkflow =
        genForPublishWorkflow();

    private static HttpRequestDef<PublishWorkflowRequest, PublishWorkflowResponse> genForPublishWorkflow() {
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
            f -> f.withMarshaller(PublishWorkflowRequest::getEihealthProjectId,
                PublishWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishWorkflowRequest::getWorkflowId, PublishWorkflowRequest::setWorkflowId));
        builder.<PublishWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishWorkflowReq.class),
            f -> f.withMarshaller(PublishWorkflowRequest::getBody, PublishWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<QuoteDataRequest, QuoteDataResponse> quoteData = genForQuoteData();

    private static HttpRequestDef<QuoteDataRequest, QuoteDataResponse> genForQuoteData() {
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
            f -> f.withMarshaller(QuoteDataRequest::getEihealthProjectId, QuoteDataRequest::setEihealthProjectId));
        builder.<QuoteDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuoteDataReq.class),
            f -> f.withMarshaller(QuoteDataRequest::getBody, QuoteDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<QuoteInstanceRequest, QuoteInstanceResponse> quoteInstance =
        genForQuoteInstance();

    private static HttpRequestDef<QuoteInstanceRequest, QuoteInstanceResponse> genForQuoteInstance() {
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
            f -> f.withMarshaller(QuoteInstanceRequest::getEihealthProjectId,
                QuoteInstanceRequest::setEihealthProjectId));
        builder.<QuoteDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuoteDatabaseReq.class),
            f -> f.withMarshaller(QuoteInstanceRequest::getBody, QuoteInstanceRequest::setBody));

        // response
        builder.<List<QuoteDatabaseResultRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(QuoteInstanceResponse::getBody, QuoteInstanceResponse::setBody)
                .withInnerContainerType(QuoteDatabaseResultRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<RebootNodeRequest, RebootNodeResponse> rebootNode = genForRebootNode();

    private static HttpRequestDef<RebootNodeRequest, RebootNodeResponse> genForRebootNode() {
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
            f -> f.withMarshaller(RebootNodeRequest::getId, RebootNodeRequest::setId));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(RebootNodeRequest::getForce, RebootNodeRequest::setForce));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> restoreBackup =
        genForRestoreBackup();

    private static HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> genForRestoreBackup() {
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
            f -> f.withMarshaller(RestoreBackupRequest::getBackupId, RestoreBackupRequest::setBackupId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBackupRequest::getEihealthProjectId,
                RestoreBackupRequest::setEihealthProjectId));
        builder.<RestoreBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreBackupReq.class),
            f -> f.withMarshaller(RestoreBackupRequest::getBody, RestoreBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryDataJobRequest, RetryDataJobResponse> retryDataJob = genForRetryDataJob();

    private static HttpRequestDef<RetryDataJobRequest, RetryDataJobResponse> genForRetryDataJob() {
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
            f -> f.withMarshaller(RetryDataJobRequest::getDataJobId, RetryDataJobRequest::setDataJobId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryDataJobRequest::getEihealthProjectId,
                RetryDataJobRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryJobRequest, RetryJobResponse> retryJob = genForRetryJob();

    private static HttpRequestDef<RetryJobRequest, RetryJobResponse> genForRetryJob() {
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
            f -> f.withMarshaller(RetryJobRequest::getEihealthProjectId, RetryJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getJobId, RetryJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<Show3dStructureContentRequest, Show3dStructureContentResponse> show3dStructureContent =
        genForShow3dStructureContent();

    private static HttpRequestDef<Show3dStructureContentRequest, Show3dStructureContentResponse> genForShow3dStructureContent() {
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
            f -> f.withMarshaller(Show3dStructureContentRequest::getEihealthProjectId,
                Show3dStructureContentRequest::setEihealthProjectId));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getStudyId,
                Show3dStructureContentRequest::setStudyId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getJobId, Show3dStructureContentRequest::setJobId));
        builder.<String>withRequestField("ligand",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getLigand, Show3dStructureContentRequest::setLigand));
        builder.<String>withRequestField("receptor",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getReceptor,
                Show3dStructureContentRequest::setReceptor));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAdmetJobRequest, ShowAdmetJobResponse> showAdmetJob = genForShowAdmetJob();

    private static HttpRequestDef<ShowAdmetJobRequest, ShowAdmetJobResponse> genForShowAdmetJob() {
        // basic
        HttpRequestDef.Builder<ShowAdmetJobRequest, ShowAdmetJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAdmetJobRequest.class, ShowAdmetJobResponse.class)
                .withName("ShowAdmetJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/admet/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAdmetJobRequest::getEihealthProjectId,
                ShowAdmetJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAdmetJobRequest::getJobId, ShowAdmetJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForShowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForShowApp() {
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
            f -> f.withMarshaller(ShowAppRequest::getAppId, ShowAppRequest::setAppId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getEihealthProjectId, ShowAppRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetRequest, ShowAssetResponse> showAsset = genForShowAsset();

    private static HttpRequestDef<ShowAssetRequest, ShowAssetResponse> genForShowAsset() {
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
            f -> f.withMarshaller(ShowAssetRequest::getAssetId, ShowAssetRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetVersionRequest, ShowAssetVersionResponse> showAssetVersion =
        genForShowAssetVersion();

    private static HttpRequestDef<ShowAssetVersionRequest, ShowAssetVersionResponse> genForShowAssetVersion() {
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
            f -> f.withMarshaller(ShowAssetVersionRequest::getAssetId, ShowAssetVersionRequest::setAssetId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetVersionRequest::getVersion, ShowAssetVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoJobRequest, ShowAutoJobResponse> showAutoJob = genForShowAutoJob();

    private static HttpRequestDef<ShowAutoJobRequest, ShowAutoJobResponse> genForShowAutoJob() {
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
            f -> f.withMarshaller(ShowAutoJobRequest::getEihealthProjectId, ShowAutoJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoJobRequest::getAutoJobId, ShowAutoJobRequest::setAutoJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPathRequest, ShowBackupPathResponse> showBackupPath =
        genForShowBackupPath();

    private static HttpRequestDef<ShowBackupPathRequest, ShowBackupPathResponse> genForShowBackupPath() {
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
            f -> f.withMarshaller(ShowBackupPathRequest::getBackupId, ShowBackupPathRequest::setBackupId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPathRequest::getEihealthProjectId,
                ShowBackupPathRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBmsDevicesRequest, ShowBmsDevicesResponse> showBmsDevices =
        genForShowBmsDevices();

    private static HttpRequestDef<ShowBmsDevicesRequest, ShowBmsDevicesResponse> genForShowBmsDevices() {
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
            f -> f.withMarshaller(ShowBmsDevicesRequest::getId, ShowBmsDevicesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketStorageRequest, ShowBucketStorageResponse> showBucketStorage =
        genForShowBucketStorage();

    private static HttpRequestDef<ShowBucketStorageRequest, ShowBucketStorageResponse> genForShowBucketStorage() {
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
            f -> f.withMarshaller(ShowBucketStorageRequest::getEihealthProjectId,
                ShowBucketStorageRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataRequest, ShowDataResponse> showData = genForShowData();

    private static HttpRequestDef<ShowDataRequest, ShowDataResponse> genForShowData() {
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
            f -> f.withMarshaller(ShowDataRequest::getEihealthProjectId, ShowDataRequest::setEihealthProjectId));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataRequest::getPath, ShowDataRequest::setPath));
        builder.<Boolean>withRequestField("X-Need-Content",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDataRequest::getXNeedContent, ShowDataRequest::setXNeedContent));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataJobRequest, ShowDataJobResponse> showDataJob = genForShowDataJob();

    private static HttpRequestDef<ShowDataJobRequest, ShowDataJobResponse> genForShowDataJob() {
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
            f -> f.withMarshaller(ShowDataJobRequest::getDataJobId, ShowDataJobRequest::setDataJobId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataJobRequest::getEihealthProjectId, ShowDataJobRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataPolicyRequest, ShowDataPolicyResponse> showDataPolicy =
        genForShowDataPolicy();

    private static HttpRequestDef<ShowDataPolicyRequest, ShowDataPolicyResponse> genForShowDataPolicy() {
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
            f -> f.withMarshaller(ShowDataPolicyRequest::getEihealthProjectId,
                ShowDataPolicyRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDockerLoginRequest, ShowDockerLoginResponse> showDockerLogin =
        genForShowDockerLogin();

    private static HttpRequestDef<ShowDockerLoginRequest, ShowDockerLoginResponse> genForShowDockerLogin() {
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
            f -> f.withMarshaller(ShowDockerLoginRequest::getEihealthProjectId,
                ShowDockerLoginRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDockingJobRequest, ShowDockingJobResponse> showDockingJob =
        genForShowDockingJob();

    private static HttpRequestDef<ShowDockingJobRequest, ShowDockingJobResponse> genForShowDockingJob() {
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
            f -> f.withMarshaller(ShowDockingJobRequest::getEihealthProjectId,
                ShowDockingJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDockingJobRequest::getJobId, ShowDockingJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvRequest, ShowEnvResponse> showEnv = genForShowEnv();

    private static HttpRequestDef<ShowEnvRequest, ShowEnvResponse> genForShowEnv() {
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

    public static final HttpRequestDef<ShowEvsQuotaRequest, ShowEvsQuotaResponse> showEvsQuota = genForShowEvsQuota();

    private static HttpRequestDef<ShowEvsQuotaRequest, ShowEvsQuotaResponse> genForShowEvsQuota() {
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

    public static final HttpRequestDef<ShowExtremumInfoRequest, ShowExtremumInfoResponse> showExtremumInfo =
        genForShowExtremumInfo();

    private static HttpRequestDef<ShowExtremumInfoRequest, ShowExtremumInfoResponse> genForShowExtremumInfo() {
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
            f -> f.withMarshaller(ShowExtremumInfoRequest::getEihealthProjectId,
                ShowExtremumInfoRequest::setEihealthProjectId));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtremumInfoRequest::getStudyId, ShowExtremumInfoRequest::setStudyId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtremumInfoRequest::getJobId, ShowExtremumInfoRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFepJobRequest, ShowFepJobResponse> showFepJob = genForShowFepJob();

    private static HttpRequestDef<ShowFepJobRequest, ShowFepJobResponse> genForShowFepJob() {
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
            f -> f.withMarshaller(ShowFepJobRequest::getEihealthProjectId, ShowFepJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFepJobRequest::getJobId, ShowFepJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
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
            f -> f.withMarshaller(ShowInstanceRequest::getEihealthProjectId,
                ShowInstanceRequest::setEihealthProjectId));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getDatabaseId, ShowInstanceRequest::setDatabaseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
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
            f -> f.withMarshaller(ShowJobRequest::getEihealthProjectId, ShowJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));
        builder.<String>withRequestField("X-Addition-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getXAdditionInfo, ShowJobRequest::setXAdditionInfo));

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
                .withUri("/v1/{project_id}/system/job-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobEventRequest, ShowJobEventResponse> showJobEvent = genForShowJobEvent();

    private static HttpRequestDef<ShowJobEventRequest, ShowJobEventResponse> genForShowJobEvent() {
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
            f -> f.withMarshaller(ShowJobEventRequest::getEihealthProjectId,
                ShowJobEventRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobEventRequest::getJobId, ShowJobEventRequest::setJobId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobEventRequest::getXLanguage, ShowJobEventRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobLogRequest, ShowJobLogResponse> showJobLog = genForShowJobLog();

    private static HttpRequestDef<ShowJobLogRequest, ShowJobLogResponse> genForShowJobLog() {
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
            f -> f.withMarshaller(ShowJobLogRequest::getEihealthProjectId, ShowJobLogRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getJobId, ShowJobLogRequest::setJobId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getTaskName, ShowJobLogRequest::setTaskName));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getTaskIndex, ShowJobLogRequest::setTaskIndex));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLeftQuotaRequest, ShowLeftQuotaResponse> showLeftQuota =
        genForShowLeftQuota();

    private static HttpRequestDef<ShowLeftQuotaRequest, ShowLeftQuotaResponse> genForShowLeftQuota() {
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

    public static final HttpRequestDef<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> showMessageClearRule =
        genForShowMessageClearRule();

    private static HttpRequestDef<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> genForShowMessageClearRule() {
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
        genForShowMessageEmailConfig();

    private static HttpRequestDef<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> genForShowMessageEmailConfig() {
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
        genForShowMessageReceiveConfig();

    private static HttpRequestDef<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> genForShowMessageReceiveConfig() {
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

    public static final HttpRequestDef<ShowMolBatchDownloadTaskRequest, ShowMolBatchDownloadTaskResponse> showMolBatchDownloadTask =
        genForShowMolBatchDownloadTask();

    private static HttpRequestDef<ShowMolBatchDownloadTaskRequest, ShowMolBatchDownloadTaskResponse> genForShowMolBatchDownloadTask() {
        // basic
        HttpRequestDef.Builder<ShowMolBatchDownloadTaskRequest, ShowMolBatchDownloadTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowMolBatchDownloadTaskRequest.class, ShowMolBatchDownloadTaskResponse.class)
                .withName("ShowMolBatchDownloadTask")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/toolkit/batch-download/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMolBatchDownloadTaskRequest::getEihealthProjectId,
                ShowMolBatchDownloadTaskRequest::setEihealthProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMolBatchDownloadTaskRequest::getTaskId,
                ShowMolBatchDownloadTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOptmJobRequest, ShowOptmJobResponse> showOptmJob = genForShowOptmJob();

    private static HttpRequestDef<ShowOptmJobRequest, ShowOptmJobResponse> genForShowOptmJob() {
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
            f -> f.withMarshaller(ShowOptmJobRequest::getEihealthProjectId, ShowOptmJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOptmJobRequest::getJobId, ShowOptmJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPocketDetectionJobRequest, ShowPocketDetectionJobResponse> showPocketDetectionJob =
        genForShowPocketDetectionJob();

    private static HttpRequestDef<ShowPocketDetectionJobRequest, ShowPocketDetectionJobResponse> genForShowPocketDetectionJob() {
        // basic
        HttpRequestDef.Builder<ShowPocketDetectionJobRequest, ShowPocketDetectionJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPocketDetectionJobRequest.class, ShowPocketDetectionJobResponse.class)
            .withName("ShowPocketDetectionJob")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/pocket-detection/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPocketDetectionJobRequest::getEihealthProjectId,
                ShowPocketDetectionJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPocketDetectionJobRequest::getJobId, ShowPocketDetectionJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPocketMolDesignJobRequest, ShowPocketMolDesignJobResponse> showPocketMolDesignJob =
        genForShowPocketMolDesignJob();

    private static HttpRequestDef<ShowPocketMolDesignJobRequest, ShowPocketMolDesignJobResponse> genForShowPocketMolDesignJob() {
        // basic
        HttpRequestDef.Builder<ShowPocketMolDesignJobRequest, ShowPocketMolDesignJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPocketMolDesignJobRequest.class, ShowPocketMolDesignJobResponse.class)
            .withName("ShowPocketMolDesignJob")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/pocket-mol-design/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPocketMolDesignJobRequest::getEihealthProjectId,
                ShowPocketMolDesignJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPocketMolDesignJobRequest::getJobId, ShowPocketMolDesignJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectRequest, ShowProjectResponse> showProject = genForShowProject();

    private static HttpRequestDef<ShowProjectRequest, ShowProjectResponse> genForShowProject() {
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
            f -> f.withMarshaller(ShowProjectRequest::getEihealthProjectId, ShowProjectRequest::setEihealthProjectId));
        builder.<String>withRequestField("X-Bucket-Name",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectRequest::getXBucketName, ShowProjectRequest::setXBucketName));
        builder.<String>withRequestField("X-Namespace-Name",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectRequest::getXNamespaceName, ShowProjectRequest::setXNamespaceName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTraceRequest, ShowProjectTraceResponse> showProjectTrace =
        genForShowProjectTrace();

    private static HttpRequestDef<ShowProjectTraceRequest, ShowProjectTraceResponse> genForShowProjectTrace() {
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
            f -> f.withMarshaller(ShowProjectTraceRequest::getEihealthProjectId,
                ShowProjectTraceRequest::setEihealthProjectId));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getPath, ShowProjectTraceRequest::setPath));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getLimit, ShowProjectTraceRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getOffset, ShowProjectTraceRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> showProjectTraceData =
        genForShowProjectTraceData();

    private static HttpRequestDef<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> genForShowProjectTraceData() {
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
            f -> f.withMarshaller(ShowProjectTraceDataRequest::getEihealthProjectId,
                ShowProjectTraceDataRequest::setEihealthProjectId));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceDataRequest::getPath, ShowProjectTraceDataRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTrackerRequest, ShowProjectTrackerResponse> showProjectTracker =
        genForShowProjectTracker();

    private static HttpRequestDef<ShowProjectTrackerRequest, ShowProjectTrackerResponse> genForShowProjectTracker() {
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
            f -> f.withMarshaller(ShowProjectTrackerRequest::getEihealthProjectId,
                ShowProjectTrackerRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> showResourceMetricData =
        genForShowResourceMetricData();

    private static HttpRequestDef<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> genForShowResourceMetricData() {
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
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getFromTime,
                ShowResourceMetricDataRequest::setFromTime));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getToTime, ShowResourceMetricDataRequest::setToTime));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getPeriod, ShowResourceMetricDataRequest::setPeriod));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getMethod, ShowResourceMetricDataRequest::setMethod));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getMetricName,
                ShowResourceMetricDataRequest::setMetricName));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getResourceId,
                ShowResourceMetricDataRequest::setResourceId));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getDeviceId,
                ShowResourceMetricDataRequest::setDeviceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScaleInPolicyRequest, ShowScaleInPolicyResponse> showScaleInPolicy =
        genForShowScaleInPolicy();

    private static HttpRequestDef<ShowScaleInPolicyRequest, ShowScaleInPolicyResponse> genForShowScaleInPolicy() {
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
        genForShowScaleOutPolicy();

    private static HttpRequestDef<ShowScaleOutPolicyRequest, ShowScaleOutPolicyResponse> genForShowScaleOutPolicy() {
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
            f -> f.withMarshaller(ShowScaleOutPolicyRequest::getId, ShowScaleOutPolicyRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScheduleRequest, ShowScheduleResponse> showSchedule = genForShowSchedule();

    private static HttpRequestDef<ShowScheduleRequest, ShowScheduleResponse> genForShowSchedule() {
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
            f -> f.withMarshaller(ShowScheduleRequest::getId, ShowScheduleRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSearchJobRequest, ShowSearchJobResponse> showSearchJob =
        genForShowSearchJob();

    private static HttpRequestDef<ShowSearchJobRequest, ShowSearchJobResponse> genForShowSearchJob() {
        // basic
        HttpRequestDef.Builder<ShowSearchJobRequest, ShowSearchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSearchJobRequest.class, ShowSearchJobResponse.class)
                .withName("ShowSearchJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/search/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSearchJobRequest::getEihealthProjectId,
                ShowSearchJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSearchJobRequest::getJobId, ShowSearchJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSynthesisJobRequest, ShowSynthesisJobResponse> showSynthesisJob =
        genForShowSynthesisJob();

    private static HttpRequestDef<ShowSynthesisJobRequest, ShowSynthesisJobResponse> genForShowSynthesisJob() {
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
            f -> f.withMarshaller(ShowSynthesisJobRequest::getEihealthProjectId,
                ShowSynthesisJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSynthesisJobRequest::getJobId, ShowSynthesisJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskEventsRequest, ShowTaskEventsResponse> showTaskEvents =
        genForShowTaskEvents();

    private static HttpRequestDef<ShowTaskEventsRequest, ShowTaskEventsResponse> genForShowTaskEvents() {
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
            f -> f.withMarshaller(ShowTaskEventsRequest::getEihealthProjectId,
                ShowTaskEventsRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getJobId, ShowTaskEventsRequest::setJobId));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getTaskName, ShowTaskEventsRequest::setTaskName));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getTaskIndex, ShowTaskEventsRequest::setTaskIndex));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> showTaskInstanceEvents =
        genForShowTaskInstanceEvents();

    private static HttpRequestDef<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> genForShowTaskInstanceEvents() {
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
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getEihealthProjectId,
                ShowTaskInstanceEventsRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getJobId, ShowTaskInstanceEventsRequest::setJobId));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getTaskName,
                ShowTaskInstanceEventsRequest::setTaskName));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getInstanceName,
                ShowTaskInstanceEventsRequest::setInstanceName));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getTaskIndex,
                ShowTaskInstanceEventsRequest::setTaskIndex));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> showTaskInstanceMetricData =
        genForShowTaskInstanceMetricData();

    private static HttpRequestDef<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> genForShowTaskInstanceMetricData() {
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
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getEihealthProjectId,
                ShowTaskInstanceMetricDataRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getJobId,
                ShowTaskInstanceMetricDataRequest::setJobId));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getTaskName,
                ShowTaskInstanceMetricDataRequest::setTaskName));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getInstanceName,
                ShowTaskInstanceMetricDataRequest::setInstanceName));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getTaskIndex,
                ShowTaskInstanceMetricDataRequest::setTaskIndex));
        builder.<Long>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getFromTime,
                ShowTaskInstanceMetricDataRequest::setFromTime));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getToTime,
                ShowTaskInstanceMetricDataRequest::setToTime));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getMethod,
                ShowTaskInstanceMetricDataRequest::setMethod));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getMetricName,
                ShowTaskInstanceMetricDataRequest::setMetricName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> showTaskInstancePod =
        genForShowTaskInstancePod();

    private static HttpRequestDef<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> genForShowTaskInstancePod() {
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
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getEihealthProjectId,
                ShowTaskInstancePodRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getJobId, ShowTaskInstancePodRequest::setJobId));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getTaskName, ShowTaskInstancePodRequest::setTaskName));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getInstanceName,
                ShowTaskInstancePodRequest::setInstanceName));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getTaskIndex, ShowTaskInstancePodRequest::setTaskIndex));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstancesRequest, ShowTaskInstancesResponse> showTaskInstances =
        genForShowTaskInstances();

    private static HttpRequestDef<ShowTaskInstancesRequest, ShowTaskInstancesResponse> genForShowTaskInstances() {
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
            f -> f.withMarshaller(ShowTaskInstancesRequest::getEihealthProjectId,
                ShowTaskInstancesRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getJobId, ShowTaskInstancesRequest::setJobId));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getTaskName, ShowTaskInstancesRequest::setTaskName));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getTaskIndex, ShowTaskInstancesRequest::setTaskIndex));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForShowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForShowTemplate() {
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
            f -> f.withMarshaller(ShowTemplateRequest::getEihealthProjectId,
                ShowTemplateRequest::setEihealthProjectId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getTemplateId, ShowTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRequest, ShowUserResponse> showUser = genForShowUser();

    private static HttpRequestDef<ShowUserRequest, ShowUserResponse> genForShowUser() {
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
            f -> f.withMarshaller(ShowUserRequest::getUserId, ShowUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserSettingRequest, ShowUserSettingResponse> showUserSetting =
        genForShowUserSetting();

    private static HttpRequestDef<ShowUserSettingRequest, ShowUserSettingResponse> genForShowUserSetting() {
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
            f -> f.withMarshaller(ShowUserSettingRequest::getUserId, ShowUserSettingRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVendorRequest, ShowVendorResponse> showVendor = genForShowVendor();

    private static HttpRequestDef<ShowVendorRequest, ShowVendorResponse> genForShowVendor() {
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

    public static final HttpRequestDef<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflow = genForShowWorkflow();

    private static HttpRequestDef<ShowWorkflowRequest, ShowWorkflowResponse> genForShowWorkflow() {
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
            f -> f.withMarshaller(ShowWorkflowRequest::getEihealthProjectId,
                ShowWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getWorkflowId, ShowWorkflowRequest::setWorkflowId));
        builder.<Boolean>withRequestField("Show-Param-Detail",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getShowParamDetail, ShowWorkflowRequest::setShowParamDetail));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAutoJobRequest, StartAutoJobResponse> startAutoJob = genForStartAutoJob();

    private static HttpRequestDef<StartAutoJobRequest, StartAutoJobResponse> genForStartAutoJob() {
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
            f -> f.withMarshaller(StartAutoJobRequest::getEihealthProjectId,
                StartAutoJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAutoJobRequest::getAutoJobId, StartAutoJobRequest::setAutoJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNodeRequest, StartNodeResponse> startNode = genForStartNode();

    private static HttpRequestDef<StartNodeRequest, StartNodeResponse> genForStartNode() {
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
            f -> f.withMarshaller(StartNodeRequest::getId, StartNodeRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartScaleOutPolicyRequest, StartScaleOutPolicyResponse> startScaleOutPolicy =
        genForStartScaleOutPolicy();

    private static HttpRequestDef<StartScaleOutPolicyRequest, StartScaleOutPolicyResponse> genForStartScaleOutPolicy() {
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
            f -> f.withMarshaller(StartScaleOutPolicyRequest::getId, StartScaleOutPolicyRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopAutoJobRequest, StopAutoJobResponse> stopAutoJob = genForStopAutoJob();

    private static HttpRequestDef<StopAutoJobRequest, StopAutoJobResponse> genForStopAutoJob() {
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
            f -> f.withMarshaller(StopAutoJobRequest::getEihealthProjectId, StopAutoJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAutoJobRequest::getAutoJobId, StopAutoJobRequest::setAutoJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopNodeRequest, StopNodeResponse> stopNode = genForStopNode();

    private static HttpRequestDef<StopNodeRequest, StopNodeResponse> genForStopNode() {
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
            f -> f.withMarshaller(StopNodeRequest::getId, StopNodeRequest::setId));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StopNodeRequest::getForce, StopNodeRequest::setForce));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopScaleOutPolicyRequest, StopScaleOutPolicyResponse> stopScaleOutPolicy =
        genForStopScaleOutPolicy();

    private static HttpRequestDef<StopScaleOutPolicyRequest, StopScaleOutPolicyResponse> genForStopScaleOutPolicy() {
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
            f -> f.withMarshaller(StopScaleOutPolicyRequest::getId, StopScaleOutPolicyRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeAppRequest, SubscribeAppResponse> subscribeApp = genForSubscribeApp();

    private static HttpRequestDef<SubscribeAppRequest, SubscribeAppResponse> genForSubscribeApp() {
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
            f -> f.withMarshaller(SubscribeAppRequest::getEihealthProjectId,
                SubscribeAppRequest::setEihealthProjectId));
        builder.<SubscribeAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeAppReq.class),
            f -> f.withMarshaller(SubscribeAppRequest::getBody, SubscribeAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeDataRequest, SubscribeDataResponse> subscribeData =
        genForSubscribeData();

    private static HttpRequestDef<SubscribeDataRequest, SubscribeDataResponse> genForSubscribeData() {
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
            f -> f.withMarshaller(SubscribeDataRequest::getEihealthProjectId,
                SubscribeDataRequest::setEihealthProjectId));
        builder.<SubscribeDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeDataReq.class),
            f -> f.withMarshaller(SubscribeDataRequest::getBody, SubscribeDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeImageRequest, SubscribeImageResponse> subscribeImage =
        genForSubscribeImage();

    private static HttpRequestDef<SubscribeImageRequest, SubscribeImageResponse> genForSubscribeImage() {
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
            f -> f.withMarshaller(SubscribeImageRequest::getEihealthProjectId,
                SubscribeImageRequest::setEihealthProjectId));
        builder.<SubscribeImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeImageReq.class),
            f -> f.withMarshaller(SubscribeImageRequest::getBody, SubscribeImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeWorkflowRequest, SubscribeWorkflowResponse> subscribeWorkflow =
        genForSubscribeWorkflow();

    private static HttpRequestDef<SubscribeWorkflowRequest, SubscribeWorkflowResponse> genForSubscribeWorkflow() {
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
            f -> f.withMarshaller(SubscribeWorkflowRequest::getEihealthProjectId,
                SubscribeWorkflowRequest::setEihealthProjectId));
        builder.<SubscribeWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeWorkflowReq.class),
            f -> f.withMarshaller(SubscribeWorkflowRequest::getBody, SubscribeWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TransferProjectRequest, TransferProjectResponse> transferProject =
        genForTransferProject();

    private static HttpRequestDef<TransferProjectRequest, TransferProjectResponse> genForTransferProject() {
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
            f -> f.withMarshaller(TransferProjectRequest::getEihealthProjectId,
                TransferProjectRequest::setEihealthProjectId));
        builder.<TransferProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferProjectReq.class),
            f -> f.withMarshaller(TransferProjectRequest::getBody, TransferProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForUpdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForUpdateApp() {
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
            f -> f.withMarshaller(UpdateAppRequest::getAppId, UpdateAppRequest::setAppId));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getEihealthProjectId, UpdateAppRequest::setEihealthProjectId));
        builder.<AppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppReq.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, UpdateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> updateArchiveConfig =
        genForUpdateArchiveConfig();

    private static HttpRequestDef<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> genForUpdateArchiveConfig() {
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
            f -> f.withMarshaller(UpdateArchiveConfigRequest::getRegionId, UpdateArchiveConfigRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetVersionRequest, UpdateAssetVersionResponse> updateAssetVersion =
        genForUpdateAssetVersion();

    private static HttpRequestDef<UpdateAssetVersionRequest, UpdateAssetVersionResponse> genForUpdateAssetVersion() {
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
            f -> f.withMarshaller(UpdateAssetVersionRequest::getAssetId, UpdateAssetVersionRequest::setAssetId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetVersionRequest::getVersion, UpdateAssetVersionRequest::setVersion));
        builder.<UpdateAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAssetReq.class),
            f -> f.withMarshaller(UpdateAssetVersionRequest::getBody, UpdateAssetVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoJobRequest, UpdateAutoJobResponse> updateAutoJob =
        genForUpdateAutoJob();

    private static HttpRequestDef<UpdateAutoJobRequest, UpdateAutoJobResponse> genForUpdateAutoJob() {
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
            f -> f.withMarshaller(UpdateAutoJobRequest::getEihealthProjectId,
                UpdateAutoJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoJobRequest::getAutoJobId, UpdateAutoJobRequest::setAutoJobId));
        builder.<CreateAutJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAutJobReq.class),
            f -> f.withMarshaller(UpdateAutoJobRequest::getBody, UpdateAutoJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> updateDataPathPolicy =
        genForUpdateDataPathPolicy();

    private static HttpRequestDef<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> genForUpdateDataPathPolicy() {
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
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getEihealthProjectId,
                UpdateDataPathPolicyRequest::setEihealthProjectId));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getPath, UpdateDataPathPolicyRequest::setPath));
        builder.<DataPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataPolicyReq.class),
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getBody, UpdateDataPathPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataPolicyRequest, UpdateDataPolicyResponse> updateDataPolicy =
        genForUpdateDataPolicy();

    private static HttpRequestDef<UpdateDataPolicyRequest, UpdateDataPolicyResponse> genForUpdateDataPolicy() {
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
            f -> f.withMarshaller(UpdateDataPolicyRequest::getEihealthProjectId,
                UpdateDataPolicyRequest::setEihealthProjectId));
        builder.<UpdateDataPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDataPolicyReq.class),
            f -> f.withMarshaller(UpdateDataPolicyRequest::getBody, UpdateDataPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> updateDatabaseData =
        genForUpdateDatabaseData();

    private static HttpRequestDef<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> genForUpdateDatabaseData() {
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
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getEihealthProjectId,
                UpdateDatabaseDataRequest::setEihealthProjectId));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getDatabaseId, UpdateDatabaseDataRequest::setDatabaseId));
        builder.<Long>withRequestField("row_num",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getRowNum, UpdateDatabaseDataRequest::setRowNum));
        builder.<RowDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RowDataReq.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getBody, UpdateDatabaseDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDrugDatabaseRequest, UpdateDrugDatabaseResponse> updateDrugDatabase =
        genForUpdateDrugDatabase();

    private static HttpRequestDef<UpdateDrugDatabaseRequest, UpdateDrugDatabaseResponse> genForUpdateDrugDatabase() {
        // basic
        HttpRequestDef.Builder<UpdateDrugDatabaseRequest, UpdateDrugDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDrugDatabaseRequest.class, UpdateDrugDatabaseResponse.class)
                .withName("UpdateDrugDatabase")
                .withUri("/v1/{project_id}/drug/databases/{database_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDrugDatabaseRequest::getDatabaseId, UpdateDrugDatabaseRequest::setDatabaseId));
        builder.<UpdateDrugDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDrugDatabaseReq.class),
            f -> f.withMarshaller(UpdateDrugDatabaseRequest::getBody, UpdateDrugDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDrugJobRequest, UpdateDrugJobResponse> updateDrugJob =
        genForUpdateDrugJob();

    private static HttpRequestDef<UpdateDrugJobRequest, UpdateDrugJobResponse> genForUpdateDrugJob() {
        // basic
        HttpRequestDef.Builder<UpdateDrugJobRequest, UpdateDrugJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDrugJobRequest.class, UpdateDrugJobResponse.class)
                .withName("UpdateDrugJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDrugJobRequest::getEihealthProjectId,
                UpdateDrugJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDrugJobRequest::getJobId, UpdateDrugJobRequest::setJobId));
        builder.<UpdateDrugJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDrugJobReq.class),
            f -> f.withMarshaller(UpdateDrugJobRequest::getBody, UpdateDrugJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDrugModelRequest, UpdateDrugModelResponse> updateDrugModel =
        genForUpdateDrugModel();

    private static HttpRequestDef<UpdateDrugModelRequest, UpdateDrugModelResponse> genForUpdateDrugModel() {
        // basic
        HttpRequestDef.Builder<UpdateDrugModelRequest, UpdateDrugModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDrugModelRequest.class, UpdateDrugModelResponse.class)
                .withName("UpdateDrugModel")
                .withUri("/v1/{project_id}/drug-models/{model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDrugModelRequest::getModelId, UpdateDrugModelRequest::setModelId));
        builder.<UpdateDrugModelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDrugModelReq.class),
            f -> f.withMarshaller(UpdateDrugModelRequest::getBody, UpdateDrugModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateImageRequest, UpdateImageResponse> updateImage = genForUpdateImage();

    private static HttpRequestDef<UpdateImageRequest, UpdateImageResponse> genForUpdateImage() {
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
            f -> f.withMarshaller(UpdateImageRequest::getEihealthProjectId, UpdateImageRequest::setEihealthProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageRequest::getImageId, UpdateImageRequest::setImageId));
        builder.<UpdateImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateImageReq.class),
            f -> f.withMarshaller(UpdateImageRequest::getBody, UpdateImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInitPasswordRequest, UpdateInitPasswordResponse> updateInitPassword =
        genForUpdateInitPassword();

    private static HttpRequestDef<UpdateInitPasswordRequest, UpdateInitPasswordResponse> genForUpdateInitPassword() {
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
            f -> f.withMarshaller(UpdateInitPasswordRequest::getUserId, UpdateInitPasswordRequest::setUserId));
        builder.<ResetPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordReq.class),
            f -> f.withMarshaller(UpdateInitPasswordRequest::getBody, UpdateInitPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForUpdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForUpdateJob() {
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
            f -> f.withMarshaller(UpdateJobRequest::getEihealthProjectId, UpdateJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getJobId, UpdateJobRequest::setJobId));
        builder.<UpdateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateJobReq.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, UpdateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobConfigRequest, UpdateJobConfigResponse> updateJobConfig =
        genForUpdateJobConfig();

    private static HttpRequestDef<UpdateJobConfigRequest, UpdateJobConfigResponse> genForUpdateJobConfig() {
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
            f -> f.withMarshaller(UpdateJobConfigRequest::getBody, UpdateJobConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForUpdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForUpdateMember() {
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
            f -> f.withMarshaller(UpdateMemberRequest::getEihealthProjectId,
                UpdateMemberRequest::setEihealthProjectId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getUserId, UpdateMemberRequest::setUserId));
        builder.<UpdateMemberReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMemberReq.class),
            f -> f.withMarshaller(UpdateMemberRequest::getBody, UpdateMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageClearRuleRequestBodyRequest, UpdateMessageClearRuleRequestBodyResponse> updateMessageClearRuleRequestBody =
        genForUpdateMessageClearRuleRequestBody();

    private static HttpRequestDef<UpdateMessageClearRuleRequestBodyRequest, UpdateMessageClearRuleRequestBodyResponse> genForUpdateMessageClearRuleRequestBody() {
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
            f -> f.withMarshaller(UpdateMessageClearRuleRequestBodyRequest::getBody,
                UpdateMessageClearRuleRequestBodyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> updateMessageEmailConfig =
        genForUpdateMessageEmailConfig();

    private static HttpRequestDef<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> genForUpdateMessageEmailConfig() {
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
            f -> f.withMarshaller(UpdateMessageEmailConfigRequest::getBody, UpdateMessageEmailConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> updateMessageReceiveConfig =
        genForUpdateMessageReceiveConfig();

    private static HttpRequestDef<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> genForUpdateMessageReceiveConfig() {
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
            f -> f.withMarshaller(UpdateMessageReceiveConfigRequest::getBody,
                UpdateMessageReceiveConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> updatePerformanceResource =
        genForUpdatePerformanceResource();

    private static HttpRequestDef<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> genForUpdatePerformanceResource() {
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
            f -> f.withMarshaller(UpdatePerformanceResourceRequest::getId, UpdatePerformanceResourceRequest::setId));
        builder.<UpdatePerformanceResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePerformanceResourceReq.class),
            f -> f.withMarshaller(UpdatePerformanceResourceRequest::getBody,
                UpdatePerformanceResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> updateProject =
        genForUpdateProject();

    private static HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> genForUpdateProject() {
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
            f -> f.withMarshaller(UpdateProjectRequest::getEihealthProjectId,
                UpdateProjectRequest::setEihealthProjectId));
        builder.<UpdateProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectReq.class),
            f -> f.withMarshaller(UpdateProjectRequest::getBody, UpdateProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> updateProjectTracker =
        genForUpdateProjectTracker();

    private static HttpRequestDef<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> genForUpdateProjectTracker() {
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
            f -> f.withMarshaller(UpdateProjectTrackerRequest::getEihealthProjectId,
                UpdateProjectTrackerRequest::setEihealthProjectId));
        builder.<UpdateTrackerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrackerReq.class),
            f -> f.withMarshaller(UpdateProjectTrackerRequest::getBody, UpdateProjectTrackerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScaleInPolicyRequest, UpdateScaleInPolicyResponse> updateScaleInPolicy =
        genForUpdateScaleInPolicy();

    private static HttpRequestDef<UpdateScaleInPolicyRequest, UpdateScaleInPolicyResponse> genForUpdateScaleInPolicy() {
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
            f -> f.withMarshaller(UpdateScaleInPolicyRequest::getBody, UpdateScaleInPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScaleOutPolicyRequest, UpdateScaleOutPolicyResponse> updateScaleOutPolicy =
        genForUpdateScaleOutPolicy();

    private static HttpRequestDef<UpdateScaleOutPolicyRequest, UpdateScaleOutPolicyResponse> genForUpdateScaleOutPolicy() {
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
            f -> f.withMarshaller(UpdateScaleOutPolicyRequest::getId, UpdateScaleOutPolicyRequest::setId));
        builder.<UpdateScaleOutPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateScaleOutPolicyReq.class),
            f -> f.withMarshaller(UpdateScaleOutPolicyRequest::getBody, UpdateScaleOutPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScheduleRequest, UpdateScheduleResponse> updateSchedule =
        genForUpdateSchedule();

    private static HttpRequestDef<UpdateScheduleRequest, UpdateScheduleResponse> genForUpdateSchedule() {
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
            f -> f.withMarshaller(UpdateScheduleRequest::getId, UpdateScheduleRequest::setId));
        builder.<UpdateScheduleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScheduleReq.class),
            f -> f.withMarshaller(UpdateScheduleRequest::getBody, UpdateScheduleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStarRequest, UpdateStarResponse> updateStar = genForUpdateStar();

    private static HttpRequestDef<UpdateStarRequest, UpdateStarResponse> genForUpdateStar() {
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
            f -> f.withMarshaller(UpdateStarRequest::getAssetId, UpdateStarRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForUpdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForUpdateUser() {
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
            f -> f.withMarshaller(UpdateUserRequest::getUserId, UpdateUserRequest::setUserId));
        builder.<UpdateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserReq.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, UpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserByDomainRequest, UpdateUserByDomainResponse> updateUserByDomain =
        genForUpdateUserByDomain();

    private static HttpRequestDef<UpdateUserByDomainRequest, UpdateUserByDomainResponse> genForUpdateUserByDomain() {
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
            f -> f.withMarshaller(UpdateUserByDomainRequest::getUserId, UpdateUserByDomainRequest::setUserId));
        builder.<UpdateUserByDomainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserByDomainReq.class),
            f -> f.withMarshaller(UpdateUserByDomainRequest::getBody, UpdateUserByDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRoleRequest, UpdateUserRoleResponse> updateUserRole =
        genForUpdateUserRole();

    private static HttpRequestDef<UpdateUserRoleRequest, UpdateUserRoleResponse> genForUpdateUserRole() {
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
            f -> f.withMarshaller(UpdateUserRoleRequest::getUserId, UpdateUserRoleRequest::setUserId));
        builder.<UpdateUserRoleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserRoleReq.class),
            f -> f.withMarshaller(UpdateUserRoleRequest::getBody, UpdateUserRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserSettingRequest, UpdateUserSettingResponse> updateUserSetting =
        genForUpdateUserSetting();

    private static HttpRequestDef<UpdateUserSettingRequest, UpdateUserSettingResponse> genForUpdateUserSetting() {
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
            f -> f.withMarshaller(UpdateUserSettingRequest::getUserId, UpdateUserSettingRequest::setUserId));
        builder.<UpdateUserSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserSettingReq.class),
            f -> f.withMarshaller(UpdateUserSettingRequest::getBody, UpdateUserSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVendorRequest, UpdateVendorResponse> updateVendor = genForUpdateVendor();

    private static HttpRequestDef<UpdateVendorRequest, UpdateVendorResponse> genForUpdateVendor() {
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
            f -> f.withMarshaller(UpdateVendorRequest::getBody, UpdateVendorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflow =
        genForUpdateWorkflow();

    private static HttpRequestDef<UpdateWorkflowRequest, UpdateWorkflowResponse> genForUpdateWorkflow() {
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
            f -> f.withMarshaller(UpdateWorkflowRequest::getEihealthProjectId,
                UpdateWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getWorkflowId, UpdateWorkflowRequest::setWorkflowId));
        builder.<WorkflowDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowDto.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getBody, UpdateWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadDataRequest, UploadDataResponse> uploadData = genForUploadData();

    private static HttpRequestDef<UploadDataRequest, UploadDataResponse> genForUploadData() {
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
            f -> f.withMarshaller(UploadDataRequest::getEihealthProjectId, UploadDataRequest::setEihealthProjectId));
        builder.<UploadDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadDataRequestBody.class),
            f -> f.withMarshaller(UploadDataRequest::getBody, UploadDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadTemplateRequest, UploadTemplateResponse> uploadTemplate =
        genForUploadTemplate();

    private static HttpRequestDef<UploadTemplateRequest, UploadTemplateResponse> genForUploadTemplate() {
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
            f -> f.withMarshaller(UploadTemplateRequest::getEihealthProjectId,
                UploadTemplateRequest::setEihealthProjectId));
        builder.<UploadTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadTemplateRequestBody.class),
            f -> f.withMarshaller(UploadTemplateRequest::getBody, UploadTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateCodeRequest, ValidateCodeResponse> validateCode = genForValidateCode();

    private static HttpRequestDef<ValidateCodeRequest, ValidateCodeResponse> genForValidateCode() {
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
            f -> f.withMarshaller(ValidateCodeRequest::getUserId, ValidateCodeRequest::setUserId));
        builder.<CodeVerifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeVerifyReq.class),
            f -> f.withMarshaller(ValidateCodeRequest::getBody, ValidateCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> showAdmetProperties =
        genForShowAdmetProperties();

    private static HttpRequestDef<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> genForShowAdmetProperties() {
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
            f -> f.withMarshaller(ShowAdmetPropertiesRequest::getBody, ShowAdmetPropertiesRequest::setBody));

        // response
        builder.<Map<String, Object>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ShowAdmetPropertiesResponse::getBody, ShowAdmetPropertiesResponse::setBody)
                .withInnerContainerType(Object.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateCpiTaskRequest, CreateCpiTaskResponse> createCpiTask =
        genForCreateCpiTask();

    private static HttpRequestDef<CreateCpiTaskRequest, CreateCpiTaskResponse> genForCreateCpiTask() {
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
            f -> f.withMarshaller(CreateCpiTaskRequest::getBody, CreateCpiTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCpiTaskResponse::getBody, CreateCpiTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> showCpiTaskResult =
        genForShowCpiTaskResult();

    private static HttpRequestDef<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> genForShowCpiTaskResult() {
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
            f -> f.withMarshaller(ShowCpiTaskResultRequest::getTaskId, ShowCpiTaskResultRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCssClusterRequest, CreateCssClusterResponse> createCssCluster =
        genForCreateCssCluster();

    private static HttpRequestDef<CreateCssClusterRequest, CreateCssClusterResponse> genForCreateCssCluster() {
        // basic
        HttpRequestDef.Builder<CreateCssClusterRequest, CreateCssClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCssClusterRequest.class, CreateCssClusterResponse.class)
                .withName("CreateCssCluster")
                .withUri("/v1/{project_id}/drug/css-clusters")
                .withContentType("application/json");

        // requests
        builder.<CreateCssClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCssClusterReq.class),
            f -> f.withMarshaller(CreateCssClusterRequest::getBody, CreateCssClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCssClusterRequest, DeleteCssClusterResponse> deleteCssCluster =
        genForDeleteCssCluster();

    private static HttpRequestDef<DeleteCssClusterRequest, DeleteCssClusterResponse> genForDeleteCssCluster() {
        // basic
        HttpRequestDef.Builder<DeleteCssClusterRequest, DeleteCssClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCssClusterRequest.class, DeleteCssClusterResponse.class)
                .withName("DeleteCssCluster")
                .withUri("/v1/{project_id}/drug/css-clusters/{css_cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("css_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCssClusterRequest::getCssClusterId, DeleteCssClusterRequest::setCssClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCssClusterRequest, ListCssClusterResponse> listCssCluster =
        genForListCssCluster();

    private static HttpRequestDef<ListCssClusterRequest, ListCssClusterResponse> genForListCssCluster() {
        // basic
        HttpRequestDef.Builder<ListCssClusterRequest, ListCssClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCssClusterRequest.class, ListCssClusterResponse.class)
                .withName("ListCssCluster")
                .withUri("/v1/{project_id}/drug/css-clusters")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCssClusterRequest::getLimit, ListCssClusterRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCssClusterRequest::getOffset, ListCssClusterRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTermTenantCssClusterRequest, ListTermTenantCssClusterResponse> listTermTenantCssCluster =
        genForListTermTenantCssCluster();

    private static HttpRequestDef<ListTermTenantCssClusterRequest, ListTermTenantCssClusterResponse> genForListTermTenantCssCluster() {
        // basic
        HttpRequestDef.Builder<ListTermTenantCssClusterRequest, ListTermTenantCssClusterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListTermTenantCssClusterRequest.class, ListTermTenantCssClusterResponse.class)
                .withName("ListTermTenantCssCluster")
                .withUri("/v1/{project_id}/css/clusters")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTermTenantCssClusterRequest::getLimit,
                ListTermTenantCssClusterRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTermTenantCssClusterRequest::getOffset,
                ListTermTenantCssClusterRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateCssConnectionRequest, ValidateCssConnectionResponse> validateCssConnection =
        genForValidateCssConnection();

    private static HttpRequestDef<ValidateCssConnectionRequest, ValidateCssConnectionResponse> genForValidateCssConnection() {
        // basic
        HttpRequestDef.Builder<ValidateCssConnectionRequest, ValidateCssConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ValidateCssConnectionRequest.class, ValidateCssConnectionResponse.class)
            .withName("ValidateCssConnection")
            .withUri("/v1/{project_id}/drug/css-clusters/connection")
            .withContentType("application/json");

        // requests
        builder.<CreateCssClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCssClusterReq.class),
            f -> f.withMarshaller(ValidateCssConnectionRequest::getBody, ValidateCssConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomPropsTaskRequest, CreateCustomPropsTaskResponse> createCustomPropsTask =
        genForCreateCustomPropsTask();

    private static HttpRequestDef<CreateCustomPropsTaskRequest, CreateCustomPropsTaskResponse> genForCreateCustomPropsTask() {
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
            f -> f.withMarshaller(CreateCustomPropsTaskRequest::getBody, CreateCustomPropsTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCustomPropsTaskResponse::getBody, CreateCustomPropsTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomPropsTaskResultRequest, ShowCustomPropsTaskResultResponse> showCustomPropsTaskResult =
        genForShowCustomPropsTaskResult();

    private static HttpRequestDef<ShowCustomPropsTaskResultRequest, ShowCustomPropsTaskResultResponse> genForShowCustomPropsTaskResult() {
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
            f -> f.withMarshaller(ShowCustomPropsTaskResultRequest::getTaskId,
                ShowCustomPropsTaskResultRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGenerationTaskRequest, CreateGenerationTaskResponse> createGenerationTask =
        genForCreateGenerationTask();

    private static HttpRequestDef<CreateGenerationTaskRequest, CreateGenerationTaskResponse> genForCreateGenerationTask() {
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
            f -> f.withMarshaller(CreateGenerationTaskRequest::getBody, CreateGenerationTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateGenerationTaskResponse::getBody, CreateGenerationTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> showGenerationTaskResult =
        genForShowGenerationTaskResult();

    private static HttpRequestDef<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> genForShowGenerationTaskResult() {
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
            f -> f.withMarshaller(ShowGenerationTaskResultRequest::getTaskId,
                ShowGenerationTaskResultRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse> checkDrugLigandDifference =
        genForCheckDrugLigandDifference();

    private static HttpRequestDef<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse> genForCheckDrugLigandDifference() {
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
            f -> f.withMarshaller(CheckDrugLigandDifferenceRequest::getEihealthProjectId,
                CheckDrugLigandDifferenceRequest::setEihealthProjectId));
        builder.<CheckLigandDifferenceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckLigandDifferenceReq.class),
            f -> f.withMarshaller(CheckDrugLigandDifferenceRequest::getBody,
                CheckDrugLigandDifferenceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse> createDrugLigandInteraction2dSvg =
        genForCreateDrugLigandInteraction2dSvg();

    private static HttpRequestDef<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse> genForCreateDrugLigandInteraction2dSvg() {
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
            f -> f.withMarshaller(CreateDrugLigandInteraction2dSvgRequest::getEihealthProjectId,
                CreateDrugLigandInteraction2dSvgRequest::setEihealthProjectId));
        builder.<CreateDrugLigandInteraction2dSvgReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDrugLigandInteraction2dSvgReq.class),
            f -> f.withMarshaller(CreateDrugLigandInteraction2dSvgRequest::getBody,
                CreateDrugLigandInteraction2dSvgRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse> createDrugLigandPreviewTask =
        genForCreateDrugLigandPreviewTask();

    private static HttpRequestDef<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse> genForCreateDrugLigandPreviewTask() {
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
            f -> f.withMarshaller(CreateDrugLigandPreviewTaskRequest::getEihealthProjectId,
                CreateDrugLigandPreviewTaskRequest::setEihealthProjectId));
        builder.<CreateLigandPreviewTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLigandPreviewTaskReq.class),
            f -> f.withMarshaller(CreateDrugLigandPreviewTaskRequest::getBody,
                CreateDrugLigandPreviewTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse> createDrugLigandSdf =
        genForCreateDrugLigandSdf();

    private static HttpRequestDef<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse> genForCreateDrugLigandSdf() {
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
            f -> f.withMarshaller(CreateDrugLigandSdfRequest::getEihealthProjectId,
                CreateDrugLigandSdfRequest::setEihealthProjectId));
        builder.<CreateLigandSdfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLigandSdfReq.class),
            f -> f.withMarshaller(CreateDrugLigandSdfRequest::getBody, CreateDrugLigandSdfRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDrugLigandSdfResponse::getBody, CreateDrugLigandSdfResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse> createDrugLigandSimilarityGraphTask =
        genForCreateDrugLigandSimilarityGraphTask();

    private static HttpRequestDef<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse> genForCreateDrugLigandSimilarityGraphTask() {
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
            f -> f.withMarshaller(CreateDrugLigandSimilarityGraphTaskRequest::getEihealthProjectId,
                CreateDrugLigandSimilarityGraphTaskRequest::setEihealthProjectId));
        builder.<CreateLigandSimilarityGraphTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLigandSimilarityGraphTaskReq.class),
            f -> f.withMarshaller(CreateDrugLigandSimilarityGraphTaskRequest::getBody,
                CreateDrugLigandSimilarityGraphTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse> createDrugLigandSvg =
        genForCreateDrugLigandSvg();

    private static HttpRequestDef<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse> genForCreateDrugLigandSvg() {
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
            f -> f.withMarshaller(CreateDrugLigandSvgRequest::getEihealthProjectId,
                CreateDrugLigandSvgRequest::setEihealthProjectId));
        builder.<CreateLigandSvgReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLigandSvgReq.class),
            f -> f.withMarshaller(CreateDrugLigandSvgRequest::getBody, CreateDrugLigandSvgRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDrugLigandSvgResponse::getBody, CreateDrugLigandSvgResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse> deleteDrugLigandPreviewTask =
        genForDeleteDrugLigandPreviewTask();

    private static HttpRequestDef<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse> genForDeleteDrugLigandPreviewTask() {
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
            f -> f.withMarshaller(DeleteDrugLigandPreviewTaskRequest::getEihealthProjectId,
                DeleteDrugLigandPreviewTaskRequest::setEihealthProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugLigandPreviewTaskRequest::getTaskId,
                DeleteDrugLigandPreviewTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse> deleteDrugLigandSimilarityGraphTask =
        genForDeleteDrugLigandSimilarityGraphTask();

    private static HttpRequestDef<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse> genForDeleteDrugLigandSimilarityGraphTask() {
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
            f -> f.withMarshaller(DeleteDrugLigandSimilarityGraphTaskRequest::getEihealthProjectId,
                DeleteDrugLigandSimilarityGraphTaskRequest::setEihealthProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugLigandSimilarityGraphTaskRequest::getTaskId,
                DeleteDrugLigandSimilarityGraphTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse> parseDrugReceptorInfo =
        genForParseDrugReceptorInfo();

    private static HttpRequestDef<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse> genForParseDrugReceptorInfo() {
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
            f -> f.withMarshaller(ParseDrugReceptorInfoRequest::getEihealthProjectId,
                ParseDrugReceptorInfoRequest::setEihealthProjectId));
        builder.<ReceptorDrugFileReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReceptorDrugFileReq.class),
            f -> f.withMarshaller(ParseDrugReceptorInfoRequest::getBody, ParseDrugReceptorInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse> recognizeDrugReceptorPocket =
        genForRecognizeDrugReceptorPocket();

    private static HttpRequestDef<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse> genForRecognizeDrugReceptorPocket() {
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
            f -> f.withMarshaller(RecognizeDrugReceptorPocketRequest::getEihealthProjectId,
                RecognizeDrugReceptorPocketRequest::setEihealthProjectId));
        builder.<RecognizeReceptorPocketReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecognizeReceptorPocketReq.class),
            f -> f.withMarshaller(RecognizeDrugReceptorPocketRequest::getBody,
                RecognizeDrugReceptorPocketRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse> runDrugLigandToSmilesConversion =
        genForRunDrugLigandToSmilesConversion();

    private static HttpRequestDef<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse> genForRunDrugLigandToSmilesConversion() {
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
            f -> f.withMarshaller(RunDrugLigandToSmilesConversionRequest::getEihealthProjectId,
                RunDrugLigandToSmilesConversionRequest::setEihealthProjectId));
        builder.<DrugFile>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DrugFile.class),
            f -> f.withMarshaller(RunDrugLigandToSmilesConversionRequest::getBody,
                RunDrugLigandToSmilesConversionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse> runDrugReceptorPreprocess =
        genForRunDrugReceptorPreprocess();

    private static HttpRequestDef<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse> genForRunDrugReceptorPreprocess() {
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
            f -> f.withMarshaller(RunDrugReceptorPreprocessRequest::getEihealthProjectId,
                RunDrugReceptorPreprocessRequest::setEihealthProjectId));
        builder.<RunReceptorPreprocessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunReceptorPreprocessReq.class),
            f -> f.withMarshaller(RunDrugReceptorPreprocessRequest::getBody,
                RunDrugReceptorPreprocessRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RunDrugReceptorPreprocessResponse::getBody,
                RunDrugReceptorPreprocessResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse> showDrugLigandPreviewTask =
        genForShowDrugLigandPreviewTask();

    private static HttpRequestDef<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse> genForShowDrugLigandPreviewTask() {
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
            f -> f.withMarshaller(ShowDrugLigandPreviewTaskRequest::getEihealthProjectId,
                ShowDrugLigandPreviewTaskRequest::setEihealthProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrugLigandPreviewTaskRequest::getTaskId,
                ShowDrugLigandPreviewTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse> showDrugLigandSimilarityGraphTask =
        genForShowDrugLigandSimilarityGraphTask();

    private static HttpRequestDef<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse> genForShowDrugLigandSimilarityGraphTask() {
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
            f -> f.withMarshaller(ShowDrugLigandSimilarityGraphTaskRequest::getEihealthProjectId,
                ShowDrugLigandSimilarityGraphTaskRequest::setEihealthProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrugLigandSimilarityGraphTaskRequest::getTaskId,
                ShowDrugLigandSimilarityGraphTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDataRequest, DownloadDataResponse> downloadData = genForDownloadData();

    private static HttpRequestDef<DownloadDataRequest, DownloadDataResponse> genForDownloadData() {
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
            f -> f.withMarshaller(DownloadDataRequest::getEihealthProjectId,
                DownloadDataRequest::setEihealthProjectId));
        builder.<DownloadDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadDataReq.class),
            f -> f.withMarshaller(DownloadDataRequest::getBody, DownloadDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> showOverview = genForShowOverview();

    private static HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> genForShowOverview() {
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

    public static final HttpRequestDef<CleanNextflowCacheRequest, CleanNextflowCacheResponse> cleanNextflowCache =
        genForCleanNextflowCache();

    private static HttpRequestDef<CleanNextflowCacheRequest, CleanNextflowCacheResponse> genForCleanNextflowCache() {
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

    public static final HttpRequestDef<CreateNextflowJobRequest, CreateNextflowJobResponse> createNextflowJob =
        genForCreateNextflowJob();

    private static HttpRequestDef<CreateNextflowJobRequest, CreateNextflowJobResponse> genForCreateNextflowJob() {
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
            f -> f.withMarshaller(CreateNextflowJobRequest::getEihealthProjectId,
                CreateNextflowJobRequest::setEihealthProjectId));
        builder.<CreateNextflowJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNextflowJobRequestBody.class),
            f -> f.withMarshaller(CreateNextflowJobRequest::getBody, CreateNextflowJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNextflowWorkflowRequest, CreateNextflowWorkflowResponse> createNextflowWorkflow =
        genForCreateNextflowWorkflow();

    private static HttpRequestDef<CreateNextflowWorkflowRequest, CreateNextflowWorkflowResponse> genForCreateNextflowWorkflow() {
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
            f -> f.withMarshaller(CreateNextflowWorkflowRequest::getEihealthProjectId,
                CreateNextflowWorkflowRequest::setEihealthProjectId));
        builder.<CreateNextflowWorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNextflowWorkflowRequestBody.class),
            f -> f.withMarshaller(CreateNextflowWorkflowRequest::getBody, CreateNextflowWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNextflowJobRequest, DeleteNextflowJobResponse> deleteNextflowJob =
        genForDeleteNextflowJob();

    private static HttpRequestDef<DeleteNextflowJobRequest, DeleteNextflowJobResponse> genForDeleteNextflowJob() {
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
            f -> f.withMarshaller(DeleteNextflowJobRequest::getEihealthProjectId,
                DeleteNextflowJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNextflowJobRequest::getJobId, DeleteNextflowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNextflowWorkflowRequest, DeleteNextflowWorkflowResponse> deleteNextflowWorkflow =
        genForDeleteNextflowWorkflow();

    private static HttpRequestDef<DeleteNextflowWorkflowRequest, DeleteNextflowWorkflowResponse> genForDeleteNextflowWorkflow() {
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
            f -> f.withMarshaller(DeleteNextflowWorkflowRequest::getEihealthProjectId,
                DeleteNextflowWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNextflowWorkflowRequest::getWorkflowId,
                DeleteNextflowWorkflowRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallNextflowRequest, InstallNextflowResponse> installNextflow =
        genForInstallNextflow();

    private static HttpRequestDef<InstallNextflowRequest, InstallNextflowResponse> genForInstallNextflow() {
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
            f -> f.withMarshaller(InstallNextflowRequest::getBody, InstallNextflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNextflowJobRequest, ListNextflowJobResponse> listNextflowJob =
        genForListNextflowJob();

    private static HttpRequestDef<ListNextflowJobRequest, ListNextflowJobResponse> genForListNextflowJob() {
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
            f -> f.withMarshaller(ListNextflowJobRequest::getEihealthProjectId,
                ListNextflowJobRequest::setEihealthProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getLimit, ListNextflowJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getOffset, ListNextflowJobRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getSortDir, ListNextflowJobRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getSortKey, ListNextflowJobRequest::setSortKey));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getJobName, ListNextflowJobRequest::setJobName));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getLabels, ListNextflowJobRequest::setLabels));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getStatus, ListNextflowJobRequest::setStatus));
        builder.<String>withRequestField("workflow_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getWorkflowName, ListNextflowJobRequest::setWorkflowName));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getUserName, ListNextflowJobRequest::setUserName));
        builder.<Long>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getCreateStartTime,
                ListNextflowJobRequest::setCreateStartTime));
        builder.<Long>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getCreateEndTime, ListNextflowJobRequest::setCreateEndTime));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getFinishStartTime,
                ListNextflowJobRequest::setFinishStartTime));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNextflowJobRequest::getFinishEndTime, ListNextflowJobRequest::setFinishEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNextflowTaskRequest, ListNextflowTaskResponse> listNextflowTask =
        genForListNextflowTask();

    private static HttpRequestDef<ListNextflowTaskRequest, ListNextflowTaskResponse> genForListNextflowTask() {
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
            f -> f.withMarshaller(ListNextflowTaskRequest::getEihealthProjectId,
                ListNextflowTaskRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowTaskRequest::getJobId, ListNextflowTaskRequest::setJobId));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowTaskRequest::getSearchKey, ListNextflowTaskRequest::setSearchKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNextflowVersionRequest, ListNextflowVersionResponse> listNextflowVersion =
        genForListNextflowVersion();

    private static HttpRequestDef<ListNextflowVersionRequest, ListNextflowVersionResponse> genForListNextflowVersion() {
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

    public static final HttpRequestDef<ListNextflowWorkflowRequest, ListNextflowWorkflowResponse> listNextflowWorkflow =
        genForListNextflowWorkflow();

    private static HttpRequestDef<ListNextflowWorkflowRequest, ListNextflowWorkflowResponse> genForListNextflowWorkflow() {
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
            f -> f.withMarshaller(ListNextflowWorkflowRequest::getEihealthProjectId,
                ListNextflowWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNextflowWorkflowRequest::getName, ListNextflowWorkflowRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryNextflowJobRequest, RetryNextflowJobResponse> retryNextflowJob =
        genForRetryNextflowJob();

    private static HttpRequestDef<RetryNextflowJobRequest, RetryNextflowJobResponse> genForRetryNextflowJob() {
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
            f -> f.withMarshaller(RetryNextflowJobRequest::getEihealthProjectId,
                RetryNextflowJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryNextflowJobRequest::getJobId, RetryNextflowJobRequest::setJobId));
        builder.<RetryNextflowJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RetryNextflowJobRequestBody.class),
            f -> f.withMarshaller(RetryNextflowJobRequest::getBody, RetryNextflowJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowRequest, ShowNextflowResponse> showNextflow = genForShowNextflow();

    private static HttpRequestDef<ShowNextflowRequest, ShowNextflowResponse> genForShowNextflow() {
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
            f -> f.withMarshaller(ShowNextflowRequest::getId, ShowNextflowRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowJobRequest, ShowNextflowJobResponse> showNextflowJob =
        genForShowNextflowJob();

    private static HttpRequestDef<ShowNextflowJobRequest, ShowNextflowJobResponse> genForShowNextflowJob() {
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
            f -> f.withMarshaller(ShowNextflowJobRequest::getEihealthProjectId,
                ShowNextflowJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobRequest::getJobId, ShowNextflowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowJobLogRequest, ShowNextflowJobLogResponse> showNextflowJobLog =
        genForShowNextflowJobLog();

    private static HttpRequestDef<ShowNextflowJobLogRequest, ShowNextflowJobLogResponse> genForShowNextflowJobLog() {
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
            f -> f.withMarshaller(ShowNextflowJobLogRequest::getEihealthProjectId,
                ShowNextflowJobLogRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobLogRequest::getJobId, ShowNextflowJobLogRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowJobReportsRequest, ShowNextflowJobReportsResponse> showNextflowJobReports =
        genForShowNextflowJobReports();

    private static HttpRequestDef<ShowNextflowJobReportsRequest, ShowNextflowJobReportsResponse> genForShowNextflowJobReports() {
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
            f -> f.withMarshaller(ShowNextflowJobReportsRequest::getEihealthProjectId,
                ShowNextflowJobReportsRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowJobReportsRequest::getJobId, ShowNextflowJobReportsRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowTaskDetailRequest, ShowNextflowTaskDetailResponse> showNextflowTaskDetail =
        genForShowNextflowTaskDetail();

    private static HttpRequestDef<ShowNextflowTaskDetailRequest, ShowNextflowTaskDetailResponse> genForShowNextflowTaskDetail() {
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
            f -> f.withMarshaller(ShowNextflowTaskDetailRequest::getEihealthProjectId,
                ShowNextflowTaskDetailRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskDetailRequest::getJobId, ShowNextflowTaskDetailRequest::setJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskDetailRequest::getTaskId, ShowNextflowTaskDetailRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowTaskLogRequest, ShowNextflowTaskLogResponse> showNextflowTaskLog =
        genForShowNextflowTaskLog();

    private static HttpRequestDef<ShowNextflowTaskLogRequest, ShowNextflowTaskLogResponse> genForShowNextflowTaskLog() {
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
            f -> f.withMarshaller(ShowNextflowTaskLogRequest::getEihealthProjectId,
                ShowNextflowTaskLogRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskLogRequest::getJobId, ShowNextflowTaskLogRequest::setJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowTaskLogRequest::getTaskId, ShowNextflowTaskLogRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNextflowWorkflowRequest, ShowNextflowWorkflowResponse> showNextflowWorkflow =
        genForShowNextflowWorkflow();

    private static HttpRequestDef<ShowNextflowWorkflowRequest, ShowNextflowWorkflowResponse> genForShowNextflowWorkflow() {
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
            f -> f.withMarshaller(ShowNextflowWorkflowRequest::getEihealthProjectId,
                ShowNextflowWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNextflowWorkflowRequest::getWorkflowId,
                ShowNextflowWorkflowRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopNextflowJobRequest, StopNextflowJobResponse> stopNextflowJob =
        genForStopNextflowJob();

    private static HttpRequestDef<StopNextflowJobRequest, StopNextflowJobResponse> genForStopNextflowJob() {
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
            f -> f.withMarshaller(StopNextflowJobRequest::getEihealthProjectId,
                StopNextflowJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopNextflowJobRequest::getJobId, StopNextflowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UninstallNextflowRequest, UninstallNextflowResponse> uninstallNextflow =
        genForUninstallNextflow();

    private static HttpRequestDef<UninstallNextflowRequest, UninstallNextflowResponse> genForUninstallNextflow() {
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
            f -> f.withMarshaller(UninstallNextflowRequest::getId, UninstallNextflowRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNextflowWorkflowRequest, UpdateNextflowWorkflowResponse> updateNextflowWorkflow =
        genForUpdateNextflowWorkflow();

    private static HttpRequestDef<UpdateNextflowWorkflowRequest, UpdateNextflowWorkflowResponse> genForUpdateNextflowWorkflow() {
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
            f -> f.withMarshaller(UpdateNextflowWorkflowRequest::getEihealthProjectId,
                UpdateNextflowWorkflowRequest::setEihealthProjectId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNextflowWorkflowRequest::getWorkflowId,
                UpdateNextflowWorkflowRequest::setWorkflowId));
        builder.<UpdateNextflowWorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateNextflowWorkflowRequestBody.class),
            f -> f.withMarshaller(UpdateNextflowWorkflowRequest::getBody, UpdateNextflowWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotebookRequest, CreateNotebookResponse> createNotebook =
        genForCreateNotebook();

    private static HttpRequestDef<CreateNotebookRequest, CreateNotebookResponse> genForCreateNotebook() {
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
            f -> f.withMarshaller(CreateNotebookRequest::getEihealthProjectId,
                CreateNotebookRequest::setEihealthProjectId));
        builder.<CreateNotebookReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotebookReq.class),
            f -> f.withMarshaller(CreateNotebookRequest::getBody, CreateNotebookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotebookRequest, DeleteNotebookResponse> deleteNotebook =
        genForDeleteNotebook();

    private static HttpRequestDef<DeleteNotebookRequest, DeleteNotebookResponse> genForDeleteNotebook() {
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
            f -> f.withMarshaller(DeleteNotebookRequest::getEihealthProjectId,
                DeleteNotebookRequest::setEihealthProjectId));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotebookRequest::getNotebookId, DeleteNotebookRequest::setNotebookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotebookRequest, ListNotebookResponse> listNotebook = genForListNotebook();

    private static HttpRequestDef<ListNotebookRequest, ListNotebookResponse> genForListNotebook() {
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
            f -> f.withMarshaller(ListNotebookRequest::getEihealthProjectId,
                ListNotebookRequest::setEihealthProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotebookRequest::getLimit, ListNotebookRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookRequest::getName, ListNotebookRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotebookRequest::getOffset, ListNotebookRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookRequest::getStatus, ListNotebookRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotebookToolRequest, ListNotebookToolResponse> listNotebookTool =
        genForListNotebookTool();

    private static HttpRequestDef<ListNotebookToolRequest, ListNotebookToolResponse> genForListNotebookTool() {
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
            f -> f.withMarshaller(ListNotebookToolRequest::getEihealthProjectId,
                ListNotebookToolRequest::setEihealthProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotebookRequest, ShowNotebookResponse> showNotebook = genForShowNotebook();

    private static HttpRequestDef<ShowNotebookRequest, ShowNotebookResponse> genForShowNotebook() {
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
            f -> f.withMarshaller(ShowNotebookRequest::getEihealthProjectId,
                ShowNotebookRequest::setEihealthProjectId));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookRequest::getNotebookId, ShowNotebookRequest::setNotebookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotebookTokenRequest, ShowNotebookTokenResponse> showNotebookToken =
        genForShowNotebookToken();

    private static HttpRequestDef<ShowNotebookTokenRequest, ShowNotebookTokenResponse> genForShowNotebookToken() {
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
            f -> f.withMarshaller(ShowNotebookTokenRequest::getEihealthProjectId,
                ShowNotebookTokenRequest::setEihealthProjectId));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookTokenRequest::getNotebookId, ShowNotebookTokenRequest::setNotebookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopOrStartNotebookRequest, StopOrStartNotebookResponse> stopOrStartNotebook =
        genForStopOrStartNotebook();

    private static HttpRequestDef<StopOrStartNotebookRequest, StopOrStartNotebookResponse> genForStopOrStartNotebook() {
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
            f -> f.withMarshaller(StopOrStartNotebookRequest::getEihealthProjectId,
                StopOrStartNotebookRequest::setEihealthProjectId));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopOrStartNotebookRequest::getNotebookId,
                StopOrStartNotebookRequest::setNotebookId));
        builder.<NotebookActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NotebookActionReq.class),
            f -> f.withMarshaller(StopOrStartNotebookRequest::getBody, StopOrStartNotebookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotebookRequest, UpdateNotebookResponse> updateNotebook =
        genForUpdateNotebook();

    private static HttpRequestDef<UpdateNotebookRequest, UpdateNotebookResponse> genForUpdateNotebook() {
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
            f -> f.withMarshaller(UpdateNotebookRequest::getEihealthProjectId,
                UpdateNotebookRequest::setEihealthProjectId));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getNotebookId, UpdateNotebookRequest::setNotebookId));
        builder.<UpdateNotebookReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotebookReq.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getBody, UpdateNotebookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketRequest, ListObsBucketResponse> listObsBucket =
        genForListObsBucket();

    private static HttpRequestDef<ListObsBucketRequest, ListObsBucketResponse> genForListObsBucket() {
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
            f -> f.withMarshaller(ListObsBucketRequest::getType, ListObsBucketRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketObjectRequest, ListObsBucketObjectResponse> listObsBucketObject =
        genForListObsBucketObject();

    private static HttpRequestDef<ListObsBucketObjectRequest, ListObsBucketObjectResponse> genForListObsBucketObject() {
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
            f -> f.withMarshaller(ListObsBucketObjectRequest::getBucketName,
                ListObsBucketObjectRequest::setBucketName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getLimit, ListObsBucketObjectRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getOffset, ListObsBucketObjectRequest::setOffset));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getPath, ListObsBucketObjectRequest::setPath));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getSearchKey, ListObsBucketObjectRequest::setSearchKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> createOptimizationTask =
        genForCreateOptimizationTask();

    private static HttpRequestDef<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> genForCreateOptimizationTask() {
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
            f -> f.withMarshaller(CreateOptimizationTaskRequest::getBody, CreateOptimizationTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateOptimizationTaskResponse::getBody, CreateOptimizationTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> showOptimizationTaskResult =
        genForShowOptimizationTaskResult();

    private static HttpRequestDef<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> genForShowOptimizationTaskResult() {
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
            f -> f.withMarshaller(ShowOptimizationTaskResultRequest::getTaskId,
                ShowOptimizationTaskResultRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSearchTaskRequest, CreateSearchTaskResponse> createSearchTask =
        genForCreateSearchTask();

    private static HttpRequestDef<CreateSearchTaskRequest, CreateSearchTaskResponse> genForCreateSearchTask() {
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
            f -> f.withMarshaller(CreateSearchTaskRequest::getBody, CreateSearchTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSearchTaskResponse::getBody, CreateSearchTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> showSearchTaskResult =
        genForShowSearchTaskResult();

    private static HttpRequestDef<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> genForShowSearchTaskResult() {
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
            f -> f.withMarshaller(ShowSearchTaskResultRequest::getTaskId, ShowSearchTaskResultRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSynthesisTaskRequest, CreateSynthesisTaskResponse> createSynthesisTask =
        genForCreateSynthesisTask();

    private static HttpRequestDef<CreateSynthesisTaskRequest, CreateSynthesisTaskResponse> genForCreateSynthesisTask() {
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
            f -> f.withMarshaller(CreateSynthesisTaskRequest::getBody, CreateSynthesisTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSynthesisTaskResponse::getBody, CreateSynthesisTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowSynthesisTaskResultRequest, ShowSynthesisTaskResultResponse> showSynthesisTaskResult =
        genForShowSynthesisTaskResult();

    private static HttpRequestDef<ShowSynthesisTaskResultRequest, ShowSynthesisTaskResultResponse> genForShowSynthesisTaskResult() {
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
            f -> f.withMarshaller(ShowSynthesisTaskResultRequest::getTaskId,
                ShowSynthesisTaskResultRequest::setTaskId));

        // response

        return builder.build();
    }

}
