package com.huaweicloud.sdk.codeartspipeline.v2;

import com.huaweicloud.sdk.codeartspipeline.v2.model.AcceptManualReviewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.AcceptManualReviewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ActionsManualRunPipelineDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ActionsPipelineRunsPollingQueryDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ActionsPipelineRunsQueryDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ActionsReRunPipelineDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.AgentPluginInfoQueryDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchMovePipelineToGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchMovePipelineToGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesLatestStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesLatestStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BusinessTypePluginsQueryDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateIdRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateIdResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineNewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineNewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePluginDraftRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePluginDraftResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePluginVersionRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePluginVersionResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleReq;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleSetReq;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteActionsRunPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteActionsRunPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePluginDraftRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePluginDraftResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListActionsPipelineRunsByRunIdsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListActionsPipelineRunsByRunIdsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListActionsPipelineRunsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListActionsPipelineRunsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListAvailablePublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListAvailablePublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsNewPostRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsNewPostResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPLuginVersionRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPLuginVersionResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineQuery;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineRunsQuery;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineRunsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineRunsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineSimpleInfoRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineSimpleInfoRequestBody;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineSimpleInfoResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineTemplatesQuery;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineTemplatesRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineTemplatesResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelinesRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelinesResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipleineBuildResultRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipleineBuildResultResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPluginVersionNumberRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPluginVersionNumberResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPluginsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPluginsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListProjectStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListProjectStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListStagePluginsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListStagePluginsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListTemplatesRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListTemplatesResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.LogQuery;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineByTemplateDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineExecuteStates;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineGroupBindDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineGroupCreateDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineGroupUpdateDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineGroupVo;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineLatestRun;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineMoveToGroupResponseVo;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PipelineTemplateDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PluginBasicDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PluginDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PluginPartQueryDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PluginPartQueryVOListAgentPluginInputVO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PluginPartQueryVOListAgentPluginOutputVO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginBindRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginBindResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginDraftRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginDraftResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublisherVO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RejectManualReviewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RejectManualReviewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RemovePipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RemovePipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryPipelineRunRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryPipelineRunResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryRunActionsPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryRunActionsPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunActionsPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunActionsPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowActionsRunsDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowActionsRunsDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineArtifactsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineArtifactsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineGroupTreeRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineGroupTreeResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineLogRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineLogResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineRunDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineRunDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineTemplateDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineTemplateDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipleineStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipleineStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginInputsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginInputsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginMetricsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginMetricsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginOutputsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginOutputsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginVersionRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginVersionResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowStepOutputsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowStepOutputsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowTemplateDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowTemplateDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StagePluginsQueryDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StartNewPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StartNewPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StartPipelineParameters;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineNewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineNewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineRunRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineRunResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.TemplateCddl;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineInfoRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineInfoResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePluginBaseInfoRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePluginBaseInfoResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePluginDraftRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePluginDraftResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateRuleReq;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateRuleSetReq;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateRuleSetStatusReq;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadBasicPluginRequestBody;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPluginIconRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPluginIconRequestBody;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPluginIconResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPublisherIconRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPublisherIconRequestBody;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPublisherIconResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeArtsPipelineMeta {

    public static final HttpRequestDef<AcceptManualReviewRequest, AcceptManualReviewResponse> acceptManualReview =
        genForAcceptManualReview();

    private static HttpRequestDef<AcceptManualReviewRequest, AcceptManualReviewResponse> genForAcceptManualReview() {
        // basic
        HttpRequestDef.Builder<AcceptManualReviewRequest, AcceptManualReviewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AcceptManualReviewRequest.class, AcceptManualReviewResponse.class)
            .withName("AcceptManualReview")
            .withUri(
                "/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/{pipeline_run_id}/jobs/{job_run_id}/steps/{step_run_id}/pass")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getJobRunId, AcceptManualReviewRequest::setJobRunId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getProjectId, AcceptManualReviewRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getPipelineId, AcceptManualReviewRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getPipelineRunId,
                AcceptManualReviewRequest::setPipelineRunId));
        builder.<String>withRequestField("step_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getStepRunId, AcceptManualReviewRequest::setStepRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse> batchMovePipelineToGroup =
        genForBatchMovePipelineToGroup();

    private static HttpRequestDef<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse> genForBatchMovePipelineToGroup() {
        // basic
        HttpRequestDef.Builder<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchMovePipelineToGroupRequest.class, BatchMovePipelineToGroupResponse.class)
                .withName("BatchMovePipelineToGroup")
                .withUri("/v5/{project_id}/api/pipeline-group/pipeline/move")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchMovePipelineToGroupRequest::getProjectId,
                BatchMovePipelineToGroupRequest::setProjectId));
        builder.<PipelineGroupBindDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineGroupBindDTO.class),
            f -> f.withMarshaller(BatchMovePipelineToGroupRequest::getBody, BatchMovePipelineToGroupRequest::setBody));

        // response
        builder.<List<PipelineMoveToGroupResponseVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchMovePipelineToGroupResponse::getBody, BatchMovePipelineToGroupResponse::setBody)
                .withInnerContainerType(PipelineMoveToGroupResponseVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse> batchShowPipelinesLatestStatus =
        genForBatchShowPipelinesLatestStatus();

    private static HttpRequestDef<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse> genForBatchShowPipelinesLatestStatus() {
        // basic
        HttpRequestDef.Builder<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchShowPipelinesLatestStatusRequest.class,
                    BatchShowPipelinesLatestStatusResponse.class)
                .withName("BatchShowPipelinesLatestStatus")
                .withUri("/v5/{project_id}/api/pipelines/status")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPipelinesLatestStatusRequest::getProjectId,
                BatchShowPipelinesLatestStatusRequest::setProjectId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchShowPipelinesLatestStatusRequest::getBody,
                    BatchShowPipelinesLatestStatusRequest::setBody)
                .withInnerContainerType(String.class));

        // response
        builder.<List<PipelineLatestRun>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchShowPipelinesLatestStatusResponse::getBody,
                    BatchShowPipelinesLatestStatusResponse::setBody)
                .withInnerContainerType(PipelineLatestRun.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> batchShowPipelinesStatus =
        genForBatchShowPipelinesStatus();

    private static HttpRequestDef<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> genForBatchShowPipelinesStatus() {
        // basic
        HttpRequestDef.Builder<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, BatchShowPipelinesStatusRequest.class, BatchShowPipelinesStatusResponse.class)
                .withName("BatchShowPipelinesStatus")
                .withUri("/v3/pipelines/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowPipelinesStatusRequest::getPipelineIds,
                BatchShowPipelinesStatusRequest::setPipelineIds));

        // response
        builder.<List<PipelineExecuteStates>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowPipelinesStatusResponse::getBody, BatchShowPipelinesStatusResponse::setBody)
                .withInnerContainerType(PipelineExecuteStates.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateBasicPluginRequest, CreateBasicPluginResponse> createBasicPlugin =
        genForCreateBasicPlugin();

    private static HttpRequestDef<CreateBasicPluginRequest, CreateBasicPluginResponse> genForCreateBasicPlugin() {
        // basic
        HttpRequestDef.Builder<CreateBasicPluginRequest, CreateBasicPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBasicPluginRequest.class, CreateBasicPluginResponse.class)
                .withName("CreateBasicPlugin")
                .withUri("/v3/{domain_id}/extension/info/add")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBasicPluginRequest::getDomainId, CreateBasicPluginRequest::setDomainId));
        builder.<PluginBasicDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginBasicDTO.class),
            f -> f.withMarshaller(CreateBasicPluginRequest::getBody, CreateBasicPluginRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBasicPluginResponse::getBody, CreateBasicPluginResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> createPipelineByTemplate =
        genForCreatePipelineByTemplate();

    private static HttpRequestDef<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> genForCreatePipelineByTemplate() {
        // basic
        HttpRequestDef.Builder<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePipelineByTemplateRequest.class, CreatePipelineByTemplateResponse.class)
                .withName("CreatePipelineByTemplate")
                .withUri("/v3/templates/task")
                .withContentType("application/json");

        // requests
        builder.<TemplateCddl>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateCddl.class),
            f -> f.withMarshaller(CreatePipelineByTemplateRequest::getBody, CreatePipelineByTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse> createPipelineByTemplateId =
        genForCreatePipelineByTemplateId();

    private static HttpRequestDef<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse> genForCreatePipelineByTemplateId() {
        // basic
        HttpRequestDef.Builder<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePipelineByTemplateIdRequest.class,
                    CreatePipelineByTemplateIdResponse.class)
                .withName("CreatePipelineByTemplateId")
                .withUri("/v5/{project_id}/api/pipeline-templates/{template_id}/create-pipeline")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineByTemplateIdRequest::getProjectId,
                CreatePipelineByTemplateIdRequest::setProjectId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineByTemplateIdRequest::getTemplateId,
                CreatePipelineByTemplateIdRequest::setTemplateId));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineByTemplateIdRequest::getComponentId,
                CreatePipelineByTemplateIdRequest::setComponentId));
        builder.<PipelineByTemplateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineByTemplateDTO.class),
            f -> f.withMarshaller(CreatePipelineByTemplateIdRequest::getBody,
                CreatePipelineByTemplateIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineGroupRequest, CreatePipelineGroupResponse> createPipelineGroup =
        genForCreatePipelineGroup();

    private static HttpRequestDef<CreatePipelineGroupRequest, CreatePipelineGroupResponse> genForCreatePipelineGroup() {
        // basic
        HttpRequestDef.Builder<CreatePipelineGroupRequest, CreatePipelineGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePipelineGroupRequest.class, CreatePipelineGroupResponse.class)
                .withName("CreatePipelineGroup")
                .withUri("/v5/{project_id}/api/pipeline-group/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineGroupRequest::getProjectId, CreatePipelineGroupRequest::setProjectId));
        builder.<PipelineGroupCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineGroupCreateDTO.class),
            f -> f.withMarshaller(CreatePipelineGroupRequest::getBody, CreatePipelineGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineNewRequest, CreatePipelineNewResponse> createPipelineNew =
        genForCreatePipelineNew();

    private static HttpRequestDef<CreatePipelineNewRequest, CreatePipelineNewResponse> genForCreatePipelineNew() {
        // basic
        HttpRequestDef.Builder<CreatePipelineNewRequest, CreatePipelineNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePipelineNewRequest.class, CreatePipelineNewResponse.class)
                .withName("CreatePipelineNew")
                .withUri("/v5/{project_id}/api/pipelines")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineNewRequest::getProjectId, CreatePipelineNewRequest::setProjectId));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineNewRequest::getComponentId, CreatePipelineNewRequest::setComponentId));
        builder.<PipelineDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineDTO.class),
            f -> f.withMarshaller(CreatePipelineNewRequest::getBody, CreatePipelineNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse> createPipelineTemplate =
        genForCreatePipelineTemplate();

    private static HttpRequestDef<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse> genForCreatePipelineTemplate() {
        // basic
        HttpRequestDef.Builder<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePipelineTemplateRequest.class, CreatePipelineTemplateResponse.class)
            .withName("CreatePipelineTemplate")
            .withUri("/v5/{tenant_id}/api/pipeline-templates")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineTemplateRequest::getTenantId,
                CreatePipelineTemplateRequest::setTenantId));
        builder.<PipelineTemplateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineTemplateDTO.class),
            f -> f.withMarshaller(CreatePipelineTemplateRequest::getBody, CreatePipelineTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePluginDraftRequest, CreatePluginDraftResponse> createPluginDraft =
        genForCreatePluginDraft();

    private static HttpRequestDef<CreatePluginDraftRequest, CreatePluginDraftResponse> genForCreatePluginDraft() {
        // basic
        HttpRequestDef.Builder<CreatePluginDraftRequest, CreatePluginDraftResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePluginDraftRequest.class, CreatePluginDraftResponse.class)
                .withName("CreatePluginDraft")
                .withUri("/v1/{domain_id}/agent-plugin/create-draft")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePluginDraftRequest::getDomainId, CreatePluginDraftRequest::setDomainId));
        builder.<PluginDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginDTO.class),
            f -> f.withMarshaller(CreatePluginDraftRequest::getBody, CreatePluginDraftRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePluginDraftResponse::getBody, CreatePluginDraftResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreatePluginVersionRequest, CreatePluginVersionResponse> createPluginVersion =
        genForCreatePluginVersion();

    private static HttpRequestDef<CreatePluginVersionRequest, CreatePluginVersionResponse> genForCreatePluginVersion() {
        // basic
        HttpRequestDef.Builder<CreatePluginVersionRequest, CreatePluginVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePluginVersionRequest.class, CreatePluginVersionResponse.class)
                .withName("CreatePluginVersion")
                .withUri("/v1/{domain_id}/agent-plugin/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePluginVersionRequest::getDomainId, CreatePluginVersionRequest::setDomainId));
        builder.<PluginDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginDTO.class),
            f -> f.withMarshaller(CreatePluginVersionRequest::getBody, CreatePluginVersionRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePluginVersionResponse::getBody, CreatePluginVersionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublisherRequest, CreatePublisherResponse> createPublisher =
        genForCreatePublisher();

    private static HttpRequestDef<CreatePublisherRequest, CreatePublisherResponse> genForCreatePublisher() {
        // basic
        HttpRequestDef.Builder<CreatePublisherRequest, CreatePublisherResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublisherRequest.class, CreatePublisherResponse.class)
                .withName("CreatePublisher")
                .withUri("/v1/{domain_id}/publisher/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePublisherRequest::getDomainId, CreatePublisherRequest::setDomainId));
        builder.<PublisherRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublisherRequest.class),
            f -> f.withMarshaller(CreatePublisherRequest::getBody, CreatePublisherRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePublisherResponse::getBody, CreatePublisherResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForCreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForCreateRule() {
        // basic
        HttpRequestDef.Builder<CreateRuleRequest, CreateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleRequest.class, CreateRuleResponse.class)
                .withName("CreateRule")
                .withUri("/v2/{domain_id}/rules/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRuleRequest::getDomainId, CreateRuleRequest::setDomainId));
        builder.<CreateRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRuleReq.class),
            f -> f.withMarshaller(CreateRuleRequest::getBody, CreateRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStrategyRequest, CreateStrategyResponse> createStrategy =
        genForCreateStrategy();

    private static HttpRequestDef<CreateStrategyRequest, CreateStrategyResponse> genForCreateStrategy() {
        // basic
        HttpRequestDef.Builder<CreateStrategyRequest, CreateStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStrategyRequest.class, CreateStrategyResponse.class)
                .withName("CreateStrategy")
                .withUri("/v2/{domain_id}/tenant/rule-sets/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStrategyRequest::getDomainId, CreateStrategyRequest::setDomainId));
        builder.<CreateRuleSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRuleSetReq.class),
            f -> f.withMarshaller(CreateStrategyRequest::getBody, CreateStrategyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBasicPluginRequest, DeleteBasicPluginResponse> deleteBasicPlugin =
        genForDeleteBasicPlugin();

    private static HttpRequestDef<DeleteBasicPluginRequest, DeleteBasicPluginResponse> genForDeleteBasicPlugin() {
        // basic
        HttpRequestDef.Builder<DeleteBasicPluginRequest, DeleteBasicPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBasicPluginRequest.class, DeleteBasicPluginResponse.class)
                .withName("DeleteBasicPlugin")
                .withUri("/v3/{domain_id}/extension/info/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBasicPluginRequest::getDomainId, DeleteBasicPluginRequest::setDomainId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBasicPluginRequest::getPluginName, DeleteBasicPluginRequest::setPluginName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBasicPluginRequest::getType, DeleteBasicPluginRequest::setType));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBasicPluginRequest::getVersion, DeleteBasicPluginRequest::setVersion));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBasicPluginResponse::getBody, DeleteBasicPluginResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipelineRequest, DeletePipelineResponse> deletePipeline =
        genForDeletePipeline();

    private static HttpRequestDef<DeletePipelineRequest, DeletePipelineResponse> genForDeletePipeline() {
        // basic
        HttpRequestDef.Builder<DeletePipelineRequest, DeletePipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePipelineRequest.class, DeletePipelineResponse.class)
                .withName("DeletePipeline")
                .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineRequest::getProjectId, DeletePipelineRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineRequest::getPipelineId, DeletePipelineRequest::setPipelineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipelineGroupRequest, DeletePipelineGroupResponse> deletePipelineGroup =
        genForDeletePipelineGroup();

    private static HttpRequestDef<DeletePipelineGroupRequest, DeletePipelineGroupResponse> genForDeletePipelineGroup() {
        // basic
        HttpRequestDef.Builder<DeletePipelineGroupRequest, DeletePipelineGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePipelineGroupRequest.class, DeletePipelineGroupResponse.class)
            .withName("DeletePipelineGroup")
            .withUri("/v5/{project_id}/api/pipeline-group/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineGroupRequest::getProjectId, DeletePipelineGroupRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineGroupRequest::getId, DeletePipelineGroupRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse> deletePipelineTemplate =
        genForDeletePipelineTemplate();

    private static HttpRequestDef<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse> genForDeletePipelineTemplate() {
        // basic
        HttpRequestDef.Builder<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePipelineTemplateRequest.class, DeletePipelineTemplateResponse.class)
            .withName("DeletePipelineTemplate")
            .withUri("/v5/{tenant_id}/api/pipeline-templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineTemplateRequest::getTenantId,
                DeletePipelineTemplateRequest::setTenantId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineTemplateRequest::getTemplateId,
                DeletePipelineTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePluginDraftRequest, DeletePluginDraftResponse> deletePluginDraft =
        genForDeletePluginDraft();

    private static HttpRequestDef<DeletePluginDraftRequest, DeletePluginDraftResponse> genForDeletePluginDraft() {
        // basic
        HttpRequestDef.Builder<DeletePluginDraftRequest, DeletePluginDraftResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePluginDraftRequest.class, DeletePluginDraftResponse.class)
                .withName("DeletePluginDraft")
                .withUri("/v1/{domain_id}/agent-plugin/delete-draft")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginDraftRequest::getDomainId, DeletePluginDraftRequest::setDomainId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginDraftRequest::getPluginName, DeletePluginDraftRequest::setPluginName));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginDraftRequest::getVersion, DeletePluginDraftRequest::setVersion));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePluginDraftResponse::getBody, DeletePluginDraftResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublisherRequest, DeletePublisherResponse> deletePublisher =
        genForDeletePublisher();

    private static HttpRequestDef<DeletePublisherRequest, DeletePublisherResponse> genForDeletePublisher() {
        // basic
        HttpRequestDef.Builder<DeletePublisherRequest, DeletePublisherResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublisherRequest.class, DeletePublisherResponse.class)
                .withName("DeletePublisher")
                .withUri("/v1/{domain_id}/publisher/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublisherRequest::getDomainId, DeletePublisherRequest::setDomainId));
        builder.<String>withRequestField("publisher_unique_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublisherRequest::getPublisherUniqueId,
                DeletePublisherRequest::setPublisherUniqueId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePublisherResponse::getBody, DeletePublisherResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genForDeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genForDeleteRule() {
        // basic
        HttpRequestDef.Builder<DeleteRuleRequest, DeleteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleRequest.class, DeleteRuleResponse.class)
                .withName("DeleteRule")
                .withUri("/v2/{domain_id}/rules/{rule_id}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getDomainId, DeleteRuleRequest::setDomainId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, DeleteRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStrategyRequest, DeleteStrategyResponse> deleteStrategy =
        genForDeleteStrategy();

    private static HttpRequestDef<DeleteStrategyRequest, DeleteStrategyResponse> genForDeleteStrategy() {
        // basic
        HttpRequestDef.Builder<DeleteStrategyRequest, DeleteStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStrategyRequest.class, DeleteStrategyResponse.class)
                .withName("DeleteStrategy")
                .withUri("/v2/{domain_id}/tenant/rule-sets/{rule_set_id}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStrategyRequest::getRuleSetId, DeleteStrategyRequest::setRuleSetId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStrategyRequest::getDomainId, DeleteStrategyRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailablePublisherRequest, ListAvailablePublisherResponse> listAvailablePublisher =
        genForListAvailablePublisher();

    private static HttpRequestDef<ListAvailablePublisherRequest, ListAvailablePublisherResponse> genForListAvailablePublisher() {
        // basic
        HttpRequestDef.Builder<ListAvailablePublisherRequest, ListAvailablePublisherResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailablePublisherRequest.class, ListAvailablePublisherResponse.class)
            .withName("ListAvailablePublisher")
            .withUri("/v1/{domain_id}/publisher/optional-publisher")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailablePublisherRequest::getDomainId,
                ListAvailablePublisherRequest::setDomainId));

        // response
        builder.<List<PublisherVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAvailablePublisherResponse::getBody, ListAvailablePublisherResponse::setBody)
                .withInnerContainerType(PublisherVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListBasePluginsRequest, ListBasePluginsResponse> listBasePlugins =
        genForListBasePlugins();

    private static HttpRequestDef<ListBasePluginsRequest, ListBasePluginsResponse> genForListBasePlugins() {
        // basic
        HttpRequestDef.Builder<ListBasePluginsRequest, ListBasePluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBasePluginsRequest.class, ListBasePluginsResponse.class)
                .withName("ListBasePlugins")
                .withUri("/v1/{domain_id}/relation/plugin/single")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasePluginsRequest::getDomainId, ListBasePluginsRequest::setDomainId));
        builder.<String>withRequestField("attribution",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasePluginsRequest::getAttribution, ListBasePluginsRequest::setAttribution));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasePluginsRequest::getOffset, ListBasePluginsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasePluginsRequest::getLimit, ListBasePluginsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse> listBasePluginsNewPost =
        genForListBasePluginsNewPost();

    private static HttpRequestDef<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse> genForListBasePluginsNewPost() {
        // basic
        HttpRequestDef.Builder<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListBasePluginsNewPostRequest.class, ListBasePluginsNewPostResponse.class)
            .withName("ListBasePluginsNewPost")
            .withUri("/v1/{domain_id}/relation/plugins")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasePluginsNewPostRequest::getDomainId,
                ListBasePluginsNewPostRequest::setDomainId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBasePluginsNewPostRequest::getOffset, ListBasePluginsNewPostRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBasePluginsNewPostRequest::getLimit, ListBasePluginsNewPostRequest::setLimit));
        builder.<BusinessTypePluginsQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessTypePluginsQueryDTO.class),
            f -> f.withMarshaller(ListBasePluginsNewPostRequest::getBody, ListBasePluginsNewPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPLuginVersionRequest, ListPLuginVersionResponse> listPLuginVersion =
        genForListPLuginVersion();

    private static HttpRequestDef<ListPLuginVersionRequest, ListPLuginVersionResponse> genForListPLuginVersion() {
        // basic
        HttpRequestDef.Builder<ListPLuginVersionRequest, ListPLuginVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPLuginVersionRequest.class, ListPLuginVersionResponse.class)
                .withName("ListPLuginVersion")
                .withUri("/v1/{domain_id}/agent-plugin/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPLuginVersionRequest::getDomainId, ListPLuginVersionRequest::setDomainId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPLuginVersionRequest::getPluginName, ListPLuginVersionRequest::setPluginName));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPLuginVersionRequest::getOffset, ListPLuginVersionRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPLuginVersionRequest::getLimit, ListPLuginVersionRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineRunsRequest, ListPipelineRunsResponse> listPipelineRuns =
        genForListPipelineRuns();

    private static HttpRequestDef<ListPipelineRunsRequest, ListPipelineRunsResponse> genForListPipelineRuns() {
        // basic
        HttpRequestDef.Builder<ListPipelineRunsRequest, ListPipelineRunsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListPipelineRunsRequest.class, ListPipelineRunsResponse.class)
                .withName("ListPipelineRuns")
                .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineRunsRequest::getProjectId, ListPipelineRunsRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineRunsRequest::getPipelineId, ListPipelineRunsRequest::setPipelineId));
        builder.<ListPipelineRunsQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPipelineRunsQuery.class),
            f -> f.withMarshaller(ListPipelineRunsRequest::getBody, ListPipelineRunsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse> listPipelineSimpleInfo =
        genForListPipelineSimpleInfo();

    private static HttpRequestDef<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse> genForListPipelineSimpleInfo() {
        // basic
        HttpRequestDef.Builder<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListPipelineSimpleInfoRequest.class, ListPipelineSimpleInfoResponse.class)
            .withName("ListPipelineSimpleInfo")
            .withUri("/v3/pipelines/list")
            .withContentType("application/json");

        // requests
        builder.<ListPipelineSimpleInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPipelineSimpleInfoRequestBody.class),
            f -> f.withMarshaller(ListPipelineSimpleInfoRequest::getBody, ListPipelineSimpleInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> listPipelineTemplates =
        genForListPipelineTemplates();

    private static HttpRequestDef<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> genForListPipelineTemplates() {
        // basic
        HttpRequestDef.Builder<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListPipelineTemplatesRequest.class, ListPipelineTemplatesResponse.class)
            .withName("ListPipelineTemplates")
            .withUri("/v5/{tenant_id}/api/pipeline-templates/list")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getTenantId,
                ListPipelineTemplatesRequest::setTenantId));
        builder.<ListPipelineTemplatesQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPipelineTemplatesQuery.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getBody, ListPipelineTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelinesRequest, ListPipelinesResponse> listPipelines =
        genForListPipelines();

    private static HttpRequestDef<ListPipelinesRequest, ListPipelinesResponse> genForListPipelines() {
        // basic
        HttpRequestDef.Builder<ListPipelinesRequest, ListPipelinesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListPipelinesRequest.class, ListPipelinesResponse.class)
                .withName("ListPipelines")
                .withUri("/v5/{project_id}/api/pipelines/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelinesRequest::getProjectId, ListPipelinesRequest::setProjectId));
        builder.<ListPipelineQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPipelineQuery.class),
            f -> f.withMarshaller(ListPipelinesRequest::getBody, ListPipelinesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> listPipleineBuildResult =
        genForListPipleineBuildResult();

    private static HttpRequestDef<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> genForListPipleineBuildResult() {
        // basic
        HttpRequestDef.Builder<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPipleineBuildResultRequest.class, ListPipleineBuildResultResponse.class)
            .withName("ListPipleineBuildResult")
            .withUri("/v3/pipelines/build-result")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getProjectId,
                ListPipleineBuildResultRequest::setProjectId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getStartDate,
                ListPipleineBuildResultRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getEndDate,
                ListPipleineBuildResultRequest::setEndDate));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getOffset,
                ListPipleineBuildResultRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getLimit, ListPipleineBuildResultRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse> listPluginVersionNumber =
        genForListPluginVersionNumber();

    private static HttpRequestDef<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse> genForListPluginVersionNumber() {
        // basic
        HttpRequestDef.Builder<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPluginVersionNumberRequest.class, ListPluginVersionNumberResponse.class)
            .withName("ListPluginVersionNumber")
            .withUri("/v1/{domain_id}/agent-plugin/all-version")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginVersionNumberRequest::getDomainId,
                ListPluginVersionNumberRequest::setDomainId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginVersionNumberRequest::getPluginName,
                ListPluginVersionNumberRequest::setPluginName));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginVersionNumberRequest::getOffset,
                ListPluginVersionNumberRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginVersionNumberRequest::getLimit, ListPluginVersionNumberRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginsRequest, ListPluginsResponse> listPlugins = genForListPlugins();

    private static HttpRequestDef<ListPluginsRequest, ListPluginsResponse> genForListPlugins() {
        // basic
        HttpRequestDef.Builder<ListPluginsRequest, ListPluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListPluginsRequest.class, ListPluginsResponse.class)
                .withName("ListPlugins")
                .withUri("/v1/{domain_id}/agent-plugin/query-all")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getDomainId, ListPluginsRequest::setDomainId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getOffset, ListPluginsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getLimit, ListPluginsRequest::setLimit));
        builder.<AgentPluginInfoQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AgentPluginInfoQueryDTO.class),
            f -> f.withMarshaller(ListPluginsRequest::getBody, ListPluginsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectStrategyRequest, ListProjectStrategyResponse> listProjectStrategy =
        genForListProjectStrategy();

    private static HttpRequestDef<ListProjectStrategyRequest, ListProjectStrategyResponse> genForListProjectStrategy() {
        // basic
        HttpRequestDef.Builder<ListProjectStrategyRequest, ListProjectStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectStrategyRequest.class, ListProjectStrategyResponse.class)
                .withName("ListProjectStrategy")
                .withUri("/v2/{project_id}/rule-sets/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getProjectId, ListProjectStrategyRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getOffset, ListProjectStrategyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getLimit, ListProjectStrategyRequest::setLimit));
        builder.<Boolean>withRequestField("include_tenant_rule_set",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getIncludeTenantRuleSet,
                ListProjectStrategyRequest::setIncludeTenantRuleSet));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getName, ListProjectStrategyRequest::setName));
        builder.<Boolean>withRequestField("is_valid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getIsValid, ListProjectStrategyRequest::setIsValid));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getType, ListProjectStrategyRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublisherRequest, ListPublisherResponse> listPublisher =
        genForListPublisher();

    private static HttpRequestDef<ListPublisherRequest, ListPublisherResponse> genForListPublisher() {
        // basic
        HttpRequestDef.Builder<ListPublisherRequest, ListPublisherResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublisherRequest.class, ListPublisherResponse.class)
                .withName("ListPublisher")
                .withUri("/v1/{domain_id}/publisher/query-all")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublisherRequest::getDomainId, ListPublisherRequest::setDomainId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublisherRequest::getOffset, ListPublisherRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublisherRequest::getLimit, ListPublisherRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublisherRequest::getName, ListPublisherRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleRequest, ListRuleResponse> listRule = genForListRule();

    private static HttpRequestDef<ListRuleRequest, ListRuleResponse> genForListRule() {
        // basic
        HttpRequestDef.Builder<ListRuleRequest, ListRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleRequest.class, ListRuleResponse.class)
                .withName("ListRule")
                .withUri("/v2/{domain_id}/rules/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getDomainId, ListRuleRequest::setDomainId));
        builder.<String>withRequestField("cloud_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getCloudProjectId, ListRuleRequest::setCloudProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleRequest::getOffset, ListRuleRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleRequest::getLimit, ListRuleRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getType, ListRuleRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getName, ListRuleRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStagePluginsRequest, ListStagePluginsResponse> listStagePlugins =
        genForListStagePlugins();

    private static HttpRequestDef<ListStagePluginsRequest, ListStagePluginsResponse> genForListStagePlugins() {
        // basic
        HttpRequestDef.Builder<ListStagePluginsRequest, ListStagePluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListStagePluginsRequest.class, ListStagePluginsResponse.class)
                .withName("ListStagePlugins")
                .withUri("/v1/{domain_id}/relation/stage-plugins")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStagePluginsRequest::getDomainId, ListStagePluginsRequest::setDomainId));
        builder.<StagePluginsQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StagePluginsQueryDTO.class),
            f -> f.withMarshaller(ListStagePluginsRequest::getBody, ListStagePluginsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStrategyRequest, ListStrategyResponse> listStrategy = genForListStrategy();

    private static HttpRequestDef<ListStrategyRequest, ListStrategyResponse> genForListStrategy() {
        // basic
        HttpRequestDef.Builder<ListStrategyRequest, ListStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStrategyRequest.class, ListStrategyResponse.class)
                .withName("ListStrategy")
                .withUri("/v2/{domain_id}/tenant/rule-sets/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStrategyRequest::getDomainId, ListStrategyRequest::setDomainId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStrategyRequest::getOffset, ListStrategyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStrategyRequest::getLimit, ListStrategyRequest::setLimit));
        builder.<Boolean>withRequestField("include_tenant_rule_set",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListStrategyRequest::getIncludeTenantRuleSet,
                ListStrategyRequest::setIncludeTenantRuleSet));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStrategyRequest::getName, ListStrategyRequest::setName));
        builder.<Boolean>withRequestField("is_valid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListStrategyRequest::getIsValid, ListStrategyRequest::setIsValid));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStrategyRequest::getType, ListStrategyRequest::setType));
        builder.<String>withRequestField("cloud_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStrategyRequest::getCloudProjectId, ListStrategyRequest::setCloudProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v3/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getTemplateType, ListTemplatesRequest::setTemplateType));
        builder.<String>withRequestField("is_build_in",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getIsBuildIn, ListTemplatesRequest::setIsBuildIn));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getOffset, ListTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getLimit, ListTemplatesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getName, ListTemplatesRequest::setName));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getSort, ListTemplatesRequest::setSort));
        builder.<String>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getAsc, ListTemplatesRequest::setAsc));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishPluginRequest, PublishPluginResponse> publishPlugin =
        genForPublishPlugin();

    private static HttpRequestDef<PublishPluginRequest, PublishPluginResponse> genForPublishPlugin() {
        // basic
        HttpRequestDef.Builder<PublishPluginRequest, PublishPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishPluginRequest.class, PublishPluginResponse.class)
                .withName("PublishPlugin")
                .withUri("/v1/{domain_id}/agent-plugin/publish-plugin")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishPluginRequest::getDomainId, PublishPluginRequest::setDomainId));
        builder.<PublishPluginDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishPluginDTO.class),
            f -> f.withMarshaller(PublishPluginRequest::getBody, PublishPluginRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PublishPluginResponse::getBody, PublishPluginResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<PublishPluginBindRequest, PublishPluginBindResponse> publishPluginBind =
        genForPublishPluginBind();

    private static HttpRequestDef<PublishPluginBindRequest, PublishPluginBindResponse> genForPublishPluginBind() {
        // basic
        HttpRequestDef.Builder<PublishPluginBindRequest, PublishPluginBindResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishPluginBindRequest.class, PublishPluginBindResponse.class)
                .withName("PublishPluginBind")
                .withUri("/v1/{domain_id}/agent-plugin/publish-plugin-bind")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishPluginBindRequest::getDomainId, PublishPluginBindRequest::setDomainId));
        builder.<PublishPluginDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishPluginDTO.class),
            f -> f.withMarshaller(PublishPluginBindRequest::getBody, PublishPluginBindRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PublishPluginBindResponse::getBody, PublishPluginBindResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<PublishPluginDraftRequest, PublishPluginDraftResponse> publishPluginDraft =
        genForPublishPluginDraft();

    private static HttpRequestDef<PublishPluginDraftRequest, PublishPluginDraftResponse> genForPublishPluginDraft() {
        // basic
        HttpRequestDef.Builder<PublishPluginDraftRequest, PublishPluginDraftResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishPluginDraftRequest.class, PublishPluginDraftResponse.class)
                .withName("PublishPluginDraft")
                .withUri("/v1/{domain_id}/agent-plugin/publish-draft")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishPluginDraftRequest::getDomainId, PublishPluginDraftRequest::setDomainId));
        builder.<PluginPartQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginPartQueryDTO.class),
            f -> f.withMarshaller(PublishPluginDraftRequest::getBody, PublishPluginDraftRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PublishPluginDraftResponse::getBody, PublishPluginDraftResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<RejectManualReviewRequest, RejectManualReviewResponse> rejectManualReview =
        genForRejectManualReview();

    private static HttpRequestDef<RejectManualReviewRequest, RejectManualReviewResponse> genForRejectManualReview() {
        // basic
        HttpRequestDef.Builder<RejectManualReviewRequest, RejectManualReviewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RejectManualReviewRequest.class, RejectManualReviewResponse.class)
            .withName("RejectManualReview")
            .withUri(
                "/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/{pipeline_run_id}/jobs/{job_run_id}/steps/{step_run_id}/refuse")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getJobRunId, RejectManualReviewRequest::setJobRunId));
        builder.<String>withRequestField("step_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getStepRunId, RejectManualReviewRequest::setStepRunId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getProjectId, RejectManualReviewRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getPipelineId, RejectManualReviewRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getPipelineRunId,
                RejectManualReviewRequest::setPipelineRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemovePipelineRequest, RemovePipelineResponse> removePipeline =
        genForRemovePipeline();

    private static HttpRequestDef<RemovePipelineRequest, RemovePipelineResponse> genForRemovePipeline() {
        // basic
        HttpRequestDef.Builder<RemovePipelineRequest, RemovePipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemovePipelineRequest.class, RemovePipelineResponse.class)
                .withName("RemovePipeline")
                .withUri("/v3/pipelines/{pipeline_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemovePipelineRequest::getPipelineId, RemovePipelineRequest::setPipelineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryPipelineRunRequest, RetryPipelineRunResponse> retryPipelineRun =
        genForRetryPipelineRun();

    private static HttpRequestDef<RetryPipelineRunRequest, RetryPipelineRunResponse> genForRetryPipelineRun() {
        // basic
        HttpRequestDef.Builder<RetryPipelineRunRequest, RetryPipelineRunResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RetryPipelineRunRequest.class, RetryPipelineRunResponse.class)
                .withName("RetryPipelineRun")
                .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/{pipeline_run_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryPipelineRunRequest::getProjectId, RetryPipelineRunRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryPipelineRunRequest::getPipelineId, RetryPipelineRunRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryPipelineRunRequest::getPipelineRunId,
                RetryPipelineRunRequest::setPipelineRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunPipelineRequest, RunPipelineResponse> runPipeline = genForRunPipeline();

    private static HttpRequestDef<RunPipelineRequest, RunPipelineResponse> genForRunPipeline() {
        // basic
        HttpRequestDef.Builder<RunPipelineRequest, RunPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunPipelineRequest.class, RunPipelineResponse.class)
                .withName("RunPipeline")
                .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}/run")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunPipelineRequest::getProjectId, RunPipelineRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunPipelineRequest::getPipelineId, RunPipelineRequest::setPipelineId));
        builder.<RunPipelineDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunPipelineDTO.class),
            f -> f.withMarshaller(RunPipelineRequest::getBody, RunPipelineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBasicPluginRequest, ShowBasicPluginResponse> showBasicPlugin =
        genForShowBasicPlugin();

    private static HttpRequestDef<ShowBasicPluginRequest, ShowBasicPluginResponse> genForShowBasicPlugin() {
        // basic
        HttpRequestDef.Builder<ShowBasicPluginRequest, ShowBasicPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBasicPluginRequest.class, ShowBasicPluginResponse.class)
                .withName("ShowBasicPlugin")
                .withUri("/v3/{domain_id}/extension/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBasicPluginRequest::getDomainId, ShowBasicPluginRequest::setDomainId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBasicPluginRequest::getPluginName, ShowBasicPluginRequest::setPluginName));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBasicPluginRequest::getVersion, ShowBasicPluginRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatus =
        genForShowInstanceStatus();

    private static HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> genForShowInstanceStatus() {
        // basic
        HttpRequestDef.Builder<ShowInstanceStatusRequest, ShowInstanceStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceStatusRequest.class, ShowInstanceStatusResponse.class)
                .withName("ShowInstanceStatus")
                .withUri("/v3/templates/{task_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceStatusRequest::getTaskId, ShowInstanceStatusRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineArtifactsRequest, ShowPipelineArtifactsResponse> showPipelineArtifacts =
        genForShowPipelineArtifacts();

    private static HttpRequestDef<ShowPipelineArtifactsRequest, ShowPipelineArtifactsResponse> genForShowPipelineArtifacts() {
        // basic
        HttpRequestDef.Builder<ShowPipelineArtifactsRequest, ShowPipelineArtifactsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPipelineArtifactsRequest.class, ShowPipelineArtifactsResponse.class)
            .withName("ShowPipelineArtifacts")
            .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/{pipeline_run_id}/artifacts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineArtifactsRequest::getProjectId,
                ShowPipelineArtifactsRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineArtifactsRequest::getPipelineId,
                ShowPipelineArtifactsRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineArtifactsRequest::getPipelineRunId,
                ShowPipelineArtifactsRequest::setPipelineRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineDetailRequest, ShowPipelineDetailResponse> showPipelineDetail =
        genForShowPipelineDetail();

    private static HttpRequestDef<ShowPipelineDetailRequest, ShowPipelineDetailResponse> genForShowPipelineDetail() {
        // basic
        HttpRequestDef.Builder<ShowPipelineDetailRequest, ShowPipelineDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPipelineDetailRequest.class, ShowPipelineDetailResponse.class)
                .withName("ShowPipelineDetail")
                .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineDetailRequest::getProjectId, ShowPipelineDetailRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineDetailRequest::getPipelineId, ShowPipelineDetailRequest::setPipelineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse> showPipelineGroupTree =
        genForShowPipelineGroupTree();

    private static HttpRequestDef<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse> genForShowPipelineGroupTree() {
        // basic
        HttpRequestDef.Builder<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPipelineGroupTreeRequest.class, ShowPipelineGroupTreeResponse.class)
            .withName("ShowPipelineGroupTree")
            .withUri("/v5/{project_id}/api/pipeline-group/tree")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineGroupTreeRequest::getProjectId,
                ShowPipelineGroupTreeRequest::setProjectId));

        // response
        builder.<List<PipelineGroupVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPipelineGroupTreeResponse::getBody, ShowPipelineGroupTreeResponse::setBody)
                .withInnerContainerType(PipelineGroupVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineLogRequest, ShowPipelineLogResponse> showPipelineLog =
        genForShowPipelineLog();

    private static HttpRequestDef<ShowPipelineLogRequest, ShowPipelineLogResponse> genForShowPipelineLog() {
        // basic
        HttpRequestDef.Builder<ShowPipelineLogRequest, ShowPipelineLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowPipelineLogRequest.class, ShowPipelineLogResponse.class)
            .withName("ShowPipelineLog")
            .withUri(
                "/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/{pipeline_run_id}/jobs/{job_run_id}/steps/{step_run_id}/logs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineLogRequest::getProjectId, ShowPipelineLogRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineLogRequest::getPipelineId, ShowPipelineLogRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineLogRequest::getPipelineRunId, ShowPipelineLogRequest::setPipelineRunId));
        builder.<String>withRequestField("job_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineLogRequest::getJobRunId, ShowPipelineLogRequest::setJobRunId));
        builder.<String>withRequestField("step_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineLogRequest::getStepRunId, ShowPipelineLogRequest::setStepRunId));
        builder.<LogQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogQuery.class),
            f -> f.withMarshaller(ShowPipelineLogRequest::getBody, ShowPipelineLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse> showPipelineRunDetail =
        genForShowPipelineRunDetail();

    private static HttpRequestDef<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse> genForShowPipelineRunDetail() {
        // basic
        HttpRequestDef.Builder<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPipelineRunDetailRequest.class, ShowPipelineRunDetailResponse.class)
            .withName("ShowPipelineRunDetail")
            .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineRunDetailRequest::getProjectId,
                ShowPipelineRunDetailRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineRunDetailRequest::getPipelineId,
                ShowPipelineRunDetailRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineRunDetailRequest::getPipelineRunId,
                ShowPipelineRunDetailRequest::setPipelineRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse> showPipelineTemplateDetail =
        genForShowPipelineTemplateDetail();

    private static HttpRequestDef<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse> genForShowPipelineTemplateDetail() {
        // basic
        HttpRequestDef.Builder<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPipelineTemplateDetailRequest.class,
                    ShowPipelineTemplateDetailResponse.class)
                .withName("ShowPipelineTemplateDetail")
                .withUri("/v5/{tenant_id}/api/pipeline-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineTemplateDetailRequest::getTenantId,
                ShowPipelineTemplateDetailRequest::setTenantId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineTemplateDetailRequest::getTemplateId,
                ShowPipelineTemplateDetailRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipleineStatusRequest, ShowPipleineStatusResponse> showPipleineStatus =
        genForShowPipleineStatus();

    private static HttpRequestDef<ShowPipleineStatusRequest, ShowPipleineStatusResponse> genForShowPipleineStatus() {
        // basic
        HttpRequestDef.Builder<ShowPipleineStatusRequest, ShowPipleineStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPipleineStatusRequest.class, ShowPipleineStatusResponse.class)
                .withName("ShowPipleineStatus")
                .withUri("/v3/pipelines/{pipeline_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipleineStatusRequest::getPipelineId, ShowPipleineStatusRequest::setPipelineId));
        builder.<String>withRequestField("build_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipleineStatusRequest::getBuildId, ShowPipleineStatusRequest::setBuildId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginInputsRequest, ShowPluginInputsResponse> showPluginInputs =
        genForShowPluginInputs();

    private static HttpRequestDef<ShowPluginInputsRequest, ShowPluginInputsResponse> genForShowPluginInputs() {
        // basic
        HttpRequestDef.Builder<ShowPluginInputsRequest, ShowPluginInputsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowPluginInputsRequest.class, ShowPluginInputsResponse.class)
                .withName("ShowPluginInputs")
                .withUri("/v1/{domain_id}/agent-plugin/plugin-input")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginInputsRequest::getDomainId, ShowPluginInputsRequest::setDomainId));
        builder.<List<PluginPartQueryDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginInputsRequest::getBody, ShowPluginInputsRequest::setBody)
                .withInnerContainerType(PluginPartQueryDTO.class));

        // response
        builder.<List<PluginPartQueryVOListAgentPluginInputVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginInputsResponse::getBody, ShowPluginInputsResponse::setBody)
                .withInnerContainerType(PluginPartQueryVOListAgentPluginInputVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginMetricsRequest, ShowPluginMetricsResponse> showPluginMetrics =
        genForShowPluginMetrics();

    private static HttpRequestDef<ShowPluginMetricsRequest, ShowPluginMetricsResponse> genForShowPluginMetrics() {
        // basic
        HttpRequestDef.Builder<ShowPluginMetricsRequest, ShowPluginMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowPluginMetricsRequest.class, ShowPluginMetricsResponse.class)
                .withName("ShowPluginMetrics")
                .withUri("/v1/{domain_id}/agent-plugin/plugin-metrics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginMetricsRequest::getDomainId, ShowPluginMetricsRequest::setDomainId));
        builder.<List<PluginPartQueryDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginMetricsRequest::getBody, ShowPluginMetricsRequest::setBody)
                .withInnerContainerType(PluginPartQueryDTO.class));

        // response
        builder.<List<PluginPartQueryVOListAgentPluginOutputVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginMetricsResponse::getBody, ShowPluginMetricsResponse::setBody)
                .withInnerContainerType(PluginPartQueryVOListAgentPluginOutputVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginOutputsRequest, ShowPluginOutputsResponse> showPluginOutputs =
        genForShowPluginOutputs();

    private static HttpRequestDef<ShowPluginOutputsRequest, ShowPluginOutputsResponse> genForShowPluginOutputs() {
        // basic
        HttpRequestDef.Builder<ShowPluginOutputsRequest, ShowPluginOutputsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowPluginOutputsRequest.class, ShowPluginOutputsResponse.class)
                .withName("ShowPluginOutputs")
                .withUri("/v1/{domain_id}/agent-plugin/plugin-output")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginOutputsRequest::getDomainId, ShowPluginOutputsRequest::setDomainId));
        builder.<List<PluginPartQueryDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginOutputsRequest::getBody, ShowPluginOutputsRequest::setBody)
                .withInnerContainerType(PluginPartQueryDTO.class));

        // response
        builder.<List<PluginPartQueryVOListAgentPluginOutputVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginOutputsResponse::getBody, ShowPluginOutputsResponse::setBody)
                .withInnerContainerType(PluginPartQueryVOListAgentPluginOutputVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginVersionRequest, ShowPluginVersionResponse> showPluginVersion =
        genForShowPluginVersion();

    private static HttpRequestDef<ShowPluginVersionRequest, ShowPluginVersionResponse> genForShowPluginVersion() {
        // basic
        HttpRequestDef.Builder<ShowPluginVersionRequest, ShowPluginVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPluginVersionRequest.class, ShowPluginVersionResponse.class)
                .withName("ShowPluginVersion")
                .withUri("/v1/{domain_id}/agent-plugin/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginVersionRequest::getDomainId, ShowPluginVersionRequest::setDomainId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginVersionRequest::getPluginName, ShowPluginVersionRequest::setPluginName));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginVersionRequest::getVersion, ShowPluginVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectStrategyRequest, ShowProjectStrategyResponse> showProjectStrategy =
        genForShowProjectStrategy();

    private static HttpRequestDef<ShowProjectStrategyRequest, ShowProjectStrategyResponse> genForShowProjectStrategy() {
        // basic
        HttpRequestDef.Builder<ShowProjectStrategyRequest, ShowProjectStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectStrategyRequest.class, ShowProjectStrategyResponse.class)
                .withName("ShowProjectStrategy")
                .withUri("/v2/{project_id}/rule-sets/{rule_set_id}/gray/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectStrategyRequest::getRuleSetId, ShowProjectStrategyRequest::setRuleSetId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectStrategyRequest::getProjectId, ShowProjectStrategyRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublisherRequest, ShowPublisherResponse> showPublisher =
        genForShowPublisher();

    private static HttpRequestDef<ShowPublisherRequest, ShowPublisherResponse> genForShowPublisher() {
        // basic
        HttpRequestDef.Builder<ShowPublisherRequest, ShowPublisherResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowPublisherRequest.class, ShowPublisherResponse.class)
                .withName("ShowPublisher")
                .withUri("/v1/{domain_id}/publisher/detail")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublisherRequest::getDomainId, ShowPublisherRequest::setDomainId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPublisherRequest::getBody, ShowPublisherRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleRequest, ShowRuleResponse> showRule = genForShowRule();

    private static HttpRequestDef<ShowRuleRequest, ShowRuleResponse> genForShowRule() {
        // basic
        HttpRequestDef.Builder<ShowRuleRequest, ShowRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleRequest.class, ShowRuleResponse.class)
                .withName("ShowRule")
                .withUri("/v2/{domain_id}/rules/{rule_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getDomainId, ShowRuleRequest::setDomainId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getRuleId, ShowRuleRequest::setRuleId));
        builder.<String>withRequestField("cloud_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getCloudProjectId, ShowRuleRequest::setCloudProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStepOutputsRequest, ShowStepOutputsResponse> showStepOutputs =
        genForShowStepOutputs();

    private static HttpRequestDef<ShowStepOutputsRequest, ShowStepOutputsResponse> genForShowStepOutputs() {
        // basic
        HttpRequestDef.Builder<ShowStepOutputsRequest, ShowStepOutputsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStepOutputsRequest.class, ShowStepOutputsResponse.class)
                .withName("ShowStepOutputs")
                .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/{pipeline_run_id}/steps/outputs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStepOutputsRequest::getProjectId, ShowStepOutputsRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStepOutputsRequest::getPipelineId, ShowStepOutputsRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStepOutputsRequest::getPipelineRunId, ShowStepOutputsRequest::setPipelineRunId));
        builder.<String>withRequestField("step_run_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStepOutputsRequest::getStepRunIds, ShowStepOutputsRequest::setStepRunIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStrategyRequest, ShowStrategyResponse> showStrategy = genForShowStrategy();

    private static HttpRequestDef<ShowStrategyRequest, ShowStrategyResponse> genForShowStrategy() {
        // basic
        HttpRequestDef.Builder<ShowStrategyRequest, ShowStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStrategyRequest.class, ShowStrategyResponse.class)
                .withName("ShowStrategy")
                .withUri("/v2/{domain_id}/tenant/rule-sets/{rule_set_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStrategyRequest::getRuleSetId, ShowStrategyRequest::setRuleSetId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStrategyRequest::getDomainId, ShowStrategyRequest::setDomainId));
        builder.<String>withRequestField("cloud_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStrategyRequest::getCloudProjectId, ShowStrategyRequest::setCloudProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetail =
        genForShowTemplateDetail();

    private static HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> genForShowTemplateDetail() {
        // basic
        HttpRequestDef.Builder<ShowTemplateDetailRequest, ShowTemplateDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateDetailRequest.class, ShowTemplateDetailResponse.class)
                .withName("ShowTemplateDetail")
                .withUri("/v3/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateId, ShowTemplateDetailRequest::setTemplateId));
        builder.<String>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateType,
                ShowTemplateDetailRequest::setTemplateType));
        builder.<String>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateDetailRequest::getSource, ShowTemplateDetailRequest::setSource));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNewPipelineRequest, StartNewPipelineResponse> startNewPipeline =
        genForStartNewPipeline();

    private static HttpRequestDef<StartNewPipelineRequest, StartNewPipelineResponse> genForStartNewPipeline() {
        // basic
        HttpRequestDef.Builder<StartNewPipelineRequest, StartNewPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartNewPipelineRequest.class, StartNewPipelineResponse.class)
                .withName("StartNewPipeline")
                .withUri("/v3/pipelines/{pipeline_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNewPipelineRequest::getPipelineId, StartNewPipelineRequest::setPipelineId));
        builder.<StartPipelineParameters>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartPipelineParameters.class),
            f -> f.withMarshaller(StartNewPipelineRequest::getBody, StartNewPipelineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineNewRequest, StopPipelineNewResponse> stopPipelineNew =
        genForStopPipelineNew();

    private static HttpRequestDef<StopPipelineNewRequest, StopPipelineNewResponse> genForStopPipelineNew() {
        // basic
        HttpRequestDef.Builder<StopPipelineNewRequest, StopPipelineNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopPipelineNewRequest.class, StopPipelineNewResponse.class)
                .withName("StopPipelineNew")
                .withUri("/v3/pipelines/{pipeline_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineNewRequest::getPipelineId, StopPipelineNewRequest::setPipelineId));
        builder.<String>withRequestField("build_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineNewRequest::getBuildId, StopPipelineNewRequest::setBuildId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineRunRequest, StopPipelineRunResponse> stopPipelineRun =
        genForStopPipelineRun();

    private static HttpRequestDef<StopPipelineRunRequest, StopPipelineRunResponse> genForStopPipelineRun() {
        // basic
        HttpRequestDef.Builder<StopPipelineRunRequest, StopPipelineRunResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopPipelineRunRequest.class, StopPipelineRunResponse.class)
                .withName("StopPipelineRun")
                .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}/pipeline-runs/{pipeline_run_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineRunRequest::getProjectId, StopPipelineRunRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineRunRequest::getPipelineId, StopPipelineRunRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineRunRequest::getPipelineRunId, StopPipelineRunRequest::setPipelineRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchStrategyRequest, SwitchStrategyResponse> switchStrategy =
        genForSwitchStrategy();

    private static HttpRequestDef<SwitchStrategyRequest, SwitchStrategyResponse> genForSwitchStrategy() {
        // basic
        HttpRequestDef.Builder<SwitchStrategyRequest, SwitchStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchStrategyRequest.class, SwitchStrategyResponse.class)
                .withName("SwitchStrategy")
                .withUri("/v2/{domain_id}/tenant/rule-sets/{rule_set_id}/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchStrategyRequest::getRuleSetId, SwitchStrategyRequest::setRuleSetId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchStrategyRequest::getDomainId, SwitchStrategyRequest::setDomainId));
        builder.<UpdateRuleSetStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleSetStatusReq.class),
            f -> f.withMarshaller(SwitchStrategyRequest::getBody, SwitchStrategyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBasicPluginRequest, UpdateBasicPluginResponse> updateBasicPlugin =
        genForUpdateBasicPlugin();

    private static HttpRequestDef<UpdateBasicPluginRequest, UpdateBasicPluginResponse> genForUpdateBasicPlugin() {
        // basic
        HttpRequestDef.Builder<UpdateBasicPluginRequest, UpdateBasicPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateBasicPluginRequest.class, UpdateBasicPluginResponse.class)
                .withName("UpdateBasicPlugin")
                .withUri("/v3/{domain_id}/extension/info/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBasicPluginRequest::getDomainId, UpdateBasicPluginRequest::setDomainId));
        builder.<PluginBasicDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginBasicDTO.class),
            f -> f.withMarshaller(UpdateBasicPluginRequest::getBody, UpdateBasicPluginRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateBasicPluginResponse::getBody, UpdateBasicPluginResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse> updatePipelineGroup =
        genForUpdatePipelineGroup();

    private static HttpRequestDef<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse> genForUpdatePipelineGroup() {
        // basic
        HttpRequestDef.Builder<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdatePipelineGroupRequest.class, UpdatePipelineGroupResponse.class)
                .withName("UpdatePipelineGroup")
                .withUri("/v5/{project_id}/api/pipeline-group/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipelineGroupRequest::getProjectId, UpdatePipelineGroupRequest::setProjectId));
        builder.<PipelineGroupUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineGroupUpdateDTO.class),
            f -> f.withMarshaller(UpdatePipelineGroupRequest::getBody, UpdatePipelineGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipelineInfoRequest, UpdatePipelineInfoResponse> updatePipelineInfo =
        genForUpdatePipelineInfo();

    private static HttpRequestDef<UpdatePipelineInfoRequest, UpdatePipelineInfoResponse> genForUpdatePipelineInfo() {
        // basic
        HttpRequestDef.Builder<UpdatePipelineInfoRequest, UpdatePipelineInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePipelineInfoRequest.class, UpdatePipelineInfoResponse.class)
                .withName("UpdatePipelineInfo")
                .withUri("/v5/{project_id}/api/pipelines/{pipeline_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipelineInfoRequest::getProjectId, UpdatePipelineInfoRequest::setProjectId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipelineInfoRequest::getPipelineId, UpdatePipelineInfoRequest::setPipelineId));
        builder.<String>withRequestField("componentId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipelineInfoRequest::getComponentId,
                UpdatePipelineInfoRequest::setComponentId));
        builder.<PipelineDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineDTO.class),
            f -> f.withMarshaller(UpdatePipelineInfoRequest::getBody, UpdatePipelineInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse> updatePipelineTemplate =
        genForUpdatePipelineTemplate();

    private static HttpRequestDef<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse> genForUpdatePipelineTemplate() {
        // basic
        HttpRequestDef.Builder<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePipelineTemplateRequest.class, UpdatePipelineTemplateResponse.class)
            .withName("UpdatePipelineTemplate")
            .withUri("/v5/{tenant_id}/api/pipeline-templates/{template_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipelineTemplateRequest::getTenantId,
                UpdatePipelineTemplateRequest::setTenantId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipelineTemplateRequest::getTemplateId,
                UpdatePipelineTemplateRequest::setTemplateId));
        builder.<PipelineTemplateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PipelineTemplateDTO.class),
            f -> f.withMarshaller(UpdatePipelineTemplateRequest::getBody, UpdatePipelineTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse> updatePluginBaseInfo =
        genForUpdatePluginBaseInfo();

    private static HttpRequestDef<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse> genForUpdatePluginBaseInfo() {
        // basic
        HttpRequestDef.Builder<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdatePluginBaseInfoRequest.class, UpdatePluginBaseInfoResponse.class)
            .withName("UpdatePluginBaseInfo")
            .withUri("/v1/{domain_id}/agent-plugin/update-info")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePluginBaseInfoRequest::getDomainId, UpdatePluginBaseInfoRequest::setDomainId));
        builder.<PluginBasicDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginBasicDTO.class),
            f -> f.withMarshaller(UpdatePluginBaseInfoRequest::getBody, UpdatePluginBaseInfoRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePluginBaseInfoResponse::getBody, UpdatePluginBaseInfoResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePluginDraftRequest, UpdatePluginDraftResponse> updatePluginDraft =
        genForUpdatePluginDraft();

    private static HttpRequestDef<UpdatePluginDraftRequest, UpdatePluginDraftResponse> genForUpdatePluginDraft() {
        // basic
        HttpRequestDef.Builder<UpdatePluginDraftRequest, UpdatePluginDraftResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdatePluginDraftRequest.class, UpdatePluginDraftResponse.class)
                .withName("UpdatePluginDraft")
                .withUri("/v1/{domain_id}/agent-plugin/edit-draft")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePluginDraftRequest::getDomainId, UpdatePluginDraftRequest::setDomainId));
        builder.<PluginDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginDTO.class),
            f -> f.withMarshaller(UpdatePluginDraftRequest::getBody, UpdatePluginDraftRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePluginDraftResponse::getBody, UpdatePluginDraftResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> updateRule = genForUpdateRule();

    private static HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> genForUpdateRule() {
        // basic
        HttpRequestDef.Builder<UpdateRuleRequest, UpdateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleRequest.class, UpdateRuleResponse.class)
                .withName("UpdateRule")
                .withUri("/v2/{domain_id}/rules/{rule_id}/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getDomainId, UpdateRuleRequest::setDomainId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getRuleId, UpdateRuleRequest::setRuleId));
        builder.<UpdateRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleReq.class),
            f -> f.withMarshaller(UpdateRuleRequest::getBody, UpdateRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStrategyRequest, UpdateStrategyResponse> updateStrategy =
        genForUpdateStrategy();

    private static HttpRequestDef<UpdateStrategyRequest, UpdateStrategyResponse> genForUpdateStrategy() {
        // basic
        HttpRequestDef.Builder<UpdateStrategyRequest, UpdateStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStrategyRequest.class, UpdateStrategyResponse.class)
                .withName("UpdateStrategy")
                .withUri("/v2/{domain_id}/tenant/rule-sets/{rule_set_id}/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStrategyRequest::getRuleSetId, UpdateStrategyRequest::setRuleSetId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStrategyRequest::getDomainId, UpdateStrategyRequest::setDomainId));
        builder.<UpdateRuleSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleSetReq.class),
            f -> f.withMarshaller(UpdateStrategyRequest::getBody, UpdateStrategyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadBasicPluginRequest, UploadBasicPluginResponse> uploadBasicPlugin =
        genForUploadBasicPlugin();

    private static HttpRequestDef<UploadBasicPluginRequest, UploadBasicPluginResponse> genForUploadBasicPlugin() {
        // basic
        HttpRequestDef.Builder<UploadBasicPluginRequest, UploadBasicPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadBasicPluginRequest.class, UploadBasicPluginResponse.class)
                .withName("UploadBasicPlugin")
                .withUri("/v3/{domain_id}/extension/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadBasicPluginRequest::getDomainId, UploadBasicPluginRequest::setDomainId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadBasicPluginRequest::getPluginName, UploadBasicPluginRequest::setPluginName));
        builder.<String>withRequestField("business_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadBasicPluginRequest::getBusinessType,
                UploadBasicPluginRequest::setBusinessType));
        builder.<UploadBasicPluginRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadBasicPluginRequestBody.class),
            f -> f.withMarshaller(UploadBasicPluginRequest::getBody, UploadBasicPluginRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadBasicPluginResponse::getBody, UploadBasicPluginResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UploadPluginIconRequest, UploadPluginIconResponse> uploadPluginIcon =
        genForUploadPluginIcon();

    private static HttpRequestDef<UploadPluginIconRequest, UploadPluginIconResponse> genForUploadPluginIcon() {
        // basic
        HttpRequestDef.Builder<UploadPluginIconRequest, UploadPluginIconResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadPluginIconRequest.class, UploadPluginIconResponse.class)
                .withName("UploadPluginIcon")
                .withUri("/v1/{domain_id}/common/upload-plugin-icon")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPluginIconRequest::getDomainId, UploadPluginIconRequest::setDomainId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPluginIconRequest::getPluginName, UploadPluginIconRequest::setPluginName));
        builder.<UploadPluginIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadPluginIconRequestBody.class),
            f -> f.withMarshaller(UploadPluginIconRequest::getBody, UploadPluginIconRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadPluginIconResponse::getBody, UploadPluginIconResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UploadPublisherIconRequest, UploadPublisherIconResponse> uploadPublisherIcon =
        genForUploadPublisherIcon();

    private static HttpRequestDef<UploadPublisherIconRequest, UploadPublisherIconResponse> genForUploadPublisherIcon() {
        // basic
        HttpRequestDef.Builder<UploadPublisherIconRequest, UploadPublisherIconResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadPublisherIconRequest.class, UploadPublisherIconResponse.class)
                .withName("UploadPublisherIcon")
                .withUri("/v1/{domain_id}/common/upload-publisher-icon")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPublisherIconRequest::getDomainId, UploadPublisherIconRequest::setDomainId));
        builder.<String>withRequestField("publisher_en_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPublisherIconRequest::getPublisherEnName,
                UploadPublisherIconRequest::setPublisherEnName));
        builder.<UploadPublisherIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadPublisherIconRequestBody.class),
            f -> f.withMarshaller(UploadPublisherIconRequest::getBody, UploadPublisherIconRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadPublisherIconResponse::getBody, UploadPublisherIconResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteActionsRunPipelineRequest, DeleteActionsRunPipelineResponse> deleteActionsRunPipeline =
        genForDeleteActionsRunPipeline();

    private static HttpRequestDef<DeleteActionsRunPipelineRequest, DeleteActionsRunPipelineResponse> genForDeleteActionsRunPipeline() {
        // basic
        HttpRequestDef.Builder<DeleteActionsRunPipelineRequest, DeleteActionsRunPipelineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteActionsRunPipelineRequest.class,
                    DeleteActionsRunPipelineResponse.class)
                .withName("DeleteActionsRunPipeline")
                .withUri("/v6/{domain_id}/api/pac/pipelines/actions/{pipeline_id}/{pipeline_run_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActionsRunPipelineRequest::getDomainId,
                DeleteActionsRunPipelineRequest::setDomainId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActionsRunPipelineRequest::getPipelineId,
                DeleteActionsRunPipelineRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActionsRunPipelineRequest::getPipelineRunId,
                DeleteActionsRunPipelineRequest::setPipelineRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActionsPipelineRunsRequest, ListActionsPipelineRunsResponse> listActionsPipelineRuns =
        genForListActionsPipelineRuns();

    private static HttpRequestDef<ListActionsPipelineRunsRequest, ListActionsPipelineRunsResponse> genForListActionsPipelineRuns() {
        // basic
        HttpRequestDef.Builder<ListActionsPipelineRunsRequest, ListActionsPipelineRunsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListActionsPipelineRunsRequest.class, ListActionsPipelineRunsResponse.class)
            .withName("ListActionsPipelineRuns")
            .withUri("/v6/{domain_id}/api/pac/pipelines/actions")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActionsPipelineRunsRequest::getDomainId,
                ListActionsPipelineRunsRequest::setDomainId));
        builder.<ActionsPipelineRunsQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActionsPipelineRunsQueryDTO.class),
            f -> f.withMarshaller(ListActionsPipelineRunsRequest::getBody, ListActionsPipelineRunsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActionsPipelineRunsByRunIdsRequest, ListActionsPipelineRunsByRunIdsResponse> listActionsPipelineRunsByRunIds =
        genForListActionsPipelineRunsByRunIds();

    private static HttpRequestDef<ListActionsPipelineRunsByRunIdsRequest, ListActionsPipelineRunsByRunIdsResponse> genForListActionsPipelineRunsByRunIds() {
        // basic
        HttpRequestDef.Builder<ListActionsPipelineRunsByRunIdsRequest, ListActionsPipelineRunsByRunIdsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListActionsPipelineRunsByRunIdsRequest.class,
                    ListActionsPipelineRunsByRunIdsResponse.class)
                .withName("ListActionsPipelineRunsByRunIds")
                .withUri("/v6/{domain_id}/api/pac/pipelines/actions/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActionsPipelineRunsByRunIdsRequest::getDomainId,
                ListActionsPipelineRunsByRunIdsRequest::setDomainId));
        builder.<ActionsPipelineRunsPollingQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ActionsPipelineRunsPollingQueryDTO.class),
            f -> f.withMarshaller(ListActionsPipelineRunsByRunIdsRequest::getBody,
                ListActionsPipelineRunsByRunIdsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryRunActionsPipelineRequest, RetryRunActionsPipelineResponse> retryRunActionsPipeline =
        genForRetryRunActionsPipeline();

    private static HttpRequestDef<RetryRunActionsPipelineRequest, RetryRunActionsPipelineResponse> genForRetryRunActionsPipeline() {
        // basic
        HttpRequestDef.Builder<RetryRunActionsPipelineRequest, RetryRunActionsPipelineResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RetryRunActionsPipelineRequest.class, RetryRunActionsPipelineResponse.class)
            .withName("RetryRunActionsPipeline")
            .withUri("/v6/{domain_id}/api/pac/pipelines/actions/rerun")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryRunActionsPipelineRequest::getDomainId,
                RetryRunActionsPipelineRequest::setDomainId));
        builder.<ActionsReRunPipelineDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ActionsReRunPipelineDTO.class),
            f -> f.withMarshaller(RetryRunActionsPipelineRequest::getBody, RetryRunActionsPipelineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunActionsPipelineRequest, RunActionsPipelineResponse> runActionsPipeline =
        genForRunActionsPipeline();

    private static HttpRequestDef<RunActionsPipelineRequest, RunActionsPipelineResponse> genForRunActionsPipeline() {
        // basic
        HttpRequestDef.Builder<RunActionsPipelineRequest, RunActionsPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunActionsPipelineRequest.class, RunActionsPipelineResponse.class)
                .withName("RunActionsPipeline")
                .withUri("/v6/{domain_id}/api/pac/pipelines/actions/run")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunActionsPipelineRequest::getDomainId, RunActionsPipelineRequest::setDomainId));
        builder.<ActionsManualRunPipelineDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ActionsManualRunPipelineDTO.class),
            f -> f.withMarshaller(RunActionsPipelineRequest::getBody, RunActionsPipelineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowActionsRunsDetailRequest, ShowActionsRunsDetailResponse> showActionsRunsDetail =
        genForShowActionsRunsDetail();

    private static HttpRequestDef<ShowActionsRunsDetailRequest, ShowActionsRunsDetailResponse> genForShowActionsRunsDetail() {
        // basic
        HttpRequestDef.Builder<ShowActionsRunsDetailRequest, ShowActionsRunsDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowActionsRunsDetailRequest.class, ShowActionsRunsDetailResponse.class)
            .withName("ShowActionsRunsDetail")
            .withUri("/v6/{domain_id}/api/pac/pipelines/actions/{pipeline_id}/{pipeline_run_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActionsRunsDetailRequest::getDomainId,
                ShowActionsRunsDetailRequest::setDomainId));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActionsRunsDetailRequest::getPipelineId,
                ShowActionsRunsDetailRequest::setPipelineId));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActionsRunsDetailRequest::getPipelineRunId,
                ShowActionsRunsDetailRequest::setPipelineRunId));

        // response

        return builder.build();
    }

}
