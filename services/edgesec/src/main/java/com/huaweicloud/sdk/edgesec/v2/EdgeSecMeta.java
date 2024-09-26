package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPoliciesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPoliciesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusResponse;

@SuppressWarnings("unchecked")
public class EdgeSecMeta {

    public static final HttpRequestDef<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> applyHttpPolicy =
        genForApplyHttpPolicy();

    private static HttpRequestDef<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> genForApplyHttpPolicy() {
        // basic
        HttpRequestDef.Builder<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyHttpPolicyRequest.class, ApplyHttpPolicyResponse.class)
                .withName("ApplyHttpPolicy")
                .withUri("/v1/edgesec/http/policies/{policy_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyHttpPolicyRequest::getPolicyId, ApplyHttpPolicyRequest::setPolicyId));
        builder.<ApplyHttpPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyHttpPolicyRequestBody.class),
            f -> f.withMarshaller(ApplyHttpPolicyRequest::getBody, ApplyHttpPolicyRequest::setBody));

        // response

        return builder.build();
    }

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

    public static final HttpRequestDef<CreateHttpPolicyRequest, CreateHttpPolicyResponse> createHttpPolicy =
        genForCreateHttpPolicy();

    private static HttpRequestDef<CreateHttpPolicyRequest, CreateHttpPolicyResponse> genForCreateHttpPolicy() {
        // basic
        HttpRequestDef.Builder<CreateHttpPolicyRequest, CreateHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHttpPolicyRequest.class, CreateHttpPolicyResponse.class)
                .withName("CreateHttpPolicy")
                .withUri("/v1/edgesec/http/policies")
                .withContentType("application/json");

        // requests
        builder.<CreateHttpPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHttpPolicyRequestBody.class),
            f -> f.withMarshaller(CreateHttpPolicyRequest::getBody, CreateHttpPolicyRequest::setBody));

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

    public static final HttpRequestDef<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> deleteHttpPolicy =
        genForDeleteHttpPolicy();

    private static HttpRequestDef<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> genForDeleteHttpPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHttpPolicyRequest.class, DeleteHttpPolicyResponse.class)
                .withName("DeleteHttpPolicy")
                .withUri("/v1/edgesec/http/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpPolicyRequest::getPolicyId, DeleteHttpPolicyRequest::setPolicyId));

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

    public static final HttpRequestDef<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> showHttpPolicies =
        genForShowHttpPolicies();

    private static HttpRequestDef<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> genForShowHttpPolicies() {
        // basic
        HttpRequestDef.Builder<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpPoliciesRequest.class, ShowHttpPoliciesResponse.class)
                .withName("ShowHttpPolicies")
                .withUri("/v1/edgesec/http/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getEnterpriseProjectId,
                ShowHttpPoliciesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getPage, ShowHttpPoliciesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getPagesize, ShowHttpPoliciesRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getName, ShowHttpPoliciesRequest::setName));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getHostname, ShowHttpPoliciesRequest::setHostname));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpPolicyRequest, ShowHttpPolicyResponse> showHttpPolicy =
        genForShowHttpPolicy();

    private static HttpRequestDef<ShowHttpPolicyRequest, ShowHttpPolicyResponse> genForShowHttpPolicy() {
        // basic
        HttpRequestDef.Builder<ShowHttpPolicyRequest, ShowHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpPolicyRequest.class, ShowHttpPolicyResponse.class)
                .withName("ShowHttpPolicy")
                .withUri("/v1/edgesec/http/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPolicyRequest::getPolicyId, ShowHttpPolicyRequest::setPolicyId));

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

    public static final HttpRequestDef<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> updateHttpPolicy =
        genForUpdateHttpPolicy();

    private static HttpRequestDef<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> genForUpdateHttpPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHttpPolicyRequest.class, UpdateHttpPolicyResponse.class)
                .withName("UpdateHttpPolicy")
                .withUri("/v1/edgesec/http/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPolicyRequest::getPolicyId, UpdateHttpPolicyRequest::setPolicyId));
        builder.<UpdateHttpPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHttpPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateHttpPolicyRequest::getBody, UpdateHttpPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> updateHttpPolicyRuleStatus =
        genForUpdateHttpPolicyRuleStatus();

    private static HttpRequestDef<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> genForUpdateHttpPolicyRuleStatus() {
        // basic
        HttpRequestDef.Builder<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHttpPolicyRuleStatusRequest.class,
                    UpdateHttpPolicyRuleStatusResponse.class)
                .withName("UpdateHttpPolicyRuleStatus")
                .withUri("/v1/edgesec/http/policies/{policy_id}/{rule_type}/{rule_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPolicyRuleStatusRequest::getPolicyId,
                UpdateHttpPolicyRuleStatusRequest::setPolicyId));
        builder.<String>withRequestField("rule_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPolicyRuleStatusRequest::getRuleType,
                UpdateHttpPolicyRuleStatusRequest::setRuleType));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPolicyRuleStatusRequest::getRuleId,
                UpdateHttpPolicyRuleStatusRequest::setRuleId));
        builder.<UpdateHttpPolicyRuleStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHttpPolicyRuleStatusRequestBody.class),
            f -> f.withMarshaller(UpdateHttpPolicyRuleStatusRequest::getBody,
                UpdateHttpPolicyRuleStatusRequest::setBody));

        // response

        return builder.build();
    }

}
