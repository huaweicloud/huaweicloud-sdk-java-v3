package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainsResponse;

@SuppressWarnings("unchecked")
public class EdgeSecMeta {

    public static final HttpRequestDef<CreateDomainsRequest, CreateDomainsResponse> createDomains =
        genForCreateDomains();

    private static HttpRequestDef<CreateDomainsRequest, CreateDomainsResponse> genForCreateDomains() {
        // basic
        HttpRequestDef.Builder<CreateDomainsRequest, CreateDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainsRequest.class, CreateDomainsResponse.class)
                .withName("CreateDomains")
                .withUri("/v1/edgesec/configuration/domains")
                .withContentType("application/json");

        // requests
        builder.<CreateDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDomainRequestBody.class),
            f -> f.withMarshaller(CreateDomainsRequest::getBody, CreateDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomains =
        genForDeleteDomains();

    private static HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> genForDeleteDomains() {
        // basic
        HttpRequestDef.Builder<DeleteDomainsRequest, DeleteDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainsRequest.class, DeleteDomainsResponse.class)
                .withName("DeleteDomains")
                .withUri("/v1/edgesec/configuration/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getDomainId, DeleteDomainsRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getEnterpriseProjectId,
                DeleteDomainsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetail =
        genForShowDomainDetail();

    private static HttpRequestDef<ShowDomainDetailRequest, ShowDomainDetailResponse> genForShowDomainDetail() {
        // basic
        HttpRequestDef.Builder<ShowDomainDetailRequest, ShowDomainDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainDetailRequest.class, ShowDomainDetailResponse.class)
                .withName("ShowDomainDetail")
                .withUri("/v1/edgesec/configuration/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailRequest::getDomainId, ShowDomainDetailRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainsRequest, ShowDomainsResponse> showDomains = genForShowDomains();

    private static HttpRequestDef<ShowDomainsRequest, ShowDomainsResponse> genForShowDomains() {
        // basic
        HttpRequestDef.Builder<ShowDomainsRequest, ShowDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainsRequest.class, ShowDomainsResponse.class)
                .withName("ShowDomains")
                .withUri("/v1/edgesec/configuration/domains")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDomainsRequest::getOffset, ShowDomainsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDomainsRequest::getLimit, ShowDomainsRequest::setLimit));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainsRequest::getDomainName, ShowDomainsRequest::setDomainName));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainsRequest::getPolicyName, ShowDomainsRequest::setPolicyName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainsRequest::getEnterpriseProjectId,
                ShowDomainsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainsRequest, UpdateDomainsResponse> updateDomains =
        genForUpdateDomains();

    private static HttpRequestDef<UpdateDomainsRequest, UpdateDomainsResponse> genForUpdateDomains() {
        // basic
        HttpRequestDef.Builder<UpdateDomainsRequest, UpdateDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainsRequest.class, UpdateDomainsResponse.class)
                .withName("UpdateDomains")
                .withUri("/v1/edgesec/configuration/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainsRequest::getDomainId, UpdateDomainsRequest::setDomainId));
        builder.<UpdateDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainRequestBody.class),
            f -> f.withMarshaller(UpdateDomainsRequest::getBody, UpdateDomainsRequest::setBody));

        // response

        return builder.build();
    }

}
