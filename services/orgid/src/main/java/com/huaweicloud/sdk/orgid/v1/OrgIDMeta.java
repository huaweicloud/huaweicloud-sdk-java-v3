package com.huaweicloud.sdk.orgid.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2TokenRequest;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2TokenRequestBody;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2TokenResponse;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2UserInfoRequest;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2UserInfoResponse;
import com.huaweicloud.sdk.orgid.v1.model.ValidateServiceRequest;
import com.huaweicloud.sdk.orgid.v1.model.ValidateServiceResponse;

@SuppressWarnings("unchecked")
public class OrgIDMeta {

    public static final HttpRequestDef<ValidateServiceRequest, ValidateServiceResponse> validateService =
        genForValidateService();

    private static HttpRequestDef<ValidateServiceRequest, ValidateServiceResponse> genForValidateService() {
        // basic
        HttpRequestDef.Builder<ValidateServiceRequest, ValidateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ValidateServiceRequest.class, ValidateServiceResponse.class)
                .withName("ValidateService")
                .withUri("/orgid/openapi/v1/cas/p3/serviceValidate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateServiceRequest::getService, ValidateServiceRequest::setService));
        builder.<String>withRequestField("ticket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateServiceRequest::getTicket, ValidateServiceRequest::setTicket));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOauth2TokenRequest, ShowOauth2TokenResponse> showOauth2Token =
        genForShowOauth2Token();

    private static HttpRequestDef<ShowOauth2TokenRequest, ShowOauth2TokenResponse> genForShowOauth2Token() {
        // basic
        HttpRequestDef.Builder<ShowOauth2TokenRequest, ShowOauth2TokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowOauth2TokenRequest.class, ShowOauth2TokenResponse.class)
                .withName("ShowOauth2Token")
                .withUri("/orgid/openapi/v1/oauth2/token")
                .withContentType("multipart/form-data");

        // requests
        builder.<ShowOauth2TokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowOauth2TokenRequestBody.class),
            f -> f.withMarshaller(ShowOauth2TokenRequest::getBody, ShowOauth2TokenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOauth2UserInfoRequest, ShowOauth2UserInfoResponse> showOauth2UserInfo =
        genForShowOauth2UserInfo();

    private static HttpRequestDef<ShowOauth2UserInfoRequest, ShowOauth2UserInfoResponse> genForShowOauth2UserInfo() {
        // basic
        HttpRequestDef.Builder<ShowOauth2UserInfoRequest, ShowOauth2UserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOauth2UserInfoRequest.class, ShowOauth2UserInfoResponse.class)
                .withName("ShowOauth2UserInfo")
                .withUri("/orgid/openapi/v1/oauth2/userinfo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-OrgID-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOauth2UserInfoRequest::getXOrgIDAuthorization,
                ShowOauth2UserInfoRequest::setXOrgIDAuthorization));

        // response

        return builder.build();
    }

}
