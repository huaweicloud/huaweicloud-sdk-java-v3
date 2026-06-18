package com.huaweicloud.sdk.sts.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyReqBody;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyRequest;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyResponse;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithOIDCReqBody;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithOIDCRequest;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithOIDCResponse;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithSAMLReqBody;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithSAMLRequest;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithSAMLResponse;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageReq;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageRequest;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageResponse;
import com.huaweicloud.sdk.sts.v1.model.GetCallerIdentityRequest;
import com.huaweicloud.sdk.sts.v1.model.GetCallerIdentityResponse;

@SuppressWarnings("unchecked")
public class StsMeta {

    public static final HttpRequestDef<AssumeAgencyRequest, AssumeAgencyResponse> assumeAgency = genForAssumeAgency();

    private static HttpRequestDef<AssumeAgencyRequest, AssumeAgencyResponse> genForAssumeAgency() {
        // basic
        HttpRequestDef.Builder<AssumeAgencyRequest, AssumeAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssumeAgencyRequest.class, AssumeAgencyResponse.class)
                .withName("AssumeAgency")
                .withUri("/v5/agencies/assume")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssumeAgencyRequest::getXSecurityToken, AssumeAgencyRequest::setXSecurityToken));
        builder.<AssumeAgencyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssumeAgencyReqBody.class),
            f -> f.withMarshaller(AssumeAgencyRequest::getBody, AssumeAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssumeAgencyWithOIDCRequest, AssumeAgencyWithOIDCResponse> assumeAgencyWithOIDC =
        genForAssumeAgencyWithOIDC();

    private static HttpRequestDef<AssumeAgencyWithOIDCRequest, AssumeAgencyWithOIDCResponse> genForAssumeAgencyWithOIDC() {
        // basic
        HttpRequestDef.Builder<AssumeAgencyWithOIDCRequest, AssumeAgencyWithOIDCResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssumeAgencyWithOIDCRequest.class, AssumeAgencyWithOIDCResponse.class)
            .withName("AssumeAgencyWithOIDC")
            .withUri("/v5/agencies/assume-with-oidc")
            .withContentType("application/json");

        // requests
        builder.<AssumeAgencyWithOIDCReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssumeAgencyWithOIDCReqBody.class),
            f -> f.withMarshaller(AssumeAgencyWithOIDCRequest::getBody, AssumeAgencyWithOIDCRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssumeAgencyWithSAMLRequest, AssumeAgencyWithSAMLResponse> assumeAgencyWithSAML =
        genForAssumeAgencyWithSAML();

    private static HttpRequestDef<AssumeAgencyWithSAMLRequest, AssumeAgencyWithSAMLResponse> genForAssumeAgencyWithSAML() {
        // basic
        HttpRequestDef.Builder<AssumeAgencyWithSAMLRequest, AssumeAgencyWithSAMLResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssumeAgencyWithSAMLRequest.class, AssumeAgencyWithSAMLResponse.class)
            .withName("AssumeAgencyWithSAML")
            .withUri("/v5/agencies/assume-with-saml")
            .withContentType("application/json");

        // requests
        builder.<AssumeAgencyWithSAMLReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssumeAgencyWithSAMLReqBody.class),
            f -> f.withMarshaller(AssumeAgencyWithSAMLRequest::getBody, AssumeAgencyWithSAMLRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse> decodeAuthorizationMessage =
        genForDecodeAuthorizationMessage();

    private static HttpRequestDef<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse> genForDecodeAuthorizationMessage() {
        // basic
        HttpRequestDef.Builder<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DecodeAuthorizationMessageRequest.class,
                    DecodeAuthorizationMessageResponse.class)
                .withName("DecodeAuthorizationMessage")
                .withUri("/v5/decode-authorization-message")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DecodeAuthorizationMessageRequest::getXSecurityToken,
                DecodeAuthorizationMessageRequest::setXSecurityToken));
        builder.<DecodeAuthorizationMessageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DecodeAuthorizationMessageReq.class),
            f -> f.withMarshaller(DecodeAuthorizationMessageRequest::getBody,
                DecodeAuthorizationMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetCallerIdentityRequest, GetCallerIdentityResponse> getCallerIdentity =
        genForGetCallerIdentity();

    private static HttpRequestDef<GetCallerIdentityRequest, GetCallerIdentityResponse> genForGetCallerIdentity() {
        // basic
        HttpRequestDef.Builder<GetCallerIdentityRequest, GetCallerIdentityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetCallerIdentityRequest.class, GetCallerIdentityResponse.class)
                .withName("GetCallerIdentity")
                .withUri("/v5/caller-identity")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCallerIdentityRequest::getXSecurityToken,
                GetCallerIdentityRequest::setXSecurityToken));

        // response

        return builder.build();
    }

}
