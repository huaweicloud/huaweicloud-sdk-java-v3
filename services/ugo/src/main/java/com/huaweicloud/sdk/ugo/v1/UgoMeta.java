package com.huaweicloud.sdk.ugo.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ugo.v1.model.*;

@SuppressWarnings("unchecked")
public class UgoMeta {

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<ShowApiVersionRequest.ApiVersionEnum>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApiVersionRequest.ApiVersionEnum.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateSqlStatementRequest, MigrateSqlStatementResponse> migrateSqlStatement =
        genFormigrateSqlStatement();

    private static HttpRequestDef<MigrateSqlStatementRequest, MigrateSqlStatementResponse> genFormigrateSqlStatement() {
        // basic
        HttpRequestDef.Builder<MigrateSqlStatementRequest, MigrateSqlStatementResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateSqlStatementRequest.class, MigrateSqlStatementResponse.class)
                .withName("MigrateSqlStatement")
                .withUri("/v1/{project_id}/migration/sql-convert")
                .withContentType("application/json");

        // requests
        builder.<SqlConvertReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlConvertReq.class),
            f -> f.withMarshaller(MigrateSqlStatementRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
