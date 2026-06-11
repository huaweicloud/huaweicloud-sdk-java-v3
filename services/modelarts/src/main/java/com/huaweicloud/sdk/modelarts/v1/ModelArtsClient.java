package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ChangeTrainingJobDescriptionResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CheckTrainingExperimentResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAlgorithmVersionToGalleryResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.ListEventCategoriesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListEventCategoriesResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkflowsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkflowsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.ShowObsUrlOfTrainingJobLogsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowObsUrlOfTrainingJobLogsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowSaveImageJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowSaveImageJobResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkflowResponse;
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
