package com.huaweicloud.sdk.edgesec.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.edgesec.v1.model.ApplyWafPolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ApplyWafPolicyRequestBody;
import com.huaweicloud.sdk.edgesec.v1.model.ApplyWafPolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreateCertificateRequestBody;
import com.huaweicloud.sdk.edgesec.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeDDoSDomainsRequestBody;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeWafDomainsRequestBody;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreatePolicyRequestBody;
import com.huaweicloud.sdk.edgesec.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListCdnDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListCdnDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeSecSubscriptionRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeSecSubscriptionResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowCertificateRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowCertificateResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsEventRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsEventResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsTrafficRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsTrafficResponse;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateCertificateRequestBody;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeDDoSDomainsRequestBody;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeWafDomainsRequestBody;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeWafDomainsResponse;

@SuppressWarnings("unchecked")
public class EdgeSecMeta {

    public static final HttpRequestDef<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse> listEdgeSecSubscription =
        genForListEdgeSecSubscription();

    private static HttpRequestDef<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse> genForListEdgeSecSubscription() {
        // basic
        HttpRequestDef.Builder<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEdgeSecSubscriptionRequest.class, ListEdgeSecSubscriptionResponse.class)
            .withName("ListEdgeSecSubscription")
            .withUri("/v1/edgesec/subscription")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeSecSubscriptionRequest::getEnterpriseProjectId,
                ListEdgeSecSubscriptionRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse> createEdgeDDoSDomains =
        genForCreateEdgeDDoSDomains();

    private static HttpRequestDef<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse> genForCreateEdgeDDoSDomains() {
        // basic
        HttpRequestDef.Builder<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEdgeDDoSDomainsRequest.class, CreateEdgeDDoSDomainsResponse.class)
            .withName("CreateEdgeDDoSDomains")
            .withUri("/v1/edgeddos/domains")
            .withContentType("application/json");

        // requests
        builder.<CreateEdgeDDoSDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeDDoSDomainsRequestBody.class),
            f -> f.withMarshaller(CreateEdgeDDoSDomainsRequest::getBody, CreateEdgeDDoSDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse> deleteEdgeDDoSDomains =
        genForDeleteEdgeDDoSDomains();

    private static HttpRequestDef<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse> genForDeleteEdgeDDoSDomains() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEdgeDDoSDomainsRequest.class, DeleteEdgeDDoSDomainsResponse.class)
            .withName("DeleteEdgeDDoSDomains")
            .withUri("/v1/edgeddos/domains/{domainid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domainid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeDDoSDomainsRequest::getDomainid,
                DeleteEdgeDDoSDomainsRequest::setDomainid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeDDoSDomainsRequest::getEnterpriseProjectId,
                DeleteEdgeDDoSDomainsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse> listEdgeDDoSDomains =
        genForListEdgeDDoSDomains();

    private static HttpRequestDef<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse> genForListEdgeDDoSDomains() {
        // basic
        HttpRequestDef.Builder<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeDDoSDomainsRequest.class, ListEdgeDDoSDomainsResponse.class)
                .withName("ListEdgeDDoSDomains")
                .withUri("/v1/edgeddos/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeDDoSDomainsRequest::getDomainName,
                ListEdgeDDoSDomainsRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeDDoSDomainsRequest::getEnterpriseProjectId,
                ListEdgeDDoSDomainsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeDDoSDomainsRequest::getOffset, ListEdgeDDoSDomainsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeDDoSDomainsRequest::getLimit, ListEdgeDDoSDomainsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticsEventRequest, ShowStatisticsEventResponse> showStatisticsEvent =
        genForShowStatisticsEvent();

    private static HttpRequestDef<ShowStatisticsEventRequest, ShowStatisticsEventResponse> genForShowStatisticsEvent() {
        // basic
        HttpRequestDef.Builder<ShowStatisticsEventRequest, ShowStatisticsEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStatisticsEventRequest.class, ShowStatisticsEventResponse.class)
                .withName("ShowStatisticsEvent")
                .withUri("/v1/statistics/event")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStatisticsEventRequest::getStartTime, ShowStatisticsEventRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStatisticsEventRequest::getEndTime, ShowStatisticsEventRequest::setEndTime));
        builder.<ShowStatisticsEventRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowStatisticsEventRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowStatisticsEventRequest::getType, ShowStatisticsEventRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticsEventRequest::getEnterpriseProjectId,
                ShowStatisticsEventRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse> showStatisticsTraffic =
        genForShowStatisticsTraffic();

    private static HttpRequestDef<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse> genForShowStatisticsTraffic() {
        // basic
        HttpRequestDef.Builder<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowStatisticsTrafficRequest.class, ShowStatisticsTrafficResponse.class)
            .withName("ShowStatisticsTraffic")
            .withUri("/v1/statistics/traffic")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStatisticsTrafficRequest::getStartTime,
                ShowStatisticsTrafficRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStatisticsTrafficRequest::getEndTime, ShowStatisticsTrafficRequest::setEndTime));
        builder.<ShowStatisticsTrafficRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowStatisticsTrafficRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowStatisticsTrafficRequest::getType, ShowStatisticsTrafficRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticsTrafficRequest::getEnterpriseProjectId,
                ShowStatisticsTrafficRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse> updateEdgeDDoSDomains =
        genForUpdateEdgeDDoSDomains();

    private static HttpRequestDef<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse> genForUpdateEdgeDDoSDomains() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEdgeDDoSDomainsRequest.class, UpdateEdgeDDoSDomainsResponse.class)
            .withName("UpdateEdgeDDoSDomains")
            .withUri("/v1/edgeddos/domains/{domainid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domainid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeDDoSDomainsRequest::getDomainid,
                UpdateEdgeDDoSDomainsRequest::setDomainid));
        builder.<UpdateEdgeDDoSDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeDDoSDomainsRequestBody.class),
            f -> f.withMarshaller(UpdateEdgeDDoSDomainsRequest::getBody, UpdateEdgeDDoSDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyWafPolicyRequest, ApplyWafPolicyResponse> applyWafPolicy =
        genForApplyWafPolicy();

    private static HttpRequestDef<ApplyWafPolicyRequest, ApplyWafPolicyResponse> genForApplyWafPolicy() {
        // basic
        HttpRequestDef.Builder<ApplyWafPolicyRequest, ApplyWafPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyWafPolicyRequest.class, ApplyWafPolicyResponse.class)
                .withName("ApplyWafPolicy")
                .withUri("/v1/edgewaf/policies/{policy_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyWafPolicyRequest::getPolicyId, ApplyWafPolicyRequest::setPolicyId));
        builder.<ApplyWafPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyWafPolicyRequestBody.class),
            f -> f.withMarshaller(ApplyWafPolicyRequest::getBody, ApplyWafPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForCreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForCreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getProjectId, CreateCertificateRequest::setProjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getEnterpriseProjectId,
                CreateCertificateRequest::setEnterpriseProjectId));
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, CreateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse> createEdgeWafDomains =
        genForCreateEdgeWafDomains();

    private static HttpRequestDef<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse> genForCreateEdgeWafDomains() {
        // basic
        HttpRequestDef.Builder<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEdgeWafDomainsRequest.class, CreateEdgeWafDomainsResponse.class)
            .withName("CreateEdgeWafDomains")
            .withUri("/v1/edgewaf/domains")
            .withContentType("application/json");

        // requests
        builder.<CreateEdgeWafDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeWafDomainsRequestBody.class),
            f -> f.withMarshaller(CreateEdgeWafDomainsRequest::getBody, CreateEdgeWafDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForCreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyRequest::getProjectId, CreatePolicyRequest::setProjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyRequest::getEnterpriseProjectId,
                CreatePolicyRequest::setEnterpriseProjectId));
        builder.<CreatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyRequestBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, CreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genForDeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genForDeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getProjectId, DeleteCertificateRequest::setProjectId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId,
                DeleteCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getEnterpriseProjectId,
                DeleteCertificateRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse> deleteEdgeWafDomains =
        genForDeleteEdgeWafDomains();

    private static HttpRequestDef<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse> genForDeleteEdgeWafDomains() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEdgeWafDomainsRequest.class, DeleteEdgeWafDomainsResponse.class)
            .withName("DeleteEdgeWafDomains")
            .withUri("/v1/edgewaf/domains/{domainid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domainid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeWafDomainsRequest::getDomainid, DeleteEdgeWafDomainsRequest::setDomainid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeWafDomainsRequest::getEnterpriseProjectId,
                DeleteEdgeWafDomainsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getProjectId, DeletePolicyRequest::setProjectId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getEnterpriseProjectId,
                DeletePolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCdnDomainsRequest, ListCdnDomainsResponse> listCdnDomains =
        genForListCdnDomains();

    private static HttpRequestDef<ListCdnDomainsRequest, ListCdnDomainsResponse> genForListCdnDomains() {
        // basic
        HttpRequestDef.Builder<ListCdnDomainsRequest, ListCdnDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCdnDomainsRequest.class, ListCdnDomainsResponse.class)
                .withName("ListCdnDomains")
                .withUri("/v1/edgesec/cdn/domains")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCdnDomainsRequest::getOffset, ListCdnDomainsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCdnDomainsRequest::getLimit, ListCdnDomainsRequest::setLimit));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCdnDomainsRequest::getDomainName, ListCdnDomainsRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCdnDomainsRequest::getEnterpriseProjectId,
                ListCdnDomainsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForListCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForListCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getProjectId, ListCertificatesRequest::setProjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getEnterpriseProjectId,
                ListCertificatesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPage, ListCertificatesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPagesize, ListCertificatesRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, ListCertificatesRequest::setName));
        builder.<Boolean>withRequestField("host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getHost, ListCertificatesRequest::setHost));
        builder.<Integer>withRequestField("exp_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getExpStatus, ListCertificatesRequest::setExpStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse> listEdgeWafDomains =
        genForListEdgeWafDomains();

    private static HttpRequestDef<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse> genForListEdgeWafDomains() {
        // basic
        HttpRequestDef.Builder<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeWafDomainsRequest.class, ListEdgeWafDomainsResponse.class)
                .withName("ListEdgeWafDomains")
                .withUri("/v1/edgewaf/domains")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getPageNum, ListEdgeWafDomainsRequest::setPageNum));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getPageSize, ListEdgeWafDomainsRequest::setPageSize));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getDomainName, ListEdgeWafDomainsRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getEnterpriseProjectId,
                ListEdgeWafDomainsRequest::setEnterpriseProjectId));
        builder.<ListEdgeWafDomainsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEdgeWafDomainsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getType, ListEdgeWafDomainsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForListPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForListPolicy() {
        // basic
        HttpRequestDef.Builder<ListPolicyRequest, ListPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyRequest.class, ListPolicyResponse.class)
                .withName("ListPolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getProjectId, ListPolicyRequest::setProjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getEnterpriseProjectId,
                ListPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPage, ListPolicyRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPagesize, ListPolicyRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getName, ListPolicyRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForShowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForShowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getProjectId, ShowCertificateRequest::setProjectId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, ShowCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getEnterpriseProjectId,
                ShowCertificateRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse> showEdgeWafDomains =
        genForShowEdgeWafDomains();

    private static HttpRequestDef<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse> genForShowEdgeWafDomains() {
        // basic
        HttpRequestDef.Builder<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeWafDomainsRequest.class, ShowEdgeWafDomainsResponse.class)
                .withName("ShowEdgeWafDomains")
                .withUri("/v1/edgewaf/domains/{domainid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domainid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeWafDomainsRequest::getDomainid, ShowEdgeWafDomainsRequest::setDomainid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeWafDomainsRequest::getEnterpriseProjectId,
                ShowEdgeWafDomainsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForUpdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForUpdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getProjectId, UpdateCertificateRequest::setProjectId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId,
                UpdateCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getEnterpriseProjectId,
                UpdateCertificateRequest::setEnterpriseProjectId));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, UpdateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse> updateEdgeWafDomains =
        genForUpdateEdgeWafDomains();

    private static HttpRequestDef<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse> genForUpdateEdgeWafDomains() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEdgeWafDomainsRequest.class, UpdateEdgeWafDomainsResponse.class)
            .withName("UpdateEdgeWafDomains")
            .withUri("/v1/edgewaf/domains/{domainid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domainid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeWafDomainsRequest::getDomainid, UpdateEdgeWafDomainsRequest::setDomainid));
        builder.<UpdateEdgeWafDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeWafDomainsRequestBody.class),
            f -> f.withMarshaller(UpdateEdgeWafDomainsRequest::getBody, UpdateEdgeWafDomainsRequest::setBody));

        // response

        return builder.build();
    }

}
