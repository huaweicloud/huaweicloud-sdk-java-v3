package com.huaweicloud.sdk.astrozero.v1;

import com.huaweicloud.sdk.astrozero.v1.model.ShowOrderStatusReq;
import com.huaweicloud.sdk.astrozero.v1.model.ShowOrderStatusRequest;
import com.huaweicloud.sdk.astrozero.v1.model.ShowOrderStatusResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AstroZeroMeta {

    public static final HttpRequestDef<ShowOrderStatusRequest, ShowOrderStatusResponse> showOrderStatus =
        genForShowOrderStatus();

    private static HttpRequestDef<ShowOrderStatusRequest, ShowOrderStatusResponse> genForShowOrderStatus() {
        // basic
        HttpRequestDef.Builder<ShowOrderStatusRequest, ShowOrderStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowOrderStatusRequest.class, ShowOrderStatusResponse.class)
                .withName("ShowOrderStatus")
                .withUri("/rest/astro-zero/v1.0/service/queryTenant")
                .withContentType("application/json");

        // requests
        builder.<ShowOrderStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowOrderStatusReq.class),
            f -> f.withMarshaller(ShowOrderStatusRequest::getBody, ShowOrderStatusRequest::setBody));

        // response

        return builder.build();
    }

}
