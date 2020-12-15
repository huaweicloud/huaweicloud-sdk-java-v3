package com.huaweicloud.sdk.cloudpipeline.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cloudpipeline.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CloudPipelineMeta {

    public static final HttpRequestDef<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> batchShowPipelinesStatus = genForbatchShowPipelinesStatus();

    private static HttpRequestDef<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> genForbatchShowPipelinesStatus() {
        // basic
        HttpRequestDef.Builder<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowPipelinesStatusRequest.class, BatchShowPipelinesStatusResponse.class)
                .withUri("/v3/pipelines/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pipeline_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchShowPipelinesStatusRequest::getPipelineIds, (req, v) -> {
                req.setPipelineIds(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchShowPipelinesStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(BatchShowPipelinesStatusResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(PipelineExecuteStates.class)
        );

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> createPipelineByTemplate = genForcreatePipelineByTemplate();

    private static HttpRequestDef<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> genForcreatePipelineByTemplate() {
        // basic
        HttpRequestDef.Builder<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePipelineByTemplateRequest.class, CreatePipelineByTemplateResponse.class)
                .withUri("/v3/templates/task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePipelineByTemplateRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TemplateCddl.class,
            f -> f.withMarshaller(CreatePipelineByTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> listPipleineBuildResult = genForlistPipleineBuildResult();

    private static HttpRequestDef<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> genForlistPipleineBuildResult() {
        // basic
        HttpRequestDef.Builder<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPipleineBuildResultRequest.class, ListPipleineBuildResultResponse.class)
                .withUri("/v3/pipelines/build-result")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPipleineBuildResultRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates = genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withUri("/v3/templates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getTemplateType, (req, v) -> {
                req.setTemplateType(v);
            })
        );
        builder.withRequestField("is_build_in",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getIsBuildIn, (req, v) -> {
                req.setIsBuildIn(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getSort, (req, v) -> {
                req.setSort(v);
            })
        );
        builder.withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getAsc, (req, v) -> {
                req.setAsc(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterAgentRequest, RegisterAgentResponse> registerAgent = genForregisterAgent();

    private static HttpRequestDef<RegisterAgentRequest, RegisterAgentResponse> genForregisterAgent() {
        // basic
        HttpRequestDef.Builder<RegisterAgentRequest, RegisterAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterAgentRequest.class, RegisterAgentResponse.class)
                .withUri("/agentregister/v1/agent/register")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SlaveRegister.class,
            f -> f.withMarshaller(RegisterAgentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemovePipelineRequest, RemovePipelineResponse> removePipeline = genForremovePipeline();

    private static HttpRequestDef<RemovePipelineRequest, RemovePipelineResponse> genForremovePipeline() {
        // basic
        HttpRequestDef.Builder<RemovePipelineRequest, RemovePipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemovePipelineRequest.class, RemovePipelineResponse.class)
                .withUri("/v3/pipelines/{pipeline_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemovePipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RemovePipelineRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentStatusRequest, ShowAgentStatusResponse> showAgentStatus = genForshowAgentStatus();

    private static HttpRequestDef<ShowAgentStatusRequest, ShowAgentStatusResponse> genForshowAgentStatus() {
        // basic
        HttpRequestDef.Builder<ShowAgentStatusRequest, ShowAgentStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgentStatusRequest.class, ShowAgentStatusResponse.class)
                .withUri("/v1/agents/{agent_id}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAgentStatusRequest::getAgentId, (req, v) -> {
                req.setAgentId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAgentStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatus = genForshowInstanceStatus();

    private static HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> genForshowInstanceStatus() {
        // basic
        HttpRequestDef.Builder<ShowInstanceStatusRequest, ShowInstanceStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceStatusRequest.class, ShowInstanceStatusResponse.class)
                .withUri("/v3/templates/{task_id}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowInstanceStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipleineStatusRequest, ShowPipleineStatusResponse> showPipleineStatus = genForshowPipleineStatus();

    private static HttpRequestDef<ShowPipleineStatusRequest, ShowPipleineStatusResponse> genForshowPipleineStatus() {
        // basic
        HttpRequestDef.Builder<ShowPipleineStatusRequest, ShowPipleineStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPipleineStatusRequest.class, ShowPipleineStatusResponse.class)
                .withUri("/v3/pipelines/{pipeline_id}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPipleineStatusRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            })
        );
        builder.withRequestField("build_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPipleineStatusRequest::getBuildId, (req, v) -> {
                req.setBuildId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPipleineStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetail = genForshowTemplateDetail();

    private static HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> genForshowTemplateDetail() {
        // basic
        HttpRequestDef.Builder<ShowTemplateDetailRequest, ShowTemplateDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateDetailRequest.class, ShowTemplateDetailResponse.class)
                .withUri("/v3/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateType, (req, v) -> {
                req.setTemplateType(v);
            })
        );
        builder.withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTemplateDetailRequest::getSource, (req, v) -> {
                req.setSource(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTemplateDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNewPipelineRequest, StartNewPipelineResponse> startNewPipeline = genForstartNewPipeline();

    private static HttpRequestDef<StartNewPipelineRequest, StartNewPipelineResponse> genForstartNewPipeline() {
        // basic
        HttpRequestDef.Builder<StartNewPipelineRequest, StartNewPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartNewPipelineRequest.class, StartNewPipelineResponse.class)
                .withUri("/v3/pipelines/{pipeline_id}/start")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartNewPipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartNewPipelineRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StartPipelineParameters.class,
            f -> f.withMarshaller(StartNewPipelineRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPipelineRequest, StartPipelineResponse> startPipeline = genForstartPipeline();

    private static HttpRequestDef<StartPipelineRequest, StartPipelineResponse> genForstartPipeline() {
        // basic
        HttpRequestDef.Builder<StartPipelineRequest, StartPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartPipelineRequest.class, StartPipelineResponse.class)
                .withUri("/v3/pipelines/start")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pipeline_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartPipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartPipelineRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StartPipelineParameters.class,
            f -> f.withMarshaller(StartPipelineRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineRequest, StopPipelineResponse> stopPipeline = genForstopPipeline();

    private static HttpRequestDef<StopPipelineRequest, StopPipelineResponse> genForstopPipeline() {
        // basic
        HttpRequestDef.Builder<StopPipelineRequest, StopPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopPipelineRequest.class, StopPipelineResponse.class)
                .withUri("/v3/pipelines/stop")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pipeline_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopPipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            })
        );
        builder.withRequestField("build_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopPipelineRequest::getBuildId, (req, v) -> {
                req.setBuildId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopPipelineRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

}
