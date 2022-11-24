package com.huaweicloud.sdk.dwr.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dwr.v3.model.*;

@SuppressWarnings("unchecked")
public class DwrMeta {

    public static final HttpRequestDef<AcceptServiceContractRequest, AcceptServiceContractResponse> acceptServiceContract =
        genForacceptServiceContract();

    private static HttpRequestDef<AcceptServiceContractRequest, AcceptServiceContractResponse> genForacceptServiceContract() {
        // basic
        HttpRequestDef.Builder<AcceptServiceContractRequest, AcceptServiceContractResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AcceptServiceContractRequest.class, AcceptServiceContractResponse.class)
            .withName("AcceptServiceContract")
            .withUri("/v3/{project_id}/workflow-agreements")
            .withContentType("application/json");

        // requests
        builder.<AcceptServiceContractRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AcceptServiceContractRequest.TypeEnum.class),
            f -> f.withMarshaller(AcceptServiceContractRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AcceptServiceContractResponse::getXRequestId,
                AcceptServiceContractResponse::setXRequestId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AcceptServiceContractResponse::getContentLength,
                AcceptServiceContractResponse::setContentLength));
        return builder.build();
    }

    public static final HttpRequestDef<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse> asyncInvokeApiStartWorkflow =
        genForasyncInvokeApiStartWorkflow();

    private static HttpRequestDef<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse> genForasyncInvokeApiStartWorkflow() {
        // basic
        HttpRequestDef.Builder<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AsyncInvokeApiStartWorkflowRequest.class,
                    AsyncInvokeApiStartWorkflowResponse.class)
                .withName("AsyncInvokeApiStartWorkflow")
                .withUri("/v3/{project_id}/workflows/{graph_name}/execute")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AsyncInvokeApiStartWorkflowRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            }));
        builder.<ExecuteWorkflowBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteWorkflowBody.class),
            f -> f.withMarshaller(AsyncInvokeApiStartWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AsyncInvokeApiStartWorkflowResponse::getXRequestId,
                AsyncInvokeApiStartWorkflowResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AsyncInvokeApiStartWorkflowResponse::getConnection,
                AsyncInvokeApiStartWorkflowResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AsyncInvokeApiStartWorkflowResponse::getContentLength,
                AsyncInvokeApiStartWorkflowResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AsyncInvokeApiStartWorkflowResponse::getDate,
                AsyncInvokeApiStartWorkflowResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse> checkWorkflowAuthentication =
        genForcheckWorkflowAuthentication();

    private static HttpRequestDef<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse> genForcheckWorkflowAuthentication() {
        // basic
        HttpRequestDef.Builder<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CheckWorkflowAuthenticationRequest.class,
                    CheckWorkflowAuthenticationResponse.class)
                .withName("CheckWorkflowAuthentication")
                .withUri("/v3/{project_id}/workflow-authorization")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckWorkflowAuthenticationResponse::getXRequestId,
                CheckWorkflowAuthenticationResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckWorkflowAuthenticationResponse::getConnection,
                CheckWorkflowAuthenticationResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckWorkflowAuthenticationResponse::getContentLength,
                CheckWorkflowAuthenticationResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckWorkflowAuthenticationResponse::getDate,
                CheckWorkflowAuthenticationResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse> createMyActionTemplate =
        genForcreateMyActionTemplate();

    private static HttpRequestDef<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse> genForcreateMyActionTemplate() {
        // basic
        HttpRequestDef.Builder<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMyActionTemplateRequest.class, CreateMyActionTemplateResponse.class)
            .withName("CreateMyActionTemplate")
            .withUri("/v3/{project_id}/myactiontemplates/{template_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMyActionTemplateRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<ThirdTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThirdTemplateRequestBody.class),
            f -> f.withMarshaller(CreateMyActionTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMyActionTemplateResponse::getXRequestId,
                CreateMyActionTemplateResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMyActionTemplateResponse::getConnection,
                CreateMyActionTemplateResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMyActionTemplateResponse::getContentLength,
                CreateMyActionTemplateResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMyActionTemplateResponse::getDate, CreateMyActionTemplateResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse> createWorkflowAuthentication =
        genForcreateWorkflowAuthentication();

    private static HttpRequestDef<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse> genForcreateWorkflowAuthentication() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkflowAuthenticationRequest.class,
                    CreateWorkflowAuthenticationResponse.class)
                .withName("CreateWorkflowAuthentication")
                .withUri("/v3/{project_id}/workflow-authorization")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWorkflowAuthenticationResponse::getXRequestId,
                CreateWorkflowAuthenticationResponse::setXRequestId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWorkflowAuthenticationResponse::getContentLength,
                CreateWorkflowAuthenticationResponse::setContentLength));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse> deleteMyActionTemplate =
        genFordeleteMyActionTemplate();

    private static HttpRequestDef<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse> genFordeleteMyActionTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMyActionTemplateRequest.class, DeleteMyActionTemplateResponse.class)
            .withName("DeleteMyActionTemplate")
            .withUri("/v3/{project_id}/myactiontemplates/{template_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMyActionTemplateRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteMyActionTemplateResponse::getXRequestId,
                DeleteMyActionTemplateResponse::setXRequestId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteMyActionTemplateResponse::getContentLength,
                DeleteMyActionTemplateResponse::setContentLength));
        return builder.build();
    }

    public static final HttpRequestDef<ListMyActionTemplateRequest, ListMyActionTemplateResponse> listMyActionTemplate =
        genForlistMyActionTemplate();

    private static HttpRequestDef<ListMyActionTemplateRequest, ListMyActionTemplateResponse> genForlistMyActionTemplate() {
        // basic
        HttpRequestDef.Builder<ListMyActionTemplateRequest, ListMyActionTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMyActionTemplateRequest.class, ListMyActionTemplateResponse.class)
            .withName("ListMyActionTemplate")
            .withUri("/v3/{project_id}/myactiontemplates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMyActionTemplateRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            }));
        builder.<ListMyActionTemplateRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMyActionTemplateRequest.StatusEnum.class),
            f -> f.withMarshaller(ListMyActionTemplateRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListMyActionTemplateRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMyActionTemplateRequest.CategoryEnum.class),
            f -> f.withMarshaller(ListMyActionTemplateRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMyActionTemplateRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMyActionTemplateRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMyActionTemplateResponse::getXRequestId,
                ListMyActionTemplateResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMyActionTemplateResponse::getConnection,
                ListMyActionTemplateResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMyActionTemplateResponse::getContentLength,
                ListMyActionTemplateResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMyActionTemplateResponse::getDate, ListMyActionTemplateResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ListSystemTemplatesRequest, ListSystemTemplatesResponse> listSystemTemplates =
        genForlistSystemTemplates();

    private static HttpRequestDef<ListSystemTemplatesRequest, ListSystemTemplatesResponse> genForlistSystemTemplates() {
        // basic
        HttpRequestDef.Builder<ListSystemTemplatesRequest, ListSystemTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSystemTemplatesRequest.class, ListSystemTemplatesResponse.class)
                .withName("ListSystemTemplates")
                .withUri("/v3/{project_id}/actiontemplates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemTemplatesRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemTemplatesRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSystemTemplatesResponse::getXRequestId,
                ListSystemTemplatesResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSystemTemplatesResponse::getConnection,
                ListSystemTemplatesResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSystemTemplatesResponse::getContentLength,
                ListSystemTemplatesResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSystemTemplatesResponse::getDate, ListSystemTemplatesResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse> listWorkflowInstance =
        genForlistWorkflowInstance();

    private static HttpRequestDef<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse> genForlistWorkflowInstance() {
        // basic
        HttpRequestDef.Builder<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkflowInstanceRequest.class, ListWorkflowInstanceResponse.class)
            .withName("ListWorkflowInstance")
            .withUri("/v3/{project_id}/workflowexecutions")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowInstanceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("graph_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowInstanceRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowInstanceRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowInstanceRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ListWorkflowInstanceRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowInstanceRequest.StatusEnum.class),
            f -> f.withMarshaller(ListWorkflowInstanceRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowInstanceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowInstanceResponse::getXRequestId,
                ListWorkflowInstanceResponse::setXRequestId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowInstanceResponse::getContentLength,
                ListWorkflowInstanceResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowInstanceResponse::getDate, ListWorkflowInstanceResponse::setDate));
        builder.<String>withResponseField("Content-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowInstanceResponse::getContentType,
                ListWorkflowInstanceResponse::setContentType));
        return builder.build();
    }

    public static final HttpRequestDef<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse> restoreWorkflowExecution =
        genForrestoreWorkflowExecution();

    private static HttpRequestDef<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse> genForrestoreWorkflowExecution() {
        // basic
        HttpRequestDef.Builder<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RestoreWorkflowExecutionRequest.class, RestoreWorkflowExecutionResponse.class)
                .withName("RestoreWorkflowExecution")
                .withUri("/v3/{project_id}/workflows/{graph_name}/workflowexecution/{execution_name}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execution_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreWorkflowExecutionRequest::getExecutionName, (req, v) -> {
                req.setExecutionName(v);
            }));
        builder.<String>withRequestField("graph_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreWorkflowExecutionRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreWorkflowExecutionResponse::getXRequestId,
                RestoreWorkflowExecutionResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreWorkflowExecutionResponse::getConnection,
                RestoreWorkflowExecutionResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreWorkflowExecutionResponse::getContentLength,
                RestoreWorkflowExecutionResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreWorkflowExecutionResponse::getDate,
                RestoreWorkflowExecutionResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicActionListRequest, ShowPublicActionListResponse> showPublicActionList =
        genForshowPublicActionList();

    private static HttpRequestDef<ShowPublicActionListRequest, ShowPublicActionListResponse> genForshowPublicActionList() {
        // basic
        HttpRequestDef.Builder<ShowPublicActionListRequest, ShowPublicActionListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPublicActionListRequest.class, ShowPublicActionListResponse.class)
            .withName("ShowPublicActionList")
            .withUri("/v3/{project_id}/publicactiontemplates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicActionListRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicActionListRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPublicActionListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicActionListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicActionListResponse::getXRequestId,
                ShowPublicActionListResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicActionListResponse::getConnection,
                ShowPublicActionListResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicActionListResponse::getContentLength,
                ShowPublicActionListResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicActionListResponse::getDate, ShowPublicActionListResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse> showPublicTemplateInfo =
        genForshowPublicTemplateInfo();

    private static HttpRequestDef<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse> genForshowPublicTemplateInfo() {
        // basic
        HttpRequestDef.Builder<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPublicTemplateInfoRequest.class, ShowPublicTemplateInfoResponse.class)
            .withName("ShowPublicTemplateInfo")
            .withUri("/v3/{project_id}/publicactiontemplate/{template_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicTemplateInfoRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicTemplateInfoResponse::getXRequestId,
                ShowPublicTemplateInfoResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicTemplateInfoResponse::getConnection,
                ShowPublicTemplateInfoResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicTemplateInfoResponse::getContentLength,
                ShowPublicTemplateInfoResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicTemplateInfoResponse::getDate, ShowPublicTemplateInfoResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowServiceContractRequest, ShowServiceContractResponse> showServiceContract =
        genForshowServiceContract();

    private static HttpRequestDef<ShowServiceContractRequest, ShowServiceContractResponse> genForshowServiceContract() {
        // basic
        HttpRequestDef.Builder<ShowServiceContractRequest, ShowServiceContractResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServiceContractRequest.class, ShowServiceContractResponse.class)
                .withName("ShowServiceContract")
                .withUri("/v3/{project_id}/workflow-agreements")
                .withContentType("application/json");

        // requests
        builder.<ShowServiceContractRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowServiceContractRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowServiceContractRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowServiceContractResponse::getXRequestId,
                ShowServiceContractResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowServiceContractResponse::getConnection,
                ShowServiceContractResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowServiceContractResponse::getContentLength,
                ShowServiceContractResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowServiceContractResponse::getDate, ShowServiceContractResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse> showSystemTemplateDetail =
        genForshowSystemTemplateDetail();

    private static HttpRequestDef<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse> genForshowSystemTemplateDetail() {
        // basic
        HttpRequestDef.Builder<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowSystemTemplateDetailRequest.class, ShowSystemTemplateDetailResponse.class)
                .withName("ShowSystemTemplateDetail")
                .withUri("/v3/{project_id}/actiontemplate/{template_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSystemTemplateDetailRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSystemTemplateDetailResponse::getXRequestId,
                ShowSystemTemplateDetailResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSystemTemplateDetailResponse::getConnection,
                ShowSystemTemplateDetailResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSystemTemplateDetailResponse::getContentLength,
                ShowSystemTemplateDetailResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSystemTemplateDetailResponse::getDate,
                ShowSystemTemplateDetailResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse> showThirdTemplateInfo =
        genForshowThirdTemplateInfo();

    private static HttpRequestDef<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse> genForshowThirdTemplateInfo() {
        // basic
        HttpRequestDef.Builder<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowThirdTemplateInfoRequest.class, ShowThirdTemplateInfoResponse.class)
            .withName("ShowThirdTemplateInfo")
            .withUri("/v3/{project_id}/myactiontemplate/{template_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThirdTemplateInfoRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowThirdTemplateInfoResponse::getXRequestId,
                ShowThirdTemplateInfoResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowThirdTemplateInfoResponse::getConnection,
                ShowThirdTemplateInfoResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowThirdTemplateInfoResponse::getContentLength,
                ShowThirdTemplateInfoResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowThirdTemplateInfoResponse::getDate, ShowThirdTemplateInfoResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse> showWorkflowInstance =
        genForshowWorkflowInstance();

    private static HttpRequestDef<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse> genForshowWorkflowInstance() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkflowInstanceRequest.class, ShowWorkflowInstanceResponse.class)
            .withName("ShowWorkflowInstance")
            .withUri("/v3/{project_id}/workflows/{graph_name}/workflowexecution/{execution_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execution_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowInstanceRequest::getExecutionName, (req, v) -> {
                req.setExecutionName(v);
            }));
        builder.<String>withRequestField("graph_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowInstanceRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWorkflowInstanceResponse::getXRequestId,
                ShowWorkflowInstanceResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWorkflowInstanceResponse::getConnection,
                ShowWorkflowInstanceResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWorkflowInstanceResponse::getContentLength,
                ShowWorkflowInstanceResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWorkflowInstanceResponse::getDate, ShowWorkflowInstanceResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse> updateMyActionTemplate =
        genForupdateMyActionTemplate();

    private static HttpRequestDef<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse> genForupdateMyActionTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMyActionTemplateRequest.class, UpdateMyActionTemplateResponse.class)
            .withName("UpdateMyActionTemplate")
            .withUri("/v3/{project_id}/myactiontemplates/{template_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMyActionTemplateRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<ThirdTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThirdTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateMyActionTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMyActionTemplateResponse::getXRequestId,
                UpdateMyActionTemplateResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMyActionTemplateResponse::getConnection,
                UpdateMyActionTemplateResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMyActionTemplateResponse::getContentLength,
                UpdateMyActionTemplateResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMyActionTemplateResponse::getDate, UpdateMyActionTemplateResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse> updateMyActionTemplateToDeprecated =
        genForupdateMyActionTemplateToDeprecated();

    private static HttpRequestDef<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse> genForupdateMyActionTemplateToDeprecated() {
        // basic
        HttpRequestDef.Builder<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateMyActionTemplateToDeprecatedRequest.class,
                    UpdateMyActionTemplateToDeprecatedResponse.class)
                .withName("UpdateMyActionTemplateToDeprecated")
                .withUri("/v3/{project_id}/myactiontemplates/{template_name}/forbid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMyActionTemplateToDeprecatedRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMyActionTemplateToDeprecatedResponse::getXRequestId,
                UpdateMyActionTemplateToDeprecatedResponse::setXRequestId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMyActionTemplateToDeprecatedResponse::getContentLength,
                UpdateMyActionTemplateToDeprecatedResponse::setContentLength));
        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflow =
        genForcreateWorkflow();

    private static HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> genForcreateWorkflow() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowRequest, CreateWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkflowRequest.class, CreateWorkflowResponse.class)
                .withName("CreateWorkflow")
                .withUri("/v3/{project_id}/workflows/{graph_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            }));
        builder.<CreateWorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkflowRequestBody.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWorkflowResponse::getXRequestId, CreateWorkflowResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWorkflowResponse::getConnection, CreateWorkflowResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWorkflowResponse::getContentLength, CreateWorkflowResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWorkflowResponse::getDate, CreateWorkflowResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflow =
        genFordeleteWorkflow();

    private static HttpRequestDef<DeleteWorkflowRequest, DeleteWorkflowResponse> genFordeleteWorkflow() {
        // basic
        HttpRequestDef.Builder<DeleteWorkflowRequest, DeleteWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkflowRequest.class, DeleteWorkflowResponse.class)
                .withName("DeleteWorkflow")
                .withUri("/v3/{project_id}/workflows/{graph_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteWorkflowResponse::getXRequestId, DeleteWorkflowResponse::setXRequestId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteWorkflowResponse::getContentLength, DeleteWorkflowResponse::setContentLength));
        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflows =
        genForlistWorkflows();

    private static HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> genForlistWorkflows() {
        // basic
        HttpRequestDef.Builder<ListWorkflowsRequest, ListWorkflowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowsRequest.class, ListWorkflowsResponse.class)
                .withName("ListWorkflows")
                .withUri("/v3/{project_id}/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowsResponse::getXRequestId, ListWorkflowsResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowsResponse::getConnection, ListWorkflowsResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowsResponse::getContentLength, ListWorkflowsResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowsResponse::getDate, ListWorkflowsResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse> showWorkflowInfo =
        genForshowWorkflowInfo();

    private static HttpRequestDef<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse> genForshowWorkflowInfo() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkflowInfoRequest.class, ShowWorkflowInfoResponse.class)
                .withName("ShowWorkflowInfo")
                .withUri("/v3/{project_id}/workflows/{graph_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowInfoRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWorkflowInfoResponse::getXRequestId, ShowWorkflowInfoResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWorkflowInfoResponse::getConnection, ShowWorkflowInfoResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWorkflowInfoResponse::getContentLength,
                ShowWorkflowInfoResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWorkflowInfoResponse::getDate, ShowWorkflowInfoResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflow =
        genForupdateWorkflow();

    private static HttpRequestDef<UpdateWorkflowRequest, UpdateWorkflowResponse> genForupdateWorkflow() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowRequest, UpdateWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkflowRequest.class, UpdateWorkflowResponse.class)
                .withName("UpdateWorkflow")
                .withUri("/v3/{project_id}/workflows/{graph_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            }));
        builder.<UpdateWorkflowBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkflowBody.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWorkflowResponse::getXRequestId, UpdateWorkflowResponse::setXRequestId));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWorkflowResponse::getConnection, UpdateWorkflowResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWorkflowResponse::getContentLength, UpdateWorkflowResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWorkflowResponse::getDate, UpdateWorkflowResponse::setDate));
        return builder.build();
    }

}
