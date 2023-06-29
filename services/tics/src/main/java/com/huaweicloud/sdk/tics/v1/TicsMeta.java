package com.huaweicloud.sdk.tics.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.tics.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class TicsMeta {

    public static final HttpRequestDef<ListAgentsRequest, ListAgentsResponse> listAgents = genForlistAgents();

    private static HttpRequestDef<ListAgentsRequest, ListAgentsResponse> genForlistAgents() {
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
            f -> f.withMarshaller(ListAgentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("agent_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsRequest::getAgentName, (req, v) -> {
                req.setAgentName(v);
            }));
        builder.<String>withRequestField("league_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsRequest::getLeagueName, (req, v) -> {
                req.setLeagueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditInfoRequest, ListAuditInfoResponse> listAuditInfo =
        genForlistAuditInfo();

    private static HttpRequestDef<ListAuditInfoRequest, ListAuditInfoResponse> genForlistAuditInfo() {
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
            f -> f.withMarshaller(ListAuditInfoRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlJobRequest, ListFlJobResponse> listFlJob = genForlistFlJob();

    private static HttpRequestDef<ListFlJobRequest, ListFlJobResponse> genForlistFlJob() {
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
            f -> f.withMarshaller(ListFlJobRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceHistoryRequest, ListInstanceHistoryResponse> listInstanceHistory =
        genForlistInstanceHistory();

    private static HttpRequestDef<ListInstanceHistoryRequest, ListInstanceHistoryResponse> genForlistInstanceHistory() {
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
            f -> f.withMarshaller(ListInstanceHistoryRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceHistoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceHistoryRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse> listLeagueDatasets =
        genForlistLeagueDatasets();

    private static HttpRequestDef<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse> genForlistLeagueDatasets() {
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
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("dataset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getDatasetName, (req, v) -> {
                req.setDatasetName(v);
            }));
        builder.<String>withRequestField("partner_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLeagueDatasetsRequest::getPartnerName, (req, v) -> {
                req.setPartnerName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLeaguesRequest, ListLeaguesResponse> listLeagues = genForlistLeagues();

    private static HttpRequestDef<ListLeaguesRequest, ListLeaguesResponse> genForlistLeagues() {
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
            f -> f.withMarshaller(ListLeaguesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLeaguesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListLeaguesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLeaguesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListLeaguesRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodesRequest, ListNodesResponse> listNodes = genForlistNodes();

    private static HttpRequestDef<ListNodesRequest, ListNodesResponse> genForlistNodes() {
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
            f -> f.withMarshaller(ListNodesRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticesRequest, ListNoticesResponse> listNotices = genForlistNotices();

    private static HttpRequestDef<ListNoticesRequest, ListNoticesResponse> genForlistNotices() {
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
            f -> f.withMarshaller(ListNoticesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartnersRequest, ListPartnersResponse> listPartners = genForlistPartners();

    private static HttpRequestDef<ListPartnersRequest, ListPartnersResponse> genForlistPartners() {
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
            f -> f.withMarshaller(ListPartnersRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlJobRequest, ListSqlJobResponse> listSqlJob = genForlistSqlJob();

    private static HttpRequestDef<ListSqlJobRequest, ListSqlJobResponse> genForlistSqlJob() {
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
            f -> f.withMarshaller(ListSqlJobRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentDetailRequest, ShowAgentDetailResponse> showAgentDetail =
        genForshowAgentDetail();

    private static HttpRequestDef<ShowAgentDetailRequest, ShowAgentDetailResponse> genForshowAgentDetail() {
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
            f -> f.withMarshaller(ShowAgentDetailRequest::getAgentId, (req, v) -> {
                req.setAgentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse> showDatasetStatistics =
        genForshowDatasetStatistics();

    private static HttpRequestDef<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse> genForshowDatasetStatistics() {
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
            f -> f.withMarshaller(ShowDatasetStatisticsRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasetStatisticsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasetStatisticsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));

        // response
        builder.<List<LeagueDatasetStatisticsVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDatasetStatisticsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(LeagueDatasetStatisticsVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceReportRequest, ShowInstanceReportResponse> showInstanceReport =
        genForshowInstanceReport();

    private static HttpRequestDef<ShowInstanceReportRequest, ShowInstanceReportResponse> genForshowInstanceReport() {
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
            f -> f.withMarshaller(ShowInstanceReportRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceReportRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse> showJobInstanceDag =
        genForshowJobInstanceDag();

    private static HttpRequestDef<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse> genForshowJobInstanceDag() {
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
            f -> f.withMarshaller(ShowJobInstanceDagRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("league_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInstanceDagRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<Integer>withRequestField("round_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobInstanceDagRequest::getRoundId, (req, v) -> {
                req.setRoundId(v);
            }));

        // response
        builder.<List<DeployVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowJobInstanceDagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(DeployVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatisticsRequest, ShowJobStatisticsResponse> showJobStatistics =
        genForshowJobStatistics();

    private static HttpRequestDef<ShowJobStatisticsRequest, ShowJobStatisticsResponse> genForshowJobStatistics() {
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
            f -> f.withMarshaller(ShowJobStatisticsRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatisticsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatisticsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLeagueRequest, ShowLeagueResponse> showLeague = genForshowLeague();

    private static HttpRequestDef<ShowLeagueRequest, ShowLeagueResponse> genForshowLeague() {
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
            f -> f.withMarshaller(ShowLeagueRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> showOverview = genForshowOverview();

    private static HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> genForshowOverview() {
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
        genForshowPartnerStatistics();

    private static HttpRequestDef<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse> genForshowPartnerStatistics() {
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
            f -> f.withMarshaller(ShowPartnerStatisticsRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnerStatisticsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnerStatisticsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));

        // response
        builder.<List<LeaguePartnerStatisticsVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPartnerStatisticsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(LeaguePartnerStatisticsVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLeagueRequest, UpdateLeagueResponse> updateLeague = genForupdateLeague();

    private static HttpRequestDef<UpdateLeagueRequest, UpdateLeagueResponse> genForupdateLeague() {
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
            f -> f.withMarshaller(UpdateLeagueRequest::getLeagueId, (req, v) -> {
                req.setLeagueId(v);
            }));
        builder.<LeagueUpdateVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LeagueUpdateVo.class),
            f -> f.withMarshaller(UpdateLeagueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLeagueResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

}
