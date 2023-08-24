package com.huaweicloud.sdk.osm.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.osm.v2.model.AccessoryJsonFormatReq;
import com.huaweicloud.sdk.osm.v2.model.AgreeTenantAuthorizationV2Req;
import com.huaweicloud.sdk.osm.v2.model.AskQuestionReq;
import com.huaweicloud.sdk.osm.v2.model.CheckHostsRequest;
import com.huaweicloud.sdk.osm.v2.model.CheckHostsResponse;
import com.huaweicloud.sdk.osm.v2.model.CheckNeedVerifyRequest;
import com.huaweicloud.sdk.osm.v2.model.CheckNeedVerifyResponse;
import com.huaweicloud.sdk.osm.v2.model.CheckVerifyCodesRequest;
import com.huaweicloud.sdk.osm.v2.model.CheckVerifyCodesResponse;
import com.huaweicloud.sdk.osm.v2.model.ConfirmAuthorizationsRequest;
import com.huaweicloud.sdk.osm.v2.model.ConfirmAuthorizationsResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateAndDeletePrivilegeReq;
import com.huaweicloud.sdk.osm.v2.model.CreateAskQuestionRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateAskQuestionResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateCaseExtendsParamRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateCaseExtendsParamResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateCaseLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateCaseLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateCasesRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateCasesResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateDiagnoseFeedbackRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateDiagnoseFeedbackResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateDiagnoseJobRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateDiagnoseJobResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateEvaluateRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateEvaluateResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateFeedbackReq;
import com.huaweicloud.sdk.osm.v2.model.CreateFeedbackRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateFeedbackResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateFeedbackV2Req;
import com.huaweicloud.sdk.osm.v2.model.CreateLabelsReq;
import com.huaweicloud.sdk.osm.v2.model.CreateLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateMessageV2Req;
import com.huaweicloud.sdk.osm.v2.model.CreateMessagesRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateMessagesResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateOrderIncidentV2Req;
import com.huaweicloud.sdk.osm.v2.model.CreatePrivilegesRequest;
import com.huaweicloud.sdk.osm.v2.model.CreatePrivilegesResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateQaAskRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateQaAskResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateQaFeedbacksRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateQaFeedbacksResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateQuestionInSessionRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateQuestionInSessionResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateRelationsReq;
import com.huaweicloud.sdk.osm.v2.model.CreateRelationsRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateRelationsResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateScoreV2Req;
import com.huaweicloud.sdk.osm.v2.model.CreateScoresRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateScoresResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateSessionRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateSessionResponse;
import com.huaweicloud.sdk.osm.v2.model.DeleteAccessoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.DeleteAccessoriesResponse;
import com.huaweicloud.sdk.osm.v2.model.DeleteCaseLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.DeleteCaseLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.DeleteLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.DeleteLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.DeleteRelationRequest;
import com.huaweicloud.sdk.osm.v2.model.DeleteRelationResponse;
import com.huaweicloud.sdk.osm.v2.model.DeleteRelationsReq;
import com.huaweicloud.sdk.osm.v2.model.DownloadAccessoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.DownloadAccessoriesResponse;
import com.huaweicloud.sdk.osm.v2.model.DownloadCasesRequest;
import com.huaweicloud.sdk.osm.v2.model.DownloadCasesResponse;
import com.huaweicloud.sdk.osm.v2.model.DownloadImagesRequest;
import com.huaweicloud.sdk.osm.v2.model.DownloadImagesResponse;
import com.huaweicloud.sdk.osm.v2.model.EvaluateRequestReq;
import com.huaweicloud.sdk.osm.v2.model.ListAccessoryAccessUrlsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListAccessoryAccessUrlsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListAgenciesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListAgenciesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListAreaCodesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListAreaCodesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListArticlesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListArticlesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListAuthorizationsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListAuthorizationsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCaseCategoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCaseCategoriesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCaseCcEmailsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCaseCcEmailsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCaseCountsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCaseCountsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCaseLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCaseLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCaseLimitsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCaseLimitsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCaseOperateLogsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCaseOperateLogsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCaseQuotasRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCaseQuotasResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCaseTemplatesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCaseTemplatesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCasesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCasesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListCustomersRegionsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListCustomersRegionsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListDiagnoseItemsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListDiagnoseItemsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListDiagnoseJobRequest;
import com.huaweicloud.sdk.osm.v2.model.ListDiagnoseJobResponse;
import com.huaweicloud.sdk.osm.v2.model.ListDiagnoseRecordsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListDiagnoseRecordsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListDiagnoseResourcesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListDiagnoseResourcesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListExtendsParamsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListExtendsParamsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListFeedbackOptionRequest;
import com.huaweicloud.sdk.osm.v2.model.ListFeedbackOptionResponse;
import com.huaweicloud.sdk.osm.v2.model.ListHasVerifiedContactsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListHasVerifiedContactsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListHistoryOperateLogsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListHistoryOperateLogsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListHistorySessionsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListHistorySessionsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListMessagesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListMessagesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListMoreInstantMessagesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListMoreInstantMessagesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListNewInstantMessagesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListNewInstantMessagesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListNoticesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListNoticesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListOrderIncidentRequest;
import com.huaweicloud.sdk.osm.v2.model.ListOrderIncidentResponse;
import com.huaweicloud.sdk.osm.v2.model.ListPrivilegesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListPrivilegesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListProblemTypesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListProblemTypesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListProductCategoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListProductCategoriesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListRecommendWordsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListRecommendWordsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListRegionsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListRegionsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListRelationRequest;
import com.huaweicloud.sdk.osm.v2.model.ListRelationResponse;
import com.huaweicloud.sdk.osm.v2.model.ListSatisfactionDimensionsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListSatisfactionDimensionsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListSeveritiesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListSeveritiesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListSubCustomersRequest;
import com.huaweicloud.sdk.osm.v2.model.ListSubCustomersResponse;
import com.huaweicloud.sdk.osm.v2.model.ListToolsRequest;
import com.huaweicloud.sdk.osm.v2.model.ListToolsResponse;
import com.huaweicloud.sdk.osm.v2.model.ListTransportHistoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListTransportHistoriesResponse;
import com.huaweicloud.sdk.osm.v2.model.ListUnreadNewInstantMessagesRequest;
import com.huaweicloud.sdk.osm.v2.model.ListUnreadNewInstantMessagesResponse;
import com.huaweicloud.sdk.osm.v2.model.OperateAuthorizationV2Req;
import com.huaweicloud.sdk.osm.v2.model.PutCaseExtParamReq;
import com.huaweicloud.sdk.osm.v2.model.QaAskReq;
import com.huaweicloud.sdk.osm.v2.model.QaFeedbackReq;
import com.huaweicloud.sdk.osm.v2.model.QueryAssociatedQuestionReq;
import com.huaweicloud.sdk.osm.v2.model.QueryDiagnoseItemsReq;
import com.huaweicloud.sdk.osm.v2.model.QueryTscDiagnoseResourcesReq;
import com.huaweicloud.sdk.osm.v2.model.RevokeMessageRequest;
import com.huaweicloud.sdk.osm.v2.model.RevokeMessageResponse;
import com.huaweicloud.sdk.osm.v2.model.SearchArticlesReq;
import com.huaweicloud.sdk.osm.v2.model.SearchNoticesReq;
import com.huaweicloud.sdk.osm.v2.model.SearchQaPairsReq;
import com.huaweicloud.sdk.osm.v2.model.SearchToolsReq;
import com.huaweicloud.sdk.osm.v2.model.SendVerifyCodeReq;
import com.huaweicloud.sdk.osm.v2.model.SendVerifyCodesRequest;
import com.huaweicloud.sdk.osm.v2.model.SendVerifyCodesResponse;
import com.huaweicloud.sdk.osm.v2.model.SessionAskQuestionReq;
import com.huaweicloud.sdk.osm.v2.model.ShowAccessoryLimitsRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowAccessoryLimitsResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowAssociatedQuestionsRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowAssociatedQuestionsResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowAuthorizationDetailRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowAuthorizationDetailResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowCaseDetailRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowCaseDetailResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowCaseExtendsParamRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowCaseExtendsParamResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowCaseStatusRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowCaseStatusResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowConfigurationRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowConfigurationResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowCustomerPrivilegePolicyRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowCustomerPrivilegePolicyResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowDownloadAccessoryUrlRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowDownloadAccessoryUrlResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowLatestPublishedAgreementRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowLatestPublishedAgreementResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowLoginTypeRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowLoginTypeResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowPartnersCasesPrivilegeRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowPartnersCasesPrivilegeResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowPartnersServiceInfoRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowPartnersServiceInfoResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowQaPairDetailRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowQaPairDetailResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowQaPairsRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowQaPairsResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowSignedLatestPublishedAgreementRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowSignedLatestPublishedAgreementResponse;
import com.huaweicloud.sdk.osm.v2.model.ShowThemeRequest;
import com.huaweicloud.sdk.osm.v2.model.ShowThemeResponse;
import com.huaweicloud.sdk.osm.v2.model.SignAgreementReq;
import com.huaweicloud.sdk.osm.v2.model.SignPublishedAgreementRequest;
import com.huaweicloud.sdk.osm.v2.model.SignPublishedAgreementResponse;
import com.huaweicloud.sdk.osm.v2.model.SubmitDiagnoseJobReq;
import com.huaweicloud.sdk.osm.v2.model.UpdateAuthorizationsRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateAuthorizationsResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateCaseContactInfoReq;
import com.huaweicloud.sdk.osm.v2.model.UpdateCaseContactInfoRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateCaseContactInfoResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateCasesRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateCasesResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateLabelsReq;
import com.huaweicloud.sdk.osm.v2.model.UpdateLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateNewInstantMessagesReadRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateNewInstantMessagesReadResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateUnreadNewInstantMsgV2Req;
import com.huaweicloud.sdk.osm.v2.model.UploadJsonAccessoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.UploadJsonAccessoriesResponse;
import com.huaweicloud.sdk.osm.v2.model.VerifyHostV2Req;
import com.huaweicloud.sdk.osm.v2.model.VerifyVerifyCodeV2Req;
import com.huaweicloud.sdk.osm.v2.model.WorkOrderOperateV2Req;

import java.util.List;

@SuppressWarnings("unchecked")
public class OsmMeta {

    public static final HttpRequestDef<CheckHostsRequest, CheckHostsResponse> checkHosts = genForcheckHosts();

    private static HttpRequestDef<CheckHostsRequest, CheckHostsResponse> genForcheckHosts() {
        // basic
        HttpRequestDef.Builder<CheckHostsRequest, CheckHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckHostsRequest.class, CheckHostsResponse.class)
                .withName("CheckHosts")
                .withUri(
                    "/v2/servicerequest/authorizations/authorization-details/{authorization_detail_id}/verify-host")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(CheckHostsRequest::getAuthorizationDetailId, (req, v) -> {
                req.setAuthorizationDetailId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckHostsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckHostsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckHostsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<VerifyHostV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(VerifyHostV2Req.class),
            f -> f.withMarshaller(CheckHostsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckNeedVerifyRequest, CheckNeedVerifyResponse> checkNeedVerify =
        genForcheckNeedVerify();

    private static HttpRequestDef<CheckNeedVerifyRequest, CheckNeedVerifyResponse> genForcheckNeedVerify() {
        // basic
        HttpRequestDef.Builder<CheckNeedVerifyRequest, CheckNeedVerifyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckNeedVerifyRequest.class, CheckNeedVerifyResponse.class)
                .withName("CheckNeedVerify")
                .withUri("/v2/servicerequest/verifycodes/need-verify")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("contact_value",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getContactValue, (req, v) -> {
                req.setContactValue(v);
            }));
        builder.<Integer>withRequestField("contact_way",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getContactWay, (req, v) -> {
                req.setContactWay(v);
            }));
        builder.<String>withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getAreaCode, (req, v) -> {
                req.setAreaCode(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVerifyCodesRequest, CheckVerifyCodesResponse> checkVerifyCodes =
        genForcheckVerifyCodes();

    private static HttpRequestDef<CheckVerifyCodesRequest, CheckVerifyCodesResponse> genForcheckVerifyCodes() {
        // basic
        HttpRequestDef.Builder<CheckVerifyCodesRequest, CheckVerifyCodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckVerifyCodesRequest.class, CheckVerifyCodesResponse.class)
                .withName("CheckVerifyCodes")
                .withUri("/v2/servicerequest/verifycodes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<VerifyVerifyCodeV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(VerifyVerifyCodeV2Req.class),
            f -> f.withMarshaller(CheckVerifyCodesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> confirmAuthorizations =
        genForconfirmAuthorizations();

    private static HttpRequestDef<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> genForconfirmAuthorizations() {
        // basic
        HttpRequestDef.Builder<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ConfirmAuthorizationsRequest.class, ConfirmAuthorizationsResponse.class)
            .withName("ConfirmAuthorizations")
            .withUri("/v2/servicerequest/authorizations/{authorization_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<AgreeTenantAuthorizationV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AgreeTenantAuthorizationV2Req.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAskQuestionRequest, CreateAskQuestionResponse> createAskQuestion =
        genForcreateAskQuestion();

    private static HttpRequestDef<CreateAskQuestionRequest, CreateAskQuestionResponse> genForcreateAskQuestion() {
        // basic
        HttpRequestDef.Builder<CreateAskQuestionRequest, CreateAskQuestionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAskQuestionRequest.class, CreateAskQuestionResponse.class)
                .withName("CreateAskQuestion")
                .withUri("/v2/irobot/qapairs/ask")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAskQuestionRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAskQuestionRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAskQuestionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<AskQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AskQuestionReq.class),
            f -> f.withMarshaller(CreateAskQuestionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse> createCaseExtendsParam =
        genForcreateCaseExtendsParam();

    private static HttpRequestDef<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse> genForcreateCaseExtendsParam() {
        // basic
        HttpRequestDef.Builder<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCaseExtendsParamRequest.class, CreateCaseExtendsParamResponse.class)
            .withName("CreateCaseExtendsParam")
            .withUri("/v2/servicerequest/cases/{case_id}/extends-param")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<PutCaseExtParamReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutCaseExtParamReq.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaseLabelsRequest, CreateCaseLabelsResponse> createCaseLabels =
        genForcreateCaseLabels();

    private static HttpRequestDef<CreateCaseLabelsRequest, CreateCaseLabelsResponse> genForcreateCaseLabels() {
        // basic
        HttpRequestDef.Builder<CreateCaseLabelsRequest, CreateCaseLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCaseLabelsRequest.class, CreateCaseLabelsResponse.class)
                .withName("CreateCaseLabels")
                .withUri("/v2/servicerequest/cases/{case_id}/labels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<List<Integer>>withRequestField("label_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getLabelIds, (req, v) -> {
                req.setLabelIds(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCasesRequest, CreateCasesResponse> createCases = genForcreateCases();

    private static HttpRequestDef<CreateCasesRequest, CreateCasesResponse> genForcreateCases() {
        // basic
        HttpRequestDef.Builder<CreateCasesRequest, CreateCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCasesRequest.class, CreateCasesResponse.class)
                .withName("CreateCases")
                .withUri("/v2/servicerequest/cases")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCasesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCasesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<String>withRequestField("x-phone-verifiedid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCasesRequest::getXPhoneVerifiedid, (req, v) -> {
                req.setXPhoneVerifiedid(v);
            }));
        builder.<String>withRequestField("x-email-verifiedid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCasesRequest::getXEmailVerifiedid, (req, v) -> {
                req.setXEmailVerifiedid(v);
            }));
        builder.<CreateOrderIncidentV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateOrderIncidentV2Req.class),
            f -> f.withMarshaller(CreateCasesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse> createDiagnoseFeedback =
        genForcreateDiagnoseFeedback();

    private static HttpRequestDef<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse> genForcreateDiagnoseFeedback() {
        // basic
        HttpRequestDef.Builder<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDiagnoseFeedbackRequest.class, CreateDiagnoseFeedbackResponse.class)
            .withName("CreateDiagnoseFeedback")
            .withUri("/v2.0/servicerequest/diagnose/feedback")
            .withContentType("application/json");

        // requests
        builder.<CreateFeedbackReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateFeedbackReq.class),
            f -> f.withMarshaller(CreateDiagnoseFeedbackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse> createDiagnoseJob =
        genForcreateDiagnoseJob();

    private static HttpRequestDef<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse> genForcreateDiagnoseJob() {
        // basic
        HttpRequestDef.Builder<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDiagnoseJobRequest.class, CreateDiagnoseJobResponse.class)
                .withName("CreateDiagnoseJob")
                .withUri("/v2.0/servicerequest/diagnose/job/start")
                .withContentType("application/json");

        // requests
        builder.<SubmitDiagnoseJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SubmitDiagnoseJobReq.class),
            f -> f.withMarshaller(CreateDiagnoseJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEvaluateRequest, CreateEvaluateResponse> createEvaluate =
        genForcreateEvaluate();

    private static HttpRequestDef<CreateEvaluateRequest, CreateEvaluateResponse> genForcreateEvaluate() {
        // basic
        HttpRequestDef.Builder<CreateEvaluateRequest, CreateEvaluateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEvaluateRequest.class, CreateEvaluateResponse.class)
                .withName("CreateEvaluate")
                .withUri("/v2/irobot/sessions/{session_id}/{request_id}/evaluate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            }));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<EvaluateRequestReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EvaluateRequestReq.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFeedbackRequest, CreateFeedbackResponse> createFeedback =
        genForcreateFeedback();

    private static HttpRequestDef<CreateFeedbackRequest, CreateFeedbackResponse> genForcreateFeedback() {
        // basic
        HttpRequestDef.Builder<CreateFeedbackRequest, CreateFeedbackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFeedbackRequest.class, CreateFeedbackResponse.class)
                .withName("CreateFeedback")
                .withUri("/v2/servicerequest/feedbacks")
                .withContentType("application/json");

        // requests
        builder.<CreateFeedbackV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateFeedbackV2Req.class),
            f -> f.withMarshaller(CreateFeedbackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelsRequest, CreateLabelsResponse> createLabels = genForcreateLabels();

    private static HttpRequestDef<CreateLabelsRequest, CreateLabelsResponse> genForcreateLabels() {
        // basic
        HttpRequestDef.Builder<CreateLabelsRequest, CreateLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLabelsRequest.class, CreateLabelsResponse.class)
                .withName("CreateLabels")
                .withUri("/v2/servicerequest/labels")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<CreateLabelsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLabelsReq.class),
            f -> f.withMarshaller(CreateLabelsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessagesRequest, CreateMessagesResponse> createMessages =
        genForcreateMessages();

    private static HttpRequestDef<CreateMessagesRequest, CreateMessagesResponse> genForcreateMessages() {
        // basic
        HttpRequestDef.Builder<CreateMessagesRequest, CreateMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMessagesRequest.class, CreateMessagesResponse.class)
                .withName("CreateMessages")
                .withUri("/v2/servicerequest/cases/{case_id}/message")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessagesRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<CreateMessageV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateMessageV2Req.class),
            f -> f.withMarshaller(CreateMessagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivilegesRequest, CreatePrivilegesResponse> createPrivileges =
        genForcreatePrivileges();

    private static HttpRequestDef<CreatePrivilegesRequest, CreatePrivilegesResponse> genForcreatePrivileges() {
        // basic
        HttpRequestDef.Builder<CreatePrivilegesRequest, CreatePrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivilegesRequest.class, CreatePrivilegesResponse.class)
                .withName("CreatePrivileges")
                .withUri("/v2/servicerequest/privileges")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreatePrivilegesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivilegesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivilegesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<CreateAndDeletePrivilegeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAndDeletePrivilegeReq.class),
            f -> f.withMarshaller(CreatePrivilegesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQaAskRequest, CreateQaAskResponse> createQaAsk = genForcreateQaAsk();

    private static HttpRequestDef<CreateQaAskRequest, CreateQaAskResponse> genForcreateQaAsk() {
        // basic
        HttpRequestDef.Builder<CreateQaAskRequest, CreateQaAskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQaAskRequest.class, CreateQaAskResponse.class)
                .withName("CreateQaAsk")
                .withUri("/v2/irobot/ask")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaAskRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaAskRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaAskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QaAskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QaAskReq.class),
            f -> f.withMarshaller(CreateQaAskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse> createQaFeedbacks =
        genForcreateQaFeedbacks();

    private static HttpRequestDef<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse> genForcreateQaFeedbacks() {
        // basic
        HttpRequestDef.Builder<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQaFeedbacksRequest.class, CreateQaFeedbacksResponse.class)
                .withName("CreateQaFeedbacks")
                .withUri("/v2/irobot/feedbacks")
                .withContentType("application/json");

        // requests
        builder.<CreateQaFeedbacksRequest.FeedbackTypeEnum>withRequestField("feedback_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateQaFeedbacksRequest.FeedbackTypeEnum.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getFeedbackType, (req, v) -> {
                req.setFeedbackType(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QaFeedbackReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QaFeedbackReq.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse> createQuestionInSession =
        genForcreateQuestionInSession();

    private static HttpRequestDef<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse> genForcreateQuestionInSession() {
        // basic
        HttpRequestDef.Builder<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateQuestionInSessionRequest.class, CreateQuestionInSessionResponse.class)
            .withName("CreateQuestionInSession")
            .withUri("/v2/irobot/sessions/{session_id}/ask")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SessionAskQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SessionAskQuestionReq.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRelationsRequest, CreateRelationsResponse> createRelations =
        genForcreateRelations();

    private static HttpRequestDef<CreateRelationsRequest, CreateRelationsResponse> genForcreateRelations() {
        // basic
        HttpRequestDef.Builder<CreateRelationsRequest, CreateRelationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRelationsRequest.class, CreateRelationsResponse.class)
                .withName("CreateRelations")
                .withUri("/v2/servicerequest/cases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRelationsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateRelationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRelationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRelationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<CreateRelationsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRelationsReq.class),
            f -> f.withMarshaller(CreateRelationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScoresRequest, CreateScoresResponse> createScores = genForcreateScores();

    private static HttpRequestDef<CreateScoresRequest, CreateScoresResponse> genForcreateScores() {
        // basic
        HttpRequestDef.Builder<CreateScoresRequest, CreateScoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScoresRequest.class, CreateScoresResponse.class)
                .withName("CreateScores")
                .withUri("/v2/servicerequest/cases/{case_id}/score")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScoresRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateScoresRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScoresRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScoresRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<CreateScoreV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateScoreV2Req.class),
            f -> f.withMarshaller(CreateScoresRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSessionRequest, CreateSessionResponse> createSession =
        genForcreateSession();

    private static HttpRequestDef<CreateSessionRequest, CreateSessionResponse> genForcreateSession() {
        // basic
        HttpRequestDef.Builder<CreateSessionRequest, CreateSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSessionRequest.class, CreateSessionResponse.class)
                .withName("CreateSession")
                .withUri("/v2/irobot/sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSessionRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSessionRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSessionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccessoriesRequest, DeleteAccessoriesResponse> deleteAccessories =
        genFordeleteAccessories();

    private static HttpRequestDef<DeleteAccessoriesRequest, DeleteAccessoriesResponse> genFordeleteAccessories() {
        // basic
        HttpRequestDef.Builder<DeleteAccessoriesRequest, DeleteAccessoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccessoriesRequest.class, DeleteAccessoriesResponse.class)
                .withName("DeleteAccessories")
                .withUri("/v2/servicerequest/accessorys/{accessory_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("accessory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessoriesRequest::getAccessoryId, (req, v) -> {
                req.setAccessoryId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> deleteCaseLabels =
        genFordeleteCaseLabels();

    private static HttpRequestDef<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> genFordeleteCaseLabels() {
        // basic
        HttpRequestDef.Builder<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCaseLabelsRequest.class, DeleteCaseLabelsResponse.class)
                .withName("DeleteCaseLabels")
                .withUri("/v2/servicerequest/cases/{case_id}/labels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<List<Integer>>withRequestField("label_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getLabelIds, (req, v) -> {
                req.setLabelIds(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelsRequest, DeleteLabelsResponse> deleteLabels = genFordeleteLabels();

    private static HttpRequestDef<DeleteLabelsRequest, DeleteLabelsResponse> genFordeleteLabels() {
        // basic
        HttpRequestDef.Builder<DeleteLabelsRequest, DeleteLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLabelsRequest.class, DeleteLabelsResponse.class)
                .withName("DeleteLabels")
                .withUri("/v2/servicerequest/labels/{label_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("label_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteLabelsRequest::getLabelId, (req, v) -> {
                req.setLabelId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRelationRequest, DeleteRelationResponse> deleteRelation =
        genFordeleteRelation();

    private static HttpRequestDef<DeleteRelationRequest, DeleteRelationResponse> genFordeleteRelation() {
        // basic
        HttpRequestDef.Builder<DeleteRelationRequest, DeleteRelationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRelationRequest.class, DeleteRelationResponse.class)
                .withName("DeleteRelation")
                .withUri("/v2/servicerequest/cases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRelationRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteRelationRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRelationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRelationRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<DeleteRelationsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteRelationsReq.class),
            f -> f.withMarshaller(DeleteRelationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAccessoriesRequest, DownloadAccessoriesResponse> downloadAccessories =
        genFordownloadAccessories();

    private static HttpRequestDef<DownloadAccessoriesRequest, DownloadAccessoriesResponse> genFordownloadAccessories() {
        // basic
        HttpRequestDef.Builder<DownloadAccessoriesRequest, DownloadAccessoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAccessoriesRequest.class, DownloadAccessoriesResponse.class)
                .withName("DownloadAccessories")
                .withUri("/v2/servicerequest/accessorys/{accessory_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("accessory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getAccessoryId, (req, v) -> {
                req.setAccessoryId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadCasesRequest, DownloadCasesResponse> downloadCases =
        genFordownloadCases();

    private static HttpRequestDef<DownloadCasesRequest, DownloadCasesResponse> genFordownloadCases() {
        // basic
        HttpRequestDef.Builder<DownloadCasesRequest, DownloadCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadCasesRequest.class, DownloadCasesResponse.class)
                .withName("DownloadCases")
                .withUri("/v2/servicerequest/cases/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            }));
        builder.<String>withRequestField("timezone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getTimezone, (req, v) -> {
                req.setTimezone(v);
            }));
        builder.<String>withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            }));
        builder.<String>withRequestField("query_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getQueryStartTime, (req, v) -> {
                req.setQueryStartTime(v);
            }));
        builder.<String>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getQueryEndTime, (req, v) -> {
                req.setQueryEndTime(v);
            }));
        builder.<String>withRequestField("x_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getXCustomerName, (req, v) -> {
                req.setXCustomerName(v);
            }));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadCasesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            }));
        builder.<List<String>>withRequestField("tenant_source_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DownloadCasesRequest::getTenantSourceIdList, (req, v) -> {
                req.setTenantSourceIdList(v);
            }));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadCasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadCasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadCasesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadImagesRequest, DownloadImagesResponse> downloadImages =
        genFordownloadImages();

    private static HttpRequestDef<DownloadImagesRequest, DownloadImagesResponse> genFordownloadImages() {
        // basic
        HttpRequestDef.Builder<DownloadImagesRequest, DownloadImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadImagesRequest.class, DownloadImagesResponse.class)
                .withName("DownloadImages")
                .withUri("/v2/servicerequest/accessorys/{accessory_id}/image")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("accessory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImagesRequest::getAccessoryId, (req, v) -> {
                req.setAccessoryId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadImagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse> listAccessoryAccessUrls =
        genForlistAccessoryAccessUrls();

    private static HttpRequestDef<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse> genForlistAccessoryAccessUrls() {
        // basic
        HttpRequestDef.Builder<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccessoryAccessUrlsRequest.class, ListAccessoryAccessUrlsResponse.class)
            .withName("ListAccessoryAccessUrls")
            .withUri("/v2/servicerequest/accessorys/access-urls")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<List<String>>withRequestField("accessory_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getAccessoryIds, (req, v) -> {
                req.setAccessoryIds(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForlistAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForlistAgencies() {
        // basic
        HttpRequestDef.Builder<ListAgenciesRequest, ListAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgenciesRequest.class, ListAgenciesResponse.class)
                .withName("ListAgencies")
                .withUri("/v2/servicerequest/agencies")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgenciesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAreaCodesRequest, ListAreaCodesResponse> listAreaCodes =
        genForlistAreaCodes();

    private static HttpRequestDef<ListAreaCodesRequest, ListAreaCodesResponse> genForlistAreaCodes() {
        // basic
        HttpRequestDef.Builder<ListAreaCodesRequest, ListAreaCodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAreaCodesRequest.class, ListAreaCodesResponse.class)
                .withName("ListAreaCodes")
                .withUri("/v2/servicerequest/config/area-codes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAreaCodesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaCodesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaCodesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArticlesRequest, ListArticlesResponse> listArticles = genForlistArticles();

    private static HttpRequestDef<ListArticlesRequest, ListArticlesResponse> genForlistArticles() {
        // basic
        HttpRequestDef.Builder<ListArticlesRequest, ListArticlesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListArticlesRequest.class, ListArticlesResponse.class)
                .withName("ListArticles")
                .withUri("/v2/irobot/articles/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("search_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArticlesRequest::getSearchType, (req, v) -> {
                req.setSearchType(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArticlesRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArticlesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArticlesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SearchArticlesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchArticlesReq.class),
            f -> f.withMarshaller(ListArticlesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizations =
        genForlistAuthorizations();

    private static HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> genForlistAuthorizations() {
        // basic
        HttpRequestDef.Builder<ListAuthorizationsRequest, ListAuthorizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorizationsRequest.class, ListAuthorizationsResponse.class)
                .withName("ListAuthorizations")
                .withUri("/v2/servicerequest/authorizations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getSubCustomerName, (req, v) -> {
                req.setSubCustomerName(v);
            }));
        builder.<String>withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("simple_description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getSimpleDescription, (req, v) -> {
                req.setSimpleDescription(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCategoriesRequest, ListCaseCategoriesResponse> listCaseCategories =
        genForlistCaseCategories();

    private static HttpRequestDef<ListCaseCategoriesRequest, ListCaseCategoriesResponse> genForlistCaseCategories() {
        // basic
        HttpRequestDef.Builder<ListCaseCategoriesRequest, ListCaseCategoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseCategoriesRequest.class, ListCaseCategoriesResponse.class)
                .withName("ListCaseCategories")
                .withUri("/v2/servicerequest/config/categories")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse> listCaseCcEmails =
        genForlistCaseCcEmails();

    private static HttpRequestDef<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse> genForlistCaseCcEmails() {
        // basic
        HttpRequestDef.Builder<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseCcEmailsRequest.class, ListCaseCcEmailsResponse.class)
                .withName("ListCaseCcEmails")
                .withUri("/v2/servicerequest/carbon-copy-emails")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseCcEmailsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCcEmailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCcEmailsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCountsRequest, ListCaseCountsResponse> listCaseCounts =
        genForlistCaseCounts();

    private static HttpRequestDef<ListCaseCountsRequest, ListCaseCountsResponse> genForlistCaseCounts() {
        // basic
        HttpRequestDef.Builder<ListCaseCountsRequest, ListCaseCountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseCountsRequest.class, ListCaseCountsResponse.class)
                .withName("ListCaseCounts")
                .withUri("/v2/servicerequest/cases/count")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseCountsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseCountsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCountsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCountsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseLabelsRequest, ListCaseLabelsResponse> listCaseLabels =
        genForlistCaseLabels();

    private static HttpRequestDef<ListCaseLabelsRequest, ListCaseLabelsResponse> genForlistCaseLabels() {
        // basic
        HttpRequestDef.Builder<ListCaseLabelsRequest, ListCaseLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseLabelsRequest.class, ListCaseLabelsResponse.class)
                .withName("ListCaseLabels")
                .withUri("/v2/servicerequest/cases/{case_id}/labels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLabelsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseLimitsRequest, ListCaseLimitsResponse> listCaseLimits =
        genForlistCaseLimits();

    private static HttpRequestDef<ListCaseLimitsRequest, ListCaseLimitsResponse> genForlistCaseLimits() {
        // basic
        HttpRequestDef.Builder<ListCaseLimitsRequest, ListCaseLimitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseLimitsRequest.class, ListCaseLimitsResponse.class)
                .withName("ListCaseLimits")
                .withUri("/v2/servicerequest/config/limits")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseLimitsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLimitsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLimitsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> listCaseOperateLogs =
        genForlistCaseOperateLogs();

    private static HttpRequestDef<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> genForlistCaseOperateLogs() {
        // basic
        HttpRequestDef.Builder<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseOperateLogsRequest.class, ListCaseOperateLogsResponse.class)
                .withName("ListCaseOperateLogs")
                .withUri("/v2/servicerequest/cases/{case_id}/operate-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseQuotasRequest, ListCaseQuotasResponse> listCaseQuotas =
        genForlistCaseQuotas();

    private static HttpRequestDef<ListCaseQuotasRequest, ListCaseQuotasResponse> genForlistCaseQuotas() {
        // basic
        HttpRequestDef.Builder<ListCaseQuotasRequest, ListCaseQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseQuotasRequest.class, ListCaseQuotasResponse.class)
                .withName("ListCaseQuotas")
                .withUri("/v2/servicerequest/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            }));
        builder.<String>withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseTemplatesRequest, ListCaseTemplatesResponse> listCaseTemplates =
        genForlistCaseTemplates();

    private static HttpRequestDef<ListCaseTemplatesRequest, ListCaseTemplatesResponse> genForlistCaseTemplates() {
        // basic
        HttpRequestDef.Builder<ListCaseTemplatesRequest, ListCaseTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaseTemplatesRequest.class, ListCaseTemplatesResponse.class)
                .withName("ListCaseTemplates")
                .withUri("/v2/servicerequest/config/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseTemplatesRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCasesRequest, ListCasesResponse> listCases = genForlistCases();

    private static HttpRequestDef<ListCasesRequest, ListCasesResponse> genForlistCases() {
        // basic
        HttpRequestDef.Builder<ListCasesRequest, ListCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCasesRequest.class, ListCasesResponse.class)
                .withName("ListCases")
                .withUri("/v2/servicerequest/cases")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCasesRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<List<String>>withRequestField("label_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCasesRequest::getLabelIdList, (req, v) -> {
                req.setLabelIdList(v);
            }));
        builder.<String>withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getAppKey, (req, v) -> {
                req.setAppKey(v);
            }));
        builder.<String>withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            }));
        builder.<String>withRequestField("query_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getQueryStartTime, (req, v) -> {
                req.setQueryStartTime(v);
            }));
        builder.<String>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getQueryEndTime, (req, v) -> {
                req.setQueryEndTime(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCasesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("incident_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getIncidentStatus, (req, v) -> {
                req.setIncidentStatus(v);
            }));
        builder.<String>withRequestField("x_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getXCustomerId, (req, v) -> {
                req.setXCustomerId(v);
            }));
        builder.<String>withRequestField("x_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getXCustomerName, (req, v) -> {
                req.setXCustomerName(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCasesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomersRegionsRequest, ListCustomersRegionsResponse> listCustomersRegions =
        genForlistCustomersRegions();

    private static HttpRequestDef<ListCustomersRegionsRequest, ListCustomersRegionsResponse> genForlistCustomersRegions() {
        // basic
        HttpRequestDef.Builder<ListCustomersRegionsRequest, ListCustomersRegionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCustomersRegionsRequest.class, ListCustomersRegionsResponse.class)
            .withName("ListCustomersRegions")
            .withUri("/v2/servicerequest/customers/regions")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomersRegionsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomersRegionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomersRegionsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse> listDiagnoseItems =
        genForlistDiagnoseItems();

    private static HttpRequestDef<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse> genForlistDiagnoseItems() {
        // basic
        HttpRequestDef.Builder<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListDiagnoseItemsRequest.class, ListDiagnoseItemsResponse.class)
                .withName("ListDiagnoseItems")
                .withUri("/v2.0/servicerequest/diagnose/job/show-items")
                .withContentType("application/json");

        // requests
        builder.<QueryDiagnoseItemsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryDiagnoseItemsReq.class),
            f -> f.withMarshaller(ListDiagnoseItemsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnoseJobRequest, ListDiagnoseJobResponse> listDiagnoseJob =
        genForlistDiagnoseJob();

    private static HttpRequestDef<ListDiagnoseJobRequest, ListDiagnoseJobResponse> genForlistDiagnoseJob() {
        // basic
        HttpRequestDef.Builder<ListDiagnoseJobRequest, ListDiagnoseJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDiagnoseJobRequest.class, ListDiagnoseJobResponse.class)
                .withName("ListDiagnoseJob")
                .withUri("/v2.0/servicerequest/diagnose/job")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnoseJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse> listDiagnoseRecords =
        genForlistDiagnoseRecords();

    private static HttpRequestDef<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse> genForlistDiagnoseRecords() {
        // basic
        HttpRequestDef.Builder<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDiagnoseRecordsRequest.class, ListDiagnoseRecordsResponse.class)
                .withName("ListDiagnoseRecords")
                .withUri("/v2.0/servicerequest/diagnose/records")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnoseRecordsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnoseRecordsRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnoseRecordsRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse> listDiagnoseResources =
        genForlistDiagnoseResources();

    private static HttpRequestDef<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse> genForlistDiagnoseResources() {
        // basic
        HttpRequestDef.Builder<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListDiagnoseResourcesRequest.class, ListDiagnoseResourcesResponse.class)
            .withName("ListDiagnoseResources")
            .withUri("/v2.0/servicerequest/diagnose/job/vm/resources")
            .withContentType("application/json");

        // requests
        builder.<QueryTscDiagnoseResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryTscDiagnoseResourcesReq.class),
            f -> f.withMarshaller(ListDiagnoseResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExtendsParamsRequest, ListExtendsParamsResponse> listExtendsParams =
        genForlistExtendsParams();

    private static HttpRequestDef<ListExtendsParamsRequest, ListExtendsParamsResponse> genForlistExtendsParams() {
        // basic
        HttpRequestDef.Builder<ListExtendsParamsRequest, ListExtendsParamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExtendsParamsRequest.class, ListExtendsParamsResponse.class)
                .withName("ListExtendsParams")
                .withUri("/v2/servicerequest/config/extends-map")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            }));
        builder.<String>withRequestField("incident_sub_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getIncidentSubTypeId, (req, v) -> {
                req.setIncidentSubTypeId(v);
            }));
        builder.<String>withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeedbackOptionRequest, ListFeedbackOptionResponse> listFeedbackOption =
        genForlistFeedbackOption();

    private static HttpRequestDef<ListFeedbackOptionRequest, ListFeedbackOptionResponse> genForlistFeedbackOption() {
        // basic
        HttpRequestDef.Builder<ListFeedbackOptionRequest, ListFeedbackOptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeedbackOptionRequest.class, ListFeedbackOptionResponse.class)
                .withName("ListFeedbackOption")
                .withUri("/v2/irobot/feedbacks/options")
                .withContentType("application/json");

        // requests
        builder.<ListFeedbackOptionRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFeedbackOptionRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListFeedbackOptionRequest.FeedbackSourceEnum>withRequestField("feedback_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFeedbackOptionRequest.FeedbackSourceEnum.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getFeedbackSource, (req, v) -> {
                req.setFeedbackSource(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> listHasVerifiedContacts =
        genForlistHasVerifiedContacts();

    private static HttpRequestDef<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> genForlistHasVerifiedContacts() {
        // basic
        HttpRequestDef.Builder<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListHasVerifiedContactsRequest.class, ListHasVerifiedContactsResponse.class)
            .withName("ListHasVerifiedContacts")
            .withUri("/v2/servicerequest/verifycodes/has-verified")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("contact_way",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getContactWay, (req, v) -> {
                req.setContactWay(v);
            }));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            }));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            }));
        builder.<String>withRequestField("expired_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getExpiredTime, (req, v) -> {
                req.setExpiredTime(v);
            }));
        builder.<String>withRequestField("verified_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getVerifiedId, (req, v) -> {
                req.setVerifiedId(v);
            }));
        builder.<String>withRequestField("contact_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getContactValue, (req, v) -> {
                req.setContactValue(v);
            }));
        builder.<String>withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getAreaCode, (req, v) -> {
                req.setAreaCode(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> listHistoryOperateLogs =
        genForlistHistoryOperateLogs();

    private static HttpRequestDef<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> genForlistHistoryOperateLogs() {
        // basic
        HttpRequestDef.Builder<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListHistoryOperateLogsRequest.class, ListHistoryOperateLogsResponse.class)
            .withName("ListHistoryOperateLogs")
            .withUri(
                "/v2/servicerequest/authorizations/{authorization_id}/authorization-details/{authorization_detail_id}/sessions/{session_id}/operation-logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            }));
        builder.<Long>withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getAuthorizationDetailId, (req, v) -> {
                req.setAuthorizationDetailId(v);
            }));
        builder.<Long>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistorySessionsRequest, ListHistorySessionsResponse> listHistorySessions =
        genForlistHistorySessions();

    private static HttpRequestDef<ListHistorySessionsRequest, ListHistorySessionsResponse> genForlistHistorySessions() {
        // basic
        HttpRequestDef.Builder<ListHistorySessionsRequest, ListHistorySessionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListHistorySessionsRequest.class, ListHistorySessionsResponse.class)
            .withName("ListHistorySessions")
            .withUri(
                "/v2/servicerequest/authorizations/{authorization_id}/authorization-details/{authorization_detail_id}/history-sessions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            }));
        builder.<Long>withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getAuthorizationDetailId, (req, v) -> {
                req.setAuthorizationDetailId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelsRequest, ListLabelsResponse> listLabels = genForlistLabels();

    private static HttpRequestDef<ListLabelsRequest, ListLabelsResponse> genForlistLabels() {
        // basic
        HttpRequestDef.Builder<ListLabelsRequest, ListLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLabelsRequest.class, ListLabelsResponse.class)
                .withName("ListLabels")
                .withUri("/v2/servicerequest/labels")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLabelsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLabelsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("label_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLabelsRequest::getLabelId, (req, v) -> {
                req.setLabelId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessagesRequest, ListMessagesResponse> listMessages = genForlistMessages();

    private static HttpRequestDef<ListMessagesRequest, ListMessagesResponse> genForlistMessages() {
        // basic
        HttpRequestDef.Builder<ListMessagesRequest, ListMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessagesRequest.class, ListMessagesResponse.class)
                .withName("ListMessages")
                .withUri("/v2/servicerequest/cases/{case_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> listMoreInstantMessages =
        genForlistMoreInstantMessages();

    private static HttpRequestDef<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> genForlistMoreInstantMessages() {
        // basic
        HttpRequestDef.Builder<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMoreInstantMessagesRequest.class, ListMoreInstantMessagesResponse.class)
            .withName("ListMoreInstantMessages")
            .withUri("/v2/servicerequest/cases/{case_id}/instant-messages/more")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<String>withRequestField("create_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getCreateTime, (req, v) -> {
                req.setCreateTime(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> listNewInstantMessages =
        genForlistNewInstantMessages();

    private static HttpRequestDef<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> genForlistNewInstantMessages() {
        // basic
        HttpRequestDef.Builder<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNewInstantMessagesRequest.class, ListNewInstantMessagesResponse.class)
            .withName("ListNewInstantMessages")
            .withUri("/v2/servicerequest/cases/instant-messages")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("case_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getCaseIds, (req, v) -> {
                req.setCaseIds(v);
            }));
        builder.<String>withRequestField("last_message_time_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getLastMessageTimeId, (req, v) -> {
                req.setLastMessageTimeId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticesRequest, ListNoticesResponse> listNotices = genForlistNotices();

    private static HttpRequestDef<ListNoticesRequest, ListNoticesResponse> genForlistNotices() {
        // basic
        HttpRequestDef.Builder<ListNoticesRequest, ListNoticesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListNoticesRequest.class, ListNoticesResponse.class)
                .withName("ListNotices")
                .withUri("/v2/irobot/notices/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticesRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SearchNoticesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchNoticesReq.class),
            f -> f.withMarshaller(ListNoticesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrderIncidentRequest, ListOrderIncidentResponse> listOrderIncident =
        genForlistOrderIncident();

    private static HttpRequestDef<ListOrderIncidentRequest, ListOrderIncidentResponse> genForlistOrderIncident() {
        // basic
        HttpRequestDef.Builder<ListOrderIncidentRequest, ListOrderIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrderIncidentRequest.class, ListOrderIncidentResponse.class)
                .withName("ListOrderIncident")
                .withUri("/osm/incidentservice/api/v1/queryincident")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<List<String>>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<List<Integer>>withRequestField("labelIdList",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getLabelIdList, (req, v) -> {
                req.setLabelIdList(v);
            }));
        builder.<String>withRequestField("appKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getAppKey, (req, v) -> {
                req.setAppKey(v);
            }));
        builder.<String>withRequestField("incidentId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            }));
        builder.<String>withRequestField("queryStartTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getQueryStartTime, (req, v) -> {
                req.setQueryStartTime(v);
            }));
        builder.<String>withRequestField("queryEndTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getQueryEndTime, (req, v) -> {
                req.setQueryEndTime(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("incidentStatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getIncidentStatus, (req, v) -> {
                req.setIncidentStatus(v);
            }));
        builder.<String>withRequestField("xCustomerName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getXCustomerName, (req, v) -> {
                req.setXCustomerName(v);
            }));
        builder.<String>withRequestField("groupId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("productCategoryId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            }));
        builder.<String>withRequestField("businessTypeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            }));
        builder.<Integer>withRequestField("pageNo",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("xCustomerId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getXCustomerId, (req, v) -> {
                req.setXCustomerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivilegesRequest, ListPrivilegesResponse> listPrivileges =
        genForlistPrivileges();

    private static HttpRequestDef<ListPrivilegesRequest, ListPrivilegesResponse> genForlistPrivileges() {
        // basic
        HttpRequestDef.Builder<ListPrivilegesRequest, ListPrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivilegesRequest.class, ListPrivilegesResponse.class)
                .withName("ListPrivileges")
                .withUri("/v2/servicerequest/privileges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("privilege",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivilegesRequest::getPrivilege, (req, v) -> {
                req.setPrivilege(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivilegesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivilegesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivilegesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProblemTypesRequest, ListProblemTypesResponse> listProblemTypes =
        genForlistProblemTypes();

    private static HttpRequestDef<ListProblemTypesRequest, ListProblemTypesResponse> genForlistProblemTypes() {
        // basic
        HttpRequestDef.Builder<ListProblemTypesRequest, ListProblemTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProblemTypesRequest.class, ListProblemTypesResponse.class)
                .withName("ListProblemTypes")
                .withUri("/v2/servicerequest/config/problems")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProblemTypesRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProblemTypesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProblemTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProblemTypesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductCategoriesRequest, ListProductCategoriesResponse> listProductCategories =
        genForlistProductCategories();

    private static HttpRequestDef<ListProductCategoriesRequest, ListProductCategoriesResponse> genForlistProductCategories() {
        // basic
        HttpRequestDef.Builder<ListProductCategoriesRequest, ListProductCategoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProductCategoriesRequest.class, ListProductCategoriesResponse.class)
            .withName("ListProductCategories")
            .withUri("/v2/servicerequest/config/product-categories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_category_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductCategoriesRequest::getProductCategoryName, (req, v) -> {
                req.setProductCategoryName(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductCategoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductCategoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductCategoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecommendWordsRequest, ListRecommendWordsResponse> listRecommendWords =
        genForlistRecommendWords();

    private static HttpRequestDef<ListRecommendWordsRequest, ListRecommendWordsResponse> genForlistRecommendWords() {
        // basic
        HttpRequestDef.Builder<ListRecommendWordsRequest, ListRecommendWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecommendWordsRequest.class, ListRecommendWordsResponse.class)
                .withName("ListRecommendWords")
                .withUri("/v2/irobot/recommend-words")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("recommend_word_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getRecommendWordId, (req, v) -> {
                req.setRecommendWordId(v);
            }));
        builder.<Integer>withRequestField("level_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getLevelValue, (req, v) -> {
                req.setLevelValue(v);
            }));
        builder.<String>withRequestField("theme_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getThemeName, (req, v) -> {
                req.setThemeName(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForlistRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForlistRegions() {
        // basic
        HttpRequestDef.Builder<ListRegionsRequest, ListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRegionsRequest.class, ListRegionsResponse.class)
                .withName("ListRegions")
                .withUri("/v2/servicerequest/config/regions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRegionsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegionsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationRequest, ListRelationResponse> listRelation = genForlistRelation();

    private static HttpRequestDef<ListRelationRequest, ListRelationResponse> genForlistRelation() {
        // basic
        HttpRequestDef.Builder<ListRelationRequest, ListRelationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelationRequest.class, ListRelationResponse.class)
                .withName("ListRelation")
                .withUri("/v2/servicerequest/cases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> listSatisfactionDimensions =
        genForlistSatisfactionDimensions();

    private static HttpRequestDef<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> genForlistSatisfactionDimensions() {
        // basic
        HttpRequestDef.Builder<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSatisfactionDimensionsRequest.class,
                    ListSatisfactionDimensionsResponse.class)
                .withName("ListSatisfactionDimensions")
                .withUri("/v2/servicerequest/config/satisfaction-dimensions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSeveritiesRequest, ListSeveritiesResponse> listSeverities =
        genForlistSeverities();

    private static HttpRequestDef<ListSeveritiesRequest, ListSeveritiesResponse> genForlistSeverities() {
        // basic
        HttpRequestDef.Builder<ListSeveritiesRequest, ListSeveritiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSeveritiesRequest.class, ListSeveritiesResponse.class)
                .withName("ListSeverities")
                .withUri("/v2/servicerequest/config/severities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getProductCategoryId, (req, v) -> {
                req.setProductCategoryId(v);
            }));
        builder.<String>withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getBusinessTypeId, (req, v) -> {
                req.setBusinessTypeId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomers =
        genForlistSubCustomers();

    private static HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> genForlistSubCustomers() {
        // basic
        HttpRequestDef.Builder<ListSubCustomersRequest, ListSubCustomersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubCustomersRequest.class, ListSubCustomersResponse.class)
                .withName("ListSubCustomers")
                .withUri("/v2/servicerequest/customers/sub-customers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getSubCustomerName, (req, v) -> {
                req.setSubCustomerName(v);
            }));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListToolsRequest, ListToolsResponse> listTools = genForlistTools();

    private static HttpRequestDef<ListToolsRequest, ListToolsResponse> genForlistTools() {
        // basic
        HttpRequestDef.Builder<ListToolsRequest, ListToolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListToolsRequest.class, ListToolsResponse.class)
                .withName("ListTools")
                .withUri("/v2/irobot/tools/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListToolsRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListToolsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListToolsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SearchToolsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchToolsReq.class),
            f -> f.withMarshaller(ListToolsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransportHistoriesRequest, ListTransportHistoriesResponse> listTransportHistories =
        genForlistTransportHistories();

    private static HttpRequestDef<ListTransportHistoriesRequest, ListTransportHistoriesResponse> genForlistTransportHistories() {
        // basic
        HttpRequestDef.Builder<ListTransportHistoriesRequest, ListTransportHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTransportHistoriesRequest.class, ListTransportHistoriesResponse.class)
            .withName("ListTransportHistories")
            .withUri(
                "/v2/servicerequest/authorizations/{authorization_id}/authorization-details/{authorization_detail_id}/sessions/{session_id}/operation-file-logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            }));
        builder.<Long>withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getAuthorizationDetailId, (req, v) -> {
                req.setAuthorizationDetailId(v);
            }));
        builder.<Long>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> listUnreadNewInstantMessages =
        genForlistUnreadNewInstantMessages();

    private static HttpRequestDef<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> genForlistUnreadNewInstantMessages() {
        // basic
        HttpRequestDef.Builder<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListUnreadNewInstantMessagesRequest.class,
                    ListUnreadNewInstantMessagesResponse.class)
                .withName("ListUnreadNewInstantMessages")
                .withUri("/v2/servicerequest/cases/instant-messages/unread")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("case_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getCaseIds, (req, v) -> {
                req.setCaseIds(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeMessageRequest, RevokeMessageResponse> revokeMessage =
        genForrevokeMessage();

    private static HttpRequestDef<RevokeMessageRequest, RevokeMessageResponse> genForrevokeMessage() {
        // basic
        HttpRequestDef.Builder<RevokeMessageRequest, RevokeMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RevokeMessageRequest.class, RevokeMessageResponse.class)
                .withName("RevokeMessage")
                .withUri("/v2/servicerequest/cases/{case_id}/instant-messages/{message_id}/withdraw")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeMessageRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<String>withRequestField("message_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeMessageRequest::getMessageId, (req, v) -> {
                req.setMessageId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RevokeMessageRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeMessageRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeMessageRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVerifyCodesRequest, SendVerifyCodesResponse> sendVerifyCodes =
        genForsendVerifyCodes();

    private static HttpRequestDef<SendVerifyCodesRequest, SendVerifyCodesResponse> genForsendVerifyCodes() {
        // basic
        HttpRequestDef.Builder<SendVerifyCodesRequest, SendVerifyCodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendVerifyCodesRequest.class, SendVerifyCodesResponse.class)
                .withName("SendVerifyCodes")
                .withUri("/v2/servicerequest/verifycodes/send")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SendVerifyCodesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVerifyCodesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVerifyCodesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<SendVerifyCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SendVerifyCodeReq.class),
            f -> f.withMarshaller(SendVerifyCodesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> showAccessoryLimits =
        genForshowAccessoryLimits();

    private static HttpRequestDef<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> genForshowAccessoryLimits() {
        // basic
        HttpRequestDef.Builder<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessoryLimitsRequest.class, ShowAccessoryLimitsResponse.class)
                .withName("ShowAccessoryLimits")
                .withUri("/v2/servicerequest/accessorys/limits")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse> showAssociatedQuestions =
        genForshowAssociatedQuestions();

    private static HttpRequestDef<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse> genForshowAssociatedQuestions() {
        // basic
        HttpRequestDef.Builder<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowAssociatedQuestionsRequest.class, ShowAssociatedQuestionsResponse.class)
            .withName("ShowAssociatedQuestions")
            .withUri("/v2/irobot/qapairs/associate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedQuestionsRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedQuestionsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedQuestionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QueryAssociatedQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryAssociatedQuestionReq.class),
            f -> f.withMarshaller(ShowAssociatedQuestionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> showAuthorizationDetail =
        genForshowAuthorizationDetail();

    private static HttpRequestDef<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> genForshowAuthorizationDetail() {
        // basic
        HttpRequestDef.Builder<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAuthorizationDetailRequest.class, ShowAuthorizationDetailResponse.class)
            .withName("ShowAuthorizationDetail")
            .withUri("/v2/servicerequest/authorizations/{authorization_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseDetailRequest, ShowCaseDetailResponse> showCaseDetail =
        genForshowCaseDetail();

    private static HttpRequestDef<ShowCaseDetailRequest, ShowCaseDetailResponse> genForshowCaseDetail() {
        // basic
        HttpRequestDef.Builder<ShowCaseDetailRequest, ShowCaseDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCaseDetailRequest.class, ShowCaseDetailResponse.class)
                .withName("ShowCaseDetail")
                .withUri("/v2/servicerequest/cases/{case_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse> showCaseExtendsParam =
        genForshowCaseExtendsParam();

    private static HttpRequestDef<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse> genForshowCaseExtendsParam() {
        // basic
        HttpRequestDef.Builder<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCaseExtendsParamRequest.class, ShowCaseExtendsParamResponse.class)
            .withName("ShowCaseExtendsParam")
            .withUri("/v2/servicerequest/cases/{case_id}/extends-param")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseStatusRequest, ShowCaseStatusResponse> showCaseStatus =
        genForshowCaseStatus();

    private static HttpRequestDef<ShowCaseStatusRequest, ShowCaseStatusResponse> genForshowCaseStatus() {
        // basic
        HttpRequestDef.Builder<ShowCaseStatusRequest, ShowCaseStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCaseStatusRequest.class, ShowCaseStatusResponse.class)
                .withName("ShowCaseStatus")
                .withUri("/v2/servicerequest/cases/{case_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseStatusRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCaseStatusRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseStatusRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> showConfiguration =
        genForshowConfiguration();

    private static HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> genForshowConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationRequest, ShowConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigurationRequest.class, ShowConfigurationResponse.class)
                .withName("ShowConfiguration")
                .withUri("/v2/servicerequest/configurations/{config_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationRequest::getConfigKey, (req, v) -> {
                req.setConfigKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse> showCustomerPrivilegePolicy =
        genForshowCustomerPrivilegePolicy();

    private static HttpRequestDef<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse> genForshowCustomerPrivilegePolicy() {
        // basic
        HttpRequestDef.Builder<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCustomerPrivilegePolicyRequest.class,
                    ShowCustomerPrivilegePolicyResponse.class)
                .withName("ShowCustomerPrivilegePolicy")
                .withUri("/v2/servicerequest/privileges/privilege-policy")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomerPrivilegePolicyRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerPrivilegePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerPrivilegePolicyRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse> showDownloadAccessoryUrl =
        genForshowDownloadAccessoryUrl();

    private static HttpRequestDef<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse> genForshowDownloadAccessoryUrl() {
        // basic
        HttpRequestDef.Builder<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDownloadAccessoryUrlRequest.class, ShowDownloadAccessoryUrlResponse.class)
                .withName("ShowDownloadAccessoryUrl")
                .withUri("/v2/servicerequest/accessorys/{accessory_id}/access-url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("accessory_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDownloadAccessoryUrlRequest::getAccessoryId, (req, v) -> {
                req.setAccessoryId(v);
            }));
        builder.<ShowDownloadAccessoryUrlRequest.RelationTypeEnum>withRequestField("relation_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDownloadAccessoryUrlRequest.RelationTypeEnum.class),
            f -> f.withMarshaller(ShowDownloadAccessoryUrlRequest::getRelationType, (req, v) -> {
                req.setRelationType(v);
            }));
        builder.<String>withRequestField("relation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDownloadAccessoryUrlRequest::getRelationId, (req, v) -> {
                req.setRelationId(v);
            }));
        builder.<String>withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDownloadAccessoryUrlRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse> showLatestPublishedAgreement =
        genForshowLatestPublishedAgreement();

    private static HttpRequestDef<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse> genForshowLatestPublishedAgreement() {
        // basic
        HttpRequestDef.Builder<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLatestPublishedAgreementRequest.class,
                    ShowLatestPublishedAgreementResponse.class)
                .withName("ShowLatestPublishedAgreement")
                .withUri("/v2/servicerequest/agreements/published-agreement")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agreement_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestPublishedAgreementRequest::getAgreementType, (req, v) -> {
                req.setAgreementType(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLatestPublishedAgreementRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestPublishedAgreementRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestPublishedAgreementRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoginTypeRequest, ShowLoginTypeResponse> showLoginType =
        genForshowLoginType();

    private static HttpRequestDef<ShowLoginTypeRequest, ShowLoginTypeResponse> genForshowLoginType() {
        // basic
        HttpRequestDef.Builder<ShowLoginTypeRequest, ShowLoginTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoginTypeRequest.class, ShowLoginTypeResponse.class)
                .withName("ShowLoginType")
                .withUri("/v2/servicerequest/authorizations/login-type")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoginTypeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoginTypeRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse> showPartnersCasesPrivilege =
        genForshowPartnersCasesPrivilege();

    private static HttpRequestDef<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse> genForshowPartnersCasesPrivilege() {
        // basic
        HttpRequestDef.Builder<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPartnersCasesPrivilegeRequest.class,
                    ShowPartnersCasesPrivilegeResponse.class)
                .withName("ShowPartnersCasesPrivilege")
                .withUri("/v2/servicerequest/cases/partners/privilege/cases-processing")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartnersCasesPrivilegeRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersCasesPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersCasesPrivilegeRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> showPartnersServiceInfo =
        genForshowPartnersServiceInfo();

    private static HttpRequestDef<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> genForshowPartnersServiceInfo() {
        // basic
        HttpRequestDef.Builder<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPartnersServiceInfoRequest.class, ShowPartnersServiceInfoResponse.class)
            .withName("ShowPartnersServiceInfo")
            .withUri("/v2/servicerequest/cases/partners/service-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_sub_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getCaseSubTypeId, (req, v) -> {
                req.setCaseSubTypeId(v);
            }));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQaPairDetailRequest, ShowQaPairDetailResponse> showQaPairDetail =
        genForshowQaPairDetail();

    private static HttpRequestDef<ShowQaPairDetailRequest, ShowQaPairDetailResponse> genForshowQaPairDetail() {
        // basic
        HttpRequestDef.Builder<ShowQaPairDetailRequest, ShowQaPairDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQaPairDetailRequest.class, ShowQaPairDetailResponse.class)
                .withName("ShowQaPairDetail")
                .withUri("/v2/irobot/qapairs/{qa_pair_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qa_pair_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairDetailRequest::getQaPairId, (req, v) -> {
                req.setQaPairId(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairDetailRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairDetailRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQaPairsRequest, ShowQaPairsResponse> showQaPairs = genForshowQaPairs();

    private static HttpRequestDef<ShowQaPairsRequest, ShowQaPairsResponse> genForshowQaPairs() {
        // basic
        HttpRequestDef.Builder<ShowQaPairsRequest, ShowQaPairsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowQaPairsRequest.class, ShowQaPairsResponse.class)
                .withName("ShowQaPairs")
                .withUri("/v2/irobot/qapairs/search")
                .withContentType("application/json");

        // requests
        builder.<ShowQaPairsRequest.SearchTypeEnum>withRequestField("search_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowQaPairsRequest.SearchTypeEnum.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getSearchType, (req, v) -> {
                req.setSearchType(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SearchQaPairsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchQaPairsReq.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse> showSignedLatestPublishedAgreement =
        genForshowSignedLatestPublishedAgreement();

    private static HttpRequestDef<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse> genForshowSignedLatestPublishedAgreement() {
        // basic
        HttpRequestDef.Builder<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSignedLatestPublishedAgreementRequest.class,
                    ShowSignedLatestPublishedAgreementResponse.class)
                .withName("ShowSignedLatestPublishedAgreement")
                .withUri("/v2/servicerequest/agreements/signed-latest")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agreement_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignedLatestPublishedAgreementRequest::getAgreementType, (req, v) -> {
                req.setAgreementType(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSignedLatestPublishedAgreementRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignedLatestPublishedAgreementRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignedLatestPublishedAgreementRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowThemeRequest, ShowThemeResponse> showTheme = genForshowTheme();

    private static HttpRequestDef<ShowThemeRequest, ShowThemeResponse> genForshowTheme() {
        // basic
        HttpRequestDef.Builder<ShowThemeRequest, ShowThemeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowThemeRequest.class, ShowThemeResponse.class)
                .withName("ShowTheme")
                .withUri("/v2/irobot/themes/convert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getProductTypeId, (req, v) -> {
                req.setProductTypeId(v);
            }));
        builder.<String>withRequestField("product_type_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getProductTypeName, (req, v) -> {
                req.setProductTypeName(v);
            }));
        builder.<String>withRequestField("product_type_short_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getProductTypeShortName, (req, v) -> {
                req.setProductTypeShortName(v);
            }));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getXServiceKey, (req, v) -> {
                req.setXServiceKey(v);
            }));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SignPublishedAgreementRequest, SignPublishedAgreementResponse> signPublishedAgreement =
        genForsignPublishedAgreement();

    private static HttpRequestDef<SignPublishedAgreementRequest, SignPublishedAgreementResponse> genForsignPublishedAgreement() {
        // basic
        HttpRequestDef.Builder<SignPublishedAgreementRequest, SignPublishedAgreementResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SignPublishedAgreementRequest.class, SignPublishedAgreementResponse.class)
            .withName("SignPublishedAgreement")
            .withUri("/v2/servicerequest/agreements/{id}/signed")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<SignAgreementReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SignAgreementReq.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> updateAuthorizations =
        genForupdateAuthorizations();

    private static HttpRequestDef<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> genForupdateAuthorizations() {
        // basic
        HttpRequestDef.Builder<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAuthorizationsRequest.class, UpdateAuthorizationsResponse.class)
            .withName("UpdateAuthorizations")
            .withUri("/v2/servicerequest/authorizations/{authorization_id}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getAuthorizationId, (req, v) -> {
                req.setAuthorizationId(v);
            }));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<OperateAuthorizationV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OperateAuthorizationV2Req.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse> updateCaseContactInfo =
        genForupdateCaseContactInfo();

    private static HttpRequestDef<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse> genForupdateCaseContactInfo() {
        // basic
        HttpRequestDef.Builder<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCaseContactInfoRequest.class, UpdateCaseContactInfoResponse.class)
            .withName("UpdateCaseContactInfo")
            .withUri("/v2/servicerequest/cases/{case_id}/contact-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<UpdateCaseContactInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCaseContactInfoReq.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCasesRequest, UpdateCasesResponse> updateCases = genForupdateCases();

    private static HttpRequestDef<UpdateCasesRequest, UpdateCasesResponse> genForupdateCases() {
        // basic
        HttpRequestDef.Builder<UpdateCasesRequest, UpdateCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCasesRequest.class, UpdateCasesResponse.class)
                .withName("UpdateCases")
                .withUri("/v2/servicerequest/cases/{case_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCasesRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCasesRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateCasesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCasesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<WorkOrderOperateV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkOrderOperateV2Req.class),
            f -> f.withMarshaller(UpdateCasesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLabelsRequest, UpdateLabelsResponse> updateLabels = genForupdateLabels();

    private static HttpRequestDef<UpdateLabelsRequest, UpdateLabelsResponse> genForupdateLabels() {
        // basic
        HttpRequestDef.Builder<UpdateLabelsRequest, UpdateLabelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLabelsRequest.class, UpdateLabelsResponse.class)
                .withName("UpdateLabels")
                .withUri("/v2/servicerequest/labels/{label_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("label_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getLabelId, (req, v) -> {
                req.setLabelId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<UpdateLabelsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLabelsReq.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> updateNewInstantMessagesRead =
        genForupdateNewInstantMessagesRead();

    private static HttpRequestDef<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> genForupdateNewInstantMessagesRead() {
        // basic
        HttpRequestDef.Builder<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateNewInstantMessagesReadRequest.class,
                    UpdateNewInstantMessagesReadResponse.class)
                .withName("UpdateNewInstantMessagesRead")
                .withUri("/v2/servicerequest/cases/{case_id}/instant-messages/unread")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getCaseId, (req, v) -> {
                req.setCaseId(v);
            }));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<UpdateUnreadNewInstantMsgV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateUnreadNewInstantMsgV2Req.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> uploadJsonAccessories =
        genForuploadJsonAccessories();

    private static HttpRequestDef<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> genForuploadJsonAccessories() {
        // basic
        HttpRequestDef.Builder<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UploadJsonAccessoriesRequest.class, UploadJsonAccessoriesResponse.class)
            .withName("UploadJsonAccessories")
            .withUri("/v2/servicerequest/accessorys/json-format-content")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXSite, (req, v) -> {
                req.setXSite(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXTimeZone, (req, v) -> {
                req.setXTimeZone(v);
            }));
        builder.<AccessoryJsonFormatReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AccessoryJsonFormatReq.class),
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
