package com.huaweicloud.sdk.vss.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vss.v3.model.*;

@SuppressWarnings("unchecked")
public class VssMeta {

    public static final HttpRequestDef<CreateDomainsRequest, CreateDomainsResponse> createDomains =
        genForcreateDomains();

    private static HttpRequestDef<CreateDomainsRequest, CreateDomainsResponse> genForcreateDomains() {
        // basic
        HttpRequestDef.Builder<CreateDomainsRequest, CreateDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainsRequest.class, CreateDomainsResponse.class)
                .withName("CreateDomains")
                .withUri("/v3/{project_id}/webscan/domains")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<CreateDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDomainsRequestBody.class),
            f -> f.withMarshaller(CreateDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomains =
        genFordeleteDomains();

    private static HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> genFordeleteDomains() {
        // basic
        HttpRequestDef.Builder<DeleteDomainsRequest, DeleteDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainsRequest.class, DeleteDomainsResponse.class)
                .withName("DeleteDomains")
                .withUri("/v3/{project_id}/webscan/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForlistDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForlistDomains() {
        // basic
        HttpRequestDef.Builder<ListDomainsRequest, ListDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainsRequest.class, ListDomainsResponse.class)
                .withName("ListDomains")
                .withUri("/v3/{project_id}/webscan/domains")
                .withContentType("application/json");

        // requests
        builder.<ListDomainsRequest.AuthStatusEnum>withRequestField("auth_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.AuthStatusEnum.class),
            f -> f.withMarshaller(ListDomainsRequest::getAuthStatus, (req, v) -> {
                req.setAuthStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

}
