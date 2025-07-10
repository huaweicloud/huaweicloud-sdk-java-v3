package com.huaweicloud.sdk.eihealth.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eihealth.v1.model.AddDrugDatabaseFileRequest;
import com.huaweicloud.sdk.eihealth.v1.model.AddDrugDatabaseFileResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchCancelJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchCancelJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteMemberRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteMemberResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteNoticeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteNoticeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteTagRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDeleteTagResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDownloadResourceStatDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchDownloadResourceStatDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchRetryJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchRetryJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNodeLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNodeLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNoticeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchUpdateNoticeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CancelDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CancelDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CancelDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CancelDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CancelJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CancelJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ChangePasswordRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ChangePasswordResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CheckDrugLigandDifferenceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CheckDrugLigandDifferenceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CheckEmailConnectionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CheckEmailConnectionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CheckTokenVerificationRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CheckTokenVerificationResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CleanNextflowCacheRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CleanNextflowCacheResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CopyDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CopyDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateBackupRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateBackupResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusteringJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusteringJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCustomPropsTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCustomPropsTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDockingJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDockingJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugDatabaseRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugDatabaseResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFavoriteRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFavoriteResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFepJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFepJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenerationTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenerationTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelPageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelPageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolBatchDownloadTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolBatchDownloadTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolDockingJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolDockingJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNextflowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptimizationTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptimizationTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptmJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateOptmJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePerformanceResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePerformanceResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketDetectionJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketDetectionJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketMolDesignJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreatePocketMolDesignJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateStudyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSynthesisTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTargetOptJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTargetOptJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAssetVersionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAssetVersionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteBackupRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteBackupResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteComputingClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteComputingClusterResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugModelResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugModelResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDrugModelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteFavoriteRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteFavoriteResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataJobLogRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataJobLogResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataTraceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataTraceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadPublicDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadPublicDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteAssetActionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteAssetActionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateComplexCombineRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateComplexCombineResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GeneratePocketFileRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GeneratePocketFileResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateSurfacePointsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateSurfacePointsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.InitializePlatformRequest;
import com.huaweicloud.sdk.eihealth.v1.model.InitializePlatformResponse;
import com.huaweicloud.sdk.eihealth.v1.model.InstallNextflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.InstallNextflowResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListBaseModelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListBaseModelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListBucketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListBucketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListCceClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListCceClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListCheckpointRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListCheckpointResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterAllNodeLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterAllNodeLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterInstallStepRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterInstallStepResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListComputingClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListComputingClusterResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugModelResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugModelResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugModelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListFavoriteRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListFavoriteResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListProjectStatisticsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListProjectStatisticsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListPropertyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPropertyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListQuotaRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListQuotaResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListScalingHistoryRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListScalingHistoryResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListSfsTurbosRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListSfsTurbosResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListUserAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListUserWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListVendorRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListVendorResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListWorkflowStatisticRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListWorkflowStatisticResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ParseDrugReceptorInfoRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ParseDrugReceptorInfoResponse;
import com.huaweicloud.sdk.eihealth.v1.model.PublishAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.PublishAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.PublishDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.PublishDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.PublishImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.PublishImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.PublishWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.PublishWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteInstanceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteInstanceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RebootNodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RebootNodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeDrugReceptorPocketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeDrugReceptorPocketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RestoreBackupRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RestoreBackupResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryNextflowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryNextflowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugLigandToSmilesConversionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugLigandToSmilesConversionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugReceptorPreprocessRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugReceptorPreprocessResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunFastaPreprocessRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunFastaPreprocessResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunFormatConverterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunFormatConverterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.Show3dStructureContentRequest;
import com.huaweicloud.sdk.eihealth.v1.model.Show3dStructureContentResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAdmetJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAdmetJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAdmetPropertiesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAdmetPropertiesResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAgencyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowAgencyResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowClusteringJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowClusteringJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowCpiJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowCpiJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowGenJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowGenJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowTargetOptJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowTargetOptJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UninstallNextflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UninstallNextflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAgencyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAgencyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateArchiveConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateArchiveConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAssetVersionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAssetVersionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAutoJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAutoJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPathPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPathPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDataPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDatabaseDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDatabaseDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugDatabaseRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugDatabaseResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugModelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateDrugModelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateInitPasswordRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateInitPasswordResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageClearRuleRequestBodyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageClearRuleRequestBodyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageEmailConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageEmailConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageReceiveConfigRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMessageReceiveConfigResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNextflowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNextflowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectTrackerRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectTrackerResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleInPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleInPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleOutPolicyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScaleOutPolicyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScheduleRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateScheduleResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateStarRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateStarResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateTopProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateTopProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserByDomainRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserByDomainResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserRoleRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserRoleResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserSettingRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateUserSettingResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateVendorRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateVendorResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UploadDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UploadDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UploadTemplateRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UploadTemplateResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCssConnectionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCssConnectionResponse;

public class EiHealthClient {

    protected HcClient hcClient;

    public EiHealthClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EiHealthClient> newBuilder() {
        ClientBuilder<EiHealthClient> clientBuilder = new ClientBuilder<>(EiHealthClient::new);
        return clientBuilder;
    }

    /**
     * 数据库追加文件
     *
     * 数据库追加文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDrugDatabaseFileRequest 请求对象
     * @return AddDrugDatabaseFileResponse
     */
    public AddDrugDatabaseFileResponse addDrugDatabaseFile(AddDrugDatabaseFileRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.addDrugDatabaseFile);
    }

    /**
     * 数据库追加文件
     *
     * 数据库追加文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDrugDatabaseFileRequest 请求对象
     * @return SyncInvoker<AddDrugDatabaseFileRequest, AddDrugDatabaseFileResponse>
     */
    public SyncInvoker<AddDrugDatabaseFileRequest, AddDrugDatabaseFileResponse> addDrugDatabaseFileInvoker(
        AddDrugDatabaseFileRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.addDrugDatabaseFile, hcClient);
    }

    /**
     * 批量取消作业
     *
     * 批量取消作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCancelJobRequest 请求对象
     * @return BatchCancelJobResponse
     */
    public BatchCancelJobResponse batchCancelJob(BatchCancelJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchCancelJob);
    }

    /**
     * 批量取消作业
     *
     * 批量取消作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCancelJobRequest 请求对象
     * @return SyncInvoker<BatchCancelJobRequest, BatchCancelJobResponse>
     */
    public SyncInvoker<BatchCancelJobRequest, BatchCancelJobResponse> batchCancelJobInvoker(
        BatchCancelJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchCancelJob, hcClient);
    }

    /**
     * 批量删除项目数据
     *
     * 批量删除项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDataRequest 请求对象
     * @return BatchDeleteDataResponse
     */
    public BatchDeleteDataResponse batchDeleteData(BatchDeleteDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteData);
    }

    /**
     * 批量删除项目数据
     *
     * 批量删除项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDataRequest 请求对象
     * @return SyncInvoker<BatchDeleteDataRequest, BatchDeleteDataResponse>
     */
    public SyncInvoker<BatchDeleteDataRequest, BatchDeleteDataResponse> batchDeleteDataInvoker(
        BatchDeleteDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchDeleteData, hcClient);
    }

    /**
     * 批量删除作业
     *
     * 批量删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobRequest 请求对象
     * @return BatchDeleteJobResponse
     */
    public BatchDeleteJobResponse batchDeleteJob(BatchDeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteJob);
    }

    /**
     * 批量删除作业
     *
     * 批量删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobRequest 请求对象
     * @return SyncInvoker<BatchDeleteJobRequest, BatchDeleteJobResponse>
     */
    public SyncInvoker<BatchDeleteJobRequest, BatchDeleteJobResponse> batchDeleteJobInvoker(
        BatchDeleteJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchDeleteJob, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLabelRequest 请求对象
     * @return BatchDeleteLabelResponse
     */
    public BatchDeleteLabelResponse batchDeleteLabel(BatchDeleteLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteLabel);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLabelRequest 请求对象
     * @return SyncInvoker<BatchDeleteLabelRequest, BatchDeleteLabelResponse>
     */
    public SyncInvoker<BatchDeleteLabelRequest, BatchDeleteLabelResponse> batchDeleteLabelInvoker(
        BatchDeleteLabelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchDeleteLabel, hcClient);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMemberRequest 请求对象
     * @return BatchDeleteMemberResponse
     */
    public BatchDeleteMemberResponse batchDeleteMember(BatchDeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteMember);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMemberRequest 请求对象
     * @return SyncInvoker<BatchDeleteMemberRequest, BatchDeleteMemberResponse>
     */
    public SyncInvoker<BatchDeleteMemberRequest, BatchDeleteMemberResponse> batchDeleteMemberInvoker(
        BatchDeleteMemberRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchDeleteMember, hcClient);
    }

    /**
     * 批量删除通知消息
     *
     * 批量删除通知消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteNoticeRequest 请求对象
     * @return BatchDeleteNoticeResponse
     */
    public BatchDeleteNoticeResponse batchDeleteNotice(BatchDeleteNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteNotice);
    }

    /**
     * 批量删除通知消息
     *
     * 批量删除通知消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteNoticeRequest 请求对象
     * @return SyncInvoker<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse>
     */
    public SyncInvoker<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> batchDeleteNoticeInvoker(
        BatchDeleteNoticeRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchDeleteNotice, hcClient);
    }

    /**
     * 批量删除镜像tag
     *
     * 批量删除镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagRequest 请求对象
     * @return BatchDeleteTagResponse
     */
    public BatchDeleteTagResponse batchDeleteTag(BatchDeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteTag);
    }

    /**
     * 批量删除镜像tag
     *
     * 批量删除镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagRequest, BatchDeleteTagResponse>
     */
    public SyncInvoker<BatchDeleteTagRequest, BatchDeleteTagResponse> batchDeleteTagInvoker(
        BatchDeleteTagRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchDeleteTag, hcClient);
    }

    /**
     * 批量获取资源统计数据
     *
     * 批量获取资源统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDownloadResourceStatDataRequest 请求对象
     * @return BatchDownloadResourceStatDataResponse
     */
    public BatchDownloadResourceStatDataResponse batchDownloadResourceStatData(
        BatchDownloadResourceStatDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDownloadResourceStatData);
    }

    /**
     * 批量获取资源统计数据
     *
     * 批量获取资源统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDownloadResourceStatDataRequest 请求对象
     * @return SyncInvoker<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse>
     */
    public SyncInvoker<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> batchDownloadResourceStatDataInvoker(
        BatchDownloadResourceStatDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchDownloadResourceStatData, hcClient);
    }

    /**
     * 导入应用
     *
     * 批量导入应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportAppRequest 请求对象
     * @return BatchImportAppResponse
     */
    public BatchImportAppResponse batchImportApp(BatchImportAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchImportApp);
    }

    /**
     * 导入应用
     *
     * 批量导入应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportAppRequest 请求对象
     * @return SyncInvoker<BatchImportAppRequest, BatchImportAppResponse>
     */
    public SyncInvoker<BatchImportAppRequest, BatchImportAppResponse> batchImportAppInvoker(
        BatchImportAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchImportApp, hcClient);
    }

    /**
     * 批量重试作业
     *
     * 批量重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRetryJobRequest 请求对象
     * @return BatchRetryJobResponse
     */
    public BatchRetryJobResponse batchRetryJob(BatchRetryJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchRetryJob);
    }

    /**
     * 批量重试作业
     *
     * 批量重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRetryJobRequest 请求对象
     * @return SyncInvoker<BatchRetryJobRequest, BatchRetryJobResponse>
     */
    public SyncInvoker<BatchRetryJobRequest, BatchRetryJobResponse> batchRetryJobInvoker(BatchRetryJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchRetryJob, hcClient);
    }

    /**
     * 设置节点标签
     *
     * 设置节点标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNodeLabelRequest 请求对象
     * @return BatchUpdateNodeLabelResponse
     */
    public BatchUpdateNodeLabelResponse batchUpdateNodeLabel(BatchUpdateNodeLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchUpdateNodeLabel);
    }

    /**
     * 设置节点标签
     *
     * 设置节点标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNodeLabelRequest 请求对象
     * @return SyncInvoker<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse>
     */
    public SyncInvoker<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> batchUpdateNodeLabelInvoker(
        BatchUpdateNodeLabelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchUpdateNodeLabel, hcClient);
    }

    /**
     * 批量更新消息
     *
     * 批量更新消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNoticeRequest 请求对象
     * @return BatchUpdateNoticeResponse
     */
    public BatchUpdateNoticeResponse batchUpdateNotice(BatchUpdateNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchUpdateNotice);
    }

    /**
     * 批量更新消息
     *
     * 批量更新消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateNoticeRequest 请求对象
     * @return SyncInvoker<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse>
     */
    public SyncInvoker<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> batchUpdateNoticeInvoker(
        BatchUpdateNoticeRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.batchUpdateNotice, hcClient);
    }

    /**
     * 取消数据作业
     *
     * 取消数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDataJobRequest 请求对象
     * @return CancelDataJobResponse
     */
    public CancelDataJobResponse cancelDataJob(CancelDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.cancelDataJob);
    }

    /**
     * 取消数据作业
     *
     * 取消数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDataJobRequest 请求对象
     * @return SyncInvoker<CancelDataJobRequest, CancelDataJobResponse>
     */
    public SyncInvoker<CancelDataJobRequest, CancelDataJobResponse> cancelDataJobInvoker(CancelDataJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.cancelDataJob, hcClient);
    }

    /**
     * 取消药物作业
     *
     * 取消药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDrugJobRequest 请求对象
     * @return CancelDrugJobResponse
     */
    public CancelDrugJobResponse cancelDrugJob(CancelDrugJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.cancelDrugJob);
    }

    /**
     * 取消药物作业
     *
     * 取消药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDrugJobRequest 请求对象
     * @return SyncInvoker<CancelDrugJobRequest, CancelDrugJobResponse>
     */
    public SyncInvoker<CancelDrugJobRequest, CancelDrugJobResponse> cancelDrugJobInvoker(CancelDrugJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.cancelDrugJob, hcClient);
    }

    /**
     * 取消或强制停止作业调度
     *
     * 取消或强制作业调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelJobRequest 请求对象
     * @return CancelJobResponse
     */
    public CancelJobResponse cancelJob(CancelJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.cancelJob);
    }

    /**
     * 取消或强制停止作业调度
     *
     * 取消或强制作业调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelJobRequest 请求对象
     * @return SyncInvoker<CancelJobRequest, CancelJobResponse>
     */
    public SyncInvoker<CancelJobRequest, CancelJobResponse> cancelJobInvoker(CancelJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.cancelJob, hcClient);
    }

    /**
     * 修改密码
     *
     * 修改密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordRequest 请求对象
     * @return ChangePasswordResponse
     */
    public ChangePasswordResponse changePassword(ChangePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.changePassword);
    }

    /**
     * 修改密码
     *
     * 修改密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordRequest 请求对象
     * @return SyncInvoker<ChangePasswordRequest, ChangePasswordResponse>
     */
    public SyncInvoker<ChangePasswordRequest, ChangePasswordResponse> changePasswordInvoker(
        ChangePasswordRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.changePassword, hcClient);
    }

    /**
     * 邮箱连通性测试
     *
     * 邮箱连通性测试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEmailConnectionRequest 请求对象
     * @return CheckEmailConnectionResponse
     */
    public CheckEmailConnectionResponse checkEmailConnection(CheckEmailConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.checkEmailConnection);
    }

    /**
     * 邮箱连通性测试
     *
     * 邮箱连通性测试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEmailConnectionRequest 请求对象
     * @return SyncInvoker<CheckEmailConnectionRequest, CheckEmailConnectionResponse>
     */
    public SyncInvoker<CheckEmailConnectionRequest, CheckEmailConnectionResponse> checkEmailConnectionInvoker(
        CheckEmailConnectionRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.checkEmailConnection, hcClient);
    }

    /**
     * 校验token
     *
     * 校验token是否可访问当前环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTokenVerificationRequest 请求对象
     * @return CheckTokenVerificationResponse
     */
    public CheckTokenVerificationResponse checkTokenVerification(CheckTokenVerificationRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.checkTokenVerification);
    }

    /**
     * 校验token
     *
     * 校验token是否可访问当前环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTokenVerificationRequest 请求对象
     * @return SyncInvoker<CheckTokenVerificationRequest, CheckTokenVerificationResponse>
     */
    public SyncInvoker<CheckTokenVerificationRequest, CheckTokenVerificationResponse> checkTokenVerificationInvoker(
        CheckTokenVerificationRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.checkTokenVerification, hcClient);
    }

    /**
     * 复制项目数据
     *
     * 复制项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyDataRequest 请求对象
     * @return CopyDataResponse
     */
    public CopyDataResponse copyData(CopyDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.copyData);
    }

    /**
     * 复制项目数据
     *
     * 复制项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyDataRequest 请求对象
     * @return SyncInvoker<CopyDataRequest, CopyDataResponse>
     */
    public SyncInvoker<CopyDataRequest, CopyDataResponse> copyDataInvoker(CopyDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.copyData, hcClient);
    }

    /**
     * 创建分子属性预测作业
     *
     * 创建分子属性预测作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAdmetJobRequest 请求对象
     * @return CreateAdmetJobResponse
     */
    public CreateAdmetJobResponse createAdmetJob(CreateAdmetJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createAdmetJob);
    }

    /**
     * 创建分子属性预测作业
     *
     * 创建分子属性预测作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAdmetJobRequest 请求对象
     * @return SyncInvoker<CreateAdmetJobRequest, CreateAdmetJobResponse>
     */
    public SyncInvoker<CreateAdmetJobRequest, CreateAdmetJobResponse> createAdmetJobInvoker(
        CreateAdmetJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createAdmetJob, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createApp, hcClient);
    }

    /**
     * 创建自动作业模板
     *
     * 创建自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoJobRequest 请求对象
     * @return CreateAutoJobResponse
     */
    public CreateAutoJobResponse createAutoJob(CreateAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createAutoJob);
    }

    /**
     * 创建自动作业模板
     *
     * 创建自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoJobRequest 请求对象
     * @return SyncInvoker<CreateAutoJobRequest, CreateAutoJobResponse>
     */
    public SyncInvoker<CreateAutoJobRequest, CreateAutoJobResponse> createAutoJobInvoker(CreateAutoJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createAutoJob, hcClient);
    }

    /**
     * 归档数据
     *
     * 将需要归档的重要数据拷贝到数据归档桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackupRequest 请求对象
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createBackup);
    }

    /**
     * 归档数据
     *
     * 将需要归档的重要数据拷贝到数据归档桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackupRequest 请求对象
     * @return SyncInvoker<CreateBackupRequest, CreateBackupResponse>
     */
    public SyncInvoker<CreateBackupRequest, CreateBackupResponse> createBackupInvoker(CreateBackupRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createBackup, hcClient);
    }

    /**
     * 创建分子聚类作业
     *
     * 创建分子聚类作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterJobRequest 请求对象
     * @return CreateClusterJobResponse
     */
    public CreateClusterJobResponse createClusterJob(CreateClusterJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createClusterJob);
    }

    /**
     * 创建分子聚类作业
     *
     * 创建分子聚类作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterJobRequest 请求对象
     * @return SyncInvoker<CreateClusterJobRequest, CreateClusterJobResponse>
     */
    public SyncInvoker<CreateClusterJobRequest, CreateClusterJobResponse> createClusterJobInvoker(
        CreateClusterJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createClusterJob, hcClient);
    }

    /**
     * 创建聚类分析作业
     *
     * 创建聚类分析作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusteringJobRequest 请求对象
     * @return CreateClusteringJobResponse
     */
    public CreateClusteringJobResponse createClusteringJob(CreateClusteringJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createClusteringJob);
    }

    /**
     * 创建聚类分析作业
     *
     * 创建聚类分析作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusteringJobRequest 请求对象
     * @return SyncInvoker<CreateClusteringJobRequest, CreateClusteringJobResponse>
     */
    public SyncInvoker<CreateClusteringJobRequest, CreateClusteringJobResponse> createClusteringJobInvoker(
        CreateClusteringJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createClusteringJob, hcClient);
    }

    /**
     * 发送验证码
     *
     * 发送验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeRequest 请求对象
     * @return CreateCodeResponse
     */
    public CreateCodeResponse createCode(CreateCodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createCode);
    }

    /**
     * 发送验证码
     *
     * 发送验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeRequest 请求对象
     * @return SyncInvoker<CreateCodeRequest, CreateCodeResponse>
     */
    public SyncInvoker<CreateCodeRequest, CreateCodeResponse> createCodeInvoker(CreateCodeRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createCode, hcClient);
    }

    /**
     * 绑定计算集群
     *
     * 绑定计算集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComputingClusterRequest 请求对象
     * @return CreateComputingClusterResponse
     */
    public CreateComputingClusterResponse createComputingCluster(CreateComputingClusterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createComputingCluster);
    }

    /**
     * 绑定计算集群
     *
     * 绑定计算集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComputingClusterRequest 请求对象
     * @return SyncInvoker<CreateComputingClusterRequest, CreateComputingClusterResponse>
     */
    public SyncInvoker<CreateComputingClusterRequest, CreateComputingClusterResponse> createComputingClusterInvoker(
        CreateComputingClusterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createComputingCluster, hcClient);
    }

    /**
     * 购买计算资源
     *
     * 购买计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComputingResourceRequest 请求对象
     * @return CreateComputingResourceResponse
     */
    public CreateComputingResourceResponse createComputingResource(CreateComputingResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createComputingResource);
    }

    /**
     * 购买计算资源
     *
     * 购买计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComputingResourceRequest 请求对象
     * @return SyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>
     */
    public SyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResourceInvoker(
        CreateComputingResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createComputingResource, hcClient);
    }

    /**
     * 创建文件夹
     *
     * 创建文件夹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataRequest 请求对象
     * @return CreateDataResponse
     */
    public CreateDataResponse createData(CreateDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createData);
    }

    /**
     * 创建文件夹
     *
     * 创建文件夹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataRequest 请求对象
     * @return SyncInvoker<CreateDataRequest, CreateDataResponse>
     */
    public SyncInvoker<CreateDataRequest, CreateDataResponse> createDataInvoker(CreateDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createData, hcClient);
    }

    /**
     * 插入单条数据
     *
     * 插入单条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseDataRequest 请求对象
     * @return CreateDatabaseDataResponse
     */
    public CreateDatabaseDataResponse createDatabaseData(CreateDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDatabaseData);
    }

    /**
     * 插入单条数据
     *
     * 插入单条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseDataRequest 请求对象
     * @return SyncInvoker<CreateDatabaseDataRequest, CreateDatabaseDataResponse>
     */
    public SyncInvoker<CreateDatabaseDataRequest, CreateDatabaseDataResponse> createDatabaseDataInvoker(
        CreateDatabaseDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDatabaseData, hcClient);
    }

    /**
     * 购买数据库资源
     *
     * 购买数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseResourceRequest 请求对象
     * @return CreateDatabaseResourceResponse
     */
    public CreateDatabaseResourceResponse createDatabaseResource(CreateDatabaseResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDatabaseResource);
    }

    /**
     * 购买数据库资源
     *
     * 购买数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseResourceRequest 请求对象
     * @return SyncInvoker<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse>
     */
    public SyncInvoker<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> createDatabaseResourceInvoker(
        CreateDatabaseResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDatabaseResource, hcClient);
    }

    /**
     * 创建分子对接作业
     *
     * 创建分子对接作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDockingJobRequest 请求对象
     * @return CreateDockingJobResponse
     */
    public CreateDockingJobResponse createDockingJob(CreateDockingJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDockingJob);
    }

    /**
     * 创建分子对接作业
     *
     * 创建分子对接作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDockingJobRequest 请求对象
     * @return SyncInvoker<CreateDockingJobRequest, CreateDockingJobResponse>
     */
    public SyncInvoker<CreateDockingJobRequest, CreateDockingJobResponse> createDockingJobInvoker(
        CreateDockingJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDockingJob, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugDatabaseRequest 请求对象
     * @return CreateDrugDatabaseResponse
     */
    public CreateDrugDatabaseResponse createDrugDatabase(CreateDrugDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDrugDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDrugDatabaseRequest, CreateDrugDatabaseResponse>
     */
    public SyncInvoker<CreateDrugDatabaseRequest, CreateDrugDatabaseResponse> createDrugDatabaseInvoker(
        CreateDrugDatabaseRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDrugDatabase, hcClient);
    }

    /**
     * 创建模型
     *
     * 创建模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugModelRequest 请求对象
     * @return CreateDrugModelResponse
     */
    public CreateDrugModelResponse createDrugModel(CreateDrugModelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDrugModel);
    }

    /**
     * 创建模型
     *
     * 创建模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugModelRequest 请求对象
     * @return SyncInvoker<CreateDrugModelRequest, CreateDrugModelResponse>
     */
    public SyncInvoker<CreateDrugModelRequest, CreateDrugModelResponse> createDrugModelInvoker(
        CreateDrugModelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDrugModel, hcClient);
    }

    /**
     * 创建盘古药物分子大模型
     *
     * 创建盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugModelResourceRequest 请求对象
     * @return CreateDrugModelResourceResponse
     */
    public CreateDrugModelResourceResponse createDrugModelResource(CreateDrugModelResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDrugModelResource);
    }

    /**
     * 创建盘古药物分子大模型
     *
     * 创建盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugModelResourceRequest 请求对象
     * @return SyncInvoker<CreateDrugModelResourceRequest, CreateDrugModelResourceResponse>
     */
    public SyncInvoker<CreateDrugModelResourceRequest, CreateDrugModelResourceResponse> createDrugModelResourceInvoker(
        CreateDrugModelResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDrugModelResource, hcClient);
    }

    /**
     * 添加收藏
     *
     * 添加收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFavoriteRequest 请求对象
     * @return CreateFavoriteResponse
     */
    public CreateFavoriteResponse createFavorite(CreateFavoriteRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createFavorite);
    }

    /**
     * 添加收藏
     *
     * 添加收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFavoriteRequest 请求对象
     * @return SyncInvoker<CreateFavoriteRequest, CreateFavoriteResponse>
     */
    public SyncInvoker<CreateFavoriteRequest, CreateFavoriteResponse> createFavoriteInvoker(
        CreateFavoriteRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createFavorite, hcClient);
    }

    /**
     * 创建自由能微扰作业
     *
     * 创建自由能微扰作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFepJobRequest 请求对象
     * @return CreateFepJobResponse
     */
    public CreateFepJobResponse createFepJob(CreateFepJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createFepJob);
    }

    /**
     * 创建自由能微扰作业
     *
     * 创建自由能微扰作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFepJobRequest 请求对象
     * @return SyncInvoker<CreateFepJobRequest, CreateFepJobResponse>
     */
    public SyncInvoker<CreateFepJobRequest, CreateFepJobResponse> createFepJobInvoker(CreateFepJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createFepJob, hcClient);
    }

    /**
     * 创建分子生成作业
     *
     * 创建分子生成作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGenJobRequest 请求对象
     * @return CreateGenJobResponse
     */
    public CreateGenJobResponse createGenJob(CreateGenJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createGenJob);
    }

    /**
     * 创建分子生成作业
     *
     * 创建分子生成作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGenJobRequest 请求对象
     * @return SyncInvoker<CreateGenJobRequest, CreateGenJobResponse>
     */
    public SyncInvoker<CreateGenJobRequest, CreateGenJobResponse> createGenJobInvoker(CreateGenJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createGenJob, hcClient);
    }

    /**
     * 创建镜像
     *
     * 创建镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageRequest 请求对象
     * @return CreateImageResponse
     */
    public CreateImageResponse createImage(CreateImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createImage);
    }

    /**
     * 创建镜像
     *
     * 创建镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageRequest 请求对象
     * @return SyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public SyncInvoker<CreateImageRequest, CreateImageResponse> createImageInvoker(CreateImageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createImage, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createInstance, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelRequest 请求对象
     * @return CreateLabelResponse
     */
    public CreateLabelResponse createLabel(CreateLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createLabel);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelRequest 请求对象
     * @return SyncInvoker<CreateLabelRequest, CreateLabelResponse>
     */
    public SyncInvoker<CreateLabelRequest, CreateLabelResponse> createLabelInvoker(CreateLabelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createLabel, hcClient);
    }

    /**
     * 创建标签页面
     *
     * 创建标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelPageRequest 请求对象
     * @return CreateLabelPageResponse
     */
    public CreateLabelPageResponse createLabelPage(CreateLabelPageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createLabelPage);
    }

    /**
     * 创建标签页面
     *
     * 创建标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelPageRequest 请求对象
     * @return SyncInvoker<CreateLabelPageRequest, CreateLabelPageResponse>
     */
    public SyncInvoker<CreateLabelPageRequest, CreateLabelPageResponse> createLabelPageInvoker(
        CreateLabelPageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createLabelPage, hcClient);
    }

    /**
     * 创建分子或分子复合物批量下载任务
     *
     * 创建分子或分子复合物批量下载任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMolBatchDownloadTaskRequest 请求对象
     * @return CreateMolBatchDownloadTaskResponse
     */
    public CreateMolBatchDownloadTaskResponse createMolBatchDownloadTask(CreateMolBatchDownloadTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createMolBatchDownloadTask);
    }

    /**
     * 创建分子或分子复合物批量下载任务
     *
     * 创建分子或分子复合物批量下载任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMolBatchDownloadTaskRequest 请求对象
     * @return SyncInvoker<CreateMolBatchDownloadTaskRequest, CreateMolBatchDownloadTaskResponse>
     */
    public SyncInvoker<CreateMolBatchDownloadTaskRequest, CreateMolBatchDownloadTaskResponse> createMolBatchDownloadTaskInvoker(
        CreateMolBatchDownloadTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createMolBatchDownloadTask, hcClient);
    }

    /**
     * 单分子预对接
     *
     * 单分子预对接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMolDockingJobRequest 请求对象
     * @return CreateMolDockingJobResponse
     */
    public CreateMolDockingJobResponse createMolDockingJob(CreateMolDockingJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createMolDockingJob);
    }

    /**
     * 单分子预对接
     *
     * 单分子预对接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMolDockingJobRequest 请求对象
     * @return SyncInvoker<CreateMolDockingJobRequest, CreateMolDockingJobResponse>
     */
    public SyncInvoker<CreateMolDockingJobRequest, CreateMolDockingJobResponse> createMolDockingJobInvoker(
        CreateMolDockingJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createMolDockingJob, hcClient);
    }

    /**
     * 创建分子优化作业
     *
     * 创建分子优化作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOptmJobRequest 请求对象
     * @return CreateOptmJobResponse
     */
    public CreateOptmJobResponse createOptmJob(CreateOptmJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createOptmJob);
    }

    /**
     * 创建分子优化作业
     *
     * 创建分子优化作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOptmJobRequest 请求对象
     * @return SyncInvoker<CreateOptmJobRequest, CreateOptmJobResponse>
     */
    public SyncInvoker<CreateOptmJobRequest, CreateOptmJobResponse> createOptmJobInvoker(CreateOptmJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createOptmJob, hcClient);
    }

    /**
     * 购买性能加速资源
     *
     * 购买性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePerformanceResourceRequest 请求对象
     * @return CreatePerformanceResourceResponse
     */
    public CreatePerformanceResourceResponse createPerformanceResource(CreatePerformanceResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createPerformanceResource);
    }

    /**
     * 购买性能加速资源
     *
     * 购买性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePerformanceResourceRequest 请求对象
     * @return SyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse>
     */
    public SyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> createPerformanceResourceInvoker(
        CreatePerformanceResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createPerformanceResource, hcClient);
    }

    /**
     * 创建靶点口袋发现作业
     *
     * 创建靶点口袋发现作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePocketDetectionJobRequest 请求对象
     * @return CreatePocketDetectionJobResponse
     */
    public CreatePocketDetectionJobResponse createPocketDetectionJob(CreatePocketDetectionJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createPocketDetectionJob);
    }

    /**
     * 创建靶点口袋发现作业
     *
     * 创建靶点口袋发现作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePocketDetectionJobRequest 请求对象
     * @return SyncInvoker<CreatePocketDetectionJobRequest, CreatePocketDetectionJobResponse>
     */
    public SyncInvoker<CreatePocketDetectionJobRequest, CreatePocketDetectionJobResponse> createPocketDetectionJobInvoker(
        CreatePocketDetectionJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createPocketDetectionJob, hcClient);
    }

    /**
     * 创建靶点口袋分子设计作业
     *
     * 创建靶点口袋分子设计作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePocketMolDesignJobRequest 请求对象
     * @return CreatePocketMolDesignJobResponse
     */
    public CreatePocketMolDesignJobResponse createPocketMolDesignJob(CreatePocketMolDesignJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createPocketMolDesignJob);
    }

    /**
     * 创建靶点口袋分子设计作业
     *
     * 创建靶点口袋分子设计作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePocketMolDesignJobRequest 请求对象
     * @return SyncInvoker<CreatePocketMolDesignJobRequest, CreatePocketMolDesignJobResponse>
     */
    public SyncInvoker<CreatePocketMolDesignJobRequest, CreatePocketMolDesignJobResponse> createPocketMolDesignJobInvoker(
        CreatePocketMolDesignJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createPocketMolDesignJob, hcClient);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRequest 请求对象
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createProject);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRequest 请求对象
     * @return SyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public SyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectInvoker(CreateProjectRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createProject, hcClient);
    }

    /**
     * 创建扩容策略
     *
     * 创建扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScaleOutPolicyRequest 请求对象
     * @return CreateScaleOutPolicyResponse
     */
    public CreateScaleOutPolicyResponse createScaleOutPolicy(CreateScaleOutPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createScaleOutPolicy);
    }

    /**
     * 创建扩容策略
     *
     * 创建扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScaleOutPolicyRequest 请求对象
     * @return SyncInvoker<CreateScaleOutPolicyRequest, CreateScaleOutPolicyResponse>
     */
    public SyncInvoker<CreateScaleOutPolicyRequest, CreateScaleOutPolicyResponse> createScaleOutPolicyInvoker(
        CreateScaleOutPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createScaleOutPolicy, hcClient);
    }

    /**
     * 创建分子搜索作业
     *
     * 创建分子搜索作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchJobRequest 请求对象
     * @return CreateSearchJobResponse
     */
    public CreateSearchJobResponse createSearchJob(CreateSearchJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createSearchJob);
    }

    /**
     * 创建分子搜索作业
     *
     * 创建分子搜索作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchJobRequest 请求对象
     * @return SyncInvoker<CreateSearchJobRequest, CreateSearchJobResponse>
     */
    public SyncInvoker<CreateSearchJobRequest, CreateSearchJobResponse> createSearchJobInvoker(
        CreateSearchJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createSearchJob, hcClient);
    }

    /**
     * 创建study
     *
     * 创建study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStudyRequest 请求对象
     * @return CreateStudyResponse
     */
    public CreateStudyResponse createStudy(CreateStudyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createStudy);
    }

    /**
     * 创建study
     *
     * 创建study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStudyRequest 请求对象
     * @return SyncInvoker<CreateStudyRequest, CreateStudyResponse>
     */
    public SyncInvoker<CreateStudyRequest, CreateStudyResponse> createStudyInvoker(CreateStudyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createStudy, hcClient);
    }

    /**
     * 创建study作业
     *
     * 创建study作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStudyJobRequest 请求对象
     * @return CreateStudyJobResponse
     */
    public CreateStudyJobResponse createStudyJob(CreateStudyJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createStudyJob);
    }

    /**
     * 创建study作业
     *
     * 创建study作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStudyJobRequest 请求对象
     * @return SyncInvoker<CreateStudyJobRequest, CreateStudyJobResponse>
     */
    public SyncInvoker<CreateStudyJobRequest, CreateStudyJobResponse> createStudyJobInvoker(
        CreateStudyJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createStudyJob, hcClient);
    }

    /**
     * 创建分子合成路径规划作业
     *
     * 创建分子合成路径规划作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSynthesisJobRequest 请求对象
     * @return CreateSynthesisJobResponse
     */
    public CreateSynthesisJobResponse createSynthesisJob(CreateSynthesisJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createSynthesisJob);
    }

    /**
     * 创建分子合成路径规划作业
     *
     * 创建分子合成路径规划作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSynthesisJobRequest 请求对象
     * @return SyncInvoker<CreateSynthesisJobRequest, CreateSynthesisJobResponse>
     */
    public SyncInvoker<CreateSynthesisJobRequest, CreateSynthesisJobResponse> createSynthesisJobInvoker(
        CreateSynthesisJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createSynthesisJob, hcClient);
    }

    /**
     * 创建靶点优化作业
     *
     * 创建靶点优化作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTargetOptJobRequest 请求对象
     * @return CreateTargetOptJobResponse
     */
    public CreateTargetOptJobResponse createTargetOptJob(CreateTargetOptJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createTargetOptJob);
    }

    /**
     * 创建靶点优化作业
     *
     * 创建靶点优化作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTargetOptJobRequest 请求对象
     * @return SyncInvoker<CreateTargetOptJobRequest, CreateTargetOptJobResponse>
     */
    public SyncInvoker<CreateTargetOptJobRequest, CreateTargetOptJobResponse> createTargetOptJobInvoker(
        CreateTargetOptJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createTargetOptJob, hcClient);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createTemplate);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createTemplate, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createUser, hcClient);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createWorkflow);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(
        CreateWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createWorkflow, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteApp, hcClient);
    }

    /**
     * 删除资产指定版本
     *
     * 删除资产指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetVersionRequest 请求对象
     * @return DeleteAssetVersionResponse
     */
    public DeleteAssetVersionResponse deleteAssetVersion(DeleteAssetVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteAssetVersion);
    }

    /**
     * 删除资产指定版本
     *
     * 删除资产指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetVersionRequest 请求对象
     * @return SyncInvoker<DeleteAssetVersionRequest, DeleteAssetVersionResponse>
     */
    public SyncInvoker<DeleteAssetVersionRequest, DeleteAssetVersionResponse> deleteAssetVersionInvoker(
        DeleteAssetVersionRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteAssetVersion, hcClient);
    }

    /**
     * 删除自动作业模板
     *
     * 删除自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoJobRequest 请求对象
     * @return DeleteAutoJobResponse
     */
    public DeleteAutoJobResponse deleteAutoJob(DeleteAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteAutoJob);
    }

    /**
     * 删除自动作业模板
     *
     * 删除自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoJobRequest 请求对象
     * @return SyncInvoker<DeleteAutoJobRequest, DeleteAutoJobResponse>
     */
    public SyncInvoker<DeleteAutoJobRequest, DeleteAutoJobResponse> deleteAutoJobInvoker(DeleteAutoJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteAutoJob, hcClient);
    }

    /**
     * 删除归档
     *
     * 删除指定的归档
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteBackup);
    }

    /**
     * 删除归档
     *
     * 删除指定的归档
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public SyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupInvoker(DeleteBackupRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteBackup, hcClient);
    }

    /**
     * 解绑计算集群
     *
     * 解绑计算集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComputingClusterRequest 请求对象
     * @return DeleteComputingClusterResponse
     */
    public DeleteComputingClusterResponse deleteComputingCluster(DeleteComputingClusterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteComputingCluster);
    }

    /**
     * 解绑计算集群
     *
     * 解绑计算集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComputingClusterRequest 请求对象
     * @return SyncInvoker<DeleteComputingClusterRequest, DeleteComputingClusterResponse>
     */
    public SyncInvoker<DeleteComputingClusterRequest, DeleteComputingClusterResponse> deleteComputingClusterInvoker(
        DeleteComputingClusterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteComputingCluster, hcClient);
    }

    /**
     * 删除计算资源
     *
     * 删除计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComputingResourceRequest 请求对象
     * @return DeleteComputingResourceResponse
     */
    public DeleteComputingResourceResponse deleteComputingResource(DeleteComputingResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteComputingResource);
    }

    /**
     * 删除计算资源
     *
     * 删除计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComputingResourceRequest 请求对象
     * @return SyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>
     */
    public SyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResourceInvoker(
        DeleteComputingResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteComputingResource, hcClient);
    }

    /**
     * 删除数据作业
     *
     * 删除数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataJobRequest 请求对象
     * @return DeleteDataJobResponse
     */
    public DeleteDataJobResponse deleteDataJob(DeleteDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDataJob);
    }

    /**
     * 删除数据作业
     *
     * 删除数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataJobRequest 请求对象
     * @return SyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse>
     */
    public SyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse> deleteDataJobInvoker(DeleteDataJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDataJob, hcClient);
    }

    /**
     * 删除数据
     *
     * 删除指定行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseDataRequest 请求对象
     * @return DeleteDatabaseDataResponse
     */
    public DeleteDatabaseDataResponse deleteDatabaseData(DeleteDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDatabaseData);
    }

    /**
     * 删除数据
     *
     * 删除指定行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseDataRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse>
     */
    public SyncInvoker<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> deleteDatabaseDataInvoker(
        DeleteDatabaseDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDatabaseData, hcClient);
    }

    /**
     * 删除数据库资源
     *
     * 删除数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseResourceRequest 请求对象
     * @return DeleteDatabaseResourceResponse
     */
    public DeleteDatabaseResourceResponse deleteDatabaseResource(DeleteDatabaseResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDatabaseResource);
    }

    /**
     * 删除数据库资源
     *
     * 删除数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseResourceRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse>
     */
    public SyncInvoker<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> deleteDatabaseResourceInvoker(
        DeleteDatabaseResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDatabaseResource, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugDatabaseRequest 请求对象
     * @return DeleteDrugDatabaseResponse
     */
    public DeleteDrugDatabaseResponse deleteDrugDatabase(DeleteDrugDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDrugDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDrugDatabaseRequest, DeleteDrugDatabaseResponse>
     */
    public SyncInvoker<DeleteDrugDatabaseRequest, DeleteDrugDatabaseResponse> deleteDrugDatabaseInvoker(
        DeleteDrugDatabaseRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDrugDatabase, hcClient);
    }

    /**
     * 删除药物作业
     *
     * 删除药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugJobRequest 请求对象
     * @return DeleteDrugJobResponse
     */
    public DeleteDrugJobResponse deleteDrugJob(DeleteDrugJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDrugJob);
    }

    /**
     * 删除药物作业
     *
     * 删除药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugJobRequest 请求对象
     * @return SyncInvoker<DeleteDrugJobRequest, DeleteDrugJobResponse>
     */
    public SyncInvoker<DeleteDrugJobRequest, DeleteDrugJobResponse> deleteDrugJobInvoker(DeleteDrugJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDrugJob, hcClient);
    }

    /**
     * 删除模型
     *
     * 删除模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugModelRequest 请求对象
     * @return DeleteDrugModelResponse
     */
    public DeleteDrugModelResponse deleteDrugModel(DeleteDrugModelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDrugModel);
    }

    /**
     * 删除模型
     *
     * 删除模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugModelRequest 请求对象
     * @return SyncInvoker<DeleteDrugModelRequest, DeleteDrugModelResponse>
     */
    public SyncInvoker<DeleteDrugModelRequest, DeleteDrugModelResponse> deleteDrugModelInvoker(
        DeleteDrugModelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDrugModel, hcClient);
    }

    /**
     * 退订盘古药物分子大模型
     *
     * 退订盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugModelResourceRequest 请求对象
     * @return DeleteDrugModelResourceResponse
     */
    public DeleteDrugModelResourceResponse deleteDrugModelResource(DeleteDrugModelResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDrugModelResource);
    }

    /**
     * 退订盘古药物分子大模型
     *
     * 退订盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugModelResourceRequest 请求对象
     * @return SyncInvoker<DeleteDrugModelResourceRequest, DeleteDrugModelResourceResponse>
     */
    public SyncInvoker<DeleteDrugModelResourceRequest, DeleteDrugModelResourceResponse> deleteDrugModelResourceInvoker(
        DeleteDrugModelResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDrugModelResource, hcClient);
    }

    /**
     * 取消收藏
     *
     * 取消收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFavoriteRequest 请求对象
     * @return DeleteFavoriteResponse
     */
    public DeleteFavoriteResponse deleteFavorite(DeleteFavoriteRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteFavorite);
    }

    /**
     * 取消收藏
     *
     * 取消收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFavoriteRequest 请求对象
     * @return SyncInvoker<DeleteFavoriteRequest, DeleteFavoriteResponse>
     */
    public SyncInvoker<DeleteFavoriteRequest, DeleteFavoriteResponse> deleteFavoriteInvoker(
        DeleteFavoriteRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteFavorite, hcClient);
    }

    /**
     * 删除镜像仓库
     *
     * 删除镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageRequest 请求对象
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteImage);
    }

    /**
     * 删除镜像仓库
     *
     * 删除镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageRequest 请求对象
     * @return SyncInvoker<DeleteImageRequest, DeleteImageResponse>
     */
    public SyncInvoker<DeleteImageRequest, DeleteImageResponse> deleteImageInvoker(DeleteImageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteImage, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteInstance, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteJob, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelRequest 请求对象
     * @return DeleteLabelResponse
     */
    public DeleteLabelResponse deleteLabel(DeleteLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteLabel);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelRequest 请求对象
     * @return SyncInvoker<DeleteLabelRequest, DeleteLabelResponse>
     */
    public SyncInvoker<DeleteLabelRequest, DeleteLabelResponse> deleteLabelInvoker(DeleteLabelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteLabel, hcClient);
    }

    /**
     * 删除标签页面
     *
     * 删除标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelPageRequest 请求对象
     * @return DeleteLabelPageResponse
     */
    public DeleteLabelPageResponse deleteLabelPage(DeleteLabelPageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteLabelPage);
    }

    /**
     * 删除标签页面
     *
     * 删除标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelPageRequest 请求对象
     * @return SyncInvoker<DeleteLabelPageRequest, DeleteLabelPageResponse>
     */
    public SyncInvoker<DeleteLabelPageRequest, DeleteLabelPageResponse> deleteLabelPageInvoker(
        DeleteLabelPageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteLabelPage, hcClient);
    }

    /**
     * 移除项目成员
     *
     * 移除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteMember);
    }

    /**
     * 移除项目成员
     *
     * 移除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteMember, hcClient);
    }

    /**
     * 删除消息邮件配置
     *
     * 删除消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageEmailConfigRequest 请求对象
     * @return DeleteMessageEmailConfigResponse
     */
    public DeleteMessageEmailConfigResponse deleteMessageEmailConfig(DeleteMessageEmailConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteMessageEmailConfig);
    }

    /**
     * 删除消息邮件配置
     *
     * 删除消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageEmailConfigRequest 请求对象
     * @return SyncInvoker<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse>
     */
    public SyncInvoker<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> deleteMessageEmailConfigInvoker(
        DeleteMessageEmailConfigRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteMessageEmailConfig, hcClient);
    }

    /**
     * 删除性能加速资源
     *
     * 删除性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePerformanceResourceRequest 请求对象
     * @return DeletePerformanceResourceResponse
     */
    public DeletePerformanceResourceResponse deletePerformanceResource(DeletePerformanceResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deletePerformanceResource);
    }

    /**
     * 删除性能加速资源
     *
     * 删除性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePerformanceResourceRequest 请求对象
     * @return SyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse>
     */
    public SyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> deletePerformanceResourceInvoker(
        DeletePerformanceResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deletePerformanceResource, hcClient);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectRequest 请求对象
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteProject);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectRequest 请求对象
     * @return SyncInvoker<DeleteProjectRequest, DeleteProjectResponse>
     */
    public SyncInvoker<DeleteProjectRequest, DeleteProjectResponse> deleteProjectInvoker(DeleteProjectRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteProject, hcClient);
    }

    /**
     * 删除扩容策略
     *
     * 删除扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScaleOutPolicyRequest 请求对象
     * @return DeleteScaleOutPolicyResponse
     */
    public DeleteScaleOutPolicyResponse deleteScaleOutPolicy(DeleteScaleOutPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteScaleOutPolicy);
    }

    /**
     * 删除扩容策略
     *
     * 删除扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScaleOutPolicyRequest 请求对象
     * @return SyncInvoker<DeleteScaleOutPolicyRequest, DeleteScaleOutPolicyResponse>
     */
    public SyncInvoker<DeleteScaleOutPolicyRequest, DeleteScaleOutPolicyResponse> deleteScaleOutPolicyInvoker(
        DeleteScaleOutPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteScaleOutPolicy, hcClient);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRequest 请求对象
     * @return DeleteStarResponse
     */
    public DeleteStarResponse deleteStar(DeleteStarRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteStar);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRequest 请求对象
     * @return SyncInvoker<DeleteStarRequest, DeleteStarResponse>
     */
    public SyncInvoker<DeleteStarRequest, DeleteStarResponse> deleteStarInvoker(DeleteStarRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteStar, hcClient);
    }

    /**
     * 删除study
     *
     * 删除study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStudyRequest 请求对象
     * @return DeleteStudyResponse
     */
    public DeleteStudyResponse deleteStudy(DeleteStudyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteStudy);
    }

    /**
     * 删除study
     *
     * 删除study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStudyRequest 请求对象
     * @return SyncInvoker<DeleteStudyRequest, DeleteStudyResponse>
     */
    public SyncInvoker<DeleteStudyRequest, DeleteStudyResponse> deleteStudyInvoker(DeleteStudyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteStudy, hcClient);
    }

    /**
     * 删除指定镜像tag
     *
     * 删除指定镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteTag);
    }

    /**
     * 删除指定镜像tag
     *
     * 删除指定镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteTag, hcClient);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteTemplate);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteTemplate, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteUser, hcClient);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteWorkflow);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowInvoker(
        DeleteWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteWorkflow, hcClient);
    }

    /**
     * 下载数据作业执行日志
     *
     * 下载数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDataJobLogRequest 请求对象
     * @return DownloadDataJobLogResponse
     */
    public DownloadDataJobLogResponse downloadDataJobLog(DownloadDataJobLogRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.downloadDataJobLog);
    }

    /**
     * 下载数据作业执行日志
     *
     * 下载数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDataJobLogRequest 请求对象
     * @return SyncInvoker<DownloadDataJobLogRequest, DownloadDataJobLogResponse>
     */
    public SyncInvoker<DownloadDataJobLogRequest, DownloadDataJobLogResponse> downloadDataJobLogInvoker(
        DownloadDataJobLogRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.downloadDataJobLog, hcClient);
    }

    /**
     * 下载近一万条审计日志
     *
     * 下载近一万条审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDataTraceRequest 请求对象
     * @return DownloadDataTraceResponse
     */
    public DownloadDataTraceResponse downloadDataTrace(DownloadDataTraceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.downloadDataTrace);
    }

    /**
     * 下载近一万条审计日志
     *
     * 下载近一万条审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDataTraceRequest 请求对象
     * @return SyncInvoker<DownloadDataTraceRequest, DownloadDataTraceResponse>
     */
    public SyncInvoker<DownloadDataTraceRequest, DownloadDataTraceResponse> downloadDataTraceInvoker(
        DownloadDataTraceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.downloadDataTrace, hcClient);
    }

    /**
     * 操作资产发布状态
     *
     * 操作资产发布状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteAssetActionRequest 请求对象
     * @return ExecuteAssetActionResponse
     */
    public ExecuteAssetActionResponse executeAssetAction(ExecuteAssetActionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.executeAssetAction);
    }

    /**
     * 操作资产发布状态
     *
     * 操作资产发布状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteAssetActionRequest 请求对象
     * @return SyncInvoker<ExecuteAssetActionRequest, ExecuteAssetActionResponse>
     */
    public SyncInvoker<ExecuteAssetActionRequest, ExecuteAssetActionResponse> executeAssetActionInvoker(
        ExecuteAssetActionRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.executeAssetAction, hcClient);
    }

    /**
     * 启动作业
     *
     * 启动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return ExecuteJobResponse
     */
    public ExecuteJobResponse executeJob(ExecuteJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.executeJob);
    }

    /**
     * 启动作业
     *
     * 启动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return SyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public SyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobInvoker(ExecuteJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.executeJob, hcClient);
    }

    /**
     * 将传入的蛋白和小分子拼接成复合物结构
     *
     * 将传入的蛋白和小分子拼接成复合物结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateComplexCombineRequest 请求对象
     * @return GenerateComplexCombineResponse
     */
    public GenerateComplexCombineResponse generateComplexCombine(GenerateComplexCombineRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.generateComplexCombine);
    }

    /**
     * 将传入的蛋白和小分子拼接成复合物结构
     *
     * 将传入的蛋白和小分子拼接成复合物结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateComplexCombineRequest 请求对象
     * @return SyncInvoker<GenerateComplexCombineRequest, GenerateComplexCombineResponse>
     */
    public SyncInvoker<GenerateComplexCombineRequest, GenerateComplexCombineResponse> generateComplexCombineInvoker(
        GenerateComplexCombineRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.generateComplexCombine, hcClient);
    }

    /**
     * 根据center、size、padding参数生成可渲染的口袋文件内容
     *
     * 根据center、size、padding参数生成可渲染的口袋文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GeneratePocketFileRequest 请求对象
     * @return GeneratePocketFileResponse
     */
    public GeneratePocketFileResponse generatePocketFile(GeneratePocketFileRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.generatePocketFile);
    }

    /**
     * 根据center、size、padding参数生成可渲染的口袋文件内容
     *
     * 根据center、size、padding参数生成可渲染的口袋文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GeneratePocketFileRequest 请求对象
     * @return SyncInvoker<GeneratePocketFileRequest, GeneratePocketFileResponse>
     */
    public SyncInvoker<GeneratePocketFileRequest, GeneratePocketFileResponse> generatePocketFileInvoker(
        GeneratePocketFileRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.generatePocketFile, hcClient);
    }

    /**
     * 根据表面离散点坐标集生成可渲染的文件内容
     *
     * 根据表面离散点坐标集生成可渲染的文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateSurfacePointsRequest 请求对象
     * @return GenerateSurfacePointsResponse
     */
    public GenerateSurfacePointsResponse generateSurfacePoints(GenerateSurfacePointsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.generateSurfacePoints);
    }

    /**
     * 根据表面离散点坐标集生成可渲染的文件内容
     *
     * 根据表面离散点坐标集生成可渲染的文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateSurfacePointsRequest 请求对象
     * @return SyncInvoker<GenerateSurfacePointsRequest, GenerateSurfacePointsResponse>
     */
    public SyncInvoker<GenerateSurfacePointsRequest, GenerateSurfacePointsResponse> generateSurfacePointsInvoker(
        GenerateSurfacePointsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.generateSurfacePoints, hcClient);
    }

    /**
     * 导入项目数据
     *
     * 导入项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataRequest 请求对象
     * @return ImportDataResponse
     */
    public ImportDataResponse importData(ImportDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importData);
    }

    /**
     * 导入项目数据
     *
     * 导入项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataRequest 请求对象
     * @return SyncInvoker<ImportDataRequest, ImportDataResponse>
     */
    public SyncInvoker<ImportDataRequest, ImportDataResponse> importDataInvoker(ImportDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.importData, hcClient);
    }

    /**
     * 导入数据
     *
     * 导入数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDatabaseDataRequest 请求对象
     * @return ImportDatabaseDataResponse
     */
    public ImportDatabaseDataResponse importDatabaseData(ImportDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importDatabaseData);
    }

    /**
     * 导入数据
     *
     * 导入数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDatabaseDataRequest 请求对象
     * @return SyncInvoker<ImportDatabaseDataRequest, ImportDatabaseDataResponse>
     */
    public SyncInvoker<ImportDatabaseDataRequest, ImportDatabaseDataResponse> importDatabaseDataInvoker(
        ImportDatabaseDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.importDatabaseData, hcClient);
    }

    /**
     * 导入镜像
     *
     * 导入镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportImageRequest 请求对象
     * @return ImportImageResponse
     */
    public ImportImageResponse importImage(ImportImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importImage);
    }

    /**
     * 导入镜像
     *
     * 导入镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportImageRequest 请求对象
     * @return SyncInvoker<ImportImageRequest, ImportImageResponse>
     */
    public SyncInvoker<ImportImageRequest, ImportImageResponse> importImageInvoker(ImportImageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.importImage, hcClient);
    }

    /**
     * 导入网上数据
     *
     * 导入网上数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportNetworkDataRequest 请求对象
     * @return ImportNetworkDataResponse
     */
    public ImportNetworkDataResponse importNetworkData(ImportNetworkDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importNetworkData);
    }

    /**
     * 导入网上数据
     *
     * 导入网上数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportNetworkDataRequest 请求对象
     * @return SyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse>
     */
    public SyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse> importNetworkDataInvoker(
        ImportNetworkDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.importNetworkData, hcClient);
    }

    /**
     * 从其他项目导入模板
     *
     * 从其他项目导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportTemplateRequest 请求对象
     * @return ImportTemplateResponse
     */
    public ImportTemplateResponse importTemplate(ImportTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importTemplate);
    }

    /**
     * 从其他项目导入模板
     *
     * 从其他项目导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportTemplateRequest 请求对象
     * @return SyncInvoker<ImportTemplateRequest, ImportTemplateResponse>
     */
    public SyncInvoker<ImportTemplateRequest, ImportTemplateResponse> importTemplateInvoker(
        ImportTemplateRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.importTemplate, hcClient);
    }

    /**
     * 导入用户
     *
     * 导入用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportUserRequest 请求对象
     * @return ImportUserResponse
     */
    public ImportUserResponse importUser(ImportUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importUser);
    }

    /**
     * 导入用户
     *
     * 导入用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportUserRequest 请求对象
     * @return SyncInvoker<ImportUserRequest, ImportUserResponse>
     */
    public SyncInvoker<ImportUserRequest, ImportUserResponse> importUserInvoker(ImportUserRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.importUser, hcClient);
    }

    /**
     * 导入流程
     *
     * 导入流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportWorkflowRequest 请求对象
     * @return ImportWorkflowResponse
     */
    public ImportWorkflowResponse importWorkflow(ImportWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importWorkflow);
    }

    /**
     * 导入流程
     *
     * 导入流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportWorkflowRequest 请求对象
     * @return SyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse>
     */
    public SyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse> importWorkflowInvoker(
        ImportWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.importWorkflow, hcClient);
    }

    /**
     * 初始化平台
     *
     * 初始化平台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializePlatformRequest 请求对象
     * @return InitializePlatformResponse
     */
    public InitializePlatformResponse initializePlatform(InitializePlatformRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.initializePlatform);
    }

    /**
     * 初始化平台
     *
     * 初始化平台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializePlatformRequest 请求对象
     * @return SyncInvoker<InitializePlatformRequest, InitializePlatformResponse>
     */
    public SyncInvoker<InitializePlatformRequest, InitializePlatformResponse> initializePlatformInvoker(
        InitializePlatformRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.initializePlatform, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppRequest 请求对象
     * @return ListAppResponse
     */
    public ListAppResponse listApp(ListAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listApp);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppRequest 请求对象
     * @return SyncInvoker<ListAppRequest, ListAppResponse>
     */
    public SyncInvoker<ListAppRequest, ListAppResponse> listAppInvoker(ListAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listApp, hcClient);
    }

    /**
     * 获取跨域归档配置
     *
     * 获取跨域归档配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArchiveConfigsRequest 请求对象
     * @return ListArchiveConfigsResponse
     */
    public ListArchiveConfigsResponse listArchiveConfigs(ListArchiveConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listArchiveConfigs);
    }

    /**
     * 获取跨域归档配置
     *
     * 获取跨域归档配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArchiveConfigsRequest 请求对象
     * @return SyncInvoker<ListArchiveConfigsRequest, ListArchiveConfigsResponse>
     */
    public SyncInvoker<ListArchiveConfigsRequest, ListArchiveConfigsResponse> listArchiveConfigsInvoker(
        ListArchiveConfigsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listArchiveConfigs, hcClient);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetRequest 请求对象
     * @return ListAssetResponse
     */
    public ListAssetResponse listAsset(ListAssetRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listAsset);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetRequest 请求对象
     * @return SyncInvoker<ListAssetRequest, ListAssetResponse>
     */
    public SyncInvoker<ListAssetRequest, ListAssetResponse> listAssetInvoker(ListAssetRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listAsset, hcClient);
    }

    /**
     * 获取自动作业模板列表
     *
     * 获取自动作业模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoJobRequest 请求对象
     * @return ListAutoJobResponse
     */
    public ListAutoJobResponse listAutoJob(ListAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listAutoJob);
    }

    /**
     * 获取自动作业模板列表
     *
     * 获取自动作业模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoJobRequest 请求对象
     * @return SyncInvoker<ListAutoJobRequest, ListAutoJobResponse>
     */
    public SyncInvoker<ListAutoJobRequest, ListAutoJobResponse> listAutoJobInvoker(ListAutoJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listAutoJob, hcClient);
    }

    /**
     * 查询归档列表
     *
     * 分页查询用户管理的项目的所有历史归档记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupRequest 请求对象
     * @return ListBackupResponse
     */
    public ListBackupResponse listBackup(ListBackupRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listBackup);
    }

    /**
     * 查询归档列表
     *
     * 分页查询用户管理的项目的所有历史归档记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupRequest 请求对象
     * @return SyncInvoker<ListBackupRequest, ListBackupResponse>
     */
    public SyncInvoker<ListBackupRequest, ListBackupResponse> listBackupInvoker(ListBackupRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listBackup, hcClient);
    }

    /**
     * 获取基模型列表
     *
     * 获取基模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaseModelRequest 请求对象
     * @return ListBaseModelResponse
     */
    public ListBaseModelResponse listBaseModel(ListBaseModelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listBaseModel);
    }

    /**
     * 获取基模型列表
     *
     * 获取基模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaseModelRequest 请求对象
     * @return SyncInvoker<ListBaseModelRequest, ListBaseModelResponse>
     */
    public SyncInvoker<ListBaseModelRequest, ListBaseModelResponse> listBaseModelInvoker(ListBaseModelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listBaseModel, hcClient);
    }

    /**
     * 获取桶列表
     *
     * 获取桶列表(包含当前项目桶和引用项目桶)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketRequest 请求对象
     * @return ListBucketResponse
     */
    public ListBucketResponse listBucket(ListBucketRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listBucket);
    }

    /**
     * 获取桶列表
     *
     * 获取桶列表(包含当前项目桶和引用项目桶)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketRequest 请求对象
     * @return SyncInvoker<ListBucketRequest, ListBucketResponse>
     */
    public SyncInvoker<ListBucketRequest, ListBucketResponse> listBucketInvoker(ListBucketRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listBucket, hcClient);
    }

    /**
     * 获取CCE集群列表
     *
     * 获取CCE集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterRequest 请求对象
     * @return ListCceClusterResponse
     */
    public ListCceClusterResponse listCceCluster(ListCceClusterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listCceCluster);
    }

    /**
     * 获取CCE集群列表
     *
     * 获取CCE集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterRequest 请求对象
     * @return SyncInvoker<ListCceClusterRequest, ListCceClusterResponse>
     */
    public SyncInvoker<ListCceClusterRequest, ListCceClusterResponse> listCceClusterInvoker(
        ListCceClusterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listCceCluster, hcClient);
    }

    /**
     * 获取数据作业执行日志
     *
     * 获取数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckpointRequest 请求对象
     * @return ListCheckpointResponse
     */
    public ListCheckpointResponse listCheckpoint(ListCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listCheckpoint);
    }

    /**
     * 获取数据作业执行日志
     *
     * 获取数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckpointRequest 请求对象
     * @return SyncInvoker<ListCheckpointRequest, ListCheckpointResponse>
     */
    public SyncInvoker<ListCheckpointRequest, ListCheckpointResponse> listCheckpointInvoker(
        ListCheckpointRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listCheckpoint, hcClient);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterAllNodeLabelRequest 请求对象
     * @return ListClusterAllNodeLabelResponse
     */
    public ListClusterAllNodeLabelResponse listClusterAllNodeLabel(ListClusterAllNodeLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listClusterAllNodeLabel);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterAllNodeLabelRequest 请求对象
     * @return SyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse>
     */
    public SyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> listClusterAllNodeLabelInvoker(
        ListClusterAllNodeLabelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listClusterAllNodeLabel, hcClient);
    }

    /**
     * 查询指定集群安装步骤列表
     *
     * 查询指定集群安装步骤列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterInstallStepRequest 请求对象
     * @return ListClusterInstallStepResponse
     */
    public ListClusterInstallStepResponse listClusterInstallStep(ListClusterInstallStepRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listClusterInstallStep);
    }

    /**
     * 查询指定集群安装步骤列表
     *
     * 查询指定集群安装步骤列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterInstallStepRequest 请求对象
     * @return SyncInvoker<ListClusterInstallStepRequest, ListClusterInstallStepResponse>
     */
    public SyncInvoker<ListClusterInstallStepRequest, ListClusterInstallStepResponse> listClusterInstallStepInvoker(
        ListClusterInstallStepRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listClusterInstallStep, hcClient);
    }

    /**
     * 获取计算集群列表
     *
     * 获取计算集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComputingClusterRequest 请求对象
     * @return ListComputingClusterResponse
     */
    public ListComputingClusterResponse listComputingCluster(ListComputingClusterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listComputingCluster);
    }

    /**
     * 获取计算集群列表
     *
     * 获取计算集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComputingClusterRequest 请求对象
     * @return SyncInvoker<ListComputingClusterRequest, ListComputingClusterResponse>
     */
    public SyncInvoker<ListComputingClusterRequest, ListComputingClusterResponse> listComputingClusterInvoker(
        ListComputingClusterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listComputingCluster, hcClient);
    }

    /**
     * 查询计算资源规格
     *
     * 查询计算资源规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComputingResourceFlavorsRequest 请求对象
     * @return ListComputingResourceFlavorsResponse
     */
    public ListComputingResourceFlavorsResponse listComputingResourceFlavors(
        ListComputingResourceFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listComputingResourceFlavors);
    }

    /**
     * 查询计算资源规格
     *
     * 查询计算资源规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComputingResourceFlavorsRequest 请求对象
     * @return SyncInvoker<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse>
     */
    public SyncInvoker<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> listComputingResourceFlavorsInvoker(
        ListComputingResourceFlavorsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listComputingResourceFlavors, hcClient);
    }

    /**
     * 查询计算资源
     *
     * 查询计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComputingResourcesRequest 请求对象
     * @return ListComputingResourcesResponse
     */
    public ListComputingResourcesResponse listComputingResources(ListComputingResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listComputingResources);
    }

    /**
     * 查询计算资源
     *
     * 查询计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComputingResourcesRequest 请求对象
     * @return SyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>
     */
    public SyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResourcesInvoker(
        ListComputingResourcesRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listComputingResources, hcClient);
    }

    /**
     * 查询数据列表
     *
     * 查询指定目录下的数据列表，如果不指定默认查询根目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataRequest 请求对象
     * @return ListDataResponse
     */
    public ListDataResponse listData(ListDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listData);
    }

    /**
     * 查询数据列表
     *
     * 查询指定目录下的数据列表，如果不指定默认查询根目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataRequest 请求对象
     * @return SyncInvoker<ListDataRequest, ListDataResponse>
     */
    public SyncInvoker<ListDataRequest, ListDataResponse> listDataInvoker(ListDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listData, hcClient);
    }

    /**
     * 获取数据作业列表
     *
     * 获取数据作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataJobRequest 请求对象
     * @return ListDataJobResponse
     */
    public ListDataJobResponse listDataJob(ListDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDataJob);
    }

    /**
     * 获取数据作业列表
     *
     * 获取数据作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataJobRequest 请求对象
     * @return SyncInvoker<ListDataJobRequest, ListDataJobResponse>
     */
    public SyncInvoker<ListDataJobRequest, ListDataJobResponse> listDataJobInvoker(ListDataJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listDataJob, hcClient);
    }

    /**
     * 查询数据
     *
     * 查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseDataRequest 请求对象
     * @return ListDatabaseDataResponse
     */
    public ListDatabaseDataResponse listDatabaseData(ListDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDatabaseData);
    }

    /**
     * 查询数据
     *
     * 查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseDataRequest 请求对象
     * @return SyncInvoker<ListDatabaseDataRequest, ListDatabaseDataResponse>
     */
    public SyncInvoker<ListDatabaseDataRequest, ListDatabaseDataResponse> listDatabaseDataInvoker(
        ListDatabaseDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listDatabaseData, hcClient);
    }

    /**
     * 查询数据库资源
     *
     * 查询数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseResourceRequest 请求对象
     * @return ListDatabaseResourceResponse
     */
    public ListDatabaseResourceResponse listDatabaseResource(ListDatabaseResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDatabaseResource);
    }

    /**
     * 查询数据库资源
     *
     * 查询数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseResourceRequest 请求对象
     * @return SyncInvoker<ListDatabaseResourceRequest, ListDatabaseResourceResponse>
     */
    public SyncInvoker<ListDatabaseResourceRequest, ListDatabaseResourceResponse> listDatabaseResourceInvoker(
        ListDatabaseResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listDatabaseResource, hcClient);
    }

    /**
     * 获取数据库资源规格列表
     *
     * 获取数据库资源规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseResourceFlavorRequest 请求对象
     * @return ListDatabaseResourceFlavorResponse
     */
    public ListDatabaseResourceFlavorResponse listDatabaseResourceFlavor(ListDatabaseResourceFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDatabaseResourceFlavor);
    }

    /**
     * 获取数据库资源规格列表
     *
     * 获取数据库资源规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseResourceFlavorRequest 请求对象
     * @return SyncInvoker<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse>
     */
    public SyncInvoker<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> listDatabaseResourceFlavorInvoker(
        ListDatabaseResourceFlavorRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listDatabaseResourceFlavor, hcClient);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugDatabaseRequest 请求对象
     * @return ListDrugDatabaseResponse
     */
    public ListDrugDatabaseResponse listDrugDatabase(ListDrugDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDrugDatabase);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugDatabaseRequest 请求对象
     * @return SyncInvoker<ListDrugDatabaseRequest, ListDrugDatabaseResponse>
     */
    public SyncInvoker<ListDrugDatabaseRequest, ListDrugDatabaseResponse> listDrugDatabaseInvoker(
        ListDrugDatabaseRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listDrugDatabase, hcClient);
    }

    /**
     * 获取药物作业列表
     *
     * 获取药物作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugJobRequest 请求对象
     * @return ListDrugJobResponse
     */
    public ListDrugJobResponse listDrugJob(ListDrugJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDrugJob);
    }

    /**
     * 获取药物作业列表
     *
     * 获取药物作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugJobRequest 请求对象
     * @return SyncInvoker<ListDrugJobRequest, ListDrugJobResponse>
     */
    public SyncInvoker<ListDrugJobRequest, ListDrugJobResponse> listDrugJobInvoker(ListDrugJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listDrugJob, hcClient);
    }

    /**
     * 获取模型列表
     *
     * 获取模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugModelRequest 请求对象
     * @return ListDrugModelResponse
     */
    public ListDrugModelResponse listDrugModel(ListDrugModelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDrugModel);
    }

    /**
     * 获取模型列表
     *
     * 获取模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugModelRequest 请求对象
     * @return SyncInvoker<ListDrugModelRequest, ListDrugModelResponse>
     */
    public SyncInvoker<ListDrugModelRequest, ListDrugModelResponse> listDrugModelInvoker(ListDrugModelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listDrugModel, hcClient);
    }

    /**
     * 查询盘古药物分子大模型
     *
     * 查询盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugModelResourceRequest 请求对象
     * @return ListDrugModelResourceResponse
     */
    public ListDrugModelResourceResponse listDrugModelResource(ListDrugModelResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDrugModelResource);
    }

    /**
     * 查询盘古药物分子大模型
     *
     * 查询盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugModelResourceRequest 请求对象
     * @return SyncInvoker<ListDrugModelResourceRequest, ListDrugModelResourceResponse>
     */
    public SyncInvoker<ListDrugModelResourceRequest, ListDrugModelResourceResponse> listDrugModelResourceInvoker(
        ListDrugModelResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listDrugModelResource, hcClient);
    }

    /**
     * 获取收藏夹列表
     *
     * 获取收藏夹列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFavoriteRequest 请求对象
     * @return ListFavoriteResponse
     */
    public ListFavoriteResponse listFavorite(ListFavoriteRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listFavorite);
    }

    /**
     * 获取收藏夹列表
     *
     * 获取收藏夹列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFavoriteRequest 请求对象
     * @return SyncInvoker<ListFavoriteRequest, ListFavoriteResponse>
     */
    public SyncInvoker<ListFavoriteRequest, ListFavoriteResponse> listFavoriteInvoker(ListFavoriteRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listFavorite, hcClient);
    }

    /**
     * 统计全局流程、作业信息
     *
     * 统计全局流程、作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalWorkflowStatisticRequest 请求对象
     * @return ListGlobalWorkflowStatisticResponse
     */
    public ListGlobalWorkflowStatisticResponse listGlobalWorkflowStatistic(ListGlobalWorkflowStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listGlobalWorkflowStatistic);
    }

    /**
     * 统计全局流程、作业信息
     *
     * 统计全局流程、作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalWorkflowStatisticRequest 请求对象
     * @return SyncInvoker<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse>
     */
    public SyncInvoker<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> listGlobalWorkflowStatisticInvoker(
        ListGlobalWorkflowStatisticRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listGlobalWorkflowStatistic, hcClient);
    }

    /**
     * 查询IAM用户组的用户列表
     *
     * 查询IAM用户组的用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamGroupUsersRequest 请求对象
     * @return ListIamGroupUsersResponse
     */
    public ListIamGroupUsersResponse listIamGroupUsers(ListIamGroupUsersRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listIamGroupUsers);
    }

    /**
     * 查询IAM用户组的用户列表
     *
     * 查询IAM用户组的用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamGroupUsersRequest 请求对象
     * @return SyncInvoker<ListIamGroupUsersRequest, ListIamGroupUsersResponse>
     */
    public SyncInvoker<ListIamGroupUsersRequest, ListIamGroupUsersResponse> listIamGroupUsersInvoker(
        ListIamGroupUsersRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listIamGroupUsers, hcClient);
    }

    /**
     * 查询IAM用户组列表
     *
     * 查询IAM用户组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamGroupsRequest 请求对象
     * @return ListIamGroupsResponse
     */
    public ListIamGroupsResponse listIamGroups(ListIamGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listIamGroups);
    }

    /**
     * 查询IAM用户组列表
     *
     * 查询IAM用户组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamGroupsRequest 请求对象
     * @return SyncInvoker<ListIamGroupsRequest, ListIamGroupsResponse>
     */
    public SyncInvoker<ListIamGroupsRequest, ListIamGroupsResponse> listIamGroupsInvoker(ListIamGroupsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listIamGroups, hcClient);
    }

    /**
     * 查询IAM用户列表
     *
     * 查询IAM用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamUsersRequest 请求对象
     * @return ListIamUsersResponse
     */
    public ListIamUsersResponse listIamUsers(ListIamUsersRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listIamUsers);
    }

    /**
     * 查询IAM用户列表
     *
     * 查询IAM用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamUsersRequest 请求对象
     * @return SyncInvoker<ListIamUsersRequest, ListIamUsersResponse>
     */
    public SyncInvoker<ListIamUsersRequest, ListIamUsersResponse> listIamUsersInvoker(ListIamUsersRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listIamUsers, hcClient);
    }

    /**
     * 获取镜像列表
     *
     * 获取镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRequest 请求对象
     * @return ListImageResponse
     */
    public ListImageResponse listImage(ListImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listImage);
    }

    /**
     * 获取镜像列表
     *
     * 获取镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRequest 请求对象
     * @return SyncInvoker<ListImageRequest, ListImageResponse>
     */
    public SyncInvoker<ListImageRequest, ListImageResponse> listImageInvoker(ListImageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listImage, hcClient);
    }

    /**
     * 获取指定镜像的tag列表
     *
     * 获取指定镜像的tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageTagRequest 请求对象
     * @return ListImageTagResponse
     */
    public ListImageTagResponse listImageTag(ListImageTagRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listImageTag);
    }

    /**
     * 获取指定镜像的tag列表
     *
     * 获取指定镜像的tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageTagRequest 请求对象
     * @return SyncInvoker<ListImageTagRequest, ListImageTagResponse>
     */
    public SyncInvoker<ListImageTagRequest, ListImageTagResponse> listImageTagInvoker(ListImageTagRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listImageTag, hcClient);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listInstance);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return SyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public SyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceInvoker(ListInstanceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listInstance, hcClient);
    }

    /**
     * 获取作业列表
     *
     * 获取作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return ListJobResponse
     */
    public ListJobResponse listJob(ListJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listJob);
    }

    /**
     * 获取作业列表
     *
     * 获取作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return SyncInvoker<ListJobRequest, ListJobResponse>
     */
    public SyncInvoker<ListJobRequest, ListJobResponse> listJobInvoker(ListJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listJob, hcClient);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelRequest 请求对象
     * @return ListLabelResponse
     */
    public ListLabelResponse listLabel(ListLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listLabel);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelRequest 请求对象
     * @return SyncInvoker<ListLabelRequest, ListLabelResponse>
     */
    public SyncInvoker<ListLabelRequest, ListLabelResponse> listLabelInvoker(ListLabelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listLabel, hcClient);
    }

    /**
     * 获取标签页面列表
     *
     * 获取标签页面列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelPageRequest 请求对象
     * @return ListLabelPageResponse
     */
    public ListLabelPageResponse listLabelPage(ListLabelPageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listLabelPage);
    }

    /**
     * 获取标签页面列表
     *
     * 获取标签页面列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelPageRequest 请求对象
     * @return SyncInvoker<ListLabelPageRequest, ListLabelPageResponse>
     */
    public SyncInvoker<ListLabelPageRequest, ListLabelPageResponse> listLabelPageInvoker(ListLabelPageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listLabelPage, hcClient);
    }

    /**
     * 获取消息列表
     *
     * 从消息中心获取当前用户有权限查看的消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageRequest 请求对象
     * @return ListMessageResponse
     */
    public ListMessageResponse listMessage(ListMessageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listMessage);
    }

    /**
     * 获取消息列表
     *
     * 从消息中心获取当前用户有权限查看的消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageRequest 请求对象
     * @return SyncInvoker<ListMessageRequest, ListMessageResponse>
     */
    public SyncInvoker<ListMessageRequest, ListMessageResponse> listMessageInvoker(ListMessageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listMessage, hcClient);
    }

    /**
     * 统计消息信息
     *
     * 统计消息信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageStatisticsRequest 请求对象
     * @return ListMessageStatisticsResponse
     */
    public ListMessageStatisticsResponse listMessageStatistics(ListMessageStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listMessageStatistics);
    }

    /**
     * 统计消息信息
     *
     * 统计消息信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageStatisticsRequest 请求对象
     * @return SyncInvoker<ListMessageStatisticsRequest, ListMessageStatisticsResponse>
     */
    public SyncInvoker<ListMessageStatisticsRequest, ListMessageStatisticsResponse> listMessageStatisticsInvoker(
        ListMessageStatisticsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listMessageStatistics, hcClient);
    }

    /**
     * 获取可用的认证方法
     *
     * 获取可用的认证方法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMfaRequest 请求对象
     * @return ListMfaResponse
     */
    public ListMfaResponse listMfa(ListMfaRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listMfa);
    }

    /**
     * 获取可用的认证方法
     *
     * 获取可用的认证方法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMfaRequest 请求对象
     * @return SyncInvoker<ListMfaRequest, ListMfaResponse>
     */
    public SyncInvoker<ListMfaRequest, ListMfaResponse> listMfaInvoker(ListMfaRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listMfa, hcClient);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeLabelRequest 请求对象
     * @return ListNodeLabelResponse
     */
    public ListNodeLabelResponse listNodeLabel(ListNodeLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNodeLabel);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeLabelRequest 请求对象
     * @return SyncInvoker<ListNodeLabelRequest, ListNodeLabelResponse>
     */
    public SyncInvoker<ListNodeLabelRequest, ListNodeLabelResponse> listNodeLabelInvoker(ListNodeLabelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNodeLabel, hcClient);
    }

    /**
     * 获取策略关联计算资源列表
     *
     * 获取策略关联计算资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNodes);
    }

    /**
     * 获取策略关联计算资源列表
     *
     * 获取策略关联计算资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNodes, hcClient);
    }

    /**
     * 获取通知消息列表
     *
     * 获取通知消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeRequest 请求对象
     * @return ListNoticeResponse
     */
    public ListNoticeResponse listNotice(ListNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNotice);
    }

    /**
     * 获取通知消息列表
     *
     * 获取通知消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeRequest 请求对象
     * @return SyncInvoker<ListNoticeRequest, ListNoticeResponse>
     */
    public SyncInvoker<ListNoticeRequest, ListNoticeResponse> listNoticeInvoker(ListNoticeRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNotice, hcClient);
    }

    /**
     * 获取性能加速资源上统计信息
     *
     * 获取性能加速资源上统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPerformanceResourceStatRequest 请求对象
     * @return ListPerformanceResourceStatResponse
     */
    public ListPerformanceResourceStatResponse listPerformanceResourceStat(ListPerformanceResourceStatRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listPerformanceResourceStat);
    }

    /**
     * 获取性能加速资源上统计信息
     *
     * 获取性能加速资源上统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPerformanceResourceStatRequest 请求对象
     * @return SyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse>
     */
    public SyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> listPerformanceResourceStatInvoker(
        ListPerformanceResourceStatRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listPerformanceResourceStat, hcClient);
    }

    /**
     * 查询性能加速资源
     *
     * 查询性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPerformanceResourcesRequest 请求对象
     * @return ListPerformanceResourcesResponse
     */
    public ListPerformanceResourcesResponse listPerformanceResources(ListPerformanceResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listPerformanceResources);
    }

    /**
     * 查询性能加速资源
     *
     * 查询性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPerformanceResourcesRequest 请求对象
     * @return SyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse>
     */
    public SyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> listPerformanceResourcesInvoker(
        ListPerformanceResourcesRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listPerformanceResources, hcClient);
    }

    /**
     * 获取策略事件
     *
     * 获取策略事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyEventsRequest 请求对象
     * @return ListPolicyEventsResponse
     */
    public ListPolicyEventsResponse listPolicyEvents(ListPolicyEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listPolicyEvents);
    }

    /**
     * 获取策略事件
     *
     * 获取策略事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyEventsRequest 请求对象
     * @return SyncInvoker<ListPolicyEventsRequest, ListPolicyEventsResponse>
     */
    public SyncInvoker<ListPolicyEventsRequest, ListPolicyEventsResponse> listPolicyEventsInvoker(
        ListPolicyEventsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listPolicyEvents, hcClient);
    }

    /**
     * 获取预置标签列表
     *
     * 获取预置标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPresetLabelRequest 请求对象
     * @return ListPresetLabelResponse
     */
    public ListPresetLabelResponse listPresetLabel(ListPresetLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listPresetLabel);
    }

    /**
     * 获取预置标签列表
     *
     * 获取预置标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPresetLabelRequest 请求对象
     * @return SyncInvoker<ListPresetLabelRequest, ListPresetLabelResponse>
     */
    public SyncInvoker<ListPresetLabelRequest, ListPresetLabelResponse> listPresetLabelInvoker(
        ListPresetLabelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listPresetLabel, hcClient);
    }

    /**
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRequest 请求对象
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listProject);
    }

    /**
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRequest 请求对象
     * @return SyncInvoker<ListProjectRequest, ListProjectResponse>
     */
    public SyncInvoker<ListProjectRequest, ListProjectResponse> listProjectInvoker(ListProjectRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listProject, hcClient);
    }

    /**
     * 获取当前用户所属空间资源统计信息
     *
     * 获取当前用户所属空间资源统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectStatisticsRequest 请求对象
     * @return ListProjectStatisticsResponse
     */
    public ListProjectStatisticsResponse listProjectStatistics(ListProjectStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listProjectStatistics);
    }

    /**
     * 获取当前用户所属空间资源统计信息
     *
     * 获取当前用户所属空间资源统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectStatisticsRequest 请求对象
     * @return SyncInvoker<ListProjectStatisticsRequest, ListProjectStatisticsResponse>
     */
    public SyncInvoker<ListProjectStatisticsRequest, ListProjectStatisticsResponse> listProjectStatisticsInvoker(
        ListProjectStatisticsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listProjectStatistics, hcClient);
    }

    /**
     * 获取属性值列表
     *
     * 获取属性值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPropertyRequest 请求对象
     * @return ListPropertyResponse
     */
    public ListPropertyResponse listProperty(ListPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listProperty);
    }

    /**
     * 获取属性值列表
     *
     * 获取属性值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPropertyRequest 请求对象
     * @return SyncInvoker<ListPropertyRequest, ListPropertyResponse>
     */
    public SyncInvoker<ListPropertyRequest, ListPropertyResponse> listPropertyInvoker(ListPropertyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listProperty, hcClient);
    }

    /**
     * 获取当前系统配额及资源使用情况
     *
     * 获取当前系统配额及资源使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuota(ListQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listQuota);
    }

    /**
     * 获取当前系统配额及资源使用情况
     *
     * 获取当前系统配额及资源使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return SyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public SyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaInvoker(ListQuotaRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listQuota, hcClient);
    }

    /**
     * 查询扩容策略列表
     *
     * 查询扩容策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScaleOutPolicyRequest 请求对象
     * @return ListScaleOutPolicyResponse
     */
    public ListScaleOutPolicyResponse listScaleOutPolicy(ListScaleOutPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listScaleOutPolicy);
    }

    /**
     * 查询扩容策略列表
     *
     * 查询扩容策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScaleOutPolicyRequest 请求对象
     * @return SyncInvoker<ListScaleOutPolicyRequest, ListScaleOutPolicyResponse>
     */
    public SyncInvoker<ListScaleOutPolicyRequest, ListScaleOutPolicyResponse> listScaleOutPolicyInvoker(
        ListScaleOutPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listScaleOutPolicy, hcClient);
    }

    /**
     * 获取策略伸缩历史
     *
     * 获取策略伸缩历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingHistoryRequest 请求对象
     * @return ListScalingHistoryResponse
     */
    public ListScalingHistoryResponse listScalingHistory(ListScalingHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listScalingHistory);
    }

    /**
     * 获取策略伸缩历史
     *
     * 获取策略伸缩历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingHistoryRequest 请求对象
     * @return SyncInvoker<ListScalingHistoryRequest, ListScalingHistoryResponse>
     */
    public SyncInvoker<ListScalingHistoryRequest, ListScalingHistoryResponse> listScalingHistoryInvoker(
        ListScalingHistoryRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listScalingHistory, hcClient);
    }

    /**
     * 获取sfs-turbo资源列表
     *
     * 获取sfs-turbo资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSfsTurbosRequest 请求对象
     * @return ListSfsTurbosResponse
     */
    public ListSfsTurbosResponse listSfsTurbos(ListSfsTurbosRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listSfsTurbos);
    }

    /**
     * 获取sfs-turbo资源列表
     *
     * 获取sfs-turbo资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSfsTurbosRequest 请求对象
     * @return SyncInvoker<ListSfsTurbosRequest, ListSfsTurbosResponse>
     */
    public SyncInvoker<ListSfsTurbosRequest, ListSfsTurbosResponse> listSfsTurbosInvoker(ListSfsTurbosRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listSfsTurbos, hcClient);
    }

    /**
     * 获取收藏资产列表
     *
     * 获取收藏资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRequest 请求对象
     * @return ListStarResponse
     */
    public ListStarResponse listStar(ListStarRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listStar);
    }

    /**
     * 获取收藏资产列表
     *
     * 获取收藏资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRequest 请求对象
     * @return SyncInvoker<ListStarRequest, ListStarResponse>
     */
    public SyncInvoker<ListStarRequest, ListStarResponse> listStarInvoker(ListStarRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listStar, hcClient);
    }

    /**
     * 查询存储资源
     *
     * 查询存储资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageResourcesRequest 请求对象
     * @return ListStorageResourcesResponse
     */
    public ListStorageResourcesResponse listStorageResources(ListStorageResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listStorageResources);
    }

    /**
     * 查询存储资源
     *
     * 查询存储资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageResourcesRequest 请求对象
     * @return SyncInvoker<ListStorageResourcesRequest, ListStorageResourcesResponse>
     */
    public SyncInvoker<ListStorageResourcesRequest, ListStorageResourcesResponse> listStorageResourcesInvoker(
        ListStorageResourcesRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listStorageResources, hcClient);
    }

    /**
     * 列举study
     *
     * 列举study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStudyRequest 请求对象
     * @return ListStudyResponse
     */
    public ListStudyResponse listStudy(ListStudyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listStudy);
    }

    /**
     * 列举study
     *
     * 列举study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStudyRequest 请求对象
     * @return SyncInvoker<ListStudyRequest, ListStudyResponse>
     */
    public SyncInvoker<ListStudyRequest, ListStudyResponse> listStudyInvoker(ListStudyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listStudy, hcClient);
    }

    /**
     * 列举study所有作业
     *
     * 列举study所有作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStudyJobRequest 请求对象
     * @return ListStudyJobResponse
     */
    public ListStudyJobResponse listStudyJob(ListStudyJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listStudyJob);
    }

    /**
     * 列举study所有作业
     *
     * 列举study所有作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStudyJobRequest 请求对象
     * @return SyncInvoker<ListStudyJobRequest, ListStudyJobResponse>
     */
    public SyncInvoker<ListStudyJobRequest, ListStudyJobResponse> listStudyJobInvoker(ListStudyJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listStudyJob, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateRequest 请求对象
     * @return ListTemplateResponse
     */
    public ListTemplateResponse listTemplate(ListTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listTemplate);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateRequest 请求对象
     * @return SyncInvoker<ListTemplateRequest, ListTemplateResponse>
     */
    public SyncInvoker<ListTemplateRequest, ListTemplateResponse> listTemplateInvoker(ListTemplateRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listTemplate, hcClient);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return ListUserResponse
     */
    public ListUserResponse listUser(ListUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listUser);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return SyncInvoker<ListUserRequest, ListUserResponse>
     */
    public SyncInvoker<ListUserRequest, ListUserResponse> listUserInvoker(ListUserRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listUser, hcClient);
    }

    /**
     * 获取用户所属空间的应用列表
     *
     * 获取用户所属空间的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserAppRequest 请求对象
     * @return ListUserAppResponse
     */
    public ListUserAppResponse listUserApp(ListUserAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listUserApp);
    }

    /**
     * 获取用户所属空间的应用列表
     *
     * 获取用户所属空间的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserAppRequest 请求对象
     * @return SyncInvoker<ListUserAppRequest, ListUserAppResponse>
     */
    public SyncInvoker<ListUserAppRequest, ListUserAppResponse> listUserAppInvoker(ListUserAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listUserApp, hcClient);
    }

    /**
     * 获取用户所属空间的药物作业列表
     *
     * 获取用户所属空间的药物作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDrugJobRequest 请求对象
     * @return ListUserDrugJobResponse
     */
    public ListUserDrugJobResponse listUserDrugJob(ListUserDrugJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listUserDrugJob);
    }

    /**
     * 获取用户所属空间的药物作业列表
     *
     * 获取用户所属空间的药物作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDrugJobRequest 请求对象
     * @return SyncInvoker<ListUserDrugJobRequest, ListUserDrugJobResponse>
     */
    public SyncInvoker<ListUserDrugJobRequest, ListUserDrugJobResponse> listUserDrugJobInvoker(
        ListUserDrugJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listUserDrugJob, hcClient);
    }

    /**
     * 获取用户所属空间的镜像列表
     *
     * 获取用户所属空间的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserImageRequest 请求对象
     * @return ListUserImageResponse
     */
    public ListUserImageResponse listUserImage(ListUserImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listUserImage);
    }

    /**
     * 获取用户所属空间的镜像列表
     *
     * 获取用户所属空间的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserImageRequest 请求对象
     * @return SyncInvoker<ListUserImageRequest, ListUserImageResponse>
     */
    public SyncInvoker<ListUserImageRequest, ListUserImageResponse> listUserImageInvoker(ListUserImageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listUserImage, hcClient);
    }

    /**
     * 获取用户所属空间的作业列表
     *
     * 获取用户所属空间的作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserJobRequest 请求对象
     * @return ListUserJobResponse
     */
    public ListUserJobResponse listUserJob(ListUserJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listUserJob);
    }

    /**
     * 获取用户所属空间的作业列表
     *
     * 获取用户所属空间的作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserJobRequest 请求对象
     * @return SyncInvoker<ListUserJobRequest, ListUserJobResponse>
     */
    public SyncInvoker<ListUserJobRequest, ListUserJobResponse> listUserJobInvoker(ListUserJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listUserJob, hcClient);
    }

    /**
     * 获取用户所属空间的流程列表
     *
     * 获取用户所属空间的流程列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserWorkflowRequest 请求对象
     * @return ListUserWorkflowResponse
     */
    public ListUserWorkflowResponse listUserWorkflow(ListUserWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listUserWorkflow);
    }

    /**
     * 获取用户所属空间的流程列表
     *
     * 获取用户所属空间的流程列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserWorkflowRequest 请求对象
     * @return SyncInvoker<ListUserWorkflowRequest, ListUserWorkflowResponse>
     */
    public SyncInvoker<ListUserWorkflowRequest, ListUserWorkflowResponse> listUserWorkflowInvoker(
        ListUserWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listUserWorkflow, hcClient);
    }

    /**
     * 获取供应商列表
     *
     * 获取供应商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVendorRequest 请求对象
     * @return ListVendorResponse
     */
    public ListVendorResponse listVendor(ListVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listVendor);
    }

    /**
     * 获取供应商列表
     *
     * 获取供应商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVendorRequest 请求对象
     * @return SyncInvoker<ListVendorRequest, ListVendorResponse>
     */
    public SyncInvoker<ListVendorRequest, ListVendorResponse> listVendorInvoker(ListVendorRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listVendor, hcClient);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowRequest 请求对象
     * @return ListWorkflowResponse
     */
    public ListWorkflowResponse listWorkflow(ListWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listWorkflow);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowRequest 请求对象
     * @return SyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public SyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowInvoker(ListWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listWorkflow, hcClient);
    }

    /**
     * 统计应用、流程、作业数目
     *
     * 统计应用、流程、作业数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowStatisticRequest 请求对象
     * @return ListWorkflowStatisticResponse
     */
    public ListWorkflowStatisticResponse listWorkflowStatistic(ListWorkflowStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listWorkflowStatistic);
    }

    /**
     * 统计应用、流程、作业数目
     *
     * 统计应用、流程、作业数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowStatisticRequest 请求对象
     * @return SyncInvoker<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse>
     */
    public SyncInvoker<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> listWorkflowStatisticInvoker(
        ListWorkflowStatisticRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listWorkflowStatistic, hcClient);
    }

    /**
     * 发布应用
     *
     * 发布应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppRequest 请求对象
     * @return PublishAppResponse
     */
    public PublishAppResponse publishApp(PublishAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.publishApp);
    }

    /**
     * 发布应用
     *
     * 发布应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppRequest 请求对象
     * @return SyncInvoker<PublishAppRequest, PublishAppResponse>
     */
    public SyncInvoker<PublishAppRequest, PublishAppResponse> publishAppInvoker(PublishAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.publishApp, hcClient);
    }

    /**
     * 发布数据资产
     *
     * 发布数据资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishDataRequest 请求对象
     * @return PublishDataResponse
     */
    public PublishDataResponse publishData(PublishDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.publishData);
    }

    /**
     * 发布数据资产
     *
     * 发布数据资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishDataRequest 请求对象
     * @return SyncInvoker<PublishDataRequest, PublishDataResponse>
     */
    public SyncInvoker<PublishDataRequest, PublishDataResponse> publishDataInvoker(PublishDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.publishData, hcClient);
    }

    /**
     * 发布镜像
     *
     * 发布镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishImageRequest 请求对象
     * @return PublishImageResponse
     */
    public PublishImageResponse publishImage(PublishImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.publishImage);
    }

    /**
     * 发布镜像
     *
     * 发布镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishImageRequest 请求对象
     * @return SyncInvoker<PublishImageRequest, PublishImageResponse>
     */
    public SyncInvoker<PublishImageRequest, PublishImageResponse> publishImageInvoker(PublishImageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.publishImage, hcClient);
    }

    /**
     * 发布流程
     *
     * 发布流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishWorkflowRequest 请求对象
     * @return PublishWorkflowResponse
     */
    public PublishWorkflowResponse publishWorkflow(PublishWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.publishWorkflow);
    }

    /**
     * 发布流程
     *
     * 发布流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishWorkflowRequest 请求对象
     * @return SyncInvoker<PublishWorkflowRequest, PublishWorkflowResponse>
     */
    public SyncInvoker<PublishWorkflowRequest, PublishWorkflowResponse> publishWorkflowInvoker(
        PublishWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.publishWorkflow, hcClient);
    }

    /**
     * 引用项目数据
     *
     * 引用项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QuoteDataRequest 请求对象
     * @return QuoteDataResponse
     */
    public QuoteDataResponse quoteData(QuoteDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.quoteData);
    }

    /**
     * 引用项目数据
     *
     * 引用项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QuoteDataRequest 请求对象
     * @return SyncInvoker<QuoteDataRequest, QuoteDataResponse>
     */
    public SyncInvoker<QuoteDataRequest, QuoteDataResponse> quoteDataInvoker(QuoteDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.quoteData, hcClient);
    }

    /**
     * 引用数据库实例
     *
     * 引用数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QuoteInstanceRequest 请求对象
     * @return QuoteInstanceResponse
     */
    public QuoteInstanceResponse quoteInstance(QuoteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.quoteInstance);
    }

    /**
     * 引用数据库实例
     *
     * 引用数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QuoteInstanceRequest 请求对象
     * @return SyncInvoker<QuoteInstanceRequest, QuoteInstanceResponse>
     */
    public SyncInvoker<QuoteInstanceRequest, QuoteInstanceResponse> quoteInstanceInvoker(QuoteInstanceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.quoteInstance, hcClient);
    }

    /**
     * 重启计算资源
     *
     * 重启计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootNodeRequest 请求对象
     * @return RebootNodeResponse
     */
    public RebootNodeResponse rebootNode(RebootNodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.rebootNode);
    }

    /**
     * 重启计算资源
     *
     * 重启计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootNodeRequest 请求对象
     * @return SyncInvoker<RebootNodeRequest, RebootNodeResponse>
     */
    public SyncInvoker<RebootNodeRequest, RebootNodeResponse> rebootNodeInvoker(RebootNodeRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.rebootNode, hcClient);
    }

    /**
     * 恢复归档
     *
     * 将指定的归档数据拷贝到目标项目的某个目录下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreBackupRequest 请求对象
     * @return RestoreBackupResponse
     */
    public RestoreBackupResponse restoreBackup(RestoreBackupRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.restoreBackup);
    }

    /**
     * 恢复归档
     *
     * 将指定的归档数据拷贝到目标项目的某个目录下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreBackupRequest 请求对象
     * @return SyncInvoker<RestoreBackupRequest, RestoreBackupResponse>
     */
    public SyncInvoker<RestoreBackupRequest, RestoreBackupResponse> restoreBackupInvoker(RestoreBackupRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.restoreBackup, hcClient);
    }

    /**
     * 重试数据作业
     *
     * 重试数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryDataJobRequest 请求对象
     * @return RetryDataJobResponse
     */
    public RetryDataJobResponse retryDataJob(RetryDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.retryDataJob);
    }

    /**
     * 重试数据作业
     *
     * 重试数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryDataJobRequest 请求对象
     * @return SyncInvoker<RetryDataJobRequest, RetryDataJobResponse>
     */
    public SyncInvoker<RetryDataJobRequest, RetryDataJobResponse> retryDataJobInvoker(RetryDataJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.retryDataJob, hcClient);
    }

    /**
     * 重试作业
     *
     * 重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobRequest 请求对象
     * @return RetryJobResponse
     */
    public RetryJobResponse retryJob(RetryJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.retryJob);
    }

    /**
     * 重试作业
     *
     * 重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobRequest 请求对象
     * @return SyncInvoker<RetryJobRequest, RetryJobResponse>
     */
    public SyncInvoker<RetryJobRequest, RetryJobResponse> retryJobInvoker(RetryJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.retryJob, hcClient);
    }

    /**
     * 受体预处理（Fasta格式）
     *
     * 受体预处理（Fasta格式），用于前端计算预期扣费次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFastaPreprocessRequest 请求对象
     * @return RunFastaPreprocessResponse
     */
    public RunFastaPreprocessResponse runFastaPreprocess(RunFastaPreprocessRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.runFastaPreprocess);
    }

    /**
     * 受体预处理（Fasta格式）
     *
     * 受体预处理（Fasta格式），用于前端计算预期扣费次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFastaPreprocessRequest 请求对象
     * @return SyncInvoker<RunFastaPreprocessRequest, RunFastaPreprocessResponse>
     */
    public SyncInvoker<RunFastaPreprocessRequest, RunFastaPreprocessResponse> runFastaPreprocessInvoker(
        RunFastaPreprocessRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.runFastaPreprocess, hcClient);
    }

    /**
     * 单分子文件格式转换
     *
     * 单分子文件格式转换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFormatConverterRequest 请求对象
     * @return RunFormatConverterResponse
     */
    public RunFormatConverterResponse runFormatConverter(RunFormatConverterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.runFormatConverter);
    }

    /**
     * 单分子文件格式转换
     *
     * 单分子文件格式转换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFormatConverterRequest 请求对象
     * @return SyncInvoker<RunFormatConverterRequest, RunFormatConverterResponse>
     */
    public SyncInvoker<RunFormatConverterRequest, RunFormatConverterResponse> runFormatConverterInvoker(
        RunFormatConverterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.runFormatConverter, hcClient);
    }

    /**
     * 获取生成study作业3D结构的内容
     *
     * 获取生成study作业3D结构的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show3dStructureContentRequest 请求对象
     * @return Show3dStructureContentResponse
     */
    public Show3dStructureContentResponse show3dStructureContent(Show3dStructureContentRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.show3dStructureContent);
    }

    /**
     * 获取生成study作业3D结构的内容
     *
     * 获取生成study作业3D结构的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show3dStructureContentRequest 请求对象
     * @return SyncInvoker<Show3dStructureContentRequest, Show3dStructureContentResponse>
     */
    public SyncInvoker<Show3dStructureContentRequest, Show3dStructureContentResponse> show3dStructureContentInvoker(
        Show3dStructureContentRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.show3dStructureContent, hcClient);
    }

    /**
     * 查询分子属性预测作业详情
     *
     * 查询分子属性预测作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdmetJobRequest 请求对象
     * @return ShowAdmetJobResponse
     */
    public ShowAdmetJobResponse showAdmetJob(ShowAdmetJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAdmetJob);
    }

    /**
     * 查询分子属性预测作业详情
     *
     * 查询分子属性预测作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdmetJobRequest 请求对象
     * @return SyncInvoker<ShowAdmetJobRequest, ShowAdmetJobResponse>
     */
    public SyncInvoker<ShowAdmetJobRequest, ShowAdmetJobResponse> showAdmetJobInvoker(ShowAdmetJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showAdmetJob, hcClient);
    }

    /**
     * 获取业务委托
     *
     * 获取业务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return ShowAgencyResponse
     */
    public ShowAgencyResponse showAgency(ShowAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAgency);
    }

    /**
     * 获取业务委托
     *
     * 获取业务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public SyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyInvoker(ShowAgencyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showAgency, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showApp);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showApp, hcClient);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return ShowAssetResponse
     */
    public ShowAssetResponse showAsset(ShowAssetRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAsset);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return SyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public SyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetInvoker(ShowAssetRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showAsset, hcClient);
    }

    /**
     * 查询资产版本详情
     *
     * 查询资产版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetVersionRequest 请求对象
     * @return ShowAssetVersionResponse
     */
    public ShowAssetVersionResponse showAssetVersion(ShowAssetVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAssetVersion);
    }

    /**
     * 查询资产版本详情
     *
     * 查询资产版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetVersionRequest 请求对象
     * @return SyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse>
     */
    public SyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse> showAssetVersionInvoker(
        ShowAssetVersionRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showAssetVersion, hcClient);
    }

    /**
     * 查询自动作业模板
     *
     * 查询自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoJobRequest 请求对象
     * @return ShowAutoJobResponse
     */
    public ShowAutoJobResponse showAutoJob(ShowAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAutoJob);
    }

    /**
     * 查询自动作业模板
     *
     * 查询自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoJobRequest 请求对象
     * @return SyncInvoker<ShowAutoJobRequest, ShowAutoJobResponse>
     */
    public SyncInvoker<ShowAutoJobRequest, ShowAutoJobResponse> showAutoJobInvoker(ShowAutoJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showAutoJob, hcClient);
    }

    /**
     * 获取指定归档的全数据清单
     *
     * 根据归档ID获取该归档的全数据清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPathRequest 请求对象
     * @return ShowBackupPathResponse
     */
    public ShowBackupPathResponse showBackupPath(ShowBackupPathRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showBackupPath);
    }

    /**
     * 获取指定归档的全数据清单
     *
     * 根据归档ID获取该归档的全数据清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPathRequest 请求对象
     * @return SyncInvoker<ShowBackupPathRequest, ShowBackupPathResponse>
     */
    public SyncInvoker<ShowBackupPathRequest, ShowBackupPathResponse> showBackupPathInvoker(
        ShowBackupPathRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showBackupPath, hcClient);
    }

    /**
     * 查询bms计算资源显卡id列表
     *
     * 查询bms计算资源显卡id列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBmsDevicesRequest 请求对象
     * @return ShowBmsDevicesResponse
     */
    public ShowBmsDevicesResponse showBmsDevices(ShowBmsDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showBmsDevices);
    }

    /**
     * 查询bms计算资源显卡id列表
     *
     * 查询bms计算资源显卡id列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBmsDevicesRequest 请求对象
     * @return SyncInvoker<ShowBmsDevicesRequest, ShowBmsDevicesResponse>
     */
    public SyncInvoker<ShowBmsDevicesRequest, ShowBmsDevicesResponse> showBmsDevicesInvoker(
        ShowBmsDevicesRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showBmsDevices, hcClient);
    }

    /**
     * 获取桶存量信息
     *
     * 获取桶存量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketStorageRequest 请求对象
     * @return ShowBucketStorageResponse
     */
    public ShowBucketStorageResponse showBucketStorage(ShowBucketStorageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showBucketStorage);
    }

    /**
     * 获取桶存量信息
     *
     * 获取桶存量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketStorageRequest 请求对象
     * @return SyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse>
     */
    public SyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse> showBucketStorageInvoker(
        ShowBucketStorageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showBucketStorage, hcClient);
    }

    /**
     * 查询聚类分析作业详情
     *
     * 查询聚类分析作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusteringJobRequest 请求对象
     * @return ShowClusteringJobResponse
     */
    public ShowClusteringJobResponse showClusteringJob(ShowClusteringJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showClusteringJob);
    }

    /**
     * 查询聚类分析作业详情
     *
     * 查询聚类分析作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusteringJobRequest 请求对象
     * @return SyncInvoker<ShowClusteringJobRequest, ShowClusteringJobResponse>
     */
    public SyncInvoker<ShowClusteringJobRequest, ShowClusteringJobResponse> showClusteringJobInvoker(
        ShowClusteringJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showClusteringJob, hcClient);
    }

    /**
     * 获取数据详情
     *
     * 获取指定数据对象的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataRequest 请求对象
     * @return ShowDataResponse
     */
    public ShowDataResponse showData(ShowDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showData);
    }

    /**
     * 获取数据详情
     *
     * 获取指定数据对象的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataRequest 请求对象
     * @return SyncInvoker<ShowDataRequest, ShowDataResponse>
     */
    public SyncInvoker<ShowDataRequest, ShowDataResponse> showDataInvoker(ShowDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showData, hcClient);
    }

    /**
     * 获取数据作业详细信息
     *
     * 获取数据作业详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataJobRequest 请求对象
     * @return ShowDataJobResponse
     */
    public ShowDataJobResponse showDataJob(ShowDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDataJob);
    }

    /**
     * 获取数据作业详细信息
     *
     * 获取数据作业详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataJobRequest 请求对象
     * @return SyncInvoker<ShowDataJobRequest, ShowDataJobResponse>
     */
    public SyncInvoker<ShowDataJobRequest, ShowDataJobResponse> showDataJobInvoker(ShowDataJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showDataJob, hcClient);
    }

    /**
     * 查询项目级数据权限控制策略
     *
     * 查询项目级数据权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataPolicyRequest 请求对象
     * @return ShowDataPolicyResponse
     */
    public ShowDataPolicyResponse showDataPolicy(ShowDataPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDataPolicy);
    }

    /**
     * 查询项目级数据权限控制策略
     *
     * 查询项目级数据权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataPolicyRequest 请求对象
     * @return SyncInvoker<ShowDataPolicyRequest, ShowDataPolicyResponse>
     */
    public SyncInvoker<ShowDataPolicyRequest, ShowDataPolicyResponse> showDataPolicyInvoker(
        ShowDataPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showDataPolicy, hcClient);
    }

    /**
     * 获取docker login指令
     *
     * 获取docker login指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockerLoginRequest 请求对象
     * @return ShowDockerLoginResponse
     */
    public ShowDockerLoginResponse showDockerLogin(ShowDockerLoginRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDockerLogin);
    }

    /**
     * 获取docker login指令
     *
     * 获取docker login指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockerLoginRequest 请求对象
     * @return SyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse>
     */
    public SyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse> showDockerLoginInvoker(
        ShowDockerLoginRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showDockerLogin, hcClient);
    }

    /**
     * 查询分子对接作业详情
     *
     * 查询分子对接作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockingJobRequest 请求对象
     * @return ShowDockingJobResponse
     */
    public ShowDockingJobResponse showDockingJob(ShowDockingJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDockingJob);
    }

    /**
     * 查询分子对接作业详情
     *
     * 查询分子对接作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockingJobRequest 请求对象
     * @return SyncInvoker<ShowDockingJobRequest, ShowDockingJobResponse>
     */
    public SyncInvoker<ShowDockingJobRequest, ShowDockingJobResponse> showDockingJobInvoker(
        ShowDockingJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showDockingJob, hcClient);
    }

    /**
     * 查询系统配置列表
     *
     * 获取系统配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvRequest 请求对象
     * @return ShowEnvResponse
     */
    public ShowEnvResponse showEnv(ShowEnvRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showEnv);
    }

    /**
     * 查询系统配置列表
     *
     * 获取系统配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvRequest 请求对象
     * @return SyncInvoker<ShowEnvRequest, ShowEnvResponse>
     */
    public SyncInvoker<ShowEnvRequest, ShowEnvResponse> showEnvInvoker(ShowEnvRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showEnv, hcClient);
    }

    /**
     * 获取EVS配额及使用情况
     *
     * 获取EVS配额及使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEvsQuotaRequest 请求对象
     * @return ShowEvsQuotaResponse
     */
    public ShowEvsQuotaResponse showEvsQuota(ShowEvsQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showEvsQuota);
    }

    /**
     * 获取EVS配额及使用情况
     *
     * 获取EVS配额及使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEvsQuotaRequest 请求对象
     * @return SyncInvoker<ShowEvsQuotaRequest, ShowEvsQuotaResponse>
     */
    public SyncInvoker<ShowEvsQuotaRequest, ShowEvsQuotaResponse> showEvsQuotaInvoker(ShowEvsQuotaRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showEvsQuota, hcClient);
    }

    /**
     * 获取study作业的最值信息
     *
     * 获取study作业的最值信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExtremumInfoRequest 请求对象
     * @return ShowExtremumInfoResponse
     */
    public ShowExtremumInfoResponse showExtremumInfo(ShowExtremumInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showExtremumInfo);
    }

    /**
     * 获取study作业的最值信息
     *
     * 获取study作业的最值信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExtremumInfoRequest 请求对象
     * @return SyncInvoker<ShowExtremumInfoRequest, ShowExtremumInfoResponse>
     */
    public SyncInvoker<ShowExtremumInfoRequest, ShowExtremumInfoResponse> showExtremumInfoInvoker(
        ShowExtremumInfoRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showExtremumInfo, hcClient);
    }

    /**
     * 查询自由能微扰作业详情
     *
     * 查询自由能微扰作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFepJobRequest 请求对象
     * @return ShowFepJobResponse
     */
    public ShowFepJobResponse showFepJob(ShowFepJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showFepJob);
    }

    /**
     * 查询自由能微扰作业详情
     *
     * 查询自由能微扰作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFepJobRequest 请求对象
     * @return SyncInvoker<ShowFepJobRequest, ShowFepJobResponse>
     */
    public SyncInvoker<ShowFepJobRequest, ShowFepJobResponse> showFepJobInvoker(ShowFepJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showFepJob, hcClient);
    }

    /**
     * 查询分子生成作业详情
     *
     * 查询分子生成作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGenJobRequest 请求对象
     * @return ShowGenJobResponse
     */
    public ShowGenJobResponse showGenJob(ShowGenJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showGenJob);
    }

    /**
     * 查询分子生成作业详情
     *
     * 查询分子生成作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGenJobRequest 请求对象
     * @return SyncInvoker<ShowGenJobRequest, ShowGenJobResponse>
     */
    public SyncInvoker<ShowGenJobRequest, ShowGenJobResponse> showGenJobInvoker(ShowGenJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showGenJob, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showInstance);
    }

    /**
     * 查询实例详情
     *
     * 查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showInstance, hcClient);
    }

    /**
     * 获取作业详情
     *
     * 获取作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showJob);
    }

    /**
     * 获取作业详情
     *
     * 获取作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showJob, hcClient);
    }

    /**
     * 获取作业配置
     *
     * 获取作业配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigRequest 请求对象
     * @return ShowJobConfigResponse
     */
    public ShowJobConfigResponse showJobConfig(ShowJobConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showJobConfig);
    }

    /**
     * 获取作业配置
     *
     * 获取作业配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobConfigRequest 请求对象
     * @return SyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse>
     */
    public SyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfigInvoker(ShowJobConfigRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showJobConfig, hcClient);
    }

    /**
     * 获取作业事件
     *
     * 获取作业事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobEventRequest 请求对象
     * @return ShowJobEventResponse
     */
    public ShowJobEventResponse showJobEvent(ShowJobEventRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showJobEvent);
    }

    /**
     * 获取作业事件
     *
     * 获取作业事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobEventRequest 请求对象
     * @return SyncInvoker<ShowJobEventRequest, ShowJobEventResponse>
     */
    public SyncInvoker<ShowJobEventRequest, ShowJobEventResponse> showJobEventInvoker(ShowJobEventRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showJobEvent, hcClient);
    }

    /**
     * 获取作业日志
     *
     * 获取作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobLogRequest 请求对象
     * @return ShowJobLogResponse
     */
    public ShowJobLogResponse showJobLog(ShowJobLogRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showJobLog);
    }

    /**
     * 获取作业日志
     *
     * 获取作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobLogRequest 请求对象
     * @return SyncInvoker<ShowJobLogRequest, ShowJobLogResponse>
     */
    public SyncInvoker<ShowJobLogRequest, ShowJobLogResponse> showJobLogInvoker(ShowJobLogRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showJobLog, hcClient);
    }

    /**
     * 获取节点剩余配额
     *
     * 获取节点剩余配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLeftQuotaRequest 请求对象
     * @return ShowLeftQuotaResponse
     */
    public ShowLeftQuotaResponse showLeftQuota(ShowLeftQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showLeftQuota);
    }

    /**
     * 获取节点剩余配额
     *
     * 获取节点剩余配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLeftQuotaRequest 请求对象
     * @return SyncInvoker<ShowLeftQuotaRequest, ShowLeftQuotaResponse>
     */
    public SyncInvoker<ShowLeftQuotaRequest, ShowLeftQuotaResponse> showLeftQuotaInvoker(ShowLeftQuotaRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showLeftQuota, hcClient);
    }

    /**
     * 获取消息清理规则
     *
     * 获取消息清理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageClearRuleRequest 请求对象
     * @return ShowMessageClearRuleResponse
     */
    public ShowMessageClearRuleResponse showMessageClearRule(ShowMessageClearRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showMessageClearRule);
    }

    /**
     * 获取消息清理规则
     *
     * 获取消息清理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageClearRuleRequest 请求对象
     * @return SyncInvoker<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse>
     */
    public SyncInvoker<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> showMessageClearRuleInvoker(
        ShowMessageClearRuleRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showMessageClearRule, hcClient);
    }

    /**
     * 获取消息邮件配置
     *
     * 获取消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageEmailConfigRequest 请求对象
     * @return ShowMessageEmailConfigResponse
     */
    public ShowMessageEmailConfigResponse showMessageEmailConfig(ShowMessageEmailConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showMessageEmailConfig);
    }

    /**
     * 获取消息邮件配置
     *
     * 获取消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageEmailConfigRequest 请求对象
     * @return SyncInvoker<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse>
     */
    public SyncInvoker<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> showMessageEmailConfigInvoker(
        ShowMessageEmailConfigRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showMessageEmailConfig, hcClient);
    }

    /**
     * 获取用户邮件配置
     *
     * 获取用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageReceiveConfigRequest 请求对象
     * @return ShowMessageReceiveConfigResponse
     */
    public ShowMessageReceiveConfigResponse showMessageReceiveConfig(ShowMessageReceiveConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showMessageReceiveConfig);
    }

    /**
     * 获取用户邮件配置
     *
     * 获取用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageReceiveConfigRequest 请求对象
     * @return SyncInvoker<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse>
     */
    public SyncInvoker<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> showMessageReceiveConfigInvoker(
        ShowMessageReceiveConfigRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showMessageReceiveConfig, hcClient);
    }

    /**
     * 查询分子或分子复合物批量下载任务详情
     *
     * 查询分子或分子复合物批量下载任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMolBatchDownloadTaskRequest 请求对象
     * @return ShowMolBatchDownloadTaskResponse
     */
    public ShowMolBatchDownloadTaskResponse showMolBatchDownloadTask(ShowMolBatchDownloadTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showMolBatchDownloadTask);
    }

    /**
     * 查询分子或分子复合物批量下载任务详情
     *
     * 查询分子或分子复合物批量下载任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMolBatchDownloadTaskRequest 请求对象
     * @return SyncInvoker<ShowMolBatchDownloadTaskRequest, ShowMolBatchDownloadTaskResponse>
     */
    public SyncInvoker<ShowMolBatchDownloadTaskRequest, ShowMolBatchDownloadTaskResponse> showMolBatchDownloadTaskInvoker(
        ShowMolBatchDownloadTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showMolBatchDownloadTask, hcClient);
    }

    /**
     * 查询分子优化作业详情
     *
     * 查询分子优化作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOptmJobRequest 请求对象
     * @return ShowOptmJobResponse
     */
    public ShowOptmJobResponse showOptmJob(ShowOptmJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showOptmJob);
    }

    /**
     * 查询分子优化作业详情
     *
     * 查询分子优化作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOptmJobRequest 请求对象
     * @return SyncInvoker<ShowOptmJobRequest, ShowOptmJobResponse>
     */
    public SyncInvoker<ShowOptmJobRequest, ShowOptmJobResponse> showOptmJobInvoker(ShowOptmJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showOptmJob, hcClient);
    }

    /**
     * 查询靶点口袋发现作业详情
     *
     * 查询靶点口袋发现作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPocketDetectionJobRequest 请求对象
     * @return ShowPocketDetectionJobResponse
     */
    public ShowPocketDetectionJobResponse showPocketDetectionJob(ShowPocketDetectionJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showPocketDetectionJob);
    }

    /**
     * 查询靶点口袋发现作业详情
     *
     * 查询靶点口袋发现作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPocketDetectionJobRequest 请求对象
     * @return SyncInvoker<ShowPocketDetectionJobRequest, ShowPocketDetectionJobResponse>
     */
    public SyncInvoker<ShowPocketDetectionJobRequest, ShowPocketDetectionJobResponse> showPocketDetectionJobInvoker(
        ShowPocketDetectionJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showPocketDetectionJob, hcClient);
    }

    /**
     * 查询靶点口袋分子设计作业详情
     *
     * 查询靶点口袋分子设计作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPocketMolDesignJobRequest 请求对象
     * @return ShowPocketMolDesignJobResponse
     */
    public ShowPocketMolDesignJobResponse showPocketMolDesignJob(ShowPocketMolDesignJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showPocketMolDesignJob);
    }

    /**
     * 查询靶点口袋分子设计作业详情
     *
     * 查询靶点口袋分子设计作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPocketMolDesignJobRequest 请求对象
     * @return SyncInvoker<ShowPocketMolDesignJobRequest, ShowPocketMolDesignJobResponse>
     */
    public SyncInvoker<ShowPocketMolDesignJobRequest, ShowPocketMolDesignJobResponse> showPocketMolDesignJobInvoker(
        ShowPocketMolDesignJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showPocketMolDesignJob, hcClient);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectRequest 请求对象
     * @return ShowProjectResponse
     */
    public ShowProjectResponse showProject(ShowProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showProject);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectRequest 请求对象
     * @return SyncInvoker<ShowProjectRequest, ShowProjectResponse>
     */
    public SyncInvoker<ShowProjectRequest, ShowProjectResponse> showProjectInvoker(ShowProjectRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showProject, hcClient);
    }

    /**
     * 获取项目审计日志
     *
     * 获取项目审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectTraceRequest 请求对象
     * @return ShowProjectTraceResponse
     */
    public ShowProjectTraceResponse showProjectTrace(ShowProjectTraceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showProjectTrace);
    }

    /**
     * 获取项目审计日志
     *
     * 获取项目审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectTraceRequest 请求对象
     * @return SyncInvoker<ShowProjectTraceRequest, ShowProjectTraceResponse>
     */
    public SyncInvoker<ShowProjectTraceRequest, ShowProjectTraceResponse> showProjectTraceInvoker(
        ShowProjectTraceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showProjectTrace, hcClient);
    }

    /**
     * 获取指定审计日志
     *
     * 获取指定审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectTraceDataRequest 请求对象
     * @return ShowProjectTraceDataResponse
     */
    public ShowProjectTraceDataResponse showProjectTraceData(ShowProjectTraceDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showProjectTraceData);
    }

    /**
     * 获取指定审计日志
     *
     * 获取指定审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectTraceDataRequest 请求对象
     * @return SyncInvoker<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse>
     */
    public SyncInvoker<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> showProjectTraceDataInvoker(
        ShowProjectTraceDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showProjectTraceData, hcClient);
    }

    /**
     * 获取项目审计日志追踪器
     *
     * 获取项目审计日志追踪器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectTrackerRequest 请求对象
     * @return ShowProjectTrackerResponse
     */
    public ShowProjectTrackerResponse showProjectTracker(ShowProjectTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showProjectTracker);
    }

    /**
     * 获取项目审计日志追踪器
     *
     * 获取项目审计日志追踪器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectTrackerRequest 请求对象
     * @return SyncInvoker<ShowProjectTrackerRequest, ShowProjectTrackerResponse>
     */
    public SyncInvoker<ShowProjectTrackerRequest, ShowProjectTrackerResponse> showProjectTrackerInvoker(
        ShowProjectTrackerRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showProjectTracker, hcClient);
    }

    /**
     * 获取资源监控数据
     *
     * 获取资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceMetricDataRequest 请求对象
     * @return ShowResourceMetricDataResponse
     */
    public ShowResourceMetricDataResponse showResourceMetricData(ShowResourceMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showResourceMetricData);
    }

    /**
     * 获取资源监控数据
     *
     * 获取资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceMetricDataRequest 请求对象
     * @return SyncInvoker<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse>
     */
    public SyncInvoker<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> showResourceMetricDataInvoker(
        ShowResourceMetricDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showResourceMetricData, hcClient);
    }

    /**
     * 查询缩容策略
     *
     * 查询缩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScaleInPolicyRequest 请求对象
     * @return ShowScaleInPolicyResponse
     */
    public ShowScaleInPolicyResponse showScaleInPolicy(ShowScaleInPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showScaleInPolicy);
    }

    /**
     * 查询缩容策略
     *
     * 查询缩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScaleInPolicyRequest 请求对象
     * @return SyncInvoker<ShowScaleInPolicyRequest, ShowScaleInPolicyResponse>
     */
    public SyncInvoker<ShowScaleInPolicyRequest, ShowScaleInPolicyResponse> showScaleInPolicyInvoker(
        ShowScaleInPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showScaleInPolicy, hcClient);
    }

    /**
     * 获取扩容策略详情
     *
     * 获取扩容策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScaleOutPolicyRequest 请求对象
     * @return ShowScaleOutPolicyResponse
     */
    public ShowScaleOutPolicyResponse showScaleOutPolicy(ShowScaleOutPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showScaleOutPolicy);
    }

    /**
     * 获取扩容策略详情
     *
     * 获取扩容策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScaleOutPolicyRequest 请求对象
     * @return SyncInvoker<ShowScaleOutPolicyRequest, ShowScaleOutPolicyResponse>
     */
    public SyncInvoker<ShowScaleOutPolicyRequest, ShowScaleOutPolicyResponse> showScaleOutPolicyInvoker(
        ShowScaleOutPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showScaleOutPolicy, hcClient);
    }

    /**
     * 查询计算资源调度信息
     *
     * 查询计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduleRequest 请求对象
     * @return ShowScheduleResponse
     */
    public ShowScheduleResponse showSchedule(ShowScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showSchedule);
    }

    /**
     * 查询计算资源调度信息
     *
     * 查询计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduleRequest 请求对象
     * @return SyncInvoker<ShowScheduleRequest, ShowScheduleResponse>
     */
    public SyncInvoker<ShowScheduleRequest, ShowScheduleResponse> showScheduleInvoker(ShowScheduleRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showSchedule, hcClient);
    }

    /**
     * 查询分子搜索作业详情
     *
     * 查询分子搜索作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchJobRequest 请求对象
     * @return ShowSearchJobResponse
     */
    public ShowSearchJobResponse showSearchJob(ShowSearchJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showSearchJob);
    }

    /**
     * 查询分子搜索作业详情
     *
     * 查询分子搜索作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchJobRequest 请求对象
     * @return SyncInvoker<ShowSearchJobRequest, ShowSearchJobResponse>
     */
    public SyncInvoker<ShowSearchJobRequest, ShowSearchJobResponse> showSearchJobInvoker(ShowSearchJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showSearchJob, hcClient);
    }

    /**
     * 查询分子合成路径规划作业详情
     *
     * 查询分子合成路径规划作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSynthesisJobRequest 请求对象
     * @return ShowSynthesisJobResponse
     */
    public ShowSynthesisJobResponse showSynthesisJob(ShowSynthesisJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showSynthesisJob);
    }

    /**
     * 查询分子合成路径规划作业详情
     *
     * 查询分子合成路径规划作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSynthesisJobRequest 请求对象
     * @return SyncInvoker<ShowSynthesisJobRequest, ShowSynthesisJobResponse>
     */
    public SyncInvoker<ShowSynthesisJobRequest, ShowSynthesisJobResponse> showSynthesisJobInvoker(
        ShowSynthesisJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showSynthesisJob, hcClient);
    }

    /**
     * 查询靶点优化作业详情
     *
     * 查询靶点优化作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTargetOptJobRequest 请求对象
     * @return ShowTargetOptJobResponse
     */
    public ShowTargetOptJobResponse showTargetOptJob(ShowTargetOptJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTargetOptJob);
    }

    /**
     * 查询靶点优化作业详情
     *
     * 查询靶点优化作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTargetOptJobRequest 请求对象
     * @return SyncInvoker<ShowTargetOptJobRequest, ShowTargetOptJobResponse>
     */
    public SyncInvoker<ShowTargetOptJobRequest, ShowTargetOptJobResponse> showTargetOptJobInvoker(
        ShowTargetOptJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showTargetOptJob, hcClient);
    }

    /**
     * 获取子任务启动事件
     *
     * 获取子任务启动事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskEventsRequest 请求对象
     * @return ShowTaskEventsResponse
     */
    public ShowTaskEventsResponse showTaskEvents(ShowTaskEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskEvents);
    }

    /**
     * 获取子任务启动事件
     *
     * 获取子任务启动事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskEventsRequest 请求对象
     * @return SyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse>
     */
    public SyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse> showTaskEventsInvoker(
        ShowTaskEventsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showTaskEvents, hcClient);
    }

    /**
     * 获取子任务中实例的事件
     *
     * 获取子任务中实例的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstanceEventsRequest 请求对象
     * @return ShowTaskInstanceEventsResponse
     */
    public ShowTaskInstanceEventsResponse showTaskInstanceEvents(ShowTaskInstanceEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskInstanceEvents);
    }

    /**
     * 获取子任务中实例的事件
     *
     * 获取子任务中实例的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstanceEventsRequest 请求对象
     * @return SyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse>
     */
    public SyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> showTaskInstanceEventsInvoker(
        ShowTaskInstanceEventsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showTaskInstanceEvents, hcClient);
    }

    /**
     * 获取子任务中实例的资源监控数据
     *
     * 获取子任务中实例的资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstanceMetricDataRequest 请求对象
     * @return ShowTaskInstanceMetricDataResponse
     */
    public ShowTaskInstanceMetricDataResponse showTaskInstanceMetricData(ShowTaskInstanceMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskInstanceMetricData);
    }

    /**
     * 获取子任务中实例的资源监控数据
     *
     * 获取子任务中实例的资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstanceMetricDataRequest 请求对象
     * @return SyncInvoker<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse>
     */
    public SyncInvoker<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> showTaskInstanceMetricDataInvoker(
        ShowTaskInstanceMetricDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showTaskInstanceMetricData, hcClient);
    }

    /**
     * 获取子任务中实例的pod信息
     *
     * 获取子任务中实例的pod信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstancePodRequest 请求对象
     * @return ShowTaskInstancePodResponse
     */
    public ShowTaskInstancePodResponse showTaskInstancePod(ShowTaskInstancePodRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskInstancePod);
    }

    /**
     * 获取子任务中实例的pod信息
     *
     * 获取子任务中实例的pod信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstancePodRequest 请求对象
     * @return SyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse>
     */
    public SyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> showTaskInstancePodInvoker(
        ShowTaskInstancePodRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showTaskInstancePod, hcClient);
    }

    /**
     * 获取子任务实例信息
     *
     * 获取子任务实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstancesRequest 请求对象
     * @return ShowTaskInstancesResponse
     */
    public ShowTaskInstancesResponse showTaskInstances(ShowTaskInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskInstances);
    }

    /**
     * 获取子任务实例信息
     *
     * 获取子任务实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstancesRequest 请求对象
     * @return SyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse>
     */
    public SyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse> showTaskInstancesInvoker(
        ShowTaskInstancesRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showTaskInstances, hcClient);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateRequest 请求对象
     * @return ShowTemplateResponse
     */
    public ShowTemplateResponse showTemplate(ShowTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTemplate);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateRequest 请求对象
     * @return SyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public SyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateInvoker(ShowTemplateRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showTemplate, hcClient);
    }

    /**
     * 获取指定用户详情
     *
     * 获取指定用户详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return ShowUserResponse
     */
    public ShowUserResponse showUser(ShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showUser);
    }

    /**
     * 获取指定用户详情
     *
     * 获取指定用户详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return SyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public SyncInvoker<ShowUserRequest, ShowUserResponse> showUserInvoker(ShowUserRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showUser, hcClient);
    }

    /**
     * 查询用户设置
     *
     * 查询用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserSettingRequest 请求对象
     * @return ShowUserSettingResponse
     */
    public ShowUserSettingResponse showUserSetting(ShowUserSettingRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showUserSetting);
    }

    /**
     * 查询用户设置
     *
     * 查询用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserSettingRequest 请求对象
     * @return SyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse>
     */
    public SyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse> showUserSettingInvoker(
        ShowUserSettingRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showUserSetting, hcClient);
    }

    /**
     * 获取供应商配置
     *
     * 获取供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVendorRequest 请求对象
     * @return ShowVendorResponse
     */
    public ShowVendorResponse showVendor(ShowVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showVendor);
    }

    /**
     * 获取供应商配置
     *
     * 获取供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVendorRequest 请求对象
     * @return SyncInvoker<ShowVendorRequest, ShowVendorResponse>
     */
    public SyncInvoker<ShowVendorRequest, ShowVendorResponse> showVendorInvoker(ShowVendorRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showVendor, hcClient);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowRequest 请求对象
     * @return ShowWorkflowResponse
     */
    public ShowWorkflowResponse showWorkflow(ShowWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showWorkflow);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowRequest 请求对象
     * @return SyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse>
     */
    public SyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflowInvoker(ShowWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showWorkflow, hcClient);
    }

    /**
     * 启动自动作业
     *
     * 启动自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoJobRequest 请求对象
     * @return StartAutoJobResponse
     */
    public StartAutoJobResponse startAutoJob(StartAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.startAutoJob);
    }

    /**
     * 启动自动作业
     *
     * 启动自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoJobRequest 请求对象
     * @return SyncInvoker<StartAutoJobRequest, StartAutoJobResponse>
     */
    public SyncInvoker<StartAutoJobRequest, StartAutoJobResponse> startAutoJobInvoker(StartAutoJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.startAutoJob, hcClient);
    }

    /**
     * 启动计算资源
     *
     * 启动计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartNodeRequest 请求对象
     * @return StartNodeResponse
     */
    public StartNodeResponse startNode(StartNodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.startNode);
    }

    /**
     * 启动计算资源
     *
     * 启动计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartNodeRequest 请求对象
     * @return SyncInvoker<StartNodeRequest, StartNodeResponse>
     */
    public SyncInvoker<StartNodeRequest, StartNodeResponse> startNodeInvoker(StartNodeRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.startNode, hcClient);
    }

    /**
     * 启动自动扩容策略
     *
     * 启动自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartScaleOutPolicyRequest 请求对象
     * @return StartScaleOutPolicyResponse
     */
    public StartScaleOutPolicyResponse startScaleOutPolicy(StartScaleOutPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.startScaleOutPolicy);
    }

    /**
     * 启动自动扩容策略
     *
     * 启动自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartScaleOutPolicyRequest 请求对象
     * @return SyncInvoker<StartScaleOutPolicyRequest, StartScaleOutPolicyResponse>
     */
    public SyncInvoker<StartScaleOutPolicyRequest, StartScaleOutPolicyResponse> startScaleOutPolicyInvoker(
        StartScaleOutPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.startScaleOutPolicy, hcClient);
    }

    /**
     * 停止自动作业
     *
     * 停止自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAutoJobRequest 请求对象
     * @return StopAutoJobResponse
     */
    public StopAutoJobResponse stopAutoJob(StopAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.stopAutoJob);
    }

    /**
     * 停止自动作业
     *
     * 停止自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAutoJobRequest 请求对象
     * @return SyncInvoker<StopAutoJobRequest, StopAutoJobResponse>
     */
    public SyncInvoker<StopAutoJobRequest, StopAutoJobResponse> stopAutoJobInvoker(StopAutoJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.stopAutoJob, hcClient);
    }

    /**
     * 关闭计算资源
     *
     * 关闭计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopNodeRequest 请求对象
     * @return StopNodeResponse
     */
    public StopNodeResponse stopNode(StopNodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.stopNode);
    }

    /**
     * 关闭计算资源
     *
     * 关闭计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopNodeRequest 请求对象
     * @return SyncInvoker<StopNodeRequest, StopNodeResponse>
     */
    public SyncInvoker<StopNodeRequest, StopNodeResponse> stopNodeInvoker(StopNodeRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.stopNode, hcClient);
    }

    /**
     * 停用自动扩容策略
     *
     * 停用自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopScaleOutPolicyRequest 请求对象
     * @return StopScaleOutPolicyResponse
     */
    public StopScaleOutPolicyResponse stopScaleOutPolicy(StopScaleOutPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.stopScaleOutPolicy);
    }

    /**
     * 停用自动扩容策略
     *
     * 停用自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopScaleOutPolicyRequest 请求对象
     * @return SyncInvoker<StopScaleOutPolicyRequest, StopScaleOutPolicyResponse>
     */
    public SyncInvoker<StopScaleOutPolicyRequest, StopScaleOutPolicyResponse> stopScaleOutPolicyInvoker(
        StopScaleOutPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.stopScaleOutPolicy, hcClient);
    }

    /**
     * 订阅应用
     *
     * 订阅应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeAppRequest 请求对象
     * @return SubscribeAppResponse
     */
    public SubscribeAppResponse subscribeApp(SubscribeAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.subscribeApp);
    }

    /**
     * 订阅应用
     *
     * 订阅应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeAppRequest 请求对象
     * @return SyncInvoker<SubscribeAppRequest, SubscribeAppResponse>
     */
    public SyncInvoker<SubscribeAppRequest, SubscribeAppResponse> subscribeAppInvoker(SubscribeAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.subscribeApp, hcClient);
    }

    /**
     * 订阅资产市场数据
     *
     * 订阅资产市场数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeDataRequest 请求对象
     * @return SubscribeDataResponse
     */
    public SubscribeDataResponse subscribeData(SubscribeDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.subscribeData);
    }

    /**
     * 订阅资产市场数据
     *
     * 订阅资产市场数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeDataRequest 请求对象
     * @return SyncInvoker<SubscribeDataRequest, SubscribeDataResponse>
     */
    public SyncInvoker<SubscribeDataRequest, SubscribeDataResponse> subscribeDataInvoker(SubscribeDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.subscribeData, hcClient);
    }

    /**
     * 订阅镜像
     *
     * 订阅镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeImageRequest 请求对象
     * @return SubscribeImageResponse
     */
    public SubscribeImageResponse subscribeImage(SubscribeImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.subscribeImage);
    }

    /**
     * 订阅镜像
     *
     * 订阅镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeImageRequest 请求对象
     * @return SyncInvoker<SubscribeImageRequest, SubscribeImageResponse>
     */
    public SyncInvoker<SubscribeImageRequest, SubscribeImageResponse> subscribeImageInvoker(
        SubscribeImageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.subscribeImage, hcClient);
    }

    /**
     * 订阅流程
     *
     * 订阅流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeWorkflowRequest 请求对象
     * @return SubscribeWorkflowResponse
     */
    public SubscribeWorkflowResponse subscribeWorkflow(SubscribeWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.subscribeWorkflow);
    }

    /**
     * 订阅流程
     *
     * 订阅流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeWorkflowRequest 请求对象
     * @return SyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse>
     */
    public SyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse> subscribeWorkflowInvoker(
        SubscribeWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.subscribeWorkflow, hcClient);
    }

    /**
     * 转移项目
     *
     * 转移项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferProjectRequest 请求对象
     * @return TransferProjectResponse
     */
    public TransferProjectResponse transferProject(TransferProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.transferProject);
    }

    /**
     * 转移项目
     *
     * 转移项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferProjectRequest 请求对象
     * @return SyncInvoker<TransferProjectRequest, TransferProjectResponse>
     */
    public SyncInvoker<TransferProjectRequest, TransferProjectResponse> transferProjectInvoker(
        TransferProjectRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.transferProject, hcClient);
    }

    /**
     * 更新业务委托
     *
     * 更新业务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyRequest 请求对象
     * @return UpdateAgencyResponse
     */
    public UpdateAgencyResponse updateAgency(UpdateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateAgency);
    }

    /**
     * 更新业务委托
     *
     * 更新业务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyRequest 请求对象
     * @return SyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse>
     */
    public SyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse> updateAgencyInvoker(UpdateAgencyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateAgency, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateApp);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateApp, hcClient);
    }

    /**
     * 修改跨域归档设置
     *
     * 修改跨域归档设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArchiveConfigRequest 请求对象
     * @return UpdateArchiveConfigResponse
     */
    public UpdateArchiveConfigResponse updateArchiveConfig(UpdateArchiveConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateArchiveConfig);
    }

    /**
     * 修改跨域归档设置
     *
     * 修改跨域归档设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArchiveConfigRequest 请求对象
     * @return SyncInvoker<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse>
     */
    public SyncInvoker<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> updateArchiveConfigInvoker(
        UpdateArchiveConfigRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateArchiveConfig, hcClient);
    }

    /**
     * 更新资产指定版本的信息
     *
     * 更新资产指定版本的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetVersionRequest 请求对象
     * @return UpdateAssetVersionResponse
     */
    public UpdateAssetVersionResponse updateAssetVersion(UpdateAssetVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateAssetVersion);
    }

    /**
     * 更新资产指定版本的信息
     *
     * 更新资产指定版本的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetVersionRequest 请求对象
     * @return SyncInvoker<UpdateAssetVersionRequest, UpdateAssetVersionResponse>
     */
    public SyncInvoker<UpdateAssetVersionRequest, UpdateAssetVersionResponse> updateAssetVersionInvoker(
        UpdateAssetVersionRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateAssetVersion, hcClient);
    }

    /**
     * 更新自动作业模板
     *
     * 更新自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoJobRequest 请求对象
     * @return UpdateAutoJobResponse
     */
    public UpdateAutoJobResponse updateAutoJob(UpdateAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateAutoJob);
    }

    /**
     * 更新自动作业模板
     *
     * 更新自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoJobRequest 请求对象
     * @return SyncInvoker<UpdateAutoJobRequest, UpdateAutoJobResponse>
     */
    public SyncInvoker<UpdateAutoJobRequest, UpdateAutoJobResponse> updateAutoJobInvoker(UpdateAutoJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateAutoJob, hcClient);
    }

    /**
     * 设置数据对象策略
     *
     * 设置数据对象策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataPathPolicyRequest 请求对象
     * @return UpdateDataPathPolicyResponse
     */
    public UpdateDataPathPolicyResponse updateDataPathPolicy(UpdateDataPathPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDataPathPolicy);
    }

    /**
     * 设置数据对象策略
     *
     * 设置数据对象策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataPathPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse>
     */
    public SyncInvoker<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> updateDataPathPolicyInvoker(
        UpdateDataPathPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateDataPathPolicy, hcClient);
    }

    /**
     * 设置项目级权限控制策略
     *
     * 设置项目级权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataPolicyRequest 请求对象
     * @return UpdateDataPolicyResponse
     */
    public UpdateDataPolicyResponse updateDataPolicy(UpdateDataPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDataPolicy);
    }

    /**
     * 设置项目级权限控制策略
     *
     * 设置项目级权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDataPolicyRequest, UpdateDataPolicyResponse>
     */
    public SyncInvoker<UpdateDataPolicyRequest, UpdateDataPolicyResponse> updateDataPolicyInvoker(
        UpdateDataPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateDataPolicy, hcClient);
    }

    /**
     * 更新数据
     *
     * 更新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseDataRequest 请求对象
     * @return UpdateDatabaseDataResponse
     */
    public UpdateDatabaseDataResponse updateDatabaseData(UpdateDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDatabaseData);
    }

    /**
     * 更新数据
     *
     * 更新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseDataRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse>
     */
    public SyncInvoker<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> updateDatabaseDataInvoker(
        UpdateDatabaseDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateDatabaseData, hcClient);
    }

    /**
     * 更新药物数据库
     *
     * 更新药物数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugDatabaseRequest 请求对象
     * @return UpdateDrugDatabaseResponse
     */
    public UpdateDrugDatabaseResponse updateDrugDatabase(UpdateDrugDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDrugDatabase);
    }

    /**
     * 更新药物数据库
     *
     * 更新药物数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugDatabaseRequest 请求对象
     * @return SyncInvoker<UpdateDrugDatabaseRequest, UpdateDrugDatabaseResponse>
     */
    public SyncInvoker<UpdateDrugDatabaseRequest, UpdateDrugDatabaseResponse> updateDrugDatabaseInvoker(
        UpdateDrugDatabaseRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateDrugDatabase, hcClient);
    }

    /**
     * 更新药物作业
     *
     * 更新药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugJobRequest 请求对象
     * @return UpdateDrugJobResponse
     */
    public UpdateDrugJobResponse updateDrugJob(UpdateDrugJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDrugJob);
    }

    /**
     * 更新药物作业
     *
     * 更新药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugJobRequest 请求对象
     * @return SyncInvoker<UpdateDrugJobRequest, UpdateDrugJobResponse>
     */
    public SyncInvoker<UpdateDrugJobRequest, UpdateDrugJobResponse> updateDrugJobInvoker(UpdateDrugJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateDrugJob, hcClient);
    }

    /**
     * 更新药物模型
     *
     * 更新药物模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugModelRequest 请求对象
     * @return UpdateDrugModelResponse
     */
    public UpdateDrugModelResponse updateDrugModel(UpdateDrugModelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDrugModel);
    }

    /**
     * 更新药物模型
     *
     * 更新药物模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugModelRequest 请求对象
     * @return SyncInvoker<UpdateDrugModelRequest, UpdateDrugModelResponse>
     */
    public SyncInvoker<UpdateDrugModelRequest, UpdateDrugModelResponse> updateDrugModelInvoker(
        UpdateDrugModelRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateDrugModel, hcClient);
    }

    /**
     * 更新镜像描述信息或者类型
     *
     * 更新镜像描述信息或者类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageRequest 请求对象
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateImage);
    }

    /**
     * 更新镜像描述信息或者类型
     *
     * 更新镜像描述信息或者类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageRequest 请求对象
     * @return SyncInvoker<UpdateImageRequest, UpdateImageResponse>
     */
    public SyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageInvoker(UpdateImageRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateImage, hcClient);
    }

    /**
     * 新用户重置密码
     *
     * 新用户重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInitPasswordRequest 请求对象
     * @return UpdateInitPasswordResponse
     */
    public UpdateInitPasswordResponse updateInitPassword(UpdateInitPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateInitPassword);
    }

    /**
     * 新用户重置密码
     *
     * 新用户重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInitPasswordRequest 请求对象
     * @return SyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse>
     */
    public SyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse> updateInitPasswordInvoker(
        UpdateInitPasswordRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateInitPassword, hcClient);
    }

    /**
     * 更新作业
     *
     * 更新作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateJob);
    }

    /**
     * 更新作业
     *
     * 更新作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return SyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public SyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobInvoker(UpdateJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateJob, hcClient);
    }

    /**
     * 设置作业配置
     *
     * 设置作业配置，目前支持修改作业保存条数(1万条-1000万条)，默认设置为500万条；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobConfigRequest 请求对象
     * @return UpdateJobConfigResponse
     */
    public UpdateJobConfigResponse updateJobConfig(UpdateJobConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateJobConfig);
    }

    /**
     * 设置作业配置
     *
     * 设置作业配置，目前支持修改作业保存条数(1万条-1000万条)，默认设置为500万条；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobConfigRequest 请求对象
     * @return SyncInvoker<UpdateJobConfigRequest, UpdateJobConfigResponse>
     */
    public SyncInvoker<UpdateJobConfigRequest, UpdateJobConfigResponse> updateJobConfigInvoker(
        UpdateJobConfigRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateJobConfig, hcClient);
    }

    /**
     * 更新或者添加项目成员角色
     *
     * 更新或者添加项目成员角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberRequest 请求对象
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(UpdateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateMember);
    }

    /**
     * 更新或者添加项目成员角色
     *
     * 更新或者添加项目成员角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberRequest 请求对象
     * @return SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public SyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberInvoker(UpdateMemberRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateMember, hcClient);
    }

    /**
     * 设置消息清理规则
     *
     * 设置消息清理规则，支持修改记录数(1W-1000W)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageClearRuleRequestBodyRequest 请求对象
     * @return UpdateMessageClearRuleRequestBodyResponse
     */
    public UpdateMessageClearRuleRequestBodyResponse updateMessageClearRuleRequestBody(
        UpdateMessageClearRuleRequestBodyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateMessageClearRuleRequestBody);
    }

    /**
     * 设置消息清理规则
     *
     * 设置消息清理规则，支持修改记录数(1W-1000W)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageClearRuleRequestBodyRequest 请求对象
     * @return SyncInvoker<UpdateMessageClearRuleRequestBodyRequest, UpdateMessageClearRuleRequestBodyResponse>
     */
    public SyncInvoker<UpdateMessageClearRuleRequestBodyRequest, UpdateMessageClearRuleRequestBodyResponse> updateMessageClearRuleRequestBodyInvoker(
        UpdateMessageClearRuleRequestBodyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateMessageClearRuleRequestBody, hcClient);
    }

    /**
     * 设置消息邮件配置
     *
     * 设置消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageEmailConfigRequest 请求对象
     * @return UpdateMessageEmailConfigResponse
     */
    public UpdateMessageEmailConfigResponse updateMessageEmailConfig(UpdateMessageEmailConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateMessageEmailConfig);
    }

    /**
     * 设置消息邮件配置
     *
     * 设置消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageEmailConfigRequest 请求对象
     * @return SyncInvoker<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse>
     */
    public SyncInvoker<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> updateMessageEmailConfigInvoker(
        UpdateMessageEmailConfigRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateMessageEmailConfig, hcClient);
    }

    /**
     * 设置用户邮件配置
     *
     * 设置用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageReceiveConfigRequest 请求对象
     * @return UpdateMessageReceiveConfigResponse
     */
    public UpdateMessageReceiveConfigResponse updateMessageReceiveConfig(UpdateMessageReceiveConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateMessageReceiveConfig);
    }

    /**
     * 设置用户邮件配置
     *
     * 设置用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageReceiveConfigRequest 请求对象
     * @return SyncInvoker<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse>
     */
    public SyncInvoker<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> updateMessageReceiveConfigInvoker(
        UpdateMessageReceiveConfigRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateMessageReceiveConfig, hcClient);
    }

    /**
     * 更新性能加速资源配置
     *
     * 更新性能加速资源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePerformanceResourceRequest 请求对象
     * @return UpdatePerformanceResourceResponse
     */
    public UpdatePerformanceResourceResponse updatePerformanceResource(UpdatePerformanceResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updatePerformanceResource);
    }

    /**
     * 更新性能加速资源配置
     *
     * 更新性能加速资源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePerformanceResourceRequest 请求对象
     * @return SyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse>
     */
    public SyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> updatePerformanceResourceInvoker(
        UpdatePerformanceResourceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updatePerformanceResource, hcClient);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectRequest 请求对象
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateProject);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectRequest 请求对象
     * @return SyncInvoker<UpdateProjectRequest, UpdateProjectResponse>
     */
    public SyncInvoker<UpdateProjectRequest, UpdateProjectResponse> updateProjectInvoker(UpdateProjectRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateProject, hcClient);
    }

    /**
     * 更新项目审计日志追踪器配置
     *
     * 更新项目审计日志追踪器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectTrackerRequest 请求对象
     * @return UpdateProjectTrackerResponse
     */
    public UpdateProjectTrackerResponse updateProjectTracker(UpdateProjectTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateProjectTracker);
    }

    /**
     * 更新项目审计日志追踪器配置
     *
     * 更新项目审计日志追踪器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectTrackerRequest 请求对象
     * @return SyncInvoker<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse>
     */
    public SyncInvoker<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> updateProjectTrackerInvoker(
        UpdateProjectTrackerRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateProjectTracker, hcClient);
    }

    /**
     * 修改缩容策略
     *
     * 修改缩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScaleInPolicyRequest 请求对象
     * @return UpdateScaleInPolicyResponse
     */
    public UpdateScaleInPolicyResponse updateScaleInPolicy(UpdateScaleInPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateScaleInPolicy);
    }

    /**
     * 修改缩容策略
     *
     * 修改缩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScaleInPolicyRequest 请求对象
     * @return SyncInvoker<UpdateScaleInPolicyRequest, UpdateScaleInPolicyResponse>
     */
    public SyncInvoker<UpdateScaleInPolicyRequest, UpdateScaleInPolicyResponse> updateScaleInPolicyInvoker(
        UpdateScaleInPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateScaleInPolicy, hcClient);
    }

    /**
     * 修改扩容策略
     *
     * 修改扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScaleOutPolicyRequest 请求对象
     * @return UpdateScaleOutPolicyResponse
     */
    public UpdateScaleOutPolicyResponse updateScaleOutPolicy(UpdateScaleOutPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateScaleOutPolicy);
    }

    /**
     * 修改扩容策略
     *
     * 修改扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScaleOutPolicyRequest 请求对象
     * @return SyncInvoker<UpdateScaleOutPolicyRequest, UpdateScaleOutPolicyResponse>
     */
    public SyncInvoker<UpdateScaleOutPolicyRequest, UpdateScaleOutPolicyResponse> updateScaleOutPolicyInvoker(
        UpdateScaleOutPolicyRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateScaleOutPolicy, hcClient);
    }

    /**
     * 修改计算资源调度信息
     *
     * 修改计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleRequest 请求对象
     * @return UpdateScheduleResponse
     */
    public UpdateScheduleResponse updateSchedule(UpdateScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateSchedule);
    }

    /**
     * 修改计算资源调度信息
     *
     * 修改计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleRequest 请求对象
     * @return SyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse>
     */
    public SyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse> updateScheduleInvoker(
        UpdateScheduleRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateSchedule, hcClient);
    }

    /**
     * 收藏资产
     *
     * 收藏资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRequest 请求对象
     * @return UpdateStarResponse
     */
    public UpdateStarResponse updateStar(UpdateStarRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateStar);
    }

    /**
     * 收藏资产
     *
     * 收藏资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRequest 请求对象
     * @return SyncInvoker<UpdateStarRequest, UpdateStarResponse>
     */
    public SyncInvoker<UpdateStarRequest, UpdateStarResponse> updateStarInvoker(UpdateStarRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateStar, hcClient);
    }

    /**
     * 置顶空间
     *
     * 置顶空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopProjectRequest 请求对象
     * @return UpdateTopProjectResponse
     */
    public UpdateTopProjectResponse updateTopProject(UpdateTopProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateTopProject);
    }

    /**
     * 置顶空间
     *
     * 置顶空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopProjectRequest 请求对象
     * @return SyncInvoker<UpdateTopProjectRequest, UpdateTopProjectResponse>
     */
    public SyncInvoker<UpdateTopProjectRequest, UpdateTopProjectResponse> updateTopProjectInvoker(
        UpdateTopProjectRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateTopProject, hcClient);
    }

    /**
     * 修改用户基本信息
     *
     * 修改用户基本信息（邮箱，手机）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateUser);
    }

    /**
     * 修改用户基本信息
     *
     * 修改用户基本信息（邮箱，手机）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateUser, hcClient);
    }

    /**
     * 最终租户修改子用户
     *
     * 最终租户修改子用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserByDomainRequest 请求对象
     * @return UpdateUserByDomainResponse
     */
    public UpdateUserByDomainResponse updateUserByDomain(UpdateUserByDomainRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateUserByDomain);
    }

    /**
     * 最终租户修改子用户
     *
     * 最终租户修改子用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserByDomainRequest 请求对象
     * @return SyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse>
     */
    public SyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse> updateUserByDomainInvoker(
        UpdateUserByDomainRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateUserByDomain, hcClient);
    }

    /**
     * 更新用户角色
     *
     * 更新用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRoleRequest 请求对象
     * @return UpdateUserRoleResponse
     */
    public UpdateUserRoleResponse updateUserRole(UpdateUserRoleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateUserRole);
    }

    /**
     * 更新用户角色
     *
     * 更新用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRoleRequest 请求对象
     * @return SyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse>
     */
    public SyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse> updateUserRoleInvoker(
        UpdateUserRoleRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateUserRole, hcClient);
    }

    /**
     * 更新用户设置
     *
     * 更新用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserSettingRequest 请求对象
     * @return UpdateUserSettingResponse
     */
    public UpdateUserSettingResponse updateUserSetting(UpdateUserSettingRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateUserSetting);
    }

    /**
     * 更新用户设置
     *
     * 更新用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserSettingRequest 请求对象
     * @return SyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse>
     */
    public SyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse> updateUserSettingInvoker(
        UpdateUserSettingRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateUserSetting, hcClient);
    }

    /**
     * 设置供应商配置
     *
     * 设置供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVendorRequest 请求对象
     * @return UpdateVendorResponse
     */
    public UpdateVendorResponse updateVendor(UpdateVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateVendor);
    }

    /**
     * 设置供应商配置
     *
     * 设置供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVendorRequest 请求对象
     * @return SyncInvoker<UpdateVendorRequest, UpdateVendorResponse>
     */
    public SyncInvoker<UpdateVendorRequest, UpdateVendorResponse> updateVendorInvoker(UpdateVendorRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateVendor, hcClient);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateWorkflow);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowInvoker(
        UpdateWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateWorkflow, hcClient);
    }

    /**
     * 上传数据文件
     *
     * 上传数据文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadDataRequest 请求对象
     * @return UploadDataResponse
     */
    public UploadDataResponse uploadData(UploadDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.uploadData);
    }

    /**
     * 上传数据文件
     *
     * 上传数据文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadDataRequest 请求对象
     * @return SyncInvoker<UploadDataRequest, UploadDataResponse>
     */
    public SyncInvoker<UploadDataRequest, UploadDataResponse> uploadDataInvoker(UploadDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.uploadData, hcClient);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadTemplateRequest 请求对象
     * @return UploadTemplateResponse
     */
    public UploadTemplateResponse uploadTemplate(UploadTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.uploadTemplate);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadTemplateRequest 请求对象
     * @return SyncInvoker<UploadTemplateRequest, UploadTemplateResponse>
     */
    public SyncInvoker<UploadTemplateRequest, UploadTemplateResponse> uploadTemplateInvoker(
        UploadTemplateRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.uploadTemplate, hcClient);
    }

    /**
     * 预验证
     *
     * 预验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateCodeRequest 请求对象
     * @return ValidateCodeResponse
     */
    public ValidateCodeResponse validateCode(ValidateCodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.validateCode);
    }

    /**
     * 预验证
     *
     * 预验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateCodeRequest 请求对象
     * @return SyncInvoker<ValidateCodeRequest, ValidateCodeResponse>
     */
    public SyncInvoker<ValidateCodeRequest, ValidateCodeResponse> validateCodeInvoker(ValidateCodeRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.validateCode, hcClient);
    }

    /**
     * ADMET属性预测接口
     *
     * 计算小分子的物化性质，包括吸收(adsorption)、分布(distribution)、代谢(metabolism)、清除(excretion)与毒性(toxicity)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdmetPropertiesRequest 请求对象
     * @return ShowAdmetPropertiesResponse
     */
    public ShowAdmetPropertiesResponse showAdmetProperties(ShowAdmetPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAdmetProperties);
    }

    /**
     * ADMET属性预测接口
     *
     * 计算小分子的物化性质，包括吸收(adsorption)、分布(distribution)、代谢(metabolism)、清除(excretion)与毒性(toxicity)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdmetPropertiesRequest 请求对象
     * @return SyncInvoker<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse>
     */
    public SyncInvoker<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> showAdmetPropertiesInvoker(
        ShowAdmetPropertiesRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showAdmetProperties, hcClient);
    }

    /**
     * 创建CPI作业
     *
     * 创建CPI作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCpiJobRequest 请求对象
     * @return CreateCpiJobResponse
     */
    public CreateCpiJobResponse createCpiJob(CreateCpiJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createCpiJob);
    }

    /**
     * 创建CPI作业
     *
     * 创建CPI作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCpiJobRequest 请求对象
     * @return SyncInvoker<CreateCpiJobRequest, CreateCpiJobResponse>
     */
    public SyncInvoker<CreateCpiJobRequest, CreateCpiJobResponse> createCpiJobInvoker(CreateCpiJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createCpiJob, hcClient);
    }

    /**
     * 新建CPI任务接口
     *
     * 输入蛋白序列、小分子库，创建分子-蛋白互作预测任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCpiTaskRequest 请求对象
     * @return CreateCpiTaskResponse
     */
    public CreateCpiTaskResponse createCpiTask(CreateCpiTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createCpiTask);
    }

    /**
     * 新建CPI任务接口
     *
     * 输入蛋白序列、小分子库，创建分子-蛋白互作预测任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCpiTaskRequest 请求对象
     * @return SyncInvoker<CreateCpiTaskRequest, CreateCpiTaskResponse>
     */
    public SyncInvoker<CreateCpiTaskRequest, CreateCpiTaskResponse> createCpiTaskInvoker(CreateCpiTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createCpiTask, hcClient);
    }

    /**
     * 查询CPI作业详情
     *
     * 查询CPI作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCpiJobRequest 请求对象
     * @return ShowCpiJobResponse
     */
    public ShowCpiJobResponse showCpiJob(ShowCpiJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showCpiJob);
    }

    /**
     * 查询CPI作业详情
     *
     * 查询CPI作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCpiJobRequest 请求对象
     * @return SyncInvoker<ShowCpiJobRequest, ShowCpiJobResponse>
     */
    public SyncInvoker<ShowCpiJobRequest, ShowCpiJobResponse> showCpiJobInvoker(ShowCpiJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showCpiJob, hcClient);
    }

    /**
     * 查询CPI任务
     *
     * 通过CPI任务ID查询CPI任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCpiTaskResultRequest 请求对象
     * @return ShowCpiTaskResultResponse
     */
    public ShowCpiTaskResultResponse showCpiTaskResult(ShowCpiTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showCpiTaskResult);
    }

    /**
     * 查询CPI任务
     *
     * 通过CPI任务ID查询CPI任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCpiTaskResultRequest 请求对象
     * @return SyncInvoker<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse>
     */
    public SyncInvoker<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> showCpiTaskResultInvoker(
        ShowCpiTaskResultRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showCpiTaskResult, hcClient);
    }

    /**
     * 绑定CSS集群
     *
     * 绑定CSS集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCssClusterRequest 请求对象
     * @return CreateCssClusterResponse
     */
    public CreateCssClusterResponse createCssCluster(CreateCssClusterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createCssCluster);
    }

    /**
     * 绑定CSS集群
     *
     * 绑定CSS集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCssClusterRequest 请求对象
     * @return SyncInvoker<CreateCssClusterRequest, CreateCssClusterResponse>
     */
    public SyncInvoker<CreateCssClusterRequest, CreateCssClusterResponse> createCssClusterInvoker(
        CreateCssClusterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createCssCluster, hcClient);
    }

    /**
     * CSS集群解绑
     *
     * CSS集群解绑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCssClusterRequest 请求对象
     * @return DeleteCssClusterResponse
     */
    public DeleteCssClusterResponse deleteCssCluster(DeleteCssClusterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteCssCluster);
    }

    /**
     * CSS集群解绑
     *
     * CSS集群解绑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCssClusterRequest 请求对象
     * @return SyncInvoker<DeleteCssClusterRequest, DeleteCssClusterResponse>
     */
    public SyncInvoker<DeleteCssClusterRequest, DeleteCssClusterResponse> deleteCssClusterInvoker(
        DeleteCssClusterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteCssCluster, hcClient);
    }

    /**
     * 获取CSS集群列表
     *
     * 获取CSS集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCssClusterRequest 请求对象
     * @return ListCssClusterResponse
     */
    public ListCssClusterResponse listCssCluster(ListCssClusterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listCssCluster);
    }

    /**
     * 获取CSS集群列表
     *
     * 获取CSS集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCssClusterRequest 请求对象
     * @return SyncInvoker<ListCssClusterRequest, ListCssClusterResponse>
     */
    public SyncInvoker<ListCssClusterRequest, ListCssClusterResponse> listCssClusterInvoker(
        ListCssClusterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listCssCluster, hcClient);
    }

    /**
     * 获取最终租户CSS集群列表
     *
     * 获取最终租户CSS集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTermTenantCssClusterRequest 请求对象
     * @return ListTermTenantCssClusterResponse
     */
    public ListTermTenantCssClusterResponse listTermTenantCssCluster(ListTermTenantCssClusterRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listTermTenantCssCluster);
    }

    /**
     * 获取最终租户CSS集群列表
     *
     * 获取最终租户CSS集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTermTenantCssClusterRequest 请求对象
     * @return SyncInvoker<ListTermTenantCssClusterRequest, ListTermTenantCssClusterResponse>
     */
    public SyncInvoker<ListTermTenantCssClusterRequest, ListTermTenantCssClusterResponse> listTermTenantCssClusterInvoker(
        ListTermTenantCssClusterRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listTermTenantCssCluster, hcClient);
    }

    /**
     * 测试CSS集群连接
     *
     * 测试CSS集群连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateCssConnectionRequest 请求对象
     * @return ValidateCssConnectionResponse
     */
    public ValidateCssConnectionResponse validateCssConnection(ValidateCssConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.validateCssConnection);
    }

    /**
     * 测试CSS集群连接
     *
     * 测试CSS集群连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateCssConnectionRequest 请求对象
     * @return SyncInvoker<ValidateCssConnectionRequest, ValidateCssConnectionResponse>
     */
    public SyncInvoker<ValidateCssConnectionRequest, ValidateCssConnectionResponse> validateCssConnectionInvoker(
        ValidateCssConnectionRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.validateCssConnection, hcClient);
    }

    /**
     * 新建自定义属性任务接口
     *
     * 输入自定义属性的任务数据，创建自定义属性建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomPropsTaskRequest 请求对象
     * @return CreateCustomPropsTaskResponse
     */
    public CreateCustomPropsTaskResponse createCustomPropsTask(CreateCustomPropsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createCustomPropsTask);
    }

    /**
     * 新建自定义属性任务接口
     *
     * 输入自定义属性的任务数据，创建自定义属性建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomPropsTaskRequest 请求对象
     * @return SyncInvoker<CreateCustomPropsTaskRequest, CreateCustomPropsTaskResponse>
     */
    public SyncInvoker<CreateCustomPropsTaskRequest, CreateCustomPropsTaskResponse> createCustomPropsTaskInvoker(
        CreateCustomPropsTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createCustomPropsTask, hcClient);
    }

    /**
     * 查询自定义属性任务
     *
     * 通过自定义属性任务ID查询任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomPropsTaskResultRequest 请求对象
     * @return ShowCustomPropsTaskResultResponse
     */
    public ShowCustomPropsTaskResultResponse showCustomPropsTaskResult(ShowCustomPropsTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showCustomPropsTaskResult);
    }

    /**
     * 查询自定义属性任务
     *
     * 通过自定义属性任务ID查询任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomPropsTaskResultRequest 请求对象
     * @return SyncInvoker<ShowCustomPropsTaskResultRequest, ShowCustomPropsTaskResultResponse>
     */
    public SyncInvoker<ShowCustomPropsTaskResultRequest, ShowCustomPropsTaskResultResponse> showCustomPropsTaskResultInvoker(
        ShowCustomPropsTaskResultRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showCustomPropsTaskResult, hcClient);
    }

    /**
     * 新建分子生成任务接口
     *
     * 输入分子属性约束，创建分子生成任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGenerationTaskRequest 请求对象
     * @return CreateGenerationTaskResponse
     */
    public CreateGenerationTaskResponse createGenerationTask(CreateGenerationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createGenerationTask);
    }

    /**
     * 新建分子生成任务接口
     *
     * 输入分子属性约束，创建分子生成任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGenerationTaskRequest 请求对象
     * @return SyncInvoker<CreateGenerationTaskRequest, CreateGenerationTaskResponse>
     */
    public SyncInvoker<CreateGenerationTaskRequest, CreateGenerationTaskResponse> createGenerationTaskInvoker(
        CreateGenerationTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createGenerationTask, hcClient);
    }

    /**
     * 查询分子生成任务
     *
     * 通过分子生成任务ID查询分子生成任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGenerationTaskResultRequest 请求对象
     * @return ShowGenerationTaskResultResponse
     */
    public ShowGenerationTaskResultResponse showGenerationTaskResult(ShowGenerationTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showGenerationTaskResult);
    }

    /**
     * 查询分子生成任务
     *
     * 通过分子生成任务ID查询分子生成任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGenerationTaskResultRequest 请求对象
     * @return SyncInvoker<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse>
     */
    public SyncInvoker<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> showGenerationTaskResultInvoker(
        ShowGenerationTaskResultRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showGenerationTaskResult, hcClient);
    }

    /**
     * 计算配体间的3D结构差异
     *
     * 计算配体间的3D结构差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDrugLigandDifferenceRequest 请求对象
     * @return CheckDrugLigandDifferenceResponse
     */
    public CheckDrugLigandDifferenceResponse checkDrugLigandDifference(CheckDrugLigandDifferenceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.checkDrugLigandDifference);
    }

    /**
     * 计算配体间的3D结构差异
     *
     * 计算配体间的3D结构差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDrugLigandDifferenceRequest 请求对象
     * @return SyncInvoker<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse>
     */
    public SyncInvoker<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse> checkDrugLigandDifferenceInvoker(
        CheckDrugLigandDifferenceRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.checkDrugLigandDifference, hcClient);
    }

    /**
     * 生成相互作用2D图
     *
     * 生成相互作用2D图，若不提供配体文件，则受体文件中必须包含配体；若提供配体文件，则受体中的配体（若有）则会被忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandInteraction2dSvgRequest 请求对象
     * @return CreateDrugLigandInteraction2dSvgResponse
     */
    public CreateDrugLigandInteraction2dSvgResponse createDrugLigandInteraction2dSvg(
        CreateDrugLigandInteraction2dSvgRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDrugLigandInteraction2dSvg);
    }

    /**
     * 生成相互作用2D图
     *
     * 生成相互作用2D图，若不提供配体文件，则受体文件中必须包含配体；若提供配体文件，则受体中的配体（若有）则会被忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandInteraction2dSvgRequest 请求对象
     * @return SyncInvoker<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse>
     */
    public SyncInvoker<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse> createDrugLigandInteraction2dSvgInvoker(
        CreateDrugLigandInteraction2dSvgRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDrugLigandInteraction2dSvg, hcClient);
    }

    /**
     * 创建配体文件预览任务
     *
     * 创建配体文件预览任务，支持SMI、SDF、PDB、MOL2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandPreviewTaskRequest 请求对象
     * @return CreateDrugLigandPreviewTaskResponse
     */
    public CreateDrugLigandPreviewTaskResponse createDrugLigandPreviewTask(CreateDrugLigandPreviewTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDrugLigandPreviewTask);
    }

    /**
     * 创建配体文件预览任务
     *
     * 创建配体文件预览任务，支持SMI、SDF、PDB、MOL2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandPreviewTaskRequest 请求对象
     * @return SyncInvoker<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse>
     */
    public SyncInvoker<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse> createDrugLigandPreviewTaskInvoker(
        CreateDrugLigandPreviewTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDrugLigandPreviewTask, hcClient);
    }

    /**
     * 生成分子SDF三维结构
     *
     * 生成分子SDF三维结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSdfRequest 请求对象
     * @return CreateDrugLigandSdfResponse
     */
    public CreateDrugLigandSdfResponse createDrugLigandSdf(CreateDrugLigandSdfRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDrugLigandSdf);
    }

    /**
     * 生成分子SDF三维结构
     *
     * 生成分子SDF三维结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSdfRequest 请求对象
     * @return SyncInvoker<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse>
     */
    public SyncInvoker<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse> createDrugLigandSdfInvoker(
        CreateDrugLigandSdfRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDrugLigandSdf, hcClient);
    }

    /**
     * 创建配体相似性图计算任务
     *
     * 创建配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return CreateDrugLigandSimilarityGraphTaskResponse
     */
    public CreateDrugLigandSimilarityGraphTaskResponse createDrugLigandSimilarityGraphTask(
        CreateDrugLigandSimilarityGraphTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDrugLigandSimilarityGraphTask);
    }

    /**
     * 创建配体相似性图计算任务
     *
     * 创建配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return SyncInvoker<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse>
     */
    public SyncInvoker<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse> createDrugLigandSimilarityGraphTaskInvoker(
        CreateDrugLigandSimilarityGraphTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDrugLigandSimilarityGraphTask, hcClient);
    }

    /**
     * 生成分子SVG图
     *
     * 生成分子SVG图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSvgRequest 请求对象
     * @return CreateDrugLigandSvgResponse
     */
    public CreateDrugLigandSvgResponse createDrugLigandSvg(CreateDrugLigandSvgRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDrugLigandSvg);
    }

    /**
     * 生成分子SVG图
     *
     * 生成分子SVG图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSvgRequest 请求对象
     * @return SyncInvoker<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse>
     */
    public SyncInvoker<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse> createDrugLigandSvgInvoker(
        CreateDrugLigandSvgRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createDrugLigandSvg, hcClient);
    }

    /**
     * 删除配体文件预览任务
     *
     * 删除配体文件预览任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugLigandPreviewTaskRequest 请求对象
     * @return DeleteDrugLigandPreviewTaskResponse
     */
    public DeleteDrugLigandPreviewTaskResponse deleteDrugLigandPreviewTask(DeleteDrugLigandPreviewTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDrugLigandPreviewTask);
    }

    /**
     * 删除配体文件预览任务
     *
     * 删除配体文件预览任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugLigandPreviewTaskRequest 请求对象
     * @return SyncInvoker<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse>
     */
    public SyncInvoker<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse> deleteDrugLigandPreviewTaskInvoker(
        DeleteDrugLigandPreviewTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDrugLigandPreviewTask, hcClient);
    }

    /**
     * 删除配体相似性图计算任务
     *
     * 删除配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return DeleteDrugLigandSimilarityGraphTaskResponse
     */
    public DeleteDrugLigandSimilarityGraphTaskResponse deleteDrugLigandSimilarityGraphTask(
        DeleteDrugLigandSimilarityGraphTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDrugLigandSimilarityGraphTask);
    }

    /**
     * 删除配体相似性图计算任务
     *
     * 删除配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return SyncInvoker<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse>
     */
    public SyncInvoker<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse> deleteDrugLigandSimilarityGraphTaskInvoker(
        DeleteDrugLigandSimilarityGraphTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteDrugLigandSimilarityGraphTask, hcClient);
    }

    /**
     * 受体信息解析
     *
     * 受体信息解析，如果有多个受体蛋白则只处理第一个，如果一个受体蛋白里结合了多个配体，则最多只处理前10个
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseDrugReceptorInfoRequest 请求对象
     * @return ParseDrugReceptorInfoResponse
     */
    public ParseDrugReceptorInfoResponse parseDrugReceptorInfo(ParseDrugReceptorInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.parseDrugReceptorInfo);
    }

    /**
     * 受体信息解析
     *
     * 受体信息解析，如果有多个受体蛋白则只处理第一个，如果一个受体蛋白里结合了多个配体，则最多只处理前10个
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseDrugReceptorInfoRequest 请求对象
     * @return SyncInvoker<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse>
     */
    public SyncInvoker<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse> parseDrugReceptorInfoInvoker(
        ParseDrugReceptorInfoRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.parseDrugReceptorInfo, hcClient);
    }

    /**
     * 受体口袋检测
     *
     * 检测受体口袋，检测类型基于配体，基于氨基酸残基，自动检测，自定义和全局对接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecognizeDrugReceptorPocketRequest 请求对象
     * @return RecognizeDrugReceptorPocketResponse
     */
    public RecognizeDrugReceptorPocketResponse recognizeDrugReceptorPocket(RecognizeDrugReceptorPocketRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.recognizeDrugReceptorPocket);
    }

    /**
     * 受体口袋检测
     *
     * 检测受体口袋，检测类型基于配体，基于氨基酸残基，自动检测，自定义和全局对接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecognizeDrugReceptorPocketRequest 请求对象
     * @return SyncInvoker<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse>
     */
    public SyncInvoker<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse> recognizeDrugReceptorPocketInvoker(
        RecognizeDrugReceptorPocketRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.recognizeDrugReceptorPocket, hcClient);
    }

    /**
     * 配体格式转换为SMILES
     *
     * 配体格式转换为SMILES，若配体文件中存在多个分子，则只取第一个返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDrugLigandToSmilesConversionRequest 请求对象
     * @return RunDrugLigandToSmilesConversionResponse
     */
    public RunDrugLigandToSmilesConversionResponse runDrugLigandToSmilesConversion(
        RunDrugLigandToSmilesConversionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.runDrugLigandToSmilesConversion);
    }

    /**
     * 配体格式转换为SMILES
     *
     * 配体格式转换为SMILES，若配体文件中存在多个分子，则只取第一个返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDrugLigandToSmilesConversionRequest 请求对象
     * @return SyncInvoker<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse>
     */
    public SyncInvoker<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse> runDrugLigandToSmilesConversionInvoker(
        RunDrugLigandToSmilesConversionRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.runDrugLigandToSmilesConversion, hcClient);
    }

    /**
     * 受体预处理
     *
     * 受体预处理，用于前端显示预处理后的受体
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDrugReceptorPreprocessRequest 请求对象
     * @return RunDrugReceptorPreprocessResponse
     */
    public RunDrugReceptorPreprocessResponse runDrugReceptorPreprocess(RunDrugReceptorPreprocessRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.runDrugReceptorPreprocess);
    }

    /**
     * 受体预处理
     *
     * 受体预处理，用于前端显示预处理后的受体
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDrugReceptorPreprocessRequest 请求对象
     * @return SyncInvoker<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse>
     */
    public SyncInvoker<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse> runDrugReceptorPreprocessInvoker(
        RunDrugReceptorPreprocessRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.runDrugReceptorPreprocess, hcClient);
    }

    /**
     * 查询配体文件预览任务
     *
     * 查询配体文件预览任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugLigandPreviewTaskRequest 请求对象
     * @return ShowDrugLigandPreviewTaskResponse
     */
    public ShowDrugLigandPreviewTaskResponse showDrugLigandPreviewTask(ShowDrugLigandPreviewTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDrugLigandPreviewTask);
    }

    /**
     * 查询配体文件预览任务
     *
     * 查询配体文件预览任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugLigandPreviewTaskRequest 请求对象
     * @return SyncInvoker<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse>
     */
    public SyncInvoker<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse> showDrugLigandPreviewTaskInvoker(
        ShowDrugLigandPreviewTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showDrugLigandPreviewTask, hcClient);
    }

    /**
     * 查询配体相似性图计算任务
     *
     * 查询配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return ShowDrugLigandSimilarityGraphTaskResponse
     */
    public ShowDrugLigandSimilarityGraphTaskResponse showDrugLigandSimilarityGraphTask(
        ShowDrugLigandSimilarityGraphTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDrugLigandSimilarityGraphTask);
    }

    /**
     * 查询配体相似性图计算任务
     *
     * 查询配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return SyncInvoker<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse>
     */
    public SyncInvoker<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse> showDrugLigandSimilarityGraphTaskInvoker(
        ShowDrugLigandSimilarityGraphTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showDrugLigandSimilarityGraphTask, hcClient);
    }

    /**
     * 文件下载
     *
     * 文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDataRequest 请求对象
     * @return DownloadDataResponse
     */
    public DownloadDataResponse downloadData(DownloadDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.downloadData);
    }

    /**
     * 文件下载
     *
     * 文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDataRequest 请求对象
     * @return SyncInvoker<DownloadDataRequest, DownloadDataResponse>
     */
    public SyncInvoker<DownloadDataRequest, DownloadDataResponse> downloadDataInvoker(DownloadDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.downloadData, hcClient);
    }

    /**
     * 获取医疗平台信息
     *
     * 获取医疗平台信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOverviewRequest 请求对象
     * @return ShowOverviewResponse
     */
    public ShowOverviewResponse showOverview(ShowOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showOverview);
    }

    /**
     * 获取医疗平台信息
     *
     * 获取医疗平台信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOverviewRequest 请求对象
     * @return SyncInvoker<ShowOverviewRequest, ShowOverviewResponse>
     */
    public SyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewInvoker(ShowOverviewRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showOverview, hcClient);
    }

    /**
     * 清理Nextflow缓存
     *
     * 清理Nextflow缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanNextflowCacheRequest 请求对象
     * @return CleanNextflowCacheResponse
     */
    public CleanNextflowCacheResponse cleanNextflowCache(CleanNextflowCacheRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.cleanNextflowCache);
    }

    /**
     * 清理Nextflow缓存
     *
     * 清理Nextflow缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanNextflowCacheRequest 请求对象
     * @return SyncInvoker<CleanNextflowCacheRequest, CleanNextflowCacheResponse>
     */
    public SyncInvoker<CleanNextflowCacheRequest, CleanNextflowCacheResponse> cleanNextflowCacheInvoker(
        CleanNextflowCacheRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.cleanNextflowCache, hcClient);
    }

    /**
     * 创建nextflow作业
     *
     * 创建nextflow作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNextflowJobRequest 请求对象
     * @return CreateNextflowJobResponse
     */
    public CreateNextflowJobResponse createNextflowJob(CreateNextflowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createNextflowJob);
    }

    /**
     * 创建nextflow作业
     *
     * 创建nextflow作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNextflowJobRequest 请求对象
     * @return SyncInvoker<CreateNextflowJobRequest, CreateNextflowJobResponse>
     */
    public SyncInvoker<CreateNextflowJobRequest, CreateNextflowJobResponse> createNextflowJobInvoker(
        CreateNextflowJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createNextflowJob, hcClient);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNextflowWorkflowRequest 请求对象
     * @return CreateNextflowWorkflowResponse
     */
    public CreateNextflowWorkflowResponse createNextflowWorkflow(CreateNextflowWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createNextflowWorkflow);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNextflowWorkflowRequest 请求对象
     * @return SyncInvoker<CreateNextflowWorkflowRequest, CreateNextflowWorkflowResponse>
     */
    public SyncInvoker<CreateNextflowWorkflowRequest, CreateNextflowWorkflowResponse> createNextflowWorkflowInvoker(
        CreateNextflowWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createNextflowWorkflow, hcClient);
    }

    /**
     * 删除Nextflow作业
     *
     * 删除Nextflow作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNextflowJobRequest 请求对象
     * @return DeleteNextflowJobResponse
     */
    public DeleteNextflowJobResponse deleteNextflowJob(DeleteNextflowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteNextflowJob);
    }

    /**
     * 删除Nextflow作业
     *
     * 删除Nextflow作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNextflowJobRequest 请求对象
     * @return SyncInvoker<DeleteNextflowJobRequest, DeleteNextflowJobResponse>
     */
    public SyncInvoker<DeleteNextflowJobRequest, DeleteNextflowJobResponse> deleteNextflowJobInvoker(
        DeleteNextflowJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteNextflowJob, hcClient);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNextflowWorkflowRequest 请求对象
     * @return DeleteNextflowWorkflowResponse
     */
    public DeleteNextflowWorkflowResponse deleteNextflowWorkflow(DeleteNextflowWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteNextflowWorkflow);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNextflowWorkflowRequest 请求对象
     * @return SyncInvoker<DeleteNextflowWorkflowRequest, DeleteNextflowWorkflowResponse>
     */
    public SyncInvoker<DeleteNextflowWorkflowRequest, DeleteNextflowWorkflowResponse> deleteNextflowWorkflowInvoker(
        DeleteNextflowWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteNextflowWorkflow, hcClient);
    }

    /**
     * 安装Nextflow
     *
     * 安装Nextflow（file和version参数必须提供其中一种）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallNextflowRequest 请求对象
     * @return InstallNextflowResponse
     */
    public InstallNextflowResponse installNextflow(InstallNextflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.installNextflow);
    }

    /**
     * 安装Nextflow
     *
     * 安装Nextflow（file和version参数必须提供其中一种）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallNextflowRequest 请求对象
     * @return SyncInvoker<InstallNextflowRequest, InstallNextflowResponse>
     */
    public SyncInvoker<InstallNextflowRequest, InstallNextflowResponse> installNextflowInvoker(
        InstallNextflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.installNextflow, hcClient);
    }

    /**
     * 查询nextflow作业列表
     *
     * 查询nextflow作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNextflowJobRequest 请求对象
     * @return ListNextflowJobResponse
     */
    public ListNextflowJobResponse listNextflowJob(ListNextflowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNextflowJob);
    }

    /**
     * 查询nextflow作业列表
     *
     * 查询nextflow作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNextflowJobRequest 请求对象
     * @return SyncInvoker<ListNextflowJobRequest, ListNextflowJobResponse>
     */
    public SyncInvoker<ListNextflowJobRequest, ListNextflowJobResponse> listNextflowJobInvoker(
        ListNextflowJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNextflowJob, hcClient);
    }

    /**
     * 获取task列表
     *
     * 获取task列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNextflowTaskRequest 请求对象
     * @return ListNextflowTaskResponse
     */
    public ListNextflowTaskResponse listNextflowTask(ListNextflowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNextflowTask);
    }

    /**
     * 获取task列表
     *
     * 获取task列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNextflowTaskRequest 请求对象
     * @return SyncInvoker<ListNextflowTaskRequest, ListNextflowTaskResponse>
     */
    public SyncInvoker<ListNextflowTaskRequest, ListNextflowTaskResponse> listNextflowTaskInvoker(
        ListNextflowTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNextflowTask, hcClient);
    }

    /**
     * 查询Nextflow版本列表
     *
     * 查询Nextflow版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNextflowVersionRequest 请求对象
     * @return ListNextflowVersionResponse
     */
    public ListNextflowVersionResponse listNextflowVersion(ListNextflowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNextflowVersion);
    }

    /**
     * 查询Nextflow版本列表
     *
     * 查询Nextflow版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNextflowVersionRequest 请求对象
     * @return SyncInvoker<ListNextflowVersionRequest, ListNextflowVersionResponse>
     */
    public SyncInvoker<ListNextflowVersionRequest, ListNextflowVersionResponse> listNextflowVersionInvoker(
        ListNextflowVersionRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNextflowVersion, hcClient);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNextflowWorkflowRequest 请求对象
     * @return ListNextflowWorkflowResponse
     */
    public ListNextflowWorkflowResponse listNextflowWorkflow(ListNextflowWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNextflowWorkflow);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNextflowWorkflowRequest 请求对象
     * @return SyncInvoker<ListNextflowWorkflowRequest, ListNextflowWorkflowResponse>
     */
    public SyncInvoker<ListNextflowWorkflowRequest, ListNextflowWorkflowResponse> listNextflowWorkflowInvoker(
        ListNextflowWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNextflowWorkflow, hcClient);
    }

    /**
     * 重试Nextflow作业
     *
     * 重试Nextflow作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryNextflowJobRequest 请求对象
     * @return RetryNextflowJobResponse
     */
    public RetryNextflowJobResponse retryNextflowJob(RetryNextflowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.retryNextflowJob);
    }

    /**
     * 重试Nextflow作业
     *
     * 重试Nextflow作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryNextflowJobRequest 请求对象
     * @return SyncInvoker<RetryNextflowJobRequest, RetryNextflowJobResponse>
     */
    public SyncInvoker<RetryNextflowJobRequest, RetryNextflowJobResponse> retryNextflowJobInvoker(
        RetryNextflowJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.retryNextflowJob, hcClient);
    }

    /**
     * 查询Nextflow配置详情
     *
     * 查询Nextflow配置详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowRequest 请求对象
     * @return ShowNextflowResponse
     */
    public ShowNextflowResponse showNextflow(ShowNextflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNextflow);
    }

    /**
     * 查询Nextflow配置详情
     *
     * 查询Nextflow配置详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowRequest 请求对象
     * @return SyncInvoker<ShowNextflowRequest, ShowNextflowResponse>
     */
    public SyncInvoker<ShowNextflowRequest, ShowNextflowResponse> showNextflowInvoker(ShowNextflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNextflow, hcClient);
    }

    /**
     * 获取Nextflow作业详情
     *
     * 获取Nextflow作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowJobRequest 请求对象
     * @return ShowNextflowJobResponse
     */
    public ShowNextflowJobResponse showNextflowJob(ShowNextflowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNextflowJob);
    }

    /**
     * 获取Nextflow作业详情
     *
     * 获取Nextflow作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowJobRequest 请求对象
     * @return SyncInvoker<ShowNextflowJobRequest, ShowNextflowJobResponse>
     */
    public SyncInvoker<ShowNextflowJobRequest, ShowNextflowJobResponse> showNextflowJobInvoker(
        ShowNextflowJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNextflowJob, hcClient);
    }

    /**
     * 获取Nextflow作业日志
     *
     * 获取Nextflow作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowJobLogRequest 请求对象
     * @return ShowNextflowJobLogResponse
     */
    public ShowNextflowJobLogResponse showNextflowJobLog(ShowNextflowJobLogRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNextflowJobLog);
    }

    /**
     * 获取Nextflow作业日志
     *
     * 获取Nextflow作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowJobLogRequest 请求对象
     * @return SyncInvoker<ShowNextflowJobLogRequest, ShowNextflowJobLogResponse>
     */
    public SyncInvoker<ShowNextflowJobLogRequest, ShowNextflowJobLogResponse> showNextflowJobLogInvoker(
        ShowNextflowJobLogRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNextflowJobLog, hcClient);
    }

    /**
     * 获取Nextflow作业报告
     *
     * 获取Nextflow作业报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowJobReportsRequest 请求对象
     * @return ShowNextflowJobReportsResponse
     */
    public ShowNextflowJobReportsResponse showNextflowJobReports(ShowNextflowJobReportsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNextflowJobReports);
    }

    /**
     * 获取Nextflow作业报告
     *
     * 获取Nextflow作业报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowJobReportsRequest 请求对象
     * @return SyncInvoker<ShowNextflowJobReportsRequest, ShowNextflowJobReportsResponse>
     */
    public SyncInvoker<ShowNextflowJobReportsRequest, ShowNextflowJobReportsResponse> showNextflowJobReportsInvoker(
        ShowNextflowJobReportsRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNextflowJobReports, hcClient);
    }

    /**
     * 获取task详情
     *
     * 获取task详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowTaskDetailRequest 请求对象
     * @return ShowNextflowTaskDetailResponse
     */
    public ShowNextflowTaskDetailResponse showNextflowTaskDetail(ShowNextflowTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNextflowTaskDetail);
    }

    /**
     * 获取task详情
     *
     * 获取task详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowNextflowTaskDetailRequest, ShowNextflowTaskDetailResponse>
     */
    public SyncInvoker<ShowNextflowTaskDetailRequest, ShowNextflowTaskDetailResponse> showNextflowTaskDetailInvoker(
        ShowNextflowTaskDetailRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNextflowTaskDetail, hcClient);
    }

    /**
     * 获取Nextflow任务日志
     *
     * 获取Nextflow任务日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowTaskLogRequest 请求对象
     * @return ShowNextflowTaskLogResponse
     */
    public ShowNextflowTaskLogResponse showNextflowTaskLog(ShowNextflowTaskLogRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNextflowTaskLog);
    }

    /**
     * 获取Nextflow任务日志
     *
     * 获取Nextflow任务日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowTaskLogRequest 请求对象
     * @return SyncInvoker<ShowNextflowTaskLogRequest, ShowNextflowTaskLogResponse>
     */
    public SyncInvoker<ShowNextflowTaskLogRequest, ShowNextflowTaskLogResponse> showNextflowTaskLogInvoker(
        ShowNextflowTaskLogRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNextflowTaskLog, hcClient);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowWorkflowRequest 请求对象
     * @return ShowNextflowWorkflowResponse
     */
    public ShowNextflowWorkflowResponse showNextflowWorkflow(ShowNextflowWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNextflowWorkflow);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNextflowWorkflowRequest 请求对象
     * @return SyncInvoker<ShowNextflowWorkflowRequest, ShowNextflowWorkflowResponse>
     */
    public SyncInvoker<ShowNextflowWorkflowRequest, ShowNextflowWorkflowResponse> showNextflowWorkflowInvoker(
        ShowNextflowWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNextflowWorkflow, hcClient);
    }

    /**
     * 停止Nextflow作业
     *
     * 停止Nextflow作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopNextflowJobRequest 请求对象
     * @return StopNextflowJobResponse
     */
    public StopNextflowJobResponse stopNextflowJob(StopNextflowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.stopNextflowJob);
    }

    /**
     * 停止Nextflow作业
     *
     * 停止Nextflow作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopNextflowJobRequest 请求对象
     * @return SyncInvoker<StopNextflowJobRequest, StopNextflowJobResponse>
     */
    public SyncInvoker<StopNextflowJobRequest, StopNextflowJobResponse> stopNextflowJobInvoker(
        StopNextflowJobRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.stopNextflowJob, hcClient);
    }

    /**
     * 卸载Nextflow
     *
     * 卸载Nextflow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallNextflowRequest 请求对象
     * @return UninstallNextflowResponse
     */
    public UninstallNextflowResponse uninstallNextflow(UninstallNextflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.uninstallNextflow);
    }

    /**
     * 卸载Nextflow
     *
     * 卸载Nextflow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallNextflowRequest 请求对象
     * @return SyncInvoker<UninstallNextflowRequest, UninstallNextflowResponse>
     */
    public SyncInvoker<UninstallNextflowRequest, UninstallNextflowResponse> uninstallNextflowInvoker(
        UninstallNextflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.uninstallNextflow, hcClient);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNextflowWorkflowRequest 请求对象
     * @return UpdateNextflowWorkflowResponse
     */
    public UpdateNextflowWorkflowResponse updateNextflowWorkflow(UpdateNextflowWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateNextflowWorkflow);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNextflowWorkflowRequest 请求对象
     * @return SyncInvoker<UpdateNextflowWorkflowRequest, UpdateNextflowWorkflowResponse>
     */
    public SyncInvoker<UpdateNextflowWorkflowRequest, UpdateNextflowWorkflowResponse> updateNextflowWorkflowInvoker(
        UpdateNextflowWorkflowRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateNextflowWorkflow, hcClient);
    }

    /**
     * 创建notebook
     *
     * 创建notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotebookRequest 请求对象
     * @return CreateNotebookResponse
     */
    public CreateNotebookResponse createNotebook(CreateNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createNotebook);
    }

    /**
     * 创建notebook
     *
     * 创建notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotebookRequest 请求对象
     * @return SyncInvoker<CreateNotebookRequest, CreateNotebookResponse>
     */
    public SyncInvoker<CreateNotebookRequest, CreateNotebookResponse> createNotebookInvoker(
        CreateNotebookRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createNotebook, hcClient);
    }

    /**
     * 删除notebook
     *
     * 删除notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotebookRequest 请求对象
     * @return DeleteNotebookResponse
     */
    public DeleteNotebookResponse deleteNotebook(DeleteNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteNotebook);
    }

    /**
     * 删除notebook
     *
     * 删除notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotebookRequest 请求对象
     * @return SyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse>
     */
    public SyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse> deleteNotebookInvoker(
        DeleteNotebookRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.deleteNotebook, hcClient);
    }

    /**
     * 获取notebook列表
     *
     * 获取notebook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebookRequest 请求对象
     * @return ListNotebookResponse
     */
    public ListNotebookResponse listNotebook(ListNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNotebook);
    }

    /**
     * 获取notebook列表
     *
     * 获取notebook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebookRequest 请求对象
     * @return SyncInvoker<ListNotebookRequest, ListNotebookResponse>
     */
    public SyncInvoker<ListNotebookRequest, ListNotebookResponse> listNotebookInvoker(ListNotebookRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNotebook, hcClient);
    }

    /**
     * 获取notebook工作环境
     *
     * 获取notebook工作环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebookToolRequest 请求对象
     * @return ListNotebookToolResponse
     */
    public ListNotebookToolResponse listNotebookTool(ListNotebookToolRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNotebookTool);
    }

    /**
     * 获取notebook工作环境
     *
     * 获取notebook工作环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebookToolRequest 请求对象
     * @return SyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse>
     */
    public SyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse> listNotebookToolInvoker(
        ListNotebookToolRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listNotebookTool, hcClient);
    }

    /**
     * 获取用户所属空间的notebook列表
     *
     * 获取用户所属空间的notebook列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserNotebookRequest 请求对象
     * @return ListUserNotebookResponse
     */
    public ListUserNotebookResponse listUserNotebook(ListUserNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listUserNotebook);
    }

    /**
     * 获取用户所属空间的notebook列表
     *
     * 获取用户所属空间的notebook列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserNotebookRequest 请求对象
     * @return SyncInvoker<ListUserNotebookRequest, ListUserNotebookResponse>
     */
    public SyncInvoker<ListUserNotebookRequest, ListUserNotebookResponse> listUserNotebookInvoker(
        ListUserNotebookRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listUserNotebook, hcClient);
    }

    /**
     * 获取notebook详情
     *
     * 获取notebook详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookRequest 请求对象
     * @return ShowNotebookResponse
     */
    public ShowNotebookResponse showNotebook(ShowNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNotebook);
    }

    /**
     * 获取notebook详情
     *
     * 获取notebook详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookRequest 请求对象
     * @return SyncInvoker<ShowNotebookRequest, ShowNotebookResponse>
     */
    public SyncInvoker<ShowNotebookRequest, ShowNotebookResponse> showNotebookInvoker(ShowNotebookRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNotebook, hcClient);
    }

    /**
     * 获取notebook鉴权信息
     *
     * 获取notebook鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookTokenRequest 请求对象
     * @return ShowNotebookTokenResponse
     */
    public ShowNotebookTokenResponse showNotebookToken(ShowNotebookTokenRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNotebookToken);
    }

    /**
     * 获取notebook鉴权信息
     *
     * 获取notebook鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookTokenRequest 请求对象
     * @return SyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse>
     */
    public SyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse> showNotebookTokenInvoker(
        ShowNotebookTokenRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showNotebookToken, hcClient);
    }

    /**
     * 启停notebook
     *
     * 启停notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopOrStartNotebookRequest 请求对象
     * @return StopOrStartNotebookResponse
     */
    public StopOrStartNotebookResponse stopOrStartNotebook(StopOrStartNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.stopOrStartNotebook);
    }

    /**
     * 启停notebook
     *
     * 启停notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopOrStartNotebookRequest 请求对象
     * @return SyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse>
     */
    public SyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse> stopOrStartNotebookInvoker(
        StopOrStartNotebookRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.stopOrStartNotebook, hcClient);
    }

    /**
     * 更新notebook
     *
     * 更新notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotebookRequest 请求对象
     * @return UpdateNotebookResponse
     */
    public UpdateNotebookResponse updateNotebook(UpdateNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateNotebook);
    }

    /**
     * 更新notebook
     *
     * 更新notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotebookRequest 请求对象
     * @return SyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse>
     */
    public SyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse> updateNotebookInvoker(
        UpdateNotebookRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.updateNotebook, hcClient);
    }

    /**
     * 文件下载
     *
     * 文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadPublicDataRequest 请求对象
     * @return DownloadPublicDataResponse
     */
    public DownloadPublicDataResponse downloadPublicData(DownloadPublicDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.downloadPublicData);
    }

    /**
     * 文件下载
     *
     * 文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadPublicDataRequest 请求对象
     * @return SyncInvoker<DownloadPublicDataRequest, DownloadPublicDataResponse>
     */
    public SyncInvoker<DownloadPublicDataRequest, DownloadPublicDataResponse> downloadPublicDataInvoker(
        DownloadPublicDataRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.downloadPublicData, hcClient);
    }

    /**
     * 获取用户OBS桶列表
     *
     * 获取用户OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketRequest 请求对象
     * @return ListObsBucketResponse
     */
    public ListObsBucketResponse listObsBucket(ListObsBucketRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listObsBucket);
    }

    /**
     * 获取用户OBS桶列表
     *
     * 获取用户OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketRequest 请求对象
     * @return SyncInvoker<ListObsBucketRequest, ListObsBucketResponse>
     */
    public SyncInvoker<ListObsBucketRequest, ListObsBucketResponse> listObsBucketInvoker(ListObsBucketRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listObsBucket, hcClient);
    }

    /**
     * 获取用户OBS桶内对象
     *
     * 获取用户OBS桶内对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketObjectRequest 请求对象
     * @return ListObsBucketObjectResponse
     */
    public ListObsBucketObjectResponse listObsBucketObject(ListObsBucketObjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listObsBucketObject);
    }

    /**
     * 获取用户OBS桶内对象
     *
     * 获取用户OBS桶内对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketObjectRequest 请求对象
     * @return SyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse>
     */
    public SyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse> listObsBucketObjectInvoker(
        ListObsBucketObjectRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.listObsBucketObject, hcClient);
    }

    /**
     * 新建分子优化任务接口
     *
     * 输入起始小分子以及属性约束，创建分子优化任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOptimizationTaskRequest 请求对象
     * @return CreateOptimizationTaskResponse
     */
    public CreateOptimizationTaskResponse createOptimizationTask(CreateOptimizationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createOptimizationTask);
    }

    /**
     * 新建分子优化任务接口
     *
     * 输入起始小分子以及属性约束，创建分子优化任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOptimizationTaskRequest 请求对象
     * @return SyncInvoker<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse>
     */
    public SyncInvoker<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> createOptimizationTaskInvoker(
        CreateOptimizationTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createOptimizationTask, hcClient);
    }

    /**
     * 查询分子优化任务
     *
     * 通过分子优化任务ID查询分子优化任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOptimizationTaskResultRequest 请求对象
     * @return ShowOptimizationTaskResultResponse
     */
    public ShowOptimizationTaskResultResponse showOptimizationTaskResult(ShowOptimizationTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showOptimizationTaskResult);
    }

    /**
     * 查询分子优化任务
     *
     * 通过分子优化任务ID查询分子优化任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOptimizationTaskResultRequest 请求对象
     * @return SyncInvoker<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse>
     */
    public SyncInvoker<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> showOptimizationTaskResultInvoker(
        ShowOptimizationTaskResultRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showOptimizationTaskResult, hcClient);
    }

    /**
     * 新建分子搜索任务接口
     *
     * 输入要查询的分子以及查询条件，创建分子搜索任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchTaskRequest 请求对象
     * @return CreateSearchTaskResponse
     */
    public CreateSearchTaskResponse createSearchTask(CreateSearchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createSearchTask);
    }

    /**
     * 新建分子搜索任务接口
     *
     * 输入要查询的分子以及查询条件，创建分子搜索任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchTaskRequest 请求对象
     * @return SyncInvoker<CreateSearchTaskRequest, CreateSearchTaskResponse>
     */
    public SyncInvoker<CreateSearchTaskRequest, CreateSearchTaskResponse> createSearchTaskInvoker(
        CreateSearchTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createSearchTask, hcClient);
    }

    /**
     * 查询分子搜索任务
     *
     * 通过分子搜索任务ID查询分子搜索任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchTaskResultRequest 请求对象
     * @return ShowSearchTaskResultResponse
     */
    public ShowSearchTaskResultResponse showSearchTaskResult(ShowSearchTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showSearchTaskResult);
    }

    /**
     * 查询分子搜索任务
     *
     * 通过分子搜索任务ID查询分子搜索任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchTaskResultRequest 请求对象
     * @return SyncInvoker<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse>
     */
    public SyncInvoker<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> showSearchTaskResultInvoker(
        ShowSearchTaskResultRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showSearchTaskResult, hcClient);
    }

    /**
     * 新建分子合成路径规划任务接口
     *
     * 输入要进行合成路径规划的分子以及输出可行方案的个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSynthesisTaskRequest 请求对象
     * @return CreateSynthesisTaskResponse
     */
    public CreateSynthesisTaskResponse createSynthesisTask(CreateSynthesisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createSynthesisTask);
    }

    /**
     * 新建分子合成路径规划任务接口
     *
     * 输入要进行合成路径规划的分子以及输出可行方案的个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSynthesisTaskRequest 请求对象
     * @return SyncInvoker<CreateSynthesisTaskRequest, CreateSynthesisTaskResponse>
     */
    public SyncInvoker<CreateSynthesisTaskRequest, CreateSynthesisTaskResponse> createSynthesisTaskInvoker(
        CreateSynthesisTaskRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.createSynthesisTask, hcClient);
    }

    /**
     * 查询分子合成路径规划任务
     *
     * 通过分子合成路径规划任务ID查询分子合成路径规划任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSynthesisTaskResultRequest 请求对象
     * @return ShowSynthesisTaskResultResponse
     */
    public ShowSynthesisTaskResultResponse showSynthesisTaskResult(ShowSynthesisTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showSynthesisTaskResult);
    }

    /**
     * 查询分子合成路径规划任务
     *
     * 通过分子合成路径规划任务ID查询分子合成路径规划任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSynthesisTaskResultRequest 请求对象
     * @return SyncInvoker<ShowSynthesisTaskResultRequest, ShowSynthesisTaskResultResponse>
     */
    public SyncInvoker<ShowSynthesisTaskResultRequest, ShowSynthesisTaskResultResponse> showSynthesisTaskResultInvoker(
        ShowSynthesisTaskResultRequest request) {
        return new SyncInvoker<>(request, EiHealthMeta.showSynthesisTaskResult, hcClient);
    }

}
