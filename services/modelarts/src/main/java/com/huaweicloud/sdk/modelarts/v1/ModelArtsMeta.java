package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.Algorithm;
import com.huaweicloud.sdk.modelarts.v1.model.AttachDevServerVolumeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AttachDevServerVolumeResponse;
import com.huaweicloud.sdk.modelarts.v1.model.AttachDynamicStorageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AttachDynamicStorageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.AttachServerVolumeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindApiKeyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindInferApiKeysRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindInferApiKeysResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindPoolNodesReq;
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
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnBindApiKeyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnbindInferApiKeysRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnbindInferApiKeysResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnlockPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnlockPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesRequestBody;
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
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CountInferServicesByTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CountInferServicesByTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateApiKeyReq;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAuthorizationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateDevServerJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateDevServerJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateHpaRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateHraRequestBody;
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
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNotebookRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNotebookResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNotebookTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNotebookTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderIdRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderIdResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePluginRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolPluginRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolPluginResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateRoceNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateRoceNetworkResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.DataVolumesReq;
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
import com.huaweicloud.sdk.modelarts.v1.model.DeleteImageGroupRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteImageGroupResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteImageRequestBody;
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
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInferTmsTagsRequest;
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
import com.huaweicloud.sdk.modelarts.v1.model.DeleteServicesRequest;
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
import com.huaweicloud.sdk.modelarts.v1.model.DetachDevServerVolumeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DetachDevServerVolumeResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DetachDynamicStorageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DetachDynamicStorageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DevServerBatchRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DevServerJobCreateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.EventUpdate;
import com.huaweicloud.sdk.modelarts.v1.model.ExecutionAction;
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
import com.huaweicloud.sdk.modelarts.v1.model.GroupConfig;
import com.huaweicloud.sdk.modelarts.v1.model.GroupConfigUpdateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.HyperClusterCreateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.HyperinstanceClustersCapacityRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ImageCreateReq;
import com.huaweicloud.sdk.modelarts.v1.model.ImageRegRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ImageSaveJob;
import com.huaweicloud.sdk.modelarts.v1.model.IntranetConnectionDeleteRequest;
import com.huaweicloud.sdk.modelarts.v1.model.IntranetConnectionModifyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.IntranetConnectionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.Job;
import com.huaweicloud.sdk.modelarts.v1.model.JobActionType;
import com.huaweicloud.sdk.modelarts.v1.model.JobDescription;
import com.huaweicloud.sdk.modelarts.v1.model.JobSearches;
import com.huaweicloud.sdk.modelarts.v1.model.LeaseReq;
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
import com.huaweicloud.sdk.modelarts.v1.model.ModelArtsAgencyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ModifyInferIntranetConnectionsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ModifyInferIntranetConnectionsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.NetworkCreationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NetworkUpdateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NodeBatchMigrationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NodesDeletionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NotebookCreateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NotebookUpdateRequest;
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
import com.huaweicloud.sdk.modelarts.v1.model.QueryHyperinstanceTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.QueryHyperinstanceTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.QueryTmsResourceCountRequest;
import com.huaweicloud.sdk.modelarts.v1.model.QueryTmsResourceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.RebootDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.RebootDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.RegisterImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.RegisterImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ReinstallDevServerOSRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ReinstallDevServerOSResponse;
import com.huaweicloud.sdk.modelarts.v1.model.RenewLeaseRequest;
import com.huaweicloud.sdk.modelarts.v1.model.RenewLeaseResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ReportEventBody;
import com.huaweicloud.sdk.modelarts.v1.model.ResetNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ScaleDownHyperinstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ScaleDownHyperinstanceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ScaleUpHyperinstanceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ScaleUpHyperinstanceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ServerBindPublicIPRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServerCreateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServerHyperScaleUpRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServerJobDeleteRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServerOsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServerRoceNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServerScaleDownRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServerStartRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServiceCreateRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ServicePodEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ServiceUpdateRequest;
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
import com.huaweicloud.sdk.modelarts.v1.model.StepExecutionAction;
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
import com.huaweicloud.sdk.modelarts.v1.model.Subscription;
import com.huaweicloud.sdk.modelarts.v1.model.SwitchInferDeploymentVersionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.SwitchInferDeploymentVersionRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.SwitchInferDeploymentVersionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.SyncDevServersRequest;
import com.huaweicloud.sdk.modelarts.v1.model.SyncDevServersResponse;
import com.huaweicloud.sdk.modelarts.v1.model.SyncImageRequest;
import com.huaweicloud.sdk.modelarts.v1.model.SyncImageResponse;
import com.huaweicloud.sdk.modelarts.v1.model.TagRequest;
import com.huaweicloud.sdk.modelarts.v1.model.TaskHistory;
import com.huaweicloud.sdk.modelarts.v1.model.UnbindInferApiKeyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UnbindInferApiKeyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateDevServerRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateDevServerResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateHpaRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateHraRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateImageGroupRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateImageGroupRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateImageGroupResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentHpaRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentHpaResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentScale;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentScaleRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferDeploymentScaleResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferHraRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferHraResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferIntranetConnectionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferIntranetConnectionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferServiceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInferServiceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateIntranetConnectionRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateNotebookRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateNotebookResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateServerRequest;
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

    public static final HttpRequestDef<AttachDynamicStorageRequest, AttachDynamicStorageResponse> attachDynamicStorage =
        genForAttachDynamicStorage();

    private static HttpRequestDef<AttachDynamicStorageRequest, AttachDynamicStorageResponse> genForAttachDynamicStorage() {
        // basic
        HttpRequestDef.Builder<AttachDynamicStorageRequest, AttachDynamicStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AttachDynamicStorageRequest.class, AttachDynamicStorageResponse.class)
            .withName("AttachDynamicStorage")
            .withUri("/v1/{project_id}/notebooks/{instance_id}/storage")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachDynamicStorageRequest::getInstanceId,
                AttachDynamicStorageRequest::setInstanceId));
        builder.<DataVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataVolumesReq.class),
            f -> f.withMarshaller(AttachDynamicStorageRequest::getBody, AttachDynamicStorageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchBindInferApiKeysRequest, BatchBindInferApiKeysResponse> batchBindInferApiKeys =
        genForBatchBindInferApiKeys();

    private static HttpRequestDef<BatchBindInferApiKeysRequest, BatchBindInferApiKeysResponse> genForBatchBindInferApiKeys() {
        // basic
        HttpRequestDef.Builder<BatchBindInferApiKeysRequest, BatchBindInferApiKeysResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchBindInferApiKeysRequest.class, BatchBindInferApiKeysResponse.class)
            .withName("BatchBindInferApiKeys")
            .withUri("/v2/{project_id}/services/{service_id}/api-keys/batch-bind")
            .withContentType("application/x-www-form-urlencoded");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchBindInferApiKeysRequest::getServiceId,
                BatchBindInferApiKeysRequest::setServiceId));
        builder.<BatchBindApiKeyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchBindApiKeyRequest.class),
            f -> f.withMarshaller(BatchBindInferApiKeysRequest::getBody, BatchBindInferApiKeysRequest::setBody));

        // response

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

    public static final HttpRequestDef<BatchDeleteInferIntranetConnectionsRequest, BatchDeleteInferIntranetConnectionsResponse> batchDeleteInferIntranetConnections =
        genForBatchDeleteInferIntranetConnections();

    private static HttpRequestDef<BatchDeleteInferIntranetConnectionsRequest, BatchDeleteInferIntranetConnectionsResponse> genForBatchDeleteInferIntranetConnections() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInferIntranetConnectionsRequest, BatchDeleteInferIntranetConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteInferIntranetConnectionsRequest.class,
                    BatchDeleteInferIntranetConnectionsResponse.class)
                .withName("BatchDeleteInferIntranetConnections")
                .withUri("/v2/{project_id}/intranet-connection/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<IntranetConnectionDeleteRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IntranetConnectionDeleteRequest.class),
            f -> f.withMarshaller(BatchDeleteInferIntranetConnectionsRequest::getBody,
                BatchDeleteInferIntranetConnectionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInferServicesRequest, BatchDeleteInferServicesResponse> batchDeleteInferServices =
        genForBatchDeleteInferServices();

    private static HttpRequestDef<BatchDeleteInferServicesRequest, BatchDeleteInferServicesResponse> genForBatchDeleteInferServices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInferServicesRequest, BatchDeleteInferServicesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDeleteInferServicesRequest.class, BatchDeleteInferServicesResponse.class)
                .withName("BatchDeleteInferServices")
                .withUri("/v2/{project_id}/services/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteServicesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteServicesRequest.class),
            f -> f.withMarshaller(BatchDeleteInferServicesRequest::getBody, BatchDeleteInferServicesRequest::setBody));

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

    public static final HttpRequestDef<BatchUnbindInferApiKeysRequest, BatchUnbindInferApiKeysResponse> batchUnbindInferApiKeys =
        genForBatchUnbindInferApiKeys();

    private static HttpRequestDef<BatchUnbindInferApiKeysRequest, BatchUnbindInferApiKeysResponse> genForBatchUnbindInferApiKeys() {
        // basic
        HttpRequestDef.Builder<BatchUnbindInferApiKeysRequest, BatchUnbindInferApiKeysResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUnbindInferApiKeysRequest.class, BatchUnbindInferApiKeysResponse.class)
            .withName("BatchUnbindInferApiKeys")
            .withUri("/v2/{project_id}/services/{service_id}/api-keys/batch-unbind")
            .withContentType("application/x-www-form-urlencoded");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUnbindInferApiKeysRequest::getServiceId,
                BatchUnbindInferApiKeysRequest::setServiceId));
        builder.<BatchUnBindApiKeyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUnBindApiKeyRequest.class),
            f -> f.withMarshaller(BatchUnbindInferApiKeysRequest::getBody, BatchUnbindInferApiKeysRequest::setBody));

        // response

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

    public static final HttpRequestDef<BindInferApiKeyRequest, BindInferApiKeyResponse> bindInferApiKey =
        genForBindInferApiKey();

    private static HttpRequestDef<BindInferApiKeyRequest, BindInferApiKeyResponse> genForBindInferApiKey() {
        // basic
        HttpRequestDef.Builder<BindInferApiKeyRequest, BindInferApiKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BindInferApiKeyRequest.class, BindInferApiKeyResponse.class)
                .withName("BindInferApiKey")
                .withUri("/v2/{project_id}/services/{service_id}/api-keys/{key_id}/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindInferApiKeyRequest::getServiceId, BindInferApiKeyRequest::setServiceId));
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindInferApiKeyRequest::getKeyId, BindInferApiKeyRequest::setKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelInferDeploymentRequest, CancelInferDeploymentResponse> cancelInferDeployment =
        genForCancelInferDeployment();

    private static HttpRequestDef<CancelInferDeploymentRequest, CancelInferDeploymentResponse> genForCancelInferDeployment() {
        // basic
        HttpRequestDef.Builder<CancelInferDeploymentRequest, CancelInferDeploymentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelInferDeploymentRequest.class, CancelInferDeploymentResponse.class)
            .withName("CancelInferDeployment")
            .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/interrupt")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelInferDeploymentRequest::getServiceId,
                CancelInferDeploymentRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelInferDeploymentRequest::getDeploymentId,
                CancelInferDeploymentRequest::setDeploymentId));

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

    public static final HttpRequestDef<CountInferServicesByTagsRequest, CountInferServicesByTagsResponse> countInferServicesByTags =
        genForCountInferServicesByTags();

    private static HttpRequestDef<CountInferServicesByTagsRequest, CountInferServicesByTagsResponse> genForCountInferServicesByTags() {
        // basic
        HttpRequestDef.Builder<CountInferServicesByTagsRequest, CountInferServicesByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CountInferServicesByTagsRequest.class, CountInferServicesByTagsResponse.class)
                .withName("CountInferServicesByTags")
                .withUri("/v2/{project_id}/modelarts-service-v2/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountInferServicesByTagsRequest::getWorkspaceId,
                CountInferServicesByTagsRequest::setWorkspaceId));
        builder.<QueryTmsResourceCountRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTmsResourceCountRequest.class),
            f -> f.withMarshaller(CountInferServicesByTagsRequest::getBody, CountInferServicesByTagsRequest::setBody));

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

    public static final HttpRequestDef<CreateInferApiKeyRequest, CreateInferApiKeyResponse> createInferApiKey =
        genForCreateInferApiKey();

    private static HttpRequestDef<CreateInferApiKeyRequest, CreateInferApiKeyResponse> genForCreateInferApiKey() {
        // basic
        HttpRequestDef.Builder<CreateInferApiKeyRequest, CreateInferApiKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInferApiKeyRequest.class, CreateInferApiKeyResponse.class)
                .withName("CreateInferApiKey")
                .withUri("/v2/{project_id}/services/api-keys")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateApiKeyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateApiKeyReq.class),
            f -> f.withMarshaller(CreateInferApiKeyRequest::getBody, CreateInferApiKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInferDeploymentRequest, CreateInferDeploymentResponse> createInferDeployment =
        genForCreateInferDeployment();

    private static HttpRequestDef<CreateInferDeploymentRequest, CreateInferDeploymentResponse> genForCreateInferDeployment() {
        // basic
        HttpRequestDef.Builder<CreateInferDeploymentRequest, CreateInferDeploymentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateInferDeploymentRequest.class, CreateInferDeploymentResponse.class)
            .withName("CreateInferDeployment")
            .withUri("/v2/{project_id}/services/{service_id}/deployments")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInferDeploymentRequest::getServiceId,
                CreateInferDeploymentRequest::setServiceId));
        builder.<GroupConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GroupConfig.class),
            f -> f.withMarshaller(CreateInferDeploymentRequest::getBody, CreateInferDeploymentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInferIntranetConnectionRequest, CreateInferIntranetConnectionResponse> createInferIntranetConnection =
        genForCreateInferIntranetConnection();

    private static HttpRequestDef<CreateInferIntranetConnectionRequest, CreateInferIntranetConnectionResponse> genForCreateInferIntranetConnection() {
        // basic
        HttpRequestDef.Builder<CreateInferIntranetConnectionRequest, CreateInferIntranetConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInferIntranetConnectionRequest.class,
                    CreateInferIntranetConnectionResponse.class)
                .withName("CreateInferIntranetConnection")
                .withUri("/v2/{project_id}/intranet-connection")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<IntranetConnectionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IntranetConnectionRequest.class),
            f -> f.withMarshaller(CreateInferIntranetConnectionRequest::getBody,
                CreateInferIntranetConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInferServiceRequest, CreateInferServiceResponse> createInferService =
        genForCreateInferService();

    private static HttpRequestDef<CreateInferServiceRequest, CreateInferServiceResponse> genForCreateInferService() {
        // basic
        HttpRequestDef.Builder<CreateInferServiceRequest, CreateInferServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInferServiceRequest.class, CreateInferServiceResponse.class)
                .withName("CreateInferService")
                .withUri("/v2/{project_id}/services")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Auth-Token-Provider",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInferServiceRequest::getXAuthTokenProvider,
                CreateInferServiceRequest::setXAuthTokenProvider));
        builder.<ServiceCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServiceCreateRequest.class),
            f -> f.withMarshaller(CreateInferServiceRequest::getBody, CreateInferServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInferServiceTagRequest, CreateInferServiceTagResponse> createInferServiceTag =
        genForCreateInferServiceTag();

    private static HttpRequestDef<CreateInferServiceTagRequest, CreateInferServiceTagResponse> genForCreateInferServiceTag() {
        // basic
        HttpRequestDef.Builder<CreateInferServiceTagRequest, CreateInferServiceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateInferServiceTagRequest.class, CreateInferServiceTagResponse.class)
            .withName("CreateInferServiceTag")
            .withUri("/v2/{project_id}/modelarts-service-v2/{resource_id}/tags/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInferServiceTagRequest::getResourceId,
                CreateInferServiceTagRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInferServiceTagRequest::getWorkspaceId,
                CreateInferServiceTagRequest::setWorkspaceId));

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

    public static final HttpRequestDef<DeleteImageRequest, DeleteImageResponse> deleteImage = genForDeleteImage();

    private static HttpRequestDef<DeleteImageRequest, DeleteImageResponse> genForDeleteImage() {
        // basic
        HttpRequestDef.Builder<DeleteImageRequest, DeleteImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageRequest.class, DeleteImageResponse.class)
                .withName("DeleteImage")
                .withUri("/v1/{project_id}/images/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getId, DeleteImageRequest::setId));
        builder.<DeleteImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteImageRequestBody.class),
            f -> f.withMarshaller(DeleteImageRequest::getBody, DeleteImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageGroupRequest, DeleteImageGroupResponse> deleteImageGroup =
        genForDeleteImageGroup();

    private static HttpRequestDef<DeleteImageGroupRequest, DeleteImageGroupResponse> genForDeleteImageGroup() {
        // basic
        HttpRequestDef.Builder<DeleteImageGroupRequest, DeleteImageGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageGroupRequest.class, DeleteImageGroupResponse.class)
                .withName("DeleteImageGroup")
                .withUri("/v1/{project_id}/images/group/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageGroupRequest::getId, DeleteImageGroupRequest::setId));
        builder.<DeleteImageGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteImageGroupRequestBody.class),
            f -> f.withMarshaller(DeleteImageGroupRequest::getBody, DeleteImageGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInferApiKeyRequest, DeleteInferApiKeyResponse> deleteInferApiKey =
        genForDeleteInferApiKey();

    private static HttpRequestDef<DeleteInferApiKeyRequest, DeleteInferApiKeyResponse> genForDeleteInferApiKey() {
        // basic
        HttpRequestDef.Builder<DeleteInferApiKeyRequest, DeleteInferApiKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInferApiKeyRequest.class, DeleteInferApiKeyResponse.class)
                .withName("DeleteInferApiKey")
                .withUri("/v2/{project_id}/services/api-keys/{key_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferApiKeyRequest::getKeyId, DeleteInferApiKeyRequest::setKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInferDeploymentRequest, DeleteInferDeploymentResponse> deleteInferDeployment =
        genForDeleteInferDeployment();

    private static HttpRequestDef<DeleteInferDeploymentRequest, DeleteInferDeploymentResponse> genForDeleteInferDeployment() {
        // basic
        HttpRequestDef.Builder<DeleteInferDeploymentRequest, DeleteInferDeploymentResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInferDeploymentRequest.class, DeleteInferDeploymentResponse.class)
            .withName("DeleteInferDeployment")
            .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentRequest::getServiceId,
                DeleteInferDeploymentRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentRequest::getDeploymentId,
                DeleteInferDeploymentRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInferDeploymentInstanceRequest, DeleteInferDeploymentInstanceResponse> deleteInferDeploymentInstance =
        genForDeleteInferDeploymentInstance();

    private static HttpRequestDef<DeleteInferDeploymentInstanceRequest, DeleteInferDeploymentInstanceResponse> genForDeleteInferDeploymentInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInferDeploymentInstanceRequest, DeleteInferDeploymentInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInferDeploymentInstanceRequest.class,
                    DeleteInferDeploymentInstanceResponse.class)
                .withName("DeleteInferDeploymentInstance")
                .withUri("/v2/{project_id}/services/{id}/deployments/{deployment_name}/instances/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentInstanceRequest::getId,
                DeleteInferDeploymentInstanceRequest::setId));
        builder.<String>withRequestField("deployment_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentInstanceRequest::getDeploymentName,
                DeleteInferDeploymentInstanceRequest::setDeploymentName));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentInstanceRequest::getName,
                DeleteInferDeploymentInstanceRequest::setName));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteInferDeploymentInstanceRequest::getForce,
                DeleteInferDeploymentInstanceRequest::setForce));
        builder.<String>withRequestField("operation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentInstanceRequest::getOperation,
                DeleteInferDeploymentInstanceRequest::setOperation));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInferDeploymentPodRequest, DeleteInferDeploymentPodResponse> deleteInferDeploymentPod =
        genForDeleteInferDeploymentPod();

    private static HttpRequestDef<DeleteInferDeploymentPodRequest, DeleteInferDeploymentPodResponse> genForDeleteInferDeploymentPod() {
        // basic
        HttpRequestDef.Builder<DeleteInferDeploymentPodRequest, DeleteInferDeploymentPodResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInferDeploymentPodRequest.class,
                    DeleteInferDeploymentPodResponse.class)
                .withName("DeleteInferDeploymentPod")
                .withUri(
                    "/v2/{project_id}/services/{id}/deployments/{deployment_name}/instances/{instance_name}/pods/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentPodRequest::getId, DeleteInferDeploymentPodRequest::setId));
        builder.<String>withRequestField("deployment_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentPodRequest::getDeploymentName,
                DeleteInferDeploymentPodRequest::setDeploymentName));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentPodRequest::getInstanceName,
                DeleteInferDeploymentPodRequest::setInstanceName));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentPodRequest::getName, DeleteInferDeploymentPodRequest::setName));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteInferDeploymentPodRequest::getForce,
                DeleteInferDeploymentPodRequest::setForce));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInferDeploymentVersionRequest, DeleteInferDeploymentVersionResponse> deleteInferDeploymentVersion =
        genForDeleteInferDeploymentVersion();

    private static HttpRequestDef<DeleteInferDeploymentVersionRequest, DeleteInferDeploymentVersionResponse> genForDeleteInferDeploymentVersion() {
        // basic
        HttpRequestDef.Builder<DeleteInferDeploymentVersionRequest, DeleteInferDeploymentVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInferDeploymentVersionRequest.class,
                    DeleteInferDeploymentVersionResponse.class)
                .withName("DeleteInferDeploymentVersion")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentVersionRequest::getServiceId,
                DeleteInferDeploymentVersionRequest::setServiceId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentVersionRequest::getVersion,
                DeleteInferDeploymentVersionRequest::setVersion));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentVersionRequest::getDeploymentId,
                DeleteInferDeploymentVersionRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInferServiceTagRequest, DeleteInferServiceTagResponse> deleteInferServiceTag =
        genForDeleteInferServiceTag();

    private static HttpRequestDef<DeleteInferServiceTagRequest, DeleteInferServiceTagResponse> genForDeleteInferServiceTag() {
        // basic
        HttpRequestDef.Builder<DeleteInferServiceTagRequest, DeleteInferServiceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInferServiceTagRequest.class, DeleteInferServiceTagResponse.class)
            .withName("DeleteInferServiceTag")
            .withUri("/v2/{project_id}/modelarts-service-v2/{resource_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferServiceTagRequest::getResourceId,
                DeleteInferServiceTagRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferServiceTagRequest::getWorkspaceId,
                DeleteInferServiceTagRequest::setWorkspaceId));
        builder.<DeleteInferTmsTagsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInferTmsTagsRequest.class),
            f -> f.withMarshaller(DeleteInferServiceTagRequest::getBody, DeleteInferServiceTagRequest::setBody));

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

    public static final HttpRequestDef<DetachDynamicStorageRequest, DetachDynamicStorageResponse> detachDynamicStorage =
        genForDetachDynamicStorage();

    private static HttpRequestDef<DetachDynamicStorageRequest, DetachDynamicStorageResponse> genForDetachDynamicStorage() {
        // basic
        HttpRequestDef.Builder<DetachDynamicStorageRequest, DetachDynamicStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DetachDynamicStorageRequest.class, DetachDynamicStorageResponse.class)
            .withName("DetachDynamicStorage")
            .withUri("/v1/{project_id}/notebooks/{instance_id}/storage/{storage_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachDynamicStorageRequest::getInstanceId,
                DetachDynamicStorageRequest::setInstanceId));
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachDynamicStorageRequest::getStorageId,
                DetachDynamicStorageRequest::setStorageId));

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

    public static final HttpRequestDef<GetHyperinstanceOperationRequest, GetHyperinstanceOperationResponse> getHyperinstanceOperation =
        genForGetHyperinstanceOperation();

    private static HttpRequestDef<GetHyperinstanceOperationRequest, GetHyperinstanceOperationResponse> genForGetHyperinstanceOperation() {
        // basic
        HttpRequestDef.Builder<GetHyperinstanceOperationRequest, GetHyperinstanceOperationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetHyperinstanceOperationRequest.class,
                    GetHyperinstanceOperationResponse.class)
                .withName("GetHyperinstanceOperation")
                .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/operation/{operation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetHyperinstanceOperationRequest::getId, GetHyperinstanceOperationRequest::setId));
        builder.<String>withRequestField("operation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetHyperinstanceOperationRequest::getOperationId,
                GetHyperinstanceOperationRequest::setOperationId));

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

    public static final HttpRequestDef<ListDynamicStoragesRequest, ListDynamicStoragesResponse> listDynamicStorages =
        genForListDynamicStorages();

    private static HttpRequestDef<ListDynamicStoragesRequest, ListDynamicStoragesResponse> genForListDynamicStorages() {
        // basic
        HttpRequestDef.Builder<ListDynamicStoragesRequest, ListDynamicStoragesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDynamicStoragesRequest.class, ListDynamicStoragesResponse.class)
                .withName("ListDynamicStorages")
                .withUri("/v1/{project_id}/notebooks/{instance_id}/storage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDynamicStoragesRequest::getInstanceId,
                ListDynamicStoragesRequest::setInstanceId));

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

    public static final HttpRequestDef<ListImageRequest, ListImageResponse> listImage = genForListImage();

    private static HttpRequestDef<ListImageRequest, ListImageResponse> genForListImage() {
        // basic
        HttpRequestDef.Builder<ListImageRequest, ListImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageRequest.class, ListImageResponse.class)
                .withName("ListImage")
                .withUri("/v1/{project_id}/images")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRequest::getLimit, ListImageRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getName, ListImageRequest::setName));
        builder.<Boolean>withRequestField("name_fuzzy_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListImageRequest::getNameFuzzyMatch, ListImageRequest::setNameFuzzyMatch));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getNamespace, ListImageRequest::setNamespace));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRequest::getOffset, ListImageRequest::setOffset));
        builder.<ListImageRequest.ServiceTypeEnum>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImageRequest.ServiceTypeEnum.class),
            f -> f.withMarshaller(ListImageRequest::getServiceType, ListImageRequest::setServiceType));
        builder.<ListImageRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImageRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListImageRequest::getSortDir, ListImageRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getSortKey, ListImageRequest::setSortKey));
        builder.<ListImageRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImageRequest.TypeEnum.class),
            f -> f.withMarshaller(ListImageRequest::getType, ListImageRequest::setType));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getWorkspaceId, ListImageRequest::setWorkspaceId));
        builder.<String>withRequestField("show_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getShowName, ListImageRequest::setShowName));
        builder.<String>withRequestField("show_tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getShowTag, ListImageRequest::setShowTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageGroupRequest, ListImageGroupResponse> listImageGroup =
        genForListImageGroup();

    private static HttpRequestDef<ListImageGroupRequest, ListImageGroupResponse> genForListImageGroup() {
        // basic
        HttpRequestDef.Builder<ListImageGroupRequest, ListImageGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageGroupRequest.class, ListImageGroupResponse.class)
                .withName("ListImageGroup")
                .withUri("/v1/{project_id}/images/group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageGroupRequest::getName, ListImageGroupRequest::setName));
        builder.<Boolean>withRequestField("name_fuzzy_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListImageGroupRequest::getNameFuzzyMatch, ListImageGroupRequest::setNameFuzzyMatch));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageGroupRequest::getNamespace, ListImageGroupRequest::setNamespace));
        builder.<ListImageGroupRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImageGroupRequest.TypeEnum.class),
            f -> f.withMarshaller(ListImageGroupRequest::getType, ListImageGroupRequest::setType));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageGroupRequest::getWorkspaceId, ListImageGroupRequest::setWorkspaceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageGroupRequest::getLimit, ListImageGroupRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageGroupRequest::getOffset, ListImageGroupRequest::setOffset));
        builder.<String>withRequestField("swr_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageGroupRequest::getSwrInstanceId, ListImageGroupRequest::setSwrInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferApiKeysRequest, ListInferApiKeysResponse> listInferApiKeys =
        genForListInferApiKeys();

    private static HttpRequestDef<ListInferApiKeysRequest, ListInferApiKeysResponse> genForListInferApiKeys() {
        // basic
        HttpRequestDef.Builder<ListInferApiKeysRequest, ListInferApiKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInferApiKeysRequest.class, ListInferApiKeysResponse.class)
                .withName("ListInferApiKeys")
                .withUri("/v2/{project_id}/services/api-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getScope, ListInferApiKeysRequest::setScope));
        builder.<String>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getServiceId, ListInferApiKeysRequest::setServiceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getName, ListInferApiKeysRequest::setName));
        builder.<String>withRequestField("service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getServiceName, ListInferApiKeysRequest::setServiceName));
        builder.<String>withRequestField("key_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getKeyId, ListInferApiKeysRequest::setKeyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getLimit, ListInferApiKeysRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getOffset, ListInferApiKeysRequest::setOffset));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getWorkspaceId, ListInferApiKeysRequest::setWorkspaceId));
        builder.<Boolean>withRequestField("with_user_scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInferApiKeysRequest::getWithUserScope,
                ListInferApiKeysRequest::setWithUserScope));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferClusterFlavorsRequest, ListInferClusterFlavorsResponse> listInferClusterFlavors =
        genForListInferClusterFlavors();

    private static HttpRequestDef<ListInferClusterFlavorsRequest, ListInferClusterFlavorsResponse> genForListInferClusterFlavors() {
        // basic
        HttpRequestDef.Builder<ListInferClusterFlavorsRequest, ListInferClusterFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInferClusterFlavorsRequest.class, ListInferClusterFlavorsResponse.class)
            .withName("ListInferClusterFlavors")
            .withUri("/v2/{project_id}/services/flavors")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferClusterFlavorsRequest::getFlavorType,
                ListInferClusterFlavorsRequest::setFlavorType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferClusterFlavorsRequest::getLimit, ListInferClusterFlavorsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferClusterFlavorsRequest::getOffset,
                ListInferClusterFlavorsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferDeploymentInstancesRequest, ListInferDeploymentInstancesResponse> listInferDeploymentInstances =
        genForListInferDeploymentInstances();

    private static HttpRequestDef<ListInferDeploymentInstancesRequest, ListInferDeploymentInstancesResponse> genForListInferDeploymentInstances() {
        // basic
        HttpRequestDef.Builder<ListInferDeploymentInstancesRequest, ListInferDeploymentInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInferDeploymentInstancesRequest.class,
                    ListInferDeploymentInstancesResponse.class)
                .withName("ListInferDeploymentInstances")
                .withUri("/v2/{project_id}/services/{id}/deployments/{name}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentInstancesRequest::getId,
                ListInferDeploymentInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentInstancesRequest::getName,
                ListInferDeploymentInstancesRequest::setName));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInferDeploymentInstancesRequest::getStatus,
                ListInferDeploymentInstancesRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferDeploymentInstancesRequest::getLimit,
                ListInferDeploymentInstancesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentInstancesRequest::getOffset,
                ListInferDeploymentInstancesRequest::setOffset));
        builder.<String>withRequestField("pod_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentInstancesRequest::getPodName,
                ListInferDeploymentInstancesRequest::setPodName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferDeploymentPodEventsRequest, ListInferDeploymentPodEventsResponse> listInferDeploymentPodEvents =
        genForListInferDeploymentPodEvents();

    private static HttpRequestDef<ListInferDeploymentPodEventsRequest, ListInferDeploymentPodEventsResponse> genForListInferDeploymentPodEvents() {
        // basic
        HttpRequestDef.Builder<ListInferDeploymentPodEventsRequest, ListInferDeploymentPodEventsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInferDeploymentPodEventsRequest.class,
                    ListInferDeploymentPodEventsResponse.class)
                .withName("ListInferDeploymentPodEvents")
                .withUri(
                    "/v2/{project_id}/services/{id}/deployments/{deployment_name}/instances/{instance_name}/pods/{name}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodEventsRequest::getId,
                ListInferDeploymentPodEventsRequest::setId));
        builder.<String>withRequestField("deployment_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodEventsRequest::getDeploymentName,
                ListInferDeploymentPodEventsRequest::setDeploymentName));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodEventsRequest::getInstanceName,
                ListInferDeploymentPodEventsRequest::setInstanceName));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodEventsRequest::getName,
                ListInferDeploymentPodEventsRequest::setName));

        // response
        builder.<List<ServicePodEventResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListInferDeploymentPodEventsResponse::getBody,
                    ListInferDeploymentPodEventsResponse::setBody)
                .withInnerContainerType(ServicePodEventResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListInferDeploymentPodsRequest, ListInferDeploymentPodsResponse> listInferDeploymentPods =
        genForListInferDeploymentPods();

    private static HttpRequestDef<ListInferDeploymentPodsRequest, ListInferDeploymentPodsResponse> genForListInferDeploymentPods() {
        // basic
        HttpRequestDef.Builder<ListInferDeploymentPodsRequest, ListInferDeploymentPodsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInferDeploymentPodsRequest.class, ListInferDeploymentPodsResponse.class)
            .withName("ListInferDeploymentPods")
            .withUri("/v2/{project_id}/services/{id}/deployments/{deployment_name}/instances/{name}/pods")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getId, ListInferDeploymentPodsRequest::setId));
        builder.<String>withRequestField("deployment_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getDeploymentName,
                ListInferDeploymentPodsRequest::setDeploymentName));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getName, ListInferDeploymentPodsRequest::setName));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getStatus,
                ListInferDeploymentPodsRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getLimit, ListInferDeploymentPodsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getOffset,
                ListInferDeploymentPodsRequest::setOffset));
        builder.<String>withRequestField("pod_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getPodName,
                ListInferDeploymentPodsRequest::setPodName));
        builder.<String>withRequestField("pod_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getPodId, ListInferDeploymentPodsRequest::setPodId));
        builder.<String>withRequestField("pod_node_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getPodNodeIp,
                ListInferDeploymentPodsRequest::setPodNodeIp));
        builder.<String>withRequestField("pod_node_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentPodsRequest::getPodNodeName,
                ListInferDeploymentPodsRequest::setPodNodeName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferDeploymentVersionsRequest, ListInferDeploymentVersionsResponse> listInferDeploymentVersions =
        genForListInferDeploymentVersions();

    private static HttpRequestDef<ListInferDeploymentVersionsRequest, ListInferDeploymentVersionsResponse> genForListInferDeploymentVersions() {
        // basic
        HttpRequestDef.Builder<ListInferDeploymentVersionsRequest, ListInferDeploymentVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInferDeploymentVersionsRequest.class,
                    ListInferDeploymentVersionsResponse.class)
                .withName("ListInferDeploymentVersions")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentVersionsRequest::getServiceId,
                ListInferDeploymentVersionsRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentVersionsRequest::getDeploymentId,
                ListInferDeploymentVersionsRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferDeploymentsRequest, ListInferDeploymentsResponse> listInferDeployments =
        genForListInferDeployments();

    private static HttpRequestDef<ListInferDeploymentsRequest, ListInferDeploymentsResponse> genForListInferDeployments() {
        // basic
        HttpRequestDef.Builder<ListInferDeploymentsRequest, ListInferDeploymentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInferDeploymentsRequest.class, ListInferDeploymentsResponse.class)
            .withName("ListInferDeployments")
            .withUri("/v2/{project_id}/services/{service_id}/deployments")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentsRequest::getServiceId,
                ListInferDeploymentsRequest::setServiceId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentsRequest::getSortKey, ListInferDeploymentsRequest::setSortKey));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentsRequest::getStatus, ListInferDeploymentsRequest::setStatus));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentsRequest::getSortDir, ListInferDeploymentsRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferDeploymentsRequest::getLimit, ListInferDeploymentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferDeploymentsRequest::getOffset, ListInferDeploymentsRequest::setOffset));
        builder.<Integer>withRequestField("delete_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferDeploymentsRequest::getDeleteAfter,
                ListInferDeploymentsRequest::setDeleteAfter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferIntranetConnectionApplicationsRequest, ListInferIntranetConnectionApplicationsResponse> listInferIntranetConnectionApplications =
        genForListInferIntranetConnectionApplications();

    private static HttpRequestDef<ListInferIntranetConnectionApplicationsRequest, ListInferIntranetConnectionApplicationsResponse> genForListInferIntranetConnectionApplications() {
        // basic
        HttpRequestDef.Builder<ListInferIntranetConnectionApplicationsRequest, ListInferIntranetConnectionApplicationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInferIntranetConnectionApplicationsRequest.class,
                    ListInferIntranetConnectionApplicationsResponse.class)
                .withName("ListInferIntranetConnectionApplications")
                .withUri("/v2/{project_id}/intranet-connection/requests")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getScene,
                ListInferIntranetConnectionApplicationsRequest::setScene));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getStatus,
                ListInferIntranetConnectionApplicationsRequest::setStatus));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getId,
                ListInferIntranetConnectionApplicationsRequest::setId));
        builder.<String>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getServiceId,
                ListInferIntranetConnectionApplicationsRequest::setServiceId));
        builder.<String>withRequestField("service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getServiceName,
                ListInferIntranetConnectionApplicationsRequest::setServiceName));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getVpcId,
                ListInferIntranetConnectionApplicationsRequest::setVpcId));
        builder.<String>withRequestField("vpc_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getVpcName,
                ListInferIntranetConnectionApplicationsRequest::setVpcName));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getPoolId,
                ListInferIntranetConnectionApplicationsRequest::setPoolId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getOffset,
                ListInferIntranetConnectionApplicationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getLimit,
                ListInferIntranetConnectionApplicationsRequest::setLimit));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getWorkspaceId,
                ListInferIntranetConnectionApplicationsRequest::setWorkspaceId));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getSortDir,
                ListInferIntranetConnectionApplicationsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionApplicationsRequest::getSortKey,
                ListInferIntranetConnectionApplicationsRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferIntranetConnectionReviewsRequest, ListInferIntranetConnectionReviewsResponse> listInferIntranetConnectionReviews =
        genForListInferIntranetConnectionReviews();

    private static HttpRequestDef<ListInferIntranetConnectionReviewsRequest, ListInferIntranetConnectionReviewsResponse> genForListInferIntranetConnectionReviews() {
        // basic
        HttpRequestDef.Builder<ListInferIntranetConnectionReviewsRequest, ListInferIntranetConnectionReviewsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInferIntranetConnectionReviewsRequest.class,
                    ListInferIntranetConnectionReviewsResponse.class)
                .withName("ListInferIntranetConnectionReviews")
                .withUri("/v2/{project_id}/intranet-connection/reviews")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getScene,
                ListInferIntranetConnectionReviewsRequest::setScene));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getId,
                ListInferIntranetConnectionReviewsRequest::setId));
        builder.<String>withRequestField("applicant_domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getApplicantDomainId,
                ListInferIntranetConnectionReviewsRequest::setApplicantDomainId));
        builder.<String>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getServiceId,
                ListInferIntranetConnectionReviewsRequest::setServiceId));
        builder.<String>withRequestField("applicant_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getApplicantUserName,
                ListInferIntranetConnectionReviewsRequest::setApplicantUserName));
        builder.<String>withRequestField("service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getServiceName,
                ListInferIntranetConnectionReviewsRequest::setServiceName));
        builder.<String>withRequestField("vpc_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getVpcName,
                ListInferIntranetConnectionReviewsRequest::setVpcName));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getVpcId,
                ListInferIntranetConnectionReviewsRequest::setVpcId));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getPoolId,
                ListInferIntranetConnectionReviewsRequest::setPoolId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getSortKey,
                ListInferIntranetConnectionReviewsRequest::setSortKey));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getLimit,
                ListInferIntranetConnectionReviewsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getOffset,
                ListInferIntranetConnectionReviewsRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getStatus,
                ListInferIntranetConnectionReviewsRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferIntranetConnectionReviewsRequest::getType,
                ListInferIntranetConnectionReviewsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferServiceEventsRequest, ListInferServiceEventsResponse> listInferServiceEvents =
        genForListInferServiceEvents();

    private static HttpRequestDef<ListInferServiceEventsRequest, ListInferServiceEventsResponse> genForListInferServiceEvents() {
        // basic
        HttpRequestDef.Builder<ListInferServiceEventsRequest, ListInferServiceEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInferServiceEventsRequest.class, ListInferServiceEventsResponse.class)
            .withName("ListInferServiceEvents")
            .withUri("/v2/{project_id}/services/{service_id}/events")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getServiceId,
                ListInferServiceEventsRequest::setServiceId));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getEventType,
                ListInferServiceEventsRequest::setEventType));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getStartTime,
                ListInferServiceEventsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getEndTime,
                ListInferServiceEventsRequest::setEndTime));
        builder.<String>withRequestField("event_info_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getEventInfoKey,
                ListInferServiceEventsRequest::setEventInfoKey));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getLimit, ListInferServiceEventsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getOffset, ListInferServiceEventsRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getSortKey,
                ListInferServiceEventsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServiceEventsRequest::getSortDir,
                ListInferServiceEventsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferServiceTagsRequest, ListInferServiceTagsResponse> listInferServiceTags =
        genForListInferServiceTags();

    private static HttpRequestDef<ListInferServiceTagsRequest, ListInferServiceTagsResponse> genForListInferServiceTags() {
        // basic
        HttpRequestDef.Builder<ListInferServiceTagsRequest, ListInferServiceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInferServiceTagsRequest.class, ListInferServiceTagsResponse.class)
            .withName("ListInferServiceTags")
            .withUri("/v2/{project_id}/modelarts-service-v2/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServiceTagsRequest::getWorkspaceId,
                ListInferServiceTagsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferServicesRequest, ListInferServicesResponse> listInferServices =
        genForListInferServices();

    private static HttpRequestDef<ListInferServicesRequest, ListInferServicesResponse> genForListInferServices() {
        // basic
        HttpRequestDef.Builder<ListInferServicesRequest, ListInferServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInferServicesRequest.class, ListInferServicesResponse.class)
                .withName("ListInferServices")
                .withUri("/v2/{project_id}/services")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getId, ListInferServicesRequest::setId));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getPoolId, ListInferServicesRequest::setPoolId));
        builder.<String>withRequestField("pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getPoolName, ListInferServicesRequest::setPoolName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getSortKey, ListInferServicesRequest::setSortKey));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getStatus, ListInferServicesRequest::setStatus));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getName, ListInferServicesRequest::setName));
        builder.<String>withRequestField("auth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getAuthType, ListInferServicesRequest::setAuthType));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getType, ListInferServicesRequest::setType));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getDescription, ListInferServicesRequest::setDescription));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getWorkspaceId, ListInferServicesRequest::setWorkspaceId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getUserName, ListInferServicesRequest::setUserName));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getTags, ListInferServicesRequest::setTags));
        builder.<String>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getAssetId, ListInferServicesRequest::setAssetId));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesRequest::getSortDir, ListInferServicesRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferServicesRequest::getLimit, ListInferServicesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferServicesRequest::getOffset, ListInferServicesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferServicesByTagsRequest, ListInferServicesByTagsResponse> listInferServicesByTags =
        genForListInferServicesByTags();

    private static HttpRequestDef<ListInferServicesByTagsRequest, ListInferServicesByTagsResponse> genForListInferServicesByTags() {
        // basic
        HttpRequestDef.Builder<ListInferServicesByTagsRequest, ListInferServicesByTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListInferServicesByTagsRequest.class, ListInferServicesByTagsResponse.class)
            .withName("ListInferServicesByTags")
            .withUri("/v2/{project_id}/modelarts-service-v2/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferServicesByTagsRequest::getLimit, ListInferServicesByTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferServicesByTagsRequest::getOffset,
                ListInferServicesByTagsRequest::setOffset));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferServicesByTagsRequest::getWorkspaceId,
                ListInferServicesByTagsRequest::setWorkspaceId));
        builder.<QueryTmsResourceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTmsResourceRequest.class),
            f -> f.withMarshaller(ListInferServicesByTagsRequest::getBody, ListInferServicesByTagsRequest::setBody));

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

    public static final HttpRequestDef<ModifyInferIntranetConnectionsRequest, ModifyInferIntranetConnectionsResponse> modifyInferIntranetConnections =
        genForModifyInferIntranetConnections();

    private static HttpRequestDef<ModifyInferIntranetConnectionsRequest, ModifyInferIntranetConnectionsResponse> genForModifyInferIntranetConnections() {
        // basic
        HttpRequestDef.Builder<ModifyInferIntranetConnectionsRequest, ModifyInferIntranetConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ModifyInferIntranetConnectionsRequest.class,
                    ModifyInferIntranetConnectionsResponse.class)
                .withName("ModifyInferIntranetConnections")
                .withUri("/v2/{project_id}/intranet-connection/{id}/modify")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyInferIntranetConnectionsRequest::getId,
                ModifyInferIntranetConnectionsRequest::setId));
        builder.<IntranetConnectionModifyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IntranetConnectionModifyRequest.class),
            f -> f.withMarshaller(ModifyInferIntranetConnectionsRequest::getBody,
                ModifyInferIntranetConnectionsRequest::setBody));

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

    public static final HttpRequestDef<RegisterImageRequest, RegisterImageResponse> registerImage =
        genForRegisterImage();

    private static HttpRequestDef<RegisterImageRequest, RegisterImageResponse> genForRegisterImage() {
        // basic
        HttpRequestDef.Builder<RegisterImageRequest, RegisterImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterImageRequest.class, RegisterImageResponse.class)
                .withName("RegisterImage")
                .withUri("/v1/{project_id}/images")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageRegRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageRegRequest.class),
            f -> f.withMarshaller(RegisterImageRequest::getBody, RegisterImageRequest::setBody));

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

    public static final HttpRequestDef<ShowDynamicStorageRequest, ShowDynamicStorageResponse> showDynamicStorage =
        genForShowDynamicStorage();

    private static HttpRequestDef<ShowDynamicStorageRequest, ShowDynamicStorageResponse> genForShowDynamicStorage() {
        // basic
        HttpRequestDef.Builder<ShowDynamicStorageRequest, ShowDynamicStorageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDynamicStorageRequest.class, ShowDynamicStorageResponse.class)
                .withName("ShowDynamicStorage")
                .withUri("/v1/{project_id}/notebooks/{instance_id}/storage/{storage_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDynamicStorageRequest::getInstanceId, ShowDynamicStorageRequest::setInstanceId));
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDynamicStorageRequest::getStorageId, ShowDynamicStorageRequest::setStorageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageRequest, ShowImageResponse> showImage = genForShowImage();

    private static HttpRequestDef<ShowImageRequest, ShowImageResponse> genForShowImage() {
        // basic
        HttpRequestDef.Builder<ShowImageRequest, ShowImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageRequest.class, ShowImageResponse.class)
                .withName("ShowImage")
                .withUri("/v1/{project_id}/images/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageRequest::getId, ShowImageRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInferDeploymentRequest, ShowInferDeploymentResponse> showInferDeployment =
        genForShowInferDeployment();

    private static HttpRequestDef<ShowInferDeploymentRequest, ShowInferDeploymentResponse> genForShowInferDeployment() {
        // basic
        HttpRequestDef.Builder<ShowInferDeploymentRequest, ShowInferDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInferDeploymentRequest.class, ShowInferDeploymentResponse.class)
                .withName("ShowInferDeployment")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferDeploymentRequest::getServiceId, ShowInferDeploymentRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferDeploymentRequest::getDeploymentId,
                ShowInferDeploymentRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInferDeploymentVersionRequest, ShowInferDeploymentVersionResponse> showInferDeploymentVersion =
        genForShowInferDeploymentVersion();

    private static HttpRequestDef<ShowInferDeploymentVersionRequest, ShowInferDeploymentVersionResponse> genForShowInferDeploymentVersion() {
        // basic
        HttpRequestDef.Builder<ShowInferDeploymentVersionRequest, ShowInferDeploymentVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInferDeploymentVersionRequest.class,
                    ShowInferDeploymentVersionResponse.class)
                .withName("ShowInferDeploymentVersion")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferDeploymentVersionRequest::getServiceId,
                ShowInferDeploymentVersionRequest::setServiceId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferDeploymentVersionRequest::getVersion,
                ShowInferDeploymentVersionRequest::setVersion));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferDeploymentVersionRequest::getDeploymentId,
                ShowInferDeploymentVersionRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInferServiceRequest, ShowInferServiceResponse> showInferService =
        genForShowInferService();

    private static HttpRequestDef<ShowInferServiceRequest, ShowInferServiceResponse> genForShowInferService() {
        // basic
        HttpRequestDef.Builder<ShowInferServiceRequest, ShowInferServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInferServiceRequest.class, ShowInferServiceResponse.class)
                .withName("ShowInferService")
                .withUri("/v2/{project_id}/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferServiceRequest::getServiceId, ShowInferServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInferServiceClusterRequest, ShowInferServiceClusterResponse> showInferServiceCluster =
        genForShowInferServiceCluster();

    private static HttpRequestDef<ShowInferServiceClusterRequest, ShowInferServiceClusterResponse> genForShowInferServiceCluster() {
        // basic
        HttpRequestDef.Builder<ShowInferServiceClusterRequest, ShowInferServiceClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInferServiceClusterRequest.class, ShowInferServiceClusterResponse.class)
            .withName("ShowInferServiceCluster")
            .withUri("/v2/{project_id}/services/clusters/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferServiceClusterRequest::getId, ShowInferServiceClusterRequest::setId));
        builder.<String>withRequestField("X-User-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferServiceClusterRequest::getXUserToken,
                ShowInferServiceClusterRequest::setXUserToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInferServiceTagsRequest, ShowInferServiceTagsResponse> showInferServiceTags =
        genForShowInferServiceTags();

    private static HttpRequestDef<ShowInferServiceTagsRequest, ShowInferServiceTagsResponse> genForShowInferServiceTags() {
        // basic
        HttpRequestDef.Builder<ShowInferServiceTagsRequest, ShowInferServiceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInferServiceTagsRequest.class, ShowInferServiceTagsResponse.class)
            .withName("ShowInferServiceTags")
            .withUri("/v2/{project_id}/modelarts-service-v2/{resource_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferServiceTagsRequest::getResourceId,
                ShowInferServiceTagsRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferServiceTagsRequest::getWorkspaceId,
                ShowInferServiceTagsRequest::setWorkspaceId));

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
            .withUri("/v1/{project_id}/networks/{network_name}/network-ip-availabilities")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkAvailableIpRequest::getNetworkName,
                ShowNetworkAvailableIpRequest::setNetworkName));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
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

    public static final HttpRequestDef<ShowPoolNodeRequest, ShowPoolNodeResponse> showPoolNode = genForShowPoolNode();

    private static HttpRequestDef<ShowPoolNodeRequest, ShowPoolNodeResponse> genForShowPoolNode() {
        // basic
        HttpRequestDef.Builder<ShowPoolNodeRequest, ShowPoolNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolNodeRequest.class, ShowPoolNodeResponse.class)
                .withName("ShowPoolNode")
                .withUri("/v2/{project_id}/pools/{pool_name}/nodes/{node_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolNodeRequest::getPoolName, ShowPoolNodeRequest::setPoolName));
        builder.<String>withRequestField("node_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolNodeRequest::getNodeName, ShowPoolNodeRequest::setNodeName));

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

    public static final HttpRequestDef<StartInferDeploymentRequest, StartInferDeploymentResponse> startInferDeployment =
        genForStartInferDeployment();

    private static HttpRequestDef<StartInferDeploymentRequest, StartInferDeploymentResponse> genForStartInferDeployment() {
        // basic
        HttpRequestDef.Builder<StartInferDeploymentRequest, StartInferDeploymentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartInferDeploymentRequest.class, StartInferDeploymentResponse.class)
            .withName("StartInferDeployment")
            .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/start")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInferDeploymentRequest::getServiceId,
                StartInferDeploymentRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInferDeploymentRequest::getDeploymentId,
                StartInferDeploymentRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInferServiceRequest, StartInferServiceResponse> startInferService =
        genForStartInferService();

    private static HttpRequestDef<StartInferServiceRequest, StartInferServiceResponse> genForStartInferService() {
        // basic
        HttpRequestDef.Builder<StartInferServiceRequest, StartInferServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartInferServiceRequest.class, StartInferServiceResponse.class)
                .withName("StartInferService")
                .withUri("/v2/{project_id}/services/{service_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInferServiceRequest::getServiceId, StartInferServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInferDeploymentRequest, StopInferDeploymentResponse> stopInferDeployment =
        genForStopInferDeployment();

    private static HttpRequestDef<StopInferDeploymentRequest, StopInferDeploymentResponse> genForStopInferDeployment() {
        // basic
        HttpRequestDef.Builder<StopInferDeploymentRequest, StopInferDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopInferDeploymentRequest.class, StopInferDeploymentResponse.class)
                .withName("StopInferDeployment")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInferDeploymentRequest::getServiceId, StopInferDeploymentRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInferDeploymentRequest::getDeploymentId,
                StopInferDeploymentRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInferServiceRequest, StopInferServiceResponse> stopInferService =
        genForStopInferService();

    private static HttpRequestDef<StopInferServiceRequest, StopInferServiceResponse> genForStopInferService() {
        // basic
        HttpRequestDef.Builder<StopInferServiceRequest, StopInferServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopInferServiceRequest.class, StopInferServiceResponse.class)
                .withName("StopInferService")
                .withUri("/v2/{project_id}/services/{service_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInferServiceRequest::getServiceId, StopInferServiceRequest::setServiceId));

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

    public static final HttpRequestDef<SwitchInferDeploymentVersionRequest, SwitchInferDeploymentVersionResponse> switchInferDeploymentVersion =
        genForSwitchInferDeploymentVersion();

    private static HttpRequestDef<SwitchInferDeploymentVersionRequest, SwitchInferDeploymentVersionResponse> genForSwitchInferDeploymentVersion() {
        // basic
        HttpRequestDef.Builder<SwitchInferDeploymentVersionRequest, SwitchInferDeploymentVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SwitchInferDeploymentVersionRequest.class,
                    SwitchInferDeploymentVersionResponse.class)
                .withName("SwitchInferDeploymentVersion")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/versions/{version}/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchInferDeploymentVersionRequest::getServiceId,
                SwitchInferDeploymentVersionRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchInferDeploymentVersionRequest::getDeploymentId,
                SwitchInferDeploymentVersionRequest::setDeploymentId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchInferDeploymentVersionRequest::getVersion,
                SwitchInferDeploymentVersionRequest::setVersion));
        builder.<SwitchInferDeploymentVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchInferDeploymentVersionRequestBody.class),
            f -> f.withMarshaller(SwitchInferDeploymentVersionRequest::getBody,
                SwitchInferDeploymentVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncImageRequest, SyncImageResponse> syncImage = genForSyncImage();

    private static HttpRequestDef<SyncImageRequest, SyncImageResponse> genForSyncImage() {
        // basic
        HttpRequestDef.Builder<SyncImageRequest, SyncImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncImageRequest.class, SyncImageResponse.class)
                .withName("SyncImage")
                .withUri("/v1/{project_id}/images/{image_id}/sync")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncImageRequest::getImageId, SyncImageRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnbindInferApiKeyRequest, UnbindInferApiKeyResponse> unbindInferApiKey =
        genForUnbindInferApiKey();

    private static HttpRequestDef<UnbindInferApiKeyRequest, UnbindInferApiKeyResponse> genForUnbindInferApiKey() {
        // basic
        HttpRequestDef.Builder<UnbindInferApiKeyRequest, UnbindInferApiKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnbindInferApiKeyRequest.class, UnbindInferApiKeyResponse.class)
                .withName("UnbindInferApiKey")
                .withUri("/v2/{project_id}/services/{service_id}/api-keys/{key_id}/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindInferApiKeyRequest::getServiceId, UnbindInferApiKeyRequest::setServiceId));
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindInferApiKeyRequest::getKeyId, UnbindInferApiKeyRequest::setKeyId));

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

    public static final HttpRequestDef<UpdateImageGroupRequest, UpdateImageGroupResponse> updateImageGroup =
        genForUpdateImageGroup();

    private static HttpRequestDef<UpdateImageGroupRequest, UpdateImageGroupResponse> genForUpdateImageGroup() {
        // basic
        HttpRequestDef.Builder<UpdateImageGroupRequest, UpdateImageGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateImageGroupRequest.class, UpdateImageGroupResponse.class)
                .withName("UpdateImageGroup")
                .withUri("/v1/{project_id}/images/group/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageGroupRequest::getId, UpdateImageGroupRequest::setId));
        builder.<UpdateImageGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateImageGroupRequestBody.class),
            f -> f.withMarshaller(UpdateImageGroupRequest::getBody, UpdateImageGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInferDeploymentRequest, UpdateInferDeploymentResponse> updateInferDeployment =
        genForUpdateInferDeployment();

    private static HttpRequestDef<UpdateInferDeploymentRequest, UpdateInferDeploymentResponse> genForUpdateInferDeployment() {
        // basic
        HttpRequestDef.Builder<UpdateInferDeploymentRequest, UpdateInferDeploymentResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInferDeploymentRequest.class, UpdateInferDeploymentResponse.class)
            .withName("UpdateInferDeployment")
            .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferDeploymentRequest::getServiceId,
                UpdateInferDeploymentRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferDeploymentRequest::getDeploymentId,
                UpdateInferDeploymentRequest::setDeploymentId));
        builder.<GroupConfigUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GroupConfigUpdateRequest.class),
            f -> f.withMarshaller(UpdateInferDeploymentRequest::getBody, UpdateInferDeploymentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInferDeploymentScaleRequest, UpdateInferDeploymentScaleResponse> updateInferDeploymentScale =
        genForUpdateInferDeploymentScale();

    private static HttpRequestDef<UpdateInferDeploymentScaleRequest, UpdateInferDeploymentScaleResponse> genForUpdateInferDeploymentScale() {
        // basic
        HttpRequestDef.Builder<UpdateInferDeploymentScaleRequest, UpdateInferDeploymentScaleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInferDeploymentScaleRequest.class,
                    UpdateInferDeploymentScaleResponse.class)
                .withName("UpdateInferDeploymentScale")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_name}/scale")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferDeploymentScaleRequest::getServiceId,
                UpdateInferDeploymentScaleRequest::setServiceId));
        builder.<String>withRequestField("deployment_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferDeploymentScaleRequest::getDeploymentName,
                UpdateInferDeploymentScaleRequest::setDeploymentName));
        builder.<UpdateInferDeploymentScale>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInferDeploymentScale.class),
            f -> f.withMarshaller(UpdateInferDeploymentScaleRequest::getBody,
                UpdateInferDeploymentScaleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInferIntranetConnectionRequest, UpdateInferIntranetConnectionResponse> updateInferIntranetConnection =
        genForUpdateInferIntranetConnection();

    private static HttpRequestDef<UpdateInferIntranetConnectionRequest, UpdateInferIntranetConnectionResponse> genForUpdateInferIntranetConnection() {
        // basic
        HttpRequestDef.Builder<UpdateInferIntranetConnectionRequest, UpdateInferIntranetConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInferIntranetConnectionRequest.class,
                    UpdateInferIntranetConnectionResponse.class)
                .withName("UpdateInferIntranetConnection")
                .withUri("/v2/{project_id}/intranet-connection/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferIntranetConnectionRequest::getId,
                UpdateInferIntranetConnectionRequest::setId));
        builder.<UpdateIntranetConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateIntranetConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateInferIntranetConnectionRequest::getBody,
                UpdateInferIntranetConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInferServiceRequest, UpdateInferServiceResponse> updateInferService =
        genForUpdateInferService();

    private static HttpRequestDef<UpdateInferServiceRequest, UpdateInferServiceResponse> genForUpdateInferService() {
        // basic
        HttpRequestDef.Builder<UpdateInferServiceRequest, UpdateInferServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInferServiceRequest.class, UpdateInferServiceResponse.class)
                .withName("UpdateInferService")
                .withUri("/v2/{project_id}/services/{service_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferServiceRequest::getServiceId, UpdateInferServiceRequest::setServiceId));
        builder.<ServiceUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServiceUpdateRequest.class),
            f -> f.withMarshaller(UpdateInferServiceRequest::getBody, UpdateInferServiceRequest::setBody));

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

    public static final HttpRequestDef<CreateInferDeploymentHpaRequest, CreateInferDeploymentHpaResponse> createInferDeploymentHpa =
        genForCreateInferDeploymentHpa();

    private static HttpRequestDef<CreateInferDeploymentHpaRequest, CreateInferDeploymentHpaResponse> genForCreateInferDeploymentHpa() {
        // basic
        HttpRequestDef.Builder<CreateInferDeploymentHpaRequest, CreateInferDeploymentHpaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateInferDeploymentHpaRequest.class, CreateInferDeploymentHpaResponse.class)
                .withName("CreateInferDeploymentHpa")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/hpa")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInferDeploymentHpaRequest::getServiceId,
                CreateInferDeploymentHpaRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInferDeploymentHpaRequest::getDeploymentId,
                CreateInferDeploymentHpaRequest::setDeploymentId));
        builder.<CreateHpaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHpaRequestBody.class),
            f -> f.withMarshaller(CreateInferDeploymentHpaRequest::getBody, CreateInferDeploymentHpaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInferDeploymentHpaRequest, DeleteInferDeploymentHpaResponse> deleteInferDeploymentHpa =
        genForDeleteInferDeploymentHpa();

    private static HttpRequestDef<DeleteInferDeploymentHpaRequest, DeleteInferDeploymentHpaResponse> genForDeleteInferDeploymentHpa() {
        // basic
        HttpRequestDef.Builder<DeleteInferDeploymentHpaRequest, DeleteInferDeploymentHpaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInferDeploymentHpaRequest.class,
                    DeleteInferDeploymentHpaResponse.class)
                .withName("DeleteInferDeploymentHpa")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/hpa")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentHpaRequest::getServiceId,
                DeleteInferDeploymentHpaRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInferDeploymentHpaRequest::getDeploymentId,
                DeleteInferDeploymentHpaRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInferDeploymentHpaEventsRequest, ListInferDeploymentHpaEventsResponse> listInferDeploymentHpaEvents =
        genForListInferDeploymentHpaEvents();

    private static HttpRequestDef<ListInferDeploymentHpaEventsRequest, ListInferDeploymentHpaEventsResponse> genForListInferDeploymentHpaEvents() {
        // basic
        HttpRequestDef.Builder<ListInferDeploymentHpaEventsRequest, ListInferDeploymentHpaEventsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInferDeploymentHpaEventsRequest.class,
                    ListInferDeploymentHpaEventsResponse.class)
                .withName("ListInferDeploymentHpaEvents")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/hpa/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentHpaEventsRequest::getServiceId,
                ListInferDeploymentHpaEventsRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentHpaEventsRequest::getDeploymentId,
                ListInferDeploymentHpaEventsRequest::setDeploymentId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferDeploymentHpaEventsRequest::getLimit,
                ListInferDeploymentHpaEventsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInferDeploymentHpaEventsRequest::getOffset,
                ListInferDeploymentHpaEventsRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentHpaEventsRequest::getSortKey,
                ListInferDeploymentHpaEventsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInferDeploymentHpaEventsRequest::getSortDir,
                ListInferDeploymentHpaEventsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInferDeploymentHpaRequest, ShowInferDeploymentHpaResponse> showInferDeploymentHpa =
        genForShowInferDeploymentHpa();

    private static HttpRequestDef<ShowInferDeploymentHpaRequest, ShowInferDeploymentHpaResponse> genForShowInferDeploymentHpa() {
        // basic
        HttpRequestDef.Builder<ShowInferDeploymentHpaRequest, ShowInferDeploymentHpaResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInferDeploymentHpaRequest.class, ShowInferDeploymentHpaResponse.class)
            .withName("ShowInferDeploymentHpa")
            .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/hpa")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferDeploymentHpaRequest::getServiceId,
                ShowInferDeploymentHpaRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferDeploymentHpaRequest::getDeploymentId,
                ShowInferDeploymentHpaRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInferDeploymentHpaRequest, UpdateInferDeploymentHpaResponse> updateInferDeploymentHpa =
        genForUpdateInferDeploymentHpa();

    private static HttpRequestDef<UpdateInferDeploymentHpaRequest, UpdateInferDeploymentHpaResponse> genForUpdateInferDeploymentHpa() {
        // basic
        HttpRequestDef.Builder<UpdateInferDeploymentHpaRequest, UpdateInferDeploymentHpaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateInferDeploymentHpaRequest.class, UpdateInferDeploymentHpaResponse.class)
                .withName("UpdateInferDeploymentHpa")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/hpa")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferDeploymentHpaRequest::getServiceId,
                UpdateInferDeploymentHpaRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferDeploymentHpaRequest::getDeploymentId,
                UpdateInferDeploymentHpaRequest::setDeploymentId));
        builder.<UpdateHpaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHpaRequestBody.class),
            f -> f.withMarshaller(UpdateInferDeploymentHpaRequest::getBody, UpdateInferDeploymentHpaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInferHraRequest, CreateInferHraResponse> createInferHra =
        genForCreateInferHra();

    private static HttpRequestDef<CreateInferHraRequest, CreateInferHraResponse> genForCreateInferHra() {
        // basic
        HttpRequestDef.Builder<CreateInferHraRequest, CreateInferHraResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInferHraRequest.class, CreateInferHraResponse.class)
                .withName("CreateInferHra")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/hra")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInferHraRequest::getServiceId, CreateInferHraRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInferHraRequest::getDeploymentId, CreateInferHraRequest::setDeploymentId));
        builder.<CreateHraRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHraRequestBody.class),
            f -> f.withMarshaller(CreateInferHraRequest::getBody, CreateInferHraRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInferHraRequest, ShowInferHraResponse> showInferHra = genForShowInferHra();

    private static HttpRequestDef<ShowInferHraRequest, ShowInferHraResponse> genForShowInferHra() {
        // basic
        HttpRequestDef.Builder<ShowInferHraRequest, ShowInferHraResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInferHraRequest.class, ShowInferHraResponse.class)
                .withName("ShowInferHra")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/hra")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferHraRequest::getServiceId, ShowInferHraRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInferHraRequest::getDeploymentId, ShowInferHraRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInferHraRequest, UpdateInferHraResponse> updateInferHra =
        genForUpdateInferHra();

    private static HttpRequestDef<UpdateInferHraRequest, UpdateInferHraResponse> genForUpdateInferHra() {
        // basic
        HttpRequestDef.Builder<UpdateInferHraRequest, UpdateInferHraResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInferHraRequest.class, UpdateInferHraResponse.class)
                .withName("UpdateInferHra")
                .withUri("/v2/{project_id}/services/{service_id}/deployments/{deployment_id}/hra")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferHraRequest::getServiceId, UpdateInferHraRequest::setServiceId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInferHraRequest::getDeploymentId, UpdateInferHraRequest::setDeploymentId));
        builder.<UpdateHraRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHraRequestBody.class),
            f -> f.withMarshaller(UpdateInferHraRequest::getBody, UpdateInferHraRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachDevServerVolumeRequest, AttachDevServerVolumeResponse> attachDevServerVolume =
        genForAttachDevServerVolume();

    private static HttpRequestDef<AttachDevServerVolumeRequest, AttachDevServerVolumeResponse> genForAttachDevServerVolume() {
        // basic
        HttpRequestDef.Builder<AttachDevServerVolumeRequest, AttachDevServerVolumeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AttachDevServerVolumeRequest.class, AttachDevServerVolumeResponse.class)
            .withName("AttachDevServerVolume")
            .withUri("/v1/{project_id}/dev-servers/{id}/attachvolume")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachDevServerVolumeRequest::getId, AttachDevServerVolumeRequest::setId));
        builder.<AttachServerVolumeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachServerVolumeRequest.class),
            f -> f.withMarshaller(AttachDevServerVolumeRequest::getBody, AttachDevServerVolumeRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AttachDevServerVolumeResponse::getXRequestId,
                AttachDevServerVolumeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDevServersActionRequest, BatchDevServersActionResponse> batchDevServersAction =
        genForBatchDevServersAction();

    private static HttpRequestDef<BatchDevServersActionRequest, BatchDevServersActionResponse> genForBatchDevServersAction() {
        // basic
        HttpRequestDef.Builder<BatchDevServersActionRequest, BatchDevServersActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDevServersActionRequest.class, BatchDevServersActionResponse.class)
            .withName("BatchDevServersAction")
            .withUri("/v1/{project_id}/dev-servers/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DevServerBatchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DevServerBatchRequest.class),
            f -> f.withMarshaller(BatchDevServersActionRequest::getBody, BatchDevServersActionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDevServersActionResponse::getXRequestId,
                BatchDevServersActionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BindDevServerPublicIPRequest, BindDevServerPublicIPResponse> bindDevServerPublicIP =
        genForBindDevServerPublicIP();

    private static HttpRequestDef<BindDevServerPublicIPRequest, BindDevServerPublicIPResponse> genForBindDevServerPublicIP() {
        // basic
        HttpRequestDef.Builder<BindDevServerPublicIPRequest, BindDevServerPublicIPResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BindDevServerPublicIPRequest.class, BindDevServerPublicIPResponse.class)
            .withName("BindDevServerPublicIP")
            .withUri("/v1/{project_id}/dev-servers/{id}/publicips")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindDevServerPublicIPRequest::getId, BindDevServerPublicIPRequest::setId));
        builder.<ServerBindPublicIPRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerBindPublicIPRequest.class),
            f -> f.withMarshaller(BindDevServerPublicIPRequest::getBody, BindDevServerPublicIPRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BindDevServerPublicIPResponse::getXRequestId,
                BindDevServerPublicIPResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeDevServerOSRequest, ChangeDevServerOSResponse> changeDevServerOS =
        genForChangeDevServerOS();

    private static HttpRequestDef<ChangeDevServerOSRequest, ChangeDevServerOSResponse> genForChangeDevServerOS() {
        // basic
        HttpRequestDef.Builder<ChangeDevServerOSRequest, ChangeDevServerOSResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeDevServerOSRequest.class, ChangeDevServerOSResponse.class)
                .withName("ChangeDevServerOS")
                .withUri("/v1/{project_id}/dev-servers/{id}/changeos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeDevServerOSRequest::getId, ChangeDevServerOSRequest::setId));
        builder.<ServerOsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerOsRequest.class),
            f -> f.withMarshaller(ChangeDevServerOSRequest::getBody, ChangeDevServerOSRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeDevServerOSResponse::getXRequestId, ChangeDevServerOSResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeHyperinstanceOSRequest, ChangeHyperinstanceOSResponse> changeHyperinstanceOS =
        genForChangeHyperinstanceOS();

    private static HttpRequestDef<ChangeHyperinstanceOSRequest, ChangeHyperinstanceOSResponse> genForChangeHyperinstanceOS() {
        // basic
        HttpRequestDef.Builder<ChangeHyperinstanceOSRequest, ChangeHyperinstanceOSResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeHyperinstanceOSRequest.class, ChangeHyperinstanceOSResponse.class)
            .withName("ChangeHyperinstanceOS")
            .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/changeos")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeHyperinstanceOSRequest::getId, ChangeHyperinstanceOSRequest::setId));
        builder.<ServerOsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerOsRequest.class),
            f -> f.withMarshaller(ChangeHyperinstanceOSRequest::getBody, ChangeHyperinstanceOSRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeHyperinstanceOSResponse::getXRequestId,
                ChangeHyperinstanceOSResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDevServerRequest, CreateDevServerResponse> createDevServer =
        genForCreateDevServer();

    private static HttpRequestDef<CreateDevServerRequest, CreateDevServerResponse> genForCreateDevServer() {
        // basic
        HttpRequestDef.Builder<CreateDevServerRequest, CreateDevServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDevServerRequest.class, CreateDevServerResponse.class)
                .withName("CreateDevServer")
                .withUri("/v1/{project_id}/dev-servers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerCreateRequest.class),
            f -> f.withMarshaller(CreateDevServerRequest::getBody, CreateDevServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDevServerJobRequest, CreateDevServerJobResponse> createDevServerJob =
        genForCreateDevServerJob();

    private static HttpRequestDef<CreateDevServerJobRequest, CreateDevServerJobResponse> genForCreateDevServerJob() {
        // basic
        HttpRequestDef.Builder<CreateDevServerJobRequest, CreateDevServerJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDevServerJobRequest.class, CreateDevServerJobResponse.class)
                .withName("CreateDevServerJob")
                .withUri("/v1/{project_id}/dev-servers/jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DevServerJobCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DevServerJobCreateRequest.class),
            f -> f.withMarshaller(CreateDevServerJobRequest::getBody, CreateDevServerJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHyperClusterRequest, CreateHyperClusterResponse> createHyperCluster =
        genForCreateHyperCluster();

    private static HttpRequestDef<CreateHyperClusterRequest, CreateHyperClusterResponse> genForCreateHyperCluster() {
        // basic
        HttpRequestDef.Builder<CreateHyperClusterRequest, CreateHyperClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHyperClusterRequest.class, CreateHyperClusterResponse.class)
                .withName("CreateHyperCluster")
                .withUri("/v1/{project_id}/dev-servers/hyper-clusters")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<HyperClusterCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HyperClusterCreateRequest.class),
            f -> f.withMarshaller(CreateHyperClusterRequest::getBody, CreateHyperClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHyperinstanceTagsRequest, CreateHyperinstanceTagsResponse> createHyperinstanceTags =
        genForCreateHyperinstanceTags();

    private static HttpRequestDef<CreateHyperinstanceTagsRequest, CreateHyperinstanceTagsResponse> genForCreateHyperinstanceTags() {
        // basic
        HttpRequestDef.Builder<CreateHyperinstanceTagsRequest, CreateHyperinstanceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateHyperinstanceTagsRequest.class, CreateHyperinstanceTagsResponse.class)
            .withName("CreateHyperinstanceTags")
            .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/tags/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHyperinstanceTagsRequest::getId, CreateHyperinstanceTagsRequest::setId));
        builder.<TagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagRequest.class),
            f -> f.withMarshaller(CreateHyperinstanceTagsRequest::getBody, CreateHyperinstanceTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateHyperinstanceTagsResponse::getXRequestId,
                CreateHyperinstanceTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRoceNetworkRequest, CreateRoceNetworkResponse> createRoceNetwork =
        genForCreateRoceNetwork();

    private static HttpRequestDef<CreateRoceNetworkRequest, CreateRoceNetworkResponse> genForCreateRoceNetwork() {
        // basic
        HttpRequestDef.Builder<CreateRoceNetworkRequest, CreateRoceNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoceNetworkRequest.class, CreateRoceNetworkResponse.class)
                .withName("CreateRoceNetwork")
                .withUri("/v1/{project_id}/dev-servers/networks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerRoceNetworkRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerRoceNetworkRequest.class),
            f -> f.withMarshaller(CreateRoceNetworkRequest::getBody, CreateRoceNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDevServerRequest, DeleteDevServerResponse> deleteDevServer =
        genForDeleteDevServer();

    private static HttpRequestDef<DeleteDevServerRequest, DeleteDevServerResponse> genForDeleteDevServer() {
        // basic
        HttpRequestDef.Builder<DeleteDevServerRequest, DeleteDevServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDevServerRequest.class, DeleteDevServerResponse.class)
                .withName("DeleteDevServer")
                .withUri("/v1/{project_id}/dev-servers/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDevServerRequest::getId, DeleteDevServerRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDevServerJobsRequest, DeleteDevServerJobsResponse> deleteDevServerJobs =
        genForDeleteDevServerJobs();

    private static HttpRequestDef<DeleteDevServerJobsRequest, DeleteDevServerJobsResponse> genForDeleteDevServerJobs() {
        // basic
        HttpRequestDef.Builder<DeleteDevServerJobsRequest, DeleteDevServerJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDevServerJobsRequest.class, DeleteDevServerJobsResponse.class)
            .withName("DeleteDevServerJobs")
            .withUri("/v1/{project_id}/dev-servers/jobs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerJobDeleteRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerJobDeleteRequest.class),
            f -> f.withMarshaller(DeleteDevServerJobsRequest::getBody, DeleteDevServerJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHyperClusterRequest, DeleteHyperClusterResponse> deleteHyperCluster =
        genForDeleteHyperCluster();

    private static HttpRequestDef<DeleteHyperClusterRequest, DeleteHyperClusterResponse> genForDeleteHyperCluster() {
        // basic
        HttpRequestDef.Builder<DeleteHyperClusterRequest, DeleteHyperClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHyperClusterRequest.class, DeleteHyperClusterResponse.class)
                .withName("DeleteHyperCluster")
                .withUri("/v1/{project_id}/dev-servers/hyper-clusters/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHyperClusterRequest::getId, DeleteHyperClusterRequest::setId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHyperClusterRequest::getType, DeleteHyperClusterRequest::setType));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(DeleteHyperClusterResponse::getBody, DeleteHyperClusterResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHyperinstanceRequest, DeleteHyperinstanceResponse> deleteHyperinstance =
        genForDeleteHyperinstance();

    private static HttpRequestDef<DeleteHyperinstanceRequest, DeleteHyperinstanceResponse> genForDeleteHyperinstance() {
        // basic
        HttpRequestDef.Builder<DeleteHyperinstanceRequest, DeleteHyperinstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteHyperinstanceRequest.class, DeleteHyperinstanceResponse.class)
            .withName("DeleteHyperinstance")
            .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHyperinstanceRequest::getId, DeleteHyperinstanceRequest::setId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteHyperinstanceResponse::getXRequestId,
                DeleteHyperinstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteHyperinstanceTagsRequest, DeleteHyperinstanceTagsResponse> deleteHyperinstanceTags =
        genForDeleteHyperinstanceTags();

    private static HttpRequestDef<DeleteHyperinstanceTagsRequest, DeleteHyperinstanceTagsResponse> genForDeleteHyperinstanceTags() {
        // basic
        HttpRequestDef.Builder<DeleteHyperinstanceTagsRequest, DeleteHyperinstanceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteHyperinstanceTagsRequest.class, DeleteHyperinstanceTagsResponse.class)
            .withName("DeleteHyperinstanceTags")
            .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/tags/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHyperinstanceTagsRequest::getId, DeleteHyperinstanceTagsRequest::setId));
        builder.<TagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagRequest.class),
            f -> f.withMarshaller(DeleteHyperinstanceTagsRequest::getBody, DeleteHyperinstanceTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteHyperinstanceTagsResponse::getXRequestId,
                DeleteHyperinstanceTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetachDevServerVolumeRequest, DetachDevServerVolumeResponse> detachDevServerVolume =
        genForDetachDevServerVolume();

    private static HttpRequestDef<DetachDevServerVolumeRequest, DetachDevServerVolumeResponse> genForDetachDevServerVolume() {
        // basic
        HttpRequestDef.Builder<DetachDevServerVolumeRequest, DetachDevServerVolumeResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DetachDevServerVolumeRequest.class, DetachDevServerVolumeResponse.class)
            .withName("DetachDevServerVolume")
            .withUri("/v1/{project_id}/dev-servers/{id}/detachvolume/{volume_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachDevServerVolumeRequest::getId, DetachDevServerVolumeRequest::setId));
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachDevServerVolumeRequest::getVolumeId,
                DetachDevServerVolumeRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetDevServerImageRequest, GetDevServerImageResponse> getDevServerImage =
        genForGetDevServerImage();

    private static HttpRequestDef<GetDevServerImageRequest, GetDevServerImageResponse> genForGetDevServerImage() {
        // basic
        HttpRequestDef.Builder<GetDevServerImageRequest, GetDevServerImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetDevServerImageRequest.class, GetDevServerImageResponse.class)
                .withName("GetDevServerImage")
                .withUri("/v1/{project_id}/dev-servers/images/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDevServerImageRequest::getId, GetDevServerImageRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetDevServerJobRequest, GetDevServerJobResponse> getDevServerJob =
        genForGetDevServerJob();

    private static HttpRequestDef<GetDevServerJobRequest, GetDevServerJobResponse> genForGetDevServerJob() {
        // basic
        HttpRequestDef.Builder<GetDevServerJobRequest, GetDevServerJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetDevServerJobRequest.class, GetDevServerJobResponse.class)
                .withName("GetDevServerJob")
                .withUri("/v1/{project_id}/dev-servers/jobs/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDevServerJobRequest::getId, GetDevServerJobRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetDevServerJobServiceRequest, GetDevServerJobServiceResponse> getDevServerJobService =
        genForGetDevServerJobService();

    private static HttpRequestDef<GetDevServerJobServiceRequest, GetDevServerJobServiceResponse> genForGetDevServerJobService() {
        // basic
        HttpRequestDef.Builder<GetDevServerJobServiceRequest, GetDevServerJobServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetDevServerJobServiceRequest.class, GetDevServerJobServiceResponse.class)
            .withName("GetDevServerJobService")
            .withUri("/v1/{project_id}/dev-servers/jobs/services/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDevServerJobServiceRequest::getId, GetDevServerJobServiceRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetDevServerJobTemplateRequest, GetDevServerJobTemplateResponse> getDevServerJobTemplate =
        genForGetDevServerJobTemplate();

    private static HttpRequestDef<GetDevServerJobTemplateRequest, GetDevServerJobTemplateResponse> genForGetDevServerJobTemplate() {
        // basic
        HttpRequestDef.Builder<GetDevServerJobTemplateRequest, GetDevServerJobTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetDevServerJobTemplateRequest.class, GetDevServerJobTemplateResponse.class)
            .withName("GetDevServerJobTemplate")
            .withUri("/v1/{project_id}/dev-servers/jobs/templates/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDevServerJobTemplateRequest::getId, GetDevServerJobTemplateRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetDevServerOperationRequest, GetDevServerOperationResponse> getDevServerOperation =
        genForGetDevServerOperation();

    private static HttpRequestDef<GetDevServerOperationRequest, GetDevServerOperationResponse> genForGetDevServerOperation() {
        // basic
        HttpRequestDef.Builder<GetDevServerOperationRequest, GetDevServerOperationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetDevServerOperationRequest.class, GetDevServerOperationResponse.class)
            .withName("GetDevServerOperation")
            .withUri("/v1/{project_id}/dev-servers/{id}/operation/{operation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDevServerOperationRequest::getId, GetDevServerOperationRequest::setId));
        builder.<String>withRequestField("operation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDevServerOperationRequest::getOperationId,
                GetDevServerOperationRequest::setOperationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetHyperClusterRequest, GetHyperClusterResponse> getHyperCluster =
        genForGetHyperCluster();

    private static HttpRequestDef<GetHyperClusterRequest, GetHyperClusterResponse> genForGetHyperCluster() {
        // basic
        HttpRequestDef.Builder<GetHyperClusterRequest, GetHyperClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetHyperClusterRequest.class, GetHyperClusterResponse.class)
                .withName("GetHyperCluster")
                .withUri("/v1/{project_id}/dev-servers/hyper-clusters/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetHyperClusterRequest::getId, GetHyperClusterRequest::setId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetHyperClusterRequest::getType, GetHyperClusterRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetHyperinstanceRequest, GetHyperinstanceResponse> getHyperinstance =
        genForGetHyperinstance();

    private static HttpRequestDef<GetHyperinstanceRequest, GetHyperinstanceResponse> genForGetHyperinstance() {
        // basic
        HttpRequestDef.Builder<GetHyperinstanceRequest, GetHyperinstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetHyperinstanceRequest.class, GetHyperinstanceResponse.class)
                .withName("GetHyperinstance")
                .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetHyperinstanceRequest::getId, GetHyperinstanceRequest::setId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetHyperinstanceResponse::getXRequestId, GetHyperinstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<GetScaleEvaluationsDevServerRequest, GetScaleEvaluationsDevServerResponse> getScaleEvaluationsDevServer =
        genForGetScaleEvaluationsDevServer();

    private static HttpRequestDef<GetScaleEvaluationsDevServerRequest, GetScaleEvaluationsDevServerResponse> genForGetScaleEvaluationsDevServer() {
        // basic
        HttpRequestDef.Builder<GetScaleEvaluationsDevServerRequest, GetScaleEvaluationsDevServerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetScaleEvaluationsDevServerRequest.class,
                    GetScaleEvaluationsDevServerResponse.class)
                .withName("GetScaleEvaluationsDevServer")
                .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/scale-evaluations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScaleEvaluationsDevServerRequest::getId,
                GetScaleEvaluationsDevServerRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetTopologiesRequest, GetTopologiesResponse> getTopologies =
        genForGetTopologies();

    private static HttpRequestDef<GetTopologiesRequest, GetTopologiesResponse> genForGetTopologies() {
        // basic
        HttpRequestDef.Builder<GetTopologiesRequest, GetTopologiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetTopologiesRequest.class, GetTopologiesResponse.class)
                .withName("GetTopologies")
                .withUri("/v1/{project_id}/dev-servers/instance-physical-topologies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTopologiesRequest::getId, GetTopologiesRequest::setId));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTopologiesRequest::getResourceId, GetTopologiesRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllDevServersRequest, ListAllDevServersResponse> listAllDevServers =
        genForListAllDevServers();

    private static HttpRequestDef<ListAllDevServersRequest, ListAllDevServersResponse> genForListAllDevServers() {
        // basic
        HttpRequestDef.Builder<ListAllDevServersRequest, ListAllDevServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllDevServersRequest.class, ListAllDevServersResponse.class)
                .withName("ListAllDevServers")
                .withUri("/v1/{project_id}/dev-servers/all")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllHyperinstancesRequest, ListAllHyperinstancesResponse> listAllHyperinstances =
        genForListAllHyperinstances();

    private static HttpRequestDef<ListAllHyperinstancesRequest, ListAllHyperinstancesResponse> genForListAllHyperinstances() {
        // basic
        HttpRequestDef.Builder<ListAllHyperinstancesRequest, ListAllHyperinstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAllHyperinstancesRequest.class, ListAllHyperinstancesResponse.class)
            .withName("ListAllHyperinstances")
            .withUri("/v1/{project_id}/dev-servers/hyperinstance/all")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevServerFlavorsRequest, ListDevServerFlavorsResponse> listDevServerFlavors =
        genForListDevServerFlavors();

    private static HttpRequestDef<ListDevServerFlavorsRequest, ListDevServerFlavorsResponse> genForListDevServerFlavors() {
        // basic
        HttpRequestDef.Builder<ListDevServerFlavorsRequest, ListDevServerFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDevServerFlavorsRequest.class, ListDevServerFlavorsResponse.class)
            .withName("ListDevServerFlavors")
            .withUri("/v1/{project_id}/dev-servers/flavors")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerFlavorsRequest::getServerType,
                ListDevServerFlavorsRequest::setServerType));
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerFlavorsRequest::getArch, ListDevServerFlavorsRequest::setArch));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerFlavorsRequest::getChargingMode,
                ListDevServerFlavorsRequest::setChargingMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevServerImagesRequest, ListDevServerImagesResponse> listDevServerImages =
        genForListDevServerImages();

    private static HttpRequestDef<ListDevServerImagesRequest, ListDevServerImagesResponse> genForListDevServerImages() {
        // basic
        HttpRequestDef.Builder<ListDevServerImagesRequest, ListDevServerImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevServerImagesRequest.class, ListDevServerImagesResponse.class)
                .withName("ListDevServerImages")
                .withUri("/v1/{project_id}/dev-servers/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerImagesRequest::getServerType,
                ListDevServerImagesRequest::setServerType));
        builder.<String>withRequestField("flavor_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerImagesRequest::getFlavorName,
                ListDevServerImagesRequest::setFlavorName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevServerJobTemplatesRequest, ListDevServerJobTemplatesResponse> listDevServerJobTemplates =
        genForListDevServerJobTemplates();

    private static HttpRequestDef<ListDevServerJobTemplatesRequest, ListDevServerJobTemplatesResponse> genForListDevServerJobTemplates() {
        // basic
        HttpRequestDef.Builder<ListDevServerJobTemplatesRequest, ListDevServerJobTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDevServerJobTemplatesRequest.class,
                    ListDevServerJobTemplatesResponse.class)
                .withName("ListDevServerJobTemplates")
                .withUri("/v1/{project_id}/dev-servers/jobs/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerJobTemplatesRequest::getId, ListDevServerJobTemplatesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerJobTemplatesRequest::getName,
                ListDevServerJobTemplatesRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerJobTemplatesRequest::getType,
                ListDevServerJobTemplatesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevServerJobsRequest, ListDevServerJobsResponse> listDevServerJobs =
        genForListDevServerJobs();

    private static HttpRequestDef<ListDevServerJobsRequest, ListDevServerJobsResponse> genForListDevServerJobs() {
        // basic
        HttpRequestDef.Builder<ListDevServerJobsRequest, ListDevServerJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevServerJobsRequest.class, ListDevServerJobsResponse.class)
                .withName("ListDevServerJobs")
                .withUri("/v1/{project_id}/dev-servers/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerJobsRequest::getId, ListDevServerJobsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerJobsRequest::getName, ListDevServerJobsRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerJobsRequest::getType, ListDevServerJobsRequest::setType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerJobsRequest::getStatus, ListDevServerJobsRequest::setStatus));
        builder.<Boolean>withRequestField("visible",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDevServerJobsRequest::getVisible, ListDevServerJobsRequest::setVisible));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevServerPublicIPRequest, ListDevServerPublicIPResponse> listDevServerPublicIP =
        genForListDevServerPublicIP();

    private static HttpRequestDef<ListDevServerPublicIPRequest, ListDevServerPublicIPResponse> genForListDevServerPublicIP() {
        // basic
        HttpRequestDef.Builder<ListDevServerPublicIPRequest, ListDevServerPublicIPResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDevServerPublicIPRequest.class, ListDevServerPublicIPResponse.class)
            .withName("ListDevServerPublicIP")
            .withUri("/v1/{project_id}/dev-servers/{id}/publicips")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServerPublicIPRequest::getId, ListDevServerPublicIPRequest::setId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevServerPublicIPResponse::getXRequestId,
                ListDevServerPublicIPResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDevServersRequest, ListDevServersResponse> listDevServers =
        genForListDevServers();

    private static HttpRequestDef<ListDevServersRequest, ListDevServersResponse> genForListDevServers() {
        // basic
        HttpRequestDef.Builder<ListDevServersRequest, ListDevServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevServersRequest.class, ListDevServersResponse.class)
                .withName("ListDevServers")
                .withUri("/v1/{project_id}/dev-servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServersRequest::getOwner, ListDevServersRequest::setOwner));
        builder.<ListDevServersRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDevServersRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListDevServersRequest::getSortDir, ListDevServersRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevServersRequest::getSortKey, ListDevServersRequest::setSortKey));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevServersRequest::getLimit, ListDevServersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevServersRequest::getOffset, ListDevServersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHyperClusterRequest, ListHyperClusterResponse> listHyperCluster =
        genForListHyperCluster();

    private static HttpRequestDef<ListHyperClusterRequest, ListHyperClusterResponse> genForListHyperCluster() {
        // basic
        HttpRequestDef.Builder<ListHyperClusterRequest, ListHyperClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHyperClusterRequest.class, ListHyperClusterResponse.class)
                .withName("ListHyperCluster")
                .withUri("/v1/{project_id}/dev-servers/hyper-clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHyperClusterRequest::getType, ListHyperClusterRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHyperinstanceClustersCapacityRequest, ListHyperinstanceClustersCapacityResponse> listHyperinstanceClustersCapacity =
        genForListHyperinstanceClustersCapacity();

    private static HttpRequestDef<ListHyperinstanceClustersCapacityRequest, ListHyperinstanceClustersCapacityResponse> genForListHyperinstanceClustersCapacity() {
        // basic
        HttpRequestDef.Builder<ListHyperinstanceClustersCapacityRequest, ListHyperinstanceClustersCapacityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListHyperinstanceClustersCapacityRequest.class,
                    ListHyperinstanceClustersCapacityResponse.class)
                .withName("ListHyperinstanceClustersCapacity")
                .withUri("/v1/{project_id}/dev-servers/hyperinstance/cluster-capacity-evaluations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<HyperinstanceClustersCapacityRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HyperinstanceClustersCapacityRequest.class),
            f -> f.withMarshaller(ListHyperinstanceClustersCapacityRequest::getBody,
                ListHyperinstanceClustersCapacityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHyperinstancesRequest, ListHyperinstancesResponse> listHyperinstances =
        genForListHyperinstances();

    private static HttpRequestDef<ListHyperinstancesRequest, ListHyperinstancesResponse> genForListHyperinstances() {
        // basic
        HttpRequestDef.Builder<ListHyperinstancesRequest, ListHyperinstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHyperinstancesRequest.class, ListHyperinstancesResponse.class)
                .withName("ListHyperinstances")
                .withUri("/v1/{project_id}/dev-servers/hyperinstance")
                .withContentType("application/json");

        // requests
        builder.<ListHyperinstancesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHyperinstancesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListHyperinstancesRequest::getSortDir, ListHyperinstancesRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHyperinstancesRequest::getSortKey, ListHyperinstancesRequest::setSortKey));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHyperinstancesRequest::getLimit, ListHyperinstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHyperinstancesRequest::getOffset, ListHyperinstancesRequest::setOffset));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHyperinstancesResponse::getXRequestId,
                ListHyperinstancesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<QueryHyperinstanceTagsRequest, QueryHyperinstanceTagsResponse> queryHyperinstanceTags =
        genForQueryHyperinstanceTags();

    private static HttpRequestDef<QueryHyperinstanceTagsRequest, QueryHyperinstanceTagsResponse> genForQueryHyperinstanceTags() {
        // basic
        HttpRequestDef.Builder<QueryHyperinstanceTagsRequest, QueryHyperinstanceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, QueryHyperinstanceTagsRequest.class, QueryHyperinstanceTagsResponse.class)
            .withName("QueryHyperinstanceTags")
            .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(QueryHyperinstanceTagsRequest::getId, QueryHyperinstanceTagsRequest::setId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(QueryHyperinstanceTagsResponse::getXRequestId,
                QueryHyperinstanceTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RebootDevServerRequest, RebootDevServerResponse> rebootDevServer =
        genForRebootDevServer();

    private static HttpRequestDef<RebootDevServerRequest, RebootDevServerResponse> genForRebootDevServer() {
        // basic
        HttpRequestDef.Builder<RebootDevServerRequest, RebootDevServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RebootDevServerRequest.class, RebootDevServerResponse.class)
                .withName("RebootDevServer")
                .withUri("/v1/{project_id}/dev-servers/{id}/reboot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootDevServerRequest::getId, RebootDevServerRequest::setId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RebootDevServerResponse::getXRequestId, RebootDevServerResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ReinstallDevServerOSRequest, ReinstallDevServerOSResponse> reinstallDevServerOS =
        genForReinstallDevServerOS();

    private static HttpRequestDef<ReinstallDevServerOSRequest, ReinstallDevServerOSResponse> genForReinstallDevServerOS() {
        // basic
        HttpRequestDef.Builder<ReinstallDevServerOSRequest, ReinstallDevServerOSResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ReinstallDevServerOSRequest.class, ReinstallDevServerOSResponse.class)
            .withName("ReinstallDevServerOS")
            .withUri("/v1/{project_id}/dev-servers/{id}/reinstallos")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ReinstallDevServerOSRequest::getId, ReinstallDevServerOSRequest::setId));
        builder.<ServerOsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerOsRequest.class),
            f -> f.withMarshaller(ReinstallDevServerOSRequest::getBody, ReinstallDevServerOSRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ReinstallDevServerOSResponse::getXRequestId,
                ReinstallDevServerOSResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ScaleDownHyperinstanceRequest, ScaleDownHyperinstanceResponse> scaleDownHyperinstance =
        genForScaleDownHyperinstance();

    private static HttpRequestDef<ScaleDownHyperinstanceRequest, ScaleDownHyperinstanceResponse> genForScaleDownHyperinstance() {
        // basic
        HttpRequestDef.Builder<ScaleDownHyperinstanceRequest, ScaleDownHyperinstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ScaleDownHyperinstanceRequest.class, ScaleDownHyperinstanceResponse.class)
            .withName("ScaleDownHyperinstance")
            .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/live-scale-down")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ScaleDownHyperinstanceRequest::getId, ScaleDownHyperinstanceRequest::setId));
        builder.<ServerScaleDownRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerScaleDownRequest.class),
            f -> f.withMarshaller(ScaleDownHyperinstanceRequest::getBody, ScaleDownHyperinstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ScaleUpHyperinstanceRequest, ScaleUpHyperinstanceResponse> scaleUpHyperinstance =
        genForScaleUpHyperinstance();

    private static HttpRequestDef<ScaleUpHyperinstanceRequest, ScaleUpHyperinstanceResponse> genForScaleUpHyperinstance() {
        // basic
        HttpRequestDef.Builder<ScaleUpHyperinstanceRequest, ScaleUpHyperinstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ScaleUpHyperinstanceRequest.class, ScaleUpHyperinstanceResponse.class)
            .withName("ScaleUpHyperinstance")
            .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/live-scale-up")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ScaleUpHyperinstanceRequest::getId, ScaleUpHyperinstanceRequest::setId));
        builder.<ServerHyperScaleUpRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerHyperScaleUpRequest.class),
            f -> f.withMarshaller(ScaleUpHyperinstanceRequest::getBody, ScaleUpHyperinstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDevServerRequest, ShowDevServerResponse> showDevServer =
        genForShowDevServer();

    private static HttpRequestDef<ShowDevServerRequest, ShowDevServerResponse> genForShowDevServer() {
        // basic
        HttpRequestDef.Builder<ShowDevServerRequest, ShowDevServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDevServerRequest.class, ShowDevServerResponse.class)
                .withName("ShowDevServer")
                .withUri("/v1/{project_id}/dev-servers/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevServerRequest::getId, ShowDevServerRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartDevServerRequest, StartDevServerResponse> startDevServer =
        genForStartDevServer();

    private static HttpRequestDef<StartDevServerRequest, StartDevServerResponse> genForStartDevServer() {
        // basic
        HttpRequestDef.Builder<StartDevServerRequest, StartDevServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartDevServerRequest.class, StartDevServerResponse.class)
                .withName("StartDevServer")
                .withUri("/v1/{project_id}/dev-servers/{id}/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartDevServerRequest::getId, StartDevServerRequest::setId));
        builder.<ServerStartRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ServerStartRequest.class),
            f -> f.withMarshaller(StartDevServerRequest::getBody, StartDevServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartHyperinstanceRequest, StartHyperinstanceResponse> startHyperinstance =
        genForStartHyperinstance();

    private static HttpRequestDef<StartHyperinstanceRequest, StartHyperinstanceResponse> genForStartHyperinstance() {
        // basic
        HttpRequestDef.Builder<StartHyperinstanceRequest, StartHyperinstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartHyperinstanceRequest.class, StartHyperinstanceResponse.class)
                .withName("StartHyperinstance")
                .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartHyperinstanceRequest::getId, StartHyperinstanceRequest::setId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartHyperinstanceResponse::getXRequestId,
                StartHyperinstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopDevServerRequest, StopDevServerResponse> stopDevServer =
        genForStopDevServer();

    private static HttpRequestDef<StopDevServerRequest, StopDevServerResponse> genForStopDevServer() {
        // basic
        HttpRequestDef.Builder<StopDevServerRequest, StopDevServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopDevServerRequest.class, StopDevServerResponse.class)
                .withName("StopDevServer")
                .withUri("/v1/{project_id}/dev-servers/{id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopDevServerRequest::getId, StopDevServerRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopHyperinstanceRequest, StopHyperinstanceResponse> stopHyperinstance =
        genForStopHyperinstance();

    private static HttpRequestDef<StopHyperinstanceRequest, StopHyperinstanceResponse> genForStopHyperinstance() {
        // basic
        HttpRequestDef.Builder<StopHyperinstanceRequest, StopHyperinstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopHyperinstanceRequest.class, StopHyperinstanceResponse.class)
                .withName("StopHyperinstance")
                .withUri("/v1/{project_id}/dev-servers/hyperinstance/{id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopHyperinstanceRequest::getId, StopHyperinstanceRequest::setId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopHyperinstanceResponse::getXRequestId, StopHyperinstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SyncDevServersRequest, SyncDevServersResponse> syncDevServers =
        genForSyncDevServers();

    private static HttpRequestDef<SyncDevServersRequest, SyncDevServersResponse> genForSyncDevServers() {
        // basic
        HttpRequestDef.Builder<SyncDevServersRequest, SyncDevServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SyncDevServersRequest.class, SyncDevServersResponse.class)
                .withName("SyncDevServers")
                .withUri("/v1/{project_id}/dev-servers/sync")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncDevServersRequest::getOwner, SyncDevServersRequest::setOwner));
        builder.<SyncDevServersRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SyncDevServersRequest.SortDirEnum.class),
            f -> f.withMarshaller(SyncDevServersRequest::getSortDir, SyncDevServersRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncDevServersRequest::getSortKey, SyncDevServersRequest::setSortKey));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SyncDevServersRequest::getOffset, SyncDevServersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SyncDevServersRequest::getLimit, SyncDevServersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDevServerRequest, UpdateDevServerResponse> updateDevServer =
        genForUpdateDevServer();

    private static HttpRequestDef<UpdateDevServerRequest, UpdateDevServerResponse> genForUpdateDevServer() {
        // basic
        HttpRequestDef.Builder<UpdateDevServerRequest, UpdateDevServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDevServerRequest.class, UpdateDevServerResponse.class)
                .withName("UpdateDevServer")
                .withUri("/v1/{project_id}/dev-servers/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDevServerRequest::getId, UpdateDevServerRequest::setId));
        builder.<UpdateServerRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerRequest.class),
            f -> f.withMarshaller(UpdateDevServerRequest::getBody, UpdateDevServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageRequest, CreateImageResponse> createImage = genForCreateImage();

    private static HttpRequestDef<CreateImageRequest, CreateImageResponse> genForCreateImage() {
        // basic
        HttpRequestDef.Builder<CreateImageRequest, CreateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageRequest.class, CreateImageResponse.class)
                .withName("CreateImage")
                .withUri("/v1/{project_id}/notebooks/{id}/create-image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageRequest::getId, CreateImageRequest::setId));
        builder.<ImageCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImageCreateReq.class),
            f -> f.withMarshaller(CreateImageRequest::getBody, CreateImageRequest::setBody));

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
                .withUri("/v1/{project_id}/notebooks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NotebookCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NotebookCreateRequest.class),
            f -> f.withMarshaller(CreateNotebookRequest::getBody, CreateNotebookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotebookTagsRequest, CreateNotebookTagsResponse> createNotebookTags =
        genForCreateNotebookTags();

    private static HttpRequestDef<CreateNotebookTagsRequest, CreateNotebookTagsResponse> genForCreateNotebookTags() {
        // basic
        HttpRequestDef.Builder<CreateNotebookTagsRequest, CreateNotebookTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNotebookTagsRequest.class, CreateNotebookTagsResponse.class)
                .withName("CreateNotebookTags")
                .withUri("/v1/{project_id}/notebooks/{resource_id}/tags/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNotebookTagsRequest::getResourceId, CreateNotebookTagsRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNotebookTagsRequest::getWorkspaceId,
                CreateNotebookTagsRequest::setWorkspaceId));
        builder.<CreateTmsTagsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTmsTagsRequest.class),
            f -> f.withMarshaller(CreateNotebookTagsRequest::getBody, CreateNotebookTagsRequest::setBody));

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
                .withUri("/v1/{project_id}/notebooks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotebookRequest::getId, DeleteNotebookRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotebookTagsRequest, DeleteNotebookTagsResponse> deleteNotebookTags =
        genForDeleteNotebookTags();

    private static HttpRequestDef<DeleteNotebookTagsRequest, DeleteNotebookTagsResponse> genForDeleteNotebookTags() {
        // basic
        HttpRequestDef.Builder<DeleteNotebookTagsRequest, DeleteNotebookTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNotebookTagsRequest.class, DeleteNotebookTagsResponse.class)
                .withName("DeleteNotebookTags")
                .withUri("/v1/{project_id}/notebooks/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotebookTagsRequest::getResourceId, DeleteNotebookTagsRequest::setResourceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotebookTagsRequest::getWorkspaceId,
                DeleteNotebookTagsRequest::setWorkspaceId));
        builder.<DeleteTmsTagsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTmsTagsRequest.class),
            f -> f.withMarshaller(DeleteNotebookTagsRequest::getBody, DeleteNotebookTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllNotebooksRequest, ListAllNotebooksResponse> listAllNotebooks =
        genForListAllNotebooks();

    private static HttpRequestDef<ListAllNotebooksRequest, ListAllNotebooksResponse> genForListAllNotebooks() {
        // basic
        HttpRequestDef.Builder<ListAllNotebooksRequest, ListAllNotebooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllNotebooksRequest.class, ListAllNotebooksResponse.class)
                .withName("ListAllNotebooks")
                .withUri("/v1/{project_id}/notebooks/all")
                .withContentType("application/json");

        // requests
        builder.<ListAllNotebooksRequest.FeatureEnum>withRequestField("feature",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllNotebooksRequest.FeatureEnum.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getFeature, ListAllNotebooksRequest::setFeature));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getLimit, ListAllNotebooksRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getName, ListAllNotebooksRequest::setName));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getPoolId, ListAllNotebooksRequest::setPoolId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getOffset, ListAllNotebooksRequest::setOffset));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getOwner, ListAllNotebooksRequest::setOwner));
        builder.<ListAllNotebooksRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllNotebooksRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getSortDir, ListAllNotebooksRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getSortKey, ListAllNotebooksRequest::setSortKey));
        builder.<ListAllNotebooksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllNotebooksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getStatus, ListAllNotebooksRequest::setStatus));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getWorkspaceId, ListAllNotebooksRequest::setWorkspaceId));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getFlavor, ListAllNotebooksRequest::setFlavor));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getImageId, ListAllNotebooksRequest::setImageId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getId, ListAllNotebooksRequest::setId));
        builder.<String>withRequestField("billing",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getBilling, ListAllNotebooksRequest::setBilling));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllNotebooksRequest::getTags, ListAllNotebooksRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthoringClustersRequest, ListAuthoringClustersResponse> listAuthoringClusters =
        genForListAuthoringClusters();

    private static HttpRequestDef<ListAuthoringClustersRequest, ListAuthoringClustersResponse> genForListAuthoringClusters() {
        // basic
        HttpRequestDef.Builder<ListAuthoringClustersRequest, ListAuthoringClustersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuthoringClustersRequest.class, ListAuthoringClustersResponse.class)
            .withName("ListAuthoringClusters")
            .withUri("/v1/{project_id}/authoring/clusters")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthoringClustersRequest::getType, ListAuthoringClustersRequest::setType));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthoringClustersRequest::getWorkspaceId,
                ListAuthoringClustersRequest::setWorkspaceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthoringClustersRequest::getLimit, ListAuthoringClustersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthoringClustersRequest::getOffset, ListAuthoringClustersRequest::setOffset));
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthoringClustersRequest::getScope, ListAuthoringClustersRequest::setScope));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeaturesRequest, ListFeaturesResponse> listFeatures = genForListFeatures();

    private static HttpRequestDef<ListFeaturesRequest, ListFeaturesResponse> genForListFeatures() {
        // basic
        HttpRequestDef.Builder<ListFeaturesRequest, ListFeaturesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeaturesRequest.class, ListFeaturesResponse.class)
                .withName("ListFeatures")
                .withUri("/v1/{project_id}/authoring/features/{feature}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeaturesRequest::getFeature, ListFeaturesRequest::setFeature));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v1/{project_id}/notebooks/flavors")
                .withContentType("application/json");

        // requests
        builder.<ListFlavorsRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorsRequest.CategoryEnum.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCategory, ListFlavorsRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, ListFlavorsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getOffset, ListFlavorsRequest::setOffset));
        builder.<ListFlavorsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListFlavorsRequest::getType, ListFlavorsRequest::setType));
        builder.<ListFlavorsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSortDir, ListFlavorsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSortKey, ListFlavorsRequest::setSortKey));
        builder.<String>withRequestField("flavor_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getFlavorType, ListFlavorsRequest::setFlavorType));
        builder.<String>withRequestField("feature",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getFeature, ListFlavorsRequest::setFeature));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotebooksRequest, ListNotebooksResponse> listNotebooks =
        genForListNotebooks();

    private static HttpRequestDef<ListNotebooksRequest, ListNotebooksResponse> genForListNotebooks() {
        // basic
        HttpRequestDef.Builder<ListNotebooksRequest, ListNotebooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotebooksRequest.class, ListNotebooksResponse.class)
                .withName("ListNotebooks")
                .withUri("/v1/{project_id}/notebooks")
                .withContentType("application/json");

        // requests
        builder.<ListNotebooksRequest.FeatureEnum>withRequestField("feature",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNotebooksRequest.FeatureEnum.class),
            f -> f.withMarshaller(ListNotebooksRequest::getFeature, ListNotebooksRequest::setFeature));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotebooksRequest::getLimit, ListNotebooksRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getName, ListNotebooksRequest::setName));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getPoolId, ListNotebooksRequest::setPoolId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotebooksRequest::getOffset, ListNotebooksRequest::setOffset));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getOwner, ListNotebooksRequest::setOwner));
        builder.<ListNotebooksRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNotebooksRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListNotebooksRequest::getSortDir, ListNotebooksRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getSortKey, ListNotebooksRequest::setSortKey));
        builder.<ListNotebooksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNotebooksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListNotebooksRequest::getStatus, ListNotebooksRequest::setStatus));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getWorkspaceId, ListNotebooksRequest::setWorkspaceId));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getFlavor, ListNotebooksRequest::setFlavor));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getImageId, ListNotebooksRequest::setImageId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getId, ListNotebooksRequest::setId));
        builder.<String>withRequestField("billing",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getBilling, ListNotebooksRequest::setBilling));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebooksRequest::getTags, ListNotebooksRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenewLeaseRequest, RenewLeaseResponse> renewLease = genForRenewLease();

    private static HttpRequestDef<RenewLeaseRequest, RenewLeaseResponse> genForRenewLease() {
        // basic
        HttpRequestDef.Builder<RenewLeaseRequest, RenewLeaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, RenewLeaseRequest.class, RenewLeaseResponse.class)
                .withName("RenewLease")
                .withUri("/v1/{project_id}/notebooks/{id}/lease")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenewLeaseRequest::getId, RenewLeaseRequest::setId));
        builder.<Long>withRequestField("duration",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(RenewLeaseRequest::getDuration, RenewLeaseRequest::setDuration));
        builder.<LeaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LeaseReq.class),
            f -> f.withMarshaller(RenewLeaseRequest::getBody, RenewLeaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForShowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForShowCluster() {
        // basic
        HttpRequestDef.Builder<ShowClusterRequest, ShowClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterRequest.class, ShowClusterResponse.class)
                .withName("ShowCluster")
                .withUri("/v1/{project_id}/authoring/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getClusterId, ShowClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLeaseRequest, ShowLeaseResponse> showLease = genForShowLease();

    private static HttpRequestDef<ShowLeaseRequest, ShowLeaseResponse> genForShowLease() {
        // basic
        HttpRequestDef.Builder<ShowLeaseRequest, ShowLeaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLeaseRequest.class, ShowLeaseResponse.class)
                .withName("ShowLease")
                .withUri("/v1/{project_id}/notebooks/{id}/lease")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLeaseRequest::getId, ShowLeaseRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotebookRequest, ShowNotebookResponse> showNotebook = genForShowNotebook();

    private static HttpRequestDef<ShowNotebookRequest, ShowNotebookResponse> genForShowNotebook() {
        // basic
        HttpRequestDef.Builder<ShowNotebookRequest, ShowNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNotebookRequest.class, ShowNotebookResponse.class)
                .withName("ShowNotebook")
                .withUri("/v1/{project_id}/notebooks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookRequest::getId, ShowNotebookRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotebookTagsRequest, ShowNotebookTagsResponse> showNotebookTags =
        genForShowNotebookTags();

    private static HttpRequestDef<ShowNotebookTagsRequest, ShowNotebookTagsResponse> genForShowNotebookTags() {
        // basic
        HttpRequestDef.Builder<ShowNotebookTagsRequest, ShowNotebookTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNotebookTagsRequest.class, ShowNotebookTagsResponse.class)
                .withName("ShowNotebookTags")
                .withUri("/v1/{project_id}/notebooks/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookTagsRequest::getWorkspaceId, ShowNotebookTagsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSwitchableFlavorsRequest, ShowSwitchableFlavorsResponse> showSwitchableFlavors =
        genForShowSwitchableFlavors();

    private static HttpRequestDef<ShowSwitchableFlavorsRequest, ShowSwitchableFlavorsResponse> genForShowSwitchableFlavors() {
        // basic
        HttpRequestDef.Builder<ShowSwitchableFlavorsRequest, ShowSwitchableFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSwitchableFlavorsRequest.class, ShowSwitchableFlavorsResponse.class)
            .withName("ShowSwitchableFlavors")
            .withUri("/v1/{project_id}/notebooks/{id}/flavors")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSwitchableFlavorsRequest::getId, ShowSwitchableFlavorsRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSwitchableFlavorsRequest::getLimit, ShowSwitchableFlavorsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSwitchableFlavorsRequest::getOffset, ShowSwitchableFlavorsRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSwitchableFlavorsRequest::getSortKey, ShowSwitchableFlavorsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSwitchableFlavorsRequest::getSortDir, ShowSwitchableFlavorsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNotebookRequest, StartNotebookResponse> startNotebook =
        genForStartNotebook();

    private static HttpRequestDef<StartNotebookRequest, StartNotebookResponse> genForStartNotebook() {
        // basic
        HttpRequestDef.Builder<StartNotebookRequest, StartNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartNotebookRequest.class, StartNotebookResponse.class)
                .withName("StartNotebook")
                .withUri("/v1/{project_id}/notebooks/{id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNotebookRequest::getId, StartNotebookRequest::setId));
        builder.<Long>withRequestField("duration",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(StartNotebookRequest::getDuration, StartNotebookRequest::setDuration));
        builder.<StartNotebookRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartNotebookRequest.TypeEnum.class),
            f -> f.withMarshaller(StartNotebookRequest::getType, StartNotebookRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopNotebookRequest, StopNotebookResponse> stopNotebook = genForStopNotebook();

    private static HttpRequestDef<StopNotebookRequest, StopNotebookResponse> genForStopNotebook() {
        // basic
        HttpRequestDef.Builder<StopNotebookRequest, StopNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopNotebookRequest.class, StopNotebookResponse.class)
                .withName("StopNotebook")
                .withUri("/v1/{project_id}/notebooks/{id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopNotebookRequest::getId, StopNotebookRequest::setId));

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
                .withUri("/v1/{project_id}/notebooks/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getId, UpdateNotebookRequest::setId));
        builder.<NotebookUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NotebookUpdateRequest.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getBody, UpdateNotebookRequest::setBody));

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
