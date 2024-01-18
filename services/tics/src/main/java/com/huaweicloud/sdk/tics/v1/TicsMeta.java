package com.huaweicloud.sdk.tics.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.tics.v1.model.DeployVo;
import com.huaweicloud.sdk.tics.v1.model.LeagueDatasetStatisticsVo;
import com.huaweicloud.sdk.tics.v1.model.LeaguePartnerStatisticsVo;
import com.huaweicloud.sdk.tics.v1.model.LeagueUpdateVo;
import com.huaweicloud.sdk.tics.v1.model.ListAgentsRequest;
import com.huaweicloud.sdk.tics.v1.model.ListAgentsResponse;
import com.huaweicloud.sdk.tics.v1.model.ListAuditInfoRequest;
import com.huaweicloud.sdk.tics.v1.model.ListAuditInfoResponse;
import com.huaweicloud.sdk.tics.v1.model.ListFlJobRequest;
import com.huaweicloud.sdk.tics.v1.model.ListFlJobResponse;
import com.huaweicloud.sdk.tics.v1.model.ListInstanceHistoryRequest;
import com.huaweicloud.sdk.tics.v1.model.ListInstanceHistoryResponse;
import com.huaweicloud.sdk.tics.v1.model.ListLeagueDatasetsRequest;
import com.huaweicloud.sdk.tics.v1.model.ListLeagueDatasetsResponse;
import com.huaweicloud.sdk.tics.v1.model.ListLeaguesRequest;
import com.huaweicloud.sdk.tics.v1.model.ListLeaguesResponse;
import com.huaweicloud.sdk.tics.v1.model.ListNodesRequest;
import com.huaweicloud.sdk.tics.v1.model.ListNodesResponse;
import com.huaweicloud.sdk.tics.v1.model.ListNoticesRequest;
import com.huaweicloud.sdk.tics.v1.model.ListNoticesResponse;
import com.huaweicloud.sdk.tics.v1.model.ListPartnersRequest;
import com.huaweicloud.sdk.tics.v1.model.ListPartnersResponse;
import com.huaweicloud.sdk.tics.v1.model.ListSqlJobRequest;
import com.huaweicloud.sdk.tics.v1.model.ListSqlJobResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowAgentDetailRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowAgentDetailResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowDatasetStatisticsRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowDatasetStatisticsResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowInstanceReportRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowInstanceReportResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowJobInstanceDagRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowJobInstanceDagResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowJobStatisticsRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowJobStatisticsResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowLeagueRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowLeagueResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowOverviewRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowOverviewResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowPartnerStatisticsRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowPartnerStatisticsResponse;
import com.huaweicloud.sdk.tics.v1.model.UpdateLeagueRequest;
import com.huaweicloud.sdk.tics.v1.model.UpdateLeagueResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class TicsMeta {

    public static final HttpRequestDef<ListAgentsRequest, ListAgentsResponse> listAgents = genForListAgents();

    private static HttpRequestDef<ListAgentsRequest, ListAgentsResponse> genForListAgents() {
        // basic
        HttpRequestDef.Builder<ListAgentsRequest, ListAgentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgentsRequest.class, ListAgentsResponse.class)
                .withName("ListAgents")
                .withUri("/v1/{project_id}/agents")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentsRequest::getLimit, ListAgentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentsRequest::getOffset, ListAgentsRequest::setOffset));
        builder.<String>withRequestField("agent_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsRequest::getAgentName, ListAgentsRequest::setAgentName));
        builder.<String>withRequestField("league_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsRequest::getLeagueName, ListAgentsRequest::setLeagueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditInfoRequest, ListAuditInfoResponse> listAuditInfo =
        genForListAuditInfo();

    private static HttpRequestDef<ListAuditInfoRequest, ListAuditInfoResponse> genForListAuditInfo() {
        // basic
        HttpRequestDef.Builder<ListAuditInfoRequest, ListAuditInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditInfoRequest.class, ListAuditInfoResponse.class)
                .withName("ListAuditInfo")
                .withUri("/v1/{project_id}/leagues/{league_id}/audit-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInfoRequest::getLeagueId, ListAuditInfoRequest::setLeagueId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditInfoRequest::getLimit, ListAuditInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditInfoRequest::getOffset, ListAuditInfoRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlJobRequest, ListFlJobResponse> listFlJob = genForListFlJob();

    private static HttpRequestDef<ListFlJobRequest, ListFlJobResponse> genForListFlJob() {
        // basic
        HttpRequestDef.Builder<ListFlJobRequest, ListFlJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlJobRequest.class, ListFlJobResponse.class)
                .withName("ListFlJob")
                .withUri("/v1/{project_id}/leagues/{league_id}/fl-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlJobRequest::getLeagueId, ListFlJobRequest::setLeagueId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlJobRequest::getLimit, ListFlJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlJobRequest::getOffset, ListFlJobRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceHistoryRequest, ListInstanceHistoryResponse> listInstanceHistory =
        genForListInstanceHistory();

    private static HttpRequestDef<ListInstanceHistoryRequest, ListInstanceHistoryResponse> genForListInstanceHistory() {
        // basic
        HttpRequestDef.Builder<ListInstanceHistoryRequest, ListInstanceHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceHistoryRequest.class, ListInstanceHistoryResponse.class)
                .withName("ListInstanceHistory")
                .withUri("/v1/{project_id}/leagues/{league_id}/job-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceHistoryRequest::getLeagueId, ListInstanceHistoryRequest::setLeagueId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceHistoryRequest::getLimit, ListInstanceHistoryRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceHistoryRequest::getOffset, ListInstanceHistoryRequest::setOffset));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceHistoryRequest::getJobId, ListInstanceHistoryRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse> listLeagueDatasets =
        genForListLeagueDatasets();

    private static HttpRequestDef<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse> genForListLeagueDatasets() {
        // basic
        HttpRequestDef.Builder<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLeagueDatasetsRequest.class, ListLeagueDatasetsResponse.class)
                .withName("ListLeagueDatasets")
                .withUri("/v1/{project_id}/leagues/{league_id}/datasets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getLeagueId, ListLeagueDatasetsRequest::setLeagueId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getOffset, ListLeagueDatasetsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getLimit, ListLeagueDatasetsRequest::setLimit));
        builder.<String>withRequestField("dataset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getDatasetName,
                ListLeagueDatasetsRequest::setDatasetName));
        builder.<String>withRequestField("partner_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getPartnerName,
                ListLeagueDatasetsRequest::setPartnerName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLeaguesRequest, ListLeaguesResponse> listLeagues = genForListLeagues();

    private static HttpRequestDef<ListLeaguesRequest, ListLeaguesResponse> genForListLeagues() {
        // basic
        HttpRequestDef.Builder<ListLeaguesRequest, ListLeaguesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLeaguesRequest.class, ListLeaguesResponse.class)
                .withName("ListLeagues")
                .withUri("/v1/{project_id}/league-info")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLeaguesRequest::getLimit, ListLeaguesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLeaguesRequest::getOffset, ListLeaguesRequest::setOffset));
        builder.<ListLeaguesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLeaguesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListLeaguesRequest::getType, ListLeaguesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodesRequest, ListNodesResponse> listNodes = genForListNodes();

    private static HttpRequestDef<ListNodesRequest, ListNodesResponse> genForListNodes() {
        // basic
        HttpRequestDef.Builder<ListNodesRequest, ListNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodesRequest.class, ListNodesResponse.class)
                .withName("ListNodes")
                .withUri("/v1/{project_id}/leagues/{league_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodesRequest::getLeagueId, ListNodesRequest::setLeagueId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodesRequest::getOffset, ListNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodesRequest::getLimit, ListNodesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticesRequest, ListNoticesResponse> listNotices = genForListNotices();

    private static HttpRequestDef<ListNoticesRequest, ListNoticesResponse> genForListNotices() {
        // basic
        HttpRequestDef.Builder<ListNoticesRequest, ListNoticesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticesRequest.class, ListNoticesResponse.class)
                .withName("ListNotices")
                .withUri("/v1/{project_id}/notices")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticesRequest::getLimit, ListNoticesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticesRequest::getOffset, ListNoticesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartnersRequest, ListPartnersResponse> listPartners = genForListPartners();

    private static HttpRequestDef<ListPartnersRequest, ListPartnersResponse> genForListPartners() {
        // basic
        HttpRequestDef.Builder<ListPartnersRequest, ListPartnersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPartnersRequest.class, ListPartnersResponse.class)
                .withName("ListPartners")
                .withUri("/v1/{project_id}/leagues/{league_id}/partners")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnersRequest::getLeagueId, ListPartnersRequest::setLeagueId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnersRequest::getLimit, ListPartnersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnersRequest::getOffset, ListPartnersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlJobRequest, ListSqlJobResponse> listSqlJob = genForListSqlJob();

    private static HttpRequestDef<ListSqlJobRequest, ListSqlJobResponse> genForListSqlJob() {
        // basic
        HttpRequestDef.Builder<ListSqlJobRequest, ListSqlJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlJobRequest.class, ListSqlJobResponse.class)
                .withName("ListSqlJob")
                .withUri("/v1/{project_id}/leagues/{league_id}/sql-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobRequest::getLeagueId, ListSqlJobRequest::setLeagueId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlJobRequest::getLimit, ListSqlJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlJobRequest::getOffset, ListSqlJobRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentDetailRequest, ShowAgentDetailResponse> showAgentDetail =
        genForShowAgentDetail();

    private static HttpRequestDef<ShowAgentDetailRequest, ShowAgentDetailResponse> genForShowAgentDetail() {
        // basic
        HttpRequestDef.Builder<ShowAgentDetailRequest, ShowAgentDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgentDetailRequest.class, ShowAgentDetailResponse.class)
                .withName("ShowAgentDetail")
                .withUri("/v1/{project_id}/agents/{agent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAgentDetailRequest::getAgentId, ShowAgentDetailRequest::setAgentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse> showDatasetStatistics =
        genForShowDatasetStatistics();

    private static HttpRequestDef<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse> genForShowDatasetStatistics() {
        // basic
        HttpRequestDef.Builder<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDatasetStatisticsRequest.class, ShowDatasetStatisticsResponse.class)
            .withName("ShowDatasetStatistics")
            .withUri("/v1/{project_id}/leagues/{league_id}/datasets-statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasetStatisticsRequest::getLeagueId,
                ShowDatasetStatisticsRequest::setLeagueId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasetStatisticsRequest::getStartDate,
                ShowDatasetStatisticsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasetStatisticsRequest::getEndDate, ShowDatasetStatisticsRequest::setEndDate));

        // response
        builder.<List<LeagueDatasetStatisticsVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDatasetStatisticsResponse::getBody, ShowDatasetStatisticsResponse::setBody)
                .withInnerContainerType(LeagueDatasetStatisticsVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceReportRequest, ShowInstanceReportResponse> showInstanceReport =
        genForShowInstanceReport();

    private static HttpRequestDef<ShowInstanceReportRequest, ShowInstanceReportResponse> genForShowInstanceReport() {
        // basic
        HttpRequestDef.Builder<ShowInstanceReportRequest, ShowInstanceReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceReportRequest.class, ShowInstanceReportResponse.class)
                .withName("ShowInstanceReport")
                .withUri("/v1/{project_id}/leagues/{league_id}/job-instances/{instance_id}/report")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceReportRequest::getInstanceId, ShowInstanceReportRequest::setInstanceId));
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceReportRequest::getLeagueId, ShowInstanceReportRequest::setLeagueId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse> showJobInstanceDag =
        genForShowJobInstanceDag();

    private static HttpRequestDef<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse> genForShowJobInstanceDag() {
        // basic
        HttpRequestDef.Builder<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInstanceDagRequest.class, ShowJobInstanceDagResponse.class)
                .withName("ShowJobInstanceDag")
                .withUri("/v1/{project_id}/leagues/{league_id}/job-instances/{instance_id}/dag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInstanceDagRequest::getInstanceId, ShowJobInstanceDagRequest::setInstanceId));
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInstanceDagRequest::getLeagueId, ShowJobInstanceDagRequest::setLeagueId));
        builder.<Integer>withRequestField("round_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobInstanceDagRequest::getRoundId, ShowJobInstanceDagRequest::setRoundId));

        // response
        builder.<List<DeployVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowJobInstanceDagResponse::getBody, ShowJobInstanceDagResponse::setBody)
                .withInnerContainerType(DeployVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatisticsRequest, ShowJobStatisticsResponse> showJobStatistics =
        genForShowJobStatistics();

    private static HttpRequestDef<ShowJobStatisticsRequest, ShowJobStatisticsResponse> genForShowJobStatistics() {
        // basic
        HttpRequestDef.Builder<ShowJobStatisticsRequest, ShowJobStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatisticsRequest.class, ShowJobStatisticsResponse.class)
                .withName("ShowJobStatistics")
                .withUri("/v1/{project_id}/leagues/{league_id}/jobs-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatisticsRequest::getLeagueId, ShowJobStatisticsRequest::setLeagueId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatisticsRequest::getStartDate, ShowJobStatisticsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatisticsRequest::getEndDate, ShowJobStatisticsRequest::setEndDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLeagueRequest, ShowLeagueResponse> showLeague = genForShowLeague();

    private static HttpRequestDef<ShowLeagueRequest, ShowLeagueResponse> genForShowLeague() {
        // basic
        HttpRequestDef.Builder<ShowLeagueRequest, ShowLeagueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLeagueRequest.class, ShowLeagueResponse.class)
                .withName("ShowLeague")
                .withUri("/v1/{project_id}/leagues/{league_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLeagueRequest::getLeagueId, ShowLeagueRequest::setLeagueId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> showOverview = genForShowOverview();

    private static HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> genForShowOverview() {
        // basic
        HttpRequestDef.Builder<ShowOverviewRequest, ShowOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOverviewRequest.class, ShowOverviewResponse.class)
                .withName("ShowOverview")
                .withUri("/v1/{project_id}/overview/statistics")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse> showPartnerStatistics =
        genForShowPartnerStatistics();

    private static HttpRequestDef<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse> genForShowPartnerStatistics() {
        // basic
        HttpRequestDef.Builder<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPartnerStatisticsRequest.class, ShowPartnerStatisticsResponse.class)
            .withName("ShowPartnerStatistics")
            .withUri("/v1/{project_id}/leagues/{league_id}/partners-statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnerStatisticsRequest::getLeagueId,
                ShowPartnerStatisticsRequest::setLeagueId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnerStatisticsRequest::getStartDate,
                ShowPartnerStatisticsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnerStatisticsRequest::getEndDate, ShowPartnerStatisticsRequest::setEndDate));

        // response
        builder.<List<LeaguePartnerStatisticsVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPartnerStatisticsResponse::getBody, ShowPartnerStatisticsResponse::setBody)
                .withInnerContainerType(LeaguePartnerStatisticsVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLeagueRequest, UpdateLeagueResponse> updateLeague = genForUpdateLeague();

    private static HttpRequestDef<UpdateLeagueRequest, UpdateLeagueResponse> genForUpdateLeague() {
        // basic
        HttpRequestDef.Builder<UpdateLeagueRequest, UpdateLeagueResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLeagueRequest.class, UpdateLeagueResponse.class)
                .withName("UpdateLeague")
                .withUri("/v1/{project_id}/leagues/{league_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLeagueRequest::getLeagueId, UpdateLeagueRequest::setLeagueId));
        builder.<LeagueUpdateVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LeagueUpdateVo.class),
            f -> f.withMarshaller(UpdateLeagueRequest::getBody, UpdateLeagueRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLeagueResponse::getBody, UpdateLeagueResponse::setBody));

        return builder.build();
    }

}
