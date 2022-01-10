package com.huaweicloud.sdk.expert.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.expert.v1.model.*;

@SuppressWarnings("unchecked")
public class ExpertMeta {

    public static final HttpRequestDef<ListRecordsCountRequest, ListRecordsCountResponse> listRecordsCount =
        genForlistRecordsCount();

    private static HttpRequestDef<ListRecordsCountRequest, ListRecordsCountResponse> genForlistRecordsCount() {
        // basic
        HttpRequestDef.Builder<ListRecordsCountRequest, ListRecordsCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListRecordsCountRequest.class, ListRecordsCountResponse.class)
                .withName("ListRecordsCount")
                .withUri("/v1/papers/records-count")
                .withContentType("application/json");

        // requests
        builder.<Papers>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Papers.class),
            f -> f.withMarshaller(ListRecordsCountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersKeyRequest, ListUsersKeyResponse> listUsersKey = genForlistUsersKey();

    private static HttpRequestDef<ListUsersKeyRequest, ListUsersKeyResponse> genForlistUsersKey() {
        // basic
        HttpRequestDef.Builder<ListUsersKeyRequest, ListUsersKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersKeyRequest.class, ListUsersKeyResponse.class)
                .withName("ListUsersKey")
                .withUri("/v1/paper/{paper_id}/applet/{applet_key}/users-key")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("applet_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersKeyRequest::getAppletKey, (req, v) -> {
                req.setAppletKey(v);
            }));
        builder.<String>withRequestField("paper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersKeyRequest::getPaperId, (req, v) -> {
                req.setPaperId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersKeyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersKeyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

}
