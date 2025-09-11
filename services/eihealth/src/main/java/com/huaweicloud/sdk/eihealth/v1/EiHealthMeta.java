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
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchOperateJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.BatchOperateJobRsp;
import com.huaweicloud.sdk.eihealth.v1.model.BatchRetryJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchRetryJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CheckLigandDifferenceReq;
import com.huaweicloud.sdk.eihealth.v1.model.CheckTokenVerificationRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CheckTokenVerificationResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CloneDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.CodeVerifyReq;
import com.huaweicloud.sdk.eihealth.v1.model.CopyDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CopyDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusteringJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusteringJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusteringJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingClusterReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDatabaseReq2;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelResourceReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDrugModelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFavoriteReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFavoriteRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFavoriteResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFepJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFepJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateFepJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateGenJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolDockingJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolDockingJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolDockingJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTargetOptJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTargetOptJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTargetOptJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserReq;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteComputingClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteComputingClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteCssClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteDataJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.DeleteJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteMemberRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteMemberResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeletePerformanceResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeletePerformanceResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTagRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteTagResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadPublicDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadPublicDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadPublicDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DrugFile;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ExecuteJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateComplexCombineReq;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateComplexCombineRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateComplexCombineResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GeneratePocketFileRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GeneratePocketFileResponse;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateSurfacePointsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.GenerateSurfacePointsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportAppRsp;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowReq;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.InitializePlatformRequest;
import com.huaweicloud.sdk.eihealth.v1.model.InitializePlatformResponse;
import com.huaweicloud.sdk.eihealth.v1.model.JobDto;
import com.huaweicloud.sdk.eihealth.v1.model.ListAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListAssetRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListAssetResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListBaseModelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListBaseModelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListBucketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListBucketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListCceClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListCceClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterAllNodeLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterAllNodeLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterInstallStepRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListClusterInstallStepResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListComputingClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListComputingClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListCssClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListDataResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListMfaRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListMfaResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListNotebookToolRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListNotebookToolResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListObsBucketObjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListObsBucketObjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListObsBucketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListObsBucketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListPerformanceResourceStatRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPerformanceResourceStatResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListPerformanceResourcesRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPerformanceResourcesResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListProjectStatisticsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListProjectStatisticsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListPropertyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListPropertyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListQuotaRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListQuotaResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListSfsTurbosRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListSfsTurbosResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.NotebookActionReq;
import com.huaweicloud.sdk.eihealth.v1.model.ParseDrugReceptorInfoRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ParseDrugReceptorInfoResponse;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataReq;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ReceptorDrugFileReq;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeDrugReceptorPocketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeDrugReceptorPocketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeReceptorPocketReq;
import com.huaweicloud.sdk.eihealth.v1.model.ResetPasswordReq;
import com.huaweicloud.sdk.eihealth.v1.model.RetryDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugLigandToSmilesConversionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugLigandToSmilesConversionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugReceptorPreprocessRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugReceptorPreprocessResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunFastaPreprocessReq;
import com.huaweicloud.sdk.eihealth.v1.model.RunFastaPreprocessRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunFastaPreprocessResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunFormatConverterReq;
import com.huaweicloud.sdk.eihealth.v1.model.RunFormatConverterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunFormatConverterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunPocketReq;
import com.huaweicloud.sdk.eihealth.v1.model.RunReceptorPreprocessReq;
import com.huaweicloud.sdk.eihealth.v1.model.RunSurfacePointsReq;
import com.huaweicloud.sdk.eihealth.v1.model.SendCodeReq;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowBucketStorageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowBucketStorageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowClusteringJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowClusteringJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowCpiJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowCpiJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowDataJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowFepJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowFepJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowGenJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowGenJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobEventRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobEventResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobLogRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobLogResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMolBatchDownloadTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowMolBatchDownloadTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNotebookTokenRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowNotebookTokenResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowSearchJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowSearchJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowUserSettingRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowUserSettingResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowVendorRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowVendorResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ShowWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.StopOrStartNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.StopOrStartNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppReq;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageReq;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowReq;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.TerminateJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectReq;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAgencyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAgencyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAppResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateTopProjectReq;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateTopProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateTopProjectResponse;
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

    public static final HttpRequestDef<CreateClusteringJobRequest, CreateClusteringJobResponse> createClusteringJob =
        genForCreateClusteringJob();

    private static HttpRequestDef<CreateClusteringJobRequest, CreateClusteringJobResponse> genForCreateClusteringJob() {
        // basic
        HttpRequestDef.Builder<CreateClusteringJobRequest, CreateClusteringJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusteringJobRequest.class, CreateClusteringJobResponse.class)
                .withName("CreateClusteringJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/clustering")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusteringJobRequest::getEihealthProjectId,
                CreateClusteringJobRequest::setEihealthProjectId));
        builder.<CreateClusteringJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusteringJobReq.class),
            f -> f.withMarshaller(CreateClusteringJobRequest::getBody, CreateClusteringJobRequest::setBody));

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

    public static final HttpRequestDef<CreateComputingClusterRequest, CreateComputingClusterResponse> createComputingCluster =
        genForCreateComputingCluster();

    private static HttpRequestDef<CreateComputingClusterRequest, CreateComputingClusterResponse> genForCreateComputingCluster() {
        // basic
        HttpRequestDef.Builder<CreateComputingClusterRequest, CreateComputingClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateComputingClusterRequest.class, CreateComputingClusterResponse.class)
            .withName("CreateComputingCluster")
            .withUri("/v1/{project_id}/system/computing-clusters")
            .withContentType("application/json");

        // requests
        builder.<CreateComputingClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateComputingClusterReq.class),
            f -> f.withMarshaller(CreateComputingClusterRequest::getBody, CreateComputingClusterRequest::setBody));

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

    public static final HttpRequestDef<CreateDrugModelResourceRequest, CreateDrugModelResourceResponse> createDrugModelResource =
        genForCreateDrugModelResource();

    private static HttpRequestDef<CreateDrugModelResourceRequest, CreateDrugModelResourceResponse> genForCreateDrugModelResource() {
        // basic
        HttpRequestDef.Builder<CreateDrugModelResourceRequest, CreateDrugModelResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDrugModelResourceRequest.class, CreateDrugModelResourceResponse.class)
            .withName("CreateDrugModelResource")
            .withUri("/v1/{project_id}/drug/drug-model-resources")
            .withContentType("application/json");

        // requests
        builder.<CreateDrugModelResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDrugModelResourceReq.class),
            f -> f.withMarshaller(CreateDrugModelResourceRequest::getBody, CreateDrugModelResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFavoriteRequest, CreateFavoriteResponse> createFavorite =
        genForCreateFavorite();

    private static HttpRequestDef<CreateFavoriteRequest, CreateFavoriteResponse> genForCreateFavorite() {
        // basic
        HttpRequestDef.Builder<CreateFavoriteRequest, CreateFavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFavoriteRequest.class, CreateFavoriteResponse.class)
                .withName("CreateFavorite")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/favorites")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFavoriteRequest::getEihealthProjectId,
                CreateFavoriteRequest::setEihealthProjectId));
        builder.<CreateFavoriteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFavoriteReq.class),
            f -> f.withMarshaller(CreateFavoriteRequest::getBody, CreateFavoriteRequest::setBody));

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

    public static final HttpRequestDef<CreateGenJobRequest, CreateGenJobResponse> createGenJob = genForCreateGenJob();

    private static HttpRequestDef<CreateGenJobRequest, CreateGenJobResponse> genForCreateGenJob() {
        // basic
        HttpRequestDef.Builder<CreateGenJobRequest, CreateGenJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGenJobRequest.class, CreateGenJobResponse.class)
                .withName("CreateGenJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/generation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGenJobRequest::getEihealthProjectId,
                CreateGenJobRequest::setEihealthProjectId));
        builder.<CreateGenJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGenJobReq.class),
            f -> f.withMarshaller(CreateGenJobRequest::getBody, CreateGenJobRequest::setBody));

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

    public static final HttpRequestDef<CreateMolDockingJobRequest, CreateMolDockingJobResponse> createMolDockingJob =
        genForCreateMolDockingJob();

    private static HttpRequestDef<CreateMolDockingJobRequest, CreateMolDockingJobResponse> genForCreateMolDockingJob() {
        // basic
        HttpRequestDef.Builder<CreateMolDockingJobRequest, CreateMolDockingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMolDockingJobRequest.class, CreateMolDockingJobResponse.class)
                .withName("CreateMolDockingJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/mol-docking")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMolDockingJobRequest::getEihealthProjectId,
                CreateMolDockingJobRequest::setEihealthProjectId));
        builder.<CreateMolDockingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMolDockingJobReq.class),
            f -> f.withMarshaller(CreateMolDockingJobRequest::getBody, CreateMolDockingJobRequest::setBody));

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

    public static final HttpRequestDef<CreateTargetOptJobRequest, CreateTargetOptJobResponse> createTargetOptJob =
        genForCreateTargetOptJob();

    private static HttpRequestDef<CreateTargetOptJobRequest, CreateTargetOptJobResponse> genForCreateTargetOptJob() {
        // basic
        HttpRequestDef.Builder<CreateTargetOptJobRequest, CreateTargetOptJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTargetOptJobRequest.class, CreateTargetOptJobResponse.class)
                .withName("CreateTargetOptJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/target-optimization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTargetOptJobRequest::getEihealthProjectId,
                CreateTargetOptJobRequest::setEihealthProjectId));
        builder.<CreateTargetOptJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTargetOptJobReq.class),
            f -> f.withMarshaller(CreateTargetOptJobRequest::getBody, CreateTargetOptJobRequest::setBody));

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

    public static final HttpRequestDef<DeleteComputingClusterRequest, DeleteComputingClusterResponse> deleteComputingCluster =
        genForDeleteComputingCluster();

    private static HttpRequestDef<DeleteComputingClusterRequest, DeleteComputingClusterResponse> genForDeleteComputingCluster() {
        // basic
        HttpRequestDef.Builder<DeleteComputingClusterRequest, DeleteComputingClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteComputingClusterRequest.class, DeleteComputingClusterResponse.class)
            .withName("DeleteComputingCluster")
            .withUri("/v1/{project_id}/system/computing-clusters/{cluster_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComputingClusterRequest::getClusterId,
                DeleteComputingClusterRequest::setClusterId));

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

    public static final HttpRequestDef<DeleteDrugModelResourceRequest, DeleteDrugModelResourceResponse> deleteDrugModelResource =
        genForDeleteDrugModelResource();

    private static HttpRequestDef<DeleteDrugModelResourceRequest, DeleteDrugModelResourceResponse> genForDeleteDrugModelResource() {
        // basic
        HttpRequestDef.Builder<DeleteDrugModelResourceRequest, DeleteDrugModelResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDrugModelResourceRequest.class, DeleteDrugModelResourceResponse.class)
            .withName("DeleteDrugModelResource")
            .withUri("/v1/{project_id}/drug/drug-model-resources/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDrugModelResourceRequest::getId, DeleteDrugModelResourceRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFavoriteRequest, DeleteFavoriteResponse> deleteFavorite =
        genForDeleteFavorite();

    private static HttpRequestDef<DeleteFavoriteRequest, DeleteFavoriteResponse> genForDeleteFavorite() {
        // basic
        HttpRequestDef.Builder<DeleteFavoriteRequest, DeleteFavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFavoriteRequest.class, DeleteFavoriteResponse.class)
                .withName("DeleteFavorite")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/favorites/{favorite_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFavoriteRequest::getEihealthProjectId,
                DeleteFavoriteRequest::setEihealthProjectId));
        builder.<String>withRequestField("favorite_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFavoriteRequest::getFavoriteId, DeleteFavoriteRequest::setFavoriteId));

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

    public static final HttpRequestDef<InitializePlatformRequest, InitializePlatformResponse> initializePlatform =
        genForInitializePlatform();

    private static HttpRequestDef<InitializePlatformRequest, InitializePlatformResponse> genForInitializePlatform() {
        // basic
        HttpRequestDef.Builder<InitializePlatformRequest, InitializePlatformResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InitializePlatformRequest.class, InitializePlatformResponse.class)
                .withName("InitializePlatform")
                .withUri("/v1/{project_id}/system/init")
                .withContentType("application/json");

        // requests

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

    public static final HttpRequestDef<ListBaseModelRequest, ListBaseModelResponse> listBaseModel =
        genForListBaseModel();

    private static HttpRequestDef<ListBaseModelRequest, ListBaseModelResponse> genForListBaseModel() {
        // basic
        HttpRequestDef.Builder<ListBaseModelRequest, ListBaseModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBaseModelRequest.class, ListBaseModelResponse.class)
                .withName("ListBaseModel")
                .withUri("/v1/{project_id}/base-models")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBaseModelRequest::getLimit, ListBaseModelRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBaseModelRequest::getOffset, ListBaseModelRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaseModelRequest::getSortDir, ListBaseModelRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaseModelRequest::getSortKey, ListBaseModelRequest::setSortKey));

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

    public static final HttpRequestDef<ListCceClusterRequest, ListCceClusterResponse> listCceCluster =
        genForListCceCluster();

    private static HttpRequestDef<ListCceClusterRequest, ListCceClusterResponse> genForListCceCluster() {
        // basic
        HttpRequestDef.Builder<ListCceClusterRequest, ListCceClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCceClusterRequest.class, ListCceClusterResponse.class)
                .withName("ListCceCluster")
                .withUri("/v1/{project_id}/system/cce-clusters")
                .withContentType("application/json");

        // requests

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

    public static final HttpRequestDef<ListClusterInstallStepRequest, ListClusterInstallStepResponse> listClusterInstallStep =
        genForListClusterInstallStep();

    private static HttpRequestDef<ListClusterInstallStepRequest, ListClusterInstallStepResponse> genForListClusterInstallStep() {
        // basic
        HttpRequestDef.Builder<ListClusterInstallStepRequest, ListClusterInstallStepResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterInstallStepRequest.class, ListClusterInstallStepResponse.class)
            .withName("ListClusterInstallStep")
            .withUri("/v1/{project_id}/system/computing-clusters/{cluster_id}/steps")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterInstallStepRequest::getClusterId,
                ListClusterInstallStepRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComputingClusterRequest, ListComputingClusterResponse> listComputingCluster =
        genForListComputingCluster();

    private static HttpRequestDef<ListComputingClusterRequest, ListComputingClusterResponse> genForListComputingCluster() {
        // basic
        HttpRequestDef.Builder<ListComputingClusterRequest, ListComputingClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComputingClusterRequest.class, ListComputingClusterResponse.class)
            .withName("ListComputingCluster")
            .withUri("/v1/{project_id}/system/computing-clusters")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComputingClusterRequest::getLimit, ListComputingClusterRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComputingClusterRequest::getOffset, ListComputingClusterRequest::setOffset));

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
        builder.<List<String>>withRequestField("base_model_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugModelRequest::getBaseModelList, ListDrugModelRequest::setBaseModelList));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDrugModelResourceRequest, ListDrugModelResourceResponse> listDrugModelResource =
        genForListDrugModelResource();

    private static HttpRequestDef<ListDrugModelResourceRequest, ListDrugModelResourceResponse> genForListDrugModelResource() {
        // basic
        HttpRequestDef.Builder<ListDrugModelResourceRequest, ListDrugModelResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDrugModelResourceRequest.class, ListDrugModelResourceResponse.class)
            .withName("ListDrugModelResource")
            .withUri("/v1/{project_id}/drug/drug-model-resources")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrugModelResourceRequest::getSpecCode,
                ListDrugModelResourceRequest::setSpecCode));
        builder.<List<String>>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDrugModelResourceRequest::getStatusList,
                ListDrugModelResourceRequest::setStatusList));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugModelResourceRequest::getLimit, ListDrugModelResourceRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDrugModelResourceRequest::getOffset, ListDrugModelResourceRequest::setOffset));

        // response

        builder.<String>withResponseField("X-Resource-Mappings",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDrugModelResourceResponse::getXResourceMappings,
                ListDrugModelResourceResponse::setXResourceMappings));
        return builder.build();
    }

    public static final HttpRequestDef<ListFavoriteRequest, ListFavoriteResponse> listFavorite = genForListFavorite();

    private static HttpRequestDef<ListFavoriteRequest, ListFavoriteResponse> genForListFavorite() {
        // basic
        HttpRequestDef.Builder<ListFavoriteRequest, ListFavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFavoriteRequest.class, ListFavoriteResponse.class)
                .withName("ListFavorite")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/favorites")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFavoriteRequest::getEihealthProjectId,
                ListFavoriteRequest::setEihealthProjectId));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFavoriteRequest::getResourceId, ListFavoriteRequest::setResourceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFavoriteRequest::getOffset, ListFavoriteRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFavoriteRequest::getLimit, ListFavoriteRequest::setLimit));
        builder.<List<String>>withRequestField("user_name_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFavoriteRequest::getUserNameList, ListFavoriteRequest::setUserNameList));
        builder.<List<String>>withRequestField("resource_type_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFavoriteRequest::getResourceTypeList, ListFavoriteRequest::setResourceTypeList));
        builder.<List<String>>withRequestField("type_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFavoriteRequest::getTypeList, ListFavoriteRequest::setTypeList));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFavoriteRequest::getStartTime, ListFavoriteRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFavoriteRequest::getEndTime, ListFavoriteRequest::setEndTime));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFavoriteRequest::getKeyWord, ListFavoriteRequest::setKeyWord));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFavoriteRequest::getSortDir, ListFavoriteRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFavoriteRequest::getSortKey, ListFavoriteRequest::setSortKey));

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

    public static final HttpRequestDef<ListProjectStatisticsRequest, ListProjectStatisticsResponse> listProjectStatistics =
        genForListProjectStatistics();

    private static HttpRequestDef<ListProjectStatisticsRequest, ListProjectStatisticsResponse> genForListProjectStatistics() {
        // basic
        HttpRequestDef.Builder<ListProjectStatisticsRequest, ListProjectStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectStatisticsRequest.class, ListProjectStatisticsResponse.class)
            .withName("ListProjectStatistics")
            .withUri("/v1/{project_id}/eihealth-projects/statistics")
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

    public static final HttpRequestDef<ListSfsTurbosRequest, ListSfsTurbosResponse> listSfsTurbos =
        genForListSfsTurbos();

    private static HttpRequestDef<ListSfsTurbosRequest, ListSfsTurbosResponse> genForListSfsTurbos() {
        // basic
        HttpRequestDef.Builder<ListSfsTurbosRequest, ListSfsTurbosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSfsTurbosRequest.class, ListSfsTurbosResponse.class)
                .withName("ListSfsTurbos")
                .withUri("/v1/{project_id}/system/sfs-turbos")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSfsTurbosRequest::getLimit, ListSfsTurbosRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSfsTurbosRequest::getOffset, ListSfsTurbosRequest::setOffset));

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

    public static final HttpRequestDef<ListUserAppRequest, ListUserAppResponse> listUserApp = genForListUserApp();

    private static HttpRequestDef<ListUserAppRequest, ListUserAppResponse> genForListUserApp() {
        // basic
        HttpRequestDef.Builder<ListUserAppRequest, ListUserAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserAppRequest.class, ListUserAppResponse.class)
                .withName("ListUserApp")
                .withUri("/v1/{project_id}/eihealth-projects/apps")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserAppRequest::getIsCreator, ListUserAppRequest::setIsCreator));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserAppRequest::getId, ListUserAppRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserAppRequest::getName, ListUserAppRequest::setName));
        builder.<String>withRequestField("summary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserAppRequest::getSummary, ListUserAppRequest::setSummary));
        builder.<List<String>>withRequestField("eihealth_project_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserAppRequest::getEihealthProjectNames,
                ListUserAppRequest::setEihealthProjectNames));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserAppRequest::getLabels, ListUserAppRequest::setLabels));
        builder.<Long>withRequestField("start_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserAppRequest::getStartCreateTime, ListUserAppRequest::setStartCreateTime));
        builder.<Long>withRequestField("end_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserAppRequest::getEndCreateTime, ListUserAppRequest::setEndCreateTime));
        builder.<Long>withRequestField("start_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserAppRequest::getStartUpdateTime, ListUserAppRequest::setStartUpdateTime));
        builder.<Long>withRequestField("end_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserAppRequest::getEndUpdateTime, ListUserAppRequest::setEndUpdateTime));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserAppRequest::getSortBy, ListUserAppRequest::setSortBy));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserAppRequest::getSortDir, ListUserAppRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserAppRequest::getLimit, ListUserAppRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserAppRequest::getOffset, ListUserAppRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserDrugJobRequest, ListUserDrugJobResponse> listUserDrugJob =
        genForListUserDrugJob();

    private static HttpRequestDef<ListUserDrugJobRequest, ListUserDrugJobResponse> genForListUserDrugJob() {
        // basic
        HttpRequestDef.Builder<ListUserDrugJobRequest, ListUserDrugJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserDrugJobRequest.class, ListUserDrugJobResponse.class)
                .withName("ListUserDrugJob")
                .withUri("/v1/{project_id}/eihealth-projects/drug-jobs")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getIsCreator, ListUserDrugJobRequest::setIsCreator));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getJobName, ListUserDrugJobRequest::setJobName));
        builder.<List<String>>withRequestField("eihealth_project_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getEihealthProjectNames,
                ListUserDrugJobRequest::setEihealthProjectNames));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getLabels, ListUserDrugJobRequest::setLabels));
        builder.<List<String>>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getStatusList, ListUserDrugJobRequest::setStatusList));
        builder.<List<String>>withRequestField("types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getTypes, ListUserDrugJobRequest::setTypes));
        builder.<Long>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getCreateStartTime,
                ListUserDrugJobRequest::setCreateStartTime));
        builder.<Long>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getCreateEndTime, ListUserDrugJobRequest::setCreateEndTime));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getFinishStartTime,
                ListUserDrugJobRequest::setFinishStartTime));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getFinishEndTime, ListUserDrugJobRequest::setFinishEndTime));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getSortDir, ListUserDrugJobRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getSortKey, ListUserDrugJobRequest::setSortKey));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getLimit, ListUserDrugJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserDrugJobRequest::getOffset, ListUserDrugJobRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserImageRequest, ListUserImageResponse> listUserImage =
        genForListUserImage();

    private static HttpRequestDef<ListUserImageRequest, ListUserImageResponse> genForListUserImage() {
        // basic
        HttpRequestDef.Builder<ListUserImageRequest, ListUserImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserImageRequest.class, ListUserImageResponse.class)
                .withName("ListUserImage")
                .withUri("/v1/{project_id}/eihealth-projects/images")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserImageRequest::getIsCreator, ListUserImageRequest::setIsCreator));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserImageRequest::getImageId, ListUserImageRequest::setImageId));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserImageRequest::getImageName, ListUserImageRequest::setImageName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserImageRequest::getDescription, ListUserImageRequest::setDescription));
        builder.<List<String>>withRequestField("eihealth_project_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserImageRequest::getEihealthProjectNames,
                ListUserImageRequest::setEihealthProjectNames));
        builder.<String>withRequestField("source_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserImageRequest::getSourceProjectName,
                ListUserImageRequest::setSourceProjectName));
        builder.<List<String>>withRequestField("types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserImageRequest::getTypes, ListUserImageRequest::setTypes));
        builder.<Long>withRequestField("start_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserImageRequest::getStartCreateTime, ListUserImageRequest::setStartCreateTime));
        builder.<Long>withRequestField("end_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserImageRequest::getEndCreateTime, ListUserImageRequest::setEndCreateTime));
        builder.<Long>withRequestField("start_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserImageRequest::getStartUpdateTime, ListUserImageRequest::setStartUpdateTime));
        builder.<Long>withRequestField("end_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserImageRequest::getEndUpdateTime, ListUserImageRequest::setEndUpdateTime));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserImageRequest::getSortBy, ListUserImageRequest::setSortBy));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserImageRequest::getSortDir, ListUserImageRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserImageRequest::getLimit, ListUserImageRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserImageRequest::getOffset, ListUserImageRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserJobRequest, ListUserJobResponse> listUserJob = genForListUserJob();

    private static HttpRequestDef<ListUserJobRequest, ListUserJobResponse> genForListUserJob() {
        // basic
        HttpRequestDef.Builder<ListUserJobRequest, ListUserJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserJobRequest.class, ListUserJobResponse.class)
                .withName("ListUserJob")
                .withUri("/v1/{project_id}/eihealth-projects/jobs")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserJobRequest::getIsCreator, ListUserJobRequest::setIsCreator));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserJobRequest::getJobName, ListUserJobRequest::setJobName));
        builder.<List<String>>withRequestField("eihealth_project_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserJobRequest::getEihealthProjectNames,
                ListUserJobRequest::setEihealthProjectNames));
        builder.<List<String>>withRequestField("types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserJobRequest::getTypes, ListUserJobRequest::setTypes));
        builder.<List<String>>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserJobRequest::getStatusList, ListUserJobRequest::setStatusList));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserJobRequest::getLabels, ListUserJobRequest::setLabels));
        builder.<Long>withRequestField("start_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserJobRequest::getStartCreateTime, ListUserJobRequest::setStartCreateTime));
        builder.<Long>withRequestField("end_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserJobRequest::getEndCreateTime, ListUserJobRequest::setEndCreateTime));
        builder.<Long>withRequestField("start_finish_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserJobRequest::getStartFinishTime, ListUserJobRequest::setStartFinishTime));
        builder.<Long>withRequestField("end_finish_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserJobRequest::getEndFinishTime, ListUserJobRequest::setEndFinishTime));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserJobRequest::getSortKey, ListUserJobRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserJobRequest::getSortDir, ListUserJobRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserJobRequest::getLimit, ListUserJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserJobRequest::getOffset, ListUserJobRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserWorkflowRequest, ListUserWorkflowResponse> listUserWorkflow =
        genForListUserWorkflow();

    private static HttpRequestDef<ListUserWorkflowRequest, ListUserWorkflowResponse> genForListUserWorkflow() {
        // basic
        HttpRequestDef.Builder<ListUserWorkflowRequest, ListUserWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserWorkflowRequest.class, ListUserWorkflowResponse.class)
                .withName("ListUserWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/workflows")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getIsCreator, ListUserWorkflowRequest::setIsCreator));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getId, ListUserWorkflowRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getName, ListUserWorkflowRequest::setName));
        builder.<String>withRequestField("summary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getSummary, ListUserWorkflowRequest::setSummary));
        builder.<List<String>>withRequestField("eihealth_project_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getEihealthProjectNames,
                ListUserWorkflowRequest::setEihealthProjectNames));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getLabels, ListUserWorkflowRequest::setLabels));
        builder.<Long>withRequestField("start_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getStartCreateTime,
                ListUserWorkflowRequest::setStartCreateTime));
        builder.<Long>withRequestField("end_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getEndCreateTime,
                ListUserWorkflowRequest::setEndCreateTime));
        builder.<Long>withRequestField("start_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getStartUpdateTime,
                ListUserWorkflowRequest::setStartUpdateTime));
        builder.<Long>withRequestField("end_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getEndUpdateTime,
                ListUserWorkflowRequest::setEndUpdateTime));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getSortDir, ListUserWorkflowRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getSortKey, ListUserWorkflowRequest::setSortKey));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getLimit, ListUserWorkflowRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserWorkflowRequest::getOffset, ListUserWorkflowRequest::setOffset));

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

    public static final HttpRequestDef<RunFastaPreprocessRequest, RunFastaPreprocessResponse> runFastaPreprocess =
        genForRunFastaPreprocess();

    private static HttpRequestDef<RunFastaPreprocessRequest, RunFastaPreprocessResponse> genForRunFastaPreprocess() {
        // basic
        HttpRequestDef.Builder<RunFastaPreprocessRequest, RunFastaPreprocessResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunFastaPreprocessRequest.class, RunFastaPreprocessResponse.class)
                .withName("RunFastaPreprocess")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/receptor/fasta-preprocess")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunFastaPreprocessRequest::getEihealthProjectId,
                RunFastaPreprocessRequest::setEihealthProjectId));
        builder.<RunFastaPreprocessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunFastaPreprocessReq.class),
            f -> f.withMarshaller(RunFastaPreprocessRequest::getBody, RunFastaPreprocessRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunFormatConverterRequest, RunFormatConverterResponse> runFormatConverter =
        genForRunFormatConverter();

    private static HttpRequestDef<RunFormatConverterRequest, RunFormatConverterResponse> genForRunFormatConverter() {
        // basic
        HttpRequestDef.Builder<RunFormatConverterRequest, RunFormatConverterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunFormatConverterRequest.class, RunFormatConverterResponse.class)
                .withName("RunFormatConverter")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-common/toolkit/format-converter")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunFormatConverterRequest::getEihealthProjectId,
                RunFormatConverterRequest::setEihealthProjectId));
        builder.<RunFormatConverterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunFormatConverterReq.class),
            f -> f.withMarshaller(RunFormatConverterRequest::getBody, RunFormatConverterRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RunFormatConverterResponse::getBody, RunFormatConverterResponse::setBody));

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

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForShowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForShowAgency() {
        // basic
        HttpRequestDef.Builder<ShowAgencyRequest, ShowAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyRequest.class, ShowAgencyResponse.class)
                .withName("ShowAgency")
                .withUri("/v1/{project_id}/system/agencies")
                .withContentType("application/json");

        // requests

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

    public static final HttpRequestDef<ShowClusteringJobRequest, ShowClusteringJobResponse> showClusteringJob =
        genForShowClusteringJob();

    private static HttpRequestDef<ShowClusteringJobRequest, ShowClusteringJobResponse> genForShowClusteringJob() {
        // basic
        HttpRequestDef.Builder<ShowClusteringJobRequest, ShowClusteringJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusteringJobRequest.class, ShowClusteringJobResponse.class)
                .withName("ShowClusteringJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/clustering/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusteringJobRequest::getEihealthProjectId,
                ShowClusteringJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusteringJobRequest::getJobId, ShowClusteringJobRequest::setJobId));

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

    public static final HttpRequestDef<ShowGenJobRequest, ShowGenJobResponse> showGenJob = genForShowGenJob();

    private static HttpRequestDef<ShowGenJobRequest, ShowGenJobResponse> genForShowGenJob() {
        // basic
        HttpRequestDef.Builder<ShowGenJobRequest, ShowGenJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGenJobRequest.class, ShowGenJobResponse.class)
                .withName("ShowGenJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/generation/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGenJobRequest::getEihealthProjectId, ShowGenJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGenJobRequest::getJobId, ShowGenJobRequest::setJobId));

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

    public static final HttpRequestDef<ShowTargetOptJobRequest, ShowTargetOptJobResponse> showTargetOptJob =
        genForShowTargetOptJob();

    private static HttpRequestDef<ShowTargetOptJobRequest, ShowTargetOptJobResponse> genForShowTargetOptJob() {
        // basic
        HttpRequestDef.Builder<ShowTargetOptJobRequest, ShowTargetOptJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTargetOptJobRequest.class, ShowTargetOptJobResponse.class)
                .withName("ShowTargetOptJob")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/target-optimization/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTargetOptJobRequest::getEihealthProjectId,
                ShowTargetOptJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTargetOptJobRequest::getJobId, ShowTargetOptJobRequest::setJobId));

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

    public static final HttpRequestDef<UpdateAgencyRequest, UpdateAgencyResponse> updateAgency = genForUpdateAgency();

    private static HttpRequestDef<UpdateAgencyRequest, UpdateAgencyResponse> genForUpdateAgency() {
        // basic
        HttpRequestDef.Builder<UpdateAgencyRequest, UpdateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAgencyRequest.class, UpdateAgencyResponse.class)
                .withName("UpdateAgency")
                .withUri("/v1/{project_id}/system/agencies")
                .withContentType("application/json");

        // requests

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

    public static final HttpRequestDef<UpdateTopProjectRequest, UpdateTopProjectResponse> updateTopProject =
        genForUpdateTopProject();

    private static HttpRequestDef<UpdateTopProjectRequest, UpdateTopProjectResponse> genForUpdateTopProject() {
        // basic
        HttpRequestDef.Builder<UpdateTopProjectRequest, UpdateTopProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTopProjectRequest.class, UpdateTopProjectResponse.class)
                .withName("UpdateTopProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/top")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopProjectRequest::getEihealthProjectId,
                UpdateTopProjectRequest::setEihealthProjectId));
        builder.<UpdateTopProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopProjectReq.class),
            f -> f.withMarshaller(UpdateTopProjectRequest::getBody, UpdateTopProjectRequest::setBody));

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

    public static final HttpRequestDef<CreateCpiJobRequest, CreateCpiJobResponse> createCpiJob = genForCreateCpiJob();

    private static HttpRequestDef<CreateCpiJobRequest, CreateCpiJobResponse> genForCreateCpiJob() {
        // basic
        HttpRequestDef.Builder<CreateCpiJobRequest, CreateCpiJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCpiJobRequest.class, CreateCpiJobResponse.class)
                .withName("CreateCpiJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/cpi")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCpiJobRequest::getEihealthProjectId,
                CreateCpiJobRequest::setEihealthProjectId));
        builder.<CreateCpiJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCpiJobReq.class),
            f -> f.withMarshaller(CreateCpiJobRequest::getBody, CreateCpiJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCpiJobRequest, ShowCpiJobResponse> showCpiJob = genForShowCpiJob();

    private static HttpRequestDef<ShowCpiJobRequest, ShowCpiJobResponse> genForShowCpiJob() {
        // basic
        HttpRequestDef.Builder<ShowCpiJobRequest, ShowCpiJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCpiJobRequest.class, ShowCpiJobResponse.class)
                .withName("ShowCpiJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/drug-jobs/cpi/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCpiJobRequest::getEihealthProjectId, ShowCpiJobRequest::setEihealthProjectId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCpiJobRequest::getJobId, ShowCpiJobRequest::setJobId));

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

    public static final HttpRequestDef<ListUserNotebookRequest, ListUserNotebookResponse> listUserNotebook =
        genForListUserNotebook();

    private static HttpRequestDef<ListUserNotebookRequest, ListUserNotebookResponse> genForListUserNotebook() {
        // basic
        HttpRequestDef.Builder<ListUserNotebookRequest, ListUserNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserNotebookRequest.class, ListUserNotebookResponse.class)
                .withName("ListUserNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/notebooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("notebook_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getNotebookName, ListUserNotebookRequest::setNotebookName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getDescription, ListUserNotebookRequest::setDescription));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getImageName, ListUserNotebookRequest::setImageName));
        builder.<Boolean>withRequestField("is_creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getIsCreator, ListUserNotebookRequest::setIsCreator));
        builder.<List<String>>withRequestField("eihealth_project_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getEihealthProjectNames,
                ListUserNotebookRequest::setEihealthProjectNames));
        builder.<List<String>>withRequestField("statuses",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getStatuses, ListUserNotebookRequest::setStatuses));
        builder.<Long>withRequestField("start_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getStartCreateTime,
                ListUserNotebookRequest::setStartCreateTime));
        builder.<Long>withRequestField("end_create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getEndCreateTime,
                ListUserNotebookRequest::setEndCreateTime));
        builder.<Long>withRequestField("start_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getStartUpdateTime,
                ListUserNotebookRequest::setStartUpdateTime));
        builder.<Long>withRequestField("end_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getEndUpdateTime,
                ListUserNotebookRequest::setEndUpdateTime));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getSortDir, ListUserNotebookRequest::setSortDir));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getSortBy, ListUserNotebookRequest::setSortBy));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getLimit, ListUserNotebookRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserNotebookRequest::getOffset, ListUserNotebookRequest::setOffset));

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

    public static final HttpRequestDef<DownloadPublicDataRequest, DownloadPublicDataResponse> downloadPublicData =
        genForDownloadPublicData();

    private static HttpRequestDef<DownloadPublicDataRequest, DownloadPublicDataResponse> genForDownloadPublicData() {
        // basic
        HttpRequestDef.Builder<DownloadPublicDataRequest, DownloadPublicDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadPublicDataRequest.class, DownloadPublicDataResponse.class)
                .withName("DownloadPublicData")
                .withUri("/v1/{project_id}/data/download")
                .withContentType("application/json");

        // requests
        builder.<DownloadPublicDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadPublicDataReq.class),
            f -> f.withMarshaller(DownloadPublicDataRequest::getBody, DownloadPublicDataRequest::setBody));

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

}
