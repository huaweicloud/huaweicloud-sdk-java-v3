package com.huaweicloud.sdk.identitycenteroidc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.CreateTokenReqBody;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.CreateTokenRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.CreateTokenResponse;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.RegisterClientReqBody;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.RegisterClientRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.RegisterClientResponse;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.StartDeviceAuthorizationReqBody;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.StartDeviceAuthorizationRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.StartDeviceAuthorizationResponse;

@SuppressWarnings("unchecked")
public class IdentityCenterOIDCMeta {

    public static final HttpRequestDef<RegisterClientRequest, RegisterClientResponse> registerClient =
        genForRegisterClient();

    private static HttpRequestDef<RegisterClientRequest, RegisterClientResponse> genForRegisterClient() {
        // basic
        HttpRequestDef.Builder<RegisterClientRequest, RegisterClientResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterClientRequest.class, RegisterClientResponse.class)
                .withName("RegisterClient")
                .withUri("/v1/clients")
                .withContentType("application/json");

        // requests
        builder.<RegisterClientReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterClientReqBody.class),
            f -> f.withMarshaller(RegisterClientRequest::getBody, RegisterClientRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResponse> startDeviceAuthorization =
        genForStartDeviceAuthorization();

    private static HttpRequestDef<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResponse> genForStartDeviceAuthorization() {
        // basic
        HttpRequestDef.Builder<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, StartDeviceAuthorizationRequest.class, StartDeviceAuthorizationResponse.class)
                .withName("StartDeviceAuthorization")
                .withUri("/v1/device/authorize")
                .withContentType("application/json");

        // requests
        builder.<StartDeviceAuthorizationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartDeviceAuthorizationReqBody.class),
            f -> f.withMarshaller(StartDeviceAuthorizationRequest::getBody, StartDeviceAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTokenRequest, CreateTokenResponse> createToken = genForCreateToken();

    private static HttpRequestDef<CreateTokenRequest, CreateTokenResponse> genForCreateToken() {
        // basic
        HttpRequestDef.Builder<CreateTokenRequest, CreateTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTokenRequest.class, CreateTokenResponse.class)
                .withName("CreateToken")
                .withUri("/v1/tokens")
                .withContentType("application/json");

        // requests
        builder.<CreateTokenReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTokenReqBody.class),
            f -> f.withMarshaller(CreateTokenRequest::getBody, CreateTokenRequest::setBody));

        // response

        return builder.build();
    }

}
