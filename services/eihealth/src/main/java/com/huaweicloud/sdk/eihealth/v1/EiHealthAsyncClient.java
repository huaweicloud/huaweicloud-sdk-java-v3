package com.huaweicloud.sdk.eihealth.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchImportAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.BatchRetryJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.BatchRetryJobResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CheckTokenVerificationRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CheckTokenVerificationResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CopyDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CopyDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAdmetJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAssetResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateAssetResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusterJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusteringJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateClusteringJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateComputingClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCpiJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateCssClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateDataResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateLabelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMessageAdditionsRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMessageAdditionsResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolBatchDownloadTaskRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolBatchDownloadTaskResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolDockingJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateMolDockingJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateNotebookResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateSearchJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTargetOptJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateTargetOptJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAssetResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteAssetResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteChatRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DeleteChatResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadPublicDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.DownloadPublicDataResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportNetworkDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportUserResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ImportWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.InitializePlatformRequest;
import com.huaweicloud.sdk.eihealth.v1.model.InitializePlatformResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListAssetRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListAssetResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListAssetResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListAssetResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListBaseModelRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListBaseModelResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListBucketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListBucketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListCceClusterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListCceClusterResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ListChatRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ListChatResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugModelResource1Request;
import com.huaweicloud.sdk.eihealth.v1.model.ListDrugModelResource1Response;
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
import com.huaweicloud.sdk.eihealth.v1.model.ParseDrugReceptorInfoRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ParseDrugReceptorInfoResponse;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataRequest;
import com.huaweicloud.sdk.eihealth.v1.model.QuoteDataResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeDrugReceptorPocketRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RecognizeDrugReceptorPocketResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryDataJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryDataJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RetryJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RetryJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugLigandToSmilesConversionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugLigandToSmilesConversionResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugReceptorPreprocessRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunDrugReceptorPreprocessResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunFastaPreprocessRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunFastaPreprocessResponse;
import com.huaweicloud.sdk.eihealth.v1.model.RunFormatConverterRequest;
import com.huaweicloud.sdk.eihealth.v1.model.RunFormatConverterResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ShowChatRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ShowChatResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeImageResponse;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowRequest;
import com.huaweicloud.sdk.eihealth.v1.model.SubscribeWorkflowResponse;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.TransferProjectResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAgencyRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAgencyResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateChatRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateChatResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateMemberResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateNotebookResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdatePerformanceResourceResponse;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectRequest;
import com.huaweicloud.sdk.eihealth.v1.model.UpdateProjectResponse;
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
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCodeRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCodeResponse;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCssConnectionRequest;
import com.huaweicloud.sdk.eihealth.v1.model.ValidateCssConnectionResponse;

import java.util.concurrent.CompletableFuture;

public class EiHealthAsyncClient {

    protected HcClient hcClient;

    public EiHealthAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EiHealthAsyncClient> newBuilder() {
        ClientBuilder<EiHealthAsyncClient> clientBuilder = new ClientBuilder<>(EiHealthAsyncClient::new);
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
     * @return CompletableFuture<AddDrugDatabaseFileResponse>
     */
    public CompletableFuture<AddDrugDatabaseFileResponse> addDrugDatabaseFileAsync(AddDrugDatabaseFileRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.addDrugDatabaseFile);
    }

    /**
     * 数据库追加文件
     *
     * 数据库追加文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDrugDatabaseFileRequest 请求对象
     * @return AsyncInvoker<AddDrugDatabaseFileRequest, AddDrugDatabaseFileResponse>
     */
    public AsyncInvoker<AddDrugDatabaseFileRequest, AddDrugDatabaseFileResponse> addDrugDatabaseFileAsyncInvoker(
        AddDrugDatabaseFileRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.addDrugDatabaseFile, hcClient);
    }

    /**
     * 批量取消作业
     *
     * 批量取消作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCancelJobRequest 请求对象
     * @return CompletableFuture<BatchCancelJobResponse>
     */
    public CompletableFuture<BatchCancelJobResponse> batchCancelJobAsync(BatchCancelJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchCancelJob);
    }

    /**
     * 批量取消作业
     *
     * 批量取消作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCancelJobRequest 请求对象
     * @return AsyncInvoker<BatchCancelJobRequest, BatchCancelJobResponse>
     */
    public AsyncInvoker<BatchCancelJobRequest, BatchCancelJobResponse> batchCancelJobAsyncInvoker(
        BatchCancelJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.batchCancelJob, hcClient);
    }

    /**
     * 批量删除项目数据
     *
     * 批量删除项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDataRequest 请求对象
     * @return CompletableFuture<BatchDeleteDataResponse>
     */
    public CompletableFuture<BatchDeleteDataResponse> batchDeleteDataAsync(BatchDeleteDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchDeleteData);
    }

    /**
     * 批量删除项目数据
     *
     * 批量删除项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDataRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDataRequest, BatchDeleteDataResponse>
     */
    public AsyncInvoker<BatchDeleteDataRequest, BatchDeleteDataResponse> batchDeleteDataAsyncInvoker(
        BatchDeleteDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.batchDeleteData, hcClient);
    }

    /**
     * 批量删除作业
     *
     * 批量删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobRequest 请求对象
     * @return CompletableFuture<BatchDeleteJobResponse>
     */
    public CompletableFuture<BatchDeleteJobResponse> batchDeleteJobAsync(BatchDeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchDeleteJob);
    }

    /**
     * 批量删除作业
     *
     * 批量删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobRequest 请求对象
     * @return AsyncInvoker<BatchDeleteJobRequest, BatchDeleteJobResponse>
     */
    public AsyncInvoker<BatchDeleteJobRequest, BatchDeleteJobResponse> batchDeleteJobAsyncInvoker(
        BatchDeleteJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.batchDeleteJob, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLabelRequest 请求对象
     * @return CompletableFuture<BatchDeleteLabelResponse>
     */
    public CompletableFuture<BatchDeleteLabelResponse> batchDeleteLabelAsync(BatchDeleteLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchDeleteLabel);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLabelRequest 请求对象
     * @return AsyncInvoker<BatchDeleteLabelRequest, BatchDeleteLabelResponse>
     */
    public AsyncInvoker<BatchDeleteLabelRequest, BatchDeleteLabelResponse> batchDeleteLabelAsyncInvoker(
        BatchDeleteLabelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.batchDeleteLabel, hcClient);
    }

    /**
     * 导入应用
     *
     * 批量导入应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportAppRequest 请求对象
     * @return CompletableFuture<BatchImportAppResponse>
     */
    public CompletableFuture<BatchImportAppResponse> batchImportAppAsync(BatchImportAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchImportApp);
    }

    /**
     * 导入应用
     *
     * 批量导入应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportAppRequest 请求对象
     * @return AsyncInvoker<BatchImportAppRequest, BatchImportAppResponse>
     */
    public AsyncInvoker<BatchImportAppRequest, BatchImportAppResponse> batchImportAppAsyncInvoker(
        BatchImportAppRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.batchImportApp, hcClient);
    }

    /**
     * 批量重试作业
     *
     * 批量重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRetryJobRequest 请求对象
     * @return CompletableFuture<BatchRetryJobResponse>
     */
    public CompletableFuture<BatchRetryJobResponse> batchRetryJobAsync(BatchRetryJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchRetryJob);
    }

    /**
     * 批量重试作业
     *
     * 批量重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRetryJobRequest 请求对象
     * @return AsyncInvoker<BatchRetryJobRequest, BatchRetryJobResponse>
     */
    public AsyncInvoker<BatchRetryJobRequest, BatchRetryJobResponse> batchRetryJobAsyncInvoker(
        BatchRetryJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.batchRetryJob, hcClient);
    }

    /**
     * 取消数据作业
     *
     * 取消数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDataJobRequest 请求对象
     * @return CompletableFuture<CancelDataJobResponse>
     */
    public CompletableFuture<CancelDataJobResponse> cancelDataJobAsync(CancelDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.cancelDataJob);
    }

    /**
     * 取消数据作业
     *
     * 取消数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDataJobRequest 请求对象
     * @return AsyncInvoker<CancelDataJobRequest, CancelDataJobResponse>
     */
    public AsyncInvoker<CancelDataJobRequest, CancelDataJobResponse> cancelDataJobAsyncInvoker(
        CancelDataJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.cancelDataJob, hcClient);
    }

    /**
     * 取消药物作业
     *
     * 取消药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDrugJobRequest 请求对象
     * @return CompletableFuture<CancelDrugJobResponse>
     */
    public CompletableFuture<CancelDrugJobResponse> cancelDrugJobAsync(CancelDrugJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.cancelDrugJob);
    }

    /**
     * 取消药物作业
     *
     * 取消药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDrugJobRequest 请求对象
     * @return AsyncInvoker<CancelDrugJobRequest, CancelDrugJobResponse>
     */
    public AsyncInvoker<CancelDrugJobRequest, CancelDrugJobResponse> cancelDrugJobAsyncInvoker(
        CancelDrugJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.cancelDrugJob, hcClient);
    }

    /**
     * 取消或强制停止作业调度
     *
     * 取消或强制作业调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelJobRequest 请求对象
     * @return CompletableFuture<CancelJobResponse>
     */
    public CompletableFuture<CancelJobResponse> cancelJobAsync(CancelJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.cancelJob);
    }

    /**
     * 取消或强制停止作业调度
     *
     * 取消或强制作业调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelJobRequest 请求对象
     * @return AsyncInvoker<CancelJobRequest, CancelJobResponse>
     */
    public AsyncInvoker<CancelJobRequest, CancelJobResponse> cancelJobAsyncInvoker(CancelJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.cancelJob, hcClient);
    }

    /**
     * 修改密码
     *
     * 修改密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordRequest 请求对象
     * @return CompletableFuture<ChangePasswordResponse>
     */
    public CompletableFuture<ChangePasswordResponse> changePasswordAsync(ChangePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.changePassword);
    }

    /**
     * 修改密码
     *
     * 修改密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordRequest 请求对象
     * @return AsyncInvoker<ChangePasswordRequest, ChangePasswordResponse>
     */
    public AsyncInvoker<ChangePasswordRequest, ChangePasswordResponse> changePasswordAsyncInvoker(
        ChangePasswordRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.changePassword, hcClient);
    }

    /**
     * 校验token
     *
     * 校验token是否可访问当前环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTokenVerificationRequest 请求对象
     * @return CompletableFuture<CheckTokenVerificationResponse>
     */
    public CompletableFuture<CheckTokenVerificationResponse> checkTokenVerificationAsync(
        CheckTokenVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.checkTokenVerification);
    }

    /**
     * 校验token
     *
     * 校验token是否可访问当前环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTokenVerificationRequest 请求对象
     * @return AsyncInvoker<CheckTokenVerificationRequest, CheckTokenVerificationResponse>
     */
    public AsyncInvoker<CheckTokenVerificationRequest, CheckTokenVerificationResponse> checkTokenVerificationAsyncInvoker(
        CheckTokenVerificationRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.checkTokenVerification, hcClient);
    }

    /**
     * 复制项目数据
     *
     * 复制项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyDataRequest 请求对象
     * @return CompletableFuture<CopyDataResponse>
     */
    public CompletableFuture<CopyDataResponse> copyDataAsync(CopyDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.copyData);
    }

    /**
     * 复制项目数据
     *
     * 复制项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyDataRequest 请求对象
     * @return AsyncInvoker<CopyDataRequest, CopyDataResponse>
     */
    public AsyncInvoker<CopyDataRequest, CopyDataResponse> copyDataAsyncInvoker(CopyDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.copyData, hcClient);
    }

    /**
     * 创建分子属性预测作业
     *
     * 创建分子属性预测作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAdmetJobRequest 请求对象
     * @return CompletableFuture<CreateAdmetJobResponse>
     */
    public CompletableFuture<CreateAdmetJobResponse> createAdmetJobAsync(CreateAdmetJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createAdmetJob);
    }

    /**
     * 创建分子属性预测作业
     *
     * 创建分子属性预测作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAdmetJobRequest 请求对象
     * @return AsyncInvoker<CreateAdmetJobRequest, CreateAdmetJobResponse>
     */
    public AsyncInvoker<CreateAdmetJobRequest, CreateAdmetJobResponse> createAdmetJobAsyncInvoker(
        CreateAdmetJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createAdmetJob, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createApp, hcClient);
    }

    /**
     * 创建计费资产资源
     *
     * 创建计费资产资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetResourceRequest 请求对象
     * @return CompletableFuture<CreateAssetResourceResponse>
     */
    public CompletableFuture<CreateAssetResourceResponse> createAssetResourceAsync(CreateAssetResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createAssetResource);
    }

    /**
     * 创建计费资产资源
     *
     * 创建计费资产资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetResourceRequest 请求对象
     * @return AsyncInvoker<CreateAssetResourceRequest, CreateAssetResourceResponse>
     */
    public AsyncInvoker<CreateAssetResourceRequest, CreateAssetResourceResponse> createAssetResourceAsyncInvoker(
        CreateAssetResourceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createAssetResource, hcClient);
    }

    /**
     * 创建分子聚类作业
     *
     * 创建分子聚类作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterJobRequest 请求对象
     * @return CompletableFuture<CreateClusterJobResponse>
     */
    public CompletableFuture<CreateClusterJobResponse> createClusterJobAsync(CreateClusterJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createClusterJob);
    }

    /**
     * 创建分子聚类作业
     *
     * 创建分子聚类作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterJobRequest 请求对象
     * @return AsyncInvoker<CreateClusterJobRequest, CreateClusterJobResponse>
     */
    public AsyncInvoker<CreateClusterJobRequest, CreateClusterJobResponse> createClusterJobAsyncInvoker(
        CreateClusterJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createClusterJob, hcClient);
    }

    /**
     * 创建聚类分析作业
     *
     * 创建聚类分析作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusteringJobRequest 请求对象
     * @return CompletableFuture<CreateClusteringJobResponse>
     */
    public CompletableFuture<CreateClusteringJobResponse> createClusteringJobAsync(CreateClusteringJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createClusteringJob);
    }

    /**
     * 创建聚类分析作业
     *
     * 创建聚类分析作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusteringJobRequest 请求对象
     * @return AsyncInvoker<CreateClusteringJobRequest, CreateClusteringJobResponse>
     */
    public AsyncInvoker<CreateClusteringJobRequest, CreateClusteringJobResponse> createClusteringJobAsyncInvoker(
        CreateClusteringJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createClusteringJob, hcClient);
    }

    /**
     * 发送验证码
     *
     * 发送验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeRequest 请求对象
     * @return CompletableFuture<CreateCodeResponse>
     */
    public CompletableFuture<CreateCodeResponse> createCodeAsync(CreateCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createCode);
    }

    /**
     * 发送验证码
     *
     * 发送验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeRequest 请求对象
     * @return AsyncInvoker<CreateCodeRequest, CreateCodeResponse>
     */
    public AsyncInvoker<CreateCodeRequest, CreateCodeResponse> createCodeAsyncInvoker(CreateCodeRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createCode, hcClient);
    }

    /**
     * 绑定计算集群
     *
     * 绑定计算集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComputingClusterRequest 请求对象
     * @return CompletableFuture<CreateComputingClusterResponse>
     */
    public CompletableFuture<CreateComputingClusterResponse> createComputingClusterAsync(
        CreateComputingClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createComputingCluster);
    }

    /**
     * 绑定计算集群
     *
     * 绑定计算集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComputingClusterRequest 请求对象
     * @return AsyncInvoker<CreateComputingClusterRequest, CreateComputingClusterResponse>
     */
    public AsyncInvoker<CreateComputingClusterRequest, CreateComputingClusterResponse> createComputingClusterAsyncInvoker(
        CreateComputingClusterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createComputingCluster, hcClient);
    }

    /**
     * 创建文件夹
     *
     * 创建文件夹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataRequest 请求对象
     * @return CompletableFuture<CreateDataResponse>
     */
    public CompletableFuture<CreateDataResponse> createDataAsync(CreateDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createData);
    }

    /**
     * 创建文件夹
     *
     * 创建文件夹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataRequest 请求对象
     * @return AsyncInvoker<CreateDataRequest, CreateDataResponse>
     */
    public AsyncInvoker<CreateDataRequest, CreateDataResponse> createDataAsyncInvoker(CreateDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createData, hcClient);
    }

    /**
     * 创建分子对接作业
     *
     * 创建分子对接作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDockingJobRequest 请求对象
     * @return CompletableFuture<CreateDockingJobResponse>
     */
    public CompletableFuture<CreateDockingJobResponse> createDockingJobAsync(CreateDockingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDockingJob);
    }

    /**
     * 创建分子对接作业
     *
     * 创建分子对接作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDockingJobRequest 请求对象
     * @return AsyncInvoker<CreateDockingJobRequest, CreateDockingJobResponse>
     */
    public AsyncInvoker<CreateDockingJobRequest, CreateDockingJobResponse> createDockingJobAsyncInvoker(
        CreateDockingJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDockingJob, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDrugDatabaseResponse>
     */
    public CompletableFuture<CreateDrugDatabaseResponse> createDrugDatabaseAsync(CreateDrugDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDrugDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDrugDatabaseRequest, CreateDrugDatabaseResponse>
     */
    public AsyncInvoker<CreateDrugDatabaseRequest, CreateDrugDatabaseResponse> createDrugDatabaseAsyncInvoker(
        CreateDrugDatabaseRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDrugDatabase, hcClient);
    }

    /**
     * 创建模型
     *
     * 创建模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugModelRequest 请求对象
     * @return CompletableFuture<CreateDrugModelResponse>
     */
    public CompletableFuture<CreateDrugModelResponse> createDrugModelAsync(CreateDrugModelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDrugModel);
    }

    /**
     * 创建模型
     *
     * 创建模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugModelRequest 请求对象
     * @return AsyncInvoker<CreateDrugModelRequest, CreateDrugModelResponse>
     */
    public AsyncInvoker<CreateDrugModelRequest, CreateDrugModelResponse> createDrugModelAsyncInvoker(
        CreateDrugModelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDrugModel, hcClient);
    }

    /**
     * 创建盘古药物分子大模型
     *
     * 创建盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugModelResourceRequest 请求对象
     * @return CompletableFuture<CreateDrugModelResourceResponse>
     */
    public CompletableFuture<CreateDrugModelResourceResponse> createDrugModelResourceAsync(
        CreateDrugModelResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDrugModelResource);
    }

    /**
     * 创建盘古药物分子大模型
     *
     * 创建盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugModelResourceRequest 请求对象
     * @return AsyncInvoker<CreateDrugModelResourceRequest, CreateDrugModelResourceResponse>
     */
    public AsyncInvoker<CreateDrugModelResourceRequest, CreateDrugModelResourceResponse> createDrugModelResourceAsyncInvoker(
        CreateDrugModelResourceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDrugModelResource, hcClient);
    }

    /**
     * 添加收藏
     *
     * 添加收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFavoriteRequest 请求对象
     * @return CompletableFuture<CreateFavoriteResponse>
     */
    public CompletableFuture<CreateFavoriteResponse> createFavoriteAsync(CreateFavoriteRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createFavorite);
    }

    /**
     * 添加收藏
     *
     * 添加收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFavoriteRequest 请求对象
     * @return AsyncInvoker<CreateFavoriteRequest, CreateFavoriteResponse>
     */
    public AsyncInvoker<CreateFavoriteRequest, CreateFavoriteResponse> createFavoriteAsyncInvoker(
        CreateFavoriteRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createFavorite, hcClient);
    }

    /**
     * 创建自由能微扰作业
     *
     * 创建自由能微扰作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFepJobRequest 请求对象
     * @return CompletableFuture<CreateFepJobResponse>
     */
    public CompletableFuture<CreateFepJobResponse> createFepJobAsync(CreateFepJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createFepJob);
    }

    /**
     * 创建自由能微扰作业
     *
     * 创建自由能微扰作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFepJobRequest 请求对象
     * @return AsyncInvoker<CreateFepJobRequest, CreateFepJobResponse>
     */
    public AsyncInvoker<CreateFepJobRequest, CreateFepJobResponse> createFepJobAsyncInvoker(
        CreateFepJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createFepJob, hcClient);
    }

    /**
     * 创建分子生成作业
     *
     * 创建分子生成作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGenJobRequest 请求对象
     * @return CompletableFuture<CreateGenJobResponse>
     */
    public CompletableFuture<CreateGenJobResponse> createGenJobAsync(CreateGenJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createGenJob);
    }

    /**
     * 创建分子生成作业
     *
     * 创建分子生成作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGenJobRequest 请求对象
     * @return AsyncInvoker<CreateGenJobRequest, CreateGenJobResponse>
     */
    public AsyncInvoker<CreateGenJobRequest, CreateGenJobResponse> createGenJobAsyncInvoker(
        CreateGenJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createGenJob, hcClient);
    }

    /**
     * 创建镜像
     *
     * 创建镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageRequest 请求对象
     * @return CompletableFuture<CreateImageResponse>
     */
    public CompletableFuture<CreateImageResponse> createImageAsync(CreateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createImage);
    }

    /**
     * 创建镜像
     *
     * 创建镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageRequest 请求对象
     * @return AsyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public AsyncInvoker<CreateImageRequest, CreateImageResponse> createImageAsyncInvoker(CreateImageRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createImage, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelRequest 请求对象
     * @return CompletableFuture<CreateLabelResponse>
     */
    public CompletableFuture<CreateLabelResponse> createLabelAsync(CreateLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createLabel);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelRequest 请求对象
     * @return AsyncInvoker<CreateLabelRequest, CreateLabelResponse>
     */
    public AsyncInvoker<CreateLabelRequest, CreateLabelResponse> createLabelAsyncInvoker(CreateLabelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createLabel, hcClient);
    }

    /**
     * 绑定问答额外信息
     *
     * 绑定问答额外信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageAdditionsRequest 请求对象
     * @return CompletableFuture<CreateMessageAdditionsResponse>
     */
    public CompletableFuture<CreateMessageAdditionsResponse> createMessageAdditionsAsync(
        CreateMessageAdditionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createMessageAdditions);
    }

    /**
     * 绑定问答额外信息
     *
     * 绑定问答额外信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageAdditionsRequest 请求对象
     * @return AsyncInvoker<CreateMessageAdditionsRequest, CreateMessageAdditionsResponse>
     */
    public AsyncInvoker<CreateMessageAdditionsRequest, CreateMessageAdditionsResponse> createMessageAdditionsAsyncInvoker(
        CreateMessageAdditionsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createMessageAdditions, hcClient);
    }

    /**
     * 创建分子或分子复合物批量下载任务
     *
     * 创建分子或分子复合物批量下载任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMolBatchDownloadTaskRequest 请求对象
     * @return CompletableFuture<CreateMolBatchDownloadTaskResponse>
     */
    public CompletableFuture<CreateMolBatchDownloadTaskResponse> createMolBatchDownloadTaskAsync(
        CreateMolBatchDownloadTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createMolBatchDownloadTask);
    }

    /**
     * 创建分子或分子复合物批量下载任务
     *
     * 创建分子或分子复合物批量下载任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMolBatchDownloadTaskRequest 请求对象
     * @return AsyncInvoker<CreateMolBatchDownloadTaskRequest, CreateMolBatchDownloadTaskResponse>
     */
    public AsyncInvoker<CreateMolBatchDownloadTaskRequest, CreateMolBatchDownloadTaskResponse> createMolBatchDownloadTaskAsyncInvoker(
        CreateMolBatchDownloadTaskRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createMolBatchDownloadTask, hcClient);
    }

    /**
     * 单分子预对接
     *
     * 单分子预对接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMolDockingJobRequest 请求对象
     * @return CompletableFuture<CreateMolDockingJobResponse>
     */
    public CompletableFuture<CreateMolDockingJobResponse> createMolDockingJobAsync(CreateMolDockingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createMolDockingJob);
    }

    /**
     * 单分子预对接
     *
     * 单分子预对接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMolDockingJobRequest 请求对象
     * @return AsyncInvoker<CreateMolDockingJobRequest, CreateMolDockingJobResponse>
     */
    public AsyncInvoker<CreateMolDockingJobRequest, CreateMolDockingJobResponse> createMolDockingJobAsyncInvoker(
        CreateMolDockingJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createMolDockingJob, hcClient);
    }

    /**
     * 创建分子优化作业
     *
     * 创建分子优化作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOptmJobRequest 请求对象
     * @return CompletableFuture<CreateOptmJobResponse>
     */
    public CompletableFuture<CreateOptmJobResponse> createOptmJobAsync(CreateOptmJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createOptmJob);
    }

    /**
     * 创建分子优化作业
     *
     * 创建分子优化作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOptmJobRequest 请求对象
     * @return AsyncInvoker<CreateOptmJobRequest, CreateOptmJobResponse>
     */
    public AsyncInvoker<CreateOptmJobRequest, CreateOptmJobResponse> createOptmJobAsyncInvoker(
        CreateOptmJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createOptmJob, hcClient);
    }

    /**
     * 购买性能加速资源
     *
     * 购买性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePerformanceResourceRequest 请求对象
     * @return CompletableFuture<CreatePerformanceResourceResponse>
     */
    public CompletableFuture<CreatePerformanceResourceResponse> createPerformanceResourceAsync(
        CreatePerformanceResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createPerformanceResource);
    }

    /**
     * 购买性能加速资源
     *
     * 购买性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePerformanceResourceRequest 请求对象
     * @return AsyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse>
     */
    public AsyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> createPerformanceResourceAsyncInvoker(
        CreatePerformanceResourceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createPerformanceResource, hcClient);
    }

    /**
     * 创建靶点口袋发现作业
     *
     * 创建靶点口袋发现作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePocketDetectionJobRequest 请求对象
     * @return CompletableFuture<CreatePocketDetectionJobResponse>
     */
    public CompletableFuture<CreatePocketDetectionJobResponse> createPocketDetectionJobAsync(
        CreatePocketDetectionJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createPocketDetectionJob);
    }

    /**
     * 创建靶点口袋发现作业
     *
     * 创建靶点口袋发现作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePocketDetectionJobRequest 请求对象
     * @return AsyncInvoker<CreatePocketDetectionJobRequest, CreatePocketDetectionJobResponse>
     */
    public AsyncInvoker<CreatePocketDetectionJobRequest, CreatePocketDetectionJobResponse> createPocketDetectionJobAsyncInvoker(
        CreatePocketDetectionJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createPocketDetectionJob, hcClient);
    }

    /**
     * 创建靶点口袋分子设计作业
     *
     * 创建靶点口袋分子设计作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePocketMolDesignJobRequest 请求对象
     * @return CompletableFuture<CreatePocketMolDesignJobResponse>
     */
    public CompletableFuture<CreatePocketMolDesignJobResponse> createPocketMolDesignJobAsync(
        CreatePocketMolDesignJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createPocketMolDesignJob);
    }

    /**
     * 创建靶点口袋分子设计作业
     *
     * 创建靶点口袋分子设计作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePocketMolDesignJobRequest 请求对象
     * @return AsyncInvoker<CreatePocketMolDesignJobRequest, CreatePocketMolDesignJobResponse>
     */
    public AsyncInvoker<CreatePocketMolDesignJobRequest, CreatePocketMolDesignJobResponse> createPocketMolDesignJobAsyncInvoker(
        CreatePocketMolDesignJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createPocketMolDesignJob, hcClient);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRequest 请求对象
     * @return CompletableFuture<CreateProjectResponse>
     */
    public CompletableFuture<CreateProjectResponse> createProjectAsync(CreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createProject);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRequest 请求对象
     * @return AsyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public AsyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectAsyncInvoker(
        CreateProjectRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createProject, hcClient);
    }

    /**
     * 创建分子搜索作业
     *
     * 创建分子搜索作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchJobRequest 请求对象
     * @return CompletableFuture<CreateSearchJobResponse>
     */
    public CompletableFuture<CreateSearchJobResponse> createSearchJobAsync(CreateSearchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createSearchJob);
    }

    /**
     * 创建分子搜索作业
     *
     * 创建分子搜索作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchJobRequest 请求对象
     * @return AsyncInvoker<CreateSearchJobRequest, CreateSearchJobResponse>
     */
    public AsyncInvoker<CreateSearchJobRequest, CreateSearchJobResponse> createSearchJobAsyncInvoker(
        CreateSearchJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createSearchJob, hcClient);
    }

    /**
     * 创建靶点优化作业
     *
     * 创建靶点优化作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTargetOptJobRequest 请求对象
     * @return CompletableFuture<CreateTargetOptJobResponse>
     */
    public CompletableFuture<CreateTargetOptJobResponse> createTargetOptJobAsync(CreateTargetOptJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createTargetOptJob);
    }

    /**
     * 创建靶点优化作业
     *
     * 创建靶点优化作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTargetOptJobRequest 请求对象
     * @return AsyncInvoker<CreateTargetOptJobRequest, CreateTargetOptJobResponse>
     */
    public AsyncInvoker<CreateTargetOptJobRequest, CreateTargetOptJobResponse> createTargetOptJobAsyncInvoker(
        CreateTargetOptJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createTargetOptJob, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CompletableFuture<CreateUserResponse>
     */
    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createUser, hcClient);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return CompletableFuture<CreateWorkflowResponse>
     */
    public CompletableFuture<CreateWorkflowResponse> createWorkflowAsync(CreateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createWorkflow);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowAsyncInvoker(
        CreateWorkflowRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createWorkflow, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteApp, hcClient);
    }

    /**
     * 退订计费资产资源
     *
     * 退订计费资产资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetResourceRequest 请求对象
     * @return CompletableFuture<DeleteAssetResourceResponse>
     */
    public CompletableFuture<DeleteAssetResourceResponse> deleteAssetResourceAsync(DeleteAssetResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteAssetResource);
    }

    /**
     * 退订计费资产资源
     *
     * 退订计费资产资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetResourceRequest 请求对象
     * @return AsyncInvoker<DeleteAssetResourceRequest, DeleteAssetResourceResponse>
     */
    public AsyncInvoker<DeleteAssetResourceRequest, DeleteAssetResourceResponse> deleteAssetResourceAsyncInvoker(
        DeleteAssetResourceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteAssetResource, hcClient);
    }

    /**
     * 删除对话
     *
     * 删除对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteChatRequest 请求对象
     * @return CompletableFuture<DeleteChatResponse>
     */
    public CompletableFuture<DeleteChatResponse> deleteChatAsync(DeleteChatRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteChat);
    }

    /**
     * 删除对话
     *
     * 删除对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteChatRequest 请求对象
     * @return AsyncInvoker<DeleteChatRequest, DeleteChatResponse>
     */
    public AsyncInvoker<DeleteChatRequest, DeleteChatResponse> deleteChatAsyncInvoker(DeleteChatRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteChat, hcClient);
    }

    /**
     * 解绑计算集群
     *
     * 解绑计算集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComputingClusterRequest 请求对象
     * @return CompletableFuture<DeleteComputingClusterResponse>
     */
    public CompletableFuture<DeleteComputingClusterResponse> deleteComputingClusterAsync(
        DeleteComputingClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteComputingCluster);
    }

    /**
     * 解绑计算集群
     *
     * 解绑计算集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComputingClusterRequest 请求对象
     * @return AsyncInvoker<DeleteComputingClusterRequest, DeleteComputingClusterResponse>
     */
    public AsyncInvoker<DeleteComputingClusterRequest, DeleteComputingClusterResponse> deleteComputingClusterAsyncInvoker(
        DeleteComputingClusterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteComputingCluster, hcClient);
    }

    /**
     * 删除数据作业
     *
     * 删除数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataJobRequest 请求对象
     * @return CompletableFuture<DeleteDataJobResponse>
     */
    public CompletableFuture<DeleteDataJobResponse> deleteDataJobAsync(DeleteDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDataJob);
    }

    /**
     * 删除数据作业
     *
     * 删除数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataJobRequest 请求对象
     * @return AsyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse>
     */
    public AsyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse> deleteDataJobAsyncInvoker(
        DeleteDataJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteDataJob, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDrugDatabaseResponse>
     */
    public CompletableFuture<DeleteDrugDatabaseResponse> deleteDrugDatabaseAsync(DeleteDrugDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDrugDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDrugDatabaseRequest, DeleteDrugDatabaseResponse>
     */
    public AsyncInvoker<DeleteDrugDatabaseRequest, DeleteDrugDatabaseResponse> deleteDrugDatabaseAsyncInvoker(
        DeleteDrugDatabaseRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteDrugDatabase, hcClient);
    }

    /**
     * 删除药物作业
     *
     * 删除药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugJobRequest 请求对象
     * @return CompletableFuture<DeleteDrugJobResponse>
     */
    public CompletableFuture<DeleteDrugJobResponse> deleteDrugJobAsync(DeleteDrugJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDrugJob);
    }

    /**
     * 删除药物作业
     *
     * 删除药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugJobRequest 请求对象
     * @return AsyncInvoker<DeleteDrugJobRequest, DeleteDrugJobResponse>
     */
    public AsyncInvoker<DeleteDrugJobRequest, DeleteDrugJobResponse> deleteDrugJobAsyncInvoker(
        DeleteDrugJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteDrugJob, hcClient);
    }

    /**
     * 删除模型
     *
     * 删除模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugModelRequest 请求对象
     * @return CompletableFuture<DeleteDrugModelResponse>
     */
    public CompletableFuture<DeleteDrugModelResponse> deleteDrugModelAsync(DeleteDrugModelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDrugModel);
    }

    /**
     * 删除模型
     *
     * 删除模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugModelRequest 请求对象
     * @return AsyncInvoker<DeleteDrugModelRequest, DeleteDrugModelResponse>
     */
    public AsyncInvoker<DeleteDrugModelRequest, DeleteDrugModelResponse> deleteDrugModelAsyncInvoker(
        DeleteDrugModelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteDrugModel, hcClient);
    }

    /**
     * 退订盘古药物分子大模型
     *
     * 退订盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugModelResourceRequest 请求对象
     * @return CompletableFuture<DeleteDrugModelResourceResponse>
     */
    public CompletableFuture<DeleteDrugModelResourceResponse> deleteDrugModelResourceAsync(
        DeleteDrugModelResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDrugModelResource);
    }

    /**
     * 退订盘古药物分子大模型
     *
     * 退订盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugModelResourceRequest 请求对象
     * @return AsyncInvoker<DeleteDrugModelResourceRequest, DeleteDrugModelResourceResponse>
     */
    public AsyncInvoker<DeleteDrugModelResourceRequest, DeleteDrugModelResourceResponse> deleteDrugModelResourceAsyncInvoker(
        DeleteDrugModelResourceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteDrugModelResource, hcClient);
    }

    /**
     * 取消收藏
     *
     * 取消收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFavoriteRequest 请求对象
     * @return CompletableFuture<DeleteFavoriteResponse>
     */
    public CompletableFuture<DeleteFavoriteResponse> deleteFavoriteAsync(DeleteFavoriteRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteFavorite);
    }

    /**
     * 取消收藏
     *
     * 取消收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFavoriteRequest 请求对象
     * @return AsyncInvoker<DeleteFavoriteRequest, DeleteFavoriteResponse>
     */
    public AsyncInvoker<DeleteFavoriteRequest, DeleteFavoriteResponse> deleteFavoriteAsyncInvoker(
        DeleteFavoriteRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteFavorite, hcClient);
    }

    /**
     * 删除镜像仓库
     *
     * 删除镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageRequest 请求对象
     * @return CompletableFuture<DeleteImageResponse>
     */
    public CompletableFuture<DeleteImageResponse> deleteImageAsync(DeleteImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteImage);
    }

    /**
     * 删除镜像仓库
     *
     * 删除镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageRequest 请求对象
     * @return AsyncInvoker<DeleteImageRequest, DeleteImageResponse>
     */
    public AsyncInvoker<DeleteImageRequest, DeleteImageResponse> deleteImageAsyncInvoker(DeleteImageRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteImage, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteJob, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelRequest 请求对象
     * @return CompletableFuture<DeleteLabelResponse>
     */
    public CompletableFuture<DeleteLabelResponse> deleteLabelAsync(DeleteLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteLabel);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelRequest 请求对象
     * @return AsyncInvoker<DeleteLabelRequest, DeleteLabelResponse>
     */
    public AsyncInvoker<DeleteLabelRequest, DeleteLabelResponse> deleteLabelAsyncInvoker(DeleteLabelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteLabel, hcClient);
    }

    /**
     * 移除项目成员
     *
     * 移除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return CompletableFuture<DeleteMemberResponse>
     */
    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteMember);
    }

    /**
     * 移除项目成员
     *
     * 移除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(
        DeleteMemberRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteMember, hcClient);
    }

    /**
     * 删除性能加速资源
     *
     * 删除性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePerformanceResourceRequest 请求对象
     * @return CompletableFuture<DeletePerformanceResourceResponse>
     */
    public CompletableFuture<DeletePerformanceResourceResponse> deletePerformanceResourceAsync(
        DeletePerformanceResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deletePerformanceResource);
    }

    /**
     * 删除性能加速资源
     *
     * 删除性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePerformanceResourceRequest 请求对象
     * @return AsyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse>
     */
    public AsyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> deletePerformanceResourceAsyncInvoker(
        DeletePerformanceResourceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deletePerformanceResource, hcClient);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectRequest 请求对象
     * @return CompletableFuture<DeleteProjectResponse>
     */
    public CompletableFuture<DeleteProjectResponse> deleteProjectAsync(DeleteProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteProject);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectRequest 请求对象
     * @return AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse>
     */
    public AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse> deleteProjectAsyncInvoker(
        DeleteProjectRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteProject, hcClient);
    }

    /**
     * 删除指定镜像tag
     *
     * 删除指定镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteTag);
    }

    /**
     * 删除指定镜像tag
     *
     * 删除指定镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteTag, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteUser, hcClient);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return CompletableFuture<DeleteWorkflowResponse>
     */
    public CompletableFuture<DeleteWorkflowResponse> deleteWorkflowAsync(DeleteWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteWorkflow);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowAsyncInvoker(
        DeleteWorkflowRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteWorkflow, hcClient);
    }

    /**
     * 启动作业
     *
     * 启动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return CompletableFuture<ExecuteJobResponse>
     */
    public CompletableFuture<ExecuteJobResponse> executeJobAsync(ExecuteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.executeJob);
    }

    /**
     * 启动作业
     *
     * 启动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobAsyncInvoker(ExecuteJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.executeJob, hcClient);
    }

    /**
     * 将传入的蛋白和小分子拼接成复合物结构
     *
     * 将传入的蛋白和小分子拼接成复合物结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateComplexCombineRequest 请求对象
     * @return CompletableFuture<GenerateComplexCombineResponse>
     */
    public CompletableFuture<GenerateComplexCombineResponse> generateComplexCombineAsync(
        GenerateComplexCombineRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.generateComplexCombine);
    }

    /**
     * 将传入的蛋白和小分子拼接成复合物结构
     *
     * 将传入的蛋白和小分子拼接成复合物结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateComplexCombineRequest 请求对象
     * @return AsyncInvoker<GenerateComplexCombineRequest, GenerateComplexCombineResponse>
     */
    public AsyncInvoker<GenerateComplexCombineRequest, GenerateComplexCombineResponse> generateComplexCombineAsyncInvoker(
        GenerateComplexCombineRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.generateComplexCombine, hcClient);
    }

    /**
     * 根据center、size、padding参数生成可渲染的口袋文件内容
     *
     * 根据center、size、padding参数生成可渲染的口袋文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GeneratePocketFileRequest 请求对象
     * @return CompletableFuture<GeneratePocketFileResponse>
     */
    public CompletableFuture<GeneratePocketFileResponse> generatePocketFileAsync(GeneratePocketFileRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.generatePocketFile);
    }

    /**
     * 根据center、size、padding参数生成可渲染的口袋文件内容
     *
     * 根据center、size、padding参数生成可渲染的口袋文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GeneratePocketFileRequest 请求对象
     * @return AsyncInvoker<GeneratePocketFileRequest, GeneratePocketFileResponse>
     */
    public AsyncInvoker<GeneratePocketFileRequest, GeneratePocketFileResponse> generatePocketFileAsyncInvoker(
        GeneratePocketFileRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.generatePocketFile, hcClient);
    }

    /**
     * 根据表面离散点坐标集生成可渲染的文件内容
     *
     * 根据表面离散点坐标集生成可渲染的文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateSurfacePointsRequest 请求对象
     * @return CompletableFuture<GenerateSurfacePointsResponse>
     */
    public CompletableFuture<GenerateSurfacePointsResponse> generateSurfacePointsAsync(
        GenerateSurfacePointsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.generateSurfacePoints);
    }

    /**
     * 根据表面离散点坐标集生成可渲染的文件内容
     *
     * 根据表面离散点坐标集生成可渲染的文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateSurfacePointsRequest 请求对象
     * @return AsyncInvoker<GenerateSurfacePointsRequest, GenerateSurfacePointsResponse>
     */
    public AsyncInvoker<GenerateSurfacePointsRequest, GenerateSurfacePointsResponse> generateSurfacePointsAsyncInvoker(
        GenerateSurfacePointsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.generateSurfacePoints, hcClient);
    }

    /**
     * 导入项目数据
     *
     * 导入项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataRequest 请求对象
     * @return CompletableFuture<ImportDataResponse>
     */
    public CompletableFuture<ImportDataResponse> importDataAsync(ImportDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importData);
    }

    /**
     * 导入项目数据
     *
     * 导入项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataRequest 请求对象
     * @return AsyncInvoker<ImportDataRequest, ImportDataResponse>
     */
    public AsyncInvoker<ImportDataRequest, ImportDataResponse> importDataAsyncInvoker(ImportDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.importData, hcClient);
    }

    /**
     * 导入镜像
     *
     * 导入镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportImageRequest 请求对象
     * @return CompletableFuture<ImportImageResponse>
     */
    public CompletableFuture<ImportImageResponse> importImageAsync(ImportImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importImage);
    }

    /**
     * 导入镜像
     *
     * 导入镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportImageRequest 请求对象
     * @return AsyncInvoker<ImportImageRequest, ImportImageResponse>
     */
    public AsyncInvoker<ImportImageRequest, ImportImageResponse> importImageAsyncInvoker(ImportImageRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.importImage, hcClient);
    }

    /**
     * 导入网上数据
     *
     * 导入网上数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportNetworkDataRequest 请求对象
     * @return CompletableFuture<ImportNetworkDataResponse>
     */
    public CompletableFuture<ImportNetworkDataResponse> importNetworkDataAsync(ImportNetworkDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importNetworkData);
    }

    /**
     * 导入网上数据
     *
     * 导入网上数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportNetworkDataRequest 请求对象
     * @return AsyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse>
     */
    public AsyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse> importNetworkDataAsyncInvoker(
        ImportNetworkDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.importNetworkData, hcClient);
    }

    /**
     * 导入用户
     *
     * 导入用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportUserRequest 请求对象
     * @return CompletableFuture<ImportUserResponse>
     */
    public CompletableFuture<ImportUserResponse> importUserAsync(ImportUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importUser);
    }

    /**
     * 导入用户
     *
     * 导入用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportUserRequest 请求对象
     * @return AsyncInvoker<ImportUserRequest, ImportUserResponse>
     */
    public AsyncInvoker<ImportUserRequest, ImportUserResponse> importUserAsyncInvoker(ImportUserRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.importUser, hcClient);
    }

    /**
     * 导入流程
     *
     * 导入流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportWorkflowRequest 请求对象
     * @return CompletableFuture<ImportWorkflowResponse>
     */
    public CompletableFuture<ImportWorkflowResponse> importWorkflowAsync(ImportWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importWorkflow);
    }

    /**
     * 导入流程
     *
     * 导入流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportWorkflowRequest 请求对象
     * @return AsyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse>
     */
    public AsyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse> importWorkflowAsyncInvoker(
        ImportWorkflowRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.importWorkflow, hcClient);
    }

    /**
     * 初始化平台
     *
     * 初始化平台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializePlatformRequest 请求对象
     * @return CompletableFuture<InitializePlatformResponse>
     */
    public CompletableFuture<InitializePlatformResponse> initializePlatformAsync(InitializePlatformRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.initializePlatform);
    }

    /**
     * 初始化平台
     *
     * 初始化平台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializePlatformRequest 请求对象
     * @return AsyncInvoker<InitializePlatformRequest, InitializePlatformResponse>
     */
    public AsyncInvoker<InitializePlatformRequest, InitializePlatformResponse> initializePlatformAsyncInvoker(
        InitializePlatformRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.initializePlatform, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppRequest 请求对象
     * @return CompletableFuture<ListAppResponse>
     */
    public CompletableFuture<ListAppResponse> listAppAsync(ListAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listApp);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppRequest 请求对象
     * @return AsyncInvoker<ListAppRequest, ListAppResponse>
     */
    public AsyncInvoker<ListAppRequest, ListAppResponse> listAppAsyncInvoker(ListAppRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listApp, hcClient);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetRequest 请求对象
     * @return CompletableFuture<ListAssetResponse>
     */
    public CompletableFuture<ListAssetResponse> listAssetAsync(ListAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listAsset);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetRequest 请求对象
     * @return AsyncInvoker<ListAssetRequest, ListAssetResponse>
     */
    public AsyncInvoker<ListAssetRequest, ListAssetResponse> listAssetAsyncInvoker(ListAssetRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listAsset, hcClient);
    }

    /**
     * 查询计费资产资源
     *
     * 查询计费资产资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetResourceRequest 请求对象
     * @return CompletableFuture<ListAssetResourceResponse>
     */
    public CompletableFuture<ListAssetResourceResponse> listAssetResourceAsync(ListAssetResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listAssetResource);
    }

    /**
     * 查询计费资产资源
     *
     * 查询计费资产资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetResourceRequest 请求对象
     * @return AsyncInvoker<ListAssetResourceRequest, ListAssetResourceResponse>
     */
    public AsyncInvoker<ListAssetResourceRequest, ListAssetResourceResponse> listAssetResourceAsyncInvoker(
        ListAssetResourceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listAssetResource, hcClient);
    }

    /**
     * 获取基模型列表
     *
     * 获取基模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaseModelRequest 请求对象
     * @return CompletableFuture<ListBaseModelResponse>
     */
    public CompletableFuture<ListBaseModelResponse> listBaseModelAsync(ListBaseModelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listBaseModel);
    }

    /**
     * 获取基模型列表
     *
     * 获取基模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaseModelRequest 请求对象
     * @return AsyncInvoker<ListBaseModelRequest, ListBaseModelResponse>
     */
    public AsyncInvoker<ListBaseModelRequest, ListBaseModelResponse> listBaseModelAsyncInvoker(
        ListBaseModelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listBaseModel, hcClient);
    }

    /**
     * 获取桶列表
     *
     * 获取桶列表(包含当前项目桶和引用项目桶)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketRequest 请求对象
     * @return CompletableFuture<ListBucketResponse>
     */
    public CompletableFuture<ListBucketResponse> listBucketAsync(ListBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listBucket);
    }

    /**
     * 获取桶列表
     *
     * 获取桶列表(包含当前项目桶和引用项目桶)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBucketRequest 请求对象
     * @return AsyncInvoker<ListBucketRequest, ListBucketResponse>
     */
    public AsyncInvoker<ListBucketRequest, ListBucketResponse> listBucketAsyncInvoker(ListBucketRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listBucket, hcClient);
    }

    /**
     * 获取CCE集群列表
     *
     * 获取CCE集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterRequest 请求对象
     * @return CompletableFuture<ListCceClusterResponse>
     */
    public CompletableFuture<ListCceClusterResponse> listCceClusterAsync(ListCceClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listCceCluster);
    }

    /**
     * 获取CCE集群列表
     *
     * 获取CCE集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterRequest 请求对象
     * @return AsyncInvoker<ListCceClusterRequest, ListCceClusterResponse>
     */
    public AsyncInvoker<ListCceClusterRequest, ListCceClusterResponse> listCceClusterAsyncInvoker(
        ListCceClusterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listCceCluster, hcClient);
    }

    /**
     * 获取对话列表
     *
     * 获取对话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChatRequest 请求对象
     * @return CompletableFuture<ListChatResponse>
     */
    public CompletableFuture<ListChatResponse> listChatAsync(ListChatRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listChat);
    }

    /**
     * 获取对话列表
     *
     * 获取对话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChatRequest 请求对象
     * @return AsyncInvoker<ListChatRequest, ListChatResponse>
     */
    public AsyncInvoker<ListChatRequest, ListChatResponse> listChatAsyncInvoker(ListChatRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listChat, hcClient);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterAllNodeLabelRequest 请求对象
     * @return CompletableFuture<ListClusterAllNodeLabelResponse>
     */
    public CompletableFuture<ListClusterAllNodeLabelResponse> listClusterAllNodeLabelAsync(
        ListClusterAllNodeLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listClusterAllNodeLabel);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterAllNodeLabelRequest 请求对象
     * @return AsyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse>
     */
    public AsyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> listClusterAllNodeLabelAsyncInvoker(
        ListClusterAllNodeLabelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listClusterAllNodeLabel, hcClient);
    }

    /**
     * 查询指定集群安装步骤列表
     *
     * 查询指定集群安装步骤列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterInstallStepRequest 请求对象
     * @return CompletableFuture<ListClusterInstallStepResponse>
     */
    public CompletableFuture<ListClusterInstallStepResponse> listClusterInstallStepAsync(
        ListClusterInstallStepRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listClusterInstallStep);
    }

    /**
     * 查询指定集群安装步骤列表
     *
     * 查询指定集群安装步骤列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterInstallStepRequest 请求对象
     * @return AsyncInvoker<ListClusterInstallStepRequest, ListClusterInstallStepResponse>
     */
    public AsyncInvoker<ListClusterInstallStepRequest, ListClusterInstallStepResponse> listClusterInstallStepAsyncInvoker(
        ListClusterInstallStepRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listClusterInstallStep, hcClient);
    }

    /**
     * 获取计算集群列表
     *
     * 获取计算集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComputingClusterRequest 请求对象
     * @return CompletableFuture<ListComputingClusterResponse>
     */
    public CompletableFuture<ListComputingClusterResponse> listComputingClusterAsync(
        ListComputingClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listComputingCluster);
    }

    /**
     * 获取计算集群列表
     *
     * 获取计算集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComputingClusterRequest 请求对象
     * @return AsyncInvoker<ListComputingClusterRequest, ListComputingClusterResponse>
     */
    public AsyncInvoker<ListComputingClusterRequest, ListComputingClusterResponse> listComputingClusterAsyncInvoker(
        ListComputingClusterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listComputingCluster, hcClient);
    }

    /**
     * 查询数据列表
     *
     * 查询指定目录下的数据列表，如果不指定默认查询根目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataRequest 请求对象
     * @return CompletableFuture<ListDataResponse>
     */
    public CompletableFuture<ListDataResponse> listDataAsync(ListDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listData);
    }

    /**
     * 查询数据列表
     *
     * 查询指定目录下的数据列表，如果不指定默认查询根目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataRequest 请求对象
     * @return AsyncInvoker<ListDataRequest, ListDataResponse>
     */
    public AsyncInvoker<ListDataRequest, ListDataResponse> listDataAsyncInvoker(ListDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listData, hcClient);
    }

    /**
     * 获取数据作业列表
     *
     * 获取数据作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataJobRequest 请求对象
     * @return CompletableFuture<ListDataJobResponse>
     */
    public CompletableFuture<ListDataJobResponse> listDataJobAsync(ListDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDataJob);
    }

    /**
     * 获取数据作业列表
     *
     * 获取数据作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataJobRequest 请求对象
     * @return AsyncInvoker<ListDataJobRequest, ListDataJobResponse>
     */
    public AsyncInvoker<ListDataJobRequest, ListDataJobResponse> listDataJobAsyncInvoker(ListDataJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listDataJob, hcClient);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugDatabaseRequest 请求对象
     * @return CompletableFuture<ListDrugDatabaseResponse>
     */
    public CompletableFuture<ListDrugDatabaseResponse> listDrugDatabaseAsync(ListDrugDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDrugDatabase);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugDatabaseRequest 请求对象
     * @return AsyncInvoker<ListDrugDatabaseRequest, ListDrugDatabaseResponse>
     */
    public AsyncInvoker<ListDrugDatabaseRequest, ListDrugDatabaseResponse> listDrugDatabaseAsyncInvoker(
        ListDrugDatabaseRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listDrugDatabase, hcClient);
    }

    /**
     * 获取药物作业列表
     *
     * 获取药物作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugJobRequest 请求对象
     * @return CompletableFuture<ListDrugJobResponse>
     */
    public CompletableFuture<ListDrugJobResponse> listDrugJobAsync(ListDrugJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDrugJob);
    }

    /**
     * 获取药物作业列表
     *
     * 获取药物作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugJobRequest 请求对象
     * @return AsyncInvoker<ListDrugJobRequest, ListDrugJobResponse>
     */
    public AsyncInvoker<ListDrugJobRequest, ListDrugJobResponse> listDrugJobAsyncInvoker(ListDrugJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listDrugJob, hcClient);
    }

    /**
     * 获取模型列表
     *
     * 获取模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugModelRequest 请求对象
     * @return CompletableFuture<ListDrugModelResponse>
     */
    public CompletableFuture<ListDrugModelResponse> listDrugModelAsync(ListDrugModelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDrugModel);
    }

    /**
     * 获取模型列表
     *
     * 获取模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugModelRequest 请求对象
     * @return AsyncInvoker<ListDrugModelRequest, ListDrugModelResponse>
     */
    public AsyncInvoker<ListDrugModelRequest, ListDrugModelResponse> listDrugModelAsyncInvoker(
        ListDrugModelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listDrugModel, hcClient);
    }

    /**
     * 查询盘古药物分子大模型
     *
     * 查询盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugModelResource1Request 请求对象
     * @return CompletableFuture<ListDrugModelResource1Response>
     */
    public CompletableFuture<ListDrugModelResource1Response> listDrugModelResource1Async(
        ListDrugModelResource1Request request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDrugModelResource1);
    }

    /**
     * 查询盘古药物分子大模型
     *
     * 查询盘古药物分子大模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrugModelResource1Request 请求对象
     * @return AsyncInvoker<ListDrugModelResource1Request, ListDrugModelResource1Response>
     */
    public AsyncInvoker<ListDrugModelResource1Request, ListDrugModelResource1Response> listDrugModelResource1AsyncInvoker(
        ListDrugModelResource1Request request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listDrugModelResource1, hcClient);
    }

    /**
     * 获取收藏夹列表
     *
     * 获取收藏夹列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFavoriteRequest 请求对象
     * @return CompletableFuture<ListFavoriteResponse>
     */
    public CompletableFuture<ListFavoriteResponse> listFavoriteAsync(ListFavoriteRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listFavorite);
    }

    /**
     * 获取收藏夹列表
     *
     * 获取收藏夹列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFavoriteRequest 请求对象
     * @return AsyncInvoker<ListFavoriteRequest, ListFavoriteResponse>
     */
    public AsyncInvoker<ListFavoriteRequest, ListFavoriteResponse> listFavoriteAsyncInvoker(
        ListFavoriteRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listFavorite, hcClient);
    }

    /**
     * 统计全局流程、作业信息
     *
     * 统计全局流程、作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalWorkflowStatisticRequest 请求对象
     * @return CompletableFuture<ListGlobalWorkflowStatisticResponse>
     */
    public CompletableFuture<ListGlobalWorkflowStatisticResponse> listGlobalWorkflowStatisticAsync(
        ListGlobalWorkflowStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listGlobalWorkflowStatistic);
    }

    /**
     * 统计全局流程、作业信息
     *
     * 统计全局流程、作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalWorkflowStatisticRequest 请求对象
     * @return AsyncInvoker<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse>
     */
    public AsyncInvoker<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> listGlobalWorkflowStatisticAsyncInvoker(
        ListGlobalWorkflowStatisticRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listGlobalWorkflowStatistic, hcClient);
    }

    /**
     * 查询IAM用户组的用户列表
     *
     * 查询IAM用户组的用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamGroupUsersRequest 请求对象
     * @return CompletableFuture<ListIamGroupUsersResponse>
     */
    public CompletableFuture<ListIamGroupUsersResponse> listIamGroupUsersAsync(ListIamGroupUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listIamGroupUsers);
    }

    /**
     * 查询IAM用户组的用户列表
     *
     * 查询IAM用户组的用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamGroupUsersRequest 请求对象
     * @return AsyncInvoker<ListIamGroupUsersRequest, ListIamGroupUsersResponse>
     */
    public AsyncInvoker<ListIamGroupUsersRequest, ListIamGroupUsersResponse> listIamGroupUsersAsyncInvoker(
        ListIamGroupUsersRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listIamGroupUsers, hcClient);
    }

    /**
     * 查询IAM用户组列表
     *
     * 查询IAM用户组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamGroupsRequest 请求对象
     * @return CompletableFuture<ListIamGroupsResponse>
     */
    public CompletableFuture<ListIamGroupsResponse> listIamGroupsAsync(ListIamGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listIamGroups);
    }

    /**
     * 查询IAM用户组列表
     *
     * 查询IAM用户组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamGroupsRequest 请求对象
     * @return AsyncInvoker<ListIamGroupsRequest, ListIamGroupsResponse>
     */
    public AsyncInvoker<ListIamGroupsRequest, ListIamGroupsResponse> listIamGroupsAsyncInvoker(
        ListIamGroupsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listIamGroups, hcClient);
    }

    /**
     * 查询IAM用户列表
     *
     * 查询IAM用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamUsersRequest 请求对象
     * @return CompletableFuture<ListIamUsersResponse>
     */
    public CompletableFuture<ListIamUsersResponse> listIamUsersAsync(ListIamUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listIamUsers);
    }

    /**
     * 查询IAM用户列表
     *
     * 查询IAM用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIamUsersRequest 请求对象
     * @return AsyncInvoker<ListIamUsersRequest, ListIamUsersResponse>
     */
    public AsyncInvoker<ListIamUsersRequest, ListIamUsersResponse> listIamUsersAsyncInvoker(
        ListIamUsersRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listIamUsers, hcClient);
    }

    /**
     * 获取镜像列表
     *
     * 获取镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRequest 请求对象
     * @return CompletableFuture<ListImageResponse>
     */
    public CompletableFuture<ListImageResponse> listImageAsync(ListImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listImage);
    }

    /**
     * 获取镜像列表
     *
     * 获取镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRequest 请求对象
     * @return AsyncInvoker<ListImageRequest, ListImageResponse>
     */
    public AsyncInvoker<ListImageRequest, ListImageResponse> listImageAsyncInvoker(ListImageRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listImage, hcClient);
    }

    /**
     * 获取指定镜像的tag列表
     *
     * 获取指定镜像的tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageTagRequest 请求对象
     * @return CompletableFuture<ListImageTagResponse>
     */
    public CompletableFuture<ListImageTagResponse> listImageTagAsync(ListImageTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listImageTag);
    }

    /**
     * 获取指定镜像的tag列表
     *
     * 获取指定镜像的tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageTagRequest 请求对象
     * @return AsyncInvoker<ListImageTagRequest, ListImageTagResponse>
     */
    public AsyncInvoker<ListImageTagRequest, ListImageTagResponse> listImageTagAsyncInvoker(
        ListImageTagRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listImageTag, hcClient);
    }

    /**
     * 获取作业列表
     *
     * 获取作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return CompletableFuture<ListJobResponse>
     */
    public CompletableFuture<ListJobResponse> listJobAsync(ListJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listJob);
    }

    /**
     * 获取作业列表
     *
     * 获取作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return AsyncInvoker<ListJobRequest, ListJobResponse>
     */
    public AsyncInvoker<ListJobRequest, ListJobResponse> listJobAsyncInvoker(ListJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listJob, hcClient);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelRequest 请求对象
     * @return CompletableFuture<ListLabelResponse>
     */
    public CompletableFuture<ListLabelResponse> listLabelAsync(ListLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listLabel);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelRequest 请求对象
     * @return AsyncInvoker<ListLabelRequest, ListLabelResponse>
     */
    public AsyncInvoker<ListLabelRequest, ListLabelResponse> listLabelAsyncInvoker(ListLabelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listLabel, hcClient);
    }

    /**
     * 获取可用的认证方法
     *
     * 获取可用的认证方法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMfaRequest 请求对象
     * @return CompletableFuture<ListMfaResponse>
     */
    public CompletableFuture<ListMfaResponse> listMfaAsync(ListMfaRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listMfa);
    }

    /**
     * 获取可用的认证方法
     *
     * 获取可用的认证方法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMfaRequest 请求对象
     * @return AsyncInvoker<ListMfaRequest, ListMfaResponse>
     */
    public AsyncInvoker<ListMfaRequest, ListMfaResponse> listMfaAsyncInvoker(ListMfaRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listMfa, hcClient);
    }

    /**
     * 获取性能加速资源上统计信息
     *
     * 获取性能加速资源上统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPerformanceResourceStatRequest 请求对象
     * @return CompletableFuture<ListPerformanceResourceStatResponse>
     */
    public CompletableFuture<ListPerformanceResourceStatResponse> listPerformanceResourceStatAsync(
        ListPerformanceResourceStatRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listPerformanceResourceStat);
    }

    /**
     * 获取性能加速资源上统计信息
     *
     * 获取性能加速资源上统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPerformanceResourceStatRequest 请求对象
     * @return AsyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse>
     */
    public AsyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> listPerformanceResourceStatAsyncInvoker(
        ListPerformanceResourceStatRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listPerformanceResourceStat, hcClient);
    }

    /**
     * 查询性能加速资源
     *
     * 查询性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPerformanceResourcesRequest 请求对象
     * @return CompletableFuture<ListPerformanceResourcesResponse>
     */
    public CompletableFuture<ListPerformanceResourcesResponse> listPerformanceResourcesAsync(
        ListPerformanceResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listPerformanceResources);
    }

    /**
     * 查询性能加速资源
     *
     * 查询性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPerformanceResourcesRequest 请求对象
     * @return AsyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse>
     */
    public AsyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> listPerformanceResourcesAsyncInvoker(
        ListPerformanceResourcesRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listPerformanceResources, hcClient);
    }

    /**
     * 获取空间列表
     *
     * 获取空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRequest 请求对象
     * @return CompletableFuture<ListProjectResponse>
     */
    public CompletableFuture<ListProjectResponse> listProjectAsync(ListProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listProject);
    }

    /**
     * 获取空间列表
     *
     * 获取空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRequest 请求对象
     * @return AsyncInvoker<ListProjectRequest, ListProjectResponse>
     */
    public AsyncInvoker<ListProjectRequest, ListProjectResponse> listProjectAsyncInvoker(ListProjectRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listProject, hcClient);
    }

    /**
     * 获取当前用户所属空间资源统计信息
     *
     * 获取当前用户所属空间资源统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectStatisticsRequest 请求对象
     * @return CompletableFuture<ListProjectStatisticsResponse>
     */
    public CompletableFuture<ListProjectStatisticsResponse> listProjectStatisticsAsync(
        ListProjectStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listProjectStatistics);
    }

    /**
     * 获取当前用户所属空间资源统计信息
     *
     * 获取当前用户所属空间资源统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectStatisticsRequest 请求对象
     * @return AsyncInvoker<ListProjectStatisticsRequest, ListProjectStatisticsResponse>
     */
    public AsyncInvoker<ListProjectStatisticsRequest, ListProjectStatisticsResponse> listProjectStatisticsAsyncInvoker(
        ListProjectStatisticsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listProjectStatistics, hcClient);
    }

    /**
     * 获取属性值列表
     *
     * 获取属性值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPropertyRequest 请求对象
     * @return CompletableFuture<ListPropertyResponse>
     */
    public CompletableFuture<ListPropertyResponse> listPropertyAsync(ListPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listProperty);
    }

    /**
     * 获取属性值列表
     *
     * 获取属性值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPropertyRequest 请求对象
     * @return AsyncInvoker<ListPropertyRequest, ListPropertyResponse>
     */
    public AsyncInvoker<ListPropertyRequest, ListPropertyResponse> listPropertyAsyncInvoker(
        ListPropertyRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listProperty, hcClient);
    }

    /**
     * 获取当前系统配额及资源使用情况
     *
     * 获取当前系统配额及资源使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return CompletableFuture<ListQuotaResponse>
     */
    public CompletableFuture<ListQuotaResponse> listQuotaAsync(ListQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listQuota);
    }

    /**
     * 获取当前系统配额及资源使用情况
     *
     * 获取当前系统配额及资源使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return AsyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public AsyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaAsyncInvoker(ListQuotaRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listQuota, hcClient);
    }

    /**
     * 获取sfs-turbo资源列表
     *
     * 获取sfs-turbo资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSfsTurbosRequest 请求对象
     * @return CompletableFuture<ListSfsTurbosResponse>
     */
    public CompletableFuture<ListSfsTurbosResponse> listSfsTurbosAsync(ListSfsTurbosRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listSfsTurbos);
    }

    /**
     * 获取sfs-turbo资源列表
     *
     * 获取sfs-turbo资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSfsTurbosRequest 请求对象
     * @return AsyncInvoker<ListSfsTurbosRequest, ListSfsTurbosResponse>
     */
    public AsyncInvoker<ListSfsTurbosRequest, ListSfsTurbosResponse> listSfsTurbosAsyncInvoker(
        ListSfsTurbosRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listSfsTurbos, hcClient);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return CompletableFuture<ListUserResponse>
     */
    public CompletableFuture<ListUserResponse> listUserAsync(ListUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listUser);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return AsyncInvoker<ListUserRequest, ListUserResponse>
     */
    public AsyncInvoker<ListUserRequest, ListUserResponse> listUserAsyncInvoker(ListUserRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listUser, hcClient);
    }

    /**
     * 获取用户所属空间的应用列表
     *
     * 获取用户所属空间的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserAppRequest 请求对象
     * @return CompletableFuture<ListUserAppResponse>
     */
    public CompletableFuture<ListUserAppResponse> listUserAppAsync(ListUserAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listUserApp);
    }

    /**
     * 获取用户所属空间的应用列表
     *
     * 获取用户所属空间的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserAppRequest 请求对象
     * @return AsyncInvoker<ListUserAppRequest, ListUserAppResponse>
     */
    public AsyncInvoker<ListUserAppRequest, ListUserAppResponse> listUserAppAsyncInvoker(ListUserAppRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listUserApp, hcClient);
    }

    /**
     * 获取用户所属空间的药物作业列表
     *
     * 获取用户所属空间的药物作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDrugJobRequest 请求对象
     * @return CompletableFuture<ListUserDrugJobResponse>
     */
    public CompletableFuture<ListUserDrugJobResponse> listUserDrugJobAsync(ListUserDrugJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listUserDrugJob);
    }

    /**
     * 获取用户所属空间的药物作业列表
     *
     * 获取用户所属空间的药物作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDrugJobRequest 请求对象
     * @return AsyncInvoker<ListUserDrugJobRequest, ListUserDrugJobResponse>
     */
    public AsyncInvoker<ListUserDrugJobRequest, ListUserDrugJobResponse> listUserDrugJobAsyncInvoker(
        ListUserDrugJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listUserDrugJob, hcClient);
    }

    /**
     * 获取用户所属空间的镜像列表
     *
     * 获取用户所属空间的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserImageRequest 请求对象
     * @return CompletableFuture<ListUserImageResponse>
     */
    public CompletableFuture<ListUserImageResponse> listUserImageAsync(ListUserImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listUserImage);
    }

    /**
     * 获取用户所属空间的镜像列表
     *
     * 获取用户所属空间的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserImageRequest 请求对象
     * @return AsyncInvoker<ListUserImageRequest, ListUserImageResponse>
     */
    public AsyncInvoker<ListUserImageRequest, ListUserImageResponse> listUserImageAsyncInvoker(
        ListUserImageRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listUserImage, hcClient);
    }

    /**
     * 获取用户所属空间的作业列表
     *
     * 获取用户所属空间的作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserJobRequest 请求对象
     * @return CompletableFuture<ListUserJobResponse>
     */
    public CompletableFuture<ListUserJobResponse> listUserJobAsync(ListUserJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listUserJob);
    }

    /**
     * 获取用户所属空间的作业列表
     *
     * 获取用户所属空间的作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserJobRequest 请求对象
     * @return AsyncInvoker<ListUserJobRequest, ListUserJobResponse>
     */
    public AsyncInvoker<ListUserJobRequest, ListUserJobResponse> listUserJobAsyncInvoker(ListUserJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listUserJob, hcClient);
    }

    /**
     * 获取用户所属空间的流程列表
     *
     * 获取用户所属空间的流程列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserWorkflowRequest 请求对象
     * @return CompletableFuture<ListUserWorkflowResponse>
     */
    public CompletableFuture<ListUserWorkflowResponse> listUserWorkflowAsync(ListUserWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listUserWorkflow);
    }

    /**
     * 获取用户所属空间的流程列表
     *
     * 获取用户所属空间的流程列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserWorkflowRequest 请求对象
     * @return AsyncInvoker<ListUserWorkflowRequest, ListUserWorkflowResponse>
     */
    public AsyncInvoker<ListUserWorkflowRequest, ListUserWorkflowResponse> listUserWorkflowAsyncInvoker(
        ListUserWorkflowRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listUserWorkflow, hcClient);
    }

    /**
     * 获取供应商列表
     *
     * 获取供应商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVendorRequest 请求对象
     * @return CompletableFuture<ListVendorResponse>
     */
    public CompletableFuture<ListVendorResponse> listVendorAsync(ListVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listVendor);
    }

    /**
     * 获取供应商列表
     *
     * 获取供应商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVendorRequest 请求对象
     * @return AsyncInvoker<ListVendorRequest, ListVendorResponse>
     */
    public AsyncInvoker<ListVendorRequest, ListVendorResponse> listVendorAsyncInvoker(ListVendorRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listVendor, hcClient);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowRequest 请求对象
     * @return CompletableFuture<ListWorkflowResponse>
     */
    public CompletableFuture<ListWorkflowResponse> listWorkflowAsync(ListWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listWorkflow);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowRequest 请求对象
     * @return AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowAsyncInvoker(
        ListWorkflowRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listWorkflow, hcClient);
    }

    /**
     * 引用项目数据
     *
     * 引用项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QuoteDataRequest 请求对象
     * @return CompletableFuture<QuoteDataResponse>
     */
    public CompletableFuture<QuoteDataResponse> quoteDataAsync(QuoteDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.quoteData);
    }

    /**
     * 引用项目数据
     *
     * 引用项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QuoteDataRequest 请求对象
     * @return AsyncInvoker<QuoteDataRequest, QuoteDataResponse>
     */
    public AsyncInvoker<QuoteDataRequest, QuoteDataResponse> quoteDataAsyncInvoker(QuoteDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.quoteData, hcClient);
    }

    /**
     * 重试数据作业
     *
     * 重试数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryDataJobRequest 请求对象
     * @return CompletableFuture<RetryDataJobResponse>
     */
    public CompletableFuture<RetryDataJobResponse> retryDataJobAsync(RetryDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.retryDataJob);
    }

    /**
     * 重试数据作业
     *
     * 重试数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryDataJobRequest 请求对象
     * @return AsyncInvoker<RetryDataJobRequest, RetryDataJobResponse>
     */
    public AsyncInvoker<RetryDataJobRequest, RetryDataJobResponse> retryDataJobAsyncInvoker(
        RetryDataJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.retryDataJob, hcClient);
    }

    /**
     * 重试作业
     *
     * 重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobRequest 请求对象
     * @return CompletableFuture<RetryJobResponse>
     */
    public CompletableFuture<RetryJobResponse> retryJobAsync(RetryJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.retryJob);
    }

    /**
     * 重试作业
     *
     * 重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobRequest 请求对象
     * @return AsyncInvoker<RetryJobRequest, RetryJobResponse>
     */
    public AsyncInvoker<RetryJobRequest, RetryJobResponse> retryJobAsyncInvoker(RetryJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.retryJob, hcClient);
    }

    /**
     * 受体预处理（Fasta格式）
     *
     * 受体预处理（Fasta格式），用于前端计算预期扣费次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFastaPreprocessRequest 请求对象
     * @return CompletableFuture<RunFastaPreprocessResponse>
     */
    public CompletableFuture<RunFastaPreprocessResponse> runFastaPreprocessAsync(RunFastaPreprocessRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.runFastaPreprocess);
    }

    /**
     * 受体预处理（Fasta格式）
     *
     * 受体预处理（Fasta格式），用于前端计算预期扣费次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFastaPreprocessRequest 请求对象
     * @return AsyncInvoker<RunFastaPreprocessRequest, RunFastaPreprocessResponse>
     */
    public AsyncInvoker<RunFastaPreprocessRequest, RunFastaPreprocessResponse> runFastaPreprocessAsyncInvoker(
        RunFastaPreprocessRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.runFastaPreprocess, hcClient);
    }

    /**
     * 单分子文件格式转换
     *
     * 单分子文件格式转换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFormatConverterRequest 请求对象
     * @return CompletableFuture<RunFormatConverterResponse>
     */
    public CompletableFuture<RunFormatConverterResponse> runFormatConverterAsync(RunFormatConverterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.runFormatConverter);
    }

    /**
     * 单分子文件格式转换
     *
     * 单分子文件格式转换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunFormatConverterRequest 请求对象
     * @return AsyncInvoker<RunFormatConverterRequest, RunFormatConverterResponse>
     */
    public AsyncInvoker<RunFormatConverterRequest, RunFormatConverterResponse> runFormatConverterAsyncInvoker(
        RunFormatConverterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.runFormatConverter, hcClient);
    }

    /**
     * 查询分子属性预测作业详情
     *
     * 查询分子属性预测作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdmetJobRequest 请求对象
     * @return CompletableFuture<ShowAdmetJobResponse>
     */
    public CompletableFuture<ShowAdmetJobResponse> showAdmetJobAsync(ShowAdmetJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAdmetJob);
    }

    /**
     * 查询分子属性预测作业详情
     *
     * 查询分子属性预测作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdmetJobRequest 请求对象
     * @return AsyncInvoker<ShowAdmetJobRequest, ShowAdmetJobResponse>
     */
    public AsyncInvoker<ShowAdmetJobRequest, ShowAdmetJobResponse> showAdmetJobAsyncInvoker(
        ShowAdmetJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showAdmetJob, hcClient);
    }

    /**
     * 获取业务委托
     *
     * 获取业务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return CompletableFuture<ShowAgencyResponse>
     */
    public CompletableFuture<ShowAgencyResponse> showAgencyAsync(ShowAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAgency);
    }

    /**
     * 获取业务委托
     *
     * 获取业务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyAsyncInvoker(ShowAgencyRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showAgency, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return CompletableFuture<ShowAppResponse>
     */
    public CompletableFuture<ShowAppResponse> showAppAsync(ShowAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showApp);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showApp, hcClient);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return CompletableFuture<ShowAssetResponse>
     */
    public CompletableFuture<ShowAssetResponse> showAssetAsync(ShowAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAsset);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return AsyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public AsyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetAsyncInvoker(ShowAssetRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showAsset, hcClient);
    }

    /**
     * 查询资产版本详情
     *
     * 查询资产版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetVersionRequest 请求对象
     * @return CompletableFuture<ShowAssetVersionResponse>
     */
    public CompletableFuture<ShowAssetVersionResponse> showAssetVersionAsync(ShowAssetVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAssetVersion);
    }

    /**
     * 查询资产版本详情
     *
     * 查询资产版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetVersionRequest 请求对象
     * @return AsyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse>
     */
    public AsyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse> showAssetVersionAsyncInvoker(
        ShowAssetVersionRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showAssetVersion, hcClient);
    }

    /**
     * 获取桶存量信息
     *
     * 获取桶存量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketStorageRequest 请求对象
     * @return CompletableFuture<ShowBucketStorageResponse>
     */
    public CompletableFuture<ShowBucketStorageResponse> showBucketStorageAsync(ShowBucketStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showBucketStorage);
    }

    /**
     * 获取桶存量信息
     *
     * 获取桶存量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketStorageRequest 请求对象
     * @return AsyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse>
     */
    public AsyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse> showBucketStorageAsyncInvoker(
        ShowBucketStorageRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showBucketStorage, hcClient);
    }

    /**
     * 获取对话详情
     *
     * 获取对话详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChatRequest 请求对象
     * @return CompletableFuture<ShowChatResponse>
     */
    public CompletableFuture<ShowChatResponse> showChatAsync(ShowChatRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showChat);
    }

    /**
     * 获取对话详情
     *
     * 获取对话详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChatRequest 请求对象
     * @return AsyncInvoker<ShowChatRequest, ShowChatResponse>
     */
    public AsyncInvoker<ShowChatRequest, ShowChatResponse> showChatAsyncInvoker(ShowChatRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showChat, hcClient);
    }

    /**
     * 查询聚类分析作业详情
     *
     * 查询聚类分析作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusteringJobRequest 请求对象
     * @return CompletableFuture<ShowClusteringJobResponse>
     */
    public CompletableFuture<ShowClusteringJobResponse> showClusteringJobAsync(ShowClusteringJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showClusteringJob);
    }

    /**
     * 查询聚类分析作业详情
     *
     * 查询聚类分析作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusteringJobRequest 请求对象
     * @return AsyncInvoker<ShowClusteringJobRequest, ShowClusteringJobResponse>
     */
    public AsyncInvoker<ShowClusteringJobRequest, ShowClusteringJobResponse> showClusteringJobAsyncInvoker(
        ShowClusteringJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showClusteringJob, hcClient);
    }

    /**
     * 获取数据详情
     *
     * 获取指定数据对象的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataRequest 请求对象
     * @return CompletableFuture<ShowDataResponse>
     */
    public CompletableFuture<ShowDataResponse> showDataAsync(ShowDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showData);
    }

    /**
     * 获取数据详情
     *
     * 获取指定数据对象的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataRequest 请求对象
     * @return AsyncInvoker<ShowDataRequest, ShowDataResponse>
     */
    public AsyncInvoker<ShowDataRequest, ShowDataResponse> showDataAsyncInvoker(ShowDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showData, hcClient);
    }

    /**
     * 获取数据作业详细信息
     *
     * 获取数据作业详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataJobRequest 请求对象
     * @return CompletableFuture<ShowDataJobResponse>
     */
    public CompletableFuture<ShowDataJobResponse> showDataJobAsync(ShowDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDataJob);
    }

    /**
     * 获取数据作业详细信息
     *
     * 获取数据作业详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataJobRequest 请求对象
     * @return AsyncInvoker<ShowDataJobRequest, ShowDataJobResponse>
     */
    public AsyncInvoker<ShowDataJobRequest, ShowDataJobResponse> showDataJobAsyncInvoker(ShowDataJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showDataJob, hcClient);
    }

    /**
     * 获取docker login指令
     *
     * 获取docker login指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockerLoginRequest 请求对象
     * @return CompletableFuture<ShowDockerLoginResponse>
     */
    public CompletableFuture<ShowDockerLoginResponse> showDockerLoginAsync(ShowDockerLoginRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDockerLogin);
    }

    /**
     * 获取docker login指令
     *
     * 获取docker login指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockerLoginRequest 请求对象
     * @return AsyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse>
     */
    public AsyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse> showDockerLoginAsyncInvoker(
        ShowDockerLoginRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showDockerLogin, hcClient);
    }

    /**
     * 查询分子对接作业详情
     *
     * 查询分子对接作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockingJobRequest 请求对象
     * @return CompletableFuture<ShowDockingJobResponse>
     */
    public CompletableFuture<ShowDockingJobResponse> showDockingJobAsync(ShowDockingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDockingJob);
    }

    /**
     * 查询分子对接作业详情
     *
     * 查询分子对接作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDockingJobRequest 请求对象
     * @return AsyncInvoker<ShowDockingJobRequest, ShowDockingJobResponse>
     */
    public AsyncInvoker<ShowDockingJobRequest, ShowDockingJobResponse> showDockingJobAsyncInvoker(
        ShowDockingJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showDockingJob, hcClient);
    }

    /**
     * 查询系统配置列表
     *
     * 获取系统配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvRequest 请求对象
     * @return CompletableFuture<ShowEnvResponse>
     */
    public CompletableFuture<ShowEnvResponse> showEnvAsync(ShowEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showEnv);
    }

    /**
     * 查询系统配置列表
     *
     * 获取系统配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvRequest 请求对象
     * @return AsyncInvoker<ShowEnvRequest, ShowEnvResponse>
     */
    public AsyncInvoker<ShowEnvRequest, ShowEnvResponse> showEnvAsyncInvoker(ShowEnvRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showEnv, hcClient);
    }

    /**
     * 查询自由能微扰作业详情
     *
     * 查询自由能微扰作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFepJobRequest 请求对象
     * @return CompletableFuture<ShowFepJobResponse>
     */
    public CompletableFuture<ShowFepJobResponse> showFepJobAsync(ShowFepJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showFepJob);
    }

    /**
     * 查询自由能微扰作业详情
     *
     * 查询自由能微扰作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFepJobRequest 请求对象
     * @return AsyncInvoker<ShowFepJobRequest, ShowFepJobResponse>
     */
    public AsyncInvoker<ShowFepJobRequest, ShowFepJobResponse> showFepJobAsyncInvoker(ShowFepJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showFepJob, hcClient);
    }

    /**
     * 查询分子生成作业详情
     *
     * 查询分子生成作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGenJobRequest 请求对象
     * @return CompletableFuture<ShowGenJobResponse>
     */
    public CompletableFuture<ShowGenJobResponse> showGenJobAsync(ShowGenJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showGenJob);
    }

    /**
     * 查询分子生成作业详情
     *
     * 查询分子生成作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGenJobRequest 请求对象
     * @return AsyncInvoker<ShowGenJobRequest, ShowGenJobResponse>
     */
    public AsyncInvoker<ShowGenJobRequest, ShowGenJobResponse> showGenJobAsyncInvoker(ShowGenJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showGenJob, hcClient);
    }

    /**
     * 获取作业详情
     *
     * 获取作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showJob);
    }

    /**
     * 获取作业详情
     *
     * 获取作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showJob, hcClient);
    }

    /**
     * 获取作业事件
     *
     * 获取作业事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobEventRequest 请求对象
     * @return CompletableFuture<ShowJobEventResponse>
     */
    public CompletableFuture<ShowJobEventResponse> showJobEventAsync(ShowJobEventRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showJobEvent);
    }

    /**
     * 获取作业事件
     *
     * 获取作业事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobEventRequest 请求对象
     * @return AsyncInvoker<ShowJobEventRequest, ShowJobEventResponse>
     */
    public AsyncInvoker<ShowJobEventRequest, ShowJobEventResponse> showJobEventAsyncInvoker(
        ShowJobEventRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showJobEvent, hcClient);
    }

    /**
     * 获取作业日志
     *
     * 获取作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobLogRequest 请求对象
     * @return CompletableFuture<ShowJobLogResponse>
     */
    public CompletableFuture<ShowJobLogResponse> showJobLogAsync(ShowJobLogRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showJobLog);
    }

    /**
     * 获取作业日志
     *
     * 获取作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobLogRequest 请求对象
     * @return AsyncInvoker<ShowJobLogRequest, ShowJobLogResponse>
     */
    public AsyncInvoker<ShowJobLogRequest, ShowJobLogResponse> showJobLogAsyncInvoker(ShowJobLogRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showJobLog, hcClient);
    }

    /**
     * 查询分子或分子复合物批量下载任务详情
     *
     * 查询分子或分子复合物批量下载任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMolBatchDownloadTaskRequest 请求对象
     * @return CompletableFuture<ShowMolBatchDownloadTaskResponse>
     */
    public CompletableFuture<ShowMolBatchDownloadTaskResponse> showMolBatchDownloadTaskAsync(
        ShowMolBatchDownloadTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showMolBatchDownloadTask);
    }

    /**
     * 查询分子或分子复合物批量下载任务详情
     *
     * 查询分子或分子复合物批量下载任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMolBatchDownloadTaskRequest 请求对象
     * @return AsyncInvoker<ShowMolBatchDownloadTaskRequest, ShowMolBatchDownloadTaskResponse>
     */
    public AsyncInvoker<ShowMolBatchDownloadTaskRequest, ShowMolBatchDownloadTaskResponse> showMolBatchDownloadTaskAsyncInvoker(
        ShowMolBatchDownloadTaskRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showMolBatchDownloadTask, hcClient);
    }

    /**
     * 查询分子优化作业详情
     *
     * 查询分子优化作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOptmJobRequest 请求对象
     * @return CompletableFuture<ShowOptmJobResponse>
     */
    public CompletableFuture<ShowOptmJobResponse> showOptmJobAsync(ShowOptmJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showOptmJob);
    }

    /**
     * 查询分子优化作业详情
     *
     * 查询分子优化作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOptmJobRequest 请求对象
     * @return AsyncInvoker<ShowOptmJobRequest, ShowOptmJobResponse>
     */
    public AsyncInvoker<ShowOptmJobRequest, ShowOptmJobResponse> showOptmJobAsyncInvoker(ShowOptmJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showOptmJob, hcClient);
    }

    /**
     * 查询靶点口袋发现作业详情
     *
     * 查询靶点口袋发现作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPocketDetectionJobRequest 请求对象
     * @return CompletableFuture<ShowPocketDetectionJobResponse>
     */
    public CompletableFuture<ShowPocketDetectionJobResponse> showPocketDetectionJobAsync(
        ShowPocketDetectionJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showPocketDetectionJob);
    }

    /**
     * 查询靶点口袋发现作业详情
     *
     * 查询靶点口袋发现作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPocketDetectionJobRequest 请求对象
     * @return AsyncInvoker<ShowPocketDetectionJobRequest, ShowPocketDetectionJobResponse>
     */
    public AsyncInvoker<ShowPocketDetectionJobRequest, ShowPocketDetectionJobResponse> showPocketDetectionJobAsyncInvoker(
        ShowPocketDetectionJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showPocketDetectionJob, hcClient);
    }

    /**
     * 查询靶点口袋分子设计作业详情
     *
     * 查询靶点口袋分子设计作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPocketMolDesignJobRequest 请求对象
     * @return CompletableFuture<ShowPocketMolDesignJobResponse>
     */
    public CompletableFuture<ShowPocketMolDesignJobResponse> showPocketMolDesignJobAsync(
        ShowPocketMolDesignJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showPocketMolDesignJob);
    }

    /**
     * 查询靶点口袋分子设计作业详情
     *
     * 查询靶点口袋分子设计作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPocketMolDesignJobRequest 请求对象
     * @return AsyncInvoker<ShowPocketMolDesignJobRequest, ShowPocketMolDesignJobResponse>
     */
    public AsyncInvoker<ShowPocketMolDesignJobRequest, ShowPocketMolDesignJobResponse> showPocketMolDesignJobAsyncInvoker(
        ShowPocketMolDesignJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showPocketMolDesignJob, hcClient);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectRequest 请求对象
     * @return CompletableFuture<ShowProjectResponse>
     */
    public CompletableFuture<ShowProjectResponse> showProjectAsync(ShowProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showProject);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectRequest 请求对象
     * @return AsyncInvoker<ShowProjectRequest, ShowProjectResponse>
     */
    public AsyncInvoker<ShowProjectRequest, ShowProjectResponse> showProjectAsyncInvoker(ShowProjectRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showProject, hcClient);
    }

    /**
     * 查询分子搜索作业详情
     *
     * 查询分子搜索作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchJobRequest 请求对象
     * @return CompletableFuture<ShowSearchJobResponse>
     */
    public CompletableFuture<ShowSearchJobResponse> showSearchJobAsync(ShowSearchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showSearchJob);
    }

    /**
     * 查询分子搜索作业详情
     *
     * 查询分子搜索作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchJobRequest 请求对象
     * @return AsyncInvoker<ShowSearchJobRequest, ShowSearchJobResponse>
     */
    public AsyncInvoker<ShowSearchJobRequest, ShowSearchJobResponse> showSearchJobAsyncInvoker(
        ShowSearchJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showSearchJob, hcClient);
    }

    /**
     * 查询靶点优化作业详情
     *
     * 查询靶点优化作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTargetOptJobRequest 请求对象
     * @return CompletableFuture<ShowTargetOptJobResponse>
     */
    public CompletableFuture<ShowTargetOptJobResponse> showTargetOptJobAsync(ShowTargetOptJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTargetOptJob);
    }

    /**
     * 查询靶点优化作业详情
     *
     * 查询靶点优化作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTargetOptJobRequest 请求对象
     * @return AsyncInvoker<ShowTargetOptJobRequest, ShowTargetOptJobResponse>
     */
    public AsyncInvoker<ShowTargetOptJobRequest, ShowTargetOptJobResponse> showTargetOptJobAsyncInvoker(
        ShowTargetOptJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showTargetOptJob, hcClient);
    }

    /**
     * 获取子任务启动事件
     *
     * 获取子任务启动事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskEventsRequest 请求对象
     * @return CompletableFuture<ShowTaskEventsResponse>
     */
    public CompletableFuture<ShowTaskEventsResponse> showTaskEventsAsync(ShowTaskEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskEvents);
    }

    /**
     * 获取子任务启动事件
     *
     * 获取子任务启动事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskEventsRequest 请求对象
     * @return AsyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse>
     */
    public AsyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse> showTaskEventsAsyncInvoker(
        ShowTaskEventsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showTaskEvents, hcClient);
    }

    /**
     * 获取子任务中实例的事件
     *
     * 获取子任务中实例的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstanceEventsRequest 请求对象
     * @return CompletableFuture<ShowTaskInstanceEventsResponse>
     */
    public CompletableFuture<ShowTaskInstanceEventsResponse> showTaskInstanceEventsAsync(
        ShowTaskInstanceEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskInstanceEvents);
    }

    /**
     * 获取子任务中实例的事件
     *
     * 获取子任务中实例的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstanceEventsRequest 请求对象
     * @return AsyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse>
     */
    public AsyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> showTaskInstanceEventsAsyncInvoker(
        ShowTaskInstanceEventsRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showTaskInstanceEvents, hcClient);
    }

    /**
     * 获取子任务中实例的资源监控数据
     *
     * 获取子任务中实例的资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstanceMetricDataRequest 请求对象
     * @return CompletableFuture<ShowTaskInstanceMetricDataResponse>
     */
    public CompletableFuture<ShowTaskInstanceMetricDataResponse> showTaskInstanceMetricDataAsync(
        ShowTaskInstanceMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskInstanceMetricData);
    }

    /**
     * 获取子任务中实例的资源监控数据
     *
     * 获取子任务中实例的资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstanceMetricDataRequest 请求对象
     * @return AsyncInvoker<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse>
     */
    public AsyncInvoker<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> showTaskInstanceMetricDataAsyncInvoker(
        ShowTaskInstanceMetricDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showTaskInstanceMetricData, hcClient);
    }

    /**
     * 获取子任务中实例的pod信息
     *
     * 获取子任务中实例的pod信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstancePodRequest 请求对象
     * @return CompletableFuture<ShowTaskInstancePodResponse>
     */
    public CompletableFuture<ShowTaskInstancePodResponse> showTaskInstancePodAsync(ShowTaskInstancePodRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskInstancePod);
    }

    /**
     * 获取子任务中实例的pod信息
     *
     * 获取子任务中实例的pod信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstancePodRequest 请求对象
     * @return AsyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse>
     */
    public AsyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> showTaskInstancePodAsyncInvoker(
        ShowTaskInstancePodRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showTaskInstancePod, hcClient);
    }

    /**
     * 获取子任务实例信息
     *
     * 获取子任务实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstancesRequest 请求对象
     * @return CompletableFuture<ShowTaskInstancesResponse>
     */
    public CompletableFuture<ShowTaskInstancesResponse> showTaskInstancesAsync(ShowTaskInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskInstances);
    }

    /**
     * 获取子任务实例信息
     *
     * 获取子任务实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInstancesRequest 请求对象
     * @return AsyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse>
     */
    public AsyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse> showTaskInstancesAsyncInvoker(
        ShowTaskInstancesRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showTaskInstances, hcClient);
    }

    /**
     * 获取指定用户详情
     *
     * 获取指定用户详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return CompletableFuture<ShowUserResponse>
     */
    public CompletableFuture<ShowUserResponse> showUserAsync(ShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showUser);
    }

    /**
     * 获取指定用户详情
     *
     * 获取指定用户详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return AsyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public AsyncInvoker<ShowUserRequest, ShowUserResponse> showUserAsyncInvoker(ShowUserRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showUser, hcClient);
    }

    /**
     * 查询用户设置
     *
     * 查询用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserSettingRequest 请求对象
     * @return CompletableFuture<ShowUserSettingResponse>
     */
    public CompletableFuture<ShowUserSettingResponse> showUserSettingAsync(ShowUserSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showUserSetting);
    }

    /**
     * 查询用户设置
     *
     * 查询用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserSettingRequest 请求对象
     * @return AsyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse>
     */
    public AsyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse> showUserSettingAsyncInvoker(
        ShowUserSettingRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showUserSetting, hcClient);
    }

    /**
     * 获取供应商配置
     *
     * 获取供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVendorRequest 请求对象
     * @return CompletableFuture<ShowVendorResponse>
     */
    public CompletableFuture<ShowVendorResponse> showVendorAsync(ShowVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showVendor);
    }

    /**
     * 获取供应商配置
     *
     * 获取供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVendorRequest 请求对象
     * @return AsyncInvoker<ShowVendorRequest, ShowVendorResponse>
     */
    public AsyncInvoker<ShowVendorRequest, ShowVendorResponse> showVendorAsyncInvoker(ShowVendorRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showVendor, hcClient);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowRequest 请求对象
     * @return CompletableFuture<ShowWorkflowResponse>
     */
    public CompletableFuture<ShowWorkflowResponse> showWorkflowAsync(ShowWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showWorkflow);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse>
     */
    public AsyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflowAsyncInvoker(
        ShowWorkflowRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showWorkflow, hcClient);
    }

    /**
     * 订阅应用
     *
     * 订阅应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeAppRequest 请求对象
     * @return CompletableFuture<SubscribeAppResponse>
     */
    public CompletableFuture<SubscribeAppResponse> subscribeAppAsync(SubscribeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.subscribeApp);
    }

    /**
     * 订阅应用
     *
     * 订阅应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeAppRequest 请求对象
     * @return AsyncInvoker<SubscribeAppRequest, SubscribeAppResponse>
     */
    public AsyncInvoker<SubscribeAppRequest, SubscribeAppResponse> subscribeAppAsyncInvoker(
        SubscribeAppRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.subscribeApp, hcClient);
    }

    /**
     * 订阅镜像
     *
     * 订阅镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeImageRequest 请求对象
     * @return CompletableFuture<SubscribeImageResponse>
     */
    public CompletableFuture<SubscribeImageResponse> subscribeImageAsync(SubscribeImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.subscribeImage);
    }

    /**
     * 订阅镜像
     *
     * 订阅镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeImageRequest 请求对象
     * @return AsyncInvoker<SubscribeImageRequest, SubscribeImageResponse>
     */
    public AsyncInvoker<SubscribeImageRequest, SubscribeImageResponse> subscribeImageAsyncInvoker(
        SubscribeImageRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.subscribeImage, hcClient);
    }

    /**
     * 订阅流程
     *
     * 订阅流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeWorkflowRequest 请求对象
     * @return CompletableFuture<SubscribeWorkflowResponse>
     */
    public CompletableFuture<SubscribeWorkflowResponse> subscribeWorkflowAsync(SubscribeWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.subscribeWorkflow);
    }

    /**
     * 订阅流程
     *
     * 订阅流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeWorkflowRequest 请求对象
     * @return AsyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse>
     */
    public AsyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse> subscribeWorkflowAsyncInvoker(
        SubscribeWorkflowRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.subscribeWorkflow, hcClient);
    }

    /**
     * 转移项目
     *
     * 转移项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferProjectRequest 请求对象
     * @return CompletableFuture<TransferProjectResponse>
     */
    public CompletableFuture<TransferProjectResponse> transferProjectAsync(TransferProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.transferProject);
    }

    /**
     * 转移项目
     *
     * 转移项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferProjectRequest 请求对象
     * @return AsyncInvoker<TransferProjectRequest, TransferProjectResponse>
     */
    public AsyncInvoker<TransferProjectRequest, TransferProjectResponse> transferProjectAsyncInvoker(
        TransferProjectRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.transferProject, hcClient);
    }

    /**
     * 更新业务委托
     *
     * 更新业务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyRequest 请求对象
     * @return CompletableFuture<UpdateAgencyResponse>
     */
    public CompletableFuture<UpdateAgencyResponse> updateAgencyAsync(UpdateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateAgency);
    }

    /**
     * 更新业务委托
     *
     * 更新业务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyRequest 请求对象
     * @return AsyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse>
     */
    public AsyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse> updateAgencyAsyncInvoker(
        UpdateAgencyRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateAgency, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateApp);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateApp, hcClient);
    }

    /**
     * 更新对话
     *
     * 更新对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChatRequest 请求对象
     * @return CompletableFuture<UpdateChatResponse>
     */
    public CompletableFuture<UpdateChatResponse> updateChatAsync(UpdateChatRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateChat);
    }

    /**
     * 更新对话
     *
     * 更新对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChatRequest 请求对象
     * @return AsyncInvoker<UpdateChatRequest, UpdateChatResponse>
     */
    public AsyncInvoker<UpdateChatRequest, UpdateChatResponse> updateChatAsyncInvoker(UpdateChatRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateChat, hcClient);
    }

    /**
     * 更新药物数据库
     *
     * 更新药物数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugDatabaseRequest 请求对象
     * @return CompletableFuture<UpdateDrugDatabaseResponse>
     */
    public CompletableFuture<UpdateDrugDatabaseResponse> updateDrugDatabaseAsync(UpdateDrugDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateDrugDatabase);
    }

    /**
     * 更新药物数据库
     *
     * 更新药物数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugDatabaseRequest 请求对象
     * @return AsyncInvoker<UpdateDrugDatabaseRequest, UpdateDrugDatabaseResponse>
     */
    public AsyncInvoker<UpdateDrugDatabaseRequest, UpdateDrugDatabaseResponse> updateDrugDatabaseAsyncInvoker(
        UpdateDrugDatabaseRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateDrugDatabase, hcClient);
    }

    /**
     * 更新药物作业
     *
     * 更新药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugJobRequest 请求对象
     * @return CompletableFuture<UpdateDrugJobResponse>
     */
    public CompletableFuture<UpdateDrugJobResponse> updateDrugJobAsync(UpdateDrugJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateDrugJob);
    }

    /**
     * 更新药物作业
     *
     * 更新药物作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugJobRequest 请求对象
     * @return AsyncInvoker<UpdateDrugJobRequest, UpdateDrugJobResponse>
     */
    public AsyncInvoker<UpdateDrugJobRequest, UpdateDrugJobResponse> updateDrugJobAsyncInvoker(
        UpdateDrugJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateDrugJob, hcClient);
    }

    /**
     * 更新药物模型
     *
     * 更新药物模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugModelRequest 请求对象
     * @return CompletableFuture<UpdateDrugModelResponse>
     */
    public CompletableFuture<UpdateDrugModelResponse> updateDrugModelAsync(UpdateDrugModelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateDrugModel);
    }

    /**
     * 更新药物模型
     *
     * 更新药物模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDrugModelRequest 请求对象
     * @return AsyncInvoker<UpdateDrugModelRequest, UpdateDrugModelResponse>
     */
    public AsyncInvoker<UpdateDrugModelRequest, UpdateDrugModelResponse> updateDrugModelAsyncInvoker(
        UpdateDrugModelRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateDrugModel, hcClient);
    }

    /**
     * 更新镜像描述信息或者类型
     *
     * 更新镜像描述信息或者类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageRequest 请求对象
     * @return CompletableFuture<UpdateImageResponse>
     */
    public CompletableFuture<UpdateImageResponse> updateImageAsync(UpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateImage);
    }

    /**
     * 更新镜像描述信息或者类型
     *
     * 更新镜像描述信息或者类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageRequest 请求对象
     * @return AsyncInvoker<UpdateImageRequest, UpdateImageResponse>
     */
    public AsyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageAsyncInvoker(UpdateImageRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateImage, hcClient);
    }

    /**
     * 新用户重置密码
     *
     * 新用户重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInitPasswordRequest 请求对象
     * @return CompletableFuture<UpdateInitPasswordResponse>
     */
    public CompletableFuture<UpdateInitPasswordResponse> updateInitPasswordAsync(UpdateInitPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateInitPassword);
    }

    /**
     * 新用户重置密码
     *
     * 新用户重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInitPasswordRequest 请求对象
     * @return AsyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse>
     */
    public AsyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse> updateInitPasswordAsyncInvoker(
        UpdateInitPasswordRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateInitPassword, hcClient);
    }

    /**
     * 更新作业
     *
     * 更新作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return CompletableFuture<UpdateJobResponse>
     */
    public CompletableFuture<UpdateJobResponse> updateJobAsync(UpdateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateJob);
    }

    /**
     * 更新作业
     *
     * 更新作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return AsyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public AsyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobAsyncInvoker(UpdateJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateJob, hcClient);
    }

    /**
     * 更新或者添加项目成员角色
     *
     * 更新或者添加项目成员角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberRequest 请求对象
     * @return CompletableFuture<UpdateMemberResponse>
     */
    public CompletableFuture<UpdateMemberResponse> updateMemberAsync(UpdateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateMember);
    }

    /**
     * 更新或者添加项目成员角色
     *
     * 更新或者添加项目成员角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberRequest 请求对象
     * @return AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberAsyncInvoker(
        UpdateMemberRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateMember, hcClient);
    }

    /**
     * 更新性能加速资源配置
     *
     * 更新性能加速资源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePerformanceResourceRequest 请求对象
     * @return CompletableFuture<UpdatePerformanceResourceResponse>
     */
    public CompletableFuture<UpdatePerformanceResourceResponse> updatePerformanceResourceAsync(
        UpdatePerformanceResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updatePerformanceResource);
    }

    /**
     * 更新性能加速资源配置
     *
     * 更新性能加速资源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePerformanceResourceRequest 请求对象
     * @return AsyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse>
     */
    public AsyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> updatePerformanceResourceAsyncInvoker(
        UpdatePerformanceResourceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updatePerformanceResource, hcClient);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectRequest 请求对象
     * @return CompletableFuture<UpdateProjectResponse>
     */
    public CompletableFuture<UpdateProjectResponse> updateProjectAsync(UpdateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateProject);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectRequest 请求对象
     * @return AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse>
     */
    public AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse> updateProjectAsyncInvoker(
        UpdateProjectRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateProject, hcClient);
    }

    /**
     * 置顶空间
     *
     * 置顶空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopProjectRequest 请求对象
     * @return CompletableFuture<UpdateTopProjectResponse>
     */
    public CompletableFuture<UpdateTopProjectResponse> updateTopProjectAsync(UpdateTopProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateTopProject);
    }

    /**
     * 置顶空间
     *
     * 置顶空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopProjectRequest 请求对象
     * @return AsyncInvoker<UpdateTopProjectRequest, UpdateTopProjectResponse>
     */
    public AsyncInvoker<UpdateTopProjectRequest, UpdateTopProjectResponse> updateTopProjectAsyncInvoker(
        UpdateTopProjectRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateTopProject, hcClient);
    }

    /**
     * 修改用户基本信息
     *
     * 修改用户基本信息（邮箱，手机）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateUser);
    }

    /**
     * 修改用户基本信息
     *
     * 修改用户基本信息（邮箱，手机）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateUser, hcClient);
    }

    /**
     * 最终租户修改子用户
     *
     * 最终租户修改子用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserByDomainRequest 请求对象
     * @return CompletableFuture<UpdateUserByDomainResponse>
     */
    public CompletableFuture<UpdateUserByDomainResponse> updateUserByDomainAsync(UpdateUserByDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateUserByDomain);
    }

    /**
     * 最终租户修改子用户
     *
     * 最终租户修改子用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserByDomainRequest 请求对象
     * @return AsyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse>
     */
    public AsyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse> updateUserByDomainAsyncInvoker(
        UpdateUserByDomainRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateUserByDomain, hcClient);
    }

    /**
     * 更新用户角色
     *
     * 更新用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRoleRequest 请求对象
     * @return CompletableFuture<UpdateUserRoleResponse>
     */
    public CompletableFuture<UpdateUserRoleResponse> updateUserRoleAsync(UpdateUserRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateUserRole);
    }

    /**
     * 更新用户角色
     *
     * 更新用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRoleRequest 请求对象
     * @return AsyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse>
     */
    public AsyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse> updateUserRoleAsyncInvoker(
        UpdateUserRoleRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateUserRole, hcClient);
    }

    /**
     * 更新用户设置
     *
     * 更新用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserSettingRequest 请求对象
     * @return CompletableFuture<UpdateUserSettingResponse>
     */
    public CompletableFuture<UpdateUserSettingResponse> updateUserSettingAsync(UpdateUserSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateUserSetting);
    }

    /**
     * 更新用户设置
     *
     * 更新用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserSettingRequest 请求对象
     * @return AsyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse>
     */
    public AsyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse> updateUserSettingAsyncInvoker(
        UpdateUserSettingRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateUserSetting, hcClient);
    }

    /**
     * 设置供应商配置
     *
     * 设置供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVendorRequest 请求对象
     * @return CompletableFuture<UpdateVendorResponse>
     */
    public CompletableFuture<UpdateVendorResponse> updateVendorAsync(UpdateVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateVendor);
    }

    /**
     * 设置供应商配置
     *
     * 设置供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVendorRequest 请求对象
     * @return AsyncInvoker<UpdateVendorRequest, UpdateVendorResponse>
     */
    public AsyncInvoker<UpdateVendorRequest, UpdateVendorResponse> updateVendorAsyncInvoker(
        UpdateVendorRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateVendor, hcClient);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowResponse>
     */
    public CompletableFuture<UpdateWorkflowResponse> updateWorkflowAsync(UpdateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateWorkflow);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowAsyncInvoker(
        UpdateWorkflowRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateWorkflow, hcClient);
    }

    /**
     * 上传数据文件
     *
     * 上传数据文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadDataRequest 请求对象
     * @return CompletableFuture<UploadDataResponse>
     */
    public CompletableFuture<UploadDataResponse> uploadDataAsync(UploadDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.uploadData);
    }

    /**
     * 上传数据文件
     *
     * 上传数据文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadDataRequest 请求对象
     * @return AsyncInvoker<UploadDataRequest, UploadDataResponse>
     */
    public AsyncInvoker<UploadDataRequest, UploadDataResponse> uploadDataAsyncInvoker(UploadDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.uploadData, hcClient);
    }

    /**
     * 预验证
     *
     * 预验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateCodeRequest 请求对象
     * @return CompletableFuture<ValidateCodeResponse>
     */
    public CompletableFuture<ValidateCodeResponse> validateCodeAsync(ValidateCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.validateCode);
    }

    /**
     * 预验证
     *
     * 预验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateCodeRequest 请求对象
     * @return AsyncInvoker<ValidateCodeRequest, ValidateCodeResponse>
     */
    public AsyncInvoker<ValidateCodeRequest, ValidateCodeResponse> validateCodeAsyncInvoker(
        ValidateCodeRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.validateCode, hcClient);
    }

    /**
     * ADMET属性预测接口
     *
     * 计算小分子的物化性质，包括吸收(adsorption)、分布(distribution)、代谢(metabolism)、清除(excretion)与毒性(toxicity)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdmetPropertiesRequest 请求对象
     * @return CompletableFuture<ShowAdmetPropertiesResponse>
     */
    public CompletableFuture<ShowAdmetPropertiesResponse> showAdmetPropertiesAsync(ShowAdmetPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAdmetProperties);
    }

    /**
     * ADMET属性预测接口
     *
     * 计算小分子的物化性质，包括吸收(adsorption)、分布(distribution)、代谢(metabolism)、清除(excretion)与毒性(toxicity)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdmetPropertiesRequest 请求对象
     * @return AsyncInvoker<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse>
     */
    public AsyncInvoker<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> showAdmetPropertiesAsyncInvoker(
        ShowAdmetPropertiesRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showAdmetProperties, hcClient);
    }

    /**
     * 创建CPI作业
     *
     * 创建CPI作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCpiJobRequest 请求对象
     * @return CompletableFuture<CreateCpiJobResponse>
     */
    public CompletableFuture<CreateCpiJobResponse> createCpiJobAsync(CreateCpiJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createCpiJob);
    }

    /**
     * 创建CPI作业
     *
     * 创建CPI作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCpiJobRequest 请求对象
     * @return AsyncInvoker<CreateCpiJobRequest, CreateCpiJobResponse>
     */
    public AsyncInvoker<CreateCpiJobRequest, CreateCpiJobResponse> createCpiJobAsyncInvoker(
        CreateCpiJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createCpiJob, hcClient);
    }

    /**
     * 查询CPI作业详情
     *
     * 查询CPI作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCpiJobRequest 请求对象
     * @return CompletableFuture<ShowCpiJobResponse>
     */
    public CompletableFuture<ShowCpiJobResponse> showCpiJobAsync(ShowCpiJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showCpiJob);
    }

    /**
     * 查询CPI作业详情
     *
     * 查询CPI作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCpiJobRequest 请求对象
     * @return AsyncInvoker<ShowCpiJobRequest, ShowCpiJobResponse>
     */
    public AsyncInvoker<ShowCpiJobRequest, ShowCpiJobResponse> showCpiJobAsyncInvoker(ShowCpiJobRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showCpiJob, hcClient);
    }

    /**
     * 绑定CSS集群
     *
     * 绑定CSS集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCssClusterRequest 请求对象
     * @return CompletableFuture<CreateCssClusterResponse>
     */
    public CompletableFuture<CreateCssClusterResponse> createCssClusterAsync(CreateCssClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createCssCluster);
    }

    /**
     * 绑定CSS集群
     *
     * 绑定CSS集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCssClusterRequest 请求对象
     * @return AsyncInvoker<CreateCssClusterRequest, CreateCssClusterResponse>
     */
    public AsyncInvoker<CreateCssClusterRequest, CreateCssClusterResponse> createCssClusterAsyncInvoker(
        CreateCssClusterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createCssCluster, hcClient);
    }

    /**
     * CSS集群解绑
     *
     * CSS集群解绑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCssClusterRequest 请求对象
     * @return CompletableFuture<DeleteCssClusterResponse>
     */
    public CompletableFuture<DeleteCssClusterResponse> deleteCssClusterAsync(DeleteCssClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteCssCluster);
    }

    /**
     * CSS集群解绑
     *
     * CSS集群解绑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCssClusterRequest 请求对象
     * @return AsyncInvoker<DeleteCssClusterRequest, DeleteCssClusterResponse>
     */
    public AsyncInvoker<DeleteCssClusterRequest, DeleteCssClusterResponse> deleteCssClusterAsyncInvoker(
        DeleteCssClusterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteCssCluster, hcClient);
    }

    /**
     * 获取CSS集群列表
     *
     * 获取CSS集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCssClusterRequest 请求对象
     * @return CompletableFuture<ListCssClusterResponse>
     */
    public CompletableFuture<ListCssClusterResponse> listCssClusterAsync(ListCssClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listCssCluster);
    }

    /**
     * 获取CSS集群列表
     *
     * 获取CSS集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCssClusterRequest 请求对象
     * @return AsyncInvoker<ListCssClusterRequest, ListCssClusterResponse>
     */
    public AsyncInvoker<ListCssClusterRequest, ListCssClusterResponse> listCssClusterAsyncInvoker(
        ListCssClusterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listCssCluster, hcClient);
    }

    /**
     * 获取最终租户CSS集群列表
     *
     * 获取最终租户CSS集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTermTenantCssClusterRequest 请求对象
     * @return CompletableFuture<ListTermTenantCssClusterResponse>
     */
    public CompletableFuture<ListTermTenantCssClusterResponse> listTermTenantCssClusterAsync(
        ListTermTenantCssClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listTermTenantCssCluster);
    }

    /**
     * 获取最终租户CSS集群列表
     *
     * 获取最终租户CSS集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTermTenantCssClusterRequest 请求对象
     * @return AsyncInvoker<ListTermTenantCssClusterRequest, ListTermTenantCssClusterResponse>
     */
    public AsyncInvoker<ListTermTenantCssClusterRequest, ListTermTenantCssClusterResponse> listTermTenantCssClusterAsyncInvoker(
        ListTermTenantCssClusterRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listTermTenantCssCluster, hcClient);
    }

    /**
     * 测试CSS集群连接
     *
     * 测试CSS集群连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateCssConnectionRequest 请求对象
     * @return CompletableFuture<ValidateCssConnectionResponse>
     */
    public CompletableFuture<ValidateCssConnectionResponse> validateCssConnectionAsync(
        ValidateCssConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.validateCssConnection);
    }

    /**
     * 测试CSS集群连接
     *
     * 测试CSS集群连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateCssConnectionRequest 请求对象
     * @return AsyncInvoker<ValidateCssConnectionRequest, ValidateCssConnectionResponse>
     */
    public AsyncInvoker<ValidateCssConnectionRequest, ValidateCssConnectionResponse> validateCssConnectionAsyncInvoker(
        ValidateCssConnectionRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.validateCssConnection, hcClient);
    }

    /**
     * 计算配体间的3D结构差异
     *
     * 计算配体间的3D结构差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDrugLigandDifferenceRequest 请求对象
     * @return CompletableFuture<CheckDrugLigandDifferenceResponse>
     */
    public CompletableFuture<CheckDrugLigandDifferenceResponse> checkDrugLigandDifferenceAsync(
        CheckDrugLigandDifferenceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.checkDrugLigandDifference);
    }

    /**
     * 计算配体间的3D结构差异
     *
     * 计算配体间的3D结构差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDrugLigandDifferenceRequest 请求对象
     * @return AsyncInvoker<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse>
     */
    public AsyncInvoker<CheckDrugLigandDifferenceRequest, CheckDrugLigandDifferenceResponse> checkDrugLigandDifferenceAsyncInvoker(
        CheckDrugLigandDifferenceRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.checkDrugLigandDifference, hcClient);
    }

    /**
     * 生成相互作用2D图
     *
     * 生成相互作用2D图，若不提供配体文件，则受体文件中必须包含配体；若提供配体文件，则受体中的配体（若有）则会被忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandInteraction2dSvgRequest 请求对象
     * @return CompletableFuture<CreateDrugLigandInteraction2dSvgResponse>
     */
    public CompletableFuture<CreateDrugLigandInteraction2dSvgResponse> createDrugLigandInteraction2dSvgAsync(
        CreateDrugLigandInteraction2dSvgRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDrugLigandInteraction2dSvg);
    }

    /**
     * 生成相互作用2D图
     *
     * 生成相互作用2D图，若不提供配体文件，则受体文件中必须包含配体；若提供配体文件，则受体中的配体（若有）则会被忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandInteraction2dSvgRequest 请求对象
     * @return AsyncInvoker<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse>
     */
    public AsyncInvoker<CreateDrugLigandInteraction2dSvgRequest, CreateDrugLigandInteraction2dSvgResponse> createDrugLigandInteraction2dSvgAsyncInvoker(
        CreateDrugLigandInteraction2dSvgRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDrugLigandInteraction2dSvg, hcClient);
    }

    /**
     * 创建配体文件预览任务
     *
     * 创建配体文件预览任务，支持SMI、SDF、PDB、MOL2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandPreviewTaskRequest 请求对象
     * @return CompletableFuture<CreateDrugLigandPreviewTaskResponse>
     */
    public CompletableFuture<CreateDrugLigandPreviewTaskResponse> createDrugLigandPreviewTaskAsync(
        CreateDrugLigandPreviewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDrugLigandPreviewTask);
    }

    /**
     * 创建配体文件预览任务
     *
     * 创建配体文件预览任务，支持SMI、SDF、PDB、MOL2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandPreviewTaskRequest 请求对象
     * @return AsyncInvoker<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse>
     */
    public AsyncInvoker<CreateDrugLigandPreviewTaskRequest, CreateDrugLigandPreviewTaskResponse> createDrugLigandPreviewTaskAsyncInvoker(
        CreateDrugLigandPreviewTaskRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDrugLigandPreviewTask, hcClient);
    }

    /**
     * 生成分子SDF三维结构
     *
     * 生成分子SDF三维结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSdfRequest 请求对象
     * @return CompletableFuture<CreateDrugLigandSdfResponse>
     */
    public CompletableFuture<CreateDrugLigandSdfResponse> createDrugLigandSdfAsync(CreateDrugLigandSdfRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDrugLigandSdf);
    }

    /**
     * 生成分子SDF三维结构
     *
     * 生成分子SDF三维结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSdfRequest 请求对象
     * @return AsyncInvoker<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse>
     */
    public AsyncInvoker<CreateDrugLigandSdfRequest, CreateDrugLigandSdfResponse> createDrugLigandSdfAsyncInvoker(
        CreateDrugLigandSdfRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDrugLigandSdf, hcClient);
    }

    /**
     * 创建配体相似性图计算任务
     *
     * 创建配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return CompletableFuture<CreateDrugLigandSimilarityGraphTaskResponse>
     */
    public CompletableFuture<CreateDrugLigandSimilarityGraphTaskResponse> createDrugLigandSimilarityGraphTaskAsync(
        CreateDrugLigandSimilarityGraphTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDrugLigandSimilarityGraphTask);
    }

    /**
     * 创建配体相似性图计算任务
     *
     * 创建配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return AsyncInvoker<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse>
     */
    public AsyncInvoker<CreateDrugLigandSimilarityGraphTaskRequest, CreateDrugLigandSimilarityGraphTaskResponse> createDrugLigandSimilarityGraphTaskAsyncInvoker(
        CreateDrugLigandSimilarityGraphTaskRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDrugLigandSimilarityGraphTask, hcClient);
    }

    /**
     * 生成分子SVG图
     *
     * 生成分子SVG图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSvgRequest 请求对象
     * @return CompletableFuture<CreateDrugLigandSvgResponse>
     */
    public CompletableFuture<CreateDrugLigandSvgResponse> createDrugLigandSvgAsync(CreateDrugLigandSvgRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDrugLigandSvg);
    }

    /**
     * 生成分子SVG图
     *
     * 生成分子SVG图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDrugLigandSvgRequest 请求对象
     * @return AsyncInvoker<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse>
     */
    public AsyncInvoker<CreateDrugLigandSvgRequest, CreateDrugLigandSvgResponse> createDrugLigandSvgAsyncInvoker(
        CreateDrugLigandSvgRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createDrugLigandSvg, hcClient);
    }

    /**
     * 删除配体文件预览任务
     *
     * 删除配体文件预览任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugLigandPreviewTaskRequest 请求对象
     * @return CompletableFuture<DeleteDrugLigandPreviewTaskResponse>
     */
    public CompletableFuture<DeleteDrugLigandPreviewTaskResponse> deleteDrugLigandPreviewTaskAsync(
        DeleteDrugLigandPreviewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDrugLigandPreviewTask);
    }

    /**
     * 删除配体文件预览任务
     *
     * 删除配体文件预览任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugLigandPreviewTaskRequest 请求对象
     * @return AsyncInvoker<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse>
     */
    public AsyncInvoker<DeleteDrugLigandPreviewTaskRequest, DeleteDrugLigandPreviewTaskResponse> deleteDrugLigandPreviewTaskAsyncInvoker(
        DeleteDrugLigandPreviewTaskRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteDrugLigandPreviewTask, hcClient);
    }

    /**
     * 删除配体相似性图计算任务
     *
     * 删除配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return CompletableFuture<DeleteDrugLigandSimilarityGraphTaskResponse>
     */
    public CompletableFuture<DeleteDrugLigandSimilarityGraphTaskResponse> deleteDrugLigandSimilarityGraphTaskAsync(
        DeleteDrugLigandSimilarityGraphTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDrugLigandSimilarityGraphTask);
    }

    /**
     * 删除配体相似性图计算任务
     *
     * 删除配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return AsyncInvoker<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse>
     */
    public AsyncInvoker<DeleteDrugLigandSimilarityGraphTaskRequest, DeleteDrugLigandSimilarityGraphTaskResponse> deleteDrugLigandSimilarityGraphTaskAsyncInvoker(
        DeleteDrugLigandSimilarityGraphTaskRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteDrugLigandSimilarityGraphTask, hcClient);
    }

    /**
     * 受体信息解析
     *
     * 受体信息解析，如果有多个受体蛋白则只处理第一个，如果一个受体蛋白里结合了多个配体，则最多只处理前10个
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseDrugReceptorInfoRequest 请求对象
     * @return CompletableFuture<ParseDrugReceptorInfoResponse>
     */
    public CompletableFuture<ParseDrugReceptorInfoResponse> parseDrugReceptorInfoAsync(
        ParseDrugReceptorInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.parseDrugReceptorInfo);
    }

    /**
     * 受体信息解析
     *
     * 受体信息解析，如果有多个受体蛋白则只处理第一个，如果一个受体蛋白里结合了多个配体，则最多只处理前10个
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseDrugReceptorInfoRequest 请求对象
     * @return AsyncInvoker<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse>
     */
    public AsyncInvoker<ParseDrugReceptorInfoRequest, ParseDrugReceptorInfoResponse> parseDrugReceptorInfoAsyncInvoker(
        ParseDrugReceptorInfoRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.parseDrugReceptorInfo, hcClient);
    }

    /**
     * 受体口袋检测
     *
     * 检测受体口袋，检测类型基于配体，基于氨基酸残基，自动检测，自定义和全局对接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecognizeDrugReceptorPocketRequest 请求对象
     * @return CompletableFuture<RecognizeDrugReceptorPocketResponse>
     */
    public CompletableFuture<RecognizeDrugReceptorPocketResponse> recognizeDrugReceptorPocketAsync(
        RecognizeDrugReceptorPocketRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.recognizeDrugReceptorPocket);
    }

    /**
     * 受体口袋检测
     *
     * 检测受体口袋，检测类型基于配体，基于氨基酸残基，自动检测，自定义和全局对接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecognizeDrugReceptorPocketRequest 请求对象
     * @return AsyncInvoker<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse>
     */
    public AsyncInvoker<RecognizeDrugReceptorPocketRequest, RecognizeDrugReceptorPocketResponse> recognizeDrugReceptorPocketAsyncInvoker(
        RecognizeDrugReceptorPocketRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.recognizeDrugReceptorPocket, hcClient);
    }

    /**
     * 配体格式转换为SMILES
     *
     * 配体格式转换为SMILES，若配体文件中存在多个分子，则只取第一个返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDrugLigandToSmilesConversionRequest 请求对象
     * @return CompletableFuture<RunDrugLigandToSmilesConversionResponse>
     */
    public CompletableFuture<RunDrugLigandToSmilesConversionResponse> runDrugLigandToSmilesConversionAsync(
        RunDrugLigandToSmilesConversionRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.runDrugLigandToSmilesConversion);
    }

    /**
     * 配体格式转换为SMILES
     *
     * 配体格式转换为SMILES，若配体文件中存在多个分子，则只取第一个返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDrugLigandToSmilesConversionRequest 请求对象
     * @return AsyncInvoker<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse>
     */
    public AsyncInvoker<RunDrugLigandToSmilesConversionRequest, RunDrugLigandToSmilesConversionResponse> runDrugLigandToSmilesConversionAsyncInvoker(
        RunDrugLigandToSmilesConversionRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.runDrugLigandToSmilesConversion, hcClient);
    }

    /**
     * 受体预处理
     *
     * 受体预处理，用于前端显示预处理后的受体
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDrugReceptorPreprocessRequest 请求对象
     * @return CompletableFuture<RunDrugReceptorPreprocessResponse>
     */
    public CompletableFuture<RunDrugReceptorPreprocessResponse> runDrugReceptorPreprocessAsync(
        RunDrugReceptorPreprocessRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.runDrugReceptorPreprocess);
    }

    /**
     * 受体预处理
     *
     * 受体预处理，用于前端显示预处理后的受体
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDrugReceptorPreprocessRequest 请求对象
     * @return AsyncInvoker<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse>
     */
    public AsyncInvoker<RunDrugReceptorPreprocessRequest, RunDrugReceptorPreprocessResponse> runDrugReceptorPreprocessAsyncInvoker(
        RunDrugReceptorPreprocessRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.runDrugReceptorPreprocess, hcClient);
    }

    /**
     * 查询配体文件预览任务
     *
     * 查询配体文件预览任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugLigandPreviewTaskRequest 请求对象
     * @return CompletableFuture<ShowDrugLigandPreviewTaskResponse>
     */
    public CompletableFuture<ShowDrugLigandPreviewTaskResponse> showDrugLigandPreviewTaskAsync(
        ShowDrugLigandPreviewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDrugLigandPreviewTask);
    }

    /**
     * 查询配体文件预览任务
     *
     * 查询配体文件预览任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugLigandPreviewTaskRequest 请求对象
     * @return AsyncInvoker<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse>
     */
    public AsyncInvoker<ShowDrugLigandPreviewTaskRequest, ShowDrugLigandPreviewTaskResponse> showDrugLigandPreviewTaskAsyncInvoker(
        ShowDrugLigandPreviewTaskRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showDrugLigandPreviewTask, hcClient);
    }

    /**
     * 查询配体相似性图计算任务
     *
     * 查询配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return CompletableFuture<ShowDrugLigandSimilarityGraphTaskResponse>
     */
    public CompletableFuture<ShowDrugLigandSimilarityGraphTaskResponse> showDrugLigandSimilarityGraphTaskAsync(
        ShowDrugLigandSimilarityGraphTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDrugLigandSimilarityGraphTask);
    }

    /**
     * 查询配体相似性图计算任务
     *
     * 查询配体相似性图计算任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrugLigandSimilarityGraphTaskRequest 请求对象
     * @return AsyncInvoker<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse>
     */
    public AsyncInvoker<ShowDrugLigandSimilarityGraphTaskRequest, ShowDrugLigandSimilarityGraphTaskResponse> showDrugLigandSimilarityGraphTaskAsyncInvoker(
        ShowDrugLigandSimilarityGraphTaskRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showDrugLigandSimilarityGraphTask, hcClient);
    }

    /**
     * 文件下载
     *
     * 文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDataRequest 请求对象
     * @return CompletableFuture<DownloadDataResponse>
     */
    public CompletableFuture<DownloadDataResponse> downloadDataAsync(DownloadDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.downloadData);
    }

    /**
     * 文件下载
     *
     * 文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDataRequest 请求对象
     * @return AsyncInvoker<DownloadDataRequest, DownloadDataResponse>
     */
    public AsyncInvoker<DownloadDataRequest, DownloadDataResponse> downloadDataAsyncInvoker(
        DownloadDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.downloadData, hcClient);
    }

    /**
     * 获取医疗平台信息
     *
     * 获取医疗平台信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOverviewRequest 请求对象
     * @return CompletableFuture<ShowOverviewResponse>
     */
    public CompletableFuture<ShowOverviewResponse> showOverviewAsync(ShowOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showOverview);
    }

    /**
     * 获取医疗平台信息
     *
     * 获取医疗平台信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOverviewRequest 请求对象
     * @return AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse>
     */
    public AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewAsyncInvoker(
        ShowOverviewRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showOverview, hcClient);
    }

    /**
     * 创建notebook
     *
     * 创建notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotebookRequest 请求对象
     * @return CompletableFuture<CreateNotebookResponse>
     */
    public CompletableFuture<CreateNotebookResponse> createNotebookAsync(CreateNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createNotebook);
    }

    /**
     * 创建notebook
     *
     * 创建notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotebookRequest 请求对象
     * @return AsyncInvoker<CreateNotebookRequest, CreateNotebookResponse>
     */
    public AsyncInvoker<CreateNotebookRequest, CreateNotebookResponse> createNotebookAsyncInvoker(
        CreateNotebookRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.createNotebook, hcClient);
    }

    /**
     * 删除notebook
     *
     * 删除notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotebookRequest 请求对象
     * @return CompletableFuture<DeleteNotebookResponse>
     */
    public CompletableFuture<DeleteNotebookResponse> deleteNotebookAsync(DeleteNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteNotebook);
    }

    /**
     * 删除notebook
     *
     * 删除notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotebookRequest 请求对象
     * @return AsyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse>
     */
    public AsyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse> deleteNotebookAsyncInvoker(
        DeleteNotebookRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.deleteNotebook, hcClient);
    }

    /**
     * 获取notebook列表
     *
     * 获取notebook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebookRequest 请求对象
     * @return CompletableFuture<ListNotebookResponse>
     */
    public CompletableFuture<ListNotebookResponse> listNotebookAsync(ListNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listNotebook);
    }

    /**
     * 获取notebook列表
     *
     * 获取notebook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebookRequest 请求对象
     * @return AsyncInvoker<ListNotebookRequest, ListNotebookResponse>
     */
    public AsyncInvoker<ListNotebookRequest, ListNotebookResponse> listNotebookAsyncInvoker(
        ListNotebookRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listNotebook, hcClient);
    }

    /**
     * 获取notebook工作环境
     *
     * 获取notebook工作环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebookToolRequest 请求对象
     * @return CompletableFuture<ListNotebookToolResponse>
     */
    public CompletableFuture<ListNotebookToolResponse> listNotebookToolAsync(ListNotebookToolRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listNotebookTool);
    }

    /**
     * 获取notebook工作环境
     *
     * 获取notebook工作环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebookToolRequest 请求对象
     * @return AsyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse>
     */
    public AsyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse> listNotebookToolAsyncInvoker(
        ListNotebookToolRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listNotebookTool, hcClient);
    }

    /**
     * 获取用户所属空间的notebook列表
     *
     * 获取用户所属空间的notebook列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserNotebookRequest 请求对象
     * @return CompletableFuture<ListUserNotebookResponse>
     */
    public CompletableFuture<ListUserNotebookResponse> listUserNotebookAsync(ListUserNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listUserNotebook);
    }

    /**
     * 获取用户所属空间的notebook列表
     *
     * 获取用户所属空间的notebook列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserNotebookRequest 请求对象
     * @return AsyncInvoker<ListUserNotebookRequest, ListUserNotebookResponse>
     */
    public AsyncInvoker<ListUserNotebookRequest, ListUserNotebookResponse> listUserNotebookAsyncInvoker(
        ListUserNotebookRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listUserNotebook, hcClient);
    }

    /**
     * 获取notebook详情
     *
     * 获取notebook详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookRequest 请求对象
     * @return CompletableFuture<ShowNotebookResponse>
     */
    public CompletableFuture<ShowNotebookResponse> showNotebookAsync(ShowNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showNotebook);
    }

    /**
     * 获取notebook详情
     *
     * 获取notebook详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookRequest 请求对象
     * @return AsyncInvoker<ShowNotebookRequest, ShowNotebookResponse>
     */
    public AsyncInvoker<ShowNotebookRequest, ShowNotebookResponse> showNotebookAsyncInvoker(
        ShowNotebookRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showNotebook, hcClient);
    }

    /**
     * 获取notebook鉴权信息
     *
     * 获取notebook鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookTokenRequest 请求对象
     * @return CompletableFuture<ShowNotebookTokenResponse>
     */
    public CompletableFuture<ShowNotebookTokenResponse> showNotebookTokenAsync(ShowNotebookTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showNotebookToken);
    }

    /**
     * 获取notebook鉴权信息
     *
     * 获取notebook鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookTokenRequest 请求对象
     * @return AsyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse>
     */
    public AsyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse> showNotebookTokenAsyncInvoker(
        ShowNotebookTokenRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.showNotebookToken, hcClient);
    }

    /**
     * 启停notebook
     *
     * 启停notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopOrStartNotebookRequest 请求对象
     * @return CompletableFuture<StopOrStartNotebookResponse>
     */
    public CompletableFuture<StopOrStartNotebookResponse> stopOrStartNotebookAsync(StopOrStartNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.stopOrStartNotebook);
    }

    /**
     * 启停notebook
     *
     * 启停notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopOrStartNotebookRequest 请求对象
     * @return AsyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse>
     */
    public AsyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse> stopOrStartNotebookAsyncInvoker(
        StopOrStartNotebookRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.stopOrStartNotebook, hcClient);
    }

    /**
     * 更新notebook
     *
     * 更新notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotebookRequest 请求对象
     * @return CompletableFuture<UpdateNotebookResponse>
     */
    public CompletableFuture<UpdateNotebookResponse> updateNotebookAsync(UpdateNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateNotebook);
    }

    /**
     * 更新notebook
     *
     * 更新notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotebookRequest 请求对象
     * @return AsyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse>
     */
    public AsyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse> updateNotebookAsyncInvoker(
        UpdateNotebookRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.updateNotebook, hcClient);
    }

    /**
     * 文件下载
     *
     * 文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadPublicDataRequest 请求对象
     * @return CompletableFuture<DownloadPublicDataResponse>
     */
    public CompletableFuture<DownloadPublicDataResponse> downloadPublicDataAsync(DownloadPublicDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.downloadPublicData);
    }

    /**
     * 文件下载
     *
     * 文件下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadPublicDataRequest 请求对象
     * @return AsyncInvoker<DownloadPublicDataRequest, DownloadPublicDataResponse>
     */
    public AsyncInvoker<DownloadPublicDataRequest, DownloadPublicDataResponse> downloadPublicDataAsyncInvoker(
        DownloadPublicDataRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.downloadPublicData, hcClient);
    }

    /**
     * 获取用户OBS桶列表
     *
     * 获取用户OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketRequest 请求对象
     * @return CompletableFuture<ListObsBucketResponse>
     */
    public CompletableFuture<ListObsBucketResponse> listObsBucketAsync(ListObsBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listObsBucket);
    }

    /**
     * 获取用户OBS桶列表
     *
     * 获取用户OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketRequest 请求对象
     * @return AsyncInvoker<ListObsBucketRequest, ListObsBucketResponse>
     */
    public AsyncInvoker<ListObsBucketRequest, ListObsBucketResponse> listObsBucketAsyncInvoker(
        ListObsBucketRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listObsBucket, hcClient);
    }

    /**
     * 获取用户OBS桶内对象
     *
     * 获取用户OBS桶内对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketObjectRequest 请求对象
     * @return CompletableFuture<ListObsBucketObjectResponse>
     */
    public CompletableFuture<ListObsBucketObjectResponse> listObsBucketObjectAsync(ListObsBucketObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listObsBucketObject);
    }

    /**
     * 获取用户OBS桶内对象
     *
     * 获取用户OBS桶内对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketObjectRequest 请求对象
     * @return AsyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse>
     */
    public AsyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse> listObsBucketObjectAsyncInvoker(
        ListObsBucketObjectRequest request) {
        return new AsyncInvoker<>(request, EiHealthMeta.listObsBucketObject, hcClient);
    }

}
