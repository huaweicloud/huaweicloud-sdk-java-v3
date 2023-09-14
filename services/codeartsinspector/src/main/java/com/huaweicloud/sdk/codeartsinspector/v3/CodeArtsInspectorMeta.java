package com.huaweicloud.sdk.codeartsinspector.v3;

import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CancelTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CancelTasksRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CancelTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateDomainsRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateTasksRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DownloadTaskReportRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DownloadTaskReportResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListBusinessRisksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListBusinessRisksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListPortResultsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListPortResultsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListTaskHistoriesRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListTaskHistoriesResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowDomainSettingsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowDomainSettingsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowReportStatusRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowReportStatusResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowResultsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowResultsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateDomainSettingsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateDomainSettingsRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateDomainSettingsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateFalsePositiveRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateFalsePositiveRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateFalsePositiveResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeArtsInspectorMeta {

    public static final HttpRequestDef<DownloadTaskReportRequest, DownloadTaskReportResponse> downloadTaskReport =
        genFordownloadTaskReport();

    private static HttpRequestDef<DownloadTaskReportRequest, DownloadTaskReportResponse> genFordownloadTaskReport() {
        // basic
        HttpRequestDef.Builder<DownloadTaskReportRequest, DownloadTaskReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadTaskReportRequest.class, DownloadTaskReportResponse.class)
                .withName("DownloadTaskReport")
                .withUri("/v3/{project_id}/webscan/report")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskReportRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse> executeGenerateReport =
        genForexecuteGenerateReport();

    private static HttpRequestDef<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse> genForexecuteGenerateReport() {
        // basic
        HttpRequestDef.Builder<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteGenerateReportRequest.class, ExecuteGenerateReportResponse.class)
            .withName("ExecuteGenerateReport")
            .withUri("/v3/{project_id}/webscan/report")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ExecuteGenerateReportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteGenerateReportRequestBody.class),
            f -> f.withMarshaller(ExecuteGenerateReportRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBusinessRisksRequest, ListBusinessRisksResponse> listBusinessRisks =
        genForlistBusinessRisks();

    private static HttpRequestDef<ListBusinessRisksRequest, ListBusinessRisksResponse> genForlistBusinessRisks() {
        // basic
        HttpRequestDef.Builder<ListBusinessRisksRequest, ListBusinessRisksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBusinessRisksRequest.class, ListBusinessRisksResponse.class)
                .withName("ListBusinessRisks")
                .withUri("/v3/{project_id}/webscan/results/business-risk")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBusinessRisksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBusinessRisksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBusinessRisksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortResultsRequest, ListPortResultsResponse> listPortResults =
        genForlistPortResults();

    private static HttpRequestDef<ListPortResultsRequest, ListPortResultsResponse> genForlistPortResults() {
        // basic
        HttpRequestDef.Builder<ListPortResultsRequest, ListPortResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortResultsRequest.class, ListPortResultsResponse.class)
                .withName("ListPortResults")
                .withUri("/v3/{project_id}/webscan/results/ports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortResultsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortResultsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortResultsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportStatusRequest, ShowReportStatusResponse> showReportStatus =
        genForshowReportStatus();

    private static HttpRequestDef<ShowReportStatusRequest, ShowReportStatusResponse> genForshowReportStatus() {
        // basic
        HttpRequestDef.Builder<ShowReportStatusRequest, ShowReportStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReportStatusRequest.class, ShowReportStatusResponse.class)
                .withName("ShowReportStatus")
                .withUri("/v3/{project_id}/webscan/report/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResultsRequest, ShowResultsResponse> showResults = genForshowResults();

    private static HttpRequestDef<ShowResultsRequest, ShowResultsResponse> genForshowResults() {
        // basic
        HttpRequestDef.Builder<ShowResultsRequest, ShowResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResultsRequest.class, ShowResultsResponse.class)
                .withName("ShowResults")
                .withUri("/v3/{project_id}/webscan/results")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResultsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResultsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResultsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> updateFalsePositive =
        genForupdateFalsePositive();

    private static HttpRequestDef<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> genForupdateFalsePositive() {
        // basic
        HttpRequestDef.Builder<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFalsePositiveRequest.class, UpdateFalsePositiveResponse.class)
                .withName("UpdateFalsePositive")
                .withUri("/v3/{project_id}/webscan/vulnerability/false-positive")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<UpdateFalsePositiveRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFalsePositiveRequestBody.class),
            f -> f.withMarshaller(UpdateFalsePositiveRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelTasksRequest, CancelTasksResponse> cancelTasks = genForcancelTasks();

    private static HttpRequestDef<CancelTasksRequest, CancelTasksResponse> genForcancelTasks() {
        // basic
        HttpRequestDef.Builder<CancelTasksRequest, CancelTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CancelTasksRequest.class, CancelTasksResponse.class)
                .withName("CancelTasks")
                .withUri("/v3/{project_id}/webscan/tasks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<CancelTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelTasksRequestBody.class),
            f -> f.withMarshaller(CancelTasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTasksRequest, CreateTasksResponse> createTasks = genForcreateTasks();

    private static HttpRequestDef<CreateTasksRequest, CreateTasksResponse> genForcreateTasks() {
        // basic
        HttpRequestDef.Builder<CreateTasksRequest, CreateTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTasksRequest.class, CreateTasksResponse.class)
                .withName("CreateTasks")
                .withUri("/v3/{project_id}/webscan/tasks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<Boolean>withRequestField("upgrade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CreateTasksRequest::getUpgrade, (req, v) -> {
                req.setUpgrade(v);
            }));
        builder.<CreateTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTasksRequestBody.class),
            f -> f.withMarshaller(CreateTasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskHistoriesRequest, ListTaskHistoriesResponse> listTaskHistories =
        genForlistTaskHistories();

    private static HttpRequestDef<ListTaskHistoriesRequest, ListTaskHistoriesResponse> genForlistTaskHistories() {
        // basic
        HttpRequestDef.Builder<ListTaskHistoriesRequest, ListTaskHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTaskHistoriesRequest.class, ListTaskHistoriesResponse.class)
                .withName("ListTaskHistories")
                .withUri("/v3/{project_id}/webscan/tasks/histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskHistoriesRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTasksRequest, ShowTasksResponse> showTasks = genForshowTasks();

    private static HttpRequestDef<ShowTasksRequest, ShowTasksResponse> genForshowTasks() {
        // basic
        HttpRequestDef.Builder<ShowTasksRequest, ShowTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTasksRequest.class, ShowTasksResponse.class)
                .withName("ShowTasks")
                .withUri("/v3/{project_id}/webscan/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizeDomainsRequest, AuthorizeDomainsResponse> authorizeDomains =
        genForauthorizeDomains();

    private static HttpRequestDef<AuthorizeDomainsRequest, AuthorizeDomainsResponse> genForauthorizeDomains() {
        // basic
        HttpRequestDef.Builder<AuthorizeDomainsRequest, AuthorizeDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AuthorizeDomainsRequest.class, AuthorizeDomainsResponse.class)
                .withName("AuthorizeDomains")
                .withUri("/v3/{project_id}/webscan/domains/authenticate")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<AuthorizeDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeDomainsRequestBody.class),
            f -> f.withMarshaller(AuthorizeDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainsRequest, CreateDomainsResponse> createDomains =
        genForcreateDomains();

    private static HttpRequestDef<CreateDomainsRequest, CreateDomainsResponse> genForcreateDomains() {
        // basic
        HttpRequestDef.Builder<CreateDomainsRequest, CreateDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainsRequest.class, CreateDomainsResponse.class)
                .withName("CreateDomains")
                .withUri("/v3/{project_id}/webscan/domains")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<CreateDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDomainsRequestBody.class),
            f -> f.withMarshaller(CreateDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomains =
        genFordeleteDomains();

    private static HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> genFordeleteDomains() {
        // basic
        HttpRequestDef.Builder<DeleteDomainsRequest, DeleteDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainsRequest.class, DeleteDomainsResponse.class)
                .withName("DeleteDomains")
                .withUri("/v3/{project_id}/webscan/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForlistDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForlistDomains() {
        // basic
        HttpRequestDef.Builder<ListDomainsRequest, ListDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainsRequest.class, ListDomainsResponse.class)
                .withName("ListDomains")
                .withUri("/v3/{project_id}/webscan/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<ListDomainsRequest.AuthStatusEnum>withRequestField("auth_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.AuthStatusEnum.class),
            f -> f.withMarshaller(ListDomainsRequest::getAuthStatus, (req, v) -> {
                req.setAuthStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainSettingsRequest, ShowDomainSettingsResponse> showDomainSettings =
        genForshowDomainSettings();

    private static HttpRequestDef<ShowDomainSettingsRequest, ShowDomainSettingsResponse> genForshowDomainSettings() {
        // basic
        HttpRequestDef.Builder<ShowDomainSettingsRequest, ShowDomainSettingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainSettingsRequest.class, ShowDomainSettingsResponse.class)
                .withName("ShowDomainSettings")
                .withUri("/v3/{project_id}/webscan/domains/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainSettingsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> updateDomainSettings =
        genForupdateDomainSettings();

    private static HttpRequestDef<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> genForupdateDomainSettings() {
        // basic
        HttpRequestDef.Builder<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateDomainSettingsRequest.class, UpdateDomainSettingsResponse.class)
            .withName("UpdateDomainSettings")
            .withUri("/v3/{project_id}/webscan/domains/settings")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<UpdateDomainSettingsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainSettingsRequestBody.class),
            f -> f.withMarshaller(UpdateDomainSettingsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
