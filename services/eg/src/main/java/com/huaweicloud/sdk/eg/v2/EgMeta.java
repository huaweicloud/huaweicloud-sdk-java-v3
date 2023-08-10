package com.huaweicloud.sdk.eg.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eg.v2.model.PutEventsReq;
import com.huaweicloud.sdk.eg.v2.model.PutEventsRequest;
import com.huaweicloud.sdk.eg.v2.model.PutEventsResponse;

@SuppressWarnings("unchecked")
public class EgMeta {

    public static final HttpRequestDef<PutEventsRequest, PutEventsResponse> putEvents = genForputEvents();

    private static HttpRequestDef<PutEventsRequest, PutEventsResponse> genForputEvents() {
        // basic
        HttpRequestDef.Builder<PutEventsRequest, PutEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PutEventsRequest.class, PutEventsResponse.class)
                .withName("PutEvents")
                .withUri("/v1/{project_id}/channels/{channel_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutEventsRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));
        builder.<PutEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutEventsReq.class),
            f -> f.withMarshaller(PutEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutEventsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutEventsResponse::getXRequestId, PutEventsResponse::setXRequestId));
        return builder.build();
    }

}
