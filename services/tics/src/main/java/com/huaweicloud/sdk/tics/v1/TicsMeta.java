package com.huaweicloud.sdk.tics.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.tics.v1.model.*;

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

}
