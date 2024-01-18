package com.huaweicloud.sdk.eg.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eg.v2.model.PutEventsReq;
import com.huaweicloud.sdk.eg.v2.model.PutEventsRequest;
import com.huaweicloud.sdk.eg.v2.model.PutEventsResponse;
import com.huaweicloud.sdk.eg.v2.model.PutOfficialEventsRequest;
import com.huaweicloud.sdk.eg.v2.model.PutOfficialEventsResponse;

@SuppressWarnings("unchecked")
public class EgMeta {

    public static final HttpRequestDef<PutEventsRequest, PutEventsResponse> putEvents = genForPutEvents();

    private static HttpRequestDef<PutEventsRequest, PutEventsResponse> genForPutEvents() {
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
            f -> f.withMarshaller(PutEventsRequest::getChannelId, PutEventsRequest::setChannelId));
        builder.<PutEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutEventsReq.class),
            f -> f.withMarshaller(PutEventsRequest::getBody, PutEventsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutEventsResponse::getBody, PutEventsResponse::setBody));

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutEventsResponse::getXRequestId, PutEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<PutOfficialEventsRequest, PutOfficialEventsResponse> putOfficialEvents =
        genForPutOfficialEvents();

    private static HttpRequestDef<PutOfficialEventsRequest, PutOfficialEventsResponse> genForPutOfficialEvents() {
        // basic
        HttpRequestDef.Builder<PutOfficialEventsRequest, PutOfficialEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PutOfficialEventsRequest.class, PutOfficialEventsResponse.class)
                .withName("PutOfficialEvents")
                .withUri("/v1/{project_id}/official/sources/{source_name}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutOfficialEventsRequest::getSourceName, PutOfficialEventsRequest::setSourceName));
        builder.<PutEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutEventsReq.class),
            f -> f.withMarshaller(PutOfficialEventsRequest::getBody, PutOfficialEventsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutOfficialEventsResponse::getBody, PutOfficialEventsResponse::setBody));

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutOfficialEventsResponse::getXRequestId, PutOfficialEventsResponse::setXRequestId));
        return builder.build();
    }

}
