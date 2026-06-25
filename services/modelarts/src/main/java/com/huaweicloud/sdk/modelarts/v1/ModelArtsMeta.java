package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.Algorithm;
import com.huaweicloud.sdk.modelarts.v1.model.AuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindPoolNodesReq;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchCreatePoolTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchCreatePoolTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchLockPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchLockPoolNodesRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.BatchLockPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchMigratePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchMigratePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchRebootPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchRebootPoolNodesRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.BatchRebootPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResetPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResetPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResizePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResizePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResizeRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnlockPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnlockPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAuthorizationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateModelArtsAgencyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateModelArtsAgencyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderIdRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderIdResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePluginRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolPluginRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolPluginResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateSaveImageJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateSaveImageJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTagRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTmsTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainJobTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainJobTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainingExperimentRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainingJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainingJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowExecutionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowExecutionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowExecutionsActionsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowExecutionsActionsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowPurchasePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowPurchasePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowScheduleRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowScheduleResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowServiceAuthRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowServiceAuthResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowStepExecutionsActionsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowStepExecutionsActionsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowSubscriptionsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkflowSubscriptionsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkspaceReq;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAuthorizationsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAuthorizationsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeletePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeletePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteTagRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteTmsTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteTrainJobTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteTrainJobTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteTrainingJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteTrainingJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkflowExecutionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkflowExecutionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkflowRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkflowResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkflowScheduleIdRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkflowScheduleIdResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkflowSubscriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkflowSubscriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.EventUpdate;
import com.huaweicloud.sdk.modelarts.v1.model.ExecutionAction;
import com.huaweicloud.sdk.modelarts.v1.model.GetAuthorizationsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetAuthorizationsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ImageSaveJob;
import com.huaweicloud.sdk.modelarts.v1.model.Job;
import com.huaweicloud.sdk.modelarts.v1.model.JobActionType;
import com.huaweicloud.sdk.modelarts.v1.model.JobDescription;
import com.huaweicloud.sdk.modelarts.v1.model.JobSearches;
import com.huaweicloud.sdk.modelarts.v1.model.ListAlgorithmsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListAlgorithmsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventCategoriesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventCategoriesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListExecutionLabelsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListExecutionLabelsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworksRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworksResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNodePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNodePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNodePoolsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNodePoolsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListPluginTemplatesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListPluginTemplatesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListPoolPluginsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListPoolPluginsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListPoolTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListPoolTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListPoolsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListPoolsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListResourceFlavorsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListResourceFlavorsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingExperimentsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingExperimentsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobStagesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobStagesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobTasksRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobTasksResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkflowExecutionsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkflowExecutionsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkflowStepExecutionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkflowStepExecutionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkflowsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkflowsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkloadsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkloadsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ModelArtsAgencyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NetworkCreationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NetworkUpdateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NodeBatchMigrationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NodesDeletionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNodePoolRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchPoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchPoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PoolUpdateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ReportEventBody;
import com.huaweicloud.sdk.modelarts.v1.model.ResetNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAlgorithmByUuidRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAlgorithmByUuidResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAuthmodeDetailRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAuthmodeDetailResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchParamAnalysisResultPathRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchParamAnalysisResultPathResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchParamsAnalysisRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchParamsAnalysisResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchPerTrialRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchPerTrialResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchTrialEarlyStopRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchTrialEarlyStopResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchTrialsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchTrialsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchYamlTemplateContentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchYamlTemplateContentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchYamlTemplatesInfoRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoSearchYamlTemplatesInfoResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNetworkAvailableIpRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNetworkAvailableIpResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNodeConfigTemplateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNodeConfigTemplateResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowObsUrlOfTrainingJobLogsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowObsUrlOfTrainingJobLogsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowOrderRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowOrderResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowOsConfigRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowOsConfigResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowOsQuotaRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowOsQuotaResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPluginTemplateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPluginTemplateResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolMonitorRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolMonitorResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolNodeConfigRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolNodeConfigResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolNodeConfigTemplateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolNodeConfigTemplateResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolRuntimeMetricsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolRuntimeMetricsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolStatisticsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolStatisticsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowSaveImageJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowSaveImageJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowSearchAlgorithmsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowSearchAlgorithmsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainJobTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainJobTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingExperimentDetailsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingExperimentDetailsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobDetailsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobDetailsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobEnginesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobEnginesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobFlavorsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobFlavorsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobLogsPreviewRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobLogsPreviewResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobMetricsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingJobMetricsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingQuotasRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowTrainingQuotasResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowExecutionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowExecutionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowLabelsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowLabelsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowScheduleListRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowScheduleListResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowScheduleRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowScheduleResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowStepExecutionMetricsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowStepExecutionMetricsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowSubscriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowSubscriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowsOverviewRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowsOverviewResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowsTodolistRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowsTodolistResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkloadStatisticsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkloadStatisticsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkspaceQuotasRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkspaceQuotasResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StepExecutionAction;
import com.huaweicloud.sdk.modelarts.v1.model.StopTrainingJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopTrainingJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.Subscription;
import com.huaweicloud.sdk.modelarts.v1.model.TaskHistory;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowExecutionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowExecutionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowScheduleRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowScheduleResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowSubscriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowSubscriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceQuotasReq;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceQuotasRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceQuotasResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceReq;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ValidateAuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ValidateAuthorizationRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.ValidateAuthorizationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.WorkflowExecution;
import com.huaweicloud.sdk.modelarts.v1.model.WorkflowMainServiceAuthReq;
import com.huaweicloud.sdk.modelarts.v1.model.WorkflowParam;
import com.huaweicloud.sdk.modelarts.v1.model.WorkflowSchedule;
import com.huaweicloud.sdk.modelarts.v1.model.WorkflowScheduleUpdate;
import com.huaweicloud.sdk.modelarts.v1.model.WorkflowServicePackage;
import com.huaweicloud.sdk.modelarts.v1.model.WorkflowStepMetric;
import com.huaweicloud.sdk.modelarts.v1.model.WorkflowUpdate;

import java.util.List;

@SuppressWarnings("unchecked")
public class ModelArtsMeta {

    public static final HttpRequestDef<AcceptScheduledEventRequest, AcceptScheduledEventResponse> acceptScheduledEvent =
        genForAcceptScheduledEvent();

    private static HttpRequestDef<AcceptScheduledEventRequest, AcceptScheduledEventResponse> genForAcceptScheduledEvent() {
        // basic
        HttpRequestDef.Builder<AcceptScheduledEventRequest, AcceptScheduledEventResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AcceptScheduledEventRequest.class, AcceptScheduledEventResponse.class)
            .withName("AcceptScheduledEvent")
            .withUri("/v1/{project_id}/scheduled-events/{event_id}/accept")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScheduledEventRequest::getEventId, AcceptScheduledEventRequest::setEventId));
        builder.<String>withRequestField("workspaceId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScheduledEventRequest::getWorkspaceId,
                AcceptScheduledEventRequest::setWorkspaceId));
        builder.<EventUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventUpdate.class),
            f -> f.withMarshaller(AcceptScheduledEventRequest::getBody, AcceptScheduledEventRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AcceptScheduledEventResponse::getXRequestId,
                AcceptScheduledEventResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchBindPoolNodesRequest, BatchBindPoolNodesResponse> batchBindPoolNodes =
        genForBatchBindPoolNodes();

    private static HttpRequestDef<BatchBindPoolNodesRequest, BatchBindPoolNodesResponse> genForBatchBindPoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchBindPoolNodesRequest, BatchBindPoolNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchBindPoolNodesRequest.class, BatchBindPoolNodesResponse.class)
                .withName("BatchBindPoolNodes")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchBindPoolNodesRequest::getPoolName, BatchBindPoolNodesRequest::setPoolName));
        builder.<BatchBindPoolNodesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchBindPoolNodesReq.class),
            f -> f.withMarshaller(BatchBindPoolNodesRequest::getBody, BatchBindPoolNodesRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(BatchBindPoolNodesResponse::getBody, BatchBindPoolNodesResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePoolTagsRequest, BatchCreatePoolTagsResponse> batchCreatePoolTags =
        genForBatchCreatePoolTags();

    private static HttpRequestDef<BatchCreatePoolTagsRequest, BatchCreatePoolTagsResponse> genForBatchCreatePoolTags() {
        // basic
        HttpRequestDef.Builder<BatchCreatePoolTagsRequest, BatchCreatePoolTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreatePoolTagsRequest.class, BatchCreatePoolTagsResponse.class)
                .withName("BatchCreatePoolTags")
                .withUri("/v1/{project_id}/pools/{pool_name}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreatePoolTagsRequest::getPoolName, BatchCreatePoolTagsRequest::setPoolName));
        builder.<CreateTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagRequest.class),
            f -> f.withMarshaller(BatchCreatePoolTagsRequest::getBody, BatchCreatePoolTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePoolNodesRequest, BatchDeletePoolNodesResponse> batchDeletePoolNodes =
        genForBatchDeletePoolNodes();

    private static HttpRequestDef<BatchDeletePoolNodesRequest, BatchDeletePoolNodesResponse> genForBatchDeletePoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchDeletePoolNodesRequest, BatchDeletePoolNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeletePoolNodesRequest.class, BatchDeletePoolNodesResponse.class)
            .withName("BatchDeletePoolNodes")
            .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePoolNodesRequest::getPoolName, BatchDeletePoolNodesRequest::setPoolName));
        builder.<NodesDeletionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodesDeletionRequest.class),
            f -> f.withMarshaller(BatchDeletePoolNodesRequest::getBody, BatchDeletePoolNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePoolTagsRequest, BatchDeletePoolTagsResponse> batchDeletePoolTags =
        genForBatchDeletePoolTags();

    private static HttpRequestDef<BatchDeletePoolTagsRequest, BatchDeletePoolTagsResponse> genForBatchDeletePoolTags() {
        // basic
        HttpRequestDef.Builder<BatchDeletePoolTagsRequest, BatchDeletePoolTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeletePoolTagsRequest.class, BatchDeletePoolTagsResponse.class)
            .withName("BatchDeletePoolTags")
            .withUri("/v1/{project_id}/pools/{pool_name}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePoolTagsRequest::getPoolName, BatchDeletePoolTagsRequest::setPoolName));
        builder.<DeleteTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagRequest.class),
            f -> f.withMarshaller(BatchDeletePoolTagsRequest::getBody, BatchDeletePoolTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchLockPoolNodesRequest, BatchLockPoolNodesResponse> batchLockPoolNodes =
        genForBatchLockPoolNodes();

    private static HttpRequestDef<BatchLockPoolNodesRequest, BatchLockPoolNodesResponse> genForBatchLockPoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchLockPoolNodesRequest, BatchLockPoolNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchLockPoolNodesRequest.class, BatchLockPoolNodesResponse.class)
                .withName("BatchLockPoolNodes")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-lock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchLockPoolNodesRequest::getPoolName, BatchLockPoolNodesRequest::setPoolName));
        builder.<BatchLockPoolNodesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchLockPoolNodesRequestBody.class),
            f -> f.withMarshaller(BatchLockPoolNodesRequest::getBody, BatchLockPoolNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchMigratePoolNodesRequest, BatchMigratePoolNodesResponse> batchMigratePoolNodes =
        genForBatchMigratePoolNodes();

    private static HttpRequestDef<BatchMigratePoolNodesRequest, BatchMigratePoolNodesResponse> genForBatchMigratePoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchMigratePoolNodesRequest, BatchMigratePoolNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchMigratePoolNodesRequest.class, BatchMigratePoolNodesResponse.class)
            .withName("BatchMigratePoolNodes")
            .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-migrate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchMigratePoolNodesRequest::getPoolName,
                BatchMigratePoolNodesRequest::setPoolName));
        builder.<NodeBatchMigrationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeBatchMigrationRequest.class),
            f -> f.withMarshaller(BatchMigratePoolNodesRequest::getBody, BatchMigratePoolNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootPoolNodesRequest, BatchRebootPoolNodesResponse> batchRebootPoolNodes =
        genForBatchRebootPoolNodes();

    private static HttpRequestDef<BatchRebootPoolNodesRequest, BatchRebootPoolNodesResponse> genForBatchRebootPoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchRebootPoolNodesRequest, BatchRebootPoolNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchRebootPoolNodesRequest.class, BatchRebootPoolNodesResponse.class)
            .withName("BatchRebootPoolNodes")
            .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-reboot")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRebootPoolNodesRequest::getPoolName, BatchRebootPoolNodesRequest::setPoolName));
        builder.<BatchRebootPoolNodesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRebootPoolNodesRequestBody.class),
            f -> f.withMarshaller(BatchRebootPoolNodesRequest::getBody, BatchRebootPoolNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResetPoolNodesRequest, BatchResetPoolNodesResponse> batchResetPoolNodes =
        genForBatchResetPoolNodes();

    private static HttpRequestDef<BatchResetPoolNodesRequest, BatchResetPoolNodesResponse> genForBatchResetPoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchResetPoolNodesRequest, BatchResetPoolNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchResetPoolNodesRequest.class, BatchResetPoolNodesResponse.class)
                .withName("BatchResetPoolNodes")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchResetPoolNodesRequest::getPoolName, BatchResetPoolNodesRequest::setPoolName));
        builder.<ResetNodesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetNodesRequest.class),
            f -> f.withMarshaller(BatchResetPoolNodesRequest::getBody, BatchResetPoolNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResizePoolNodesRequest, BatchResizePoolNodesResponse> batchResizePoolNodes =
        genForBatchResizePoolNodes();

    private static HttpRequestDef<BatchResizePoolNodesRequest, BatchResizePoolNodesResponse> genForBatchResizePoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchResizePoolNodesRequest, BatchResizePoolNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchResizePoolNodesRequest.class, BatchResizePoolNodesResponse.class)
            .withName("BatchResizePoolNodes")
            .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-resize")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchResizePoolNodesRequest::getPoolName, BatchResizePoolNodesRequest::setPoolName));
        builder.<BatchResizeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchResizeRequestBody.class),
            f -> f.withMarshaller(BatchResizePoolNodesRequest::getBody, BatchResizePoolNodesRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(BatchResizePoolNodesResponse::getBody, BatchResizePoolNodesResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<BatchUnlockPoolNodesRequest, BatchUnlockPoolNodesResponse> batchUnlockPoolNodes =
        genForBatchUnlockPoolNodes();

    private static HttpRequestDef<BatchUnlockPoolNodesRequest, BatchUnlockPoolNodesResponse> genForBatchUnlockPoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchUnlockPoolNodesRequest, BatchUnlockPoolNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUnlockPoolNodesRequest.class, BatchUnlockPoolNodesResponse.class)
            .withName("BatchUnlockPoolNodes")
            .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-unlock")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUnlockPoolNodesRequest::getPoolName, BatchUnlockPoolNodesRequest::setPoolName));
        builder.<BatchLockPoolNodesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchLockPoolNodesRequestBody.class),
            f -> f.withMarshaller(BatchUnlockPoolNodesRequest::getBody, BatchUnlockPoolNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdatePoolNodesRequest, BatchUpdatePoolNodesResponse> batchUpdatePoolNodes =
        genForBatchUpdatePoolNodes();

    private static HttpRequestDef<BatchUpdatePoolNodesRequest, BatchUpdatePoolNodesResponse> genForBatchUpdatePoolNodes() {
        // basic
        HttpRequestDef.Builder<BatchUpdatePoolNodesRequest, BatchUpdatePoolNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdatePoolNodesRequest.class, BatchUpdatePoolNodesResponse.class)
            .withName("BatchUpdatePoolNodes")
            .withUri("/v2/{project_id}/pools/{pool_name}/nodes/batch-update")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdatePoolNodesRequest::getPoolName, BatchUpdatePoolNodesRequest::setPoolName));
        builder.<BatchUpdatePoolNodesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdatePoolNodesRequestBody.class),
            f -> f.withMarshaller(BatchUpdatePoolNodesRequest::getBody, BatchUpdatePoolNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAlgorithmRequest, ChangeAlgorithmResponse> changeAlgorithm =
        genForChangeAlgorithm();

    private static HttpRequestDef<ChangeAlgorithmRequest, ChangeAlgorithmResponse> genForChangeAlgorithm() {
        // basic
        HttpRequestDef.Builder<ChangeAlgorithmRequest, ChangeAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeAlgorithmRequest.class, ChangeAlgorithmResponse.class)
                .withName("ChangeAlgorithm")
                .withUri("/v2/{project_id}/algorithms/{algorithm_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAlgorithmRequest::getAlgorithmId, ChangeAlgorithmRequest::setAlgorithmId));
        builder.<Algorithm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Algorithm.class),
            f -> f.withMarshaller(ChangeAlgorithmRequest::getBody, ChangeAlgorithmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeTrainingExperimentRequest, ChangeTrainingExperimentResponse> changeTrainingExperiment =
        genForChangeTrainingExperiment();

    private static HttpRequestDef<ChangeTrainingExperimentRequest, ChangeTrainingExperimentResponse> genForChangeTrainingExperiment() {
        // basic
        HttpRequestDef.Builder<ChangeTrainingExperimentRequest, ChangeTrainingExperimentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, ChangeTrainingExperimentRequest.class, ChangeTrainingExperimentResponse.class)
                .withName("ChangeTrainingExperiment")
                .withUri("/v2/{project_id}/training-experiments/{experiment_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("experiment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeTrainingExperimentRequest::getExperimentId,
                ChangeTrainingExperimentRequest::setExperimentId));
        builder.<ChangeTrainingExperimentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeTrainingExperimentRequestBody.class),
            f -> f.withMarshaller(ChangeTrainingExperimentRequest::getBody, ChangeTrainingExperimentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeTrainingJobDescriptionRequest, ChangeTrainingJobDescriptionResponse> changeTrainingJobDescription =
        genForChangeTrainingJobDescription();

    private static HttpRequestDef<ChangeTrainingJobDescriptionRequest, ChangeTrainingJobDescriptionResponse> genForChangeTrainingJobDescription() {
        // basic
        HttpRequestDef.Builder<ChangeTrainingJobDescriptionRequest, ChangeTrainingJobDescriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeTrainingJobDescriptionRequest.class,
                    ChangeTrainingJobDescriptionResponse.class)
                .withName("ChangeTrainingJobDescription")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeTrainingJobDescriptionRequest::getTrainingJobId,
                ChangeTrainingJobDescriptionRequest::setTrainingJobId));
        builder.<JobDescription>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobDescription.class),
            f -> f.withMarshaller(ChangeTrainingJobDescriptionRequest::getBody,
                ChangeTrainingJobDescriptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTrainingExperimentRequest, CheckTrainingExperimentResponse> checkTrainingExperiment =
        genForCheckTrainingExperiment();

    private static HttpRequestDef<CheckTrainingExperimentRequest, CheckTrainingExperimentResponse> genForCheckTrainingExperiment() {
        // basic
        HttpRequestDef.Builder<CheckTrainingExperimentRequest, CheckTrainingExperimentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckTrainingExperimentRequest.class, CheckTrainingExperimentResponse.class)
            .withName("CheckTrainingExperiment")
            .withUri("/v2/{project_id}/training-experiment-names")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTrainingExperimentRequest::getWorkspaceId,
                CheckTrainingExperimentRequest::setWorkspaceId));
        builder.<String>withRequestField("experiment_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTrainingExperimentRequest::getExperimentName,
                CheckTrainingExperimentRequest::setExperimentName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlgorithmRequest, CreateAlgorithmResponse> createAlgorithm =
        genForCreateAlgorithm();

    private static HttpRequestDef<CreateAlgorithmRequest, CreateAlgorithmResponse> genForCreateAlgorithm() {
        // basic
        HttpRequestDef.Builder<CreateAlgorithmRequest, CreateAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlgorithmRequest.class, CreateAlgorithmResponse.class)
                .withName("CreateAlgorithm")
                .withUri("/v2/{project_id}/algorithms")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<Algorithm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Algorithm.class),
            f -> f.withMarshaller(CreateAlgorithmRequest::getBody, CreateAlgorithmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlgorithmVersionToGalleryRequest, CreateAlgorithmVersionToGalleryResponse> createAlgorithmVersionToGallery =
        genForCreateAlgorithmVersionToGallery();

    private static HttpRequestDef<CreateAlgorithmVersionToGalleryRequest, CreateAlgorithmVersionToGalleryResponse> genForCreateAlgorithmVersionToGallery() {
        // basic
        HttpRequestDef.Builder<CreateAlgorithmVersionToGalleryRequest, CreateAlgorithmVersionToGalleryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAlgorithmVersionToGalleryRequest.class,
                    CreateAlgorithmVersionToGalleryResponse.class)
                .withName("CreateAlgorithmVersionToGallery")
                .withUri("/v2/{project_id}/gallery-algorithm-publication")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateAlgorithmVersionToGalleryBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlgorithmVersionToGalleryBody.class),
            f -> f.withMarshaller(CreateAlgorithmVersionToGalleryRequest::getBody,
                CreateAlgorithmVersionToGalleryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorizationRequest, CreateAuthorizationResponse> createAuthorization =
        genForCreateAuthorization();

    private static HttpRequestDef<CreateAuthorizationRequest, CreateAuthorizationResponse> genForCreateAuthorization() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizationRequest, CreateAuthorizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuthorizationRequest.class, CreateAuthorizationResponse.class)
                .withName("CreateAuthorization")
                .withUri("/v2/{project_id}/authorizations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AuthorizationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizationRequest.class),
            f -> f.withMarshaller(CreateAuthorizationRequest::getBody, CreateAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateModelArtsAgencyRequest, CreateModelArtsAgencyResponse> createModelArtsAgency =
        genForCreateModelArtsAgency();

    private static HttpRequestDef<CreateModelArtsAgencyRequest, CreateModelArtsAgencyResponse> genForCreateModelArtsAgency() {
        // basic
        HttpRequestDef.Builder<CreateModelArtsAgencyRequest, CreateModelArtsAgencyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateModelArtsAgencyRequest.class, CreateModelArtsAgencyResponse.class)
            .withName("CreateModelArtsAgency")
            .withUri("/v2/{project_id}/agency")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ModelArtsAgencyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModelArtsAgencyRequest.class),
            f -> f.withMarshaller(CreateModelArtsAgencyRequest::getBody, CreateModelArtsAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNetworkRequest, CreateNetworkResponse> createNetwork =
        genForCreateNetwork();

    private static HttpRequestDef<CreateNetworkRequest, CreateNetworkResponse> genForCreateNetwork() {
        // basic
        HttpRequestDef.Builder<CreateNetworkRequest, CreateNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNetworkRequest.class, CreateNetworkResponse.class)
                .withName("CreateNetwork")
                .withUri("/v1/{project_id}/networks")
                .withContentType("application/json");

        // requests
        builder.<NetworkCreationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NetworkCreationRequest.class),
            f -> f.withMarshaller(CreateNetworkRequest::getBody, CreateNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> createNodePool =
        genForCreateNodePool();

    private static HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> genForCreateNodePool() {
        // basic
        HttpRequestDef.Builder<CreateNodePoolRequest, CreateNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNodePoolRequest.class, CreateNodePoolResponse.class)
                .withName("CreateNodePool")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodepools")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodePoolRequest::getPoolName, CreateNodePoolRequest::setPoolName));
        builder.<CreateNodePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNodePoolRequestBody.class),
            f -> f.withMarshaller(CreateNodePoolRequest::getBody, CreateNodePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrderIdRequest, CreateOrderIdResponse> createOrderId =
        genForCreateOrderId();

    private static HttpRequestDef<CreateOrderIdRequest, CreateOrderIdResponse> genForCreateOrderId() {
        // basic
        HttpRequestDef.Builder<CreateOrderIdRequest, CreateOrderIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrderIdRequest.class, CreateOrderIdResponse.class)
                .withName("CreateOrderId")
                .withUri("/v2/{project_id}/pools/{name}/orderid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrderIdRequest::getName, CreateOrderIdRequest::setName));
        builder.<String>withRequestField("actionType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrderIdRequest::getActionType, CreateOrderIdRequest::setActionType));
        builder.<String>withRequestField("workspaceId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrderIdRequest::getWorkspaceId, CreateOrderIdRequest::setWorkspaceId));
        builder.<CreateOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateOrderRequestBody.class),
            f -> f.withMarshaller(CreateOrderIdRequest::getBody, CreateOrderIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolRequest, CreatePoolResponse> createPool = genForCreatePool();

    private static HttpRequestDef<CreatePoolRequest, CreatePoolResponse> genForCreatePool() {
        // basic
        HttpRequestDef.Builder<CreatePoolRequest, CreatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePoolRequest.class, CreatePoolResponse.class)
                .withName("CreatePool")
                .withUri("/v2/{project_id}/pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-ModelArts-User-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePoolRequest::getXModelArtsUserID, CreatePoolRequest::setXModelArtsUserID));
        builder.<CreatePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePoolRequestBody.class),
            f -> f.withMarshaller(CreatePoolRequest::getBody, CreatePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolPluginRequest, CreatePoolPluginResponse> createPoolPlugin =
        genForCreatePoolPlugin();

    private static HttpRequestDef<CreatePoolPluginRequest, CreatePoolPluginResponse> genForCreatePoolPlugin() {
        // basic
        HttpRequestDef.Builder<CreatePoolPluginRequest, CreatePoolPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePoolPluginRequest.class, CreatePoolPluginResponse.class)
                .withName("CreatePoolPlugin")
                .withUri("/v2/{project_id}/pools/{pool_name}/plugins")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePoolPluginRequest::getPoolName, CreatePoolPluginRequest::setPoolName));
        builder.<CreatePluginRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePluginRequestBody.class),
            f -> f.withMarshaller(CreatePoolPluginRequest::getBody, CreatePoolPluginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSaveImageJobRequest, CreateSaveImageJobResponse> createSaveImageJob =
        genForCreateSaveImageJob();

    private static HttpRequestDef<CreateSaveImageJobRequest, CreateSaveImageJobResponse> genForCreateSaveImageJob() {
        // basic
        HttpRequestDef.Builder<CreateSaveImageJobRequest, CreateSaveImageJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSaveImageJobRequest.class, CreateSaveImageJobResponse.class)
                .withName("CreateSaveImageJob")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/tasks/{task_id}/save-image-job")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSaveImageJobRequest::getTrainingJobId,
                CreateSaveImageJobRequest::setTrainingJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSaveImageJobRequest::getTaskId, CreateSaveImageJobRequest::setTaskId));
        builder.<ImageSaveJob>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageSaveJob.class),
            f -> f.withMarshaller(CreateSaveImageJobRequest::getBody, CreateSaveImageJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainJobTagsRequest, CreateTrainJobTagsResponse> createTrainJobTags =
        genForCreateTrainJobTags();

    private static HttpRequestDef<CreateTrainJobTagsRequest, CreateTrainJobTagsResponse> genForCreateTrainJobTags() {
        // basic
        HttpRequestDef.Builder<CreateTrainJobTagsRequest, CreateTrainJobTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTrainJobTagsRequest.class, CreateTrainJobTagsResponse.class)
                .withName("CreateTrainJobTags")
                .withUri("/v2/{project_id}/modelarts-training-job/{training_job_id}/tags/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainJobTagsRequest::getTrainingJobId,
                CreateTrainJobTagsRequest::setTrainingJobId));
        builder.<CreateTmsTagsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTmsTagsRequest.class),
            f -> f.withMarshaller(CreateTrainJobTagsRequest::getBody, CreateTrainJobTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainingExperimentRequest, CreateTrainingExperimentResponse> createTrainingExperiment =
        genForCreateTrainingExperiment();

    private static HttpRequestDef<CreateTrainingExperimentRequest, CreateTrainingExperimentResponse> genForCreateTrainingExperiment() {
        // basic
        HttpRequestDef.Builder<CreateTrainingExperimentRequest, CreateTrainingExperimentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateTrainingExperimentRequest.class, CreateTrainingExperimentResponse.class)
                .withName("CreateTrainingExperiment")
                .withUri("/v2/{project_id}/training-experiments")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTrainingExperimentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTrainingExperimentRequestBody.class),
            f -> f.withMarshaller(CreateTrainingExperimentRequest::getBody, CreateTrainingExperimentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainingJobRequest, CreateTrainingJobResponse> createTrainingJob =
        genForCreateTrainingJob();

    private static HttpRequestDef<CreateTrainingJobRequest, CreateTrainingJobResponse> genForCreateTrainingJob() {
        // basic
        HttpRequestDef.Builder<CreateTrainingJobRequest, CreateTrainingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTrainingJobRequest.class, CreateTrainingJobResponse.class)
                .withName("CreateTrainingJob")
                .withUri("/v2/{project_id}/training-jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<Job>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Job.class),
            f -> f.withMarshaller(CreateTrainingJobRequest::getBody, CreateTrainingJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspace =
        genForCreateWorkspace();

    private static HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> genForCreateWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateWorkspaceRequest, CreateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkspaceRequest.class, CreateWorkspaceResponse.class)
                .withName("CreateWorkspace")
                .withUri("/v1/{project_id}/workspaces")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateWorkspaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkspaceReq.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, CreateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlgorithmRequest, DeleteAlgorithmResponse> deleteAlgorithm =
        genForDeleteAlgorithm();

    private static HttpRequestDef<DeleteAlgorithmRequest, DeleteAlgorithmResponse> genForDeleteAlgorithm() {
        // basic
        HttpRequestDef.Builder<DeleteAlgorithmRequest, DeleteAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlgorithmRequest.class, DeleteAlgorithmResponse.class)
                .withName("DeleteAlgorithm")
                .withUri("/v2/{project_id}/algorithms/{algorithm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlgorithmRequest::getAlgorithmId, DeleteAlgorithmRequest::setAlgorithmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuthorizationsRequest, DeleteAuthorizationsResponse> deleteAuthorizations =
        genForDeleteAuthorizations();

    private static HttpRequestDef<DeleteAuthorizationsRequest, DeleteAuthorizationsResponse> genForDeleteAuthorizations() {
        // basic
        HttpRequestDef.Builder<DeleteAuthorizationsRequest, DeleteAuthorizationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuthorizationsRequest.class, DeleteAuthorizationsResponse.class)
            .withName("DeleteAuthorizations")
            .withUri("/v2/{project_id}/authorizations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuthorizationsRequest::getUserId, DeleteAuthorizationsRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNetworkRequest, DeleteNetworkResponse> deleteNetwork =
        genForDeleteNetwork();

    private static HttpRequestDef<DeleteNetworkRequest, DeleteNetworkResponse> genForDeleteNetwork() {
        // basic
        HttpRequestDef.Builder<DeleteNetworkRequest, DeleteNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNetworkRequest.class, DeleteNetworkResponse.class)
                .withName("DeleteNetwork")
                .withUri("/v1/{project_id}/networks/{network_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNetworkRequest::getNetworkName, DeleteNetworkRequest::setNetworkName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePool =
        genForDeleteNodePool();

    private static HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> genForDeleteNodePool() {
        // basic
        HttpRequestDef.Builder<DeleteNodePoolRequest, DeleteNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNodePoolRequest.class, DeleteNodePoolResponse.class)
                .withName("DeleteNodePool")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodepools/{nodepool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodePoolRequest::getPoolName, DeleteNodePoolRequest::setPoolName));
        builder.<String>withRequestField("nodepool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodePoolRequest::getNodepoolName, DeleteNodePoolRequest::setNodepoolName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolRequest, DeletePoolResponse> deletePool = genForDeletePool();

    private static HttpRequestDef<DeletePoolRequest, DeletePoolResponse> genForDeletePool() {
        // basic
        HttpRequestDef.Builder<DeletePoolRequest, DeletePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePoolRequest.class, DeletePoolResponse.class)
                .withName("DeletePool")
                .withUri("/v2/{project_id}/pools/{pool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePoolRequest::getPoolName, DeletePoolRequest::setPoolName));
        builder.<String>withRequestField("X-ModelArts-User-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePoolRequest::getXModelArtsUserID, DeletePoolRequest::setXModelArtsUserID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrainJobTagsRequest, DeleteTrainJobTagsResponse> deleteTrainJobTags =
        genForDeleteTrainJobTags();

    private static HttpRequestDef<DeleteTrainJobTagsRequest, DeleteTrainJobTagsResponse> genForDeleteTrainJobTags() {
        // basic
        HttpRequestDef.Builder<DeleteTrainJobTagsRequest, DeleteTrainJobTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTrainJobTagsRequest.class, DeleteTrainJobTagsResponse.class)
                .withName("DeleteTrainJobTags")
                .withUri("/v2/{project_id}/modelarts-training-job/{training_job_id}/tags/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrainJobTagsRequest::getTrainingJobId,
                DeleteTrainJobTagsRequest::setTrainingJobId));
        builder.<DeleteTmsTagsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTmsTagsRequest.class),
            f -> f.withMarshaller(DeleteTrainJobTagsRequest::getBody, DeleteTrainJobTagsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTrainJobTagsResponse::getBody, DeleteTrainJobTagsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrainingExperimentRequest, DeleteTrainingExperimentResponse> deleteTrainingExperiment =
        genForDeleteTrainingExperiment();

    private static HttpRequestDef<DeleteTrainingExperimentRequest, DeleteTrainingExperimentResponse> genForDeleteTrainingExperiment() {
        // basic
        HttpRequestDef.Builder<DeleteTrainingExperimentRequest, DeleteTrainingExperimentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTrainingExperimentRequest.class,
                    DeleteTrainingExperimentResponse.class)
                .withName("DeleteTrainingExperiment")
                .withUri("/v2/{project_id}/training-experiments/{experiment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("experiment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrainingExperimentRequest::getExperimentId,
                DeleteTrainingExperimentRequest::setExperimentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrainingJobRequest, DeleteTrainingJobResponse> deleteTrainingJob =
        genForDeleteTrainingJob();

    private static HttpRequestDef<DeleteTrainingJobRequest, DeleteTrainingJobResponse> genForDeleteTrainingJob() {
        // basic
        HttpRequestDef.Builder<DeleteTrainingJobRequest, DeleteTrainingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTrainingJobRequest.class, DeleteTrainingJobResponse.class)
                .withName("DeleteTrainingJob")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrainingJobRequest::getTrainingJobId,
                DeleteTrainingJobRequest::setTrainingJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspace =
        genForDeleteWorkspace();

    private static HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> genForDeleteWorkspace() {
        // basic
        HttpRequestDef.Builder<DeleteWorkspaceRequest, DeleteWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkspaceRequest.class, DeleteWorkspaceResponse.class)
                .withName("DeleteWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspaceRequest::getWorkspaceId, DeleteWorkspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetAuthorizationsRequest, GetAuthorizationsResponse> getAuthorizations =
        genForGetAuthorizations();

    private static HttpRequestDef<GetAuthorizationsRequest, GetAuthorizationsResponse> genForGetAuthorizations() {
        // basic
        HttpRequestDef.Builder<GetAuthorizationsRequest, GetAuthorizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetAuthorizationsRequest.class, GetAuthorizationsResponse.class)
                .withName("GetAuthorizations")
                .withUri("/v2/{project_id}/authorizations")
                .withContentType("application/json");

        // requests
        builder.<GetAuthorizationsRequest.SortByEnum>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GetAuthorizationsRequest.SortByEnum.class),
            f -> f.withMarshaller(GetAuthorizationsRequest::getSortBy, GetAuthorizationsRequest::setSortBy));
        builder.<GetAuthorizationsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GetAuthorizationsRequest.OrderEnum.class),
            f -> f.withMarshaller(GetAuthorizationsRequest::getOrder, GetAuthorizationsRequest::setOrder));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetAuthorizationsRequest::getLimit, GetAuthorizationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetAuthorizationsRequest::getOffset, GetAuthorizationsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlgorithmsRequest, ListAlgorithmsResponse> listAlgorithms =
        genForListAlgorithms();

    private static HttpRequestDef<ListAlgorithmsRequest, ListAlgorithmsResponse> genForListAlgorithms() {
        // basic
        HttpRequestDef.Builder<ListAlgorithmsRequest, ListAlgorithmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlgorithmsRequest.class, ListAlgorithmsResponse.class)
                .withName("ListAlgorithms")
                .withUri("/v2/{project_id}/algorithms")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getOffset, ListAlgorithmsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getLimit, ListAlgorithmsRequest::setLimit));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getSortBy, ListAlgorithmsRequest::setSortBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getOrder, ListAlgorithmsRequest::setOrder));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getGroupBy, ListAlgorithmsRequest::setGroupBy));
        builder.<String>withRequestField("searches",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getSearches, ListAlgorithmsRequest::setSearches));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getWorkspaceId, ListAlgorithmsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventCategoriesRequest, ListEventCategoriesResponse> listEventCategories =
        genForListEventCategories();

    private static HttpRequestDef<ListEventCategoriesRequest, ListEventCategoriesResponse> genForListEventCategories() {
        // basic
        HttpRequestDef.Builder<ListEventCategoriesRequest, ListEventCategoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventCategoriesRequest.class, ListEventCategoriesResponse.class)
                .withName("ListEventCategories")
                .withUri("/v2/{project_id}/training-event-categories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventCategoriesRequest::getFlavorType,
                ListEventCategoriesRequest::setFlavorType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForListEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForListEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v1/{project_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getResource, ListEventsRequest::setResource));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getName, ListEventsRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventsRequest::getLimit, ListEventsRequest::setLimit));
        builder.<String>withRequestField("continue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getContinue, ListEventsRequest::setContinue));
        builder.<Integer>withRequestField("since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventsRequest::getSince, ListEventsRequest::setSince));
        builder.<Integer>withRequestField("until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventsRequest::getUntil, ListEventsRequest::setUntil));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getType, ListEventsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v2/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getType, ListJobsRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, ListJobsRequest::setOffset));
        builder.<Long>withRequestField("since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobsRequest::getSince, ListJobsRequest::setSince));
        builder.<Long>withRequestField("until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobsRequest::getUntil, ListJobsRequest::setUntil));
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getResource, ListJobsRequest::setResource));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getName, ListJobsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNetworksRequest, ListNetworksResponse> listNetworks = genForListNetworks();

    private static HttpRequestDef<ListNetworksRequest, ListNetworksResponse> genForListNetworks() {
        // basic
        HttpRequestDef.Builder<ListNetworksRequest, ListNetworksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNetworksRequest.class, ListNetworksResponse.class)
                .withName("ListNetworks")
                .withUri("/v1/{project_id}/networks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("labelSelector",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworksRequest::getLabelSelector, ListNetworksRequest::setLabelSelector));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworksRequest::getLimit, ListNetworksRequest::setLimit));
        builder.<String>withRequestField("continue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworksRequest::getContinue, ListNetworksRequest::setContinue));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodePoolNodesRequest, ListNodePoolNodesResponse> listNodePoolNodes =
        genForListNodePoolNodes();

    private static HttpRequestDef<ListNodePoolNodesRequest, ListNodePoolNodesResponse> genForListNodePoolNodes() {
        // basic
        HttpRequestDef.Builder<ListNodePoolNodesRequest, ListNodePoolNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodePoolNodesRequest.class, ListNodePoolNodesResponse.class)
                .withName("ListNodePoolNodes")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodepools/{nodepool_name}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolNodesRequest::getPoolName, ListNodePoolNodesRequest::setPoolName));
        builder.<String>withRequestField("nodepool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolNodesRequest::getNodepoolName,
                ListNodePoolNodesRequest::setNodepoolName));
        builder.<String>withRequestField("continue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolNodesRequest::getContinue, ListNodePoolNodesRequest::setContinue));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolNodesRequest::getLimit, ListNodePoolNodesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> listNodePools =
        genForListNodePools();

    private static HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> genForListNodePools() {
        // basic
        HttpRequestDef.Builder<ListNodePoolsRequest, ListNodePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodePoolsRequest.class, ListNodePoolsResponse.class)
                .withName("ListNodePools")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodepools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolsRequest::getPoolName, ListNodePoolsRequest::setPoolName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginTemplatesRequest, ListPluginTemplatesResponse> listPluginTemplates =
        genForListPluginTemplates();

    private static HttpRequestDef<ListPluginTemplatesRequest, ListPluginTemplatesResponse> genForListPluginTemplates() {
        // basic
        HttpRequestDef.Builder<ListPluginTemplatesRequest, ListPluginTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPluginTemplatesRequest.class, ListPluginTemplatesResponse.class)
                .withName("ListPluginTemplates")
                .withUri("/v2/{project_id}/plugintemplates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("templateName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginTemplatesRequest::getTemplateName,
                ListPluginTemplatesRequest::setTemplateName));
        builder.<String>withRequestField("poolName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginTemplatesRequest::getPoolName, ListPluginTemplatesRequest::setPoolName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolNodesRequest, ListPoolNodesResponse> listPoolNodes =
        genForListPoolNodes();

    private static HttpRequestDef<ListPoolNodesRequest, ListPoolNodesResponse> genForListPoolNodes() {
        // basic
        HttpRequestDef.Builder<ListPoolNodesRequest, ListPoolNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolNodesRequest.class, ListPoolNodesResponse.class)
                .withName("ListPoolNodes")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolNodesRequest::getPoolName, ListPoolNodesRequest::setPoolName));
        builder.<String>withRequestField("continue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolNodesRequest::getContinue, ListPoolNodesRequest::setContinue));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolNodesRequest::getLimit, ListPoolNodesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolPluginsRequest, ListPoolPluginsResponse> listPoolPlugins =
        genForListPoolPlugins();

    private static HttpRequestDef<ListPoolPluginsRequest, ListPoolPluginsResponse> genForListPoolPlugins() {
        // basic
        HttpRequestDef.Builder<ListPoolPluginsRequest, ListPoolPluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolPluginsRequest.class, ListPoolPluginsResponse.class)
                .withName("ListPoolPlugins")
                .withUri("/v2/{project_id}/pools/{pool_name}/plugins")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolPluginsRequest::getPoolName, ListPoolPluginsRequest::setPoolName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolTagsRequest, ListPoolTagsResponse> listPoolTags = genForListPoolTags();

    private static HttpRequestDef<ListPoolTagsRequest, ListPoolTagsResponse> genForListPoolTags() {
        // basic
        HttpRequestDef.Builder<ListPoolTagsRequest, ListPoolTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolTagsRequest.class, ListPoolTagsResponse.class)
                .withName("ListPoolTags")
                .withUri("/v1/{project_id}/pools/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolTagsRequest::getLimit, ListPoolTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolTagsRequest::getOffset, ListPoolTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForListPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForListPools() {
        // basic
        HttpRequestDef.Builder<ListPoolsRequest, ListPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolsRequest.class, ListPoolsResponse.class)
                .withName("ListPools")
                .withUri("/v2/{project_id}/pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspaceId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getWorkspaceId, ListPoolsRequest::setWorkspaceId));
        builder.<String>withRequestField("labelSelector",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getLabelSelector, ListPoolsRequest::setLabelSelector));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getStatus, ListPoolsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceFlavorsRequest, ListResourceFlavorsResponse> listResourceFlavors =
        genForListResourceFlavors();

    private static HttpRequestDef<ListResourceFlavorsRequest, ListResourceFlavorsResponse> genForListResourceFlavors() {
        // basic
        HttpRequestDef.Builder<ListResourceFlavorsRequest, ListResourceFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceFlavorsRequest.class, ListResourceFlavorsResponse.class)
                .withName("ListResourceFlavors")
                .withUri("/v1/{project_id}/resourceflavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("continue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceFlavorsRequest::getContinue, ListResourceFlavorsRequest::setContinue));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceFlavorsRequest::getLimit, ListResourceFlavorsRequest::setLimit));
        builder.<String>withRequestField("labelSelector",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceFlavorsRequest::getLabelSelector,
                ListResourceFlavorsRequest::setLabelSelector));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduledEventsRequest, ListScheduledEventsResponse> listScheduledEvents =
        genForListScheduledEvents();

    private static HttpRequestDef<ListScheduledEventsRequest, ListScheduledEventsResponse> genForListScheduledEvents() {
        // basic
        HttpRequestDef.Builder<ListScheduledEventsRequest, ListScheduledEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduledEventsRequest.class, ListScheduledEventsResponse.class)
                .withName("ListScheduledEvents")
                .withUri("/v1/{project_id}/scheduled-events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspaceId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getWorkspaceId,
                ListScheduledEventsRequest::setWorkspaceId));
        builder.<List<ListScheduledEventsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getState, ListScheduledEventsRequest::setState));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getType, ListScheduledEventsRequest::setType));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getId, ListScheduledEventsRequest::setId));
        builder.<String>withRequestField("nodeName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getNodeName, ListScheduledEventsRequest::setNodeName));
        builder.<String>withRequestField("poolName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getPoolName, ListScheduledEventsRequest::setPoolName));
        builder.<String>withRequestField("publishStartTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getPublishStartTime,
                ListScheduledEventsRequest::setPublishStartTime));
        builder.<String>withRequestField("publishEndTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getPublishEndTime,
                ListScheduledEventsRequest::setPublishEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getOffset, ListScheduledEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getLimit, ListScheduledEventsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScheduledEventsResponse::getXRequestId,
                ListScheduledEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTrainingExperimentsRequest, ListTrainingExperimentsResponse> listTrainingExperiments =
        genForListTrainingExperiments();

    private static HttpRequestDef<ListTrainingExperimentsRequest, ListTrainingExperimentsResponse> genForListTrainingExperiments() {
        // basic
        HttpRequestDef.Builder<ListTrainingExperimentsRequest, ListTrainingExperimentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTrainingExperimentsRequest.class, ListTrainingExperimentsResponse.class)
            .withName("ListTrainingExperiments")
            .withUri("/v2/{project_id}/training-experiments")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingExperimentsRequest::getWorkspaceId,
                ListTrainingExperimentsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrainingExperimentsRequest::getLimit, ListTrainingExperimentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrainingExperimentsRequest::getOffset,
                ListTrainingExperimentsRequest::setOffset));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingExperimentsRequest::getSortBy,
                ListTrainingExperimentsRequest::setSortBy));
        builder.<ListTrainingExperimentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTrainingExperimentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListTrainingExperimentsRequest::getOrder, ListTrainingExperimentsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrainingJobEventsRequest, ListTrainingJobEventsResponse> listTrainingJobEvents =
        genForListTrainingJobEvents();

    private static HttpRequestDef<ListTrainingJobEventsRequest, ListTrainingJobEventsResponse> genForListTrainingJobEvents() {
        // basic
        HttpRequestDef.Builder<ListTrainingJobEventsRequest, ListTrainingJobEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTrainingJobEventsRequest.class, ListTrainingJobEventsResponse.class)
            .withName("ListTrainingJobEvents")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}/events")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getTrainingJobId,
                ListTrainingJobEventsRequest::setTrainingJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getOffset, ListTrainingJobEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getLimit, ListTrainingJobEventsRequest::setLimit));
        builder.<ListTrainingJobEventsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTrainingJobEventsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getOrder, ListTrainingJobEventsRequest::setOrder));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getStartTime,
                ListTrainingJobEventsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getEndTime, ListTrainingJobEventsRequest::setEndTime));
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getLevel, ListTrainingJobEventsRequest::setLevel));
        builder.<String>withRequestField("pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getPattern, ListTrainingJobEventsRequest::setPattern));
        builder.<ListTrainingJobEventsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTrainingJobEventsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListTrainingJobEventsRequest::getXLanguage,
                ListTrainingJobEventsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse> listTrainingJobStages =
        genForListTrainingJobStages();

    private static HttpRequestDef<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse> genForListTrainingJobStages() {
        // basic
        HttpRequestDef.Builder<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTrainingJobStagesRequest.class, ListTrainingJobStagesResponse.class)
            .withName("ListTrainingJobStages")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}/stages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobStagesRequest::getTrainingJobId,
                ListTrainingJobStagesRequest::setTrainingJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse> listTrainingJobTasks =
        genForListTrainingJobTasks();

    private static HttpRequestDef<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse> genForListTrainingJobTasks() {
        // basic
        HttpRequestDef.Builder<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTrainingJobTasksRequest.class, ListTrainingJobTasksResponse.class)
            .withName("ListTrainingJobTasks")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobTasksRequest::getTrainingJobId,
                ListTrainingJobTasksRequest::setTrainingJobId));
        builder.<Integer>withRequestField("schedule_count",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrainingJobTasksRequest::getScheduleCount,
                ListTrainingJobTasksRequest::setScheduleCount));

        // response
        builder.<List<TaskHistory>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTrainingJobTasksResponse::getBody, ListTrainingJobTasksResponse::setBody)
                .withInnerContainerType(TaskHistory.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTrainingJobsRequest, ListTrainingJobsResponse> listTrainingJobs =
        genForListTrainingJobs();

    private static HttpRequestDef<ListTrainingJobsRequest, ListTrainingJobsResponse> genForListTrainingJobs() {
        // basic
        HttpRequestDef.Builder<ListTrainingJobsRequest, ListTrainingJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTrainingJobsRequest.class, ListTrainingJobsResponse.class)
                .withName("ListTrainingJobs")
                .withUri("/v2/{project_id}/training-job-searches")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<JobSearches>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobSearches.class),
            f -> f.withMarshaller(ListTrainingJobsRequest::getBody, ListTrainingJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkloadsRequest, ListWorkloadsResponse> listWorkloads =
        genForListWorkloads();

    private static HttpRequestDef<ListWorkloadsRequest, ListWorkloadsResponse> genForListWorkloads() {
        // basic
        HttpRequestDef.Builder<ListWorkloadsRequest, ListWorkloadsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkloadsRequest.class, ListWorkloadsResponse.class)
                .withName("ListWorkloads")
                .withUri("/v2/{project_id}/pools/{pool_name}/workloads")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadsRequest::getPoolName, ListWorkloadsRequest::setPoolName));
        builder.<List<String>>withRequestField("hostip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListWorkloadsRequest::getHostip, ListWorkloadsRequest::setHostip));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadsRequest::getType, ListWorkloadsRequest::setType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadsRequest::getStatus, ListWorkloadsRequest::setStatus));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadsRequest::getSort, ListWorkloadsRequest::setSort));
        builder.<Boolean>withRequestField("ascend",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkloadsRequest::getAscend, ListWorkloadsRequest::setAscend));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadsRequest::getOffset, ListWorkloadsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkloadsRequest::getLimit, ListWorkloadsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspaceRequest, ListWorkspaceResponse> listWorkspace =
        genForListWorkspace();

    private static HttpRequestDef<ListWorkspaceRequest, ListWorkspaceResponse> genForListWorkspace() {
        // basic
        HttpRequestDef.Builder<ListWorkspaceRequest, ListWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspaceRequest.class, ListWorkspaceResponse.class)
                .withName("ListWorkspace")
                .withUri("/v1/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getOffset, ListWorkspaceRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getLimit, ListWorkspaceRequest::setLimit));
        builder.<ListWorkspaceRequest.SortByEnum>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkspaceRequest.SortByEnum.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getSortBy, ListWorkspaceRequest::setSortBy));
        builder.<ListWorkspaceRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkspaceRequest.OrderEnum.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getOrder, ListWorkspaceRequest::setOrder));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getEnterpriseProjectId,
                ListWorkspaceRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getName, ListWorkspaceRequest::setName));
        builder.<Boolean>withRequestField("filter_accessible",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getFilterAccessible,
                ListWorkspaceRequest::setFilterAccessible));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse> notifyTrainingJobInformation =
        genForNotifyTrainingJobInformation();

    private static HttpRequestDef<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse> genForNotifyTrainingJobInformation() {
        // basic
        HttpRequestDef.Builder<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NotifyTrainingJobInformationRequest.class,
                    NotifyTrainingJobInformationResponse.class)
                .withName("NotifyTrainingJobInformation")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/tasks/{task_id}/reports/{report_type}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NotifyTrainingJobInformationRequest::getTrainingJobId,
                NotifyTrainingJobInformationRequest::setTrainingJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NotifyTrainingJobInformationRequest::getTaskId,
                NotifyTrainingJobInformationRequest::setTaskId));
        builder.<String>withRequestField("report_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NotifyTrainingJobInformationRequest::getReportType,
                NotifyTrainingJobInformationRequest::setReportType));
        builder.<ReportEventBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ReportEventBody.class),
            f -> f.withMarshaller(NotifyTrainingJobInformationRequest::getBody,
                NotifyTrainingJobInformationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PatchNetworkRequest, PatchNetworkResponse> patchNetwork = genForPatchNetwork();

    private static HttpRequestDef<PatchNetworkRequest, PatchNetworkResponse> genForPatchNetwork() {
        // basic
        HttpRequestDef.Builder<PatchNetworkRequest, PatchNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, PatchNetworkRequest.class, PatchNetworkResponse.class)
                .withName("PatchNetwork")
                .withUri("/v1/{project_id}/networks/{network_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchNetworkRequest::getNetworkName, PatchNetworkRequest::setNetworkName));
        builder.<NetworkUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NetworkUpdateRequest.class),
            f -> f.withMarshaller(PatchNetworkRequest::getBody, PatchNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PatchNodePoolRequest, PatchNodePoolResponse> patchNodePool =
        genForPatchNodePool();

    private static HttpRequestDef<PatchNodePoolRequest, PatchNodePoolResponse> genForPatchNodePool() {
        // basic
        HttpRequestDef.Builder<PatchNodePoolRequest, PatchNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, PatchNodePoolRequest.class, PatchNodePoolResponse.class)
                .withName("PatchNodePool")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodepools/{nodepool_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchNodePoolRequest::getPoolName, PatchNodePoolRequest::setPoolName));
        builder.<String>withRequestField("nodepool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchNodePoolRequest::getNodepoolName, PatchNodePoolRequest::setNodepoolName));
        builder.<PatchNodePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PatchNodePoolRequestBody.class),
            f -> f.withMarshaller(PatchNodePoolRequest::getBody, PatchNodePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PatchPoolRequest, PatchPoolResponse> patchPool = genForPatchPool();

    private static HttpRequestDef<PatchPoolRequest, PatchPoolResponse> genForPatchPool() {
        // basic
        HttpRequestDef.Builder<PatchPoolRequest, PatchPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, PatchPoolRequest.class, PatchPoolResponse.class)
                .withName("PatchPool")
                .withUri("/v2/{project_id}/pools/{pool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchPoolRequest::getPoolName, PatchPoolRequest::setPoolName));
        builder.<String>withRequestField("X-ModelArts-User-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchPoolRequest::getXModelArtsUserID, PatchPoolRequest::setXModelArtsUserID));
        builder.<PoolUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PoolUpdateRequest.class),
            f -> f.withMarshaller(PatchPoolRequest::getBody, PatchPoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlgorithmByUuidRequest, ShowAlgorithmByUuidResponse> showAlgorithmByUuid =
        genForShowAlgorithmByUuid();

    private static HttpRequestDef<ShowAlgorithmByUuidRequest, ShowAlgorithmByUuidResponse> genForShowAlgorithmByUuid() {
        // basic
        HttpRequestDef.Builder<ShowAlgorithmByUuidRequest, ShowAlgorithmByUuidResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlgorithmByUuidRequest.class, ShowAlgorithmByUuidResponse.class)
                .withName("ShowAlgorithmByUuid")
                .withUri("/v2/{project_id}/algorithms/{algorithm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlgorithmByUuidRequest::getAlgorithmId,
                ShowAlgorithmByUuidRequest::setAlgorithmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse> showAuthmodeDetail =
        genForShowAuthmodeDetail();

    private static HttpRequestDef<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse> genForShowAuthmodeDetail() {
        // basic
        HttpRequestDef.Builder<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuthmodeDetailRequest.class, ShowAuthmodeDetailResponse.class)
                .withName("ShowAuthmodeDetail")
                .withUri("/v1/auth-mode")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoSearchParamAnalysisResultPathRequest, ShowAutoSearchParamAnalysisResultPathResponse> showAutoSearchParamAnalysisResultPath =
        genForShowAutoSearchParamAnalysisResultPath();

    private static HttpRequestDef<ShowAutoSearchParamAnalysisResultPathRequest, ShowAutoSearchParamAnalysisResultPathResponse> genForShowAutoSearchParamAnalysisResultPath() {
        // basic
        HttpRequestDef.Builder<ShowAutoSearchParamAnalysisResultPathRequest, ShowAutoSearchParamAnalysisResultPathResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAutoSearchParamAnalysisResultPathRequest.class,
                    ShowAutoSearchParamAnalysisResultPathResponse.class)
                .withName("ShowAutoSearchParamAnalysisResultPath")
                .withUri(
                    "/v2/{project_id}/training-jobs/{training_job_id}/autosearch-parameter-analysis/{parameter_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parameter_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchParamAnalysisResultPathRequest::getParameterName,
                ShowAutoSearchParamAnalysisResultPathRequest::setParameterName));
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchParamAnalysisResultPathRequest::getTrainingJobId,
                ShowAutoSearchParamAnalysisResultPathRequest::setTrainingJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoSearchParamsAnalysisRequest, ShowAutoSearchParamsAnalysisResponse> showAutoSearchParamsAnalysis =
        genForShowAutoSearchParamsAnalysis();

    private static HttpRequestDef<ShowAutoSearchParamsAnalysisRequest, ShowAutoSearchParamsAnalysisResponse> genForShowAutoSearchParamsAnalysis() {
        // basic
        HttpRequestDef.Builder<ShowAutoSearchParamsAnalysisRequest, ShowAutoSearchParamsAnalysisResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAutoSearchParamsAnalysisRequest.class,
                    ShowAutoSearchParamsAnalysisResponse.class)
                .withName("ShowAutoSearchParamsAnalysis")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/autosearch-parameter-analysis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchParamsAnalysisRequest::getTrainingJobId,
                ShowAutoSearchParamsAnalysisRequest::setTrainingJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoSearchPerTrialRequest, ShowAutoSearchPerTrialResponse> showAutoSearchPerTrial =
        genForShowAutoSearchPerTrial();

    private static HttpRequestDef<ShowAutoSearchPerTrialRequest, ShowAutoSearchPerTrialResponse> genForShowAutoSearchPerTrial() {
        // basic
        HttpRequestDef.Builder<ShowAutoSearchPerTrialRequest, ShowAutoSearchPerTrialResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoSearchPerTrialRequest.class, ShowAutoSearchPerTrialResponse.class)
            .withName("ShowAutoSearchPerTrial")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}/autosearch-trials/{trial_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchPerTrialRequest::getTrainingJobId,
                ShowAutoSearchPerTrialRequest::setTrainingJobId));
        builder.<String>withRequestField("trial_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchPerTrialRequest::getTrialId,
                ShowAutoSearchPerTrialRequest::setTrialId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoSearchTrialEarlyStopRequest, ShowAutoSearchTrialEarlyStopResponse> showAutoSearchTrialEarlyStop =
        genForShowAutoSearchTrialEarlyStop();

    private static HttpRequestDef<ShowAutoSearchTrialEarlyStopRequest, ShowAutoSearchTrialEarlyStopResponse> genForShowAutoSearchTrialEarlyStop() {
        // basic
        HttpRequestDef.Builder<ShowAutoSearchTrialEarlyStopRequest, ShowAutoSearchTrialEarlyStopResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowAutoSearchTrialEarlyStopRequest.class,
                    ShowAutoSearchTrialEarlyStopResponse.class)
                .withName("ShowAutoSearchTrialEarlyStop")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/autosearch-trial-earlystop/{trial_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchTrialEarlyStopRequest::getTrainingJobId,
                ShowAutoSearchTrialEarlyStopRequest::setTrainingJobId));
        builder.<String>withRequestField("trial_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchTrialEarlyStopRequest::getTrialId,
                ShowAutoSearchTrialEarlyStopRequest::setTrialId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoSearchTrialsRequest, ShowAutoSearchTrialsResponse> showAutoSearchTrials =
        genForShowAutoSearchTrials();

    private static HttpRequestDef<ShowAutoSearchTrialsRequest, ShowAutoSearchTrialsResponse> genForShowAutoSearchTrials() {
        // basic
        HttpRequestDef.Builder<ShowAutoSearchTrialsRequest, ShowAutoSearchTrialsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoSearchTrialsRequest.class, ShowAutoSearchTrialsResponse.class)
            .withName("ShowAutoSearchTrials")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}/autosearch-trials")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchTrialsRequest::getTrainingJobId,
                ShowAutoSearchTrialsRequest::setTrainingJobId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAutoSearchTrialsRequest::getLimit, ShowAutoSearchTrialsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAutoSearchTrialsRequest::getOffset, ShowAutoSearchTrialsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoSearchYamlTemplateContentRequest, ShowAutoSearchYamlTemplateContentResponse> showAutoSearchYamlTemplateContent =
        genForShowAutoSearchYamlTemplateContent();

    private static HttpRequestDef<ShowAutoSearchYamlTemplateContentRequest, ShowAutoSearchYamlTemplateContentResponse> genForShowAutoSearchYamlTemplateContent() {
        // basic
        HttpRequestDef.Builder<ShowAutoSearchYamlTemplateContentRequest, ShowAutoSearchYamlTemplateContentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAutoSearchYamlTemplateContentRequest.class,
                    ShowAutoSearchYamlTemplateContentResponse.class)
                .withName("ShowAutoSearchYamlTemplateContent")
                .withUri("/v2/{project_id}/training-jobs/autosearch/yaml-templates/{algorithm_type}/{algorithm_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchYamlTemplateContentRequest::getAlgorithmType,
                ShowAutoSearchYamlTemplateContentRequest::setAlgorithmType));
        builder.<String>withRequestField("algorithm_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSearchYamlTemplateContentRequest::getAlgorithmName,
                ShowAutoSearchYamlTemplateContentRequest::setAlgorithmName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoSearchYamlTemplatesInfoRequest, ShowAutoSearchYamlTemplatesInfoResponse> showAutoSearchYamlTemplatesInfo =
        genForShowAutoSearchYamlTemplatesInfo();

    private static HttpRequestDef<ShowAutoSearchYamlTemplatesInfoRequest, ShowAutoSearchYamlTemplatesInfoResponse> genForShowAutoSearchYamlTemplatesInfo() {
        // basic
        HttpRequestDef.Builder<ShowAutoSearchYamlTemplatesInfoRequest, ShowAutoSearchYamlTemplatesInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAutoSearchYamlTemplatesInfoRequest.class,
                    ShowAutoSearchYamlTemplatesInfoResponse.class)
                .withName("ShowAutoSearchYamlTemplatesInfo")
                .withUri("/v2/{project_id}/training-jobs/autosearch/yaml-templates")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkRequest, ShowNetworkResponse> showNetwork = genForShowNetwork();

    private static HttpRequestDef<ShowNetworkRequest, ShowNetworkResponse> genForShowNetwork() {
        // basic
        HttpRequestDef.Builder<ShowNetworkRequest, ShowNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNetworkRequest.class, ShowNetworkResponse.class)
                .withName("ShowNetwork")
                .withUri("/v1/{project_id}/networks/{network_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkRequest::getNetworkName, ShowNetworkRequest::setNetworkName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkAvailableIpRequest, ShowNetworkAvailableIpResponse> showNetworkAvailableIp =
        genForShowNetworkAvailableIp();

    private static HttpRequestDef<ShowNetworkAvailableIpRequest, ShowNetworkAvailableIpResponse> genForShowNetworkAvailableIp() {
        // basic
        HttpRequestDef.Builder<ShowNetworkAvailableIpRequest, ShowNetworkAvailableIpResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNetworkAvailableIpRequest.class, ShowNetworkAvailableIpResponse.class)
            .withName("ShowNetworkAvailableIp")
            .withUri("/v1/{project_id}/networks/{network_name}/network-ip-availabilities?network_id&#x3D;{network_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkAvailableIpRequest::getNetworkName,
                ShowNetworkAvailableIpRequest::setNetworkName));
        builder.<String>withRequestField("network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkAvailableIpRequest::getNetworkId,
                ShowNetworkAvailableIpRequest::setNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeConfigTemplateRequest, ShowNodeConfigTemplateResponse> showNodeConfigTemplate =
        genForShowNodeConfigTemplate();

    private static HttpRequestDef<ShowNodeConfigTemplateRequest, ShowNodeConfigTemplateResponse> genForShowNodeConfigTemplate() {
        // basic
        HttpRequestDef.Builder<ShowNodeConfigTemplateRequest, ShowNodeConfigTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNodeConfigTemplateRequest.class, ShowNodeConfigTemplateResponse.class)
            .withName("ShowNodeConfigTemplate")
            .withUri("/v1/{project_id}/nodeconfigtemplates/{nodeconfigtemplate_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nodeconfigtemplate_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeConfigTemplateRequest::getNodeconfigtemplateName,
                ShowNodeConfigTemplateRequest::setNodeconfigtemplateName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodePoolRequest, ShowNodePoolResponse> showNodePool = genForShowNodePool();

    private static HttpRequestDef<ShowNodePoolRequest, ShowNodePoolResponse> genForShowNodePool() {
        // basic
        HttpRequestDef.Builder<ShowNodePoolRequest, ShowNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodePoolRequest.class, ShowNodePoolResponse.class)
                .withName("ShowNodePool")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodepools/{nodepool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getPoolName, ShowNodePoolRequest::setPoolName));
        builder.<String>withRequestField("nodepool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getNodepoolName, ShowNodePoolRequest::setNodepoolName));
        builder.<String>withRequestField("continue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getContinue, ShowNodePoolRequest::setContinue));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getLimit, ShowNodePoolRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowObsUrlOfTrainingJobLogsRequest, ShowObsUrlOfTrainingJobLogsResponse> showObsUrlOfTrainingJobLogs =
        genForShowObsUrlOfTrainingJobLogs();

    private static HttpRequestDef<ShowObsUrlOfTrainingJobLogsRequest, ShowObsUrlOfTrainingJobLogsResponse> genForShowObsUrlOfTrainingJobLogs() {
        // basic
        HttpRequestDef.Builder<ShowObsUrlOfTrainingJobLogsRequest, ShowObsUrlOfTrainingJobLogsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowObsUrlOfTrainingJobLogsRequest.class,
                    ShowObsUrlOfTrainingJobLogsResponse.class)
                .withName("ShowObsUrlOfTrainingJobLogs")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/tasks/{task_id}/logs/url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowObsUrlOfTrainingJobLogsRequest::getTrainingJobId,
                ShowObsUrlOfTrainingJobLogsRequest::setTrainingJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowObsUrlOfTrainingJobLogsRequest::getTaskId,
                ShowObsUrlOfTrainingJobLogsRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrderRequest, ShowOrderResponse> showOrder = genForShowOrder();

    private static HttpRequestDef<ShowOrderRequest, ShowOrderResponse> genForShowOrder() {
        // basic
        HttpRequestDef.Builder<ShowOrderRequest, ShowOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOrderRequest.class, ShowOrderResponse.class)
                .withName("ShowOrder")
                .withUri("/v1/{project_id}/orders/{order_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrderRequest::getOrderName, ShowOrderRequest::setOrderName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOsConfigRequest, ShowOsConfigResponse> showOsConfig = genForShowOsConfig();

    private static HttpRequestDef<ShowOsConfigRequest, ShowOsConfigResponse> genForShowOsConfig() {
        // basic
        HttpRequestDef.Builder<ShowOsConfigRequest, ShowOsConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOsConfigRequest.class, ShowOsConfigResponse.class)
                .withName("ShowOsConfig")
                .withUri("/v1/{project_id}/os-user-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOsQuotaRequest, ShowOsQuotaResponse> showOsQuota = genForShowOsQuota();

    private static HttpRequestDef<ShowOsQuotaRequest, ShowOsQuotaResponse> genForShowOsQuota() {
        // basic
        HttpRequestDef.Builder<ShowOsQuotaRequest, ShowOsQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOsQuotaRequest.class, ShowOsQuotaResponse.class)
                .withName("ShowOsQuota")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginTemplateRequest, ShowPluginTemplateResponse> showPluginTemplate =
        genForShowPluginTemplate();

    private static HttpRequestDef<ShowPluginTemplateRequest, ShowPluginTemplateResponse> genForShowPluginTemplate() {
        // basic
        HttpRequestDef.Builder<ShowPluginTemplateRequest, ShowPluginTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPluginTemplateRequest.class, ShowPluginTemplateResponse.class)
                .withName("ShowPluginTemplate")
                .withUri("/v1/{project_id}/plugintemplates/{plugintemplate_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("plugintemplate_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginTemplateRequest::getPlugintemplateName,
                ShowPluginTemplateRequest::setPlugintemplateName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForShowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForShowPool() {
        // basic
        HttpRequestDef.Builder<ShowPoolRequest, ShowPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolRequest.class, ShowPoolResponse.class)
                .withName("ShowPool")
                .withUri("/v2/{project_id}/pools/{pool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolRequest::getPoolName, ShowPoolRequest::setPoolName));
        builder.<String>withRequestField("X-ModelArts-User-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolRequest::getXModelArtsUserID, ShowPoolRequest::setXModelArtsUserID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolMonitorRequest, ShowPoolMonitorResponse> showPoolMonitor =
        genForShowPoolMonitor();

    private static HttpRequestDef<ShowPoolMonitorRequest, ShowPoolMonitorResponse> genForShowPoolMonitor() {
        // basic
        HttpRequestDef.Builder<ShowPoolMonitorRequest, ShowPoolMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolMonitorRequest.class, ShowPoolMonitorResponse.class)
                .withName("ShowPoolMonitor")
                .withUri("/v2/{project_id}/pools/{pool_name}/monitor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolMonitorRequest::getPoolName, ShowPoolMonitorRequest::setPoolName));
        builder.<String>withRequestField("time_range",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolMonitorRequest::getTimeRange, ShowPoolMonitorRequest::setTimeRange));
        builder.<String>withRequestField("statistics",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolMonitorRequest::getStatistics, ShowPoolMonitorRequest::setStatistics));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolMonitorRequest::getPeriod, ShowPoolMonitorRequest::setPeriod));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolNodeConfigRequest, ShowPoolNodeConfigResponse> showPoolNodeConfig =
        genForShowPoolNodeConfig();

    private static HttpRequestDef<ShowPoolNodeConfigRequest, ShowPoolNodeConfigResponse> genForShowPoolNodeConfig() {
        // basic
        HttpRequestDef.Builder<ShowPoolNodeConfigRequest, ShowPoolNodeConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolNodeConfigRequest.class, ShowPoolNodeConfigResponse.class)
                .withName("ShowPoolNodeConfig")
                .withUri("/v2/{project_id}/pools/{pool_name}/node-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolNodeConfigRequest::getPoolName, ShowPoolNodeConfigRequest::setPoolName));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPoolNodeConfigResponse::getXRequestId,
                ShowPoolNodeConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolNodeConfigTemplateRequest, ShowPoolNodeConfigTemplateResponse> showPoolNodeConfigTemplate =
        genForShowPoolNodeConfigTemplate();

    private static HttpRequestDef<ShowPoolNodeConfigTemplateRequest, ShowPoolNodeConfigTemplateResponse> genForShowPoolNodeConfigTemplate() {
        // basic
        HttpRequestDef.Builder<ShowPoolNodeConfigTemplateRequest, ShowPoolNodeConfigTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPoolNodeConfigTemplateRequest.class,
                    ShowPoolNodeConfigTemplateResponse.class)
                .withName("ShowPoolNodeConfigTemplate")
                .withUri("/v2/{project_id}/pools/{pool_name}/node-config-template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolNodeConfigTemplateRequest::getPoolName,
                ShowPoolNodeConfigTemplateRequest::setPoolName));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPoolNodeConfigTemplateResponse::getXRequestId,
                ShowPoolNodeConfigTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRuntimeMetricsRequest, ShowPoolRuntimeMetricsResponse> showPoolRuntimeMetrics =
        genForShowPoolRuntimeMetrics();

    private static HttpRequestDef<ShowPoolRuntimeMetricsRequest, ShowPoolRuntimeMetricsResponse> genForShowPoolRuntimeMetrics() {
        // basic
        HttpRequestDef.Builder<ShowPoolRuntimeMetricsRequest, ShowPoolRuntimeMetricsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPoolRuntimeMetricsRequest.class, ShowPoolRuntimeMetricsResponse.class)
            .withName("ShowPoolRuntimeMetrics")
            .withUri("/v2/{project_id}/metrics/runtime/pools")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolStatisticsRequest, ShowPoolStatisticsResponse> showPoolStatistics =
        genForShowPoolStatistics();

    private static HttpRequestDef<ShowPoolStatisticsRequest, ShowPoolStatisticsResponse> genForShowPoolStatistics() {
        // basic
        HttpRequestDef.Builder<ShowPoolStatisticsRequest, ShowPoolStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolStatisticsRequest.class, ShowPoolStatisticsResponse.class)
                .withName("ShowPoolStatistics")
                .withUri("/v2/{project_id}/statistics/pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspaceId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolStatisticsRequest::getWorkspaceId,
                ShowPoolStatisticsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolTagsRequest, ShowPoolTagsResponse> showPoolTags = genForShowPoolTags();

    private static HttpRequestDef<ShowPoolTagsRequest, ShowPoolTagsResponse> genForShowPoolTags() {
        // basic
        HttpRequestDef.Builder<ShowPoolTagsRequest, ShowPoolTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolTagsRequest.class, ShowPoolTagsResponse.class)
                .withName("ShowPoolTags")
                .withUri("/v1/{project_id}/pools/{pool_name}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolTagsRequest::getPoolName, ShowPoolTagsRequest::setPoolName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSaveImageJobRequest, ShowSaveImageJobResponse> showSaveImageJob =
        genForShowSaveImageJob();

    private static HttpRequestDef<ShowSaveImageJobRequest, ShowSaveImageJobResponse> genForShowSaveImageJob() {
        // basic
        HttpRequestDef.Builder<ShowSaveImageJobRequest, ShowSaveImageJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSaveImageJobRequest.class, ShowSaveImageJobResponse.class)
                .withName("ShowSaveImageJob")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/tasks/{task_id}/save-image-job")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSaveImageJobRequest::getTrainingJobId,
                ShowSaveImageJobRequest::setTrainingJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSaveImageJobRequest::getTaskId, ShowSaveImageJobRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSearchAlgorithmsRequest, ShowSearchAlgorithmsResponse> showSearchAlgorithms =
        genForShowSearchAlgorithms();

    private static HttpRequestDef<ShowSearchAlgorithmsRequest, ShowSearchAlgorithmsResponse> genForShowSearchAlgorithms() {
        // basic
        HttpRequestDef.Builder<ShowSearchAlgorithmsRequest, ShowSearchAlgorithmsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSearchAlgorithmsRequest.class, ShowSearchAlgorithmsResponse.class)
            .withName("ShowSearchAlgorithms")
            .withUri("/v2/{project_id}/search-algorithms")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainJobTagsRequest, ShowTrainJobTagsResponse> showTrainJobTags =
        genForShowTrainJobTags();

    private static HttpRequestDef<ShowTrainJobTagsRequest, ShowTrainJobTagsResponse> genForShowTrainJobTags() {
        // basic
        HttpRequestDef.Builder<ShowTrainJobTagsRequest, ShowTrainJobTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTrainJobTagsRequest.class, ShowTrainJobTagsResponse.class)
                .withName("ShowTrainJobTags")
                .withUri("/v2/{project_id}/modelarts-training-job/{training_job_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainJobTagsRequest::getTrainingJobId,
                ShowTrainJobTagsRequest::setTrainingJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingExperimentDetailsRequest, ShowTrainingExperimentDetailsResponse> showTrainingExperimentDetails =
        genForShowTrainingExperimentDetails();

    private static HttpRequestDef<ShowTrainingExperimentDetailsRequest, ShowTrainingExperimentDetailsResponse> genForShowTrainingExperimentDetails() {
        // basic
        HttpRequestDef.Builder<ShowTrainingExperimentDetailsRequest, ShowTrainingExperimentDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTrainingExperimentDetailsRequest.class,
                    ShowTrainingExperimentDetailsResponse.class)
                .withName("ShowTrainingExperimentDetails")
                .withUri("/v2/{project_id}/training-experiments/{experiment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("experiment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingExperimentDetailsRequest::getExperimentId,
                ShowTrainingExperimentDetailsRequest::setExperimentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingJobDetailsRequest, ShowTrainingJobDetailsResponse> showTrainingJobDetails =
        genForShowTrainingJobDetails();

    private static HttpRequestDef<ShowTrainingJobDetailsRequest, ShowTrainingJobDetailsResponse> genForShowTrainingJobDetails() {
        // basic
        HttpRequestDef.Builder<ShowTrainingJobDetailsRequest, ShowTrainingJobDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTrainingJobDetailsRequest.class, ShowTrainingJobDetailsResponse.class)
            .withName("ShowTrainingJobDetails")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingJobDetailsRequest::getTrainingJobId,
                ShowTrainingJobDetailsRequest::setTrainingJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingJobEnginesRequest, ShowTrainingJobEnginesResponse> showTrainingJobEngines =
        genForShowTrainingJobEngines();

    private static HttpRequestDef<ShowTrainingJobEnginesRequest, ShowTrainingJobEnginesResponse> genForShowTrainingJobEngines() {
        // basic
        HttpRequestDef.Builder<ShowTrainingJobEnginesRequest, ShowTrainingJobEnginesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTrainingJobEnginesRequest.class, ShowTrainingJobEnginesResponse.class)
            .withName("ShowTrainingJobEngines")
            .withUri("/v2/{project_id}/training-job-engines")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingJobFlavorsRequest, ShowTrainingJobFlavorsResponse> showTrainingJobFlavors =
        genForShowTrainingJobFlavors();

    private static HttpRequestDef<ShowTrainingJobFlavorsRequest, ShowTrainingJobFlavorsResponse> genForShowTrainingJobFlavors() {
        // basic
        HttpRequestDef.Builder<ShowTrainingJobFlavorsRequest, ShowTrainingJobFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTrainingJobFlavorsRequest.class, ShowTrainingJobFlavorsResponse.class)
            .withName("ShowTrainingJobFlavors")
            .withUri("/v2/{project_id}/training-job-flavors")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingJobFlavorsRequest::getFlavorType,
                ShowTrainingJobFlavorsRequest::setFlavorType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingJobLogsPreviewRequest, ShowTrainingJobLogsPreviewResponse> showTrainingJobLogsPreview =
        genForShowTrainingJobLogsPreview();

    private static HttpRequestDef<ShowTrainingJobLogsPreviewRequest, ShowTrainingJobLogsPreviewResponse> genForShowTrainingJobLogsPreview() {
        // basic
        HttpRequestDef.Builder<ShowTrainingJobLogsPreviewRequest, ShowTrainingJobLogsPreviewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTrainingJobLogsPreviewRequest.class,
                    ShowTrainingJobLogsPreviewResponse.class)
                .withName("ShowTrainingJobLogsPreview")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/tasks/{task_id}/logs/preview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingJobLogsPreviewRequest::getTrainingJobId,
                ShowTrainingJobLogsPreviewRequest::setTrainingJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingJobLogsPreviewRequest::getTaskId,
                ShowTrainingJobLogsPreviewRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingJobMetricsRequest, ShowTrainingJobMetricsResponse> showTrainingJobMetrics =
        genForShowTrainingJobMetrics();

    private static HttpRequestDef<ShowTrainingJobMetricsRequest, ShowTrainingJobMetricsResponse> genForShowTrainingJobMetrics() {
        // basic
        HttpRequestDef.Builder<ShowTrainingJobMetricsRequest, ShowTrainingJobMetricsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTrainingJobMetricsRequest.class, ShowTrainingJobMetricsResponse.class)
            .withName("ShowTrainingJobMetrics")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}/metrics/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingJobMetricsRequest::getTrainingJobId,
                ShowTrainingJobMetricsRequest::setTrainingJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingJobMetricsRequest::getTaskId, ShowTrainingJobMetricsRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingQuotasRequest, ShowTrainingQuotasResponse> showTrainingQuotas =
        genForShowTrainingQuotas();

    private static HttpRequestDef<ShowTrainingQuotasRequest, ShowTrainingQuotasResponse> genForShowTrainingQuotas() {
        // basic
        HttpRequestDef.Builder<ShowTrainingQuotasRequest, ShowTrainingQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTrainingQuotasRequest.class, ShowTrainingQuotasResponse.class)
                .withName("ShowTrainingQuotas")
                .withUri("/v2/{project_id}/training-quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingQuotasRequest::getUserId, ShowTrainingQuotasRequest::setUserId));
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingQuotasRequest::getResource, ShowTrainingQuotasRequest::setResource));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkloadStatisticsRequest, ShowWorkloadStatisticsResponse> showWorkloadStatistics =
        genForShowWorkloadStatistics();

    private static HttpRequestDef<ShowWorkloadStatisticsRequest, ShowWorkloadStatisticsResponse> genForShowWorkloadStatistics() {
        // basic
        HttpRequestDef.Builder<ShowWorkloadStatisticsRequest, ShowWorkloadStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkloadStatisticsRequest.class, ShowWorkloadStatisticsResponse.class)
            .withName("ShowWorkloadStatistics")
            .withUri("/v2/{project_id}/statistics/pools/{pool_name}/workloads")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadStatisticsRequest::getPoolName,
                ShowWorkloadStatisticsRequest::setPoolName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceRequest, ShowWorkspaceResponse> showWorkspace =
        genForShowWorkspace();

    private static HttpRequestDef<ShowWorkspaceRequest, ShowWorkspaceResponse> genForShowWorkspace() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceRequest, ShowWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkspaceRequest.class, ShowWorkspaceResponse.class)
                .withName("ShowWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkspaceRequest::getWorkspaceId, ShowWorkspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse> showWorkspaceQuotas =
        genForShowWorkspaceQuotas();

    private static HttpRequestDef<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse> genForShowWorkspaceQuotas() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkspaceQuotasRequest.class, ShowWorkspaceQuotasResponse.class)
                .withName("ShowWorkspaceQuotas")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkspaceQuotasRequest::getWorkspaceId,
                ShowWorkspaceQuotasRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTrainingJobRequest, StopTrainingJobResponse> stopTrainingJob =
        genForStopTrainingJob();

    private static HttpRequestDef<StopTrainingJobRequest, StopTrainingJobResponse> genForStopTrainingJob() {
        // basic
        HttpRequestDef.Builder<StopTrainingJobRequest, StopTrainingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTrainingJobRequest.class, StopTrainingJobResponse.class)
                .withName("StopTrainingJob")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/actions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopTrainingJobRequest::getTrainingJobId, StopTrainingJobRequest::setTrainingJobId));
        builder.<JobActionType>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobActionType.class),
            f -> f.withMarshaller(StopTrainingJobRequest::getBody, StopTrainingJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthModeRequest, UpdateAuthModeResponse> updateAuthMode =
        genForUpdateAuthMode();

    private static HttpRequestDef<UpdateAuthModeRequest, UpdateAuthModeResponse> genForUpdateAuthMode() {
        // basic
        HttpRequestDef.Builder<UpdateAuthModeRequest, UpdateAuthModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAuthModeRequest.class, UpdateAuthModeResponse.class)
                .withName("UpdateAuthMode")
                .withUri("/v1/auth-mode")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateAuthModeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuthModeRequestBody.class),
            f -> f.withMarshaller(UpdateAuthModeRequest::getBody, UpdateAuthModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForUpdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForUpdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getWorkspaceId, UpdateWorkspaceRequest::setWorkspaceId));
        builder.<UpdateWorkspaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkspaceReq.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, UpdateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse> updateWorkspaceQuotas =
        genForUpdateWorkspaceQuotas();

    private static HttpRequestDef<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse> genForUpdateWorkspaceQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWorkspaceQuotasRequest.class, UpdateWorkspaceQuotasResponse.class)
            .withName("UpdateWorkspaceQuotas")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/quotas")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceQuotasRequest::getWorkspaceId,
                UpdateWorkspaceQuotasRequest::setWorkspaceId));
        builder.<UpdateWorkspaceQuotasReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkspaceQuotasReq.class),
            f -> f.withMarshaller(UpdateWorkspaceQuotasRequest::getBody, UpdateWorkspaceQuotasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateAuthorizationRequest, ValidateAuthorizationResponse> validateAuthorization =
        genForValidateAuthorization();

    private static HttpRequestDef<ValidateAuthorizationRequest, ValidateAuthorizationResponse> genForValidateAuthorization() {
        // basic
        HttpRequestDef.Builder<ValidateAuthorizationRequest, ValidateAuthorizationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ValidateAuthorizationRequest.class, ValidateAuthorizationResponse.class)
            .withName("ValidateAuthorization")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/auth")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateAuthorizationRequest::getWorkspaceId,
                ValidateAuthorizationRequest::setWorkspaceId));
        builder.<ValidateAuthorizationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateAuthorizationRequestBody.class),
            f -> f.withMarshaller(ValidateAuthorizationRequest::getBody, ValidateAuthorizationRequest::setBody));

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
                .withUri("/v2/{project_id}/workflows")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<WorkflowParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowParam.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, CreateWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowPurchasePoolRequest, CreateWorkflowPurchasePoolResponse> createWorkflowPurchasePool =
        genForCreateWorkflowPurchasePool();

    private static HttpRequestDef<CreateWorkflowPurchasePoolRequest, CreateWorkflowPurchasePoolResponse> genForCreateWorkflowPurchasePool() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowPurchasePoolRequest, CreateWorkflowPurchasePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkflowPurchasePoolRequest.class,
                    CreateWorkflowPurchasePoolResponse.class)
                .withName("CreateWorkflowPurchasePool")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/service/packages")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowPurchasePoolRequest::getWorkflowId,
                CreateWorkflowPurchasePoolRequest::setWorkflowId));
        builder.<WorkflowServicePackage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkflowServicePackage.class),
            f -> f.withMarshaller(CreateWorkflowPurchasePoolRequest::getBody,
                CreateWorkflowPurchasePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowServiceAuthRequest, CreateWorkflowServiceAuthResponse> createWorkflowServiceAuth =
        genForCreateWorkflowServiceAuth();

    private static HttpRequestDef<CreateWorkflowServiceAuthRequest, CreateWorkflowServiceAuthResponse> genForCreateWorkflowServiceAuth() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowServiceAuthRequest, CreateWorkflowServiceAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkflowServiceAuthRequest.class,
                    CreateWorkflowServiceAuthResponse.class)
                .withName("CreateWorkflowServiceAuth")
                .withUri("/v2/{project_id}/workflows/service/auth")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<WorkflowMainServiceAuthReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkflowMainServiceAuthReq.class),
            f -> f.withMarshaller(CreateWorkflowServiceAuthRequest::getBody,
                CreateWorkflowServiceAuthRequest::setBody));

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
                .withUri("/v2/{project_id}/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowRequest::getWorkflowId, DeleteWorkflowRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflows =
        genForListWorkflows();

    private static HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> genForListWorkflows() {
        // basic
        HttpRequestDef.Builder<ListWorkflowsRequest, ListWorkflowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowsRequest.class, ListWorkflowsResponse.class)
                .withName("ListWorkflows")
                .withUri("/v2/{project_id}/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getName, ListWorkflowsRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDescription, ListWorkflowsRequest::setDescription));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getStatus, ListWorkflowsRequest::setStatus));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLabels, ListWorkflowsRequest::setLabels));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getTemplateId, ListWorkflowsRequest::setTemplateId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLimit, ListWorkflowsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOffset, ListWorkflowsRequest::setOffset));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getSortBy, ListWorkflowsRequest::setSortBy));
        builder.<ListWorkflowsRequest.SearchTypeEnum>withRequestField("search_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowsRequest.SearchTypeEnum.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getSearchType, ListWorkflowsRequest::setSearchType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflow = genForShowWorkflow();

    private static HttpRequestDef<ShowWorkflowRequest, ShowWorkflowResponse> genForShowWorkflow() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowRequest, ShowWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkflowRequest.class, ShowWorkflowResponse.class)
                .withName("ShowWorkflow")
                .withUri("/v2/{project_id}/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getWorkflowId, ShowWorkflowRequest::setWorkflowId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getWorkspaceId, ShowWorkflowRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowLabelsRequest, ShowWorkflowLabelsResponse> showWorkflowLabels =
        genForShowWorkflowLabels();

    private static HttpRequestDef<ShowWorkflowLabelsRequest, ShowWorkflowLabelsResponse> genForShowWorkflowLabels() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowLabelsRequest, ShowWorkflowLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkflowLabelsRequest.class, ShowWorkflowLabelsResponse.class)
                .withName("ShowWorkflowLabels")
                .withUri("/v2/{project_id}/workflows/labels")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWorkflowLabelsRequest::getLimit, ShowWorkflowLabelsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWorkflowLabelsRequest::getOffset, ShowWorkflowLabelsRequest::setOffset));
        builder.<ShowWorkflowLabelsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowWorkflowLabelsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowWorkflowLabelsRequest::getOrder, ShowWorkflowLabelsRequest::setOrder));
        builder.<ShowWorkflowLabelsRequest.SortByEnum>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowWorkflowLabelsRequest.SortByEnum.class),
            f -> f.withMarshaller(ShowWorkflowLabelsRequest::getSortBy, ShowWorkflowLabelsRequest::setSortBy));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowLabelsRequest::getTemplateId, ShowWorkflowLabelsRequest::setTemplateId));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowWorkflowLabelsResponse::getBody, ShowWorkflowLabelsResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowsOverviewRequest, ShowWorkflowsOverviewResponse> showWorkflowsOverview =
        genForShowWorkflowsOverview();

    private static HttpRequestDef<ShowWorkflowsOverviewRequest, ShowWorkflowsOverviewResponse> genForShowWorkflowsOverview() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowsOverviewRequest, ShowWorkflowsOverviewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkflowsOverviewRequest.class, ShowWorkflowsOverviewResponse.class)
            .withName("ShowWorkflowsOverview")
            .withUri("/v2/{project_id}/workflows/overview")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowsOverviewRequest::getWorkspaceId,
                ShowWorkflowsOverviewRequest::setWorkspaceId));
        builder.<ShowWorkflowsOverviewRequest.SearchTypeEnum>withRequestField("search_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowWorkflowsOverviewRequest.SearchTypeEnum.class),
            f -> f.withMarshaller(ShowWorkflowsOverviewRequest::getSearchType,
                ShowWorkflowsOverviewRequest::setSearchType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowsOverviewRequest::getName, ShowWorkflowsOverviewRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowsOverviewRequest::getDescription,
                ShowWorkflowsOverviewRequest::setDescription));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowsTodolistRequest, ShowWorkflowsTodolistResponse> showWorkflowsTodolist =
        genForShowWorkflowsTodolist();

    private static HttpRequestDef<ShowWorkflowsTodolistRequest, ShowWorkflowsTodolistResponse> genForShowWorkflowsTodolist() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowsTodolistRequest, ShowWorkflowsTodolistResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkflowsTodolistRequest.class, ShowWorkflowsTodolistResponse.class)
            .withName("ShowWorkflowsTodolist")
            .withUri("/v2/{project_id}/workflows/todolist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowsTodolistRequest::getWorkspaceId,
                ShowWorkflowsTodolistRequest::setWorkspaceId));

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
                .withUri("/v2/{project_id}/workflows/{workflow_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getWorkflowId, UpdateWorkflowRequest::setWorkflowId));
        builder.<WorkflowUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkflowUpdate.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getBody, UpdateWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowExecutionRequest, CreateWorkflowExecutionResponse> createWorkflowExecution =
        genForCreateWorkflowExecution();

    private static HttpRequestDef<CreateWorkflowExecutionRequest, CreateWorkflowExecutionResponse> genForCreateWorkflowExecution() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowExecutionRequest, CreateWorkflowExecutionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWorkflowExecutionRequest.class, CreateWorkflowExecutionResponse.class)
            .withName("CreateWorkflowExecution")
            .withUri("/v2/{project_id}/workflows/{workflow_id}/executions")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowExecutionRequest::getWorkflowId,
                CreateWorkflowExecutionRequest::setWorkflowId));
        builder.<WorkflowExecution>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowExecution.class),
            f -> f.withMarshaller(CreateWorkflowExecutionRequest::getBody, CreateWorkflowExecutionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowExecutionsActionsRequest, CreateWorkflowExecutionsActionsResponse> createWorkflowExecutionsActions =
        genForCreateWorkflowExecutionsActions();

    private static HttpRequestDef<CreateWorkflowExecutionsActionsRequest, CreateWorkflowExecutionsActionsResponse> genForCreateWorkflowExecutionsActions() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowExecutionsActionsRequest, CreateWorkflowExecutionsActionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkflowExecutionsActionsRequest.class,
                    CreateWorkflowExecutionsActionsResponse.class)
                .withName("CreateWorkflowExecutionsActions")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/executions/{execution_id}/actions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowExecutionsActionsRequest::getWorkflowId,
                CreateWorkflowExecutionsActionsRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowExecutionsActionsRequest::getExecutionId,
                CreateWorkflowExecutionsActionsRequest::setExecutionId));
        builder.<ExecutionAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecutionAction.class),
            f -> f.withMarshaller(CreateWorkflowExecutionsActionsRequest::getBody,
                CreateWorkflowExecutionsActionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowStepExecutionsActionsRequest, CreateWorkflowStepExecutionsActionsResponse> createWorkflowStepExecutionsActions =
        genForCreateWorkflowStepExecutionsActions();

    private static HttpRequestDef<CreateWorkflowStepExecutionsActionsRequest, CreateWorkflowStepExecutionsActionsResponse> genForCreateWorkflowStepExecutionsActions() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowStepExecutionsActionsRequest, CreateWorkflowStepExecutionsActionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkflowStepExecutionsActionsRequest.class,
                    CreateWorkflowStepExecutionsActionsResponse.class)
                .withName("CreateWorkflowStepExecutionsActions")
                .withUri(
                    "/v2/{project_id}/workflows/{workflow_id}/executions/{execution_id}/step-executions/{step_execution_id}/actions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowStepExecutionsActionsRequest::getWorkflowId,
                CreateWorkflowStepExecutionsActionsRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowStepExecutionsActionsRequest::getExecutionId,
                CreateWorkflowStepExecutionsActionsRequest::setExecutionId));
        builder.<String>withRequestField("step_execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowStepExecutionsActionsRequest::getStepExecutionId,
                CreateWorkflowStepExecutionsActionsRequest::setStepExecutionId));
        builder.<StepExecutionAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StepExecutionAction.class),
            f -> f.withMarshaller(CreateWorkflowStepExecutionsActionsRequest::getBody,
                CreateWorkflowStepExecutionsActionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkflowExecutionRequest, DeleteWorkflowExecutionResponse> deleteWorkflowExecution =
        genForDeleteWorkflowExecution();

    private static HttpRequestDef<DeleteWorkflowExecutionRequest, DeleteWorkflowExecutionResponse> genForDeleteWorkflowExecution() {
        // basic
        HttpRequestDef.Builder<DeleteWorkflowExecutionRequest, DeleteWorkflowExecutionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWorkflowExecutionRequest.class, DeleteWorkflowExecutionResponse.class)
            .withName("DeleteWorkflowExecution")
            .withUri("/v2/{project_id}/workflows/{workflow_id}/executions/{execution_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowExecutionRequest::getWorkflowId,
                DeleteWorkflowExecutionRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowExecutionRequest::getExecutionId,
                DeleteWorkflowExecutionRequest::setExecutionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExecutionLabelsRequest, ListExecutionLabelsResponse> listExecutionLabels =
        genForListExecutionLabels();

    private static HttpRequestDef<ListExecutionLabelsRequest, ListExecutionLabelsResponse> genForListExecutionLabels() {
        // basic
        HttpRequestDef.Builder<ListExecutionLabelsRequest, ListExecutionLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExecutionLabelsRequest.class, ListExecutionLabelsResponse.class)
                .withName("ListExecutionLabels")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/executions/labels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionLabelsRequest::getWorkflowId,
                ListExecutionLabelsRequest::setWorkflowId));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListExecutionLabelsResponse::getBody, ListExecutionLabelsResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutions =
        genForListWorkflowExecutions();

    private static HttpRequestDef<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> genForListWorkflowExecutions() {
        // basic
        HttpRequestDef.Builder<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkflowExecutionsRequest.class, ListWorkflowExecutionsResponse.class)
            .withName("ListWorkflowExecutions")
            .withUri("/v2/{project_id}/workflows/{workflow_id}/executions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getWorkflowId,
                ListWorkflowExecutionsRequest::setWorkflowId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getWorkspaceId,
                ListWorkflowExecutionsRequest::setWorkspaceId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getLimit, ListWorkflowExecutionsRequest::setLimit));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getSortBy, ListWorkflowExecutionsRequest::setSortBy));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getOffset, ListWorkflowExecutionsRequest::setOffset));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getLabels, ListWorkflowExecutionsRequest::setLabels));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getStatus, ListWorkflowExecutionsRequest::setStatus));
        builder.<String>withRequestField("scene_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getSceneId,
                ListWorkflowExecutionsRequest::setSceneId));
        builder.<ListWorkflowExecutionsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowExecutionsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getOrder, ListWorkflowExecutionsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowStepExecutionRequest, ListWorkflowStepExecutionResponse> listWorkflowStepExecution =
        genForListWorkflowStepExecution();

    private static HttpRequestDef<ListWorkflowStepExecutionRequest, ListWorkflowStepExecutionResponse> genForListWorkflowStepExecution() {
        // basic
        HttpRequestDef.Builder<ListWorkflowStepExecutionRequest, ListWorkflowStepExecutionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListWorkflowStepExecutionRequest.class,
                    ListWorkflowStepExecutionResponse.class)
                .withName("ListWorkflowStepExecution")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/step-executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowStepExecutionRequest::getWorkflowId,
                ListWorkflowStepExecutionRequest::setWorkflowId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowStepExecutionRequest::getLimit,
                ListWorkflowStepExecutionRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowStepExecutionRequest::getOffset,
                ListWorkflowStepExecutionRequest::setOffset));
        builder.<ListWorkflowStepExecutionRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowStepExecutionRequest.OrderEnum.class),
            f -> f.withMarshaller(ListWorkflowStepExecutionRequest::getOrder,
                ListWorkflowStepExecutionRequest::setOrder));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowStepExecutionRequest::getSortBy,
                ListWorkflowStepExecutionRequest::setSortBy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> showWorkflowExecution =
        genForShowWorkflowExecution();

    private static HttpRequestDef<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> genForShowWorkflowExecution() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkflowExecutionRequest.class, ShowWorkflowExecutionResponse.class)
            .withName("ShowWorkflowExecution")
            .withUri("/v2/{project_id}/workflows/{workflow_id}/executions/{execution_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowExecutionRequest::getWorkflowId,
                ShowWorkflowExecutionRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowExecutionRequest::getExecutionId,
                ShowWorkflowExecutionRequest::setExecutionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowStepExecutionMetricsRequest, ShowWorkflowStepExecutionMetricsResponse> showWorkflowStepExecutionMetrics =
        genForShowWorkflowStepExecutionMetrics();

    private static HttpRequestDef<ShowWorkflowStepExecutionMetricsRequest, ShowWorkflowStepExecutionMetricsResponse> genForShowWorkflowStepExecutionMetrics() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowStepExecutionMetricsRequest, ShowWorkflowStepExecutionMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowWorkflowStepExecutionMetricsRequest.class,
                    ShowWorkflowStepExecutionMetricsResponse.class)
                .withName("ShowWorkflowStepExecutionMetrics")
                .withUri(
                    "/v2/{project_id}/workflows/{workflow_id}/executions/{execution_id}/step-executions/{step_execution_id}/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowStepExecutionMetricsRequest::getWorkflowId,
                ShowWorkflowStepExecutionMetricsRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowStepExecutionMetricsRequest::getExecutionId,
                ShowWorkflowStepExecutionMetricsRequest::setExecutionId));
        builder.<String>withRequestField("step_execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowStepExecutionMetricsRequest::getStepExecutionId,
                ShowWorkflowStepExecutionMetricsRequest::setStepExecutionId));

        // response
        builder.<List<WorkflowStepMetric>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowWorkflowStepExecutionMetricsResponse::getBody,
                    ShowWorkflowStepExecutionMetricsResponse::setBody)
                .withInnerContainerType(WorkflowStepMetric.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowExecutionRequest, UpdateWorkflowExecutionResponse> updateWorkflowExecution =
        genForUpdateWorkflowExecution();

    private static HttpRequestDef<UpdateWorkflowExecutionRequest, UpdateWorkflowExecutionResponse> genForUpdateWorkflowExecution() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowExecutionRequest, UpdateWorkflowExecutionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWorkflowExecutionRequest.class, UpdateWorkflowExecutionResponse.class)
            .withName("UpdateWorkflowExecution")
            .withUri("/v2/{project_id}/workflows/{workflow_id}/executions/{execution_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowExecutionRequest::getWorkflowId,
                UpdateWorkflowExecutionRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowExecutionRequest::getExecutionId,
                UpdateWorkflowExecutionRequest::setExecutionId));
        builder.<WorkflowExecution>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkflowExecution.class),
            f -> f.withMarshaller(UpdateWorkflowExecutionRequest::getBody, UpdateWorkflowExecutionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowScheduleRequest, CreateWorkflowScheduleResponse> createWorkflowSchedule =
        genForCreateWorkflowSchedule();

    private static HttpRequestDef<CreateWorkflowScheduleRequest, CreateWorkflowScheduleResponse> genForCreateWorkflowSchedule() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowScheduleRequest, CreateWorkflowScheduleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWorkflowScheduleRequest.class, CreateWorkflowScheduleResponse.class)
            .withName("CreateWorkflowSchedule")
            .withUri("/v2/{project_id}/workflows/{workflow_id}/schedules")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowScheduleRequest::getWorkflowId,
                CreateWorkflowScheduleRequest::setWorkflowId));
        builder.<WorkflowSchedule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowSchedule.class),
            f -> f.withMarshaller(CreateWorkflowScheduleRequest::getBody, CreateWorkflowScheduleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkflowScheduleIdRequest, DeleteWorkflowScheduleIdResponse> deleteWorkflowScheduleId =
        genForDeleteWorkflowScheduleId();

    private static HttpRequestDef<DeleteWorkflowScheduleIdRequest, DeleteWorkflowScheduleIdResponse> genForDeleteWorkflowScheduleId() {
        // basic
        HttpRequestDef.Builder<DeleteWorkflowScheduleIdRequest, DeleteWorkflowScheduleIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteWorkflowScheduleIdRequest.class,
                    DeleteWorkflowScheduleIdResponse.class)
                .withName("DeleteWorkflowScheduleId")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/schedules/{schedule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowScheduleIdRequest::getWorkflowId,
                DeleteWorkflowScheduleIdRequest::setWorkflowId));
        builder.<String>withRequestField("schedule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowScheduleIdRequest::getScheduleId,
                DeleteWorkflowScheduleIdRequest::setScheduleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowScheduleRequest, ShowWorkflowScheduleResponse> showWorkflowSchedule =
        genForShowWorkflowSchedule();

    private static HttpRequestDef<ShowWorkflowScheduleRequest, ShowWorkflowScheduleResponse> genForShowWorkflowSchedule() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowScheduleRequest, ShowWorkflowScheduleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkflowScheduleRequest.class, ShowWorkflowScheduleResponse.class)
            .withName("ShowWorkflowSchedule")
            .withUri("/v2/{project_id}/workflows/{workflow_id}/schedules/{schedule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowScheduleRequest::getWorkflowId,
                ShowWorkflowScheduleRequest::setWorkflowId));
        builder.<String>withRequestField("schedule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowScheduleRequest::getScheduleId,
                ShowWorkflowScheduleRequest::setScheduleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowScheduleListRequest, ShowWorkflowScheduleListResponse> showWorkflowScheduleList =
        genForShowWorkflowScheduleList();

    private static HttpRequestDef<ShowWorkflowScheduleListRequest, ShowWorkflowScheduleListResponse> genForShowWorkflowScheduleList() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowScheduleListRequest, ShowWorkflowScheduleListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowWorkflowScheduleListRequest.class, ShowWorkflowScheduleListResponse.class)
                .withName("ShowWorkflowScheduleList")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/schedules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowScheduleListRequest::getWorkflowId,
                ShowWorkflowScheduleListRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowScheduleRequest, UpdateWorkflowScheduleResponse> updateWorkflowSchedule =
        genForUpdateWorkflowSchedule();

    private static HttpRequestDef<UpdateWorkflowScheduleRequest, UpdateWorkflowScheduleResponse> genForUpdateWorkflowSchedule() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowScheduleRequest, UpdateWorkflowScheduleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWorkflowScheduleRequest.class, UpdateWorkflowScheduleResponse.class)
            .withName("UpdateWorkflowSchedule")
            .withUri("/v2/{project_id}/workflows/{workflow_id}/schedules/{schedule_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowScheduleRequest::getWorkflowId,
                UpdateWorkflowScheduleRequest::setWorkflowId));
        builder.<String>withRequestField("schedule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowScheduleRequest::getScheduleId,
                UpdateWorkflowScheduleRequest::setScheduleId));
        builder.<WorkflowScheduleUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkflowScheduleUpdate.class),
            f -> f.withMarshaller(UpdateWorkflowScheduleRequest::getBody, UpdateWorkflowScheduleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowSubscriptionsRequest, CreateWorkflowSubscriptionsResponse> createWorkflowSubscriptions =
        genForCreateWorkflowSubscriptions();

    private static HttpRequestDef<CreateWorkflowSubscriptionsRequest, CreateWorkflowSubscriptionsResponse> genForCreateWorkflowSubscriptions() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowSubscriptionsRequest, CreateWorkflowSubscriptionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkflowSubscriptionsRequest.class,
                    CreateWorkflowSubscriptionsResponse.class)
                .withName("CreateWorkflowSubscriptions")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/subscriptions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowSubscriptionsRequest::getWorkflowId,
                CreateWorkflowSubscriptionsRequest::setWorkflowId));
        builder.<Subscription>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Subscription.class),
            f -> f.withMarshaller(CreateWorkflowSubscriptionsRequest::getBody,
                CreateWorkflowSubscriptionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkflowSubscriptionRequest, DeleteWorkflowSubscriptionResponse> deleteWorkflowSubscription =
        genForDeleteWorkflowSubscription();

    private static HttpRequestDef<DeleteWorkflowSubscriptionRequest, DeleteWorkflowSubscriptionResponse> genForDeleteWorkflowSubscription() {
        // basic
        HttpRequestDef.Builder<DeleteWorkflowSubscriptionRequest, DeleteWorkflowSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteWorkflowSubscriptionRequest.class,
                    DeleteWorkflowSubscriptionResponse.class)
                .withName("DeleteWorkflowSubscription")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowSubscriptionRequest::getWorkflowId,
                DeleteWorkflowSubscriptionRequest::setWorkflowId));
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowSubscriptionRequest::getSubscriptionId,
                DeleteWorkflowSubscriptionRequest::setSubscriptionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowSubscriptionRequest, ShowWorkflowSubscriptionResponse> showWorkflowSubscription =
        genForShowWorkflowSubscription();

    private static HttpRequestDef<ShowWorkflowSubscriptionRequest, ShowWorkflowSubscriptionResponse> genForShowWorkflowSubscription() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowSubscriptionRequest, ShowWorkflowSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowWorkflowSubscriptionRequest.class, ShowWorkflowSubscriptionResponse.class)
                .withName("ShowWorkflowSubscription")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowSubscriptionRequest::getWorkflowId,
                ShowWorkflowSubscriptionRequest::setWorkflowId));
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowSubscriptionRequest::getSubscriptionId,
                ShowWorkflowSubscriptionRequest::setSubscriptionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowSubscriptionRequest, UpdateWorkflowSubscriptionResponse> updateWorkflowSubscription =
        genForUpdateWorkflowSubscription();

    private static HttpRequestDef<UpdateWorkflowSubscriptionRequest, UpdateWorkflowSubscriptionResponse> genForUpdateWorkflowSubscription() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowSubscriptionRequest, UpdateWorkflowSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateWorkflowSubscriptionRequest.class,
                    UpdateWorkflowSubscriptionResponse.class)
                .withName("UpdateWorkflowSubscription")
                .withUri("/v2/{project_id}/workflows/{workflow_id}/subscriptions/{subscription_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowSubscriptionRequest::getSubscriptionId,
                UpdateWorkflowSubscriptionRequest::setSubscriptionId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowSubscriptionRequest::getWorkflowId,
                UpdateWorkflowSubscriptionRequest::setWorkflowId));
        builder.<Subscription>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Subscription.class),
            f -> f.withMarshaller(UpdateWorkflowSubscriptionRequest::getBody,
                UpdateWorkflowSubscriptionRequest::setBody));

        // response

        return builder.build();
    }

}
