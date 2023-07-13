package com.huaweicloud.sdk.secmaster.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.secmaster.v1.model.CheckProductHealthyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CheckProductHealthyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.Events;
import com.huaweicloud.sdk.secmaster.v1.model.ImportEventsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportEventsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ProductInfo;

@SuppressWarnings("unchecked")
public class SecMasterMeta {

    public static final HttpRequestDef<CheckProductHealthyRequest, CheckProductHealthyResponse> checkProductHealthy =
        genForcheckProductHealthy();

    private static HttpRequestDef<CheckProductHealthyRequest, CheckProductHealthyResponse> genForcheckProductHealthy() {
        // basic
        HttpRequestDef.Builder<CheckProductHealthyRequest, CheckProductHealthyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckProductHealthyRequest.class, CheckProductHealthyResponse.class)
                .withName("CheckProductHealthy")
                .withUri("/v1/{project_id}/products/health-check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckProductHealthyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ProductInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProductInfo.class),
            f -> f.withMarshaller(CheckProductHealthyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportEventsRequest, ImportEventsResponse> importEvents = genForimportEvents();

    private static HttpRequestDef<ImportEventsRequest, ImportEventsResponse> genForimportEvents() {
        // basic
        HttpRequestDef.Builder<ImportEventsRequest, ImportEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportEventsRequest.class, ImportEventsResponse.class)
                .withName("ImportEvents")
                .withUri("/v2/{project_id}/events/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportEventsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<Events>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Events.class),
            f -> f.withMarshaller(ImportEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
