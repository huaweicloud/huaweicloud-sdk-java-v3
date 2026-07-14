package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.AttachDevServerVolumeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AttachDevServerVolumeResponse;
import com.huaweicloud.sdk.modelarts.v1.model.AttachDynamicStorageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AttachDynamicStorageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindInferApiKeysRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindInferApiKeysResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchCreatePoolTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchCreatePoolTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeleteInferIntranetConnectionsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeleteInferIntranetConnectionsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeleteInferServicesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeleteInferServicesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDevServersActionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDevServersActionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchLockPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchLockPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchMigratePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchMigratePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchRebootPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchRebootPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResetPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResetPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResizePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchResizePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnbindInferApiKeysRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnbindInferApiKeysResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnlockPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnlockPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BindDevServerPublicIPRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BindDevServerPublicIPResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BindInferApiKeyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BindInferApiKeyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CancelInferDeploymentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CancelInferDeploymentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeDevServerOSRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeDevServerOSResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeHyperinstanceOSRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeHyperinstanceOSResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CountInferServicesByTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CountInferServicesByTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAuthorizationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateDevServerJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateDevServerJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateHyperClusterRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateHyperClusterResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateHyperinstanceTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateHyperinstanceTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferApiKeyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferApiKeyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferDeploymentHpaRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferDeploymentHpaResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferDeploymentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferDeploymentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferHraRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferHraResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferIntranetConnectionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferIntranetConnectionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferServiceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferServiceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferServiceTagRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInferServiceTagResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateModelArtsAgencyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateModelArtsAgencyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNotebookRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNotebookResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNotebookTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNotebookTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderIdRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderIdResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolPluginRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolPluginResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateRoceNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateRoceNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateSaveImageJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateSaveImageJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainJobTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainJobTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateTrainingExperimentRequest;
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
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAuthorizationsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAuthorizationsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteDevServerJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteDevServerJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteHyperClusterRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteHyperClusterResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteHyperinstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteHyperinstanceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteHyperinstanceTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteHyperinstanceTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteImageGroupRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteImageGroupResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferApiKeyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferApiKeyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentHpaRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentHpaResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentInstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentInstanceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentPodRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentPodResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentVersionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferDeploymentVersionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferServiceTagRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferServiceTagResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNotebookRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNotebookResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNotebookTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNotebookTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeletePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeletePoolResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.DetachDevServerVolumeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DetachDevServerVolumeResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DetachDynamicStorageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DetachDynamicStorageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetAuthorizationsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetAuthorizationsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerJobServiceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerJobServiceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerJobTemplateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerJobTemplateResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerOperationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetDevServerOperationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetHyperClusterRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetHyperClusterResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetHyperinstanceOperationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetHyperinstanceOperationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetHyperinstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetHyperinstanceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetScaleEvaluationsDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetScaleEvaluationsDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.GetTopologiesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetTopologiesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListAlgorithmsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListAlgorithmsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListAllDevServersRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListAllDevServersResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListAllHyperinstancesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListAllHyperinstancesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListAllNotebooksRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListAllNotebooksResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListAuthoringClustersRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListAuthoringClustersResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerFlavorsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerFlavorsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerImagesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerImagesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerJobTemplatesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerJobTemplatesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerPublicIPRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServerPublicIPResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServersRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListDevServersResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListDynamicStoragesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListDynamicStoragesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventCategoriesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventCategoriesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListExecutionLabelsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListExecutionLabelsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListFeaturesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListFeaturesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListHyperClusterRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListHyperClusterResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListHyperinstanceClustersCapacityRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListHyperinstanceClustersCapacityResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListHyperinstancesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListHyperinstancesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListImageGroupRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListImageGroupResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferApiKeysRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferApiKeysResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferClusterFlavorsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferClusterFlavorsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentHpaEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentHpaEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentInstancesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentInstancesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentPodEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentPodEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentPodsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentPodsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentVersionsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentVersionsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferDeploymentsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferIntranetConnectionApplicationsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferIntranetConnectionApplicationsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferIntranetConnectionReviewsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferIntranetConnectionReviewsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferServiceEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferServiceEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferServiceTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferServiceTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferServicesByTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferServicesByTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferServicesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInferServicesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworksRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworksResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNodePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNodePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNodePoolsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNodePoolsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNotebooksRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNotebooksResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.ModifyInferIntranetConnectionsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ModifyInferIntranetConnectionsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchPoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchPoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.QueryHyperinstanceTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.QueryHyperinstanceTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.RebootDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.RebootDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.RegisterImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.RegisterImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ReinstallDevServerOSRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ReinstallDevServerOSResponse;
import com.huaweicloud.sdk.modelarts.v1.model.RenewLeaseRequest;
import com.huaweicloud.sdk.modelarts.v1.model.RenewLeaseResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ScaleDownHyperinstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ScaleDownHyperinstanceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ScaleUpHyperinstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ScaleUpHyperinstanceResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.ShowClusterRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowClusterResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowDynamicStorageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowDynamicStorageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferDeploymentHpaRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferDeploymentHpaResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferDeploymentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferDeploymentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferDeploymentVersionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferDeploymentVersionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferHraRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferHraResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferServiceClusterRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferServiceClusterResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferServiceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferServiceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferServiceTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInferServiceTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLeaseRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLeaseResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNetworkAvailableIpRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNetworkAvailableIpResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNodeConfigTemplateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNodeConfigTemplateResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNotebookRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNotebookResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNotebookTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowNotebookTagsResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolNodeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowPoolNodeResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.ShowSwitchableFlavorsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowSwitchableFlavorsResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.StartDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StartDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StartHyperinstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StartHyperinstanceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StartInferDeploymentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StartInferDeploymentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StartInferServiceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StartInferServiceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StartNotebookRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StartNotebookResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopHyperinstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopHyperinstanceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopInferDeploymentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopInferDeploymentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopInferServiceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopInferServiceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopNotebookRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopNotebookResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopTrainingJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopTrainingJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.SwitchInferDeploymentVersionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.SwitchInferDeploymentVersionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.SyncDevServersRequest;
import com.huaweicloud.sdk.modelarts.v1.model.SyncDevServersResponse;
import com.huaweicloud.sdk.modelarts.v1.model.SyncImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.SyncImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UnbindInferApiKeyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UnbindInferApiKeyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateImageGroupRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateImageGroupResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentHpaRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentHpaResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentScaleRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentScaleResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferHraRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferHraResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferIntranetConnectionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferIntranetConnectionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferServiceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferServiceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateNotebookRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateNotebookResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowExecutionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowExecutionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowScheduleRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowScheduleResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowSubscriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkflowSubscriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceQuotasRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceQuotasResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ValidateAuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ValidateAuthorizationResponse;

public class ModelArtsClient {

    protected HcClient hcClient;

    public ModelArtsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModelArtsClient> newBuilder() {
        ClientBuilder<ModelArtsClient> clientBuilder = new ClientBuilder<>(ModelArtsClient::new);
        return clientBuilder;
    }

    /**
     * 计划事件授权
     *
     * 计划事件授权接口用于为指定的计划事件分配或调整权限。该接口适用于以下场景：当创建新的计划事件、调整现有计划事件的权限设置或变更权限分配时，用户可通过此接口为指定的计划事件授予或修改权限。使用该接口的前提条件是计划事件已存在且用户具有管理员权限。授权操作完成后，计划事件的权限设置将被更新，相关变更将被记录以便审计。若计划事件不存在、用户无权限操作或授权信息格式不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return AcceptScheduledEventResponse
     */
    public AcceptScheduledEventResponse acceptScheduledEvent(AcceptScheduledEventRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.acceptScheduledEvent);
    }

    /**
     * 计划事件授权
     *
     * 计划事件授权接口用于为指定的计划事件分配或调整权限。该接口适用于以下场景：当创建新的计划事件、调整现有计划事件的权限设置或变更权限分配时，用户可通过此接口为指定的计划事件授予或修改权限。使用该接口的前提条件是计划事件已存在且用户具有管理员权限。授权操作完成后，计划事件的权限设置将被更新，相关变更将被记录以便审计。若计划事件不存在、用户无权限操作或授权信息格式不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return SyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse>
     */
    public SyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse> acceptScheduledEventInvoker(
        AcceptScheduledEventRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.acceptScheduledEvent, hcClient);
    }

    /**
     * 动态挂载Notebook存储
     *
     * 动态挂载Notebook存储接口支持将存储动态挂载到运行中的Notebook实例的指定文件目录。调用该接口后，系统将在Notebook实例中**异步**挂载指定的存储实例，挂载完成后用户可在容器中以文件系统方式读写存储实例中的文件。若用户无权限访问指定实例或Notebook实例未运行，接口将返回相应的错误信息。
     * 
     * 支持的存储类型：
     * - **对象存储 OBS**：适合直接使用OBS桶作为持久化存储进行AI开发和探索场景，但小文件频繁读写性能较差，**模型训练，大文件解压等场景慎用，此类场景可能会导致Notebook文件操作卡顿**。
     * - **并行文件系统 PFS**：高性能对象存储文件系统，存储成本低，吞吐量大，能够快速处理高性能计算（HPC）工作负载，**但小文件频繁读写较弱。小文件频繁读写场景可能会导致Notebook文件操作卡顿**
     * - **高性能弹性文件服务SFS Turbo**：仅支持专属资源池实例挂载，**挂载前需要在资源池网络管理界面中进行网络关联**，支持多个环境使用，可以在多个开发环境、开发环境和训练之间共享。适合探索、实验等非正式生产场景，但不适合重IO读写模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachDynamicStorageRequest 请求对象
     * @return AttachDynamicStorageResponse
     */
    public AttachDynamicStorageResponse attachDynamicStorage(AttachDynamicStorageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.attachDynamicStorage);
    }

    /**
     * 动态挂载Notebook存储
     *
     * 动态挂载Notebook存储接口支持将存储动态挂载到运行中的Notebook实例的指定文件目录。调用该接口后，系统将在Notebook实例中**异步**挂载指定的存储实例，挂载完成后用户可在容器中以文件系统方式读写存储实例中的文件。若用户无权限访问指定实例或Notebook实例未运行，接口将返回相应的错误信息。
     * 
     * 支持的存储类型：
     * - **对象存储 OBS**：适合直接使用OBS桶作为持久化存储进行AI开发和探索场景，但小文件频繁读写性能较差，**模型训练，大文件解压等场景慎用，此类场景可能会导致Notebook文件操作卡顿**。
     * - **并行文件系统 PFS**：高性能对象存储文件系统，存储成本低，吞吐量大，能够快速处理高性能计算（HPC）工作负载，**但小文件频繁读写较弱。小文件频繁读写场景可能会导致Notebook文件操作卡顿**
     * - **高性能弹性文件服务SFS Turbo**：仅支持专属资源池实例挂载，**挂载前需要在资源池网络管理界面中进行网络关联**，支持多个环境使用，可以在多个开发环境、开发环境和训练之间共享。适合探索、实验等非正式生产场景，但不适合重IO读写模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachDynamicStorageRequest 请求对象
     * @return SyncInvoker<AttachDynamicStorageRequest, AttachDynamicStorageResponse>
     */
    public SyncInvoker<AttachDynamicStorageRequest, AttachDynamicStorageResponse> attachDynamicStorageInvoker(
        AttachDynamicStorageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.attachDynamicStorage, hcClient);
    }

    /**
     * 批量绑定应用密钥
     *
     * 本接口用于将生成的多个apikey与指定服务进行批量绑定，用于访问特定服务。调用此接口前，确保已成功创建服务实例，并获取到有效的apikey。绑定成功后，apikey将作为服务调用时的身份验证凭证，确保仅授权用户能够访问该服务。如果尝试绑定已失效或已绑定当前服务的apikey将返回相应的异常信息，提示用户检查apikey的有效性和绑定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchBindInferApiKeysRequest 请求对象
     * @return BatchBindInferApiKeysResponse
     */
    public BatchBindInferApiKeysResponse batchBindInferApiKeys(BatchBindInferApiKeysRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchBindInferApiKeys);
    }

    /**
     * 批量绑定应用密钥
     *
     * 本接口用于将生成的多个apikey与指定服务进行批量绑定，用于访问特定服务。调用此接口前，确保已成功创建服务实例，并获取到有效的apikey。绑定成功后，apikey将作为服务调用时的身份验证凭证，确保仅授权用户能够访问该服务。如果尝试绑定已失效或已绑定当前服务的apikey将返回相应的异常信息，提示用户检查apikey的有效性和绑定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchBindInferApiKeysRequest 请求对象
     * @return SyncInvoker<BatchBindInferApiKeysRequest, BatchBindInferApiKeysResponse>
     */
    public SyncInvoker<BatchBindInferApiKeysRequest, BatchBindInferApiKeysResponse> batchBindInferApiKeysInvoker(
        BatchBindInferApiKeysRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchBindInferApiKeys, hcClient);
    }

    /**
     * 批量为节点绑定逻辑子池
     *
     * 批量为节点绑定逻辑子池接口用于在物理专属池开启节点绑定功能时，对逻辑子池中的节点进行逻辑子池的换绑操作。该接口适用于以下场景：当需要重新分配资源、调整业务负载或优化资源使用效率时，用户可通过此接口将指定节点从当前逻辑子池迁移到另一个逻辑子池。使用该接口的前提条件是物理专属池已开启节点绑定功能，且目标逻辑子池已存在并具备足够的资源容量。绑定操作完成后，节点将从原逻辑子池解绑并绑定到目标逻辑子池，原逻辑子池的节点数减少，目标逻辑子池的节点数增加。若节点未绑定到任何逻辑子池、目标逻辑子池不存在或资源不足，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchBindPoolNodesRequest 请求对象
     * @return BatchBindPoolNodesResponse
     */
    public BatchBindPoolNodesResponse batchBindPoolNodes(BatchBindPoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchBindPoolNodes);
    }

    /**
     * 批量为节点绑定逻辑子池
     *
     * 批量为节点绑定逻辑子池接口用于在物理专属池开启节点绑定功能时，对逻辑子池中的节点进行逻辑子池的换绑操作。该接口适用于以下场景：当需要重新分配资源、调整业务负载或优化资源使用效率时，用户可通过此接口将指定节点从当前逻辑子池迁移到另一个逻辑子池。使用该接口的前提条件是物理专属池已开启节点绑定功能，且目标逻辑子池已存在并具备足够的资源容量。绑定操作完成后，节点将从原逻辑子池解绑并绑定到目标逻辑子池，原逻辑子池的节点数减少，目标逻辑子池的节点数增加。若节点未绑定到任何逻辑子池、目标逻辑子池不存在或资源不足，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchBindPoolNodesRequest 请求对象
     * @return SyncInvoker<BatchBindPoolNodesRequest, BatchBindPoolNodesResponse>
     */
    public SyncInvoker<BatchBindPoolNodesRequest, BatchBindPoolNodesResponse> batchBindPoolNodesInvoker(
        BatchBindPoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchBindPoolNodes, hcClient);
    }

    /**
     * 批量创建资源池标签
     *
     * 批量创建资源池标签接口用于为指定资源池添加或更新多个标签信息。该接口适用于以下场景：当需要对资源池进行统一分类管理（如成本归属、环境标识）、批量配置元数据（如项目归属、负责人信息）或更新已有标签值时，管理员可通过此接口一次性操作多个标签。使用该接口的前提条件是目标资源池必须已存在且处于可管理状态，调用者需具备资源池标签管理权限，且提交的标签数据需符合格式规范（如key非空、value长度限制）。操作完成后，系统将为资源池添加新标签或覆盖同名标签的值，且不会影响资源池的其他配置属性。若资源池不存在、用户权限不足、标签格式错误或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;、\&quot;400 Bad Request\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePoolTagsRequest 请求对象
     * @return BatchCreatePoolTagsResponse
     */
    public BatchCreatePoolTagsResponse batchCreatePoolTags(BatchCreatePoolTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchCreatePoolTags);
    }

    /**
     * 批量创建资源池标签
     *
     * 批量创建资源池标签接口用于为指定资源池添加或更新多个标签信息。该接口适用于以下场景：当需要对资源池进行统一分类管理（如成本归属、环境标识）、批量配置元数据（如项目归属、负责人信息）或更新已有标签值时，管理员可通过此接口一次性操作多个标签。使用该接口的前提条件是目标资源池必须已存在且处于可管理状态，调用者需具备资源池标签管理权限，且提交的标签数据需符合格式规范（如key非空、value长度限制）。操作完成后，系统将为资源池添加新标签或覆盖同名标签的值，且不会影响资源池的其他配置属性。若资源池不存在、用户权限不足、标签格式错误或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;、\&quot;400 Bad Request\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePoolTagsRequest 请求对象
     * @return SyncInvoker<BatchCreatePoolTagsRequest, BatchCreatePoolTagsResponse>
     */
    public SyncInvoker<BatchCreatePoolTagsRequest, BatchCreatePoolTagsResponse> batchCreatePoolTagsInvoker(
        BatchCreatePoolTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchCreatePoolTags, hcClient);
    }

    /**
     * 批量删除内网接入
     *
     * 本接口用于批量删除指定的内网接入点，适用于需要清理多个不再使用的内网接入点的场景。调用此接口前，确保已具备相应的删除权限，并提供一个有效的内网接入点ID列表。删除成功后，所指定的内网接入点将被彻底移除，不再对任何服务生效。如果提供的内网接入点ID列表中包含无效或已删除的ID，将返回相应的异常信息，提示用户检查ID的有效性。此外，如果调用时出现权限不足或其他系统异常，也将返回相应的异常信息，提示用户检查权限或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInferIntranetConnectionsRequest 请求对象
     * @return BatchDeleteInferIntranetConnectionsResponse
     */
    public BatchDeleteInferIntranetConnectionsResponse batchDeleteInferIntranetConnections(
        BatchDeleteInferIntranetConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchDeleteInferIntranetConnections);
    }

    /**
     * 批量删除内网接入
     *
     * 本接口用于批量删除指定的内网接入点，适用于需要清理多个不再使用的内网接入点的场景。调用此接口前，确保已具备相应的删除权限，并提供一个有效的内网接入点ID列表。删除成功后，所指定的内网接入点将被彻底移除，不再对任何服务生效。如果提供的内网接入点ID列表中包含无效或已删除的ID，将返回相应的异常信息，提示用户检查ID的有效性。此外，如果调用时出现权限不足或其他系统异常，也将返回相应的异常信息，提示用户检查权限或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInferIntranetConnectionsRequest 请求对象
     * @return SyncInvoker<BatchDeleteInferIntranetConnectionsRequest, BatchDeleteInferIntranetConnectionsResponse>
     */
    public SyncInvoker<BatchDeleteInferIntranetConnectionsRequest, BatchDeleteInferIntranetConnectionsResponse> batchDeleteInferIntranetConnectionsInvoker(
        BatchDeleteInferIntranetConnectionsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchDeleteInferIntranetConnections, hcClient);
    }

    /**
     * 删除指定服务列表
     *
     * 删除指定服务列表功能允许用户批量删除多个服务，适用于需要清理资源、释放计算能力或管理多个服务的场景。使用此功能前，请确保您具备删除服务的权限，并提供有效的服务ID列表。成功执行后，指定的服务将被终止运行并释放相关资源。若服务ID无效、权限不足或服务状态不允许删除，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInferServicesRequest 请求对象
     * @return BatchDeleteInferServicesResponse
     */
    public BatchDeleteInferServicesResponse batchDeleteInferServices(BatchDeleteInferServicesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchDeleteInferServices);
    }

    /**
     * 删除指定服务列表
     *
     * 删除指定服务列表功能允许用户批量删除多个服务，适用于需要清理资源、释放计算能力或管理多个服务的场景。使用此功能前，请确保您具备删除服务的权限，并提供有效的服务ID列表。成功执行后，指定的服务将被终止运行并释放相关资源。若服务ID无效、权限不足或服务状态不允许删除，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInferServicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteInferServicesRequest, BatchDeleteInferServicesResponse>
     */
    public SyncInvoker<BatchDeleteInferServicesRequest, BatchDeleteInferServicesResponse> batchDeleteInferServicesInvoker(
        BatchDeleteInferServicesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchDeleteInferServices, hcClient);
    }

    /**
     * 批量删除节点
     *
     * 批量删除节点接口用于批量删除指定资源池中的节点。该接口适用于以下场景：当需要清理资源池中的冗余节点、重新分配资源或移除故障节点时，用户可通过此接口批量删除指定的节点。使用该接口的前提条件是资源池已创建且处于可用状态，用户具有删除节点的权限，且资源池中至少保留一个节点。删除操作完成后，指定的节点将被永久移除，资源池中剩余的节点将继续提供服务。若资源池不存在、节点不存在、用户无权限操作或资源池中节点不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoolNodesRequest 请求对象
     * @return BatchDeletePoolNodesResponse
     */
    public BatchDeletePoolNodesResponse batchDeletePoolNodes(BatchDeletePoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchDeletePoolNodes);
    }

    /**
     * 批量删除节点
     *
     * 批量删除节点接口用于批量删除指定资源池中的节点。该接口适用于以下场景：当需要清理资源池中的冗余节点、重新分配资源或移除故障节点时，用户可通过此接口批量删除指定的节点。使用该接口的前提条件是资源池已创建且处于可用状态，用户具有删除节点的权限，且资源池中至少保留一个节点。删除操作完成后，指定的节点将被永久移除，资源池中剩余的节点将继续提供服务。若资源池不存在、节点不存在、用户无权限操作或资源池中节点不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoolNodesRequest 请求对象
     * @return SyncInvoker<BatchDeletePoolNodesRequest, BatchDeletePoolNodesResponse>
     */
    public SyncInvoker<BatchDeletePoolNodesRequest, BatchDeletePoolNodesResponse> batchDeletePoolNodesInvoker(
        BatchDeletePoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchDeletePoolNodes, hcClient);
    }

    /**
     * 批量删除资源池标签
     *
     * 批量删除资源标签接口用于移除指定资源上的多个标签信息。该接口适用于以下场景：当需要清理冗余标签（如过期分类、无效元数据）、统一调整资源分类策略或因权限变更需批量移除标签时，管理员可通过此接口一次性删除多个标签。使用该接口的前提条件是目标资源必须已存在且处于可管理状态，调用者需具备资源标签管理权限，且待删除的标签必须已关联至该资源，系统标签管理服务需正常运行。操作完成后，指定标签将从资源中彻底移除，且不会影响资源的其他配置属性。若资源不存在、用户权限不足、标签未关联或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;、\&quot;400 Bad Request\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoolTagsRequest 请求对象
     * @return BatchDeletePoolTagsResponse
     */
    public BatchDeletePoolTagsResponse batchDeletePoolTags(BatchDeletePoolTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchDeletePoolTags);
    }

    /**
     * 批量删除资源池标签
     *
     * 批量删除资源标签接口用于移除指定资源上的多个标签信息。该接口适用于以下场景：当需要清理冗余标签（如过期分类、无效元数据）、统一调整资源分类策略或因权限变更需批量移除标签时，管理员可通过此接口一次性删除多个标签。使用该接口的前提条件是目标资源必须已存在且处于可管理状态，调用者需具备资源标签管理权限，且待删除的标签必须已关联至该资源，系统标签管理服务需正常运行。操作完成后，指定标签将从资源中彻底移除，且不会影响资源的其他配置属性。若资源不存在、用户权限不足、标签未关联或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;、\&quot;400 Bad Request\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoolTagsRequest 请求对象
     * @return SyncInvoker<BatchDeletePoolTagsRequest, BatchDeletePoolTagsResponse>
     */
    public SyncInvoker<BatchDeletePoolTagsRequest, BatchDeletePoolTagsResponse> batchDeletePoolTagsInvoker(
        BatchDeletePoolTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchDeletePoolTags, hcClient);
    }

    /**
     * 批量对节点功能上锁
     *
     * 批量对节点功能上锁接口用于批量对指定节点的功能进行上锁操作，被上锁的功能在控制台将无法正常使用。该接口适用于以下场景：当需要临时禁用某些节点的功能以防止误操作、进行系统维护或测试时，用户可通过此接口批量对节点功能进行上锁。使用该接口的前提条件是节点功能已存在且用户具有管理员权限。上锁操作完成后，指定节点的功能将在控制台被禁用，无法进行相关操作。若节点功能不存在、用户无权限操作或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLockPoolNodesRequest 请求对象
     * @return BatchLockPoolNodesResponse
     */
    public BatchLockPoolNodesResponse batchLockPoolNodes(BatchLockPoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchLockPoolNodes);
    }

    /**
     * 批量对节点功能上锁
     *
     * 批量对节点功能上锁接口用于批量对指定节点的功能进行上锁操作，被上锁的功能在控制台将无法正常使用。该接口适用于以下场景：当需要临时禁用某些节点的功能以防止误操作、进行系统维护或测试时，用户可通过此接口批量对节点功能进行上锁。使用该接口的前提条件是节点功能已存在且用户具有管理员权限。上锁操作完成后，指定节点的功能将在控制台被禁用，无法进行相关操作。若节点功能不存在、用户无权限操作或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLockPoolNodesRequest 请求对象
     * @return SyncInvoker<BatchLockPoolNodesRequest, BatchLockPoolNodesResponse>
     */
    public SyncInvoker<BatchLockPoolNodesRequest, BatchLockPoolNodesResponse> batchLockPoolNodesInvoker(
        BatchLockPoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchLockPoolNodes, hcClient);
    }

    /**
     * 批量迁移节点
     *
     * 批量迁移节点接口用于在资源池之间批量迁移节点，将节点从一个资源池迁移到另一个资源池。该接口适用于以下场景：当资源池的节点分布不均衡、需要进行集群维护或业务扩展时，用户可通过此接口将指定节点从一个资源池迁移到另一个资源池。使用该接口的前提条件是资源池中至少包含两个节点，且目标资源池具备足够的资源容量（如IP地址等）以接收迁移节点。若资源池只有一个节点、目标集群资源不足、节点状态不支持迁移或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigratePoolNodesRequest 请求对象
     * @return BatchMigratePoolNodesResponse
     */
    public BatchMigratePoolNodesResponse batchMigratePoolNodes(BatchMigratePoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchMigratePoolNodes);
    }

    /**
     * 批量迁移节点
     *
     * 批量迁移节点接口用于在资源池之间批量迁移节点，将节点从一个资源池迁移到另一个资源池。该接口适用于以下场景：当资源池的节点分布不均衡、需要进行集群维护或业务扩展时，用户可通过此接口将指定节点从一个资源池迁移到另一个资源池。使用该接口的前提条件是资源池中至少包含两个节点，且目标资源池具备足够的资源容量（如IP地址等）以接收迁移节点。若资源池只有一个节点、目标集群资源不足、节点状态不支持迁移或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigratePoolNodesRequest 请求对象
     * @return SyncInvoker<BatchMigratePoolNodesRequest, BatchMigratePoolNodesResponse>
     */
    public SyncInvoker<BatchMigratePoolNodesRequest, BatchMigratePoolNodesResponse> batchMigratePoolNodesInvoker(
        BatchMigratePoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchMigratePoolNodes, hcClient);
    }

    /**
     * 批量重启节点
     *
     * 批量重启节点接口用于批量重启指定资源池中的节点。该接口适用于以下场景：当需要对资源池中的节点进行系统更新、配置变更、故障恢复或维护操作时，用户可通过此接口批量重启指定的节点。使用该接口的前提条件是资源池已创建且处于可用状态，节点属于该资源池且处于运行状态，且用户具有重启节点的权限。重启操作完成后，指定的节点将被重新启动，资源池中的其他节点将继续正常运行。若资源池不存在、节点不在资源池中、节点未处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootPoolNodesRequest 请求对象
     * @return BatchRebootPoolNodesResponse
     */
    public BatchRebootPoolNodesResponse batchRebootPoolNodes(BatchRebootPoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchRebootPoolNodes);
    }

    /**
     * 批量重启节点
     *
     * 批量重启节点接口用于批量重启指定资源池中的节点。该接口适用于以下场景：当需要对资源池中的节点进行系统更新、配置变更、故障恢复或维护操作时，用户可通过此接口批量重启指定的节点。使用该接口的前提条件是资源池已创建且处于可用状态，节点属于该资源池且处于运行状态，且用户具有重启节点的权限。重启操作完成后，指定的节点将被重新启动，资源池中的其他节点将继续正常运行。若资源池不存在、节点不在资源池中、节点未处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootPoolNodesRequest 请求对象
     * @return SyncInvoker<BatchRebootPoolNodesRequest, BatchRebootPoolNodesResponse>
     */
    public SyncInvoker<BatchRebootPoolNodesRequest, BatchRebootPoolNodesResponse> batchRebootPoolNodesInvoker(
        BatchRebootPoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchRebootPoolNodes, hcClient);
    }

    /**
     * 重置节点
     *
     * 重置节点接口用于将指定节点恢复到初始状态，清除节点上的数据和配置。该接口适用于以下场景：当节点出现故障、配置错误、需要重新部署或进行系统恢复时，用户可通过此接口重置节点，使其恢复到出厂或初始状态。使用该接口的前提条件是节点已存在且用户具有管理员权限。重置操作完成后，节点上的所有数据和配置将被清除，节点将被重新启动并恢复到初始状态。若节点不存在、用户无权限操作或节点处于不可重置状态（如正在运行任务），接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetPoolNodesRequest 请求对象
     * @return BatchResetPoolNodesResponse
     */
    public BatchResetPoolNodesResponse batchResetPoolNodes(BatchResetPoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchResetPoolNodes);
    }

    /**
     * 重置节点
     *
     * 重置节点接口用于将指定节点恢复到初始状态，清除节点上的数据和配置。该接口适用于以下场景：当节点出现故障、配置错误、需要重新部署或进行系统恢复时，用户可通过此接口重置节点，使其恢复到出厂或初始状态。使用该接口的前提条件是节点已存在且用户具有管理员权限。重置操作完成后，节点上的所有数据和配置将被清除，节点将被重新启动并恢复到初始状态。若节点不存在、用户无权限操作或节点处于不可重置状态（如正在运行任务），接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetPoolNodesRequest 请求对象
     * @return SyncInvoker<BatchResetPoolNodesRequest, BatchResetPoolNodesResponse>
     */
    public SyncInvoker<BatchResetPoolNodesRequest, BatchResetPoolNodesResponse> batchResetPoolNodesInvoker(
        BatchResetPoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchResetPoolNodes, hcClient);
    }

    /**
     * 节点规格变更
     *
     * 节点规格变更接口用于调整指定节点的规格（如步长），例如将节点从8节点超节点扩容到16节点超节点。该接口适用于以下场景：当需要根据业务需求调整节点的资源容量、优化资源利用率或进行系统升级时，用户可通过此接口变更节点的规格。使用该接口的前提条件是节点已创建且处于可变更状态，目标规格在支持范围内，且用户具有管理员权限。规格变更完成后，节点的资源容量将按新规格调整，相关服务和配置将重新加载以适应新的规格。若节点不存在、节点状态不允许变更、目标规格不支持或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResizePoolNodesRequest 请求对象
     * @return BatchResizePoolNodesResponse
     */
    public BatchResizePoolNodesResponse batchResizePoolNodes(BatchResizePoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchResizePoolNodes);
    }

    /**
     * 节点规格变更
     *
     * 节点规格变更接口用于调整指定节点的规格（如步长），例如将节点从8节点超节点扩容到16节点超节点。该接口适用于以下场景：当需要根据业务需求调整节点的资源容量、优化资源利用率或进行系统升级时，用户可通过此接口变更节点的规格。使用该接口的前提条件是节点已创建且处于可变更状态，目标规格在支持范围内，且用户具有管理员权限。规格变更完成后，节点的资源容量将按新规格调整，相关服务和配置将重新加载以适应新的规格。若节点不存在、节点状态不允许变更、目标规格不支持或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResizePoolNodesRequest 请求对象
     * @return SyncInvoker<BatchResizePoolNodesRequest, BatchResizePoolNodesResponse>
     */
    public SyncInvoker<BatchResizePoolNodesRequest, BatchResizePoolNodesResponse> batchResizePoolNodesInvoker(
        BatchResizePoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchResizePoolNodes, hcClient);
    }

    /**
     * 批量解绑应用密钥
     *
     * 本接口用于将已绑定的apikey从指定服务中批量解绑，适用于需要撤销多个apikey对特定服务的访问权限的场景。调用此接口前，确保已获取到需要解绑的多个apikey，并确认这些apikey当前绑定在指定服务上。解绑成功后，这些apikey将不再对指定服务生效，但仍可继续用于其他服务。如果尝试解绑不存在或未绑定到指定服务的apikey，将返回相应的异常信息，提示用户检查apikey的有效性和绑定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnbindInferApiKeysRequest 请求对象
     * @return BatchUnbindInferApiKeysResponse
     */
    public BatchUnbindInferApiKeysResponse batchUnbindInferApiKeys(BatchUnbindInferApiKeysRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchUnbindInferApiKeys);
    }

    /**
     * 批量解绑应用密钥
     *
     * 本接口用于将已绑定的apikey从指定服务中批量解绑，适用于需要撤销多个apikey对特定服务的访问权限的场景。调用此接口前，确保已获取到需要解绑的多个apikey，并确认这些apikey当前绑定在指定服务上。解绑成功后，这些apikey将不再对指定服务生效，但仍可继续用于其他服务。如果尝试解绑不存在或未绑定到指定服务的apikey，将返回相应的异常信息，提示用户检查apikey的有效性和绑定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnbindInferApiKeysRequest 请求对象
     * @return SyncInvoker<BatchUnbindInferApiKeysRequest, BatchUnbindInferApiKeysResponse>
     */
    public SyncInvoker<BatchUnbindInferApiKeysRequest, BatchUnbindInferApiKeysResponse> batchUnbindInferApiKeysInvoker(
        BatchUnbindInferApiKeysRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchUnbindInferApiKeys, hcClient);
    }

    /**
     * 批量对节点功能解锁
     *
     * 批量对节点功能解锁接口用于批量解除指定节点功能的锁定状态，使被上锁的功能在控制台恢复正常可用状态。该接口适用于以下场景：当需要恢复被锁定的节点功能以正常使用、完成系统维护或测试后，用户可通过此接口批量对节点功能进行解锁。使用该接口的前提条件是节点功能已被上锁且用户具有管理员权限。解锁操作完成后，指定节点的功能将在控制台恢复正常，用户可以正常使用相关功能。若节点功能未被锁定、用户无权限操作或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnlockPoolNodesRequest 请求对象
     * @return BatchUnlockPoolNodesResponse
     */
    public BatchUnlockPoolNodesResponse batchUnlockPoolNodes(BatchUnlockPoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchUnlockPoolNodes);
    }

    /**
     * 批量对节点功能解锁
     *
     * 批量对节点功能解锁接口用于批量解除指定节点功能的锁定状态，使被上锁的功能在控制台恢复正常可用状态。该接口适用于以下场景：当需要恢复被锁定的节点功能以正常使用、完成系统维护或测试后，用户可通过此接口批量对节点功能进行解锁。使用该接口的前提条件是节点功能已被上锁且用户具有管理员权限。解锁操作完成后，指定节点的功能将在控制台恢复正常，用户可以正常使用相关功能。若节点功能未被锁定、用户无权限操作或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnlockPoolNodesRequest 请求对象
     * @return SyncInvoker<BatchUnlockPoolNodesRequest, BatchUnlockPoolNodesResponse>
     */
    public SyncInvoker<BatchUnlockPoolNodesRequest, BatchUnlockPoolNodesResponse> batchUnlockPoolNodesInvoker(
        BatchUnlockPoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchUnlockPoolNodes, hcClient);
    }

    /**
     * 批量更新节点
     *
     * 批量更新节点接口用于同时修改多个节点的配置或属性，支持批量操作时各节点独立执行更新流程。该接口适用于以下场景：当用户需统一升级节点软件版本、批量处理选中节点的资源标签、调整资源分配策略、应用安全补丁或同步配置变更时，可通过此接口批量更新目标节点，确保每个节点的更新过程互不影响。使用该接口的前提条件包括：目标节点已存在且用户具备管理员权限，节点需处于可操作状态（如非锁定或维护中），批量操作时需提供有效的节点列表及更新参数（如配置项、版本号等）作为输入。操作完成后，指定节点将应用新配置并更新状态为可用，原有配置将被覆盖。若节点不存在、用户权限不足、节点状态异常（如正在维护）、更新参数不合规或输入参数缺失，接口将返回对应错误信息（如404未找到节点、403权限拒绝、400参数校验失败等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePoolNodesRequest 请求对象
     * @return BatchUpdatePoolNodesResponse
     */
    public BatchUpdatePoolNodesResponse batchUpdatePoolNodes(BatchUpdatePoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchUpdatePoolNodes);
    }

    /**
     * 批量更新节点
     *
     * 批量更新节点接口用于同时修改多个节点的配置或属性，支持批量操作时各节点独立执行更新流程。该接口适用于以下场景：当用户需统一升级节点软件版本、批量处理选中节点的资源标签、调整资源分配策略、应用安全补丁或同步配置变更时，可通过此接口批量更新目标节点，确保每个节点的更新过程互不影响。使用该接口的前提条件包括：目标节点已存在且用户具备管理员权限，节点需处于可操作状态（如非锁定或维护中），批量操作时需提供有效的节点列表及更新参数（如配置项、版本号等）作为输入。操作完成后，指定节点将应用新配置并更新状态为可用，原有配置将被覆盖。若节点不存在、用户权限不足、节点状态异常（如正在维护）、更新参数不合规或输入参数缺失，接口将返回对应错误信息（如404未找到节点、403权限拒绝、400参数校验失败等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePoolNodesRequest 请求对象
     * @return SyncInvoker<BatchUpdatePoolNodesRequest, BatchUpdatePoolNodesResponse>
     */
    public SyncInvoker<BatchUpdatePoolNodesRequest, BatchUpdatePoolNodesResponse> batchUpdatePoolNodesInvoker(
        BatchUpdatePoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchUpdatePoolNodes, hcClient);
    }

    /**
     * 绑定应用密钥
     *
     * 本接口用于将生成的apikey与指定服务进行绑定，适用于应用程序需要调用特定服务的场景。调用此接口前，确保已成功创建服务实例，并获取到有效的apikey。绑定成功后，apikey将作为服务调用时的身份验证凭证，确保仅授权用户能够访问该服务。如果尝试绑定已失效的apikey，将返回相应的异常信息，提示用户检查apikey的有效性和绑定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindInferApiKeyRequest 请求对象
     * @return BindInferApiKeyResponse
     */
    public BindInferApiKeyResponse bindInferApiKey(BindInferApiKeyRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.bindInferApiKey);
    }

    /**
     * 绑定应用密钥
     *
     * 本接口用于将生成的apikey与指定服务进行绑定，适用于应用程序需要调用特定服务的场景。调用此接口前，确保已成功创建服务实例，并获取到有效的apikey。绑定成功后，apikey将作为服务调用时的身份验证凭证，确保仅授权用户能够访问该服务。如果尝试绑定已失效的apikey，将返回相应的异常信息，提示用户检查apikey的有效性和绑定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindInferApiKeyRequest 请求对象
     * @return SyncInvoker<BindInferApiKeyRequest, BindInferApiKeyResponse>
     */
    public SyncInvoker<BindInferApiKeyRequest, BindInferApiKeyResponse> bindInferApiKeyInvoker(
        BindInferApiKeyRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.bindInferApiKey, hcClient);
    }

    /**
     * 中断服务部署
     *
     * 中断服务部署接口用于中断处于“升级中”或“部署中”状态的部署，使其快速停止。该接口适用于以下场景：当部署出现严重故障需要立即修复、资源需要快速释放以部署更高优先级的部署，或在测试环境中需要快速迭代时，用户可通过此接口中断指定部署。使用该接口的前提条件是部署当前状态为“升级中”或“部署中”，且用户具有中断部署的权限。若部署为“部署中”状态，执行中断操作，部署状态将变成“停止”，相关资源将被释放，且终端操作将被记录；若部署为“升级中”状态，执行中断操作，部署状态将变成“运行中”。若部署当前状态不是“升级中”或“部署中”，若用户无权限操作，接口将返回相应的错误信息。若部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelInferDeploymentRequest 请求对象
     * @return CancelInferDeploymentResponse
     */
    public CancelInferDeploymentResponse cancelInferDeployment(CancelInferDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.cancelInferDeployment);
    }

    /**
     * 中断服务部署
     *
     * 中断服务部署接口用于中断处于“升级中”或“部署中”状态的部署，使其快速停止。该接口适用于以下场景：当部署出现严重故障需要立即修复、资源需要快速释放以部署更高优先级的部署，或在测试环境中需要快速迭代时，用户可通过此接口中断指定部署。使用该接口的前提条件是部署当前状态为“升级中”或“部署中”，且用户具有中断部署的权限。若部署为“部署中”状态，执行中断操作，部署状态将变成“停止”，相关资源将被释放，且终端操作将被记录；若部署为“升级中”状态，执行中断操作，部署状态将变成“运行中”。若部署当前状态不是“升级中”或“部署中”，若用户无权限操作，接口将返回相应的错误信息。若部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelInferDeploymentRequest 请求对象
     * @return SyncInvoker<CancelInferDeploymentRequest, CancelInferDeploymentResponse>
     */
    public SyncInvoker<CancelInferDeploymentRequest, CancelInferDeploymentResponse> cancelInferDeploymentInvoker(
        CancelInferDeploymentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.cancelInferDeployment, hcClient);
    }

    /**
     * 更新算法
     *
     * 更新算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlgorithmRequest 请求对象
     * @return ChangeAlgorithmResponse
     */
    public ChangeAlgorithmResponse changeAlgorithm(ChangeAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.changeAlgorithm);
    }

    /**
     * 更新算法
     *
     * 更新算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlgorithmRequest 请求对象
     * @return SyncInvoker<ChangeAlgorithmRequest, ChangeAlgorithmResponse>
     */
    public SyncInvoker<ChangeAlgorithmRequest, ChangeAlgorithmResponse> changeAlgorithmInvoker(
        ChangeAlgorithmRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.changeAlgorithm, hcClient);
    }

    /**
     * 更新训练实验信息
     *
     * 通过实验ID更新训练实验信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTrainingExperimentRequest 请求对象
     * @return ChangeTrainingExperimentResponse
     */
    public ChangeTrainingExperimentResponse changeTrainingExperiment(ChangeTrainingExperimentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.changeTrainingExperiment);
    }

    /**
     * 更新训练实验信息
     *
     * 通过实验ID更新训练实验信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTrainingExperimentRequest 请求对象
     * @return SyncInvoker<ChangeTrainingExperimentRequest, ChangeTrainingExperimentResponse>
     */
    public SyncInvoker<ChangeTrainingExperimentRequest, ChangeTrainingExperimentResponse> changeTrainingExperimentInvoker(
        ChangeTrainingExperimentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.changeTrainingExperiment, hcClient);
    }

    /**
     * 更新训练作业描述
     *
     * 更新训练作业描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTrainingJobDescriptionRequest 请求对象
     * @return ChangeTrainingJobDescriptionResponse
     */
    public ChangeTrainingJobDescriptionResponse changeTrainingJobDescription(
        ChangeTrainingJobDescriptionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.changeTrainingJobDescription);
    }

    /**
     * 更新训练作业描述
     *
     * 更新训练作业描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTrainingJobDescriptionRequest 请求对象
     * @return SyncInvoker<ChangeTrainingJobDescriptionRequest, ChangeTrainingJobDescriptionResponse>
     */
    public SyncInvoker<ChangeTrainingJobDescriptionRequest, ChangeTrainingJobDescriptionResponse> changeTrainingJobDescriptionInvoker(
        ChangeTrainingJobDescriptionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.changeTrainingJobDescription, hcClient);
    }

    /**
     * 校验训练实验名称
     *
     * 校验训练实验名称接口用于新增训练实验前校验训练实验名称是否重复。
     * 该接口适用于以下场景：当用户需要创建新的训练实验时，可以通过此接口校验定义的实验名称是否已存在。使用该接口的前提条件是用户具有创建实验的权限。查询操作完成后，将返回实验名称是否重复的结果。若用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTrainingExperimentRequest 请求对象
     * @return CheckTrainingExperimentResponse
     */
    public CheckTrainingExperimentResponse checkTrainingExperiment(CheckTrainingExperimentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.checkTrainingExperiment);
    }

    /**
     * 校验训练实验名称
     *
     * 校验训练实验名称接口用于新增训练实验前校验训练实验名称是否重复。
     * 该接口适用于以下场景：当用户需要创建新的训练实验时，可以通过此接口校验定义的实验名称是否已存在。使用该接口的前提条件是用户具有创建实验的权限。查询操作完成后，将返回实验名称是否重复的结果。若用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTrainingExperimentRequest 请求对象
     * @return SyncInvoker<CheckTrainingExperimentRequest, CheckTrainingExperimentResponse>
     */
    public SyncInvoker<CheckTrainingExperimentRequest, CheckTrainingExperimentResponse> checkTrainingExperimentInvoker(
        CheckTrainingExperimentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.checkTrainingExperiment, hcClient);
    }

    /**
     * 通过标签查询资源数量
     *
     * 该接口适用于需要统计和获取符合特定标签或资源名称条件的资源数量的场景，例如在资源管理和监控中，用户可以通过指定标签或资源名称进行精确或模糊查询来统计资源数量。通过调用此接口，用户可以基于多个标签或资源名称进行查询，若不传标签则返回所有资源的总数。用户必须具有足够的权限，且目标资源需存在。查询成功后，返回符合条件的资源总数；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInferServicesByTagsRequest 请求对象
     * @return CountInferServicesByTagsResponse
     */
    public CountInferServicesByTagsResponse countInferServicesByTags(CountInferServicesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.countInferServicesByTags);
    }

    /**
     * 通过标签查询资源数量
     *
     * 该接口适用于需要统计和获取符合特定标签或资源名称条件的资源数量的场景，例如在资源管理和监控中，用户可以通过指定标签或资源名称进行精确或模糊查询来统计资源数量。通过调用此接口，用户可以基于多个标签或资源名称进行查询，若不传标签则返回所有资源的总数。用户必须具有足够的权限，且目标资源需存在。查询成功后，返回符合条件的资源总数；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInferServicesByTagsRequest 请求对象
     * @return SyncInvoker<CountInferServicesByTagsRequest, CountInferServicesByTagsResponse>
     */
    public SyncInvoker<CountInferServicesByTagsRequest, CountInferServicesByTagsResponse> countInferServicesByTagsInvoker(
        CountInferServicesByTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.countInferServicesByTags, hcClient);
    }

    /**
     * 创建算法
     *
     * 创建一个算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmRequest 请求对象
     * @return CreateAlgorithmResponse
     */
    public CreateAlgorithmResponse createAlgorithm(CreateAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createAlgorithm);
    }

    /**
     * 创建算法
     *
     * 创建一个算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmRequest 请求对象
     * @return SyncInvoker<CreateAlgorithmRequest, CreateAlgorithmResponse>
     */
    public SyncInvoker<CreateAlgorithmRequest, CreateAlgorithmResponse> createAlgorithmInvoker(
        CreateAlgorithmRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createAlgorithm, hcClient);
    }

    /**
     * 创建发布算法资产
     *
     * 创建发布算法资产接口用于在算法管理中创建并发布新的算法资产。
     * 该接口适用于以下场景：当用户开发完成新的算法并希望将其发布为可复用的算法资产时，可以通过此接口创建并发布算法资产。使用该接口的前提条件是用户已登录且具有创建和发布算法资产的权限。创建发布操作完成后，系统将生成新的算法资产，并将其添加到算法资产列表中，用户可以通过算法ID进行管理和调用。若用户无权限操作、算法资产信息不完整或已存在相同名称的算法资产，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmVersionToGalleryRequest 请求对象
     * @return CreateAlgorithmVersionToGalleryResponse
     */
    public CreateAlgorithmVersionToGalleryResponse createAlgorithmVersionToGallery(
        CreateAlgorithmVersionToGalleryRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createAlgorithmVersionToGallery);
    }

    /**
     * 创建发布算法资产
     *
     * 创建发布算法资产接口用于在算法管理中创建并发布新的算法资产。
     * 该接口适用于以下场景：当用户开发完成新的算法并希望将其发布为可复用的算法资产时，可以通过此接口创建并发布算法资产。使用该接口的前提条件是用户已登录且具有创建和发布算法资产的权限。创建发布操作完成后，系统将生成新的算法资产，并将其添加到算法资产列表中，用户可以通过算法ID进行管理和调用。若用户无权限操作、算法资产信息不完整或已存在相同名称的算法资产，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmVersionToGalleryRequest 请求对象
     * @return SyncInvoker<CreateAlgorithmVersionToGalleryRequest, CreateAlgorithmVersionToGalleryResponse>
     */
    public SyncInvoker<CreateAlgorithmVersionToGalleryRequest, CreateAlgorithmVersionToGalleryResponse> createAlgorithmVersionToGalleryInvoker(
        CreateAlgorithmVersionToGalleryRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createAlgorithmVersionToGallery, hcClient);
    }

    /**
     * 配置授权
     *
     * 配置授权接口用于配置ModelArts的授权。该接口适用于以下场景：当需要为IAM子用户设置访问ModelArts的权限时，管理员可通过此接口配置授权。使用该接口的前提条件是管理员具备IAM系统的Security Administrator权限，并且需要为子用户设置访问密钥。配置完成后，子用户将被授予访问ModelArts资源的权限，从而能够正常使用训练管理、开发环境、数据管理、在线服务等功能。若管理员无权限操作或子用户不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizationRequest 请求对象
     * @return CreateAuthorizationResponse
     */
    public CreateAuthorizationResponse createAuthorization(CreateAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createAuthorization);
    }

    /**
     * 配置授权
     *
     * 配置授权接口用于配置ModelArts的授权。该接口适用于以下场景：当需要为IAM子用户设置访问ModelArts的权限时，管理员可通过此接口配置授权。使用该接口的前提条件是管理员具备IAM系统的Security Administrator权限，并且需要为子用户设置访问密钥。配置完成后，子用户将被授予访问ModelArts资源的权限，从而能够正常使用训练管理、开发环境、数据管理、在线服务等功能。若管理员无权限操作或子用户不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizationRequest 请求对象
     * @return SyncInvoker<CreateAuthorizationRequest, CreateAuthorizationResponse>
     */
    public SyncInvoker<CreateAuthorizationRequest, CreateAuthorizationResponse> createAuthorizationInvoker(
        CreateAuthorizationRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createAuthorization, hcClient);
    }

    /**
     * 创建应用密钥
     *
     * 本接口用于在系统中创建一个新的API_KEY，适用于需要为用户或应用程序生成访问凭证的场景。调用此接口前，确保已具备相应的创建权限，并提供必要的参数，如用户ID或应用程序ID。创建成功后，系统将生成一个唯一的API_KEY，并返回该API_KEY的详细信息，包括API_KEY值、创建时间等。如果提供的参数无效或系统中已存在相同的API_KEY，将返回相应的异常信息，提示用户检查输入数据的有效性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferApiKeyRequest 请求对象
     * @return CreateInferApiKeyResponse
     */
    public CreateInferApiKeyResponse createInferApiKey(CreateInferApiKeyRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createInferApiKey);
    }

    /**
     * 创建应用密钥
     *
     * 本接口用于在系统中创建一个新的API_KEY，适用于需要为用户或应用程序生成访问凭证的场景。调用此接口前，确保已具备相应的创建权限，并提供必要的参数，如用户ID或应用程序ID。创建成功后，系统将生成一个唯一的API_KEY，并返回该API_KEY的详细信息，包括API_KEY值、创建时间等。如果提供的参数无效或系统中已存在相同的API_KEY，将返回相应的异常信息，提示用户检查输入数据的有效性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferApiKeyRequest 请求对象
     * @return SyncInvoker<CreateInferApiKeyRequest, CreateInferApiKeyResponse>
     */
    public SyncInvoker<CreateInferApiKeyRequest, CreateInferApiKeyResponse> createInferApiKeyInvoker(
        CreateInferApiKeyRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createInferApiKey, hcClient);
    }

    /**
     * 添加部署
     *
     * 将模型部署为在线服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferDeploymentRequest 请求对象
     * @return CreateInferDeploymentResponse
     */
    public CreateInferDeploymentResponse createInferDeployment(CreateInferDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createInferDeployment);
    }

    /**
     * 添加部署
     *
     * 将模型部署为在线服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferDeploymentRequest 请求对象
     * @return SyncInvoker<CreateInferDeploymentRequest, CreateInferDeploymentResponse>
     */
    public SyncInvoker<CreateInferDeploymentRequest, CreateInferDeploymentResponse> createInferDeploymentInvoker(
        CreateInferDeploymentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createInferDeployment, hcClient);
    }

    /**
     * 创建内网接入
     *
     * 本接口用于在指定Region中创建内网接入点，适用于需要为应用程序或服务配置内网连接的场景。调用此接口前，确保已具备相应的创建权限，并提供必要的参数，如Region ID、内网接入点名称和网络配置信息。创建成功后，系统将生成一个内网接入点，并返回该接入点的详细信息，包括接入点ID、创建时间、状态等。如果提供的参数无效或内网接入配置冲突，将返回相应的异常信息，提示用户检查输入数据的有效性和配置冲突情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferIntranetConnectionRequest 请求对象
     * @return CreateInferIntranetConnectionResponse
     */
    public CreateInferIntranetConnectionResponse createInferIntranetConnection(
        CreateInferIntranetConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createInferIntranetConnection);
    }

    /**
     * 创建内网接入
     *
     * 本接口用于在指定Region中创建内网接入点，适用于需要为应用程序或服务配置内网连接的场景。调用此接口前，确保已具备相应的创建权限，并提供必要的参数，如Region ID、内网接入点名称和网络配置信息。创建成功后，系统将生成一个内网接入点，并返回该接入点的详细信息，包括接入点ID、创建时间、状态等。如果提供的参数无效或内网接入配置冲突，将返回相应的异常信息，提示用户检查输入数据的有效性和配置冲突情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferIntranetConnectionRequest 请求对象
     * @return SyncInvoker<CreateInferIntranetConnectionRequest, CreateInferIntranetConnectionResponse>
     */
    public SyncInvoker<CreateInferIntranetConnectionRequest, CreateInferIntranetConnectionResponse> createInferIntranetConnectionInvoker(
        CreateInferIntranetConnectionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createInferIntranetConnection, hcClient);
    }

    /**
     * 创建服务
     *
     * 将模型部署为在线服务，适用于用户在开发或运维过程中需要将训练好的模型部署为在线服务，以便通过API或HTTP接口提供预测或处理能力的场景。调用此接口前，用户必须具有创建服务的权限，并提供合法的模型镜像路径和完整的服务配置信息（如服务名称、模型镜像路径、资源配置、升级配置等）。调用成功后，系统将成功创建并部署服务，服务状态变为“部署中”，并生成服务的唯一ID返回给用户。服务的详细信息（如状态、创建时间、更新时间等）也会记录在系统中。如果用户没有创建服务的权限，或提供的模型镜像路径不合法，或服务配置信息不完整，调用将返回相应的错误信息。如果系统在部署过程中遇到资源不足或其他内部错误，也将返回错误信息并记录日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferServiceRequest 请求对象
     * @return CreateInferServiceResponse
     */
    public CreateInferServiceResponse createInferService(CreateInferServiceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createInferService);
    }

    /**
     * 创建服务
     *
     * 将模型部署为在线服务，适用于用户在开发或运维过程中需要将训练好的模型部署为在线服务，以便通过API或HTTP接口提供预测或处理能力的场景。调用此接口前，用户必须具有创建服务的权限，并提供合法的模型镜像路径和完整的服务配置信息（如服务名称、模型镜像路径、资源配置、升级配置等）。调用成功后，系统将成功创建并部署服务，服务状态变为“部署中”，并生成服务的唯一ID返回给用户。服务的详细信息（如状态、创建时间、更新时间等）也会记录在系统中。如果用户没有创建服务的权限，或提供的模型镜像路径不合法，或服务配置信息不完整，调用将返回相应的错误信息。如果系统在部署过程中遇到资源不足或其他内部错误，也将返回错误信息并记录日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferServiceRequest 请求对象
     * @return SyncInvoker<CreateInferServiceRequest, CreateInferServiceResponse>
     */
    public SyncInvoker<CreateInferServiceRequest, CreateInferServiceResponse> createInferServiceInvoker(
        CreateInferServiceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createInferService, hcClient);
    }

    /**
     * 添加标签
     *
     * 该接口适用于需要为资源（如模型、数据集、服务等）添加元数据标签的场景，例如在资源管理或分类中，用户可以通过添加标签来标注资源的用途、状态或其他属性。通过调用此接口，用户可以批量添加标签，如果标签key已存在，则更新其value。用户必须具有足够的权限，且目标资源需存在。添加成功后，资源将包含新的标签信息；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferServiceTagRequest 请求对象
     * @return CreateInferServiceTagResponse
     */
    public CreateInferServiceTagResponse createInferServiceTag(CreateInferServiceTagRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createInferServiceTag);
    }

    /**
     * 添加标签
     *
     * 该接口适用于需要为资源（如模型、数据集、服务等）添加元数据标签的场景，例如在资源管理或分类中，用户可以通过添加标签来标注资源的用途、状态或其他属性。通过调用此接口，用户可以批量添加标签，如果标签key已存在，则更新其value。用户必须具有足够的权限，且目标资源需存在。添加成功后，资源将包含新的标签信息；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferServiceTagRequest 请求对象
     * @return SyncInvoker<CreateInferServiceTagRequest, CreateInferServiceTagResponse>
     */
    public SyncInvoker<CreateInferServiceTagRequest, CreateInferServiceTagResponse> createInferServiceTagInvoker(
        CreateInferServiceTagRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createInferServiceTag, hcClient);
    }

    /**
     * 创建ModelArts委托
     *
     * 创建ModelArts委托接口用于创建包含OBS、SWR、IEF等依赖服务的ModelArts委托。该接口适用于以下场景：当需要配置ModelArts访问OBS、SWR、IEF等服务的权限时，用户可通过此接口创建委托。使用该接口的前提条件是用户具备创建委托的权限，并且需要在IAM系统中具备相应的权限。创建完成后，ModelArts将被授权访问OBS、SWR、IEF等服务，从而能够正常执行数据存储、镜像拉取、模型部署等功能。若用户无权限创建委托或依赖服务未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelArtsAgencyRequest 请求对象
     * @return CreateModelArtsAgencyResponse
     */
    public CreateModelArtsAgencyResponse createModelArtsAgency(CreateModelArtsAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createModelArtsAgency);
    }

    /**
     * 创建ModelArts委托
     *
     * 创建ModelArts委托接口用于创建包含OBS、SWR、IEF等依赖服务的ModelArts委托。该接口适用于以下场景：当需要配置ModelArts访问OBS、SWR、IEF等服务的权限时，用户可通过此接口创建委托。使用该接口的前提条件是用户具备创建委托的权限，并且需要在IAM系统中具备相应的权限。创建完成后，ModelArts将被授权访问OBS、SWR、IEF等服务，从而能够正常执行数据存储、镜像拉取、模型部署等功能。若用户无权限创建委托或依赖服务未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelArtsAgencyRequest 请求对象
     * @return SyncInvoker<CreateModelArtsAgencyRequest, CreateModelArtsAgencyResponse>
     */
    public SyncInvoker<CreateModelArtsAgencyRequest, CreateModelArtsAgencyResponse> createModelArtsAgencyInvoker(
        CreateModelArtsAgencyRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createModelArtsAgency, hcClient);
    }

    /**
     * 创建网络资源
     *
     * 创建网络资源接口用于在系统中创建新的网络资源。该接口适用于以下场景：当需要为业务扩展、资源规划或网络架构调整时，用户可通过此接口创建新的网络资源，如虚拟网络、子网或路由等。使用该接口的前提条件是用户具有管理员权限，并且系统中具备足够的资源支持新网络资源的创建。创建操作完成后，新的网络资源将被成功添加到系统中，并可用于后续的业务配置。若用户无权限、资源不足或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkRequest 请求对象
     * @return CreateNetworkResponse
     */
    public CreateNetworkResponse createNetwork(CreateNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createNetwork);
    }

    /**
     * 创建网络资源
     *
     * 创建网络资源接口用于在系统中创建新的网络资源。该接口适用于以下场景：当需要为业务扩展、资源规划或网络架构调整时，用户可通过此接口创建新的网络资源，如虚拟网络、子网或路由等。使用该接口的前提条件是用户具有管理员权限，并且系统中具备足够的资源支持新网络资源的创建。创建操作完成后，新的网络资源将被成功添加到系统中，并可用于后续的业务配置。若用户无权限、资源不足或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkRequest 请求对象
     * @return SyncInvoker<CreateNetworkRequest, CreateNetworkResponse>
     */
    public SyncInvoker<CreateNetworkRequest, CreateNetworkResponse> createNetworkInvoker(CreateNetworkRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createNetwork, hcClient);
    }

    /**
     * 创建节点池
     *
     * 创建节点池接口用于创建新的节点池。该接口适用于以下场景：当需要扩展计算资源、优化资源分配或部署新的服务时，用户可通过此接口创建指定配置的节点池。使用该接口的前提条件是用户具有管理员权限且节点池的配置参数（如节点数量、规格、网络配置等）已正确设置。创建操作完成后，节点池将被成功创建并处于可用状态，相关节点信息将被记录。若用户无权限操作、配置参数错误或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNodePoolRequest 请求对象
     * @return CreateNodePoolResponse
     */
    public CreateNodePoolResponse createNodePool(CreateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createNodePool);
    }

    /**
     * 创建节点池
     *
     * 创建节点池接口用于创建新的节点池。该接口适用于以下场景：当需要扩展计算资源、优化资源分配或部署新的服务时，用户可通过此接口创建指定配置的节点池。使用该接口的前提条件是用户具有管理员权限且节点池的配置参数（如节点数量、规格、网络配置等）已正确设置。创建操作完成后，节点池将被成功创建并处于可用状态，相关节点信息将被记录。若用户无权限操作、配置参数错误或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNodePoolRequest 请求对象
     * @return SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>
     */
    public SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse> createNodePoolInvoker(
        CreateNodePoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createNodePool, hcClient);
    }

    /**
     * 创建资源池的订单id
     *
     * 创建资源池订单ID接口用于生成资源池申请的订单标识。该接口适用于以下场景：当用户需要申请新资源池时（如业务扩展、资源不足或临时资源需求），可通过此接口提交按需转包周期订单的创建请求。使用该接口的前提条件是用户需具备资源申请权限，提交的资源池配置参数（如资源类型、容量、周期等）需符合系统校验规则，且当前仅支持按需转包周期订单类型。订单创建成功后，系统将生成唯一订单ID并触发后续资源分配流程，同时记录操作日志。若用户权限不足、配置参数缺失/冲突（如容量超出配额）、订单类型不支持或系统资源不足，接口将返回对应错误码及提示信息，且不会生成订单ID或占用资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderIdRequest 请求对象
     * @return CreateOrderIdResponse
     */
    public CreateOrderIdResponse createOrderId(CreateOrderIdRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createOrderId);
    }

    /**
     * 创建资源池的订单id
     *
     * 创建资源池订单ID接口用于生成资源池申请的订单标识。该接口适用于以下场景：当用户需要申请新资源池时（如业务扩展、资源不足或临时资源需求），可通过此接口提交按需转包周期订单的创建请求。使用该接口的前提条件是用户需具备资源申请权限，提交的资源池配置参数（如资源类型、容量、周期等）需符合系统校验规则，且当前仅支持按需转包周期订单类型。订单创建成功后，系统将生成唯一订单ID并触发后续资源分配流程，同时记录操作日志。若用户权限不足、配置参数缺失/冲突（如容量超出配额）、订单类型不支持或系统资源不足，接口将返回对应错误码及提示信息，且不会生成订单ID或占用资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderIdRequest 请求对象
     * @return SyncInvoker<CreateOrderIdRequest, CreateOrderIdResponse>
     */
    public SyncInvoker<CreateOrderIdRequest, CreateOrderIdResponse> createOrderIdInvoker(CreateOrderIdRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createOrderId, hcClient);
    }

    /**
     * 创建资源池
     *
     * 创建资源池接口用于在系统中创建新的资源池。该接口适用于以下场景：当需要为新业务分配资源、优化资源管理或进行资源隔离时，用户可通过此接口创建新的资源池，用于管理计算、存储、网络等资源。使用该接口的前提条件是用户具有管理员权限，并且系统中具备足够的资源支持新资源池的创建。创建操作完成后，新的资源池将被成功添加到系统中，并处于可用状态，可支持后续的资源分配和管理。若用户无权限、系统资源不足或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolRequest 请求对象
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createPool);
    }

    /**
     * 创建资源池
     *
     * 创建资源池接口用于在系统中创建新的资源池。该接口适用于以下场景：当需要为新业务分配资源、优化资源管理或进行资源隔离时，用户可通过此接口创建新的资源池，用于管理计算、存储、网络等资源。使用该接口的前提条件是用户具有管理员权限，并且系统中具备足够的资源支持新资源池的创建。创建操作完成后，新的资源池将被成功添加到系统中，并处于可用状态，可支持后续的资源分配和管理。若用户无权限、系统资源不足或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolRequest 请求对象
     * @return SyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public SyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolInvoker(CreatePoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createPool, hcClient);
    }

    /**
     * 创建插件
     *
     * 创建插件实例接口用于在系统中创建一个新的插件实例。该接口适用于以下场景：当需要扩展系统功能、部署新的插件、更新现有插件配置或测试插件时，用户可通过此接口创建指定插件的实例。使用该接口的前提条件是插件已存在且用户具有管理员权限或插件管理权限。创建操作完成后，插件实例将被成功创建并处于可用状态，相关配置信息将被记录。若插件不存在、用户无权限操作、配置参数错误或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolPluginRequest 请求对象
     * @return CreatePoolPluginResponse
     */
    public CreatePoolPluginResponse createPoolPlugin(CreatePoolPluginRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createPoolPlugin);
    }

    /**
     * 创建插件
     *
     * 创建插件实例接口用于在系统中创建一个新的插件实例。该接口适用于以下场景：当需要扩展系统功能、部署新的插件、更新现有插件配置或测试插件时，用户可通过此接口创建指定插件的实例。使用该接口的前提条件是插件已存在且用户具有管理员权限或插件管理权限。创建操作完成后，插件实例将被成功创建并处于可用状态，相关配置信息将被记录。若插件不存在、用户无权限操作、配置参数错误或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolPluginRequest 请求对象
     * @return SyncInvoker<CreatePoolPluginRequest, CreatePoolPluginResponse>
     */
    public SyncInvoker<CreatePoolPluginRequest, CreatePoolPluginResponse> createPoolPluginInvoker(
        CreatePoolPluginRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createPoolPlugin, hcClient);
    }

    /**
     * 创建训练作业镜像保存任务
     *
     * 创建训练作业镜像保存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSaveImageJobRequest 请求对象
     * @return CreateSaveImageJobResponse
     */
    public CreateSaveImageJobResponse createSaveImageJob(CreateSaveImageJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createSaveImageJob);
    }

    /**
     * 创建训练作业镜像保存任务
     *
     * 创建训练作业镜像保存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSaveImageJobRequest 请求对象
     * @return SyncInvoker<CreateSaveImageJobRequest, CreateSaveImageJobResponse>
     */
    public SyncInvoker<CreateSaveImageJobRequest, CreateSaveImageJobResponse> createSaveImageJobInvoker(
        CreateSaveImageJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createSaveImageJob, hcClient);
    }

    /**
     * 创建训练作业标签
     *
     * 创建训练作业标签，支持批量添加，当添加的标签key已存在，则覆盖该标签的value。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainJobTagsRequest 请求对象
     * @return CreateTrainJobTagsResponse
     */
    public CreateTrainJobTagsResponse createTrainJobTags(CreateTrainJobTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createTrainJobTags);
    }

    /**
     * 创建训练作业标签
     *
     * 创建训练作业标签，支持批量添加，当添加的标签key已存在，则覆盖该标签的value。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainJobTagsRequest 请求对象
     * @return SyncInvoker<CreateTrainJobTagsRequest, CreateTrainJobTagsResponse>
     */
    public SyncInvoker<CreateTrainJobTagsRequest, CreateTrainJobTagsResponse> createTrainJobTagsInvoker(
        CreateTrainJobTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createTrainJobTags, hcClient);
    }

    /**
     * 创建训练实验
     *
     * 创建训练实验接口用于在ModelArts平台上创建新的实验分类。
     * 该接口适用于以下场景：当用户需要将训练作业放入实验中分类，有序地进行管理，可以通过此接口创建训练实验，常用于多任务的版本管理等场景。使用该接口的前提条件是用户已登录ModelArts平台并具有创建训练实验的权限。创建操作完成后，系统将返回训练实验的详细信息，包括实验ID、当前实验下的训练作业总个数等。若用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingExperimentRequest 请求对象
     * @return CreateTrainingExperimentResponse
     */
    public CreateTrainingExperimentResponse createTrainingExperiment(CreateTrainingExperimentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createTrainingExperiment);
    }

    /**
     * 创建训练实验
     *
     * 创建训练实验接口用于在ModelArts平台上创建新的实验分类。
     * 该接口适用于以下场景：当用户需要将训练作业放入实验中分类，有序地进行管理，可以通过此接口创建训练实验，常用于多任务的版本管理等场景。使用该接口的前提条件是用户已登录ModelArts平台并具有创建训练实验的权限。创建操作完成后，系统将返回训练实验的详细信息，包括实验ID、当前实验下的训练作业总个数等。若用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingExperimentRequest 请求对象
     * @return SyncInvoker<CreateTrainingExperimentRequest, CreateTrainingExperimentResponse>
     */
    public SyncInvoker<CreateTrainingExperimentRequest, CreateTrainingExperimentResponse> createTrainingExperimentInvoker(
        CreateTrainingExperimentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createTrainingExperiment, hcClient);
    }

    /**
     * 创建训练作业
     *
     * 创建训练作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingJobRequest 请求对象
     * @return CreateTrainingJobResponse
     */
    public CreateTrainingJobResponse createTrainingJob(CreateTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createTrainingJob);
    }

    /**
     * 创建训练作业
     *
     * 创建训练作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingJobRequest 请求对象
     * @return SyncInvoker<CreateTrainingJobRequest, CreateTrainingJobResponse>
     */
    public SyncInvoker<CreateTrainingJobRequest, CreateTrainingJobResponse> createTrainingJobInvoker(
        CreateTrainingJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createTrainingJob, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间（\&quot;default\&quot;为系统预留的默认工作空间名称，不能使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkspace);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间（\&quot;default\&quot;为系统预留的默认工作空间名称，不能使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceInvoker(
        CreateWorkspaceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkspace, hcClient);
    }

    /**
     * 删除算法
     *
     * 删除算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmRequest 请求对象
     * @return DeleteAlgorithmResponse
     */
    public DeleteAlgorithmResponse deleteAlgorithm(DeleteAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteAlgorithm);
    }

    /**
     * 删除算法
     *
     * 删除算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmRequest 请求对象
     * @return SyncInvoker<DeleteAlgorithmRequest, DeleteAlgorithmResponse>
     */
    public SyncInvoker<DeleteAlgorithmRequest, DeleteAlgorithmResponse> deleteAlgorithmInvoker(
        DeleteAlgorithmRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteAlgorithm, hcClient);
    }

    /**
     * 删除授权
     *
     * 删除授权接口用于删除指定用户的授权或删除全量用户的授权。该接口适用于以下场景：当需要撤销特定用户的访问权限或在系统维护时清理所有用户的授权时，管理员可通过此接口删除指定用户的授权或全量用户的授权。使用该接口的前提条件是管理员具备删除授权的权限，并且需要指定要删除授权的用户或选择删除全量用户的授权。删除操作完成后，指定用户的授权将被移除，或所有用户的授权将被清空，用户将无法再访问相关功能。若用户不存在、管理员无权限操作或删除全量授权时系统检测到无管理员权限，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorizationsRequest 请求对象
     * @return DeleteAuthorizationsResponse
     */
    public DeleteAuthorizationsResponse deleteAuthorizations(DeleteAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteAuthorizations);
    }

    /**
     * 删除授权
     *
     * 删除授权接口用于删除指定用户的授权或删除全量用户的授权。该接口适用于以下场景：当需要撤销特定用户的访问权限或在系统维护时清理所有用户的授权时，管理员可通过此接口删除指定用户的授权或全量用户的授权。使用该接口的前提条件是管理员具备删除授权的权限，并且需要指定要删除授权的用户或选择删除全量用户的授权。删除操作完成后，指定用户的授权将被移除，或所有用户的授权将被清空，用户将无法再访问相关功能。若用户不存在、管理员无权限操作或删除全量授权时系统检测到无管理员权限，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorizationsRequest 请求对象
     * @return SyncInvoker<DeleteAuthorizationsRequest, DeleteAuthorizationsResponse>
     */
    public SyncInvoker<DeleteAuthorizationsRequest, DeleteAuthorizationsResponse> deleteAuthorizationsInvoker(
        DeleteAuthorizationsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteAuthorizations, hcClient);
    }

    /**
     * 删除镜像
     *
     * 删除镜像接口用于删除镜像对象，对于个人私有镜像可以通过参数一并删除SWR镜像内容。该接口适用于以下场景：当镜像不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的镜像对象。使用该接口的前提条件是镜像已存在且用户具有删除权限。删除操作完成后，镜像对象将被永久移除，相关资源和配置也将被清理。若镜像不存在、用户无权限操作或镜像正在被使用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageRequest 请求对象
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteImage);
    }

    /**
     * 删除镜像
     *
     * 删除镜像接口用于删除镜像对象，对于个人私有镜像可以通过参数一并删除SWR镜像内容。该接口适用于以下场景：当镜像不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的镜像对象。使用该接口的前提条件是镜像已存在且用户具有删除权限。删除操作完成后，镜像对象将被永久移除，相关资源和配置也将被清理。若镜像不存在、用户无权限操作或镜像正在被使用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageRequest 请求对象
     * @return SyncInvoker<DeleteImageRequest, DeleteImageResponse>
     */
    public SyncInvoker<DeleteImageRequest, DeleteImageResponse> deleteImageInvoker(DeleteImageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteImage, hcClient);
    }

    /**
     * 删除镜像组
     *
     * 删除镜像组接口用于删除镜像组内所有的版本对象，对于个人私有镜像可以通过参数一并删除SWR镜像内容。该接口适用于以下场景：当镜像不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的镜像组对象内所有版本。使用该接口的前提条件是镜像组已存在且用户具有删除权限。删除操作完成后，镜像组内所有版本对象将被永久移除，相关资源和配置也将被清理。若镜像组不存在、用户无权限操作或镜像正在被使用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageGroupRequest 请求对象
     * @return DeleteImageGroupResponse
     */
    public DeleteImageGroupResponse deleteImageGroup(DeleteImageGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteImageGroup);
    }

    /**
     * 删除镜像组
     *
     * 删除镜像组接口用于删除镜像组内所有的版本对象，对于个人私有镜像可以通过参数一并删除SWR镜像内容。该接口适用于以下场景：当镜像不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的镜像组对象内所有版本。使用该接口的前提条件是镜像组已存在且用户具有删除权限。删除操作完成后，镜像组内所有版本对象将被永久移除，相关资源和配置也将被清理。若镜像组不存在、用户无权限操作或镜像正在被使用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageGroupRequest 请求对象
     * @return SyncInvoker<DeleteImageGroupRequest, DeleteImageGroupResponse>
     */
    public SyncInvoker<DeleteImageGroupRequest, DeleteImageGroupResponse> deleteImageGroupInvoker(
        DeleteImageGroupRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteImageGroup, hcClient);
    }

    /**
     * 删除应用密钥
     *
     * 本接口用于删除指定的apikey，适用于管理员需要撤销对某个应用程序或用户的访问权限的场景。调用此接口前，确保已获取到需要删除的apikey，并确认apikey未在其他服务中使用。删除成功后，该apikey将无法再用于访问任何相关服务。如果尝试删除不存在或已删除的apikey，将返回相应的异常信息，提示用户检查apikey的有效性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferApiKeyRequest 请求对象
     * @return DeleteInferApiKeyResponse
     */
    public DeleteInferApiKeyResponse deleteInferApiKey(DeleteInferApiKeyRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteInferApiKey);
    }

    /**
     * 删除应用密钥
     *
     * 本接口用于删除指定的apikey，适用于管理员需要撤销对某个应用程序或用户的访问权限的场景。调用此接口前，确保已获取到需要删除的apikey，并确认apikey未在其他服务中使用。删除成功后，该apikey将无法再用于访问任何相关服务。如果尝试删除不存在或已删除的apikey，将返回相应的异常信息，提示用户检查apikey的有效性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferApiKeyRequest 请求对象
     * @return SyncInvoker<DeleteInferApiKeyRequest, DeleteInferApiKeyResponse>
     */
    public SyncInvoker<DeleteInferApiKeyRequest, DeleteInferApiKeyResponse> deleteInferApiKeyInvoker(
        DeleteInferApiKeyRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteInferApiKey, hcClient);
    }

    /**
     * 删除服务部署
     *
     * 该接口适用于删除服务的某个部署。若服务ID、部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentRequest 请求对象
     * @return DeleteInferDeploymentResponse
     */
    public DeleteInferDeploymentResponse deleteInferDeployment(DeleteInferDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteInferDeployment);
    }

    /**
     * 删除服务部署
     *
     * 该接口适用于删除服务的某个部署。若服务ID、部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentRequest 请求对象
     * @return SyncInvoker<DeleteInferDeploymentRequest, DeleteInferDeploymentResponse>
     */
    public SyncInvoker<DeleteInferDeploymentRequest, DeleteInferDeploymentResponse> deleteInferDeploymentInvoker(
        DeleteInferDeploymentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteInferDeployment, hcClient);
    }

    /**
     * 删除服务部署的实例
     *
     * 本接口用于删除指定的单个部署的实例，适用于需要清理或释放不再使用的部署实例资源的场景。调用此接口前，确保已具备相应的删除权限，并提供有效的服务实例ID、部署ID。删除成功后，指定的服务部署实例将被彻底移除，不再对任何请求生效。如果提供的服务实例ID、部署ID无效、服务实例已删除或权限不足，将返回相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentInstanceRequest 请求对象
     * @return DeleteInferDeploymentInstanceResponse
     */
    public DeleteInferDeploymentInstanceResponse deleteInferDeploymentInstance(
        DeleteInferDeploymentInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteInferDeploymentInstance);
    }

    /**
     * 删除服务部署的实例
     *
     * 本接口用于删除指定的单个部署的实例，适用于需要清理或释放不再使用的部署实例资源的场景。调用此接口前，确保已具备相应的删除权限，并提供有效的服务实例ID、部署ID。删除成功后，指定的服务部署实例将被彻底移除，不再对任何请求生效。如果提供的服务实例ID、部署ID无效、服务实例已删除或权限不足，将返回相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInferDeploymentInstanceRequest, DeleteInferDeploymentInstanceResponse>
     */
    public SyncInvoker<DeleteInferDeploymentInstanceRequest, DeleteInferDeploymentInstanceResponse> deleteInferDeploymentInstanceInvoker(
        DeleteInferDeploymentInstanceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteInferDeploymentInstance, hcClient);
    }

    /**
     * 删除Pod
     *
     * 本接口用于删除指定的单个Pod，适用于需要清理或释放不再使用的Pod资源的场景。调用此接口前，确保已具备相应的删除权限，并提供有效的Pod ID。删除成功后，指定的Pod将被彻底移除，不再对任何服务请求生效。如果提供的Pod ID无效、Pod已删除或权限不足，将返回相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentPodRequest 请求对象
     * @return DeleteInferDeploymentPodResponse
     */
    public DeleteInferDeploymentPodResponse deleteInferDeploymentPod(DeleteInferDeploymentPodRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteInferDeploymentPod);
    }

    /**
     * 删除Pod
     *
     * 本接口用于删除指定的单个Pod，适用于需要清理或释放不再使用的Pod资源的场景。调用此接口前，确保已具备相应的删除权限，并提供有效的Pod ID。删除成功后，指定的Pod将被彻底移除，不再对任何服务请求生效。如果提供的Pod ID无效、Pod已删除或权限不足，将返回相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentPodRequest 请求对象
     * @return SyncInvoker<DeleteInferDeploymentPodRequest, DeleteInferDeploymentPodResponse>
     */
    public SyncInvoker<DeleteInferDeploymentPodRequest, DeleteInferDeploymentPodResponse> deleteInferDeploymentPodInvoker(
        DeleteInferDeploymentPodRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteInferDeploymentPod, hcClient);
    }

    /**
     * 删除在线服务部署版本
     *
     * 此接口用于删除指定服务部署的某个在线版本，适用于需要清理不再使用的版本或优化资源管理的场景。
     * 请求需包含有效的服务ID、部署ID及版本号。用户必须具有对目标服务部署的管理权限，并且该版本当前未处于活跃状态。
     * 删除成功后，指定版本将从在线服务部署中移除，相关资源将被释放。
     * 若服务ID、部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；若版本处于活跃状态或有其他依赖，则返回400 Bad Request。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentVersionRequest 请求对象
     * @return DeleteInferDeploymentVersionResponse
     */
    public DeleteInferDeploymentVersionResponse deleteInferDeploymentVersion(
        DeleteInferDeploymentVersionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteInferDeploymentVersion);
    }

    /**
     * 删除在线服务部署版本
     *
     * 此接口用于删除指定服务部署的某个在线版本，适用于需要清理不再使用的版本或优化资源管理的场景。
     * 请求需包含有效的服务ID、部署ID及版本号。用户必须具有对目标服务部署的管理权限，并且该版本当前未处于活跃状态。
     * 删除成功后，指定版本将从在线服务部署中移除，相关资源将被释放。
     * 若服务ID、部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；若版本处于活跃状态或有其他依赖，则返回400 Bad Request。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentVersionRequest 请求对象
     * @return SyncInvoker<DeleteInferDeploymentVersionRequest, DeleteInferDeploymentVersionResponse>
     */
    public SyncInvoker<DeleteInferDeploymentVersionRequest, DeleteInferDeploymentVersionResponse> deleteInferDeploymentVersionInvoker(
        DeleteInferDeploymentVersionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteInferDeploymentVersion, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 该接口适用于需要从资源（如模型、数据集、服务等）中移除特定标签的场景，例如在资源管理或分类中，用户可以通过删除标签来调整或清理资源的元数据。通过调用此接口，用户可以批量删除指定的标签。用户必须具有足够的权限，且目标资源需存在。删除成功后，资源将不再包含指定的标签信息；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferServiceTagRequest 请求对象
     * @return DeleteInferServiceTagResponse
     */
    public DeleteInferServiceTagResponse deleteInferServiceTag(DeleteInferServiceTagRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteInferServiceTag);
    }

    /**
     * 删除资源标签
     *
     * 该接口适用于需要从资源（如模型、数据集、服务等）中移除特定标签的场景，例如在资源管理或分类中，用户可以通过删除标签来调整或清理资源的元数据。通过调用此接口，用户可以批量删除指定的标签。用户必须具有足够的权限，且目标资源需存在。删除成功后，资源将不再包含指定的标签信息；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferServiceTagRequest 请求对象
     * @return SyncInvoker<DeleteInferServiceTagRequest, DeleteInferServiceTagResponse>
     */
    public SyncInvoker<DeleteInferServiceTagRequest, DeleteInferServiceTagResponse> deleteInferServiceTagInvoker(
        DeleteInferServiceTagRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteInferServiceTag, hcClient);
    }

    /**
     * 删除网络资源
     *
     * 删除网络资源接口用于移除指定的网络资源。该接口适用于以下场景：当网络资源不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的网络资源。使用该接口的前提条件是网络资源已存在且用户具有管理员权限。删除操作完成后，指定的网络资源将被永久移除，相关配置和关联关系也将被清理。若指定的网络资源不存在、用户无权限操作或资源被其他资源依赖，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkRequest 请求对象
     * @return DeleteNetworkResponse
     */
    public DeleteNetworkResponse deleteNetwork(DeleteNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteNetwork);
    }

    /**
     * 删除网络资源
     *
     * 删除网络资源接口用于移除指定的网络资源。该接口适用于以下场景：当网络资源不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的网络资源。使用该接口的前提条件是网络资源已存在且用户具有管理员权限。删除操作完成后，指定的网络资源将被永久移除，相关配置和关联关系也将被清理。若指定的网络资源不存在、用户无权限操作或资源被其他资源依赖，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkRequest 请求对象
     * @return SyncInvoker<DeleteNetworkRequest, DeleteNetworkResponse>
     */
    public SyncInvoker<DeleteNetworkRequest, DeleteNetworkResponse> deleteNetworkInvoker(DeleteNetworkRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteNetwork, hcClient);
    }

    /**
     * 删除节点池
     *
     * 删除节点池接口用于移除已创建的节点池，包周期资源池不支持。该接口适用于以下场景：当节点池完成任务、配置错误或需要清理资源时，用户可通过此接口删除指定的节点池。使用该接口的前提条件是节点池已存在且用户具有管理员权限。删除操作完成后，节点池将被永久移除，相关资源和配置也将被清理。若节点池不存在、用户无权限操作或节点池处于不可删除状态（如包周期资源池或节点池正在使用中），接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodePoolRequest 请求对象
     * @return DeleteNodePoolResponse
     */
    public DeleteNodePoolResponse deleteNodePool(DeleteNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteNodePool);
    }

    /**
     * 删除节点池
     *
     * 删除节点池接口用于移除已创建的节点池，包周期资源池不支持。该接口适用于以下场景：当节点池完成任务、配置错误或需要清理资源时，用户可通过此接口删除指定的节点池。使用该接口的前提条件是节点池已存在且用户具有管理员权限。删除操作完成后，节点池将被永久移除，相关资源和配置也将被清理。若节点池不存在、用户无权限操作或节点池处于不可删除状态（如包周期资源池或节点池正在使用中），接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodePoolRequest 请求对象
     * @return SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>
     */
    public SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePoolInvoker(
        DeleteNodePoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteNodePool, hcClient);
    }

    /**
     * 删除资源池
     *
     * 删除资源池接口用于移除指定的资源池。该接口适用于以下场景：当资源池不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的资源池。使用该接口的前提条件是资源池已存在且用户具有管理员权限。删除操作完成后，指定的资源池将被永久移除，相关资源和配置也将被清理。若资源池不存在、用户无权限操作或资源池被其他资源依赖，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolRequest 请求对象
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePool(DeletePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deletePool);
    }

    /**
     * 删除资源池
     *
     * 删除资源池接口用于移除指定的资源池。该接口适用于以下场景：当资源池不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的资源池。使用该接口的前提条件是资源池已存在且用户具有管理员权限。删除操作完成后，指定的资源池将被永久移除，相关资源和配置也将被清理。若资源池不存在、用户无权限操作或资源池被其他资源依赖，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolRequest 请求对象
     * @return SyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public SyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolInvoker(DeletePoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deletePool, hcClient);
    }

    /**
     * 删除训练作业标签
     *
     * 删除训练作业标签，支持批量删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainJobTagsRequest 请求对象
     * @return DeleteTrainJobTagsResponse
     */
    public DeleteTrainJobTagsResponse deleteTrainJobTags(DeleteTrainJobTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteTrainJobTags);
    }

    /**
     * 删除训练作业标签
     *
     * 删除训练作业标签，支持批量删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainJobTagsRequest 请求对象
     * @return SyncInvoker<DeleteTrainJobTagsRequest, DeleteTrainJobTagsResponse>
     */
    public SyncInvoker<DeleteTrainJobTagsRequest, DeleteTrainJobTagsResponse> deleteTrainJobTagsInvoker(
        DeleteTrainJobTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteTrainJobTags, hcClient);
    }

    /**
     * 删除训练实验
     *
     * 删除训练实验接口用于移除已创建的训练实验。
     * 该接口适用于以下场景：当训练实验完成、配置错误或需要清理资源时，用户可以通过此接口删除指定的训练实验。使用该接口的前提条件是训练实验已存在且用户具有删除该实验的权限。删除操作完成后，训练实验将被永久移除，相关的配置和资源也将被清理。若训练实验不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainingExperimentRequest 请求对象
     * @return DeleteTrainingExperimentResponse
     */
    public DeleteTrainingExperimentResponse deleteTrainingExperiment(DeleteTrainingExperimentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteTrainingExperiment);
    }

    /**
     * 删除训练实验
     *
     * 删除训练实验接口用于移除已创建的训练实验。
     * 该接口适用于以下场景：当训练实验完成、配置错误或需要清理资源时，用户可以通过此接口删除指定的训练实验。使用该接口的前提条件是训练实验已存在且用户具有删除该实验的权限。删除操作完成后，训练实验将被永久移除，相关的配置和资源也将被清理。若训练实验不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainingExperimentRequest 请求对象
     * @return SyncInvoker<DeleteTrainingExperimentRequest, DeleteTrainingExperimentResponse>
     */
    public SyncInvoker<DeleteTrainingExperimentRequest, DeleteTrainingExperimentResponse> deleteTrainingExperimentInvoker(
        DeleteTrainingExperimentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteTrainingExperiment, hcClient);
    }

    /**
     * 删除训练作业
     *
     * 删除训练作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainingJobRequest 请求对象
     * @return DeleteTrainingJobResponse
     */
    public DeleteTrainingJobResponse deleteTrainingJob(DeleteTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteTrainingJob);
    }

    /**
     * 删除训练作业
     *
     * 删除训练作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainingJobRequest 请求对象
     * @return SyncInvoker<DeleteTrainingJobRequest, DeleteTrainingJobResponse>
     */
    public SyncInvoker<DeleteTrainingJobRequest, DeleteTrainingJobResponse> deleteTrainingJobInvoker(
        DeleteTrainingJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteTrainingJob, hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteWorkspace);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceInvoker(
        DeleteWorkspaceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteWorkspace, hcClient);
    }

    /**
     * 动态卸载Notebook存储
     *
     * 动态卸载Notebook存储接口用于从运行中的Notebook实例中卸载已挂载的动态存储实例。
     * 
     * 适用场景：用户需要清理或重新组织Notebook实例的挂载资源时，可通过此接口卸载指定的存储实例。使用该接口的前提条件是用户已登录系统并具有访问目标Notebook实例的权限，同时Notebook实例必须处于运行状态且存储实例处于MOUNTED / UNMOUNT_FAILED / MOUNT_FAILED状态。调用该接口后，系统将卸载指定的存储实例，Notebook容器将无法再操作存储中的文件或对象，但存储中的文件或对象保持不变。若用户无权限访问指定实例或Notebook实例未运行，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachDynamicStorageRequest 请求对象
     * @return DetachDynamicStorageResponse
     */
    public DetachDynamicStorageResponse detachDynamicStorage(DetachDynamicStorageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.detachDynamicStorage);
    }

    /**
     * 动态卸载Notebook存储
     *
     * 动态卸载Notebook存储接口用于从运行中的Notebook实例中卸载已挂载的动态存储实例。
     * 
     * 适用场景：用户需要清理或重新组织Notebook实例的挂载资源时，可通过此接口卸载指定的存储实例。使用该接口的前提条件是用户已登录系统并具有访问目标Notebook实例的权限，同时Notebook实例必须处于运行状态且存储实例处于MOUNTED / UNMOUNT_FAILED / MOUNT_FAILED状态。调用该接口后，系统将卸载指定的存储实例，Notebook容器将无法再操作存储中的文件或对象，但存储中的文件或对象保持不变。若用户无权限访问指定实例或Notebook实例未运行，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachDynamicStorageRequest 请求对象
     * @return SyncInvoker<DetachDynamicStorageRequest, DetachDynamicStorageResponse>
     */
    public SyncInvoker<DetachDynamicStorageRequest, DetachDynamicStorageResponse> detachDynamicStorageInvoker(
        DetachDynamicStorageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.detachDynamicStorage, hcClient);
    }

    /**
     * 查看授权列表
     *
     * 查看授权列表接口用于查看授权信息。该接口适用于以下场景：当用户需要了解当前的授权情况、审核权限分配或管理权限时，可通过此接口查看授权列表。使用该接口的前提条件是用户具备查看授权的权限。查看操作完成后，将返回授权列表，包括被授权的资源、授权类型以及授权内容等信息。若用户无权限查看或授权列表不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAuthorizationsRequest 请求对象
     * @return GetAuthorizationsResponse
     */
    public GetAuthorizationsResponse getAuthorizations(GetAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getAuthorizations);
    }

    /**
     * 查看授权列表
     *
     * 查看授权列表接口用于查看授权信息。该接口适用于以下场景：当用户需要了解当前的授权情况、审核权限分配或管理权限时，可通过此接口查看授权列表。使用该接口的前提条件是用户具备查看授权的权限。查看操作完成后，将返回授权列表，包括被授权的资源、授权类型以及授权内容等信息。若用户无权限查看或授权列表不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAuthorizationsRequest 请求对象
     * @return SyncInvoker<GetAuthorizationsRequest, GetAuthorizationsResponse>
     */
    public SyncInvoker<GetAuthorizationsRequest, GetAuthorizationsResponse> getAuthorizationsInvoker(
        GetAuthorizationsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getAuthorizations, hcClient);
    }

    /**
     * 查询超节点Operation详情
     *
     * 查询Operation详情接口用于获取指定Operation的详细信息。该接口适用于以下场景：当用户需要了解某个Operation的具体执行情况和状态，以便进行故障排查或操作审计时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询Operation详情的权限，且指定的Operation已存在。查询操作完成后，接口将返回指定Operation的详细信息，包括Operation ID、操作类型、执行状态、开始时间、结束时间、操作结果等。若用户无权限操作、指定的Operation不存在或Operation ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHyperinstanceOperationRequest 请求对象
     * @return GetHyperinstanceOperationResponse
     */
    public GetHyperinstanceOperationResponse getHyperinstanceOperation(GetHyperinstanceOperationRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getHyperinstanceOperation);
    }

    /**
     * 查询超节点Operation详情
     *
     * 查询Operation详情接口用于获取指定Operation的详细信息。该接口适用于以下场景：当用户需要了解某个Operation的具体执行情况和状态，以便进行故障排查或操作审计时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询Operation详情的权限，且指定的Operation已存在。查询操作完成后，接口将返回指定Operation的详细信息，包括Operation ID、操作类型、执行状态、开始时间、结束时间、操作结果等。若用户无权限操作、指定的Operation不存在或Operation ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHyperinstanceOperationRequest 请求对象
     * @return SyncInvoker<GetHyperinstanceOperationRequest, GetHyperinstanceOperationResponse>
     */
    public SyncInvoker<GetHyperinstanceOperationRequest, GetHyperinstanceOperationResponse> getHyperinstanceOperationInvoker(
        GetHyperinstanceOperationRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getHyperinstanceOperation, hcClient);
    }

    /**
     * 查询算法列表
     *
     * 查询算法列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlgorithmsRequest 请求对象
     * @return ListAlgorithmsResponse
     */
    public ListAlgorithmsResponse listAlgorithms(ListAlgorithmsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listAlgorithms);
    }

    /**
     * 查询算法列表
     *
     * 查询算法列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlgorithmsRequest 请求对象
     * @return SyncInvoker<ListAlgorithmsRequest, ListAlgorithmsResponse>
     */
    public SyncInvoker<ListAlgorithmsRequest, ListAlgorithmsResponse> listAlgorithmsInvoker(
        ListAlgorithmsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listAlgorithms, hcClient);
    }

    /**
     * 获取动态挂载存储信息列表
     *
     * 此接口用于获取指定Notebook实例下挂载的动态存储信息列表。
     * 适用场景：用户需要获取指定Notebook实例下挂载的动态存储的存储id、存储类型、挂载路径、挂载状态等信息的场景。若挂载失败，会返回相应错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDynamicStoragesRequest 请求对象
     * @return ListDynamicStoragesResponse
     */
    public ListDynamicStoragesResponse listDynamicStorages(ListDynamicStoragesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listDynamicStorages);
    }

    /**
     * 获取动态挂载存储信息列表
     *
     * 此接口用于获取指定Notebook实例下挂载的动态存储信息列表。
     * 适用场景：用户需要获取指定Notebook实例下挂载的动态存储的存储id、存储类型、挂载路径、挂载状态等信息的场景。若挂载失败，会返回相应错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDynamicStoragesRequest 请求对象
     * @return SyncInvoker<ListDynamicStoragesRequest, ListDynamicStoragesResponse>
     */
    public SyncInvoker<ListDynamicStoragesRequest, ListDynamicStoragesResponse> listDynamicStoragesInvoker(
        ListDynamicStoragesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listDynamicStorages, hcClient);
    }

    /**
     * 获取事件类型列表
     *
     * 获取事件类型列表接口用于获取训练管理中支持的事件类型列表。
     * 该接口适用于以下场景：当用户需要了解训练管理中支持的事件类型，以便在创建或管理训练任务时进行相关配置时，可以通过此接口获取事件类型列表。使用该接口的前提条件是用户已登录且具有访问训练管理的权限。获取操作完成后，响应消息体中将包含所有支持的事件类型及其描述。若用户无权限访问或系统中无事件类型信息，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventCategoriesRequest 请求对象
     * @return ListEventCategoriesResponse
     */
    public ListEventCategoriesResponse listEventCategories(ListEventCategoriesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listEventCategories);
    }

    /**
     * 获取事件类型列表
     *
     * 获取事件类型列表接口用于获取训练管理中支持的事件类型列表。
     * 该接口适用于以下场景：当用户需要了解训练管理中支持的事件类型，以便在创建或管理训练任务时进行相关配置时，可以通过此接口获取事件类型列表。使用该接口的前提条件是用户已登录且具有访问训练管理的权限。获取操作完成后，响应消息体中将包含所有支持的事件类型及其描述。若用户无权限访问或系统中无事件类型信息，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventCategoriesRequest 请求对象
     * @return SyncInvoker<ListEventCategoriesRequest, ListEventCategoriesResponse>
     */
    public SyncInvoker<ListEventCategoriesRequest, ListEventCategoriesResponse> listEventCategoriesInvoker(
        ListEventCategoriesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listEventCategories, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表接口用于获取系统中记录的事件信息。该接口适用于以下场景：当用户需要监控系统状态、排查问题或进行审计时，可通过此接口查询系统中发生的事件记录。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在事件记录。查询操作完成后，接口将返回事件列表，包含事件ID、类型、时间、描述等信息。若用户无权限、事件记录不存在或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listEvents);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表接口用于获取系统中记录的事件信息。该接口适用于以下场景：当用户需要监控系统状态、排查问题或进行审计时，可通过此接口查询系统中发生的事件记录。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在事件记录。查询操作完成后，接口将返回事件列表，包含事件ID、类型、时间、描述等信息。若用户无权限、事件记录不存在或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listEvents, hcClient);
    }

    /**
     * 查询支持的镜像列表
     *
     * 查询支持的镜像列表接口用于根据指定条件分页查询满足条件的所有镜像。该接口适用于以下场景：当用户需要查找特定镜像、管理镜像仓库或选择合适的镜像版本进行部署时，可通过此接口获取符合条件的镜像列表。使用该接口的前提条件是镜像仓库已存在且用户具有访问权限。查询操作完成后，将返回满足条件的镜像列表，包括镜像ID、名称、版本、类型、状态、大小和创建时间等详细信息。若镜像仓库不存在、用户无权限访问或查询条件有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRequest 请求对象
     * @return ListImageResponse
     */
    public ListImageResponse listImage(ListImageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listImage);
    }

    /**
     * 查询支持的镜像列表
     *
     * 查询支持的镜像列表接口用于根据指定条件分页查询满足条件的所有镜像。该接口适用于以下场景：当用户需要查找特定镜像、管理镜像仓库或选择合适的镜像版本进行部署时，可通过此接口获取符合条件的镜像列表。使用该接口的前提条件是镜像仓库已存在且用户具有访问权限。查询操作完成后，将返回满足条件的镜像列表，包括镜像ID、名称、版本、类型、状态、大小和创建时间等详细信息。若镜像仓库不存在、用户无权限访问或查询条件有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRequest 请求对象
     * @return SyncInvoker<ListImageRequest, ListImageResponse>
     */
    public SyncInvoker<ListImageRequest, ListImageResponse> listImageInvoker(ListImageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listImage, hcClient);
    }

    /**
     * 查询用户镜像列表
     *
     * 查询用户镜像列表接口用于查询用户镜像信息概览，以镜像名称作为聚合的信息。该接口适用于以下场景：当用户需要管理多个镜像或了解各镜像的基本信息时，可通过此接口获取镜像列表及其概览信息。使用该接口的前提条件是用户具备镜像管理权限，并且镜像已存在。查询操作完成后，将返回用户所有镜像的列表，包括镜像名称、版本、状态等信息。若镜像不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageGroupRequest 请求对象
     * @return ListImageGroupResponse
     */
    public ListImageGroupResponse listImageGroup(ListImageGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listImageGroup);
    }

    /**
     * 查询用户镜像列表
     *
     * 查询用户镜像列表接口用于查询用户镜像信息概览，以镜像名称作为聚合的信息。该接口适用于以下场景：当用户需要管理多个镜像或了解各镜像的基本信息时，可通过此接口获取镜像列表及其概览信息。使用该接口的前提条件是用户具备镜像管理权限，并且镜像已存在。查询操作完成后，将返回用户所有镜像的列表，包括镜像名称、版本、状态等信息。若镜像不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageGroupRequest 请求对象
     * @return SyncInvoker<ListImageGroupRequest, ListImageGroupResponse>
     */
    public SyncInvoker<ListImageGroupRequest, ListImageGroupResponse> listImageGroupInvoker(
        ListImageGroupRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listImageGroup, hcClient);
    }

    /**
     * 查询应用密钥
     *
     * 本接口用于查询当前系统中的apikey列表，适用于管理员或用户需要查看和管理apikey的场景。调用此接口前，确保已具备相应的查询权限。返回的列表将包含每个apikey的基本信息，如apikey值、创建时间、绑定的服务等。如果当前系统中没有apikey，将返回空列表或相应的异常信息，提示用户检查查询条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferApiKeysRequest 请求对象
     * @return ListInferApiKeysResponse
     */
    public ListInferApiKeysResponse listInferApiKeys(ListInferApiKeysRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferApiKeys);
    }

    /**
     * 查询应用密钥
     *
     * 本接口用于查询当前系统中的apikey列表，适用于管理员或用户需要查看和管理apikey的场景。调用此接口前，确保已具备相应的查询权限。返回的列表将包含每个apikey的基本信息，如apikey值、创建时间、绑定的服务等。如果当前系统中没有apikey，将返回空列表或相应的异常信息，提示用户检查查询条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferApiKeysRequest 请求对象
     * @return SyncInvoker<ListInferApiKeysRequest, ListInferApiKeysResponse>
     */
    public SyncInvoker<ListInferApiKeysRequest, ListInferApiKeysResponse> listInferApiKeysInvoker(
        ListInferApiKeysRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferApiKeys, hcClient);
    }

    /**
     * 查询支持可切换规格列表
     *
     * 该接口允许用户查询当前资源实例支持的可切换规格列表，适用于需要调整实例资源配置的场景。使用该接口前，用户需确保已登录并拥有查询权限。执行成功后，用户将获得一个包含各种可切换规格的详细列表，包括规格ID、名称、资源配额等信息，可用于后续的实例规格变更操作。如果用户没有相应的查询权限或资源实例ID无效，接口将返回错误信息，如401 Unauthorized或404 Not Found。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferClusterFlavorsRequest 请求对象
     * @return ListInferClusterFlavorsResponse
     */
    public ListInferClusterFlavorsResponse listInferClusterFlavors(ListInferClusterFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferClusterFlavors);
    }

    /**
     * 查询支持可切换规格列表
     *
     * 该接口允许用户查询当前资源实例支持的可切换规格列表，适用于需要调整实例资源配置的场景。使用该接口前，用户需确保已登录并拥有查询权限。执行成功后，用户将获得一个包含各种可切换规格的详细列表，包括规格ID、名称、资源配额等信息，可用于后续的实例规格变更操作。如果用户没有相应的查询权限或资源实例ID无效，接口将返回错误信息，如401 Unauthorized或404 Not Found。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferClusterFlavorsRequest 请求对象
     * @return SyncInvoker<ListInferClusterFlavorsRequest, ListInferClusterFlavorsResponse>
     */
    public SyncInvoker<ListInferClusterFlavorsRequest, ListInferClusterFlavorsResponse> listInferClusterFlavorsInvoker(
        ListInferClusterFlavorsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferClusterFlavors, hcClient);
    }

    /**
     * 查询服务部署实例列表
     *
     * 本接口用于查询当前[租户](tag:hws,hws_hk,fcs,fcs_super)[资源空间](tag:hcs,hcs_sm)的服务部署实例列表，并支持根据服务部署实例的状态进行筛选，包括运行中和已删除状态，同时支持分页和关键词筛选。适用于需要管理和监控服务实例状态的场景。调用此接口前，确保已具备相应的查询权限，并提供可选的筛选条件和分页参数。返回的列表将包含每个服务部署实例的基本信息，如部署名字、最新更新时间、状态等。如果当前租户没有符合条件的服务实例或提供的参数无效，将返回空列表或相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentInstancesRequest 请求对象
     * @return ListInferDeploymentInstancesResponse
     */
    public ListInferDeploymentInstancesResponse listInferDeploymentInstances(
        ListInferDeploymentInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferDeploymentInstances);
    }

    /**
     * 查询服务部署实例列表
     *
     * 本接口用于查询当前[租户](tag:hws,hws_hk,fcs,fcs_super)[资源空间](tag:hcs,hcs_sm)的服务部署实例列表，并支持根据服务部署实例的状态进行筛选，包括运行中和已删除状态，同时支持分页和关键词筛选。适用于需要管理和监控服务实例状态的场景。调用此接口前，确保已具备相应的查询权限，并提供可选的筛选条件和分页参数。返回的列表将包含每个服务部署实例的基本信息，如部署名字、最新更新时间、状态等。如果当前租户没有符合条件的服务实例或提供的参数无效，将返回空列表或相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentInstancesRequest 请求对象
     * @return SyncInvoker<ListInferDeploymentInstancesRequest, ListInferDeploymentInstancesResponse>
     */
    public SyncInvoker<ListInferDeploymentInstancesRequest, ListInferDeploymentInstancesResponse> listInferDeploymentInstancesInvoker(
        ListInferDeploymentInstancesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferDeploymentInstances, hcClient);
    }

    /**
     * 查询Pod事件
     *
     * 本接口用于查询指定Pod的Kubernetes事件，适用于需要监控和排查Pod运行状态的场景。调用此接口前，确保已具备相应的查询权限，并提供有效的Pod ID。返回的事件列表将包含每个事件的详细信息，如事件类型、发生次数、事件名称、事件信息、发生时间等。如果提供的Pod ID无效、Pod不存在或权限不足，将返回相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentPodEventsRequest 请求对象
     * @return ListInferDeploymentPodEventsResponse
     */
    public ListInferDeploymentPodEventsResponse listInferDeploymentPodEvents(
        ListInferDeploymentPodEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferDeploymentPodEvents);
    }

    /**
     * 查询Pod事件
     *
     * 本接口用于查询指定Pod的Kubernetes事件，适用于需要监控和排查Pod运行状态的场景。调用此接口前，确保已具备相应的查询权限，并提供有效的Pod ID。返回的事件列表将包含每个事件的详细信息，如事件类型、发生次数、事件名称、事件信息、发生时间等。如果提供的Pod ID无效、Pod不存在或权限不足，将返回相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentPodEventsRequest 请求对象
     * @return SyncInvoker<ListInferDeploymentPodEventsRequest, ListInferDeploymentPodEventsResponse>
     */
    public SyncInvoker<ListInferDeploymentPodEventsRequest, ListInferDeploymentPodEventsResponse> listInferDeploymentPodEventsInvoker(
        ListInferDeploymentPodEventsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferDeploymentPodEvents, hcClient);
    }

    /**
     * 查询服务部署的pod的列表
     *
     * 本接口用于查询指定服务部署的pod列表，并支持选择是否只获取当前运行中的pod。适用于需要管理和监控服务部署pod状态的场景。调用此接口前，确保已具备相应的查询权限，并提供有效的服务ID、部署ID和可选的筛选参数pod status（如是否只获取当前运行中的pod）。返回的列表将包含每个pod的基本信息，如pod名称、pod所在node的IP、pod所在node名字、pod角色、状态、最近更新时间等。如果指定的服务ID无效或当前服务没有pod，将返回空列表或相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentPodsRequest 请求对象
     * @return ListInferDeploymentPodsResponse
     */
    public ListInferDeploymentPodsResponse listInferDeploymentPods(ListInferDeploymentPodsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferDeploymentPods);
    }

    /**
     * 查询服务部署的pod的列表
     *
     * 本接口用于查询指定服务部署的pod列表，并支持选择是否只获取当前运行中的pod。适用于需要管理和监控服务部署pod状态的场景。调用此接口前，确保已具备相应的查询权限，并提供有效的服务ID、部署ID和可选的筛选参数pod status（如是否只获取当前运行中的pod）。返回的列表将包含每个pod的基本信息，如pod名称、pod所在node的IP、pod所在node名字、pod角色、状态、最近更新时间等。如果指定的服务ID无效或当前服务没有pod，将返回空列表或相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentPodsRequest 请求对象
     * @return SyncInvoker<ListInferDeploymentPodsRequest, ListInferDeploymentPodsResponse>
     */
    public SyncInvoker<ListInferDeploymentPodsRequest, ListInferDeploymentPodsResponse> listInferDeploymentPodsInvoker(
        ListInferDeploymentPodsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferDeploymentPods, hcClient);
    }

    /**
     * 查询在线服务部署版本列表
     *
     * 此接口用于获取指定服务部署的版本列表，适用于需要了解当前服务部署可用版本的场景，例如进行版本选择或确认当前版本信息。请求需包含有效的服务ID、部署ID，也可通过排序参数对列表进行排序。用户必须具有对目标服务部署的查看权限。请求成功后，返回该服务部署的所有在线版本信息，包括版本号、发布时间和状态。若服务ID/部署ID无效或用户无权限，则返回400 Bad Request或403 Forbidden；若服务部署无在线版本，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentVersionsRequest 请求对象
     * @return ListInferDeploymentVersionsResponse
     */
    public ListInferDeploymentVersionsResponse listInferDeploymentVersions(ListInferDeploymentVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferDeploymentVersions);
    }

    /**
     * 查询在线服务部署版本列表
     *
     * 此接口用于获取指定服务部署的版本列表，适用于需要了解当前服务部署可用版本的场景，例如进行版本选择或确认当前版本信息。请求需包含有效的服务ID、部署ID，也可通过排序参数对列表进行排序。用户必须具有对目标服务部署的查看权限。请求成功后，返回该服务部署的所有在线版本信息，包括版本号、发布时间和状态。若服务ID/部署ID无效或用户无权限，则返回400 Bad Request或403 Forbidden；若服务部署无在线版本，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentVersionsRequest 请求对象
     * @return SyncInvoker<ListInferDeploymentVersionsRequest, ListInferDeploymentVersionsResponse>
     */
    public SyncInvoker<ListInferDeploymentVersionsRequest, ListInferDeploymentVersionsResponse> listInferDeploymentVersionsInvoker(
        ListInferDeploymentVersionsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferDeploymentVersions, hcClient);
    }

    /**
     * 查询服务部署列表
     *
     * 支持分页和筛选，适用于用户在管理控制台或通过API需要查看特定条件下（如服务状态、名称等）的部署列表的情况。调用此接口前，用户必须具有查询部署列表的权限，并提供合法的分页参数（如页码、每页条数）和筛选条件（如部署状态、名称等）。调用成功后，系统将返回符合筛选条件的部署列表，包含指定页码的数据，并返回总页数和总记录数。如果用户没有查询部署列表的权限，或提供的分页参数和筛选条件不合法，调用将返回相应的错误信息。如果系统在查询过程中遇到内部错误，也将返回错误信息并记录日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentsRequest 请求对象
     * @return ListInferDeploymentsResponse
     */
    public ListInferDeploymentsResponse listInferDeployments(ListInferDeploymentsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferDeployments);
    }

    /**
     * 查询服务部署列表
     *
     * 支持分页和筛选，适用于用户在管理控制台或通过API需要查看特定条件下（如服务状态、名称等）的部署列表的情况。调用此接口前，用户必须具有查询部署列表的权限，并提供合法的分页参数（如页码、每页条数）和筛选条件（如部署状态、名称等）。调用成功后，系统将返回符合筛选条件的部署列表，包含指定页码的数据，并返回总页数和总记录数。如果用户没有查询部署列表的权限，或提供的分页参数和筛选条件不合法，调用将返回相应的错误信息。如果系统在查询过程中遇到内部错误，也将返回错误信息并记录日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentsRequest 请求对象
     * @return SyncInvoker<ListInferDeploymentsRequest, ListInferDeploymentsResponse>
     */
    public SyncInvoker<ListInferDeploymentsRequest, ListInferDeploymentsResponse> listInferDeploymentsInvoker(
        ListInferDeploymentsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferDeployments, hcClient);
    }

    /**
     * 查询当前的内网接入申请列表
     *
     * 本接口用于查询当前所有的内网接入申请记录，适用于需要管理和监控内网接入申请状态的场景。调用此接口前，确保已具备相应的查询权限。返回的列表将包含每个内网接入申请的基本信息，如申请ID、创建时间、状态、Region ID等。如果当前租户没有内网接入申请记录，将返回空列表。如果调用时出现权限不足或其他系统异常，将返回相应的异常信息，提示用户检查权限或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferIntranetConnectionApplicationsRequest 请求对象
     * @return ListInferIntranetConnectionApplicationsResponse
     */
    public ListInferIntranetConnectionApplicationsResponse listInferIntranetConnectionApplications(
        ListInferIntranetConnectionApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferIntranetConnectionApplications);
    }

    /**
     * 查询当前的内网接入申请列表
     *
     * 本接口用于查询当前所有的内网接入申请记录，适用于需要管理和监控内网接入申请状态的场景。调用此接口前，确保已具备相应的查询权限。返回的列表将包含每个内网接入申请的基本信息，如申请ID、创建时间、状态、Region ID等。如果当前租户没有内网接入申请记录，将返回空列表。如果调用时出现权限不足或其他系统异常，将返回相应的异常信息，提示用户检查权限或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferIntranetConnectionApplicationsRequest 请求对象
     * @return SyncInvoker<ListInferIntranetConnectionApplicationsRequest, ListInferIntranetConnectionApplicationsResponse>
     */
    public SyncInvoker<ListInferIntranetConnectionApplicationsRequest, ListInferIntranetConnectionApplicationsResponse> listInferIntranetConnectionApplicationsInvoker(
        ListInferIntranetConnectionApplicationsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferIntranetConnectionApplications, hcClient);
    }

    /**
     * 查询当前的内网接入审批列表
     *
     * 本接口用于查询当前所有的内网接入审批记录，适用于需要管理和监控内网接入审批状态的场景。调用此接口前，确保已具备相应的查询权限。返回的列表将包含每个内网接入审批的基本信息，如审批ID、申请时间、状态（如待审批、已批准、已拒绝）、申请者信息、Region ID等。如果当前租户没有内网接入审批记录，将返回空列表。如果调用时出现权限不足或其他系统异常，将返回相应的异常信息，提示用户检查权限或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferIntranetConnectionReviewsRequest 请求对象
     * @return ListInferIntranetConnectionReviewsResponse
     */
    public ListInferIntranetConnectionReviewsResponse listInferIntranetConnectionReviews(
        ListInferIntranetConnectionReviewsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferIntranetConnectionReviews);
    }

    /**
     * 查询当前的内网接入审批列表
     *
     * 本接口用于查询当前所有的内网接入审批记录，适用于需要管理和监控内网接入审批状态的场景。调用此接口前，确保已具备相应的查询权限。返回的列表将包含每个内网接入审批的基本信息，如审批ID、申请时间、状态（如待审批、已批准、已拒绝）、申请者信息、Region ID等。如果当前租户没有内网接入审批记录，将返回空列表。如果调用时出现权限不足或其他系统异常，将返回相应的异常信息，提示用户检查权限或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferIntranetConnectionReviewsRequest 请求对象
     * @return SyncInvoker<ListInferIntranetConnectionReviewsRequest, ListInferIntranetConnectionReviewsResponse>
     */
    public SyncInvoker<ListInferIntranetConnectionReviewsRequest, ListInferIntranetConnectionReviewsResponse> listInferIntranetConnectionReviewsInvoker(
        ListInferIntranetConnectionReviewsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferIntranetConnectionReviews, hcClient);
    }

    /**
     * 获取在线服务事件列表
     *
     * 该接口适用于需要监控和管理在线服务事件的场景，例如用户或运维人员需要定期检查服务的日志事件，以及时发现和处理问题。通过调用此接口，用户可以获取当前在线服务的所有事件记录，包括事件类型、事件信息、时间、发生次数等信息。用户必须具有查询服务事件列表的权限，才能成功访问该接口。获取成功后，返回事件列表；若失败，返回具体的错误信息。常见异常包括权限验证错误、服务状态错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferServiceEventsRequest 请求对象
     * @return ListInferServiceEventsResponse
     */
    public ListInferServiceEventsResponse listInferServiceEvents(ListInferServiceEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferServiceEvents);
    }

    /**
     * 获取在线服务事件列表
     *
     * 该接口适用于需要监控和管理在线服务事件的场景，例如用户或运维人员需要定期检查服务的日志事件，以及时发现和处理问题。通过调用此接口，用户可以获取当前在线服务的所有事件记录，包括事件类型、事件信息、时间、发生次数等信息。用户必须具有查询服务事件列表的权限，才能成功访问该接口。获取成功后，返回事件列表；若失败，返回具体的错误信息。常见异常包括权限验证错误、服务状态错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferServiceEventsRequest 请求对象
     * @return SyncInvoker<ListInferServiceEventsRequest, ListInferServiceEventsResponse>
     */
    public SyncInvoker<ListInferServiceEventsRequest, ListInferServiceEventsResponse> listInferServiceEventsInvoker(
        ListInferServiceEventsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferServiceEvents, hcClient);
    }

    /**
     * 查询某一类资源下的标签
     *
     * 该接口适用于需要获取用户当前项目中某一类资源（如指定的Service）的标签信息的场景，例如在资源管理和监控中，用户可以通过查询标签来了解各类资源的分类和属性。通过调用此接口，用户可以获取指定Service在所有工作空间中的标签列表，但无权限的工作空间标签数据将被过滤不返回。用户必须具有足够的权限，且目标资源需存在。查询成功后，返回指定Service的标签列表；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferServiceTagsRequest 请求对象
     * @return ListInferServiceTagsResponse
     */
    public ListInferServiceTagsResponse listInferServiceTags(ListInferServiceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferServiceTags);
    }

    /**
     * 查询某一类资源下的标签
     *
     * 该接口适用于需要获取用户当前项目中某一类资源（如指定的Service）的标签信息的场景，例如在资源管理和监控中，用户可以通过查询标签来了解各类资源的分类和属性。通过调用此接口，用户可以获取指定Service在所有工作空间中的标签列表，但无权限的工作空间标签数据将被过滤不返回。用户必须具有足够的权限，且目标资源需存在。查询成功后，返回指定Service的标签列表；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferServiceTagsRequest 请求对象
     * @return SyncInvoker<ListInferServiceTagsRequest, ListInferServiceTagsResponse>
     */
    public SyncInvoker<ListInferServiceTagsRequest, ListInferServiceTagsResponse> listInferServiceTagsInvoker(
        ListInferServiceTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferServiceTags, hcClient);
    }

    /**
     * 查询服务列表
     *
     * 支持分页和筛选
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferServicesRequest 请求对象
     * @return ListInferServicesResponse
     */
    public ListInferServicesResponse listInferServices(ListInferServicesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferServices);
    }

    /**
     * 查询服务列表
     *
     * 支持分页和筛选
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferServicesRequest 请求对象
     * @return SyncInvoker<ListInferServicesRequest, ListInferServicesResponse>
     */
    public SyncInvoker<ListInferServicesRequest, ListInferServicesResponse> listInferServicesInvoker(
        ListInferServicesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferServices, hcClient);
    }

    /**
     * 通过标签反查资源列表
     *
     * 该接口适用于需要根据标签或资源名称查找相关资源的场景，例如在资源管理和搜索中，用户可以通过指定标签或进行模糊查询来查找符合特定条件的资源。通过调用此接口，用户可以基于多个标签或资源名称进行精确或模糊查询，若不传标签则返回所有资源。用户必须具有足够的权限，且目标资源需存在。查询成功后，返回符合条件的资源列表；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferServicesByTagsRequest 请求对象
     * @return ListInferServicesByTagsResponse
     */
    public ListInferServicesByTagsResponse listInferServicesByTags(ListInferServicesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferServicesByTags);
    }

    /**
     * 通过标签反查资源列表
     *
     * 该接口适用于需要根据标签或资源名称查找相关资源的场景，例如在资源管理和搜索中，用户可以通过指定标签或进行模糊查询来查找符合特定条件的资源。通过调用此接口，用户可以基于多个标签或资源名称进行精确或模糊查询，若不传标签则返回所有资源。用户必须具有足够的权限，且目标资源需存在。查询成功后，返回符合条件的资源列表；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferServicesByTagsRequest 请求对象
     * @return SyncInvoker<ListInferServicesByTagsRequest, ListInferServicesByTagsResponse>
     */
    public SyncInvoker<ListInferServicesByTagsRequest, ListInferServicesByTagsResponse> listInferServicesByTagsInvoker(
        ListInferServicesByTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferServicesByTags, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表接口用于获取当前用户下的任务列表。该接口适用于以下场景：当需要查看任务状态、管理任务进度或统计任务数量时，用户可通过此接口获取当前用户下所有任务的详细信息。使用该接口的前提条件是用户已登录系统且具有查看任务的权限。调用接口成功后，系统将返回当前用户下的任务列表，包括任务ID、名称、状态、创建时间等信息。若用户未登录、无权限访问或系统中未配置任务，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listJobs);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表接口用于获取当前用户下的任务列表。该接口适用于以下场景：当需要查看任务状态、管理任务进度或统计任务数量时，用户可通过此接口获取当前用户下所有任务的详细信息。使用该接口的前提条件是用户已登录系统且具有查看任务的权限。调用接口成功后，系统将返回当前用户下的任务列表，包括任务ID、名称、状态、创建时间等信息。若用户未登录、无权限访问或系统中未配置任务，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listJobs, hcClient);
    }

    /**
     * 查询网络资源列表
     *
     * 查询网络资源列表接口用于获取系统中已创建的网络资源信息。该接口适用于以下场景：当用户需要监控网络状态、进行资源规划、排查网络问题或进行审计时，可通过此接口查询系统中现有的网络资源列表。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在网络资源。查询操作完成后，接口将返回网络资源列表，包含资源ID、类型、状态、创建时间等详细信息。若用户无权限、系统中无网络资源或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworksRequest 请求对象
     * @return ListNetworksResponse
     */
    public ListNetworksResponse listNetworks(ListNetworksRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listNetworks);
    }

    /**
     * 查询网络资源列表
     *
     * 查询网络资源列表接口用于获取系统中已创建的网络资源信息。该接口适用于以下场景：当用户需要监控网络状态、进行资源规划、排查网络问题或进行审计时，可通过此接口查询系统中现有的网络资源列表。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在网络资源。查询操作完成后，接口将返回网络资源列表，包含资源ID、类型、状态、创建时间等详细信息。若用户无权限、系统中无网络资源或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworksRequest 请求对象
     * @return SyncInvoker<ListNetworksRequest, ListNetworksResponse>
     */
    public SyncInvoker<ListNetworksRequest, ListNetworksResponse> listNetworksInvoker(ListNetworksRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listNetworks, hcClient);
    }

    /**
     * 查询节点池的节点列表
     *
     * 查询节点池的节点列表接口用于获取指定节点池中所有节点的详细信息。该接口适用于以下场景：当需要查看节点池的节点状态、资源使用情况或管理节点资源时，用户可通过此接口获取节点池中节点的详细信息。使用该接口的前提条件是节点池已存在且用户具有访问该节点池的权限。调用接口成功后，系统将返回节点池中所有节点的列表，包括节点ID、名称、状态、IP地址、资源使用情况等详细信息。若节点池不存在、用户无权限访问或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodePoolNodesRequest 请求对象
     * @return ListNodePoolNodesResponse
     */
    public ListNodePoolNodesResponse listNodePoolNodes(ListNodePoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listNodePoolNodes);
    }

    /**
     * 查询节点池的节点列表
     *
     * 查询节点池的节点列表接口用于获取指定节点池中所有节点的详细信息。该接口适用于以下场景：当需要查看节点池的节点状态、资源使用情况或管理节点资源时，用户可通过此接口获取节点池中节点的详细信息。使用该接口的前提条件是节点池已存在且用户具有访问该节点池的权限。调用接口成功后，系统将返回节点池中所有节点的列表，包括节点ID、名称、状态、IP地址、资源使用情况等详细信息。若节点池不存在、用户无权限访问或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodePoolNodesRequest 请求对象
     * @return SyncInvoker<ListNodePoolNodesRequest, ListNodePoolNodesResponse>
     */
    public SyncInvoker<ListNodePoolNodesRequest, ListNodePoolNodesResponse> listNodePoolNodesInvoker(
        ListNodePoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listNodePoolNodes, hcClient);
    }

    /**
     * 查询节点池列表
     *
     * 查询节点池列表接口用于获取指定节点池的列表信息。该接口适用于以下场景：当需要查看节点池的配置、状态或管理节点池资源时，用户可通过此接口获取节点池的详细信息。使用该接口的前提条件是节点池已存在且用户具有管理员权限。调用接口成功后，系统将返回节点池的列表，包括节点池ID、名称、节点数量、状态等详细信息。若节点池不存在、用户无权限操作或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodePoolsRequest 请求对象
     * @return ListNodePoolsResponse
     */
    public ListNodePoolsResponse listNodePools(ListNodePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listNodePools);
    }

    /**
     * 查询节点池列表
     *
     * 查询节点池列表接口用于获取指定节点池的列表信息。该接口适用于以下场景：当需要查看节点池的配置、状态或管理节点池资源时，用户可通过此接口获取节点池的详细信息。使用该接口的前提条件是节点池已存在且用户具有管理员权限。调用接口成功后，系统将返回节点池的列表，包括节点池ID、名称、节点数量、状态等详细信息。若节点池不存在、用户无权限操作或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodePoolsRequest 请求对象
     * @return SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>
     */
    public SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse> listNodePoolsInvoker(ListNodePoolsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listNodePools, hcClient);
    }

    /**
     * 查询插件模板列表
     *
     * 查询插件模板列表接口用于获取插件模板的基本信息列表。该接口适用于以下场景：当需要浏览或管理插件模板时，用户可通过此接口查询所有可用的插件模板信息，以便选择或进一步操作。使用该接口的前提条件是用户具有访问插件模板的权限，且插件模板服务处于正常运行状态。查询操作完成后，用户将获得插件模板的列表信息，包括模板名称、类型、版本等，便于后续的插件开发或管理。若用户无权限访问、插件模板服务不可用或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginTemplatesRequest 请求对象
     * @return ListPluginTemplatesResponse
     */
    public ListPluginTemplatesResponse listPluginTemplates(ListPluginTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listPluginTemplates);
    }

    /**
     * 查询插件模板列表
     *
     * 查询插件模板列表接口用于获取插件模板的基本信息列表。该接口适用于以下场景：当需要浏览或管理插件模板时，用户可通过此接口查询所有可用的插件模板信息，以便选择或进一步操作。使用该接口的前提条件是用户具有访问插件模板的权限，且插件模板服务处于正常运行状态。查询操作完成后，用户将获得插件模板的列表信息，包括模板名称、类型、版本等，便于后续的插件开发或管理。若用户无权限访问、插件模板服务不可用或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginTemplatesRequest 请求对象
     * @return SyncInvoker<ListPluginTemplatesRequest, ListPluginTemplatesResponse>
     */
    public SyncInvoker<ListPluginTemplatesRequest, ListPluginTemplatesResponse> listPluginTemplatesInvoker(
        ListPluginTemplatesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listPluginTemplates, hcClient);
    }

    /**
     * 查询资源池节点列表
     *
     * 查询资源池节点列表接口用于获取指定资源池中的节点信息列表。该接口适用于以下场景：当需要了解资源池中节点的分布、状态或资源使用情况时，用户可通过此接口查询资源池中的节点列表，以便进行资源监控、分配或管理。使用该接口的前提条件是资源池已创建且处于可用状态，且用户具有访问资源池的权限。查询操作完成后，用户将获得资源池中节点的详细信息，包括节点ID、状态、资源使用情况等，便于后续的资源管理和优化。若资源池不存在、用户无权限访问或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolNodesRequest 请求对象
     * @return ListPoolNodesResponse
     */
    public ListPoolNodesResponse listPoolNodes(ListPoolNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listPoolNodes);
    }

    /**
     * 查询资源池节点列表
     *
     * 查询资源池节点列表接口用于获取指定资源池中的节点信息列表。该接口适用于以下场景：当需要了解资源池中节点的分布、状态或资源使用情况时，用户可通过此接口查询资源池中的节点列表，以便进行资源监控、分配或管理。使用该接口的前提条件是资源池已创建且处于可用状态，且用户具有访问资源池的权限。查询操作完成后，用户将获得资源池中节点的详细信息，包括节点ID、状态、资源使用情况等，便于后续的资源管理和优化。若资源池不存在、用户无权限访问或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolNodesRequest 请求对象
     * @return SyncInvoker<ListPoolNodesRequest, ListPoolNodesResponse>
     */
    public SyncInvoker<ListPoolNodesRequest, ListPoolNodesResponse> listPoolNodesInvoker(ListPoolNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listPoolNodes, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件实例列表接口用于获取系统中已部署的插件实例信息。该接口适用于以下场景：当用户需要查看系统中已部署的插件实例、监控插件运行状态、管理插件配置或进行故障排查时，可通过此接口获取插件实例的详细信息。使用该接口的前提条件是用户具有查询权限且系统中已部署至少一个插件实例。调用该接口后，系统将返回所有插件实例的列表，包括插件名称、类型、状态、版本及部署环境等信息。若用户无权限访问或系统中未部署任何插件实例，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolPluginsRequest 请求对象
     * @return ListPoolPluginsResponse
     */
    public ListPoolPluginsResponse listPoolPlugins(ListPoolPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listPoolPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件实例列表接口用于获取系统中已部署的插件实例信息。该接口适用于以下场景：当用户需要查看系统中已部署的插件实例、监控插件运行状态、管理插件配置或进行故障排查时，可通过此接口获取插件实例的详细信息。使用该接口的前提条件是用户具有查询权限且系统中已部署至少一个插件实例。调用该接口后，系统将返回所有插件实例的列表，包括插件名称、类型、状态、版本及部署环境等信息。若用户无权限访问或系统中未部署任何插件实例，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolPluginsRequest 请求对象
     * @return SyncInvoker<ListPoolPluginsRequest, ListPoolPluginsResponse>
     */
    public SyncInvoker<ListPoolPluginsRequest, ListPoolPluginsResponse> listPoolPluginsInvoker(
        ListPoolPluginsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listPoolPlugins, hcClient);
    }

    /**
     * 查询资源池的所有标签
     *
     * 查询资源池所有标签接口用于获取用户当前项目下资源池的所有标签信息，默认查询所有工作空间，但无权限的工作空间不会返回标签数据。该接口适用于以下场景：当需要管理、分类或统计资源池的标签信息时，用户可通过此接口获取资源池的标签数据。使用该接口的前提条件是用户具有访问资源池的权限且资源池已存在。调用接口成功后，系统将返回用户当前项目下所有可访问工作空间的资源池标签信息。若用户无权限访问资源池、资源池不存在或项目未创建，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolTagsRequest 请求对象
     * @return ListPoolTagsResponse
     */
    public ListPoolTagsResponse listPoolTags(ListPoolTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listPoolTags);
    }

    /**
     * 查询资源池的所有标签
     *
     * 查询资源池所有标签接口用于获取用户当前项目下资源池的所有标签信息，默认查询所有工作空间，但无权限的工作空间不会返回标签数据。该接口适用于以下场景：当需要管理、分类或统计资源池的标签信息时，用户可通过此接口获取资源池的标签数据。使用该接口的前提条件是用户具有访问资源池的权限且资源池已存在。调用接口成功后，系统将返回用户当前项目下所有可访问工作空间的资源池标签信息。若用户无权限访问资源池、资源池不存在或项目未创建，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolTagsRequest 请求对象
     * @return SyncInvoker<ListPoolTagsRequest, ListPoolTagsResponse>
     */
    public SyncInvoker<ListPoolTagsRequest, ListPoolTagsResponse> listPoolTagsInvoker(ListPoolTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listPoolTags, hcClient);
    }

    /**
     * 查询资源池列表
     *
     * 查询资源池列表接口用于获取系统中已创建的资源池信息。该接口适用于以下场景：当用户需要监控资源池状态、进行资源规划、管理资源分配或进行审计时，可通过此接口查询系统中现有的资源池列表。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在资源池。查询操作完成后，接口将返回资源池列表，包含资源池ID、名称、类型、状态、资源配额等详细信息。若用户无权限、系统中无资源池或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listPools);
    }

    /**
     * 查询资源池列表
     *
     * 查询资源池列表接口用于获取系统中已创建的资源池信息。该接口适用于以下场景：当用户需要监控资源池状态、进行资源规划、管理资源分配或进行审计时，可通过此接口查询系统中现有的资源池列表。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在资源池。查询操作完成后，接口将返回资源池列表，包含资源池ID、名称、类型、状态、资源配额等详细信息。若用户无权限、系统中无资源池或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return SyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public SyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsInvoker(ListPoolsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listPools, hcClient);
    }

    /**
     * 查询资源规格列表
     *
     * 查询资源规格列表接口用于获取可用的资源规格信息。该接口适用于以下场景：当需要查看或选择资源规格以创建资源池、分配资源或了解可用资源规格时，用户可通过此接口获取资源规格的详细信息。使用该接口的前提条件是用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回资源规格的列表，包括规格ID、名称、CPU核数、内存大小、存储容量等详细信息。若用户无权限访问该接口或系统中未配置资源规格，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceFlavorsRequest 请求对象
     * @return ListResourceFlavorsResponse
     */
    public ListResourceFlavorsResponse listResourceFlavors(ListResourceFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listResourceFlavors);
    }

    /**
     * 查询资源规格列表
     *
     * 查询资源规格列表接口用于获取可用的资源规格信息。该接口适用于以下场景：当需要查看或选择资源规格以创建资源池、分配资源或了解可用资源规格时，用户可通过此接口获取资源规格的详细信息。使用该接口的前提条件是用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回资源规格的列表，包括规格ID、名称、CPU核数、内存大小、存储容量等详细信息。若用户无权限访问该接口或系统中未配置资源规格，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceFlavorsRequest 请求对象
     * @return SyncInvoker<ListResourceFlavorsRequest, ListResourceFlavorsResponse>
     */
    public SyncInvoker<ListResourceFlavorsRequest, ListResourceFlavorsResponse> listResourceFlavorsInvoker(
        ListResourceFlavorsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listResourceFlavors, hcClient);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return ListScheduledEventsResponse
     */
    public ListScheduledEventsResponse listScheduledEvents(ListScheduledEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listScheduledEvents);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return SyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse>
     */
    public SyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse> listScheduledEventsInvoker(
        ListScheduledEventsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listScheduledEvents, hcClient);
    }

    /**
     * 查询训练实验列表
     *
     * 查询训练实验列表接口用于获取ModelArts平台上用户已创建的训练实验的列表。
     * 该接口适用于以下场景：当用户需要查看所有或部分训练实验的概要信息，如实验名称、描述、创建时间等时，可以通过此接口查询训练实验列表。使用该接口的前提条件是用户已登录ModelArts平台并具有查看训练实验的权限。查询操作完成后，系统将返回符合条件的训练实验列表。若用户无权限操作或查询条件不合法，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingExperimentsRequest 请求对象
     * @return ListTrainingExperimentsResponse
     */
    public ListTrainingExperimentsResponse listTrainingExperiments(ListTrainingExperimentsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listTrainingExperiments);
    }

    /**
     * 查询训练实验列表
     *
     * 查询训练实验列表接口用于获取ModelArts平台上用户已创建的训练实验的列表。
     * 该接口适用于以下场景：当用户需要查看所有或部分训练实验的概要信息，如实验名称、描述、创建时间等时，可以通过此接口查询训练实验列表。使用该接口的前提条件是用户已登录ModelArts平台并具有查看训练实验的权限。查询操作完成后，系统将返回符合条件的训练实验列表。若用户无权限操作或查询条件不合法，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingExperimentsRequest 请求对象
     * @return SyncInvoker<ListTrainingExperimentsRequest, ListTrainingExperimentsResponse>
     */
    public SyncInvoker<ListTrainingExperimentsRequest, ListTrainingExperimentsResponse> listTrainingExperimentsInvoker(
        ListTrainingExperimentsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listTrainingExperiments, hcClient);
    }

    /**
     * 获取训练作业事件列表
     *
     * 获取训练作业事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobEventsRequest 请求对象
     * @return ListTrainingJobEventsResponse
     */
    public ListTrainingJobEventsResponse listTrainingJobEvents(ListTrainingJobEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listTrainingJobEvents);
    }

    /**
     * 获取训练作业事件列表
     *
     * 获取训练作业事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobEventsRequest 请求对象
     * @return SyncInvoker<ListTrainingJobEventsRequest, ListTrainingJobEventsResponse>
     */
    public SyncInvoker<ListTrainingJobEventsRequest, ListTrainingJobEventsResponse> listTrainingJobEventsInvoker(
        ListTrainingJobEventsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listTrainingJobEvents, hcClient);
    }

    /**
     * 获取训练作业流程阶段信息列表
     *
     * 获取训练作业流程阶段信息列表接口用于获取ModelArts平台上指定训练作业的流程阶段信息列表。
     * 该接口适用于以下场景：当用户需要查看特定训练作业的流程阶段记录时，可以通过此接口获取阶段信息列表。使用该接口的前提条件是用户已知训练作业ID，并具有查看阶段信息列表的权限。查询操作完成后，平台将返回包含训练作业的阶段信息记录。若训练作业ID不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobStagesRequest 请求对象
     * @return ListTrainingJobStagesResponse
     */
    public ListTrainingJobStagesResponse listTrainingJobStages(ListTrainingJobStagesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listTrainingJobStages);
    }

    /**
     * 获取训练作业流程阶段信息列表
     *
     * 获取训练作业流程阶段信息列表接口用于获取ModelArts平台上指定训练作业的流程阶段信息列表。
     * 该接口适用于以下场景：当用户需要查看特定训练作业的流程阶段记录时，可以通过此接口获取阶段信息列表。使用该接口的前提条件是用户已知训练作业ID，并具有查看阶段信息列表的权限。查询操作完成后，平台将返回包含训练作业的阶段信息记录。若训练作业ID不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobStagesRequest 请求对象
     * @return SyncInvoker<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse>
     */
    public SyncInvoker<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse> listTrainingJobStagesInvoker(
        ListTrainingJobStagesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listTrainingJobStages, hcClient);
    }

    /**
     * 查询训练作业的实例历史调度信息
     *
     * 查询训练作业调度的实例IP、节点IP等信息，可通过schedule_count参数查询具体的某一次调度的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobTasksRequest 请求对象
     * @return ListTrainingJobTasksResponse
     */
    public ListTrainingJobTasksResponse listTrainingJobTasks(ListTrainingJobTasksRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listTrainingJobTasks);
    }

    /**
     * 查询训练作业的实例历史调度信息
     *
     * 查询训练作业调度的实例IP、节点IP等信息，可通过schedule_count参数查询具体的某一次调度的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobTasksRequest 请求对象
     * @return SyncInvoker<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse>
     */
    public SyncInvoker<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse> listTrainingJobTasksInvoker(
        ListTrainingJobTasksRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listTrainingJobTasks, hcClient);
    }

    /**
     * 查询训练作业列表
     *
     * 根据指定查询条件查询用户创建的训练作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobsRequest 请求对象
     * @return ListTrainingJobsResponse
     */
    public ListTrainingJobsResponse listTrainingJobs(ListTrainingJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listTrainingJobs);
    }

    /**
     * 查询训练作业列表
     *
     * 根据指定查询条件查询用户创建的训练作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobsRequest 请求对象
     * @return SyncInvoker<ListTrainingJobsRequest, ListTrainingJobsResponse>
     */
    public SyncInvoker<ListTrainingJobsRequest, ListTrainingJobsResponse> listTrainingJobsInvoker(
        ListTrainingJobsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listTrainingJobs, hcClient);
    }

    /**
     * 查询资源池作业列表
     *
     * 查询专属资源池作业列表接口用于获取指定专属资源池中的作业信息列表。该接口适用于以下场景：当需要监控专属资源池的资源使用情况、查看作业状态或管理资源分配时，用户可通过此接口获取专属资源池中作业的详细信息。使用该接口的前提条件是专属资源池已存在且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回专属资源池中作业的列表，包括作业ID、名称、状态、资源使用情况等详细信息。若专属资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadsRequest 请求对象
     * @return ListWorkloadsResponse
     */
    public ListWorkloadsResponse listWorkloads(ListWorkloadsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listWorkloads);
    }

    /**
     * 查询资源池作业列表
     *
     * 查询专属资源池作业列表接口用于获取指定专属资源池中的作业信息列表。该接口适用于以下场景：当需要监控专属资源池的资源使用情况、查看作业状态或管理资源分配时，用户可通过此接口获取专属资源池中作业的详细信息。使用该接口的前提条件是专属资源池已存在且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回专属资源池中作业的列表，包括作业ID、名称、状态、资源使用情况等详细信息。若专属资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadsRequest 请求对象
     * @return SyncInvoker<ListWorkloadsRequest, ListWorkloadsResponse>
     */
    public SyncInvoker<ListWorkloadsRequest, ListWorkloadsResponse> listWorkloadsInvoker(ListWorkloadsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listWorkloads, hcClient);
    }

    /**
     * 查询工作空间列表
     *
     * 查询工作空间列表，响应消息体中包含详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceRequest 请求对象
     * @return ListWorkspaceResponse
     */
    public ListWorkspaceResponse listWorkspace(ListWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listWorkspace);
    }

    /**
     * 查询工作空间列表
     *
     * 查询工作空间列表，响应消息体中包含详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceRequest 请求对象
     * @return SyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse>
     */
    public SyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse> listWorkspaceInvoker(ListWorkspaceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listWorkspace, hcClient);
    }

    /**
     * 修改添加自定义URL申请
     *
     * 本接口用于修改添加内网自定义URL请求，适用于需要同时更新或者添加多个内网接入点的场景。调用此接口前，确保调用者具备相应的更新权限，提供需要更新的参数，如IP地址、VPC ID、子网ID等。指定的内网接入点将添加新的配置，新的配置将对相关服务生效。如果提供的内网接入点ID列表中包含无效或不存在的ID，接口将返回相应的异常信息，提示用户检查ID的有效性，如果提供的更新参数不符合格式要求（如IP地址格式不正确），接口将返回相应的异常信息，提示用户检查参数的有效性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInferIntranetConnectionsRequest 请求对象
     * @return ModifyInferIntranetConnectionsResponse
     */
    public ModifyInferIntranetConnectionsResponse modifyInferIntranetConnections(
        ModifyInferIntranetConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.modifyInferIntranetConnections);
    }

    /**
     * 修改添加自定义URL申请
     *
     * 本接口用于修改添加内网自定义URL请求，适用于需要同时更新或者添加多个内网接入点的场景。调用此接口前，确保调用者具备相应的更新权限，提供需要更新的参数，如IP地址、VPC ID、子网ID等。指定的内网接入点将添加新的配置，新的配置将对相关服务生效。如果提供的内网接入点ID列表中包含无效或不存在的ID，接口将返回相应的异常信息，提示用户检查ID的有效性，如果提供的更新参数不符合格式要求（如IP地址格式不正确），接口将返回相应的异常信息，提示用户检查参数的有效性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInferIntranetConnectionsRequest 请求对象
     * @return SyncInvoker<ModifyInferIntranetConnectionsRequest, ModifyInferIntranetConnectionsResponse>
     */
    public SyncInvoker<ModifyInferIntranetConnectionsRequest, ModifyInferIntranetConnectionsResponse> modifyInferIntranetConnectionsInvoker(
        ModifyInferIntranetConnectionsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.modifyInferIntranetConnections, hcClient);
    }

    /**
     * 训练作业事件上报接口
     *
     * 训练事件上报给业务面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifyTrainingJobInformationRequest 请求对象
     * @return NotifyTrainingJobInformationResponse
     */
    public NotifyTrainingJobInformationResponse notifyTrainingJobInformation(
        NotifyTrainingJobInformationRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.notifyTrainingJobInformation);
    }

    /**
     * 训练作业事件上报接口
     *
     * 训练事件上报给业务面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifyTrainingJobInformationRequest 请求对象
     * @return SyncInvoker<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse>
     */
    public SyncInvoker<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse> notifyTrainingJobInformationInvoker(
        NotifyTrainingJobInformationRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.notifyTrainingJobInformation, hcClient);
    }

    /**
     * 更新网络资源
     *
     * 更新网络资源接口用于修改指定网络资源的配置信息。该接口适用于以下场景：当需要调整网络资源的属性、修复配置错误或优化资源设置时，用户可通过此接口更新指定网络资源的详细信息。使用该接口的前提条件是网络资源已存在且用户具有管理员权限。更新操作完成后，指定网络资源的配置信息将被成功修改，系统将反映最新的资源状态和属性。若指定的网络资源不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchNetworkRequest 请求对象
     * @return PatchNetworkResponse
     */
    public PatchNetworkResponse patchNetwork(PatchNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.patchNetwork);
    }

    /**
     * 更新网络资源
     *
     * 更新网络资源接口用于修改指定网络资源的配置信息。该接口适用于以下场景：当需要调整网络资源的属性、修复配置错误或优化资源设置时，用户可通过此接口更新指定网络资源的详细信息。使用该接口的前提条件是网络资源已存在且用户具有管理员权限。更新操作完成后，指定网络资源的配置信息将被成功修改，系统将反映最新的资源状态和属性。若指定的网络资源不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchNetworkRequest 请求对象
     * @return SyncInvoker<PatchNetworkRequest, PatchNetworkResponse>
     */
    public SyncInvoker<PatchNetworkRequest, PatchNetworkResponse> patchNetworkInvoker(PatchNetworkRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.patchNetwork, hcClient);
    }

    /**
     * 更新节点池
     *
     * 更新节点池接口用于修改指定节点池的配置信息。该接口适用于以下场景：当需要扩展节点池容量、调整节点规格、优化资源分配或修复节点池配置时，用户可通过此接口更新节点池的相关信息。使用该接口的前提条件是节点池已存在且用户具有管理员权限。更新操作完成后，节点池的配置将被更新，包括节点数量、规格、网络配置等参数。若节点池不存在、用户无权限操作或配置参数错误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchNodePoolRequest 请求对象
     * @return PatchNodePoolResponse
     */
    public PatchNodePoolResponse patchNodePool(PatchNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.patchNodePool);
    }

    /**
     * 更新节点池
     *
     * 更新节点池接口用于修改指定节点池的配置信息。该接口适用于以下场景：当需要扩展节点池容量、调整节点规格、优化资源分配或修复节点池配置时，用户可通过此接口更新节点池的相关信息。使用该接口的前提条件是节点池已存在且用户具有管理员权限。更新操作完成后，节点池的配置将被更新，包括节点数量、规格、网络配置等参数。若节点池不存在、用户无权限操作或配置参数错误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchNodePoolRequest 请求对象
     * @return SyncInvoker<PatchNodePoolRequest, PatchNodePoolResponse>
     */
    public SyncInvoker<PatchNodePoolRequest, PatchNodePoolResponse> patchNodePoolInvoker(PatchNodePoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.patchNodePool, hcClient);
    }

    /**
     * 更新资源池
     *
     * 更新资源池接口用于修改指定资源池的配置和容量。该接口适用于以下场景：当资源池需要扩展容量、调整配置或优化性能时，用户可通过此接口更新资源池的相关信息。使用该接口的前提条件是资源池已存在且用户具有管理员权限。更新操作完成后，资源池的配置和容量将被更新，相关资源和配置也将被调整。若资源池不存在、用户无权限操作或资源池处于不可更新状态，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchPoolRequest 请求对象
     * @return PatchPoolResponse
     */
    public PatchPoolResponse patchPool(PatchPoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.patchPool);
    }

    /**
     * 更新资源池
     *
     * 更新资源池接口用于修改指定资源池的配置和容量。该接口适用于以下场景：当资源池需要扩展容量、调整配置或优化性能时，用户可通过此接口更新资源池的相关信息。使用该接口的前提条件是资源池已存在且用户具有管理员权限。更新操作完成后，资源池的配置和容量将被更新，相关资源和配置也将被调整。若资源池不存在、用户无权限操作或资源池处于不可更新状态，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchPoolRequest 请求对象
     * @return SyncInvoker<PatchPoolRequest, PatchPoolResponse>
     */
    public SyncInvoker<PatchPoolRequest, PatchPoolResponse> patchPoolInvoker(PatchPoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.patchPool, hcClient);
    }

    /**
     * 注册自定义镜像
     *
     * 注册自定义镜像接口用于将用户自定义的镜像注册到ModelArts镜像管理。该接口适用于以下场景：当用户需要将自己的自定义镜像（如特定算法环境、工具链或配置）集成到ModelArts平台时，可通过此接口将镜像注册到镜像管理中以便后续使用。使用该接口的前提条件是用户具备ModelArts镜像管理权限，并且需要提供有效的镜像地址和符合要求的镜像格式。注册操作完成后，自定义镜像将被成功添加到ModelArts镜像列表中，用户可以在后续任务中选择使用该镜像。若镜像地址无效、镜像格式不符合要求或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterImageRequest 请求对象
     * @return RegisterImageResponse
     */
    public RegisterImageResponse registerImage(RegisterImageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.registerImage);
    }

    /**
     * 注册自定义镜像
     *
     * 注册自定义镜像接口用于将用户自定义的镜像注册到ModelArts镜像管理。该接口适用于以下场景：当用户需要将自己的自定义镜像（如特定算法环境、工具链或配置）集成到ModelArts平台时，可通过此接口将镜像注册到镜像管理中以便后续使用。使用该接口的前提条件是用户具备ModelArts镜像管理权限，并且需要提供有效的镜像地址和符合要求的镜像格式。注册操作完成后，自定义镜像将被成功添加到ModelArts镜像列表中，用户可以在后续任务中选择使用该镜像。若镜像地址无效、镜像格式不符合要求或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterImageRequest 请求对象
     * @return SyncInvoker<RegisterImageRequest, RegisterImageResponse>
     */
    public SyncInvoker<RegisterImageRequest, RegisterImageResponse> registerImageInvoker(RegisterImageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.registerImage, hcClient);
    }

    /**
     * 查询算法详情
     *
     * 根据算法id查询指定算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmByUuidRequest 请求对象
     * @return ShowAlgorithmByUuidResponse
     */
    public ShowAlgorithmByUuidResponse showAlgorithmByUuid(ShowAlgorithmByUuidRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAlgorithmByUuid);
    }

    /**
     * 查询算法详情
     *
     * 根据算法id查询指定算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmByUuidRequest 请求对象
     * @return SyncInvoker<ShowAlgorithmByUuidRequest, ShowAlgorithmByUuidResponse>
     */
    public SyncInvoker<ShowAlgorithmByUuidRequest, ShowAlgorithmByUuidResponse> showAlgorithmByUuidInvoker(
        ShowAlgorithmByUuidRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAlgorithmByUuid, hcClient);
    }

    /**
     * 查询授权模式
     *
     * 查询授权模式接口用于获取指定资源或功能的授权方式和权限配置信息。该接口适用于以下场景：当系统管理员需要查看资源的访问权限设置、开发者需要验证授权策略配置是否正确，或安全审计人员需要检查授权配置是否符合安全规范时，可通过此接口查询授权模式的详细信息。使用该接口的前提条件是用户具有查询权限且目标资源或功能的授权模式已配置。调用成功后，接口将返回授权模式的类型、规则及权限范围等详细信息。若用户无权限访问该接口，或目标资源的授权模式未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthmodeDetailRequest 请求对象
     * @return ShowAuthmodeDetailResponse
     */
    public ShowAuthmodeDetailResponse showAuthmodeDetail(ShowAuthmodeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAuthmodeDetail);
    }

    /**
     * 查询授权模式
     *
     * 查询授权模式接口用于获取指定资源或功能的授权方式和权限配置信息。该接口适用于以下场景：当系统管理员需要查看资源的访问权限设置、开发者需要验证授权策略配置是否正确，或安全审计人员需要检查授权配置是否符合安全规范时，可通过此接口查询授权模式的详细信息。使用该接口的前提条件是用户具有查询权限且目标资源或功能的授权模式已配置。调用成功后，接口将返回授权模式的类型、规则及权限范围等详细信息。若用户无权限访问该接口，或目标资源的授权模式未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthmodeDetailRequest 请求对象
     * @return SyncInvoker<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse>
     */
    public SyncInvoker<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse> showAuthmodeDetailInvoker(
        ShowAuthmodeDetailRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAuthmodeDetail, hcClient);
    }

    /**
     * 获取某个超参敏感度分析图像的路径
     *
     * 获取某个超参敏感度分析图像的保存路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchParamAnalysisResultPathRequest 请求对象
     * @return ShowAutoSearchParamAnalysisResultPathResponse
     */
    public ShowAutoSearchParamAnalysisResultPathResponse showAutoSearchParamAnalysisResultPath(
        ShowAutoSearchParamAnalysisResultPathRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAutoSearchParamAnalysisResultPath);
    }

    /**
     * 获取某个超参敏感度分析图像的路径
     *
     * 获取某个超参敏感度分析图像的保存路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchParamAnalysisResultPathRequest 请求对象
     * @return SyncInvoker<ShowAutoSearchParamAnalysisResultPathRequest, ShowAutoSearchParamAnalysisResultPathResponse>
     */
    public SyncInvoker<ShowAutoSearchParamAnalysisResultPathRequest, ShowAutoSearchParamAnalysisResultPathResponse> showAutoSearchParamAnalysisResultPathInvoker(
        ShowAutoSearchParamAnalysisResultPathRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAutoSearchParamAnalysisResultPath, hcClient);
    }

    /**
     * 获取超参敏感度分析结果
     *
     * 获取超参敏感度分析结果的汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchParamsAnalysisRequest 请求对象
     * @return ShowAutoSearchParamsAnalysisResponse
     */
    public ShowAutoSearchParamsAnalysisResponse showAutoSearchParamsAnalysis(
        ShowAutoSearchParamsAnalysisRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAutoSearchParamsAnalysis);
    }

    /**
     * 获取超参敏感度分析结果
     *
     * 获取超参敏感度分析结果的汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchParamsAnalysisRequest 请求对象
     * @return SyncInvoker<ShowAutoSearchParamsAnalysisRequest, ShowAutoSearchParamsAnalysisResponse>
     */
    public SyncInvoker<ShowAutoSearchParamsAnalysisRequest, ShowAutoSearchParamsAnalysisResponse> showAutoSearchParamsAnalysisInvoker(
        ShowAutoSearchParamsAnalysisRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAutoSearchParamsAnalysis, hcClient);
    }

    /**
     * 查询超参搜索某个trial的结果
     *
     * 根据传入的trial_id，查询指定trial的搜索结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchPerTrialRequest 请求对象
     * @return ShowAutoSearchPerTrialResponse
     */
    public ShowAutoSearchPerTrialResponse showAutoSearchPerTrial(ShowAutoSearchPerTrialRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAutoSearchPerTrial);
    }

    /**
     * 查询超参搜索某个trial的结果
     *
     * 根据传入的trial_id，查询指定trial的搜索结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchPerTrialRequest 请求对象
     * @return SyncInvoker<ShowAutoSearchPerTrialRequest, ShowAutoSearchPerTrialResponse>
     */
    public SyncInvoker<ShowAutoSearchPerTrialRequest, ShowAutoSearchPerTrialResponse> showAutoSearchPerTrialInvoker(
        ShowAutoSearchPerTrialRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAutoSearchPerTrial, hcClient);
    }

    /**
     * 提前终止自动化搜索作业的某个trial
     *
     * 提前终止自动化搜索作业的某个trial。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchTrialEarlyStopRequest 请求对象
     * @return ShowAutoSearchTrialEarlyStopResponse
     */
    public ShowAutoSearchTrialEarlyStopResponse showAutoSearchTrialEarlyStop(
        ShowAutoSearchTrialEarlyStopRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAutoSearchTrialEarlyStop);
    }

    /**
     * 提前终止自动化搜索作业的某个trial
     *
     * 提前终止自动化搜索作业的某个trial。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchTrialEarlyStopRequest 请求对象
     * @return SyncInvoker<ShowAutoSearchTrialEarlyStopRequest, ShowAutoSearchTrialEarlyStopResponse>
     */
    public SyncInvoker<ShowAutoSearchTrialEarlyStopRequest, ShowAutoSearchTrialEarlyStopResponse> showAutoSearchTrialEarlyStopInvoker(
        ShowAutoSearchTrialEarlyStopRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAutoSearchTrialEarlyStop, hcClient);
    }

    /**
     * 查询超参搜索所有trial的结果
     *
     * 查询超参搜索所有trial的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchTrialsRequest 请求对象
     * @return ShowAutoSearchTrialsResponse
     */
    public ShowAutoSearchTrialsResponse showAutoSearchTrials(ShowAutoSearchTrialsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAutoSearchTrials);
    }

    /**
     * 查询超参搜索所有trial的结果
     *
     * 查询超参搜索所有trial的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchTrialsRequest 请求对象
     * @return SyncInvoker<ShowAutoSearchTrialsRequest, ShowAutoSearchTrialsResponse>
     */
    public SyncInvoker<ShowAutoSearchTrialsRequest, ShowAutoSearchTrialsResponse> showAutoSearchTrialsInvoker(
        ShowAutoSearchTrialsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAutoSearchTrials, hcClient);
    }

    /**
     * 获取自动化搜索作业yaml模板的内容
     *
     * 获取自动化搜索作业yaml模板的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchYamlTemplateContentRequest 请求对象
     * @return ShowAutoSearchYamlTemplateContentResponse
     */
    public ShowAutoSearchYamlTemplateContentResponse showAutoSearchYamlTemplateContent(
        ShowAutoSearchYamlTemplateContentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAutoSearchYamlTemplateContent);
    }

    /**
     * 获取自动化搜索作业yaml模板的内容
     *
     * 获取自动化搜索作业yaml模板的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchYamlTemplateContentRequest 请求对象
     * @return SyncInvoker<ShowAutoSearchYamlTemplateContentRequest, ShowAutoSearchYamlTemplateContentResponse>
     */
    public SyncInvoker<ShowAutoSearchYamlTemplateContentRequest, ShowAutoSearchYamlTemplateContentResponse> showAutoSearchYamlTemplateContentInvoker(
        ShowAutoSearchYamlTemplateContentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAutoSearchYamlTemplateContent, hcClient);
    }

    /**
     * 获取自动化搜索作业yaml模板的信息
     *
     * 获取自动化搜索作业yaml模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchYamlTemplatesInfoRequest 请求对象
     * @return ShowAutoSearchYamlTemplatesInfoResponse
     */
    public ShowAutoSearchYamlTemplatesInfoResponse showAutoSearchYamlTemplatesInfo(
        ShowAutoSearchYamlTemplatesInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAutoSearchYamlTemplatesInfo);
    }

    /**
     * 获取自动化搜索作业yaml模板的信息
     *
     * 获取自动化搜索作业yaml模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchYamlTemplatesInfoRequest 请求对象
     * @return SyncInvoker<ShowAutoSearchYamlTemplatesInfoRequest, ShowAutoSearchYamlTemplatesInfoResponse>
     */
    public SyncInvoker<ShowAutoSearchYamlTemplatesInfoRequest, ShowAutoSearchYamlTemplatesInfoResponse> showAutoSearchYamlTemplatesInfoInvoker(
        ShowAutoSearchYamlTemplatesInfoRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAutoSearchYamlTemplatesInfo, hcClient);
    }

    /**
     * 获取动态挂载存储实例详情
     *
     * 获取动态挂载OBS实例详情接口用于获取已挂载到运行中Notebook实例中的存储实例的详细信息。
     * 
     * 适用场景：用户需要查看Notebook实例中已挂载的存储实例的详细信息时，可通过此接口获取。使用该接口的前提条件是用户已登录系统并具有访问目标Notebook实例的权限。调用该接口后，系统将返回指定Notebook实例中挂载的存储实例的详细信息。若用户无权限访问指定实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDynamicStorageRequest 请求对象
     * @return ShowDynamicStorageResponse
     */
    public ShowDynamicStorageResponse showDynamicStorage(ShowDynamicStorageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showDynamicStorage);
    }

    /**
     * 获取动态挂载存储实例详情
     *
     * 获取动态挂载OBS实例详情接口用于获取已挂载到运行中Notebook实例中的存储实例的详细信息。
     * 
     * 适用场景：用户需要查看Notebook实例中已挂载的存储实例的详细信息时，可通过此接口获取。使用该接口的前提条件是用户已登录系统并具有访问目标Notebook实例的权限。调用该接口后，系统将返回指定Notebook实例中挂载的存储实例的详细信息。若用户无权限访问指定实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDynamicStorageRequest 请求对象
     * @return SyncInvoker<ShowDynamicStorageRequest, ShowDynamicStorageResponse>
     */
    public SyncInvoker<ShowDynamicStorageRequest, ShowDynamicStorageResponse> showDynamicStorageInvoker(
        ShowDynamicStorageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showDynamicStorage, hcClient);
    }

    /**
     * 查询镜像详情
     *
     * 查询镜像详情接口用于查询镜像的详细信息。该接口适用于以下场景：当用户需要了解特定镜像的详细信息（如镜像名称、版本、创建时间、大小、状态等）或对镜像执行一些操作时，可通过此接口获取镜像的详细信息。使用该接口的前提条件是用户具备镜像管理权限，并且待查询镜像有效且存在。查询操作完成后，将返回镜像的详细信息，包括镜像ID、名称、版本、创建时间、大小以及状态等。若镜像不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageRequest 请求对象
     * @return ShowImageResponse
     */
    public ShowImageResponse showImage(ShowImageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showImage);
    }

    /**
     * 查询镜像详情
     *
     * 查询镜像详情接口用于查询镜像的详细信息。该接口适用于以下场景：当用户需要了解特定镜像的详细信息（如镜像名称、版本、创建时间、大小、状态等）或对镜像执行一些操作时，可通过此接口获取镜像的详细信息。使用该接口的前提条件是用户具备镜像管理权限，并且待查询镜像有效且存在。查询操作完成后，将返回镜像的详细信息，包括镜像ID、名称、版本、创建时间、大小以及状态等。若镜像不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageRequest 请求对象
     * @return SyncInvoker<ShowImageRequest, ShowImageResponse>
     */
    public SyncInvoker<ShowImageRequest, ShowImageResponse> showImageInvoker(ShowImageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showImage, hcClient);
    }

    /**
     * 查询服务部署详情
     *
     * 通过服务ID、部署ID查询对应的部署详情，调用者可以通过有效的服务ID、部署ID获取部署的名称、状态、服务实例、配置参数等详细信息。调用者需具有足够的权限，且输入的服务ID、部署ID必须有效。查询成功时返回部署详细信息，查询失败时返回特定的错误码和错误信息。若服务ID或者部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferDeploymentRequest 请求对象
     * @return ShowInferDeploymentResponse
     */
    public ShowInferDeploymentResponse showInferDeployment(ShowInferDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInferDeployment);
    }

    /**
     * 查询服务部署详情
     *
     * 通过服务ID、部署ID查询对应的部署详情，调用者可以通过有效的服务ID、部署ID获取部署的名称、状态、服务实例、配置参数等详细信息。调用者需具有足够的权限，且输入的服务ID、部署ID必须有效。查询成功时返回部署详细信息，查询失败时返回特定的错误码和错误信息。若服务ID或者部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferDeploymentRequest 请求对象
     * @return SyncInvoker<ShowInferDeploymentRequest, ShowInferDeploymentResponse>
     */
    public SyncInvoker<ShowInferDeploymentRequest, ShowInferDeploymentResponse> showInferDeploymentInvoker(
        ShowInferDeploymentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInferDeployment, hcClient);
    }

    /**
     * 查询在线服务部署版本详情
     *
     * 此接口用于获取指定服务部署版本的详细信息，适用于需要查看特定版本的详细配置和状态的场景，例如确认版本的功能、性能参数或发布历史。请求需包含有效的服务ID、部署ID及版本号。用户必须具有对目标服务部署的查看权限。请求成功后，返回该版本的详细信息，包括版本号、发布时间、配置参数和状态。若服务ID、部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；若服务部署无该版本信息，则返回404 Not Found。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferDeploymentVersionRequest 请求对象
     * @return ShowInferDeploymentVersionResponse
     */
    public ShowInferDeploymentVersionResponse showInferDeploymentVersion(ShowInferDeploymentVersionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInferDeploymentVersion);
    }

    /**
     * 查询在线服务部署版本详情
     *
     * 此接口用于获取指定服务部署版本的详细信息，适用于需要查看特定版本的详细配置和状态的场景，例如确认版本的功能、性能参数或发布历史。请求需包含有效的服务ID、部署ID及版本号。用户必须具有对目标服务部署的查看权限。请求成功后，返回该版本的详细信息，包括版本号、发布时间、配置参数和状态。若服务ID、部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；若服务部署无该版本信息，则返回404 Not Found。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferDeploymentVersionRequest 请求对象
     * @return SyncInvoker<ShowInferDeploymentVersionRequest, ShowInferDeploymentVersionResponse>
     */
    public SyncInvoker<ShowInferDeploymentVersionRequest, ShowInferDeploymentVersionResponse> showInferDeploymentVersionInvoker(
        ShowInferDeploymentVersionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInferDeploymentVersion, hcClient);
    }

    /**
     * 查询服务详情
     *
     * 通过服务ID查询对应的服务详情，调用者可以通过有效的服务ID获取服务的名称、状态、服务实例、配置参数等详细信息。调用者需具有足够的权限，且输入的服务ID必须有效。查询成功时返回服务详细信息，查询失败时返回特定的错误码和错误信息。若服务ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferServiceRequest 请求对象
     * @return ShowInferServiceResponse
     */
    public ShowInferServiceResponse showInferService(ShowInferServiceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInferService);
    }

    /**
     * 查询服务详情
     *
     * 通过服务ID查询对应的服务详情，调用者可以通过有效的服务ID获取服务的名称、状态、服务实例、配置参数等详细信息。调用者需具有足够的权限，且输入的服务ID必须有效。查询成功时返回服务详细信息，查询失败时返回特定的错误码和错误信息。若服务ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferServiceRequest 请求对象
     * @return SyncInvoker<ShowInferServiceRequest, ShowInferServiceResponse>
     */
    public SyncInvoker<ShowInferServiceRequest, ShowInferServiceResponse> showInferServiceInvoker(
        ShowInferServiceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInferService, hcClient);
    }

    /**
     * 查询纳管资源池详情
     *
     * 该接口允许用户通过指定资源池的ID来查询纳管资源池的详细信息，包括实例ID、名称、Flavor规格、实例状态和实例可访问的URL。此功能适用于需要监控或管理云资源的用户，使用该接口前，用户需确保已拥有访问权限及正确的资源池ID。执行成功后，用户将获得所需的实例详情，可用于进一步的资源管理和配置。如果资源池ID无效或用户没有相应的访问权限，接口将返回错误信息，如404 Not Found或401 Unauthorized。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferServiceClusterRequest 请求对象
     * @return ShowInferServiceClusterResponse
     */
    public ShowInferServiceClusterResponse showInferServiceCluster(ShowInferServiceClusterRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInferServiceCluster);
    }

    /**
     * 查询纳管资源池详情
     *
     * 该接口允许用户通过指定资源池的ID来查询纳管资源池的详细信息，包括实例ID、名称、Flavor规格、实例状态和实例可访问的URL。此功能适用于需要监控或管理云资源的用户，使用该接口前，用户需确保已拥有访问权限及正确的资源池ID。执行成功后，用户将获得所需的实例详情，可用于进一步的资源管理和配置。如果资源池ID无效或用户没有相应的访问权限，接口将返回错误信息，如404 Not Found或401 Unauthorized。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferServiceClusterRequest 请求对象
     * @return SyncInvoker<ShowInferServiceClusterRequest, ShowInferServiceClusterResponse>
     */
    public SyncInvoker<ShowInferServiceClusterRequest, ShowInferServiceClusterResponse> showInferServiceClusterInvoker(
        ShowInferServiceClusterRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInferServiceCluster, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 该接口适用于需要获取资源（如模型、数据集、服务等）的标签信息的场景，例如在资源管理或分类中，用户可以通过查询标签来了解资源的用途、状态或其他属性。通过调用此接口，用户可以通过资源ID获取指定资源的所有标签列表。用户必须具有足够的权限，且目标资源需存在。查询成功后，返回资源的标签列表；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferServiceTagsRequest 请求对象
     * @return ShowInferServiceTagsResponse
     */
    public ShowInferServiceTagsResponse showInferServiceTags(ShowInferServiceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInferServiceTags);
    }

    /**
     * 查询资源标签
     *
     * 该接口适用于需要获取资源（如模型、数据集、服务等）的标签信息的场景，例如在资源管理或分类中，用户可以通过查询标签来了解资源的用途、状态或其他属性。通过调用此接口，用户可以通过资源ID获取指定资源的所有标签列表。用户必须具有足够的权限，且目标资源需存在。查询成功后，返回资源的标签列表；若失败，返回具体的错误信息。常见异常包括权限验证错误、资源不存在错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferServiceTagsRequest 请求对象
     * @return SyncInvoker<ShowInferServiceTagsRequest, ShowInferServiceTagsResponse>
     */
    public SyncInvoker<ShowInferServiceTagsRequest, ShowInferServiceTagsResponse> showInferServiceTagsInvoker(
        ShowInferServiceTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInferServiceTags, hcClient);
    }

    /**
     * 查询网络资源
     *
     * 查询网络资源接口用于获取指定网络资源的详情信息。该接口适用于以下场景：当用户需要查看特定网络资源的详细配置、状态或属性时，可通过此接口查询指定网络资源的详细信息。使用该接口的前提条件是用户具有相应的权限，并且指定的网络资源已存在于系统中。查询操作完成后，接口将返回指定网络资源的详细信息，包括资源ID、类型、状态、配置参数等。若指定的网络资源不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkRequest 请求对象
     * @return ShowNetworkResponse
     */
    public ShowNetworkResponse showNetwork(ShowNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showNetwork);
    }

    /**
     * 查询网络资源
     *
     * 查询网络资源接口用于获取指定网络资源的详情信息。该接口适用于以下场景：当用户需要查看特定网络资源的详细配置、状态或属性时，可通过此接口查询指定网络资源的详细信息。使用该接口的前提条件是用户具有相应的权限，并且指定的网络资源已存在于系统中。查询操作完成后，接口将返回指定网络资源的详细信息，包括资源ID、类型、状态、配置参数等。若指定的网络资源不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkRequest 请求对象
     * @return SyncInvoker<ShowNetworkRequest, ShowNetworkResponse>
     */
    public SyncInvoker<ShowNetworkRequest, ShowNetworkResponse> showNetworkInvoker(ShowNetworkRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showNetwork, hcClient);
    }

    /**
     * 查询网络可用的IP
     *
     * 查询网络可用的IP接口用于查找指定网络中未被占用的IP地址。该接口适用于以下场景：在网络规划、资源分配或故障排查时，用户需要快速获取可用的IP地址信息。使用该接口的前提条件是用户具有访问目标网络的权限，并且需要提供有效的网络范围（如子网掩码或IP段）。查询完成后，接口将返回指定网络中未被占用的IP地址列表，用户可以根据结果进行IP地址的分配或进一步操作。若网络不可达、权限不足或网络范围有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkAvailableIpRequest 请求对象
     * @return ShowNetworkAvailableIpResponse
     */
    public ShowNetworkAvailableIpResponse showNetworkAvailableIp(ShowNetworkAvailableIpRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showNetworkAvailableIp);
    }

    /**
     * 查询网络可用的IP
     *
     * 查询网络可用的IP接口用于查找指定网络中未被占用的IP地址。该接口适用于以下场景：在网络规划、资源分配或故障排查时，用户需要快速获取可用的IP地址信息。使用该接口的前提条件是用户具有访问目标网络的权限，并且需要提供有效的网络范围（如子网掩码或IP段）。查询完成后，接口将返回指定网络中未被占用的IP地址列表，用户可以根据结果进行IP地址的分配或进一步操作。若网络不可达、权限不足或网络范围有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkAvailableIpRequest 请求对象
     * @return SyncInvoker<ShowNetworkAvailableIpRequest, ShowNetworkAvailableIpResponse>
     */
    public SyncInvoker<ShowNetworkAvailableIpRequest, ShowNetworkAvailableIpResponse> showNetworkAvailableIpInvoker(
        ShowNetworkAvailableIpRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showNetworkAvailableIp, hcClient);
    }

    /**
     * 查询节点配置模板
     *
     * 查询节点配置模板接口用于获取指定节点配置模板的详细信息。该接口适用于以下场景：当用户需要查看节点配置模板的内容、管理节点配置或进行相关操作时，可通过此接口获取指定节点配置模板的详细信息。使用该接口的前提条件是节点配置模板已存在且用户具有相应的访问权限。调用该接口后，系统将返回指定节点配置模板的详细信息，包括模板名称、版本、配置参数及描述等。若节点配置模板不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodeConfigTemplateRequest 请求对象
     * @return ShowNodeConfigTemplateResponse
     */
    public ShowNodeConfigTemplateResponse showNodeConfigTemplate(ShowNodeConfigTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showNodeConfigTemplate);
    }

    /**
     * 查询节点配置模板
     *
     * 查询节点配置模板接口用于获取指定节点配置模板的详细信息。该接口适用于以下场景：当用户需要查看节点配置模板的内容、管理节点配置或进行相关操作时，可通过此接口获取指定节点配置模板的详细信息。使用该接口的前提条件是节点配置模板已存在且用户具有相应的访问权限。调用该接口后，系统将返回指定节点配置模板的详细信息，包括模板名称、版本、配置参数及描述等。若节点配置模板不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodeConfigTemplateRequest 请求对象
     * @return SyncInvoker<ShowNodeConfigTemplateRequest, ShowNodeConfigTemplateResponse>
     */
    public SyncInvoker<ShowNodeConfigTemplateRequest, ShowNodeConfigTemplateResponse> showNodeConfigTemplateInvoker(
        ShowNodeConfigTemplateRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showNodeConfigTemplate, hcClient);
    }

    /**
     * 查询指定节点池详情
     *
     * 查询指定节点池详情接口用于获取指定节点池的详细信息。该接口适用于以下场景：当需要查看节点池的配置、状态、资源使用情况或管理节点池时，用户可通过此接口获取节点池的详细信息。使用该接口的前提条件是节点池已存在且用户具有访问该节点池的权限。调用接口成功后，系统将返回节点池的详细信息，包括节点池ID、名称、节点数量、状态、创建时间、配置参数等。若节点池不存在、用户无权限访问或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodePoolRequest 请求对象
     * @return ShowNodePoolResponse
     */
    public ShowNodePoolResponse showNodePool(ShowNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showNodePool);
    }

    /**
     * 查询指定节点池详情
     *
     * 查询指定节点池详情接口用于获取指定节点池的详细信息。该接口适用于以下场景：当需要查看节点池的配置、状态、资源使用情况或管理节点池时，用户可通过此接口获取节点池的详细信息。使用该接口的前提条件是节点池已存在且用户具有访问该节点池的权限。调用接口成功后，系统将返回节点池的详细信息，包括节点池ID、名称、节点数量、状态、创建时间、配置参数等。若节点池不存在、用户无权限访问或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodePoolRequest 请求对象
     * @return SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>
     */
    public SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse> showNodePoolInvoker(ShowNodePoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showNodePool, hcClient);
    }

    /**
     * 查询训练作业指定任务的日志（OBS链接）
     *
     * 查询训练作业指定任务的日志（OBS临时链接，有效期5分钟），可全量查看或直接下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowObsUrlOfTrainingJobLogsRequest 请求对象
     * @return ShowObsUrlOfTrainingJobLogsResponse
     */
    public ShowObsUrlOfTrainingJobLogsResponse showObsUrlOfTrainingJobLogs(ShowObsUrlOfTrainingJobLogsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showObsUrlOfTrainingJobLogs);
    }

    /**
     * 查询训练作业指定任务的日志（OBS链接）
     *
     * 查询训练作业指定任务的日志（OBS临时链接，有效期5分钟），可全量查看或直接下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowObsUrlOfTrainingJobLogsRequest 请求对象
     * @return SyncInvoker<ShowObsUrlOfTrainingJobLogsRequest, ShowObsUrlOfTrainingJobLogsResponse>
     */
    public SyncInvoker<ShowObsUrlOfTrainingJobLogsRequest, ShowObsUrlOfTrainingJobLogsResponse> showObsUrlOfTrainingJobLogsInvoker(
        ShowObsUrlOfTrainingJobLogsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showObsUrlOfTrainingJobLogs, hcClient);
    }

    /**
     * 查询订单详情
     *
     * 查询订单详情接口用于获取指定订单的详细信息。该接口适用于以下场景：当需要查看订单的状态、金额、商品信息或处理订单相关问题时，用户可通过此接口获取订单的详细数据。使用该接口的前提条件是订单已存在且用户具有访问该订单的权限。调用接口成功后，系统将返回订单的详细信息，包括订单号、商品列表、金额、支付状态、下单时间等。若订单不存在、用户无权限访问或订单信息未正确配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderRequest 请求对象
     * @return ShowOrderResponse
     */
    public ShowOrderResponse showOrder(ShowOrderRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showOrder);
    }

    /**
     * 查询订单详情
     *
     * 查询订单详情接口用于获取指定订单的详细信息。该接口适用于以下场景：当需要查看订单的状态、金额、商品信息或处理订单相关问题时，用户可通过此接口获取订单的详细数据。使用该接口的前提条件是订单已存在且用户具有访问该订单的权限。调用接口成功后，系统将返回订单的详细信息，包括订单号、商品列表、金额、支付状态、下单时间等。若订单不存在、用户无权限访问或订单信息未正确配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderRequest 请求对象
     * @return SyncInvoker<ShowOrderRequest, ShowOrderResponse>
     */
    public SyncInvoker<ShowOrderRequest, ShowOrderResponse> showOrderInvoker(ShowOrderRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showOrder, hcClient);
    }

    /**
     * 查询OS的配置参数
     *
     * 查询OS的配置参数接口用于获取ModelArts OS服务的配置参数，如网络网段、用户资源配额等。该接口适用于以下场景：当需要了解当前ModelArts OS服务的网络配置、资源分配情况或进行系统管理时，用户可通过此接口查询相关的配置参数。使用该接口的前提条件是用户具有访问ModelArts OS服务的权限，且服务处于正常运行状态。查询操作完成后，用户将获得指定的配置参数信息，便于进行后续的资源规划或系统优化。若用户无权限访问、服务不可用或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsConfigRequest 请求对象
     * @return ShowOsConfigResponse
     */
    public ShowOsConfigResponse showOsConfig(ShowOsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showOsConfig);
    }

    /**
     * 查询OS的配置参数
     *
     * 查询OS的配置参数接口用于获取ModelArts OS服务的配置参数，如网络网段、用户资源配额等。该接口适用于以下场景：当需要了解当前ModelArts OS服务的网络配置、资源分配情况或进行系统管理时，用户可通过此接口查询相关的配置参数。使用该接口的前提条件是用户具有访问ModelArts OS服务的权限，且服务处于正常运行状态。查询操作完成后，用户将获得指定的配置参数信息，便于进行后续的资源规划或系统优化。若用户无权限访问、服务不可用或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsConfigRequest 请求对象
     * @return SyncInvoker<ShowOsConfigRequest, ShowOsConfigResponse>
     */
    public SyncInvoker<ShowOsConfigRequest, ShowOsConfigResponse> showOsConfigInvoker(ShowOsConfigRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showOsConfig, hcClient);
    }

    /**
     * 查询OS的配额
     *
     * 查询OS配额接口用于获取ModelArts OS服务中部分资源的配额信息，如资源池配额、网络配额等。该接口适用于以下场景：当需要了解资源池或网络资源的使用限制、规划资源分配或监控资源使用情况时，用户可通过此接口获取相关配额信息。使用该接口的前提条件是ModelArts OS服务已部署且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回资源池配额、网络配额等详细信息，帮助用户更好地进行资源规划和管理。若用户无权限访问该接口、服务不可用或配额信息未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsQuotaRequest 请求对象
     * @return ShowOsQuotaResponse
     */
    public ShowOsQuotaResponse showOsQuota(ShowOsQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showOsQuota);
    }

    /**
     * 查询OS的配额
     *
     * 查询OS配额接口用于获取ModelArts OS服务中部分资源的配额信息，如资源池配额、网络配额等。该接口适用于以下场景：当需要了解资源池或网络资源的使用限制、规划资源分配或监控资源使用情况时，用户可通过此接口获取相关配额信息。使用该接口的前提条件是ModelArts OS服务已部署且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回资源池配额、网络配额等详细信息，帮助用户更好地进行资源规划和管理。若用户无权限访问该接口、服务不可用或配额信息未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsQuotaRequest 请求对象
     * @return SyncInvoker<ShowOsQuotaRequest, ShowOsQuotaResponse>
     */
    public SyncInvoker<ShowOsQuotaRequest, ShowOsQuotaResponse> showOsQuotaInvoker(ShowOsQuotaRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showOsQuota, hcClient);
    }

    /**
     * 查询插件模板
     *
     * 查询插件模板接口用于获取指定插件模板的详细信息。该接口适用于以下场景：当需要了解特定插件模板的配置、功能或使用方式时，用户可通过此接口查询插件模板的详细信息。使用该接口的前提条件是插件模板已存在且用户具有访问权限。查询操作完成后，用户将获得指定插件模板的详细信息，包括模板的配置参数、功能描述等，便于后续的插件开发或配置管理。若插件模板不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginTemplateRequest 请求对象
     * @return ShowPluginTemplateResponse
     */
    public ShowPluginTemplateResponse showPluginTemplate(ShowPluginTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPluginTemplate);
    }

    /**
     * 查询插件模板
     *
     * 查询插件模板接口用于获取指定插件模板的详细信息。该接口适用于以下场景：当需要了解特定插件模板的配置、功能或使用方式时，用户可通过此接口查询插件模板的详细信息。使用该接口的前提条件是插件模板已存在且用户具有访问权限。查询操作完成后，用户将获得指定插件模板的详细信息，包括模板的配置参数、功能描述等，便于后续的插件开发或配置管理。若插件模板不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginTemplateRequest 请求对象
     * @return SyncInvoker<ShowPluginTemplateRequest, ShowPluginTemplateResponse>
     */
    public SyncInvoker<ShowPluginTemplateRequest, ShowPluginTemplateResponse> showPluginTemplateInvoker(
        ShowPluginTemplateRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPluginTemplate, hcClient);
    }

    /**
     * 查询资源池
     *
     * 查询资源池信息接口用于获取指定资源池的详细信息。该接口适用于以下场景：当用户需要查看特定资源池的详细配置、状态、资源使用情况或进行资源管理时，可通过此接口查询指定资源池的详细信息。使用该接口的前提条件是用户具有相应的权限，并且指定的资源池已存在于系统中。查询操作完成后，接口将返回资源池的详细信息，包括资源池ID、名称、类型、状态、资源配额、利用率等。若指定的资源池不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return ShowPoolResponse
     */
    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPool);
    }

    /**
     * 查询资源池
     *
     * 查询资源池信息接口用于获取指定资源池的详细信息。该接口适用于以下场景：当用户需要查看特定资源池的详细配置、状态、资源使用情况或进行资源管理时，可通过此接口查询指定资源池的详细信息。使用该接口的前提条件是用户具有相应的权限，并且指定的资源池已存在于系统中。查询操作完成后，接口将返回资源池的详细信息，包括资源池ID、名称、类型、状态、资源配额、利用率等。若指定的资源池不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return SyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public SyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolInvoker(ShowPoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPool, hcClient);
    }

    /**
     * 资源池监控
     *
     * 资源池监控接口用于获取指定资源池的实时或历史监控信息。该接口适用于以下场景：当需要实时查看资源池的资源使用情况、性能状态或历史数据时，用户可通过此接口获取资源池的监控数据。使用该接口的前提条件是资源池已存在且用户具有管理员权限。调用接口成功后，系统将返回资源池的监控信息，包括资源使用率、性能指标及历史趋势等数据。若资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolMonitorRequest 请求对象
     * @return ShowPoolMonitorResponse
     */
    public ShowPoolMonitorResponse showPoolMonitor(ShowPoolMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPoolMonitor);
    }

    /**
     * 资源池监控
     *
     * 资源池监控接口用于获取指定资源池的实时或历史监控信息。该接口适用于以下场景：当需要实时查看资源池的资源使用情况、性能状态或历史数据时，用户可通过此接口获取资源池的监控数据。使用该接口的前提条件是资源池已存在且用户具有管理员权限。调用接口成功后，系统将返回资源池的监控信息，包括资源使用率、性能指标及历史趋势等数据。若资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolMonitorRequest 请求对象
     * @return SyncInvoker<ShowPoolMonitorRequest, ShowPoolMonitorResponse>
     */
    public SyncInvoker<ShowPoolMonitorRequest, ShowPoolMonitorResponse> showPoolMonitorInvoker(
        ShowPoolMonitorRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPoolMonitor, hcClient);
    }

    /**
     * 查询资源池单个节点详情
     *
     * 查询资源池中的单个节点接口用于获取指定资源池内单个节点的详细信息。该接口适用于以下场景：当用户需要了解节点资源分配、详细信息时，可通过此接口获取节点的类型、状态、配置参数及关联服务等信息。使用该接口的前提条件是目标资源池已存在且用户具备查看权限，同时需提供有效的资源池标识符作为输入参数。接口调用后，系统将返回资源池中单个节点数据；若资源池不存在、用户权限不足或输入参数无效，接口将返回对应的错误信息（如404未找到资源池或403权限拒绝）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeRequest 请求对象
     * @return ShowPoolNodeResponse
     */
    public ShowPoolNodeResponse showPoolNode(ShowPoolNodeRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPoolNode);
    }

    /**
     * 查询资源池单个节点详情
     *
     * 查询资源池中的单个节点接口用于获取指定资源池内单个节点的详细信息。该接口适用于以下场景：当用户需要了解节点资源分配、详细信息时，可通过此接口获取节点的类型、状态、配置参数及关联服务等信息。使用该接口的前提条件是目标资源池已存在且用户具备查看权限，同时需提供有效的资源池标识符作为输入参数。接口调用后，系统将返回资源池中单个节点数据；若资源池不存在、用户权限不足或输入参数无效，接口将返回对应的错误信息（如404未找到资源池或403权限拒绝）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeRequest 请求对象
     * @return SyncInvoker<ShowPoolNodeRequest, ShowPoolNodeResponse>
     */
    public SyncInvoker<ShowPoolNodeRequest, ShowPoolNodeResponse> showPoolNodeInvoker(ShowPoolNodeRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPoolNode, hcClient);
    }

    /**
     * 查询资源池节点自定义配置
     *
     * 查询资源池节点自定义配置接口用于获取指定资源池节点的自定义配置信息。该接口适用于以下场景：当需要查看资源池节点的详细配置、优化资源分配或管理节点资源时，用户可通过此接口获取节点的自定义配置数据。使用该接口的前提条件是资源池节点已存在且用户具有访问该节点的权限。调用接口成功后，系统将返回资源池节点的自定义配置信息，包括硬件规格、软件环境、网络设置等详细参数。若资源池节点不存在、用户无权限访问或节点配置信息未正确配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeConfigRequest 请求对象
     * @return ShowPoolNodeConfigResponse
     */
    public ShowPoolNodeConfigResponse showPoolNodeConfig(ShowPoolNodeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPoolNodeConfig);
    }

    /**
     * 查询资源池节点自定义配置
     *
     * 查询资源池节点自定义配置接口用于获取指定资源池节点的自定义配置信息。该接口适用于以下场景：当需要查看资源池节点的详细配置、优化资源分配或管理节点资源时，用户可通过此接口获取节点的自定义配置数据。使用该接口的前提条件是资源池节点已存在且用户具有访问该节点的权限。调用接口成功后，系统将返回资源池节点的自定义配置信息，包括硬件规格、软件环境、网络设置等详细参数。若资源池节点不存在、用户无权限访问或节点配置信息未正确配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeConfigRequest 请求对象
     * @return SyncInvoker<ShowPoolNodeConfigRequest, ShowPoolNodeConfigResponse>
     */
    public SyncInvoker<ShowPoolNodeConfigRequest, ShowPoolNodeConfigResponse> showPoolNodeConfigInvoker(
        ShowPoolNodeConfigRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPoolNodeConfig, hcClient);
    }

    /**
     * 查询资源池节点自定义配置模板
     *
     * 查询资源池节点自定义配置模板接口用于获取节点配置模板的结构定义与参数规范。该接口适用于以下场景：当需要了解节点自定义配置的模板结构（如参数字段、校验规则、示例值）、验证配置模板是否符合规范或进行配置模板选型时，用户可通过此接口获取模板的元数据（如参数说明、类型限制、依赖关系等）。使用该接口的前提条件是目标配置模板必须已注册至系统且处于可访问状态，调用者需具备模板查看权限，且系统配置管理服务正常运行。查询操作完成后，系统将返回模板的完整定义信息（如参数列表、版本号、更新时间等），且不会对模板内容或节点配置产生影响。若模板未注册、用户权限不足或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeConfigTemplateRequest 请求对象
     * @return ShowPoolNodeConfigTemplateResponse
     */
    public ShowPoolNodeConfigTemplateResponse showPoolNodeConfigTemplate(ShowPoolNodeConfigTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPoolNodeConfigTemplate);
    }

    /**
     * 查询资源池节点自定义配置模板
     *
     * 查询资源池节点自定义配置模板接口用于获取节点配置模板的结构定义与参数规范。该接口适用于以下场景：当需要了解节点自定义配置的模板结构（如参数字段、校验规则、示例值）、验证配置模板是否符合规范或进行配置模板选型时，用户可通过此接口获取模板的元数据（如参数说明、类型限制、依赖关系等）。使用该接口的前提条件是目标配置模板必须已注册至系统且处于可访问状态，调用者需具备模板查看权限，且系统配置管理服务正常运行。查询操作完成后，系统将返回模板的完整定义信息（如参数列表、版本号、更新时间等），且不会对模板内容或节点配置产生影响。若模板未注册、用户权限不足或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeConfigTemplateRequest 请求对象
     * @return SyncInvoker<ShowPoolNodeConfigTemplateRequest, ShowPoolNodeConfigTemplateResponse>
     */
    public SyncInvoker<ShowPoolNodeConfigTemplateRequest, ShowPoolNodeConfigTemplateResponse> showPoolNodeConfigTemplateInvoker(
        ShowPoolNodeConfigTemplateRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPoolNodeConfigTemplate, hcClient);
    }

    /**
     * 查询资源实时利用率
     *
     * 查询资源实时利用率接口用于获取当前项目下所有资源池的实时利用率信息。该接口适用于以下场景：当用户需要监控资源使用情况、进行资源优化、容量规划或故障排查时，可通过此接口查询资源池的实时利用率，包括CPU、内存、存储等资源的使用情况。使用该接口的前提条件是用户具有访问该项目的权限，并且资源池已存在且处于运行状态。查询操作完成后，接口将返回资源池的实时利用率数据，包含利用率百分比、资源类型、时间戳等详细信息。若用户无权限、资源池不存在或系统无法获取实时数据，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRuntimeMetricsRequest 请求对象
     * @return ShowPoolRuntimeMetricsResponse
     */
    public ShowPoolRuntimeMetricsResponse showPoolRuntimeMetrics(ShowPoolRuntimeMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPoolRuntimeMetrics);
    }

    /**
     * 查询资源实时利用率
     *
     * 查询资源实时利用率接口用于获取当前项目下所有资源池的实时利用率信息。该接口适用于以下场景：当用户需要监控资源使用情况、进行资源优化、容量规划或故障排查时，可通过此接口查询资源池的实时利用率，包括CPU、内存、存储等资源的使用情况。使用该接口的前提条件是用户具有访问该项目的权限，并且资源池已存在且处于运行状态。查询操作完成后，接口将返回资源池的实时利用率数据，包含利用率百分比、资源类型、时间戳等详细信息。若用户无权限、资源池不存在或系统无法获取实时数据，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRuntimeMetricsRequest 请求对象
     * @return SyncInvoker<ShowPoolRuntimeMetricsRequest, ShowPoolRuntimeMetricsResponse>
     */
    public SyncInvoker<ShowPoolRuntimeMetricsRequest, ShowPoolRuntimeMetricsResponse> showPoolRuntimeMetricsInvoker(
        ShowPoolRuntimeMetricsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPoolRuntimeMetrics, hcClient);
    }

    /**
     * 资源池统计
     *
     * 资源池统计接口用于获取指定资源池的统计信息。该接口适用于以下场景：当需要了解资源池的资源使用情况、分配情况或利用率时，用户可通过此接口获取资源池的统计数据。使用该接口的前提条件是资源池已存在且用户具有管理员权限。调用接口成功后，系统将返回资源池的统计信息，包括资源使用总量、已分配量、利用率及资源分配趋势等数据。若资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolStatisticsRequest 请求对象
     * @return ShowPoolStatisticsResponse
     */
    public ShowPoolStatisticsResponse showPoolStatistics(ShowPoolStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPoolStatistics);
    }

    /**
     * 资源池统计
     *
     * 资源池统计接口用于获取指定资源池的统计信息。该接口适用于以下场景：当需要了解资源池的资源使用情况、分配情况或利用率时，用户可通过此接口获取资源池的统计数据。使用该接口的前提条件是资源池已存在且用户具有管理员权限。调用接口成功后，系统将返回资源池的统计信息，包括资源使用总量、已分配量、利用率及资源分配趋势等数据。若资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolStatisticsRequest 请求对象
     * @return SyncInvoker<ShowPoolStatisticsRequest, ShowPoolStatisticsResponse>
     */
    public SyncInvoker<ShowPoolStatisticsRequest, ShowPoolStatisticsResponse> showPoolStatisticsInvoker(
        ShowPoolStatisticsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPoolStatistics, hcClient);
    }

    /**
     * 查询资源池上的标签
     *
     * 查询资源池的标签接口用于获取指定资源池的标签信息。该接口适用于以下场景：当需要查看、管理或统计特定资源池的标签信息时，用户可通过此接口获取资源池的标签数据。使用该接口的前提条件是资源池已存在且用户具有访问该资源池的权限。调用接口成功后，系统将返回指定资源池的标签信息，包括标签键和标签值。若资源池不存在、用户无权限访问或资源池未配置标签，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolTagsRequest 请求对象
     * @return ShowPoolTagsResponse
     */
    public ShowPoolTagsResponse showPoolTags(ShowPoolTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showPoolTags);
    }

    /**
     * 查询资源池上的标签
     *
     * 查询资源池的标签接口用于获取指定资源池的标签信息。该接口适用于以下场景：当需要查看、管理或统计特定资源池的标签信息时，用户可通过此接口获取资源池的标签数据。使用该接口的前提条件是资源池已存在且用户具有访问该资源池的权限。调用接口成功后，系统将返回指定资源池的标签信息，包括标签键和标签值。若资源池不存在、用户无权限访问或资源池未配置标签，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolTagsRequest 请求对象
     * @return SyncInvoker<ShowPoolTagsRequest, ShowPoolTagsResponse>
     */
    public SyncInvoker<ShowPoolTagsRequest, ShowPoolTagsResponse> showPoolTagsInvoker(ShowPoolTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showPoolTags, hcClient);
    }

    /**
     * 查询训练作业镜像保存任务
     *
     * 查询训练作业镜像保存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveImageJobRequest 请求对象
     * @return ShowSaveImageJobResponse
     */
    public ShowSaveImageJobResponse showSaveImageJob(ShowSaveImageJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showSaveImageJob);
    }

    /**
     * 查询训练作业镜像保存任务
     *
     * 查询训练作业镜像保存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveImageJobRequest 请求对象
     * @return SyncInvoker<ShowSaveImageJobRequest, ShowSaveImageJobResponse>
     */
    public SyncInvoker<ShowSaveImageJobRequest, ShowSaveImageJobResponse> showSaveImageJobInvoker(
        ShowSaveImageJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showSaveImageJob, hcClient);
    }

    /**
     * 获取支持的超参搜索算法
     *
     * 获取支持的超参搜索算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchAlgorithmsRequest 请求对象
     * @return ShowSearchAlgorithmsResponse
     */
    public ShowSearchAlgorithmsResponse showSearchAlgorithms(ShowSearchAlgorithmsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showSearchAlgorithms);
    }

    /**
     * 获取支持的超参搜索算法
     *
     * 获取支持的超参搜索算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchAlgorithmsRequest 请求对象
     * @return SyncInvoker<ShowSearchAlgorithmsRequest, ShowSearchAlgorithmsResponse>
     */
    public SyncInvoker<ShowSearchAlgorithmsRequest, ShowSearchAlgorithmsResponse> showSearchAlgorithmsInvoker(
        ShowSearchAlgorithmsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showSearchAlgorithms, hcClient);
    }

    /**
     * 查询训练作业标签
     *
     * 查询训练作业标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainJobTagsRequest 请求对象
     * @return ShowTrainJobTagsResponse
     */
    public ShowTrainJobTagsResponse showTrainJobTags(ShowTrainJobTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showTrainJobTags);
    }

    /**
     * 查询训练作业标签
     *
     * 查询训练作业标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainJobTagsRequest 请求对象
     * @return SyncInvoker<ShowTrainJobTagsRequest, ShowTrainJobTagsResponse>
     */
    public SyncInvoker<ShowTrainJobTagsRequest, ShowTrainJobTagsResponse> showTrainJobTagsInvoker(
        ShowTrainJobTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showTrainJobTags, hcClient);
    }

    /**
     * 查询训练实验详情
     *
     * 查询训练实验详情接口用于获取指定训练实验的详细信息。
     * 该接口适用于以下场景：当用户需要查看训练实验的实验名称、描述、创建时间等详细信息时，可以通过此接口获取。使用该接口的前提条件是训练实验已存在且用户具有查看该实验的权限。查询操作完成后，将返回训练实验的详细信息，包括但不限于实验ID、名称、描述、创建时间等。若训练实验不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingExperimentDetailsRequest 请求对象
     * @return ShowTrainingExperimentDetailsResponse
     */
    public ShowTrainingExperimentDetailsResponse showTrainingExperimentDetails(
        ShowTrainingExperimentDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showTrainingExperimentDetails);
    }

    /**
     * 查询训练实验详情
     *
     * 查询训练实验详情接口用于获取指定训练实验的详细信息。
     * 该接口适用于以下场景：当用户需要查看训练实验的实验名称、描述、创建时间等详细信息时，可以通过此接口获取。使用该接口的前提条件是训练实验已存在且用户具有查看该实验的权限。查询操作完成后，将返回训练实验的详细信息，包括但不限于实验ID、名称、描述、创建时间等。若训练实验不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingExperimentDetailsRequest 请求对象
     * @return SyncInvoker<ShowTrainingExperimentDetailsRequest, ShowTrainingExperimentDetailsResponse>
     */
    public SyncInvoker<ShowTrainingExperimentDetailsRequest, ShowTrainingExperimentDetailsResponse> showTrainingExperimentDetailsInvoker(
        ShowTrainingExperimentDetailsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showTrainingExperimentDetails, hcClient);
    }

    /**
     * 查询训练作业详情
     *
     * 查询训练作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobDetailsRequest 请求对象
     * @return ShowTrainingJobDetailsResponse
     */
    public ShowTrainingJobDetailsResponse showTrainingJobDetails(ShowTrainingJobDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showTrainingJobDetails);
    }

    /**
     * 查询训练作业详情
     *
     * 查询训练作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobDetailsRequest 请求对象
     * @return SyncInvoker<ShowTrainingJobDetailsRequest, ShowTrainingJobDetailsResponse>
     */
    public SyncInvoker<ShowTrainingJobDetailsRequest, ShowTrainingJobDetailsResponse> showTrainingJobDetailsInvoker(
        ShowTrainingJobDetailsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showTrainingJobDetails, hcClient);
    }

    /**
     * 获取训练作业支持的AI预置框架
     *
     * 获取训练作业支持的AI预置框架。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobEnginesRequest 请求对象
     * @return ShowTrainingJobEnginesResponse
     */
    public ShowTrainingJobEnginesResponse showTrainingJobEngines(ShowTrainingJobEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showTrainingJobEngines);
    }

    /**
     * 获取训练作业支持的AI预置框架
     *
     * 获取训练作业支持的AI预置框架。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobEnginesRequest 请求对象
     * @return SyncInvoker<ShowTrainingJobEnginesRequest, ShowTrainingJobEnginesResponse>
     */
    public SyncInvoker<ShowTrainingJobEnginesRequest, ShowTrainingJobEnginesResponse> showTrainingJobEnginesInvoker(
        ShowTrainingJobEnginesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showTrainingJobEngines, hcClient);
    }

    /**
     * 获取训练作业支持的公共规格
     *
     * 获取训练作业支持的公共规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobFlavorsRequest 请求对象
     * @return ShowTrainingJobFlavorsResponse
     */
    public ShowTrainingJobFlavorsResponse showTrainingJobFlavors(ShowTrainingJobFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showTrainingJobFlavors);
    }

    /**
     * 获取训练作业支持的公共规格
     *
     * 获取训练作业支持的公共规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobFlavorsRequest 请求对象
     * @return SyncInvoker<ShowTrainingJobFlavorsRequest, ShowTrainingJobFlavorsResponse>
     */
    public SyncInvoker<ShowTrainingJobFlavorsRequest, ShowTrainingJobFlavorsResponse> showTrainingJobFlavorsInvoker(
        ShowTrainingJobFlavorsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showTrainingJobFlavors, hcClient);
    }

    /**
     * 查询训练作业指定任务的日志（预览）
     *
     * 查询训练作业指定任务的日志（预览）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobLogsPreviewRequest 请求对象
     * @return ShowTrainingJobLogsPreviewResponse
     */
    public ShowTrainingJobLogsPreviewResponse showTrainingJobLogsPreview(ShowTrainingJobLogsPreviewRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showTrainingJobLogsPreview);
    }

    /**
     * 查询训练作业指定任务的日志（预览）
     *
     * 查询训练作业指定任务的日志（预览）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobLogsPreviewRequest 请求对象
     * @return SyncInvoker<ShowTrainingJobLogsPreviewRequest, ShowTrainingJobLogsPreviewResponse>
     */
    public SyncInvoker<ShowTrainingJobLogsPreviewRequest, ShowTrainingJobLogsPreviewResponse> showTrainingJobLogsPreviewInvoker(
        ShowTrainingJobLogsPreviewRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showTrainingJobLogsPreview, hcClient);
    }

    /**
     * 查询训练作业指定任务的运行指标
     *
     * 查询训练作业指定任务的运行指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobMetricsRequest 请求对象
     * @return ShowTrainingJobMetricsResponse
     */
    public ShowTrainingJobMetricsResponse showTrainingJobMetrics(ShowTrainingJobMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showTrainingJobMetrics);
    }

    /**
     * 查询训练作业指定任务的运行指标
     *
     * 查询训练作业指定任务的运行指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobMetricsRequest 请求对象
     * @return SyncInvoker<ShowTrainingJobMetricsRequest, ShowTrainingJobMetricsResponse>
     */
    public SyncInvoker<ShowTrainingJobMetricsRequest, ShowTrainingJobMetricsResponse> showTrainingJobMetricsInvoker(
        ShowTrainingJobMetricsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showTrainingJobMetrics, hcClient);
    }

    /**
     * 获取训练配额
     *
     * 获取训练配额接口用于查询用户在ModelArts服务中的训练资源配额信息。
     * 该接口适用于以下场景：当用户需要了解当前可用的训练资源配额，以便合理规划和管理训练任务时，可以通过此接口获取配额详情。使用该接口的前提条件是用户已登录并具有查看配额的权限。响应消息体中包含用户已创建的训练作业个数、剩余可创建个数等。若用户无权限或配额信息为空，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingQuotasRequest 请求对象
     * @return ShowTrainingQuotasResponse
     */
    public ShowTrainingQuotasResponse showTrainingQuotas(ShowTrainingQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showTrainingQuotas);
    }

    /**
     * 获取训练配额
     *
     * 获取训练配额接口用于查询用户在ModelArts服务中的训练资源配额信息。
     * 该接口适用于以下场景：当用户需要了解当前可用的训练资源配额，以便合理规划和管理训练任务时，可以通过此接口获取配额详情。使用该接口的前提条件是用户已登录并具有查看配额的权限。响应消息体中包含用户已创建的训练作业个数、剩余可创建个数等。若用户无权限或配额信息为空，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingQuotasRequest 请求对象
     * @return SyncInvoker<ShowTrainingQuotasRequest, ShowTrainingQuotasResponse>
     */
    public SyncInvoker<ShowTrainingQuotasRequest, ShowTrainingQuotasResponse> showTrainingQuotasInvoker(
        ShowTrainingQuotasRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showTrainingQuotas, hcClient);
    }

    /**
     * 查询专属资源池作业统计信息
     *
     * 查询专属资源池作业统计信息接口用于获取指定专属资源池中作业的统计信息。该接口适用于以下场景：当需要了解专属资源池中作业的整体运行情况、资源使用效率或作业状态分布时，用户可通过此接口获取统计信息。使用该接口的前提条件是专属资源池已存在且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回专属资源池中作业的统计信息，包括作业总数、运行中作业数、完成作业数、资源使用率等数据。若专属资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadStatisticsRequest 请求对象
     * @return ShowWorkloadStatisticsResponse
     */
    public ShowWorkloadStatisticsResponse showWorkloadStatistics(ShowWorkloadStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkloadStatistics);
    }

    /**
     * 查询专属资源池作业统计信息
     *
     * 查询专属资源池作业统计信息接口用于获取指定专属资源池中作业的统计信息。该接口适用于以下场景：当需要了解专属资源池中作业的整体运行情况、资源使用效率或作业状态分布时，用户可通过此接口获取统计信息。使用该接口的前提条件是专属资源池已存在且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回专属资源池中作业的统计信息，包括作业总数、运行中作业数、完成作业数、资源使用率等数据。若专属资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadStatisticsRequest 请求对象
     * @return SyncInvoker<ShowWorkloadStatisticsRequest, ShowWorkloadStatisticsResponse>
     */
    public SyncInvoker<ShowWorkloadStatisticsRequest, ShowWorkloadStatisticsResponse> showWorkloadStatisticsInvoker(
        ShowWorkloadStatisticsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkloadStatistics, hcClient);
    }

    /**
     * 查询工作空间详情
     *
     * 查询工作空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceRequest 请求对象
     * @return ShowWorkspaceResponse
     */
    public ShowWorkspaceResponse showWorkspace(ShowWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkspace);
    }

    /**
     * 查询工作空间详情
     *
     * 查询工作空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceRequest, ShowWorkspaceResponse>
     */
    public SyncInvoker<ShowWorkspaceRequest, ShowWorkspaceResponse> showWorkspaceInvoker(ShowWorkspaceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkspace, hcClient);
    }

    /**
     * 查询工作空间配额
     *
     * 查询工作空间配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceQuotasRequest 请求对象
     * @return ShowWorkspaceQuotasResponse
     */
    public ShowWorkspaceQuotasResponse showWorkspaceQuotas(ShowWorkspaceQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkspaceQuotas);
    }

    /**
     * 查询工作空间配额
     *
     * 查询工作空间配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceQuotasRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse>
     */
    public SyncInvoker<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse> showWorkspaceQuotasInvoker(
        ShowWorkspaceQuotasRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkspaceQuotas, hcClient);
    }

    /**
     * 启动服务部署
     *
     * 使部署从“停止”或“失败”状态进入“部署中”状态，适用于用户需要重新启动已停止或启动失败的部署的情况。调用此接口前，部署状态必须为“停止”或“失败”，且用户需具有启动部署的权限。调用成功后，部署状态将变为“部署中”，系统将开始执行部署流程，包括资源准备、配置加载等。如果部署当前状态不是“停止”或“失败”，或用户没有启动部署的权限，调用将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInferDeploymentRequest 请求对象
     * @return StartInferDeploymentResponse
     */
    public StartInferDeploymentResponse startInferDeployment(StartInferDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.startInferDeployment);
    }

    /**
     * 启动服务部署
     *
     * 使部署从“停止”或“失败”状态进入“部署中”状态，适用于用户需要重新启动已停止或启动失败的部署的情况。调用此接口前，部署状态必须为“停止”或“失败”，且用户需具有启动部署的权限。调用成功后，部署状态将变为“部署中”，系统将开始执行部署流程，包括资源准备、配置加载等。如果部署当前状态不是“停止”或“失败”，或用户没有启动部署的权限，调用将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInferDeploymentRequest 请求对象
     * @return SyncInvoker<StartInferDeploymentRequest, StartInferDeploymentResponse>
     */
    public SyncInvoker<StartInferDeploymentRequest, StartInferDeploymentResponse> startInferDeploymentInvoker(
        StartInferDeploymentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.startInferDeployment, hcClient);
    }

    /**
     * 启动服务
     *
     * 使服务从\&quot;停止\&quot;或\&quot;失败\&quot;状态进入\&quot;部署中\&quot;状态，适用于用户需要重新启动已停止或启动失败的服务的情况。调用此接口前，服务状态必须为\&quot;停止\&quot;或\&quot;失败\&quot;，且用户需具有启动服务的权限。调用成功后，服务状态将变为\&quot;部署中\&quot;，系统将开始执行部署流程，包括资源准备、配置加载等。如果服务当前状态不是\&quot;停止\&quot;或\&quot;失败\&quot;，或用户没有启动服务的权限，调用将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInferServiceRequest 请求对象
     * @return StartInferServiceResponse
     */
    public StartInferServiceResponse startInferService(StartInferServiceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.startInferService);
    }

    /**
     * 启动服务
     *
     * 使服务从\&quot;停止\&quot;或\&quot;失败\&quot;状态进入\&quot;部署中\&quot;状态，适用于用户需要重新启动已停止或启动失败的服务的情况。调用此接口前，服务状态必须为\&quot;停止\&quot;或\&quot;失败\&quot;，且用户需具有启动服务的权限。调用成功后，服务状态将变为\&quot;部署中\&quot;，系统将开始执行部署流程，包括资源准备、配置加载等。如果服务当前状态不是\&quot;停止\&quot;或\&quot;失败\&quot;，或用户没有启动服务的权限，调用将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInferServiceRequest 请求对象
     * @return SyncInvoker<StartInferServiceRequest, StartInferServiceResponse>
     */
    public SyncInvoker<StartInferServiceRequest, StartInferServiceResponse> startInferServiceInvoker(
        StartInferServiceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.startInferService, hcClient);
    }

    /**
     * 停止在线服务部署
     *
     * 停止在线部署功能允许用户在特定状态下主动终止正在运行或处于其他可操作状态的部署实例。该功能适用于需要维护、升级或检测到异常的服务场景，支持在服务处于\&quot;运行中\&quot;、\&quot;部署中\&quot;、\&quot;失败\&quot;或\&quot;告警\&quot;状态时执行停止操作。使用此功能前，请确保部署实例处于可停止状态，并具备相应的API调用权限。成功执行后，部署将进入停止状态，释放相关资源并停止处理新的请求。若部署不在允许停止的状态、调用权限不足或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInferDeploymentRequest 请求对象
     * @return StopInferDeploymentResponse
     */
    public StopInferDeploymentResponse stopInferDeployment(StopInferDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopInferDeployment);
    }

    /**
     * 停止在线服务部署
     *
     * 停止在线部署功能允许用户在特定状态下主动终止正在运行或处于其他可操作状态的部署实例。该功能适用于需要维护、升级或检测到异常的服务场景，支持在服务处于\&quot;运行中\&quot;、\&quot;部署中\&quot;、\&quot;失败\&quot;或\&quot;告警\&quot;状态时执行停止操作。使用此功能前，请确保部署实例处于可停止状态，并具备相应的API调用权限。成功执行后，部署将进入停止状态，释放相关资源并停止处理新的请求。若部署不在允许停止的状态、调用权限不足或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInferDeploymentRequest 请求对象
     * @return SyncInvoker<StopInferDeploymentRequest, StopInferDeploymentResponse>
     */
    public SyncInvoker<StopInferDeploymentRequest, StopInferDeploymentResponse> stopInferDeploymentInvoker(
        StopInferDeploymentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopInferDeployment, hcClient);
    }

    /**
     * 停止服务
     *
     * 使服务从\&quot;运行中\&quot;状态进入\&quot;停止中\&quot;最终变为\&quot;停止\&quot;状态，适用于用户需要停止正在运行的服务以节省资源成本的场景。用户需具有停止服务的权限。调用成功后，服务状态将变为\&quot;停止中\&quot;，系统将开始执行停止流程，包括释放资源、保存状态等。如果用户没有停止服务的权限，调用将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInferServiceRequest 请求对象
     * @return StopInferServiceResponse
     */
    public StopInferServiceResponse stopInferService(StopInferServiceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopInferService);
    }

    /**
     * 停止服务
     *
     * 使服务从\&quot;运行中\&quot;状态进入\&quot;停止中\&quot;最终变为\&quot;停止\&quot;状态，适用于用户需要停止正在运行的服务以节省资源成本的场景。用户需具有停止服务的权限。调用成功后，服务状态将变为\&quot;停止中\&quot;，系统将开始执行停止流程，包括释放资源、保存状态等。如果用户没有停止服务的权限，调用将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInferServiceRequest 请求对象
     * @return SyncInvoker<StopInferServiceRequest, StopInferServiceResponse>
     */
    public SyncInvoker<StopInferServiceRequest, StopInferServiceResponse> stopInferServiceInvoker(
        StopInferServiceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopInferService, hcClient);
    }

    /**
     * 终止训练作业
     *
     * 终止训练作业，只可终止创建中、等待中、运行中的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTrainingJobRequest 请求对象
     * @return StopTrainingJobResponse
     */
    public StopTrainingJobResponse stopTrainingJob(StopTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopTrainingJob);
    }

    /**
     * 终止训练作业
     *
     * 终止训练作业，只可终止创建中、等待中、运行中的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTrainingJobRequest 请求对象
     * @return SyncInvoker<StopTrainingJobRequest, StopTrainingJobResponse>
     */
    public SyncInvoker<StopTrainingJobRequest, StopTrainingJobResponse> stopTrainingJobInvoker(
        StopTrainingJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopTrainingJob, hcClient);
    }

    /**
     * 切换部署到指定版本
     *
     * 此接口用于将部署切换到指定版本，适用于需要在不同版本间进行切换以测试或回滚的场景。请求需包含有效的服务ID、部署ID及目标版本号，版本号必须是已发布的有效版本。用户必须具有对目标服务部署的管理权限，并且部署处于运行状态。切换成功后，部署将立即使用新的版本。若服务ID无效、部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；若部署状态不允许切换，则返回400 Bad Request。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchInferDeploymentVersionRequest 请求对象
     * @return SwitchInferDeploymentVersionResponse
     */
    public SwitchInferDeploymentVersionResponse switchInferDeploymentVersion(
        SwitchInferDeploymentVersionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.switchInferDeploymentVersion);
    }

    /**
     * 切换部署到指定版本
     *
     * 此接口用于将部署切换到指定版本，适用于需要在不同版本间进行切换以测试或回滚的场景。请求需包含有效的服务ID、部署ID及目标版本号，版本号必须是已发布的有效版本。用户必须具有对目标服务部署的管理权限，并且部署处于运行状态。切换成功后，部署将立即使用新的版本。若服务ID无效、部署ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；若部署状态不允许切换，则返回400 Bad Request。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchInferDeploymentVersionRequest 请求对象
     * @return SyncInvoker<SwitchInferDeploymentVersionRequest, SwitchInferDeploymentVersionResponse>
     */
    public SyncInvoker<SwitchInferDeploymentVersionRequest, SwitchInferDeploymentVersionResponse> switchInferDeploymentVersionInvoker(
        SwitchInferDeploymentVersionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.switchInferDeploymentVersion, hcClient);
    }

    /**
     * 同步镜像状态
     *
     * 同步镜像状态接口用于修正镜像状态的异常情况。该接口适用于以下场景：当镜像状态因误操作、网络问题或系统故障等原因出现异常时，用户可通过此接口同步镜像的最新状态。使用该接口的前提条件是镜像已存在且用户具有相应的操作权限。同步操作完成后，镜像的状态将被更新为最新的正确状态，相关资源和配置也将被同步。若镜像不存在、用户无权限操作或同步过程中出现错误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncImageRequest 请求对象
     * @return SyncImageResponse
     */
    public SyncImageResponse syncImage(SyncImageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.syncImage);
    }

    /**
     * 同步镜像状态
     *
     * 同步镜像状态接口用于修正镜像状态的异常情况。该接口适用于以下场景：当镜像状态因误操作、网络问题或系统故障等原因出现异常时，用户可通过此接口同步镜像的最新状态。使用该接口的前提条件是镜像已存在且用户具有相应的操作权限。同步操作完成后，镜像的状态将被更新为最新的正确状态，相关资源和配置也将被同步。若镜像不存在、用户无权限操作或同步过程中出现错误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncImageRequest 请求对象
     * @return SyncInvoker<SyncImageRequest, SyncImageResponse>
     */
    public SyncInvoker<SyncImageRequest, SyncImageResponse> syncImageInvoker(SyncImageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.syncImage, hcClient);
    }

    /**
     * 解绑应用密钥
     *
     * 本接口用于将已绑定的apikey从指定服务中解绑，适用于需要撤销某个apikey对特定服务的访问权限的场景。调用此接口前，确保已获取到需要解绑的apikey，并确认该apikey当前绑定在指定服务上。解绑成功后，该apikey将不再对指定服务生效，但仍可继续用于其他服务。如果尝试解绑不存在或未绑定到指定服务的apikey，将返回相应的异常信息，提示用户检查apikey的有效性和绑定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindInferApiKeyRequest 请求对象
     * @return UnbindInferApiKeyResponse
     */
    public UnbindInferApiKeyResponse unbindInferApiKey(UnbindInferApiKeyRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.unbindInferApiKey);
    }

    /**
     * 解绑应用密钥
     *
     * 本接口用于将已绑定的apikey从指定服务中解绑，适用于需要撤销某个apikey对特定服务的访问权限的场景。调用此接口前，确保已获取到需要解绑的apikey，并确认该apikey当前绑定在指定服务上。解绑成功后，该apikey将不再对指定服务生效，但仍可继续用于其他服务。如果尝试解绑不存在或未绑定到指定服务的apikey，将返回相应的异常信息，提示用户检查apikey的有效性和绑定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindInferApiKeyRequest 请求对象
     * @return SyncInvoker<UnbindInferApiKeyRequest, UnbindInferApiKeyResponse>
     */
    public SyncInvoker<UnbindInferApiKeyRequest, UnbindInferApiKeyResponse> unbindInferApiKeyInvoker(
        UnbindInferApiKeyRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.unbindInferApiKey, hcClient);
    }

    /**
     * 更新授权模式
     *
     * 更新授权模式接口用于修改指定资源或功能的授权方式和权限配置信息。该接口适用于以下场景：当系统管理员需要调整资源的访问权限、开发者需要更新授权策略以适应新的业务需求，或安全审计人员需要修改授权配置以符合新的安全规范时，可通过此接口更新授权模式的详细信息。使用该接口的前提条件是用户具有更新权限且目标资源或功能的授权模式已存在。调用成功后，接口将更新目标资源的授权模式，并返回更新后的授权模式信息。若用户无权限访问该接口，或目标资源的授权模式不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthModeRequest 请求对象
     * @return UpdateAuthModeResponse
     */
    public UpdateAuthModeResponse updateAuthMode(UpdateAuthModeRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateAuthMode);
    }

    /**
     * 更新授权模式
     *
     * 更新授权模式接口用于修改指定资源或功能的授权方式和权限配置信息。该接口适用于以下场景：当系统管理员需要调整资源的访问权限、开发者需要更新授权策略以适应新的业务需求，或安全审计人员需要修改授权配置以符合新的安全规范时，可通过此接口更新授权模式的详细信息。使用该接口的前提条件是用户具有更新权限且目标资源或功能的授权模式已存在。调用成功后，接口将更新目标资源的授权模式，并返回更新后的授权模式信息。若用户无权限访问该接口，或目标资源的授权模式不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthModeRequest 请求对象
     * @return SyncInvoker<UpdateAuthModeRequest, UpdateAuthModeResponse>
     */
    public SyncInvoker<UpdateAuthModeRequest, UpdateAuthModeResponse> updateAuthModeInvoker(
        UpdateAuthModeRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateAuthMode, hcClient);
    }

    /**
     * 更新镜像组
     *
     * 更新镜像组接口用于更新镜像组的标签及说明信息。该接口适用于以下场景：当镜像说明需要修改，或者镜像的标签需要修改时，用户可通过此接口修改。使用该接口的前提条件是镜像组已存在且用户具有更新权限。更新操作完成后，镜像组对应的配置文件会。若镜像组不存在、用户无权限操作或镜像正在被使用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageGroupRequest 请求对象
     * @return UpdateImageGroupResponse
     */
    public UpdateImageGroupResponse updateImageGroup(UpdateImageGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateImageGroup);
    }

    /**
     * 更新镜像组
     *
     * 更新镜像组接口用于更新镜像组的标签及说明信息。该接口适用于以下场景：当镜像说明需要修改，或者镜像的标签需要修改时，用户可通过此接口修改。使用该接口的前提条件是镜像组已存在且用户具有更新权限。更新操作完成后，镜像组对应的配置文件会。若镜像组不存在、用户无权限操作或镜像正在被使用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageGroupRequest 请求对象
     * @return SyncInvoker<UpdateImageGroupRequest, UpdateImageGroupResponse>
     */
    public SyncInvoker<UpdateImageGroupRequest, UpdateImageGroupResponse> updateImageGroupInvoker(
        UpdateImageGroupRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateImageGroup, hcClient);
    }

    /**
     * 更新服务部署配置
     *
     * 该接口适用于需要动态调整模型服务部署配置的场景
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferDeploymentRequest 请求对象
     * @return UpdateInferDeploymentResponse
     */
    public UpdateInferDeploymentResponse updateInferDeployment(UpdateInferDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateInferDeployment);
    }

    /**
     * 更新服务部署配置
     *
     * 该接口适用于需要动态调整模型服务部署配置的场景
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferDeploymentRequest 请求对象
     * @return SyncInvoker<UpdateInferDeploymentRequest, UpdateInferDeploymentResponse>
     */
    public SyncInvoker<UpdateInferDeploymentRequest, UpdateInferDeploymentResponse> updateInferDeploymentInvoker(
        UpdateInferDeploymentRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateInferDeployment, hcClient);
    }

    /**
     * 手动服务扩缩容
     *
     * 该接口适用于模型服务实例扩缩容。通过调用此接口，用户可以在原有服务的情况下，对服务进行扩缩容，且不会增加新的版本；包括权限验证错误、服务状态错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferDeploymentScaleRequest 请求对象
     * @return UpdateInferDeploymentScaleResponse
     */
    public UpdateInferDeploymentScaleResponse updateInferDeploymentScale(UpdateInferDeploymentScaleRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateInferDeploymentScale);
    }

    /**
     * 手动服务扩缩容
     *
     * 该接口适用于模型服务实例扩缩容。通过调用此接口，用户可以在原有服务的情况下，对服务进行扩缩容，且不会增加新的版本；包括权限验证错误、服务状态错误和参数验证错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferDeploymentScaleRequest 请求对象
     * @return SyncInvoker<UpdateInferDeploymentScaleRequest, UpdateInferDeploymentScaleResponse>
     */
    public SyncInvoker<UpdateInferDeploymentScaleRequest, UpdateInferDeploymentScaleResponse> updateInferDeploymentScaleInvoker(
        UpdateInferDeploymentScaleRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateInferDeploymentScale, hcClient);
    }

    /**
     * 变更内网申请
     *
     * 本接口用于对当前租户的内网接入申请进行状态变更操作，支持通过（APPROVE）、拒绝（REJECT）、取消（CANCEL）和重试（RETRY）等操作。适用于需要管理内网接入申请审批流程的场景。调用此接口前，确保已具备相应的变更权限，并提供有效的内网申请ID和所需的操作类型。变更成功后，内网申请的状态将更新为指定的操作结果，并记录相关日志。如果提供的内网申请ID无效、操作类型不支持或权限不足，将返回相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferIntranetConnectionRequest 请求对象
     * @return UpdateInferIntranetConnectionResponse
     */
    public UpdateInferIntranetConnectionResponse updateInferIntranetConnection(
        UpdateInferIntranetConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateInferIntranetConnection);
    }

    /**
     * 变更内网申请
     *
     * 本接口用于对当前租户的内网接入申请进行状态变更操作，支持通过（APPROVE）、拒绝（REJECT）、取消（CANCEL）和重试（RETRY）等操作。适用于需要管理内网接入申请审批流程的场景。调用此接口前，确保已具备相应的变更权限，并提供有效的内网申请ID和所需的操作类型。变更成功后，内网申请的状态将更新为指定的操作结果，并记录相关日志。如果提供的内网申请ID无效、操作类型不支持或权限不足，将返回相应的异常信息，提示用户检查输入数据的有效性和权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferIntranetConnectionRequest 请求对象
     * @return SyncInvoker<UpdateInferIntranetConnectionRequest, UpdateInferIntranetConnectionResponse>
     */
    public SyncInvoker<UpdateInferIntranetConnectionRequest, UpdateInferIntranetConnectionResponse> updateInferIntranetConnectionInvoker(
        UpdateInferIntranetConnectionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateInferIntranetConnection, hcClient);
    }

    /**
     * 更新服务配置
     *
     * 该接口适用于需要动态调整模型服务配置的场景，对模型的性能参数、资源池配置、服务调用配置等进行更新升级。通过调用此接口，用户可以在原有服务的情况下，升级成一个新的服务版本。调用此接口前，服务状态必须为“停止”、“失败”或“运行中”，且用户需具有修改服务的权限。更新成功后，新配置立即生效；若失败，服务保持原有配置并返回错误信息。常见异常包括参数验证错误、权限验证错误和服务状态错误。若服务ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；若服务状态不允许切换，则返回400 Bad Request。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferServiceRequest 请求对象
     * @return UpdateInferServiceResponse
     */
    public UpdateInferServiceResponse updateInferService(UpdateInferServiceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateInferService);
    }

    /**
     * 更新服务配置
     *
     * 该接口适用于需要动态调整模型服务配置的场景，对模型的性能参数、资源池配置、服务调用配置等进行更新升级。通过调用此接口，用户可以在原有服务的情况下，升级成一个新的服务版本。调用此接口前，服务状态必须为“停止”、“失败”或“运行中”，且用户需具有修改服务的权限。更新成功后，新配置立即生效；若失败，服务保持原有配置并返回错误信息。常见异常包括参数验证错误、权限验证错误和服务状态错误。若服务ID无效、版本号不存在或用户无权限，则返回400 Bad Request或403 Forbidden；若服务状态不允许切换，则返回400 Bad Request。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferServiceRequest 请求对象
     * @return SyncInvoker<UpdateInferServiceRequest, UpdateInferServiceResponse>
     */
    public SyncInvoker<UpdateInferServiceRequest, UpdateInferServiceResponse> updateInferServiceInvoker(
        UpdateInferServiceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateInferService, hcClient);
    }

    /**
     * 修改工作空间
     *
     * 修改工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateWorkspace);
    }

    /**
     * 修改工作空间
     *
     * 修改工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateWorkspace, hcClient);
    }

    /**
     * 修改工作空间配额
     *
     * 修改工作空间配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceQuotasRequest 请求对象
     * @return UpdateWorkspaceQuotasResponse
     */
    public UpdateWorkspaceQuotasResponse updateWorkspaceQuotas(UpdateWorkspaceQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateWorkspaceQuotas);
    }

    /**
     * 修改工作空间配额
     *
     * 修改工作空间配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceQuotasRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse>
     */
    public SyncInvoker<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse> updateWorkspaceQuotasInvoker(
        UpdateWorkspaceQuotasRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateWorkspaceQuotas, hcClient);
    }

    /**
     * 鉴权能否使用当前工作空间资源
     *
     * 鉴权能否使用当前工作空间资源接口用于验证用户是否有权限访问和使用当前工作空间中的资源。该接口适用于以下场景：当用户尝试访问或操作工作空间中的资源时，系统需要确认用户是否具有相应的权限。使用该接口的前提条件是用户已登录且工作空间已存在。鉴权成功后，用户可以正常访问和使用工作空间资源；若鉴权失败，接口将返回相应的错误信息，如用户无权限或工作空间不存在等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAuthorizationRequest 请求对象
     * @return ValidateAuthorizationResponse
     */
    public ValidateAuthorizationResponse validateAuthorization(ValidateAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.validateAuthorization);
    }

    /**
     * 鉴权能否使用当前工作空间资源
     *
     * 鉴权能否使用当前工作空间资源接口用于验证用户是否有权限访问和使用当前工作空间中的资源。该接口适用于以下场景：当用户尝试访问或操作工作空间中的资源时，系统需要确认用户是否具有相应的权限。使用该接口的前提条件是用户已登录且工作空间已存在。鉴权成功后，用户可以正常访问和使用工作空间资源；若鉴权失败，接口将返回相应的错误信息，如用户无权限或工作空间不存在等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAuthorizationRequest 请求对象
     * @return SyncInvoker<ValidateAuthorizationRequest, ValidateAuthorizationResponse>
     */
    public SyncInvoker<ValidateAuthorizationRequest, ValidateAuthorizationResponse> validateAuthorizationInvoker(
        ValidateAuthorizationRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.validateAuthorization, hcClient);
    }

    /**
     * 创建自动扩缩容策略
     *
     * 本接口用于在已部署的服务上创建定时扩缩容策略，适用于需要根据业务负载或特定时间自动调整服务实例个数的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，并提供详细的扩缩容策略参数，如扩缩容时间、实例个数范围、条件触发器等。创建成功后，系统将根据设定的策略自动调整服务实例个数，确保服务在指定时间内的性能和可用性。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferDeploymentHpaRequest 请求对象
     * @return CreateInferDeploymentHpaResponse
     */
    public CreateInferDeploymentHpaResponse createInferDeploymentHpa(CreateInferDeploymentHpaRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createInferDeploymentHpa);
    }

    /**
     * 创建自动扩缩容策略
     *
     * 本接口用于在已部署的服务上创建定时扩缩容策略，适用于需要根据业务负载或特定时间自动调整服务实例个数的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，并提供详细的扩缩容策略参数，如扩缩容时间、实例个数范围、条件触发器等。创建成功后，系统将根据设定的策略自动调整服务实例个数，确保服务在指定时间内的性能和可用性。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferDeploymentHpaRequest 请求对象
     * @return SyncInvoker<CreateInferDeploymentHpaRequest, CreateInferDeploymentHpaResponse>
     */
    public SyncInvoker<CreateInferDeploymentHpaRequest, CreateInferDeploymentHpaResponse> createInferDeploymentHpaInvoker(
        CreateInferDeploymentHpaRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createInferDeploymentHpa, hcClient);
    }

    /**
     * 删除自动扩缩容策略
     *
     * 本接口用于在已部署的服务上删除定时扩缩容策略，适用于需要根据业务负载或特定时间自动删除服务的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，部署ID。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。暂时为非开放接口，后端清理服务下的自动扩缩容策略规则使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentHpaRequest 请求对象
     * @return DeleteInferDeploymentHpaResponse
     */
    public DeleteInferDeploymentHpaResponse deleteInferDeploymentHpa(DeleteInferDeploymentHpaRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteInferDeploymentHpa);
    }

    /**
     * 删除自动扩缩容策略
     *
     * 本接口用于在已部署的服务上删除定时扩缩容策略，适用于需要根据业务负载或特定时间自动删除服务的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，部署ID。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。暂时为非开放接口，后端清理服务下的自动扩缩容策略规则使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInferDeploymentHpaRequest 请求对象
     * @return SyncInvoker<DeleteInferDeploymentHpaRequest, DeleteInferDeploymentHpaResponse>
     */
    public SyncInvoker<DeleteInferDeploymentHpaRequest, DeleteInferDeploymentHpaResponse> deleteInferDeploymentHpaInvoker(
        DeleteInferDeploymentHpaRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteInferDeploymentHpa, hcClient);
    }

    /**
     * 查看自动扩缩容策略事件
     *
     * 本接口用于在已部署的服务上查看自动扩缩容策略事件，适用于查看自动扩缩容策略变动历史记录。调用此接口前，确保获取了有效的用户项目ID，服务ID，部署ID。调用成功后，会返回策略事件ID，事件状态，规则执行信息，扩缩容前实例数，扩缩容后实例数，预设目标实例数，执行记录时间。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentHpaEventsRequest 请求对象
     * @return ListInferDeploymentHpaEventsResponse
     */
    public ListInferDeploymentHpaEventsResponse listInferDeploymentHpaEvents(
        ListInferDeploymentHpaEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInferDeploymentHpaEvents);
    }

    /**
     * 查看自动扩缩容策略事件
     *
     * 本接口用于在已部署的服务上查看自动扩缩容策略事件，适用于查看自动扩缩容策略变动历史记录。调用此接口前，确保获取了有效的用户项目ID，服务ID，部署ID。调用成功后，会返回策略事件ID，事件状态，规则执行信息，扩缩容前实例数，扩缩容后实例数，预设目标实例数，执行记录时间。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInferDeploymentHpaEventsRequest 请求对象
     * @return SyncInvoker<ListInferDeploymentHpaEventsRequest, ListInferDeploymentHpaEventsResponse>
     */
    public SyncInvoker<ListInferDeploymentHpaEventsRequest, ListInferDeploymentHpaEventsResponse> listInferDeploymentHpaEventsInvoker(
        ListInferDeploymentHpaEventsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInferDeploymentHpaEvents, hcClient);
    }

    /**
     * 查看自动扩缩容策略
     *
     * 本接口用于在已部署的服务上查看自动扩缩容策略。调用此接口前，确保服务已成功部署并获取了有效的服务ID。查询成功后，返回服务对应的策略信息，如规则ID，规则名称，扩缩容类型，扩缩容状态，扩缩容cron表达式，目标实例数等。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferDeploymentHpaRequest 请求对象
     * @return ShowInferDeploymentHpaResponse
     */
    public ShowInferDeploymentHpaResponse showInferDeploymentHpa(ShowInferDeploymentHpaRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInferDeploymentHpa);
    }

    /**
     * 查看自动扩缩容策略
     *
     * 本接口用于在已部署的服务上查看自动扩缩容策略。调用此接口前，确保服务已成功部署并获取了有效的服务ID。查询成功后，返回服务对应的策略信息，如规则ID，规则名称，扩缩容类型，扩缩容状态，扩缩容cron表达式，目标实例数等。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferDeploymentHpaRequest 请求对象
     * @return SyncInvoker<ShowInferDeploymentHpaRequest, ShowInferDeploymentHpaResponse>
     */
    public SyncInvoker<ShowInferDeploymentHpaRequest, ShowInferDeploymentHpaResponse> showInferDeploymentHpaInvoker(
        ShowInferDeploymentHpaRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInferDeploymentHpa, hcClient);
    }

    /**
     * 修改自动扩缩容策略
     *
     * 本接口用于在已部署的服务上修改定时扩缩容策略，适用于需要根据业务负载或特定时间自动调整服务实例个数的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，部署ID，并提供详细的扩缩容策略参数，如扩缩容时间、实例个数范围、条件触发器等。修改成功后，系统将根据设定的策略自动调整服务实例个数，确保服务在指定时间内的性能和可用性。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferDeploymentHpaRequest 请求对象
     * @return UpdateInferDeploymentHpaResponse
     */
    public UpdateInferDeploymentHpaResponse updateInferDeploymentHpa(UpdateInferDeploymentHpaRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateInferDeploymentHpa);
    }

    /**
     * 修改自动扩缩容策略
     *
     * 本接口用于在已部署的服务上修改定时扩缩容策略，适用于需要根据业务负载或特定时间自动调整服务实例个数的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，部署ID，并提供详细的扩缩容策略参数，如扩缩容时间、实例个数范围、条件触发器等。修改成功后，系统将根据设定的策略自动调整服务实例个数，确保服务在指定时间内的性能和可用性。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferDeploymentHpaRequest 请求对象
     * @return SyncInvoker<UpdateInferDeploymentHpaRequest, UpdateInferDeploymentHpaResponse>
     */
    public SyncInvoker<UpdateInferDeploymentHpaRequest, UpdateInferDeploymentHpaResponse> updateInferDeploymentHpaInvoker(
        UpdateInferDeploymentHpaRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateInferDeploymentHpa, hcClient);
    }

    /**
     * 创建HRA策略
     *
     * 本接口用于在已部署且支持HRA策略的服务上创建HRA策略，适用于需要根据业务负载或特定时间自动调整服务实例个数的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，并提供详细的hra策略参数，如hra时间、实例个数范围、条件触发器等。创建成功后，系统将根据设定的策略自动调整服务实例个数，确保服务在指定时间内的性能和可用性。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferHraRequest 请求对象
     * @return CreateInferHraResponse
     */
    public CreateInferHraResponse createInferHra(CreateInferHraRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createInferHra);
    }

    /**
     * 创建HRA策略
     *
     * 本接口用于在已部署且支持HRA策略的服务上创建HRA策略，适用于需要根据业务负载或特定时间自动调整服务实例个数的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，并提供详细的hra策略参数，如hra时间、实例个数范围、条件触发器等。创建成功后，系统将根据设定的策略自动调整服务实例个数，确保服务在指定时间内的性能和可用性。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInferHraRequest 请求对象
     * @return SyncInvoker<CreateInferHraRequest, CreateInferHraResponse>
     */
    public SyncInvoker<CreateInferHraRequest, CreateInferHraResponse> createInferHraInvoker(
        CreateInferHraRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createInferHra, hcClient);
    }

    /**
     * 获取推理单元配比检测信息
     *
     * 本接口用于在已部署的服务上查看推理单元配比检测信息。调用此接口前，确保服务已成功部署并获取了有效的服务ID。查询成功后，返回服务对应的策略信息，如规则ID，规则名称，策略状态，HRA结果状态等。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferHraRequest 请求对象
     * @return ShowInferHraResponse
     */
    public ShowInferHraResponse showInferHra(ShowInferHraRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInferHra);
    }

    /**
     * 获取推理单元配比检测信息
     *
     * 本接口用于在已部署的服务上查看推理单元配比检测信息。调用此接口前，确保服务已成功部署并获取了有效的服务ID。查询成功后，返回服务对应的策略信息，如规则ID，规则名称，策略状态，HRA结果状态等。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInferHraRequest 请求对象
     * @return SyncInvoker<ShowInferHraRequest, ShowInferHraResponse>
     */
    public SyncInvoker<ShowInferHraRequest, ShowInferHraResponse> showInferHraInvoker(ShowInferHraRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInferHra, hcClient);
    }

    /**
     * 修改指定部署的HRA策略配置
     *
     * 本接口用于在已创建HRA策略的服务上修改指定部署的HRA策略配置，适用于需要根据业务负载或特定时间自动调整服务实例个数的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，部署ID，并提供详细的hra策略参数，如HRA规则列表、HRA结果状态、策略状态等。修改成功后，系统将根据设定的策略自动调整服务实例个数，确保服务在指定时间内的性能和可用性。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferHraRequest 请求对象
     * @return UpdateInferHraResponse
     */
    public UpdateInferHraResponse updateInferHra(UpdateInferHraRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateInferHra);
    }

    /**
     * 修改指定部署的HRA策略配置
     *
     * 本接口用于在已创建HRA策略的服务上修改指定部署的HRA策略配置，适用于需要根据业务负载或特定时间自动调整服务实例个数的场景。调用此接口前，确保服务已成功部署并获取了有效的服务ID，部署ID，并提供详细的hra策略参数，如HRA规则列表、HRA结果状态、策略状态等。修改成功后，系统将根据设定的策略自动调整服务实例个数，确保服务在指定时间内的性能和可用性。如果提供的服务ID无效、参数配置错误或系统资源不足，将返回相应的异常信息，提示用户检查输入数据的有效性或联系技术支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInferHraRequest 请求对象
     * @return SyncInvoker<UpdateInferHraRequest, UpdateInferHraResponse>
     */
    public SyncInvoker<UpdateInferHraRequest, UpdateInferHraResponse> updateInferHraInvoker(
        UpdateInferHraRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateInferHra, hcClient);
    }

    /**
     * Lite Server服务器挂载磁盘
     *
     * Lite Server服务器挂载磁盘接口用于将额外的磁盘挂载到Lite Server服务器上。该接口适用于以下场景：当用户需要扩展Lite Server服务器的存储空间以满足更大的数据存储需求时，可以通过此接口将指定的磁盘挂载到服务器上。使用该接口的前提条件是Lite Server服务器已创建且处于运行状态、或者停止状态，用户具有挂载磁盘的权限，且指定的磁盘已存在且未被其他服务器使用。挂载操作完成后，磁盘将成功挂载到Lite Server服务器上，用户可以访问和使用新增的存储空间。若Lite Server服务器不存在、指定的磁盘不存在或已被使用，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachDevServerVolumeRequest 请求对象
     * @return AttachDevServerVolumeResponse
     */
    public AttachDevServerVolumeResponse attachDevServerVolume(AttachDevServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.attachDevServerVolume);
    }

    /**
     * Lite Server服务器挂载磁盘
     *
     * Lite Server服务器挂载磁盘接口用于将额外的磁盘挂载到Lite Server服务器上。该接口适用于以下场景：当用户需要扩展Lite Server服务器的存储空间以满足更大的数据存储需求时，可以通过此接口将指定的磁盘挂载到服务器上。使用该接口的前提条件是Lite Server服务器已创建且处于运行状态、或者停止状态，用户具有挂载磁盘的权限，且指定的磁盘已存在且未被其他服务器使用。挂载操作完成后，磁盘将成功挂载到Lite Server服务器上，用户可以访问和使用新增的存储空间。若Lite Server服务器不存在、指定的磁盘不存在或已被使用，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachDevServerVolumeRequest 请求对象
     * @return SyncInvoker<AttachDevServerVolumeRequest, AttachDevServerVolumeResponse>
     */
    public SyncInvoker<AttachDevServerVolumeRequest, AttachDevServerVolumeResponse> attachDevServerVolumeInvoker(
        AttachDevServerVolumeRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.attachDevServerVolume, hcClient);
    }

    /**
     * 批量操作Lite Server实例
     *
     * 批量操作Lite Server实例接口用于对多个Lite Server实例进行统一操作，如启动、停止、重启或删除等。该接口适用于以下场景：当需要对多个Lite Server实例进行相同的操作，例如在维护期间批量停止实例、更新配置后批量重启实例或清理不再需要的实例时，用户可通过此接口高效地完成批量操作。使用该接口的前提条件是目标Lite Server实例已存在且用户具有相应的操作权限。操作完成后，所有指定的Lite Server实例将根据请求完成相应的状态变更或被移除，相关资源和配置也将被相应调整或清理。若目标Lite Server实例不存在、用户无权限操作或请求参数不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDevServersActionRequest 请求对象
     * @return BatchDevServersActionResponse
     */
    public BatchDevServersActionResponse batchDevServersAction(BatchDevServersActionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.batchDevServersAction);
    }

    /**
     * 批量操作Lite Server实例
     *
     * 批量操作Lite Server实例接口用于对多个Lite Server实例进行统一操作，如启动、停止、重启或删除等。该接口适用于以下场景：当需要对多个Lite Server实例进行相同的操作，例如在维护期间批量停止实例、更新配置后批量重启实例或清理不再需要的实例时，用户可通过此接口高效地完成批量操作。使用该接口的前提条件是目标Lite Server实例已存在且用户具有相应的操作权限。操作完成后，所有指定的Lite Server实例将根据请求完成相应的状态变更或被移除，相关资源和配置也将被相应调整或清理。若目标Lite Server实例不存在、用户无权限操作或请求参数不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDevServersActionRequest 请求对象
     * @return SyncInvoker<BatchDevServersActionRequest, BatchDevServersActionResponse>
     */
    public SyncInvoker<BatchDevServersActionRequest, BatchDevServersActionResponse> batchDevServersActionInvoker(
        BatchDevServersActionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.batchDevServersAction, hcClient);
    }

    /**
     * Lite Server服务器绑定EIP
     *
     * Lite Server服务器绑定的EIP接口用于将弹性公网IP（EIP）绑定到Lite Server服务器上。该接口适用于以下场景：当用户需要为Lite Server服务器分配一个固定的公网IP地址，以便从外部网络访问服务器时，可以通过此接口将指定的EIP绑定到服务器上。使用该接口的前提条件是Lite Server服务器已创建且处于运行状态，用户具有绑定EIP的权限，且指定的EIP已存在且未被其他资源使用。绑定操作完成后，EIP将成功绑定到Lite Server服务器上，服务器可以通过该EIP从外部网络访问。若Lite Server服务器不存在、已处于停止状态、指定的EIP不存在或已被使用，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDevServerPublicIPRequest 请求对象
     * @return BindDevServerPublicIPResponse
     */
    public BindDevServerPublicIPResponse bindDevServerPublicIP(BindDevServerPublicIPRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.bindDevServerPublicIP);
    }

    /**
     * Lite Server服务器绑定EIP
     *
     * Lite Server服务器绑定的EIP接口用于将弹性公网IP（EIP）绑定到Lite Server服务器上。该接口适用于以下场景：当用户需要为Lite Server服务器分配一个固定的公网IP地址，以便从外部网络访问服务器时，可以通过此接口将指定的EIP绑定到服务器上。使用该接口的前提条件是Lite Server服务器已创建且处于运行状态，用户具有绑定EIP的权限，且指定的EIP已存在且未被其他资源使用。绑定操作完成后，EIP将成功绑定到Lite Server服务器上，服务器可以通过该EIP从外部网络访问。若Lite Server服务器不存在、已处于停止状态、指定的EIP不存在或已被使用，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDevServerPublicIPRequest 请求对象
     * @return SyncInvoker<BindDevServerPublicIPRequest, BindDevServerPublicIPResponse>
     */
    public SyncInvoker<BindDevServerPublicIPRequest, BindDevServerPublicIPResponse> bindDevServerPublicIPInvoker(
        BindDevServerPublicIPRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.bindDevServerPublicIP, hcClient);
    }

    /**
     * 切换Lite Server服务器操作系统镜像
     *
     * 切换Lite Server服务器操作系统镜像接口用于更换Lite Server服务器当前使用的操作系统镜像。该接口适用于以下场景：当用户需要更换操作系统以适应不同的开发或测试需求时，可以通过此接口切换指定的Lite Server服务器操作系统镜像。使用该接口的前提条件是Lite Server服务器已存在且处于停止状态，用户具有切换操作系统的权限。切换操作完成后，Lite Server服务器将安装新的操作系统镜像，并重新进入运行状态，若Lite Server服务器不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDevServerOSRequest 请求对象
     * @return ChangeDevServerOSResponse
     */
    public ChangeDevServerOSResponse changeDevServerOS(ChangeDevServerOSRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.changeDevServerOS);
    }

    /**
     * 切换Lite Server服务器操作系统镜像
     *
     * 切换Lite Server服务器操作系统镜像接口用于更换Lite Server服务器当前使用的操作系统镜像。该接口适用于以下场景：当用户需要更换操作系统以适应不同的开发或测试需求时，可以通过此接口切换指定的Lite Server服务器操作系统镜像。使用该接口的前提条件是Lite Server服务器已存在且处于停止状态，用户具有切换操作系统的权限。切换操作完成后，Lite Server服务器将安装新的操作系统镜像，并重新进入运行状态，若Lite Server服务器不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDevServerOSRequest 请求对象
     * @return SyncInvoker<ChangeDevServerOSRequest, ChangeDevServerOSResponse>
     */
    public SyncInvoker<ChangeDevServerOSRequest, ChangeDevServerOSResponse> changeDevServerOSInvoker(
        ChangeDevServerOSRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.changeDevServerOS, hcClient);
    }

    /**
     * 切换Lite Server超节点服务器操作系统镜像
     *
     * 切换Lite Server超节点服务器操作系统镜像接口用于更换Lite Server超节点服务器当前使用的操作系统镜像。该接口适用于以下场景：当用户需要更换操作系统以适应不同的开发或测试需求时，可以通过此接口切换指定的Lite Server超节点服务器操作系统镜像。使用该接口的前提条件是Lite Server超节点服务器已存在且处于停止状态，用户具有切换操作系统的权限。切换操作完成后，Lite Server超节点服务器将安装新的操作系统镜像，并重新进入运行状态，若Lite Server超节点服务器不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeHyperinstanceOSRequest 请求对象
     * @return ChangeHyperinstanceOSResponse
     */
    public ChangeHyperinstanceOSResponse changeHyperinstanceOS(ChangeHyperinstanceOSRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.changeHyperinstanceOS);
    }

    /**
     * 切换Lite Server超节点服务器操作系统镜像
     *
     * 切换Lite Server超节点服务器操作系统镜像接口用于更换Lite Server超节点服务器当前使用的操作系统镜像。该接口适用于以下场景：当用户需要更换操作系统以适应不同的开发或测试需求时，可以通过此接口切换指定的Lite Server超节点服务器操作系统镜像。使用该接口的前提条件是Lite Server超节点服务器已存在且处于停止状态，用户具有切换操作系统的权限。切换操作完成后，Lite Server超节点服务器将安装新的操作系统镜像，并重新进入运行状态，若Lite Server超节点服务器不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeHyperinstanceOSRequest 请求对象
     * @return SyncInvoker<ChangeHyperinstanceOSRequest, ChangeHyperinstanceOSResponse>
     */
    public SyncInvoker<ChangeHyperinstanceOSRequest, ChangeHyperinstanceOSResponse> changeHyperinstanceOSInvoker(
        ChangeHyperinstanceOSRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.changeHyperinstanceOS, hcClient);
    }

    /**
     * 创建Lite Server
     *
     * 创建Lite Server接口用于创建LiteServer弹性云服务器、裸金属服务器及超节点服务器。该接口适用于以下场景：用户需要根据业务需求快速部署和配置不同类型的服务器资源。使用该接口的前提条件是用户已登录且具有创建Lite Server的权限，并且需要提供服务器类型、规格、网络配置等必要参数。创建操作完成后，系统将返回新创建的Lite Server实例信息，包括实例ID、状态等。若用户无权限、参数配置错误或资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDevServerRequest 请求对象
     * @return CreateDevServerResponse
     */
    public CreateDevServerResponse createDevServer(CreateDevServerRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createDevServer);
    }

    /**
     * 创建Lite Server
     *
     * 创建Lite Server接口用于创建LiteServer弹性云服务器、裸金属服务器及超节点服务器。该接口适用于以下场景：用户需要根据业务需求快速部署和配置不同类型的服务器资源。使用该接口的前提条件是用户已登录且具有创建Lite Server的权限，并且需要提供服务器类型、规格、网络配置等必要参数。创建操作完成后，系统将返回新创建的Lite Server实例信息，包括实例ID、状态等。若用户无权限、参数配置错误或资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDevServerRequest 请求对象
     * @return SyncInvoker<CreateDevServerRequest, CreateDevServerResponse>
     */
    public SyncInvoker<CreateDevServerRequest, CreateDevServerResponse> createDevServerInvoker(
        CreateDevServerRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createDevServer, hcClient);
    }

    /**
     * 创建Lite Server任务
     *
     * 创建Lite Server任务接口用于在Lite Server上创建新的任务。该接口适用于以下场景：当用户需要在Lite Server上启动新的开发、测试或部署任务时，可以通过此接口创建并配置任务。使用该接口的前提条件是用户具有创建任务的权限，并且提供的任务配置参数符合要求。创建操作完成后，新的Lite Server任务将被成功创建，并返回任务ID和其他相关信息。若用户无权限操作、提供的参数不正确或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDevServerJobRequest 请求对象
     * @return CreateDevServerJobResponse
     */
    public CreateDevServerJobResponse createDevServerJob(CreateDevServerJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createDevServerJob);
    }

    /**
     * 创建Lite Server任务
     *
     * 创建Lite Server任务接口用于在Lite Server上创建新的任务。该接口适用于以下场景：当用户需要在Lite Server上启动新的开发、测试或部署任务时，可以通过此接口创建并配置任务。使用该接口的前提条件是用户具有创建任务的权限，并且提供的任务配置参数符合要求。创建操作完成后，新的Lite Server任务将被成功创建，并返回任务ID和其他相关信息。若用户无权限操作、提供的参数不正确或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDevServerJobRequest 请求对象
     * @return SyncInvoker<CreateDevServerJobRequest, CreateDevServerJobResponse>
     */
    public SyncInvoker<CreateDevServerJobRequest, CreateDevServerJobResponse> createDevServerJobInvoker(
        CreateDevServerJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createDevServerJob, hcClient);
    }

    /**
     * 创建Hyper Cluster
     *
     * 创建Hyper Cluster接口用于在系统中创建一个新的Hyper Cluster。该接口适用于以下场景：当用户需要使用超节点网络时，可以通过此接口创建Hyper Cluster。使用该接口的前提条件是用户已登录并具有创建Hyper Cluster的权限，且系统中已配置了必要的资源。创建操作完成后，将生成一个新的超节点网络，并返回超节点网络的详细信息，包括ID、名称、子网信息等。若用户无权限操作、系统中缺少必要的资源或配置参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHyperClusterRequest 请求对象
     * @return CreateHyperClusterResponse
     */
    public CreateHyperClusterResponse createHyperCluster(CreateHyperClusterRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createHyperCluster);
    }

    /**
     * 创建Hyper Cluster
     *
     * 创建Hyper Cluster接口用于在系统中创建一个新的Hyper Cluster。该接口适用于以下场景：当用户需要使用超节点网络时，可以通过此接口创建Hyper Cluster。使用该接口的前提条件是用户已登录并具有创建Hyper Cluster的权限，且系统中已配置了必要的资源。创建操作完成后，将生成一个新的超节点网络，并返回超节点网络的详细信息，包括ID、名称、子网信息等。若用户无权限操作、系统中缺少必要的资源或配置参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHyperClusterRequest 请求对象
     * @return SyncInvoker<CreateHyperClusterRequest, CreateHyperClusterResponse>
     */
    public SyncInvoker<CreateHyperClusterRequest, CreateHyperClusterResponse> createHyperClusterInvoker(
        CreateHyperClusterRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createHyperCluster, hcClient);
    }

    /**
     * 创建Lite Server超节点标签
     *
     * 创建Lite Server超节点标签接口用于为Lite Server超节点添加自定义标签。该接口适用于以下场景：当用户需要对Lite Server超节点进行分类管理或标记特定信息时，可以通过此接口为指定的超节点创建标签。使用该接口的前提条件是Lite Server超节点已存在，用户具有创建标签的权限。创建操作完成后，标签将被成功添加到指定的超节点上，用户可以通过标签进行快速查找和管理。若Lite Server超节点不存在、标签已存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHyperinstanceTagsRequest 请求对象
     * @return CreateHyperinstanceTagsResponse
     */
    public CreateHyperinstanceTagsResponse createHyperinstanceTags(CreateHyperinstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createHyperinstanceTags);
    }

    /**
     * 创建Lite Server超节点标签
     *
     * 创建Lite Server超节点标签接口用于为Lite Server超节点添加自定义标签。该接口适用于以下场景：当用户需要对Lite Server超节点进行分类管理或标记特定信息时，可以通过此接口为指定的超节点创建标签。使用该接口的前提条件是Lite Server超节点已存在，用户具有创建标签的权限。创建操作完成后，标签将被成功添加到指定的超节点上，用户可以通过标签进行快速查找和管理。若Lite Server超节点不存在、标签已存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHyperinstanceTagsRequest 请求对象
     * @return SyncInvoker<CreateHyperinstanceTagsRequest, CreateHyperinstanceTagsResponse>
     */
    public SyncInvoker<CreateHyperinstanceTagsRequest, CreateHyperinstanceTagsResponse> createHyperinstanceTagsInvoker(
        CreateHyperinstanceTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createHyperinstanceTags, hcClient);
    }

    /**
     * 创建RoCE网络
     *
     * 创建RoCE网络接口用于在系统中创建一个新的RoCE网络。该接口适用于以下场景：当用户需要为高性能计算或低延迟应用创建专用的RoCE网络时，可以通过此接口创建并配置RoCE网络。使用该接口的前提条件是用户已登录并具有创建RoCE网络的权限，且系统中已配置了必要的网络资源。创建操作完成后，将生成一个新的RoCE网络，并返回网络的详细信息，包括网络ID、子网信息、配置参数等。若用户无权限操作、系统中缺少必要的网络资源或网络配置参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRoceNetworkRequest 请求对象
     * @return CreateRoceNetworkResponse
     */
    public CreateRoceNetworkResponse createRoceNetwork(CreateRoceNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createRoceNetwork);
    }

    /**
     * 创建RoCE网络
     *
     * 创建RoCE网络接口用于在系统中创建一个新的RoCE网络。该接口适用于以下场景：当用户需要为高性能计算或低延迟应用创建专用的RoCE网络时，可以通过此接口创建并配置RoCE网络。使用该接口的前提条件是用户已登录并具有创建RoCE网络的权限，且系统中已配置了必要的网络资源。创建操作完成后，将生成一个新的RoCE网络，并返回网络的详细信息，包括网络ID、子网信息、配置参数等。若用户无权限操作、系统中缺少必要的网络资源或网络配置参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRoceNetworkRequest 请求对象
     * @return SyncInvoker<CreateRoceNetworkRequest, CreateRoceNetworkResponse>
     */
    public SyncInvoker<CreateRoceNetworkRequest, CreateRoceNetworkResponse> createRoceNetworkInvoker(
        CreateRoceNetworkRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createRoceNetwork, hcClient);
    }

    /**
     * 删除Lite Server实例
     *
     * 删除Lite Server实例接口用于移除已创建的Lite Server实例。该接口适用于以下场景：当Lite Server按需实例不再需要使用时或者创建失败的实例以及处于ERROR状态时，用户可通过此接口删除指定的Lite Server实例。使用该接口的前提条件是Lite Server实例已存在且用户具有管理员权限。删除操作完成后，Lite Server实例将被永久移除，相关资源也将被清理。若Lite Server实例不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDevServerRequest 请求对象
     * @return DeleteDevServerResponse
     */
    public DeleteDevServerResponse deleteDevServer(DeleteDevServerRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteDevServer);
    }

    /**
     * 删除Lite Server实例
     *
     * 删除Lite Server实例接口用于移除已创建的Lite Server实例。该接口适用于以下场景：当Lite Server按需实例不再需要使用时或者创建失败的实例以及处于ERROR状态时，用户可通过此接口删除指定的Lite Server实例。使用该接口的前提条件是Lite Server实例已存在且用户具有管理员权限。删除操作完成后，Lite Server实例将被永久移除，相关资源也将被清理。若Lite Server实例不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDevServerRequest 请求对象
     * @return SyncInvoker<DeleteDevServerRequest, DeleteDevServerResponse>
     */
    public SyncInvoker<DeleteDevServerRequest, DeleteDevServerResponse> deleteDevServerInvoker(
        DeleteDevServerRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteDevServer, hcClient);
    }

    /**
     * 批量删除Lite Server Job
     *
     * 批量删除Lite Server Job接口用于批量移除已创建的Lite Server Job。该接口适用于以下场景：当多个Lite Server Job已完成、配置错误或需要清理资源时，用户可以通过此接口批量删除指定的Lite Server Job。使用该接口的前提条件是目标Lite Server Job已存在且用户具有管理员权限。删除操作完成后，指定的Lite Server Job将被永久移除，相关资源和配置也将被清理。若目标Lite Server Job不存在、用户无权限操作或请求参数不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDevServerJobsRequest 请求对象
     * @return DeleteDevServerJobsResponse
     */
    public DeleteDevServerJobsResponse deleteDevServerJobs(DeleteDevServerJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteDevServerJobs);
    }

    /**
     * 批量删除Lite Server Job
     *
     * 批量删除Lite Server Job接口用于批量移除已创建的Lite Server Job。该接口适用于以下场景：当多个Lite Server Job已完成、配置错误或需要清理资源时，用户可以通过此接口批量删除指定的Lite Server Job。使用该接口的前提条件是目标Lite Server Job已存在且用户具有管理员权限。删除操作完成后，指定的Lite Server Job将被永久移除，相关资源和配置也将被清理。若目标Lite Server Job不存在、用户无权限操作或请求参数不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDevServerJobsRequest 请求对象
     * @return SyncInvoker<DeleteDevServerJobsRequest, DeleteDevServerJobsResponse>
     */
    public SyncInvoker<DeleteDevServerJobsRequest, DeleteDevServerJobsResponse> deleteDevServerJobsInvoker(
        DeleteDevServerJobsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteDevServerJobs, hcClient);
    }

    /**
     * 删除Hyper Cluster实例
     *
     * 删除Hyper Cluster实例接口用于移除已创建的Hyper Cluster。该接口适用于以下场景：当超节点网络配置错误或需要清理资源时，用户可通过此接口删除指定的超节点网络。使用该接口的前提条件是Hyper Cluster实例已存在且用户具有管理员权限。删除操作完成后，超节点网络将被永久移除，相关资源和配置也将被清理。若Hyper Cluster实例不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHyperClusterRequest 请求对象
     * @return DeleteHyperClusterResponse
     */
    public DeleteHyperClusterResponse deleteHyperCluster(DeleteHyperClusterRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteHyperCluster);
    }

    /**
     * 删除Hyper Cluster实例
     *
     * 删除Hyper Cluster实例接口用于移除已创建的Hyper Cluster。该接口适用于以下场景：当超节点网络配置错误或需要清理资源时，用户可通过此接口删除指定的超节点网络。使用该接口的前提条件是Hyper Cluster实例已存在且用户具有管理员权限。删除操作完成后，超节点网络将被永久移除，相关资源和配置也将被清理。若Hyper Cluster实例不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHyperClusterRequest 请求对象
     * @return SyncInvoker<DeleteHyperClusterRequest, DeleteHyperClusterResponse>
     */
    public SyncInvoker<DeleteHyperClusterRequest, DeleteHyperClusterResponse> deleteHyperClusterInvoker(
        DeleteHyperClusterRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteHyperCluster, hcClient);
    }

    /**
     * 删除Lite Server超节点实例
     *
     * 删除Lite Server超节点实例接口用于删除按需超节点实例同时移除处于ERROR状态的Lite Server超节点实例。该接口适用于以下场景：当超节点实例因创建失败、或其他原因进入ERROR状态；按需超节点实例，用户可以通过此接口删除指定的超节点实例。使用该接口的前提条件是用户已登录并具有删除超节点实例的权限，且指定的超节点实例是按需且处于运行状态、或者处于ERROR状态。删除操作完成后，指定的超节点实例将被永久移除，相关资源也将被清理。若指定的超节点实例不存在、未处于ERROR状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHyperinstanceRequest 请求对象
     * @return DeleteHyperinstanceResponse
     */
    public DeleteHyperinstanceResponse deleteHyperinstance(DeleteHyperinstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteHyperinstance);
    }

    /**
     * 删除Lite Server超节点实例
     *
     * 删除Lite Server超节点实例接口用于删除按需超节点实例同时移除处于ERROR状态的Lite Server超节点实例。该接口适用于以下场景：当超节点实例因创建失败、或其他原因进入ERROR状态；按需超节点实例，用户可以通过此接口删除指定的超节点实例。使用该接口的前提条件是用户已登录并具有删除超节点实例的权限，且指定的超节点实例是按需且处于运行状态、或者处于ERROR状态。删除操作完成后，指定的超节点实例将被永久移除，相关资源也将被清理。若指定的超节点实例不存在、未处于ERROR状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHyperinstanceRequest 请求对象
     * @return SyncInvoker<DeleteHyperinstanceRequest, DeleteHyperinstanceResponse>
     */
    public SyncInvoker<DeleteHyperinstanceRequest, DeleteHyperinstanceResponse> deleteHyperinstanceInvoker(
        DeleteHyperinstanceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteHyperinstance, hcClient);
    }

    /**
     * 删除Lite Server超节点标签
     *
     * 删除Lite Server超节点标签接口用于移除已创建的Lite Server超节点标签。该接口适用于以下场景：当用户需要清理不再需要的标签或修正标签错误时，可以通过此接口删除指定的超节点标签。使用该接口的前提条件是Lite Server超节点已存在，且该超节点上已存在要删除的标签，用户具有删除标签的权限。删除操作完成后，指定的标签将从超节点上移除，超节点的其他配置和数据保持不变。若Lite Server超节点不存在、标签不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHyperinstanceTagsRequest 请求对象
     * @return DeleteHyperinstanceTagsResponse
     */
    public DeleteHyperinstanceTagsResponse deleteHyperinstanceTags(DeleteHyperinstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteHyperinstanceTags);
    }

    /**
     * 删除Lite Server超节点标签
     *
     * 删除Lite Server超节点标签接口用于移除已创建的Lite Server超节点标签。该接口适用于以下场景：当用户需要清理不再需要的标签或修正标签错误时，可以通过此接口删除指定的超节点标签。使用该接口的前提条件是Lite Server超节点已存在，且该超节点上已存在要删除的标签，用户具有删除标签的权限。删除操作完成后，指定的标签将从超节点上移除，超节点的其他配置和数据保持不变。若Lite Server超节点不存在、标签不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHyperinstanceTagsRequest 请求对象
     * @return SyncInvoker<DeleteHyperinstanceTagsRequest, DeleteHyperinstanceTagsResponse>
     */
    public SyncInvoker<DeleteHyperinstanceTagsRequest, DeleteHyperinstanceTagsResponse> deleteHyperinstanceTagsInvoker(
        DeleteHyperinstanceTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteHyperinstanceTags, hcClient);
    }

    /**
     * Lite Server服务器卸载磁盘
     *
     * Lite Server服务器卸载磁盘接口用于从Lite Server服务器上卸载已挂载的磁盘。该接口适用于以下场景：当用户需要释放存储资源或重新分配磁盘时，可以通过此接口卸载指定的磁盘。使用该接口的前提条件是Lite Server服务器已创建且处于运行状态、或者停止状态，用户具有卸载磁盘的权限，且指定的磁盘已挂载到服务器上。卸载操作完成后，磁盘将从Lite Server服务器上成功卸载，用户可以将其挂载到其他服务器或进行其他操作。若Lite Server服务器不存在、指定的磁盘未挂载到服务器上，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachDevServerVolumeRequest 请求对象
     * @return DetachDevServerVolumeResponse
     */
    public DetachDevServerVolumeResponse detachDevServerVolume(DetachDevServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.detachDevServerVolume);
    }

    /**
     * Lite Server服务器卸载磁盘
     *
     * Lite Server服务器卸载磁盘接口用于从Lite Server服务器上卸载已挂载的磁盘。该接口适用于以下场景：当用户需要释放存储资源或重新分配磁盘时，可以通过此接口卸载指定的磁盘。使用该接口的前提条件是Lite Server服务器已创建且处于运行状态、或者停止状态，用户具有卸载磁盘的权限，且指定的磁盘已挂载到服务器上。卸载操作完成后，磁盘将从Lite Server服务器上成功卸载，用户可以将其挂载到其他服务器或进行其他操作。若Lite Server服务器不存在、指定的磁盘未挂载到服务器上，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachDevServerVolumeRequest 请求对象
     * @return SyncInvoker<DetachDevServerVolumeRequest, DetachDevServerVolumeResponse>
     */
    public SyncInvoker<DetachDevServerVolumeRequest, DetachDevServerVolumeResponse> detachDevServerVolumeInvoker(
        DetachDevServerVolumeRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.detachDevServerVolume, hcClient);
    }

    /**
     * 查询Lite Server镜像详情
     *
     * 查询Lite Server镜像详情接口用于获取指定Lite Server镜像的详细信息。该接口适用于以下场景：当用户需要了解某个Lite Server镜像的具体配置和属性，以便在创建或调整Lite Server实例时选择合适的镜像时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询镜像详情的权限，且指定的镜像已存在。查询操作完成后，接口将返回指定Lite Server镜像的详细信息，包括镜像ID、名称、操作系统、版本、创建时间等。若用户无权限操作、指定的镜像不存在或镜像ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerImageRequest 请求对象
     * @return GetDevServerImageResponse
     */
    public GetDevServerImageResponse getDevServerImage(GetDevServerImageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getDevServerImage);
    }

    /**
     * 查询Lite Server镜像详情
     *
     * 查询Lite Server镜像详情接口用于获取指定Lite Server镜像的详细信息。该接口适用于以下场景：当用户需要了解某个Lite Server镜像的具体配置和属性，以便在创建或调整Lite Server实例时选择合适的镜像时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询镜像详情的权限，且指定的镜像已存在。查询操作完成后，接口将返回指定Lite Server镜像的详细信息，包括镜像ID、名称、操作系统、版本、创建时间等。若用户无权限操作、指定的镜像不存在或镜像ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerImageRequest 请求对象
     * @return SyncInvoker<GetDevServerImageRequest, GetDevServerImageResponse>
     */
    public SyncInvoker<GetDevServerImageRequest, GetDevServerImageResponse> getDevServerImageInvoker(
        GetDevServerImageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getDevServerImage, hcClient);
    }

    /**
     * 查询Lite Server Job详情
     *
     * 查询Lite Server Job详情接口用于获取指定Lite Server Job的详细信息。该接口适用于以下场景：当用户需要查看某个Lite Server Job的执行状态、配置参数、日志信息等详细数据时，可以通过此接口获取相关信息。使用该接口的前提条件是目标Lite Server Job已存在且用户具有查看权限。查询操作完成后，接口将返回指定Lite Server Job的详细信息，包括但不限于Job ID、状态、创建时间、执行时间、配置参数和日志等。若目标Lite Server Job不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerJobRequest 请求对象
     * @return GetDevServerJobResponse
     */
    public GetDevServerJobResponse getDevServerJob(GetDevServerJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getDevServerJob);
    }

    /**
     * 查询Lite Server Job详情
     *
     * 查询Lite Server Job详情接口用于获取指定Lite Server Job的详细信息。该接口适用于以下场景：当用户需要查看某个Lite Server Job的执行状态、配置参数、日志信息等详细数据时，可以通过此接口获取相关信息。使用该接口的前提条件是目标Lite Server Job已存在且用户具有查看权限。查询操作完成后，接口将返回指定Lite Server Job的详细信息，包括但不限于Job ID、状态、创建时间、执行时间、配置参数和日志等。若目标Lite Server Job不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerJobRequest 请求对象
     * @return SyncInvoker<GetDevServerJobRequest, GetDevServerJobResponse>
     */
    public SyncInvoker<GetDevServerJobRequest, GetDevServerJobResponse> getDevServerJobInvoker(
        GetDevServerJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getDevServerJob, hcClient);
    }

    /**
     * 获取Lite Server 部署服务详情
     *
     * 根据服务id获取Lite Server部署服务详情。该接口适用于以下场景：当用户需要查看部署服务详情，以便查看已部署服务的状态、api等信息时，可以通过此接口获取服务详情。使用该接口的前提条件是用户具有查看服务的权限。查询操作完成后，接口将返回此部署服务的详细信息，包括名称、状态、描述、所用模型、实例详情等信息。若用户无权限操作或无相应id，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerJobServiceRequest 请求对象
     * @return GetDevServerJobServiceResponse
     */
    public GetDevServerJobServiceResponse getDevServerJobService(GetDevServerJobServiceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getDevServerJobService);
    }

    /**
     * 获取Lite Server 部署服务详情
     *
     * 根据服务id获取Lite Server部署服务详情。该接口适用于以下场景：当用户需要查看部署服务详情，以便查看已部署服务的状态、api等信息时，可以通过此接口获取服务详情。使用该接口的前提条件是用户具有查看服务的权限。查询操作完成后，接口将返回此部署服务的详细信息，包括名称、状态、描述、所用模型、实例详情等信息。若用户无权限操作或无相应id，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerJobServiceRequest 请求对象
     * @return SyncInvoker<GetDevServerJobServiceRequest, GetDevServerJobServiceResponse>
     */
    public SyncInvoker<GetDevServerJobServiceRequest, GetDevServerJobServiceResponse> getDevServerJobServiceInvoker(
        GetDevServerJobServiceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getDevServerJobService, hcClient);
    }

    /**
     * 获取Lite Server Job模板详情
     *
     * 获取Lite Server Job模板详情接口用于获取指定Lite Server Job模板的详细信息。该接口适用于以下场景：当用户需要查看某个特定Job模板的详细配置，以便了解其参数设置、使用说明等信息时，可以通过此接口获取模板详情。查询操作完成后，接口将返回指定模板的详细信息，包括模板ID、名称、描述、配置参数等。若目标模板不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerJobTemplateRequest 请求对象
     * @return GetDevServerJobTemplateResponse
     */
    public GetDevServerJobTemplateResponse getDevServerJobTemplate(GetDevServerJobTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getDevServerJobTemplate);
    }

    /**
     * 获取Lite Server Job模板详情
     *
     * 获取Lite Server Job模板详情接口用于获取指定Lite Server Job模板的详细信息。该接口适用于以下场景：当用户需要查看某个特定Job模板的详细配置，以便了解其参数设置、使用说明等信息时，可以通过此接口获取模板详情。查询操作完成后，接口将返回指定模板的详细信息，包括模板ID、名称、描述、配置参数等。若目标模板不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerJobTemplateRequest 请求对象
     * @return SyncInvoker<GetDevServerJobTemplateRequest, GetDevServerJobTemplateResponse>
     */
    public SyncInvoker<GetDevServerJobTemplateRequest, GetDevServerJobTemplateResponse> getDevServerJobTemplateInvoker(
        GetDevServerJobTemplateRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getDevServerJobTemplate, hcClient);
    }

    /**
     * 查询Operation详情
     *
     * 查询Operation详情接口用于获取指定Operation的详细信息。该接口适用于以下场景：当用户需要了解某个Operation的具体执行情况和状态，以便进行故障排查或操作审计时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询Operation详情的权限，且指定的Operation已存在。查询操作完成后，接口将返回指定Operation的详细信息，包括Operation ID、操作类型、执行状态、开始时间、结束时间、操作结果等。若用户无权限操作、指定的Operation不存在或Operation ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerOperationRequest 请求对象
     * @return GetDevServerOperationResponse
     */
    public GetDevServerOperationResponse getDevServerOperation(GetDevServerOperationRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getDevServerOperation);
    }

    /**
     * 查询Operation详情
     *
     * 查询Operation详情接口用于获取指定Operation的详细信息。该接口适用于以下场景：当用户需要了解某个Operation的具体执行情况和状态，以便进行故障排查或操作审计时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询Operation详情的权限，且指定的Operation已存在。查询操作完成后，接口将返回指定Operation的详细信息，包括Operation ID、操作类型、执行状态、开始时间、结束时间、操作结果等。若用户无权限操作、指定的Operation不存在或Operation ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDevServerOperationRequest 请求对象
     * @return SyncInvoker<GetDevServerOperationRequest, GetDevServerOperationResponse>
     */
    public SyncInvoker<GetDevServerOperationRequest, GetDevServerOperationResponse> getDevServerOperationInvoker(
        GetDevServerOperationRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getDevServerOperation, hcClient);
    }

    /**
     * 查询Hyper Cluster实例详情
     *
     * 查询Hyper Cluster实例详情接口用于获取指定Hyper Cluster实例的详细信息。该接口适用于以下场景：当用户需要了解某个超节点网络的具体配置和状态，以便进行管理和监控时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询Hyper Cluster详情的权限，且指定的超节点网络已存在。查询操作完成后，接口将返回指定超节点网络的详细信息，包括ID、名称、子网信息等。若用户无权限操作、指定的超节点网络不存在或ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHyperClusterRequest 请求对象
     * @return GetHyperClusterResponse
     */
    public GetHyperClusterResponse getHyperCluster(GetHyperClusterRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getHyperCluster);
    }

    /**
     * 查询Hyper Cluster实例详情
     *
     * 查询Hyper Cluster实例详情接口用于获取指定Hyper Cluster实例的详细信息。该接口适用于以下场景：当用户需要了解某个超节点网络的具体配置和状态，以便进行管理和监控时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询Hyper Cluster详情的权限，且指定的超节点网络已存在。查询操作完成后，接口将返回指定超节点网络的详细信息，包括ID、名称、子网信息等。若用户无权限操作、指定的超节点网络不存在或ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHyperClusterRequest 请求对象
     * @return SyncInvoker<GetHyperClusterRequest, GetHyperClusterResponse>
     */
    public SyncInvoker<GetHyperClusterRequest, GetHyperClusterResponse> getHyperClusterInvoker(
        GetHyperClusterRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getHyperCluster, hcClient);
    }

    /**
     * 查询指定超节点实例详情
     *
     * 查询指定超节点实例详情接口用于获取特定Lite Server超节点实例的详细信息。该接口适用于以下场景：当用户需要查看某个具体超节点实例的配置、状态和使用情况时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询超节点实例的权限，且指定的超节点实例已存在。查询操作完成后，接口将返回指定超节点实例的详细信息，包括实例ID、操作系统、运行状态、资源使用情况等。若用户无权限操作、指定的超节点实例不存在或实例ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHyperinstanceRequest 请求对象
     * @return GetHyperinstanceResponse
     */
    public GetHyperinstanceResponse getHyperinstance(GetHyperinstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getHyperinstance);
    }

    /**
     * 查询指定超节点实例详情
     *
     * 查询指定超节点实例详情接口用于获取特定Lite Server超节点实例的详细信息。该接口适用于以下场景：当用户需要查看某个具体超节点实例的配置、状态和使用情况时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询超节点实例的权限，且指定的超节点实例已存在。查询操作完成后，接口将返回指定超节点实例的详细信息，包括实例ID、操作系统、运行状态、资源使用情况等。若用户无权限操作、指定的超节点实例不存在或实例ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHyperinstanceRequest 请求对象
     * @return SyncInvoker<GetHyperinstanceRequest, GetHyperinstanceResponse>
     */
    public SyncInvoker<GetHyperinstanceRequest, GetHyperinstanceResponse> getHyperinstanceInvoker(
        GetHyperinstanceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getHyperinstance, hcClient);
    }

    /**
     * 查询Lite Server超节点扩缩容支持规格列表及容量测算
     *
     * 查询Lite Server超节点扩缩容支持规格列表及容量测算接口用于获取Lite Server超节点支持的扩缩容规格列表，并进行容量测算。该接口适用于以下场景：当用户需要了解Lite Server超节点支持的扩缩容选项，以便在调整超节点资源时选择合适的规格，并评估扩缩容后的资源需求时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询超节点扩缩容规格的权限，且指定的超节点已存在。查询操作完成后，接口将返回支持的扩缩容规格列表及容量测算结果，包括规格ID、CPU、内存、存储等详细配置和扩缩容后的资源使用情况。若用户无权限操作、指定的超节点不存在或系统中没有可用的扩缩容规格，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScaleEvaluationsDevServerRequest 请求对象
     * @return GetScaleEvaluationsDevServerResponse
     */
    public GetScaleEvaluationsDevServerResponse getScaleEvaluationsDevServer(
        GetScaleEvaluationsDevServerRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getScaleEvaluationsDevServer);
    }

    /**
     * 查询Lite Server超节点扩缩容支持规格列表及容量测算
     *
     * 查询Lite Server超节点扩缩容支持规格列表及容量测算接口用于获取Lite Server超节点支持的扩缩容规格列表，并进行容量测算。该接口适用于以下场景：当用户需要了解Lite Server超节点支持的扩缩容选项，以便在调整超节点资源时选择合适的规格，并评估扩缩容后的资源需求时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询超节点扩缩容规格的权限，且指定的超节点已存在。查询操作完成后，接口将返回支持的扩缩容规格列表及容量测算结果，包括规格ID、CPU、内存、存储等详细配置和扩缩容后的资源使用情况。若用户无权限操作、指定的超节点不存在或系统中没有可用的扩缩容规格，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScaleEvaluationsDevServerRequest 请求对象
     * @return SyncInvoker<GetScaleEvaluationsDevServerRequest, GetScaleEvaluationsDevServerResponse>
     */
    public SyncInvoker<GetScaleEvaluationsDevServerRequest, GetScaleEvaluationsDevServerResponse> getScaleEvaluationsDevServerInvoker(
        GetScaleEvaluationsDevServerRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getScaleEvaluationsDevServer, hcClient);
    }

    /**
     * 查询实例的Tor信息
     *
     * 查询实例的Tor信息接口用于获取指定实例的Top-of-Rack（Tor）交换机相关信息。该接口适用于以下场景：当用户需要了解实例连接的Tor交换机的详细信息，以便进行网络配置时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询实例Tor信息的权限，且指定的实例已存在。查询操作完成后，接口将返回指定实例的Tor信息。若用户无权限操作、指定的实例不存在或实例未连接到Tor交换机，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTopologiesRequest 请求对象
     * @return GetTopologiesResponse
     */
    public GetTopologiesResponse getTopologies(GetTopologiesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.getTopologies);
    }

    /**
     * 查询实例的Tor信息
     *
     * 查询实例的Tor信息接口用于获取指定实例的Top-of-Rack（Tor）交换机相关信息。该接口适用于以下场景：当用户需要了解实例连接的Tor交换机的详细信息，以便进行网络配置时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询实例Tor信息的权限，且指定的实例已存在。查询操作完成后，接口将返回指定实例的Tor信息。若用户无权限操作、指定的实例不存在或实例未连接到Tor交换机，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTopologiesRequest 请求对象
     * @return SyncInvoker<GetTopologiesRequest, GetTopologiesResponse>
     */
    public SyncInvoker<GetTopologiesRequest, GetTopologiesResponse> getTopologiesInvoker(GetTopologiesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.getTopologies, hcClient);
    }

    /**
     * 查询租户Lite Server列表
     *
     * 查询租户Lite Server列表接口用于获取指定租户的所有Lite Server实例信息。该接口适用于以下场景：当用户需要查看其租户下所有Lite Server实例的详细信息，以便进行管理和监控时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询租户Lite Server列表的权限。查询操作完成后，接口将返回租户下所有Lite Server实例的详细信息，包括实例ID、名称、状态、资源配置等。若用户无权限操作或租户下没有Lite Server实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllDevServersRequest 请求对象
     * @return ListAllDevServersResponse
     */
    public ListAllDevServersResponse listAllDevServers(ListAllDevServersRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listAllDevServers);
    }

    /**
     * 查询租户Lite Server列表
     *
     * 查询租户Lite Server列表接口用于获取指定租户的所有Lite Server实例信息。该接口适用于以下场景：当用户需要查看其租户下所有Lite Server实例的详细信息，以便进行管理和监控时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询租户Lite Server列表的权限。查询操作完成后，接口将返回租户下所有Lite Server实例的详细信息，包括实例ID、名称、状态、资源配置等。若用户无权限操作或租户下没有Lite Server实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllDevServersRequest 请求对象
     * @return SyncInvoker<ListAllDevServersRequest, ListAllDevServersResponse>
     */
    public SyncInvoker<ListAllDevServersRequest, ListAllDevServersResponse> listAllDevServersInvoker(
        ListAllDevServersRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listAllDevServers, hcClient);
    }

    /**
     * 查询租户Hyperinstance列表
     *
     * 查询租户Hyperinstance列表接口用于获取指定租户的所有Hyperinstance实例信息。该接口适用于以下场景：当用户需要查看其租户下所有Hyperinstance实例的详细信息，以便进行管理和监控时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询租户Hyperinstance列表的权限。查询操作完成后，接口将返回租户下所有Hyperinstance实例的详细信息，包括实例ID、名称、状态、资源配置等。若用户无权限操作或租户下没有Hyperinstance实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllHyperinstancesRequest 请求对象
     * @return ListAllHyperinstancesResponse
     */
    public ListAllHyperinstancesResponse listAllHyperinstances(ListAllHyperinstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listAllHyperinstances);
    }

    /**
     * 查询租户Hyperinstance列表
     *
     * 查询租户Hyperinstance列表接口用于获取指定租户的所有Hyperinstance实例信息。该接口适用于以下场景：当用户需要查看其租户下所有Hyperinstance实例的详细信息，以便进行管理和监控时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询租户Hyperinstance列表的权限。查询操作完成后，接口将返回租户下所有Hyperinstance实例的详细信息，包括实例ID、名称、状态、资源配置等。若用户无权限操作或租户下没有Hyperinstance实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllHyperinstancesRequest 请求对象
     * @return SyncInvoker<ListAllHyperinstancesRequest, ListAllHyperinstancesResponse>
     */
    public SyncInvoker<ListAllHyperinstancesRequest, ListAllHyperinstancesResponse> listAllHyperinstancesInvoker(
        ListAllHyperinstancesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listAllHyperinstances, hcClient);
    }

    /**
     * 查询规格列表
     *
     * 查询规格列表接口用于获取系统中所有可用的资源规格信息。该接口适用于以下场景：当用户需要了解可用的资源规格，以便在创建或调整Lite Server实例时选择合适的配置时，可以通过此接口获取规格列表。使用该接口的前提条件是用户已登录并具有查询规格的权限。查询操作完成后，接口将返回所有可用的资源规格信息，包括规格ID、CPU、内存、存储等详细配置。若用户无权限操作或系统中没有可用的资源规格，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerFlavorsRequest 请求对象
     * @return ListDevServerFlavorsResponse
     */
    public ListDevServerFlavorsResponse listDevServerFlavors(ListDevServerFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listDevServerFlavors);
    }

    /**
     * 查询规格列表
     *
     * 查询规格列表接口用于获取系统中所有可用的资源规格信息。该接口适用于以下场景：当用户需要了解可用的资源规格，以便在创建或调整Lite Server实例时选择合适的配置时，可以通过此接口获取规格列表。使用该接口的前提条件是用户已登录并具有查询规格的权限。查询操作完成后，接口将返回所有可用的资源规格信息，包括规格ID、CPU、内存、存储等详细配置。若用户无权限操作或系统中没有可用的资源规格，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerFlavorsRequest 请求对象
     * @return SyncInvoker<ListDevServerFlavorsRequest, ListDevServerFlavorsResponse>
     */
    public SyncInvoker<ListDevServerFlavorsRequest, ListDevServerFlavorsResponse> listDevServerFlavorsInvoker(
        ListDevServerFlavorsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listDevServerFlavors, hcClient);
    }

    /**
     * 查询Lite Server镜像列表
     *
     * 查询Lite Server镜像列表接口用于获取系统中所有可用的Lite Server镜像信息。该接口适用于以下场景：当用户需要了解可用的Lite Server镜像，以便在创建或调整Lite Server实例时选择合适的镜像时，可以通过此接口获取镜像列表。使用该接口的前提条件是用户已登录并具有查询镜像列表的权限。查询操作完成后，接口将返回所有可用的Lite Server镜像信息，包括镜像ID、名称、架构类型等。若用户无权限操作或系统中没有可用的镜像，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerImagesRequest 请求对象
     * @return ListDevServerImagesResponse
     */
    public ListDevServerImagesResponse listDevServerImages(ListDevServerImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listDevServerImages);
    }

    /**
     * 查询Lite Server镜像列表
     *
     * 查询Lite Server镜像列表接口用于获取系统中所有可用的Lite Server镜像信息。该接口适用于以下场景：当用户需要了解可用的Lite Server镜像，以便在创建或调整Lite Server实例时选择合适的镜像时，可以通过此接口获取镜像列表。使用该接口的前提条件是用户已登录并具有查询镜像列表的权限。查询操作完成后，接口将返回所有可用的Lite Server镜像信息，包括镜像ID、名称、架构类型等。若用户无权限操作或系统中没有可用的镜像，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerImagesRequest 请求对象
     * @return SyncInvoker<ListDevServerImagesRequest, ListDevServerImagesResponse>
     */
    public SyncInvoker<ListDevServerImagesRequest, ListDevServerImagesResponse> listDevServerImagesInvoker(
        ListDevServerImagesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listDevServerImages, hcClient);
    }

    /**
     * 获取Lite Server Job模板列表
     *
     * 获取Lite Server Job模板列表接口用于获取可用的Lite Server Job模板列表。该接口适用于以下场景：当用户需要查看可用的Job模板，以便选择合适的模板来创建新的Lite Server任务时，可以通过此接口获取模板列表。查询操作完成后，接口将返回所有可用的Lite Server Job模板列表，包括模板ID、名称、描述等信息。若系统中无可用模板，接口将返回相应的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerJobTemplatesRequest 请求对象
     * @return ListDevServerJobTemplatesResponse
     */
    public ListDevServerJobTemplatesResponse listDevServerJobTemplates(ListDevServerJobTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listDevServerJobTemplates);
    }

    /**
     * 获取Lite Server Job模板列表
     *
     * 获取Lite Server Job模板列表接口用于获取可用的Lite Server Job模板列表。该接口适用于以下场景：当用户需要查看可用的Job模板，以便选择合适的模板来创建新的Lite Server任务时，可以通过此接口获取模板列表。查询操作完成后，接口将返回所有可用的Lite Server Job模板列表，包括模板ID、名称、描述等信息。若系统中无可用模板，接口将返回相应的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerJobTemplatesRequest 请求对象
     * @return SyncInvoker<ListDevServerJobTemplatesRequest, ListDevServerJobTemplatesResponse>
     */
    public SyncInvoker<ListDevServerJobTemplatesRequest, ListDevServerJobTemplatesResponse> listDevServerJobTemplatesInvoker(
        ListDevServerJobTemplatesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listDevServerJobTemplates, hcClient);
    }

    /**
     * 查询Lite Server Job列表
     *
     * 查询Lite Server Job列表接口用于获取Lite Server Job的列表信息，并支持按照状态、ID等相关字段进行过滤。该接口适用于以下场景：当用户需要查看多个Lite Server Job的概要信息，例如在监控作业状态、排查问题或进行日常管理时，可以通过此接口获取符合过滤条件的Job列表。使用该接口的前提条件是用户具有查看权限。查询操作完成后，接口将返回符合条件的Lite Server Job列表，包括每个Job的ID、状态、创建时间等基本信息。若用户无权限操作或请求参数不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerJobsRequest 请求对象
     * @return ListDevServerJobsResponse
     */
    public ListDevServerJobsResponse listDevServerJobs(ListDevServerJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listDevServerJobs);
    }

    /**
     * 查询Lite Server Job列表
     *
     * 查询Lite Server Job列表接口用于获取Lite Server Job的列表信息，并支持按照状态、ID等相关字段进行过滤。该接口适用于以下场景：当用户需要查看多个Lite Server Job的概要信息，例如在监控作业状态、排查问题或进行日常管理时，可以通过此接口获取符合过滤条件的Job列表。使用该接口的前提条件是用户具有查看权限。查询操作完成后，接口将返回符合条件的Lite Server Job列表，包括每个Job的ID、状态、创建时间等基本信息。若用户无权限操作或请求参数不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerJobsRequest 请求对象
     * @return SyncInvoker<ListDevServerJobsRequest, ListDevServerJobsResponse>
     */
    public SyncInvoker<ListDevServerJobsRequest, ListDevServerJobsResponse> listDevServerJobsInvoker(
        ListDevServerJobsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listDevServerJobs, hcClient);
    }

    /**
     * 查询已绑定的EIP
     *
     * 查询已绑定的EIP接口用于获取已绑定到Lite Server服务器上的弹性公网IP（EIP）信息。该接口适用于以下场景：当用户需要查看Lite Server服务器上已绑定的EIP及其详细信息时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询EIP的权限，且指定的Lite Server服务器已存在。查询操作完成后，接口将返回已绑定到Lite Server服务器上的EIP的详细信息，包括EIP地址、绑定时间、状态等。若Lite Server服务器不存在、未绑定EIP或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerPublicIPRequest 请求对象
     * @return ListDevServerPublicIPResponse
     */
    public ListDevServerPublicIPResponse listDevServerPublicIP(ListDevServerPublicIPRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listDevServerPublicIP);
    }

    /**
     * 查询已绑定的EIP
     *
     * 查询已绑定的EIP接口用于获取已绑定到Lite Server服务器上的弹性公网IP（EIP）信息。该接口适用于以下场景：当用户需要查看Lite Server服务器上已绑定的EIP及其详细信息时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询EIP的权限，且指定的Lite Server服务器已存在。查询操作完成后，接口将返回已绑定到Lite Server服务器上的EIP的详细信息，包括EIP地址、绑定时间、状态等。若Lite Server服务器不存在、未绑定EIP或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServerPublicIPRequest 请求对象
     * @return SyncInvoker<ListDevServerPublicIPRequest, ListDevServerPublicIPResponse>
     */
    public SyncInvoker<ListDevServerPublicIPRequest, ListDevServerPublicIPResponse> listDevServerPublicIPInvoker(
        ListDevServerPublicIPRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listDevServerPublicIP, hcClient);
    }

    /**
     * 查询用户所有Lite Server实例列表
     *
     * 查询用户所有Lite Server实例列表接口用于获取用户名下所有Lite Server实例的详细信息。该接口适用于以下场景：用户需要查看其所有Lite Server实例的状态、配置等信息，以便进行资源管理和监控。使用该接口的前提条件是用户已登录且具有查看Lite Server实例的权限。调用此接口后，系统将返回用户名下所有Lite Server实例的列表，包括实例ID、名称、状态、创建时间等信息。若用户无权限或未登录，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServersRequest 请求对象
     * @return ListDevServersResponse
     */
    public ListDevServersResponse listDevServers(ListDevServersRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listDevServers);
    }

    /**
     * 查询用户所有Lite Server实例列表
     *
     * 查询用户所有Lite Server实例列表接口用于获取用户名下所有Lite Server实例的详细信息。该接口适用于以下场景：用户需要查看其所有Lite Server实例的状态、配置等信息，以便进行资源管理和监控。使用该接口的前提条件是用户已登录且具有查看Lite Server实例的权限。调用此接口后，系统将返回用户名下所有Lite Server实例的列表，包括实例ID、名称、状态、创建时间等信息。若用户无权限或未登录，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevServersRequest 请求对象
     * @return SyncInvoker<ListDevServersRequest, ListDevServersResponse>
     */
    public SyncInvoker<ListDevServersRequest, ListDevServersResponse> listDevServersInvoker(
        ListDevServersRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listDevServers, hcClient);
    }

    /**
     * 查询Hyper Cluster详情列表
     *
     * 查询Hyper Cluster详情列表接口用于获取所有Hyper Cluster的详细信息。该接口适用于以下场景：当用户需要了解系统中所有超节点网络的配置和状态时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询Hyper Cluster详情的权限。查询操作完成后，接口将返回所有超节点网络的详细信息，包括ID、名称、子网信息等。若用户无权限操作或系统中没有Hyper Cluster，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHyperClusterRequest 请求对象
     * @return ListHyperClusterResponse
     */
    public ListHyperClusterResponse listHyperCluster(ListHyperClusterRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listHyperCluster);
    }

    /**
     * 查询Hyper Cluster详情列表
     *
     * 查询Hyper Cluster详情列表接口用于获取所有Hyper Cluster的详细信息。该接口适用于以下场景：当用户需要了解系统中所有超节点网络的配置和状态时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询Hyper Cluster详情的权限。查询操作完成后，接口将返回所有超节点网络的详细信息，包括ID、名称、子网信息等。若用户无权限操作或系统中没有Hyper Cluster，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHyperClusterRequest 请求对象
     * @return SyncInvoker<ListHyperClusterRequest, ListHyperClusterResponse>
     */
    public SyncInvoker<ListHyperClusterRequest, ListHyperClusterResponse> listHyperClusterInvoker(
        ListHyperClusterRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listHyperCluster, hcClient);
    }

    /**
     * 查询超节点hyperinstance-clusters逻辑容量测算结果
     *
     * 查询超节点hyperinstance-clusters逻辑容量测算结果接口用于获取指定超节点集群的逻辑容量测算结果。该接口适用于以下场景：当用户需要了解超节点集群的资源使用情况和容量规划，以便进行资源管理和优化时，可以通过此接口获取逻辑容量测算结果。使用该接口的前提条件是用户已登录并具有查询超节点集群逻辑容量的权限，且指定的超节点集群已存在。查询操作完成后，接口将返回指定超节点集群的逻辑容量测算结果，包括可用容量信息。若用户无权限操作、指定的超节点集群不存在或集群ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHyperinstanceClustersCapacityRequest 请求对象
     * @return ListHyperinstanceClustersCapacityResponse
     */
    public ListHyperinstanceClustersCapacityResponse listHyperinstanceClustersCapacity(
        ListHyperinstanceClustersCapacityRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listHyperinstanceClustersCapacity);
    }

    /**
     * 查询超节点hyperinstance-clusters逻辑容量测算结果
     *
     * 查询超节点hyperinstance-clusters逻辑容量测算结果接口用于获取指定超节点集群的逻辑容量测算结果。该接口适用于以下场景：当用户需要了解超节点集群的资源使用情况和容量规划，以便进行资源管理和优化时，可以通过此接口获取逻辑容量测算结果。使用该接口的前提条件是用户已登录并具有查询超节点集群逻辑容量的权限，且指定的超节点集群已存在。查询操作完成后，接口将返回指定超节点集群的逻辑容量测算结果，包括可用容量信息。若用户无权限操作、指定的超节点集群不存在或集群ID无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHyperinstanceClustersCapacityRequest 请求对象
     * @return SyncInvoker<ListHyperinstanceClustersCapacityRequest, ListHyperinstanceClustersCapacityResponse>
     */
    public SyncInvoker<ListHyperinstanceClustersCapacityRequest, ListHyperinstanceClustersCapacityResponse> listHyperinstanceClustersCapacityInvoker(
        ListHyperinstanceClustersCapacityRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listHyperinstanceClustersCapacity, hcClient);
    }

    /**
     * 查询用户所有超节点实例详情
     *
     * 查询用户所有超节点实例详情接口用于获取用户所有Lite Server超节点实例的详细信息。该接口适用于以下场景：当用户需要查看其所有超节点实例的配置、状态和使用情况时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询超节点实例的权限。查询操作完成后，接口将返回所有超节点实例的详细信息，包括实例ID、操作系统、运行状态、资源使用情况等。若用户无权限操作或没有超节点实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHyperinstancesRequest 请求对象
     * @return ListHyperinstancesResponse
     */
    public ListHyperinstancesResponse listHyperinstances(ListHyperinstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listHyperinstances);
    }

    /**
     * 查询用户所有超节点实例详情
     *
     * 查询用户所有超节点实例详情接口用于获取用户所有Lite Server超节点实例的详细信息。该接口适用于以下场景：当用户需要查看其所有超节点实例的配置、状态和使用情况时，可以通过此接口获取相关信息。使用该接口的前提条件是用户已登录并具有查询超节点实例的权限。查询操作完成后，接口将返回所有超节点实例的详细信息，包括实例ID、操作系统、运行状态、资源使用情况等。若用户无权限操作或没有超节点实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHyperinstancesRequest 请求对象
     * @return SyncInvoker<ListHyperinstancesRequest, ListHyperinstancesResponse>
     */
    public SyncInvoker<ListHyperinstancesRequest, ListHyperinstancesResponse> listHyperinstancesInvoker(
        ListHyperinstancesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listHyperinstances, hcClient);
    }

    /**
     * 查询Lite Server超节点标签
     *
     * 查询Lite Server超节点标签接口用于获取Lite Server超节点上的所有标签信息。该接口适用于以下场景：当用户需要查看或管理Lite Server超节点的标签时，可以通过此接口查询指定超节点上的所有标签。使用该接口的前提条件是Lite Server超节点已存在，用户具有查询标签的权限。查询操作完成后，接口将返回超节点上的所有标签信息，包括标签名称和相关属性。若Lite Server超节点不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QueryHyperinstanceTagsRequest 请求对象
     * @return QueryHyperinstanceTagsResponse
     */
    public QueryHyperinstanceTagsResponse queryHyperinstanceTags(QueryHyperinstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.queryHyperinstanceTags);
    }

    /**
     * 查询Lite Server超节点标签
     *
     * 查询Lite Server超节点标签接口用于获取Lite Server超节点上的所有标签信息。该接口适用于以下场景：当用户需要查看或管理Lite Server超节点的标签时，可以通过此接口查询指定超节点上的所有标签。使用该接口的前提条件是Lite Server超节点已存在，用户具有查询标签的权限。查询操作完成后，接口将返回超节点上的所有标签信息，包括标签名称和相关属性。若Lite Server超节点不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QueryHyperinstanceTagsRequest 请求对象
     * @return SyncInvoker<QueryHyperinstanceTagsRequest, QueryHyperinstanceTagsResponse>
     */
    public SyncInvoker<QueryHyperinstanceTagsRequest, QueryHyperinstanceTagsResponse> queryHyperinstanceTagsInvoker(
        QueryHyperinstanceTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.queryHyperinstanceTags, hcClient);
    }

    /**
     * 重启Lite Server实例
     *
     * 重启Lite Server实例接口用于重启正在运行的Lite Server实例。该接口适用于以下场景：当用户需要重启实例以应用配置更改、解决运行问题或进行系统维护时，可以通过此接口重启指定的Lite Server实例。使用该接口的前提条件是Lite Server实例已创建且处于运行状态，用户具有重启实例的权限。重启操作完成后，Lite Server实例将重新启动并进入运行状态，用户可以继续使用实例提供的服务。若Lite Server实例不存在、已处于停止状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDevServerRequest 请求对象
     * @return RebootDevServerResponse
     */
    public RebootDevServerResponse rebootDevServer(RebootDevServerRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.rebootDevServer);
    }

    /**
     * 重启Lite Server实例
     *
     * 重启Lite Server实例接口用于重启正在运行的Lite Server实例。该接口适用于以下场景：当用户需要重启实例以应用配置更改、解决运行问题或进行系统维护时，可以通过此接口重启指定的Lite Server实例。使用该接口的前提条件是Lite Server实例已创建且处于运行状态，用户具有重启实例的权限。重启操作完成后，Lite Server实例将重新启动并进入运行状态，用户可以继续使用实例提供的服务。若Lite Server实例不存在、已处于停止状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDevServerRequest 请求对象
     * @return SyncInvoker<RebootDevServerRequest, RebootDevServerResponse>
     */
    public SyncInvoker<RebootDevServerRequest, RebootDevServerResponse> rebootDevServerInvoker(
        RebootDevServerRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.rebootDevServer, hcClient);
    }

    /**
     * 重装Lite Server服务器操作系统镜像
     *
     * 重装Lite Server服务器操作系统镜像接口用于重新安装Lite Server服务器的操作系统镜像。该接口适用于以下场景：当用户需要更新操作系统版本、修复系统故障或重新配置系统环境时，可以通过此接口重装指定的Lite Server服务器操作系统镜像。使用该接口的前提条件是Lite Server服务器已存在且处于停止状态，用户具有重装操作系统的权限。重装操作完成后，Lite Server服务器将安装新的操作系统镜像，并重新进入运行状态，若Lite Server服务器不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallDevServerOSRequest 请求对象
     * @return ReinstallDevServerOSResponse
     */
    public ReinstallDevServerOSResponse reinstallDevServerOS(ReinstallDevServerOSRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.reinstallDevServerOS);
    }

    /**
     * 重装Lite Server服务器操作系统镜像
     *
     * 重装Lite Server服务器操作系统镜像接口用于重新安装Lite Server服务器的操作系统镜像。该接口适用于以下场景：当用户需要更新操作系统版本、修复系统故障或重新配置系统环境时，可以通过此接口重装指定的Lite Server服务器操作系统镜像。使用该接口的前提条件是Lite Server服务器已存在且处于停止状态，用户具有重装操作系统的权限。重装操作完成后，Lite Server服务器将安装新的操作系统镜像，并重新进入运行状态，若Lite Server服务器不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallDevServerOSRequest 请求对象
     * @return SyncInvoker<ReinstallDevServerOSRequest, ReinstallDevServerOSResponse>
     */
    public SyncInvoker<ReinstallDevServerOSRequest, ReinstallDevServerOSResponse> reinstallDevServerOSInvoker(
        ReinstallDevServerOSRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.reinstallDevServerOS, hcClient);
    }

    /**
     * 缩容Lite Server超节点
     *
     * 缩容Lite Server超节点接口用于减少Lite Server超节点的资源容量。该接口适用于以下场景：当用户需要降低Lite Server超节点的资源使用，以节省成本或优化资源分配时，可以通过此接口进行缩容。使用该接口的前提条件是用户已登录并具有缩容超节点的权限，且指定的超节点已存在且处于运行状态。缩容操作完成后，超节点的资源容量将根据指定的规格进行调整，用户可以立即使用减少后的资源。若用户无权限操作、指定的超节点不存在、超节点已处于最小容量或指定的缩容规格无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScaleDownHyperinstanceRequest 请求对象
     * @return ScaleDownHyperinstanceResponse
     */
    public ScaleDownHyperinstanceResponse scaleDownHyperinstance(ScaleDownHyperinstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.scaleDownHyperinstance);
    }

    /**
     * 缩容Lite Server超节点
     *
     * 缩容Lite Server超节点接口用于减少Lite Server超节点的资源容量。该接口适用于以下场景：当用户需要降低Lite Server超节点的资源使用，以节省成本或优化资源分配时，可以通过此接口进行缩容。使用该接口的前提条件是用户已登录并具有缩容超节点的权限，且指定的超节点已存在且处于运行状态。缩容操作完成后，超节点的资源容量将根据指定的规格进行调整，用户可以立即使用减少后的资源。若用户无权限操作、指定的超节点不存在、超节点已处于最小容量或指定的缩容规格无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScaleDownHyperinstanceRequest 请求对象
     * @return SyncInvoker<ScaleDownHyperinstanceRequest, ScaleDownHyperinstanceResponse>
     */
    public SyncInvoker<ScaleDownHyperinstanceRequest, ScaleDownHyperinstanceResponse> scaleDownHyperinstanceInvoker(
        ScaleDownHyperinstanceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.scaleDownHyperinstance, hcClient);
    }

    /**
     * 扩容Lite Server超节点
     *
     * 扩容Lite Server超节点接口用于增加Lite Server超节点的资源容量。该接口适用于以下场景：当用户需要提升Lite Server超节点的性能，以支持更多的负载或更大的数据处理需求时，可以通过此接口进行扩容。使用该接口的前提条件是用户已登录并具有扩容超节点的权限，且指定的超节点已存在且处于运行状态。扩容操作完成后，超节点的资源容量将根据指定的规格进行调整，用户可以立即使用增加的资源。若用户无权限操作、指定的超节点不存在、超节点已处于最大容量或指定的扩容规格无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScaleUpHyperinstanceRequest 请求对象
     * @return ScaleUpHyperinstanceResponse
     */
    public ScaleUpHyperinstanceResponse scaleUpHyperinstance(ScaleUpHyperinstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.scaleUpHyperinstance);
    }

    /**
     * 扩容Lite Server超节点
     *
     * 扩容Lite Server超节点接口用于增加Lite Server超节点的资源容量。该接口适用于以下场景：当用户需要提升Lite Server超节点的性能，以支持更多的负载或更大的数据处理需求时，可以通过此接口进行扩容。使用该接口的前提条件是用户已登录并具有扩容超节点的权限，且指定的超节点已存在且处于运行状态。扩容操作完成后，超节点的资源容量将根据指定的规格进行调整，用户可以立即使用增加的资源。若用户无权限操作、指定的超节点不存在、超节点已处于最大容量或指定的扩容规格无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScaleUpHyperinstanceRequest 请求对象
     * @return SyncInvoker<ScaleUpHyperinstanceRequest, ScaleUpHyperinstanceResponse>
     */
    public SyncInvoker<ScaleUpHyperinstanceRequest, ScaleUpHyperinstanceResponse> scaleUpHyperinstanceInvoker(
        ScaleUpHyperinstanceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.scaleUpHyperinstance, hcClient);
    }

    /**
     * 查询Lite Server实例详情
     *
     * 查询Lite Server实例详情接口用于获取指定Lite Server实例的详细信息。该接口适用于以下场景：用户需要查看特定Lite Server实例的配置、状态、网络信息等详细数据，以便进行故障排查、资源管理和监控。使用该接口的前提条件是用户已登录且具有查看Lite Server实例的权限，并且需要提供有效的实例ID。查询操作完成后，系统将返回指定Lite Server实例的详细信息，包括实例ID、名称、状态、配置、网络配置等。若用户无权限、实例ID无效或实例不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDevServerRequest 请求对象
     * @return ShowDevServerResponse
     */
    public ShowDevServerResponse showDevServer(ShowDevServerRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showDevServer);
    }

    /**
     * 查询Lite Server实例详情
     *
     * 查询Lite Server实例详情接口用于获取指定Lite Server实例的详细信息。该接口适用于以下场景：用户需要查看特定Lite Server实例的配置、状态、网络信息等详细数据，以便进行故障排查、资源管理和监控。使用该接口的前提条件是用户已登录且具有查看Lite Server实例的权限，并且需要提供有效的实例ID。查询操作完成后，系统将返回指定Lite Server实例的详细信息，包括实例ID、名称、状态、配置、网络配置等。若用户无权限、实例ID无效或实例不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDevServerRequest 请求对象
     * @return SyncInvoker<ShowDevServerRequest, ShowDevServerResponse>
     */
    public SyncInvoker<ShowDevServerRequest, ShowDevServerResponse> showDevServerInvoker(ShowDevServerRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showDevServer, hcClient);
    }

    /**
     * 启动Lite Server实例
     *
     * 启动Lite Server实例接口用于启动已创建但未运行的Lite Server实例。该接口适用于以下场景：当用户需要开始使用Lite Server实例进行开发或测试时，可以通过此接口启动指定的Lite Server实例。使用该接口的前提条件是Lite Server实例已创建且处于停止状态，用户具有启动实例的权限。若Lite Server实例不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDevServerRequest 请求对象
     * @return StartDevServerResponse
     */
    public StartDevServerResponse startDevServer(StartDevServerRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.startDevServer);
    }

    /**
     * 启动Lite Server实例
     *
     * 启动Lite Server实例接口用于启动已创建但未运行的Lite Server实例。该接口适用于以下场景：当用户需要开始使用Lite Server实例进行开发或测试时，可以通过此接口启动指定的Lite Server实例。使用该接口的前提条件是Lite Server实例已创建且处于停止状态，用户具有启动实例的权限。若Lite Server实例不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDevServerRequest 请求对象
     * @return SyncInvoker<StartDevServerRequest, StartDevServerResponse>
     */
    public SyncInvoker<StartDevServerRequest, StartDevServerResponse> startDevServerInvoker(
        StartDevServerRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.startDevServer, hcClient);
    }

    /**
     * 启动Lite Server超节点服务器
     *
     * 启动Lite Server超节点服务器接口用于启动已创建但未运行的Lite Server超节点服务器。该接口适用于以下场景：当用户需要开始使用Lite Server超节点服务器进行开发或测试时，可以通过此接口启动指定的超节点服务器。使用该接口的前提条件是Lite Server超节点服务器已创建且处于停止状态，用户具有启动超节点服务器的权限。启动操作完成后，超节点服务器将进入运行状态，用户可以访问和使用服务器提供的服务。若Lite Server超节点服务器不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartHyperinstanceRequest 请求对象
     * @return StartHyperinstanceResponse
     */
    public StartHyperinstanceResponse startHyperinstance(StartHyperinstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.startHyperinstance);
    }

    /**
     * 启动Lite Server超节点服务器
     *
     * 启动Lite Server超节点服务器接口用于启动已创建但未运行的Lite Server超节点服务器。该接口适用于以下场景：当用户需要开始使用Lite Server超节点服务器进行开发或测试时，可以通过此接口启动指定的超节点服务器。使用该接口的前提条件是Lite Server超节点服务器已创建且处于停止状态，用户具有启动超节点服务器的权限。启动操作完成后，超节点服务器将进入运行状态，用户可以访问和使用服务器提供的服务。若Lite Server超节点服务器不存在、已处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartHyperinstanceRequest 请求对象
     * @return SyncInvoker<StartHyperinstanceRequest, StartHyperinstanceResponse>
     */
    public SyncInvoker<StartHyperinstanceRequest, StartHyperinstanceResponse> startHyperinstanceInvoker(
        StartHyperinstanceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.startHyperinstance, hcClient);
    }

    /**
     * 停止Lite Server实例
     *
     * 停止Lite Server实例接口用于停止正在运行的Lite Server实例。该接口适用于以下场景：当用户需要停止Lite Server实例，以节省资源或进行维护时，可以通过此接口停止指定的Lite Server实例。使用该接口的前提条件是Lite Server实例已创建且处于运行状态，用户具有停止实例的权限。若Lite Server实例不存在、已处于停止状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDevServerRequest 请求对象
     * @return StopDevServerResponse
     */
    public StopDevServerResponse stopDevServer(StopDevServerRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopDevServer);
    }

    /**
     * 停止Lite Server实例
     *
     * 停止Lite Server实例接口用于停止正在运行的Lite Server实例。该接口适用于以下场景：当用户需要停止Lite Server实例，以节省资源或进行维护时，可以通过此接口停止指定的Lite Server实例。使用该接口的前提条件是Lite Server实例已创建且处于运行状态，用户具有停止实例的权限。若Lite Server实例不存在、已处于停止状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDevServerRequest 请求对象
     * @return SyncInvoker<StopDevServerRequest, StopDevServerResponse>
     */
    public SyncInvoker<StopDevServerRequest, StopDevServerResponse> stopDevServerInvoker(StopDevServerRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopDevServer, hcClient);
    }

    /**
     * 停止Lite Server超节点服务器
     *
     * 停止Lite Server超节点服务器接口用于停止正在运行的Lite Server超节点服务器。该接口适用于以下场景：当用户需要暂停使用Lite Server超节点服务器，以节省资源或进行维护时，可以通过此接口停止指定的超节点服务器。使用该接口的前提条件是Lite Server超节点服务器已创建且处于运行状态或者停止失败状态，用户具有停止超节点服务器的权限。停止操作完成后，超节点服务器将进入停止状态，不再提供服务。若Lite Server超节点服务器不存在、已处于停止状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopHyperinstanceRequest 请求对象
     * @return StopHyperinstanceResponse
     */
    public StopHyperinstanceResponse stopHyperinstance(StopHyperinstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopHyperinstance);
    }

    /**
     * 停止Lite Server超节点服务器
     *
     * 停止Lite Server超节点服务器接口用于停止正在运行的Lite Server超节点服务器。该接口适用于以下场景：当用户需要暂停使用Lite Server超节点服务器，以节省资源或进行维护时，可以通过此接口停止指定的超节点服务器。使用该接口的前提条件是Lite Server超节点服务器已创建且处于运行状态或者停止失败状态，用户具有停止超节点服务器的权限。停止操作完成后，超节点服务器将进入停止状态，不再提供服务。若Lite Server超节点服务器不存在、已处于停止状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopHyperinstanceRequest 请求对象
     * @return SyncInvoker<StopHyperinstanceRequest, StopHyperinstanceResponse>
     */
    public SyncInvoker<StopHyperinstanceRequest, StopHyperinstanceResponse> stopHyperinstanceInvoker(
        StopHyperinstanceRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopHyperinstance, hcClient);
    }

    /**
     * 实时同步用户指定Lite Server实例状态
     *
     * 实时同步用户Lite Server实例状态接口用于实时获取并同步用户Lite Server实例的当前状态。该接口适用于以下场景：用户需要实时监控其Lite Server实例的运行状态，确保实例正常运行或及时发现并处理异常情况。使用该接口的前提条件是用户已登录并具有相应的权限，且Lite Server实例已创建并处于运行状态。接口调用成功后，将返回Lite Server实例的最新状态信息，包括但不限于实例ID、运行状态、资源使用情况等。若用户无权限操作或Lite Server实例不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncDevServersRequest 请求对象
     * @return SyncDevServersResponse
     */
    public SyncDevServersResponse syncDevServers(SyncDevServersRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.syncDevServers);
    }

    /**
     * 实时同步用户指定Lite Server实例状态
     *
     * 实时同步用户Lite Server实例状态接口用于实时获取并同步用户Lite Server实例的当前状态。该接口适用于以下场景：用户需要实时监控其Lite Server实例的运行状态，确保实例正常运行或及时发现并处理异常情况。使用该接口的前提条件是用户已登录并具有相应的权限，且Lite Server实例已创建并处于运行状态。接口调用成功后，将返回Lite Server实例的最新状态信息，包括但不限于实例ID、运行状态、资源使用情况等。若用户无权限操作或Lite Server实例不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncDevServersRequest 请求对象
     * @return SyncInvoker<SyncDevServersRequest, SyncDevServersResponse>
     */
    public SyncInvoker<SyncDevServersRequest, SyncDevServersResponse> syncDevServersInvoker(
        SyncDevServersRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.syncDevServers, hcClient);
    }

    /**
     * 修改Lite Server实例名称
     *
     * 修改DevServer实例名称接口用于更改已创建的DevServer实例的名称。该接口适用于以下场景：当用户需要对DevServer实例进行重命名以更好地反映实例的功能或用途时，或者在实例名称不再符合当前项目命名规范时进行更新。使用该接口的前提条件是DevServer实例已存在且用户具有对该实例的管理权限。修改操作完成后，实例的新名称将立即生效，并在所有相关视图和记录中更新。若DevServer实例不存在、用户无权限操作或新名称不符合命名规则，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDevServerRequest 请求对象
     * @return UpdateDevServerResponse
     */
    public UpdateDevServerResponse updateDevServer(UpdateDevServerRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateDevServer);
    }

    /**
     * 修改Lite Server实例名称
     *
     * 修改DevServer实例名称接口用于更改已创建的DevServer实例的名称。该接口适用于以下场景：当用户需要对DevServer实例进行重命名以更好地反映实例的功能或用途时，或者在实例名称不再符合当前项目命名规范时进行更新。使用该接口的前提条件是DevServer实例已存在且用户具有对该实例的管理权限。修改操作完成后，实例的新名称将立即生效，并在所有相关视图和记录中更新。若DevServer实例不存在、用户无权限操作或新名称不符合命名规则，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDevServerRequest 请求对象
     * @return SyncInvoker<UpdateDevServerRequest, UpdateDevServerResponse>
     */
    public SyncInvoker<UpdateDevServerRequest, UpdateDevServerResponse> updateDevServerInvoker(
        UpdateDevServerRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateDevServer, hcClient);
    }

    /**
     * 通过运行的实例保存成容器镜像
     *
     * 通过运行的实例保存成容器镜像接口用于将正在运行的实例保存为容器镜像。该接口适用于以下场景：用户需要保存当前运行环境以便后续使用或开发时，可通过此接口将实例保存为镜像。使用该接口的前提条件是用户已登录系统并具有访问目标实例的权限，同时实例必须处于运行状态。调用该接口后，系统将保存实例的当前状态为容器镜像，包括安装的依赖包和插件。若用户无权限访问指定实例或实例未运行，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageRequest 请求对象
     * @return CreateImageResponse
     */
    public CreateImageResponse createImage(CreateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createImage);
    }

    /**
     * 通过运行的实例保存成容器镜像
     *
     * 通过运行的实例保存成容器镜像接口用于将正在运行的实例保存为容器镜像。该接口适用于以下场景：用户需要保存当前运行环境以便后续使用或开发时，可通过此接口将实例保存为镜像。使用该接口的前提条件是用户已登录系统并具有访问目标实例的权限，同时实例必须处于运行状态。调用该接口后，系统将保存实例的当前状态为容器镜像，包括安装的依赖包和插件。若用户无权限访问指定实例或实例未运行，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageRequest 请求对象
     * @return SyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public SyncInvoker<CreateImageRequest, CreateImageResponse> createImageInvoker(CreateImageRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createImage, hcClient);
    }

    /**
     * 创建Notebook实例
     *
     * 创建Notebook实例接口用于根据指定的参数创建一个新的Notebook实例。该接口适用于以下场景：用户需要为特定任务或项目创建Notebook实例时，可通过此接口指定实例规格、AI引擎镜像和存储配置。使用该接口的前提条件是用户已登录系统并具有创建Notebook实例的权限，同时需提供有效的创建参数。调用该接口后，系统将异步创建Notebook实例，用户可通过查询接口获取实例状态。创建完成后，用户可通过网页或SSH客户端访问Notebook实例。若用户无权限创建实例或参数无效，接口将返回相应的错误信息。异常情况包括：若系统资源不足，或创建操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotebookRequest 请求对象
     * @return CreateNotebookResponse
     */
    public CreateNotebookResponse createNotebook(CreateNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createNotebook);
    }

    /**
     * 创建Notebook实例
     *
     * 创建Notebook实例接口用于根据指定的参数创建一个新的Notebook实例。该接口适用于以下场景：用户需要为特定任务或项目创建Notebook实例时，可通过此接口指定实例规格、AI引擎镜像和存储配置。使用该接口的前提条件是用户已登录系统并具有创建Notebook实例的权限，同时需提供有效的创建参数。调用该接口后，系统将异步创建Notebook实例，用户可通过查询接口获取实例状态。创建完成后，用户可通过网页或SSH客户端访问Notebook实例。若用户无权限创建实例或参数无效，接口将返回相应的错误信息。异常情况包括：若系统资源不足，或创建操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotebookRequest 请求对象
     * @return SyncInvoker<CreateNotebookRequest, CreateNotebookResponse>
     */
    public SyncInvoker<CreateNotebookRequest, CreateNotebookResponse> createNotebookInvoker(
        CreateNotebookRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createNotebook, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签接口用于为指定的Notebook实例添加标签信息。该接口适用于以下场景：用户需要为Notebook实例添加标签信息，可通过此接口添加一个或多个标签。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限。调用该接口后，系统将为指定的Notebook实例添加标签，若标签的key已存在，则覆盖原有的value值。若用户无权限操作指定Notebook实例或输入的参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotebookTagsRequest 请求对象
     * @return CreateNotebookTagsResponse
     */
    public CreateNotebookTagsResponse createNotebookTags(CreateNotebookTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createNotebookTags);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签接口用于为指定的Notebook实例添加标签信息。该接口适用于以下场景：用户需要为Notebook实例添加标签信息，可通过此接口添加一个或多个标签。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限。调用该接口后，系统将为指定的Notebook实例添加标签，若标签的key已存在，则覆盖原有的value值。若用户无权限操作指定Notebook实例或输入的参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotebookTagsRequest 请求对象
     * @return SyncInvoker<CreateNotebookTagsRequest, CreateNotebookTagsResponse>
     */
    public SyncInvoker<CreateNotebookTagsRequest, CreateNotebookTagsResponse> createNotebookTagsInvoker(
        CreateNotebookTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createNotebookTags, hcClient);
    }

    /**
     * 删除Notebook实例
     *
     * 删除Notebook实例接口用于移除已创建的Notebook实例及其相关资源。该接口适用于以下场景：用户需要清理不再使用的Notebook实例时，可通过此接口删除指定的Notebook实例，包括其容器和所有存储资源。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限。调用该接口后，系统将删除指定的Notebook实例及其相关资源。若用户无权限操作指定实例或Notebook实例未停止，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或删除操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotebookRequest 请求对象
     * @return DeleteNotebookResponse
     */
    public DeleteNotebookResponse deleteNotebook(DeleteNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteNotebook);
    }

    /**
     * 删除Notebook实例
     *
     * 删除Notebook实例接口用于移除已创建的Notebook实例及其相关资源。该接口适用于以下场景：用户需要清理不再使用的Notebook实例时，可通过此接口删除指定的Notebook实例，包括其容器和所有存储资源。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限。调用该接口后，系统将删除指定的Notebook实例及其相关资源。若用户无权限操作指定实例或Notebook实例未停止，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或删除操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotebookRequest 请求对象
     * @return SyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse>
     */
    public SyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse> deleteNotebookInvoker(
        DeleteNotebookRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteNotebook, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签接口用于移除指定Notebook实例的标签信息。该接口适用于以下场景：用户需要清理或重新组织Notebook实例的标签时，可通过此接口删除单个或多个标签。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限。调用该接口后，系统将删除指定的标签，若标签不存在则不进行操作。若用户无权限操作指定Notebook实例或输入的参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotebookTagsRequest 请求对象
     * @return DeleteNotebookTagsResponse
     */
    public DeleteNotebookTagsResponse deleteNotebookTags(DeleteNotebookTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteNotebookTags);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签接口用于移除指定Notebook实例的标签信息。该接口适用于以下场景：用户需要清理或重新组织Notebook实例的标签时，可通过此接口删除单个或多个标签。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限。调用该接口后，系统将删除指定的标签，若标签不存在则不进行操作。若用户无权限操作指定Notebook实例或输入的参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotebookTagsRequest 请求对象
     * @return SyncInvoker<DeleteNotebookTagsRequest, DeleteNotebookTagsResponse>
     */
    public SyncInvoker<DeleteNotebookTagsRequest, DeleteNotebookTagsResponse> deleteNotebookTagsInvoker(
        DeleteNotebookTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteNotebookTags, hcClient);
    }

    /**
     * 查询所有Notebook实例列表
     *
     * 查询所有Notebook实例列表接口用于获取所有已创建的Notebook实例信息。该接口适用于以下场景：用户需要全面了解当前系统中所有Notebook实例的状态、资源使用情况或管理多个Notebook实例时，可通过此接口获取相关信息。使用该接口的前提条件是用户已创建Notebook实例，并且具有相应的查询权限。调用成功后，系统将返回所有Notebook实例的列表，包含实例ID、状态、创建时间等详细信息。若用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllNotebooksRequest 请求对象
     * @return ListAllNotebooksResponse
     */
    public ListAllNotebooksResponse listAllNotebooks(ListAllNotebooksRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listAllNotebooks);
    }

    /**
     * 查询所有Notebook实例列表
     *
     * 查询所有Notebook实例列表接口用于获取所有已创建的Notebook实例信息。该接口适用于以下场景：用户需要全面了解当前系统中所有Notebook实例的状态、资源使用情况或管理多个Notebook实例时，可通过此接口获取相关信息。使用该接口的前提条件是用户已创建Notebook实例，并且具有相应的查询权限。调用成功后，系统将返回所有Notebook实例的列表，包含实例ID、状态、创建时间等详细信息。若用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllNotebooksRequest 请求对象
     * @return SyncInvoker<ListAllNotebooksRequest, ListAllNotebooksResponse>
     */
    public SyncInvoker<ListAllNotebooksRequest, ListAllNotebooksResponse> listAllNotebooksInvoker(
        ListAllNotebooksRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listAllNotebooks, hcClient);
    }

    /**
     * 查询用户所有Notebook资源池实例详情
     *
     * 查询用户所有Notebook资源池实例详情接口用于获取用户关联的所有Notebook资源池实例的详细信息。该接口适用于以下场景：当用户创建Notebook示例需要选择资源池时，可通过此接口获取所有资源池实例列表信息。使用该接口的前提条件是用户已注册并登录系统，且具有查看资源池实例的权限。调用成功后，接口将返回包含所有资源池实例的详细信息列表，包括实例名称、状态、节点规格等。若用户未登录、无权限访问或系统内部出现错误，接口将返回相应的错误信息，如未认证、无权限或服务不可用等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthoringClustersRequest 请求对象
     * @return ListAuthoringClustersResponse
     */
    public ListAuthoringClustersResponse listAuthoringClusters(ListAuthoringClustersRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listAuthoringClusters);
    }

    /**
     * 查询用户所有Notebook资源池实例详情
     *
     * 查询用户所有Notebook资源池实例详情接口用于获取用户关联的所有Notebook资源池实例的详细信息。该接口适用于以下场景：当用户创建Notebook示例需要选择资源池时，可通过此接口获取所有资源池实例列表信息。使用该接口的前提条件是用户已注册并登录系统，且具有查看资源池实例的权限。调用成功后，接口将返回包含所有资源池实例的详细信息列表，包括实例名称、状态、节点规格等。若用户未登录、无权限访问或系统内部出现错误，接口将返回相应的错误信息，如未认证、无权限或服务不可用等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthoringClustersRequest 请求对象
     * @return SyncInvoker<ListAuthoringClustersRequest, ListAuthoringClustersResponse>
     */
    public SyncInvoker<ListAuthoringClustersRequest, ListAuthoringClustersResponse> listAuthoringClustersInvoker(
        ListAuthoringClustersRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listAuthoringClusters, hcClient);
    }

    /**
     * 查询当前用户指定特性的开关及配额
     *
     * 查询当前用户指定特性的开关及配额接口用于获取指定特性在当前用户下的开关状态及配额信息。该接口适用于以下场景：当用户需要了解特定特性是否已开启、查看配额限制或监控已使用的资源情况时，可通过此接口查询相关信息。使用该接口的前提条件是用户已登录且具有查询权限，同时指定的特性必须存在。调用该接口后，系统将返回该特性是否已开启、配额总量及已使用的资源情况等详细信息。若用户无权限查询、特性不存在或系统出现异常，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return ListFeaturesResponse
     */
    public ListFeaturesResponse listFeatures(ListFeaturesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listFeatures);
    }

    /**
     * 查询当前用户指定特性的开关及配额
     *
     * 查询当前用户指定特性的开关及配额接口用于获取指定特性在当前用户下的开关状态及配额信息。该接口适用于以下场景：当用户需要了解特定特性是否已开启、查看配额限制或监控已使用的资源情况时，可通过此接口查询相关信息。使用该接口的前提条件是用户已登录且具有查询权限，同时指定的特性必须存在。调用该接口后，系统将返回该特性是否已开启、配额总量及已使用的资源情况等详细信息。若用户无权限查询、特性不存在或系统出现异常，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return SyncInvoker<ListFeaturesRequest, ListFeaturesResponse>
     */
    public SyncInvoker<ListFeaturesRequest, ListFeaturesResponse> listFeaturesInvoker(ListFeaturesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listFeatures, hcClient);
    }

    /**
     * 查询Notebook支持的有效规格列表
     *
     * 查询Notebook支持的有效规格列表接口用于获取运行Notebook实例时可使用的规格选项。该接口适用于以下场景：用户需要了解Notebook实例支持的配置选项时，可通过此接口查询可用的规格列表。使用该接口的前提条件是用户已登录系统并具有访问目标Notebook实例的权限。调用该接口后，系统将返回Notebook实例支持的有效规格列表，包括内存、CPU等配置信息。若用户无权限访问指定实例或Notebook实例未运行，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listFlavors);
    }

    /**
     * 查询Notebook支持的有效规格列表
     *
     * 查询Notebook支持的有效规格列表接口用于获取运行Notebook实例时可使用的规格选项。该接口适用于以下场景：用户需要了解Notebook实例支持的配置选项时，可通过此接口查询可用的规格列表。使用该接口的前提条件是用户已登录系统并具有访问目标Notebook实例的权限。调用该接口后，系统将返回Notebook实例支持的有效规格列表，包括内存、CPU等配置信息。若用户无权限访问指定实例或Notebook实例未运行，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listFlavors, hcClient);
    }

    /**
     * 查询Notebook实例列表
     *
     * 查询Notebook实例列表接口用于获取满足特定条件的Notebook实例信息。该接口适用于以下场景：用户管理多个Notebook实例或查看特定状态的Notebook实例时，可通过此接口获取相关信息。使用该接口的前提条件是用户已创建Notebook实例，并且具有相应的查询权限。调用成功后，系统将返回符合条件的Notebook实例列表，包含实例ID、状态、创建时间等详细信息。若用户无权限访问或查询条件不明确，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebooksRequest 请求对象
     * @return ListNotebooksResponse
     */
    public ListNotebooksResponse listNotebooks(ListNotebooksRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listNotebooks);
    }

    /**
     * 查询Notebook实例列表
     *
     * 查询Notebook实例列表接口用于获取满足特定条件的Notebook实例信息。该接口适用于以下场景：用户管理多个Notebook实例或查看特定状态的Notebook实例时，可通过此接口获取相关信息。使用该接口的前提条件是用户已创建Notebook实例，并且具有相应的查询权限。调用成功后，系统将返回符合条件的Notebook实例列表，包含实例ID、状态、创建时间等详细信息。若用户无权限访问或查询条件不明确，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotebooksRequest 请求对象
     * @return SyncInvoker<ListNotebooksRequest, ListNotebooksResponse>
     */
    public SyncInvoker<ListNotebooksRequest, ListNotebooksResponse> listNotebooksInvoker(ListNotebooksRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listNotebooks, hcClient);
    }

    /**
     * Notebook时长续约
     *
     * Notebook时长续约接口用于延长运行中的Notebook实例的运行时间。该接口适用于以下场景：用户需要延长Notebook实例的使用时间以完成长时间任务时，可通过此接口延长指定实例的运行时间。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限，同时Notebook实例必须处于运行状态。调用该接口后，系统将延长指定Notebook实例的运行时间，用户可继续使用。若用户无权限操作指定实例或Notebook实例未运行，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenewLeaseRequest 请求对象
     * @return RenewLeaseResponse
     */
    public RenewLeaseResponse renewLease(RenewLeaseRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.renewLease);
    }

    /**
     * Notebook时长续约
     *
     * Notebook时长续约接口用于延长运行中的Notebook实例的运行时间。该接口适用于以下场景：用户需要延长Notebook实例的使用时间以完成长时间任务时，可通过此接口延长指定实例的运行时间。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限，同时Notebook实例必须处于运行状态。调用该接口后，系统将延长指定Notebook实例的运行时间，用户可继续使用。若用户无权限操作指定实例或Notebook实例未运行，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenewLeaseRequest 请求对象
     * @return SyncInvoker<RenewLeaseRequest, RenewLeaseResponse>
     */
    public SyncInvoker<RenewLeaseRequest, RenewLeaseResponse> renewLeaseInvoker(RenewLeaseRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.renewLease, hcClient);
    }

    /**
     * 查询Notebook资源池详情
     *
     * 查询Notebook资源池详情接口用于获取资源池的详细信息。该接口适用于以下场景：当用户需要创建Notebook实例作业时，可通过此接口查询指定集群的详细信息。使用该接口的前提条件是集群已成功纳管且用户具有相应的访问权限。调用该接口后，系统将返回集群的实例ID、名称、Flavor规格、实例状态以及实例可打开的URL等详细信息。若集群不存在、未被纳管或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return ShowClusterResponse
     */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showCluster);
    }

    /**
     * 查询Notebook资源池详情
     *
     * 查询Notebook资源池详情接口用于获取资源池的详细信息。该接口适用于以下场景：当用户需要创建Notebook实例作业时，可通过此接口查询指定集群的详细信息。使用该接口的前提条件是集群已成功纳管且用户具有相应的访问权限。调用该接口后，系统将返回集群的实例ID、名称、Flavor规格、实例状态以及实例可打开的URL等详细信息。若集群不存在、未被纳管或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showCluster, hcClient);
    }

    /**
     * 查询运行中的Notebook可用时长
     *
     * 查询运行中的Notebook可用时长接口用于获取正在运行的Notebook实例的剩余可用时间。该接口适用于以下场景：用户需要了解Notebook实例的剩余运行时间以合理安排任务时，可通过此接口查询指定实例的可用时长。使用该接口的前提条件是用户已登录系统并具有访问目标Notebook实例的权限，同时Notebook实例必须处于运行状态。调用该接口后，系统将返回指定Notebook实例的可用时长信息。若用户无权限访问指定实例或Notebook实例未运行，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或查询操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLeaseRequest 请求对象
     * @return ShowLeaseResponse
     */
    public ShowLeaseResponse showLease(ShowLeaseRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showLease);
    }

    /**
     * 查询运行中的Notebook可用时长
     *
     * 查询运行中的Notebook可用时长接口用于获取正在运行的Notebook实例的剩余可用时间。该接口适用于以下场景：用户需要了解Notebook实例的剩余运行时间以合理安排任务时，可通过此接口查询指定实例的可用时长。使用该接口的前提条件是用户已登录系统并具有访问目标Notebook实例的权限，同时Notebook实例必须处于运行状态。调用该接口后，系统将返回指定Notebook实例的可用时长信息。若用户无权限访问指定实例或Notebook实例未运行，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或查询操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLeaseRequest 请求对象
     * @return SyncInvoker<ShowLeaseRequest, ShowLeaseResponse>
     */
    public SyncInvoker<ShowLeaseRequest, ShowLeaseResponse> showLeaseInvoker(ShowLeaseRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showLease, hcClient);
    }

    /**
     * 查询Notebook实例详情
     *
     * 查询Notebook实例详情接口用于获取指定Notebook实例的详细信息。该接口适用于以下场景：用户需要查看特定Notebook实例的详细配置、运行状态或获取访问链接时，可通过此接口获取相关信息。使用该接口的前提条件是Notebook实例已存在且用户具有相应的查询权限。调用成功后，系统将返回实例ID、名称、规格、镜像、实例状态和实例可打开的URL等详细信息。若实例不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookRequest 请求对象
     * @return ShowNotebookResponse
     */
    public ShowNotebookResponse showNotebook(ShowNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showNotebook);
    }

    /**
     * 查询Notebook实例详情
     *
     * 查询Notebook实例详情接口用于获取指定Notebook实例的详细信息。该接口适用于以下场景：用户需要查看特定Notebook实例的详细配置、运行状态或获取访问链接时，可通过此接口获取相关信息。使用该接口的前提条件是Notebook实例已存在且用户具有相应的查询权限。调用成功后，系统将返回实例ID、名称、规格、镜像、实例状态和实例可打开的URL等详细信息。若实例不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookRequest 请求对象
     * @return SyncInvoker<ShowNotebookRequest, ShowNotebookResponse>
     */
    public SyncInvoker<ShowNotebookRequest, ShowNotebookResponse> showNotebookInvoker(ShowNotebookRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showNotebook, hcClient);
    }

    /**
     * 查询Notebook资源类型下的标签
     *
     * 查询Notebook资源类型下的标签接口用于获取用户当前project下Notebook实例的标签信息。该接口适用于以下场景：用户需要管理或统计Notebook资源时，可通过此接口查询特定标签或所有标签的Notebook实例。使用该接口的前提条件是用户已登录系统并具有访问权限，同时可指定工作空间或默认查询所有工作空间。调用该接口后，系统将返回指定Notebook实例的标签列表，包括标签名称、标签值等信息。若用户无权限，则返回相应的异常信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookTagsRequest 请求对象
     * @return ShowNotebookTagsResponse
     */
    public ShowNotebookTagsResponse showNotebookTags(ShowNotebookTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showNotebookTags);
    }

    /**
     * 查询Notebook资源类型下的标签
     *
     * 查询Notebook资源类型下的标签接口用于获取用户当前project下Notebook实例的标签信息。该接口适用于以下场景：用户需要管理或统计Notebook资源时，可通过此接口查询特定标签或所有标签的Notebook实例。使用该接口的前提条件是用户已登录系统并具有访问权限，同时可指定工作空间或默认查询所有工作空间。调用该接口后，系统将返回指定Notebook实例的标签列表，包括标签名称、标签值等信息。若用户无权限，则返回相应的异常信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotebookTagsRequest 请求对象
     * @return SyncInvoker<ShowNotebookTagsRequest, ShowNotebookTagsResponse>
     */
    public SyncInvoker<ShowNotebookTagsRequest, ShowNotebookTagsResponse> showNotebookTagsInvoker(
        ShowNotebookTagsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showNotebookTags, hcClient);
    }

    /**
     * 查询Notebook支持的可切换规格列表
     *
     * 查询Notebook支持的可切换规格列表接口用于获取创建Notebook实例时可选择的规格选项。该接口适用于以下场景：用户需要了解Notebook实例支持的配置选项时，可通过此接口查询可用的规格列表。使用该接口的前提条件是用户已登录系统并具有创建Notebook实例的权限。调用该接口后，系统将返回Notebook实例支持的可切换规格列表，包括内存、CPU等配置信息。若用户无权限创建Notebook实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSwitchableFlavorsRequest 请求对象
     * @return ShowSwitchableFlavorsResponse
     */
    public ShowSwitchableFlavorsResponse showSwitchableFlavors(ShowSwitchableFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showSwitchableFlavors);
    }

    /**
     * 查询Notebook支持的可切换规格列表
     *
     * 查询Notebook支持的可切换规格列表接口用于获取创建Notebook实例时可选择的规格选项。该接口适用于以下场景：用户需要了解Notebook实例支持的配置选项时，可通过此接口查询可用的规格列表。使用该接口的前提条件是用户已登录系统并具有创建Notebook实例的权限。调用该接口后，系统将返回Notebook实例支持的可切换规格列表，包括内存、CPU等配置信息。若用户无权限创建Notebook实例，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSwitchableFlavorsRequest 请求对象
     * @return SyncInvoker<ShowSwitchableFlavorsRequest, ShowSwitchableFlavorsResponse>
     */
    public SyncInvoker<ShowSwitchableFlavorsRequest, ShowSwitchableFlavorsResponse> showSwitchableFlavorsInvoker(
        ShowSwitchableFlavorsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showSwitchableFlavors, hcClient);
    }

    /**
     * 启动Notebook实例
     *
     * 启动Notebook实例接口用于启动已创建的Notebook实例。该接口适用于以下场景：用户需要开始运行Notebook实例以进行数据处理、模型训练或开发时，可通过此接口启动指定的Notebook实例。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限，同时Notebook实例必须处于停止状态且配置正确。调用该接口后，系统将启动指定的Notebook实例，用户可开始使用。若用户无权限操作指定实例或Notebook实例未停止，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或启动操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartNotebookRequest 请求对象
     * @return StartNotebookResponse
     */
    public StartNotebookResponse startNotebook(StartNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.startNotebook);
    }

    /**
     * 启动Notebook实例
     *
     * 启动Notebook实例接口用于启动已创建的Notebook实例。该接口适用于以下场景：用户需要开始运行Notebook实例以进行数据处理、模型训练或开发时，可通过此接口启动指定的Notebook实例。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限，同时Notebook实例必须处于停止状态且配置正确。调用该接口后，系统将启动指定的Notebook实例，用户可开始使用。若用户无权限操作指定实例或Notebook实例未停止，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或启动操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartNotebookRequest 请求对象
     * @return SyncInvoker<StartNotebookRequest, StartNotebookResponse>
     */
    public SyncInvoker<StartNotebookRequest, StartNotebookResponse> startNotebookInvoker(StartNotebookRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.startNotebook, hcClient);
    }

    /**
     * 停止Notebook实例
     *
     * 停止Notebook实例接口用于停止正在运行的Notebook实例。该接口适用于以下场景：用户需要释放Notebook实例占用的资源或结束当前运行的任务时，可通过此接口停止指定的Notebook实例。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限，同时Notebook实例必须处于运行状态。调用该接口后，系统将停止指定的Notebook实例，释放相关资源。若用户无权限操作指定实例或Notebook实例未运行，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或停止操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopNotebookRequest 请求对象
     * @return StopNotebookResponse
     */
    public StopNotebookResponse stopNotebook(StopNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopNotebook);
    }

    /**
     * 停止Notebook实例
     *
     * 停止Notebook实例接口用于停止正在运行的Notebook实例。该接口适用于以下场景：用户需要释放Notebook实例占用的资源或结束当前运行的任务时，可通过此接口停止指定的Notebook实例。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限，同时Notebook实例必须处于运行状态。调用该接口后，系统将停止指定的Notebook实例，释放相关资源。若用户无权限操作指定实例或Notebook实例未运行，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或停止操作失败，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopNotebookRequest 请求对象
     * @return SyncInvoker<StopNotebookRequest, StopNotebookResponse>
     */
    public SyncInvoker<StopNotebookRequest, StopNotebookResponse> stopNotebookInvoker(StopNotebookRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopNotebook, hcClient);
    }

    /**
     * 更新Notebook实例
     *
     * 更新Notebook实例接口用于修改Notebook实例的配置信息，包括名称、描述、规格和镜像等。该接口适用于以下场景：用户需要调整Notebook实例的配置以适应新的需求时，可通过此接口更新实例的详细信息。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限，同时Notebook实例必须处于停止状态。调用该接口后，系统将更新指定Notebook实例的配置信息。若用户无权限操作指定实例或Notebook实例未停止，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或更新参数无效，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotebookRequest 请求对象
     * @return UpdateNotebookResponse
     */
    public UpdateNotebookResponse updateNotebook(UpdateNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateNotebook);
    }

    /**
     * 更新Notebook实例
     *
     * 更新Notebook实例接口用于修改Notebook实例的配置信息，包括名称、描述、规格和镜像等。该接口适用于以下场景：用户需要调整Notebook实例的配置以适应新的需求时，可通过此接口更新实例的详细信息。使用该接口的前提条件是用户已登录系统并具有操作目标Notebook实例的权限，同时Notebook实例必须处于停止状态。调用该接口后，系统将更新指定Notebook实例的配置信息。若用户无权限操作指定实例或Notebook实例未停止，接口将返回相应的错误信息。异常情况包括：若指定的Notebook实例不存在，或更新参数无效，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotebookRequest 请求对象
     * @return SyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse>
     */
    public SyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse> updateNotebookInvoker(
        UpdateNotebookRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateNotebook, hcClient);
    }

    /**
     * 新建Workflow工作流
     *
     * 创建Workflow工作流。[可参考[如何开发Workflow](https://support.huaweicloud.com/usermanual-standard-modelarts/modelarts_workflow_0292.html)，创建工作流。](tag:hc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkflow);
    }

    /**
     * 新建Workflow工作流
     *
     * 创建Workflow工作流。[可参考[如何开发Workflow](https://support.huaweicloud.com/usermanual-standard-modelarts/modelarts_workflow_0292.html)，创建工作流。](tag:hc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(
        CreateWorkflowRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkflow, hcClient);
    }

    /**
     * 创建在线服务包
     *
     * 计费工作流购买资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowPurchasePoolRequest 请求对象
     * @return CreateWorkflowPurchasePoolResponse
     */
    public CreateWorkflowPurchasePoolResponse createWorkflowPurchasePool(CreateWorkflowPurchasePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkflowPurchasePool);
    }

    /**
     * 创建在线服务包
     *
     * 计费工作流购买资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowPurchasePoolRequest 请求对象
     * @return SyncInvoker<CreateWorkflowPurchasePoolRequest, CreateWorkflowPurchasePoolResponse>
     */
    public SyncInvoker<CreateWorkflowPurchasePoolRequest, CreateWorkflowPurchasePoolResponse> createWorkflowPurchasePoolInvoker(
        CreateWorkflowPurchasePoolRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkflowPurchasePool, hcClient);
    }

    /**
     * 在线服务鉴权
     *
     * 计费工作流在线服务鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowServiceAuthRequest 请求对象
     * @return CreateWorkflowServiceAuthResponse
     */
    public CreateWorkflowServiceAuthResponse createWorkflowServiceAuth(CreateWorkflowServiceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkflowServiceAuth);
    }

    /**
     * 在线服务鉴权
     *
     * 计费工作流在线服务鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowServiceAuthRequest 请求对象
     * @return SyncInvoker<CreateWorkflowServiceAuthRequest, CreateWorkflowServiceAuthResponse>
     */
    public SyncInvoker<CreateWorkflowServiceAuthRequest, CreateWorkflowServiceAuthResponse> createWorkflowServiceAuthInvoker(
        CreateWorkflowServiceAuthRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkflowServiceAuth, hcClient);
    }

    /**
     * 删除Workflow工作流
     *
     * 通过ID删除Workflow工作流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteWorkflow);
    }

    /**
     * 删除Workflow工作流
     *
     * 通过ID删除Workflow工作流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowInvoker(
        DeleteWorkflowRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteWorkflow, hcClient);
    }

    /**
     * 获取Workflow工作流列表
     *
     * 展示Workflow工作流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(ListWorkflowsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listWorkflows);
    }

    /**
     * 获取Workflow工作流列表
     *
     * 展示Workflow工作流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsInvoker(ListWorkflowsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listWorkflows, hcClient);
    }

    /**
     * 查询Workflow工作流
     *
     * 通过ID查询Workflow工作流详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowRequest 请求对象
     * @return ShowWorkflowResponse
     */
    public ShowWorkflowResponse showWorkflow(ShowWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflow);
    }

    /**
     * 查询Workflow工作流
     *
     * 通过ID查询Workflow工作流详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowRequest 请求对象
     * @return SyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse>
     */
    public SyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflowInvoker(ShowWorkflowRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflow, hcClient);
    }

    /**
     * Workflow列表所有标签
     *
     * Workflow列表所有标签接口用于获取指定项目下所有工作流的标签信息。
     * 该接口适用于以下场景：当用户需要了解项目中所有工作流的标签配置，以便进行资源管理和筛选时，可以通过此接口获取标签列表。使用该接口的前提条件是用户已登录并具有查看工作流标签的权限。响应消息体中包含每个工作流的标签信息，如标签键和值。若用户无权限或项目下无工作流，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowLabelsRequest 请求对象
     * @return ShowWorkflowLabelsResponse
     */
    public ShowWorkflowLabelsResponse showWorkflowLabels(ShowWorkflowLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflowLabels);
    }

    /**
     * Workflow列表所有标签
     *
     * Workflow列表所有标签接口用于获取指定项目下所有工作流的标签信息。
     * 该接口适用于以下场景：当用户需要了解项目中所有工作流的标签配置，以便进行资源管理和筛选时，可以通过此接口获取标签列表。使用该接口的前提条件是用户已登录并具有查看工作流标签的权限。响应消息体中包含每个工作流的标签信息，如标签键和值。若用户无权限或项目下无工作流，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowLabelsRequest 请求对象
     * @return SyncInvoker<ShowWorkflowLabelsRequest, ShowWorkflowLabelsResponse>
     */
    public SyncInvoker<ShowWorkflowLabelsRequest, ShowWorkflowLabelsResponse> showWorkflowLabelsInvoker(
        ShowWorkflowLabelsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflowLabels, hcClient);
    }

    /**
     * 总览Workflow工作流
     *
     * 获取Workflow工作流统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowsOverviewRequest 请求对象
     * @return ShowWorkflowsOverviewResponse
     */
    public ShowWorkflowsOverviewResponse showWorkflowsOverview(ShowWorkflowsOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflowsOverview);
    }

    /**
     * 总览Workflow工作流
     *
     * 获取Workflow工作流统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowsOverviewRequest 请求对象
     * @return SyncInvoker<ShowWorkflowsOverviewRequest, ShowWorkflowsOverviewResponse>
     */
    public SyncInvoker<ShowWorkflowsOverviewRequest, ShowWorkflowsOverviewResponse> showWorkflowsOverviewInvoker(
        ShowWorkflowsOverviewRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflowsOverview, hcClient);
    }

    /**
     * 查询Workflow待办事项
     *
     * 获取Workflow待办列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowsTodolistRequest 请求对象
     * @return ShowWorkflowsTodolistResponse
     */
    public ShowWorkflowsTodolistResponse showWorkflowsTodolist(ShowWorkflowsTodolistRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflowsTodolist);
    }

    /**
     * 查询Workflow待办事项
     *
     * 获取Workflow待办列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowsTodolistRequest 请求对象
     * @return SyncInvoker<ShowWorkflowsTodolistRequest, ShowWorkflowsTodolistResponse>
     */
    public SyncInvoker<ShowWorkflowsTodolistRequest, ShowWorkflowsTodolistResponse> showWorkflowsTodolistInvoker(
        ShowWorkflowsTodolistRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflowsTodolist, hcClient);
    }

    /**
     * 修改Workflow工作流
     *
     * 更新Workflow工作流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateWorkflow);
    }

    /**
     * 修改Workflow工作流
     *
     * 更新Workflow工作流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowInvoker(
        UpdateWorkflowRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateWorkflow, hcClient);
    }

    /**
     * 新建Workflow Execution
     *
     * 创建Workflow Execution。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowExecutionRequest 请求对象
     * @return CreateWorkflowExecutionResponse
     */
    public CreateWorkflowExecutionResponse createWorkflowExecution(CreateWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkflowExecution);
    }

    /**
     * 新建Workflow Execution
     *
     * 创建Workflow Execution。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<CreateWorkflowExecutionRequest, CreateWorkflowExecutionResponse>
     */
    public SyncInvoker<CreateWorkflowExecutionRequest, CreateWorkflowExecutionResponse> createWorkflowExecutionInvoker(
        CreateWorkflowExecutionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkflowExecution, hcClient);
    }

    /**
     * 管理Workflow Execution
     *
     * 本接口支持对Workflow Execution进行停止或重跑操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowExecutionsActionsRequest 请求对象
     * @return CreateWorkflowExecutionsActionsResponse
     */
    public CreateWorkflowExecutionsActionsResponse createWorkflowExecutionsActions(
        CreateWorkflowExecutionsActionsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkflowExecutionsActions);
    }

    /**
     * 管理Workflow Execution
     *
     * 本接口支持对Workflow Execution进行停止或重跑操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowExecutionsActionsRequest 请求对象
     * @return SyncInvoker<CreateWorkflowExecutionsActionsRequest, CreateWorkflowExecutionsActionsResponse>
     */
    public SyncInvoker<CreateWorkflowExecutionsActionsRequest, CreateWorkflowExecutionsActionsResponse> createWorkflowExecutionsActionsInvoker(
        CreateWorkflowExecutionsActionsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkflowExecutionsActions, hcClient);
    }

    /**
     * 管理Workflow StepExecution
     *
     * 本接口支持对Workflow StepExecution进行重试、停止和继续操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowStepExecutionsActionsRequest 请求对象
     * @return CreateWorkflowStepExecutionsActionsResponse
     */
    public CreateWorkflowStepExecutionsActionsResponse createWorkflowStepExecutionsActions(
        CreateWorkflowStepExecutionsActionsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkflowStepExecutionsActions);
    }

    /**
     * 管理Workflow StepExecution
     *
     * 本接口支持对Workflow StepExecution进行重试、停止和继续操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowStepExecutionsActionsRequest 请求对象
     * @return SyncInvoker<CreateWorkflowStepExecutionsActionsRequest, CreateWorkflowStepExecutionsActionsResponse>
     */
    public SyncInvoker<CreateWorkflowStepExecutionsActionsRequest, CreateWorkflowStepExecutionsActionsResponse> createWorkflowStepExecutionsActionsInvoker(
        CreateWorkflowStepExecutionsActionsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkflowStepExecutionsActions, hcClient);
    }

    /**
     * 删除Workflow Execution
     *
     * 通过ID删除Workflow Execution。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowExecutionRequest 请求对象
     * @return DeleteWorkflowExecutionResponse
     */
    public DeleteWorkflowExecutionResponse deleteWorkflowExecution(DeleteWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteWorkflowExecution);
    }

    /**
     * 删除Workflow Execution
     *
     * 通过ID删除Workflow Execution。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<DeleteWorkflowExecutionRequest, DeleteWorkflowExecutionResponse>
     */
    public SyncInvoker<DeleteWorkflowExecutionRequest, DeleteWorkflowExecutionResponse> deleteWorkflowExecutionInvoker(
        DeleteWorkflowExecutionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteWorkflowExecution, hcClient);
    }

    /**
     * 获取Workflow Execution列表的所有标签
     *
     * 获取Workflow Execution列表的所有标签接口用于查询指定工作流执行记录中的所有标签。
     * 该接口适用于以下场景：当用户需要查看工作流执行记录的标签信息，以便进行分类、筛选或统计时，可以通过此接口获取所有标签的列表。使用该接口的前提条件是用户已登录且具有查看工作流执行记录的权限。接口响应消息体中包含每个标签的详细信息，如标签键和标签值。若用户无权限操作或指定的工作流执行记录不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionLabelsRequest 请求对象
     * @return ListExecutionLabelsResponse
     */
    public ListExecutionLabelsResponse listExecutionLabels(ListExecutionLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listExecutionLabels);
    }

    /**
     * 获取Workflow Execution列表的所有标签
     *
     * 获取Workflow Execution列表的所有标签接口用于查询指定工作流执行记录中的所有标签。
     * 该接口适用于以下场景：当用户需要查看工作流执行记录的标签信息，以便进行分类、筛选或统计时，可以通过此接口获取所有标签的列表。使用该接口的前提条件是用户已登录且具有查看工作流执行记录的权限。接口响应消息体中包含每个标签的详细信息，如标签键和标签值。若用户无权限操作或指定的工作流执行记录不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionLabelsRequest 请求对象
     * @return SyncInvoker<ListExecutionLabelsRequest, ListExecutionLabelsResponse>
     */
    public SyncInvoker<ListExecutionLabelsRequest, ListExecutionLabelsResponse> listExecutionLabelsInvoker(
        ListExecutionLabelsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listExecutionLabels, hcClient);
    }

    /**
     * 获取Execution列表
     *
     * 查询Workflow下的执行记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowExecutionsRequest 请求对象
     * @return ListWorkflowExecutionsResponse
     */
    public ListWorkflowExecutionsResponse listWorkflowExecutions(ListWorkflowExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listWorkflowExecutions);
    }

    /**
     * 获取Execution列表
     *
     * 查询Workflow下的执行记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowExecutionsRequest 请求对象
     * @return SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>
     */
    public SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutionsInvoker(
        ListWorkflowExecutionsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listWorkflowExecutions, hcClient);
    }

    /**
     * 获取StepExecution列表
     *
     * 查询指定工作流中各步骤的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowStepExecutionRequest 请求对象
     * @return ListWorkflowStepExecutionResponse
     */
    public ListWorkflowStepExecutionResponse listWorkflowStepExecution(ListWorkflowStepExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listWorkflowStepExecution);
    }

    /**
     * 获取StepExecution列表
     *
     * 查询指定工作流中各步骤的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowStepExecutionRequest 请求对象
     * @return SyncInvoker<ListWorkflowStepExecutionRequest, ListWorkflowStepExecutionResponse>
     */
    public SyncInvoker<ListWorkflowStepExecutionRequest, ListWorkflowStepExecutionResponse> listWorkflowStepExecutionInvoker(
        ListWorkflowStepExecutionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listWorkflowStepExecution, hcClient);
    }

    /**
     * 查询Workflow Execution
     *
     * 通过ID查询Workflow Execution详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowExecutionRequest 请求对象
     * @return ShowWorkflowExecutionResponse
     */
    public ShowWorkflowExecutionResponse showWorkflowExecution(ShowWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflowExecution);
    }

    /**
     * 查询Workflow Execution
     *
     * 通过ID查询Workflow Execution详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse>
     */
    public SyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> showWorkflowExecutionInvoker(
        ShowWorkflowExecutionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflowExecution, hcClient);
    }

    /**
     * 获取Workflow工作流节点度量信息
     *
     * 获取Workflow工作流节点的度量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowStepExecutionMetricsRequest 请求对象
     * @return ShowWorkflowStepExecutionMetricsResponse
     */
    public ShowWorkflowStepExecutionMetricsResponse showWorkflowStepExecutionMetrics(
        ShowWorkflowStepExecutionMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflowStepExecutionMetrics);
    }

    /**
     * 获取Workflow工作流节点度量信息
     *
     * 获取Workflow工作流节点的度量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowStepExecutionMetricsRequest 请求对象
     * @return SyncInvoker<ShowWorkflowStepExecutionMetricsRequest, ShowWorkflowStepExecutionMetricsResponse>
     */
    public SyncInvoker<ShowWorkflowStepExecutionMetricsRequest, ShowWorkflowStepExecutionMetricsResponse> showWorkflowStepExecutionMetricsInvoker(
        ShowWorkflowStepExecutionMetricsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflowStepExecutionMetrics, hcClient);
    }

    /**
     * 更新Workflow Execution
     *
     * 通过ID更新Workflow Exectuion。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowExecutionRequest 请求对象
     * @return UpdateWorkflowExecutionResponse
     */
    public UpdateWorkflowExecutionResponse updateWorkflowExecution(UpdateWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateWorkflowExecution);
    }

    /**
     * 更新Workflow Execution
     *
     * 通过ID更新Workflow Exectuion。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowExecutionRequest, UpdateWorkflowExecutionResponse>
     */
    public SyncInvoker<UpdateWorkflowExecutionRequest, UpdateWorkflowExecutionResponse> updateWorkflowExecutionInvoker(
        UpdateWorkflowExecutionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateWorkflowExecution, hcClient);
    }

    /**
     * 创建工作流定时调度
     *
     * 创建Workflow定时调度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowScheduleRequest 请求对象
     * @return CreateWorkflowScheduleResponse
     */
    public CreateWorkflowScheduleResponse createWorkflowSchedule(CreateWorkflowScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkflowSchedule);
    }

    /**
     * 创建工作流定时调度
     *
     * 创建Workflow定时调度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowScheduleRequest 请求对象
     * @return SyncInvoker<CreateWorkflowScheduleRequest, CreateWorkflowScheduleResponse>
     */
    public SyncInvoker<CreateWorkflowScheduleRequest, CreateWorkflowScheduleResponse> createWorkflowScheduleInvoker(
        CreateWorkflowScheduleRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkflowSchedule, hcClient);
    }

    /**
     * 删除工作流定时调度信息
     *
     * 删除工作流调度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowScheduleIdRequest 请求对象
     * @return DeleteWorkflowScheduleIdResponse
     */
    public DeleteWorkflowScheduleIdResponse deleteWorkflowScheduleId(DeleteWorkflowScheduleIdRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteWorkflowScheduleId);
    }

    /**
     * 删除工作流定时调度信息
     *
     * 删除工作流调度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowScheduleIdRequest 请求对象
     * @return SyncInvoker<DeleteWorkflowScheduleIdRequest, DeleteWorkflowScheduleIdResponse>
     */
    public SyncInvoker<DeleteWorkflowScheduleIdRequest, DeleteWorkflowScheduleIdResponse> deleteWorkflowScheduleIdInvoker(
        DeleteWorkflowScheduleIdRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteWorkflowScheduleId, hcClient);
    }

    /**
     * 查询工作流定时调度详情
     *
     * 查询工作流调度详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowScheduleRequest 请求对象
     * @return ShowWorkflowScheduleResponse
     */
    public ShowWorkflowScheduleResponse showWorkflowSchedule(ShowWorkflowScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflowSchedule);
    }

    /**
     * 查询工作流定时调度详情
     *
     * 查询工作流调度详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowScheduleRequest 请求对象
     * @return SyncInvoker<ShowWorkflowScheduleRequest, ShowWorkflowScheduleResponse>
     */
    public SyncInvoker<ShowWorkflowScheduleRequest, ShowWorkflowScheduleResponse> showWorkflowScheduleInvoker(
        ShowWorkflowScheduleRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflowSchedule, hcClient);
    }

    /**
     * 查询工作流定时调度列表
     *
     * 查询工作流定时调度列表接口用于获取指定项目下所有工作流的定时调度信息。
     * 该接口适用于以下场景：当用户需要查看项目中所有工作流的定时调度配置，以便进行任务管理和调度优化时，可以通过此接口获取定时调度列表。使用该接口的前提条件是用户已登录并具有查看工作流定时调度的权限。响应消息体中包含每个工作流的定时调度信息，如调度ID、调度时间、状态等。若用户无权限或项目下无工作流定时调度，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowScheduleListRequest 请求对象
     * @return ShowWorkflowScheduleListResponse
     */
    public ShowWorkflowScheduleListResponse showWorkflowScheduleList(ShowWorkflowScheduleListRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflowScheduleList);
    }

    /**
     * 查询工作流定时调度列表
     *
     * 查询工作流定时调度列表接口用于获取指定项目下所有工作流的定时调度信息。
     * 该接口适用于以下场景：当用户需要查看项目中所有工作流的定时调度配置，以便进行任务管理和调度优化时，可以通过此接口获取定时调度列表。使用该接口的前提条件是用户已登录并具有查看工作流定时调度的权限。响应消息体中包含每个工作流的定时调度信息，如调度ID、调度时间、状态等。若用户无权限或项目下无工作流定时调度，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowScheduleListRequest 请求对象
     * @return SyncInvoker<ShowWorkflowScheduleListRequest, ShowWorkflowScheduleListResponse>
     */
    public SyncInvoker<ShowWorkflowScheduleListRequest, ShowWorkflowScheduleListResponse> showWorkflowScheduleListInvoker(
        ShowWorkflowScheduleListRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflowScheduleList, hcClient);
    }

    /**
     * 更新工作流定时调度信息
     *
     * 更新WorkflowSchedule信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowScheduleRequest 请求对象
     * @return UpdateWorkflowScheduleResponse
     */
    public UpdateWorkflowScheduleResponse updateWorkflowSchedule(UpdateWorkflowScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateWorkflowSchedule);
    }

    /**
     * 更新工作流定时调度信息
     *
     * 更新WorkflowSchedule信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowScheduleRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowScheduleRequest, UpdateWorkflowScheduleResponse>
     */
    public SyncInvoker<UpdateWorkflowScheduleRequest, UpdateWorkflowScheduleResponse> updateWorkflowScheduleInvoker(
        UpdateWorkflowScheduleRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateWorkflowSchedule, hcClient);
    }

    /**
     * 新建消息订阅Subscription
     *
     * 为Workflow工作流添加消息订阅功能。工作流已订阅的事件发生时，会产生消息提醒。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowSubscriptionsRequest 请求对象
     * @return CreateWorkflowSubscriptionsResponse
     */
    public CreateWorkflowSubscriptionsResponse createWorkflowSubscriptions(CreateWorkflowSubscriptionsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createWorkflowSubscriptions);
    }

    /**
     * 新建消息订阅Subscription
     *
     * 为Workflow工作流添加消息订阅功能。工作流已订阅的事件发生时，会产生消息提醒。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowSubscriptionsRequest 请求对象
     * @return SyncInvoker<CreateWorkflowSubscriptionsRequest, CreateWorkflowSubscriptionsResponse>
     */
    public SyncInvoker<CreateWorkflowSubscriptionsRequest, CreateWorkflowSubscriptionsResponse> createWorkflowSubscriptionsInvoker(
        CreateWorkflowSubscriptionsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createWorkflowSubscriptions, hcClient);
    }

    /**
     * 删除消息订阅Subscription
     *
     * 删除已订阅的消息订阅Subscription。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowSubscriptionRequest 请求对象
     * @return DeleteWorkflowSubscriptionResponse
     */
    public DeleteWorkflowSubscriptionResponse deleteWorkflowSubscription(DeleteWorkflowSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteWorkflowSubscription);
    }

    /**
     * 删除消息订阅Subscription
     *
     * 删除已订阅的消息订阅Subscription。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowSubscriptionRequest 请求对象
     * @return SyncInvoker<DeleteWorkflowSubscriptionRequest, DeleteWorkflowSubscriptionResponse>
     */
    public SyncInvoker<DeleteWorkflowSubscriptionRequest, DeleteWorkflowSubscriptionResponse> deleteWorkflowSubscriptionInvoker(
        DeleteWorkflowSubscriptionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteWorkflowSubscription, hcClient);
    }

    /**
     * 查询消息订阅Subscription详情
     *
     * 查询Workflow工作流已订阅的订阅信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowSubscriptionRequest 请求对象
     * @return ShowWorkflowSubscriptionResponse
     */
    public ShowWorkflowSubscriptionResponse showWorkflowSubscription(ShowWorkflowSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showWorkflowSubscription);
    }

    /**
     * 查询消息订阅Subscription详情
     *
     * 查询Workflow工作流已订阅的订阅信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowSubscriptionRequest 请求对象
     * @return SyncInvoker<ShowWorkflowSubscriptionRequest, ShowWorkflowSubscriptionResponse>
     */
    public SyncInvoker<ShowWorkflowSubscriptionRequest, ShowWorkflowSubscriptionResponse> showWorkflowSubscriptionInvoker(
        ShowWorkflowSubscriptionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showWorkflowSubscription, hcClient);
    }

    /**
     * 更新消息订阅Subscription
     *
     * 更新Workflow工作流已订阅的订阅信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowSubscriptionRequest 请求对象
     * @return UpdateWorkflowSubscriptionResponse
     */
    public UpdateWorkflowSubscriptionResponse updateWorkflowSubscription(UpdateWorkflowSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateWorkflowSubscription);
    }

    /**
     * 更新消息订阅Subscription
     *
     * 更新Workflow工作流已订阅的订阅信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowSubscriptionRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowSubscriptionRequest, UpdateWorkflowSubscriptionResponse>
     */
    public SyncInvoker<UpdateWorkflowSubscriptionRequest, UpdateWorkflowSubscriptionResponse> updateWorkflowSubscriptionInvoker(
        UpdateWorkflowSubscriptionRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateWorkflowSubscription, hcClient);
    }

}
