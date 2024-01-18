package com.huaweicloud.sdk.sa.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sa.v1.model.CheckProductHealthyRequest;
import com.huaweicloud.sdk.sa.v1.model.CheckProductHealthyResponse;
import com.huaweicloud.sdk.sa.v1.model.Events;
import com.huaweicloud.sdk.sa.v1.model.ImportEventsRequest;
import com.huaweicloud.sdk.sa.v1.model.ImportEventsResponse;
import com.huaweicloud.sdk.sa.v1.model.ProductInfo;

@SuppressWarnings("unchecked")
public class SaMeta {

    public static final HttpRequestDef<CheckProductHealthyRequest, CheckProductHealthyResponse> checkProductHealthy =
        genForCheckProductHealthy();

    private static HttpRequestDef<CheckProductHealthyRequest, CheckProductHealthyResponse> genForCheckProductHealthy() {
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
            f -> f.withMarshaller(CheckProductHealthyRequest::getXLanguage, CheckProductHealthyRequest::setXLanguage));
        builder.<ProductInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProductInfo.class),
            f -> f.withMarshaller(CheckProductHealthyRequest::getBody, CheckProductHealthyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportEventsRequest, ImportEventsResponse> importEvents = genForImportEvents();

    private static HttpRequestDef<ImportEventsRequest, ImportEventsResponse> genForImportEvents() {
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
            f -> f.withMarshaller(ImportEventsRequest::getXLanguage, ImportEventsRequest::setXLanguage));
        builder.<Events>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Events.class),
            f -> f.withMarshaller(ImportEventsRequest::getBody, ImportEventsRequest::setBody));

        // response

        return builder.build();
    }

}
