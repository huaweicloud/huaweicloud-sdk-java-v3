package com.huaweicloud.sdk.cloudpond.v1;

import com.huaweicloud.sdk.cloudpond.v1.model.CreateEdgeSiteRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.CreateEdgeSiteRequestBody;
import com.huaweicloud.sdk.cloudpond.v1.model.CreateEdgeSiteResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.DeleteEdgeSiteRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.DeleteEdgeSiteResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListEdgeSiteMetricsRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListEdgeSiteMetricsResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListEdgeSitesRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListEdgeSitesResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListRacksRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListRacksResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListStoragePoolsRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListStoragePoolsResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListSupportedRegionsRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListSupportedRegionsResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListSupportedZonesRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListSupportedZonesResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowEdgeSiteRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowEdgeSiteResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowRackRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowRackResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowStoragePoolRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowStoragePoolResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.SiteStatus;
import com.huaweicloud.sdk.cloudpond.v1.model.UpdateEdgeSiteRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.UpdateEdgeSiteRequestBody;
import com.huaweicloud.sdk.cloudpond.v1.model.UpdateEdgeSiteResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CloudPondMeta {

    public static final HttpRequestDef<CreateEdgeSiteRequest, CreateEdgeSiteResponse> createEdgeSite =
        genForCreateEdgeSite();

    private static HttpRequestDef<CreateEdgeSiteRequest, CreateEdgeSiteResponse> genForCreateEdgeSite() {
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
            f -> f.withMarshaller(CreateEdgeSiteRequest::getBody, CreateEdgeSiteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse> deleteEdgeSite =
        genForDeleteEdgeSite();

    private static HttpRequestDef<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse> genForDeleteEdgeSite() {
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
            f -> f.withMarshaller(DeleteEdgeSiteRequest::getSiteId, DeleteEdgeSiteRequest::setSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeSitesRequest, ListEdgeSitesResponse> listEdgeSites =
        genForListEdgeSites();

    private static HttpRequestDef<ListEdgeSitesRequest, ListEdgeSitesResponse> genForListEdgeSites() {
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
            f -> f.withMarshaller(ListEdgeSitesRequest::getLimit, ListEdgeSitesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getMarker, ListEdgeSitesRequest::setMarker));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getSortKey, ListEdgeSitesRequest::setSortKey));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getSortDir, ListEdgeSitesRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getId, ListEdgeSitesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getName, ListEdgeSitesRequest::setName));
        builder.<List<String>>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getAvailabilityZoneId,
                ListEdgeSitesRequest::setAvailabilityZoneId));
        builder.<List<SiteStatus>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeSitesRequest::getStatus, ListEdgeSitesRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeSiteRequest, ShowEdgeSiteResponse> showEdgeSite = genForShowEdgeSite();

    private static HttpRequestDef<ShowEdgeSiteRequest, ShowEdgeSiteResponse> genForShowEdgeSite() {
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
            f -> f.withMarshaller(ShowEdgeSiteRequest::getSiteId, ShowEdgeSiteRequest::setSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse> updateEdgeSite =
        genForUpdateEdgeSite();

    private static HttpRequestDef<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse> genForUpdateEdgeSite() {
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
            f -> f.withMarshaller(UpdateEdgeSiteRequest::getSiteId, UpdateEdgeSiteRequest::setSiteId));
        builder.<UpdateEdgeSiteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeSiteRequestBody.class),
            f -> f.withMarshaller(UpdateEdgeSiteRequest::getBody, UpdateEdgeSiteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse> listEdgeSiteMetrics =
        genForListEdgeSiteMetrics();

    private static HttpRequestDef<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse> genForListEdgeSiteMetrics() {
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
            f -> f.withMarshaller(ListEdgeSiteMetricsRequest::getSiteId, ListEdgeSiteMetricsRequest::setSiteId));
        builder.<ListEdgeSiteMetricsRequest.DimEnum>withRequestField("dim",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEdgeSiteMetricsRequest.DimEnum.class),
            f -> f.withMarshaller(ListEdgeSiteMetricsRequest::getDim, ListEdgeSiteMetricsRequest::setDim));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
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

    public static final HttpRequestDef<ListRacksRequest, ListRacksResponse> listRacks = genForListRacks();

    private static HttpRequestDef<ListRacksRequest, ListRacksResponse> genForListRacks() {
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
            f -> f.withMarshaller(ListRacksRequest::getLimit, ListRacksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRacksRequest::getMarker, ListRacksRequest::setMarker));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRacksRequest::getSortKey, ListRacksRequest::setSortKey));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRacksRequest::getSortDir, ListRacksRequest::setSortDir));
        builder.<String>withRequestField("edge_site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRacksRequest::getEdgeSiteId, ListRacksRequest::setEdgeSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRackRequest, ShowRackResponse> showRack = genForShowRack();

    private static HttpRequestDef<ShowRackRequest, ShowRackResponse> genForShowRack() {
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
            f -> f.withMarshaller(ShowRackRequest::getId, ShowRackRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSupportedRegionsRequest, ListSupportedRegionsResponse> listSupportedRegions =
        genForListSupportedRegions();

    private static HttpRequestDef<ListSupportedRegionsRequest, ListSupportedRegionsResponse> genForListSupportedRegions() {
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
            f -> f.withMarshaller(ListSupportedRegionsRequest::getLimit, ListSupportedRegionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getMarker, ListSupportedRegionsRequest::setMarker));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getSortKey, ListSupportedRegionsRequest::setSortKey));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getSortDir, ListSupportedRegionsRequest::setSortDir));
        builder.<ListSupportedRegionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSupportedRegionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSupportedRegionsRequest::getXLanguage,
                ListSupportedRegionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoragePoolsRequest, ListStoragePoolsResponse> listStoragePools =
        genForListStoragePools();

    private static HttpRequestDef<ListStoragePoolsRequest, ListStoragePoolsResponse> genForListStoragePools() {
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
            f -> f.withMarshaller(ListStoragePoolsRequest::getLimit, ListStoragePoolsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getMarker, ListStoragePoolsRequest::setMarker));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getSortKey, ListStoragePoolsRequest::setSortKey));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getSortDir, ListStoragePoolsRequest::setSortDir));
        builder.<String>withRequestField("edge_site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getEdgeSiteId, ListStoragePoolsRequest::setEdgeSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStoragePoolRequest, ShowStoragePoolResponse> showStoragePool =
        genForShowStoragePool();

    private static HttpRequestDef<ShowStoragePoolRequest, ShowStoragePoolResponse> genForShowStoragePool() {
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
            f -> f.withMarshaller(ShowStoragePoolRequest::getId, ShowStoragePoolRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSupportedZonesRequest, ListSupportedZonesResponse> listSupportedZones =
        genForListSupportedZones();

    private static HttpRequestDef<ListSupportedZonesRequest, ListSupportedZonesResponse> genForListSupportedZones() {
        // basic
        HttpRequestDef.Builder<ListSupportedZonesRequest, ListSupportedZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSupportedZonesRequest.class, ListSupportedZonesResponse.class)
                .withName("ListSupportedZones")
                .withUri("/v1/{domain_id}/zones")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSupportedZonesRequest::getLimit, ListSupportedZonesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupportedZonesRequest::getMarker, ListSupportedZonesRequest::setMarker));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportedZonesRequest::getSortKey, ListSupportedZonesRequest::setSortKey));
        builder.<List<String>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportedZonesRequest::getSortDir, ListSupportedZonesRequest::setSortDir));
        builder.<ListSupportedZonesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSupportedZonesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSupportedZonesRequest::getXLanguage, ListSupportedZonesRequest::setXLanguage));

        // response

        return builder.build();
    }

}
