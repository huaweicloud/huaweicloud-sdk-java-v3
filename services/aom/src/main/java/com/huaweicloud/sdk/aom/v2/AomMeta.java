package com.huaweicloud.sdk.aom.v2;

import com.huaweicloud.sdk.aom.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AomMeta {

    public static final HttpRequestDef<ListSampleRequest, ListSampleResponse> listSample = genForlistSample();

    private static HttpRequestDef<ListSampleRequest, ListSampleResponse> genForlistSample() {
        // basic
        HttpRequestDef.Builder<ListSampleRequest, ListSampleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSampleRequest.class, ListSampleResponse.class)
                .withName("ListSample")
                .withUri("/v2/{project_id}/samples")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fill_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSampleRequest::getFillValue, (req, v) -> {
                req.setFillValue(v);
            }));
        builder.<QuerySampleParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySampleParam.class),
            f -> f.withMarshaller(ListSampleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSeriesRequest, ListSeriesResponse> listSeries = genForlistSeries();

    private static HttpRequestDef<ListSeriesRequest, ListSeriesResponse> genForlistSeries() {
        // basic
        HttpRequestDef.Builder<ListSeriesRequest, ListSeriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSeriesRequest.class, ListSeriesResponse.class)
                .withName("ListSeries")
                .withUri("/v2/{project_id}/series")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<SeriesAPIQueryItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SeriesAPIQueryItemParam.class),
            f -> f.withMarshaller(ListSeriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
