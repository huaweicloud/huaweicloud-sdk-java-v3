package com.huaweicloud.sdk.mapds.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mapds.v1.model.CreateCredentialRequest;
import com.huaweicloud.sdk.mapds.v1.model.CreateCredentialRequestBody;
import com.huaweicloud.sdk.mapds.v1.model.CreateCredentialResponse;
import com.huaweicloud.sdk.mapds.v1.model.CreateSasTokenRequest;
import com.huaweicloud.sdk.mapds.v1.model.CreateSasTokenRequestBody;
import com.huaweicloud.sdk.mapds.v1.model.CreateSasTokenResponse;
import com.huaweicloud.sdk.mapds.v1.model.DeleteCedentialRequest;
import com.huaweicloud.sdk.mapds.v1.model.DeleteCedentialResponse;
import com.huaweicloud.sdk.mapds.v1.model.ShowCredentialRequest;
import com.huaweicloud.sdk.mapds.v1.model.ShowCredentialResponse;
import com.huaweicloud.sdk.mapds.v1.model.ShowMapTileRequest;
import com.huaweicloud.sdk.mapds.v1.model.ShowMapTileResponse;

@SuppressWarnings("unchecked")
public class MapDSMeta {

    public static final HttpRequestDef<CreateCredentialRequest, CreateCredentialResponse> createCredential =
        genForcreateCredential();

    private static HttpRequestDef<CreateCredentialRequest, CreateCredentialResponse> genForcreateCredential() {
        // basic
        HttpRequestDef.Builder<CreateCredentialRequest, CreateCredentialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCredentialRequest.class, CreateCredentialResponse.class)
                .withName("CreateCredential")
                .withUri("/v1/map/credentials")
                .withContentType("application/json");

        // requests
        builder.<CreateCredentialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateCredentialRequestBody.class),
            f -> f.withMarshaller(CreateCredentialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSasTokenRequest, CreateSasTokenResponse> createSasToken =
        genForcreateSasToken();

    private static HttpRequestDef<CreateSasTokenRequest, CreateSasTokenResponse> genForcreateSasToken() {
        // basic
        HttpRequestDef.Builder<CreateSasTokenRequest, CreateSasTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSasTokenRequest.class, CreateSasTokenResponse.class)
                .withName("CreateSasToken")
                .withUri("/v1/map/sastoken")
                .withContentType("application/json");

        // requests
        builder.<CreateSasTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSasTokenRequestBody.class),
            f -> f.withMarshaller(CreateSasTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCedentialRequest, DeleteCedentialResponse> deleteCedential =
        genFordeleteCedential();

    private static HttpRequestDef<DeleteCedentialRequest, DeleteCedentialResponse> genFordeleteCedential() {
        // basic
        HttpRequestDef.Builder<DeleteCedentialRequest, DeleteCedentialResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCedentialRequest.class, DeleteCedentialResponse.class)
                .withName("DeleteCedential")
                .withUri("/v1/map/credentials/{clientid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clientid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCedentialRequest::getClientid, (req, v) -> {
                req.setClientid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCredentialRequest, ShowCredentialResponse> showCredential =
        genForshowCredential();

    private static HttpRequestDef<ShowCredentialRequest, ShowCredentialResponse> genForshowCredential() {
        // basic
        HttpRequestDef.Builder<ShowCredentialRequest, ShowCredentialResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCredentialRequest.class, ShowCredentialResponse.class)
                .withName("ShowCredential")
                .withUri("/v1/map/credentials")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMapTileRequest, ShowMapTileResponse> showMapTile = genForshowMapTile();

    private static HttpRequestDef<ShowMapTileRequest, ShowMapTileResponse> genForshowMapTile() {
        // basic
        HttpRequestDef.Builder<ShowMapTileRequest, ShowMapTileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMapTileRequest.class, ShowMapTileResponse.class)
                .withName("ShowMapTile")
                .withUri("/v1/map/tile/{z}/{x}/{y}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("z",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMapTileRequest::getZ, (req, v) -> {
                req.setZ(v);
            }));
        builder.<Integer>withRequestField("x",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMapTileRequest::getX, (req, v) -> {
                req.setX(v);
            }));
        builder.<Integer>withRequestField("y",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMapTileRequest::getY, (req, v) -> {
                req.setY(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMapTileRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));

        // response

        builder.<String>withResponseField("Content-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMapTileResponse::getContentType, ShowMapTileResponse::setContentType));
        return builder.build();
    }

}
