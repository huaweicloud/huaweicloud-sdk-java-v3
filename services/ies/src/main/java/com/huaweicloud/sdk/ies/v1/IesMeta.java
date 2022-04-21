package com.huaweicloud.sdk.ies.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ies.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class IesMeta {

    public static final HttpRequestDef<CreateEdgeSiteRequest, CreateEdgeSiteResponse> createEdgeSite =
        genForcreateEdgeSite();

    private static HttpRequestDef<CreateEdgeSiteRequest, CreateEdgeSiteResponse> genForcreateEdgeSite() {
        // basic
        HttpRequestDef.Builder<CreateEdgeSiteRequest, CreateEdgeSiteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeSiteRequest.class, CreateEdgeSiteResponse.class)
                .withName("CreateEdgeSite")
                .withUri("/v1/{domain_id}/edge-sites")
                .withContentType("application/json");

        // requests
        builder.<CreateEdgeSiteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeSiteRequestBody.class),
            f -> f.withMarshaller(CreateEdgeSiteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse> deleteEdgeSite =
        genFordeleteEdgeSite();

    private static HttpRequestDef<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse> genFordeleteEdgeSite() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgeSiteRequest.class, DeleteEdgeSiteResponse.class)
                .withName("DeleteEdgeSite")
                .withUri("/v1/{domain_id}/edge-sites/{site_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeSiteRequest::getSiteId, (req, v) -> {
                req.setSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeSitesRequest, ListEdgeSitesResponse> listEdgeSites =
        genForlistEdgeSites();

    private static HttpRequestDef<ListEdgeSitesRequest, ListEdgeSitesResponse> genForlistEdgeSites() {
        // basic
        HttpRequestDef.Builder<ListEdgeSitesRequest, ListEdgeSitesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeSitesRequest.class, ListEdgeSitesResponse.class)
                .withName("ListEdgeSites")
                .withUri("/v1/{domain_id}/edge-sites")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getAvailabilityZoneId, (req, v) -> {
                req.setAvailabilityZoneId(v);
            }));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeSiteRequest, ShowEdgeSiteResponse> showEdgeSite = genForshowEdgeSite();

    private static HttpRequestDef<ShowEdgeSiteRequest, ShowEdgeSiteResponse> genForshowEdgeSite() {
        // basic
        HttpRequestDef.Builder<ShowEdgeSiteRequest, ShowEdgeSiteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeSiteRequest.class, ShowEdgeSiteResponse.class)
                .withName("ShowEdgeSite")
                .withUri("/v1/{domain_id}/edge-sites/{site_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeSiteRequest::getSiteId, (req, v) -> {
                req.setSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse> updateEdgeSite =
        genForupdateEdgeSite();

    private static HttpRequestDef<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse> genForupdateEdgeSite() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEdgeSiteRequest.class, UpdateEdgeSiteResponse.class)
                .withName("UpdateEdgeSite")
                .withUri("/v1/{domain_id}/edge-sites/{site_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeSiteRequest::getSiteId, (req, v) -> {
                req.setSiteId(v);
            }));
        builder.<UpdateEdgeSiteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeSiteRequestBody.class),
            f -> f.withMarshaller(UpdateEdgeSiteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse> listEdgeSiteMetrics =
        genForlistEdgeSiteMetrics();

    private static HttpRequestDef<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse> genForlistEdgeSiteMetrics() {
        // basic
        HttpRequestDef.Builder<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeSiteMetricsRequest.class, ListEdgeSiteMetricsResponse.class)
                .withName("ListEdgeSiteMetrics")
                .withUri("/v1/{domain_id}/edge-sites/{site_id}/metric-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeSiteMetricsRequest::getSiteId, (req, v) -> {
                req.setSiteId(v);
            }));
        builder.<ListEdgeSiteMetricsRequest.DimEnum>withRequestField("dim",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEdgeSiteMetricsRequest.DimEnum.class),
            f -> f.withMarshaller(ListEdgeSiteMetricsRequest::getDim, (req, v) -> {
                req.setDim(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForlistQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForlistQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1/{domain_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSupportedRegionsRequest, ListSupportedRegionsResponse> listSupportedRegions =
        genForlistSupportedRegions();

    private static HttpRequestDef<ListSupportedRegionsRequest, ListSupportedRegionsResponse> genForlistSupportedRegions() {
        // basic
        HttpRequestDef.Builder<ListSupportedRegionsRequest, ListSupportedRegionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSupportedRegionsRequest.class, ListSupportedRegionsResponse.class)
            .withName("ListSupportedRegions")
            .withUri("/v1/{domain_id}/regions")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<ListSupportedRegionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSupportedRegionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

}
