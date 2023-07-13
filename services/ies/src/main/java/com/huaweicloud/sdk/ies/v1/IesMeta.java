package com.huaweicloud.sdk.ies.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ies.v1.model.CreateEdgeSiteRequest;
import com.huaweicloud.sdk.ies.v1.model.CreateEdgeSiteRequestBody;
import com.huaweicloud.sdk.ies.v1.model.CreateEdgeSiteResponse;
import com.huaweicloud.sdk.ies.v1.model.DeleteEdgeSiteRequest;
import com.huaweicloud.sdk.ies.v1.model.DeleteEdgeSiteResponse;
import com.huaweicloud.sdk.ies.v1.model.ListEdgeSiteMetricsRequest;
import com.huaweicloud.sdk.ies.v1.model.ListEdgeSiteMetricsResponse;
import com.huaweicloud.sdk.ies.v1.model.ListEdgeSitesRequest;
import com.huaweicloud.sdk.ies.v1.model.ListEdgeSitesResponse;
import com.huaweicloud.sdk.ies.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.ies.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.ies.v1.model.ListRacksRequest;
import com.huaweicloud.sdk.ies.v1.model.ListRacksResponse;
import com.huaweicloud.sdk.ies.v1.model.ListStoragePoolsRequest;
import com.huaweicloud.sdk.ies.v1.model.ListStoragePoolsResponse;
import com.huaweicloud.sdk.ies.v1.model.ListSupportedRegionsRequest;
import com.huaweicloud.sdk.ies.v1.model.ListSupportedRegionsResponse;
import com.huaweicloud.sdk.ies.v1.model.ShowEdgeSiteRequest;
import com.huaweicloud.sdk.ies.v1.model.ShowEdgeSiteResponse;
import com.huaweicloud.sdk.ies.v1.model.ShowRackRequest;
import com.huaweicloud.sdk.ies.v1.model.ShowRackResponse;
import com.huaweicloud.sdk.ies.v1.model.ShowStoragePoolRequest;
import com.huaweicloud.sdk.ies.v1.model.ShowStoragePoolResponse;
import com.huaweicloud.sdk.ies.v1.model.SiteStatus;
import com.huaweicloud.sdk.ies.v1.model.UpdateEdgeSiteRequest;
import com.huaweicloud.sdk.ies.v1.model.UpdateEdgeSiteRequestBody;
import com.huaweicloud.sdk.ies.v1.model.UpdateEdgeSiteResponse;

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
        builder.<List<SiteStatus>>withRequestField("status",
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

    public static final HttpRequestDef<ListRacksRequest, ListRacksResponse> listRacks = genForlistRacks();

    private static HttpRequestDef<ListRacksRequest, ListRacksResponse> genForlistRacks() {
        // basic
        HttpRequestDef.Builder<ListRacksRequest, ListRacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRacksRequest.class, ListRacksResponse.class)
                .withName("ListRacks")
                .withUri("/v1/{domain_id}/racks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRacksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRacksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRacksRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRacksRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("edge_site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRacksRequest::getEdgeSiteId, (req, v) -> {
                req.setEdgeSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRackRequest, ShowRackResponse> showRack = genForshowRack();

    private static HttpRequestDef<ShowRackRequest, ShowRackResponse> genForshowRack() {
        // basic
        HttpRequestDef.Builder<ShowRackRequest, ShowRackResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRackRequest.class, ShowRackResponse.class)
                .withName("ShowRack")
                .withUri("/v1/{domain_id}/racks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRackRequest::getId, (req, v) -> {
                req.setId(v);
            }));

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

    public static final HttpRequestDef<ListStoragePoolsRequest, ListStoragePoolsResponse> listStoragePools =
        genForlistStoragePools();

    private static HttpRequestDef<ListStoragePoolsRequest, ListStoragePoolsResponse> genForlistStoragePools() {
        // basic
        HttpRequestDef.Builder<ListStoragePoolsRequest, ListStoragePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStoragePoolsRequest.class, ListStoragePoolsResponse.class)
                .withName("ListStoragePools")
                .withUri("/v1/{domain_id}/storage-pools")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("edge_site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getEdgeSiteId, (req, v) -> {
                req.setEdgeSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStoragePoolRequest, ShowStoragePoolResponse> showStoragePool =
        genForshowStoragePool();

    private static HttpRequestDef<ShowStoragePoolRequest, ShowStoragePoolResponse> genForshowStoragePool() {
        // basic
        HttpRequestDef.Builder<ShowStoragePoolRequest, ShowStoragePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStoragePoolRequest.class, ShowStoragePoolResponse.class)
                .withName("ShowStoragePool")
                .withUri("/v1/{domain_id}/storage-pools/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStoragePoolRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

}
