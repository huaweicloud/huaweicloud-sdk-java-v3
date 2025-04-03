package com.huaweicloud.sdk.identitycenterportalapi.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.GetAgencyCredentialsRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.GetAgencyCredentialsResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountAgenciesRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountAgenciesResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountsRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountsResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.LogoutRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.LogoutResponse;

@SuppressWarnings("unchecked")
public class IdentityCenterPortalAPIMeta {

    public static final HttpRequestDef<ListAccountsRequest, ListAccountsResponse> listAccounts = genForListAccounts();

    private static HttpRequestDef<ListAccountsRequest, ListAccountsResponse> genForListAccounts() {
        // basic
        HttpRequestDef.Builder<ListAccountsRequest, ListAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccountsRequest.class, ListAccountsResponse.class)
                .withName("ListAccounts")
                .withUri("/v1/assigned-accounts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsRequest::getLimit, ListAccountsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getMarker, ListAccountsRequest::setMarker));
        builder.<String>withRequestField("access-token",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getAccessToken, ListAccountsRequest::setAccessToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAgenciesRequest, ListAccountAgenciesResponse> listAccountAgencies =
        genForListAccountAgencies();

    private static HttpRequestDef<ListAccountAgenciesRequest, ListAccountAgenciesResponse> genForListAccountAgencies() {
        // basic
        HttpRequestDef.Builder<ListAccountAgenciesRequest, ListAccountAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccountAgenciesRequest.class, ListAccountAgenciesResponse.class)
                .withName("ListAccountAgencies")
                .withUri("/v1/assigned-agencies")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAgenciesRequest::getLimit, ListAccountAgenciesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAgenciesRequest::getMarker, ListAccountAgenciesRequest::setMarker));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAgenciesRequest::getAccountId, ListAccountAgenciesRequest::setAccountId));
        builder.<String>withRequestField("access-token",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAgenciesRequest::getAccessToken,
                ListAccountAgenciesRequest::setAccessToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetAgencyCredentialsRequest, GetAgencyCredentialsResponse> getAgencyCredentials =
        genForGetAgencyCredentials();

    private static HttpRequestDef<GetAgencyCredentialsRequest, GetAgencyCredentialsResponse> genForGetAgencyCredentials() {
        // basic
        HttpRequestDef.Builder<GetAgencyCredentialsRequest, GetAgencyCredentialsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetAgencyCredentialsRequest.class, GetAgencyCredentialsResponse.class)
            .withName("GetAgencyCredentials")
            .withUri("/v1/credentials")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("target_account_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetAgencyCredentialsRequest::getTargetAccountId,
                GetAgencyCredentialsRequest::setTargetAccountId));
        builder.<String>withRequestField("agency_urn",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetAgencyCredentialsRequest::getAgencyUrn,
                GetAgencyCredentialsRequest::setAgencyUrn));
        builder.<String>withRequestField("access-token",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetAgencyCredentialsRequest::getAccessToken,
                GetAgencyCredentialsRequest::setAccessToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LogoutRequest, LogoutResponse> logout = genForLogout();

    private static HttpRequestDef<LogoutRequest, LogoutResponse> genForLogout() {
        // basic
        HttpRequestDef.Builder<LogoutRequest, LogoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LogoutRequest.class, LogoutResponse.class)
                .withName("Logout")
                .withUri("/v1/logout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access-token",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LogoutRequest::getAccessToken, LogoutRequest::setAccessToken));

        // response

        return builder.build();
    }

}
