package com.huaweicloud.sdk.codeartspipeline.v2;

import com.huaweicloud.sdk.codeartspipeline.v2.model.AcceptManualReviewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.AcceptManualReviewResponse;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateOpenSourceStrategyResponse;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleReq;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleSetReq;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteOpenSourceStrategyResponse;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListAvailablePublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListAvailablePublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsNewPostRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsNewPostResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListOpenSourceStrategyResponse;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListProjectOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListProjectOpenSourceStrategyResponse;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.OpenSourceRuleSetCreateVO;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.PluginPartQueryDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PluginPartQueryVOListAgentPluginInputVO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PluginPartQueryVOListAgentPluginOutputVO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginBindRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginBindResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublisherVO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RejectManualReviewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RejectManualReviewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RemovePipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RemovePipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryPipelineRunRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryPipelineRunResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineDTO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineGroupTreeRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineGroupTreeResponse;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowRuleResponse;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.TemplateCddl;
import com.huaweicloud.sdk.codeartspipeline.v2.model.TenantOpenSourceRuleSetCreateVO;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineTemplateResponse;
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
import java.util.Map;

@SuppressWarnings("unchecked")
public class CodeArtsPipelineMeta {

    public static final HttpRequestDef<AcceptManualReviewRequest, AcceptManualReviewResponse> acceptManualReview =
        genForacceptManualReview();

    private static HttpRequestDef<AcceptManualReviewRequest, AcceptManualReviewResponse> genForacceptManualReview() {
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
            f -> f.withMarshaller(AcceptManualReviewRequest::getJobRunId, (req, v) -> {
                req.setJobRunId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getPipelineRunId, (req, v) -> {
                req.setPipelineRunId(v);
            }));
        builder.<String>withRequestField("step_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptManualReviewRequest::getStepRunId, (req, v) -> {
                req.setStepRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse> batchMovePipelineToGroup =
        genForbatchMovePipelineToGroup();

    private static HttpRequestDef<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse> genForbatchMovePipelineToGroup() {
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
            f -> f.withMarshaller(BatchMovePipelineToGroupRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<PipelineGroupBindDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineGroupBindDTO.class),
            f -> f.withMarshaller(BatchMovePipelineToGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<PipelineMoveToGroupResponseVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchMovePipelineToGroupResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PipelineMoveToGroupResponseVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse> batchShowPipelinesLatestStatus =
        genForbatchShowPipelinesLatestStatus();

    private static HttpRequestDef<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse> genForbatchShowPipelinesLatestStatus() {
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
            f -> f.withMarshaller(BatchShowPipelinesLatestStatusRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowPipelinesLatestStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response
        builder.<List<PipelineLatestRun>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowPipelinesLatestStatusResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PipelineLatestRun.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> batchShowPipelinesStatus =
        genForbatchShowPipelinesStatus();

    private static HttpRequestDef<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> genForbatchShowPipelinesStatus() {
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
            f -> f.withMarshaller(BatchShowPipelinesStatusRequest::getPipelineIds, (req, v) -> {
                req.setPipelineIds(v);
            }));

        // response
        builder.<List<PipelineExecuteStates>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowPipelinesStatusResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PipelineExecuteStates.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateBasicPluginRequest, CreateBasicPluginResponse> createBasicPlugin =
        genForcreateBasicPlugin();

    private static HttpRequestDef<CreateBasicPluginRequest, CreateBasicPluginResponse> genForcreateBasicPlugin() {
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
            f -> f.withMarshaller(CreateBasicPluginRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<PluginBasicDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginBasicDTO.class),
            f -> f.withMarshaller(CreateBasicPluginRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBasicPluginResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateOpenSourceStrategyRequest, CreateOpenSourceStrategyResponse> createOpenSourceStrategy =
        genForcreateOpenSourceStrategy();

    private static HttpRequestDef<CreateOpenSourceStrategyRequest, CreateOpenSourceStrategyResponse> genForcreateOpenSourceStrategy() {
        // basic
        HttpRequestDef.Builder<CreateOpenSourceStrategyRequest, CreateOpenSourceStrategyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateOpenSourceStrategyRequest.class, CreateOpenSourceStrategyResponse.class)
                .withName("CreateOpenSourceStrategy")
                .withUri("/v2/{domain_id}/tenant/open-source/rule-sets/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOpenSourceStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<TenantOpenSourceRuleSetCreateVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TenantOpenSourceRuleSetCreateVO.class),
            f -> f.withMarshaller(CreateOpenSourceStrategyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> createPipelineByTemplate =
        genForcreatePipelineByTemplate();

    private static HttpRequestDef<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> genForcreatePipelineByTemplate() {
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
            f -> f.withMarshaller(CreatePipelineByTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse> createPipelineByTemplateId =
        genForcreatePipelineByTemplateId();

    private static HttpRequestDef<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse> genForcreatePipelineByTemplateId() {
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
            f -> f.withMarshaller(CreatePipelineByTemplateIdRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineByTemplateIdRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineByTemplateIdRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<PipelineByTemplateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineByTemplateDTO.class),
            f -> f.withMarshaller(CreatePipelineByTemplateIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineGroupRequest, CreatePipelineGroupResponse> createPipelineGroup =
        genForcreatePipelineGroup();

    private static HttpRequestDef<CreatePipelineGroupRequest, CreatePipelineGroupResponse> genForcreatePipelineGroup() {
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
            f -> f.withMarshaller(CreatePipelineGroupRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<PipelineGroupCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineGroupCreateDTO.class),
            f -> f.withMarshaller(CreatePipelineGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineNewRequest, CreatePipelineNewResponse> createPipelineNew =
        genForcreatePipelineNew();

    private static HttpRequestDef<CreatePipelineNewRequest, CreatePipelineNewResponse> genForcreatePipelineNew() {
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
            f -> f.withMarshaller(CreatePipelineNewRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipelineNewRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<PipelineDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineDTO.class),
            f -> f.withMarshaller(CreatePipelineNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse> createPipelineTemplate =
        genForcreatePipelineTemplate();

    private static HttpRequestDef<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse> genForcreatePipelineTemplate() {
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
            f -> f.withMarshaller(CreatePipelineTemplateRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<PipelineTemplateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineTemplateDTO.class),
            f -> f.withMarshaller(CreatePipelineTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForcreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForcreateRule() {
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
            f -> f.withMarshaller(CreateRuleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<CreateRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRuleReq.class),
            f -> f.withMarshaller(CreateRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStrategyRequest, CreateStrategyResponse> createStrategy =
        genForcreateStrategy();

    private static HttpRequestDef<CreateStrategyRequest, CreateStrategyResponse> genForcreateStrategy() {
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
            f -> f.withMarshaller(CreateStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<CreateRuleSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRuleSetReq.class),
            f -> f.withMarshaller(CreateStrategyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBasicPluginRequest, DeleteBasicPluginResponse> deleteBasicPlugin =
        genFordeleteBasicPlugin();

    private static HttpRequestDef<DeleteBasicPluginRequest, DeleteBasicPluginResponse> genFordeleteBasicPlugin() {
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
            f -> f.withMarshaller(DeleteBasicPluginRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBasicPluginRequest::getPluginName, (req, v) -> {
                req.setPluginName(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBasicPluginResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOpenSourceStrategyRequest, DeleteOpenSourceStrategyResponse> deleteOpenSourceStrategy =
        genFordeleteOpenSourceStrategy();

    private static HttpRequestDef<DeleteOpenSourceStrategyRequest, DeleteOpenSourceStrategyResponse> genFordeleteOpenSourceStrategy() {
        // basic
        HttpRequestDef.Builder<DeleteOpenSourceStrategyRequest, DeleteOpenSourceStrategyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteOpenSourceStrategyRequest.class,
                    DeleteOpenSourceStrategyResponse.class)
                .withName("DeleteOpenSourceStrategy")
                .withUri("/v2/{domain_id}/tenant/open-source/rule-sets/{rule_set_id}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOpenSourceStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOpenSourceStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipelineRequest, DeletePipelineResponse> deletePipeline =
        genFordeletePipeline();

    private static HttpRequestDef<DeletePipelineRequest, DeletePipelineResponse> genFordeletePipeline() {
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
            f -> f.withMarshaller(DeletePipelineRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipelineGroupRequest, DeletePipelineGroupResponse> deletePipelineGroup =
        genFordeletePipelineGroup();

    private static HttpRequestDef<DeletePipelineGroupRequest, DeletePipelineGroupResponse> genFordeletePipelineGroup() {
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
            f -> f.withMarshaller(DeletePipelineGroupRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineGroupRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse> deletePipelineTemplate =
        genFordeletePipelineTemplate();

    private static HttpRequestDef<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse> genFordeletePipelineTemplate() {
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
            f -> f.withMarshaller(DeletePipelineTemplateRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipelineTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePluginDraftRequest, DeletePluginDraftResponse> deletePluginDraft =
        genFordeletePluginDraft();

    private static HttpRequestDef<DeletePluginDraftRequest, DeletePluginDraftResponse> genFordeletePluginDraft() {
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
            f -> f.withMarshaller(DeletePluginDraftRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginDraftRequest::getPluginName, (req, v) -> {
                req.setPluginName(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginDraftRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePluginDraftResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublisherRequest, DeletePublisherResponse> deletePublisher =
        genFordeletePublisher();

    private static HttpRequestDef<DeletePublisherRequest, DeletePublisherResponse> genFordeletePublisher() {
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
            f -> f.withMarshaller(DeletePublisherRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("publisher_unique_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublisherRequest::getPublisherUniqueId, (req, v) -> {
                req.setPublisherUniqueId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePublisherResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genFordeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genFordeleteRule() {
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
            f -> f.withMarshaller(DeleteRuleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStrategyRequest, DeleteStrategyResponse> deleteStrategy =
        genFordeleteStrategy();

    private static HttpRequestDef<DeleteStrategyRequest, DeleteStrategyResponse> genFordeleteStrategy() {
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
            f -> f.withMarshaller(DeleteStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailablePublisherRequest, ListAvailablePublisherResponse> listAvailablePublisher =
        genForlistAvailablePublisher();

    private static HttpRequestDef<ListAvailablePublisherRequest, ListAvailablePublisherResponse> genForlistAvailablePublisher() {
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
            f -> f.withMarshaller(ListAvailablePublisherRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response
        builder.<List<PublisherVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAvailablePublisherResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PublisherVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListBasePluginsRequest, ListBasePluginsResponse> listBasePlugins =
        genForlistBasePlugins();

    private static HttpRequestDef<ListBasePluginsRequest, ListBasePluginsResponse> genForlistBasePlugins() {
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
            f -> f.withMarshaller(ListBasePluginsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("attribution",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasePluginsRequest::getAttribution, (req, v) -> {
                req.setAttribution(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasePluginsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasePluginsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse> listBasePluginsNewPost =
        genForlistBasePluginsNewPost();

    private static HttpRequestDef<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse> genForlistBasePluginsNewPost() {
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
            f -> f.withMarshaller(ListBasePluginsNewPostRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBasePluginsNewPostRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBasePluginsNewPostRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<BusinessTypePluginsQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessTypePluginsQueryDTO.class),
            f -> f.withMarshaller(ListBasePluginsNewPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOpenSourceStrategyRequest, ListOpenSourceStrategyResponse> listOpenSourceStrategy =
        genForlistOpenSourceStrategy();

    private static HttpRequestDef<ListOpenSourceStrategyRequest, ListOpenSourceStrategyResponse> genForlistOpenSourceStrategy() {
        // basic
        HttpRequestDef.Builder<ListOpenSourceStrategyRequest, ListOpenSourceStrategyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOpenSourceStrategyRequest.class, ListOpenSourceStrategyResponse.class)
            .withName("ListOpenSourceStrategy")
            .withUri("/v2/{domain_id}/tenant/open-source/rule-sets/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpenSourceStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpenSourceStrategyRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("creator_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpenSourceStrategyRequest::getCreatorName, (req, v) -> {
                req.setCreatorName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOpenSourceStrategyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOpenSourceStrategyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPLuginVersionRequest, ListPLuginVersionResponse> listPLuginVersion =
        genForlistPLuginVersion();

    private static HttpRequestDef<ListPLuginVersionRequest, ListPLuginVersionResponse> genForlistPLuginVersion() {
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
            f -> f.withMarshaller(ListPLuginVersionRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPLuginVersionRequest::getPluginName, (req, v) -> {
                req.setPluginName(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPLuginVersionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPLuginVersionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineRunsRequest, ListPipelineRunsResponse> listPipelineRuns =
        genForlistPipelineRuns();

    private static HttpRequestDef<ListPipelineRunsRequest, ListPipelineRunsResponse> genForlistPipelineRuns() {
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
            f -> f.withMarshaller(ListPipelineRunsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineRunsRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<ListPipelineRunsQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPipelineRunsQuery.class),
            f -> f.withMarshaller(ListPipelineRunsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse> listPipelineSimpleInfo =
        genForlistPipelineSimpleInfo();

    private static HttpRequestDef<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse> genForlistPipelineSimpleInfo() {
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
            f -> f.withMarshaller(ListPipelineSimpleInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> listPipelineTemplates =
        genForlistPipelineTemplates();

    private static HttpRequestDef<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> genForlistPipelineTemplates() {
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
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<ListPipelineTemplatesQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPipelineTemplatesQuery.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelinesRequest, ListPipelinesResponse> listPipelines =
        genForlistPipelines();

    private static HttpRequestDef<ListPipelinesRequest, ListPipelinesResponse> genForlistPipelines() {
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
            f -> f.withMarshaller(ListPipelinesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<ListPipelineQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPipelineQuery.class),
            f -> f.withMarshaller(ListPipelinesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> listPipleineBuildResult =
        genForlistPipleineBuildResult();

    private static HttpRequestDef<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> genForlistPipleineBuildResult() {
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
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse> listPluginVersionNumber =
        genForlistPluginVersionNumber();

    private static HttpRequestDef<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse> genForlistPluginVersionNumber() {
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
            f -> f.withMarshaller(ListPluginVersionNumberRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginVersionNumberRequest::getPluginName, (req, v) -> {
                req.setPluginName(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginVersionNumberRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginVersionNumberRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginsRequest, ListPluginsResponse> listPlugins = genForlistPlugins();

    private static HttpRequestDef<ListPluginsRequest, ListPluginsResponse> genForlistPlugins() {
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
            f -> f.withMarshaller(ListPluginsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<AgentPluginInfoQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AgentPluginInfoQueryDTO.class),
            f -> f.withMarshaller(ListPluginsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectOpenSourceStrategyRequest, ListProjectOpenSourceStrategyResponse> listProjectOpenSourceStrategy =
        genForlistProjectOpenSourceStrategy();

    private static HttpRequestDef<ListProjectOpenSourceStrategyRequest, ListProjectOpenSourceStrategyResponse> genForlistProjectOpenSourceStrategy() {
        // basic
        HttpRequestDef.Builder<ListProjectOpenSourceStrategyRequest, ListProjectOpenSourceStrategyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectOpenSourceStrategyRequest.class,
                    ListProjectOpenSourceStrategyResponse.class)
                .withName("ListProjectOpenSourceStrategy")
                .withUri("/v2/{project_id}/open-source/rule-sets/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectOpenSourceStrategyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectOpenSourceStrategyRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("creator_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectOpenSourceStrategyRequest::getCreatorName, (req, v) -> {
                req.setCreatorName(v);
            }));
        builder.<Boolean>withRequestField("include_tenant_rule_set",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectOpenSourceStrategyRequest::getIncludeTenantRuleSet, (req, v) -> {
                req.setIncludeTenantRuleSet(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectOpenSourceStrategyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectOpenSourceStrategyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectStrategyRequest, ListProjectStrategyResponse> listProjectStrategy =
        genForlistProjectStrategy();

    private static HttpRequestDef<ListProjectStrategyRequest, ListProjectStrategyResponse> genForlistProjectStrategy() {
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
            f -> f.withMarshaller(ListProjectStrategyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("include_tenant_rule_set",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getIncludeTenantRuleSet, (req, v) -> {
                req.setIncludeTenantRuleSet(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("is_valid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getIsValid, (req, v) -> {
                req.setIsValid(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectStrategyRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublisherRequest, ListPublisherResponse> listPublisher =
        genForlistPublisher();

    private static HttpRequestDef<ListPublisherRequest, ListPublisherResponse> genForlistPublisher() {
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
            f -> f.withMarshaller(ListPublisherRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublisherRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublisherRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublisherRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleRequest, ListRuleResponse> listRule = genForlistRule();

    private static HttpRequestDef<ListRuleRequest, ListRuleResponse> genForlistRule() {
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
            f -> f.withMarshaller(ListRuleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("cloud_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getCloudProjectId, (req, v) -> {
                req.setCloudProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStagePluginsRequest, ListStagePluginsResponse> listStagePlugins =
        genForlistStagePlugins();

    private static HttpRequestDef<ListStagePluginsRequest, ListStagePluginsResponse> genForlistStagePlugins() {
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
            f -> f.withMarshaller(ListStagePluginsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<StagePluginsQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StagePluginsQueryDTO.class),
            f -> f.withMarshaller(ListStagePluginsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStrategyRequest, ListStrategyResponse> listStrategy = genForlistStrategy();

    private static HttpRequestDef<ListStrategyRequest, ListStrategyResponse> genForlistStrategy() {
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
            f -> f.withMarshaller(ListStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStrategyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStrategyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("include_tenant_rule_set",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListStrategyRequest::getIncludeTenantRuleSet, (req, v) -> {
                req.setIncludeTenantRuleSet(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStrategyRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("is_valid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListStrategyRequest::getIsValid, (req, v) -> {
                req.setIsValid(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStrategyRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("cloud_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStrategyRequest::getCloudProjectId, (req, v) -> {
                req.setCloudProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
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
            f -> f.withMarshaller(ListTemplatesRequest::getTemplateType, (req, v) -> {
                req.setTemplateType(v);
            }));
        builder.<String>withRequestField("is_build_in",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getIsBuildIn, (req, v) -> {
                req.setIsBuildIn(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getAsc, (req, v) -> {
                req.setAsc(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishPluginRequest, PublishPluginResponse> publishPlugin =
        genForpublishPlugin();

    private static HttpRequestDef<PublishPluginRequest, PublishPluginResponse> genForpublishPlugin() {
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
            f -> f.withMarshaller(PublishPluginRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<PublishPluginDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishPluginDTO.class),
            f -> f.withMarshaller(PublishPluginRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PublishPluginResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<PublishPluginBindRequest, PublishPluginBindResponse> publishPluginBind =
        genForpublishPluginBind();

    private static HttpRequestDef<PublishPluginBindRequest, PublishPluginBindResponse> genForpublishPluginBind() {
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
            f -> f.withMarshaller(PublishPluginBindRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<PublishPluginDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishPluginDTO.class),
            f -> f.withMarshaller(PublishPluginBindRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PublishPluginBindResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<RejectManualReviewRequest, RejectManualReviewResponse> rejectManualReview =
        genForrejectManualReview();

    private static HttpRequestDef<RejectManualReviewRequest, RejectManualReviewResponse> genForrejectManualReview() {
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
            f -> f.withMarshaller(RejectManualReviewRequest::getJobRunId, (req, v) -> {
                req.setJobRunId(v);
            }));
        builder.<String>withRequestField("step_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getStepRunId, (req, v) -> {
                req.setStepRunId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectManualReviewRequest::getPipelineRunId, (req, v) -> {
                req.setPipelineRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemovePipelineRequest, RemovePipelineResponse> removePipeline =
        genForremovePipeline();

    private static HttpRequestDef<RemovePipelineRequest, RemovePipelineResponse> genForremovePipeline() {
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
            f -> f.withMarshaller(RemovePipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryPipelineRunRequest, RetryPipelineRunResponse> retryPipelineRun =
        genForretryPipelineRun();

    private static HttpRequestDef<RetryPipelineRunRequest, RetryPipelineRunResponse> genForretryPipelineRun() {
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
            f -> f.withMarshaller(RetryPipelineRunRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryPipelineRunRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryPipelineRunRequest::getPipelineRunId, (req, v) -> {
                req.setPipelineRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunPipelineRequest, RunPipelineResponse> runPipeline = genForrunPipeline();

    private static HttpRequestDef<RunPipelineRequest, RunPipelineResponse> genForrunPipeline() {
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
            f -> f.withMarshaller(RunPipelineRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunPipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<RunPipelineDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunPipelineDTO.class),
            f -> f.withMarshaller(RunPipelineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBasicPluginRequest, ShowBasicPluginResponse> showBasicPlugin =
        genForshowBasicPlugin();

    private static HttpRequestDef<ShowBasicPluginRequest, ShowBasicPluginResponse> genForshowBasicPlugin() {
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
            f -> f.withMarshaller(ShowBasicPluginRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBasicPluginRequest::getPluginName, (req, v) -> {
                req.setPluginName(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBasicPluginRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatus =
        genForshowInstanceStatus();

    private static HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> genForshowInstanceStatus() {
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
            f -> f.withMarshaller(ShowInstanceStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOpenSourceStrategyRequest, ShowOpenSourceStrategyResponse> showOpenSourceStrategy =
        genForshowOpenSourceStrategy();

    private static HttpRequestDef<ShowOpenSourceStrategyRequest, ShowOpenSourceStrategyResponse> genForshowOpenSourceStrategy() {
        // basic
        HttpRequestDef.Builder<ShowOpenSourceStrategyRequest, ShowOpenSourceStrategyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOpenSourceStrategyRequest.class, ShowOpenSourceStrategyResponse.class)
            .withName("ShowOpenSourceStrategy")
            .withUri("/v2/{domain_id}/tenant/open-source/rule-sets/{rule_set_id}/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpenSourceStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpenSourceStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse> showPipelineGroupTree =
        genForshowPipelineGroupTree();

    private static HttpRequestDef<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse> genForshowPipelineGroupTree() {
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
            f -> f.withMarshaller(ShowPipelineGroupTreeRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response
        builder.<List<PipelineGroupVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPipelineGroupTreeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PipelineGroupVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse> showPipelineRunDetail =
        genForshowPipelineRunDetail();

    private static HttpRequestDef<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse> genForshowPipelineRunDetail() {
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
            f -> f.withMarshaller(ShowPipelineRunDetailRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineRunDetailRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineRunDetailRequest::getPipelineRunId, (req, v) -> {
                req.setPipelineRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse> showPipelineTemplateDetail =
        genForshowPipelineTemplateDetail();

    private static HttpRequestDef<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse> genForshowPipelineTemplateDetail() {
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
            f -> f.withMarshaller(ShowPipelineTemplateDetailRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineTemplateDetailRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipleineStatusRequest, ShowPipleineStatusResponse> showPipleineStatus =
        genForshowPipleineStatus();

    private static HttpRequestDef<ShowPipleineStatusRequest, ShowPipleineStatusResponse> genForshowPipleineStatus() {
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
            f -> f.withMarshaller(ShowPipleineStatusRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<String>withRequestField("build_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipleineStatusRequest::getBuildId, (req, v) -> {
                req.setBuildId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginInputsRequest, ShowPluginInputsResponse> showPluginInputs =
        genForshowPluginInputs();

    private static HttpRequestDef<ShowPluginInputsRequest, ShowPluginInputsResponse> genForshowPluginInputs() {
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
            f -> f.withMarshaller(ShowPluginInputsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<List<PluginPartQueryDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginInputsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(PluginPartQueryDTO.class));

        // response
        builder.<List<PluginPartQueryVOListAgentPluginInputVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginInputsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PluginPartQueryVOListAgentPluginInputVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginMetricsRequest, ShowPluginMetricsResponse> showPluginMetrics =
        genForshowPluginMetrics();

    private static HttpRequestDef<ShowPluginMetricsRequest, ShowPluginMetricsResponse> genForshowPluginMetrics() {
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
            f -> f.withMarshaller(ShowPluginMetricsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<List<PluginPartQueryDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginMetricsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(PluginPartQueryDTO.class));

        // response
        builder.<List<PluginPartQueryVOListAgentPluginOutputVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginMetricsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PluginPartQueryVOListAgentPluginOutputVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginOutputsRequest, ShowPluginOutputsResponse> showPluginOutputs =
        genForshowPluginOutputs();

    private static HttpRequestDef<ShowPluginOutputsRequest, ShowPluginOutputsResponse> genForshowPluginOutputs() {
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
            f -> f.withMarshaller(ShowPluginOutputsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<List<PluginPartQueryDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginOutputsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(PluginPartQueryDTO.class));

        // response
        builder.<List<PluginPartQueryVOListAgentPluginOutputVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPluginOutputsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PluginPartQueryVOListAgentPluginOutputVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginVersionRequest, ShowPluginVersionResponse> showPluginVersion =
        genForshowPluginVersion();

    private static HttpRequestDef<ShowPluginVersionRequest, ShowPluginVersionResponse> genForshowPluginVersion() {
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
            f -> f.withMarshaller(ShowPluginVersionRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginVersionRequest::getPluginName, (req, v) -> {
                req.setPluginName(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectOpenSourceStrategyRequest, ShowProjectOpenSourceStrategyResponse> showProjectOpenSourceStrategy =
        genForshowProjectOpenSourceStrategy();

    private static HttpRequestDef<ShowProjectOpenSourceStrategyRequest, ShowProjectOpenSourceStrategyResponse> genForshowProjectOpenSourceStrategy() {
        // basic
        HttpRequestDef.Builder<ShowProjectOpenSourceStrategyRequest, ShowProjectOpenSourceStrategyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProjectOpenSourceStrategyRequest.class,
                    ShowProjectOpenSourceStrategyResponse.class)
                .withName("ShowProjectOpenSourceStrategy")
                .withUri("/v2/{project_id}/open-source/rule-sets/{rule_set_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectOpenSourceStrategyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectOpenSourceStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectStrategyRequest, ShowProjectStrategyResponse> showProjectStrategy =
        genForshowProjectStrategy();

    private static HttpRequestDef<ShowProjectStrategyRequest, ShowProjectStrategyResponse> genForshowProjectStrategy() {
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
            f -> f.withMarshaller(ShowProjectStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectStrategyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublisherRequest, ShowPublisherResponse> showPublisher =
        genForshowPublisher();

    private static HttpRequestDef<ShowPublisherRequest, ShowPublisherResponse> genForshowPublisher() {
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
            f -> f.withMarshaller(ShowPublisherRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPublisherRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response
        builder.<Map<String, PublisherVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ShowPublisherResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PublisherVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleRequest, ShowRuleResponse> showRule = genForshowRule();

    private static HttpRequestDef<ShowRuleRequest, ShowRuleResponse> genForshowRule() {
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
            f -> f.withMarshaller(ShowRuleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("cloud_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getCloudProjectId, (req, v) -> {
                req.setCloudProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStrategyRequest, ShowStrategyResponse> showStrategy = genForshowStrategy();

    private static HttpRequestDef<ShowStrategyRequest, ShowStrategyResponse> genForshowStrategy() {
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
            f -> f.withMarshaller(ShowStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("cloud_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStrategyRequest::getCloudProjectId, (req, v) -> {
                req.setCloudProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetail =
        genForshowTemplateDetail();

    private static HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> genForshowTemplateDetail() {
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
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateType, (req, v) -> {
                req.setTemplateType(v);
            }));
        builder.<String>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateDetailRequest::getSource, (req, v) -> {
                req.setSource(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNewPipelineRequest, StartNewPipelineResponse> startNewPipeline =
        genForstartNewPipeline();

    private static HttpRequestDef<StartNewPipelineRequest, StartNewPipelineResponse> genForstartNewPipeline() {
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
            f -> f.withMarshaller(StartNewPipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<StartPipelineParameters>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartPipelineParameters.class),
            f -> f.withMarshaller(StartNewPipelineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineNewRequest, StopPipelineNewResponse> stopPipelineNew =
        genForstopPipelineNew();

    private static HttpRequestDef<StopPipelineNewRequest, StopPipelineNewResponse> genForstopPipelineNew() {
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
            f -> f.withMarshaller(StopPipelineNewRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<String>withRequestField("build_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineNewRequest::getBuildId, (req, v) -> {
                req.setBuildId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineRunRequest, StopPipelineRunResponse> stopPipelineRun =
        genForstopPipelineRun();

    private static HttpRequestDef<StopPipelineRunRequest, StopPipelineRunResponse> genForstopPipelineRun() {
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
            f -> f.withMarshaller(StopPipelineRunRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineRunRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<String>withRequestField("pipeline_run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineRunRequest::getPipelineRunId, (req, v) -> {
                req.setPipelineRunId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchOpenSourceStrategyRequest, SwitchOpenSourceStrategyResponse> switchOpenSourceStrategy =
        genForswitchOpenSourceStrategy();

    private static HttpRequestDef<SwitchOpenSourceStrategyRequest, SwitchOpenSourceStrategyResponse> genForswitchOpenSourceStrategy() {
        // basic
        HttpRequestDef.Builder<SwitchOpenSourceStrategyRequest, SwitchOpenSourceStrategyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, SwitchOpenSourceStrategyRequest.class, SwitchOpenSourceStrategyResponse.class)
                .withName("SwitchOpenSourceStrategy")
                .withUri("/v2/{domain_id}/tenant/open-source/rule-sets/{rule_set_id}/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchOpenSourceStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchOpenSourceStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));
        builder.<UpdateRuleSetStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleSetStatusReq.class),
            f -> f.withMarshaller(SwitchOpenSourceStrategyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchStrategyRequest, SwitchStrategyResponse> switchStrategy =
        genForswitchStrategy();

    private static HttpRequestDef<SwitchStrategyRequest, SwitchStrategyResponse> genForswitchStrategy() {
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
            f -> f.withMarshaller(SwitchStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UpdateRuleSetStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleSetStatusReq.class),
            f -> f.withMarshaller(SwitchStrategyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBasicPluginRequest, UpdateBasicPluginResponse> updateBasicPlugin =
        genForupdateBasicPlugin();

    private static HttpRequestDef<UpdateBasicPluginRequest, UpdateBasicPluginResponse> genForupdateBasicPlugin() {
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
            f -> f.withMarshaller(UpdateBasicPluginRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<PluginBasicDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PluginBasicDTO.class),
            f -> f.withMarshaller(UpdateBasicPluginRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateBasicPluginResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOpenSourceStrategyRequest, UpdateOpenSourceStrategyResponse> updateOpenSourceStrategy =
        genForupdateOpenSourceStrategy();

    private static HttpRequestDef<UpdateOpenSourceStrategyRequest, UpdateOpenSourceStrategyResponse> genForupdateOpenSourceStrategy() {
        // basic
        HttpRequestDef.Builder<UpdateOpenSourceStrategyRequest, UpdateOpenSourceStrategyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateOpenSourceStrategyRequest.class, UpdateOpenSourceStrategyResponse.class)
                .withName("UpdateOpenSourceStrategy")
                .withUri("/v2/{domain_id}/tenant/open-source/rule-sets/{rule_set_id}/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOpenSourceStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("rule_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOpenSourceStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));
        builder.<OpenSourceRuleSetCreateVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenSourceRuleSetCreateVO.class),
            f -> f.withMarshaller(UpdateOpenSourceStrategyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse> updatePipelineGroup =
        genForupdatePipelineGroup();

    private static HttpRequestDef<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse> genForupdatePipelineGroup() {
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
            f -> f.withMarshaller(UpdatePipelineGroupRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<PipelineGroupUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PipelineGroupUpdateDTO.class),
            f -> f.withMarshaller(UpdatePipelineGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse> updatePipelineTemplate =
        genForupdatePipelineTemplate();

    private static HttpRequestDef<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse> genForupdatePipelineTemplate() {
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
            f -> f.withMarshaller(UpdatePipelineTemplateRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipelineTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<PipelineTemplateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PipelineTemplateDTO.class),
            f -> f.withMarshaller(UpdatePipelineTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> updateRule = genForupdateRule();

    private static HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> genForupdateRule() {
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
            f -> f.withMarshaller(UpdateRuleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<UpdateRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleReq.class),
            f -> f.withMarshaller(UpdateRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStrategyRequest, UpdateStrategyResponse> updateStrategy =
        genForupdateStrategy();

    private static HttpRequestDef<UpdateStrategyRequest, UpdateStrategyResponse> genForupdateStrategy() {
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
            f -> f.withMarshaller(UpdateStrategyRequest::getRuleSetId, (req, v) -> {
                req.setRuleSetId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStrategyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UpdateRuleSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleSetReq.class),
            f -> f.withMarshaller(UpdateStrategyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadBasicPluginRequest, UploadBasicPluginResponse> uploadBasicPlugin =
        genForuploadBasicPlugin();

    private static HttpRequestDef<UploadBasicPluginRequest, UploadBasicPluginResponse> genForuploadBasicPlugin() {
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
            f -> f.withMarshaller(UploadBasicPluginRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadBasicPluginRequest::getPluginName, (req, v) -> {
                req.setPluginName(v);
            }));
        builder.<String>withRequestField("business_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadBasicPluginRequest::getBusinessType, (req, v) -> {
                req.setBusinessType(v);
            }));
        builder.<UploadBasicPluginRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadBasicPluginRequestBody.class),
            f -> f.withMarshaller(UploadBasicPluginRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadBasicPluginResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UploadPluginIconRequest, UploadPluginIconResponse> uploadPluginIcon =
        genForuploadPluginIcon();

    private static HttpRequestDef<UploadPluginIconRequest, UploadPluginIconResponse> genForuploadPluginIcon() {
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
            f -> f.withMarshaller(UploadPluginIconRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPluginIconRequest::getPluginName, (req, v) -> {
                req.setPluginName(v);
            }));
        builder.<UploadPluginIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadPluginIconRequestBody.class),
            f -> f.withMarshaller(UploadPluginIconRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadPluginIconResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UploadPublisherIconRequest, UploadPublisherIconResponse> uploadPublisherIcon =
        genForuploadPublisherIcon();

    private static HttpRequestDef<UploadPublisherIconRequest, UploadPublisherIconResponse> genForuploadPublisherIcon() {
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
            f -> f.withMarshaller(UploadPublisherIconRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("publisher_en_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPublisherIconRequest::getPublisherEnName, (req, v) -> {
                req.setPublisherEnName(v);
            }));
        builder.<UploadPublisherIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadPublisherIconRequestBody.class),
            f -> f.withMarshaller(UploadPublisherIconRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadPublisherIconResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

}
