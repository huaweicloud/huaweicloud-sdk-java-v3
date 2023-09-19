package com.huaweicloud.sdk.dss.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dss.v1.model.ListPoolsRequest;
import com.huaweicloud.sdk.dss.v1.model.ListPoolsResponse;
import com.huaweicloud.sdk.dss.v1.model.ListVersionRequest;
import com.huaweicloud.sdk.dss.v1.model.ListVersionResponse;
import com.huaweicloud.sdk.dss.v1.model.ShowPoolRequest;
import com.huaweicloud.sdk.dss.v1.model.ShowPoolResponse;
import com.huaweicloud.sdk.dss.v1.model.ShowVersionsRequest;
import com.huaweicloud.sdk.dss.v1.model.ShowVersionsResponse;

@SuppressWarnings("unchecked")
public class DssMeta {

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForlistPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForlistPools() {
        // basic
        HttpRequestDef.Builder<ListPoolsRequest, ListPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolsRequest.class, ListPoolsResponse.class)
                .withName("ListPools")
                .withUri("/v1/{project_id}/pools/detail")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("usage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getUsage, (req, v) -> {
                req.setUsage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionRequest, ListVersionResponse> listVersion = genForlistVersion();

    private static HttpRequestDef<ListVersionRequest, ListVersionResponse> genForlistVersion() {
        // basic
        HttpRequestDef.Builder<ListVersionRequest, ListVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionRequest.class, ListVersionResponse.class)
                .withName("ListVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForshowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForshowPool() {
        // basic
        HttpRequestDef.Builder<ShowPoolRequest, ShowPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolRequest.class, ShowPoolResponse.class)
                .withName("ShowPool")
                .withUri("/v1/{project_id}/pools/{dss_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dss_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolRequest::getDssId, (req, v) -> {
                req.setDssId(v);
            }));
        builder.<Boolean>withRequestField("usage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowPoolRequest::getUsage, (req, v) -> {
                req.setUsage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionsRequest, ShowVersionsResponse> showVersions = genForshowVersions();

    private static HttpRequestDef<ShowVersionsRequest, ShowVersionsResponse> genForshowVersions() {
        // basic
        HttpRequestDef.Builder<ShowVersionsRequest, ShowVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionsRequest.class, ShowVersionsResponse.class)
                .withName("ShowVersions")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionsRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            }));

        // response

        return builder.build();
    }

}
