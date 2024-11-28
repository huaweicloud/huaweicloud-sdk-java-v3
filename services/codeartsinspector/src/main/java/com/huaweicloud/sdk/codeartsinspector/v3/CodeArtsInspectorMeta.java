package com.huaweicloud.sdk.codeartsinspector.v3;

import com.huaweicloud.sdk.codeartsinspector.v3.model.AddGroupRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AddGroupRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AddGroupResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchCreateHostsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchCreateHostsRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchCreateHostsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchStartHostTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchStartHostTasksRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchStartHostTasksResponse;
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
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteGroupRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteGroupResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteHostRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteHostResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DownloadTaskReportRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DownloadTaskReportResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListBusinessRisksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListBusinessRisksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListGroupsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListGroupsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListHostResultsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListHostResultsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListHostsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListHostsResponse;
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
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowSubscriptionRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowSubscriptionResponse;
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

    public static final HttpRequestDef<AddGroupRequest, AddGroupResponse> addGroup = genForAddGroup();

    private static HttpRequestDef<AddGroupRequest, AddGroupResponse> genForAddGroup() {
        // basic
        HttpRequestDef.Builder<AddGroupRequest, AddGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddGroupRequest.class, AddGroupResponse.class)
                .withName("AddGroup")
                .withUri("/v3/{project_id}/hostscan/groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AddGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddGroupRequestBody.class),
            f -> f.withMarshaller(AddGroupRequest::getBody, AddGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> deleteGroup = genForDeleteGroup();

    private static HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> genForDeleteGroup() {
        // basic
        HttpRequestDef.Builder<DeleteGroupRequest, DeleteGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGroupRequest.class, DeleteGroupResponse.class)
                .withName("DeleteGroup")
                .withUri("/v3/{project_id}/hostscan/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getGroupId, DeleteGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsRequest, ListGroupsResponse> listGroups = genForListGroups();

    private static HttpRequestDef<ListGroupsRequest, ListGroupsResponse> genForListGroups() {
        // basic
        HttpRequestDef.Builder<ListGroupsRequest, ListGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupsRequest.class, ListGroupsResponse.class)
                .withName("ListGroups")
                .withUri("/v3/{project_id}/hostscan/groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getOffset, ListGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getLimit, ListGroupsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostResultsRequest, ListHostResultsResponse> listHostResults =
        genForListHostResults();

    private static HttpRequestDef<ListHostResultsRequest, ListHostResultsResponse> genForListHostResults() {
        // basic
        HttpRequestDef.Builder<ListHostResultsRequest, ListHostResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostResultsRequest.class, ListHostResultsResponse.class)
                .withName("ListHostResults")
                .withUri("/v3/{project_id}/hostscan/hosts/{host_id}/sys-vulns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostResultsRequest::getHostId, ListHostResultsRequest::setHostId));
        builder.<String>withRequestField("scan_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostResultsRequest::getScanId, ListHostResultsRequest::setScanId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostResultsRequest::getOffset, ListHostResultsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostResultsRequest::getLimit, ListHostResultsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartHostTasksRequest, BatchStartHostTasksResponse> batchStartHostTasks =
        genForBatchStartHostTasks();

    private static HttpRequestDef<BatchStartHostTasksRequest, BatchStartHostTasksResponse> genForBatchStartHostTasks() {
        // basic
        HttpRequestDef.Builder<BatchStartHostTasksRequest, BatchStartHostTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStartHostTasksRequest.class, BatchStartHostTasksResponse.class)
                .withName("BatchStartHostTasks")
                .withUri("/v3/{project_id}/hostscan/hosts/scan")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<BatchStartHostTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartHostTasksRequestBody.class),
            f -> f.withMarshaller(BatchStartHostTasksRequest::getBody, BatchStartHostTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateHostsRequest, BatchCreateHostsResponse> batchCreateHosts =
        genForBatchCreateHosts();

    private static HttpRequestDef<BatchCreateHostsRequest, BatchCreateHostsResponse> genForBatchCreateHosts() {
        // basic
        HttpRequestDef.Builder<BatchCreateHostsRequest, BatchCreateHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateHostsRequest.class, BatchCreateHostsResponse.class)
                .withName("BatchCreateHosts")
                .withUri("/v3/{project_id}/hostscan/hosts")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<BatchCreateHostsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateHostsRequestBody.class),
            f -> f.withMarshaller(BatchCreateHostsRequest::getBody, BatchCreateHostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostRequest, DeleteHostResponse> deleteHost = genForDeleteHost();

    private static HttpRequestDef<DeleteHostRequest, DeleteHostResponse> genForDeleteHost() {
        // basic
        HttpRequestDef.Builder<DeleteHostRequest, DeleteHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostRequest.class, DeleteHostResponse.class)
                .withName("DeleteHost")
                .withUri("/v3/{project_id}/hostscan/hosts/delete/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getHostId, DeleteHostRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostsRequest, ListHostsResponse> listHosts = genForListHosts();

    private static HttpRequestDef<ListHostsRequest, ListHostsResponse> genForListHosts() {
        // basic
        HttpRequestDef.Builder<ListHostsRequest, ListHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostsRequest.class, ListHostsResponse.class)
                .withName("ListHosts")
                .withUri("/v3/{project_id}/hostscan/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getGroupId, ListHostsRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostsRequest::getOffset, ListHostsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostsRequest::getLimit, ListHostsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubscriptionRequest, ShowSubscriptionResponse> showSubscription =
        genForShowSubscription();

    private static HttpRequestDef<ShowSubscriptionRequest, ShowSubscriptionResponse> genForShowSubscription() {
        // basic
        HttpRequestDef.Builder<ShowSubscriptionRequest, ShowSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubscriptionRequest.class, ShowSubscriptionResponse.class)
                .withName("ShowSubscription")
                .withUri("/v3/{project_id}/{service}/subscription")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubscriptionRequest::getService, ShowSubscriptionRequest::setService));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadTaskReportRequest, DownloadTaskReportResponse> downloadTaskReport =
        genForDownloadTaskReport();

    private static HttpRequestDef<DownloadTaskReportRequest, DownloadTaskReportResponse> genForDownloadTaskReport() {
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
            f -> f.withMarshaller(DownloadTaskReportRequest::getTaskId, DownloadTaskReportRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse> executeGenerateReport =
        genForExecuteGenerateReport();

    private static HttpRequestDef<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse> genForExecuteGenerateReport() {
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
            f -> f.withMarshaller(ExecuteGenerateReportRequest::getBody, ExecuteGenerateReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBusinessRisksRequest, ListBusinessRisksResponse> listBusinessRisks =
        genForListBusinessRisks();

    private static HttpRequestDef<ListBusinessRisksRequest, ListBusinessRisksResponse> genForListBusinessRisks() {
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
            f -> f.withMarshaller(ListBusinessRisksRequest::getTaskId, ListBusinessRisksRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBusinessRisksRequest::getOffset, ListBusinessRisksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBusinessRisksRequest::getLimit, ListBusinessRisksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortResultsRequest, ListPortResultsResponse> listPortResults =
        genForListPortResults();

    private static HttpRequestDef<ListPortResultsRequest, ListPortResultsResponse> genForListPortResults() {
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
            f -> f.withMarshaller(ListPortResultsRequest::getTaskId, ListPortResultsRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortResultsRequest::getOffset, ListPortResultsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortResultsRequest::getLimit, ListPortResultsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportStatusRequest, ShowReportStatusResponse> showReportStatus =
        genForShowReportStatus();

    private static HttpRequestDef<ShowReportStatusRequest, ShowReportStatusResponse> genForShowReportStatus() {
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
            f -> f.withMarshaller(ShowReportStatusRequest::getTaskId, ShowReportStatusRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResultsRequest, ShowResultsResponse> showResults = genForShowResults();

    private static HttpRequestDef<ShowResultsRequest, ShowResultsResponse> genForShowResults() {
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
            f -> f.withMarshaller(ShowResultsRequest::getTaskId, ShowResultsRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResultsRequest::getOffset, ShowResultsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResultsRequest::getLimit, ShowResultsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> updateFalsePositive =
        genForUpdateFalsePositive();

    private static HttpRequestDef<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> genForUpdateFalsePositive() {
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
            f -> f.withMarshaller(UpdateFalsePositiveRequest::getBody, UpdateFalsePositiveRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelTasksRequest, CancelTasksResponse> cancelTasks = genForCancelTasks();

    private static HttpRequestDef<CancelTasksRequest, CancelTasksResponse> genForCancelTasks() {
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
            f -> f.withMarshaller(CancelTasksRequest::getBody, CancelTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTasksRequest, CreateTasksResponse> createTasks = genForCreateTasks();

    private static HttpRequestDef<CreateTasksRequest, CreateTasksResponse> genForCreateTasks() {
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
            f -> f.withMarshaller(CreateTasksRequest::getUpgrade, CreateTasksRequest::setUpgrade));
        builder.<CreateTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTasksRequestBody.class),
            f -> f.withMarshaller(CreateTasksRequest::getBody, CreateTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskHistoriesRequest, ListTaskHistoriesResponse> listTaskHistories =
        genForListTaskHistories();

    private static HttpRequestDef<ListTaskHistoriesRequest, ListTaskHistoriesResponse> genForListTaskHistories() {
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
            f -> f.withMarshaller(ListTaskHistoriesRequest::getDomainId, ListTaskHistoriesRequest::setDomainId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskHistoriesRequest::getOffset, ListTaskHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskHistoriesRequest::getLimit, ListTaskHistoriesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTasksRequest, ShowTasksResponse> showTasks = genForShowTasks();

    private static HttpRequestDef<ShowTasksRequest, ShowTasksResponse> genForShowTasks() {
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
            f -> f.withMarshaller(ShowTasksRequest::getTaskId, ShowTasksRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizeDomainsRequest, AuthorizeDomainsResponse> authorizeDomains =
        genForAuthorizeDomains();

    private static HttpRequestDef<AuthorizeDomainsRequest, AuthorizeDomainsResponse> genForAuthorizeDomains() {
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
            f -> f.withMarshaller(AuthorizeDomainsRequest::getBody, AuthorizeDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainsRequest, CreateDomainsResponse> createDomains =
        genForCreateDomains();

    private static HttpRequestDef<CreateDomainsRequest, CreateDomainsResponse> genForCreateDomains() {
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
            f -> f.withMarshaller(CreateDomainsRequest::getBody, CreateDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomains =
        genForDeleteDomains();

    private static HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> genForDeleteDomains() {
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
            f -> f.withMarshaller(DeleteDomainsRequest::getDomainName, DeleteDomainsRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForListDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForListDomains() {
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
            f -> f.withMarshaller(ListDomainsRequest::getDomainId, ListDomainsRequest::setDomainId));
        builder.<ListDomainsRequest.AuthStatusEnum>withRequestField("auth_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.AuthStatusEnum.class),
            f -> f.withMarshaller(ListDomainsRequest::getAuthStatus, ListDomainsRequest::setAuthStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getOffset, ListDomainsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getLimit, ListDomainsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainSettingsRequest, ShowDomainSettingsResponse> showDomainSettings =
        genForShowDomainSettings();

    private static HttpRequestDef<ShowDomainSettingsRequest, ShowDomainSettingsResponse> genForShowDomainSettings() {
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
            f -> f.withMarshaller(ShowDomainSettingsRequest::getDomainId, ShowDomainSettingsRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> updateDomainSettings =
        genForUpdateDomainSettings();

    private static HttpRequestDef<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> genForUpdateDomainSettings() {
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
            f -> f.withMarshaller(UpdateDomainSettingsRequest::getBody, UpdateDomainSettingsRequest::setBody));

        // response

        return builder.build();
    }

}
