package com.huaweicloud.sdk.cloudpipeline.v2;

import com.huaweicloud.sdk.cloudpipeline.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CloudPipelineMeta {

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

}
