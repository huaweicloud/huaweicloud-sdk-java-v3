package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchBindPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchCreatePoolTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchCreatePoolTagsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolTagsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchDeletePoolTagsResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnlockPoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUnlockPoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.BatchUpdatePoolNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAuthorizationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateModelArtsAgencyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateModelArtsAgencyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderIdRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateOrderIdResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolPluginRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolPluginResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreatePoolResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNodePoolResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.GetAuthorizationsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.GetAuthorizationsResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNetworkRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNetworkResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNodePoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchNodePoolResponse;
import com.huaweicloud.sdk.modelarts.v1.model.PatchPoolRequest;
import com.huaweicloud.sdk.modelarts.v1.model.PatchPoolResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.StopTrainingJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopTrainingJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeResponse;
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

import java.util.concurrent.CompletableFuture;

public class ModelArtsAsyncClient {

    protected HcClient hcClient;

    public ModelArtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModelArtsAsyncClient> newBuilder() {
        ClientBuilder<ModelArtsAsyncClient> clientBuilder = new ClientBuilder<>(ModelArtsAsyncClient::new);
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
     * @return CompletableFuture<AcceptScheduledEventResponse>
     */
    public CompletableFuture<AcceptScheduledEventResponse> acceptScheduledEventAsync(
        AcceptScheduledEventRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.acceptScheduledEvent);
    }

    /**
     * 计划事件授权
     *
     * 计划事件授权接口用于为指定的计划事件分配或调整权限。该接口适用于以下场景：当创建新的计划事件、调整现有计划事件的权限设置或变更权限分配时，用户可通过此接口为指定的计划事件授予或修改权限。使用该接口的前提条件是计划事件已存在且用户具有管理员权限。授权操作完成后，计划事件的权限设置将被更新，相关变更将被记录以便审计。若计划事件不存在、用户无权限操作或授权信息格式不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return AsyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse>
     */
    public AsyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse> acceptScheduledEventAsyncInvoker(
        AcceptScheduledEventRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.acceptScheduledEvent, hcClient);
    }

    /**
     * 批量为节点绑定逻辑子池
     *
     * 批量为节点绑定逻辑子池接口用于在物理专属池开启节点绑定功能时，对逻辑子池中的节点进行逻辑子池的换绑操作。该接口适用于以下场景：当需要重新分配资源、调整业务负载或优化资源使用效率时，用户可通过此接口将指定节点从当前逻辑子池迁移到另一个逻辑子池。使用该接口的前提条件是物理专属池已开启节点绑定功能，且目标逻辑子池已存在并具备足够的资源容量。绑定操作完成后，节点将从原逻辑子池解绑并绑定到目标逻辑子池，原逻辑子池的节点数减少，目标逻辑子池的节点数增加。若节点未绑定到任何逻辑子池、目标逻辑子池不存在或资源不足，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchBindPoolNodesRequest 请求对象
     * @return CompletableFuture<BatchBindPoolNodesResponse>
     */
    public CompletableFuture<BatchBindPoolNodesResponse> batchBindPoolNodesAsync(BatchBindPoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchBindPoolNodes);
    }

    /**
     * 批量为节点绑定逻辑子池
     *
     * 批量为节点绑定逻辑子池接口用于在物理专属池开启节点绑定功能时，对逻辑子池中的节点进行逻辑子池的换绑操作。该接口适用于以下场景：当需要重新分配资源、调整业务负载或优化资源使用效率时，用户可通过此接口将指定节点从当前逻辑子池迁移到另一个逻辑子池。使用该接口的前提条件是物理专属池已开启节点绑定功能，且目标逻辑子池已存在并具备足够的资源容量。绑定操作完成后，节点将从原逻辑子池解绑并绑定到目标逻辑子池，原逻辑子池的节点数减少，目标逻辑子池的节点数增加。若节点未绑定到任何逻辑子池、目标逻辑子池不存在或资源不足，或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchBindPoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchBindPoolNodesRequest, BatchBindPoolNodesResponse>
     */
    public AsyncInvoker<BatchBindPoolNodesRequest, BatchBindPoolNodesResponse> batchBindPoolNodesAsyncInvoker(
        BatchBindPoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchBindPoolNodes, hcClient);
    }

    /**
     * 批量创建资源池标签
     *
     * 批量创建资源池标签接口用于为指定资源池添加或更新多个标签信息。该接口适用于以下场景：当需要对资源池进行统一分类管理（如成本归属、环境标识）、批量配置元数据（如项目归属、负责人信息）或更新已有标签值时，管理员可通过此接口一次性操作多个标签。使用该接口的前提条件是目标资源池必须已存在且处于可管理状态，调用者需具备资源池标签管理权限，且提交的标签数据需符合格式规范（如key非空、value长度限制）。操作完成后，系统将为资源池添加新标签或覆盖同名标签的值，且不会影响资源池的其他配置属性。若资源池不存在、用户权限不足、标签格式错误或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;、\&quot;400 Bad Request\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePoolTagsRequest 请求对象
     * @return CompletableFuture<BatchCreatePoolTagsResponse>
     */
    public CompletableFuture<BatchCreatePoolTagsResponse> batchCreatePoolTagsAsync(BatchCreatePoolTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchCreatePoolTags);
    }

    /**
     * 批量创建资源池标签
     *
     * 批量创建资源池标签接口用于为指定资源池添加或更新多个标签信息。该接口适用于以下场景：当需要对资源池进行统一分类管理（如成本归属、环境标识）、批量配置元数据（如项目归属、负责人信息）或更新已有标签值时，管理员可通过此接口一次性操作多个标签。使用该接口的前提条件是目标资源池必须已存在且处于可管理状态，调用者需具备资源池标签管理权限，且提交的标签数据需符合格式规范（如key非空、value长度限制）。操作完成后，系统将为资源池添加新标签或覆盖同名标签的值，且不会影响资源池的其他配置属性。若资源池不存在、用户权限不足、标签格式错误或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;、\&quot;400 Bad Request\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePoolTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreatePoolTagsRequest, BatchCreatePoolTagsResponse>
     */
    public AsyncInvoker<BatchCreatePoolTagsRequest, BatchCreatePoolTagsResponse> batchCreatePoolTagsAsyncInvoker(
        BatchCreatePoolTagsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchCreatePoolTags, hcClient);
    }

    /**
     * 批量删除节点
     *
     * 批量删除节点接口用于批量删除指定资源池中的节点。该接口适用于以下场景：当需要清理资源池中的冗余节点、重新分配资源或移除故障节点时，用户可通过此接口批量删除指定的节点。使用该接口的前提条件是资源池已创建且处于可用状态，用户具有删除节点的权限，且资源池中至少保留一个节点。删除操作完成后，指定的节点将被永久移除，资源池中剩余的节点将继续提供服务。若资源池不存在、节点不存在、用户无权限操作或资源池中节点不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoolNodesRequest 请求对象
     * @return CompletableFuture<BatchDeletePoolNodesResponse>
     */
    public CompletableFuture<BatchDeletePoolNodesResponse> batchDeletePoolNodesAsync(
        BatchDeletePoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchDeletePoolNodes);
    }

    /**
     * 批量删除节点
     *
     * 批量删除节点接口用于批量删除指定资源池中的节点。该接口适用于以下场景：当需要清理资源池中的冗余节点、重新分配资源或移除故障节点时，用户可通过此接口批量删除指定的节点。使用该接口的前提条件是资源池已创建且处于可用状态，用户具有删除节点的权限，且资源池中至少保留一个节点。删除操作完成后，指定的节点将被永久移除，资源池中剩余的节点将继续提供服务。若资源池不存在、节点不存在、用户无权限操作或资源池中节点不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchDeletePoolNodesRequest, BatchDeletePoolNodesResponse>
     */
    public AsyncInvoker<BatchDeletePoolNodesRequest, BatchDeletePoolNodesResponse> batchDeletePoolNodesAsyncInvoker(
        BatchDeletePoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchDeletePoolNodes, hcClient);
    }

    /**
     * 批量删除资源池标签
     *
     * 批量删除资源标签接口用于移除指定资源上的多个标签信息。该接口适用于以下场景：当需要清理冗余标签（如过期分类、无效元数据）、统一调整资源分类策略或因权限变更需批量移除标签时，管理员可通过此接口一次性删除多个标签。使用该接口的前提条件是目标资源必须已存在且处于可管理状态，调用者需具备资源标签管理权限，且待删除的标签必须已关联至该资源，系统标签管理服务需正常运行。操作完成后，指定标签将从资源中彻底移除，且不会影响资源的其他配置属性。若资源不存在、用户权限不足、标签未关联或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;、\&quot;400 Bad Request\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoolTagsRequest 请求对象
     * @return CompletableFuture<BatchDeletePoolTagsResponse>
     */
    public CompletableFuture<BatchDeletePoolTagsResponse> batchDeletePoolTagsAsync(BatchDeletePoolTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchDeletePoolTags);
    }

    /**
     * 批量删除资源池标签
     *
     * 批量删除资源标签接口用于移除指定资源上的多个标签信息。该接口适用于以下场景：当需要清理冗余标签（如过期分类、无效元数据）、统一调整资源分类策略或因权限变更需批量移除标签时，管理员可通过此接口一次性删除多个标签。使用该接口的前提条件是目标资源必须已存在且处于可管理状态，调用者需具备资源标签管理权限，且待删除的标签必须已关联至该资源，系统标签管理服务需正常运行。操作完成后，指定标签将从资源中彻底移除，且不会影响资源的其他配置属性。若资源不存在、用户权限不足、标签未关联或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;、\&quot;400 Bad Request\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoolTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePoolTagsRequest, BatchDeletePoolTagsResponse>
     */
    public AsyncInvoker<BatchDeletePoolTagsRequest, BatchDeletePoolTagsResponse> batchDeletePoolTagsAsyncInvoker(
        BatchDeletePoolTagsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchDeletePoolTags, hcClient);
    }

    /**
     * 批量对节点功能上锁
     *
     * 批量对节点功能上锁接口用于批量对指定节点的功能进行上锁操作，被上锁的功能在控制台将无法正常使用。该接口适用于以下场景：当需要临时禁用某些节点的功能以防止误操作、进行系统维护或测试时，用户可通过此接口批量对节点功能进行上锁。使用该接口的前提条件是节点功能已存在且用户具有管理员权限。上锁操作完成后，指定节点的功能将在控制台被禁用，无法进行相关操作。若节点功能不存在、用户无权限操作或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLockPoolNodesRequest 请求对象
     * @return CompletableFuture<BatchLockPoolNodesResponse>
     */
    public CompletableFuture<BatchLockPoolNodesResponse> batchLockPoolNodesAsync(BatchLockPoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchLockPoolNodes);
    }

    /**
     * 批量对节点功能上锁
     *
     * 批量对节点功能上锁接口用于批量对指定节点的功能进行上锁操作，被上锁的功能在控制台将无法正常使用。该接口适用于以下场景：当需要临时禁用某些节点的功能以防止误操作、进行系统维护或测试时，用户可通过此接口批量对节点功能进行上锁。使用该接口的前提条件是节点功能已存在且用户具有管理员权限。上锁操作完成后，指定节点的功能将在控制台被禁用，无法进行相关操作。若节点功能不存在、用户无权限操作或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLockPoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchLockPoolNodesRequest, BatchLockPoolNodesResponse>
     */
    public AsyncInvoker<BatchLockPoolNodesRequest, BatchLockPoolNodesResponse> batchLockPoolNodesAsyncInvoker(
        BatchLockPoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchLockPoolNodes, hcClient);
    }

    /**
     * 批量迁移节点
     *
     * 批量迁移节点接口用于在资源池之间批量迁移节点，将节点从一个资源池迁移到另一个资源池。该接口适用于以下场景：当资源池的节点分布不均衡、需要进行集群维护或业务扩展时，用户可通过此接口将指定节点从一个资源池迁移到另一个资源池。使用该接口的前提条件是资源池中至少包含两个节点，且目标资源池具备足够的资源容量（如IP地址等）以接收迁移节点。若资源池只有一个节点、目标集群资源不足、节点状态不支持迁移或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigratePoolNodesRequest 请求对象
     * @return CompletableFuture<BatchMigratePoolNodesResponse>
     */
    public CompletableFuture<BatchMigratePoolNodesResponse> batchMigratePoolNodesAsync(
        BatchMigratePoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchMigratePoolNodes);
    }

    /**
     * 批量迁移节点
     *
     * 批量迁移节点接口用于在资源池之间批量迁移节点，将节点从一个资源池迁移到另一个资源池。该接口适用于以下场景：当资源池的节点分布不均衡、需要进行集群维护或业务扩展时，用户可通过此接口将指定节点从一个资源池迁移到另一个资源池。使用该接口的前提条件是资源池中至少包含两个节点，且目标资源池具备足够的资源容量（如IP地址等）以接收迁移节点。若资源池只有一个节点、目标集群资源不足、节点状态不支持迁移或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigratePoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchMigratePoolNodesRequest, BatchMigratePoolNodesResponse>
     */
    public AsyncInvoker<BatchMigratePoolNodesRequest, BatchMigratePoolNodesResponse> batchMigratePoolNodesAsyncInvoker(
        BatchMigratePoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchMigratePoolNodes, hcClient);
    }

    /**
     * 批量重启节点
     *
     * 批量重启节点接口用于批量重启指定资源池中的节点。该接口适用于以下场景：当需要对资源池中的节点进行系统更新、配置变更、故障恢复或维护操作时，用户可通过此接口批量重启指定的节点。使用该接口的前提条件是资源池已创建且处于可用状态，节点属于该资源池且处于运行状态，且用户具有重启节点的权限。重启操作完成后，指定的节点将被重新启动，资源池中的其他节点将继续正常运行。若资源池不存在、节点不在资源池中、节点未处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootPoolNodesRequest 请求对象
     * @return CompletableFuture<BatchRebootPoolNodesResponse>
     */
    public CompletableFuture<BatchRebootPoolNodesResponse> batchRebootPoolNodesAsync(
        BatchRebootPoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchRebootPoolNodes);
    }

    /**
     * 批量重启节点
     *
     * 批量重启节点接口用于批量重启指定资源池中的节点。该接口适用于以下场景：当需要对资源池中的节点进行系统更新、配置变更、故障恢复或维护操作时，用户可通过此接口批量重启指定的节点。使用该接口的前提条件是资源池已创建且处于可用状态，节点属于该资源池且处于运行状态，且用户具有重启节点的权限。重启操作完成后，指定的节点将被重新启动，资源池中的其他节点将继续正常运行。若资源池不存在、节点不在资源池中、节点未处于运行状态或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootPoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchRebootPoolNodesRequest, BatchRebootPoolNodesResponse>
     */
    public AsyncInvoker<BatchRebootPoolNodesRequest, BatchRebootPoolNodesResponse> batchRebootPoolNodesAsyncInvoker(
        BatchRebootPoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchRebootPoolNodes, hcClient);
    }

    /**
     * 重置节点
     *
     * 重置节点接口用于将指定节点恢复到初始状态，清除节点上的数据和配置。该接口适用于以下场景：当节点出现故障、配置错误、需要重新部署或进行系统恢复时，用户可通过此接口重置节点，使其恢复到出厂或初始状态。使用该接口的前提条件是节点已存在且用户具有管理员权限。重置操作完成后，节点上的所有数据和配置将被清除，节点将被重新启动并恢复到初始状态。若节点不存在、用户无权限操作或节点处于不可重置状态（如正在运行任务），接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetPoolNodesRequest 请求对象
     * @return CompletableFuture<BatchResetPoolNodesResponse>
     */
    public CompletableFuture<BatchResetPoolNodesResponse> batchResetPoolNodesAsync(BatchResetPoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchResetPoolNodes);
    }

    /**
     * 重置节点
     *
     * 重置节点接口用于将指定节点恢复到初始状态，清除节点上的数据和配置。该接口适用于以下场景：当节点出现故障、配置错误、需要重新部署或进行系统恢复时，用户可通过此接口重置节点，使其恢复到出厂或初始状态。使用该接口的前提条件是节点已存在且用户具有管理员权限。重置操作完成后，节点上的所有数据和配置将被清除，节点将被重新启动并恢复到初始状态。若节点不存在、用户无权限操作或节点处于不可重置状态（如正在运行任务），接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetPoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchResetPoolNodesRequest, BatchResetPoolNodesResponse>
     */
    public AsyncInvoker<BatchResetPoolNodesRequest, BatchResetPoolNodesResponse> batchResetPoolNodesAsyncInvoker(
        BatchResetPoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchResetPoolNodes, hcClient);
    }

    /**
     * 节点规格变更
     *
     * 节点规格变更接口用于调整指定节点的规格（如步长），例如将节点从8节点超节点扩容到16节点超节点。该接口适用于以下场景：当需要根据业务需求调整节点的资源容量、优化资源利用率或进行系统升级时，用户可通过此接口变更节点的规格。使用该接口的前提条件是节点已创建且处于可变更状态，目标规格在支持范围内，且用户具有管理员权限。规格变更完成后，节点的资源容量将按新规格调整，相关服务和配置将重新加载以适应新的规格。若节点不存在、节点状态不允许变更、目标规格不支持或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResizePoolNodesRequest 请求对象
     * @return CompletableFuture<BatchResizePoolNodesResponse>
     */
    public CompletableFuture<BatchResizePoolNodesResponse> batchResizePoolNodesAsync(
        BatchResizePoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchResizePoolNodes);
    }

    /**
     * 节点规格变更
     *
     * 节点规格变更接口用于调整指定节点的规格（如步长），例如将节点从8节点超节点扩容到16节点超节点。该接口适用于以下场景：当需要根据业务需求调整节点的资源容量、优化资源利用率或进行系统升级时，用户可通过此接口变更节点的规格。使用该接口的前提条件是节点已创建且处于可变更状态，目标规格在支持范围内，且用户具有管理员权限。规格变更完成后，节点的资源容量将按新规格调整，相关服务和配置将重新加载以适应新的规格。若节点不存在、节点状态不允许变更、目标规格不支持或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResizePoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchResizePoolNodesRequest, BatchResizePoolNodesResponse>
     */
    public AsyncInvoker<BatchResizePoolNodesRequest, BatchResizePoolNodesResponse> batchResizePoolNodesAsyncInvoker(
        BatchResizePoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchResizePoolNodes, hcClient);
    }

    /**
     * 批量对节点功能解锁
     *
     * 批量对节点功能解锁接口用于批量解除指定节点功能的锁定状态，使被上锁的功能在控制台恢复正常可用状态。该接口适用于以下场景：当需要恢复被锁定的节点功能以正常使用、完成系统维护或测试后，用户可通过此接口批量对节点功能进行解锁。使用该接口的前提条件是节点功能已被上锁且用户具有管理员权限。解锁操作完成后，指定节点的功能将在控制台恢复正常，用户可以正常使用相关功能。若节点功能未被锁定、用户无权限操作或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnlockPoolNodesRequest 请求对象
     * @return CompletableFuture<BatchUnlockPoolNodesResponse>
     */
    public CompletableFuture<BatchUnlockPoolNodesResponse> batchUnlockPoolNodesAsync(
        BatchUnlockPoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchUnlockPoolNodes);
    }

    /**
     * 批量对节点功能解锁
     *
     * 批量对节点功能解锁接口用于批量解除指定节点功能的锁定状态，使被上锁的功能在控制台恢复正常可用状态。该接口适用于以下场景：当需要恢复被锁定的节点功能以正常使用、完成系统维护或测试后，用户可通过此接口批量对节点功能进行解锁。使用该接口的前提条件是节点功能已被上锁且用户具有管理员权限。解锁操作完成后，指定节点的功能将在控制台恢复正常，用户可以正常使用相关功能。若节点功能未被锁定、用户无权限操作或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnlockPoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchUnlockPoolNodesRequest, BatchUnlockPoolNodesResponse>
     */
    public AsyncInvoker<BatchUnlockPoolNodesRequest, BatchUnlockPoolNodesResponse> batchUnlockPoolNodesAsyncInvoker(
        BatchUnlockPoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchUnlockPoolNodes, hcClient);
    }

    /**
     * 批量更新节点
     *
     * 批量更新节点接口用于同时修改多个节点的配置或属性，支持批量操作时各节点独立执行更新流程。该接口适用于以下场景：当用户需统一升级节点软件版本、批量处理选中节点的资源标签、调整资源分配策略、应用安全补丁或同步配置变更时，可通过此接口批量更新目标节点，确保每个节点的更新过程互不影响。使用该接口的前提条件包括：目标节点已存在且用户具备管理员权限，节点需处于可操作状态（如非锁定或维护中），批量操作时需提供有效的节点列表及更新参数（如配置项、版本号等）作为输入。操作完成后，指定节点将应用新配置并更新状态为可用，原有配置将被覆盖。若节点不存在、用户权限不足、节点状态异常（如正在维护）、更新参数不合规或输入参数缺失，接口将返回对应错误信息（如404未找到节点、403权限拒绝、400参数校验失败等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePoolNodesRequest 请求对象
     * @return CompletableFuture<BatchUpdatePoolNodesResponse>
     */
    public CompletableFuture<BatchUpdatePoolNodesResponse> batchUpdatePoolNodesAsync(
        BatchUpdatePoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.batchUpdatePoolNodes);
    }

    /**
     * 批量更新节点
     *
     * 批量更新节点接口用于同时修改多个节点的配置或属性，支持批量操作时各节点独立执行更新流程。该接口适用于以下场景：当用户需统一升级节点软件版本、批量处理选中节点的资源标签、调整资源分配策略、应用安全补丁或同步配置变更时，可通过此接口批量更新目标节点，确保每个节点的更新过程互不影响。使用该接口的前提条件包括：目标节点已存在且用户具备管理员权限，节点需处于可操作状态（如非锁定或维护中），批量操作时需提供有效的节点列表及更新参数（如配置项、版本号等）作为输入。操作完成后，指定节点将应用新配置并更新状态为可用，原有配置将被覆盖。若节点不存在、用户权限不足、节点状态异常（如正在维护）、更新参数不合规或输入参数缺失，接口将返回对应错误信息（如404未找到节点、403权限拒绝、400参数校验失败等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePoolNodesRequest 请求对象
     * @return AsyncInvoker<BatchUpdatePoolNodesRequest, BatchUpdatePoolNodesResponse>
     */
    public AsyncInvoker<BatchUpdatePoolNodesRequest, BatchUpdatePoolNodesResponse> batchUpdatePoolNodesAsyncInvoker(
        BatchUpdatePoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.batchUpdatePoolNodes, hcClient);
    }

    /**
     * 更新算法
     *
     * 更新算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlgorithmRequest 请求对象
     * @return CompletableFuture<ChangeAlgorithmResponse>
     */
    public CompletableFuture<ChangeAlgorithmResponse> changeAlgorithmAsync(ChangeAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.changeAlgorithm);
    }

    /**
     * 更新算法
     *
     * 更新算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlgorithmRequest 请求对象
     * @return AsyncInvoker<ChangeAlgorithmRequest, ChangeAlgorithmResponse>
     */
    public AsyncInvoker<ChangeAlgorithmRequest, ChangeAlgorithmResponse> changeAlgorithmAsyncInvoker(
        ChangeAlgorithmRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.changeAlgorithm, hcClient);
    }

    /**
     * 更新训练实验信息
     *
     * 通过实验ID更新训练实验信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTrainingExperimentRequest 请求对象
     * @return CompletableFuture<ChangeTrainingExperimentResponse>
     */
    public CompletableFuture<ChangeTrainingExperimentResponse> changeTrainingExperimentAsync(
        ChangeTrainingExperimentRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.changeTrainingExperiment);
    }

    /**
     * 更新训练实验信息
     *
     * 通过实验ID更新训练实验信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTrainingExperimentRequest 请求对象
     * @return AsyncInvoker<ChangeTrainingExperimentRequest, ChangeTrainingExperimentResponse>
     */
    public AsyncInvoker<ChangeTrainingExperimentRequest, ChangeTrainingExperimentResponse> changeTrainingExperimentAsyncInvoker(
        ChangeTrainingExperimentRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.changeTrainingExperiment, hcClient);
    }

    /**
     * 更新训练作业描述
     *
     * 更新训练作业描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTrainingJobDescriptionRequest 请求对象
     * @return CompletableFuture<ChangeTrainingJobDescriptionResponse>
     */
    public CompletableFuture<ChangeTrainingJobDescriptionResponse> changeTrainingJobDescriptionAsync(
        ChangeTrainingJobDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.changeTrainingJobDescription);
    }

    /**
     * 更新训练作业描述
     *
     * 更新训练作业描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTrainingJobDescriptionRequest 请求对象
     * @return AsyncInvoker<ChangeTrainingJobDescriptionRequest, ChangeTrainingJobDescriptionResponse>
     */
    public AsyncInvoker<ChangeTrainingJobDescriptionRequest, ChangeTrainingJobDescriptionResponse> changeTrainingJobDescriptionAsyncInvoker(
        ChangeTrainingJobDescriptionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.changeTrainingJobDescription, hcClient);
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
     * @return CompletableFuture<CheckTrainingExperimentResponse>
     */
    public CompletableFuture<CheckTrainingExperimentResponse> checkTrainingExperimentAsync(
        CheckTrainingExperimentRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.checkTrainingExperiment);
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
     * @return AsyncInvoker<CheckTrainingExperimentRequest, CheckTrainingExperimentResponse>
     */
    public AsyncInvoker<CheckTrainingExperimentRequest, CheckTrainingExperimentResponse> checkTrainingExperimentAsyncInvoker(
        CheckTrainingExperimentRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.checkTrainingExperiment, hcClient);
    }

    /**
     * 创建算法
     *
     * 创建一个算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmRequest 请求对象
     * @return CompletableFuture<CreateAlgorithmResponse>
     */
    public CompletableFuture<CreateAlgorithmResponse> createAlgorithmAsync(CreateAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createAlgorithm);
    }

    /**
     * 创建算法
     *
     * 创建一个算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlgorithmRequest 请求对象
     * @return AsyncInvoker<CreateAlgorithmRequest, CreateAlgorithmResponse>
     */
    public AsyncInvoker<CreateAlgorithmRequest, CreateAlgorithmResponse> createAlgorithmAsyncInvoker(
        CreateAlgorithmRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createAlgorithm, hcClient);
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
     * @return CompletableFuture<CreateAlgorithmVersionToGalleryResponse>
     */
    public CompletableFuture<CreateAlgorithmVersionToGalleryResponse> createAlgorithmVersionToGalleryAsync(
        CreateAlgorithmVersionToGalleryRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createAlgorithmVersionToGallery);
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
     * @return AsyncInvoker<CreateAlgorithmVersionToGalleryRequest, CreateAlgorithmVersionToGalleryResponse>
     */
    public AsyncInvoker<CreateAlgorithmVersionToGalleryRequest, CreateAlgorithmVersionToGalleryResponse> createAlgorithmVersionToGalleryAsyncInvoker(
        CreateAlgorithmVersionToGalleryRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createAlgorithmVersionToGallery, hcClient);
    }

    /**
     * 配置授权
     *
     * 配置授权接口用于配置ModelArts的授权。该接口适用于以下场景：当需要为IAM子用户设置访问ModelArts的权限时，管理员可通过此接口配置授权。使用该接口的前提条件是管理员具备IAM系统的Security Administrator权限，并且需要为子用户设置访问密钥。配置完成后，子用户将被授予访问ModelArts资源的权限，从而能够正常使用训练管理、开发环境、数据管理、在线服务等功能。若管理员无权限操作或子用户不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizationRequest 请求对象
     * @return CompletableFuture<CreateAuthorizationResponse>
     */
    public CompletableFuture<CreateAuthorizationResponse> createAuthorizationAsync(CreateAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createAuthorization);
    }

    /**
     * 配置授权
     *
     * 配置授权接口用于配置ModelArts的授权。该接口适用于以下场景：当需要为IAM子用户设置访问ModelArts的权限时，管理员可通过此接口配置授权。使用该接口的前提条件是管理员具备IAM系统的Security Administrator权限，并且需要为子用户设置访问密钥。配置完成后，子用户将被授予访问ModelArts资源的权限，从而能够正常使用训练管理、开发环境、数据管理、在线服务等功能。若管理员无权限操作或子用户不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizationRequest 请求对象
     * @return AsyncInvoker<CreateAuthorizationRequest, CreateAuthorizationResponse>
     */
    public AsyncInvoker<CreateAuthorizationRequest, CreateAuthorizationResponse> createAuthorizationAsyncInvoker(
        CreateAuthorizationRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createAuthorization, hcClient);
    }

    /**
     * 创建ModelArts委托
     *
     * 创建ModelArts委托接口用于创建包含OBS、SWR、IEF等依赖服务的ModelArts委托。该接口适用于以下场景：当需要配置ModelArts访问OBS、SWR、IEF等服务的权限时，用户可通过此接口创建委托。使用该接口的前提条件是用户具备创建委托的权限，并且需要在IAM系统中具备相应的权限。创建完成后，ModelArts将被授权访问OBS、SWR、IEF等服务，从而能够正常执行数据存储、镜像拉取、模型部署等功能。若用户无权限创建委托或依赖服务未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelArtsAgencyRequest 请求对象
     * @return CompletableFuture<CreateModelArtsAgencyResponse>
     */
    public CompletableFuture<CreateModelArtsAgencyResponse> createModelArtsAgencyAsync(
        CreateModelArtsAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createModelArtsAgency);
    }

    /**
     * 创建ModelArts委托
     *
     * 创建ModelArts委托接口用于创建包含OBS、SWR、IEF等依赖服务的ModelArts委托。该接口适用于以下场景：当需要配置ModelArts访问OBS、SWR、IEF等服务的权限时，用户可通过此接口创建委托。使用该接口的前提条件是用户具备创建委托的权限，并且需要在IAM系统中具备相应的权限。创建完成后，ModelArts将被授权访问OBS、SWR、IEF等服务，从而能够正常执行数据存储、镜像拉取、模型部署等功能。若用户无权限创建委托或依赖服务未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelArtsAgencyRequest 请求对象
     * @return AsyncInvoker<CreateModelArtsAgencyRequest, CreateModelArtsAgencyResponse>
     */
    public AsyncInvoker<CreateModelArtsAgencyRequest, CreateModelArtsAgencyResponse> createModelArtsAgencyAsyncInvoker(
        CreateModelArtsAgencyRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createModelArtsAgency, hcClient);
    }

    /**
     * 创建网络资源
     *
     * 创建网络资源接口用于在系统中创建新的网络资源。该接口适用于以下场景：当需要为业务扩展、资源规划或网络架构调整时，用户可通过此接口创建新的网络资源，如虚拟网络、子网或路由等。使用该接口的前提条件是用户具有管理员权限，并且系统中具备足够的资源支持新网络资源的创建。创建操作完成后，新的网络资源将被成功添加到系统中，并可用于后续的业务配置。若用户无权限、资源不足或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkRequest 请求对象
     * @return CompletableFuture<CreateNetworkResponse>
     */
    public CompletableFuture<CreateNetworkResponse> createNetworkAsync(CreateNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createNetwork);
    }

    /**
     * 创建网络资源
     *
     * 创建网络资源接口用于在系统中创建新的网络资源。该接口适用于以下场景：当需要为业务扩展、资源规划或网络架构调整时，用户可通过此接口创建新的网络资源，如虚拟网络、子网或路由等。使用该接口的前提条件是用户具有管理员权限，并且系统中具备足够的资源支持新网络资源的创建。创建操作完成后，新的网络资源将被成功添加到系统中，并可用于后续的业务配置。若用户无权限、资源不足或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkRequest 请求对象
     * @return AsyncInvoker<CreateNetworkRequest, CreateNetworkResponse>
     */
    public AsyncInvoker<CreateNetworkRequest, CreateNetworkResponse> createNetworkAsyncInvoker(
        CreateNetworkRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createNetwork, hcClient);
    }

    /**
     * 创建节点池
     *
     * 创建节点池接口用于创建新的节点池。该接口适用于以下场景：当需要扩展计算资源、优化资源分配或部署新的服务时，用户可通过此接口创建指定配置的节点池。使用该接口的前提条件是用户具有管理员权限且节点池的配置参数（如节点数量、规格、网络配置等）已正确设置。创建操作完成后，节点池将被成功创建并处于可用状态，相关节点信息将被记录。若用户无权限操作、配置参数错误或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNodePoolRequest 请求对象
     * @return CompletableFuture<CreateNodePoolResponse>
     */
    public CompletableFuture<CreateNodePoolResponse> createNodePoolAsync(CreateNodePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createNodePool);
    }

    /**
     * 创建节点池
     *
     * 创建节点池接口用于创建新的节点池。该接口适用于以下场景：当需要扩展计算资源、优化资源分配或部署新的服务时，用户可通过此接口创建指定配置的节点池。使用该接口的前提条件是用户具有管理员权限且节点池的配置参数（如节点数量、规格、网络配置等）已正确设置。创建操作完成后，节点池将被成功创建并处于可用状态，相关节点信息将被记录。若用户无权限操作、配置参数错误或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNodePoolRequest 请求对象
     * @return AsyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>
     */
    public AsyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse> createNodePoolAsyncInvoker(
        CreateNodePoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createNodePool, hcClient);
    }

    /**
     * 创建资源池的订单id
     *
     * 创建资源池订单ID接口用于生成资源池申请的订单标识。该接口适用于以下场景：当用户需要申请新资源池时（如业务扩展、资源不足或临时资源需求），可通过此接口提交按需转包周期订单的创建请求。使用该接口的前提条件是用户需具备资源申请权限，提交的资源池配置参数（如资源类型、容量、周期等）需符合系统校验规则，且当前仅支持按需转包周期订单类型。订单创建成功后，系统将生成唯一订单ID并触发后续资源分配流程，同时记录操作日志。若用户权限不足、配置参数缺失/冲突（如容量超出配额）、订单类型不支持或系统资源不足，接口将返回对应错误码及提示信息，且不会生成订单ID或占用资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderIdRequest 请求对象
     * @return CompletableFuture<CreateOrderIdResponse>
     */
    public CompletableFuture<CreateOrderIdResponse> createOrderIdAsync(CreateOrderIdRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createOrderId);
    }

    /**
     * 创建资源池的订单id
     *
     * 创建资源池订单ID接口用于生成资源池申请的订单标识。该接口适用于以下场景：当用户需要申请新资源池时（如业务扩展、资源不足或临时资源需求），可通过此接口提交按需转包周期订单的创建请求。使用该接口的前提条件是用户需具备资源申请权限，提交的资源池配置参数（如资源类型、容量、周期等）需符合系统校验规则，且当前仅支持按需转包周期订单类型。订单创建成功后，系统将生成唯一订单ID并触发后续资源分配流程，同时记录操作日志。若用户权限不足、配置参数缺失/冲突（如容量超出配额）、订单类型不支持或系统资源不足，接口将返回对应错误码及提示信息，且不会生成订单ID或占用资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderIdRequest 请求对象
     * @return AsyncInvoker<CreateOrderIdRequest, CreateOrderIdResponse>
     */
    public AsyncInvoker<CreateOrderIdRequest, CreateOrderIdResponse> createOrderIdAsyncInvoker(
        CreateOrderIdRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createOrderId, hcClient);
    }

    /**
     * 创建资源池
     *
     * 创建资源池接口用于在系统中创建新的资源池。该接口适用于以下场景：当需要为新业务分配资源、优化资源管理或进行资源隔离时，用户可通过此接口创建新的资源池，用于管理计算、存储、网络等资源。使用该接口的前提条件是用户具有管理员权限，并且系统中具备足够的资源支持新资源池的创建。创建操作完成后，新的资源池将被成功添加到系统中，并处于可用状态，可支持后续的资源分配和管理。若用户无权限、系统资源不足或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolRequest 请求对象
     * @return CompletableFuture<CreatePoolResponse>
     */
    public CompletableFuture<CreatePoolResponse> createPoolAsync(CreatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createPool);
    }

    /**
     * 创建资源池
     *
     * 创建资源池接口用于在系统中创建新的资源池。该接口适用于以下场景：当需要为新业务分配资源、优化资源管理或进行资源隔离时，用户可通过此接口创建新的资源池，用于管理计算、存储、网络等资源。使用该接口的前提条件是用户具有管理员权限，并且系统中具备足够的资源支持新资源池的创建。创建操作完成后，新的资源池将被成功添加到系统中，并处于可用状态，可支持后续的资源分配和管理。若用户无权限、系统资源不足或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolRequest 请求对象
     * @return AsyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public AsyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolAsyncInvoker(CreatePoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createPool, hcClient);
    }

    /**
     * 创建插件
     *
     * 创建插件实例接口用于在系统中创建一个新的插件实例。该接口适用于以下场景：当需要扩展系统功能、部署新的插件、更新现有插件配置或测试插件时，用户可通过此接口创建指定插件的实例。使用该接口的前提条件是插件已存在且用户具有管理员权限或插件管理权限。创建操作完成后，插件实例将被成功创建并处于可用状态，相关配置信息将被记录。若插件不存在、用户无权限操作、配置参数错误或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolPluginRequest 请求对象
     * @return CompletableFuture<CreatePoolPluginResponse>
     */
    public CompletableFuture<CreatePoolPluginResponse> createPoolPluginAsync(CreatePoolPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createPoolPlugin);
    }

    /**
     * 创建插件
     *
     * 创建插件实例接口用于在系统中创建一个新的插件实例。该接口适用于以下场景：当需要扩展系统功能、部署新的插件、更新现有插件配置或测试插件时，用户可通过此接口创建指定插件的实例。使用该接口的前提条件是插件已存在且用户具有管理员权限或插件管理权限。创建操作完成后，插件实例将被成功创建并处于可用状态，相关配置信息将被记录。若插件不存在、用户无权限操作、配置参数错误或系统资源不足，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolPluginRequest 请求对象
     * @return AsyncInvoker<CreatePoolPluginRequest, CreatePoolPluginResponse>
     */
    public AsyncInvoker<CreatePoolPluginRequest, CreatePoolPluginResponse> createPoolPluginAsyncInvoker(
        CreatePoolPluginRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createPoolPlugin, hcClient);
    }

    /**
     * 创建训练作业镜像保存任务
     *
     * 创建训练作业镜像保存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSaveImageJobRequest 请求对象
     * @return CompletableFuture<CreateSaveImageJobResponse>
     */
    public CompletableFuture<CreateSaveImageJobResponse> createSaveImageJobAsync(CreateSaveImageJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createSaveImageJob);
    }

    /**
     * 创建训练作业镜像保存任务
     *
     * 创建训练作业镜像保存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSaveImageJobRequest 请求对象
     * @return AsyncInvoker<CreateSaveImageJobRequest, CreateSaveImageJobResponse>
     */
    public AsyncInvoker<CreateSaveImageJobRequest, CreateSaveImageJobResponse> createSaveImageJobAsyncInvoker(
        CreateSaveImageJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createSaveImageJob, hcClient);
    }

    /**
     * 创建训练作业标签
     *
     * 创建训练作业标签，支持批量添加，当添加的标签key已存在，则覆盖该标签的value。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainJobTagsRequest 请求对象
     * @return CompletableFuture<CreateTrainJobTagsResponse>
     */
    public CompletableFuture<CreateTrainJobTagsResponse> createTrainJobTagsAsync(CreateTrainJobTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createTrainJobTags);
    }

    /**
     * 创建训练作业标签
     *
     * 创建训练作业标签，支持批量添加，当添加的标签key已存在，则覆盖该标签的value。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainJobTagsRequest 请求对象
     * @return AsyncInvoker<CreateTrainJobTagsRequest, CreateTrainJobTagsResponse>
     */
    public AsyncInvoker<CreateTrainJobTagsRequest, CreateTrainJobTagsResponse> createTrainJobTagsAsyncInvoker(
        CreateTrainJobTagsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createTrainJobTags, hcClient);
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
     * @return CompletableFuture<CreateTrainingExperimentResponse>
     */
    public CompletableFuture<CreateTrainingExperimentResponse> createTrainingExperimentAsync(
        CreateTrainingExperimentRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createTrainingExperiment);
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
     * @return AsyncInvoker<CreateTrainingExperimentRequest, CreateTrainingExperimentResponse>
     */
    public AsyncInvoker<CreateTrainingExperimentRequest, CreateTrainingExperimentResponse> createTrainingExperimentAsyncInvoker(
        CreateTrainingExperimentRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createTrainingExperiment, hcClient);
    }

    /**
     * 创建训练作业
     *
     * 创建训练作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingJobRequest 请求对象
     * @return CompletableFuture<CreateTrainingJobResponse>
     */
    public CompletableFuture<CreateTrainingJobResponse> createTrainingJobAsync(CreateTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createTrainingJob);
    }

    /**
     * 创建训练作业
     *
     * 创建训练作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingJobRequest 请求对象
     * @return AsyncInvoker<CreateTrainingJobRequest, CreateTrainingJobResponse>
     */
    public AsyncInvoker<CreateTrainingJobRequest, CreateTrainingJobResponse> createTrainingJobAsyncInvoker(
        CreateTrainingJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createTrainingJob, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间（\&quot;default\&quot;为系统预留的默认工作空间名称，不能使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CompletableFuture<CreateWorkspaceResponse>
     */
    public CompletableFuture<CreateWorkspaceResponse> createWorkspaceAsync(CreateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkspace);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间（\&quot;default\&quot;为系统预留的默认工作空间名称，不能使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceAsyncInvoker(
        CreateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkspace, hcClient);
    }

    /**
     * 删除算法
     *
     * 删除算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmRequest 请求对象
     * @return CompletableFuture<DeleteAlgorithmResponse>
     */
    public CompletableFuture<DeleteAlgorithmResponse> deleteAlgorithmAsync(DeleteAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteAlgorithm);
    }

    /**
     * 删除算法
     *
     * 删除算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlgorithmRequest 请求对象
     * @return AsyncInvoker<DeleteAlgorithmRequest, DeleteAlgorithmResponse>
     */
    public AsyncInvoker<DeleteAlgorithmRequest, DeleteAlgorithmResponse> deleteAlgorithmAsyncInvoker(
        DeleteAlgorithmRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteAlgorithm, hcClient);
    }

    /**
     * 删除授权
     *
     * 删除授权接口用于删除指定用户的授权或删除全量用户的授权。该接口适用于以下场景：当需要撤销特定用户的访问权限或在系统维护时清理所有用户的授权时，管理员可通过此接口删除指定用户的授权或全量用户的授权。使用该接口的前提条件是管理员具备删除授权的权限，并且需要指定要删除授权的用户或选择删除全量用户的授权。删除操作完成后，指定用户的授权将被移除，或所有用户的授权将被清空，用户将无法再访问相关功能。若用户不存在、管理员无权限操作或删除全量授权时系统检测到无管理员权限，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorizationsRequest 请求对象
     * @return CompletableFuture<DeleteAuthorizationsResponse>
     */
    public CompletableFuture<DeleteAuthorizationsResponse> deleteAuthorizationsAsync(
        DeleteAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteAuthorizations);
    }

    /**
     * 删除授权
     *
     * 删除授权接口用于删除指定用户的授权或删除全量用户的授权。该接口适用于以下场景：当需要撤销特定用户的访问权限或在系统维护时清理所有用户的授权时，管理员可通过此接口删除指定用户的授权或全量用户的授权。使用该接口的前提条件是管理员具备删除授权的权限，并且需要指定要删除授权的用户或选择删除全量用户的授权。删除操作完成后，指定用户的授权将被移除，或所有用户的授权将被清空，用户将无法再访问相关功能。若用户不存在、管理员无权限操作或删除全量授权时系统检测到无管理员权限，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorizationsRequest 请求对象
     * @return AsyncInvoker<DeleteAuthorizationsRequest, DeleteAuthorizationsResponse>
     */
    public AsyncInvoker<DeleteAuthorizationsRequest, DeleteAuthorizationsResponse> deleteAuthorizationsAsyncInvoker(
        DeleteAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteAuthorizations, hcClient);
    }

    /**
     * 删除网络资源
     *
     * 删除网络资源接口用于移除指定的网络资源。该接口适用于以下场景：当网络资源不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的网络资源。使用该接口的前提条件是网络资源已存在且用户具有管理员权限。删除操作完成后，指定的网络资源将被永久移除，相关配置和关联关系也将被清理。若指定的网络资源不存在、用户无权限操作或资源被其他资源依赖，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkRequest 请求对象
     * @return CompletableFuture<DeleteNetworkResponse>
     */
    public CompletableFuture<DeleteNetworkResponse> deleteNetworkAsync(DeleteNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteNetwork);
    }

    /**
     * 删除网络资源
     *
     * 删除网络资源接口用于移除指定的网络资源。该接口适用于以下场景：当网络资源不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的网络资源。使用该接口的前提条件是网络资源已存在且用户具有管理员权限。删除操作完成后，指定的网络资源将被永久移除，相关配置和关联关系也将被清理。若指定的网络资源不存在、用户无权限操作或资源被其他资源依赖，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkRequest 请求对象
     * @return AsyncInvoker<DeleteNetworkRequest, DeleteNetworkResponse>
     */
    public AsyncInvoker<DeleteNetworkRequest, DeleteNetworkResponse> deleteNetworkAsyncInvoker(
        DeleteNetworkRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteNetwork, hcClient);
    }

    /**
     * 删除节点池
     *
     * 删除节点池接口用于移除已创建的节点池，包周期资源池不支持。该接口适用于以下场景：当节点池完成任务、配置错误或需要清理资源时，用户可通过此接口删除指定的节点池。使用该接口的前提条件是节点池已存在且用户具有管理员权限。删除操作完成后，节点池将被永久移除，相关资源和配置也将被清理。若节点池不存在、用户无权限操作或节点池处于不可删除状态（如包周期资源池或节点池正在使用中），接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodePoolRequest 请求对象
     * @return CompletableFuture<DeleteNodePoolResponse>
     */
    public CompletableFuture<DeleteNodePoolResponse> deleteNodePoolAsync(DeleteNodePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteNodePool);
    }

    /**
     * 删除节点池
     *
     * 删除节点池接口用于移除已创建的节点池，包周期资源池不支持。该接口适用于以下场景：当节点池完成任务、配置错误或需要清理资源时，用户可通过此接口删除指定的节点池。使用该接口的前提条件是节点池已存在且用户具有管理员权限。删除操作完成后，节点池将被永久移除，相关资源和配置也将被清理。若节点池不存在、用户无权限操作或节点池处于不可删除状态（如包周期资源池或节点池正在使用中），接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodePoolRequest 请求对象
     * @return AsyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>
     */
    public AsyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePoolAsyncInvoker(
        DeleteNodePoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteNodePool, hcClient);
    }

    /**
     * 删除资源池
     *
     * 删除资源池接口用于移除指定的资源池。该接口适用于以下场景：当资源池不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的资源池。使用该接口的前提条件是资源池已存在且用户具有管理员权限。删除操作完成后，指定的资源池将被永久移除，相关资源和配置也将被清理。若资源池不存在、用户无权限操作或资源池被其他资源依赖，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolRequest 请求对象
     * @return CompletableFuture<DeletePoolResponse>
     */
    public CompletableFuture<DeletePoolResponse> deletePoolAsync(DeletePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deletePool);
    }

    /**
     * 删除资源池
     *
     * 删除资源池接口用于移除指定的资源池。该接口适用于以下场景：当资源池不再需要、配置错误或需要清理资源时，用户可通过此接口删除指定的资源池。使用该接口的前提条件是资源池已存在且用户具有管理员权限。删除操作完成后，指定的资源池将被永久移除，相关资源和配置也将被清理。若资源池不存在、用户无权限操作或资源池被其他资源依赖，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolRequest 请求对象
     * @return AsyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public AsyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolAsyncInvoker(DeletePoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deletePool, hcClient);
    }

    /**
     * 删除训练作业标签
     *
     * 删除训练作业标签，支持批量删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainJobTagsRequest 请求对象
     * @return CompletableFuture<DeleteTrainJobTagsResponse>
     */
    public CompletableFuture<DeleteTrainJobTagsResponse> deleteTrainJobTagsAsync(DeleteTrainJobTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteTrainJobTags);
    }

    /**
     * 删除训练作业标签
     *
     * 删除训练作业标签，支持批量删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainJobTagsRequest 请求对象
     * @return AsyncInvoker<DeleteTrainJobTagsRequest, DeleteTrainJobTagsResponse>
     */
    public AsyncInvoker<DeleteTrainJobTagsRequest, DeleteTrainJobTagsResponse> deleteTrainJobTagsAsyncInvoker(
        DeleteTrainJobTagsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteTrainJobTags, hcClient);
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
     * @return CompletableFuture<DeleteTrainingExperimentResponse>
     */
    public CompletableFuture<DeleteTrainingExperimentResponse> deleteTrainingExperimentAsync(
        DeleteTrainingExperimentRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteTrainingExperiment);
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
     * @return AsyncInvoker<DeleteTrainingExperimentRequest, DeleteTrainingExperimentResponse>
     */
    public AsyncInvoker<DeleteTrainingExperimentRequest, DeleteTrainingExperimentResponse> deleteTrainingExperimentAsyncInvoker(
        DeleteTrainingExperimentRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteTrainingExperiment, hcClient);
    }

    /**
     * 删除训练作业
     *
     * 删除训练作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainingJobRequest 请求对象
     * @return CompletableFuture<DeleteTrainingJobResponse>
     */
    public CompletableFuture<DeleteTrainingJobResponse> deleteTrainingJobAsync(DeleteTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteTrainingJob);
    }

    /**
     * 删除训练作业
     *
     * 删除训练作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrainingJobRequest 请求对象
     * @return AsyncInvoker<DeleteTrainingJobRequest, DeleteTrainingJobResponse>
     */
    public AsyncInvoker<DeleteTrainingJobRequest, DeleteTrainingJobResponse> deleteTrainingJobAsyncInvoker(
        DeleteTrainingJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteTrainingJob, hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return CompletableFuture<DeleteWorkspaceResponse>
     */
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteWorkspace);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceAsyncInvoker(
        DeleteWorkspaceRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteWorkspace, hcClient);
    }

    /**
     * 查看授权列表
     *
     * 查看授权列表接口用于查看授权信息。该接口适用于以下场景：当用户需要了解当前的授权情况、审核权限分配或管理权限时，可通过此接口查看授权列表。使用该接口的前提条件是用户具备查看授权的权限。查看操作完成后，将返回授权列表，包括被授权的资源、授权类型以及授权内容等信息。若用户无权限查看或授权列表不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAuthorizationsRequest 请求对象
     * @return CompletableFuture<GetAuthorizationsResponse>
     */
    public CompletableFuture<GetAuthorizationsResponse> getAuthorizationsAsync(GetAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.getAuthorizations);
    }

    /**
     * 查看授权列表
     *
     * 查看授权列表接口用于查看授权信息。该接口适用于以下场景：当用户需要了解当前的授权情况、审核权限分配或管理权限时，可通过此接口查看授权列表。使用该接口的前提条件是用户具备查看授权的权限。查看操作完成后，将返回授权列表，包括被授权的资源、授权类型以及授权内容等信息。若用户无权限查看或授权列表不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAuthorizationsRequest 请求对象
     * @return AsyncInvoker<GetAuthorizationsRequest, GetAuthorizationsResponse>
     */
    public AsyncInvoker<GetAuthorizationsRequest, GetAuthorizationsResponse> getAuthorizationsAsyncInvoker(
        GetAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.getAuthorizations, hcClient);
    }

    /**
     * 查询算法列表
     *
     * 查询算法列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlgorithmsRequest 请求对象
     * @return CompletableFuture<ListAlgorithmsResponse>
     */
    public CompletableFuture<ListAlgorithmsResponse> listAlgorithmsAsync(ListAlgorithmsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listAlgorithms);
    }

    /**
     * 查询算法列表
     *
     * 查询算法列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlgorithmsRequest 请求对象
     * @return AsyncInvoker<ListAlgorithmsRequest, ListAlgorithmsResponse>
     */
    public AsyncInvoker<ListAlgorithmsRequest, ListAlgorithmsResponse> listAlgorithmsAsyncInvoker(
        ListAlgorithmsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listAlgorithms, hcClient);
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
     * @return CompletableFuture<ListEventCategoriesResponse>
     */
    public CompletableFuture<ListEventCategoriesResponse> listEventCategoriesAsync(ListEventCategoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listEventCategories);
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
     * @return AsyncInvoker<ListEventCategoriesRequest, ListEventCategoriesResponse>
     */
    public AsyncInvoker<ListEventCategoriesRequest, ListEventCategoriesResponse> listEventCategoriesAsyncInvoker(
        ListEventCategoriesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listEventCategories, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表接口用于获取系统中记录的事件信息。该接口适用于以下场景：当用户需要监控系统状态、排查问题或进行审计时，可通过此接口查询系统中发生的事件记录。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在事件记录。查询操作完成后，接口将返回事件列表，包含事件ID、类型、时间、描述等信息。若用户无权限、事件记录不存在或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listEvents);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表接口用于获取系统中记录的事件信息。该接口适用于以下场景：当用户需要监控系统状态、排查问题或进行审计时，可通过此接口查询系统中发生的事件记录。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在事件记录。查询操作完成后，接口将返回事件列表，包含事件ID、类型、时间、描述等信息。若用户无权限、事件记录不存在或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listEvents, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表接口用于获取当前用户下的任务列表。该接口适用于以下场景：当需要查看任务状态、管理任务进度或统计任务数量时，用户可通过此接口获取当前用户下所有任务的详细信息。使用该接口的前提条件是用户已登录系统且具有查看任务的权限。调用接口成功后，系统将返回当前用户下的任务列表，包括任务ID、名称、状态、创建时间等信息。若用户未登录、无权限访问或系统中未配置任务，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listJobs);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表接口用于获取当前用户下的任务列表。该接口适用于以下场景：当需要查看任务状态、管理任务进度或统计任务数量时，用户可通过此接口获取当前用户下所有任务的详细信息。使用该接口的前提条件是用户已登录系统且具有查看任务的权限。调用接口成功后，系统将返回当前用户下的任务列表，包括任务ID、名称、状态、创建时间等信息。若用户未登录、无权限访问或系统中未配置任务，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listJobs, hcClient);
    }

    /**
     * 查询网络资源列表
     *
     * 查询网络资源列表接口用于获取系统中已创建的网络资源信息。该接口适用于以下场景：当用户需要监控网络状态、进行资源规划、排查网络问题或进行审计时，可通过此接口查询系统中现有的网络资源列表。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在网络资源。查询操作完成后，接口将返回网络资源列表，包含资源ID、类型、状态、创建时间等详细信息。若用户无权限、系统中无网络资源或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworksRequest 请求对象
     * @return CompletableFuture<ListNetworksResponse>
     */
    public CompletableFuture<ListNetworksResponse> listNetworksAsync(ListNetworksRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listNetworks);
    }

    /**
     * 查询网络资源列表
     *
     * 查询网络资源列表接口用于获取系统中已创建的网络资源信息。该接口适用于以下场景：当用户需要监控网络状态、进行资源规划、排查网络问题或进行审计时，可通过此接口查询系统中现有的网络资源列表。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在网络资源。查询操作完成后，接口将返回网络资源列表，包含资源ID、类型、状态、创建时间等详细信息。若用户无权限、系统中无网络资源或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworksRequest 请求对象
     * @return AsyncInvoker<ListNetworksRequest, ListNetworksResponse>
     */
    public AsyncInvoker<ListNetworksRequest, ListNetworksResponse> listNetworksAsyncInvoker(
        ListNetworksRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listNetworks, hcClient);
    }

    /**
     * 查询节点池的节点列表
     *
     * 查询节点池的节点列表接口用于获取指定节点池中所有节点的详细信息。该接口适用于以下场景：当需要查看节点池的节点状态、资源使用情况或管理节点资源时，用户可通过此接口获取节点池中节点的详细信息。使用该接口的前提条件是节点池已存在且用户具有访问该节点池的权限。调用接口成功后，系统将返回节点池中所有节点的列表，包括节点ID、名称、状态、IP地址、资源使用情况等详细信息。若节点池不存在、用户无权限访问或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodePoolNodesRequest 请求对象
     * @return CompletableFuture<ListNodePoolNodesResponse>
     */
    public CompletableFuture<ListNodePoolNodesResponse> listNodePoolNodesAsync(ListNodePoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listNodePoolNodes);
    }

    /**
     * 查询节点池的节点列表
     *
     * 查询节点池的节点列表接口用于获取指定节点池中所有节点的详细信息。该接口适用于以下场景：当需要查看节点池的节点状态、资源使用情况或管理节点资源时，用户可通过此接口获取节点池中节点的详细信息。使用该接口的前提条件是节点池已存在且用户具有访问该节点池的权限。调用接口成功后，系统将返回节点池中所有节点的列表，包括节点ID、名称、状态、IP地址、资源使用情况等详细信息。若节点池不存在、用户无权限访问或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodePoolNodesRequest 请求对象
     * @return AsyncInvoker<ListNodePoolNodesRequest, ListNodePoolNodesResponse>
     */
    public AsyncInvoker<ListNodePoolNodesRequest, ListNodePoolNodesResponse> listNodePoolNodesAsyncInvoker(
        ListNodePoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listNodePoolNodes, hcClient);
    }

    /**
     * 查询节点池列表
     *
     * 查询节点池列表接口用于获取指定节点池的列表信息。该接口适用于以下场景：当需要查看节点池的配置、状态或管理节点池资源时，用户可通过此接口获取节点池的详细信息。使用该接口的前提条件是节点池已存在且用户具有管理员权限。调用接口成功后，系统将返回节点池的列表，包括节点池ID、名称、节点数量、状态等详细信息。若节点池不存在、用户无权限操作或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodePoolsRequest 请求对象
     * @return CompletableFuture<ListNodePoolsResponse>
     */
    public CompletableFuture<ListNodePoolsResponse> listNodePoolsAsync(ListNodePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listNodePools);
    }

    /**
     * 查询节点池列表
     *
     * 查询节点池列表接口用于获取指定节点池的列表信息。该接口适用于以下场景：当需要查看节点池的配置、状态或管理节点池资源时，用户可通过此接口获取节点池的详细信息。使用该接口的前提条件是节点池已存在且用户具有管理员权限。调用接口成功后，系统将返回节点池的列表，包括节点池ID、名称、节点数量、状态等详细信息。若节点池不存在、用户无权限操作或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodePoolsRequest 请求对象
     * @return AsyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>
     */
    public AsyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse> listNodePoolsAsyncInvoker(
        ListNodePoolsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listNodePools, hcClient);
    }

    /**
     * 查询插件模板列表
     *
     * 查询插件模板列表接口用于获取插件模板的基本信息列表。该接口适用于以下场景：当需要浏览或管理插件模板时，用户可通过此接口查询所有可用的插件模板信息，以便选择或进一步操作。使用该接口的前提条件是用户具有访问插件模板的权限，且插件模板服务处于正常运行状态。查询操作完成后，用户将获得插件模板的列表信息，包括模板名称、类型、版本等，便于后续的插件开发或管理。若用户无权限访问、插件模板服务不可用或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginTemplatesRequest 请求对象
     * @return CompletableFuture<ListPluginTemplatesResponse>
     */
    public CompletableFuture<ListPluginTemplatesResponse> listPluginTemplatesAsync(ListPluginTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listPluginTemplates);
    }

    /**
     * 查询插件模板列表
     *
     * 查询插件模板列表接口用于获取插件模板的基本信息列表。该接口适用于以下场景：当需要浏览或管理插件模板时，用户可通过此接口查询所有可用的插件模板信息，以便选择或进一步操作。使用该接口的前提条件是用户具有访问插件模板的权限，且插件模板服务处于正常运行状态。查询操作完成后，用户将获得插件模板的列表信息，包括模板名称、类型、版本等，便于后续的插件开发或管理。若用户无权限访问、插件模板服务不可用或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginTemplatesRequest 请求对象
     * @return AsyncInvoker<ListPluginTemplatesRequest, ListPluginTemplatesResponse>
     */
    public AsyncInvoker<ListPluginTemplatesRequest, ListPluginTemplatesResponse> listPluginTemplatesAsyncInvoker(
        ListPluginTemplatesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listPluginTemplates, hcClient);
    }

    /**
     * 查询资源池节点列表
     *
     * 查询资源池节点列表接口用于获取指定资源池中的节点信息列表。该接口适用于以下场景：当需要了解资源池中节点的分布、状态或资源使用情况时，用户可通过此接口查询资源池中的节点列表，以便进行资源监控、分配或管理。使用该接口的前提条件是资源池已创建且处于可用状态，且用户具有访问资源池的权限。查询操作完成后，用户将获得资源池中节点的详细信息，包括节点ID、状态、资源使用情况等，便于后续的资源管理和优化。若资源池不存在、用户无权限访问或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolNodesRequest 请求对象
     * @return CompletableFuture<ListPoolNodesResponse>
     */
    public CompletableFuture<ListPoolNodesResponse> listPoolNodesAsync(ListPoolNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listPoolNodes);
    }

    /**
     * 查询资源池节点列表
     *
     * 查询资源池节点列表接口用于获取指定资源池中的节点信息列表。该接口适用于以下场景：当需要了解资源池中节点的分布、状态或资源使用情况时，用户可通过此接口查询资源池中的节点列表，以便进行资源监控、分配或管理。使用该接口的前提条件是资源池已创建且处于可用状态，且用户具有访问资源池的权限。查询操作完成后，用户将获得资源池中节点的详细信息，包括节点ID、状态、资源使用情况等，便于后续的资源管理和优化。若资源池不存在、用户无权限访问或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolNodesRequest 请求对象
     * @return AsyncInvoker<ListPoolNodesRequest, ListPoolNodesResponse>
     */
    public AsyncInvoker<ListPoolNodesRequest, ListPoolNodesResponse> listPoolNodesAsyncInvoker(
        ListPoolNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listPoolNodes, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件实例列表接口用于获取系统中已部署的插件实例信息。该接口适用于以下场景：当用户需要查看系统中已部署的插件实例、监控插件运行状态、管理插件配置或进行故障排查时，可通过此接口获取插件实例的详细信息。使用该接口的前提条件是用户具有查询权限且系统中已部署至少一个插件实例。调用该接口后，系统将返回所有插件实例的列表，包括插件名称、类型、状态、版本及部署环境等信息。若用户无权限访问或系统中未部署任何插件实例，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolPluginsRequest 请求对象
     * @return CompletableFuture<ListPoolPluginsResponse>
     */
    public CompletableFuture<ListPoolPluginsResponse> listPoolPluginsAsync(ListPoolPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listPoolPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件实例列表接口用于获取系统中已部署的插件实例信息。该接口适用于以下场景：当用户需要查看系统中已部署的插件实例、监控插件运行状态、管理插件配置或进行故障排查时，可通过此接口获取插件实例的详细信息。使用该接口的前提条件是用户具有查询权限且系统中已部署至少一个插件实例。调用该接口后，系统将返回所有插件实例的列表，包括插件名称、类型、状态、版本及部署环境等信息。若用户无权限访问或系统中未部署任何插件实例，接口将返回相应的错误信息或空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolPluginsRequest 请求对象
     * @return AsyncInvoker<ListPoolPluginsRequest, ListPoolPluginsResponse>
     */
    public AsyncInvoker<ListPoolPluginsRequest, ListPoolPluginsResponse> listPoolPluginsAsyncInvoker(
        ListPoolPluginsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listPoolPlugins, hcClient);
    }

    /**
     * 查询资源池的所有标签
     *
     * 查询资源池所有标签接口用于获取用户当前项目下资源池的所有标签信息，默认查询所有工作空间，但无权限的工作空间不会返回标签数据。该接口适用于以下场景：当需要管理、分类或统计资源池的标签信息时，用户可通过此接口获取资源池的标签数据。使用该接口的前提条件是用户具有访问资源池的权限且资源池已存在。调用接口成功后，系统将返回用户当前项目下所有可访问工作空间的资源池标签信息。若用户无权限访问资源池、资源池不存在或项目未创建，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolTagsRequest 请求对象
     * @return CompletableFuture<ListPoolTagsResponse>
     */
    public CompletableFuture<ListPoolTagsResponse> listPoolTagsAsync(ListPoolTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listPoolTags);
    }

    /**
     * 查询资源池的所有标签
     *
     * 查询资源池所有标签接口用于获取用户当前项目下资源池的所有标签信息，默认查询所有工作空间，但无权限的工作空间不会返回标签数据。该接口适用于以下场景：当需要管理、分类或统计资源池的标签信息时，用户可通过此接口获取资源池的标签数据。使用该接口的前提条件是用户具有访问资源池的权限且资源池已存在。调用接口成功后，系统将返回用户当前项目下所有可访问工作空间的资源池标签信息。若用户无权限访问资源池、资源池不存在或项目未创建，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolTagsRequest 请求对象
     * @return AsyncInvoker<ListPoolTagsRequest, ListPoolTagsResponse>
     */
    public AsyncInvoker<ListPoolTagsRequest, ListPoolTagsResponse> listPoolTagsAsyncInvoker(
        ListPoolTagsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listPoolTags, hcClient);
    }

    /**
     * 查询资源池列表
     *
     * 查询资源池列表接口用于获取系统中已创建的资源池信息。该接口适用于以下场景：当用户需要监控资源池状态、进行资源规划、管理资源分配或进行审计时，可通过此接口查询系统中现有的资源池列表。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在资源池。查询操作完成后，接口将返回资源池列表，包含资源池ID、名称、类型、状态、资源配额等详细信息。若用户无权限、系统中无资源池或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return CompletableFuture<ListPoolsResponse>
     */
    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listPools);
    }

    /**
     * 查询资源池列表
     *
     * 查询资源池列表接口用于获取系统中已创建的资源池信息。该接口适用于以下场景：当用户需要监控资源池状态、进行资源规划、管理资源分配或进行审计时，可通过此接口查询系统中现有的资源池列表。使用该接口的前提条件是用户具有相应的权限，并且系统中已存在资源池。查询操作完成后，接口将返回资源池列表，包含资源池ID、名称、类型、状态、资源配额等详细信息。若用户无权限、系统中无资源池或查询参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return AsyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public AsyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsAsyncInvoker(ListPoolsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listPools, hcClient);
    }

    /**
     * 查询资源规格列表
     *
     * 查询资源规格列表接口用于获取可用的资源规格信息。该接口适用于以下场景：当需要查看或选择资源规格以创建资源池、分配资源或了解可用资源规格时，用户可通过此接口获取资源规格的详细信息。使用该接口的前提条件是用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回资源规格的列表，包括规格ID、名称、CPU核数、内存大小、存储容量等详细信息。若用户无权限访问该接口或系统中未配置资源规格，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceFlavorsRequest 请求对象
     * @return CompletableFuture<ListResourceFlavorsResponse>
     */
    public CompletableFuture<ListResourceFlavorsResponse> listResourceFlavorsAsync(ListResourceFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listResourceFlavors);
    }

    /**
     * 查询资源规格列表
     *
     * 查询资源规格列表接口用于获取可用的资源规格信息。该接口适用于以下场景：当需要查看或选择资源规格以创建资源池、分配资源或了解可用资源规格时，用户可通过此接口获取资源规格的详细信息。使用该接口的前提条件是用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回资源规格的列表，包括规格ID、名称、CPU核数、内存大小、存储容量等详细信息。若用户无权限访问该接口或系统中未配置资源规格，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceFlavorsRequest 请求对象
     * @return AsyncInvoker<ListResourceFlavorsRequest, ListResourceFlavorsResponse>
     */
    public AsyncInvoker<ListResourceFlavorsRequest, ListResourceFlavorsResponse> listResourceFlavorsAsyncInvoker(
        ListResourceFlavorsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listResourceFlavors, hcClient);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return CompletableFuture<ListScheduledEventsResponse>
     */
    public CompletableFuture<ListScheduledEventsResponse> listScheduledEventsAsync(ListScheduledEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listScheduledEvents);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return AsyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse>
     */
    public AsyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse> listScheduledEventsAsyncInvoker(
        ListScheduledEventsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listScheduledEvents, hcClient);
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
     * @return CompletableFuture<ListTrainingExperimentsResponse>
     */
    public CompletableFuture<ListTrainingExperimentsResponse> listTrainingExperimentsAsync(
        ListTrainingExperimentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listTrainingExperiments);
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
     * @return AsyncInvoker<ListTrainingExperimentsRequest, ListTrainingExperimentsResponse>
     */
    public AsyncInvoker<ListTrainingExperimentsRequest, ListTrainingExperimentsResponse> listTrainingExperimentsAsyncInvoker(
        ListTrainingExperimentsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listTrainingExperiments, hcClient);
    }

    /**
     * 获取训练作业事件列表
     *
     * 获取训练作业事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobEventsRequest 请求对象
     * @return CompletableFuture<ListTrainingJobEventsResponse>
     */
    public CompletableFuture<ListTrainingJobEventsResponse> listTrainingJobEventsAsync(
        ListTrainingJobEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listTrainingJobEvents);
    }

    /**
     * 获取训练作业事件列表
     *
     * 获取训练作业事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobEventsRequest 请求对象
     * @return AsyncInvoker<ListTrainingJobEventsRequest, ListTrainingJobEventsResponse>
     */
    public AsyncInvoker<ListTrainingJobEventsRequest, ListTrainingJobEventsResponse> listTrainingJobEventsAsyncInvoker(
        ListTrainingJobEventsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listTrainingJobEvents, hcClient);
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
     * @return CompletableFuture<ListTrainingJobStagesResponse>
     */
    public CompletableFuture<ListTrainingJobStagesResponse> listTrainingJobStagesAsync(
        ListTrainingJobStagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listTrainingJobStages);
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
     * @return AsyncInvoker<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse>
     */
    public AsyncInvoker<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse> listTrainingJobStagesAsyncInvoker(
        ListTrainingJobStagesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listTrainingJobStages, hcClient);
    }

    /**
     * 查询训练作业的实例历史调度信息
     *
     * 查询训练作业调度的实例IP、节点IP等信息，可通过schedule_count参数查询具体的某一次调度的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobTasksRequest 请求对象
     * @return CompletableFuture<ListTrainingJobTasksResponse>
     */
    public CompletableFuture<ListTrainingJobTasksResponse> listTrainingJobTasksAsync(
        ListTrainingJobTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listTrainingJobTasks);
    }

    /**
     * 查询训练作业的实例历史调度信息
     *
     * 查询训练作业调度的实例IP、节点IP等信息，可通过schedule_count参数查询具体的某一次调度的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobTasksRequest 请求对象
     * @return AsyncInvoker<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse>
     */
    public AsyncInvoker<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse> listTrainingJobTasksAsyncInvoker(
        ListTrainingJobTasksRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listTrainingJobTasks, hcClient);
    }

    /**
     * 查询训练作业列表
     *
     * 根据指定查询条件查询用户创建的训练作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobsRequest 请求对象
     * @return CompletableFuture<ListTrainingJobsResponse>
     */
    public CompletableFuture<ListTrainingJobsResponse> listTrainingJobsAsync(ListTrainingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listTrainingJobs);
    }

    /**
     * 查询训练作业列表
     *
     * 根据指定查询条件查询用户创建的训练作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrainingJobsRequest 请求对象
     * @return AsyncInvoker<ListTrainingJobsRequest, ListTrainingJobsResponse>
     */
    public AsyncInvoker<ListTrainingJobsRequest, ListTrainingJobsResponse> listTrainingJobsAsyncInvoker(
        ListTrainingJobsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listTrainingJobs, hcClient);
    }

    /**
     * 查询资源池作业列表
     *
     * 查询专属资源池作业列表接口用于获取指定专属资源池中的作业信息列表。该接口适用于以下场景：当需要监控专属资源池的资源使用情况、查看作业状态或管理资源分配时，用户可通过此接口获取专属资源池中作业的详细信息。使用该接口的前提条件是专属资源池已存在且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回专属资源池中作业的列表，包括作业ID、名称、状态、资源使用情况等详细信息。若专属资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadsRequest 请求对象
     * @return CompletableFuture<ListWorkloadsResponse>
     */
    public CompletableFuture<ListWorkloadsResponse> listWorkloadsAsync(ListWorkloadsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listWorkloads);
    }

    /**
     * 查询资源池作业列表
     *
     * 查询专属资源池作业列表接口用于获取指定专属资源池中的作业信息列表。该接口适用于以下场景：当需要监控专属资源池的资源使用情况、查看作业状态或管理资源分配时，用户可通过此接口获取专属资源池中作业的详细信息。使用该接口的前提条件是专属资源池已存在且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回专属资源池中作业的列表，包括作业ID、名称、状态、资源使用情况等详细信息。若专属资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadsRequest 请求对象
     * @return AsyncInvoker<ListWorkloadsRequest, ListWorkloadsResponse>
     */
    public AsyncInvoker<ListWorkloadsRequest, ListWorkloadsResponse> listWorkloadsAsyncInvoker(
        ListWorkloadsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listWorkloads, hcClient);
    }

    /**
     * 查询工作空间列表
     *
     * 查询工作空间列表，响应消息体中包含详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceRequest 请求对象
     * @return CompletableFuture<ListWorkspaceResponse>
     */
    public CompletableFuture<ListWorkspaceResponse> listWorkspaceAsync(ListWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listWorkspace);
    }

    /**
     * 查询工作空间列表
     *
     * 查询工作空间列表，响应消息体中包含详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceRequest 请求对象
     * @return AsyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse>
     */
    public AsyncInvoker<ListWorkspaceRequest, ListWorkspaceResponse> listWorkspaceAsyncInvoker(
        ListWorkspaceRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listWorkspace, hcClient);
    }

    /**
     * 训练作业事件上报接口
     *
     * 训练事件上报给业务面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifyTrainingJobInformationRequest 请求对象
     * @return CompletableFuture<NotifyTrainingJobInformationResponse>
     */
    public CompletableFuture<NotifyTrainingJobInformationResponse> notifyTrainingJobInformationAsync(
        NotifyTrainingJobInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.notifyTrainingJobInformation);
    }

    /**
     * 训练作业事件上报接口
     *
     * 训练事件上报给业务面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifyTrainingJobInformationRequest 请求对象
     * @return AsyncInvoker<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse>
     */
    public AsyncInvoker<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse> notifyTrainingJobInformationAsyncInvoker(
        NotifyTrainingJobInformationRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.notifyTrainingJobInformation, hcClient);
    }

    /**
     * 更新网络资源
     *
     * 更新网络资源接口用于修改指定网络资源的配置信息。该接口适用于以下场景：当需要调整网络资源的属性、修复配置错误或优化资源设置时，用户可通过此接口更新指定网络资源的详细信息。使用该接口的前提条件是网络资源已存在且用户具有管理员权限。更新操作完成后，指定网络资源的配置信息将被成功修改，系统将反映最新的资源状态和属性。若指定的网络资源不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchNetworkRequest 请求对象
     * @return CompletableFuture<PatchNetworkResponse>
     */
    public CompletableFuture<PatchNetworkResponse> patchNetworkAsync(PatchNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.patchNetwork);
    }

    /**
     * 更新网络资源
     *
     * 更新网络资源接口用于修改指定网络资源的配置信息。该接口适用于以下场景：当需要调整网络资源的属性、修复配置错误或优化资源设置时，用户可通过此接口更新指定网络资源的详细信息。使用该接口的前提条件是网络资源已存在且用户具有管理员权限。更新操作完成后，指定网络资源的配置信息将被成功修改，系统将反映最新的资源状态和属性。若指定的网络资源不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchNetworkRequest 请求对象
     * @return AsyncInvoker<PatchNetworkRequest, PatchNetworkResponse>
     */
    public AsyncInvoker<PatchNetworkRequest, PatchNetworkResponse> patchNetworkAsyncInvoker(
        PatchNetworkRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.patchNetwork, hcClient);
    }

    /**
     * 更新节点池
     *
     * 更新节点池接口用于修改指定节点池的配置信息。该接口适用于以下场景：当需要扩展节点池容量、调整节点规格、优化资源分配或修复节点池配置时，用户可通过此接口更新节点池的相关信息。使用该接口的前提条件是节点池已存在且用户具有管理员权限。更新操作完成后，节点池的配置将被更新，包括节点数量、规格、网络配置等参数。若节点池不存在、用户无权限操作或配置参数错误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchNodePoolRequest 请求对象
     * @return CompletableFuture<PatchNodePoolResponse>
     */
    public CompletableFuture<PatchNodePoolResponse> patchNodePoolAsync(PatchNodePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.patchNodePool);
    }

    /**
     * 更新节点池
     *
     * 更新节点池接口用于修改指定节点池的配置信息。该接口适用于以下场景：当需要扩展节点池容量、调整节点规格、优化资源分配或修复节点池配置时，用户可通过此接口更新节点池的相关信息。使用该接口的前提条件是节点池已存在且用户具有管理员权限。更新操作完成后，节点池的配置将被更新，包括节点数量、规格、网络配置等参数。若节点池不存在、用户无权限操作或配置参数错误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchNodePoolRequest 请求对象
     * @return AsyncInvoker<PatchNodePoolRequest, PatchNodePoolResponse>
     */
    public AsyncInvoker<PatchNodePoolRequest, PatchNodePoolResponse> patchNodePoolAsyncInvoker(
        PatchNodePoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.patchNodePool, hcClient);
    }

    /**
     * 更新资源池
     *
     * 更新资源池接口用于修改指定资源池的配置和容量。该接口适用于以下场景：当资源池需要扩展容量、调整配置或优化性能时，用户可通过此接口更新资源池的相关信息。使用该接口的前提条件是资源池已存在且用户具有管理员权限。更新操作完成后，资源池的配置和容量将被更新，相关资源和配置也将被调整。若资源池不存在、用户无权限操作或资源池处于不可更新状态，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchPoolRequest 请求对象
     * @return CompletableFuture<PatchPoolResponse>
     */
    public CompletableFuture<PatchPoolResponse> patchPoolAsync(PatchPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.patchPool);
    }

    /**
     * 更新资源池
     *
     * 更新资源池接口用于修改指定资源池的配置和容量。该接口适用于以下场景：当资源池需要扩展容量、调整配置或优化性能时，用户可通过此接口更新资源池的相关信息。使用该接口的前提条件是资源池已存在且用户具有管理员权限。更新操作完成后，资源池的配置和容量将被更新，相关资源和配置也将被调整。若资源池不存在、用户无权限操作或资源池处于不可更新状态，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PatchPoolRequest 请求对象
     * @return AsyncInvoker<PatchPoolRequest, PatchPoolResponse>
     */
    public AsyncInvoker<PatchPoolRequest, PatchPoolResponse> patchPoolAsyncInvoker(PatchPoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.patchPool, hcClient);
    }

    /**
     * 查询算法详情
     *
     * 根据算法id查询指定算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmByUuidRequest 请求对象
     * @return CompletableFuture<ShowAlgorithmByUuidResponse>
     */
    public CompletableFuture<ShowAlgorithmByUuidResponse> showAlgorithmByUuidAsync(ShowAlgorithmByUuidRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAlgorithmByUuid);
    }

    /**
     * 查询算法详情
     *
     * 根据算法id查询指定算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlgorithmByUuidRequest 请求对象
     * @return AsyncInvoker<ShowAlgorithmByUuidRequest, ShowAlgorithmByUuidResponse>
     */
    public AsyncInvoker<ShowAlgorithmByUuidRequest, ShowAlgorithmByUuidResponse> showAlgorithmByUuidAsyncInvoker(
        ShowAlgorithmByUuidRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAlgorithmByUuid, hcClient);
    }

    /**
     * 查询授权模式
     *
     * 查询授权模式接口用于获取指定资源或功能的授权方式和权限配置信息。该接口适用于以下场景：当系统管理员需要查看资源的访问权限设置、开发者需要验证授权策略配置是否正确，或安全审计人员需要检查授权配置是否符合安全规范时，可通过此接口查询授权模式的详细信息。使用该接口的前提条件是用户具有查询权限且目标资源或功能的授权模式已配置。调用成功后，接口将返回授权模式的类型、规则及权限范围等详细信息。若用户无权限访问该接口，或目标资源的授权模式未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthmodeDetailRequest 请求对象
     * @return CompletableFuture<ShowAuthmodeDetailResponse>
     */
    public CompletableFuture<ShowAuthmodeDetailResponse> showAuthmodeDetailAsync(ShowAuthmodeDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAuthmodeDetail);
    }

    /**
     * 查询授权模式
     *
     * 查询授权模式接口用于获取指定资源或功能的授权方式和权限配置信息。该接口适用于以下场景：当系统管理员需要查看资源的访问权限设置、开发者需要验证授权策略配置是否正确，或安全审计人员需要检查授权配置是否符合安全规范时，可通过此接口查询授权模式的详细信息。使用该接口的前提条件是用户具有查询权限且目标资源或功能的授权模式已配置。调用成功后，接口将返回授权模式的类型、规则及权限范围等详细信息。若用户无权限访问该接口，或目标资源的授权模式未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthmodeDetailRequest 请求对象
     * @return AsyncInvoker<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse>
     */
    public AsyncInvoker<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse> showAuthmodeDetailAsyncInvoker(
        ShowAuthmodeDetailRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAuthmodeDetail, hcClient);
    }

    /**
     * 获取某个超参敏感度分析图像的路径
     *
     * 获取某个超参敏感度分析图像的保存路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchParamAnalysisResultPathRequest 请求对象
     * @return CompletableFuture<ShowAutoSearchParamAnalysisResultPathResponse>
     */
    public CompletableFuture<ShowAutoSearchParamAnalysisResultPathResponse> showAutoSearchParamAnalysisResultPathAsync(
        ShowAutoSearchParamAnalysisResultPathRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAutoSearchParamAnalysisResultPath);
    }

    /**
     * 获取某个超参敏感度分析图像的路径
     *
     * 获取某个超参敏感度分析图像的保存路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchParamAnalysisResultPathRequest 请求对象
     * @return AsyncInvoker<ShowAutoSearchParamAnalysisResultPathRequest, ShowAutoSearchParamAnalysisResultPathResponse>
     */
    public AsyncInvoker<ShowAutoSearchParamAnalysisResultPathRequest, ShowAutoSearchParamAnalysisResultPathResponse> showAutoSearchParamAnalysisResultPathAsyncInvoker(
        ShowAutoSearchParamAnalysisResultPathRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAutoSearchParamAnalysisResultPath, hcClient);
    }

    /**
     * 获取超参敏感度分析结果
     *
     * 获取超参敏感度分析结果的汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchParamsAnalysisRequest 请求对象
     * @return CompletableFuture<ShowAutoSearchParamsAnalysisResponse>
     */
    public CompletableFuture<ShowAutoSearchParamsAnalysisResponse> showAutoSearchParamsAnalysisAsync(
        ShowAutoSearchParamsAnalysisRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAutoSearchParamsAnalysis);
    }

    /**
     * 获取超参敏感度分析结果
     *
     * 获取超参敏感度分析结果的汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchParamsAnalysisRequest 请求对象
     * @return AsyncInvoker<ShowAutoSearchParamsAnalysisRequest, ShowAutoSearchParamsAnalysisResponse>
     */
    public AsyncInvoker<ShowAutoSearchParamsAnalysisRequest, ShowAutoSearchParamsAnalysisResponse> showAutoSearchParamsAnalysisAsyncInvoker(
        ShowAutoSearchParamsAnalysisRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAutoSearchParamsAnalysis, hcClient);
    }

    /**
     * 查询超参搜索某个trial的结果
     *
     * 根据传入的trial_id，查询指定trial的搜索结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchPerTrialRequest 请求对象
     * @return CompletableFuture<ShowAutoSearchPerTrialResponse>
     */
    public CompletableFuture<ShowAutoSearchPerTrialResponse> showAutoSearchPerTrialAsync(
        ShowAutoSearchPerTrialRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAutoSearchPerTrial);
    }

    /**
     * 查询超参搜索某个trial的结果
     *
     * 根据传入的trial_id，查询指定trial的搜索结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchPerTrialRequest 请求对象
     * @return AsyncInvoker<ShowAutoSearchPerTrialRequest, ShowAutoSearchPerTrialResponse>
     */
    public AsyncInvoker<ShowAutoSearchPerTrialRequest, ShowAutoSearchPerTrialResponse> showAutoSearchPerTrialAsyncInvoker(
        ShowAutoSearchPerTrialRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAutoSearchPerTrial, hcClient);
    }

    /**
     * 提前终止自动化搜索作业的某个trial
     *
     * 提前终止自动化搜索作业的某个trial。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchTrialEarlyStopRequest 请求对象
     * @return CompletableFuture<ShowAutoSearchTrialEarlyStopResponse>
     */
    public CompletableFuture<ShowAutoSearchTrialEarlyStopResponse> showAutoSearchTrialEarlyStopAsync(
        ShowAutoSearchTrialEarlyStopRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAutoSearchTrialEarlyStop);
    }

    /**
     * 提前终止自动化搜索作业的某个trial
     *
     * 提前终止自动化搜索作业的某个trial。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchTrialEarlyStopRequest 请求对象
     * @return AsyncInvoker<ShowAutoSearchTrialEarlyStopRequest, ShowAutoSearchTrialEarlyStopResponse>
     */
    public AsyncInvoker<ShowAutoSearchTrialEarlyStopRequest, ShowAutoSearchTrialEarlyStopResponse> showAutoSearchTrialEarlyStopAsyncInvoker(
        ShowAutoSearchTrialEarlyStopRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAutoSearchTrialEarlyStop, hcClient);
    }

    /**
     * 查询超参搜索所有trial的结果
     *
     * 查询超参搜索所有trial的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchTrialsRequest 请求对象
     * @return CompletableFuture<ShowAutoSearchTrialsResponse>
     */
    public CompletableFuture<ShowAutoSearchTrialsResponse> showAutoSearchTrialsAsync(
        ShowAutoSearchTrialsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAutoSearchTrials);
    }

    /**
     * 查询超参搜索所有trial的结果
     *
     * 查询超参搜索所有trial的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchTrialsRequest 请求对象
     * @return AsyncInvoker<ShowAutoSearchTrialsRequest, ShowAutoSearchTrialsResponse>
     */
    public AsyncInvoker<ShowAutoSearchTrialsRequest, ShowAutoSearchTrialsResponse> showAutoSearchTrialsAsyncInvoker(
        ShowAutoSearchTrialsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAutoSearchTrials, hcClient);
    }

    /**
     * 获取自动化搜索作业yaml模板的内容
     *
     * 获取自动化搜索作业yaml模板的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchYamlTemplateContentRequest 请求对象
     * @return CompletableFuture<ShowAutoSearchYamlTemplateContentResponse>
     */
    public CompletableFuture<ShowAutoSearchYamlTemplateContentResponse> showAutoSearchYamlTemplateContentAsync(
        ShowAutoSearchYamlTemplateContentRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAutoSearchYamlTemplateContent);
    }

    /**
     * 获取自动化搜索作业yaml模板的内容
     *
     * 获取自动化搜索作业yaml模板的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchYamlTemplateContentRequest 请求对象
     * @return AsyncInvoker<ShowAutoSearchYamlTemplateContentRequest, ShowAutoSearchYamlTemplateContentResponse>
     */
    public AsyncInvoker<ShowAutoSearchYamlTemplateContentRequest, ShowAutoSearchYamlTemplateContentResponse> showAutoSearchYamlTemplateContentAsyncInvoker(
        ShowAutoSearchYamlTemplateContentRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAutoSearchYamlTemplateContent, hcClient);
    }

    /**
     * 获取自动化搜索作业yaml模板的信息
     *
     * 获取自动化搜索作业yaml模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchYamlTemplatesInfoRequest 请求对象
     * @return CompletableFuture<ShowAutoSearchYamlTemplatesInfoResponse>
     */
    public CompletableFuture<ShowAutoSearchYamlTemplatesInfoResponse> showAutoSearchYamlTemplatesInfoAsync(
        ShowAutoSearchYamlTemplatesInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAutoSearchYamlTemplatesInfo);
    }

    /**
     * 获取自动化搜索作业yaml模板的信息
     *
     * 获取自动化搜索作业yaml模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSearchYamlTemplatesInfoRequest 请求对象
     * @return AsyncInvoker<ShowAutoSearchYamlTemplatesInfoRequest, ShowAutoSearchYamlTemplatesInfoResponse>
     */
    public AsyncInvoker<ShowAutoSearchYamlTemplatesInfoRequest, ShowAutoSearchYamlTemplatesInfoResponse> showAutoSearchYamlTemplatesInfoAsyncInvoker(
        ShowAutoSearchYamlTemplatesInfoRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAutoSearchYamlTemplatesInfo, hcClient);
    }

    /**
     * 查询网络资源
     *
     * 查询网络资源接口用于获取指定网络资源的详情信息。该接口适用于以下场景：当用户需要查看特定网络资源的详细配置、状态或属性时，可通过此接口查询指定网络资源的详细信息。使用该接口的前提条件是用户具有相应的权限，并且指定的网络资源已存在于系统中。查询操作完成后，接口将返回指定网络资源的详细信息，包括资源ID、类型、状态、配置参数等。若指定的网络资源不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkRequest 请求对象
     * @return CompletableFuture<ShowNetworkResponse>
     */
    public CompletableFuture<ShowNetworkResponse> showNetworkAsync(ShowNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showNetwork);
    }

    /**
     * 查询网络资源
     *
     * 查询网络资源接口用于获取指定网络资源的详情信息。该接口适用于以下场景：当用户需要查看特定网络资源的详细配置、状态或属性时，可通过此接口查询指定网络资源的详细信息。使用该接口的前提条件是用户具有相应的权限，并且指定的网络资源已存在于系统中。查询操作完成后，接口将返回指定网络资源的详细信息，包括资源ID、类型、状态、配置参数等。若指定的网络资源不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkRequest 请求对象
     * @return AsyncInvoker<ShowNetworkRequest, ShowNetworkResponse>
     */
    public AsyncInvoker<ShowNetworkRequest, ShowNetworkResponse> showNetworkAsyncInvoker(ShowNetworkRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showNetwork, hcClient);
    }

    /**
     * 查询网络可用的IP
     *
     * 查询网络可用的IP接口用于查找指定网络中未被占用的IP地址。该接口适用于以下场景：在网络规划、资源分配或故障排查时，用户需要快速获取可用的IP地址信息。使用该接口的前提条件是用户具有访问目标网络的权限，并且需要提供有效的网络范围（如子网掩码或IP段）。查询完成后，接口将返回指定网络中未被占用的IP地址列表，用户可以根据结果进行IP地址的分配或进一步操作。若网络不可达、权限不足或网络范围有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkAvailableIpRequest 请求对象
     * @return CompletableFuture<ShowNetworkAvailableIpResponse>
     */
    public CompletableFuture<ShowNetworkAvailableIpResponse> showNetworkAvailableIpAsync(
        ShowNetworkAvailableIpRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showNetworkAvailableIp);
    }

    /**
     * 查询网络可用的IP
     *
     * 查询网络可用的IP接口用于查找指定网络中未被占用的IP地址。该接口适用于以下场景：在网络规划、资源分配或故障排查时，用户需要快速获取可用的IP地址信息。使用该接口的前提条件是用户具有访问目标网络的权限，并且需要提供有效的网络范围（如子网掩码或IP段）。查询完成后，接口将返回指定网络中未被占用的IP地址列表，用户可以根据结果进行IP地址的分配或进一步操作。若网络不可达、权限不足或网络范围有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkAvailableIpRequest 请求对象
     * @return AsyncInvoker<ShowNetworkAvailableIpRequest, ShowNetworkAvailableIpResponse>
     */
    public AsyncInvoker<ShowNetworkAvailableIpRequest, ShowNetworkAvailableIpResponse> showNetworkAvailableIpAsyncInvoker(
        ShowNetworkAvailableIpRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showNetworkAvailableIp, hcClient);
    }

    /**
     * 查询节点配置模板
     *
     * 查询节点配置模板接口用于获取指定节点配置模板的详细信息。该接口适用于以下场景：当用户需要查看节点配置模板的内容、管理节点配置或进行相关操作时，可通过此接口获取指定节点配置模板的详细信息。使用该接口的前提条件是节点配置模板已存在且用户具有相应的访问权限。调用该接口后，系统将返回指定节点配置模板的详细信息，包括模板名称、版本、配置参数及描述等。若节点配置模板不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodeConfigTemplateRequest 请求对象
     * @return CompletableFuture<ShowNodeConfigTemplateResponse>
     */
    public CompletableFuture<ShowNodeConfigTemplateResponse> showNodeConfigTemplateAsync(
        ShowNodeConfigTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showNodeConfigTemplate);
    }

    /**
     * 查询节点配置模板
     *
     * 查询节点配置模板接口用于获取指定节点配置模板的详细信息。该接口适用于以下场景：当用户需要查看节点配置模板的内容、管理节点配置或进行相关操作时，可通过此接口获取指定节点配置模板的详细信息。使用该接口的前提条件是节点配置模板已存在且用户具有相应的访问权限。调用该接口后，系统将返回指定节点配置模板的详细信息，包括模板名称、版本、配置参数及描述等。若节点配置模板不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodeConfigTemplateRequest 请求对象
     * @return AsyncInvoker<ShowNodeConfigTemplateRequest, ShowNodeConfigTemplateResponse>
     */
    public AsyncInvoker<ShowNodeConfigTemplateRequest, ShowNodeConfigTemplateResponse> showNodeConfigTemplateAsyncInvoker(
        ShowNodeConfigTemplateRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showNodeConfigTemplate, hcClient);
    }

    /**
     * 查询指定节点池详情
     *
     * 查询指定节点池详情接口用于获取指定节点池的详细信息。该接口适用于以下场景：当需要查看节点池的配置、状态、资源使用情况或管理节点池时，用户可通过此接口获取节点池的详细信息。使用该接口的前提条件是节点池已存在且用户具有访问该节点池的权限。调用接口成功后，系统将返回节点池的详细信息，包括节点池ID、名称、节点数量、状态、创建时间、配置参数等。若节点池不存在、用户无权限访问或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodePoolRequest 请求对象
     * @return CompletableFuture<ShowNodePoolResponse>
     */
    public CompletableFuture<ShowNodePoolResponse> showNodePoolAsync(ShowNodePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showNodePool);
    }

    /**
     * 查询指定节点池详情
     *
     * 查询指定节点池详情接口用于获取指定节点池的详细信息。该接口适用于以下场景：当需要查看节点池的配置、状态、资源使用情况或管理节点池时，用户可通过此接口获取节点池的详细信息。使用该接口的前提条件是节点池已存在且用户具有访问该节点池的权限。调用接口成功后，系统将返回节点池的详细信息，包括节点池ID、名称、节点数量、状态、创建时间、配置参数等。若节点池不存在、用户无权限访问或节点池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodePoolRequest 请求对象
     * @return AsyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>
     */
    public AsyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse> showNodePoolAsyncInvoker(
        ShowNodePoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showNodePool, hcClient);
    }

    /**
     * 查询训练作业指定任务的日志（OBS链接）
     *
     * 查询训练作业指定任务的日志（OBS临时链接，有效期5分钟），可全量查看或直接下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowObsUrlOfTrainingJobLogsRequest 请求对象
     * @return CompletableFuture<ShowObsUrlOfTrainingJobLogsResponse>
     */
    public CompletableFuture<ShowObsUrlOfTrainingJobLogsResponse> showObsUrlOfTrainingJobLogsAsync(
        ShowObsUrlOfTrainingJobLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showObsUrlOfTrainingJobLogs);
    }

    /**
     * 查询训练作业指定任务的日志（OBS链接）
     *
     * 查询训练作业指定任务的日志（OBS临时链接，有效期5分钟），可全量查看或直接下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowObsUrlOfTrainingJobLogsRequest 请求对象
     * @return AsyncInvoker<ShowObsUrlOfTrainingJobLogsRequest, ShowObsUrlOfTrainingJobLogsResponse>
     */
    public AsyncInvoker<ShowObsUrlOfTrainingJobLogsRequest, ShowObsUrlOfTrainingJobLogsResponse> showObsUrlOfTrainingJobLogsAsyncInvoker(
        ShowObsUrlOfTrainingJobLogsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showObsUrlOfTrainingJobLogs, hcClient);
    }

    /**
     * 查询订单详情
     *
     * 查询订单详情接口用于获取指定订单的详细信息。该接口适用于以下场景：当需要查看订单的状态、金额、商品信息或处理订单相关问题时，用户可通过此接口获取订单的详细数据。使用该接口的前提条件是订单已存在且用户具有访问该订单的权限。调用接口成功后，系统将返回订单的详细信息，包括订单号、商品列表、金额、支付状态、下单时间等。若订单不存在、用户无权限访问或订单信息未正确配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderRequest 请求对象
     * @return CompletableFuture<ShowOrderResponse>
     */
    public CompletableFuture<ShowOrderResponse> showOrderAsync(ShowOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showOrder);
    }

    /**
     * 查询订单详情
     *
     * 查询订单详情接口用于获取指定订单的详细信息。该接口适用于以下场景：当需要查看订单的状态、金额、商品信息或处理订单相关问题时，用户可通过此接口获取订单的详细数据。使用该接口的前提条件是订单已存在且用户具有访问该订单的权限。调用接口成功后，系统将返回订单的详细信息，包括订单号、商品列表、金额、支付状态、下单时间等。若订单不存在、用户无权限访问或订单信息未正确配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderRequest 请求对象
     * @return AsyncInvoker<ShowOrderRequest, ShowOrderResponse>
     */
    public AsyncInvoker<ShowOrderRequest, ShowOrderResponse> showOrderAsyncInvoker(ShowOrderRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showOrder, hcClient);
    }

    /**
     * 查询OS的配置参数
     *
     * 查询OS的配置参数接口用于获取ModelArts OS服务的配置参数，如网络网段、用户资源配额等。该接口适用于以下场景：当需要了解当前ModelArts OS服务的网络配置、资源分配情况或进行系统管理时，用户可通过此接口查询相关的配置参数。使用该接口的前提条件是用户具有访问ModelArts OS服务的权限，且服务处于正常运行状态。查询操作完成后，用户将获得指定的配置参数信息，便于进行后续的资源规划或系统优化。若用户无权限访问、服务不可用或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsConfigRequest 请求对象
     * @return CompletableFuture<ShowOsConfigResponse>
     */
    public CompletableFuture<ShowOsConfigResponse> showOsConfigAsync(ShowOsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showOsConfig);
    }

    /**
     * 查询OS的配置参数
     *
     * 查询OS的配置参数接口用于获取ModelArts OS服务的配置参数，如网络网段、用户资源配额等。该接口适用于以下场景：当需要了解当前ModelArts OS服务的网络配置、资源分配情况或进行系统管理时，用户可通过此接口查询相关的配置参数。使用该接口的前提条件是用户具有访问ModelArts OS服务的权限，且服务处于正常运行状态。查询操作完成后，用户将获得指定的配置参数信息，便于进行后续的资源规划或系统优化。若用户无权限访问、服务不可用或请求参数无效，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsConfigRequest 请求对象
     * @return AsyncInvoker<ShowOsConfigRequest, ShowOsConfigResponse>
     */
    public AsyncInvoker<ShowOsConfigRequest, ShowOsConfigResponse> showOsConfigAsyncInvoker(
        ShowOsConfigRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showOsConfig, hcClient);
    }

    /**
     * 查询OS的配额
     *
     * 查询OS配额接口用于获取ModelArts OS服务中部分资源的配额信息，如资源池配额、网络配额等。该接口适用于以下场景：当需要了解资源池或网络资源的使用限制、规划资源分配或监控资源使用情况时，用户可通过此接口获取相关配额信息。使用该接口的前提条件是ModelArts OS服务已部署且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回资源池配额、网络配额等详细信息，帮助用户更好地进行资源规划和管理。若用户无权限访问该接口、服务不可用或配额信息未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsQuotaRequest 请求对象
     * @return CompletableFuture<ShowOsQuotaResponse>
     */
    public CompletableFuture<ShowOsQuotaResponse> showOsQuotaAsync(ShowOsQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showOsQuota);
    }

    /**
     * 查询OS的配额
     *
     * 查询OS配额接口用于获取ModelArts OS服务中部分资源的配额信息，如资源池配额、网络配额等。该接口适用于以下场景：当需要了解资源池或网络资源的使用限制、规划资源分配或监控资源使用情况时，用户可通过此接口获取相关配额信息。使用该接口的前提条件是ModelArts OS服务已部署且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回资源池配额、网络配额等详细信息，帮助用户更好地进行资源规划和管理。若用户无权限访问该接口、服务不可用或配额信息未配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsQuotaRequest 请求对象
     * @return AsyncInvoker<ShowOsQuotaRequest, ShowOsQuotaResponse>
     */
    public AsyncInvoker<ShowOsQuotaRequest, ShowOsQuotaResponse> showOsQuotaAsyncInvoker(ShowOsQuotaRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showOsQuota, hcClient);
    }

    /**
     * 查询插件模板
     *
     * 查询插件模板接口用于获取指定插件模板的详细信息。该接口适用于以下场景：当需要了解特定插件模板的配置、功能或使用方式时，用户可通过此接口查询插件模板的详细信息。使用该接口的前提条件是插件模板已存在且用户具有访问权限。查询操作完成后，用户将获得指定插件模板的详细信息，包括模板的配置参数、功能描述等，便于后续的插件开发或配置管理。若插件模板不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginTemplateRequest 请求对象
     * @return CompletableFuture<ShowPluginTemplateResponse>
     */
    public CompletableFuture<ShowPluginTemplateResponse> showPluginTemplateAsync(ShowPluginTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showPluginTemplate);
    }

    /**
     * 查询插件模板
     *
     * 查询插件模板接口用于获取指定插件模板的详细信息。该接口适用于以下场景：当需要了解特定插件模板的配置、功能或使用方式时，用户可通过此接口查询插件模板的详细信息。使用该接口的前提条件是插件模板已存在且用户具有访问权限。查询操作完成后，用户将获得指定插件模板的详细信息，包括模板的配置参数、功能描述等，便于后续的插件开发或配置管理。若插件模板不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginTemplateRequest 请求对象
     * @return AsyncInvoker<ShowPluginTemplateRequest, ShowPluginTemplateResponse>
     */
    public AsyncInvoker<ShowPluginTemplateRequest, ShowPluginTemplateResponse> showPluginTemplateAsyncInvoker(
        ShowPluginTemplateRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showPluginTemplate, hcClient);
    }

    /**
     * 查询资源池
     *
     * 查询资源池信息接口用于获取指定资源池的详细信息。该接口适用于以下场景：当用户需要查看特定资源池的详细配置、状态、资源使用情况或进行资源管理时，可通过此接口查询指定资源池的详细信息。使用该接口的前提条件是用户具有相应的权限，并且指定的资源池已存在于系统中。查询操作完成后，接口将返回资源池的详细信息，包括资源池ID、名称、类型、状态、资源配额、利用率等。若指定的资源池不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return CompletableFuture<ShowPoolResponse>
     */
    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showPool);
    }

    /**
     * 查询资源池
     *
     * 查询资源池信息接口用于获取指定资源池的详细信息。该接口适用于以下场景：当用户需要查看特定资源池的详细配置、状态、资源使用情况或进行资源管理时，可通过此接口查询指定资源池的详细信息。使用该接口的前提条件是用户具有相应的权限，并且指定的资源池已存在于系统中。查询操作完成后，接口将返回资源池的详细信息，包括资源池ID、名称、类型、状态、资源配额、利用率等。若指定的资源池不存在、用户无权限操作或输入参数有误，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return AsyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public AsyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolAsyncInvoker(ShowPoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showPool, hcClient);
    }

    /**
     * 资源池监控
     *
     * 资源池监控接口用于获取指定资源池的实时或历史监控信息。该接口适用于以下场景：当需要实时查看资源池的资源使用情况、性能状态或历史数据时，用户可通过此接口获取资源池的监控数据。使用该接口的前提条件是资源池已存在且用户具有管理员权限。调用接口成功后，系统将返回资源池的监控信息，包括资源使用率、性能指标及历史趋势等数据。若资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolMonitorRequest 请求对象
     * @return CompletableFuture<ShowPoolMonitorResponse>
     */
    public CompletableFuture<ShowPoolMonitorResponse> showPoolMonitorAsync(ShowPoolMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showPoolMonitor);
    }

    /**
     * 资源池监控
     *
     * 资源池监控接口用于获取指定资源池的实时或历史监控信息。该接口适用于以下场景：当需要实时查看资源池的资源使用情况、性能状态或历史数据时，用户可通过此接口获取资源池的监控数据。使用该接口的前提条件是资源池已存在且用户具有管理员权限。调用接口成功后，系统将返回资源池的监控信息，包括资源使用率、性能指标及历史趋势等数据。若资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolMonitorRequest 请求对象
     * @return AsyncInvoker<ShowPoolMonitorRequest, ShowPoolMonitorResponse>
     */
    public AsyncInvoker<ShowPoolMonitorRequest, ShowPoolMonitorResponse> showPoolMonitorAsyncInvoker(
        ShowPoolMonitorRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showPoolMonitor, hcClient);
    }

    /**
     * 查询资源池节点自定义配置
     *
     * 查询资源池节点自定义配置接口用于获取指定资源池节点的自定义配置信息。该接口适用于以下场景：当需要查看资源池节点的详细配置、优化资源分配或管理节点资源时，用户可通过此接口获取节点的自定义配置数据。使用该接口的前提条件是资源池节点已存在且用户具有访问该节点的权限。调用接口成功后，系统将返回资源池节点的自定义配置信息，包括硬件规格、软件环境、网络设置等详细参数。若资源池节点不存在、用户无权限访问或节点配置信息未正确配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeConfigRequest 请求对象
     * @return CompletableFuture<ShowPoolNodeConfigResponse>
     */
    public CompletableFuture<ShowPoolNodeConfigResponse> showPoolNodeConfigAsync(ShowPoolNodeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showPoolNodeConfig);
    }

    /**
     * 查询资源池节点自定义配置
     *
     * 查询资源池节点自定义配置接口用于获取指定资源池节点的自定义配置信息。该接口适用于以下场景：当需要查看资源池节点的详细配置、优化资源分配或管理节点资源时，用户可通过此接口获取节点的自定义配置数据。使用该接口的前提条件是资源池节点已存在且用户具有访问该节点的权限。调用接口成功后，系统将返回资源池节点的自定义配置信息，包括硬件规格、软件环境、网络设置等详细参数。若资源池节点不存在、用户无权限访问或节点配置信息未正确配置，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeConfigRequest 请求对象
     * @return AsyncInvoker<ShowPoolNodeConfigRequest, ShowPoolNodeConfigResponse>
     */
    public AsyncInvoker<ShowPoolNodeConfigRequest, ShowPoolNodeConfigResponse> showPoolNodeConfigAsyncInvoker(
        ShowPoolNodeConfigRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showPoolNodeConfig, hcClient);
    }

    /**
     * 查询资源池节点自定义配置模板
     *
     * 查询资源池节点自定义配置模板接口用于获取节点配置模板的结构定义与参数规范。该接口适用于以下场景：当需要了解节点自定义配置的模板结构（如参数字段、校验规则、示例值）、验证配置模板是否符合规范或进行配置模板选型时，用户可通过此接口获取模板的元数据（如参数说明、类型限制、依赖关系等）。使用该接口的前提条件是目标配置模板必须已注册至系统且处于可访问状态，调用者需具备模板查看权限，且系统配置管理服务正常运行。查询操作完成后，系统将返回模板的完整定义信息（如参数列表、版本号、更新时间等），且不会对模板内容或节点配置产生影响。若模板未注册、用户权限不足或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeConfigTemplateRequest 请求对象
     * @return CompletableFuture<ShowPoolNodeConfigTemplateResponse>
     */
    public CompletableFuture<ShowPoolNodeConfigTemplateResponse> showPoolNodeConfigTemplateAsync(
        ShowPoolNodeConfigTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showPoolNodeConfigTemplate);
    }

    /**
     * 查询资源池节点自定义配置模板
     *
     * 查询资源池节点自定义配置模板接口用于获取节点配置模板的结构定义与参数规范。该接口适用于以下场景：当需要了解节点自定义配置的模板结构（如参数字段、校验规则、示例值）、验证配置模板是否符合规范或进行配置模板选型时，用户可通过此接口获取模板的元数据（如参数说明、类型限制、依赖关系等）。使用该接口的前提条件是目标配置模板必须已注册至系统且处于可访问状态，调用者需具备模板查看权限，且系统配置管理服务正常运行。查询操作完成后，系统将返回模板的完整定义信息（如参数列表、版本号、更新时间等），且不会对模板内容或节点配置产生影响。若模板未注册、用户权限不足或系统服务异常，接口将返回对应的错误信息（如\&quot;404 Not Found\&quot;、\&quot;403 Forbidden\&quot;或\&quot;503 Service Unavailable\&quot;）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolNodeConfigTemplateRequest 请求对象
     * @return AsyncInvoker<ShowPoolNodeConfigTemplateRequest, ShowPoolNodeConfigTemplateResponse>
     */
    public AsyncInvoker<ShowPoolNodeConfigTemplateRequest, ShowPoolNodeConfigTemplateResponse> showPoolNodeConfigTemplateAsyncInvoker(
        ShowPoolNodeConfigTemplateRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showPoolNodeConfigTemplate, hcClient);
    }

    /**
     * 查询资源实时利用率
     *
     * 查询资源实时利用率接口用于获取当前项目下所有资源池的实时利用率信息。该接口适用于以下场景：当用户需要监控资源使用情况、进行资源优化、容量规划或故障排查时，可通过此接口查询资源池的实时利用率，包括CPU、内存、存储等资源的使用情况。使用该接口的前提条件是用户具有访问该项目的权限，并且资源池已存在且处于运行状态。查询操作完成后，接口将返回资源池的实时利用率数据，包含利用率百分比、资源类型、时间戳等详细信息。若用户无权限、资源池不存在或系统无法获取实时数据，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRuntimeMetricsRequest 请求对象
     * @return CompletableFuture<ShowPoolRuntimeMetricsResponse>
     */
    public CompletableFuture<ShowPoolRuntimeMetricsResponse> showPoolRuntimeMetricsAsync(
        ShowPoolRuntimeMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showPoolRuntimeMetrics);
    }

    /**
     * 查询资源实时利用率
     *
     * 查询资源实时利用率接口用于获取当前项目下所有资源池的实时利用率信息。该接口适用于以下场景：当用户需要监控资源使用情况、进行资源优化、容量规划或故障排查时，可通过此接口查询资源池的实时利用率，包括CPU、内存、存储等资源的使用情况。使用该接口的前提条件是用户具有访问该项目的权限，并且资源池已存在且处于运行状态。查询操作完成后，接口将返回资源池的实时利用率数据，包含利用率百分比、资源类型、时间戳等详细信息。若用户无权限、资源池不存在或系统无法获取实时数据，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRuntimeMetricsRequest 请求对象
     * @return AsyncInvoker<ShowPoolRuntimeMetricsRequest, ShowPoolRuntimeMetricsResponse>
     */
    public AsyncInvoker<ShowPoolRuntimeMetricsRequest, ShowPoolRuntimeMetricsResponse> showPoolRuntimeMetricsAsyncInvoker(
        ShowPoolRuntimeMetricsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showPoolRuntimeMetrics, hcClient);
    }

    /**
     * 资源池统计
     *
     * 资源池统计接口用于获取指定资源池的统计信息。该接口适用于以下场景：当需要了解资源池的资源使用情况、分配情况或利用率时，用户可通过此接口获取资源池的统计数据。使用该接口的前提条件是资源池已存在且用户具有管理员权限。调用接口成功后，系统将返回资源池的统计信息，包括资源使用总量、已分配量、利用率及资源分配趋势等数据。若资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolStatisticsRequest 请求对象
     * @return CompletableFuture<ShowPoolStatisticsResponse>
     */
    public CompletableFuture<ShowPoolStatisticsResponse> showPoolStatisticsAsync(ShowPoolStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showPoolStatistics);
    }

    /**
     * 资源池统计
     *
     * 资源池统计接口用于获取指定资源池的统计信息。该接口适用于以下场景：当需要了解资源池的资源使用情况、分配情况或利用率时，用户可通过此接口获取资源池的统计数据。使用该接口的前提条件是资源池已存在且用户具有管理员权限。调用接口成功后，系统将返回资源池的统计信息，包括资源使用总量、已分配量、利用率及资源分配趋势等数据。若资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowPoolStatisticsRequest, ShowPoolStatisticsResponse>
     */
    public AsyncInvoker<ShowPoolStatisticsRequest, ShowPoolStatisticsResponse> showPoolStatisticsAsyncInvoker(
        ShowPoolStatisticsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showPoolStatistics, hcClient);
    }

    /**
     * 查询资源池上的标签
     *
     * 查询资源池的标签接口用于获取指定资源池的标签信息。该接口适用于以下场景：当需要查看、管理或统计特定资源池的标签信息时，用户可通过此接口获取资源池的标签数据。使用该接口的前提条件是资源池已存在且用户具有访问该资源池的权限。调用接口成功后，系统将返回指定资源池的标签信息，包括标签键和标签值。若资源池不存在、用户无权限访问或资源池未配置标签，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolTagsRequest 请求对象
     * @return CompletableFuture<ShowPoolTagsResponse>
     */
    public CompletableFuture<ShowPoolTagsResponse> showPoolTagsAsync(ShowPoolTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showPoolTags);
    }

    /**
     * 查询资源池上的标签
     *
     * 查询资源池的标签接口用于获取指定资源池的标签信息。该接口适用于以下场景：当需要查看、管理或统计特定资源池的标签信息时，用户可通过此接口获取资源池的标签数据。使用该接口的前提条件是资源池已存在且用户具有访问该资源池的权限。调用接口成功后，系统将返回指定资源池的标签信息，包括标签键和标签值。若资源池不存在、用户无权限访问或资源池未配置标签，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolTagsRequest 请求对象
     * @return AsyncInvoker<ShowPoolTagsRequest, ShowPoolTagsResponse>
     */
    public AsyncInvoker<ShowPoolTagsRequest, ShowPoolTagsResponse> showPoolTagsAsyncInvoker(
        ShowPoolTagsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showPoolTags, hcClient);
    }

    /**
     * 查询训练作业镜像保存任务
     *
     * 查询训练作业镜像保存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveImageJobRequest 请求对象
     * @return CompletableFuture<ShowSaveImageJobResponse>
     */
    public CompletableFuture<ShowSaveImageJobResponse> showSaveImageJobAsync(ShowSaveImageJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showSaveImageJob);
    }

    /**
     * 查询训练作业镜像保存任务
     *
     * 查询训练作业镜像保存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveImageJobRequest 请求对象
     * @return AsyncInvoker<ShowSaveImageJobRequest, ShowSaveImageJobResponse>
     */
    public AsyncInvoker<ShowSaveImageJobRequest, ShowSaveImageJobResponse> showSaveImageJobAsyncInvoker(
        ShowSaveImageJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showSaveImageJob, hcClient);
    }

    /**
     * 获取支持的超参搜索算法
     *
     * 获取支持的超参搜索算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchAlgorithmsRequest 请求对象
     * @return CompletableFuture<ShowSearchAlgorithmsResponse>
     */
    public CompletableFuture<ShowSearchAlgorithmsResponse> showSearchAlgorithmsAsync(
        ShowSearchAlgorithmsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showSearchAlgorithms);
    }

    /**
     * 获取支持的超参搜索算法
     *
     * 获取支持的超参搜索算法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchAlgorithmsRequest 请求对象
     * @return AsyncInvoker<ShowSearchAlgorithmsRequest, ShowSearchAlgorithmsResponse>
     */
    public AsyncInvoker<ShowSearchAlgorithmsRequest, ShowSearchAlgorithmsResponse> showSearchAlgorithmsAsyncInvoker(
        ShowSearchAlgorithmsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showSearchAlgorithms, hcClient);
    }

    /**
     * 查询训练作业标签
     *
     * 查询训练作业标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainJobTagsRequest 请求对象
     * @return CompletableFuture<ShowTrainJobTagsResponse>
     */
    public CompletableFuture<ShowTrainJobTagsResponse> showTrainJobTagsAsync(ShowTrainJobTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showTrainJobTags);
    }

    /**
     * 查询训练作业标签
     *
     * 查询训练作业标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainJobTagsRequest 请求对象
     * @return AsyncInvoker<ShowTrainJobTagsRequest, ShowTrainJobTagsResponse>
     */
    public AsyncInvoker<ShowTrainJobTagsRequest, ShowTrainJobTagsResponse> showTrainJobTagsAsyncInvoker(
        ShowTrainJobTagsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showTrainJobTags, hcClient);
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
     * @return CompletableFuture<ShowTrainingExperimentDetailsResponse>
     */
    public CompletableFuture<ShowTrainingExperimentDetailsResponse> showTrainingExperimentDetailsAsync(
        ShowTrainingExperimentDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showTrainingExperimentDetails);
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
     * @return AsyncInvoker<ShowTrainingExperimentDetailsRequest, ShowTrainingExperimentDetailsResponse>
     */
    public AsyncInvoker<ShowTrainingExperimentDetailsRequest, ShowTrainingExperimentDetailsResponse> showTrainingExperimentDetailsAsyncInvoker(
        ShowTrainingExperimentDetailsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showTrainingExperimentDetails, hcClient);
    }

    /**
     * 查询训练作业详情
     *
     * 查询训练作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobDetailsRequest 请求对象
     * @return CompletableFuture<ShowTrainingJobDetailsResponse>
     */
    public CompletableFuture<ShowTrainingJobDetailsResponse> showTrainingJobDetailsAsync(
        ShowTrainingJobDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showTrainingJobDetails);
    }

    /**
     * 查询训练作业详情
     *
     * 查询训练作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTrainingJobDetailsRequest, ShowTrainingJobDetailsResponse>
     */
    public AsyncInvoker<ShowTrainingJobDetailsRequest, ShowTrainingJobDetailsResponse> showTrainingJobDetailsAsyncInvoker(
        ShowTrainingJobDetailsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showTrainingJobDetails, hcClient);
    }

    /**
     * 获取训练作业支持的AI预置框架
     *
     * 获取训练作业支持的AI预置框架。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobEnginesRequest 请求对象
     * @return CompletableFuture<ShowTrainingJobEnginesResponse>
     */
    public CompletableFuture<ShowTrainingJobEnginesResponse> showTrainingJobEnginesAsync(
        ShowTrainingJobEnginesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showTrainingJobEngines);
    }

    /**
     * 获取训练作业支持的AI预置框架
     *
     * 获取训练作业支持的AI预置框架。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobEnginesRequest 请求对象
     * @return AsyncInvoker<ShowTrainingJobEnginesRequest, ShowTrainingJobEnginesResponse>
     */
    public AsyncInvoker<ShowTrainingJobEnginesRequest, ShowTrainingJobEnginesResponse> showTrainingJobEnginesAsyncInvoker(
        ShowTrainingJobEnginesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showTrainingJobEngines, hcClient);
    }

    /**
     * 获取训练作业支持的公共规格
     *
     * 获取训练作业支持的公共规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobFlavorsRequest 请求对象
     * @return CompletableFuture<ShowTrainingJobFlavorsResponse>
     */
    public CompletableFuture<ShowTrainingJobFlavorsResponse> showTrainingJobFlavorsAsync(
        ShowTrainingJobFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showTrainingJobFlavors);
    }

    /**
     * 获取训练作业支持的公共规格
     *
     * 获取训练作业支持的公共规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowTrainingJobFlavorsRequest, ShowTrainingJobFlavorsResponse>
     */
    public AsyncInvoker<ShowTrainingJobFlavorsRequest, ShowTrainingJobFlavorsResponse> showTrainingJobFlavorsAsyncInvoker(
        ShowTrainingJobFlavorsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showTrainingJobFlavors, hcClient);
    }

    /**
     * 查询训练作业指定任务的日志（预览）
     *
     * 查询训练作业指定任务的日志（预览）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobLogsPreviewRequest 请求对象
     * @return CompletableFuture<ShowTrainingJobLogsPreviewResponse>
     */
    public CompletableFuture<ShowTrainingJobLogsPreviewResponse> showTrainingJobLogsPreviewAsync(
        ShowTrainingJobLogsPreviewRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showTrainingJobLogsPreview);
    }

    /**
     * 查询训练作业指定任务的日志（预览）
     *
     * 查询训练作业指定任务的日志（预览）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobLogsPreviewRequest 请求对象
     * @return AsyncInvoker<ShowTrainingJobLogsPreviewRequest, ShowTrainingJobLogsPreviewResponse>
     */
    public AsyncInvoker<ShowTrainingJobLogsPreviewRequest, ShowTrainingJobLogsPreviewResponse> showTrainingJobLogsPreviewAsyncInvoker(
        ShowTrainingJobLogsPreviewRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showTrainingJobLogsPreview, hcClient);
    }

    /**
     * 查询训练作业指定任务的运行指标
     *
     * 查询训练作业指定任务的运行指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobMetricsRequest 请求对象
     * @return CompletableFuture<ShowTrainingJobMetricsResponse>
     */
    public CompletableFuture<ShowTrainingJobMetricsResponse> showTrainingJobMetricsAsync(
        ShowTrainingJobMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showTrainingJobMetrics);
    }

    /**
     * 查询训练作业指定任务的运行指标
     *
     * 查询训练作业指定任务的运行指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingJobMetricsRequest 请求对象
     * @return AsyncInvoker<ShowTrainingJobMetricsRequest, ShowTrainingJobMetricsResponse>
     */
    public AsyncInvoker<ShowTrainingJobMetricsRequest, ShowTrainingJobMetricsResponse> showTrainingJobMetricsAsyncInvoker(
        ShowTrainingJobMetricsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showTrainingJobMetrics, hcClient);
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
     * @return CompletableFuture<ShowTrainingQuotasResponse>
     */
    public CompletableFuture<ShowTrainingQuotasResponse> showTrainingQuotasAsync(ShowTrainingQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showTrainingQuotas);
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
     * @return AsyncInvoker<ShowTrainingQuotasRequest, ShowTrainingQuotasResponse>
     */
    public AsyncInvoker<ShowTrainingQuotasRequest, ShowTrainingQuotasResponse> showTrainingQuotasAsyncInvoker(
        ShowTrainingQuotasRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showTrainingQuotas, hcClient);
    }

    /**
     * 查询专属资源池作业统计信息
     *
     * 查询专属资源池作业统计信息接口用于获取指定专属资源池中作业的统计信息。该接口适用于以下场景：当需要了解专属资源池中作业的整体运行情况、资源使用效率或作业状态分布时，用户可通过此接口获取统计信息。使用该接口的前提条件是专属资源池已存在且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回专属资源池中作业的统计信息，包括作业总数、运行中作业数、完成作业数、资源使用率等数据。若专属资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadStatisticsRequest 请求对象
     * @return CompletableFuture<ShowWorkloadStatisticsResponse>
     */
    public CompletableFuture<ShowWorkloadStatisticsResponse> showWorkloadStatisticsAsync(
        ShowWorkloadStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkloadStatistics);
    }

    /**
     * 查询专属资源池作业统计信息
     *
     * 查询专属资源池作业统计信息接口用于获取指定专属资源池中作业的统计信息。该接口适用于以下场景：当需要了解专属资源池中作业的整体运行情况、资源使用效率或作业状态分布时，用户可通过此接口获取统计信息。使用该接口的前提条件是专属资源池已存在且用户具有相应的权限（如管理员权限或资源管理权限）。调用接口成功后，系统将返回专属资源池中作业的统计信息，包括作业总数、运行中作业数、完成作业数、资源使用率等数据。若专属资源池不存在、用户无权限操作或资源池当前不可用，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkloadStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowWorkloadStatisticsRequest, ShowWorkloadStatisticsResponse>
     */
    public AsyncInvoker<ShowWorkloadStatisticsRequest, ShowWorkloadStatisticsResponse> showWorkloadStatisticsAsyncInvoker(
        ShowWorkloadStatisticsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkloadStatistics, hcClient);
    }

    /**
     * 查询工作空间详情
     *
     * 查询工作空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceRequest 请求对象
     * @return CompletableFuture<ShowWorkspaceResponse>
     */
    public CompletableFuture<ShowWorkspaceResponse> showWorkspaceAsync(ShowWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkspace);
    }

    /**
     * 查询工作空间详情
     *
     * 查询工作空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceRequest 请求对象
     * @return AsyncInvoker<ShowWorkspaceRequest, ShowWorkspaceResponse>
     */
    public AsyncInvoker<ShowWorkspaceRequest, ShowWorkspaceResponse> showWorkspaceAsyncInvoker(
        ShowWorkspaceRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkspace, hcClient);
    }

    /**
     * 查询工作空间配额
     *
     * 查询工作空间配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceQuotasRequest 请求对象
     * @return CompletableFuture<ShowWorkspaceQuotasResponse>
     */
    public CompletableFuture<ShowWorkspaceQuotasResponse> showWorkspaceQuotasAsync(ShowWorkspaceQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkspaceQuotas);
    }

    /**
     * 查询工作空间配额
     *
     * 查询工作空间配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceQuotasRequest 请求对象
     * @return AsyncInvoker<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse>
     */
    public AsyncInvoker<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse> showWorkspaceQuotasAsyncInvoker(
        ShowWorkspaceQuotasRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkspaceQuotas, hcClient);
    }

    /**
     * 终止训练作业
     *
     * 终止训练作业，只可终止创建中、等待中、运行中的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTrainingJobRequest 请求对象
     * @return CompletableFuture<StopTrainingJobResponse>
     */
    public CompletableFuture<StopTrainingJobResponse> stopTrainingJobAsync(StopTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.stopTrainingJob);
    }

    /**
     * 终止训练作业
     *
     * 终止训练作业，只可终止创建中、等待中、运行中的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTrainingJobRequest 请求对象
     * @return AsyncInvoker<StopTrainingJobRequest, StopTrainingJobResponse>
     */
    public AsyncInvoker<StopTrainingJobRequest, StopTrainingJobResponse> stopTrainingJobAsyncInvoker(
        StopTrainingJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.stopTrainingJob, hcClient);
    }

    /**
     * 更新授权模式
     *
     * 更新授权模式接口用于修改指定资源或功能的授权方式和权限配置信息。该接口适用于以下场景：当系统管理员需要调整资源的访问权限、开发者需要更新授权策略以适应新的业务需求，或安全审计人员需要修改授权配置以符合新的安全规范时，可通过此接口更新授权模式的详细信息。使用该接口的前提条件是用户具有更新权限且目标资源或功能的授权模式已存在。调用成功后，接口将更新目标资源的授权模式，并返回更新后的授权模式信息。若用户无权限访问该接口，或目标资源的授权模式不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthModeRequest 请求对象
     * @return CompletableFuture<UpdateAuthModeResponse>
     */
    public CompletableFuture<UpdateAuthModeResponse> updateAuthModeAsync(UpdateAuthModeRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.updateAuthMode);
    }

    /**
     * 更新授权模式
     *
     * 更新授权模式接口用于修改指定资源或功能的授权方式和权限配置信息。该接口适用于以下场景：当系统管理员需要调整资源的访问权限、开发者需要更新授权策略以适应新的业务需求，或安全审计人员需要修改授权配置以符合新的安全规范时，可通过此接口更新授权模式的详细信息。使用该接口的前提条件是用户具有更新权限且目标资源或功能的授权模式已存在。调用成功后，接口将更新目标资源的授权模式，并返回更新后的授权模式信息。若用户无权限访问该接口，或目标资源的授权模式不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthModeRequest 请求对象
     * @return AsyncInvoker<UpdateAuthModeRequest, UpdateAuthModeResponse>
     */
    public AsyncInvoker<UpdateAuthModeRequest, UpdateAuthModeResponse> updateAuthModeAsyncInvoker(
        UpdateAuthModeRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.updateAuthMode, hcClient);
    }

    /**
     * 修改工作空间
     *
     * 修改工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.updateWorkspace);
    }

    /**
     * 修改工作空间
     *
     * 修改工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.updateWorkspace, hcClient);
    }

    /**
     * 修改工作空间配额
     *
     * 修改工作空间配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceQuotasRequest 请求对象
     * @return CompletableFuture<UpdateWorkspaceQuotasResponse>
     */
    public CompletableFuture<UpdateWorkspaceQuotasResponse> updateWorkspaceQuotasAsync(
        UpdateWorkspaceQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.updateWorkspaceQuotas);
    }

    /**
     * 修改工作空间配额
     *
     * 修改工作空间配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceQuotasRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse>
     */
    public AsyncInvoker<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse> updateWorkspaceQuotasAsyncInvoker(
        UpdateWorkspaceQuotasRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.updateWorkspaceQuotas, hcClient);
    }

    /**
     * 鉴权能否使用当前工作空间资源
     *
     * 鉴权能否使用当前工作空间资源接口用于验证用户是否有权限访问和使用当前工作空间中的资源。该接口适用于以下场景：当用户尝试访问或操作工作空间中的资源时，系统需要确认用户是否具有相应的权限。使用该接口的前提条件是用户已登录且工作空间已存在。鉴权成功后，用户可以正常访问和使用工作空间资源；若鉴权失败，接口将返回相应的错误信息，如用户无权限或工作空间不存在等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAuthorizationRequest 请求对象
     * @return CompletableFuture<ValidateAuthorizationResponse>
     */
    public CompletableFuture<ValidateAuthorizationResponse> validateAuthorizationAsync(
        ValidateAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.validateAuthorization);
    }

    /**
     * 鉴权能否使用当前工作空间资源
     *
     * 鉴权能否使用当前工作空间资源接口用于验证用户是否有权限访问和使用当前工作空间中的资源。该接口适用于以下场景：当用户尝试访问或操作工作空间中的资源时，系统需要确认用户是否具有相应的权限。使用该接口的前提条件是用户已登录且工作空间已存在。鉴权成功后，用户可以正常访问和使用工作空间资源；若鉴权失败，接口将返回相应的错误信息，如用户无权限或工作空间不存在等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAuthorizationRequest 请求对象
     * @return AsyncInvoker<ValidateAuthorizationRequest, ValidateAuthorizationResponse>
     */
    public AsyncInvoker<ValidateAuthorizationRequest, ValidateAuthorizationResponse> validateAuthorizationAsyncInvoker(
        ValidateAuthorizationRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.validateAuthorization, hcClient);
    }

    /**
     * 新建Workflow工作流
     *
     * 创建Workflow工作流。[可参考[如何开发Workflow](https://support.huaweicloud.com/usermanual-standard-modelarts/modelarts_workflow_0292.html)，创建工作流。](tag:hc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return CompletableFuture<CreateWorkflowResponse>
     */
    public CompletableFuture<CreateWorkflowResponse> createWorkflowAsync(CreateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkflow);
    }

    /**
     * 新建Workflow工作流
     *
     * 创建Workflow工作流。[可参考[如何开发Workflow](https://support.huaweicloud.com/usermanual-standard-modelarts/modelarts_workflow_0292.html)，创建工作流。](tag:hc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowAsyncInvoker(
        CreateWorkflowRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkflow, hcClient);
    }

    /**
     * 创建在线服务包
     *
     * 计费工作流购买资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowPurchasePoolRequest 请求对象
     * @return CompletableFuture<CreateWorkflowPurchasePoolResponse>
     */
    public CompletableFuture<CreateWorkflowPurchasePoolResponse> createWorkflowPurchasePoolAsync(
        CreateWorkflowPurchasePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkflowPurchasePool);
    }

    /**
     * 创建在线服务包
     *
     * 计费工作流购买资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowPurchasePoolRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowPurchasePoolRequest, CreateWorkflowPurchasePoolResponse>
     */
    public AsyncInvoker<CreateWorkflowPurchasePoolRequest, CreateWorkflowPurchasePoolResponse> createWorkflowPurchasePoolAsyncInvoker(
        CreateWorkflowPurchasePoolRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkflowPurchasePool, hcClient);
    }

    /**
     * 在线服务鉴权
     *
     * 计费工作流在线服务鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowServiceAuthRequest 请求对象
     * @return CompletableFuture<CreateWorkflowServiceAuthResponse>
     */
    public CompletableFuture<CreateWorkflowServiceAuthResponse> createWorkflowServiceAuthAsync(
        CreateWorkflowServiceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkflowServiceAuth);
    }

    /**
     * 在线服务鉴权
     *
     * 计费工作流在线服务鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowServiceAuthRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowServiceAuthRequest, CreateWorkflowServiceAuthResponse>
     */
    public AsyncInvoker<CreateWorkflowServiceAuthRequest, CreateWorkflowServiceAuthResponse> createWorkflowServiceAuthAsyncInvoker(
        CreateWorkflowServiceAuthRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkflowServiceAuth, hcClient);
    }

    /**
     * 删除Workflow工作流
     *
     * 通过ID删除Workflow工作流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return CompletableFuture<DeleteWorkflowResponse>
     */
    public CompletableFuture<DeleteWorkflowResponse> deleteWorkflowAsync(DeleteWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteWorkflow);
    }

    /**
     * 删除Workflow工作流
     *
     * 通过ID删除Workflow工作流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowAsyncInvoker(
        DeleteWorkflowRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteWorkflow, hcClient);
    }

    /**
     * 获取Workflow工作流列表
     *
     * 展示Workflow工作流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return CompletableFuture<ListWorkflowsResponse>
     */
    public CompletableFuture<ListWorkflowsResponse> listWorkflowsAsync(ListWorkflowsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listWorkflows);
    }

    /**
     * 获取Workflow工作流列表
     *
     * 展示Workflow工作流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsAsyncInvoker(
        ListWorkflowsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listWorkflows, hcClient);
    }

    /**
     * 查询Workflow工作流
     *
     * 通过ID查询Workflow工作流详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowRequest 请求对象
     * @return CompletableFuture<ShowWorkflowResponse>
     */
    public CompletableFuture<ShowWorkflowResponse> showWorkflowAsync(ShowWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflow);
    }

    /**
     * 查询Workflow工作流
     *
     * 通过ID查询Workflow工作流详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse>
     */
    public AsyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflowAsyncInvoker(
        ShowWorkflowRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflow, hcClient);
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
     * @return CompletableFuture<ShowWorkflowLabelsResponse>
     */
    public CompletableFuture<ShowWorkflowLabelsResponse> showWorkflowLabelsAsync(ShowWorkflowLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflowLabels);
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
     * @return AsyncInvoker<ShowWorkflowLabelsRequest, ShowWorkflowLabelsResponse>
     */
    public AsyncInvoker<ShowWorkflowLabelsRequest, ShowWorkflowLabelsResponse> showWorkflowLabelsAsyncInvoker(
        ShowWorkflowLabelsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflowLabels, hcClient);
    }

    /**
     * 总览Workflow工作流
     *
     * 获取Workflow工作流统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowsOverviewRequest 请求对象
     * @return CompletableFuture<ShowWorkflowsOverviewResponse>
     */
    public CompletableFuture<ShowWorkflowsOverviewResponse> showWorkflowsOverviewAsync(
        ShowWorkflowsOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflowsOverview);
    }

    /**
     * 总览Workflow工作流
     *
     * 获取Workflow工作流统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowsOverviewRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowsOverviewRequest, ShowWorkflowsOverviewResponse>
     */
    public AsyncInvoker<ShowWorkflowsOverviewRequest, ShowWorkflowsOverviewResponse> showWorkflowsOverviewAsyncInvoker(
        ShowWorkflowsOverviewRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflowsOverview, hcClient);
    }

    /**
     * 查询Workflow待办事项
     *
     * 获取Workflow待办列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowsTodolistRequest 请求对象
     * @return CompletableFuture<ShowWorkflowsTodolistResponse>
     */
    public CompletableFuture<ShowWorkflowsTodolistResponse> showWorkflowsTodolistAsync(
        ShowWorkflowsTodolistRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflowsTodolist);
    }

    /**
     * 查询Workflow待办事项
     *
     * 获取Workflow待办列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowsTodolistRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowsTodolistRequest, ShowWorkflowsTodolistResponse>
     */
    public AsyncInvoker<ShowWorkflowsTodolistRequest, ShowWorkflowsTodolistResponse> showWorkflowsTodolistAsyncInvoker(
        ShowWorkflowsTodolistRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflowsTodolist, hcClient);
    }

    /**
     * 修改Workflow工作流
     *
     * 更新Workflow工作流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowResponse>
     */
    public CompletableFuture<UpdateWorkflowResponse> updateWorkflowAsync(UpdateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.updateWorkflow);
    }

    /**
     * 修改Workflow工作流
     *
     * 更新Workflow工作流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowAsyncInvoker(
        UpdateWorkflowRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.updateWorkflow, hcClient);
    }

    /**
     * 新建Workflow Execution
     *
     * 创建Workflow Execution。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowExecutionRequest 请求对象
     * @return CompletableFuture<CreateWorkflowExecutionResponse>
     */
    public CompletableFuture<CreateWorkflowExecutionResponse> createWorkflowExecutionAsync(
        CreateWorkflowExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkflowExecution);
    }

    /**
     * 新建Workflow Execution
     *
     * 创建Workflow Execution。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowExecutionRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowExecutionRequest, CreateWorkflowExecutionResponse>
     */
    public AsyncInvoker<CreateWorkflowExecutionRequest, CreateWorkflowExecutionResponse> createWorkflowExecutionAsyncInvoker(
        CreateWorkflowExecutionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkflowExecution, hcClient);
    }

    /**
     * 管理Workflow Execution
     *
     * 本接口支持对Workflow Execution进行停止或重跑操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowExecutionsActionsRequest 请求对象
     * @return CompletableFuture<CreateWorkflowExecutionsActionsResponse>
     */
    public CompletableFuture<CreateWorkflowExecutionsActionsResponse> createWorkflowExecutionsActionsAsync(
        CreateWorkflowExecutionsActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkflowExecutionsActions);
    }

    /**
     * 管理Workflow Execution
     *
     * 本接口支持对Workflow Execution进行停止或重跑操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowExecutionsActionsRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowExecutionsActionsRequest, CreateWorkflowExecutionsActionsResponse>
     */
    public AsyncInvoker<CreateWorkflowExecutionsActionsRequest, CreateWorkflowExecutionsActionsResponse> createWorkflowExecutionsActionsAsyncInvoker(
        CreateWorkflowExecutionsActionsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkflowExecutionsActions, hcClient);
    }

    /**
     * 管理Workflow StepExecution
     *
     * 本接口支持对Workflow StepExecution进行重试、停止和继续操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowStepExecutionsActionsRequest 请求对象
     * @return CompletableFuture<CreateWorkflowStepExecutionsActionsResponse>
     */
    public CompletableFuture<CreateWorkflowStepExecutionsActionsResponse> createWorkflowStepExecutionsActionsAsync(
        CreateWorkflowStepExecutionsActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkflowStepExecutionsActions);
    }

    /**
     * 管理Workflow StepExecution
     *
     * 本接口支持对Workflow StepExecution进行重试、停止和继续操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowStepExecutionsActionsRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowStepExecutionsActionsRequest, CreateWorkflowStepExecutionsActionsResponse>
     */
    public AsyncInvoker<CreateWorkflowStepExecutionsActionsRequest, CreateWorkflowStepExecutionsActionsResponse> createWorkflowStepExecutionsActionsAsyncInvoker(
        CreateWorkflowStepExecutionsActionsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkflowStepExecutionsActions, hcClient);
    }

    /**
     * 删除Workflow Execution
     *
     * 通过ID删除Workflow Execution。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowExecutionRequest 请求对象
     * @return CompletableFuture<DeleteWorkflowExecutionResponse>
     */
    public CompletableFuture<DeleteWorkflowExecutionResponse> deleteWorkflowExecutionAsync(
        DeleteWorkflowExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteWorkflowExecution);
    }

    /**
     * 删除Workflow Execution
     *
     * 通过ID删除Workflow Execution。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowExecutionRequest 请求对象
     * @return AsyncInvoker<DeleteWorkflowExecutionRequest, DeleteWorkflowExecutionResponse>
     */
    public AsyncInvoker<DeleteWorkflowExecutionRequest, DeleteWorkflowExecutionResponse> deleteWorkflowExecutionAsyncInvoker(
        DeleteWorkflowExecutionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteWorkflowExecution, hcClient);
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
     * @return CompletableFuture<ListExecutionLabelsResponse>
     */
    public CompletableFuture<ListExecutionLabelsResponse> listExecutionLabelsAsync(ListExecutionLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listExecutionLabels);
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
     * @return AsyncInvoker<ListExecutionLabelsRequest, ListExecutionLabelsResponse>
     */
    public AsyncInvoker<ListExecutionLabelsRequest, ListExecutionLabelsResponse> listExecutionLabelsAsyncInvoker(
        ListExecutionLabelsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listExecutionLabels, hcClient);
    }

    /**
     * 获取Execution列表
     *
     * 查询Workflow下的执行记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowExecutionsRequest 请求对象
     * @return CompletableFuture<ListWorkflowExecutionsResponse>
     */
    public CompletableFuture<ListWorkflowExecutionsResponse> listWorkflowExecutionsAsync(
        ListWorkflowExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listWorkflowExecutions);
    }

    /**
     * 获取Execution列表
     *
     * 查询Workflow下的执行记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowExecutionsRequest 请求对象
     * @return AsyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>
     */
    public AsyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutionsAsyncInvoker(
        ListWorkflowExecutionsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listWorkflowExecutions, hcClient);
    }

    /**
     * 获取StepExecution列表
     *
     * 查询指定工作流中各步骤的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowStepExecutionRequest 请求对象
     * @return CompletableFuture<ListWorkflowStepExecutionResponse>
     */
    public CompletableFuture<ListWorkflowStepExecutionResponse> listWorkflowStepExecutionAsync(
        ListWorkflowStepExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listWorkflowStepExecution);
    }

    /**
     * 获取StepExecution列表
     *
     * 查询指定工作流中各步骤的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowStepExecutionRequest 请求对象
     * @return AsyncInvoker<ListWorkflowStepExecutionRequest, ListWorkflowStepExecutionResponse>
     */
    public AsyncInvoker<ListWorkflowStepExecutionRequest, ListWorkflowStepExecutionResponse> listWorkflowStepExecutionAsyncInvoker(
        ListWorkflowStepExecutionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listWorkflowStepExecution, hcClient);
    }

    /**
     * 查询Workflow Execution
     *
     * 通过ID查询Workflow Execution详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowExecutionRequest 请求对象
     * @return CompletableFuture<ShowWorkflowExecutionResponse>
     */
    public CompletableFuture<ShowWorkflowExecutionResponse> showWorkflowExecutionAsync(
        ShowWorkflowExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflowExecution);
    }

    /**
     * 查询Workflow Execution
     *
     * 通过ID查询Workflow Execution详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowExecutionRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse>
     */
    public AsyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> showWorkflowExecutionAsyncInvoker(
        ShowWorkflowExecutionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflowExecution, hcClient);
    }

    /**
     * 获取Workflow工作流节点度量信息
     *
     * 获取Workflow工作流节点的度量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowStepExecutionMetricsRequest 请求对象
     * @return CompletableFuture<ShowWorkflowStepExecutionMetricsResponse>
     */
    public CompletableFuture<ShowWorkflowStepExecutionMetricsResponse> showWorkflowStepExecutionMetricsAsync(
        ShowWorkflowStepExecutionMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflowStepExecutionMetrics);
    }

    /**
     * 获取Workflow工作流节点度量信息
     *
     * 获取Workflow工作流节点的度量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowStepExecutionMetricsRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowStepExecutionMetricsRequest, ShowWorkflowStepExecutionMetricsResponse>
     */
    public AsyncInvoker<ShowWorkflowStepExecutionMetricsRequest, ShowWorkflowStepExecutionMetricsResponse> showWorkflowStepExecutionMetricsAsyncInvoker(
        ShowWorkflowStepExecutionMetricsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflowStepExecutionMetrics, hcClient);
    }

    /**
     * 更新Workflow Execution
     *
     * 通过ID更新Workflow Exectuion。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowExecutionRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowExecutionResponse>
     */
    public CompletableFuture<UpdateWorkflowExecutionResponse> updateWorkflowExecutionAsync(
        UpdateWorkflowExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.updateWorkflowExecution);
    }

    /**
     * 更新Workflow Execution
     *
     * 通过ID更新Workflow Exectuion。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowExecutionRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowExecutionRequest, UpdateWorkflowExecutionResponse>
     */
    public AsyncInvoker<UpdateWorkflowExecutionRequest, UpdateWorkflowExecutionResponse> updateWorkflowExecutionAsyncInvoker(
        UpdateWorkflowExecutionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.updateWorkflowExecution, hcClient);
    }

    /**
     * 创建工作流定时调度
     *
     * 创建Workflow定时调度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowScheduleRequest 请求对象
     * @return CompletableFuture<CreateWorkflowScheduleResponse>
     */
    public CompletableFuture<CreateWorkflowScheduleResponse> createWorkflowScheduleAsync(
        CreateWorkflowScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkflowSchedule);
    }

    /**
     * 创建工作流定时调度
     *
     * 创建Workflow定时调度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowScheduleRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowScheduleRequest, CreateWorkflowScheduleResponse>
     */
    public AsyncInvoker<CreateWorkflowScheduleRequest, CreateWorkflowScheduleResponse> createWorkflowScheduleAsyncInvoker(
        CreateWorkflowScheduleRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkflowSchedule, hcClient);
    }

    /**
     * 删除工作流定时调度信息
     *
     * 删除工作流调度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowScheduleIdRequest 请求对象
     * @return CompletableFuture<DeleteWorkflowScheduleIdResponse>
     */
    public CompletableFuture<DeleteWorkflowScheduleIdResponse> deleteWorkflowScheduleIdAsync(
        DeleteWorkflowScheduleIdRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteWorkflowScheduleId);
    }

    /**
     * 删除工作流定时调度信息
     *
     * 删除工作流调度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowScheduleIdRequest 请求对象
     * @return AsyncInvoker<DeleteWorkflowScheduleIdRequest, DeleteWorkflowScheduleIdResponse>
     */
    public AsyncInvoker<DeleteWorkflowScheduleIdRequest, DeleteWorkflowScheduleIdResponse> deleteWorkflowScheduleIdAsyncInvoker(
        DeleteWorkflowScheduleIdRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteWorkflowScheduleId, hcClient);
    }

    /**
     * 查询工作流定时调度详情
     *
     * 查询工作流调度详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowScheduleRequest 请求对象
     * @return CompletableFuture<ShowWorkflowScheduleResponse>
     */
    public CompletableFuture<ShowWorkflowScheduleResponse> showWorkflowScheduleAsync(
        ShowWorkflowScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflowSchedule);
    }

    /**
     * 查询工作流定时调度详情
     *
     * 查询工作流调度详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowScheduleRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowScheduleRequest, ShowWorkflowScheduleResponse>
     */
    public AsyncInvoker<ShowWorkflowScheduleRequest, ShowWorkflowScheduleResponse> showWorkflowScheduleAsyncInvoker(
        ShowWorkflowScheduleRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflowSchedule, hcClient);
    }

    /**
     * 查询工作流定时调度列表
     *
     * 获取指定工作流的定时调度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowScheduleListRequest 请求对象
     * @return CompletableFuture<ShowWorkflowScheduleListResponse>
     */
    public CompletableFuture<ShowWorkflowScheduleListResponse> showWorkflowScheduleListAsync(
        ShowWorkflowScheduleListRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflowScheduleList);
    }

    /**
     * 查询工作流定时调度列表
     *
     * 获取指定工作流的定时调度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowScheduleListRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowScheduleListRequest, ShowWorkflowScheduleListResponse>
     */
    public AsyncInvoker<ShowWorkflowScheduleListRequest, ShowWorkflowScheduleListResponse> showWorkflowScheduleListAsyncInvoker(
        ShowWorkflowScheduleListRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflowScheduleList, hcClient);
    }

    /**
     * 更新工作流定时调度信息
     *
     * 更新WorkflowSchedule信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowScheduleRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowScheduleResponse>
     */
    public CompletableFuture<UpdateWorkflowScheduleResponse> updateWorkflowScheduleAsync(
        UpdateWorkflowScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.updateWorkflowSchedule);
    }

    /**
     * 更新工作流定时调度信息
     *
     * 更新WorkflowSchedule信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowScheduleRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowScheduleRequest, UpdateWorkflowScheduleResponse>
     */
    public AsyncInvoker<UpdateWorkflowScheduleRequest, UpdateWorkflowScheduleResponse> updateWorkflowScheduleAsyncInvoker(
        UpdateWorkflowScheduleRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.updateWorkflowSchedule, hcClient);
    }

    /**
     * 新建消息订阅Subscription
     *
     * 为Workflow工作流添加消息订阅功能。工作流已订阅的事件发生时，会产生消息提醒。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowSubscriptionsRequest 请求对象
     * @return CompletableFuture<CreateWorkflowSubscriptionsResponse>
     */
    public CompletableFuture<CreateWorkflowSubscriptionsResponse> createWorkflowSubscriptionsAsync(
        CreateWorkflowSubscriptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createWorkflowSubscriptions);
    }

    /**
     * 新建消息订阅Subscription
     *
     * 为Workflow工作流添加消息订阅功能。工作流已订阅的事件发生时，会产生消息提醒。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowSubscriptionsRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowSubscriptionsRequest, CreateWorkflowSubscriptionsResponse>
     */
    public AsyncInvoker<CreateWorkflowSubscriptionsRequest, CreateWorkflowSubscriptionsResponse> createWorkflowSubscriptionsAsyncInvoker(
        CreateWorkflowSubscriptionsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createWorkflowSubscriptions, hcClient);
    }

    /**
     * 删除消息订阅Subscription
     *
     * 删除已订阅的消息订阅Subscription。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowSubscriptionRequest 请求对象
     * @return CompletableFuture<DeleteWorkflowSubscriptionResponse>
     */
    public CompletableFuture<DeleteWorkflowSubscriptionResponse> deleteWorkflowSubscriptionAsync(
        DeleteWorkflowSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteWorkflowSubscription);
    }

    /**
     * 删除消息订阅Subscription
     *
     * 删除已订阅的消息订阅Subscription。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowSubscriptionRequest 请求对象
     * @return AsyncInvoker<DeleteWorkflowSubscriptionRequest, DeleteWorkflowSubscriptionResponse>
     */
    public AsyncInvoker<DeleteWorkflowSubscriptionRequest, DeleteWorkflowSubscriptionResponse> deleteWorkflowSubscriptionAsyncInvoker(
        DeleteWorkflowSubscriptionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteWorkflowSubscription, hcClient);
    }

    /**
     * 查询消息订阅Subscription详情
     *
     * 查询Workflow工作流已订阅的订阅信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowSubscriptionRequest 请求对象
     * @return CompletableFuture<ShowWorkflowSubscriptionResponse>
     */
    public CompletableFuture<ShowWorkflowSubscriptionResponse> showWorkflowSubscriptionAsync(
        ShowWorkflowSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showWorkflowSubscription);
    }

    /**
     * 查询消息订阅Subscription详情
     *
     * 查询Workflow工作流已订阅的订阅信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowSubscriptionRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowSubscriptionRequest, ShowWorkflowSubscriptionResponse>
     */
    public AsyncInvoker<ShowWorkflowSubscriptionRequest, ShowWorkflowSubscriptionResponse> showWorkflowSubscriptionAsyncInvoker(
        ShowWorkflowSubscriptionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showWorkflowSubscription, hcClient);
    }

    /**
     * 更新消息订阅Subscription
     *
     * 更新Workflow工作流已订阅的订阅信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowSubscriptionRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowSubscriptionResponse>
     */
    public CompletableFuture<UpdateWorkflowSubscriptionResponse> updateWorkflowSubscriptionAsync(
        UpdateWorkflowSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.updateWorkflowSubscription);
    }

    /**
     * 更新消息订阅Subscription
     *
     * 更新Workflow工作流已订阅的订阅信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowSubscriptionRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowSubscriptionRequest, UpdateWorkflowSubscriptionResponse>
     */
    public AsyncInvoker<UpdateWorkflowSubscriptionRequest, UpdateWorkflowSubscriptionResponse> updateWorkflowSubscriptionAsyncInvoker(
        UpdateWorkflowSubscriptionRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.updateWorkflowSubscription, hcClient);
    }

}
