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
        genForlistEdgeSecSubscription();

    private static HttpRequestDef<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse> genForlistEdgeSecSubscription() {
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
            f -> f.withMarshaller(ListEdgeSecSubscriptionRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse> createEdgeDDoSDomains =
        genForcreateEdgeDDoSDomains();

    private static HttpRequestDef<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse> genForcreateEdgeDDoSDomains() {
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
            f -> f.withMarshaller(CreateEdgeDDoSDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse> deleteEdgeDDoSDomains =
        genFordeleteEdgeDDoSDomains();

    private static HttpRequestDef<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse> genFordeleteEdgeDDoSDomains() {
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
            f -> f.withMarshaller(DeleteEdgeDDoSDomainsRequest::getDomainid, (req, v) -> {
                req.setDomainid(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeDDoSDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse> listEdgeDDoSDomains =
        genForlistEdgeDDoSDomains();

    private static HttpRequestDef<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse> genForlistEdgeDDoSDomains() {
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
            f -> f.withMarshaller(ListEdgeDDoSDomainsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeDDoSDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeDDoSDomainsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeDDoSDomainsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticsEventRequest, ShowStatisticsEventResponse> showStatisticsEvent =
        genForshowStatisticsEvent();

    private static HttpRequestDef<ShowStatisticsEventRequest, ShowStatisticsEventResponse> genForshowStatisticsEvent() {
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
            f -> f.withMarshaller(ShowStatisticsEventRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStatisticsEventRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowStatisticsEventRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowStatisticsEventRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowStatisticsEventRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticsEventRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse> showStatisticsTraffic =
        genForshowStatisticsTraffic();

    private static HttpRequestDef<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse> genForshowStatisticsTraffic() {
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
            f -> f.withMarshaller(ShowStatisticsTrafficRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStatisticsTrafficRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowStatisticsTrafficRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowStatisticsTrafficRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowStatisticsTrafficRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticsTrafficRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse> updateEdgeDDoSDomains =
        genForupdateEdgeDDoSDomains();

    private static HttpRequestDef<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse> genForupdateEdgeDDoSDomains() {
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
            f -> f.withMarshaller(UpdateEdgeDDoSDomainsRequest::getDomainid, (req, v) -> {
                req.setDomainid(v);
            }));
        builder.<UpdateEdgeDDoSDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeDDoSDomainsRequestBody.class),
            f -> f.withMarshaller(UpdateEdgeDDoSDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyWafPolicyRequest, ApplyWafPolicyResponse> applyWafPolicy =
        genForapplyWafPolicy();

    private static HttpRequestDef<ApplyWafPolicyRequest, ApplyWafPolicyResponse> genForapplyWafPolicy() {
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
            f -> f.withMarshaller(ApplyWafPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<ApplyWafPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyWafPolicyRequestBody.class),
            f -> f.withMarshaller(ApplyWafPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
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
            f -> f.withMarshaller(CreateCertificateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse> createEdgeWafDomains =
        genForcreateEdgeWafDomains();

    private static HttpRequestDef<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse> genForcreateEdgeWafDomains() {
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
            f -> f.withMarshaller(CreateEdgeWafDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForcreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForcreatePolicy() {
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
            f -> f.withMarshaller(CreatePolicyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyRequestBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
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
            f -> f.withMarshaller(DeleteCertificateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse> deleteEdgeWafDomains =
        genFordeleteEdgeWafDomains();

    private static HttpRequestDef<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse> genFordeleteEdgeWafDomains() {
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
            f -> f.withMarshaller(DeleteEdgeWafDomainsRequest::getDomainid, (req, v) -> {
                req.setDomainid(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeWafDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genFordeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genFordeletePolicy() {
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
            f -> f.withMarshaller(DeletePolicyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCdnDomainsRequest, ListCdnDomainsResponse> listCdnDomains =
        genForlistCdnDomains();

    private static HttpRequestDef<ListCdnDomainsRequest, ListCdnDomainsResponse> genForlistCdnDomains() {
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
            f -> f.withMarshaller(ListCdnDomainsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCdnDomainsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCdnDomainsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCdnDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
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
            f -> f.withMarshaller(ListCertificatesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getHost, (req, v) -> {
                req.setHost(v);
            }));
        builder.<Integer>withRequestField("exp_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getExpStatus, (req, v) -> {
                req.setExpStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse> listEdgeWafDomains =
        genForlistEdgeWafDomains();

    private static HttpRequestDef<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse> genForlistEdgeWafDomains() {
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
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getPageNum, (req, v) -> {
                req.setPageNum(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<ListEdgeWafDomainsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEdgeWafDomainsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListEdgeWafDomainsRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForlistPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForlistPolicy() {
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
            f -> f.withMarshaller(ListPolicyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForshowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForshowCertificate() {
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
            f -> f.withMarshaller(ShowCertificateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse> showEdgeWafDomains =
        genForshowEdgeWafDomains();

    private static HttpRequestDef<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse> genForshowEdgeWafDomains() {
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
            f -> f.withMarshaller(ShowEdgeWafDomainsRequest::getDomainid, (req, v) -> {
                req.setDomainid(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeWafDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForupdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForupdateCertificate() {
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
            f -> f.withMarshaller(UpdateCertificateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse> updateEdgeWafDomains =
        genForupdateEdgeWafDomains();

    private static HttpRequestDef<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse> genForupdateEdgeWafDomains() {
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
            f -> f.withMarshaller(UpdateEdgeWafDomainsRequest::getDomainid, (req, v) -> {
                req.setDomainid(v);
            }));
        builder.<UpdateEdgeWafDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeWafDomainsRequestBody.class),
            f -> f.withMarshaller(UpdateEdgeWafDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
