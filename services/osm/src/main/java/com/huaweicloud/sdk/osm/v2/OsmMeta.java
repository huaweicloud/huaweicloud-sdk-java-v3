package com.huaweicloud.sdk.osm.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.osm.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class OsmMeta {

    public static final HttpRequestDef<CheckHostsRequest, CheckHostsResponse> checkHosts = genForcheckHosts();

    private static HttpRequestDef<CheckHostsRequest, CheckHostsResponse> genForcheckHosts() {
        // basic
        HttpRequestDef.Builder<CheckHostsRequest, CheckHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckHostsRequest.class, CheckHostsResponse.class)
                .withUri("/v2/servicerequest/authorizations/authorization-details/{authorization_detail_id}/verify-host")
                .withContentType("application/json");

        // requests
        builder.withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(CheckHostsRequest::getAuthorizationDetailId, (req, v) -> {
                req.setAuthorizationDetailId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CheckHostsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckHostsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckHostsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VerifyHostV2Req.class,
            f -> f.withMarshaller(CheckHostsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckNeedVerifyRequest, CheckNeedVerifyResponse> checkNeedVerify = genForcheckNeedVerify();

    private static HttpRequestDef<CheckNeedVerifyRequest, CheckNeedVerifyResponse> genForcheckNeedVerify() {
        // basic
        HttpRequestDef.Builder<CheckNeedVerifyRequest, CheckNeedVerifyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckNeedVerifyRequest.class, CheckNeedVerifyResponse.class)
                .withUri("/v2/servicerequest/verifycodes/need-verify")
                .withContentType("application/json");

        // requests
        builder.withRequestField("contact_value",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckNeedVerifyRequest::getContactValue, (req, v) -> {
                req.setContactValue(v);
            })
        );
        builder.withRequestField("contact_way",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(CheckNeedVerifyRequest::getContactWay, (req, v) -> {
                req.setContactWay(v);
            })
        );
        builder.withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckNeedVerifyRequest::getAreaCode, (req, v) -> {
                req.setAreaCode(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVerifyCodesRequest, CheckVerifyCodesResponse> checkVerifyCodes = genForcheckVerifyCodes();

    private static HttpRequestDef<CheckVerifyCodesRequest, CheckVerifyCodesResponse> genForcheckVerifyCodes() {
        // basic
        HttpRequestDef.Builder<CheckVerifyCodesRequest, CheckVerifyCodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckVerifyCodesRequest.class, CheckVerifyCodesResponse.class)
                .withUri("/v2/servicerequest/verifycodes/")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VerifyVerifyCodeV2Req.class,
            f -> f.withMarshaller(CheckVerifyCodesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> confirmAuthorizations = genForconfirmAuthorizations();

    private static HttpRequestDef<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> genForconfirmAuthorizations() {
        // basic
        HttpRequestDef.Builder<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ConfirmAuthorizationsRequest.class, ConfirmAuthorizationsResponse.class)
                .withUri("/v2/servicerequest/authorizations/{authorization_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AgreeTenantAuthorizationV2Req.class,
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorizationsRequest, CreateAuthorizationsResponse> createAuthorizations = genForcreateAuthorizations();

    private static HttpRequestDef<CreateAuthorizationsRequest, CreateAuthorizationsResponse> genForcreateAuthorizations() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizationsRequest, CreateAuthorizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuthorizationsRequest.class, CreateAuthorizationsResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/authorizations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAuthorizationsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateAuthorizationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAuthorizationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAuthorizationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateUserCenterAuthorizationV2Req.class,
            f -> f.withMarshaller(CreateAuthorizationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaseLabelsRequest, CreateCaseLabelsResponse> createCaseLabels = genForcreateCaseLabels();

    private static HttpRequestDef<CreateCaseLabelsRequest, CreateCaseLabelsResponse> genForcreateCaseLabels() {
        // basic
        HttpRequestDef.Builder<CreateCaseLabelsRequest, CreateCaseLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCaseLabelsRequest.class, CreateCaseLabelsResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/labels")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateCaseLabelsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("label_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(CreateCaseLabelsRequest::getLabelIds, (req, v) -> {
                req.setLabelIds(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCasesRequest, CreateCasesResponse> createCases = genForcreateCases();

    private static HttpRequestDef<CreateCasesRequest, CreateCasesResponse> genForcreateCases() {
        // basic
        HttpRequestDef.Builder<CreateCasesRequest, CreateCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCasesRequest.class, CreateCasesResponse.class)
                .withUri("/v2/servicerequest/cases")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateCasesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCasesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("x-phone-verifiedid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCasesRequest::getXPhoneVerifiedid, (req, v) -> {
                req.setXPhoneVerifiedid(v);
            })
        );
        builder.withRequestField("x-email-verifiedid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCasesRequest::getXEmailVerifiedid, (req, v) -> {
                req.setXEmailVerifiedid(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateOrderIncidentV2Req.class,
            f -> f.withMarshaller(CreateCasesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelsRequest, CreateLabelsResponse> createLabels = genForcreateLabels();

    private static HttpRequestDef<CreateLabelsRequest, CreateLabelsResponse> genForcreateLabels() {
        // basic
        HttpRequestDef.Builder<CreateLabelsRequest, CreateLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLabelsRequest.class, CreateLabelsResponse.class)
                .withUri("/v2/servicerequest/labels")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateLabelsReq.class,
            f -> f.withMarshaller(CreateLabelsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessagesRequest, CreateMessagesResponse> createMessages = genForcreateMessages();

    private static HttpRequestDef<CreateMessagesRequest, CreateMessagesResponse> genForcreateMessages() {
        // basic
        HttpRequestDef.Builder<CreateMessagesRequest, CreateMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMessagesRequest.class, CreateMessagesResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/message")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateMessagesRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateMessageV2Req.class,
            f -> f.withMarshaller(CreateMessagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivilegesRequest, CreatePrivilegesResponse> createPrivileges = genForcreatePrivileges();

    private static HttpRequestDef<CreatePrivilegesRequest, CreatePrivilegesResponse> genForcreatePrivileges() {
        // basic
        HttpRequestDef.Builder<CreatePrivilegesRequest, CreatePrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivilegesRequest.class, CreatePrivilegesResponse.class)
                .withUri("/v2/servicerequest/privileges")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreatePrivilegesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePrivilegesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePrivilegesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAndDeletePrivilegeReq.class,
            f -> f.withMarshaller(CreatePrivilegesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRelationsRequest, CreateRelationsResponse> createRelations = genForcreateRelations();

    private static HttpRequestDef<CreateRelationsRequest, CreateRelationsResponse> genForcreateRelations() {
        // basic
        HttpRequestDef.Builder<CreateRelationsRequest, CreateRelationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRelationsRequest.class, CreateRelationsResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRelationsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateRelationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRelationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRelationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRelationsReq.class,
            f -> f.withMarshaller(CreateRelationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScoresRequest, CreateScoresResponse> createScores = genForcreateScores();

    private static HttpRequestDef<CreateScoresRequest, CreateScoresResponse> genForcreateScores() {
        // basic
        HttpRequestDef.Builder<CreateScoresRequest, CreateScoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScoresRequest.class, CreateScoresResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/score")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateScoresRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateScoresRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateScoresRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateScoresRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateScoreV2Req.class,
            f -> f.withMarshaller(CreateScoresRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccessoriesRequest, DeleteAccessoriesResponse> deleteAccessories = genFordeleteAccessories();

    private static HttpRequestDef<DeleteAccessoriesRequest, DeleteAccessoriesResponse> genFordeleteAccessories() {
        // basic
        HttpRequestDef.Builder<DeleteAccessoriesRequest, DeleteAccessoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccessoriesRequest.class, DeleteAccessoriesResponse.class)
                .withUri("/v2/servicerequest/accessorys/{accessory_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("accessory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAccessoriesRequest::getAccessoryId, (req, v) -> {
                req.setAccessoryId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> deleteCaseLabels = genFordeleteCaseLabels();

    private static HttpRequestDef<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> genFordeleteCaseLabels() {
        // basic
        HttpRequestDef.Builder<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCaseLabelsRequest.class, DeleteCaseLabelsResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/labels")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("label_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getLabelIds, (req, v) -> {
                req.setLabelIds(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelsRequest, DeleteLabelsResponse> deleteLabels = genFordeleteLabels();

    private static HttpRequestDef<DeleteLabelsRequest, DeleteLabelsResponse> genFordeleteLabels() {
        // basic
        HttpRequestDef.Builder<DeleteLabelsRequest, DeleteLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLabelsRequest.class, DeleteLabelsResponse.class)
                .withUri("/v2/servicerequest/labels/{label_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("label_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteLabelsRequest::getLabelId, (req, v) -> {
                req.setLabelId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DeleteLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRelationRequest, DeleteRelationResponse> deleteRelation = genFordeleteRelation();

    private static HttpRequestDef<DeleteRelationRequest, DeleteRelationResponse> genFordeleteRelation() {
        // basic
        HttpRequestDef.Builder<DeleteRelationRequest, DeleteRelationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRelationRequest.class, DeleteRelationResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRelationRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DeleteRelationRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRelationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRelationRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteRelationsReq.class,
            f -> f.withMarshaller(DeleteRelationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAccessoriesRequest, DownloadAccessoriesResponse> downloadAccessories = genFordownloadAccessories();

    private static HttpRequestDef<DownloadAccessoriesRequest, DownloadAccessoriesResponse> genFordownloadAccessories() {
        // basic
        HttpRequestDef.Builder<DownloadAccessoriesRequest, DownloadAccessoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAccessoriesRequest.class, DownloadAccessoriesResponse.class)
                .withUri("/v2/servicerequest/accessorys/{accessory_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("accessory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadAccessoriesRequest::getAccessoryId, (req, v) -> {
                req.setAccessoryId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadAccessoriesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadCasesRequest, DownloadCasesResponse> downloadCases = genFordownloadCases();

    private static HttpRequestDef<DownloadCasesRequest, DownloadCasesResponse> genFordownloadCases() {
        // basic
        HttpRequestDef.Builder<DownloadCasesRequest, DownloadCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadCasesRequest.class, DownloadCasesResponse.class)
                .withUri("/v2/servicerequest/cases/export")
                .withContentType("application/json");

        // requests
        builder.withRequestField("language",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            })
        );
        builder.withRequestField("timezone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getTimezone, (req, v) -> {
                req.setTimezone(v);
            })
        );
        builder.withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            })
        );
        builder.withRequestField("query_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getQueryStartTime, (req, v) -> {
                req.setQueryStartTime(v);
            })
        );
        builder.withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getQueryEndTime, (req, v) -> {
                req.setQueryEndTime(v);
            })
        );
        builder.withRequestField("x_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getXCustomerName, (req, v) -> {
                req.setXCustomerName(v);
            })
        );
        builder.withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DownloadCasesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("tenant_source_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(DownloadCasesRequest::getTenantSourceIdList, (req, v) -> {
                req.setTenantSourceIdList(v);
            })
        );
        builder.withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DownloadCasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DownloadCasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DownloadCasesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadCasesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadImagesRequest, DownloadImagesResponse> downloadImages = genFordownloadImages();

    private static HttpRequestDef<DownloadImagesRequest, DownloadImagesResponse> genFordownloadImages() {
        // basic
        HttpRequestDef.Builder<DownloadImagesRequest, DownloadImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadImagesRequest.class, DownloadImagesResponse.class)
                .withUri("/v2/servicerequest/accessorys/{accessory_id}/image")
                .withContentType("application/json");

        // requests
        builder.withRequestField("accessory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadImagesRequest::getAccessoryId, (req, v) -> {
                req.setAccessoryId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadImagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DownloadImagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadImagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadImagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForlistAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForlistAgencies() {
        // basic
        HttpRequestDef.Builder<ListAgenciesRequest, ListAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgenciesRequest.class, ListAgenciesResponse.class)
                .withUri("/v2/servicerequest/agencies")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAgenciesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAgenciesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAgenciesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAreaCodesRequest, ListAreaCodesResponse> listAreaCodes = genForlistAreaCodes();

    private static HttpRequestDef<ListAreaCodesRequest, ListAreaCodesResponse> genForlistAreaCodes() {
        // basic
        HttpRequestDef.Builder<ListAreaCodesRequest, ListAreaCodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAreaCodesRequest.class, ListAreaCodesResponse.class)
                .withUri("/v2/servicerequest/config/area-codes")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAreaCodesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAreaCodesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAreaCodesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizations = genForlistAuthorizations();

    private static HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> genForlistAuthorizations() {
        // basic
        HttpRequestDef.Builder<ListAuthorizationsRequest, ListAuthorizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorizationsRequest.class, ListAuthorizationsResponse.class)
                .withUri("/v2/servicerequest/authorizations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sub_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getSubCustomerName, (req, v) -> {
                req.setSubCustomerName(v);
            })
        );
        builder.withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("simple_description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getSimpleDescription, (req, v) -> {
                req.setSimpleDescription(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCCEmailsRequest, ListCaseCCEmailsResponse> listCaseCCEmails = genForlistCaseCCEmails();

    private static HttpRequestDef<ListCaseCCEmailsRequest, ListCaseCCEmailsResponse> genForlistCaseCCEmails() {
        // basic
        HttpRequestDef.Builder<ListCaseCCEmailsRequest, ListCaseCCEmailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseCCEmailsRequest.class, ListCaseCCEmailsResponse.class)
                .withUri("/v2/servicerequest/carbon-copy-emails")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseCCEmailsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseCCEmailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseCCEmailsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCategoriesRequest, ListCaseCategoriesResponse> listCaseCategories = genForlistCaseCategories();

    private static HttpRequestDef<ListCaseCategoriesRequest, ListCaseCategoriesResponse> genForlistCaseCategories() {
        // basic
        HttpRequestDef.Builder<ListCaseCategoriesRequest, ListCaseCategoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseCategoriesRequest.class, ListCaseCategoriesResponse.class)
                .withUri("/v2/servicerequest/config/categories")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCountsRequest, ListCaseCountsResponse> listCaseCounts = genForlistCaseCounts();

    private static HttpRequestDef<ListCaseCountsRequest, ListCaseCountsResponse> genForlistCaseCounts() {
        // basic
        HttpRequestDef.Builder<ListCaseCountsRequest, ListCaseCountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseCountsRequest.class, ListCaseCountsResponse.class)
                .withUri("/v2/servicerequest/cases/count")
                .withContentType("application/json");

        // requests
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseCountsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseCountsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseCountsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseCountsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseLabelsRequest, ListCaseLabelsResponse> listCaseLabels = genForlistCaseLabels();

    private static HttpRequestDef<ListCaseLabelsRequest, ListCaseLabelsResponse> genForlistCaseLabels() {
        // basic
        HttpRequestDef.Builder<ListCaseLabelsRequest, ListCaseLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseLabelsRequest.class, ListCaseLabelsResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/labels")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCaseLabelsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseLimitsRequest, ListCaseLimitsResponse> listCaseLimits = genForlistCaseLimits();

    private static HttpRequestDef<ListCaseLimitsRequest, ListCaseLimitsResponse> genForlistCaseLimits() {
        // basic
        HttpRequestDef.Builder<ListCaseLimitsRequest, ListCaseLimitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseLimitsRequest.class, ListCaseLimitsResponse.class)
                .withUri("/v2/servicerequest/config/limits")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseLimitsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseLimitsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseLimitsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> listCaseOperateLogs = genForlistCaseOperateLogs();

    private static HttpRequestDef<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> genForlistCaseOperateLogs() {
        // basic
        HttpRequestDef.Builder<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseOperateLogsRequest.class, ListCaseOperateLogsResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/operate-logs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseQuotasRequest, ListCaseQuotasResponse> listCaseQuotas = genForlistCaseQuotas();

    private static HttpRequestDef<ListCaseQuotasRequest, ListCaseQuotasResponse> genForlistCaseQuotas() {
        // basic
        HttpRequestDef.Builder<ListCaseQuotasRequest, ListCaseQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseQuotasRequest.class, ListCaseQuotasResponse.class)
                .withUri("/v2/servicerequest/quotas")
                .withContentType("application/json");

        // requests
        builder.withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseQuotasRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            })
        );
        builder.withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCaseQuotasRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseQuotasRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseQuotasRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseTemplatesRequest, ListCaseTemplatesResponse> listCaseTemplates = genForlistCaseTemplates();

    private static HttpRequestDef<ListCaseTemplatesRequest, ListCaseTemplatesResponse> genForlistCaseTemplates() {
        // basic
        HttpRequestDef.Builder<ListCaseTemplatesRequest, ListCaseTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseTemplatesRequest.class, ListCaseTemplatesResponse.class)
                .withUri("/v2/servicerequest/config/templates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCaseTemplatesRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCasesRequest, ListCasesResponse> listCases = genForlistCases();

    private static HttpRequestDef<ListCasesRequest, ListCasesResponse> genForlistCases() {
        // basic
        HttpRequestDef.Builder<ListCasesRequest, ListCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCasesRequest.class, ListCasesResponse.class)
                .withUri("/v2/servicerequest/cases")
                .withContentType("application/json");

        // requests
        builder.withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListCasesRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("label_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListCasesRequest::getLabelIdList, (req, v) -> {
                req.setLabelIdList(v);
            })
        );
        builder.withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getAppKey, (req, v) -> {
                req.setAppKey(v);
            })
        );
        builder.withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            })
        );
        builder.withRequestField("query_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getQueryStartTime, (req, v) -> {
                req.setQueryStartTime(v);
            })
        );
        builder.withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getQueryEndTime, (req, v) -> {
                req.setQueryEndTime(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCasesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("incident_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getIncidentStatus, (req, v) -> {
                req.setIncidentStatus(v);
            })
        );
        builder.withRequestField("x_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getXCustomerId, (req, v) -> {
                req.setXCustomerId(v);
            })
        );
        builder.withRequestField("x_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getXCustomerName, (req, v) -> {
                req.setXCustomerName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCasesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCasesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExtendsParamsRequest, ListExtendsParamsResponse> listExtendsParams = genForlistExtendsParams();

    private static HttpRequestDef<ListExtendsParamsRequest, ListExtendsParamsResponse> genForlistExtendsParams() {
        // basic
        HttpRequestDef.Builder<ListExtendsParamsRequest, ListExtendsParamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExtendsParamsRequest.class, ListExtendsParamsResponse.class)
                .withUri("/v2/servicerequest/config/extends-map")
                .withContentType("application/json");

        // requests
        builder.withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListExtendsParamsRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            })
        );
        builder.withRequestField("incident_sub_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExtendsParamsRequest::getIncidentSubTypeId, (req, v) -> {
                req.setIncidentSubTypeId(v);
            })
        );
        builder.withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExtendsParamsRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListExtendsParamsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExtendsParamsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExtendsParamsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> listHasVerifiedContacts = genForlistHasVerifiedContacts();

    private static HttpRequestDef<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> genForlistHasVerifiedContacts() {
        // basic
        HttpRequestDef.Builder<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHasVerifiedContactsRequest.class, ListHasVerifiedContactsResponse.class)
                .withUri("/v2/servicerequest/verifycodes/has-verified")
                .withContentType("application/json");

        // requests
        builder.withRequestField("contact_way",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getContactWay, (req, v) -> {
                req.setContactWay(v);
            })
        );
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            })
        );
        builder.withRequestField("expired_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getExpiredTime, (req, v) -> {
                req.setExpiredTime(v);
            })
        );
        builder.withRequestField("verified_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getVerifiedId, (req, v) -> {
                req.setVerifiedId(v);
            })
        );
        builder.withRequestField("contact_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getContactValue, (req, v) -> {
                req.setContactValue(v);
            })
        );
        builder.withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getAreaCode, (req, v) -> {
                req.setAreaCode(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> listHistoryOperateLogs = genForlistHistoryOperateLogs();

    private static HttpRequestDef<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> genForlistHistoryOperateLogs() {
        // basic
        HttpRequestDef.Builder<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistoryOperateLogsRequest.class, ListHistoryOperateLogsResponse.class)
                .withUri("/v2/servicerequest/authorizations/{authorization_id}/authorization-details/{authorization_detail_id}/sessions/{session_id}/operation-logs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            })
        );
        builder.withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getAuthorizationDetailId, (req, v) -> {
                req.setAuthorizationDetailId(v);
            })
        );
        builder.withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getSort, (req, v) -> {
                req.setSort(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistorySessionsRequest, ListHistorySessionsResponse> listHistorySessions = genForlistHistorySessions();

    private static HttpRequestDef<ListHistorySessionsRequest, ListHistorySessionsResponse> genForlistHistorySessions() {
        // basic
        HttpRequestDef.Builder<ListHistorySessionsRequest, ListHistorySessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistorySessionsRequest.class, ListHistorySessionsResponse.class)
                .withUri("/v2/servicerequest/authorizations/{authorization_id}/authorization-details/{authorization_detail_id}/history-sessions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListHistorySessionsRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            })
        );
        builder.withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListHistorySessionsRequest::getAuthorizationDetailId, (req, v) -> {
                req.setAuthorizationDetailId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistorySessionsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistorySessionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistorySessionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistorySessionsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistorySessionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistorySessionsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelsRequest, ListLabelsResponse> listLabels = genForlistLabels();

    private static HttpRequestDef<ListLabelsRequest, ListLabelsResponse> genForlistLabels() {
        // basic
        HttpRequestDef.Builder<ListLabelsRequest, ListLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLabelsRequest.class, ListLabelsResponse.class)
                .withUri("/v2/servicerequest/labels")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLabelsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLabelsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLabelsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("label_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLabelsRequest::getLabelId, (req, v) -> {
                req.setLabelId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessagesRequest, ListMessagesResponse> listMessages = genForlistMessages();

    private static HttpRequestDef<ListMessagesRequest, ListMessagesResponse> genForlistMessages() {
        // basic
        HttpRequestDef.Builder<ListMessagesRequest, ListMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessagesRequest.class, ListMessagesResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/messages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMessagesRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMessagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMessagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> listMoreInstantMessages = genForlistMoreInstantMessages();

    private static HttpRequestDef<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> genForlistMoreInstantMessages() {
        // basic
        HttpRequestDef.Builder<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMoreInstantMessagesRequest.class, ListMoreInstantMessagesResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/instant-messages/more")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("create_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getCreateTime, (req, v) -> {
                req.setCreateTime(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> listNewInstantMessages = genForlistNewInstantMessages();

    private static HttpRequestDef<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> genForlistNewInstantMessages() {
        // basic
        HttpRequestDef.Builder<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNewInstantMessagesRequest.class, ListNewInstantMessagesResponse.class)
                .withUri("/v2/servicerequest/cases/instant-messages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getCaseIds, (req, v) -> {
                req.setCaseIds(v);
            })
        );
        builder.withRequestField("last_message_time_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getLastMessageTimeId, (req, v) -> {
                req.setLastMessageTimeId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivilegesRequest, ListPrivilegesResponse> listPrivileges = genForlistPrivileges();

    private static HttpRequestDef<ListPrivilegesRequest, ListPrivilegesResponse> genForlistPrivileges() {
        // basic
        HttpRequestDef.Builder<ListPrivilegesRequest, ListPrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivilegesRequest.class, ListPrivilegesResponse.class)
                .withUri("/v2/servicerequest/privileges")
                .withContentType("application/json");

        // requests
        builder.withRequestField("privilege",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPrivilegesRequest::getPrivilege, (req, v) -> {
                req.setPrivilege(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPrivilegesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPrivilegesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPrivilegesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProblemTypesRequest, ListProblemTypesResponse> listProblemTypes = genForlistProblemTypes();

    private static HttpRequestDef<ListProblemTypesRequest, ListProblemTypesResponse> genForlistProblemTypes() {
        // basic
        HttpRequestDef.Builder<ListProblemTypesRequest, ListProblemTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProblemTypesRequest.class, ListProblemTypesResponse.class)
                .withUri("/v2/servicerequest/config/problems")
                .withContentType("application/json");

        // requests
        builder.withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProblemTypesRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProblemTypesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProblemTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProblemTypesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductCategoriesRequest, ListProductCategoriesResponse> listProductCategories = genForlistProductCategories();

    private static HttpRequestDef<ListProductCategoriesRequest, ListProductCategoriesResponse> genForlistProductCategories() {
        // basic
        HttpRequestDef.Builder<ListProductCategoriesRequest, ListProductCategoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductCategoriesRequest.class, ListProductCategoriesResponse.class)
                .withUri("/v2/servicerequest/config/product-categories")
                .withContentType("application/json");

        // requests
        builder.withRequestField("product_category_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductCategoriesRequest::getProductCategoryName, (req, v) -> {
                req.setProductCategoryName(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductCategoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductCategoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductCategoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForlistRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForlistRegions() {
        // basic
        HttpRequestDef.Builder<ListRegionsRequest, ListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRegionsRequest.class, ListRegionsResponse.class)
                .withUri("/v2/servicerequest/config/regions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRegionsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRegionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRegionsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationRequest, ListRelationResponse> listRelation = genForlistRelation();

    private static HttpRequestDef<ListRelationRequest, ListRelationResponse> genForlistRelation() {
        // basic
        HttpRequestDef.Builder<ListRelationRequest, ListRelationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelationRequest.class, ListRelationResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRelationRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRelationRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRelationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRelationRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> listSatisfactionDimensions = genForlistSatisfactionDimensions();

    private static HttpRequestDef<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> genForlistSatisfactionDimensions() {
        // basic
        HttpRequestDef.Builder<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSatisfactionDimensionsRequest.class, ListSatisfactionDimensionsResponse.class)
                .withUri("/v2/servicerequest/config/satisfaction-dimensions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSeveritiesRequest, ListSeveritiesResponse> listSeverities = genForlistSeverities();

    private static HttpRequestDef<ListSeveritiesRequest, ListSeveritiesResponse> genForlistSeverities() {
        // basic
        HttpRequestDef.Builder<ListSeveritiesRequest, ListSeveritiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSeveritiesRequest.class, ListSeveritiesResponse.class)
                .withUri("/v2/servicerequest/config/severities")
                .withContentType("application/json");

        // requests
        builder.withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSeveritiesRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            })
        );
        builder.withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSeveritiesRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSeveritiesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSeveritiesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSeveritiesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomers = genForlistSubCustomers();

    private static HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> genForlistSubCustomers() {
        // basic
        HttpRequestDef.Builder<ListSubCustomersRequest, ListSubCustomersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubCustomersRequest.class, ListSubCustomersResponse.class)
                .withUri("/v2/servicerequest/customers/sub-customers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sub_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomersRequest::getSubCustomerName, (req, v) -> {
                req.setSubCustomerName(v);
            })
        );
        builder.withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomersRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubCustomersRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomersRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransportHistoriesRequest, ListTransportHistoriesResponse> listTransportHistories = genForlistTransportHistories();

    private static HttpRequestDef<ListTransportHistoriesRequest, ListTransportHistoriesResponse> genForlistTransportHistories() {
        // basic
        HttpRequestDef.Builder<ListTransportHistoriesRequest, ListTransportHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTransportHistoriesRequest.class, ListTransportHistoriesResponse.class)
                .withUri("/v2/servicerequest/authorizations/{authorization_id}/authorization-details/{authorization_detail_id}/sessions/{session_id}/operation-file-logs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            })
        );
        builder.withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getAuthorizationDetailId, (req, v) -> {
                req.setAuthorizationDetailId(v);
            })
        );
        builder.withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getSort, (req, v) -> {
                req.setSort(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> listUnreadNewInstantMessages = genForlistUnreadNewInstantMessages();

    private static HttpRequestDef<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> genForlistUnreadNewInstantMessages() {
        // basic
        HttpRequestDef.Builder<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUnreadNewInstantMessagesRequest.class, ListUnreadNewInstantMessagesResponse.class)
                .withUri("/v2/servicerequest/cases/instant-messages/unread")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getCaseIds, (req, v) -> {
                req.setCaseIds(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVerifyCodesRequest, SendVerifyCodesResponse> sendVerifyCodes = genForsendVerifyCodes();

    private static HttpRequestDef<SendVerifyCodesRequest, SendVerifyCodesResponse> genForsendVerifyCodes() {
        // basic
        HttpRequestDef.Builder<SendVerifyCodesRequest, SendVerifyCodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SendVerifyCodesRequest.class, SendVerifyCodesResponse.class)
                .withUri("/v2/servicerequest/verifycodes/")
                .withContentType("application/json");

        // requests
        builder.withRequestField("contact_value",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SendVerifyCodesRequest::getContactValue, (req, v) -> {
                req.setContactValue(v);
            })
        );
        builder.withRequestField("contact_way",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(SendVerifyCodesRequest::getContactWay, (req, v) -> {
                req.setContactWay(v);
            })
        );
        builder.withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendVerifyCodesRequest::getAreaCode, (req, v) -> {
                req.setAreaCode(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SendVerifyCodesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendVerifyCodesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendVerifyCodesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> showAccessoryLimits = genForshowAccessoryLimits();

    private static HttpRequestDef<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> genForshowAccessoryLimits() {
        // basic
        HttpRequestDef.Builder<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessoryLimitsRequest.class, ShowAccessoryLimitsResponse.class)
                .withUri("/v2/servicerequest/accessorys/limits")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> showAuthorizationDetail = genForshowAuthorizationDetail();

    private static HttpRequestDef<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> genForshowAuthorizationDetail() {
        // basic
        HttpRequestDef.Builder<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuthorizationDetailRequest.class, ShowAuthorizationDetailResponse.class)
                .withUri("/v2/servicerequest/authorizations/{authorization_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseDetailRequest, ShowCaseDetailResponse> showCaseDetail = genForshowCaseDetail();

    private static HttpRequestDef<ShowCaseDetailRequest, ShowCaseDetailResponse> genForshowCaseDetail() {
        // basic
        HttpRequestDef.Builder<ShowCaseDetailRequest, ShowCaseDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCaseDetailRequest.class, ShowCaseDetailResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCaseDetailRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCaseDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCaseDetailRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCaseDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCaseDetailRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseStatusRequest, ShowCaseStatusResponse> showCaseStatus = genForshowCaseStatus();

    private static HttpRequestDef<ShowCaseStatusRequest, ShowCaseStatusResponse> genForshowCaseStatus() {
        // basic
        HttpRequestDef.Builder<ShowCaseStatusRequest, ShowCaseStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCaseStatusRequest.class, ShowCaseStatusResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCaseStatusRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCaseStatusRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCaseStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCaseStatusRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartnersCasesProcessingPrivilegeRequest, ShowPartnersCasesProcessingPrivilegeResponse> showPartnersCasesProcessingPrivilege = genForshowPartnersCasesProcessingPrivilege();

    private static HttpRequestDef<ShowPartnersCasesProcessingPrivilegeRequest, ShowPartnersCasesProcessingPrivilegeResponse> genForshowPartnersCasesProcessingPrivilege() {
        // basic
        HttpRequestDef.Builder<ShowPartnersCasesProcessingPrivilegeRequest, ShowPartnersCasesProcessingPrivilegeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartnersCasesProcessingPrivilegeRequest.class, ShowPartnersCasesProcessingPrivilegeResponse.class)
                .withUri("/v2/servicerequest/cases/partners/privilege/cases-processing")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowPartnersCasesProcessingPrivilegeRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPartnersCasesProcessingPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPartnersCasesProcessingPrivilegeRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> showPartnersServiceInfo = genForshowPartnersServiceInfo();

    private static HttpRequestDef<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> genForshowPartnersServiceInfo() {
        // basic
        HttpRequestDef.Builder<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartnersServiceInfoRequest.class, ShowPartnersServiceInfoResponse.class)
                .withUri("/v2/servicerequest/cases/partners/service-info")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_sub_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getCaseSubTypeId, (req, v) -> {
                req.setCaseSubTypeId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> updateAuthorizations = genForupdateAuthorizations();

    private static HttpRequestDef<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> genForupdateAuthorizations() {
        // basic
        HttpRequestDef.Builder<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAuthorizationsRequest.class, UpdateAuthorizationsResponse.class)
                .withUri("/v2/servicerequest/authorizations/{authorization_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            })
        );
        builder.withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateAuthorizationV2Req.class,
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCasesRequest, UpdateCasesResponse> updateCases = genForupdateCases();

    private static HttpRequestDef<UpdateCasesRequest, UpdateCasesResponse> genForupdateCases() {
        // basic
        HttpRequestDef.Builder<UpdateCasesRequest, UpdateCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCasesRequest.class, UpdateCasesResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCasesRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCasesRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(UpdateCasesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateCasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateCasesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            WorkOrderOperateV2Req.class,
            f -> f.withMarshaller(UpdateCasesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLabelsRequest, UpdateLabelsResponse> updateLabels = genForupdateLabels();

    private static HttpRequestDef<UpdateLabelsRequest, UpdateLabelsResponse> genForupdateLabels() {
        // basic
        HttpRequestDef.Builder<UpdateLabelsRequest, UpdateLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLabelsRequest.class, UpdateLabelsResponse.class)
                .withUri("/v2/servicerequest/labels/{label_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("label_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateLabelsRequest::getLabelId, (req, v) -> {
                req.setLabelId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(UpdateLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateLabelsReq.class,
            f -> f.withMarshaller(UpdateLabelsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> updateNewInstantMessagesRead = genForupdateNewInstantMessagesRead();

    private static HttpRequestDef<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> genForupdateNewInstantMessagesRead() {
        // basic
        HttpRequestDef.Builder<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateNewInstantMessagesReadRequest.class, UpdateNewInstantMessagesReadResponse.class)
                .withUri("/v2/servicerequest/cases/{case_id}/instant-messages/unread")
                .withContentType("application/json");

        // requests
        builder.withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            })
        );
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateUnreadNewInstantMsgV2Req.class,
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> uploadJsonAccessories = genForuploadJsonAccessories();

    private static HttpRequestDef<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> genForuploadJsonAccessories() {
        // basic
        HttpRequestDef.Builder<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadJsonAccessoriesRequest.class, UploadJsonAccessoriesResponse.class)
                .withUri("/v2/servicerequest/accessorys/json-format-content")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AccessoryJsonFormatReq.class,
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
